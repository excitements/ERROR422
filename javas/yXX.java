import java.util.Calendar;

public class yXX extends LHi implements vjn {
  private etz Dne;
  
  private Auu Dne;
  
  public boolean bzF(sMa paramsMa) {
    if (super.bzF(paramsMa)) {
      if (bzF() == 1 && paramsMa instanceof FUH)
        ((FUH)paramsMa).Qnq(new NAx(SXd.EyB.Dne, 200)); 
      return true;
    } 
    return false;
  }
  
  public void Qnq() {
    this.Dne.Dne(this.Dne);
    this.Dne.Dne(this.Dne);
    NMq nMq = Dne();
    if (nMq != null && nMq.bzF == ((DsI)dEr.Dne).Qnq) {
      this.Dne.Dne(4, this.Dne);
    } else {
      this.Dne.Dne(4, this.Dne);
    } 
  }
  
  public void FWm(int paramInt) {
    this.Dne.FWm(13, Byte.valueOf((byte)paramInt));
    this.ooe = (paramInt == 1);
    if (paramInt == 1) {
      Dne(0.72F, 2.34F);
    } else {
      Dne(0.6F, 1.8F);
    } 
  }
  
  protected String div() {
    return "mob.skeleton.death";
  }
  
  protected int kGO() {
    return dEr.zGp.Qnq;
  }
  
  public aYc Dne() {
    return aYc.FWm;
  }
  
  public void Dne(zBn paramzBn) {
    super.Dne(paramzBn);
    if (paramzBn.Dne() instanceof hhc && paramzBn.FWm() instanceof FiG) {
      FiG fiG = (FiG)paramzBn.FWm();
      double d1 = fiG.div - this.div;
      double d2 = fiG.mrb - this.mrb;
      if (d1 * d1 + d2 * d2 >= 2500.0D)
        fiG.Dne(qlg.qLR); 
    } 
  }
  
  protected String DyG() {
    return "mob.skeleton.hurt";
  }
  
  public void ICU() {
    if (((Qnq)this.Dne).Dne instanceof XjO && Dne().nextInt(5) > 0) {
      this.Dne.Dne(4, this.Dne);
      FWm(1);
      a_(0, new NMq(dEr.trS));
    } else {
      this.Dne.Dne(4, this.Dne);
      qrB();
      LVR();
    } 
    div((this.Dne.nextFloat() < Dne[((Qnq)this.Dne).aFZ]));
    if (Dne(4) == null) {
      Calendar calendar = this.Dne.Dne();
      if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31 && this.Dne.nextFloat() < 0.25F) {
        a_(4, new NMq((this.Dne.nextFloat() < 0.1F) ? zKP.XwR : zKP.aJO));
        this.FWm[4] = 0.0F;
      } 
    } 
  }
  
  public void Dne(FUH paramFUH, float paramFloat) {
    hhc hhc = new hhc((Qnq)this.Dne, this, paramFUH, 1.6F, (14 - ((Qnq)this.Dne).aFZ * 4));
    int i = UYp.Dne(ycv.Vxn.FWm, Dne());
    int j = UYp.Dne(ycv.ceE.FWm, Dne());
    hhc.Dne((paramFloat * 2.0F) + this.Dne.nextGaussian() * 0.25D + (((Qnq)this.Dne).aFZ * 0.11F));
    if (i > 0)
      hhc.Dne(hhc.Dne() + i * 0.5D + 0.5D); 
    if (j > 0)
      hhc.Dne(j); 
    if (UYp.Dne(ycv.EyB.FWm, Dne()) > 0 || bzF() == 1)
      hhc.aFZ(100); 
    Dne("random.bow", 1.0F, 1.0F / (Dne().nextFloat() * 0.4F + 0.8F));
    this.Dne.FWm(hhc);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (paramWkD.Dne("SkeletonType")) {
      byte b = paramWkD.Dne("SkeletonType");
      FWm(b);
    } 
    Qnq();
  }
  
  public int bzF() {
    return this.Dne.Dne(13);
  }
  
  public yXX(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: new Auu
    //   9: dup
    //   10: aload_0
    //   11: ldc 0.25
    //   13: bipush #20
    //   15: bipush #60
    //   17: ldc_w 15.0
    //   20: invokespecial <init> : (Lvjn;FIIF)V
    //   23: putfield Dne : LAuu;
    //   26: aload_0
    //   27: new etz
    //   30: dup
    //   31: aload_0
    //   32: ldc FiG
    //   34: ldc_w 0.31
    //   37: iconst_0
    //   38: invokespecial <init> : (LFUH;Ljava/lang/Class;FZ)V
    //   41: putfield Dne : Letz;
    //   44: aload_0
    //   45: ldc_w '/mob/skeleton.png'
    //   48: putfield bzF : Ljava/lang/String;
    //   51: aload_0
    //   52: ldc 0.25
    //   54: putfield cHy : F
    //   57: aload_0
    //   58: getfield Dne : LOKo;
    //   61: iconst_1
    //   62: new Cyb
    //   65: dup
    //   66: aload_0
    //   67: invokespecial <init> : (LFUH;)V
    //   70: invokevirtual Dne : (ILcMv;)V
    //   73: aload_0
    //   74: getfield Dne : LOKo;
    //   77: iconst_2
    //   78: new CBo
    //   81: dup
    //   82: aload_0
    //   83: invokespecial <init> : (LkSJ;)V
    //   86: invokevirtual Dne : (ILcMv;)V
    //   89: aload_0
    //   90: getfield Dne : LOKo;
    //   93: iconst_3
    //   94: new ITf
    //   97: dup
    //   98: aload_0
    //   99: aload_0
    //   100: getfield cHy : F
    //   103: invokespecial <init> : (LkSJ;F)V
    //   106: invokevirtual Dne : (ILcMv;)V
    //   109: aload_0
    //   110: getfield Dne : LOKo;
    //   113: iconst_5
    //   114: new IBw
    //   117: dup
    //   118: aload_0
    //   119: aload_0
    //   120: getfield cHy : F
    //   123: invokespecial <init> : (LkSJ;F)V
    //   126: invokevirtual Dne : (ILcMv;)V
    //   129: aload_0
    //   130: getfield Dne : LOKo;
    //   133: bipush #6
    //   135: new yws
    //   138: dup
    //   139: aload_0
    //   140: ldc FiG
    //   142: ldc_w 8.0
    //   145: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   148: invokevirtual Dne : (ILcMv;)V
    //   151: aload_0
    //   152: getfield Dne : LOKo;
    //   155: bipush #6
    //   157: new cHg
    //   160: dup
    //   161: aload_0
    //   162: invokespecial <init> : (LFUH;)V
    //   165: invokevirtual Dne : (ILcMv;)V
    //   168: aload_0
    //   169: getfield FWm : LOKo;
    //   172: iconst_1
    //   173: new QRF
    //   176: dup
    //   177: aload_0
    //   178: iconst_0
    //   179: invokespecial <init> : (LFUH;Z)V
    //   182: invokevirtual Dne : (ILcMv;)V
    //   185: aload_0
    //   186: getfield FWm : LOKo;
    //   189: iconst_2
    //   190: new AmF
    //   193: dup
    //   194: aload_0
    //   195: ldc FiG
    //   197: ldc_w 16.0
    //   200: iconst_0
    //   201: iconst_1
    //   202: invokespecial <init> : (LFUH;Ljava/lang/Class;FIZ)V
    //   205: invokevirtual Dne : (ILcMv;)V
    //   208: aload_1
    //   209: ifnull -> 223
    //   212: aload_1
    //   213: getfield aFZ : Z
    //   216: ifne -> 223
    //   219: aload_0
    //   220: invokevirtual Qnq : ()V
    //   223: return
  }
  
  public void IjH() {
    if (this.Dne.Dne() && ((Qnq)this.Dne).aFZ == null) {
      float f = Dne(1.0F);
      if (f > 0.5F && this.Dne.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.Dne.aFZ(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb))) {
        boolean bool = true;
        NMq nMq = Dne(4);
        if (nMq != null) {
          if (nMq.FWm()) {
            nMq.Dne(nMq.bzF() + this.Dne.nextInt(2));
            if (nMq.bzF() >= nMq.aFZ()) {
              FWm(nMq);
              a_(4, (NMq)null);
            } 
          } 
          bool = false;
        } 
        if (bool)
          aFZ(8); 
      } 
    } 
    if (((Qnq)this.Dne).aFZ != null && bzF() == 1)
      Dne(0.72F, 2.34F); 
    super.IjH();
  }
  
  public int Dne(sMa paramsMa) {
    if (bzF() == 1) {
      NMq nMq = Dne();
      int i = 4;
      if (nMq != null)
        i += nMq.Dne(this); 
      return i;
    } 
    return super.Dne(paramsMa);
  }
  
  public int Dne() {
    return 20;
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(13, new Byte((byte)0));
  }
  
  protected String zGp() {
    return "mob.skeleton.say";
  }
  
  public String bzF() {
    return (bzF() == 1) ? "/mob/skeleton_wither.png" : super.bzF();
  }
  
  protected void IjH(int paramInt) {
    if (bzF() == 1)
      Dne(new NMq(dEr.mfU.Qnq, 1, 1), 0.0F); 
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    if (bzF() == 1) {
      int j = this.Dne.nextInt(3 + paramInt) - 1;
      for (byte b1 = 0; b1 < j; b1++)
        Dne(dEr.DyG.Qnq, 1); 
    } else {
      int j = this.Dne.nextInt(3 + paramInt);
      for (byte b1 = 0; b1 < j; b1++)
        Dne(dEr.zGp.Qnq, 1); 
    } 
    int i = this.Dne.nextInt(3 + paramInt);
    for (byte b = 0; b < i; b++)
      Dne(dEr.tIz.Qnq, 1); 
  }
  
  protected void qrB() {
    super.qrB();
    a_(0, new NMq(dEr.Dne));
  }
  
  public boolean tgc() {
    return true;
  }
  
  public void a_(int paramInt, NMq paramNMq) {
    super.a_(paramInt, paramNMq);
    if (((Qnq)this.Dne).aFZ == null && paramInt == 0)
      Qnq(); 
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("SkeletonType", (byte)bzF());
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.skeleton.step", 0.15F, 1.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yXX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */