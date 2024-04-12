public class GLU extends QCe {
  static {
  
  }
  
  public void Dne(cQz paramcQz, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: invokestatic glPushMatrix : ()V
    //   3: dload_2
    //   4: d2f
    //   5: dload #4
    //   7: d2f
    //   8: dload #6
    //   10: d2f
    //   11: invokestatic glTranslatef : (FFF)V
    //   14: ldc 32826
    //   16: invokestatic glEnable : (I)V
    //   19: ldc 0.5
    //   21: ldc 0.5
    //   23: ldc 0.5
    //   25: invokestatic glScalef : (FFF)V
    //   28: iconst_1
    //   29: istore #10
    //   31: iconst_2
    //   32: istore #11
    //   34: aload_0
    //   35: ldc '/particles.png'
    //   37: invokevirtual Dne : (Ljava/lang/String;)V
    //   40: getstatic WAR.Dne : LWAR;
    //   43: astore #12
    //   45: iload #10
    //   47: bipush #8
    //   49: imul
    //   50: iconst_0
    //   51: iadd
    //   52: i2f
    //   53: ldc 128.0
    //   55: fdiv
    //   56: fstore #13
    //   58: iload #10
    //   60: bipush #8
    //   62: imul
    //   63: bipush #8
    //   65: iadd
    //   66: i2f
    //   67: ldc 128.0
    //   69: fdiv
    //   70: fstore #14
    //   72: iload #11
    //   74: bipush #8
    //   76: imul
    //   77: iconst_0
    //   78: iadd
    //   79: i2f
    //   80: ldc 128.0
    //   82: fdiv
    //   83: fstore #15
    //   85: iload #11
    //   87: bipush #8
    //   89: imul
    //   90: bipush #8
    //   92: iadd
    //   93: i2f
    //   94: ldc 128.0
    //   96: fdiv
    //   97: fstore #16
    //   99: fconst_1
    //   100: fstore #17
    //   102: ldc 0.5
    //   104: fstore #18
    //   106: ldc 0.5
    //   108: fstore #19
    //   110: ldc 180.0
    //   112: aload_0
    //   113: getfield Dne : LptH;
    //   116: getfield Dne : F
    //   119: fsub
    //   120: fconst_0
    //   121: fconst_1
    //   122: fconst_0
    //   123: invokestatic glRotatef : (FFFF)V
    //   126: aload_0
    //   127: getfield Dne : LptH;
    //   130: getfield FWm : F
    //   133: fneg
    //   134: fconst_1
    //   135: fconst_0
    //   136: fconst_0
    //   137: invokestatic glRotatef : (FFFF)V
    //   140: aload #12
    //   142: invokevirtual Dne : ()V
    //   145: aload #12
    //   147: fconst_0
    //   148: fconst_1
    //   149: fconst_0
    //   150: invokevirtual FWm : (FFF)V
    //   153: aload #12
    //   155: fconst_0
    //   156: fload #18
    //   158: fsub
    //   159: f2d
    //   160: fconst_0
    //   161: fload #19
    //   163: fsub
    //   164: f2d
    //   165: dconst_0
    //   166: fload #13
    //   168: f2d
    //   169: fload #16
    //   171: f2d
    //   172: invokevirtual Dne : (DDDDD)V
    //   175: aload #12
    //   177: fload #17
    //   179: fload #18
    //   181: fsub
    //   182: f2d
    //   183: fconst_0
    //   184: fload #19
    //   186: fsub
    //   187: f2d
    //   188: dconst_0
    //   189: fload #14
    //   191: f2d
    //   192: fload #16
    //   194: f2d
    //   195: invokevirtual Dne : (DDDDD)V
    //   198: aload #12
    //   200: fload #17
    //   202: fload #18
    //   204: fsub
    //   205: f2d
    //   206: fconst_1
    //   207: fload #19
    //   209: fsub
    //   210: f2d
    //   211: dconst_0
    //   212: fload #14
    //   214: f2d
    //   215: fload #15
    //   217: f2d
    //   218: invokevirtual Dne : (DDDDD)V
    //   221: aload #12
    //   223: fconst_0
    //   224: fload #18
    //   226: fsub
    //   227: f2d
    //   228: fconst_1
    //   229: fload #19
    //   231: fsub
    //   232: f2d
    //   233: dconst_0
    //   234: fload #13
    //   236: f2d
    //   237: fload #15
    //   239: f2d
    //   240: invokevirtual Dne : (DDDDD)V
    //   243: aload #12
    //   245: invokevirtual Dne : ()I
    //   248: pop
    //   249: ldc 32826
    //   251: invokestatic glDisable : (I)V
    //   254: invokestatic glPopMatrix : ()V
    //   257: aload_1
    //   258: getfield Dne : LFiG;
    //   261: ifnull -> 943
    //   264: aload_1
    //   265: getfield Dne : LFiG;
    //   268: fload #9
    //   270: invokevirtual FWm : (F)F
    //   273: fstore #20
    //   275: fload #20
    //   277: invokestatic bzF : (F)F
    //   280: ldc 3.1415927
    //   282: fmul
    //   283: invokestatic Dne : (F)F
    //   286: fstore #21
    //   288: aload_1
    //   289: getfield Dne : LQnq;
    //   292: invokevirtual Dne : ()LziS;
    //   295: ldc2_w -0.5
    //   298: ldc2_w 0.03
    //   301: ldc2_w 0.8
    //   304: invokevirtual Dne : (DDD)LchN;
    //   307: astore #22
    //   309: aload #22
    //   311: aload_1
    //   312: getfield Dne : LFiG;
    //   315: getfield kGO : F
    //   318: aload_1
    //   319: getfield Dne : LFiG;
    //   322: getfield XHL : F
    //   325: aload_1
    //   326: getfield Dne : LFiG;
    //   329: getfield kGO : F
    //   332: fsub
    //   333: fload #9
    //   335: fmul
    //   336: fadd
    //   337: fneg
    //   338: ldc 3.1415927
    //   340: fmul
    //   341: ldc 180.0
    //   343: fdiv
    //   344: invokevirtual Dne : (F)V
    //   347: aload #22
    //   349: aload_1
    //   350: getfield Dne : LFiG;
    //   353: getfield Zpi : F
    //   356: aload_1
    //   357: getfield Dne : LFiG;
    //   360: getfield mrb : F
    //   363: aload_1
    //   364: getfield Dne : LFiG;
    //   367: getfield Zpi : F
    //   370: fsub
    //   371: fload #9
    //   373: fmul
    //   374: fadd
    //   375: fneg
    //   376: ldc 3.1415927
    //   378: fmul
    //   379: ldc 180.0
    //   381: fdiv
    //   382: invokevirtual FWm : (F)V
    //   385: aload #22
    //   387: fload #21
    //   389: ldc 0.5
    //   391: fmul
    //   392: invokevirtual FWm : (F)V
    //   395: aload #22
    //   397: fload #21
    //   399: fneg
    //   400: ldc 0.7
    //   402: fmul
    //   403: invokevirtual Dne : (F)V
    //   406: aload_1
    //   407: getfield Dne : LFiG;
    //   410: getfield aFZ : D
    //   413: aload_1
    //   414: getfield Dne : LFiG;
    //   417: getfield div : D
    //   420: aload_1
    //   421: getfield Dne : LFiG;
    //   424: getfield aFZ : D
    //   427: dsub
    //   428: fload #9
    //   430: f2d
    //   431: dmul
    //   432: dadd
    //   433: aload #22
    //   435: getfield Dne : D
    //   438: dadd
    //   439: dstore #23
    //   441: aload_1
    //   442: getfield Dne : LFiG;
    //   445: getfield zGp : D
    //   448: aload_1
    //   449: getfield Dne : LFiG;
    //   452: getfield IjH : D
    //   455: aload_1
    //   456: getfield Dne : LFiG;
    //   459: getfield zGp : D
    //   462: dsub
    //   463: fload #9
    //   465: f2d
    //   466: dmul
    //   467: dadd
    //   468: aload #22
    //   470: getfield FWm : D
    //   473: dadd
    //   474: dstore #25
    //   476: aload_1
    //   477: getfield Dne : LFiG;
    //   480: getfield DyG : D
    //   483: aload_1
    //   484: getfield Dne : LFiG;
    //   487: getfield mrb : D
    //   490: aload_1
    //   491: getfield Dne : LFiG;
    //   494: getfield DyG : D
    //   497: dsub
    //   498: fload #9
    //   500: f2d
    //   501: dmul
    //   502: dadd
    //   503: aload #22
    //   505: getfield bzF : D
    //   508: dadd
    //   509: dstore #27
    //   511: aload_1
    //   512: getfield Dne : LFiG;
    //   515: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   518: getfield Dne : LMJs;
    //   521: if_acmpeq -> 535
    //   524: aload_1
    //   525: getfield Dne : LFiG;
    //   528: invokevirtual c_ : ()F
    //   531: f2d
    //   532: goto -> 536
    //   535: dconst_0
    //   536: dstore #29
    //   538: aload_0
    //   539: getfield Dne : LptH;
    //   542: getfield Dne : LfZI;
    //   545: getfield div : I
    //   548: ifgt -> 564
    //   551: aload_1
    //   552: getfield Dne : LFiG;
    //   555: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   558: getfield Dne : LMJs;
    //   561: if_acmpeq -> 736
    //   564: aload_1
    //   565: getfield Dne : LFiG;
    //   568: getfield oIf : F
    //   571: aload_1
    //   572: getfield Dne : LFiG;
    //   575: getfield IjH : F
    //   578: aload_1
    //   579: getfield Dne : LFiG;
    //   582: getfield oIf : F
    //   585: fsub
    //   586: fload #9
    //   588: fmul
    //   589: fadd
    //   590: ldc 3.1415927
    //   592: fmul
    //   593: ldc 180.0
    //   595: fdiv
    //   596: fstore #31
    //   598: fload #31
    //   600: invokestatic Dne : (F)F
    //   603: f2d
    //   604: dstore #32
    //   606: fload #31
    //   608: invokestatic FWm : (F)F
    //   611: f2d
    //   612: dstore #34
    //   614: aload_1
    //   615: getfield Dne : LFiG;
    //   618: getfield aFZ : D
    //   621: aload_1
    //   622: getfield Dne : LFiG;
    //   625: getfield div : D
    //   628: aload_1
    //   629: getfield Dne : LFiG;
    //   632: getfield aFZ : D
    //   635: dsub
    //   636: fload #9
    //   638: f2d
    //   639: dmul
    //   640: dadd
    //   641: dload #34
    //   643: ldc2_w 0.35
    //   646: dmul
    //   647: dsub
    //   648: dload #32
    //   650: ldc2_w 0.85
    //   653: dmul
    //   654: dsub
    //   655: dstore #23
    //   657: aload_1
    //   658: getfield Dne : LFiG;
    //   661: getfield zGp : D
    //   664: dload #29
    //   666: dadd
    //   667: aload_1
    //   668: getfield Dne : LFiG;
    //   671: getfield IjH : D
    //   674: aload_1
    //   675: getfield Dne : LFiG;
    //   678: getfield zGp : D
    //   681: dsub
    //   682: fload #9
    //   684: f2d
    //   685: dmul
    //   686: dadd
    //   687: ldc2_w 0.45
    //   690: dsub
    //   691: dstore #25
    //   693: aload_1
    //   694: getfield Dne : LFiG;
    //   697: getfield DyG : D
    //   700: aload_1
    //   701: getfield Dne : LFiG;
    //   704: getfield mrb : D
    //   707: aload_1
    //   708: getfield Dne : LFiG;
    //   711: getfield DyG : D
    //   714: dsub
    //   715: fload #9
    //   717: f2d
    //   718: dmul
    //   719: dadd
    //   720: dload #32
    //   722: ldc2_w 0.35
    //   725: dmul
    //   726: dsub
    //   727: dload #34
    //   729: ldc2_w 0.85
    //   732: dmul
    //   733: dadd
    //   734: dstore #27
    //   736: aload_1
    //   737: getfield aFZ : D
    //   740: aload_1
    //   741: getfield div : D
    //   744: aload_1
    //   745: getfield aFZ : D
    //   748: dsub
    //   749: fload #9
    //   751: f2d
    //   752: dmul
    //   753: dadd
    //   754: dstore #31
    //   756: aload_1
    //   757: getfield zGp : D
    //   760: aload_1
    //   761: getfield IjH : D
    //   764: aload_1
    //   765: getfield zGp : D
    //   768: dsub
    //   769: fload #9
    //   771: f2d
    //   772: dmul
    //   773: dadd
    //   774: ldc2_w 0.25
    //   777: dadd
    //   778: dstore #33
    //   780: aload_1
    //   781: getfield DyG : D
    //   784: aload_1
    //   785: getfield mrb : D
    //   788: aload_1
    //   789: getfield DyG : D
    //   792: dsub
    //   793: fload #9
    //   795: f2d
    //   796: dmul
    //   797: dadd
    //   798: dstore #35
    //   800: dload #23
    //   802: dload #31
    //   804: dsub
    //   805: d2f
    //   806: f2d
    //   807: dstore #37
    //   809: dload #25
    //   811: dload #33
    //   813: dsub
    //   814: d2f
    //   815: f2d
    //   816: dstore #39
    //   818: dload #27
    //   820: dload #35
    //   822: dsub
    //   823: d2f
    //   824: f2d
    //   825: dstore #41
    //   827: sipush #3553
    //   830: invokestatic glDisable : (I)V
    //   833: sipush #2896
    //   836: invokestatic glDisable : (I)V
    //   839: aload #12
    //   841: iconst_3
    //   842: invokevirtual Dne : (I)V
    //   845: aload #12
    //   847: iconst_0
    //   848: invokevirtual bzF : (I)V
    //   851: bipush #16
    //   853: istore #43
    //   855: iconst_0
    //   856: istore #44
    //   858: iload #44
    //   860: iload #43
    //   862: if_icmpgt -> 925
    //   865: iload #44
    //   867: i2f
    //   868: iload #43
    //   870: i2f
    //   871: fdiv
    //   872: fstore #45
    //   874: aload #12
    //   876: dload_2
    //   877: dload #37
    //   879: fload #45
    //   881: f2d
    //   882: dmul
    //   883: dadd
    //   884: dload #4
    //   886: dload #39
    //   888: fload #45
    //   890: fload #45
    //   892: fmul
    //   893: fload #45
    //   895: fadd
    //   896: f2d
    //   897: dmul
    //   898: ldc2_w 0.5
    //   901: dmul
    //   902: dadd
    //   903: ldc2_w 0.25
    //   906: dadd
    //   907: dload #6
    //   909: dload #41
    //   911: fload #45
    //   913: f2d
    //   914: dmul
    //   915: dadd
    //   916: invokevirtual Dne : (DDD)V
    //   919: iinc #44, 1
    //   922: goto -> 858
    //   925: aload #12
    //   927: invokevirtual Dne : ()I
    //   930: pop
    //   931: sipush #2896
    //   934: invokestatic glEnable : (I)V
    //   937: sipush #3553
    //   940: invokestatic glEnable : (I)V
    //   943: return
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((cQz)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GLU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */