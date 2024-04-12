import java.util.ArrayList;
import java.util.List;

public class ziS {
  private final int Dne;
  
  private final int FWm;
  
  private final List Dne = new ArrayList();
  
  private int aFZ = 0;
  
  private int bzF = 0;
  
  private int Qnq = 0;
  
  public void Dne() {
    if (!Dne()) {
      if (this.bzF > this.Qnq)
        this.Qnq = this.bzF; 
      if (this.aFZ++ == this.Dne) {
        int i = Math.max(this.Qnq, this.Dne.size() - this.FWm);
        while (this.Dne.size() > i)
          this.Dne.remove(i); 
        this.Qnq = 0;
        this.aFZ = 0;
      } 
      this.bzF = 0;
    } 
  }
  
  public int Dne() {
    return this.Dne.size();
  }
  
  private boolean Dne() {
    return (this.FWm < 0 || this.Dne < null);
  }
  
  public int FWm() {
    return this.bzF;
  }
  
  public chN Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    chN chN;
    if (Dne())
      return new chN(this, paramDouble1, paramDouble2, paramDouble3); 
    if (this.bzF >= this.Dne.size()) {
      chN = new chN(this, paramDouble1, paramDouble2, paramDouble3);
      this.Dne.add(chN);
    } else {
      chN = this.Dne.get(this.bzF);
      chN.FWm(paramDouble1, paramDouble2, paramDouble3);
    } 
    this.bzF++;
    return chN;
  }
  
  public ziS(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public void FWm() {
    if (!Dne()) {
      this.bzF = 0;
      this.Dne.clear();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ziS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */