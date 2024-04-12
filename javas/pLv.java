import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class pLv {
  private Map Dne = new HashMap<>();
  
  public static pLv Dne = new pLv();
  
  public static String Dne(int paramInt) {
    return (String)Dne.Dne.get(Integer.valueOf(paramInt));
  }
  
  private pLv() {
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pLv.class.getResourceAsStream("/achievement/map.txt")));
      String str;
      while ((str = bufferedReader.readLine()) != null) {
        String[] arrayOfString = str.split(",");
        int i = Integer.parseInt(arrayOfString[0]);
        this.Dne.put(Integer.valueOf(i), arrayOfString[1]);
      } 
      bufferedReader.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pLv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */