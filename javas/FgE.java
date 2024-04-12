public class FgE extends ipD implements gnI {
  private int Dne;
  
  private String FWm;
  
  private String Dne = Character.MIN_VALUE;
  
  public void bzF(String paramString) {
    this.FWm = paramString;
  }
  
  public boolean Dne(int paramInt, String paramString) {
    return (paramInt <= 2);
  }
  
  public void Dne(String paramString) {}
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    this.Dne = paramWkD.Dne("Command");
    this.Dne = paramWkD.Dne("SuccessCount");
    if (paramWkD.Dne("CustomName"))
      this.FWm = paramWkD.Dne("CustomName"); 
  }
  
  public void FWm(String paramString) {
    this.Dne = paramString;
    a_();
  }
  
  public String Dne(String paramString, Object... paramVarArgs) {
    return paramString;
  }
  
  public iSh Dne() {
    return new iSh(this.Qnq, this.aFZ, this.zGp);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    paramWkD.Dne("Command", this.Dne);
    paramWkD.Dne("SuccessCount", this.Dne);
    paramWkD.Dne("CustomName", this.FWm);
  }
  
  public FgE() {
    this.Dne = "";
    this.FWm = "@";
  }
  
  public String a_() {
    return this.FWm;
  }
  
  public NER Dne() {
    WkD wkD = new WkD();
    FWm(wkD);
    return new ipQ(this.Qnq, this.aFZ, this.zGp, 2, wkD);
  }
  
  public int Dne(Qnq paramQnq) {
    if (paramQnq.aFZ != null)
      return 0; 
    Jwh jwh = Jwh.Dne();
    if (jwh != null && jwh.DyG()) {
      FWm fWm = jwh.Dne();
      return fWm.Dne(this, this.Dne);
    } 
    return 0;
  }
  
  public String FWm() {
    return this.Dne;
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
  
  public int Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FgE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */