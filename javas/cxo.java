import java.util.List;
import java.util.Random;

public class cxo extends Oaf {
  private gDn[] Dne;
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x8) > 0) {
      float f = 0.125F;
      List<MqS> list = paramQnq.Dne(Ebp.class, bSp.Dne().Dne((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), ((paramInt2 + 1) - f), ((paramInt3 + 1) - f)), pUe.FWm);
      if (list.size() > 0)
        return Pdb.Dne(list.get(0)); 
    } 
    return 0;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[2];
    this.Dne[0] = paramRbp.Dne("detectorRail");
    this.Dne[1] = paramRbp.Dne("detectorRail_on");
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if ((i & 0x8) == 0)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i); 
    } 
  }
  
  public boolean a_() {
    return true;
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) != 0) ? 15 : 0;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) == 0) ? 0 : ((paramInt4 == 1) ? 15 : 0);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if ((i & 0x8) != 0)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i); 
    } 
  }
  
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool1 = ((paramInt4 & 0x8) != 0) ? true : false;
    boolean bool2 = false;
    float f = 0.125F;
    List list = paramQnq.Dne(Ebp.class, bSp.Dne().Dne((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), ((paramInt2 + 1) - f), ((paramInt3 + 1) - f)));
    if (!list.isEmpty())
      bool2 = true; 
    if (bool2 && !bool1) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt4 | 0x8, 3);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    } 
    if (!bool2 && bool1) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt4 & 0x7, 3);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    } 
    if (bool2)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq)); 
    paramQnq.aFZ(paramInt1, paramInt2, paramInt3, this.FWm);
  }
  
  public int Dne(Qnq paramQnq) {
    return 20;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return ((paramInt2 & 0x8) != 0) ? this.Dne[1] : this.Dne[0];
  }
  
  public boolean bzF() {
    return true;
  }
  
  public cxo(int paramInt) {
    super(paramInt, true);
    Dne(true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cxo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */