public class Tgj extends FUH implements ZFz {
  public float FWm;
  
  private static final float[] bzF = new float[] { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
  
  private int Dne;
  
  public float Dne;
  
  public float bzF;
  
  protected int kGO() {
    return (ATE() == 1) ? dEr.jBE.Qnq : 0;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    FWm(paramWkD.Dne("Size") + 1);
  }
  
  protected boolean LVR() {
    return (ATE() > 0);
  }
  
  protected String mrb() {
    return "mob.slime." + ((ATE() > 1) ? "big" : "small");
  }
  
  public void g_() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ATE : ()I
    //   4: istore_1
    //   5: aload_0
    //   6: getfield Dne : LQnq;
    //   9: getfield aFZ : Z
    //   12: ifne -> 145
    //   15: iload_1
    //   16: iconst_1
    //   17: if_icmple -> 145
    //   20: aload_0
    //   21: invokevirtual XHL : ()I
    //   24: ifgt -> 145
    //   27: iconst_2
    //   28: aload_0
    //   29: getfield Dne : Ljava/util/Random;
    //   32: iconst_3
    //   33: invokevirtual nextInt : (I)I
    //   36: iadd
    //   37: istore_2
    //   38: iconst_0
    //   39: istore_3
    //   40: iload_3
    //   41: iload_2
    //   42: if_icmpge -> 145
    //   45: iload_3
    //   46: iconst_2
    //   47: irem
    //   48: i2f
    //   49: ldc 0.5
    //   51: fsub
    //   52: iload_1
    //   53: i2f
    //   54: fmul
    //   55: ldc 4.0
    //   57: fdiv
    //   58: fstore #4
    //   60: iload_3
    //   61: iconst_2
    //   62: idiv
    //   63: i2f
    //   64: ldc 0.5
    //   66: fsub
    //   67: iload_1
    //   68: i2f
    //   69: fmul
    //   70: ldc 4.0
    //   72: fdiv
    //   73: fstore #5
    //   75: aload_0
    //   76: invokevirtual Dne : ()LTgj;
    //   79: astore #6
    //   81: aload #6
    //   83: iload_1
    //   84: iconst_2
    //   85: idiv
    //   86: invokevirtual FWm : (I)V
    //   89: aload #6
    //   91: aload_0
    //   92: getfield div : D
    //   95: fload #4
    //   97: f2d
    //   98: dadd
    //   99: aload_0
    //   100: getfield IjH : D
    //   103: ldc2_w 0.5
    //   106: dadd
    //   107: aload_0
    //   108: getfield mrb : D
    //   111: fload #5
    //   113: f2d
    //   114: dadd
    //   115: aload_0
    //   116: getfield Dne : Ljava/util/Random;
    //   119: invokevirtual nextFloat : ()F
    //   122: ldc 360.0
    //   124: fmul
    //   125: fconst_0
    //   126: invokevirtual FWm : (DDDFF)V
    //   129: aload_0
    //   130: getfield Dne : LQnq;
    //   133: aload #6
    //   135: invokevirtual FWm : (LsMa;)Z
    //   138: pop
    //   139: iinc #3, 1
    //   142: goto -> 40
    //   145: aload_0
    //   146: invokespecial g_ : ()V
    //   149: return
  }
  
  protected int bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: bipush #20
    //   6: invokevirtual nextInt : (I)I
    //   9: bipush #10
    //   11: iadd
    //   12: ireturn
  }
  
  protected void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: new java/lang/Byte
    //   9: dup
    //   10: iload_1
    //   11: i2b
    //   12: invokespecial <init> : (B)V
    //   15: invokevirtual FWm : (ILjava/lang/Object;)V
    //   18: aload_0
    //   19: ldc 0.6
    //   21: iload_1
    //   22: i2f
    //   23: fmul
    //   24: ldc 0.6
    //   26: iload_1
    //   27: i2f
    //   28: fmul
    //   29: invokevirtual Dne : (FF)V
    //   32: aload_0
    //   33: aload_0
    //   34: getfield div : D
    //   37: aload_0
    //   38: getfield IjH : D
    //   41: aload_0
    //   42: getfield mrb : D
    //   45: invokevirtual bzF : (DDD)V
    //   48: aload_0
    //   49: aload_0
    //   50: invokevirtual Dne : ()I
    //   53: invokevirtual bzF : (I)V
    //   56: aload_0
    //   57: iload_1
    //   58: putfield Fnk : I
    //   61: return
  }
  
  public int ATE() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: ireturn
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Size", ATE() - 1);
  }
  
  protected void Qnq() {
    this.Dne *= 0.6F;
  }
  
  protected boolean qrB() {
    return (ATE() > 2);
  }
  
  protected int qLR() {
    return ATE();
  }
  
  public boolean cot() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield div : D
    //   8: invokestatic FWm : (D)I
    //   11: aload_0
    //   12: getfield mrb : D
    //   15: invokestatic FWm : (D)I
    //   18: invokevirtual Dne : (II)LqMV;
    //   21: astore_1
    //   22: aload_0
    //   23: getfield Dne : LQnq;
    //   26: invokevirtual Dne : ()LxoY;
    //   29: invokevirtual Dne : ()LkGO;
    //   32: getstatic kGO.FWm : LkGO;
    //   35: if_acmpne -> 52
    //   38: aload_0
    //   39: getfield Dne : Ljava/util/Random;
    //   42: iconst_4
    //   43: invokevirtual nextInt : (I)I
    //   46: iconst_1
    //   47: if_icmpeq -> 52
    //   50: iconst_0
    //   51: ireturn
    //   52: aload_0
    //   53: invokevirtual ATE : ()I
    //   56: iconst_1
    //   57: if_icmpeq -> 70
    //   60: aload_0
    //   61: getfield Dne : LQnq;
    //   64: getfield aFZ : I
    //   67: ifle -> 244
    //   70: aload_0
    //   71: getfield Dne : LQnq;
    //   74: aload_0
    //   75: getfield div : D
    //   78: invokestatic FWm : (D)I
    //   81: aload_0
    //   82: getfield mrb : D
    //   85: invokestatic FWm : (D)I
    //   88: invokevirtual Dne : (II)LOdI;
    //   91: astore_2
    //   92: aload_2
    //   93: getstatic OdI.DyG : LOdI;
    //   96: if_acmpne -> 201
    //   99: aload_0
    //   100: getfield IjH : D
    //   103: ldc2_w 50.0
    //   106: dcmpl
    //   107: ifle -> 201
    //   110: aload_0
    //   111: getfield IjH : D
    //   114: ldc2_w 70.0
    //   117: dcmpg
    //   118: ifge -> 201
    //   121: aload_0
    //   122: getfield Dne : Ljava/util/Random;
    //   125: invokevirtual nextFloat : ()F
    //   128: ldc 0.5
    //   130: fcmpg
    //   131: ifge -> 201
    //   134: aload_0
    //   135: getfield Dne : Ljava/util/Random;
    //   138: invokevirtual nextFloat : ()F
    //   141: getstatic Tgj.bzF : [F
    //   144: aload_0
    //   145: getfield Dne : LQnq;
    //   148: invokevirtual Dne : ()I
    //   151: faload
    //   152: fcmpg
    //   153: ifge -> 201
    //   156: aload_0
    //   157: getfield Dne : LQnq;
    //   160: aload_0
    //   161: getfield div : D
    //   164: invokestatic FWm : (D)I
    //   167: aload_0
    //   168: getfield IjH : D
    //   171: invokestatic FWm : (D)I
    //   174: aload_0
    //   175: getfield mrb : D
    //   178: invokestatic FWm : (D)I
    //   181: invokevirtual aFZ : (III)I
    //   184: aload_0
    //   185: getfield Dne : Ljava/util/Random;
    //   188: bipush #8
    //   190: invokevirtual nextInt : (I)I
    //   193: if_icmpgt -> 201
    //   196: aload_0
    //   197: invokespecial cot : ()Z
    //   200: ireturn
    //   201: aload_0
    //   202: getfield Dne : Ljava/util/Random;
    //   205: bipush #10
    //   207: invokevirtual nextInt : (I)I
    //   210: ifne -> 244
    //   213: aload_1
    //   214: ldc2_w 987234911
    //   217: invokevirtual Dne : (J)Ljava/util/Random;
    //   220: bipush #10
    //   222: invokevirtual nextInt : (I)I
    //   225: ifne -> 244
    //   228: aload_0
    //   229: getfield IjH : D
    //   232: ldc2_w 40.0
    //   235: dcmpg
    //   236: ifge -> 244
    //   239: aload_0
    //   240: invokespecial cot : ()Z
    //   243: ireturn
    //   244: iconst_0
    //   245: ireturn
  }
  
  protected String FWm() {
    return "slime";
  }
  
  protected void div() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZgS : ()V
    //   4: aload_0
    //   5: getfield Dne : LQnq;
    //   8: aload_0
    //   9: ldc2_w 16.0
    //   12: invokevirtual FWm : (LsMa;D)LFiG;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull -> 29
    //   20: aload_0
    //   21: aload_1
    //   22: ldc 10.0
    //   24: ldc 20.0
    //   26: invokevirtual Dne : (LsMa;FF)V
    //   29: aload_0
    //   30: getfield aFZ : Z
    //   33: ifeq -> 148
    //   36: aload_0
    //   37: dup
    //   38: getfield Dne : I
    //   41: dup_x1
    //   42: iconst_1
    //   43: isub
    //   44: putfield Dne : I
    //   47: ifgt -> 148
    //   50: aload_0
    //   51: aload_0
    //   52: invokevirtual bzF : ()I
    //   55: putfield Dne : I
    //   58: aload_1
    //   59: ifnull -> 72
    //   62: aload_0
    //   63: dup
    //   64: getfield Dne : I
    //   67: iconst_3
    //   68: idiv
    //   69: putfield Dne : I
    //   72: aload_0
    //   73: iconst_1
    //   74: putfield oIf : Z
    //   77: aload_0
    //   78: invokevirtual LVR : ()Z
    //   81: ifeq -> 119
    //   84: aload_0
    //   85: aload_0
    //   86: invokevirtual mrb : ()Ljava/lang/String;
    //   89: aload_0
    //   90: invokevirtual div : ()F
    //   93: aload_0
    //   94: getfield Dne : Ljava/util/Random;
    //   97: invokevirtual nextFloat : ()F
    //   100: aload_0
    //   101: getfield Dne : Ljava/util/Random;
    //   104: invokevirtual nextFloat : ()F
    //   107: fsub
    //   108: ldc 0.2
    //   110: fmul
    //   111: fconst_1
    //   112: fadd
    //   113: ldc 0.8
    //   115: fmul
    //   116: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   119: aload_0
    //   120: fconst_1
    //   121: aload_0
    //   122: getfield Dne : Ljava/util/Random;
    //   125: invokevirtual nextFloat : ()F
    //   128: fconst_2
    //   129: fmul
    //   130: fsub
    //   131: putfield ZfC : F
    //   134: aload_0
    //   135: iconst_1
    //   136: aload_0
    //   137: invokevirtual ATE : ()I
    //   140: imul
    //   141: i2f
    //   142: putfield FYZ : F
    //   145: goto -> 170
    //   148: aload_0
    //   149: iconst_0
    //   150: putfield oIf : Z
    //   153: aload_0
    //   154: getfield aFZ : Z
    //   157: ifeq -> 170
    //   160: aload_0
    //   161: aload_0
    //   162: fconst_0
    //   163: dup_x1
    //   164: putfield FYZ : F
    //   167: putfield ZfC : F
    //   170: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 32
    //   10: aload_0
    //   11: getfield Dne : LQnq;
    //   14: getfield aFZ : I
    //   17: ifne -> 32
    //   20: aload_0
    //   21: invokevirtual ATE : ()I
    //   24: ifle -> 32
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield Zpi : Z
    //   32: aload_0
    //   33: dup
    //   34: getfield FWm : F
    //   37: aload_0
    //   38: getfield Dne : F
    //   41: aload_0
    //   42: getfield FWm : F
    //   45: fsub
    //   46: ldc 0.5
    //   48: fmul
    //   49: fadd
    //   50: putfield FWm : F
    //   53: aload_0
    //   54: aload_0
    //   55: getfield FWm : F
    //   58: putfield bzF : F
    //   61: aload_0
    //   62: getfield aFZ : Z
    //   65: istore_1
    //   66: aload_0
    //   67: invokespecial Dne : ()V
    //   70: aload_0
    //   71: getfield aFZ : Z
    //   74: ifeq -> 253
    //   77: iload_1
    //   78: ifne -> 253
    //   81: aload_0
    //   82: invokevirtual ATE : ()I
    //   85: istore_2
    //   86: iconst_0
    //   87: istore_3
    //   88: iload_3
    //   89: iload_2
    //   90: bipush #8
    //   92: imul
    //   93: if_icmpge -> 201
    //   96: aload_0
    //   97: getfield Dne : Ljava/util/Random;
    //   100: invokevirtual nextFloat : ()F
    //   103: ldc_w 3.1415927
    //   106: fmul
    //   107: fconst_2
    //   108: fmul
    //   109: fstore #4
    //   111: aload_0
    //   112: getfield Dne : Ljava/util/Random;
    //   115: invokevirtual nextFloat : ()F
    //   118: ldc 0.5
    //   120: fmul
    //   121: ldc 0.5
    //   123: fadd
    //   124: fstore #5
    //   126: fload #4
    //   128: invokestatic Dne : (F)F
    //   131: iload_2
    //   132: i2f
    //   133: fmul
    //   134: ldc 0.5
    //   136: fmul
    //   137: fload #5
    //   139: fmul
    //   140: fstore #6
    //   142: fload #4
    //   144: invokestatic FWm : (F)F
    //   147: iload_2
    //   148: i2f
    //   149: fmul
    //   150: ldc 0.5
    //   152: fmul
    //   153: fload #5
    //   155: fmul
    //   156: fstore #7
    //   158: aload_0
    //   159: getfield Dne : LQnq;
    //   162: aload_0
    //   163: invokevirtual FWm : ()Ljava/lang/String;
    //   166: aload_0
    //   167: getfield div : D
    //   170: fload #6
    //   172: f2d
    //   173: dadd
    //   174: aload_0
    //   175: getfield Dne : LbSp;
    //   178: getfield FWm : D
    //   181: aload_0
    //   182: getfield mrb : D
    //   185: fload #7
    //   187: f2d
    //   188: dadd
    //   189: dconst_0
    //   190: dconst_0
    //   191: dconst_0
    //   192: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   195: iinc #3, 1
    //   198: goto -> 88
    //   201: aload_0
    //   202: invokevirtual qrB : ()Z
    //   205: ifeq -> 243
    //   208: aload_0
    //   209: aload_0
    //   210: invokevirtual mrb : ()Ljava/lang/String;
    //   213: aload_0
    //   214: invokevirtual div : ()F
    //   217: aload_0
    //   218: getfield Dne : Ljava/util/Random;
    //   221: invokevirtual nextFloat : ()F
    //   224: aload_0
    //   225: getfield Dne : Ljava/util/Random;
    //   228: invokevirtual nextFloat : ()F
    //   231: fsub
    //   232: ldc 0.2
    //   234: fmul
    //   235: fconst_1
    //   236: fadd
    //   237: ldc 0.8
    //   239: fdiv
    //   240: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   243: aload_0
    //   244: ldc_w -0.5
    //   247: putfield Dne : F
    //   250: goto -> 269
    //   253: aload_0
    //   254: getfield aFZ : Z
    //   257: ifne -> 269
    //   260: iload_1
    //   261: ifeq -> 269
    //   264: aload_0
    //   265: fconst_1
    //   266: putfield Dne : F
    //   269: aload_0
    //   270: invokevirtual Qnq : ()V
    //   273: aload_0
    //   274: getfield Dne : LQnq;
    //   277: getfield aFZ : Z
    //   280: ifeq -> 302
    //   283: aload_0
    //   284: invokevirtual ATE : ()I
    //   287: istore_2
    //   288: aload_0
    //   289: ldc 0.6
    //   291: iload_2
    //   292: i2f
    //   293: fmul
    //   294: ldc 0.6
    //   296: iload_2
    //   297: i2f
    //   298: fmul
    //   299: invokevirtual Dne : (FF)V
    //   302: return
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: new java/lang/Byte
    //   13: dup
    //   14: iconst_1
    //   15: invokespecial <init> : (B)V
    //   18: invokevirtual Dne : (ILjava/lang/Object;)V
    //   21: return
  }
  
  protected float div() {
    return 0.4F * ATE();
  }
  
  public int Dne() {
    int i = ATE();
    return i * i;
  }
  
  protected String div() {
    return "mob.slime." + ((ATE() > 1) ? "big" : "small");
  }
  
  protected Tgj Dne() {
    return new Tgj(this.Dne);
  }
  
  public void a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual haP : ()Z
    //   4: ifeq -> 85
    //   7: aload_0
    //   8: invokevirtual ATE : ()I
    //   11: istore_2
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual Qnq : (LsMa;)Z
    //   17: ifeq -> 85
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual Dne : (LsMa;)D
    //   25: ldc2_w 0.6
    //   28: iload_2
    //   29: i2d
    //   30: dmul
    //   31: ldc2_w 0.6
    //   34: dmul
    //   35: iload_2
    //   36: i2d
    //   37: dmul
    //   38: dcmpg
    //   39: ifge -> 85
    //   42: aload_1
    //   43: aload_0
    //   44: invokestatic Dne : (LFUH;)LzBn;
    //   47: aload_0
    //   48: invokevirtual qLR : ()I
    //   51: invokevirtual Dne : (LzBn;I)Z
    //   54: ifeq -> 85
    //   57: aload_0
    //   58: ldc_w 'mob.attack'
    //   61: fconst_1
    //   62: aload_0
    //   63: getfield Dne : Ljava/util/Random;
    //   66: invokevirtual nextFloat : ()F
    //   69: aload_0
    //   70: getfield Dne : Ljava/util/Random;
    //   73: invokevirtual nextFloat : ()F
    //   76: fsub
    //   77: ldc 0.2
    //   79: fmul
    //   80: fconst_1
    //   81: fadd
    //   82: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   85: return
  }
  
  protected String DyG() {
    return "mob.slime." + ((ATE() > 1) ? "big" : "small");
  }
  
  public Tgj(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield Dne : I
    //   10: aload_0
    //   11: ldc_w '/mob/slime.png'
    //   14: putfield bzF : Ljava/lang/String;
    //   17: iconst_1
    //   18: aload_0
    //   19: getfield Dne : Ljava/util/Random;
    //   22: iconst_3
    //   23: invokevirtual nextInt : (I)I
    //   26: ishl
    //   27: istore_2
    //   28: aload_0
    //   29: fconst_0
    //   30: putfield udO : F
    //   33: aload_0
    //   34: aload_0
    //   35: getfield Dne : Ljava/util/Random;
    //   38: bipush #20
    //   40: invokevirtual nextInt : (I)I
    //   43: bipush #10
    //   45: iadd
    //   46: putfield Dne : I
    //   49: aload_0
    //   50: iload_2
    //   51: invokevirtual FWm : (I)V
    //   54: return
  }
  
  protected boolean haP() {
    return (ATE() > 1);
  }
  
  public int udO() {
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tgj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */