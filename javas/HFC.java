public class HFC extends ipD {
  private int Dne = 0;
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    paramWkD.Dne("OutputSignal", this.Dne);
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    this.Dne = paramWkD.Dne("OutputSignal");
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HFC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */