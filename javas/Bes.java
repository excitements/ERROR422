import java.util.List;

public class Bes extends dEr {
  private gDn FWm;
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    for (FMM fMM : Klb.Dne.values())
      paramList.add(new NMq(paramInt, 1, fMM.Dne)); 
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.FWm = paramRbp.Dne("monsterPlacer_overlay");
  }
  
  public String Qnq(NMq paramNMq) {
    String str1 = ("" + KGL.Dne(FWm() + ".name")).trim();
    String str2 = Klb.Dne(paramNMq.Qnq());
    if (str2 != null)
      str1 = str1 + " " + KGL.Dne("entity." + str2 + ".name"); 
    return str1;
  }
  
  public static sMa Dne(Qnq paramQnq, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
    if (!Klb.Dne.containsKey(Integer.valueOf(paramInt)))
      return null; 
    sMa sMa = null;
    for (byte b = 0; b < 1; b++) {
      sMa = Klb.Dne(paramInt, paramQnq);
      if (sMa != null && sMa instanceof FUH) {
        FUH fUH = (FUH)sMa;
        sMa.FWm(paramDouble1, paramDouble2, paramDouble3, geR.aFZ(paramQnq.Dne.nextFloat() * 360.0F), 0.0F);
        fUH.vSL = fUH.mrb;
        fUH.IjH = fUH.mrb;
        fUH.ICU();
        paramQnq.FWm(sMa);
        fUH.yMz();
      } 
    } 
    return sMa;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 > 0) ? this.FWm : super.Dne(paramInt1, paramInt2);
  }
  
  public int Dne(NMq paramNMq, int paramInt) {
    FMM fMM = (FMM)Klb.Dne.get(Integer.valueOf(paramNMq.Qnq()));
    return (fMM != null) ? ((paramInt == 0) ? fMM.FWm : fMM.bzF) : 16777215;
  }
  
  public boolean Dne() {
    return true;
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    paramInt1 += rrP.FWm[paramInt4];
    paramInt2 += rrP.bzF[paramInt4];
    paramInt3 += rrP.Qnq[paramInt4];
    double d = 0.0D;
    if (paramInt4 == 1 && zKP.Dne[i] != null && zKP.Dne[i].Dne() == 11)
      d = 0.5D; 
    sMa sMa = Dne(paramQnq, paramNMq.Qnq(), paramInt1 + 0.5D, paramInt2 + d, paramInt3 + 0.5D);
    if (sMa != null) {
      if (sMa instanceof FUH && paramNMq.zGp())
        ((FUH)sMa).Qnq(paramNMq.FWm()); 
      if (!((uqg)paramFiG.Dne).Qnq)
        paramNMq.Dne--; 
    } 
    return true;
  }
  
  public Bes(int paramInt) {
    super(paramInt);
    Dne(true);
    Dne(JcN.aFZ);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Bes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */