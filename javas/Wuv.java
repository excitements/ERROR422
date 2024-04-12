import java.util.List;

public class Wuv extends xZE {
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.give.usage", new Object[0]);
  }
  
  protected String[] Dne() {
    return Jwh.Dne().Dne();
  }
  
  public String Dne() {
    return "give";
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length >= 2) {
      PJQ pJQ = Dne(paramgnI, paramArrayOfString[0]);
      int i = Dne(paramgnI, paramArrayOfString[1], 1);
      int j = 1;
      int k = 0;
      if (dEr.Dne[i] == null)
        throw new PUA("commands.give.notFound", new Object[] { Integer.valueOf(i) }); 
      if (paramArrayOfString.length >= 3)
        j = Dne(paramgnI, paramArrayOfString[2], 1, 64); 
      if (paramArrayOfString.length >= 4)
        k = FWm(paramgnI, paramArrayOfString[3]); 
      NMq nMq = new NMq(i, j, k);
      JiM jiM = pJQ.Dne(nMq);
      jiM.FWm = 0;
      Dne(paramgnI, "commands.give.success", new Object[] { dEr.Dne[i].bzF(nMq), Integer.valueOf(i), Integer.valueOf(j), pJQ.Dne() });
    } else {
      throw new fxw("commands.give.usage", new Object[0]);
    } 
  }
  
  static {
  
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
  
  public int Dne() {
    return 2;
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Dne()) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Wuv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */