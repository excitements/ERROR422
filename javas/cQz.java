public class cQz extends sMa {
  public sMa bzF;
  
  private double Vxn;
  
  private int Qnq = -1;
  
  private double qLR;
  
  private double EyB;
  
  private double bzF;
  
  private int bzF = -1;
  
  private int Vxn = 0;
  
  private double ceE;
  
  private int FWm;
  
  private int EyB;
  
  private int FfS;
  
  private double FWm = -1;
  
  private boolean Dne;
  
  private double Dne;
  
  public FiG Dne;
  
  private int ceE;
  
  private double ATE;
  
  private int OdI;
  
  public int Dne = 0;
  
  public cQz(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = 0;
    this.EyB = 0;
    this.FfS = 0;
    this.bzF = null;
    Dne(0.25F, 0.25F);
    this.qLR = true;
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifeq -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: iconst_0
    //   13: istore_1
    //   14: aload_0
    //   15: getfield bzF : LsMa;
    //   18: ifnull -> 154
    //   21: aload_0
    //   22: getfield Dne : LFiG;
    //   25: getfield div : D
    //   28: aload_0
    //   29: getfield div : D
    //   32: dsub
    //   33: dstore_2
    //   34: aload_0
    //   35: getfield Dne : LFiG;
    //   38: getfield IjH : D
    //   41: aload_0
    //   42: getfield IjH : D
    //   45: dsub
    //   46: dstore #4
    //   48: aload_0
    //   49: getfield Dne : LFiG;
    //   52: getfield mrb : D
    //   55: aload_0
    //   56: getfield mrb : D
    //   59: dsub
    //   60: dstore #6
    //   62: dload_2
    //   63: dload_2
    //   64: dmul
    //   65: dload #4
    //   67: dload #4
    //   69: dmul
    //   70: dadd
    //   71: dload #6
    //   73: dload #6
    //   75: dmul
    //   76: dadd
    //   77: invokestatic Dne : (D)F
    //   80: f2d
    //   81: dstore #8
    //   83: ldc2_w 0.1
    //   86: dstore #10
    //   88: aload_0
    //   89: getfield bzF : LsMa;
    //   92: dup
    //   93: getfield XHL : D
    //   96: dload_2
    //   97: dload #10
    //   99: dmul
    //   100: dadd
    //   101: putfield XHL : D
    //   104: aload_0
    //   105: getfield bzF : LsMa;
    //   108: dup
    //   109: getfield Zpi : D
    //   112: dload #4
    //   114: dload #10
    //   116: dmul
    //   117: dload #8
    //   119: invokestatic Dne : (D)F
    //   122: f2d
    //   123: ldc2_w 0.08
    //   126: dmul
    //   127: dadd
    //   128: dadd
    //   129: putfield Zpi : D
    //   132: aload_0
    //   133: getfield bzF : LsMa;
    //   136: dup
    //   137: getfield kGO : D
    //   140: dload #6
    //   142: dload #10
    //   144: dmul
    //   145: dadd
    //   146: putfield kGO : D
    //   149: iconst_3
    //   150: istore_1
    //   151: goto -> 386
    //   154: aload_0
    //   155: getfield FfS : I
    //   158: ifle -> 386
    //   161: new JiM
    //   164: dup
    //   165: aload_0
    //   166: getfield Dne : LQnq;
    //   169: aload_0
    //   170: getfield div : D
    //   173: aload_0
    //   174: getfield IjH : D
    //   177: aload_0
    //   178: getfield mrb : D
    //   181: new NMq
    //   184: dup
    //   185: getstatic dEr.Zlx : LdEr;
    //   188: invokespecial <init> : (LdEr;)V
    //   191: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   194: astore_2
    //   195: aload_0
    //   196: getfield Dne : LFiG;
    //   199: getfield div : D
    //   202: aload_0
    //   203: getfield div : D
    //   206: dsub
    //   207: dstore_3
    //   208: aload_0
    //   209: getfield Dne : LFiG;
    //   212: getfield IjH : D
    //   215: aload_0
    //   216: getfield IjH : D
    //   219: dsub
    //   220: dstore #5
    //   222: aload_0
    //   223: getfield Dne : LFiG;
    //   226: getfield mrb : D
    //   229: aload_0
    //   230: getfield mrb : D
    //   233: dsub
    //   234: dstore #7
    //   236: dload_3
    //   237: dload_3
    //   238: dmul
    //   239: dload #5
    //   241: dload #5
    //   243: dmul
    //   244: dadd
    //   245: dload #7
    //   247: dload #7
    //   249: dmul
    //   250: dadd
    //   251: invokestatic Dne : (D)F
    //   254: f2d
    //   255: dstore #9
    //   257: ldc2_w 0.1
    //   260: dstore #11
    //   262: aload_2
    //   263: dload_3
    //   264: dload #11
    //   266: dmul
    //   267: putfield XHL : D
    //   270: aload_2
    //   271: dload #5
    //   273: dload #11
    //   275: dmul
    //   276: dload #9
    //   278: invokestatic Dne : (D)F
    //   281: f2d
    //   282: ldc2_w 0.08
    //   285: dmul
    //   286: dadd
    //   287: putfield Zpi : D
    //   290: aload_2
    //   291: dload #7
    //   293: dload #11
    //   295: dmul
    //   296: putfield kGO : D
    //   299: aload_0
    //   300: getfield Dne : LQnq;
    //   303: aload_2
    //   304: invokevirtual FWm : (LsMa;)Z
    //   307: pop
    //   308: aload_0
    //   309: getfield Dne : LFiG;
    //   312: getstatic trP.OdI : LRLC;
    //   315: iconst_1
    //   316: invokevirtual Dne : (LRLC;I)V
    //   319: aload_0
    //   320: getfield Dne : LFiG;
    //   323: getfield Dne : LQnq;
    //   326: new alg
    //   329: dup
    //   330: aload_0
    //   331: getfield Dne : LFiG;
    //   334: getfield Dne : LQnq;
    //   337: aload_0
    //   338: getfield Dne : LFiG;
    //   341: getfield div : D
    //   344: aload_0
    //   345: getfield Dne : LFiG;
    //   348: getfield IjH : D
    //   351: ldc2_w 0.5
    //   354: dadd
    //   355: aload_0
    //   356: getfield Dne : LFiG;
    //   359: getfield mrb : D
    //   362: ldc2_w 0.5
    //   365: dadd
    //   366: aload_0
    //   367: getfield Dne : Ljava/util/Random;
    //   370: bipush #6
    //   372: invokevirtual nextInt : (I)I
    //   375: iconst_1
    //   376: iadd
    //   377: invokespecial <init> : (LQnq;DDDI)V
    //   380: invokevirtual FWm : (LsMa;)Z
    //   383: pop
    //   384: iconst_1
    //   385: istore_1
    //   386: aload_0
    //   387: getfield Dne : Z
    //   390: ifeq -> 395
    //   393: iconst_2
    //   394: istore_1
    //   395: aload_0
    //   396: invokevirtual g_ : ()V
    //   399: aload_0
    //   400: getfield Dne : LFiG;
    //   403: aconst_null
    //   404: putfield Dne : LcQz;
    //   407: iload_1
    //   408: ireturn
  }
  
  public cQz(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, FiG paramFiG) {
    this(paramQnq);
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.qLR = true;
    this.Dne = paramFiG;
    paramFiG.Dne = (Pdb)this;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: getfield OdI : I
    //   8: ifle -> 169
    //   11: aload_0
    //   12: getfield div : D
    //   15: aload_0
    //   16: getfield Dne : D
    //   19: aload_0
    //   20: getfield div : D
    //   23: dsub
    //   24: aload_0
    //   25: getfield OdI : I
    //   28: i2d
    //   29: ddiv
    //   30: dadd
    //   31: dstore_1
    //   32: aload_0
    //   33: getfield IjH : D
    //   36: aload_0
    //   37: getfield FWm : D
    //   40: aload_0
    //   41: getfield IjH : D
    //   44: dsub
    //   45: aload_0
    //   46: getfield OdI : I
    //   49: i2d
    //   50: ddiv
    //   51: dadd
    //   52: dstore_3
    //   53: aload_0
    //   54: getfield mrb : D
    //   57: aload_0
    //   58: getfield bzF : D
    //   61: aload_0
    //   62: getfield mrb : D
    //   65: dsub
    //   66: aload_0
    //   67: getfield OdI : I
    //   70: i2d
    //   71: ddiv
    //   72: dadd
    //   73: dstore #5
    //   75: aload_0
    //   76: getfield qLR : D
    //   79: aload_0
    //   80: getfield mrb : F
    //   83: f2d
    //   84: dsub
    //   85: invokestatic Dne : (D)D
    //   88: dstore #7
    //   90: aload_0
    //   91: aload_0
    //   92: getfield mrb : F
    //   95: f2d
    //   96: dload #7
    //   98: aload_0
    //   99: getfield OdI : I
    //   102: i2d
    //   103: ddiv
    //   104: dadd
    //   105: d2f
    //   106: putfield mrb : F
    //   109: aload_0
    //   110: aload_0
    //   111: getfield XHL : F
    //   114: f2d
    //   115: aload_0
    //   116: getfield ATE : D
    //   119: aload_0
    //   120: getfield XHL : F
    //   123: f2d
    //   124: dsub
    //   125: aload_0
    //   126: getfield OdI : I
    //   129: i2d
    //   130: ddiv
    //   131: dadd
    //   132: d2f
    //   133: putfield XHL : F
    //   136: aload_0
    //   137: dup
    //   138: getfield OdI : I
    //   141: iconst_1
    //   142: isub
    //   143: putfield OdI : I
    //   146: aload_0
    //   147: dload_1
    //   148: dload_3
    //   149: dload #5
    //   151: invokevirtual bzF : (DDD)V
    //   154: aload_0
    //   155: aload_0
    //   156: getfield mrb : F
    //   159: aload_0
    //   160: getfield XHL : F
    //   163: invokevirtual FWm : (FF)V
    //   166: goto -> 1870
    //   169: aload_0
    //   170: getfield Dne : LQnq;
    //   173: getfield aFZ : Z
    //   176: ifne -> 321
    //   179: aload_0
    //   180: getfield Dne : LFiG;
    //   183: invokevirtual bzF : ()LNMq;
    //   186: astore_1
    //   187: aload_0
    //   188: getfield Dne : LFiG;
    //   191: getfield Zpi : Z
    //   194: ifne -> 236
    //   197: aload_0
    //   198: getfield Dne : LFiG;
    //   201: invokevirtual udO : ()Z
    //   204: ifeq -> 236
    //   207: aload_1
    //   208: ifnull -> 236
    //   211: aload_1
    //   212: invokevirtual Dne : ()LdEr;
    //   215: getstatic dEr.Dne : LucN;
    //   218: if_acmpne -> 236
    //   221: aload_0
    //   222: aload_0
    //   223: getfield Dne : LFiG;
    //   226: invokevirtual Dne : (LsMa;)D
    //   229: ldc2_w 1024.0
    //   232: dcmpl
    //   233: ifle -> 249
    //   236: aload_0
    //   237: invokevirtual g_ : ()V
    //   240: aload_0
    //   241: getfield Dne : LFiG;
    //   244: aconst_null
    //   245: putfield Dne : LcQz;
    //   248: return
    //   249: aload_0
    //   250: getfield bzF : LsMa;
    //   253: ifnull -> 321
    //   256: aload_0
    //   257: getfield bzF : LsMa;
    //   260: getfield Zpi : Z
    //   263: ifne -> 316
    //   266: aload_0
    //   267: aload_0
    //   268: getfield bzF : LsMa;
    //   271: getfield div : D
    //   274: putfield div : D
    //   277: aload_0
    //   278: aload_0
    //   279: getfield bzF : LsMa;
    //   282: getfield Dne : LbSp;
    //   285: getfield FWm : D
    //   288: aload_0
    //   289: getfield bzF : LsMa;
    //   292: getfield trS : F
    //   295: f2d
    //   296: ldc2_w 0.8
    //   299: dmul
    //   300: dadd
    //   301: putfield IjH : D
    //   304: aload_0
    //   305: aload_0
    //   306: getfield bzF : LsMa;
    //   309: getfield mrb : D
    //   312: putfield mrb : D
    //   315: return
    //   316: aload_0
    //   317: aconst_null
    //   318: putfield bzF : LsMa;
    //   321: aload_0
    //   322: getfield Dne : I
    //   325: ifle -> 338
    //   328: aload_0
    //   329: dup
    //   330: getfield Dne : I
    //   333: iconst_1
    //   334: isub
    //   335: putfield Dne : I
    //   338: aload_0
    //   339: getfield Dne : Z
    //   342: ifeq -> 476
    //   345: aload_0
    //   346: getfield Dne : LQnq;
    //   349: aload_0
    //   350: getfield FWm : I
    //   353: aload_0
    //   354: getfield bzF : I
    //   357: aload_0
    //   358: getfield Qnq : I
    //   361: invokevirtual Dne : (III)I
    //   364: istore_1
    //   365: iload_1
    //   366: aload_0
    //   367: getfield Vxn : I
    //   370: if_icmpne -> 398
    //   373: aload_0
    //   374: dup
    //   375: getfield ceE : I
    //   378: iconst_1
    //   379: iadd
    //   380: putfield ceE : I
    //   383: aload_0
    //   384: getfield ceE : I
    //   387: sipush #1200
    //   390: if_icmpne -> 397
    //   393: aload_0
    //   394: invokevirtual g_ : ()V
    //   397: return
    //   398: aload_0
    //   399: iconst_0
    //   400: putfield Dne : Z
    //   403: aload_0
    //   404: dup
    //   405: getfield XHL : D
    //   408: aload_0
    //   409: getfield Dne : Ljava/util/Random;
    //   412: invokevirtual nextFloat : ()F
    //   415: ldc 0.2
    //   417: fmul
    //   418: f2d
    //   419: dmul
    //   420: putfield XHL : D
    //   423: aload_0
    //   424: dup
    //   425: getfield Zpi : D
    //   428: aload_0
    //   429: getfield Dne : Ljava/util/Random;
    //   432: invokevirtual nextFloat : ()F
    //   435: ldc 0.2
    //   437: fmul
    //   438: f2d
    //   439: dmul
    //   440: putfield Zpi : D
    //   443: aload_0
    //   444: dup
    //   445: getfield kGO : D
    //   448: aload_0
    //   449: getfield Dne : Ljava/util/Random;
    //   452: invokevirtual nextFloat : ()F
    //   455: ldc 0.2
    //   457: fmul
    //   458: f2d
    //   459: dmul
    //   460: putfield kGO : D
    //   463: aload_0
    //   464: iconst_0
    //   465: putfield ceE : I
    //   468: aload_0
    //   469: iconst_0
    //   470: putfield EyB : I
    //   473: goto -> 486
    //   476: aload_0
    //   477: dup
    //   478: getfield EyB : I
    //   481: iconst_1
    //   482: iadd
    //   483: putfield EyB : I
    //   486: aload_0
    //   487: getfield Dne : LQnq;
    //   490: invokevirtual Dne : ()LziS;
    //   493: aload_0
    //   494: getfield div : D
    //   497: aload_0
    //   498: getfield IjH : D
    //   501: aload_0
    //   502: getfield mrb : D
    //   505: invokevirtual Dne : (DDD)LchN;
    //   508: astore_1
    //   509: aload_0
    //   510: getfield Dne : LQnq;
    //   513: invokevirtual Dne : ()LziS;
    //   516: aload_0
    //   517: getfield div : D
    //   520: aload_0
    //   521: getfield XHL : D
    //   524: dadd
    //   525: aload_0
    //   526: getfield IjH : D
    //   529: aload_0
    //   530: getfield Zpi : D
    //   533: dadd
    //   534: aload_0
    //   535: getfield mrb : D
    //   538: aload_0
    //   539: getfield kGO : D
    //   542: dadd
    //   543: invokevirtual Dne : (DDD)LchN;
    //   546: astore_2
    //   547: aload_0
    //   548: getfield Dne : LQnq;
    //   551: aload_1
    //   552: aload_2
    //   553: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   556: astore_3
    //   557: aload_0
    //   558: getfield Dne : LQnq;
    //   561: invokevirtual Dne : ()LziS;
    //   564: aload_0
    //   565: getfield div : D
    //   568: aload_0
    //   569: getfield IjH : D
    //   572: aload_0
    //   573: getfield mrb : D
    //   576: invokevirtual Dne : (DDD)LchN;
    //   579: astore_1
    //   580: aload_0
    //   581: getfield Dne : LQnq;
    //   584: invokevirtual Dne : ()LziS;
    //   587: aload_0
    //   588: getfield div : D
    //   591: aload_0
    //   592: getfield XHL : D
    //   595: dadd
    //   596: aload_0
    //   597: getfield IjH : D
    //   600: aload_0
    //   601: getfield Zpi : D
    //   604: dadd
    //   605: aload_0
    //   606: getfield mrb : D
    //   609: aload_0
    //   610: getfield kGO : D
    //   613: dadd
    //   614: invokevirtual Dne : (DDD)LchN;
    //   617: astore_2
    //   618: aload_3
    //   619: ifnull -> 654
    //   622: aload_0
    //   623: getfield Dne : LQnq;
    //   626: invokevirtual Dne : ()LziS;
    //   629: aload_3
    //   630: getfield Dne : LchN;
    //   633: getfield Dne : D
    //   636: aload_3
    //   637: getfield Dne : LchN;
    //   640: getfield FWm : D
    //   643: aload_3
    //   644: getfield Dne : LchN;
    //   647: getfield bzF : D
    //   650: invokevirtual Dne : (DDD)LchN;
    //   653: astore_2
    //   654: aconst_null
    //   655: astore #4
    //   657: aload_0
    //   658: getfield Dne : LQnq;
    //   661: aload_0
    //   662: aload_0
    //   663: getfield Dne : LbSp;
    //   666: aload_0
    //   667: getfield XHL : D
    //   670: aload_0
    //   671: getfield Zpi : D
    //   674: aload_0
    //   675: getfield kGO : D
    //   678: invokevirtual Dne : (DDD)LbSp;
    //   681: dconst_1
    //   682: dconst_1
    //   683: dconst_1
    //   684: invokevirtual FWm : (DDD)LbSp;
    //   687: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   690: astore #5
    //   692: dconst_0
    //   693: dstore #6
    //   695: iconst_0
    //   696: istore #10
    //   698: iload #10
    //   700: aload #5
    //   702: invokeinterface size : ()I
    //   707: if_icmpge -> 827
    //   710: aload #5
    //   712: iload #10
    //   714: invokeinterface get : (I)Ljava/lang/Object;
    //   719: checkcast sMa
    //   722: astore #11
    //   724: aload #11
    //   726: invokevirtual kGO : ()Z
    //   729: ifeq -> 821
    //   732: aload #11
    //   734: aload_0
    //   735: getfield Dne : LFiG;
    //   738: if_acmpne -> 749
    //   741: aload_0
    //   742: getfield EyB : I
    //   745: iconst_5
    //   746: if_icmplt -> 821
    //   749: ldc_w 0.3
    //   752: fstore #12
    //   754: aload #11
    //   756: getfield Dne : LbSp;
    //   759: fload #12
    //   761: f2d
    //   762: fload #12
    //   764: f2d
    //   765: fload #12
    //   767: f2d
    //   768: invokevirtual FWm : (DDD)LbSp;
    //   771: astore #13
    //   773: aload #13
    //   775: aload_1
    //   776: aload_2
    //   777: invokevirtual Dne : (LchN;LchN;)LwHH;
    //   780: astore #14
    //   782: aload #14
    //   784: ifnull -> 821
    //   787: aload_1
    //   788: aload #14
    //   790: getfield Dne : LchN;
    //   793: invokevirtual FWm : (LchN;)D
    //   796: dstore #8
    //   798: dload #8
    //   800: dload #6
    //   802: dcmpg
    //   803: iflt -> 813
    //   806: dload #6
    //   808: dconst_0
    //   809: dcmpl
    //   810: ifne -> 821
    //   813: aload #11
    //   815: astore #4
    //   817: dload #8
    //   819: dstore #6
    //   821: iinc #10, 1
    //   824: goto -> 698
    //   827: aload #4
    //   829: ifnull -> 842
    //   832: new wHH
    //   835: dup
    //   836: aload #4
    //   838: invokespecial <init> : (LsMa;)V
    //   841: astore_3
    //   842: aload_3
    //   843: ifnull -> 888
    //   846: aload_3
    //   847: getfield Dne : LsMa;
    //   850: ifnull -> 883
    //   853: aload_3
    //   854: getfield Dne : LsMa;
    //   857: aload_0
    //   858: aload_0
    //   859: getfield Dne : LFiG;
    //   862: invokestatic Dne : (LsMa;LsMa;)LzBn;
    //   865: iconst_0
    //   866: invokevirtual Dne : (LzBn;I)Z
    //   869: ifeq -> 888
    //   872: aload_0
    //   873: aload_3
    //   874: getfield Dne : LsMa;
    //   877: putfield bzF : LsMa;
    //   880: goto -> 888
    //   883: aload_0
    //   884: iconst_1
    //   885: putfield Dne : Z
    //   888: aload_0
    //   889: getfield Dne : Z
    //   892: ifne -> 1870
    //   895: aload_0
    //   896: aload_0
    //   897: getfield XHL : D
    //   900: aload_0
    //   901: getfield Zpi : D
    //   904: aload_0
    //   905: getfield kGO : D
    //   908: invokevirtual Dne : (DDD)V
    //   911: aload_0
    //   912: getfield XHL : D
    //   915: aload_0
    //   916: getfield XHL : D
    //   919: dmul
    //   920: aload_0
    //   921: getfield kGO : D
    //   924: aload_0
    //   925: getfield kGO : D
    //   928: dmul
    //   929: dadd
    //   930: invokestatic Dne : (D)F
    //   933: fstore #10
    //   935: aload_0
    //   936: aload_0
    //   937: getfield XHL : D
    //   940: aload_0
    //   941: getfield kGO : D
    //   944: invokestatic atan2 : (DD)D
    //   947: ldc2_w 180.0
    //   950: dmul
    //   951: ldc2_w 3.141592653589793
    //   954: ddiv
    //   955: d2f
    //   956: putfield mrb : F
    //   959: aload_0
    //   960: aload_0
    //   961: getfield Zpi : D
    //   964: fload #10
    //   966: f2d
    //   967: invokestatic atan2 : (DD)D
    //   970: ldc2_w 180.0
    //   973: dmul
    //   974: ldc2_w 3.141592653589793
    //   977: ddiv
    //   978: d2f
    //   979: putfield XHL : F
    //   982: aload_0
    //   983: getfield XHL : F
    //   986: aload_0
    //   987: getfield kGO : F
    //   990: fsub
    //   991: ldc_w -180.0
    //   994: fcmpg
    //   995: ifge -> 1013
    //   998: aload_0
    //   999: dup
    //   1000: getfield kGO : F
    //   1003: ldc_w 360.0
    //   1006: fsub
    //   1007: putfield kGO : F
    //   1010: goto -> 982
    //   1013: aload_0
    //   1014: getfield XHL : F
    //   1017: aload_0
    //   1018: getfield kGO : F
    //   1021: fsub
    //   1022: ldc_w 180.0
    //   1025: fcmpl
    //   1026: iflt -> 1044
    //   1029: aload_0
    //   1030: dup
    //   1031: getfield kGO : F
    //   1034: ldc_w 360.0
    //   1037: fadd
    //   1038: putfield kGO : F
    //   1041: goto -> 1013
    //   1044: aload_0
    //   1045: getfield mrb : F
    //   1048: aload_0
    //   1049: getfield Zpi : F
    //   1052: fsub
    //   1053: ldc_w -180.0
    //   1056: fcmpg
    //   1057: ifge -> 1075
    //   1060: aload_0
    //   1061: dup
    //   1062: getfield Zpi : F
    //   1065: ldc_w 360.0
    //   1068: fsub
    //   1069: putfield Zpi : F
    //   1072: goto -> 1044
    //   1075: aload_0
    //   1076: getfield mrb : F
    //   1079: aload_0
    //   1080: getfield Zpi : F
    //   1083: fsub
    //   1084: ldc_w 180.0
    //   1087: fcmpl
    //   1088: iflt -> 1106
    //   1091: aload_0
    //   1092: dup
    //   1093: getfield Zpi : F
    //   1096: ldc_w 360.0
    //   1099: fadd
    //   1100: putfield Zpi : F
    //   1103: goto -> 1075
    //   1106: aload_0
    //   1107: aload_0
    //   1108: getfield kGO : F
    //   1111: aload_0
    //   1112: getfield XHL : F
    //   1115: aload_0
    //   1116: getfield kGO : F
    //   1119: fsub
    //   1120: ldc 0.2
    //   1122: fmul
    //   1123: fadd
    //   1124: putfield XHL : F
    //   1127: aload_0
    //   1128: aload_0
    //   1129: getfield Zpi : F
    //   1132: aload_0
    //   1133: getfield mrb : F
    //   1136: aload_0
    //   1137: getfield Zpi : F
    //   1140: fsub
    //   1141: ldc 0.2
    //   1143: fmul
    //   1144: fadd
    //   1145: putfield mrb : F
    //   1148: ldc_w 0.92
    //   1151: fstore #11
    //   1153: aload_0
    //   1154: getfield aFZ : Z
    //   1157: ifne -> 1167
    //   1160: aload_0
    //   1161: getfield zGp : Z
    //   1164: ifeq -> 1172
    //   1167: ldc_w 0.5
    //   1170: fstore #11
    //   1172: iconst_5
    //   1173: istore #12
    //   1175: dconst_0
    //   1176: dstore #13
    //   1178: iconst_0
    //   1179: istore #15
    //   1181: iload #15
    //   1183: iload #12
    //   1185: if_icmpge -> 1345
    //   1188: aload_0
    //   1189: getfield Dne : LbSp;
    //   1192: getfield FWm : D
    //   1195: aload_0
    //   1196: getfield Dne : LbSp;
    //   1199: getfield aFZ : D
    //   1202: aload_0
    //   1203: getfield Dne : LbSp;
    //   1206: getfield FWm : D
    //   1209: dsub
    //   1210: iload #15
    //   1212: iconst_0
    //   1213: iadd
    //   1214: i2d
    //   1215: dmul
    //   1216: iload #12
    //   1218: i2d
    //   1219: ddiv
    //   1220: dadd
    //   1221: ldc2_w 0.125
    //   1224: dsub
    //   1225: ldc2_w 0.125
    //   1228: dadd
    //   1229: dstore #16
    //   1231: aload_0
    //   1232: getfield Dne : LbSp;
    //   1235: getfield FWm : D
    //   1238: aload_0
    //   1239: getfield Dne : LbSp;
    //   1242: getfield aFZ : D
    //   1245: aload_0
    //   1246: getfield Dne : LbSp;
    //   1249: getfield FWm : D
    //   1252: dsub
    //   1253: iload #15
    //   1255: iconst_1
    //   1256: iadd
    //   1257: i2d
    //   1258: dmul
    //   1259: iload #12
    //   1261: i2d
    //   1262: ddiv
    //   1263: dadd
    //   1264: ldc2_w 0.125
    //   1267: dsub
    //   1268: ldc2_w 0.125
    //   1271: dadd
    //   1272: dstore #18
    //   1274: invokestatic Dne : ()LzjJ;
    //   1277: aload_0
    //   1278: getfield Dne : LbSp;
    //   1281: getfield Dne : D
    //   1284: dload #16
    //   1286: aload_0
    //   1287: getfield Dne : LbSp;
    //   1290: getfield bzF : D
    //   1293: aload_0
    //   1294: getfield Dne : LbSp;
    //   1297: getfield Qnq : D
    //   1300: dload #18
    //   1302: aload_0
    //   1303: getfield Dne : LbSp;
    //   1306: getfield zGp : D
    //   1309: invokevirtual Dne : (DDDDDD)LbSp;
    //   1312: astore #20
    //   1314: aload_0
    //   1315: getfield Dne : LQnq;
    //   1318: aload #20
    //   1320: getstatic KFd.div : LKFd;
    //   1323: invokevirtual FWm : (LbSp;LKFd;)Z
    //   1326: ifeq -> 1339
    //   1329: dload #13
    //   1331: dconst_1
    //   1332: iload #12
    //   1334: i2d
    //   1335: ddiv
    //   1336: dadd
    //   1337: dstore #13
    //   1339: iinc #15, 1
    //   1342: goto -> 1181
    //   1345: dload #13
    //   1347: dconst_0
    //   1348: dcmpl
    //   1349: ifle -> 1720
    //   1352: aload_0
    //   1353: getfield FfS : I
    //   1356: ifle -> 1372
    //   1359: aload_0
    //   1360: dup
    //   1361: getfield FfS : I
    //   1364: iconst_1
    //   1365: isub
    //   1366: putfield FfS : I
    //   1369: goto -> 1720
    //   1372: sipush #500
    //   1375: istore #15
    //   1377: aload_0
    //   1378: getfield Dne : LQnq;
    //   1381: aload_0
    //   1382: getfield div : D
    //   1385: invokestatic FWm : (D)I
    //   1388: aload_0
    //   1389: getfield IjH : D
    //   1392: invokestatic FWm : (D)I
    //   1395: iconst_1
    //   1396: iadd
    //   1397: aload_0
    //   1398: getfield mrb : D
    //   1401: invokestatic FWm : (D)I
    //   1404: invokevirtual udO : (III)Z
    //   1407: ifeq -> 1415
    //   1410: sipush #300
    //   1413: istore #15
    //   1415: aload_0
    //   1416: getfield Dne : Ljava/util/Random;
    //   1419: iload #15
    //   1421: invokevirtual nextInt : (I)I
    //   1424: ifne -> 1720
    //   1427: aload_0
    //   1428: aload_0
    //   1429: getfield Dne : Ljava/util/Random;
    //   1432: bipush #30
    //   1434: invokevirtual nextInt : (I)I
    //   1437: bipush #10
    //   1439: iadd
    //   1440: putfield FfS : I
    //   1443: aload_0
    //   1444: dup
    //   1445: getfield Zpi : D
    //   1448: ldc2_w 0.20000000298023224
    //   1451: dsub
    //   1452: putfield Zpi : D
    //   1455: aload_0
    //   1456: ldc_w 'random.splash'
    //   1459: ldc 0.25
    //   1461: fconst_1
    //   1462: aload_0
    //   1463: getfield Dne : Ljava/util/Random;
    //   1466: invokevirtual nextFloat : ()F
    //   1469: aload_0
    //   1470: getfield Dne : Ljava/util/Random;
    //   1473: invokevirtual nextFloat : ()F
    //   1476: fsub
    //   1477: ldc_w 0.4
    //   1480: fmul
    //   1481: fadd
    //   1482: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   1485: aload_0
    //   1486: getfield Dne : LbSp;
    //   1489: getfield FWm : D
    //   1492: invokestatic FWm : (D)I
    //   1495: i2f
    //   1496: fstore #16
    //   1498: iconst_0
    //   1499: istore #17
    //   1501: iload #17
    //   1503: i2f
    //   1504: fconst_1
    //   1505: aload_0
    //   1506: getfield ooe : F
    //   1509: ldc_w 20.0
    //   1512: fmul
    //   1513: fadd
    //   1514: fcmpg
    //   1515: ifge -> 1615
    //   1518: aload_0
    //   1519: getfield Dne : Ljava/util/Random;
    //   1522: invokevirtual nextFloat : ()F
    //   1525: fconst_2
    //   1526: fmul
    //   1527: fconst_1
    //   1528: fsub
    //   1529: aload_0
    //   1530: getfield ooe : F
    //   1533: fmul
    //   1534: fstore #19
    //   1536: aload_0
    //   1537: getfield Dne : Ljava/util/Random;
    //   1540: invokevirtual nextFloat : ()F
    //   1543: fconst_2
    //   1544: fmul
    //   1545: fconst_1
    //   1546: fsub
    //   1547: aload_0
    //   1548: getfield ooe : F
    //   1551: fmul
    //   1552: fstore #18
    //   1554: aload_0
    //   1555: getfield Dne : LQnq;
    //   1558: ldc_w 'bubble'
    //   1561: aload_0
    //   1562: getfield div : D
    //   1565: fload #19
    //   1567: f2d
    //   1568: dadd
    //   1569: fload #16
    //   1571: fconst_1
    //   1572: fadd
    //   1573: f2d
    //   1574: aload_0
    //   1575: getfield mrb : D
    //   1578: fload #18
    //   1580: f2d
    //   1581: dadd
    //   1582: aload_0
    //   1583: getfield XHL : D
    //   1586: aload_0
    //   1587: getfield Zpi : D
    //   1590: aload_0
    //   1591: getfield Dne : Ljava/util/Random;
    //   1594: invokevirtual nextFloat : ()F
    //   1597: ldc 0.2
    //   1599: fmul
    //   1600: f2d
    //   1601: dsub
    //   1602: aload_0
    //   1603: getfield kGO : D
    //   1606: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   1609: iinc #17, 1
    //   1612: goto -> 1501
    //   1615: iconst_0
    //   1616: istore #17
    //   1618: iload #17
    //   1620: i2f
    //   1621: fconst_1
    //   1622: aload_0
    //   1623: getfield ooe : F
    //   1626: ldc_w 20.0
    //   1629: fmul
    //   1630: fadd
    //   1631: fcmpg
    //   1632: ifge -> 1720
    //   1635: aload_0
    //   1636: getfield Dne : Ljava/util/Random;
    //   1639: invokevirtual nextFloat : ()F
    //   1642: fconst_2
    //   1643: fmul
    //   1644: fconst_1
    //   1645: fsub
    //   1646: aload_0
    //   1647: getfield ooe : F
    //   1650: fmul
    //   1651: fstore #19
    //   1653: aload_0
    //   1654: getfield Dne : Ljava/util/Random;
    //   1657: invokevirtual nextFloat : ()F
    //   1660: fconst_2
    //   1661: fmul
    //   1662: fconst_1
    //   1663: fsub
    //   1664: aload_0
    //   1665: getfield ooe : F
    //   1668: fmul
    //   1669: fstore #18
    //   1671: aload_0
    //   1672: getfield Dne : LQnq;
    //   1675: ldc_w 'splash'
    //   1678: aload_0
    //   1679: getfield div : D
    //   1682: fload #19
    //   1684: f2d
    //   1685: dadd
    //   1686: fload #16
    //   1688: fconst_1
    //   1689: fadd
    //   1690: f2d
    //   1691: aload_0
    //   1692: getfield mrb : D
    //   1695: fload #18
    //   1697: f2d
    //   1698: dadd
    //   1699: aload_0
    //   1700: getfield XHL : D
    //   1703: aload_0
    //   1704: getfield Zpi : D
    //   1707: aload_0
    //   1708: getfield kGO : D
    //   1711: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   1714: iinc #17, 1
    //   1717: goto -> 1618
    //   1720: aload_0
    //   1721: getfield FfS : I
    //   1724: ifle -> 1764
    //   1727: aload_0
    //   1728: dup
    //   1729: getfield Zpi : D
    //   1732: aload_0
    //   1733: getfield Dne : Ljava/util/Random;
    //   1736: invokevirtual nextFloat : ()F
    //   1739: aload_0
    //   1740: getfield Dne : Ljava/util/Random;
    //   1743: invokevirtual nextFloat : ()F
    //   1746: fmul
    //   1747: aload_0
    //   1748: getfield Dne : Ljava/util/Random;
    //   1751: invokevirtual nextFloat : ()F
    //   1754: fmul
    //   1755: f2d
    //   1756: ldc2_w 0.2
    //   1759: dmul
    //   1760: dsub
    //   1761: putfield Zpi : D
    //   1764: dload #13
    //   1766: ldc2_w 2.0
    //   1769: dmul
    //   1770: dconst_1
    //   1771: dsub
    //   1772: dstore #8
    //   1774: aload_0
    //   1775: dup
    //   1776: getfield Zpi : D
    //   1779: ldc2_w 0.03999999910593033
    //   1782: dload #8
    //   1784: dmul
    //   1785: dadd
    //   1786: putfield Zpi : D
    //   1789: dload #13
    //   1791: dconst_0
    //   1792: dcmpl
    //   1793: ifle -> 1818
    //   1796: fload #11
    //   1798: f2d
    //   1799: ldc2_w 0.9
    //   1802: dmul
    //   1803: d2f
    //   1804: fstore #11
    //   1806: aload_0
    //   1807: dup
    //   1808: getfield Zpi : D
    //   1811: ldc2_w 0.8
    //   1814: dmul
    //   1815: putfield Zpi : D
    //   1818: aload_0
    //   1819: dup
    //   1820: getfield XHL : D
    //   1823: fload #11
    //   1825: f2d
    //   1826: dmul
    //   1827: putfield XHL : D
    //   1830: aload_0
    //   1831: dup
    //   1832: getfield Zpi : D
    //   1835: fload #11
    //   1837: f2d
    //   1838: dmul
    //   1839: putfield Zpi : D
    //   1842: aload_0
    //   1843: dup
    //   1844: getfield kGO : D
    //   1847: fload #11
    //   1849: f2d
    //   1850: dmul
    //   1851: putfield kGO : D
    //   1854: aload_0
    //   1855: aload_0
    //   1856: getfield div : D
    //   1859: aload_0
    //   1860: getfield IjH : D
    //   1863: aload_0
    //   1864: getfield mrb : D
    //   1867: invokevirtual bzF : (DDD)V
    //   1870: return
  }
  
  public void aFZ(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Vxn = this.XHL = paramDouble1;
    this.ceE = this.Zpi = paramDouble2;
    this.EyB = this.kGO = paramDouble3;
  }
  
  protected void FWm() {}
  
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
  
  public void FWm(WkD paramWkD) {
    this.FWm = paramWkD.Dne("xTile");
    this.bzF = paramWkD.Dne("yTile");
    this.Qnq = paramWkD.Dne("zTile");
    this.Vxn = paramWkD.Dne("inTile") & 0xFF;
    this.Dne = paramWkD.Dne("shake") & 0xFF;
    this.Dne = (paramWkD.Dne("inGround") == 1) ? 1 : 0;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    this.qLR = paramFloat1;
    this.ATE = paramFloat2;
    this.OdI = paramInt;
    this.XHL = this.Vxn;
    this.Zpi = this.ceE;
    this.kGO = this.EyB;
  }
  
  public cQz(Qnq paramQnq, FiG paramFiG) {
    super(paramQnq);
    this.Dne = 0;
    this.EyB = 0;
    this.FfS = 0;
    this.bzF = null;
    this.qLR = true;
    this.Dne = paramFiG;
    this.Dne.Dne = (Pdb)this;
    Dne(0.25F, 0.25F);
    FWm(paramFiG.div, paramFiG.IjH + 1.62D - paramFiG.udO, paramFiG.mrb, paramFiG.mrb, paramFiG.XHL);
    this.div -= (geR.FWm(this.mrb / 180.0F * 3.1415927F) * 0.16F);
    this.IjH -= 0.10000000149011612D;
    this.mrb -= (geR.Dne(this.mrb / 180.0F * 3.1415927F) * 0.16F);
    bzF(this.div, this.IjH, this.mrb);
    this.udO = 0.0F;
    float f = 0.4F;
    this.XHL = (-geR.Dne(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F) * f);
    this.kGO = (geR.FWm(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F) * f);
    this.Zpi = (-geR.Dne(this.XHL / 180.0F * 3.1415927F) * f);
    bzF(this.XHL, this.Zpi, this.kGO, 1.5F, 1.0F);
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("xTile", (short)this.FWm);
    paramWkD.Dne("yTile", (short)this.bzF);
    paramWkD.Dne("zTile", (short)this.Qnq);
    paramWkD.Dne("inTile", (byte)this.Vxn);
    paramWkD.Dne("shake", (byte)this.Dne);
    paramWkD.Dne("inGround", (byte)((this.Dne != 0) ? 1 : 0));
  }
  
  public void g_() {
    super.g_();
    if (this.Dne != null)
      this.Dne.Dne = null; 
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
    //   46: ldc2_w 0.007499999832361937
    //   49: dmul
    //   50: fload #8
    //   52: f2d
    //   53: dmul
    //   54: dadd
    //   55: dstore_1
    //   56: dload_3
    //   57: aload_0
    //   58: getfield Dne : Ljava/util/Random;
    //   61: invokevirtual nextGaussian : ()D
    //   64: ldc2_w 0.007499999832361937
    //   67: dmul
    //   68: fload #8
    //   70: f2d
    //   71: dmul
    //   72: dadd
    //   73: dstore_3
    //   74: dload #5
    //   76: aload_0
    //   77: getfield Dne : Ljava/util/Random;
    //   80: invokevirtual nextGaussian : ()D
    //   83: ldc2_w 0.007499999832361937
    //   86: dmul
    //   87: fload #8
    //   89: f2d
    //   90: dmul
    //   91: dadd
    //   92: dstore #5
    //   94: dload_1
    //   95: fload #7
    //   97: f2d
    //   98: dmul
    //   99: dstore_1
    //   100: dload_3
    //   101: fload #7
    //   103: f2d
    //   104: dmul
    //   105: dstore_3
    //   106: dload #5
    //   108: fload #7
    //   110: f2d
    //   111: dmul
    //   112: dstore #5
    //   114: aload_0
    //   115: dload_1
    //   116: putfield XHL : D
    //   119: aload_0
    //   120: dload_3
    //   121: putfield Zpi : D
    //   124: aload_0
    //   125: dload #5
    //   127: putfield kGO : D
    //   130: dload_1
    //   131: dload_1
    //   132: dmul
    //   133: dload #5
    //   135: dload #5
    //   137: dmul
    //   138: dadd
    //   139: invokestatic Dne : (D)F
    //   142: fstore #10
    //   144: aload_0
    //   145: aload_0
    //   146: dload_1
    //   147: dload #5
    //   149: invokestatic atan2 : (DD)D
    //   152: ldc2_w 180.0
    //   155: dmul
    //   156: ldc2_w 3.141592653589793
    //   159: ddiv
    //   160: d2f
    //   161: dup_x1
    //   162: putfield mrb : F
    //   165: putfield Zpi : F
    //   168: aload_0
    //   169: aload_0
    //   170: dload_3
    //   171: fload #10
    //   173: f2d
    //   174: invokestatic atan2 : (DD)D
    //   177: ldc2_w 180.0
    //   180: dmul
    //   181: ldc2_w 3.141592653589793
    //   184: ddiv
    //   185: d2f
    //   186: dup_x1
    //   187: putfield XHL : F
    //   190: putfield kGO : F
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield ceE : I
    //   198: return
  }
  
  public float Dne() {
    return 0.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cQz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */