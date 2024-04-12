public class qbC {
  int FWm;
  
  int Dne;
  
  private static final int[] Dne;
  
  private static final int aFZ = 256;
  
  int bzF;
  
  int Qnq;
  
  byte[] Dne = false;
  
  public void bzF() {
    this.Dne = null;
  }
  
  public qbC() {
    this.Dne = null;
    this.FWm = 0;
    this.bzF = 0;
    this.Qnq = 0;
  }
  
  public static int Qnq(int paramInt) {
    byte b = 0;
    while (paramInt > 0) {
      b++;
      paramInt >>>= 1;
    } 
    return b;
  }
  
  public int Dne(int paramInt) {
    byte b = Dne[paramInt];
    paramInt += this.FWm;
    if (this.bzF + 4 >= this.Qnq && this.bzF + (paramInt - 1) / 8 >= this.Qnq)
      return -1; 
    int i = (this.Dne[this.Dne] & 0xFF) >>> this.FWm;
    if (paramInt > 8) {
      i |= (this.Dne[this.Dne + 1] & 0xFF) << 8 - this.FWm;
      if (paramInt > 16) {
        i |= (this.Dne[this.Dne + 2] & 0xFF) << 16 - this.FWm;
        if (paramInt > 24) {
          i |= (this.Dne[this.Dne + 3] & 0xFF) << 24 - this.FWm;
          if (paramInt > 32 && this.FWm != 0)
            i |= (this.Dne[this.Dne + 4] & 0xFF) << 32 - this.FWm; 
        } 
      } 
    } 
    return b & i;
  }
  
  public int FWm() {
    if (this.bzF >= this.Qnq) {
      byte b = -1;
      this.FWm++;
      if (this.FWm > 7) {
        this.FWm = 0;
        this.Dne++;
        this.bzF++;
      } 
      return b;
    } 
    int i = this.Dne[this.Dne] >> this.FWm & 0x1;
    this.FWm++;
    if (this.FWm > 7) {
      this.FWm = 0;
      this.Dne++;
      this.bzF++;
    } 
    return i;
  }
  
  public void Qnq() {
    this.FWm++;
    if (this.FWm > 7) {
      this.FWm = 0;
      this.Dne++;
      this.bzF++;
    } 
  }
  
  public static void Dne(String paramString) {
    System.err.println(paramString);
    System.exit(1);
  }
  
  public void FWm(byte[] paramArrayOfbyte, int paramInt) {
    Dne(paramArrayOfbyte, 0, paramInt);
  }
  
  public void Dne(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.Dne = paramArrayOfbyte;
    this.FWm = this.bzF = 0;
    this.Qnq = paramInt2;
  }
  
  void FWm() {
    this.Dne = false;
    this.Dne[0] = 0;
    this.FWm = this.bzF = 0;
  }
  
  public void Dne(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length && paramArrayOfbyte[b] != 0; b++)
      Dne(paramArrayOfbyte[b], 8); 
  }
  
  public int Dne() {
    return (this.bzF >= this.Qnq) ? -1 : (this.Dne[this.Dne] >> this.FWm & 0x1);
  }
  
  public void Dne() {
    this.Dne = new byte[256];
    this.Dne = false;
    this.Dne[0] = 0;
    this.Qnq = 256;
  }
  
  public int bzF(int paramInt) {
    int j = 32 - paramInt;
    paramInt += this.FWm;
    if (this.bzF + 4 >= this.Qnq) {
      byte b = -1;
      if (this.bzF * 8 + paramInt > this.Qnq * 8) {
        this.Dne += paramInt / 8;
        this.bzF += paramInt / 8;
        this.FWm = paramInt & 0x7;
        return b;
      } 
    } 
    int i = (this.Dne[this.Dne] & 0xFF) << 24 + this.FWm;
    if (paramInt > 8) {
      i |= (this.Dne[this.Dne + 1] & 0xFF) << 16 + this.FWm;
      if (paramInt > 16) {
        i |= (this.Dne[this.Dne + 2] & 0xFF) << 8 + this.FWm;
        if (paramInt > 24) {
          i |= (this.Dne[this.Dne + 3] & 0xFF) << this.FWm;
          if (paramInt > 32 && this.FWm != 0)
            i |= (this.Dne[this.Dne + 4] & 0xFF) >> 8 - this.FWm; 
        } 
      } 
    } 
    i = i >>> j >> 1 >>> j + 1 >> 1;
    this.Dne += paramInt / 8;
    this.bzF += paramInt / 8;
    this.FWm = paramInt & 0x7;
    return i;
  }
  
  public int Qnq() {
    return this.bzF * 8 + this.FWm;
  }
  
  public void Dne(int paramInt) {
    paramInt += this.FWm;
    this.Dne += paramInt / 8;
    this.bzF += paramInt / 8;
    this.FWm = paramInt & 0x7;
  }
  
  public byte[] Dne() {
    return this.Dne;
  }
  
  public void Dne(byte[] paramArrayOfbyte, int paramInt) {
    byte b = 0;
    while (paramInt-- != 0)
      paramArrayOfbyte[b++] = (byte)FWm(8); 
  }
  
  public int bzF() {
    return this.bzF + (this.FWm + 7) / 8;
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    if (this.bzF + 4 >= this.Qnq) {
      byte[] arrayOfByte = new byte[this.Qnq + 256];
      System.arraycopy(this.Dne, 0, arrayOfByte, 0, this.Qnq);
      this.Dne = arrayOfByte;
      this.Qnq += 256;
    } 
    paramInt1 &= Dne[paramInt2];
    paramInt2 += this.FWm;
    this.Dne[this.Dne] = (byte)(this.Dne[this.Dne] | (byte)(paramInt1 << this.FWm));
    if (paramInt2 >= 8) {
      this.Dne[this.Dne + 1] = (byte)(paramInt1 >>> 8 - this.FWm);
      if (paramInt2 >= 16) {
        this.Dne[this.Dne + 2] = (byte)(paramInt1 >>> 16 - this.FWm);
        if (paramInt2 >= 24) {
          this.Dne[this.Dne + 3] = (byte)(paramInt1 >>> 24 - this.FWm);
          if (paramInt2 >= 32)
            if (this.FWm > 0) {
              this.Dne[this.Dne + 4] = (byte)(paramInt1 >>> 32 - this.FWm);
            } else {
              this.Dne[this.Dne + 4] = 0;
            }  
        } 
      } 
    } 
    this.bzF += paramInt2 / 8;
    this.Dne += paramInt2 / 8;
    this.FWm = paramInt2 & 0x7;
  }
  
  static {
    Dne = (byte[])new int[] { 
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 
        1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 
        1073741823, Integer.MAX_VALUE, -1 };
  }
  
  public int FWm(int paramInt) {
    byte b = Dne[paramInt];
    paramInt += this.FWm;
    if (this.bzF + 4 >= this.Qnq) {
      byte b1 = -1;
      if (this.bzF + (paramInt - 1) / 8 >= this.Qnq) {
        this.Dne += paramInt / 8;
        this.bzF += paramInt / 8;
        this.FWm = paramInt & 0x7;
        return b1;
      } 
    } 
    int i = (this.Dne[this.Dne] & 0xFF) >>> this.FWm;
    if (paramInt > 8) {
      i |= (this.Dne[this.Dne + 1] & 0xFF) << 8 - this.FWm;
      if (paramInt > 16) {
        i |= (this.Dne[this.Dne + 2] & 0xFF) << 16 - this.FWm;
        if (paramInt > 24) {
          i |= (this.Dne[this.Dne + 3] & 0xFF) << 24 - this.FWm;
          if (paramInt > 32 && this.FWm != 0)
            i |= (this.Dne[this.Dne + 4] & 0xFF) << 32 - this.FWm; 
        } 
      } 
    } 
    i &= b;
    this.Dne += paramInt / 8;
    this.bzF += paramInt / 8;
    this.FWm = paramInt & 0x7;
    return i;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qbC.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */