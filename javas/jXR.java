import java.util.List;
import java.util.Random;

public class jXR extends bvz {
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 5, 0, 2, 7, 1, 0, 0, false);
    Dne(paramQnq, paramCLK, 0, 0, 7, 2, 2, 8, 0, 0, false);
    for (byte b = 0; b < 5; b++)
      Dne(paramQnq, paramCLK, 0, 5 - b - ((b < 4) ? 1 : 0), 2 + b, 2, 7 - b, 2 + b, 0, 0, false); 
    return true;
  }
  
  public jXR(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    int i = Dne();
    switch (this.aFZ) {
      case 0:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm, this.Dne.zGp + 1, 0, i);
        break;
      case 1:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, this.Dne.bzF, 1, i);
        break;
      case 2:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm, this.Dne.bzF - 1, 2, i);
        break;
      case 3:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, this.Dne.bzF, 3, i);
        break;
    } 
  }
  
  public static CLK Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    CLK cLK = new CLK(paramInt1, paramInt2 - 5, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
    switch (paramInt4) {
      case 0:
        cLK.Qnq = paramInt1 + 2;
        cLK.zGp = paramInt3 + 8;
        break;
      case 1:
        cLK.Dne = paramInt1 - 8;
        cLK.zGp = paramInt3 + 2;
        break;
      case 2:
        cLK.Qnq = paramInt1 + 2;
        cLK.bzF = paramInt3 - 8;
        break;
      case 3:
        cLK.Qnq = paramInt1 + 8;
        cLK.zGp = paramInt3 + 2;
        break;
    } 
    return (bvz.Dne(paramList, cLK) != null) ? null : cLK;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jXR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */