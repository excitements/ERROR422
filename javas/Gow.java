public class Gow extends PBI {
  private int bzF;
  
  private int FWm;
  
  public Gow(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4) {
    super(paramInt1, paramInt2, paramFloat, false);
    this.FWm = paramInt3;
    this.bzF = paramInt4;
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramInt4 != 1)
      return false; 
    if (paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq) && paramFiG.Dne(paramInt1, paramInt2 + 1, paramInt3, paramInt4, paramNMq)) {
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
      paramNMq.Dne--;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */