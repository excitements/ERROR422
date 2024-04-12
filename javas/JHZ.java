import java.util.LinkedList;
import java.util.List;

public final class JHZ implements Xix {
  private final List Dne = new LinkedList();
  
  public JHZ Dne(Xix paramXix) {
    this.Dne.add(paramXix);
    return this;
  }
  
  public bab Dne() {
    LinkedList<LIC> linkedList = new LinkedList();
    for (Xix xix : this.Dne)
      linkedList.add(xix.Dne()); 
    return ACm.Dne(linkedList);
  }
  
  public LIC Dne() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JHZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */