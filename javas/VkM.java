import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;

class VkM extends Thread {
  final dnH Dne;
  
  VkM(dnH paramdnH) {
    this.Dne = paramdnH;
  }
  
  public void run() {
    try {
      String str1 = (new BigInteger(Mjb.Dne(dnH.Dne(this.Dne), dnH.Dne(this.Dne).Dne().getPublic(), dnH.Dne(this.Dne)))).toString(16);
      URL uRL = new URL("http://session.minecraft.net/game/checkserver.jsp?user=" + URLEncoder.encode(dnH.FWm(this.Dne), "UTF-8") + "&serverId=" + URLEncoder.encode(str1, "UTF-8"));
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
      String str2 = bufferedReader.readLine();
      bufferedReader.close();
      if (!"YES".equals(str2)) {
        this.Dne.Dne("Failed to verify username!");
        return;
      } 
      dnH.Dne(this.Dne, true);
    } catch (Exception exception) {
      this.Dne.Dne("Failed to verify username! [internal error " + exception + "]");
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VkM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */