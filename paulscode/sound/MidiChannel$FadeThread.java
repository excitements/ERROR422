package paulscode.sound;

class MidiChannel$FadeThread extends SimpleThread {
  private MidiChannel$FadeThread() {}
  
  public void run() {
    while (!dying()) {
      if (MidiChannel.this.fadeOutGain == -1.0F && MidiChannel.this.fadeInGain == 1.0F)
        snooze(3600000L); 
      MidiChannel.access$100(MidiChannel.this);
      snooze(50L);
    } 
    cleanup();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\MidiChannel$FadeThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */