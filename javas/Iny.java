public class Iny extends dEr {
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    paramFiG.Dne(paramNMq);
    return paramNMq;
  }
  
  public static boolean Dne(WkD paramWkD) {
    if (paramWkD == null)
      return false; 
    if (!paramWkD.Dne("pages"))
      return false; 
    mbZ mbZ = (mbZ)paramWkD.Dne("pages");
    for (byte b = 0; b < mbZ.Dne(); b++) {
      QNx qNx = (QNx)mbZ.FWm(b);
      if (qNx.Dne == null)
        return false; 
      if (qNx.Dne.length() > 256)
        return false; 
    } 
    return true;
  }
  
  public boolean div() {
    return true;
  }
  
  static {
  
  }
  
  public Iny(int paramInt) {
    super(paramInt);
    Dne(1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Iny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */