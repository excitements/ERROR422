import java.util.Random;

public class KLR extends Suj {
  protected void Dne(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4) {
    double d1 = (paramInt1 * 16 + 8);
    double d2 = (paramInt2 * 16 + 8);
    float f1 = 0.0F;
    float f2 = 0.0F;
    Random random = new Random(paramLong);
    if (paramInt4 <= 0) {
      int j = this.Dne * 16 - 16;
      paramInt4 = j - random.nextInt(j / 4);
    } 
    boolean bool1 = false;
    if (paramInt3 == -1) {
      paramInt3 = paramInt4 / 2;
      bool1 = true;
    } 
    int i = random.nextInt(paramInt4 / 2) + paramInt4 / 4;
    boolean bool2 = (random.nextInt(6) == 0) ? true : false;
    while (paramInt3 < paramInt4) {
      double d3 = 1.5D + (geR.Dne(paramInt3 * 3.1415927F / paramInt4) * paramFloat1 * 1.0F);
      double d4 = d3 * paramDouble4;
      float f3 = geR.FWm(paramFloat3);
      float f4 = geR.Dne(paramFloat3);
      paramDouble1 += (geR.FWm(paramFloat2) * f3);
      paramDouble2 += f4;
      paramDouble3 += (geR.Dne(paramFloat2) * f3);
      if (bool2) {
        paramFloat3 *= 0.92F;
      } else {
        paramFloat3 *= 0.7F;
      } 
      paramFloat3 += f2 * 0.1F;
      paramFloat2 += f1 * 0.1F;
      f2 *= 0.9F;
      f1 *= 0.75F;
      f2 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
      f1 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
      if (!bool1 && paramInt3 == i && paramFloat1 > 1.0F && paramInt4 > 0) {
        Dne(random.nextLong(), paramInt1, paramInt2, paramArrayOfbyte, paramDouble1, paramDouble2, paramDouble3, random.nextFloat() * 0.5F + 0.5F, paramFloat2 - 1.5707964F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
        Dne(random.nextLong(), paramInt1, paramInt2, paramArrayOfbyte, paramDouble1, paramDouble2, paramDouble3, random.nextFloat() * 0.5F + 0.5F, paramFloat2 + 1.5707964F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
        return;
      } 
      if (bool1 || random.nextInt(4) != 0) {
        double d5 = paramDouble1 - d1;
        double d6 = paramDouble3 - d2;
        double d7 = (paramInt4 - paramInt3);
        double d8 = (paramFloat1 + 2.0F + 16.0F);
        if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8)
          return; 
        if (paramDouble1 >= d1 - 16.0D - d3 * 2.0D && paramDouble3 >= d2 - 16.0D - d3 * 2.0D && paramDouble1 <= d1 + 16.0D + d3 * 2.0D && paramDouble3 <= d2 + 16.0D + d3 * 2.0D) {
          int j = geR.FWm(paramDouble1 - d3) - paramInt1 * 16 - 1;
          int k = geR.FWm(paramDouble1 + d3) - paramInt1 * 16 + 1;
          int m = geR.FWm(paramDouble2 - d4) - 1;
          int n = geR.FWm(paramDouble2 + d4) + 1;
          int i1 = geR.FWm(paramDouble3 - d3) - paramInt2 * 16 - 1;
          int i2 = geR.FWm(paramDouble3 + d3) - paramInt2 * 16 + 1;
          if (j < 0)
            j = 0; 
          if (k > 16)
            k = 16; 
          if (m < 1)
            m = 1; 
          if (n > 120)
            n = 120; 
          if (i1 < 0)
            i1 = 0; 
          if (i2 > 16)
            i2 = 16; 
          boolean bool = false;
          int i3;
          for (i3 = j; !bool && i3 < k; i3++) {
            for (int i4 = i1; !bool && i4 < i2; i4++) {
              for (int i5 = n + 1; !bool && i5 >= m - 1; i5--) {
                int i6 = (i3 * 16 + i4) * 128 + i5;
                if (i5 >= 0 && i5 < 128) {
                  if (paramArrayOfbyte[i6] == ((byt)zKP.Dne).FWm || paramArrayOfbyte[i6] == ((zKP)zKP.DyG).FWm)
                    bool = true; 
                  if (i5 != m - 1 && i3 != j && i3 != k - 1 && i4 != i1 && i4 != i2 - 1)
                    i5 = m; 
                } 
              } 
            } 
          } 
          if (!bool) {
            for (i3 = j; i3 < k; i3++) {
              double d = ((i3 + paramInt1 * 16) + 0.5D - paramDouble1) / d3;
              for (int i4 = i1; i4 < i2; i4++) {
                double d9 = ((i4 + paramInt2 * 16) + 0.5D - paramDouble3) / d3;
                int i5 = (i3 * 16 + i4) * 128 + n;
                boolean bool3 = false;
                if (d * d + d9 * d9 < 1.0D)
                  for (int i6 = n - 1; i6 >= m; i6--) {
                    double d10 = (i6 + 0.5D - paramDouble2) / d4;
                    if (d10 > -0.7D && d * d + d10 * d10 + d9 * d9 < 1.0D) {
                      byte b = paramArrayOfbyte[i5];
                      if (b == ((ZQN)zKP.Dne).FWm)
                        bool3 = true; 
                      if (b == zKP.Dne.FWm || b == zKP.FWm.FWm || b == ((ZQN)zKP.Dne).FWm)
                        if (i6 < 10) {
                          paramArrayOfbyte[i5] = (byte)((byt)zKP.FWm).FWm;
                        } else {
                          paramArrayOfbyte[i5] = 0;
                          if (bool3 && paramArrayOfbyte[i5 - 1] == zKP.FWm.FWm)
                            paramArrayOfbyte[i5 - 1] = (this.Dne.Dne(i3 + paramInt1 * 16, i4 + paramInt2 * 16)).Dne; 
                        }  
                    } 
                    i5--;
                  }  
              } 
            } 
            if (bool1)
              break; 
          } 
        } 
      } 
      paramInt3++;
    } 
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/Random;
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/Random;
    //   12: bipush #40
    //   14: invokevirtual nextInt : (I)I
    //   17: iconst_1
    //   18: iadd
    //   19: invokevirtual nextInt : (I)I
    //   22: iconst_1
    //   23: iadd
    //   24: invokevirtual nextInt : (I)I
    //   27: istore #7
    //   29: aload_0
    //   30: getfield Dne : Ljava/util/Random;
    //   33: bipush #15
    //   35: invokevirtual nextInt : (I)I
    //   38: ifeq -> 44
    //   41: iconst_0
    //   42: istore #7
    //   44: iconst_0
    //   45: istore #8
    //   47: iload #8
    //   49: iload #7
    //   51: if_icmpge -> 301
    //   54: iload_2
    //   55: bipush #16
    //   57: imul
    //   58: aload_0
    //   59: getfield Dne : Ljava/util/Random;
    //   62: bipush #16
    //   64: invokevirtual nextInt : (I)I
    //   67: iadd
    //   68: i2d
    //   69: dstore #9
    //   71: aload_0
    //   72: getfield Dne : Ljava/util/Random;
    //   75: aload_0
    //   76: getfield Dne : Ljava/util/Random;
    //   79: bipush #120
    //   81: invokevirtual nextInt : (I)I
    //   84: bipush #8
    //   86: iadd
    //   87: invokevirtual nextInt : (I)I
    //   90: i2d
    //   91: dstore #11
    //   93: iload_3
    //   94: bipush #16
    //   96: imul
    //   97: aload_0
    //   98: getfield Dne : Ljava/util/Random;
    //   101: bipush #16
    //   103: invokevirtual nextInt : (I)I
    //   106: iadd
    //   107: i2d
    //   108: dstore #13
    //   110: iconst_1
    //   111: istore #15
    //   113: aload_0
    //   114: getfield Dne : Ljava/util/Random;
    //   117: iconst_4
    //   118: invokevirtual nextInt : (I)I
    //   121: ifne -> 160
    //   124: aload_0
    //   125: aload_0
    //   126: getfield Dne : Ljava/util/Random;
    //   129: invokevirtual nextLong : ()J
    //   132: iload #4
    //   134: iload #5
    //   136: aload #6
    //   138: dload #9
    //   140: dload #11
    //   142: dload #13
    //   144: invokevirtual Dne : (JII[BDDD)V
    //   147: iload #15
    //   149: aload_0
    //   150: getfield Dne : Ljava/util/Random;
    //   153: iconst_4
    //   154: invokevirtual nextInt : (I)I
    //   157: iadd
    //   158: istore #15
    //   160: iconst_0
    //   161: istore #16
    //   163: iload #16
    //   165: iload #15
    //   167: if_icmpge -> 295
    //   170: aload_0
    //   171: getfield Dne : Ljava/util/Random;
    //   174: invokevirtual nextFloat : ()F
    //   177: ldc 3.1415927
    //   179: fmul
    //   180: fconst_2
    //   181: fmul
    //   182: fstore #17
    //   184: aload_0
    //   185: getfield Dne : Ljava/util/Random;
    //   188: invokevirtual nextFloat : ()F
    //   191: ldc 0.5
    //   193: fsub
    //   194: fconst_2
    //   195: fmul
    //   196: ldc 8.0
    //   198: fdiv
    //   199: fstore #18
    //   201: aload_0
    //   202: getfield Dne : Ljava/util/Random;
    //   205: invokevirtual nextFloat : ()F
    //   208: fconst_2
    //   209: fmul
    //   210: aload_0
    //   211: getfield Dne : Ljava/util/Random;
    //   214: invokevirtual nextFloat : ()F
    //   217: fadd
    //   218: fstore #19
    //   220: aload_0
    //   221: getfield Dne : Ljava/util/Random;
    //   224: bipush #10
    //   226: invokevirtual nextInt : (I)I
    //   229: ifne -> 257
    //   232: fload #19
    //   234: aload_0
    //   235: getfield Dne : Ljava/util/Random;
    //   238: invokevirtual nextFloat : ()F
    //   241: aload_0
    //   242: getfield Dne : Ljava/util/Random;
    //   245: invokevirtual nextFloat : ()F
    //   248: fmul
    //   249: ldc 3.0
    //   251: fmul
    //   252: fconst_1
    //   253: fadd
    //   254: fmul
    //   255: fstore #19
    //   257: aload_0
    //   258: aload_0
    //   259: getfield Dne : Ljava/util/Random;
    //   262: invokevirtual nextLong : ()J
    //   265: iload #4
    //   267: iload #5
    //   269: aload #6
    //   271: dload #9
    //   273: dload #11
    //   275: dload #13
    //   277: fload #19
    //   279: fload #17
    //   281: fload #18
    //   283: iconst_0
    //   284: iconst_0
    //   285: dconst_1
    //   286: invokevirtual Dne : (JII[BDDDFFFIID)V
    //   289: iinc #16, 1
    //   292: goto -> 163
    //   295: iinc #8, 1
    //   298: goto -> 47
    //   301: return
  }
  
  static {
  
  }
  
  protected void Dne(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfbyte, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: aload_0
    //   1: lload_1
    //   2: iload_3
    //   3: iload #4
    //   5: aload #5
    //   7: dload #6
    //   9: dload #8
    //   11: dload #10
    //   13: fconst_1
    //   14: aload_0
    //   15: getfield Dne : Ljava/util/Random;
    //   18: invokevirtual nextFloat : ()F
    //   21: ldc 6.0
    //   23: fmul
    //   24: fadd
    //   25: fconst_0
    //   26: fconst_0
    //   27: iconst_m1
    //   28: iconst_m1
    //   29: ldc2_w 0.5
    //   32: invokevirtual Dne : (JII[BDDDFFFIID)V
    //   35: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KLR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */