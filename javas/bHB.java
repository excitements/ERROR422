import org.lwjgl.opengl.GL11;

public class bHB extends CAZ {
  private int ceE = 0;
  
  private Snh Dne;
  
  private int Vxn = 0;
  
  public void Dne() {
    this.Vxn++;
    if (this.Vxn == this.ceE)
      g_(); 
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f1 = (this.Vxn + paramFloat1) / this.ceE;
    f1 *= f1;
    float f2 = 2.0F - f1 * 2.0F;
    if (f2 > 1.0F)
      f2 = 1.0F; 
    f2 *= 0.2F;
    GL11.glDisable(2896);
    float f3 = 0.125F;
    float f4 = (float)(this.div - Dne);
    float f5 = (float)(this.IjH - FWm);
    float f6 = (float)(this.mrb - bzF);
    float f7 = this.Dne.Dne(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb));
    this.Dne.Dne("/misc/footprint.png");
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    paramWAR.Dne();
    paramWAR.Dne(f7, f7, f7, f2);
    paramWAR.Dne((f4 - f3), f5, (f6 + f3), 0.0D, 1.0D);
    paramWAR.Dne((f4 + f3), f5, (f6 + f3), 1.0D, 1.0D);
    paramWAR.Dne((f4 + f3), f5, (f6 - f3), 1.0D, 0.0D);
    paramWAR.Dne((f4 - f3), f5, (f6 - f3), 0.0D, 0.0D);
    paramWAR.Dne();
    GL11.glDisable(3042);
    GL11.glEnable(2896);
  }
  
  public int Dne() {
    return 3;
  }
  
  public bHB(Snh paramSnh, Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.Dne = paramSnh;
    this.Zpi = this.kGO = 0.0D;
    (this.kGO = 0.0D).XHL = this;
    this.ceE = 200;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bHB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */