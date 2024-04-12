import java.util.List;
import java.util.Random;

public class CVf extends ram {
  private int Dne;
  
  private final boolean Dne = true;
  
  public CVf(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.Dne = paramRandom.nextBoolean();
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifge -> 52
    //   7: aload_0
    //   8: aload_0
    //   9: aload_1
    //   10: aload_3
    //   11: invokevirtual Dne : (LQnq;LCLK;)I
    //   14: putfield Dne : I
    //   17: aload_0
    //   18: getfield Dne : I
    //   21: ifge -> 26
    //   24: iconst_1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield Dne : LCLK;
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield Dne : I
    //   35: aload_0
    //   36: getfield Dne : LCLK;
    //   39: getfield aFZ : I
    //   42: isub
    //   43: bipush #6
    //   45: iadd
    //   46: iconst_1
    //   47: isub
    //   48: iconst_0
    //   49: invokevirtual Dne : (III)V
    //   52: aload_0
    //   53: aload_1
    //   54: aload_3
    //   55: iconst_0
    //   56: iconst_0
    //   57: iconst_0
    //   58: iconst_4
    //   59: iconst_0
    //   60: iconst_4
    //   61: getstatic zKP.bzF : LzKP;
    //   64: getfield FWm : I
    //   67: getstatic zKP.bzF : LzKP;
    //   70: getfield FWm : I
    //   73: iconst_0
    //   74: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   77: aload_0
    //   78: aload_1
    //   79: aload_3
    //   80: iconst_0
    //   81: iconst_4
    //   82: iconst_0
    //   83: iconst_4
    //   84: iconst_4
    //   85: iconst_4
    //   86: getstatic zKP.udO : LzKP;
    //   89: getfield FWm : I
    //   92: getstatic zKP.udO : LzKP;
    //   95: getfield FWm : I
    //   98: iconst_0
    //   99: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   102: aload_0
    //   103: aload_1
    //   104: aload_3
    //   105: iconst_1
    //   106: iconst_4
    //   107: iconst_1
    //   108: iconst_3
    //   109: iconst_4
    //   110: iconst_3
    //   111: getstatic zKP.Qnq : LzKP;
    //   114: getfield FWm : I
    //   117: getstatic zKP.Qnq : LzKP;
    //   120: getfield FWm : I
    //   123: iconst_0
    //   124: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   127: aload_0
    //   128: aload_1
    //   129: getstatic zKP.bzF : LzKP;
    //   132: getfield FWm : I
    //   135: iconst_0
    //   136: iconst_0
    //   137: iconst_1
    //   138: iconst_0
    //   139: aload_3
    //   140: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   143: aload_0
    //   144: aload_1
    //   145: getstatic zKP.bzF : LzKP;
    //   148: getfield FWm : I
    //   151: iconst_0
    //   152: iconst_0
    //   153: iconst_2
    //   154: iconst_0
    //   155: aload_3
    //   156: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   159: aload_0
    //   160: aload_1
    //   161: getstatic zKP.bzF : LzKP;
    //   164: getfield FWm : I
    //   167: iconst_0
    //   168: iconst_0
    //   169: iconst_3
    //   170: iconst_0
    //   171: aload_3
    //   172: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   175: aload_0
    //   176: aload_1
    //   177: getstatic zKP.bzF : LzKP;
    //   180: getfield FWm : I
    //   183: iconst_0
    //   184: iconst_4
    //   185: iconst_1
    //   186: iconst_0
    //   187: aload_3
    //   188: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   191: aload_0
    //   192: aload_1
    //   193: getstatic zKP.bzF : LzKP;
    //   196: getfield FWm : I
    //   199: iconst_0
    //   200: iconst_4
    //   201: iconst_2
    //   202: iconst_0
    //   203: aload_3
    //   204: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   207: aload_0
    //   208: aload_1
    //   209: getstatic zKP.bzF : LzKP;
    //   212: getfield FWm : I
    //   215: iconst_0
    //   216: iconst_4
    //   217: iconst_3
    //   218: iconst_0
    //   219: aload_3
    //   220: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   223: aload_0
    //   224: aload_1
    //   225: getstatic zKP.bzF : LzKP;
    //   228: getfield FWm : I
    //   231: iconst_0
    //   232: iconst_0
    //   233: iconst_1
    //   234: iconst_4
    //   235: aload_3
    //   236: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   239: aload_0
    //   240: aload_1
    //   241: getstatic zKP.bzF : LzKP;
    //   244: getfield FWm : I
    //   247: iconst_0
    //   248: iconst_0
    //   249: iconst_2
    //   250: iconst_4
    //   251: aload_3
    //   252: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   255: aload_0
    //   256: aload_1
    //   257: getstatic zKP.bzF : LzKP;
    //   260: getfield FWm : I
    //   263: iconst_0
    //   264: iconst_0
    //   265: iconst_3
    //   266: iconst_4
    //   267: aload_3
    //   268: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   271: aload_0
    //   272: aload_1
    //   273: getstatic zKP.bzF : LzKP;
    //   276: getfield FWm : I
    //   279: iconst_0
    //   280: iconst_4
    //   281: iconst_1
    //   282: iconst_4
    //   283: aload_3
    //   284: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   287: aload_0
    //   288: aload_1
    //   289: getstatic zKP.bzF : LzKP;
    //   292: getfield FWm : I
    //   295: iconst_0
    //   296: iconst_4
    //   297: iconst_2
    //   298: iconst_4
    //   299: aload_3
    //   300: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   303: aload_0
    //   304: aload_1
    //   305: getstatic zKP.bzF : LzKP;
    //   308: getfield FWm : I
    //   311: iconst_0
    //   312: iconst_4
    //   313: iconst_3
    //   314: iconst_4
    //   315: aload_3
    //   316: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   319: aload_0
    //   320: aload_1
    //   321: aload_3
    //   322: iconst_0
    //   323: iconst_1
    //   324: iconst_1
    //   325: iconst_0
    //   326: iconst_3
    //   327: iconst_3
    //   328: getstatic zKP.Qnq : LzKP;
    //   331: getfield FWm : I
    //   334: getstatic zKP.Qnq : LzKP;
    //   337: getfield FWm : I
    //   340: iconst_0
    //   341: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   344: aload_0
    //   345: aload_1
    //   346: aload_3
    //   347: iconst_4
    //   348: iconst_1
    //   349: iconst_1
    //   350: iconst_4
    //   351: iconst_3
    //   352: iconst_3
    //   353: getstatic zKP.Qnq : LzKP;
    //   356: getfield FWm : I
    //   359: getstatic zKP.Qnq : LzKP;
    //   362: getfield FWm : I
    //   365: iconst_0
    //   366: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   369: aload_0
    //   370: aload_1
    //   371: aload_3
    //   372: iconst_1
    //   373: iconst_1
    //   374: iconst_4
    //   375: iconst_3
    //   376: iconst_3
    //   377: iconst_4
    //   378: getstatic zKP.Qnq : LzKP;
    //   381: getfield FWm : I
    //   384: getstatic zKP.Qnq : LzKP;
    //   387: getfield FWm : I
    //   390: iconst_0
    //   391: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   394: aload_0
    //   395: aload_1
    //   396: getstatic zKP.Lab : LzKP;
    //   399: getfield FWm : I
    //   402: iconst_0
    //   403: iconst_0
    //   404: iconst_2
    //   405: iconst_2
    //   406: aload_3
    //   407: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   410: aload_0
    //   411: aload_1
    //   412: getstatic zKP.Lab : LzKP;
    //   415: getfield FWm : I
    //   418: iconst_0
    //   419: iconst_2
    //   420: iconst_2
    //   421: iconst_4
    //   422: aload_3
    //   423: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   426: aload_0
    //   427: aload_1
    //   428: getstatic zKP.Lab : LzKP;
    //   431: getfield FWm : I
    //   434: iconst_0
    //   435: iconst_4
    //   436: iconst_2
    //   437: iconst_2
    //   438: aload_3
    //   439: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   442: aload_0
    //   443: aload_1
    //   444: getstatic zKP.Qnq : LzKP;
    //   447: getfield FWm : I
    //   450: iconst_0
    //   451: iconst_1
    //   452: iconst_1
    //   453: iconst_0
    //   454: aload_3
    //   455: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   458: aload_0
    //   459: aload_1
    //   460: getstatic zKP.Qnq : LzKP;
    //   463: getfield FWm : I
    //   466: iconst_0
    //   467: iconst_1
    //   468: iconst_2
    //   469: iconst_0
    //   470: aload_3
    //   471: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   474: aload_0
    //   475: aload_1
    //   476: getstatic zKP.Qnq : LzKP;
    //   479: getfield FWm : I
    //   482: iconst_0
    //   483: iconst_1
    //   484: iconst_3
    //   485: iconst_0
    //   486: aload_3
    //   487: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   490: aload_0
    //   491: aload_1
    //   492: getstatic zKP.Qnq : LzKP;
    //   495: getfield FWm : I
    //   498: iconst_0
    //   499: iconst_2
    //   500: iconst_3
    //   501: iconst_0
    //   502: aload_3
    //   503: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   506: aload_0
    //   507: aload_1
    //   508: getstatic zKP.Qnq : LzKP;
    //   511: getfield FWm : I
    //   514: iconst_0
    //   515: iconst_3
    //   516: iconst_3
    //   517: iconst_0
    //   518: aload_3
    //   519: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   522: aload_0
    //   523: aload_1
    //   524: getstatic zKP.Qnq : LzKP;
    //   527: getfield FWm : I
    //   530: iconst_0
    //   531: iconst_3
    //   532: iconst_2
    //   533: iconst_0
    //   534: aload_3
    //   535: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   538: aload_0
    //   539: aload_1
    //   540: getstatic zKP.Qnq : LzKP;
    //   543: getfield FWm : I
    //   546: iconst_0
    //   547: iconst_3
    //   548: iconst_1
    //   549: iconst_0
    //   550: aload_3
    //   551: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   554: aload_0
    //   555: aload_1
    //   556: iconst_2
    //   557: iconst_0
    //   558: iconst_m1
    //   559: aload_3
    //   560: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   563: ifne -> 604
    //   566: aload_0
    //   567: aload_1
    //   568: iconst_2
    //   569: iconst_m1
    //   570: iconst_m1
    //   571: aload_3
    //   572: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   575: ifeq -> 604
    //   578: aload_0
    //   579: aload_1
    //   580: getstatic zKP.BJH : LzKP;
    //   583: getfield FWm : I
    //   586: aload_0
    //   587: getstatic zKP.BJH : LzKP;
    //   590: getfield FWm : I
    //   593: iconst_3
    //   594: invokevirtual bzF : (II)I
    //   597: iconst_2
    //   598: iconst_0
    //   599: iconst_m1
    //   600: aload_3
    //   601: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   604: aload_0
    //   605: aload_1
    //   606: aload_3
    //   607: iconst_1
    //   608: iconst_1
    //   609: iconst_1
    //   610: iconst_3
    //   611: iconst_3
    //   612: iconst_3
    //   613: iconst_0
    //   614: iconst_0
    //   615: iconst_0
    //   616: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   619: aload_0
    //   620: getfield Dne : Z
    //   623: ifeq -> 882
    //   626: aload_0
    //   627: aload_1
    //   628: getstatic zKP.sly : LzKP;
    //   631: getfield FWm : I
    //   634: iconst_0
    //   635: iconst_0
    //   636: iconst_5
    //   637: iconst_0
    //   638: aload_3
    //   639: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   642: aload_0
    //   643: aload_1
    //   644: getstatic zKP.sly : LzKP;
    //   647: getfield FWm : I
    //   650: iconst_0
    //   651: iconst_1
    //   652: iconst_5
    //   653: iconst_0
    //   654: aload_3
    //   655: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   658: aload_0
    //   659: aload_1
    //   660: getstatic zKP.sly : LzKP;
    //   663: getfield FWm : I
    //   666: iconst_0
    //   667: iconst_2
    //   668: iconst_5
    //   669: iconst_0
    //   670: aload_3
    //   671: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   674: aload_0
    //   675: aload_1
    //   676: getstatic zKP.sly : LzKP;
    //   679: getfield FWm : I
    //   682: iconst_0
    //   683: iconst_3
    //   684: iconst_5
    //   685: iconst_0
    //   686: aload_3
    //   687: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   690: aload_0
    //   691: aload_1
    //   692: getstatic zKP.sly : LzKP;
    //   695: getfield FWm : I
    //   698: iconst_0
    //   699: iconst_4
    //   700: iconst_5
    //   701: iconst_0
    //   702: aload_3
    //   703: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   706: aload_0
    //   707: aload_1
    //   708: getstatic zKP.sly : LzKP;
    //   711: getfield FWm : I
    //   714: iconst_0
    //   715: iconst_0
    //   716: iconst_5
    //   717: iconst_4
    //   718: aload_3
    //   719: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   722: aload_0
    //   723: aload_1
    //   724: getstatic zKP.sly : LzKP;
    //   727: getfield FWm : I
    //   730: iconst_0
    //   731: iconst_1
    //   732: iconst_5
    //   733: iconst_4
    //   734: aload_3
    //   735: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   738: aload_0
    //   739: aload_1
    //   740: getstatic zKP.sly : LzKP;
    //   743: getfield FWm : I
    //   746: iconst_0
    //   747: iconst_2
    //   748: iconst_5
    //   749: iconst_4
    //   750: aload_3
    //   751: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   754: aload_0
    //   755: aload_1
    //   756: getstatic zKP.sly : LzKP;
    //   759: getfield FWm : I
    //   762: iconst_0
    //   763: iconst_3
    //   764: iconst_5
    //   765: iconst_4
    //   766: aload_3
    //   767: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   770: aload_0
    //   771: aload_1
    //   772: getstatic zKP.sly : LzKP;
    //   775: getfield FWm : I
    //   778: iconst_0
    //   779: iconst_4
    //   780: iconst_5
    //   781: iconst_4
    //   782: aload_3
    //   783: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   786: aload_0
    //   787: aload_1
    //   788: getstatic zKP.sly : LzKP;
    //   791: getfield FWm : I
    //   794: iconst_0
    //   795: iconst_4
    //   796: iconst_5
    //   797: iconst_1
    //   798: aload_3
    //   799: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   802: aload_0
    //   803: aload_1
    //   804: getstatic zKP.sly : LzKP;
    //   807: getfield FWm : I
    //   810: iconst_0
    //   811: iconst_4
    //   812: iconst_5
    //   813: iconst_2
    //   814: aload_3
    //   815: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   818: aload_0
    //   819: aload_1
    //   820: getstatic zKP.sly : LzKP;
    //   823: getfield FWm : I
    //   826: iconst_0
    //   827: iconst_4
    //   828: iconst_5
    //   829: iconst_3
    //   830: aload_3
    //   831: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   834: aload_0
    //   835: aload_1
    //   836: getstatic zKP.sly : LzKP;
    //   839: getfield FWm : I
    //   842: iconst_0
    //   843: iconst_0
    //   844: iconst_5
    //   845: iconst_1
    //   846: aload_3
    //   847: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   850: aload_0
    //   851: aload_1
    //   852: getstatic zKP.sly : LzKP;
    //   855: getfield FWm : I
    //   858: iconst_0
    //   859: iconst_0
    //   860: iconst_5
    //   861: iconst_2
    //   862: aload_3
    //   863: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   866: aload_0
    //   867: aload_1
    //   868: getstatic zKP.sly : LzKP;
    //   871: getfield FWm : I
    //   874: iconst_0
    //   875: iconst_0
    //   876: iconst_5
    //   877: iconst_3
    //   878: aload_3
    //   879: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   882: aload_0
    //   883: getfield Dne : Z
    //   886: ifeq -> 970
    //   889: aload_0
    //   890: getstatic zKP.ZfC : LzKP;
    //   893: getfield FWm : I
    //   896: iconst_3
    //   897: invokevirtual bzF : (II)I
    //   900: istore #4
    //   902: aload_0
    //   903: aload_1
    //   904: getstatic zKP.ZfC : LzKP;
    //   907: getfield FWm : I
    //   910: iload #4
    //   912: iconst_3
    //   913: iconst_1
    //   914: iconst_3
    //   915: aload_3
    //   916: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   919: aload_0
    //   920: aload_1
    //   921: getstatic zKP.ZfC : LzKP;
    //   924: getfield FWm : I
    //   927: iload #4
    //   929: iconst_3
    //   930: iconst_2
    //   931: iconst_3
    //   932: aload_3
    //   933: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   936: aload_0
    //   937: aload_1
    //   938: getstatic zKP.ZfC : LzKP;
    //   941: getfield FWm : I
    //   944: iload #4
    //   946: iconst_3
    //   947: iconst_3
    //   948: iconst_3
    //   949: aload_3
    //   950: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   953: aload_0
    //   954: aload_1
    //   955: getstatic zKP.ZfC : LzKP;
    //   958: getfield FWm : I
    //   961: iload #4
    //   963: iconst_3
    //   964: iconst_4
    //   965: iconst_3
    //   966: aload_3
    //   967: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   970: aload_0
    //   971: aload_1
    //   972: getstatic zKP.Wwe : LzKP;
    //   975: getfield FWm : I
    //   978: iconst_0
    //   979: iconst_2
    //   980: iconst_3
    //   981: iconst_1
    //   982: aload_3
    //   983: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   986: iconst_0
    //   987: istore #4
    //   989: iload #4
    //   991: iconst_5
    //   992: if_icmpge -> 1046
    //   995: iconst_0
    //   996: istore #5
    //   998: iload #5
    //   1000: iconst_5
    //   1001: if_icmpge -> 1040
    //   1004: aload_0
    //   1005: aload_1
    //   1006: iload #5
    //   1008: bipush #6
    //   1010: iload #4
    //   1012: aload_3
    //   1013: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   1016: aload_0
    //   1017: aload_1
    //   1018: getstatic zKP.bzF : LzKP;
    //   1021: getfield FWm : I
    //   1024: iconst_0
    //   1025: iload #5
    //   1027: iconst_m1
    //   1028: iload #4
    //   1030: aload_3
    //   1031: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   1034: iinc #5, 1
    //   1037: goto -> 998
    //   1040: iinc #4, 1
    //   1043: goto -> 989
    //   1046: aload_0
    //   1047: aload_1
    //   1048: aload_3
    //   1049: iconst_1
    //   1050: iconst_1
    //   1051: iconst_2
    //   1052: iconst_1
    //   1053: invokevirtual Dne : (LQnq;LCLK;IIII)V
    //   1056: iconst_1
    //   1057: ireturn
  }
  
  public static CVf Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 5, 6, 5, paramInt4);
    return (bvz.Dne(paramList, cLK) != null) ? null : new CVf(paramopc, paramInt5, paramRandom, cLK, paramInt4);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CVf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */