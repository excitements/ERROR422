public class DOM extends dEr {
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq) && i == zKP.dBc.FWm && !KPs.Dne(j)) {
      if (paramQnq.aFZ != null)
        return true; 
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j + 4, 2);
      paramNMq.Dne--;
      int k;
      for (k = 0; k < 16; k++) {
        double d1 = (paramInt1 + (5.0F + Dne.nextFloat() * 6.0F) / 16.0F);
        double d2 = (paramInt2 + 0.8125F);
        double d3 = (paramInt3 + (5.0F + Dne.nextFloat() * 6.0F) / 16.0F);
        double d4 = 0.0D;
        double d5 = 0.0D;
        double d6 = 0.0D;
        paramQnq.Dne("smoke", d1, d2, d3, d4, d5, d6);
      } 
      k = j & 0x3;
      int m = 0;
      int n = 0;
      boolean bool1 = false;
      boolean bool2 = true;
      int i1 = zxJ.zGp[k];
      int i2;
      for (i2 = -2; i2 <= 2; i2++) {
        int i4 = paramInt1 + zxJ.Dne[i1] * i2;
        int i3 = paramInt3 + zxJ.FWm[i1] * i2;
        int i5 = paramQnq.Dne(i4, paramInt2, i3);
        if (i5 == zKP.dBc.FWm) {
          int i6 = paramQnq.bzF(i4, paramInt2, i3);
          if (!KPs.Dne(i6)) {
            bool2 = false;
            break;
          } 
          n = i2;
          if (!bool1) {
            m = i2;
            bool1 = true;
          } 
        } 
      } 
      if (bool2 && n == m + 2) {
        for (i2 = m; i2 <= n; i2++) {
          int i5 = paramInt1 + zxJ.Dne[i1] * i2;
          int i3 = paramInt3 + zxJ.FWm[i1] * i2;
          i5 += zxJ.Dne[k] * 4;
          i3 += zxJ.FWm[k] * 4;
          int i6 = paramQnq.Dne(i5, paramInt2, i3);
          int i4 = paramQnq.bzF(i5, paramInt2, i3);
          if (i6 != zKP.dBc.FWm || !KPs.Dne(i4)) {
            bool2 = false;
            break;
          } 
        } 
        for (i2 = m - 1; i2 <= n + 1; i2 += 4) {
          for (byte b = 1; b <= 3; b++) {
            int i3 = paramInt1 + zxJ.Dne[i1] * i2;
            int i5 = paramInt3 + zxJ.FWm[i1] * i2;
            i3 += zxJ.Dne[k] * b;
            i5 += zxJ.FWm[k] * b;
            int i4 = paramQnq.Dne(i3, paramInt2, i5);
            int i6 = paramQnq.bzF(i3, paramInt2, i5);
            if (i4 != zKP.dBc.FWm || !KPs.Dne(i6)) {
              bool2 = false;
              break;
            } 
          } 
        } 
        if (bool2)
          for (i2 = m; i2 <= n; i2++) {
            for (byte b = 1; b <= 3; b++) {
              int i3 = paramInt1 + zxJ.Dne[i1] * i2;
              int i4 = paramInt3 + zxJ.FWm[i1] * i2;
              i3 += zxJ.Dne[k] * b;
              i4 += zxJ.FWm[k] * b;
              paramQnq.FWm(i3, paramInt2, i4, zKP.EYV.FWm, 0, 2);
            } 
          }  
      } 
      return true;
    } 
    return false;
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    wHH wHH = Dne(paramQnq, paramFiG, false);
    if (wHH != null && wHH.Dne == gks.Dne) {
      int i = paramQnq.Dne(wHH.Dne, wHH.FWm, wHH.bzF);
      if (i == zKP.dBc.FWm)
        return paramNMq; 
    } 
    if (paramQnq.aFZ == null) {
      EyB eyB = paramQnq.Dne("Stronghold", (int)paramFiG.div, (int)paramFiG.IjH, (int)paramFiG.mrb);
      if (eyB != null) {
        UMP uMP = new UMP(paramQnq, paramFiG.div, paramFiG.IjH + 1.62D - paramFiG.udO, paramFiG.mrb);
        uMP.Dne(eyB.Dne, eyB.FWm, eyB.bzF);
        paramQnq.FWm(uMP);
        paramQnq.Dne(paramFiG, "random.bow", 0.5F, 0.4F / (Dne.nextFloat() * 0.4F + 0.8F));
        paramQnq.Dne((FiG)null, 1002, (int)paramFiG.div, (int)paramFiG.IjH, (int)paramFiG.mrb, 0);
        if (!((uqg)paramFiG.Dne).Qnq)
          paramNMq.Dne--; 
      } 
    } 
    return paramNMq;
  }
  
  static {
  
  }
  
  public DOM(int paramInt) {
    super(paramInt);
    Dne(JcN.aFZ);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DOM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */