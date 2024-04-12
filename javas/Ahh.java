public class Ahh extends wBN {
  public Ahh(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.9F, 1.3F);
  }
  
  public boolean a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LMOS;
    //   4: invokevirtual Dne : ()LNMq;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull -> 114
    //   12: aload_2
    //   13: getfield bzF : I
    //   16: getstatic dEr.vSL : LdEr;
    //   19: getfield Qnq : I
    //   22: if_icmpne -> 114
    //   25: aload_0
    //   26: invokevirtual bzF : ()I
    //   29: iflt -> 114
    //   32: aload_2
    //   33: getfield Dne : I
    //   36: iconst_1
    //   37: if_icmpne -> 66
    //   40: aload_1
    //   41: getfield Dne : LMOS;
    //   44: aload_1
    //   45: getfield Dne : LMOS;
    //   48: getfield Dne : I
    //   51: new NMq
    //   54: dup
    //   55: getstatic dEr.RPx : LdEr;
    //   58: invokespecial <init> : (LdEr;)V
    //   61: invokevirtual Dne : (ILNMq;)V
    //   64: iconst_1
    //   65: ireturn
    //   66: aload_1
    //   67: getfield Dne : LMOS;
    //   70: new NMq
    //   73: dup
    //   74: getstatic dEr.RPx : LdEr;
    //   77: invokespecial <init> : (LdEr;)V
    //   80: invokevirtual Dne : (LNMq;)Z
    //   83: ifeq -> 114
    //   86: aload_1
    //   87: getfield Dne : Luqg;
    //   90: getfield Qnq : Z
    //   93: ifne -> 114
    //   96: aload_1
    //   97: getfield Dne : LMOS;
    //   100: aload_1
    //   101: getfield Dne : LMOS;
    //   104: getfield Dne : I
    //   107: iconst_1
    //   108: invokevirtual Dne : (II)LNMq;
    //   111: pop
    //   112: iconst_1
    //   113: ireturn
    //   114: aload_2
    //   115: ifnull -> 309
    //   118: aload_2
    //   119: getfield bzF : I
    //   122: getstatic dEr.Dne : LZtP;
    //   125: getfield Qnq : I
    //   128: if_icmpne -> 309
    //   131: aload_0
    //   132: invokevirtual bzF : ()I
    //   135: iflt -> 309
    //   138: aload_0
    //   139: invokevirtual g_ : ()V
    //   142: aload_0
    //   143: getfield Dne : LQnq;
    //   146: ldc 'largeexplode'
    //   148: aload_0
    //   149: getfield div : D
    //   152: aload_0
    //   153: getfield IjH : D
    //   156: aload_0
    //   157: getfield trS : F
    //   160: fconst_2
    //   161: fdiv
    //   162: f2d
    //   163: dadd
    //   164: aload_0
    //   165: getfield mrb : D
    //   168: dconst_0
    //   169: dconst_0
    //   170: dconst_0
    //   171: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   174: aload_0
    //   175: getfield Dne : LQnq;
    //   178: getfield aFZ : Z
    //   181: ifne -> 307
    //   184: new wBN
    //   187: dup
    //   188: aload_0
    //   189: getfield Dne : LQnq;
    //   192: invokespecial <init> : (LQnq;)V
    //   195: astore_3
    //   196: aload_3
    //   197: aload_0
    //   198: getfield div : D
    //   201: aload_0
    //   202: getfield IjH : D
    //   205: aload_0
    //   206: getfield mrb : D
    //   209: aload_0
    //   210: getfield mrb : F
    //   213: aload_0
    //   214: getfield XHL : F
    //   217: invokevirtual FWm : (DDDFF)V
    //   220: aload_3
    //   221: aload_0
    //   222: invokevirtual XHL : ()I
    //   225: invokevirtual bzF : (I)V
    //   228: aload_3
    //   229: aload_0
    //   230: getfield IjH : F
    //   233: putfield IjH : F
    //   236: aload_0
    //   237: getfield Dne : LQnq;
    //   240: aload_3
    //   241: invokevirtual FWm : (LsMa;)Z
    //   244: pop
    //   245: iconst_0
    //   246: istore #4
    //   248: iload #4
    //   250: iconst_5
    //   251: if_icmpge -> 307
    //   254: aload_0
    //   255: getfield Dne : LQnq;
    //   258: new JiM
    //   261: dup
    //   262: aload_0
    //   263: getfield Dne : LQnq;
    //   266: aload_0
    //   267: getfield div : D
    //   270: aload_0
    //   271: getfield IjH : D
    //   274: aload_0
    //   275: getfield trS : F
    //   278: f2d
    //   279: dadd
    //   280: aload_0
    //   281: getfield mrb : D
    //   284: new NMq
    //   287: dup
    //   288: getstatic zKP.Qnq : Lhbe;
    //   291: invokespecial <init> : (LzKP;)V
    //   294: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   297: invokevirtual FWm : (LsMa;)Z
    //   300: pop
    //   301: iinc #4, 1
    //   304: goto -> 248
    //   307: iconst_1
    //   308: ireturn
    //   309: aload_0
    //   310: aload_1
    //   311: invokespecial a_ : (LFiG;)Z
    //   314: ireturn
  }
  
  static {
  
  }
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public wBN Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public Ahh Dne(Azh paramAzh) {
    return new Ahh(this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ahh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */