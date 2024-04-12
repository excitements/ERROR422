public class ywl extends CAZ {
  public ywl(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
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
    //   17: getfield Dne : Ljava/util/Random;
    //   20: invokevirtual nextFloat : ()F
    //   23: ldc 0.1
    //   25: fmul
    //   26: ldc 0.2
    //   28: fadd
    //   29: fstore #14
    //   31: aload_0
    //   32: fload #14
    //   34: putfield zGp : F
    //   37: aload_0
    //   38: fload #14
    //   40: putfield DyG : F
    //   43: aload_0
    //   44: fload #14
    //   46: putfield div : F
    //   49: aload_0
    //   50: iconst_0
    //   51: invokevirtual bzF : (I)V
    //   54: aload_0
    //   55: ldc 0.02
    //   57: ldc 0.02
    //   59: invokevirtual Dne : (FF)V
    //   62: aload_0
    //   63: dup
    //   64: getfield Qnq : F
    //   67: aload_0
    //   68: getfield Dne : Ljava/util/Random;
    //   71: invokevirtual nextFloat : ()F
    //   74: ldc 0.6
    //   76: fmul
    //   77: ldc 0.5
    //   79: fadd
    //   80: fmul
    //   81: putfield Qnq : F
    //   84: aload_0
    //   85: dup
    //   86: getfield XHL : D
    //   89: ldc2_w 0.019999999552965164
    //   92: dmul
    //   93: putfield XHL : D
    //   96: aload_0
    //   97: dup
    //   98: getfield Zpi : D
    //   101: ldc2_w 0.019999999552965164
    //   104: dmul
    //   105: putfield Zpi : D
    //   108: aload_0
    //   109: dup
    //   110: getfield kGO : D
    //   113: ldc2_w 0.019999999552965164
    //   116: dmul
    //   117: putfield kGO : D
    //   120: aload_0
    //   121: ldc2_w 20.0
    //   124: invokestatic random : ()D
    //   127: ldc2_w 0.8
    //   130: dmul
    //   131: ldc2_w 0.2
    //   134: dadd
    //   135: ddiv
    //   136: d2i
    //   137: putfield Qnq : I
    //   140: aload_0
    //   141: iconst_1
    //   142: putfield kGO : Z
    //   145: return
  }
  
  static {
  
  }
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    Dne(this.XHL, this.Zpi, this.kGO);
    this.XHL *= 0.99D;
    this.Zpi *= 0.99D;
    this.kGO *= 0.99D;
    if (this.Qnq-- <= 0.0F)
      g_(); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ywl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */