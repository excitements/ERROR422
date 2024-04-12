public class tYH {
  int bzF;
  
  int mrb;
  
  int Dne;
  
  int IjH;
  
  long[] Dne;
  
  int DyG;
  
  long Dne;
  
  int zGp;
  
  int XHL;
  
  int FWm;
  
  public int div;
  
  byte[] Dne;
  
  int Qnq;
  
  int aFZ;
  
  byte[] FWm;
  
  int[] Dne;
  
  long FWm = new byte[282];
  
  private int Zpi;
  
  public int Dne(aHQ paramaHQ) {
    int[] arrayOfInt1 = paramaHQ.Dne;
    int[] arrayOfInt2 = paramaHQ.Dne;
    byte[] arrayOfByte = paramaHQ.FWm;
    int i = paramaHQ.bzF;
    int j = paramaHQ.Qnq;
    byte b = 0;
    int k = paramaHQ.Dne();
    int m = paramaHQ.FWm();
    int n = paramaHQ.bzF();
    int i1 = paramaHQ.Qnq();
    long l = paramaHQ.Dne();
    int i2 = paramaHQ.aFZ();
    int i3 = paramaHQ.zGp();
    int i4 = arrayOfInt1[arrayOfInt2 + 26] & 0xFF;
    int i5 = this.zGp;
    int i6 = this.Zpi;
    if (i6 != 0) {
      this.FWm -= i6;
      if (this.FWm != 0L)
        System.arraycopy(this.Dne, i6, this.Dne, 0, this.FWm); 
      this.Zpi = 0;
    } 
    if (i5 != 0) {
      if (this.Qnq - i5 != 0) {
        System.arraycopy(this.Dne, i5, this.Dne, 0, this.Qnq - i5);
        System.arraycopy(this.Dne, i5, this.Dne, 0, this.Qnq - i5);
      } 
      this.Qnq -= i5;
      this.aFZ -= i5;
      this.zGp = 0;
    } 
    if (i2 != this.mrb)
      return -1; 
    if (k > 0)
      return -1; 
    bzF(i4 + 1);
    if (i3 != this.XHL) {
      for (i5 = this.aFZ; i5 < this.Qnq; i5++)
        this.FWm -= this.Dne[i5] & 0xFF; 
      this.Qnq = this.aFZ;
      if (this.XHL != -1) {
        this.Dne[this.Qnq++] = 1024;
        this.aFZ++;
      } 
      if (m != 0) {
        n = 0;
        while (b < i4) {
          i6 = arrayOfInt1[arrayOfInt2 + 27 + b] & 0xFF;
          i += i6;
          j -= i6;
          if (i6 < 255) {
            b++;
            break;
          } 
          b++;
        } 
      } 
    } 
    if (j != 0) {
      FWm(j);
      System.arraycopy(arrayOfByte, i, this.Dne, this.FWm, j);
      this.FWm += j;
    } 
    i5 = -1;
    while (b < i4) {
      i6 = arrayOfInt1[arrayOfInt2 + 27 + b] & 0xFF;
      this.Dne[this.Qnq] = i6;
      this.Dne[this.Qnq] = -1L;
      if (n != 0) {
        this.Dne[this.Qnq] = this.Dne[this.Qnq] | 0x100;
        n = 0;
      } 
      if (i6 < 255)
        i5 = this.Qnq; 
      this.Qnq++;
      b++;
      if (i6 < 255)
        this.aFZ = this.Qnq; 
    } 
    if (i5 != -1)
      this.Dne[i5] = l; 
    if (i1 != 0) {
      this.div = 1;
      if (this.Qnq > 0)
        this.Dne[this.Qnq - 1] = this.Dne[this.Qnq - 1] | 0x200; 
    } 
    this.XHL = i3 + 1;
    return 0;
  }
  
  public int FWm(aHQ paramaHQ) {
    byte b2 = 0;
    byte b3 = (this.Qnq > 255) ? 255 : this.Qnq;
    int i = 0;
    int j = 0;
    int k = this.Dne[0];
    if (!b3)
      return 0; 
    if (this.IjH == 0) {
      long l = 0L;
      for (b2 = 0; b2 < b3; b2++) {
        if ((this.Dne[b2] & 0xFF) < 255) {
          b2++;
          break;
        } 
      } 
    } else {
      for (b2 = 0; b2 < b3 && j <= 4096; b2++) {
        j += this.Dne[b2] & 0xFF;
        k = this.Dne[b2];
      } 
    } 
    System.arraycopy("OggS".getBytes(), 0, this.FWm, 0, 4);
    this.FWm[4] = 0L;
    this.FWm[5] = 0L;
    if ((this.Dne[0] & 0x100) == 0)
      this.FWm[5] = (byte)(this.FWm[5] | 0x1); 
    if (this.IjH == 0)
      this.FWm[5] = (byte)(this.FWm[5] | 0x2); 
    if (this.div != 0 && this.Qnq == b2)
      this.FWm[5] = (byte)(this.FWm[5] | 0x4); 
    this.IjH = 1;
    byte b1;
    for (b1 = 6; b1 < 14; b1++) {
      this.FWm[b1] = (byte)(int)k;
      long l = k >>> 8L;
    } 
    int m = this.mrb;
    for (b1 = 14; b1 < 18; b1++) {
      this.FWm[b1] = (byte)m;
      m >>>= 8;
    } 
    if (this.XHL == -1)
      this.XHL = 0; 
    m = this.XHL++;
    for (b1 = 18; b1 < 22; b1++) {
      this.FWm[b1] = (byte)m;
      m >>>= 8;
    } 
    this.FWm[22] = 0L;
    this.FWm[23] = 0L;
    this.FWm[24] = 0L;
    this.FWm[25] = 0L;
    this.FWm[26] = (byte)b2;
    for (b1 = 0; b1 < b2; b1++) {
      this.FWm[b1 + 27] = (byte)this.Dne[b1];
      i += this.FWm[b1 + 27] & 0xFF;
    } 
    paramaHQ.Dne = this.FWm;
    paramaHQ.Dne = false;
    paramaHQ.FWm = this.DyG = b2 + 27;
    paramaHQ.FWm = (byte[])this.Dne;
    paramaHQ.bzF = this.Zpi;
    paramaHQ.Qnq = i;
    this.Qnq -= b2;
    System.arraycopy(this.Dne, b2, this.Dne, 0, this.Qnq * 4);
    System.arraycopy(this.Dne, b2, this.Dne, 0, this.Qnq * 8);
    this.Zpi += i;
    paramaHQ.Dne();
    return 1;
  }
  
  void bzF(int paramInt) {
    if (this.bzF <= this.Qnq + paramInt) {
      this.bzF += paramInt + 32;
      int[] arrayOfInt = new int[this.bzF];
      System.arraycopy(this.Dne, 0, arrayOfInt, 0, this.Dne.length);
      this.Dne = arrayOfInt;
      long[] arrayOfLong = new long[this.bzF];
      System.arraycopy(this.Dne, 0, arrayOfLong, 0, this.Dne.length);
      this.Dne = (int[])arrayOfLong;
    } 
  }
  
  public void Dne(int paramInt) {
    if (this.Dne == null) {
      Dne();
    } else {
      byte b;
      for (b = 0; b < this.Dne.length; b++)
        this.Dne[b] = 0; 
      for (b = 0; b < this.Dne.length; b++)
        this.Dne[b] = 0; 
      for (b = 0; b < this.Dne.length; b++)
        this.Dne[b] = 0L; 
    } 
    this.mrb = paramInt;
  }
  
  tYH(int paramInt) {
    this();
    Dne(paramInt);
  }
  
  void FWm(int paramInt) {
    if (this.Dne <= this.FWm + paramInt) {
      this.Dne += paramInt + 1024;
      byte[] arrayOfByte = new byte[this.Dne];
      System.arraycopy(this.Dne, 0, arrayOfByte, 0, this.Dne.length);
      this.Dne = (int[])arrayOfByte;
    } 
  }
  
  public int FWm() {
    this.FWm = 0L;
    this.Zpi = 0;
    this.Qnq = 0;
    this.aFZ = 0;
    this.zGp = 0;
    this.DyG = 0;
    this.div = 0;
    this.IjH = 0;
    this.XHL = -1;
    this.Dne = 0L;
    this.FWm = 0L;
    return 0;
  }
  
  void Dne() {
    this.Dne = '䀀';
    this.Dne = (int[])new byte[this.Dne];
    this.bzF = 1024;
    this.Dne = new int[this.bzF];
    this.Dne = (int[])new long[this.bzF];
  }
  
  public int FWm(qlF paramqlF) {
    int i = this.zGp;
    if (this.aFZ <= i)
      return 0; 
    if ((this.Dne[i] & 0x400) != 0) {
      this.zGp++;
      this.Dne++;
      return -1;
    } 
    int j = this.Dne[i] & 0xFF;
    int k = 0;
    paramqlF.Dne = (byte[])this.Dne;
    paramqlF.Dne = this.Zpi;
    paramqlF.Qnq = this.Dne[i] & 0x200;
    paramqlF.bzF = this.Dne[i] & 0x100;
    for (k += j; j == 255; k += j) {
      int m = this.Dne[++i];
      j = m & 0xFF;
      if ((m & 0x200) != 0)
        paramqlF.Qnq = 512; 
    } 
    paramqlF.FWm = this.Dne;
    paramqlF.Dne = this.Dne[i];
    paramqlF.FWm = k;
    this.Zpi += k;
    this.zGp = i + 1;
    this.Dne++;
    return 1;
  }
  
  public int bzF(aHQ paramaHQ) {
    return ((this.div != 0 && this.Qnq != 0) || this.FWm - this.Zpi > 4096 || this.Qnq >= 255 || (this.Qnq != 0 && this.IjH == 0)) ? FWm(paramaHQ) : 0;
  }
  
  public int Dne() {
    return this.div;
  }
  
  public tYH() {
    Dne();
  }
  
  void bzF() {
    FWm();
  }
  
  public void FWm() {
    this.Dne = null;
    this.Dne = null;
    this.Dne = null;
  }
  
  public int Dne(qlF paramqlF) {
    int i = paramqlF.FWm / 255 + 1;
    if (this.Zpi != 0) {
      this.FWm -= this.Zpi;
      if (this.FWm != 0L)
        System.arraycopy(this.Dne, this.Zpi, this.Dne, 0, this.FWm); 
      this.Zpi = 0;
    } 
    FWm(paramqlF.FWm);
    bzF(i);
    System.arraycopy(paramqlF.Dne, paramqlF.Dne, this.Dne, this.FWm, paramqlF.FWm);
    this.FWm += paramqlF.FWm;
    byte b;
    for (b = 0; b < i - 1; b++) {
      this.Dne[this.Qnq + b] = 255;
      this.Dne[this.Qnq + b] = this.FWm;
    } 
    this.Dne[this.Qnq + b] = paramqlF.FWm % 255;
    this.Dne[this.Qnq + b] = paramqlF.Dne;
    ((tYH)paramqlF.Dne).FWm = this;
    this.Dne[this.Qnq] = this.Dne[this.Qnq] | 0x100;
    this.Qnq += i;
    this.Dne++;
    if (paramqlF.Qnq != 0)
      this.div = 1; 
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tYH.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */