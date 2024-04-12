public class WuW extends Gor {
  private rxL[] Dne;
  
  private rxL Dne = (rxL)new rxL[12];
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    float f = paramFloat3 * 3.1415927F * -0.1F;
    byte b;
    for (b = 0; b < 4; b++) {
      (this.Dne[b]).Qnq = -2.0F + geR.FWm(((b * 2) + paramFloat3) * 0.25F);
      (this.Dne[b]).bzF = geR.FWm(f) * 9.0F;
      (this.Dne[b]).aFZ = geR.Dne(f) * 9.0F;
      f++;
    } 
    f = 0.7853982F + paramFloat3 * 3.1415927F * 0.03F;
    for (b = 4; b < 8; b++) {
      (this.Dne[b]).Qnq = 2.0F + geR.FWm(((b * 2) + paramFloat3) * 0.25F);
      (this.Dne[b]).bzF = geR.FWm(f) * 7.0F;
      (this.Dne[b]).aFZ = geR.Dne(f) * 7.0F;
      f++;
    } 
    f = 0.47123894F + paramFloat3 * 3.1415927F * -0.05F;
    for (b = 8; b < 12; b++) {
      (this.Dne[b]).Qnq = 11.0F + geR.FWm((b * 1.5F + paramFloat3) * 0.5F);
      (this.Dne[b]).bzF = geR.FWm(f) * 5.0F;
      (this.Dne[b]).aFZ = geR.Dne(f) * 5.0F;
      f++;
    } 
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.Dne.zGp = paramFloat5 / 57.295776F;
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b].Dne(paramFloat6); 
  }
  
  public WuW() {
    for (byte b = 0; b < this.Dne.length; b++) {
      this.Dne[b] = new rxL(this, 0, 16);
      this.Dne[b].Dne(0.0F, 0.0F, 0.0F, 2, 8, 2);
    } 
    this.Dne = new rxL(this, 0, 0);
    this.Dne.Dne(-4.0F, -4.0F, -4.0F, 8, 8, 8);
  }
  
  public int Dne() {
    return 8;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WuW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */