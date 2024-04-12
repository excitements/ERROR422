public class Rlt extends dEr {
  public Rlt(int paramInt) {
    super(paramInt);
    Dne(JcN.aFZ);
  }
  
  static {
  
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
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
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i == 0) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "fire.ignite", 1.0F, Dne.nextFloat() * 0.4F + 0.8F);
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((iqp)zKP.Dne).FWm);
    } 
    if (!((uqg)paramFiG.Dne).Qnq)
      paramNMq.Dne--; 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Rlt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */