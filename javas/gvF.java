import java.util.Random;

public class gvF extends gwq {
  private int Dne;
  
  public gvF(int paramInt) {
    this.Dne = paramInt;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 -= 8;
    paramInt3 -= 8;
    while (paramInt2 > 5 && paramQnq.Dne(paramInt1, paramInt2, paramInt3))
      paramInt2--; 
    if (paramInt2 <= 4)
      return false; 
    paramInt2 -= 4;
    boolean[] arrayOfBoolean = new boolean[2048];
    int i = paramRandom.nextInt(4) + 4;
    byte b;
    for (b = 0; b < i; b++) {
      double d1 = paramRandom.nextDouble() * 6.0D + 3.0D;
      double d2 = paramRandom.nextDouble() * 4.0D + 2.0D;
      double d3 = paramRandom.nextDouble() * 6.0D + 3.0D;
      double d4 = paramRandom.nextDouble() * (16.0D - d1 - 2.0D) + 1.0D + d1 / 2.0D;
      double d5 = paramRandom.nextDouble() * (8.0D - d2 - 4.0D) + 2.0D + d2 / 2.0D;
      double d6 = paramRandom.nextDouble() * (16.0D - d3 - 2.0D) + 1.0D + d3 / 2.0D;
      for (byte b1 = 1; b1 < 15; b1++) {
        for (byte b2 = 1; b2 < 15; b2++) {
          for (byte b3 = 1; b3 < 7; b3++) {
            double d7 = (b1 - d4) / d1 / 2.0D;
            double d8 = (b3 - d5) / d2 / 2.0D;
            double d9 = (b2 - d6) / d3 / 2.0D;
            double d10 = d7 * d7 + d8 * d8 + d9 * d9;
            if (d10 < 1.0D)
              arrayOfBoolean[(b1 * 16 + b2) * 8 + b3] = true; 
          } 
        } 
      } 
    } 
    for (b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        for (byte b2 = 0; b2 < 8; b2++) {
          boolean bool = (!arrayOfBoolean[(b * 16 + b1) * 8 + b2] && ((b < 15 && arrayOfBoolean[((b + 1) * 16 + b1) * 8 + b2]) || (b > 0 && arrayOfBoolean[((b - 1) * 16 + b1) * 8 + b2]) || (b1 < 15 && arrayOfBoolean[(b * 16 + b1 + 1) * 8 + b2]) || (b1 > 0 && arrayOfBoolean[(b * 16 + b1 - 1) * 8 + b2]) || (b2 < 7 && arrayOfBoolean[(b * 16 + b1) * 8 + b2 + 1]) || (b2 > 0 && arrayOfBoolean[(b * 16 + b1) * 8 + b2 - 1]))) ? true : false;
          if (bool) {
            KFd kFd = paramQnq.Dne(paramInt1 + b, paramInt2 + b2, paramInt3 + b1);
            if (b2 >= 4 && kFd.Qnq())
              return false; 
            if (b2 < 4 && !kFd.Dne() && paramQnq.Dne(paramInt1 + b, paramInt2 + b2, paramInt3 + b1) != this.Dne)
              return false; 
          } 
        } 
      } 
    } 
    for (b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        for (byte b2 = 0; b2 < 8; b2++) {
          if (arrayOfBoolean[(b * 16 + b1) * 8 + b2])
            paramQnq.FWm(paramInt1 + b, paramInt2 + b2, paramInt3 + b1, (b2 >= 4) ? 0 : this.Dne, 0, 2); 
        } 
      } 
    } 
    for (b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        for (byte b2 = 4; b2 < 8; b2++) {
          if (arrayOfBoolean[(b * 16 + b1) * 8 + b2] && paramQnq.Dne(paramInt1 + b, paramInt2 + b2 - 1, paramInt3 + b1) == zKP.FWm.FWm && paramQnq.FWm((udO)udO.Dne, paramInt1 + b, paramInt2 + b2, paramInt3 + b1) > 0) {
            OdI odI = paramQnq.Dne(paramInt1 + b, paramInt3 + b1);
            if (odI.Dne == ((UyU)zKP.Dne).FWm) {
              paramQnq.FWm(paramInt1 + b, paramInt2 + b2 - 1, paramInt3 + b1, ((UyU)zKP.Dne).FWm, 0, 2);
            } else {
              paramQnq.FWm(paramInt1 + b, paramInt2 + b2 - 1, paramInt3 + b1, ((ZQN)zKP.Dne).FWm, 0, 2);
            } 
          } 
        } 
      } 
    } 
    if ((zKP.Dne[this.Dne]).Dne == KFd.IjH)
      for (b = 0; b < 16; b++) {
        for (byte b1 = 0; b1 < 16; b1++) {
          for (byte b2 = 0; b2 < 8; b2++) {
            boolean bool = (!arrayOfBoolean[(b * 16 + b1) * 8 + b2] && ((b < 15 && arrayOfBoolean[((b + 1) * 16 + b1) * 8 + b2]) || (b > 0 && arrayOfBoolean[((b - 1) * 16 + b1) * 8 + b2]) || (b1 < 15 && arrayOfBoolean[(b * 16 + b1 + 1) * 8 + b2]) || (b1 > 0 && arrayOfBoolean[(b * 16 + b1 - 1) * 8 + b2]) || (b2 < 7 && arrayOfBoolean[(b * 16 + b1) * 8 + b2 + 1]) || (b2 > 0 && arrayOfBoolean[(b * 16 + b1) * 8 + b2 - 1]))) ? true : false;
            if (bool && (b2 < 4 || paramRandom.nextInt(2) != 0) && paramQnq.Dne(paramInt1 + b, paramInt2 + b2, paramInt3 + b1).Dne())
              paramQnq.FWm(paramInt1 + b, paramInt2 + b2, paramInt3 + b1, zKP.Dne.FWm, 0, 2); 
          } 
        } 
      }  
    if ((zKP.Dne[this.Dne]).Dne == KFd.div)
      for (b = 0; b < 16; b++) {
        for (byte b1 = 0; b1 < 16; b1++) {
          byte b2 = 4;
          if (paramQnq.mrb(paramInt1 + b, paramInt2 + b2, paramInt3 + b1))
            paramQnq.FWm(paramInt1 + b, paramInt2 + b2, paramInt3 + b1, zKP.xEx.FWm, 0, 2); 
        } 
      }  
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gvF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */