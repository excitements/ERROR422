public class tip implements ClS {
  protected void Dne(Cwq paramCwq) {
    paramCwq.Dne().Qnq(1000, paramCwq.Dne(), paramCwq.FWm(), paramCwq.bzF(), 0);
  }
  
  public static void Dne(Qnq paramQnq, NMq paramNMq, int paramInt, HQH paramHQH, loO paramloO) {
    double d1 = paramloO.Dne();
    double d2 = paramloO.FWm();
    double d3 = paramloO.bzF();
    JiM jiM = new JiM(paramQnq, d1, d2 - 0.3D, d3, paramNMq);
    double d4 = paramQnq.Dne.nextDouble() * 0.1D + 0.2D;
    jiM.XHL = paramHQH.Dne() * d4;
    jiM.Zpi = 0.20000000298023224D;
    jiM.kGO = paramHQH.bzF() * d4;
    jiM.XHL += paramQnq.Dne.nextGaussian() * 0.007499999832361937D * paramInt;
    jiM.Zpi += paramQnq.Dne.nextGaussian() * 0.007499999832361937D * paramInt;
    jiM.kGO += paramQnq.Dne.nextGaussian() * 0.007499999832361937D * paramInt;
    paramQnq.FWm(jiM);
  }
  
  protected NMq FWm(Cwq paramCwq, NMq paramNMq) {
    HQH hQH = CVd.Dne(paramCwq.Qnq());
    loO loO = CVd.Dne(paramCwq);
    NMq nMq = paramNMq.Dne(1);
    Dne(paramCwq.Dne(), nMq, 6, hQH, loO);
    return paramNMq;
  }
  
  static {
  
  }
  
  protected void Dne(Cwq paramCwq, HQH paramHQH) {
    paramCwq.Dne().Qnq(2000, paramCwq.Dne(), paramCwq.FWm(), paramCwq.bzF(), Dne(paramHQH));
  }
  
  public final NMq Dne(Cwq paramCwq, NMq paramNMq) {
    NMq nMq = FWm(paramCwq, paramNMq);
    Dne(paramCwq);
    Dne(paramCwq, CVd.Dne(paramCwq.Qnq()));
    return nMq;
  }
  
  private int Dne(HQH paramHQH) {
    return paramHQH.Dne() + 1 + (paramHQH.bzF() + 1) * 3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */