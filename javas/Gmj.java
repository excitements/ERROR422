public class Gmj {
  private Object[][] Dne = new Object[][] { { zKP.Fnk, new NMq(dEr.mrb, 9) }, { zKP.gnI, new NMq(dEr.IjH, 9) }, { zKP.eHV, new NMq(dEr.div, 9) }, { zKP.Jjb, new NMq(dEr.Kvh, 9) }, { zKP.ATE, new NMq(dEr.edi, 9, 4) }, { zKP.mte, new NMq(dEr.exS, 9) } };
  
  public void Dne(aXt paramaXt) {
    for (byte b = 0; b < this.Dne.length; b++) {
      zKP zKP = (zKP)this.Dne[b][0];
      NMq nMq = (NMq)this.Dne[b][1];
      paramaXt.Dne(new NMq(zKP), new Object[] { "###", "###", "###", Character.valueOf('#'), nMq });
      paramaXt.Dne(nMq, new Object[] { "#", Character.valueOf('#'), zKP });
    } 
    paramaXt.Dne(new NMq(dEr.mrb), new Object[] { "###", "###", "###", Character.valueOf('#'), dEr.uzC });
    paramaXt.Dne(new NMq(dEr.uzC, 9), new Object[] { "#", Character.valueOf('#'), dEr.mrb });
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gmj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */