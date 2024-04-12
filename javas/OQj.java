import java.io.IOException;

public class OQj extends jhn {
  private final muh Dne;
  
  private final qVZ Dne;
  
  private fzy Dne;
  
  public void run() {
    FWm(irb.Dne().Dne("mco.connect.connecting"));
    mNp mNp = new mNp((Dne()).Dne);
    boolean bool1 = false;
    boolean bool2 = false;
    HMg hMg = null;
    for (byte b = 0; b < 10 && !Dne(); b++) {
      try {
        hMg = mNp.Dne(((muh)this.Dne).Dne);
        bool1 = true;
      } catch (Ybw ybw) {
      
      } catch (lUu lUu) {
        bool2 = true;
        Dne(lUu.getLocalizedMessage());
        break;
      } catch (IOException iOException) {
      
      } catch (Exception exception) {
        bool2 = true;
        Dne(exception.getLocalizedMessage());
      } 
      if (bool1)
        break; 
      bzF();
    } 
    if (!Dne() && !bool2)
      if (bool1) {
        Qyv qyv = Qyv.Dne(hMg.Dne);
        Dne(qyv.Dne(), qyv.Dne());
      } else {
        Dne().Dne((qVZ)this.Dne);
      }  
  }
  
  private void Dne(String paramString, int paramInt) {
    (new Evv(this, paramString, paramInt)).start();
  }
  
  static qVZ Dne(OQj paramOQj) {
    return (qVZ)paramOQj.Dne;
  }
  
  static fzy Dne(OQj paramOQj) {
    return paramOQj.Dne;
  }
  
  public OQj(qVZ paramqVZ, muh parammuh) {
    this.Dne = (fzy)paramqVZ;
    this.Dne = (fzy)parammuh;
  }
  
  private void bzF() {
    try {
      Thread.sleep(5000L);
    } catch (InterruptedException interruptedException) {
      System.err.println(interruptedException);
    } 
  }
  
  static fzy Dne(OQj paramOQj, fzy paramfzy) {
    return paramOQj.Dne = paramfzy;
  }
  
  public void Dne() {
    if (this.Dne != null)
      this.Dne.FWm(); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OQj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */