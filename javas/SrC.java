import java.util.List;
import java.util.Random;

public class SrC extends ljW {
  private gDn Dne;
  
  private final Random Dne = new Random();
  
  private gDn FWm;
  
  private gDn bzF;
  
  public static int bzF(int paramInt) {
    return paramInt & 0x7;
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x8) != 8);
  }
  
  public int Dne() {
    return 38;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    float f = 0.125F;
    Dne(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    Dne(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    Dne(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (Random)paramRbp.Dne("hopper");
    this.FWm = paramRbp.Dne("hopper_top");
    this.bzF = paramRbp.Dne("hopper_inside");
  }
  
  public boolean Dne() {
    return false;
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = bzF(i);
    boolean bool1 = !paramQnq.kGO(paramInt1, paramInt2, paramInt3);
    boolean bool2 = Dne(i);
    if (bool1 != bool2)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j | (bool1 ? 0 : 8), 4); 
  }
  
  public boolean a_() {
    return true;
  }
  
  public static gDn Dne(String paramString) {
    return (paramString == "hopper") ? (gDn)((SrC)zKP.Dne).Dne : ((paramString == "hopper_inside") ? ((SrC)zKP.Dne).bzF : null);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    Aem aem = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    if (aem != null)
      paramFiG.Dne(aem); 
    return true;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.FWm : (gDn)this.Dne;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFUH, paramNMq);
    if (paramNMq.zGp()) {
      Aem aem = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
      aem.Dne(paramNMq.FWm());
    } 
  }
  
  public SrC(int paramInt) {
    super(paramInt, KFd.zGp);
    Dne(JcN.bzF);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public String Dne() {
    return "hopper";
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new Aem();
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Pdb.Dne(Dne(paramQnq, paramInt1, paramInt2, paramInt3));
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    Aem aem = (Aem)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (aem != null) {
      for (byte b = 0; b < aem.Qnq(); b++) {
        NMq nMq = aem.Dne(b);
        if (nMq != null) {
          float f1 = this.Dne.nextFloat() * 0.8F + 0.1F;
          float f2 = this.Dne.nextFloat() * 0.8F + 0.1F;
          float f3 = this.Dne.nextFloat() * 0.8F + 0.1F;
          while (nMq.Dne > 0) {
            int i = this.Dne.nextInt(21) + 10;
            if (i > nMq.Dne)
              i = nMq.Dne; 
            nMq.Dne -= i;
            JiM jiM = new JiM(paramQnq, (paramInt1 + f1), (paramInt2 + f2), (paramInt3 + f3), new NMq(nMq.bzF, i, nMq.Qnq()));
            if (nMq.aFZ())
              jiM.Dne().FWm((WkD)nMq.Dne().Dne()); 
            float f = 0.05F;
            jiM.XHL = ((float)this.Dne.nextGaussian() * f);
            jiM.Zpi = ((float)this.Dne.nextGaussian() * f + 0.2F);
            jiM.kGO = ((float)this.Dne.nextGaussian() * f);
            paramQnq.FWm(jiM);
          } 
        } 
      } 
      paramQnq.aFZ(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    boolean bool;
    String str = rrP.Dne[paramInt4];
    if (str == '\001')
      bool = false; 
    return bool;
  }
  
  public static Aem Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return (Aem)paramZpi.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SrC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */