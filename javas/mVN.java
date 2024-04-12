public class mVN extends Jte {
  static {
  
  }
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((TpA)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
  
  public void Dne(TpA paramTpA, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()F
    //   4: fstore #9
    //   6: fload #9
    //   8: fconst_0
    //   9: fcmpl
    //   10: ifle -> 1174
    //   13: getstatic WAR.Dne : LWAR;
    //   16: astore #10
    //   18: aload_0
    //   19: ldc '/misc/beam.png'
    //   21: invokevirtual Dne : (Ljava/lang/String;)V
    //   24: sipush #3553
    //   27: sipush #10242
    //   30: ldc 10497.0
    //   32: invokestatic glTexParameterf : (IIF)V
    //   35: sipush #3553
    //   38: sipush #10243
    //   41: ldc 10497.0
    //   43: invokestatic glTexParameterf : (IIF)V
    //   46: sipush #2896
    //   49: invokestatic glDisable : (I)V
    //   52: sipush #2884
    //   55: invokestatic glDisable : (I)V
    //   58: sipush #3042
    //   61: invokestatic glDisable : (I)V
    //   64: iconst_1
    //   65: invokestatic glDepthMask : (Z)V
    //   68: sipush #770
    //   71: iconst_1
    //   72: invokestatic glBlendFunc : (II)V
    //   75: aload_1
    //   76: invokevirtual Dne : ()LQnq;
    //   79: invokevirtual FWm : ()J
    //   82: l2f
    //   83: fload #8
    //   85: fadd
    //   86: fstore #11
    //   88: fload #11
    //   90: fneg
    //   91: ldc 0.2
    //   93: fmul
    //   94: fload #11
    //   96: fneg
    //   97: ldc 0.1
    //   99: fmul
    //   100: invokestatic Dne : (F)I
    //   103: i2f
    //   104: fsub
    //   105: fstore #12
    //   107: iconst_1
    //   108: istore #13
    //   110: fload #11
    //   112: f2d
    //   113: ldc2_w 0.025
    //   116: dmul
    //   117: dconst_1
    //   118: iload #13
    //   120: iconst_1
    //   121: iand
    //   122: i2d
    //   123: ldc2_w 2.5
    //   126: dmul
    //   127: dsub
    //   128: dmul
    //   129: dstore #14
    //   131: aload #10
    //   133: invokevirtual Dne : ()V
    //   136: aload #10
    //   138: sipush #255
    //   141: sipush #255
    //   144: sipush #255
    //   147: bipush #32
    //   149: invokevirtual Dne : (IIII)V
    //   152: iload #13
    //   154: i2d
    //   155: ldc2_w 0.2
    //   158: dmul
    //   159: dstore #16
    //   161: ldc2_w 0.5
    //   164: dload #14
    //   166: ldc2_w 2.356194490192345
    //   169: dadd
    //   170: invokestatic cos : (D)D
    //   173: dload #16
    //   175: dmul
    //   176: dadd
    //   177: dstore #18
    //   179: ldc2_w 0.5
    //   182: dload #14
    //   184: ldc2_w 2.356194490192345
    //   187: dadd
    //   188: invokestatic sin : (D)D
    //   191: dload #16
    //   193: dmul
    //   194: dadd
    //   195: dstore #20
    //   197: ldc2_w 0.5
    //   200: dload #14
    //   202: ldc2_w 0.7853981633974483
    //   205: dadd
    //   206: invokestatic cos : (D)D
    //   209: dload #16
    //   211: dmul
    //   212: dadd
    //   213: dstore #22
    //   215: ldc2_w 0.5
    //   218: dload #14
    //   220: ldc2_w 0.7853981633974483
    //   223: dadd
    //   224: invokestatic sin : (D)D
    //   227: dload #16
    //   229: dmul
    //   230: dadd
    //   231: dstore #24
    //   233: ldc2_w 0.5
    //   236: dload #14
    //   238: ldc2_w 3.9269908169872414
    //   241: dadd
    //   242: invokestatic cos : (D)D
    //   245: dload #16
    //   247: dmul
    //   248: dadd
    //   249: dstore #26
    //   251: ldc2_w 0.5
    //   254: dload #14
    //   256: ldc2_w 3.9269908169872414
    //   259: dadd
    //   260: invokestatic sin : (D)D
    //   263: dload #16
    //   265: dmul
    //   266: dadd
    //   267: dstore #28
    //   269: ldc2_w 0.5
    //   272: dload #14
    //   274: ldc2_w 5.497787143782138
    //   277: dadd
    //   278: invokestatic cos : (D)D
    //   281: dload #16
    //   283: dmul
    //   284: dadd
    //   285: dstore #30
    //   287: ldc2_w 0.5
    //   290: dload #14
    //   292: ldc2_w 5.497787143782138
    //   295: dadd
    //   296: invokestatic sin : (D)D
    //   299: dload #16
    //   301: dmul
    //   302: dadd
    //   303: dstore #32
    //   305: ldc 256.0
    //   307: fload #9
    //   309: fmul
    //   310: f2d
    //   311: dstore #34
    //   313: dconst_0
    //   314: dstore #36
    //   316: dconst_1
    //   317: dstore #38
    //   319: ldc -1.0
    //   321: fload #12
    //   323: fadd
    //   324: f2d
    //   325: dstore #40
    //   327: ldc 256.0
    //   329: fload #9
    //   331: fmul
    //   332: f2d
    //   333: ldc2_w 0.5
    //   336: dload #16
    //   338: ddiv
    //   339: dmul
    //   340: dload #40
    //   342: dadd
    //   343: dstore #42
    //   345: aload #10
    //   347: dload_2
    //   348: dload #18
    //   350: dadd
    //   351: dload #4
    //   353: dload #34
    //   355: dadd
    //   356: dload #6
    //   358: dload #20
    //   360: dadd
    //   361: dload #38
    //   363: dload #42
    //   365: invokevirtual Dne : (DDDDD)V
    //   368: aload #10
    //   370: dload_2
    //   371: dload #18
    //   373: dadd
    //   374: dload #4
    //   376: dload #6
    //   378: dload #20
    //   380: dadd
    //   381: dload #38
    //   383: dload #40
    //   385: invokevirtual Dne : (DDDDD)V
    //   388: aload #10
    //   390: dload_2
    //   391: dload #22
    //   393: dadd
    //   394: dload #4
    //   396: dload #6
    //   398: dload #24
    //   400: dadd
    //   401: dload #36
    //   403: dload #40
    //   405: invokevirtual Dne : (DDDDD)V
    //   408: aload #10
    //   410: dload_2
    //   411: dload #22
    //   413: dadd
    //   414: dload #4
    //   416: dload #34
    //   418: dadd
    //   419: dload #6
    //   421: dload #24
    //   423: dadd
    //   424: dload #36
    //   426: dload #42
    //   428: invokevirtual Dne : (DDDDD)V
    //   431: aload #10
    //   433: dload_2
    //   434: dload #30
    //   436: dadd
    //   437: dload #4
    //   439: dload #34
    //   441: dadd
    //   442: dload #6
    //   444: dload #32
    //   446: dadd
    //   447: dload #38
    //   449: dload #42
    //   451: invokevirtual Dne : (DDDDD)V
    //   454: aload #10
    //   456: dload_2
    //   457: dload #30
    //   459: dadd
    //   460: dload #4
    //   462: dload #6
    //   464: dload #32
    //   466: dadd
    //   467: dload #38
    //   469: dload #40
    //   471: invokevirtual Dne : (DDDDD)V
    //   474: aload #10
    //   476: dload_2
    //   477: dload #26
    //   479: dadd
    //   480: dload #4
    //   482: dload #6
    //   484: dload #28
    //   486: dadd
    //   487: dload #36
    //   489: dload #40
    //   491: invokevirtual Dne : (DDDDD)V
    //   494: aload #10
    //   496: dload_2
    //   497: dload #26
    //   499: dadd
    //   500: dload #4
    //   502: dload #34
    //   504: dadd
    //   505: dload #6
    //   507: dload #28
    //   509: dadd
    //   510: dload #36
    //   512: dload #42
    //   514: invokevirtual Dne : (DDDDD)V
    //   517: aload #10
    //   519: dload_2
    //   520: dload #22
    //   522: dadd
    //   523: dload #4
    //   525: dload #34
    //   527: dadd
    //   528: dload #6
    //   530: dload #24
    //   532: dadd
    //   533: dload #38
    //   535: dload #42
    //   537: invokevirtual Dne : (DDDDD)V
    //   540: aload #10
    //   542: dload_2
    //   543: dload #22
    //   545: dadd
    //   546: dload #4
    //   548: dload #6
    //   550: dload #24
    //   552: dadd
    //   553: dload #38
    //   555: dload #40
    //   557: invokevirtual Dne : (DDDDD)V
    //   560: aload #10
    //   562: dload_2
    //   563: dload #30
    //   565: dadd
    //   566: dload #4
    //   568: dload #6
    //   570: dload #32
    //   572: dadd
    //   573: dload #36
    //   575: dload #40
    //   577: invokevirtual Dne : (DDDDD)V
    //   580: aload #10
    //   582: dload_2
    //   583: dload #30
    //   585: dadd
    //   586: dload #4
    //   588: dload #34
    //   590: dadd
    //   591: dload #6
    //   593: dload #32
    //   595: dadd
    //   596: dload #36
    //   598: dload #42
    //   600: invokevirtual Dne : (DDDDD)V
    //   603: aload #10
    //   605: dload_2
    //   606: dload #26
    //   608: dadd
    //   609: dload #4
    //   611: dload #34
    //   613: dadd
    //   614: dload #6
    //   616: dload #28
    //   618: dadd
    //   619: dload #38
    //   621: dload #42
    //   623: invokevirtual Dne : (DDDDD)V
    //   626: aload #10
    //   628: dload_2
    //   629: dload #26
    //   631: dadd
    //   632: dload #4
    //   634: dload #6
    //   636: dload #28
    //   638: dadd
    //   639: dload #38
    //   641: dload #40
    //   643: invokevirtual Dne : (DDDDD)V
    //   646: aload #10
    //   648: dload_2
    //   649: dload #18
    //   651: dadd
    //   652: dload #4
    //   654: dload #6
    //   656: dload #20
    //   658: dadd
    //   659: dload #36
    //   661: dload #40
    //   663: invokevirtual Dne : (DDDDD)V
    //   666: aload #10
    //   668: dload_2
    //   669: dload #18
    //   671: dadd
    //   672: dload #4
    //   674: dload #34
    //   676: dadd
    //   677: dload #6
    //   679: dload #20
    //   681: dadd
    //   682: dload #36
    //   684: dload #42
    //   686: invokevirtual Dne : (DDDDD)V
    //   689: aload #10
    //   691: invokevirtual Dne : ()I
    //   694: pop
    //   695: sipush #3042
    //   698: invokestatic glEnable : (I)V
    //   701: sipush #770
    //   704: sipush #771
    //   707: invokestatic glBlendFunc : (II)V
    //   710: iconst_0
    //   711: invokestatic glDepthMask : (Z)V
    //   714: aload #10
    //   716: invokevirtual Dne : ()V
    //   719: aload #10
    //   721: sipush #255
    //   724: sipush #255
    //   727: sipush #255
    //   730: bipush #32
    //   732: invokevirtual Dne : (IIII)V
    //   735: ldc2_w 0.2
    //   738: dstore #44
    //   740: ldc2_w 0.2
    //   743: dstore #46
    //   745: ldc2_w 0.8
    //   748: dstore #48
    //   750: ldc2_w 0.2
    //   753: dstore #50
    //   755: ldc2_w 0.2
    //   758: dstore #52
    //   760: ldc2_w 0.8
    //   763: dstore #54
    //   765: ldc2_w 0.8
    //   768: dstore #56
    //   770: ldc2_w 0.8
    //   773: dstore #58
    //   775: ldc 256.0
    //   777: fload #9
    //   779: fmul
    //   780: f2d
    //   781: dstore #60
    //   783: dconst_0
    //   784: dstore #62
    //   786: dconst_1
    //   787: dstore #64
    //   789: ldc -1.0
    //   791: fload #12
    //   793: fadd
    //   794: f2d
    //   795: dstore #66
    //   797: ldc 256.0
    //   799: fload #9
    //   801: fmul
    //   802: f2d
    //   803: dload #66
    //   805: dadd
    //   806: dstore #68
    //   808: aload #10
    //   810: dload_2
    //   811: dload #44
    //   813: dadd
    //   814: dload #4
    //   816: dload #60
    //   818: dadd
    //   819: dload #6
    //   821: dload #46
    //   823: dadd
    //   824: dload #64
    //   826: dload #68
    //   828: invokevirtual Dne : (DDDDD)V
    //   831: aload #10
    //   833: dload_2
    //   834: dload #44
    //   836: dadd
    //   837: dload #4
    //   839: dload #6
    //   841: dload #46
    //   843: dadd
    //   844: dload #64
    //   846: dload #66
    //   848: invokevirtual Dne : (DDDDD)V
    //   851: aload #10
    //   853: dload_2
    //   854: dload #48
    //   856: dadd
    //   857: dload #4
    //   859: dload #6
    //   861: dload #50
    //   863: dadd
    //   864: dload #62
    //   866: dload #66
    //   868: invokevirtual Dne : (DDDDD)V
    //   871: aload #10
    //   873: dload_2
    //   874: dload #48
    //   876: dadd
    //   877: dload #4
    //   879: dload #60
    //   881: dadd
    //   882: dload #6
    //   884: dload #50
    //   886: dadd
    //   887: dload #62
    //   889: dload #68
    //   891: invokevirtual Dne : (DDDDD)V
    //   894: aload #10
    //   896: dload_2
    //   897: dload #56
    //   899: dadd
    //   900: dload #4
    //   902: dload #60
    //   904: dadd
    //   905: dload #6
    //   907: dload #58
    //   909: dadd
    //   910: dload #64
    //   912: dload #68
    //   914: invokevirtual Dne : (DDDDD)V
    //   917: aload #10
    //   919: dload_2
    //   920: dload #56
    //   922: dadd
    //   923: dload #4
    //   925: dload #6
    //   927: dload #58
    //   929: dadd
    //   930: dload #64
    //   932: dload #66
    //   934: invokevirtual Dne : (DDDDD)V
    //   937: aload #10
    //   939: dload_2
    //   940: dload #52
    //   942: dadd
    //   943: dload #4
    //   945: dload #6
    //   947: dload #54
    //   949: dadd
    //   950: dload #62
    //   952: dload #66
    //   954: invokevirtual Dne : (DDDDD)V
    //   957: aload #10
    //   959: dload_2
    //   960: dload #52
    //   962: dadd
    //   963: dload #4
    //   965: dload #60
    //   967: dadd
    //   968: dload #6
    //   970: dload #54
    //   972: dadd
    //   973: dload #62
    //   975: dload #68
    //   977: invokevirtual Dne : (DDDDD)V
    //   980: aload #10
    //   982: dload_2
    //   983: dload #48
    //   985: dadd
    //   986: dload #4
    //   988: dload #60
    //   990: dadd
    //   991: dload #6
    //   993: dload #50
    //   995: dadd
    //   996: dload #64
    //   998: dload #68
    //   1000: invokevirtual Dne : (DDDDD)V
    //   1003: aload #10
    //   1005: dload_2
    //   1006: dload #48
    //   1008: dadd
    //   1009: dload #4
    //   1011: dload #6
    //   1013: dload #50
    //   1015: dadd
    //   1016: dload #64
    //   1018: dload #66
    //   1020: invokevirtual Dne : (DDDDD)V
    //   1023: aload #10
    //   1025: dload_2
    //   1026: dload #56
    //   1028: dadd
    //   1029: dload #4
    //   1031: dload #6
    //   1033: dload #58
    //   1035: dadd
    //   1036: dload #62
    //   1038: dload #66
    //   1040: invokevirtual Dne : (DDDDD)V
    //   1043: aload #10
    //   1045: dload_2
    //   1046: dload #56
    //   1048: dadd
    //   1049: dload #4
    //   1051: dload #60
    //   1053: dadd
    //   1054: dload #6
    //   1056: dload #58
    //   1058: dadd
    //   1059: dload #62
    //   1061: dload #68
    //   1063: invokevirtual Dne : (DDDDD)V
    //   1066: aload #10
    //   1068: dload_2
    //   1069: dload #52
    //   1071: dadd
    //   1072: dload #4
    //   1074: dload #60
    //   1076: dadd
    //   1077: dload #6
    //   1079: dload #54
    //   1081: dadd
    //   1082: dload #64
    //   1084: dload #68
    //   1086: invokevirtual Dne : (DDDDD)V
    //   1089: aload #10
    //   1091: dload_2
    //   1092: dload #52
    //   1094: dadd
    //   1095: dload #4
    //   1097: dload #6
    //   1099: dload #54
    //   1101: dadd
    //   1102: dload #64
    //   1104: dload #66
    //   1106: invokevirtual Dne : (DDDDD)V
    //   1109: aload #10
    //   1111: dload_2
    //   1112: dload #44
    //   1114: dadd
    //   1115: dload #4
    //   1117: dload #6
    //   1119: dload #46
    //   1121: dadd
    //   1122: dload #62
    //   1124: dload #66
    //   1126: invokevirtual Dne : (DDDDD)V
    //   1129: aload #10
    //   1131: dload_2
    //   1132: dload #44
    //   1134: dadd
    //   1135: dload #4
    //   1137: dload #60
    //   1139: dadd
    //   1140: dload #6
    //   1142: dload #46
    //   1144: dadd
    //   1145: dload #62
    //   1147: dload #68
    //   1149: invokevirtual Dne : (DDDDD)V
    //   1152: aload #10
    //   1154: invokevirtual Dne : ()I
    //   1157: pop
    //   1158: sipush #2896
    //   1161: invokestatic glEnable : (I)V
    //   1164: sipush #3553
    //   1167: invokestatic glEnable : (I)V
    //   1170: iconst_1
    //   1171: invokestatic glDepthMask : (Z)V
    //   1174: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mVN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */