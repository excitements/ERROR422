public class itx extends tkL {
  private String[] Dne;
  
  private final zKP Dne = zKP.Dne[FWm()];
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  public String Dne(NMq paramNMq) {
    if (this.Dne == null)
      return super.Dne(paramNMq); 
    int i = paramNMq.Qnq();
    return (i >= 0 && i < this.Dne.length) ? (super.Dne(paramNMq) + "." + this.Dne[i]) : super.Dne(paramNMq);
  }
  
  public itx Dne(String[] paramArrayOfString) {
    this.Dne = (zKP)paramArrayOfString;
    return this;
  }
  
  public itx(int paramInt, boolean paramBoolean) {
    super(paramInt);
    if (paramBoolean) {
      FWm(0);
      Dne(true);
    } 
  }
  
  public gDn Dne(int paramInt) {
    return this.Dne.Dne(0, paramInt);
  }
  
  public int Dne(NMq paramNMq, int paramInt) {
    return this.Dne.FWm(paramNMq.Qnq());
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\itx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */