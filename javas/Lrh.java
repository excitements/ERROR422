import java.io.IOException;
import java.io.InputStream;
import paulscode.sound.codecs.CodecJOrbis;

public class Lrh extends CodecJOrbis {
  static {
  
  }
  
  protected InputStream openInputStream() {
    try {
      return new gEW(this, this.url, this.urlConnection.getInputStream());
    } catch (IOException iOException) {
      return null;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lrh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */