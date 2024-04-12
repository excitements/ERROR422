public class ZMH extends ycv {
  private static final int[] FWm;
  
  public final int Dne;
  
  private static final int[] Dne;
  
  private static final String[] Dne = new String[] { "all", "undead", "arthropods" };
  
  private static final int[] bzF;
  
  public boolean Dne(ycv paramycv) {
    return !(paramycv instanceof ZMH);
  }
  
  public int Dne() {
    return 5;
  }
  
  static {
    Dne = (String[])new int[] { 1, 5, 5 };
    FWm = new int[] { 11, 8, 8 };
    bzF = new int[] { 20, 20, 20 };
  }
  
  public int Dne(int paramInt, FUH paramFUH) {
    return (this.Dne == null) ? geR.Dne(paramInt * 2.75F) : ((this.Dne == true && paramFUH.Dne() == aYc.FWm) ? geR.Dne(paramInt * 4.5F) : ((this.Dne == 2 && paramFUH.Dne() == aYc.bzF) ? geR.Dne(paramInt * 4.5F) : 0));
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq.Dne() instanceof gKO) ? true : super.Dne(paramNMq);
  }
  
  public int Dne(int paramInt) {
    return Dne[this.Dne] + (paramInt - 1) * FWm[this.Dne];
  }
  
  public String Dne() {
    return "enchantment.damage." + Dne[this.Dne];
  }
  
  public int FWm(int paramInt) {
    return Dne(paramInt) + bzF[this.Dne];
  }
  
  public ZMH(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, ACj.DyG);
    this.Dne = paramInt3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZMH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */