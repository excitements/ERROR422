public class lbo extends itx {
  public lbo(int paramInt) {
    super(paramInt, false);
  }
  
  public int Dne(NMq paramNMq, int paramInt) {
    return zKP.gvF.FWm(paramNMq.Qnq());
  }
  
  static {
  
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    wHH wHH = Dne(paramQnq, paramFiG, true);
    if (wHH == null)
      return paramNMq; 
    if (wHH.Dne == gks.Dne) {
      chN chN = wHH.Dne;
      int i = wHH.FWm;
      int j = wHH.bzF;
      if (!paramQnq.Dne(paramFiG, chN, i, j))
        return paramNMq; 
      if (!paramFiG.Dne(chN, i, j, wHH.Qnq, paramNMq))
        return paramNMq; 
      if (paramQnq.Dne(chN, i, j) == KFd.div && paramQnq.bzF(chN, i, j) == 0 && paramQnq.Dne(chN, i + 1, j)) {
        paramQnq.FWm(chN, i + 1, j, zKP.gvF.FWm);
        if (!((uqg)paramFiG.Dne).Qnq)
          paramNMq.Dne--; 
      } 
    } 
    return paramNMq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lbo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */