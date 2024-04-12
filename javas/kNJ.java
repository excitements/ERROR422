final class kNJ implements DOt {
  static {
  
  }
  
  public String Dne(int paramInt) {
    double d1 = paramInt / 20.0D;
    double d2 = d1 / 60.0D;
    double d3 = d2 / 60.0D;
    double d4 = d3 / 24.0D;
    double d5 = d4 / 365.0D;
    return (d5 > 0.5D) ? (RLC.Dne().format(d5) + " y") : ((d4 > 0.5D) ? (RLC.Dne().format(d4) + " d") : ((d3 > 0.5D) ? (RLC.Dne().format(d3) + " h") : ((d2 > 0.5D) ? (RLC.Dne().format(d2) + " m") : (d1 + " s"))));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kNJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */