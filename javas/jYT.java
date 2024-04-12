import java.util.List;

public class jYT extends zKP {
  private gDn Dne;
  
  private static final String[] FWm;
  
  public static final String[] Dne = new String[] { "default", "chiseled", "smooth" };
  
  private gDn[] Dne;
  
  private gDn FWm;
  
  public jYT(int paramInt) {
    super(paramInt, KFd.aFZ);
    Dne(JcN.Dne);
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt1 != 1 && (paramInt1 != 0 || (paramInt2 != 1 && paramInt2 != 2))) {
      if (paramInt1 == 0)
        return this.FWm; 
      if (paramInt2 < 0 || paramInt2 >= this.Dne.length)
        paramInt2 = 0; 
      return this.Dne[paramInt2];
    } 
    return (gDn)this.Dne;
  }
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[FWm.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne((String)FWm[b]); 
    this.Dne = (gDn[])paramRbp.Dne("sandstone_top");
    this.FWm = paramRbp.Dne("sandstone_bottom");
  }
  
  static {
    FWm = (gDn)new String[] { "sandstone_side", "sandstone_carved", "sandstone_smooth" };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jYT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */