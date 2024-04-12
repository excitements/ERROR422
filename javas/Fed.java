public class Fed extends Pdb {
  private final MqS Dne;
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    NMq nMq = null;
    onZ onZ = this.bzF.get(paramInt);
    if (onZ != null && onZ.Dne()) {
      NMq nMq1 = onZ.Dne();
      nMq = nMq1.Dne();
      if (paramInt < this.Dne.Qnq()) {
        if (!Dne(nMq1, this.Dne.Qnq(), this.bzF.size(), true))
          return null; 
      } else if (!Dne(nMq1, 0, this.Dne.Qnq(), false)) {
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
  
  public void Dne(FiG paramFiG) {
    super.Dne(paramFiG);
    this.Dne.bzF();
  }
  
  public boolean Dne(FiG paramFiG) {
    return this.Dne.Dne(paramFiG);
  }
  
  public Fed(MOS paramMOS, MqS paramMqS) {
    this.Dne = paramMqS;
    paramMqS.i_();
    byte b1 = 51;
    byte b2;
    for (b2 = 0; b2 < paramMqS.Qnq(); b2++)
      Dne(new onZ(paramMqS, b2, 44 + b2 * 18, 20)); 
    for (b2 = 0; b2 < 3; b2++) {
      for (byte b = 0; b < 9; b++)
        Dne(new onZ(paramMOS, b + b2 * 9 + 9, 8 + b * 18, b2 * 18 + b1)); 
    } 
    for (b2 = 0; b2 < 9; b2++)
      Dne(new onZ(paramMOS, b2, 8 + b2 * 18, 58 + b1)); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Fed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */