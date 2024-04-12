import java.util.List;

final class LhV extends tip {
  static {
  
  }
  
  protected NMq FWm(Cwq paramCwq, NMq paramNMq) {
    HQH hQH = CVd.Dne(paramCwq.Qnq());
    int i = paramCwq.Dne() + hQH.Dne();
    int j = paramCwq.FWm() + hQH.FWm();
    int k = paramCwq.bzF() + hQH.bzF();
    bSp bSp = bSp.Dne().Dne(i, j, k, (i + 1), (j + 1), (k + 1));
    List<FUH> list = paramCwq.Dne().Dne(FUH.class, bSp, new DlZ(paramNMq));
    if (list.size() > 0) {
      FUH fUH = list.get(0);
      byte b = (fUH instanceof FiG) ? 1 : 0;
      int m = FUH.Dne(paramNMq);
      NMq nMq = paramNMq.Dne();
      nMq.Dne = 1;
      fUH.a_(m - b, nMq);
      fUH.Dne(m, 2.0F);
      paramNMq.Dne--;
      return paramNMq;
    } 
    return super.FWm(paramCwq, paramNMq);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LhV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */