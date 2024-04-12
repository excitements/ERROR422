public class nnF extends zKP {
  protected boolean Dne;
  
  public boolean FWm() {
    return false;
  }
  
  protected nnF(int paramInt, KFd paramKFd, boolean paramBoolean) {
    super(paramInt, paramKFd);
    this.Dne = paramBoolean;
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return (!this.Dne && i == this.FWm) ? false : super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nnF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */