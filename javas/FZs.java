import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class FZs extends Thread {
  final Nmc Dne;
  
  final etB Dne;
  
  public void run() {
    boolean bool = false;
    try {
      bool = true;
      this.Dne.Qnq = Dne.IjH + "Polling..";
      long l1 = System.nanoTime();
      KDD.Dne(this.Dne);
      long l2 = System.nanoTime();
      this.Dne.Dne = (l2 - l1) / 1000000L;
      bool = false;
    } catch (UnknownHostException unknownHostException) {
      this.Dne.Dne = -1L;
      this.Dne.Qnq = Dne.aFZ + "Can't resolve hostname";
      bool = false;
    } catch (SocketTimeoutException socketTimeoutException) {
      this.Dne.Dne = -1L;
      this.Dne.Qnq = Dne.aFZ + "Can't reach server";
      bool = false;
    } catch (ConnectException connectException) {
      this.Dne.Dne = -1L;
      this.Dne.Qnq = Dne.aFZ + "Can't reach server";
      bool = false;
    } catch (IOException iOException) {
      this.Dne.Dne = -1L;
      this.Dne.Qnq = Dne.aFZ + "Communication error";
      bool = false;
    } catch (Exception exception) {
      this.Dne.Dne = -1L;
      this.Dne.Qnq = "ERROR: " + exception.getClass();
      bool = false;
    } finally {
      if (bool)
        synchronized (KDD.Dne()) {
          KDD.bzF();
        }  
    } 
    synchronized (KDD.Dne()) {
      KDD.bzF();
    } 
  }
  
  FZs(Nmc paramNmc, etB parametB) {
    this.Dne = (etB)paramNmc;
    this.Dne = parametB;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FZs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */