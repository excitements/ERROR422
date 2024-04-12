public enum ACj {
  bzF, Dne, IjH, zGp, Qnq, aFZ, DyG, FWm, div;
  
  public boolean Dne(dEr paramdEr) {
    if (this == Dne)
      return true; 
    if (paramdEr instanceof Qoi) {
      if (this == FWm)
        return true; 
      Qoi qoi = (Qoi)paramdEr;
      return (qoi.Dne == null) ? ((this == zGp)) : ((qoi.Dne == 2) ? ((this == Qnq)) : ((qoi.Dne == true) ? ((this == aFZ)) : ((qoi.Dne == 3) ? ((this == bzF)) : false)));
    } 
    return (paramdEr instanceof uVe) ? ((this == DyG)) : ((paramdEr instanceof SgG) ? ((this == div)) : ((paramdEr instanceof DsI) ? ((this == IjH)) : false));
  }
  
  static {
    bzF = new ACj("armor_feet", 2);
    Qnq = new ACj("armor_legs", 3);
    aFZ = new ACj("armor_torso", 4);
    zGp = new ACj("armor_head", 5);
    DyG = new ACj("weapon", 6);
    div = new ACj("digger", 7);
    IjH = new ACj("bow", 8);
    Dne = new ACj[] { (ACj)Dne, FWm, bzF, Qnq, aFZ, zGp, DyG, div, IjH };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ACj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */