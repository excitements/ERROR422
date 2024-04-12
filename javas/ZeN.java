import java.util.List;
import java.util.Random;

public class ZeN extends bvz {
  private int Dne;
  
  private final boolean Dne;
  
  private boolean bzF;
  
  private final boolean FWm;
  
  public ZeN(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.Dne = (paramRandom.nextInt(3) == 0);
    this.FWm = (!this.Dne && paramRandom.nextInt(23) == 0);
    if (this.aFZ != 2 && this.aFZ != 0) {
      this.Dne = paramCLK.Dne() / 5;
    } else {
      this.Dne = paramCLK.bzF() / 5;
    } 
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    int i = this.Dne * 5 - 1;
    Dne(paramQnq, paramCLK, 0, 0, 0, 2, 1, i, 0, 0, false);
    Dne(paramQnq, paramCLK, paramRandom, 0.8F, 0, 2, 0, 2, 2, i, 0, 0, false);
    if (this.FWm)
      Dne(paramQnq, paramCLK, paramRandom, 0.6F, 0, 0, 0, 2, 1, i, zKP.vSL.FWm, 0, false); 
    byte b;
    for (b = 0; b < this.Dne; b++) {
      int j = 2 + b * 5;
      Dne(paramQnq, paramCLK, 0, 0, j, 0, 1, j, zKP.sly.FWm, 0, false);
      Dne(paramQnq, paramCLK, 2, 0, j, 2, 1, j, zKP.sly.FWm, 0, false);
      if (paramRandom.nextInt(4) == 0) {
        Dne(paramQnq, paramCLK, 0, 2, j, 0, 2, j, ((zKP)zKP.Qnq).FWm, 0, false);
        Dne(paramQnq, paramCLK, 2, 2, j, 2, 2, j, ((zKP)zKP.Qnq).FWm, 0, false);
      } else {
        Dne(paramQnq, paramCLK, 0, 2, j, 2, 2, j, ((zKP)zKP.Qnq).FWm, 0, false);
      } 
      Dne(paramQnq, paramCLK, paramRandom, 0.1F, 0, 2, j - 1, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.1F, 2, 2, j - 1, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.1F, 0, 2, j + 1, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.1F, 2, 2, j + 1, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.05F, 0, 2, j - 2, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.05F, 2, 2, j - 2, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.05F, 0, 2, j + 2, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.05F, 2, 2, j + 2, zKP.vSL.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.05F, 1, 2, j - 1, zKP.Wwe.FWm, 0);
      Dne(paramQnq, paramCLK, paramRandom, 0.05F, 1, 2, j + 1, zKP.Wwe.FWm, 0);
      if (paramRandom.nextInt(100) == 0)
        Dne(paramQnq, paramCLK, paramRandom, 2, 0, j - 1, fKu.Dne(FUM.Dne(), new fKu[] { dEr.Dne.Dne(paramRandom) }), 3 + paramRandom.nextInt(4)); 
      if (paramRandom.nextInt(100) == 0)
        Dne(paramQnq, paramCLK, paramRandom, 0, 0, j + 1, fKu.Dne(FUM.Dne(), new fKu[] { dEr.Dne.Dne(paramRandom) }), 3 + paramRandom.nextInt(4)); 
      if (this.FWm && !this.bzF) {
        int k = Dne(0);
        int m = j - 1 + paramRandom.nextInt(3);
        int n = Dne(1, m);
        m = FWm(1, m);
        if (paramCLK.Dne(n, k, m)) {
          this.bzF = true;
          paramQnq.FWm(n, k, m, zKP.eJi.FWm, 0, 2);
          ySb ySb = (ySb)paramQnq.Dne(n, k, m);
          if (ySb != null)
            ySb.Dne().Dne("CaveSpider"); 
        } 
      } 
    } 
    for (b = 0; b <= 2; b++) {
      for (byte b1 = 0; b1 <= i; b1++) {
        int j = Dne(paramQnq, b, -1, b1, paramCLK);
        if (j == 0)
          Dne(paramQnq, ((zKP)zKP.Qnq).FWm, 0, b, -1, b1, paramCLK); 
      } 
    } 
    if (this.Dne)
      for (b = 0; b <= i; b++) {
        int j = Dne(paramQnq, 1, -1, b, paramCLK);
        if (j > 0 && zKP.FWm[j] != null)
          Dne(paramQnq, paramCLK, paramRandom, 0.7F, 1, 0, b, zKP.FYZ.FWm, bzF(zKP.FYZ.FWm, 0)); 
      }  
    return true;
  }
  
  protected boolean Dne(Qnq paramQnq, CLK paramCLK, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, fKu[] paramArrayOffKu, int paramInt4) {
    int i = Dne(paramInt1, paramInt3);
    int j = Dne(paramInt2);
    int k = FWm(paramInt1, paramInt3);
    if (paramCLK.Dne(i, j, k) && paramQnq.Dne(i, j, k) == 0) {
      paramQnq.FWm(i, j, k, zKP.FYZ.FWm, bzF(zKP.FYZ.FWm, paramRandom.nextBoolean() ? 1 : 0), 2);
      bnY bnY = new bnY(paramQnq, (i + 0.5F), (j + 0.5F), (k + 0.5F));
      fKu.Dne(paramRandom, paramArrayOffKu, bnY, paramInt4);
      paramQnq.FWm(bnY);
      return true;
    } 
    return false;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    int i = Dne();
    int j = paramRandom.nextInt(4);
    switch (this.aFZ) {
      case 0:
        if (j <= 1) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.zGp + 1, this.aFZ, i);
          break;
        } 
        if (j == 2) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.zGp - 3, 1, i);
          break;
        } 
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.zGp - 3, 3, i);
        break;
      case 1:
        if (j <= 1) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF, this.aFZ, i);
          break;
        } 
        if (j == 2) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF - 1, 2, i);
          break;
        } 
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.zGp + 1, 0, i);
        break;
      case 2:
        if (j <= 1) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF - 1, this.aFZ, i);
          break;
        } 
        if (j == 2) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF, 1, i);
          break;
        } 
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF, 3, i);
        break;
      case 3:
        if (j <= 1) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF, this.aFZ, i);
          break;
        } 
        if (j == 2) {
          FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq - 3, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.bzF - 1, 2, i);
          break;
        } 
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq - 3, this.Dne.FWm - 1 + paramRandom.nextInt(3), this.Dne.zGp + 1, 0, i);
        break;
    } 
    if (i < 8)
      if (this.aFZ != 2 && this.aFZ != 0) {
        for (int k = this.Dne.Dne + 3; k + 3 <= this.Dne.Qnq; k += 5) {
          int m = paramRandom.nextInt(5);
          if (m == 0) {
            FUM.Dne(parambvz, paramList, paramRandom, k, this.Dne.FWm, this.Dne.bzF - 1, 2, i + 1);
          } else if (m == 1) {
            FUM.Dne(parambvz, paramList, paramRandom, k, this.Dne.FWm, this.Dne.zGp + 1, 0, i + 1);
          } 
        } 
      } else {
        for (int k = this.Dne.bzF + 3; k + 3 <= this.Dne.zGp; k += 5) {
          int m = paramRandom.nextInt(5);
          if (m == 0) {
            FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, k, 1, i + 1);
          } else if (m == 1) {
            FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, k, 3, i + 1);
          } 
        } 
      }  
  }
  
  public static CLK Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    CLK cLK = new CLK(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
    int i;
    for (i = paramRandom.nextInt(3) + 2; i > 0; i--) {
      int j = i * 5;
      switch (paramInt4) {
        case 0:
          cLK.Qnq = paramInt1 + 2;
          cLK.zGp = paramInt3 + j - 1;
          break;
        case 1:
          cLK.Dne = paramInt1 - j - 1;
          cLK.zGp = paramInt3 + 2;
          break;
        case 2:
          cLK.Qnq = paramInt1 + 2;
          cLK.bzF = paramInt3 - j - 1;
          break;
        case 3:
          cLK.Qnq = paramInt1 + j - 1;
          cLK.zGp = paramInt3 + 2;
          break;
      } 
      if (bvz.Dne(paramList, cLK) == null)
        break; 
    } 
    return (i > 0) ? cLK : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZeN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */