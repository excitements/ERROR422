public class oPB {
  private String[][] Dne;
  
  private Object[][] Dne = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
  
  public void Dne(aXt paramaXt) {
    for (byte b = 0; b < (this.Dne[0]).length; b++) {
      Object object = this.Dne[0][b];
      for (byte b1 = 0; b1 < this.Dne.length - 1; b1++) {
        dEr dEr = (dEr)this.Dne[b1 + 1][b];
        paramaXt.Dne(new NMq(dEr), new Object[] { this.Dne[b1], Character.valueOf('#'), dEr.oIf, Character.valueOf('X'), object });
      } 
    } 
    paramaXt.Dne(new NMq(dEr.Dne), new Object[] { " #", "# ", Character.valueOf('#'), dEr.IjH });
  }
  
  public oPB() {
    this.Dne = new Object[][] { { zKP.Qnq, zKP.bzF, dEr.IjH, dEr.div, dEr.mrb }, { dEr.udO, dEr.ATE, dEr.FWm, dEr.FfS, dEr.tgc }, { dEr.kGO, dEr.qLR, dEr.Dne, dEr.EyB, dEr.gnI }, { dEr.ooe, dEr.Vxn, dEr.bzF, dEr.OdI, dEr.qXo }, { dEr.Wwe, dEr.eJi, dEr.One, dEr.ZgS, dEr.eHV } };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oPB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */