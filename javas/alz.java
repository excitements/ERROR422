public class alz extends xZE {
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length != 1)
      throw new fxw("commands.testfor.usage", new Object[0]); 
    if (!(paramgnI instanceof FgE))
      throw new WoB("commands.testfor.failed", new Object[0]); 
    Dne(paramgnI, paramArrayOfString[0]);
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
  
  public int Dne() {
    return 2;
  }
  
  public String Dne() {
    return "testfor";
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\alz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */