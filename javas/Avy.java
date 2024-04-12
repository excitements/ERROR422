import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class Avy extends LIC {
  private static final Pattern Dne = Pattern.compile("(-?)(0|([1-9]([0-9]*)))(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?");
  
  private final String Dne;
  
  public String Dne() {
    return this.Dne;
  }
  
  Avy(String paramString) {
    if (paramString == null)
      throw new NullPointerException("Attempt to construct a JsonNumber with a null value."); 
    if (!Dne.matcher(paramString).matches())
      throw new IllegalArgumentException("Attempt to construct a JsonNumber with a String [" + paramString + "] that does not match the JSON number specification."); 
    this.Dne = paramString;
  }
  
  public String toString() {
    return "JsonNumberNode value:[" + this.Dne + "]";
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      Avy avy = (Avy)paramObject;
      return this.Dne.equals(avy.Dne);
    } 
    return false;
  }
  
  public List Dne() {
    throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
  }
  
  public int hashCode() {
    return this.Dne.hashCode();
  }
  
  public Map Dne() {
    throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
  }
  
  public BAS Dne() {
    return BAS.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Avy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */