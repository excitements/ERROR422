class pEl extends bFq {
  static int[][] Dne;
  
  private static int[][][] Dne = new int[2][][];
  
  static {
    Dne = (int[][][])null;
  }
  
  void Dne(Object paramObject, qbC paramqbC) {
    WPn wPn = (WPn)paramObject;
    int i = 0;
    paramqbC.Dne(wPn.Dne, 24);
    paramqbC.Dne(wPn.FWm, 24);
    paramqbC.Dne(wPn.bzF - 1, 24);
    paramqbC.Dne(wPn.Qnq - 1, 6);
    paramqbC.Dne(wPn.aFZ, 8);
    byte b;
    for (b = 0; b < wPn.Qnq; b++) {
      float f = wPn.Dne[b];
      if (xHL.Dne(f) > 3) {
        paramqbC.Dne(f, 3);
        paramqbC.Dne(1, 1);
        paramqbC.Dne(f >>> 3, 5);
      } else {
        paramqbC.Dne(f, 4);
      } 
      i += xHL.bzF(f);
    } 
    for (b = 0; b < i; b++)
      paramqbC.Dne(wPn.FWm[b], 8); 
  }
  
  void FWm(Object paramObject) {}
  
  Object Dne(AOl paramAOl, XEH paramXEH, Object paramObject) {
    // Byte code:
    //   0: aload_3
    //   1: checkcast WPn
    //   4: astore #4
    //   6: new hFW
    //   9: dup
    //   10: aload_0
    //   11: invokespecial <init> : (LpEl;)V
    //   14: astore #5
    //   16: iconst_0
    //   17: istore #6
    //   19: iconst_0
    //   20: istore #8
    //   22: aload #5
    //   24: aload #4
    //   26: putfield Dne : LWPn;
    //   29: aload #5
    //   31: aload_2
    //   32: getfield Qnq : I
    //   35: putfield Dne : I
    //   38: aload #5
    //   40: aload #4
    //   42: getfield Qnq : I
    //   45: putfield FWm : I
    //   48: aload #5
    //   50: aload_1
    //   51: getfield Dne : [LzbP;
    //   54: putfield Dne : [LzbP;
    //   57: aload #5
    //   59: aload_1
    //   60: getfield Dne : [LzbP;
    //   63: aload #4
    //   65: getfield aFZ : I
    //   68: aaload
    //   69: putfield Dne : LzbP;
    //   72: aload #5
    //   74: getfield Dne : LzbP;
    //   77: getfield Dne : I
    //   80: istore #7
    //   82: aload #5
    //   84: aload #5
    //   86: getfield FWm : I
    //   89: anewarray [I
    //   92: putfield Dne : [[I
    //   95: iconst_0
    //   96: istore #9
    //   98: iload #9
    //   100: aload #5
    //   102: getfield FWm : I
    //   105: if_icmpge -> 207
    //   108: aload #4
    //   110: getfield Dne : [I
    //   113: iload #9
    //   115: iaload
    //   116: istore #10
    //   118: iload #10
    //   120: invokestatic Dne : (I)I
    //   123: istore #11
    //   125: iload #11
    //   127: ifeq -> 201
    //   130: iload #11
    //   132: iload #8
    //   134: if_icmple -> 141
    //   137: iload #11
    //   139: istore #8
    //   141: aload #5
    //   143: getfield Dne : [[I
    //   146: iload #9
    //   148: iload #11
    //   150: newarray int
    //   152: aastore
    //   153: iconst_0
    //   154: istore #12
    //   156: iload #12
    //   158: iload #11
    //   160: if_icmpge -> 201
    //   163: iload #10
    //   165: iconst_1
    //   166: iload #12
    //   168: ishl
    //   169: iand
    //   170: ifeq -> 195
    //   173: aload #5
    //   175: getfield Dne : [[I
    //   178: iload #9
    //   180: aaload
    //   181: iload #12
    //   183: aload #4
    //   185: getfield FWm : [I
    //   188: iload #6
    //   190: iinc #6, 1
    //   193: iaload
    //   194: iastore
    //   195: iinc #12, 1
    //   198: goto -> 156
    //   201: iinc #9, 1
    //   204: goto -> 98
    //   207: aload #5
    //   209: aload #5
    //   211: getfield FWm : I
    //   214: i2d
    //   215: iload #7
    //   217: i2d
    //   218: invokestatic pow : (DD)D
    //   221: invokestatic rint : (D)D
    //   224: d2i
    //   225: putfield Qnq : I
    //   228: aload #5
    //   230: iload #8
    //   232: putfield bzF : I
    //   235: aload #5
    //   237: aload #5
    //   239: getfield Qnq : I
    //   242: anewarray [I
    //   245: putfield FWm : [[I
    //   248: iconst_0
    //   249: istore #9
    //   251: iload #9
    //   253: aload #5
    //   255: getfield Qnq : I
    //   258: if_icmpge -> 352
    //   261: iload #9
    //   263: istore #10
    //   265: aload #5
    //   267: getfield Qnq : I
    //   270: aload #5
    //   272: getfield FWm : I
    //   275: idiv
    //   276: istore #11
    //   278: aload #5
    //   280: getfield FWm : [[I
    //   283: iload #9
    //   285: iload #7
    //   287: newarray int
    //   289: aastore
    //   290: iconst_0
    //   291: istore #12
    //   293: iload #12
    //   295: iload #7
    //   297: if_icmpge -> 346
    //   300: iload #10
    //   302: iload #11
    //   304: idiv
    //   305: istore #13
    //   307: iload #10
    //   309: iload #13
    //   311: iload #11
    //   313: imul
    //   314: isub
    //   315: istore #10
    //   317: iload #11
    //   319: aload #5
    //   321: getfield FWm : I
    //   324: idiv
    //   325: istore #11
    //   327: aload #5
    //   329: getfield FWm : [[I
    //   332: iload #9
    //   334: aaload
    //   335: iload #12
    //   337: iload #13
    //   339: iastore
    //   340: iinc #12, 1
    //   343: goto -> 293
    //   346: iinc #9, 1
    //   349: goto -> 251
    //   352: aload #5
    //   354: areturn
  }
  
  Object Dne(Lth paramLth, qbC paramqbC) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: new WPn
    //   5: dup
    //   6: aload_0
    //   7: invokespecial <init> : (LpEl;)V
    //   10: astore #4
    //   12: aload #4
    //   14: aload_2
    //   15: bipush #24
    //   17: invokevirtual FWm : (I)I
    //   20: putfield Dne : I
    //   23: aload #4
    //   25: aload_2
    //   26: bipush #24
    //   28: invokevirtual FWm : (I)I
    //   31: putfield FWm : I
    //   34: aload #4
    //   36: aload_2
    //   37: bipush #24
    //   39: invokevirtual FWm : (I)I
    //   42: iconst_1
    //   43: iadd
    //   44: putfield bzF : I
    //   47: aload #4
    //   49: aload_2
    //   50: bipush #6
    //   52: invokevirtual FWm : (I)I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield Qnq : I
    //   60: aload #4
    //   62: aload_2
    //   63: bipush #8
    //   65: invokevirtual FWm : (I)I
    //   68: putfield aFZ : I
    //   71: iconst_0
    //   72: istore #5
    //   74: iload #5
    //   76: aload #4
    //   78: getfield Qnq : I
    //   81: if_icmpge -> 135
    //   84: aload_2
    //   85: iconst_3
    //   86: invokevirtual FWm : (I)I
    //   89: istore #6
    //   91: aload_2
    //   92: iconst_1
    //   93: invokevirtual FWm : (I)I
    //   96: ifeq -> 111
    //   99: iload #6
    //   101: aload_2
    //   102: iconst_5
    //   103: invokevirtual FWm : (I)I
    //   106: iconst_3
    //   107: ishl
    //   108: ior
    //   109: istore #6
    //   111: aload #4
    //   113: getfield Dne : [I
    //   116: iload #5
    //   118: iload #6
    //   120: iastore
    //   121: iload_3
    //   122: iload #6
    //   124: invokestatic bzF : (I)I
    //   127: iadd
    //   128: istore_3
    //   129: iinc #5, 1
    //   132: goto -> 74
    //   135: iconst_0
    //   136: istore #5
    //   138: iload #5
    //   140: iload_3
    //   141: if_icmpge -> 164
    //   144: aload #4
    //   146: getfield FWm : [I
    //   149: iload #5
    //   151: aload_2
    //   152: bipush #8
    //   154: invokevirtual FWm : (I)I
    //   157: iastore
    //   158: iinc #5, 1
    //   161: goto -> 138
    //   164: aload #4
    //   166: getfield aFZ : I
    //   169: aload_1
    //   170: getfield Zpi : I
    //   173: if_icmplt -> 184
    //   176: aload_0
    //   177: aload #4
    //   179: invokevirtual Dne : (Ljava/lang/Object;)V
    //   182: aconst_null
    //   183: areturn
    //   184: iconst_0
    //   185: istore #5
    //   187: iload #5
    //   189: iload_3
    //   190: if_icmpge -> 222
    //   193: aload #4
    //   195: getfield FWm : [I
    //   198: iload #5
    //   200: iaload
    //   201: aload_1
    //   202: getfield Zpi : I
    //   205: if_icmplt -> 216
    //   208: aload_0
    //   209: aload #4
    //   211: invokevirtual Dne : (Ljava/lang/Object;)V
    //   214: aconst_null
    //   215: areturn
    //   216: iinc #5, 1
    //   219: goto -> 187
    //   222: aload #4
    //   224: areturn
  }
  
  static synchronized int Dne(MOU paramMOU, Object paramObject, float[][] paramArrayOffloat, int paramInt) {
    hFW hFW = (hFW)paramObject;
    pEl pEl1 = hFW.Dne;
    int[] arrayOfInt = ((WPn)pEl1).bzF;
    float[] arrayOfFloat = ((zbP)hFW.Dne).Dne;
    int i = ((WPn)pEl1).FWm - ((WPn)pEl1).Dne;
    int j = i / arrayOfInt;
    int k = (j + arrayOfFloat - 1) / arrayOfFloat;
    if (Dne == null || Dne.length < k)
      Dne = (int[][][])new int[k][]; 
    for (byte b = 0; b < hFW.bzF; b++) {
      byte b1 = 0;
      for (byte b2 = 0; b1 < j; b2++) {
        if (b == 0) {
          int m = hFW.Dne.Dne((qbC)paramMOU.Dne);
          if (m == -1)
            return 0; 
          Dne[b2] = (int[][])hFW.FWm[m];
          if (Dne[b2] == null)
            return 0; 
        } 
        byte b3 = 0;
        while (b3 < arrayOfFloat && b1 < j) {
          int m = ((WPn)pEl1).Dne + b1 * arrayOfInt;
          int[] arrayOfInt1 = Dne[b2][b3];
          if ((((WPn)pEl1).Dne[arrayOfInt1] & 1 << b) != 0) {
            pEl pEl2 = hFW.Dne[hFW.Dne[arrayOfInt1][b]];
            if (pEl2 != null && pEl2.Dne(paramArrayOffloat, m, paramInt, (qbC)paramMOU.Dne, arrayOfInt) == -1)
              return 0; 
          } 
          b3++;
          b1++;
        } 
      } 
    } 
    return 0;
  }
  
  static synchronized int Dne(MOU paramMOU, Object paramObject, float[][] paramArrayOffloat, int paramInt1, int paramInt2) {
    hFW hFW = (hFW)paramObject;
    pEl pEl1 = hFW.Dne;
    int[] arrayOfInt = ((WPn)pEl1).bzF;
    float[] arrayOfFloat = ((zbP)hFW.Dne).Dne;
    int i = ((WPn)pEl1).FWm - ((WPn)pEl1).Dne;
    int j = i / arrayOfInt;
    int k = (j + arrayOfFloat - 1) / arrayOfFloat;
    if (Dne.length < paramInt1)
      Dne = new int[paramInt1][][]; 
    byte b1;
    for (b1 = 0; b1 < paramInt1; b1++) {
      if (Dne[b1] == null || (Dne[b1]).length < k)
        Dne[b1] = new int[k][]; 
    } 
    for (byte b2 = 0; b2 < hFW.bzF; b2++) {
      byte b3 = 0;
      for (byte b4 = 0; b3 < j; b4++) {
        if (b2 == 0)
          for (b1 = 0; b1 < paramInt1; b1++) {
            int m = hFW.Dne.Dne((qbC)paramMOU.Dne);
            if (m == -1)
              return 0; 
            Dne[b1][b4] = hFW.FWm[m];
            if (Dne[b1][b4] == null)
              return 0; 
          }  
        byte b = 0;
        while (b < arrayOfFloat && b3 < j) {
          for (b1 = 0; b1 < paramInt1; b1++) {
            int m = ((WPn)pEl1).Dne + b3 * arrayOfInt;
            int n = Dne[b1][b4][b];
            if ((((WPn)pEl1).Dne[n] & 1 << b2) != 0) {
              pEl pEl2 = hFW.Dne[hFW.Dne[n][b2]];
              if (pEl2 != null)
                if (paramInt2 == 0) {
                  if (pEl2.Dne(paramArrayOffloat[b1], m, (qbC)paramMOU.Dne, arrayOfInt) == -1)
                    return 0; 
                } else if (paramInt2 == 1 && pEl2.FWm(paramArrayOffloat[b1], m, (qbC)paramMOU.Dne, arrayOfInt) == -1) {
                  return 0;
                }  
            } 
          } 
          b++;
          b3++;
        } 
      } 
    } 
    return 0;
  }
  
  void Dne(Object paramObject) {}
  
  int Dne(MOU paramMOU, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt; b2++) {
      if (paramArrayOfint[b2] != 0)
        paramArrayOffloat[b1++] = paramArrayOffloat[b2]; 
    } 
    return (b1 != 0) ? Dne(paramMOU, paramObject, paramArrayOffloat, b1, 0) : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pEl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */