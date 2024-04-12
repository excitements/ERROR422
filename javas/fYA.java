import java.util.Random;

public class fYA extends Suj {
  static {
  
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/Random;
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/Random;
    //   12: bipush #10
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
    //   33: iconst_5
    //   34: invokevirtual nextInt : (I)I
    //   37: ifeq -> 43
    //   40: iconst_0
    //   41: istore #7
    //   43: iconst_0
    //   44: istore #8
    //   46: iload #8
    //   48: iload #7
    //   50: if_icmpge -> 258
    //   53: iload_2
    //   54: bipush #16
    //   56: imul
    //   57: aload_0
    //   58: getfield Dne : Ljava/util/Random;
    //   61: bipush #16
    //   63: invokevirtual nextInt : (I)I
    //   66: iadd
    //   67: i2d
    //   68: dstore #9
    //   70: aload_0
    //   71: getfield Dne : Ljava/util/Random;
    //   74: sipush #128
    //   77: invokevirtual nextInt : (I)I
    //   80: i2d
    //   81: dstore #11
    //   83: iload_3
    //   84: bipush #16
    //   86: imul
    //   87: aload_0
    //   88: getfield Dne : Ljava/util/Random;
    //   91: bipush #16
    //   93: invokevirtual nextInt : (I)I
    //   96: iadd
    //   97: i2d
    //   98: dstore #13
    //   100: iconst_1
    //   101: istore #15
    //   103: aload_0
    //   104: getfield Dne : Ljava/util/Random;
    //   107: iconst_4
    //   108: invokevirtual nextInt : (I)I
    //   111: ifne -> 150
    //   114: aload_0
    //   115: aload_0
    //   116: getfield Dne : Ljava/util/Random;
    //   119: invokevirtual nextLong : ()J
    //   122: iload #4
    //   124: iload #5
    //   126: aload #6
    //   128: dload #9
    //   130: dload #11
    //   132: dload #13
    //   134: invokevirtual Dne : (JII[BDDD)V
    //   137: iload #15
    //   139: aload_0
    //   140: getfield Dne : Ljava/util/Random;
    //   143: iconst_4
    //   144: invokevirtual nextInt : (I)I
    //   147: iadd
    //   148: istore #15
    //   150: iconst_0
    //   151: istore #16
    //   153: iload #16
    //   155: iload #15
    //   157: if_icmpge -> 252
    //   160: aload_0
    //   161: getfield Dne : Ljava/util/Random;
    //   164: invokevirtual nextFloat : ()F
    //   167: ldc 3.1415927
    //   169: fmul
    //   170: fconst_2
    //   171: fmul
    //   172: fstore #17
    //   174: aload_0
    //   175: getfield Dne : Ljava/util/Random;
    //   178: invokevirtual nextFloat : ()F
    //   181: ldc 0.5
    //   183: fsub
    //   184: fconst_2
    //   185: fmul
    //   186: ldc 8.0
    //   188: fdiv
    //   189: fstore #18
    //   191: aload_0
    //   192: getfield Dne : Ljava/util/Random;
    //   195: invokevirtual nextFloat : ()F
    //   198: fconst_2
    //   199: fmul
    //   200: aload_0
    //   201: getfield Dne : Ljava/util/Random;
    //   204: invokevirtual nextFloat : ()F
    //   207: fadd
    //   208: fstore #19
    //   210: aload_0
    //   211: aload_0
    //   212: getfield Dne : Ljava/util/Random;
    //   215: invokevirtual nextLong : ()J
    //   218: iload #4
    //   220: iload #5
    //   222: aload #6
    //   224: dload #9
    //   226: dload #11
    //   228: dload #13
    //   230: fload #19
    //   232: fconst_2
    //   233: fmul
    //   234: fload #17
    //   236: fload #18
    //   238: iconst_0
    //   239: iconst_0
    //   240: ldc2_w 0.5
    //   243: invokevirtual Dne : (JII[BDDDFFFIID)V
    //   246: iinc #16, 1
    //   249: goto -> 153
    //   252: iinc #8, 1
    //   255: goto -> 46
    //   258: return
  }
  
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
      if (!bool1 && paramInt3 == i && paramFloat1 > 1.0F) {
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
                  if (paramArrayOfbyte[i6] == ((byt)zKP.FWm).FWm || paramArrayOfbyte[i6] == ((zKP)zKP.div).FWm)
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
                for (int i6 = n - 1; i6 >= m; i6--) {
                  double d10 = (i6 + 0.5D - paramDouble2) / d4;
                  if (d10 > -0.7D && d * d + d10 * d10 + d9 * d9 < 1.0D) {
                    byte b = paramArrayOfbyte[i5];
                    if (b == zKP.KLR.FWm || b == zKP.FWm.FWm || b == ((ZQN)zKP.Dne).FWm)
                      paramArrayOfbyte[i5] = 0; 
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


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fYA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */