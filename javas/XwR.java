import java.util.List;
import java.util.Random;

public class XwR implements ZfC {
  private double[] zGp;
  
  double[] Qnq;
  
  private double[] DyG;
  
  private xvE DyG = (xvE)new double[256];
  
  float[] Dne;
  
  public xvE bzF;
  
  private OdI[] Dne;
  
  private tMg Dne;
  
  private Khi Dne;
  
  public xvE FWm;
  
  double[] aFZ;
  
  private xvE zGp;
  
  double[] Dne;
  
  private xvE Qnq;
  
  private Kvh Dne;
  
  private Suj Dne;
  
  private Suj FWm;
  
  private xvE aFZ;
  
  private Random Dne;
  
  double[] FWm;
  
  private final boolean Dne;
  
  private cXw Dne;
  
  public xvE Dne;
  
  private Qnq Dne;
  
  double[] bzF;
  
  int[][] Dne = (int[][])new KLR();
  
  public qMV Dne(int paramInt1, int paramInt2) {
    this.Dne.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
    byte[] arrayOfByte1 = new byte[32768];
    Dne(paramInt1, paramInt2, arrayOfByte1);
    this.Dne = (int[][])this.Dne.Dne().FWm((OdI[])this.Dne, paramInt1 * 16, paramInt2 * 16, 16, 16);
    Dne(paramInt1, paramInt2, arrayOfByte1, (OdI[])this.Dne);
    this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, arrayOfByte1);
    this.FWm.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, arrayOfByte1);
    if (this.Dne != null) {
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, arrayOfByte1);
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, arrayOfByte1);
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, arrayOfByte1);
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, arrayOfByte1);
    } 
    qMV qMV = new qMV((Qnq)this.Dne, arrayOfByte1, paramInt1, paramInt2);
    byte[] arrayOfByte2 = qMV.Dne();
    for (byte b = 0; b < arrayOfByte2.length; b++)
      arrayOfByte2[b] = (byte)((OdI)this.Dne[b]).Qnq; 
    qMV.FWm();
    return qMV;
  }
  
  public qMV FWm(int paramInt1, int paramInt2) {
    return Dne(paramInt1, paramInt2);
  }
  
  public void Dne(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, OdI[] paramArrayOfOdI) {
    byte b1 = 63;
    double d = 0.03125D;
    this.DyG = (xvE)this.DyG.Dne((double[])this.DyG, paramInt1 * 16, paramInt2 * 16, 0, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
    for (byte b2 = 0; b2 < 16; b2++) {
      for (byte b = 0; b < 16; b++) {
        OdI odI1 = paramArrayOfOdI[b + b2 * 16];
        float f = odI1.bzF();
        int i = (int)(this.DyG[b2 + b * 16] / 3.0D + 3.0D + this.Dne.nextDouble() * 0.25D);
        int j = -1;
        boolean bool = odI1.Dne;
        OdI odI2 = odI1.FWm;
        for (byte b3 = 127; b3 >= 0; b3--) {
          int k = (b * 16 + b2) * 128 + b3;
          if (b3 <= 0 + this.Dne.nextInt(5)) {
            paramArrayOfbyte[k] = (byte)zKP.zGp.FWm;
          } else {
            byte b4 = paramArrayOfbyte[k];
            if (b4 == 0) {
              j = -1;
            } else if (b4 == zKP.Dne.FWm) {
              if (j == -1) {
                byte b5;
                if (i <= 0) {
                  bool = false;
                  byte b6 = (byte)zKP.Dne.FWm;
                } else if (b3 >= b1 - 4 && b3 <= b1 + 1) {
                  bool = odI1.Dne;
                  odI2 = odI1.FWm;
                } 
                if (b3 < b1 && !bool)
                  if (f < 0.15F) {
                    b5 = (byte)zKP.xEx.FWm;
                  } else {
                    b5 = (byte)((zKP)zKP.DyG).FWm;
                  }  
                j = i;
                if (b3 >= b1 - 1) {
                  paramArrayOfbyte[k] = b5;
                } else {
                  paramArrayOfbyte[k] = odI2;
                } 
              } else if (j > 0) {
                j--;
                paramArrayOfbyte[k] = odI2;
                if (j == 0 && odI2 == ((zKP)zKP.IjH).FWm) {
                  j = this.Dne.nextInt(4);
                  byte b5 = (byte)zKP.ceE.FWm;
                } 
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public void Dne() {}
  
  public boolean FWm() {
    return true;
  }
  
  public EyB Dne(Qnq paramQnq, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return ("Stronghold".equals(paramString) && this.Dne != null) ? this.Dne.Dne(paramQnq, paramInt1, paramInt2, paramInt3) : null;
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    if (this.Dne != null) {
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, (byte[])null);
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, (byte[])null);
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, (byte[])null);
      this.Dne.Dne(this, (Qnq)this.Dne, paramInt1, paramInt2, (byte[])null);
    } 
  }
  
  public XwR(Qnq paramQnq, long paramLong, boolean paramBoolean) {
    this.Dne = (int[][])new Khi();
    this.Dne = (int[][])new cXw();
    this.Dne = (int[][])new Kvh();
    this.Dne = (int[][])new tMg();
    this.FWm = (double[])new jBE();
    this.Dne = new int[32][32];
    this.Dne = (int[][])paramQnq;
    this.Dne = paramBoolean;
    this.Dne = (int[][])new Random(paramLong);
    this.Qnq = new xvE((Random)this.Dne, 16);
    this.aFZ = new xvE((Random)this.Dne, 16);
    this.zGp = new xvE((Random)this.Dne, 8);
    this.DyG = new xvE((Random)this.Dne, 4);
    this.Dne = (int[][])new xvE((Random)this.Dne, 10);
    this.FWm = (double[])new xvE((Random)this.Dne, 16);
    this.bzF = (double[])new xvE((Random)this.Dne, 8);
  }
  
  public void Dne(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    byte b1 = 4;
    byte b2 = 16;
    byte b3 = 63;
    int i = b1 + 1;
    byte b4 = 17;
    int j = b1 + 1;
    this.Dne = (int[][])this.Dne.Dne().Dne((OdI[])this.Dne, paramInt1 * 4 - 2, paramInt2 * 4 - 2, i + 5, j + 5);
    this.zGp = (xvE)Dne((double[])this.zGp, paramInt1 * b1, 0, paramInt2 * b1, i, b4, j);
    for (byte b5 = 0; b5 < b1; b5++) {
      for (byte b = 0; b < b1; b++) {
        for (byte b6 = 0; b6 < b2; b6++) {
          double d1 = 0.125D;
          xvE xvE1 = this.zGp[((b5 + 0) * j + b + 0) * b4 + b6 + 0];
          xvE xvE2 = this.zGp[((b5 + 0) * j + b + 1) * b4 + b6 + 0];
          xvE xvE3 = this.zGp[((b5 + 1) * j + b + 0) * b4 + b6 + 0];
          xvE xvE4 = this.zGp[((b5 + 1) * j + b + 1) * b4 + b6 + 0];
          double d2 = (this.zGp[((b5 + 0) * j + b + 0) * b4 + b6 + 1] - xvE1) * d1;
          double d3 = (this.zGp[((b5 + 0) * j + b + 1) * b4 + b6 + 1] - xvE2) * d1;
          double d4 = (this.zGp[((b5 + 1) * j + b + 0) * b4 + b6 + 1] - xvE3) * d1;
          double d5 = (this.zGp[((b5 + 1) * j + b + 1) * b4 + b6 + 1] - xvE4) * d1;
          for (byte b7 = 0; b7 < 8; b7++) {
            double d10 = 0.25D;
            xvE xvE5 = xvE1;
            xvE xvE6 = xvE2;
            double d11 = (xvE3 - xvE1) * d10;
            double d12 = (xvE4 - xvE2) * d10;
            for (byte b8 = 0; b8 < 4; b8++) {
              int k = b8 + b5 * 4 << 11 | 0 + b * 4 << 7 | b6 * 8 + b7;
              char c = '';
              k -= c;
              double d15 = 0.25D;
              double d16 = (xvE6 - xvE5) * d15;
              double d17 = xvE5 - d16;
              for (byte b9 = 0; b9 < 4; b9++) {
                if ((d17 += d16) > 0.0D) {
                  paramArrayOfbyte[k += c] = (byte)zKP.Dne.FWm;
                } else if (b6 * 8 + b7 < b3) {
                  paramArrayOfbyte[k += c] = (byte)((zKP)zKP.DyG).FWm;
                } else {
                  paramArrayOfbyte[k += c] = 0;
                } 
              } 
              double d13 = xvE5 + d11;
              double d14 = xvE6 + d12;
            } 
            double d6 = xvE1 + d2;
            double d7 = xvE2 + d3;
            double d8 = xvE3 + d4;
            double d9 = xvE4 + d5;
          } 
        } 
      } 
    } 
  }
  
  public boolean Dne(boolean paramBoolean, TaY paramTaY) {
    return true;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(ZfC paramZfC, int paramInt1, int paramInt2) {
    ZgW.Dne = true;
    int i = paramInt1 * 16;
    int j = paramInt2 * 16;
    OdI odI = this.Dne.Dne(i + 16, j + 16);
    this.Dne.setSeed(this.Dne.Dne());
    long l1 = this.Dne.nextLong() / 2L * 2L + 1L;
    long l2 = this.Dne.nextLong() / 2L * 2L + 1L;
    this.Dne.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.Dne.Dne());
    boolean bool = false;
    if (this.Dne != null) {
      this.Dne.Dne((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
      bool = this.Dne.Dne((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
      this.Dne.Dne((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
      this.Dne.Dne((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
    } 
    if (!bool && this.Dne.nextInt(4) == 0) {
      int k = i + this.Dne.nextInt(16) + 8;
      int m = this.Dne.nextInt(128);
      int n = j + this.Dne.nextInt(16) + 8;
      (new gvF(((zKP)zKP.DyG).FWm)).Dne((Qnq)this.Dne, (Random)this.Dne, k, m, n);
    } 
    if (!bool && this.Dne.nextInt(8) == 0) {
      int k = i + this.Dne.nextInt(16) + 8;
      int m = this.Dne.nextInt(this.Dne.nextInt(120) + 8);
      int n = j + this.Dne.nextInt(16) + 8;
      if (m < 63 || this.Dne.nextInt(10) == 0)
        (new gvF(((zKP)zKP.div).FWm)).Dne((Qnq)this.Dne, (Random)this.Dne, k, m, n); 
    } 
    byte b;
    for (b = 0; b < 8; b++) {
      int k = i + this.Dne.nextInt(16) + 8;
      int m = this.Dne.nextInt(128);
      int n = j + this.Dne.nextInt(16) + 8;
      if ((new ivB()).Dne((Qnq)this.Dne, (Random)this.Dne, k, m, n));
    } 
    odI.Dne((Qnq)this.Dne, (Random)this.Dne, i, j);
    ooe.Dne((Qnq)this.Dne, odI, i + 8, j + 8, 16, 16, (Random)this.Dne);
    i += 8;
    j += 8;
    for (b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        int k = this.Dne.Qnq(i + b, j + b1);
        if (this.Dne.mrb(b + i, k - 1, b1 + j))
          this.Dne.FWm(b + i, k - 1, b1 + j, zKP.xEx.FWm, 0, 2); 
        if (this.Dne.Zpi(b + i, k, b1 + j))
          this.Dne.FWm(b + i, k, b1 + j, zKP.EwP.FWm, 0, 2); 
      } 
    } 
    ZgW.Dne = false;
  }
  
  public int Dne() {
    return 0;
  }
  
  public String Dne() {
    return "RandomLevelSource";
  }
  
  private double[] Dne(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramArrayOfdouble == null)
      paramArrayOfdouble = new double[paramInt4 * paramInt5 * paramInt6]; 
    if (this.Dne == null) {
      this.Dne = (int[][])new float[25];
      for (byte b = -2; b <= 2; b++) {
        for (byte b4 = -2; b4 <= 2; b4++) {
          float f = 10.0F / geR.bzF((b * b + b4 * b4) + 0.2F);
          this.Dne[b + 2 + (b4 + 2) * 5] = f;
        } 
      } 
    } 
    double d1 = 684.412D;
    double d2 = 684.412D;
    this.Qnq = (xvE)this.Dne.Dne((double[])this.Qnq, paramInt1, paramInt3, paramInt4, paramInt6, 1.121D, 1.121D, 0.5D);
    this.aFZ = (xvE)this.FWm.Dne((double[])this.aFZ, paramInt1, paramInt3, paramInt4, paramInt6, 200.0D, 200.0D, 0.5D);
    this.Dne = (int[][])this.zGp.Dne((double[])this.Dne, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
    this.FWm = this.Qnq.Dne(this.FWm, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    this.bzF = this.aFZ.Dne(this.bzF, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    boolean bool1 = false;
    boolean bool2 = false;
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < paramInt4; b3++) {
      for (byte b = 0; b < paramInt6; b++) {
        float f1 = 0.0F;
        float f2 = 0.0F;
        float f3 = 0.0F;
        byte b4 = 2;
        int[] arrayOfInt = this.Dne[b3 + 2 + (b + 2) * (paramInt4 + 5)];
        for (byte b5 = -b4; b5 <= b4; b5++) {
          for (byte b7 = -b4; b7 <= b4; b7++) {
            int[] arrayOfInt1 = this.Dne[b3 + b5 + 2 + (b + b7 + 2) * (paramInt4 + 5)];
            float f = this.Dne[b5 + 2 + (b7 + 2) * 5] / (((OdI)arrayOfInt1).Dne + 2.0F);
            if (((OdI)arrayOfInt1).Dne > ((OdI)arrayOfInt).Dne)
              f /= 2.0F; 
            f1 += ((OdI)arrayOfInt1).FWm * f;
            f2 += ((OdI)arrayOfInt1).Dne * f;
            f3 += f;
          } 
        } 
        f1 /= f3;
        f2 /= f3;
        f1 = f1 * 0.9F + 0.1F;
        f2 = (f2 * 4.0F - 1.0F) / 8.0F;
        double d = this.aFZ[b2] / 8000.0D;
        if (d < 0.0D)
          d = -d * 0.3D; 
        d = d * 3.0D - 2.0D;
        if (d < 0.0D) {
          d /= 2.0D;
          if (d < -1.0D)
            d = -1.0D; 
          d /= 1.4D;
          d /= 2.0D;
        } else {
          if (d > 1.0D)
            d = 1.0D; 
          d /= 8.0D;
        } 
        b2++;
        for (byte b6 = 0; b6 < paramInt5; b6++) {
          double d3 = f2;
          double d4 = f1;
          d3 += d * 0.2D;
          d3 = d3 * paramInt5 / 16.0D;
          double d5 = paramInt5 / 2.0D + d3 * 4.0D;
          double d6 = 0.0D;
          double d7 = (b6 - d5) * 12.0D * 128.0D / 128.0D / d4;
          if (d7 < 0.0D)
            d7 *= 4.0D; 
          double d8 = this.FWm[b1] / 512.0D;
          double d9 = this.bzF[b1] / 512.0D;
          double d10 = (this.Dne[b1] / 10.0D + 1.0D) / 2.0D;
          if (d10 < 0.0D) {
            d6 = d8;
          } else if (d10 > 1.0D) {
            d6 = d9;
          } else {
            d6 = d8 + (d9 - d8) * d10;
          } 
          d6 -= d7;
          if (b6 > paramInt5 - 4) {
            double d11 = ((b6 - paramInt5 - 4) / 3.0F);
            d6 = d6 * (1.0D - d11) + -10.0D * d11;
          } 
          paramArrayOfdouble[b1] = d6;
          b1++;
        } 
      } 
    } 
    return paramArrayOfdouble;
  }
  
  public List Dne(Icc paramIcc, int paramInt1, int paramInt2, int paramInt3) {
    OdI odI = this.Dne.Dne(paramInt1, paramInt3);
    return (odI == null) ? null : ((odI == OdI.DyG && paramIcc == Icc.Dne && this.Dne.Dne(paramInt1, paramInt2, paramInt3)) ? this.Dne.Dne() : odI.Dne(paramIcc));
  }
  
  public boolean Dne(int paramInt1, int paramInt2) {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XwR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */