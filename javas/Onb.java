import java.util.List;

public class Onb implements PAf {
  private final String Dne;
  
  public Onb(String paramString) {
    this.Dne = paramString;
    PAf.Dne.put(paramString, this);
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int Dne(List paramList) {
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Onb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */