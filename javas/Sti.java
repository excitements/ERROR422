class Sti {
  int[] Dne;
  
  float[] Dne;
  
  int FWm;
  
  float[] bzF = new float[1024];
  
  float[] FWm = new float[1024];
  
  float Dne;
  
  int Dne;
  
  private float[] Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3;
    byte b1 = 0;
    int j = paramInt3;
    int k = paramInt2;
    int m;
    for (m = 0; m < paramInt3; m++) {
      float f1 = paramArrayOffloat1[i] - paramArrayOffloat1[b1];
      paramArrayOffloat2[j + m] = paramArrayOffloat1[i++] + paramArrayOffloat1[b1++];
      float f2 = paramArrayOffloat1[i] - paramArrayOffloat1[b1];
      k -= 4;
      paramArrayOffloat2[m++] = f1 * this.Dne[k] + f2 * this.Dne[k + 1];
      paramArrayOffloat2[m] = f2 * this.Dne[k] - f1 * this.Dne[k + 1];
      paramArrayOffloat2[j + m] = paramArrayOffloat1[i++] + paramArrayOffloat1[b1++];
    } 
    for (m = 0; m < this.FWm - 3; m++) {
      int i1 = paramInt1 >>> m + 2;
      int i2 = 1 << m + 3;
      int i3 = paramInt2 - 2;
      k = 0;
      for (byte b = 0; b < i1 >>> 2; b++) {
        int i4 = i3;
        j = i4 - (i1 >> 1);
        int i5 = this.Dne[k];
        int i6 = this.Dne[k + 1];
        i3 -= 2;
        i1++;
        for (byte b5 = 0; b5 < 2 << m; b5++) {
          float f2 = paramArrayOffloat2[i4] - paramArrayOffloat2[j];
          paramArrayOffloat1[i4] = paramArrayOffloat2[i4] + paramArrayOffloat2[j];
          float f1 = paramArrayOffloat2[++i4] - paramArrayOffloat2[++j];
          paramArrayOffloat1[i4] = paramArrayOffloat2[i4] + paramArrayOffloat2[j];
          paramArrayOffloat1[j] = f1 * i5 - f2 * i6;
          paramArrayOffloat1[j - 1] = f2 * i5 + f1 * i6;
          i4 -= i1;
          j -= i1;
        } 
        i1--;
        k += i2;
      } 
      float[] arrayOfFloat = paramArrayOffloat2;
      paramArrayOffloat2 = paramArrayOffloat1;
      paramArrayOffloat1 = arrayOfFloat;
    } 
    m = paramInt1;
    byte b2 = 0;
    byte b3 = 0;
    int n = paramInt2 - 1;
    for (byte b4 = 0; b4 < paramInt4; b4++) {
      int i1 = this.Dne[b2++];
      int i2 = this.Dne[b2++];
      float f1 = paramArrayOffloat2[i1] - paramArrayOffloat2[i2 + 1];
      float f2 = paramArrayOffloat2[i1 - 1] + paramArrayOffloat2[i2];
      float f3 = paramArrayOffloat2[i1] + paramArrayOffloat2[i2 + 1];
      float f4 = paramArrayOffloat2[i1 - 1] - paramArrayOffloat2[i2];
      float f5 = f1 * this.Dne[m];
      float f6 = f2 * this.Dne[m++];
      float f7 = f1 * this.Dne[m];
      float f8 = f2 * this.Dne[m++];
      paramArrayOffloat1[b3++] = (f3 + f7 + f6) * 0.5F;
      paramArrayOffloat1[n--] = (-f4 + f8 - f5) * 0.5F;
      paramArrayOffloat1[b3++] = (f4 + f8 - f5) * 0.5F;
      paramArrayOffloat1[n--] = (f3 - f7 - f6) * 0.5F;
    } 
    return paramArrayOffloat1;
  }
  
  synchronized void FWm(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    if (this.FWm.length < this.Dne / 2)
      this.FWm = new float[this.Dne / 2]; 
    if (this.bzF.length < this.Dne / 2)
      this.bzF = new float[this.Dne / 2]; 
    float[] arrayOfFloat1 = this.FWm;
    float[] arrayOfFloat2 = this.bzF;
    int i = this.Dne >>> 1;
    int j = this.Dne >>> 2;
    int k = this.Dne >>> 3;
    int m = 1;
    byte b1 = 0;
    int n = i;
    int i1;
    for (i1 = 0; i1 < k; i1++) {
      n -= 2;
      arrayOfFloat1[b1++] = -paramArrayOffloat1[m + 2] * this.Dne[n + 1] - paramArrayOffloat1[m] * this.Dne[n];
      arrayOfFloat1[b1++] = paramArrayOffloat1[m] * this.Dne[n + 1] - paramArrayOffloat1[m + 2] * this.Dne[n];
      m += 4;
    } 
    m = i - 4;
    for (i1 = 0; i1 < k; i1++) {
      n -= 2;
      arrayOfFloat1[b1++] = paramArrayOffloat1[m] * this.Dne[n + 1] + paramArrayOffloat1[m + 2] * this.Dne[n];
      arrayOfFloat1[b1++] = paramArrayOffloat1[m] * this.Dne[n] - paramArrayOffloat1[m + 2] * this.Dne[n + 1];
      m -= 4;
    } 
    float[] arrayOfFloat3 = Dne(arrayOfFloat1, arrayOfFloat2, this.Dne, i, j, k);
    b1 = 0;
    n = i;
    i1 = j;
    int i2 = i1 - 1;
    int i3 = j + i;
    int i4 = i3 - 1;
    for (byte b2 = 0; b2 < j; b2++) {
      float f1 = arrayOfFloat3[b1] * this.Dne[n + 1] - arrayOfFloat3[b1 + 1] * this.Dne[n];
      float f2 = -(arrayOfFloat3[b1] * this.Dne[n] + arrayOfFloat3[b1 + 1] * this.Dne[n + 1]);
      paramArrayOffloat2[i1] = -f1;
      paramArrayOffloat2[i2] = f1;
      paramArrayOffloat2[i3] = f2;
      paramArrayOffloat2[i4] = f2;
      i1++;
      i2--;
      i3++;
      i4--;
      b1 += 2;
      n += 2;
    } 
  }
  
  void Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {}
  
  void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iconst_4
    //   3: idiv
    //   4: newarray int
    //   6: putfield Dne : [I
    //   9: aload_0
    //   10: iload_1
    //   11: iload_1
    //   12: iconst_4
    //   13: idiv
    //   14: iadd
    //   15: newarray float
    //   17: putfield Dne : [F
    //   20: aload_0
    //   21: iload_1
    //   22: i2d
    //   23: invokestatic log : (D)D
    //   26: ldc2_w 2.0
    //   29: invokestatic log : (D)D
    //   32: ddiv
    //   33: invokestatic rint : (D)D
    //   36: d2i
    //   37: putfield FWm : I
    //   40: aload_0
    //   41: iload_1
    //   42: putfield Dne : I
    //   45: iconst_0
    //   46: istore_2
    //   47: iconst_1
    //   48: istore_3
    //   49: iload_2
    //   50: iload_1
    //   51: iconst_2
    //   52: idiv
    //   53: iadd
    //   54: istore #4
    //   56: iload #4
    //   58: iconst_1
    //   59: iadd
    //   60: istore #5
    //   62: iload #4
    //   64: iload_1
    //   65: iconst_2
    //   66: idiv
    //   67: iadd
    //   68: istore #6
    //   70: iload #6
    //   72: iconst_1
    //   73: iadd
    //   74: istore #7
    //   76: iconst_0
    //   77: istore #8
    //   79: iload #8
    //   81: iload_1
    //   82: iconst_4
    //   83: idiv
    //   84: if_icmpge -> 212
    //   87: aload_0
    //   88: getfield Dne : [F
    //   91: iload_2
    //   92: iload #8
    //   94: iconst_2
    //   95: imul
    //   96: iadd
    //   97: ldc2_w 3.141592653589793
    //   100: iload_1
    //   101: i2d
    //   102: ddiv
    //   103: iconst_4
    //   104: iload #8
    //   106: imul
    //   107: i2d
    //   108: dmul
    //   109: invokestatic cos : (D)D
    //   112: d2f
    //   113: fastore
    //   114: aload_0
    //   115: getfield Dne : [F
    //   118: iload_3
    //   119: iload #8
    //   121: iconst_2
    //   122: imul
    //   123: iadd
    //   124: ldc2_w 3.141592653589793
    //   127: iload_1
    //   128: i2d
    //   129: ddiv
    //   130: iconst_4
    //   131: iload #8
    //   133: imul
    //   134: i2d
    //   135: dmul
    //   136: invokestatic sin : (D)D
    //   139: dneg
    //   140: d2f
    //   141: fastore
    //   142: aload_0
    //   143: getfield Dne : [F
    //   146: iload #4
    //   148: iload #8
    //   150: iconst_2
    //   151: imul
    //   152: iadd
    //   153: ldc2_w 3.141592653589793
    //   156: iconst_2
    //   157: iload_1
    //   158: imul
    //   159: i2d
    //   160: ddiv
    //   161: iconst_2
    //   162: iload #8
    //   164: imul
    //   165: iconst_1
    //   166: iadd
    //   167: i2d
    //   168: dmul
    //   169: invokestatic cos : (D)D
    //   172: d2f
    //   173: fastore
    //   174: aload_0
    //   175: getfield Dne : [F
    //   178: iload #5
    //   180: iload #8
    //   182: iconst_2
    //   183: imul
    //   184: iadd
    //   185: ldc2_w 3.141592653589793
    //   188: iconst_2
    //   189: iload_1
    //   190: imul
    //   191: i2d
    //   192: ddiv
    //   193: iconst_2
    //   194: iload #8
    //   196: imul
    //   197: iconst_1
    //   198: iadd
    //   199: i2d
    //   200: dmul
    //   201: invokestatic sin : (D)D
    //   204: d2f
    //   205: fastore
    //   206: iinc #8, 1
    //   209: goto -> 79
    //   212: iconst_0
    //   213: istore #8
    //   215: iload #8
    //   217: iload_1
    //   218: bipush #8
    //   220: idiv
    //   221: if_icmpge -> 291
    //   224: aload_0
    //   225: getfield Dne : [F
    //   228: iload #6
    //   230: iload #8
    //   232: iconst_2
    //   233: imul
    //   234: iadd
    //   235: ldc2_w 3.141592653589793
    //   238: iload_1
    //   239: i2d
    //   240: ddiv
    //   241: iconst_4
    //   242: iload #8
    //   244: imul
    //   245: iconst_2
    //   246: iadd
    //   247: i2d
    //   248: dmul
    //   249: invokestatic cos : (D)D
    //   252: d2f
    //   253: fastore
    //   254: aload_0
    //   255: getfield Dne : [F
    //   258: iload #7
    //   260: iload #8
    //   262: iconst_2
    //   263: imul
    //   264: iadd
    //   265: ldc2_w 3.141592653589793
    //   268: iload_1
    //   269: i2d
    //   270: ddiv
    //   271: iconst_4
    //   272: iload #8
    //   274: imul
    //   275: iconst_2
    //   276: iadd
    //   277: i2d
    //   278: dmul
    //   279: invokestatic sin : (D)D
    //   282: dneg
    //   283: d2f
    //   284: fastore
    //   285: iinc #8, 1
    //   288: goto -> 215
    //   291: iconst_1
    //   292: aload_0
    //   293: getfield FWm : I
    //   296: iconst_1
    //   297: isub
    //   298: ishl
    //   299: iconst_1
    //   300: isub
    //   301: istore #8
    //   303: iconst_1
    //   304: aload_0
    //   305: getfield FWm : I
    //   308: iconst_2
    //   309: isub
    //   310: ishl
    //   311: istore #9
    //   313: iconst_0
    //   314: istore #10
    //   316: iload #10
    //   318: iload_1
    //   319: bipush #8
    //   321: idiv
    //   322: if_icmpge -> 400
    //   325: iconst_0
    //   326: istore #11
    //   328: iconst_0
    //   329: istore #12
    //   331: iload #9
    //   333: iload #12
    //   335: iushr
    //   336: ifeq -> 365
    //   339: iload #9
    //   341: iload #12
    //   343: iushr
    //   344: iload #10
    //   346: iand
    //   347: ifeq -> 359
    //   350: iload #11
    //   352: iconst_1
    //   353: iload #12
    //   355: ishl
    //   356: ior
    //   357: istore #11
    //   359: iinc #12, 1
    //   362: goto -> 331
    //   365: aload_0
    //   366: getfield Dne : [I
    //   369: iload #10
    //   371: iconst_2
    //   372: imul
    //   373: iload #11
    //   375: iconst_m1
    //   376: ixor
    //   377: iload #8
    //   379: iand
    //   380: iastore
    //   381: aload_0
    //   382: getfield Dne : [I
    //   385: iload #10
    //   387: iconst_2
    //   388: imul
    //   389: iconst_1
    //   390: iadd
    //   391: iload #11
    //   393: iastore
    //   394: iinc #10, 1
    //   397: goto -> 316
    //   400: aload_0
    //   401: ldc 4.0
    //   403: iload_1
    //   404: i2f
    //   405: fdiv
    //   406: putfield Dne : F
    //   409: return
  }
  
  void Dne() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sti.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */