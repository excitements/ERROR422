public enum HQH {
  bzF,
  Qnq,
  zGp,
  aFZ,
  Dne(0, 1, 0, -1, 0),
  FWm(1, 0, 0, 1, 0);
  
  private static final HQH[] Dne;
  
  private final int Dne;
  
  private final int Qnq;
  
  private final int bzF;
  
  private final int FWm;
  
  private final int aFZ;
  
  public int bzF() {
    return this.aFZ;
  }
  
  public int Dne() {
    return this.bzF;
  }
  
  public int FWm() {
    return this.Qnq;
  }
  
  public static HQH Dne(int paramInt) {
    return Dne[paramInt % Dne.length];
  }
  
  static {
    bzF = new HQH("NORTH", 2, 2, 3, 0, 0, -1);
    Qnq = new HQH("SOUTH", 3, 3, 2, 0, 0, 1);
    aFZ = new HQH("EAST", 4, 4, 5, -1, 0, 0);
    zGp = new HQH("WEST", 5, 5, 4, 1, 0, 0);
    FWm = (HQH)new HQH[] { Dne, FWm, bzF, Qnq, aFZ, zGp };
    Dne = (HQH)new HQH[6];
    for (HQH hQH : values())
      Dne[hQH.Dne] = hQH; 
  }
  
  HQH(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.aFZ = paramInt5;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HQH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */