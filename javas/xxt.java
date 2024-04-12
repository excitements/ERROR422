import java.util.ArrayList;
import java.util.List;

public class xxt {
  int Dne;
  
  private final int zGp;
  
  String[][] Dne;
  
  List Dne;
  
  private final int bzF;
  
  private final int Qnq;
  
  String[] Dne = (String[])new ArrayList();
  
  String[] FWm;
  
  private final int aFZ;
  
  int FWm;
  
  private String Dne() {
    irb irb = irb.Dne();
    String str = irb.Dne("options.difficulty");
    return str + ": " + this.Dne[this.Dne];
  }
  
  private String FWm() {
    irb irb = irb.Dne();
    String str = irb.Dne("mco.gameMode");
    return str + ": " + this.FWm[this.FWm];
  }
  
  void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 5005) {
        this.Dne = (this.Dne + 1) % this.Dne.length;
        paramPee.Dne = Dne();
      } else if (paramPee.aFZ == 5006) {
        this.FWm = (this.FWm + 1) % this.FWm.length;
        paramPee.Dne = FWm();
      }  
  }
  
  private void FWm() {
    irb irb = irb.Dne();
    this.Dne = new String[] { irb.Dne("options.difficulty.normal"), irb.Dne("options.difficulty.hard"), irb.Dne("options.difficulty.peaceful"), irb.Dne("options.difficulty.easy") };
    this.FWm = new String[] { irb.Dne("mco.gameMode.survival"), irb.Dne("mco.gameMode.creative"), irb.Dne("mco.gameMode.adventure") };
    this.Dne = (String[])new String[][] { { irb.Dne("mco.gameMode.survival.line1"), irb.Dne("mco.gameMode.survival.line2") }, { irb.Dne("mco.gameMode.creative.line1"), irb.Dne("mco.gameMode.creative.line2") }, { irb.Dne("mco.gameMode.adventure.line1"), irb.Dne("mco.gameMode.adventure.line2") } };
  }
  
  public xxt(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = false;
    this.FWm = 0;
    this.bzF = paramInt1;
    this.Qnq = paramInt2;
    this.aFZ = paramInt3;
    this.zGp = paramInt4;
    Dne();
  }
  
  private void Dne() {
    FWm();
    this.Dne.add(new Pee(5005, this.aFZ, this.zGp + 1, 212, 20, Dne()));
    this.Dne.add(new Pee(5006, this.aFZ, this.zGp + 25, 212, 20, FWm()));
  }
  
  public void Dne(qVZ paramqVZ, msA parammsA) {
    paramqVZ.FWm(parammsA, this.Dne[this.FWm][0], this.aFZ, this.zGp + 50, 10526880);
    paramqVZ.FWm(parammsA, this.Dne[this.FWm][1], this.aFZ, this.zGp + 60, 10526880);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xxt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */