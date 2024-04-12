import net.minecraft.client.Minecraft;

public abstract class lSb {
  private float bzF;
  
  private float Dne;
  
  private boolean FWm;
  
  private int Zpi = -1;
  
  private float FWm;
  
  protected int aFZ;
  
  private int mrb;
  
  protected int Qnq;
  
  private int zGp;
  
  private final Minecraft Dne;
  
  private boolean Dne;
  
  private int DyG;
  
  protected int FWm;
  
  private int XHL;
  
  private long Dne;
  
  protected final int bzF;
  
  private int div;
  
  private int IjH;
  
  protected int Dne = -2.0F;
  
  private int kGO;
  
  public void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == this.mrb) {
        this.bzF -= (this.bzF * 2 / 3);
        this.Dne = -2.0F;
        FWm();
      } else if (paramPee.aFZ == this.XHL) {
        this.bzF += (this.bzF * 2 / 3);
        this.Dne = -2.0F;
        FWm();
      }  
  }
  
  protected abstract void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR);
  
  public int bzF() {
    return FWm() - this.FWm - this.Dne - 4;
  }
  
  protected abstract boolean FWm(int paramInt);
  
  protected abstract boolean Dne(int paramInt);
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.zGp = paramInt1;
    this.DyG = paramInt2;
    this.Dne = paramInt3;
    this.FWm = paramInt4;
    this.IjH = 0;
    this.div = paramInt1;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield Qnq : I
    //   5: aload_0
    //   6: iload_2
    //   7: putfield aFZ : I
    //   10: aload_0
    //   11: invokevirtual Dne : ()V
    //   14: aload_0
    //   15: invokevirtual Dne : ()I
    //   18: istore #4
    //   20: aload_0
    //   21: invokevirtual Qnq : ()I
    //   24: istore #5
    //   26: iload #5
    //   28: bipush #6
    //   30: iadd
    //   31: istore #6
    //   33: iconst_0
    //   34: invokestatic isButtonDown : (I)Z
    //   37: ifeq -> 456
    //   40: aload_0
    //   41: getfield Dne : F
    //   44: ldc -1.0
    //   46: fcmpl
    //   47: ifne -> 417
    //   50: iconst_1
    //   51: istore #12
    //   53: iload_2
    //   54: aload_0
    //   55: getfield Dne : I
    //   58: if_icmplt -> 408
    //   61: iload_2
    //   62: aload_0
    //   63: getfield FWm : I
    //   66: if_icmpgt -> 408
    //   69: aload_0
    //   70: getfield zGp : I
    //   73: iconst_2
    //   74: idiv
    //   75: bipush #110
    //   77: isub
    //   78: istore #13
    //   80: aload_0
    //   81: getfield zGp : I
    //   84: iconst_2
    //   85: idiv
    //   86: bipush #110
    //   88: iadd
    //   89: istore #7
    //   91: iload_2
    //   92: aload_0
    //   93: getfield Dne : I
    //   96: isub
    //   97: aload_0
    //   98: getfield kGO : I
    //   101: isub
    //   102: aload_0
    //   103: getfield bzF : F
    //   106: f2i
    //   107: iadd
    //   108: iconst_4
    //   109: isub
    //   110: istore #8
    //   112: iload #8
    //   114: aload_0
    //   115: getfield bzF : I
    //   118: idiv
    //   119: istore #9
    //   121: iload_1
    //   122: iload #13
    //   124: if_icmplt -> 205
    //   127: iload_1
    //   128: iload #7
    //   130: if_icmpgt -> 205
    //   133: iload #9
    //   135: iflt -> 205
    //   138: iload #8
    //   140: iflt -> 205
    //   143: iload #9
    //   145: iload #4
    //   147: if_icmpge -> 205
    //   150: iload #9
    //   152: aload_0
    //   153: getfield Zpi : I
    //   156: if_icmpne -> 178
    //   159: invokestatic Dne : ()J
    //   162: aload_0
    //   163: getfield Dne : J
    //   166: lsub
    //   167: ldc2_w 250
    //   170: lcmp
    //   171: ifge -> 178
    //   174: iconst_1
    //   175: goto -> 179
    //   178: iconst_0
    //   179: istore #14
    //   181: aload_0
    //   182: iload #9
    //   184: iload #14
    //   186: invokevirtual Dne : (IZ)V
    //   189: aload_0
    //   190: iload #9
    //   192: putfield Zpi : I
    //   195: aload_0
    //   196: invokestatic Dne : ()J
    //   199: putfield Dne : J
    //   202: goto -> 247
    //   205: iload_1
    //   206: iload #13
    //   208: if_icmplt -> 247
    //   211: iload_1
    //   212: iload #7
    //   214: if_icmpgt -> 247
    //   217: iload #8
    //   219: ifge -> 247
    //   222: aload_0
    //   223: iload_1
    //   224: iload #13
    //   226: isub
    //   227: iload_2
    //   228: aload_0
    //   229: getfield Dne : I
    //   232: isub
    //   233: aload_0
    //   234: getfield bzF : F
    //   237: f2i
    //   238: iadd
    //   239: iconst_4
    //   240: isub
    //   241: invokevirtual Dne : (II)V
    //   244: iconst_0
    //   245: istore #12
    //   247: iload_1
    //   248: iload #5
    //   250: if_icmplt -> 380
    //   253: iload_1
    //   254: iload #6
    //   256: if_icmpgt -> 380
    //   259: aload_0
    //   260: ldc -1.0
    //   262: putfield FWm : F
    //   265: aload_0
    //   266: invokevirtual bzF : ()I
    //   269: istore #11
    //   271: iload #11
    //   273: iconst_1
    //   274: if_icmpge -> 280
    //   277: iconst_1
    //   278: istore #11
    //   280: aload_0
    //   281: getfield FWm : I
    //   284: aload_0
    //   285: getfield Dne : I
    //   288: isub
    //   289: aload_0
    //   290: getfield FWm : I
    //   293: aload_0
    //   294: getfield Dne : I
    //   297: isub
    //   298: imul
    //   299: i2f
    //   300: aload_0
    //   301: invokevirtual FWm : ()I
    //   304: i2f
    //   305: fdiv
    //   306: f2i
    //   307: istore #10
    //   309: iload #10
    //   311: bipush #32
    //   313: if_icmpge -> 320
    //   316: bipush #32
    //   318: istore #10
    //   320: iload #10
    //   322: aload_0
    //   323: getfield FWm : I
    //   326: aload_0
    //   327: getfield Dne : I
    //   330: isub
    //   331: bipush #8
    //   333: isub
    //   334: if_icmple -> 351
    //   337: aload_0
    //   338: getfield FWm : I
    //   341: aload_0
    //   342: getfield Dne : I
    //   345: isub
    //   346: bipush #8
    //   348: isub
    //   349: istore #10
    //   351: aload_0
    //   352: dup
    //   353: getfield FWm : F
    //   356: aload_0
    //   357: getfield FWm : I
    //   360: aload_0
    //   361: getfield Dne : I
    //   364: isub
    //   365: iload #10
    //   367: isub
    //   368: i2f
    //   369: iload #11
    //   371: i2f
    //   372: fdiv
    //   373: fdiv
    //   374: putfield FWm : F
    //   377: goto -> 385
    //   380: aload_0
    //   381: fconst_1
    //   382: putfield FWm : F
    //   385: iload #12
    //   387: ifeq -> 399
    //   390: aload_0
    //   391: iload_2
    //   392: i2f
    //   393: putfield Dne : F
    //   396: goto -> 405
    //   399: aload_0
    //   400: ldc -2.0
    //   402: putfield Dne : F
    //   405: goto -> 414
    //   408: aload_0
    //   409: ldc -2.0
    //   411: putfield Dne : F
    //   414: goto -> 532
    //   417: aload_0
    //   418: getfield Dne : F
    //   421: fconst_0
    //   422: fcmpl
    //   423: iflt -> 532
    //   426: aload_0
    //   427: dup
    //   428: getfield bzF : F
    //   431: iload_2
    //   432: i2f
    //   433: aload_0
    //   434: getfield Dne : F
    //   437: fsub
    //   438: aload_0
    //   439: getfield FWm : F
    //   442: fmul
    //   443: fsub
    //   444: putfield bzF : F
    //   447: aload_0
    //   448: iload_2
    //   449: i2f
    //   450: putfield Dne : F
    //   453: goto -> 532
    //   456: aload_0
    //   457: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   460: getfield Dne : LfZI;
    //   463: getfield ATE : Z
    //   466: ifne -> 526
    //   469: invokestatic next : ()Z
    //   472: ifeq -> 526
    //   475: invokestatic getEventDWheel : ()I
    //   478: istore #12
    //   480: iload #12
    //   482: ifeq -> 523
    //   485: iload #12
    //   487: ifle -> 496
    //   490: iconst_m1
    //   491: istore #12
    //   493: goto -> 504
    //   496: iload #12
    //   498: ifge -> 504
    //   501: iconst_1
    //   502: istore #12
    //   504: aload_0
    //   505: dup
    //   506: getfield bzF : F
    //   509: iload #12
    //   511: aload_0
    //   512: getfield bzF : I
    //   515: imul
    //   516: iconst_2
    //   517: idiv
    //   518: i2f
    //   519: fadd
    //   520: putfield bzF : F
    //   523: goto -> 456
    //   526: aload_0
    //   527: ldc -1.0
    //   529: putfield Dne : F
    //   532: aload_0
    //   533: invokespecial FWm : ()V
    //   536: sipush #2896
    //   539: invokestatic glDisable : (I)V
    //   542: sipush #2912
    //   545: invokestatic glDisable : (I)V
    //   548: getstatic WAR.Dne : LWAR;
    //   551: astore #12
    //   553: aload_0
    //   554: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   557: getfield Dne : LSnh;
    //   560: ldc '/gui/background.png'
    //   562: invokevirtual Dne : (Ljava/lang/String;)V
    //   565: fconst_1
    //   566: fconst_1
    //   567: fconst_1
    //   568: fconst_1
    //   569: invokestatic glColor4f : (FFFF)V
    //   572: ldc 32.0
    //   574: fstore #13
    //   576: aload #12
    //   578: invokevirtual Dne : ()V
    //   581: aload #12
    //   583: ldc 2105376
    //   585: invokevirtual bzF : (I)V
    //   588: aload #12
    //   590: aload_0
    //   591: getfield IjH : I
    //   594: i2d
    //   595: aload_0
    //   596: getfield FWm : I
    //   599: i2d
    //   600: dconst_0
    //   601: aload_0
    //   602: getfield IjH : I
    //   605: i2f
    //   606: fload #13
    //   608: fdiv
    //   609: f2d
    //   610: aload_0
    //   611: getfield FWm : I
    //   614: aload_0
    //   615: getfield bzF : F
    //   618: f2i
    //   619: iadd
    //   620: i2f
    //   621: fload #13
    //   623: fdiv
    //   624: f2d
    //   625: invokevirtual Dne : (DDDDD)V
    //   628: aload #12
    //   630: aload_0
    //   631: getfield div : I
    //   634: i2d
    //   635: aload_0
    //   636: getfield FWm : I
    //   639: i2d
    //   640: dconst_0
    //   641: aload_0
    //   642: getfield div : I
    //   645: i2f
    //   646: fload #13
    //   648: fdiv
    //   649: f2d
    //   650: aload_0
    //   651: getfield FWm : I
    //   654: aload_0
    //   655: getfield bzF : F
    //   658: f2i
    //   659: iadd
    //   660: i2f
    //   661: fload #13
    //   663: fdiv
    //   664: f2d
    //   665: invokevirtual Dne : (DDDDD)V
    //   668: aload #12
    //   670: aload_0
    //   671: getfield div : I
    //   674: i2d
    //   675: aload_0
    //   676: getfield Dne : I
    //   679: i2d
    //   680: dconst_0
    //   681: aload_0
    //   682: getfield div : I
    //   685: i2f
    //   686: fload #13
    //   688: fdiv
    //   689: f2d
    //   690: aload_0
    //   691: getfield Dne : I
    //   694: aload_0
    //   695: getfield bzF : F
    //   698: f2i
    //   699: iadd
    //   700: i2f
    //   701: fload #13
    //   703: fdiv
    //   704: f2d
    //   705: invokevirtual Dne : (DDDDD)V
    //   708: aload #12
    //   710: aload_0
    //   711: getfield IjH : I
    //   714: i2d
    //   715: aload_0
    //   716: getfield Dne : I
    //   719: i2d
    //   720: dconst_0
    //   721: aload_0
    //   722: getfield IjH : I
    //   725: i2f
    //   726: fload #13
    //   728: fdiv
    //   729: f2d
    //   730: aload_0
    //   731: getfield Dne : I
    //   734: aload_0
    //   735: getfield bzF : F
    //   738: f2i
    //   739: iadd
    //   740: i2f
    //   741: fload #13
    //   743: fdiv
    //   744: f2d
    //   745: invokevirtual Dne : (DDDDD)V
    //   748: aload #12
    //   750: invokevirtual Dne : ()I
    //   753: pop
    //   754: aload_0
    //   755: getfield zGp : I
    //   758: iconst_2
    //   759: idiv
    //   760: bipush #92
    //   762: isub
    //   763: bipush #16
    //   765: isub
    //   766: istore #7
    //   768: aload_0
    //   769: getfield Dne : I
    //   772: iconst_4
    //   773: iadd
    //   774: aload_0
    //   775: getfield bzF : F
    //   778: f2i
    //   779: isub
    //   780: istore #8
    //   782: aload_0
    //   783: getfield FWm : Z
    //   786: ifeq -> 799
    //   789: aload_0
    //   790: iload #7
    //   792: iload #8
    //   794: aload #12
    //   796: invokevirtual Dne : (IILWAR;)V
    //   799: iconst_0
    //   800: istore #9
    //   802: iload #9
    //   804: iload #4
    //   806: if_icmpge -> 1248
    //   809: iload #8
    //   811: iload #9
    //   813: aload_0
    //   814: getfield bzF : I
    //   817: imul
    //   818: iadd
    //   819: aload_0
    //   820: getfield kGO : I
    //   823: iadd
    //   824: istore #11
    //   826: aload_0
    //   827: getfield bzF : I
    //   830: iconst_4
    //   831: isub
    //   832: istore #10
    //   834: iload #11
    //   836: aload_0
    //   837: getfield FWm : I
    //   840: if_icmpgt -> 1242
    //   843: iload #11
    //   845: iload #10
    //   847: iadd
    //   848: aload_0
    //   849: getfield Dne : I
    //   852: if_icmplt -> 1242
    //   855: aload_0
    //   856: getfield Dne : Z
    //   859: ifeq -> 999
    //   862: aload_0
    //   863: iload #9
    //   865: invokevirtual FWm : (I)Z
    //   868: ifeq -> 999
    //   871: aload_0
    //   872: getfield zGp : I
    //   875: iconst_2
    //   876: idiv
    //   877: bipush #110
    //   879: isub
    //   880: istore #14
    //   882: aload_0
    //   883: getfield zGp : I
    //   886: iconst_2
    //   887: idiv
    //   888: bipush #110
    //   890: iadd
    //   891: istore #15
    //   893: fconst_1
    //   894: fconst_1
    //   895: fconst_1
    //   896: fconst_1
    //   897: invokestatic glColor4f : (FFFF)V
    //   900: sipush #3553
    //   903: invokestatic glDisable : (I)V
    //   906: aload #12
    //   908: invokevirtual Dne : ()V
    //   911: aload #12
    //   913: iconst_0
    //   914: invokevirtual bzF : (I)V
    //   917: aload #12
    //   919: iload #14
    //   921: i2d
    //   922: iload #11
    //   924: iload #10
    //   926: iadd
    //   927: iconst_2
    //   928: iadd
    //   929: i2d
    //   930: dconst_0
    //   931: dconst_0
    //   932: dconst_1
    //   933: invokevirtual Dne : (DDDDD)V
    //   936: aload #12
    //   938: iload #15
    //   940: i2d
    //   941: iload #11
    //   943: iload #10
    //   945: iadd
    //   946: iconst_2
    //   947: iadd
    //   948: i2d
    //   949: dconst_0
    //   950: dconst_1
    //   951: dconst_1
    //   952: invokevirtual Dne : (DDDDD)V
    //   955: aload #12
    //   957: iload #15
    //   959: i2d
    //   960: iload #11
    //   962: iconst_2
    //   963: isub
    //   964: i2d
    //   965: dconst_0
    //   966: dconst_1
    //   967: dconst_0
    //   968: invokevirtual Dne : (DDDDD)V
    //   971: aload #12
    //   973: iload #14
    //   975: i2d
    //   976: iload #11
    //   978: iconst_2
    //   979: isub
    //   980: i2d
    //   981: dconst_0
    //   982: dconst_0
    //   983: dconst_0
    //   984: invokevirtual Dne : (DDDDD)V
    //   987: aload #12
    //   989: invokevirtual Dne : ()I
    //   992: pop
    //   993: sipush #3553
    //   996: invokestatic glEnable : (I)V
    //   999: aload_0
    //   1000: getfield Dne : Z
    //   1003: ifeq -> 1228
    //   1006: aload_0
    //   1007: iload #9
    //   1009: invokevirtual Dne : (I)Z
    //   1012: ifeq -> 1228
    //   1015: aload_0
    //   1016: getfield zGp : I
    //   1019: iconst_2
    //   1020: idiv
    //   1021: bipush #110
    //   1023: isub
    //   1024: istore #14
    //   1026: aload_0
    //   1027: getfield zGp : I
    //   1030: iconst_2
    //   1031: idiv
    //   1032: bipush #110
    //   1034: iadd
    //   1035: istore #15
    //   1037: fconst_1
    //   1038: fconst_1
    //   1039: fconst_1
    //   1040: fconst_1
    //   1041: invokestatic glColor4f : (FFFF)V
    //   1044: sipush #3553
    //   1047: invokestatic glDisable : (I)V
    //   1050: aload #12
    //   1052: invokevirtual Dne : ()V
    //   1055: aload #12
    //   1057: ldc 8421504
    //   1059: invokevirtual bzF : (I)V
    //   1062: aload #12
    //   1064: iload #14
    //   1066: i2d
    //   1067: iload #11
    //   1069: iload #10
    //   1071: iadd
    //   1072: iconst_2
    //   1073: iadd
    //   1074: i2d
    //   1075: dconst_0
    //   1076: dconst_0
    //   1077: dconst_1
    //   1078: invokevirtual Dne : (DDDDD)V
    //   1081: aload #12
    //   1083: iload #15
    //   1085: i2d
    //   1086: iload #11
    //   1088: iload #10
    //   1090: iadd
    //   1091: iconst_2
    //   1092: iadd
    //   1093: i2d
    //   1094: dconst_0
    //   1095: dconst_1
    //   1096: dconst_1
    //   1097: invokevirtual Dne : (DDDDD)V
    //   1100: aload #12
    //   1102: iload #15
    //   1104: i2d
    //   1105: iload #11
    //   1107: iconst_2
    //   1108: isub
    //   1109: i2d
    //   1110: dconst_0
    //   1111: dconst_1
    //   1112: dconst_0
    //   1113: invokevirtual Dne : (DDDDD)V
    //   1116: aload #12
    //   1118: iload #14
    //   1120: i2d
    //   1121: iload #11
    //   1123: iconst_2
    //   1124: isub
    //   1125: i2d
    //   1126: dconst_0
    //   1127: dconst_0
    //   1128: dconst_0
    //   1129: invokevirtual Dne : (DDDDD)V
    //   1132: aload #12
    //   1134: iconst_0
    //   1135: invokevirtual bzF : (I)V
    //   1138: aload #12
    //   1140: iload #14
    //   1142: iconst_1
    //   1143: iadd
    //   1144: i2d
    //   1145: iload #11
    //   1147: iload #10
    //   1149: iadd
    //   1150: iconst_1
    //   1151: iadd
    //   1152: i2d
    //   1153: dconst_0
    //   1154: dconst_0
    //   1155: dconst_1
    //   1156: invokevirtual Dne : (DDDDD)V
    //   1159: aload #12
    //   1161: iload #15
    //   1163: iconst_1
    //   1164: isub
    //   1165: i2d
    //   1166: iload #11
    //   1168: iload #10
    //   1170: iadd
    //   1171: iconst_1
    //   1172: iadd
    //   1173: i2d
    //   1174: dconst_0
    //   1175: dconst_1
    //   1176: dconst_1
    //   1177: invokevirtual Dne : (DDDDD)V
    //   1180: aload #12
    //   1182: iload #15
    //   1184: iconst_1
    //   1185: isub
    //   1186: i2d
    //   1187: iload #11
    //   1189: iconst_1
    //   1190: isub
    //   1191: i2d
    //   1192: dconst_0
    //   1193: dconst_1
    //   1194: dconst_0
    //   1195: invokevirtual Dne : (DDDDD)V
    //   1198: aload #12
    //   1200: iload #14
    //   1202: iconst_1
    //   1203: iadd
    //   1204: i2d
    //   1205: iload #11
    //   1207: iconst_1
    //   1208: isub
    //   1209: i2d
    //   1210: dconst_0
    //   1211: dconst_0
    //   1212: dconst_0
    //   1213: invokevirtual Dne : (DDDDD)V
    //   1216: aload #12
    //   1218: invokevirtual Dne : ()I
    //   1221: pop
    //   1222: sipush #3553
    //   1225: invokestatic glEnable : (I)V
    //   1228: aload_0
    //   1229: iload #9
    //   1231: iload #7
    //   1233: iload #11
    //   1235: iload #10
    //   1237: aload #12
    //   1239: invokevirtual Dne : (IIIILWAR;)V
    //   1242: iinc #9, 1
    //   1245: goto -> 802
    //   1248: sipush #2929
    //   1251: invokestatic glDisable : (I)V
    //   1254: iconst_4
    //   1255: istore #15
    //   1257: aload_0
    //   1258: iconst_0
    //   1259: aload_0
    //   1260: getfield Dne : I
    //   1263: sipush #255
    //   1266: sipush #255
    //   1269: invokespecial FWm : (IIII)V
    //   1272: aload_0
    //   1273: aload_0
    //   1274: getfield FWm : I
    //   1277: aload_0
    //   1278: getfield DyG : I
    //   1281: sipush #255
    //   1284: sipush #255
    //   1287: invokespecial FWm : (IIII)V
    //   1290: sipush #3042
    //   1293: invokestatic glEnable : (I)V
    //   1296: sipush #770
    //   1299: sipush #771
    //   1302: invokestatic glBlendFunc : (II)V
    //   1305: sipush #3008
    //   1308: invokestatic glDisable : (I)V
    //   1311: sipush #7425
    //   1314: invokestatic glShadeModel : (I)V
    //   1317: sipush #3553
    //   1320: invokestatic glDisable : (I)V
    //   1323: aload #12
    //   1325: invokevirtual Dne : ()V
    //   1328: aload #12
    //   1330: iconst_0
    //   1331: iconst_0
    //   1332: invokevirtual Dne : (II)V
    //   1335: aload #12
    //   1337: aload_0
    //   1338: getfield IjH : I
    //   1341: i2d
    //   1342: aload_0
    //   1343: getfield Dne : I
    //   1346: iload #15
    //   1348: iadd
    //   1349: i2d
    //   1350: dconst_0
    //   1351: dconst_0
    //   1352: dconst_1
    //   1353: invokevirtual Dne : (DDDDD)V
    //   1356: aload #12
    //   1358: aload_0
    //   1359: getfield div : I
    //   1362: i2d
    //   1363: aload_0
    //   1364: getfield Dne : I
    //   1367: iload #15
    //   1369: iadd
    //   1370: i2d
    //   1371: dconst_0
    //   1372: dconst_1
    //   1373: dconst_1
    //   1374: invokevirtual Dne : (DDDDD)V
    //   1377: aload #12
    //   1379: iconst_0
    //   1380: sipush #255
    //   1383: invokevirtual Dne : (II)V
    //   1386: aload #12
    //   1388: aload_0
    //   1389: getfield div : I
    //   1392: i2d
    //   1393: aload_0
    //   1394: getfield Dne : I
    //   1397: i2d
    //   1398: dconst_0
    //   1399: dconst_1
    //   1400: dconst_0
    //   1401: invokevirtual Dne : (DDDDD)V
    //   1404: aload #12
    //   1406: aload_0
    //   1407: getfield IjH : I
    //   1410: i2d
    //   1411: aload_0
    //   1412: getfield Dne : I
    //   1415: i2d
    //   1416: dconst_0
    //   1417: dconst_0
    //   1418: dconst_0
    //   1419: invokevirtual Dne : (DDDDD)V
    //   1422: aload #12
    //   1424: invokevirtual Dne : ()I
    //   1427: pop
    //   1428: aload #12
    //   1430: invokevirtual Dne : ()V
    //   1433: aload #12
    //   1435: iconst_0
    //   1436: sipush #255
    //   1439: invokevirtual Dne : (II)V
    //   1442: aload #12
    //   1444: aload_0
    //   1445: getfield IjH : I
    //   1448: i2d
    //   1449: aload_0
    //   1450: getfield FWm : I
    //   1453: i2d
    //   1454: dconst_0
    //   1455: dconst_0
    //   1456: dconst_1
    //   1457: invokevirtual Dne : (DDDDD)V
    //   1460: aload #12
    //   1462: aload_0
    //   1463: getfield div : I
    //   1466: i2d
    //   1467: aload_0
    //   1468: getfield FWm : I
    //   1471: i2d
    //   1472: dconst_0
    //   1473: dconst_1
    //   1474: dconst_1
    //   1475: invokevirtual Dne : (DDDDD)V
    //   1478: aload #12
    //   1480: iconst_0
    //   1481: iconst_0
    //   1482: invokevirtual Dne : (II)V
    //   1485: aload #12
    //   1487: aload_0
    //   1488: getfield div : I
    //   1491: i2d
    //   1492: aload_0
    //   1493: getfield FWm : I
    //   1496: iload #15
    //   1498: isub
    //   1499: i2d
    //   1500: dconst_0
    //   1501: dconst_1
    //   1502: dconst_0
    //   1503: invokevirtual Dne : (DDDDD)V
    //   1506: aload #12
    //   1508: aload_0
    //   1509: getfield IjH : I
    //   1512: i2d
    //   1513: aload_0
    //   1514: getfield FWm : I
    //   1517: iload #15
    //   1519: isub
    //   1520: i2d
    //   1521: dconst_0
    //   1522: dconst_0
    //   1523: dconst_0
    //   1524: invokevirtual Dne : (DDDDD)V
    //   1527: aload #12
    //   1529: invokevirtual Dne : ()I
    //   1532: pop
    //   1533: aload_0
    //   1534: invokevirtual bzF : ()I
    //   1537: istore #11
    //   1539: iload #11
    //   1541: ifle -> 1913
    //   1544: aload_0
    //   1545: getfield FWm : I
    //   1548: aload_0
    //   1549: getfield Dne : I
    //   1552: isub
    //   1553: aload_0
    //   1554: getfield FWm : I
    //   1557: aload_0
    //   1558: getfield Dne : I
    //   1561: isub
    //   1562: imul
    //   1563: aload_0
    //   1564: invokevirtual FWm : ()I
    //   1567: idiv
    //   1568: istore #10
    //   1570: iload #10
    //   1572: bipush #32
    //   1574: if_icmpge -> 1581
    //   1577: bipush #32
    //   1579: istore #10
    //   1581: iload #10
    //   1583: aload_0
    //   1584: getfield FWm : I
    //   1587: aload_0
    //   1588: getfield Dne : I
    //   1591: isub
    //   1592: bipush #8
    //   1594: isub
    //   1595: if_icmple -> 1612
    //   1598: aload_0
    //   1599: getfield FWm : I
    //   1602: aload_0
    //   1603: getfield Dne : I
    //   1606: isub
    //   1607: bipush #8
    //   1609: isub
    //   1610: istore #10
    //   1612: aload_0
    //   1613: getfield bzF : F
    //   1616: f2i
    //   1617: aload_0
    //   1618: getfield FWm : I
    //   1621: aload_0
    //   1622: getfield Dne : I
    //   1625: isub
    //   1626: iload #10
    //   1628: isub
    //   1629: imul
    //   1630: iload #11
    //   1632: idiv
    //   1633: aload_0
    //   1634: getfield Dne : I
    //   1637: iadd
    //   1638: istore #14
    //   1640: iload #14
    //   1642: aload_0
    //   1643: getfield Dne : I
    //   1646: if_icmpge -> 1655
    //   1649: aload_0
    //   1650: getfield Dne : I
    //   1653: istore #14
    //   1655: aload #12
    //   1657: invokevirtual Dne : ()V
    //   1660: aload #12
    //   1662: iconst_0
    //   1663: sipush #255
    //   1666: invokevirtual Dne : (II)V
    //   1669: aload #12
    //   1671: iload #5
    //   1673: i2d
    //   1674: aload_0
    //   1675: getfield FWm : I
    //   1678: i2d
    //   1679: dconst_0
    //   1680: dconst_0
    //   1681: dconst_1
    //   1682: invokevirtual Dne : (DDDDD)V
    //   1685: aload #12
    //   1687: iload #6
    //   1689: i2d
    //   1690: aload_0
    //   1691: getfield FWm : I
    //   1694: i2d
    //   1695: dconst_0
    //   1696: dconst_1
    //   1697: dconst_1
    //   1698: invokevirtual Dne : (DDDDD)V
    //   1701: aload #12
    //   1703: iload #6
    //   1705: i2d
    //   1706: aload_0
    //   1707: getfield Dne : I
    //   1710: i2d
    //   1711: dconst_0
    //   1712: dconst_1
    //   1713: dconst_0
    //   1714: invokevirtual Dne : (DDDDD)V
    //   1717: aload #12
    //   1719: iload #5
    //   1721: i2d
    //   1722: aload_0
    //   1723: getfield Dne : I
    //   1726: i2d
    //   1727: dconst_0
    //   1728: dconst_0
    //   1729: dconst_0
    //   1730: invokevirtual Dne : (DDDDD)V
    //   1733: aload #12
    //   1735: invokevirtual Dne : ()I
    //   1738: pop
    //   1739: aload #12
    //   1741: invokevirtual Dne : ()V
    //   1744: aload #12
    //   1746: ldc 8421504
    //   1748: sipush #255
    //   1751: invokevirtual Dne : (II)V
    //   1754: aload #12
    //   1756: iload #5
    //   1758: i2d
    //   1759: iload #14
    //   1761: iload #10
    //   1763: iadd
    //   1764: i2d
    //   1765: dconst_0
    //   1766: dconst_0
    //   1767: dconst_1
    //   1768: invokevirtual Dne : (DDDDD)V
    //   1771: aload #12
    //   1773: iload #6
    //   1775: i2d
    //   1776: iload #14
    //   1778: iload #10
    //   1780: iadd
    //   1781: i2d
    //   1782: dconst_0
    //   1783: dconst_1
    //   1784: dconst_1
    //   1785: invokevirtual Dne : (DDDDD)V
    //   1788: aload #12
    //   1790: iload #6
    //   1792: i2d
    //   1793: iload #14
    //   1795: i2d
    //   1796: dconst_0
    //   1797: dconst_1
    //   1798: dconst_0
    //   1799: invokevirtual Dne : (DDDDD)V
    //   1802: aload #12
    //   1804: iload #5
    //   1806: i2d
    //   1807: iload #14
    //   1809: i2d
    //   1810: dconst_0
    //   1811: dconst_0
    //   1812: dconst_0
    //   1813: invokevirtual Dne : (DDDDD)V
    //   1816: aload #12
    //   1818: invokevirtual Dne : ()I
    //   1821: pop
    //   1822: aload #12
    //   1824: invokevirtual Dne : ()V
    //   1827: aload #12
    //   1829: ldc 12632256
    //   1831: sipush #255
    //   1834: invokevirtual Dne : (II)V
    //   1837: aload #12
    //   1839: iload #5
    //   1841: i2d
    //   1842: iload #14
    //   1844: iload #10
    //   1846: iadd
    //   1847: iconst_1
    //   1848: isub
    //   1849: i2d
    //   1850: dconst_0
    //   1851: dconst_0
    //   1852: dconst_1
    //   1853: invokevirtual Dne : (DDDDD)V
    //   1856: aload #12
    //   1858: iload #6
    //   1860: iconst_1
    //   1861: isub
    //   1862: i2d
    //   1863: iload #14
    //   1865: iload #10
    //   1867: iadd
    //   1868: iconst_1
    //   1869: isub
    //   1870: i2d
    //   1871: dconst_0
    //   1872: dconst_1
    //   1873: dconst_1
    //   1874: invokevirtual Dne : (DDDDD)V
    //   1877: aload #12
    //   1879: iload #6
    //   1881: iconst_1
    //   1882: isub
    //   1883: i2d
    //   1884: iload #14
    //   1886: i2d
    //   1887: dconst_0
    //   1888: dconst_1
    //   1889: dconst_0
    //   1890: invokevirtual Dne : (DDDDD)V
    //   1893: aload #12
    //   1895: iload #5
    //   1897: i2d
    //   1898: iload #14
    //   1900: i2d
    //   1901: dconst_0
    //   1902: dconst_0
    //   1903: dconst_0
    //   1904: invokevirtual Dne : (DDDDD)V
    //   1907: aload #12
    //   1909: invokevirtual Dne : ()I
    //   1912: pop
    //   1913: aload_0
    //   1914: iload_1
    //   1915: iload_2
    //   1916: invokevirtual FWm : (II)V
    //   1919: sipush #3553
    //   1922: invokestatic glEnable : (I)V
    //   1925: sipush #7424
    //   1928: invokestatic glShadeModel : (I)V
    //   1931: sipush #3008
    //   1934: invokestatic glEnable : (I)V
    //   1937: sipush #3042
    //   1940: invokestatic glDisable : (I)V
    //   1943: return
  }
  
  protected void Dne(int paramInt1, int paramInt2) {}
  
  protected abstract void Dne();
  
  public lSb(Minecraft paramMinecraft, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.Dne = 0L;
    this.Dne = 1;
    this.Dne = paramMinecraft;
    this.zGp = paramInt1;
    this.DyG = paramInt2;
    this.Dne = paramInt3;
    this.FWm = paramInt4;
    this.bzF = paramInt5;
    this.IjH = 0;
    this.div = paramInt1;
  }
  
  protected void FWm(int paramInt1, int paramInt2) {}
  
  protected abstract int Dne();
  
  private void FWm() {
    int i = bzF();
    if (i < 0)
      i /= 2; 
    if (this.bzF < 0.0F)
      this.bzF = 0.0F; 
    if (this.bzF > i)
      this.bzF = i; 
  }
  
  protected void Dne(int paramInt1, int paramInt2, WAR paramWAR) {}
  
  protected int FWm() {
    return Dne() * this.bzF + this.kGO;
  }
  
  protected int Qnq() {
    return this.zGp / 2 + 124;
  }
  
  protected abstract void Dne(int paramInt, boolean paramBoolean);
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   9: getfield Dne : LSnh;
    //   12: ldc '/gui/background.png'
    //   14: invokevirtual Dne : (Ljava/lang/String;)V
    //   17: fconst_1
    //   18: fconst_1
    //   19: fconst_1
    //   20: fconst_1
    //   21: invokestatic glColor4f : (FFFF)V
    //   24: ldc 32.0
    //   26: fstore #6
    //   28: aload #5
    //   30: invokevirtual Dne : ()V
    //   33: aload #5
    //   35: ldc 4210752
    //   37: iload #4
    //   39: invokevirtual Dne : (II)V
    //   42: aload #5
    //   44: dconst_0
    //   45: iload_2
    //   46: i2d
    //   47: dconst_0
    //   48: dconst_0
    //   49: iload_2
    //   50: i2f
    //   51: fload #6
    //   53: fdiv
    //   54: f2d
    //   55: invokevirtual Dne : (DDDDD)V
    //   58: aload #5
    //   60: aload_0
    //   61: getfield zGp : I
    //   64: i2d
    //   65: iload_2
    //   66: i2d
    //   67: dconst_0
    //   68: aload_0
    //   69: getfield zGp : I
    //   72: i2f
    //   73: fload #6
    //   75: fdiv
    //   76: f2d
    //   77: iload_2
    //   78: i2f
    //   79: fload #6
    //   81: fdiv
    //   82: f2d
    //   83: invokevirtual Dne : (DDDDD)V
    //   86: aload #5
    //   88: ldc 4210752
    //   90: iload_3
    //   91: invokevirtual Dne : (II)V
    //   94: aload #5
    //   96: aload_0
    //   97: getfield zGp : I
    //   100: i2d
    //   101: iload_1
    //   102: i2d
    //   103: dconst_0
    //   104: aload_0
    //   105: getfield zGp : I
    //   108: i2f
    //   109: fload #6
    //   111: fdiv
    //   112: f2d
    //   113: iload_1
    //   114: i2f
    //   115: fload #6
    //   117: fdiv
    //   118: f2d
    //   119: invokevirtual Dne : (DDDDD)V
    //   122: aload #5
    //   124: dconst_0
    //   125: iload_1
    //   126: i2d
    //   127: dconst_0
    //   128: dconst_0
    //   129: iload_1
    //   130: i2f
    //   131: fload #6
    //   133: fdiv
    //   134: f2d
    //   135: invokevirtual Dne : (DDDDD)V
    //   138: aload #5
    //   140: invokevirtual Dne : ()I
    //   143: pop
    //   144: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lSb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */