public class HnX extends Pdb {
  private UTs Dne;
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    NMq nMq = null;
    onZ onZ = this.bzF.get(paramInt);
    if (onZ != null && onZ.Dne()) {
      NMq nMq1 = onZ.Dne();
      nMq = nMq1.Dne();
      if (paramInt < 9) {
        if (!Dne(nMq1, 9, 45, true))
          return null; 
      } else if (!Dne(nMq1, 0, 9, false)) {
        return null;
      } 
      if (nMq1.Dne == 0) {
        onZ.Dne((NMq)null);
      } else {
        onZ.Dne();
      } 
      if (nMq1.Dne == nMq.Dne)
        return null; 
      onZ.Dne(paramFiG, nMq1);
    } 
    return nMq;
  }
  
  public boolean Dne(FiG paramFiG) {
    return this.Dne.Dne(paramFiG);
  }
  
  public HnX(MqS paramMqS, UTs paramUTs) {
    this.Dne = paramUTs;
    byte b;
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 3; b1++)
        Dne(new onZ(paramUTs, b1 + b * 3, 62 + b1 * 18, 17 + b * 18)); 
    } 
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMqS, b1 + b * 9 + 9, 8 + b1 * 18, 84 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMqS, b, 8 + b * 18, 142)); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HnX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */