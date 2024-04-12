import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class YGE {
  private String FWm;
  
  private String Qnq = "";
  
  private boolean Dne;
  
  private final String Dne;
  
  private String bzF = "";
  
  private final SFA Dne;
  
  private final Set Dne = new HashSet();
  
  private boolean FWm;
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public String FWm() {
    return this.FWm;
  }
  
  public Collection Dne() {
    return this.Dne;
  }
  
  public String Qnq() {
    return this.Qnq;
  }
  
  public static String Dne(YGE paramYGE, String paramString) {
    return (paramYGE == null) ? paramString : (paramYGE.bzF() + paramString + paramYGE.Qnq());
  }
  
  public String bzF() {
    return this.bzF;
  }
  
  public YGE(SFA paramSFA, String paramString) {
    this.Dne = true;
    this.FWm = true;
    this.Dne = (Set)paramSFA;
    this.Dne = (Set)paramString;
    this.FWm = paramString;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public void FWm(boolean paramBoolean) {
    this.FWm = paramBoolean;
    this.Dne.bzF(this);
  }
  
  public void FWm(String paramString) {
    if (paramString == null)
      throw new IllegalArgumentException("Prefix cannot be null"); 
    this.bzF = paramString;
    this.Dne.bzF(this);
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
    this.Dne.bzF(this);
  }
  
  public int Dne() {
    int i = 0;
    byte b = 0;
    if (Dne())
      i |= 1 << b++; 
    if (FWm())
      i |= 1 << b++; 
    return i;
  }
  
  public void Dne(String paramString) {
    if (paramString == null)
      throw new IllegalArgumentException("Name cannot be null"); 
    this.FWm = paramString;
    this.Dne.bzF(this);
  }
  
  public void bzF(String paramString) {
    if (paramString == null)
      throw new IllegalArgumentException("Suffix cannot be null"); 
    this.Qnq = paramString;
    this.Dne.bzF(this);
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public void Dne(int paramInt) {
    byte b = 0;
    int i = b + 1;
    Dne(((paramInt & 1 << b) > 0));
    FWm(((paramInt & 1 << i++) > 0));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YGE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */