import java.util.ArrayList;
import java.util.List;

public class NDp implements iQt {
  private final NMq Dne;
  
  private final List Dne;
  
  public NMq Dne() {
    return (NMq)this.Dne;
  }
  
  public boolean Dne(Uqm paramUqm, Qnq paramQnq) {
    ArrayList arrayList = new ArrayList(this.Dne);
    for (byte b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 3; b1++) {
        NMq nMq = paramUqm.FWm(b1, b);
        if (nMq != null) {
          boolean bool = false;
          for (NMq nMq1 : arrayList) {
            if (nMq.bzF == nMq1.bzF && (nMq1.Qnq() == 32767 || nMq.Qnq() == nMq1.Qnq())) {
              bool = true;
              arrayList.remove(nMq1);
              break;
            } 
          } 
          if (!bool)
            return false; 
        } 
      } 
    } 
    return arrayList.isEmpty();
  }
  
  public NMq Dne(Uqm paramUqm) {
    return this.Dne.Dne();
  }
  
  public int Dne() {
    return this.Dne.size();
  }
  
  public NDp(NMq paramNMq, List paramList) {
    this.Dne = (List)paramNMq;
    this.Dne = paramList;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NDp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */