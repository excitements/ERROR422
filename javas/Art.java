public class Art extends Ebp {
  private int Dne = -1;
  
  public Art(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public boolean div() {
    return (this.Dne > -1);
  }
  
  public void Dne(zBn paramzBn) {
    super.Dne(paramzBn);
    double d = this.XHL * this.XHL + this.kGO * this.kGO;
    if (!paramzBn.FWm())
      Dne(new NMq(zKP.qXo, 1), 0.0F); 
    if (paramzBn.aFZ() || paramzBn.FWm() || d >= 0.009999999776482582D)
      FWm(d); 
  }
  
  public int XHL() {
    return 3;
  }
  
  protected void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("TNTFuse", this.Dne);
  }
  
  protected void FWm(double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 71
    //   10: dload_1
    //   11: invokestatic sqrt : (D)D
    //   14: dstore_3
    //   15: dload_3
    //   16: ldc2_w 5.0
    //   19: dcmpl
    //   20: ifle -> 27
    //   23: ldc2_w 5.0
    //   26: dstore_3
    //   27: aload_0
    //   28: getfield Dne : LQnq;
    //   31: aload_0
    //   32: aload_0
    //   33: getfield div : D
    //   36: aload_0
    //   37: getfield IjH : D
    //   40: aload_0
    //   41: getfield mrb : D
    //   44: ldc2_w 4.0
    //   47: aload_0
    //   48: getfield Dne : Ljava/util/Random;
    //   51: invokevirtual nextDouble : ()D
    //   54: ldc2_w 1.5
    //   57: dmul
    //   58: dload_3
    //   59: dmul
    //   60: dadd
    //   61: d2f
    //   62: iconst_1
    //   63: invokevirtual Dne : (LsMa;DDDFZ)LyTR;
    //   66: pop
    //   67: aload_0
    //   68: invokevirtual g_ : ()V
    //   71: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: ifle -> 52
    //   11: aload_0
    //   12: dup
    //   13: getfield Dne : I
    //   16: iconst_1
    //   17: isub
    //   18: putfield Dne : I
    //   21: aload_0
    //   22: getfield Dne : LQnq;
    //   25: ldc 'smoke'
    //   27: aload_0
    //   28: getfield div : D
    //   31: aload_0
    //   32: getfield IjH : D
    //   35: ldc2_w 0.5
    //   38: dadd
    //   39: aload_0
    //   40: getfield mrb : D
    //   43: dconst_0
    //   44: dconst_0
    //   45: dconst_0
    //   46: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   49: goto -> 82
    //   52: aload_0
    //   53: getfield Dne : I
    //   56: ifne -> 82
    //   59: aload_0
    //   60: aload_0
    //   61: getfield XHL : D
    //   64: aload_0
    //   65: getfield XHL : D
    //   68: dmul
    //   69: aload_0
    //   70: getfield kGO : D
    //   73: aload_0
    //   74: getfield kGO : D
    //   77: dmul
    //   78: dadd
    //   79: invokevirtual FWm : (D)V
    //   82: aload_0
    //   83: getfield zGp : Z
    //   86: ifeq -> 122
    //   89: aload_0
    //   90: getfield XHL : D
    //   93: aload_0
    //   94: getfield XHL : D
    //   97: dmul
    //   98: aload_0
    //   99: getfield kGO : D
    //   102: aload_0
    //   103: getfield kGO : D
    //   106: dmul
    //   107: dadd
    //   108: dstore_1
    //   109: dload_1
    //   110: ldc2_w 0.009999999776482582
    //   113: dcmpl
    //   114: iflt -> 122
    //   117: aload_0
    //   118: dload_1
    //   119: invokevirtual FWm : (D)V
    //   122: return
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: bipush #80
    //   3: putfield Dne : I
    //   6: aload_0
    //   7: getfield Dne : LQnq;
    //   10: getfield aFZ : Z
    //   13: ifne -> 38
    //   16: aload_0
    //   17: getfield Dne : LQnq;
    //   20: aload_0
    //   21: bipush #10
    //   23: invokevirtual Dne : (LsMa;B)V
    //   26: aload_0
    //   27: getfield Dne : LQnq;
    //   30: aload_0
    //   31: ldc 'random.fuse'
    //   33: fconst_1
    //   34: fconst_1
    //   35: invokevirtual Dne : (LsMa;Ljava/lang/String;FF)V
    //   38: return
  }
  
  public Art(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public boolean Dne(yTR paramyTR, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
    return (div() && (Oaf.Dne(paramInt4) || Oaf.FWm(paramQnq, paramInt1, paramInt2 + 1, paramInt3))) ? false : super.Dne(paramyTR, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat);
  }
  
  public int Qnq() {
    return this.Dne;
  }
  
  protected void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (paramWkD.Dne("TNTFuse"))
      this.Dne = paramWkD.Dne("TNTFuse"); 
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 10) {
      bzF();
    } else {
      super.Dne(paramByte);
    } 
  }
  
  protected void Dne(float paramFloat) {
    if (paramFloat >= 3.0F) {
      float f = paramFloat / 10.0F;
      FWm((f * f));
    } 
    super.Dne(paramFloat);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramBoolean && this.Dne < 0)
      bzF(); 
  }
  
  public float Dne(yTR paramyTR, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, zKP paramzKP) {
    return (div() && (Oaf.Dne(paramzKP.FWm) || Oaf.FWm(paramQnq, paramInt1, paramInt2 + 1, paramInt3))) ? 0.0F : super.Dne(paramyTR, paramQnq, paramInt1, paramInt2, paramInt3, paramzKP);
  }
  
  public zKP FWm() {
    return zKP.qXo;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Art.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */