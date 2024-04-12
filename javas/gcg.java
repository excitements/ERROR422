import java.util.List;
import java.util.Random;

public class gcg extends ram {
  private int Dne = -1;
  
  public static gcg Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 7, 11, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new gcg(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
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
    //   43: bipush #7
    //   45: iadd
    //   46: iconst_1
    //   47: isub
    //   48: iconst_0
    //   49: invokevirtual Dne : (III)V
    //   52: aload_0
    //   53: aload_1
    //   54: aload_3
    //   55: iconst_1
    //   56: iconst_1
    //   57: iconst_1
    //   58: bipush #7
    //   60: iconst_4
    //   61: iconst_4
    //   62: iconst_0
    //   63: iconst_0
    //   64: iconst_0
    //   65: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   68: aload_0
    //   69: aload_1
    //   70: aload_3
    //   71: iconst_2
    //   72: iconst_1
    //   73: bipush #6
    //   75: bipush #8
    //   77: iconst_4
    //   78: bipush #10
    //   80: iconst_0
    //   81: iconst_0
    //   82: iconst_0
    //   83: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   86: aload_0
    //   87: aload_1
    //   88: aload_3
    //   89: iconst_2
    //   90: iconst_0
    //   91: bipush #6
    //   93: bipush #8
    //   95: iconst_0
    //   96: bipush #10
    //   98: getstatic zKP.FWm : LzKP;
    //   101: getfield FWm : I
    //   104: getstatic zKP.FWm : LzKP;
    //   107: getfield FWm : I
    //   110: iconst_0
    //   111: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   114: aload_0
    //   115: aload_1
    //   116: getstatic zKP.bzF : LzKP;
    //   119: getfield FWm : I
    //   122: iconst_0
    //   123: bipush #6
    //   125: iconst_0
    //   126: bipush #6
    //   128: aload_3
    //   129: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   132: aload_0
    //   133: aload_1
    //   134: aload_3
    //   135: iconst_2
    //   136: iconst_1
    //   137: bipush #6
    //   139: iconst_2
    //   140: iconst_1
    //   141: bipush #10
    //   143: getstatic zKP.sly : LzKP;
    //   146: getfield FWm : I
    //   149: getstatic zKP.sly : LzKP;
    //   152: getfield FWm : I
    //   155: iconst_0
    //   156: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   159: aload_0
    //   160: aload_1
    //   161: aload_3
    //   162: bipush #8
    //   164: iconst_1
    //   165: bipush #6
    //   167: bipush #8
    //   169: iconst_1
    //   170: bipush #10
    //   172: getstatic zKP.sly : LzKP;
    //   175: getfield FWm : I
    //   178: getstatic zKP.sly : LzKP;
    //   181: getfield FWm : I
    //   184: iconst_0
    //   185: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   188: aload_0
    //   189: aload_1
    //   190: aload_3
    //   191: iconst_3
    //   192: iconst_1
    //   193: bipush #10
    //   195: bipush #7
    //   197: iconst_1
    //   198: bipush #10
    //   200: getstatic zKP.sly : LzKP;
    //   203: getfield FWm : I
    //   206: getstatic zKP.sly : LzKP;
    //   209: getfield FWm : I
    //   212: iconst_0
    //   213: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   216: aload_0
    //   217: aload_1
    //   218: aload_3
    //   219: iconst_1
    //   220: iconst_0
    //   221: iconst_1
    //   222: bipush #7
    //   224: iconst_0
    //   225: iconst_4
    //   226: getstatic zKP.Qnq : LzKP;
    //   229: getfield FWm : I
    //   232: getstatic zKP.Qnq : LzKP;
    //   235: getfield FWm : I
    //   238: iconst_0
    //   239: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   242: aload_0
    //   243: aload_1
    //   244: aload_3
    //   245: iconst_0
    //   246: iconst_0
    //   247: iconst_0
    //   248: iconst_0
    //   249: iconst_3
    //   250: iconst_5
    //   251: getstatic zKP.bzF : LzKP;
    //   254: getfield FWm : I
    //   257: getstatic zKP.bzF : LzKP;
    //   260: getfield FWm : I
    //   263: iconst_0
    //   264: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   267: aload_0
    //   268: aload_1
    //   269: aload_3
    //   270: bipush #8
    //   272: iconst_0
    //   273: iconst_0
    //   274: bipush #8
    //   276: iconst_3
    //   277: iconst_5
    //   278: getstatic zKP.bzF : LzKP;
    //   281: getfield FWm : I
    //   284: getstatic zKP.bzF : LzKP;
    //   287: getfield FWm : I
    //   290: iconst_0
    //   291: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   294: aload_0
    //   295: aload_1
    //   296: aload_3
    //   297: iconst_1
    //   298: iconst_0
    //   299: iconst_0
    //   300: bipush #7
    //   302: iconst_1
    //   303: iconst_0
    //   304: getstatic zKP.bzF : LzKP;
    //   307: getfield FWm : I
    //   310: getstatic zKP.bzF : LzKP;
    //   313: getfield FWm : I
    //   316: iconst_0
    //   317: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   320: aload_0
    //   321: aload_1
    //   322: aload_3
    //   323: iconst_1
    //   324: iconst_0
    //   325: iconst_5
    //   326: bipush #7
    //   328: iconst_1
    //   329: iconst_5
    //   330: getstatic zKP.bzF : LzKP;
    //   333: getfield FWm : I
    //   336: getstatic zKP.bzF : LzKP;
    //   339: getfield FWm : I
    //   342: iconst_0
    //   343: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   346: aload_0
    //   347: aload_1
    //   348: aload_3
    //   349: iconst_1
    //   350: iconst_2
    //   351: iconst_0
    //   352: bipush #7
    //   354: iconst_3
    //   355: iconst_0
    //   356: getstatic zKP.Qnq : LzKP;
    //   359: getfield FWm : I
    //   362: getstatic zKP.Qnq : LzKP;
    //   365: getfield FWm : I
    //   368: iconst_0
    //   369: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   372: aload_0
    //   373: aload_1
    //   374: aload_3
    //   375: iconst_1
    //   376: iconst_2
    //   377: iconst_5
    //   378: bipush #7
    //   380: iconst_3
    //   381: iconst_5
    //   382: getstatic zKP.Qnq : LzKP;
    //   385: getfield FWm : I
    //   388: getstatic zKP.Qnq : LzKP;
    //   391: getfield FWm : I
    //   394: iconst_0
    //   395: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   398: aload_0
    //   399: aload_1
    //   400: aload_3
    //   401: iconst_0
    //   402: iconst_4
    //   403: iconst_1
    //   404: bipush #8
    //   406: iconst_4
    //   407: iconst_1
    //   408: getstatic zKP.Qnq : LzKP;
    //   411: getfield FWm : I
    //   414: getstatic zKP.Qnq : LzKP;
    //   417: getfield FWm : I
    //   420: iconst_0
    //   421: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   424: aload_0
    //   425: aload_1
    //   426: aload_3
    //   427: iconst_0
    //   428: iconst_4
    //   429: iconst_4
    //   430: bipush #8
    //   432: iconst_4
    //   433: iconst_4
    //   434: getstatic zKP.Qnq : LzKP;
    //   437: getfield FWm : I
    //   440: getstatic zKP.Qnq : LzKP;
    //   443: getfield FWm : I
    //   446: iconst_0
    //   447: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   450: aload_0
    //   451: aload_1
    //   452: aload_3
    //   453: iconst_0
    //   454: iconst_5
    //   455: iconst_2
    //   456: bipush #8
    //   458: iconst_5
    //   459: iconst_3
    //   460: getstatic zKP.Qnq : LzKP;
    //   463: getfield FWm : I
    //   466: getstatic zKP.Qnq : LzKP;
    //   469: getfield FWm : I
    //   472: iconst_0
    //   473: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   476: aload_0
    //   477: aload_1
    //   478: getstatic zKP.Qnq : LzKP;
    //   481: getfield FWm : I
    //   484: iconst_0
    //   485: iconst_0
    //   486: iconst_4
    //   487: iconst_2
    //   488: aload_3
    //   489: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   492: aload_0
    //   493: aload_1
    //   494: getstatic zKP.Qnq : LzKP;
    //   497: getfield FWm : I
    //   500: iconst_0
    //   501: iconst_0
    //   502: iconst_4
    //   503: iconst_3
    //   504: aload_3
    //   505: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   508: aload_0
    //   509: aload_1
    //   510: getstatic zKP.Qnq : LzKP;
    //   513: getfield FWm : I
    //   516: iconst_0
    //   517: bipush #8
    //   519: iconst_4
    //   520: iconst_2
    //   521: aload_3
    //   522: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   525: aload_0
    //   526: aload_1
    //   527: getstatic zKP.Qnq : LzKP;
    //   530: getfield FWm : I
    //   533: iconst_0
    //   534: bipush #8
    //   536: iconst_4
    //   537: iconst_3
    //   538: aload_3
    //   539: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   542: aload_0
    //   543: getstatic zKP.One : LzKP;
    //   546: getfield FWm : I
    //   549: iconst_3
    //   550: invokevirtual bzF : (II)I
    //   553: istore #4
    //   555: aload_0
    //   556: getstatic zKP.One : LzKP;
    //   559: getfield FWm : I
    //   562: iconst_2
    //   563: invokevirtual bzF : (II)I
    //   566: istore #5
    //   568: iconst_m1
    //   569: istore #6
    //   571: iload #6
    //   573: iconst_2
    //   574: if_icmpgt -> 645
    //   577: iconst_0
    //   578: istore #7
    //   580: iload #7
    //   582: bipush #8
    //   584: if_icmpgt -> 639
    //   587: aload_0
    //   588: aload_1
    //   589: getstatic zKP.One : LzKP;
    //   592: getfield FWm : I
    //   595: iload #4
    //   597: iload #7
    //   599: iconst_4
    //   600: iload #6
    //   602: iadd
    //   603: iload #6
    //   605: aload_3
    //   606: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   609: aload_0
    //   610: aload_1
    //   611: getstatic zKP.One : LzKP;
    //   614: getfield FWm : I
    //   617: iload #5
    //   619: iload #7
    //   621: iconst_4
    //   622: iload #6
    //   624: iadd
    //   625: iconst_5
    //   626: iload #6
    //   628: isub
    //   629: aload_3
    //   630: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   633: iinc #7, 1
    //   636: goto -> 580
    //   639: iinc #6, 1
    //   642: goto -> 571
    //   645: aload_0
    //   646: aload_1
    //   647: getstatic zKP.udO : LzKP;
    //   650: getfield FWm : I
    //   653: iconst_0
    //   654: iconst_0
    //   655: iconst_2
    //   656: iconst_1
    //   657: aload_3
    //   658: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   661: aload_0
    //   662: aload_1
    //   663: getstatic zKP.udO : LzKP;
    //   666: getfield FWm : I
    //   669: iconst_0
    //   670: iconst_0
    //   671: iconst_2
    //   672: iconst_4
    //   673: aload_3
    //   674: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   677: aload_0
    //   678: aload_1
    //   679: getstatic zKP.udO : LzKP;
    //   682: getfield FWm : I
    //   685: iconst_0
    //   686: bipush #8
    //   688: iconst_2
    //   689: iconst_1
    //   690: aload_3
    //   691: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   694: aload_0
    //   695: aload_1
    //   696: getstatic zKP.udO : LzKP;
    //   699: getfield FWm : I
    //   702: iconst_0
    //   703: bipush #8
    //   705: iconst_2
    //   706: iconst_4
    //   707: aload_3
    //   708: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   711: aload_0
    //   712: aload_1
    //   713: getstatic zKP.Lab : LzKP;
    //   716: getfield FWm : I
    //   719: iconst_0
    //   720: iconst_0
    //   721: iconst_2
    //   722: iconst_2
    //   723: aload_3
    //   724: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   727: aload_0
    //   728: aload_1
    //   729: getstatic zKP.Lab : LzKP;
    //   732: getfield FWm : I
    //   735: iconst_0
    //   736: iconst_0
    //   737: iconst_2
    //   738: iconst_3
    //   739: aload_3
    //   740: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   743: aload_0
    //   744: aload_1
    //   745: getstatic zKP.Lab : LzKP;
    //   748: getfield FWm : I
    //   751: iconst_0
    //   752: bipush #8
    //   754: iconst_2
    //   755: iconst_2
    //   756: aload_3
    //   757: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   760: aload_0
    //   761: aload_1
    //   762: getstatic zKP.Lab : LzKP;
    //   765: getfield FWm : I
    //   768: iconst_0
    //   769: bipush #8
    //   771: iconst_2
    //   772: iconst_3
    //   773: aload_3
    //   774: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   777: aload_0
    //   778: aload_1
    //   779: getstatic zKP.Lab : LzKP;
    //   782: getfield FWm : I
    //   785: iconst_0
    //   786: iconst_2
    //   787: iconst_2
    //   788: iconst_5
    //   789: aload_3
    //   790: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   793: aload_0
    //   794: aload_1
    //   795: getstatic zKP.Lab : LzKP;
    //   798: getfield FWm : I
    //   801: iconst_0
    //   802: iconst_3
    //   803: iconst_2
    //   804: iconst_5
    //   805: aload_3
    //   806: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   809: aload_0
    //   810: aload_1
    //   811: getstatic zKP.Lab : LzKP;
    //   814: getfield FWm : I
    //   817: iconst_0
    //   818: iconst_5
    //   819: iconst_2
    //   820: iconst_0
    //   821: aload_3
    //   822: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   825: aload_0
    //   826: aload_1
    //   827: getstatic zKP.Lab : LzKP;
    //   830: getfield FWm : I
    //   833: iconst_0
    //   834: bipush #6
    //   836: iconst_2
    //   837: iconst_5
    //   838: aload_3
    //   839: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   842: aload_0
    //   843: aload_1
    //   844: getstatic zKP.sly : LzKP;
    //   847: getfield FWm : I
    //   850: iconst_0
    //   851: iconst_2
    //   852: iconst_1
    //   853: iconst_3
    //   854: aload_3
    //   855: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   858: aload_0
    //   859: aload_1
    //   860: getstatic zKP.YHU : LzKP;
    //   863: getfield FWm : I
    //   866: iconst_0
    //   867: iconst_2
    //   868: iconst_2
    //   869: iconst_3
    //   870: aload_3
    //   871: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   874: aload_0
    //   875: aload_1
    //   876: getstatic zKP.Qnq : LzKP;
    //   879: getfield FWm : I
    //   882: iconst_0
    //   883: iconst_1
    //   884: iconst_1
    //   885: iconst_4
    //   886: aload_3
    //   887: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   890: aload_0
    //   891: aload_1
    //   892: getstatic zKP.One : LzKP;
    //   895: getfield FWm : I
    //   898: aload_0
    //   899: getstatic zKP.One : LzKP;
    //   902: getfield FWm : I
    //   905: iconst_3
    //   906: invokevirtual bzF : (II)I
    //   909: iconst_2
    //   910: iconst_1
    //   911: iconst_4
    //   912: aload_3
    //   913: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   916: aload_0
    //   917: aload_1
    //   918: getstatic zKP.One : LzKP;
    //   921: getfield FWm : I
    //   924: aload_0
    //   925: getstatic zKP.One : LzKP;
    //   928: getfield FWm : I
    //   931: iconst_1
    //   932: invokevirtual bzF : (II)I
    //   935: iconst_1
    //   936: iconst_1
    //   937: iconst_3
    //   938: aload_3
    //   939: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   942: aload_0
    //   943: aload_1
    //   944: aload_3
    //   945: iconst_5
    //   946: iconst_0
    //   947: iconst_1
    //   948: bipush #7
    //   950: iconst_0
    //   951: iconst_3
    //   952: getstatic zKP.Dne : LdNT;
    //   955: getfield FWm : I
    //   958: getstatic zKP.Dne : LdNT;
    //   961: getfield FWm : I
    //   964: iconst_0
    //   965: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   968: aload_0
    //   969: aload_1
    //   970: getstatic zKP.Dne : LdNT;
    //   973: getfield FWm : I
    //   976: iconst_0
    //   977: bipush #6
    //   979: iconst_1
    //   980: iconst_1
    //   981: aload_3
    //   982: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   985: aload_0
    //   986: aload_1
    //   987: getstatic zKP.Dne : LdNT;
    //   990: getfield FWm : I
    //   993: iconst_0
    //   994: bipush #6
    //   996: iconst_1
    //   997: iconst_2
    //   998: aload_3
    //   999: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1002: aload_0
    //   1003: aload_1
    //   1004: iconst_0
    //   1005: iconst_0
    //   1006: iconst_2
    //   1007: iconst_1
    //   1008: iconst_0
    //   1009: aload_3
    //   1010: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1013: aload_0
    //   1014: aload_1
    //   1015: iconst_0
    //   1016: iconst_0
    //   1017: iconst_2
    //   1018: iconst_2
    //   1019: iconst_0
    //   1020: aload_3
    //   1021: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1024: aload_0
    //   1025: aload_1
    //   1026: getstatic zKP.Wwe : LzKP;
    //   1029: getfield FWm : I
    //   1032: iconst_0
    //   1033: iconst_2
    //   1034: iconst_3
    //   1035: iconst_1
    //   1036: aload_3
    //   1037: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1040: aload_0
    //   1041: aload_1
    //   1042: aload_3
    //   1043: aload_2
    //   1044: iconst_2
    //   1045: iconst_1
    //   1046: iconst_0
    //   1047: aload_0
    //   1048: getstatic zKP.ICU : LzKP;
    //   1051: getfield FWm : I
    //   1054: iconst_1
    //   1055: invokevirtual bzF : (II)I
    //   1058: invokevirtual Dne : (LQnq;LCLK;Ljava/util/Random;IIII)V
    //   1061: aload_0
    //   1062: aload_1
    //   1063: iconst_2
    //   1064: iconst_0
    //   1065: iconst_m1
    //   1066: aload_3
    //   1067: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   1070: ifne -> 1111
    //   1073: aload_0
    //   1074: aload_1
    //   1075: iconst_2
    //   1076: iconst_m1
    //   1077: iconst_m1
    //   1078: aload_3
    //   1079: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   1082: ifeq -> 1111
    //   1085: aload_0
    //   1086: aload_1
    //   1087: getstatic zKP.BJH : LzKP;
    //   1090: getfield FWm : I
    //   1093: aload_0
    //   1094: getstatic zKP.BJH : LzKP;
    //   1097: getfield FWm : I
    //   1100: iconst_3
    //   1101: invokevirtual bzF : (II)I
    //   1104: iconst_2
    //   1105: iconst_0
    //   1106: iconst_m1
    //   1107: aload_3
    //   1108: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1111: aload_0
    //   1112: aload_1
    //   1113: iconst_0
    //   1114: iconst_0
    //   1115: bipush #6
    //   1117: iconst_1
    //   1118: iconst_5
    //   1119: aload_3
    //   1120: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1123: aload_0
    //   1124: aload_1
    //   1125: iconst_0
    //   1126: iconst_0
    //   1127: bipush #6
    //   1129: iconst_2
    //   1130: iconst_5
    //   1131: aload_3
    //   1132: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1135: aload_0
    //   1136: aload_1
    //   1137: getstatic zKP.Wwe : LzKP;
    //   1140: getfield FWm : I
    //   1143: iconst_0
    //   1144: bipush #6
    //   1146: iconst_3
    //   1147: iconst_4
    //   1148: aload_3
    //   1149: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1152: aload_0
    //   1153: aload_1
    //   1154: aload_3
    //   1155: aload_2
    //   1156: bipush #6
    //   1158: iconst_1
    //   1159: iconst_5
    //   1160: aload_0
    //   1161: getstatic zKP.ICU : LzKP;
    //   1164: getfield FWm : I
    //   1167: iconst_1
    //   1168: invokevirtual bzF : (II)I
    //   1171: invokevirtual Dne : (LQnq;LCLK;Ljava/util/Random;IIII)V
    //   1174: iconst_0
    //   1175: istore #6
    //   1177: iload #6
    //   1179: iconst_5
    //   1180: if_icmpge -> 1235
    //   1183: iconst_0
    //   1184: istore #7
    //   1186: iload #7
    //   1188: bipush #9
    //   1190: if_icmpge -> 1229
    //   1193: aload_0
    //   1194: aload_1
    //   1195: iload #7
    //   1197: bipush #7
    //   1199: iload #6
    //   1201: aload_3
    //   1202: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   1205: aload_0
    //   1206: aload_1
    //   1207: getstatic zKP.bzF : LzKP;
    //   1210: getfield FWm : I
    //   1213: iconst_0
    //   1214: iload #7
    //   1216: iconst_m1
    //   1217: iload #6
    //   1219: aload_3
    //   1220: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   1223: iinc #7, 1
    //   1226: goto -> 1186
    //   1229: iinc #6, 1
    //   1232: goto -> 1177
    //   1235: aload_0
    //   1236: aload_1
    //   1237: aload_3
    //   1238: iconst_4
    //   1239: iconst_1
    //   1240: iconst_2
    //   1241: iconst_2
    //   1242: invokevirtual Dne : (LQnq;LCLK;IIII)V
    //   1245: iconst_1
    //   1246: ireturn
  }
  
  public gcg(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  protected int FWm(int paramInt) {
    return (paramInt == 0) ? 4 : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gcg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */