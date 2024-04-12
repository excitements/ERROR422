import java.util.List;
import java.util.Random;

abstract class oeq extends bvz {
  protected bvz FWm(Kci paramKci, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 1, Dne());
      case 1:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.bzF - 1, 2, Dne());
      case 2:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 1, Dne());
      case 3:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.bzF - 1, 2, Dne());
    } 
    return null;
  }
  
  protected bvz Dne(Kci paramKci, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne + paramInt1, this.Dne.FWm + paramInt2, this.Dne.zGp + 1, this.aFZ, Dne());
      case 1:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + paramInt2, this.Dne.bzF + paramInt1, this.aFZ, Dne());
      case 2:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne + paramInt1, this.Dne.FWm + paramInt2, this.Dne.bzF - 1, this.aFZ, Dne());
      case 3:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + paramInt2, this.Dne.bzF + paramInt1, this.aFZ, Dne());
    } 
    return null;
  }
  
  protected oeq(int paramInt) {
    super(paramInt);
  }
  
  protected RLF Dne(Random paramRandom) {
    int i = paramRandom.nextInt(5);
    switch (i) {
      default:
        return (RLF)RLF.Dne;
      case 2:
        return RLF.FWm;
      case 3:
        return RLF.bzF;
      case 4:
        break;
    } 
    return RLF.Qnq;
  }
  
  protected static boolean Dne(CLK paramCLK) {
    return (paramCLK != null && paramCLK.FWm > 10);
  }
  
  protected void Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK, RLF paramRLF, int paramInt1, int paramInt2, int paramInt3) {
    switch (JDV.Dne[paramRLF.ordinal()]) {
      default:
        Dne(paramQnq, paramCLK, paramInt1, paramInt2, paramInt3, paramInt1 + 3 - 1, paramInt2 + 3 - 1, paramInt3, 0, 0, false);
        return;
      case 2:
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1, paramInt2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1, paramInt2 + 1, paramInt3, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1, paramInt2 + 2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 1, paramInt2 + 2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 2, paramInt2 + 2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 2, paramInt2 + 1, paramInt3, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 2, paramInt2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.ICU.FWm, 0, paramInt1 + 1, paramInt2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.ICU.FWm, 8, paramInt1 + 1, paramInt2 + 1, paramInt3, paramCLK);
        return;
      case 3:
        Dne(paramQnq, 0, 0, paramInt1 + 1, paramInt2, paramInt3, paramCLK);
        Dne(paramQnq, 0, 0, paramInt1 + 1, paramInt2 + 1, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1, paramInt2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1, paramInt2 + 1, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1, paramInt2 + 2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1 + 1, paramInt2 + 2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1 + 2, paramInt2 + 2, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1 + 2, paramInt2 + 1, paramInt3, paramCLK);
        Dne(paramQnq, zKP.Sdr.FWm, 0, paramInt1 + 2, paramInt2, paramInt3, paramCLK);
        return;
      case 4:
        break;
    } 
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1, paramInt2, paramInt3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1, paramInt2 + 1, paramInt3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1, paramInt2 + 2, paramInt3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 1, paramInt2 + 2, paramInt3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 2, paramInt2 + 2, paramInt3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 2, paramInt2 + 1, paramInt3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, paramInt1 + 2, paramInt2, paramInt3, paramCLK);
    Dne(paramQnq, zKP.IYC.FWm, 0, paramInt1 + 1, paramInt2, paramInt3, paramCLK);
    Dne(paramQnq, zKP.IYC.FWm, 8, paramInt1 + 1, paramInt2 + 1, paramInt3, paramCLK);
    Dne(paramQnq, zKP.LoG.FWm, bzF(zKP.LoG.FWm, 4), paramInt1 + 2, paramInt2 + 1, paramInt3 + 1, paramCLK);
    Dne(paramQnq, zKP.LoG.FWm, bzF(zKP.LoG.FWm, 3), paramInt1 + 2, paramInt2 + 1, paramInt3 - 1, paramCLK);
  }
  
  protected bvz bzF(Kci paramKci, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 3, Dne());
      case 1:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.zGp + 1, 0, Dne());
      case 2:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 3, Dne());
      case 3:
        return dlc.Dne(paramKci, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.zGp + 1, 0, Dne());
    } 
    return null;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oeq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */