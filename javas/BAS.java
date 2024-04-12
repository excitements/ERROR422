public enum BAS {
  FWm, zGp, Dne, Qnq, bzF, aFZ, DyG;
  
  static {
    FWm = new BAS("ARRAY", 1);
    bzF = new BAS("STRING", 2);
    Qnq = new BAS("NUMBER", 3);
    aFZ = new BAS("TRUE", 4);
    zGp = new BAS("FALSE", 5);
    DyG = new BAS("NULL", 6);
    Dne = new BAS[] { (BAS)Dne, FWm, bzF, Qnq, aFZ, zGp, DyG };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BAS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */