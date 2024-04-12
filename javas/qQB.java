import java.util.List;

public class qQB extends ZgW {
  private gDn[] Dne;
  
  public int Dne = false;
  
  private static final String[] FWm;
  
  public static final String[] Dne = new String[] { "intact", "slightlyDamaged", "veryDamaged" };
  
  protected void Dne(CiF paramCiF) {
    paramCiF.FWm(true);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramQnq.Qnq(1022, paramInt1, paramInt2, paramInt3, 0);
  }
  
  static {
    FWm = new String[] { "anvil_top", "anvil_top_damaged_1", "anvil_top_damaged_2" };
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    paramFiG.FWm(paramInt1, paramInt2, paramInt3);
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3) >> 2;
    i = ++i % 4;
    if (i == 0)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x2 | j << 2, 2); 
    if (i == 1)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x3 | j << 2, 2); 
    if (i == 2)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x0 | j << 2, 2); 
    if (i == 3)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x1 | j << 2, 2); 
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("anvil_base");
    this.Dne = (String[])new gDn[FWm.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = (String)paramRbp.Dne(FWm[b]); 
  }
  
  public int Dne() {
    return 35;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x3;
    if (i != 3 && i != 1) {
      Dne(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
    } else {
      Dne(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
    } 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (this.Dne == 3 && paramInt1 == 1) {
      int i = (paramInt2 >> 2) % this.Dne.length;
      return (gDn)this.Dne[i];
    } 
    return this.Qnq;
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return true;
  }
  
  protected qQB(int paramInt) {
    super(paramInt, KFd.DyG);
    Dne(0);
    Dne(JcN.FWm);
  }
  
  public int Dne(int paramInt) {
    return paramInt >> 2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qQB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */