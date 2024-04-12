public abstract class LHi extends kSJ implements ZFz {
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: ldc 0.5
    //   2: aload_0
    //   3: getfield Dne : LQnq;
    //   6: iload_1
    //   7: iload_2
    //   8: iload_3
    //   9: invokevirtual Dne : (III)F
    //   12: fsub
    //   13: freturn
  }
  
  protected boolean ICU() {
    // Byte code:
    //   0: aload_0
    //   1: getfield div : D
    //   4: invokestatic FWm : (D)I
    //   7: istore_1
    //   8: aload_0
    //   9: getfield Dne : LbSp;
    //   12: getfield FWm : D
    //   15: invokestatic FWm : (D)I
    //   18: istore_2
    //   19: aload_0
    //   20: getfield mrb : D
    //   23: invokestatic FWm : (D)I
    //   26: istore_3
    //   27: aload_0
    //   28: getfield Dne : LQnq;
    //   31: getstatic udO.Dne : LudO;
    //   34: iload_1
    //   35: iload_2
    //   36: iload_3
    //   37: invokevirtual FWm : (LudO;III)I
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/Random;
    //   44: bipush #32
    //   46: invokevirtual nextInt : (I)I
    //   49: if_icmple -> 54
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_0
    //   55: getfield Dne : LQnq;
    //   58: iload_1
    //   59: iload_2
    //   60: iload_3
    //   61: invokevirtual aFZ : (III)I
    //   64: istore #4
    //   66: aload_0
    //   67: getfield Dne : LQnq;
    //   70: invokevirtual FWm : ()Z
    //   73: ifeq -> 115
    //   76: aload_0
    //   77: getfield Dne : LQnq;
    //   80: getfield Dne : I
    //   83: istore #5
    //   85: aload_0
    //   86: getfield Dne : LQnq;
    //   89: bipush #10
    //   91: putfield Dne : I
    //   94: aload_0
    //   95: getfield Dne : LQnq;
    //   98: iload_1
    //   99: iload_2
    //   100: iload_3
    //   101: invokevirtual aFZ : (III)I
    //   104: istore #4
    //   106: aload_0
    //   107: getfield Dne : LQnq;
    //   110: iload #5
    //   112: putfield Dne : I
    //   115: iload #4
    //   117: aload_0
    //   118: getfield Dne : Ljava/util/Random;
    //   121: bipush #8
    //   123: invokevirtual nextInt : (I)I
    //   126: if_icmpgt -> 133
    //   129: iconst_1
    //   130: goto -> 134
    //   133: iconst_0
    //   134: ireturn
  }
  
  public void IjH() {
    EWz();
    float f = Dne(1.0F);
    if (f > 0.5F)
      this.Wwe += 2; 
    super.IjH();
  }
  
  protected sMa Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: ldc2_w 16.0
    //   8: invokevirtual FWm : (LsMa;D)LFiG;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 28
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual Qnq : (LsMa;)Z
    //   21: ifeq -> 28
    //   24: aload_1
    //   25: goto -> 29
    //   28: aconst_null
    //   29: areturn
  }
  
  public LHi(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if (super.Dne(paramzBn, paramInt)) {
      sMa sMa = paramzBn.FWm();
      if (this.Dne != sMa && this.FWm != sMa) {
        if (sMa != this)
          this.bzF = sMa; 
        return true;
      } 
      return true;
    } 
    return false;
  }
  
  public void Dne() {
    super.Dne();
    if (this.Dne.aFZ == null && this.Dne.aFZ == null)
      g_(); 
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {
    if (this.RPx <= 0.0F && paramFloat < 2.0F && paramsMa.Dne.aFZ > this.Dne.FWm && paramsMa.Dne.FWm < this.Dne.aFZ) {
      this.RPx = 20;
      bzF(paramsMa);
    } 
  }
  
  public boolean bzF(sMa paramsMa) {
    int i = Dne(paramsMa);
    if (Dne(SXd.zGp))
      i += 3 << Dne(SXd.zGp).bzF(); 
    if (Dne(SXd.Vxn))
      i -= 2 << Dne(SXd.Vxn).bzF(); 
    int j = 0;
    if (paramsMa instanceof FUH) {
      i += UYp.Dne(this, (FUH)paramsMa);
      j += UYp.FWm(this, (FUH)paramsMa);
    } 
    boolean bool = paramsMa.Dne(zBn.Dne(this), i);
    if (bool) {
      if (j > 0) {
        paramsMa.Qnq((-geR.Dne(this.mrb * 3.1415927F / 180.0F) * j * 0.5F), 0.1D, (geR.FWm(this.mrb * 3.1415927F / 180.0F) * j * 0.5F));
        this.XHL *= 0.6D;
        this.kGO *= 0.6D;
      } 
      int k = UYp.Dne(this);
      if (k > 0)
        paramsMa.aFZ(k * 4); 
      if (paramsMa instanceof FUH)
        kqp.Dne(this, (FUH)paramsMa, this.Dne); 
    } 
    return bool;
  }
  
  public int Dne(sMa paramsMa) {
    return 2;
  }
  
  public boolean cot() {
    return (ICU() && super.cot());
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LHi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */