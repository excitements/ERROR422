public class Iaa extends Oaf {
  protected gDn Dne;
  
  protected boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i == this.FWm) {
      int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int k = j & 0x7;
      if (paramInt5 == 1 && (k == 0 || k == 4 || k == 5))
        return false; 
      if (paramInt5 == 0 && (k == 1 || k == 2 || k == 3))
        return false; 
      if ((j & 0x8) != 0)
        return paramQnq.kGO(paramInt1, paramInt2, paramInt3) ? true : Dne(paramQnq, paramInt1, paramInt2, paramInt3, j, paramBoolean, paramInt4 + 1); 
    } 
    return false;
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    boolean bool = paramQnq.kGO(paramInt1, paramInt2, paramInt3);
    bool = (bool || Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, true, 0) || Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, false, 0));
    boolean bool1 = false;
    if (bool && (paramInt4 & 0x8) == 0) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt5 | 0x8, 3);
      bool1 = true;
    } else if (!bool && (paramInt4 & 0x8) != 0) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt5, 3);
      bool1 = true;
    } 
    if (bool1) {
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      if (paramInt5 == 2 || paramInt5 == 3 || paramInt5 == 4 || paramInt5 == 5)
        paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm); 
    } 
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return ((paramInt2 & 0x8) == 0) ? this.Qnq : this.Dne;
  }
  
  protected boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
    if (paramInt5 >= 8)
      return false; 
    int i = paramInt4 & 0x7;
    boolean bool = true;
    switch (i) {
      case 0:
        if (paramBoolean) {
          paramInt3++;
          break;
        } 
        paramInt3--;
        break;
      case 1:
        if (paramBoolean) {
          paramInt1--;
          break;
        } 
        paramInt1++;
        break;
      case 2:
        if (paramBoolean) {
          paramInt1--;
        } else {
          paramInt1++;
          paramInt2++;
          bool = false;
        } 
        i = 1;
        break;
      case 3:
        if (paramBoolean) {
          paramInt1--;
          paramInt2++;
          bool = false;
        } else {
          paramInt1++;
        } 
        i = 1;
        break;
      case 4:
        if (paramBoolean) {
          paramInt3++;
        } else {
          paramInt3--;
          paramInt2++;
          bool = false;
        } 
        i = 0;
        break;
      case 5:
        if (paramBoolean) {
          paramInt3++;
          paramInt2++;
          bool = false;
        } else {
          paramInt3--;
        } 
        i = 0;
        break;
    } 
    return Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramBoolean, paramInt5, i) ? true : ((bool && Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, paramBoolean, paramInt5, i)));
  }
  
  protected Iaa(int paramInt) {
    super(paramInt, true);
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.Dne = paramRbp.Dne(Qnq() + "_powered");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Iaa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */