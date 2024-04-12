public abstract class HzK extends Azh implements NbA {
  private int FWm;
  
  private int One = 0;
  
  private void Dne(HzK paramHzK) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Dne : (LAzh;)LAzh;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnull -> 236
    //   10: aload_0
    //   11: sipush #6000
    //   14: invokevirtual FWm : (I)V
    //   17: aload_1
    //   18: sipush #6000
    //   21: invokevirtual FWm : (I)V
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield FWm : I
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield One : I
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield bzF : LsMa;
    //   39: aload_1
    //   40: aconst_null
    //   41: putfield bzF : LsMa;
    //   44: aload_1
    //   45: iconst_0
    //   46: putfield One : I
    //   49: aload_1
    //   50: iconst_0
    //   51: putfield FWm : I
    //   54: aload_2
    //   55: sipush #-24000
    //   58: invokevirtual FWm : (I)V
    //   61: aload_2
    //   62: aload_0
    //   63: getfield div : D
    //   66: aload_0
    //   67: getfield IjH : D
    //   70: aload_0
    //   71: getfield mrb : D
    //   74: aload_0
    //   75: getfield mrb : F
    //   78: aload_0
    //   79: getfield XHL : F
    //   82: invokevirtual FWm : (DDDFF)V
    //   85: iconst_0
    //   86: istore_3
    //   87: iload_3
    //   88: bipush #7
    //   90: if_icmpge -> 227
    //   93: aload_0
    //   94: getfield Dne : Ljava/util/Random;
    //   97: invokevirtual nextGaussian : ()D
    //   100: ldc2_w 0.02
    //   103: dmul
    //   104: dstore #4
    //   106: aload_0
    //   107: getfield Dne : Ljava/util/Random;
    //   110: invokevirtual nextGaussian : ()D
    //   113: ldc2_w 0.02
    //   116: dmul
    //   117: dstore #6
    //   119: aload_0
    //   120: getfield Dne : Ljava/util/Random;
    //   123: invokevirtual nextGaussian : ()D
    //   126: ldc2_w 0.02
    //   129: dmul
    //   130: dstore #8
    //   132: aload_0
    //   133: getfield Dne : LQnq;
    //   136: ldc 'heart'
    //   138: aload_0
    //   139: getfield div : D
    //   142: aload_0
    //   143: getfield Dne : Ljava/util/Random;
    //   146: invokevirtual nextFloat : ()F
    //   149: aload_0
    //   150: getfield ooe : F
    //   153: fmul
    //   154: fconst_2
    //   155: fmul
    //   156: f2d
    //   157: dadd
    //   158: aload_0
    //   159: getfield ooe : F
    //   162: f2d
    //   163: dsub
    //   164: aload_0
    //   165: getfield IjH : D
    //   168: ldc2_w 0.5
    //   171: dadd
    //   172: aload_0
    //   173: getfield Dne : Ljava/util/Random;
    //   176: invokevirtual nextFloat : ()F
    //   179: aload_0
    //   180: getfield trS : F
    //   183: fmul
    //   184: f2d
    //   185: dadd
    //   186: aload_0
    //   187: getfield mrb : D
    //   190: aload_0
    //   191: getfield Dne : Ljava/util/Random;
    //   194: invokevirtual nextFloat : ()F
    //   197: aload_0
    //   198: getfield ooe : F
    //   201: fmul
    //   202: fconst_2
    //   203: fmul
    //   204: f2d
    //   205: dadd
    //   206: aload_0
    //   207: getfield ooe : F
    //   210: f2d
    //   211: dsub
    //   212: dload #4
    //   214: dload #6
    //   216: dload #8
    //   218: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   221: iinc #3, 1
    //   224: goto -> 87
    //   227: aload_0
    //   228: getfield Dne : LQnq;
    //   231: aload_2
    //   232: invokevirtual FWm : (LsMa;)Z
    //   235: pop
    //   236: return
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq.bzF == dEr.EWz.Qnq);
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: iload_1
    //   5: iload_2
    //   6: iconst_1
    //   7: isub
    //   8: iload_3
    //   9: invokevirtual Dne : (III)I
    //   12: getstatic zKP.Dne : LZQN;
    //   15: getfield FWm : I
    //   18: if_icmpne -> 26
    //   21: ldc 10.0
    //   23: goto -> 39
    //   26: aload_0
    //   27: getfield Dne : LQnq;
    //   30: iload_1
    //   31: iload_2
    //   32: iload_3
    //   33: invokevirtual Dne : (III)F
    //   36: ldc 0.5
    //   38: fsub
    //   39: freturn
  }
  
  public HzK(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public boolean cot() {
    // Byte code:
    //   0: aload_0
    //   1: getfield div : D
    //   4: invokestatic FWm : (D)I
    //   7: istore_1
    //   8: aload_0
    //   9: getfield Dne : LbSp;
    //   12: getfield FWm : D
    //   15: invokestatic FWm : (D)I
    //   18: istore_2
    //   19: aload_0
    //   20: getfield mrb : D
    //   23: invokestatic FWm : (D)I
    //   26: istore_3
    //   27: aload_0
    //   28: getfield Dne : LQnq;
    //   31: iload_1
    //   32: iload_2
    //   33: iconst_1
    //   34: isub
    //   35: iload_3
    //   36: invokevirtual Dne : (III)I
    //   39: getstatic zKP.Dne : LZQN;
    //   42: getfield FWm : I
    //   45: if_icmpne -> 74
    //   48: aload_0
    //   49: getfield Dne : LQnq;
    //   52: iload_1
    //   53: iload_2
    //   54: iload_3
    //   55: invokevirtual Qnq : (III)I
    //   58: bipush #8
    //   60: if_icmple -> 74
    //   63: aload_0
    //   64: invokespecial cot : ()Z
    //   67: ifeq -> 74
    //   70: iconst_1
    //   71: goto -> 75
    //   74: iconst_0
    //   75: ireturn
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    this.Dne = 60;
    this.bzF = null;
    this.FWm = 0;
    return super.Dne(paramzBn, paramInt);
  }
  
  protected int Dne(FiG paramFiG) {
    return 1 + this.Dne.Dne.nextInt(3);
  }
  
  protected sMa Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifle -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: ldc 8.0
    //   11: fstore_1
    //   12: aload_0
    //   13: getfield FWm : I
    //   16: ifle -> 91
    //   19: aload_0
    //   20: getfield Dne : LQnq;
    //   23: aload_0
    //   24: invokevirtual getClass : ()Ljava/lang/Class;
    //   27: aload_0
    //   28: getfield Dne : LbSp;
    //   31: fload_1
    //   32: f2d
    //   33: fload_1
    //   34: f2d
    //   35: fload_1
    //   36: f2d
    //   37: invokevirtual FWm : (DDD)LbSp;
    //   40: invokevirtual Dne : (Ljava/lang/Class;LbSp;)Ljava/util/List;
    //   43: astore_2
    //   44: iconst_0
    //   45: istore_3
    //   46: iload_3
    //   47: aload_2
    //   48: invokeinterface size : ()I
    //   53: if_icmpge -> 253
    //   56: aload_2
    //   57: iload_3
    //   58: invokeinterface get : (I)Ljava/lang/Object;
    //   63: checkcast HzK
    //   66: astore #4
    //   68: aload #4
    //   70: aload_0
    //   71: if_acmpeq -> 85
    //   74: aload #4
    //   76: getfield FWm : I
    //   79: ifle -> 85
    //   82: aload #4
    //   84: areturn
    //   85: iinc #3, 1
    //   88: goto -> 46
    //   91: aload_0
    //   92: invokevirtual bzF : ()I
    //   95: ifne -> 174
    //   98: aload_0
    //   99: getfield Dne : LQnq;
    //   102: ldc FiG
    //   104: aload_0
    //   105: getfield Dne : LbSp;
    //   108: fload_1
    //   109: f2d
    //   110: fload_1
    //   111: f2d
    //   112: fload_1
    //   113: f2d
    //   114: invokevirtual FWm : (DDD)LbSp;
    //   117: invokevirtual Dne : (Ljava/lang/Class;LbSp;)Ljava/util/List;
    //   120: astore_2
    //   121: iconst_0
    //   122: istore_3
    //   123: iload_3
    //   124: aload_2
    //   125: invokeinterface size : ()I
    //   130: if_icmpge -> 253
    //   133: aload_2
    //   134: iload_3
    //   135: invokeinterface get : (I)Ljava/lang/Object;
    //   140: checkcast FiG
    //   143: astore #5
    //   145: aload #5
    //   147: invokevirtual bzF : ()LNMq;
    //   150: ifnull -> 168
    //   153: aload_0
    //   154: aload #5
    //   156: invokevirtual bzF : ()LNMq;
    //   159: invokevirtual Dne : (LNMq;)Z
    //   162: ifeq -> 168
    //   165: aload #5
    //   167: areturn
    //   168: iinc #3, 1
    //   171: goto -> 123
    //   174: aload_0
    //   175: invokevirtual bzF : ()I
    //   178: ifle -> 253
    //   181: aload_0
    //   182: getfield Dne : LQnq;
    //   185: aload_0
    //   186: invokevirtual getClass : ()Ljava/lang/Class;
    //   189: aload_0
    //   190: getfield Dne : LbSp;
    //   193: fload_1
    //   194: f2d
    //   195: fload_1
    //   196: f2d
    //   197: fload_1
    //   198: f2d
    //   199: invokevirtual FWm : (DDD)LbSp;
    //   202: invokevirtual Dne : (Ljava/lang/Class;LbSp;)Ljava/util/List;
    //   205: astore_2
    //   206: iconst_0
    //   207: istore_3
    //   208: iload_3
    //   209: aload_2
    //   210: invokeinterface size : ()I
    //   215: if_icmpge -> 253
    //   218: aload_2
    //   219: iload_3
    //   220: invokeinterface get : (I)Ljava/lang/Object;
    //   225: checkcast HzK
    //   228: astore #4
    //   230: aload #4
    //   232: aload_0
    //   233: if_acmpeq -> 247
    //   236: aload #4
    //   238: invokevirtual bzF : ()I
    //   241: ifge -> 247
    //   244: aload #4
    //   246: areturn
    //   247: iinc #3, 1
    //   250: goto -> 208
    //   253: aconst_null
    //   254: areturn
  }
  
  public int mrb() {
    return 120;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("InLove", this.FWm);
  }
  
  public boolean a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LMOS;
    //   4: invokevirtual Dne : ()LNMq;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull -> 235
    //   12: aload_0
    //   13: aload_2
    //   14: invokevirtual Dne : (LNMq;)Z
    //   17: ifeq -> 235
    //   20: aload_0
    //   21: invokevirtual bzF : ()I
    //   24: ifne -> 235
    //   27: aload_0
    //   28: getfield FWm : I
    //   31: ifgt -> 235
    //   34: aload_1
    //   35: getfield Dne : Luqg;
    //   38: getfield Qnq : Z
    //   41: ifne -> 79
    //   44: aload_2
    //   45: dup
    //   46: getfield Dne : I
    //   49: iconst_1
    //   50: isub
    //   51: putfield Dne : I
    //   54: aload_2
    //   55: getfield Dne : I
    //   58: ifgt -> 79
    //   61: aload_1
    //   62: getfield Dne : LMOS;
    //   65: aload_1
    //   66: getfield Dne : LMOS;
    //   69: getfield Dne : I
    //   72: aconst_null
    //   73: checkcast NMq
    //   76: invokevirtual Dne : (ILNMq;)V
    //   79: aload_0
    //   80: sipush #600
    //   83: putfield FWm : I
    //   86: aload_0
    //   87: aconst_null
    //   88: putfield bzF : LsMa;
    //   91: iconst_0
    //   92: istore_3
    //   93: iload_3
    //   94: bipush #7
    //   96: if_icmpge -> 233
    //   99: aload_0
    //   100: getfield Dne : Ljava/util/Random;
    //   103: invokevirtual nextGaussian : ()D
    //   106: ldc2_w 0.02
    //   109: dmul
    //   110: dstore #4
    //   112: aload_0
    //   113: getfield Dne : Ljava/util/Random;
    //   116: invokevirtual nextGaussian : ()D
    //   119: ldc2_w 0.02
    //   122: dmul
    //   123: dstore #6
    //   125: aload_0
    //   126: getfield Dne : Ljava/util/Random;
    //   129: invokevirtual nextGaussian : ()D
    //   132: ldc2_w 0.02
    //   135: dmul
    //   136: dstore #8
    //   138: aload_0
    //   139: getfield Dne : LQnq;
    //   142: ldc 'heart'
    //   144: aload_0
    //   145: getfield div : D
    //   148: aload_0
    //   149: getfield Dne : Ljava/util/Random;
    //   152: invokevirtual nextFloat : ()F
    //   155: aload_0
    //   156: getfield ooe : F
    //   159: fmul
    //   160: fconst_2
    //   161: fmul
    //   162: f2d
    //   163: dadd
    //   164: aload_0
    //   165: getfield ooe : F
    //   168: f2d
    //   169: dsub
    //   170: aload_0
    //   171: getfield IjH : D
    //   174: ldc2_w 0.5
    //   177: dadd
    //   178: aload_0
    //   179: getfield Dne : Ljava/util/Random;
    //   182: invokevirtual nextFloat : ()F
    //   185: aload_0
    //   186: getfield trS : F
    //   189: fmul
    //   190: f2d
    //   191: dadd
    //   192: aload_0
    //   193: getfield mrb : D
    //   196: aload_0
    //   197: getfield Dne : Ljava/util/Random;
    //   200: invokevirtual nextFloat : ()F
    //   203: aload_0
    //   204: getfield ooe : F
    //   207: fmul
    //   208: fconst_2
    //   209: fmul
    //   210: f2d
    //   211: dadd
    //   212: aload_0
    //   213: getfield ooe : F
    //   216: f2d
    //   217: dsub
    //   218: dload #4
    //   220: dload #6
    //   222: dload #8
    //   224: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   227: iinc #3, 1
    //   230: goto -> 93
    //   233: iconst_1
    //   234: ireturn
    //   235: aload_0
    //   236: aload_1
    //   237: invokespecial a_ : (LFiG;)Z
    //   240: ireturn
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof FiG
    //   4: ifeq -> 93
    //   7: fload_2
    //   8: ldc 3.0
    //   10: fcmpg
    //   11: ifge -> 62
    //   14: aload_1
    //   15: getfield div : D
    //   18: aload_0
    //   19: getfield div : D
    //   22: dsub
    //   23: dstore_3
    //   24: aload_1
    //   25: getfield mrb : D
    //   28: aload_0
    //   29: getfield mrb : D
    //   32: dsub
    //   33: dstore #5
    //   35: aload_0
    //   36: dload #5
    //   38: dload_3
    //   39: invokestatic atan2 : (DD)D
    //   42: ldc2_w 180.0
    //   45: dmul
    //   46: ldc2_w 3.141592653589793
    //   49: ddiv
    //   50: d2f
    //   51: ldc 90.0
    //   53: fsub
    //   54: putfield mrb : F
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield Dne : Z
    //   62: aload_1
    //   63: checkcast FiG
    //   66: astore_3
    //   67: aload_3
    //   68: invokevirtual bzF : ()LNMq;
    //   71: ifnull -> 85
    //   74: aload_0
    //   75: aload_3
    //   76: invokevirtual bzF : ()LNMq;
    //   79: invokevirtual Dne : (LNMq;)Z
    //   82: ifne -> 90
    //   85: aload_0
    //   86: aconst_null
    //   87: putfield bzF : LsMa;
    //   90: goto -> 342
    //   93: aload_1
    //   94: instanceof HzK
    //   97: ifeq -> 342
    //   100: aload_1
    //   101: checkcast HzK
    //   104: astore_3
    //   105: aload_0
    //   106: invokevirtual bzF : ()I
    //   109: ifle -> 136
    //   112: aload_3
    //   113: invokevirtual bzF : ()I
    //   116: ifge -> 136
    //   119: fload_2
    //   120: f2d
    //   121: ldc2_w 2.5
    //   124: dcmpg
    //   125: ifge -> 342
    //   128: aload_0
    //   129: iconst_1
    //   130: putfield Dne : Z
    //   133: goto -> 342
    //   136: aload_0
    //   137: getfield FWm : I
    //   140: ifle -> 332
    //   143: aload_3
    //   144: getfield FWm : I
    //   147: ifle -> 332
    //   150: aload_3
    //   151: getfield bzF : LsMa;
    //   154: ifnonnull -> 162
    //   157: aload_3
    //   158: aload_0
    //   159: putfield bzF : LsMa;
    //   162: aload_3
    //   163: getfield bzF : LsMa;
    //   166: aload_0
    //   167: if_acmpne -> 324
    //   170: fload_2
    //   171: f2d
    //   172: ldc2_w 3.5
    //   175: dcmpg
    //   176: ifge -> 324
    //   179: aload_3
    //   180: dup
    //   181: getfield FWm : I
    //   184: iconst_1
    //   185: iadd
    //   186: putfield FWm : I
    //   189: aload_0
    //   190: dup
    //   191: getfield FWm : I
    //   194: iconst_1
    //   195: iadd
    //   196: putfield FWm : I
    //   199: aload_0
    //   200: dup
    //   201: getfield One : I
    //   204: iconst_1
    //   205: iadd
    //   206: putfield One : I
    //   209: aload_0
    //   210: getfield One : I
    //   213: iconst_4
    //   214: irem
    //   215: ifne -> 304
    //   218: aload_0
    //   219: getfield Dne : LQnq;
    //   222: ldc 'heart'
    //   224: aload_0
    //   225: getfield div : D
    //   228: aload_0
    //   229: getfield Dne : Ljava/util/Random;
    //   232: invokevirtual nextFloat : ()F
    //   235: aload_0
    //   236: getfield ooe : F
    //   239: fmul
    //   240: fconst_2
    //   241: fmul
    //   242: f2d
    //   243: dadd
    //   244: aload_0
    //   245: getfield ooe : F
    //   248: f2d
    //   249: dsub
    //   250: aload_0
    //   251: getfield IjH : D
    //   254: ldc2_w 0.5
    //   257: dadd
    //   258: aload_0
    //   259: getfield Dne : Ljava/util/Random;
    //   262: invokevirtual nextFloat : ()F
    //   265: aload_0
    //   266: getfield trS : F
    //   269: fmul
    //   270: f2d
    //   271: dadd
    //   272: aload_0
    //   273: getfield mrb : D
    //   276: aload_0
    //   277: getfield Dne : Ljava/util/Random;
    //   280: invokevirtual nextFloat : ()F
    //   283: aload_0
    //   284: getfield ooe : F
    //   287: fmul
    //   288: fconst_2
    //   289: fmul
    //   290: f2d
    //   291: dadd
    //   292: aload_0
    //   293: getfield ooe : F
    //   296: f2d
    //   297: dsub
    //   298: dconst_0
    //   299: dconst_0
    //   300: dconst_0
    //   301: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   304: aload_0
    //   305: getfield One : I
    //   308: bipush #60
    //   310: if_icmpne -> 342
    //   313: aload_0
    //   314: aload_1
    //   315: checkcast HzK
    //   318: invokespecial Dne : (LHzK;)V
    //   321: goto -> 342
    //   324: aload_0
    //   325: iconst_0
    //   326: putfield One : I
    //   329: goto -> 342
    //   332: aload_0
    //   333: iconst_0
    //   334: putfield One : I
    //   337: aload_0
    //   338: aconst_null
    //   339: putfield bzF : LsMa;
    //   342: return
  }
  
  protected boolean yMz() {
    return false;
  }
  
  public void Qnq() {
    this.FWm = 0;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    this.FWm = paramWkD.Dne("InLove");
  }
  
  protected void mlD() {
    if (bzF() != 0)
      this.FWm = 0; 
    super.mlD();
  }
  
  public boolean Dne(HzK paramHzK) {
    return (paramHzK == this) ? false : ((paramHzK.getClass() != getClass()) ? false : ((ZfC() && paramHzK.ZfC())));
  }
  
  public void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial IjH : ()V
    //   4: aload_0
    //   5: invokevirtual bzF : ()I
    //   8: ifeq -> 16
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield FWm : I
    //   16: aload_0
    //   17: getfield FWm : I
    //   20: ifle -> 174
    //   23: aload_0
    //   24: dup
    //   25: getfield FWm : I
    //   28: iconst_1
    //   29: isub
    //   30: putfield FWm : I
    //   33: ldc 'heart'
    //   35: astore_1
    //   36: aload_0
    //   37: getfield FWm : I
    //   40: bipush #10
    //   42: irem
    //   43: ifne -> 171
    //   46: aload_0
    //   47: getfield Dne : Ljava/util/Random;
    //   50: invokevirtual nextGaussian : ()D
    //   53: ldc2_w 0.02
    //   56: dmul
    //   57: dstore_2
    //   58: aload_0
    //   59: getfield Dne : Ljava/util/Random;
    //   62: invokevirtual nextGaussian : ()D
    //   65: ldc2_w 0.02
    //   68: dmul
    //   69: dstore #4
    //   71: aload_0
    //   72: getfield Dne : Ljava/util/Random;
    //   75: invokevirtual nextGaussian : ()D
    //   78: ldc2_w 0.02
    //   81: dmul
    //   82: dstore #6
    //   84: aload_0
    //   85: getfield Dne : LQnq;
    //   88: aload_1
    //   89: aload_0
    //   90: getfield div : D
    //   93: aload_0
    //   94: getfield Dne : Ljava/util/Random;
    //   97: invokevirtual nextFloat : ()F
    //   100: aload_0
    //   101: getfield ooe : F
    //   104: fmul
    //   105: fconst_2
    //   106: fmul
    //   107: f2d
    //   108: dadd
    //   109: aload_0
    //   110: getfield ooe : F
    //   113: f2d
    //   114: dsub
    //   115: aload_0
    //   116: getfield IjH : D
    //   119: ldc2_w 0.5
    //   122: dadd
    //   123: aload_0
    //   124: getfield Dne : Ljava/util/Random;
    //   127: invokevirtual nextFloat : ()F
    //   130: aload_0
    //   131: getfield trS : F
    //   134: fmul
    //   135: f2d
    //   136: dadd
    //   137: aload_0
    //   138: getfield mrb : D
    //   141: aload_0
    //   142: getfield Dne : Ljava/util/Random;
    //   145: invokevirtual nextFloat : ()F
    //   148: aload_0
    //   149: getfield ooe : F
    //   152: fmul
    //   153: fconst_2
    //   154: fmul
    //   155: f2d
    //   156: dadd
    //   157: aload_0
    //   158: getfield ooe : F
    //   161: f2d
    //   162: dsub
    //   163: dload_2
    //   164: dload #4
    //   166: dload #6
    //   168: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   171: goto -> 179
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield One : I
    //   179: return
  }
  
  public boolean ZfC() {
    return (this.FWm > 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HzK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */