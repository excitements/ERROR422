public class cHy {
  private FYZ Qnq;
  
  private FYZ bzF;
  
  private FYZ Dne;
  
  private int Dne;
  
  private byte[] Dne;
  
  private int FWm;
  
  private int bzF;
  
  private FYZ FWm;
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.FWm.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int bzF(int paramInt1, int paramInt2, int paramInt3) {
    return this.Qnq.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public cHy(int paramInt, boolean paramBoolean) {
    this.Dne = paramInt;
    this.Dne = new byte[4096];
    this.FWm = new FYZ(this.Dne.length, 4);
    this.bzF = new FYZ(this.Dne.length, 4);
    if (paramBoolean)
      this.Qnq = new FYZ(this.Dne.length, 4); 
  }
  
  public void Dne(FYZ paramFYZ) {
    this.Dne = (byte[])paramFYZ;
  }
  
  public byte[] Dne() {
    return this.Dne;
  }
  
  public FYZ aFZ() {
    this.Dne = (byte[])new FYZ(this.Dne.length, 4);
    return (FYZ)this.Dne;
  }
  
  public void Qnq(FYZ paramFYZ) {
    this.Qnq = paramFYZ;
  }
  
  public void Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : LFYZ;
    //   4: iload_1
    //   5: iload_2
    //   6: iload_3
    //   7: iload #4
    //   9: invokevirtual Dne : (IIII)V
    //   12: return
  }
  
  public void bzF(FYZ paramFYZ) {
    this.bzF = paramFYZ;
  }
  
  public FYZ Dne() {
    return (FYZ)this.Dne;
  }
  
  public FYZ bzF() {
    return this.bzF;
  }
  
  public void FWm() {
    this.Dne = null;
  }
  
  public void Dne() {
    this.FWm = false;
    this.bzF = 0;
    for (byte b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        for (byte b2 = 0; b2 < 16; b2++) {
          int i = Dne(b, b1, b2);
          if (i > 0)
            if (zKP.Dne[i] == null) {
              this.Dne[b1 << 8 | b2 << 4 | b] = 0;
              if (this.Dne != null)
                this.Dne.Dne(b, b1, b2, 0); 
            } else {
              this.FWm++;
              if (zKP.Dne[i].IjH())
                this.bzF++; 
            }  
        } 
      } 
    } 
  }
  
  public int Qnq(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : LFYZ;
    //   4: iload_1
    //   5: iload_2
    //   6: iload_3
    //   7: invokevirtual Dne : (III)I
    //   10: ireturn
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.Dne[paramInt2 << 8 | paramInt3 << 4 | paramInt1] & 0xFF;
    return (this.Dne != null) ? (this.Dne.Dne(paramInt1, paramInt2, paramInt3) << 8 | i) : i;
  }
  
  public boolean Dne() {
    return (this.FWm == null);
  }
  
  public int FWm(int paramInt1, int paramInt2, int paramInt3) {
    return this.FWm.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public FYZ FWm() {
    return this.FWm;
  }
  
  public void Dne(byte[] paramArrayOfbyte) {
    this.Dne = paramArrayOfbyte;
  }
  
  public FYZ Qnq() {
    return this.Qnq;
  }
  
  public void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Qnq.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.Dne[paramInt2 << 8 | paramInt3 << 4 | paramInt1] & 0xFF;
    if (this.Dne != null)
      i |= this.Dne.Dne(paramInt1, paramInt2, paramInt3) << 8; 
    if (i == 0 && paramInt4 != 0) {
      this.FWm++;
      if (zKP.Dne[paramInt4] != null && zKP.Dne[paramInt4].IjH())
        this.bzF++; 
    } else if (i != 0 && paramInt4 == 0) {
      this.FWm--;
      if (zKP.Dne[i] != null && zKP.Dne[i].IjH())
        this.bzF--; 
    } else if (zKP.Dne[i] != null && zKP.Dne[i].IjH() && (zKP.Dne[paramInt4] == null || !zKP.Dne[paramInt4].IjH())) {
      this.bzF--;
    } else if ((zKP.Dne[i] == null || !zKP.Dne[i].IjH()) && zKP.Dne[paramInt4] != null && zKP.Dne[paramInt4].IjH()) {
      this.bzF++;
    } 
    this.Dne[paramInt2 << 8 | paramInt3 << 4 | paramInt1] = (byte)(paramInt4 & 0xFF);
    if (paramInt4 > 255) {
      if (this.Dne == null)
        this.Dne = (byte[])new FYZ(this.Dne.length, 4); 
      this.Dne.Dne(paramInt1, paramInt2, paramInt3, (paramInt4 & 0xF00) >> 8);
    } else if (this.Dne != null) {
      this.Dne.Dne(paramInt1, paramInt2, paramInt3, 0);
    } 
  }
  
  public void FWm(FYZ paramFYZ) {
    this.FWm = paramFYZ;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public boolean FWm() {
    return (this.bzF > 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cHy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */