public class Xzh extends Tdr {
  protected void Dne(wHH paramwHH) {
    if (((Qnq)this.Dne).aFZ == null) {
      if (paramwHH.Dne != null) {
        if (!paramwHH.Dne.mrb() && paramwHH.Dne.Dne(zBn.Dne(this, this.Dne), 5))
          paramwHH.Dne.aFZ(5); 
      } else {
        chN chN = paramwHH.Dne;
        int i = paramwHH.FWm;
        int j = paramwHH.bzF;
        switch (paramwHH.Qnq) {
          case 0:
            i--;
            break;
          case 1:
            i++;
            break;
          case 2:
            j--;
            break;
          case 3:
            j++;
            break;
          case 4:
            chN--;
            break;
          case 5:
            chN++;
            break;
        } 
        if (this.Dne.Dne(chN, i, j))
          this.Dne.FWm(chN, i, j, ((iqp)zKP.Dne).FWm); 
      } 
      g_();
    } 
  }
  
  public boolean kGO() {
    return false;
  }
  
  static {
  
  }
  
  public Xzh(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.3125F, 0.3125F);
  }
  
  public Xzh(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    Dne(0.3125F, 0.3125F);
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    return false;
  }
  
  public Xzh(Qnq paramQnq, FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramFUH, paramDouble1, paramDouble2, paramDouble3);
    Dne(0.3125F, 0.3125F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Xzh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */