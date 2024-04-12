import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ikJ {
  public int Dne;
  
  public boolean Dne;
  
  private Random Dne;
  
  private Map Dne;
  
  private List Dne = (List)new Random();
  
  public OfD Dne(String paramString, File paramFile) {
    try {
      String str = paramString;
      paramString = paramString.substring(0, paramString.indexOf("."));
      if (this.Dne != null)
        while (Character.isDigit(paramString.charAt(paramString.length() - 1)))
          paramString = paramString.substring(0, paramString.length() - 1);  
      paramString = paramString.replaceAll("/", ".");
      if (!this.Dne.containsKey(paramString))
        this.Dne.put(paramString, new ArrayList()); 
      OfD ofD = new OfD(str, paramFile.toURI().toURL());
      ((List<OfD>)this.Dne.get(paramString)).add(ofD);
      this.Dne.add(ofD);
      this.Dne++;
      return ofD;
    } catch (MalformedURLException malformedURLException) {
      malformedURLException.printStackTrace();
      throw new RuntimeException(malformedURLException);
    } 
  }
  
  public OfD Dne() {
    return this.Dne.isEmpty() ? null : this.Dne.get(this.Dne.nextInt(this.Dne.size()));
  }
  
  public OfD Dne(String paramString) {
    List<OfD> list = (List)this.Dne.get(paramString);
    return (list == null) ? null : list.get(this.Dne.nextInt(list.size()));
  }
  
  public ikJ() {
    this.Dne = (List)new HashMap<>();
    this.Dne = new ArrayList();
    this.Dne = false;
    this.Dne = true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ikJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */