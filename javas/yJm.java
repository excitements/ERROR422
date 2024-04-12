import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;

public class yJm {
  private int Dne;
  
  private volatile boolean Dne;
  
  private File bzF;
  
  private File Qnq;
  
  private vwN Dne;
  
  private File Dne;
  
  private File aFZ;
  
  private File zGp;
  
  private int FWm;
  
  private File FWm;
  
  private volatile Map FWm;
  
  private volatile Map Dne;
  
  private FkP Dne = false;
  
  static File zGp(yJm paramyJm) {
    return paramyJm.aFZ;
  }
  
  static File FWm(yJm paramyJm) {
    return paramyJm.Qnq;
  }
  
  static File Qnq(yJm paramyJm) {
    return (File)paramyJm.Dne;
  }
  
  public boolean Dne() {
    return (this.Dne <= null && this.Dne == null && this.FWm == null);
  }
  
  public void Dne(Map paramMap) {
    if (this.Dne != null)
      throw new IllegalStateException("Can't save stats while StatsSyncher is busy!"); 
    this.Dne = 100;
    this.Dne = true;
    (new Wur(this, paramMap)).start();
  }
  
  public yJm(vwN paramvwN, FkP paramFkP, File paramFile) {
    this.Dne = null;
    this.FWm = null;
    this.Dne = false;
    this.FWm = false;
    this.Dne = (FkP)new File(paramFile, "stats_" + paramvwN.Dne.toLowerCase() + "_unsent.dat");
    this.FWm = (Map)new File(paramFile, "stats_" + paramvwN.Dne.toLowerCase() + ".dat");
    this.aFZ = new File(paramFile, "stats_" + paramvwN.Dne.toLowerCase() + "_unsent.old");
    this.zGp = new File(paramFile, "stats_" + paramvwN.Dne.toLowerCase() + ".old");
    this.bzF = new File(paramFile, "stats_" + paramvwN.Dne.toLowerCase() + "_unsent.tmp");
    this.Qnq = new File(paramFile, "stats_" + paramvwN.Dne.toLowerCase() + ".tmp");
    if (!paramvwN.Dne.toLowerCase().equals(paramvwN.Dne)) {
      Dne(paramFile, "stats_" + paramvwN.Dne + "_unsent.dat", (File)this.Dne);
      Dne(paramFile, "stats_" + paramvwN.Dne + ".dat", (File)this.FWm);
      Dne(paramFile, "stats_" + paramvwN.Dne + "_unsent.old", this.aFZ);
      Dne(paramFile, "stats_" + paramvwN.Dne + ".old", this.zGp);
      Dne(paramFile, "stats_" + paramvwN.Dne + "_unsent.tmp", this.bzF);
      Dne(paramFile, "stats_" + paramvwN.Dne + ".tmp", this.Qnq);
    } 
    this.Dne = paramFkP;
    this.Dne = (FkP)paramvwN;
    if (this.Dne.exists())
      paramFkP.Dne(Dne((File)this.Dne, this.bzF, this.aFZ)); 
    Dne();
  }
  
  static Map Dne(yJm paramyJm, File paramFile1, File paramFile2, File paramFile3) {
    return paramyJm.Dne(paramFile1, paramFile2, paramFile3);
  }
  
  static void Dne(yJm paramyJm, Map paramMap, File paramFile1, File paramFile2, File paramFile3) {
    paramyJm.Dne(paramMap, paramFile1, paramFile2, paramFile3);
  }
  
  static boolean Dne(yJm paramyJm, boolean paramBoolean) {
    return paramyJm.Dne = paramBoolean;
  }
  
  private void Dne(File paramFile1, String paramString, File paramFile2) {
    File file = new File(paramFile1, paramString);
    if (file.exists() && !file.isDirectory() && !paramFile2.exists())
      file.renameTo(paramFile2); 
  }
  
  public void FWm(Map paramMap) {
    byte b = 30;
    while (this.Dne != null && --b > 0) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
    this.Dne = true;
    try {
      Dne(paramMap, (File)this.Dne, this.bzF, this.aFZ);
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      this.Dne = false;
    } 
  }
  
  static Map Dne(yJm paramyJm) {
    return (Map)paramyJm.Dne;
  }
  
  public void Dne() {
    if (this.Dne != null)
      throw new IllegalStateException("Can't get stats from server while StatsSyncher is busy!"); 
    this.Dne = 100;
    this.Dne = true;
    (new iLc(this)).start();
  }
  
  private void Dne(Map paramMap, File paramFile1, File paramFile2, File paramFile3) {
    PrintWriter printWriter = new PrintWriter(new FileWriter(paramFile2, false));
    try {
      printWriter.print(FkP.Dne(((vwN)this.Dne).Dne, "local", paramMap));
    } finally {
      printWriter.close();
    } 
    if (paramFile3.exists())
      paramFile3.delete(); 
    if (paramFile1.exists())
      paramFile1.renameTo(paramFile3); 
    paramFile2.renameTo(paramFile1);
  }
  
  static File aFZ(yJm paramyJm) {
    return paramyJm.bzF;
  }
  
  static Map Dne(yJm paramyJm, Map paramMap) {
    return (Map)(paramyJm.Dne = (FkP)paramMap);
  }
  
  public void FWm() {
    if (this.Dne > null)
      this.Dne--; 
    if (this.FWm > null)
      this.FWm--; 
    if (this.FWm != null) {
      this.Dne.bzF(this.FWm);
      this.FWm = null;
    } 
    if (this.Dne != null) {
      this.Dne.FWm((Map)this.Dne);
      this.Dne = null;
    } 
  }
  
  private Map Dne(File paramFile) {
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(paramFile));
      String str = "";
      StringBuilder stringBuilder = new StringBuilder();
      while ((str = bufferedReader.readLine()) != null)
        stringBuilder.append(str); 
      Map map = FkP.Dne(stringBuilder.toString());
      return map;
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } 
    return null;
  }
  
  static File bzF(yJm paramyJm) {
    return paramyJm.zGp;
  }
  
  static File Dne(yJm paramyJm) {
    return (File)paramyJm.FWm;
  }
  
  private Map Dne(File paramFile1, File paramFile2, File paramFile3) {
    return paramFile1.exists() ? Dne(paramFile1) : (paramFile3.exists() ? Dne(paramFile3) : (paramFile2.exists() ? Dne(paramFile2) : null));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yJm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */