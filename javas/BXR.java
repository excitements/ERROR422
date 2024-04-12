public class BXR implements IPx {
  private double FWm;
  
  private double bzF;
  
  private DOP Dne;
  
  private double Dne = hAW.Dne();
  
  public boolean Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LDOP;
    //   4: dload_1
    //   5: aload_0
    //   6: getfield Dne : D
    //   9: dsub
    //   10: dload_3
    //   11: aload_0
    //   12: getfield FWm : D
    //   15: dsub
    //   16: dload #5
    //   18: aload_0
    //   19: getfield bzF : D
    //   22: dsub
    //   23: dload #7
    //   25: aload_0
    //   26: getfield Dne : D
    //   29: dsub
    //   30: dload #9
    //   32: aload_0
    //   33: getfield FWm : D
    //   36: dsub
    //   37: dload #11
    //   39: aload_0
    //   40: getfield bzF : D
    //   43: dsub
    //   44: invokevirtual Dne : (DDDDDD)Z
    //   47: ireturn
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
  }
  
  public boolean Dne(bSp parambSp) {
    return Dne(parambSp.Dne, parambSp.FWm, parambSp.bzF, parambSp.Qnq, parambSp.aFZ, parambSp.zGp);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BXR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */