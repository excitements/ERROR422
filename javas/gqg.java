public class gqg extends sMa {
  private FUH Dne;
  
  public int Dne = 0;
  
  protected void FWm() {}
  
  public FUH Dne() {
    return this.Dne;
  }
  
  public gqg(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, FUH paramFUH) {
    this(paramQnq);
    bzF(paramDouble1, paramDouble2, paramDouble3);
    float f = (float)(Math.random() * Math.PI * 2.0D);
    this.XHL = (-((float)Math.sin(f)) * 0.02F);
    this.Zpi = 0.20000000298023224D;
    this.kGO = (-((float)Math.cos(f)) * 0.02F);
    this.Dne = 80;
    this.aFZ = paramDouble1;
    this.zGp = paramDouble2;
    this.DyG = paramDouble3;
    this.Dne = paramFUH;
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  protected void FWm(WkD paramWkD) {
    this.Dne = paramWkD.Dne("Fuse");
  }
  
  protected void Dne(WkD paramWkD) {
    paramWkD.Dne("Fuse", (byte)this.Dne);
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public boolean kGO() {
    return (this.Zpi == 0.0F);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield div : D
    //   5: putfield aFZ : D
    //   8: aload_0
    //   9: aload_0
    //   10: getfield IjH : D
    //   13: putfield zGp : D
    //   16: aload_0
    //   17: aload_0
    //   18: getfield mrb : D
    //   21: putfield DyG : D
    //   24: aload_0
    //   25: dup
    //   26: getfield Zpi : D
    //   29: ldc2_w 0.03999999910593033
    //   32: dsub
    //   33: putfield Zpi : D
    //   36: aload_0
    //   37: aload_0
    //   38: getfield XHL : D
    //   41: aload_0
    //   42: getfield Zpi : D
    //   45: aload_0
    //   46: getfield kGO : D
    //   49: invokevirtual Dne : (DDD)V
    //   52: aload_0
    //   53: dup
    //   54: getfield XHL : D
    //   57: ldc2_w 0.9800000190734863
    //   60: dmul
    //   61: putfield XHL : D
    //   64: aload_0
    //   65: dup
    //   66: getfield Zpi : D
    //   69: ldc2_w 0.9800000190734863
    //   72: dmul
    //   73: putfield Zpi : D
    //   76: aload_0
    //   77: dup
    //   78: getfield kGO : D
    //   81: ldc2_w 0.9800000190734863
    //   84: dmul
    //   85: putfield kGO : D
    //   88: aload_0
    //   89: getfield aFZ : Z
    //   92: ifeq -> 131
    //   95: aload_0
    //   96: dup
    //   97: getfield XHL : D
    //   100: ldc2_w 0.699999988079071
    //   103: dmul
    //   104: putfield XHL : D
    //   107: aload_0
    //   108: dup
    //   109: getfield kGO : D
    //   112: ldc2_w 0.699999988079071
    //   115: dmul
    //   116: putfield kGO : D
    //   119: aload_0
    //   120: dup
    //   121: getfield Zpi : D
    //   124: ldc2_w -0.5
    //   127: dmul
    //   128: putfield Zpi : D
    //   131: aload_0
    //   132: dup
    //   133: getfield Dne : I
    //   136: dup_x1
    //   137: iconst_1
    //   138: isub
    //   139: putfield Dne : I
    //   142: ifgt -> 166
    //   145: aload_0
    //   146: invokevirtual g_ : ()V
    //   149: aload_0
    //   150: getfield Dne : LQnq;
    //   153: getfield aFZ : Z
    //   156: ifne -> 194
    //   159: aload_0
    //   160: invokespecial bzF : ()V
    //   163: goto -> 194
    //   166: aload_0
    //   167: getfield Dne : LQnq;
    //   170: ldc 'smoke'
    //   172: aload_0
    //   173: getfield div : D
    //   176: aload_0
    //   177: getfield IjH : D
    //   180: ldc2_w 0.5
    //   183: dadd
    //   184: aload_0
    //   185: getfield mrb : D
    //   188: dconst_0
    //   189: dconst_0
    //   190: dconst_0
    //   191: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   194: return
  }
  
  private void bzF() {
    // Byte code:
    //   0: ldc 4.0
    //   2: fstore_1
    //   3: aload_0
    //   4: getfield Dne : LQnq;
    //   7: aload_0
    //   8: aload_0
    //   9: getfield div : D
    //   12: aload_0
    //   13: getfield IjH : D
    //   16: aload_0
    //   17: getfield mrb : D
    //   20: fload_1
    //   21: iconst_1
    //   22: invokevirtual Dne : (LsMa;DDDFZ)LyTR;
    //   25: pop
    //   26: return
  }
  
  public gqg(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.98F, 0.98F);
    this.udO = this.trS / 2.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gqg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */