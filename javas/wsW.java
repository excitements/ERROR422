import java.util.Random;

public class wsW extends xVn {
  public double Dne;
  
  public double FWm;
  
  public double bzF;
  
  private int[] Dne = new int[512];
  
  public final double Dne(int paramInt, double paramDouble1, double paramDouble2) {
    int i = paramInt & 0xF;
    double d1 = (1 - ((i & 0x8) >> 3)) * paramDouble1;
    double d2 = (i < 4) ? 0.0D : ((i != 12 && i != 14) ? paramDouble2 : paramDouble1);
    return (((i & 0x1) == 0) ? d1 : -d1) + (((i & 0x2) == 0) ? d2 : -d2);
  }
  
  public final double Dne(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
    int i = paramInt & 0xF;
    double d1 = (i < 8) ? paramDouble1 : paramDouble2;
    double d2 = (i < 4) ? paramDouble2 : ((i != 12 && i != 14) ? paramDouble3 : paramDouble1);
    return (((i & 0x1) == 0) ? d1 : -d1) + (((i & 0x2) == 0) ? d2 : -d2);
  }
  
  public wsW() {
    this(new Random());
  }
  
  public final double Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    return paramDouble2 + paramDouble1 * (paramDouble3 - paramDouble2);
  }
  
  public void Dne(double[] paramArrayOfdouble, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7) {
    if (paramInt2 == 1) {
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      double d1 = 0.0D;
      double d2 = 0.0D;
      byte b1 = 0;
      double d3 = 1.0D / paramDouble7;
      for (byte b2 = 0; b2 < paramInt1; b2++) {
        double d4 = paramDouble1 + b2 * paramDouble4 + this.Dne;
        int i = (int)d4;
        if (d4 < i)
          i--; 
        int j = i & 0xFF;
        d4 -= i;
        double d5 = d4 * d4 * d4 * (d4 * (d4 * 6.0D - 15.0D) + 10.0D);
        for (byte b = 0; b < paramInt3; b++) {
          double d6 = paramDouble3 + b * paramDouble6 + this.bzF;
          int n = (int)d6;
          if (d6 < n)
            n--; 
          int i1 = n & 0xFF;
          d6 -= n;
          double d7 = d6 * d6 * d6 * (d6 * (d6 * 6.0D - 15.0D) + 10.0D);
          int k = this.Dne[j] + 0;
          int i2 = this.Dne[k] + i1;
          int i3 = this.Dne[j + 1] + 0;
          int m = this.Dne[i3] + i1;
          d1 = Dne(d5, Dne(this.Dne[i2], d4, d6), Dne(this.Dne[m], d4 - 1.0D, 0.0D, d6));
          d2 = Dne(d5, Dne(this.Dne[i2 + 1], d4, 0.0D, d6 - 1.0D), Dne(this.Dne[m + 1], d4 - 1.0D, 0.0D, d6 - 1.0D));
          double d8 = Dne(d7, d1, d2);
          byte b3 = b1++;
          paramArrayOfdouble[b3] = paramArrayOfdouble[b3] + d8 * d3;
        } 
      } 
    } else {
      byte b1 = 0;
      double d3 = 1.0D / paramDouble7;
      int i = -1;
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      boolean bool6 = false;
      double d4 = 0.0D;
      double d1 = 0.0D;
      double d5 = 0.0D;
      double d2 = 0.0D;
      for (byte b2 = 0; b2 < paramInt1; b2++) {
        double d6 = paramDouble1 + b2 * paramDouble4 + this.Dne;
        int j = (int)d6;
        if (d6 < j)
          j--; 
        int k = j & 0xFF;
        d6 -= j;
        double d7 = d6 * d6 * d6 * (d6 * (d6 * 6.0D - 15.0D) + 10.0D);
        for (byte b = 0; b < paramInt3; b++) {
          double d8 = paramDouble3 + b * paramDouble6 + this.bzF;
          int m = (int)d8;
          if (d8 < m)
            m--; 
          int n = m & 0xFF;
          d8 -= m;
          double d9 = d8 * d8 * d8 * (d8 * (d8 * 6.0D - 15.0D) + 10.0D);
          for (byte b3 = 0; b3 < paramInt2; b3++) {
            double d10 = paramDouble2 + b3 * paramDouble5 + this.FWm;
            int i1 = (int)d10;
            if (d10 < i1)
              i1--; 
            int i2 = i1 & 0xFF;
            d10 -= i1;
            double d11 = d10 * d10 * d10 * (d10 * (d10 * 6.0D - 15.0D) + 10.0D);
            if (b3 == 0 || i2 != i) {
              i = i2;
              int i4 = this.Dne[k] + i2;
              int i5 = this.Dne[i4] + n;
              int i6 = this.Dne[i4 + 1] + n;
              int i7 = this.Dne[k + 1] + i2;
              int i3 = this.Dne[i7] + n;
              int i8 = this.Dne[i7 + 1] + n;
              d4 = Dne(d7, Dne(this.Dne[i5], d6, d10, d8), Dne(this.Dne[i3], d6 - 1.0D, d10, d8));
              d1 = Dne(d7, Dne(this.Dne[i6], d6, d10 - 1.0D, d8), Dne(this.Dne[i8], d6 - 1.0D, d10 - 1.0D, d8));
              d5 = Dne(d7, Dne(this.Dne[i5 + 1], d6, d10, d8 - 1.0D), Dne(this.Dne[i3 + 1], d6 - 1.0D, d10, d8 - 1.0D));
              d2 = Dne(d7, Dne(this.Dne[i6 + 1], d6, d10 - 1.0D, d8 - 1.0D), Dne(this.Dne[i8 + 1], d6 - 1.0D, d10 - 1.0D, d8 - 1.0D));
            } 
            double d12 = Dne(d11, d4, d1);
            double d13 = Dne(d11, d5, d2);
            double d14 = Dne(d9, d12, d13);
            byte b4 = b1++;
            paramArrayOfdouble[b4] = paramArrayOfdouble[b4] + d14 * d3;
          } 
        } 
      } 
    } 
  }
  
  public wsW(Random paramRandom) {
    this.Dne = paramRandom.nextDouble() * 256.0D;
    this.FWm = paramRandom.nextDouble() * 256.0D;
    this.bzF = paramRandom.nextDouble() * 256.0D;
    byte b = 0;
    while (b < 'Ā')
      this.Dne[b] = b++; 
    for (b = 0; b < 'Ā'; b++) {
      int i = paramRandom.nextInt(256 - b) + b;
      int j = this.Dne[b];
      this.Dne[b] = this.Dne[i];
      this.Dne[i] = j;
      this.Dne[b + 256] = this.Dne[b];
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wsW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */