public class iwf {
  public static char[] Dne = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'a', 'b', 'c', 'd', 'e', 'f' };
  
  public static int Dne(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (0 > paramInt2 - paramInt1 - 4) ? 0 : (paramArrayOfbyte[paramInt1 + 3] << 24 | (paramArrayOfbyte[paramInt1 + 2] & 0xFF) << 16 | (paramArrayOfbyte[paramInt1 + 1] & 0xFF) << 8 | paramArrayOfbyte[paramInt1] & 0xFF);
  }
  
  public static String Dne(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2 - 1;
    int j;
    for (j = (paramInt1 > i) ? i : paramInt1; 0 != paramArrayOfbyte[j] && j < i; j++);
    return new String(paramArrayOfbyte, paramInt1, j - paramInt1);
  }
  
  public static String Dne(byte paramByte) {
    return "" + Dne[(paramByte & 0xF0) >>> 4] + Dne[paramByte & 0xF];
  }
  
  public static int Dne(byte[] paramArrayOfbyte, int paramInt) {
    return Dne(paramArrayOfbyte, paramInt, paramArrayOfbyte.length);
  }
  
  public static int FWm(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (0 > paramInt2 - paramInt1 - 4) ? 0 : (paramArrayOfbyte[paramInt1] << 24 | (paramArrayOfbyte[paramInt1 + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt1 + 2] & 0xFF) << 8 | paramArrayOfbyte[paramInt1 + 3] & 0xFF);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iwf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */