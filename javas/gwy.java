public class gwy extends CAZ {
  static {
  
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
    //   29: ldc2_w 0.002
    //   32: dadd
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
    //   57: ldc2_w 0.8500000238418579
    //   60: dmul
    //   61: putfield XHL : D
    //   64: aload_0
    //   65: dup
    //   66: getfield Zpi : D
    //   69: ldc2_w 0.8500000238418579
    //   72: dmul
    //   73: putfield Zpi : D
    //   76: aload_0
    //   77: dup
    //   78: getfield kGO : D
    //   81: ldc2_w 0.8500000238418579
    //   84: dmul
    //   85: putfield kGO : D
    //   88: aload_0
    //   89: getfield Dne : LQnq;
    //   92: aload_0
    //   93: getfield div : D
    //   96: invokestatic FWm : (D)I
    //   99: aload_0
    //   100: getfield IjH : D
    //   103: invokestatic FWm : (D)I
    //   106: aload_0
    //   107: getfield mrb : D
    //   110: invokestatic FWm : (D)I
    //   113: invokevirtual Dne : (III)LKFd;
    //   116: getstatic KFd.div : LKFd;
    //   119: if_acmpeq -> 126
    //   122: aload_0
    //   123: invokevirtual g_ : ()V
    //   126: aload_0
    //   127: dup
    //   128: getfield Qnq : I
    //   131: dup_x1
    //   132: iconst_1
    //   133: isub
    //   134: putfield Qnq : I
    //   137: ifgt -> 144
    //   140: aload_0
    //   141: invokevirtual g_ : ()V
    //   144: return
  }
  
  public gwy(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
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
    //   17: fconst_1
    //   18: putfield zGp : F
    //   21: aload_0
    //   22: fconst_1
    //   23: putfield DyG : F
    //   26: aload_0
    //   27: fconst_1
    //   28: putfield div : F
    //   31: aload_0
    //   32: bipush #32
    //   34: invokevirtual bzF : (I)V
    //   37: aload_0
    //   38: ldc 0.02
    //   40: ldc 0.02
    //   42: invokevirtual Dne : (FF)V
    //   45: aload_0
    //   46: dup
    //   47: getfield Qnq : F
    //   50: aload_0
    //   51: getfield Dne : Ljava/util/Random;
    //   54: invokevirtual nextFloat : ()F
    //   57: ldc 0.6
    //   59: fmul
    //   60: ldc 0.2
    //   62: fadd
    //   63: fmul
    //   64: putfield Qnq : F
    //   67: aload_0
    //   68: dload #8
    //   70: ldc2_w 0.20000000298023224
    //   73: dmul
    //   74: invokestatic random : ()D
    //   77: ldc2_w 2.0
    //   80: dmul
    //   81: dconst_1
    //   82: dsub
    //   83: d2f
    //   84: ldc 0.02
    //   86: fmul
    //   87: f2d
    //   88: dadd
    //   89: putfield XHL : D
    //   92: aload_0
    //   93: dload #10
    //   95: ldc2_w 0.20000000298023224
    //   98: dmul
    //   99: invokestatic random : ()D
    //   102: ldc2_w 2.0
    //   105: dmul
    //   106: dconst_1
    //   107: dsub
    //   108: d2f
    //   109: ldc 0.02
    //   111: fmul
    //   112: f2d
    //   113: dadd
    //   114: putfield Zpi : D
    //   117: aload_0
    //   118: dload #12
    //   120: ldc2_w 0.20000000298023224
    //   123: dmul
    //   124: invokestatic random : ()D
    //   127: ldc2_w 2.0
    //   130: dmul
    //   131: dconst_1
    //   132: dsub
    //   133: d2f
    //   134: ldc 0.02
    //   136: fmul
    //   137: f2d
    //   138: dadd
    //   139: putfield kGO : D
    //   142: aload_0
    //   143: ldc2_w 8.0
    //   146: invokestatic random : ()D
    //   149: ldc2_w 0.8
    //   152: dmul
    //   153: ldc2_w 0.2
    //   156: dadd
    //   157: ddiv
    //   158: d2i
    //   159: putfield Qnq : I
    //   162: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gwy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */