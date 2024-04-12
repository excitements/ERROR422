import java.util.Random;

public class Erg extends zKP {
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool = false;
    if (i == 2 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1))
      bool = true; 
    if (i == 3 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1))
      bool = true; 
    if (i == 4 && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3))
      bool = true; 
    if (i == 5 && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3))
      bool = true; 
    if (!bool) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, i, 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int Dne() {
    return 8;
  }
  
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) ? true : paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)));
  }
  
  public boolean FWm() {
    return false;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    int i = paramInt5;
    if ((paramInt5 == 0 || paramInt4 == 2) && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1))
      i = 2; 
    if ((i == 0 || paramInt4 == 3) && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1))
      i = 3; 
    if ((i == 0 || paramInt4 == 4) && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3))
      i = 4; 
    if ((i == 0 || paramInt4 == 5) && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3))
      i = 5; 
    return i;
  }
  
  public boolean Dne() {
    return false;
  }
  
  protected Erg(int paramInt) {
    super(paramInt, KFd.qLR);
    Dne(JcN.FWm);
  }
  
  public int Dne(Random paramRandom) {
    return 1;
  }
  
  public void Dne(int paramInt) {
    float f = 0.125F;
    if (paramInt == 2)
      Dne(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
    if (paramInt == 3)
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
    if (paramInt == 4)
      Dne(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
    if (paramInt == 5)
      Dne(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Erg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */