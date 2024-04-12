import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class uOw {
  static {
  
  }
  
  private static boolean Dne(Field paramField) {
    return Modifier.isStatic(paramField.getModifiers());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("{");
    for (Field field : getClass().getFields()) {
      if (!Dne(field))
        try {
          stringBuilder.append(field.getName()).append("=").append(field.get(this)).append(" ");
        } catch (IllegalAccessException illegalAccessException) {} 
    } 
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uOw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */