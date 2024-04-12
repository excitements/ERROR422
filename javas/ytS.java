public class ytS {
  int bzF;
  
  int Dne;
  
  int FWm;
  
  int aFZ;
  
  int Qnq;
  
  private byte[] FWm = new byte[4];
  
  private aHQ Dne;
  
  public byte[] Dne = (byte[])new aHQ();
  
  int zGp;
  
  public int Qnq() {
    return this.FWm;
  }
  
  public int FWm(int paramInt) {
    if (this.FWm + paramInt > this.Dne)
      return -1; 
    this.FWm += paramInt;
    return 0;
  }
  
  public int Dne() {
    this.Dne = null;
    return 0;
  }
  
  public void Dne() {}
  
  public int FWm(aHQ paramaHQ) {
    while (true) {
      int i = Dne(paramaHQ);
      if (i > 0)
        return 1; 
      if (i == 0)
        return 0; 
      if (this.Qnq == 0) {
        this.Qnq = 1;
        return -1;
      } 
    } 
  }
  
  public int Dne(aHQ paramaHQ) {
    int i = this.bzF;
    int j = this.FWm - this.bzF;
    if (this.aFZ == 0) {
      if (j < 27)
        return 0; 
      if (this.Dne[i] != 79 || this.Dne[i + 1] != 103 || this.Dne[i + 2] != 103 || this.Dne[i + 3] != 83) {
        byte[] arrayOfByte;
        this.aFZ = 0;
        this.zGp = 0;
        int m = 0;
        for (byte b1 = 0; b1 < j - 1; b1++) {
          if (this.Dne[i + 1 + b1] == 79) {
            m = i + 1 + b1;
            break;
          } 
        } 
        if (m == 0)
          arrayOfByte = this.FWm; 
        this.bzF = arrayOfByte;
        return -(arrayOfByte - i);
      } 
      int k = (this.Dne[i + 26] & 0xFF) + 27;
      if (j < k)
        return 0; 
      for (byte b = 0; b < (this.Dne[i + 26] & 0xFF); b++)
        this.zGp += this.Dne[i + 27 + b] & 0xFF; 
      this.aFZ = k;
    } 
    if (this.zGp + this.aFZ > j)
      return 0; 
    synchronized (this.FWm) {
      System.arraycopy(this.Dne, i + 22, this.FWm, 0, 4);
      this.Dne[i + 22] = 0;
      this.Dne[i + 23] = 0;
      this.Dne[i + 24] = 0;
      this.Dne[i + 25] = 0;
      byte[] arrayOfByte = this.Dne;
      ((aHQ)arrayOfByte).Dne = (int[])this.Dne;
      ((aHQ)arrayOfByte).Dne = i;
      ((aHQ)arrayOfByte).FWm = this.aFZ;
      ((aHQ)arrayOfByte).FWm = this.Dne;
      ((aHQ)arrayOfByte).bzF = i + this.aFZ;
      ((aHQ)arrayOfByte).Qnq = this.zGp;
      arrayOfByte.Dne();
      if (this.FWm[0] != this.Dne[i + 22] || this.FWm[1] != this.Dne[i + 23] || this.FWm[2] != this.Dne[i + 24] || this.FWm[3] != this.Dne[i + 25]) {
        byte[] arrayOfByte1;
        System.arraycopy(this.FWm, 0, this.Dne, i + 22, 4);
        this.aFZ = 0;
        this.zGp = 0;
        int k = 0;
        for (byte b = 0; b < j - 1; b++) {
          if (this.Dne[i + 1 + b] == 79) {
            k = i + 1 + b;
            break;
          } 
        } 
        if (k == 0)
          arrayOfByte1 = this.FWm; 
        this.bzF = arrayOfByte1;
        return -(arrayOfByte1 - i);
      } 
    } 
    i = this.bzF;
    if (paramaHQ != null) {
      paramaHQ.Dne = (int[])this.Dne;
      paramaHQ.Dne = i;
      paramaHQ.FWm = this.aFZ;
      paramaHQ.FWm = this.Dne;
      paramaHQ.bzF = i + this.aFZ;
      paramaHQ.Qnq = this.zGp;
    } 
    this.Qnq = 0;
    this.bzF += j = this.aFZ + this.zGp;
    this.aFZ = 0;
    this.zGp = 0;
    return j;
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  public int FWm() {
    this.FWm = false;
    this.bzF = 0;
    this.Qnq = 0;
    this.aFZ = 0;
    this.zGp = 0;
    return 0;
  }
  
  public int Dne(int paramInt) {
    if (this.bzF != 0) {
      this.FWm -= this.bzF;
      if (this.FWm > null)
        System.arraycopy(this.Dne, this.bzF, this.Dne, 0, this.FWm); 
      this.bzF = 0;
    } 
    if (paramInt > this.Dne - this.FWm) {
      int i = paramInt + this.FWm + 4096;
      if (this.Dne != null) {
        byte[] arrayOfByte = new byte[i];
        System.arraycopy(this.Dne, 0, arrayOfByte, 0, this.Dne.length);
        this.Dne = arrayOfByte;
      } else {
        this.Dne = new byte[i];
      } 
      this.Dne = i;
    } 
    return this.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ytS.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */