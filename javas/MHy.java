public class MHy extends YAD {
  static {
  
  }
  
  public void Dne(fNv paramfNv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(paramfNv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((fNv)paramFUH, paramInt, paramFloat);
  }
  
  protected int Dne(fNv paramfNv, int paramInt, float paramFloat) {
    if (paramInt == 0 && paramfNv.LVR()) {
      Dne("/mob/saddle.png");
      return 1;
    } 
    return -1;
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((fNv)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((fNv)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public MHy(Gor paramGor1, Gor paramGor2, float paramFloat) {
    super(paramGor1, paramFloat);
    Dne(paramGor2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MHy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */