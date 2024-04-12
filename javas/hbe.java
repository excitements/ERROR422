import java.util.Random;

public class hbe extends zKP {
  protected boolean Dne(int paramInt) {
    return (paramInt == ((ZQN)zKP.Dne).FWm || paramInt == zKP.FWm.FWm || paramInt == zKP.rPc.FWm);
  }
  
  protected hbe(int paramInt) {
    this(paramInt, KFd.XHL);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  static {
  
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  protected final void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public int Dne() {
    return 1;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (super.Dne(paramQnq, paramInt1, paramInt2, paramInt3) && Dne(paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3)));
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return ((paramQnq.Qnq(paramInt1, paramInt2, paramInt3) >= 8 || paramQnq.aFZ(paramInt1, paramInt2, paramInt3)) && Dne(paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3)));
  }
  
  protected hbe(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
    Dne(true);
    float f = 0.2F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
    Dne(JcN.FWm);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hbe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */