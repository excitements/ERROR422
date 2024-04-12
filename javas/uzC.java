import java.util.Random;

public class uzC extends gwq {
  private int FWm;
  
  private int bzF;
  
  private int Dne;
  
  public uzC(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, zKP.Dne.FWm);
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    float f = paramRandom.nextFloat() * 3.1415927F;
    double d1 = ((paramInt1 + 8) + geR.Dne(f) * this.FWm / 8.0F);
    double d2 = ((paramInt1 + 8) - geR.Dne(f) * this.FWm / 8.0F);
    double d3 = ((paramInt3 + 8) + geR.FWm(f) * this.FWm / 8.0F);
    double d4 = ((paramInt3 + 8) - geR.FWm(f) * this.FWm / 8.0F);
    double d5 = (paramInt2 + paramRandom.nextInt(3) - 2);
    double d6 = (paramInt2 + paramRandom.nextInt(3) - 2);
    for (byte b = 0; b <= this.FWm; b++) {
      double d7 = d1 + (d2 - d1) * b / this.FWm;
      double d8 = d5 + (d6 - d5) * b / this.FWm;
      double d9 = d3 + (d4 - d3) * b / this.FWm;
      double d10 = paramRandom.nextDouble() * this.FWm / 16.0D;
      double d11 = (geR.Dne(b * 3.1415927F / this.FWm) + 1.0F) * d10 + 1.0D;
      double d12 = (geR.Dne(b * 3.1415927F / this.FWm) + 1.0F) * d10 + 1.0D;
      int i = geR.FWm(d7 - d11 / 2.0D);
      int j = geR.FWm(d8 - d12 / 2.0D);
      int k = geR.FWm(d9 - d11 / 2.0D);
      int m = geR.FWm(d7 + d11 / 2.0D);
      int n = geR.FWm(d8 + d12 / 2.0D);
      int i1 = geR.FWm(d9 + d11 / 2.0D);
      for (int i2 = i; i2 <= m; i2++) {
        double d = (i2 + 0.5D - d7) / d11 / 2.0D;
        if (d * d < 1.0D)
          for (int i3 = j; i3 <= n; i3++) {
            double d13 = (i3 + 0.5D - d8) / d12 / 2.0D;
            if (d * d + d13 * d13 < 1.0D)
              for (int i4 = k; i4 <= i1; i4++) {
                double d14 = (i4 + 0.5D - d9) / d11 / 2.0D;
                if (d * d + d13 * d13 + d14 * d14 < 1.0D && paramQnq.Dne(i2, i3, i4) == this.bzF)
                  paramQnq.FWm(i2, i3, i4, this.Dne, 0, 2); 
              }  
          }  
      } 
    } 
    return true;
  }
  
  public uzC(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uzC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */