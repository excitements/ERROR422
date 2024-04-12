import java.util.List;

public class EAx extends dEr {
  public boolean FWm(NMq paramNMq) {
    return true;
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List<String> paramList, boolean paramBoolean) {
    if (paramNMq.aFZ()) {
      WkD wkD = paramNMq.Dne();
      QNx qNx = (QNx)wkD.Dne("author");
      if (qNx != null)
        paramList.add(Dne.div + String.format(KGL.Dne("book.byAuthor", new Object[] { qNx.Dne }), new Object[0])); 
    } 
  }
  
  public boolean div() {
    return true;
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    paramFiG.Dne(paramNMq);
    return paramNMq;
  }
  
  static {
  
  }
  
  public String Qnq(NMq paramNMq) {
    if (paramNMq.aFZ()) {
      WkD wkD = paramNMq.Dne();
      QNx qNx = (QNx)wkD.Dne("title");
      if (qNx != null)
        return qNx.toString(); 
    } 
    return super.Qnq(paramNMq);
  }
  
  public EAx(int paramInt) {
    super(paramInt);
    Dne(1);
  }
  
  public static boolean Dne(WkD paramWkD) {
    if (!Iny.Dne(paramWkD))
      return false; 
    if (!paramWkD.Dne("title"))
      return false; 
    String str = paramWkD.Dne("title");
    return (str != null && str.length() <= 16) ? paramWkD.Dne("author") : false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EAx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */