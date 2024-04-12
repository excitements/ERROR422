public class VAd extends lIg implements ZFz {
  public double FWm;
  
  public double EyB;
  
  public int Dne;
  
  public int FWm = 0;
  
  public int One = 0;
  
  private sMa bzF = null;
  
  public double Dne = false;
  
  private int ZgS = 0;
  
  private int eHV = 1;
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: iconst_2
    //   5: invokevirtual nextInt : (I)I
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/Random;
    //   12: iconst_1
    //   13: iload_2
    //   14: iadd
    //   15: invokevirtual nextInt : (I)I
    //   18: iadd
    //   19: istore_3
    //   20: iconst_0
    //   21: istore #4
    //   23: iload #4
    //   25: iload_3
    //   26: if_icmpge -> 47
    //   29: aload_0
    //   30: getstatic dEr.ivB : LdEr;
    //   33: getfield Qnq : I
    //   36: iconst_1
    //   37: invokevirtual Dne : (II)LJiM;
    //   40: pop
    //   41: iinc #4, 1
    //   44: goto -> 23
    //   47: aload_0
    //   48: getfield Dne : Ljava/util/Random;
    //   51: iconst_3
    //   52: invokevirtual nextInt : (I)I
    //   55: aload_0
    //   56: getfield Dne : Ljava/util/Random;
    //   59: iconst_1
    //   60: iload_2
    //   61: iadd
    //   62: invokevirtual nextInt : (I)I
    //   65: iadd
    //   66: istore_3
    //   67: iconst_0
    //   68: istore #4
    //   70: iload #4
    //   72: iload_3
    //   73: if_icmpge -> 94
    //   76: aload_0
    //   77: getstatic dEr.cot : LdEr;
    //   80: getfield Qnq : I
    //   83: iconst_1
    //   84: invokevirtual Dne : (II)LJiM;
    //   87: pop
    //   88: iinc #4, 1
    //   91: goto -> 70
    //   94: return
  }
  
  protected String DyG() {
    return "mob.ghast.scream";
  }
  
  protected int kGO() {
    return dEr.cot.Qnq;
  }
  
  protected String div() {
    return "mob.ghast.death";
  }
  
  private boolean Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : D
    //   4: aload_0
    //   5: getfield div : D
    //   8: dsub
    //   9: dload #7
    //   11: ddiv
    //   12: dstore #9
    //   14: aload_0
    //   15: getfield FWm : D
    //   18: aload_0
    //   19: getfield IjH : D
    //   22: dsub
    //   23: dload #7
    //   25: ddiv
    //   26: dstore #11
    //   28: aload_0
    //   29: getfield EyB : D
    //   32: aload_0
    //   33: getfield mrb : D
    //   36: dsub
    //   37: dload #7
    //   39: ddiv
    //   40: dstore #13
    //   42: aload_0
    //   43: getfield Dne : LbSp;
    //   46: invokevirtual Dne : ()LbSp;
    //   49: astore #15
    //   51: iconst_1
    //   52: istore #16
    //   54: iload #16
    //   56: i2d
    //   57: dload #7
    //   59: dcmpg
    //   60: ifge -> 101
    //   63: aload #15
    //   65: dload #9
    //   67: dload #11
    //   69: dload #13
    //   71: invokevirtual Qnq : (DDD)LbSp;
    //   74: pop
    //   75: aload_0
    //   76: getfield Dne : LQnq;
    //   79: aload_0
    //   80: aload #15
    //   82: invokevirtual Dne : (LsMa;LbSp;)Ljava/util/List;
    //   85: invokeinterface isEmpty : ()Z
    //   90: ifne -> 95
    //   93: iconst_0
    //   94: ireturn
    //   95: iinc #16, 1
    //   98: goto -> 54
    //   101: iconst_1
    //   102: ireturn
  }
  
  protected float div() {
    return 10.0F;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("ExplosionPower", this.eHV);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (paramWkD.Dne("ExplosionPower"))
      this.eHV = paramWkD.Dne("ExplosionPower"); 
  }
  
  protected void div() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 24
    //   10: aload_0
    //   11: getfield Dne : LQnq;
    //   14: getfield aFZ : I
    //   17: ifne -> 24
    //   20: aload_0
    //   21: invokevirtual g_ : ()V
    //   24: aload_0
    //   25: invokevirtual ZgS : ()V
    //   28: aload_0
    //   29: aload_0
    //   30: getfield One : I
    //   33: putfield FWm : I
    //   36: aload_0
    //   37: getfield Dne : D
    //   40: aload_0
    //   41: getfield div : D
    //   44: dsub
    //   45: dstore_1
    //   46: aload_0
    //   47: getfield FWm : D
    //   50: aload_0
    //   51: getfield IjH : D
    //   54: dsub
    //   55: dstore_3
    //   56: aload_0
    //   57: getfield EyB : D
    //   60: aload_0
    //   61: getfield mrb : D
    //   64: dsub
    //   65: dstore #5
    //   67: dload_1
    //   68: dload_1
    //   69: dmul
    //   70: dload_3
    //   71: dload_3
    //   72: dmul
    //   73: dadd
    //   74: dload #5
    //   76: dload #5
    //   78: dmul
    //   79: dadd
    //   80: dstore #7
    //   82: dload #7
    //   84: dconst_1
    //   85: dcmpg
    //   86: iflt -> 98
    //   89: dload #7
    //   91: ldc2_w 3600.0
    //   94: dcmpl
    //   95: ifle -> 170
    //   98: aload_0
    //   99: aload_0
    //   100: getfield div : D
    //   103: aload_0
    //   104: getfield Dne : Ljava/util/Random;
    //   107: invokevirtual nextFloat : ()F
    //   110: fconst_2
    //   111: fmul
    //   112: fconst_1
    //   113: fsub
    //   114: ldc 16.0
    //   116: fmul
    //   117: f2d
    //   118: dadd
    //   119: putfield Dne : D
    //   122: aload_0
    //   123: aload_0
    //   124: getfield IjH : D
    //   127: aload_0
    //   128: getfield Dne : Ljava/util/Random;
    //   131: invokevirtual nextFloat : ()F
    //   134: fconst_2
    //   135: fmul
    //   136: fconst_1
    //   137: fsub
    //   138: ldc 16.0
    //   140: fmul
    //   141: f2d
    //   142: dadd
    //   143: putfield FWm : D
    //   146: aload_0
    //   147: aload_0
    //   148: getfield mrb : D
    //   151: aload_0
    //   152: getfield Dne : Ljava/util/Random;
    //   155: invokevirtual nextFloat : ()F
    //   158: fconst_2
    //   159: fmul
    //   160: fconst_1
    //   161: fsub
    //   162: ldc 16.0
    //   164: fmul
    //   165: f2d
    //   166: dadd
    //   167: putfield EyB : D
    //   170: aload_0
    //   171: dup
    //   172: getfield Dne : I
    //   175: dup_x1
    //   176: iconst_1
    //   177: isub
    //   178: putfield Dne : I
    //   181: ifgt -> 311
    //   184: aload_0
    //   185: dup
    //   186: getfield Dne : I
    //   189: aload_0
    //   190: getfield Dne : Ljava/util/Random;
    //   193: iconst_5
    //   194: invokevirtual nextInt : (I)I
    //   197: iconst_2
    //   198: iadd
    //   199: iadd
    //   200: putfield Dne : I
    //   203: dload #7
    //   205: invokestatic Dne : (D)F
    //   208: f2d
    //   209: dstore #7
    //   211: aload_0
    //   212: aload_0
    //   213: getfield Dne : D
    //   216: aload_0
    //   217: getfield FWm : D
    //   220: aload_0
    //   221: getfield EyB : D
    //   224: dload #7
    //   226: invokespecial Dne : (DDDD)Z
    //   229: ifeq -> 287
    //   232: aload_0
    //   233: dup
    //   234: getfield XHL : D
    //   237: dload_1
    //   238: dload #7
    //   240: ddiv
    //   241: ldc2_w 0.1
    //   244: dmul
    //   245: dadd
    //   246: putfield XHL : D
    //   249: aload_0
    //   250: dup
    //   251: getfield Zpi : D
    //   254: dload_3
    //   255: dload #7
    //   257: ddiv
    //   258: ldc2_w 0.1
    //   261: dmul
    //   262: dadd
    //   263: putfield Zpi : D
    //   266: aload_0
    //   267: dup
    //   268: getfield kGO : D
    //   271: dload #5
    //   273: dload #7
    //   275: ddiv
    //   276: ldc2_w 0.1
    //   279: dmul
    //   280: dadd
    //   281: putfield kGO : D
    //   284: goto -> 311
    //   287: aload_0
    //   288: aload_0
    //   289: getfield div : D
    //   292: putfield Dne : D
    //   295: aload_0
    //   296: aload_0
    //   297: getfield IjH : D
    //   300: putfield FWm : D
    //   303: aload_0
    //   304: aload_0
    //   305: getfield mrb : D
    //   308: putfield EyB : D
    //   311: aload_0
    //   312: getfield bzF : LsMa;
    //   315: ifnull -> 333
    //   318: aload_0
    //   319: getfield bzF : LsMa;
    //   322: getfield Zpi : Z
    //   325: ifeq -> 333
    //   328: aload_0
    //   329: aconst_null
    //   330: putfield bzF : LsMa;
    //   333: aload_0
    //   334: getfield bzF : LsMa;
    //   337: ifnull -> 354
    //   340: aload_0
    //   341: dup
    //   342: getfield ZgS : I
    //   345: dup_x1
    //   346: iconst_1
    //   347: isub
    //   348: putfield ZgS : I
    //   351: ifgt -> 382
    //   354: aload_0
    //   355: aload_0
    //   356: getfield Dne : LQnq;
    //   359: aload_0
    //   360: ldc2_w 100.0
    //   363: invokevirtual FWm : (LsMa;D)LFiG;
    //   366: putfield bzF : LsMa;
    //   369: aload_0
    //   370: getfield bzF : LsMa;
    //   373: ifnull -> 382
    //   376: aload_0
    //   377: bipush #20
    //   379: putfield ZgS : I
    //   382: ldc2_w 64.0
    //   385: dstore #9
    //   387: aload_0
    //   388: getfield bzF : LsMa;
    //   391: ifnull -> 735
    //   394: aload_0
    //   395: getfield bzF : LsMa;
    //   398: aload_0
    //   399: invokevirtual Dne : (LsMa;)D
    //   402: dload #9
    //   404: dload #9
    //   406: dmul
    //   407: dcmpg
    //   408: ifge -> 735
    //   411: aload_0
    //   412: getfield bzF : LsMa;
    //   415: getfield div : D
    //   418: aload_0
    //   419: getfield div : D
    //   422: dsub
    //   423: dstore #11
    //   425: aload_0
    //   426: getfield bzF : LsMa;
    //   429: getfield Dne : LbSp;
    //   432: getfield FWm : D
    //   435: aload_0
    //   436: getfield bzF : LsMa;
    //   439: getfield trS : F
    //   442: fconst_2
    //   443: fdiv
    //   444: f2d
    //   445: dadd
    //   446: aload_0
    //   447: getfield IjH : D
    //   450: aload_0
    //   451: getfield trS : F
    //   454: fconst_2
    //   455: fdiv
    //   456: f2d
    //   457: dadd
    //   458: dsub
    //   459: dstore #13
    //   461: aload_0
    //   462: getfield bzF : LsMa;
    //   465: getfield mrb : D
    //   468: aload_0
    //   469: getfield mrb : D
    //   472: dsub
    //   473: dstore #15
    //   475: aload_0
    //   476: aload_0
    //   477: dload #11
    //   479: dload #15
    //   481: invokestatic atan2 : (DD)D
    //   484: d2f
    //   485: fneg
    //   486: ldc 180.0
    //   488: fmul
    //   489: ldc 3.1415927
    //   491: fdiv
    //   492: dup_x1
    //   493: putfield mrb : F
    //   496: putfield IjH : F
    //   499: aload_0
    //   500: aload_0
    //   501: getfield bzF : LsMa;
    //   504: invokevirtual Qnq : (LsMa;)Z
    //   507: ifeq -> 715
    //   510: aload_0
    //   511: getfield One : I
    //   514: bipush #10
    //   516: if_icmpne -> 549
    //   519: aload_0
    //   520: getfield Dne : LQnq;
    //   523: aconst_null
    //   524: checkcast FiG
    //   527: sipush #1007
    //   530: aload_0
    //   531: getfield div : D
    //   534: d2i
    //   535: aload_0
    //   536: getfield IjH : D
    //   539: d2i
    //   540: aload_0
    //   541: getfield mrb : D
    //   544: d2i
    //   545: iconst_0
    //   546: invokevirtual Dne : (LFiG;IIIII)V
    //   549: aload_0
    //   550: dup
    //   551: getfield One : I
    //   554: iconst_1
    //   555: iadd
    //   556: putfield One : I
    //   559: aload_0
    //   560: getfield One : I
    //   563: bipush #20
    //   565: if_icmpne -> 732
    //   568: aload_0
    //   569: getfield Dne : LQnq;
    //   572: aconst_null
    //   573: checkcast FiG
    //   576: sipush #1008
    //   579: aload_0
    //   580: getfield div : D
    //   583: d2i
    //   584: aload_0
    //   585: getfield IjH : D
    //   588: d2i
    //   589: aload_0
    //   590: getfield mrb : D
    //   593: d2i
    //   594: iconst_0
    //   595: invokevirtual Dne : (LFiG;IIIII)V
    //   598: new iis
    //   601: dup
    //   602: aload_0
    //   603: getfield Dne : LQnq;
    //   606: aload_0
    //   607: dload #11
    //   609: dload #13
    //   611: dload #15
    //   613: invokespecial <init> : (LQnq;LFUH;DDD)V
    //   616: astore #17
    //   618: aload #17
    //   620: aload_0
    //   621: getfield eHV : I
    //   624: putfield Dne : I
    //   627: ldc2_w 4.0
    //   630: dstore #18
    //   632: aload_0
    //   633: fconst_1
    //   634: invokevirtual FWm : (F)LchN;
    //   637: astore #20
    //   639: aload #17
    //   641: aload_0
    //   642: getfield div : D
    //   645: aload #20
    //   647: getfield Dne : D
    //   650: dload #18
    //   652: dmul
    //   653: dadd
    //   654: putfield div : D
    //   657: aload #17
    //   659: aload_0
    //   660: getfield IjH : D
    //   663: aload_0
    //   664: getfield trS : F
    //   667: fconst_2
    //   668: fdiv
    //   669: f2d
    //   670: dadd
    //   671: ldc2_w 0.5
    //   674: dadd
    //   675: putfield IjH : D
    //   678: aload #17
    //   680: aload_0
    //   681: getfield mrb : D
    //   684: aload #20
    //   686: getfield bzF : D
    //   689: dload #18
    //   691: dmul
    //   692: dadd
    //   693: putfield mrb : D
    //   696: aload_0
    //   697: getfield Dne : LQnq;
    //   700: aload #17
    //   702: invokevirtual FWm : (LsMa;)Z
    //   705: pop
    //   706: aload_0
    //   707: bipush #-40
    //   709: putfield One : I
    //   712: goto -> 732
    //   715: aload_0
    //   716: getfield One : I
    //   719: ifle -> 732
    //   722: aload_0
    //   723: dup
    //   724: getfield One : I
    //   727: iconst_1
    //   728: isub
    //   729: putfield One : I
    //   732: goto -> 780
    //   735: aload_0
    //   736: aload_0
    //   737: aload_0
    //   738: getfield XHL : D
    //   741: aload_0
    //   742: getfield kGO : D
    //   745: invokestatic atan2 : (DD)D
    //   748: d2f
    //   749: fneg
    //   750: ldc 180.0
    //   752: fmul
    //   753: ldc 3.1415927
    //   755: fdiv
    //   756: dup_x1
    //   757: putfield mrb : F
    //   760: putfield IjH : F
    //   763: aload_0
    //   764: getfield One : I
    //   767: ifle -> 780
    //   770: aload_0
    //   771: dup
    //   772: getfield One : I
    //   775: iconst_1
    //   776: isub
    //   777: putfield One : I
    //   780: aload_0
    //   781: getfield Dne : LQnq;
    //   784: getfield aFZ : Z
    //   787: ifne -> 839
    //   790: aload_0
    //   791: getfield Dne : LluM;
    //   794: bipush #16
    //   796: invokevirtual Dne : (I)B
    //   799: istore #11
    //   801: aload_0
    //   802: getfield One : I
    //   805: bipush #10
    //   807: if_icmple -> 814
    //   810: iconst_1
    //   811: goto -> 815
    //   814: iconst_0
    //   815: i2b
    //   816: istore #12
    //   818: iload #11
    //   820: iload #12
    //   822: if_icmpeq -> 839
    //   825: aload_0
    //   826: getfield Dne : LluM;
    //   829: bipush #16
    //   831: iload #12
    //   833: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   836: invokevirtual FWm : (ILjava/lang/Object;)V
    //   839: return
  }
  
  protected String zGp() {
    return "mob.ghast.moan";
  }
  
  public int Dne() {
    return 10;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: invokevirtual Dne : (I)B
    //   13: istore_1
    //   14: aload_0
    //   15: iload_1
    //   16: iconst_1
    //   17: if_icmpne -> 25
    //   20: ldc '/mob/ghast_fire.png'
    //   22: goto -> 27
    //   25: ldc '/mob/ghast.png'
    //   27: putfield bzF : Ljava/lang/String;
    //   30: return
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if ("fireball".equals(paramzBn.Dne()) && paramzBn.FWm() instanceof FiG) {
      super.Dne(paramzBn, 1000);
      ((FiG)paramzBn.FWm()).Dne(qlg.ceE);
      return true;
    } 
    return super.Dne(paramzBn, paramInt);
  }
  
  public int ooe() {
    return 1;
  }
  
  public VAd(Qnq paramQnq) {
    super(paramQnq);
    this.bzF = (sMa)"/mob/ghast.png";
    Dne(4.0F, 4.0F);
    this.ooe = true;
    this.Fnk = 5;
  }
  
  public boolean cot() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: bipush #20
    //   6: invokevirtual nextInt : (I)I
    //   9: ifne -> 33
    //   12: aload_0
    //   13: invokespecial cot : ()Z
    //   16: ifeq -> 33
    //   19: aload_0
    //   20: getfield Dne : LQnq;
    //   23: getfield aFZ : I
    //   26: ifle -> 33
    //   29: iconst_1
    //   30: goto -> 34
    //   33: iconst_0
    //   34: ireturn
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: iconst_0
    //   11: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   14: invokevirtual Dne : (ILjava/lang/Object;)V
    //   17: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VAd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */