final class stM implements DOt {
  public String Dne(int paramInt) {
    double d1 = paramInt / 100.0D;
    double d2 = d1 / 1000.0D;
    return (d2 > 0.5D) ? (RLC.Dne().format(d2) + " km") : ((d1 > 0.5D) ? (RLC.Dne().format(d1) + " m") : (paramInt + " cm"));
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\stM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */