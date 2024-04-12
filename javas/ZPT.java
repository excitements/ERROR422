public enum ZPT {
  aFZ, FWm, bzF, Dne, Qnq;
  
  static {
    FWm = new ZPT("SOLARIS", 1);
    bzF = new ZPT("WINDOWS", 2);
    Qnq = new ZPT("MACOS", 3);
    aFZ = new ZPT("UNKNOWN", 4);
    Dne = (ZPT)new ZPT[] { Dne, FWm, bzF, Qnq, aFZ };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZPT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */