import java.util.List;
import java.util.Random;

public class KPs extends zKP {
  private gDn FWm;
  
  private gDn Dne;
  
  public boolean FWm() {
    return false;
  }
  
  public gDn Dne() {
    return this.FWm;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? zKP.dNY.FWm(paramInt1) : this.Qnq);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (Dne(i)) {
      Dne(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    } 
    Dne();
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x4) != 0);
  }
  
  public void Dne() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return 0;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("endframe_side");
    this.Dne = paramRbp.Dne("endframe_top");
    this.FWm = paramRbp.Dne("endframe_eye");
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = ((geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3) + 2) % 4;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
  }
  
  public int Dne() {
    return 26;
  }
  
  public KPs(int paramInt) {
    super(paramInt, KFd.aFZ);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KPs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */