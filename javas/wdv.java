public final class wdv {
  public static String Dne(String paramString) {
    boolean bool = false;
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b = 0; b != arrayOfChar.length; b++) {
      char c = arrayOfChar[b];
      if ('A' <= c && 'Z' >= c) {
        bool = true;
        arrayOfChar[b] = (char)(c - 65 + 97);
      } 
    } 
    return bool ? new String(arrayOfChar) : paramString;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wdv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */