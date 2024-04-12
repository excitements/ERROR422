public enum UVr {
  Dne, bzF, FWm;
  
  static {
    bzF = new UVr("players", 2);
    Dne = new UVr[] { (UVr)Dne, FWm, bzF };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UVr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */