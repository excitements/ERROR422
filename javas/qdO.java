import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class qdO extends bab {
  private final List Dne;
  
  public List Dne() {
    return new ArrayList(this.Dne);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      qdO qdO1 = (qdO)paramObject;
      return this.Dne.equals(qdO1.Dne);
    } 
    return false;
  }
  
  public String Dne() {
    throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
  }
  
  qdO(Iterable paramIterable) {
    this.Dne = Dne(paramIterable);
  }
  
  private static List Dne(Iterable paramIterable) {
    return new iOH(paramIterable);
  }
  
  public int hashCode() {
    return this.Dne.hashCode();
  }
  
  public Map Dne() {
    throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
  }
  
  public String toString() {
    return "JsonArray elements:[" + this.Dne + "]";
  }
  
  public BAS Dne() {
    return BAS.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qdO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */