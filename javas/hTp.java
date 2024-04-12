import java.util.List;

public class hTp extends Onb {
  public boolean Dne() {
    return true;
  }
  
  static {
  
  }
  
  public int Dne(List paramList) {
    float f = 0.0F;
    for (FiG fiG : paramList) {
      int i = fiG.XHL();
      float f1 = fiG.Dne();
      if (i < 0)
        i = 0; 
      if (i > f1)
        i = fiG.Dne(); 
      f += i / f1;
    } 
    if (paramList.size() > 0)
      f /= paramList.size(); 
    return geR.Dne(f * 19.0F) + ((f > 0.0F) ? 1 : 0);
  }
  
  public hTp(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hTp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */