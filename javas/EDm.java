import java.util.LinkedList;
import java.util.List;

public final class EDm extends PiY {
  final tHk Dne;
  
  final List Dne;
  
  private EDm(tHk paramtHk, List paramList) {
    super("Failed to match any JSON node at [" + Dne(paramList) + "]");
    this.Dne = (List)paramtHk;
    this.Dne = paramList;
  }
  
  static PiY FWm(EDm paramEDm, iod paramiod) {
    LinkedList<iod> linkedList = new LinkedList();
    linkedList.add(paramiod);
    return new EDm((tHk)paramEDm.Dne, linkedList);
  }
  
  public String toString() {
    return "JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=" + this.Dne + ", failPath=" + this.Dne + '}';
  }
  
  static PiY Dne(EDm paramEDm, iod paramiod) {
    LinkedList<iod> linkedList = new LinkedList(paramEDm.Dne);
    linkedList.add(paramiod);
    return new EDm((tHk)paramEDm.Dne, linkedList);
  }
  
  static PiY Dne(tHk paramtHk) {
    return new EDm(paramtHk, new LinkedList());
  }
  
  static String Dne(List<iod> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = paramList.size() - 1; i >= 0; i--) {
      stringBuilder.append(((iod)paramList.get(i)).Dne());
      if (i != 0)
        stringBuilder.append("."); 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EDm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */