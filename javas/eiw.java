import java.util.ArrayList;

class eiw extends xYY {
  final ZyA Dne;
  
  protected void Dne(int paramInt1, int paramInt2, WAR paramWAR) {
    super.Dne(paramInt1, paramInt2, paramWAR);
    if (this.Dne == null) {
      ZyA.Dne(this.Dne, paramInt1 + 115 - 18 + 1, paramInt2 + 1 + 1, 18, 18);
    } else {
      ZyA.Dne(this.Dne, paramInt1 + 115 - 18, paramInt2 + 1, 18, 18);
    } 
    if (this.Dne == true) {
      ZyA.Dne(this.Dne, paramInt1 + 165 - 18 + 1, paramInt2 + 1 + 1, 36, 18);
    } else {
      ZyA.Dne(this.Dne, paramInt1 + 165 - 18, paramInt2 + 1, 36, 18);
    } 
    if (this.Dne == 2) {
      ZyA.Dne(this.Dne, paramInt1 + 215 - 18 + 1, paramInt2 + 1 + 1, 54, 18);
    } else {
      ZyA.Dne(this.Dne, paramInt1 + 215 - 18, paramInt2 + 1, 54, 18);
    } 
  }
  
  protected String Dne(int paramInt) {
    return (paramInt == 0) ? "stat.crafted" : ((paramInt == 1) ? "stat.used" : "stat.mined");
  }
  
  public eiw(ZyA paramZyA) {
    super(paramZyA);
    this.Dne = paramZyA;
    this.Dne = (ZyA)new ArrayList();
    for (isy isy : trP.Qnq) {
      boolean bool = false;
      int i = isy.Dne();
      if (ZyA.Dne(paramZyA).Dne(isy) > 0) {
        bool = true;
      } else if (trP.bzF[i] != null && ZyA.Dne(paramZyA).Dne((RLC)trP.bzF[i]) > 0) {
        bool = true;
      } else if (trP.FWm[i] != null && ZyA.Dne(paramZyA).Dne(trP.FWm[i]) > 0) {
        bool = true;
      } 
      if (bool)
        this.Dne.add(isy); 
    } 
    this.Dne = (ZyA)new jQl(this, paramZyA);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    isy isy = Dne(paramInt1);
    int i = isy.Dne();
    ZyA.Dne(this.Dne, paramInt2 + 40, paramInt3, i);
    Dne((isy)trP.FWm[i], paramInt2 + 115, paramInt3, (paramInt1 % 2 == 0));
    Dne((isy)trP.bzF[i], paramInt2 + 165, paramInt3, (paramInt1 % 2 == 0));
    Dne(isy, paramInt2 + 215, paramInt3, (paramInt1 % 2 == 0));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eiw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */