import java.util.Random;

public class Fnk {
  protected gwq zGp;
  
  protected int div;
  
  protected gwq Qnq;
  
  protected int XHL;
  
  protected int bzF;
  
  protected gwq ATE = new iXU();
  
  protected gwq XHL = new uzC(zKP.qLR.FWm, 6);
  
  protected Qnq Dne;
  
  protected gwq qLR = new EYV();
  
  protected gwq udO;
  
  protected gwq IjH;
  
  protected gwq ooe = new LDH(((hbe)zKP.Qnq).FWm);
  
  protected int Qnq = new uzC(zKP.FWm.FWm, 32);
  
  protected int Zpi;
  
  protected int Dne;
  
  protected gwq kGO;
  
  protected int udO = new LDH(zKP.bzF.FWm);
  
  protected int IjH = new uzC(zKP.JLG.FWm, 7);
  
  protected int FWm;
  
  protected int mrb;
  
  protected OdI Dne;
  
  protected gwq trS = new yIR();
  
  protected gwq Vxn = new ICU();
  
  protected gwq Dne;
  
  protected gwq aFZ;
  
  protected gwq Zpi = new LDH(((hbe)zKP.Dne).FWm);
  
  protected Random Dne;
  
  protected gwq DyG;
  
  protected gwq FWm = new dBc(7, ((zKP)zKP.IjH).FWm);
  
  protected int zGp = new uzC(zKP.kGO.FWm, 16);
  
  protected int DyG = new uzC(((zKP)zKP.Zpi).FWm, 8);
  
  protected gwq bzF = new dBc(6, zKP.mrb.FWm);
  
  protected gwq mrb = new uzC(zKP.ZgS.FWm, 7);
  
  protected int aFZ = new uzC(zKP.mrb.FWm, 32);
  
  protected gwq div = new uzC(((zKP)zKP.XHL).FWm, 8);
  
  public boolean Dne = new Kmf(4);
  
  protected int kGO = new LDH(zKP.FWm.FWm);
  
  protected void FWm() {
    Dne(20, this.Qnq, 0, 128);
    Dne(10, this.aFZ, 0, 128);
    Dne(20, this.zGp, 0, 128);
    Dne(20, this.DyG, 0, 64);
    Dne(2, this.div, 0, 32);
    Dne(8, this.IjH, 0, 16);
    Dne(1, this.mrb, 0, 16);
    FWm(1, this.XHL, 16, 16);
  }
  
  protected void Dne(int paramInt1, gwq paramgwq, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iload #5
    //   5: iload_1
    //   6: if_icmpge -> 81
    //   9: aload_0
    //   10: getfield Dne : I
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/Random;
    //   17: bipush #16
    //   19: invokevirtual nextInt : (I)I
    //   22: iadd
    //   23: istore #6
    //   25: aload_0
    //   26: getfield Dne : Ljava/util/Random;
    //   29: iload #4
    //   31: iload_3
    //   32: isub
    //   33: invokevirtual nextInt : (I)I
    //   36: iload_3
    //   37: iadd
    //   38: istore #7
    //   40: aload_0
    //   41: getfield FWm : I
    //   44: aload_0
    //   45: getfield Dne : Ljava/util/Random;
    //   48: bipush #16
    //   50: invokevirtual nextInt : (I)I
    //   53: iadd
    //   54: istore #8
    //   56: aload_2
    //   57: aload_0
    //   58: getfield Dne : LQnq;
    //   61: aload_0
    //   62: getfield Dne : Ljava/util/Random;
    //   65: iload #6
    //   67: iload #7
    //   69: iload #8
    //   71: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   74: pop
    //   75: iinc #5, 1
    //   78: goto -> 3
    //   81: return
  }
  
  public void Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    if (this.Dne != null)
      throw new RuntimeException("Already decorating!!"); 
    this.Dne = paramQnq;
    this.Dne = paramRandom;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    Dne();
    this.Dne = null;
    this.Dne = null;
  }
  
  protected void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual FWm : ()V
    //   4: iconst_0
    //   5: istore_1
    //   6: iload_1
    //   7: aload_0
    //   8: getfield Zpi : I
    //   11: if_icmpge -> 83
    //   14: aload_0
    //   15: getfield Dne : I
    //   18: aload_0
    //   19: getfield Dne : Ljava/util/Random;
    //   22: bipush #16
    //   24: invokevirtual nextInt : (I)I
    //   27: iadd
    //   28: bipush #8
    //   30: iadd
    //   31: istore_2
    //   32: aload_0
    //   33: getfield FWm : I
    //   36: aload_0
    //   37: getfield Dne : Ljava/util/Random;
    //   40: bipush #16
    //   42: invokevirtual nextInt : (I)I
    //   45: iadd
    //   46: bipush #8
    //   48: iadd
    //   49: istore_3
    //   50: aload_0
    //   51: getfield FWm : Lgwq;
    //   54: aload_0
    //   55: getfield Dne : LQnq;
    //   58: aload_0
    //   59: getfield Dne : Ljava/util/Random;
    //   62: iload_2
    //   63: aload_0
    //   64: getfield Dne : LQnq;
    //   67: iload_2
    //   68: iload_3
    //   69: invokevirtual aFZ : (II)I
    //   72: iload_3
    //   73: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   76: pop
    //   77: iinc #1, 1
    //   80: goto -> 6
    //   83: iconst_0
    //   84: istore_1
    //   85: iload_1
    //   86: aload_0
    //   87: getfield kGO : I
    //   90: if_icmpge -> 162
    //   93: aload_0
    //   94: getfield Dne : I
    //   97: aload_0
    //   98: getfield Dne : Ljava/util/Random;
    //   101: bipush #16
    //   103: invokevirtual nextInt : (I)I
    //   106: iadd
    //   107: bipush #8
    //   109: iadd
    //   110: istore_2
    //   111: aload_0
    //   112: getfield FWm : I
    //   115: aload_0
    //   116: getfield Dne : Ljava/util/Random;
    //   119: bipush #16
    //   121: invokevirtual nextInt : (I)I
    //   124: iadd
    //   125: bipush #8
    //   127: iadd
    //   128: istore_3
    //   129: aload_0
    //   130: getfield Dne : Lgwq;
    //   133: aload_0
    //   134: getfield Dne : LQnq;
    //   137: aload_0
    //   138: getfield Dne : Ljava/util/Random;
    //   141: iload_2
    //   142: aload_0
    //   143: getfield Dne : LQnq;
    //   146: iload_2
    //   147: iload_3
    //   148: invokevirtual aFZ : (II)I
    //   151: iload_3
    //   152: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   155: pop
    //   156: iinc #1, 1
    //   159: goto -> 85
    //   162: iconst_0
    //   163: istore_1
    //   164: iload_1
    //   165: aload_0
    //   166: getfield XHL : I
    //   169: if_icmpge -> 241
    //   172: aload_0
    //   173: getfield Dne : I
    //   176: aload_0
    //   177: getfield Dne : Ljava/util/Random;
    //   180: bipush #16
    //   182: invokevirtual nextInt : (I)I
    //   185: iadd
    //   186: bipush #8
    //   188: iadd
    //   189: istore_2
    //   190: aload_0
    //   191: getfield FWm : I
    //   194: aload_0
    //   195: getfield Dne : Ljava/util/Random;
    //   198: bipush #16
    //   200: invokevirtual nextInt : (I)I
    //   203: iadd
    //   204: bipush #8
    //   206: iadd
    //   207: istore_3
    //   208: aload_0
    //   209: getfield FWm : Lgwq;
    //   212: aload_0
    //   213: getfield Dne : LQnq;
    //   216: aload_0
    //   217: getfield Dne : Ljava/util/Random;
    //   220: iload_2
    //   221: aload_0
    //   222: getfield Dne : LQnq;
    //   225: iload_2
    //   226: iload_3
    //   227: invokevirtual aFZ : (II)I
    //   230: iload_3
    //   231: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   234: pop
    //   235: iinc #1, 1
    //   238: goto -> 164
    //   241: aload_0
    //   242: getfield Qnq : I
    //   245: istore_1
    //   246: aload_0
    //   247: getfield Dne : Ljava/util/Random;
    //   250: bipush #10
    //   252: invokevirtual nextInt : (I)I
    //   255: ifne -> 261
    //   258: iinc #1, 1
    //   261: iconst_0
    //   262: istore_2
    //   263: iload_2
    //   264: iload_1
    //   265: if_icmpge -> 359
    //   268: aload_0
    //   269: getfield Dne : I
    //   272: aload_0
    //   273: getfield Dne : Ljava/util/Random;
    //   276: bipush #16
    //   278: invokevirtual nextInt : (I)I
    //   281: iadd
    //   282: bipush #8
    //   284: iadd
    //   285: istore_3
    //   286: aload_0
    //   287: getfield FWm : I
    //   290: aload_0
    //   291: getfield Dne : Ljava/util/Random;
    //   294: bipush #16
    //   296: invokevirtual nextInt : (I)I
    //   299: iadd
    //   300: bipush #8
    //   302: iadd
    //   303: istore #4
    //   305: aload_0
    //   306: getfield Dne : LOdI;
    //   309: aload_0
    //   310: getfield Dne : Ljava/util/Random;
    //   313: invokevirtual Dne : (Ljava/util/Random;)Lgwq;
    //   316: astore #5
    //   318: aload #5
    //   320: dconst_1
    //   321: dconst_1
    //   322: dconst_1
    //   323: invokevirtual Dne : (DDD)V
    //   326: aload #5
    //   328: aload_0
    //   329: getfield Dne : LQnq;
    //   332: aload_0
    //   333: getfield Dne : Ljava/util/Random;
    //   336: iload_3
    //   337: aload_0
    //   338: getfield Dne : LQnq;
    //   341: iload_3
    //   342: iload #4
    //   344: invokevirtual FWm : (II)I
    //   347: iload #4
    //   349: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   352: pop
    //   353: iinc #2, 1
    //   356: goto -> 263
    //   359: iconst_0
    //   360: istore_2
    //   361: iload_2
    //   362: aload_0
    //   363: getfield udO : I
    //   366: if_icmpge -> 441
    //   369: aload_0
    //   370: getfield Dne : I
    //   373: aload_0
    //   374: getfield Dne : Ljava/util/Random;
    //   377: bipush #16
    //   379: invokevirtual nextInt : (I)I
    //   382: iadd
    //   383: bipush #8
    //   385: iadd
    //   386: istore_3
    //   387: aload_0
    //   388: getfield FWm : I
    //   391: aload_0
    //   392: getfield Dne : Ljava/util/Random;
    //   395: bipush #16
    //   397: invokevirtual nextInt : (I)I
    //   400: iadd
    //   401: bipush #8
    //   403: iadd
    //   404: istore #4
    //   406: aload_0
    //   407: getfield trS : Lgwq;
    //   410: aload_0
    //   411: getfield Dne : LQnq;
    //   414: aload_0
    //   415: getfield Dne : Ljava/util/Random;
    //   418: iload_3
    //   419: aload_0
    //   420: getfield Dne : LQnq;
    //   423: iload_3
    //   424: iload #4
    //   426: invokevirtual FWm : (II)I
    //   429: iload #4
    //   431: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   434: pop
    //   435: iinc #2, 1
    //   438: goto -> 361
    //   441: iconst_0
    //   442: istore_2
    //   443: iload_2
    //   444: aload_0
    //   445: getfield aFZ : I
    //   448: if_icmpge -> 608
    //   451: aload_0
    //   452: getfield Dne : I
    //   455: aload_0
    //   456: getfield Dne : Ljava/util/Random;
    //   459: bipush #16
    //   461: invokevirtual nextInt : (I)I
    //   464: iadd
    //   465: bipush #8
    //   467: iadd
    //   468: istore_3
    //   469: aload_0
    //   470: getfield Dne : Ljava/util/Random;
    //   473: sipush #128
    //   476: invokevirtual nextInt : (I)I
    //   479: istore #4
    //   481: aload_0
    //   482: getfield FWm : I
    //   485: aload_0
    //   486: getfield Dne : Ljava/util/Random;
    //   489: bipush #16
    //   491: invokevirtual nextInt : (I)I
    //   494: iadd
    //   495: bipush #8
    //   497: iadd
    //   498: istore #5
    //   500: aload_0
    //   501: getfield Zpi : Lgwq;
    //   504: aload_0
    //   505: getfield Dne : LQnq;
    //   508: aload_0
    //   509: getfield Dne : Ljava/util/Random;
    //   512: iload_3
    //   513: iload #4
    //   515: iload #5
    //   517: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   520: pop
    //   521: aload_0
    //   522: getfield Dne : Ljava/util/Random;
    //   525: iconst_4
    //   526: invokevirtual nextInt : (I)I
    //   529: ifne -> 602
    //   532: aload_0
    //   533: getfield Dne : I
    //   536: aload_0
    //   537: getfield Dne : Ljava/util/Random;
    //   540: bipush #16
    //   542: invokevirtual nextInt : (I)I
    //   545: iadd
    //   546: bipush #8
    //   548: iadd
    //   549: istore_3
    //   550: aload_0
    //   551: getfield Dne : Ljava/util/Random;
    //   554: sipush #128
    //   557: invokevirtual nextInt : (I)I
    //   560: istore #4
    //   562: aload_0
    //   563: getfield FWm : I
    //   566: aload_0
    //   567: getfield Dne : Ljava/util/Random;
    //   570: bipush #16
    //   572: invokevirtual nextInt : (I)I
    //   575: iadd
    //   576: bipush #8
    //   578: iadd
    //   579: istore #5
    //   581: aload_0
    //   582: getfield kGO : Lgwq;
    //   585: aload_0
    //   586: getfield Dne : LQnq;
    //   589: aload_0
    //   590: getfield Dne : Ljava/util/Random;
    //   593: iload_3
    //   594: iload #4
    //   596: iload #5
    //   598: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   601: pop
    //   602: iinc #2, 1
    //   605: goto -> 443
    //   608: iconst_0
    //   609: istore_2
    //   610: iload_2
    //   611: aload_0
    //   612: getfield zGp : I
    //   615: if_icmpge -> 705
    //   618: aload_0
    //   619: getfield Dne : I
    //   622: aload_0
    //   623: getfield Dne : Ljava/util/Random;
    //   626: bipush #16
    //   628: invokevirtual nextInt : (I)I
    //   631: iadd
    //   632: bipush #8
    //   634: iadd
    //   635: istore_3
    //   636: aload_0
    //   637: getfield Dne : Ljava/util/Random;
    //   640: sipush #128
    //   643: invokevirtual nextInt : (I)I
    //   646: istore #4
    //   648: aload_0
    //   649: getfield FWm : I
    //   652: aload_0
    //   653: getfield Dne : Ljava/util/Random;
    //   656: bipush #16
    //   658: invokevirtual nextInt : (I)I
    //   661: iadd
    //   662: bipush #8
    //   664: iadd
    //   665: istore #5
    //   667: aload_0
    //   668: getfield Dne : LOdI;
    //   671: aload_0
    //   672: getfield Dne : Ljava/util/Random;
    //   675: invokevirtual FWm : (Ljava/util/Random;)Lgwq;
    //   678: astore #6
    //   680: aload #6
    //   682: aload_0
    //   683: getfield Dne : LQnq;
    //   686: aload_0
    //   687: getfield Dne : Ljava/util/Random;
    //   690: iload_3
    //   691: iload #4
    //   693: iload #5
    //   695: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   698: pop
    //   699: iinc #2, 1
    //   702: goto -> 610
    //   705: iconst_0
    //   706: istore_2
    //   707: iload_2
    //   708: aload_0
    //   709: getfield DyG : I
    //   712: if_icmpge -> 800
    //   715: aload_0
    //   716: getfield Dne : I
    //   719: aload_0
    //   720: getfield Dne : Ljava/util/Random;
    //   723: bipush #16
    //   725: invokevirtual nextInt : (I)I
    //   728: iadd
    //   729: bipush #8
    //   731: iadd
    //   732: istore_3
    //   733: aload_0
    //   734: getfield Dne : Ljava/util/Random;
    //   737: sipush #128
    //   740: invokevirtual nextInt : (I)I
    //   743: istore #4
    //   745: aload_0
    //   746: getfield FWm : I
    //   749: aload_0
    //   750: getfield Dne : Ljava/util/Random;
    //   753: bipush #16
    //   755: invokevirtual nextInt : (I)I
    //   758: iadd
    //   759: bipush #8
    //   761: iadd
    //   762: istore #5
    //   764: new Sdr
    //   767: dup
    //   768: getstatic zKP.Dne : LbdU;
    //   771: getfield FWm : I
    //   774: invokespecial <init> : (I)V
    //   777: aload_0
    //   778: getfield Dne : LQnq;
    //   781: aload_0
    //   782: getfield Dne : Ljava/util/Random;
    //   785: iload_3
    //   786: iload #4
    //   788: iload #5
    //   790: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   793: pop
    //   794: iinc #2, 1
    //   797: goto -> 707
    //   800: iconst_0
    //   801: istore_2
    //   802: iload_2
    //   803: aload_0
    //   804: getfield bzF : I
    //   807: if_icmpge -> 914
    //   810: aload_0
    //   811: getfield Dne : I
    //   814: aload_0
    //   815: getfield Dne : Ljava/util/Random;
    //   818: bipush #16
    //   820: invokevirtual nextInt : (I)I
    //   823: iadd
    //   824: bipush #8
    //   826: iadd
    //   827: istore_3
    //   828: aload_0
    //   829: getfield FWm : I
    //   832: aload_0
    //   833: getfield Dne : Ljava/util/Random;
    //   836: bipush #16
    //   838: invokevirtual nextInt : (I)I
    //   841: iadd
    //   842: bipush #8
    //   844: iadd
    //   845: istore #4
    //   847: aload_0
    //   848: getfield Dne : Ljava/util/Random;
    //   851: sipush #128
    //   854: invokevirtual nextInt : (I)I
    //   857: istore #5
    //   859: iload #5
    //   861: ifle -> 887
    //   864: aload_0
    //   865: getfield Dne : LQnq;
    //   868: iload_3
    //   869: iload #5
    //   871: iconst_1
    //   872: isub
    //   873: iload #4
    //   875: invokevirtual Dne : (III)I
    //   878: ifne -> 887
    //   881: iinc #5, -1
    //   884: goto -> 859
    //   887: aload_0
    //   888: getfield Vxn : Lgwq;
    //   891: aload_0
    //   892: getfield Dne : LQnq;
    //   895: aload_0
    //   896: getfield Dne : Ljava/util/Random;
    //   899: iload_3
    //   900: iload #5
    //   902: iload #4
    //   904: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   907: pop
    //   908: iinc #2, 1
    //   911: goto -> 802
    //   914: iconst_0
    //   915: istore_2
    //   916: iload_2
    //   917: aload_0
    //   918: getfield div : I
    //   921: if_icmpge -> 1093
    //   924: aload_0
    //   925: getfield Dne : Ljava/util/Random;
    //   928: iconst_4
    //   929: invokevirtual nextInt : (I)I
    //   932: ifne -> 1005
    //   935: aload_0
    //   936: getfield Dne : I
    //   939: aload_0
    //   940: getfield Dne : Ljava/util/Random;
    //   943: bipush #16
    //   945: invokevirtual nextInt : (I)I
    //   948: iadd
    //   949: bipush #8
    //   951: iadd
    //   952: istore_3
    //   953: aload_0
    //   954: getfield FWm : I
    //   957: aload_0
    //   958: getfield Dne : Ljava/util/Random;
    //   961: bipush #16
    //   963: invokevirtual nextInt : (I)I
    //   966: iadd
    //   967: bipush #8
    //   969: iadd
    //   970: istore #4
    //   972: aload_0
    //   973: getfield Dne : LQnq;
    //   976: iload_3
    //   977: iload #4
    //   979: invokevirtual FWm : (II)I
    //   982: istore #5
    //   984: aload_0
    //   985: getfield udO : Lgwq;
    //   988: aload_0
    //   989: getfield Dne : LQnq;
    //   992: aload_0
    //   993: getfield Dne : Ljava/util/Random;
    //   996: iload_3
    //   997: iload #5
    //   999: iload #4
    //   1001: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1004: pop
    //   1005: aload_0
    //   1006: getfield Dne : Ljava/util/Random;
    //   1009: bipush #8
    //   1011: invokevirtual nextInt : (I)I
    //   1014: ifne -> 1087
    //   1017: aload_0
    //   1018: getfield Dne : I
    //   1021: aload_0
    //   1022: getfield Dne : Ljava/util/Random;
    //   1025: bipush #16
    //   1027: invokevirtual nextInt : (I)I
    //   1030: iadd
    //   1031: bipush #8
    //   1033: iadd
    //   1034: istore_3
    //   1035: aload_0
    //   1036: getfield FWm : I
    //   1039: aload_0
    //   1040: getfield Dne : Ljava/util/Random;
    //   1043: bipush #16
    //   1045: invokevirtual nextInt : (I)I
    //   1048: iadd
    //   1049: bipush #8
    //   1051: iadd
    //   1052: istore #4
    //   1054: aload_0
    //   1055: getfield Dne : Ljava/util/Random;
    //   1058: sipush #128
    //   1061: invokevirtual nextInt : (I)I
    //   1064: istore #5
    //   1066: aload_0
    //   1067: getfield ooe : Lgwq;
    //   1070: aload_0
    //   1071: getfield Dne : LQnq;
    //   1074: aload_0
    //   1075: getfield Dne : Ljava/util/Random;
    //   1078: iload_3
    //   1079: iload #5
    //   1081: iload #4
    //   1083: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1086: pop
    //   1087: iinc #2, 1
    //   1090: goto -> 916
    //   1093: aload_0
    //   1094: getfield Dne : Ljava/util/Random;
    //   1097: iconst_4
    //   1098: invokevirtual nextInt : (I)I
    //   1101: ifne -> 1172
    //   1104: aload_0
    //   1105: getfield Dne : I
    //   1108: aload_0
    //   1109: getfield Dne : Ljava/util/Random;
    //   1112: bipush #16
    //   1114: invokevirtual nextInt : (I)I
    //   1117: iadd
    //   1118: bipush #8
    //   1120: iadd
    //   1121: istore_2
    //   1122: aload_0
    //   1123: getfield Dne : Ljava/util/Random;
    //   1126: sipush #128
    //   1129: invokevirtual nextInt : (I)I
    //   1132: istore_3
    //   1133: aload_0
    //   1134: getfield FWm : I
    //   1137: aload_0
    //   1138: getfield Dne : Ljava/util/Random;
    //   1141: bipush #16
    //   1143: invokevirtual nextInt : (I)I
    //   1146: iadd
    //   1147: bipush #8
    //   1149: iadd
    //   1150: istore #4
    //   1152: aload_0
    //   1153: getfield udO : Lgwq;
    //   1156: aload_0
    //   1157: getfield Dne : LQnq;
    //   1160: aload_0
    //   1161: getfield Dne : Ljava/util/Random;
    //   1164: iload_2
    //   1165: iload_3
    //   1166: iload #4
    //   1168: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1171: pop
    //   1172: aload_0
    //   1173: getfield Dne : Ljava/util/Random;
    //   1176: bipush #8
    //   1178: invokevirtual nextInt : (I)I
    //   1181: ifne -> 1252
    //   1184: aload_0
    //   1185: getfield Dne : I
    //   1188: aload_0
    //   1189: getfield Dne : Ljava/util/Random;
    //   1192: bipush #16
    //   1194: invokevirtual nextInt : (I)I
    //   1197: iadd
    //   1198: bipush #8
    //   1200: iadd
    //   1201: istore_2
    //   1202: aload_0
    //   1203: getfield Dne : Ljava/util/Random;
    //   1206: sipush #128
    //   1209: invokevirtual nextInt : (I)I
    //   1212: istore_3
    //   1213: aload_0
    //   1214: getfield FWm : I
    //   1217: aload_0
    //   1218: getfield Dne : Ljava/util/Random;
    //   1221: bipush #16
    //   1223: invokevirtual nextInt : (I)I
    //   1226: iadd
    //   1227: bipush #8
    //   1229: iadd
    //   1230: istore #4
    //   1232: aload_0
    //   1233: getfield ooe : Lgwq;
    //   1236: aload_0
    //   1237: getfield Dne : LQnq;
    //   1240: aload_0
    //   1241: getfield Dne : Ljava/util/Random;
    //   1244: iload_2
    //   1245: iload_3
    //   1246: iload #4
    //   1248: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1251: pop
    //   1252: iconst_0
    //   1253: istore_2
    //   1254: iload_2
    //   1255: aload_0
    //   1256: getfield IjH : I
    //   1259: if_icmpge -> 1338
    //   1262: aload_0
    //   1263: getfield Dne : I
    //   1266: aload_0
    //   1267: getfield Dne : Ljava/util/Random;
    //   1270: bipush #16
    //   1272: invokevirtual nextInt : (I)I
    //   1275: iadd
    //   1276: bipush #8
    //   1278: iadd
    //   1279: istore_3
    //   1280: aload_0
    //   1281: getfield FWm : I
    //   1284: aload_0
    //   1285: getfield Dne : Ljava/util/Random;
    //   1288: bipush #16
    //   1290: invokevirtual nextInt : (I)I
    //   1293: iadd
    //   1294: bipush #8
    //   1296: iadd
    //   1297: istore #4
    //   1299: aload_0
    //   1300: getfield Dne : Ljava/util/Random;
    //   1303: sipush #128
    //   1306: invokevirtual nextInt : (I)I
    //   1309: istore #5
    //   1311: aload_0
    //   1312: getfield qLR : Lgwq;
    //   1315: aload_0
    //   1316: getfield Dne : LQnq;
    //   1319: aload_0
    //   1320: getfield Dne : Ljava/util/Random;
    //   1323: iload_3
    //   1324: iload #5
    //   1326: iload #4
    //   1328: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1331: pop
    //   1332: iinc #2, 1
    //   1335: goto -> 1254
    //   1338: iconst_0
    //   1339: istore_2
    //   1340: iload_2
    //   1341: bipush #10
    //   1343: if_icmpge -> 1422
    //   1346: aload_0
    //   1347: getfield Dne : I
    //   1350: aload_0
    //   1351: getfield Dne : Ljava/util/Random;
    //   1354: bipush #16
    //   1356: invokevirtual nextInt : (I)I
    //   1359: iadd
    //   1360: bipush #8
    //   1362: iadd
    //   1363: istore_3
    //   1364: aload_0
    //   1365: getfield Dne : Ljava/util/Random;
    //   1368: sipush #128
    //   1371: invokevirtual nextInt : (I)I
    //   1374: istore #4
    //   1376: aload_0
    //   1377: getfield FWm : I
    //   1380: aload_0
    //   1381: getfield Dne : Ljava/util/Random;
    //   1384: bipush #16
    //   1386: invokevirtual nextInt : (I)I
    //   1389: iadd
    //   1390: bipush #8
    //   1392: iadd
    //   1393: istore #5
    //   1395: aload_0
    //   1396: getfield qLR : Lgwq;
    //   1399: aload_0
    //   1400: getfield Dne : LQnq;
    //   1403: aload_0
    //   1404: getfield Dne : Ljava/util/Random;
    //   1407: iload_3
    //   1408: iload #4
    //   1410: iload #5
    //   1412: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1415: pop
    //   1416: iinc #2, 1
    //   1419: goto -> 1340
    //   1422: aload_0
    //   1423: getfield Dne : Ljava/util/Random;
    //   1426: bipush #32
    //   1428: invokevirtual nextInt : (I)I
    //   1431: ifne -> 1505
    //   1434: aload_0
    //   1435: getfield Dne : I
    //   1438: aload_0
    //   1439: getfield Dne : Ljava/util/Random;
    //   1442: bipush #16
    //   1444: invokevirtual nextInt : (I)I
    //   1447: iadd
    //   1448: bipush #8
    //   1450: iadd
    //   1451: istore_2
    //   1452: aload_0
    //   1453: getfield Dne : Ljava/util/Random;
    //   1456: sipush #128
    //   1459: invokevirtual nextInt : (I)I
    //   1462: istore_3
    //   1463: aload_0
    //   1464: getfield FWm : I
    //   1467: aload_0
    //   1468: getfield Dne : Ljava/util/Random;
    //   1471: bipush #16
    //   1473: invokevirtual nextInt : (I)I
    //   1476: iadd
    //   1477: bipush #8
    //   1479: iadd
    //   1480: istore #4
    //   1482: new OCU
    //   1485: dup
    //   1486: invokespecial <init> : ()V
    //   1489: aload_0
    //   1490: getfield Dne : LQnq;
    //   1493: aload_0
    //   1494: getfield Dne : Ljava/util/Random;
    //   1497: iload_2
    //   1498: iload_3
    //   1499: iload #4
    //   1501: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1504: pop
    //   1505: iconst_0
    //   1506: istore_2
    //   1507: iload_2
    //   1508: aload_0
    //   1509: getfield mrb : I
    //   1512: if_icmpge -> 1591
    //   1515: aload_0
    //   1516: getfield Dne : I
    //   1519: aload_0
    //   1520: getfield Dne : Ljava/util/Random;
    //   1523: bipush #16
    //   1525: invokevirtual nextInt : (I)I
    //   1528: iadd
    //   1529: bipush #8
    //   1531: iadd
    //   1532: istore_3
    //   1533: aload_0
    //   1534: getfield Dne : Ljava/util/Random;
    //   1537: sipush #128
    //   1540: invokevirtual nextInt : (I)I
    //   1543: istore #4
    //   1545: aload_0
    //   1546: getfield FWm : I
    //   1549: aload_0
    //   1550: getfield Dne : Ljava/util/Random;
    //   1553: bipush #16
    //   1555: invokevirtual nextInt : (I)I
    //   1558: iadd
    //   1559: bipush #8
    //   1561: iadd
    //   1562: istore #5
    //   1564: aload_0
    //   1565: getfield ATE : Lgwq;
    //   1568: aload_0
    //   1569: getfield Dne : LQnq;
    //   1572: aload_0
    //   1573: getfield Dne : Ljava/util/Random;
    //   1576: iload_3
    //   1577: iload #4
    //   1579: iload #5
    //   1581: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1584: pop
    //   1585: iinc #2, 1
    //   1588: goto -> 1507
    //   1591: aload_0
    //   1592: getfield Dne : Z
    //   1595: ifeq -> 1812
    //   1598: iconst_0
    //   1599: istore_2
    //   1600: iload_2
    //   1601: bipush #50
    //   1603: if_icmpge -> 1700
    //   1606: aload_0
    //   1607: getfield Dne : I
    //   1610: aload_0
    //   1611: getfield Dne : Ljava/util/Random;
    //   1614: bipush #16
    //   1616: invokevirtual nextInt : (I)I
    //   1619: iadd
    //   1620: bipush #8
    //   1622: iadd
    //   1623: istore_3
    //   1624: aload_0
    //   1625: getfield Dne : Ljava/util/Random;
    //   1628: aload_0
    //   1629: getfield Dne : Ljava/util/Random;
    //   1632: bipush #120
    //   1634: invokevirtual nextInt : (I)I
    //   1637: bipush #8
    //   1639: iadd
    //   1640: invokevirtual nextInt : (I)I
    //   1643: istore #4
    //   1645: aload_0
    //   1646: getfield FWm : I
    //   1649: aload_0
    //   1650: getfield Dne : Ljava/util/Random;
    //   1653: bipush #16
    //   1655: invokevirtual nextInt : (I)I
    //   1658: iadd
    //   1659: bipush #8
    //   1661: iadd
    //   1662: istore #5
    //   1664: new ZkM
    //   1667: dup
    //   1668: getstatic zKP.Dne : Lbyt;
    //   1671: getfield FWm : I
    //   1674: invokespecial <init> : (I)V
    //   1677: aload_0
    //   1678: getfield Dne : LQnq;
    //   1681: aload_0
    //   1682: getfield Dne : Ljava/util/Random;
    //   1685: iload_3
    //   1686: iload #4
    //   1688: iload #5
    //   1690: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1693: pop
    //   1694: iinc #2, 1
    //   1697: goto -> 1600
    //   1700: iconst_0
    //   1701: istore_2
    //   1702: iload_2
    //   1703: bipush #20
    //   1705: if_icmpge -> 1812
    //   1708: aload_0
    //   1709: getfield Dne : I
    //   1712: aload_0
    //   1713: getfield Dne : Ljava/util/Random;
    //   1716: bipush #16
    //   1718: invokevirtual nextInt : (I)I
    //   1721: iadd
    //   1722: bipush #8
    //   1724: iadd
    //   1725: istore_3
    //   1726: aload_0
    //   1727: getfield Dne : Ljava/util/Random;
    //   1730: aload_0
    //   1731: getfield Dne : Ljava/util/Random;
    //   1734: aload_0
    //   1735: getfield Dne : Ljava/util/Random;
    //   1738: bipush #112
    //   1740: invokevirtual nextInt : (I)I
    //   1743: bipush #8
    //   1745: iadd
    //   1746: invokevirtual nextInt : (I)I
    //   1749: bipush #8
    //   1751: iadd
    //   1752: invokevirtual nextInt : (I)I
    //   1755: istore #4
    //   1757: aload_0
    //   1758: getfield FWm : I
    //   1761: aload_0
    //   1762: getfield Dne : Ljava/util/Random;
    //   1765: bipush #16
    //   1767: invokevirtual nextInt : (I)I
    //   1770: iadd
    //   1771: bipush #8
    //   1773: iadd
    //   1774: istore #5
    //   1776: new ZkM
    //   1779: dup
    //   1780: getstatic zKP.FWm : Lbyt;
    //   1783: getfield FWm : I
    //   1786: invokespecial <init> : (I)V
    //   1789: aload_0
    //   1790: getfield Dne : LQnq;
    //   1793: aload_0
    //   1794: getfield Dne : Ljava/util/Random;
    //   1797: iload_3
    //   1798: iload #4
    //   1800: iload #5
    //   1802: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   1805: pop
    //   1806: iinc #2, 1
    //   1809: goto -> 1702
    //   1812: return
  }
  
  public Fnk(OdI paramOdI) {
    this.bzF = false;
    this.Qnq = 0;
    this.aFZ = 2;
    this.zGp = 1;
    this.DyG = 0;
    this.div = false;
    this.IjH = 0;
    this.mrb = false;
    this.XHL = true;
    this.Zpi = 3;
    this.kGO = 1;
    this.udO = 0;
    this.Dne = true;
    this.Dne = paramOdI;
  }
  
  protected void FWm(int paramInt1, gwq paramgwq, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iload #5
    //   5: iload_1
    //   6: if_icmpge -> 92
    //   9: aload_0
    //   10: getfield Dne : I
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/Random;
    //   17: bipush #16
    //   19: invokevirtual nextInt : (I)I
    //   22: iadd
    //   23: istore #6
    //   25: aload_0
    //   26: getfield Dne : Ljava/util/Random;
    //   29: iload #4
    //   31: invokevirtual nextInt : (I)I
    //   34: aload_0
    //   35: getfield Dne : Ljava/util/Random;
    //   38: iload #4
    //   40: invokevirtual nextInt : (I)I
    //   43: iadd
    //   44: iload_3
    //   45: iload #4
    //   47: isub
    //   48: iadd
    //   49: istore #7
    //   51: aload_0
    //   52: getfield FWm : I
    //   55: aload_0
    //   56: getfield Dne : Ljava/util/Random;
    //   59: bipush #16
    //   61: invokevirtual nextInt : (I)I
    //   64: iadd
    //   65: istore #8
    //   67: aload_2
    //   68: aload_0
    //   69: getfield Dne : LQnq;
    //   72: aload_0
    //   73: getfield Dne : Ljava/util/Random;
    //   76: iload #6
    //   78: iload #7
    //   80: iload #8
    //   82: invokevirtual Dne : (LQnq;Ljava/util/Random;III)Z
    //   85: pop
    //   86: iinc #5, 1
    //   89: goto -> 3
    //   92: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Fnk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */