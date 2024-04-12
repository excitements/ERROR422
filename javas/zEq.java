import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class zEq implements Map {
  private final Map Dne = new LinkedHashMap<>();
  
  public boolean containsKey(Object paramObject) {
    return this.Dne.containsKey(paramObject.toString().toLowerCase());
  }
  
  public Set entrySet() {
    return this.Dne.entrySet();
  }
  
  public Object remove(Object paramObject) {
    return this.Dne.remove(paramObject.toString().toLowerCase());
  }
  
  public Object Dne(String paramString, Object paramObject) {
    return this.Dne.put(paramString.toLowerCase(), paramObject);
  }
  
  public int size() {
    return this.Dne.size();
  }
  
  public Set keySet() {
    return this.Dne.keySet();
  }
  
  public Object get(Object paramObject) {
    return this.Dne.get(paramObject.toString().toLowerCase());
  }
  
  public Collection values() {
    return this.Dne.values();
  }
  
  public void clear() {
    this.Dne.clear();
  }
  
  public boolean containsValue(Object paramObject) {
    return this.Dne.containsKey(paramObject);
  }
  
  public Object put(Object paramObject1, Object paramObject2) {
    return Dne((String)paramObject1, paramObject2);
  }
  
  public void putAll(Map paramMap) {
    for (Map.Entry entry : paramMap.entrySet())
      Dne((String)entry.getKey(), entry.getValue()); 
  }
  
  public boolean isEmpty() {
    return this.Dne.isEmpty();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zEq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */