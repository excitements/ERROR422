import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WQU implements dLs {
  private final String Dne;
  
  private final String bzF;
  
  private final String FWm;
  
  private final Logger Dne;
  
  public WQU(String paramString1, String paramString2, String paramString3) {
    this.Dne = Logger.getLogger(paramString1);
    this.FWm = paramString1;
    this.bzF = paramString2;
    this.Dne = (Logger)paramString3;
    Dne();
  }
  
  public void bzF(String paramString) {
    this.Dne.log(Level.SEVERE, paramString);
  }
  
  public void Qnq(String paramString) {
    this.Dne.log(Level.FINE, paramString);
  }
  
  static String Dne(WQU paramWQU) {
    return paramWQU.bzF;
  }
  
  private void Dne() {
    this.Dne.setUseParentHandlers(false);
    for (Handler handler : this.Dne.getHandlers())
      this.Dne.removeHandler(handler); 
    udA udA = new udA(this, (UHl)null);
    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setFormatter(udA);
    this.Dne.addHandler(consoleHandler);
    try {
      FileHandler fileHandler = new FileHandler((String)this.Dne, true);
      fileHandler.setFormatter(udA);
      this.Dne.addHandler(fileHandler);
    } catch (Exception exception) {
      this.Dne.log(Level.WARNING, "Failed to log " + this.FWm + " to " + this.Dne, exception);
    } 
  }
  
  public void Dne(String paramString, Object... paramVarArgs) {
    this.Dne.log(Level.WARNING, paramString, paramVarArgs);
  }
  
  public void FWm(String paramString) {
    this.Dne.log(Level.WARNING, paramString);
  }
  
  public void FWm(String paramString, Throwable paramThrowable) {
    this.Dne.log(Level.SEVERE, paramString, paramThrowable);
  }
  
  public void Dne(String paramString, Throwable paramThrowable) {
    this.Dne.log(Level.WARNING, paramString, paramThrowable);
  }
  
  public void Dne(String paramString) {
    this.Dne.log(Level.INFO, paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WQU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */