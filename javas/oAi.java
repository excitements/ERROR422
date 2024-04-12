public class oAi extends ycv {
  private static final String[] Dne = new String[] { "all", "fire", "fall", "explosion", "projectile" };
  
  private static final int[] FWm;
  
  private static final int[] bzF;
  
  private static final int[] Dne = new int[] { 1, 10, 5, 5, 3 };
  
  public final int Dne;
  
  public int Dne() {
    return 4;
  }
  
  public static double Dne(sMa paramsMa, double paramDouble) {
    int i = UYp.Dne(ycv.Qnq.FWm, paramsMa.Dne());
    if (i > 0)
      paramDouble -= geR.FWm(paramDouble * (i * 0.15F)); 
    return paramDouble;
  }
  
  public int FWm(int paramInt) {
    return Dne(paramInt) + bzF[this.Dne];
  }
  
  public static int Dne(sMa paramsMa, int paramInt) {
    int i = UYp.Dne(ycv.FWm.FWm, paramsMa.Dne());
    if (i > 0)
      paramInt -= geR.Dne(paramInt * i * 0.15F); 
    return paramInt;
  }
  
  static {
    FWm = new int[] { 11, 8, 6, 8, 6 };
    bzF = new int[] { 20, 12, 10, 12, 15 };
  }
  
  public String Dne() {
    return "enchantment.protect." + Dne[this.Dne];
  }
  
  public oAi(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, ACj.FWm);
    this.Dne = paramInt3;
    if (paramInt3 == 2)
      this.Dne = ACj.bzF; 
  }
  
  public boolean Dne(ycv paramycv) {
    if (paramycv instanceof oAi) {
      oAi oAi1 = (oAi)paramycv;
      return (oAi1.Dne == this.Dne) ? false : ((this.Dne == 2 || oAi1.Dne == 2));
    } 
    return super.Dne(paramycv);
  }
  
  public int Dne(int paramInt) {
    return Dne[this.Dne] + (paramInt - 1) * FWm[this.Dne];
  }
  
  public int Dne(int paramInt, zBn paramzBn) {
    if (paramzBn.Qnq())
      return 0; 
    float f = (6 + paramInt * paramInt) / 3.0F;
    return (this.Dne == 0) ? geR.Dne(f * 0.75F) : ((this.Dne == 1 && paramzBn.aFZ()) ? geR.Dne(f * 1.25F) : ((this.Dne == 2 && paramzBn == zBn.div) ? geR.Dne(f * 2.5F) : ((this.Dne == 3 && paramzBn.FWm()) ? geR.Dne(f * 1.5F) : ((this.Dne == 4 && paramzBn.Dne()) ? geR.Dne(f * 1.5F) : 0))));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oAi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */