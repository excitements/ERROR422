import java.util.List;
import java.util.Random;

public class TXd extends ljW {
  private gDn Dne;
  
  private Random Dne = new Random();
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.ZkM.Qnq;
  }
  
  public boolean a_() {
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    Dne(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    Dne();
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    zio zio = (zio)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (zio != null)
      paramFiG.Dne(zio); 
    return true;
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.Dne = (Random)paramRbp.Dne("brewingStand_base");
  }
  
  public int Dne() {
    return 25;
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new zio();
  }
  
  public gDn Dne() {
    return (gDn)this.Dne;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Pdb.Dne((MqS)paramQnq.Dne(paramInt1, paramInt2, paramInt3));
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    double d1 = (paramInt1 + 0.4F + paramRandom.nextFloat() * 0.2F);
    double d2 = (paramInt2 + 0.7F + paramRandom.nextFloat() * 0.3F);
    double d3 = (paramInt3 + 0.4F + paramRandom.nextFloat() * 0.2F);
    paramQnq.Dne("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
  }
  
  public TXd(int paramInt) {
    super(paramInt, KFd.zGp);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (ipD instanceof zio) {
      zio zio = (zio)ipD;
      for (byte b = 0; b < zio.Qnq(); b++) {
        NMq nMq = zio.Dne(b);
        if (nMq != null) {
          float f1 = this.Dne.nextFloat() * 0.8F + 0.1F;
          float f2 = this.Dne.nextFloat() * 0.8F + 0.1F;
          float f3 = this.Dne.nextFloat() * 0.8F + 0.1F;
          while (nMq.Dne > 0) {
            int i = this.Dne.nextInt(21) + 10;
            if (i > nMq.Dne)
              i = nMq.Dne; 
            nMq.Dne -= i;
            JiM jiM = new JiM(paramQnq, (paramInt1 + f1), (paramInt2 + f2), (paramInt3 + f3), new NMq(nMq.bzF, i, nMq.Qnq()));
            float f = 0.05F;
            jiM.XHL = ((float)this.Dne.nextGaussian() * f);
            jiM.Zpi = ((float)this.Dne.nextGaussian() * f + 0.2F);
            jiM.kGO = ((float)this.Dne.nextGaussian() * f);
            paramQnq.FWm(jiM);
          } 
        } 
      } 
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    if (paramNMq.zGp())
      ((zio)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne(paramNMq.FWm()); 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.ZkM.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TXd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */