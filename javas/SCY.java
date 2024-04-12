import java.util.List;

public class SCY {
  private int FWm;
  
  private int Dne;
  
  private float Dne = 20;
  
  private float FWm;
  
  private int bzF;
  
  public void Dne(FiG paramFiG) {
    List list = ((Qnq)paramFiG.Dne).aFZ;
    this.bzF = this.Dne;
    if (this.FWm > 4.0F) {
      this.FWm -= 4.0F;
      if (this.Dne > 0.0F) {
        this.Dne = Math.max(this.Dne - 1.0F, 0.0F);
      } else if (list > null) {
        this.Dne = Math.max(this.Dne - 1, 0);
      } 
    } 
    if (this.Dne >= 18 && paramFiG.ICU()) {
      this.FWm++;
      if (this.FWm >= 80) {
        paramFiG.Dne(1);
        this.FWm = false;
      } 
    } else if (this.Dne <= 0.0F) {
      this.FWm++;
      if (this.FWm >= 80) {
        if (paramFiG.XHL() > 10 || list >= 3 || (paramFiG.XHL() > 1 && list >= 2))
          paramFiG.Dne(zBn.zGp, 1); 
        this.FWm = false;
      } 
    } else {
      this.FWm = false;
    } 
  }
  
  public void FWm(float paramFloat) {
    this.Dne = paramFloat;
  }
  
  public boolean Dne() {
    return (this.Dne < 20);
  }
  
  public float Dne() {
    return this.Dne;
  }
  
  public void FWm(WkD paramWkD) {
    paramWkD.Dne("foodLevel", this.Dne);
    paramWkD.Dne("foodTickTimer", this.FWm);
    paramWkD.Dne("foodSaturationLevel", this.Dne);
    paramWkD.Dne("foodExhaustionLevel", this.FWm);
  }
  
  public void Dne(float paramFloat) {
    this.FWm = Math.min(this.FWm + paramFloat, 40.0F);
  }
  
  public SCY() {
    this.Dne = 5.0F;
    this.FWm = false;
    this.bzF = 20;
  }
  
  public void Dne(PBI paramPBI) {
    Dne(paramPBI.FWm(), paramPBI.Dne());
  }
  
  public int FWm() {
    return this.bzF;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void Dne(WkD paramWkD) {
    if (paramWkD.Dne("foodLevel")) {
      this.Dne = paramWkD.Dne("foodLevel");
      this.FWm = paramWkD.Dne("foodTickTimer");
      this.Dne = paramWkD.Dne("foodSaturationLevel");
      this.FWm = paramWkD.Dne("foodExhaustionLevel");
    } 
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
  
  public void Dne(int paramInt, float paramFloat) {
    this.Dne = Math.min(paramInt + this.Dne, 20);
    this.Dne = Math.min(this.Dne + paramInt * paramFloat * 2.0F, this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SCY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */