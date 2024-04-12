public class KFZ {
  private boolean Qnq;
  
  private chN Dne;
  
  private FUH Dne;
  
  private int Dne;
  
  private boolean bzF;
  
  private boolean Dne;
  
  private float FWm;
  
  private Qnq Dne;
  
  private float Dne;
  
  private wdG Dne = false;
  
  private boolean aFZ;
  
  private int FWm;
  
  private boolean FWm;
  
  public wdG Dne(FUH paramFUH) {
    return !Qnq() ? null : this.Dne.Dne((sMa)this.Dne, paramFUH, this.FWm, this.FWm, this.bzF, this.Qnq, this.aFZ);
  }
  
  private boolean Qnq() {
    return (((FUH)this.Dne).aFZ != null || (this.aFZ && aFZ()));
  }
  
  public KFZ(FUH paramFUH, Qnq paramQnq, float paramFloat) {
    this.Dne = (wdG)chN.Dne(0.0D, 0.0D, 0.0D);
    this.FWm = true;
    this.bzF = false;
    this.Qnq = false;
    this.aFZ = false;
    this.Dne = (wdG)paramFUH;
    this.Dne = (wdG)paramQnq;
    this.FWm = paramFloat;
  }
  
  public void Qnq(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  private boolean FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, chN paramchN, double paramDouble1, double paramDouble2) {
    for (int i = paramInt1; i < paramInt1 + paramInt4; i++) {
      for (int j = paramInt2; j < paramInt2 + paramInt5; j++) {
        for (int k = paramInt3; k < paramInt3 + paramInt6; k++) {
          double d1 = i + 0.5D - paramchN.Dne;
          double d2 = k + 0.5D - paramchN.bzF;
          if (d1 * paramDouble1 + d2 * paramDouble2 >= 0.0D) {
            int m = this.Dne.Dne(i, j, k);
            if (m > 0 && !zKP.Dne[m].Dne((Zpi)this.Dne, i, j, k))
              return false; 
          } 
        } 
      } 
    } 
    return true;
  }
  
  public void Dne(float paramFloat) {
    this.Dne = paramFloat;
  }
  
  public boolean Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    wdG wdG1 = Dne(geR.FWm(paramDouble1), (int)paramDouble2, geR.FWm(paramDouble3));
    return Dne(wdG1, paramFloat);
  }
  
  public boolean Dne(wdG paramwdG, float paramFloat) {
    if (paramwdG == null) {
      this.Dne = null;
      return false;
    } 
    if (!paramwdG.Dne(this.Dne))
      this.Dne = paramwdG; 
    if (this.Dne != null)
      Qnq(); 
    if (this.Dne.Dne() == 0)
      return false; 
    this.Dne = paramFloat;
    chN chN1 = Dne();
    this.FWm = this.Dne;
    ((chN)this.Dne).Dne = chN1.Dne;
    ((chN)this.Dne).FWm = chN1.FWm;
    ((chN)this.Dne).bzF = chN1.bzF;
    return true;
  }
  
  public wdG Dne() {
    return this.Dne;
  }
  
  public void Dne() {
    this.Dne++;
    if (!bzF()) {
      if (Qnq())
        bzF(); 
      if (!bzF()) {
        chN chN1 = this.Dne.Dne((sMa)this.Dne);
        if (chN1 != null)
          this.Dne.Dne().Dne(chN1.Dne, chN1.FWm, chN1.bzF, this.Dne); 
      } 
    } 
  }
  
  private boolean aFZ() {
    return (this.Dne.Zpi() || this.Dne.DyG());
  }
  
  private int Dne() {
    if (this.Dne.Zpi() && this.aFZ) {
      int i = (int)((FUH)this.Dne).Dne.FWm;
      int j = this.Dne.Dne(geR.FWm(((FUH)this.Dne).div), i, geR.FWm(((FUH)this.Dne).mrb));
      byte b = 0;
      while (true) {
        if (j != ((byt)zKP.Dne).FWm && j != ((zKP)zKP.DyG).FWm)
          return i; 
        j = this.Dne.Dne(geR.FWm(((FUH)this.Dne).div), ++i, geR.FWm(((FUH)this.Dne).mrb));
        if (++b > 16)
          return (int)((FUH)this.Dne).Dne.FWm; 
      } 
    } 
    return (int)(((FUH)this.Dne).Dne.FWm + 0.5D);
  }
  
  public boolean bzF() {
    return (this.Dne == null || this.Dne.Dne());
  }
  
  private void Qnq() {
    if (!this.Dne.aFZ(geR.FWm(((FUH)this.Dne).div), (int)(((FUH)this.Dne).Dne.FWm + 0.5D), geR.FWm(((FUH)this.Dne).mrb)))
      for (byte b = 0; b < this.Dne.Dne(); b++) {
        whE whE = this.Dne.Dne(b);
        if (this.Dne.aFZ(whE.Dne, whE.FWm, whE.bzF)) {
          this.Dne.Dne(b - 1);
          return;
        } 
      }  
  }
  
  public void FWm(boolean paramBoolean) {
    this.bzF = paramBoolean;
  }
  
  private boolean Dne(chN paramchN1, chN paramchN2, int paramInt1, int paramInt2, int paramInt3) {
    int i = geR.FWm(paramchN1.Dne);
    int j = geR.FWm(paramchN1.bzF);
    double d1 = paramchN2.Dne - paramchN1.Dne;
    double d2 = paramchN2.bzF - paramchN1.bzF;
    double d3 = d1 * d1 + d2 * d2;
    if (d3 < 1.0E-8D)
      return false; 
    double d4 = 1.0D / Math.sqrt(d3);
    d1 *= d4;
    d2 *= d4;
    paramInt1 += 2;
    paramInt3 += 2;
    if (!Dne(i, (int)paramchN1.FWm, j, paramInt1, paramInt2, paramInt3, paramchN1, d1, d2))
      return false; 
    paramInt1 -= 2;
    paramInt3 -= 2;
    double d5 = 1.0D / Math.abs(d1);
    double d6 = 1.0D / Math.abs(d2);
    double d7 = (i * 1) - paramchN1.Dne;
    double d8 = (j * 1) - paramchN1.bzF;
    if (d1 >= 0.0D)
      d7++; 
    if (d2 >= 0.0D)
      d8++; 
    d7 /= d1;
    d8 /= d2;
    byte b1 = (d1 < 0.0D) ? -1 : 1;
    byte b2 = (d2 < 0.0D) ? -1 : 1;
    int k = geR.FWm(paramchN2.Dne);
    int m = geR.FWm(paramchN2.bzF);
    int n = k - i;
    int i1 = m - j;
    while (true) {
      if (n * b1 <= 0 && i1 * b2 <= 0)
        return true; 
      if (d7 < d8) {
        d7 += d5;
        i += b1;
        n = k - i;
      } else {
        d8 += d6;
        j += b2;
        i1 = m - j;
      } 
      if (!Dne(i, (int)paramchN1.FWm, j, paramInt1, paramInt2, paramInt3, paramchN1, d1, d2))
        return false; 
    } 
  }
  
  public void FWm() {
    this.Dne = null;
  }
  
  public wdG Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    return !Qnq() ? null : this.Dne.Dne((sMa)this.Dne, geR.FWm(paramDouble1), (int)paramDouble2, geR.FWm(paramDouble3), this.FWm, this.FWm, this.bzF, this.Qnq, this.aFZ);
  }
  
  public boolean Dne(FUH paramFUH, float paramFloat) {
    wdG wdG1 = Dne(paramFUH);
    return (wdG1 != null) ? Dne(wdG1, paramFloat) : false;
  }
  
  public void bzF(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  private void bzF() {
    chN chN1 = Dne();
    int i = this.Dne.Dne();
    for (int j = this.Dne.FWm(); j < this.Dne.Dne(); j++) {
      if ((this.Dne.Dne(j)).FWm != (int)chN1.FWm) {
        i = j;
        break;
      } 
    } 
    float f = ((FUH)this.Dne).ooe * ((FUH)this.Dne).ooe;
    int k;
    for (k = this.Dne.FWm(); k < i; k++) {
      if (chN1.bzF(this.Dne.Dne((sMa)this.Dne, k)) < f)
        this.Dne.FWm(k + 1); 
    } 
    k = geR.FWm(((FUH)this.Dne).ooe);
    int m = (int)((FUH)this.Dne).trS + 1;
    int n = k;
    for (int i1 = i - 1; i1 >= this.Dne.FWm(); i1--) {
      if (Dne(chN1, this.Dne.Dne((sMa)this.Dne, i1), k, m, n)) {
        this.Dne.FWm(i1);
        break;
      } 
    } 
    if (this.Dne - this.FWm > 100) {
      if (chN1.bzF((chN)this.Dne) < 2.25D)
        FWm(); 
      this.FWm = this.Dne;
      ((chN)this.Dne).Dne = chN1.Dne;
      ((chN)this.Dne).FWm = chN1.FWm;
      ((chN)this.Dne).bzF = chN1.bzF;
    } 
  }
  
  public boolean FWm() {
    return this.bzF;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Qnq = paramBoolean;
  }
  
  public void aFZ(boolean paramBoolean) {
    this.aFZ = paramBoolean;
  }
  
  private boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, chN paramchN, double paramDouble1, double paramDouble2) {
    int i = paramInt1 - paramInt4 / 2;
    int j = paramInt3 - paramInt6 / 2;
    if (!FWm(i, paramInt2, j, paramInt4, paramInt5, paramInt6, paramchN, paramDouble1, paramDouble2))
      return false; 
    for (int k = i; k < i + paramInt4; k++) {
      for (int m = j; m < j + paramInt6; m++) {
        double d1 = k + 0.5D - paramchN.Dne;
        double d2 = m + 0.5D - paramchN.bzF;
        if (d1 * paramDouble1 + d2 * paramDouble2 >= 0.0D) {
          int n = this.Dne.Dne(k, paramInt2 - 1, m);
          if (n <= 0)
            return false; 
          dNT dNT = (zKP.Dne[n]).Dne;
          if (dNT == KFd.div && !this.Dne.Zpi())
            return false; 
          if (dNT == KFd.IjH)
            return false; 
        } 
      } 
    } 
    return true;
  }
  
  public boolean Dne() {
    return this.Qnq;
  }
  
  private chN Dne() {
    return this.Dne.Dne().Dne(((FUH)this.Dne).div, Dne(), ((FUH)this.Dne).mrb);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KFZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */