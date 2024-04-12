import java.util.ArrayList;
import java.util.List;

public class khp extends xZE {
  static {
  
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.op.usage", new Object[0]);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1 && paramArrayOfString[0].length() > 0) {
      Jwh.Dne().Dne().Dne(paramArrayOfString[0]);
      Dne(paramgnI, "commands.op.success", new Object[] { paramArrayOfString[0] });
    } else {
      throw new fxw("commands.op.usage", new Object[0]);
    } 
  }
  
  public int Dne() {
    return 3;
  }
  
  public String Dne() {
    return "op";
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1) {
      String str = paramArrayOfString[paramArrayOfString.length - 1];
      ArrayList<String> arrayList = new ArrayList();
      for (String str1 : Jwh.Dne().Dne()) {
        if (!Jwh.Dne().Dne().FWm(str1) && Dne(str, str1))
          arrayList.add(str1); 
      } 
      return arrayList;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\khp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */