public class NYy extends CAZ {
  private double qLR;
  
  private double Vxn;
  
  private float Dne;
  
  private double ATE;
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    float f1 = this.bzF / this.Qnq;
    f1 = 1.0F - f1;
    float f2 = 1.0F - f1;
    f2 *= f2;
    f2 *= f2;
    this.div = this.qLR + this.XHL * f1;
    this.IjH = this.ATE + this.Zpi * f1 - (f2 * 1.2F);
    this.mrb = this.Vxn + this.kGO * f1;
    if (this.bzF++ >= this.Qnq)
      g_(); 
  }
  
  public NYy(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: dload_2
    //   3: dload #4
    //   5: dload #6
    //   7: dload #8
    //   9: dload #10
    //   11: dload #12
    //   13: invokespecial <init> : (LQnq;DDDDDD)V
    //   16: aload_0
    //   17: dload #8
    //   19: putfield XHL : D
    //   22: aload_0
    //   23: dload #10
    //   25: putfield Zpi : D
    //   28: aload_0
    //   29: dload #12
    //   31: putfield kGO : D
    //   34: aload_0
    //   35: aload_0
    //   36: dload_2
    //   37: dup2_x1
    //   38: putfield div : D
    //   41: putfield qLR : D
    //   44: aload_0
    //   45: aload_0
    //   46: dload #4
    //   48: dup2_x1
    //   49: putfield IjH : D
    //   52: putfield ATE : D
    //   55: aload_0
    //   56: aload_0
    //   57: dload #6
    //   59: dup2_x1
    //   60: putfield mrb : D
    //   63: putfield Vxn : D
    //   66: aload_0
    //   67: getfield Dne : Ljava/util/Random;
    //   70: invokevirtual nextFloat : ()F
    //   73: ldc 0.6
    //   75: fmul
    //   76: ldc 0.4
    //   78: fadd
    //   79: fstore #14
    //   81: aload_0
    //   82: aload_0
    //   83: aload_0
    //   84: getfield Dne : Ljava/util/Random;
    //   87: invokevirtual nextFloat : ()F
    //   90: ldc 0.5
    //   92: fmul
    //   93: ldc 0.2
    //   95: fadd
    //   96: dup_x1
    //   97: putfield Qnq : F
    //   100: putfield Dne : F
    //   103: aload_0
    //   104: aload_0
    //   105: aload_0
    //   106: fconst_1
    //   107: fload #14
    //   109: fmul
    //   110: dup_x1
    //   111: putfield div : F
    //   114: dup_x1
    //   115: putfield DyG : F
    //   118: putfield zGp : F
    //   121: aload_0
    //   122: dup
    //   123: getfield DyG : F
    //   126: ldc 0.9
    //   128: fmul
    //   129: putfield DyG : F
    //   132: aload_0
    //   133: dup
    //   134: getfield zGp : F
    //   137: ldc 0.9
    //   139: fmul
    //   140: putfield zGp : F
    //   143: aload_0
    //   144: invokestatic random : ()D
    //   147: ldc2_w 10.0
    //   150: dmul
    //   151: d2i
    //   152: bipush #30
    //   154: iadd
    //   155: putfield Qnq : I
    //   158: aload_0
    //   159: iconst_1
    //   160: putfield kGO : Z
    //   163: aload_0
    //   164: invokestatic random : ()D
    //   167: ldc2_w 26.0
    //   170: dmul
    //   171: dconst_1
    //   172: dadd
    //   173: ldc2_w 224.0
    //   176: dadd
    //   177: d2i
    //   178: invokevirtual bzF : (I)V
    //   181: return
  }
  
  public int Dne(float paramFloat) {
    int i = super.Dne(paramFloat);
    float f = this.bzF / this.Qnq;
    f *= f;
    f *= f;
    int j = i & 0xFF;
    int k = i >> 16 & 0xFF;
    k += (int)(f * 15.0F * 16.0F);
    if (k > 240)
      k = 240; 
    return j | k << 16;
  }
  
  public float Dne(float paramFloat) {
    float f1 = super.Dne(paramFloat);
    float f2 = this.bzF / this.Qnq;
    f2 *= f2;
    f2 *= f2;
    return f1 * (1.0F - f2) + f2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NYy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */