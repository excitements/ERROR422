public enum TNy {
  aFZ,
  Dne(5, new int[] { 1, 3, 2, 1 }, 15),
  bzF(5, new int[] { 1, 3, 2, 1 }, 15),
  Qnq(5, new int[] { 1, 3, 2, 1 }, 15),
  FWm(15, new int[] { 2, 5, 4, 1 }, 12);
  
  private int FWm;
  
  private int[] Dne;
  
  private int Dne;
  
  public int FWm() {
    return (this == Dne) ? dEr.LoG.Qnq : ((this == FWm) ? dEr.IjH.Qnq : ((this == Qnq) ? dEr.mrb.Qnq : ((this == bzF) ? dEr.IjH.Qnq : ((this == aFZ) ? dEr.div.Qnq : 0))));
  }
  
  public int FWm(int paramInt) {
    return this.Dne[paramInt];
  }
  
  TNy(int paramInt1, int[] paramArrayOfint, int paramInt2) {
    this.Dne = paramInt1;
    this.Dne = paramArrayOfint;
    this.FWm = paramInt2;
  }
  
  public int Dne() {
    return this.FWm;
  }
  
  public int Dne(int paramInt) {
    return Qoi.Dne()[paramInt] * this.Dne;
  }
  
  static {
    bzF = new TNy("IRON", 2, 15, new int[] { 2, 6, 5, 2 }, 9);
    Qnq = new TNy("GOLD", 3, 7, new int[] { 2, 5, 3, 1 }, 25);
    aFZ = new TNy("DIAMOND", 4, 33, new int[] { 3, 8, 6, 3 }, 10);
    Dne = new TNy[] { Dne, FWm, bzF, Qnq, aFZ };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TNy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */