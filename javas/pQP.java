public class pQP implements Comparable {
  private final XHL Dne;
  
  private final boolean Dne;
  
  private final long Dne;
  
  private final String FWm;
  
  private final long FWm;
  
  private final String Dne;
  
  private final boolean bzF;
  
  private final boolean FWm;
  
  public String Dne() {
    return this.Dne;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public XHL Dne() {
    return (XHL)this.Dne;
  }
  
  public pQP(String paramString1, String paramString2, long paramLong1, long paramLong2, XHL paramXHL, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.Dne = paramString1;
    this.FWm = paramString2;
    this.Dne = paramLong1;
    this.FWm = paramLong2;
    this.Dne = (String)paramXHL;
    this.Dne = paramBoolean1;
    this.FWm = paramBoolean2;
    this.bzF = paramBoolean3;
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public String FWm() {
    return this.FWm;
  }
  
  public int Dne(pQP parampQP) {
    return (this.Dne < parampQP.Dne) ? 1 : ((this.Dne > parampQP.Dne) ? -1 : this.Dne.compareTo(parampQP.Dne));
  }
  
  public long Dne() {
    return this.Dne;
  }
  
  public boolean bzF() {
    return this.bzF;
  }
  
  public int compareTo(Object paramObject) {
    return Dne((pQP)paramObject);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pQP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */