import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class wlK {
  private final String FWm;
  
  private final String Dne;
  
  private HashMap FWm;
  
  public File Dne;
  
  private HashMap Dne = (HashMap)System.getProperty("user.home");
  
  public void Dne() {
    try {
      mKT.Dne.loadSound(((File)this.FWm.get("glitch")).toURL(), "glitch.ogg");
      mKT.Dne.loadSound(((File)this.FWm.get("glitch422")).toURL(), "glitch422.ogg");
      mKT.Dne.backgroundMusic("bgtheme", ((File)this.FWm.get("theme")).toURL(), "maintheme.ogg", true);
      mKT.Dne.backgroundMusic("noise", ((File)this.FWm.get("noise")).toURL(), "tv_noise.ogg", true);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public wlK() {
    this.Dne = new HashMap<>();
    this.FWm = new HashMap<>();
    this.Dne = (HashMap)new File(System.getProperty("user.home") + "\\422");
    this.FWm = (HashMap)(this.Dne.getAbsolutePath() + "\\");
    this.Dne.mkdir();
    this.Dne.deleteOnExit();
    this.Dne.put("glitch", getClass().getResourceAsStream("sounds/g.ogg"));
    this.Dne.put("glitch422", getClass().getResourceAsStream("sounds/g422.ogg"));
    this.Dne.put("theme", getClass().getResourceAsStream("sounds/th.ogg"));
    this.Dne.put("noise", getClass().getResourceAsStream("sounds/n.ogg"));
    for (Map.Entry entry : this.Dne.entrySet()) {
      this.FWm.put(entry.getKey(), new File(String.format("%s%s.ogg", new Object[] { this.FWm, entry.getKey() })));
    } 
    try {
      for (Map.Entry entry : this.FWm.entrySet()) {
        ((File)entry.getValue()).deleteOnExit();
        Files.copy((InputStream)this.Dne.get(entry.getKey()), Paths.get(((File)entry.getValue()).getAbsolutePath(), new String[0]), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    Runtime.getRuntime().addShutdownHook(new yoK(this));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wlK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */