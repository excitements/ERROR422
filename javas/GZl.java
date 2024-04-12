import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.TreeSet;

public final class GZl implements lEc {
  private void Dne(LIC paramLIC, Writer paramWriter) {
    boolean bool = true;
    switch (CSh.Dne[paramLIC.Dne().ordinal()]) {
      case 1:
        paramWriter.append('[');
        for (LIC lIC : paramLIC.Dne()) {
          if (!bool)
            paramWriter.append(','); 
          bool = false;
          Dne(lIC, paramWriter);
        } 
        paramWriter.append(']');
        return;
      case 2:
        paramWriter.append('{');
        for (QUo qUo : new TreeSet(paramLIC.Dne().keySet())) {
          if (!bool)
            paramWriter.append(','); 
          bool = false;
          Dne(qUo, paramWriter);
          paramWriter.append(':');
          Dne((LIC)paramLIC.Dne().get(qUo), paramWriter);
        } 
        paramWriter.append('}');
        return;
      case 3:
        paramWriter.append('"').append((new QCn(paramLIC.Dne())).toString()).append('"');
        return;
      case 4:
        paramWriter.append(paramLIC.Dne());
        return;
      case 5:
        paramWriter.append("false");
        return;
      case 6:
        paramWriter.append("true");
        return;
      case 7:
        paramWriter.append("null");
        return;
    } 
    throw new RuntimeException("Coding failure in Argo:  Attempt to format a JsonNode of unknown type [" + paramLIC.Dne() + "];");
  }
  
  static {
  
  }
  
  public String Dne(bab parambab) {
    StringWriter stringWriter = new StringWriter();
    try {
      Dne(parambab, stringWriter);
    } catch (IOException iOException) {
      throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", iOException);
    } 
    return stringWriter.toString();
  }
  
  public void Dne(bab parambab, Writer paramWriter) {
    Dne(parambab, paramWriter);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GZl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */