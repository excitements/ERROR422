import java.io.IOException;

class mxl extends Thread {
  final MKS Dne;
  
  final irb Dne;
  
  final int Dne;
  
  final int FWm;
  
  mxl(MKS paramMKS, irb paramirb, int paramInt1, int paramInt2) {
    this.Dne = paramMKS;
    this.Dne = paramirb;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public void run() {
    mNp mNp = new mNp((MKS.Dne(this.Dne)).Dne);
    boolean bool = false;
    for (byte b = 0; b < 3; b++) {
      try {
        Boolean bool1 = mNp.Dne();
        if (bool1.booleanValue())
          MKS.Dne(this.Dne, this.Dne, this.Dne, this.FWm); 
        MKS.Dne(bool1.booleanValue());
      } catch (Ybw ybw) {
        bool = true;
      } catch (lUu lUu) {
      
      } catch (IOException iOException) {}
      if (!bool)
        break; 
      try {
        Thread.sleep(10000L);
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mxl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */