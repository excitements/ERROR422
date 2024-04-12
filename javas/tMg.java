import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class tMg extends sAy {
  private static List Dne = Arrays.asList(new OdI[] { OdI.bzF, OdI.ATE, OdI.FfS, OdI.OdI, OdI.DyG });
  
  private int bzF;
  
  private List FWm;
  
  private int FWm;
  
  public List Dne() {
    return this.FWm;
  }
  
  public tMg() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield FWm : Ljava/util/List;
    //   15: aload_0
    //   16: bipush #32
    //   18: putfield FWm : I
    //   21: aload_0
    //   22: bipush #8
    //   24: putfield bzF : I
    //   27: aload_0
    //   28: getfield FWm : Ljava/util/List;
    //   31: new oIf
    //   34: dup
    //   35: ldc bVr
    //   37: iconst_1
    //   38: iconst_1
    //   39: iconst_1
    //   40: invokespecial <init> : (Ljava/lang/Class;III)V
    //   43: invokeinterface add : (Ljava/lang/Object;)Z
    //   48: pop
    //   49: return
  }
  
  protected boolean Dne(int paramInt1, int paramInt2) {
    int i = paramInt1;
    int j = paramInt2;
    if (paramInt1 < 0)
      paramInt1 -= this.FWm - 1; 
    if (paramInt2 < 0)
      paramInt2 -= this.FWm - 1; 
    int k = paramInt1 / this.FWm;
    int m = paramInt2 / this.FWm;
    Random random = this.Dne.Dne(k, m, 14357617);
    k *= this.FWm;
    m *= this.FWm;
    k += random.nextInt(this.FWm - this.bzF);
    m += random.nextInt(this.FWm - this.bzF);
    if (i == k && j == m) {
      OdI odI = this.Dne.Dne().Dne(i * 16 + 8, j * 16 + 8);
      for (OdI odI1 : Dne) {
        if (odI == odI1)
          return true; 
      } 
    } 
    return false;
  }
  
  protected JhS Dne(int paramInt1, int paramInt2) {
    return new fPe((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
  }
  
  public tMg(Map paramMap) {
    this();
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((String)entry.getKey()).equals("distance"))
        this.FWm = geR.Dne((String)entry.getValue(), this.FWm, this.bzF + 1); 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tMg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */