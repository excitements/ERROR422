import java.net.ConnectException;
import java.net.UnknownHostException;

class Evv extends Thread {
  final String Dne;
  
  final int Dne;
  
  final OQj Dne;
  
  Evv(OQj paramOQj, String paramString, int paramInt) {
    this.Dne = paramOQj;
    this.Dne = (OQj)paramString;
    this.Dne = paramInt;
  }
  
  public void run() {
    try {
      OQj.Dne(this.Dne, new fzy(this.Dne.Dne(), (String)this.Dne, this.Dne, OQj.Dne(this.Dne)));
      if (this.Dne.Dne())
        return; 
      this.Dne.FWm(irb.Dne().Dne("mco.connect.authorizing"));
      OQj.Dne(this.Dne).FWm(new ike(61, (this.Dne.Dne()).Dne.Dne, (String)this.Dne, this.Dne));
    } catch (UnknownHostException unknownHostException) {
      if (this.Dne.Dne())
        return; 
      this.Dne.Dne().Dne(new rNz(OQj.Dne(this.Dne), "connect.failed", "disconnect.genericReason", new Object[] { "Unknown host '" + this.Dne + "'" }));
    } catch (ConnectException connectException) {
      if (this.Dne.Dne())
        return; 
      this.Dne.Dne().Dne(new rNz(OQj.Dne(this.Dne), "connect.failed", "disconnect.genericReason", new Object[] { connectException.getMessage() }));
    } catch (Exception exception) {
      if (this.Dne.Dne())
        return; 
      exception.printStackTrace();
      this.Dne.Dne().Dne(new rNz(OQj.Dne(this.Dne), "connect.failed", "disconnect.genericReason", new Object[] { exception.toString() }));
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Evv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */