public class hhc extends sMa implements vaR {
  private int Qnq = -1;
  
  private int EyB = 0;
  
  private int oIf;
  
  private int ceE = 0;
  
  private double Dne;
  
  private int Vxn = -1;
  
  private int OdI;
  
  public int FWm;
  
  private int bzF;
  
  public sMa bzF = -1;
  
  private int FfS;
  
  public int Dne;
  
  private boolean Dne = false;
  
  public boolean Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: istore_1
    //   10: iload_1
    //   11: iconst_1
    //   12: iand
    //   13: ifeq -> 20
    //   16: iconst_1
    //   17: goto -> 21
    //   20: iconst_0
    //   21: ireturn
  }
  
  public hhc(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq);
    this.Dne = false;
    this.FWm = 0;
    this.OdI = 0;
    this.Dne = 2.0D;
    this.Qnq = 10.0D;
    Dne(0.5F, 0.5F);
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.udO = 0.0F;
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: iconst_0
    //   7: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   10: invokevirtual Dne : (ILjava/lang/Object;)V
    //   13: return
  }
  
  public hhc(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = false;
    this.FWm = 0;
    this.OdI = 0;
    this.Dne = 2.0D;
    this.Qnq = 10.0D;
    Dne(0.5F, 0.5F);
  }
  
  public void FWm(WkD paramWkD) {
    this.bzF = paramWkD.Dne("xTile");
    this.Qnq = paramWkD.Dne("yTile");
    this.Vxn = paramWkD.Dne("zTile");
    this.ceE = paramWkD.Dne("inTile") & 0xFF;
    this.EyB = paramWkD.Dne("inData") & 0xFF;
    this.FWm = paramWkD.Dne("shake") & 0xFF;
    this.Dne = (paramWkD.Dne("inGround") == 1);
    if (paramWkD.Dne("damage"))
      this.Dne = paramWkD.Dne("damage"); 
    if (paramWkD.Dne("pickup")) {
      this.Dne = paramWkD.Dne("pickup");
    } else if (paramWkD.Dne("player")) {
      this.Dne = paramWkD.FWm("player");
    } 
  }
  
  public double Dne() {
    return this.Dne;
  }
  
  public void Dne(double paramDouble) {
    this.Dne = paramDouble;
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  public hhc(Qnq paramQnq, FUH paramFUH1, FUH paramFUH2, float paramFloat1, float paramFloat2) {
    super(paramQnq);
    this.Dne = false;
    this.FWm = 0;
    this.OdI = 0;
    this.Dne = 2.0D;
    this.Qnq = 10.0D;
    this.bzF = paramFUH1;
    if (paramFUH1 instanceof FiG)
      this.Dne = true; 
    this.IjH = paramFUH1.IjH + paramFUH1.c_() - 0.10000000149011612D;
    double d1 = paramFUH2.div - paramFUH1.div;
    double d2 = paramFUH2.Dne.FWm + (paramFUH2.trS / 3.0F) - this.IjH;
    double d3 = paramFUH2.mrb - paramFUH1.mrb;
    double d4 = geR.Dne(d1 * d1 + d3 * d3);
    if (d4 >= 1.0E-7D) {
      float f1 = (float)(Math.atan2(d3, d1) * 180.0D / Math.PI) - 90.0F;
      float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / Math.PI);
      double d5 = d1 / d4;
      double d6 = d3 / d4;
      FWm(paramFUH1.div + d5, this.IjH, paramFUH1.mrb + d6, f1, f2);
      this.udO = 0.0F;
      float f3 = (float)d4 * 0.2F;
      bzF(d1, d2 + f3, d3, paramFloat1, paramFloat2);
    } 
  }
  
  public boolean bzF() {
    return false;
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("xTile", (short)this.bzF);
    paramWkD.Dne("yTile", (short)this.Qnq);
    paramWkD.Dne("zTile", (short)this.Vxn);
    paramWkD.Dne("inTile", (byte)this.ceE);
    paramWkD.Dne("inData", (byte)this.EyB);
    paramWkD.Dne("shake", (byte)this.FWm);
    paramWkD.Dne("inGround", (byte)(this.Dne ? 1 : 0));
    paramWkD.Dne("pickup", (byte)this.Dne);
    paramWkD.Dne("damage", this.Dne);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: getfield kGO : F
    //   8: fconst_0
    //   9: fcmpl
    //   10: ifne -> 101
    //   13: aload_0
    //   14: getfield Zpi : F
    //   17: fconst_0
    //   18: fcmpl
    //   19: ifne -> 101
    //   22: aload_0
    //   23: getfield XHL : D
    //   26: aload_0
    //   27: getfield XHL : D
    //   30: dmul
    //   31: aload_0
    //   32: getfield kGO : D
    //   35: aload_0
    //   36: getfield kGO : D
    //   39: dmul
    //   40: dadd
    //   41: invokestatic Dne : (D)F
    //   44: fstore_1
    //   45: aload_0
    //   46: aload_0
    //   47: aload_0
    //   48: getfield XHL : D
    //   51: aload_0
    //   52: getfield kGO : D
    //   55: invokestatic atan2 : (DD)D
    //   58: ldc2_w 180.0
    //   61: dmul
    //   62: ldc2_w 3.141592653589793
    //   65: ddiv
    //   66: d2f
    //   67: dup_x1
    //   68: putfield mrb : F
    //   71: putfield Zpi : F
    //   74: aload_0
    //   75: aload_0
    //   76: aload_0
    //   77: getfield Zpi : D
    //   80: fload_1
    //   81: f2d
    //   82: invokestatic atan2 : (DD)D
    //   85: ldc2_w 180.0
    //   88: dmul
    //   89: ldc2_w 3.141592653589793
    //   92: ddiv
    //   93: d2f
    //   94: dup_x1
    //   95: putfield XHL : F
    //   98: putfield kGO : F
    //   101: aload_0
    //   102: getfield Dne : LQnq;
    //   105: aload_0
    //   106: getfield bzF : I
    //   109: aload_0
    //   110: getfield Qnq : I
    //   113: aload_0
    //   114: getfield Vxn : I
    //   117: invokevirtual Dne : (III)I
    //   120: istore_1
    //   121: iload_1
    //   122: ifle -> 212
    //   125: getstatic zKP.Dne : [LzKP;
    //   128: iload_1
    //   129: aaload
    //   130: aload_0
    //   131: getfield Dne : LQnq;
    //   134: aload_0
    //   135: getfield bzF : I
    //   138: aload_0
    //   139: getfield Qnq : I
    //   142: aload_0
    //   143: getfield Vxn : I
    //   146: invokevirtual Dne : (LZpi;III)V
    //   149: getstatic zKP.Dne : [LzKP;
    //   152: iload_1
    //   153: aaload
    //   154: aload_0
    //   155: getfield Dne : LQnq;
    //   158: aload_0
    //   159: getfield bzF : I
    //   162: aload_0
    //   163: getfield Qnq : I
    //   166: aload_0
    //   167: getfield Vxn : I
    //   170: invokevirtual Dne : (LQnq;III)LbSp;
    //   173: astore_2
    //   174: aload_2
    //   175: ifnull -> 212
    //   178: aload_2
    //   179: aload_0
    //   180: getfield Dne : LQnq;
    //   183: invokevirtual Dne : ()LziS;
    //   186: aload_0
    //   187: getfield div : D
    //   190: aload_0
    //   191: getfield IjH : D
    //   194: aload_0
    //   195: getfield mrb : D
    //   198: invokevirtual Dne : (DDD)LchN;
    //   201: invokevirtual Dne : (LchN;)Z
    //   204: ifeq -> 212
    //   207: aload_0
    //   208: iconst_1
    //   209: putfield Dne : Z
    //   212: aload_0
    //   213: getfield FWm : I
    //   216: ifle -> 229
    //   219: aload_0
    //   220: dup
    //   221: getfield FWm : I
    //   224: iconst_1
    //   225: isub
    //   226: putfield FWm : I
    //   229: aload_0
    //   230: getfield Dne : Z
    //   233: ifeq -> 397
    //   236: aload_0
    //   237: getfield Dne : LQnq;
    //   240: aload_0
    //   241: getfield bzF : I
    //   244: aload_0
    //   245: getfield Qnq : I
    //   248: aload_0
    //   249: getfield Vxn : I
    //   252: invokevirtual Dne : (III)I
    //   255: istore_2
    //   256: aload_0
    //   257: getfield Dne : LQnq;
    //   260: aload_0
    //   261: getfield bzF : I
    //   264: aload_0
    //   265: getfield Qnq : I
    //   268: aload_0
    //   269: getfield Vxn : I
    //   272: invokevirtual bzF : (III)I
    //   275: istore_3
    //   276: iload_2
    //   277: aload_0
    //   278: getfield ceE : I
    //   281: if_icmpne -> 319
    //   284: iload_3
    //   285: aload_0
    //   286: getfield EyB : I
    //   289: if_icmpne -> 319
    //   292: aload_0
    //   293: dup
    //   294: getfield FfS : I
    //   297: iconst_1
    //   298: iadd
    //   299: putfield FfS : I
    //   302: aload_0
    //   303: getfield FfS : I
    //   306: sipush #1200
    //   309: if_icmpne -> 394
    //   312: aload_0
    //   313: invokevirtual g_ : ()V
    //   316: goto -> 394
    //   319: aload_0
    //   320: iconst_0
    //   321: putfield Dne : Z
    //   324: aload_0
    //   325: dup
    //   326: getfield XHL : D
    //   329: aload_0
    //   330: getfield Dne : Ljava/util/Random;
    //   333: invokevirtual nextFloat : ()F
    //   336: ldc 0.2
    //   338: fmul
    //   339: f2d
    //   340: dmul
    //   341: putfield XHL : D
    //   344: aload_0
    //   345: dup
    //   346: getfield Zpi : D
    //   349: aload_0
    //   350: getfield Dne : Ljava/util/Random;
    //   353: invokevirtual nextFloat : ()F
    //   356: ldc 0.2
    //   358: fmul
    //   359: f2d
    //   360: dmul
    //   361: putfield Zpi : D
    //   364: aload_0
    //   365: dup
    //   366: getfield kGO : D
    //   369: aload_0
    //   370: getfield Dne : Ljava/util/Random;
    //   373: invokevirtual nextFloat : ()F
    //   376: ldc 0.2
    //   378: fmul
    //   379: f2d
    //   380: dmul
    //   381: putfield kGO : D
    //   384: aload_0
    //   385: iconst_0
    //   386: putfield FfS : I
    //   389: aload_0
    //   390: iconst_0
    //   391: putfield OdI : I
    //   394: goto -> 2177
    //   397: aload_0
    //   398: dup
    //   399: getfield OdI : I
    //   402: iconst_1
    //   403: iadd
    //   404: putfield OdI : I
    //   407: aload_0
    //   408: getfield Dne : LQnq;
    //   411: invokevirtual Dne : ()LziS;
    //   414: aload_0
    //   415: getfield div : D
    //   418: aload_0
    //   419: getfield IjH : D
    //   422: aload_0
    //   423: getfield mrb : D
    //   426: invokevirtual Dne : (DDD)LchN;
    //   429: astore_2
    //   430: aload_0
    //   431: getfield Dne : LQnq;
    //   434: invokevirtual Dne : ()LziS;
    //   437: aload_0
    //   438: getfield div : D
    //   441: aload_0
    //   442: getfield XHL : D
    //   445: dadd
    //   446: aload_0
    //   447: getfield IjH : D
    //   450: aload_0
    //   451: getfield Zpi : D
    //   454: dadd
    //   455: aload_0
    //   456: getfield mrb : D
    //   459: aload_0
    //   460: getfield kGO : D
    //   463: dadd
    //   464: invokevirtual Dne : (DDD)LchN;
    //   467: astore_3
    //   468: aload_0
    //   469: getfield Dne : LQnq;
    //   472: aload_2
    //   473: aload_3
    //   474: iconst_0
    //   475: iconst_1
    //   476: invokevirtual Dne : (LchN;LchN;ZZ)LwHH;
    //   479: astore #4
    //   481: aload_0
    //   482: getfield Dne : LQnq;
    //   485: invokevirtual Dne : ()LziS;
    //   488: aload_0
    //   489: getfield div : D
    //   492: aload_0
    //   493: getfield IjH : D
    //   496: aload_0
    //   497: getfield mrb : D
    //   500: invokevirtual Dne : (DDD)LchN;
    //   503: astore_2
    //   504: aload_0
    //   505: getfield Dne : LQnq;
    //   508: invokevirtual Dne : ()LziS;
    //   511: aload_0
    //   512: getfield div : D
    //   515: aload_0
    //   516: getfield XHL : D
    //   519: dadd
    //   520: aload_0
    //   521: getfield IjH : D
    //   524: aload_0
    //   525: getfield Zpi : D
    //   528: dadd
    //   529: aload_0
    //   530: getfield mrb : D
    //   533: aload_0
    //   534: getfield kGO : D
    //   537: dadd
    //   538: invokevirtual Dne : (DDD)LchN;
    //   541: astore_3
    //   542: aload #4
    //   544: ifnull -> 582
    //   547: aload_0
    //   548: getfield Dne : LQnq;
    //   551: invokevirtual Dne : ()LziS;
    //   554: aload #4
    //   556: getfield Dne : LchN;
    //   559: getfield Dne : D
    //   562: aload #4
    //   564: getfield Dne : LchN;
    //   567: getfield FWm : D
    //   570: aload #4
    //   572: getfield Dne : LchN;
    //   575: getfield bzF : D
    //   578: invokevirtual Dne : (DDD)LchN;
    //   581: astore_3
    //   582: aconst_null
    //   583: astore #5
    //   585: aload_0
    //   586: getfield Dne : LQnq;
    //   589: aload_0
    //   590: aload_0
    //   591: getfield Dne : LbSp;
    //   594: aload_0
    //   595: getfield XHL : D
    //   598: aload_0
    //   599: getfield Zpi : D
    //   602: aload_0
    //   603: getfield kGO : D
    //   606: invokevirtual Dne : (DDD)LbSp;
    //   609: dconst_1
    //   610: dconst_1
    //   611: dconst_1
    //   612: invokevirtual FWm : (DDD)LbSp;
    //   615: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   618: astore #6
    //   620: dconst_0
    //   621: dstore #7
    //   623: iconst_0
    //   624: istore #9
    //   626: iload #9
    //   628: aload #6
    //   630: invokeinterface size : ()I
    //   635: if_icmpge -> 755
    //   638: aload #6
    //   640: iload #9
    //   642: invokeinterface get : (I)Ljava/lang/Object;
    //   647: checkcast sMa
    //   650: astore #11
    //   652: aload #11
    //   654: invokevirtual kGO : ()Z
    //   657: ifeq -> 749
    //   660: aload #11
    //   662: aload_0
    //   663: getfield bzF : LsMa;
    //   666: if_acmpne -> 677
    //   669: aload_0
    //   670: getfield OdI : I
    //   673: iconst_5
    //   674: if_icmplt -> 749
    //   677: ldc_w 0.3
    //   680: fstore #10
    //   682: aload #11
    //   684: getfield Dne : LbSp;
    //   687: fload #10
    //   689: f2d
    //   690: fload #10
    //   692: f2d
    //   693: fload #10
    //   695: f2d
    //   696: invokevirtual FWm : (DDD)LbSp;
    //   699: astore #12
    //   701: aload #12
    //   703: aload_2
    //   704: aload_3
    //   705: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   708: astore #13
    //   710: aload #13
    //   712: ifnull -> 749
    //   715: aload_2
    //   716: aload #13
    //   718: getfield Dne : LchN;
    //   721: invokevirtual FWm : (LchN;)D
    //   724: dstore #14
    //   726: dload #14
    //   728: dload #7
    //   730: dcmpg
    //   731: iflt -> 741
    //   734: dload #7
    //   736: dconst_0
    //   737: dcmpl
    //   738: ifne -> 749
    //   741: aload #11
    //   743: astore #5
    //   745: dload #14
    //   747: dstore #7
    //   749: iinc #9, 1
    //   752: goto -> 626
    //   755: aload #5
    //   757: ifnull -> 771
    //   760: new wHH
    //   763: dup
    //   764: aload #5
    //   766: invokespecial <init> : (LsMa;)V
    //   769: astore #4
    //   771: aload #4
    //   773: ifnull -> 844
    //   776: aload #4
    //   778: getfield Dne : LsMa;
    //   781: ifnull -> 844
    //   784: aload #4
    //   786: getfield Dne : LsMa;
    //   789: instanceof FiG
    //   792: ifeq -> 844
    //   795: aload #4
    //   797: getfield Dne : LsMa;
    //   800: checkcast FiG
    //   803: astore #11
    //   805: aload #11
    //   807: getfield Dne : Luqg;
    //   810: getfield Dne : Z
    //   813: ifne -> 841
    //   816: aload_0
    //   817: getfield bzF : LsMa;
    //   820: instanceof FiG
    //   823: ifeq -> 844
    //   826: aload_0
    //   827: getfield bzF : LsMa;
    //   830: checkcast FiG
    //   833: aload #11
    //   835: invokevirtual Dne : (LFiG;)Z
    //   838: ifne -> 844
    //   841: aconst_null
    //   842: astore #4
    //   844: aload #4
    //   846: ifnull -> 1628
    //   849: aload #4
    //   851: getfield Dne : LsMa;
    //   854: ifnull -> 1324
    //   857: aload_0
    //   858: getfield XHL : D
    //   861: aload_0
    //   862: getfield XHL : D
    //   865: dmul
    //   866: aload_0
    //   867: getfield Zpi : D
    //   870: aload_0
    //   871: getfield Zpi : D
    //   874: dmul
    //   875: dadd
    //   876: aload_0
    //   877: getfield kGO : D
    //   880: aload_0
    //   881: getfield kGO : D
    //   884: dmul
    //   885: dadd
    //   886: invokestatic Dne : (D)F
    //   889: fstore #11
    //   891: fload #11
    //   893: f2d
    //   894: aload_0
    //   895: getfield Dne : D
    //   898: dmul
    //   899: invokestatic bzF : (D)I
    //   902: istore #13
    //   904: aload_0
    //   905: invokevirtual Qnq : ()Z
    //   908: ifeq -> 929
    //   911: iload #13
    //   913: aload_0
    //   914: getfield Dne : Ljava/util/Random;
    //   917: iload #13
    //   919: iconst_2
    //   920: idiv
    //   921: iconst_2
    //   922: iadd
    //   923: invokevirtual nextInt : (I)I
    //   926: iadd
    //   927: istore #13
    //   929: aconst_null
    //   930: astore #14
    //   932: aload_0
    //   933: getfield bzF : LsMa;
    //   936: ifnonnull -> 949
    //   939: aload_0
    //   940: aload_0
    //   941: invokestatic Dne : (Lhhc;LsMa;)LzBn;
    //   944: astore #14
    //   946: goto -> 959
    //   949: aload_0
    //   950: aload_0
    //   951: getfield bzF : LsMa;
    //   954: invokestatic Dne : (Lhhc;LsMa;)LzBn;
    //   957: astore #14
    //   959: aload_0
    //   960: invokevirtual trS : ()Z
    //   963: ifeq -> 986
    //   966: aload #4
    //   968: getfield Dne : LsMa;
    //   971: instanceof iGp
    //   974: ifne -> 986
    //   977: aload #4
    //   979: getfield Dne : LsMa;
    //   982: iconst_5
    //   983: invokevirtual aFZ : (I)V
    //   986: aload #4
    //   988: getfield Dne : LsMa;
    //   991: aload #14
    //   993: iload #13
    //   995: invokevirtual Dne : (LzBn;I)Z
    //   998: ifeq -> 1256
    //   1001: aload #4
    //   1003: getfield Dne : LsMa;
    //   1006: instanceof FUH
    //   1009: ifeq -> 1212
    //   1012: aload #4
    //   1014: getfield Dne : LsMa;
    //   1017: checkcast FUH
    //   1020: astore #15
    //   1022: aload_0
    //   1023: getfield Dne : LQnq;
    //   1026: getfield aFZ : Z
    //   1029: ifne -> 1044
    //   1032: aload #15
    //   1034: aload #15
    //   1036: invokevirtual trS : ()I
    //   1039: iconst_1
    //   1040: iadd
    //   1041: invokevirtual Zpi : (I)V
    //   1044: aload_0
    //   1045: getfield oIf : I
    //   1048: ifle -> 1129
    //   1051: aload_0
    //   1052: getfield XHL : D
    //   1055: aload_0
    //   1056: getfield XHL : D
    //   1059: dmul
    //   1060: aload_0
    //   1061: getfield kGO : D
    //   1064: aload_0
    //   1065: getfield kGO : D
    //   1068: dmul
    //   1069: dadd
    //   1070: invokestatic Dne : (D)F
    //   1073: fstore #12
    //   1075: fload #12
    //   1077: fconst_0
    //   1078: fcmpl
    //   1079: ifle -> 1129
    //   1082: aload #4
    //   1084: getfield Dne : LsMa;
    //   1087: aload_0
    //   1088: getfield XHL : D
    //   1091: aload_0
    //   1092: getfield oIf : I
    //   1095: i2d
    //   1096: dmul
    //   1097: ldc2_w 0.6000000238418579
    //   1100: dmul
    //   1101: fload #12
    //   1103: f2d
    //   1104: ddiv
    //   1105: ldc2_w 0.1
    //   1108: aload_0
    //   1109: getfield kGO : D
    //   1112: aload_0
    //   1113: getfield oIf : I
    //   1116: i2d
    //   1117: dmul
    //   1118: ldc2_w 0.6000000238418579
    //   1121: dmul
    //   1122: fload #12
    //   1124: f2d
    //   1125: ddiv
    //   1126: invokevirtual Qnq : (DDD)V
    //   1129: aload_0
    //   1130: getfield bzF : LsMa;
    //   1133: ifnull -> 1149
    //   1136: aload_0
    //   1137: getfield bzF : LsMa;
    //   1140: aload #15
    //   1142: aload_0
    //   1143: getfield Dne : Ljava/util/Random;
    //   1146: invokestatic Dne : (LsMa;LFUH;Ljava/util/Random;)V
    //   1149: aload_0
    //   1150: getfield bzF : LsMa;
    //   1153: ifnull -> 1212
    //   1156: aload #4
    //   1158: getfield Dne : LsMa;
    //   1161: aload_0
    //   1162: getfield bzF : LsMa;
    //   1165: if_acmpeq -> 1212
    //   1168: aload #4
    //   1170: getfield Dne : LsMa;
    //   1173: instanceof FiG
    //   1176: ifeq -> 1212
    //   1179: aload_0
    //   1180: getfield bzF : LsMa;
    //   1183: instanceof PJQ
    //   1186: ifeq -> 1212
    //   1189: aload_0
    //   1190: getfield bzF : LsMa;
    //   1193: checkcast PJQ
    //   1196: getfield Dne : LTnv;
    //   1199: new Tnn
    //   1202: dup
    //   1203: bipush #6
    //   1205: iconst_0
    //   1206: invokespecial <init> : (II)V
    //   1209: invokevirtual Dne : (LNER;)V
    //   1212: aload_0
    //   1213: ldc_w 'random.bowhit'
    //   1216: fconst_1
    //   1217: ldc_w 1.2
    //   1220: aload_0
    //   1221: getfield Dne : Ljava/util/Random;
    //   1224: invokevirtual nextFloat : ()F
    //   1227: ldc 0.2
    //   1229: fmul
    //   1230: ldc_w 0.9
    //   1233: fadd
    //   1234: fdiv
    //   1235: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   1238: aload #4
    //   1240: getfield Dne : LsMa;
    //   1243: instanceof iGp
    //   1246: ifne -> 1321
    //   1249: aload_0
    //   1250: invokevirtual g_ : ()V
    //   1253: goto -> 1321
    //   1256: aload_0
    //   1257: dup
    //   1258: getfield XHL : D
    //   1261: ldc2_w -0.10000000149011612
    //   1264: dmul
    //   1265: putfield XHL : D
    //   1268: aload_0
    //   1269: dup
    //   1270: getfield Zpi : D
    //   1273: ldc2_w -0.10000000149011612
    //   1276: dmul
    //   1277: putfield Zpi : D
    //   1280: aload_0
    //   1281: dup
    //   1282: getfield kGO : D
    //   1285: ldc2_w -0.10000000149011612
    //   1288: dmul
    //   1289: putfield kGO : D
    //   1292: aload_0
    //   1293: dup
    //   1294: getfield mrb : F
    //   1297: ldc_w 180.0
    //   1300: fadd
    //   1301: putfield mrb : F
    //   1304: aload_0
    //   1305: dup
    //   1306: getfield Zpi : F
    //   1309: ldc_w 180.0
    //   1312: fadd
    //   1313: putfield Zpi : F
    //   1316: aload_0
    //   1317: iconst_0
    //   1318: putfield OdI : I
    //   1321: goto -> 1628
    //   1324: aload_0
    //   1325: aload #4
    //   1327: getfield Dne : I
    //   1330: putfield bzF : I
    //   1333: aload_0
    //   1334: aload #4
    //   1336: getfield FWm : I
    //   1339: putfield Qnq : I
    //   1342: aload_0
    //   1343: aload #4
    //   1345: getfield bzF : I
    //   1348: putfield Vxn : I
    //   1351: aload_0
    //   1352: aload_0
    //   1353: getfield Dne : LQnq;
    //   1356: aload_0
    //   1357: getfield bzF : I
    //   1360: aload_0
    //   1361: getfield Qnq : I
    //   1364: aload_0
    //   1365: getfield Vxn : I
    //   1368: invokevirtual Dne : (III)I
    //   1371: putfield ceE : I
    //   1374: aload_0
    //   1375: aload_0
    //   1376: getfield Dne : LQnq;
    //   1379: aload_0
    //   1380: getfield bzF : I
    //   1383: aload_0
    //   1384: getfield Qnq : I
    //   1387: aload_0
    //   1388: getfield Vxn : I
    //   1391: invokevirtual bzF : (III)I
    //   1394: putfield EyB : I
    //   1397: aload_0
    //   1398: aload #4
    //   1400: getfield Dne : LchN;
    //   1403: getfield Dne : D
    //   1406: aload_0
    //   1407: getfield div : D
    //   1410: dsub
    //   1411: d2f
    //   1412: f2d
    //   1413: putfield XHL : D
    //   1416: aload_0
    //   1417: aload #4
    //   1419: getfield Dne : LchN;
    //   1422: getfield FWm : D
    //   1425: aload_0
    //   1426: getfield IjH : D
    //   1429: dsub
    //   1430: d2f
    //   1431: f2d
    //   1432: putfield Zpi : D
    //   1435: aload_0
    //   1436: aload #4
    //   1438: getfield Dne : LchN;
    //   1441: getfield bzF : D
    //   1444: aload_0
    //   1445: getfield mrb : D
    //   1448: dsub
    //   1449: d2f
    //   1450: f2d
    //   1451: putfield kGO : D
    //   1454: aload_0
    //   1455: getfield XHL : D
    //   1458: aload_0
    //   1459: getfield XHL : D
    //   1462: dmul
    //   1463: aload_0
    //   1464: getfield Zpi : D
    //   1467: aload_0
    //   1468: getfield Zpi : D
    //   1471: dmul
    //   1472: dadd
    //   1473: aload_0
    //   1474: getfield kGO : D
    //   1477: aload_0
    //   1478: getfield kGO : D
    //   1481: dmul
    //   1482: dadd
    //   1483: invokestatic Dne : (D)F
    //   1486: fstore #11
    //   1488: aload_0
    //   1489: dup
    //   1490: getfield div : D
    //   1493: aload_0
    //   1494: getfield XHL : D
    //   1497: fload #11
    //   1499: f2d
    //   1500: ddiv
    //   1501: ldc2_w 0.05000000074505806
    //   1504: dmul
    //   1505: dsub
    //   1506: putfield div : D
    //   1509: aload_0
    //   1510: dup
    //   1511: getfield IjH : D
    //   1514: aload_0
    //   1515: getfield Zpi : D
    //   1518: fload #11
    //   1520: f2d
    //   1521: ddiv
    //   1522: ldc2_w 0.05000000074505806
    //   1525: dmul
    //   1526: dsub
    //   1527: putfield IjH : D
    //   1530: aload_0
    //   1531: dup
    //   1532: getfield mrb : D
    //   1535: aload_0
    //   1536: getfield kGO : D
    //   1539: fload #11
    //   1541: f2d
    //   1542: ddiv
    //   1543: ldc2_w 0.05000000074505806
    //   1546: dmul
    //   1547: dsub
    //   1548: putfield mrb : D
    //   1551: aload_0
    //   1552: ldc_w 'random.bowhit'
    //   1555: fconst_1
    //   1556: ldc_w 1.2
    //   1559: aload_0
    //   1560: getfield Dne : Ljava/util/Random;
    //   1563: invokevirtual nextFloat : ()F
    //   1566: ldc 0.2
    //   1568: fmul
    //   1569: ldc_w 0.9
    //   1572: fadd
    //   1573: fdiv
    //   1574: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   1577: aload_0
    //   1578: iconst_1
    //   1579: putfield Dne : Z
    //   1582: aload_0
    //   1583: bipush #7
    //   1585: putfield FWm : I
    //   1588: aload_0
    //   1589: iconst_0
    //   1590: invokevirtual FWm : (Z)V
    //   1593: aload_0
    //   1594: getfield ceE : I
    //   1597: ifeq -> 1628
    //   1600: getstatic zKP.Dne : [LzKP;
    //   1603: aload_0
    //   1604: getfield ceE : I
    //   1607: aaload
    //   1608: aload_0
    //   1609: getfield Dne : LQnq;
    //   1612: aload_0
    //   1613: getfield bzF : I
    //   1616: aload_0
    //   1617: getfield Qnq : I
    //   1620: aload_0
    //   1621: getfield Vxn : I
    //   1624: aload_0
    //   1625: invokevirtual Dne : (LQnq;IIILsMa;)V
    //   1628: aload_0
    //   1629: invokevirtual Qnq : ()Z
    //   1632: ifeq -> 1730
    //   1635: iconst_0
    //   1636: istore #9
    //   1638: iload #9
    //   1640: iconst_4
    //   1641: if_icmpge -> 1730
    //   1644: aload_0
    //   1645: getfield Dne : LQnq;
    //   1648: ldc_w 'crit'
    //   1651: aload_0
    //   1652: getfield div : D
    //   1655: aload_0
    //   1656: getfield XHL : D
    //   1659: iload #9
    //   1661: i2d
    //   1662: dmul
    //   1663: ldc2_w 4.0
    //   1666: ddiv
    //   1667: dadd
    //   1668: aload_0
    //   1669: getfield IjH : D
    //   1672: aload_0
    //   1673: getfield Zpi : D
    //   1676: iload #9
    //   1678: i2d
    //   1679: dmul
    //   1680: ldc2_w 4.0
    //   1683: ddiv
    //   1684: dadd
    //   1685: aload_0
    //   1686: getfield mrb : D
    //   1689: aload_0
    //   1690: getfield kGO : D
    //   1693: iload #9
    //   1695: i2d
    //   1696: dmul
    //   1697: ldc2_w 4.0
    //   1700: ddiv
    //   1701: dadd
    //   1702: aload_0
    //   1703: getfield XHL : D
    //   1706: dneg
    //   1707: aload_0
    //   1708: getfield Zpi : D
    //   1711: dneg
    //   1712: ldc2_w 0.2
    //   1715: dadd
    //   1716: aload_0
    //   1717: getfield kGO : D
    //   1720: dneg
    //   1721: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   1724: iinc #9, 1
    //   1727: goto -> 1638
    //   1730: aload_0
    //   1731: dup
    //   1732: getfield div : D
    //   1735: aload_0
    //   1736: getfield XHL : D
    //   1739: dadd
    //   1740: putfield div : D
    //   1743: aload_0
    //   1744: dup
    //   1745: getfield IjH : D
    //   1748: aload_0
    //   1749: getfield Zpi : D
    //   1752: dadd
    //   1753: putfield IjH : D
    //   1756: aload_0
    //   1757: dup
    //   1758: getfield mrb : D
    //   1761: aload_0
    //   1762: getfield kGO : D
    //   1765: dadd
    //   1766: putfield mrb : D
    //   1769: aload_0
    //   1770: getfield XHL : D
    //   1773: aload_0
    //   1774: getfield XHL : D
    //   1777: dmul
    //   1778: aload_0
    //   1779: getfield kGO : D
    //   1782: aload_0
    //   1783: getfield kGO : D
    //   1786: dmul
    //   1787: dadd
    //   1788: invokestatic Dne : (D)F
    //   1791: fstore #11
    //   1793: aload_0
    //   1794: aload_0
    //   1795: getfield XHL : D
    //   1798: aload_0
    //   1799: getfield kGO : D
    //   1802: invokestatic atan2 : (DD)D
    //   1805: ldc2_w 180.0
    //   1808: dmul
    //   1809: ldc2_w 3.141592653589793
    //   1812: ddiv
    //   1813: d2f
    //   1814: putfield mrb : F
    //   1817: aload_0
    //   1818: aload_0
    //   1819: getfield Zpi : D
    //   1822: fload #11
    //   1824: f2d
    //   1825: invokestatic atan2 : (DD)D
    //   1828: ldc2_w 180.0
    //   1831: dmul
    //   1832: ldc2_w 3.141592653589793
    //   1835: ddiv
    //   1836: d2f
    //   1837: putfield XHL : F
    //   1840: aload_0
    //   1841: getfield XHL : F
    //   1844: aload_0
    //   1845: getfield kGO : F
    //   1848: fsub
    //   1849: ldc_w -180.0
    //   1852: fcmpg
    //   1853: ifge -> 1871
    //   1856: aload_0
    //   1857: dup
    //   1858: getfield kGO : F
    //   1861: ldc_w 360.0
    //   1864: fsub
    //   1865: putfield kGO : F
    //   1868: goto -> 1840
    //   1871: aload_0
    //   1872: getfield XHL : F
    //   1875: aload_0
    //   1876: getfield kGO : F
    //   1879: fsub
    //   1880: ldc_w 180.0
    //   1883: fcmpl
    //   1884: iflt -> 1902
    //   1887: aload_0
    //   1888: dup
    //   1889: getfield kGO : F
    //   1892: ldc_w 360.0
    //   1895: fadd
    //   1896: putfield kGO : F
    //   1899: goto -> 1871
    //   1902: aload_0
    //   1903: getfield mrb : F
    //   1906: aload_0
    //   1907: getfield Zpi : F
    //   1910: fsub
    //   1911: ldc_w -180.0
    //   1914: fcmpg
    //   1915: ifge -> 1933
    //   1918: aload_0
    //   1919: dup
    //   1920: getfield Zpi : F
    //   1923: ldc_w 360.0
    //   1926: fsub
    //   1927: putfield Zpi : F
    //   1930: goto -> 1902
    //   1933: aload_0
    //   1934: getfield mrb : F
    //   1937: aload_0
    //   1938: getfield Zpi : F
    //   1941: fsub
    //   1942: ldc_w 180.0
    //   1945: fcmpl
    //   1946: iflt -> 1964
    //   1949: aload_0
    //   1950: dup
    //   1951: getfield Zpi : F
    //   1954: ldc_w 360.0
    //   1957: fadd
    //   1958: putfield Zpi : F
    //   1961: goto -> 1933
    //   1964: aload_0
    //   1965: aload_0
    //   1966: getfield kGO : F
    //   1969: aload_0
    //   1970: getfield XHL : F
    //   1973: aload_0
    //   1974: getfield kGO : F
    //   1977: fsub
    //   1978: ldc 0.2
    //   1980: fmul
    //   1981: fadd
    //   1982: putfield XHL : F
    //   1985: aload_0
    //   1986: aload_0
    //   1987: getfield Zpi : F
    //   1990: aload_0
    //   1991: getfield mrb : F
    //   1994: aload_0
    //   1995: getfield Zpi : F
    //   1998: fsub
    //   1999: ldc 0.2
    //   2001: fmul
    //   2002: fadd
    //   2003: putfield mrb : F
    //   2006: ldc_w 0.99
    //   2009: fstore #13
    //   2011: ldc_w 0.05
    //   2014: fstore #10
    //   2016: aload_0
    //   2017: invokevirtual Zpi : ()Z
    //   2020: ifeq -> 2109
    //   2023: iconst_0
    //   2024: istore #14
    //   2026: iload #14
    //   2028: iconst_4
    //   2029: if_icmpge -> 2104
    //   2032: ldc_w 0.25
    //   2035: fstore #12
    //   2037: aload_0
    //   2038: getfield Dne : LQnq;
    //   2041: ldc_w 'bubble'
    //   2044: aload_0
    //   2045: getfield div : D
    //   2048: aload_0
    //   2049: getfield XHL : D
    //   2052: fload #12
    //   2054: f2d
    //   2055: dmul
    //   2056: dsub
    //   2057: aload_0
    //   2058: getfield IjH : D
    //   2061: aload_0
    //   2062: getfield Zpi : D
    //   2065: fload #12
    //   2067: f2d
    //   2068: dmul
    //   2069: dsub
    //   2070: aload_0
    //   2071: getfield mrb : D
    //   2074: aload_0
    //   2075: getfield kGO : D
    //   2078: fload #12
    //   2080: f2d
    //   2081: dmul
    //   2082: dsub
    //   2083: aload_0
    //   2084: getfield XHL : D
    //   2087: aload_0
    //   2088: getfield Zpi : D
    //   2091: aload_0
    //   2092: getfield kGO : D
    //   2095: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   2098: iinc #14, 1
    //   2101: goto -> 2026
    //   2104: ldc_w 0.8
    //   2107: fstore #13
    //   2109: aload_0
    //   2110: dup
    //   2111: getfield XHL : D
    //   2114: fload #13
    //   2116: f2d
    //   2117: dmul
    //   2118: putfield XHL : D
    //   2121: aload_0
    //   2122: dup
    //   2123: getfield Zpi : D
    //   2126: fload #13
    //   2128: f2d
    //   2129: dmul
    //   2130: putfield Zpi : D
    //   2133: aload_0
    //   2134: dup
    //   2135: getfield kGO : D
    //   2138: fload #13
    //   2140: f2d
    //   2141: dmul
    //   2142: putfield kGO : D
    //   2145: aload_0
    //   2146: dup
    //   2147: getfield Zpi : D
    //   2150: fload #10
    //   2152: f2d
    //   2153: dsub
    //   2154: putfield Zpi : D
    //   2157: aload_0
    //   2158: aload_0
    //   2159: getfield div : D
    //   2162: aload_0
    //   2163: getfield IjH : D
    //   2166: aload_0
    //   2167: getfield mrb : D
    //   2170: invokevirtual bzF : (DDD)V
    //   2173: aload_0
    //   2174: invokevirtual OdI : ()V
    //   2177: return
  }
  
  public hhc(Qnq paramQnq, FUH paramFUH, float paramFloat) {
    super(paramQnq);
    this.Dne = false;
    this.FWm = 0;
    this.OdI = 0;
    this.Dne = 2.0D;
    this.Qnq = 10.0D;
    this.bzF = paramFUH;
    if (paramFUH instanceof FiG)
      this.Dne = true; 
    Dne(0.5F, 0.5F);
    FWm(paramFUH.div, paramFUH.IjH + paramFUH.c_(), paramFUH.mrb, paramFUH.mrb, paramFUH.XHL);
    this.div -= (geR.FWm(this.mrb / 180.0F * 3.1415927F) * 0.16F);
    this.IjH -= 0.10000000149011612D;
    this.mrb -= (geR.Dne(this.mrb / 180.0F * 3.1415927F) * 0.16F);
    bzF(this.div, this.IjH, this.mrb);
    this.udO = 0.0F;
    this.XHL = (-geR.Dne(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F));
    this.kGO = (geR.FWm(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F));
    this.Zpi = -geR.Dne(this.XHL / 180.0F * 3.1415927F);
    bzF(this.XHL, this.Zpi, this.kGO, paramFloat * 1.5F, 1.0F);
  }
  
  public void Dne(int paramInt) {
    this.oIf = paramInt;
  }
  
  public void bzF(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: dload_1
    //   1: dload_1
    //   2: dmul
    //   3: dload_3
    //   4: dload_3
    //   5: dmul
    //   6: dadd
    //   7: dload #5
    //   9: dload #5
    //   11: dmul
    //   12: dadd
    //   13: invokestatic Dne : (D)F
    //   16: fstore #9
    //   18: dload_1
    //   19: fload #9
    //   21: f2d
    //   22: ddiv
    //   23: dstore_1
    //   24: dload_3
    //   25: fload #9
    //   27: f2d
    //   28: ddiv
    //   29: dstore_3
    //   30: dload #5
    //   32: fload #9
    //   34: f2d
    //   35: ddiv
    //   36: dstore #5
    //   38: dload_1
    //   39: aload_0
    //   40: getfield Dne : Ljava/util/Random;
    //   43: invokevirtual nextGaussian : ()D
    //   46: aload_0
    //   47: getfield Dne : Ljava/util/Random;
    //   50: invokevirtual nextBoolean : ()Z
    //   53: ifeq -> 60
    //   56: iconst_m1
    //   57: goto -> 61
    //   60: iconst_1
    //   61: i2d
    //   62: dmul
    //   63: ldc2_w 0.007499999832361937
    //   66: dmul
    //   67: fload #8
    //   69: f2d
    //   70: dmul
    //   71: dadd
    //   72: dstore_1
    //   73: dload_3
    //   74: aload_0
    //   75: getfield Dne : Ljava/util/Random;
    //   78: invokevirtual nextGaussian : ()D
    //   81: aload_0
    //   82: getfield Dne : Ljava/util/Random;
    //   85: invokevirtual nextBoolean : ()Z
    //   88: ifeq -> 95
    //   91: iconst_m1
    //   92: goto -> 96
    //   95: iconst_1
    //   96: i2d
    //   97: dmul
    //   98: ldc2_w 0.007499999832361937
    //   101: dmul
    //   102: fload #8
    //   104: f2d
    //   105: dmul
    //   106: dadd
    //   107: dstore_3
    //   108: dload #5
    //   110: aload_0
    //   111: getfield Dne : Ljava/util/Random;
    //   114: invokevirtual nextGaussian : ()D
    //   117: aload_0
    //   118: getfield Dne : Ljava/util/Random;
    //   121: invokevirtual nextBoolean : ()Z
    //   124: ifeq -> 131
    //   127: iconst_m1
    //   128: goto -> 132
    //   131: iconst_1
    //   132: i2d
    //   133: dmul
    //   134: ldc2_w 0.007499999832361937
    //   137: dmul
    //   138: fload #8
    //   140: f2d
    //   141: dmul
    //   142: dadd
    //   143: dstore #5
    //   145: dload_1
    //   146: fload #7
    //   148: f2d
    //   149: dmul
    //   150: dstore_1
    //   151: dload_3
    //   152: fload #7
    //   154: f2d
    //   155: dmul
    //   156: dstore_3
    //   157: dload #5
    //   159: fload #7
    //   161: f2d
    //   162: dmul
    //   163: dstore #5
    //   165: aload_0
    //   166: dload_1
    //   167: putfield XHL : D
    //   170: aload_0
    //   171: dload_3
    //   172: putfield Zpi : D
    //   175: aload_0
    //   176: dload #5
    //   178: putfield kGO : D
    //   181: dload_1
    //   182: dload_1
    //   183: dmul
    //   184: dload #5
    //   186: dload #5
    //   188: dmul
    //   189: dadd
    //   190: invokestatic Dne : (D)F
    //   193: fstore #10
    //   195: aload_0
    //   196: aload_0
    //   197: dload_1
    //   198: dload #5
    //   200: invokestatic atan2 : (DD)D
    //   203: ldc2_w 180.0
    //   206: dmul
    //   207: ldc2_w 3.141592653589793
    //   210: ddiv
    //   211: d2f
    //   212: dup_x1
    //   213: putfield mrb : F
    //   216: putfield Zpi : F
    //   219: aload_0
    //   220: aload_0
    //   221: dload_3
    //   222: fload #10
    //   224: f2d
    //   225: invokestatic atan2 : (DD)D
    //   228: ldc2_w 180.0
    //   231: dmul
    //   232: ldc2_w 3.141592653589793
    //   235: ddiv
    //   236: d2f
    //   237: dup_x1
    //   238: putfield XHL : F
    //   241: putfield kGO : F
    //   244: aload_0
    //   245: iconst_0
    //   246: putfield FfS : I
    //   249: return
  }
  
  public void FWm(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: istore_2
    //   10: iload_1
    //   11: ifeq -> 33
    //   14: aload_0
    //   15: getfield Dne : LluM;
    //   18: bipush #16
    //   20: iload_2
    //   21: iconst_1
    //   22: ior
    //   23: i2b
    //   24: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   27: invokevirtual FWm : (ILjava/lang/Object;)V
    //   30: goto -> 50
    //   33: aload_0
    //   34: getfield Dne : LluM;
    //   37: bipush #16
    //   39: iload_2
    //   40: bipush #-2
    //   42: iand
    //   43: i2b
    //   44: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   47: invokevirtual FWm : (ILjava/lang/Object;)V
    //   50: return
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
    bzF(paramDouble1, paramDouble2, paramDouble3);
    FWm(paramFloat1, paramFloat2);
  }
  
  public void aFZ(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.XHL = paramDouble1;
    this.Zpi = paramDouble2;
    this.kGO = paramDouble3;
    if (this.kGO == 0.0F && this.Zpi == 0.0F) {
      float f = geR.Dne(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
      this.Zpi = this.mrb = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / Math.PI);
      this.kGO = this.XHL = (float)(Math.atan2(paramDouble2, f) * 180.0D / Math.PI);
      this.kGO = this.XHL;
      this.Zpi = this.mrb;
      FWm(this.div, this.IjH, this.mrb, this.mrb, this.XHL);
      this.FfS = 0;
    } 
  }
  
  public void a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 133
    //   10: aload_0
    //   11: getfield Dne : Z
    //   14: ifeq -> 133
    //   17: aload_0
    //   18: getfield FWm : I
    //   21: ifgt -> 133
    //   24: aload_0
    //   25: getfield Dne : I
    //   28: iconst_1
    //   29: if_icmpeq -> 50
    //   32: aload_0
    //   33: getfield Dne : I
    //   36: iconst_2
    //   37: if_icmpne -> 54
    //   40: aload_1
    //   41: getfield Dne : Luqg;
    //   44: getfield Qnq : Z
    //   47: ifeq -> 54
    //   50: iconst_1
    //   51: goto -> 55
    //   54: iconst_0
    //   55: istore_2
    //   56: aload_0
    //   57: getfield Dne : I
    //   60: iconst_1
    //   61: if_icmpne -> 87
    //   64: aload_1
    //   65: getfield Dne : LMOS;
    //   68: new NMq
    //   71: dup
    //   72: getstatic dEr.zGp : LdEr;
    //   75: iconst_1
    //   76: invokespecial <init> : (LdEr;I)V
    //   79: invokevirtual Dne : (LNMq;)Z
    //   82: ifne -> 87
    //   85: iconst_0
    //   86: istore_2
    //   87: iload_2
    //   88: ifeq -> 133
    //   91: aload_0
    //   92: ldc_w 'random.pop'
    //   95: ldc 0.2
    //   97: aload_0
    //   98: getfield Dne : Ljava/util/Random;
    //   101: invokevirtual nextFloat : ()F
    //   104: aload_0
    //   105: getfield Dne : Ljava/util/Random;
    //   108: invokevirtual nextFloat : ()F
    //   111: fsub
    //   112: ldc_w 0.7
    //   115: fmul
    //   116: fconst_1
    //   117: fadd
    //   118: fconst_2
    //   119: fmul
    //   120: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   123: aload_1
    //   124: aload_0
    //   125: iconst_1
    //   126: invokevirtual Dne : (LsMa;I)V
    //   129: aload_0
    //   130: invokevirtual g_ : ()V
    //   133: return
  }
  
  protected boolean FWm() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hhc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */