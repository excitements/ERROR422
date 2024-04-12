package paulscode.sound;

public class SimpleThread extends Thread {
  private static final boolean XXX;
  
  private boolean alive = true;
  
  private static final boolean SET = true;
  
  private static final boolean GET = false;
  
  private boolean kill = false;
  
  private synchronized boolean kill(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.kill = paramBoolean2; 
    return this.kill;
  }
  
  static {
    XXX = false;
  }
  
  public void run() {
    cleanup();
  }
  
  private void rerun() {
    kill(true, true);
    while (alive(false, false))
      snooze(100L); 
    alive(true, true);
    kill(true, false);
    run();
  }
  
  protected void cleanup() {
    kill(true, true);
    alive(true, false);
  }
  
  public void kill() {
    kill(true, true);
  }
  
  public void restart() {
    (new SimpleThread$1(this)).start();
  }
  
  public boolean alive() {
    return alive(false, false);
  }
  
  private synchronized boolean alive(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.alive = paramBoolean2; 
    return this.alive;
  }
  
  protected void snooze(long paramLong) {
    try {
      Thread.sleep(paramLong);
    } catch (InterruptedException interruptedException) {}
  }
  
  protected boolean dying() {
    return kill(false, false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SimpleThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */