public enum CNI {
  bzF,
  aFZ,
  Dne(0, 59, 2.0F, 0, 15),
  Qnq(0, 59, 2.0F, 0, 15),
  FWm(1, 131, 4.0F, 1, 5);
  
  private final float Dne;
  
  private final int Qnq;
  
  private final int Dne;
  
  private final int FWm;
  
  private final int bzF;
  
  public int bzF() {
    return this.Dne;
  }
  
  CNI(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = paramFloat;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
  }
  
  public int Qnq() {
    return this.Qnq;
  }
  
  public int aFZ() {
    return (this == Dne) ? ((zKP)zKP.Qnq).FWm : ((this == FWm) ? zKP.bzF.FWm : ((this == aFZ) ? dEr.mrb.Qnq : ((this == bzF) ? dEr.IjH.Qnq : ((this == Qnq) ? dEr.div.Qnq : 0))));
  }
  
  static {
    bzF = new CNI("IRON", 2, 2, 250, 6.0F, 2, 14);
    Qnq = new CNI("EMERALD", 3, 3, 1561, 8.0F, 3, 10);
    aFZ = new CNI("GOLD", 4, 0, 32, 12.0F, 0, 22);
    Dne = new CNI[] { Dne, FWm, bzF, Qnq, aFZ };
  }
  
  public int FWm() {
    return this.bzF;
  }
  
  public int Dne() {
    return this.FWm;
  }
  
  public float Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CNI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */