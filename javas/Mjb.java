import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Mjb {
  public static final Charset Dne = Charset.forName("ISO_8859_1");
  
  public static OutputStream Dne(SecretKey paramSecretKey, OutputStream paramOutputStream) {
    return new oFT(paramOutputStream, Dne(true, paramSecretKey));
  }
  
  private static Cipher Dne(int paramInt, String paramString, Key paramKey) {
    try {
      Cipher cipher = Cipher.getInstance(paramString);
      cipher.init(paramInt, paramKey);
      return cipher;
    } catch (InvalidKeyException invalidKeyException) {
      invalidKeyException.printStackTrace();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
    } catch (NoSuchPaddingException noSuchPaddingException) {
      noSuchPaddingException.printStackTrace();
    } 
    System.err.println("Cipher creation failed!");
    return null;
  }
  
  private static byte[] Dne(int paramInt, Key paramKey, byte[] paramArrayOfbyte) {
    try {
      return Dne(paramInt, paramKey.getAlgorithm(), paramKey).doFinal(paramArrayOfbyte);
    } catch (IllegalBlockSizeException illegalBlockSizeException) {
      illegalBlockSizeException.printStackTrace();
    } catch (BadPaddingException badPaddingException) {
      badPaddingException.printStackTrace();
    } 
    System.err.println("Cipher data failed!");
    return null;
  }
  
  static {
    Security.addProvider(new pvQ());
  }
  
  public static SecretKey Dne(PrivateKey paramPrivateKey, byte[] paramArrayOfbyte) {
    return new SecretKeySpec(FWm(paramPrivateKey, paramArrayOfbyte), "AES");
  }
  
  public static InputStream Dne(SecretKey paramSecretKey, InputStream paramInputStream) {
    return new Jfy(paramInputStream, Dne(false, paramSecretKey));
  }
  
  private static tUA Dne(boolean paramBoolean, Key paramKey) {
    tUA tUA = new tUA(new WNU(new pnN(), 8));
    tUA.Dne(paramBoolean, new mpE(new Sst(paramKey.getEncoded()), paramKey.getEncoded(), 0, 16));
    return tUA;
  }
  
  public static byte[] FWm(Key paramKey, byte[] paramArrayOfbyte) {
    return Dne(2, paramKey, paramArrayOfbyte);
  }
  
  public static KeyPair Dne() {
    try {
      KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
      keyPairGenerator.initialize(1024);
      return keyPairGenerator.generateKeyPair();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
      System.err.println("Key pair generation failed!");
      return null;
    } 
  }
  
  public static PublicKey Dne(byte[] paramArrayOfbyte) {
    try {
      X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(paramArrayOfbyte);
      KeyFactory keyFactory = KeyFactory.getInstance("RSA");
      return keyFactory.generatePublic(x509EncodedKeySpec);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
    } catch (InvalidKeySpecException invalidKeySpecException) {
      invalidKeySpecException.printStackTrace();
    } 
    System.err.println("Public key reconstitute failed!");
    return null;
  }
  
  public static SecretKey Dne() {
    Xow xow = new Xow();
    xow.Dne(new qUj(new SecureRandom(), 128));
    return new SecretKeySpec(xow.Dne(), "AES");
  }
  
  public static byte[] Dne(String paramString, PublicKey paramPublicKey, SecretKey paramSecretKey) {
    try {
      return Dne("SHA-1", new byte[][] { paramString.getBytes("ISO_8859_1"), paramSecretKey.getEncoded(), paramPublicKey.getEncoded() });
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      unsupportedEncodingException.printStackTrace();
      return null;
    } 
  }
  
  public static byte[] Dne(Key paramKey, byte[] paramArrayOfbyte) {
    return Dne(1, paramKey, paramArrayOfbyte);
  }
  
  private static byte[] Dne(String paramString, byte[]... paramVarArgs) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(paramString);
      byte[][] arrayOfByte = paramVarArgs;
      int i = paramVarArgs.length;
      for (byte b = 0; b < i; b++) {
        byte[] arrayOfByte1 = arrayOfByte[b];
        messageDigest.update(arrayOfByte1);
      } 
      return messageDigest.digest();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
      return null;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Mjb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */