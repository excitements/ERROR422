public class uxm extends cMv {
  private Qnq Dne;
  
  uQr Dne;
  
  private int Dne;
  
  private pjB Dne = false;
  
  private pjB FWm;
  
  private void Qnq() {
    pjB pjB1 = this.Dne.Dne(this.FWm);
    this.FWm.FWm(6000);
    this.Dne.FWm(6000);
    pjB1.FWm(-24000);
    pjB1.FWm(this.Dne.div, this.Dne.IjH, this.Dne.mrb, 0.0F, 0.0F);
    this.Dne.FWm(pjB1);
    this.Dne.Dne(pjB1, (byte)12);
  }
  
  public uxm(pjB parampjB) {
    this.Dne = parampjB;
    this.Dne = (pjB)parampjB.Dne;
    Dne(3);
  }
  
  public boolean FWm() {
    return (this.Dne >= null && bzF() && this.Dne.bzF() == 0);
  }
  
  public void bzF() {
    this.Dne--;
    this.Dne.Dne().Dne(this.FWm, 10.0F, 30.0F);
    if (this.Dne.Dne(this.FWm) > 2.25D) {
      this.Dne.Dne().Dne(this.FWm, 0.25F);
    } else if (this.Dne == null && this.FWm.LVR()) {
      Qnq();
    } 
    if (this.Dne.Dne().nextInt(35) == 0)
      this.Dne.Dne(this.Dne, (byte)12); 
  }
  
  public void FWm() {
    this.Dne = null;
    this.FWm = null;
    this.Dne.IjH(false);
  }
  
  public boolean Dne() {
    if (this.Dne.bzF() != 0)
      return false; 
    if (this.Dne.Dne().nextInt(500) != 0)
      return false; 
    this.Dne = (pjB)((Qnq)this.Dne).Dne.Dne(geR.FWm(this.Dne.div), geR.FWm(this.Dne.IjH), geR.FWm(this.Dne.mrb), 0);
    if (this.Dne == null)
      return false; 
    if (!bzF())
      return false; 
    sMa sMa = this.Dne.Dne(pjB.class, this.Dne.Dne.FWm(8.0D, 3.0D, 8.0D), this.Dne);
    if (sMa == null)
      return false; 
    this.FWm = (pjB)sMa;
    return (this.FWm.bzF() == 0);
  }
  
  public void Dne() {
    this.Dne = 'Ĭ';
    this.Dne.IjH(true);
  }
  
  private boolean bzF() {
    if (!this.Dne.FWm())
      return false; 
    int i = (int)(this.Dne.FWm() * 0.35D);
    return (this.Dne.Qnq() < i);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uxm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */