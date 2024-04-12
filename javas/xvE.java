import java.util.Random;

public class xvE extends xVn {
  private int Dne;
  
  private wsW[] Dne;
  
  public double[] Dne(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3) {
    if (paramArrayOfdouble == null) {
      paramArrayOfdouble = new double[paramInt4 * paramInt5 * paramInt6];
    } else {
      for (byte b1 = 0; b1 < paramArrayOfdouble.length; b1++)
        paramArrayOfdouble[b1] = 0.0D; 
    } 
    double d = 1.0D;
    for (byte b = 0; b < this.Dne; b++) {
      double d1 = paramInt1 * d * paramDouble1;
      double d2 = paramInt2 * d * paramDouble2;
      double d3 = paramInt3 * d * paramDouble3;
      long l1 = geR.Dne(d1);
      long l2 = geR.Dne(d3);
      d1 -= l1;
      d3 -= l2;
      l1 %= 16777216L;
      l2 %= 16777216L;
      d1 += l1;
      d3 += l2;
      this.Dne[b].Dne(paramArrayOfdouble, d1, d2, d3, paramInt4, paramInt5, paramInt6, paramDouble1 * d, paramDouble2 * d, paramDouble3 * d, d);
      d /= 2.0D;
    } 
    return paramArrayOfdouble;
  }
  
  public double[] Dne(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3) {
    return Dne(paramArrayOfdouble, paramInt1, 10, paramInt2, paramInt3, 1, paramInt4, paramDouble1, 1.0D, paramDouble2);
  }
  
  public xvE(Random paramRandom, int paramInt) {
    this.Dne = paramInt;
    this.Dne = new wsW[paramInt];
    for (byte b = 0; b < paramInt; b++)
      this.Dne[b] = new wsW(paramRandom); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xvE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */