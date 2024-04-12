import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAQ {
  public static final char[] Dne;
  
  public static final String Dne = Dne();
  
  private static String Dne() {
    String str = "";
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(BAQ.class.getResourceAsStream("/font.txt"), "UTF-8"));
      String str1 = "";
      while ((str1 = bufferedReader.readLine()) != null) {
        if (!str1.startsWith("#"))
          str = str + str1; 
      } 
      bufferedReader.close();
    } catch (Exception exception) {}
    return str;
  }
  
  public static String Dne(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : paramString.toCharArray()) {
      if (Dne(c))
        stringBuilder.append(c); 
    } 
    return stringBuilder.toString();
  }
  
  public static final boolean Dne(char paramChar) {
    return (paramChar != '§' && (Dne.indexOf(paramChar) >= 0 || paramChar > ' '));
  }
  
  static {
    Dne = (String)new char[] { 
        '/', '\n', '\r', '\t', Character.MIN_VALUE, '\f', '`', '?', '*', '\\', 
        '<', '>', '|', '"', ':' };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BAQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */