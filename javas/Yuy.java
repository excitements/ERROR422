import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;

public class Yuy {
  private final msA Dne;
  
  private final int FWm;
  
  private final String FWm;
  
  private final String Dne;
  
  public static final Pattern Dne = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
  
  private final int Dne;
  
  private final WMY Dne;
  
  public Yuy(msA parammsA, WMY paramWMY, int paramInt1, int paramInt2) {
    this.Dne = (WMY)parammsA;
    this.Dne = paramWMY;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = (WMY)parammsA.Dne(paramWMY.Dne(), paramInt1);
    this.FWm = FWm();
  }
  
  public URI Dne() {
    String str = Dne();
    if (str == null)
      return null; 
    Matcher matcher = Dne.matcher(str);
    if (matcher.matches())
      try {
        String str1 = matcher.group(0);
        if (matcher.group(1) == null)
          str1 = "http://" + str1; 
        return new URI(str1);
      } catch (URISyntaxException uRISyntaxException) {
        Minecraft.Dne().Dne().FWm("Couldn't create URI from chat", uRISyntaxException);
      }  
    return null;
  }
  
  private String FWm() {
    int i = this.Dne.lastIndexOf(" ", this.Dne.length()) + 1;
    if (i < 0)
      i = 0; 
    int j = this.Dne.Dne().indexOf(" ", i);
    if (j < 0)
      j = this.Dne.Dne().length(); 
    return vCA.Dne(this.Dne.Dne().substring(i, j));
  }
  
  public String Dne() {
    return this.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Yuy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */