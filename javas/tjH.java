import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class tjH {
  public bab Dne(Reader paramReader) {
    iWY iWY = new iWY();
    (new gJi()).Dne(paramReader, iWY);
    return iWY.Dne();
  }
  
  public bab Dne(String paramString) {
    try {
      return Dne(new StringReader(paramString));
    } catch (IOException iOException) {
      throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", iOException);
    } 
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tjH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */