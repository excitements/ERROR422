public class iMX extends sMa {
  private double ATE;
  
  private double FfS;
  
  private double FWm;
  
  private double EyB;
  
  private double qLR;
  
  private double bzF;
  
  private double Vxn;
  
  private double ceE;
  
  private double Dne;
  
  private boolean Dne;
  
  private int Dne = 1;
  
  public void bzF(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #18
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: return
  }
  
  public boolean Dne() {
    return true;
  }
  
  public iMX(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    this(paramQnq);
    bzF(paramDouble1, paramDouble2 + this.udO, paramDouble3);
    this.XHL = 0.0D;
    this.Zpi = 0.0D;
    this.kGO = 0.0D;
    this.aFZ = paramDouble1;
    this.zGp = paramDouble2;
    this.DyG = paramDouble3;
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #19
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: return
  }
  
  public boolean a_(FiG paramFiG) {
    if (this.Dne != null && this.Dne instanceof FiG && this.Dne != paramFiG)
      return true; 
    if (this.Dne.aFZ == null)
      paramFiG.bzF(this); 
    return true;
  }
  
  public void gnI() {
    bzF(-Qnq());
    FWm(10);
    Dne(Dne() * 11);
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: new java/lang/Integer
    //   9: dup
    //   10: iconst_0
    //   11: invokespecial <init> : (I)V
    //   14: invokevirtual Dne : (ILjava/lang/Object;)V
    //   17: aload_0
    //   18: getfield Dne : LluM;
    //   21: bipush #18
    //   23: new java/lang/Integer
    //   26: dup
    //   27: iconst_1
    //   28: invokespecial <init> : (I)V
    //   31: invokevirtual Dne : (ILjava/lang/Object;)V
    //   34: aload_0
    //   35: getfield Dne : LluM;
    //   38: bipush #19
    //   40: new java/lang/Integer
    //   43: dup
    //   44: iconst_0
    //   45: invokespecial <init> : (I)V
    //   48: invokevirtual Dne : (ILjava/lang/Object;)V
    //   51: return
  }
  
  public iMX(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = 0.07D;
    this.bzF = true;
    Dne(1.5F, 0.6F);
    this.udO = this.trS / 2.0F;
  }
  
  public void RPx() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LsMa;
    //   4: ifnull -> 85
    //   7: aload_0
    //   8: getfield mrb : F
    //   11: f2d
    //   12: ldc2_w 3.141592653589793
    //   15: dmul
    //   16: ldc2_w 180.0
    //   19: ddiv
    //   20: invokestatic cos : (D)D
    //   23: ldc2_w 0.4
    //   26: dmul
    //   27: dstore_1
    //   28: aload_0
    //   29: getfield mrb : F
    //   32: f2d
    //   33: ldc2_w 3.141592653589793
    //   36: dmul
    //   37: ldc2_w 180.0
    //   40: ddiv
    //   41: invokestatic sin : (D)D
    //   44: ldc2_w 0.4
    //   47: dmul
    //   48: dstore_3
    //   49: aload_0
    //   50: getfield Dne : LsMa;
    //   53: aload_0
    //   54: getfield div : D
    //   57: dload_1
    //   58: dadd
    //   59: aload_0
    //   60: getfield IjH : D
    //   63: aload_0
    //   64: invokevirtual aFZ : ()D
    //   67: dadd
    //   68: aload_0
    //   69: getfield Dne : LsMa;
    //   72: invokevirtual Qnq : ()D
    //   75: dadd
    //   76: aload_0
    //   77: getfield mrb : D
    //   80: dload_3
    //   81: dadd
    //   82: invokevirtual bzF : (DDD)V
    //   85: return
  }
  
  protected void FWm(WkD paramWkD) {}
  
  public int bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
    if (this.Dne != 0) {
      this.Dne = paramInt + 5;
    } else {
      double d1 = paramDouble1 - this.div;
      double d2 = paramDouble2 - this.IjH;
      double d3 = paramDouble3 - this.mrb;
      double d4 = d1 * d1 + d2 * d2 + d3 * d3;
      if (d4 <= 1.0D)
        return; 
      this.Dne = 3;
    } 
    this.FWm = paramDouble1;
    this.bzF = paramDouble2;
    this.qLR = paramDouble3;
    this.ATE = paramFloat1;
    this.Vxn = paramFloat2;
    this.XHL = this.ceE;
    this.Zpi = this.EyB;
    this.kGO = this.FfS;
  }
  
  protected void Dne(WkD paramWkD) {}
  
  public int Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #18
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  public void FWm(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public double aFZ() {
    return this.trS * 0.0D - 0.30000001192092896D;
  }
  
  public bSp Dne() {
    return this.Dne;
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual EyB : ()Z
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield Dne : LQnq;
    //   13: getfield aFZ : Z
    //   16: ifne -> 141
    //   19: aload_0
    //   20: getfield Zpi : Z
    //   23: ifne -> 141
    //   26: aload_0
    //   27: aload_0
    //   28: invokevirtual Qnq : ()I
    //   31: ineg
    //   32: invokevirtual bzF : (I)V
    //   35: aload_0
    //   36: bipush #10
    //   38: invokevirtual FWm : (I)V
    //   41: aload_0
    //   42: aload_0
    //   43: invokevirtual Dne : ()I
    //   46: iload_2
    //   47: bipush #10
    //   49: imul
    //   50: iadd
    //   51: invokevirtual Dne : (I)V
    //   54: aload_0
    //   55: invokevirtual oIf : ()V
    //   58: aload_1
    //   59: invokevirtual FWm : ()LsMa;
    //   62: instanceof FiG
    //   65: ifeq -> 88
    //   68: aload_1
    //   69: invokevirtual FWm : ()LsMa;
    //   72: checkcast FiG
    //   75: getfield Dne : Luqg;
    //   78: getfield Qnq : Z
    //   81: ifeq -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: istore_3
    //   90: iload_3
    //   91: ifne -> 103
    //   94: aload_0
    //   95: invokevirtual Dne : ()I
    //   98: bipush #40
    //   100: if_icmple -> 139
    //   103: aload_0
    //   104: getfield Dne : LsMa;
    //   107: ifnull -> 118
    //   110: aload_0
    //   111: getfield Dne : LsMa;
    //   114: aload_0
    //   115: invokevirtual bzF : (LsMa;)V
    //   118: iload_3
    //   119: ifne -> 135
    //   122: aload_0
    //   123: getstatic dEr.CZC : LdEr;
    //   126: getfield Qnq : I
    //   129: iconst_1
    //   130: fconst_0
    //   131: invokevirtual Dne : (IIF)LJiM;
    //   134: pop
    //   135: aload_0
    //   136: invokevirtual g_ : ()V
    //   139: iconst_1
    //   140: ireturn
    //   141: iconst_1
    //   142: ireturn
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #19
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  public boolean kGO() {
    return (this.Zpi == 0.0F);
  }
  
  public void aFZ(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.ceE = this.XHL = paramDouble1;
    this.EyB = this.Zpi = paramDouble2;
    this.FfS = this.kGO = paramDouble3;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: invokevirtual bzF : ()I
    //   8: ifle -> 21
    //   11: aload_0
    //   12: aload_0
    //   13: invokevirtual bzF : ()I
    //   16: iconst_1
    //   17: isub
    //   18: invokevirtual FWm : (I)V
    //   21: aload_0
    //   22: invokevirtual Dne : ()I
    //   25: ifle -> 38
    //   28: aload_0
    //   29: aload_0
    //   30: invokevirtual Dne : ()I
    //   33: iconst_1
    //   34: isub
    //   35: invokevirtual Dne : (I)V
    //   38: aload_0
    //   39: aload_0
    //   40: getfield div : D
    //   43: putfield aFZ : D
    //   46: aload_0
    //   47: aload_0
    //   48: getfield IjH : D
    //   51: putfield zGp : D
    //   54: aload_0
    //   55: aload_0
    //   56: getfield mrb : D
    //   59: putfield DyG : D
    //   62: iconst_5
    //   63: istore_1
    //   64: dconst_0
    //   65: dstore_2
    //   66: iconst_0
    //   67: istore #4
    //   69: iload #4
    //   71: iload_1
    //   72: if_icmpge -> 219
    //   75: aload_0
    //   76: getfield Dne : LbSp;
    //   79: getfield FWm : D
    //   82: aload_0
    //   83: getfield Dne : LbSp;
    //   86: getfield aFZ : D
    //   89: aload_0
    //   90: getfield Dne : LbSp;
    //   93: getfield FWm : D
    //   96: dsub
    //   97: iload #4
    //   99: iconst_0
    //   100: iadd
    //   101: i2d
    //   102: dmul
    //   103: iload_1
    //   104: i2d
    //   105: ddiv
    //   106: dadd
    //   107: ldc2_w 0.125
    //   110: dsub
    //   111: dstore #5
    //   113: aload_0
    //   114: getfield Dne : LbSp;
    //   117: getfield FWm : D
    //   120: aload_0
    //   121: getfield Dne : LbSp;
    //   124: getfield aFZ : D
    //   127: aload_0
    //   128: getfield Dne : LbSp;
    //   131: getfield FWm : D
    //   134: dsub
    //   135: iload #4
    //   137: iconst_1
    //   138: iadd
    //   139: i2d
    //   140: dmul
    //   141: iload_1
    //   142: i2d
    //   143: ddiv
    //   144: dadd
    //   145: ldc2_w 0.125
    //   148: dsub
    //   149: dstore #7
    //   151: invokestatic Dne : ()LzjJ;
    //   154: aload_0
    //   155: getfield Dne : LbSp;
    //   158: getfield Dne : D
    //   161: dload #5
    //   163: aload_0
    //   164: getfield Dne : LbSp;
    //   167: getfield bzF : D
    //   170: aload_0
    //   171: getfield Dne : LbSp;
    //   174: getfield Qnq : D
    //   177: dload #7
    //   179: aload_0
    //   180: getfield Dne : LbSp;
    //   183: getfield zGp : D
    //   186: invokevirtual Dne : (DDDDDD)LbSp;
    //   189: astore #9
    //   191: aload_0
    //   192: getfield Dne : LQnq;
    //   195: aload #9
    //   197: getstatic KFd.div : LKFd;
    //   200: invokevirtual FWm : (LbSp;LKFd;)Z
    //   203: ifeq -> 213
    //   206: dload_2
    //   207: dconst_1
    //   208: iload_1
    //   209: i2d
    //   210: ddiv
    //   211: dadd
    //   212: dstore_2
    //   213: iinc #4, 1
    //   216: goto -> 69
    //   219: aload_0
    //   220: getfield XHL : D
    //   223: aload_0
    //   224: getfield XHL : D
    //   227: dmul
    //   228: aload_0
    //   229: getfield kGO : D
    //   232: aload_0
    //   233: getfield kGO : D
    //   236: dmul
    //   237: dadd
    //   238: invokestatic sqrt : (D)D
    //   241: dstore #4
    //   243: dload #4
    //   245: ldc2_w 0.26249999999999996
    //   248: dcmpl
    //   249: ifle -> 508
    //   252: aload_0
    //   253: getfield mrb : F
    //   256: f2d
    //   257: ldc2_w 3.141592653589793
    //   260: dmul
    //   261: ldc2_w 180.0
    //   264: ddiv
    //   265: invokestatic cos : (D)D
    //   268: dstore #6
    //   270: aload_0
    //   271: getfield mrb : F
    //   274: f2d
    //   275: ldc2_w 3.141592653589793
    //   278: dmul
    //   279: ldc2_w 180.0
    //   282: ddiv
    //   283: invokestatic sin : (D)D
    //   286: dstore #8
    //   288: iconst_0
    //   289: istore #10
    //   291: iload #10
    //   293: i2d
    //   294: dconst_1
    //   295: dload #4
    //   297: ldc2_w 60.0
    //   300: dmul
    //   301: dadd
    //   302: dcmpg
    //   303: ifge -> 508
    //   306: aload_0
    //   307: getfield Dne : Ljava/util/Random;
    //   310: invokevirtual nextFloat : ()F
    //   313: fconst_2
    //   314: fmul
    //   315: fconst_1
    //   316: fsub
    //   317: f2d
    //   318: dstore #11
    //   320: aload_0
    //   321: getfield Dne : Ljava/util/Random;
    //   324: iconst_2
    //   325: invokevirtual nextInt : (I)I
    //   328: iconst_2
    //   329: imul
    //   330: iconst_1
    //   331: isub
    //   332: i2d
    //   333: ldc2_w 0.7
    //   336: dmul
    //   337: dstore #13
    //   339: aload_0
    //   340: getfield Dne : Ljava/util/Random;
    //   343: invokevirtual nextBoolean : ()Z
    //   346: ifeq -> 430
    //   349: aload_0
    //   350: getfield div : D
    //   353: dload #6
    //   355: dload #11
    //   357: dmul
    //   358: ldc2_w 0.8
    //   361: dmul
    //   362: dsub
    //   363: dload #8
    //   365: dload #13
    //   367: dmul
    //   368: dadd
    //   369: dstore #15
    //   371: aload_0
    //   372: getfield mrb : D
    //   375: dload #8
    //   377: dload #11
    //   379: dmul
    //   380: ldc2_w 0.8
    //   383: dmul
    //   384: dsub
    //   385: dload #6
    //   387: dload #13
    //   389: dmul
    //   390: dsub
    //   391: dstore #17
    //   393: aload_0
    //   394: getfield Dne : LQnq;
    //   397: ldc_w 'splash'
    //   400: dload #15
    //   402: aload_0
    //   403: getfield IjH : D
    //   406: ldc2_w 0.125
    //   409: dsub
    //   410: dload #17
    //   412: aload_0
    //   413: getfield XHL : D
    //   416: aload_0
    //   417: getfield Zpi : D
    //   420: aload_0
    //   421: getfield kGO : D
    //   424: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   427: goto -> 502
    //   430: aload_0
    //   431: getfield div : D
    //   434: dload #6
    //   436: dadd
    //   437: dload #8
    //   439: dload #11
    //   441: dmul
    //   442: ldc2_w 0.7
    //   445: dmul
    //   446: dadd
    //   447: dstore #15
    //   449: aload_0
    //   450: getfield mrb : D
    //   453: dload #8
    //   455: dadd
    //   456: dload #6
    //   458: dload #11
    //   460: dmul
    //   461: ldc2_w 0.7
    //   464: dmul
    //   465: dsub
    //   466: dstore #17
    //   468: aload_0
    //   469: getfield Dne : LQnq;
    //   472: ldc_w 'splash'
    //   475: dload #15
    //   477: aload_0
    //   478: getfield IjH : D
    //   481: ldc2_w 0.125
    //   484: dsub
    //   485: dload #17
    //   487: aload_0
    //   488: getfield XHL : D
    //   491: aload_0
    //   492: getfield Zpi : D
    //   495: aload_0
    //   496: getfield kGO : D
    //   499: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   502: iinc #10, 1
    //   505: goto -> 291
    //   508: aload_0
    //   509: getfield Dne : LQnq;
    //   512: getfield aFZ : Z
    //   515: ifeq -> 819
    //   518: aload_0
    //   519: getfield Dne : Z
    //   522: ifeq -> 819
    //   525: aload_0
    //   526: getfield Dne : I
    //   529: ifle -> 694
    //   532: aload_0
    //   533: getfield div : D
    //   536: aload_0
    //   537: getfield FWm : D
    //   540: aload_0
    //   541: getfield div : D
    //   544: dsub
    //   545: aload_0
    //   546: getfield Dne : I
    //   549: i2d
    //   550: ddiv
    //   551: dadd
    //   552: dstore #6
    //   554: aload_0
    //   555: getfield IjH : D
    //   558: aload_0
    //   559: getfield bzF : D
    //   562: aload_0
    //   563: getfield IjH : D
    //   566: dsub
    //   567: aload_0
    //   568: getfield Dne : I
    //   571: i2d
    //   572: ddiv
    //   573: dadd
    //   574: dstore #8
    //   576: aload_0
    //   577: getfield mrb : D
    //   580: aload_0
    //   581: getfield qLR : D
    //   584: aload_0
    //   585: getfield mrb : D
    //   588: dsub
    //   589: aload_0
    //   590: getfield Dne : I
    //   593: i2d
    //   594: ddiv
    //   595: dadd
    //   596: dstore #12
    //   598: aload_0
    //   599: getfield ATE : D
    //   602: aload_0
    //   603: getfield mrb : F
    //   606: f2d
    //   607: dsub
    //   608: invokestatic Dne : (D)D
    //   611: dstore #10
    //   613: aload_0
    //   614: aload_0
    //   615: getfield mrb : F
    //   618: f2d
    //   619: dload #10
    //   621: aload_0
    //   622: getfield Dne : I
    //   625: i2d
    //   626: ddiv
    //   627: dadd
    //   628: d2f
    //   629: putfield mrb : F
    //   632: aload_0
    //   633: aload_0
    //   634: getfield XHL : F
    //   637: f2d
    //   638: aload_0
    //   639: getfield Vxn : D
    //   642: aload_0
    //   643: getfield XHL : F
    //   646: f2d
    //   647: dsub
    //   648: aload_0
    //   649: getfield Dne : I
    //   652: i2d
    //   653: ddiv
    //   654: dadd
    //   655: d2f
    //   656: putfield XHL : F
    //   659: aload_0
    //   660: dup
    //   661: getfield Dne : I
    //   664: iconst_1
    //   665: isub
    //   666: putfield Dne : I
    //   669: aload_0
    //   670: dload #6
    //   672: dload #8
    //   674: dload #12
    //   676: invokevirtual bzF : (DDD)V
    //   679: aload_0
    //   680: aload_0
    //   681: getfield mrb : F
    //   684: aload_0
    //   685: getfield XHL : F
    //   688: invokevirtual FWm : (FF)V
    //   691: goto -> 1724
    //   694: aload_0
    //   695: getfield div : D
    //   698: aload_0
    //   699: getfield XHL : D
    //   702: dadd
    //   703: dstore #6
    //   705: aload_0
    //   706: getfield IjH : D
    //   709: aload_0
    //   710: getfield Zpi : D
    //   713: dadd
    //   714: dstore #8
    //   716: aload_0
    //   717: getfield mrb : D
    //   720: aload_0
    //   721: getfield kGO : D
    //   724: dadd
    //   725: dstore #12
    //   727: aload_0
    //   728: dload #6
    //   730: dload #8
    //   732: dload #12
    //   734: invokevirtual bzF : (DDD)V
    //   737: aload_0
    //   738: getfield aFZ : Z
    //   741: ifeq -> 780
    //   744: aload_0
    //   745: dup
    //   746: getfield XHL : D
    //   749: ldc2_w 0.5
    //   752: dmul
    //   753: putfield XHL : D
    //   756: aload_0
    //   757: dup
    //   758: getfield Zpi : D
    //   761: ldc2_w 0.5
    //   764: dmul
    //   765: putfield Zpi : D
    //   768: aload_0
    //   769: dup
    //   770: getfield kGO : D
    //   773: ldc2_w 0.5
    //   776: dmul
    //   777: putfield kGO : D
    //   780: aload_0
    //   781: dup
    //   782: getfield XHL : D
    //   785: ldc2_w 0.9900000095367432
    //   788: dmul
    //   789: putfield XHL : D
    //   792: aload_0
    //   793: dup
    //   794: getfield Zpi : D
    //   797: ldc2_w 0.949999988079071
    //   800: dmul
    //   801: putfield Zpi : D
    //   804: aload_0
    //   805: dup
    //   806: getfield kGO : D
    //   809: ldc2_w 0.9900000095367432
    //   812: dmul
    //   813: putfield kGO : D
    //   816: goto -> 1724
    //   819: dload_2
    //   820: dconst_1
    //   821: dcmpg
    //   822: ifge -> 852
    //   825: dload_2
    //   826: ldc2_w 2.0
    //   829: dmul
    //   830: dconst_1
    //   831: dsub
    //   832: dstore #6
    //   834: aload_0
    //   835: dup
    //   836: getfield Zpi : D
    //   839: ldc2_w 0.03999999910593033
    //   842: dload #6
    //   844: dmul
    //   845: dadd
    //   846: putfield Zpi : D
    //   849: goto -> 885
    //   852: aload_0
    //   853: getfield Zpi : D
    //   856: dconst_0
    //   857: dcmpg
    //   858: ifge -> 873
    //   861: aload_0
    //   862: dup
    //   863: getfield Zpi : D
    //   866: ldc2_w 2.0
    //   869: ddiv
    //   870: putfield Zpi : D
    //   873: aload_0
    //   874: dup
    //   875: getfield Zpi : D
    //   878: ldc2_w 0.007000000216066837
    //   881: dadd
    //   882: putfield Zpi : D
    //   885: aload_0
    //   886: getfield Dne : LsMa;
    //   889: ifnull -> 934
    //   892: aload_0
    //   893: dup
    //   894: getfield XHL : D
    //   897: aload_0
    //   898: getfield Dne : LsMa;
    //   901: getfield XHL : D
    //   904: aload_0
    //   905: getfield Dne : D
    //   908: dmul
    //   909: dadd
    //   910: putfield XHL : D
    //   913: aload_0
    //   914: dup
    //   915: getfield kGO : D
    //   918: aload_0
    //   919: getfield Dne : LsMa;
    //   922: getfield kGO : D
    //   925: aload_0
    //   926: getfield Dne : D
    //   929: dmul
    //   930: dadd
    //   931: putfield kGO : D
    //   934: aload_0
    //   935: getfield XHL : D
    //   938: aload_0
    //   939: getfield XHL : D
    //   942: dmul
    //   943: aload_0
    //   944: getfield kGO : D
    //   947: aload_0
    //   948: getfield kGO : D
    //   951: dmul
    //   952: dadd
    //   953: invokestatic sqrt : (D)D
    //   956: dstore #6
    //   958: dload #6
    //   960: ldc2_w 0.35
    //   963: dcmpl
    //   964: ifle -> 1002
    //   967: ldc2_w 0.35
    //   970: dload #6
    //   972: ddiv
    //   973: dstore #8
    //   975: aload_0
    //   976: dup
    //   977: getfield XHL : D
    //   980: dload #8
    //   982: dmul
    //   983: putfield XHL : D
    //   986: aload_0
    //   987: dup
    //   988: getfield kGO : D
    //   991: dload #8
    //   993: dmul
    //   994: putfield kGO : D
    //   997: ldc2_w 0.35
    //   1000: dstore #6
    //   1002: dload #6
    //   1004: dload #4
    //   1006: dcmpl
    //   1007: ifle -> 1063
    //   1010: aload_0
    //   1011: getfield Dne : D
    //   1014: ldc2_w 0.35
    //   1017: dcmpg
    //   1018: ifge -> 1063
    //   1021: aload_0
    //   1022: dup
    //   1023: getfield Dne : D
    //   1026: ldc2_w 0.35
    //   1029: aload_0
    //   1030: getfield Dne : D
    //   1033: dsub
    //   1034: ldc2_w 35.0
    //   1037: ddiv
    //   1038: dadd
    //   1039: putfield Dne : D
    //   1042: aload_0
    //   1043: getfield Dne : D
    //   1046: ldc2_w 0.35
    //   1049: dcmpl
    //   1050: ifle -> 1102
    //   1053: aload_0
    //   1054: ldc2_w 0.35
    //   1057: putfield Dne : D
    //   1060: goto -> 1102
    //   1063: aload_0
    //   1064: dup
    //   1065: getfield Dne : D
    //   1068: aload_0
    //   1069: getfield Dne : D
    //   1072: ldc2_w 0.07
    //   1075: dsub
    //   1076: ldc2_w 35.0
    //   1079: ddiv
    //   1080: dsub
    //   1081: putfield Dne : D
    //   1084: aload_0
    //   1085: getfield Dne : D
    //   1088: ldc2_w 0.07
    //   1091: dcmpg
    //   1092: ifge -> 1102
    //   1095: aload_0
    //   1096: ldc2_w 0.07
    //   1099: putfield Dne : D
    //   1102: aload_0
    //   1103: getfield aFZ : Z
    //   1106: ifeq -> 1145
    //   1109: aload_0
    //   1110: dup
    //   1111: getfield XHL : D
    //   1114: ldc2_w 0.5
    //   1117: dmul
    //   1118: putfield XHL : D
    //   1121: aload_0
    //   1122: dup
    //   1123: getfield Zpi : D
    //   1126: ldc2_w 0.5
    //   1129: dmul
    //   1130: putfield Zpi : D
    //   1133: aload_0
    //   1134: dup
    //   1135: getfield kGO : D
    //   1138: ldc2_w 0.5
    //   1141: dmul
    //   1142: putfield kGO : D
    //   1145: aload_0
    //   1146: aload_0
    //   1147: getfield XHL : D
    //   1150: aload_0
    //   1151: getfield Zpi : D
    //   1154: aload_0
    //   1155: getfield kGO : D
    //   1158: invokevirtual Dne : (DDD)V
    //   1161: aload_0
    //   1162: getfield zGp : Z
    //   1165: ifeq -> 1257
    //   1168: dload #4
    //   1170: ldc2_w 0.2
    //   1173: dcmpl
    //   1174: ifle -> 1257
    //   1177: aload_0
    //   1178: getfield Dne : LQnq;
    //   1181: getfield aFZ : Z
    //   1184: ifne -> 1293
    //   1187: aload_0
    //   1188: getfield Zpi : Z
    //   1191: ifne -> 1293
    //   1194: aload_0
    //   1195: invokevirtual g_ : ()V
    //   1198: iconst_0
    //   1199: istore #14
    //   1201: iload #14
    //   1203: iconst_3
    //   1204: if_icmpge -> 1226
    //   1207: aload_0
    //   1208: getstatic zKP.Qnq : LzKP;
    //   1211: getfield FWm : I
    //   1214: iconst_1
    //   1215: fconst_0
    //   1216: invokevirtual Dne : (IIF)LJiM;
    //   1219: pop
    //   1220: iinc #14, 1
    //   1223: goto -> 1201
    //   1226: iconst_0
    //   1227: istore #14
    //   1229: iload #14
    //   1231: iconst_2
    //   1232: if_icmpge -> 1254
    //   1235: aload_0
    //   1236: getstatic dEr.oIf : LdEr;
    //   1239: getfield Qnq : I
    //   1242: iconst_1
    //   1243: fconst_0
    //   1244: invokevirtual Dne : (IIF)LJiM;
    //   1247: pop
    //   1248: iinc #14, 1
    //   1251: goto -> 1229
    //   1254: goto -> 1293
    //   1257: aload_0
    //   1258: dup
    //   1259: getfield XHL : D
    //   1262: ldc2_w 0.9900000095367432
    //   1265: dmul
    //   1266: putfield XHL : D
    //   1269: aload_0
    //   1270: dup
    //   1271: getfield Zpi : D
    //   1274: ldc2_w 0.949999988079071
    //   1277: dmul
    //   1278: putfield Zpi : D
    //   1281: aload_0
    //   1282: dup
    //   1283: getfield kGO : D
    //   1286: ldc2_w 0.9900000095367432
    //   1289: dmul
    //   1290: putfield kGO : D
    //   1293: aload_0
    //   1294: fconst_0
    //   1295: putfield XHL : F
    //   1298: aload_0
    //   1299: getfield mrb : F
    //   1302: f2d
    //   1303: dstore #8
    //   1305: aload_0
    //   1306: getfield aFZ : D
    //   1309: aload_0
    //   1310: getfield div : D
    //   1313: dsub
    //   1314: dstore #12
    //   1316: aload_0
    //   1317: getfield DyG : D
    //   1320: aload_0
    //   1321: getfield mrb : D
    //   1324: dsub
    //   1325: dstore #10
    //   1327: dload #12
    //   1329: dload #12
    //   1331: dmul
    //   1332: dload #10
    //   1334: dload #10
    //   1336: dmul
    //   1337: dadd
    //   1338: ldc2_w 0.001
    //   1341: dcmpl
    //   1342: ifle -> 1364
    //   1345: dload #10
    //   1347: dload #12
    //   1349: invokestatic atan2 : (DD)D
    //   1352: ldc2_w 180.0
    //   1355: dmul
    //   1356: ldc2_w 3.141592653589793
    //   1359: ddiv
    //   1360: d2f
    //   1361: f2d
    //   1362: dstore #8
    //   1364: dload #8
    //   1366: aload_0
    //   1367: getfield mrb : F
    //   1370: f2d
    //   1371: dsub
    //   1372: invokestatic Dne : (D)D
    //   1375: dstore #14
    //   1377: dload #14
    //   1379: ldc2_w 20.0
    //   1382: dcmpl
    //   1383: ifle -> 1391
    //   1386: ldc2_w 20.0
    //   1389: dstore #14
    //   1391: dload #14
    //   1393: ldc2_w -20.0
    //   1396: dcmpg
    //   1397: ifge -> 1405
    //   1400: ldc2_w -20.0
    //   1403: dstore #14
    //   1405: aload_0
    //   1406: aload_0
    //   1407: getfield mrb : F
    //   1410: f2d
    //   1411: dload #14
    //   1413: dadd
    //   1414: d2f
    //   1415: putfield mrb : F
    //   1418: aload_0
    //   1419: aload_0
    //   1420: getfield mrb : F
    //   1423: aload_0
    //   1424: getfield XHL : F
    //   1427: invokevirtual FWm : (FF)V
    //   1430: aload_0
    //   1431: getfield Dne : LQnq;
    //   1434: getfield aFZ : Z
    //   1437: ifne -> 1724
    //   1440: aload_0
    //   1441: getfield Dne : LQnq;
    //   1444: aload_0
    //   1445: aload_0
    //   1446: getfield Dne : LbSp;
    //   1449: ldc2_w 0.20000000298023224
    //   1452: dconst_0
    //   1453: ldc2_w 0.20000000298023224
    //   1456: invokevirtual FWm : (DDD)LbSp;
    //   1459: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   1462: astore #16
    //   1464: aload #16
    //   1466: ifnull -> 1545
    //   1469: aload #16
    //   1471: invokeinterface isEmpty : ()Z
    //   1476: ifne -> 1545
    //   1479: iconst_0
    //   1480: istore #17
    //   1482: iload #17
    //   1484: aload #16
    //   1486: invokeinterface size : ()I
    //   1491: if_icmpge -> 1545
    //   1494: aload #16
    //   1496: iload #17
    //   1498: invokeinterface get : (I)Ljava/lang/Object;
    //   1503: checkcast sMa
    //   1506: astore #18
    //   1508: aload #18
    //   1510: aload_0
    //   1511: getfield Dne : LsMa;
    //   1514: if_acmpeq -> 1539
    //   1517: aload #18
    //   1519: invokevirtual Dne : ()Z
    //   1522: ifeq -> 1539
    //   1525: aload #18
    //   1527: instanceof iMX
    //   1530: ifeq -> 1539
    //   1533: aload #18
    //   1535: aload_0
    //   1536: invokevirtual Qnq : (LsMa;)V
    //   1539: iinc #17, 1
    //   1542: goto -> 1482
    //   1545: iconst_0
    //   1546: istore #17
    //   1548: iload #17
    //   1550: iconst_4
    //   1551: if_icmpge -> 1702
    //   1554: aload_0
    //   1555: getfield div : D
    //   1558: iload #17
    //   1560: iconst_2
    //   1561: irem
    //   1562: i2d
    //   1563: ldc2_w 0.5
    //   1566: dsub
    //   1567: ldc2_w 0.8
    //   1570: dmul
    //   1571: dadd
    //   1572: invokestatic FWm : (D)I
    //   1575: istore #18
    //   1577: aload_0
    //   1578: getfield mrb : D
    //   1581: iload #17
    //   1583: iconst_2
    //   1584: idiv
    //   1585: i2d
    //   1586: ldc2_w 0.5
    //   1589: dsub
    //   1590: ldc2_w 0.8
    //   1593: dmul
    //   1594: dadd
    //   1595: invokestatic FWm : (D)I
    //   1598: istore #19
    //   1600: iconst_0
    //   1601: istore #20
    //   1603: iload #20
    //   1605: iconst_2
    //   1606: if_icmpge -> 1696
    //   1609: aload_0
    //   1610: getfield IjH : D
    //   1613: invokestatic FWm : (D)I
    //   1616: iload #20
    //   1618: iadd
    //   1619: istore #21
    //   1621: aload_0
    //   1622: getfield Dne : LQnq;
    //   1625: iload #18
    //   1627: iload #21
    //   1629: iload #19
    //   1631: invokevirtual Dne : (III)I
    //   1634: istore #22
    //   1636: iload #22
    //   1638: getstatic zKP.EwP : LzKP;
    //   1641: getfield FWm : I
    //   1644: if_icmpne -> 1664
    //   1647: aload_0
    //   1648: getfield Dne : LQnq;
    //   1651: iload #18
    //   1653: iload #21
    //   1655: iload #19
    //   1657: invokevirtual Qnq : (III)Z
    //   1660: pop
    //   1661: goto -> 1690
    //   1664: iload #22
    //   1666: getstatic zKP.gvF : LzKP;
    //   1669: getfield FWm : I
    //   1672: if_icmpne -> 1690
    //   1675: aload_0
    //   1676: getfield Dne : LQnq;
    //   1679: iload #18
    //   1681: iload #21
    //   1683: iload #19
    //   1685: iconst_1
    //   1686: invokevirtual Dne : (IIIZ)Z
    //   1689: pop
    //   1690: iinc #20, 1
    //   1693: goto -> 1603
    //   1696: iinc #17, 1
    //   1699: goto -> 1548
    //   1702: aload_0
    //   1703: getfield Dne : LsMa;
    //   1706: ifnull -> 1724
    //   1709: aload_0
    //   1710: getfield Dne : LsMa;
    //   1713: getfield Zpi : Z
    //   1716: ifeq -> 1724
    //   1719: aload_0
    //   1720: aconst_null
    //   1721: putfield Dne : LsMa;
    //   1724: return
  }
  
  public bSp Dne(sMa paramsMa) {
    return paramsMa.Dne;
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iMX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */