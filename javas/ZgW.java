import java.util.Random;

public class ZgW extends zKP {
  public static boolean Dne = false;
  
  public static boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i == 0)
      return true; 
    if (i == ((iqp)zKP.Dne).FWm)
      return true; 
    dNT dNT = (zKP.Dne[i]).Dne;
    return (dNT == KFd.div) ? true : ((dNT == KFd.IjH));
  }
  
  public void a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public int Dne(Qnq paramQnq) {
    return 2;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
  }
  
  public ZgW(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
  }
  
  public ZgW(int paramInt) {
    super(paramInt, KFd.trS);
    Dne(JcN.Dne);
  }
  
  protected void Dne(CiF paramCiF) {}
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3) && paramInt2 >= 0) {
      byte b = 32;
      if (!Dne && paramQnq.Dne(paramInt1 - b, paramInt2 - b, paramInt3 - b, paramInt1 + b, paramInt2 + b, paramInt3 + b)) {
        if (paramQnq.aFZ == null) {
          CiF ciF = new CiF(paramQnq, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), this.FWm, paramQnq.bzF(paramInt1, paramInt2, paramInt3));
          Dne(ciF);
          paramQnq.FWm(ciF);
        } 
      } else {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        while (bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3) && paramInt2 > 0)
          paramInt2--; 
        if (paramInt2 > 0)
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm); 
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZgW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */