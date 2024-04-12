class kYk {
  static final float Dne = 3.1415927F;
  
  static void Dne(float[] paramArrayOffloat1, int[] paramArrayOfint, int paramInt1, int paramInt2, float[] paramArrayOffloat2, int paramInt3, float paramFloat1, float paramFloat2) {
    float f = 3.1415927F / paramInt2;
    byte b;
    for (b = 0; b < paramInt3; b++)
      paramArrayOffloat2[b] = PjC.Dne(paramArrayOffloat2[b]); 
    int i = paramInt3 / 2 * 2;
    b = 0;
    label33: while (b < paramInt1) {
      int j = paramArrayOfint[b];
      float f1 = 0.70710677F;
      float f2 = 0.70710677F;
      float f3 = PjC.Dne(f * j);
      int k;
      for (k = 0; k < i; k += 2) {
        f2 *= paramArrayOffloat2[k] - f3;
        f1 *= paramArrayOffloat2[k + 1] - f3;
      } 
      if ((paramInt3 & 0x1) != 0) {
        f2 *= paramArrayOffloat2[paramInt3 - 1] - f3;
        f2 *= f2;
        f1 *= f1 * (1.0F - f3 * f3);
      } else {
        f2 *= f2 * (1.0F + f3);
        f1 *= f1 * (1.0F - f3);
      } 
      f2 = f1 + f2;
      k = Float.floatToIntBits(f2);
      int m = Integer.MAX_VALUE & k;
      int n = 0;
      if (m < 2139095040 && m != 0) {
        if (m < 8388608) {
          f2 = (float)(f2 * 3.3554432E7D);
          k = Float.floatToIntBits(f2);
          m = Integer.MAX_VALUE & k;
          n = -25;
        } 
        n += (m >>> 23) - 126;
        k = k & 0x807FFFFF | 0x3F000000;
        f2 = Float.intBitsToFloat(k);
      } 
      f2 = PjC.bzF(paramFloat1 * PjC.FWm(f2) * PjC.Dne(n + paramInt3) - paramFloat2);
      while (true) {
        paramArrayOffloat1[b++] = paramArrayOffloat1[b++] * f2;
        if (b < paramInt1) {
          if (paramArrayOfint[b] != j)
            continue label33; 
          continue;
        } 
        continue label33;
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kYk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */