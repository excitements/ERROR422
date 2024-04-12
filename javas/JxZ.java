public class JxZ extends UgS {
  public JxZ() {
    super(3, 3, new NMq[] { new NMq(dEr.lMz), new NMq(dEr.lMz), new NMq(dEr.lMz), new NMq(dEr.lMz), new NMq(dEr.Dne, 0, 32767), new NMq(dEr.lMz), new NMq(dEr.lMz), new NMq(dEr.lMz), new NMq(dEr.lMz) }new NMq(dEr.Dne, 0, 0));
  }
  
  public NMq Dne(Uqm paramUqm) {
    NMq nMq = null;
    for (byte b = 0; b < paramUqm.Qnq() && nMq == null; b++) {
      NMq nMq1 = paramUqm.Dne(b);
      if (nMq1 != null && nMq1.bzF == dEr.Dne.Qnq)
        nMq = nMq1; 
    } 
    nMq = nMq.Dne();
    nMq.Dne = 1;
    if (nMq.Dne() == null)
      nMq.FWm(new WkD()); 
    nMq.Dne().Dne("map_is_scaling", true);
    return nMq;
  }
  
  public boolean Dne(Uqm paramUqm, Qnq paramQnq) {
    if (!super.Dne(paramUqm, paramQnq))
      return false; 
    NMq nMq = null;
    for (byte b = 0; b < paramUqm.Qnq() && nMq == null; b++) {
      NMq nMq1 = paramUqm.Dne(b);
      if (nMq1 != null && nMq1.bzF == dEr.Dne.Qnq)
        nMq = nMq1; 
    } 
    if (nMq == null)
      return false; 
    Ilk ilk = dEr.Dne.Dne(nMq, paramQnq);
    return (ilk == null) ? false : ((ilk.FWm < 4));
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JxZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */