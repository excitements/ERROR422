public class pnl implements iQt {
  public boolean Dne(Uqm paramUqm, Qnq paramQnq) {
    byte b1 = 0;
    NMq nMq = null;
    for (byte b2 = 0; b2 < paramUqm.Qnq(); b2++) {
      NMq nMq1 = paramUqm.Dne(b2);
      if (nMq1 != null)
        if (nMq1.bzF == dEr.Dne.Qnq) {
          if (nMq != null)
            return false; 
          nMq = nMq1;
        } else {
          if (nMq1.bzF != ((AtC)dEr.Dne).Qnq)
            return false; 
          b1++;
        }  
    } 
    return (nMq != null && b1 > 0);
  }
  
  public NMq Dne(Uqm paramUqm) {
    byte b1 = 0;
    NMq nMq = null;
    for (byte b2 = 0; b2 < paramUqm.Qnq(); b2++) {
      NMq nMq1 = paramUqm.Dne(b2);
      if (nMq1 != null)
        if (nMq1.bzF == dEr.Dne.Qnq) {
          if (nMq != null)
            return null; 
          nMq = nMq1;
        } else {
          if (nMq1.bzF != ((AtC)dEr.Dne).Qnq)
            return null; 
          b1++;
        }  
    } 
    if (nMq != null && b1 >= 1) {
      NMq nMq1 = new NMq(dEr.Dne, b1 + 1, nMq.Qnq());
      if (nMq.zGp())
        nMq1.Dne(nMq.FWm()); 
      return nMq1;
    } 
    return null;
  }
  
  static {
  
  }
  
  public int Dne() {
    return 9;
  }
  
  public NMq Dne() {
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pnl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */