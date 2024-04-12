public class HkG extends CAZ {
  private boolean ceE;
  
  private float Dne;
  
  private boolean Dne;
  
  private float oIf;
  
  private final BMa Dne;
  
  private int Vxn = 160;
  
  private boolean FWm;
  
  private float vSL;
  
  public float Dne(float paramFloat) {
    return 1.0F;
  }
  
  public void FWm(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public bSp Dne() {
    return null;
  }
  
  public int Dne(float paramFloat) {
    return 15728880;
  }
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    if (this.bzF++ >= this.Qnq)
      g_(); 
    if (this.bzF > this.Qnq / 2) {
      a_(1.0F - (this.bzF - (this.Qnq / 2)) / this.Qnq);
      if (this.ceE) {
        this.zGp += (this.Dne - this.zGp) * 0.2F;
        this.DyG += (this.oIf - this.DyG) * 0.2F;
        this.div += (this.vSL - this.div) * 0.2F;
      } 
    } 
    bzF(this.Vxn + 7 - this.bzF * 8 / this.Qnq);
    this.Zpi -= 0.004D;
    Dne(this.XHL, this.Zpi, this.kGO);
    this.XHL *= 0.9100000262260437D;
    this.Zpi *= 0.9100000262260437D;
    this.kGO *= 0.9100000262260437D;
    if (this.aFZ != 0.0F) {
      this.XHL *= 0.699999988079071D;
      this.kGO *= 0.699999988079071D;
    } 
    if (this.Dne != null && this.bzF < this.Qnq / 2 && (this.bzF + this.Qnq) % 2 == 0) {
      HkG hkG = new HkG((Qnq)this.Dne, this.div, this.IjH, this.mrb, 0.0D, 0.0D, 0.0D, this.Dne);
      hkG.Dne(this.zGp, this.DyG, this.div);
      hkG.bzF = hkG.Qnq / 2;
      if (this.ceE) {
        hkG.ceE = true;
        hkG.Dne = this.Dne;
        hkG.oIf = this.oIf;
        hkG.vSL = this.vSL;
      } 
      hkG.FWm = this.FWm;
      this.Dne.Dne(hkG);
    } 
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    if (!this.FWm || this.bzF < this.Qnq / 3 || (this.bzF + this.Qnq) / 3 % 2 == 0)
      super.Dne(paramWAR, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6); 
  }
  
  public void Dne(int paramInt) {
    float f1 = ((paramInt & 0xFF0000) >> 16) / 255.0F;
    float f2 = ((paramInt & 0xFF00) >> 8) / 255.0F;
    float f3 = ((paramInt & 0xFF) >> 0) / 255.0F;
    float f4 = 1.0F;
    Dne(f1 * f4, f2 * f4, f3 * f4);
  }
  
  public HkG(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, BMa paramBMa) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    this.XHL = paramDouble4;
    this.Zpi = paramDouble5;
    this.kGO = paramDouble6;
    this.Dne = paramBMa;
    this.Qnq *= 0.75F;
    this.Qnq = 48 + this.Dne.nextInt(12);
    this.kGO = false;
  }
  
  public void FWm(int paramInt) {
    this.Dne = ((paramInt & 0xFF0000) >> 16) / 255.0F;
    this.oIf = ((paramInt & 0xFF00) >> 8) / 255.0F;
    this.vSL = ((paramInt & 0xFF) >> 0) / 255.0F;
    this.ceE = true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HkG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */