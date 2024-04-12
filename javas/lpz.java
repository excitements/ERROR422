import java.util.List;

public class lpz extends xZE {
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.gamerule.usage", new Object[0]);
  }
  
  public String Dne() {
    return "gamerule";
  }
  
  public int Dne() {
    return 2;
  }
  
  static {
  
  }
  
  private aSc Dne() {
    return Jwh.Dne().Dne(0).Dne();
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 2) {
      String str1 = paramArrayOfString[0];
      String str2 = paramArrayOfString[1];
      aSc aSc = Dne();
      if (aSc.FWm(str1)) {
        aSc.FWm(str1, str2);
        Dne(paramgnI, "commands.gamerule.success", new Object[0]);
      } else {
        Dne(paramgnI, "commands.gamerule.norule", new Object[] { str1 });
      } 
    } else if (paramArrayOfString.length == 1) {
      String str = paramArrayOfString[0];
      aSc aSc = Dne();
      if (aSc.FWm(str)) {
        String str1 = aSc.Dne(str);
        paramgnI.Dne(str + " = " + str1);
      } else {
        Dne(paramgnI, "commands.gamerule.norule", new Object[] { str });
      } 
    } else if (paramArrayOfString.length == 0) {
      aSc aSc = Dne();
      paramgnI.Dne(Dne((Object[])aSc.Dne()));
    } else {
      throw new fxw("commands.gamerule.usage", new Object[0]);
    } 
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Dne().Dne()) : ((paramArrayOfString.length == 2) ? Dne(paramArrayOfString, new String[] { "true", "false" }) : null);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lpz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */