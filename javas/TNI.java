public class TNI implements qDW {
  private final FKB Dne;
  
  private double Dne;
  
  private float Dne;
  
  private boolean Qnq = false;
  
  private float bzF;
  
  private boolean bzF = false;
  
  private final mKT Dne;
  
  private float FWm;
  
  private final Ebp Dne;
  
  private boolean Dne = false;
  
  private boolean FWm = false;
  
  public TNI(mKT parammKT, Ebp paramEbp, FKB paramFKB) {
    this.Dne = 0.0F;
    this.FWm = 0.0F;
    this.bzF = 0.0F;
    this.Dne = 0.0D;
    this.Dne = parammKT;
    this.Dne = paramEbp;
    this.Dne = paramFKB;
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield Dne : Z
    //   6: istore_2
    //   7: aload_0
    //   8: getfield FWm : Z
    //   11: istore_3
    //   12: aload_0
    //   13: getfield bzF : Z
    //   16: istore #4
    //   18: aload_0
    //   19: getfield FWm : F
    //   22: fstore #5
    //   24: aload_0
    //   25: getfield Dne : F
    //   28: fstore #6
    //   30: aload_0
    //   31: getfield bzF : F
    //   34: fstore #7
    //   36: aload_0
    //   37: getfield Dne : D
    //   40: dstore #8
    //   42: aload_0
    //   43: aload_0
    //   44: getfield Dne : LFKB;
    //   47: ifnull -> 68
    //   50: aload_0
    //   51: getfield Dne : LEbp;
    //   54: getfield Dne : LsMa;
    //   57: aload_0
    //   58: getfield Dne : LFKB;
    //   61: if_acmpne -> 68
    //   64: iconst_1
    //   65: goto -> 69
    //   68: iconst_0
    //   69: putfield Dne : Z
    //   72: aload_0
    //   73: aload_0
    //   74: getfield Dne : LEbp;
    //   77: getfield Zpi : Z
    //   80: putfield FWm : Z
    //   83: aload_0
    //   84: aload_0
    //   85: getfield Dne : LEbp;
    //   88: getfield XHL : D
    //   91: aload_0
    //   92: getfield Dne : LEbp;
    //   95: getfield XHL : D
    //   98: dmul
    //   99: aload_0
    //   100: getfield Dne : LEbp;
    //   103: getfield kGO : D
    //   106: aload_0
    //   107: getfield Dne : LEbp;
    //   110: getfield kGO : D
    //   113: dmul
    //   114: dadd
    //   115: invokestatic Dne : (D)F
    //   118: f2d
    //   119: putfield Dne : D
    //   122: aload_0
    //   123: aload_0
    //   124: getfield Dne : D
    //   127: ldc2_w 0.01
    //   130: dcmpl
    //   131: iflt -> 138
    //   134: iconst_1
    //   135: goto -> 139
    //   138: iconst_0
    //   139: putfield bzF : Z
    //   142: iload_2
    //   143: ifeq -> 164
    //   146: aload_0
    //   147: getfield Dne : Z
    //   150: ifne -> 164
    //   153: aload_0
    //   154: getfield Dne : LmKT;
    //   157: aload_0
    //   158: getfield Dne : LFKB;
    //   161: invokevirtual FWm : (LsMa;)V
    //   164: aload_0
    //   165: getfield FWm : Z
    //   168: ifne -> 196
    //   171: aload_0
    //   172: getfield Qnq : Z
    //   175: ifne -> 246
    //   178: aload_0
    //   179: getfield FWm : F
    //   182: fconst_0
    //   183: fcmpl
    //   184: ifne -> 246
    //   187: aload_0
    //   188: getfield bzF : F
    //   191: fconst_0
    //   192: fcmpl
    //   193: ifne -> 246
    //   196: iload_3
    //   197: ifne -> 233
    //   200: aload_0
    //   201: getfield Dne : LmKT;
    //   204: aload_0
    //   205: getfield Dne : LEbp;
    //   208: invokevirtual FWm : (LsMa;)V
    //   211: iload_2
    //   212: ifne -> 222
    //   215: aload_0
    //   216: getfield Dne : Z
    //   219: ifeq -> 233
    //   222: aload_0
    //   223: getfield Dne : LmKT;
    //   226: aload_0
    //   227: getfield Dne : LFKB;
    //   230: invokevirtual FWm : (LsMa;)V
    //   233: aload_0
    //   234: iconst_1
    //   235: putfield Qnq : Z
    //   238: aload_0
    //   239: getfield FWm : Z
    //   242: ifeq -> 246
    //   245: return
    //   246: aload_0
    //   247: getfield Dne : LmKT;
    //   250: aload_0
    //   251: getfield Dne : LEbp;
    //   254: invokevirtual Dne : (LsMa;)Z
    //   257: ifne -> 298
    //   260: aload_0
    //   261: getfield FWm : F
    //   264: fconst_0
    //   265: fcmpl
    //   266: ifle -> 298
    //   269: aload_0
    //   270: getfield Dne : LmKT;
    //   273: ldc 'minecart.base'
    //   275: aload_0
    //   276: getfield Dne : LEbp;
    //   279: aload_0
    //   280: getfield FWm : F
    //   283: aload_0
    //   284: getfield Dne : F
    //   287: iconst_0
    //   288: invokevirtual Dne : (Ljava/lang/String;LsMa;FFZ)V
    //   291: aload_0
    //   292: iconst_0
    //   293: putfield Qnq : Z
    //   296: iconst_1
    //   297: istore_1
    //   298: aload_0
    //   299: getfield Dne : Z
    //   302: ifeq -> 354
    //   305: aload_0
    //   306: getfield Dne : LmKT;
    //   309: aload_0
    //   310: getfield Dne : LFKB;
    //   313: invokevirtual Dne : (LsMa;)Z
    //   316: ifne -> 354
    //   319: aload_0
    //   320: getfield bzF : F
    //   323: fconst_0
    //   324: fcmpl
    //   325: ifle -> 354
    //   328: aload_0
    //   329: getfield Dne : LmKT;
    //   332: ldc 'minecart.inside'
    //   334: aload_0
    //   335: getfield Dne : LFKB;
    //   338: aload_0
    //   339: getfield bzF : F
    //   342: fconst_1
    //   343: iconst_1
    //   344: invokevirtual Dne : (Ljava/lang/String;LsMa;FFZ)V
    //   347: aload_0
    //   348: iconst_0
    //   349: putfield Qnq : Z
    //   352: iconst_1
    //   353: istore_1
    //   354: aload_0
    //   355: getfield bzF : Z
    //   358: ifeq -> 447
    //   361: aload_0
    //   362: getfield Dne : F
    //   365: fconst_1
    //   366: fcmpg
    //   367: ifge -> 381
    //   370: aload_0
    //   371: dup
    //   372: getfield Dne : F
    //   375: ldc 0.0025
    //   377: fadd
    //   378: putfield Dne : F
    //   381: aload_0
    //   382: getfield Dne : F
    //   385: fconst_1
    //   386: fcmpl
    //   387: ifle -> 395
    //   390: aload_0
    //   391: fconst_1
    //   392: putfield Dne : F
    //   395: aload_0
    //   396: getfield Dne : D
    //   399: d2f
    //   400: fconst_0
    //   401: ldc 4.0
    //   403: invokestatic Dne : (FFF)F
    //   406: ldc 4.0
    //   408: fdiv
    //   409: fstore #10
    //   411: aload_0
    //   412: fconst_0
    //   413: fload #10
    //   415: ldc 0.75
    //   417: fmul
    //   418: fadd
    //   419: putfield bzF : F
    //   422: fload #10
    //   424: fconst_2
    //   425: fmul
    //   426: fconst_0
    //   427: fconst_1
    //   428: invokestatic Dne : (FFF)F
    //   431: fstore #10
    //   433: aload_0
    //   434: fconst_0
    //   435: fload #10
    //   437: ldc 0.7
    //   439: fmul
    //   440: fadd
    //   441: putfield FWm : F
    //   444: goto -> 467
    //   447: iload #4
    //   449: ifeq -> 467
    //   452: aload_0
    //   453: fconst_0
    //   454: putfield FWm : F
    //   457: aload_0
    //   458: fconst_0
    //   459: putfield Dne : F
    //   462: aload_0
    //   463: fconst_0
    //   464: putfield bzF : F
    //   467: aload_0
    //   468: getfield Qnq : Z
    //   471: ifne -> 549
    //   474: aload_0
    //   475: getfield Dne : F
    //   478: fload #6
    //   480: fcmpl
    //   481: ifeq -> 499
    //   484: aload_0
    //   485: getfield Dne : LmKT;
    //   488: aload_0
    //   489: getfield Dne : LEbp;
    //   492: aload_0
    //   493: getfield Dne : F
    //   496: invokevirtual FWm : (LsMa;F)V
    //   499: aload_0
    //   500: getfield FWm : F
    //   503: fload #5
    //   505: fcmpl
    //   506: ifeq -> 524
    //   509: aload_0
    //   510: getfield Dne : LmKT;
    //   513: aload_0
    //   514: getfield Dne : LEbp;
    //   517: aload_0
    //   518: getfield FWm : F
    //   521: invokevirtual Dne : (LsMa;F)V
    //   524: aload_0
    //   525: getfield bzF : F
    //   528: fload #7
    //   530: fcmpl
    //   531: ifeq -> 549
    //   534: aload_0
    //   535: getfield Dne : LmKT;
    //   538: aload_0
    //   539: getfield Dne : LFKB;
    //   542: aload_0
    //   543: getfield bzF : F
    //   546: invokevirtual Dne : (LsMa;F)V
    //   549: iload_1
    //   550: ifne -> 607
    //   553: aload_0
    //   554: getfield FWm : F
    //   557: fconst_0
    //   558: fcmpl
    //   559: ifgt -> 571
    //   562: aload_0
    //   563: getfield bzF : F
    //   566: fconst_0
    //   567: fcmpl
    //   568: ifle -> 607
    //   571: aload_0
    //   572: getfield Dne : LmKT;
    //   575: aload_0
    //   576: getfield Dne : LEbp;
    //   579: invokevirtual Dne : (LsMa;)V
    //   582: aload_0
    //   583: getfield Dne : Z
    //   586: ifeq -> 664
    //   589: aload_0
    //   590: getfield Dne : LmKT;
    //   593: aload_0
    //   594: getfield Dne : LFKB;
    //   597: aload_0
    //   598: getfield Dne : LEbp;
    //   601: invokevirtual Dne : (LsMa;LsMa;)V
    //   604: goto -> 664
    //   607: aload_0
    //   608: getfield Dne : LmKT;
    //   611: aload_0
    //   612: getfield Dne : LEbp;
    //   615: invokevirtual Dne : (LsMa;)Z
    //   618: ifeq -> 632
    //   621: aload_0
    //   622: getfield Dne : LmKT;
    //   625: aload_0
    //   626: getfield Dne : LEbp;
    //   629: invokevirtual FWm : (LsMa;)V
    //   632: aload_0
    //   633: getfield Dne : Z
    //   636: ifeq -> 664
    //   639: aload_0
    //   640: getfield Dne : LmKT;
    //   643: aload_0
    //   644: getfield Dne : LFKB;
    //   647: invokevirtual Dne : (LsMa;)Z
    //   650: ifeq -> 664
    //   653: aload_0
    //   654: getfield Dne : LmKT;
    //   657: aload_0
    //   658: getfield Dne : LFKB;
    //   661: invokevirtual FWm : (LsMa;)V
    //   664: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TNI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */