import java.util.Collection;
import java.util.TreeMap;

public class aSc {
  private TreeMap Dne = new TreeMap<>();
  
  public String[] Dne() {
    return (String[])this.Dne.keySet().toArray((Object[])new String[0]);
  }
  
  public aSc() {
    Dne("doFireTick", "true");
    Dne("mobGriefing", "true");
    Dne("keepInventory", "false");
    Dne("doMobSpawning", "true");
    Dne("doMobLoot", "true");
    Dne("doTileDrops", "true");
    Dne("commandBlockOutput", "true");
  }
  
  public void FWm(String paramString1, String paramString2) {
    iVH iVH = (iVH)this.Dne.get(paramString1);
    if (iVH != null) {
      iVH.Dne(paramString2);
    } else {
      Dne(paramString1, paramString2);
    } 
  }
  
  public void Dne(String paramString1, String paramString2) {
    this.Dne.put(paramString1, new iVH(paramString2));
  }
  
  public String Dne(String paramString) {
    iVH iVH = (iVH)this.Dne.get(paramString);
    return (iVH != null) ? iVH.Dne() : "";
  }
  
  public boolean FWm(String paramString) {
    return this.Dne.containsKey(paramString);
  }
  
  public void Dne(WkD paramWkD) {
    Collection collection = paramWkD.Dne();
    for (oNe oNe : collection) {
      String str1 = oNe.Dne();
      String str2 = paramWkD.Dne(oNe.Dne());
      FWm(str1, str2);
    } 
  }
  
  public WkD Dne() {
    WkD wkD = new WkD("GameRules");
    for (String str : this.Dne.keySet()) {
      iVH iVH = (iVH)this.Dne.get(str);
      wkD.Dne(str, iVH.Dne());
    } 
    return wkD;
  }
  
  public boolean Dne(String paramString) {
    iVH iVH = (iVH)this.Dne.get(paramString);
    return (iVH != null) ? iVH.Dne() : false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aSc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */