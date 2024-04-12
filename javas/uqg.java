public class uqg {
  public boolean Dne;
  
  private float FWm;
  
  public boolean Qnq = false;
  
  public boolean aFZ = true;
  
  public boolean bzF = false;
  
  private float Dne = false;
  
  public boolean FWm = false;
  
  public float Dne() {
    return this.Dne;
  }
  
  public uqg() {
    this.Dne = 0.05F;
    this.FWm = 0.1F;
  }
  
  public void FWm(WkD paramWkD) {
    if (paramWkD.Dne("abilities")) {
      WkD wkD = paramWkD.Dne("abilities");
      this.Dne = wkD.FWm("invulnerable");
      this.FWm = wkD.FWm("flying");
      this.bzF = wkD.FWm("mayfly");
      this.Qnq = wkD.FWm("instabuild");
      if (wkD.Dne("flySpeed")) {
        this.Dne = wkD.Dne("flySpeed");
        this.FWm = wkD.Dne("walkSpeed");
      } 
      if (wkD.Dne("mayBuild"))
        this.aFZ = wkD.FWm("mayBuild"); 
    } 
  }
  
  public void Dne(WkD paramWkD) {
    WkD wkD = new WkD();
    wkD.Dne("invulnerable", this.Dne);
    wkD.Dne("flying", this.FWm);
    wkD.Dne("mayfly", this.bzF);
    wkD.Dne("instabuild", this.Qnq);
    wkD.Dne("mayBuild", this.aFZ);
    wkD.Dne("flySpeed", this.Dne);
    wkD.Dne("walkSpeed", this.FWm);
    paramWkD.Dne("abilities", wkD);
  }
  
  public void Dne(float paramFloat) {
    this.Dne = paramFloat;
  }
  
  public void FWm(float paramFloat) {
    this.FWm = paramFloat;
  }
  
  public float FWm() {
    return this.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uqg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */