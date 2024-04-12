import java.util.Random;

public class fPe extends JhS {
  public fPe(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    OdI odI = paramQnq.Dne(paramInt1 * 16 + 8, paramInt2 * 16 + 8);
    if (odI != OdI.FfS && odI != OdI.OdI) {
      if (odI == OdI.DyG) {
        Nle nle = new Nle(paramRandom, paramInt1 * 16, paramInt2 * 16);
        this.Dne.add(nle);
      } else {
        UeW ueW = new UeW(paramRandom, paramInt1 * 16, paramInt2 * 16);
        this.Dne.add(ueW);
      } 
    } else {
      sMe sMe = new sMe(paramRandom, paramInt1 * 16, paramInt2 * 16);
      this.Dne.add(sMe);
    } 
    Dne();
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fPe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */