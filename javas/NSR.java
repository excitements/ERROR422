public enum NSR {
  Qnq, zGp, Dne, bzF, aFZ, FWm;
  
  static {
    bzF = new NSR("NOT_POSSIBLE_NOW", 2);
    Qnq = new NSR("TOO_FAR_AWAY", 3);
    aFZ = new NSR("OTHER_PROBLEM", 4);
    zGp = new NSR("NOT_SAFE", 5);
    Dne = (NSR)new NSR[] { Dne, FWm, bzF, Qnq, aFZ, zGp };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NSR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */