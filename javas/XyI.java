import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class XyI {
  private float Dne;
  
  private float FWm;
  
  private int Dne;
  
  public final BXL Dne;
  
  private NMq Dne;
  
  private zVu Dne;
  
  private Minecraft Dne = null;
  
  public void bzF() {
    this.Dne = 0.0F;
  }
  
  public void Dne(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : F
    //   4: aload_0
    //   5: getfield Dne : F
    //   8: aload_0
    //   9: getfield FWm : F
    //   12: fsub
    //   13: fload_1
    //   14: fmul
    //   15: fadd
    //   16: fstore_2
    //   17: aload_0
    //   18: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   21: getfield Dne : LMJs;
    //   24: astore_3
    //   25: aload_3
    //   26: getfield kGO : F
    //   29: aload_3
    //   30: getfield XHL : F
    //   33: aload_3
    //   34: getfield kGO : F
    //   37: fsub
    //   38: fload_1
    //   39: fmul
    //   40: fadd
    //   41: fstore #4
    //   43: invokestatic glPushMatrix : ()V
    //   46: fload #4
    //   48: fconst_1
    //   49: fconst_0
    //   50: fconst_0
    //   51: invokestatic glRotatef : (FFFF)V
    //   54: aload_3
    //   55: getfield Zpi : F
    //   58: aload_3
    //   59: getfield mrb : F
    //   62: aload_3
    //   63: getfield Zpi : F
    //   66: fsub
    //   67: fload_1
    //   68: fmul
    //   69: fadd
    //   70: fconst_0
    //   71: fconst_1
    //   72: fconst_0
    //   73: invokestatic glRotatef : (FFFF)V
    //   76: invokestatic FWm : ()V
    //   79: invokestatic glPopMatrix : ()V
    //   82: aload_3
    //   83: instanceof FKB
    //   86: ifeq -> 166
    //   89: aload_3
    //   90: astore #7
    //   92: aload #7
    //   94: getfield Qnq : F
    //   97: aload #7
    //   99: getfield FWm : F
    //   102: aload #7
    //   104: getfield Qnq : F
    //   107: fsub
    //   108: fload_1
    //   109: fmul
    //   110: fadd
    //   111: fstore #5
    //   113: aload #7
    //   115: getfield bzF : F
    //   118: aload #7
    //   120: getfield Dne : F
    //   123: aload #7
    //   125: getfield bzF : F
    //   128: fsub
    //   129: fload_1
    //   130: fmul
    //   131: fadd
    //   132: fstore #6
    //   134: aload_3
    //   135: getfield XHL : F
    //   138: fload #5
    //   140: fsub
    //   141: ldc 0.1
    //   143: fmul
    //   144: fconst_1
    //   145: fconst_0
    //   146: fconst_0
    //   147: invokestatic glRotatef : (FFFF)V
    //   150: aload_3
    //   151: getfield mrb : F
    //   154: fload #6
    //   156: fsub
    //   157: ldc 0.1
    //   159: fmul
    //   160: fconst_0
    //   161: fconst_1
    //   162: fconst_0
    //   163: invokestatic glRotatef : (FFFF)V
    //   166: aload_0
    //   167: getfield Dne : LNMq;
    //   170: astore #7
    //   172: aload_0
    //   173: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   176: getfield Dne : LVzZ;
    //   179: aload_3
    //   180: getfield div : D
    //   183: invokestatic FWm : (D)I
    //   186: aload_3
    //   187: getfield IjH : D
    //   190: invokestatic FWm : (D)I
    //   193: aload_3
    //   194: getfield mrb : D
    //   197: invokestatic FWm : (D)I
    //   200: invokevirtual Dne : (III)F
    //   203: fstore #5
    //   205: fconst_1
    //   206: fstore #5
    //   208: aload_0
    //   209: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   212: getfield Dne : LVzZ;
    //   215: aload_3
    //   216: getfield div : D
    //   219: invokestatic FWm : (D)I
    //   222: aload_3
    //   223: getfield IjH : D
    //   226: invokestatic FWm : (D)I
    //   229: aload_3
    //   230: getfield mrb : D
    //   233: invokestatic FWm : (D)I
    //   236: iconst_0
    //   237: invokevirtual Dne : (IIII)I
    //   240: istore #8
    //   242: iload #8
    //   244: ldc 65536
    //   246: irem
    //   247: istore #9
    //   249: iload #8
    //   251: ldc 65536
    //   253: idiv
    //   254: istore #10
    //   256: getstatic oCF.FWm : I
    //   259: iload #9
    //   261: i2f
    //   262: fconst_1
    //   263: fdiv
    //   264: iload #10
    //   266: i2f
    //   267: fconst_1
    //   268: fdiv
    //   269: invokestatic Dne : (IFF)V
    //   272: fconst_1
    //   273: fconst_1
    //   274: fconst_1
    //   275: fconst_1
    //   276: invokestatic glColor4f : (FFFF)V
    //   279: aload #7
    //   281: ifnull -> 365
    //   284: getstatic dEr.Dne : [LdEr;
    //   287: aload #7
    //   289: getfield bzF : I
    //   292: aaload
    //   293: aload #7
    //   295: iconst_0
    //   296: invokevirtual Dne : (LNMq;I)I
    //   299: istore #8
    //   301: iload #8
    //   303: bipush #16
    //   305: ishr
    //   306: sipush #255
    //   309: iand
    //   310: i2f
    //   311: ldc 255.0
    //   313: fdiv
    //   314: fstore #12
    //   316: iload #8
    //   318: bipush #8
    //   320: ishr
    //   321: sipush #255
    //   324: iand
    //   325: i2f
    //   326: ldc 255.0
    //   328: fdiv
    //   329: fstore #13
    //   331: iload #8
    //   333: sipush #255
    //   336: iand
    //   337: i2f
    //   338: ldc 255.0
    //   340: fdiv
    //   341: fstore #11
    //   343: fload #5
    //   345: fload #12
    //   347: fmul
    //   348: fload #5
    //   350: fload #13
    //   352: fmul
    //   353: fload #5
    //   355: fload #11
    //   357: fmul
    //   358: fconst_1
    //   359: invokestatic glColor4f : (FFFF)V
    //   362: goto -> 375
    //   365: fload #5
    //   367: fload #5
    //   369: fload #5
    //   371: fconst_1
    //   372: invokestatic glColor4f : (FFFF)V
    //   375: aload #7
    //   377: ifnull -> 1027
    //   380: aload #7
    //   382: getfield bzF : I
    //   385: getstatic dEr.Dne : Lmva;
    //   388: getfield Qnq : I
    //   391: if_icmpne -> 1027
    //   394: invokestatic glPushMatrix : ()V
    //   397: ldc 0.8
    //   399: fstore #6
    //   401: aload_3
    //   402: fload_1
    //   403: invokevirtual FWm : (F)F
    //   406: fstore #12
    //   408: fload #12
    //   410: ldc 3.1415927
    //   412: fmul
    //   413: invokestatic Dne : (F)F
    //   416: fstore #13
    //   418: fload #12
    //   420: invokestatic bzF : (F)F
    //   423: ldc 3.1415927
    //   425: fmul
    //   426: invokestatic Dne : (F)F
    //   429: fstore #11
    //   431: fload #11
    //   433: fneg
    //   434: ldc 0.4
    //   436: fmul
    //   437: fload #12
    //   439: invokestatic bzF : (F)F
    //   442: ldc 3.1415927
    //   444: fmul
    //   445: fconst_2
    //   446: fmul
    //   447: invokestatic Dne : (F)F
    //   450: ldc 0.2
    //   452: fmul
    //   453: fload #13
    //   455: fneg
    //   456: ldc 0.2
    //   458: fmul
    //   459: invokestatic glTranslatef : (FFF)V
    //   462: fconst_1
    //   463: fload #4
    //   465: ldc 45.0
    //   467: fdiv
    //   468: fsub
    //   469: ldc 0.1
    //   471: fadd
    //   472: fstore #12
    //   474: fload #12
    //   476: fconst_0
    //   477: fcmpg
    //   478: ifge -> 484
    //   481: fconst_0
    //   482: fstore #12
    //   484: fload #12
    //   486: fconst_1
    //   487: fcmpl
    //   488: ifle -> 494
    //   491: fconst_1
    //   492: fstore #12
    //   494: fload #12
    //   496: ldc 3.1415927
    //   498: fmul
    //   499: invokestatic FWm : (F)F
    //   502: fneg
    //   503: ldc 0.5
    //   505: fmul
    //   506: ldc 0.5
    //   508: fadd
    //   509: fstore #12
    //   511: fconst_0
    //   512: fconst_0
    //   513: fload #6
    //   515: fmul
    //   516: fconst_1
    //   517: fload_2
    //   518: fsub
    //   519: ldc 1.2
    //   521: fmul
    //   522: fsub
    //   523: fload #12
    //   525: ldc 0.5
    //   527: fmul
    //   528: fsub
    //   529: ldc 0.04
    //   531: fadd
    //   532: ldc -0.9
    //   534: fload #6
    //   536: fmul
    //   537: invokestatic glTranslatef : (FFF)V
    //   540: ldc 90.0
    //   542: fconst_0
    //   543: fconst_1
    //   544: fconst_0
    //   545: invokestatic glRotatef : (FFFF)V
    //   548: fload #12
    //   550: ldc -85.0
    //   552: fmul
    //   553: fconst_0
    //   554: fconst_0
    //   555: fconst_1
    //   556: invokestatic glRotatef : (FFFF)V
    //   559: ldc 32826
    //   561: invokestatic glEnable : (I)V
    //   564: sipush #3553
    //   567: aload_0
    //   568: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   571: getfield Dne : LSnh;
    //   574: aload_0
    //   575: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   578: getfield Dne : LMJs;
    //   581: getfield Dne : Ljava/lang/String;
    //   584: aload_0
    //   585: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   588: getfield Dne : LMJs;
    //   591: invokevirtual bzF : ()Ljava/lang/String;
    //   594: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)I
    //   597: invokestatic glBindTexture : (II)V
    //   600: aload_0
    //   601: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   604: getfield Dne : LSnh;
    //   607: invokevirtual Dne : ()V
    //   610: iconst_0
    //   611: istore #10
    //   613: iload #10
    //   615: iconst_2
    //   616: if_icmpge -> 738
    //   619: iload #10
    //   621: iconst_2
    //   622: imul
    //   623: iconst_1
    //   624: isub
    //   625: istore #19
    //   627: invokestatic glPushMatrix : ()V
    //   630: ldc -0.0
    //   632: ldc -0.6
    //   634: ldc 1.1
    //   636: iload #19
    //   638: i2f
    //   639: fmul
    //   640: invokestatic glTranslatef : (FFF)V
    //   643: bipush #-45
    //   645: iload #19
    //   647: imul
    //   648: i2f
    //   649: fconst_1
    //   650: fconst_0
    //   651: fconst_0
    //   652: invokestatic glRotatef : (FFFF)V
    //   655: ldc -90.0
    //   657: fconst_0
    //   658: fconst_0
    //   659: fconst_1
    //   660: invokestatic glRotatef : (FFFF)V
    //   663: ldc 59.0
    //   665: fconst_0
    //   666: fconst_0
    //   667: fconst_1
    //   668: invokestatic glRotatef : (FFFF)V
    //   671: bipush #-65
    //   673: iload #19
    //   675: imul
    //   676: i2f
    //   677: fconst_0
    //   678: fconst_1
    //   679: fconst_0
    //   680: invokestatic glRotatef : (FFFF)V
    //   683: getstatic ptH.Dne : LptH;
    //   686: aload_0
    //   687: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   690: getfield Dne : LMJs;
    //   693: invokevirtual Dne : (LsMa;)LQCe;
    //   696: astore #17
    //   698: aload #17
    //   700: checkcast CSH
    //   703: astore #18
    //   705: fconst_1
    //   706: fstore #16
    //   708: fload #16
    //   710: fload #16
    //   712: fload #16
    //   714: invokestatic glScalef : (FFF)V
    //   717: aload #18
    //   719: aload_0
    //   720: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   723: getfield Dne : LMJs;
    //   726: invokevirtual FWm : (LFiG;)V
    //   729: invokestatic glPopMatrix : ()V
    //   732: iinc #10, 1
    //   735: goto -> 613
    //   738: aload_3
    //   739: fload_1
    //   740: invokevirtual FWm : (F)F
    //   743: fstore #13
    //   745: fload #13
    //   747: fload #13
    //   749: fmul
    //   750: ldc 3.1415927
    //   752: fmul
    //   753: invokestatic Dne : (F)F
    //   756: fstore #11
    //   758: fload #13
    //   760: invokestatic bzF : (F)F
    //   763: ldc 3.1415927
    //   765: fmul
    //   766: invokestatic Dne : (F)F
    //   769: fstore #14
    //   771: fload #11
    //   773: fneg
    //   774: ldc 20.0
    //   776: fmul
    //   777: fconst_0
    //   778: fconst_1
    //   779: fconst_0
    //   780: invokestatic glRotatef : (FFFF)V
    //   783: fload #14
    //   785: fneg
    //   786: ldc 20.0
    //   788: fmul
    //   789: fconst_0
    //   790: fconst_0
    //   791: fconst_1
    //   792: invokestatic glRotatef : (FFFF)V
    //   795: fload #14
    //   797: fneg
    //   798: ldc 80.0
    //   800: fmul
    //   801: fconst_1
    //   802: fconst_0
    //   803: fconst_0
    //   804: invokestatic glRotatef : (FFFF)V
    //   807: ldc 0.38
    //   809: fstore #15
    //   811: fload #15
    //   813: fload #15
    //   815: fload #15
    //   817: invokestatic glScalef : (FFF)V
    //   820: ldc 90.0
    //   822: fconst_0
    //   823: fconst_1
    //   824: fconst_0
    //   825: invokestatic glRotatef : (FFFF)V
    //   828: ldc 180.0
    //   830: fconst_0
    //   831: fconst_0
    //   832: fconst_1
    //   833: invokestatic glRotatef : (FFFF)V
    //   836: ldc -1.0
    //   838: ldc -1.0
    //   840: fconst_0
    //   841: invokestatic glTranslatef : (FFF)V
    //   844: ldc 0.015625
    //   846: fstore #16
    //   848: fload #16
    //   850: fload #16
    //   852: fload #16
    //   854: invokestatic glScalef : (FFF)V
    //   857: aload_0
    //   858: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   861: getfield Dne : LSnh;
    //   864: ldc '/misc/mapbg.png'
    //   866: invokevirtual Dne : (Ljava/lang/String;)V
    //   869: getstatic WAR.Dne : LWAR;
    //   872: astore #19
    //   874: fconst_0
    //   875: fconst_0
    //   876: ldc -1.0
    //   878: invokestatic glNormal3f : (FFF)V
    //   881: aload #19
    //   883: invokevirtual Dne : ()V
    //   886: bipush #7
    //   888: istore #20
    //   890: aload #19
    //   892: iconst_0
    //   893: iload #20
    //   895: isub
    //   896: i2d
    //   897: sipush #128
    //   900: iload #20
    //   902: iadd
    //   903: i2d
    //   904: dconst_0
    //   905: dconst_0
    //   906: dconst_1
    //   907: invokevirtual Dne : (DDDDD)V
    //   910: aload #19
    //   912: sipush #128
    //   915: iload #20
    //   917: iadd
    //   918: i2d
    //   919: sipush #128
    //   922: iload #20
    //   924: iadd
    //   925: i2d
    //   926: dconst_0
    //   927: dconst_1
    //   928: dconst_1
    //   929: invokevirtual Dne : (DDDDD)V
    //   932: aload #19
    //   934: sipush #128
    //   937: iload #20
    //   939: iadd
    //   940: i2d
    //   941: iconst_0
    //   942: iload #20
    //   944: isub
    //   945: i2d
    //   946: dconst_0
    //   947: dconst_1
    //   948: dconst_0
    //   949: invokevirtual Dne : (DDDDD)V
    //   952: aload #19
    //   954: iconst_0
    //   955: iload #20
    //   957: isub
    //   958: i2d
    //   959: iconst_0
    //   960: iload #20
    //   962: isub
    //   963: i2d
    //   964: dconst_0
    //   965: dconst_0
    //   966: dconst_0
    //   967: invokevirtual Dne : (DDDDD)V
    //   970: aload #19
    //   972: invokevirtual Dne : ()I
    //   975: pop
    //   976: getstatic dEr.Dne : Lmva;
    //   979: aload #7
    //   981: aload_0
    //   982: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   985: getfield Dne : LVzZ;
    //   988: invokevirtual Dne : (LNMq;LQnq;)LIlk;
    //   991: astore #21
    //   993: aload #21
    //   995: ifnull -> 1021
    //   998: aload_0
    //   999: getfield Dne : LBXL;
    //   1002: aload_0
    //   1003: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1006: getfield Dne : LMJs;
    //   1009: aload_0
    //   1010: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1013: getfield Dne : LSnh;
    //   1016: aload #21
    //   1018: invokevirtual Dne : (LFiG;LSnh;LIlk;)V
    //   1021: invokestatic glPopMatrix : ()V
    //   1024: goto -> 2132
    //   1027: aload #7
    //   1029: ifnull -> 1813
    //   1032: invokestatic glPushMatrix : ()V
    //   1035: ldc 0.8
    //   1037: fstore #6
    //   1039: aload_3
    //   1040: invokevirtual qLR : ()I
    //   1043: ifle -> 1225
    //   1046: aload #7
    //   1048: invokevirtual Dne : ()Leen;
    //   1051: astore #19
    //   1053: aload #19
    //   1055: getstatic een.FWm : Leen;
    //   1058: if_acmpeq -> 1069
    //   1061: aload #19
    //   1063: getstatic een.bzF : Leen;
    //   1066: if_acmpne -> 1222
    //   1069: aload_3
    //   1070: invokevirtual qLR : ()I
    //   1073: i2f
    //   1074: fload_1
    //   1075: fsub
    //   1076: fconst_1
    //   1077: fadd
    //   1078: fstore #13
    //   1080: fconst_1
    //   1081: fload #13
    //   1083: aload #7
    //   1085: invokevirtual zGp : ()I
    //   1088: i2f
    //   1089: fdiv
    //   1090: fsub
    //   1091: fstore #11
    //   1093: fconst_1
    //   1094: fload #11
    //   1096: fsub
    //   1097: fstore #14
    //   1099: fload #14
    //   1101: fload #14
    //   1103: fmul
    //   1104: fload #14
    //   1106: fmul
    //   1107: fstore #14
    //   1109: fload #14
    //   1111: fload #14
    //   1113: fmul
    //   1114: fload #14
    //   1116: fmul
    //   1117: fstore #14
    //   1119: fload #14
    //   1121: fload #14
    //   1123: fmul
    //   1124: fload #14
    //   1126: fmul
    //   1127: fstore #14
    //   1129: fconst_1
    //   1130: fload #14
    //   1132: fsub
    //   1133: fstore #15
    //   1135: fconst_0
    //   1136: fload #13
    //   1138: ldc 4.0
    //   1140: fdiv
    //   1141: ldc 3.1415927
    //   1143: fmul
    //   1144: invokestatic FWm : (F)F
    //   1147: ldc 0.1
    //   1149: fmul
    //   1150: invokestatic Qnq : (F)F
    //   1153: fload #11
    //   1155: f2d
    //   1156: ldc2_w 0.2
    //   1159: dcmpl
    //   1160: ifle -> 1167
    //   1163: iconst_1
    //   1164: goto -> 1168
    //   1167: iconst_0
    //   1168: i2f
    //   1169: fmul
    //   1170: fconst_0
    //   1171: invokestatic glTranslatef : (FFF)V
    //   1174: fload #15
    //   1176: ldc 0.6
    //   1178: fmul
    //   1179: fload #15
    //   1181: fneg
    //   1182: ldc 0.5
    //   1184: fmul
    //   1185: fconst_0
    //   1186: invokestatic glTranslatef : (FFF)V
    //   1189: fload #15
    //   1191: ldc 90.0
    //   1193: fmul
    //   1194: fconst_0
    //   1195: fconst_1
    //   1196: fconst_0
    //   1197: invokestatic glRotatef : (FFFF)V
    //   1200: fload #15
    //   1202: ldc 10.0
    //   1204: fmul
    //   1205: fconst_1
    //   1206: fconst_0
    //   1207: fconst_0
    //   1208: invokestatic glRotatef : (FFFF)V
    //   1211: fload #15
    //   1213: ldc 30.0
    //   1215: fmul
    //   1216: fconst_0
    //   1217: fconst_0
    //   1218: fconst_1
    //   1219: invokestatic glRotatef : (FFFF)V
    //   1222: goto -> 1286
    //   1225: aload_3
    //   1226: fload_1
    //   1227: invokevirtual FWm : (F)F
    //   1230: fstore #12
    //   1232: fload #12
    //   1234: ldc 3.1415927
    //   1236: fmul
    //   1237: invokestatic Dne : (F)F
    //   1240: fstore #13
    //   1242: fload #12
    //   1244: invokestatic bzF : (F)F
    //   1247: ldc 3.1415927
    //   1249: fmul
    //   1250: invokestatic Dne : (F)F
    //   1253: fstore #11
    //   1255: fload #11
    //   1257: fneg
    //   1258: ldc 0.4
    //   1260: fmul
    //   1261: fload #12
    //   1263: invokestatic bzF : (F)F
    //   1266: ldc 3.1415927
    //   1268: fmul
    //   1269: fconst_2
    //   1270: fmul
    //   1271: invokestatic Dne : (F)F
    //   1274: ldc 0.2
    //   1276: fmul
    //   1277: fload #13
    //   1279: fneg
    //   1280: ldc 0.2
    //   1282: fmul
    //   1283: invokestatic glTranslatef : (FFF)V
    //   1286: ldc 0.7
    //   1288: fload #6
    //   1290: fmul
    //   1291: ldc -0.65
    //   1293: fload #6
    //   1295: fmul
    //   1296: fconst_1
    //   1297: fload_2
    //   1298: fsub
    //   1299: ldc 0.6
    //   1301: fmul
    //   1302: fsub
    //   1303: ldc -0.9
    //   1305: fload #6
    //   1307: fmul
    //   1308: invokestatic glTranslatef : (FFF)V
    //   1311: ldc 45.0
    //   1313: fconst_0
    //   1314: fconst_1
    //   1315: fconst_0
    //   1316: invokestatic glRotatef : (FFFF)V
    //   1319: ldc 32826
    //   1321: invokestatic glEnable : (I)V
    //   1324: aload_3
    //   1325: fload_1
    //   1326: invokevirtual FWm : (F)F
    //   1329: fstore #12
    //   1331: fload #12
    //   1333: fload #12
    //   1335: fmul
    //   1336: ldc 3.1415927
    //   1338: fmul
    //   1339: invokestatic Dne : (F)F
    //   1342: fstore #13
    //   1344: fload #12
    //   1346: invokestatic bzF : (F)F
    //   1349: ldc 3.1415927
    //   1351: fmul
    //   1352: invokestatic Dne : (F)F
    //   1355: fstore #11
    //   1357: fload #13
    //   1359: fneg
    //   1360: ldc 20.0
    //   1362: fmul
    //   1363: fconst_0
    //   1364: fconst_1
    //   1365: fconst_0
    //   1366: invokestatic glRotatef : (FFFF)V
    //   1369: fload #11
    //   1371: fneg
    //   1372: ldc 20.0
    //   1374: fmul
    //   1375: fconst_0
    //   1376: fconst_0
    //   1377: fconst_1
    //   1378: invokestatic glRotatef : (FFFF)V
    //   1381: fload #11
    //   1383: fneg
    //   1384: ldc 80.0
    //   1386: fmul
    //   1387: fconst_1
    //   1388: fconst_0
    //   1389: fconst_0
    //   1390: invokestatic glRotatef : (FFFF)V
    //   1393: ldc 0.4
    //   1395: fstore #14
    //   1397: fload #14
    //   1399: fload #14
    //   1401: fload #14
    //   1403: invokestatic glScalef : (FFF)V
    //   1406: aload_3
    //   1407: invokevirtual qLR : ()I
    //   1410: ifle -> 1672
    //   1413: aload #7
    //   1415: invokevirtual Dne : ()Leen;
    //   1418: astore #21
    //   1420: aload #21
    //   1422: getstatic een.Qnq : Leen;
    //   1425: if_acmpne -> 1466
    //   1428: ldc_w -0.5
    //   1431: ldc 0.2
    //   1433: fconst_0
    //   1434: invokestatic glTranslatef : (FFF)V
    //   1437: ldc 30.0
    //   1439: fconst_0
    //   1440: fconst_1
    //   1441: fconst_0
    //   1442: invokestatic glRotatef : (FFFF)V
    //   1445: ldc_w -80.0
    //   1448: fconst_1
    //   1449: fconst_0
    //   1450: fconst_0
    //   1451: invokestatic glRotatef : (FFFF)V
    //   1454: ldc_w 60.0
    //   1457: fconst_0
    //   1458: fconst_1
    //   1459: fconst_0
    //   1460: invokestatic glRotatef : (FFFF)V
    //   1463: goto -> 1672
    //   1466: aload #21
    //   1468: getstatic een.aFZ : Leen;
    //   1471: if_acmpne -> 1672
    //   1474: ldc_w -18.0
    //   1477: fconst_0
    //   1478: fconst_0
    //   1479: fconst_1
    //   1480: invokestatic glRotatef : (FFFF)V
    //   1483: ldc_w -12.0
    //   1486: fconst_0
    //   1487: fconst_1
    //   1488: fconst_0
    //   1489: invokestatic glRotatef : (FFFF)V
    //   1492: ldc_w -8.0
    //   1495: fconst_1
    //   1496: fconst_0
    //   1497: fconst_0
    //   1498: invokestatic glRotatef : (FFFF)V
    //   1501: ldc -0.9
    //   1503: ldc 0.2
    //   1505: fconst_0
    //   1506: invokestatic glTranslatef : (FFF)V
    //   1509: aload #7
    //   1511: invokevirtual zGp : ()I
    //   1514: i2f
    //   1515: aload_3
    //   1516: invokevirtual qLR : ()I
    //   1519: i2f
    //   1520: fload_1
    //   1521: fsub
    //   1522: fconst_1
    //   1523: fadd
    //   1524: fsub
    //   1525: fstore #16
    //   1527: fload #16
    //   1529: ldc 20.0
    //   1531: fdiv
    //   1532: fstore #19
    //   1534: fload #19
    //   1536: fload #19
    //   1538: fmul
    //   1539: fload #19
    //   1541: fconst_2
    //   1542: fmul
    //   1543: fadd
    //   1544: ldc_w 3.0
    //   1547: fdiv
    //   1548: fstore #19
    //   1550: fload #19
    //   1552: fconst_1
    //   1553: fcmpl
    //   1554: ifle -> 1560
    //   1557: fconst_1
    //   1558: fstore #19
    //   1560: fload #19
    //   1562: ldc 0.1
    //   1564: fcmpl
    //   1565: ifle -> 1595
    //   1568: fconst_0
    //   1569: fload #16
    //   1571: ldc 0.1
    //   1573: fsub
    //   1574: ldc_w 1.3
    //   1577: fmul
    //   1578: invokestatic Dne : (F)F
    //   1581: ldc_w 0.01
    //   1584: fmul
    //   1585: fload #19
    //   1587: ldc 0.1
    //   1589: fsub
    //   1590: fmul
    //   1591: fconst_0
    //   1592: invokestatic glTranslatef : (FFF)V
    //   1595: fconst_0
    //   1596: fconst_0
    //   1597: fload #19
    //   1599: ldc 0.1
    //   1601: fmul
    //   1602: invokestatic glTranslatef : (FFF)V
    //   1605: ldc_w -335.0
    //   1608: fconst_0
    //   1609: fconst_0
    //   1610: fconst_1
    //   1611: invokestatic glRotatef : (FFFF)V
    //   1614: ldc_w -50.0
    //   1617: fconst_0
    //   1618: fconst_1
    //   1619: fconst_0
    //   1620: invokestatic glRotatef : (FFFF)V
    //   1623: fconst_0
    //   1624: ldc 0.5
    //   1626: fconst_0
    //   1627: invokestatic glTranslatef : (FFF)V
    //   1630: fconst_1
    //   1631: fload #19
    //   1633: ldc 0.2
    //   1635: fmul
    //   1636: fadd
    //   1637: fstore #20
    //   1639: fconst_1
    //   1640: fconst_1
    //   1641: fload #20
    //   1643: invokestatic glScalef : (FFF)V
    //   1646: fconst_0
    //   1647: ldc_w -0.5
    //   1650: fconst_0
    //   1651: invokestatic glTranslatef : (FFF)V
    //   1654: ldc_w 50.0
    //   1657: fconst_0
    //   1658: fconst_1
    //   1659: fconst_0
    //   1660: invokestatic glRotatef : (FFFF)V
    //   1663: ldc_w 335.0
    //   1666: fconst_0
    //   1667: fconst_0
    //   1668: fconst_1
    //   1669: invokestatic glRotatef : (FFFF)V
    //   1672: aload #7
    //   1674: invokevirtual Dne : ()LdEr;
    //   1677: invokevirtual bzF : ()Z
    //   1680: ifeq -> 1691
    //   1683: ldc 180.0
    //   1685: fconst_0
    //   1686: fconst_1
    //   1687: fconst_0
    //   1688: invokestatic glRotatef : (FFFF)V
    //   1691: aload #7
    //   1693: invokevirtual Dne : ()LdEr;
    //   1696: invokevirtual Dne : ()Z
    //   1699: ifeq -> 1799
    //   1702: aload_0
    //   1703: aload_3
    //   1704: aload #7
    //   1706: iconst_0
    //   1707: invokevirtual Dne : (LFUH;LNMq;I)V
    //   1710: getstatic dEr.Dne : [LdEr;
    //   1713: aload #7
    //   1715: getfield bzF : I
    //   1718: aaload
    //   1719: aload #7
    //   1721: iconst_1
    //   1722: invokevirtual Dne : (LNMq;I)I
    //   1725: istore #21
    //   1727: iload #21
    //   1729: bipush #16
    //   1731: ishr
    //   1732: sipush #255
    //   1735: iand
    //   1736: i2f
    //   1737: ldc 255.0
    //   1739: fdiv
    //   1740: fstore #16
    //   1742: iload #21
    //   1744: bipush #8
    //   1746: ishr
    //   1747: sipush #255
    //   1750: iand
    //   1751: i2f
    //   1752: ldc 255.0
    //   1754: fdiv
    //   1755: fstore #19
    //   1757: iload #21
    //   1759: sipush #255
    //   1762: iand
    //   1763: i2f
    //   1764: ldc 255.0
    //   1766: fdiv
    //   1767: fstore #20
    //   1769: fload #5
    //   1771: fload #16
    //   1773: fmul
    //   1774: fload #5
    //   1776: fload #19
    //   1778: fmul
    //   1779: fload #5
    //   1781: fload #20
    //   1783: fmul
    //   1784: fconst_1
    //   1785: invokestatic glColor4f : (FFFF)V
    //   1788: aload_0
    //   1789: aload_3
    //   1790: aload #7
    //   1792: iconst_1
    //   1793: invokevirtual Dne : (LFUH;LNMq;I)V
    //   1796: goto -> 1807
    //   1799: aload_0
    //   1800: aload_3
    //   1801: aload #7
    //   1803: iconst_0
    //   1804: invokevirtual Dne : (LFUH;LNMq;I)V
    //   1807: invokestatic glPopMatrix : ()V
    //   1810: goto -> 2132
    //   1813: aload_3
    //   1814: invokevirtual Vxn : ()Z
    //   1817: ifne -> 2132
    //   1820: invokestatic glPushMatrix : ()V
    //   1823: ldc 0.8
    //   1825: fstore #6
    //   1827: aload_3
    //   1828: fload_1
    //   1829: invokevirtual FWm : (F)F
    //   1832: fstore #12
    //   1834: fload #12
    //   1836: ldc 3.1415927
    //   1838: fmul
    //   1839: invokestatic Dne : (F)F
    //   1842: fstore #13
    //   1844: fload #12
    //   1846: invokestatic bzF : (F)F
    //   1849: ldc 3.1415927
    //   1851: fmul
    //   1852: invokestatic Dne : (F)F
    //   1855: fstore #11
    //   1857: fload #11
    //   1859: fneg
    //   1860: ldc_w 0.3
    //   1863: fmul
    //   1864: fload #12
    //   1866: invokestatic bzF : (F)F
    //   1869: ldc 3.1415927
    //   1871: fmul
    //   1872: fconst_2
    //   1873: fmul
    //   1874: invokestatic Dne : (F)F
    //   1877: ldc 0.4
    //   1879: fmul
    //   1880: fload #13
    //   1882: fneg
    //   1883: ldc 0.4
    //   1885: fmul
    //   1886: invokestatic glTranslatef : (FFF)V
    //   1889: ldc 0.8
    //   1891: fload #6
    //   1893: fmul
    //   1894: ldc_w -0.75
    //   1897: fload #6
    //   1899: fmul
    //   1900: fconst_1
    //   1901: fload_2
    //   1902: fsub
    //   1903: ldc 0.6
    //   1905: fmul
    //   1906: fsub
    //   1907: ldc -0.9
    //   1909: fload #6
    //   1911: fmul
    //   1912: invokestatic glTranslatef : (FFF)V
    //   1915: ldc 45.0
    //   1917: fconst_0
    //   1918: fconst_1
    //   1919: fconst_0
    //   1920: invokestatic glRotatef : (FFFF)V
    //   1923: ldc 32826
    //   1925: invokestatic glEnable : (I)V
    //   1928: aload_3
    //   1929: fload_1
    //   1930: invokevirtual FWm : (F)F
    //   1933: fstore #12
    //   1935: fload #12
    //   1937: fload #12
    //   1939: fmul
    //   1940: ldc 3.1415927
    //   1942: fmul
    //   1943: invokestatic Dne : (F)F
    //   1946: fstore #13
    //   1948: fload #12
    //   1950: invokestatic bzF : (F)F
    //   1953: ldc 3.1415927
    //   1955: fmul
    //   1956: invokestatic Dne : (F)F
    //   1959: fstore #11
    //   1961: fload #11
    //   1963: ldc_w 70.0
    //   1966: fmul
    //   1967: fconst_0
    //   1968: fconst_1
    //   1969: fconst_0
    //   1970: invokestatic glRotatef : (FFFF)V
    //   1973: fload #13
    //   1975: fneg
    //   1976: ldc 20.0
    //   1978: fmul
    //   1979: fconst_0
    //   1980: fconst_0
    //   1981: fconst_1
    //   1982: invokestatic glRotatef : (FFFF)V
    //   1985: sipush #3553
    //   1988: aload_0
    //   1989: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1992: getfield Dne : LSnh;
    //   1995: aload_0
    //   1996: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1999: getfield Dne : LMJs;
    //   2002: getfield Dne : Ljava/lang/String;
    //   2005: aload_0
    //   2006: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2009: getfield Dne : LMJs;
    //   2012: invokevirtual bzF : ()Ljava/lang/String;
    //   2015: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)I
    //   2018: invokestatic glBindTexture : (II)V
    //   2021: aload_0
    //   2022: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2025: getfield Dne : LSnh;
    //   2028: invokevirtual Dne : ()V
    //   2031: ldc -1.0
    //   2033: ldc_w 3.6
    //   2036: ldc_w 3.5
    //   2039: invokestatic glTranslatef : (FFF)V
    //   2042: ldc_w 120.0
    //   2045: fconst_0
    //   2046: fconst_0
    //   2047: fconst_1
    //   2048: invokestatic glRotatef : (FFFF)V
    //   2051: ldc_w 200.0
    //   2054: fconst_1
    //   2055: fconst_0
    //   2056: fconst_0
    //   2057: invokestatic glRotatef : (FFFF)V
    //   2060: ldc_w -135.0
    //   2063: fconst_0
    //   2064: fconst_1
    //   2065: fconst_0
    //   2066: invokestatic glRotatef : (FFFF)V
    //   2069: fconst_1
    //   2070: fconst_1
    //   2071: fconst_1
    //   2072: invokestatic glScalef : (FFF)V
    //   2075: ldc_w 5.6
    //   2078: fconst_0
    //   2079: fconst_0
    //   2080: invokestatic glTranslatef : (FFF)V
    //   2083: getstatic ptH.Dne : LptH;
    //   2086: aload_0
    //   2087: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2090: getfield Dne : LMJs;
    //   2093: invokevirtual Dne : (LsMa;)LQCe;
    //   2096: astore #17
    //   2098: aload #17
    //   2100: checkcast CSH
    //   2103: astore #18
    //   2105: fconst_1
    //   2106: fstore #16
    //   2108: fload #16
    //   2110: fload #16
    //   2112: fload #16
    //   2114: invokestatic glScalef : (FFF)V
    //   2117: aload #18
    //   2119: aload_0
    //   2120: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2123: getfield Dne : LMJs;
    //   2126: invokevirtual FWm : (LFiG;)V
    //   2129: invokestatic glPopMatrix : ()V
    //   2132: ldc 32826
    //   2134: invokestatic glDisable : (I)V
    //   2137: invokestatic Dne : ()V
    //   2140: return
  }
  
  private void Dne(float paramFloat, gDn paramgDn) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore_3
    //   4: ldc 0.1
    //   6: fstore #4
    //   8: fload #4
    //   10: fload #4
    //   12: fload #4
    //   14: ldc 0.5
    //   16: invokestatic glColor4f : (FFFF)V
    //   19: invokestatic glPushMatrix : ()V
    //   22: ldc -1.0
    //   24: fstore #5
    //   26: fconst_1
    //   27: fstore #6
    //   29: ldc -1.0
    //   31: fstore #7
    //   33: fconst_1
    //   34: fstore #8
    //   36: ldc_w -0.5
    //   39: fstore #9
    //   41: aload_2
    //   42: invokeinterface Dne : ()F
    //   47: fstore #10
    //   49: aload_2
    //   50: invokeinterface FWm : ()F
    //   55: fstore #11
    //   57: aload_2
    //   58: invokeinterface bzF : ()F
    //   63: fstore #12
    //   65: aload_2
    //   66: invokeinterface Qnq : ()F
    //   71: fstore #13
    //   73: aload_3
    //   74: invokevirtual Dne : ()V
    //   77: aload_3
    //   78: fload #5
    //   80: f2d
    //   81: fload #7
    //   83: f2d
    //   84: fload #9
    //   86: f2d
    //   87: fload #11
    //   89: f2d
    //   90: fload #13
    //   92: f2d
    //   93: invokevirtual Dne : (DDDDD)V
    //   96: aload_3
    //   97: fload #6
    //   99: f2d
    //   100: fload #7
    //   102: f2d
    //   103: fload #9
    //   105: f2d
    //   106: fload #10
    //   108: f2d
    //   109: fload #13
    //   111: f2d
    //   112: invokevirtual Dne : (DDDDD)V
    //   115: aload_3
    //   116: fload #6
    //   118: f2d
    //   119: fload #8
    //   121: f2d
    //   122: fload #9
    //   124: f2d
    //   125: fload #10
    //   127: f2d
    //   128: fload #12
    //   130: f2d
    //   131: invokevirtual Dne : (DDDDD)V
    //   134: aload_3
    //   135: fload #5
    //   137: f2d
    //   138: fload #8
    //   140: f2d
    //   141: fload #9
    //   143: f2d
    //   144: fload #11
    //   146: f2d
    //   147: fload #12
    //   149: f2d
    //   150: invokevirtual Dne : (DDDDD)V
    //   153: aload_3
    //   154: invokevirtual Dne : ()I
    //   157: pop
    //   158: invokestatic glPopMatrix : ()V
    //   161: fconst_1
    //   162: fconst_1
    //   163: fconst_1
    //   164: fconst_1
    //   165: invokestatic glColor4f : (FFFF)V
    //   168: return
  }
  
  private void bzF(float paramFloat) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   8: getfield Dne : LMJs;
    //   11: fload_1
    //   12: invokevirtual Dne : (F)F
    //   15: fstore_3
    //   16: fload_3
    //   17: fload_3
    //   18: fload_3
    //   19: ldc 0.5
    //   21: invokestatic glColor4f : (FFFF)V
    //   24: sipush #3042
    //   27: invokestatic glEnable : (I)V
    //   30: sipush #770
    //   33: sipush #771
    //   36: invokestatic glBlendFunc : (II)V
    //   39: invokestatic glPushMatrix : ()V
    //   42: ldc 4.0
    //   44: fstore #4
    //   46: ldc -1.0
    //   48: fstore #5
    //   50: fconst_1
    //   51: fstore #6
    //   53: ldc -1.0
    //   55: fstore #7
    //   57: fconst_1
    //   58: fstore #8
    //   60: ldc_w -0.5
    //   63: fstore #9
    //   65: aload_0
    //   66: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   69: getfield Dne : LMJs;
    //   72: getfield mrb : F
    //   75: fneg
    //   76: ldc_w 64.0
    //   79: fdiv
    //   80: fstore #10
    //   82: aload_0
    //   83: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   86: getfield Dne : LMJs;
    //   89: getfield XHL : F
    //   92: ldc_w 64.0
    //   95: fdiv
    //   96: fstore #11
    //   98: aload_2
    //   99: invokevirtual Dne : ()V
    //   102: aload_2
    //   103: fload #5
    //   105: f2d
    //   106: fload #7
    //   108: f2d
    //   109: fload #9
    //   111: f2d
    //   112: fload #4
    //   114: fload #10
    //   116: fadd
    //   117: f2d
    //   118: fload #4
    //   120: fload #11
    //   122: fadd
    //   123: f2d
    //   124: invokevirtual Dne : (DDDDD)V
    //   127: aload_2
    //   128: fload #6
    //   130: f2d
    //   131: fload #7
    //   133: f2d
    //   134: fload #9
    //   136: f2d
    //   137: fconst_0
    //   138: fload #10
    //   140: fadd
    //   141: f2d
    //   142: fload #4
    //   144: fload #11
    //   146: fadd
    //   147: f2d
    //   148: invokevirtual Dne : (DDDDD)V
    //   151: aload_2
    //   152: fload #6
    //   154: f2d
    //   155: fload #8
    //   157: f2d
    //   158: fload #9
    //   160: f2d
    //   161: fconst_0
    //   162: fload #10
    //   164: fadd
    //   165: f2d
    //   166: fconst_0
    //   167: fload #11
    //   169: fadd
    //   170: f2d
    //   171: invokevirtual Dne : (DDDDD)V
    //   174: aload_2
    //   175: fload #5
    //   177: f2d
    //   178: fload #8
    //   180: f2d
    //   181: fload #9
    //   183: f2d
    //   184: fload #4
    //   186: fload #10
    //   188: fadd
    //   189: f2d
    //   190: fconst_0
    //   191: fload #11
    //   193: fadd
    //   194: f2d
    //   195: invokevirtual Dne : (DDDDD)V
    //   198: aload_2
    //   199: invokevirtual Dne : ()I
    //   202: pop
    //   203: invokestatic glPopMatrix : ()V
    //   206: fconst_1
    //   207: fconst_1
    //   208: fconst_1
    //   209: fconst_1
    //   210: invokestatic glColor4f : (FFFF)V
    //   213: sipush #3042
    //   216: invokestatic glDisable : (I)V
    //   219: return
  }
  
  public void FWm(float paramFloat) {
    GL11.glDisable(3008);
    if (this.Dne.Dne.trS()) {
      this.Dne.Dne.Dne("/terrain.png");
      Qnq(paramFloat);
    } 
    if (this.Dne.Dne.ooe()) {
      int i = geR.FWm(this.Dne.Dne.div);
      int j = geR.FWm(this.Dne.Dne.IjH);
      int k = geR.FWm(this.Dne.Dne.mrb);
      this.Dne.Dne.Dne("/terrain.png");
      int m = this.Dne.Dne.Dne(i, j, k);
      if (this.Dne.Dne.DyG(i, j, k)) {
        Dne(paramFloat, zKP.Dne[m].FWm(2));
      } else {
        for (byte b = 0; b < 8; b++) {
          float f1 = (((b >> 0) % 2) - 0.5F) * this.Dne.Dne.ooe * 0.9F;
          float f2 = (((b >> 1) % 2) - 0.5F) * this.Dne.Dne.trS * 0.2F;
          float f3 = (((b >> 2) % 2) - 0.5F) * this.Dne.Dne.ooe * 0.9F;
          int n = geR.Dne(i + f1);
          int i1 = geR.Dne(j + f2);
          int i2 = geR.Dne(k + f3);
          if (this.Dne.Dne.DyG(n, i1, i2))
            m = this.Dne.Dne.Dne(n, i1, i2); 
        } 
      } 
      if (zKP.Dne[m] != null)
        Dne(paramFloat, zKP.Dne[m].FWm(2)); 
    } 
    if (this.Dne.Dne.Dne(KFd.div)) {
      this.Dne.Dne.Dne("/misc/water.png");
      bzF(paramFloat);
    } 
    GL11.glEnable(3008);
  }
  
  public void FWm() {
    this.Dne = 0.0F;
  }
  
  public static void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, float paramFloat5) {
    paramWAR.Dne();
    paramWAR.FWm(0.0F, 0.0F, 1.0F);
    paramWAR.Dne(0.0D, 0.0D, 0.0D, paramFloat1, paramFloat4);
    paramWAR.Dne(1.0D, 0.0D, 0.0D, paramFloat3, paramFloat4);
    paramWAR.Dne(1.0D, 1.0D, 0.0D, paramFloat3, paramFloat2);
    paramWAR.Dne(0.0D, 1.0D, 0.0D, paramFloat1, paramFloat2);
    paramWAR.Dne();
    paramWAR.Dne();
    paramWAR.FWm(0.0F, 0.0F, -1.0F);
    paramWAR.Dne(0.0D, 1.0D, (0.0F - paramFloat5), paramFloat1, paramFloat2);
    paramWAR.Dne(1.0D, 1.0D, (0.0F - paramFloat5), paramFloat3, paramFloat2);
    paramWAR.Dne(1.0D, 0.0D, (0.0F - paramFloat5), paramFloat3, paramFloat4);
    paramWAR.Dne(0.0D, 0.0D, (0.0F - paramFloat5), paramFloat1, paramFloat4);
    paramWAR.Dne();
    float f1 = paramInt1 * (paramFloat1 - paramFloat3);
    float f2 = paramInt2 * (paramFloat4 - paramFloat2);
    paramWAR.Dne();
    paramWAR.FWm(-1.0F, 0.0F, 0.0F);
    byte b;
    for (b = 0; b < f1; b++) {
      float f3 = b / f1;
      float f4 = paramFloat1 + (paramFloat3 - paramFloat1) * f3 - 0.5F / paramInt1;
      paramWAR.Dne(f3, 0.0D, (0.0F - paramFloat5), f4, paramFloat4);
      paramWAR.Dne(f3, 0.0D, 0.0D, f4, paramFloat4);
      paramWAR.Dne(f3, 1.0D, 0.0D, f4, paramFloat2);
      paramWAR.Dne(f3, 1.0D, (0.0F - paramFloat5), f4, paramFloat2);
    } 
    paramWAR.Dne();
    paramWAR.Dne();
    paramWAR.FWm(1.0F, 0.0F, 0.0F);
    for (b = 0; b < f1; b++) {
      float f3 = b / f1;
      float f4 = paramFloat1 + (paramFloat3 - paramFloat1) * f3 - 0.5F / paramInt1;
      float f5 = f3 + 1.0F / f1;
      paramWAR.Dne(f5, 1.0D, (0.0F - paramFloat5), f4, paramFloat2);
      paramWAR.Dne(f5, 1.0D, 0.0D, f4, paramFloat2);
      paramWAR.Dne(f5, 0.0D, 0.0D, f4, paramFloat4);
      paramWAR.Dne(f5, 0.0D, (0.0F - paramFloat5), f4, paramFloat4);
    } 
    paramWAR.Dne();
    paramWAR.Dne();
    paramWAR.FWm(0.0F, 1.0F, 0.0F);
    for (b = 0; b < f2; b++) {
      float f3 = b / f2;
      float f4 = paramFloat4 + (paramFloat2 - paramFloat4) * f3 - 0.5F / paramInt2;
      float f5 = f3 + 1.0F / f2;
      paramWAR.Dne(0.0D, f5, 0.0D, paramFloat1, f4);
      paramWAR.Dne(1.0D, f5, 0.0D, paramFloat3, f4);
      paramWAR.Dne(1.0D, f5, (0.0F - paramFloat5), paramFloat3, f4);
      paramWAR.Dne(0.0D, f5, (0.0F - paramFloat5), paramFloat1, f4);
    } 
    paramWAR.Dne();
    paramWAR.Dne();
    paramWAR.FWm(0.0F, -1.0F, 0.0F);
    for (b = 0; b < f2; b++) {
      float f3 = b / f2;
      float f4 = paramFloat4 + (paramFloat2 - paramFloat4) * f3 - 0.5F / paramInt2;
      paramWAR.Dne(1.0D, f3, 0.0D, paramFloat3, f4);
      paramWAR.Dne(0.0D, f3, 0.0D, paramFloat1, f4);
      paramWAR.Dne(0.0D, f3, (0.0F - paramFloat5), paramFloat1, f4);
      paramWAR.Dne(1.0D, f3, (0.0F - paramFloat5), paramFloat3, f4);
    } 
    paramWAR.Dne();
  }
  
  public XyI(Minecraft paramMinecraft) {
    this.Dne = 0.0F;
    this.FWm = 0.0F;
    this.Dne = (Minecraft)new zVu();
    this.Dne = -1;
    this.Dne = paramMinecraft;
    this.Dne = (Minecraft)new BXL((msA)paramMinecraft.Dne, (fZI)paramMinecraft.Dne, (Snh)paramMinecraft.Dne);
  }
  
  public void Dne(FUH paramFUH, NMq paramNMq, int paramInt) {
    GL11.glPushMatrix();
    if (paramNMq.Dne() == 0 && zKP.Dne[paramNMq.bzF] != null && zVu.Dne(zKP.Dne[paramNMq.bzF].Dne())) {
      this.Dne.Dne.Dne("/terrain.png");
      this.Dne.Dne(zKP.Dne[paramNMq.bzF], paramNMq.Qnq(), 1.0F);
    } else {
      gDn gDn = paramFUH.Dne(paramNMq, paramInt);
      if (gDn == null) {
        GL11.glPopMatrix();
        return;
      } 
      if (paramNMq.Dne() == 0) {
        this.Dne.Dne.Dne("/terrain.png");
      } else {
        this.Dne.Dne.Dne("/gui/items.png");
      } 
      boolean bool = WAR.Dne;
      float f1 = gDn.Dne();
      float f2 = gDn.FWm();
      float f3 = gDn.bzF();
      float f4 = gDn.Qnq();
      float f5 = 0.0F;
      float f6 = 0.3F;
      GL11.glEnable(32826);
      GL11.glTranslatef(-f5, -f6, 0.0F);
      float f7 = 1.5F;
      GL11.glScalef(f7, f7, f7);
      GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
      Dne(bool, f2, f3, f1, f4, gDn.bzF(), gDn.Qnq(), 0.0625F);
      if (paramNMq != null && paramNMq.DyG() && paramInt == 0) {
        GL11.glDepthFunc(514);
        GL11.glDisable(2896);
        this.Dne.Dne.Dne("%blur%/misc/glint.png");
        GL11.glEnable(3042);
        GL11.glBlendFunc(768, 1);
        float f8 = 0.76F;
        GL11.glColor4f(0.5F * f8, 0.25F * f8, 0.8F * f8, 1.0F);
        GL11.glMatrixMode(5890);
        GL11.glPushMatrix();
        float f9 = 0.125F;
        GL11.glScalef(f9, f9, f9);
        float f10 = (float)(Minecraft.Dne() % 3000L) / 3000.0F * 8.0F;
        GL11.glTranslatef(f10, 0.0F, 0.0F);
        GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
        Dne(bool, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(f9, f9, f9);
        f10 = (float)(Minecraft.Dne() % 4873L) / 4873.0F * 8.0F;
        GL11.glTranslatef(-f10, 0.0F, 0.0F);
        GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
        Dne(bool, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glDisable(3042);
        GL11.glEnable(2896);
        GL11.glDepthFunc(515);
      } 
      GL11.glDisable(32826);
    } 
    GL11.glPopMatrix();
  }
  
  private void Qnq(float paramFloat) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore_2
    //   4: fconst_1
    //   5: fconst_1
    //   6: fconst_1
    //   7: ldc_w 0.9
    //   10: invokestatic glColor4f : (FFFF)V
    //   13: sipush #3042
    //   16: invokestatic glEnable : (I)V
    //   19: sipush #770
    //   22: sipush #771
    //   25: invokestatic glBlendFunc : (II)V
    //   28: fconst_1
    //   29: fstore_3
    //   30: iconst_0
    //   31: istore #4
    //   33: iload #4
    //   35: iconst_2
    //   36: if_icmpge -> 247
    //   39: invokestatic glPushMatrix : ()V
    //   42: getstatic zKP.Dne : Liqp;
    //   45: iconst_1
    //   46: invokevirtual Dne : (I)LgDn;
    //   49: astore #5
    //   51: aload #5
    //   53: invokeinterface Dne : ()F
    //   58: fstore #6
    //   60: aload #5
    //   62: invokeinterface FWm : ()F
    //   67: fstore #7
    //   69: aload #5
    //   71: invokeinterface bzF : ()F
    //   76: fstore #8
    //   78: aload #5
    //   80: invokeinterface Qnq : ()F
    //   85: fstore #9
    //   87: fconst_0
    //   88: fload_3
    //   89: fsub
    //   90: fconst_2
    //   91: fdiv
    //   92: fstore #10
    //   94: fload #10
    //   96: fload_3
    //   97: fadd
    //   98: fstore #11
    //   100: fconst_0
    //   101: fload_3
    //   102: fconst_2
    //   103: fdiv
    //   104: fsub
    //   105: fstore #12
    //   107: fload #12
    //   109: fload_3
    //   110: fadd
    //   111: fstore #13
    //   113: ldc_w -0.5
    //   116: fstore #14
    //   118: iload #4
    //   120: iconst_2
    //   121: imul
    //   122: iconst_1
    //   123: isub
    //   124: ineg
    //   125: i2f
    //   126: ldc_w 0.24
    //   129: fmul
    //   130: ldc_w -0.3
    //   133: fconst_0
    //   134: invokestatic glTranslatef : (FFF)V
    //   137: iload #4
    //   139: iconst_2
    //   140: imul
    //   141: iconst_1
    //   142: isub
    //   143: i2f
    //   144: ldc 10.0
    //   146: fmul
    //   147: fconst_0
    //   148: fconst_1
    //   149: fconst_0
    //   150: invokestatic glRotatef : (FFFF)V
    //   153: aload_2
    //   154: invokevirtual Dne : ()V
    //   157: aload_2
    //   158: fload #10
    //   160: f2d
    //   161: fload #12
    //   163: f2d
    //   164: fload #14
    //   166: f2d
    //   167: fload #7
    //   169: f2d
    //   170: fload #9
    //   172: f2d
    //   173: invokevirtual Dne : (DDDDD)V
    //   176: aload_2
    //   177: fload #11
    //   179: f2d
    //   180: fload #12
    //   182: f2d
    //   183: fload #14
    //   185: f2d
    //   186: fload #6
    //   188: f2d
    //   189: fload #9
    //   191: f2d
    //   192: invokevirtual Dne : (DDDDD)V
    //   195: aload_2
    //   196: fload #11
    //   198: f2d
    //   199: fload #13
    //   201: f2d
    //   202: fload #14
    //   204: f2d
    //   205: fload #6
    //   207: f2d
    //   208: fload #8
    //   210: f2d
    //   211: invokevirtual Dne : (DDDDD)V
    //   214: aload_2
    //   215: fload #10
    //   217: f2d
    //   218: fload #13
    //   220: f2d
    //   221: fload #14
    //   223: f2d
    //   224: fload #7
    //   226: f2d
    //   227: fload #8
    //   229: f2d
    //   230: invokevirtual Dne : (DDDDD)V
    //   233: aload_2
    //   234: invokevirtual Dne : ()I
    //   237: pop
    //   238: invokestatic glPopMatrix : ()V
    //   241: iinc #4, 1
    //   244: goto -> 33
    //   247: fconst_1
    //   248: fconst_1
    //   249: fconst_1
    //   250: fconst_1
    //   251: invokestatic glColor4f : (FFFF)V
    //   254: sipush #3042
    //   257: invokestatic glDisable : (I)V
    //   260: return
  }
  
  public void Dne() {
    this.FWm = this.Dne;
    MJs mJs = this.Dne.Dne;
    NMq nMq = mJs.Dne.Dne();
    boolean bool = (this.Dne == ((MOS)mJs.Dne).Dne && nMq == this.Dne) ? true : false;
    if (this.Dne == null && nMq == null)
      bool = true; 
    if (nMq != null && this.Dne != null && nMq != this.Dne && nMq.bzF == ((NMq)this.Dne).bzF && nMq.Qnq() == this.Dne.Qnq()) {
      this.Dne = (Minecraft)nMq;
      bool = true;
    } 
    float f1 = 0.4F;
    float f2 = bool ? 1.0F : 0.0F;
    float f3 = f2 - this.Dne;
    if (f3 < -f1)
      f3 = -f1; 
    if (f3 > f1)
      f3 = f1; 
    this.Dne += f3;
    if (this.Dne < 0.1F) {
      this.Dne = (Minecraft)nMq;
      this.Dne = ((MOS)mJs.Dne).Dne;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XyI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */