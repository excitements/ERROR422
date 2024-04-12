class QwU {
  int aFZ;
  
  int Qnq;
  
  float bzF;
  
  float Dne;
  
  float FWm;
  
  int[] FWm = new int[16];
  
  int[] bzF = new int[16];
  
  static final int bzF;
  
  int IjH;
  
  int mrb;
  
  int[] aFZ;
  
  int div;
  
  int XHL;
  
  int zGp;
  
  static final int FWm;
  
  float Qnq;
  
  int[] Qnq = new int[16];
  
  int[][] Dne;
  
  int[] Dne;
  
  static final int Dne = 63;
  
  int DyG;
  
  Object Dne() {
    QwU qwU1 = this;
    QwU qwU2 = new QwU(this.Dne);
    qwU2.Qnq = qwU1.Qnq;
    System.arraycopy(qwU1.Dne, 0, qwU2.Dne, 0, 31);
    System.arraycopy(qwU1.FWm, 0, qwU2.FWm, 0, 16);
    System.arraycopy(qwU1.bzF, 0, qwU2.bzF, 0, 16);
    System.arraycopy(qwU1.Qnq, 0, qwU2.Qnq, 0, 16);
    for (byte b = 0; b < 16; b++)
      System.arraycopy(qwU1.Dne[b], 0, qwU2.Dne[b], 0, 8); 
    qwU2.aFZ = qwU1.aFZ;
    System.arraycopy(qwU1.aFZ, 0, qwU2.aFZ, 0, 65);
    qwU2.Dne = qwU1.Dne;
    qwU2.FWm = qwU1.FWm;
    qwU2.bzF = qwU1.bzF;
    qwU2.zGp = qwU1.zGp;
    qwU2.DyG = qwU1.DyG;
    qwU2.div = qwU1.div;
    qwU2.Qnq = qwU1.Qnq;
    qwU2.IjH = qwU1.IjH;
    qwU2.mrb = qwU1.mrb;
    qwU2.XHL = qwU1.XHL;
    return qwU2;
  }
  
  void Dne() {
    this.Dne = null;
    this.FWm = null;
    this.bzF = null;
    this.Qnq = null;
    this.Dne = (iVy)null;
    this.aFZ = null;
  }
  
  QwU(iVy paramiVy) {
    this.Dne = (iVy)new int[16][];
    this.aFZ = new int[65];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = (iVy)new int[8]; 
  }
  
  static {
    bzF = 31;
    FWm = 16;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QwU.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */