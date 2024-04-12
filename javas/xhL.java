public class xhL extends YAD {
  public void Dne(GRq paramGRq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(paramGRq, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected float Dne(FUH paramFUH, float paramFloat) {
    return Dne((GRq)paramFUH, paramFloat);
  }
  
  static {
  
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((GRq)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public xhL(Gor paramGor, float paramFloat) {
    super(paramGor, paramFloat);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((GRq)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected float Dne(GRq paramGRq, float paramFloat) {
    float f1 = paramGRq.Qnq + (paramGRq.Dne - paramGRq.Qnq) * paramFloat;
    float f2 = paramGRq.bzF + (paramGRq.FWm - paramGRq.bzF) * paramFloat;
    return (geR.Dne(f1) + 1.0F) * f2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xhL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */