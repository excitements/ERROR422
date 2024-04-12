import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class EKF {
  protected HttpURLConnection Dne;
  
  private boolean Dne;
  
  protected String Dne;
  
  public void Dne(String paramString1, String paramString2) {
    String str = this.Dne.getRequestProperty("Cookie");
    if (str == null) {
      this.Dne.setRequestProperty("Cookie", paramString1 + "=" + paramString2);
    } else {
      this.Dne.setRequestProperty("Cookie", str + ";" + paramString1 + "=" + paramString2);
    } 
  }
  
  public static EKF Dne(String paramString1, String paramString2) {
    return new LHI(paramString1, paramString2.getBytes(), 5000, 10000);
  }
  
  protected abstract EKF FWm();
  
  public static EKF FWm(String paramString) {
    return new Uzh(paramString, 5000, 10000);
  }
  
  public static EKF FWm(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    return new qKy(paramString1, paramString2.getBytes(), paramInt1, paramInt2);
  }
  
  private void Dne() {
    byte[] arrayOfByte = new byte[1024];
    try {
      boolean bool = false;
      InputStream inputStream = this.Dne.getInputStream();
      do {
      
      } while (inputStream.read(arrayOfByte) > 0);
      inputStream.close();
    } catch (Exception exception) {
      try {
        InputStream inputStream = this.Dne.getErrorStream();
        boolean bool = false;
        do {
        
        } while (inputStream.read(arrayOfByte) > 0);
        inputStream.close();
      } catch (IOException iOException) {}
    } 
  }
  
  public static EKF FWm(String paramString1, String paramString2) {
    return new qKy(paramString1, paramString2.getBytes(), 5000, 10000);
  }
  
  public EKF(String paramString, int paramInt1, int paramInt2) {
    try {
      this.Dne = paramString;
      this.Dne = (String)(new URL(paramString)).openConnection();
      this.Dne.setConnectTimeout(paramInt1);
      this.Dne.setReadTimeout(paramInt2);
    } catch (Exception exception) {
      throw new HFd("Failed URL: " + paramString, exception);
    } 
  }
  
  public oCt Dne() {
    String str = this.Dne.getHeaderField("Set-Cookie");
    if (str != null) {
      String str1 = str.substring(0, str.indexOf("="));
      String str2 = str.substring(str.indexOf("=") + 1, str.indexOf(";"));
      return oCt.Dne(Lur.Dne(str1, str2));
    } 
    return oCt.Dne();
  }
  
  public int Dne() {
    try {
      Dne();
      return this.Dne.getResponseCode();
    } catch (Exception exception) {
      throw new HFd("Failed URL: " + this.Dne, exception);
    } 
  }
  
  private String Dne(InputStream paramInputStream) {
    if (paramInputStream == null)
      throw new IllegalArgumentException("input stream cannot be null"); 
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = paramInputStream.read(); i != -1; i = paramInputStream.read())
      stringBuilder.append((char)i); 
    return stringBuilder.toString();
  }
  
  protected EKF Dne() {
    if (this.Dne == null) {
      EKF eKF = FWm();
      this.Dne = '\001';
      return eKF;
    } 
    return this;
  }
  
  public String Dne() {
    try {
      Dne();
      String str = (Dne() >= 400) ? Dne(this.Dne.getErrorStream()) : Dne(this.Dne.getInputStream());
      Dne();
      return str;
    } catch (IOException iOException) {
      throw new HFd("Failed URL: " + this.Dne, iOException);
    } 
  }
  
  public static EKF Dne(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    return new LHI(paramString1, paramString2.getBytes(), paramInt1, paramInt2);
  }
  
  public static EKF Dne(String paramString) {
    return new oGQ(paramString, 5000, 10000);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EKF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */