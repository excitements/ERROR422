import java.util.Random;

public class XXJ extends ljW {
  private final boolean Dne;
  
  private static boolean zGp = false;
  
  private gDn Dne;
  
  private final Random Dne = new Random();
  
  private gDn FWm;
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    if (i == 0)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 2, 2); 
    if (i == 1)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 5, 2); 
    if (i == 2)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 3, 2); 
    if (i == 3)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 4, 2); 
    if (paramNMq.zGp())
      ((lqs)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne(paramNMq.FWm()); 
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return zKP.haP.FWm;
  }
  
  protected XXJ(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.aFZ);
    this.Dne = paramBoolean;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("furnace_side");
    this.FWm = paramRbp.Dne((this.Dne != null) ? "furnace_front_lit" : "furnace_front");
    this.Dne = (Random)paramRbp.Dne("furnace_top");
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Pdb.Dne((MqS)paramQnq.Dne(paramInt1, paramInt2, paramInt3));
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.haP.FWm;
  }
  
  public static void Dne(boolean paramBoolean, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    zGp = true;
    if (paramBoolean) {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.qrB.FWm);
    } else {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.haP.FWm);
    } 
    zGp = false;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
    if (ipD != null) {
      ipD.DyG();
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, ipD);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (!zGp) {
      lqs lqs = (lqs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      if (lqs != null) {
        for (byte b = 0; b < lqs.Qnq(); b++) {
          NMq nMq = lqs.Dne(b);
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
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne != null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      float f1 = paramInt1 + 0.5F;
      float f2 = paramInt2 + 0.0F + paramRandom.nextFloat() * 6.0F / 16.0F;
      float f3 = paramInt3 + 0.5F;
      float f4 = 0.52F;
      float f5 = paramRandom.nextFloat() * 0.6F - 0.3F;
      if (i == 4) {
        paramQnq.Dne("smoke", (f1 - f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
        paramQnq.Dne("flame", (f1 - f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
      } else if (i == 5) {
        paramQnq.Dne("smoke", (f1 + f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
        paramQnq.Dne("flame", (f1 + f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
      } else if (i == 2) {
        paramQnq.Dne("smoke", (f1 + f5), f2, (f3 - f4), 0.0D, 0.0D, 0.0D);
        paramQnq.Dne("flame", (f1 + f5), f2, (f3 - f4), 0.0D, 0.0D, 0.0D);
      } else if (i == 3) {
        paramQnq.Dne("smoke", (f1 + f5), f2, (f3 + f4), 0.0D, 0.0D, 0.0D);
        paramQnq.Dne("flame", (f1 + f5), f2, (f3 + f4), 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new lqs();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? (gDn)this.Dne : ((paramInt1 == 0) ? (gDn)this.Dne : ((paramInt1 != paramInt2) ? this.Qnq : this.FWm));
  }
  
  public boolean a_() {
    return true;
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1);
      int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1);
      int k = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3);
      int m = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3);
      byte b = 3;
      if (zKP.FWm[i] != null && zKP.FWm[j] == null)
        b = 3; 
      if (zKP.FWm[j] != null && zKP.FWm[i] == null)
        b = 2; 
      if (zKP.FWm[k] != null && zKP.FWm[m] == null)
        b = 5; 
      if (zKP.FWm[m] != null && zKP.FWm[k] == null)
        b = 4; 
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 2);
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    lqs lqs = (lqs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (lqs != null)
      paramFiG.Dne(lqs); 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XXJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */