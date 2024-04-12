public enum bfY {
  bzF, Qnq, Dne, zGp, FWm, aFZ;
  
  static {
    bzF = new bfY("SIZE_3", 2);
    Qnq = new bfY("SIZE_4", 3);
    aFZ = new bfY("SIZE_5", 4);
    zGp = new bfY("SIZE_6", 5);
    Dne = new bfY[] { (bfY)Dne, FWm, bzF, Qnq, aFZ, zGp };
  }
  
  public int Dne(double paramDouble) {
    double d = paramDouble - geR.FWm(paramDouble) + 0.5D;
    switch (DZt.Dne[ordinal()]) {
      case 1:
        if (d < 0.0D) {
          if (d < -0.3125D)
            return geR.bzF(paramDouble * 32.0D); 
        } else if (d < 0.3125D) {
          return geR.bzF(paramDouble * 32.0D);
        } 
        return geR.FWm(paramDouble * 32.0D);
      case 2:
        if (d < 0.0D) {
          if (d < -0.3125D)
            return geR.FWm(paramDouble * 32.0D); 
        } else if (d < 0.3125D) {
          return geR.FWm(paramDouble * 32.0D);
        } 
        return geR.bzF(paramDouble * 32.0D);
      case 3:
        return (d > 0.0D) ? geR.FWm(paramDouble * 32.0D) : geR.bzF(paramDouble * 32.0D);
      case 4:
        if (d < 0.0D) {
          if (d < -0.1875D)
            return geR.bzF(paramDouble * 32.0D); 
        } else if (d < 0.1875D) {
          return geR.bzF(paramDouble * 32.0D);
        } 
        return geR.FWm(paramDouble * 32.0D);
      case 5:
        if (d < 0.0D) {
          if (d < -0.1875D)
            return geR.FWm(paramDouble * 32.0D); 
        } else if (d < 0.1875D) {
          return geR.FWm(paramDouble * 32.0D);
        } 
        return geR.bzF(paramDouble * 32.0D);
    } 
    return (d > 0.0D) ? geR.bzF(paramDouble * 32.0D) : geR.FWm(paramDouble * 32.0D);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bfY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */