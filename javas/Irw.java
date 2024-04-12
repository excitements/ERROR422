public class Irw extends Gor {
  rxL bzF;
  
  rxL Dne;
  
  rxL FWm;
  
  rxL Qnq;
  
  public Irw(int paramInt) {
    this.Dne = new rxL(this, 0, paramInt);
    this.Dne.Dne(-4.0F, 16.0F, -4.0F, 8, 8, 8);
    if (paramInt > 0) {
      this.Dne = new rxL(this, 0, paramInt);
      this.Dne.Dne(-3.0F, 17.0F, -3.0F, 6, 6, 6);
      this.FWm = new rxL(this, 32, 0);
      this.FWm.Dne(-3.25F, 18.0F, -3.5F, 2, 2, 2);
      this.bzF = new rxL(this, 32, 4);
      this.bzF.Dne(1.25F, 18.0F, -3.5F, 2, 2, 2);
      this.Qnq = new rxL(this, 32, 8);
      this.Qnq.Dne(0.0F, 21.0F, -3.5F, 1, 1, 1);
    } 
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    if (this.FWm != null) {
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Irw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */