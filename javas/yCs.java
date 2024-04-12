public class yCs extends dEr {
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) != zKP.EwP.FWm) {
      if (paramInt4 == 0)
        paramInt2--; 
      if (paramInt4 == 1)
        paramInt2++; 
      if (paramInt4 == 2)
        paramInt3--; 
      if (paramInt4 == 3)
        paramInt3++; 
      if (paramInt4 == 4)
        paramInt1--; 
      if (paramInt4 == 5)
        paramInt1++; 
      if (!paramQnq.Dne(paramInt1, paramInt2, paramInt3))
        return false; 
    } 
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    if (zKP.Dne.Dne(paramQnq, paramInt1, paramInt2, paramInt3)) {
      paramNMq.Dne--;
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((VHB)zKP.Dne).FWm);
    } 
    return true;
  }
  
  public yCs(int paramInt) {
    super(paramInt);
    Dne(JcN.bzF);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yCs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */