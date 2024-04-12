import java.util.Random;

public class qqL extends gwq {
  private boolean Dne;
  
  private int Dne = 0;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) != zKP.KLR.FWm)
      return false; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) != 0 && paramQnq.Dne(paramInt1, paramInt2, paramInt3) != zKP.KLR.FWm)
      return false; 
    byte b1 = 0;
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == zKP.KLR.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == zKP.KLR.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == zKP.KLR.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == zKP.KLR.FWm)
      b1++; 
    if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == zKP.KLR.FWm)
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
    if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3))
      b2++; 
    if ((this.Dne == 0 && b1 == 4 && b2 == 1) || b1 == 5) {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.Dne, 0, 2);
      paramQnq.Dne = true;
      zKP.Dne[this.Dne].Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
      paramQnq.Dne = false;
    } 
    return true;
  }
  
  public qqL(int paramInt, boolean paramBoolean) {
    this.Dne = paramInt;
    this.Dne = paramBoolean;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qqL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */