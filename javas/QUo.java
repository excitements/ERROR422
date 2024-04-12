import java.util.List;
import java.util.Map;

public final class QUo extends LIC implements Comparable {
  private final String Dne;
  
  public Map Dne() {
    throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
  }
  
  public int compareTo(Object paramObject) {
    return Dne((QUo)paramObject);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      QUo qUo = (QUo)paramObject;
      return this.Dne.equals(qUo.Dne);
    } 
    return false;
  }
  
  public BAS Dne() {
    return BAS.bzF;
  }
  
  public int hashCode() {
    return this.Dne.hashCode();
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public List Dne() {
    throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
  }
  
  public int Dne(QUo paramQUo) {
    return this.Dne.compareTo(paramQUo.Dne);
  }
  
  public String toString() {
    return "JsonStringNode value:[" + this.Dne + "]";
  }
  
  QUo(String paramString) {
    if (paramString == null)
      throw new NullPointerException("Attempt to construct a JsonString with a null value."); 
    this.Dne = paramString;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QUo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */