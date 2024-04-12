import java.util.List;

public class PpL extends xZE {
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Dne()) : null;
  }
  
  protected String[] Dne() {
    return Jwh.Dne().Dne();
  }
  
  public int Dne() {
    return 2;
  }
  
  static {
  
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length < 2)
      throw new fxw("commands.enchant.usage", new Object[0]); 
    PJQ pJQ = Dne(paramgnI, paramArrayOfString[0]);
    int i = Dne(paramgnI, paramArrayOfString[1], 0, ycv.Dne.length - 1);
    int j = 1;
    NMq nMq = pJQ.bzF();
    if (nMq == null) {
      Dne(paramgnI, "commands.enchant.noItem", new Object[0]);
    } else {
      String str = ycv.Dne[i];
      if (str == null)
        throw new PUA("commands.enchant.notFound", new Object[] { Integer.valueOf(i) }); 
      if (!str.Dne(nMq)) {
        Dne(paramgnI, "commands.enchant.cantEnchant", new Object[0]);
      } else {
        if (paramArrayOfString.length >= 3)
          j = Dne(paramgnI, paramArrayOfString[2], str.bzF(), str.Dne()); 
        if (nMq.aFZ()) {
          mbZ mbZ = nMq.Dne();
          if (mbZ != null)
            for (byte b = 0; b < mbZ.Dne(); b++) {
              short s = ((WkD)mbZ.FWm(b)).Dne("id");
              if (ycv.Dne[s] != null) {
                String str1 = ycv.Dne[s];
                if (!str1.Dne((ycv)str)) {
                  Dne(paramgnI, "commands.enchant.cantCombine", new Object[] { str.Dne(j), str1.Dne(((WkD)mbZ.FWm(b)).Dne("lvl")) });
                  return;
                } 
              } 
            }  
        } 
        nMq.Dne((ycv)str, j);
        Dne(paramgnI, "commands.enchant.success", new Object[0]);
      } 
    } 
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.enchant.usage", new Object[0]);
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
  
  public String Dne() {
    return "enchant";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PpL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */