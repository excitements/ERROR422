import java.util.Random;

final class yas extends tip {
  private boolean Dne = true;
  
  protected void Dne(Cwq paramCwq) {
    if (this.Dne) {
      paramCwq.Dne().Qnq(1000, paramCwq.Dne(), paramCwq.FWm(), paramCwq.bzF(), 0);
    } else {
      paramCwq.Dne().Qnq(1001, paramCwq.Dne(), paramCwq.FWm(), paramCwq.bzF(), 0);
    } 
  }
  
  protected NMq FWm(Cwq paramCwq, NMq paramNMq) {
    HQH hQH = CVd.Dne(paramCwq.Qnq());
    Qnq qnq = paramCwq.Dne();
    int i = paramCwq.Dne() + hQH.Dne();
    int j = paramCwq.FWm() + hQH.FWm();
    int k = paramCwq.bzF() + hQH.bzF();
    if (qnq.Dne(i, j, k)) {
      qnq.FWm(i, j, k, ((iqp)zKP.Dne).FWm);
      if (paramNMq.Dne(1, (Random)qnq.Dne))
        paramNMq.Dne = 0; 
    } else if (qnq.Dne(i, j, k) == zKP.qXo.FWm) {
      zKP.qXo.bzF(qnq, i, j, k, 1);
      qnq.Qnq(i, j, k);
    } else {
      this.Dne = false;
    } 
    return paramNMq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */