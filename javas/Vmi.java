public class Vmi extends flF {
  private fZI Dne;
  
  public Vmi(fZI paramfZI) {
    this.Dne = paramfZI;
  }
  
  public void Dne() {
    this.Dne = 0.0F;
    this.FWm = 0.0F;
    if (((ulE)this.Dne.Dne).Dne != null)
      this.FWm++; 
    if (this.Dne.bzF.Dne != null)
      this.FWm--; 
    if (((ulE)this.Dne.FWm).Dne != null)
      this.Dne++; 
    if (this.Dne.Qnq.Dne != null)
      this.Dne--; 
    this.Dne = (fZI)this.Dne.aFZ.Dne;
    this.FWm = this.Dne.IjH.Dne;
    if (this.FWm) {
      this.Dne = (float)(this.Dne * 0.3D);
      this.FWm = (float)(this.FWm * 0.3D);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Vmi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */