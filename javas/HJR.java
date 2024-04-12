public class HJR extends Gor {
  rxL Dne;
  
  rxL[] Dne = new rxL[8];
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b].Dne(paramFloat6); 
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    for (rxL rxL1 : this.Dne)
      rxL1.zGp = paramFloat3; 
  }
  
  public HJR() {
    byte b = -16;
    this.Dne = (rxL[])new rxL(this, 0, 0);
    this.Dne.Dne(-6.0F, -8.0F, -6.0F, 12, 16, 12);
    ((rxL)this.Dne).Qnq += (24 + b);
    for (byte b1 = 0; b1 < this.Dne.length; b1++) {
      this.Dne[b1] = new rxL(this, 48, 0);
      double d = b1 * Math.PI * 2.0D / this.Dne.length;
      float f1 = (float)Math.cos(d) * 5.0F;
      float f2 = (float)Math.sin(d) * 5.0F;
      this.Dne[b1].Dne(-1.0F, 0.0F, -1.0F, 2, 18, 2);
      (this.Dne[b1]).bzF = f1;
      (this.Dne[b1]).aFZ = f2;
      (this.Dne[b1]).Qnq = (31 + b);
      d = b1 * Math.PI * -2.0D / this.Dne.length + 1.5707963267948966D;
      (this.Dne[b1]).DyG = (float)d;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HJR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */