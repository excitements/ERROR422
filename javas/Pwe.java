import java.util.List;
import java.util.Random;

public class Pwe extends iDn {
  private int Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Random random = new Random(this.Dne);
    int i;
    for (i = 0; i <= 4; i++) {
      for (byte b = 3; b <= 4; b++) {
        int j = random.nextInt(8);
        Dne(paramQnq, paramCLK, i, b, 0, i, b, j, zKP.iNH.FWm, zKP.iNH.FWm, false);
      } 
    } 
    i = random.nextInt(8);
    Dne(paramQnq, paramCLK, 0, 5, 0, 0, 5, i, zKP.iNH.FWm, zKP.iNH.FWm, false);
    i = random.nextInt(8);
    Dne(paramQnq, paramCLK, 4, 5, 0, 4, 5, i, zKP.iNH.FWm, zKP.iNH.FWm, false);
    for (i = 0; i <= 4; i++) {
      int j = random.nextInt(5);
      Dne(paramQnq, paramCLK, i, 2, 0, i, 2, j, zKP.iNH.FWm, zKP.iNH.FWm, false);
    } 
    for (i = 0; i <= 4; i++) {
      for (byte b = 0; b <= 1; b++) {
        int j = random.nextInt(3);
        Dne(paramQnq, paramCLK, i, b, 0, i, b, j, zKP.iNH.FWm, zKP.iNH.FWm, false);
      } 
    } 
    return true;
  }
  
  public Pwe(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.Dne = paramRandom.nextInt();
  }
  
  public static Pwe Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -3, 0, 5, 10, 8, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new Pwe(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Pwe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */