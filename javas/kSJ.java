public abstract class kSJ extends FUH {
  protected int Dne;
  
  protected sMa bzF;
  
  protected wdG Dne;
  
  protected boolean Dne = false;
  
  public boolean cot() {
    int i = geR.FWm(this.div);
    int j = geR.FWm(this.Dne.FWm);
    int k = geR.FWm(this.mrb);
    return (super.cot() && Dne(i, j, k) >= 0.0F);
  }
  
  public boolean qrB() {
    return (this.Dne != null);
  }
  
  public sMa FWm() {
    return this.bzF;
  }
  
  public void Dne(wdG paramwdG) {
    this.Dne = paramwdG;
  }
  
  public kSJ(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = false;
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {}
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    return 0.0F;
  }
  
  protected void zGp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield Dne : LBkx;
    //   7: ldc 'stroll'
    //   9: invokevirtual Dne : (Ljava/lang/String;)V
    //   12: iconst_0
    //   13: istore_1
    //   14: iconst_m1
    //   15: istore_2
    //   16: iconst_m1
    //   17: istore_3
    //   18: iconst_m1
    //   19: istore #4
    //   21: ldc -99999.0
    //   23: fstore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: iload #6
    //   30: bipush #10
    //   32: if_icmpge -> 149
    //   35: aload_0
    //   36: getfield div : D
    //   39: aload_0
    //   40: getfield Dne : Ljava/util/Random;
    //   43: bipush #13
    //   45: invokevirtual nextInt : (I)I
    //   48: i2d
    //   49: dadd
    //   50: ldc2_w 6.0
    //   53: dsub
    //   54: invokestatic FWm : (D)I
    //   57: istore #7
    //   59: aload_0
    //   60: getfield IjH : D
    //   63: aload_0
    //   64: getfield Dne : Ljava/util/Random;
    //   67: bipush #7
    //   69: invokevirtual nextInt : (I)I
    //   72: i2d
    //   73: dadd
    //   74: ldc2_w 3.0
    //   77: dsub
    //   78: invokestatic FWm : (D)I
    //   81: istore #8
    //   83: aload_0
    //   84: getfield mrb : D
    //   87: aload_0
    //   88: getfield Dne : Ljava/util/Random;
    //   91: bipush #13
    //   93: invokevirtual nextInt : (I)I
    //   96: i2d
    //   97: dadd
    //   98: ldc2_w 6.0
    //   101: dsub
    //   102: invokestatic FWm : (D)I
    //   105: istore #9
    //   107: aload_0
    //   108: iload #7
    //   110: iload #8
    //   112: iload #9
    //   114: invokevirtual Dne : (III)F
    //   117: fstore #10
    //   119: fload #10
    //   121: fload #5
    //   123: fcmpl
    //   124: ifle -> 143
    //   127: fload #10
    //   129: fstore #5
    //   131: iload #7
    //   133: istore_2
    //   134: iload #8
    //   136: istore_3
    //   137: iload #9
    //   139: istore #4
    //   141: iconst_1
    //   142: istore_1
    //   143: iinc #6, 1
    //   146: goto -> 28
    //   149: iload_1
    //   150: ifeq -> 175
    //   153: aload_0
    //   154: aload_0
    //   155: getfield Dne : LQnq;
    //   158: aload_0
    //   159: iload_2
    //   160: iload_3
    //   161: iload #4
    //   163: ldc 10.0
    //   165: iconst_1
    //   166: iconst_0
    //   167: iconst_0
    //   168: iconst_1
    //   169: invokevirtual Dne : (LsMa;IIIFZZZZ)LwdG;
    //   172: putfield Dne : LwdG;
    //   175: aload_0
    //   176: getfield Dne : LQnq;
    //   179: getfield Dne : LBkx;
    //   182: invokevirtual FWm : ()V
    //   185: return
  }
  
  protected sMa Dne() {
    return null;
  }
  
  protected void div() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield Dne : LBkx;
    //   7: ldc 'ai'
    //   9: invokevirtual Dne : (Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield Dne : I
    //   16: ifle -> 29
    //   19: aload_0
    //   20: dup
    //   21: getfield Dne : I
    //   24: iconst_1
    //   25: isub
    //   26: putfield Dne : I
    //   29: aload_0
    //   30: aload_0
    //   31: invokevirtual haP : ()Z
    //   34: putfield Dne : Z
    //   37: ldc 16.0
    //   39: fstore_1
    //   40: aload_0
    //   41: getfield bzF : LsMa;
    //   44: ifnonnull -> 86
    //   47: aload_0
    //   48: aload_0
    //   49: invokevirtual Dne : ()LsMa;
    //   52: putfield bzF : LsMa;
    //   55: aload_0
    //   56: getfield bzF : LsMa;
    //   59: ifnull -> 133
    //   62: aload_0
    //   63: aload_0
    //   64: getfield Dne : LQnq;
    //   67: aload_0
    //   68: aload_0
    //   69: getfield bzF : LsMa;
    //   72: fload_1
    //   73: iconst_1
    //   74: iconst_0
    //   75: iconst_0
    //   76: iconst_1
    //   77: invokevirtual Dne : (LsMa;LsMa;FZZZZ)LwdG;
    //   80: putfield Dne : LwdG;
    //   83: goto -> 133
    //   86: aload_0
    //   87: getfield bzF : LsMa;
    //   90: invokevirtual udO : ()Z
    //   93: ifeq -> 128
    //   96: aload_0
    //   97: getfield bzF : LsMa;
    //   100: aload_0
    //   101: invokevirtual Dne : (LsMa;)F
    //   104: fstore_2
    //   105: aload_0
    //   106: aload_0
    //   107: getfield bzF : LsMa;
    //   110: invokevirtual Qnq : (LsMa;)Z
    //   113: ifeq -> 125
    //   116: aload_0
    //   117: aload_0
    //   118: getfield bzF : LsMa;
    //   121: fload_2
    //   122: invokevirtual Dne : (LsMa;F)V
    //   125: goto -> 133
    //   128: aload_0
    //   129: aconst_null
    //   130: putfield bzF : LsMa;
    //   133: aload_0
    //   134: getfield Dne : LQnq;
    //   137: getfield Dne : LBkx;
    //   140: invokevirtual FWm : ()V
    //   143: aload_0
    //   144: getfield Dne : Z
    //   147: ifne -> 200
    //   150: aload_0
    //   151: getfield bzF : LsMa;
    //   154: ifnull -> 200
    //   157: aload_0
    //   158: getfield Dne : LwdG;
    //   161: ifnull -> 176
    //   164: aload_0
    //   165: getfield Dne : Ljava/util/Random;
    //   168: bipush #20
    //   170: invokevirtual nextInt : (I)I
    //   173: ifne -> 200
    //   176: aload_0
    //   177: aload_0
    //   178: getfield Dne : LQnq;
    //   181: aload_0
    //   182: aload_0
    //   183: getfield bzF : LsMa;
    //   186: fload_1
    //   187: iconst_1
    //   188: iconst_0
    //   189: iconst_0
    //   190: iconst_1
    //   191: invokevirtual Dne : (LsMa;LsMa;FZZZZ)LwdG;
    //   194: putfield Dne : LwdG;
    //   197: goto -> 259
    //   200: aload_0
    //   201: getfield Dne : Z
    //   204: ifne -> 259
    //   207: aload_0
    //   208: getfield Dne : LwdG;
    //   211: ifnonnull -> 227
    //   214: aload_0
    //   215: getfield Dne : Ljava/util/Random;
    //   218: sipush #180
    //   221: invokevirtual nextInt : (I)I
    //   224: ifeq -> 246
    //   227: aload_0
    //   228: getfield Dne : Ljava/util/Random;
    //   231: bipush #120
    //   233: invokevirtual nextInt : (I)I
    //   236: ifeq -> 246
    //   239: aload_0
    //   240: getfield Dne : I
    //   243: ifle -> 259
    //   246: aload_0
    //   247: getfield Wwe : I
    //   250: bipush #100
    //   252: if_icmpge -> 259
    //   255: aload_0
    //   256: invokevirtual zGp : ()V
    //   259: aload_0
    //   260: getfield Dne : LbSp;
    //   263: getfield FWm : D
    //   266: ldc2_w 0.5
    //   269: dadd
    //   270: invokestatic FWm : (D)I
    //   273: istore_2
    //   274: aload_0
    //   275: invokevirtual Zpi : ()Z
    //   278: istore_3
    //   279: aload_0
    //   280: invokevirtual DyG : ()Z
    //   283: istore #4
    //   285: aload_0
    //   286: fconst_0
    //   287: putfield XHL : F
    //   290: aload_0
    //   291: getfield Dne : LwdG;
    //   294: ifnull -> 745
    //   297: aload_0
    //   298: getfield Dne : Ljava/util/Random;
    //   301: bipush #100
    //   303: invokevirtual nextInt : (I)I
    //   306: ifeq -> 745
    //   309: aload_0
    //   310: getfield Dne : LQnq;
    //   313: getfield Dne : LBkx;
    //   316: ldc 'followpath'
    //   318: invokevirtual Dne : (Ljava/lang/String;)V
    //   321: aload_0
    //   322: getfield Dne : LwdG;
    //   325: aload_0
    //   326: invokevirtual Dne : (LsMa;)LchN;
    //   329: astore #5
    //   331: aload_0
    //   332: getfield ooe : F
    //   335: fconst_2
    //   336: fmul
    //   337: f2d
    //   338: dstore #6
    //   340: aload #5
    //   342: ifnull -> 413
    //   345: aload #5
    //   347: aload_0
    //   348: getfield div : D
    //   351: aload #5
    //   353: getfield FWm : D
    //   356: aload_0
    //   357: getfield mrb : D
    //   360: invokevirtual Dne : (DDD)D
    //   363: dload #6
    //   365: dload #6
    //   367: dmul
    //   368: dcmpg
    //   369: ifge -> 413
    //   372: aload_0
    //   373: getfield Dne : LwdG;
    //   376: invokevirtual Dne : ()V
    //   379: aload_0
    //   380: getfield Dne : LwdG;
    //   383: invokevirtual Dne : ()Z
    //   386: ifeq -> 400
    //   389: aconst_null
    //   390: astore #5
    //   392: aload_0
    //   393: aconst_null
    //   394: putfield Dne : LwdG;
    //   397: goto -> 340
    //   400: aload_0
    //   401: getfield Dne : LwdG;
    //   404: aload_0
    //   405: invokevirtual Dne : (LsMa;)LchN;
    //   408: astore #5
    //   410: goto -> 340
    //   413: aload_0
    //   414: iconst_0
    //   415: putfield oIf : Z
    //   418: aload #5
    //   420: ifnull -> 667
    //   423: aload #5
    //   425: getfield Dne : D
    //   428: aload_0
    //   429: getfield div : D
    //   432: dsub
    //   433: dstore #8
    //   435: aload #5
    //   437: getfield bzF : D
    //   440: aload_0
    //   441: getfield mrb : D
    //   444: dsub
    //   445: dstore #10
    //   447: aload #5
    //   449: getfield FWm : D
    //   452: iload_2
    //   453: i2d
    //   454: dsub
    //   455: dstore #12
    //   457: dload #10
    //   459: dload #8
    //   461: invokestatic atan2 : (DD)D
    //   464: ldc2_w 180.0
    //   467: dmul
    //   468: ldc2_w 3.141592653589793
    //   471: ddiv
    //   472: d2f
    //   473: ldc 90.0
    //   475: fsub
    //   476: fstore #14
    //   478: fload #14
    //   480: aload_0
    //   481: getfield mrb : F
    //   484: fsub
    //   485: invokestatic aFZ : (F)F
    //   488: fstore #15
    //   490: aload_0
    //   491: aload_0
    //   492: getfield cHy : F
    //   495: putfield FYZ : F
    //   498: fload #15
    //   500: ldc 30.0
    //   502: fcmpl
    //   503: ifle -> 510
    //   506: ldc 30.0
    //   508: fstore #15
    //   510: fload #15
    //   512: ldc -30.0
    //   514: fcmpg
    //   515: ifge -> 522
    //   518: ldc -30.0
    //   520: fstore #15
    //   522: aload_0
    //   523: dup
    //   524: getfield mrb : F
    //   527: fload #15
    //   529: fadd
    //   530: putfield mrb : F
    //   533: aload_0
    //   534: getfield Dne : Z
    //   537: ifeq -> 655
    //   540: aload_0
    //   541: getfield bzF : LsMa;
    //   544: ifnull -> 655
    //   547: aload_0
    //   548: getfield bzF : LsMa;
    //   551: getfield div : D
    //   554: aload_0
    //   555: getfield div : D
    //   558: dsub
    //   559: dstore #16
    //   561: aload_0
    //   562: getfield bzF : LsMa;
    //   565: getfield mrb : D
    //   568: aload_0
    //   569: getfield mrb : D
    //   572: dsub
    //   573: dstore #18
    //   575: aload_0
    //   576: getfield mrb : F
    //   579: fstore #20
    //   581: aload_0
    //   582: dload #18
    //   584: dload #16
    //   586: invokestatic atan2 : (DD)D
    //   589: ldc2_w 180.0
    //   592: dmul
    //   593: ldc2_w 3.141592653589793
    //   596: ddiv
    //   597: d2f
    //   598: ldc 90.0
    //   600: fsub
    //   601: putfield mrb : F
    //   604: fload #20
    //   606: aload_0
    //   607: getfield mrb : F
    //   610: fsub
    //   611: ldc 90.0
    //   613: fadd
    //   614: ldc 3.1415927
    //   616: fmul
    //   617: ldc 180.0
    //   619: fdiv
    //   620: fstore #15
    //   622: aload_0
    //   623: fload #15
    //   625: invokestatic Dne : (F)F
    //   628: fneg
    //   629: aload_0
    //   630: getfield FYZ : F
    //   633: fmul
    //   634: fconst_1
    //   635: fmul
    //   636: putfield ZfC : F
    //   639: aload_0
    //   640: fload #15
    //   642: invokestatic FWm : (F)F
    //   645: aload_0
    //   646: getfield FYZ : F
    //   649: fmul
    //   650: fconst_1
    //   651: fmul
    //   652: putfield FYZ : F
    //   655: dload #12
    //   657: dconst_0
    //   658: dcmpl
    //   659: ifle -> 667
    //   662: aload_0
    //   663: iconst_1
    //   664: putfield oIf : Z
    //   667: aload_0
    //   668: getfield bzF : LsMa;
    //   671: ifnull -> 686
    //   674: aload_0
    //   675: aload_0
    //   676: getfield bzF : LsMa;
    //   679: ldc 30.0
    //   681: ldc 30.0
    //   683: invokevirtual Dne : (LsMa;FF)V
    //   686: aload_0
    //   687: getfield zGp : Z
    //   690: ifeq -> 705
    //   693: aload_0
    //   694: invokevirtual qrB : ()Z
    //   697: ifne -> 705
    //   700: aload_0
    //   701: iconst_1
    //   702: putfield oIf : Z
    //   705: aload_0
    //   706: getfield Dne : Ljava/util/Random;
    //   709: invokevirtual nextFloat : ()F
    //   712: ldc 0.8
    //   714: fcmpg
    //   715: ifge -> 732
    //   718: iload_3
    //   719: ifne -> 727
    //   722: iload #4
    //   724: ifeq -> 732
    //   727: aload_0
    //   728: iconst_1
    //   729: putfield oIf : Z
    //   732: aload_0
    //   733: getfield Dne : LQnq;
    //   736: getfield Dne : LBkx;
    //   739: invokevirtual FWm : ()V
    //   742: goto -> 754
    //   745: aload_0
    //   746: invokespecial div : ()V
    //   749: aload_0
    //   750: aconst_null
    //   751: putfield Dne : LwdG;
    //   754: return
  }
  
  public float mrb() {
    float f = super.mrb();
    if (this.Dne && !tgc())
      f *= 2.0F; 
    return f;
  }
  
  public void Dne(sMa paramsMa) {
    this.bzF = paramsMa;
  }
  
  protected boolean haP() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kSJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */