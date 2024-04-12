public abstract class Tdr extends sMa {
  private int Vxn;
  
  private int Dne;
  
  private int bzF;
  
  private int FWm;
  
  public double Dne;
  
  private int ceE;
  
  private int Qnq = 0;
  
  public double FWm = -1;
  
  private boolean Dne;
  
  public double bzF = -1;
  
  public FUH Dne = -1;
  
  public float Dne(float paramFloat) {
    return 1.0F;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 59
    //   10: aload_0
    //   11: getfield Dne : LFUH;
    //   14: ifnull -> 27
    //   17: aload_0
    //   18: getfield Dne : LFUH;
    //   21: getfield Zpi : Z
    //   24: ifne -> 52
    //   27: aload_0
    //   28: getfield Dne : LQnq;
    //   31: aload_0
    //   32: getfield div : D
    //   35: d2i
    //   36: aload_0
    //   37: getfield IjH : D
    //   40: d2i
    //   41: aload_0
    //   42: getfield mrb : D
    //   45: d2i
    //   46: invokevirtual bzF : (III)Z
    //   49: ifne -> 59
    //   52: aload_0
    //   53: invokevirtual g_ : ()V
    //   56: goto -> 1073
    //   59: aload_0
    //   60: invokespecial Dne : ()V
    //   63: aload_0
    //   64: iconst_1
    //   65: invokevirtual aFZ : (I)V
    //   68: aload_0
    //   69: getfield Dne : Z
    //   72: ifeq -> 206
    //   75: aload_0
    //   76: getfield Dne : LQnq;
    //   79: aload_0
    //   80: getfield Dne : I
    //   83: aload_0
    //   84: getfield FWm : I
    //   87: aload_0
    //   88: getfield bzF : I
    //   91: invokevirtual Dne : (III)I
    //   94: istore_1
    //   95: iload_1
    //   96: aload_0
    //   97: getfield Qnq : I
    //   100: if_icmpne -> 128
    //   103: aload_0
    //   104: dup
    //   105: getfield Vxn : I
    //   108: iconst_1
    //   109: iadd
    //   110: putfield Vxn : I
    //   113: aload_0
    //   114: getfield Vxn : I
    //   117: sipush #600
    //   120: if_icmpne -> 127
    //   123: aload_0
    //   124: invokevirtual g_ : ()V
    //   127: return
    //   128: aload_0
    //   129: iconst_0
    //   130: putfield Dne : Z
    //   133: aload_0
    //   134: dup
    //   135: getfield XHL : D
    //   138: aload_0
    //   139: getfield Dne : Ljava/util/Random;
    //   142: invokevirtual nextFloat : ()F
    //   145: ldc 0.2
    //   147: fmul
    //   148: f2d
    //   149: dmul
    //   150: putfield XHL : D
    //   153: aload_0
    //   154: dup
    //   155: getfield Zpi : D
    //   158: aload_0
    //   159: getfield Dne : Ljava/util/Random;
    //   162: invokevirtual nextFloat : ()F
    //   165: ldc 0.2
    //   167: fmul
    //   168: f2d
    //   169: dmul
    //   170: putfield Zpi : D
    //   173: aload_0
    //   174: dup
    //   175: getfield kGO : D
    //   178: aload_0
    //   179: getfield Dne : Ljava/util/Random;
    //   182: invokevirtual nextFloat : ()F
    //   185: ldc 0.2
    //   187: fmul
    //   188: f2d
    //   189: dmul
    //   190: putfield kGO : D
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield Vxn : I
    //   198: aload_0
    //   199: iconst_0
    //   200: putfield ceE : I
    //   203: goto -> 216
    //   206: aload_0
    //   207: dup
    //   208: getfield ceE : I
    //   211: iconst_1
    //   212: iadd
    //   213: putfield ceE : I
    //   216: aload_0
    //   217: getfield Dne : LQnq;
    //   220: invokevirtual Dne : ()LziS;
    //   223: aload_0
    //   224: getfield div : D
    //   227: aload_0
    //   228: getfield IjH : D
    //   231: aload_0
    //   232: getfield mrb : D
    //   235: invokevirtual Dne : (DDD)LchN;
    //   238: astore_1
    //   239: aload_0
    //   240: getfield Dne : LQnq;
    //   243: invokevirtual Dne : ()LziS;
    //   246: aload_0
    //   247: getfield div : D
    //   250: aload_0
    //   251: getfield XHL : D
    //   254: dadd
    //   255: aload_0
    //   256: getfield IjH : D
    //   259: aload_0
    //   260: getfield Zpi : D
    //   263: dadd
    //   264: aload_0
    //   265: getfield mrb : D
    //   268: aload_0
    //   269: getfield kGO : D
    //   272: dadd
    //   273: invokevirtual Dne : (DDD)LchN;
    //   276: astore_2
    //   277: aload_0
    //   278: getfield Dne : LQnq;
    //   281: aload_1
    //   282: aload_2
    //   283: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   286: astore_3
    //   287: aload_0
    //   288: getfield Dne : LQnq;
    //   291: invokevirtual Dne : ()LziS;
    //   294: aload_0
    //   295: getfield div : D
    //   298: aload_0
    //   299: getfield IjH : D
    //   302: aload_0
    //   303: getfield mrb : D
    //   306: invokevirtual Dne : (DDD)LchN;
    //   309: astore_1
    //   310: aload_0
    //   311: getfield Dne : LQnq;
    //   314: invokevirtual Dne : ()LziS;
    //   317: aload_0
    //   318: getfield div : D
    //   321: aload_0
    //   322: getfield XHL : D
    //   325: dadd
    //   326: aload_0
    //   327: getfield IjH : D
    //   330: aload_0
    //   331: getfield Zpi : D
    //   334: dadd
    //   335: aload_0
    //   336: getfield mrb : D
    //   339: aload_0
    //   340: getfield kGO : D
    //   343: dadd
    //   344: invokevirtual Dne : (DDD)LchN;
    //   347: astore_2
    //   348: aload_3
    //   349: ifnull -> 384
    //   352: aload_0
    //   353: getfield Dne : LQnq;
    //   356: invokevirtual Dne : ()LziS;
    //   359: aload_3
    //   360: getfield Dne : LchN;
    //   363: getfield Dne : D
    //   366: aload_3
    //   367: getfield Dne : LchN;
    //   370: getfield FWm : D
    //   373: aload_3
    //   374: getfield Dne : LchN;
    //   377: getfield bzF : D
    //   380: invokevirtual Dne : (DDD)LchN;
    //   383: astore_2
    //   384: aconst_null
    //   385: astore #4
    //   387: aload_0
    //   388: getfield Dne : LQnq;
    //   391: aload_0
    //   392: aload_0
    //   393: getfield Dne : LbSp;
    //   396: aload_0
    //   397: getfield XHL : D
    //   400: aload_0
    //   401: getfield Zpi : D
    //   404: aload_0
    //   405: getfield kGO : D
    //   408: invokevirtual Dne : (DDD)LbSp;
    //   411: dconst_1
    //   412: dconst_1
    //   413: dconst_1
    //   414: invokevirtual FWm : (DDD)LbSp;
    //   417: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   420: astore #5
    //   422: dconst_0
    //   423: dstore #6
    //   425: iconst_0
    //   426: istore #8
    //   428: iload #8
    //   430: aload #5
    //   432: invokeinterface size : ()I
    //   437: if_icmpge -> 560
    //   440: aload #5
    //   442: iload #8
    //   444: invokeinterface get : (I)Ljava/lang/Object;
    //   449: checkcast sMa
    //   452: astore #9
    //   454: aload #9
    //   456: invokevirtual kGO : ()Z
    //   459: ifeq -> 554
    //   462: aload #9
    //   464: aload_0
    //   465: getfield Dne : LFUH;
    //   468: invokevirtual Dne : (LsMa;)Z
    //   471: ifeq -> 483
    //   474: aload_0
    //   475: getfield ceE : I
    //   478: bipush #25
    //   480: if_icmplt -> 554
    //   483: ldc 0.3
    //   485: fstore #10
    //   487: aload #9
    //   489: getfield Dne : LbSp;
    //   492: fload #10
    //   494: f2d
    //   495: fload #10
    //   497: f2d
    //   498: fload #10
    //   500: f2d
    //   501: invokevirtual FWm : (DDD)LbSp;
    //   504: astore #11
    //   506: aload #11
    //   508: aload_1
    //   509: aload_2
    //   510: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   513: astore #12
    //   515: aload #12
    //   517: ifnull -> 554
    //   520: aload_1
    //   521: aload #12
    //   523: getfield Dne : LchN;
    //   526: invokevirtual FWm : (LchN;)D
    //   529: dstore #13
    //   531: dload #13
    //   533: dload #6
    //   535: dcmpg
    //   536: iflt -> 546
    //   539: dload #6
    //   541: dconst_0
    //   542: dcmpl
    //   543: ifne -> 554
    //   546: aload #9
    //   548: astore #4
    //   550: dload #13
    //   552: dstore #6
    //   554: iinc #8, 1
    //   557: goto -> 428
    //   560: aload #4
    //   562: ifnull -> 575
    //   565: new wHH
    //   568: dup
    //   569: aload #4
    //   571: invokespecial <init> : (LsMa;)V
    //   574: astore_3
    //   575: aload_3
    //   576: ifnull -> 584
    //   579: aload_0
    //   580: aload_3
    //   581: invokevirtual Dne : (LwHH;)V
    //   584: aload_0
    //   585: dup
    //   586: getfield div : D
    //   589: aload_0
    //   590: getfield XHL : D
    //   593: dadd
    //   594: putfield div : D
    //   597: aload_0
    //   598: dup
    //   599: getfield IjH : D
    //   602: aload_0
    //   603: getfield Zpi : D
    //   606: dadd
    //   607: putfield IjH : D
    //   610: aload_0
    //   611: dup
    //   612: getfield mrb : D
    //   615: aload_0
    //   616: getfield kGO : D
    //   619: dadd
    //   620: putfield mrb : D
    //   623: aload_0
    //   624: getfield XHL : D
    //   627: aload_0
    //   628: getfield XHL : D
    //   631: dmul
    //   632: aload_0
    //   633: getfield kGO : D
    //   636: aload_0
    //   637: getfield kGO : D
    //   640: dmul
    //   641: dadd
    //   642: invokestatic Dne : (D)F
    //   645: fstore #8
    //   647: aload_0
    //   648: aload_0
    //   649: getfield kGO : D
    //   652: aload_0
    //   653: getfield XHL : D
    //   656: invokestatic atan2 : (DD)D
    //   659: ldc2_w 180.0
    //   662: dmul
    //   663: ldc2_w 3.141592653589793
    //   666: ddiv
    //   667: d2f
    //   668: ldc 90.0
    //   670: fadd
    //   671: putfield mrb : F
    //   674: aload_0
    //   675: fload #8
    //   677: f2d
    //   678: aload_0
    //   679: getfield Zpi : D
    //   682: invokestatic atan2 : (DD)D
    //   685: ldc2_w 180.0
    //   688: dmul
    //   689: ldc2_w 3.141592653589793
    //   692: ddiv
    //   693: d2f
    //   694: ldc 90.0
    //   696: fsub
    //   697: putfield XHL : F
    //   700: aload_0
    //   701: getfield XHL : F
    //   704: aload_0
    //   705: getfield kGO : F
    //   708: fsub
    //   709: ldc -180.0
    //   711: fcmpg
    //   712: ifge -> 729
    //   715: aload_0
    //   716: dup
    //   717: getfield kGO : F
    //   720: ldc 360.0
    //   722: fsub
    //   723: putfield kGO : F
    //   726: goto -> 700
    //   729: aload_0
    //   730: getfield XHL : F
    //   733: aload_0
    //   734: getfield kGO : F
    //   737: fsub
    //   738: ldc 180.0
    //   740: fcmpl
    //   741: iflt -> 758
    //   744: aload_0
    //   745: dup
    //   746: getfield kGO : F
    //   749: ldc 360.0
    //   751: fadd
    //   752: putfield kGO : F
    //   755: goto -> 729
    //   758: aload_0
    //   759: getfield mrb : F
    //   762: aload_0
    //   763: getfield Zpi : F
    //   766: fsub
    //   767: ldc -180.0
    //   769: fcmpg
    //   770: ifge -> 787
    //   773: aload_0
    //   774: dup
    //   775: getfield Zpi : F
    //   778: ldc 360.0
    //   780: fsub
    //   781: putfield Zpi : F
    //   784: goto -> 758
    //   787: aload_0
    //   788: getfield mrb : F
    //   791: aload_0
    //   792: getfield Zpi : F
    //   795: fsub
    //   796: ldc 180.0
    //   798: fcmpl
    //   799: iflt -> 816
    //   802: aload_0
    //   803: dup
    //   804: getfield Zpi : F
    //   807: ldc 360.0
    //   809: fadd
    //   810: putfield Zpi : F
    //   813: goto -> 787
    //   816: aload_0
    //   817: aload_0
    //   818: getfield kGO : F
    //   821: aload_0
    //   822: getfield XHL : F
    //   825: aload_0
    //   826: getfield kGO : F
    //   829: fsub
    //   830: ldc 0.2
    //   832: fmul
    //   833: fadd
    //   834: putfield XHL : F
    //   837: aload_0
    //   838: aload_0
    //   839: getfield Zpi : F
    //   842: aload_0
    //   843: getfield mrb : F
    //   846: aload_0
    //   847: getfield Zpi : F
    //   850: fsub
    //   851: ldc 0.2
    //   853: fmul
    //   854: fadd
    //   855: putfield mrb : F
    //   858: aload_0
    //   859: invokevirtual bzF : ()F
    //   862: fstore #9
    //   864: aload_0
    //   865: invokevirtual Zpi : ()Z
    //   868: ifeq -> 954
    //   871: iconst_0
    //   872: istore #10
    //   874: iload #10
    //   876: iconst_4
    //   877: if_icmpge -> 950
    //   880: ldc 0.25
    //   882: fstore #11
    //   884: aload_0
    //   885: getfield Dne : LQnq;
    //   888: ldc 'bubble'
    //   890: aload_0
    //   891: getfield div : D
    //   894: aload_0
    //   895: getfield XHL : D
    //   898: fload #11
    //   900: f2d
    //   901: dmul
    //   902: dsub
    //   903: aload_0
    //   904: getfield IjH : D
    //   907: aload_0
    //   908: getfield Zpi : D
    //   911: fload #11
    //   913: f2d
    //   914: dmul
    //   915: dsub
    //   916: aload_0
    //   917: getfield mrb : D
    //   920: aload_0
    //   921: getfield kGO : D
    //   924: fload #11
    //   926: f2d
    //   927: dmul
    //   928: dsub
    //   929: aload_0
    //   930: getfield XHL : D
    //   933: aload_0
    //   934: getfield Zpi : D
    //   937: aload_0
    //   938: getfield kGO : D
    //   941: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   944: iinc #10, 1
    //   947: goto -> 874
    //   950: ldc 0.8
    //   952: fstore #9
    //   954: aload_0
    //   955: dup
    //   956: getfield XHL : D
    //   959: aload_0
    //   960: getfield Dne : D
    //   963: dadd
    //   964: putfield XHL : D
    //   967: aload_0
    //   968: dup
    //   969: getfield Zpi : D
    //   972: aload_0
    //   973: getfield FWm : D
    //   976: dadd
    //   977: putfield Zpi : D
    //   980: aload_0
    //   981: dup
    //   982: getfield kGO : D
    //   985: aload_0
    //   986: getfield bzF : D
    //   989: dadd
    //   990: putfield kGO : D
    //   993: aload_0
    //   994: dup
    //   995: getfield XHL : D
    //   998: fload #9
    //   1000: f2d
    //   1001: dmul
    //   1002: putfield XHL : D
    //   1005: aload_0
    //   1006: dup
    //   1007: getfield Zpi : D
    //   1010: fload #9
    //   1012: f2d
    //   1013: dmul
    //   1014: putfield Zpi : D
    //   1017: aload_0
    //   1018: dup
    //   1019: getfield kGO : D
    //   1022: fload #9
    //   1024: f2d
    //   1025: dmul
    //   1026: putfield kGO : D
    //   1029: aload_0
    //   1030: getfield Dne : LQnq;
    //   1033: ldc 'smoke'
    //   1035: aload_0
    //   1036: getfield div : D
    //   1039: aload_0
    //   1040: getfield IjH : D
    //   1043: ldc2_w 0.5
    //   1046: dadd
    //   1047: aload_0
    //   1048: getfield mrb : D
    //   1051: dconst_0
    //   1052: dconst_0
    //   1053: dconst_0
    //   1054: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   1057: aload_0
    //   1058: aload_0
    //   1059: getfield div : D
    //   1062: aload_0
    //   1063: getfield IjH : D
    //   1066: aload_0
    //   1067: getfield mrb : D
    //   1070: invokevirtual bzF : (DDD)V
    //   1073: return
  }
  
  public Tdr(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq);
    this.Dne = false;
    this.ceE = 0;
    Dne(1.0F, 1.0F);
    FWm(paramDouble1, paramDouble2, paramDouble3, this.mrb, this.XHL);
    bzF(paramDouble1, paramDouble2, paramDouble3);
    double d = geR.Dne(paramDouble4 * paramDouble4 + paramDouble5 * paramDouble5 + paramDouble6 * paramDouble6);
    this.Dne = paramDouble4 / d * 0.1D;
    this.FWm = paramDouble5 / d * 0.1D;
    this.bzF = paramDouble6 / d * 0.1D;
  }
  
  public Tdr(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = false;
    this.ceE = 0;
    Dne(1.0F, 1.0F);
  }
  
  public int Dne(float paramFloat) {
    return 15728880;
  }
  
  protected float bzF() {
    return 0.95F;
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("xTile", (short)this.Dne);
    paramWkD.Dne("yTile", (short)this.FWm);
    paramWkD.Dne("zTile", (short)this.bzF);
    paramWkD.Dne("inTile", (byte)this.Qnq);
    paramWkD.Dne("inGround", (byte)((this.Dne != null) ? 1 : 0));
    paramWkD.Dne("direction", Dne(new double[] { this.XHL, this.Zpi, this.kGO }));
  }
  
  protected void FWm() {}
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    oIf();
    if (paramzBn.FWm() != null) {
      chN chN = paramzBn.FWm().Dne();
      if (chN != null) {
        this.XHL = chN.Dne;
        this.Zpi = chN.FWm;
        this.kGO = chN.bzF;
        this.Dne = this.XHL * 0.1D;
        this.FWm = this.Zpi * 0.1D;
        this.bzF = this.kGO * 0.1D;
      } 
      if (paramzBn.FWm() instanceof FUH)
        this.Dne = (FUH)paramzBn.FWm(); 
      return true;
    } 
    return false;
  }
  
  public boolean kGO() {
    return true;
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  public Tdr(Qnq paramQnq, FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq);
    this.Dne = false;
    this.ceE = 0;
    this.Dne = paramFUH;
    Dne(1.0F, 1.0F);
    FWm(paramFUH.div, paramFUH.IjH, paramFUH.mrb, paramFUH.mrb, paramFUH.XHL);
    bzF(this.div, this.IjH, this.mrb);
    this.udO = 0.0F;
    this.Zpi = this.kGO = 0.0D;
    (this.kGO = 0.0D).XHL = this;
    paramDouble1 += this.Dne.nextGaussian() * 0.4D;
    paramDouble2 += this.Dne.nextGaussian() * 0.4D;
    paramDouble3 += this.Dne.nextGaussian() * 0.4D;
    double d = geR.Dne(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
    this.Dne = paramDouble1 / d * 0.1D;
    this.FWm = paramDouble2 / d * 0.1D;
    this.bzF = paramDouble3 / d * 0.1D;
  }
  
  protected abstract void Dne(wHH paramwHH);
  
  public void FWm(WkD paramWkD) {
    this.Dne = paramWkD.Dne("xTile");
    this.FWm = paramWkD.Dne("yTile");
    this.bzF = paramWkD.Dne("zTile");
    this.Qnq = paramWkD.Dne("inTile") & 0xFF;
    this.Dne = (paramWkD.Dne("inGround") == 1) ? 1 : 0;
    if (paramWkD.Dne("direction")) {
      mbZ mbZ = paramWkD.Dne("direction");
      this.XHL = ((kJU)mbZ.FWm(0)).Dne;
      this.Zpi = ((kJU)mbZ.FWm(1)).Dne;
      this.kGO = ((kJU)mbZ.FWm(2)).Dne;
    } else {
      g_();
    } 
  }
  
  public float Qnq() {
    return 1.0F;
  }
  
  public boolean Dne(double paramDouble) {
    double d = this.Dne.Dne() * 4.0D;
    d *= 64.0D;
    return (paramDouble < d * d);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tdr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */