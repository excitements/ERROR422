class zGQ extends Thread {
  final Qyp Dne;
  
  public void run() {
    try {
      Thread.sleep(2000L);
      if (Qyp.Dne(this.Dne)) {
        Qyp.FWm(this.Dne).interrupt();
        this.Dne.Dne("disconnect.closed", new Object[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  zGQ(Qyp paramQyp) {
    this.Dne = paramQyp;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zGQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */