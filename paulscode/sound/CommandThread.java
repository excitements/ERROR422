package paulscode.sound;

public class CommandThread extends SimpleThread {
  private SoundSystem soundSystem;
  
  protected String className = "CommandThread";
  
  protected SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  protected void errorMessage(String paramString, int paramInt) {
    this.logger.errorMessage(this.className, paramString, paramInt);
  }
  
  protected boolean errorCheck(boolean paramBoolean, String paramString) {
    return this.logger.errorCheck(paramBoolean, this.className, paramString, 0);
  }
  
  public void run() {
    long l1 = System.currentTimeMillis();
    long l2 = l1;
    if (this.soundSystem == null) {
      errorMessage("SoundSystem was null in method run().", 0);
      cleanup();
      return;
    } 
    snooze(3600000L);
    while (!dying()) {
      this.soundSystem.ManageSources();
      this.soundSystem.CommandQueue(null);
      l2 = System.currentTimeMillis();
      if (!dying() && l2 - l1 > 10000L) {
        l1 = l2;
        this.soundSystem.removeTemporarySources();
      } 
      if (!dying())
        snooze(3600000L); 
    } 
    cleanup();
  }
  
  public CommandThread(SoundSystem paramSoundSystem) {
    this.soundSystem = paramSoundSystem;
  }
  
  protected void message(String paramString, int paramInt) {
    this.logger.message(paramString, paramInt);
  }
  
  protected void importantMessage(String paramString, int paramInt) {
    this.logger.importantMessage(paramString, paramInt);
  }
  
  protected void cleanup() {
    kill();
    this.logger = null;
    this.soundSystem = null;
    super.cleanup();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\CommandThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */