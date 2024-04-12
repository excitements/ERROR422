public class ccS extends tkL {
  public int Dne(NMq paramNMq, int paramInt) {
    int i = paramNMq.Qnq();
    return ((i & 0x1) == 1) ? QFY.Dne() : (((i & 0x2) == 2) ? QFY.FWm() : QFY.bzF());
  }
  
  public gDn Dne(int paramInt) {
    return zKP.Dne.Dne(0, paramInt);
  }
  
  public int Dne(int paramInt) {
    return paramInt | 0x4;
  }
  
  public ccS(int paramInt) {
    super(paramInt);
    FWm(0);
    Dne(true);
  }
  
  static {
  
  }
  
  public String Dne(NMq paramNMq) {
    int i = paramNMq.Qnq();
    if (i < 0 || i >= VOy.Dne.length)
      i = 0; 
    return FWm() + "." + VOy.Dne[i];
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ccS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */