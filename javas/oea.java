import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class oea extends JTM {
  private String Dne;
  
  private Socket Dne;
  
  private boolean FWm = false;
  
  private byte[] Dne = new byte[1460];
  
  private void Dne(int paramInt, String paramString) {
    int i = paramString.length();
    do {
      boolean bool = (4096 <= i) ? true : i;
      Dne(paramInt, 0, paramString.substring(0, bool));
      paramString = paramString.substring(bool);
      i = paramString.length();
    } while (0 != i);
  }
  
  oea(xnW paramxnW, Socket paramSocket) {
    super(paramxnW);
    this.Dne = (byte[])paramSocket;
    try {
      this.Dne.setSoTimeout(0);
    } catch (Exception exception) {
      this.Dne = false;
    } 
    this.Dne = (byte[])paramxnW.Dne("rcon.password", "");
    FWm("Rcon connection from: " + paramSocket.getInetAddress());
  }
  
  private void Dne(int paramInt1, int paramInt2, String paramString) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1248);
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    dataOutputStream.writeInt(Integer.reverseBytes(paramString.length() + 10));
    dataOutputStream.writeInt(Integer.reverseBytes(paramInt1));
    dataOutputStream.writeInt(Integer.reverseBytes(paramInt2));
    dataOutputStream.writeBytes(paramString);
    dataOutputStream.write(0);
    dataOutputStream.write(0);
    this.Dne.getOutputStream().write(byteArrayOutputStream.toByteArray());
  }
  
  public void run() {
    try {
      while (this.Dne != null) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.Dne.getInputStream());
        int i = bufferedInputStream.read(this.Dne, 0, 1460);
        if (10 <= i) {
          String str;
          int i1;
          byte b = 0;
          int j = iwf.Dne(this.Dne, 0, i);
          if (j != i - 4)
            return; 
          int k = b + 4;
          int m = iwf.Dne(this.Dne, k, i);
          k += 4;
          int n = iwf.Dne(this.Dne, k);
          k += 4;
          switch (n) {
            case 2:
              if (this.FWm) {
                String str1 = iwf.Dne(this.Dne, k, i);
                try {
                  Dne(m, this.Dne.Dne(str1));
                } catch (Exception exception) {
                  Dne(m, "Error executing: " + str1 + " (" + exception.getMessage() + ")");
                } 
                continue;
              } 
              bzF();
              continue;
            case 3:
              str = iwf.Dne(this.Dne, k, i);
              i1 = k + str.length();
              if (0 != str.length() && str.equals(this.Dne)) {
                this.FWm = true;
                Dne(m, 2, "");
                continue;
              } 
              this.FWm = false;
              bzF();
              continue;
          } 
          Dne(m, String.format("Unknown request %s", new Object[] { Integer.toHexString(n) }));
        } 
      } 
      Qnq();
    } catch (SocketTimeoutException socketTimeoutException) {
    
    } catch (IOException iOException) {
    
    } catch (Exception exception) {
      System.out.println(exception);
    } finally {
      Qnq();
    } 
  }
  
  private void Qnq() {
    if (null != this.Dne) {
      try {
        this.Dne.close();
      } catch (IOException iOException) {
        bzF("IO: " + iOException.getMessage());
      } 
      this.Dne = null;
    } 
  }
  
  private void bzF() {
    Dne(-1, 2, "");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */