import java.util.Collection;
import java.util.List;
import java.util.Random;

public abstract class FiG extends FUH implements gnI {
  public double RPx;
  
  private NMq Dne;
  
  public double FfS;
  
  public Pdb FWm;
  
  public float exS;
  
  protected boolean vSL;
  
  private iSh FWm;
  
  protected SCY Dne;
  
  public float iNQ;
  
  private fTB Dne;
  
  public cQz Dne;
  
  private boolean Dne;
  
  protected int One;
  
  public double vSL;
  
  public float JLG;
  
  public int eHV;
  
  public float IYC;
  
  public iSh Dne;
  
  private iSh bzF;
  
  public float xXN;
  
  public double oIf;
  
  public double OdI;
  
  private int Dne;
  
  public MOS Dne;
  
  private int EWz;
  
  public String aFZ;
  
  private int FWm;
  
  protected float CZC;
  
  public float YHU;
  
  public int ZgS;
  
  public uqg Dne;
  
  public double EyB;
  
  public int mlD;
  
  public byte Dne;
  
  protected float LoG;
  
  public Pdb Dne = (Pdb)new MOS(this);
  
  protected boolean Fnk() {
    return true;
  }
  
  public void Dne(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    Dne(0.6F, 1.8F);
    zGp();
    Pdb pdb1 = this.Dne;
    Pdb pdb2 = this.Dne;
    if (pdb1 != null && this.Dne.Dne(((iSh)pdb1).Dne, ((iSh)pdb1).FWm, ((iSh)pdb1).bzF) == zKP.FfS.FWm) {
      rTW.Dne((Qnq)this.Dne, ((iSh)pdb1).Dne, ((iSh)pdb1).FWm, ((iSh)pdb1).bzF, false);
      iSh iSh1 = rTW.Dne((Qnq)this.Dne, ((iSh)pdb1).Dne, ((iSh)pdb1).FWm, ((iSh)pdb1).bzF, 0);
      if (iSh1 == null)
        iSh1 = new iSh(((iSh)pdb1).Dne, ((iSh)pdb1).FWm + 1, ((iSh)pdb1).bzF); 
      bzF((iSh1.Dne + 0.5F), (iSh1.FWm + this.udO + 0.1F), (iSh1.bzF + 0.5F));
    } 
    this.vSL = false;
    if (((Qnq)this.Dne).aFZ == null && paramBoolean2)
      this.Dne.XHL(); 
    if (paramBoolean1) {
      this.Dne = false;
    } else {
      this.Dne = 100;
    } 
    if (paramBoolean3)
      Dne((iSh)this.Dne, false); 
  }
  
  protected void One() {
    super.One();
    Dne(trP.trS, 1);
    if (ATE()) {
      aFZ(0.8F);
    } else {
      aFZ(0.2F);
    } 
  }
  
  public void Dne(MqS paramMqS) {}
  
  public void DyG() {}
  
  public int ceE() {
    return this.Dne;
  }
  
  private boolean FYZ() {
    return (this.Dne.Dne(((iSh)this.Dne).Dne, ((iSh)this.Dne).FWm, ((iSh)this.Dne).bzF) == zKP.FfS.FWm);
  }
  
  public boolean Dne(zKP paramzKP) {
    return this.Dne.Dne(paramzKP);
  }
  
  protected void FWm(NMq paramNMq, int paramInt) {
    if (paramNMq.Dne() == een.bzF)
      Dne("random.drink", 0.5F, ((Qnq)this.Dne).Dne.nextFloat() * 0.1F + 0.9F); 
    if (paramNMq.Dne() == een.FWm) {
      for (byte b = 0; b < paramInt; b++) {
        chN chN1 = this.Dne.Dne().Dne((this.Dne.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
        chN1.Dne(-this.XHL * 3.1415927F / 180.0F);
        chN1.FWm(-this.mrb * 3.1415927F / 180.0F);
        chN chN2 = this.Dne.Dne().Dne((this.Dne.nextFloat() - 0.5D) * 0.3D, -this.Dne.nextFloat() * 0.6D - 0.3D, 0.6D);
        chN2.Dne(-this.XHL * 3.1415927F / 180.0F);
        chN2.FWm(-this.mrb * 3.1415927F / 180.0F);
        chN2 = chN2.bzF(this.div, this.IjH + c_(), this.mrb);
        this.Dne.Dne("iconcrack_" + (paramNMq.Dne()).Qnq, chN2.Dne, chN2.FWm, chN2.bzF, chN1.Dne, chN1.FWm + 0.05D, chN1.bzF);
      } 
      Dne("random.eat", 0.5F + 0.5F * this.Dne.nextInt(2), (this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.2F + 1.0F);
    } 
  }
  
  public String aFZ() {
    return YGE.Dne(Dne(), this.aFZ);
  }
  
  public void Dne(FUH paramFUH) {
    if (paramFUH instanceof ZFz)
      Dne(qlg.udO); 
  }
  
  public void Dne(zio paramzio) {}
  
  public boolean b_() {
    return false;
  }
  
  public void FWm(sMa paramsMa, int paramInt) {
    udO(paramInt);
    Collection collection = Dne().Dne(PAf.Qnq);
    if (paramsMa instanceof FiG) {
      Dne(trP.FfS, 1);
      collection.addAll(Dne().Dne(PAf.bzF));
    } else {
      Dne(trP.EyB, 1);
    } 
    for (vfE vfE : collection) {
      OHz oHz = Dne().Dne(Dne(), vfE);
      oHz.Dne();
    } 
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual EyB : ()Z
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield Dne : Luqg;
    //   13: getfield Dne : Z
    //   16: ifeq -> 28
    //   19: aload_1
    //   20: invokevirtual Qnq : ()Z
    //   23: ifne -> 28
    //   26: iconst_0
    //   27: ireturn
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield Wwe : I
    //   33: aload_0
    //   34: invokevirtual XHL : ()I
    //   37: ifgt -> 42
    //   40: iconst_0
    //   41: ireturn
    //   42: aload_0
    //   43: invokevirtual Wwe : ()Z
    //   46: ifeq -> 66
    //   49: aload_0
    //   50: getfield Dne : LQnq;
    //   53: getfield aFZ : Z
    //   56: ifne -> 66
    //   59: aload_0
    //   60: iconst_1
    //   61: iconst_1
    //   62: iconst_0
    //   63: invokevirtual Dne : (ZZZ)V
    //   66: aload_1
    //   67: invokevirtual zGp : ()Z
    //   70: ifeq -> 117
    //   73: aload_0
    //   74: getfield Dne : LQnq;
    //   77: getfield aFZ : I
    //   80: ifne -> 83
    //   83: aload_0
    //   84: getfield Dne : LQnq;
    //   87: getfield aFZ : I
    //   90: iconst_1
    //   91: if_icmpne -> 100
    //   94: iload_2
    //   95: iconst_2
    //   96: idiv
    //   97: iconst_1
    //   98: iadd
    //   99: istore_2
    //   100: aload_0
    //   101: getfield Dne : LQnq;
    //   104: getfield aFZ : I
    //   107: iconst_3
    //   108: if_icmpne -> 117
    //   111: iload_2
    //   112: iconst_3
    //   113: imul
    //   114: iconst_2
    //   115: idiv
    //   116: istore_2
    //   117: iload_2
    //   118: ifne -> 123
    //   121: iconst_0
    //   122: ireturn
    //   123: aload_1
    //   124: invokevirtual FWm : ()LsMa;
    //   127: astore_3
    //   128: aload_3
    //   129: instanceof hhc
    //   132: ifeq -> 153
    //   135: aload_3
    //   136: checkcast hhc
    //   139: getfield bzF : LsMa;
    //   142: ifnull -> 153
    //   145: aload_3
    //   146: checkcast hhc
    //   149: getfield bzF : LsMa;
    //   152: astore_3
    //   153: aload_3
    //   154: instanceof FUH
    //   157: ifeq -> 169
    //   160: aload_0
    //   161: aload_3
    //   162: checkcast FUH
    //   165: iconst_0
    //   166: invokevirtual Dne : (LFUH;Z)V
    //   169: aload_0
    //   170: getstatic trP.Vxn : LRLC;
    //   173: iload_2
    //   174: invokevirtual Dne : (LRLC;I)V
    //   177: aload_0
    //   178: aload_1
    //   179: iload_2
    //   180: invokespecial Dne : (LzBn;I)Z
    //   183: ireturn
  }
  
  public int Dne() {
    return 20;
  }
  
  public int EyB() {
    return (this.eHV >= 30) ? (62 + (this.eHV - 30) * 7) : ((this.eHV >= 15) ? (17 + (this.eHV - 15) * 3) : 17);
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, NMq paramNMq) {
    return ((uqg)this.Dne).aFZ ? true : ((paramNMq != null) ? paramNMq.mrb() : false);
  }
  
  protected int Dne(FiG paramFiG) {
    if (this.Dne.Dne().Dne("keepInventory"))
      return 0; 
    int i = this.eHV * 7;
    return (i > 100) ? 100 : i;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    mbZ mbZ = paramWkD.Dne("Inventory");
    this.Dne.Dne(mbZ);
    ((MOS)this.Dne).Dne = paramWkD.Dne("SelectedItemSlot");
    this.vSL = paramWkD.FWm("Sleeping");
    this.Dne = paramWkD.Dne("SleepTimer");
    this.iNQ = paramWkD.Dne("XpP");
    this.eHV = paramWkD.Dne("XpLevel");
    this.mlD = paramWkD.Dne("XpTotal");
    kGO(paramWkD.Dne("Score"));
    if (this.vSL != 0.0D) {
      this.Dne = (Pdb)new iSh(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb));
      Dne(true, true, false);
    } 
    if (paramWkD.Dne("SpawnX") && paramWkD.Dne("SpawnY") && paramWkD.Dne("SpawnZ")) {
      this.FWm = new iSh(paramWkD.Dne("SpawnX"), paramWkD.Dne("SpawnY"), paramWkD.Dne("SpawnZ"));
      this.Dne = paramWkD.FWm("SpawnForced");
    } 
    this.Dne.Dne(paramWkD);
    this.Dne.FWm(paramWkD);
    if (paramWkD.Dne("EnderItems")) {
      mbZ mbZ1 = paramWkD.Dne("EnderItems");
      this.Dne.Dne(mbZ1);
    } 
  }
  
  public void Dne(YzO paramYzO, String paramString) {}
  
  public int Vxn() {
    return this.Dne.Dne(18);
  }
  
  public float c_() {
    return 0.12F;
  }
  
  public void FWm(sMa paramsMa) {}
  
  public void Qnq() {}
  
  public void Dne(UTs paramUTs) {}
  
  public void Dne(FiG paramFiG, boolean paramBoolean) {
    if (paramBoolean) {
      this.Dne.Dne((MOS)paramFiG.Dne);
      this.Vxn = paramFiG.Vxn;
      this.Dne = paramFiG.Dne;
      this.eHV = paramFiG.eHV;
      this.mlD = paramFiG.mlD;
      this.iNQ = paramFiG.iNQ;
      kGO(paramFiG.Vxn());
      this.ATE = paramFiG.ATE;
    } else if (this.Dne.Dne().Dne("keepInventory")) {
      this.Dne.Dne((MOS)paramFiG.Dne);
      this.eHV = paramFiG.eHV;
      this.mlD = paramFiG.mlD;
      this.iNQ = paramFiG.iNQ;
      kGO(paramFiG.Vxn());
    } 
    this.Dne = paramFiG.Dne;
  }
  
  public boolean ICU() {
    return (XHL() > 0 && XHL() < Dne());
  }
  
  public void ATE() {
    this.udO = 1.62F;
    Dne(0.6F, 1.8F);
    super.ATE();
    bzF(Dne());
    this.vSL = false;
  }
  
  public JiM Dne(boolean paramBoolean) {
    return Dne(this.Dne.Dne(((MOS)this.Dne).Dne, (paramBoolean && this.Dne.Dne() != null) ? (this.Dne.Dne()).Dne : 1), false);
  }
  
  public void Dne(Aem paramAem) {}
  
  public boolean FWm(int paramInt1, int paramInt2, int paramInt3) {
    if (((uqg)this.Dne).aFZ)
      return true; 
    int i = this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    if (i > 0) {
      dNT dNT = zKP.Dne[i];
      if (dNT.Dne.IjH())
        return true; 
      if (bzF() != null) {
        NMq nMq = bzF();
        if (nMq.Dne(dNT) || nMq.Dne(dNT) > 1.0F)
          return true; 
      } 
    } 
    return false;
  }
  
  public int Zpi() {
    return this.Dne.bzF();
  }
  
  public boolean FWm(FiG paramFiG) {
    if (!Vxn())
      return false; 
    YGE yGE = Dne();
    return (yGE == null || paramFiG == null || paramFiG.Dne() != yGE || !yGE.FWm());
  }
  
  public String Dne() {
    return this.aFZ;
  }
  
  public void ZfC() {
    if (this.Dne != null)
      this.Dne.FWm((Qnq)this.Dne, this, this.FWm); 
    FYZ();
  }
  
  public void Dne(NMq paramNMq, int paramInt) {
    if (paramNMq != this.Dne) {
      this.Dne = (Pdb)paramNMq;
      this.FWm = paramInt;
      if (((Qnq)this.Dne).aFZ == null)
        aFZ(true); 
    } 
  }
  
  public String a_() {
    return this.aFZ;
  }
  
  public boolean eHV() {
    return super.eHV();
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, String paramString) {}
  
  protected boolean FWm() {
    return !((uqg)this.Dne).FWm;
  }
  
  public void Dne(String paramString, float paramFloat1, float paramFloat2) {
    this.Dne.Dne(this, paramString, paramFloat1, paramFloat2);
  }
  
  public NSR Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (((Qnq)this.Dne).aFZ == null) {
      if (Wwe() || !udO())
        return NSR.aFZ; 
      if (!((Qnq)this.Dne).Dne.Dne())
        return NSR.FWm; 
      if (this.Dne.Dne())
        return NSR.bzF; 
      if (Math.abs(this.div - paramInt1) > 3.0D || Math.abs(this.IjH - paramInt2) > 2.0D || Math.abs(this.mrb - paramInt3) > 3.0D)
        return NSR.Qnq; 
      double d1 = 8.0D;
      double d2 = 5.0D;
      List list = this.Dne.Dne(LHi.class, bSp.Dne().Dne(paramInt1 - d1, paramInt2 - d2, paramInt3 - d1, paramInt1 + d1, paramInt2 + d2, paramInt3 + d1));
      if (!list.isEmpty())
        return NSR.zGp; 
    } 
    Dne(0.2F, 0.2F);
    this.udO = 0.2F;
    if (this.Dne.bzF(paramInt1, paramInt2, paramInt3)) {
      int i = this.Dne.bzF(paramInt1, paramInt2, paramInt3);
      int j = rTW.Qnq(i);
      float f1 = 0.5F;
      float f2 = 0.5F;
      switch (j) {
        case 0:
          f2 = 0.9F;
          break;
        case 1:
          f1 = 0.1F;
          break;
        case 2:
          f2 = 0.1F;
          break;
        case 3:
          f1 = 0.9F;
          break;
      } 
      trS(j);
      bzF((paramInt1 + f1), (paramInt2 + 0.9375F), (paramInt3 + f2));
    } else {
      bzF((paramInt1 + 0.5F), (paramInt2 + 0.9375F), (paramInt3 + 0.5F));
    } 
    this.vSL = true;
    this.Dne = false;
    this.Dne = (Pdb)new iSh(paramInt1, paramInt2, paramInt3);
    this.kGO = this.Zpi = 0.0D;
    (this.Zpi = 0.0D).XHL = this;
    if (((Qnq)this.Dne).aFZ == null)
      this.Dne.XHL(); 
    return NSR.Dne;
  }
  
  public NMq FWm() {
    return (NMq)this.Dne;
  }
  
  public boolean qrB() {
    return (this.vSL != 0.0D && this.Dne >= 100);
  }
  
  public boolean Dne(FiG paramFiG) {
    YGE yGE1 = Dne();
    YGE yGE2 = paramFiG.Dne();
    return (yGE1 != yGE2) ? true : ((yGE1 != null) ? yGE1.Dne() : true);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LNMq;
    //   4: ifnull -> 82
    //   7: aload_0
    //   8: getfield Dne : LMOS;
    //   11: invokevirtual Dne : ()LNMq;
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: getfield Dne : LNMq;
    //   20: if_acmpne -> 78
    //   23: aload_0
    //   24: getfield FWm : I
    //   27: bipush #25
    //   29: if_icmpgt -> 47
    //   32: aload_0
    //   33: getfield FWm : I
    //   36: iconst_4
    //   37: irem
    //   38: ifne -> 47
    //   41: aload_0
    //   42: aload_1
    //   43: iconst_5
    //   44: invokevirtual FWm : (LNMq;I)V
    //   47: aload_0
    //   48: dup
    //   49: getfield FWm : I
    //   52: iconst_1
    //   53: isub
    //   54: dup_x1
    //   55: putfield FWm : I
    //   58: ifne -> 82
    //   61: aload_0
    //   62: getfield Dne : LQnq;
    //   65: getfield aFZ : Z
    //   68: ifne -> 82
    //   71: aload_0
    //   72: invokevirtual qLR : ()V
    //   75: goto -> 82
    //   78: aload_0
    //   79: invokevirtual FYZ : ()V
    //   82: aload_0
    //   83: getfield ZgS : I
    //   86: ifle -> 99
    //   89: aload_0
    //   90: dup
    //   91: getfield ZgS : I
    //   94: iconst_1
    //   95: isub
    //   96: putfield ZgS : I
    //   99: aload_0
    //   100: invokevirtual Wwe : ()Z
    //   103: ifeq -> 178
    //   106: aload_0
    //   107: dup
    //   108: getfield Dne : I
    //   111: iconst_1
    //   112: iadd
    //   113: putfield Dne : I
    //   116: aload_0
    //   117: getfield Dne : I
    //   120: bipush #100
    //   122: if_icmple -> 131
    //   125: aload_0
    //   126: bipush #100
    //   128: putfield Dne : I
    //   131: aload_0
    //   132: getfield Dne : LQnq;
    //   135: getfield aFZ : Z
    //   138: ifne -> 209
    //   141: aload_0
    //   142: invokespecial FYZ : ()Z
    //   145: ifne -> 158
    //   148: aload_0
    //   149: iconst_1
    //   150: iconst_1
    //   151: iconst_0
    //   152: invokevirtual Dne : (ZZZ)V
    //   155: goto -> 209
    //   158: aload_0
    //   159: getfield Dne : LQnq;
    //   162: invokevirtual Dne : ()Z
    //   165: ifeq -> 209
    //   168: aload_0
    //   169: iconst_0
    //   170: iconst_1
    //   171: iconst_1
    //   172: invokevirtual Dne : (ZZZ)V
    //   175: goto -> 209
    //   178: aload_0
    //   179: getfield Dne : I
    //   182: ifle -> 209
    //   185: aload_0
    //   186: dup
    //   187: getfield Dne : I
    //   190: iconst_1
    //   191: iadd
    //   192: putfield Dne : I
    //   195: aload_0
    //   196: getfield Dne : I
    //   199: bipush #110
    //   201: if_icmplt -> 209
    //   204: aload_0
    //   205: iconst_0
    //   206: putfield Dne : I
    //   209: aload_0
    //   210: invokespecial Dne : ()V
    //   213: aload_0
    //   214: getfield Dne : LQnq;
    //   217: getfield aFZ : Z
    //   220: ifne -> 253
    //   223: aload_0
    //   224: getfield FWm : LPdb;
    //   227: ifnull -> 253
    //   230: aload_0
    //   231: getfield FWm : LPdb;
    //   234: aload_0
    //   235: invokevirtual Dne : (LFiG;)Z
    //   238: ifne -> 253
    //   241: aload_0
    //   242: invokevirtual aFZ : ()V
    //   245: aload_0
    //   246: aload_0
    //   247: getfield Dne : LPdb;
    //   250: putfield FWm : LPdb;
    //   253: aload_0
    //   254: invokevirtual trS : ()Z
    //   257: ifeq -> 274
    //   260: aload_0
    //   261: getfield Dne : Luqg;
    //   264: getfield Dne : Z
    //   267: ifeq -> 274
    //   270: aload_0
    //   271: invokevirtual EyB : ()V
    //   274: aload_0
    //   275: aload_0
    //   276: getfield oIf : D
    //   279: putfield EyB : D
    //   282: aload_0
    //   283: aload_0
    //   284: getfield vSL : D
    //   287: putfield FfS : D
    //   290: aload_0
    //   291: aload_0
    //   292: getfield RPx : D
    //   295: putfield OdI : D
    //   298: aload_0
    //   299: getfield div : D
    //   302: aload_0
    //   303: getfield oIf : D
    //   306: dsub
    //   307: dstore_1
    //   308: aload_0
    //   309: getfield IjH : D
    //   312: aload_0
    //   313: getfield vSL : D
    //   316: dsub
    //   317: dstore_3
    //   318: aload_0
    //   319: getfield mrb : D
    //   322: aload_0
    //   323: getfield RPx : D
    //   326: dsub
    //   327: dstore #5
    //   329: ldc2_w 10.0
    //   332: dstore #7
    //   334: dload_1
    //   335: dload #7
    //   337: dcmpl
    //   338: ifle -> 354
    //   341: aload_0
    //   342: aload_0
    //   343: aload_0
    //   344: getfield div : D
    //   347: dup2_x1
    //   348: putfield oIf : D
    //   351: putfield EyB : D
    //   354: dload #5
    //   356: dload #7
    //   358: dcmpl
    //   359: ifle -> 375
    //   362: aload_0
    //   363: aload_0
    //   364: aload_0
    //   365: getfield mrb : D
    //   368: dup2_x1
    //   369: putfield RPx : D
    //   372: putfield OdI : D
    //   375: dload_3
    //   376: dload #7
    //   378: dcmpl
    //   379: ifle -> 395
    //   382: aload_0
    //   383: aload_0
    //   384: aload_0
    //   385: getfield IjH : D
    //   388: dup2_x1
    //   389: putfield vSL : D
    //   392: putfield FfS : D
    //   395: dload_1
    //   396: dload #7
    //   398: dneg
    //   399: dcmpg
    //   400: ifge -> 416
    //   403: aload_0
    //   404: aload_0
    //   405: aload_0
    //   406: getfield div : D
    //   409: dup2_x1
    //   410: putfield oIf : D
    //   413: putfield EyB : D
    //   416: dload #5
    //   418: dload #7
    //   420: dneg
    //   421: dcmpg
    //   422: ifge -> 438
    //   425: aload_0
    //   426: aload_0
    //   427: aload_0
    //   428: getfield mrb : D
    //   431: dup2_x1
    //   432: putfield RPx : D
    //   435: putfield OdI : D
    //   438: dload_3
    //   439: dload #7
    //   441: dneg
    //   442: dcmpg
    //   443: ifge -> 459
    //   446: aload_0
    //   447: aload_0
    //   448: aload_0
    //   449: getfield IjH : D
    //   452: dup2_x1
    //   453: putfield vSL : D
    //   456: putfield FfS : D
    //   459: aload_0
    //   460: dup
    //   461: getfield oIf : D
    //   464: dload_1
    //   465: ldc2_w 0.25
    //   468: dmul
    //   469: dadd
    //   470: putfield oIf : D
    //   473: aload_0
    //   474: dup
    //   475: getfield RPx : D
    //   478: dload #5
    //   480: ldc2_w 0.25
    //   483: dmul
    //   484: dadd
    //   485: putfield RPx : D
    //   488: aload_0
    //   489: dup
    //   490: getfield vSL : D
    //   493: dload_3
    //   494: ldc2_w 0.25
    //   497: dmul
    //   498: dadd
    //   499: putfield vSL : D
    //   502: aload_0
    //   503: getstatic trP.zGp : LRLC;
    //   506: iconst_1
    //   507: invokevirtual Dne : (LRLC;I)V
    //   510: aload_0
    //   511: getfield FWm : LsMa;
    //   514: ifnonnull -> 522
    //   517: aload_0
    //   518: aconst_null
    //   519: putfield bzF : LiSh;
    //   522: aload_0
    //   523: getfield Dne : LQnq;
    //   526: getfield aFZ : Z
    //   529: ifne -> 540
    //   532: aload_0
    //   533: getfield Dne : LSCY;
    //   536: aload_0
    //   537: invokevirtual Dne : (LFiG;)V
    //   540: return
  }
  
  public void vSL() {
    float f1 = this.div;
    float f2 = this.IjH;
    float f3 = this.mrb;
    float f4 = this.mrb;
    int i = this.XHL;
    super.vSL();
    this.xXN = this.IYC;
    this.IYC = 0.0F;
    DyG(this.div - f1, this.IjH - f2, this.mrb - f3);
    if (this.FWm instanceof fNv) {
      this.XHL = i;
      this.mrb = f4;
      this.IjH = ((fNv)this.FWm).IjH;
    } 
  }
  
  public JiM Dne(NMq paramNMq) {
    return Dne(paramNMq, false);
  }
  
  public NMq[] Dne() {
    return ((MOS)this.Dne).FWm;
  }
  
  public boolean ooe() {
    return (this.vSL == 0.0D && super.ooe());
  }
  
  public boolean haP() {
    return (this.Dne != null);
  }
  
  protected boolean qXo() {
    return (XHL() <= 0 || Wwe());
  }
  
  public float XHL() {
    byte b = 0;
    for (NMq nMq : ((MOS)this.Dne).FWm) {
      if (nMq != null)
        b++; 
    } 
    return b / ((MOS)this.Dne).FWm.length;
  }
  
  public boolean oIf() {
    return !((uqg)this.Dne).FWm;
  }
  
  public irb Dne() {
    return irb.Dne();
  }
  
  protected void FWm(int paramInt, boolean paramBoolean) {
    byte b = this.Dne.Dne(16);
    if (paramBoolean) {
      this.Dne.FWm(16, Byte.valueOf((byte)(b | 1 << paramInt)));
    } else {
      this.Dne.FWm(16, Byte.valueOf((byte)(b & (1 << paramInt ^ 0xFFFFFFFF))));
    } 
  }
  
  public void IjH(sMa paramsMa) {
    if (paramsMa.bzF() && !paramsMa.FWm(this)) {
      int i = this.Dne.Dne(paramsMa);
      if (Dne(SXd.zGp))
        i += 3 << Dne(SXd.zGp).bzF(); 
      if (Dne(SXd.Vxn))
        i -= 2 << Dne(SXd.Vxn).bzF(); 
      int j = 0;
      int k = 0;
      if (paramsMa instanceof FUH) {
        k = UYp.Dne(this, (FUH)paramsMa);
        j += UYp.FWm(this, (FUH)paramsMa);
      } 
      if (ATE())
        j++; 
      if (i > 0 || k > 0) {
        boolean bool1 = (this.ceE > 0.0F && this.aFZ == null && !div() && !Zpi() && !Dne(SXd.trS) && this.FWm == null && paramsMa instanceof FUH) ? true : false;
        if (bool1 && i > 0)
          i += this.Dne.nextInt(i / 2 + 2); 
        i += k;
        boolean bool2 = false;
        int m = UYp.Dne(this);
        if (paramsMa instanceof FUH && m > 0 && !paramsMa.trS()) {
          bool2 = true;
          paramsMa.aFZ(1);
        } 
        boolean bool = paramsMa.Dne(zBn.Dne(this), i);
        if (bool) {
          if (j > 0) {
            paramsMa.Qnq((-geR.Dne(this.mrb * 3.1415927F / 180.0F) * j * 0.5F), 0.1D, (geR.FWm(this.mrb * 3.1415927F / 180.0F) * j * 0.5F));
            this.XHL *= 0.6D;
            this.kGO *= 0.6D;
            a_(false);
          } 
          if (bool1)
            Dne(paramsMa); 
          if (k > 0)
            FWm(paramsMa); 
          if (i >= 18)
            Dne(qlg.RPx); 
          DyG(paramsMa);
          if (paramsMa instanceof FUH)
            kqp.Dne(this, (FUH)paramsMa, (Random)this.Dne); 
        } 
        NMq nMq = bzF();
        sMa sMa1 = paramsMa;
        if (paramsMa instanceof Dur) {
          eKx eKx = ((Dur)paramsMa).Dne;
          if (eKx != null && eKx instanceof FUH)
            sMa1 = (FUH)eKx; 
        } 
        if (nMq != null && sMa1 instanceof FUH) {
          nMq.Dne((FUH)sMa1, this);
          if (nMq.Dne <= 0)
            BJH(); 
        } 
        if (paramsMa instanceof FUH) {
          if (paramsMa.udO())
            Dne((FUH)paramsMa, true); 
          Dne(trP.ATE, i);
          if (m > 0 && bool) {
            paramsMa.aFZ(m * 4);
          } else if (bool2) {
            paramsMa.EyB();
          } 
        } 
        aFZ(0.3F);
      } 
    } 
  }
  
  public boolean EWz() {
    return false;
  }
  
  public boolean Wwe() {
    return this.vSL;
  }
  
  protected void LVR() {}
  
  public NMq bzF() {
    return this.Dne.Dne();
  }
  
  public void IjH() {
    if (this.One > 0)
      this.One--; 
    if (((Qnq)this.Dne).aFZ == null && XHL() < Dne() && this.zGp % 20 * 12 == 0)
      Dne(1); 
    this.Dne.Dne();
    this.xXN = this.IYC;
    super.IjH();
    this.Wwe = this.Dne.FWm();
    this.eJi = this.LoG;
    if (ATE()) {
      this.Wwe = (float)(this.Wwe + this.Dne.FWm() * 0.3D);
      this.eJi = (float)(this.eJi + this.LoG * 0.3D);
    } 
    float f1 = geR.Dne(this.XHL * this.XHL + this.kGO * this.kGO);
    float f2 = (float)Math.atan(-this.Zpi * 0.20000000298023224D) * 15.0F;
    if (f1 > 0.1F)
      f1 = 0.1F; 
    if (this.aFZ == null || XHL() <= 0)
      f1 = 0.0F; 
    if (this.aFZ != null || XHL() <= 0)
      f2 = 0.0F; 
    this.IYC += (f1 - this.IYC) * 0.4F;
    this.EWz += (f2 - this.EWz) * 0.8F;
    if (XHL() > 0) {
      List<sMa> list = this.Dne.FWm(this, this.Dne.FWm(1.0D, 0.5D, 1.0D));
      if (list != null)
        for (byte b = 0; b < list.size(); b++) {
          sMa sMa = list.get(b);
          if (sMa.Zpi == 0.0F)
            mrb(sMa); 
        }  
    } 
  }
  
  public boolean LVR() {
    return this.Dne;
  }
  
  public int qLR() {
    return this.FWm;
  }
  
  public void aFZ(float paramFloat) {
    if (((uqg)this.Dne).Dne == 0.0F && ((Qnq)this.Dne).aFZ == null)
      this.Dne.Dne(paramFloat); 
  }
  
  protected void aFZ() {
    this.FWm = this.Dne;
  }
  
  protected void div() {
    EWz();
  }
  
  public int zGp() {
    return (((uqg)this.Dne).Dne != 0.0F) ? 0 : 80;
  }
  
  public void g_() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial g_ : ()V
    //   4: aload_0
    //   5: getfield Dne : LPdb;
    //   8: aload_0
    //   9: invokevirtual Dne : (LFiG;)V
    //   12: aload_0
    //   13: getfield FWm : LPdb;
    //   16: ifnull -> 27
    //   19: aload_0
    //   20: getfield FWm : LPdb;
    //   23: aload_0
    //   24: invokevirtual Dne : (LFiG;)V
    //   27: return
  }
  
  protected void Dne(JiM paramJiM) {
    this.Dne.FWm(paramJiM);
  }
  
  public int DyG() {
    return 10;
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, Byte.valueOf((byte)0));
    this.Dne.Dne(17, Byte.valueOf((byte)0));
    this.Dne.Dne(18, Integer.valueOf(0));
  }
  
  private void DyG(double paramDouble1, double paramDouble2, double paramDouble3) {
    if (this.FWm != null) {
      int i = Math.round(geR.Dne(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3) * 100.0F);
      if (i > 0)
        if (this.FWm instanceof Ebp) {
          Dne(trP.kGO, i);
          if (this.bzF == null) {
            this.bzF = new iSh(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb));
          } else if (this.bzF.Dne(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb)) >= 1000000.0D) {
            Dne(qlg.Zpi, 1);
          } 
        } else if (this.FWm instanceof iMX) {
          Dne(trP.udO, i);
        } else if (this.FWm instanceof fNv) {
          Dne(trP.ooe, i);
        }  
    } 
  }
  
  public NMq FWm(int paramInt) {
    return this.Dne.bzF(paramInt);
  }
  
  private void trS(int paramInt) {
    this.YHU = 0.0F;
    this.exS = 0.0F;
    switch (paramInt) {
      case 0:
        this.exS = -1.8F;
        break;
      case 1:
        this.YHU = 1.8F;
        break;
      case 2:
        this.exS = 1.8F;
        break;
      case 3:
        this.YHU = -1.8F;
        break;
    } 
  }
  
  public void Dne(TpA paramTpA) {}
  
  public static iSh Dne(Qnq paramQnq, iSh paramiSh, boolean paramBoolean) {
    ZfC zfC = paramQnq.FWm();
    zfC.FWm(paramiSh.Dne - 3 >> 4, paramiSh.bzF - 3 >> 4);
    zfC.FWm(paramiSh.Dne + 3 >> 4, paramiSh.bzF - 3 >> 4);
    zfC.FWm(paramiSh.Dne - 3 >> 4, paramiSh.bzF + 3 >> 4);
    zfC.FWm(paramiSh.Dne + 3 >> 4, paramiSh.bzF + 3 >> 4);
    if (paramQnq.Dne(paramiSh.Dne, paramiSh.FWm, paramiSh.bzF) == zKP.FfS.FWm)
      return rTW.Dne(paramQnq, paramiSh.Dne, paramiSh.FWm, paramiSh.bzF, 0); 
    KFd kFd1 = paramQnq.Dne(paramiSh.Dne, paramiSh.FWm, paramiSh.bzF);
    KFd kFd2 = paramQnq.Dne(paramiSh.Dne, paramiSh.FWm + 1, paramiSh.bzF);
    boolean bool1 = (!kFd1.Dne() && !kFd1.Qnq()) ? true : false;
    boolean bool2 = (!kFd2.Dne() && !kFd2.Qnq()) ? true : false;
    return (paramBoolean && bool1 && bool2) ? paramiSh : null;
  }
  
  private void mrb(sMa paramsMa) {
    paramsMa.a_(this);
  }
  
  protected void Dne(zBn paramzBn, int paramInt) {
    if (!EyB()) {
      if (!paramzBn.bzF() && AgF())
        paramInt = 1 + paramInt >> 1; 
      paramInt = Dne(paramzBn, paramInt);
      paramInt = FWm(paramzBn, paramInt);
      aFZ(paramzBn.Dne());
      int i = XHL();
      bzF(XHL() - paramInt);
      this.Dne.Dne(paramzBn, i, paramInt);
    } 
  }
  
  public boolean Dne(boolean paramBoolean) {
    return ((paramBoolean || this.Dne.Dne()) && ((uqg)this.Dne).Dne == 0.0F);
  }
  
  public YGE Dne() {
    return Dne().bzF(this.aFZ);
  }
  
  public void bzF(sMa paramsMa) {
    if (this.FWm == paramsMa) {
      aFZ(paramsMa);
      if (this.FWm != null)
        this.FWm.Dne = null; 
      this.FWm = null;
    } else {
      super.bzF(paramsMa);
    } 
  }
  
  public void Dne(RLC paramRLC) {
    Dne(paramRLC, 1);
  }
  
  public FiG(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = (Pdb)new fTB();
    this.Dne = (Pdb)new SCY();
    this.One = 0;
    this.Dne = false;
    this.ZgS = 0;
    this.Dne = (Pdb)new uqg();
    this.CZC = 0.1F;
    this.LoG = 0.02F;
    this.EWz = 0;
    this.Dne = null;
    this.Dne = new ReE((MOS)this.Dne, (paramQnq.aFZ == null), this);
    this.FWm = this.Dne;
    this.udO = 1.62F;
    iSh iSh1 = paramQnq.Dne();
    FWm(iSh1.Dne + 0.5D, (iSh1.FWm + 1), iSh1.bzF + 0.5D, 0.0F, 0.0F);
    this.Qnq = "humanoid";
    this.AgF = 180.0F;
    this.DyG = 20;
    this.bzF = (iSh)"/mob/char.png";
  }
  
  public void Dne(XHL paramXHL) {}
  
  protected void qrB() {}
  
  public void udO(int paramInt) {
    int i = Vxn();
    this.Dne.FWm(18, Integer.valueOf(i + paramInt));
  }
  
  public void Dne(lqs paramlqs) {}
  
  public gDn Dne(NMq paramNMq, int paramInt) {
    gDn gDn = super.Dne(paramNMq, paramInt);
    if (paramNMq.bzF == ((ucN)dEr.Dne).Qnq && this.Dne != null) {
      gDn = dEr.Dne.Dne();
    } else {
      if (paramNMq.Dne().Dne())
        return paramNMq.Dne().Dne(paramNMq.Qnq(), paramInt); 
      if (this.Dne != null && paramNMq.bzF == ((DsI)dEr.Dne).Qnq) {
        int i = paramNMq.zGp() - this.FWm;
        if (i >= 18)
          return dEr.Dne.FWm(2); 
        if (i > 13)
          return dEr.Dne.FWm(1); 
        if (i > 0)
          return dEr.Dne.FWm(0); 
      } 
    } 
    return gDn;
  }
  
  public void Dne(iSh paramiSh, boolean paramBoolean) {
    if (paramiSh != null) {
      this.FWm = new iSh(paramiSh);
      this.Dne = paramBoolean;
    } else {
      this.FWm = null;
      this.Dne = false;
    } 
  }
  
  protected boolean bzF(int paramInt) {
    return ((this.Dne.Dne(16) & 1 << paramInt) != 0);
  }
  
  public void zGp(double paramDouble1, double paramDouble2, double paramDouble3) {
    if (this.FWm == null)
      if (Dne(KFd.div)) {
        int i = Math.round(geR.Dne(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3) * 100.0F);
        if (i > 0) {
          Dne(trP.Zpi, i);
          aFZ(0.015F * i * 0.01F);
        } 
      } else if (Zpi()) {
        int i = Math.round(geR.Dne(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
        if (i > 0) {
          Dne(trP.div, i);
          aFZ(0.015F * i * 0.01F);
        } 
      } else if (div()) {
        if (paramDouble2 > 0.0D)
          Dne(trP.mrb, (int)Math.round(paramDouble2 * 100.0D)); 
      } else if (this.aFZ != null) {
        int i = Math.round(geR.Dne(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
        if (i > 0) {
          Dne(trP.DyG, i);
          if (ATE()) {
            aFZ(0.099999994F * i * 0.01F);
          } else {
            aFZ(0.01F * i * 0.01F);
          } 
        } 
      } else {
        int i = Math.round(geR.Dne(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
        if (i > 25)
          Dne(trP.XHL, i); 
      }  
  }
  
  public SFA Dne() {
    return this.Dne.Dne();
  }
  
  protected void div(int paramInt) {
    this.Dne.FWm(paramInt);
  }
  
  public fTB Dne() {
    return (fTB)this.Dne;
  }
  
  public void FYZ() {
    this.Dne = null;
    this.FWm = 0;
    if (((Qnq)this.Dne).aFZ == null)
      aFZ(false); 
  }
  
  public void Qnq(float paramFloat1, float paramFloat2) {
    float f1 = this.div;
    float f2 = this.IjH;
    float f3 = this.mrb;
    if (((uqg)this.Dne).FWm && this.FWm == null) {
      float f = this.Zpi;
      int i = this.eJi;
      this.eJi = this.Dne.Dne();
      super.Qnq(paramFloat1, paramFloat2);
      this.Zpi = f * 0.6D;
      this.eJi = i;
    } else {
      super.Qnq(paramFloat1, paramFloat2);
    } 
    zGp(this.div - f1, this.IjH - f2, this.mrb - f3);
  }
  
  protected void zGp() {
    this.udO = 1.62F;
  }
  
  public NMq Dne(int paramInt) {
    return (paramInt == 0) ? this.Dne.Dne() : ((MOS)this.Dne).FWm[paramInt - 1];
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {}
  
  public NMq Dne() {
    return this.Dne.Dne();
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 9) {
      qLR();
    } else {
      super.Dne(paramByte);
    } 
  }
  
  public void tgc() {
    if (!((uqg)this.Dne).FWm)
      super.tgc(); 
  }
  
  public boolean AgF() {
    return (haP() && dEr.Dne[((NMq)this.Dne).bzF].Dne((NMq)this.Dne) == een.Qnq);
  }
  
  public void BJH() {
    this.Dne.Dne(((MOS)this.Dne).Dne, (NMq)null);
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3) {}
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Inventory", this.Dne.Dne(new mbZ()));
    paramWkD.Dne("SelectedItemSlot", ((MOS)this.Dne).Dne);
    paramWkD.Dne("Sleeping", this.vSL);
    paramWkD.Dne("SleepTimer", (short)this.Dne);
    paramWkD.Dne("XpP", this.iNQ);
    paramWkD.Dne("XpLevel", this.eHV);
    paramWkD.Dne("XpTotal", this.mlD);
    paramWkD.Dne("Score", Vxn());
    if (this.FWm != null) {
      paramWkD.Dne("SpawnX", this.FWm.Dne);
      paramWkD.Dne("SpawnY", this.FWm.FWm);
      paramWkD.Dne("SpawnZ", this.FWm.bzF);
      paramWkD.Dne("SpawnForced", this.Dne);
    } 
    this.Dne.FWm(paramWkD);
    this.Dne.Dne(paramWkD);
    paramWkD.Dne("EnderItems", this.Dne.Dne());
  }
  
  public JiM Dne(NMq paramNMq, boolean paramBoolean) {
    if (paramNMq == null)
      return null; 
    JiM jiM = new JiM((Qnq)this.Dne, this.div, this.IjH - 0.30000001192092896D + c_(), this.mrb, paramNMq);
    jiM.FWm = 40;
    float f = 0.1F;
    if (paramBoolean) {
      float f1 = this.Dne.nextFloat() * 0.5F;
      float f2 = this.Dne.nextFloat() * 3.1415927F * 2.0F;
      jiM.XHL = (-geR.Dne(f2) * f1);
      jiM.kGO = (geR.FWm(f2) * f1);
      jiM.Zpi = 0.20000000298023224D;
    } else {
      f = 0.3F;
      jiM.XHL = (-geR.Dne(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F) * f);
      jiM.kGO = (geR.FWm(this.mrb / 180.0F * 3.1415927F) * geR.FWm(this.XHL / 180.0F * 3.1415927F) * f);
      jiM.Zpi = (-geR.Dne(this.XHL / 180.0F * 3.1415927F) * f + 0.1F);
      f = 0.02F;
      float f1 = this.Dne.nextFloat() * 3.1415927F * 2.0F;
      f *= this.Dne.nextFloat();
      jiM.XHL += Math.cos(f1) * f;
      jiM.Zpi += ((this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.1F);
      jiM.kGO += Math.sin(f1) * f;
    } 
    Dne(jiM);
    Dne(trP.qLR, 1);
    return jiM;
  }
  
  public void FWm(int paramInt) {
    this.eHV += paramInt;
    if (this.eHV < 0) {
      this.eHV = 0;
      this.iNQ = 0.0F;
      this.mlD = 0;
    } 
    if (paramInt > 0 && this.eHV % 5 == 0 && this.EWz < this.zGp - 100.0F) {
      float f = (this.eHV > 30) ? 1.0F : (this.eHV / 30.0F);
      this.Dne.Dne(this, "random.levelup", f * 0.75F, 1.0F);
      this.EWz = this.zGp;
    } 
  }
  
  public void Dne(zBn paramzBn) {
    super.Dne(paramzBn);
    Dne(0.2F, 0.2F);
    bzF(this.div, this.IjH, this.mrb);
    this.Zpi = 0.10000000149011612D;
    if (this.aFZ.equals("Notch"))
      Dne(new NMq(dEr.aFZ, 1), true); 
    if (!this.Dne.Dne().Dne("keepInventory"))
      this.Dne.Qnq(); 
    if (paramzBn != null) {
      this.XHL = (-geR.FWm((this.eHV + this.mrb) * 3.1415927F / 180.0F) * 0.1F);
      this.kGO = (-geR.Dne((this.eHV + this.mrb) * 3.1415927F / 180.0F) * 0.1F);
    } else {
      this.XHL = this.kGO = 0.0D;
    } 
    this.udO = 0.1F;
    Dne(trP.ceE, 1);
  }
  
  protected void Dne(float paramFloat) {
    if (!((uqg)this.Dne).bzF) {
      if (paramFloat >= 2.0F)
        Dne(trP.IjH, (int)Math.round(paramFloat * 100.0D)); 
      super.Dne(paramFloat);
    } 
  }
  
  public boolean ZfC() {
    return bzF(1);
  }
  
  public boolean mlD() {
    return true;
  }
  
  public void kGO(int paramInt) {
    this.Dne.FWm(18, Integer.valueOf(paramInt));
  }
  
  public void bzF(String paramString) {}
  
  public void ooe(int paramInt) {
    udO(paramInt);
    int i = Integer.MAX_VALUE - this.mlD;
    if (paramInt > i)
      paramInt = i; 
    this.iNQ += paramInt / EyB();
    this.mlD += paramInt;
    while (this.iNQ >= 1.0F) {
      this.iNQ = (this.iNQ - 1.0F) * EyB();
      FWm(1);
      this.iNQ /= EyB();
    } 
  }
  
  public float Zpi() {
    if (this.Dne != null) {
      int i = this.Dne.bzF(((iSh)this.Dne).Dne, ((iSh)this.Dne).FWm, ((iSh)this.Dne).bzF);
      int j = rTW.Qnq(i);
      switch (j) {
        case 0:
          return 90.0F;
        case 1:
          return 0.0F;
        case 2:
          return 270.0F;
        case 3:
          return 180.0F;
      } 
    } 
    return 0.0F;
  }
  
  public int ATE() {
    return haP() ? (this.Dne.zGp() - this.FWm) : 0;
  }
  
  public void Dne(RLC paramRLC, int paramInt) {}
  
  public double Qnq() {
    return (this.udO - 0.5F);
  }
  
  public void Dne(sMa paramsMa) {}
  
  public void Dne(ipD paramipD) {}
  
  public void Dne(NMq paramNMq) {}
  
  public SCY Dne() {
    return (SCY)this.Dne;
  }
  
  protected void Dne(FUH paramFUH, boolean paramBoolean) {
    if (!(paramFUH instanceof gls) && !(paramFUH instanceof VAd)) {
      if (paramFUH instanceof oEB) {
        oEB oEB = (oEB)paramFUH;
        if (oEB.LVR() && this.aFZ.equals(oEB.FWm()))
          return; 
      } 
      if (!(paramFUH instanceof FiG) || Dne((FiG)paramFUH)) {
        List list = this.Dne.Dne(oEB.class, bSp.Dne().Dne(this.div, this.IjH, this.mrb, this.div + 1.0D, this.IjH + 1.0D, this.mrb + 1.0D).FWm(16.0D, 4.0D, 16.0D));
        for (oEB oEB : list) {
          if (oEB.LVR() && oEB.FWm() == null && this.aFZ.equals(oEB.FWm()) && (!paramBoolean || !oEB.ICU())) {
            oEB.XHL(false);
            oEB.Dne(paramFUH);
          } 
        } 
      } 
    } 
  }
  
  public void a_(int paramInt, NMq paramNMq) {
    ((MOS)this.Dne).FWm[paramInt] = paramNMq;
  }
  
  public float Dne(zKP paramzKP, boolean paramBoolean) {
    float f = this.Dne.Dne(paramzKP);
    if (f > 1.0F) {
      int i = UYp.bzF(this);
      NMq nMq = this.Dne.Dne();
      if (i > 0 && nMq != null) {
        float f1 = (i * i + 1);
        if (!nMq.Dne(paramzKP) && f <= 1.0F) {
          f += f1 * 0.08F;
        } else {
          f += f1;
        } 
      } 
    } 
    if (Dne(SXd.Qnq))
      f *= 1.0F + (Dne(SXd.Qnq).bzF() + 1) * 0.2F; 
    if (Dne(SXd.aFZ))
      f *= 1.0F - (Dne(SXd.aFZ).bzF() + 1) * 0.2F; 
    if (Dne(KFd.div) && !UYp.FWm(this))
      f /= 5.0F; 
    if (this.aFZ == null)
      f /= 5.0F; 
    return f;
  }
  
  public iSh bzF() {
    return this.FWm;
  }
  
  public boolean aFZ(sMa paramsMa) {
    if (paramsMa.a_(this))
      return true; 
    NMq nMq = bzF();
    if (nMq != null && paramsMa instanceof FUH) {
      if (((uqg)this.Dne).Qnq)
        nMq = nMq.Dne(); 
      if (nMq.Dne((FUH)paramsMa)) {
        if (nMq.Dne <= 0 && !((uqg)this.Dne).Qnq)
          BJH(); 
        return true;
      } 
    } 
    return false;
  }
  
  protected void qLR() {
    if (this.Dne != null) {
      FWm((NMq)this.Dne, 16);
      int i = ((NMq)this.Dne).Dne;
      NMq nMq = this.Dne.FWm((Qnq)this.Dne, this);
      if (nMq != this.Dne || (nMq != null && nMq.Dne != i)) {
        ((MOS)this.Dne).Dne[((MOS)this.Dne).Dne] = nMq;
        if (nMq.Dne == 0)
          ((MOS)this.Dne).Dne[((MOS)this.Dne).Dne] = null; 
      } 
      FYZ();
    } 
  }
  
  public String Dne(String paramString, Object... paramVarArgs) {
    return Dne().Dne(paramString, paramVarArgs);
  }
  
  public void Dne(klq paramklq) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FiG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */