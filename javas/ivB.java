import java.util.Random;

public class ivB extends gwq {
  static {
  
  }
  
  private String Dne(Random paramRandom) {
    int i = paramRandom.nextInt(4);
    return (i == 0) ? "Skeleton" : ((i == 1) ? "Zombie" : ((i == 2) ? "Zombie" : ((i == 3) ? "Spider" : "")));
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    byte b1 = 3;
    int i = paramRandom.nextInt(2) + 2;
    int j = paramRandom.nextInt(2) + 2;
    byte b2 = 0;
    int k;
    for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
      for (int m = paramInt2 - 1; m <= paramInt2 + b1 + 1; m++) {
        for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
          KFd kFd = paramQnq.Dne(k, m, n);
          if (m == paramInt2 - 1 && !kFd.Dne())
            return false; 
          if (m == paramInt2 + b1 + 1 && !kFd.Dne())
            return false; 
          if ((k == paramInt1 - i - 1 || k == paramInt1 + i + 1 || n == paramInt3 - j - 1 || n == paramInt3 + j + 1) && m == paramInt2 && paramQnq.Dne(k, m, n) && paramQnq.Dne(k, m + 1, n))
            b2++; 
        } 
      } 
    } 
    if (b2 >= 1 && b2 <= 5) {
      for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
        for (int m = paramInt2 + b1; m >= paramInt2 - 1; m--) {
          for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
            if (k != paramInt1 - i - 1 && m != paramInt2 - 1 && n != paramInt3 - j - 1 && k != paramInt1 + i + 1 && m != paramInt2 + b1 + 1 && n != paramInt3 + j + 1) {
              paramQnq.Qnq(k, m, n);
            } else if (m >= 0 && !paramQnq.Dne(k, m - 1, n).Dne()) {
              paramQnq.Qnq(k, m, n);
            } else if (paramQnq.Dne(k, m, n).Dne()) {
              if (m == paramInt2 - 1 && paramRandom.nextInt(4) != 0) {
                paramQnq.FWm(k, m, n, zKP.yMz.FWm, 0, 2);
              } else {
                paramQnq.FWm(k, m, n, zKP.bzF.FWm, 0, 2);
              } 
            } 
          } 
        } 
      } 
      for (k = 0; k < 2; k++) {
        for (byte b = 0; b < 3; b++) {
          int m = paramInt1 + paramRandom.nextInt(i * 2 + 1) - i;
          int n = paramInt3 + paramRandom.nextInt(j * 2 + 1) - j;
          if (paramQnq.Dne(m, paramInt2, n)) {
            byte b3 = 0;
            if (paramQnq.Dne(m - 1, paramInt2, n).Dne())
              b3++; 
            if (paramQnq.Dne(m + 1, paramInt2, n).Dne())
              b3++; 
            if (paramQnq.Dne(m, paramInt2, n - 1).Dne())
              b3++; 
            if (paramQnq.Dne(m, paramInt2, n + 1).Dne())
              b3++; 
            if (b3 == 1) {
              paramQnq.FWm(m, paramInt2, n, ((gHK)zKP.Dne).FWm, 0, 2);
              GON gON = (GON)paramQnq.Dne(m, paramInt2, n);
              if (gON != null)
                for (byte b4 = 0; b4 < 8; b4++) {
                  NMq nMq = Dne(paramRandom);
                  if (nMq != null)
                    gON.Dne(paramRandom.nextInt(gON.Qnq()), nMq); 
                }  
              break;
            } 
          } 
        } 
      } 
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.eJi.FWm, 0, 2);
      ySb ySb = (ySb)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      if (ySb != null) {
        ySb.Dne().Dne(Dne(paramRandom));
      } else {
        System.err.println("Failed to fetch mob spawner entity at (" + paramInt1 + ", " + paramInt2 + ", " + paramInt3 + ")");
      } 
      return true;
    } 
    return false;
  }
  
  private NMq Dne(Random paramRandom) {
    int i = paramRandom.nextInt(12);
    return (i == 0) ? new NMq(dEr.YHU) : ((i == 1) ? new NMq(dEr.IjH, paramRandom.nextInt(4) + 1) : ((i == 2) ? new NMq(dEr.rPc) : ((i == 3) ? new NMq(dEr.EWz, paramRandom.nextInt(4) + 1) : ((i == 4) ? new NMq(dEr.cot, paramRandom.nextInt(4) + 1) : ((i == 5) ? new NMq(dEr.AgF, paramRandom.nextInt(4) + 1) : ((i == 6) ? new NMq(dEr.qMV) : ((i == 7 && paramRandom.nextInt(100) == 0) ? new NMq(dEr.ZfC) : ((i == 8 && paramRandom.nextInt(2) == 0) ? new NMq(dEr.exS, paramRandom.nextInt(4) + 1) : ((i == 9 && paramRandom.nextInt(10) == 0) ? new NMq(dEr.Dne[dEr.iTJ.Qnq + paramRandom.nextInt(2)]) : ((i == 10) ? new NMq(dEr.edi, 1, 3) : ((i == 11) ? dEr.Dne.Dne(paramRandom) : null)))))))))));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ivB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */