public class aHQ {
  public int bzF;
  
  public int FWm;
  
  public byte[] Dne;
  
  public int Dne;
  
  private static int[] Dne = new int[256];
  
  public byte[] FWm;
  
  public int Qnq;
  
  int FWm() {
    return this.Dne[this.Dne + 5] & 0x1;
  }
  
  public aHQ Dne() {
    return Dne(new aHQ());
  }
  
  static {
    for (byte b = 0; b < Dne.length; b++)
      Dne[b] = Dne(b); 
  }
  
  public aHQ Dne(aHQ paramaHQ) {
    byte[] arrayOfByte = new byte[this.FWm];
    System.arraycopy(this.Dne, this.Dne, arrayOfByte, 0, this.FWm);
    paramaHQ.FWm = this.FWm;
    paramaHQ.Dne = (int[])arrayOfByte;
    paramaHQ.Dne = false;
    arrayOfByte = new byte[this.Qnq];
    System.arraycopy(this.FWm, this.bzF, arrayOfByte, 0, this.Qnq);
    paramaHQ.Qnq = this.Qnq;
    paramaHQ.FWm = arrayOfByte;
    paramaHQ.bzF = 0;
    return paramaHQ;
  }
  
  public int bzF() {
    return this.Dne[this.Dne + 5] & 0x2;
  }
  
  public int Qnq() {
    return this.Dne[this.Dne + 5] & 0x4;
  }
  
  public long Dne() {
    null = (this.Dne[this.Dne + 13] & 0xFF);
    null = null << 8L | (this.Dne[this.Dne + 12] & 0xFF);
    null = null << 8L | (this.Dne[this.Dne + 11] & 0xFF);
    null = null << 8L | (this.Dne[this.Dne + 10] & 0xFF);
    null = null << 8L | (this.Dne[this.Dne + 9] & 0xFF);
    null = null << 8L | (this.Dne[this.Dne + 8] & 0xFF);
    null = null << 8L | (this.Dne[this.Dne + 7] & 0xFF);
    return null << 8L | (this.Dne[this.Dne + 6] & 0xFF);
  }
  
  int zGp() {
    return this.Dne[this.Dne + 18] & 0xFF | (this.Dne[this.Dne + 19] & 0xFF) << 8 | (this.Dne[this.Dne + 20] & 0xFF) << 16 | (this.Dne[this.Dne + 21] & 0xFF) << 24;
  }
  
  void Dne() {
    int i = 0;
    byte b;
    for (b = 0; b < this.FWm; b++)
      i = i << 8 ^ Dne[i >>> 24 & 0xFF ^ this.Dne[this.Dne + b] & 0xFF]; 
    for (b = 0; b < this.Qnq; b++)
      i = i << 8 ^ Dne[i >>> 24 & 0xFF ^ this.FWm[this.bzF + b] & 0xFF]; 
    this.Dne[this.Dne + 22] = (byte)i;
    this.Dne[this.Dne + 23] = (byte)(i >>> 8);
    this.Dne[this.Dne + 24] = (byte)(i >>> 16);
    this.Dne[this.Dne + 25] = (byte)(i >>> 24);
  }
  
  private static int Dne(int paramInt) {
    int i = paramInt << 24;
    for (byte b = 0; b < 8; b++) {
      if ((i & Integer.MIN_VALUE) != 0) {
        i = i << 1 ^ 0x4C11DB7;
      } else {
        i <<= 1;
      } 
    } 
    return i & 0xFFFFFFFF;
  }
  
  public int aFZ() {
    return this.Dne[this.Dne + 14] & 0xFF | (this.Dne[this.Dne + 15] & 0xFF) << 8 | (this.Dne[this.Dne + 16] & 0xFF) << 16 | (this.Dne[this.Dne + 17] & 0xFF) << 24;
  }
  
  int Dne() {
    return this.Dne[this.Dne + 4] & 0xFF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aHQ.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */