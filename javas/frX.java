public class frX extends tkL {
  private final dNT Dne;
  
  private final dNT FWm;
  
  private final boolean bzF;
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  public frX(int paramInt, dNT paramdNT1, dNT paramdNT2, boolean paramBoolean) {
    super(paramInt);
    this.Dne = paramdNT1;
    this.FWm = paramdNT2;
    this.bzF = paramBoolean;
    FWm(0);
    Dne(true);
  }
  
  private boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
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
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int k = j & 0x7;
    if (i == this.Dne.FWm && k == paramNMq.Qnq()) {
      if (paramQnq.Dne(this.FWm.Dne(paramQnq, paramInt1, paramInt2, paramInt3)) && paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm.FWm, k, 3)) {
        paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), this.FWm.kGO.FWm(), (this.FWm.kGO.Dne() + 1.0F) / 2.0F, this.FWm.kGO.FWm() * 0.8F);
        paramNMq.Dne--;
      } 
      return true;
    } 
    return false;
  }
  
  public gDn Dne(int paramInt) {
    return zKP.Dne[this.Qnq].Dne(2, paramInt);
  }
  
  public String Dne(NMq paramNMq) {
    return this.Dne.Dne(paramNMq.Qnq());
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FiG paramFiG, NMq paramNMq) {
    int i = paramInt1;
    int j = paramInt2;
    int k = paramInt3;
    int m = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    int n = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int i1 = n & 0x7;
    boolean bool = ((n & 0x8) != 0) ? true : false;
    if (((paramInt4 == 1 && !bool) || (paramInt4 == 0 && bool)) && m == this.Dne.FWm && i1 == paramNMq.Qnq())
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
    m = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    n = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    i1 = n & 0x7;
    bool = ((n & 0x8) != 0) ? true : false;
    return (m == this.Dne.FWm && i1 == paramNMq.Qnq()) ? true : super.Dne(paramQnq, i, j, k, paramInt4, paramFiG, paramNMq);
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.bzF)
      return super.Dne(paramNMq, paramFiG, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3); 
    if (paramNMq.Dne == 0)
      return false; 
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int k = j & 0x7;
    boolean bool = ((j & 0x8) != 0) ? true : false;
    if (((paramInt4 == 1 && !bool) || (paramInt4 == 0 && bool)) && i == this.Dne.FWm && k == paramNMq.Qnq()) {
      if (paramQnq.Dne(this.FWm.Dne(paramQnq, paramInt1, paramInt2, paramInt3)) && paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm.FWm, k, 3)) {
        paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), this.FWm.kGO.FWm(), (this.FWm.kGO.Dne() + 1.0F) / 2.0F, this.FWm.kGO.FWm() * 0.8F);
        paramNMq.Dne--;
      } 
      return true;
    } 
    return Dne(paramNMq, paramFiG, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4) ? true : super.Dne(paramNMq, paramFiG, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\frX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */