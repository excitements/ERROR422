public class PRc {
  public int Dne;
  
  public int[] Dne;
  
  private static final int FWm = -130;
  
  private static byte[] FWm = "vorbis".getBytes();
  
  private static byte[] bzF = "Xiphophorus libVorbis I 20000508".getBytes();
  
  public byte[] Dne;
  
  public byte[][] Dne;
  
  public int Dne(qlF paramqlF) {
    qbC qbC = new qbC();
    qbC.Dne();
    if (FWm(qbC) != 0)
      return -130; 
    paramqlF.Dne = new byte[qbC.bzF()];
    paramqlF.Dne = false;
    paramqlF.FWm = qbC.bzF();
    System.arraycopy(qbC.Dne(), 0, paramqlF.Dne, 0, paramqlF.FWm);
    paramqlF.bzF = 0;
    paramqlF.Qnq = 0;
    paramqlF.Dne = 0L;
    return 0;
  }
  
  public void Dne(String paramString) {
    Dne(paramString.getBytes());
  }
  
  public void Dne() {
    this.Dne = (byte[][])null;
    this.Dne = false;
    this.Dne = null;
  }
  
  void FWm() {
    for (byte b = 0; b < this.Dne; b++)
      this.Dne[b] = null; 
    this.Dne = (byte[][])null;
    this.Dne = null;
  }
  
  public String Dne(int paramInt) {
    return (this.Dne <= paramInt) ? null : new String(this.Dne[paramInt], 0, (this.Dne[paramInt]).length - 1);
  }
  
  static boolean Dne(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      byte b1 = paramArrayOfbyte1[b];
      byte b2 = paramArrayOfbyte2[b];
      if (90 >= b1 && b1 >= 65)
        b1 = (byte)(b1 - 65 + 97); 
      if (90 >= b2 && b2 >= 65)
        b2 = (byte)(b2 - 65 + 97); 
      if (b1 != b2)
        return false; 
    } 
    return true;
  }
  
  public String Dne(String paramString, int paramInt) {
    int i = Dne(paramString.getBytes(), paramInt);
    if (i == -1)
      return null; 
    byte[] arrayOfByte = this.Dne[i];
    for (byte b = 0; b < this.Dne[i]; b++) {
      if (arrayOfByte[b] == 61)
        return new String(arrayOfByte, b + 1, this.Dne[i] - b + 1); 
    } 
    return null;
  }
  
  public void Dne(String paramString1, String paramString2) {
    if (paramString2 == null)
      paramString2 = ""; 
    Dne(paramString1 + "=" + paramString2);
  }
  
  private void Dne(byte[] paramArrayOfbyte) {
    byte[][] arrayOfByte = new byte[this.Dne + 2][];
    if (this.Dne != null)
      System.arraycopy(this.Dne, 0, arrayOfByte, 0, this.Dne); 
    this.Dne = arrayOfByte;
    int[] arrayOfInt = new int[this.Dne + 2];
    if (this.Dne != null)
      System.arraycopy(this.Dne, 0, arrayOfInt, 0, this.Dne); 
    this.Dne = (byte[][])arrayOfInt;
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + 1];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 0, paramArrayOfbyte.length);
    this.Dne[this.Dne] = arrayOfByte1;
    this.Dne[this.Dne] = paramArrayOfbyte.length;
    this.Dne++;
    this.Dne[this.Dne] = null;
  }
  
  public String Dne() {
    return new String((byte[])this.Dne, 0, this.Dne.length - 1);
  }
  
  public String Dne(String paramString) {
    return Dne(paramString, 0);
  }
  
  int FWm(qbC paramqbC) {
    paramqbC.Dne(3, 8);
    paramqbC.Dne(FWm);
    paramqbC.Dne(bzF.length, 32);
    paramqbC.Dne(bzF);
    paramqbC.Dne(this.Dne, 32);
    if (this.Dne != null)
      for (byte b = 0; b < this.Dne; b++) {
        if (this.Dne[b] != null) {
          paramqbC.Dne(this.Dne[b], 32);
          paramqbC.Dne(this.Dne[b]);
        } else {
          paramqbC.Dne(0, 32);
        } 
      }  
    paramqbC.Dne(1, 1);
    return 0;
  }
  
  private int Dne(byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = 0;
    byte b2 = 0;
    int i = paramArrayOfbyte.length + 1;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    arrayOfByte[paramArrayOfbyte.length] = 61;
    for (b1 = 0; b1 < this.Dne; b1++) {
      if (Dne(this.Dne[b1], arrayOfByte, i)) {
        if (paramInt == b2)
          return b1; 
        b2++;
      } 
    } 
    return -1;
  }
  
  int Dne(qbC paramqbC) {
    int i = paramqbC.FWm(32);
    if (i < 0) {
      FWm();
      return -1;
    } 
    this.Dne = (byte[][])new byte[i + 1];
    paramqbC.Dne((byte[])this.Dne, i);
    this.Dne = paramqbC.FWm(32);
    if (this.Dne < null) {
      FWm();
      return -1;
    } 
    this.Dne = new byte[this.Dne + 1][];
    this.Dne = (byte[][])new int[this.Dne + 1];
    for (byte b = 0; b < this.Dne; b++) {
      int j = paramqbC.FWm(32);
      if (j < 0) {
        FWm();
        return -1;
      } 
      this.Dne[b] = j;
      this.Dne[b] = new byte[j + 1];
      paramqbC.Dne(this.Dne[b], j);
    } 
    if (paramqbC.FWm(1) != 1) {
      FWm();
      return -1;
    } 
    return 0;
  }
  
  public String toString() {
    null = "Vendor: " + new String((byte[])this.Dne, 0, this.Dne.length - 1);
    for (byte b = 0; b < this.Dne; b++)
      null = null + "\nComment: " + new String(this.Dne[b], 0, (this.Dne[b]).length - 1); 
    return null + "\n";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PRc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */