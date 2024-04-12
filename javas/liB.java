import java.io.IOException;
import java.net.InetAddress;

public class liB extends NuQ {
  private pOU Dne;
  
  private boolean FWm;
  
  private final bqd Dne;
  
  private String Dne;
  
  private bqd FWm = false;
  
  public void Dne(bqd parambqd, String paramString) {
    this.FWm = parambqd;
    this.Dne = paramString;
  }
  
  public liB(zHD paramzHD) {
    super(paramzHD);
    this.Dne = (String)new bqd(paramzHD.Dne(), (pPV)null);
  }
  
  public zHD Dne() {
    return (zHD)super.Dne();
  }
  
  public boolean Dne() {
    return (this.FWm != null && this.Dne.Dne().Dne() && this.Dne.Dne().FWm());
  }
  
  public Jwh Dne() {
    return Dne();
  }
  
  public void FWm() {
    if (this.FWm != null) {
      PJQ pJQ = Dne().Dne().Dne(this.Dne);
      if (pJQ != null) {
        this.Dne.Dne(this.FWm);
        this.FWm = true;
        Dne().Dne().Dne((RXf)this.Dne, pJQ);
      } 
      this.FWm = null;
      this.Dne = null;
    } 
    if (this.Dne != null)
      this.Dne.Dne(); 
    super.FWm();
  }
  
  public String Dne() {
    if (this.Dne == null) {
      int i = -1;
      try {
        i = fgp.Dne();
      } catch (IOException iOException) {}
      if (i <= 0)
        i = 25564; 
      try {
        this.Dne = (String)new pOU(this, (InetAddress)null, i);
        this.Dne.start();
      } catch (IOException iOException) {
        throw iOException;
      } 
    } 
    return this.Dne.Dne().getHostAddress() + ":" + this.Dne.Dne();
  }
  
  public void Dne() {
    super.Dne();
    if (this.Dne != null) {
      Dne().Dne().Dne("Stopping server connection");
      this.Dne.FWm();
      this.Dne.interrupt();
      this.Dne = null;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\liB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */