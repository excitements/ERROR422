public class Lth {
  int Qnq;
  
  float Dne;
  
  private static final int ATE;
  
  int[] bzF;
  
  TqT[] Dne;
  
  float FWm;
  
  private static final int ooe;
  
  int[] Qnq;
  
  private static final int Vxn = 3;
  
  int[] aFZ;
  
  private static final int trS;
  
  public int Dne;
  
  int XHL;
  
  int div;
  
  Object[] bzF;
  
  int aFZ;
  
  private static final int ceE;
  
  private static final int qLR;
  
  int mrb;
  
  private static byte[] Dne;
  
  int IjH;
  
  int zGp;
  
  public int FWm;
  
  int Zpi;
  
  Object[] FWm;
  
  public int bzF;
  
  int kGO;
  
  Object[] Qnq;
  
  Object[] Dne;
  
  Vey[] Dne;
  
  int[] FWm;
  
  private static final int EyB = 1;
  
  XEH[] Dne;
  
  int[] Dne = new int[2];
  
  int udO;
  
  int DyG;
  
  public String toString() {
    return "version:" + new Integer(this.Dne) + ", channels:" + new Integer(this.FWm) + ", rate:" + new Integer(this.bzF) + ", bitrate:" + new Integer(this.Qnq) + "," + new Integer(this.aFZ) + "," + new Integer(this.zGp);
  }
  
  static {
    qLR = 1;
    trS = -135;
    ATE = 2;
    ceE = 1;
    ooe = -136;
    Dne = (int[])"vorbis".getBytes();
  }
  
  int FWm(qbC paramqbC) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: bipush #8
    //   4: invokevirtual FWm : (I)I
    //   7: iconst_1
    //   8: iadd
    //   9: putfield Zpi : I
    //   12: aload_0
    //   13: getfield Dne : [LVey;
    //   16: ifnull -> 31
    //   19: aload_0
    //   20: getfield Dne : [LVey;
    //   23: arraylength
    //   24: aload_0
    //   25: getfield Zpi : I
    //   28: if_icmpeq -> 42
    //   31: aload_0
    //   32: aload_0
    //   33: getfield Zpi : I
    //   36: anewarray Vey
    //   39: putfield Dne : [LVey;
    //   42: iconst_0
    //   43: istore_2
    //   44: iload_2
    //   45: aload_0
    //   46: getfield Zpi : I
    //   49: if_icmpge -> 90
    //   52: aload_0
    //   53: getfield Dne : [LVey;
    //   56: iload_2
    //   57: new Vey
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: aastore
    //   65: aload_0
    //   66: getfield Dne : [LVey;
    //   69: iload_2
    //   70: aaload
    //   71: aload_1
    //   72: invokevirtual FWm : (LqbC;)I
    //   75: ifeq -> 84
    //   78: aload_0
    //   79: invokevirtual FWm : ()V
    //   82: iconst_m1
    //   83: ireturn
    //   84: iinc #2, 1
    //   87: goto -> 44
    //   90: aload_0
    //   91: aload_1
    //   92: bipush #6
    //   94: invokevirtual FWm : (I)I
    //   97: iconst_1
    //   98: iadd
    //   99: putfield IjH : I
    //   102: aload_0
    //   103: getfield bzF : [I
    //   106: ifnull -> 121
    //   109: aload_0
    //   110: getfield bzF : [I
    //   113: arraylength
    //   114: aload_0
    //   115: getfield IjH : I
    //   118: if_icmpeq -> 131
    //   121: aload_0
    //   122: aload_0
    //   123: getfield IjH : I
    //   126: newarray int
    //   128: putfield bzF : [I
    //   131: aload_0
    //   132: getfield FWm : [Ljava/lang/Object;
    //   135: ifnull -> 150
    //   138: aload_0
    //   139: getfield FWm : [Ljava/lang/Object;
    //   142: arraylength
    //   143: aload_0
    //   144: getfield IjH : I
    //   147: if_icmpeq -> 161
    //   150: aload_0
    //   151: aload_0
    //   152: getfield IjH : I
    //   155: anewarray java/lang/Object
    //   158: putfield FWm : [Ljava/lang/Object;
    //   161: iconst_0
    //   162: istore_2
    //   163: iload_2
    //   164: aload_0
    //   165: getfield IjH : I
    //   168: if_icmpge -> 250
    //   171: aload_0
    //   172: getfield bzF : [I
    //   175: iload_2
    //   176: aload_1
    //   177: bipush #16
    //   179: invokevirtual FWm : (I)I
    //   182: iastore
    //   183: aload_0
    //   184: getfield bzF : [I
    //   187: iload_2
    //   188: iaload
    //   189: iflt -> 202
    //   192: aload_0
    //   193: getfield bzF : [I
    //   196: iload_2
    //   197: iaload
    //   198: iconst_1
    //   199: if_icmplt -> 208
    //   202: aload_0
    //   203: invokevirtual FWm : ()V
    //   206: iconst_m1
    //   207: ireturn
    //   208: aload_0
    //   209: getfield FWm : [Ljava/lang/Object;
    //   212: iload_2
    //   213: getstatic qxf.Dne : [Lqxf;
    //   216: aload_0
    //   217: getfield bzF : [I
    //   220: iload_2
    //   221: iaload
    //   222: aaload
    //   223: aload_0
    //   224: aload_1
    //   225: invokevirtual Dne : (LLth;LqbC;)Ljava/lang/Object;
    //   228: aastore
    //   229: aload_0
    //   230: getfield FWm : [Ljava/lang/Object;
    //   233: iload_2
    //   234: aaload
    //   235: ifnonnull -> 244
    //   238: aload_0
    //   239: invokevirtual FWm : ()V
    //   242: iconst_m1
    //   243: ireturn
    //   244: iinc #2, 1
    //   247: goto -> 163
    //   250: aload_0
    //   251: aload_1
    //   252: bipush #6
    //   254: invokevirtual FWm : (I)I
    //   257: iconst_1
    //   258: iadd
    //   259: putfield mrb : I
    //   262: aload_0
    //   263: getfield Qnq : [I
    //   266: ifnull -> 281
    //   269: aload_0
    //   270: getfield Qnq : [I
    //   273: arraylength
    //   274: aload_0
    //   275: getfield mrb : I
    //   278: if_icmpeq -> 291
    //   281: aload_0
    //   282: aload_0
    //   283: getfield mrb : I
    //   286: newarray int
    //   288: putfield Qnq : [I
    //   291: aload_0
    //   292: getfield bzF : [Ljava/lang/Object;
    //   295: ifnull -> 310
    //   298: aload_0
    //   299: getfield bzF : [Ljava/lang/Object;
    //   302: arraylength
    //   303: aload_0
    //   304: getfield mrb : I
    //   307: if_icmpeq -> 321
    //   310: aload_0
    //   311: aload_0
    //   312: getfield mrb : I
    //   315: anewarray java/lang/Object
    //   318: putfield bzF : [Ljava/lang/Object;
    //   321: iconst_0
    //   322: istore_2
    //   323: iload_2
    //   324: aload_0
    //   325: getfield mrb : I
    //   328: if_icmpge -> 410
    //   331: aload_0
    //   332: getfield Qnq : [I
    //   335: iload_2
    //   336: aload_1
    //   337: bipush #16
    //   339: invokevirtual FWm : (I)I
    //   342: iastore
    //   343: aload_0
    //   344: getfield Qnq : [I
    //   347: iload_2
    //   348: iaload
    //   349: iflt -> 362
    //   352: aload_0
    //   353: getfield Qnq : [I
    //   356: iload_2
    //   357: iaload
    //   358: iconst_2
    //   359: if_icmplt -> 368
    //   362: aload_0
    //   363: invokevirtual FWm : ()V
    //   366: iconst_m1
    //   367: ireturn
    //   368: aload_0
    //   369: getfield bzF : [Ljava/lang/Object;
    //   372: iload_2
    //   373: getstatic WoN.Dne : [LWoN;
    //   376: aload_0
    //   377: getfield Qnq : [I
    //   380: iload_2
    //   381: iaload
    //   382: aaload
    //   383: aload_0
    //   384: aload_1
    //   385: invokevirtual Dne : (LLth;LqbC;)Ljava/lang/Object;
    //   388: aastore
    //   389: aload_0
    //   390: getfield bzF : [Ljava/lang/Object;
    //   393: iload_2
    //   394: aaload
    //   395: ifnonnull -> 404
    //   398: aload_0
    //   399: invokevirtual FWm : ()V
    //   402: iconst_m1
    //   403: ireturn
    //   404: iinc #2, 1
    //   407: goto -> 323
    //   410: aload_0
    //   411: aload_1
    //   412: bipush #6
    //   414: invokevirtual FWm : (I)I
    //   417: iconst_1
    //   418: iadd
    //   419: putfield XHL : I
    //   422: aload_0
    //   423: getfield aFZ : [I
    //   426: ifnull -> 441
    //   429: aload_0
    //   430: getfield aFZ : [I
    //   433: arraylength
    //   434: aload_0
    //   435: getfield XHL : I
    //   438: if_icmpeq -> 451
    //   441: aload_0
    //   442: aload_0
    //   443: getfield XHL : I
    //   446: newarray int
    //   448: putfield aFZ : [I
    //   451: aload_0
    //   452: getfield Qnq : [Ljava/lang/Object;
    //   455: ifnull -> 470
    //   458: aload_0
    //   459: getfield Qnq : [Ljava/lang/Object;
    //   462: arraylength
    //   463: aload_0
    //   464: getfield XHL : I
    //   467: if_icmpeq -> 481
    //   470: aload_0
    //   471: aload_0
    //   472: getfield XHL : I
    //   475: anewarray java/lang/Object
    //   478: putfield Qnq : [Ljava/lang/Object;
    //   481: iconst_0
    //   482: istore_2
    //   483: iload_2
    //   484: aload_0
    //   485: getfield XHL : I
    //   488: if_icmpge -> 570
    //   491: aload_0
    //   492: getfield aFZ : [I
    //   495: iload_2
    //   496: aload_1
    //   497: bipush #16
    //   499: invokevirtual FWm : (I)I
    //   502: iastore
    //   503: aload_0
    //   504: getfield aFZ : [I
    //   507: iload_2
    //   508: iaload
    //   509: iflt -> 522
    //   512: aload_0
    //   513: getfield aFZ : [I
    //   516: iload_2
    //   517: iaload
    //   518: iconst_3
    //   519: if_icmplt -> 528
    //   522: aload_0
    //   523: invokevirtual FWm : ()V
    //   526: iconst_m1
    //   527: ireturn
    //   528: aload_0
    //   529: getfield Qnq : [Ljava/lang/Object;
    //   532: iload_2
    //   533: getstatic bFq.Dne : [LbFq;
    //   536: aload_0
    //   537: getfield aFZ : [I
    //   540: iload_2
    //   541: iaload
    //   542: aaload
    //   543: aload_0
    //   544: aload_1
    //   545: invokevirtual Dne : (LLth;LqbC;)Ljava/lang/Object;
    //   548: aastore
    //   549: aload_0
    //   550: getfield Qnq : [Ljava/lang/Object;
    //   553: iload_2
    //   554: aaload
    //   555: ifnonnull -> 564
    //   558: aload_0
    //   559: invokevirtual FWm : ()V
    //   562: iconst_m1
    //   563: ireturn
    //   564: iinc #2, 1
    //   567: goto -> 483
    //   570: aload_0
    //   571: aload_1
    //   572: bipush #6
    //   574: invokevirtual FWm : (I)I
    //   577: iconst_1
    //   578: iadd
    //   579: putfield div : I
    //   582: aload_0
    //   583: getfield FWm : [I
    //   586: ifnull -> 601
    //   589: aload_0
    //   590: getfield FWm : [I
    //   593: arraylength
    //   594: aload_0
    //   595: getfield div : I
    //   598: if_icmpeq -> 611
    //   601: aload_0
    //   602: aload_0
    //   603: getfield div : I
    //   606: newarray int
    //   608: putfield FWm : [I
    //   611: aload_0
    //   612: getfield Dne : [Ljava/lang/Object;
    //   615: ifnull -> 630
    //   618: aload_0
    //   619: getfield Dne : [Ljava/lang/Object;
    //   622: arraylength
    //   623: aload_0
    //   624: getfield div : I
    //   627: if_icmpeq -> 641
    //   630: aload_0
    //   631: aload_0
    //   632: getfield div : I
    //   635: anewarray java/lang/Object
    //   638: putfield Dne : [Ljava/lang/Object;
    //   641: iconst_0
    //   642: istore_2
    //   643: iload_2
    //   644: aload_0
    //   645: getfield div : I
    //   648: if_icmpge -> 730
    //   651: aload_0
    //   652: getfield FWm : [I
    //   655: iload_2
    //   656: aload_1
    //   657: bipush #16
    //   659: invokevirtual FWm : (I)I
    //   662: iastore
    //   663: aload_0
    //   664: getfield FWm : [I
    //   667: iload_2
    //   668: iaload
    //   669: iflt -> 682
    //   672: aload_0
    //   673: getfield FWm : [I
    //   676: iload_2
    //   677: iaload
    //   678: iconst_1
    //   679: if_icmplt -> 688
    //   682: aload_0
    //   683: invokevirtual FWm : ()V
    //   686: iconst_m1
    //   687: ireturn
    //   688: aload_0
    //   689: getfield Dne : [Ljava/lang/Object;
    //   692: iload_2
    //   693: getstatic ghN.Dne : [LghN;
    //   696: aload_0
    //   697: getfield FWm : [I
    //   700: iload_2
    //   701: iaload
    //   702: aaload
    //   703: aload_0
    //   704: aload_1
    //   705: invokevirtual Dne : (LLth;LqbC;)Ljava/lang/Object;
    //   708: aastore
    //   709: aload_0
    //   710: getfield Dne : [Ljava/lang/Object;
    //   713: iload_2
    //   714: aaload
    //   715: ifnonnull -> 724
    //   718: aload_0
    //   719: invokevirtual FWm : ()V
    //   722: iconst_m1
    //   723: ireturn
    //   724: iinc #2, 1
    //   727: goto -> 643
    //   730: aload_0
    //   731: aload_1
    //   732: bipush #6
    //   734: invokevirtual FWm : (I)I
    //   737: iconst_1
    //   738: iadd
    //   739: putfield DyG : I
    //   742: aload_0
    //   743: getfield Dne : [LXEH;
    //   746: ifnull -> 761
    //   749: aload_0
    //   750: getfield Dne : [LXEH;
    //   753: arraylength
    //   754: aload_0
    //   755: getfield DyG : I
    //   758: if_icmpeq -> 772
    //   761: aload_0
    //   762: aload_0
    //   763: getfield DyG : I
    //   766: anewarray XEH
    //   769: putfield Dne : [LXEH;
    //   772: iconst_0
    //   773: istore_2
    //   774: iload_2
    //   775: aload_0
    //   776: getfield DyG : I
    //   779: if_icmpge -> 908
    //   782: aload_0
    //   783: getfield Dne : [LXEH;
    //   786: iload_2
    //   787: new XEH
    //   790: dup
    //   791: invokespecial <init> : ()V
    //   794: aastore
    //   795: aload_0
    //   796: getfield Dne : [LXEH;
    //   799: iload_2
    //   800: aaload
    //   801: aload_1
    //   802: iconst_1
    //   803: invokevirtual FWm : (I)I
    //   806: putfield Dne : I
    //   809: aload_0
    //   810: getfield Dne : [LXEH;
    //   813: iload_2
    //   814: aaload
    //   815: aload_1
    //   816: bipush #16
    //   818: invokevirtual FWm : (I)I
    //   821: putfield FWm : I
    //   824: aload_0
    //   825: getfield Dne : [LXEH;
    //   828: iload_2
    //   829: aaload
    //   830: aload_1
    //   831: bipush #16
    //   833: invokevirtual FWm : (I)I
    //   836: putfield bzF : I
    //   839: aload_0
    //   840: getfield Dne : [LXEH;
    //   843: iload_2
    //   844: aaload
    //   845: aload_1
    //   846: bipush #8
    //   848: invokevirtual FWm : (I)I
    //   851: putfield Qnq : I
    //   854: aload_0
    //   855: getfield Dne : [LXEH;
    //   858: iload_2
    //   859: aaload
    //   860: getfield FWm : I
    //   863: iconst_1
    //   864: if_icmpge -> 896
    //   867: aload_0
    //   868: getfield Dne : [LXEH;
    //   871: iload_2
    //   872: aaload
    //   873: getfield bzF : I
    //   876: iconst_1
    //   877: if_icmpge -> 896
    //   880: aload_0
    //   881: getfield Dne : [LXEH;
    //   884: iload_2
    //   885: aaload
    //   886: getfield Qnq : I
    //   889: aload_0
    //   890: getfield div : I
    //   893: if_icmplt -> 902
    //   896: aload_0
    //   897: invokevirtual FWm : ()V
    //   900: iconst_m1
    //   901: ireturn
    //   902: iinc #2, 1
    //   905: goto -> 774
    //   908: aload_1
    //   909: iconst_1
    //   910: invokevirtual FWm : (I)I
    //   913: iconst_1
    //   914: if_icmpeq -> 923
    //   917: aload_0
    //   918: invokevirtual FWm : ()V
    //   921: iconst_m1
    //   922: ireturn
    //   923: iconst_0
    //   924: ireturn
  }
  
  int Qnq(qbC paramqbC) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_5
    //   2: bipush #8
    //   4: invokevirtual Dne : (II)V
    //   7: aload_1
    //   8: getstatic Lth.Dne : [B
    //   11: invokevirtual Dne : ([B)V
    //   14: aload_1
    //   15: aload_0
    //   16: getfield Zpi : I
    //   19: iconst_1
    //   20: isub
    //   21: bipush #8
    //   23: invokevirtual Dne : (II)V
    //   26: iconst_0
    //   27: istore_2
    //   28: iload_2
    //   29: aload_0
    //   30: getfield Zpi : I
    //   33: if_icmpge -> 57
    //   36: aload_0
    //   37: getfield Dne : [LVey;
    //   40: iload_2
    //   41: aaload
    //   42: aload_1
    //   43: invokevirtual Dne : (LqbC;)I
    //   46: ifeq -> 51
    //   49: iconst_m1
    //   50: ireturn
    //   51: iinc #2, 1
    //   54: goto -> 28
    //   57: aload_1
    //   58: aload_0
    //   59: getfield IjH : I
    //   62: iconst_1
    //   63: isub
    //   64: bipush #6
    //   66: invokevirtual Dne : (II)V
    //   69: iconst_0
    //   70: istore_2
    //   71: iload_2
    //   72: aload_0
    //   73: getfield IjH : I
    //   76: if_icmpge -> 117
    //   79: aload_1
    //   80: aload_0
    //   81: getfield bzF : [I
    //   84: iload_2
    //   85: iaload
    //   86: bipush #16
    //   88: invokevirtual Dne : (II)V
    //   91: getstatic qxf.Dne : [Lqxf;
    //   94: aload_0
    //   95: getfield bzF : [I
    //   98: iload_2
    //   99: iaload
    //   100: aaload
    //   101: aload_0
    //   102: getfield FWm : [Ljava/lang/Object;
    //   105: iload_2
    //   106: aaload
    //   107: aload_1
    //   108: invokevirtual Dne : (Ljava/lang/Object;LqbC;)V
    //   111: iinc #2, 1
    //   114: goto -> 71
    //   117: aload_1
    //   118: aload_0
    //   119: getfield mrb : I
    //   122: iconst_1
    //   123: isub
    //   124: bipush #6
    //   126: invokevirtual Dne : (II)V
    //   129: iconst_0
    //   130: istore_2
    //   131: iload_2
    //   132: aload_0
    //   133: getfield mrb : I
    //   136: if_icmpge -> 177
    //   139: aload_1
    //   140: aload_0
    //   141: getfield Qnq : [I
    //   144: iload_2
    //   145: iaload
    //   146: bipush #16
    //   148: invokevirtual Dne : (II)V
    //   151: getstatic WoN.Dne : [LWoN;
    //   154: aload_0
    //   155: getfield Qnq : [I
    //   158: iload_2
    //   159: iaload
    //   160: aaload
    //   161: aload_0
    //   162: getfield bzF : [Ljava/lang/Object;
    //   165: iload_2
    //   166: aaload
    //   167: aload_1
    //   168: invokevirtual Dne : (Ljava/lang/Object;LqbC;)V
    //   171: iinc #2, 1
    //   174: goto -> 131
    //   177: aload_1
    //   178: aload_0
    //   179: getfield XHL : I
    //   182: iconst_1
    //   183: isub
    //   184: bipush #6
    //   186: invokevirtual Dne : (II)V
    //   189: iconst_0
    //   190: istore_2
    //   191: iload_2
    //   192: aload_0
    //   193: getfield XHL : I
    //   196: if_icmpge -> 237
    //   199: aload_1
    //   200: aload_0
    //   201: getfield aFZ : [I
    //   204: iload_2
    //   205: iaload
    //   206: bipush #16
    //   208: invokevirtual Dne : (II)V
    //   211: getstatic bFq.Dne : [LbFq;
    //   214: aload_0
    //   215: getfield aFZ : [I
    //   218: iload_2
    //   219: iaload
    //   220: aaload
    //   221: aload_0
    //   222: getfield Qnq : [Ljava/lang/Object;
    //   225: iload_2
    //   226: aaload
    //   227: aload_1
    //   228: invokevirtual Dne : (Ljava/lang/Object;LqbC;)V
    //   231: iinc #2, 1
    //   234: goto -> 191
    //   237: aload_1
    //   238: aload_0
    //   239: getfield div : I
    //   242: iconst_1
    //   243: isub
    //   244: bipush #6
    //   246: invokevirtual Dne : (II)V
    //   249: iconst_0
    //   250: istore_2
    //   251: iload_2
    //   252: aload_0
    //   253: getfield div : I
    //   256: if_icmpge -> 298
    //   259: aload_1
    //   260: aload_0
    //   261: getfield FWm : [I
    //   264: iload_2
    //   265: iaload
    //   266: bipush #16
    //   268: invokevirtual Dne : (II)V
    //   271: getstatic ghN.Dne : [LghN;
    //   274: aload_0
    //   275: getfield FWm : [I
    //   278: iload_2
    //   279: iaload
    //   280: aaload
    //   281: aload_0
    //   282: aload_0
    //   283: getfield Dne : [Ljava/lang/Object;
    //   286: iload_2
    //   287: aaload
    //   288: aload_1
    //   289: invokevirtual Dne : (LLth;Ljava/lang/Object;LqbC;)V
    //   292: iinc #2, 1
    //   295: goto -> 251
    //   298: aload_1
    //   299: aload_0
    //   300: getfield DyG : I
    //   303: iconst_1
    //   304: isub
    //   305: bipush #6
    //   307: invokevirtual Dne : (II)V
    //   310: iconst_0
    //   311: istore_2
    //   312: iload_2
    //   313: aload_0
    //   314: getfield DyG : I
    //   317: if_icmpge -> 385
    //   320: aload_1
    //   321: aload_0
    //   322: getfield Dne : [LXEH;
    //   325: iload_2
    //   326: aaload
    //   327: getfield Dne : I
    //   330: iconst_1
    //   331: invokevirtual Dne : (II)V
    //   334: aload_1
    //   335: aload_0
    //   336: getfield Dne : [LXEH;
    //   339: iload_2
    //   340: aaload
    //   341: getfield FWm : I
    //   344: bipush #16
    //   346: invokevirtual Dne : (II)V
    //   349: aload_1
    //   350: aload_0
    //   351: getfield Dne : [LXEH;
    //   354: iload_2
    //   355: aaload
    //   356: getfield bzF : I
    //   359: bipush #16
    //   361: invokevirtual Dne : (II)V
    //   364: aload_1
    //   365: aload_0
    //   366: getfield Dne : [LXEH;
    //   369: iload_2
    //   370: aaload
    //   371: getfield Qnq : I
    //   374: bipush #8
    //   376: invokevirtual Dne : (II)V
    //   379: iinc #2, 1
    //   382: goto -> 312
    //   385: aload_1
    //   386: iconst_1
    //   387: iconst_1
    //   388: invokevirtual Dne : (II)V
    //   391: iconst_0
    //   392: ireturn
  }
  
  public Lth() {
    this.Dne = null;
    this.FWm = null;
    this.Dne = null;
    this.bzF = null;
    this.FWm = null;
    this.Qnq = null;
    this.bzF = null;
    this.aFZ = null;
    this.Qnq = null;
    this.Dne = null;
    this.Dne = (int[])new TqT[64];
  }
  
  int bzF(qbC paramqbC) {
    paramqbC.Dne(1, 8);
    paramqbC.Dne((byte[])Dne);
    paramqbC.Dne(0, 32);
    paramqbC.Dne(this.FWm, 8);
    paramqbC.Dne(this.bzF, 32);
    paramqbC.Dne(this.Qnq, 32);
    paramqbC.Dne(this.aFZ, 32);
    paramqbC.Dne(this.zGp, 32);
    paramqbC.Dne(xHL.FWm(this.Dne[0]), 4);
    paramqbC.Dne(xHL.FWm(this.Dne[1]), 4);
    paramqbC.Dne(1, 1);
    return 0;
  }
  
  public int Dne(PRc paramPRc, qlF paramqlF) {
    qbC qbC = new qbC();
    if (paramqlF != null) {
      qbC.Dne(paramqlF.Dne, paramqlF.Dne, paramqlF.FWm);
      byte[] arrayOfByte = new byte[6];
      int i = qbC.FWm(8);
      qbC.Dne(arrayOfByte, 6);
      if (arrayOfByte[0] != 118 || arrayOfByte[1] != 111 || arrayOfByte[2] != 114 || arrayOfByte[3] != 98 || arrayOfByte[4] != 105 || arrayOfByte[5] != 115)
        return -1; 
      switch (i) {
        case 1:
          return (paramqlF.bzF == 0) ? -1 : ((this.bzF != 0) ? -1 : Dne(qbC));
        case 3:
          return (this.bzF == 0) ? -1 : paramPRc.Dne(qbC);
        case 5:
          return (this.bzF == 0 || paramPRc.Dne == null) ? -1 : FWm(qbC);
      } 
    } 
    return -1;
  }
  
  public void FWm() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield DyG : I
    //   7: if_icmpge -> 23
    //   10: aload_0
    //   11: getfield Dne : [LXEH;
    //   14: iload_1
    //   15: aconst_null
    //   16: aastore
    //   17: iinc #1, 1
    //   20: goto -> 2
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield Dne : [LXEH;
    //   28: iconst_0
    //   29: istore_1
    //   30: iload_1
    //   31: aload_0
    //   32: getfield div : I
    //   35: if_icmpge -> 63
    //   38: getstatic ghN.Dne : [LghN;
    //   41: aload_0
    //   42: getfield FWm : [I
    //   45: iload_1
    //   46: iaload
    //   47: aaload
    //   48: aload_0
    //   49: getfield Dne : [Ljava/lang/Object;
    //   52: iload_1
    //   53: aaload
    //   54: invokevirtual Dne : (Ljava/lang/Object;)V
    //   57: iinc #1, 1
    //   60: goto -> 30
    //   63: aload_0
    //   64: aconst_null
    //   65: putfield Dne : [Ljava/lang/Object;
    //   68: iconst_0
    //   69: istore_1
    //   70: iload_1
    //   71: aload_0
    //   72: getfield IjH : I
    //   75: if_icmpge -> 103
    //   78: getstatic qxf.Dne : [Lqxf;
    //   81: aload_0
    //   82: getfield bzF : [I
    //   85: iload_1
    //   86: iaload
    //   87: aaload
    //   88: aload_0
    //   89: getfield FWm : [Ljava/lang/Object;
    //   92: iload_1
    //   93: aaload
    //   94: invokevirtual Dne : (Ljava/lang/Object;)V
    //   97: iinc #1, 1
    //   100: goto -> 70
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield FWm : [Ljava/lang/Object;
    //   108: iconst_0
    //   109: istore_1
    //   110: iload_1
    //   111: aload_0
    //   112: getfield mrb : I
    //   115: if_icmpge -> 143
    //   118: getstatic WoN.Dne : [LWoN;
    //   121: aload_0
    //   122: getfield Qnq : [I
    //   125: iload_1
    //   126: iaload
    //   127: aaload
    //   128: aload_0
    //   129: getfield bzF : [Ljava/lang/Object;
    //   132: iload_1
    //   133: aaload
    //   134: invokevirtual Dne : (Ljava/lang/Object;)V
    //   137: iinc #1, 1
    //   140: goto -> 110
    //   143: aload_0
    //   144: aconst_null
    //   145: putfield bzF : [Ljava/lang/Object;
    //   148: iconst_0
    //   149: istore_1
    //   150: iload_1
    //   151: aload_0
    //   152: getfield XHL : I
    //   155: if_icmpge -> 183
    //   158: getstatic bFq.Dne : [LbFq;
    //   161: aload_0
    //   162: getfield aFZ : [I
    //   165: iload_1
    //   166: iaload
    //   167: aaload
    //   168: aload_0
    //   169: getfield Qnq : [Ljava/lang/Object;
    //   172: iload_1
    //   173: aaload
    //   174: invokevirtual Dne : (Ljava/lang/Object;)V
    //   177: iinc #1, 1
    //   180: goto -> 150
    //   183: aload_0
    //   184: aconst_null
    //   185: putfield Qnq : [Ljava/lang/Object;
    //   188: iconst_0
    //   189: istore_1
    //   190: iload_1
    //   191: aload_0
    //   192: getfield Zpi : I
    //   195: if_icmpge -> 229
    //   198: aload_0
    //   199: getfield Dne : [LVey;
    //   202: iload_1
    //   203: aaload
    //   204: ifnull -> 223
    //   207: aload_0
    //   208: getfield Dne : [LVey;
    //   211: iload_1
    //   212: aaload
    //   213: invokevirtual Dne : ()V
    //   216: aload_0
    //   217: getfield Dne : [LVey;
    //   220: iload_1
    //   221: aconst_null
    //   222: aastore
    //   223: iinc #1, 1
    //   226: goto -> 190
    //   229: aload_0
    //   230: aconst_null
    //   231: putfield Dne : [LVey;
    //   234: iconst_0
    //   235: istore_1
    //   236: iload_1
    //   237: aload_0
    //   238: getfield kGO : I
    //   241: if_icmpge -> 259
    //   244: aload_0
    //   245: getfield Dne : [LTqT;
    //   248: iload_1
    //   249: aaload
    //   250: invokevirtual Dne : ()V
    //   253: iinc #1, 1
    //   256: goto -> 236
    //   259: return
  }
  
  public int Dne(qlF paramqlF) {
    qbC qbC = new qbC();
    qbC.Dne(paramqlF.Dne, paramqlF.Dne, paramqlF.FWm);
    if (qbC.FWm(1) != 0)
      return -135; 
    byte b = 0;
    int j;
    for (j = this.DyG; j > 1; j >>>= 1)
      b++; 
    int i = qbC.FWm(b);
    return (i == -1) ? -136 : this.Dne[(this.Dne[i]).Dne];
  }
  
  public void Dne() {
    this.bzF = 0;
  }
  
  int Dne(qbC paramqbC) {
    this.Dne = paramqbC.FWm(32);
    if (this.Dne != null)
      return -1; 
    this.FWm = paramqbC.FWm(8);
    this.bzF = paramqbC.FWm(32);
    this.Qnq = paramqbC.FWm(32);
    this.aFZ = paramqbC.FWm(32);
    this.zGp = paramqbC.FWm(32);
    this.Dne[0] = 1 << paramqbC.FWm(4);
    this.Dne[1] = 1 << paramqbC.FWm(4);
    if (this.bzF < 1 || this.FWm < true || this.Dne[0] < 8 || this.Dne[1] < this.Dne[0] || paramqbC.FWm(1) != 1) {
      FWm();
      return -1;
    } 
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lth.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */