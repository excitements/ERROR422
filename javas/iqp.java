import java.util.Random;

public class iqp extends zKP {
  private int[] Dne;
  
  private int[] Qnq = new int[256];
  
  private gDn[] Dne = (gDn[])new int[256];
  
  public gDn Dne(int paramInt) {
    return this.Dne[paramInt];
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return FWm(paramQnq, paramInt1 + 1, paramInt2, paramInt3) ? true : (FWm(paramQnq, paramInt1 - 1, paramInt2, paramInt3) ? true : (FWm(paramQnq, paramInt1, paramInt2 - 1, paramInt3) ? true : (FWm(paramQnq, paramInt1, paramInt2 + 1, paramInt3) ? true : (FWm(paramQnq, paramInt1, paramInt2, paramInt3 - 1) ? true : FWm(paramQnq, paramInt1, paramInt2, paramInt3 + 1)))));
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[] { paramRbp.Dne("fire_0"), paramRbp.Dne("fire_1") };
  }
  
  public void FWm() {
    Dne(((zKP)zKP.Qnq).FWm, 5, 20);
    Dne(zKP.bzF.FWm, 5, 20);
    Dne(((dNT)zKP.Qnq).FWm, 5, 20);
    Dne(zKP.sly.FWm, 5, 20);
    Dne(zKP.One.FWm, 5, 20);
    Dne(zKP.Kvh.FWm, 5, 20);
    Dne(zKP.CLK.FWm, 5, 20);
    Dne(zKP.FUM.FWm, 5, 20);
    Dne(zKP.udO.FWm, 5, 5);
    Dne(((VOy)zKP.Dne).FWm, 30, 60);
    Dne(zKP.AgF.FWm, 30, 20);
    Dne(zKP.qXo.FWm, 15, 100);
    Dne(((Tte)zKP.Dne).FWm, 60, 100);
    Dne(zKP.RPx.FWm, 30, 60);
    Dne(zKP.ipf.FWm, 15, 100);
    if (eCD.Dne(1000) == 0)
      Dne(((iqp)zKP.Dne).FWm, 1, 10); 
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramRandom.nextInt(24) == 0)
      paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "fire.fire", 1.0F + paramRandom.nextFloat(), paramRandom.nextFloat() * 0.7F + 0.3F, false); 
    if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && !zKP.Dne.FWm(paramQnq, paramInt1, paramInt2 - 1, paramInt3)) {
      if (zKP.Dne.FWm(paramQnq, paramInt1 - 1, paramInt2, paramInt3))
        for (byte b = 0; b < 2; b++) {
          float f1 = paramInt1 + paramRandom.nextFloat() * 0.1F;
          float f2 = paramInt2 + paramRandom.nextFloat();
          float f3 = paramInt3 + paramRandom.nextFloat();
          paramQnq.Dne("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
        }  
      if (zKP.Dne.FWm(paramQnq, paramInt1 + 1, paramInt2, paramInt3))
        for (byte b = 0; b < 2; b++) {
          float f1 = (paramInt1 + 1) - paramRandom.nextFloat() * 0.1F;
          float f2 = paramInt2 + paramRandom.nextFloat();
          float f3 = paramInt3 + paramRandom.nextFloat();
          paramQnq.Dne("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
        }  
      if (zKP.Dne.FWm(paramQnq, paramInt1, paramInt2, paramInt3 - 1))
        for (byte b = 0; b < 2; b++) {
          float f1 = paramInt1 + paramRandom.nextFloat();
          float f2 = paramInt2 + paramRandom.nextFloat();
          float f3 = paramInt3 + paramRandom.nextFloat() * 0.1F;
          paramQnq.Dne("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
        }  
      if (zKP.Dne.FWm(paramQnq, paramInt1, paramInt2, paramInt3 + 1))
        for (byte b = 0; b < 2; b++) {
          float f1 = paramInt1 + paramRandom.nextFloat();
          float f2 = paramInt2 + paramRandom.nextFloat();
          float f3 = (paramInt3 + 1) - paramRandom.nextFloat() * 0.1F;
          paramQnq.Dne("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
        }  
      if (zKP.Dne.FWm(paramQnq, paramInt1, paramInt2 + 1, paramInt3))
        for (byte b = 0; b < 2; b++) {
          float f1 = paramInt1 + paramRandom.nextFloat();
          float f2 = (paramInt2 + 1) - paramRandom.nextFloat() * 0.1F;
          float f3 = paramInt3 + paramRandom.nextFloat();
          paramQnq.Dne("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
        }  
    } else {
      for (byte b = 0; b < 3; b++) {
        float f1 = paramInt1 + paramRandom.nextFloat();
        float f2 = paramInt2 + paramRandom.nextFloat() * 0.5F + 0.5F;
        float f3 = paramInt3 + paramRandom.nextFloat();
        paramQnq.Dne("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  public boolean DyG() {
    return false;
  }
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne[paramInt1] = paramInt2;
    this.Qnq[paramInt1] = paramInt3;
  }
  
  public int Dne() {
    return 3;
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public int Dne(Qnq paramQnq) {
    return 30;
  }
  
  public boolean FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return (this.Dne[paramZpi.Dne(paramInt1, paramInt2, paramInt3)] > null);
  }
  
  public boolean zGp() {
    return false;
  }
  
  private int bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = false;
    if (!paramQnq.Dne(paramInt1, paramInt2, paramInt3))
      return 0; 
    null = FWm(paramQnq, paramInt1 + 1, paramInt2, paramInt3, bool);
    null = FWm(paramQnq, paramInt1 - 1, paramInt2, paramInt3, null);
    null = FWm(paramQnq, paramInt1, paramInt2 - 1, paramInt3, null);
    null = FWm(paramQnq, paramInt1, paramInt2 + 1, paramInt3, null);
    null = FWm(paramQnq, paramInt1, paramInt2, paramInt3 - 1, null);
    return FWm(paramQnq, paramInt1, paramInt2, paramInt3 + 1, null);
  }
  
  private void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom, int paramInt5) {
    int i = this.Qnq[paramQnq.Dne(paramInt1, paramInt2, paramInt3)];
    if (paramRandom.nextInt(paramInt4) < i) {
      boolean bool = (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == zKP.qXo.FWm) ? true : false;
      if (paramRandom.nextInt(paramInt5 + 10) < 5 && !paramQnq.udO(paramInt1, paramInt2, paramInt3)) {
        int j = paramInt5 + paramRandom.nextInt(5) / 4;
        if (j > 15)
          j = 15; 
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, j, 3);
      } else {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
      if (bool)
        zKP.qXo.bzF(paramQnq, paramInt1, paramInt2, paramInt3, 1); 
    } 
  }
  
  public int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    gDn gDn1 = this.Dne[paramQnq.Dne(paramInt1, paramInt2, paramInt3)];
    return (gDn1 > paramInt4) ? gDn1 : paramInt4;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (((Jik)paramQnq.Dne).Dne > 0 || paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) != zKP.cot.FWm || !zKP.Dne.bzF(paramQnq, paramInt1, paramInt2, paramInt3))
      if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && !bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } else {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq) + paramQnq.Dne.nextInt(10));
      }  
  }
  
  public boolean Dne() {
    return false;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return this.Dne[0];
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.Dne().Dne("doFireTick")) {
      boolean bool = (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == zKP.KLR.FWm) ? true : false;
      if (paramQnq.Dne instanceof TKg && paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == zKP.zGp.FWm)
        bool = true; 
      if (!Dne(paramQnq, paramInt1, paramInt2, paramInt3))
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
      if (!bool && paramQnq.bzF() && (paramQnq.udO(paramInt1, paramInt2, paramInt3) || paramQnq.udO(paramInt1 - 1, paramInt2, paramInt3) || paramQnq.udO(paramInt1 + 1, paramInt2, paramInt3) || paramQnq.udO(paramInt1, paramInt2, paramInt3 - 1) || paramQnq.udO(paramInt1, paramInt2, paramInt3 + 1))) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } else {
        int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
        if (i < 15)
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i + paramRandom.nextInt(3) / 2, 4); 
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq) + paramRandom.nextInt(10));
        if (!bool && !bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
          if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) || i > 3)
            paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
        } else if (!bool && !FWm(paramQnq, paramInt1, paramInt2 - 1, paramInt3) && i == 15 && paramRandom.nextInt(4) == 0) {
          paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        } else {
          boolean bool1 = paramQnq.ooe(paramInt1, paramInt2, paramInt3);
          byte b = 0;
          if (bool1)
            b = -50; 
          Dne(paramQnq, paramInt1 + 1, paramInt2, paramInt3, 300 + b, paramRandom, i);
          Dne(paramQnq, paramInt1 - 1, paramInt2, paramInt3, 300 + b, paramRandom, i);
          Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, 250 + b, paramRandom, i);
          Dne(paramQnq, paramInt1, paramInt2 + 1, paramInt3, 250 + b, paramRandom, i);
          Dne(paramQnq, paramInt1, paramInt2, paramInt3 - 1, 300 + b, paramRandom, i);
          Dne(paramQnq, paramInt1, paramInt2, paramInt3 + 1, 300 + b, paramRandom, i);
          for (int j = paramInt1 - 1; j <= paramInt1 + 1; j++) {
            for (int k = paramInt3 - 1; k <= paramInt3 + 1; k++) {
              for (int m = paramInt2 - 1; m <= paramInt2 + 4; m++) {
                if (j != paramInt1 || m != paramInt2 || k != paramInt3) {
                  int n = 100;
                  if (m > paramInt2 + 1)
                    n += (m - paramInt2 + 1) * 100; 
                  int i1 = bzF(paramQnq, j, m, k);
                  if (i1 > 0) {
                    int i2 = (i1 + 40 + paramQnq.aFZ * 7) / (i + 30);
                    if (bool1)
                      i2 /= 2; 
                    if (i2 > 0 && paramRandom.nextInt(n) <= i2 && (!paramQnq.bzF() || !paramQnq.udO(j, m, k)) && !paramQnq.udO(j - 1, m, paramInt3) && !paramQnq.udO(j + 1, m, k) && !paramQnq.udO(j, m, k - 1) && !paramQnq.udO(j, m, k + 1)) {
                      int i3 = i + paramRandom.nextInt(5) / 4;
                      if (i3 > 15)
                        i3 = 15; 
                      paramQnq.FWm(j, m, k, this.FWm, i3, 3);
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) || bzF(paramQnq, paramInt1, paramInt2, paramInt3));
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && !bzF(paramQnq, paramInt1, paramInt2, paramInt3))
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
  }
  
  protected iqp(int paramInt) {
    super(paramInt, KFd.ooe);
    Dne(true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */