public class wdG {
  private int FWm;
  
  private final whE[] Dne;
  
  private int Dne;
  
  public int Dne() {
    return this.FWm;
  }
  
  public void Dne() {
    this.Dne++;
  }
  
  public wdG(whE[] paramArrayOfwhE) {
    this.Dne = paramArrayOfwhE;
    this.FWm = paramArrayOfwhE.length;
  }
  
  public boolean Dne(wdG paramwdG) {
    if (paramwdG == null)
      return false; 
    if (paramwdG.Dne.length != this.Dne.length)
      return false; 
    for (byte b = 0; b < this.Dne.length; b++) {
      if ((this.Dne[b]).Dne != (paramwdG.Dne[b]).Dne || (this.Dne[b]).FWm != (paramwdG.Dne[b]).FWm || (this.Dne[b]).bzF != (paramwdG.Dne[b]).bzF)
        return false; 
    } 
    return true;
  }
  
  public boolean Dne(chN paramchN) {
    whE whE1 = Dne();
    return (whE1 == null) ? false : ((whE1.Dne == (int)paramchN.Dne && whE1.bzF == (int)paramchN.bzF));
  }
  
  public chN Dne(sMa paramsMa, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LwhE;
    //   4: iload_2
    //   5: aaload
    //   6: getfield Dne : I
    //   9: i2d
    //   10: aload_1
    //   11: getfield ooe : F
    //   14: fconst_1
    //   15: fadd
    //   16: f2i
    //   17: i2d
    //   18: ldc2_w 0.5
    //   21: dmul
    //   22: dadd
    //   23: dstore_3
    //   24: aload_0
    //   25: getfield Dne : [LwhE;
    //   28: iload_2
    //   29: aaload
    //   30: getfield FWm : I
    //   33: i2d
    //   34: dstore #5
    //   36: aload_0
    //   37: getfield Dne : [LwhE;
    //   40: iload_2
    //   41: aaload
    //   42: getfield bzF : I
    //   45: i2d
    //   46: aload_1
    //   47: getfield ooe : F
    //   50: fconst_1
    //   51: fadd
    //   52: f2i
    //   53: i2d
    //   54: ldc2_w 0.5
    //   57: dmul
    //   58: dadd
    //   59: dstore #7
    //   61: aload_1
    //   62: getfield Dne : LQnq;
    //   65: invokevirtual Dne : ()LziS;
    //   68: dload_3
    //   69: dload #5
    //   71: dload #7
    //   73: invokevirtual Dne : (DDD)LchN;
    //   76: areturn
  }
  
  public void Dne(int paramInt) {
    this.FWm = paramInt;
  }
  
  public void FWm(int paramInt) {
    this.Dne = paramInt;
  }
  
  public whE Dne(int paramInt) {
    return this.Dne[paramInt];
  }
  
  public whE Dne() {
    return (this.FWm > 0) ? this.Dne[this.FWm - 1] : null;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public boolean Dne() {
    return (this.Dne >= this.FWm);
  }
  
  public chN Dne(sMa paramsMa) {
    return Dne(paramsMa, this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wdG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */