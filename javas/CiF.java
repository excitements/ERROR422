public class CiF extends sMa {
  public WkD Dne;
  
  public int Dne;
  
  public int bzF = 0;
  
  private boolean ceE = false;
  
  private boolean FWm;
  
  private float Dne;
  
  private int Qnq = 40;
  
  public boolean Dne = true;
  
  public int FWm = 0;
  
  public CiF(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2) {
    super(paramQnq);
    this.Dne = 2.0F;
    this.Dne = null;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = 1;
    Dne(0.98F, 0.98F);
    this.udO = this.trS / 2.0F;
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.XHL = 0.0D;
    this.Zpi = 0.0D;
    this.kGO = 0.0D;
    this.aFZ = paramDouble1;
    this.zGp = paramDouble2;
    this.DyG = paramDouble3;
  }
  
  public boolean OdI() {
    return false;
  }
  
  public CiF(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramInt, 0);
  }
  
  protected void Dne(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ceE : Z
    //   4: ifeq -> 197
    //   7: fload_1
    //   8: fconst_1
    //   9: fsub
    //   10: invokestatic FWm : (F)I
    //   13: istore_2
    //   14: iload_2
    //   15: ifle -> 197
    //   18: new java/util/ArrayList
    //   21: dup
    //   22: aload_0
    //   23: getfield Dne : LQnq;
    //   26: aload_0
    //   27: aload_0
    //   28: getfield Dne : LbSp;
    //   31: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   34: invokespecial <init> : (Ljava/util/Collection;)V
    //   37: astore_3
    //   38: aload_0
    //   39: getfield Dne : I
    //   42: getstatic zKP.etZ : LzKP;
    //   45: getfield FWm : I
    //   48: if_icmpne -> 57
    //   51: getstatic zBn.kGO : LzBn;
    //   54: goto -> 60
    //   57: getstatic zBn.udO : LzBn;
    //   60: astore #4
    //   62: aload_3
    //   63: invokevirtual iterator : ()Ljava/util/Iterator;
    //   66: astore #5
    //   68: aload #5
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 118
    //   78: aload #5
    //   80: invokeinterface next : ()Ljava/lang/Object;
    //   85: checkcast sMa
    //   88: astore #6
    //   90: aload #6
    //   92: aload #4
    //   94: iload_2
    //   95: i2f
    //   96: aload_0
    //   97: getfield Dne : F
    //   100: fmul
    //   101: invokestatic Dne : (F)I
    //   104: aload_0
    //   105: getfield Qnq : I
    //   108: invokestatic min : (II)I
    //   111: invokevirtual Dne : (LzBn;I)Z
    //   114: pop
    //   115: goto -> 68
    //   118: aload_0
    //   119: getfield Dne : I
    //   122: getstatic zKP.etZ : LzKP;
    //   125: getfield FWm : I
    //   128: if_icmpne -> 197
    //   131: aload_0
    //   132: getfield Dne : Ljava/util/Random;
    //   135: invokevirtual nextFloat : ()F
    //   138: f2d
    //   139: ldc2_w 0.05000000074505806
    //   142: iload_2
    //   143: i2d
    //   144: ldc2_w 0.05
    //   147: dmul
    //   148: dadd
    //   149: dcmpg
    //   150: ifge -> 197
    //   153: aload_0
    //   154: getfield FWm : I
    //   157: iconst_2
    //   158: ishr
    //   159: istore #6
    //   161: aload_0
    //   162: getfield FWm : I
    //   165: iconst_3
    //   166: iand
    //   167: istore #7
    //   169: iinc #6, 1
    //   172: iload #6
    //   174: iconst_2
    //   175: if_icmple -> 186
    //   178: aload_0
    //   179: iconst_1
    //   180: putfield FWm : Z
    //   183: goto -> 197
    //   186: aload_0
    //   187: iload #7
    //   189: iload #6
    //   191: iconst_2
    //   192: ishl
    //   193: ior
    //   194: putfield FWm : I
    //   197: return
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  protected void FWm(WkD paramWkD) {
    if (paramWkD.Dne("TileID")) {
      this.Dne = paramWkD.Dne("TileID");
    } else {
      this.Dne = paramWkD.Dne("Tile") & 0xFF;
    } 
    this.FWm = paramWkD.Dne("Data") & 0xFF;
    this.bzF = paramWkD.Dne("Time") & 0xFF;
    if (paramWkD.Dne("HurtEntities")) {
      this.ceE = paramWkD.FWm("HurtEntities");
      this.Dne = paramWkD.Dne("FallHurtAmount");
      this.Qnq = paramWkD.Dne("FallHurtMax");
    } else if (this.Dne == zKP.etZ.FWm) {
      this.ceE = true;
    } 
    if (paramWkD.Dne("DropItem"))
      this.Dne = paramWkD.FWm("DropItem"); 
    if (paramWkD.Dne("TileEntityData"))
      this.Dne = paramWkD.Dne("TileEntityData"); 
    if (!this.Dne)
      this.Dne = ((zKP)zKP.IjH).FWm; 
  }
  
  public boolean kGO() {
    return (this.Zpi == 0.0F);
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifne -> 14
    //   7: aload_0
    //   8: invokevirtual g_ : ()V
    //   11: goto -> 663
    //   14: aload_0
    //   15: aload_0
    //   16: getfield div : D
    //   19: putfield aFZ : D
    //   22: aload_0
    //   23: aload_0
    //   24: getfield IjH : D
    //   27: putfield zGp : D
    //   30: aload_0
    //   31: aload_0
    //   32: getfield mrb : D
    //   35: putfield DyG : D
    //   38: aload_0
    //   39: dup
    //   40: getfield bzF : I
    //   43: iconst_1
    //   44: iadd
    //   45: putfield bzF : I
    //   48: aload_0
    //   49: dup
    //   50: getfield Zpi : D
    //   53: ldc2_w 0.03999999910593033
    //   56: dsub
    //   57: putfield Zpi : D
    //   60: aload_0
    //   61: aload_0
    //   62: getfield XHL : D
    //   65: aload_0
    //   66: getfield Zpi : D
    //   69: aload_0
    //   70: getfield kGO : D
    //   73: invokevirtual Dne : (DDD)V
    //   76: aload_0
    //   77: dup
    //   78: getfield XHL : D
    //   81: ldc2_w 0.9800000190734863
    //   84: dmul
    //   85: putfield XHL : D
    //   88: aload_0
    //   89: dup
    //   90: getfield Zpi : D
    //   93: ldc2_w 0.9800000190734863
    //   96: dmul
    //   97: putfield Zpi : D
    //   100: aload_0
    //   101: dup
    //   102: getfield kGO : D
    //   105: ldc2_w 0.9800000190734863
    //   108: dmul
    //   109: putfield kGO : D
    //   112: aload_0
    //   113: getfield Dne : LQnq;
    //   116: getfield aFZ : Z
    //   119: ifne -> 663
    //   122: aload_0
    //   123: getfield div : D
    //   126: invokestatic FWm : (D)I
    //   129: istore_1
    //   130: aload_0
    //   131: getfield IjH : D
    //   134: invokestatic FWm : (D)I
    //   137: istore_2
    //   138: aload_0
    //   139: getfield mrb : D
    //   142: invokestatic FWm : (D)I
    //   145: istore_3
    //   146: aload_0
    //   147: getfield bzF : I
    //   150: iconst_1
    //   151: if_icmpne -> 187
    //   154: aload_0
    //   155: getfield Dne : LQnq;
    //   158: iload_1
    //   159: iload_2
    //   160: iload_3
    //   161: invokevirtual Dne : (III)I
    //   164: aload_0
    //   165: getfield Dne : I
    //   168: if_icmpeq -> 176
    //   171: aload_0
    //   172: invokevirtual g_ : ()V
    //   175: return
    //   176: aload_0
    //   177: getfield Dne : LQnq;
    //   180: iload_1
    //   181: iload_2
    //   182: iload_3
    //   183: invokevirtual Qnq : (III)Z
    //   186: pop
    //   187: aload_0
    //   188: getfield aFZ : Z
    //   191: ifeq -> 578
    //   194: aload_0
    //   195: dup
    //   196: getfield XHL : D
    //   199: ldc2_w 0.699999988079071
    //   202: dmul
    //   203: putfield XHL : D
    //   206: aload_0
    //   207: dup
    //   208: getfield kGO : D
    //   211: ldc2_w 0.699999988079071
    //   214: dmul
    //   215: putfield kGO : D
    //   218: aload_0
    //   219: dup
    //   220: getfield Zpi : D
    //   223: ldc2_w -0.5
    //   226: dmul
    //   227: putfield Zpi : D
    //   230: aload_0
    //   231: getfield Dne : LQnq;
    //   234: iload_1
    //   235: iload_2
    //   236: iload_3
    //   237: invokevirtual Dne : (III)I
    //   240: getstatic zKP.Dne : LtsU;
    //   243: getfield FWm : I
    //   246: if_icmpeq -> 663
    //   249: aload_0
    //   250: invokevirtual g_ : ()V
    //   253: aload_0
    //   254: getfield FWm : Z
    //   257: ifne -> 528
    //   260: aload_0
    //   261: getfield Dne : LQnq;
    //   264: aload_0
    //   265: getfield Dne : I
    //   268: iload_1
    //   269: iload_2
    //   270: iload_3
    //   271: iconst_1
    //   272: iconst_1
    //   273: aconst_null
    //   274: checkcast sMa
    //   277: aconst_null
    //   278: checkcast NMq
    //   281: invokevirtual Dne : (IIIIZILsMa;LNMq;)Z
    //   284: ifeq -> 528
    //   287: aload_0
    //   288: getfield Dne : LQnq;
    //   291: iload_1
    //   292: iload_2
    //   293: iconst_1
    //   294: isub
    //   295: iload_3
    //   296: invokestatic bzF : (LQnq;III)Z
    //   299: ifne -> 528
    //   302: aload_0
    //   303: getfield Dne : LQnq;
    //   306: iload_1
    //   307: iload_2
    //   308: iload_3
    //   309: aload_0
    //   310: getfield Dne : I
    //   313: aload_0
    //   314: getfield FWm : I
    //   317: iconst_3
    //   318: invokevirtual FWm : (IIIIII)Z
    //   321: ifeq -> 528
    //   324: getstatic zKP.Dne : [LzKP;
    //   327: aload_0
    //   328: getfield Dne : I
    //   331: aaload
    //   332: instanceof ZgW
    //   335: ifeq -> 363
    //   338: getstatic zKP.Dne : [LzKP;
    //   341: aload_0
    //   342: getfield Dne : I
    //   345: aaload
    //   346: checkcast ZgW
    //   349: aload_0
    //   350: getfield Dne : LQnq;
    //   353: iload_1
    //   354: iload_2
    //   355: iload_3
    //   356: aload_0
    //   357: getfield FWm : I
    //   360: invokevirtual a_ : (LQnq;IIII)V
    //   363: aload_0
    //   364: getfield Dne : LWkD;
    //   367: ifnull -> 663
    //   370: getstatic zKP.Dne : [LzKP;
    //   373: aload_0
    //   374: getfield Dne : I
    //   377: aaload
    //   378: instanceof sCQ
    //   381: ifeq -> 663
    //   384: aload_0
    //   385: getfield Dne : LQnq;
    //   388: iload_1
    //   389: iload_2
    //   390: iload_3
    //   391: invokevirtual Dne : (III)LipD;
    //   394: astore #4
    //   396: aload #4
    //   398: ifnull -> 525
    //   401: new WkD
    //   404: dup
    //   405: invokespecial <init> : ()V
    //   408: astore #5
    //   410: aload #4
    //   412: aload #5
    //   414: invokevirtual FWm : (LWkD;)V
    //   417: aload_0
    //   418: getfield Dne : LWkD;
    //   421: invokevirtual Dne : ()Ljava/util/Collection;
    //   424: invokeinterface iterator : ()Ljava/util/Iterator;
    //   429: astore #6
    //   431: aload #6
    //   433: invokeinterface hasNext : ()Z
    //   438: ifeq -> 513
    //   441: aload #6
    //   443: invokeinterface next : ()Ljava/lang/Object;
    //   448: checkcast oNe
    //   451: astore #7
    //   453: aload #7
    //   455: invokevirtual Dne : ()Ljava/lang/String;
    //   458: ldc_w 'x'
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: ifne -> 510
    //   467: aload #7
    //   469: invokevirtual Dne : ()Ljava/lang/String;
    //   472: ldc_w 'y'
    //   475: invokevirtual equals : (Ljava/lang/Object;)Z
    //   478: ifne -> 510
    //   481: aload #7
    //   483: invokevirtual Dne : ()Ljava/lang/String;
    //   486: ldc_w 'z'
    //   489: invokevirtual equals : (Ljava/lang/Object;)Z
    //   492: ifne -> 510
    //   495: aload #5
    //   497: aload #7
    //   499: invokevirtual Dne : ()Ljava/lang/String;
    //   502: aload #7
    //   504: invokevirtual Dne : ()LoNe;
    //   507: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   510: goto -> 431
    //   513: aload #4
    //   515: aload #5
    //   517: invokevirtual Dne : (LWkD;)V
    //   520: aload #4
    //   522: invokevirtual a_ : ()V
    //   525: goto -> 663
    //   528: aload_0
    //   529: getfield Dne : Z
    //   532: ifeq -> 663
    //   535: aload_0
    //   536: getfield FWm : Z
    //   539: ifne -> 663
    //   542: aload_0
    //   543: new NMq
    //   546: dup
    //   547: aload_0
    //   548: getfield Dne : I
    //   551: iconst_1
    //   552: getstatic zKP.Dne : [LzKP;
    //   555: aload_0
    //   556: getfield Dne : I
    //   559: aaload
    //   560: aload_0
    //   561: getfield FWm : I
    //   564: invokevirtual Dne : (I)I
    //   567: invokespecial <init> : (III)V
    //   570: fconst_0
    //   571: invokevirtual Dne : (LNMq;F)LJiM;
    //   574: pop
    //   575: goto -> 663
    //   578: aload_0
    //   579: getfield bzF : I
    //   582: bipush #100
    //   584: if_icmple -> 609
    //   587: aload_0
    //   588: getfield Dne : LQnq;
    //   591: getfield aFZ : Z
    //   594: ifne -> 609
    //   597: iload_2
    //   598: iconst_1
    //   599: if_icmplt -> 619
    //   602: iload_2
    //   603: sipush #256
    //   606: if_icmpgt -> 619
    //   609: aload_0
    //   610: getfield bzF : I
    //   613: sipush #600
    //   616: if_icmple -> 663
    //   619: aload_0
    //   620: getfield Dne : Z
    //   623: ifeq -> 659
    //   626: aload_0
    //   627: new NMq
    //   630: dup
    //   631: aload_0
    //   632: getfield Dne : I
    //   635: iconst_1
    //   636: getstatic zKP.Dne : [LzKP;
    //   639: aload_0
    //   640: getfield Dne : I
    //   643: aaload
    //   644: aload_0
    //   645: getfield FWm : I
    //   648: invokevirtual Dne : (I)I
    //   651: invokespecial <init> : (III)V
    //   654: fconst_0
    //   655: invokevirtual Dne : (LNMq;F)LJiM;
    //   658: pop
    //   659: aload_0
    //   660: invokevirtual g_ : ()V
    //   663: return
  }
  
  public void FWm(boolean paramBoolean) {
    this.ceE = paramBoolean;
  }
  
  public CiF(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = 2.0F;
    this.Dne = null;
  }
  
  protected void Dne(WkD paramWkD) {
    paramWkD.Dne("Tile", (byte)this.Dne);
    paramWkD.Dne("TileID", this.Dne);
    paramWkD.Dne("Data", (byte)this.FWm);
    paramWkD.Dne("Time", (byte)this.bzF);
    paramWkD.Dne("DropItem", this.Dne);
    paramWkD.Dne("HurtEntities", this.ceE);
    paramWkD.Dne("FallHurtAmount", this.Dne);
    paramWkD.Dne("FallHurtMax", this.Qnq);
    if (this.Dne != null)
      paramWkD.Dne("TileEntityData", this.Dne); 
  }
  
  protected void FWm() {}
  
  public void Dne(Noo paramNoo) {
    super.Dne(paramNoo);
    paramNoo.Dne("Immitating block ID", Integer.valueOf(this.Dne));
    paramNoo.Dne("Immitating block data", Integer.valueOf(this.FWm));
  }
  
  public Qnq Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CiF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */