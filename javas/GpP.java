public class GpP extends dEr {
  private final Class Dne;
  
  public GpP(int paramInt, Class paramClass) {
    super(paramInt);
    this.Dne = paramClass;
    Dne(JcN.FWm);
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramInt4 == 0)
      return false; 
    if (paramInt4 == 1)
      return false; 
    int i = zxJ.Qnq[paramInt4];
    RsG rsG = Dne(paramQnq, paramInt1, paramInt2, paramInt3, i);
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    if (rsG != null && rsG.Qnq()) {
      if (paramQnq.aFZ == null)
        paramQnq.FWm(rsG); 
      paramNMq.Dne--;
    } 
    return true;
  }
  
  private RsG Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (this.Dne == JCd.class) ? new JCd(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4) : ((this.Dne == BPY.class) ? new BPY(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4) : null);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GpP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */