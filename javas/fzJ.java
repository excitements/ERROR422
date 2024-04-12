public class fzJ extends MdS {
  private gDn[] Dne;
  
  protected int Qnq() {
    return dEr.dYY.Qnq;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[4];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne("carrots_" + b); 
  }
  
  public fzJ(int paramInt) {
    super(paramInt);
  }
  
  protected int bzF() {
    return dEr.dYY.Qnq;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt2 < 7) {
      if (paramInt2 == 6)
        paramInt2 = 5; 
      return this.Dne[paramInt2 >> 1];
    } 
    return this.Dne[3];
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fzJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */