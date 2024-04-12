import java.util.Random;

public class VbF extends ljW {
  public ipD Dne(Qnq paramQnq) {
    return new FgE();
  }
  
  public boolean a_() {
    return true;
  }
  
  public int Dne(Qnq paramQnq) {
    return 1;
  }
  
  static {
  
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    FgE fgE = (FgE)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (paramNMq.zGp())
      fgE.bzF(paramNMq.FWm()); 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    FgE fgE = (FgE)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (fgE != null)
      paramFiG.Dne(fgE); 
    return true;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    return (ipD != null && ipD instanceof FgE) ? ((FgE)ipD).Dne() : 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null) {
      boolean bool = paramQnq.kGO(paramInt1, paramInt2, paramInt3);
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      boolean bool1 = ((i & 0x1) != 0) ? true : false;
      if (bool && !bool1) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 0x1, 4);
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
      } else if (!bool && bool1) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFFE, 4);
      } 
    } 
  }
  
  public VbF(int paramInt) {
    super(paramInt, KFd.zGp);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (ipD != null && ipD instanceof FgE) {
      FgE fgE = (FgE)ipD;
      fgE.Dne(fgE.Dne(paramQnq));
      paramQnq.aFZ(paramInt1, paramInt2, paramInt3, this.FWm);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VbF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */