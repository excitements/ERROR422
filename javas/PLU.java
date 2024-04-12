public class PLU extends sHZ {
  private static gUw[][] Dne = new gUw[255][];
  
  String Dne;
  
  boolean Dne(sHZ paramsHZ) {
    return !(paramsHZ instanceof PLU) ? false : this.Dne.equals(((PLU)paramsHZ).Dne);
  }
  
  public String toString() {
    return Dne();
  }
  
  public PLU(String paramString) {
    if (!Dne(paramString))
      throw new IllegalArgumentException("string " + paramString + " not an OID"); 
    this.Dne = paramString;
  }
  
  private static boolean Dne(String paramString) {
    if (paramString.length() >= 3 && paramString.charAt(1) == '.') {
      char c = paramString.charAt(0);
      if (c >= '0' && c <= '2') {
        boolean bool = false;
        for (int i = paramString.length() - 1; i >= 2; i--) {
          char c1 = paramString.charAt(i);
          if ('0' <= c1 && c1 <= '9') {
            bool = true;
          } else {
            if (c1 != '.')
              return false; 
            if (!bool)
              return false; 
            bool = false;
          } 
        } 
        return bool;
      } 
      return false;
    } 
    return false;
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public int hashCode() {
    return this.Dne.hashCode();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PLU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */