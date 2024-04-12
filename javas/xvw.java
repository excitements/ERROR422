public class xvw extends cMv {
  private float FWm;
  
  private int FWm = 0.0F;
  
  private final FUH Dne;
  
  private int Dne;
  
  private final float Dne;
  
  private boolean Dne = false;
  
  public void Dne() {
    this.FWm = 0.0F;
  }
  
  public boolean bzF() {
    return this.Dne;
  }
  
  public boolean Qnq() {
    return (!bzF() && this.FWm > this.Dne * 0.3F);
  }
  
  public void Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield Dne : Z
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield Dne : I
    //   10: aload_0
    //   11: aload_0
    //   12: getfield Dne : LFUH;
    //   15: invokevirtual Dne : ()Ljava/util/Random;
    //   18: sipush #841
    //   21: invokevirtual nextInt : (I)I
    //   24: sipush #140
    //   27: iadd
    //   28: putfield FWm : I
    //   31: return
  }
  
  public void FWm() {
    this.Dne = false;
    this.FWm = 0.0F;
  }
  
  private boolean Dne(int paramInt) {
    return (zKP.Dne[paramInt] != null && (zKP.Dne[paramInt].Dne() == 10 || zKP.Dne[paramInt] instanceof dNT));
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LFUH;
    //   4: getfield Dne : LsMa;
    //   7: checkcast FiG
    //   10: astore_1
    //   11: aload_0
    //   12: getfield Dne : LFUH;
    //   15: checkcast kSJ
    //   18: astore_2
    //   19: aload_1
    //   20: getfield mrb : F
    //   23: aload_0
    //   24: getfield Dne : LFUH;
    //   27: getfield mrb : F
    //   30: fsub
    //   31: invokestatic aFZ : (F)F
    //   34: ldc 0.5
    //   36: fmul
    //   37: fstore_3
    //   38: fload_3
    //   39: ldc 5.0
    //   41: fcmpl
    //   42: ifle -> 48
    //   45: ldc 5.0
    //   47: fstore_3
    //   48: fload_3
    //   49: ldc -5.0
    //   51: fcmpg
    //   52: ifge -> 58
    //   55: ldc -5.0
    //   57: fstore_3
    //   58: aload_0
    //   59: getfield Dne : LFUH;
    //   62: aload_0
    //   63: getfield Dne : LFUH;
    //   66: getfield mrb : F
    //   69: fload_3
    //   70: fadd
    //   71: invokestatic aFZ : (F)F
    //   74: putfield mrb : F
    //   77: aload_0
    //   78: getfield FWm : F
    //   81: aload_0
    //   82: getfield Dne : F
    //   85: fcmpg
    //   86: ifge -> 110
    //   89: aload_0
    //   90: dup
    //   91: getfield FWm : F
    //   94: aload_0
    //   95: getfield Dne : F
    //   98: aload_0
    //   99: getfield FWm : F
    //   102: fsub
    //   103: ldc 0.01
    //   105: fmul
    //   106: fadd
    //   107: putfield FWm : F
    //   110: aload_0
    //   111: getfield FWm : F
    //   114: aload_0
    //   115: getfield Dne : F
    //   118: fcmpl
    //   119: ifle -> 130
    //   122: aload_0
    //   123: aload_0
    //   124: getfield Dne : F
    //   127: putfield FWm : F
    //   130: aload_0
    //   131: getfield Dne : LFUH;
    //   134: getfield div : D
    //   137: invokestatic FWm : (D)I
    //   140: istore #4
    //   142: aload_0
    //   143: getfield Dne : LFUH;
    //   146: getfield IjH : D
    //   149: invokestatic FWm : (D)I
    //   152: istore #5
    //   154: aload_0
    //   155: getfield Dne : LFUH;
    //   158: getfield mrb : D
    //   161: invokestatic FWm : (D)I
    //   164: istore #6
    //   166: aload_0
    //   167: getfield FWm : F
    //   170: fstore #7
    //   172: aload_0
    //   173: getfield Dne : Z
    //   176: ifeq -> 230
    //   179: aload_0
    //   180: dup
    //   181: getfield Dne : I
    //   184: dup_x1
    //   185: iconst_1
    //   186: iadd
    //   187: putfield Dne : I
    //   190: aload_0
    //   191: getfield FWm : I
    //   194: if_icmple -> 202
    //   197: aload_0
    //   198: iconst_0
    //   199: putfield Dne : Z
    //   202: fload #7
    //   204: fload #7
    //   206: ldc 1.15
    //   208: fmul
    //   209: aload_0
    //   210: getfield Dne : I
    //   213: i2f
    //   214: aload_0
    //   215: getfield FWm : I
    //   218: i2f
    //   219: fdiv
    //   220: ldc 3.1415927
    //   222: fmul
    //   223: invokestatic Dne : (F)F
    //   226: fmul
    //   227: fadd
    //   228: fstore #7
    //   230: ldc 0.91
    //   232: fstore #8
    //   234: aload_0
    //   235: getfield Dne : LFUH;
    //   238: getfield aFZ : Z
    //   241: ifeq -> 299
    //   244: ldc 0.54600006
    //   246: fstore #8
    //   248: aload_0
    //   249: getfield Dne : LFUH;
    //   252: getfield Dne : LQnq;
    //   255: iload #4
    //   257: i2f
    //   258: invokestatic Dne : (F)I
    //   261: iload #5
    //   263: i2f
    //   264: invokestatic Dne : (F)I
    //   267: iconst_1
    //   268: isub
    //   269: iload #6
    //   271: i2f
    //   272: invokestatic Dne : (F)I
    //   275: invokevirtual Dne : (III)I
    //   278: istore #9
    //   280: iload #9
    //   282: ifle -> 299
    //   285: getstatic zKP.Dne : [LzKP;
    //   288: iload #9
    //   290: aaload
    //   291: getfield Qnq : F
    //   294: ldc 0.91
    //   296: fmul
    //   297: fstore #8
    //   299: ldc 0.16277136
    //   301: fload #8
    //   303: fload #8
    //   305: fmul
    //   306: fload #8
    //   308: fmul
    //   309: fdiv
    //   310: fstore #9
    //   312: aload_2
    //   313: getfield mrb : F
    //   316: ldc 3.1415927
    //   318: fmul
    //   319: ldc 180.0
    //   321: fdiv
    //   322: invokestatic Dne : (F)F
    //   325: fstore #10
    //   327: aload_2
    //   328: getfield mrb : F
    //   331: ldc 3.1415927
    //   333: fmul
    //   334: ldc 180.0
    //   336: fdiv
    //   337: invokestatic FWm : (F)F
    //   340: fstore #11
    //   342: aload_2
    //   343: invokevirtual bzF : ()F
    //   346: fload #9
    //   348: fmul
    //   349: fstore #12
    //   351: fload #7
    //   353: fconst_1
    //   354: invokestatic max : (FF)F
    //   357: fstore #13
    //   359: fload #12
    //   361: fload #13
    //   363: fdiv
    //   364: fstore #13
    //   366: fload #7
    //   368: fload #13
    //   370: fmul
    //   371: fstore #14
    //   373: fload #14
    //   375: fload #10
    //   377: fmul
    //   378: fneg
    //   379: fstore #15
    //   381: fload #14
    //   383: fload #11
    //   385: fmul
    //   386: fstore #16
    //   388: fload #15
    //   390: invokestatic Qnq : (F)F
    //   393: fload #16
    //   395: invokestatic Qnq : (F)F
    //   398: fcmpl
    //   399: ifle -> 450
    //   402: fload #15
    //   404: fconst_0
    //   405: fcmpg
    //   406: ifge -> 423
    //   409: fload #15
    //   411: aload_0
    //   412: getfield Dne : LFUH;
    //   415: getfield ooe : F
    //   418: fconst_2
    //   419: fdiv
    //   420: fsub
    //   421: fstore #15
    //   423: fload #15
    //   425: fconst_0
    //   426: fcmpl
    //   427: ifle -> 444
    //   430: fload #15
    //   432: aload_0
    //   433: getfield Dne : LFUH;
    //   436: getfield ooe : F
    //   439: fconst_2
    //   440: fdiv
    //   441: fadd
    //   442: fstore #15
    //   444: fconst_0
    //   445: fstore #16
    //   447: goto -> 495
    //   450: fconst_0
    //   451: fstore #15
    //   453: fload #16
    //   455: fconst_0
    //   456: fcmpg
    //   457: ifge -> 474
    //   460: fload #16
    //   462: aload_0
    //   463: getfield Dne : LFUH;
    //   466: getfield ooe : F
    //   469: fconst_2
    //   470: fdiv
    //   471: fsub
    //   472: fstore #16
    //   474: fload #16
    //   476: fconst_0
    //   477: fcmpl
    //   478: ifle -> 495
    //   481: fload #16
    //   483: aload_0
    //   484: getfield Dne : LFUH;
    //   487: getfield ooe : F
    //   490: fconst_2
    //   491: fdiv
    //   492: fadd
    //   493: fstore #16
    //   495: aload_0
    //   496: getfield Dne : LFUH;
    //   499: getfield div : D
    //   502: fload #15
    //   504: f2d
    //   505: dadd
    //   506: invokestatic FWm : (D)I
    //   509: istore #17
    //   511: aload_0
    //   512: getfield Dne : LFUH;
    //   515: getfield mrb : D
    //   518: fload #16
    //   520: f2d
    //   521: dadd
    //   522: invokestatic FWm : (D)I
    //   525: istore #18
    //   527: new whE
    //   530: dup
    //   531: aload_0
    //   532: getfield Dne : LFUH;
    //   535: getfield ooe : F
    //   538: fconst_1
    //   539: fadd
    //   540: invokestatic Dne : (F)I
    //   543: aload_0
    //   544: getfield Dne : LFUH;
    //   547: getfield trS : F
    //   550: aload_1
    //   551: getfield trS : F
    //   554: fadd
    //   555: fconst_1
    //   556: fadd
    //   557: invokestatic Dne : (F)I
    //   560: aload_0
    //   561: getfield Dne : LFUH;
    //   564: getfield ooe : F
    //   567: fconst_1
    //   568: fadd
    //   569: invokestatic Dne : (F)I
    //   572: invokespecial <init> : (III)V
    //   575: astore #19
    //   577: iload #4
    //   579: iload #17
    //   581: if_icmpne -> 591
    //   584: iload #6
    //   586: iload #18
    //   588: if_icmpeq -> 744
    //   591: aload_0
    //   592: getfield Dne : LFUH;
    //   595: getfield Dne : LQnq;
    //   598: iload #4
    //   600: iload #5
    //   602: iload #6
    //   604: invokevirtual Dne : (III)I
    //   607: istore #20
    //   609: aload_0
    //   610: getfield Dne : LFUH;
    //   613: getfield Dne : LQnq;
    //   616: iload #4
    //   618: iload #5
    //   620: iconst_1
    //   621: isub
    //   622: iload #6
    //   624: invokevirtual Dne : (III)I
    //   627: istore #21
    //   629: aload_0
    //   630: iload #20
    //   632: invokespecial Dne : (I)Z
    //   635: ifne -> 656
    //   638: getstatic zKP.Dne : [LzKP;
    //   641: iload #20
    //   643: aaload
    //   644: ifnonnull -> 660
    //   647: aload_0
    //   648: iload #21
    //   650: invokespecial Dne : (I)Z
    //   653: ifeq -> 660
    //   656: iconst_1
    //   657: goto -> 661
    //   660: iconst_0
    //   661: istore #22
    //   663: iload #22
    //   665: ifne -> 744
    //   668: aload_0
    //   669: getfield Dne : LFUH;
    //   672: iload #17
    //   674: iload #5
    //   676: iload #18
    //   678: aload #19
    //   680: iconst_0
    //   681: iconst_0
    //   682: iconst_1
    //   683: invokestatic Dne : (LsMa;IIILwhE;ZZZ)I
    //   686: ifne -> 744
    //   689: aload_0
    //   690: getfield Dne : LFUH;
    //   693: iload #4
    //   695: iload #5
    //   697: iconst_1
    //   698: iadd
    //   699: iload #6
    //   701: aload #19
    //   703: iconst_0
    //   704: iconst_0
    //   705: iconst_1
    //   706: invokestatic Dne : (LsMa;IIILwhE;ZZZ)I
    //   709: iconst_1
    //   710: if_icmpne -> 744
    //   713: aload_0
    //   714: getfield Dne : LFUH;
    //   717: iload #17
    //   719: iload #5
    //   721: iconst_1
    //   722: iadd
    //   723: iload #18
    //   725: aload #19
    //   727: iconst_0
    //   728: iconst_0
    //   729: iconst_1
    //   730: invokestatic Dne : (LsMa;IIILwhE;ZZZ)I
    //   733: iconst_1
    //   734: if_icmpne -> 744
    //   737: aload_2
    //   738: invokevirtual Dne : ()Lqgb;
    //   741: invokevirtual Dne : ()V
    //   744: aload_1
    //   745: getfield Dne : Luqg;
    //   748: getfield Qnq : Z
    //   751: ifne -> 871
    //   754: aload_0
    //   755: getfield FWm : F
    //   758: aload_0
    //   759: getfield Dne : F
    //   762: ldc 0.5
    //   764: fmul
    //   765: fcmpl
    //   766: iflt -> 871
    //   769: aload_0
    //   770: getfield Dne : LFUH;
    //   773: invokevirtual Dne : ()Ljava/util/Random;
    //   776: invokevirtual nextFloat : ()F
    //   779: ldc 0.006
    //   781: fcmpg
    //   782: ifge -> 871
    //   785: aload_0
    //   786: getfield Dne : Z
    //   789: ifne -> 871
    //   792: aload_1
    //   793: invokevirtual Dne : ()LNMq;
    //   796: astore #20
    //   798: aload #20
    //   800: ifnull -> 871
    //   803: aload #20
    //   805: getfield bzF : I
    //   808: getstatic dEr.etZ : LdEr;
    //   811: getfield Qnq : I
    //   814: if_icmpne -> 871
    //   817: aload #20
    //   819: iconst_1
    //   820: aload_1
    //   821: invokevirtual Dne : (ILFUH;)V
    //   824: aload #20
    //   826: getfield Dne : I
    //   829: ifne -> 871
    //   832: new NMq
    //   835: dup
    //   836: getstatic dEr.Dne : LucN;
    //   839: invokespecial <init> : (LdEr;)V
    //   842: astore #21
    //   844: aload #21
    //   846: aload #20
    //   848: getfield Dne : LWkD;
    //   851: invokevirtual FWm : (LWkD;)V
    //   854: aload_1
    //   855: getfield Dne : LMOS;
    //   858: getfield Dne : [LNMq;
    //   861: aload_1
    //   862: getfield Dne : LMOS;
    //   865: getfield Dne : I
    //   868: aload #21
    //   870: aastore
    //   871: aload_0
    //   872: getfield Dne : LFUH;
    //   875: fconst_0
    //   876: fload #7
    //   878: invokevirtual Qnq : (FF)V
    //   881: return
  }
  
  public boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LFUH;
    //   4: invokevirtual udO : ()Z
    //   7: ifeq -> 54
    //   10: aload_0
    //   11: getfield Dne : LFUH;
    //   14: getfield Dne : LsMa;
    //   17: ifnull -> 54
    //   20: aload_0
    //   21: getfield Dne : LFUH;
    //   24: getfield Dne : LsMa;
    //   27: instanceof FiG
    //   30: ifeq -> 54
    //   33: aload_0
    //   34: getfield Dne : Z
    //   37: ifne -> 50
    //   40: aload_0
    //   41: getfield Dne : LFUH;
    //   44: invokevirtual One : ()Z
    //   47: ifeq -> 54
    //   50: iconst_1
    //   51: goto -> 55
    //   54: iconst_0
    //   55: ireturn
  }
  
  public xvw(FUH paramFUH, float paramFloat) {
    this.Dne = false;
    this.FWm = 0;
    this.Dne = paramFUH;
    this.Dne = paramFloat;
    Dne(7);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xvw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */