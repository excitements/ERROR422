public class fNv extends HzK {
  private final xvw Dne;
  
  public fNv(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.9F, 0.9F);
    Dne().Dne(true);
    float f = 0.25F;
    this.Dne.Dne(0, new Cyb(this));
    this.Dne.Dne(1, new xkg(this, 0.38F));
    this.Dne.Dne(2, this.Dne = new xvw(this, 0.34F));
    this.Dne.Dne(3, new znX(this, f));
    this.Dne.Dne(4, new cnh(this, 0.3F, dEr.etZ.Qnq, false));
    this.Dne.Dne(4, new cnh(this, 0.3F, dEr.dYY.Qnq, false));
    this.Dne.Dne(5, new NSW(this, 0.28F));
    this.Dne.Dne(6, new IBw(this, f));
    this.Dne.Dne(7, new yws(this, FiG.class, 6.0F));
    this.Dne.Dne(8, new cHg(this));
  }
  
  protected void eHV() {
    super.eHV();
  }
  
  protected int kGO() {
    return trS() ? dEr.LVR.Qnq : dEr.qrB.Qnq;
  }
  
  public void IjH(boolean paramBoolean) {
    if (paramBoolean) {
      this.Dne.FWm(16, Byte.valueOf((byte)1));
    } else {
      this.Dne.FWm(16, Byte.valueOf((byte)0));
    } 
  }
  
  protected String zGp() {
    return "mob.pig.say";
  }
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public boolean One() {
    NMq nMq = ((FiG)this.Dne).Dne();
    return (nMq != null && nMq.bzF == dEr.etZ.Qnq);
  }
  
  public xvw Dne() {
    return this.Dne;
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq != null && paramNMq.bzF == dEr.dYY.Qnq);
  }
  
  public void Dne(xIh paramxIh) {
    if (((Qnq)this.Dne).aFZ == null) {
      eBi eBi = new eBi((Qnq)this.Dne);
      eBi.FWm(this.div, this.IjH, this.mrb, this.mrb, this.XHL);
      this.Dne.FWm(eBi);
      g_();
    } 
  }
  
  public fNv Dne(Azh paramAzh) {
    return new fNv((Qnq)this.Dne);
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    int i = this.Dne.nextInt(3) + 1 + this.Dne.nextInt(1 + paramInt);
    for (byte b = 0; b < i; b++) {
      if (trS()) {
        Dne(dEr.LVR.Qnq, 1);
      } else {
        Dne(dEr.qrB.Qnq, 1);
      } 
    } 
    if (LVR())
      Dne(dEr.YHU.Qnq, 1); 
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, Byte.valueOf((byte)0));
  }
  
  protected String div() {
    return "mob.pig.death";
  }
  
  public int Dne() {
    return 10;
  }
  
  protected String DyG() {
    return "mob.pig.say";
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.pig.step", 0.15F, 1.0F);
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Saddle", LVR());
  }
  
  public boolean a_(FiG paramFiG) {
    if (super.a_(paramFiG))
      return true; 
    if (LVR() && ((Qnq)this.Dne).aFZ == null && (this.Dne == null || this.Dne == paramFiG)) {
      paramFiG.bzF(this);
      return true;
    } 
    return false;
  }
  
  protected void Dne(float paramFloat) {
    super.Dne(paramFloat);
    if (paramFloat > 5.0F && this.Dne instanceof FiG)
      ((FiG)this.Dne).Dne(qlg.trS); 
  }
  
  public boolean LVR() {
    return ((this.Dne.Dne(16) & 0x1) != 0);
  }
  
  public boolean tgc() {
    return true;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    IjH(paramWkD.FWm("Saddle"));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fNv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */