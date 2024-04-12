public class GRq extends HzK {
  public boolean FWm;
  
  public float bzF;
  
  public int FWm;
  
  public float Qnq;
  
  public float FWm;
  
  public float aFZ;
  
  public float Dne;
  
  public void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial IjH : ()V
    //   4: aload_0
    //   5: aload_0
    //   6: getfield Dne : F
    //   9: putfield Qnq : F
    //   12: aload_0
    //   13: aload_0
    //   14: getfield FWm : F
    //   17: putfield bzF : F
    //   20: aload_0
    //   21: aload_0
    //   22: getfield FWm : F
    //   25: f2d
    //   26: aload_0
    //   27: getfield aFZ : Z
    //   30: ifeq -> 37
    //   33: iconst_m1
    //   34: goto -> 38
    //   37: iconst_4
    //   38: i2d
    //   39: ldc2_w 0.3
    //   42: dmul
    //   43: dadd
    //   44: d2f
    //   45: putfield FWm : F
    //   48: aload_0
    //   49: getfield FWm : F
    //   52: fconst_0
    //   53: fcmpg
    //   54: ifge -> 62
    //   57: aload_0
    //   58: fconst_0
    //   59: putfield FWm : F
    //   62: aload_0
    //   63: getfield FWm : F
    //   66: fconst_1
    //   67: fcmpl
    //   68: ifle -> 76
    //   71: aload_0
    //   72: fconst_1
    //   73: putfield FWm : F
    //   76: aload_0
    //   77: getfield aFZ : Z
    //   80: ifne -> 97
    //   83: aload_0
    //   84: getfield aFZ : F
    //   87: fconst_1
    //   88: fcmpg
    //   89: ifge -> 97
    //   92: aload_0
    //   93: fconst_1
    //   94: putfield aFZ : F
    //   97: aload_0
    //   98: aload_0
    //   99: getfield aFZ : F
    //   102: f2d
    //   103: ldc2_w 0.9
    //   106: dmul
    //   107: d2f
    //   108: putfield aFZ : F
    //   111: aload_0
    //   112: getfield aFZ : Z
    //   115: ifne -> 139
    //   118: aload_0
    //   119: getfield Zpi : D
    //   122: dconst_0
    //   123: dcmpg
    //   124: ifge -> 139
    //   127: aload_0
    //   128: dup
    //   129: getfield Zpi : D
    //   132: ldc2_w 0.6
    //   135: dmul
    //   136: putfield Zpi : D
    //   139: aload_0
    //   140: dup
    //   141: getfield Dne : F
    //   144: aload_0
    //   145: getfield aFZ : F
    //   148: fconst_2
    //   149: fmul
    //   150: fadd
    //   151: putfield Dne : F
    //   154: aload_0
    //   155: invokevirtual IjH : ()Z
    //   158: ifne -> 284
    //   161: aload_0
    //   162: getfield Dne : LQnq;
    //   165: getfield aFZ : Z
    //   168: ifne -> 284
    //   171: aload_0
    //   172: dup
    //   173: getfield FWm : I
    //   176: iconst_1
    //   177: isub
    //   178: dup_x1
    //   179: putfield FWm : I
    //   182: ifgt -> 284
    //   185: aload_0
    //   186: ldc 'mob.chicken.plop'
    //   188: fconst_1
    //   189: aload_0
    //   190: getfield Dne : Ljava/util/Random;
    //   193: invokevirtual nextFloat : ()F
    //   196: aload_0
    //   197: getfield Dne : Ljava/util/Random;
    //   200: invokevirtual nextFloat : ()F
    //   203: fsub
    //   204: ldc 0.2
    //   206: fmul
    //   207: fconst_1
    //   208: fadd
    //   209: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   212: sipush #1000
    //   215: invokestatic Dne : (I)I
    //   218: ifne -> 254
    //   221: getstatic QXI.Dne : LRAN;
    //   224: new gqg
    //   227: dup
    //   228: getstatic QXI.Dne : LRAN;
    //   231: aload_0
    //   232: getfield div : D
    //   235: aload_0
    //   236: getfield IjH : D
    //   239: aload_0
    //   240: getfield mrb : D
    //   243: aconst_null
    //   244: invokespecial <init> : (LQnq;DDDLFUH;)V
    //   247: invokevirtual FWm : (LsMa;)Z
    //   250: pop
    //   251: goto -> 266
    //   254: aload_0
    //   255: getstatic dEr.KLR : LdEr;
    //   258: getfield Qnq : I
    //   261: iconst_1
    //   262: invokevirtual Dne : (II)LJiM;
    //   265: pop
    //   266: aload_0
    //   267: aload_0
    //   268: getfield Dne : Ljava/util/Random;
    //   271: sipush #6000
    //   274: invokevirtual nextInt : (I)I
    //   277: sipush #6000
    //   280: iadd
    //   281: putfield FWm : I
    //   284: return
  }
  
  public GRq Dne(Azh paramAzh) {
    return new GRq(this.Dne);
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: iconst_3
    //   5: invokevirtual nextInt : (I)I
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/Random;
    //   12: iconst_1
    //   13: iload_2
    //   14: iadd
    //   15: invokevirtual nextInt : (I)I
    //   18: iadd
    //   19: istore_3
    //   20: iconst_0
    //   21: istore #4
    //   23: iload #4
    //   25: iload_3
    //   26: if_icmpge -> 47
    //   29: aload_0
    //   30: getstatic dEr.yMz : LdEr;
    //   33: getfield Qnq : I
    //   36: iconst_1
    //   37: invokevirtual Dne : (II)LJiM;
    //   40: pop
    //   41: iinc #4, 1
    //   44: goto -> 23
    //   47: aload_0
    //   48: invokevirtual trS : ()Z
    //   51: ifeq -> 69
    //   54: aload_0
    //   55: getstatic dEr.yIR : LdEr;
    //   58: getfield Qnq : I
    //   61: iconst_1
    //   62: invokevirtual Dne : (II)LJiM;
    //   65: pop
    //   66: goto -> 81
    //   69: aload_0
    //   70: getstatic dEr.qqL : LdEr;
    //   73: getfield Qnq : I
    //   76: iconst_1
    //   77: invokevirtual Dne : (II)LJiM;
    //   80: pop
    //   81: return
  }
  
  protected void Dne(float paramFloat) {}
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public int Dne() {
    return 4;
  }
  
  protected String div() {
    return "mob.chicken.hurt";
  }
  
  public boolean tgc() {
    return true;
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq != null && paramNMq.Dne() instanceof ocy);
  }
  
  protected String zGp() {
    return "mob.chicken.say";
  }
  
  protected String DyG() {
    return "mob.chicken.hurt";
  }
  
  protected int kGO() {
    return dEr.yMz.Qnq;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.chicken.step", 0.15F, 1.0F);
  }
  
  public GRq(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield FWm : Z
    //   10: aload_0
    //   11: fconst_0
    //   12: putfield Dne : F
    //   15: aload_0
    //   16: fconst_0
    //   17: putfield FWm : F
    //   20: aload_0
    //   21: fconst_1
    //   22: putfield aFZ : F
    //   25: aload_0
    //   26: ldc '/mob/chicken.png'
    //   28: putfield bzF : Ljava/lang/String;
    //   31: aload_0
    //   32: ldc 0.3
    //   34: ldc 0.7
    //   36: invokevirtual Dne : (FF)V
    //   39: aload_0
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/Random;
    //   44: sipush #6000
    //   47: invokevirtual nextInt : (I)I
    //   50: sipush #6000
    //   53: iadd
    //   54: putfield FWm : I
    //   57: ldc 0.25
    //   59: fstore_2
    //   60: aload_0
    //   61: getfield Dne : LOKo;
    //   64: iconst_0
    //   65: new Cyb
    //   68: dup
    //   69: aload_0
    //   70: invokespecial <init> : (LFUH;)V
    //   73: invokevirtual Dne : (ILcMv;)V
    //   76: aload_0
    //   77: getfield Dne : LOKo;
    //   80: iconst_1
    //   81: new xkg
    //   84: dup
    //   85: aload_0
    //   86: ldc 0.38
    //   88: invokespecial <init> : (LkSJ;F)V
    //   91: invokevirtual Dne : (ILcMv;)V
    //   94: aload_0
    //   95: getfield Dne : LOKo;
    //   98: iconst_2
    //   99: new znX
    //   102: dup
    //   103: aload_0
    //   104: fload_2
    //   105: invokespecial <init> : (LHzK;F)V
    //   108: invokevirtual Dne : (ILcMv;)V
    //   111: aload_0
    //   112: getfield Dne : LOKo;
    //   115: iconst_3
    //   116: new cnh
    //   119: dup
    //   120: aload_0
    //   121: ldc 0.25
    //   123: getstatic dEr.mlD : LdEr;
    //   126: getfield Qnq : I
    //   129: iconst_0
    //   130: invokespecial <init> : (LkSJ;FIZ)V
    //   133: invokevirtual Dne : (ILcMv;)V
    //   136: aload_0
    //   137: getfield Dne : LOKo;
    //   140: iconst_4
    //   141: new NSW
    //   144: dup
    //   145: aload_0
    //   146: ldc 0.28
    //   148: invokespecial <init> : (LHzK;F)V
    //   151: invokevirtual Dne : (ILcMv;)V
    //   154: aload_0
    //   155: getfield Dne : LOKo;
    //   158: iconst_5
    //   159: new IBw
    //   162: dup
    //   163: aload_0
    //   164: fload_2
    //   165: invokespecial <init> : (LkSJ;F)V
    //   168: invokevirtual Dne : (ILcMv;)V
    //   171: aload_0
    //   172: getfield Dne : LOKo;
    //   175: bipush #6
    //   177: new yws
    //   180: dup
    //   181: aload_0
    //   182: ldc FiG
    //   184: ldc 6.0
    //   186: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   189: invokevirtual Dne : (ILcMv;)V
    //   192: aload_0
    //   193: getfield Dne : LOKo;
    //   196: bipush #7
    //   198: new cHg
    //   201: dup
    //   202: aload_0
    //   203: invokespecial <init> : (LFUH;)V
    //   206: invokevirtual Dne : (ILcMv;)V
    //   209: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GRq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */