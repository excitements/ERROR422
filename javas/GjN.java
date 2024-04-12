import java.util.List;

public class GjN extends xZE {
  public String Dne() {
    return "deop";
  }
  
  public int Dne() {
    return 3;
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Jwh.Dne().Dne().FWm()) : null;
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.deop.usage", new Object[0]);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1 && paramArrayOfString[0].length() > 0) {
      Jwh.Dne().Dne().FWm(paramArrayOfString[0]);
      Dne(paramgnI, "commands.deop.success", new Object[] { paramArrayOfString[0] });
    } else {
      throw new fxw("commands.deop.usage", new Object[0]);
    } 
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GjN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */