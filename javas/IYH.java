import java.util.List;

public class IYH extends xZE {
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    PJQ pJQ = (paramArrayOfString.length == 0) ? Dne(paramgnI) : Dne(paramgnI, paramArrayOfString[0]);
    if (paramArrayOfString.length == 4) {
      if (pJQ.Dne != null) {
        byte b = 1;
        int i = 30000000;
        int j = b + 1;
        int k = Dne(paramgnI, paramArrayOfString[b], -i, i);
        int m = Dne(paramgnI, paramArrayOfString[j++], 0, 256);
        int n = Dne(paramgnI, paramArrayOfString[j++], -i, i);
        pJQ.Dne(new iSh(k, m, n), true);
        Dne(paramgnI, "commands.spawnpoint.success", new Object[] { pJQ.Dne(), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n) });
      } 
    } else {
      if (paramArrayOfString.length > 1)
        throw new fxw("commands.spawnpoint.usage", new Object[0]); 
      iSh iSh = pJQ.Dne();
      pJQ.Dne(iSh, true);
      Dne(paramgnI, "commands.spawnpoint.success", new Object[] { pJQ.Dne(), Integer.valueOf(iSh.Dne), Integer.valueOf(iSh.FWm), Integer.valueOf(iSh.bzF) });
    } 
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
  
  public int Dne() {
    return 2;
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length != 1 && paramArrayOfString.length != 2) ? null : Dne(paramArrayOfString, Jwh.Dne().Dne());
  }
  
  public String Dne() {
    return "spawnpoint";
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.spawnpoint.usage", new Object[0]);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IYH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */