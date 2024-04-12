public class kSP extends Sxo {
  public String Dne() {
    return "defaultgamemode";
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.defaultgamemode.usage", new Object[0]);
  }
  
  static {
  
  }
  
  protected void Dne(XHL paramXHL) {
    Jwh.Dne().Dne(paramXHL);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length > 0) {
      XHL xHL = Dne(paramgnI, paramArrayOfString[0]);
      Dne(xHL);
      String str = KGL.Dne("gameMode." + xHL.Dne());
      Dne(paramgnI, "commands.defaultgamemode.success", new Object[] { str });
    } else {
      throw new fxw("commands.defaultgamemode.usage", new Object[0]);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kSP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */