import java.util.List;
import java.util.Random;

public class ykp extends ram {
  private int Dne = -1;
  
  public ykp(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
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
    //   91: iconst_5
    //   92: bipush #8
    //   94: iconst_0
    //   95: bipush #10
    //   97: getstatic zKP.Qnq : LzKP;
    //   100: getfield FWm : I
    //   103: getstatic zKP.Qnq : LzKP;
    //   106: getfield FWm : I
    //   109: iconst_0
    //   110: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   113: aload_0
    //   114: aload_1
    //   115: aload_3
    //   116: iconst_1
    //   117: iconst_0
    //   118: iconst_1
    //   119: bipush #7
    //   121: iconst_0
    //   122: iconst_4
    //   123: getstatic zKP.Qnq : LzKP;
    //   126: getfield FWm : I
    //   129: getstatic zKP.Qnq : LzKP;
    //   132: getfield FWm : I
    //   135: iconst_0
    //   136: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   139: aload_0
    //   140: aload_1
    //   141: aload_3
    //   142: iconst_0
    //   143: iconst_0
    //   144: iconst_0
    //   145: iconst_0
    //   146: iconst_3
    //   147: iconst_5
    //   148: getstatic zKP.bzF : LzKP;
    //   151: getfield FWm : I
    //   154: getstatic zKP.bzF : LzKP;
    //   157: getfield FWm : I
    //   160: iconst_0
    //   161: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   164: aload_0
    //   165: aload_1
    //   166: aload_3
    //   167: bipush #8
    //   169: iconst_0
    //   170: iconst_0
    //   171: bipush #8
    //   173: iconst_3
    //   174: bipush #10
    //   176: getstatic zKP.bzF : LzKP;
    //   179: getfield FWm : I
    //   182: getstatic zKP.bzF : LzKP;
    //   185: getfield FWm : I
    //   188: iconst_0
    //   189: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   192: aload_0
    //   193: aload_1
    //   194: aload_3
    //   195: iconst_1
    //   196: iconst_0
    //   197: iconst_0
    //   198: bipush #7
    //   200: iconst_2
    //   201: iconst_0
    //   202: getstatic zKP.bzF : LzKP;
    //   205: getfield FWm : I
    //   208: getstatic zKP.bzF : LzKP;
    //   211: getfield FWm : I
    //   214: iconst_0
    //   215: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   218: aload_0
    //   219: aload_1
    //   220: aload_3
    //   221: iconst_1
    //   222: iconst_0
    //   223: iconst_5
    //   224: iconst_2
    //   225: iconst_1
    //   226: iconst_5
    //   227: getstatic zKP.bzF : LzKP;
    //   230: getfield FWm : I
    //   233: getstatic zKP.bzF : LzKP;
    //   236: getfield FWm : I
    //   239: iconst_0
    //   240: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   243: aload_0
    //   244: aload_1
    //   245: aload_3
    //   246: iconst_2
    //   247: iconst_0
    //   248: bipush #6
    //   250: iconst_2
    //   251: iconst_3
    //   252: bipush #10
    //   254: getstatic zKP.bzF : LzKP;
    //   257: getfield FWm : I
    //   260: getstatic zKP.bzF : LzKP;
    //   263: getfield FWm : I
    //   266: iconst_0
    //   267: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   270: aload_0
    //   271: aload_1
    //   272: aload_3
    //   273: iconst_3
    //   274: iconst_0
    //   275: bipush #10
    //   277: bipush #7
    //   279: iconst_3
    //   280: bipush #10
    //   282: getstatic zKP.bzF : LzKP;
    //   285: getfield FWm : I
    //   288: getstatic zKP.bzF : LzKP;
    //   291: getfield FWm : I
    //   294: iconst_0
    //   295: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   298: aload_0
    //   299: aload_1
    //   300: aload_3
    //   301: iconst_1
    //   302: iconst_2
    //   303: iconst_0
    //   304: bipush #7
    //   306: iconst_3
    //   307: iconst_0
    //   308: getstatic zKP.Qnq : LzKP;
    //   311: getfield FWm : I
    //   314: getstatic zKP.Qnq : LzKP;
    //   317: getfield FWm : I
    //   320: iconst_0
    //   321: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   324: aload_0
    //   325: aload_1
    //   326: aload_3
    //   327: iconst_1
    //   328: iconst_2
    //   329: iconst_5
    //   330: iconst_2
    //   331: iconst_3
    //   332: iconst_5
    //   333: getstatic zKP.Qnq : LzKP;
    //   336: getfield FWm : I
    //   339: getstatic zKP.Qnq : LzKP;
    //   342: getfield FWm : I
    //   345: iconst_0
    //   346: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   349: aload_0
    //   350: aload_1
    //   351: aload_3
    //   352: iconst_0
    //   353: iconst_4
    //   354: iconst_1
    //   355: bipush #8
    //   357: iconst_4
    //   358: iconst_1
    //   359: getstatic zKP.Qnq : LzKP;
    //   362: getfield FWm : I
    //   365: getstatic zKP.Qnq : LzKP;
    //   368: getfield FWm : I
    //   371: iconst_0
    //   372: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   375: aload_0
    //   376: aload_1
    //   377: aload_3
    //   378: iconst_0
    //   379: iconst_4
    //   380: iconst_4
    //   381: iconst_3
    //   382: iconst_4
    //   383: iconst_4
    //   384: getstatic zKP.Qnq : LzKP;
    //   387: getfield FWm : I
    //   390: getstatic zKP.Qnq : LzKP;
    //   393: getfield FWm : I
    //   396: iconst_0
    //   397: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   400: aload_0
    //   401: aload_1
    //   402: aload_3
    //   403: iconst_0
    //   404: iconst_5
    //   405: iconst_2
    //   406: bipush #8
    //   408: iconst_5
    //   409: iconst_3
    //   410: getstatic zKP.Qnq : LzKP;
    //   413: getfield FWm : I
    //   416: getstatic zKP.Qnq : LzKP;
    //   419: getfield FWm : I
    //   422: iconst_0
    //   423: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   426: aload_0
    //   427: aload_1
    //   428: getstatic zKP.Qnq : LzKP;
    //   431: getfield FWm : I
    //   434: iconst_0
    //   435: iconst_0
    //   436: iconst_4
    //   437: iconst_2
    //   438: aload_3
    //   439: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   442: aload_0
    //   443: aload_1
    //   444: getstatic zKP.Qnq : LzKP;
    //   447: getfield FWm : I
    //   450: iconst_0
    //   451: iconst_0
    //   452: iconst_4
    //   453: iconst_3
    //   454: aload_3
    //   455: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   458: aload_0
    //   459: aload_1
    //   460: getstatic zKP.Qnq : LzKP;
    //   463: getfield FWm : I
    //   466: iconst_0
    //   467: bipush #8
    //   469: iconst_4
    //   470: iconst_2
    //   471: aload_3
    //   472: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   475: aload_0
    //   476: aload_1
    //   477: getstatic zKP.Qnq : LzKP;
    //   480: getfield FWm : I
    //   483: iconst_0
    //   484: bipush #8
    //   486: iconst_4
    //   487: iconst_3
    //   488: aload_3
    //   489: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   492: aload_0
    //   493: aload_1
    //   494: getstatic zKP.Qnq : LzKP;
    //   497: getfield FWm : I
    //   500: iconst_0
    //   501: bipush #8
    //   503: iconst_4
    //   504: iconst_4
    //   505: aload_3
    //   506: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   509: aload_0
    //   510: getstatic zKP.One : LzKP;
    //   513: getfield FWm : I
    //   516: iconst_3
    //   517: invokevirtual bzF : (II)I
    //   520: istore #4
    //   522: aload_0
    //   523: getstatic zKP.One : LzKP;
    //   526: getfield FWm : I
    //   529: iconst_2
    //   530: invokevirtual bzF : (II)I
    //   533: istore #5
    //   535: iconst_m1
    //   536: istore #6
    //   538: iload #6
    //   540: iconst_2
    //   541: if_icmpgt -> 654
    //   544: iconst_0
    //   545: istore #7
    //   547: iload #7
    //   549: bipush #8
    //   551: if_icmpgt -> 648
    //   554: aload_0
    //   555: aload_1
    //   556: getstatic zKP.One : LzKP;
    //   559: getfield FWm : I
    //   562: iload #4
    //   564: iload #7
    //   566: iconst_4
    //   567: iload #6
    //   569: iadd
    //   570: iload #6
    //   572: aload_3
    //   573: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   576: iload #6
    //   578: iconst_m1
    //   579: if_icmpgt -> 588
    //   582: iload #7
    //   584: iconst_1
    //   585: if_icmpgt -> 642
    //   588: iload #6
    //   590: ifgt -> 599
    //   593: iload #7
    //   595: iconst_3
    //   596: if_icmpgt -> 642
    //   599: iload #6
    //   601: iconst_1
    //   602: if_icmpgt -> 618
    //   605: iload #7
    //   607: iconst_4
    //   608: if_icmple -> 618
    //   611: iload #7
    //   613: bipush #6
    //   615: if_icmplt -> 642
    //   618: aload_0
    //   619: aload_1
    //   620: getstatic zKP.One : LzKP;
    //   623: getfield FWm : I
    //   626: iload #5
    //   628: iload #7
    //   630: iconst_4
    //   631: iload #6
    //   633: iadd
    //   634: iconst_5
    //   635: iload #6
    //   637: isub
    //   638: aload_3
    //   639: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   642: iinc #7, 1
    //   645: goto -> 547
    //   648: iinc #6, 1
    //   651: goto -> 538
    //   654: aload_0
    //   655: aload_1
    //   656: aload_3
    //   657: iconst_3
    //   658: iconst_4
    //   659: iconst_5
    //   660: iconst_3
    //   661: iconst_4
    //   662: bipush #10
    //   664: getstatic zKP.Qnq : LzKP;
    //   667: getfield FWm : I
    //   670: getstatic zKP.Qnq : LzKP;
    //   673: getfield FWm : I
    //   676: iconst_0
    //   677: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   680: aload_0
    //   681: aload_1
    //   682: aload_3
    //   683: bipush #7
    //   685: iconst_4
    //   686: iconst_2
    //   687: bipush #7
    //   689: iconst_4
    //   690: bipush #10
    //   692: getstatic zKP.Qnq : LzKP;
    //   695: getfield FWm : I
    //   698: getstatic zKP.Qnq : LzKP;
    //   701: getfield FWm : I
    //   704: iconst_0
    //   705: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   708: aload_0
    //   709: aload_1
    //   710: aload_3
    //   711: iconst_4
    //   712: iconst_5
    //   713: iconst_4
    //   714: iconst_4
    //   715: iconst_5
    //   716: bipush #10
    //   718: getstatic zKP.Qnq : LzKP;
    //   721: getfield FWm : I
    //   724: getstatic zKP.Qnq : LzKP;
    //   727: getfield FWm : I
    //   730: iconst_0
    //   731: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   734: aload_0
    //   735: aload_1
    //   736: aload_3
    //   737: bipush #6
    //   739: iconst_5
    //   740: iconst_4
    //   741: bipush #6
    //   743: iconst_5
    //   744: bipush #10
    //   746: getstatic zKP.Qnq : LzKP;
    //   749: getfield FWm : I
    //   752: getstatic zKP.Qnq : LzKP;
    //   755: getfield FWm : I
    //   758: iconst_0
    //   759: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   762: aload_0
    //   763: aload_1
    //   764: aload_3
    //   765: iconst_5
    //   766: bipush #6
    //   768: iconst_3
    //   769: iconst_5
    //   770: bipush #6
    //   772: bipush #10
    //   774: getstatic zKP.Qnq : LzKP;
    //   777: getfield FWm : I
    //   780: getstatic zKP.Qnq : LzKP;
    //   783: getfield FWm : I
    //   786: iconst_0
    //   787: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   790: aload_0
    //   791: getstatic zKP.One : LzKP;
    //   794: getfield FWm : I
    //   797: iconst_0
    //   798: invokevirtual bzF : (II)I
    //   801: istore #6
    //   803: iconst_4
    //   804: istore #7
    //   806: iload #7
    //   808: iconst_1
    //   809: if_icmplt -> 884
    //   812: aload_0
    //   813: aload_1
    //   814: getstatic zKP.Qnq : LzKP;
    //   817: getfield FWm : I
    //   820: iconst_0
    //   821: iload #7
    //   823: iconst_2
    //   824: iload #7
    //   826: iadd
    //   827: bipush #7
    //   829: iload #7
    //   831: isub
    //   832: aload_3
    //   833: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   836: bipush #8
    //   838: iload #7
    //   840: isub
    //   841: istore #8
    //   843: iload #8
    //   845: bipush #10
    //   847: if_icmpgt -> 878
    //   850: aload_0
    //   851: aload_1
    //   852: getstatic zKP.One : LzKP;
    //   855: getfield FWm : I
    //   858: iload #6
    //   860: iload #7
    //   862: iconst_2
    //   863: iload #7
    //   865: iadd
    //   866: iload #8
    //   868: aload_3
    //   869: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   872: iinc #8, 1
    //   875: goto -> 843
    //   878: iinc #7, -1
    //   881: goto -> 806
    //   884: aload_0
    //   885: getstatic zKP.One : LzKP;
    //   888: getfield FWm : I
    //   891: iconst_1
    //   892: invokevirtual bzF : (II)I
    //   895: istore #7
    //   897: aload_0
    //   898: aload_1
    //   899: getstatic zKP.Qnq : LzKP;
    //   902: getfield FWm : I
    //   905: iconst_0
    //   906: bipush #6
    //   908: bipush #6
    //   910: iconst_3
    //   911: aload_3
    //   912: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   915: aload_0
    //   916: aload_1
    //   917: getstatic zKP.Qnq : LzKP;
    //   920: getfield FWm : I
    //   923: iconst_0
    //   924: bipush #7
    //   926: iconst_5
    //   927: iconst_4
    //   928: aload_3
    //   929: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   932: aload_0
    //   933: aload_1
    //   934: getstatic zKP.One : LzKP;
    //   937: getfield FWm : I
    //   940: iload #7
    //   942: bipush #6
    //   944: bipush #6
    //   946: iconst_4
    //   947: aload_3
    //   948: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   951: bipush #6
    //   953: istore #8
    //   955: iload #8
    //   957: bipush #8
    //   959: if_icmpgt -> 1007
    //   962: iconst_5
    //   963: istore #9
    //   965: iload #9
    //   967: bipush #10
    //   969: if_icmpgt -> 1001
    //   972: aload_0
    //   973: aload_1
    //   974: getstatic zKP.One : LzKP;
    //   977: getfield FWm : I
    //   980: iload #7
    //   982: iload #8
    //   984: bipush #12
    //   986: iload #8
    //   988: isub
    //   989: iload #9
    //   991: aload_3
    //   992: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   995: iinc #9, 1
    //   998: goto -> 965
    //   1001: iinc #8, 1
    //   1004: goto -> 955
    //   1007: aload_0
    //   1008: aload_1
    //   1009: getstatic zKP.udO : LzKP;
    //   1012: getfield FWm : I
    //   1015: iconst_0
    //   1016: iconst_0
    //   1017: iconst_2
    //   1018: iconst_1
    //   1019: aload_3
    //   1020: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1023: aload_0
    //   1024: aload_1
    //   1025: getstatic zKP.udO : LzKP;
    //   1028: getfield FWm : I
    //   1031: iconst_0
    //   1032: iconst_0
    //   1033: iconst_2
    //   1034: iconst_4
    //   1035: aload_3
    //   1036: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1039: aload_0
    //   1040: aload_1
    //   1041: getstatic zKP.Lab : LzKP;
    //   1044: getfield FWm : I
    //   1047: iconst_0
    //   1048: iconst_0
    //   1049: iconst_2
    //   1050: iconst_2
    //   1051: aload_3
    //   1052: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1055: aload_0
    //   1056: aload_1
    //   1057: getstatic zKP.Lab : LzKP;
    //   1060: getfield FWm : I
    //   1063: iconst_0
    //   1064: iconst_0
    //   1065: iconst_2
    //   1066: iconst_3
    //   1067: aload_3
    //   1068: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1071: aload_0
    //   1072: aload_1
    //   1073: getstatic zKP.udO : LzKP;
    //   1076: getfield FWm : I
    //   1079: iconst_0
    //   1080: iconst_4
    //   1081: iconst_2
    //   1082: iconst_0
    //   1083: aload_3
    //   1084: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1087: aload_0
    //   1088: aload_1
    //   1089: getstatic zKP.Lab : LzKP;
    //   1092: getfield FWm : I
    //   1095: iconst_0
    //   1096: iconst_5
    //   1097: iconst_2
    //   1098: iconst_0
    //   1099: aload_3
    //   1100: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1103: aload_0
    //   1104: aload_1
    //   1105: getstatic zKP.udO : LzKP;
    //   1108: getfield FWm : I
    //   1111: iconst_0
    //   1112: bipush #6
    //   1114: iconst_2
    //   1115: iconst_0
    //   1116: aload_3
    //   1117: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1120: aload_0
    //   1121: aload_1
    //   1122: getstatic zKP.udO : LzKP;
    //   1125: getfield FWm : I
    //   1128: iconst_0
    //   1129: bipush #8
    //   1131: iconst_2
    //   1132: iconst_1
    //   1133: aload_3
    //   1134: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1137: aload_0
    //   1138: aload_1
    //   1139: getstatic zKP.Lab : LzKP;
    //   1142: getfield FWm : I
    //   1145: iconst_0
    //   1146: bipush #8
    //   1148: iconst_2
    //   1149: iconst_2
    //   1150: aload_3
    //   1151: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1154: aload_0
    //   1155: aload_1
    //   1156: getstatic zKP.Lab : LzKP;
    //   1159: getfield FWm : I
    //   1162: iconst_0
    //   1163: bipush #8
    //   1165: iconst_2
    //   1166: iconst_3
    //   1167: aload_3
    //   1168: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1171: aload_0
    //   1172: aload_1
    //   1173: getstatic zKP.udO : LzKP;
    //   1176: getfield FWm : I
    //   1179: iconst_0
    //   1180: bipush #8
    //   1182: iconst_2
    //   1183: iconst_4
    //   1184: aload_3
    //   1185: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1188: aload_0
    //   1189: aload_1
    //   1190: getstatic zKP.Qnq : LzKP;
    //   1193: getfield FWm : I
    //   1196: iconst_0
    //   1197: bipush #8
    //   1199: iconst_2
    //   1200: iconst_5
    //   1201: aload_3
    //   1202: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1205: aload_0
    //   1206: aload_1
    //   1207: getstatic zKP.udO : LzKP;
    //   1210: getfield FWm : I
    //   1213: iconst_0
    //   1214: bipush #8
    //   1216: iconst_2
    //   1217: bipush #6
    //   1219: aload_3
    //   1220: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1223: aload_0
    //   1224: aload_1
    //   1225: getstatic zKP.Lab : LzKP;
    //   1228: getfield FWm : I
    //   1231: iconst_0
    //   1232: bipush #8
    //   1234: iconst_2
    //   1235: bipush #7
    //   1237: aload_3
    //   1238: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1241: aload_0
    //   1242: aload_1
    //   1243: getstatic zKP.Lab : LzKP;
    //   1246: getfield FWm : I
    //   1249: iconst_0
    //   1250: bipush #8
    //   1252: iconst_2
    //   1253: bipush #8
    //   1255: aload_3
    //   1256: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1259: aload_0
    //   1260: aload_1
    //   1261: getstatic zKP.udO : LzKP;
    //   1264: getfield FWm : I
    //   1267: iconst_0
    //   1268: bipush #8
    //   1270: iconst_2
    //   1271: bipush #9
    //   1273: aload_3
    //   1274: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1277: aload_0
    //   1278: aload_1
    //   1279: getstatic zKP.udO : LzKP;
    //   1282: getfield FWm : I
    //   1285: iconst_0
    //   1286: iconst_2
    //   1287: iconst_2
    //   1288: bipush #6
    //   1290: aload_3
    //   1291: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1294: aload_0
    //   1295: aload_1
    //   1296: getstatic zKP.Lab : LzKP;
    //   1299: getfield FWm : I
    //   1302: iconst_0
    //   1303: iconst_2
    //   1304: iconst_2
    //   1305: bipush #7
    //   1307: aload_3
    //   1308: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1311: aload_0
    //   1312: aload_1
    //   1313: getstatic zKP.Lab : LzKP;
    //   1316: getfield FWm : I
    //   1319: iconst_0
    //   1320: iconst_2
    //   1321: iconst_2
    //   1322: bipush #8
    //   1324: aload_3
    //   1325: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1328: aload_0
    //   1329: aload_1
    //   1330: getstatic zKP.udO : LzKP;
    //   1333: getfield FWm : I
    //   1336: iconst_0
    //   1337: iconst_2
    //   1338: iconst_2
    //   1339: bipush #9
    //   1341: aload_3
    //   1342: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1345: aload_0
    //   1346: aload_1
    //   1347: getstatic zKP.udO : LzKP;
    //   1350: getfield FWm : I
    //   1353: iconst_0
    //   1354: iconst_4
    //   1355: iconst_4
    //   1356: bipush #10
    //   1358: aload_3
    //   1359: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1362: aload_0
    //   1363: aload_1
    //   1364: getstatic zKP.Lab : LzKP;
    //   1367: getfield FWm : I
    //   1370: iconst_0
    //   1371: iconst_5
    //   1372: iconst_4
    //   1373: bipush #10
    //   1375: aload_3
    //   1376: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1379: aload_0
    //   1380: aload_1
    //   1381: getstatic zKP.udO : LzKP;
    //   1384: getfield FWm : I
    //   1387: iconst_0
    //   1388: bipush #6
    //   1390: iconst_4
    //   1391: bipush #10
    //   1393: aload_3
    //   1394: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1397: aload_0
    //   1398: aload_1
    //   1399: getstatic zKP.Qnq : LzKP;
    //   1402: getfield FWm : I
    //   1405: iconst_0
    //   1406: iconst_5
    //   1407: iconst_5
    //   1408: bipush #10
    //   1410: aload_3
    //   1411: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1414: aload_0
    //   1415: aload_1
    //   1416: iconst_0
    //   1417: iconst_0
    //   1418: iconst_2
    //   1419: iconst_1
    //   1420: iconst_0
    //   1421: aload_3
    //   1422: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1425: aload_0
    //   1426: aload_1
    //   1427: iconst_0
    //   1428: iconst_0
    //   1429: iconst_2
    //   1430: iconst_2
    //   1431: iconst_0
    //   1432: aload_3
    //   1433: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1436: aload_0
    //   1437: aload_1
    //   1438: getstatic zKP.Wwe : LzKP;
    //   1441: getfield FWm : I
    //   1444: iconst_0
    //   1445: iconst_2
    //   1446: iconst_3
    //   1447: iconst_1
    //   1448: aload_3
    //   1449: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1452: aload_0
    //   1453: aload_1
    //   1454: aload_3
    //   1455: aload_2
    //   1456: iconst_2
    //   1457: iconst_1
    //   1458: iconst_0
    //   1459: aload_0
    //   1460: getstatic zKP.ICU : LzKP;
    //   1463: getfield FWm : I
    //   1466: iconst_1
    //   1467: invokevirtual bzF : (II)I
    //   1470: invokevirtual Dne : (LQnq;LCLK;Ljava/util/Random;IIII)V
    //   1473: aload_0
    //   1474: aload_1
    //   1475: aload_3
    //   1476: iconst_1
    //   1477: iconst_0
    //   1478: iconst_m1
    //   1479: iconst_3
    //   1480: iconst_2
    //   1481: iconst_m1
    //   1482: iconst_0
    //   1483: iconst_0
    //   1484: iconst_0
    //   1485: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   1488: aload_0
    //   1489: aload_1
    //   1490: iconst_2
    //   1491: iconst_0
    //   1492: iconst_m1
    //   1493: aload_3
    //   1494: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   1497: ifne -> 1538
    //   1500: aload_0
    //   1501: aload_1
    //   1502: iconst_2
    //   1503: iconst_m1
    //   1504: iconst_m1
    //   1505: aload_3
    //   1506: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   1509: ifeq -> 1538
    //   1512: aload_0
    //   1513: aload_1
    //   1514: getstatic zKP.BJH : LzKP;
    //   1517: getfield FWm : I
    //   1520: aload_0
    //   1521: getstatic zKP.BJH : LzKP;
    //   1524: getfield FWm : I
    //   1527: iconst_3
    //   1528: invokevirtual bzF : (II)I
    //   1531: iconst_2
    //   1532: iconst_0
    //   1533: iconst_m1
    //   1534: aload_3
    //   1535: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   1538: iconst_0
    //   1539: istore #8
    //   1541: iload #8
    //   1543: iconst_5
    //   1544: if_icmpge -> 1599
    //   1547: iconst_0
    //   1548: istore #9
    //   1550: iload #9
    //   1552: bipush #9
    //   1554: if_icmpge -> 1593
    //   1557: aload_0
    //   1558: aload_1
    //   1559: iload #9
    //   1561: bipush #7
    //   1563: iload #8
    //   1565: aload_3
    //   1566: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   1569: aload_0
    //   1570: aload_1
    //   1571: getstatic zKP.bzF : LzKP;
    //   1574: getfield FWm : I
    //   1577: iconst_0
    //   1578: iload #9
    //   1580: iconst_m1
    //   1581: iload #8
    //   1583: aload_3
    //   1584: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   1587: iinc #9, 1
    //   1590: goto -> 1550
    //   1593: iinc #8, 1
    //   1596: goto -> 1541
    //   1599: iconst_5
    //   1600: istore #8
    //   1602: iload #8
    //   1604: bipush #11
    //   1606: if_icmpge -> 1661
    //   1609: iconst_2
    //   1610: istore #9
    //   1612: iload #9
    //   1614: bipush #9
    //   1616: if_icmpge -> 1655
    //   1619: aload_0
    //   1620: aload_1
    //   1621: iload #9
    //   1623: bipush #7
    //   1625: iload #8
    //   1627: aload_3
    //   1628: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   1631: aload_0
    //   1632: aload_1
    //   1633: getstatic zKP.bzF : LzKP;
    //   1636: getfield FWm : I
    //   1639: iconst_0
    //   1640: iload #9
    //   1642: iconst_m1
    //   1643: iload #8
    //   1645: aload_3
    //   1646: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   1649: iinc #9, 1
    //   1652: goto -> 1612
    //   1655: iinc #8, 1
    //   1658: goto -> 1602
    //   1661: aload_0
    //   1662: aload_1
    //   1663: aload_3
    //   1664: iconst_4
    //   1665: iconst_1
    //   1666: iconst_2
    //   1667: iconst_2
    //   1668: invokevirtual Dne : (LQnq;LCLK;IIII)V
    //   1671: iconst_1
    //   1672: ireturn
  }
  
  public static ykp Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 7, 12, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new ykp(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ykp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */