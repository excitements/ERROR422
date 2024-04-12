package paulscode.sound;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;

public class MidiChannel implements MetaEventListener {
  private static final boolean XXX = false;
  
  private final Object sequenceQueueLock = new Object();
  
  private FilenameURL filenameURL;
  
  private MidiDevice synthDevice = null;
  
  protected long fadeOutMilis = 0L;
  
  protected long lastFadeCheck = 0L;
  
  private static final int CHANGE_VOLUME;
  
  private boolean loading = true;
  
  private static final boolean GET;
  
  private static final boolean SET = true;
  
  private static final int END_OF_TRACK;
  
  private LinkedList sequenceQueue = null;
  
  private SoundSystemLogger logger;
  
  private MidiChannel$FadeThread fadeThread = null;
  
  private float gain = 1.0F;
  
  private Sequence sequence = null;
  
  private String sourcename;
  
  private Synthesizer synthesizer = null;
  
  protected float fadeInGain = 1.0F;
  
  private Sequencer sequencer = null;
  
  private boolean toLoop = true;
  
  protected long fadeInMilis = 0L;
  
  protected float fadeOutGain = -1.0F;
  
  public boolean getLooping() {
    return toLoop(false, false);
  }
  
  public MidiChannel(boolean paramBoolean, String paramString, FilenameURL paramFilenameURL) {
    loading(true, true);
    this.logger = SoundSystemConfig.getLogger();
    filenameURL(true, paramFilenameURL);
    sourcename(true, paramString);
    setLooping(paramBoolean);
    init();
    loading(true, false);
  }
  
  public boolean loading() {
    return loading(false, false);
  }
  
  private synchronized boolean checkFadeOut() {
    if (this.fadeOutGain == -1.0F && this.fadeInGain == 1.0F)
      return false; 
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.lastFadeCheck;
    this.lastFadeCheck = l1;
    if (this.fadeOutGain >= 0.0F) {
      if (this.fadeOutMilis == 0L) {
        this.fadeOutGain = 0.0F;
        this.fadeInGain = 0.0F;
        if (!incrementSequence())
          stop(); 
        rewind();
        resetGain();
        return false;
      } 
      float f = (float)l2 / (float)this.fadeOutMilis;
      this.fadeOutGain -= f;
      if (this.fadeOutGain <= 0.0F) {
        this.fadeOutGain = -1.0F;
        this.fadeInGain = 0.0F;
        if (!incrementSequence())
          stop(); 
        rewind();
        resetGain();
        return false;
      } 
      resetGain();
      return true;
    } 
    if (this.fadeInGain < 1.0F) {
      this.fadeOutGain = -1.0F;
      if (this.fadeInMilis == 0L) {
        this.fadeOutGain = -1.0F;
        this.fadeInGain = 1.0F;
      } else {
        float f = (float)l2 / (float)this.fadeInMilis;
        this.fadeInGain += f;
        if (this.fadeInGain >= 1.0F) {
          this.fadeOutGain = -1.0F;
          this.fadeInGain = 1.0F;
        } 
      } 
      resetGain();
    } 
    return false;
  }
  
  protected boolean errorCheck(boolean paramBoolean, String paramString) {
    return this.logger.errorCheck(paramBoolean, "MidiChannel", paramString, 0);
  }
  
  private synchronized boolean toLoop(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.toLoop = paramBoolean2; 
    return this.toLoop;
  }
  
  public void pause() {
    if (!loading()) {
      if (this.sequencer == null)
        return; 
      try {
        this.sequencer.stop();
      } catch (Exception exception) {
        errorMessage("Exception in method 'pause'");
        printStackTrace(exception);
        SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
        SoundSystem.setException(soundSystemException);
      } 
    } 
  }
  
  public void rewind() {
    if (!loading()) {
      if (this.sequencer == null)
        return; 
      try {
        this.sequencer.setMicrosecondPosition(0L);
      } catch (Exception exception) {
        errorMessage("Exception in method 'rewind'");
        printStackTrace(exception);
        SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
        SoundSystem.setException(soundSystemException);
      } 
    } 
  }
  
  public void resetGain() {
    if (this.gain < 0.0F)
      this.gain = 0.0F; 
    if (this.gain > 1.0F)
      this.gain = 1.0F; 
    int i = (int)(this.gain * SoundSystemConfig.getMasterGain() * Math.abs(this.fadeOutGain) * this.fadeInGain * 127.0F);
    if (this.synthesizer != null) {
      javax.sound.midi.MidiChannel[] arrayOfMidiChannel = this.synthesizer.getChannels();
      for (byte b = 0; arrayOfMidiChannel != null && b < arrayOfMidiChannel.length; b++)
        arrayOfMidiChannel[b].controlChange(7, i); 
    } else if (this.synthDevice != null) {
      try {
        ShortMessage shortMessage = new ShortMessage();
        for (byte b = 0; b < 16; b++) {
          shortMessage.setMessage(176, b, 7, i);
          this.synthDevice.getReceiver().send(shortMessage, -1L);
        } 
      } catch (Exception exception) {
        errorMessage("Error resetting gain on MIDI device");
        printStackTrace(exception);
      } 
    } else if (this.sequencer != null && this.sequencer instanceof Synthesizer) {
      this.synthesizer = (Synthesizer)this.sequencer;
      javax.sound.midi.MidiChannel[] arrayOfMidiChannel = this.synthesizer.getChannels();
      for (byte b = 0; arrayOfMidiChannel != null && b < arrayOfMidiChannel.length; b++)
        arrayOfMidiChannel[b].controlChange(7, i); 
    } else {
      try {
        Receiver receiver = MidiSystem.getReceiver();
        ShortMessage shortMessage = new ShortMessage();
        for (byte b = 0; b < 16; b++) {
          shortMessage.setMessage(176, b, 7, i);
          receiver.send(shortMessage, -1L);
        } 
      } catch (Exception exception) {
        errorMessage("Error resetting gain on default receiver");
        printStackTrace(exception);
      } 
    } 
  }
  
  protected void message(String paramString) {
    this.logger.message(paramString, 0);
  }
  
  public MidiChannel(boolean paramBoolean, String paramString1, URL paramURL, String paramString2) {
    loading(true, true);
    this.logger = SoundSystemConfig.getLogger();
    filenameURL(true, new FilenameURL(paramURL, paramString2));
    sourcename(true, paramString1);
    setLooping(paramBoolean);
    init();
    loading(true, false);
  }
  
  private synchronized boolean loading(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.loading = paramBoolean2; 
    return this.loading;
  }
  
  private void reset() {
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue != null)
        this.sequenceQueue.clear(); 
    } 
    if (this.sequencer == null) {
      getSequencer();
    } else {
      this.sequencer.stop();
      this.sequencer.setMicrosecondPosition(0L);
      this.sequencer.removeMetaEventListener(this);
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {}
    } 
    if (this.sequencer == null) {
      errorMessage("Unable to set the sequence in method 'reset', because there wasn't a sequencer to use.");
      return;
    } 
    setSequence(filenameURL(false, null).getURL());
    this.sequencer.start();
    resetGain();
    this.sequencer.addMetaEventListener(this);
  }
  
  protected void importantMessage(String paramString) {
    this.logger.importantMessage(paramString, 0);
  }
  
  private void getSynthesizer() {
    if (this.sequencer == null) {
      errorMessage("Unable to load a Synthesizer in method 'getSynthesizer', because variable 'sequencer' is null");
      return;
    } 
    String str = SoundSystemConfig.getOverrideMIDISynthesizer();
    if (str != null && !str.equals("")) {
      this.synthDevice = openMidiDevice(str);
      if (this.synthDevice != null)
        try {
          this.sequencer.getTransmitter().setReceiver(this.synthDevice.getReceiver());
          return;
        } catch (MidiUnavailableException midiUnavailableException) {
          errorMessage("Unable to link sequencer transmitter with receiver for MIDI device '" + str + "'");
        }  
    } 
    if (this.sequencer instanceof Synthesizer) {
      this.synthesizer = (Synthesizer)this.sequencer;
    } else {
      try {
        this.synthesizer = MidiSystem.getSynthesizer();
        this.synthesizer.open();
      } catch (MidiUnavailableException midiUnavailableException) {
        message("Unable to open the default synthesizer");
        this.synthesizer = null;
      } 
      if (this.synthesizer == null) {
        this.synthDevice = openMidiDevice("Java Sound Synthesizer");
        if (this.synthDevice == null)
          this.synthDevice = openMidiDevice("Microsoft GS Wavetable"); 
        if (this.synthDevice == null)
          this.synthDevice = openMidiDevice("Gervill"); 
        if (this.synthDevice == null) {
          errorMessage("Failed to find an available MIDI synthesizer");
          return;
        } 
      } 
      if (this.synthesizer == null) {
        try {
          this.sequencer.getTransmitter().setReceiver(this.synthDevice.getReceiver());
        } catch (MidiUnavailableException midiUnavailableException) {
          errorMessage("Unable to link sequencer transmitter with MIDI device receiver");
        } 
      } else if (this.synthesizer.getDefaultSoundbank() == null) {
        try {
          this.sequencer.getTransmitter().setReceiver(MidiSystem.getReceiver());
        } catch (MidiUnavailableException midiUnavailableException) {
          errorMessage("Unable to link sequencer transmitter with default receiver");
        } 
      } else {
        try {
          this.sequencer.getTransmitter().setReceiver(this.synthesizer.getReceiver());
        } catch (MidiUnavailableException midiUnavailableException) {
          errorMessage("Unable to link sequencer transmitter with synthesizer receiver");
        } 
      } 
    } 
  }
  
  public void switchSource(boolean paramBoolean, String paramString1, String paramString2) {
    loading(true, true);
    filenameURL(true, new FilenameURL(paramString2));
    sourcename(true, paramString1);
    setLooping(paramBoolean);
    reset();
    loading(true, false);
  }
  
  private synchronized FilenameURL filenameURL(boolean paramBoolean, FilenameURL paramFilenameURL) {
    if (paramBoolean == true)
      this.filenameURL = paramFilenameURL; 
    return this.filenameURL;
  }
  
  public void fadeOutIn(FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
    if (paramFilenameURL == null) {
      errorMessage("Filename/URL not specified in method 'fadeOutIn'.");
      return;
    } 
    if (paramLong1 < 0L || paramLong2 < 0L) {
      errorMessage("Miliseconds may not be negative in method 'fadeOutIn'.");
      return;
    } 
    this.fadeOutMilis = paramLong1;
    this.fadeInMilis = paramLong2;
    this.fadeOutGain = 1.0F;
    this.lastFadeCheck = System.currentTimeMillis();
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue == null)
        this.sequenceQueue = new LinkedList(); 
      this.sequenceQueue.clear();
      this.sequenceQueue.add(paramFilenameURL);
    } 
    if (this.fadeThread == null) {
      this.fadeThread = new MidiChannel$FadeThread(this, null);
      this.fadeThread.start();
    } 
    this.fadeThread.interrupt();
  }
  
  public float getVolume() {
    return this.gain;
  }
  
  protected void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  public void queueSound(FilenameURL paramFilenameURL) {
    if (paramFilenameURL == null) {
      errorMessage("Filename/URL not specified in method 'queueSound'");
      return;
    } 
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue == null)
        this.sequenceQueue = new LinkedList(); 
      this.sequenceQueue.add(paramFilenameURL);
    } 
  }
  
  private synchronized String sourcename(boolean paramBoolean, String paramString) {
    if (paramBoolean == true)
      this.sourcename = paramString; 
    return this.sourcename;
  }
  
  public void setSourcename(String paramString) {
    sourcename(true, paramString);
  }
  
  public void setVolume(float paramFloat) {
    this.gain = paramFloat;
    resetGain();
  }
  
  public void setFilenameURL(FilenameURL paramFilenameURL) {
    filenameURL(true, paramFilenameURL);
  }
  
  public MidiChannel(boolean paramBoolean, String paramString1, String paramString2) {
    loading(true, true);
    this.logger = SoundSystemConfig.getLogger();
    filenameURL(true, new FilenameURL(paramString2));
    sourcename(true, paramString1);
    setLooping(paramBoolean);
    init();
    loading(true, false);
  }
  
  public void play() {
    if (!loading()) {
      if (this.sequencer == null)
        return; 
      try {
        this.sequencer.start();
        this.sequencer.addMetaEventListener(this);
      } catch (Exception exception) {
        errorMessage("Exception in method 'play'");
        printStackTrace(exception);
        SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
        SoundSystem.setException(soundSystemException);
      } 
    } 
  }
  
  public String getSourcename() {
    return sourcename(false, null);
  }
  
  private void getSequencer() {
    try {
      this.sequencer = MidiSystem.getSequencer();
      if (this.sequencer != null) {
        try {
          this.sequencer.getTransmitter();
        } catch (MidiUnavailableException midiUnavailableException) {
          message("Unable to get a transmitter from the default MIDI sequencer");
        } 
        this.sequencer.open();
      } 
    } catch (MidiUnavailableException midiUnavailableException) {
      message("Unable to open the default MIDI sequencer");
      this.sequencer = null;
    } catch (Exception exception) {
      if (exception instanceof InterruptedException) {
        message("Caught InterruptedException while attempting to open the default MIDI sequencer.  Trying again.");
        this.sequencer = null;
      } 
      try {
        this.sequencer = MidiSystem.getSequencer();
        if (this.sequencer != null) {
          try {
            this.sequencer.getTransmitter();
          } catch (MidiUnavailableException midiUnavailableException) {
            message("Unable to get a transmitter from the default MIDI sequencer");
          } 
          this.sequencer.open();
        } 
      } catch (MidiUnavailableException midiUnavailableException) {
        message("Unable to open the default MIDI sequencer");
        this.sequencer = null;
      } catch (Exception exception1) {
        message("Unknown error opening the default MIDI sequencer");
        this.sequencer = null;
      } 
    } 
    if (this.sequencer == null)
      this.sequencer = openSequencer("Real Time Sequencer"); 
    if (this.sequencer == null)
      this.sequencer = openSequencer("Java Sound Sequencer"); 
    if (this.sequencer == null) {
      errorMessage("Failed to find an available MIDI sequencer");
      return;
    } 
  }
  
  public void cleanup() {
    loading(true, true);
    setLooping(true);
    if (this.sequencer != null)
      try {
        this.sequencer.stop();
        this.sequencer.close();
        this.sequencer.removeMetaEventListener(this);
      } catch (Exception exception) {} 
    this.logger = null;
    this.sequencer = null;
    this.synthesizer = null;
    this.sequence = null;
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue != null)
        this.sequenceQueue.clear(); 
      this.sequenceQueue = null;
    } 
    if (this.fadeThread != null) {
      boolean bool = false;
      try {
        this.fadeThread.kill();
        this.fadeThread.interrupt();
      } catch (Exception exception) {
        bool = true;
      } 
      if (!bool)
        for (byte b = 0; b < 50 && this.fadeThread.alive(); b++) {
          try {
            Thread.sleep(100L);
          } catch (InterruptedException interruptedException) {}
        }  
      if (bool || this.fadeThread.alive()) {
        errorMessage("MIDI fade effects thread did not die!");
        message("Ignoring errors... continuing clean-up.");
      } 
    } 
    this.fadeThread = null;
    loading(true, false);
  }
  
  public void fadeOut(FilenameURL paramFilenameURL, long paramLong) {
    if (paramLong < 0L) {
      errorMessage("Miliseconds may not be negative in method 'fadeOut'.");
      return;
    } 
    this.fadeOutMilis = paramLong;
    this.fadeInMilis = 0L;
    this.fadeOutGain = 1.0F;
    this.lastFadeCheck = System.currentTimeMillis();
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue != null)
        this.sequenceQueue.clear(); 
      if (paramFilenameURL != null) {
        if (this.sequenceQueue == null)
          this.sequenceQueue = new LinkedList(); 
        this.sequenceQueue.add(paramFilenameURL);
      } 
    } 
    if (this.fadeThread == null) {
      this.fadeThread = new MidiChannel$FadeThread(this, null);
      this.fadeThread.start();
    } 
    this.fadeThread.interrupt();
  }
  
  public void switchSource(boolean paramBoolean, String paramString, FilenameURL paramFilenameURL) {
    loading(true, true);
    filenameURL(true, paramFilenameURL);
    sourcename(true, paramString);
    setLooping(paramBoolean);
    reset();
    loading(true, false);
  }
  
  public String getFilename() {
    return filenameURL(false, null).getFilename();
  }
  
  private boolean incrementSequence() {
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue != null && this.sequenceQueue.size() > 0) {
        filenameURL(true, this.sequenceQueue.remove(0));
        loading(true, true);
        if (this.sequencer == null) {
          getSequencer();
        } else {
          this.sequencer.stop();
          this.sequencer.setMicrosecondPosition(0L);
          this.sequencer.removeMetaEventListener(this);
          try {
            Thread.sleep(100L);
          } catch (InterruptedException interruptedException) {}
        } 
        if (this.sequencer == null) {
          errorMessage("Unable to set the sequence in method 'incrementSequence', because there wasn't a sequencer to use.");
          loading(true, false);
          return false;
        } 
        setSequence(filenameURL(false, null).getURL());
        this.sequencer.start();
        resetGain();
        this.sequencer.addMetaEventListener(this);
        loading(true, false);
        return true;
      } 
    } 
    return false;
  }
  
  private Sequencer openSequencer(String paramString) {
    Sequencer sequencer = null;
    sequencer = (Sequencer)openMidiDevice(paramString);
    if (sequencer == null)
      return null; 
    try {
      sequencer.getTransmitter();
    } catch (MidiUnavailableException midiUnavailableException) {
      message("    Unable to get a transmitter from this sequencer");
      sequencer = null;
      return null;
    } 
    return sequencer;
  }
  
  public void dequeueSound(String paramString) {
    if (paramString == null || paramString.equals("")) {
      errorMessage("Filename not specified in method 'dequeueSound'");
      return;
    } 
    synchronized (this.sequenceQueueLock) {
      if (this.sequenceQueue != null) {
        ListIterator<FilenameURL> listIterator = this.sequenceQueue.listIterator();
        while (listIterator.hasNext()) {
          if (((FilenameURL)listIterator.next()).getFilename().equals(paramString)) {
            listIterator.remove();
            break;
          } 
        } 
      } 
    } 
  }
  
  protected void errorMessage(String paramString) {
    this.logger.errorMessage("MidiChannel", paramString, 0);
  }
  
  private void init() {
    getSequencer();
    setSequence(filenameURL(false, null).getURL());
    getSynthesizer();
    resetGain();
  }
  
  public void switchSource(boolean paramBoolean, String paramString1, URL paramURL, String paramString2) {
    loading(true, true);
    filenameURL(true, new FilenameURL(paramURL, paramString2));
    sourcename(true, paramString1);
    setLooping(paramBoolean);
    reset();
    loading(true, false);
  }
  
  private void setSequence(URL paramURL) {
    if (this.sequencer == null) {
      errorMessage("Unable to update the sequence in method 'setSequence', because variable 'sequencer' is null");
      return;
    } 
    if (paramURL == null) {
      errorMessage("Unable to load Midi file in method 'setSequence'.");
      return;
    } 
    try {
      this.sequence = MidiSystem.getSequence(paramURL);
    } catch (IOException iOException) {
      errorMessage("Input failed while reading from MIDI file in method 'setSequence'.");
      printStackTrace(iOException);
      return;
    } catch (InvalidMidiDataException invalidMidiDataException) {
      errorMessage("Invalid MIDI data encountered, or not a MIDI file in method 'setSequence' (1).");
      printStackTrace(invalidMidiDataException);
      return;
    } 
    if (this.sequence == null) {
      errorMessage("MidiSystem 'getSequence' method returned null in method 'setSequence'.");
    } else {
      try {
        this.sequencer.setSequence(this.sequence);
      } catch (InvalidMidiDataException invalidMidiDataException) {
        errorMessage("Invalid MIDI data encountered, or not a MIDI file in method 'setSequence' (2).");
        printStackTrace(invalidMidiDataException);
        return;
      } catch (Exception exception) {
        errorMessage("Problem setting sequence from MIDI file in method 'setSequence'.");
        printStackTrace(exception);
        return;
      } 
    } 
  }
  
  public FilenameURL getFilenameURL() {
    return filenameURL(false, null);
  }
  
  public void setLooping(boolean paramBoolean) {
    toLoop(true, paramBoolean);
  }
  
  public void meta(MetaMessage paramMetaMessage) {
    if (paramMetaMessage.getType() == 47) {
      SoundSystemConfig.notifyEOS(this.sourcename, this.sequenceQueue.size());
      if (this.toLoop) {
        if (!checkFadeOut()) {
          if (!incrementSequence())
            try {
              this.sequencer.setMicrosecondPosition(0L);
              this.sequencer.start();
              resetGain();
            } catch (Exception exception) {} 
        } else if (this.sequencer != null) {
          try {
            this.sequencer.setMicrosecondPosition(0L);
            this.sequencer.start();
            resetGain();
          } catch (Exception exception) {}
        } 
      } else if (!checkFadeOut()) {
        if (!incrementSequence())
          try {
            this.sequencer.stop();
            this.sequencer.setMicrosecondPosition(0L);
            this.sequencer.removeMetaEventListener(this);
          } catch (Exception exception) {} 
      } else {
        try {
          this.sequencer.stop();
          this.sequencer.setMicrosecondPosition(0L);
          this.sequencer.removeMetaEventListener(this);
        } catch (Exception exception) {}
      } 
    } 
  }
  
  private MidiDevice openMidiDevice(String paramString) {
    message("Searching for MIDI device with name containing '" + paramString + "'");
    MidiDevice midiDevice = null;
    MidiDevice.Info[] arrayOfInfo = MidiSystem.getMidiDeviceInfo();
    for (byte b = 0; b < arrayOfInfo.length; b++) {
      midiDevice = null;
      try {
        midiDevice = MidiSystem.getMidiDevice(arrayOfInfo[b]);
      } catch (MidiUnavailableException midiUnavailableException) {
        message("    Problem in method 'getMidiDevice':  MIDIUnavailableException was thrown");
        midiDevice = null;
      } 
      if (midiDevice != null && arrayOfInfo[b].getName().contains(paramString)) {
        message("    Found MIDI device named '" + arrayOfInfo[b].getName() + "'");
        if (midiDevice instanceof Synthesizer)
          message("        *this is a Synthesizer instance"); 
        if (midiDevice instanceof Sequencer)
          message("        *this is a Sequencer instance"); 
        try {
          midiDevice.open();
        } catch (MidiUnavailableException midiUnavailableException) {
          message("    Unable to open this MIDI device");
          midiDevice = null;
        } 
        return midiDevice;
      } 
    } 
    message("    MIDI device not found");
    return null;
  }
  
  static {
    GET = false;
    CHANGE_VOLUME = 7;
    END_OF_TRACK = 47;
  }
  
  public void stop() {
    if (!loading()) {
      if (this.sequencer == null)
        return; 
      try {
        this.sequencer.stop();
        this.sequencer.setMicrosecondPosition(0L);
        this.sequencer.removeMetaEventListener(this);
      } catch (Exception exception) {
        errorMessage("Exception in method 'stop'");
        printStackTrace(exception);
        SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
        SoundSystem.setException(soundSystemException);
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\MidiChannel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */