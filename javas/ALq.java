import java.applet.Applet;
import java.applet.AppletStub;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class ALq extends Applet implements AppletStub {
  final Map Dne;
  
  public boolean isActive() {
    return true;
  }
  
  public URL getDocumentBase() {
    try {
      return new URL("http://www.minecraft.net/game/");
    } catch (MalformedURLException malformedURLException) {
      malformedURLException.printStackTrace();
      return null;
    } 
  }
  
  public void appletResize(int paramInt1, int paramInt2) {}
  
  public ALq(Map paramMap) {
    this.Dne = paramMap;
  }
  
  public String getParameter(String paramString) {
    if (this.Dne.containsKey(paramString))
      return (String)this.Dne.get(paramString); 
    System.err.println("Client asked for parameter: " + paramString);
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ALq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */