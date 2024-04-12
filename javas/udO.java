public enum udO {
  Dne(15),
  FWm(0);
  
  public final int Dne;
  
  static {
    Dne = new udO[] { (udO)Dne, FWm };
  }
  
  udO(int paramInt1) {
    this.Dne = paramInt1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\udO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */