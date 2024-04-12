public class Ext {
  public static final int[] Dne = new int[(ZPT.values()).length];
  
  static {
    try {
      Dne[ZPT.Dne.ordinal()] = 1;
    } catch (NoSuchFieldError noSuchFieldError) {}
    try {
      Dne[ZPT.FWm.ordinal()] = 2;
    } catch (NoSuchFieldError noSuchFieldError) {}
    try {
      Dne[ZPT.bzF.ordinal()] = 3;
    } catch (NoSuchFieldError noSuchFieldError) {}
    try {
      Dne[ZPT.Qnq.ordinal()] = 4;
    } catch (NoSuchFieldError noSuchFieldError) {}
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */