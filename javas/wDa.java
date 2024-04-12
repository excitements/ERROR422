import java.io.IOException;

class wDa extends Thread {
  final Qyp Dne;
  
  wDa(Qyp paramQyp, String paramString) {
    super(paramString);
    this.Dne = paramQyp;
  }
  
  public void run() {
    Qyp.FWm.getAndIncrement();
    try {
      while (Qyp.Dne(this.Dne)) {
        boolean bool;
        for (bool = false; Qyp.Qnq(this.Dne); bool = true);
        try {
          if (bool && Qyp.Dne(this.Dne) != null)
            Qyp.Dne(this.Dne).flush(); 
        } catch (IOException iOException) {
          if (!Qyp.aFZ(this.Dne))
            Qyp.Dne(this.Dne, iOException); 
          iOException.printStackTrace();
        } 
        try {
          sleep(2L);
        } catch (InterruptedException interruptedException) {}
      } 
    } finally {
      Qyp.FWm.getAndDecrement();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wDa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */