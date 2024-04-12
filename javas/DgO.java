import java.util.List;
import java.util.regex.Matcher;

public class DgO extends xZE {
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.unbanip.usage", new Object[0]);
  }
  
  static {
  
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Jwh.Dne().Dne().FWm().Dne().keySet()) : null;
  }
  
  public int Dne() {
    return 3;
  }
  
  public String Dne() {
    return "pardon-ip";
  }
  
  public boolean Dne(gnI paramgnI) {
    return (Jwh.Dne().Dne().FWm().Dne() && super.Dne(paramgnI));
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1 && paramArrayOfString[0].length() > 1) {
      Matcher matcher = tqk.Dne.matcher(paramArrayOfString[0]);
      if (matcher.matches()) {
        Jwh.Dne().Dne().FWm().Dne(paramArrayOfString[0]);
        Dne(paramgnI, "commands.unbanip.success", new Object[] { paramArrayOfString[0] });
      } else {
        throw new qwv("commands.unbanip.invalid", new Object[0]);
      } 
    } else {
      throw new fxw("commands.unbanip.usage", new Object[0]);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DgO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */