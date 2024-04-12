public class hqP extends yBi {
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        Dne((paramInt1 + b1), (paramInt2 + b));
        arrayOfInt[b1 + b * paramInt3] = (Dne(10) == 0) ? 1 : 0;
      } 
    } 
    if (paramInt1 > -paramInt3 && paramInt1 <= 0 && paramInt2 > -paramInt4 && paramInt2 <= 0)
      arrayOfInt[-paramInt1 + -paramInt2 * paramInt3] = 1; 
    return arrayOfInt;
  }
  
  public hqP(long paramLong) {
    super(paramLong);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hqP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */