public abstract class ZOO extends cMv {
  protected float Dne;
  
  private int Dne;
  
  private int FWm;
  
  private boolean Dne = false;
  
  protected FUH FWm;
  
  protected boolean FWm = false;
  
  private int bzF = 0;
  
  public void Dne() {
    this.Dne = false;
    this.FWm = false;
    this.bzF = 0;
  }
  
  public ZOO(FUH paramFUH, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
    this.FWm = paramFUH;
    this.Dne = paramFloat;
    this.FWm = paramBoolean1;
    this.Dne = paramBoolean2;
  }
  
  public boolean FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : LFUH;
    //   4: invokevirtual bzF : ()LFUH;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnonnull -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: aload_1
    //   15: invokevirtual udO : ()Z
    //   18: ifne -> 23
    //   21: iconst_0
    //   22: ireturn
    //   23: aload_0
    //   24: getfield FWm : LFUH;
    //   27: aload_1
    //   28: invokevirtual Dne : (LsMa;)D
    //   31: aload_0
    //   32: getfield Dne : F
    //   35: aload_0
    //   36: getfield Dne : F
    //   39: fmul
    //   40: f2d
    //   41: dcmpl
    //   42: ifle -> 47
    //   45: iconst_0
    //   46: ireturn
    //   47: aload_0
    //   48: getfield FWm : Z
    //   51: ifeq -> 94
    //   54: aload_0
    //   55: getfield FWm : LFUH;
    //   58: invokevirtual Dne : ()LEEb;
    //   61: aload_1
    //   62: invokevirtual Dne : (LsMa;)Z
    //   65: ifeq -> 76
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield bzF : I
    //   73: goto -> 94
    //   76: aload_0
    //   77: dup
    //   78: getfield bzF : I
    //   81: iconst_1
    //   82: iadd
    //   83: dup_x1
    //   84: putfield bzF : I
    //   87: bipush #60
    //   89: if_icmple -> 94
    //   92: iconst_0
    //   93: ireturn
    //   94: iconst_1
    //   95: ireturn
  }
  
  public ZOO(FUH paramFUH, float paramFloat, boolean paramBoolean) {
    this(paramFUH, paramFloat, paramBoolean, false);
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : LFUH;
    //   4: aconst_null
    //   5: checkcast FUH
    //   8: invokevirtual FWm : (LFUH;)V
    //   11: return
  }
  
  private boolean Dne(FUH paramFUH) {
    // Byte code:
    //   0: aload_0
    //   1: bipush #10
    //   3: aload_0
    //   4: getfield FWm : LFUH;
    //   7: invokevirtual Dne : ()Ljava/util/Random;
    //   10: iconst_5
    //   11: invokevirtual nextInt : (I)I
    //   14: iadd
    //   15: putfield FWm : I
    //   18: aload_0
    //   19: getfield FWm : LFUH;
    //   22: invokevirtual Dne : ()LKFZ;
    //   25: aload_1
    //   26: invokevirtual Dne : (LFUH;)LwdG;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull -> 36
    //   34: iconst_0
    //   35: ireturn
    //   36: aload_2
    //   37: invokevirtual Dne : ()LwhE;
    //   40: astore_3
    //   41: aload_3
    //   42: ifnonnull -> 47
    //   45: iconst_0
    //   46: ireturn
    //   47: aload_3
    //   48: getfield Dne : I
    //   51: aload_1
    //   52: getfield div : D
    //   55: invokestatic FWm : (D)I
    //   58: isub
    //   59: istore #4
    //   61: aload_3
    //   62: getfield bzF : I
    //   65: aload_1
    //   66: getfield mrb : D
    //   69: invokestatic FWm : (D)I
    //   72: isub
    //   73: istore #5
    //   75: iload #4
    //   77: iload #4
    //   79: imul
    //   80: iload #5
    //   82: iload #5
    //   84: imul
    //   85: iadd
    //   86: i2d
    //   87: ldc2_w 2.25
    //   90: dcmpg
    //   91: ifgt -> 98
    //   94: iconst_1
    //   95: goto -> 99
    //   98: iconst_0
    //   99: ireturn
  }
  
  protected boolean Dne(FUH paramFUH, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_1
    //   7: aload_0
    //   8: getfield FWm : LFUH;
    //   11: if_acmpne -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: invokevirtual udO : ()Z
    //   20: ifne -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: aload_0
    //   26: getfield FWm : LFUH;
    //   29: aload_1
    //   30: invokevirtual getClass : ()Ljava/lang/Class;
    //   33: invokevirtual Dne : (Ljava/lang/Class;)Z
    //   36: ifne -> 41
    //   39: iconst_0
    //   40: ireturn
    //   41: aload_0
    //   42: getfield FWm : LFUH;
    //   45: instanceof BRM
    //   48: ifeq -> 99
    //   51: aload_0
    //   52: getfield FWm : LFUH;
    //   55: checkcast BRM
    //   58: invokevirtual LVR : ()Z
    //   61: ifeq -> 99
    //   64: aload_1
    //   65: instanceof BRM
    //   68: ifeq -> 83
    //   71: aload_1
    //   72: checkcast BRM
    //   75: invokevirtual LVR : ()Z
    //   78: ifeq -> 83
    //   81: iconst_0
    //   82: ireturn
    //   83: aload_1
    //   84: aload_0
    //   85: getfield FWm : LFUH;
    //   88: checkcast BRM
    //   91: invokevirtual aFZ : ()LFUH;
    //   94: if_acmpne -> 125
    //   97: iconst_0
    //   98: ireturn
    //   99: aload_1
    //   100: instanceof FiG
    //   103: ifeq -> 125
    //   106: iload_2
    //   107: ifne -> 125
    //   110: aload_1
    //   111: checkcast FiG
    //   114: getfield Dne : Luqg;
    //   117: getfield Dne : Z
    //   120: ifeq -> 125
    //   123: iconst_0
    //   124: ireturn
    //   125: aload_0
    //   126: getfield FWm : LFUH;
    //   129: aload_1
    //   130: getfield div : D
    //   133: invokestatic FWm : (D)I
    //   136: aload_1
    //   137: getfield IjH : D
    //   140: invokestatic FWm : (D)I
    //   143: aload_1
    //   144: getfield mrb : D
    //   147: invokestatic FWm : (D)I
    //   150: invokevirtual Dne : (III)Z
    //   153: ifne -> 158
    //   156: iconst_0
    //   157: ireturn
    //   158: aload_0
    //   159: getfield FWm : Z
    //   162: ifeq -> 181
    //   165: aload_0
    //   166: getfield FWm : LFUH;
    //   169: invokevirtual Dne : ()LEEb;
    //   172: aload_1
    //   173: invokevirtual Dne : (LsMa;)Z
    //   176: ifne -> 181
    //   179: iconst_0
    //   180: ireturn
    //   181: aload_0
    //   182: getfield Dne : Z
    //   185: ifeq -> 241
    //   188: aload_0
    //   189: dup
    //   190: getfield FWm : I
    //   193: iconst_1
    //   194: isub
    //   195: dup_x1
    //   196: putfield FWm : I
    //   199: ifgt -> 207
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield Dne : I
    //   207: aload_0
    //   208: getfield Dne : I
    //   211: ifne -> 231
    //   214: aload_0
    //   215: aload_0
    //   216: aload_1
    //   217: invokespecial Dne : (LFUH;)Z
    //   220: ifeq -> 227
    //   223: iconst_1
    //   224: goto -> 228
    //   227: iconst_2
    //   228: putfield Dne : I
    //   231: aload_0
    //   232: getfield Dne : I
    //   235: iconst_2
    //   236: if_icmpne -> 241
    //   239: iconst_0
    //   240: ireturn
    //   241: iconst_1
    //   242: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZOO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */