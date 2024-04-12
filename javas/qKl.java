import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class qKl extends JTM {
  private ServerSocket Dne;
  
  private Map Dne;
  
  private int bzF;
  
  private int FWm;
  
  private String Dne = null;
  
  private String FWm;
  
  public void Dne() {
    if (0 == this.FWm.length()) {
      bzF("No rcon password set in '" + this.Dne.Dne() + "', rcon disabled!");
    } else if (Character.MIN_VALUE < this.FWm && Character.MAX_VALUE >= this.FWm) {
      if (this.Dne == null)
        try {
          this.Dne = (String)new ServerSocket(this.FWm, 0, InetAddress.getByName(this.Dne));
          this.Dne.setSoTimeout(500);
          super.Dne();
        } catch (IOException iOException) {
          bzF("Unable to initialise rcon on " + this.Dne + ":" + this.FWm + " : " + iOException.getMessage());
        }  
    } else {
      bzF("Invalid rcon port " + this.FWm + " found in '" + this.Dne.Dne() + "', rcon disabled!");
    } 
  }
  
  private void bzF() {
    this.Dne = (String)new HashMap<>();
  }
  
  public qKl(xnW paramxnW) {
    super(paramxnW);
    this.FWm = paramxnW.Dne("rcon.port", 0);
    this.FWm = paramxnW.Dne("rcon.password", "");
    this.Dne = paramxnW.FWm();
    this.bzF = paramxnW.FWm();
    if (Character.MIN_VALUE == this.FWm) {
      this.FWm = this.bzF + 10;
      FWm("Setting default rcon port to " + this.FWm);
      paramxnW.Dne("rcon.port", Integer.valueOf(this.FWm));
      if (0 == this.FWm.length())
        paramxnW.Dne("rcon.password", ""); 
      paramxnW.Dne();
    } 
    if (0 == this.Dne.length())
      this.Dne = "0.0.0.0"; 
    bzF();
    this.Dne = null;
  }
  
  private void Qnq() {
    Iterator<Map.Entry> iterator = this.Dne.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      if (!((oea)entry.getValue()).Dne())
        iterator.remove(); 
    } 
  }
  
  public void run() {
    FWm("RCON running on " + this.Dne + ":" + this.FWm);
    try {
      while (this.Dne != null) {
        try {
          Socket socket = this.Dne.accept();
          socket.setSoTimeout(500);
          oea oea = new oea((xnW)this.Dne, socket);
          oea.Dne();
          this.Dne.put(socket.getRemoteSocketAddress(), oea);
          Qnq();
        } catch (SocketTimeoutException socketTimeoutException) {
          Qnq();
        } catch (IOException iOException) {
          if (this.Dne != null)
            FWm("IO: " + iOException.getMessage()); 
        } 
      } 
    } finally {
      Dne((ServerSocket)this.Dne);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qKl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */