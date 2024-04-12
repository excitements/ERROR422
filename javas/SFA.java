import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SFA {
  private final Map Qnq;
  
  private final vfE[] Dne;
  
  private final Map bzF = new HashMap<>();
  
  private final Map FWm = new HashMap<>();
  
  private final Map aFZ;
  
  private final Map Dne = new HashMap<>();
  
  public vfE Dne(String paramString, PAf paramPAf) {
    vfE vfE1 = Dne(paramString);
    if (vfE1 != null)
      throw new IllegalArgumentException("An objective with the name '" + paramString + "' already exists!"); 
    vfE1 = new vfE(this, paramString, paramPAf);
    List<vfE> list = (List)this.FWm.get(paramPAf);
    if (list == null) {
      list = new ArrayList();
      this.FWm.put(paramPAf, list);
    } 
    list.add(vfE1);
    this.Dne.put(paramString, vfE1);
    FWm(vfE1);
    return vfE1;
  }
  
  public void Dne(int paramInt, vfE paramvfE) {
    this.Dne[paramInt] = (Map)paramvfE;
  }
  
  public Collection Dne(vfE paramvfE) {
    ArrayList<OHz> arrayList = new ArrayList();
    for (Map map : this.bzF.values()) {
      OHz oHz = (OHz)map.get(paramvfE);
      if (oHz != null)
        arrayList.add(oHz); 
    } 
    Collections.sort(arrayList, OHz.Dne);
    return arrayList;
  }
  
  public void FWm(String paramString) {}
  
  public void Dne(String paramString) {
    Map map = (Map)this.bzF.remove(paramString);
    if (map != null)
      FWm(paramString); 
  }
  
  public void Dne(String paramString, YGE paramYGE) {
    if (bzF(paramString) != null)
      Dne(paramString); 
    this.aFZ.put(paramString, paramYGE);
    paramYGE.Dne().add(paramString);
  }
  
  public Collection Dne(PAf paramPAf) {
    Collection<?> collection = (Collection)this.FWm.get(paramPAf);
    return (collection == null) ? new ArrayList() : new ArrayList(collection);
  }
  
  public void Dne(vfE paramvfE) {
    this.Dne.remove(paramvfE.Dne());
    for (byte b = 0; b < 3; b++) {
      if (Dne(b) == paramvfE)
        Dne(b, (vfE)null); 
    } 
    List list = (List)this.FWm.get(paramvfE.Dne());
    if (list != null)
      list.remove(paramvfE); 
    for (Map map : this.bzF.values())
      map.remove(paramvfE); 
    Qnq(paramvfE);
  }
  
  public void bzF(YGE paramYGE) {}
  
  public Collection Qnq() {
    return this.Qnq.keySet();
  }
  
  public Map Dne(String paramString) {
    Map<Object, Object> map = (Map)this.bzF.get(paramString);
    if (map == null)
      map = new HashMap<>(); 
    return map;
  }
  
  public void Qnq(vfE paramvfE) {}
  
  public YGE Dne(String paramString) {
    return (YGE)this.Qnq.get(paramString);
  }
  
  public YGE FWm(String paramString) {
    YGE yGE = Dne(paramString);
    if (yGE != null)
      throw new IllegalArgumentException("An objective with the name '" + paramString + "' already exists!"); 
    yGE = new YGE(this, paramString);
    this.Qnq.put(paramString, yGE);
    FWm(yGE);
    return yGE;
  }
  
  public vfE Dne(String paramString) {
    return (vfE)this.Dne.get(paramString);
  }
  
  public Collection aFZ() {
    return this.Qnq.values();
  }
  
  public void FWm(String paramString, YGE paramYGE) {
    if (bzF(paramString) != paramYGE)
      throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + paramYGE.Dne() + "'."); 
    this.aFZ.remove(paramString);
    paramYGE.Dne().remove(paramString);
  }
  
  public Collection FWm() {
    return this.bzF.keySet();
  }
  
  public static String Dne(int paramInt) {
    switch (paramInt) {
      case 0:
        return "list";
      case 1:
        return "sidebar";
      case 2:
        return "belowName";
    } 
    return null;
  }
  
  public void Qnq(YGE paramYGE) {}
  
  public void Dne(YGE paramYGE) {
    this.Qnq.remove(paramYGE.Dne());
    for (String str : paramYGE.Dne())
      this.aFZ.remove(str); 
    Qnq(paramYGE);
  }
  
  public vfE Dne(int paramInt) {
    return (vfE)this.Dne[paramInt];
  }
  
  public SFA() {
    this.Dne = (Map)new vfE[3];
    this.Qnq = new HashMap<>();
    this.aFZ = new HashMap<>();
  }
  
  public void FWm(YGE paramYGE) {}
  
  public YGE bzF(String paramString) {
    return (YGE)this.aFZ.get(paramString);
  }
  
  public static int Dne(String paramString) {
    return paramString.equalsIgnoreCase("list") ? 0 : (paramString.equalsIgnoreCase("sidebar") ? 1 : (paramString.equalsIgnoreCase("belowName") ? 2 : -1));
  }
  
  public Collection bzF() {
    Collection collection = this.bzF.values();
    ArrayList arrayList = new ArrayList();
    if (collection != null)
      for (Map map : collection)
        arrayList.addAll(map.values());  
    return arrayList;
  }
  
  public void bzF(vfE paramvfE) {}
  
  public boolean Dne(String paramString) {
    YGE yGE = bzF(paramString);
    if (yGE != null) {
      FWm(paramString, yGE);
      return true;
    } 
    return false;
  }
  
  public OHz Dne(String paramString, vfE paramvfE) {
    Map<Object, Object> map = (Map)this.bzF.get(paramString);
    if (map == null) {
      map = new HashMap<>();
      this.bzF.put(paramString, map);
    } 
    OHz oHz = (OHz)map.get(paramvfE);
    if (oHz == null) {
      oHz = new OHz(this, paramvfE, paramString);
      map.put(paramvfE, oHz);
    } 
    return oHz;
  }
  
  public Collection Dne() {
    return this.Dne.values();
  }
  
  public void Dne(OHz paramOHz) {}
  
  public void FWm(vfE paramvfE) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SFA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */