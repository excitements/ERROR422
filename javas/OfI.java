public class OfI extends dEr {
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    if (paramInt4 != 1)
      return false; 
    paramInt2++;
    rTW rTW = (rTW)zKP.FfS;
    int i = geR.FWm((paramFiG.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    byte b1 = 0;
    byte b2 = 0;
    if (i == 0)
      b2 = 1; 
    if (i == 1)
      b1 = -1; 
    if (i == 2)
      b2 = -1; 
    if (i == 3)
      b1 = 1; 
    if (paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq) && paramFiG.Dne(paramInt1 + b1, paramInt2, paramInt3 + b2, paramInt4, paramNMq)) {
      if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) && paramQnq.Dne(paramInt1 + b1, paramInt2, paramInt3 + b2) && paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && paramQnq.IjH(paramInt1 + b1, paramInt2 - 1, paramInt3 + b2)) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, rTW.FWm, i, 3);
        if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == rTW.FWm)
          paramQnq.FWm(paramInt1 + b1, paramInt2, paramInt3 + b2, rTW.FWm, i + 8, 3); 
        paramNMq.Dne--;
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  public OfI(int paramInt) {
    super(paramInt);
    Dne(JcN.FWm);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OfI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */