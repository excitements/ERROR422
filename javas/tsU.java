import java.util.Random;

public class tsU extends ljW {
  private SoB Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    ipD ipD = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return (ipD instanceof SoB) ? (SoB)ipD : null;
  }
  
  public tsU(int paramInt) {
    super(paramInt, KFd.yMz);
    bzF(-1.0F);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ == null && paramQnq.Dne(paramInt1, paramInt2, paramInt3) == null) {
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      return true;
    } 
    return false;
  }
  
  public static ipD Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2) {
    return new SoB(paramInt1, paramInt2, paramInt3, paramBoolean1, paramBoolean2);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return false;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ != null || paramQnq.Dne(paramInt1, paramInt2, paramInt3) == null);
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    SoB soB = Dne(paramZpi, paramInt1, paramInt2, paramInt3);
    if (soB != null) {
      dNT dNT = zKP.Dne[soB.Dne()];
      if (dNT == null || dNT == this)
        return; 
      dNT.Dne(paramZpi, paramInt1, paramInt2, paramInt3);
      float f = soB.Dne(0.0F);
      if (soB.Dne())
        f = 1.0F - f; 
      int i = soB.FWm();
      this.Dne = dNT.Dne() - (rrP.FWm[i] * f);
      this.FWm = dNT.bzF() - (rrP.bzF[i] * f);
      this.bzF = dNT.aFZ() - (rrP.Qnq[i] * f);
      this.Qnq = dNT.FWm() - (rrP.FWm[i] * f);
      this.aFZ = dNT.Qnq() - (rrP.bzF[i] * f);
      this.zGp = dNT.zGp() - (rrP.Qnq[i] * f);
    } 
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    SoB soB = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    if (soB == null)
      return null; 
    float f = soB.Dne(0.0F);
    if (soB.Dne())
      f = 1.0F - f; 
    return Dne(paramQnq, paramInt1, paramInt2, paramInt3, soB.Dne(), f, soB.FWm());
  }
  
  static {
  
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (paramInt4 != 0 && paramInt4 != this.FWm) {
      bSp bSp = zKP.Dne[paramInt4].Dne(paramQnq, paramInt1, paramInt2, paramInt3);
      if (bSp == null)
        return null; 
      if (rrP.FWm[paramInt5] < 0) {
        bSp.Dne -= (rrP.FWm[paramInt5] * paramFloat);
      } else {
        bSp.Qnq -= (rrP.FWm[paramInt5] * paramFloat);
      } 
      if (rrP.bzF[paramInt5] < 0) {
        bSp.FWm -= (rrP.bzF[paramInt5] * paramFloat);
      } else {
        bSp.aFZ -= (rrP.bzF[paramInt5] * paramFloat);
      } 
      if (rrP.Qnq[paramInt5] < 0) {
        bSp.bzF -= (rrP.Qnq[paramInt5] * paramFloat);
      } else {
        bSp.zGp -= (rrP.Qnq[paramInt5] * paramFloat);
      } 
      return bSp;
    } 
    return null;
  }
  
  public int Dne() {
    return -1;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (paramQnq.aFZ == null) {
      SoB soB = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
      if (soB != null)
        zKP.Dne[soB.Dne()].FWm(paramQnq, paramInt1, paramInt2, paramInt3, soB.zGp(), 0); 
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (ipD instanceof SoB) {
      ((SoB)ipD).FWm();
    } else {
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } 
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("piston_top");
  }
  
  public ipD Dne(Qnq paramQnq) {
    return null;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {}
  
  public boolean FWm() {
    return false;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tsU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */