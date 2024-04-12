import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class FTz extends Thread {
  final String Dne;
  
  final fwN Dne;
  
  final Pfo Dne;
  
  FTz(Pfo paramPfo, String paramString, fwN paramfwN) {
    this.Dne = paramPfo;
    this.Dne = (Pfo)paramString;
    this.Dne = (Pfo)paramfwN;
  }
  
  public void run() {
    HttpURLConnection httpURLConnection = null;
    try {
      URL uRL = new URL((String)this.Dne);
      httpURLConnection = (HttpURLConnection)uRL.openConnection();
      httpURLConnection.setDoInput(true);
      httpURLConnection.setDoOutput(false);
      httpURLConnection.connect();
      if (httpURLConnection.getResponseCode() / 100 == 4)
        return; 
      if (this.Dne == null) {
        this.Dne.Dne = ImageIO.read(httpURLConnection.getInputStream());
      } else {
        this.Dne.Dne = this.Dne.Dne(ImageIO.read(httpURLConnection.getInputStream()));
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      httpURLConnection.disconnect();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FTz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */