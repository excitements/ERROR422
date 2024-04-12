import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class giz extends xZE {
  public int Dne() {
    return 0;
  }
  
  protected List Dne(gnI paramgnI) {
    List<Comparable> list = Jwh.Dne().Dne().Dne(paramgnI);
    Collections.sort(list);
    return list;
  }
  
  public String Dne() {
    return "help";
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.help.usage", new Object[0]);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    byte b2;
    List<IMF> list = Dne(paramgnI);
    byte b1 = 7;
    int i = (list.size() - 1) / b1;
    boolean bool = false;
    try {
      b2 = (paramArrayOfString.length == 0) ? 0 : (Dne(paramgnI, paramArrayOfString[0], 1, i + 1) - 1);
    } catch (PUA pUA) {
      Map map = Dne();
      IMF iMF = (IMF)map.get(paramArrayOfString[0]);
      if (iMF != null)
        throw new fxw(iMF.Dne(paramgnI), new Object[0]); 
      throw new PKs();
    } 
    int j = Math.min((b2 + 1) * b1, list.size());
    paramgnI.Dne(Dne.bzF + paramgnI.Dne("commands.help.header", new Object[] { Integer.valueOf(b2 + 1), Integer.valueOf(i + 1) }));
    for (int k = b2 * b1; k < j; k++) {
      IMF iMF = list.get(k);
      paramgnI.Dne(iMF.Dne(paramgnI));
    } 
    if (b2 == 0 && paramgnI instanceof FiG)
      paramgnI.Dne(Dne.XHL + paramgnI.Dne("commands.help.footer", new Object[0])); 
  }
  
  static {
  
  }
  
  protected Map Dne() {
    return Jwh.Dne().Dne().Dne();
  }
  
  public List Dne() {
    return Arrays.asList(new String[] { "?" });
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\giz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */