import java.util.ArrayList;
import java.util.List;

public class SoB extends ipD {
  private int Dne;
  
  private float Dne;
  
  private boolean bzF;
  
  private int FWm;
  
  private float FWm;
  
  private boolean Dne;
  
  private int bzF;
  
  private List Dne = new ArrayList();
  
  public SoB() {}
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    paramWkD.Dne("blockId", this.Dne);
    paramWkD.Dne("blockData", this.FWm);
    paramWkD.Dne("facing", this.bzF);
    paramWkD.Dne("progress", this.FWm);
    paramWkD.Dne("extending", this.Dne);
  }
  
  private void Dne(float paramFloat1, float paramFloat2) {
    if (this.Dne != null) {
      paramFloat1 = 1.0F - paramFloat1;
    } else {
      paramFloat1--;
    } 
    bSp bSp = zKP.Dne.Dne((Qnq)this.Dne, this.Qnq, this.aFZ, this.zGp, this.Dne, paramFloat1, this.bzF);
    if (bSp != null) {
      List list = this.Dne.FWm((sMa)null, bSp);
      if (!list.isEmpty()) {
        this.Dne.addAll(list);
        for (sMa sMa : this.Dne)
          sMa.Dne((paramFloat2 * rrP.FWm[this.bzF]), (paramFloat2 * rrP.bzF[this.bzF]), (paramFloat2 * rrP.Qnq[this.bzF])); 
        this.Dne.clear();
      } 
    } 
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public SoB(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Dne = paramBoolean1;
    this.bzF = paramBoolean2;
  }
  
  public float Qnq(float paramFloat) {
    return (this.Dne != null) ? ((Dne(paramFloat) - 1.0F) * rrP.Qnq[this.bzF]) : ((1.0F - Dne(paramFloat)) * rrP.Qnq[this.bzF]);
  }
  
  public boolean FWm() {
    return this.bzF;
  }
  
  public int zGp() {
    return this.FWm;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    this.Dne = paramWkD.Dne("blockId");
    this.FWm = paramWkD.Dne("blockData");
    this.bzF = paramWkD.Dne("facing");
    this.FWm = this.Dne = paramWkD.Dne("progress");
    this.Dne = paramWkD.FWm("extending");
  }
  
  public int FWm() {
    return this.bzF;
  }
  
  public void FWm() {
    if (this.FWm < 1.0F && this.Dne != null) {
      this.FWm = this.Dne = 1.0F;
      this.Dne.bzF(this.Qnq, this.aFZ, this.zGp);
      zGp();
      if (this.Dne.Dne(this.Qnq, this.aFZ, this.zGp) == ((tsU)zKP.Dne).FWm) {
        this.Dne.FWm(this.Qnq, this.aFZ, this.zGp, this.Dne, this.FWm, 3);
        this.Dne.Qnq(this.Qnq, this.aFZ, this.zGp, this.Dne);
      } 
    } 
  }
  
  public void Dne() {
    this.FWm = this.Dne;
    if (this.FWm >= 1.0F) {
      Dne(1.0F, 0.25F);
      this.Dne.bzF(this.Qnq, this.aFZ, this.zGp);
      zGp();
      if (this.Dne.Dne(this.Qnq, this.aFZ, this.zGp) == ((tsU)zKP.Dne).FWm) {
        this.Dne.FWm(this.Qnq, this.aFZ, this.zGp, this.Dne, this.FWm, 3);
        this.Dne.Qnq(this.Qnq, this.aFZ, this.zGp, this.Dne);
      } 
    } else {
      this.Dne += 0.5F;
      if (this.Dne >= 1.0F)
        this.Dne = 1.0F; 
      if (this.Dne != null)
        Dne(this.Dne, this.Dne - this.FWm + 0.0625F); 
    } 
  }
  
  public float bzF(float paramFloat) {
    return (this.Dne != null) ? ((Dne(paramFloat) - 1.0F) * rrP.bzF[this.bzF]) : ((1.0F - Dne(paramFloat)) * rrP.bzF[this.bzF]);
  }
  
  public float FWm(float paramFloat) {
    return (this.Dne != null) ? ((Dne(paramFloat) - 1.0F) * rrP.FWm[this.bzF]) : ((1.0F - Dne(paramFloat)) * rrP.FWm[this.bzF]);
  }
  
  public float Dne(float paramFloat) {
    if (paramFloat > 1.0F)
      paramFloat = 1.0F; 
    return this.FWm + (this.Dne - this.FWm) * paramFloat;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SoB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */