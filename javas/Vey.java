class Vey {
  int bzF;
  
  static final int IjH;
  
  int DyG;
  
  int FWm;
  
  int zGp;
  
  int[] Dne;
  
  int Dne;
  
  static final int mrb = 768;
  
  int aFZ;
  
  int[] FWm;
  
  static final int div = 10;
  
  int Qnq;
  
  int Dne(qbC paramqbC) {
    int i;
    boolean bool = false;
    paramqbC.Dne(5653314, 24);
    paramqbC.Dne(this.Dne, 16);
    paramqbC.Dne(this.FWm, 24);
    byte b;
    for (b = 1; b < this.FWm && this.Dne[b] >= this.Dne[b - 1]; b++);
    if (b == this.FWm)
      bool = true; 
    if (bool) {
      byte b1 = 0;
      paramqbC.Dne(1, 1);
      paramqbC.Dne(this.Dne[0] - 1, 5);
      for (b = 1; b < this.FWm; b++) {
        int j = this.Dne[b];
        int k = this.Dne[b - 1];
        if (j > k)
          for (int m = k; m < j; m++) {
            paramqbC.Dne(b - b1, xHL.Dne(this.FWm - b1));
            b1 = b;
          }  
      } 
      paramqbC.Dne(b - b1, xHL.Dne(this.FWm - b1));
    } else {
      paramqbC.Dne(0, 1);
      for (b = 0; b < this.FWm && this.Dne[b] != 0; b++);
      if (b == this.FWm) {
        paramqbC.Dne(0, 1);
        for (b = 0; b < this.FWm; b++)
          paramqbC.Dne(this.Dne[b] - 1, 5); 
      } else {
        paramqbC.Dne(1, 1);
        for (b = 0; b < this.FWm; b++) {
          if (this.Dne[b] == 0) {
            paramqbC.Dne(0, 1);
          } else {
            paramqbC.Dne(1, 1);
            paramqbC.Dne(this.Dne[b] - 1, 5);
          } 
        } 
      } 
    } 
    paramqbC.Dne(this.bzF, 4);
    switch (this.bzF) {
      case 0:
        return 0;
      case 1:
      case 2:
        if (this.FWm == null)
          return -1; 
        paramqbC.Dne(this.Qnq, 32);
        paramqbC.Dne(this.aFZ, 32);
        paramqbC.Dne(this.zGp - 1, 4);
        paramqbC.Dne(this.DyG, 1);
        i = 0;
        switch (this.bzF) {
          case 1:
            i = Dne();
            break;
          case 2:
            i = this.FWm * this.Dne;
            break;
        } 
        for (b = 0; b < i; b++)
          paramqbC.Dne(Math.abs(this.FWm[b]), this.zGp); 
    } 
    return -1;
  }
  
  int FWm(qbC paramqbC) {
    // Byte code:
    //   0: aload_1
    //   1: bipush #24
    //   3: invokevirtual FWm : (I)I
    //   6: ldc 5653314
    //   8: if_icmpeq -> 17
    //   11: aload_0
    //   12: invokevirtual Dne : ()V
    //   15: iconst_m1
    //   16: ireturn
    //   17: aload_0
    //   18: aload_1
    //   19: bipush #16
    //   21: invokevirtual FWm : (I)I
    //   24: putfield Dne : I
    //   27: aload_0
    //   28: aload_1
    //   29: bipush #24
    //   31: invokevirtual FWm : (I)I
    //   34: putfield FWm : I
    //   37: aload_0
    //   38: getfield FWm : I
    //   41: iconst_m1
    //   42: if_icmpne -> 51
    //   45: aload_0
    //   46: invokevirtual Dne : ()V
    //   49: iconst_m1
    //   50: ireturn
    //   51: aload_1
    //   52: iconst_1
    //   53: invokevirtual FWm : (I)I
    //   56: lookupswitch default -> 294, 0 -> 84, 1 -> 204
    //   84: aload_0
    //   85: aload_0
    //   86: getfield FWm : I
    //   89: newarray int
    //   91: putfield Dne : [I
    //   94: aload_1
    //   95: iconst_1
    //   96: invokevirtual FWm : (I)I
    //   99: ifeq -> 162
    //   102: iconst_0
    //   103: istore_2
    //   104: iload_2
    //   105: aload_0
    //   106: getfield FWm : I
    //   109: if_icmpge -> 296
    //   112: aload_1
    //   113: iconst_1
    //   114: invokevirtual FWm : (I)I
    //   117: ifeq -> 149
    //   120: aload_1
    //   121: iconst_5
    //   122: invokevirtual FWm : (I)I
    //   125: istore_3
    //   126: iload_3
    //   127: iconst_m1
    //   128: if_icmpne -> 137
    //   131: aload_0
    //   132: invokevirtual Dne : ()V
    //   135: iconst_m1
    //   136: ireturn
    //   137: aload_0
    //   138: getfield Dne : [I
    //   141: iload_2
    //   142: iload_3
    //   143: iconst_1
    //   144: iadd
    //   145: iastore
    //   146: goto -> 156
    //   149: aload_0
    //   150: getfield Dne : [I
    //   153: iload_2
    //   154: iconst_0
    //   155: iastore
    //   156: iinc #2, 1
    //   159: goto -> 104
    //   162: iconst_0
    //   163: istore_2
    //   164: iload_2
    //   165: aload_0
    //   166: getfield FWm : I
    //   169: if_icmpge -> 296
    //   172: aload_1
    //   173: iconst_5
    //   174: invokevirtual FWm : (I)I
    //   177: istore_3
    //   178: iload_3
    //   179: iconst_m1
    //   180: if_icmpne -> 189
    //   183: aload_0
    //   184: invokevirtual Dne : ()V
    //   187: iconst_m1
    //   188: ireturn
    //   189: aload_0
    //   190: getfield Dne : [I
    //   193: iload_2
    //   194: iload_3
    //   195: iconst_1
    //   196: iadd
    //   197: iastore
    //   198: iinc #2, 1
    //   201: goto -> 164
    //   204: aload_1
    //   205: iconst_5
    //   206: invokevirtual FWm : (I)I
    //   209: iconst_1
    //   210: iadd
    //   211: istore_3
    //   212: aload_0
    //   213: aload_0
    //   214: getfield FWm : I
    //   217: newarray int
    //   219: putfield Dne : [I
    //   222: iconst_0
    //   223: istore_2
    //   224: iload_2
    //   225: aload_0
    //   226: getfield FWm : I
    //   229: if_icmpge -> 291
    //   232: aload_1
    //   233: aload_0
    //   234: getfield FWm : I
    //   237: iload_2
    //   238: isub
    //   239: invokestatic Dne : (I)I
    //   242: invokevirtual FWm : (I)I
    //   245: istore #4
    //   247: iload #4
    //   249: iconst_m1
    //   250: if_icmpne -> 259
    //   253: aload_0
    //   254: invokevirtual Dne : ()V
    //   257: iconst_m1
    //   258: ireturn
    //   259: iconst_0
    //   260: istore #5
    //   262: iload #5
    //   264: iload #4
    //   266: if_icmpge -> 285
    //   269: aload_0
    //   270: getfield Dne : [I
    //   273: iload_2
    //   274: iload_3
    //   275: iastore
    //   276: iinc #5, 1
    //   279: iinc #2, 1
    //   282: goto -> 262
    //   285: iinc #3, 1
    //   288: goto -> 224
    //   291: goto -> 296
    //   294: iconst_m1
    //   295: ireturn
    //   296: aload_0
    //   297: aload_1
    //   298: iconst_4
    //   299: invokevirtual FWm : (I)I
    //   302: dup_x1
    //   303: putfield bzF : I
    //   306: tableswitch default -> 481, 0 -> 332, 1 -> 335, 2 -> 335
    //   332: goto -> 487
    //   335: aload_0
    //   336: aload_1
    //   337: bipush #32
    //   339: invokevirtual FWm : (I)I
    //   342: putfield Qnq : I
    //   345: aload_0
    //   346: aload_1
    //   347: bipush #32
    //   349: invokevirtual FWm : (I)I
    //   352: putfield aFZ : I
    //   355: aload_0
    //   356: aload_1
    //   357: iconst_4
    //   358: invokevirtual FWm : (I)I
    //   361: iconst_1
    //   362: iadd
    //   363: putfield zGp : I
    //   366: aload_0
    //   367: aload_1
    //   368: iconst_1
    //   369: invokevirtual FWm : (I)I
    //   372: putfield DyG : I
    //   375: iconst_0
    //   376: istore_3
    //   377: aload_0
    //   378: getfield bzF : I
    //   381: lookupswitch default -> 426, 1 -> 408, 2 -> 416
    //   408: aload_0
    //   409: invokespecial Dne : ()I
    //   412: istore_3
    //   413: goto -> 426
    //   416: aload_0
    //   417: getfield FWm : I
    //   420: aload_0
    //   421: getfield Dne : I
    //   424: imul
    //   425: istore_3
    //   426: aload_0
    //   427: iload_3
    //   428: newarray int
    //   430: putfield FWm : [I
    //   433: iconst_0
    //   434: istore_2
    //   435: iload_2
    //   436: iload_3
    //   437: if_icmpge -> 460
    //   440: aload_0
    //   441: getfield FWm : [I
    //   444: iload_2
    //   445: aload_1
    //   446: aload_0
    //   447: getfield zGp : I
    //   450: invokevirtual FWm : (I)I
    //   453: iastore
    //   454: iinc #2, 1
    //   457: goto -> 435
    //   460: aload_0
    //   461: getfield FWm : [I
    //   464: iload_3
    //   465: iconst_1
    //   466: isub
    //   467: iaload
    //   468: iconst_m1
    //   469: if_icmpne -> 478
    //   472: aload_0
    //   473: invokevirtual Dne : ()V
    //   476: iconst_m1
    //   477: ireturn
    //   478: goto -> 487
    //   481: aload_0
    //   482: invokevirtual Dne : ()V
    //   485: iconst_m1
    //   486: ireturn
    //   487: iconst_0
    //   488: ireturn
  }
  
  static float Dne(float paramFloat, int paramInt) {
    return (float)(paramFloat * Math.pow(2.0D, paramInt));
  }
  
  static float Dne(int paramInt) {
    float f1 = (paramInt & 0x1FFFFF);
    float f2 = ((paramInt & 0x7FE00000) >>> 21);
    if ((paramInt & Integer.MIN_VALUE) != 0)
      f1 = -f1; 
    return Dne(f1, (int)f2 - 20 - 768);
  }
  
  void Dne() {}
  
  private int Dne() {
    for (int i = (int)Math.floor(Math.pow(this.FWm, 1.0D / this.Dne));; i++) {
      int j = 1;
      int k = 1;
      for (byte b = 0; b < this.Dne; b++) {
        j *= i;
        k *= i + 1;
      } 
      if (j <= this.FWm && k > this.FWm)
        return i; 
      if (j > this.FWm) {
        i--;
        continue;
      } 
    } 
  }
  
  static {
    IjH = 21;
  }
  
  static long Dne(float paramFloat) {
    int i = 0;
    if (paramFloat < 0.0F) {
      i = Integer.MIN_VALUE;
      paramFloat = -paramFloat;
    } 
    int j = (int)Math.floor(Math.log(paramFloat) / Math.log(2.0D));
    int k = (int)Math.rint(Math.pow(paramFloat, (20 - j)));
    j = j + 768 << 21;
    return (i | j | k);
  }
  
  float[] Dne() {
    if (this.bzF == 1 || this.bzF == 2) {
      int i;
      byte b;
      float f1 = Dne(this.Qnq);
      float f2 = Dne(this.aFZ);
      float[] arrayOfFloat = new float[this.FWm * this.Dne];
      switch (this.bzF) {
        case 1:
          i = Dne();
          for (b = 0; b < this.FWm; b++) {
            float f = 0.0F;
            int j = 1;
            for (byte b1 = 0; b1 < this.Dne; b1++) {
              int k = b / j % i;
              float f3 = this.FWm[k];
              f3 = Math.abs(f3) * f2 + f1 + f;
              if (this.DyG != 0)
                f = f3; 
              arrayOfFloat[b * this.Dne + b1] = f3;
              j *= i;
            } 
          } 
          break;
        case 2:
          for (b = 0; b < this.FWm; b++) {
            float f = 0.0F;
            for (byte b1 = 0; b1 < this.Dne; b1++) {
              float f3 = this.FWm[b * this.Dne + b1];
              f3 = Math.abs(f3) * f2 + f1 + f;
              if (this.DyG != 0)
                f = f3; 
              arrayOfFloat[b * this.Dne + b1] = f3;
            } 
          } 
          break;
      } 
      return arrayOfFloat;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Vey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */