import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XEr implements YiY {
  protected final File Dne;
  
  public void Dne(String paramString1, String paramString2) {
    File file = new File(this.Dne, paramString1);
    if (file.exists()) {
      File file1 = new File(file, "level.dat");
      if (file1.exists())
        try {
          WkD wkD1 = VVx.Dne(new FileInputStream(file1));
          WkD wkD2 = wkD1.Dne("Data");
          wkD2.Dne("LevelName", paramString2);
          VVx.Dne(wkD1, new FileOutputStream(file1));
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } 
  }
  
  public boolean Dne(String paramString) {
    return false;
  }
  
  public boolean bzF(String paramString) {
    File file = new File(this.Dne, paramString);
    return file.isDirectory();
  }
  
  protected static boolean Dne(File[] paramArrayOfFile) {
    for (byte b = 0; b < paramArrayOfFile.length; b++) {
      File file = paramArrayOfFile[b];
      System.out.println("Deleting " + file);
      if (file.isDirectory() && !Dne(file.listFiles())) {
        System.out.println("Couldn't delete directory " + file);
        return false;
      } 
      if (!file.delete()) {
        System.out.println("Couldn't delete file " + file);
        return false;
      } 
    } 
    return true;
  }
  
  public boolean Dne(String paramString, TaY paramTaY) {
    return false;
  }
  
  public xoY Dne(String paramString) {
    File file1 = new File(this.Dne, paramString);
    if (!file1.exists())
      return null; 
    File file2 = new File(file1, "level.dat");
    if (file2.exists())
      try {
        WkD wkD1 = VVx.Dne(new FileInputStream(file2));
        WkD wkD2 = wkD1.Dne("Data");
        return new xoY(wkD2);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    file2 = new File(file1, "level.dat_old");
    if (file2.exists())
      try {
        WkD wkD1 = VVx.Dne(new FileInputStream(file2));
        WkD wkD2 = wkD1.Dne("Data");
        return new xoY(wkD2);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return null;
  }
  
  public boolean FWm(String paramString) {
    File file = new File(this.Dne, paramString);
    if (!file.exists())
      return true; 
    System.out.println("Deleting level " + paramString);
    for (byte b = 1; b <= 5; b++) {
      System.out.println("Attempt " + b + "...");
      if (Dne(file.listFiles()))
        break; 
      System.out.println("Unsuccessful in deleting contents.");
      if (b < 5)
        try {
          Thread.sleep(500L);
        } catch (InterruptedException interruptedException) {} 
    } 
    return file.delete();
  }
  
  public void Dne() {}
  
  public XEr(File paramFile) {
    if (!paramFile.exists())
      paramFile.mkdirs(); 
    this.Dne = paramFile;
  }
  
  public iDE Dne(String paramString, boolean paramBoolean) {
    return new yxO(this.Dne, paramString, paramBoolean);
  }
  
  public List Dne() {
    ArrayList<pQP> arrayList = new ArrayList();
    for (byte b = 0; b < 5; b++) {
      String str = "World" + (b + 1);
      xoY xoY = Dne(str);
      if (xoY != null)
        arrayList.add(new pQP(str, "", xoY.aFZ(), xoY.Qnq(), xoY.Dne(), false, xoY.Qnq(), xoY.aFZ())); 
    } 
    return arrayList;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XEr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */