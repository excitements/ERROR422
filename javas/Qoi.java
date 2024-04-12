public class Qoi extends dEr {
  public final int Dne;
  
  private gDn bzF;
  
  public final int FWm;
  
  private static final int[] Dne = new int[] { 11, 16, 15, 13 };
  
  private gDn FWm;
  
  private static final String[] FWm = new String[] { "helmetCloth_overlay", "chestplateCloth_overlay", "leggingsCloth_overlay", "bootsCloth_overlay" };
  
  private final TNy Dne;
  
  public final int bzF;
  
  public static final String[] Dne = new String[] { "slot_empty_helmet", "slot_empty_chestplate", "slot_empty_leggings", "slot_empty_boots" };
  
  private static final ClS Dne = new LhV();
  
  public boolean Dne(NMq paramNMq) {
    return (this.Dne != TNy.Dne) ? false : (!paramNMq.aFZ() ? false : (!paramNMq.Dne().Dne("display") ? false : paramNMq.Dne().Dne("display").Dne("color")));
  }
  
  public int Dne() {
    return this.Dne.Dne();
  }
  
  public Qoi(int paramInt1, TNy paramTNy, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.Dne = (ClS)paramTNy;
    this.Dne = paramInt3;
    this.bzF = paramInt2;
    this.FWm = paramTNy.FWm(paramInt3);
    FWm(paramTNy.Dne(paramInt3));
    this.aFZ = 1;
    Dne(JcN.IjH);
    CVd.Dne.Dne(this, Dne);
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    if (this.Dne == TNy.Dne)
      this.FWm = (String[])paramRbp.Dne(FWm[this.Dne]); 
    this.bzF = paramRbp.Dne((String)Dne[this.Dne]);
  }
  
  public boolean Dne(NMq paramNMq1, NMq paramNMq2) {
    return (this.Dne.FWm() == paramNMq2.bzF) ? true : super.Dne(paramNMq1, paramNMq2);
  }
  
  static int[] Dne() {
    return (int[])Dne;
  }
  
  public TNy Dne() {
    return (TNy)this.Dne;
  }
  
  public int Dne(NMq paramNMq, int paramInt) {
    if (paramInt > 0)
      return 16777215; 
    int i = Dne(paramNMq);
    if (i < 0)
      i = 16777215; 
    return i;
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    int i = FUH.Dne(paramNMq) - 1;
    NMq nMq = paramFiG.FWm(i);
    if (nMq == null) {
      paramFiG.a_(i, paramNMq.Dne());
      paramNMq.Dne = 0;
    } 
    return paramNMq;
  }
  
  public boolean Dne() {
    return (this.Dne == TNy.Dne);
  }
  
  public void Dne(NMq paramNMq, int paramInt) {
    if (this.Dne != TNy.Dne)
      throw new UnsupportedOperationException("Can't dye non-leather!"); 
    WkD wkD1 = paramNMq.Dne();
    if (wkD1 == null) {
      wkD1 = new WkD();
      paramNMq.FWm(wkD1);
    } 
    WkD wkD2 = wkD1.Dne("display");
    if (!wkD1.Dne("display"))
      wkD1.Dne("display", wkD2); 
    wkD2.Dne("color", paramInt);
  }
  
  public int Dne(NMq paramNMq) {
    if (this.Dne != TNy.Dne)
      return -1; 
    WkD wkD1 = paramNMq.Dne();
    if (wkD1 == null)
      return 10511680; 
    WkD wkD2 = wkD1.Dne("display");
    return (wkD2 == null) ? 10511680 : (wkD2.Dne("color") ? wkD2.Dne("color") : 10511680);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 == 1) ? (gDn)this.FWm : super.Dne(paramInt1, paramInt2);
  }
  
  public void Dne(NMq paramNMq) {
    if (this.Dne == TNy.Dne) {
      WkD wkD = paramNMq.Dne();
      if (wkD != null) {
        WkD wkD1 = wkD.Dne("display");
        if (wkD1.Dne("color"))
          wkD1.Dne("color"); 
      } 
    } 
  }
  
  public static gDn a_(int paramInt) {
    switch (paramInt) {
      case 0:
        return ((Qoi)dEr.kGO).bzF;
      case 1:
        return ((Qoi)dEr.udO).bzF;
      case 2:
        return ((Qoi)dEr.ooe).bzF;
      case 3:
        return dEr.trS.bzF;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Qoi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */