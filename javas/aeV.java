import java.util.Random;

public class aeV extends zKP {
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.ZeN.Qnq;
  }
  
  public void Dne() {
    float f1 = 0.375F;
    float f2 = f1 / 2.0F;
    Dne(0.5F - f2, 0.0F, 0.5F - f2, 0.5F + f2, f1, 0.5F + f2);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
    if (paramInt4 > 0) {
      NMq nMq = a_(paramInt4);
      if (nMq != null)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, nMq); 
    } 
  }
  
  static {
  
  }
  
  public boolean div() {
    return true;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
  
  public static NMq a_(int paramInt) {
    switch (paramInt) {
      case 1:
        return new NMq(zKP.FWm);
      case 2:
        return new NMq(zKP.Dne);
      case 3:
        return new NMq(zKP.aFZ, 1, 0);
      case 4:
        return new NMq(zKP.aFZ, 1, 1);
      case 5:
        return new NMq(zKP.aFZ, 1, 2);
      case 6:
        return new NMq(zKP.aFZ, 1, 3);
      case 7:
        return new NMq((zKP)zKP.Qnq);
      case 8:
        return new NMq(zKP.bzF);
      case 9:
        return new NMq(zKP.XjO);
      case 10:
        return new NMq(zKP.Dne);
      case 11:
        return new NMq(zKP.Dne, 1, 2);
    } 
    return null;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public aeV(int paramInt) {
    super(paramInt, KFd.qLR);
    Dne();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    NMq nMq = paramFiG.Dne.Dne();
    if (nMq == null)
      return false; 
    if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) != 0)
      return false; 
    int i = Dne(nMq);
    if (i > 0) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
      if (!((uqg)paramFiG.Dne).Qnq && --nMq.Dne <= 0)
        paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, (NMq)null); 
      return true;
    } 
    return false;
  }
  
  public static int Dne(NMq paramNMq) {
    int i = (paramNMq.Dne()).Qnq;
    if (i == zKP.FWm.FWm)
      return 1; 
    if (i == ((hbe)zKP.Dne).FWm)
      return 2; 
    if (i == zKP.XjO.FWm)
      return 9; 
    if (i == zKP.bzF.FWm)
      return 8; 
    if (i == ((hbe)zKP.Qnq).FWm)
      return 7; 
    if (i == ((bdU)zKP.Dne).FWm)
      return 10; 
    if (i == zKP.aFZ.FWm)
      switch (paramNMq.Qnq()) {
        case 0:
          return 3;
        case 1:
          return 4;
        case 2:
          return 5;
        case 3:
          return 6;
      }  
    if (i == ((Tte)zKP.Dne).FWm)
      switch (paramNMq.Qnq()) {
        case 2:
          return 11;
      }  
    return 0;
  }
  
  public int Dne() {
    return 33;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    NMq nMq = a_(paramQnq.bzF(paramInt1, paramInt2, paramInt3));
    return (nMq == null) ? dEr.ZeN.Qnq : nMq.bzF;
  }
  
  public int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    NMq nMq = a_(paramQnq.bzF(paramInt1, paramInt2, paramInt3));
    return (nMq == null) ? dEr.ZeN.Qnq : nMq.Qnq();
  }
  
  public boolean Dne() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aeV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */