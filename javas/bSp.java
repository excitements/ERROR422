public class bSp {
  public double bzF;
  
  public double FWm;
  
  public double zGp;
  
  private static final ThreadLocal Dne = new nJD();
  
  public double aFZ;
  
  public double Qnq;
  
  public double Dne;
  
  public static bSp Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    return new bSp(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
  }
  
  public bSp aFZ(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.Dne + paramDouble1;
    double d2 = this.FWm + paramDouble2;
    double d3 = this.bzF + paramDouble3;
    double d4 = this.Qnq - paramDouble1;
    double d5 = this.aFZ - paramDouble2;
    double d6 = this.zGp - paramDouble3;
    return Dne().Dne(d1, d2, d3, d4, d5, d6);
  }
  
  public double Dne(bSp parambSp, double paramDouble) {
    if (parambSp.aFZ > this.FWm && parambSp.FWm < this.aFZ) {
      if (parambSp.zGp > this.bzF && parambSp.bzF < this.zGp) {
        if (paramDouble > 0.0D && parambSp.Qnq <= this.Dne) {
          double d = this.Dne - parambSp.Qnq;
          if (d < paramDouble)
            paramDouble = d; 
        } 
        if (paramDouble < 0.0D && parambSp.Dne >= this.Qnq) {
          double d = this.Qnq - parambSp.Dne;
          if (d > paramDouble)
            paramDouble = d; 
        } 
        return paramDouble;
      } 
      return paramDouble;
    } 
    return paramDouble;
  }
  
  public double FWm(bSp parambSp, double paramDouble) {
    if (parambSp.Qnq > this.Dne && parambSp.Dne < this.Qnq) {
      if (parambSp.zGp > this.bzF && parambSp.bzF < this.zGp) {
        if (paramDouble > 0.0D && parambSp.aFZ <= this.FWm) {
          double d = this.FWm - parambSp.aFZ;
          if (d < paramDouble)
            paramDouble = d; 
        } 
        if (paramDouble < 0.0D && parambSp.FWm >= this.aFZ) {
          double d = this.aFZ - parambSp.FWm;
          if (d > paramDouble)
            paramDouble = d; 
        } 
        return paramDouble;
      } 
      return paramDouble;
    } 
    return paramDouble;
  }
  
  public wHH Dne(chN paramchN1, chN paramchN2) {
    chN chN1 = paramchN1.Dne(paramchN2, this.Dne);
    chN chN2 = paramchN1.Dne(paramchN2, this.Qnq);
    chN chN3 = paramchN1.FWm(paramchN2, this.FWm);
    chN chN4 = paramchN1.FWm(paramchN2, this.aFZ);
    chN chN5 = paramchN1.bzF(paramchN2, this.bzF);
    chN chN6 = paramchN1.bzF(paramchN2, this.zGp);
    if (!FWm(chN1))
      chN1 = null; 
    if (!FWm(chN2))
      chN2 = null; 
    if (!bzF(chN3))
      chN3 = null; 
    if (!bzF(chN4))
      chN4 = null; 
    if (!Qnq(chN5))
      chN5 = null; 
    if (!Qnq(chN6))
      chN6 = null; 
    chN chN7 = null;
    if (chN1 != null && (chN7 == null || paramchN1.bzF(chN1) < paramchN1.bzF(chN7)))
      chN7 = chN1; 
    if (chN2 != null && (chN7 == null || paramchN1.bzF(chN2) < paramchN1.bzF(chN7)))
      chN7 = chN2; 
    if (chN3 != null && (chN7 == null || paramchN1.bzF(chN3) < paramchN1.bzF(chN7)))
      chN7 = chN3; 
    if (chN4 != null && (chN7 == null || paramchN1.bzF(chN4) < paramchN1.bzF(chN7)))
      chN7 = chN4; 
    if (chN5 != null && (chN7 == null || paramchN1.bzF(chN5) < paramchN1.bzF(chN7)))
      chN7 = chN5; 
    if (chN6 != null && (chN7 == null || paramchN1.bzF(chN6) < paramchN1.bzF(chN7)))
      chN7 = chN6; 
    if (chN7 == null)
      return null; 
    byte b = -1;
    if (chN7 == chN1)
      b = 4; 
    if (chN7 == chN2)
      b = 5; 
    if (chN7 == chN3)
      b = 0; 
    if (chN7 == chN4)
      b = 1; 
    if (chN7 == chN5)
      b = 2; 
    if (chN7 == chN6)
      b = 3; 
    return new wHH(0, 0, 0, b, chN7);
  }
  
  protected bSp(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    this.Qnq = paramDouble4;
    this.aFZ = paramDouble5;
    this.zGp = paramDouble6;
  }
  
  public bSp Qnq(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Dne += paramDouble1;
    this.FWm += paramDouble2;
    this.bzF += paramDouble3;
    this.Qnq += paramDouble1;
    this.aFZ += paramDouble2;
    this.zGp += paramDouble3;
    return this;
  }
  
  public bSp FWm(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    this.Qnq = paramDouble4;
    this.aFZ = paramDouble5;
    this.zGp = paramDouble6;
    return this;
  }
  
  public bSp Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.Dne;
    double d2 = this.FWm;
    double d3 = this.bzF;
    double d4 = this.Qnq;
    double d5 = this.aFZ;
    double d6 = this.zGp;
    if (paramDouble1 < 0.0D)
      d1 += paramDouble1; 
    if (paramDouble1 > 0.0D)
      d4 += paramDouble1; 
    if (paramDouble2 < 0.0D)
      d2 += paramDouble2; 
    if (paramDouble2 > 0.0D)
      d5 += paramDouble2; 
    if (paramDouble3 < 0.0D)
      d3 += paramDouble3; 
    if (paramDouble3 > 0.0D)
      d6 += paramDouble3; 
    return Dne().Dne(d1, d2, d3, d4, d5, d6);
  }
  
  public String toString() {
    return "box[" + this.Dne + ", " + this.FWm + ", " + this.bzF + " -> " + this.Qnq + ", " + this.aFZ + ", " + this.zGp + "]";
  }
  
  public bSp bzF(double paramDouble1, double paramDouble2, double paramDouble3) {
    return Dne().Dne(this.Dne + paramDouble1, this.FWm + paramDouble2, this.bzF + paramDouble3, this.Qnq + paramDouble1, this.aFZ + paramDouble2, this.zGp + paramDouble3);
  }
  
  public static zjJ Dne() {
    // Byte code:
    //   0: getstatic bSp.Dne : Ljava/lang/ThreadLocal;
    //   3: invokevirtual get : ()Ljava/lang/Object;
    //   6: checkcast zjJ
    //   9: areturn
  }
  
  public boolean Dne(bSp parambSp) {
    return (parambSp.Qnq > this.Dne && parambSp.Dne < this.Qnq) ? ((parambSp.aFZ > this.FWm && parambSp.FWm < this.aFZ) ? ((parambSp.zGp > this.bzF && parambSp.bzF < this.zGp)) : false) : false;
  }
  
  private boolean Qnq(chN paramchN) {
    return (paramchN == null) ? false : ((paramchN.Dne >= this.Dne && paramchN.Dne <= this.Qnq && paramchN.FWm >= this.FWm && paramchN.FWm <= this.aFZ));
  }
  
  public bSp FWm(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.Dne - paramDouble1;
    double d2 = this.FWm - paramDouble2;
    double d3 = this.bzF - paramDouble3;
    double d4 = this.Qnq + paramDouble1;
    double d5 = this.aFZ + paramDouble2;
    double d6 = this.zGp + paramDouble3;
    return Dne().Dne(d1, d2, d3, d4, d5, d6);
  }
  
  private boolean bzF(chN paramchN) {
    return (paramchN == null) ? false : ((paramchN.Dne >= this.Dne && paramchN.Dne <= this.Qnq && paramchN.bzF >= this.bzF && paramchN.bzF <= this.zGp));
  }
  
  private boolean FWm(chN paramchN) {
    return (paramchN == null) ? false : ((paramchN.FWm >= this.FWm && paramchN.FWm <= this.aFZ && paramchN.bzF >= this.bzF && paramchN.bzF <= this.zGp));
  }
  
  public void Dne(bSp parambSp) {
    this.Dne = parambSp.Dne;
    this.FWm = parambSp.FWm;
    this.bzF = parambSp.bzF;
    this.Qnq = parambSp.Qnq;
    this.aFZ = parambSp.aFZ;
    this.zGp = parambSp.zGp;
  }
  
  public boolean Dne(chN paramchN) {
    return (paramchN.Dne > this.Dne && paramchN.Dne < this.Qnq) ? ((paramchN.FWm > this.FWm && paramchN.FWm < this.aFZ) ? ((paramchN.bzF > this.bzF && paramchN.bzF < this.zGp)) : false) : false;
  }
  
  public double bzF(bSp parambSp, double paramDouble) {
    if (parambSp.Qnq > this.Dne && parambSp.Dne < this.Qnq) {
      if (parambSp.aFZ > this.FWm && parambSp.FWm < this.aFZ) {
        if (paramDouble > 0.0D && parambSp.zGp <= this.bzF) {
          double d = this.bzF - parambSp.zGp;
          if (d < paramDouble)
            paramDouble = d; 
        } 
        if (paramDouble < 0.0D && parambSp.bzF >= this.zGp) {
          double d = this.zGp - parambSp.bzF;
          if (d > paramDouble)
            paramDouble = d; 
        } 
        return paramDouble;
      } 
      return paramDouble;
    } 
    return paramDouble;
  }
  
  public double Dne() {
    double d1 = this.Qnq - this.Dne;
    double d2 = this.aFZ - this.FWm;
    double d3 = this.zGp - this.bzF;
    return (d1 + d2 + d3) / 3.0D;
  }
  
  public bSp Dne() {
    return Dne().Dne(this.Dne, this.FWm, this.bzF, this.Qnq, this.aFZ, this.zGp);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bSp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */