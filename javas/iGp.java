public class iGp extends LHi {
  private int One = 0;
  
  private boolean FWm;
  
  private int FWm = 0;
  
  private static boolean[] Dne = new boolean[256];
  
  public void IjH() {
    if (XHL())
      Dne(zBn.aFZ, 1); 
    this.cHy = (this.bzF != null) ? 6.5F : 0.3F;
    if (((Qnq)this.Dne).aFZ == null && this.Dne.Dne().Dne("mobGriefing"))
      if (bzF() == 0) {
        if (this.Dne.nextInt(20) == 0) {
          int i = geR.FWm(this.div - 2.0D + this.Dne.nextDouble() * 4.0D);
          int j = geR.FWm(this.IjH + this.Dne.nextDouble() * 3.0D);
          int k = geR.FWm(this.mrb - 2.0D + this.Dne.nextDouble() * 4.0D);
          int m = this.Dne.Dne(i, j, k);
          if (Dne[m]) {
            FWm(this.Dne.Dne(i, j, k));
            kGO(this.Dne.bzF(i, j, k));
            this.Dne.FWm(i, j, k, 0);
          } 
        } 
      } else if (this.Dne.nextInt(2000) == 0) {
        int i = geR.FWm(this.div - 1.0D + this.Dne.nextDouble() * 2.0D);
        int j = geR.FWm(this.IjH + this.Dne.nextDouble() * 2.0D);
        int k = geR.FWm(this.mrb - 1.0D + this.Dne.nextDouble() * 2.0D);
        int m = this.Dne.Dne(i, j, k);
        int n = this.Dne.Dne(i, j - 1, k);
        if (m == 0 && n > 0 && zKP.Dne[n].Dne()) {
          this.Dne.FWm(i, j, k, bzF(), qLR(), 3);
          FWm(0);
        } 
      }  
    for (byte b = 0; b < 2; b++)
      this.Dne.Dne("portal", this.div + (this.Dne.nextDouble() - 0.5D) * this.ooe, this.IjH + this.Dne.nextDouble() * this.trS - 0.25D, this.mrb + (this.Dne.nextDouble() - 0.5D) * this.ooe, (this.Dne.nextDouble() - 0.5D) * 2.0D, -this.Dne.nextDouble(), (this.Dne.nextDouble() - 0.5D) * 2.0D); 
    if (this.Dne.Dne() && ((Qnq)this.Dne).aFZ == null) {
      float f = Dne(1.0F);
      if (f > 0.5F && this.Dne.aFZ(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb)) && this.Dne.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
        this.bzF = null;
        FWm(false);
        this.FWm = 0;
        LVR();
      } 
    } 
    if (XHL() || trS()) {
      this.bzF = null;
      FWm(false);
      this.FWm = 0;
      LVR();
    } 
    if (ZfC() && this.FWm == 0 && this.Dne.nextInt(100) == 0)
      FWm(false); 
    this.oIf = 0;
    if (this.bzF != null)
      Dne(this.bzF, 100.0F, 100.0F); 
    if (((Qnq)this.Dne).aFZ == null && udO())
      if (this.bzF != null) {
        if (this.bzF instanceof FiG && bzF((FiG)this.bzF)) {
          this.ZfC = this.FYZ = 0.0F;
          this.cHy = 0.0F;
          if (this.bzF.Dne(this) < 16.0D)
            LVR(); 
          this.FWm = 0;
        } else if (this.bzF.Dne(this) > 256.0D && this.FWm++ >= 30 && aFZ(this.bzF)) {
          this.FWm = 0;
        } 
      } else {
        FWm(false);
        this.FWm = 0;
      }  
    super.IjH();
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, new Byte((byte)0));
    this.Dne.Dne(17, new Byte((byte)0));
    this.Dne.Dne(18, new Byte((byte)0));
  }
  
  protected String zGp() {
    return ZfC() ? "mob.endermen.scream" : "mob.endermen.idle";
  }
  
  protected String div() {
    return "mob.endermen.death";
  }
  
  protected boolean LVR() {
    double d1 = this.div + (this.Dne.nextDouble() - 0.5D) * 64.0D;
    double d2 = this.IjH + (this.Dne.nextInt(64) - 32);
    double d3 = this.mrb + (this.Dne.nextDouble() - 0.5D) * 64.0D;
    return bzF(d1, d2, d3);
  }
  
  protected boolean bzF(double paramDouble1, double paramDouble2, double paramDouble3) {
    float f1 = this.div;
    float f2 = this.IjH;
    float f3 = this.mrb;
    this.div = paramDouble1;
    this.IjH = paramDouble2;
    this.mrb = paramDouble3;
    boolean bool = false;
    int i = geR.FWm(this.div);
    int j = geR.FWm(this.IjH);
    int k = geR.FWm(this.mrb);
    if (this.Dne.bzF(i, j, k)) {
      boolean bool1 = false;
      while (!bool1 && j > 0) {
        int m = this.Dne.Dne(i, j - 1, k);
        if (m != 0 && (zKP.Dne[m]).Dne.bzF()) {
          bool1 = true;
          continue;
        } 
        this.IjH--;
        j--;
      } 
      if (bool1) {
        bzF(this.div, this.IjH, this.mrb);
        if (this.Dne.Dne(this, (bSp)this.Dne).isEmpty() && !this.Dne.bzF((bSp)this.Dne))
          bool = true; 
      } 
    } 
    if (!bool) {
      bzF(f1, f2, f3);
      return false;
    } 
    char c = '';
    for (byte b = 0; b < c; b++) {
      double d1 = b / (c - 1.0D);
      float f4 = (this.Dne.nextFloat() - 0.5F) * 0.2F;
      float f5 = (this.Dne.nextFloat() - 0.5F) * 0.2F;
      float f6 = (this.Dne.nextFloat() - 0.5F) * 0.2F;
      double d2 = f1 + (this.div - f1) * d1 + (this.Dne.nextDouble() - 0.5D) * this.ooe * 2.0D;
      double d3 = f2 + (this.IjH - f2) * d1 + this.Dne.nextDouble() * this.trS;
      double d4 = f3 + (this.mrb - f3) * d1 + (this.Dne.nextDouble() - 0.5D) * this.ooe * 2.0D;
      this.Dne.Dne("portal", d2, d3, d4, f4, f5, f6);
    } 
    this.Dne.Dne(f1, f2, f3, "mob.endermen.portal", 1.0F, 1.0F);
    Dne("mob.endermen.portal", 1.0F, 1.0F);
    return true;
  }
  
  protected String DyG() {
    return "mob.endermen.hit";
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    int i = kGO();
    if (i > 0) {
      int j = this.Dne.nextInt(2 + paramInt);
      for (byte b = 0; b < j; b++)
        Dne(i, 1); 
    } 
  }
  
  public int Dne() {
    return 40;
  }
  
  public void kGO(int paramInt) {
    this.Dne.FWm(17, Byte.valueOf((byte)(paramInt & 0xFF)));
  }
  
  public int qLR() {
    return this.Dne.Dne(17);
  }
  
  public boolean ZfC() {
    return (this.Dne.Dne(18) > 0);
  }
  
  public iGp(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.6F, 2.9F);
    this.FfS = 1.0F;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    FWm(paramWkD.Dne("carried"));
    kGO(paramWkD.Dne("carriedData"));
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    FWm(true);
    if (paramzBn instanceof Kgw && paramzBn.FWm() instanceof FiG)
      this.FWm = 1; 
    if (paramzBn instanceof CpP) {
      this.FWm = 0;
      for (byte b = 0; b < 64; b++) {
        if (LVR())
          return true; 
      } 
      return false;
    } 
    return super.Dne(paramzBn, paramInt);
  }
  
  public int Dne(sMa paramsMa) {
    return 7;
  }
  
  public void FWm(int paramInt) {
    this.Dne.FWm(16, Byte.valueOf((byte)(paramInt & 0xFF)));
  }
  
  static {
    Dne[((ZQN)zKP.Dne).FWm] = true;
    Dne[zKP.FWm.FWm] = true;
    Dne[((zKP)zKP.IjH).FWm] = true;
    Dne[zKP.mrb.FWm] = true;
    Dne[((hbe)zKP.Dne).FWm] = true;
    Dne[zKP.FWm.FWm] = true;
    Dne[zKP.bzF.FWm] = true;
    Dne[((hbe)zKP.Qnq).FWm] = true;
    Dne[zKP.qXo.FWm] = true;
    Dne[zKP.XjO.FWm] = true;
    Dne[zKP.lMz.FWm] = true;
    Dne[zKP.aJO.FWm] = true;
    Dne[zKP.gwq.FWm] = true;
    Dne[((UyU)zKP.Dne).FWm] = true;
  }
  
  public void FWm(boolean paramBoolean) {
    this.Dne.FWm(18, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
  }
  
  private boolean bzF(FiG paramFiG) {
    NMq nMq = ((MOS)paramFiG.Dne).FWm[3];
    if (nMq != null && nMq.bzF == zKP.aJO.FWm)
      return false; 
    chN chN1 = paramFiG.FWm(1.0F).Dne();
    chN chN2 = this.Dne.Dne().Dne(this.div - paramFiG.div, ((bSp)this.Dne).FWm + (this.trS / 2.0F) - paramFiG.IjH + paramFiG.c_(), this.mrb - paramFiG.mrb);
    double d1 = chN2.Dne();
    chN2 = chN2.Dne();
    double d2 = chN1.Dne(chN2);
    return (d2 > 1.0D - 0.025D / d1) ? paramFiG.Qnq(this) : false;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("carried", (short)bzF());
    paramWkD.Dne("carriedData", (short)qLR());
  }
  
  public int bzF() {
    return this.Dne.Dne(16);
  }
  
  protected int kGO() {
    return dEr.iNH.Qnq;
  }
  
  protected boolean aFZ(sMa paramsMa) {
    chN chN = this.Dne.Dne().Dne(this.div - paramsMa.div, ((bSp)this.Dne).FWm + (this.trS / 2.0F) - paramsMa.IjH + paramsMa.c_(), this.mrb - paramsMa.mrb);
    chN = chN.Dne();
    double d1 = 16.0D;
    double d2 = this.div + (this.Dne.nextDouble() - 0.5D) * 8.0D - chN.Dne * d1;
    double d3 = this.IjH + (this.Dne.nextInt(16) - 8) - chN.FWm * d1;
    double d4 = this.mrb + (this.Dne.nextDouble() - 0.5D) * 8.0D - chN.bzF * d1;
    return bzF(d2, d3, d4);
  }
  
  protected sMa Dne() {
    FiG fiG = this.Dne.FWm(this, 64.0D);
    if (fiG != null)
      if (bzF(fiG)) {
        this.FWm = 1;
        if (this.One == 0)
          this.Dne.Dne(fiG, "mob.endermen.stare", 1.0F, 1.0F); 
        if (this.One++ == 5) {
          this.One = 0;
          FWm(true);
          return fiG;
        } 
      } else {
        this.One = 0;
      }  
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iGp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */