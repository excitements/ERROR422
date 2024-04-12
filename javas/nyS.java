import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nyS extends dEr {
  public final String Dne;
  
  private static final Map Dne = new HashMap<>();
  
  public gDn Dne(int paramInt) {
    return (gDn)this.Dne;
  }
  
  public GXY Dne(NMq paramNMq) {
    return GXY.bzF;
  }
  
  protected nyS(int paramInt, String paramString) {
    super(paramInt);
    this.Dne = (Map)paramString;
    this.aFZ = 1;
    Dne(JcN.aFZ);
    Dne.put(paramString, this);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (Map)paramRbp.Dne("record_" + this.Dne);
  }
  
  public String Dne() {
    return "C418 - " + this.Dne;
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List<String> paramList, boolean paramBoolean) {
    paramList.add(Dne());
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == zKP.jBE.FWm && paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 0) {
      if (paramQnq.aFZ != null)
        return true; 
      ((VKe)zKP.jBE).Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramNMq);
      paramQnq.Dne((FiG)null, 1005, paramInt1, paramInt2, paramInt3, this.Qnq);
      paramNMq.Dne--;
      return true;
    } 
    return false;
  }
  
  public static nyS Dne(String paramString) {
    return (nyS)Dne.get(paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nyS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */