class Kzn extends WoN {
  float[] Dne = null;
  
  static void Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt) {
    int i = paramInt / 2;
    float[] arrayOfFloat1 = new float[i];
    float[] arrayOfFloat2 = new float[i];
    float[] arrayOfFloat3 = new float[i + 1];
    float[] arrayOfFloat4 = new float[i + 1];
    float[] arrayOfFloat5 = new float[i];
    float[] arrayOfFloat6 = new float[i];
    byte b1;
    for (b1 = 0; b1 < i; b1++) {
      arrayOfFloat1[b1] = (float)(-2.0D * Math.cos(paramArrayOffloat1[b1 * 2]));
      arrayOfFloat2[b1] = (float)(-2.0D * Math.cos(paramArrayOffloat1[b1 * 2 + 1]));
    } 
    byte b2;
    for (b2 = 0; b2 < i; b2++) {
      arrayOfFloat3[b2] = 0.0F;
      arrayOfFloat4[b2] = 1.0F;
      arrayOfFloat5[b2] = 0.0F;
      arrayOfFloat6[b2] = 1.0F;
    } 
    arrayOfFloat4[b2] = 1.0F;
    arrayOfFloat3[b2] = 1.0F;
    for (b1 = 1; b1 < paramInt + 1; b1++) {
      float f2 = 0.0F;
      float f1 = f2;
      for (b2 = 0; b2 < i; b2++) {
        float f = arrayOfFloat1[b2] * arrayOfFloat4[b2] + arrayOfFloat3[b2];
        arrayOfFloat3[b2] = arrayOfFloat4[b2];
        arrayOfFloat4[b2] = f1;
        f1 += f;
        f = arrayOfFloat2[b2] * arrayOfFloat6[b2] + arrayOfFloat5[b2];
        arrayOfFloat5[b2] = arrayOfFloat6[b2];
        arrayOfFloat6[b2] = f2;
        f2 += f;
      } 
      paramArrayOffloat2[b1 - 1] = (f1 + arrayOfFloat4[b2] + f2 - arrayOfFloat3[b2]) / 2.0F;
      arrayOfFloat4[b2] = f1;
      arrayOfFloat3[b2] = f2;
    } 
  }
  
  void FWm(Object paramObject) {}
  
  void bzF(Object paramObject) {}
  
  int Dne(MOU paramMOU, Object paramObject1, float[] paramArrayOffloat1, float[] paramArrayOffloat2, Object paramObject2) {
    return 0;
  }
  
  Object Dne(MOU paramMOU, Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_2
    //   1: checkcast QrG
    //   4: astore #4
    //   6: aload #4
    //   8: getfield Dne : LIAS;
    //   11: astore #5
    //   13: aconst_null
    //   14: astore #6
    //   16: aload_3
    //   17: instanceof [F
    //   20: ifeq -> 32
    //   23: aload_3
    //   24: checkcast [F
    //   27: checkcast [F
    //   30: astore #6
    //   32: aload_1
    //   33: getfield Dne : LqbC;
    //   36: aload #5
    //   38: getfield Qnq : I
    //   41: invokevirtual FWm : (I)I
    //   44: istore #7
    //   46: iload #7
    //   48: ifle -> 307
    //   51: iconst_1
    //   52: aload #5
    //   54: getfield Qnq : I
    //   57: ishl
    //   58: iconst_1
    //   59: isub
    //   60: istore #8
    //   62: iload #7
    //   64: i2f
    //   65: iload #8
    //   67: i2f
    //   68: fdiv
    //   69: aload #5
    //   71: getfield aFZ : I
    //   74: i2f
    //   75: fmul
    //   76: fstore #9
    //   78: aload_1
    //   79: getfield Dne : LqbC;
    //   82: aload #5
    //   84: getfield zGp : I
    //   87: invokestatic Dne : (I)I
    //   90: invokevirtual FWm : (I)I
    //   93: istore #10
    //   95: iload #10
    //   97: iconst_m1
    //   98: if_icmpeq -> 307
    //   101: iload #10
    //   103: aload #5
    //   105: getfield zGp : I
    //   108: if_icmpge -> 307
    //   111: aload_1
    //   112: getfield Dne : LAOl;
    //   115: getfield Dne : [LzbP;
    //   118: aload #5
    //   120: getfield Dne : [I
    //   123: iload #10
    //   125: iaload
    //   126: aaload
    //   127: astore #11
    //   129: fconst_0
    //   130: fstore #12
    //   132: aload #6
    //   134: ifnull -> 150
    //   137: aload #6
    //   139: arraylength
    //   140: aload #4
    //   142: getfield bzF : I
    //   145: iconst_1
    //   146: iadd
    //   147: if_icmpge -> 164
    //   150: aload #4
    //   152: getfield bzF : I
    //   155: iconst_1
    //   156: iadd
    //   157: newarray float
    //   159: astore #6
    //   161: goto -> 187
    //   164: iconst_0
    //   165: istore #13
    //   167: iload #13
    //   169: aload #6
    //   171: arraylength
    //   172: if_icmpge -> 187
    //   175: aload #6
    //   177: iload #13
    //   179: fconst_0
    //   180: fastore
    //   181: iinc #13, 1
    //   184: goto -> 167
    //   187: iconst_0
    //   188: istore #13
    //   190: iload #13
    //   192: aload #4
    //   194: getfield bzF : I
    //   197: if_icmpge -> 237
    //   200: aload #11
    //   202: aload #6
    //   204: iload #13
    //   206: aload_1
    //   207: getfield Dne : LqbC;
    //   210: aload #11
    //   212: getfield Dne : I
    //   215: invokevirtual bzF : ([FILqbC;I)I
    //   218: iconst_m1
    //   219: if_icmpne -> 224
    //   222: aconst_null
    //   223: areturn
    //   224: iload #13
    //   226: aload #11
    //   228: getfield Dne : I
    //   231: iadd
    //   232: istore #13
    //   234: goto -> 190
    //   237: iconst_0
    //   238: istore #13
    //   240: iload #13
    //   242: aload #4
    //   244: getfield bzF : I
    //   247: if_icmpge -> 294
    //   250: iconst_0
    //   251: istore #14
    //   253: iload #14
    //   255: aload #11
    //   257: getfield Dne : I
    //   260: if_icmpge -> 282
    //   263: aload #6
    //   265: iload #13
    //   267: dup2
    //   268: faload
    //   269: fload #12
    //   271: fadd
    //   272: fastore
    //   273: iinc #14, 1
    //   276: iinc #13, 1
    //   279: goto -> 253
    //   282: aload #6
    //   284: iload #13
    //   286: iconst_1
    //   287: isub
    //   288: faload
    //   289: fstore #12
    //   291: goto -> 240
    //   294: aload #6
    //   296: aload #4
    //   298: getfield bzF : I
    //   301: fload #9
    //   303: fastore
    //   304: aload #6
    //   306: areturn
    //   307: aconst_null
    //   308: areturn
  }
  
  Object Dne(Object paramObject) {
    VOn vOn = new VOn(this);
    IAS iAS = (IAS)paramObject;
    vOn.Dne = (Kzn)new int[iAS.Dne];
    vOn.Dne = (Kzn)new float[iAS.bzF];
    vOn.Dne = -1L;
    return vOn;
  }
  
  int Dne(MOU paramMOU, Object paramObject1, Object paramObject2, float[] paramArrayOffloat) {
    QrG qrG = (QrG)paramObject1;
    IAS iAS = qrG.Dne;
    if (paramObject2 != null) {
      float[] arrayOfFloat = (float[])paramObject2;
      float f = arrayOfFloat[qrG.bzF];
      kYk.Dne(paramArrayOffloat, (int[])qrG.Dne, qrG.Dne, qrG.FWm, arrayOfFloat, qrG.bzF, f, iAS.aFZ);
      return 1;
    } 
    for (byte b = 0; b < qrG.Dne; b++)
      paramArrayOffloat[b] = 0.0F; 
    return 0;
  }
  
  static float Dne(float paramFloat) {
    return (float)(13.1D * Math.atan(7.4E-4D * paramFloat) + 2.24D * Math.atan((paramFloat * paramFloat) * 1.85E-8D) + 1.0E-4D * paramFloat);
  }
  
  void Dne(Object paramObject, qbC paramqbC) {
    IAS iAS = (IAS)paramObject;
    paramqbC.Dne(iAS.Dne, 8);
    paramqbC.Dne(iAS.FWm, 16);
    paramqbC.Dne(iAS.bzF, 16);
    paramqbC.Dne(iAS.Qnq, 6);
    paramqbC.Dne(iAS.aFZ, 8);
    paramqbC.Dne(iAS.zGp - 1, 4);
    for (byte b = 0; b < iAS.zGp; b++)
      paramqbC.Dne(iAS.Dne[b], 8); 
  }
  
  static void Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2, float paramFloat, QrG paramQrG, String paramString, int paramInt) {
    float[] arrayOfFloat = new float[Math.max(paramQrG.FWm * 2, paramQrG.bzF * 2 + 2)];
    if (paramFloat == 0.0F) {
      for (byte b1 = 0; b1 < paramQrG.Dne; b1++)
        paramArrayOffloat1[b1] = 0.0F; 
      return;
    } 
    paramQrG.Dne.Dne(arrayOfFloat, paramArrayOffloat2, paramFloat);
    for (byte b = 0; b < paramQrG.Dne; b++)
      paramArrayOffloat1[b] = arrayOfFloat[paramQrG.Dne[b]]; 
  }
  
  void Dne(Object paramObject) {}
  
  Object Dne(AOl paramAOl, XEH paramXEH, Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LLth;
    //   4: astore #5
    //   6: aload_3
    //   7: checkcast IAS
    //   10: astore #6
    //   12: new QrG
    //   15: dup
    //   16: aload_0
    //   17: invokespecial <init> : (LKzn;)V
    //   20: astore #7
    //   22: aload #7
    //   24: aload #6
    //   26: getfield Dne : I
    //   29: putfield bzF : I
    //   32: aload #7
    //   34: aload #5
    //   36: getfield Dne : [I
    //   39: aload_2
    //   40: getfield Dne : I
    //   43: iaload
    //   44: iconst_2
    //   45: idiv
    //   46: putfield Dne : I
    //   49: aload #7
    //   51: aload #6
    //   53: getfield bzF : I
    //   56: putfield FWm : I
    //   59: aload #7
    //   61: aload #6
    //   63: putfield Dne : LIAS;
    //   66: aload #7
    //   68: getfield Dne : Ldyu;
    //   71: aload #7
    //   73: getfield FWm : I
    //   76: aload #7
    //   78: getfield bzF : I
    //   81: invokevirtual Dne : (II)V
    //   84: aload #7
    //   86: getfield FWm : I
    //   89: i2f
    //   90: aload #6
    //   92: getfield FWm : I
    //   95: i2d
    //   96: ldc2_w 2.0
    //   99: ddiv
    //   100: d2f
    //   101: invokestatic Dne : (F)F
    //   104: fdiv
    //   105: fstore #4
    //   107: aload #7
    //   109: aload #7
    //   111: getfield Dne : I
    //   114: newarray int
    //   116: putfield Dne : [I
    //   119: iconst_0
    //   120: istore #8
    //   122: iload #8
    //   124: aload #7
    //   126: getfield Dne : I
    //   129: if_icmpge -> 200
    //   132: aload #6
    //   134: getfield FWm : I
    //   137: i2d
    //   138: ldc2_w 2.0
    //   141: ddiv
    //   142: aload #7
    //   144: getfield Dne : I
    //   147: i2d
    //   148: ddiv
    //   149: iload #8
    //   151: i2d
    //   152: dmul
    //   153: d2f
    //   154: invokestatic Dne : (F)F
    //   157: fload #4
    //   159: fmul
    //   160: f2d
    //   161: invokestatic floor : (D)D
    //   164: d2i
    //   165: istore #9
    //   167: iload #9
    //   169: aload #7
    //   171: getfield FWm : I
    //   174: if_icmplt -> 184
    //   177: aload #7
    //   179: getfield FWm : I
    //   182: istore #9
    //   184: aload #7
    //   186: getfield Dne : [I
    //   189: iload #8
    //   191: iload #9
    //   193: iastore
    //   194: iinc #8, 1
    //   197: goto -> 122
    //   200: aload #7
    //   202: areturn
  }
  
  static float FWm(float paramFloat) {
    return (float)Math.exp(paramFloat * 0.11512925D);
  }
  
  int Dne(MOU paramMOU, Object paramObject, float[] paramArrayOffloat) {
    // Byte code:
    //   0: aload_2
    //   1: checkcast QrG
    //   4: astore #4
    //   6: aload #4
    //   8: getfield Dne : LIAS;
    //   11: astore #5
    //   13: aload_1
    //   14: getfield Dne : LqbC;
    //   17: aload #5
    //   19: getfield Qnq : I
    //   22: invokevirtual FWm : (I)I
    //   25: istore #6
    //   27: iload #6
    //   29: ifle -> 389
    //   32: iconst_1
    //   33: aload #5
    //   35: getfield Qnq : I
    //   38: ishl
    //   39: iconst_1
    //   40: isub
    //   41: istore #7
    //   43: iload #6
    //   45: i2f
    //   46: iload #7
    //   48: i2f
    //   49: fdiv
    //   50: aload #5
    //   52: getfield aFZ : I
    //   55: i2f
    //   56: fmul
    //   57: fstore #8
    //   59: aload_1
    //   60: getfield Dne : LqbC;
    //   63: aload #5
    //   65: getfield zGp : I
    //   68: invokestatic Dne : (I)I
    //   71: invokevirtual FWm : (I)I
    //   74: istore #9
    //   76: iload #9
    //   78: iconst_m1
    //   79: if_icmpeq -> 389
    //   82: iload #9
    //   84: aload #5
    //   86: getfield zGp : I
    //   89: if_icmpge -> 389
    //   92: aload_0
    //   93: dup
    //   94: astore #10
    //   96: monitorenter
    //   97: aload_0
    //   98: getfield Dne : [F
    //   101: ifnull -> 117
    //   104: aload_0
    //   105: getfield Dne : [F
    //   108: arraylength
    //   109: aload #4
    //   111: getfield bzF : I
    //   114: if_icmpge -> 131
    //   117: aload_0
    //   118: aload #4
    //   120: getfield bzF : I
    //   123: newarray float
    //   125: putfield Dne : [F
    //   128: goto -> 158
    //   131: iconst_0
    //   132: istore #11
    //   134: iload #11
    //   136: aload #4
    //   138: getfield bzF : I
    //   141: if_icmpge -> 158
    //   144: aload_0
    //   145: getfield Dne : [F
    //   148: iload #11
    //   150: fconst_0
    //   151: fastore
    //   152: iinc #11, 1
    //   155: goto -> 134
    //   158: aload_1
    //   159: getfield Dne : LAOl;
    //   162: getfield Dne : [LzbP;
    //   165: aload #5
    //   167: getfield Dne : [I
    //   170: iload #9
    //   172: iaload
    //   173: aaload
    //   174: astore #11
    //   176: fconst_0
    //   177: fstore #12
    //   179: iconst_0
    //   180: istore #13
    //   182: iload #13
    //   184: aload #4
    //   186: getfield bzF : I
    //   189: if_icmpge -> 203
    //   192: aload_3
    //   193: iload #13
    //   195: fconst_0
    //   196: fastore
    //   197: iinc #13, 1
    //   200: goto -> 182
    //   203: iconst_0
    //   204: istore #13
    //   206: iload #13
    //   208: aload #4
    //   210: getfield bzF : I
    //   213: if_icmpge -> 279
    //   216: aload #11
    //   218: aload_0
    //   219: getfield Dne : [F
    //   222: iload #13
    //   224: aload_1
    //   225: getfield Dne : LqbC;
    //   228: iconst_1
    //   229: iconst_m1
    //   230: invokevirtual Dne : ([FILqbC;II)I
    //   233: iconst_m1
    //   234: if_icmpne -> 266
    //   237: iconst_0
    //   238: istore #14
    //   240: iload #14
    //   242: aload #4
    //   244: getfield Dne : I
    //   247: if_icmpge -> 261
    //   250: aload_3
    //   251: iload #14
    //   253: fconst_0
    //   254: fastore
    //   255: iinc #14, 1
    //   258: goto -> 240
    //   261: iconst_0
    //   262: aload #10
    //   264: monitorexit
    //   265: ireturn
    //   266: iload #13
    //   268: aload #11
    //   270: getfield Dne : I
    //   273: iadd
    //   274: istore #13
    //   276: goto -> 206
    //   279: iconst_0
    //   280: istore #13
    //   282: iload #13
    //   284: aload #4
    //   286: getfield bzF : I
    //   289: if_icmpge -> 340
    //   292: iconst_0
    //   293: istore #14
    //   295: iload #14
    //   297: aload #11
    //   299: getfield Dne : I
    //   302: if_icmpge -> 326
    //   305: aload_0
    //   306: getfield Dne : [F
    //   309: iload #13
    //   311: dup2
    //   312: faload
    //   313: fload #12
    //   315: fadd
    //   316: fastore
    //   317: iinc #14, 1
    //   320: iinc #13, 1
    //   323: goto -> 295
    //   326: aload_0
    //   327: getfield Dne : [F
    //   330: iload #13
    //   332: iconst_1
    //   333: isub
    //   334: faload
    //   335: fstore #12
    //   337: goto -> 282
    //   340: aload_3
    //   341: aload #4
    //   343: getfield Dne : [I
    //   346: aload #4
    //   348: getfield Dne : I
    //   351: aload #4
    //   353: getfield FWm : I
    //   356: aload_0
    //   357: getfield Dne : [F
    //   360: aload #4
    //   362: getfield bzF : I
    //   365: fload #8
    //   367: aload #5
    //   369: getfield aFZ : I
    //   372: i2f
    //   373: invokestatic Dne : ([F[III[FIFF)V
    //   376: iconst_1
    //   377: aload #10
    //   379: monitorexit
    //   380: ireturn
    //   381: astore #15
    //   383: aload #10
    //   385: monitorexit
    //   386: aload #15
    //   388: athrow
    //   389: iconst_0
    //   390: ireturn
    // Exception table:
    //   from	to	target	type
    //   97	265	381	finally
    //   266	380	381	finally
    //   381	386	381	finally
  }
  
  Object Dne(Lth paramLth, qbC paramqbC) {
    IAS iAS = new IAS(this);
    iAS.Dne = paramqbC.FWm(8);
    iAS.FWm = paramqbC.FWm(16);
    iAS.bzF = paramqbC.FWm(16);
    iAS.Qnq = paramqbC.FWm(6);
    iAS.aFZ = paramqbC.FWm(8);
    iAS.zGp = paramqbC.FWm(4) + 1;
    if (iAS.Dne < true || iAS.FWm < 1 || iAS.bzF < 1 || iAS.zGp < 1)
      return null; 
    for (byte b = 0; b < iAS.zGp; b++) {
      iAS.Dne[b] = paramqbC.FWm(8);
      if (iAS.Dne[b] < 0 || iAS.Dne[b] >= paramLth.Zpi)
        return null; 
    } 
    return iAS;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Kzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */