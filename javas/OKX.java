import java.util.List;

public class OKX extends zKP {
  public static final String[] FWm;
  
  private gDn[] Dne;
  
  public static final String[] Dne = new String[] { "oak", "spruce", "birch", "jungle" };
  
  public OKX(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(JcN.Dne);
  }
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  static {
    FWm = new String[] { "wood", "wood_spruce", "wood_birch", "wood_jungle" };
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt2 < 0 || paramInt2 >= this.Dne.length)
      paramInt2 = 0; 
    return (gDn)this.Dne[paramInt2];
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (String[])new gDn[FWm.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = (String)paramRbp.Dne(FWm[b]); 
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
    paramList.add(new NMq(paramInt, 1, 3));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OKX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */