import java.util.Calendar;

public class oaw extends ifA {
  private iSh Dne;
  
  public int Dne() {
    return 6;
  }
  
  protected String zGp() {
    return (haP() && this.Dne.nextInt(4) != 0) ? null : "mob.bat.idle";
  }
  
  public void FWm(boolean paramBoolean) {
    byte b = this.Dne.Dne(16);
    if (paramBoolean) {
      this.Dne.FWm(16, Byte.valueOf((byte)(b | 0x1)));
    } else {
      this.Dne.FWm(16, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
    } 
  }
  
  protected float DyG() {
    return super.DyG() * 0.95F;
  }
  
  protected String DyG() {
    return "mob.bat.hurt";
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    this.Dne.FWm(16, Byte.valueOf(paramWkD.Dne("BatFlags")));
  }
  
  protected String div() {
    return "mob.bat.death";
  }
  
  protected void eHV() {
    super.eHV();
    if (haP()) {
      if (!this.Dne.DyG(geR.FWm(this.div), (int)this.IjH + 1, geR.FWm(this.mrb))) {
        FWm(false);
        this.Dne.Dne((FiG)null, 1015, (int)this.div, (int)this.IjH, (int)this.mrb, 0);
      } else {
        if (this.Dne.nextInt(200) == 0)
          this.vSL = this.Dne.nextInt(360); 
        if (this.Dne.Dne(this, 4.0D) != null) {
          FWm(false);
          this.Dne.Dne((FiG)null, 1015, (int)this.div, (int)this.IjH, (int)this.mrb, 0);
        } 
      } 
    } else {
      if (this.Dne != null && (!this.Dne.Dne(this.Dne.Dne, this.Dne.FWm, this.Dne.bzF) || this.Dne.FWm < 1))
        this.Dne = null; 
      if (this.Dne == null || this.Dne.nextInt(30) == 0 || this.Dne.Dne((int)this.div, (int)this.IjH, (int)this.mrb) < 4.0F)
        this.Dne = new iSh((int)this.div + this.Dne.nextInt(7) - this.Dne.nextInt(7), (int)this.IjH + this.Dne.nextInt(6) - 2, (int)this.mrb + this.Dne.nextInt(7) - this.Dne.nextInt(7)); 
      double d1 = this.Dne.Dne + 0.5D - this.div;
      double d2 = this.Dne.FWm + 0.1D - this.IjH;
      double d3 = this.Dne.bzF + 0.5D - this.mrb;
      this.XHL += (Math.signum(d1) * 0.5D - this.XHL) * 0.10000000149011612D;
      this.Zpi += (Math.signum(d2) * 0.699999988079071D - this.Zpi) * 0.10000000149011612D;
      this.kGO += (Math.signum(d3) * 0.5D - this.kGO) * 0.10000000149011612D;
      float f1 = (float)(Math.atan2(this.kGO, this.XHL) * 180.0D / Math.PI) - 90.0F;
      float f2 = geR.aFZ(f1 - this.mrb);
      this.FYZ = 0.5F;
      this.mrb += f2;
      if (this.Dne.nextInt(100) == 0 && this.Dne.DyG(geR.FWm(this.div), (int)this.IjH + 1, geR.FWm(this.mrb)))
        FWm(true); 
    } 
  }
  
  protected void Dne(double paramDouble, boolean paramBoolean) {}
  
  public boolean haP() {
    return ((this.Dne.Dne(16) & 0x1) != 0);
  }
  
  public void ICU() {}
  
  protected boolean tgc() {
    return true;
  }
  
  protected float div() {
    return 0.1F;
  }
  
  public boolean FfS() {
    return true;
  }
  
  protected void eJi() {}
  
  protected void div(sMa paramsMa) {}
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("BatFlags", this.Dne.Dne(16));
  }
  
  protected void Dne(float paramFloat) {}
  
  protected boolean FWm() {
    return false;
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if (((Qnq)this.Dne).aFZ == null && haP())
      FWm(false); 
    return super.Dne(paramzBn, paramInt);
  }
  
  public boolean cot() {
    int i = geR.FWm(((bSp)this.Dne).FWm);
    if (i >= 63)
      return false; 
    int j = geR.FWm(this.div);
    int k = geR.FWm(this.mrb);
    int m = this.Dne.aFZ(j, i, k);
    byte b = 4;
    Calendar calendar = this.Dne.Dne();
    if ((calendar.get(2) + 1 != 10 || calendar.get(5) < 20) && (calendar.get(2) + 1 != 11 || calendar.get(5) > 3)) {
      if (this.Dne.nextBoolean())
        return false; 
    } else {
      b = 7;
    } 
    return (m > this.Dne.nextInt(b)) ? false : super.cot();
  }
  
  public oaw(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.5F, 0.9F);
    FWm(true);
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, new Byte((byte)0));
  }
  
  public void Dne() {
    super.Dne();
    this.Zpi = this.kGO = 0.0D;
    (this.kGO = 0.0D).XHL = this;
    this.IjH = geR.FWm(this.IjH) + 1.0D - this.trS;
    this.Zpi *= 0.6000000238418579D;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oaw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */