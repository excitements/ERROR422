import java.util.HashMap;
import java.util.Map;

public class qXI {
  private static final Object Dne;
  
  private static final Map FWm;
  
  public static boolean Dne = true;
  
  private static final Map Dne = new HashMap<>();
  
  public static void Dne(int paramInt, long paramLong) {
    if (Dne != null) {
      Map map = Dne;
      synchronized (Dne) {
        if (Dne.containsKey(Integer.valueOf(paramInt))) {
          Dne.put(Integer.valueOf(paramInt), Long.valueOf(((Long)Dne.get(Integer.valueOf(paramInt))).longValue() + 1L));
          FWm.put(Integer.valueOf(paramInt), Long.valueOf(((Long)FWm.get(Integer.valueOf(paramInt))).longValue() + paramLong));
        } else {
          Dne.put(Integer.valueOf(paramInt), Long.valueOf(1L));
          FWm.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
        } 
      } 
    } 
  }
  
  static {
    FWm = new HashMap<>();
    Dne = (Map)new Object();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qXI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */