public class NfV extends Oaf {
  private gDn Dne;
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt6 > 0 && zKP.Dne[paramInt6].bzF() && (new rKp(this, paramQnq, paramInt1, paramInt2, paramInt3)).Dne() == 3)
      Dne(paramQnq, paramInt1, paramInt2, paramInt3, false); 
  }
  
  protected NfV(int paramInt) {
    super(paramInt, false);
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.Dne = paramRbp.Dne("rail_turn");
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 >= 6) ? this.Dne : this.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NfV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */