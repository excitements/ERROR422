public class dnF extends qVZ {
  private int Dne;
  
  private qVZ Dne;
  
  private fZI Dne;
  
  protected String Dne = "Controls";
  
  public void Dne() {
    irb irb = irb.Dne();
    int i = Dne();
    for (byte b = 0; b < ((fZI)this.Dne).Dne.length; b++)
      this.Dne.add(new Cpw(b, i + b % 2 * 160, this.bzF / 6 + 24 * (b >> 1), 70, 20, this.Dne.FWm(b))); 
    this.Dne.add(new Pee(200, this.FWm / 2 - 100, this.bzF / 6 + 168, irb.Dne("gui.done")));
    this.Dne = irb.Dne("controls.title");
  }
  
  protected void Dne(Pee paramPee) {
    for (byte b = 0; b < ((fZI)this.Dne).Dne.length; b++)
      ((Pee)this.Dne.get(b)).Dne = this.Dne.FWm(b); 
    if (paramPee.aFZ == 200) {
      this.Dne.Dne((qVZ)this.Dne);
    } else {
      this.Dne = paramPee.aFZ;
      paramPee.Dne = "> " + this.Dne.FWm(paramPee.aFZ) + " <";
    } 
  }
  
  private int Dne() {
    return this.FWm / 2 - 155;
  }
  
  public dnF(qVZ paramqVZ, fZI paramfZI) {
    this.Dne = -1;
    this.Dne = (String)paramqVZ;
    this.Dne = (String)paramfZI;
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (this.Dne >= null) {
      this.Dne.Dne(this.Dne, paramInt);
      ((Pee)this.Dne.get(this.Dne)).Dne = this.Dne.FWm(this.Dne);
      this.Dne = -1;
      ulE.FWm();
    } else {
      super.Dne(paramChar, paramInt);
    } 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne >= null) {
      this.Dne.Dne(this.Dne, -100 + paramInt3);
      ((Pee)this.Dne.get(this.Dne)).Dne = this.Dne.FWm(this.Dne);
      this.Dne = -1;
      ulE.FWm();
    } else {
      super.Dne(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    Dne((msA)this.Dne, this.Dne, this.FWm / 2, 20, 16777215);
    int i = Dne();
    for (byte b = 0; b < ((fZI)this.Dne).Dne.length; b++) {
      boolean bool = false;
      byte b1 = 0;
      while (b1 < ((fZI)this.Dne).Dne.length) {
        if (b1 == b || ((ulE)((fZI)this.Dne).Dne[b]).Dne != ((ulE)((fZI)this.Dne).Dne[b1]).Dne) {
          b1++;
          continue;
        } 
        bool = true;
      } 
      if (this.Dne == b) {
        ((Pee)this.Dne.get(b)).Dne = "" + Dne.trS + "> " + Dne.ooe + "??? " + Dne.trS + "<";
      } else if (bool) {
        ((Pee)this.Dne.get(b)).Dne = Dne.kGO + this.Dne.FWm(b);
      } else {
        ((Pee)this.Dne.get(b)).Dne = this.Dne.FWm(b);
      } 
      FWm((msA)this.Dne, this.Dne.Dne(b), i + b % 2 * 160 + 70 + 6, this.bzF / 6 + 24 * (b >> 1) + 7, -1);
    } 
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dnF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */