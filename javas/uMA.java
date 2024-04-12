import java.util.Random;

public class uMA extends ESF {
  public uMA(int paramInt) {
    super(paramInt, "ice", KFd.FfS, false);
    Dne(true);
    Dne(JcN.Dne);
  }
  
  static {
  
  }
  
  public int FWm() {
    return 0;
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public int a_() {
    return 1;
  }
  
  public void Dne(Qnq paramQnq, FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramFiG.Dne(trP.Dne[this.FWm], 1);
    paramFiG.aFZ(0.025F);
    if (aFZ() && UYp.Dne(paramFiG)) {
      NMq nMq = Dne(paramInt4);
      if (nMq != null)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, nMq); 
    } else {
      if (((Jik)paramQnq.Dne).Dne != 0) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        return;
      } 
      int i = UYp.Qnq(paramFiG);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, i);
      KFd kFd = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      if (kFd.bzF() || kFd.Qnq())
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((byt)zKP.Dne).FWm); 
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.FWm(udO.FWm, paramInt1, paramInt2, paramInt3) > 11 - zKP.FWm[this.FWm]) {
      if (((Jik)paramQnq.Dne).Dne != 0) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        return;
      } 
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((zKP)zKP.DyG).FWm);
    } 
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, 1 - paramInt4);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uMA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */