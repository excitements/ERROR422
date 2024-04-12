public enum RLF {
  FWm, Dne, bzF, Qnq;
  
  static {
    FWm = new RLF("WOOD_DOOR", 1);
    bzF = new RLF("GRATES", 2);
    Qnq = new RLF("IRON_DOOR", 3);
    Dne = new RLF[] { (RLF)Dne, FWm, bzF, Qnq };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RLF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */