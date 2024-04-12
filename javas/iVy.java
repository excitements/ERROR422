class iVy extends WoN {
  static final int Dne = '';
  
  private static float[] Dne;
  
  static final int FWm = 63;
  
  void FWm(Object paramObject) {}
  
  private static void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOffloat) {
    int i = paramInt4 - paramInt3;
    int j = paramInt2 - paramInt1;
    int k = Math.abs(i);
    int m = i / j;
    int n = (i < 0) ? (m - 1) : (m + 1);
    int i1 = paramInt1;
    int i2 = paramInt3;
    int i3 = 0;
    k -= Math.abs(m * j);
    paramArrayOffloat[i1] = paramArrayOffloat[i1] * Dne[i2];
    while (++i1 < paramInt2) {
      i3 += k;
      if (i3 >= j) {
        i3 -= j;
        i2 += n;
      } else {
        i2 += m;
      } 
      paramArrayOffloat[i1] = paramArrayOffloat[i1] * Dne[i2];
    } 
  }
  
  Object Dne(Lth paramLth, qbC paramqbC) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_m1
    //   3: istore #4
    //   5: new QwU
    //   8: dup
    //   9: aload_0
    //   10: invokespecial <init> : (LiVy;)V
    //   13: astore #6
    //   15: aload #6
    //   17: aload_2
    //   18: iconst_5
    //   19: invokevirtual FWm : (I)I
    //   22: putfield Qnq : I
    //   25: iconst_0
    //   26: istore #7
    //   28: iload #7
    //   30: aload #6
    //   32: getfield Qnq : I
    //   35: if_icmpge -> 80
    //   38: aload #6
    //   40: getfield Dne : [I
    //   43: iload #7
    //   45: aload_2
    //   46: iconst_4
    //   47: invokevirtual FWm : (I)I
    //   50: iastore
    //   51: iload #4
    //   53: aload #6
    //   55: getfield Dne : [I
    //   58: iload #7
    //   60: iaload
    //   61: if_icmpge -> 74
    //   64: aload #6
    //   66: getfield Dne : [I
    //   69: iload #7
    //   71: iaload
    //   72: istore #4
    //   74: iinc #7, 1
    //   77: goto -> 28
    //   80: iconst_0
    //   81: istore #7
    //   83: iload #7
    //   85: iload #4
    //   87: iconst_1
    //   88: iadd
    //   89: if_icmpge -> 285
    //   92: aload #6
    //   94: getfield FWm : [I
    //   97: iload #7
    //   99: aload_2
    //   100: iconst_3
    //   101: invokevirtual FWm : (I)I
    //   104: iconst_1
    //   105: iadd
    //   106: iastore
    //   107: aload #6
    //   109: getfield bzF : [I
    //   112: iload #7
    //   114: aload_2
    //   115: iconst_2
    //   116: invokevirtual FWm : (I)I
    //   119: iastore
    //   120: aload #6
    //   122: getfield bzF : [I
    //   125: iload #7
    //   127: iaload
    //   128: ifge -> 138
    //   131: aload #6
    //   133: invokevirtual Dne : ()V
    //   136: aconst_null
    //   137: areturn
    //   138: aload #6
    //   140: getfield bzF : [I
    //   143: iload #7
    //   145: iaload
    //   146: ifeq -> 163
    //   149: aload #6
    //   151: getfield Qnq : [I
    //   154: iload #7
    //   156: aload_2
    //   157: bipush #8
    //   159: invokevirtual FWm : (I)I
    //   162: iastore
    //   163: aload #6
    //   165: getfield Qnq : [I
    //   168: iload #7
    //   170: iaload
    //   171: iflt -> 189
    //   174: aload #6
    //   176: getfield Qnq : [I
    //   179: iload #7
    //   181: iaload
    //   182: aload_1
    //   183: getfield Zpi : I
    //   186: if_icmplt -> 196
    //   189: aload #6
    //   191: invokevirtual Dne : ()V
    //   194: aconst_null
    //   195: areturn
    //   196: iconst_0
    //   197: istore #8
    //   199: iload #8
    //   201: iconst_1
    //   202: aload #6
    //   204: getfield bzF : [I
    //   207: iload #7
    //   209: iaload
    //   210: ishl
    //   211: if_icmpge -> 279
    //   214: aload #6
    //   216: getfield Dne : [[I
    //   219: iload #7
    //   221: aaload
    //   222: iload #8
    //   224: aload_2
    //   225: bipush #8
    //   227: invokevirtual FWm : (I)I
    //   230: iconst_1
    //   231: isub
    //   232: iastore
    //   233: aload #6
    //   235: getfield Dne : [[I
    //   238: iload #7
    //   240: aaload
    //   241: iload #8
    //   243: iaload
    //   244: iconst_m1
    //   245: if_icmplt -> 266
    //   248: aload #6
    //   250: getfield Dne : [[I
    //   253: iload #7
    //   255: aaload
    //   256: iload #8
    //   258: iaload
    //   259: aload_1
    //   260: getfield Zpi : I
    //   263: if_icmplt -> 273
    //   266: aload #6
    //   268: invokevirtual Dne : ()V
    //   271: aconst_null
    //   272: areturn
    //   273: iinc #8, 1
    //   276: goto -> 199
    //   279: iinc #7, 1
    //   282: goto -> 83
    //   285: aload #6
    //   287: aload_2
    //   288: iconst_2
    //   289: invokevirtual FWm : (I)I
    //   292: iconst_1
    //   293: iadd
    //   294: putfield aFZ : I
    //   297: aload_2
    //   298: iconst_4
    //   299: invokevirtual FWm : (I)I
    //   302: istore #5
    //   304: iconst_0
    //   305: istore #7
    //   307: iconst_0
    //   308: istore #8
    //   310: iload #7
    //   312: aload #6
    //   314: getfield Qnq : I
    //   317: if_icmpge -> 395
    //   320: iload_3
    //   321: aload #6
    //   323: getfield FWm : [I
    //   326: aload #6
    //   328: getfield Dne : [I
    //   331: iload #7
    //   333: iaload
    //   334: iaload
    //   335: iadd
    //   336: istore_3
    //   337: iload #8
    //   339: iload_3
    //   340: if_icmpge -> 389
    //   343: aload #6
    //   345: getfield aFZ : [I
    //   348: iload #8
    //   350: iconst_2
    //   351: iadd
    //   352: aload_2
    //   353: iload #5
    //   355: invokevirtual FWm : (I)I
    //   358: dup_x2
    //   359: iastore
    //   360: istore #9
    //   362: iload #9
    //   364: iflt -> 376
    //   367: iload #9
    //   369: iconst_1
    //   370: iload #5
    //   372: ishl
    //   373: if_icmplt -> 383
    //   376: aload #6
    //   378: invokevirtual Dne : ()V
    //   381: aconst_null
    //   382: areturn
    //   383: iinc #8, 1
    //   386: goto -> 337
    //   389: iinc #7, 1
    //   392: goto -> 310
    //   395: aload #6
    //   397: getfield aFZ : [I
    //   400: iconst_0
    //   401: iconst_0
    //   402: iastore
    //   403: aload #6
    //   405: getfield aFZ : [I
    //   408: iconst_1
    //   409: iconst_1
    //   410: iload #5
    //   412: ishl
    //   413: iastore
    //   414: aload #6
    //   416: areturn
  }
  
  private static int Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt3 &= 0x7FFF;
    paramInt4 &= 0x7FFF;
    int i = paramInt4 - paramInt3;
    int j = paramInt2 - paramInt1;
    int k = Math.abs(i);
    int m = k * (paramInt5 - paramInt1);
    int n = m / j;
    return (i < 0) ? (paramInt3 - n) : (paramInt3 + n);
  }
  
  int Dne(MOU paramMOU, Object paramObject1, Object paramObject2, float[] paramArrayOffloat) {
    Ett ett = (Ett)paramObject1;
    iVy iVy1 = ett.Dne;
    int i = ((AOl)paramMOU.Dne).Dne.Dne[paramMOU.aFZ] / 2;
    if (paramObject2 != null) {
      int[] arrayOfInt = (int[])paramObject2;
      int j = 0;
      int k = 0;
      int m = arrayOfInt[0] * ((QwU)iVy1).aFZ;
      int n;
      for (n = 1; n < ett.FWm; n++) {
        int i1 = ett.FWm[n];
        int i2 = arrayOfInt[i1] & 0x7FFF;
        if (i2 == arrayOfInt[i1]) {
          i2 *= ((QwU)iVy1).aFZ;
          j = ((QwU)iVy1).aFZ[i1];
          Dne(k, j, m, i2, paramArrayOffloat);
          k = j;
          m = i2;
        } 
      } 
      for (n = j; n < i; n++)
        paramArrayOffloat[n] = paramArrayOffloat[n] * paramArrayOffloat[n - 1]; 
      return 1;
    } 
    for (byte b = 0; b < i; b++)
      paramArrayOffloat[b] = 0.0F; 
    return 0;
  }
  
  void Dne(Object paramObject, qbC paramqbC) {
    iVy iVy1;
    QwU qwU = (QwU)paramObject;
    int i = 0;
    int k = qwU.aFZ[1];
    byte b = -1;
    paramqbC.Dne(qwU.Qnq, 5);
    byte b1;
    for (b1 = 0; b1 < qwU.Qnq; b1++) {
      paramqbC.Dne(qwU.Dne[b1], 4);
      if (b < qwU.Dne[b1])
        iVy1 = qwU.Dne[b1]; 
    } 
    for (b1 = 0; b1 < iVy1 + 1; b1++) {
      paramqbC.Dne(qwU.FWm[b1] - 1, 3);
      paramqbC.Dne(qwU.bzF[b1], 2);
      if (qwU.bzF[b1] != 0)
        paramqbC.Dne(qwU.Qnq[b1], 8); 
      for (byte b3 = 0; b3 < 1 << qwU.bzF[b1]; b3++)
        paramqbC.Dne(qwU.Dne[b1][b3] + 1, 8); 
    } 
    paramqbC.Dne(qwU.aFZ - 1, 2);
    paramqbC.Dne(xHL.FWm(k), 4);
    int j = xHL.FWm(k);
    b1 = 0;
    byte b2 = 0;
    while (b1 < qwU.Qnq) {
      i += qwU.FWm[qwU.Dne[b1]];
      while (b2 < i) {
        paramqbC.Dne(qwU.aFZ[b2 + 2], j);
        b2++;
      } 
      b1++;
    } 
  }
  
  Object Dne(MOU paramMOU, Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_2
    //   1: checkcast Ett
    //   4: astore #4
    //   6: aload #4
    //   8: getfield Dne : LQwU;
    //   11: astore #5
    //   13: aload_1
    //   14: getfield Dne : LAOl;
    //   17: getfield Dne : [LzbP;
    //   20: astore #6
    //   22: aload_1
    //   23: getfield Dne : LqbC;
    //   26: iconst_1
    //   27: invokevirtual FWm : (I)I
    //   30: iconst_1
    //   31: if_icmpne -> 588
    //   34: aconst_null
    //   35: astore #7
    //   37: aload_3
    //   38: instanceof [I
    //   41: ifeq -> 53
    //   44: aload_3
    //   45: checkcast [I
    //   48: checkcast [I
    //   51: astore #7
    //   53: aload #7
    //   55: ifnull -> 69
    //   58: aload #7
    //   60: arraylength
    //   61: aload #4
    //   63: getfield FWm : I
    //   66: if_icmpge -> 81
    //   69: aload #4
    //   71: getfield FWm : I
    //   74: newarray int
    //   76: astore #7
    //   78: goto -> 104
    //   81: iconst_0
    //   82: istore #8
    //   84: iload #8
    //   86: aload #7
    //   88: arraylength
    //   89: if_icmpge -> 104
    //   92: aload #7
    //   94: iload #8
    //   96: iconst_0
    //   97: iastore
    //   98: iinc #8, 1
    //   101: goto -> 84
    //   104: aload #7
    //   106: iconst_0
    //   107: aload_1
    //   108: getfield Dne : LqbC;
    //   111: aload #4
    //   113: getfield Qnq : I
    //   116: iconst_1
    //   117: isub
    //   118: invokestatic Dne : (I)I
    //   121: invokevirtual FWm : (I)I
    //   124: iastore
    //   125: aload #7
    //   127: iconst_1
    //   128: aload_1
    //   129: getfield Dne : LqbC;
    //   132: aload #4
    //   134: getfield Qnq : I
    //   137: iconst_1
    //   138: isub
    //   139: invokestatic Dne : (I)I
    //   142: invokevirtual FWm : (I)I
    //   145: iastore
    //   146: iconst_0
    //   147: istore #8
    //   149: iconst_2
    //   150: istore #9
    //   152: iload #8
    //   154: aload #5
    //   156: getfield Qnq : I
    //   159: if_icmpge -> 329
    //   162: aload #5
    //   164: getfield Dne : [I
    //   167: iload #8
    //   169: iaload
    //   170: istore #10
    //   172: aload #5
    //   174: getfield FWm : [I
    //   177: iload #10
    //   179: iaload
    //   180: istore #11
    //   182: aload #5
    //   184: getfield bzF : [I
    //   187: iload #10
    //   189: iaload
    //   190: istore #12
    //   192: iconst_1
    //   193: iload #12
    //   195: ishl
    //   196: istore #13
    //   198: iconst_0
    //   199: istore #14
    //   201: iload #12
    //   203: ifeq -> 234
    //   206: aload #6
    //   208: aload #5
    //   210: getfield Qnq : [I
    //   213: iload #10
    //   215: iaload
    //   216: aaload
    //   217: aload_1
    //   218: getfield Dne : LqbC;
    //   221: invokevirtual Dne : (LqbC;)I
    //   224: istore #14
    //   226: iload #14
    //   228: iconst_m1
    //   229: if_icmpne -> 234
    //   232: aconst_null
    //   233: areturn
    //   234: iconst_0
    //   235: istore #15
    //   237: iload #15
    //   239: iload #11
    //   241: if_icmpge -> 316
    //   244: aload #5
    //   246: getfield Dne : [[I
    //   249: iload #10
    //   251: aaload
    //   252: iload #14
    //   254: iload #13
    //   256: iconst_1
    //   257: isub
    //   258: iand
    //   259: iaload
    //   260: istore #16
    //   262: iload #14
    //   264: iload #12
    //   266: iushr
    //   267: istore #14
    //   269: iload #16
    //   271: iflt -> 301
    //   274: aload #7
    //   276: iload #9
    //   278: iload #15
    //   280: iadd
    //   281: aload #6
    //   283: iload #16
    //   285: aaload
    //   286: aload_1
    //   287: getfield Dne : LqbC;
    //   290: invokevirtual Dne : (LqbC;)I
    //   293: dup_x2
    //   294: iastore
    //   295: iconst_m1
    //   296: if_icmpne -> 310
    //   299: aconst_null
    //   300: areturn
    //   301: aload #7
    //   303: iload #9
    //   305: iload #15
    //   307: iadd
    //   308: iconst_0
    //   309: iastore
    //   310: iinc #15, 1
    //   313: goto -> 237
    //   316: iload #9
    //   318: iload #11
    //   320: iadd
    //   321: istore #9
    //   323: iinc #8, 1
    //   326: goto -> 152
    //   329: iconst_2
    //   330: istore #8
    //   332: iload #8
    //   334: aload #4
    //   336: getfield FWm : I
    //   339: if_icmpge -> 585
    //   342: aload #5
    //   344: getfield aFZ : [I
    //   347: aload #4
    //   349: getfield aFZ : [I
    //   352: iload #8
    //   354: iconst_2
    //   355: isub
    //   356: iaload
    //   357: iaload
    //   358: aload #5
    //   360: getfield aFZ : [I
    //   363: aload #4
    //   365: getfield Qnq : [I
    //   368: iload #8
    //   370: iconst_2
    //   371: isub
    //   372: iaload
    //   373: iaload
    //   374: aload #7
    //   376: aload #4
    //   378: getfield aFZ : [I
    //   381: iload #8
    //   383: iconst_2
    //   384: isub
    //   385: iaload
    //   386: iaload
    //   387: aload #7
    //   389: aload #4
    //   391: getfield Qnq : [I
    //   394: iload #8
    //   396: iconst_2
    //   397: isub
    //   398: iaload
    //   399: iaload
    //   400: aload #5
    //   402: getfield aFZ : [I
    //   405: iload #8
    //   407: iaload
    //   408: invokestatic Dne : (IIIII)I
    //   411: istore #9
    //   413: aload #4
    //   415: getfield Qnq : I
    //   418: iload #9
    //   420: isub
    //   421: istore #10
    //   423: iload #9
    //   425: istore #11
    //   427: iload #10
    //   429: iload #11
    //   431: if_icmpge -> 439
    //   434: iload #10
    //   436: goto -> 441
    //   439: iload #11
    //   441: iconst_1
    //   442: ishl
    //   443: istore #12
    //   445: aload #7
    //   447: iload #8
    //   449: iaload
    //   450: istore #13
    //   452: iload #13
    //   454: ifeq -> 569
    //   457: iload #13
    //   459: iload #12
    //   461: if_icmplt -> 493
    //   464: iload #10
    //   466: iload #11
    //   468: if_icmple -> 481
    //   471: iload #13
    //   473: iload #11
    //   475: isub
    //   476: istore #13
    //   478: goto -> 518
    //   481: iconst_m1
    //   482: iload #13
    //   484: iload #10
    //   486: isub
    //   487: isub
    //   488: istore #13
    //   490: goto -> 518
    //   493: iload #13
    //   495: iconst_1
    //   496: iand
    //   497: ifeq -> 512
    //   500: iload #13
    //   502: iconst_1
    //   503: iadd
    //   504: iconst_1
    //   505: iushr
    //   506: ineg
    //   507: istore #13
    //   509: goto -> 518
    //   512: iload #13
    //   514: iconst_1
    //   515: ishr
    //   516: istore #13
    //   518: aload #7
    //   520: iload #8
    //   522: iload #13
    //   524: iload #9
    //   526: iadd
    //   527: iastore
    //   528: aload #7
    //   530: aload #4
    //   532: getfield aFZ : [I
    //   535: iload #8
    //   537: iconst_2
    //   538: isub
    //   539: iaload
    //   540: dup2
    //   541: iaload
    //   542: sipush #32767
    //   545: iand
    //   546: iastore
    //   547: aload #7
    //   549: aload #4
    //   551: getfield Qnq : [I
    //   554: iload #8
    //   556: iconst_2
    //   557: isub
    //   558: iaload
    //   559: dup2
    //   560: iaload
    //   561: sipush #32767
    //   564: iand
    //   565: iastore
    //   566: goto -> 579
    //   569: aload #7
    //   571: iload #8
    //   573: iload #9
    //   575: ldc 32768
    //   577: ior
    //   578: iastore
    //   579: iinc #8, 1
    //   582: goto -> 332
    //   585: aload #7
    //   587: areturn
    //   588: aconst_null
    //   589: areturn
  }
  
  Object Dne(AOl paramAOl, XEH paramXEH, Object paramObject) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: bipush #65
    //   5: newarray int
    //   7: astore #5
    //   9: aload_3
    //   10: checkcast QwU
    //   13: astore #6
    //   15: new Ett
    //   18: dup
    //   19: aload_0
    //   20: invokespecial <init> : (LiVy;)V
    //   23: astore #7
    //   25: aload #7
    //   27: aload #6
    //   29: putfield Dne : LQwU;
    //   32: aload #7
    //   34: aload #6
    //   36: getfield aFZ : [I
    //   39: iconst_1
    //   40: iaload
    //   41: putfield bzF : I
    //   44: iconst_0
    //   45: istore #8
    //   47: iload #8
    //   49: aload #6
    //   51: getfield Qnq : I
    //   54: if_icmpge -> 82
    //   57: iload #4
    //   59: aload #6
    //   61: getfield FWm : [I
    //   64: aload #6
    //   66: getfield Dne : [I
    //   69: iload #8
    //   71: iaload
    //   72: iaload
    //   73: iadd
    //   74: istore #4
    //   76: iinc #8, 1
    //   79: goto -> 47
    //   82: iinc #4, 2
    //   85: aload #7
    //   87: iload #4
    //   89: putfield FWm : I
    //   92: iconst_0
    //   93: istore #8
    //   95: iload #8
    //   97: iload #4
    //   99: if_icmpge -> 115
    //   102: aload #5
    //   104: iload #8
    //   106: iload #8
    //   108: iastore
    //   109: iinc #8, 1
    //   112: goto -> 95
    //   115: iconst_0
    //   116: istore #9
    //   118: iload #9
    //   120: iload #4
    //   122: iconst_1
    //   123: isub
    //   124: if_icmpge -> 199
    //   127: iload #9
    //   129: istore #10
    //   131: iload #10
    //   133: iload #4
    //   135: if_icmpge -> 193
    //   138: aload #6
    //   140: getfield aFZ : [I
    //   143: aload #5
    //   145: iload #9
    //   147: iaload
    //   148: iaload
    //   149: aload #6
    //   151: getfield aFZ : [I
    //   154: aload #5
    //   156: iload #10
    //   158: iaload
    //   159: iaload
    //   160: if_icmple -> 187
    //   163: aload #5
    //   165: iload #10
    //   167: iaload
    //   168: istore #8
    //   170: aload #5
    //   172: iload #10
    //   174: aload #5
    //   176: iload #9
    //   178: iaload
    //   179: iastore
    //   180: aload #5
    //   182: iload #9
    //   184: iload #8
    //   186: iastore
    //   187: iinc #10, 1
    //   190: goto -> 131
    //   193: iinc #9, 1
    //   196: goto -> 118
    //   199: iconst_0
    //   200: istore #9
    //   202: iload #9
    //   204: iload #4
    //   206: if_icmpge -> 228
    //   209: aload #7
    //   211: getfield FWm : [I
    //   214: iload #9
    //   216: aload #5
    //   218: iload #9
    //   220: iaload
    //   221: iastore
    //   222: iinc #9, 1
    //   225: goto -> 202
    //   228: iconst_0
    //   229: istore #9
    //   231: iload #9
    //   233: iload #4
    //   235: if_icmpge -> 260
    //   238: aload #7
    //   240: getfield bzF : [I
    //   243: aload #7
    //   245: getfield FWm : [I
    //   248: iload #9
    //   250: iaload
    //   251: iload #9
    //   253: iastore
    //   254: iinc #9, 1
    //   257: goto -> 231
    //   260: iconst_0
    //   261: istore #9
    //   263: iload #9
    //   265: iload #4
    //   267: if_icmpge -> 298
    //   270: aload #7
    //   272: getfield Dne : [I
    //   275: iload #9
    //   277: aload #6
    //   279: getfield aFZ : [I
    //   282: aload #7
    //   284: getfield FWm : [I
    //   287: iload #9
    //   289: iaload
    //   290: iaload
    //   291: iastore
    //   292: iinc #9, 1
    //   295: goto -> 263
    //   298: aload #6
    //   300: getfield aFZ : I
    //   303: tableswitch default -> 374, 1 -> 332, 2 -> 343, 3 -> 354, 4 -> 364
    //   332: aload #7
    //   334: sipush #256
    //   337: putfield Qnq : I
    //   340: goto -> 380
    //   343: aload #7
    //   345: sipush #128
    //   348: putfield Qnq : I
    //   351: goto -> 380
    //   354: aload #7
    //   356: bipush #86
    //   358: putfield Qnq : I
    //   361: goto -> 380
    //   364: aload #7
    //   366: bipush #64
    //   368: putfield Qnq : I
    //   371: goto -> 380
    //   374: aload #7
    //   376: iconst_m1
    //   377: putfield Qnq : I
    //   380: iconst_0
    //   381: istore #9
    //   383: iload #9
    //   385: iload #4
    //   387: iconst_2
    //   388: isub
    //   389: if_icmpge -> 518
    //   392: iconst_0
    //   393: istore #10
    //   395: iconst_1
    //   396: istore #11
    //   398: iconst_0
    //   399: istore #12
    //   401: aload #7
    //   403: getfield bzF : I
    //   406: istore #13
    //   408: aload #6
    //   410: getfield aFZ : [I
    //   413: iload #9
    //   415: iconst_2
    //   416: iadd
    //   417: iaload
    //   418: istore #14
    //   420: iconst_0
    //   421: istore #15
    //   423: iload #15
    //   425: iload #9
    //   427: iconst_2
    //   428: iadd
    //   429: if_icmpge -> 492
    //   432: aload #6
    //   434: getfield aFZ : [I
    //   437: iload #15
    //   439: iaload
    //   440: istore #16
    //   442: iload #16
    //   444: iload #12
    //   446: if_icmple -> 464
    //   449: iload #16
    //   451: iload #14
    //   453: if_icmpge -> 464
    //   456: iload #15
    //   458: istore #10
    //   460: iload #16
    //   462: istore #12
    //   464: iload #16
    //   466: iload #13
    //   468: if_icmpge -> 486
    //   471: iload #16
    //   473: iload #14
    //   475: if_icmple -> 486
    //   478: iload #15
    //   480: istore #11
    //   482: iload #16
    //   484: istore #13
    //   486: iinc #15, 1
    //   489: goto -> 423
    //   492: aload #7
    //   494: getfield aFZ : [I
    //   497: iload #9
    //   499: iload #10
    //   501: iastore
    //   502: aload #7
    //   504: getfield Qnq : [I
    //   507: iload #9
    //   509: iload #11
    //   511: iastore
    //   512: iinc #9, 1
    //   515: goto -> 383
    //   518: aload #7
    //   520: areturn
  }
  
  void bzF(Object paramObject) {}
  
  int Dne(MOU paramMOU, Object paramObject1, float[] paramArrayOffloat1, float[] paramArrayOffloat2, Object paramObject2) {
    return 0;
  }
  
  void Dne(Object paramObject) {}
  
  static {
    Dne = new float[] { 
        1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 
        1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 
        3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 
        7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 
        1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 
        2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 
        4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 
        8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 
        1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 
        3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 
        5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 
        1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 
        2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 
        3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 
        7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 
        0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 
        0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 
        0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 
        0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 
        0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 
        0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 
        0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 
        0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 
        0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 
        0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 
        0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iVy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */