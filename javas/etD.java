import java.util.Arrays;
import java.util.List;

public class etD extends xZE {
  public String Dne() {
    return "tell";
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return Dne(paramArrayOfString, Jwh.Dne().Dne());
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
  
  public List Dne() {
    return Arrays.asList(new String[] { "w", "msg" });
  }
  
  public int Dne() {
    return 0;
  }
  
  static {
  
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length < 2)
      throw new fxw("commands.message.usage", new Object[0]); 
    PJQ pJQ = Dne(paramgnI, paramArrayOfString[0]);
    if (pJQ == null)
      throw new FKZ(); 
    if (pJQ == paramgnI)
      throw new FKZ("commands.message.sameTarget", new Object[0]); 
    String str = Dne(paramgnI, paramArrayOfString, 1, !(paramgnI instanceof FiG));
    pJQ.Dne(Dne.div + "" + Dne.EyB + pJQ.Dne("commands.message.display.incoming", new Object[] { paramgnI.a_(), str }));
    paramgnI.Dne(Dne.div + "" + Dne.EyB + paramgnI.Dne("commands.message.display.outgoing", new Object[] { pJQ.a_(), str }));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\etD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */