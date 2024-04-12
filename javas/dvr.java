import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class dvr extends Thread {
  final muh Dne;
  
  final TIk Dne;
  
  public void run() {
    boolean bool = false;
    try {
      bool = true;
      if (((muh)this.Dne).FWm == 0L) {
        ((muh)this.Dne).FWm = 1L;
        ((muh)this.Dne).FWm = -2L;
        ((muh)this.Dne).DyG = "";
        wWl.FWm();
        long l1 = System.nanoTime();
        wWl.Dne(this.Dne.Dne, (muh)this.Dne);
        long l2 = System.nanoTime();
        ((muh)this.Dne).FWm = (l2 - l1) / 1000000L;
        bool = false;
      } else if (((muh)this.Dne).bzF) {
        ((muh)this.Dne).bzF = false;
        wWl.Dne(this.Dne.Dne, (muh)this.Dne);
        bool = false;
      } else {
        bool = false;
      } 
    } catch (UnknownHostException unknownHostException) {
      ((muh)this.Dne).FWm = -1L;
      bool = false;
    } catch (SocketTimeoutException socketTimeoutException) {
      ((muh)this.Dne).FWm = -1L;
      bool = false;
    } catch (ConnectException connectException) {
      ((muh)this.Dne).FWm = -1L;
      bool = false;
    } catch (IOException iOException) {
      ((muh)this.Dne).FWm = -1L;
      bool = false;
    } catch (Exception exception) {
      ((muh)this.Dne).FWm = -1L;
      bool = false;
    } finally {
      if (bool)
        synchronized (wWl.Dne()) {
          wWl.bzF();
        }  
    } 
    synchronized (wWl.Dne()) {
      wWl.bzF();
    } 
  }
  
  dvr(TIk paramTIk, muh parammuh) {
    this.Dne = paramTIk;
    this.Dne = (TIk)parammuh;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dvr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */