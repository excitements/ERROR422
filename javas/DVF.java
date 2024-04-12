import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DVF extends oeq {
  private boolean Dne;
  
  public DVF(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 0, 0, 0, 10, 7, 15, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, RLF.bzF, 4, 1, 0);
    byte b1 = 6;
    Dne(paramQnq, paramCLK, 1, b1, 1, 1, b1, 14, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 9, b1, 1, 9, b1, 14, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 2, b1, 1, 8, b1, 2, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 2, b1, 14, 8, b1, 14, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 1, 1, 1, 2, 1, 4, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 8, 1, 1, 9, 1, 4, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 1, 1, 1, 1, 1, 3, ((byt)zKP.FWm).FWm, ((byt)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 9, 1, 1, 9, 1, 3, ((byt)zKP.FWm).FWm, ((byt)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 3, 1, 8, 7, 1, 12, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 1, 9, 6, 1, 11, ((byt)zKP.FWm).FWm, ((byt)zKP.FWm).FWm, false);
    int i;
    for (i = 3; i < 14; i += 2) {
      Dne(paramQnq, paramCLK, 0, 3, i, 0, 4, i, zKP.Sdr.FWm, zKP.Sdr.FWm, false);
      Dne(paramQnq, paramCLK, 10, 3, i, 10, 4, i, zKP.Sdr.FWm, zKP.Sdr.FWm, false);
    } 
    for (i = 2; i < 9; i += 2)
      Dne(paramQnq, paramCLK, i, 3, 15, i, 4, 15, zKP.Sdr.FWm, zKP.Sdr.FWm, false); 
    i = bzF(zKP.yIR.FWm, 3);
    Dne(paramQnq, paramCLK, 4, 1, 5, 6, 1, 7, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 2, 6, 6, 2, 7, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 3, 7, 6, 3, 7, false, paramRandom, dlc.Dne());
    byte b2;
    for (b2 = 4; b2 <= 6; b2++) {
      Dne(paramQnq, zKP.yIR.FWm, i, b2, 1, 4, paramCLK);
      Dne(paramQnq, zKP.yIR.FWm, i, b2, 2, 5, paramCLK);
      Dne(paramQnq, zKP.yIR.FWm, i, b2, 3, 6, paramCLK);
    } 
    b2 = 2;
    byte b3 = 0;
    byte b4 = 3;
    byte b5 = 1;
    switch (this.aFZ) {
      case 0:
        b2 = 0;
        b3 = 2;
        break;
      case 1:
        b2 = 1;
        b3 = 3;
        b4 = 0;
        b5 = 2;
        break;
      case 3:
        b2 = 3;
        b3 = 1;
        b4 = 0;
        b5 = 2;
        break;
    } 
    Dne(paramQnq, zKP.dBc.FWm, b2 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 4, 3, 8, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b2 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 5, 3, 8, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b2 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 6, 3, 8, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b3 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 4, 3, 12, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b3 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 5, 3, 12, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b3 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 6, 3, 12, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b4 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 3, 3, 9, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b4 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 3, 3, 10, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b4 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 3, 3, 11, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b5 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 7, 3, 9, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b5 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 7, 3, 10, paramCLK);
    Dne(paramQnq, zKP.dBc.FWm, b5 + ((paramRandom.nextFloat() > 0.9F) ? 4 : 0), 7, 3, 11, paramCLK);
    if (!this.Dne) {
      int j = Dne(3);
      int k = Dne(5, 6);
      int m = FWm(5, 6);
      if (paramCLK.Dne(k, j, m)) {
        this.Dne = true;
        paramQnq.FWm(k, j, m, zKP.eJi.FWm, 0, 2);
        ySb ySb = (ySb)paramQnq.Dne(k, j, m);
        if (ySb != null)
          ySb.Dne().Dne("Silverfish"); 
      } 
    } 
    return true;
  }
  
  public static DVF Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -4, -1, 0, 11, 8, 16, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new DVF(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    if (parambvz != null)
      ((Kci)parambvz).Dne = (ArrayList)this; 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DVF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */