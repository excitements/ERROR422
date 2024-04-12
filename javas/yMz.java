import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class yMz extends tgc {
  private float Dne;
  
  private float FWm;
  
  private OdI Dne;
  
  public float[] FWm(float[] paramArrayOffloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramArrayOffloat == null || paramArrayOffloat.length < paramInt3 * paramInt4)
      paramArrayOffloat = new float[paramInt3 * paramInt4]; 
    Arrays.fill(paramArrayOffloat, 0, paramInt3 * paramInt4, this.Dne);
    return paramArrayOffloat;
  }
  
  public OdI[] Dne(OdI[] paramArrayOfOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    return FWm(paramArrayOfOdI, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public EyB Dne(int paramInt1, int paramInt2, int paramInt3, List paramList, Random paramRandom) {
    return paramList.contains(this.Dne) ? new EyB(paramInt1 - paramInt3 + paramRandom.nextInt(paramInt3 * 2 + 1), 0, paramInt2 - paramInt3 + paramRandom.nextInt(paramInt3 * 2 + 1)) : null;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, List paramList) {
    return paramList.contains(this.Dne);
  }
  
  public OdI[] FWm(OdI[] paramArrayOfOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramArrayOfOdI == null || paramArrayOfOdI.length < paramInt3 * paramInt4)
      paramArrayOfOdI = new OdI[paramInt3 * paramInt4]; 
    Arrays.fill((Object[])paramArrayOfOdI, 0, paramInt3 * paramInt4, this.Dne);
    return paramArrayOfOdI;
  }
  
  public yMz(OdI paramOdI, float paramFloat1, float paramFloat2) {
    this.Dne = paramOdI;
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
  }
  
  public float[] Dne(float[] paramArrayOffloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramArrayOffloat == null || paramArrayOffloat.length < paramInt3 * paramInt4)
      paramArrayOffloat = new float[paramInt3 * paramInt4]; 
    Arrays.fill(paramArrayOffloat, 0, paramInt3 * paramInt4, this.FWm);
    return paramArrayOffloat;
  }
  
  public OdI[] Dne(OdI[] paramArrayOfOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramArrayOfOdI == null || paramArrayOfOdI.length < paramInt3 * paramInt4)
      paramArrayOfOdI = new OdI[paramInt3 * paramInt4]; 
    Arrays.fill((Object[])paramArrayOfOdI, 0, paramInt3 * paramInt4, this.Dne);
    return paramArrayOfOdI;
  }
  
  public OdI Dne(int paramInt1, int paramInt2) {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yMz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */