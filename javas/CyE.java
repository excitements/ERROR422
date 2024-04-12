public class CyE extends CAZ {
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
    //   29: aload_0
    //   30: getfield aFZ : F
    //   33: f2d
    //   34: dsub
    //   35: putfield Zpi : D
    //   38: aload_0
    //   39: aload_0
    //   40: getfield XHL : D
    //   43: aload_0
    //   44: getfield Zpi : D
    //   47: aload_0
    //   48: getfield kGO : D
    //   51: invokevirtual Dne : (DDD)V
    //   54: aload_0
    //   55: dup
    //   56: getfield XHL : D
    //   59: ldc2_w 0.9800000190734863
    //   62: dmul
    //   63: putfield XHL : D
    //   66: aload_0
    //   67: dup
    //   68: getfield Zpi : D
    //   71: ldc2_w 0.9800000190734863
    //   74: dmul
    //   75: putfield Zpi : D
    //   78: aload_0
    //   79: dup
    //   80: getfield kGO : D
    //   83: ldc2_w 0.9800000190734863
    //   86: dmul
    //   87: putfield kGO : D
    //   90: aload_0
    //   91: dup
    //   92: getfield Qnq : I
    //   95: dup_x1
    //   96: iconst_1
    //   97: isub
    //   98: putfield Qnq : I
    //   101: ifgt -> 108
    //   104: aload_0
    //   105: invokevirtual g_ : ()V
    //   108: aload_0
    //   109: getfield aFZ : Z
    //   112: ifeq -> 153
    //   115: invokestatic random : ()D
    //   118: ldc2_w 0.5
    //   121: dcmpg
    //   122: ifge -> 129
    //   125: aload_0
    //   126: invokevirtual g_ : ()V
    //   129: aload_0
    //   130: dup
    //   131: getfield XHL : D
    //   134: ldc2_w 0.699999988079071
    //   137: dmul
    //   138: putfield XHL : D
    //   141: aload_0
    //   142: dup
    //   143: getfield kGO : D
    //   146: ldc2_w 0.699999988079071
    //   149: dmul
    //   150: putfield kGO : D
    //   153: aload_0
    //   154: getfield Dne : LQnq;
    //   157: aload_0
    //   158: getfield div : D
    //   161: invokestatic FWm : (D)I
    //   164: aload_0
    //   165: getfield IjH : D
    //   168: invokestatic FWm : (D)I
    //   171: aload_0
    //   172: getfield mrb : D
    //   175: invokestatic FWm : (D)I
    //   178: invokevirtual Dne : (III)LKFd;
    //   181: astore_1
    //   182: aload_1
    //   183: invokevirtual Qnq : ()Z
    //   186: ifne -> 196
    //   189: aload_1
    //   190: invokevirtual Dne : ()Z
    //   193: ifeq -> 253
    //   196: aload_0
    //   197: getfield IjH : D
    //   200: invokestatic FWm : (D)I
    //   203: iconst_1
    //   204: iadd
    //   205: i2f
    //   206: aload_0
    //   207: getfield Dne : LQnq;
    //   210: aload_0
    //   211: getfield div : D
    //   214: invokestatic FWm : (D)I
    //   217: aload_0
    //   218: getfield IjH : D
    //   221: invokestatic FWm : (D)I
    //   224: aload_0
    //   225: getfield mrb : D
    //   228: invokestatic FWm : (D)I
    //   231: invokevirtual bzF : (III)I
    //   234: invokestatic Dne : (I)F
    //   237: fsub
    //   238: f2d
    //   239: dstore_2
    //   240: aload_0
    //   241: getfield IjH : D
    //   244: dload_2
    //   245: dcmpg
    //   246: ifge -> 253
    //   249: aload_0
    //   250: invokevirtual g_ : ()V
    //   253: return
  }
  
  public CyE(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: dload_2
    //   3: dload #4
    //   5: dload #6
    //   7: dconst_0
    //   8: dconst_0
    //   9: dconst_0
    //   10: invokespecial <init> : (LQnq;DDDDDD)V
    //   13: aload_0
    //   14: dup
    //   15: getfield XHL : D
    //   18: ldc2_w 0.30000001192092896
    //   21: dmul
    //   22: putfield XHL : D
    //   25: aload_0
    //   26: invokestatic random : ()D
    //   29: d2f
    //   30: ldc 0.2
    //   32: fmul
    //   33: ldc 0.1
    //   35: fadd
    //   36: f2d
    //   37: putfield Zpi : D
    //   40: aload_0
    //   41: dup
    //   42: getfield kGO : D
    //   45: ldc2_w 0.30000001192092896
    //   48: dmul
    //   49: putfield kGO : D
    //   52: aload_0
    //   53: fconst_1
    //   54: putfield zGp : F
    //   57: aload_0
    //   58: fconst_1
    //   59: putfield DyG : F
    //   62: aload_0
    //   63: fconst_1
    //   64: putfield div : F
    //   67: aload_0
    //   68: bipush #19
    //   70: aload_0
    //   71: getfield Dne : Ljava/util/Random;
    //   74: iconst_4
    //   75: invokevirtual nextInt : (I)I
    //   78: iadd
    //   79: invokevirtual bzF : (I)V
    //   82: aload_0
    //   83: ldc 0.01
    //   85: ldc 0.01
    //   87: invokevirtual Dne : (FF)V
    //   90: aload_0
    //   91: ldc 0.06
    //   93: putfield aFZ : F
    //   96: aload_0
    //   97: ldc2_w 8.0
    //   100: invokestatic random : ()D
    //   103: ldc2_w 0.8
    //   106: dmul
    //   107: ldc2_w 0.2
    //   110: dadd
    //   111: ddiv
    //   112: d2i
    //   113: putfield Qnq : I
    //   116: return
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CyE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */