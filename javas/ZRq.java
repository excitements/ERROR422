import java.util.List;
import java.util.Random;

public class ZRq extends ram {
  private int Dne = -1;
  
  public static ZRq Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 9, 6, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new ZRq(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
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
    //   43: bipush #9
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
    //   60: iconst_5
    //   61: iconst_4
    //   62: iconst_0
    //   63: iconst_0
    //   64: iconst_0
    //   65: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   68: aload_0
    //   69: aload_1
    //   70: aload_3
    //   71: iconst_0
    //   72: iconst_0
    //   73: iconst_0
    //   74: bipush #8
    //   76: iconst_0
    //   77: iconst_5
    //   78: getstatic zKP.bzF : LzKP;
    //   81: getfield FWm : I
    //   84: getstatic zKP.bzF : LzKP;
    //   87: getfield FWm : I
    //   90: iconst_0
    //   91: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   94: aload_0
    //   95: aload_1
    //   96: aload_3
    //   97: iconst_0
    //   98: iconst_5
    //   99: iconst_0
    //   100: bipush #8
    //   102: iconst_5
    //   103: iconst_5
    //   104: getstatic zKP.bzF : LzKP;
    //   107: getfield FWm : I
    //   110: getstatic zKP.bzF : LzKP;
    //   113: getfield FWm : I
    //   116: iconst_0
    //   117: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   120: aload_0
    //   121: aload_1
    //   122: aload_3
    //   123: iconst_0
    //   124: bipush #6
    //   126: iconst_1
    //   127: bipush #8
    //   129: bipush #6
    //   131: iconst_4
    //   132: getstatic zKP.bzF : LzKP;
    //   135: getfield FWm : I
    //   138: getstatic zKP.bzF : LzKP;
    //   141: getfield FWm : I
    //   144: iconst_0
    //   145: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   148: aload_0
    //   149: aload_1
    //   150: aload_3
    //   151: iconst_0
    //   152: bipush #7
    //   154: iconst_2
    //   155: bipush #8
    //   157: bipush #7
    //   159: iconst_3
    //   160: getstatic zKP.bzF : LzKP;
    //   163: getfield FWm : I
    //   166: getstatic zKP.bzF : LzKP;
    //   169: getfield FWm : I
    //   172: iconst_0
    //   173: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   176: aload_0
    //   177: getstatic zKP.One : LzKP;
    //   180: getfield FWm : I
    //   183: iconst_3
    //   184: invokevirtual bzF : (II)I
    //   187: istore #4
    //   189: aload_0
    //   190: getstatic zKP.One : LzKP;
    //   193: getfield FWm : I
    //   196: iconst_2
    //   197: invokevirtual bzF : (II)I
    //   200: istore #5
    //   202: iconst_m1
    //   203: istore #6
    //   205: iload #6
    //   207: iconst_2
    //   208: if_icmpgt -> 281
    //   211: iconst_0
    //   212: istore #7
    //   214: iload #7
    //   216: bipush #8
    //   218: if_icmpgt -> 275
    //   221: aload_0
    //   222: aload_1
    //   223: getstatic zKP.One : LzKP;
    //   226: getfield FWm : I
    //   229: iload #4
    //   231: iload #7
    //   233: bipush #6
    //   235: iload #6
    //   237: iadd
    //   238: iload #6
    //   240: aload_3
    //   241: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   244: aload_0
    //   245: aload_1
    //   246: getstatic zKP.One : LzKP;
    //   249: getfield FWm : I
    //   252: iload #5
    //   254: iload #7
    //   256: bipush #6
    //   258: iload #6
    //   260: iadd
    //   261: iconst_5
    //   262: iload #6
    //   264: isub
    //   265: aload_3
    //   266: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   269: iinc #7, 1
    //   272: goto -> 214
    //   275: iinc #6, 1
    //   278: goto -> 205
    //   281: aload_0
    //   282: aload_1
    //   283: aload_3
    //   284: iconst_0
    //   285: iconst_1
    //   286: iconst_0
    //   287: iconst_0
    //   288: iconst_1
    //   289: iconst_5
    //   290: getstatic zKP.bzF : LzKP;
    //   293: getfield FWm : I
    //   296: getstatic zKP.bzF : LzKP;
    //   299: getfield FWm : I
    //   302: iconst_0
    //   303: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   306: aload_0
    //   307: aload_1
    //   308: aload_3
    //   309: iconst_1
    //   310: iconst_1
    //   311: iconst_5
    //   312: bipush #8
    //   314: iconst_1
    //   315: iconst_5
    //   316: getstatic zKP.bzF : LzKP;
    //   319: getfield FWm : I
    //   322: getstatic zKP.bzF : LzKP;
    //   325: getfield FWm : I
    //   328: iconst_0
    //   329: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   332: aload_0
    //   333: aload_1
    //   334: aload_3
    //   335: bipush #8
    //   337: iconst_1
    //   338: iconst_0
    //   339: bipush #8
    //   341: iconst_1
    //   342: iconst_4
    //   343: getstatic zKP.bzF : LzKP;
    //   346: getfield FWm : I
    //   349: getstatic zKP.bzF : LzKP;
    //   352: getfield FWm : I
    //   355: iconst_0
    //   356: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   359: aload_0
    //   360: aload_1
    //   361: aload_3
    //   362: iconst_2
    //   363: iconst_1
    //   364: iconst_0
    //   365: bipush #7
    //   367: iconst_1
    //   368: iconst_0
    //   369: getstatic zKP.bzF : LzKP;
    //   372: getfield FWm : I
    //   375: getstatic zKP.bzF : LzKP;
    //   378: getfield FWm : I
    //   381: iconst_0
    //   382: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   385: aload_0
    //   386: aload_1
    //   387: aload_3
    //   388: iconst_0
    //   389: iconst_2
    //   390: iconst_0
    //   391: iconst_0
    //   392: iconst_4
    //   393: iconst_0
    //   394: getstatic zKP.bzF : LzKP;
    //   397: getfield FWm : I
    //   400: getstatic zKP.bzF : LzKP;
    //   403: getfield FWm : I
    //   406: iconst_0
    //   407: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   410: aload_0
    //   411: aload_1
    //   412: aload_3
    //   413: iconst_0
    //   414: iconst_2
    //   415: iconst_5
    //   416: iconst_0
    //   417: iconst_4
    //   418: iconst_5
    //   419: getstatic zKP.bzF : LzKP;
    //   422: getfield FWm : I
    //   425: getstatic zKP.bzF : LzKP;
    //   428: getfield FWm : I
    //   431: iconst_0
    //   432: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   435: aload_0
    //   436: aload_1
    //   437: aload_3
    //   438: bipush #8
    //   440: iconst_2
    //   441: iconst_5
    //   442: bipush #8
    //   444: iconst_4
    //   445: iconst_5
    //   446: getstatic zKP.bzF : LzKP;
    //   449: getfield FWm : I
    //   452: getstatic zKP.bzF : LzKP;
    //   455: getfield FWm : I
    //   458: iconst_0
    //   459: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   462: aload_0
    //   463: aload_1
    //   464: aload_3
    //   465: bipush #8
    //   467: iconst_2
    //   468: iconst_0
    //   469: bipush #8
    //   471: iconst_4
    //   472: iconst_0
    //   473: getstatic zKP.bzF : LzKP;
    //   476: getfield FWm : I
    //   479: getstatic zKP.bzF : LzKP;
    //   482: getfield FWm : I
    //   485: iconst_0
    //   486: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   489: aload_0
    //   490: aload_1
    //   491: aload_3
    //   492: iconst_0
    //   493: iconst_2
    //   494: iconst_1
    //   495: iconst_0
    //   496: iconst_4
    //   497: iconst_4
    //   498: getstatic zKP.Qnq : LzKP;
    //   501: getfield FWm : I
    //   504: getstatic zKP.Qnq : LzKP;
    //   507: getfield FWm : I
    //   510: iconst_0
    //   511: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   514: aload_0
    //   515: aload_1
    //   516: aload_3
    //   517: iconst_1
    //   518: iconst_2
    //   519: iconst_5
    //   520: bipush #7
    //   522: iconst_4
    //   523: iconst_5
    //   524: getstatic zKP.Qnq : LzKP;
    //   527: getfield FWm : I
    //   530: getstatic zKP.Qnq : LzKP;
    //   533: getfield FWm : I
    //   536: iconst_0
    //   537: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   540: aload_0
    //   541: aload_1
    //   542: aload_3
    //   543: bipush #8
    //   545: iconst_2
    //   546: iconst_1
    //   547: bipush #8
    //   549: iconst_4
    //   550: iconst_4
    //   551: getstatic zKP.Qnq : LzKP;
    //   554: getfield FWm : I
    //   557: getstatic zKP.Qnq : LzKP;
    //   560: getfield FWm : I
    //   563: iconst_0
    //   564: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   567: aload_0
    //   568: aload_1
    //   569: aload_3
    //   570: iconst_1
    //   571: iconst_2
    //   572: iconst_0
    //   573: bipush #7
    //   575: iconst_4
    //   576: iconst_0
    //   577: getstatic zKP.Qnq : LzKP;
    //   580: getfield FWm : I
    //   583: getstatic zKP.Qnq : LzKP;
    //   586: getfield FWm : I
    //   589: iconst_0
    //   590: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   593: aload_0
    //   594: aload_1
    //   595: getstatic zKP.Lab : LzKP;
    //   598: getfield FWm : I
    //   601: iconst_0
    //   602: iconst_4
    //   603: iconst_2
    //   604: iconst_0
    //   605: aload_3
    //   606: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   609: aload_0
    //   610: aload_1
    //   611: getstatic zKP.Lab : LzKP;
    //   614: getfield FWm : I
    //   617: iconst_0
    //   618: iconst_5
    //   619: iconst_2
    //   620: iconst_0
    //   621: aload_3
    //   622: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   625: aload_0
    //   626: aload_1
    //   627: getstatic zKP.Lab : LzKP;
    //   630: getfield FWm : I
    //   633: iconst_0
    //   634: bipush #6
    //   636: iconst_2
    //   637: iconst_0
    //   638: aload_3
    //   639: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   642: aload_0
    //   643: aload_1
    //   644: getstatic zKP.Lab : LzKP;
    //   647: getfield FWm : I
    //   650: iconst_0
    //   651: iconst_4
    //   652: iconst_3
    //   653: iconst_0
    //   654: aload_3
    //   655: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   658: aload_0
    //   659: aload_1
    //   660: getstatic zKP.Lab : LzKP;
    //   663: getfield FWm : I
    //   666: iconst_0
    //   667: iconst_5
    //   668: iconst_3
    //   669: iconst_0
    //   670: aload_3
    //   671: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   674: aload_0
    //   675: aload_1
    //   676: getstatic zKP.Lab : LzKP;
    //   679: getfield FWm : I
    //   682: iconst_0
    //   683: bipush #6
    //   685: iconst_3
    //   686: iconst_0
    //   687: aload_3
    //   688: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   691: aload_0
    //   692: aload_1
    //   693: getstatic zKP.Lab : LzKP;
    //   696: getfield FWm : I
    //   699: iconst_0
    //   700: iconst_0
    //   701: iconst_2
    //   702: iconst_2
    //   703: aload_3
    //   704: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   707: aload_0
    //   708: aload_1
    //   709: getstatic zKP.Lab : LzKP;
    //   712: getfield FWm : I
    //   715: iconst_0
    //   716: iconst_0
    //   717: iconst_2
    //   718: iconst_3
    //   719: aload_3
    //   720: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   723: aload_0
    //   724: aload_1
    //   725: getstatic zKP.Lab : LzKP;
    //   728: getfield FWm : I
    //   731: iconst_0
    //   732: iconst_0
    //   733: iconst_3
    //   734: iconst_2
    //   735: aload_3
    //   736: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   739: aload_0
    //   740: aload_1
    //   741: getstatic zKP.Lab : LzKP;
    //   744: getfield FWm : I
    //   747: iconst_0
    //   748: iconst_0
    //   749: iconst_3
    //   750: iconst_3
    //   751: aload_3
    //   752: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   755: aload_0
    //   756: aload_1
    //   757: getstatic zKP.Lab : LzKP;
    //   760: getfield FWm : I
    //   763: iconst_0
    //   764: bipush #8
    //   766: iconst_2
    //   767: iconst_2
    //   768: aload_3
    //   769: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   772: aload_0
    //   773: aload_1
    //   774: getstatic zKP.Lab : LzKP;
    //   777: getfield FWm : I
    //   780: iconst_0
    //   781: bipush #8
    //   783: iconst_2
    //   784: iconst_3
    //   785: aload_3
    //   786: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   789: aload_0
    //   790: aload_1
    //   791: getstatic zKP.Lab : LzKP;
    //   794: getfield FWm : I
    //   797: iconst_0
    //   798: bipush #8
    //   800: iconst_3
    //   801: iconst_2
    //   802: aload_3
    //   803: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   806: aload_0
    //   807: aload_1
    //   808: getstatic zKP.Lab : LzKP;
    //   811: getfield FWm : I
    //   814: iconst_0
    //   815: bipush #8
    //   817: iconst_3
    //   818: iconst_3
    //   819: aload_3
    //   820: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   823: aload_0
    //   824: aload_1
    //   825: getstatic zKP.Lab : LzKP;
    //   828: getfield FWm : I
    //   831: iconst_0
    //   832: iconst_2
    //   833: iconst_2
    //   834: iconst_5
    //   835: aload_3
    //   836: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   839: aload_0
    //   840: aload_1
    //   841: getstatic zKP.Lab : LzKP;
    //   844: getfield FWm : I
    //   847: iconst_0
    //   848: iconst_3
    //   849: iconst_2
    //   850: iconst_5
    //   851: aload_3
    //   852: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   855: aload_0
    //   856: aload_1
    //   857: getstatic zKP.Lab : LzKP;
    //   860: getfield FWm : I
    //   863: iconst_0
    //   864: iconst_5
    //   865: iconst_2
    //   866: iconst_5
    //   867: aload_3
    //   868: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   871: aload_0
    //   872: aload_1
    //   873: getstatic zKP.Lab : LzKP;
    //   876: getfield FWm : I
    //   879: iconst_0
    //   880: bipush #6
    //   882: iconst_2
    //   883: iconst_5
    //   884: aload_3
    //   885: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   888: aload_0
    //   889: aload_1
    //   890: aload_3
    //   891: iconst_1
    //   892: iconst_4
    //   893: iconst_1
    //   894: bipush #7
    //   896: iconst_4
    //   897: iconst_1
    //   898: getstatic zKP.Qnq : LzKP;
    //   901: getfield FWm : I
    //   904: getstatic zKP.Qnq : LzKP;
    //   907: getfield FWm : I
    //   910: iconst_0
    //   911: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   914: aload_0
    //   915: aload_1
    //   916: aload_3
    //   917: iconst_1
    //   918: iconst_4
    //   919: iconst_4
    //   920: bipush #7
    //   922: iconst_4
    //   923: iconst_4
    //   924: getstatic zKP.Qnq : LzKP;
    //   927: getfield FWm : I
    //   930: getstatic zKP.Qnq : LzKP;
    //   933: getfield FWm : I
    //   936: iconst_0
    //   937: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   940: aload_0
    //   941: aload_1
    //   942: aload_3
    //   943: iconst_1
    //   944: iconst_3
    //   945: iconst_4
    //   946: bipush #7
    //   948: iconst_3
    //   949: iconst_4
    //   950: getstatic zKP.AgF : LzKP;
    //   953: getfield FWm : I
    //   956: getstatic zKP.AgF : LzKP;
    //   959: getfield FWm : I
    //   962: iconst_0
    //   963: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   966: aload_0
    //   967: aload_1
    //   968: getstatic zKP.Qnq : LzKP;
    //   971: getfield FWm : I
    //   974: iconst_0
    //   975: bipush #7
    //   977: iconst_1
    //   978: iconst_4
    //   979: aload_3
    //   980: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   983: aload_0
    //   984: aload_1
    //   985: getstatic zKP.One : LzKP;
    //   988: getfield FWm : I
    //   991: aload_0
    //   992: getstatic zKP.One : LzKP;
    //   995: getfield FWm : I
    //   998: iconst_0
    //   999: invokevirtual bzF : (II)I
    //   1002: bipush #7
    //   1004: iconst_1
    //   1005: iconst_3
    //   1006: aload_3
    //   1007: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1010: aload_0
    //   1011: getstatic zKP.One : LzKP;
    //   1014: getfield FWm : I
    //   1017: iconst_3
    //   1018: invokevirtual bzF : (II)I
    //   1021: istore #6
    //   1023: aload_0
    //   1024: aload_1
    //   1025: getstatic zKP.One : LzKP;
    //   1028: getfield FWm : I
    //   1031: iload #6
    //   1033: bipush #6
    //   1035: iconst_1
    //   1036: iconst_4
    //   1037: aload_3
    //   1038: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1041: aload_0
    //   1042: aload_1
    //   1043: getstatic zKP.One : LzKP;
    //   1046: getfield FWm : I
    //   1049: iload #6
    //   1051: iconst_5
    //   1052: iconst_1
    //   1053: iconst_4
    //   1054: aload_3
    //   1055: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1058: aload_0
    //   1059: aload_1
    //   1060: getstatic zKP.One : LzKP;
    //   1063: getfield FWm : I
    //   1066: iload #6
    //   1068: iconst_4
    //   1069: iconst_1
    //   1070: iconst_4
    //   1071: aload_3
    //   1072: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1075: aload_0
    //   1076: aload_1
    //   1077: getstatic zKP.One : LzKP;
    //   1080: getfield FWm : I
    //   1083: iload #6
    //   1085: iconst_3
    //   1086: iconst_1
    //   1087: iconst_4
    //   1088: aload_3
    //   1089: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1092: aload_0
    //   1093: aload_1
    //   1094: getstatic zKP.sly : LzKP;
    //   1097: getfield FWm : I
    //   1100: iconst_0
    //   1101: bipush #6
    //   1103: iconst_1
    //   1104: iconst_3
    //   1105: aload_3
    //   1106: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1109: aload_0
    //   1110: aload_1
    //   1111: getstatic zKP.YHU : LzKP;
    //   1114: getfield FWm : I
    //   1117: iconst_0
    //   1118: bipush #6
    //   1120: iconst_2
    //   1121: iconst_3
    //   1122: aload_3
    //   1123: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1126: aload_0
    //   1127: aload_1
    //   1128: getstatic zKP.sly : LzKP;
    //   1131: getfield FWm : I
    //   1134: iconst_0
    //   1135: iconst_4
    //   1136: iconst_1
    //   1137: iconst_3
    //   1138: aload_3
    //   1139: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1142: aload_0
    //   1143: aload_1
    //   1144: getstatic zKP.YHU : LzKP;
    //   1147: getfield FWm : I
    //   1150: iconst_0
    //   1151: iconst_4
    //   1152: iconst_2
    //   1153: iconst_3
    //   1154: aload_3
    //   1155: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1158: aload_0
    //   1159: aload_1
    //   1160: getstatic zKP.mlD : LzKP;
    //   1163: getfield FWm : I
    //   1166: iconst_0
    //   1167: bipush #7
    //   1169: iconst_1
    //   1170: iconst_1
    //   1171: aload_3
    //   1172: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1175: aload_0
    //   1176: aload_1
    //   1177: iconst_0
    //   1178: iconst_0
    //   1179: iconst_1
    //   1180: iconst_1
    //   1181: iconst_0
    //   1182: aload_3
    //   1183: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1186: aload_0
    //   1187: aload_1
    //   1188: iconst_0
    //   1189: iconst_0
    //   1190: iconst_1
    //   1191: iconst_2
    //   1192: iconst_0
    //   1193: aload_3
    //   1194: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1197: aload_0
    //   1198: aload_1
    //   1199: aload_3
    //   1200: aload_2
    //   1201: iconst_1
    //   1202: iconst_1
    //   1203: iconst_0
    //   1204: aload_0
    //   1205: getstatic zKP.ICU : LzKP;
    //   1208: getfield FWm : I
    //   1211: iconst_1
    //   1212: invokevirtual bzF : (II)I
    //   1215: invokevirtual Dne : (LQnq;LCLK;Ljava/util/Random;IIII)V
    //   1218: aload_0
    //   1219: aload_1
    //   1220: iconst_1
    //   1221: iconst_0
    //   1222: iconst_m1
    //   1223: aload_3
    //   1224: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   1227: ifne -> 1268
    //   1230: aload_0
    //   1231: aload_1
    //   1232: iconst_1
    //   1233: iconst_m1
    //   1234: iconst_m1
    //   1235: aload_3
    //   1236: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   1239: ifeq -> 1268
    //   1242: aload_0
    //   1243: aload_1
    //   1244: getstatic zKP.BJH : LzKP;
    //   1247: getfield FWm : I
    //   1250: aload_0
    //   1251: getstatic zKP.BJH : LzKP;
    //   1254: getfield FWm : I
    //   1257: iconst_3
    //   1258: invokevirtual bzF : (II)I
    //   1261: iconst_1
    //   1262: iconst_0
    //   1263: iconst_m1
    //   1264: aload_3
    //   1265: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1268: iconst_0
    //   1269: istore #7
    //   1271: iload #7
    //   1273: bipush #6
    //   1275: if_icmpge -> 1330
    //   1278: iconst_0
    //   1279: istore #8
    //   1281: iload #8
    //   1283: bipush #9
    //   1285: if_icmpge -> 1324
    //   1288: aload_0
    //   1289: aload_1
    //   1290: iload #8
    //   1292: bipush #9
    //   1294: iload #7
    //   1296: aload_3
    //   1297: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   1300: aload_0
    //   1301: aload_1
    //   1302: getstatic zKP.bzF : LzKP;
    //   1305: getfield FWm : I
    //   1308: iconst_0
    //   1309: iload #8
    //   1311: iconst_m1
    //   1312: iload #7
    //   1314: aload_3
    //   1315: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   1318: iinc #8, 1
    //   1321: goto -> 1281
    //   1324: iinc #7, 1
    //   1327: goto -> 1271
    //   1330: aload_0
    //   1331: aload_1
    //   1332: aload_3
    //   1333: iconst_2
    //   1334: iconst_1
    //   1335: iconst_2
    //   1336: iconst_1
    //   1337: invokevirtual Dne : (LQnq;LCLK;IIII)V
    //   1340: iconst_1
    //   1341: ireturn
  }
  
  public ZRq(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  protected int FWm(int paramInt) {
    return 1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZRq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */