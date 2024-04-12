import java.util.List;
import java.util.Random;

abstract class ram extends bvz {
  private int Dne;
  
  protected opc Dne;
  
  protected int FWm(int paramInt) {
    return 0;
  }
  
  protected static boolean Dne(CLK paramCLK) {
    return (paramCLK != null && paramCLK.FWm > 10);
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CLK paramCLK) {
    int i = Qnq(paramInt1, paramInt2);
    int j = aFZ(paramInt1, paramInt2);
    super.Dne(paramQnq, i, j, paramInt3, paramInt4, paramInt5, paramCLK);
  }
  
  protected void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CLK paramCLK) {
    int i = Qnq(paramInt1, paramInt2);
    int j = aFZ(paramInt1, paramInt2);
    super.FWm(paramQnq, i, j, paramInt3, paramInt4, paramInt5, paramCLK);
  }
  
  protected bvz Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Dne - 1, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).bzF + paramInt2, 1, Dne());
      case 1:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Dne + paramInt2, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).bzF - 1, 2, Dne());
      case 2:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Dne - 1, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).bzF + paramInt2, 1, Dne());
      case 3:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Dne + paramInt2, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).bzF - 1, 2, Dne());
    } 
    return null;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.Dne < paramInt4)
      for (opc opc1 = this.Dne; opc1 < paramInt4; opc1++) {
        int i = Dne(paramInt1 + opc1, paramInt3);
        int j = Dne(paramInt2);
        int k = FWm(paramInt1 + opc1, paramInt3);
        if (!paramCLK.Dne(i, j, k))
          break; 
        this.Dne++;
        pjB pjB = new pjB(paramQnq, FWm(opc1));
        pjB.FWm(i + 0.5D, j, k + 0.5D, 0.0F, 0.0F);
        paramQnq.FWm(pjB);
      }  
  }
  
  protected ram(opc paramopc, int paramInt) {
    super(paramInt);
    this.Dne = paramopc;
  }
  
  protected bvz FWm(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Qnq + 1, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).bzF + paramInt2, 3, Dne());
      case 1:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Dne + paramInt2, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).zGp + 1, 0, Dne());
      case 2:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Qnq + 1, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).bzF + paramInt2, 3, Dne());
      case 3:
        return wBl.Dne(paramopc, paramList, paramRandom, ((CLK)this.Dne).Dne + paramInt2, ((CLK)this.Dne).FWm + paramInt1, ((CLK)this.Dne).zGp + 1, 0, Dne());
    } 
    return null;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean) {
    int i = Qnq(paramInt7, 0);
    int j = aFZ(paramInt7, 0);
    int k = Qnq(paramInt8, 0);
    int m = aFZ(paramInt8, 0);
    Dne(paramQnq, paramCLK, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, i, j, k, m, paramBoolean);
  }
  
  protected int aFZ(int paramInt1, int paramInt2) {
    if (this.Dne.Dne != null) {
      if (paramInt1 == zKP.udO.FWm)
        return 0; 
      if (paramInt1 == zKP.bzF.FWm)
        return 0; 
      if (paramInt1 == ((zKP)zKP.Qnq).FWm)
        return 2; 
    } 
    return paramInt2;
  }
  
  protected int Dne(Qnq paramQnq, CLK paramCLK) {
    int i = 0;
    byte b = 0;
    for (int j = ((CLK)this.Dne).bzF; j <= ((CLK)this.Dne).zGp; j++) {
      for (int k = ((CLK)this.Dne).Dne; k <= ((CLK)this.Dne).Qnq; k++) {
        if (paramCLK.Dne(k, 64, j)) {
          i += Math.max(paramQnq.aFZ(k, j), paramQnq.Dne.Dne());
          b++;
        } 
      } 
    } 
    return (b == 0) ? -1 : (i / b);
  }
  
  protected int Qnq(int paramInt1, int paramInt2) {
    if (this.Dne.Dne != null) {
      if (paramInt1 == zKP.udO.FWm)
        return zKP.ceE.FWm; 
      if (paramInt1 == zKP.bzF.FWm)
        return zKP.ceE.FWm; 
      if (paramInt1 == ((zKP)zKP.Qnq).FWm)
        return zKP.ceE.FWm; 
      if (paramInt1 == zKP.One.FWm)
        return zKP.Wnd.FWm; 
      if (paramInt1 == zKP.BJH.FWm)
        return zKP.Wnd.FWm; 
      if (paramInt1 == zKP.mrb.FWm)
        return zKP.ceE.FWm; 
    } 
    return paramInt1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ram.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */