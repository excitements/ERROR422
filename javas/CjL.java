public class CjL extends dEr {
  private int Dne;
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i == zKP.EwP.FWm && (paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x7) < 1) {
      paramInt4 = 1;
    } else if (i != zKP.ipf.FWm && i != ((Tte)zKP.Dne).FWm && i != ((bdU)zKP.Dne).FWm) {
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
    } 
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    if (paramNMq.Dne == 0)
      return false; 
    if (paramQnq.Dne(this.Dne, paramInt1, paramInt2, paramInt3, false, paramInt4, (sMa)null, paramNMq)) {
      dNT dNT = zKP.Dne[this.Dne];
      int j = dNT.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, 0);
      if (paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.Dne, j, 3)) {
        if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.Dne) {
          zKP.Dne[this.Dne].Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG, paramNMq);
          zKP.Dne[this.Dne].aFZ(paramQnq, paramInt1, paramInt2, paramInt3, j);
        } 
        paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), dNT.kGO.FWm(), (dNT.kGO.Dne() + 1.0F) / 2.0F, dNT.kGO.FWm() * 0.8F);
        paramNMq.Dne--;
      } 
    } 
    return true;
  }
  
  public CjL(int paramInt, zKP paramzKP) {
    super(paramInt);
    this.Dne = paramzKP.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CjL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */