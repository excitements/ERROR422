public class bcN extends lQC {
  public bcN(int paramInt, zKP paramzKP) {
    super(paramInt, paramzKP);
  }
  
  static {
  
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramNMq.Dne == 0)
      return false; 
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i == zKP.EwP.FWm) {
      dNT dNT = zKP.Dne[FWm()];
      int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int k = j & 0x7;
      if (k <= 6 && paramQnq.Dne(dNT.Dne(paramQnq, paramInt1, paramInt2, paramInt3)) && paramQnq.Dne(paramInt1, paramInt2, paramInt3, k + 1 | j & 0xFFFFFFF8, 2)) {
        paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), dNT.kGO.FWm(), (dNT.kGO.Dne() + 1.0F) / 2.0F, dNT.kGO.FWm() * 0.8F);
        paramNMq.Dne--;
        return true;
      } 
    } 
    return super.Dne(paramNMq, paramFiG, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bcN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */