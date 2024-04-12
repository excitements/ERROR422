import java.util.regex.Pattern;

public class vCA {
  private static final Pattern Dne = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
  
  public static String Dne(int paramInt) {
    int i = paramInt / 20;
    int j = i / 60;
    i %= 60;
    return (i < 10) ? (j + ":0" + i) : (j + ":" + i);
  }
  
  public static String Dne(String paramString) {
    return Dne.matcher(paramString).replaceAll("");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vCA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */