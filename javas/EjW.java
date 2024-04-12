final class EjW extends tip {
  private final tip Dne = new tip();
  
  public NMq FWm(Cwq paramCwq, NMq paramNMq) {
    double d4;
    HQH hQH = CVd.Dne(paramCwq.Qnq());
    Qnq qnq = paramCwq.Dne();
    double d1 = paramCwq.Dne() + (hQH.Dne() * 1.125F);
    double d2 = paramCwq.FWm() + (hQH.FWm() * 1.125F);
    double d3 = paramCwq.bzF() + (hQH.bzF() * 1.125F);
    int i = paramCwq.Dne() + hQH.Dne();
    int j = paramCwq.FWm() + hQH.FWm();
    int k = paramCwq.bzF() + hQH.bzF();
    int m = qnq.Dne(i, j, k);
    if (Oaf.Dne(m)) {
      d4 = 0.0D;
    } else {
      if (m != 0 || !Oaf.Dne(qnq.Dne(i, j - 1, k)))
        return this.Dne.Dne(paramCwq, paramNMq); 
      d4 = -1.0D;
    } 
    Ebp ebp = Ebp.Dne(qnq, d1, d2 + d4, d3, ((xsl)paramNMq.Dne()).Dne);
    qnq.FWm(ebp);
    paramNMq.Dne(1);
    return paramNMq;
  }
  
  protected void Dne(Cwq paramCwq) {
    paramCwq.Dne().Qnq(1000, paramCwq.Dne(), paramCwq.FWm(), paramCwq.bzF(), 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EjW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */