public class oss extends Pdb {
  private int FWm = 0;
  
  private zio Dne;
  
  private final onZ Dne;
  
  public void Dne(int paramInt1, int paramInt2) {
    if (paramInt1 == 0)
      this.Dne.Dne(paramInt2); 
  }
  
  public oss(MOS paramMOS, zio paramzio) {
    this.Dne = (onZ)paramzio;
    Dne(new vqi(paramMOS.Dne, paramzio, 0, 56, 46));
    Dne(new vqi(paramMOS.Dne, paramzio, 1, 79, 53));
    Dne(new vqi(paramMOS.Dne, paramzio, 2, 102, 46));
    this.Dne = Dne(new EDM(this, paramzio, 3, 79, 17));
    byte b;
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMOS, b1 + b * 9 + 9, 8 + b1 * 18, 84 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMOS, b, 8 + b * 18, 142)); 
  }
  
  public boolean Dne(FiG paramFiG) {
    return this.Dne.Dne(paramFiG);
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    NMq nMq = null;
    onZ onZ1 = this.bzF.get(paramInt);
    if (onZ1 != null && onZ1.Dne()) {
      NMq nMq1 = onZ1.Dne();
      nMq = nMq1.Dne();
      if ((paramInt < 0 || paramInt > 2) && paramInt != 3) {
        if (!this.Dne.Dne() && this.Dne.Dne(nMq1)) {
          if (!Dne(nMq1, 3, 4, false))
            return null; 
        } else if (vqi.FWm(nMq)) {
          if (!Dne(nMq1, 0, 3, false))
            return null; 
        } else if (paramInt >= 4 && paramInt < 31) {
          if (!Dne(nMq1, 31, 40, false))
            return null; 
        } else if (paramInt >= 31 && paramInt < 40) {
          if (!Dne(nMq1, 4, 31, false))
            return null; 
        } else if (!Dne(nMq1, 4, 40, false)) {
          return null;
        } 
      } else {
        if (!Dne(nMq1, 4, 40, true))
          return null; 
        onZ1.Dne(nMq1, nMq);
      } 
      if (nMq1.Dne == 0) {
        onZ1.Dne((NMq)null);
      } else {
        onZ1.Dne();
      } 
      if (nMq1.Dne == nMq.Dne)
        return null; 
      onZ1.Dne(paramFiG, nMq1);
    } 
    return nMq;
  }
  
  public void Dne() {
    super.Dne();
    for (byte b = 0; b < this.Qnq.size(); b++) {
      mXX mXX = this.Qnq.get(b);
      if (this.FWm != this.Dne.Dne())
        mXX.Dne(this, 0, this.Dne.Dne()); 
    } 
    this.FWm = this.Dne.Dne();
  }
  
  public void Dne(mXX parammXX) {
    super.Dne(parammXX);
    parammXX.Dne(this, 0, this.Dne.Dne());
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oss.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */