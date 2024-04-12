public class ghA extends dEr {
  private int Dne;
  
  public boolean Dne(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne <= 0)
      return false; 
    if (!paramQnq.Dne(paramInt1, paramInt2, paramInt3) && paramQnq.Dne(paramInt1, paramInt2, paramInt3).Dne())
      return false; 
    if (((Jik)paramQnq.Dne).Dne != 0 && this.Dne == ((byt)zKP.Dne).FWm) {
      paramQnq.Dne(paramDouble1 + 0.5D, paramDouble2 + 0.5D, paramDouble3 + 0.5D, "random.fizz", 0.5F, 2.6F + (paramQnq.Dne.nextFloat() - paramQnq.Dne.nextFloat()) * 0.8F);
      for (byte b = 0; b < 8; b++)
        paramQnq.Dne("largesmoke", paramInt1 + Math.random(), paramInt2 + Math.random(), paramInt3 + Math.random(), 0.0D, 0.0D, 0.0D); 
    } else {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.Dne, 0, 3);
    } 
    return true;
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    float f = 1.0F;
    double d1 = paramFiG.aFZ + (paramFiG.div - paramFiG.aFZ) * f;
    double d2 = paramFiG.zGp + (paramFiG.IjH - paramFiG.zGp) * f + 1.62D - paramFiG.udO;
    double d3 = paramFiG.DyG + (paramFiG.mrb - paramFiG.DyG) * f;
    boolean bool = (this.Dne == 0) ? true : false;
    wHH wHH = Dne(paramQnq, paramFiG, bool);
    if (wHH == null)
      return paramNMq; 
    if (wHH.Dne == gks.Dne) {
      chN chN = wHH.Dne;
      int i = wHH.FWm;
      int j = wHH.bzF;
      if (!paramQnq.Dne(paramFiG, chN, i, j))
        return paramNMq; 
      if (this.Dne == 0) {
        if (!paramFiG.Dne(chN, i, j, wHH.Qnq, paramNMq))
          return paramNMq; 
        if (paramQnq.Dne(chN, i, j) == KFd.div && paramQnq.bzF(chN, i, j) == 0) {
          paramQnq.Qnq(chN, i, j);
          if (((uqg)paramFiG.Dne).Qnq)
            return paramNMq; 
          if (--paramNMq.Dne <= 0)
            return new NMq(dEr.cHy); 
          if (!paramFiG.Dne.Dne(new NMq(dEr.cHy)))
            paramFiG.Dne(new NMq(dEr.cHy.Qnq, 1, 0)); 
          return paramNMq;
        } 
        if (paramQnq.Dne(chN, i, j) == KFd.IjH && paramQnq.bzF(chN, i, j) == 0) {
          paramQnq.Qnq(chN, i, j);
          if (((uqg)paramFiG.Dne).Qnq)
            return paramNMq; 
          if (--paramNMq.Dne <= 0)
            return new NMq(dEr.xXN); 
          if (!paramFiG.Dne.Dne(new NMq(dEr.xXN)))
            paramFiG.Dne(new NMq(dEr.xXN.Qnq, 1, 0)); 
          return paramNMq;
        } 
      } else {
        if (this.Dne < 0)
          return new NMq(dEr.qMV); 
        if (wHH.Qnq == 0)
          i--; 
        if (wHH.Qnq == 1)
          i++; 
        if (wHH.Qnq == 2)
          j--; 
        if (wHH.Qnq == 3)
          j++; 
        if (wHH.Qnq == 4)
          chN--; 
        if (wHH.Qnq == 5)
          chN++; 
        if (!paramFiG.Dne(chN, i, j, wHH.Qnq, paramNMq))
          return paramNMq; 
        if (Dne(paramQnq, d1, d2, d3, chN, i, j) && !((uqg)paramFiG.Dne).Qnq)
          return new NMq(dEr.qMV); 
      } 
    } else if (this.Dne == 0 && wHH.Dne instanceof wBN) {
      return new NMq(dEr.EwP);
    } 
    return paramNMq;
  }
  
  public ghA(int paramInt1, int paramInt2) {
    super(paramInt1);
    this.Dne = paramInt2;
    Dne(JcN.aFZ);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ghA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */