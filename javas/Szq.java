class Szq extends Thread {
  public void run() {
    int i = geR.FWm(((PJQ)QXI.Dne).div + 18.0D);
    int j = geR.FWm(((PJQ)QXI.Dne).IjH + 10.0D);
    int k = geR.FWm(((PJQ)QXI.Dne).mrb + 18.0D);
    hbe hbe = zKP.udO.FWm;
    byte b1 = 36;
    byte b2 = 20;
    byte b = -1;
    if (eCD.Dne(8) == 0) {
      b = 1;
    } else if (eCD.Dne(8) == 0) {
      b = 2;
    } 
    for (byte b3 = 0; b3 < b1; b3++) {
      for (byte b4 = 0; b4 < b1; b4++) {
        for (byte b5 = 0; b5 < b2; b5++) {
          if (QXI.Dne.Dne(i, j - b5, k) == zKP.trS.FWm && eCD.Dne(3) == 0) {
            QXI.Dne.FWm(i, j - b5, k, 0);
            QXI.Dne.Dne(i, j, k, "random.glass", 1.0F, 1.0F);
          } 
          switch (b) {
            case 1:
              if (QXI.Dne.Dne(i, j - b5, k) == ((byt)zKP.Dne).FWm || QXI.Dne.Dne(i, j - b5, k) == ((zKP)zKP.DyG).FWm) {
                QXI.Dne.FWm(i, j - b5, k, ((zKP)zKP.div).FWm);
                QXI.Dne.Dne(i, j, k, "step.stone", 1.0F, 1.0F);
              } 
              break;
            case 2:
              if (QXI.Dne.Dne(i, j - b5 + 1, k) == 0 && QXI.Dne.Dne(i, j - b5, k) != 0 && eCD.Dne(10) == 0)
                QXI.Dne.FWm(i, j - b5 + 1, k, ((iqp)zKP.Dne).FWm); 
              break;
          } 
        } 
        i--;
      } 
      i += b1;
      k--;
    } 
  }
  
  Szq(FqX paramFqX) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Szq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */