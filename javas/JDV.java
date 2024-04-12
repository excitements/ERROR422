class JDV {
  static final int[] Dne = new int[(RLF.values()).length];
  
  static {
    try {
      Dne[RLF.Dne.ordinal()] = 1;
    } catch (NoSuchFieldError noSuchFieldError) {}
    try {
      Dne[RLF.FWm.ordinal()] = 2;
    } catch (NoSuchFieldError noSuchFieldError) {}
    try {
      Dne[RLF.bzF.ordinal()] = 3;
    } catch (NoSuchFieldError noSuchFieldError) {}
    try {
      Dne[RLF.Qnq.ordinal()] = 4;
    } catch (NoSuchFieldError noSuchFieldError) {}
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JDV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */