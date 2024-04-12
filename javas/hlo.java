public class hlo extends LHi {
  private float Dne = 0.5F;
  
  private int FWm;
  
  private int One;
  
  public int Dne(float paramFloat) {
    return 15728880;
  }
  
  protected String DyG() {
    return "mob.blaze.hit";
  }
  
  protected int kGO() {
    return dEr.TpV.Qnq;
  }
  
  protected String div() {
    return "mob.blaze.death";
  }
  
  protected void Dne(float paramFloat) {}
  
  public boolean LVR() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: iconst_1
    //   10: iand
    //   11: ifeq -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: ireturn
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifeq -> 42
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/Random;
    //   8: iconst_2
    //   9: iload_2
    //   10: iadd
    //   11: invokevirtual nextInt : (I)I
    //   14: istore_3
    //   15: iconst_0
    //   16: istore #4
    //   18: iload #4
    //   20: iload_3
    //   21: if_icmpge -> 42
    //   24: aload_0
    //   25: getstatic dEr.TpV : LdEr;
    //   28: getfield Qnq : I
    //   31: iconst_1
    //   32: invokevirtual Dne : (II)LJiM;
    //   35: pop
    //   36: iinc #4, 1
    //   39: goto -> 18
    //   42: return
  }
  
  public int Dne() {
    return 20;
  }
  
  public boolean trS() {
    return LVR();
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield RPx : I
    //   4: ifgt -> 64
    //   7: fload_2
    //   8: fconst_2
    //   9: fcmpg
    //   10: ifge -> 64
    //   13: aload_1
    //   14: getfield Dne : LbSp;
    //   17: getfield aFZ : D
    //   20: aload_0
    //   21: getfield Dne : LbSp;
    //   24: getfield FWm : D
    //   27: dcmpl
    //   28: ifle -> 64
    //   31: aload_1
    //   32: getfield Dne : LbSp;
    //   35: getfield FWm : D
    //   38: aload_0
    //   39: getfield Dne : LbSp;
    //   42: getfield aFZ : D
    //   45: dcmpg
    //   46: ifge -> 64
    //   49: aload_0
    //   50: bipush #20
    //   52: putfield RPx : I
    //   55: aload_0
    //   56: aload_1
    //   57: invokevirtual bzF : (LsMa;)Z
    //   60: pop
    //   61: goto -> 357
    //   64: fload_2
    //   65: ldc 30.0
    //   67: fcmpg
    //   68: ifge -> 357
    //   71: aload_1
    //   72: getfield div : D
    //   75: aload_0
    //   76: getfield div : D
    //   79: dsub
    //   80: dstore_3
    //   81: aload_1
    //   82: getfield Dne : LbSp;
    //   85: getfield FWm : D
    //   88: aload_1
    //   89: getfield trS : F
    //   92: fconst_2
    //   93: fdiv
    //   94: f2d
    //   95: dadd
    //   96: aload_0
    //   97: getfield IjH : D
    //   100: aload_0
    //   101: getfield trS : F
    //   104: fconst_2
    //   105: fdiv
    //   106: f2d
    //   107: dadd
    //   108: dsub
    //   109: dstore #5
    //   111: aload_1
    //   112: getfield mrb : D
    //   115: aload_0
    //   116: getfield mrb : D
    //   119: dsub
    //   120: dstore #7
    //   122: aload_0
    //   123: getfield RPx : I
    //   126: ifne -> 330
    //   129: aload_0
    //   130: dup
    //   131: getfield One : I
    //   134: iconst_1
    //   135: iadd
    //   136: putfield One : I
    //   139: aload_0
    //   140: getfield One : I
    //   143: iconst_1
    //   144: if_icmpne -> 161
    //   147: aload_0
    //   148: bipush #60
    //   150: putfield RPx : I
    //   153: aload_0
    //   154: iconst_1
    //   155: invokevirtual FWm : (Z)V
    //   158: goto -> 194
    //   161: aload_0
    //   162: getfield One : I
    //   165: iconst_4
    //   166: if_icmpgt -> 178
    //   169: aload_0
    //   170: bipush #6
    //   172: putfield RPx : I
    //   175: goto -> 194
    //   178: aload_0
    //   179: bipush #100
    //   181: putfield RPx : I
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield One : I
    //   189: aload_0
    //   190: iconst_0
    //   191: invokevirtual FWm : (Z)V
    //   194: aload_0
    //   195: getfield One : I
    //   198: iconst_1
    //   199: if_icmple -> 330
    //   202: fload_2
    //   203: invokestatic bzF : (F)F
    //   206: ldc 0.5
    //   208: fmul
    //   209: fstore #9
    //   211: aload_0
    //   212: getfield Dne : LQnq;
    //   215: aconst_null
    //   216: checkcast FiG
    //   219: sipush #1009
    //   222: aload_0
    //   223: getfield div : D
    //   226: d2i
    //   227: aload_0
    //   228: getfield IjH : D
    //   231: d2i
    //   232: aload_0
    //   233: getfield mrb : D
    //   236: d2i
    //   237: iconst_0
    //   238: invokevirtual Dne : (LFiG;IIIII)V
    //   241: iconst_0
    //   242: istore #10
    //   244: iload #10
    //   246: iconst_1
    //   247: if_icmpge -> 330
    //   250: new Xzh
    //   253: dup
    //   254: aload_0
    //   255: getfield Dne : LQnq;
    //   258: aload_0
    //   259: dload_3
    //   260: aload_0
    //   261: getfield Dne : Ljava/util/Random;
    //   264: invokevirtual nextGaussian : ()D
    //   267: fload #9
    //   269: f2d
    //   270: dmul
    //   271: dadd
    //   272: dload #5
    //   274: dload #7
    //   276: aload_0
    //   277: getfield Dne : Ljava/util/Random;
    //   280: invokevirtual nextGaussian : ()D
    //   283: fload #9
    //   285: f2d
    //   286: dmul
    //   287: dadd
    //   288: invokespecial <init> : (LQnq;LFUH;DDD)V
    //   291: astore #11
    //   293: aload #11
    //   295: aload_0
    //   296: getfield IjH : D
    //   299: aload_0
    //   300: getfield trS : F
    //   303: fconst_2
    //   304: fdiv
    //   305: f2d
    //   306: dadd
    //   307: ldc2_w 0.5
    //   310: dadd
    //   311: putfield IjH : D
    //   314: aload_0
    //   315: getfield Dne : LQnq;
    //   318: aload #11
    //   320: invokevirtual FWm : (LsMa;)Z
    //   323: pop
    //   324: iinc #10, 1
    //   327: goto -> 244
    //   330: aload_0
    //   331: dload #7
    //   333: dload_3
    //   334: invokestatic atan2 : (DD)D
    //   337: ldc2_w 180.0
    //   340: dmul
    //   341: ldc2_w 3.141592653589793
    //   344: ddiv
    //   345: d2f
    //   346: ldc 90.0
    //   348: fsub
    //   349: putfield mrb : F
    //   352: aload_0
    //   353: iconst_1
    //   354: putfield Dne : Z
    //   357: return
  }
  
  public int Dne(sMa paramsMa) {
    return 6;
  }
  
  public hlo(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 131
    //   10: aload_0
    //   11: invokevirtual XHL : ()Z
    //   14: ifeq -> 26
    //   17: aload_0
    //   18: getstatic zBn.aFZ : LzBn;
    //   21: iconst_1
    //   22: invokevirtual Dne : (LzBn;I)Z
    //   25: pop
    //   26: aload_0
    //   27: dup
    //   28: getfield FWm : I
    //   31: iconst_1
    //   32: isub
    //   33: putfield FWm : I
    //   36: aload_0
    //   37: getfield FWm : I
    //   40: ifgt -> 67
    //   43: aload_0
    //   44: bipush #100
    //   46: putfield FWm : I
    //   49: aload_0
    //   50: ldc 0.5
    //   52: aload_0
    //   53: getfield Dne : Ljava/util/Random;
    //   56: invokevirtual nextGaussian : ()D
    //   59: d2f
    //   60: ldc 3.0
    //   62: fmul
    //   63: fadd
    //   64: putfield Dne : F
    //   67: aload_0
    //   68: invokevirtual FWm : ()LsMa;
    //   71: ifnull -> 131
    //   74: aload_0
    //   75: invokevirtual FWm : ()LsMa;
    //   78: getfield IjH : D
    //   81: aload_0
    //   82: invokevirtual FWm : ()LsMa;
    //   85: invokevirtual c_ : ()F
    //   88: f2d
    //   89: dadd
    //   90: aload_0
    //   91: getfield IjH : D
    //   94: aload_0
    //   95: invokevirtual c_ : ()F
    //   98: f2d
    //   99: dadd
    //   100: aload_0
    //   101: getfield Dne : F
    //   104: f2d
    //   105: dadd
    //   106: dcmpl
    //   107: ifle -> 131
    //   110: aload_0
    //   111: dup
    //   112: getfield Zpi : D
    //   115: ldc2_w 0.30000001192092896
    //   118: aload_0
    //   119: getfield Zpi : D
    //   122: dsub
    //   123: ldc2_w 0.30000001192092896
    //   126: dmul
    //   127: dadd
    //   128: putfield Zpi : D
    //   131: aload_0
    //   132: getfield Dne : Ljava/util/Random;
    //   135: bipush #24
    //   137: invokevirtual nextInt : (I)I
    //   140: ifne -> 198
    //   143: aload_0
    //   144: getfield Dne : LQnq;
    //   147: aload_0
    //   148: getfield div : D
    //   151: ldc2_w 0.5
    //   154: dadd
    //   155: aload_0
    //   156: getfield IjH : D
    //   159: ldc2_w 0.5
    //   162: dadd
    //   163: aload_0
    //   164: getfield mrb : D
    //   167: ldc2_w 0.5
    //   170: dadd
    //   171: ldc 'fire.fire'
    //   173: fconst_1
    //   174: aload_0
    //   175: getfield Dne : Ljava/util/Random;
    //   178: invokevirtual nextFloat : ()F
    //   181: fadd
    //   182: aload_0
    //   183: getfield Dne : Ljava/util/Random;
    //   186: invokevirtual nextFloat : ()F
    //   189: ldc 0.7
    //   191: fmul
    //   192: ldc 0.3
    //   194: fadd
    //   195: invokevirtual Dne : (DDDLjava/lang/String;FF)V
    //   198: aload_0
    //   199: getfield aFZ : Z
    //   202: ifne -> 226
    //   205: aload_0
    //   206: getfield Zpi : D
    //   209: dconst_0
    //   210: dcmpg
    //   211: ifge -> 226
    //   214: aload_0
    //   215: dup
    //   216: getfield Zpi : D
    //   219: ldc2_w 0.6
    //   222: dmul
    //   223: putfield Zpi : D
    //   226: iconst_0
    //   227: istore_1
    //   228: iload_1
    //   229: iconst_2
    //   230: if_icmpge -> 313
    //   233: aload_0
    //   234: getfield Dne : LQnq;
    //   237: ldc 'largesmoke'
    //   239: aload_0
    //   240: getfield div : D
    //   243: aload_0
    //   244: getfield Dne : Ljava/util/Random;
    //   247: invokevirtual nextDouble : ()D
    //   250: ldc2_w 0.5
    //   253: dsub
    //   254: aload_0
    //   255: getfield ooe : F
    //   258: f2d
    //   259: dmul
    //   260: dadd
    //   261: aload_0
    //   262: getfield IjH : D
    //   265: aload_0
    //   266: getfield Dne : Ljava/util/Random;
    //   269: invokevirtual nextDouble : ()D
    //   272: aload_0
    //   273: getfield trS : F
    //   276: f2d
    //   277: dmul
    //   278: dadd
    //   279: aload_0
    //   280: getfield mrb : D
    //   283: aload_0
    //   284: getfield Dne : Ljava/util/Random;
    //   287: invokevirtual nextDouble : ()D
    //   290: ldc2_w 0.5
    //   293: dsub
    //   294: aload_0
    //   295: getfield ooe : F
    //   298: f2d
    //   299: dmul
    //   300: dadd
    //   301: dconst_0
    //   302: dconst_0
    //   303: dconst_0
    //   304: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   307: iinc #1, 1
    //   310: goto -> 228
    //   313: aload_0
    //   314: invokespecial IjH : ()V
    //   317: return
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
    //   14: iconst_0
    //   15: invokespecial <init> : (B)V
    //   18: invokevirtual Dne : (ILjava/lang/Object;)V
    //   21: return
  }
  
  protected boolean ICU() {
    return true;
  }
  
  protected String zGp() {
    return "mob.blaze.breathe";
  }
  
  public void FWm(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: istore_2
    //   10: iload_1
    //   11: ifeq -> 22
    //   14: iload_2
    //   15: iconst_1
    //   16: ior
    //   17: i2b
    //   18: istore_2
    //   19: goto -> 28
    //   22: iload_2
    //   23: bipush #-2
    //   25: iand
    //   26: i2b
    //   27: istore_2
    //   28: aload_0
    //   29: getfield Dne : LluM;
    //   32: bipush #16
    //   34: iload_2
    //   35: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   38: invokevirtual FWm : (ILjava/lang/Object;)V
    //   41: return
  }
  
  public float Dne(float paramFloat) {
    return 1.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hlo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */