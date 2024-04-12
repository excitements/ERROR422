import java.util.Random;

public class Lsq extends kbN {
  public static final String[] Dne = new String[] { "cocoa_0", "cocoa_1", "cocoa_2" };
  
  private gDn[] Dne;
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    int i = c_(paramInt4);
    byte b1 = 1;
    if (i >= 2)
      b1 = 3; 
    for (byte b2 = 0; b2 < b1; b2++)
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(dEr.edi, 1, 3)); 
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.edi.Qnq;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[Dne.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne((String)Dne[b]); 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = ((geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3) + 0) % 4;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = Qnq(paramQnq.bzF(paramInt1, paramInt2, paramInt3));
    paramInt1 += zxJ.Dne[i];
    paramInt3 += zxJ.FWm[i];
    int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    return (j == zKP.udO.FWm && Tkf.bzF(paramQnq.bzF(paramInt1, paramInt2, paramInt3)) == 3);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    if (paramInt4 == 1 || paramInt4 == 0)
      paramInt4 = 2; 
    return zxJ.aFZ[zxJ.Qnq[paramInt4]];
  }
  
  public static int c_(int paramInt) {
    return (paramInt & 0xC) >> 2;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return this.Dne[2];
  }
  
  public boolean Dne() {
    return false;
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public int Dne() {
    return 28;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } else if (paramQnq.Dne.nextInt(5) == 0) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = c_(i);
      if (j < 2)
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, ++j << 2 | Qnq(i), 2); 
    } 
  }
  
  public int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return 3;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    int j = Qnq(i);
    int k = c_(i);
    int m = 4 + k * 2;
    int n = 5 + k * 2;
    float f = m / 2.0F;
    switch (j) {
      case 0:
        Dne((8.0F - f) / 16.0F, (12.0F - n) / 16.0F, (15.0F - m) / 16.0F, (8.0F + f) / 16.0F, 0.75F, 0.9375F);
        break;
      case 1:
        Dne(0.0625F, (12.0F - n) / 16.0F, (8.0F - f) / 16.0F, (1.0F + m) / 16.0F, 0.75F, (8.0F + f) / 16.0F);
        break;
      case 2:
        Dne((8.0F - f) / 16.0F, (12.0F - n) / 16.0F, 0.0625F, (8.0F + f) / 16.0F, 0.75F, (1.0F + m) / 16.0F);
        break;
      case 3:
        Dne((15.0F - m) / 16.0F, (12.0F - n) / 16.0F, (8.0F - f) / 16.0F, 0.9375F, 0.75F, (8.0F + f) / 16.0F);
        break;
    } 
  }
  
  public Lsq(int paramInt) {
    super(paramInt, KFd.XHL);
    Dne(true);
  }
  
  public gDn Dne(int paramInt) {
    if (paramInt < 0 || paramInt >= this.Dne.length)
      paramInt = this.Dne.length - 1; 
    return this.Dne[paramInt];
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lsq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */