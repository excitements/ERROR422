import net.minecraft.client.Minecraft;

public class FKB extends FiG {
  public float FWm;
  
  protected Minecraft Dne;
  
  public float Qnq;
  
  public float aFZ;
  
  private lSM Dne;
  
  public float Dne;
  
  public float bzF;
  
  public flF Dne;
  
  private lSM FWm;
  
  public int FWm = 0;
  
  private lSM bzF;
  
  public float zGp;
  
  protected int Dne = 0;
  
  public void div() {
    super.div();
    this.ZfC = this.Dne.Dne;
    this.FYZ = this.Dne.FWm;
    this.oIf = this.Dne.Dne;
    this.bzF = this.Dne;
    this.Qnq = this.FWm;
    this.FWm = (float)(this.FWm + (this.XHL - this.FWm) * 0.5D);
    this.Dne = (float)(this.Dne + (this.mrb - this.Dne) * 0.5D);
  }
  
  public void Dne(lqs paramlqs) {
    this.Dne.Dne(new XGv(this.Dne, paramlqs));
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne.Dne(new juA(this.Dne, this.Dne, paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    super.Dne(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public void a_(int paramInt) {
    int i = XHL() - paramInt;
    if (i <= 0) {
      bzF(paramInt);
      if (i < 0)
        this.div = this.bzF / 2; 
    } else {
      this.cot = i;
      bzF(XHL());
      this.div = this.bzF;
      Dne(zBn.mrb, i);
      this.OdI = this.oIf = 10;
    } 
  }
  
  public void Dne(zio paramzio) {
    this.Dne.Dne(new njX(this.Dne, paramzio));
  }
  
  public iSh Dne() {
    return new iSh(geR.FWm(this.div + 0.5D), geR.FWm(this.IjH + 0.5D), geR.FWm(this.mrb + 0.5D));
  }
  
  private boolean bzF(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: iload_1
    //   5: iload_2
    //   6: iload_3
    //   7: invokevirtual DyG : (III)Z
    //   10: ireturn
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne.Dne(new ThQ(this.Dne, this.Dne, paramInt1, paramInt2, paramInt3));
  }
  
  public boolean aFZ() {
    return (this.Dne.FWm && this.vSL == 0.0D);
  }
  
  public void Dne(NMq paramNMq) {
    dEr dEr = paramNMq.Dne();
    if (dEr == dEr.CLK) {
      this.Dne.Dne(new qTt(this, paramNMq, false));
    } else if (dEr == dEr.Jjb) {
      this.Dne.Dne(new qTt(this, paramNMq, true));
    } 
  }
  
  public void mrb() {
    this.FWm = "http://skins.minecraft.net/MinecraftCloaks/" + vCA.Dne(this.aFZ) + ".png";
  }
  
  public void Dne(RLC paramRLC, int paramInt) {
    if (paramRLC != null)
      if (paramRLC.Dne()) {
        Auk auk = (Auk)paramRLC;
        if (auk.Dne == null || this.Dne.Dne.Dne((Auk)auk.Dne)) {
          if (!this.Dne.Dne.Dne(auk))
            this.Dne.Dne.Dne(auk); 
          this.Dne.Dne.Dne(paramRLC, paramInt);
        } 
      } else {
        this.Dne.Dne.Dne(paramRLC, paramInt);
      }  
  }
  
  public void Dne(ipD paramipD) {
    if (paramipD instanceof AjG) {
      this.Dne.Dne(new MYL((AjG)paramipD));
    } else if (paramipD instanceof FgE) {
      this.Dne.Dne(new Nvw((FgE)paramipD));
    } 
  }
  
  protected boolean Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    int i = geR.FWm(paramDouble1);
    int j = geR.FWm(paramDouble2);
    int k = geR.FWm(paramDouble3);
    double d1 = paramDouble1 - i;
    double d2 = paramDouble3 - k;
    if (bzF(i, j, k) || bzF(i, j + 1, k)) {
      boolean bool1 = (!bzF(i - 1, j, k) && !bzF(i - 1, j + 1, k)) ? true : false;
      boolean bool2 = (!bzF(i + 1, j, k) && !bzF(i + 1, j + 1, k)) ? true : false;
      boolean bool3 = (!bzF(i, j, k - 1) && !bzF(i, j + 1, k - 1)) ? true : false;
      boolean bool4 = (!bzF(i, j, k + 1) && !bzF(i, j + 1, k + 1)) ? true : false;
      byte b = -1;
      double d = 9999.0D;
      if (bool1 && d1 < d) {
        d = d1;
        b = 0;
      } 
      if (bool2 && 1.0D - d1 < d) {
        d = 1.0D - d1;
        b = 1;
      } 
      if (bool3 && d2 < d) {
        d = d2;
        b = 4;
      } 
      if (bool4 && 1.0D - d2 < d) {
        d = 1.0D - d2;
        b = 5;
      } 
      float f = 0.1F;
      if (b == 0)
        this.XHL = -f; 
      if (b == 1)
        this.XHL = f; 
      if (b == 4)
        this.kGO = -f; 
      if (b == 5)
        this.kGO = f; 
    } 
    return false;
  }
  
  public boolean Dne(int paramInt, String paramString) {
    return (paramInt <= 0);
  }
  
  public void Dne(String paramString, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield div : D
    //   8: aload_0
    //   9: getfield IjH : D
    //   12: aload_0
    //   13: getfield udO : F
    //   16: f2d
    //   17: dsub
    //   18: aload_0
    //   19: getfield mrb : D
    //   22: aload_1
    //   23: fload_2
    //   24: fload_3
    //   25: iconst_0
    //   26: invokevirtual Dne : (DDDLjava/lang/String;FFZ)V
    //   29: return
  }
  
  public void a_(boolean paramBoolean) {
    super.a_(paramBoolean);
    this.FWm = paramBoolean ? 600 : 0;
  }
  
  public float a_() {
    float f = 1.0F;
    if (this.Dne.FWm)
      f *= 1.1F; 
    f *= (this.Wwe * mrb() / this.CZC + 1.0F) / 2.0F;
    if (haP() && (FWm()).bzF == ((DsI)dEr.Dne).Qnq) {
      int i = ATE();
      float f1 = i / 20.0F;
      if (f1 > 1.0F) {
        f1 = 1.0F;
      } else {
        f1 *= f1;
      } 
      f *= 1.0F - f1 * 0.15F;
    } 
    return f;
  }
  
  public void Dne(float paramFloat, int paramInt1, int paramInt2) {
    this.iNQ = paramFloat;
    this.mlD = paramInt1;
    this.eHV = paramInt2;
  }
  
  public void Dne(sMa paramsMa, int paramInt) {
    this.Dne.Dne.Dne(new Qnx((Qnq)this.Dne.Dne, paramsMa, this, -0.5F));
  }
  
  public void FWm(sMa paramsMa) {
    zUL zUL = new zUL((Qnq)this.Dne.Dne, paramsMa, "magicCrit");
    this.Dne.Dne.Dne(zUL);
  }
  
  public void Dne(UTs paramUTs) {
    this.Dne.Dne(new zyk(this.Dne, paramUTs));
  }
  
  public void aFZ() {
    super.aFZ();
    this.Dne.Dne((qVZ)null);
  }
  
  public void bzF(String paramString) {
    this.Dne.Dne.Dne().Dne(paramString, new Object[0]);
  }
  
  public void Dne(MqS paramMqS) {
    this.Dne.Dne(new ClL(this.Dne, paramMqS));
  }
  
  public void Dne(YzO paramYzO, String paramString) {
    this.Dne.Dne(new VFk(this.Dne, paramYzO, this.Dne, paramString));
  }
  
  public FKB(Minecraft paramMinecraft, Qnq paramQnq, vwN paramvwN, int paramInt) {
    super(paramQnq);
    this.Dne = new lSM();
    this.FWm = new lSM();
    this.bzF = new lSM();
    this.Dne = paramMinecraft;
    this.qLR = paramInt;
    if (paramvwN != null && paramvwN.Dne != null && paramvwN.Dne.length() > 0)
      this.Dne = "http://skins.minecraft.net/MinecraftSkins/" + vCA.Dne(paramvwN.Dne) + ".png"; 
    this.aFZ = paramvwN.Dne;
    QXI.Dne = null;
  }
  
  public void Dne(Aem paramAem) {
    this.Dne.Dne(new WOS(this.Dne, paramAem));
  }
  
  public NMq Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LMOS;
    //   4: invokevirtual Dne : ()LNMq;
    //   7: areturn
  }
  
  public void Dne(klq paramklq) {
    this.Dne.Dne(new WOS(this.Dne, paramklq));
  }
  
  public void Dne(sMa paramsMa) {
    this.Dne.Dne.Dne(new zUL((Qnq)this.Dne.Dne, paramsMa));
  }
  
  protected boolean Qnq() {
    return true;
  }
  
  public void Dne(TpA paramTpA) {
    this.Dne.Dne(new wiU(this.Dne, paramTpA));
  }
  
  public void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : I
    //   4: ifle -> 29
    //   7: aload_0
    //   8: dup
    //   9: getfield FWm : I
    //   12: iconst_1
    //   13: isub
    //   14: putfield FWm : I
    //   17: aload_0
    //   18: getfield FWm : I
    //   21: ifne -> 29
    //   24: aload_0
    //   25: iconst_0
    //   26: invokevirtual a_ : (Z)V
    //   29: aload_0
    //   30: getfield Dne : I
    //   33: ifle -> 46
    //   36: aload_0
    //   37: dup
    //   38: getfield Dne : I
    //   41: iconst_1
    //   42: isub
    //   43: putfield Dne : I
    //   46: aload_0
    //   47: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   50: getfield Dne : LRJV;
    //   53: invokevirtual Dne : ()Z
    //   56: ifeq -> 111
    //   59: aload_0
    //   60: aload_0
    //   61: ldc2_w 0.5
    //   64: dup2_x1
    //   65: putfield mrb : D
    //   68: putfield div : D
    //   71: aload_0
    //   72: dconst_0
    //   73: putfield div : D
    //   76: aload_0
    //   77: dconst_0
    //   78: putfield mrb : D
    //   81: aload_0
    //   82: aload_0
    //   83: getfield zGp : I
    //   86: i2f
    //   87: ldc_w 12.0
    //   90: fdiv
    //   91: putfield mrb : F
    //   94: aload_0
    //   95: ldc_w 10.0
    //   98: putfield XHL : F
    //   101: aload_0
    //   102: ldc2_w 68.5
    //   105: putfield IjH : D
    //   108: goto -> 953
    //   111: aload_0
    //   112: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   115: getfield Dne : LFkP;
    //   118: getstatic qlg.Dne : LAuk;
    //   121: invokevirtual Dne : (LAuk;)Z
    //   124: ifne -> 140
    //   127: aload_0
    //   128: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   131: getfield Dne : LTsf;
    //   134: getstatic qlg.Dne : LAuk;
    //   137: invokevirtual FWm : (LAuk;)V
    //   140: aload_0
    //   141: aload_0
    //   142: getfield aFZ : F
    //   145: putfield zGp : F
    //   148: aload_0
    //   149: getfield Vxn : Z
    //   152: ifeq -> 248
    //   155: aload_0
    //   156: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   159: getfield Dne : LqVZ;
    //   162: ifnull -> 176
    //   165: aload_0
    //   166: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   169: aconst_null
    //   170: checkcast qVZ
    //   173: invokevirtual Dne : (LqVZ;)V
    //   176: aload_0
    //   177: getfield aFZ : F
    //   180: fconst_0
    //   181: fcmpl
    //   182: ifne -> 214
    //   185: aload_0
    //   186: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   189: getfield Dne : LmKT;
    //   192: ldc_w 'portal.trigger'
    //   195: fconst_1
    //   196: aload_0
    //   197: getfield Dne : Ljava/util/Random;
    //   200: invokevirtual nextFloat : ()F
    //   203: ldc_w 0.4
    //   206: fmul
    //   207: ldc_w 0.8
    //   210: fadd
    //   211: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   214: aload_0
    //   215: dup
    //   216: getfield aFZ : F
    //   219: ldc_w 0.0125
    //   222: fadd
    //   223: putfield aFZ : F
    //   226: aload_0
    //   227: getfield aFZ : F
    //   230: fconst_1
    //   231: fcmpl
    //   232: iflt -> 240
    //   235: aload_0
    //   236: fconst_1
    //   237: putfield aFZ : F
    //   240: aload_0
    //   241: iconst_0
    //   242: putfield Vxn : Z
    //   245: goto -> 337
    //   248: aload_0
    //   249: getstatic SXd.mrb : LSXd;
    //   252: invokevirtual Dne : (LSXd;)Z
    //   255: ifeq -> 302
    //   258: aload_0
    //   259: getstatic SXd.mrb : LSXd;
    //   262: invokevirtual Dne : (LSXd;)LNAx;
    //   265: invokevirtual FWm : ()I
    //   268: bipush #60
    //   270: if_icmple -> 302
    //   273: aload_0
    //   274: dup
    //   275: getfield aFZ : F
    //   278: ldc_w 0.006666667
    //   281: fadd
    //   282: putfield aFZ : F
    //   285: aload_0
    //   286: getfield aFZ : F
    //   289: fconst_1
    //   290: fcmpl
    //   291: ifle -> 337
    //   294: aload_0
    //   295: fconst_1
    //   296: putfield aFZ : F
    //   299: goto -> 337
    //   302: aload_0
    //   303: getfield aFZ : F
    //   306: fconst_0
    //   307: fcmpl
    //   308: ifle -> 323
    //   311: aload_0
    //   312: dup
    //   313: getfield aFZ : F
    //   316: ldc_w 0.05
    //   319: fsub
    //   320: putfield aFZ : F
    //   323: aload_0
    //   324: getfield aFZ : F
    //   327: fconst_0
    //   328: fcmpg
    //   329: ifge -> 337
    //   332: aload_0
    //   333: fconst_0
    //   334: putfield aFZ : F
    //   337: aload_0
    //   338: getfield ooe : I
    //   341: ifle -> 354
    //   344: aload_0
    //   345: dup
    //   346: getfield ooe : I
    //   349: iconst_1
    //   350: isub
    //   351: putfield ooe : I
    //   354: aload_0
    //   355: getfield Dne : LflF;
    //   358: getfield Dne : Z
    //   361: istore_1
    //   362: ldc_w 0.8
    //   365: fstore_2
    //   366: aload_0
    //   367: getfield Dne : LflF;
    //   370: getfield FWm : F
    //   373: fload_2
    //   374: fcmpl
    //   375: iflt -> 382
    //   378: iconst_1
    //   379: goto -> 383
    //   382: iconst_0
    //   383: istore_3
    //   384: aload_0
    //   385: getfield Dne : LflF;
    //   388: invokevirtual Dne : ()V
    //   391: aload_0
    //   392: invokevirtual haP : ()Z
    //   395: ifeq -> 433
    //   398: aload_0
    //   399: getfield Dne : LflF;
    //   402: dup
    //   403: getfield Dne : F
    //   406: ldc_w 0.2
    //   409: fmul
    //   410: putfield Dne : F
    //   413: aload_0
    //   414: getfield Dne : LflF;
    //   417: dup
    //   418: getfield FWm : F
    //   421: ldc_w 0.2
    //   424: fmul
    //   425: putfield FWm : F
    //   428: aload_0
    //   429: iconst_0
    //   430: putfield Dne : I
    //   433: aload_0
    //   434: getfield Dne : LflF;
    //   437: getfield FWm : Z
    //   440: ifeq -> 461
    //   443: aload_0
    //   444: getfield EyB : F
    //   447: ldc_w 0.2
    //   450: fcmpg
    //   451: ifge -> 461
    //   454: aload_0
    //   455: ldc_w 0.2
    //   458: putfield EyB : F
    //   461: aload_0
    //   462: aload_0
    //   463: getfield div : D
    //   466: aload_0
    //   467: getfield ooe : F
    //   470: f2d
    //   471: ldc2_w 0.35
    //   474: dmul
    //   475: dsub
    //   476: aload_0
    //   477: getfield Dne : LbSp;
    //   480: getfield FWm : D
    //   483: ldc2_w 0.5
    //   486: dadd
    //   487: aload_0
    //   488: getfield mrb : D
    //   491: aload_0
    //   492: getfield ooe : F
    //   495: f2d
    //   496: ldc2_w 0.35
    //   499: dmul
    //   500: dadd
    //   501: invokevirtual Dne : (DDD)Z
    //   504: pop
    //   505: aload_0
    //   506: aload_0
    //   507: getfield div : D
    //   510: aload_0
    //   511: getfield ooe : F
    //   514: f2d
    //   515: ldc2_w 0.35
    //   518: dmul
    //   519: dsub
    //   520: aload_0
    //   521: getfield Dne : LbSp;
    //   524: getfield FWm : D
    //   527: ldc2_w 0.5
    //   530: dadd
    //   531: aload_0
    //   532: getfield mrb : D
    //   535: aload_0
    //   536: getfield ooe : F
    //   539: f2d
    //   540: ldc2_w 0.35
    //   543: dmul
    //   544: dsub
    //   545: invokevirtual Dne : (DDD)Z
    //   548: pop
    //   549: aload_0
    //   550: aload_0
    //   551: getfield div : D
    //   554: aload_0
    //   555: getfield ooe : F
    //   558: f2d
    //   559: ldc2_w 0.35
    //   562: dmul
    //   563: dadd
    //   564: aload_0
    //   565: getfield Dne : LbSp;
    //   568: getfield FWm : D
    //   571: ldc2_w 0.5
    //   574: dadd
    //   575: aload_0
    //   576: getfield mrb : D
    //   579: aload_0
    //   580: getfield ooe : F
    //   583: f2d
    //   584: ldc2_w 0.35
    //   587: dmul
    //   588: dsub
    //   589: invokevirtual Dne : (DDD)Z
    //   592: pop
    //   593: aload_0
    //   594: aload_0
    //   595: getfield div : D
    //   598: aload_0
    //   599: getfield ooe : F
    //   602: f2d
    //   603: ldc2_w 0.35
    //   606: dmul
    //   607: dadd
    //   608: aload_0
    //   609: getfield Dne : LbSp;
    //   612: getfield FWm : D
    //   615: ldc2_w 0.5
    //   618: dadd
    //   619: aload_0
    //   620: getfield mrb : D
    //   623: aload_0
    //   624: getfield ooe : F
    //   627: f2d
    //   628: ldc2_w 0.35
    //   631: dmul
    //   632: dadd
    //   633: invokevirtual Dne : (DDD)Z
    //   636: pop
    //   637: aload_0
    //   638: invokevirtual Dne : ()LSCY;
    //   641: invokevirtual Dne : ()I
    //   644: i2f
    //   645: ldc_w 6.0
    //   648: fcmpl
    //   649: ifgt -> 662
    //   652: aload_0
    //   653: getfield Dne : Luqg;
    //   656: getfield bzF : Z
    //   659: ifeq -> 666
    //   662: iconst_1
    //   663: goto -> 667
    //   666: iconst_0
    //   667: istore #4
    //   669: aload_0
    //   670: getfield aFZ : Z
    //   673: ifeq -> 747
    //   676: iload_3
    //   677: ifne -> 747
    //   680: aload_0
    //   681: getfield Dne : LflF;
    //   684: getfield FWm : F
    //   687: fload_2
    //   688: fcmpl
    //   689: iflt -> 747
    //   692: aload_0
    //   693: invokevirtual ATE : ()Z
    //   696: ifne -> 747
    //   699: iload #4
    //   701: ifeq -> 747
    //   704: aload_0
    //   705: invokevirtual haP : ()Z
    //   708: ifne -> 747
    //   711: aload_0
    //   712: getstatic SXd.trS : LSXd;
    //   715: invokevirtual Dne : (LSXd;)Z
    //   718: ifne -> 747
    //   721: aload_0
    //   722: getfield Dne : I
    //   725: ifne -> 737
    //   728: aload_0
    //   729: bipush #7
    //   731: putfield Dne : I
    //   734: goto -> 747
    //   737: aload_0
    //   738: iconst_1
    //   739: invokevirtual a_ : (Z)V
    //   742: aload_0
    //   743: iconst_0
    //   744: putfield Dne : I
    //   747: aload_0
    //   748: invokevirtual aFZ : ()Z
    //   751: ifeq -> 759
    //   754: aload_0
    //   755: iconst_0
    //   756: putfield Dne : I
    //   759: aload_0
    //   760: invokevirtual ATE : ()Z
    //   763: ifeq -> 795
    //   766: aload_0
    //   767: getfield Dne : LflF;
    //   770: getfield FWm : F
    //   773: fload_2
    //   774: fcmpg
    //   775: iflt -> 790
    //   778: aload_0
    //   779: getfield zGp : Z
    //   782: ifne -> 790
    //   785: iload #4
    //   787: ifne -> 795
    //   790: aload_0
    //   791: iconst_0
    //   792: invokevirtual a_ : (Z)V
    //   795: aload_0
    //   796: getfield Dne : Luqg;
    //   799: getfield bzF : Z
    //   802: ifeq -> 866
    //   805: iload_1
    //   806: ifne -> 866
    //   809: aload_0
    //   810: getfield Dne : LflF;
    //   813: getfield Dne : Z
    //   816: ifeq -> 866
    //   819: aload_0
    //   820: getfield One : I
    //   823: ifne -> 835
    //   826: aload_0
    //   827: bipush #7
    //   829: putfield One : I
    //   832: goto -> 866
    //   835: aload_0
    //   836: getfield Dne : Luqg;
    //   839: aload_0
    //   840: getfield Dne : Luqg;
    //   843: getfield FWm : Z
    //   846: ifne -> 853
    //   849: iconst_1
    //   850: goto -> 854
    //   853: iconst_0
    //   854: putfield FWm : Z
    //   857: aload_0
    //   858: invokevirtual DyG : ()V
    //   861: aload_0
    //   862: iconst_0
    //   863: putfield One : I
    //   866: aload_0
    //   867: getfield Dne : Luqg;
    //   870: getfield FWm : Z
    //   873: ifeq -> 920
    //   876: aload_0
    //   877: getfield Dne : LflF;
    //   880: getfield FWm : Z
    //   883: ifeq -> 898
    //   886: aload_0
    //   887: dup
    //   888: getfield Zpi : D
    //   891: ldc2_w 0.15
    //   894: dsub
    //   895: putfield Zpi : D
    //   898: aload_0
    //   899: getfield Dne : LflF;
    //   902: getfield Dne : Z
    //   905: ifeq -> 920
    //   908: aload_0
    //   909: dup
    //   910: getfield Zpi : D
    //   913: ldc2_w 0.15
    //   916: dadd
    //   917: putfield Zpi : D
    //   920: aload_0
    //   921: invokespecial IjH : ()V
    //   924: aload_0
    //   925: getfield aFZ : Z
    //   928: ifeq -> 953
    //   931: aload_0
    //   932: getfield Dne : Luqg;
    //   935: getfield FWm : Z
    //   938: ifeq -> 953
    //   941: aload_0
    //   942: getfield Dne : Luqg;
    //   945: iconst_0
    //   946: putfield FWm : Z
    //   949: aload_0
    //   950: invokevirtual DyG : ()V
    //   953: return
  }
  
  public void Dne(String paramString) {
    this.Dne.Dne.Dne().Dne(paramString);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    this.Dne.Dne(new IfV(this.Dne, this.Dne, paramInt1, paramInt2, paramInt3, paramString));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FKB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */