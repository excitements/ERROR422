public class AtC extends wJb {
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    NMq nMq = new NMq(dEr.Dne, 1, paramQnq.Dne("map"));
    String str = "map_" + nMq.Qnq();
    Ilk ilk = new Ilk(str);
    paramQnq.Dne(str, ilk);
    ilk.FWm = 0;
    int i = 128 * (1 << ilk.FWm);
    ilk.Dne = (int)(Math.round(paramFiG.div / i) * i);
    ilk.FWm = (int)(Math.round(paramFiG.mrb / i) * i);
    ilk.Dne = (byte)((Jik)paramQnq.Dne).Dne;
    ilk.Dne();
    paramNMq.Dne--;
    if (paramNMq.Dne <= 0)
      return nMq; 
    if (!paramFiG.Dne.Dne(nMq.Dne()))
      paramFiG.Dne(nMq); 
    return paramNMq;
  }
  
  static {
  
  }
  
  protected AtC(int paramInt) {
    super(paramInt);
    Dne(JcN.aFZ);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AtC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */