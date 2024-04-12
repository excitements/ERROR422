import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class yxO implements AAC, iDE {
  private final File Dne;
  
  private final File FWm;
  
  private final String Dne;
  
  private final long Dne;
  
  private final File bzF;
  
  public File Dne(String paramString) {
    return new File(this.bzF, paramString + ".dat");
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public WkD Dne(String paramString) {
    try {
      File file = new File(this.FWm, paramString + ".dat");
      if (file.exists())
        return VVx.Dne(new FileInputStream(file)); 
    } catch (Exception exception) {
      Jwh.Dne().Dne().FWm("Failed to load player data for " + paramString);
    } 
    return null;
  }
  
  public AAC Dne() {
    return this;
  }
  
  public void Dne(xoY paramxoY, WkD paramWkD) {
    WkD wkD1 = paramxoY.Dne(paramWkD);
    WkD wkD2 = new WkD();
    wkD2.Dne("Data", wkD1);
    try {
      File file1 = new File(this.Dne, "level.dat_new");
      File file2 = new File(this.Dne, "level.dat_old");
      File file3 = new File(this.Dne, "level.dat");
      VVx.Dne(wkD2, new FileOutputStream(file1));
      if (file2.exists())
        file2.delete(); 
      file3.renameTo(file2);
      if (file3.exists())
        file3.delete(); 
      file1.renameTo(file3);
      if (file1.exists())
        file1.delete(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public WkD Dne(FiG paramFiG) {
    WkD wkD = Dne(paramFiG.aFZ);
    if (wkD != null)
      paramFiG.Qnq(wkD); 
    return wkD;
  }
  
  public xoY Dne() {
    File file = new File(this.Dne, "level.dat");
    if (file.exists())
      try {
        WkD wkD1 = VVx.Dne(new FileInputStream(file));
        WkD wkD2 = wkD1.Dne("Data");
        return new xoY(wkD2);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    file = new File(this.Dne, "level.dat_old");
    if (file.exists())
      try {
        WkD wkD1 = VVx.Dne(new FileInputStream(file));
        WkD wkD2 = wkD1.Dne("Data");
        return new xoY(wkD2);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return null;
  }
  
  public void Dne(xoY paramxoY) {
    WkD wkD1 = paramxoY.Dne();
    WkD wkD2 = new WkD();
    wkD2.Dne("Data", wkD1);
    try {
      File file1 = new File(this.Dne, "level.dat_new");
      File file2 = new File(this.Dne, "level.dat_old");
      File file3 = new File(this.Dne, "level.dat");
      VVx.Dne(wkD2, new FileOutputStream(file1));
      if (file2.exists())
        file2.delete(); 
      file3.renameTo(file2);
      if (file3.exists())
        file3.delete(); 
      file1.renameTo(file3);
      if (file1.exists())
        file1.delete(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected File Dne() {
    return this.Dne;
  }
  
  public yxO(File paramFile, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: invokestatic currentTimeMillis : ()J
    //   8: putfield Dne : J
    //   11: aload_0
    //   12: new java/io/File
    //   15: dup
    //   16: aload_1
    //   17: aload_2
    //   18: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   21: putfield Dne : Ljava/io/File;
    //   24: aload_0
    //   25: getfield Dne : Ljava/io/File;
    //   28: invokevirtual mkdirs : ()Z
    //   31: pop
    //   32: aload_0
    //   33: new java/io/File
    //   36: dup
    //   37: aload_0
    //   38: getfield Dne : Ljava/io/File;
    //   41: ldc 'players'
    //   43: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   46: putfield FWm : Ljava/io/File;
    //   49: aload_0
    //   50: new java/io/File
    //   53: dup
    //   54: aload_0
    //   55: getfield Dne : Ljava/io/File;
    //   58: ldc 'data'
    //   60: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   63: putfield bzF : Ljava/io/File;
    //   66: aload_0
    //   67: getfield bzF : Ljava/io/File;
    //   70: invokevirtual mkdirs : ()Z
    //   73: pop
    //   74: aload_0
    //   75: aload_2
    //   76: putfield Dne : Ljava/lang/String;
    //   79: iload_3
    //   80: ifeq -> 91
    //   83: aload_0
    //   84: getfield FWm : Ljava/io/File;
    //   87: invokevirtual mkdirs : ()Z
    //   90: pop
    //   91: aload_0
    //   92: invokespecial bzF : ()V
    //   95: return
  }
  
  public void Dne() {}
  
  private void bzF() {
    try {
      File file = new File(this.Dne, "session.lock");
      DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
      try {
        dataOutputStream.writeLong(this.Dne);
      } finally {
        dataOutputStream.close();
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new RuntimeException("Failed to check session lock, aborting");
    } 
  }
  
  public void Dne(FiG paramFiG) {
    try {
      WkD wkD = new WkD();
      paramFiG.bzF(wkD);
      File file1 = new File(this.FWm, paramFiG.aFZ + ".dat.tmp");
      File file2 = new File(this.FWm, paramFiG.aFZ + ".dat");
      VVx.Dne(wkD, new FileOutputStream(file1));
      if (file2.exists())
        file2.delete(); 
      file1.renameTo(file2);
    } catch (Exception exception) {
      Jwh.Dne().Dne().FWm("Failed to save player data for " + paramFiG.aFZ);
    } 
  }
  
  public String[] Dne() {
    String[] arrayOfString = this.FWm.list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].endsWith(".dat"))
        arrayOfString[b] = arrayOfString[b].substring(0, arrayOfString[b].length() - 4); 
    } 
    return arrayOfString;
  }
  
  public void FWm() {
    try {
      File file = new File(this.Dne, "session.lock");
      DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
      try {
        if (dataInputStream.readLong() != this.Dne)
          throw new div("The save is being accessed from another location, aborting"); 
      } finally {
        dataInputStream.close();
      } 
    } catch (IOException iOException) {
      throw new div("Failed to check session lock, aborting");
    } 
  }
  
  public YHU Dne(Jik paramJik) {
    throw new RuntimeException("Old Chunk Storage is no longer supported.");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yxO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */