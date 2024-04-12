package paulscode.sound.libraries;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class LibraryJavaSound$MixerRanking {
  public boolean maxSampleRateOK = false;
  
  public static final int MEDIUM = 2;
  
  public static int MIN_SAMPLE_RATE_PRIORITY;
  
  public boolean minSampleRateOK = false;
  
  public static int GAIN_CONTROL_PRIORITY;
  
  public static int PAN_CONTROL_PRIORITY;
  
  public static int SAMPLE_RATE_CONTROL_PRIORITY;
  
  public boolean lineCountOK = false;
  
  public boolean mixerExists = false;
  
  public static int LINE_COUNT_PRIORITY;
  
  public int maxLinesPossible = 0;
  
  public static int MAX_SAMPLE_RATE_PRIORITY;
  
  public boolean gainControlOK = false;
  
  public Mixer.Info mixerInfo = null;
  
  public static final int LOW;
  
  public boolean sampleRateControlOK = false;
  
  public static final int NONE;
  
  public static int MIXER_EXISTS_PRIORITY;
  
  public int minSampleRatePossible = -1;
  
  public int rank = 0;
  
  public static final int HIGH = 1;
  
  public boolean panControlOK = false;
  
  public int maxSampleRatePossible = -1;
  
  public LibraryJavaSound$MixerRanking() {}
  
  public void rank(Mixer.Info paramInfo) {
    if (paramInfo == null)
      throw new LibraryJavaSound$Exception("No Mixer info specified in method 'MixerRanking.rank'", this); 
    this.mixerInfo = paramInfo;
    try {
      mixer = AudioSystem.getMixer(this.mixerInfo);
    } catch (Exception exception) {
      throw new LibraryJavaSound$Exception("Unable to acquire the specified Mixer in method 'MixerRanking.rank'", this);
    } 
    if (mixer == null)
      throw new LibraryJavaSound$Exception("Unable to acquire the specified Mixer in method 'MixerRanking.rank'", this); 
    this.mixerExists = true;
    try {
      AudioFormat audioFormat1 = new AudioFormat(LibraryJavaSound.access$000(false, 0), 16, 2, true, false);
      info = new DataLine.Info(SourceDataLine.class, audioFormat1);
    } catch (Exception exception) {
      throw new LibraryJavaSound$Exception("Invalid minimum sample-rate specified in method 'MixerRanking.rank'", this);
    } 
    if (!AudioSystem.isLineSupported(info)) {
      if (MIN_SAMPLE_RATE_PRIORITY == 1)
        throw new LibraryJavaSound$Exception("Specified minimum sample-rate not possible for Mixer '" + this.mixerInfo.getName() + "'", this); 
    } else {
      this.minSampleRateOK = true;
    } 
    try {
      AudioFormat audioFormat1 = new AudioFormat(LibraryJavaSound.access$100(false, 0), 16, 2, true, false);
      info = new DataLine.Info(SourceDataLine.class, audioFormat1);
    } catch (Exception exception) {
      throw new LibraryJavaSound$Exception("Invalid maximum sample-rate specified in method 'MixerRanking.rank'", this);
    } 
    if (!AudioSystem.isLineSupported(info)) {
      if (MAX_SAMPLE_RATE_PRIORITY == 1)
        throw new LibraryJavaSound$Exception("Specified maximum sample-rate not possible for Mixer '" + this.mixerInfo.getName() + "'", this); 
    } else {
      this.maxSampleRateOK = true;
    } 
    if (this.minSampleRateOK) {
      this.minSampleRatePossible = LibraryJavaSound.access$000(false, 0);
    } else {
      int i = LibraryJavaSound.access$000(false, 0);
      int j = LibraryJavaSound.access$100(false, 0);
      while (j - i > 1) {
        int k = i + (j - i) / 2;
        AudioFormat audioFormat1 = new AudioFormat(k, 16, 2, true, false);
        info = new DataLine.Info(SourceDataLine.class, audioFormat1);
        if (AudioSystem.isLineSupported(info)) {
          this.minSampleRatePossible = k;
          j = k;
          continue;
        } 
        i = k;
      } 
    } 
    if (this.maxSampleRateOK) {
      this.maxSampleRatePossible = LibraryJavaSound.access$100(false, 0);
    } else if (this.minSampleRatePossible != -1) {
      int j = LibraryJavaSound.access$100(false, 0);
      int i = this.minSampleRatePossible;
      while (j - i > 1) {
        int k = i + (j - i) / 2;
        AudioFormat audioFormat1 = new AudioFormat(k, 16, 2, true, false);
        info = new DataLine.Info(SourceDataLine.class, audioFormat1);
        if (AudioSystem.isLineSupported(info)) {
          this.maxSampleRatePossible = k;
          i = k;
          continue;
        } 
        j = k;
      } 
    } 
    if (this.minSampleRatePossible == -1 || this.maxSampleRatePossible == -1)
      throw new LibraryJavaSound$Exception("No possible sample-rate found for Mixer '" + this.mixerInfo.getName() + "'", this); 
    AudioFormat audioFormat = new AudioFormat(this.minSampleRatePossible, 16, 2, true, false);
    Clip clip = null;
    try {
      DataLine.Info info1 = new DataLine.Info(Clip.class, audioFormat);
      clip = (Clip)mixer.getLine(info1);
      byte[] arrayOfByte = new byte[10];
      clip.open(audioFormat, arrayOfByte, 0, arrayOfByte.length);
    } catch (Exception exception) {
      throw new LibraryJavaSound$Exception("Unable to attach an actual audio buffer to an actual Clip... Mixer '" + this.mixerInfo.getName() + "' is unuseable.", this);
    } 
    this.maxLinesPossible = 1;
    DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
    SourceDataLine[] arrayOfSourceDataLine = new SourceDataLine[LibraryJavaSound.access$200(false, 0) - 1];
    boolean bool = false;
    for (byte b = 1; b < arrayOfSourceDataLine.length + 1; b++) {
      try {
        arrayOfSourceDataLine[b - 1] = (SourceDataLine)mixer.getLine(info);
      } catch (Exception exception) {
        if (b == 0)
          throw new LibraryJavaSound$Exception("No output lines possible for Mixer '" + this.mixerInfo.getName() + "'", this); 
        if (LINE_COUNT_PRIORITY == 1)
          throw new LibraryJavaSound$Exception("Specified maximum number of lines not possible for Mixer '" + this.mixerInfo.getName() + "'", this); 
        break;
      } 
      this.maxLinesPossible = b + 1;
    } 
    try {
      clip.close();
    } catch (Exception exception) {}
    clip = null;
    if (this.maxLinesPossible == LibraryJavaSound.access$200(false, 0))
      this.lineCountOK = true; 
    if (!LibraryJavaSound.access$300(false, false)) {
      GAIN_CONTROL_PRIORITY = 4;
    } else if (!arrayOfSourceDataLine[0].isControlSupported(FloatControl.Type.MASTER_GAIN)) {
      if (GAIN_CONTROL_PRIORITY == 1)
        throw new LibraryJavaSound$Exception("Gain control not available for Mixer '" + this.mixerInfo.getName() + "'", this); 
    } else {
      this.gainControlOK = true;
    } 
    if (!LibraryJavaSound.access$400(false, false)) {
      PAN_CONTROL_PRIORITY = 4;
    } else if (!arrayOfSourceDataLine[0].isControlSupported(FloatControl.Type.PAN)) {
      if (PAN_CONTROL_PRIORITY == 1)
        throw new LibraryJavaSound$Exception("Pan control not available for Mixer '" + this.mixerInfo.getName() + "'", this); 
    } else {
      this.panControlOK = true;
    } 
    if (!LibraryJavaSound.access$500(false, false)) {
      SAMPLE_RATE_CONTROL_PRIORITY = 4;
    } else if (!arrayOfSourceDataLine[0].isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
      if (SAMPLE_RATE_CONTROL_PRIORITY == 1)
        throw new LibraryJavaSound$Exception("Sample-rate control not available for Mixer '" + this.mixerInfo.getName() + "'", this); 
    } else {
      this.sampleRateControlOK = true;
    } 
    this.rank += getRankValue(this.mixerExists, MIXER_EXISTS_PRIORITY);
    this.rank += getRankValue(this.minSampleRateOK, MIN_SAMPLE_RATE_PRIORITY);
    this.rank += getRankValue(this.maxSampleRateOK, MAX_SAMPLE_RATE_PRIORITY);
    this.rank += getRankValue(this.lineCountOK, LINE_COUNT_PRIORITY);
    this.rank += getRankValue(this.gainControlOK, GAIN_CONTROL_PRIORITY);
    this.rank += getRankValue(this.panControlOK, PAN_CONTROL_PRIORITY);
    this.rank += getRankValue(this.sampleRateControlOK, SAMPLE_RATE_CONTROL_PRIORITY);
    Mixer mixer = null;
    audioFormat = null;
    info = null;
    arrayOfSourceDataLine = null;
  }
  
  static {
    LOW = 3;
    NONE = 4;
    MIXER_EXISTS_PRIORITY = 1;
    MIN_SAMPLE_RATE_PRIORITY = 1;
    MAX_SAMPLE_RATE_PRIORITY = 1;
    LINE_COUNT_PRIORITY = 1;
    GAIN_CONTROL_PRIORITY = 2;
    PAN_CONTROL_PRIORITY = 2;
    SAMPLE_RATE_CONTROL_PRIORITY = 3;
  }
  
  public LibraryJavaSound$MixerRanking(Mixer.Info paramInfo, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7) {
    this.mixerInfo = paramInfo;
    this.rank = paramInt;
    this.mixerExists = paramBoolean1;
    this.minSampleRateOK = paramBoolean2;
    this.maxSampleRateOK = paramBoolean3;
    this.lineCountOK = paramBoolean4;
    this.gainControlOK = paramBoolean5;
    this.panControlOK = paramBoolean6;
    this.sampleRateControlOK = paramBoolean7;
  }
  
  private int getRankValue(boolean paramBoolean, int paramInt) {
    return paramBoolean ? 2 : ((paramInt == 4) ? 2 : ((paramInt == 3) ? 1 : 0));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\LibraryJavaSound$MixerRanking.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */