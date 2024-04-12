public class CLK {
  public int Dne;
  
  public int Qnq;
  
  public int FWm;
  
  public int zGp;
  
  public int aFZ;
  
  public int bzF;
  
  public CLK(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = paramInt1;
    this.bzF = paramInt2;
    this.Qnq = paramInt3;
    this.zGp = paramInt4;
    this.FWm = 1;
    this.aFZ = 512;
  }
  
  public static CLK Dne() {
    return new CLK(2147483647, 2147483647, 2147483647, -2147483648, -2147483648, -2147483648);
  }
  
  public String toString() {
    return "(" + this.Dne + ", " + this.FWm + ", " + this.bzF + "; " + this.Qnq + ", " + this.aFZ + ", " + this.zGp + ")";
  }
  
  public static CLK Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
    switch (paramInt10) {
      case 0:
        return new CLK(paramInt1 + paramInt4, paramInt2 + paramInt5, paramInt3 + paramInt6, paramInt1 + paramInt7 - 1 + paramInt4, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt9 - 1 + paramInt6);
      case 1:
        return new CLK(paramInt1 - paramInt9 + 1 + paramInt6, paramInt2 + paramInt5, paramInt3 + paramInt4, paramInt1 + paramInt6, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt7 - 1 + paramInt4);
      case 2:
        return new CLK(paramInt1 + paramInt4, paramInt2 + paramInt5, paramInt3 - paramInt9 + 1 + paramInt6, paramInt1 + paramInt7 - 1 + paramInt4, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt6);
      case 3:
        return new CLK(paramInt1 + paramInt6, paramInt2 + paramInt5, paramInt3 + paramInt4, paramInt1 + paramInt9 - 1 + paramInt6, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt7 - 1 + paramInt4);
    } 
    return new CLK(paramInt1 + paramInt4, paramInt2 + paramInt5, paramInt3 + paramInt6, paramInt1 + paramInt7 - 1 + paramInt4, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt9 - 1 + paramInt6);
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 >= this.Dne && paramInt1 <= this.Qnq && paramInt3 >= this.bzF && paramInt3 <= this.zGp && paramInt2 >= this.FWm && paramInt2 <= this.aFZ);
  }
  
  public int bzF() {
    return this.zGp - this.bzF + 1;
  }
  
  public int FWm() {
    return this.aFZ - this.FWm + 1;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne += paramInt1;
    this.FWm += paramInt2;
    this.bzF += paramInt3;
    this.Qnq += paramInt1;
    this.aFZ += paramInt2;
    this.zGp += paramInt3;
  }
  
  public int Dne() {
    return this.Qnq - this.Dne + 1;
  }
  
  public void Dne(CLK paramCLK) {
    this.Dne = Math.min(this.Dne, paramCLK.Dne);
    this.FWm = Math.min(this.FWm, paramCLK.FWm);
    this.bzF = Math.min(this.bzF, paramCLK.bzF);
    this.Qnq = Math.max(this.Qnq, paramCLK.Qnq);
    this.aFZ = Math.max(this.aFZ, paramCLK.aFZ);
    this.zGp = Math.max(this.zGp, paramCLK.zGp);
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (this.Qnq >= paramInt1 && this.Dne <= paramInt3 && this.zGp >= paramInt2 && this.bzF <= paramInt4);
  }
  
  public boolean Dne(CLK paramCLK) {
    return (this.Qnq >= paramCLK.Dne && this.Dne <= paramCLK.Qnq && this.zGp >= paramCLK.bzF && this.bzF <= paramCLK.zGp && this.aFZ >= paramCLK.FWm && this.FWm <= paramCLK.aFZ);
  }
  
  public int aFZ() {
    return this.FWm + (this.aFZ - this.FWm + 1) / 2;
  }
  
  public int zGp() {
    return this.bzF + (this.zGp - this.bzF + 1) / 2;
  }
  
  public CLK(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.aFZ = paramInt5;
    this.zGp = paramInt6;
  }
  
  public int Qnq() {
    return this.Dne + (this.Qnq - this.Dne + 1) / 2;
  }
  
  public CLK(CLK paramCLK) {
    this.Dne = paramCLK.Dne;
    this.FWm = paramCLK.FWm;
    this.bzF = paramCLK.bzF;
    this.Qnq = paramCLK.Qnq;
    this.aFZ = paramCLK.aFZ;
    this.zGp = paramCLK.zGp;
  }
  
  public CLK() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CLK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */