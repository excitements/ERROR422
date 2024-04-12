public class Gfb extends dEr {
  public Gfb(int paramInt) {
    super(paramInt);
    Dne(JcN.mrb);
  }
  
  static {
  
  }
  
  public gDn Dne(int paramInt) {
    return dEr.Dne.Dne(0);
  }
  
  public void Dne(Rbp paramRbp) {}
  
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
      if (paramQnq.Dne(chN, i, j) == KFd.div) {
        paramNMq.Dne--;
        if (paramNMq.Dne <= 0)
          return new NMq(dEr.Dne); 
        if (!paramFiG.Dne.Dne(new NMq(dEr.Dne)))
          paramFiG.Dne(new NMq(((IJk)dEr.Dne).Qnq, 1, 0)); 
      } 
    } 
    return paramNMq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gfb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */