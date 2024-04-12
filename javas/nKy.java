public class nKy extends ipD {
  private NMq Dne;
  
  public NMq Dne() {
    return this.Dne;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    if (paramWkD.Dne("RecordItem")) {
      Dne(NMq.Dne(paramWkD.Dne("RecordItem")));
    } else if (paramWkD.Dne("Record") > 0) {
      Dne(new NMq(paramWkD.Dne("Record"), 1, 0));
    } 
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (Dne() != null) {
      paramWkD.Dne("RecordItem", Dne().Dne(new WkD()));
      paramWkD.Dne("Record", (Dne()).bzF);
    } 
  }
  
  public void Dne(NMq paramNMq) {
    this.Dne = paramNMq;
    a_();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nKy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */