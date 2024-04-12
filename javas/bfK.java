public class bfK extends fsj {
  static {
  
  }
  
  public bfK(float paramFloat) {
    super(paramFloat, 0.0F, 64, 32);
    this.Qnq.Dne(-1.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
    this.Qnq.Dne(-5.0F, 2.0F, 0.0F);
    this.aFZ = new rxL(this, 40, 16);
    this.aFZ.Dne = true;
    this.aFZ.Dne(-1.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
    this.aFZ.Dne(5.0F, 2.0F, 0.0F);
    this.zGp = new rxL(this, 0, 16);
    this.zGp.Dne(-1.0F, 0.0F, -1.0F, 2, 12, 2, paramFloat);
    this.zGp.Dne(-2.0F, 12.0F, 0.0F);
    this.DyG = new rxL(this, 0, 16);
    this.DyG.Dne = true;
    this.DyG.Dne(-1.0F, 0.0F, -1.0F, 2, 12, 2, paramFloat);
    this.DyG.Dne(2.0F, 12.0F, 0.0F);
  }
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.Qnq = (((yXX)paramFUH).bzF() == 1) ? 1 : 0;
    super.Dne(paramFUH, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public bfK() {
    this(0.0F);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bfK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */