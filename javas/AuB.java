public class AuB extends ajI {
  private final int Dne;
  
  protected int bzF(int paramInt) {
    return paramInt;
  }
  
  protected int a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    for (JiM jiM : paramQnq.Dne(JiM.class, Dne(paramInt1, paramInt2, paramInt3))) {
      i += (jiM.Dne()).Dne;
      if (i >= this.Dne)
        break; 
    } 
    if (i <= 0)
      return 0; 
    float f = Math.min(this.Dne, i) / this.Dne;
    return geR.FWm(f * 15.0F);
  }
  
  protected AuB(int paramInt1, String paramString, KFd paramKFd, int paramInt2) {
    super(paramInt1, paramString, paramKFd);
    this.Dne = paramInt2;
  }
  
  public int Dne(Qnq paramQnq) {
    return 10;
  }
  
  protected int a_(int paramInt) {
    return paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AuB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */