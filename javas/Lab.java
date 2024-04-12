import java.util.Random;

public class Lab extends gwq {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    while (paramQnq.Dne(paramInt1, paramInt2, paramInt3) && paramInt2 > 2)
      paramInt2--; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i != ((zKP)zKP.IjH).FWm)
      return false; 
    byte b;
    for (b = -2; b <= 2; b++) {
      for (byte b1 = -2; b1 <= 2; b1++) {
        if (paramQnq.Dne(paramInt1 + b, paramInt2 - 1, paramInt3 + b1) && paramQnq.Dne(paramInt1 + b, paramInt2 - 2, paramInt3 + b1))
          return false; 
      } 
    } 
    for (b = -1; b <= 0; b++) {
      for (byte b1 = -2; b1 <= 2; b1++) {
        for (byte b2 = -2; b2 <= 2; b2++)
          paramQnq.FWm(paramInt1 + b1, paramInt2 + b, paramInt3 + b2, zKP.ceE.FWm, 0, 2); 
      } 
    } 
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((byt)zKP.Dne).FWm, 0, 2);
    paramQnq.FWm(paramInt1 - 1, paramInt2, paramInt3, ((byt)zKP.Dne).FWm, 0, 2);
    paramQnq.FWm(paramInt1 + 1, paramInt2, paramInt3, ((byt)zKP.Dne).FWm, 0, 2);
    paramQnq.FWm(paramInt1, paramInt2, paramInt3 - 1, ((byt)zKP.Dne).FWm, 0, 2);
    paramQnq.FWm(paramInt1, paramInt2, paramInt3 + 1, ((byt)zKP.Dne).FWm, 0, 2);
    for (b = -2; b <= 2; b++) {
      for (byte b1 = -2; b1 <= 2; b1++) {
        if (b == -2 || b == 2 || b1 == -2 || b1 == 2)
          paramQnq.FWm(paramInt1 + b, paramInt2 + 1, paramInt3 + b1, zKP.ceE.FWm, 0, 2); 
      } 
    } 
    paramQnq.FWm(paramInt1 + 2, paramInt2 + 1, paramInt3, ((dNT)zKP.FWm).FWm, 1, 2);
    paramQnq.FWm(paramInt1 - 2, paramInt2 + 1, paramInt3, ((dNT)zKP.FWm).FWm, 1, 2);
    paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3 + 2, ((dNT)zKP.FWm).FWm, 1, 2);
    paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3 - 2, ((dNT)zKP.FWm).FWm, 1, 2);
    for (b = -1; b <= 1; b++) {
      for (byte b1 = -1; b1 <= 1; b1++) {
        if (b == 0 && b1 == 0) {
          paramQnq.FWm(paramInt1 + b, paramInt2 + 4, paramInt3 + b1, zKP.ceE.FWm, 0, 2);
        } else {
          paramQnq.FWm(paramInt1 + b, paramInt2 + 4, paramInt3 + b1, ((dNT)zKP.FWm).FWm, 1, 2);
        } 
      } 
    } 
    for (b = 1; b <= 3; b++) {
      paramQnq.FWm(paramInt1 - 1, paramInt2 + b, paramInt3 - 1, zKP.ceE.FWm, 0, 2);
      paramQnq.FWm(paramInt1 - 1, paramInt2 + b, paramInt3 + 1, zKP.ceE.FWm, 0, 2);
      paramQnq.FWm(paramInt1 + 1, paramInt2 + b, paramInt3 - 1, zKP.ceE.FWm, 0, 2);
      paramQnq.FWm(paramInt1 + 1, paramInt2 + b, paramInt3 + 1, zKP.ceE.FWm, 0, 2);
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */