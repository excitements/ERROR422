import java.util.List;

public class fTH extends xZE {
  public String Dne() {
    return "say";
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.say.usage", new Object[0]);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length > 0 && paramArrayOfString[0].length() > 0) {
      String str = Dne(paramgnI, paramArrayOfString, 0, true);
      Jwh.Dne().Dne().aFZ(String.format("[%s] %s", new Object[] { paramgnI.a_(), str }));
    } else {
      throw new fxw("commands.say.usage", new Object[0]);
    } 
  }
  
  static {
  
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length >= 1) ? Dne(paramArrayOfString, Jwh.Dne().Dne()) : null;
  }
  
  public int Dne() {
    return 1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fTH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */