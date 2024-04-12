public class JBR extends dEr {
  static {
  
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramInt4 == 0)
      return false; 
    if (!paramQnq.Dne(paramInt1, paramInt2, paramInt3).Dne())
      return false; 
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
    if (!zKP.LVR.Dne(paramQnq, paramInt1, paramInt2, paramInt3))
      return false; 
    if (paramInt4 == 1) {
      int i = geR.FWm(((paramFiG.mrb + 180.0F) * 16.0F / 360.0F) + 0.5D) & 0xF;
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.LVR.FWm, i, 2);
    } else {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.qMV.FWm, paramInt4, 2);
    } 
    paramNMq.Dne--;
    AjG ajG = (AjG)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (ajG != null)
      paramFiG.Dne(ajG); 
    return true;
  }
  
  public JBR(int paramInt) {
    super(paramInt);
    Dne(JcN.FWm);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JBR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */