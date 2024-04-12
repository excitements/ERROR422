import java.util.Random;

public class qvF extends byt {
  boolean[] Dne;
  
  int Dne;
  
  int[] Dne = false;
  
  protected qvF(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
    this.Dne = (int[])new boolean[4];
    this.Dne = new int[4];
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i != zKP.ICU.FWm && i != zKP.IYC.FWm && i != zKP.LVR.FWm && i != zKP.ZfC.FWm && i != zKP.TKg.FWm) {
      if (i == 0)
        return false; 
      dNT dNT = (zKP.Dne[i]).Dne;
      return (dNT == KFd.tgc) ? true : dNT.bzF();
    } 
    return true;
  }
  
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (Qnq(paramQnq, paramInt1, paramInt2, paramInt3)) {
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      if (i > 0)
        if (this.Dne == KFd.IjH) {
          bzF(paramQnq, paramInt1, paramInt2, paramInt3);
        } else {
          zKP.Dne[i].FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
        }  
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, paramInt4, 3);
    } 
  }
  
  private boolean[] Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i;
    for (i = 0; i < 4; i++) {
      this.Dne[i] = 1000;
      int j = paramInt1;
      int k = paramInt3;
      if (i == 0)
        j = paramInt1 - 1; 
      if (i == 1)
        j++; 
      if (i == 2)
        k = paramInt3 - 1; 
      if (i == 3)
        k++; 
      if (!bzF(paramQnq, j, paramInt2, k) && (paramQnq.Dne(j, paramInt2, k) != this.Dne || paramQnq.bzF(j, paramInt2, k) != 0))
        if (bzF(paramQnq, j, paramInt2 - 1, k)) {
          this.Dne[i] = Dne(paramQnq, j, paramInt2, k, 1, i);
        } else {
          this.Dne[i] = 0;
        }  
    } 
    i = this.Dne[0];
    byte b;
    for (b = 1; b < 4; b++) {
      if (this.Dne[b] < i)
        i = this.Dne[b]; 
    } 
    for (b = 0; b < 4; b++)
      this.Dne[b] = (this.Dne[b] == i) ? 1 : 0; 
    return (boolean[])this.Dne;
  }
  
  public boolean zGp() {
    return false;
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm + 1, i, 2);
  }
  
  private int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = 1000;
    for (byte b = 0; b < 4; b++) {
      if ((b != 0 || paramInt5 != 1) && (b != 1 || paramInt5 != 0) && (b != 2 || paramInt5 != 3) && (b != 3 || paramInt5 != 2)) {
        int j = paramInt1;
        int k = paramInt3;
        if (b == 0)
          j = paramInt1 - 1; 
        if (b == 1)
          j++; 
        if (b == 2)
          k = paramInt3 - 1; 
        if (b == 3)
          k++; 
        if (!bzF(paramQnq, j, paramInt2, k) && (paramQnq.Dne(j, paramInt2, k) != this.Dne || paramQnq.bzF(j, paramInt2, k) != 0)) {
          if (!bzF(paramQnq, j, paramInt2 - 1, k))
            return paramInt4; 
          if (paramInt4 < 4) {
            int m = Dne(paramQnq, j, paramInt2, k, paramInt4 + 1, b);
            if (m < i)
              i = m; 
          } 
        } 
      } 
    } 
    return i;
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return (this.Dne != KFd.IjH);
  }
  
  protected int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    if (i < 0)
      return paramInt4; 
    if (i == 0)
      this.Dne++; 
    if (i >= 8)
      i = 0; 
    return (paramInt4 >= 0 && i >= paramInt4) ? paramInt4 : i;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq)); 
  }
  
  private boolean Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    KFd kFd = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    return (kFd == this.Dne) ? false : ((kFd == KFd.IjH) ? false : (!bzF(paramQnq, paramInt1, paramInt2, paramInt3)));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    byte b = 1;
    if (this.Dne == KFd.IjH && ((Jik)paramQnq.Dne).Dne == 0)
      b = 2; 
    boolean bool = true;
    if (i > 0) {
      byte b1 = -100;
      this.Dne = false;
      int k = FWm(paramQnq, paramInt1 - 1, paramInt2, paramInt3, b1);
      k = FWm(paramQnq, paramInt1 + 1, paramInt2, paramInt3, k);
      k = FWm(paramQnq, paramInt1, paramInt2, paramInt3 - 1, k);
      k = FWm(paramQnq, paramInt1, paramInt2, paramInt3 + 1, k);
      int j = k + b;
      if (j >= 8 || k < 0)
        j = -1; 
      if (bzF(paramQnq, paramInt1, paramInt2 + 1, paramInt3) >= 0) {
        int m = bzF(paramQnq, paramInt1, paramInt2 + 1, paramInt3);
        if (m >= 8) {
          j = m;
        } else {
          j = m + 8;
        } 
      } 
      if (this.Dne >= 2 && this.Dne == KFd.div)
        if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3).Dne()) {
          j = 0;
        } else if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == this.Dne && paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3) == 0) {
          j = 0;
        }  
      if (this.Dne == KFd.IjH && i < 8 && j < 8 && j > i && paramRandom.nextInt(4) != 0) {
        j = i;
        bool = false;
      } 
      if (j == i) {
        if (bool)
          Qnq(paramQnq, paramInt1, paramInt2, paramInt3); 
      } else {
        i = j;
        if (j < 0) {
          paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        } else {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 2);
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
          paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
        } 
      } 
    } else {
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
    } 
    if (Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3)) {
      if (this.Dne == KFd.IjH && paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == KFd.div) {
        paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3, zKP.Dne.FWm);
        bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3);
        return;
      } 
      if (i >= 8) {
        FWm(paramQnq, paramInt1, paramInt2 - 1, paramInt3, i);
      } else {
        FWm(paramQnq, paramInt1, paramInt2 - 1, paramInt3, i + 8);
      } 
    } else if (i >= 0 && (i == 0 || bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3))) {
      boolean[] arrayOfBoolean = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
      int j = i + b;
      if (i >= 8)
        j = 1; 
      if (j >= 8)
        return; 
      if (arrayOfBoolean[0])
        FWm(paramQnq, paramInt1 - 1, paramInt2, paramInt3, j); 
      if (arrayOfBoolean[1])
        FWm(paramQnq, paramInt1 + 1, paramInt2, paramInt3, j); 
      if (arrayOfBoolean[2])
        FWm(paramQnq, paramInt1, paramInt2, paramInt3 - 1, j); 
      if (arrayOfBoolean[3])
        FWm(paramQnq, paramInt1, paramInt2, paramInt3 + 1, j); 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qvF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */