import java.net.ConnectException;
import java.net.UnknownHostException;

class kpW extends Thread {
  final rND Dne;
  
  final int Dne;
  
  final String Dne;
  
  kpW(rND paramrND, String paramString, int paramInt) {
    this.Dne = (String)paramrND;
    this.Dne = paramString;
    this.Dne = paramInt;
  }
  
  public void run() {
    try {
      rND.Dne((rND)this.Dne, new fzy(rND.Dne((rND)this.Dne), this.Dne, this.Dne));
      if (rND.Dne((rND)this.Dne))
        return; 
      rND.Dne((rND)this.Dne).FWm(new ike(61, (rND.FWm((rND)this.Dne)).Dne.Dne, this.Dne, this.Dne));
    } catch (UnknownHostException unknownHostException) {
      if (rND.Dne((rND)this.Dne))
        return; 
      rND.bzF((rND)this.Dne).Dne(new fZp(rND.Dne((rND)this.Dne), "connect.failed", "disconnect.genericReason", new Object[] { "Unknown host '" + this.Dne + "'" }));
    } catch (ConnectException connectException) {
      if (rND.Dne((rND)this.Dne))
        return; 
      rND.Qnq((rND)this.Dne).Dne(new fZp(rND.Dne((rND)this.Dne), "connect.failed", "disconnect.genericReason", new Object[] { connectException.getMessage() }));
    } catch (Exception exception) {
      if (rND.Dne((rND)this.Dne))
        return; 
      exception.printStackTrace();
      rND.aFZ((rND)this.Dne).Dne(new fZp(rND.Dne((rND)this.Dne), "connect.failed", "disconnect.genericReason", new Object[] { exception.toString() }));
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kpW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */