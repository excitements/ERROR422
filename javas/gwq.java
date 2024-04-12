import java.util.Random;

public abstract class gwq {
  private final boolean Dne;
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public gwq(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (this.Dne) {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 3);
    } else {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 2);
    } 
  }
  
  public abstract boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3);
  
  public gwq() {
    this.Dne = false;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gwq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */