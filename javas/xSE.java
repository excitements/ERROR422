import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

final class xSE implements Runnable {
  final Map Dne;
  
  final String Dne;
  
  final TaY Dne;
  
  final File Dne;
  
  final int Dne;
  
  final Ejs Dne;
  
  public void run() {
    URLConnection uRLConnection = null;
    InputStream inputStream = null;
    DataOutputStream dataOutputStream = null;
    if (this.Dne != null) {
      this.Dne.Dne("Downloading Texture Pack");
      this.Dne.Qnq("Making Request...");
    } 
    try {
      byte[] arrayOfByte = new byte[4096];
      URL uRL = new URL((String)this.Dne);
      uRLConnection = uRL.openConnection();
      float f1 = 0.0F;
      float f2 = this.Dne.entrySet().size();
      for (Map.Entry entry : this.Dne.entrySet()) {
        uRLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        if (this.Dne != null)
          this.Dne.Dne((int)(++f1 / f2 * 100.0F)); 
      } 
      inputStream = uRLConnection.getInputStream();
      f2 = uRLConnection.getContentLength();
      int i = uRLConnection.getContentLength();
      if (this.Dne != null)
        this.Dne.Qnq(String.format("Downloading file (%.2f MB)...", new Object[] { Float.valueOf(f2 / 1000.0F / 1000.0F) })); 
      if (this.Dne.exists()) {
        long l = this.Dne.length();
        if (l == i) {
          this.Dne.Dne((File)this.Dne);
          if (this.Dne != null)
            this.Dne.d_(); 
          return;
        } 
        System.out.println("Deleting " + this.Dne + " as it does not match what we currently have (" + i + " vs our " + l + ").");
        this.Dne.delete();
      } 
      dataOutputStream = new DataOutputStream(new FileOutputStream((File)this.Dne));
      if (this.Dne > null && f2 > this.Dne) {
        if (this.Dne != null)
          this.Dne.d_(); 
        throw new IOException("Filesize is bigger than maximum allowed (file is " + f1 + ", limit is " + this.Dne + ")");
      } 
      boolean bool = false;
      int j;
      while ((j = inputStream.read(arrayOfByte)) >= 0) {
        f1 += j;
        if (this.Dne != null)
          this.Dne.Dne((int)(f1 / f2 * 100.0F)); 
        if (this.Dne > null && f1 > this.Dne) {
          if (this.Dne != null)
            this.Dne.d_(); 
          throw new IOException("Filesize was bigger than maximum allowed (got >= " + f1 + ", limit was " + this.Dne + ")");
        } 
        dataOutputStream.write(arrayOfByte, 0, j);
      } 
      this.Dne.Dne((File)this.Dne);
      if (this.Dne != null) {
        this.Dne.d_();
        return;
      } 
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    } finally {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (IOException iOException) {}
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (IOException iOException) {}
    } 
  }
  
  xSE(TaY paramTaY, String paramString, Map paramMap, File paramFile, Ejs paramEjs, int paramInt) {
    this.Dne = (Ejs)paramTaY;
    this.Dne = (Ejs)paramString;
    this.Dne = (Ejs)paramMap;
    this.Dne = (Ejs)paramFile;
    this.Dne = paramEjs;
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xSE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */