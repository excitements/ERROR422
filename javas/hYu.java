import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hYu {
  private String Dne;
  
  public String Dne(String paramString) {
    try {
      String str = this.Dne + paramString;
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      messageDigest.update(str.getBytes(), 0, str.length());
      return (new BigInteger(1, messageDigest.digest())).toString(16);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new RuntimeException(noSuchAlgorithmException);
    } 
  }
  
  public hYu(String paramString) {
    this.Dne = paramString;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hYu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */