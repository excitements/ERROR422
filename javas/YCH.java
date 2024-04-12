public class YCH extends Tdr {
  public boolean Qnq() {
    return (this.Dne.Dne(10) == 1);
  }
  
  static {
  
  }
  
  public float Dne(yTR paramyTR, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, zKP paramzKP) {
    float f = super.Dne(paramyTR, paramQnq, paramInt1, paramInt2, paramInt3, paramzKP);
    if (Qnq() && paramzKP != zKP.zGp && paramzKP != zKP.EYV && paramzKP != zKP.dBc)
      f = Math.min(0.8F, f); 
    return f;
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    return false;
  }
  
  protected float bzF() {
    return Qnq() ? 0.73F : super.bzF();
  }
  
  public boolean kGO() {
    return false;
  }
  
  protected void FWm() {
    this.Dne.Dne(10, Byte.valueOf((byte)0));
  }
  
  public boolean trS() {
    return false;
  }
  
  public void FWm(boolean paramBoolean) {
    this.Dne.FWm(10, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
  }
  
  public YCH(Qnq paramQnq, FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramFUH, paramDouble1, paramDouble2, paramDouble3);
    Dne(0.3125F, 0.3125F);
  }
  
  public YCH(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.3125F, 0.3125F);
  }
  
  public YCH(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    Dne(0.3125F, 0.3125F);
  }
  
  protected void Dne(wHH paramwHH) {
    if (((Qnq)this.Dne).aFZ == null) {
      if (paramwHH.Dne != null) {
        if (this.Dne != null) {
          if (paramwHH.Dne.Dne(zBn.Dne(this.Dne), 8) && !paramwHH.Dne.udO())
            this.Dne.Dne(5); 
        } else {
          paramwHH.Dne.Dne(zBn.XHL, 5);
        } 
        if (paramwHH.Dne instanceof FUH) {
          byte b = 0;
          if (((Qnq)this.Dne).aFZ > true)
            if (((Qnq)this.Dne).aFZ == 2) {
              b = 10;
            } else if (((Qnq)this.Dne).aFZ == 3) {
              b = 40;
            }  
          if (b > 0)
            ((FUH)paramwHH.Dne).Qnq(new NAx(SXd.EyB.Dne, 20 * b, 1)); 
        } 
      } 
      this.Dne.Dne(this, this.div, this.IjH, this.mrb, 1.0F, false, this.Dne.Dne().Dne("mobGriefing"));
      g_();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YCH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */