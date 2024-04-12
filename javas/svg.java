import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import net.minecraft.client.Minecraft;

public class svg extends Thread {
  private final InetAddress Dne;
  
  private final MulticastSocket Dne;
  
  private final jQO Dne;
  
  public svg(jQO paramjQO) {
    super("LanServerDetector");
    this.Dne = paramjQO;
    setDaemon(true);
    this.Dne = (jQO)new MulticastSocket(4445);
    this.Dne = (jQO)InetAddress.getByName("224.0.2.60");
    this.Dne.setSoTimeout(5000);
    this.Dne.joinGroup((InetAddress)this.Dne);
  }
  
  public void run() {
    byte[] arrayOfByte = new byte[1024];
    while (!isInterrupted()) {
      DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
      try {
        this.Dne.receive(datagramPacket);
      } catch (SocketTimeoutException socketTimeoutException) {
        continue;
      } catch (IOException iOException) {
        iOException.printStackTrace();
        break;
      } 
      String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
      Minecraft.Dne().Dne().Qnq(datagramPacket.getAddress() + ": " + str);
      this.Dne.Dne(str, datagramPacket.getAddress());
    } 
    try {
      this.Dne.leaveGroup((InetAddress)this.Dne);
    } catch (IOException iOException) {}
    this.Dne.close();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\svg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */