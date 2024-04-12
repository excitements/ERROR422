import java.util.ArrayList;

public class JCd extends RsG {
  public uCl Dne;
  
  public void FWm(WkD paramWkD) {
    String str = paramWkD.Dne("Motive");
    for (uCl uCl1 : uCl.values()) {
      if (uCl1.Dne.equals(str))
        this.Dne = uCl1; 
    } 
    if (this.Dne == null)
      this.Dne = uCl.Dne; 
    super.FWm(paramWkD);
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("Motive", (String)this.Dne.Dne);
    super.Dne(paramWkD);
  }
  
  public void bzF() {
    Dne(new NMq(dEr.ICU), 0.0F);
  }
  
  public JCd(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    ArrayList<uCl> arrayList = new ArrayList();
    for (uCl uCl1 : uCl.values()) {
      this.Dne = uCl1;
      Dne(paramInt4);
      if (Qnq())
        arrayList.add(uCl1); 
    } 
    if (!arrayList.isEmpty())
      this.Dne = arrayList.get(this.Dne.nextInt(arrayList.size())); 
    Dne(paramInt4);
  }
  
  public JCd(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public int bzF() {
    return this.Dne.bzF;
  }
  
  public int Dne() {
    return this.Dne.FWm;
  }
  
  public JCd(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString) {
    this(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    for (uCl uCl1 : uCl.values()) {
      if (uCl1.Dne.equals(paramString)) {
        this.Dne = uCl1;
        break;
      } 
    } 
    Dne(paramInt4);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JCd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */