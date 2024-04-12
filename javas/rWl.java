import java.util.List;

public class rWl extends xZE {
  private static final String[] Dne = new String[] { "options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard" };
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length > 0) {
      int i = Dne(paramgnI, paramArrayOfString[0]);
      Jwh.Dne().FWm(i);
      String str = KGL.Dne(Dne[i]);
      Dne(paramgnI, "commands.difficulty.success", new Object[] { str });
    } else {
      throw new fxw("commands.difficulty.usage", new Object[0]);
    } 
  }
  
  public int Dne() {
    return 2;
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.difficulty.usage", new Object[0]);
  }
  
  protected int Dne(gnI paramgnI, String paramString) {
    return (!paramString.equalsIgnoreCase("peaceful") && !paramString.equalsIgnoreCase("p")) ? ((!paramString.equalsIgnoreCase("easy") && !paramString.equalsIgnoreCase("e")) ? ((!paramString.equalsIgnoreCase("normal") && !paramString.equalsIgnoreCase("n")) ? ((!paramString.equalsIgnoreCase("hard") && !paramString.equalsIgnoreCase("h")) ? Dne(paramgnI, paramString, 0, 3) : 3) : 2) : 1) : 0;
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, new String[] { "peaceful", "easy", "normal", "hard" }) : null;
  }
  
  public String Dne() {
    return "difficulty";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rWl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */