public class kQo extends BRM {
  private cnh Dne;
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("CatType", qLR());
  }
  
  public boolean bzF(sMa paramsMa) {
    return paramsMa.Dne(zBn.Dne(this), 3);
  }
  
  public boolean a_(FiG paramFiG) {
    NMq nMq = paramFiG.Dne.Dne();
    if (LVR()) {
      if (paramFiG.aFZ.equalsIgnoreCase(FWm()) && ((Qnq)this.Dne).aFZ == null && !Dne(nMq))
        this.Dne.Dne(!ICU()); 
    } else if (this.Dne.bzF() && nMq != null && nMq.bzF == dEr.Zlx.Qnq && paramFiG.Dne(this) < 9.0D) {
      if (!((uqg)paramFiG.Dne).Qnq)
        nMq.Dne--; 
      if (nMq.Dne <= 0)
        paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, (NMq)null); 
      if (((Qnq)this.Dne).aFZ == null)
        if (this.Dne.nextInt(3) == 0) {
          mrb(true);
          kGO(1 + ((Qnq)this.Dne).Dne.nextInt(3));
          Dne(paramFiG.aFZ);
          IjH(true);
          this.Dne.Dne(true);
          this.Dne.Dne(this, (byte)7);
        } else {
          IjH(false);
          this.Dne.Dne(this, (byte)6);
        }  
      return true;
    } 
    return super.a_(paramFiG);
  }
  
  public boolean tgc() {
    return true;
  }
  
  protected float div() {
    return 0.4F;
  }
  
  protected int kGO() {
    return dEr.LoG.Qnq;
  }
  
  public void ICU() {
    if (((Qnq)this.Dne).Dne.nextInt(7) == 0)
      for (byte b = 0; b < 2; b++) {
        kQo kQo1 = new kQo((Qnq)this.Dne);
        kQo1.FWm(this.div, this.IjH, this.mrb, this.mrb, 0.0F);
        kQo1.FWm(-24000);
        this.Dne.FWm(kQo1);
      }  
  }
  
  public kQo Dne(Azh paramAzh) {
    kQo kQo1 = new kQo((Qnq)this.Dne);
    if (LVR()) {
      kQo1.Dne(FWm());
      kQo1.mrb(true);
      kQo1.kGO(qLR());
    } 
    return kQo1;
  }
  
  protected void Dne(float paramFloat) {}
  
  protected String DyG() {
    return "mob.cat.hitt";
  }
  
  public kQo(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: ldc '/mob/ozelot.png'
    //   8: putfield bzF : Ljava/lang/String;
    //   11: aload_0
    //   12: ldc 0.6
    //   14: ldc 0.8
    //   16: invokevirtual Dne : (FF)V
    //   19: aload_0
    //   20: invokevirtual Dne : ()LKFZ;
    //   23: iconst_1
    //   24: invokevirtual Dne : (Z)V
    //   27: aload_0
    //   28: getfield Dne : LOKo;
    //   31: iconst_1
    //   32: new Cyb
    //   35: dup
    //   36: aload_0
    //   37: invokespecial <init> : (LFUH;)V
    //   40: invokevirtual Dne : (ILcMv;)V
    //   43: aload_0
    //   44: getfield Dne : LOKo;
    //   47: iconst_2
    //   48: aload_0
    //   49: getfield Dne : LHAo;
    //   52: invokevirtual Dne : (ILcMv;)V
    //   55: aload_0
    //   56: getfield Dne : LOKo;
    //   59: iconst_3
    //   60: aload_0
    //   61: new cnh
    //   64: dup
    //   65: aload_0
    //   66: ldc 0.18
    //   68: getstatic dEr.Zlx : LdEr;
    //   71: getfield Qnq : I
    //   74: iconst_1
    //   75: invokespecial <init> : (LkSJ;FIZ)V
    //   78: dup_x1
    //   79: putfield Dne : Lcnh;
    //   82: invokevirtual Dne : (ILcMv;)V
    //   85: aload_0
    //   86: getfield Dne : LOKo;
    //   89: iconst_4
    //   90: new RlP
    //   93: dup
    //   94: aload_0
    //   95: ldc FiG
    //   97: ldc 16.0
    //   99: ldc 0.23
    //   101: ldc 0.4
    //   103: invokespecial <init> : (LkSJ;Ljava/lang/Class;FFF)V
    //   106: invokevirtual Dne : (ILcMv;)V
    //   109: aload_0
    //   110: getfield Dne : LOKo;
    //   113: iconst_5
    //   114: new ReV
    //   117: dup
    //   118: aload_0
    //   119: ldc 0.3
    //   121: ldc 10.0
    //   123: ldc 5.0
    //   125: invokespecial <init> : (LBRM;FFF)V
    //   128: invokevirtual Dne : (ILcMv;)V
    //   131: aload_0
    //   132: getfield Dne : LOKo;
    //   135: bipush #6
    //   137: new VQx
    //   140: dup
    //   141: aload_0
    //   142: ldc 0.4
    //   144: invokespecial <init> : (LkQo;F)V
    //   147: invokevirtual Dne : (ILcMv;)V
    //   150: aload_0
    //   151: getfield Dne : LOKo;
    //   154: bipush #7
    //   156: new NQg
    //   159: dup
    //   160: aload_0
    //   161: ldc 0.3
    //   163: invokespecial <init> : (LFUH;F)V
    //   166: invokevirtual Dne : (ILcMv;)V
    //   169: aload_0
    //   170: getfield Dne : LOKo;
    //   173: bipush #8
    //   175: new vAj
    //   178: dup
    //   179: aload_0
    //   180: invokespecial <init> : (LFUH;)V
    //   183: invokevirtual Dne : (ILcMv;)V
    //   186: aload_0
    //   187: getfield Dne : LOKo;
    //   190: bipush #9
    //   192: new znX
    //   195: dup
    //   196: aload_0
    //   197: ldc 0.23
    //   199: invokespecial <init> : (LHzK;F)V
    //   202: invokevirtual Dne : (ILcMv;)V
    //   205: aload_0
    //   206: getfield Dne : LOKo;
    //   209: bipush #10
    //   211: new IBw
    //   214: dup
    //   215: aload_0
    //   216: ldc 0.23
    //   218: invokespecial <init> : (LkSJ;F)V
    //   221: invokevirtual Dne : (ILcMv;)V
    //   224: aload_0
    //   225: getfield Dne : LOKo;
    //   228: bipush #11
    //   230: new yws
    //   233: dup
    //   234: aload_0
    //   235: ldc FiG
    //   237: ldc 10.0
    //   239: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   242: invokevirtual Dne : (ILcMv;)V
    //   245: aload_0
    //   246: getfield FWm : LOKo;
    //   249: iconst_1
    //   250: new zIt
    //   253: dup
    //   254: aload_0
    //   255: ldc_w GRq
    //   258: ldc_w 14.0
    //   261: sipush #750
    //   264: iconst_0
    //   265: invokespecial <init> : (LBRM;Ljava/lang/Class;FIZ)V
    //   268: invokevirtual Dne : (ILcMv;)V
    //   271: return
  }
  
  public boolean Dne(HzK paramHzK) {
    if (paramHzK == this)
      return false; 
    if (!LVR())
      return false; 
    if (!(paramHzK instanceof kQo))
      return false; 
    kQo kQo1 = (kQo)paramHzK;
    return !kQo1.LVR() ? false : ((ZfC() && kQo1.ZfC()));
  }
  
  public void mlD() {
    if (Dne().Dne()) {
      float f = Dne().Dne();
      if (f == 0.18F) {
        bzF(true);
        a_(false);
      } else if (f == 0.4F) {
        bzF(false);
        a_(true);
      } else {
        bzF(false);
        a_(false);
      } 
    } else {
      bzF(false);
      a_(false);
    } 
  }
  
  public int Dne() {
    return 10;
  }
  
  protected String zGp() {
    return LVR() ? (ZfC() ? "mob.cat.purr" : ((this.Dne.nextInt(4) == 0) ? "mob.cat.purreow" : "mob.cat.meow")) : "";
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    this.Dne.Dne(false);
    return super.Dne(paramzBn, paramInt);
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq != null && paramNMq.bzF == dEr.Zlx.Qnq);
  }
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    kGO(paramWkD.Dne("CatType"));
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(18, Byte.valueOf((byte)0));
  }
  
  public String Dne() {
    return ZgS() ? IjH() : (LVR() ? "entity.Cat.name" : super.Dne());
  }
  
  public String bzF() {
    switch (qLR()) {
      case 0:
        return "/mob/ozelot.png";
      case 1:
        return "/mob/cat_black.png";
      case 2:
        return "/mob/cat_red.png";
      case 3:
        return "/mob/cat_siamese.png";
    } 
    return super.bzF();
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {}
  
  protected String div() {
    return "mob.cat.hitt";
  }
  
  public boolean cot() {
    if (((Qnq)this.Dne).Dne.nextInt(3) == 0)
      return false; 
    if (this.Dne.Dne((bSp)this.Dne) && this.Dne.Dne(this, (bSp)this.Dne).isEmpty() && !this.Dne.bzF((bSp)this.Dne)) {
      int i = geR.FWm(this.div);
      int j = geR.FWm(((bSp)this.Dne).FWm);
      int k = geR.FWm(this.mrb);
      if (j < 63)
        return false; 
      int m = this.Dne.Dne(i, j - 1, k);
      if (m == ((ZQN)zKP.Dne).FWm || m == ((VOy)zKP.Dne).FWm)
        return true; 
    } 
    return false;
  }
  
  public int qLR() {
    return this.Dne.Dne(18);
  }
  
  public void kGO(int paramInt) {
    this.Dne.FWm(18, Byte.valueOf((byte)paramInt));
  }
  
  protected boolean yMz() {
    return !LVR();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kQo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */