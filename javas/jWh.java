public class jWh {
  private Object[][] Dne;
  
  private String[][] Dne = new String[][] { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
  
  public jWh() {
    this.Dne = (String[][])new Object[][] { { dEr.LoG, zKP.Dne, dEr.IjH, dEr.div, dEr.mrb }, { dEr.Dne, dEr.aFZ, dEr.IjH, dEr.kGO, dEr.qLR }, { dEr.FWm, dEr.zGp, dEr.mrb, dEr.udO, dEr.ATE }, { dEr.bzF, dEr.DyG, dEr.XHL, dEr.ooe, dEr.Vxn }, { dEr.Qnq, dEr.div, dEr.Zpi, dEr.trS, dEr.ceE } };
  }
  
  public void Dne(aXt paramaXt) {
    for (byte b = 0; b < (this.Dne[0]).length; b++) {
      String str = this.Dne[0][b];
      for (byte b1 = 0; b1 < this.Dne.length - 1; b1++) {
        dEr dEr = (dEr)this.Dne[b1 + 1][b];
        paramaXt.Dne(new NMq(dEr), new Object[] { this.Dne[b1], Character.valueOf('X'), str });
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jWh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */