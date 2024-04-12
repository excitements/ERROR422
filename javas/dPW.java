import java.util.Comparator;

public class dPW implements Comparator {
  private double bzF;
  
  private double FWm;
  
  private double Dne;
  
  public dPW(sMa paramsMa) {
    this.Dne = -paramsMa.div;
    this.FWm = -paramsMa.IjH;
    this.bzF = -paramsMa.mrb;
  }
  
  public int Dne(snt paramsnt1, snt paramsnt2) {
    double d1 = paramsnt1.XHL + this.Dne;
    double d2 = paramsnt1.Zpi + this.FWm;
    double d3 = paramsnt1.kGO + this.bzF;
    double d4 = paramsnt2.XHL + this.Dne;
    double d5 = paramsnt2.Zpi + this.FWm;
    double d6 = paramsnt2.kGO + this.bzF;
    return (int)((d1 * d1 + d2 * d2 + d3 * d3 - d4 * d4 + d5 * d5 + d6 * d6) * 1024.0D);
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((snt)paramObject1, (snt)paramObject2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dPW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */