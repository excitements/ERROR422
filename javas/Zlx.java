import java.util.List;
import java.util.Random;

public class Zlx implements ZfC {
  public xvE Dne;
  
  private xvE aFZ;
  
  double[] Dne;
  
  double[] aFZ;
  
  private OdI[] Dne;
  
  double[] Qnq;
  
  public xvE FWm;
  
  private Qnq Dne;
  
  double[] bzF;
  
  private Random Dne;
  
  private xvE bzF;
  
  private double[] zGp;
  
  int[][] Dne = new int[32][32];
  
  double[] FWm;
  
  private xvE Qnq;
  
  public boolean Dne(boolean paramBoolean, TaY paramTaY) {
    return true;
  }
  
  public int Dne() {
    return 0;
  }
  
  public void Dne(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, OdI[] paramArrayOfOdI) {
    byte b1 = 2;
    int i = b1 + 1;
    byte b2 = 33;
    int j = b1 + 1;
    this.zGp = Dne(this.zGp, paramInt1 * b1, 0, paramInt2 * b1, i, b2, j);
    for (byte b3 = 0; b3 < b1; b3++) {
      for (byte b = 0; b < b1; b++) {
        for (byte b4 = 0; b4 < 32; b4++) {
          double d1 = 0.25D;
          double d2 = this.zGp[((b3 + 0) * j + b + 0) * b2 + b4 + 0];
          double d3 = this.zGp[((b3 + 0) * j + b + 1) * b2 + b4 + 0];
          double d4 = this.zGp[((b3 + 1) * j + b + 0) * b2 + b4 + 0];
          double d5 = this.zGp[((b3 + 1) * j + b + 1) * b2 + b4 + 0];
          double d6 = (this.zGp[((b3 + 0) * j + b + 0) * b2 + b4 + 1] - d2) * d1;
          double d7 = (this.zGp[((b3 + 0) * j + b + 1) * b2 + b4 + 1] - d3) * d1;
          double d8 = (this.zGp[((b3 + 1) * j + b + 0) * b2 + b4 + 1] - d4) * d1;
          double d9 = (this.zGp[((b3 + 1) * j + b + 1) * b2 + b4 + 1] - d5) * d1;
          for (byte b5 = 0; b5 < 4; b5++) {
            double d10 = 0.125D;
            double d11 = d2;
            double d12 = d3;
            double d13 = (d4 - d2) * d10;
            double d14 = (d5 - d3) * d10;
            for (byte b6 = 0; b6 < 8; b6++) {
              int k = b6 + b3 * 8 << 11 | 0 + b * 8 << 7 | b4 * 4 + b5;
              char c = '';
              double d15 = 0.125D;
              double d16 = d11;
              double d17 = (d12 - d11) * d15;
              for (byte b7 = 0; b7 < 8; b7++) {
                hbe hbe;
                boolean bool = false;
                if (d16 > 0.0D)
                  hbe = zKP.dNY.FWm; 
                paramArrayOfbyte[k] = (byte)hbe;
                k += c;
                d16 += d17;
              } 
              d11 += d13;
              d12 += d14;
            } 
            d2 += d6;
            d3 += d7;
            d4 += d8;
            d5 += d9;
          } 
        } 
      } 
    } 
  }
  
  public qMV Dne(int paramInt1, int paramInt2) {
    this.Dne.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
    byte[] arrayOfByte1 = new byte[32768];
    this.Dne = (int[][])this.Dne.Dne().FWm((OdI[])this.Dne, paramInt1 * 16, paramInt2 * 16, 16, 16);
    Dne(paramInt1, paramInt2, arrayOfByte1, (OdI[])this.Dne);
    FWm(paramInt1, paramInt2, arrayOfByte1, (OdI[])this.Dne);
    qMV qMV = new qMV((Qnq)this.Dne, arrayOfByte1, paramInt1, paramInt2);
    byte[] arrayOfByte2 = qMV.Dne();
    for (byte b = 0; b < arrayOfByte2.length; b++)
      arrayOfByte2[b] = (byte)((OdI)this.Dne[b]).Qnq; 
    qMV.FWm();
    return qMV;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public List Dne(Icc paramIcc, int paramInt1, int paramInt2, int paramInt3) {
    OdI odI = this.Dne.Dne(paramInt1, paramInt3);
    return (odI == null) ? null : odI.Dne(paramIcc);
  }
  
  public void Dne(ZfC paramZfC, int paramInt1, int paramInt2) {
    ZgW.Dne = true;
    int i = paramInt1 * 16;
    int j = paramInt2 * 16;
    OdI odI = this.Dne.Dne(i + 16, j + 16);
    odI.Dne((Qnq)this.Dne, (Random)((Qnq)this.Dne).Dne, i, j);
    ZgW.Dne = false;
  }
  
  public void Dne() {}
  
  public boolean Dne(int paramInt1, int paramInt2) {
    return true;
  }
  
  public qMV FWm(int paramInt1, int paramInt2) {
    return Dne(paramInt1, paramInt2);
  }
  
  public void Dne(int paramInt1, int paramInt2) {}
  
  public boolean Dne() {
    return false;
  }
  
  public Zlx(Qnq paramQnq, long paramLong) {
    this.Dne = (int[][])paramQnq;
    this.Dne = (int[][])new Random(paramLong);
    this.bzF = new xvE((Random)this.Dne, 16);
    this.Qnq = new xvE((Random)this.Dne, 16);
    this.aFZ = (double[])new xvE((Random)this.Dne, 8);
    this.Dne = (int[][])new xvE((Random)this.Dne, 10);
    this.FWm = (double[])new xvE((Random)this.Dne, 16);
  }
  
  public String Dne() {
    return "RandomLevelSource";
  }
  
  public void FWm(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, OdI[] paramArrayOfOdI) {
    for (byte b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        boolean bool = true;
        byte b2 = -1;
        byte b3 = (byte)zKP.dNY.FWm;
        byte b4 = (byte)zKP.dNY.FWm;
        for (byte b5 = 127; b5 >= 0; b5--) {
          int i = (b1 * 16 + b) * 128 + b5;
          byte b6 = paramArrayOfbyte[i];
          if (b6 == 0) {
            b2 = -1;
          } else if (b6 == zKP.Dne.FWm) {
            if (b2 == -1) {
              if (bool) {
                b3 = 0;
                b4 = (byte)zKP.dNY.FWm;
              } 
              b2 = bool;
              if (b5 >= 0) {
                paramArrayOfbyte[i] = b3;
              } else {
                paramArrayOfbyte[i] = b4;
              } 
            } else if (b2 > 0) {
              b2--;
              paramArrayOfbyte[i] = b4;
            } 
          } 
        } 
      } 
    } 
  }
  
  private double[] Dne(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramArrayOfdouble == null)
      paramArrayOfdouble = new double[paramInt4 * paramInt5 * paramInt6]; 
    double d1 = 684.412D;
    double d2 = 684.412D;
    this.Qnq = (xvE)this.Dne.Dne((double[])this.Qnq, paramInt1, paramInt3, paramInt4, paramInt6, 1.121D, 1.121D, 0.5D);
    this.aFZ = this.FWm.Dne(this.aFZ, paramInt1, paramInt3, paramInt4, paramInt6, 200.0D, 200.0D, 0.5D);
    d1 *= 2.0D;
    this.Dne = (int[][])this.aFZ.Dne((double[])this.Dne, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
    this.FWm = this.bzF.Dne(this.FWm, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    this.bzF = (xvE)this.Qnq.Dne((double[])this.bzF, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < paramInt4; b3++) {
      for (byte b = 0; b < paramInt6; b++) {
        double d3 = (this.Qnq[b2] + 256.0D) / 512.0D;
        if (d3 > 1.0D)
          d3 = 1.0D; 
        double d4 = this.aFZ[b2] / 8000.0D;
        if (d4 < 0.0D)
          d4 = -d4 * 0.3D; 
        d4 = d4 * 3.0D - 2.0D;
        float f1 = (b3 + paramInt1 - 0) / 1.0F;
        float f2 = (b + paramInt3 - 0) / 1.0F;
        float f3 = 100.0F - geR.bzF(f1 * f1 + f2 * f2) * 8.0F;
        if (f3 > 80.0F)
          f3 = 80.0F; 
        if (f3 < -100.0F)
          f3 = -100.0F; 
        if (d4 > 1.0D)
          d4 = 1.0D; 
        d4 /= 8.0D;
        d4 = 0.0D;
        if (d3 < 0.0D)
          d3 = 0.0D; 
        d3 += 0.5D;
        d4 = d4 * paramInt5 / 16.0D;
        b2++;
        double d5 = paramInt5 / 2.0D;
        for (byte b4 = 0; b4 < paramInt5; b4++) {
          double d6 = 0.0D;
          double d7 = (b4 - d5) * 8.0D / d3;
          if (d7 < 0.0D)
            d7 *= -1.0D; 
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
          d6 -= 8.0D;
          d6 += f3;
          byte b5 = 2;
          if (b4 > paramInt5 / 2 - b5) {
            double d = ((b4 - paramInt5 / 2 - b5) / 64.0F);
            if (d < 0.0D)
              d = 0.0D; 
            if (d > 1.0D)
              d = 1.0D; 
            d6 = d6 * (1.0D - d) + -3000.0D * d;
          } 
          b5 = 8;
          if (b4 < b5) {
            double d = ((b5 - b4) / (b5 - 1.0F));
            d6 = d6 * (1.0D - d) + -30.0D * d;
          } 
          paramArrayOfdouble[b1] = d6;
          b1++;
        } 
      } 
    } 
    return paramArrayOfdouble;
  }
  
  public EyB Dne(Qnq paramQnq, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Zlx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */