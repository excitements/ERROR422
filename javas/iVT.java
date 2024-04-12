final class iVT extends tip {
  public NMq FWm(Cwq paramCwq, NMq paramNMq) {
    HQH hQH = CVd.Dne(paramCwq.Qnq());
    double d1 = paramCwq.Dne() + hQH.Dne();
    double d2 = (paramCwq.FWm() + 0.2F);
    double d3 = paramCwq.bzF() + hQH.bzF();
    zMx zMx = new zMx(paramCwq.Dne(), d1, d2, d3, paramNMq);
    paramCwq.Dne().FWm(zMx);
    paramNMq.Dne(1);
    return paramNMq;
  }
  
  protected void Dne(Cwq paramCwq) {
    paramCwq.Dne().Qnq(1002, paramCwq.Dne(), paramCwq.FWm(), paramCwq.bzF(), 0);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iVT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */