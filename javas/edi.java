import java.util.Random;

public class edi extends gwq {
  double aFZ;
  
  int Dne;
  
  Qnq Dne;
  
  double FWm;
  
  int bzF;
  
  double Dne;
  
  Random Dne;
  
  int[] Dne;
  
  int FWm;
  
  int aFZ;
  
  static final byte[] Dne = new byte[] { 2, 0, 0, 1, 2, 1 };
  
  double bzF;
  
  int Qnq;
  
  int[][] Dne = (int[][])new Random();
  
  double Qnq;
  
  public edi(boolean paramBoolean) {
    super(paramBoolean);
    this.Dne = (int[][])new int[] { 0, 0, 0 };
    this.Dne = false;
    this.Dne = 0.618D;
    this.FWm = 1.0D;
    this.bzF = 0.381D;
    this.Qnq = 1.0D;
    this.aFZ = 1.0D;
    this.bzF = true;
    this.Qnq = 12;
    this.aFZ = 4;
  }
  
  void FWm() {
    byte b = 0;
    int i = this.Dne.length;
    while (b < i) {
      int j = this.Dne[b][0];
      int k = this.Dne[b][1];
      int m = this.Dne[b][2];
      Dne(j, k, m);
      b++;
    } 
  }
  
  void Dne() {
    this.FWm = (int)(this.Dne * this.Dne);
    if (this.FWm >= this.Dne)
      this.FWm = this.Dne - 1; 
    int i = (int)(1.382D + Math.pow(this.aFZ * this.Dne / 13.0D, 2.0D));
    if (i < 1)
      i = 1; 
    int[][] arrayOfInt = new int[i * this.Dne][4];
    int j = this.Dne[1] + this.Dne - this.aFZ;
    byte b = 1;
    int k = this.Dne[1] + this.FWm;
    int m = j - this.Dne[1];
    arrayOfInt[0][0] = this.Dne[0];
    arrayOfInt[0][1] = j;
    arrayOfInt[0][2] = this.Dne[2];
    arrayOfInt[0][3] = k;
    j--;
    while (m >= 0) {
      byte b1 = 0;
      float f = Dne(m);
      if (f < 0.0F) {
        j--;
        m--;
        continue;
      } 
      double d = 0.5D;
      while (b1 < i) {
        double d1 = this.Qnq * f * (this.Dne.nextFloat() + 0.328D);
        double d2 = this.Dne.nextFloat() * 2.0D * Math.PI;
        int n = geR.FWm(d1 * Math.sin(d2) + this.Dne[0] + d);
        int i1 = geR.FWm(d1 * Math.cos(d2) + this.Dne[2] + d);
        int[] arrayOfInt1 = { n, j, i1 };
        int[] arrayOfInt2 = { n, j + this.aFZ, i1 };
        if (Dne(arrayOfInt1, arrayOfInt2) == -1) {
          int[] arrayOfInt3 = { this.Dne[0], this.Dne[1], this.Dne[2] };
          double d3 = Math.sqrt(Math.pow(Math.abs(this.Dne[0] - arrayOfInt1[0]), 2.0D) + Math.pow(Math.abs(this.Dne[2] - arrayOfInt1[2]), 2.0D));
          double d4 = d3 * this.bzF;
          if (arrayOfInt1[1] - d4 > k) {
            arrayOfInt3[1] = k;
          } else {
            arrayOfInt3[1] = (int)(arrayOfInt1[1] - d4);
          } 
          if (Dne(arrayOfInt3, arrayOfInt1) == -1) {
            arrayOfInt[b][0] = n;
            arrayOfInt[b][1] = j;
            arrayOfInt[b][2] = i1;
            arrayOfInt[b][3] = arrayOfInt3[1];
            b++;
          } 
        } 
        b1++;
      } 
      j--;
      m--;
    } 
    this.Dne = new int[b][4];
    System.arraycopy(arrayOfInt, 0, this.Dne, 0, b);
  }
  
  void Dne(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    int[] arrayOfInt = { 0, 0, 0 };
    byte b1 = 0;
    byte b2 = 0;
    while (b1 < 3) {
      arrayOfInt[b1] = paramArrayOfint2[b1] - paramArrayOfint1[b1];
      if (Math.abs(arrayOfInt[b1]) > Math.abs(arrayOfInt[b2]))
        b2 = b1; 
      b1 = (byte)(b1 + 1);
    } 
    if (arrayOfInt[b2] != 0) {
      byte b;
      int[] arrayOfInt1 = Dne[b2];
      int[] arrayOfInt2 = Dne[b2 + 3];
      if (arrayOfInt[b2] > 0) {
        b = 1;
      } else {
        b = -1;
      } 
      double d1 = arrayOfInt[arrayOfInt1] / arrayOfInt[b2];
      double d2 = arrayOfInt[arrayOfInt2] / arrayOfInt[b2];
      int[] arrayOfInt3 = { 0, 0, 0 };
      int i = 0;
      int j = arrayOfInt[b2] + b;
      while (i != j) {
        arrayOfInt3[b2] = geR.FWm((paramArrayOfint1[b2] + i) + 0.5D);
        arrayOfInt3[arrayOfInt1] = geR.FWm(paramArrayOfint1[arrayOfInt1] + i * d1 + 0.5D);
        arrayOfInt3[arrayOfInt2] = geR.FWm(paramArrayOfint1[arrayOfInt2] + i * d2 + 0.5D);
        byte b3 = 0;
        int k = Math.abs(arrayOfInt3[0] - paramArrayOfint1[0]);
        int m = Math.abs(arrayOfInt3[2] - paramArrayOfint1[2]);
        int n = Math.max(k, m);
        if (n > 0)
          if (k == n) {
            b3 = 4;
          } else if (m == n) {
            b3 = 8;
          }  
        Dne((Qnq)this.Dne, arrayOfInt3[0], arrayOfInt3[1], arrayOfInt3[2], paramInt, b3);
        i += b;
      } 
    } 
  }
  
  boolean Dne() {
    int[] arrayOfInt1 = { this.Dne[0], this.Dne[1], this.Dne[2] };
    int[] arrayOfInt2 = { this.Dne[0], this.Dne[1] + this.Dne - 1, this.Dne[2] };
    int i = this.Dne.Dne(this.Dne[0], this.Dne[1] - 1, this.Dne[2]);
    if (i != 2 && i != 3)
      return false; 
    int j = Dne(arrayOfInt1, arrayOfInt2);
    if (j == -1)
      return true; 
    if (j < 6)
      return false; 
    this.Dne = j;
    return true;
  }
  
  float Dne(int paramInt) {
    float f3;
    if (paramInt < this.Dne * 0.3D)
      return -1.618F; 
    float f1 = this.Dne / 2.0F;
    float f2 = this.Dne / 2.0F - paramInt;
    if (f2 == 0.0F) {
      f3 = f1;
    } else if (Math.abs(f2) >= f1) {
      f3 = 0.0F;
    } else {
      f3 = (float)Math.sqrt(Math.pow(Math.abs(f1), 2.0D) - Math.pow(Math.abs(f2), 2.0D));
    } 
    f3 *= 0.5F;
    return f3;
  }
  
  void Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2;
    int j = paramInt2 + this.aFZ;
    while (i < j) {
      float f = FWm(i - paramInt2);
      Dne(paramInt1, i, paramInt3, f, (byte)1, ((VOy)zKP.Dne).FWm);
      i++;
    } 
  }
  
  void Dne(int paramInt1, int paramInt2, int paramInt3, float paramFloat, byte paramByte, int paramInt4) {
    int i = (int)(paramFloat + 0.618D);
    int[] arrayOfInt1 = Dne[paramByte];
    int[] arrayOfInt2 = Dne[paramByte + 3];
    int[] arrayOfInt3 = { paramInt1, paramInt2, paramInt3 };
    int[] arrayOfInt4 = { 0, 0, 0 };
    int j = -i;
    int k = -i;
    arrayOfInt4[paramByte] = arrayOfInt3[paramByte];
    while (j <= i) {
      arrayOfInt4[arrayOfInt1] = arrayOfInt3[arrayOfInt1] + j;
      for (k = -i; k <= i; k++) {
        double d = Math.pow(Math.abs(j) + 0.5D, 2.0D) + Math.pow(Math.abs(k) + 0.5D, 2.0D);
        if (d > (paramFloat * paramFloat)) {
          k++;
          continue;
        } 
        arrayOfInt4[arrayOfInt2] = arrayOfInt3[arrayOfInt2] + k;
        int m = this.Dne.Dne(arrayOfInt4[0], arrayOfInt4[1], arrayOfInt4[2]);
        if (m != 0 && m != ((VOy)zKP.Dne).FWm) {
          k++;
          continue;
        } 
        Dne((Qnq)this.Dne, arrayOfInt4[0], arrayOfInt4[1], arrayOfInt4[2], paramInt4, 0);
      } 
      j++;
    } 
  }
  
  boolean Dne(int paramInt) {
    return (paramInt >= this.Dne * 0.2D);
  }
  
  float FWm(int paramInt) {
    return (paramInt >= 0 && paramInt < this.aFZ) ? ((paramInt != 0 && paramInt != this.aFZ - 1) ? 3.0F : 2.0F) : -1.0F;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Qnq = (int)(paramDouble1 * 12.0D);
    if (paramDouble1 > 0.5D)
      this.aFZ = 5; 
    this.Qnq = paramDouble2;
    this.aFZ = paramDouble3;
  }
  
  int Dne(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    byte b3;
    int[] arrayOfInt1 = { 0, 0, 0 };
    byte b1 = 0;
    byte b2 = 0;
    while (b1 < 3) {
      arrayOfInt1[b1] = paramArrayOfint2[b1] - paramArrayOfint1[b1];
      if (Math.abs(arrayOfInt1[b1]) > Math.abs(arrayOfInt1[b2]))
        b2 = b1; 
      b1 = (byte)(b1 + 1);
    } 
    if (arrayOfInt1[b2] == 0)
      return -1; 
    int[] arrayOfInt2 = Dne[b2];
    int[] arrayOfInt3 = Dne[b2 + 3];
    if (arrayOfInt1[b2] > 0) {
      b3 = 1;
    } else {
      b3 = -1;
    } 
    double d1 = arrayOfInt1[arrayOfInt2] / arrayOfInt1[b2];
    double d2 = arrayOfInt1[arrayOfInt3] / arrayOfInt1[b2];
    int[] arrayOfInt4 = { 0, 0, 0 };
    int i = 0;
    int j = arrayOfInt1[b2] + b3;
    while (i != j) {
      arrayOfInt4[b2] = paramArrayOfint1[b2] + i;
      arrayOfInt4[arrayOfInt2] = geR.FWm(paramArrayOfint1[arrayOfInt2] + i * d1);
      arrayOfInt4[arrayOfInt3] = geR.FWm(paramArrayOfint1[arrayOfInt3] + i * d2);
      int k = this.Dne.Dne(arrayOfInt4[0], arrayOfInt4[1], arrayOfInt4[2]);
      if (k != 0 && k != ((VOy)zKP.Dne).FWm)
        break; 
      i += b3;
    } 
    return (i == j) ? -1 : Math.abs(i);
  }
  
  void Qnq() {
    byte b = 0;
    int i = this.Dne.length;
    int[] arrayOfInt = { this.Dne[0], this.Dne[1], this.Dne[2] };
    while (b < i) {
      int[] arrayOfInt1 = this.Dne[b];
      int[] arrayOfInt2 = { arrayOfInt1[0], arrayOfInt1[1], arrayOfInt1[2] };
      arrayOfInt[1] = arrayOfInt1[3];
      int j = arrayOfInt[1] - this.Dne[1];
      if (Dne(j))
        Dne(arrayOfInt, arrayOfInt2, (byte)zKP.udO.FWm); 
      b++;
    } 
  }
  
  void bzF() {
    int[] arrayOfInt1 = this.Dne[0];
    int[] arrayOfInt2 = this.Dne[1];
    int i = this.Dne[1] + this.FWm;
    int[] arrayOfInt3 = this.Dne[2];
    int[] arrayOfInt4 = { arrayOfInt1, arrayOfInt2, arrayOfInt3 };
    int[] arrayOfInt5 = { arrayOfInt1, i, arrayOfInt3 };
    Dne(arrayOfInt4, arrayOfInt5, zKP.udO.FWm);
    if (this.bzF == 2) {
      arrayOfInt4[0] = arrayOfInt4[0] + 1;
      arrayOfInt5[0] = arrayOfInt5[0] + 1;
      Dne(arrayOfInt4, arrayOfInt5, zKP.udO.FWm);
      arrayOfInt4[2] = arrayOfInt4[2] + 1;
      arrayOfInt5[2] = arrayOfInt5[2] + 1;
      Dne(arrayOfInt4, arrayOfInt5, zKP.udO.FWm);
      arrayOfInt4[0] = arrayOfInt4[0] + -1;
      arrayOfInt5[0] = arrayOfInt5[0] + -1;
      Dne(arrayOfInt4, arrayOfInt5, zKP.udO.FWm);
    } 
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = (int[][])paramQnq;
    long l = paramRandom.nextLong();
    this.Dne.setSeed(l);
    this.Dne[0] = paramInt1;
    this.Dne[1] = paramInt2;
    this.Dne[2] = paramInt3;
    if (this.Dne == null)
      this.Dne = 5 + this.Dne.nextInt(this.Qnq); 
    if (!Dne())
      return false; 
    Dne();
    FWm();
    bzF();
    Qnq();
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\edi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */