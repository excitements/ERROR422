import java.util.List;

public class yDl extends zKP {
  private gDn[] Dne;
  
  private static final String[] FWm;
  
  private gDn aFZ;
  
  public static final String[] Dne = new String[] { "default", "chiseled", "lines" };
  
  private gDn FWm;
  
  private gDn Dne;
  
  private gDn bzF;
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    if (paramInt5 == 2)
      switch (paramInt4) {
        case 0:
        case 1:
          paramInt5 = 2;
          break;
        case 2:
        case 3:
          paramInt5 = 4;
          break;
        case 4:
        case 5:
          paramInt5 = 3;
          break;
      }  
    return paramInt5;
  }
  
  static {
    FWm = (gDn)new String[] { "quartzblock_side", "quartzblock_chiseled", "quartzblock_lines", null, null };
  }
  
  protected NMq Dne(int paramInt) {
    return (paramInt != 3 && paramInt != 4) ? super.Dne(paramInt) : new NMq(this.FWm, 1, 2);
  }
  
  public yDl(int paramInt) {
    super(paramInt, KFd.aFZ);
    Dne(JcN.Dne);
  }
  
  public int Dne(int paramInt) {
    return (paramInt != 3 && paramInt != 4) ? paramInt : 2;
  }
  
  public int Dne() {
    return 39;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt2 != 2 && paramInt2 != 3 && paramInt2 != 4) {
      if (paramInt1 != 1 && (paramInt1 != 0 || paramInt2 != 1)) {
        if (paramInt1 == 0)
          return this.aFZ; 
        if (paramInt2 < 0 || paramInt2 >= this.Dne.length)
          paramInt2 = 0; 
        return this.Dne[paramInt2];
      } 
      return (paramInt2 == 1) ? this.Dne : this.bzF;
    } 
    return (paramInt2 == 2 && (paramInt1 == 1 || paramInt1 == 0)) ? this.FWm : ((paramInt2 == 3 && (paramInt1 == 5 || paramInt1 == 4)) ? this.FWm : ((paramInt2 == 4 && (paramInt1 == 2 || paramInt1 == 3)) ? this.FWm : this.Dne[paramInt2]));
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (gDn)new gDn[FWm.length];
    for (byte b = 0; b < this.Dne.length; b++) {
      if (FWm[b] == null) {
        this.Dne[b] = this.Dne[b - 1];
      } else {
        this.Dne[b] = paramRbp.Dne((String)FWm[b]);
      } 
    } 
    this.bzF = paramRbp.Dne("quartzblock_top");
    this.Dne = paramRbp.Dne("quartzblock_chiseled_top");
    this.FWm = paramRbp.Dne("quartzblock_lines_top");
    this.aFZ = paramRbp.Dne("quartzblock_bottom");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yDl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */