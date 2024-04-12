import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class HjT extends bab {
  private final Map Dne;
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      HjT hjT = (HjT)paramObject;
      return this.Dne.equals(hjT.Dne);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.Dne.hashCode();
  }
  
  public List Dne() {
    throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
  }
  
  public String Dne() {
    throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
  }
  
  public BAS Dne() {
    return (BAS)BAS.Dne;
  }
  
  public Map Dne() {
    return new HashMap<>(this.Dne);
  }
  
  public String toString() {
    return "JsonObject fields:[" + this.Dne + "]";
  }
  
  HjT(Map<?, ?> paramMap) {
    this.Dne = new HashMap<>(paramMap);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HjT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */