class cES extends Vdw {
  private final int zGp;
  
  private final int DyG;
  
  final wiU Dne;
  
  public cES(wiU paramwiU, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramInt1, paramInt2, paramInt3, "/gui/inventory.png", 0 + SXd.Dne[paramInt4].FWm() % 8 * 18, 198 + SXd.Dne[paramInt4].FWm() / 8 * 18);
    this.Dne = paramwiU;
    this.zGp = paramInt4;
    this.DyG = paramInt5;
  }
  
  public void FWm(int paramInt1, int paramInt2) {
    String str = KGL.Dne(SXd.Dne[this.zGp].Dne());
    if (this.DyG >= 3 && this.zGp != SXd.XHL.Dne)
      str = str + " II"; 
    this.Dne.Dne(str, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cES.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */