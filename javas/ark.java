import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class ark {
  private Map Dne;
  
  private final File Dne;
  
  private List Dne;
  
  private final File FWm;
  
  private Gax FWm;
  
  private static final Gax Dne = new Fso();
  
  private boolean Dne;
  
  private final Minecraft Dne = (Minecraft)new ArrayList();
  
  public List Dne() {
    return Collections.unmodifiableList((List<?>)this.Dne);
  }
  
  static Gax FWm() {
    return (Gax)Dne;
  }
  
  static boolean Dne(ark paramark) {
    return paramark.Dne;
  }
  
  private void Dne(String paramString, File paramFile) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Nde nde = new Nde();
    hashMap.put("X-Minecraft-Username", this.Dne.Dne.Dne);
    hashMap.put("X-Minecraft-Version", "UNKNOWN");
    hashMap.put("X-Minecraft-Supported-Resolutions", "16");
    this.Dne = true;
    this.Dne.Dne(nde);
    fgp.Dne(paramFile, paramString, new bwp(this), hashMap, 10000000, nde);
  }
  
  public ark(File paramFile, Minecraft paramMinecraft) {
    this.Dne = (Minecraft)new HashMap<>();
    this.Dne = paramMinecraft;
    this.Dne = (Minecraft)new File(paramFile, "texturepacks");
    this.FWm = (Gax)new File(paramFile, "texturepacks-mp-cache");
    bzF();
    FWm();
  }
  
  private String Dne(File paramFile) {
    return (paramFile.isFile() && paramFile.getName().toLowerCase().endsWith(".zip")) ? (paramFile.getName() + ":" + paramFile.length() + ":" + paramFile.lastModified()) : ((paramFile.isDirectory() && (new File(paramFile, "pack.txt")).exists()) ? (paramFile.getName() + ":folder:" + paramFile.lastModified()) : null);
  }
  
  static String Dne(ark paramark, File paramFile) {
    return paramark.Dne(paramFile);
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  static Gax Dne(ark paramark, Gax paramGax) {
    return paramark.FWm = paramGax;
  }
  
  public boolean bzF() {
    if (!((fZI)this.Dne.Dne).mrb)
      return false; 
    etB etB = this.Dne.Dne();
    return (etB == null) ? false : etB.Dne();
  }
  
  public Gax Dne() {
    return this.FWm;
  }
  
  private void bzF() {
    if (!this.Dne.isDirectory()) {
      this.Dne.delete();
      this.Dne.mkdirs();
    } 
    if (!this.FWm.isDirectory()) {
      this.FWm.delete();
      this.FWm.mkdirs();
    } 
  }
  
  static Minecraft Dne(ark paramark) {
    return paramark.Dne;
  }
  
  public void FWm() {
    ArrayList<Minecraft> arrayList = new ArrayList();
    this.FWm = (Gax)Dne;
    arrayList.add(Dne);
    for (File file : FWm()) {
      String str = Dne(file);
      if (str != null) {
        Gax gax = (Gax)this.Dne.get(str);
        if (gax == null) {
          gax = file.isDirectory() ? new WUf(str, file, (Gax)Dne) : new eqx(str, file, (Gax)Dne);
          this.Dne.put(str, gax);
        } 
        if (gax.FWm().equals(((fZI)this.Dne.Dne).Dne))
          this.FWm = gax; 
        arrayList.add(gax);
      } 
    } 
    this.Dne.removeAll(arrayList);
    for (Gax gax : this.Dne) {
      gax.Dne((Snh)this.Dne.Dne);
      this.Dne.remove(gax.Dne());
    } 
    this.Dne = (Minecraft)arrayList;
  }
  
  public void Dne(String paramString) {
    String str = paramString.substring(paramString.lastIndexOf("/") + 1);
    if (str.contains("?"))
      str = str.substring(0, str.indexOf("?")); 
    if (str.endsWith(".zip")) {
      File file = new File((File)this.FWm, str);
      Dne(paramString, file);
    } 
  }
  
  public boolean FWm() {
    if (!((fZI)this.Dne.Dne).mrb)
      return false; 
    etB etB = this.Dne.Dne();
    return (etB == null) ? true : etB.FWm();
  }
  
  public void Dne() {
    this.Dne = false;
    FWm();
    this.Dne.mrb();
  }
  
  public boolean Dne(Gax paramGax) {
    if (paramGax == this.FWm)
      return false; 
    this.Dne = false;
    this.FWm = paramGax;
    ((fZI)this.Dne.Dne).Dne = (Minecraft)paramGax.FWm();
    this.Dne.Dne.FWm();
    return true;
  }
  
  private List FWm() {
    return (this.Dne.exists() && this.Dne.isDirectory()) ? Arrays.<File>asList(this.Dne.listFiles()) : Collections.emptyList();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ark.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */