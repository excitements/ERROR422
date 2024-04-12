import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class apb extends qVZ {
  private static final int IjH;
  
  protected double Qnq;
  
  private static final int DyG = qlg.Dne * 24 - 112;
  
  protected int aFZ;
  
  protected int Dne;
  
  protected double zGp;
  
  protected double bzF;
  
  protected double FWm;
  
  protected int Qnq = 202;
  
  private static final int div = qlg.FWm * 24 - 112;
  
  private int XHL = 0;
  
  private FkP Dne;
  
  protected int zGp = 0;
  
  protected double aFZ = false;
  
  protected double Dne = 'Ā';
  
  private static final int mrb;
  
  public apb(FkP paramFkP) {
    this.Dne = paramFkP;
    char c1 = '';
    char c2 = '';
    this.Dne = this.bzF = this.aFZ = (qlg.Dne.Dne * 24 - c1 / 2 - 12);
    this.Qnq = this.zGp = (qlg.Dne.FWm * 24 - c2 / 2);
    (this.zGp = (qlg.Dne.FWm * 24 - c2 / 2)).FWm = this;
  }
  
  public boolean Dne() {
    return true;
  }
  
  protected void zGp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : I
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: isub
    //   9: iconst_2
    //   10: idiv
    //   11: istore_1
    //   12: aload_0
    //   13: getfield bzF : I
    //   16: aload_0
    //   17: getfield Qnq : I
    //   20: isub
    //   21: iconst_2
    //   22: idiv
    //   23: istore_2
    //   24: aload_0
    //   25: getfield Dne : LmsA;
    //   28: ldc 'Achievements'
    //   30: iload_1
    //   31: bipush #15
    //   33: iadd
    //   34: iload_2
    //   35: iconst_5
    //   36: iadd
    //   37: ldc 4210752
    //   39: invokevirtual FWm : (Ljava/lang/String;III)I
    //   42: pop
    //   43: return
  }
  
  protected void FWm(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : D
    //   4: aload_0
    //   5: getfield bzF : D
    //   8: aload_0
    //   9: getfield Dne : D
    //   12: dsub
    //   13: fload_3
    //   14: f2d
    //   15: dmul
    //   16: dadd
    //   17: invokestatic FWm : (D)I
    //   20: istore #4
    //   22: aload_0
    //   23: getfield FWm : D
    //   26: aload_0
    //   27: getfield Qnq : D
    //   30: aload_0
    //   31: getfield FWm : D
    //   34: dsub
    //   35: fload_3
    //   36: f2d
    //   37: dmul
    //   38: dadd
    //   39: invokestatic FWm : (D)I
    //   42: istore #5
    //   44: iload #4
    //   46: getstatic apb.DyG : I
    //   49: if_icmpge -> 57
    //   52: getstatic apb.DyG : I
    //   55: istore #4
    //   57: iload #5
    //   59: getstatic apb.div : I
    //   62: if_icmpge -> 70
    //   65: getstatic apb.div : I
    //   68: istore #5
    //   70: iload #4
    //   72: getstatic apb.IjH : I
    //   75: if_icmplt -> 85
    //   78: getstatic apb.IjH : I
    //   81: iconst_1
    //   82: isub
    //   83: istore #4
    //   85: iload #5
    //   87: getstatic apb.mrb : I
    //   90: if_icmplt -> 100
    //   93: getstatic apb.mrb : I
    //   96: iconst_1
    //   97: isub
    //   98: istore #5
    //   100: aload_0
    //   101: getfield FWm : I
    //   104: aload_0
    //   105: getfield Dne : I
    //   108: isub
    //   109: iconst_2
    //   110: idiv
    //   111: istore #6
    //   113: aload_0
    //   114: getfield bzF : I
    //   117: aload_0
    //   118: getfield Qnq : I
    //   121: isub
    //   122: iconst_2
    //   123: idiv
    //   124: istore #7
    //   126: iload #6
    //   128: bipush #16
    //   130: iadd
    //   131: istore #8
    //   133: iload #7
    //   135: bipush #17
    //   137: iadd
    //   138: istore #9
    //   140: aload_0
    //   141: fconst_0
    //   142: putfield FWm : F
    //   145: sipush #518
    //   148: invokestatic glDepthFunc : (I)V
    //   151: invokestatic glPushMatrix : ()V
    //   154: fconst_0
    //   155: fconst_0
    //   156: ldc -200.0
    //   158: invokestatic glTranslatef : (FFF)V
    //   161: sipush #3553
    //   164: invokestatic glEnable : (I)V
    //   167: sipush #2896
    //   170: invokestatic glDisable : (I)V
    //   173: ldc 32826
    //   175: invokestatic glEnable : (I)V
    //   178: sipush #2903
    //   181: invokestatic glEnable : (I)V
    //   184: aload_0
    //   185: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   188: getfield Dne : LSnh;
    //   191: ldc '/terrain.png'
    //   193: invokevirtual Dne : (Ljava/lang/String;)V
    //   196: iload #4
    //   198: sipush #288
    //   201: iadd
    //   202: iconst_4
    //   203: ishr
    //   204: istore #10
    //   206: iload #5
    //   208: sipush #288
    //   211: iadd
    //   212: iconst_4
    //   213: ishr
    //   214: istore #11
    //   216: iload #4
    //   218: sipush #288
    //   221: iadd
    //   222: bipush #16
    //   224: irem
    //   225: istore #12
    //   227: iload #5
    //   229: sipush #288
    //   232: iadd
    //   233: bipush #16
    //   235: irem
    //   236: istore #13
    //   238: new java/util/Random
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: astore #14
    //   247: iconst_0
    //   248: istore #15
    //   250: iload #15
    //   252: bipush #16
    //   254: imul
    //   255: iload #13
    //   257: isub
    //   258: sipush #155
    //   261: if_icmpge -> 551
    //   264: ldc 0.6
    //   266: iload #11
    //   268: iload #15
    //   270: iadd
    //   271: i2f
    //   272: ldc 25.0
    //   274: fdiv
    //   275: ldc 0.3
    //   277: fmul
    //   278: fsub
    //   279: fstore #18
    //   281: fload #18
    //   283: fload #18
    //   285: fload #18
    //   287: fconst_1
    //   288: invokestatic glColor4f : (FFFF)V
    //   291: iconst_0
    //   292: istore #16
    //   294: iload #16
    //   296: bipush #16
    //   298: imul
    //   299: iload #12
    //   301: isub
    //   302: sipush #224
    //   305: if_icmpge -> 545
    //   308: aload #14
    //   310: sipush #1234
    //   313: iload #10
    //   315: iadd
    //   316: iload #16
    //   318: iadd
    //   319: i2l
    //   320: invokevirtual setSeed : (J)V
    //   323: aload #14
    //   325: invokevirtual nextInt : ()I
    //   328: pop
    //   329: aload #14
    //   331: iconst_1
    //   332: iload #11
    //   334: iadd
    //   335: iload #15
    //   337: iadd
    //   338: invokevirtual nextInt : (I)I
    //   341: iload #11
    //   343: iload #15
    //   345: iadd
    //   346: iconst_2
    //   347: idiv
    //   348: iadd
    //   349: istore #17
    //   351: getstatic zKP.IjH : LzKP;
    //   354: iconst_0
    //   355: iconst_0
    //   356: invokevirtual Dne : (II)LgDn;
    //   359: astore #19
    //   361: iload #17
    //   363: bipush #37
    //   365: if_icmpgt -> 497
    //   368: iload #11
    //   370: iload #15
    //   372: iadd
    //   373: bipush #35
    //   375: if_icmpeq -> 497
    //   378: iload #17
    //   380: bipush #22
    //   382: if_icmpne -> 420
    //   385: aload #14
    //   387: iconst_2
    //   388: invokevirtual nextInt : (I)I
    //   391: ifne -> 407
    //   394: getstatic zKP.ZgS : LzKP;
    //   397: iconst_0
    //   398: iconst_0
    //   399: invokevirtual Dne : (II)LgDn;
    //   402: astore #19
    //   404: goto -> 507
    //   407: getstatic zKP.JLG : LzKP;
    //   410: iconst_0
    //   411: iconst_0
    //   412: invokevirtual Dne : (II)LgDn;
    //   415: astore #19
    //   417: goto -> 507
    //   420: iload #17
    //   422: bipush #10
    //   424: if_icmpne -> 440
    //   427: getstatic zKP.Zpi : LzKP;
    //   430: iconst_0
    //   431: iconst_0
    //   432: invokevirtual Dne : (II)LgDn;
    //   435: astore #19
    //   437: goto -> 507
    //   440: iload #17
    //   442: bipush #8
    //   444: if_icmpne -> 460
    //   447: getstatic zKP.kGO : LzKP;
    //   450: iconst_0
    //   451: iconst_0
    //   452: invokevirtual Dne : (II)LgDn;
    //   455: astore #19
    //   457: goto -> 507
    //   460: iload #17
    //   462: iconst_4
    //   463: if_icmple -> 479
    //   466: getstatic zKP.Dne : LzKP;
    //   469: iconst_0
    //   470: iconst_0
    //   471: invokevirtual Dne : (II)LgDn;
    //   474: astore #19
    //   476: goto -> 507
    //   479: iload #17
    //   481: ifle -> 507
    //   484: getstatic zKP.FWm : LzKP;
    //   487: iconst_0
    //   488: iconst_0
    //   489: invokevirtual Dne : (II)LgDn;
    //   492: astore #19
    //   494: goto -> 507
    //   497: getstatic zKP.zGp : LzKP;
    //   500: iconst_0
    //   501: iconst_0
    //   502: invokevirtual Dne : (II)LgDn;
    //   505: astore #19
    //   507: aload_0
    //   508: iload #8
    //   510: iload #16
    //   512: bipush #16
    //   514: imul
    //   515: iadd
    //   516: iload #12
    //   518: isub
    //   519: iload #9
    //   521: iload #15
    //   523: bipush #16
    //   525: imul
    //   526: iadd
    //   527: iload #13
    //   529: isub
    //   530: aload #19
    //   532: bipush #16
    //   534: bipush #16
    //   536: invokevirtual Dne : (IILgDn;II)V
    //   539: iinc #16, 1
    //   542: goto -> 294
    //   545: iinc #15, 1
    //   548: goto -> 250
    //   551: sipush #2929
    //   554: invokestatic glEnable : (I)V
    //   557: sipush #515
    //   560: invokestatic glDepthFunc : (I)V
    //   563: sipush #3553
    //   566: invokestatic glDisable : (I)V
    //   569: iconst_0
    //   570: istore #15
    //   572: iload #15
    //   574: getstatic qlg.Dne : Ljava/util/List;
    //   577: invokeinterface size : ()I
    //   582: if_icmpge -> 814
    //   585: getstatic qlg.Dne : Ljava/util/List;
    //   588: iload #15
    //   590: invokeinterface get : (I)Ljava/lang/Object;
    //   595: checkcast Auk
    //   598: astore #21
    //   600: aload #21
    //   602: getfield Dne : LAuk;
    //   605: ifnull -> 808
    //   608: aload #21
    //   610: getfield Dne : I
    //   613: bipush #24
    //   615: imul
    //   616: iload #4
    //   618: isub
    //   619: bipush #11
    //   621: iadd
    //   622: iload #8
    //   624: iadd
    //   625: istore #16
    //   627: aload #21
    //   629: getfield FWm : I
    //   632: bipush #24
    //   634: imul
    //   635: iload #5
    //   637: isub
    //   638: bipush #11
    //   640: iadd
    //   641: iload #9
    //   643: iadd
    //   644: istore #17
    //   646: aload #21
    //   648: getfield Dne : LAuk;
    //   651: getfield Dne : I
    //   654: bipush #24
    //   656: imul
    //   657: iload #4
    //   659: isub
    //   660: bipush #11
    //   662: iadd
    //   663: iload #8
    //   665: iadd
    //   666: istore #20
    //   668: aload #21
    //   670: getfield Dne : LAuk;
    //   673: getfield FWm : I
    //   676: bipush #24
    //   678: imul
    //   679: iload #5
    //   681: isub
    //   682: bipush #11
    //   684: iadd
    //   685: iload #9
    //   687: iadd
    //   688: istore #18
    //   690: aload_0
    //   691: getfield Dne : LFkP;
    //   694: aload #21
    //   696: invokevirtual Dne : (LAuk;)Z
    //   699: istore #22
    //   701: aload_0
    //   702: getfield Dne : LFkP;
    //   705: aload #21
    //   707: invokevirtual FWm : (LAuk;)Z
    //   710: istore #23
    //   712: invokestatic Dne : ()J
    //   715: ldc2_w 600
    //   718: lrem
    //   719: l2d
    //   720: ldc2_w 600.0
    //   723: ddiv
    //   724: ldc2_w 3.141592653589793
    //   727: dmul
    //   728: ldc2_w 2.0
    //   731: dmul
    //   732: invokestatic sin : (D)D
    //   735: ldc2_w 0.6
    //   738: dcmpl
    //   739: ifle -> 748
    //   742: sipush #255
    //   745: goto -> 751
    //   748: sipush #130
    //   751: istore #19
    //   753: ldc -16777216
    //   755: istore #24
    //   757: iload #22
    //   759: ifeq -> 769
    //   762: ldc -9408400
    //   764: istore #24
    //   766: goto -> 784
    //   769: iload #23
    //   771: ifeq -> 784
    //   774: ldc 65280
    //   776: iload #19
    //   778: bipush #24
    //   780: ishl
    //   781: iadd
    //   782: istore #24
    //   784: aload_0
    //   785: iload #16
    //   787: iload #20
    //   789: iload #17
    //   791: iload #24
    //   793: invokevirtual Dne : (IIII)V
    //   796: aload_0
    //   797: iload #20
    //   799: iload #17
    //   801: iload #18
    //   803: iload #24
    //   805: invokevirtual FWm : (IIII)V
    //   808: iinc #15, 1
    //   811: goto -> 572
    //   814: aconst_null
    //   815: astore #21
    //   817: new eKj
    //   820: dup
    //   821: invokespecial <init> : ()V
    //   824: astore #22
    //   826: invokestatic bzF : ()V
    //   829: sipush #2896
    //   832: invokestatic glDisable : (I)V
    //   835: ldc 32826
    //   837: invokestatic glEnable : (I)V
    //   840: sipush #2903
    //   843: invokestatic glEnable : (I)V
    //   846: iconst_0
    //   847: istore #16
    //   849: iload #16
    //   851: getstatic qlg.Dne : Ljava/util/List;
    //   854: invokeinterface size : ()I
    //   859: if_icmpge -> 1296
    //   862: getstatic qlg.Dne : Ljava/util/List;
    //   865: iload #16
    //   867: invokeinterface get : (I)Ljava/lang/Object;
    //   872: checkcast Auk
    //   875: astore #25
    //   877: aload #25
    //   879: getfield Dne : I
    //   882: bipush #24
    //   884: imul
    //   885: iload #4
    //   887: isub
    //   888: istore #20
    //   890: aload #25
    //   892: getfield FWm : I
    //   895: bipush #24
    //   897: imul
    //   898: iload #5
    //   900: isub
    //   901: istore #18
    //   903: iload #20
    //   905: bipush #-24
    //   907: if_icmplt -> 1290
    //   910: iload #18
    //   912: bipush #-24
    //   914: if_icmplt -> 1290
    //   917: iload #20
    //   919: sipush #224
    //   922: if_icmpgt -> 1290
    //   925: iload #18
    //   927: sipush #155
    //   930: if_icmpgt -> 1290
    //   933: aload_0
    //   934: getfield Dne : LFkP;
    //   937: aload #25
    //   939: invokevirtual Dne : (LAuk;)Z
    //   942: ifeq -> 961
    //   945: fconst_1
    //   946: fstore #26
    //   948: fload #26
    //   950: fload #26
    //   952: fload #26
    //   954: fconst_1
    //   955: invokestatic glColor4f : (FFFF)V
    //   958: goto -> 1039
    //   961: aload_0
    //   962: getfield Dne : LFkP;
    //   965: aload #25
    //   967: invokevirtual FWm : (LAuk;)Z
    //   970: ifeq -> 1025
    //   973: invokestatic Dne : ()J
    //   976: ldc2_w 600
    //   979: lrem
    //   980: l2d
    //   981: ldc2_w 600.0
    //   984: ddiv
    //   985: ldc2_w 3.141592653589793
    //   988: dmul
    //   989: ldc2_w 2.0
    //   992: dmul
    //   993: invokestatic sin : (D)D
    //   996: ldc2_w 0.6
    //   999: dcmpg
    //   1000: ifge -> 1008
    //   1003: ldc 0.6
    //   1005: goto -> 1010
    //   1008: ldc 0.8
    //   1010: fstore #26
    //   1012: fload #26
    //   1014: fload #26
    //   1016: fload #26
    //   1018: fconst_1
    //   1019: invokestatic glColor4f : (FFFF)V
    //   1022: goto -> 1039
    //   1025: ldc 0.3
    //   1027: fstore #26
    //   1029: fload #26
    //   1031: fload #26
    //   1033: fload #26
    //   1035: fconst_1
    //   1036: invokestatic glColor4f : (FFFF)V
    //   1039: aload_0
    //   1040: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1043: getfield Dne : LSnh;
    //   1046: ldc '/achievement/bg.png'
    //   1048: invokevirtual Dne : (Ljava/lang/String;)V
    //   1051: iload #8
    //   1053: iload #20
    //   1055: iadd
    //   1056: istore #23
    //   1058: iload #9
    //   1060: iload #18
    //   1062: iadd
    //   1063: istore #24
    //   1065: aload #25
    //   1067: invokevirtual FWm : ()Z
    //   1070: ifeq -> 1097
    //   1073: aload_0
    //   1074: iload #23
    //   1076: iconst_2
    //   1077: isub
    //   1078: iload #24
    //   1080: iconst_2
    //   1081: isub
    //   1082: bipush #26
    //   1084: sipush #202
    //   1087: bipush #26
    //   1089: bipush #26
    //   1091: invokevirtual FWm : (IIIIII)V
    //   1094: goto -> 1117
    //   1097: aload_0
    //   1098: iload #23
    //   1100: iconst_2
    //   1101: isub
    //   1102: iload #24
    //   1104: iconst_2
    //   1105: isub
    //   1106: iconst_0
    //   1107: sipush #202
    //   1110: bipush #26
    //   1112: bipush #26
    //   1114: invokevirtual FWm : (IIIIII)V
    //   1117: aload_0
    //   1118: getfield Dne : LFkP;
    //   1121: aload #25
    //   1123: invokevirtual FWm : (LAuk;)Z
    //   1126: ifne -> 1149
    //   1129: ldc 0.1
    //   1131: fstore #27
    //   1133: fload #27
    //   1135: fload #27
    //   1137: fload #27
    //   1139: fconst_1
    //   1140: invokestatic glColor4f : (FFFF)V
    //   1143: aload #22
    //   1145: iconst_0
    //   1146: putfield Dne : Z
    //   1149: sipush #2896
    //   1152: invokestatic glEnable : (I)V
    //   1155: sipush #2884
    //   1158: invokestatic glEnable : (I)V
    //   1161: aload #22
    //   1163: aload_0
    //   1164: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1167: getfield Dne : LmsA;
    //   1170: aload_0
    //   1171: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1174: getfield Dne : LSnh;
    //   1177: aload #25
    //   1179: getfield Dne : LNMq;
    //   1182: iload #23
    //   1184: iconst_3
    //   1185: iadd
    //   1186: iload #24
    //   1188: iconst_3
    //   1189: iadd
    //   1190: invokevirtual FWm : (LmsA;LSnh;LNMq;II)V
    //   1193: sipush #2896
    //   1196: invokestatic glDisable : (I)V
    //   1199: aload_0
    //   1200: getfield Dne : LFkP;
    //   1203: aload #25
    //   1205: invokevirtual FWm : (LAuk;)Z
    //   1208: ifne -> 1217
    //   1211: aload #22
    //   1213: iconst_1
    //   1214: putfield Dne : Z
    //   1217: fconst_1
    //   1218: fconst_1
    //   1219: fconst_1
    //   1220: fconst_1
    //   1221: invokestatic glColor4f : (FFFF)V
    //   1224: iload_1
    //   1225: iload #8
    //   1227: if_icmplt -> 1290
    //   1230: iload_2
    //   1231: iload #9
    //   1233: if_icmplt -> 1290
    //   1236: iload_1
    //   1237: iload #8
    //   1239: sipush #224
    //   1242: iadd
    //   1243: if_icmpge -> 1290
    //   1246: iload_2
    //   1247: iload #9
    //   1249: sipush #155
    //   1252: iadd
    //   1253: if_icmpge -> 1290
    //   1256: iload_1
    //   1257: iload #23
    //   1259: if_icmplt -> 1290
    //   1262: iload_1
    //   1263: iload #23
    //   1265: bipush #22
    //   1267: iadd
    //   1268: if_icmpgt -> 1290
    //   1271: iload_2
    //   1272: iload #24
    //   1274: if_icmplt -> 1290
    //   1277: iload_2
    //   1278: iload #24
    //   1280: bipush #22
    //   1282: iadd
    //   1283: if_icmpgt -> 1290
    //   1286: aload #25
    //   1288: astore #21
    //   1290: iinc #16, 1
    //   1293: goto -> 849
    //   1296: sipush #2929
    //   1299: invokestatic glDisable : (I)V
    //   1302: sipush #3042
    //   1305: invokestatic glEnable : (I)V
    //   1308: fconst_1
    //   1309: fconst_1
    //   1310: fconst_1
    //   1311: fconst_1
    //   1312: invokestatic glColor4f : (FFFF)V
    //   1315: aload_0
    //   1316: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1319: getfield Dne : LSnh;
    //   1322: ldc '/achievement/bg.png'
    //   1324: invokevirtual Dne : (Ljava/lang/String;)V
    //   1327: aload_0
    //   1328: iload #6
    //   1330: iload #7
    //   1332: iconst_0
    //   1333: iconst_0
    //   1334: aload_0
    //   1335: getfield Dne : I
    //   1338: aload_0
    //   1339: getfield Qnq : I
    //   1342: invokevirtual FWm : (IIIIII)V
    //   1345: invokestatic glPopMatrix : ()V
    //   1348: aload_0
    //   1349: fconst_0
    //   1350: putfield FWm : F
    //   1353: sipush #515
    //   1356: invokestatic glDepthFunc : (I)V
    //   1359: sipush #2929
    //   1362: invokestatic glDisable : (I)V
    //   1365: sipush #3553
    //   1368: invokestatic glEnable : (I)V
    //   1371: aload_0
    //   1372: iload_1
    //   1373: iload_2
    //   1374: fload_3
    //   1375: invokespecial Dne : (IIF)V
    //   1378: aload #21
    //   1380: ifnull -> 1735
    //   1383: aload #21
    //   1385: invokevirtual FWm : ()Ljava/lang/String;
    //   1388: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   1391: astore #25
    //   1393: aload #21
    //   1395: invokevirtual Dne : ()Ljava/lang/String;
    //   1398: astore #26
    //   1400: iload_1
    //   1401: bipush #12
    //   1403: iadd
    //   1404: istore #20
    //   1406: iload_2
    //   1407: iconst_4
    //   1408: isub
    //   1409: istore #18
    //   1411: aload_0
    //   1412: getfield Dne : LFkP;
    //   1415: aload #21
    //   1417: invokevirtual FWm : (LAuk;)Z
    //   1420: ifeq -> 1564
    //   1423: aload_0
    //   1424: getfield Dne : LmsA;
    //   1427: aload #25
    //   1429: invokevirtual Dne : (Ljava/lang/String;)I
    //   1432: bipush #120
    //   1434: invokestatic max : (II)I
    //   1437: istore #23
    //   1439: aload_0
    //   1440: getfield Dne : LmsA;
    //   1443: aload #26
    //   1445: iload #23
    //   1447: invokevirtual Dne : (Ljava/lang/String;I)I
    //   1450: istore #24
    //   1452: aload_0
    //   1453: getfield Dne : LFkP;
    //   1456: aload #21
    //   1458: invokevirtual Dne : (LAuk;)Z
    //   1461: ifeq -> 1467
    //   1464: iinc #24, 12
    //   1467: aload_0
    //   1468: iload #20
    //   1470: iconst_3
    //   1471: isub
    //   1472: iload #18
    //   1474: iconst_3
    //   1475: isub
    //   1476: iload #20
    //   1478: iload #23
    //   1480: iadd
    //   1481: iconst_3
    //   1482: iadd
    //   1483: iload #18
    //   1485: iload #24
    //   1487: iadd
    //   1488: iconst_3
    //   1489: iadd
    //   1490: bipush #12
    //   1492: iadd
    //   1493: ldc_w -1073741824
    //   1496: ldc_w -1073741824
    //   1499: invokevirtual Dne : (IIIIII)V
    //   1502: aload_0
    //   1503: getfield Dne : LmsA;
    //   1506: aload #26
    //   1508: iload #20
    //   1510: iload #18
    //   1512: bipush #12
    //   1514: iadd
    //   1515: iload #23
    //   1517: ldc_w -6250336
    //   1520: invokevirtual Dne : (Ljava/lang/String;IIII)V
    //   1523: aload_0
    //   1524: getfield Dne : LFkP;
    //   1527: aload #21
    //   1529: invokevirtual Dne : (LAuk;)Z
    //   1532: ifeq -> 1675
    //   1535: aload_0
    //   1536: getfield Dne : LmsA;
    //   1539: ldc_w 'achievement.taken'
    //   1542: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   1545: iload #20
    //   1547: iload #18
    //   1549: iload #24
    //   1551: iadd
    //   1552: iconst_4
    //   1553: iadd
    //   1554: ldc_w -7302913
    //   1557: invokevirtual Dne : (Ljava/lang/String;III)I
    //   1560: pop
    //   1561: goto -> 1675
    //   1564: aload_0
    //   1565: getfield Dne : LmsA;
    //   1568: aload #25
    //   1570: invokevirtual Dne : (Ljava/lang/String;)I
    //   1573: bipush #120
    //   1575: invokestatic max : (II)I
    //   1578: istore #23
    //   1580: ldc_w 'achievement.requires'
    //   1583: iconst_1
    //   1584: anewarray java/lang/Object
    //   1587: dup
    //   1588: iconst_0
    //   1589: aload #21
    //   1591: getfield Dne : LAuk;
    //   1594: invokevirtual FWm : ()Ljava/lang/String;
    //   1597: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   1600: aastore
    //   1601: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1604: astore #27
    //   1606: aload_0
    //   1607: getfield Dne : LmsA;
    //   1610: aload #27
    //   1612: iload #23
    //   1614: invokevirtual Dne : (Ljava/lang/String;I)I
    //   1617: istore #19
    //   1619: aload_0
    //   1620: iload #20
    //   1622: iconst_3
    //   1623: isub
    //   1624: iload #18
    //   1626: iconst_3
    //   1627: isub
    //   1628: iload #20
    //   1630: iload #23
    //   1632: iadd
    //   1633: iconst_3
    //   1634: iadd
    //   1635: iload #18
    //   1637: iload #19
    //   1639: iadd
    //   1640: bipush #12
    //   1642: iadd
    //   1643: iconst_3
    //   1644: iadd
    //   1645: ldc_w -1073741824
    //   1648: ldc_w -1073741824
    //   1651: invokevirtual Dne : (IIIIII)V
    //   1654: aload_0
    //   1655: getfield Dne : LmsA;
    //   1658: aload #27
    //   1660: iload #20
    //   1662: iload #18
    //   1664: bipush #12
    //   1666: iadd
    //   1667: iload #23
    //   1669: ldc_w -9416624
    //   1672: invokevirtual Dne : (Ljava/lang/String;IIII)V
    //   1675: aload_0
    //   1676: getfield Dne : LmsA;
    //   1679: aload #25
    //   1681: iload #20
    //   1683: iload #18
    //   1685: aload_0
    //   1686: getfield Dne : LFkP;
    //   1689: aload #21
    //   1691: invokevirtual FWm : (LAuk;)Z
    //   1694: ifeq -> 1714
    //   1697: aload #21
    //   1699: invokevirtual FWm : ()Z
    //   1702: ifeq -> 1710
    //   1705: bipush #-128
    //   1707: goto -> 1731
    //   1710: iconst_m1
    //   1711: goto -> 1731
    //   1714: aload #21
    //   1716: invokevirtual FWm : ()Z
    //   1719: ifeq -> 1728
    //   1722: ldc_w -8355776
    //   1725: goto -> 1731
    //   1728: ldc_w -8355712
    //   1731: invokevirtual Dne : (Ljava/lang/String;III)I
    //   1734: pop
    //   1735: sipush #2929
    //   1738: invokestatic glEnable : (I)V
    //   1741: sipush #2896
    //   1744: invokestatic glEnable : (I)V
    //   1747: invokestatic Dne : ()V
    //   1750: return
  }
  
  public void bzF() {
    this.Dne = this.bzF;
    this.FWm = this.Qnq;
    double d1 = this.aFZ - this.bzF;
    double d2 = this.zGp - this.Qnq;
    if (d1 * d1 + d2 * d2 < 4.0D) {
      this.bzF += d1;
      this.Qnq += d2;
    } else {
      this.bzF += d1 * 0.85D;
      this.Qnq += d2 * 0.85D;
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    if (Mouse.isButtonDown(0)) {
      int i = (this.FWm - this.Dne) / 2;
      int j = (this.bzF - this.Qnq) / 2;
      int k = i + 8;
      int m = j + 17;
      if ((this.XHL == 0 || this.XHL == 1) && paramInt1 >= k && paramInt1 < k + 224 && paramInt2 >= m && paramInt2 < m + 155) {
        if (this.XHL == 0) {
          this.XHL = 1;
        } else {
          this.bzF -= (paramInt1 - this.aFZ);
          this.Qnq -= (paramInt2 - this.zGp);
          this.aFZ = this.Dne = this.bzF;
          this.FWm = this.Qnq;
          this.Qnq.zGp = this;
        } 
        this.aFZ = paramInt1;
        this.zGp = paramInt2;
      } 
      if (this.aFZ < DyG)
        this.aFZ = DyG; 
      if (this.zGp < div)
        this.zGp = div; 
      if (this.aFZ >= IjH)
        this.aFZ = (IjH - 1); 
      if (this.zGp >= mrb)
        this.zGp = (mrb - 1); 
    } else {
      this.XHL = 0;
    } 
    aFZ();
    FWm(paramInt1, paramInt2, paramFloat);
    GL11.glDisable(2896);
    GL11.glDisable(2929);
    zGp();
    GL11.glEnable(2896);
    GL11.glEnable(2929);
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 1) {
      this.Dne.Dne((qVZ)null);
      this.Dne.aFZ();
    } 
    super.Dne(paramPee);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface clear : ()V
    //   9: aload_0
    //   10: getfield Dne : Ljava/util/List;
    //   13: new Cpw
    //   16: dup
    //   17: iconst_1
    //   18: aload_0
    //   19: getfield FWm : I
    //   22: iconst_2
    //   23: idiv
    //   24: bipush #24
    //   26: iadd
    //   27: aload_0
    //   28: getfield bzF : I
    //   31: iconst_2
    //   32: idiv
    //   33: bipush #74
    //   35: iadd
    //   36: bipush #80
    //   38: bipush #20
    //   40: ldc_w 'gui.done'
    //   43: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   46: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   49: invokeinterface add : (Ljava/lang/Object;)Z
    //   54: pop
    //   55: return
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (paramInt == ((ulE)((fZI)this.Dne.Dne).zGp).Dne) {
      this.Dne.Dne((qVZ)null);
      this.Dne.aFZ();
    } else {
      super.Dne(paramChar, paramInt);
    } 
  }
  
  static {
    IjH = qlg.bzF * 24 - 77;
    mrb = qlg.Qnq * 24 - 77;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\apb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */