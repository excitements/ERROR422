public class WXj extends Gor {
  public rxL[] Dne = new rxL[5];
  
  public WXj() {
    this.Dne[0] = new rxL(this, 0, 8);
    this.Dne[1] = new rxL(this, 0, 0);
    this.Dne[2] = new rxL(this, 0, 0);
    this.Dne[3] = new rxL(this, 0, 0);
    this.Dne[4] = new rxL(this, 0, 0);
    byte b1 = 24;
    byte b2 = 6;
    byte b3 = 20;
    byte b4 = 4;
    this.Dne[0].Dne((-b1 / 2), (-b3 / 2 + 2), -3.0F, b1, b3 - 4, 4, 0.0F);
    this.Dne[0].Dne(0.0F, b4, 0.0F);
    this.Dne[1].Dne((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
    this.Dne[1].Dne((-b1 / 2 + 1), b4, 0.0F);
    this.Dne[2].Dne((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
    this.Dne[2].Dne((b1 / 2 - 1), b4, 0.0F);
    this.Dne[3].Dne((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
    this.Dne[3].Dne(0.0F, b4, (-b3 / 2 + 1));
    this.Dne[4].Dne((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
    this.Dne[4].Dne(0.0F, b4, (b3 / 2 - 1));
    (this.Dne[0]).zGp = 1.5707964F;
    (this.Dne[1]).DyG = 4.712389F;
    (this.Dne[2]).DyG = 1.5707964F;
    (this.Dne[3]).DyG = 3.1415927F;
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    for (byte b = 0; b < 5; b++)
      this.Dne[b].Dne(paramFloat6); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WXj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */