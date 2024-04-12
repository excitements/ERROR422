import java.util.Random;

public class dXn extends ljW {
  private gDn[] Dne = new gDn[2];
  
  public boolean Dne() {
    return false;
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!((Jik)paramQnq.Dne).FWm) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = paramQnq.FWm((udO)udO.Dne, paramInt1, paramInt2, paramInt3) - paramQnq.Dne;
      float f = paramQnq.bzF(1.0F);
      if (f < 3.1415927F) {
        f += (0.0F - f) * 0.2F;
      } else {
        f += (6.2831855F - f) * 0.2F;
      } 
      j = Math.round(j * geR.FWm(f));
      if (j < 0)
        j = 0; 
      if (j > 15)
        j = 15; 
      if (i != j)
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 3); 
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
  
  public boolean bzF() {
    return true;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne[0] : this.Dne[1];
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new vmD();
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return paramZpi.bzF(paramInt1, paramInt2, paramInt3);
  }
  
  public dXn(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
    Dne(JcN.bzF);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void Dne(Rbp paramRbp) {
    this.Dne[0] = paramRbp.Dne("daylightDetector_top");
    this.Dne[1] = paramRbp.Dne("daylightDetector_side");
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dXn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */