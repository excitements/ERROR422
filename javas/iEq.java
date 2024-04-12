import java.util.List;

public class iEq extends xZE {
  static {
  
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    PJQ pJQ;
    if (paramArrayOfString.length <= 0)
      throw new fxw("commands.xp.usage", new Object[0]); 
    String str = paramArrayOfString[0];
    boolean bool1 = (str.endsWith("l") || str.endsWith("L")) ? true : false;
    if (bool1 && str.length() > 1)
      str = str.substring(0, str.length() - 1); 
    int i = FWm(paramgnI, str);
    boolean bool2 = (i < 0) ? true : false;
    if (bool2)
      i *= -1; 
    if (paramArrayOfString.length > 1) {
      pJQ = Dne(paramgnI, paramArrayOfString[1]);
    } else {
      pJQ = Dne(paramgnI);
    } 
    if (bool1) {
      if (bool2) {
        pJQ.FWm(-i);
        Dne(paramgnI, "commands.xp.success.negative.levels", new Object[] { Integer.valueOf(i), pJQ.Dne() });
      } else {
        pJQ.FWm(i);
        Dne(paramgnI, "commands.xp.success.levels", new Object[] { Integer.valueOf(i), pJQ.Dne() });
      } 
    } else {
      if (bool2)
        throw new fxw("commands.xp.failure.widthdrawXp", new Object[0]); 
      pJQ.ooe(i);
      Dne(paramgnI, "commands.xp.success", new Object[] { Integer.valueOf(i), pJQ.Dne() });
    } 
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 2) ? Dne(paramArrayOfString, Dne()) : null;
  }
  
  public int Dne() {
    return 2;
  }
  
  public String Dne() {
    return "xp";
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.xp.usage", new Object[0]);
  }
  
  protected String[] Dne() {
    return Jwh.Dne().Dne();
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iEq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */