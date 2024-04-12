import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class wjH {
  private final int Dne;
  
  private List Dne;
  
  private final int FWm;
  
  private final int Qnq;
  
  private final int bzF;
  
  private WbP Dne;
  
  public int Dne() {
    return this.Dne;
  }
  
  public wjH(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
  }
  
  public WbP Dne() {
    return this.Dne;
  }
  
  public void Dne(List<wjH> paramList) {
    if (this.Dne != null) {
      paramList.add(this);
    } else if (this.Dne != null) {
      for (wjH wjH1 : this.Dne)
        wjH1.Dne(paramList); 
    } 
  }
  
  public String toString() {
    return "Slot{originX=" + this.Dne + ", originY=" + this.FWm + ", width=" + this.bzF + ", height=" + this.Qnq + ", texture=" + this.Dne + ", subSlots=" + this.Dne + '}';
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public boolean Dne(WbP paramWbP) {
    if (this.Dne != null)
      return false; 
    int i = paramWbP.Dne();
    int j = paramWbP.FWm();
    if (i <= this.bzF && j <= this.Qnq) {
      if (i == this.bzF && j == this.Qnq) {
        this.Dne = paramWbP;
        return true;
      } 
      if (this.Dne == null) {
        this.Dne = (WbP)new ArrayList(1);
        this.Dne.add(new wjH(this.Dne, this.FWm, i, j));
        int k = this.bzF - i;
        int m = this.Qnq - j;
        if (m > 0 && k > 0) {
          int n = Math.max(this.Qnq, k);
          int i1 = Math.max(this.bzF, m);
          if (n >= i1) {
            this.Dne.add(new wjH(this.Dne, this.FWm + j, i, m));
            this.Dne.add(new wjH(this.Dne + i, this.FWm, k, this.Qnq));
          } else {
            this.Dne.add(new wjH(this.Dne + i, this.FWm, k, j));
            this.Dne.add(new wjH(this.Dne, this.FWm + j, this.bzF, m));
          } 
        } else if (k == 0) {
          this.Dne.add(new wjH(this.Dne, this.FWm + j, i, m));
        } else if (m == 0) {
          this.Dne.add(new wjH(this.Dne + i, this.FWm, k, j));
        } 
      } 
      Iterator<wjH> iterator = this.Dne.iterator();
      while (true) {
        if (!iterator.hasNext())
          return false; 
        wjH wjH1 = iterator.next();
        if (wjH1.Dne(paramWbP))
          return true; 
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wjH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */