import java.util.Random;

public class ckY extends zKP {
  public ckY(int paramInt) {
    super(paramInt, KFd.aFZ);
    Dne(JcN.Dne);
  }
  
  public int Dne(int paramInt) {
    return (this.FWm == zKP.qLR.FWm) ? 4 : 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
    if (Dne(paramInt4, (Random)paramQnq.Dne, paramInt5) != this.FWm) {
      int i = 0;
      if (this.FWm == zKP.kGO.FWm) {
        i = geR.Dne((Random)paramQnq.Dne, 0, 2);
      } else if (this.FWm == zKP.ZgS.FWm) {
        i = geR.Dne((Random)paramQnq.Dne, 3, 7);
      } else if (this.FWm == zKP.ghu.FWm) {
        i = geR.Dne((Random)paramQnq.Dne, 3, 7);
      } else if (this.FWm == zKP.qLR.FWm) {
        i = geR.Dne((Random)paramQnq.Dne, 2, 5);
      } else if (this.FWm == zKP.NEG.FWm) {
        i = geR.Dne((Random)paramQnq.Dne, 2, 5);
      } 
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3, i);
    } 
  }
  
  public int Dne(Random paramRandom) {
    return (this.FWm == zKP.qLR.FWm) ? (4 + paramRandom.nextInt(5)) : 1;
  }
  
  public int Dne(int paramInt, Random paramRandom) {
    if (paramInt > 0 && this.FWm != Dne(0, paramRandom, paramInt)) {
      int i = paramRandom.nextInt(paramInt + 2) - 1;
      if (i < 0)
        i = 0; 
      return Dne(paramRandom) * (i + 1);
    } 
    return Dne(paramRandom);
  }
  
  static {
  
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return (this.FWm == zKP.kGO.FWm) ? dEr.DyG.Qnq : ((this.FWm == zKP.ZgS.FWm) ? dEr.div.Qnq : ((this.FWm == zKP.qLR.FWm) ? dEr.edi.Qnq : ((this.FWm == zKP.ghu.FWm) ? dEr.Kvh.Qnq : ((this.FWm == zKP.NEG.FWm) ? dEr.RMv.Qnq : this.FWm))));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ckY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */