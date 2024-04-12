import java.util.Comparator;
import java.util.List;

class jQl implements Comparator {
  final eiw Dne;
  
  final ZyA Dne;
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((isy)paramObject1, (isy)paramObject2);
  }
  
  public int Dne(isy paramisy1, isy paramisy2) {
    List list1;
    List list2;
    int i = paramisy1.Dne();
    int j = paramisy2.Dne();
    RLC rLC1 = null;
    RLC rLC2 = null;
    if (((eiw)this.Dne).DyG == 2) {
      rLC1 = trP.Dne[i];
      rLC2 = trP.Dne[j];
    } else if (((eiw)this.Dne).DyG == 0) {
      rLC1 = trP.FWm[i];
      rLC2 = trP.FWm[j];
    } else if (((eiw)this.Dne).DyG == 1) {
      list1 = trP.bzF[i];
      list2 = trP.bzF[j];
    } 
    if (list1 != null || list2 != null) {
      if (list1 == null)
        return 1; 
      if (list2 == null)
        return -1; 
      int k = ZyA.Dne(((eiw)this.Dne).Dne).Dne((RLC)list1);
      int m = ZyA.Dne(((eiw)this.Dne).Dne).Dne((RLC)list2);
      if (k != m)
        return (k - m) * ((eiw)this.Dne).div; 
    } 
    return i - j;
  }
  
  jQl(eiw parameiw, ZyA paramZyA) {
    this.Dne = (ZyA)parameiw;
    this.Dne = paramZyA;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jQl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */