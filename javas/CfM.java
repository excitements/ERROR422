import java.util.Comparator;
import java.util.List;

class CfM implements Comparator {
  final ZyA Dne;
  
  final LAz Dne;
  
  CfM(LAz paramLAz, ZyA paramZyA) {
    this.Dne = paramLAz;
    this.Dne = (LAz)paramZyA;
  }
  
  public int Dne(isy paramisy1, isy paramisy2) {
    int i = paramisy1.Dne();
    int j = paramisy2.Dne();
    List list1 = null;
    List list2 = null;
    if (this.Dne.DyG == 0) {
      list1 = trP.Qnq[i];
      list2 = trP.Qnq[j];
    } else if (this.Dne.DyG == 1) {
      RLC rLC1 = trP.FWm[i];
      RLC rLC2 = trP.FWm[j];
    } else if (this.Dne.DyG == 2) {
      list1 = trP.bzF[i];
      list2 = trP.bzF[j];
    } 
    if (list1 != null || list2 != null) {
      if (list1 == null)
        return 1; 
      if (list2 == null)
        return -1; 
      int k = ZyA.Dne(this.Dne.Dne).Dne((RLC)list1);
      int m = ZyA.Dne(this.Dne.Dne).Dne((RLC)list2);
      if (k != m)
        return (k - m) * this.Dne.div; 
    } 
    return i - j;
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((isy)paramObject1, (isy)paramObject2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CfM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */