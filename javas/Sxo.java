import java.util.List;

public class Sxo extends xZE {
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length > 0) {
      XHL xHL = Dne(paramgnI, paramArrayOfString[0]);
      PJQ pJQ = (paramArrayOfString.length >= 2) ? Dne(paramgnI, paramArrayOfString[1]) : Dne(paramgnI);
      pJQ.Dne(xHL);
      pJQ.ceE = 0.0F;
      String str = KGL.Dne("gameMode." + xHL.Dne());
      if (pJQ != paramgnI) {
        Dne(paramgnI, 1, "commands.gamemode.success.other", new Object[] { pJQ.Dne(), str });
      } else {
        Dne(paramgnI, 1, "commands.gamemode.success.self", new Object[] { str });
      } 
    } else {
      throw new fxw("commands.gamemode.usage", new Object[0]);
    } 
  }
  
  protected String[] Dne() {
    return Jwh.Dne().Dne();
  }
  
  protected XHL Dne(gnI paramgnI, String paramString) {
    return (!paramString.equalsIgnoreCase(XHL.FWm.Dne()) && !paramString.equalsIgnoreCase("s")) ? ((!paramString.equalsIgnoreCase(XHL.bzF.Dne()) && !paramString.equalsIgnoreCase("c")) ? ((!paramString.equalsIgnoreCase(XHL.Qnq.Dne()) && !paramString.equalsIgnoreCase("a")) ? mrb.Dne(Dne(paramgnI, paramString, 0, (XHL.values()).length - 2)) : XHL.Qnq) : XHL.bzF) : XHL.FWm;
  }
  
  static {
  
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.gamemode.usage", new Object[0]);
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, new String[] { "survival", "creative", "adventure" }) : ((paramArrayOfString.length == 2) ? Dne(paramArrayOfString, Dne()) : null);
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 1);
  }
  
  public String Dne() {
    return "gamemode";
  }
  
  public int Dne() {
    return 2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sxo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */