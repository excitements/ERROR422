public class UMP extends sMa {
  private boolean Dne;
  
  private double FWm;
  
  private double Dne;
  
  private double bzF;
  
  private int FWm;
  
  public int Dne = 0;
  
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
  
  public UMP(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.25F, 0.25F);
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
  
  public void Dne(WkD paramWkD) {}
  
  public void FWm(WkD paramWkD) {}
  
  public UMP(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq);
    this.FWm = 0;
    Dne(0.25F, 0.25F);
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.udO = 0.0F;
  }
  
  protected void FWm() {}
  
  public float Dne(float paramFloat) {
    return 1.0F;
  }
  
  public int Dne(float paramFloat) {
    return 15728880;
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
    //   29: dup
    //   30: getfield div : D
    //   33: aload_0
    //   34: getfield XHL : D
    //   37: dadd
    //   38: putfield div : D
    //   41: aload_0
    //   42: dup
    //   43: getfield IjH : D
    //   46: aload_0
    //   47: getfield Zpi : D
    //   50: dadd
    //   51: putfield IjH : D
    //   54: aload_0
    //   55: dup
    //   56: getfield mrb : D
    //   59: aload_0
    //   60: getfield kGO : D
    //   63: dadd
    //   64: putfield mrb : D
    //   67: aload_0
    //   68: getfield XHL : D
    //   71: aload_0
    //   72: getfield XHL : D
    //   75: dmul
    //   76: aload_0
    //   77: getfield kGO : D
    //   80: aload_0
    //   81: getfield kGO : D
    //   84: dmul
    //   85: dadd
    //   86: invokestatic Dne : (D)F
    //   89: fstore_1
    //   90: aload_0
    //   91: aload_0
    //   92: getfield XHL : D
    //   95: aload_0
    //   96: getfield kGO : D
    //   99: invokestatic atan2 : (DD)D
    //   102: ldc2_w 180.0
    //   105: dmul
    //   106: ldc2_w 3.141592653589793
    //   109: ddiv
    //   110: d2f
    //   111: putfield mrb : F
    //   114: aload_0
    //   115: aload_0
    //   116: getfield Zpi : D
    //   119: fload_1
    //   120: f2d
    //   121: invokestatic atan2 : (DD)D
    //   124: ldc2_w 180.0
    //   127: dmul
    //   128: ldc2_w 3.141592653589793
    //   131: ddiv
    //   132: d2f
    //   133: putfield XHL : F
    //   136: aload_0
    //   137: getfield XHL : F
    //   140: aload_0
    //   141: getfield kGO : F
    //   144: fsub
    //   145: ldc -180.0
    //   147: fcmpg
    //   148: ifge -> 165
    //   151: aload_0
    //   152: dup
    //   153: getfield kGO : F
    //   156: ldc 360.0
    //   158: fsub
    //   159: putfield kGO : F
    //   162: goto -> 136
    //   165: aload_0
    //   166: getfield XHL : F
    //   169: aload_0
    //   170: getfield kGO : F
    //   173: fsub
    //   174: ldc 180.0
    //   176: fcmpl
    //   177: iflt -> 194
    //   180: aload_0
    //   181: dup
    //   182: getfield kGO : F
    //   185: ldc 360.0
    //   187: fadd
    //   188: putfield kGO : F
    //   191: goto -> 165
    //   194: aload_0
    //   195: getfield mrb : F
    //   198: aload_0
    //   199: getfield Zpi : F
    //   202: fsub
    //   203: ldc -180.0
    //   205: fcmpg
    //   206: ifge -> 223
    //   209: aload_0
    //   210: dup
    //   211: getfield Zpi : F
    //   214: ldc 360.0
    //   216: fsub
    //   217: putfield Zpi : F
    //   220: goto -> 194
    //   223: aload_0
    //   224: getfield mrb : F
    //   227: aload_0
    //   228: getfield Zpi : F
    //   231: fsub
    //   232: ldc 180.0
    //   234: fcmpl
    //   235: iflt -> 252
    //   238: aload_0
    //   239: dup
    //   240: getfield Zpi : F
    //   243: ldc 360.0
    //   245: fadd
    //   246: putfield Zpi : F
    //   249: goto -> 223
    //   252: aload_0
    //   253: aload_0
    //   254: getfield kGO : F
    //   257: aload_0
    //   258: getfield XHL : F
    //   261: aload_0
    //   262: getfield kGO : F
    //   265: fsub
    //   266: ldc 0.2
    //   268: fmul
    //   269: fadd
    //   270: putfield XHL : F
    //   273: aload_0
    //   274: aload_0
    //   275: getfield Zpi : F
    //   278: aload_0
    //   279: getfield mrb : F
    //   282: aload_0
    //   283: getfield Zpi : F
    //   286: fsub
    //   287: ldc 0.2
    //   289: fmul
    //   290: fadd
    //   291: putfield mrb : F
    //   294: aload_0
    //   295: getfield Dne : LQnq;
    //   298: getfield aFZ : Z
    //   301: ifne -> 471
    //   304: aload_0
    //   305: getfield Dne : D
    //   308: aload_0
    //   309: getfield div : D
    //   312: dsub
    //   313: dstore_2
    //   314: aload_0
    //   315: getfield bzF : D
    //   318: aload_0
    //   319: getfield mrb : D
    //   322: dsub
    //   323: dstore #4
    //   325: dload_2
    //   326: dload_2
    //   327: dmul
    //   328: dload #4
    //   330: dload #4
    //   332: dmul
    //   333: dadd
    //   334: invokestatic sqrt : (D)D
    //   337: d2f
    //   338: fstore #6
    //   340: dload #4
    //   342: dload_2
    //   343: invokestatic atan2 : (DD)D
    //   346: d2f
    //   347: fstore #7
    //   349: fload_1
    //   350: f2d
    //   351: fload #6
    //   353: fload_1
    //   354: fsub
    //   355: f2d
    //   356: ldc2_w 0.0025
    //   359: dmul
    //   360: dadd
    //   361: dstore #8
    //   363: fload #6
    //   365: fconst_1
    //   366: fcmpg
    //   367: ifge -> 390
    //   370: dload #8
    //   372: ldc2_w 0.8
    //   375: dmul
    //   376: dstore #8
    //   378: aload_0
    //   379: dup
    //   380: getfield Zpi : D
    //   383: ldc2_w 0.8
    //   386: dmul
    //   387: putfield Zpi : D
    //   390: aload_0
    //   391: fload #7
    //   393: f2d
    //   394: invokestatic cos : (D)D
    //   397: dload #8
    //   399: dmul
    //   400: putfield XHL : D
    //   403: aload_0
    //   404: fload #7
    //   406: f2d
    //   407: invokestatic sin : (D)D
    //   410: dload #8
    //   412: dmul
    //   413: putfield kGO : D
    //   416: aload_0
    //   417: getfield IjH : D
    //   420: aload_0
    //   421: getfield FWm : D
    //   424: dcmpg
    //   425: ifge -> 450
    //   428: aload_0
    //   429: dup
    //   430: getfield Zpi : D
    //   433: dconst_1
    //   434: aload_0
    //   435: getfield Zpi : D
    //   438: dsub
    //   439: ldc2_w 0.014999999664723873
    //   442: dmul
    //   443: dadd
    //   444: putfield Zpi : D
    //   447: goto -> 471
    //   450: aload_0
    //   451: dup
    //   452: getfield Zpi : D
    //   455: ldc2_w -1.0
    //   458: aload_0
    //   459: getfield Zpi : D
    //   462: dsub
    //   463: ldc2_w 0.014999999664723873
    //   466: dmul
    //   467: dadd
    //   468: putfield Zpi : D
    //   471: ldc 0.25
    //   473: fstore_2
    //   474: aload_0
    //   475: invokevirtual Zpi : ()Z
    //   478: ifeq -> 554
    //   481: iconst_0
    //   482: istore_3
    //   483: iload_3
    //   484: iconst_4
    //   485: if_icmpge -> 551
    //   488: aload_0
    //   489: getfield Dne : LQnq;
    //   492: ldc 'bubble'
    //   494: aload_0
    //   495: getfield div : D
    //   498: aload_0
    //   499: getfield XHL : D
    //   502: fload_2
    //   503: f2d
    //   504: dmul
    //   505: dsub
    //   506: aload_0
    //   507: getfield IjH : D
    //   510: aload_0
    //   511: getfield Zpi : D
    //   514: fload_2
    //   515: f2d
    //   516: dmul
    //   517: dsub
    //   518: aload_0
    //   519: getfield mrb : D
    //   522: aload_0
    //   523: getfield kGO : D
    //   526: fload_2
    //   527: f2d
    //   528: dmul
    //   529: dsub
    //   530: aload_0
    //   531: getfield XHL : D
    //   534: aload_0
    //   535: getfield Zpi : D
    //   538: aload_0
    //   539: getfield kGO : D
    //   542: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   545: iinc #3, 1
    //   548: goto -> 483
    //   551: goto -> 647
    //   554: aload_0
    //   555: getfield Dne : LQnq;
    //   558: ldc 'portal'
    //   560: aload_0
    //   561: getfield div : D
    //   564: aload_0
    //   565: getfield XHL : D
    //   568: fload_2
    //   569: f2d
    //   570: dmul
    //   571: dsub
    //   572: aload_0
    //   573: getfield Dne : Ljava/util/Random;
    //   576: invokevirtual nextDouble : ()D
    //   579: ldc2_w 0.6
    //   582: dmul
    //   583: dadd
    //   584: ldc2_w 0.3
    //   587: dsub
    //   588: aload_0
    //   589: getfield IjH : D
    //   592: aload_0
    //   593: getfield Zpi : D
    //   596: fload_2
    //   597: f2d
    //   598: dmul
    //   599: dsub
    //   600: ldc2_w 0.5
    //   603: dsub
    //   604: aload_0
    //   605: getfield mrb : D
    //   608: aload_0
    //   609: getfield kGO : D
    //   612: fload_2
    //   613: f2d
    //   614: dmul
    //   615: dsub
    //   616: aload_0
    //   617: getfield Dne : Ljava/util/Random;
    //   620: invokevirtual nextDouble : ()D
    //   623: ldc2_w 0.6
    //   626: dmul
    //   627: dadd
    //   628: ldc2_w 0.3
    //   631: dsub
    //   632: aload_0
    //   633: getfield XHL : D
    //   636: aload_0
    //   637: getfield Zpi : D
    //   640: aload_0
    //   641: getfield kGO : D
    //   644: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   647: aload_0
    //   648: getfield Dne : LQnq;
    //   651: getfield aFZ : Z
    //   654: ifne -> 792
    //   657: aload_0
    //   658: aload_0
    //   659: getfield div : D
    //   662: aload_0
    //   663: getfield IjH : D
    //   666: aload_0
    //   667: getfield mrb : D
    //   670: invokevirtual bzF : (DDD)V
    //   673: aload_0
    //   674: dup
    //   675: getfield FWm : I
    //   678: iconst_1
    //   679: iadd
    //   680: putfield FWm : I
    //   683: aload_0
    //   684: getfield FWm : I
    //   687: bipush #80
    //   689: if_icmple -> 792
    //   692: aload_0
    //   693: getfield Dne : LQnq;
    //   696: getfield aFZ : Z
    //   699: ifne -> 792
    //   702: aload_0
    //   703: invokevirtual g_ : ()V
    //   706: aload_0
    //   707: getfield Dne : Z
    //   710: ifeq -> 757
    //   713: aload_0
    //   714: getfield Dne : LQnq;
    //   717: new JiM
    //   720: dup
    //   721: aload_0
    //   722: getfield Dne : LQnq;
    //   725: aload_0
    //   726: getfield div : D
    //   729: aload_0
    //   730: getfield IjH : D
    //   733: aload_0
    //   734: getfield mrb : D
    //   737: new NMq
    //   740: dup
    //   741: getstatic dEr.Woy : LdEr;
    //   744: invokespecial <init> : (LdEr;)V
    //   747: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   750: invokevirtual FWm : (LsMa;)Z
    //   753: pop
    //   754: goto -> 792
    //   757: aload_0
    //   758: getfield Dne : LQnq;
    //   761: sipush #2003
    //   764: aload_0
    //   765: getfield div : D
    //   768: invokestatic round : (D)J
    //   771: l2i
    //   772: aload_0
    //   773: getfield IjH : D
    //   776: invokestatic round : (D)J
    //   779: l2i
    //   780: aload_0
    //   781: getfield mrb : D
    //   784: invokestatic round : (D)J
    //   787: l2i
    //   788: iconst_0
    //   789: invokevirtual Qnq : (IIIII)V
    //   792: return
  }
  
  public void Dne(double paramDouble1, int paramInt, double paramDouble2) {
    // Byte code:
    //   0: dload_1
    //   1: aload_0
    //   2: getfield div : D
    //   5: dsub
    //   6: dstore #6
    //   8: dload #4
    //   10: aload_0
    //   11: getfield mrb : D
    //   14: dsub
    //   15: dstore #8
    //   17: dload #6
    //   19: dload #6
    //   21: dmul
    //   22: dload #8
    //   24: dload #8
    //   26: dmul
    //   27: dadd
    //   28: invokestatic Dne : (D)F
    //   31: fstore #10
    //   33: fload #10
    //   35: ldc 12.0
    //   37: fcmpl
    //   38: ifle -> 94
    //   41: aload_0
    //   42: aload_0
    //   43: getfield div : D
    //   46: dload #6
    //   48: fload #10
    //   50: f2d
    //   51: ddiv
    //   52: ldc2_w 12.0
    //   55: dmul
    //   56: dadd
    //   57: putfield Dne : D
    //   60: aload_0
    //   61: aload_0
    //   62: getfield mrb : D
    //   65: dload #8
    //   67: fload #10
    //   69: f2d
    //   70: ddiv
    //   71: ldc2_w 12.0
    //   74: dmul
    //   75: dadd
    //   76: putfield bzF : D
    //   79: aload_0
    //   80: aload_0
    //   81: getfield IjH : D
    //   84: ldc2_w 8.0
    //   87: dadd
    //   88: putfield FWm : D
    //   91: goto -> 111
    //   94: aload_0
    //   95: dload_1
    //   96: putfield Dne : D
    //   99: aload_0
    //   100: iload_3
    //   101: i2d
    //   102: putfield FWm : D
    //   105: aload_0
    //   106: dload #4
    //   108: putfield bzF : D
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield FWm : I
    //   116: aload_0
    //   117: aload_0
    //   118: getfield Dne : Ljava/util/Random;
    //   121: iconst_5
    //   122: invokevirtual nextInt : (I)I
    //   125: ifle -> 132
    //   128: iconst_1
    //   129: goto -> 133
    //   132: iconst_0
    //   133: putfield Dne : Z
    //   136: return
  }
  
  public boolean bzF() {
    return false;
  }
  
  public float Dne() {
    return 0.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UMP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */