import java.util.Iterator;
import java.util.Random;

public class gHK extends ljW {
  public final int Dne;
  
  private final Random Dne = new Random();
  
  public boolean bzF() {
    return (this.Dne == true);
  }
  
  public int Dne() {
    return 22;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm) {
      Dne(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
    } else if (paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm) {
      Dne(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
    } else if (paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm) {
      Dne(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    } else if (paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm) {
      Dne(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
    } else {
      Dne(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    } 
  }
  
  public MqS Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    isA isA;
    GON gON = (GON)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (gON == null)
      return null; 
    if (paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3))
      return null; 
    if (Qnq(paramQnq, paramInt1, paramInt2, paramInt3))
      return null; 
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm && (paramQnq.DyG(paramInt1 - 1, paramInt2 + 1, paramInt3) || Qnq(paramQnq, paramInt1 - 1, paramInt2, paramInt3)))
      return null; 
    if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm && (paramQnq.DyG(paramInt1 + 1, paramInt2 + 1, paramInt3) || Qnq(paramQnq, paramInt1 + 1, paramInt2, paramInt3)))
      return null; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm && (paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3 - 1) || Qnq(paramQnq, paramInt1, paramInt2, paramInt3 - 1)))
      return null; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm && (paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3 + 1) || Qnq(paramQnq, paramInt1, paramInt2, paramInt3 + 1)))
      return null; 
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm)
      isA = new isA("container.chestDouble", (GON)paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3), gON); 
    if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm)
      isA = new isA("container.chestDouble", isA, (GON)paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3)); 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm)
      isA = new isA("container.chestDouble", (GON)paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1), isA); 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm)
      isA = new isA("container.chestDouble", isA, (GON)paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1)); 
    return isA;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1);
    int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1);
    int k = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3);
    int m = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3);
    if (i == this.FWm)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3 - 1); 
    if (j == this.FWm)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3 + 1); 
    if (k == this.FWm)
      bzF(paramQnq, paramInt1 - 1, paramInt2, paramInt3); 
    if (m == this.FWm)
      bzF(paramQnq, paramInt1 + 1, paramInt2, paramInt3); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    GON gON = (GON)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (gON != null) {
      for (byte b = 0; b < gON.Qnq(); b++) {
        NMq nMq = gON.Dne(b);
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
            float f = 0.05F;
            jiM.XHL = ((float)this.Dne.nextGaussian() * f);
            jiM.Zpi = ((float)this.Dne.nextGaussian() * f + 0.2F);
            jiM.kGO = ((float)this.Dne.nextGaussian() * f);
            if (nMq.aFZ())
              jiM.Dne().FWm((WkD)nMq.Dne().Dne()); 
            paramQnq.FWm(jiM);
          } 
        } 
      } 
      paramQnq.aFZ(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  private static boolean Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Iterator<kQo> iterator = paramQnq.Dne(kQo.class, bSp.Dne().Dne(paramInt1, (paramInt2 + 1), paramInt3, (paramInt1 + 1), (paramInt2 + 2), (paramInt3 + 1))).iterator();
    while (true) {
      if (!iterator.hasNext())
        return false; 
      kQo kQo2 = iterator.next();
      kQo kQo1 = kQo2;
      if (kQo1.ICU())
        return true; 
    } 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 1) ? Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4) : 0;
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new GON();
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    GON gON = (GON)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (gON != null)
      gON.Qnq(); 
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Pdb.Dne(Dne(paramQnq, paramInt1, paramInt2, paramInt3));
  }
  
  protected gHK(int paramInt1, int paramInt2) {
    super(paramInt1, KFd.Qnq);
    this.Dne = paramInt2;
    Dne(JcN.FWm);
    Dne(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (paramQnq.Dne(paramInt1, paramInt2, paramInt3) != this.FWm) ? false : ((paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm) ? true : ((paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm) ? true : ((paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm) ? true : ((paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm)))));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1);
    int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1);
    int k = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3);
    int m = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3);
    byte b = 0;
    int n = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    if (n == 0)
      b = 2; 
    if (n == 1)
      b = 5; 
    if (n == 2)
      b = 3; 
    if (n == 3)
      b = 4; 
    if (i != this.FWm && j != this.FWm && k != this.FWm && m != this.FWm) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 3);
    } else {
      if ((i == this.FWm || j == this.FWm) && (b == 4 || b == 5)) {
        if (i == this.FWm) {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1, b, 3);
        } else {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1, b, 3);
        } 
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 3);
      } 
      if ((k == this.FWm || m == this.FWm) && (b == 2 || b == 3)) {
        if (k == this.FWm) {
          paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3, b, 3);
        } else {
          paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3, b, 3);
        } 
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 3);
      } 
    } 
    if (paramNMq.zGp())
      ((GON)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne(paramNMq.FWm()); 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    byte b = 0;
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm)
      b++; 
    if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm)
      b++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm)
      b++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm)
      b++; 
    return (b > 1) ? false : (bzF(paramQnq, paramInt1 - 1, paramInt2, paramInt3) ? false : (bzF(paramQnq, paramInt1 + 1, paramInt2, paramInt3) ? false : (bzF(paramQnq, paramInt1, paramInt2, paramInt3 - 1) ? false : (!bzF(paramQnq, paramInt1, paramInt2, paramInt3 + 1)))));
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null) {
      byte b;
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1);
      int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1);
      int k = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3);
      int m = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3);
      boolean bool = true;
      if (i != this.FWm && j != this.FWm) {
        if (k != this.FWm && m != this.FWm) {
          b = 3;
          if (zKP.FWm[i] != null && zKP.FWm[j] == null)
            b = 3; 
          if (zKP.FWm[j] != null && zKP.FWm[i] == null)
            b = 2; 
          if (zKP.FWm[k] != null && zKP.FWm[m] == null)
            b = 5; 
          if (zKP.FWm[m] != null && zKP.FWm[k] == null)
            b = 4; 
        } else {
          int i2;
          int n = paramQnq.Dne((k == this.FWm) ? (paramInt1 - 1) : (paramInt1 + 1), paramInt2, paramInt3 - 1);
          int i1 = paramQnq.Dne((k == this.FWm) ? (paramInt1 - 1) : (paramInt1 + 1), paramInt2, paramInt3 + 1);
          b = 3;
          boolean bool1 = true;
          if (k == this.FWm) {
            i2 = paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3);
          } else {
            i2 = paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3);
          } 
          if (i2 == 2)
            b = 2; 
          if ((zKP.FWm[i] != null || zKP.FWm[n] != null) && zKP.FWm[j] == null && zKP.FWm[i1] == null)
            b = 3; 
          if ((zKP.FWm[j] != null || zKP.FWm[i1] != null) && zKP.FWm[i] == null && zKP.FWm[n] == null)
            b = 2; 
        } 
      } else {
        int i2;
        int n = paramQnq.Dne(paramInt1 - 1, paramInt2, (i == this.FWm) ? (paramInt3 - 1) : (paramInt3 + 1));
        int i1 = paramQnq.Dne(paramInt1 + 1, paramInt2, (i == this.FWm) ? (paramInt3 - 1) : (paramInt3 + 1));
        b = 5;
        boolean bool1 = true;
        if (i == this.FWm) {
          i2 = paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1);
        } else {
          i2 = paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1);
        } 
        if (i2 == 4)
          b = 4; 
        if ((zKP.FWm[k] != null || zKP.FWm[n] != null) && zKP.FWm[m] == null && zKP.FWm[i1] == null)
          b = 5; 
        if ((zKP.FWm[m] != null || zKP.FWm[i1] != null) && zKP.FWm[k] == null && zKP.FWm[n] == null)
          b = 4; 
      } 
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 3);
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    MqS mqS = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    if (mqS != null)
      paramFiG.Dne(mqS); 
    return true;
  }
  
  public boolean a_() {
    return true;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("wood");
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!bzF())
      return 0; 
    float f = ((GON)paramZpi.Dne(paramInt1, paramInt2, paramInt3)).Dne;
    return geR.Dne(f, 0, 15);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gHK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */