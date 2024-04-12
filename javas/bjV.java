import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bjV extends dzN {
  private File FWm;
  
  private File Dne;
  
  public void Dne(String paramString) {
    super.Dne(paramString);
    zGp();
  }
  
  private void aFZ() {
    try {
      FWm().clear();
      BufferedReader bufferedReader = new BufferedReader(new FileReader(this.Dne));
      String str = "";
      while ((str = bufferedReader.readLine()) != null)
        FWm().add(str.trim().toLowerCase()); 
      bufferedReader.close();
    } catch (Exception exception) {
      Dne().Dne().FWm("Failed to load operators list: " + exception);
    } 
  }
  
  private void div() {
    try {
      PrintWriter printWriter = new PrintWriter(new FileWriter(this.FWm, false));
      for (String str : Dne())
        printWriter.println(str); 
      printWriter.close();
    } catch (Exception exception) {
      Dne().Dne().FWm("Failed to save white-list: " + exception);
    } 
  }
  
  private void DyG() {
    try {
      Dne().clear();
      BufferedReader bufferedReader = new BufferedReader(new FileReader(this.FWm));
      String str = "";
      while ((str = bufferedReader.readLine()) != null)
        Dne().add(str.trim().toLowerCase()); 
      bufferedReader.close();
    } catch (Exception exception) {
      Dne().Dne().FWm("Failed to load white-list: " + exception);
    } 
  }
  
  public iJs Dne() {
    return (iJs)super.Dne();
  }
  
  public void Dne(boolean paramBoolean) {
    super.Dne(paramBoolean);
    Dne().Dne("white-list", Boolean.valueOf(paramBoolean));
    Dne().Dne();
  }
  
  public void Qnq(String paramString) {
    super.Qnq(paramString);
    div();
  }
  
  public void bzF(String paramString) {
    super.bzF(paramString);
    div();
  }
  
  private void zGp() {
    try {
      PrintWriter printWriter = new PrintWriter(new FileWriter(this.Dne, false));
      for (String str : FWm())
        printWriter.println(str); 
      printWriter.close();
    } catch (Exception exception) {
      Dne().Dne().FWm("Failed to save operators list: " + exception);
    } 
  }
  
  public boolean Dne(String paramString) {
    paramString = paramString.trim().toLowerCase();
    return (!Dne() || FWm(paramString) || Dne().contains(paramString));
  }
  
  public bjV(iJs paramiJs) {
    super(paramiJs);
    this.Dne = paramiJs.Dne("ops.txt");
    this.FWm = paramiJs.Dne("white-list.txt");
    this.FWm = paramiJs.Dne("view-distance", 10);
    this.Dne = paramiJs.Dne("max-players", 20);
    Dne(paramiJs.Dne("white-list", false));
    if (!paramiJs.Zpi()) {
      Dne().Dne(true);
      FWm().Dne(true);
    } 
    Dne().FWm();
    Dne().bzF();
    FWm().FWm();
    FWm().bzF();
    aFZ();
    DyG();
    zGp();
    if (!this.FWm.exists())
      div(); 
  }
  
  public void bzF() {
    DyG();
  }
  
  public void FWm(String paramString) {
    super.FWm(paramString);
    zGp();
  }
  
  public Jwh Dne() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bjV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */