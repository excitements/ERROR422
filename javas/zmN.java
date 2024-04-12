public class zmN extends cMv {
  int Dne;
  
  private Qnq Dne;
  
  private FUH Dne = false;
  
  public void FWm() {
    this.Dne = false;
  }
  
  public zmN(FUH paramFUH) {
    this.Dne = paramFUH;
    this.Dne = paramFUH.Dne;
    Dne(7);
  }
  
  public void bzF() {
    this.Dne = Math.max(0, this.Dne - 1);
    if (this.Dne == 4) {
      int i = geR.FWm(this.Dne.div);
      int j = geR.FWm(this.Dne.IjH);
      int k = geR.FWm(this.Dne.mrb);
      if (this.Dne.Dne(i, j, k) == ((Tte)zKP.Dne).FWm) {
        this.Dne.Dne(i, j, k, false);
        this.Dne.qXo();
      } else if (this.Dne.Dne(i, j - 1, k) == ((ZQN)zKP.Dne).FWm) {
        this.Dne.Qnq(2001, i, j - 1, k, ((ZQN)zKP.Dne).FWm);
        this.Dne.FWm(i, j - 1, k, zKP.FWm.FWm, 0, 2);
        this.Dne.qXo();
      } 
    } 
  }
  
  public boolean FWm() {
    return (this.Dne > null);
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void Dne() {
    this.Dne = 40;
    this.Dne.Dne(this.Dne, (byte)10);
    this.Dne.Dne().FWm();
  }
  
  public boolean Dne() {
    if (this.Dne.Dne().nextInt(this.Dne.IjH() ? 50 : 1000) != 0)
      return false; 
    int i = geR.FWm(this.Dne.div);
    int j = geR.FWm(this.Dne.IjH);
    int k = geR.FWm(this.Dne.mrb);
    return (this.Dne.Dne(i, j, k) == ((Tte)zKP.Dne).FWm && this.Dne.bzF(i, j, k) == 1) ? true : ((this.Dne.Dne(i, j - 1, k) == ((ZQN)zKP.Dne).FWm));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zmN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */