import java.util.Random;

public class jBE extends Suj {
  private float[] Dne = new float[1024];
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfbyte) {
    if (this.Dne.nextInt(50) == 0) {
      double d1 = (paramInt1 * 16 + this.Dne.nextInt(16));
      double d2 = (this.Dne.nextInt(this.Dne.nextInt(40) + 8) + 20);
      double d3 = (paramInt2 * 16 + this.Dne.nextInt(16));
      byte b1 = 1;
      for (byte b2 = 0; b2 < b1; b2++) {
        float f1 = this.Dne.nextFloat() * 3.1415927F * 2.0F;
        float f2 = (this.Dne.nextFloat() - 0.5F) * 2.0F / 8.0F;
        float f3 = (this.Dne.nextFloat() * 2.0F + this.Dne.nextFloat()) * 2.0F;
        Dne(this.Dne.nextLong(), paramInt3, paramInt4, paramArrayOfbyte, d1, d2, d3, f3, f1, f2, 0, 0, 3.0D);
      } 
    } 
  }
  
  protected void Dne(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4) {
    Random random = new Random(paramLong);
    double d1 = (paramInt1 * 16 + 8);
    double d2 = (paramInt2 * 16 + 8);
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (paramInt4 <= 0) {
      int i = this.Dne * 16 - 16;
      paramInt4 = i - random.nextInt(i / 4);
    } 
    boolean bool = false;
    if (paramInt3 == -1) {
      paramInt3 = paramInt4 / 2;
      bool = true;
    } 
    float f3 = 1.0F;
    for (byte b = 0; b < ''; b++) {
      if (b == 0 || random.nextInt(3) == 0)
        f3 = 1.0F + random.nextFloat() * random.nextFloat() * 1.0F; 
      this.Dne[b] = f3 * f3;
    } 
    while (paramInt3 < paramInt4) {
      double d3 = 1.5D + (geR.Dne(paramInt3 * 3.1415927F / paramInt4) * paramFloat1 * 1.0F);
      double d4 = d3 * paramDouble4;
      d3 *= random.nextFloat() * 0.25D + 0.75D;
      d4 *= random.nextFloat() * 0.25D + 0.75D;
      float f4 = geR.FWm(paramFloat3);
      float f5 = geR.Dne(paramFloat3);
      paramDouble1 += (geR.FWm(paramFloat2) * f4);
      paramDouble2 += f5;
      paramDouble3 += (geR.Dne(paramFloat2) * f4);
      paramFloat3 *= 0.7F;
      paramFloat3 += f2 * 0.05F;
      paramFloat2 += f1 * 0.05F;
      f2 *= 0.8F;
      f1 *= 0.5F;
      f2 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
      f1 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
      if (bool || random.nextInt(4) != 0) {
        double d5 = paramDouble1 - d1;
        double d6 = paramDouble3 - d2;
        double d7 = (paramInt4 - paramInt3);
        double d8 = (paramFloat1 + 2.0F + 16.0F);
        if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8)
          return; 
        if (paramDouble1 >= d1 - 16.0D - d3 * 2.0D && paramDouble3 >= d2 - 16.0D - d3 * 2.0D && paramDouble1 <= d1 + 16.0D + d3 * 2.0D && paramDouble3 <= d2 + 16.0D + d3 * 2.0D) {
          int i = geR.FWm(paramDouble1 - d3) - paramInt1 * 16 - 1;
          int j = geR.FWm(paramDouble1 + d3) - paramInt1 * 16 + 1;
          int k = geR.FWm(paramDouble2 - d4) - 1;
          int m = geR.FWm(paramDouble2 + d4) + 1;
          int n = geR.FWm(paramDouble3 - d3) - paramInt2 * 16 - 1;
          int i1 = geR.FWm(paramDouble3 + d3) - paramInt2 * 16 + 1;
          if (i < 0)
            i = 0; 
          if (j > 16)
            j = 16; 
          if (k < 1)
            k = 1; 
          if (m > 120)
            m = 120; 
          if (n < 0)
            n = 0; 
          if (i1 > 16)
            i1 = 16; 
          boolean bool1 = false;
          int i2;
          for (i2 = i; !bool1 && i2 < j; i2++) {
            for (int i3 = n; !bool1 && i3 < i1; i3++) {
              for (int i4 = m + 1; !bool1 && i4 >= k - 1; i4--) {
                int i5 = (i2 * 16 + i3) * 128 + i4;
                if (i4 >= 0 && i4 < 128) {
                  if (paramArrayOfbyte[i5] == ((byt)zKP.Dne).FWm || paramArrayOfbyte[i5] == ((zKP)zKP.DyG).FWm)
                    bool1 = true; 
                  if (i4 != k - 1 && i2 != i && i2 != j - 1 && i3 != n && i3 != i1 - 1)
                    i4 = k; 
                } 
              } 
            } 
          } 
          if (!bool1) {
            for (i2 = i; i2 < j; i2++) {
              double d = ((i2 + paramInt1 * 16) + 0.5D - paramDouble1) / d3;
              for (int i3 = n; i3 < i1; i3++) {
                double d9 = ((i3 + paramInt2 * 16) + 0.5D - paramDouble3) / d3;
                int i4 = (i2 * 16 + i3) * 128 + m;
                boolean bool2 = false;
                if (d * d + d9 * d9 < 1.0D)
                  for (int i5 = m - 1; i5 >= k; i5--) {
                    double d10 = (i5 + 0.5D - paramDouble2) / d4;
                    if ((d * d + d9 * d9) * this.Dne[i5] + d10 * d10 / 6.0D < 1.0D) {
                      byte b1 = paramArrayOfbyte[i4];
                      if (b1 == ((ZQN)zKP.Dne).FWm)
                        bool2 = true; 
                      if (b1 == zKP.Dne.FWm || b1 == zKP.FWm.FWm || b1 == ((ZQN)zKP.Dne).FWm)
                        if (i5 < 10) {
                          paramArrayOfbyte[i4] = (byte)((byt)zKP.FWm).FWm;
                        } else {
                          paramArrayOfbyte[i4] = 0;
                          if (bool2 && paramArrayOfbyte[i4 - 1] == zKP.FWm.FWm)
                            paramArrayOfbyte[i4 - 1] = (this.Dne.Dne(i2 + paramInt1 * 16, i3 + paramInt2 * 16)).Dne; 
                        }  
                    } 
                    i4--;
                  }  
              } 
            } 
            if (bool)
              break; 
          } 
        } 
      } 
      paramInt3++;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jBE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */