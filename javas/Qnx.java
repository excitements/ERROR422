import org.lwjgl.opengl.GL11;

public class Qnx extends CAZ {
  private int ceE = 0;
  
  private float Dne;
  
  private sMa Qnq;
  
  private sMa bzF;
  
  private int Vxn = 0;
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f1 = (this.Vxn + paramFloat1) / this.ceE;
    f1 *= f1;
    boolean bool = this.bzF.div;
    double d1 = this.bzF.IjH;
    float f2 = this.bzF.mrb;
    double d2 = this.Qnq.udO + (this.Qnq.div - this.Qnq.udO) * paramFloat1;
    double d3 = this.Qnq.ooe + (this.Qnq.IjH - this.Qnq.ooe) * paramFloat1 + this.Dne;
    double d4 = this.Qnq.trS + (this.Qnq.mrb - this.Qnq.trS) * paramFloat1;
    double d5 = bool + (d2 - bool) * f1;
    double d6 = d1 + (d3 - d1) * f1;
    double d7 = f2 + (d4 - f2) * f1;
    int i = geR.FWm(d5);
    int j = geR.FWm(d6 + (this.udO / 2.0F));
    int k = geR.FWm(d7);
    int m = Dne(paramFloat1);
    int n = m % 65536;
    int i1 = m / 65536;
    oCF.Dne(oCF.FWm, n / 1.0F, i1 / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    d5 -= Dne;
    d6 -= FWm;
    d7 -= bzF;
    ptH.Dne.Dne(this.bzF, (float)d5, (float)d6, (float)d7, this.bzF.mrb, paramFloat1);
  }
  
  public void Dne() {
    this.Vxn++;
    if (this.Vxn == this.ceE)
      g_(); 
  }
  
  public int Dne() {
    return 3;
  }
  
  public Qnx(Qnq paramQnq, sMa paramsMa1, sMa paramsMa2, float paramFloat) {
    super(paramQnq, paramsMa1.div, paramsMa1.IjH, paramsMa1.mrb, paramsMa1.XHL, paramsMa1.Zpi, paramsMa1.kGO);
    this.bzF = paramsMa1;
    this.Qnq = paramsMa2;
    this.ceE = 3;
    this.Dne = paramFloat;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Qnx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */