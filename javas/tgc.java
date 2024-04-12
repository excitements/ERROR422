import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tgc {
  private vSL Dne;
  
  private List Dne;
  
  private yBi Dne = (yBi)new vSL(this);
  
  private yBi FWm;
  
  public List Dne() {
    return (List)this.Dne;
  }
  
  public float[] FWm(float[] paramArrayOffloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: invokestatic Dne : ()V
    //   3: aload_1
    //   4: ifnull -> 17
    //   7: aload_1
    //   8: arraylength
    //   9: iload #4
    //   11: iload #5
    //   13: imul
    //   14: if_icmpge -> 25
    //   17: iload #4
    //   19: iload #5
    //   21: imul
    //   22: newarray float
    //   24: astore_1
    //   25: aload_0
    //   26: getfield FWm : LyBi;
    //   29: iload_2
    //   30: iload_3
    //   31: iload #4
    //   33: iload #5
    //   35: invokevirtual Dne : (IIII)[I
    //   38: astore #6
    //   40: iconst_0
    //   41: istore #7
    //   43: iload #7
    //   45: iload #4
    //   47: iload #5
    //   49: imul
    //   50: if_icmpge -> 93
    //   53: getstatic OdI.Dne : [LOdI;
    //   56: aload #6
    //   58: iload #7
    //   60: iaload
    //   61: aaload
    //   62: invokevirtual FWm : ()I
    //   65: i2f
    //   66: ldc 65536.0
    //   68: fdiv
    //   69: fstore #8
    //   71: fload #8
    //   73: fconst_1
    //   74: fcmpl
    //   75: ifle -> 81
    //   78: fconst_1
    //   79: fstore #8
    //   81: aload_1
    //   82: iload #7
    //   84: fload #8
    //   86: fastore
    //   87: iinc #7, 1
    //   90: goto -> 43
    //   93: aload_1
    //   94: areturn
  }
  
  public EyB Dne(int paramInt1, int paramInt2, int paramInt3, List paramList, Random paramRandom) {
    Xyv.Dne();
    int i = paramInt1 - paramInt3 >> 2;
    int j = paramInt2 - paramInt3 >> 2;
    int k = paramInt1 + paramInt3 >> 2;
    int m = paramInt2 + paramInt3 >> 2;
    int n = k - i + 1;
    int i1 = m - j + 1;
    int[] arrayOfInt = this.Dne.Dne(i, j, n, i1);
    EyB eyB = null;
    byte b1 = 0;
    for (byte b2 = 0; b2 < n * i1; b2++) {
      int i2 = i + b2 % n << 2;
      int i3 = j + b2 / n << 2;
      boolean bool = OdI.Dne[arrayOfInt[b2]];
      if (paramList.contains(bool) && (eyB == null || paramRandom.nextInt(b1 + 1) == 0)) {
        eyB = new EyB(i2, 0, i3);
        b1++;
      } 
    } 
    return eyB;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, List paramList) {
    Xyv.Dne();
    int i = paramInt1 - paramInt3 >> 2;
    int j = paramInt2 - paramInt3 >> 2;
    int k = paramInt1 + paramInt3 >> 2;
    int m = paramInt2 + paramInt3 >> 2;
    int n = k - i + 1;
    int i1 = m - j + 1;
    int[] arrayOfInt = this.Dne.Dne(i, j, n, i1);
    for (byte b = 0; b < n * i1; b++) {
      boolean bool = OdI.Dne[arrayOfInt[b]];
      if (!paramList.contains(bool))
        return false; 
    } 
    return true;
  }
  
  public OdI[] Dne(OdI[] paramArrayOfOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    Xyv.Dne();
    if (paramArrayOfOdI == null || paramArrayOfOdI.length < paramInt3 * paramInt4)
      paramArrayOfOdI = new OdI[paramInt3 * paramInt4]; 
    if (paramBoolean && paramInt3 == 16 && paramInt4 == 16 && (paramInt1 & 0xF) == 0 && (paramInt2 & 0xF) == 0) {
      OdI[] arrayOfOdI = this.Dne.Dne(paramInt1, paramInt2);
      System.arraycopy(arrayOfOdI, 0, paramArrayOfOdI, 0, paramInt3 * paramInt4);
      return paramArrayOfOdI;
    } 
    int[] arrayOfInt = this.FWm.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    for (byte b = 0; b < paramInt3 * paramInt4; b++)
      paramArrayOfOdI[b] = OdI.Dne[arrayOfInt[b]]; 
    return paramArrayOfOdI;
  }
  
  public OdI[] FWm(OdI[] paramArrayOfOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Dne(paramArrayOfOdI, paramInt1, paramInt2, paramInt3, paramInt4, true);
  }
  
  public OdI Dne(int paramInt1, int paramInt2) {
    return this.Dne.Dne(paramInt1, paramInt2);
  }
  
  public OdI[] Dne(OdI[] paramArrayOfOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Xyv.Dne();
    if (paramArrayOfOdI == null || paramArrayOfOdI.length < paramInt3 * paramInt4)
      paramArrayOfOdI = new OdI[paramInt3 * paramInt4]; 
    int[] arrayOfInt = this.Dne.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    for (byte b = 0; b < paramInt3 * paramInt4; b++)
      paramArrayOfOdI[b] = OdI.Dne[arrayOfInt[b]]; 
    return paramArrayOfOdI;
  }
  
  protected tgc() {
    this.Dne = (yBi)new ArrayList();
    this.Dne.add(OdI.aFZ);
    this.Dne.add(OdI.FWm);
    this.Dne.add(OdI.zGp);
    this.Dne.add(OdI.ceE);
    this.Dne.add(OdI.Vxn);
    this.Dne.add(OdI.FfS);
    this.Dne.add(OdI.OdI);
  }
  
  public tgc(long paramLong, kGO paramkGO) {
    this();
    yBi[] arrayOfYBi = yBi.Dne(paramLong, paramkGO);
    this.Dne = arrayOfYBi[0];
    this.FWm = arrayOfYBi[1];
  }
  
  public void Dne() {
    this.Dne.Dne();
  }
  
  public tgc(Qnq paramQnq) {
    this(paramQnq.Dne(), paramQnq.Dne().Dne());
  }
  
  public float Dne(float paramFloat, int paramInt) {
    return paramFloat;
  }
  
  public float[] Dne(float[] paramArrayOffloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: invokestatic Dne : ()V
    //   3: aload_1
    //   4: ifnull -> 17
    //   7: aload_1
    //   8: arraylength
    //   9: iload #4
    //   11: iload #5
    //   13: imul
    //   14: if_icmpge -> 25
    //   17: iload #4
    //   19: iload #5
    //   21: imul
    //   22: newarray float
    //   24: astore_1
    //   25: aload_0
    //   26: getfield FWm : LyBi;
    //   29: iload_2
    //   30: iload_3
    //   31: iload #4
    //   33: iload #5
    //   35: invokevirtual Dne : (IIII)[I
    //   38: astore #6
    //   40: iconst_0
    //   41: istore #7
    //   43: iload #7
    //   45: iload #4
    //   47: iload #5
    //   49: imul
    //   50: if_icmpge -> 93
    //   53: getstatic OdI.Dne : [LOdI;
    //   56: aload #6
    //   58: iload #7
    //   60: iaload
    //   61: aaload
    //   62: invokevirtual Dne : ()I
    //   65: i2f
    //   66: ldc 65536.0
    //   68: fdiv
    //   69: fstore #8
    //   71: fload #8
    //   73: fconst_1
    //   74: fcmpl
    //   75: ifle -> 81
    //   78: fconst_1
    //   79: fstore #8
    //   81: aload_1
    //   82: iload #7
    //   84: fload #8
    //   86: fastore
    //   87: iinc #7, 1
    //   90: goto -> 43
    //   93: aload_1
    //   94: areturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tgc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */