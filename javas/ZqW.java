public class ZqW extends Pdb {
  private int FWm;
  
  private MqS Dne;
  
  public boolean Dne(FiG paramFiG) {
    return this.Dne.Dne(paramFiG);
  }
  
  public ZqW(MqS paramMqS1, MqS paramMqS2) {
    this.Dne = paramMqS2;
    this.FWm = paramMqS2.Qnq() / 9;
    paramMqS2.i_();
    int i = (this.FWm - 4) * 18;
    byte b;
    for (b = 0; b < this.FWm; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMqS2, b1 + b * 9, 8 + b1 * 18, 18 + b * 18)); 
    } 
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMqS1, b1 + b * 9 + 9, 8 + b1 * 18, 103 + b * 18 + i)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMqS1, b, 8 + b * 18, 161 + i)); 
  }
  
  public void Dne(FiG paramFiG) {
    super.Dne(paramFiG);
    this.Dne.bzF();
  }
  
  public MqS Dne() {
    return this.Dne;
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    NMq nMq = null;
    onZ onZ = this.bzF.get(paramInt);
    if (onZ != null && onZ.Dne()) {
      NMq nMq1 = onZ.Dne();
      nMq = nMq1.Dne();
      if (paramInt < this.FWm * 9) {
        if (!Dne(nMq1, this.FWm * 9, this.bzF.size(), true))
          return null; 
      } else if (!Dne(nMq1, 0, this.FWm * 9, false)) {
        return null;
      } 
      if (nMq1.Dne == 0) {
        onZ.Dne((NMq)null);
      } else {
        onZ.Dne();
      } 
    } 
    return nMq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZqW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */