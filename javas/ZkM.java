import java.util.Random;

public class ZkM extends gwq {
  private int Dne;
  
  public ZkM(int paramInt) {
    this.Dne = paramInt;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) != zKP.Dne.FWm)
      return false; 
    if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) != zKP.Dne.FWm)
      return false; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) != 0 && paramQnq.Dne(paramInt1, paramInt2, paramInt3) != zKP.Dne.FWm)
      return false; 
    byte b1 = 0;
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == zKP.Dne.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == zKP.Dne.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == zKP.Dne.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == zKP.Dne.FWm)
      b1++; 
    byte b2 = 0;
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3))
      b2++; 
    if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3))
      b2++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1))
      b2++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1))
      b2++; 
    if (b1 == 3 && b2 == 1) {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.Dne, 0, 2);
      paramQnq.Dne = true;
      zKP.Dne[this.Dne].Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
      paramQnq.Dne = false;
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZkM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */