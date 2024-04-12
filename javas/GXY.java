public enum GXY {
  FWm,
  bzF,
  Dne(15, "Common"),
  Qnq(15, "Common");
  
  public final String Dne;
  
  public final int Dne;
  
  GXY(int paramInt1, String paramString1) {
    this.Dne = paramInt1;
    this.Dne = (GXY)paramString1;
  }
  
  static {
    FWm = new GXY("uncommon", 1, 14, "Uncommon");
    bzF = new GXY("rare", 2, 11, "Rare");
    Qnq = new GXY("epic", 3, 13, "Epic");
    Dne = (GXY)new GXY[] { Dne, FWm, bzF, Qnq };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GXY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */