public class SAO extends Gor {
  rxL[] Dne;
  
  rxL Dne = (rxL)new rxL[8];
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b].Dne(paramFloat6); 
  }
  
  public int Dne() {
    return 5;
  }
  
  public SAO() {
    for (byte b = 0; b < this.Dne.length; b++) {
      byte b1 = 0;
      byte b2 = b;
      if (b == 2) {
        b1 = 24;
        b2 = 10;
      } else if (b == 3) {
        b1 = 24;
        b2 = 19;
      } 
      this.Dne[b] = new rxL(this, b1, b2);
      this.Dne[b].Dne(-4.0F, (16 + b), -4.0F, 8, 1, 8);
    } 
    this.Dne = new rxL(this, 0, 16);
    this.Dne.Dne(-2.0F, 18.0F, -2.0F, 4, 4, 4);
  }
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    WDT wDT = (WDT)paramFUH;
    float f = wDT.bzF + (wDT.FWm - wDT.bzF) * paramFloat3;
    if (f < 0.0F)
      f = 0.0F; 
    for (byte b = 0; b < this.Dne.length; b++)
      (this.Dne[b]).Qnq = -(4 - b) * f * 1.7F; 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */