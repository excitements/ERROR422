import net.minecraft.client.Minecraft;

public abstract class BJs {
  private float Dne;
  
  private long Dne;
  
  private final int aFZ;
  
  private final int Qnq;
  
  private final int DyG;
  
  protected final int Dne;
  
  private final int zGp;
  
  private float bzF;
  
  protected int bzF;
  
  private float FWm;
  
  protected int FWm;
  
  private final Minecraft Dne = -2.0F;
  
  private int div = -1;
  
  protected abstract boolean Dne(int paramInt);
  
  public BJs(Minecraft paramMinecraft, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.Dne = 0L;
    this.Dne = paramMinecraft;
    this.aFZ = paramInt2;
    this.DyG = paramInt2 + paramInt4;
    this.Dne = paramInt5;
    this.Qnq = paramInt1;
    this.zGp = paramInt1 + paramInt3;
  }
  
  protected int Qnq() {
    return this.zGp - 8;
  }
  
  protected abstract void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR);
  
  public int bzF() {
    return FWm() - this.DyG - this.aFZ - 4;
  }
  
  private void FWm() {
    int i = bzF();
    if (i < 0)
      i = 0; 
    if (this.bzF < 0.0F)
      this.bzF = 0.0F; 
    if (this.bzF > i)
      this.bzF = i; 
  }
  
  protected abstract int Dne();
  
  protected abstract void Dne(int paramInt, boolean paramBoolean);
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield FWm : I
    //   5: aload_0
    //   6: iload_2
    //   7: putfield bzF : I
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
    //   37: ifeq -> 423
    //   40: aload_0
    //   41: getfield Dne : F
    //   44: ldc -1.0
    //   46: fcmpl
    //   47: ifne -> 384
    //   50: iconst_1
    //   51: istore #12
    //   53: iload_2
    //   54: aload_0
    //   55: getfield aFZ : I
    //   58: if_icmplt -> 375
    //   61: iload_2
    //   62: aload_0
    //   63: getfield DyG : I
    //   66: if_icmpgt -> 375
    //   69: aload_0
    //   70: getfield Qnq : I
    //   73: iconst_2
    //   74: iadd
    //   75: istore #13
    //   77: aload_0
    //   78: getfield zGp : I
    //   81: iconst_2
    //   82: isub
    //   83: istore #7
    //   85: iload_2
    //   86: aload_0
    //   87: getfield aFZ : I
    //   90: isub
    //   91: aload_0
    //   92: getfield bzF : F
    //   95: f2i
    //   96: iadd
    //   97: iconst_4
    //   98: isub
    //   99: istore #8
    //   101: iload #8
    //   103: aload_0
    //   104: getfield Dne : I
    //   107: idiv
    //   108: istore #9
    //   110: iload_1
    //   111: iload #13
    //   113: if_icmplt -> 194
    //   116: iload_1
    //   117: iload #7
    //   119: if_icmpgt -> 194
    //   122: iload #9
    //   124: iflt -> 194
    //   127: iload #8
    //   129: iflt -> 194
    //   132: iload #9
    //   134: iload #4
    //   136: if_icmpge -> 194
    //   139: iload #9
    //   141: aload_0
    //   142: getfield div : I
    //   145: if_icmpne -> 167
    //   148: invokestatic Dne : ()J
    //   151: aload_0
    //   152: getfield Dne : J
    //   155: lsub
    //   156: ldc2_w 250
    //   159: lcmp
    //   160: ifge -> 167
    //   163: iconst_1
    //   164: goto -> 168
    //   167: iconst_0
    //   168: istore #14
    //   170: aload_0
    //   171: iload #9
    //   173: iload #14
    //   175: invokevirtual Dne : (IZ)V
    //   178: aload_0
    //   179: iload #9
    //   181: putfield div : I
    //   184: aload_0
    //   185: invokestatic Dne : ()J
    //   188: putfield Dne : J
    //   191: goto -> 214
    //   194: iload_1
    //   195: iload #13
    //   197: if_icmplt -> 214
    //   200: iload_1
    //   201: iload #7
    //   203: if_icmpgt -> 214
    //   206: iload #8
    //   208: ifge -> 214
    //   211: iconst_0
    //   212: istore #12
    //   214: iload_1
    //   215: iload #5
    //   217: if_icmplt -> 347
    //   220: iload_1
    //   221: iload #6
    //   223: if_icmpgt -> 347
    //   226: aload_0
    //   227: ldc -1.0
    //   229: putfield FWm : F
    //   232: aload_0
    //   233: invokevirtual bzF : ()I
    //   236: istore #11
    //   238: iload #11
    //   240: iconst_1
    //   241: if_icmpge -> 247
    //   244: iconst_1
    //   245: istore #11
    //   247: aload_0
    //   248: getfield DyG : I
    //   251: aload_0
    //   252: getfield aFZ : I
    //   255: isub
    //   256: aload_0
    //   257: getfield DyG : I
    //   260: aload_0
    //   261: getfield aFZ : I
    //   264: isub
    //   265: imul
    //   266: i2f
    //   267: aload_0
    //   268: invokevirtual FWm : ()I
    //   271: i2f
    //   272: fdiv
    //   273: f2i
    //   274: istore #10
    //   276: iload #10
    //   278: bipush #32
    //   280: if_icmpge -> 287
    //   283: bipush #32
    //   285: istore #10
    //   287: iload #10
    //   289: aload_0
    //   290: getfield DyG : I
    //   293: aload_0
    //   294: getfield aFZ : I
    //   297: isub
    //   298: bipush #8
    //   300: isub
    //   301: if_icmple -> 318
    //   304: aload_0
    //   305: getfield DyG : I
    //   308: aload_0
    //   309: getfield aFZ : I
    //   312: isub
    //   313: bipush #8
    //   315: isub
    //   316: istore #10
    //   318: aload_0
    //   319: dup
    //   320: getfield FWm : F
    //   323: aload_0
    //   324: getfield DyG : I
    //   327: aload_0
    //   328: getfield aFZ : I
    //   331: isub
    //   332: iload #10
    //   334: isub
    //   335: i2f
    //   336: iload #11
    //   338: i2f
    //   339: fdiv
    //   340: fdiv
    //   341: putfield FWm : F
    //   344: goto -> 352
    //   347: aload_0
    //   348: fconst_1
    //   349: putfield FWm : F
    //   352: iload #12
    //   354: ifeq -> 366
    //   357: aload_0
    //   358: iload_2
    //   359: i2f
    //   360: putfield Dne : F
    //   363: goto -> 372
    //   366: aload_0
    //   367: ldc -2.0
    //   369: putfield Dne : F
    //   372: goto -> 381
    //   375: aload_0
    //   376: ldc -2.0
    //   378: putfield Dne : F
    //   381: goto -> 499
    //   384: aload_0
    //   385: getfield Dne : F
    //   388: fconst_0
    //   389: fcmpl
    //   390: iflt -> 499
    //   393: aload_0
    //   394: dup
    //   395: getfield bzF : F
    //   398: iload_2
    //   399: i2f
    //   400: aload_0
    //   401: getfield Dne : F
    //   404: fsub
    //   405: aload_0
    //   406: getfield FWm : F
    //   409: fmul
    //   410: fsub
    //   411: putfield bzF : F
    //   414: aload_0
    //   415: iload_2
    //   416: i2f
    //   417: putfield Dne : F
    //   420: goto -> 499
    //   423: aload_0
    //   424: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   427: getfield Dne : LfZI;
    //   430: getfield ATE : Z
    //   433: ifne -> 493
    //   436: invokestatic next : ()Z
    //   439: ifeq -> 493
    //   442: invokestatic getEventDWheel : ()I
    //   445: istore #12
    //   447: iload #12
    //   449: ifeq -> 490
    //   452: iload #12
    //   454: ifle -> 463
    //   457: iconst_m1
    //   458: istore #12
    //   460: goto -> 471
    //   463: iload #12
    //   465: ifge -> 471
    //   468: iconst_1
    //   469: istore #12
    //   471: aload_0
    //   472: dup
    //   473: getfield bzF : F
    //   476: iload #12
    //   478: aload_0
    //   479: getfield Dne : I
    //   482: imul
    //   483: iconst_2
    //   484: idiv
    //   485: i2f
    //   486: fadd
    //   487: putfield bzF : F
    //   490: goto -> 423
    //   493: aload_0
    //   494: ldc -1.0
    //   496: putfield Dne : F
    //   499: aload_0
    //   500: invokespecial FWm : ()V
    //   503: sipush #2896
    //   506: invokestatic glDisable : (I)V
    //   509: sipush #2912
    //   512: invokestatic glDisable : (I)V
    //   515: getstatic WAR.Dne : LWAR;
    //   518: astore #12
    //   520: aload_0
    //   521: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   524: getfield Dne : LSnh;
    //   527: ldc '/gui/background.png'
    //   529: invokevirtual Dne : (Ljava/lang/String;)V
    //   532: fconst_1
    //   533: fconst_1
    //   534: fconst_1
    //   535: fconst_1
    //   536: invokestatic glColor4f : (FFFF)V
    //   539: ldc 32.0
    //   541: fstore #13
    //   543: aload #12
    //   545: invokevirtual Dne : ()V
    //   548: aload #12
    //   550: ldc 2105376
    //   552: invokevirtual bzF : (I)V
    //   555: aload #12
    //   557: aload_0
    //   558: getfield Qnq : I
    //   561: i2d
    //   562: aload_0
    //   563: getfield DyG : I
    //   566: i2d
    //   567: dconst_0
    //   568: aload_0
    //   569: getfield Qnq : I
    //   572: i2f
    //   573: fload #13
    //   575: fdiv
    //   576: f2d
    //   577: aload_0
    //   578: getfield DyG : I
    //   581: aload_0
    //   582: getfield bzF : F
    //   585: f2i
    //   586: iadd
    //   587: i2f
    //   588: fload #13
    //   590: fdiv
    //   591: f2d
    //   592: invokevirtual Dne : (DDDDD)V
    //   595: aload #12
    //   597: aload_0
    //   598: getfield zGp : I
    //   601: i2d
    //   602: aload_0
    //   603: getfield DyG : I
    //   606: i2d
    //   607: dconst_0
    //   608: aload_0
    //   609: getfield zGp : I
    //   612: i2f
    //   613: fload #13
    //   615: fdiv
    //   616: f2d
    //   617: aload_0
    //   618: getfield DyG : I
    //   621: aload_0
    //   622: getfield bzF : F
    //   625: f2i
    //   626: iadd
    //   627: i2f
    //   628: fload #13
    //   630: fdiv
    //   631: f2d
    //   632: invokevirtual Dne : (DDDDD)V
    //   635: aload #12
    //   637: aload_0
    //   638: getfield zGp : I
    //   641: i2d
    //   642: aload_0
    //   643: getfield aFZ : I
    //   646: i2d
    //   647: dconst_0
    //   648: aload_0
    //   649: getfield zGp : I
    //   652: i2f
    //   653: fload #13
    //   655: fdiv
    //   656: f2d
    //   657: aload_0
    //   658: getfield aFZ : I
    //   661: aload_0
    //   662: getfield bzF : F
    //   665: f2i
    //   666: iadd
    //   667: i2f
    //   668: fload #13
    //   670: fdiv
    //   671: f2d
    //   672: invokevirtual Dne : (DDDDD)V
    //   675: aload #12
    //   677: aload_0
    //   678: getfield Qnq : I
    //   681: i2d
    //   682: aload_0
    //   683: getfield aFZ : I
    //   686: i2d
    //   687: dconst_0
    //   688: aload_0
    //   689: getfield Qnq : I
    //   692: i2f
    //   693: fload #13
    //   695: fdiv
    //   696: f2d
    //   697: aload_0
    //   698: getfield aFZ : I
    //   701: aload_0
    //   702: getfield bzF : F
    //   705: f2i
    //   706: iadd
    //   707: i2f
    //   708: fload #13
    //   710: fdiv
    //   711: f2d
    //   712: invokevirtual Dne : (DDDDD)V
    //   715: aload #12
    //   717: invokevirtual Dne : ()I
    //   720: pop
    //   721: aload_0
    //   722: getfield Qnq : I
    //   725: iconst_2
    //   726: iadd
    //   727: istore #7
    //   729: aload_0
    //   730: getfield aFZ : I
    //   733: iconst_4
    //   734: iadd
    //   735: aload_0
    //   736: getfield bzF : F
    //   739: f2i
    //   740: isub
    //   741: istore #8
    //   743: iconst_0
    //   744: istore #9
    //   746: iload #9
    //   748: iload #4
    //   750: if_icmpge -> 1034
    //   753: iload #8
    //   755: iload #9
    //   757: aload_0
    //   758: getfield Dne : I
    //   761: imul
    //   762: iadd
    //   763: istore #11
    //   765: aload_0
    //   766: getfield Dne : I
    //   769: iconst_4
    //   770: isub
    //   771: istore #10
    //   773: iload #11
    //   775: aload_0
    //   776: getfield Dne : I
    //   779: iadd
    //   780: aload_0
    //   781: getfield DyG : I
    //   784: if_icmpgt -> 1028
    //   787: iload #11
    //   789: iconst_4
    //   790: isub
    //   791: aload_0
    //   792: getfield aFZ : I
    //   795: if_icmplt -> 1028
    //   798: aload_0
    //   799: iload #9
    //   801: invokevirtual Dne : (I)Z
    //   804: ifeq -> 1014
    //   807: aload_0
    //   808: getfield Qnq : I
    //   811: iconst_2
    //   812: iadd
    //   813: istore #14
    //   815: aload_0
    //   816: getfield zGp : I
    //   819: iconst_2
    //   820: isub
    //   821: istore #15
    //   823: fconst_1
    //   824: fconst_1
    //   825: fconst_1
    //   826: fconst_1
    //   827: invokestatic glColor4f : (FFFF)V
    //   830: sipush #3553
    //   833: invokestatic glDisable : (I)V
    //   836: aload #12
    //   838: invokevirtual Dne : ()V
    //   841: aload #12
    //   843: ldc 8421504
    //   845: invokevirtual bzF : (I)V
    //   848: aload #12
    //   850: iload #14
    //   852: i2d
    //   853: iload #11
    //   855: iload #10
    //   857: iadd
    //   858: iconst_2
    //   859: iadd
    //   860: i2d
    //   861: dconst_0
    //   862: dconst_0
    //   863: dconst_1
    //   864: invokevirtual Dne : (DDDDD)V
    //   867: aload #12
    //   869: iload #15
    //   871: i2d
    //   872: iload #11
    //   874: iload #10
    //   876: iadd
    //   877: iconst_2
    //   878: iadd
    //   879: i2d
    //   880: dconst_0
    //   881: dconst_1
    //   882: dconst_1
    //   883: invokevirtual Dne : (DDDDD)V
    //   886: aload #12
    //   888: iload #15
    //   890: i2d
    //   891: iload #11
    //   893: iconst_2
    //   894: isub
    //   895: i2d
    //   896: dconst_0
    //   897: dconst_1
    //   898: dconst_0
    //   899: invokevirtual Dne : (DDDDD)V
    //   902: aload #12
    //   904: iload #14
    //   906: i2d
    //   907: iload #11
    //   909: iconst_2
    //   910: isub
    //   911: i2d
    //   912: dconst_0
    //   913: dconst_0
    //   914: dconst_0
    //   915: invokevirtual Dne : (DDDDD)V
    //   918: aload #12
    //   920: iconst_0
    //   921: invokevirtual bzF : (I)V
    //   924: aload #12
    //   926: iload #14
    //   928: iconst_1
    //   929: iadd
    //   930: i2d
    //   931: iload #11
    //   933: iload #10
    //   935: iadd
    //   936: iconst_1
    //   937: iadd
    //   938: i2d
    //   939: dconst_0
    //   940: dconst_0
    //   941: dconst_1
    //   942: invokevirtual Dne : (DDDDD)V
    //   945: aload #12
    //   947: iload #15
    //   949: iconst_1
    //   950: isub
    //   951: i2d
    //   952: iload #11
    //   954: iload #10
    //   956: iadd
    //   957: iconst_1
    //   958: iadd
    //   959: i2d
    //   960: dconst_0
    //   961: dconst_1
    //   962: dconst_1
    //   963: invokevirtual Dne : (DDDDD)V
    //   966: aload #12
    //   968: iload #15
    //   970: iconst_1
    //   971: isub
    //   972: i2d
    //   973: iload #11
    //   975: iconst_1
    //   976: isub
    //   977: i2d
    //   978: dconst_0
    //   979: dconst_1
    //   980: dconst_0
    //   981: invokevirtual Dne : (DDDDD)V
    //   984: aload #12
    //   986: iload #14
    //   988: iconst_1
    //   989: iadd
    //   990: i2d
    //   991: iload #11
    //   993: iconst_1
    //   994: isub
    //   995: i2d
    //   996: dconst_0
    //   997: dconst_0
    //   998: dconst_0
    //   999: invokevirtual Dne : (DDDDD)V
    //   1002: aload #12
    //   1004: invokevirtual Dne : ()I
    //   1007: pop
    //   1008: sipush #3553
    //   1011: invokestatic glEnable : (I)V
    //   1014: aload_0
    //   1015: iload #9
    //   1017: iload #7
    //   1019: iload #11
    //   1021: iload #10
    //   1023: aload #12
    //   1025: invokevirtual Dne : (IIIILWAR;)V
    //   1028: iinc #9, 1
    //   1031: goto -> 746
    //   1034: sipush #2929
    //   1037: invokestatic glDisable : (I)V
    //   1040: iconst_4
    //   1041: istore #15
    //   1043: sipush #3042
    //   1046: invokestatic glEnable : (I)V
    //   1049: sipush #770
    //   1052: sipush #771
    //   1055: invokestatic glBlendFunc : (II)V
    //   1058: sipush #3008
    //   1061: invokestatic glDisable : (I)V
    //   1064: sipush #7425
    //   1067: invokestatic glShadeModel : (I)V
    //   1070: sipush #3553
    //   1073: invokestatic glDisable : (I)V
    //   1076: aload #12
    //   1078: invokevirtual Dne : ()V
    //   1081: aload #12
    //   1083: iconst_0
    //   1084: iconst_0
    //   1085: invokevirtual Dne : (II)V
    //   1088: aload #12
    //   1090: aload_0
    //   1091: getfield Qnq : I
    //   1094: i2d
    //   1095: aload_0
    //   1096: getfield aFZ : I
    //   1099: iload #15
    //   1101: iadd
    //   1102: i2d
    //   1103: dconst_0
    //   1104: dconst_0
    //   1105: dconst_1
    //   1106: invokevirtual Dne : (DDDDD)V
    //   1109: aload #12
    //   1111: aload_0
    //   1112: getfield zGp : I
    //   1115: i2d
    //   1116: aload_0
    //   1117: getfield aFZ : I
    //   1120: iload #15
    //   1122: iadd
    //   1123: i2d
    //   1124: dconst_0
    //   1125: dconst_1
    //   1126: dconst_1
    //   1127: invokevirtual Dne : (DDDDD)V
    //   1130: aload #12
    //   1132: iconst_0
    //   1133: sipush #255
    //   1136: invokevirtual Dne : (II)V
    //   1139: aload #12
    //   1141: aload_0
    //   1142: getfield zGp : I
    //   1145: i2d
    //   1146: aload_0
    //   1147: getfield aFZ : I
    //   1150: i2d
    //   1151: dconst_0
    //   1152: dconst_1
    //   1153: dconst_0
    //   1154: invokevirtual Dne : (DDDDD)V
    //   1157: aload #12
    //   1159: aload_0
    //   1160: getfield Qnq : I
    //   1163: i2d
    //   1164: aload_0
    //   1165: getfield aFZ : I
    //   1168: i2d
    //   1169: dconst_0
    //   1170: dconst_0
    //   1171: dconst_0
    //   1172: invokevirtual Dne : (DDDDD)V
    //   1175: aload #12
    //   1177: invokevirtual Dne : ()I
    //   1180: pop
    //   1181: aload #12
    //   1183: invokevirtual Dne : ()V
    //   1186: aload #12
    //   1188: iconst_0
    //   1189: sipush #255
    //   1192: invokevirtual Dne : (II)V
    //   1195: aload #12
    //   1197: aload_0
    //   1198: getfield Qnq : I
    //   1201: i2d
    //   1202: aload_0
    //   1203: getfield DyG : I
    //   1206: i2d
    //   1207: dconst_0
    //   1208: dconst_0
    //   1209: dconst_1
    //   1210: invokevirtual Dne : (DDDDD)V
    //   1213: aload #12
    //   1215: aload_0
    //   1216: getfield zGp : I
    //   1219: i2d
    //   1220: aload_0
    //   1221: getfield DyG : I
    //   1224: i2d
    //   1225: dconst_0
    //   1226: dconst_1
    //   1227: dconst_1
    //   1228: invokevirtual Dne : (DDDDD)V
    //   1231: aload #12
    //   1233: iconst_0
    //   1234: iconst_0
    //   1235: invokevirtual Dne : (II)V
    //   1238: aload #12
    //   1240: aload_0
    //   1241: getfield zGp : I
    //   1244: i2d
    //   1245: aload_0
    //   1246: getfield DyG : I
    //   1249: iload #15
    //   1251: isub
    //   1252: i2d
    //   1253: dconst_0
    //   1254: dconst_1
    //   1255: dconst_0
    //   1256: invokevirtual Dne : (DDDDD)V
    //   1259: aload #12
    //   1261: aload_0
    //   1262: getfield Qnq : I
    //   1265: i2d
    //   1266: aload_0
    //   1267: getfield DyG : I
    //   1270: iload #15
    //   1272: isub
    //   1273: i2d
    //   1274: dconst_0
    //   1275: dconst_0
    //   1276: dconst_0
    //   1277: invokevirtual Dne : (DDDDD)V
    //   1280: aload #12
    //   1282: invokevirtual Dne : ()I
    //   1285: pop
    //   1286: aload_0
    //   1287: invokevirtual bzF : ()I
    //   1290: istore #11
    //   1292: iload #11
    //   1294: ifle -> 1666
    //   1297: aload_0
    //   1298: getfield DyG : I
    //   1301: aload_0
    //   1302: getfield aFZ : I
    //   1305: isub
    //   1306: aload_0
    //   1307: getfield DyG : I
    //   1310: aload_0
    //   1311: getfield aFZ : I
    //   1314: isub
    //   1315: imul
    //   1316: aload_0
    //   1317: invokevirtual FWm : ()I
    //   1320: idiv
    //   1321: istore #10
    //   1323: iload #10
    //   1325: bipush #32
    //   1327: if_icmpge -> 1334
    //   1330: bipush #32
    //   1332: istore #10
    //   1334: iload #10
    //   1336: aload_0
    //   1337: getfield DyG : I
    //   1340: aload_0
    //   1341: getfield aFZ : I
    //   1344: isub
    //   1345: bipush #8
    //   1347: isub
    //   1348: if_icmple -> 1365
    //   1351: aload_0
    //   1352: getfield DyG : I
    //   1355: aload_0
    //   1356: getfield aFZ : I
    //   1359: isub
    //   1360: bipush #8
    //   1362: isub
    //   1363: istore #10
    //   1365: aload_0
    //   1366: getfield bzF : F
    //   1369: f2i
    //   1370: aload_0
    //   1371: getfield DyG : I
    //   1374: aload_0
    //   1375: getfield aFZ : I
    //   1378: isub
    //   1379: iload #10
    //   1381: isub
    //   1382: imul
    //   1383: iload #11
    //   1385: idiv
    //   1386: aload_0
    //   1387: getfield aFZ : I
    //   1390: iadd
    //   1391: istore #14
    //   1393: iload #14
    //   1395: aload_0
    //   1396: getfield aFZ : I
    //   1399: if_icmpge -> 1408
    //   1402: aload_0
    //   1403: getfield aFZ : I
    //   1406: istore #14
    //   1408: aload #12
    //   1410: invokevirtual Dne : ()V
    //   1413: aload #12
    //   1415: iconst_0
    //   1416: sipush #255
    //   1419: invokevirtual Dne : (II)V
    //   1422: aload #12
    //   1424: iload #5
    //   1426: i2d
    //   1427: aload_0
    //   1428: getfield DyG : I
    //   1431: i2d
    //   1432: dconst_0
    //   1433: dconst_0
    //   1434: dconst_1
    //   1435: invokevirtual Dne : (DDDDD)V
    //   1438: aload #12
    //   1440: iload #6
    //   1442: i2d
    //   1443: aload_0
    //   1444: getfield DyG : I
    //   1447: i2d
    //   1448: dconst_0
    //   1449: dconst_1
    //   1450: dconst_1
    //   1451: invokevirtual Dne : (DDDDD)V
    //   1454: aload #12
    //   1456: iload #6
    //   1458: i2d
    //   1459: aload_0
    //   1460: getfield aFZ : I
    //   1463: i2d
    //   1464: dconst_0
    //   1465: dconst_1
    //   1466: dconst_0
    //   1467: invokevirtual Dne : (DDDDD)V
    //   1470: aload #12
    //   1472: iload #5
    //   1474: i2d
    //   1475: aload_0
    //   1476: getfield aFZ : I
    //   1479: i2d
    //   1480: dconst_0
    //   1481: dconst_0
    //   1482: dconst_0
    //   1483: invokevirtual Dne : (DDDDD)V
    //   1486: aload #12
    //   1488: invokevirtual Dne : ()I
    //   1491: pop
    //   1492: aload #12
    //   1494: invokevirtual Dne : ()V
    //   1497: aload #12
    //   1499: ldc 8421504
    //   1501: sipush #255
    //   1504: invokevirtual Dne : (II)V
    //   1507: aload #12
    //   1509: iload #5
    //   1511: i2d
    //   1512: iload #14
    //   1514: iload #10
    //   1516: iadd
    //   1517: i2d
    //   1518: dconst_0
    //   1519: dconst_0
    //   1520: dconst_1
    //   1521: invokevirtual Dne : (DDDDD)V
    //   1524: aload #12
    //   1526: iload #6
    //   1528: i2d
    //   1529: iload #14
    //   1531: iload #10
    //   1533: iadd
    //   1534: i2d
    //   1535: dconst_0
    //   1536: dconst_1
    //   1537: dconst_1
    //   1538: invokevirtual Dne : (DDDDD)V
    //   1541: aload #12
    //   1543: iload #6
    //   1545: i2d
    //   1546: iload #14
    //   1548: i2d
    //   1549: dconst_0
    //   1550: dconst_1
    //   1551: dconst_0
    //   1552: invokevirtual Dne : (DDDDD)V
    //   1555: aload #12
    //   1557: iload #5
    //   1559: i2d
    //   1560: iload #14
    //   1562: i2d
    //   1563: dconst_0
    //   1564: dconst_0
    //   1565: dconst_0
    //   1566: invokevirtual Dne : (DDDDD)V
    //   1569: aload #12
    //   1571: invokevirtual Dne : ()I
    //   1574: pop
    //   1575: aload #12
    //   1577: invokevirtual Dne : ()V
    //   1580: aload #12
    //   1582: ldc 12632256
    //   1584: sipush #255
    //   1587: invokevirtual Dne : (II)V
    //   1590: aload #12
    //   1592: iload #5
    //   1594: i2d
    //   1595: iload #14
    //   1597: iload #10
    //   1599: iadd
    //   1600: iconst_1
    //   1601: isub
    //   1602: i2d
    //   1603: dconst_0
    //   1604: dconst_0
    //   1605: dconst_1
    //   1606: invokevirtual Dne : (DDDDD)V
    //   1609: aload #12
    //   1611: iload #6
    //   1613: iconst_1
    //   1614: isub
    //   1615: i2d
    //   1616: iload #14
    //   1618: iload #10
    //   1620: iadd
    //   1621: iconst_1
    //   1622: isub
    //   1623: i2d
    //   1624: dconst_0
    //   1625: dconst_1
    //   1626: dconst_1
    //   1627: invokevirtual Dne : (DDDDD)V
    //   1630: aload #12
    //   1632: iload #6
    //   1634: iconst_1
    //   1635: isub
    //   1636: i2d
    //   1637: iload #14
    //   1639: i2d
    //   1640: dconst_0
    //   1641: dconst_1
    //   1642: dconst_0
    //   1643: invokevirtual Dne : (DDDDD)V
    //   1646: aload #12
    //   1648: iload #5
    //   1650: i2d
    //   1651: iload #14
    //   1653: i2d
    //   1654: dconst_0
    //   1655: dconst_0
    //   1656: dconst_0
    //   1657: invokevirtual Dne : (DDDDD)V
    //   1660: aload #12
    //   1662: invokevirtual Dne : ()I
    //   1665: pop
    //   1666: sipush #3553
    //   1669: invokestatic glEnable : (I)V
    //   1672: sipush #7424
    //   1675: invokestatic glShadeModel : (I)V
    //   1678: sipush #3008
    //   1681: invokestatic glEnable : (I)V
    //   1684: sipush #3042
    //   1687: invokestatic glDisable : (I)V
    //   1690: return
  }
  
  protected abstract void Dne();
  
  protected int FWm() {
    return Dne() * this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BJs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */