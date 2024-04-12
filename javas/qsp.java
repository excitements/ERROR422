class qsp extends Thread {
  final iJs Dne;
  
  qsp(iJs paramiJs) {
    this.Dne = paramiJs;
    setDaemon(true);
    start();
  }
  
  public void run() {
    while (true) {
      try {
        while (true)
          Thread.sleep(2147483647L); 
        break;
      } catch (InterruptedException interruptedException) {}
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */