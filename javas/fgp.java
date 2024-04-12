import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fgp {
  static {
  
  }
  
  public static String Dne(Map paramMap) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry entry : paramMap.entrySet()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append('&'); 
      try {
        stringBuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        unsupportedEncodingException.printStackTrace();
      } 
      if (entry.getValue() != null) {
        stringBuilder.append('=');
        try {
          stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          unsupportedEncodingException.printStackTrace();
        } 
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static String Dne(dLs paramdLs, URL paramURL, Map paramMap, boolean paramBoolean) {
    return Dne(paramdLs, paramURL, Dne(paramMap), paramBoolean);
  }
  
  public static String Dne(URL paramURL) {
    HttpURLConnection httpURLConnection = (HttpURLConnection)paramURL.openConnection();
    httpURLConnection.setRequestMethod("GET");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
    StringBuilder stringBuilder = new StringBuilder();
    String str;
    while ((str = bufferedReader.readLine()) != null) {
      stringBuilder.append(str);
      stringBuilder.append('\r');
    } 
    bufferedReader.close();
    return stringBuilder.toString();
  }
  
  public static int Dne() {
    int i;
    ServerSocket serverSocket = null;
    boolean bool = true;
    try {
      serverSocket = new ServerSocket(0);
      i = serverSocket.getLocalPort();
    } finally {
      try {
        if (serverSocket != null)
          serverSocket.close(); 
      } catch (IOException iOException) {}
    } 
    return i;
  }
  
  public static String[] Dne(dLs paramdLs, String paramString1, String paramString2) {
    String str;
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put("user", paramString1);
    hashMap.put("password", paramString2);
    hashMap.put("version", Integer.valueOf(13));
    try {
      str = Dne(paramdLs, new URL("http://login.minecraft.net/"), hashMap, false);
    } catch (MalformedURLException malformedURLException) {
      malformedURLException.printStackTrace();
      return null;
    } 
    if (str != null && str.length() != 0) {
      if (!str.contains(":")) {
        if (paramdLs == null) {
          System.out.println("Failed to authenticate: " + str);
        } else {
          paramdLs.FWm("Failed to authenticae: " + str);
        } 
        return null;
      } 
      String[] arrayOfString = str.split(":");
      return new String[] { arrayOfString[2], arrayOfString[3] };
    } 
    if (paramdLs == null) {
      System.out.println("Failed to authenticate: Can't connect to minecraft.net");
    } else {
      paramdLs.FWm("Failed to authenticate: Can't connect to minecraft.net");
    } 
    return null;
  }
  
  public static void Dne(File paramFile, String paramString, Ejs paramEjs, Map paramMap, int paramInt, TaY paramTaY) {
    Thread thread = new Thread(new xSE(paramTaY, paramString, paramMap, paramFile, paramEjs, paramInt));
    thread.setDaemon(true);
    thread.start();
  }
  
  public static String Dne(dLs paramdLs, URL paramURL, String paramString, boolean paramBoolean) {
    try {
      HttpURLConnection httpURLConnection = (HttpURLConnection)paramURL.openConnection();
      httpURLConnection.setRequestMethod("POST");
      httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      httpURLConnection.setRequestProperty("Content-Length", "" + (paramString.getBytes()).length);
      httpURLConnection.setRequestProperty("Content-Language", "en-US");
      httpURLConnection.setUseCaches(false);
      httpURLConnection.setDoInput(true);
      httpURLConnection.setDoOutput(true);
      DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
      dataOutputStream.writeBytes(paramString);
      dataOutputStream.flush();
      dataOutputStream.close();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
      StringBuffer stringBuffer = new StringBuffer();
      String str;
      while ((str = bufferedReader.readLine()) != null) {
        stringBuffer.append(str);
        stringBuffer.append('\r');
      } 
      bufferedReader.close();
      return stringBuffer.toString();
    } catch (Exception exception) {
      if (!paramBoolean)
        if (paramdLs != null) {
          paramdLs.FWm("Could not post to " + paramURL, exception);
        } else {
          Logger.getAnonymousLogger().log(Level.SEVERE, "Could not post to " + paramURL, exception);
        }  
      return "";
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fgp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */