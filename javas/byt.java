import java.util.Random;

public abstract class byt extends zKP {
  private gDn[] Dne;
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 != 0 && paramInt1 != 1) ? this.Dne[1] : this.Dne[0];
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    KFd kFd = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return (kFd == this.Dne) ? false : ((paramInt4 == 1) ? true : ((kFd == KFd.FfS) ? false : super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4)));
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne != KFd.div)
      return 16777215; 
    int i = 0;
    int j = 0;
    int k = 0;
    for (byte b = -1; b <= 1; b++) {
      for (byte b1 = -1; b1 <= 1; b1++) {
        int m = (paramZpi.Dne(paramInt1 + b1, paramInt3 + b)).bzF;
        i += (m & 0xFF0000) >> 16;
        j += (m & 0xFF00) >> 8;
        k += m & 0xFF;
      } 
    } 
    return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public int Dne(Qnq paramQnq) {
    return (this.Dne == KFd.div) ? 5 : ((this.Dne == KFd.IjH) ? (((Jik)paramQnq.Dne).FWm ? 10 : 30) : 0);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return (this.Dne != KFd.IjH);
  }
  
  protected int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (paramZpi.Dne(paramInt1, paramInt2, paramInt3) != this.Dne)
      return -1; 
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if (i >= 8)
      i = 0; 
    return i;
  }
  
  public int bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3, 0);
    int j = paramZpi.Dne(paramInt1, paramInt2 + 1, paramInt3, 0);
    int k = i & 0xFF;
    int m = j & 0xFF;
    int n = i >> 16 & 0xFF;
    int i1 = j >> 16 & 0xFF;
    return ((k > m) ? k : m) | ((n > i1) ? n : i1) << 16;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return 0;
  }
  
  public boolean FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    KFd kFd = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return (kFd == this.Dne) ? false : ((paramInt4 == 1) ? true : ((kFd == KFd.FfS) ? false : super.FWm(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4)));
  }
  
  protected byt(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
    float f1 = 0.0F;
    float f2 = 0.0F;
    Dne(0.0F + f2, 0.0F + f1, 0.0F + f2, 1.0F + f2, 1.0F + f1, 1.0F + f2);
    Dne(true);
  }
  
  public int a_() {
    return (this.Dne == KFd.div) ? 1 : 0;
  }
  
  private chN Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    null = paramZpi.Dne().Dne(0.0D, 0.0D, 0.0D);
    int i = FWm(paramZpi, paramInt1, paramInt2, paramInt3);
    byte b;
    for (b = 0; b < 4; b++) {
      int j = paramInt1;
      int k = paramInt3;
      if (b == 0)
        j = paramInt1 - 1; 
      if (b == 1)
        k = paramInt3 - 1; 
      if (b == 2)
        j++; 
      if (b == 3)
        k++; 
      int m = FWm(paramZpi, j, paramInt2, k);
      if (m < 0) {
        if (!paramZpi.Dne(j, paramInt2, k).bzF()) {
          m = FWm(paramZpi, j, paramInt2 - 1, k);
          if (m >= 0) {
            int n = m - i - 8;
            null = null.bzF(((j - paramInt1) * n), ((paramInt2 - paramInt2) * n), ((k - paramInt3) * n));
          } 
        } 
      } else if (m >= 0) {
        int n = m - i;
        null = null.bzF(((j - paramInt1) * n), ((paramInt2 - paramInt2) * n), ((k - paramInt3) * n));
      } 
    } 
    if (paramZpi.bzF(paramInt1, paramInt2, paramInt3) >= 8) {
      b = 0;
      if (b != 0 || FWm(paramZpi, paramInt1, paramInt2, paramInt3 - 1, 2))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1, paramInt2, paramInt3 + 1, 3))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1 - 1, paramInt2, paramInt3, 4))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1 + 1, paramInt2, paramInt3, 5))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1, paramInt2 + 1, paramInt3 - 1, 2))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1, paramInt2 + 1, paramInt3 + 1, 3))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1 - 1, paramInt2 + 1, paramInt3, 4))
        b = 1; 
      if (b != 0 || FWm(paramZpi, paramInt1 + 1, paramInt2 + 1, paramInt3, 5))
        b = 1; 
      if (b != 0)
        null = null.Dne().bzF(0.0D, -6.0D, 0.0D); 
    } 
    return null.Dne();
  }
  
  public static gDn Dne(String paramString) {
    return (paramString == "water") ? ((byt)zKP.Dne).Dne[0] : ((paramString == "water_flow") ? ((byt)zKP.Dne).Dne[1] : ((paramString == "lava") ? ((byt)zKP.FWm).Dne[0] : ((paramString == "lava_flow") ? ((byt)zKP.FWm).Dne[1] : null)));
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public void Dne(Rbp paramRbp) {
    if (this.Dne == KFd.IjH) {
      this.Dne = new gDn[] { paramRbp.Dne("lava"), paramRbp.Dne("lava_flow") };
    } else {
      this.Dne = new gDn[] { paramRbp.Dne("water"), paramRbp.Dne("water_flow") };
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  protected int bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.Dne) ? paramQnq.bzF(paramInt1, paramInt2, paramInt3) : -1;
  }
  
  public boolean Dne(int paramInt, boolean paramBoolean) {
    return (paramBoolean && paramInt == 0);
  }
  
  public static double Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, KFd paramKFd) {
    chN chN = null;
    if (paramKFd == KFd.div)
      chN = zKP.Dne.Dne(paramZpi, paramInt1, paramInt2, paramInt3); 
    if (paramKFd == KFd.IjH)
      chN = zKP.FWm.Dne(paramZpi, paramInt1, paramInt2, paramInt3); 
    return (chN.Dne == 0.0D && chN.bzF == 0.0D) ? -1000.0D : (Math.atan2(chN.bzF, chN.Dne) - 1.5707963267948966D);
  }
  
  public int b_() {
    return 16777215;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  protected void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "random.fizz", 0.5F, 2.6F + (paramQnq.Dne.nextFloat() - paramQnq.Dne.nextFloat()) * 0.8F);
    for (byte b = 0; b < 8; b++)
      paramQnq.Dne("largesmoke", paramInt1 + Math.random(), paramInt2 + 1.2D, paramInt3 + Math.random(), 0.0D, 0.0D, 0.0D); 
  }
  
  public int Dne() {
    return 4;
  }
  
  public float Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    float f1 = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    float f2 = paramZpi.Dne(paramInt1, paramInt2 + 1, paramInt3);
    return (f1 > f2) ? f1 : f2;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa, chN paramchN) {
    chN chN1 = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    paramchN.Dne += chN1.Dne;
    paramchN.FWm += chN1.FWm;
    paramchN.bzF += chN1.bzF;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne == KFd.div) {
      if (paramRandom.nextInt(10) == 0) {
        int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
        if (i <= 0 || i >= 8)
          paramQnq.Dne("suspended", (paramInt1 + paramRandom.nextFloat()), (paramInt2 + paramRandom.nextFloat()), (paramInt3 + paramRandom.nextFloat()), 0.0D, 0.0D, 0.0D); 
      } 
      for (byte b = 0; b; b++) {
        int i = paramRandom.nextInt(4);
        int j = paramInt1;
        int k = paramInt3;
        if (i == 0)
          j = paramInt1 - 1; 
        if (i == 1)
          j++; 
        if (i == 2)
          k = paramInt3 - 1; 
        if (i == 3)
          k++; 
        if (paramQnq.Dne(j, paramInt2, k) == KFd.Dne && (paramQnq.Dne(j, paramInt2 - 1, k).bzF() || paramQnq.Dne(j, paramInt2 - 1, k).Qnq())) {
          float f = 0.0625F;
          double d1 = (paramInt1 + paramRandom.nextFloat());
          double d2 = (paramInt2 + paramRandom.nextFloat());
          double d3 = (paramInt3 + paramRandom.nextFloat());
          if (i == 0)
            d1 = (paramInt1 - f); 
          if (i == 1)
            d1 = ((paramInt1 + 1) + f); 
          if (i == 2)
            d3 = (paramInt3 - f); 
          if (i == 3)
            d3 = ((paramInt3 + 1) + f); 
          double d4 = 0.0D;
          double d5 = 0.0D;
          if (i == 0)
            d4 = -f; 
          if (i == 1)
            d4 = f; 
          if (i == 2)
            d5 = -f; 
          if (i == 3)
            d5 = f; 
          paramQnq.Dne("splash", d1, d2, d3, d4, 0.0D, d5);
        } 
      } 
    } 
    if (this.Dne == KFd.div && paramRandom.nextInt(64) == 0) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if (i > 0 && i < 8)
        paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "liquid.water", paramRandom.nextFloat() * 0.25F + 0.75F, paramRandom.nextFloat() * 1.0F + 0.5F, false); 
    } 
    if (this.Dne == KFd.IjH && paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) == KFd.Dne && !paramQnq.zGp(paramInt1, paramInt2 + 1, paramInt3)) {
      if (paramRandom.nextInt(100) == 0) {
        double d1 = (paramInt1 + paramRandom.nextFloat());
        double d2 = paramInt2 + this.aFZ;
        double d3 = (paramInt3 + paramRandom.nextFloat());
        paramQnq.Dne("lava", d1, d2, d3, 0.0D, 0.0D, 0.0D);
        paramQnq.Dne(d1, d2, d3, "liquid.lavapop", 0.2F + paramRandom.nextFloat() * 0.2F, 0.9F + paramRandom.nextFloat() * 0.15F, false);
      } 
      if (paramRandom.nextInt(200) == 0)
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, "liquid.lava", 0.2F + paramRandom.nextFloat() * 0.2F, 0.9F + paramRandom.nextFloat() * 0.15F, false); 
    } 
    if (paramRandom.nextInt(10) == 0 && paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && !paramQnq.Dne(paramInt1, paramInt2 - 2, paramInt3).bzF()) {
      double d1 = (paramInt1 + paramRandom.nextFloat());
      double d2 = paramInt2 - 1.05D;
      double d3 = (paramInt3 + paramRandom.nextFloat());
      if (this.Dne == KFd.div) {
        paramQnq.Dne("dripWater", d1, d2, d3, 0.0D, 0.0D, 0.0D);
      } else {
        paramQnq.Dne("dripLava", d1, d2, d3, 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm && this.Dne == KFd.IjH) {
      boolean bool = false;
      if (bool || paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == KFd.div)
        bool = true; 
      if (bool || paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == KFd.div)
        bool = true; 
      if (bool || paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == KFd.div)
        bool = true; 
      if (bool || paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == KFd.div)
        bool = true; 
      if (bool || paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) == KFd.div)
        bool = true; 
      if (bool) {
        int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
        if (i == 0) {
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.cot.FWm);
        } else if (i <= 4) {
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.bzF.FWm);
        } 
        bzF(paramQnq, paramInt1, paramInt2, paramInt3);
      } 
    } 
  }
  
  public static float Dne(int paramInt) {
    if (paramInt >= 8)
      paramInt = 0; 
    return (paramInt + 1) / 9.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\byt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */