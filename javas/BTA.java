import java.util.List;
import java.util.Random;

public class BTA extends zKP {
  private gDn bzF;
  
  private gDn FWm;
  
  private gDn Dne;
  
  public int Dne() {
    return 24;
  }
  
  public static gDn Dne(String paramString) {
    return (paramString == "cauldron_inner") ? ((BTA)zKP.Dne).Dne : ((paramString == "cauldron_bottom") ? ((BTA)zKP.Dne).bzF : null);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.yaZ.Qnq;
  }
  
  public void a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne.nextInt(20) == 1) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if (i < 3)
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i + 1, 2); 
    } 
  }
  
  public void Dne() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public BTA(int paramInt) {
    super(paramInt, KFd.zGp);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
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
    Dne();
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.yaZ.Qnq;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = paramRbp.Dne("cauldron_inner");
    this.FWm = paramRbp.Dne("cauldron_top");
    this.bzF = paramRbp.Dne("cauldron_bottom");
    this.Qnq = paramRbp.Dne("cauldron_side");
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.FWm : ((paramInt1 == 0) ? this.bzF : this.Qnq);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    NMq nMq = paramFiG.Dne.Dne();
    if (nMq == null)
      return true; 
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (nMq.bzF == dEr.cHy.Qnq) {
      if (i < 3) {
        if (!((uqg)paramFiG.Dne).Qnq)
          paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, new NMq(dEr.qMV)); 
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 3, 2);
      } 
      return true;
    } 
    if (nMq.bzF == dEr.OCU.Qnq) {
      if (i > 0) {
        NMq nMq1 = new NMq(dEr.Dne, 1, 0);
        if (!paramFiG.Dne.Dne(nMq1)) {
          paramQnq.FWm(new JiM(paramQnq, paramInt1 + 0.5D, paramInt2 + 1.5D, paramInt3 + 0.5D, nMq1));
        } else if (paramFiG instanceof PJQ) {
          ((PJQ)paramFiG).Dne(paramFiG.Dne);
        } 
        nMq.Dne--;
        if (nMq.Dne <= 0)
          paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, (NMq)null); 
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i - 1, 2);
      } 
    } else if (i > 0 && nMq.Dne() instanceof Qoi && ((Qoi)nMq.Dne()).Dne() == TNy.Dne) {
      Qoi qoi = (Qoi)nMq.Dne();
      qoi.Dne(nMq);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i - 1, 2);
      return true;
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BTA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */