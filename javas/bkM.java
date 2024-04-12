import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class bkM {
  private boolean Dne;
  
  private final zEq Dne;
  
  private final File Dne = (File)new zEq();
  
  public Map Dne() {
    Dne();
    return (Map)this.Dne;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void Dne(eHI parameHI) {
    this.Dne.Dne(parameHI.Dne(), parameHI);
    bzF();
  }
  
  public bkM(File paramFile) {
    this.Dne = true;
    this.Dne = paramFile;
  }
  
  public boolean Dne(String paramString) {
    if (!Dne())
      return false; 
    Dne();
    return this.Dne.containsKey(paramString);
  }
  
  public void Dne() {
    Iterator<eHI> iterator = this.Dne.values().iterator();
    while (iterator.hasNext()) {
      eHI eHI = iterator.next();
      if (eHI.Dne())
        iterator.remove(); 
    } 
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public void Dne(String paramString) {
    this.Dne.remove(paramString);
    bzF();
  }
  
  public void FWm() {
    if (this.Dne.isFile()) {
      BufferedReader bufferedReader;
      try {
        bufferedReader = new BufferedReader(new FileReader(this.Dne));
      } catch (FileNotFoundException fileNotFoundException) {
        throw new Error();
      } 
      try {
        String str;
        while ((str = bufferedReader.readLine()) != null) {
          if (!str.startsWith("#")) {
            eHI eHI = eHI.Dne(str);
            if (eHI != null)
              this.Dne.Dne(eHI.Dne(), eHI); 
          } 
        } 
      } catch (IOException iOException) {
        Jwh.Dne().Dne().FWm("Could not load ban list", iOException);
      } 
    } 
  }
  
  public void FWm(boolean paramBoolean) {
    Dne();
    try {
      PrintWriter printWriter = new PrintWriter(new FileWriter(this.Dne, false));
      if (paramBoolean) {
        printWriter.println("# Updated " + (new SimpleDateFormat()).format(new Date()) + " by Minecraft UNKNOWN");
        printWriter.println("# victim name | ban date | banned by | banned until | reason");
        printWriter.println();
      } 
      for (eHI eHI : this.Dne.values())
        printWriter.println(eHI.Qnq()); 
      printWriter.close();
    } catch (IOException iOException) {
      Jwh.Dne().Dne().FWm("Could not save ban list", iOException);
    } 
  }
  
  public void bzF() {
    FWm(true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bkM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */