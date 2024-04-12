public class DAo extends ZOO {
  BRM Dne;
  
  FUH Dne;
  
  public DAo(BRM paramBRM) {
    super(paramBRM, 32.0F, false);
    this.Dne = paramBRM;
    Dne(1);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : LFUH;
    //   4: aload_0
    //   5: getfield Dne : LFUH;
    //   8: invokevirtual FWm : (LFUH;)V
    //   11: aload_0
    //   12: invokespecial Dne : ()V
    //   15: return
  }
  
  public boolean Dne() {
    if (!this.Dne.LVR())
      return false; 
    FUH fUH = this.Dne.aFZ();
    if (fUH == null)
      return false; 
    this.Dne = fUH.Dne();
    return Dne(this.Dne, false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DAo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */