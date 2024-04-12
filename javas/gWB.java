public class gWB {
  private static chN Dne = chN.Dne(0.0D, 0.0D, 0.0D);
  
  private static chN bzF(kSJ paramkSJ, int paramInt1, int paramInt2, chN paramchN) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Dne : ()Ljava/util/Random;
    //   4: astore #4
    //   6: iconst_0
    //   7: istore #5
    //   9: iconst_0
    //   10: istore #6
    //   12: iconst_0
    //   13: istore #7
    //   15: iconst_0
    //   16: istore #8
    //   18: ldc -99999.0
    //   20: fstore #9
    //   22: aload_0
    //   23: invokevirtual RPx : ()Z
    //   26: ifeq -> 94
    //   29: aload_0
    //   30: invokevirtual FWm : ()LiSh;
    //   33: aload_0
    //   34: getfield div : D
    //   37: invokestatic FWm : (D)I
    //   40: aload_0
    //   41: getfield IjH : D
    //   44: invokestatic FWm : (D)I
    //   47: aload_0
    //   48: getfield mrb : D
    //   51: invokestatic FWm : (D)I
    //   54: invokevirtual Dne : (III)F
    //   57: ldc 4.0
    //   59: fadd
    //   60: f2d
    //   61: dstore #11
    //   63: aload_0
    //   64: invokevirtual zGp : ()F
    //   67: iload_1
    //   68: i2f
    //   69: fadd
    //   70: f2d
    //   71: dstore #13
    //   73: dload #11
    //   75: dload #13
    //   77: dload #13
    //   79: dmul
    //   80: dcmpg
    //   81: ifge -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: istore #10
    //   91: goto -> 97
    //   94: iconst_0
    //   95: istore #10
    //   97: iconst_0
    //   98: istore #11
    //   100: iload #11
    //   102: bipush #10
    //   104: if_icmpge -> 268
    //   107: aload #4
    //   109: iconst_2
    //   110: iload_1
    //   111: imul
    //   112: invokevirtual nextInt : (I)I
    //   115: iload_1
    //   116: isub
    //   117: istore #12
    //   119: aload #4
    //   121: iconst_2
    //   122: iload_2
    //   123: imul
    //   124: invokevirtual nextInt : (I)I
    //   127: iload_2
    //   128: isub
    //   129: istore #13
    //   131: aload #4
    //   133: iconst_2
    //   134: iload_1
    //   135: imul
    //   136: invokevirtual nextInt : (I)I
    //   139: iload_1
    //   140: isub
    //   141: istore #14
    //   143: aload_3
    //   144: ifnull -> 169
    //   147: iload #12
    //   149: i2d
    //   150: aload_3
    //   151: getfield Dne : D
    //   154: dmul
    //   155: iload #14
    //   157: i2d
    //   158: aload_3
    //   159: getfield bzF : D
    //   162: dmul
    //   163: dadd
    //   164: dconst_0
    //   165: dcmpl
    //   166: iflt -> 262
    //   169: iload #12
    //   171: aload_0
    //   172: getfield div : D
    //   175: invokestatic FWm : (D)I
    //   178: iadd
    //   179: istore #12
    //   181: iload #13
    //   183: aload_0
    //   184: getfield IjH : D
    //   187: invokestatic FWm : (D)I
    //   190: iadd
    //   191: istore #13
    //   193: iload #14
    //   195: aload_0
    //   196: getfield mrb : D
    //   199: invokestatic FWm : (D)I
    //   202: iadd
    //   203: istore #14
    //   205: iload #10
    //   207: ifeq -> 223
    //   210: aload_0
    //   211: iload #12
    //   213: iload #13
    //   215: iload #14
    //   217: invokevirtual Dne : (III)Z
    //   220: ifeq -> 262
    //   223: aload_0
    //   224: iload #12
    //   226: iload #13
    //   228: iload #14
    //   230: invokevirtual Dne : (III)F
    //   233: fstore #15
    //   235: fload #15
    //   237: fload #9
    //   239: fcmpl
    //   240: ifle -> 262
    //   243: fload #15
    //   245: fstore #9
    //   247: iload #12
    //   249: istore #6
    //   251: iload #13
    //   253: istore #7
    //   255: iload #14
    //   257: istore #8
    //   259: iconst_1
    //   260: istore #5
    //   262: iinc #11, 1
    //   265: goto -> 100
    //   268: iload #5
    //   270: ifeq -> 293
    //   273: aload_0
    //   274: getfield Dne : LQnq;
    //   277: invokevirtual Dne : ()LziS;
    //   280: iload #6
    //   282: i2d
    //   283: iload #7
    //   285: i2d
    //   286: iload #8
    //   288: i2d
    //   289: invokevirtual Dne : (DDD)LchN;
    //   292: areturn
    //   293: aconst_null
    //   294: areturn
  }
  
  public static chN Dne(kSJ paramkSJ, int paramInt1, int paramInt2, chN paramchN) {
    paramchN.Dne -= paramkSJ.div;
    paramchN.FWm -= paramkSJ.IjH;
    paramchN.bzF -= paramkSJ.mrb;
    return bzF(paramkSJ, paramInt1, paramInt2, Dne);
  }
  
  public static chN FWm(kSJ paramkSJ, int paramInt1, int paramInt2, chN paramchN) {
    Dne.Dne = paramkSJ.div - paramchN.Dne;
    Dne.FWm = paramkSJ.IjH - paramchN.FWm;
    Dne.bzF = paramkSJ.mrb - paramchN.bzF;
    return bzF(paramkSJ, paramInt1, paramInt2, Dne);
  }
  
  public static chN Dne(kSJ paramkSJ, int paramInt1, int paramInt2) {
    return bzF(paramkSJ, paramInt1, paramInt2, (chN)null);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gWB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */