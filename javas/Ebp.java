public abstract class Ebp extends sMa {
  private boolean Dne;
  
  private double ATE;
  
  private double Dne;
  
  private double bzF;
  
  private String bzF = '\001';
  
  private static final int[][][] Dne = new int[][][] { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
  
  private double FWm;
  
  private double Vxn;
  
  private double ceE;
  
  private final qDW Dne;
  
  private double qLR;
  
  private int Dne = 0;
  
  private double EyB;
  
  public zKP FWm() {
    return null;
  }
  
  public Ebp(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.98F, 0.7F);
    this.udO = this.trS / 2.0F;
    this.Dne = (paramQnq != null) ? paramQnq.Dne(this) : null;
  }
  
  public void aFZ(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Vxn = this.XHL = paramDouble1;
    this.ceE = this.Zpi = paramDouble2;
    this.EyB = this.kGO = paramDouble3;
  }
  
  protected void Dne(WkD paramWkD) {
    if (Qnq()) {
      paramWkD.Dne("CustomDisplayTile", true);
      paramWkD.Dne("DisplayTile", (Dne() == null) ? 0 : (Dne()).FWm);
      paramWkD.Dne("DisplayData", Zpi());
      paramWkD.Dne("DisplayOffset", udO());
    } 
    if (this.bzF != null && this.bzF.length() > 0)
      paramWkD.Dne("CustomName", this.bzF); 
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public int ooe() {
    return 6;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LqDW;
    //   4: ifnull -> 16
    //   7: aload_0
    //   8: getfield Dne : LqDW;
    //   11: invokeinterface Dne : ()V
    //   16: aload_0
    //   17: invokevirtual bzF : ()I
    //   20: ifle -> 33
    //   23: aload_0
    //   24: aload_0
    //   25: invokevirtual bzF : ()I
    //   28: iconst_1
    //   29: isub
    //   30: invokevirtual FWm : (I)V
    //   33: aload_0
    //   34: invokevirtual Dne : ()I
    //   37: ifle -> 50
    //   40: aload_0
    //   41: aload_0
    //   42: invokevirtual Dne : ()I
    //   45: iconst_1
    //   46: isub
    //   47: invokevirtual Dne : (I)V
    //   50: aload_0
    //   51: getfield IjH : D
    //   54: ldc2_w -64.0
    //   57: dcmpg
    //   58: ifge -> 65
    //   61: aload_0
    //   62: invokevirtual FfS : ()V
    //   65: aload_0
    //   66: getfield Dne : LQnq;
    //   69: getfield aFZ : Z
    //   72: ifne -> 252
    //   75: aload_0
    //   76: getfield Dne : LQnq;
    //   79: instanceof RAN
    //   82: ifeq -> 252
    //   85: aload_0
    //   86: getfield Dne : LQnq;
    //   89: getfield Dne : LBkx;
    //   92: ldc 'portal'
    //   94: invokevirtual Dne : (Ljava/lang/String;)V
    //   97: aload_0
    //   98: getfield Dne : LQnq;
    //   101: checkcast RAN
    //   104: invokevirtual Dne : ()LJwh;
    //   107: astore_2
    //   108: aload_0
    //   109: invokevirtual zGp : ()I
    //   112: istore_1
    //   113: aload_0
    //   114: getfield Vxn : Z
    //   117: ifeq -> 196
    //   120: aload_2
    //   121: invokevirtual div : ()Z
    //   124: ifeq -> 225
    //   127: aload_0
    //   128: getfield FWm : LsMa;
    //   131: ifnonnull -> 188
    //   134: aload_0
    //   135: dup
    //   136: getfield trS : I
    //   139: dup_x1
    //   140: iconst_1
    //   141: iadd
    //   142: putfield trS : I
    //   145: iload_1
    //   146: if_icmplt -> 188
    //   149: aload_0
    //   150: iload_1
    //   151: putfield trS : I
    //   154: aload_0
    //   155: aload_0
    //   156: invokevirtual DyG : ()I
    //   159: putfield ooe : I
    //   162: aload_0
    //   163: getfield Dne : LQnq;
    //   166: getfield Dne : LJik;
    //   169: getfield Dne : I
    //   172: iconst_m1
    //   173: if_icmpne -> 181
    //   176: iconst_0
    //   177: istore_3
    //   178: goto -> 183
    //   181: iconst_m1
    //   182: istore_3
    //   183: aload_0
    //   184: iload_3
    //   185: invokevirtual Qnq : (I)V
    //   188: aload_0
    //   189: iconst_0
    //   190: putfield Vxn : Z
    //   193: goto -> 225
    //   196: aload_0
    //   197: getfield trS : I
    //   200: ifle -> 213
    //   203: aload_0
    //   204: dup
    //   205: getfield trS : I
    //   208: iconst_4
    //   209: isub
    //   210: putfield trS : I
    //   213: aload_0
    //   214: getfield trS : I
    //   217: ifge -> 225
    //   220: aload_0
    //   221: iconst_0
    //   222: putfield trS : I
    //   225: aload_0
    //   226: getfield ooe : I
    //   229: ifle -> 242
    //   232: aload_0
    //   233: dup
    //   234: getfield ooe : I
    //   237: iconst_1
    //   238: isub
    //   239: putfield ooe : I
    //   242: aload_0
    //   243: getfield Dne : LQnq;
    //   246: getfield Dne : LBkx;
    //   249: invokevirtual FWm : ()V
    //   252: aload_0
    //   253: getfield Dne : LQnq;
    //   256: getfield aFZ : Z
    //   259: ifeq -> 460
    //   262: aload_0
    //   263: getfield Dne : I
    //   266: ifle -> 429
    //   269: aload_0
    //   270: getfield div : D
    //   273: aload_0
    //   274: getfield Dne : D
    //   277: aload_0
    //   278: getfield div : D
    //   281: dsub
    //   282: aload_0
    //   283: getfield Dne : I
    //   286: i2d
    //   287: ddiv
    //   288: dadd
    //   289: dstore_2
    //   290: aload_0
    //   291: getfield IjH : D
    //   294: aload_0
    //   295: getfield FWm : D
    //   298: aload_0
    //   299: getfield IjH : D
    //   302: dsub
    //   303: aload_0
    //   304: getfield Dne : I
    //   307: i2d
    //   308: ddiv
    //   309: dadd
    //   310: dstore #4
    //   312: aload_0
    //   313: getfield mrb : D
    //   316: aload_0
    //   317: getfield bzF : D
    //   320: aload_0
    //   321: getfield mrb : D
    //   324: dsub
    //   325: aload_0
    //   326: getfield Dne : I
    //   329: i2d
    //   330: ddiv
    //   331: dadd
    //   332: dstore #6
    //   334: aload_0
    //   335: getfield qLR : D
    //   338: aload_0
    //   339: getfield mrb : F
    //   342: f2d
    //   343: dsub
    //   344: invokestatic Dne : (D)D
    //   347: dstore #8
    //   349: aload_0
    //   350: aload_0
    //   351: getfield mrb : F
    //   354: f2d
    //   355: dload #8
    //   357: aload_0
    //   358: getfield Dne : I
    //   361: i2d
    //   362: ddiv
    //   363: dadd
    //   364: d2f
    //   365: putfield mrb : F
    //   368: aload_0
    //   369: aload_0
    //   370: getfield XHL : F
    //   373: f2d
    //   374: aload_0
    //   375: getfield ATE : D
    //   378: aload_0
    //   379: getfield XHL : F
    //   382: f2d
    //   383: dsub
    //   384: aload_0
    //   385: getfield Dne : I
    //   388: i2d
    //   389: ddiv
    //   390: dadd
    //   391: d2f
    //   392: putfield XHL : F
    //   395: aload_0
    //   396: dup
    //   397: getfield Dne : I
    //   400: iconst_1
    //   401: isub
    //   402: putfield Dne : I
    //   405: aload_0
    //   406: dload_2
    //   407: dload #4
    //   409: dload #6
    //   411: invokevirtual bzF : (DDD)V
    //   414: aload_0
    //   415: aload_0
    //   416: getfield mrb : F
    //   419: aload_0
    //   420: getfield XHL : F
    //   423: invokevirtual FWm : (FF)V
    //   426: goto -> 942
    //   429: aload_0
    //   430: aload_0
    //   431: getfield div : D
    //   434: aload_0
    //   435: getfield IjH : D
    //   438: aload_0
    //   439: getfield mrb : D
    //   442: invokevirtual bzF : (DDD)V
    //   445: aload_0
    //   446: aload_0
    //   447: getfield mrb : F
    //   450: aload_0
    //   451: getfield XHL : F
    //   454: invokevirtual FWm : (FF)V
    //   457: goto -> 942
    //   460: aload_0
    //   461: aload_0
    //   462: getfield div : D
    //   465: putfield aFZ : D
    //   468: aload_0
    //   469: aload_0
    //   470: getfield IjH : D
    //   473: putfield zGp : D
    //   476: aload_0
    //   477: aload_0
    //   478: getfield mrb : D
    //   481: putfield DyG : D
    //   484: aload_0
    //   485: dup
    //   486: getfield Zpi : D
    //   489: ldc2_w 0.03999999910593033
    //   492: dsub
    //   493: putfield Zpi : D
    //   496: aload_0
    //   497: getfield div : D
    //   500: invokestatic FWm : (D)I
    //   503: istore_2
    //   504: aload_0
    //   505: getfield IjH : D
    //   508: invokestatic FWm : (D)I
    //   511: istore_1
    //   512: aload_0
    //   513: getfield mrb : D
    //   516: invokestatic FWm : (D)I
    //   519: istore_3
    //   520: aload_0
    //   521: getfield Dne : LQnq;
    //   524: iload_2
    //   525: iload_1
    //   526: iconst_1
    //   527: isub
    //   528: iload_3
    //   529: invokestatic FWm : (LQnq;III)Z
    //   532: ifeq -> 538
    //   535: iinc #1, -1
    //   538: ldc2_w 0.4
    //   541: dstore #4
    //   543: ldc2_w 0.0078125
    //   546: dstore #6
    //   548: aload_0
    //   549: getfield Dne : LQnq;
    //   552: iload_2
    //   553: iload_1
    //   554: iload_3
    //   555: invokevirtual Dne : (III)I
    //   558: istore #8
    //   560: iload #8
    //   562: invokestatic Dne : (I)Z
    //   565: ifeq -> 629
    //   568: aload_0
    //   569: getfield Dne : LQnq;
    //   572: iload_2
    //   573: iload_1
    //   574: iload_3
    //   575: invokevirtual bzF : (III)I
    //   578: istore #9
    //   580: aload_0
    //   581: iload_2
    //   582: iload_1
    //   583: iload_3
    //   584: dload #4
    //   586: dload #6
    //   588: iload #8
    //   590: iload #9
    //   592: invokevirtual Dne : (IIIDDII)V
    //   595: iload #8
    //   597: getstatic zKP.Dsg : LzKP;
    //   600: getfield FWm : I
    //   603: if_icmpne -> 626
    //   606: aload_0
    //   607: iload_2
    //   608: iload_1
    //   609: iload_3
    //   610: iload #9
    //   612: bipush #8
    //   614: iand
    //   615: ifeq -> 622
    //   618: iconst_1
    //   619: goto -> 623
    //   622: iconst_0
    //   623: invokevirtual Dne : (IIIZ)V
    //   626: goto -> 635
    //   629: aload_0
    //   630: dload #4
    //   632: invokevirtual Dne : (D)V
    //   635: aload_0
    //   636: invokevirtual OdI : ()V
    //   639: aload_0
    //   640: fconst_0
    //   641: putfield XHL : F
    //   644: aload_0
    //   645: getfield aFZ : D
    //   648: aload_0
    //   649: getfield div : D
    //   652: dsub
    //   653: dstore #9
    //   655: aload_0
    //   656: getfield DyG : D
    //   659: aload_0
    //   660: getfield mrb : D
    //   663: dsub
    //   664: dstore #11
    //   666: dload #9
    //   668: dload #9
    //   670: dmul
    //   671: dload #11
    //   673: dload #11
    //   675: dmul
    //   676: dadd
    //   677: ldc2_w 0.001
    //   680: dcmpl
    //   681: ifle -> 723
    //   684: aload_0
    //   685: dload #11
    //   687: dload #9
    //   689: invokestatic atan2 : (DD)D
    //   692: ldc2_w 180.0
    //   695: dmul
    //   696: ldc2_w 3.141592653589793
    //   699: ddiv
    //   700: d2f
    //   701: putfield mrb : F
    //   704: aload_0
    //   705: getfield Dne : Z
    //   708: ifeq -> 723
    //   711: aload_0
    //   712: dup
    //   713: getfield mrb : F
    //   716: ldc_w 180.0
    //   719: fadd
    //   720: putfield mrb : F
    //   723: aload_0
    //   724: getfield mrb : F
    //   727: aload_0
    //   728: getfield Zpi : F
    //   731: fsub
    //   732: invokestatic aFZ : (F)F
    //   735: f2d
    //   736: dstore #13
    //   738: dload #13
    //   740: ldc2_w -170.0
    //   743: dcmpg
    //   744: iflt -> 756
    //   747: dload #13
    //   749: ldc2_w 170.0
    //   752: dcmpl
    //   753: iflt -> 784
    //   756: aload_0
    //   757: dup
    //   758: getfield mrb : F
    //   761: ldc_w 180.0
    //   764: fadd
    //   765: putfield mrb : F
    //   768: aload_0
    //   769: aload_0
    //   770: getfield Dne : Z
    //   773: ifne -> 780
    //   776: iconst_1
    //   777: goto -> 781
    //   780: iconst_0
    //   781: putfield Dne : Z
    //   784: aload_0
    //   785: aload_0
    //   786: getfield mrb : F
    //   789: aload_0
    //   790: getfield XHL : F
    //   793: invokevirtual FWm : (FF)V
    //   796: aload_0
    //   797: getfield Dne : LQnq;
    //   800: aload_0
    //   801: aload_0
    //   802: getfield Dne : LbSp;
    //   805: ldc2_w 0.20000000298023224
    //   808: dconst_0
    //   809: ldc2_w 0.20000000298023224
    //   812: invokevirtual FWm : (DDD)LbSp;
    //   815: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   818: astore #15
    //   820: aload #15
    //   822: ifnull -> 901
    //   825: aload #15
    //   827: invokeinterface isEmpty : ()Z
    //   832: ifne -> 901
    //   835: iconst_0
    //   836: istore #16
    //   838: iload #16
    //   840: aload #15
    //   842: invokeinterface size : ()I
    //   847: if_icmpge -> 901
    //   850: aload #15
    //   852: iload #16
    //   854: invokeinterface get : (I)Ljava/lang/Object;
    //   859: checkcast sMa
    //   862: astore #17
    //   864: aload #17
    //   866: aload_0
    //   867: getfield Dne : LsMa;
    //   870: if_acmpeq -> 895
    //   873: aload #17
    //   875: invokevirtual Dne : ()Z
    //   878: ifeq -> 895
    //   881: aload #17
    //   883: instanceof Ebp
    //   886: ifeq -> 895
    //   889: aload #17
    //   891: aload_0
    //   892: invokevirtual Qnq : (LsMa;)V
    //   895: iinc #16, 1
    //   898: goto -> 838
    //   901: aload_0
    //   902: getfield Dne : LsMa;
    //   905: ifnull -> 942
    //   908: aload_0
    //   909: getfield Dne : LsMa;
    //   912: getfield Zpi : Z
    //   915: ifeq -> 942
    //   918: aload_0
    //   919: getfield Dne : LsMa;
    //   922: getfield FWm : LsMa;
    //   925: aload_0
    //   926: if_acmpne -> 937
    //   929: aload_0
    //   930: getfield Dne : LsMa;
    //   933: aconst_null
    //   934: putfield FWm : LsMa;
    //   937: aload_0
    //   938: aconst_null
    //   939: putfield Dne : LsMa;
    //   942: return
  }
  
  public bSp Dne() {
    return null;
  }
  
  public int mrb() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #18
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  protected void Qnq() {
    if (this.Dne != null) {
      this.XHL *= 0.996999979019165D;
      this.Zpi *= 0.0D;
      this.kGO *= 0.996999979019165D;
    } else {
      this.XHL *= 0.9599999785423279D;
      this.Zpi *= 0.0D;
      this.kGO *= 0.9599999785423279D;
    } 
  }
  
  public chN Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: dload_1
    //   1: invokestatic FWm : (D)I
    //   4: istore #7
    //   6: dload_3
    //   7: invokestatic FWm : (D)I
    //   10: istore #8
    //   12: dload #5
    //   14: invokestatic FWm : (D)I
    //   17: istore #9
    //   19: aload_0
    //   20: getfield Dne : LQnq;
    //   23: iload #7
    //   25: iload #8
    //   27: iconst_1
    //   28: isub
    //   29: iload #9
    //   31: invokestatic FWm : (LQnq;III)Z
    //   34: ifeq -> 40
    //   37: iinc #8, -1
    //   40: aload_0
    //   41: getfield Dne : LQnq;
    //   44: iload #7
    //   46: iload #8
    //   48: iload #9
    //   50: invokevirtual Dne : (III)I
    //   53: istore #10
    //   55: iload #10
    //   57: invokestatic Dne : (I)Z
    //   60: ifeq -> 433
    //   63: aload_0
    //   64: getfield Dne : LQnq;
    //   67: iload #7
    //   69: iload #8
    //   71: iload #9
    //   73: invokevirtual bzF : (III)I
    //   76: istore #11
    //   78: iload #8
    //   80: i2d
    //   81: dstore_3
    //   82: getstatic zKP.Dne : [LzKP;
    //   85: iload #10
    //   87: aaload
    //   88: checkcast Oaf
    //   91: invokevirtual Qnq : ()Z
    //   94: ifeq -> 104
    //   97: iload #11
    //   99: bipush #7
    //   101: iand
    //   102: istore #11
    //   104: iload #11
    //   106: iconst_2
    //   107: if_icmplt -> 122
    //   110: iload #11
    //   112: iconst_5
    //   113: if_icmpgt -> 122
    //   116: iload #8
    //   118: iconst_1
    //   119: iadd
    //   120: i2d
    //   121: dstore_3
    //   122: getstatic Ebp.Dne : [[[I
    //   125: iload #11
    //   127: aaload
    //   128: astore #12
    //   130: dconst_0
    //   131: dstore #13
    //   133: iload #7
    //   135: i2d
    //   136: ldc2_w 0.5
    //   139: dadd
    //   140: aload #12
    //   142: iconst_0
    //   143: aaload
    //   144: iconst_0
    //   145: iaload
    //   146: i2d
    //   147: ldc2_w 0.5
    //   150: dmul
    //   151: dadd
    //   152: dstore #15
    //   154: iload #8
    //   156: i2d
    //   157: ldc2_w 0.5
    //   160: dadd
    //   161: aload #12
    //   163: iconst_0
    //   164: aaload
    //   165: iconst_1
    //   166: iaload
    //   167: i2d
    //   168: ldc2_w 0.5
    //   171: dmul
    //   172: dadd
    //   173: dstore #17
    //   175: iload #9
    //   177: i2d
    //   178: ldc2_w 0.5
    //   181: dadd
    //   182: aload #12
    //   184: iconst_0
    //   185: aaload
    //   186: iconst_2
    //   187: iaload
    //   188: i2d
    //   189: ldc2_w 0.5
    //   192: dmul
    //   193: dadd
    //   194: dstore #19
    //   196: iload #7
    //   198: i2d
    //   199: ldc2_w 0.5
    //   202: dadd
    //   203: aload #12
    //   205: iconst_1
    //   206: aaload
    //   207: iconst_0
    //   208: iaload
    //   209: i2d
    //   210: ldc2_w 0.5
    //   213: dmul
    //   214: dadd
    //   215: dstore #21
    //   217: iload #8
    //   219: i2d
    //   220: ldc2_w 0.5
    //   223: dadd
    //   224: aload #12
    //   226: iconst_1
    //   227: aaload
    //   228: iconst_1
    //   229: iaload
    //   230: i2d
    //   231: ldc2_w 0.5
    //   234: dmul
    //   235: dadd
    //   236: dstore #23
    //   238: iload #9
    //   240: i2d
    //   241: ldc2_w 0.5
    //   244: dadd
    //   245: aload #12
    //   247: iconst_1
    //   248: aaload
    //   249: iconst_2
    //   250: iaload
    //   251: i2d
    //   252: ldc2_w 0.5
    //   255: dmul
    //   256: dadd
    //   257: dstore #25
    //   259: dload #21
    //   261: dload #15
    //   263: dsub
    //   264: dstore #27
    //   266: dload #23
    //   268: dload #17
    //   270: dsub
    //   271: ldc2_w 2.0
    //   274: dmul
    //   275: dstore #29
    //   277: dload #25
    //   279: dload #19
    //   281: dsub
    //   282: dstore #31
    //   284: dload #27
    //   286: dconst_0
    //   287: dcmpl
    //   288: ifne -> 310
    //   291: iload #7
    //   293: i2d
    //   294: ldc2_w 0.5
    //   297: dadd
    //   298: dstore_1
    //   299: dload #5
    //   301: iload #9
    //   303: i2d
    //   304: dsub
    //   305: dstore #13
    //   307: goto -> 366
    //   310: dload #31
    //   312: dconst_0
    //   313: dcmpl
    //   314: ifne -> 336
    //   317: iload #9
    //   319: i2d
    //   320: ldc2_w 0.5
    //   323: dadd
    //   324: dstore #5
    //   326: dload_1
    //   327: iload #7
    //   329: i2d
    //   330: dsub
    //   331: dstore #13
    //   333: goto -> 366
    //   336: dload_1
    //   337: dload #15
    //   339: dsub
    //   340: dstore #33
    //   342: dload #5
    //   344: dload #19
    //   346: dsub
    //   347: dstore #35
    //   349: dload #33
    //   351: dload #27
    //   353: dmul
    //   354: dload #35
    //   356: dload #31
    //   358: dmul
    //   359: dadd
    //   360: ldc2_w 2.0
    //   363: dmul
    //   364: dstore #13
    //   366: dload #15
    //   368: dload #27
    //   370: dload #13
    //   372: dmul
    //   373: dadd
    //   374: dstore_1
    //   375: dload #17
    //   377: dload #29
    //   379: dload #13
    //   381: dmul
    //   382: dadd
    //   383: dstore_3
    //   384: dload #19
    //   386: dload #31
    //   388: dload #13
    //   390: dmul
    //   391: dadd
    //   392: dstore #5
    //   394: dload #29
    //   396: dconst_0
    //   397: dcmpg
    //   398: ifge -> 405
    //   401: dload_3
    //   402: dconst_1
    //   403: dadd
    //   404: dstore_3
    //   405: dload #29
    //   407: dconst_0
    //   408: dcmpl
    //   409: ifle -> 418
    //   412: dload_3
    //   413: ldc2_w 0.5
    //   416: dadd
    //   417: dstore_3
    //   418: aload_0
    //   419: getfield Dne : LQnq;
    //   422: invokevirtual Dne : ()LziS;
    //   425: dload_1
    //   426: dload_3
    //   427: dload #5
    //   429: invokevirtual Dne : (DDD)LchN;
    //   432: areturn
    //   433: aconst_null
    //   434: areturn
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #19
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  public static Ebp Dne(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    switch (paramInt) {
      case 1:
        return new bnY(paramQnq, paramDouble1, paramDouble2, paramDouble3);
      case 2:
        return new tVV(paramQnq, paramDouble1, paramDouble2, paramDouble3);
      case 3:
        return new Art(paramQnq, paramDouble1, paramDouble2, paramDouble3);
      case 4:
        return new sry(paramQnq, paramDouble1, paramDouble2, paramDouble3);
      case 5:
        return new klq(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    } 
    return new FdF(paramQnq, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public boolean d_() {
    return (this.bzF != null);
  }
  
  public void g_() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial g_ : ()V
    //   4: aload_0
    //   5: getfield Dne : LqDW;
    //   8: ifnull -> 20
    //   11: aload_0
    //   12: getfield Dne : LqDW;
    //   15: invokeinterface Dne : ()V
    //   20: return
  }
  
  public boolean Qnq() {
    return (Dne().Dne(22) == 1);
  }
  
  public int Zpi() {
    return !Qnq() ? kGO() : (Dne().Dne(20) >> 16);
  }
  
  public void IjH(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Dne : ()LzKP;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull -> 13
    //   9: iconst_0
    //   10: goto -> 17
    //   13: aload_2
    //   14: getfield FWm : I
    //   17: istore_3
    //   18: aload_0
    //   19: invokevirtual Dne : ()LluM;
    //   22: bipush #20
    //   24: iload_3
    //   25: ldc_w 65535
    //   28: iand
    //   29: iload_1
    //   30: bipush #16
    //   32: ishl
    //   33: ior
    //   34: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   37: invokevirtual FWm : (ILjava/lang/Object;)V
    //   40: aload_0
    //   41: iconst_1
    //   42: invokevirtual FWm : (Z)V
    //   45: return
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  public zKP Dne() {
    if (!Qnq())
      return FWm(); 
    int i = Dne().Dne(20) & 0xFFFF;
    return (i > 0 && i < zKP.Dne.length) ? zKP.Dne[i] : null;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    this.qLR = paramFloat1;
    this.ATE = paramFloat2;
    this.Dne = paramInt + 2;
    this.XHL = this.Vxn;
    this.Zpi = this.ceE;
    this.kGO = this.EyB;
  }
  
  public boolean Dne() {
    return true;
  }
  
  public void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #19
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: return
  }
  
  public void gnI() {
    bzF(-mrb());
    FWm(10);
    Dne(Dne() + Dne() * 10);
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: return
  }
  
  public void div(int paramInt) {
    Dne().FWm(20, Integer.valueOf(paramInt & 0xFFFF | Zpi() << 16));
    FWm(true);
  }
  
  protected void Dne(double paramDouble) {
    if (this.XHL < -paramDouble)
      this.XHL = -paramDouble; 
    if (this.XHL > paramDouble)
      this.XHL = paramDouble; 
    if (this.kGO < -paramDouble)
      this.kGO = -paramDouble; 
    if (this.kGO > paramDouble)
      this.kGO = paramDouble; 
    if (this.aFZ != 0.0D) {
      this.XHL *= 0.5D;
      this.Zpi *= 0.5D;
      this.kGO *= 0.5D;
    } 
    Dne(this.XHL, this.Zpi, this.kGO);
    if (this.aFZ == 0.0D) {
      this.XHL *= 0.949999988079071D;
      this.Zpi *= 0.949999988079071D;
      this.kGO *= 0.949999988079071D;
    } 
  }
  
  public void Dne(String paramString) {
    this.bzF = paramString;
  }
  
  public boolean kGO() {
    return (this.Zpi == 0.0F);
  }
  
  public void FWm(boolean paramBoolean) {
    Dne().FWm(22, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 143
    //   10: aload_0
    //   11: getfield Zpi : Z
    //   14: ifne -> 143
    //   17: aload_0
    //   18: invokevirtual EyB : ()Z
    //   21: ifeq -> 26
    //   24: iconst_0
    //   25: ireturn
    //   26: aload_0
    //   27: aload_0
    //   28: invokevirtual mrb : ()I
    //   31: ineg
    //   32: invokevirtual bzF : (I)V
    //   35: aload_0
    //   36: bipush #10
    //   38: invokevirtual FWm : (I)V
    //   41: aload_0
    //   42: invokevirtual oIf : ()V
    //   45: aload_0
    //   46: aload_0
    //   47: invokevirtual Dne : ()I
    //   50: iload_2
    //   51: bipush #10
    //   53: imul
    //   54: iadd
    //   55: invokevirtual Dne : (I)V
    //   58: aload_1
    //   59: invokevirtual FWm : ()LsMa;
    //   62: instanceof FiG
    //   65: ifeq -> 88
    //   68: aload_1
    //   69: invokevirtual FWm : ()LsMa;
    //   72: checkcast FiG
    //   75: getfield Dne : Luqg;
    //   78: getfield Qnq : Z
    //   81: ifeq -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: istore_3
    //   90: iload_3
    //   91: ifne -> 103
    //   94: aload_0
    //   95: invokevirtual Dne : ()I
    //   98: bipush #40
    //   100: if_icmple -> 141
    //   103: aload_0
    //   104: getfield Dne : LsMa;
    //   107: ifnull -> 118
    //   110: aload_0
    //   111: getfield Dne : LsMa;
    //   114: aload_0
    //   115: invokevirtual bzF : (LsMa;)V
    //   118: iload_3
    //   119: ifeq -> 136
    //   122: aload_0
    //   123: invokevirtual d_ : ()Z
    //   126: ifne -> 136
    //   129: aload_0
    //   130: invokevirtual g_ : ()V
    //   133: goto -> 141
    //   136: aload_0
    //   137: aload_1
    //   138: invokevirtual Dne : (LzBn;)V
    //   141: iconst_1
    //   142: ireturn
    //   143: iconst_1
    //   144: ireturn
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: new java/lang/Integer
    //   9: dup
    //   10: iconst_0
    //   11: invokespecial <init> : (I)V
    //   14: invokevirtual Dne : (ILjava/lang/Object;)V
    //   17: aload_0
    //   18: getfield Dne : LluM;
    //   21: bipush #18
    //   23: new java/lang/Integer
    //   26: dup
    //   27: iconst_1
    //   28: invokespecial <init> : (I)V
    //   31: invokevirtual Dne : (ILjava/lang/Object;)V
    //   34: aload_0
    //   35: getfield Dne : LluM;
    //   38: bipush #19
    //   40: new java/lang/Integer
    //   43: dup
    //   44: iconst_0
    //   45: invokespecial <init> : (I)V
    //   48: invokevirtual Dne : (ILjava/lang/Object;)V
    //   51: aload_0
    //   52: getfield Dne : LluM;
    //   55: bipush #20
    //   57: new java/lang/Integer
    //   60: dup
    //   61: iconst_0
    //   62: invokespecial <init> : (I)V
    //   65: invokevirtual Dne : (ILjava/lang/Object;)V
    //   68: aload_0
    //   69: getfield Dne : LluM;
    //   72: bipush #21
    //   74: new java/lang/Integer
    //   77: dup
    //   78: bipush #6
    //   80: invokespecial <init> : (I)V
    //   83: invokevirtual Dne : (ILjava/lang/Object;)V
    //   86: aload_0
    //   87: getfield Dne : LluM;
    //   90: bipush #22
    //   92: iconst_0
    //   93: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   96: invokevirtual Dne : (ILjava/lang/Object;)V
    //   99: return
  }
  
  public int udO() {
    return !Qnq() ? ooe() : Dne().Dne(21);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: aload_0
    //   1: fconst_0
    //   2: putfield ceE : F
    //   5: aload_0
    //   6: aload_0
    //   7: getfield div : D
    //   10: aload_0
    //   11: getfield IjH : D
    //   14: aload_0
    //   15: getfield mrb : D
    //   18: invokevirtual Dne : (DDD)LchN;
    //   21: astore #10
    //   23: aload_0
    //   24: iload_2
    //   25: i2d
    //   26: putfield IjH : D
    //   29: iconst_0
    //   30: istore #11
    //   32: iconst_0
    //   33: istore #12
    //   35: iload #8
    //   37: getstatic zKP.OdI : LzKP;
    //   40: getfield FWm : I
    //   43: if_icmpne -> 73
    //   46: iload #9
    //   48: bipush #8
    //   50: iand
    //   51: ifeq -> 58
    //   54: iconst_1
    //   55: goto -> 59
    //   58: iconst_0
    //   59: istore #11
    //   61: iload #11
    //   63: ifne -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: istore #12
    //   73: getstatic zKP.Dne : [LzKP;
    //   76: iload #8
    //   78: aaload
    //   79: checkcast Oaf
    //   82: invokevirtual Qnq : ()Z
    //   85: ifeq -> 95
    //   88: iload #9
    //   90: bipush #7
    //   92: iand
    //   93: istore #9
    //   95: iload #9
    //   97: iconst_2
    //   98: if_icmplt -> 115
    //   101: iload #9
    //   103: iconst_5
    //   104: if_icmpgt -> 115
    //   107: aload_0
    //   108: iload_2
    //   109: iconst_1
    //   110: iadd
    //   111: i2d
    //   112: putfield IjH : D
    //   115: iload #9
    //   117: iconst_2
    //   118: if_icmpne -> 132
    //   121: aload_0
    //   122: dup
    //   123: getfield XHL : D
    //   126: dload #6
    //   128: dsub
    //   129: putfield XHL : D
    //   132: iload #9
    //   134: iconst_3
    //   135: if_icmpne -> 149
    //   138: aload_0
    //   139: dup
    //   140: getfield XHL : D
    //   143: dload #6
    //   145: dadd
    //   146: putfield XHL : D
    //   149: iload #9
    //   151: iconst_4
    //   152: if_icmpne -> 166
    //   155: aload_0
    //   156: dup
    //   157: getfield kGO : D
    //   160: dload #6
    //   162: dadd
    //   163: putfield kGO : D
    //   166: iload #9
    //   168: iconst_5
    //   169: if_icmpne -> 183
    //   172: aload_0
    //   173: dup
    //   174: getfield kGO : D
    //   177: dload #6
    //   179: dsub
    //   180: putfield kGO : D
    //   183: getstatic Ebp.Dne : [[[I
    //   186: iload #9
    //   188: aaload
    //   189: astore #13
    //   191: aload #13
    //   193: iconst_1
    //   194: aaload
    //   195: iconst_0
    //   196: iaload
    //   197: aload #13
    //   199: iconst_0
    //   200: aaload
    //   201: iconst_0
    //   202: iaload
    //   203: isub
    //   204: i2d
    //   205: dstore #14
    //   207: aload #13
    //   209: iconst_1
    //   210: aaload
    //   211: iconst_2
    //   212: iaload
    //   213: aload #13
    //   215: iconst_0
    //   216: aaload
    //   217: iconst_2
    //   218: iaload
    //   219: isub
    //   220: i2d
    //   221: dstore #16
    //   223: dload #14
    //   225: dload #14
    //   227: dmul
    //   228: dload #16
    //   230: dload #16
    //   232: dmul
    //   233: dadd
    //   234: invokestatic sqrt : (D)D
    //   237: dstore #18
    //   239: aload_0
    //   240: getfield XHL : D
    //   243: dload #14
    //   245: dmul
    //   246: aload_0
    //   247: getfield kGO : D
    //   250: dload #16
    //   252: dmul
    //   253: dadd
    //   254: dstore #20
    //   256: dload #20
    //   258: dconst_0
    //   259: dcmpg
    //   260: ifge -> 273
    //   263: dload #14
    //   265: dneg
    //   266: dstore #14
    //   268: dload #16
    //   270: dneg
    //   271: dstore #16
    //   273: aload_0
    //   274: getfield XHL : D
    //   277: aload_0
    //   278: getfield XHL : D
    //   281: dmul
    //   282: aload_0
    //   283: getfield kGO : D
    //   286: aload_0
    //   287: getfield kGO : D
    //   290: dmul
    //   291: dadd
    //   292: invokestatic sqrt : (D)D
    //   295: dstore #22
    //   297: dload #22
    //   299: ldc2_w 2.0
    //   302: dcmpl
    //   303: ifle -> 311
    //   306: ldc2_w 2.0
    //   309: dstore #22
    //   311: aload_0
    //   312: dload #22
    //   314: dload #14
    //   316: dmul
    //   317: dload #18
    //   319: ddiv
    //   320: putfield XHL : D
    //   323: aload_0
    //   324: dload #22
    //   326: dload #16
    //   328: dmul
    //   329: dload #18
    //   331: ddiv
    //   332: putfield kGO : D
    //   335: aload_0
    //   336: getfield Dne : LsMa;
    //   339: ifnull -> 457
    //   342: aload_0
    //   343: getfield Dne : LsMa;
    //   346: getfield XHL : D
    //   349: aload_0
    //   350: getfield Dne : LsMa;
    //   353: getfield XHL : D
    //   356: dmul
    //   357: aload_0
    //   358: getfield Dne : LsMa;
    //   361: getfield kGO : D
    //   364: aload_0
    //   365: getfield Dne : LsMa;
    //   368: getfield kGO : D
    //   371: dmul
    //   372: dadd
    //   373: dstore #24
    //   375: aload_0
    //   376: getfield XHL : D
    //   379: aload_0
    //   380: getfield XHL : D
    //   383: dmul
    //   384: aload_0
    //   385: getfield kGO : D
    //   388: aload_0
    //   389: getfield kGO : D
    //   392: dmul
    //   393: dadd
    //   394: dstore #26
    //   396: dload #24
    //   398: ldc2_w 1.0E-4
    //   401: dcmpl
    //   402: ifle -> 457
    //   405: dload #26
    //   407: ldc2_w 0.01
    //   410: dcmpg
    //   411: ifge -> 457
    //   414: aload_0
    //   415: dup
    //   416: getfield XHL : D
    //   419: aload_0
    //   420: getfield Dne : LsMa;
    //   423: getfield XHL : D
    //   426: ldc2_w 0.1
    //   429: dmul
    //   430: dadd
    //   431: putfield XHL : D
    //   434: aload_0
    //   435: dup
    //   436: getfield kGO : D
    //   439: aload_0
    //   440: getfield Dne : LsMa;
    //   443: getfield kGO : D
    //   446: ldc2_w 0.1
    //   449: dmul
    //   450: dadd
    //   451: putfield kGO : D
    //   454: iconst_0
    //   455: istore #12
    //   457: iload #12
    //   459: ifeq -> 562
    //   462: aload_0
    //   463: getfield XHL : D
    //   466: aload_0
    //   467: getfield XHL : D
    //   470: dmul
    //   471: aload_0
    //   472: getfield kGO : D
    //   475: aload_0
    //   476: getfield kGO : D
    //   479: dmul
    //   480: dadd
    //   481: invokestatic sqrt : (D)D
    //   484: dstore #24
    //   486: dload #24
    //   488: ldc2_w 0.03
    //   491: dcmpg
    //   492: ifge -> 528
    //   495: aload_0
    //   496: dup
    //   497: getfield XHL : D
    //   500: dconst_0
    //   501: dmul
    //   502: putfield XHL : D
    //   505: aload_0
    //   506: dup
    //   507: getfield Zpi : D
    //   510: dconst_0
    //   511: dmul
    //   512: putfield Zpi : D
    //   515: aload_0
    //   516: dup
    //   517: getfield kGO : D
    //   520: dconst_0
    //   521: dmul
    //   522: putfield kGO : D
    //   525: goto -> 562
    //   528: aload_0
    //   529: dup
    //   530: getfield XHL : D
    //   533: ldc2_w 0.5
    //   536: dmul
    //   537: putfield XHL : D
    //   540: aload_0
    //   541: dup
    //   542: getfield Zpi : D
    //   545: dconst_0
    //   546: dmul
    //   547: putfield Zpi : D
    //   550: aload_0
    //   551: dup
    //   552: getfield kGO : D
    //   555: ldc2_w 0.5
    //   558: dmul
    //   559: putfield kGO : D
    //   562: dconst_0
    //   563: dstore #24
    //   565: iload_1
    //   566: i2d
    //   567: ldc2_w 0.5
    //   570: dadd
    //   571: aload #13
    //   573: iconst_0
    //   574: aaload
    //   575: iconst_0
    //   576: iaload
    //   577: i2d
    //   578: ldc2_w 0.5
    //   581: dmul
    //   582: dadd
    //   583: dstore #26
    //   585: iload_3
    //   586: i2d
    //   587: ldc2_w 0.5
    //   590: dadd
    //   591: aload #13
    //   593: iconst_0
    //   594: aaload
    //   595: iconst_2
    //   596: iaload
    //   597: i2d
    //   598: ldc2_w 0.5
    //   601: dmul
    //   602: dadd
    //   603: dstore #28
    //   605: iload_1
    //   606: i2d
    //   607: ldc2_w 0.5
    //   610: dadd
    //   611: aload #13
    //   613: iconst_1
    //   614: aaload
    //   615: iconst_0
    //   616: iaload
    //   617: i2d
    //   618: ldc2_w 0.5
    //   621: dmul
    //   622: dadd
    //   623: dstore #30
    //   625: iload_3
    //   626: i2d
    //   627: ldc2_w 0.5
    //   630: dadd
    //   631: aload #13
    //   633: iconst_1
    //   634: aaload
    //   635: iconst_2
    //   636: iaload
    //   637: i2d
    //   638: ldc2_w 0.5
    //   641: dmul
    //   642: dadd
    //   643: dstore #32
    //   645: dload #30
    //   647: dload #26
    //   649: dsub
    //   650: dstore #14
    //   652: dload #32
    //   654: dload #28
    //   656: dsub
    //   657: dstore #16
    //   659: dload #14
    //   661: dconst_0
    //   662: dcmpl
    //   663: ifne -> 688
    //   666: aload_0
    //   667: iload_1
    //   668: i2d
    //   669: ldc2_w 0.5
    //   672: dadd
    //   673: putfield div : D
    //   676: aload_0
    //   677: getfield mrb : D
    //   680: iload_3
    //   681: i2d
    //   682: dsub
    //   683: dstore #24
    //   685: goto -> 752
    //   688: dload #16
    //   690: dconst_0
    //   691: dcmpl
    //   692: ifne -> 717
    //   695: aload_0
    //   696: iload_3
    //   697: i2d
    //   698: ldc2_w 0.5
    //   701: dadd
    //   702: putfield mrb : D
    //   705: aload_0
    //   706: getfield div : D
    //   709: iload_1
    //   710: i2d
    //   711: dsub
    //   712: dstore #24
    //   714: goto -> 752
    //   717: aload_0
    //   718: getfield div : D
    //   721: dload #26
    //   723: dsub
    //   724: dstore #34
    //   726: aload_0
    //   727: getfield mrb : D
    //   730: dload #28
    //   732: dsub
    //   733: dstore #36
    //   735: dload #34
    //   737: dload #14
    //   739: dmul
    //   740: dload #36
    //   742: dload #16
    //   744: dmul
    //   745: dadd
    //   746: ldc2_w 2.0
    //   749: dmul
    //   750: dstore #24
    //   752: aload_0
    //   753: dload #26
    //   755: dload #14
    //   757: dload #24
    //   759: dmul
    //   760: dadd
    //   761: putfield div : D
    //   764: aload_0
    //   765: dload #28
    //   767: dload #16
    //   769: dload #24
    //   771: dmul
    //   772: dadd
    //   773: putfield mrb : D
    //   776: aload_0
    //   777: aload_0
    //   778: getfield div : D
    //   781: aload_0
    //   782: getfield IjH : D
    //   785: aload_0
    //   786: getfield udO : F
    //   789: f2d
    //   790: dadd
    //   791: aload_0
    //   792: getfield mrb : D
    //   795: invokevirtual bzF : (DDD)V
    //   798: aload_0
    //   799: getfield XHL : D
    //   802: dstore #34
    //   804: aload_0
    //   805: getfield kGO : D
    //   808: dstore #36
    //   810: aload_0
    //   811: getfield Dne : LsMa;
    //   814: ifnull -> 833
    //   817: dload #34
    //   819: ldc2_w 0.75
    //   822: dmul
    //   823: dstore #34
    //   825: dload #36
    //   827: ldc2_w 0.75
    //   830: dmul
    //   831: dstore #36
    //   833: dload #34
    //   835: dload #4
    //   837: dneg
    //   838: dcmpg
    //   839: ifge -> 847
    //   842: dload #4
    //   844: dneg
    //   845: dstore #34
    //   847: dload #34
    //   849: dload #4
    //   851: dcmpl
    //   852: ifle -> 859
    //   855: dload #4
    //   857: dstore #34
    //   859: dload #36
    //   861: dload #4
    //   863: dneg
    //   864: dcmpg
    //   865: ifge -> 873
    //   868: dload #4
    //   870: dneg
    //   871: dstore #36
    //   873: dload #36
    //   875: dload #4
    //   877: dcmpl
    //   878: ifle -> 885
    //   881: dload #4
    //   883: dstore #36
    //   885: aload_0
    //   886: dload #34
    //   888: dconst_0
    //   889: dload #36
    //   891: invokevirtual Dne : (DDD)V
    //   894: aload #13
    //   896: iconst_0
    //   897: aaload
    //   898: iconst_1
    //   899: iaload
    //   900: ifeq -> 966
    //   903: aload_0
    //   904: getfield div : D
    //   907: invokestatic FWm : (D)I
    //   910: iload_1
    //   911: isub
    //   912: aload #13
    //   914: iconst_0
    //   915: aaload
    //   916: iconst_0
    //   917: iaload
    //   918: if_icmpne -> 966
    //   921: aload_0
    //   922: getfield mrb : D
    //   925: invokestatic FWm : (D)I
    //   928: iload_3
    //   929: isub
    //   930: aload #13
    //   932: iconst_0
    //   933: aaload
    //   934: iconst_2
    //   935: iaload
    //   936: if_icmpne -> 966
    //   939: aload_0
    //   940: aload_0
    //   941: getfield div : D
    //   944: aload_0
    //   945: getfield IjH : D
    //   948: aload #13
    //   950: iconst_0
    //   951: aaload
    //   952: iconst_1
    //   953: iaload
    //   954: i2d
    //   955: dadd
    //   956: aload_0
    //   957: getfield mrb : D
    //   960: invokevirtual bzF : (DDD)V
    //   963: goto -> 1035
    //   966: aload #13
    //   968: iconst_1
    //   969: aaload
    //   970: iconst_1
    //   971: iaload
    //   972: ifeq -> 1035
    //   975: aload_0
    //   976: getfield div : D
    //   979: invokestatic FWm : (D)I
    //   982: iload_1
    //   983: isub
    //   984: aload #13
    //   986: iconst_1
    //   987: aaload
    //   988: iconst_0
    //   989: iaload
    //   990: if_icmpne -> 1035
    //   993: aload_0
    //   994: getfield mrb : D
    //   997: invokestatic FWm : (D)I
    //   1000: iload_3
    //   1001: isub
    //   1002: aload #13
    //   1004: iconst_1
    //   1005: aaload
    //   1006: iconst_2
    //   1007: iaload
    //   1008: if_icmpne -> 1035
    //   1011: aload_0
    //   1012: aload_0
    //   1013: getfield div : D
    //   1016: aload_0
    //   1017: getfield IjH : D
    //   1020: aload #13
    //   1022: iconst_1
    //   1023: aaload
    //   1024: iconst_1
    //   1025: iaload
    //   1026: i2d
    //   1027: dadd
    //   1028: aload_0
    //   1029: getfield mrb : D
    //   1032: invokevirtual bzF : (DDD)V
    //   1035: aload_0
    //   1036: invokevirtual Qnq : ()V
    //   1039: aload_0
    //   1040: aload_0
    //   1041: getfield div : D
    //   1044: aload_0
    //   1045: getfield IjH : D
    //   1048: aload_0
    //   1049: getfield mrb : D
    //   1052: invokevirtual Dne : (DDD)LchN;
    //   1055: astore #38
    //   1057: aload #38
    //   1059: ifnull -> 1166
    //   1062: aload #10
    //   1064: ifnull -> 1166
    //   1067: aload #10
    //   1069: getfield FWm : D
    //   1072: aload #38
    //   1074: getfield FWm : D
    //   1077: dsub
    //   1078: ldc2_w 0.05
    //   1081: dmul
    //   1082: dstore #39
    //   1084: aload_0
    //   1085: getfield XHL : D
    //   1088: aload_0
    //   1089: getfield XHL : D
    //   1092: dmul
    //   1093: aload_0
    //   1094: getfield kGO : D
    //   1097: aload_0
    //   1098: getfield kGO : D
    //   1101: dmul
    //   1102: dadd
    //   1103: invokestatic sqrt : (D)D
    //   1106: dstore #22
    //   1108: dload #22
    //   1110: dconst_0
    //   1111: dcmpl
    //   1112: ifle -> 1149
    //   1115: aload_0
    //   1116: aload_0
    //   1117: getfield XHL : D
    //   1120: dload #22
    //   1122: ddiv
    //   1123: dload #22
    //   1125: dload #39
    //   1127: dadd
    //   1128: dmul
    //   1129: putfield XHL : D
    //   1132: aload_0
    //   1133: aload_0
    //   1134: getfield kGO : D
    //   1137: dload #22
    //   1139: ddiv
    //   1140: dload #22
    //   1142: dload #39
    //   1144: dadd
    //   1145: dmul
    //   1146: putfield kGO : D
    //   1149: aload_0
    //   1150: aload_0
    //   1151: getfield div : D
    //   1154: aload #38
    //   1156: getfield FWm : D
    //   1159: aload_0
    //   1160: getfield mrb : D
    //   1163: invokevirtual bzF : (DDD)V
    //   1166: aload_0
    //   1167: getfield div : D
    //   1170: invokestatic FWm : (D)I
    //   1173: istore #39
    //   1175: aload_0
    //   1176: getfield mrb : D
    //   1179: invokestatic FWm : (D)I
    //   1182: istore #40
    //   1184: iload #39
    //   1186: iload_1
    //   1187: if_icmpne -> 1196
    //   1190: iload #40
    //   1192: iload_3
    //   1193: if_icmpeq -> 1244
    //   1196: aload_0
    //   1197: getfield XHL : D
    //   1200: aload_0
    //   1201: getfield XHL : D
    //   1204: dmul
    //   1205: aload_0
    //   1206: getfield kGO : D
    //   1209: aload_0
    //   1210: getfield kGO : D
    //   1213: dmul
    //   1214: dadd
    //   1215: invokestatic sqrt : (D)D
    //   1218: dstore #22
    //   1220: aload_0
    //   1221: dload #22
    //   1223: iload #39
    //   1225: iload_1
    //   1226: isub
    //   1227: i2d
    //   1228: dmul
    //   1229: putfield XHL : D
    //   1232: aload_0
    //   1233: dload #22
    //   1235: iload #40
    //   1237: iload_3
    //   1238: isub
    //   1239: i2d
    //   1240: dmul
    //   1241: putfield kGO : D
    //   1244: iload #11
    //   1246: ifeq -> 1436
    //   1249: aload_0
    //   1250: getfield XHL : D
    //   1253: aload_0
    //   1254: getfield XHL : D
    //   1257: dmul
    //   1258: aload_0
    //   1259: getfield kGO : D
    //   1262: aload_0
    //   1263: getfield kGO : D
    //   1266: dmul
    //   1267: dadd
    //   1268: invokestatic sqrt : (D)D
    //   1271: dstore #41
    //   1273: dload #41
    //   1275: ldc2_w 0.01
    //   1278: dcmpl
    //   1279: ifle -> 1328
    //   1282: ldc2_w 0.06
    //   1285: dstore #43
    //   1287: aload_0
    //   1288: dup
    //   1289: getfield XHL : D
    //   1292: aload_0
    //   1293: getfield XHL : D
    //   1296: dload #41
    //   1298: ddiv
    //   1299: dload #43
    //   1301: dmul
    //   1302: dadd
    //   1303: putfield XHL : D
    //   1306: aload_0
    //   1307: dup
    //   1308: getfield kGO : D
    //   1311: aload_0
    //   1312: getfield kGO : D
    //   1315: dload #41
    //   1317: ddiv
    //   1318: dload #43
    //   1320: dmul
    //   1321: dadd
    //   1322: putfield kGO : D
    //   1325: goto -> 1436
    //   1328: iload #9
    //   1330: iconst_1
    //   1331: if_icmpne -> 1384
    //   1334: aload_0
    //   1335: getfield Dne : LQnq;
    //   1338: iload_1
    //   1339: iconst_1
    //   1340: isub
    //   1341: iload_2
    //   1342: iload_3
    //   1343: invokevirtual DyG : (III)Z
    //   1346: ifeq -> 1359
    //   1349: aload_0
    //   1350: ldc2_w 0.02
    //   1353: putfield XHL : D
    //   1356: goto -> 1436
    //   1359: aload_0
    //   1360: getfield Dne : LQnq;
    //   1363: iload_1
    //   1364: iconst_1
    //   1365: iadd
    //   1366: iload_2
    //   1367: iload_3
    //   1368: invokevirtual DyG : (III)Z
    //   1371: ifeq -> 1436
    //   1374: aload_0
    //   1375: ldc2_w -0.02
    //   1378: putfield XHL : D
    //   1381: goto -> 1436
    //   1384: iload #9
    //   1386: ifne -> 1436
    //   1389: aload_0
    //   1390: getfield Dne : LQnq;
    //   1393: iload_1
    //   1394: iload_2
    //   1395: iload_3
    //   1396: iconst_1
    //   1397: isub
    //   1398: invokevirtual DyG : (III)Z
    //   1401: ifeq -> 1414
    //   1404: aload_0
    //   1405: ldc2_w 0.02
    //   1408: putfield kGO : D
    //   1411: goto -> 1436
    //   1414: aload_0
    //   1415: getfield Dne : LQnq;
    //   1418: iload_1
    //   1419: iload_2
    //   1420: iload_3
    //   1421: iconst_1
    //   1422: iadd
    //   1423: invokevirtual DyG : (III)Z
    //   1426: ifeq -> 1436
    //   1429: aload_0
    //   1430: ldc2_w -0.02
    //   1433: putfield kGO : D
    //   1436: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
  
  public chN Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    // Byte code:
    //   0: dload_1
    //   1: invokestatic FWm : (D)I
    //   4: istore #9
    //   6: dload_3
    //   7: invokestatic FWm : (D)I
    //   10: istore #10
    //   12: dload #5
    //   14: invokestatic FWm : (D)I
    //   17: istore #11
    //   19: aload_0
    //   20: getfield Dne : LQnq;
    //   23: iload #9
    //   25: iload #10
    //   27: iconst_1
    //   28: isub
    //   29: iload #11
    //   31: invokestatic FWm : (LQnq;III)Z
    //   34: ifeq -> 40
    //   37: iinc #10, -1
    //   40: aload_0
    //   41: getfield Dne : LQnq;
    //   44: iload #9
    //   46: iload #10
    //   48: iload #11
    //   50: invokevirtual Dne : (III)I
    //   53: istore #12
    //   55: iload #12
    //   57: invokestatic Dne : (I)Z
    //   60: ifne -> 65
    //   63: aconst_null
    //   64: areturn
    //   65: aload_0
    //   66: getfield Dne : LQnq;
    //   69: iload #9
    //   71: iload #10
    //   73: iload #11
    //   75: invokevirtual bzF : (III)I
    //   78: istore #13
    //   80: getstatic zKP.Dne : [LzKP;
    //   83: iload #12
    //   85: aaload
    //   86: checkcast Oaf
    //   89: invokevirtual Qnq : ()Z
    //   92: ifeq -> 102
    //   95: iload #13
    //   97: bipush #7
    //   99: iand
    //   100: istore #13
    //   102: iload #10
    //   104: i2d
    //   105: dstore_3
    //   106: iload #13
    //   108: iconst_2
    //   109: if_icmplt -> 124
    //   112: iload #13
    //   114: iconst_5
    //   115: if_icmpgt -> 124
    //   118: iload #10
    //   120: iconst_1
    //   121: iadd
    //   122: i2d
    //   123: dstore_3
    //   124: getstatic Ebp.Dne : [[[I
    //   127: iload #13
    //   129: aaload
    //   130: astore #14
    //   132: aload #14
    //   134: iconst_1
    //   135: aaload
    //   136: iconst_0
    //   137: iaload
    //   138: aload #14
    //   140: iconst_0
    //   141: aaload
    //   142: iconst_0
    //   143: iaload
    //   144: isub
    //   145: i2d
    //   146: dstore #15
    //   148: aload #14
    //   150: iconst_1
    //   151: aaload
    //   152: iconst_2
    //   153: iaload
    //   154: aload #14
    //   156: iconst_0
    //   157: aaload
    //   158: iconst_2
    //   159: iaload
    //   160: isub
    //   161: i2d
    //   162: dstore #17
    //   164: dload #15
    //   166: dload #15
    //   168: dmul
    //   169: dload #17
    //   171: dload #17
    //   173: dmul
    //   174: dadd
    //   175: invokestatic sqrt : (D)D
    //   178: dstore #19
    //   180: dload #15
    //   182: dload #19
    //   184: ddiv
    //   185: dstore #15
    //   187: dload #17
    //   189: dload #19
    //   191: ddiv
    //   192: dstore #17
    //   194: dload_1
    //   195: dload #15
    //   197: dload #7
    //   199: dmul
    //   200: dadd
    //   201: dstore_1
    //   202: dload #5
    //   204: dload #17
    //   206: dload #7
    //   208: dmul
    //   209: dadd
    //   210: dstore #5
    //   212: aload #14
    //   214: iconst_0
    //   215: aaload
    //   216: iconst_1
    //   217: iaload
    //   218: ifeq -> 267
    //   221: dload_1
    //   222: invokestatic FWm : (D)I
    //   225: iload #9
    //   227: isub
    //   228: aload #14
    //   230: iconst_0
    //   231: aaload
    //   232: iconst_0
    //   233: iaload
    //   234: if_icmpne -> 267
    //   237: dload #5
    //   239: invokestatic FWm : (D)I
    //   242: iload #11
    //   244: isub
    //   245: aload #14
    //   247: iconst_0
    //   248: aaload
    //   249: iconst_2
    //   250: iaload
    //   251: if_icmpne -> 267
    //   254: dload_3
    //   255: aload #14
    //   257: iconst_0
    //   258: aaload
    //   259: iconst_1
    //   260: iaload
    //   261: i2d
    //   262: dadd
    //   263: dstore_3
    //   264: goto -> 319
    //   267: aload #14
    //   269: iconst_1
    //   270: aaload
    //   271: iconst_1
    //   272: iaload
    //   273: ifeq -> 319
    //   276: dload_1
    //   277: invokestatic FWm : (D)I
    //   280: iload #9
    //   282: isub
    //   283: aload #14
    //   285: iconst_1
    //   286: aaload
    //   287: iconst_0
    //   288: iaload
    //   289: if_icmpne -> 319
    //   292: dload #5
    //   294: invokestatic FWm : (D)I
    //   297: iload #11
    //   299: isub
    //   300: aload #14
    //   302: iconst_1
    //   303: aaload
    //   304: iconst_2
    //   305: iaload
    //   306: if_icmpne -> 319
    //   309: dload_3
    //   310: aload #14
    //   312: iconst_1
    //   313: aaload
    //   314: iconst_1
    //   315: iaload
    //   316: i2d
    //   317: dadd
    //   318: dstore_3
    //   319: aload_0
    //   320: dload_1
    //   321: dload_3
    //   322: dload #5
    //   324: invokevirtual Dne : (DDD)LchN;
    //   327: areturn
  }
  
  public bSp Dne(sMa paramsMa) {
    return paramsMa.Dne() ? paramsMa.Dne : null;
  }
  
  public int bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  public String Dne() {
    return (this.bzF != null) ? this.bzF : super.Dne();
  }
  
  public Ebp(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    this(paramQnq);
    bzF(paramDouble1, paramDouble2 + this.udO, paramDouble3);
    this.XHL = 0.0D;
    this.Zpi = 0.0D;
    this.kGO = 0.0D;
    this.aFZ = paramDouble1;
    this.zGp = paramDouble2;
    this.DyG = paramDouble3;
  }
  
  public abstract int XHL();
  
  public String FWm() {
    return this.bzF;
  }
  
  public void Qnq(sMa paramsMa) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 668
    //   10: aload_1
    //   11: aload_0
    //   12: getfield Dne : LsMa;
    //   15: if_acmpeq -> 668
    //   18: aload_1
    //   19: instanceof FUH
    //   22: ifeq -> 91
    //   25: aload_1
    //   26: instanceof FiG
    //   29: ifne -> 91
    //   32: aload_1
    //   33: instanceof CDE
    //   36: ifne -> 91
    //   39: aload_0
    //   40: invokevirtual XHL : ()I
    //   43: ifne -> 91
    //   46: aload_0
    //   47: getfield XHL : D
    //   50: aload_0
    //   51: getfield XHL : D
    //   54: dmul
    //   55: aload_0
    //   56: getfield kGO : D
    //   59: aload_0
    //   60: getfield kGO : D
    //   63: dmul
    //   64: dadd
    //   65: ldc2_w 0.01
    //   68: dcmpl
    //   69: ifle -> 91
    //   72: aload_0
    //   73: getfield Dne : LsMa;
    //   76: ifnonnull -> 91
    //   79: aload_1
    //   80: getfield FWm : LsMa;
    //   83: ifnonnull -> 91
    //   86: aload_1
    //   87: aload_0
    //   88: invokevirtual bzF : (LsMa;)V
    //   91: aload_1
    //   92: getfield div : D
    //   95: aload_0
    //   96: getfield div : D
    //   99: dsub
    //   100: dstore_2
    //   101: aload_1
    //   102: getfield mrb : D
    //   105: aload_0
    //   106: getfield mrb : D
    //   109: dsub
    //   110: dstore #4
    //   112: dload_2
    //   113: dload_2
    //   114: dmul
    //   115: dload #4
    //   117: dload #4
    //   119: dmul
    //   120: dadd
    //   121: dstore #6
    //   123: dload #6
    //   125: ldc2_w 9.999999747378752E-5
    //   128: dcmpl
    //   129: iflt -> 668
    //   132: dload #6
    //   134: invokestatic Dne : (D)F
    //   137: f2d
    //   138: dstore #6
    //   140: dload_2
    //   141: dload #6
    //   143: ddiv
    //   144: dstore_2
    //   145: dload #4
    //   147: dload #6
    //   149: ddiv
    //   150: dstore #4
    //   152: dconst_1
    //   153: dload #6
    //   155: ddiv
    //   156: dstore #8
    //   158: dload #8
    //   160: dconst_1
    //   161: dcmpl
    //   162: ifle -> 168
    //   165: dconst_1
    //   166: dstore #8
    //   168: dload_2
    //   169: dload #8
    //   171: dmul
    //   172: dstore_2
    //   173: dload #4
    //   175: dload #8
    //   177: dmul
    //   178: dstore #4
    //   180: dload_2
    //   181: ldc2_w 0.10000000149011612
    //   184: dmul
    //   185: dstore_2
    //   186: dload #4
    //   188: ldc2_w 0.10000000149011612
    //   191: dmul
    //   192: dstore #4
    //   194: dload_2
    //   195: fconst_1
    //   196: aload_0
    //   197: getfield OdI : F
    //   200: fsub
    //   201: f2d
    //   202: dmul
    //   203: dstore_2
    //   204: dload #4
    //   206: fconst_1
    //   207: aload_0
    //   208: getfield OdI : F
    //   211: fsub
    //   212: f2d
    //   213: dmul
    //   214: dstore #4
    //   216: dload_2
    //   217: ldc2_w 0.5
    //   220: dmul
    //   221: dstore_2
    //   222: dload #4
    //   224: ldc2_w 0.5
    //   227: dmul
    //   228: dstore #4
    //   230: aload_1
    //   231: instanceof Ebp
    //   234: ifeq -> 642
    //   237: aload_1
    //   238: getfield div : D
    //   241: aload_0
    //   242: getfield div : D
    //   245: dsub
    //   246: dstore #10
    //   248: aload_1
    //   249: getfield mrb : D
    //   252: aload_0
    //   253: getfield mrb : D
    //   256: dsub
    //   257: dstore #12
    //   259: aload_0
    //   260: getfield Dne : LQnq;
    //   263: invokevirtual Dne : ()LziS;
    //   266: dload #10
    //   268: dconst_0
    //   269: dload #12
    //   271: invokevirtual Dne : (DDD)LchN;
    //   274: invokevirtual Dne : ()LchN;
    //   277: astore #14
    //   279: aload_0
    //   280: getfield Dne : LQnq;
    //   283: invokevirtual Dne : ()LziS;
    //   286: aload_0
    //   287: getfield mrb : F
    //   290: ldc_w 3.1415927
    //   293: fmul
    //   294: ldc_w 180.0
    //   297: fdiv
    //   298: invokestatic FWm : (F)F
    //   301: f2d
    //   302: dconst_0
    //   303: aload_0
    //   304: getfield mrb : F
    //   307: ldc_w 3.1415927
    //   310: fmul
    //   311: ldc_w 180.0
    //   314: fdiv
    //   315: invokestatic Dne : (F)F
    //   318: f2d
    //   319: invokevirtual Dne : (DDD)LchN;
    //   322: invokevirtual Dne : ()LchN;
    //   325: astore #15
    //   327: aload #14
    //   329: aload #15
    //   331: invokevirtual Dne : (LchN;)D
    //   334: invokestatic abs : (D)D
    //   337: dstore #16
    //   339: dload #16
    //   341: ldc2_w 0.800000011920929
    //   344: dcmpg
    //   345: ifge -> 349
    //   348: return
    //   349: aload_1
    //   350: getfield XHL : D
    //   353: aload_0
    //   354: getfield XHL : D
    //   357: dadd
    //   358: dstore #18
    //   360: aload_1
    //   361: getfield kGO : D
    //   364: aload_0
    //   365: getfield kGO : D
    //   368: dadd
    //   369: dstore #20
    //   371: aload_1
    //   372: checkcast Ebp
    //   375: invokevirtual XHL : ()I
    //   378: iconst_2
    //   379: if_icmpne -> 459
    //   382: aload_0
    //   383: invokevirtual XHL : ()I
    //   386: iconst_2
    //   387: if_icmpeq -> 459
    //   390: aload_0
    //   391: dup
    //   392: getfield XHL : D
    //   395: ldc2_w 0.20000000298023224
    //   398: dmul
    //   399: putfield XHL : D
    //   402: aload_0
    //   403: dup
    //   404: getfield kGO : D
    //   407: ldc2_w 0.20000000298023224
    //   410: dmul
    //   411: putfield kGO : D
    //   414: aload_0
    //   415: aload_1
    //   416: getfield XHL : D
    //   419: dload_2
    //   420: dsub
    //   421: dconst_0
    //   422: aload_1
    //   423: getfield kGO : D
    //   426: dload #4
    //   428: dsub
    //   429: invokevirtual Qnq : (DDD)V
    //   432: aload_1
    //   433: dup
    //   434: getfield XHL : D
    //   437: ldc2_w 0.949999988079071
    //   440: dmul
    //   441: putfield XHL : D
    //   444: aload_1
    //   445: dup
    //   446: getfield kGO : D
    //   449: ldc2_w 0.949999988079071
    //   452: dmul
    //   453: putfield kGO : D
    //   456: goto -> 639
    //   459: aload_1
    //   460: checkcast Ebp
    //   463: invokevirtual XHL : ()I
    //   466: iconst_2
    //   467: if_icmpeq -> 547
    //   470: aload_0
    //   471: invokevirtual XHL : ()I
    //   474: iconst_2
    //   475: if_icmpne -> 547
    //   478: aload_1
    //   479: dup
    //   480: getfield XHL : D
    //   483: ldc2_w 0.20000000298023224
    //   486: dmul
    //   487: putfield XHL : D
    //   490: aload_1
    //   491: dup
    //   492: getfield kGO : D
    //   495: ldc2_w 0.20000000298023224
    //   498: dmul
    //   499: putfield kGO : D
    //   502: aload_1
    //   503: aload_0
    //   504: getfield XHL : D
    //   507: dload_2
    //   508: dadd
    //   509: dconst_0
    //   510: aload_0
    //   511: getfield kGO : D
    //   514: dload #4
    //   516: dadd
    //   517: invokevirtual Qnq : (DDD)V
    //   520: aload_0
    //   521: dup
    //   522: getfield XHL : D
    //   525: ldc2_w 0.949999988079071
    //   528: dmul
    //   529: putfield XHL : D
    //   532: aload_0
    //   533: dup
    //   534: getfield kGO : D
    //   537: ldc2_w 0.949999988079071
    //   540: dmul
    //   541: putfield kGO : D
    //   544: goto -> 639
    //   547: dload #18
    //   549: ldc2_w 2.0
    //   552: ddiv
    //   553: dstore #18
    //   555: dload #20
    //   557: ldc2_w 2.0
    //   560: ddiv
    //   561: dstore #20
    //   563: aload_0
    //   564: dup
    //   565: getfield XHL : D
    //   568: ldc2_w 0.20000000298023224
    //   571: dmul
    //   572: putfield XHL : D
    //   575: aload_0
    //   576: dup
    //   577: getfield kGO : D
    //   580: ldc2_w 0.20000000298023224
    //   583: dmul
    //   584: putfield kGO : D
    //   587: aload_0
    //   588: dload #18
    //   590: dload_2
    //   591: dsub
    //   592: dconst_0
    //   593: dload #20
    //   595: dload #4
    //   597: dsub
    //   598: invokevirtual Qnq : (DDD)V
    //   601: aload_1
    //   602: dup
    //   603: getfield XHL : D
    //   606: ldc2_w 0.20000000298023224
    //   609: dmul
    //   610: putfield XHL : D
    //   613: aload_1
    //   614: dup
    //   615: getfield kGO : D
    //   618: ldc2_w 0.20000000298023224
    //   621: dmul
    //   622: putfield kGO : D
    //   625: aload_1
    //   626: dload #18
    //   628: dload_2
    //   629: dadd
    //   630: dconst_0
    //   631: dload #20
    //   633: dload #4
    //   635: dadd
    //   636: invokevirtual Qnq : (DDD)V
    //   639: goto -> 668
    //   642: aload_0
    //   643: dload_2
    //   644: dneg
    //   645: dconst_0
    //   646: dload #4
    //   648: dneg
    //   649: invokevirtual Qnq : (DDD)V
    //   652: aload_1
    //   653: dload_2
    //   654: ldc2_w 4.0
    //   657: ddiv
    //   658: dconst_0
    //   659: dload #4
    //   661: ldc2_w 4.0
    //   664: ddiv
    //   665: invokevirtual Qnq : (DDD)V
    //   668: return
  }
  
  public int kGO() {
    return 0;
  }
  
  public void mrb(int paramInt) {
    Dne().FWm(21, Integer.valueOf(paramInt));
    FWm(true);
  }
  
  protected void FWm(WkD paramWkD) {
    if (paramWkD.FWm("CustomDisplayTile")) {
      div(paramWkD.Dne("DisplayTile"));
      IjH(paramWkD.Dne("DisplayData"));
      mrb(paramWkD.Dne("DisplayOffset"));
    } 
    if (paramWkD.Dne("CustomName") && paramWkD.Dne("CustomName").length() > 0)
      this.bzF = paramWkD.Dne("CustomName"); 
  }
  
  public double aFZ() {
    return this.trS * 0.0D - 0.30000001192092896D;
  }
  
  public void bzF(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #18
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: return
  }
  
  public void Dne(zBn paramzBn) {
    g_();
    NMq nMq = new NMq(dEr.IYC, 1);
    if (this.bzF != null)
      nMq.Dne(this.bzF); 
    Dne(nMq, 0.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ebp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */