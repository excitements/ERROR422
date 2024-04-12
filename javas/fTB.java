public class fTB extends pam {
  private RPI Dne;
  
  public void Dne(RPI paramRPI) {
    this.Dne = paramRPI;
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public fTB() {
    super("container.enderchest", false, 27);
  }
  
  public void Dne(mbZ parammbZ) {
    byte b;
    for (b = 0; b < Qnq(); b++)
      Dne(b, (NMq)null); 
    for (b = 0; b < parammbZ.Dne(); b++) {
      WkD wkD = (WkD)parammbZ.FWm(b);
      int i = wkD.Dne("Slot") & 0xFF;
      if (i >= 0 && i < Qnq())
        Dne(i, NMq.Dne(wkD)); 
    } 
  }
  
  public void bzF() {
    if (this.Dne != null)
      this.Dne.bzF(); 
    super.bzF();
    this.Dne = null;
  }
  
  public void i_() {
    if (this.Dne != null)
      this.Dne.FWm(); 
    super.i_();
  }
  
  public mbZ Dne() {
    mbZ mbZ = new mbZ("EnderItems");
    for (byte b = 0; b < Qnq(); b++) {
      NMq nMq = Dne(b);
      if (nMq != null) {
        WkD wkD = new WkD();
        wkD.Dne("Slot", (byte)b);
        nMq.Dne(wkD);
        mbZ.Dne(wkD);
      } 
    } 
    return mbZ;
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne != null && !this.Dne.Dne(paramFiG)) ? false : super.Dne(paramFiG);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fTB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */