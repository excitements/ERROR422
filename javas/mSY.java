public class mSY extends MdS {
  private gDn[] Dne;
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt2 < 7) {
      if (paramInt2 == 6)
        paramInt2 = 5; 
      return this.Dne[paramInt2 >> 1];
    } 
    return this.Dne[3];
  }
  
  protected int bzF() {
    return dEr.dnY.Qnq;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[4];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne("potatoes_" + b); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
    if (paramQnq.aFZ == null && paramInt4 >= 7 && paramQnq.Dne.nextInt(50) == 0)
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(dEr.HDz)); 
  }
  
  public mSY(int paramInt) {
    super(paramInt);
  }
  
  protected int Qnq() {
    return dEr.dnY.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mSY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */