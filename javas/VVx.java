import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class VVx {
  public static void Dne(WkD paramWkD, DataOutput paramDataOutput) {
    oNe.Dne(paramWkD, paramDataOutput);
  }
  
  public static WkD Dne(File paramFile) {
    WkD wkD;
    if (!paramFile.exists())
      return null; 
    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(paramFile));
    try {
      wkD = Dne(dataInputStream);
    } finally {
      dataInputStream.close();
    } 
    return wkD;
  }
  
  public static void Dne(WkD paramWkD, OutputStream paramOutputStream) {
    DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(paramOutputStream));
    try {
      Dne(paramWkD, dataOutputStream);
    } finally {
      dataOutputStream.close();
    } 
  }
  
  public static void FWm(WkD paramWkD, File paramFile) {
    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(paramFile));
    try {
      Dne(paramWkD, dataOutputStream);
    } finally {
      dataOutputStream.close();
    } 
  }
  
  public static void Dne(WkD paramWkD, File paramFile) {
    File file = new File(paramFile.getAbsolutePath() + "_tmp");
    if (file.exists())
      file.delete(); 
    FWm(paramWkD, file);
    if (paramFile.exists())
      paramFile.delete(); 
    if (paramFile.exists())
      throw new IOException("Failed to delete " + paramFile); 
    file.renameTo(paramFile);
  }
  
  public static byte[] Dne(WkD paramWkD) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream));
    try {
      Dne(paramWkD, dataOutputStream);
    } finally {
      dataOutputStream.close();
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static WkD Dne(DataInput paramDataInput) {
    oNe oNe = oNe.Dne(paramDataInput);
    if (oNe instanceof WkD)
      return (WkD)oNe; 
    throw new IOException("Root tag must be a named compound tag");
  }
  
  public static WkD Dne(InputStream paramInputStream) {
    WkD wkD;
    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(paramInputStream)));
    try {
      wkD = Dne(dataInputStream);
    } finally {
      dataInputStream.close();
    } 
    return wkD;
  }
  
  static {
  
  }
  
  public static WkD Dne(byte[] paramArrayOfbyte) {
    WkD wkD;
    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(paramArrayOfbyte))));
    try {
      wkD = Dne(dataInputStream);
    } finally {
      dataInputStream.close();
    } 
    return wkD;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VVx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */