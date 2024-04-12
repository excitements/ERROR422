import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class cXw extends sAy {
  private int bzF = 32;
  
  public static final List Dne = Arrays.asList(new OdI[] { OdI.FWm, OdI.bzF });
  
  private int Qnq = 8;
  
  private int FWm = 0;
  
  public cXw() {}
  
  public cXw(Map paramMap) {
    this();
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((String)entry.getKey()).equals("size")) {
        this.FWm = geR.Dne((String)entry.getValue(), this.FWm, 0);
        continue;
      } 
      if (((String)entry.getKey()).equals("distance"))
        this.bzF = geR.Dne((String)entry.getValue(), this.bzF, this.Qnq + 1); 
    } 
  }
  
  protected JhS Dne(int paramInt1, int paramInt2) {
    return new nwL((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2, this.FWm);
  }
  
  protected boolean Dne(int paramInt1, int paramInt2) {
    int i = paramInt1;
    int j = paramInt2;
    if (paramInt1 < 0)
      paramInt1 -= this.bzF - 1; 
    if (paramInt2 < 0)
      paramInt2 -= this.bzF - 1; 
    int k = paramInt1 / this.bzF;
    int m = paramInt2 / this.bzF;
    Random random = this.Dne.Dne(k, m, 10387312);
    k *= this.bzF;
    m *= this.bzF;
    k += random.nextInt(this.bzF - this.Qnq);
    m += random.nextInt(this.bzF - this.Qnq);
    if (i == k && j == m) {
      boolean bool = this.Dne.Dne().Dne(i * 16 + 8, j * 16 + 8, 0, Dne);
      if (bool)
        return true; 
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cXw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */