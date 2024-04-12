public class ocy extends dEr {
  private int FWm;
  
  private int Dne;
  
  public ocy(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.Dne = paramInt2;
    this.FWm = paramInt3;
    Dne(JcN.XHL);
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramInt4 != 1)
      return false; 
    if (paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq) && paramFiG.Dne(paramInt1, paramInt2 + 1, paramInt3, paramInt4, paramNMq)) {
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, this.Dne);
      paramNMq.Dne--;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ocy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */