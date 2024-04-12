import net.minecraft.client.Minecraft;

public class hIH extends FiG {
  private double Dne;
  
  private double FWm;
  
  private boolean Dne;
  
  private double gnI;
  
  private int Dne = 0;
  
  private double tgc;
  
  private double Fnk;
  
  public iSh Dne() {
    return new iSh(geR.FWm(this.div + 0.5D), geR.FWm(this.IjH + 0.5D), geR.FWm(this.mrb + 0.5D));
  }
  
  public void Dne() {
    this.JLG = 0.0F;
    super.Dne();
    this.haP = this.qrB;
    double d1 = this.div - this.aFZ;
    double d2 = this.mrb - this.DyG;
    float f = geR.Dne(d1 * d1 + d2 * d2) * 4.0F;
    if (f > 1.0F)
      f = 1.0F; 
    this.qrB += (f - this.qrB) * 0.4F;
    this.LVR += this.qrB;
    if (this.Dne == 0 && ceE() && this.Dne.Dne[this.Dne.Dne] != null) {
      boolean bool = this.Dne.Dne[this.Dne.Dne];
      Dne(this.Dne.Dne[this.Dne.Dne], dEr.Dne[bool.bzF].a_(bool));
      this.Dne = 1;
    } else if (this.Dne != 0 && !ceE()) {
      FYZ();
      this.Dne = 0;
    } 
  }
  
  public boolean Dne(int paramInt, String paramString) {
    return false;
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    return true;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.Fnk = paramDouble3;
    this.gnI = paramFloat1;
    this.tgc = paramFloat2;
    this.Dne = paramInt;
  }
  
  public void IjH() {
    div();
    if (this.Dne > 0) {
      double d1 = this.div + (this.Dne - this.div) / this.Dne;
      double d2 = this.IjH + (this.FWm - this.IjH) / this.Dne;
      double d3 = this.mrb + (this.Fnk - this.mrb) / this.Dne;
      double d4;
      for (d4 = this.gnI - this.mrb; d4 < -180.0D; d4 += 360.0D);
      while (d4 >= 180.0D)
        d4 -= 360.0D; 
      this.mrb = (float)(this.mrb + d4 / this.Dne);
      this.XHL = (float)(this.XHL + (this.tgc - this.XHL) / this.Dne);
      this.Dne--;
      bzF(d1, d2, d3);
      FWm(this.mrb, this.XHL);
    } 
    this.xXN = this.IYC;
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
  }
  
  public void mrb() {
    this.FWm = "http://skins.minecraft.net/MinecraftCloaks/" + vCA.Dne(this.aFZ) + ".png";
  }
  
  protected void zGp() {
    this.udO = 0.0F;
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  public float c_() {
    return 1.82F;
  }
  
  public hIH(Qnq paramQnq, String paramString) {
    super(paramQnq);
    this.aFZ = paramString;
    this.udO = 0.0F;
    this.FfS = 0.0F;
    if (paramString != null && paramString.length() > 0)
      this.Dne = "http://skins.minecraft.net/MinecraftSkins/" + vCA.Dne(paramString) + ".png"; 
    this.kGO = true;
    this.JLG = 0.25F;
    this.Qnq = 10.0D;
  }
  
  public void Dne(String paramString) {
    (Minecraft.Dne()).Dne.Dne().Dne(paramString);
  }
  
  public void a_(int paramInt, NMq paramNMq) {
    if (paramInt == 0) {
      this.Dne.Dne[this.Dne.Dne] = paramNMq;
    } else {
      this.Dne.FWm[paramInt - 1] = paramNMq;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hIH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */