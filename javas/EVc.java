public class EVc extends Gor {
  public rxL Dne;
  
  public EVc(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.Dne = new rxL(this, paramInt1, paramInt2);
    this.Dne.Dne(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
    this.Dne.Dne(0.0F, 0.0F, 0.0F);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.Dne.zGp = paramFloat5 / 57.295776F;
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
  }
  
  public EVc() {
    this(0, 35, 64, 64);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EVc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */