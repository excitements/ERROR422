import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FkP {
  private Map Dne;
  
  private Map FWm = new HashMap<>();
  
  private boolean Dne;
  
  private yJm Dne = (yJm)new HashMap<>();
  
  public int Dne(RLC paramRLC) {
    Integer integer = (Integer)this.Dne.get(paramRLC);
    return (integer == null) ? 0 : integer.intValue();
  }
  
  private void Dne(Map<RLC, Integer> paramMap, RLC paramRLC, int paramInt) {
    Integer integer = (Integer)paramMap.get(paramRLC);
    byte b = (integer == null) ? 0 : integer.intValue();
    paramMap.put(paramRLC, Integer.valueOf(b + paramInt));
  }
  
  public void FWm(Map paramMap) {
    if (paramMap != null)
      for (RLC rLC : paramMap.keySet()) {
        Integer integer = (Integer)this.FWm.get(rLC);
        byte b = (integer == null) ? 0 : integer.intValue();
        this.Dne.put(rLC, Integer.valueOf(((Integer)paramMap.get(rLC)).intValue() + b));
      }  
  }
  
  public boolean FWm(Auk paramAuk) {
    return (paramAuk.Dne == null || Dne((Auk)paramAuk.Dne));
  }
  
  public void bzF(Map paramMap) {
    if (paramMap != null) {
      this.Dne = true;
      for (RLC rLC : paramMap.keySet())
        Dne(this.FWm, rLC, ((Integer)paramMap.get(rLC)).intValue()); 
    } 
  }
  
  public boolean Dne(Auk paramAuk) {
    return this.Dne.containsKey(paramAuk);
  }
  
  public void Dne(RLC paramRLC, int paramInt) {
    Dne(this.FWm, paramRLC, paramInt);
    Dne((Map)this.Dne, paramRLC, paramInt);
    this.Dne = true;
  }
  
  public static Map Dne(String paramString) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    try {
      String str1 = "local";
      StringBuilder stringBuilder = new StringBuilder();
      bab bab = (new tjH()).Dne(paramString);
      List list = bab.Dne(new Object[] { "stats-change" });
      for (LIC lIC : list) {
        Map map = lIC.Dne();
        Map.Entry entry = map.entrySet().iterator().next();
        int i = Integer.parseInt(((QUo)entry.getKey()).Dne());
        int j = Integer.parseInt(((LIC)entry.getValue()).Dne());
        RLC rLC = trP.Dne(i);
        if (rLC == null) {
          System.out.println(i + " is not a valid stat, creating place-holder");
          rLC = (new oXU(i)).Dne();
        } 
        stringBuilder.append((String)(trP.Dne(i)).Dne).append(",");
        stringBuilder.append(j).append(",");
        hashMap.put(rLC, Integer.valueOf(j));
      } 
      hYu hYu = new hYu(str1);
      String str2 = hYu.Dne(stringBuilder.toString());
      if (!str2.equals(bab.Dne(new Object[] { "checksum" }))) {
        System.out.println("CHECKSUM MISMATCH");
        return null;
      } 
    } catch (pPp pPp) {
      pPp.printStackTrace();
    } 
    return hashMap;
  }
  
  public void Dne() {
    this.Dne.FWm(Dne());
  }
  
  public FkP(vwN paramvwN, File paramFile) {
    this.Dne = false;
    File file = new File(paramFile, "stats");
    if (!file.exists())
      file.mkdir(); 
    for (File file1 : paramFile.listFiles()) {
      if (file1.getName().startsWith("stats_") && file1.getName().endsWith(".dat")) {
        File file2 = new File(file, file1.getName());
        if (!file2.exists()) {
          System.out.println("Relocating " + file1.getName());
          file1.renameTo(file2);
        } 
      } 
    } 
    this.Dne = new yJm(paramvwN, this, file);
  }
  
  public void Dne(Map paramMap) {
    if (paramMap != null) {
      this.Dne = true;
      for (RLC rLC : paramMap.keySet()) {
        Dne(this.FWm, rLC, ((Integer)paramMap.get(rLC)).intValue());
        Dne((Map)this.Dne, rLC, ((Integer)paramMap.get(rLC)).intValue());
      } 
    } 
  }
  
  public static String Dne(String paramString1, String paramString2, Map paramMap) {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    boolean bool = true;
    stringBuilder1.append("{\r\n");
    if (paramString1 != null && paramString2 != null) {
      stringBuilder1.append("  \"user\":{\r\n");
      stringBuilder1.append("    \"name\":\"").append(paramString1).append("\",\r\n");
      stringBuilder1.append("    \"sessionid\":\"").append(paramString2).append("\"\r\n");
      stringBuilder1.append("  },\r\n");
    } 
    stringBuilder1.append("  \"stats-change\":[");
    for (RLC rLC : paramMap.keySet()) {
      if (bool) {
        bool = false;
      } else {
        stringBuilder1.append("},");
      } 
      stringBuilder1.append("\r\n    {\"").append(rLC.bzF).append("\":").append(paramMap.get(rLC));
      stringBuilder2.append((String)rLC.Dne).append(",");
      stringBuilder2.append(paramMap.get(rLC)).append(",");
    } 
    if (!bool)
      stringBuilder1.append("}"); 
    hYu hYu = new hYu(paramString2);
    stringBuilder1.append("\r\n  ],\r\n");
    stringBuilder1.append("  \"checksum\":\"").append(hYu.Dne(stringBuilder2.toString())).append("\"\r\n");
    stringBuilder1.append("}");
    return stringBuilder1.toString();
  }
  
  public Map Dne() {
    return new HashMap<>(this.FWm);
  }
  
  public void FWm() {
    if (this.Dne != null && this.Dne.Dne())
      this.Dne.Dne(Dne()); 
    this.Dne.FWm();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FkP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */