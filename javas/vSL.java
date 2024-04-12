import java.util.ArrayList;
import java.util.List;

public class vSL {
  private Tfm Dne;
  
  private long Dne;
  
  private List Dne;
  
  private final tgc Dne = 0L;
  
  public OdI[] Dne(int paramInt1, int paramInt2) {
    return (OdI[])(Dne(paramInt1, paramInt2)).Dne;
  }
  
  public vSL(tgc paramtgc) {
    this.Dne = (tgc)new Tfm();
    this.Dne = (tgc)new ArrayList();
    this.Dne = paramtgc;
  }
  
  static tgc Dne(vSL paramvSL) {
    return paramvSL.Dne;
  }
  
  public void Dne() {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.Dne;
    if (l2 > 7500L || l2 < 0L) {
      this.Dne = l1;
      for (byte b = 0; b < this.Dne.size(); b++) {
        RPx rPx = this.Dne.get(b);
        long l = l1 - rPx.Dne;
        if (l > 30000L || l < 0L) {
          this.Dne.remove(b--);
          long l3 = rPx.Dne & 0xFFFFFFFFL | (rPx.FWm & 0xFFFFFFFFL) << 32L;
          this.Dne.FWm(l3);
        } 
      } 
    } 
  }
  
  public RPx Dne(int paramInt1, int paramInt2) {
    paramInt1 >>= 4;
    paramInt2 >>= 4;
    long l = paramInt1 & 0xFFFFFFFFL | (paramInt2 & 0xFFFFFFFFL) << 32L;
    RPx rPx = (RPx)this.Dne.Dne(l);
    if (rPx == null) {
      rPx = new RPx(this, paramInt1, paramInt2);
      this.Dne.Dne(l, rPx);
      this.Dne.add(rPx);
    } 
    rPx.Dne = System.currentTimeMillis();
    return rPx;
  }
  
  public OdI Dne(int paramInt1, int paramInt2) {
    return Dne(paramInt1, paramInt2).Dne(paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vSL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */