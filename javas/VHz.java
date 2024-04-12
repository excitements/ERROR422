public abstract class VHz extends sMa implements vaR {
  private int Qnq = -1;
  
  private int ceE;
  
  public int Dne;
  
  private FUH Dne;
  
  private int Vxn = 0;
  
  private int FWm = -1;
  
  private String bzF;
  
  protected boolean Dne = false;
  
  private int EyB;
  
  private int bzF = -1;
  
  protected float DyG() {
    return 0.03F;
  }
  
  public boolean Dne(double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LbSp;
    //   4: invokevirtual Dne : ()D
    //   7: ldc2_w 4.0
    //   10: dmul
    //   11: dstore_3
    //   12: dload_3
    //   13: ldc2_w 64.0
    //   16: dmul
    //   17: dstore_3
    //   18: dload_1
    //   19: dload_3
    //   20: dload_3
    //   21: dmul
    //   22: dcmpg
    //   23: ifge -> 30
    //   26: iconst_1
    //   27: goto -> 31
    //   30: iconst_0
    //   31: ireturn
  }
  
  public void bzF(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: dload_1
    //   1: dload_1
    //   2: dmul
    //   3: dload_3
    //   4: dload_3
    //   5: dmul
    //   6: dadd
    //   7: dload #5
    //   9: dload #5
    //   11: dmul
    //   12: dadd
    //   13: invokestatic Dne : (D)F
    //   16: fstore #9
    //   18: dload_1
    //   19: fload #9
    //   21: f2d
    //   22: ddiv
    //   23: dstore_1
    //   24: dload_3
    //   25: fload #9
    //   27: f2d
    //   28: ddiv
    //   29: dstore_3
    //   30: dload #5
    //   32: fload #9
    //   34: f2d
    //   35: ddiv
    //   36: dstore #5
    //   38: dload_1
    //   39: aload_0
    //   40: getfield Dne : Ljava/util/Random;
    //   43: invokevirtual nextGaussian : ()D
    //   46: ldc2_w 0.007499999832361937
    //   49: dmul
    //   50: fload #8
    //   52: f2d
    //   53: dmul
    //   54: dadd
    //   55: dstore_1
    //   56: dload_3
    //   57: aload_0
    //   58: getfield Dne : Ljava/util/Random;
    //   61: invokevirtual nextGaussian : ()D
    //   64: ldc2_w 0.007499999832361937
    //   67: dmul
    //   68: fload #8
    //   70: f2d
    //   71: dmul
    //   72: dadd
    //   73: dstore_3
    //   74: dload #5
    //   76: aload_0
    //   77: getfield Dne : Ljava/util/Random;
    //   80: invokevirtual nextGaussian : ()D
    //   83: ldc2_w 0.007499999832361937
    //   86: dmul
    //   87: fload #8
    //   89: f2d
    //   90: dmul
    //   91: dadd
    //   92: dstore #5
    //   94: dload_1
    //   95: fload #7
    //   97: f2d
    //   98: dmul
    //   99: dstore_1
    //   100: dload_3
    //   101: fload #7
    //   103: f2d
    //   104: dmul
    //   105: dstore_3
    //   106: dload #5
    //   108: fload #7
    //   110: f2d
    //   111: dmul
    //   112: dstore #5
    //   114: aload_0
    //   115: dload_1
    //   116: putfield XHL : D
    //   119: aload_0
    //   120: dload_3
    //   121: putfield Zpi : D
    //   124: aload_0
    //   125: dload #5
    //   127: putfield kGO : D
    //   130: dload_1
    //   131: dload_1
    //   132: dmul
    //   133: dload #5
    //   135: dload #5
    //   137: dmul
    //   138: dadd
    //   139: invokestatic Dne : (D)F
    //   142: fstore #10
    //   144: aload_0
    //   145: aload_0
    //   146: dload_1
    //   147: dload #5
    //   149: invokestatic atan2 : (DD)D
    //   152: ldc2_w 180.0
    //   155: dmul
    //   156: ldc2_w 3.141592653589793
    //   159: ddiv
    //   160: d2f
    //   161: dup_x1
    //   162: putfield mrb : F
    //   165: putfield Zpi : F
    //   168: aload_0
    //   169: aload_0
    //   170: dload_3
    //   171: fload #10
    //   173: f2d
    //   174: invokestatic atan2 : (DD)D
    //   177: ldc2_w 180.0
    //   180: dmul
    //   181: ldc2_w 3.141592653589793
    //   184: ddiv
    //   185: d2f
    //   186: dup_x1
    //   187: putfield XHL : F
    //   190: putfield kGO : F
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield ceE : I
    //   198: return
  }
  
  protected float zGp() {
    return 0.0F;
  }
  
  public VHz(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = false;
    this.bzF = null;
    this.EyB = 0;
    Dne(0.25F, 0.25F);
  }
  
  public void Dne(WkD paramWkD) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'xTile'
    //   3: aload_0
    //   4: getfield FWm : I
    //   7: i2s
    //   8: invokevirtual Dne : (Ljava/lang/String;S)V
    //   11: aload_1
    //   12: ldc 'yTile'
    //   14: aload_0
    //   15: getfield bzF : I
    //   18: i2s
    //   19: invokevirtual Dne : (Ljava/lang/String;S)V
    //   22: aload_1
    //   23: ldc 'zTile'
    //   25: aload_0
    //   26: getfield Qnq : I
    //   29: i2s
    //   30: invokevirtual Dne : (Ljava/lang/String;S)V
    //   33: aload_1
    //   34: ldc 'inTile'
    //   36: aload_0
    //   37: getfield Vxn : I
    //   40: i2b
    //   41: invokevirtual Dne : (Ljava/lang/String;B)V
    //   44: aload_1
    //   45: ldc 'shake'
    //   47: aload_0
    //   48: getfield Dne : I
    //   51: i2b
    //   52: invokevirtual Dne : (Ljava/lang/String;B)V
    //   55: aload_1
    //   56: ldc 'inGround'
    //   58: aload_0
    //   59: getfield Dne : Z
    //   62: ifeq -> 69
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iconst_0
    //   70: i2b
    //   71: invokevirtual Dne : (Ljava/lang/String;B)V
    //   74: aload_0
    //   75: getfield bzF : Ljava/lang/String;
    //   78: ifnull -> 91
    //   81: aload_0
    //   82: getfield bzF : Ljava/lang/String;
    //   85: invokevirtual length : ()I
    //   88: ifne -> 119
    //   91: aload_0
    //   92: getfield Dne : LFUH;
    //   95: ifnull -> 119
    //   98: aload_0
    //   99: getfield Dne : LFUH;
    //   102: instanceof FiG
    //   105: ifeq -> 119
    //   108: aload_0
    //   109: aload_0
    //   110: getfield Dne : LFUH;
    //   113: invokevirtual Dne : ()Ljava/lang/String;
    //   116: putfield bzF : Ljava/lang/String;
    //   119: aload_1
    //   120: ldc 'ownerName'
    //   122: aload_0
    //   123: getfield bzF : Ljava/lang/String;
    //   126: ifnonnull -> 134
    //   129: ldc ''
    //   131: goto -> 138
    //   134: aload_0
    //   135: getfield bzF : Ljava/lang/String;
    //   138: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   141: return
  }
  
  protected void FWm() {}
  
  public VHz(Qnq paramQnq, FUH paramFUH) {
    super(paramQnq);
    this.Dne = false;
    this.bzF = null;
    this.EyB = 0;
    this.Dne = paramFUH;
    Dne(0.25F, 0.25F);
    FWm(paramFUH.div, paramFUH.IjH + paramFUH.c_(), paramFUH.mrb, paramFUH.mrb, paramFUH.XHL);
    this.div -= (geR.FWm(this.mrb / 180.0F * 3.1415927F) * 0.16F);
    this.IjH -= 0.10000000149011612D;
    this.mrb -= (geR.Dne(this.mrb / 180.0F * 3.1415927F) * 0.16F);
    bzF(this.div, this.IjH, this.mrb);
    this.udO = 0.0F;
    float f = 0.4F;
    this.XHL = (-geR.Dne(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F) * f);
    this.kGO = (geR.FWm(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F) * f);
    this.Zpi = (-geR.Dne((this.XHL + zGp()) / 180.0F * 3.1415927F) * f);
    bzF(this.XHL, this.Zpi, this.kGO, bzF(), 1.0F);
  }
  
  public VHz(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq);
    this.Dne = false;
    this.bzF = null;
    this.EyB = 0;
    this.ceE = 0;
    Dne(0.25F, 0.25F);
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.udO = 0.0F;
  }
  
  public FUH Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LFUH;
    //   4: ifnonnull -> 39
    //   7: aload_0
    //   8: getfield bzF : Ljava/lang/String;
    //   11: ifnull -> 39
    //   14: aload_0
    //   15: getfield bzF : Ljava/lang/String;
    //   18: invokevirtual length : ()I
    //   21: ifle -> 39
    //   24: aload_0
    //   25: aload_0
    //   26: getfield Dne : LQnq;
    //   29: aload_0
    //   30: getfield bzF : Ljava/lang/String;
    //   33: invokevirtual Dne : (Ljava/lang/String;)LFiG;
    //   36: putfield Dne : LFUH;
    //   39: aload_0
    //   40: getfield Dne : LFUH;
    //   43: areturn
  }
  
  public void aFZ(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.XHL = paramDouble1;
    this.Zpi = paramDouble2;
    this.kGO = paramDouble3;
    if (this.kGO == 0.0F && this.Zpi == 0.0F) {
      float f = geR.Dne(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
      this.Zpi = this.mrb = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / Math.PI);
      this.kGO = this.XHL = (float)(Math.atan2(paramDouble2, f) * 180.0D / Math.PI);
    } 
  }
  
  protected abstract void Dne(wHH paramwHH);
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: ldc 'xTile'
    //   4: invokevirtual Dne : (Ljava/lang/String;)S
    //   7: putfield FWm : I
    //   10: aload_0
    //   11: aload_1
    //   12: ldc 'yTile'
    //   14: invokevirtual Dne : (Ljava/lang/String;)S
    //   17: putfield bzF : I
    //   20: aload_0
    //   21: aload_1
    //   22: ldc 'zTile'
    //   24: invokevirtual Dne : (Ljava/lang/String;)S
    //   27: putfield Qnq : I
    //   30: aload_0
    //   31: aload_1
    //   32: ldc 'inTile'
    //   34: invokevirtual Dne : (Ljava/lang/String;)B
    //   37: sipush #255
    //   40: iand
    //   41: putfield Vxn : I
    //   44: aload_0
    //   45: aload_1
    //   46: ldc 'shake'
    //   48: invokevirtual Dne : (Ljava/lang/String;)B
    //   51: sipush #255
    //   54: iand
    //   55: putfield Dne : I
    //   58: aload_0
    //   59: aload_1
    //   60: ldc 'inGround'
    //   62: invokevirtual Dne : (Ljava/lang/String;)B
    //   65: iconst_1
    //   66: if_icmpne -> 73
    //   69: iconst_1
    //   70: goto -> 74
    //   73: iconst_0
    //   74: putfield Dne : Z
    //   77: aload_0
    //   78: aload_1
    //   79: ldc 'ownerName'
    //   81: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   84: putfield bzF : Ljava/lang/String;
    //   87: aload_0
    //   88: getfield bzF : Ljava/lang/String;
    //   91: ifnull -> 109
    //   94: aload_0
    //   95: getfield bzF : Ljava/lang/String;
    //   98: invokevirtual length : ()I
    //   101: ifne -> 109
    //   104: aload_0
    //   105: aconst_null
    //   106: putfield bzF : Ljava/lang/String;
    //   109: return
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield div : D
    //   5: putfield udO : D
    //   8: aload_0
    //   9: aload_0
    //   10: getfield IjH : D
    //   13: putfield ooe : D
    //   16: aload_0
    //   17: aload_0
    //   18: getfield mrb : D
    //   21: putfield trS : D
    //   24: aload_0
    //   25: invokespecial Dne : ()V
    //   28: aload_0
    //   29: getfield Dne : I
    //   32: ifle -> 45
    //   35: aload_0
    //   36: dup
    //   37: getfield Dne : I
    //   40: iconst_1
    //   41: isub
    //   42: putfield Dne : I
    //   45: aload_0
    //   46: getfield Dne : Z
    //   49: ifeq -> 183
    //   52: aload_0
    //   53: getfield Dne : LQnq;
    //   56: aload_0
    //   57: getfield FWm : I
    //   60: aload_0
    //   61: getfield bzF : I
    //   64: aload_0
    //   65: getfield Qnq : I
    //   68: invokevirtual Dne : (III)I
    //   71: istore_1
    //   72: iload_1
    //   73: aload_0
    //   74: getfield Vxn : I
    //   77: if_icmpne -> 105
    //   80: aload_0
    //   81: dup
    //   82: getfield ceE : I
    //   85: iconst_1
    //   86: iadd
    //   87: putfield ceE : I
    //   90: aload_0
    //   91: getfield ceE : I
    //   94: sipush #1200
    //   97: if_icmpne -> 104
    //   100: aload_0
    //   101: invokevirtual g_ : ()V
    //   104: return
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield Dne : Z
    //   110: aload_0
    //   111: dup
    //   112: getfield XHL : D
    //   115: aload_0
    //   116: getfield Dne : Ljava/util/Random;
    //   119: invokevirtual nextFloat : ()F
    //   122: ldc 0.2
    //   124: fmul
    //   125: f2d
    //   126: dmul
    //   127: putfield XHL : D
    //   130: aload_0
    //   131: dup
    //   132: getfield Zpi : D
    //   135: aload_0
    //   136: getfield Dne : Ljava/util/Random;
    //   139: invokevirtual nextFloat : ()F
    //   142: ldc 0.2
    //   144: fmul
    //   145: f2d
    //   146: dmul
    //   147: putfield Zpi : D
    //   150: aload_0
    //   151: dup
    //   152: getfield kGO : D
    //   155: aload_0
    //   156: getfield Dne : Ljava/util/Random;
    //   159: invokevirtual nextFloat : ()F
    //   162: ldc 0.2
    //   164: fmul
    //   165: f2d
    //   166: dmul
    //   167: putfield kGO : D
    //   170: aload_0
    //   171: iconst_0
    //   172: putfield ceE : I
    //   175: aload_0
    //   176: iconst_0
    //   177: putfield EyB : I
    //   180: goto -> 193
    //   183: aload_0
    //   184: dup
    //   185: getfield EyB : I
    //   188: iconst_1
    //   189: iadd
    //   190: putfield EyB : I
    //   193: aload_0
    //   194: getfield Dne : LQnq;
    //   197: invokevirtual Dne : ()LziS;
    //   200: aload_0
    //   201: getfield div : D
    //   204: aload_0
    //   205: getfield IjH : D
    //   208: aload_0
    //   209: getfield mrb : D
    //   212: invokevirtual Dne : (DDD)LchN;
    //   215: astore_1
    //   216: aload_0
    //   217: getfield Dne : LQnq;
    //   220: invokevirtual Dne : ()LziS;
    //   223: aload_0
    //   224: getfield div : D
    //   227: aload_0
    //   228: getfield XHL : D
    //   231: dadd
    //   232: aload_0
    //   233: getfield IjH : D
    //   236: aload_0
    //   237: getfield Zpi : D
    //   240: dadd
    //   241: aload_0
    //   242: getfield mrb : D
    //   245: aload_0
    //   246: getfield kGO : D
    //   249: dadd
    //   250: invokevirtual Dne : (DDD)LchN;
    //   253: astore_2
    //   254: aload_0
    //   255: getfield Dne : LQnq;
    //   258: aload_1
    //   259: aload_2
    //   260: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   263: astore_3
    //   264: aload_0
    //   265: getfield Dne : LQnq;
    //   268: invokevirtual Dne : ()LziS;
    //   271: aload_0
    //   272: getfield div : D
    //   275: aload_0
    //   276: getfield IjH : D
    //   279: aload_0
    //   280: getfield mrb : D
    //   283: invokevirtual Dne : (DDD)LchN;
    //   286: astore_1
    //   287: aload_0
    //   288: getfield Dne : LQnq;
    //   291: invokevirtual Dne : ()LziS;
    //   294: aload_0
    //   295: getfield div : D
    //   298: aload_0
    //   299: getfield XHL : D
    //   302: dadd
    //   303: aload_0
    //   304: getfield IjH : D
    //   307: aload_0
    //   308: getfield Zpi : D
    //   311: dadd
    //   312: aload_0
    //   313: getfield mrb : D
    //   316: aload_0
    //   317: getfield kGO : D
    //   320: dadd
    //   321: invokevirtual Dne : (DDD)LchN;
    //   324: astore_2
    //   325: aload_3
    //   326: ifnull -> 361
    //   329: aload_0
    //   330: getfield Dne : LQnq;
    //   333: invokevirtual Dne : ()LziS;
    //   336: aload_3
    //   337: getfield Dne : LchN;
    //   340: getfield Dne : D
    //   343: aload_3
    //   344: getfield Dne : LchN;
    //   347: getfield FWm : D
    //   350: aload_3
    //   351: getfield Dne : LchN;
    //   354: getfield bzF : D
    //   357: invokevirtual Dne : (DDD)LchN;
    //   360: astore_2
    //   361: aload_0
    //   362: getfield Dne : LQnq;
    //   365: getfield aFZ : Z
    //   368: ifne -> 563
    //   371: aconst_null
    //   372: astore #4
    //   374: aload_0
    //   375: getfield Dne : LQnq;
    //   378: aload_0
    //   379: aload_0
    //   380: getfield Dne : LbSp;
    //   383: aload_0
    //   384: getfield XHL : D
    //   387: aload_0
    //   388: getfield Zpi : D
    //   391: aload_0
    //   392: getfield kGO : D
    //   395: invokevirtual Dne : (DDD)LbSp;
    //   398: dconst_1
    //   399: dconst_1
    //   400: dconst_1
    //   401: invokevirtual FWm : (DDD)LbSp;
    //   404: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   407: astore #5
    //   409: dconst_0
    //   410: dstore #6
    //   412: aload_0
    //   413: invokevirtual Dne : ()LFUH;
    //   416: astore #8
    //   418: iconst_0
    //   419: istore #9
    //   421: iload #9
    //   423: aload #5
    //   425: invokeinterface size : ()I
    //   430: if_icmpge -> 548
    //   433: aload #5
    //   435: iload #9
    //   437: invokeinterface get : (I)Ljava/lang/Object;
    //   442: checkcast sMa
    //   445: astore #10
    //   447: aload #10
    //   449: invokevirtual kGO : ()Z
    //   452: ifeq -> 542
    //   455: aload #10
    //   457: aload #8
    //   459: if_acmpne -> 470
    //   462: aload_0
    //   463: getfield EyB : I
    //   466: iconst_5
    //   467: if_icmplt -> 542
    //   470: ldc_w 0.3
    //   473: fstore #11
    //   475: aload #10
    //   477: getfield Dne : LbSp;
    //   480: fload #11
    //   482: f2d
    //   483: fload #11
    //   485: f2d
    //   486: fload #11
    //   488: f2d
    //   489: invokevirtual FWm : (DDD)LbSp;
    //   492: astore #12
    //   494: aload #12
    //   496: aload_1
    //   497: aload_2
    //   498: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   501: astore #13
    //   503: aload #13
    //   505: ifnull -> 542
    //   508: aload_1
    //   509: aload #13
    //   511: getfield Dne : LchN;
    //   514: invokevirtual FWm : (LchN;)D
    //   517: dstore #14
    //   519: dload #14
    //   521: dload #6
    //   523: dcmpg
    //   524: iflt -> 534
    //   527: dload #6
    //   529: dconst_0
    //   530: dcmpl
    //   531: ifne -> 542
    //   534: aload #10
    //   536: astore #4
    //   538: dload #14
    //   540: dstore #6
    //   542: iinc #9, 1
    //   545: goto -> 421
    //   548: aload #4
    //   550: ifnull -> 563
    //   553: new wHH
    //   556: dup
    //   557: aload #4
    //   559: invokespecial <init> : (LsMa;)V
    //   562: astore_3
    //   563: aload_3
    //   564: ifnull -> 617
    //   567: aload_3
    //   568: getfield Dne : Lgks;
    //   571: getstatic gks.Dne : Lgks;
    //   574: if_acmpne -> 612
    //   577: aload_0
    //   578: getfield Dne : LQnq;
    //   581: aload_3
    //   582: getfield Dne : I
    //   585: aload_3
    //   586: getfield FWm : I
    //   589: aload_3
    //   590: getfield bzF : I
    //   593: invokevirtual Dne : (III)I
    //   596: getstatic zKP.Dne : LQkV;
    //   599: getfield FWm : I
    //   602: if_icmpne -> 612
    //   605: aload_0
    //   606: invokevirtual Fnk : ()V
    //   609: goto -> 617
    //   612: aload_0
    //   613: aload_3
    //   614: invokevirtual Dne : (LwHH;)V
    //   617: aload_0
    //   618: dup
    //   619: getfield div : D
    //   622: aload_0
    //   623: getfield XHL : D
    //   626: dadd
    //   627: putfield div : D
    //   630: aload_0
    //   631: dup
    //   632: getfield IjH : D
    //   635: aload_0
    //   636: getfield Zpi : D
    //   639: dadd
    //   640: putfield IjH : D
    //   643: aload_0
    //   644: dup
    //   645: getfield mrb : D
    //   648: aload_0
    //   649: getfield kGO : D
    //   652: dadd
    //   653: putfield mrb : D
    //   656: aload_0
    //   657: getfield XHL : D
    //   660: aload_0
    //   661: getfield XHL : D
    //   664: dmul
    //   665: aload_0
    //   666: getfield kGO : D
    //   669: aload_0
    //   670: getfield kGO : D
    //   673: dmul
    //   674: dadd
    //   675: invokestatic Dne : (D)F
    //   678: fstore #4
    //   680: aload_0
    //   681: aload_0
    //   682: getfield XHL : D
    //   685: aload_0
    //   686: getfield kGO : D
    //   689: invokestatic atan2 : (DD)D
    //   692: ldc2_w 180.0
    //   695: dmul
    //   696: ldc2_w 3.141592653589793
    //   699: ddiv
    //   700: d2f
    //   701: putfield mrb : F
    //   704: aload_0
    //   705: aload_0
    //   706: getfield Zpi : D
    //   709: fload #4
    //   711: f2d
    //   712: invokestatic atan2 : (DD)D
    //   715: ldc2_w 180.0
    //   718: dmul
    //   719: ldc2_w 3.141592653589793
    //   722: ddiv
    //   723: d2f
    //   724: putfield XHL : F
    //   727: aload_0
    //   728: getfield XHL : F
    //   731: aload_0
    //   732: getfield kGO : F
    //   735: fsub
    //   736: ldc_w -180.0
    //   739: fcmpg
    //   740: ifge -> 758
    //   743: aload_0
    //   744: dup
    //   745: getfield kGO : F
    //   748: ldc_w 360.0
    //   751: fsub
    //   752: putfield kGO : F
    //   755: goto -> 727
    //   758: aload_0
    //   759: getfield XHL : F
    //   762: aload_0
    //   763: getfield kGO : F
    //   766: fsub
    //   767: ldc 180.0
    //   769: fcmpl
    //   770: iflt -> 788
    //   773: aload_0
    //   774: dup
    //   775: getfield kGO : F
    //   778: ldc_w 360.0
    //   781: fadd
    //   782: putfield kGO : F
    //   785: goto -> 758
    //   788: aload_0
    //   789: getfield mrb : F
    //   792: aload_0
    //   793: getfield Zpi : F
    //   796: fsub
    //   797: ldc_w -180.0
    //   800: fcmpg
    //   801: ifge -> 819
    //   804: aload_0
    //   805: dup
    //   806: getfield Zpi : F
    //   809: ldc_w 360.0
    //   812: fsub
    //   813: putfield Zpi : F
    //   816: goto -> 788
    //   819: aload_0
    //   820: getfield mrb : F
    //   823: aload_0
    //   824: getfield Zpi : F
    //   827: fsub
    //   828: ldc 180.0
    //   830: fcmpl
    //   831: iflt -> 849
    //   834: aload_0
    //   835: dup
    //   836: getfield Zpi : F
    //   839: ldc_w 360.0
    //   842: fadd
    //   843: putfield Zpi : F
    //   846: goto -> 819
    //   849: aload_0
    //   850: aload_0
    //   851: getfield kGO : F
    //   854: aload_0
    //   855: getfield XHL : F
    //   858: aload_0
    //   859: getfield kGO : F
    //   862: fsub
    //   863: ldc 0.2
    //   865: fmul
    //   866: fadd
    //   867: putfield XHL : F
    //   870: aload_0
    //   871: aload_0
    //   872: getfield Zpi : F
    //   875: aload_0
    //   876: getfield mrb : F
    //   879: aload_0
    //   880: getfield Zpi : F
    //   883: fsub
    //   884: ldc 0.2
    //   886: fmul
    //   887: fadd
    //   888: putfield mrb : F
    //   891: ldc_w 0.99
    //   894: fstore #5
    //   896: aload_0
    //   897: invokevirtual DyG : ()F
    //   900: fstore #6
    //   902: aload_0
    //   903: invokevirtual Zpi : ()Z
    //   906: ifeq -> 994
    //   909: iconst_0
    //   910: istore #7
    //   912: iload #7
    //   914: iconst_4
    //   915: if_icmpge -> 989
    //   918: ldc 0.25
    //   920: fstore #8
    //   922: aload_0
    //   923: getfield Dne : LQnq;
    //   926: ldc_w 'bubble'
    //   929: aload_0
    //   930: getfield div : D
    //   933: aload_0
    //   934: getfield XHL : D
    //   937: fload #8
    //   939: f2d
    //   940: dmul
    //   941: dsub
    //   942: aload_0
    //   943: getfield IjH : D
    //   946: aload_0
    //   947: getfield Zpi : D
    //   950: fload #8
    //   952: f2d
    //   953: dmul
    //   954: dsub
    //   955: aload_0
    //   956: getfield mrb : D
    //   959: aload_0
    //   960: getfield kGO : D
    //   963: fload #8
    //   965: f2d
    //   966: dmul
    //   967: dsub
    //   968: aload_0
    //   969: getfield XHL : D
    //   972: aload_0
    //   973: getfield Zpi : D
    //   976: aload_0
    //   977: getfield kGO : D
    //   980: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   983: iinc #7, 1
    //   986: goto -> 912
    //   989: ldc_w 0.8
    //   992: fstore #5
    //   994: aload_0
    //   995: dup
    //   996: getfield XHL : D
    //   999: fload #5
    //   1001: f2d
    //   1002: dmul
    //   1003: putfield XHL : D
    //   1006: aload_0
    //   1007: dup
    //   1008: getfield Zpi : D
    //   1011: fload #5
    //   1013: f2d
    //   1014: dmul
    //   1015: putfield Zpi : D
    //   1018: aload_0
    //   1019: dup
    //   1020: getfield kGO : D
    //   1023: fload #5
    //   1025: f2d
    //   1026: dmul
    //   1027: putfield kGO : D
    //   1030: aload_0
    //   1031: dup
    //   1032: getfield Zpi : D
    //   1035: fload #6
    //   1037: f2d
    //   1038: dsub
    //   1039: putfield Zpi : D
    //   1042: aload_0
    //   1043: aload_0
    //   1044: getfield div : D
    //   1047: aload_0
    //   1048: getfield IjH : D
    //   1051: aload_0
    //   1052: getfield mrb : D
    //   1055: invokevirtual bzF : (DDD)V
    //   1058: return
  }
  
  protected float bzF() {
    return 1.5F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VHz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */