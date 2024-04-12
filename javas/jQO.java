import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jQO {
  boolean Dne;
  
  private ArrayList Dne = new ArrayList();
  
  public synchronized List Dne() {
    return Collections.unmodifiableList(this.Dne);
  }
  
  public synchronized boolean Dne() {
    return this.Dne;
  }
  
  public synchronized void Dne() {
    this.Dne = false;
  }
  
  public synchronized void Dne(String paramString, InetAddress paramInetAddress) {
    String str1 = TWE.Dne(paramString);
    String str2 = TWE.FWm(paramString);
    if (str2 != null) {
      int i = str2.indexOf(':');
      if (i > 0)
        str2 = paramInetAddress.getHostAddress() + str2.substring(i); 
      boolean bool = false;
      for (jhx jhx : this.Dne) {
        if (jhx.FWm().equals(str2)) {
          jhx.Dne();
          bool = true;
          break;
        } 
      } 
      if (!bool) {
        this.Dne.add(new jhx(str1, str2));
        this.Dne = true;
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jQO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */