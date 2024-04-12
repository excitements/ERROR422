import java.util.Random;

public class rTW extends kbN {
  private gDn[] Dne;
  
  private gDn[] FWm;
  
  private gDn[] bzF;
  
  public static final int[][] Dne = new int[][] { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
  
  public int Dne() {
    return 14;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (!Dne(paramInt4))
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0); 
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x8) != 0);
  }
  
  private void bzF() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt1 == 0)
      return zKP.Qnq.FWm(paramInt1); 
    int i = Qnq(paramInt2);
    String str = zxJ.Dne[i][paramInt1];
    boolean bool = Dne(paramInt2) ? true : false;
    return ((bool != true || str != '\002') && (bool || str != '\003')) ? ((str != '\005' && str != '\004') ? this.bzF[bool] : this.FWm[bool]) : (gDn)this.Dne[bool];
  }
  
  public static void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (paramBoolean) {
      i |= 0x4;
    } else {
      i &= 0xFFFFFFFB;
    } 
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 4);
  }
  
  public int FWm() {
    return 1;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    // Byte code:
    //   0: aload_1
    //   1: getfield aFZ : Z
    //   4: ifeq -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: aload_1
    //   10: iload_2
    //   11: iload_3
    //   12: iload #4
    //   14: invokevirtual bzF : (III)I
    //   17: istore #10
    //   19: iload #10
    //   21: invokestatic Dne : (I)Z
    //   24: ifne -> 85
    //   27: iload #10
    //   29: invokestatic Qnq : (I)I
    //   32: istore #11
    //   34: iload_2
    //   35: getstatic rTW.Dne : [[I
    //   38: iload #11
    //   40: aaload
    //   41: iconst_0
    //   42: iaload
    //   43: iadd
    //   44: istore_2
    //   45: iload #4
    //   47: getstatic rTW.Dne : [[I
    //   50: iload #11
    //   52: aaload
    //   53: iconst_1
    //   54: iaload
    //   55: iadd
    //   56: istore #4
    //   58: aload_1
    //   59: iload_2
    //   60: iload_3
    //   61: iload #4
    //   63: invokevirtual Dne : (III)I
    //   66: aload_0
    //   67: getfield FWm : I
    //   70: if_icmpeq -> 75
    //   73: iconst_1
    //   74: ireturn
    //   75: aload_1
    //   76: iload_2
    //   77: iload_3
    //   78: iload #4
    //   80: invokevirtual bzF : (III)I
    //   83: istore #10
    //   85: bipush #100
    //   87: invokestatic Dne : (I)I
    //   90: ifne -> 262
    //   93: iload_2
    //   94: i2d
    //   95: ldc2_w 0.5
    //   98: dadd
    //   99: dstore #11
    //   101: iload_3
    //   102: i2d
    //   103: ldc2_w 0.5
    //   106: dadd
    //   107: dstore #13
    //   109: iload #4
    //   111: i2d
    //   112: ldc2_w 0.5
    //   115: dadd
    //   116: dstore #15
    //   118: aload_1
    //   119: iload_2
    //   120: iload_3
    //   121: iload #4
    //   123: invokevirtual Qnq : (III)Z
    //   126: pop
    //   127: iload #10
    //   129: invokestatic Qnq : (I)I
    //   132: istore #17
    //   134: iload_2
    //   135: getstatic rTW.Dne : [[I
    //   138: iload #17
    //   140: aaload
    //   141: iconst_0
    //   142: iaload
    //   143: iadd
    //   144: istore_2
    //   145: iload #4
    //   147: getstatic rTW.Dne : [[I
    //   150: iload #17
    //   152: aaload
    //   153: iconst_1
    //   154: iaload
    //   155: iadd
    //   156: istore #4
    //   158: aload_1
    //   159: iload_2
    //   160: iload_3
    //   161: iload #4
    //   163: invokevirtual Dne : (III)I
    //   166: aload_0
    //   167: getfield FWm : I
    //   170: if_icmpne -> 228
    //   173: aload_1
    //   174: iload_2
    //   175: iload_3
    //   176: iload #4
    //   178: invokevirtual Qnq : (III)Z
    //   181: pop
    //   182: dload #11
    //   184: iload_2
    //   185: i2d
    //   186: dadd
    //   187: ldc2_w 0.5
    //   190: dadd
    //   191: ldc2_w 2.0
    //   194: ddiv
    //   195: dstore #11
    //   197: dload #13
    //   199: iload_3
    //   200: i2d
    //   201: dadd
    //   202: ldc2_w 0.5
    //   205: dadd
    //   206: ldc2_w 2.0
    //   209: ddiv
    //   210: dstore #13
    //   212: dload #15
    //   214: iload #4
    //   216: i2d
    //   217: dadd
    //   218: ldc2_w 0.5
    //   221: dadd
    //   222: ldc2_w 2.0
    //   225: ddiv
    //   226: dstore #15
    //   228: aload_1
    //   229: aconst_null
    //   230: checkcast sMa
    //   233: iload_2
    //   234: i2f
    //   235: ldc 0.5
    //   237: fadd
    //   238: f2d
    //   239: iload_3
    //   240: i2f
    //   241: ldc 0.5
    //   243: fadd
    //   244: f2d
    //   245: iload #4
    //   247: i2f
    //   248: ldc 0.5
    //   250: fadd
    //   251: f2d
    //   252: ldc 5.0
    //   254: iconst_1
    //   255: iconst_1
    //   256: invokevirtual Dne : (LsMa;DDDFZZ)LyTR;
    //   259: pop
    //   260: iconst_1
    //   261: ireturn
    //   262: aload_1
    //   263: getfield Dne : LJik;
    //   266: invokevirtual FWm : ()Z
    //   269: ifeq -> 467
    //   272: aload_1
    //   273: iload_2
    //   274: iload #4
    //   276: invokevirtual Dne : (II)LOdI;
    //   279: getstatic OdI.IjH : LOdI;
    //   282: if_acmpeq -> 467
    //   285: iload #10
    //   287: invokestatic FWm : (I)Z
    //   290: ifeq -> 402
    //   293: aconst_null
    //   294: astore #11
    //   296: aload_1
    //   297: getfield Qnq : Ljava/util/List;
    //   300: invokeinterface iterator : ()Ljava/util/Iterator;
    //   305: astore #12
    //   307: aload #12
    //   309: invokeinterface hasNext : ()Z
    //   314: ifeq -> 379
    //   317: aload #12
    //   319: invokeinterface next : ()Ljava/lang/Object;
    //   324: checkcast FiG
    //   327: astore #13
    //   329: aload #13
    //   331: invokevirtual Wwe : ()Z
    //   334: ifeq -> 376
    //   337: aload #13
    //   339: getfield Dne : LiSh;
    //   342: astore #14
    //   344: aload #14
    //   346: getfield Dne : I
    //   349: iload_2
    //   350: if_icmpne -> 376
    //   353: aload #14
    //   355: getfield FWm : I
    //   358: iload_3
    //   359: if_icmpne -> 376
    //   362: aload #14
    //   364: getfield bzF : I
    //   367: iload #4
    //   369: if_icmpne -> 376
    //   372: aload #13
    //   374: astore #11
    //   376: goto -> 307
    //   379: aload #11
    //   381: ifnull -> 393
    //   384: aload #5
    //   386: ldc 'tile.bed.occupied'
    //   388: invokevirtual bzF : (Ljava/lang/String;)V
    //   391: iconst_1
    //   392: ireturn
    //   393: aload_1
    //   394: iload_2
    //   395: iload_3
    //   396: iload #4
    //   398: iconst_0
    //   399: invokestatic Dne : (LQnq;IIIZ)V
    //   402: aload #5
    //   404: iload_2
    //   405: iload_3
    //   406: iload #4
    //   408: invokevirtual Dne : (III)LNSR;
    //   411: astore #11
    //   413: aload #11
    //   415: getstatic NSR.Dne : LNSR;
    //   418: if_acmpne -> 432
    //   421: aload_1
    //   422: iload_2
    //   423: iload_3
    //   424: iload #4
    //   426: iconst_1
    //   427: invokestatic Dne : (LQnq;IIIZ)V
    //   430: iconst_1
    //   431: ireturn
    //   432: aload #11
    //   434: getstatic NSR.bzF : LNSR;
    //   437: if_acmpne -> 450
    //   440: aload #5
    //   442: ldc 'tile.bed.noSleep'
    //   444: invokevirtual bzF : (Ljava/lang/String;)V
    //   447: goto -> 465
    //   450: aload #11
    //   452: getstatic NSR.zGp : LNSR;
    //   455: if_acmpne -> 465
    //   458: aload #5
    //   460: ldc 'tile.bed.notSafe'
    //   462: invokevirtual bzF : (Ljava/lang/String;)V
    //   465: iconst_1
    //   466: ireturn
    //   467: iload_2
    //   468: i2d
    //   469: ldc2_w 0.5
    //   472: dadd
    //   473: dstore #11
    //   475: iload_3
    //   476: i2d
    //   477: ldc2_w 0.5
    //   480: dadd
    //   481: dstore #13
    //   483: iload #4
    //   485: i2d
    //   486: ldc2_w 0.5
    //   489: dadd
    //   490: dstore #15
    //   492: aload_1
    //   493: iload_2
    //   494: iload_3
    //   495: iload #4
    //   497: invokevirtual Qnq : (III)Z
    //   500: pop
    //   501: iload #10
    //   503: invokestatic Qnq : (I)I
    //   506: istore #17
    //   508: iload_2
    //   509: getstatic rTW.Dne : [[I
    //   512: iload #17
    //   514: aaload
    //   515: iconst_0
    //   516: iaload
    //   517: iadd
    //   518: istore_2
    //   519: iload #4
    //   521: getstatic rTW.Dne : [[I
    //   524: iload #17
    //   526: aaload
    //   527: iconst_1
    //   528: iaload
    //   529: iadd
    //   530: istore #4
    //   532: aload_1
    //   533: iload_2
    //   534: iload_3
    //   535: iload #4
    //   537: invokevirtual Dne : (III)I
    //   540: aload_0
    //   541: getfield FWm : I
    //   544: if_icmpne -> 602
    //   547: aload_1
    //   548: iload_2
    //   549: iload_3
    //   550: iload #4
    //   552: invokevirtual Qnq : (III)Z
    //   555: pop
    //   556: dload #11
    //   558: iload_2
    //   559: i2d
    //   560: dadd
    //   561: ldc2_w 0.5
    //   564: dadd
    //   565: ldc2_w 2.0
    //   568: ddiv
    //   569: dstore #11
    //   571: dload #13
    //   573: iload_3
    //   574: i2d
    //   575: dadd
    //   576: ldc2_w 0.5
    //   579: dadd
    //   580: ldc2_w 2.0
    //   583: ddiv
    //   584: dstore #13
    //   586: dload #15
    //   588: iload #4
    //   590: i2d
    //   591: dadd
    //   592: ldc2_w 0.5
    //   595: dadd
    //   596: ldc2_w 2.0
    //   599: ddiv
    //   600: dstore #15
    //   602: aload_1
    //   603: aconst_null
    //   604: checkcast sMa
    //   607: iload_2
    //   608: i2f
    //   609: ldc 0.5
    //   611: fadd
    //   612: f2d
    //   613: iload_3
    //   614: i2f
    //   615: ldc 0.5
    //   617: fadd
    //   618: f2d
    //   619: iload #4
    //   621: i2f
    //   622: ldc 0.5
    //   624: fadd
    //   625: f2d
    //   626: ldc 5.0
    //   628: iconst_1
    //   629: iconst_1
    //   630: invokevirtual Dne : (LsMa;DDDFZZ)LyTR;
    //   633: pop
    //   634: iconst_1
    //   635: ireturn
  }
  
  public rTW(int paramInt) {
    super(paramInt, KFd.udO);
    bzF();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FiG paramFiG) {
    if (((uqg)paramFiG.Dne).Qnq && Dne(paramInt4)) {
      int i = Qnq(paramInt4);
      paramInt1 -= Dne[i][0];
      paramInt3 -= Dne[i][1];
      if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm)
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
    } 
  }
  
  public void Dne(Rbp paramRbp) {
    this.bzF = new gDn[] { paramRbp.Dne("bed_feet_top"), paramRbp.Dne("bed_head_top") };
    this.Dne = (int[][])new gDn[] { paramRbp.Dne("bed_feet_end"), paramRbp.Dne("bed_head_end") };
    this.FWm = new gDn[] { paramRbp.Dne("bed_feet_side"), paramRbp.Dne("bed_head_side") };
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.Kmf.Qnq;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    bzF();
  }
  
  public boolean FWm() {
    return false;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = Qnq(i);
    if (Dne(i)) {
      if (paramQnq.Dne(paramInt1 - Dne[j][0], paramInt2, paramInt3 - Dne[j][1]) != this.FWm)
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
    } else if (paramQnq.Dne(paramInt1 + Dne[j][0], paramInt2, paramInt3 + Dne[j][1]) != this.FWm) {
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      if (paramQnq.aFZ == null)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i, 0); 
    } 
  }
  
  public static iSh Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = kbN.Qnq(i);
    for (byte b = 0; b <= 1; b++) {
      int k = paramInt1 - Dne[j][0] * b - 1;
      int m = paramInt3 - Dne[j][1] * b - 1;
      int n = k + 2;
      int i1 = m + 2;
      for (int i2 = k; i2 <= n; i2++) {
        for (int i3 = m; i3 <= i1; i3++) {
          if (paramQnq.IjH(i2, paramInt2 - 1, i3) && paramQnq.Dne(i2, paramInt2, i3) && paramQnq.Dne(i2, paramInt2 + 1, i3)) {
            if (paramInt4 <= 0)
              return new iSh(i2, paramInt2, i3); 
            paramInt4--;
          } 
        } 
      } 
    } 
    return null;
  }
  
  public static boolean FWm(int paramInt) {
    return ((paramInt & 0x4) != 0);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return Dne(paramInt1) ? 0 : dEr.Kmf.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rTW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */