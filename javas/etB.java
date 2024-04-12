public class etB {
  private boolean Qnq;
  
  public String Qnq;
  
  public String Dne;
  
  public String bzF;
  
  private boolean bzF;
  
  public String FWm;
  
  public String aFZ = "UNKNOWN";
  
  private boolean FWm;
  
  public long Dne;
  
  public int Dne;
  
  public boolean Dne = true;
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public void Dne(boolean paramBoolean) {
    this.bzF = paramBoolean;
    this.FWm = false;
  }
  
  public void FWm(boolean paramBoolean) {
    this.Qnq = paramBoolean;
  }
  
  public etB(String paramString1, String paramString2) {
    this.Dne = false;
    this.FWm = true;
    this.bzF = false;
    this.Qnq = Character.MIN_VALUE;
    this.Dne = paramString1;
    this.FWm = paramString2;
  }
  
  public boolean Dne() {
    return this.bzF;
  }
  
  public WkD Dne() {
    WkD wkD = new WkD();
    wkD.Dne("name", this.Dne);
    wkD.Dne("ip", this.FWm);
    wkD.Dne("hideAddress", this.Qnq);
    if (!this.FWm)
      wkD.Dne("acceptTextures", this.bzF); 
    return wkD;
  }
  
  public static etB Dne(WkD paramWkD) {
    etB etB1 = new etB(paramWkD.Dne("name"), paramWkD.Dne("ip"));
    etB1.Qnq = paramWkD.FWm("hideAddress");
    if (paramWkD.Dne("acceptTextures"))
      etB1.Dne(paramWkD.FWm("acceptTextures")); 
    return etB1;
  }
  
  public boolean bzF() {
    return this.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\etB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */