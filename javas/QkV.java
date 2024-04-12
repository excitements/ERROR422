import java.util.Random;

public class QkV extends ESF {
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramZpi.Dne(paramInt1, paramInt2, paramInt3) == this.FWm)
      return false; 
    boolean bool1 = (paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm && paramZpi.Dne(paramInt1 - 2, paramInt2, paramInt3) != this.FWm) ? true : false;
    boolean bool2 = (paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm && paramZpi.Dne(paramInt1 + 2, paramInt2, paramInt3) != this.FWm) ? true : false;
    boolean bool3 = (paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm && paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 2) != this.FWm) ? true : false;
    boolean bool4 = (paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm && paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 2) != this.FWm) ? true : false;
    boolean bool5 = (bool1 || bool2) ? true : false;
    boolean bool6 = (bool3 || bool4) ? true : false;
    return (bool5 && paramInt4 == 4) ? true : ((bool5 && paramInt4 == 5) ? true : ((bool6 && paramInt4 == 2) ? true : ((bool6 && paramInt4 == 3))));
  }
  
  public boolean FWm() {
    return false;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    if (paramsMa.FWm == null && paramsMa.Dne == null)
      paramsMa.Fnk(); 
  }
  
  public int a_() {
    return 1;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b1 = 0;
    byte b2 = 1;
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm || paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm) {
      b1 = 1;
      b2 = 0;
    } 
    int i;
    for (i = paramInt2; paramQnq.Dne(paramInt1, i - 1, paramInt3) == this.FWm; i--);
    if (paramQnq.Dne(paramInt1, i - 1, paramInt3) != zKP.cot.FWm) {
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } else {
      byte b;
      for (b = 1; b < 4 && paramQnq.Dne(paramInt1, i + b, paramInt3) == this.FWm; b++);
      if (b == 3 && paramQnq.Dne(paramInt1, i + b, paramInt3) == zKP.cot.FWm) {
        boolean bool1 = (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.FWm || paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.FWm) ? true : false;
        boolean bool2 = (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.FWm || paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.FWm) ? true : false;
        if (bool1 && bool2) {
          paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        } else if ((paramQnq.Dne(paramInt1 + b1, paramInt2, paramInt3 + b2) != zKP.cot.FWm || paramQnq.Dne(paramInt1 - b1, paramInt2, paramInt3 - b2) != this.FWm) && (paramQnq.Dne(paramInt1 - b1, paramInt2, paramInt3 - b2) != zKP.cot.FWm || paramQnq.Dne(paramInt1 + b1, paramInt2, paramInt3 + b2) != this.FWm)) {
          paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        } 
      } else {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
    } 
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  static {
  
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3) != this.FWm && paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3) != this.FWm) {
      float f1 = 0.125F;
      float f2 = 0.5F;
      Dne(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
    } else {
      float f1 = 0.5F;
      float f2 = 0.125F;
      Dne(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
    } 
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramRandom.nextInt(100) == 0)
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "portal.portal", 0.5F, paramRandom.nextFloat() * 0.4F + 0.8F, false); 
    for (byte b = 0; b < 4; b++) {
      double d1 = (paramInt1 + paramRandom.nextFloat());
      double d2 = (paramInt2 + paramRandom.nextFloat());
      double d3 = (paramInt3 + paramRandom.nextFloat());
      double d4 = 0.0D;
      double d5 = 0.0D;
      double d6 = 0.0D;
      int i = paramRandom.nextInt(2) * 2 - 1;
      d4 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
      d5 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
      d6 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
      if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) != this.FWm && paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) != this.FWm) {
        d1 = paramInt1 + 0.5D + 0.25D * i;
        d4 = (paramRandom.nextFloat() * 2.0F * i);
      } else {
        d3 = paramInt3 + 0.5D + 0.25D * i;
        d6 = (paramRandom.nextFloat() * 2.0F * i);
      } 
      paramQnq.Dne("portal", d1, d2, d3, d4, d5, d6);
    } 
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return 0;
  }
  
  public QkV(int paramInt) {
    super(paramInt, "portal", KFd.tgc, false);
    Dne(true);
  }
  
  public boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    byte b1 = 0;
    byte b2 = 0;
    if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == zKP.cot.FWm || paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == zKP.cot.FWm)
      b1 = 1; 
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == zKP.cot.FWm || paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == zKP.cot.FWm)
      b2 = 1; 
    if (b1 == b2)
      return false; 
    if (paramQnq.Dne(paramInt1 - b1, paramInt2, paramInt3 - b2) == 0) {
      paramInt1 -= b1;
      paramInt3 -= b2;
    } 
    byte b;
    for (b = -1; b <= 2; b++) {
      for (byte b3 = -1; b3 <= 3; b3++) {
        boolean bool = (b == -1 || b == 2 || b3 == -1 || b3 == 3) ? true : false;
        if ((b != -1 && b != 2) || (b3 != -1 && b3 != 3)) {
          int i = paramQnq.Dne(paramInt1 + b1 * b, paramInt2 + b3, paramInt3 + b2 * b);
          if (bool) {
            if (i != zKP.cot.FWm)
              return false; 
          } else if (i != 0 && i != ((iqp)zKP.Dne).FWm) {
            return false;
          } 
        } 
      } 
    } 
    for (b = 0; b < 2; b++) {
      for (byte b3 = 0; b3 < 3; b3++)
        paramQnq.FWm(paramInt1 + b1 * b, paramInt2 + b3, paramInt3 + b2 * b, ((QkV)zKP.Dne).FWm, 0, 2); 
    } 
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    if (paramQnq.Dne.Dne() && paramRandom.nextInt(2000) < paramQnq.aFZ) {
      int i;
      for (i = paramInt2; !paramQnq.IjH(paramInt1, i, paramInt3) && i > 0; i--);
      if (i > 0 && !paramQnq.DyG(paramInt1, i + 1, paramInt3)) {
        sMa sMa = Bes.Dne(paramQnq, 57, paramInt1 + 0.5D, i + 1.1D, paramInt3 + 0.5D);
        if (sMa != null)
          sMa.ooe = sMa.DyG(); 
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QkV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */