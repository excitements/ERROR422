public class ReE extends Pdb {
  public boolean Dne;
  
  private final FiG Dne;
  
  public Uqm Dne;
  
  public MqS Dne = new Uqm(this, 2, 2);
  
  public boolean Dne(FiG paramFiG) {
    return true;
  }
  
  public boolean Dne(NMq paramNMq, onZ paramonZ) {
    return (paramonZ.Dne != this.Dne && super.Dne(paramNMq, paramonZ));
  }
  
  public ReE(MOS paramMOS, boolean paramBoolean, FiG paramFiG) {
    this.Dne = new HuD();
    this.Dne = false;
    this.Dne = paramBoolean;
    this.Dne = (MqS)paramFiG;
    Dne(new wEm(paramMOS.Dne, this.Dne, this.Dne, 0, 144, 36));
    byte b;
    for (b = 0; b < 2; b++) {
      for (byte b1 = 0; b1 < 2; b1++)
        Dne(new onZ(this.Dne, b1 + b * 2, 88 + b1 * 18, 26 + b * 18)); 
    } 
    for (b = 0; b < 4; b++)
      Dne(new TFV(this, paramMOS, paramMOS.Qnq() - 1 - b, 8, 8 + b * 18, b)); 
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMOS, b1 + (b + 1) * 9, 8 + b1 * 18, 84 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMOS, b, 8 + b * 18, 142)); 
    Dne(this.Dne);
  }
  
  public void Dne(FiG paramFiG) {
    super.Dne(paramFiG);
    for (byte b = 0; b < 4; b++) {
      NMq nMq = this.Dne.FWm(b);
      if (nMq != null)
        paramFiG.Dne(nMq); 
    } 
    this.Dne.Dne(0, (NMq)null);
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    NMq nMq = null;
    onZ onZ = this.bzF.get(paramInt);
    if (onZ != null && onZ.Dne()) {
      NMq nMq1 = onZ.Dne();
      nMq = nMq1.Dne();
      if (paramInt == 0) {
        if (!Dne(nMq1, 9, 45, true))
          return null; 
        onZ.Dne(nMq1, nMq);
      } else if (paramInt >= 1 && paramInt < 5) {
        if (!Dne(nMq1, 9, 45, false))
          return null; 
      } else if (paramInt >= 5 && paramInt < 9) {
        if (!Dne(nMq1, 9, 45, false))
          return null; 
      } else if (nMq.Dne() instanceof Qoi && !((onZ)this.bzF.get(5 + ((Qoi)nMq.Dne()).Dne)).Dne()) {
        int i = 5 + ((Qoi)nMq.Dne()).Dne;
        if (!Dne(nMq1, i, i + 1, false))
          return null; 
      } else if (paramInt >= 9 && paramInt < 36) {
        if (!Dne(nMq1, 36, 45, false))
          return null; 
      } else if (paramInt >= 36 && paramInt < 45) {
        if (!Dne(nMq1, 9, 36, false))
          return null; 
      } else if (!Dne(nMq1, 9, 45, false)) {
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
  
  public void Dne(MqS paramMqS) {
    this.Dne.Dne(0, aXt.Dne().Dne((Uqm)this.Dne, (Qnq)((FiG)this.Dne).Dne));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ReE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */