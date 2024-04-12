public class RPI extends ipD {
  private int FWm;
  
  public float FWm;
  
  public float Dne;
  
  public int Dne;
  
  public boolean Dne(int paramInt1, int paramInt2) {
    if (paramInt1 == 1) {
      this.Dne = paramInt2;
      return true;
    } 
    return super.Dne(paramInt1, paramInt2);
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield Dne : I
    //   5: iconst_1
    //   6: iadd
    //   7: putfield Dne : I
    //   10: aload_0
    //   11: getfield Dne : LQnq;
    //   14: aload_0
    //   15: getfield Qnq : I
    //   18: aload_0
    //   19: getfield aFZ : I
    //   22: aload_0
    //   23: getfield zGp : I
    //   26: getstatic zKP.wns : LzKP;
    //   29: getfield FWm : I
    //   32: iconst_1
    //   33: aload_0
    //   34: getfield Dne : I
    //   37: invokevirtual Qnq : (IIIIII)V
    //   40: return
  }
  
  public void zGp() {
    Qnq();
    super.zGp();
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield Dne : I
    //   5: iconst_1
    //   6: isub
    //   7: putfield Dne : I
    //   10: aload_0
    //   11: getfield Dne : LQnq;
    //   14: aload_0
    //   15: getfield Qnq : I
    //   18: aload_0
    //   19: getfield aFZ : I
    //   22: aload_0
    //   23: getfield zGp : I
    //   26: getstatic zKP.wns : LzKP;
    //   29: getfield FWm : I
    //   32: iconst_1
    //   33: aload_0
    //   34: getfield Dne : I
    //   37: invokevirtual Qnq : (IIIIII)V
    //   40: return
  }
  
  public boolean Dne(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield Qnq : I
    //   8: aload_0
    //   9: getfield aFZ : I
    //   12: aload_0
    //   13: getfield zGp : I
    //   16: invokevirtual Dne : (III)LipD;
    //   19: aload_0
    //   20: if_acmpeq -> 27
    //   23: iconst_0
    //   24: goto -> 70
    //   27: aload_1
    //   28: aload_0
    //   29: getfield Qnq : I
    //   32: i2d
    //   33: ldc2_w 0.5
    //   36: dadd
    //   37: aload_0
    //   38: getfield aFZ : I
    //   41: i2d
    //   42: ldc2_w 0.5
    //   45: dadd
    //   46: aload_0
    //   47: getfield zGp : I
    //   50: i2d
    //   51: ldc2_w 0.5
    //   54: dadd
    //   55: invokevirtual Dne : (DDD)D
    //   58: ldc2_w 64.0
    //   61: dcmpg
    //   62: ifgt -> 69
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iconst_0
    //   70: ireturn
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: dup
    //   6: getfield FWm : I
    //   9: iconst_1
    //   10: iadd
    //   11: dup_x1
    //   12: putfield FWm : I
    //   15: bipush #20
    //   17: irem
    //   18: iconst_4
    //   19: imul
    //   20: ifne -> 53
    //   23: aload_0
    //   24: getfield Dne : LQnq;
    //   27: aload_0
    //   28: getfield Qnq : I
    //   31: aload_0
    //   32: getfield aFZ : I
    //   35: aload_0
    //   36: getfield zGp : I
    //   39: getstatic zKP.wns : LzKP;
    //   42: getfield FWm : I
    //   45: iconst_1
    //   46: aload_0
    //   47: getfield Dne : I
    //   50: invokevirtual Qnq : (IIIIII)V
    //   53: aload_0
    //   54: aload_0
    //   55: getfield Dne : F
    //   58: putfield FWm : F
    //   61: ldc 0.1
    //   63: fstore_1
    //   64: aload_0
    //   65: getfield Dne : I
    //   68: ifle -> 140
    //   71: aload_0
    //   72: getfield Dne : F
    //   75: fconst_0
    //   76: fcmpl
    //   77: ifne -> 140
    //   80: aload_0
    //   81: getfield Qnq : I
    //   84: i2d
    //   85: ldc2_w 0.5
    //   88: dadd
    //   89: dstore #4
    //   91: aload_0
    //   92: getfield zGp : I
    //   95: i2d
    //   96: ldc2_w 0.5
    //   99: dadd
    //   100: dstore_2
    //   101: aload_0
    //   102: getfield Dne : LQnq;
    //   105: dload #4
    //   107: aload_0
    //   108: getfield aFZ : I
    //   111: i2d
    //   112: ldc2_w 0.5
    //   115: dadd
    //   116: dload_2
    //   117: ldc 'random.chestopen'
    //   119: ldc 0.5
    //   121: aload_0
    //   122: getfield Dne : LQnq;
    //   125: getfield Dne : Ljava/util/Random;
    //   128: invokevirtual nextFloat : ()F
    //   131: ldc 0.1
    //   133: fmul
    //   134: ldc 0.9
    //   136: fadd
    //   137: invokevirtual Dne : (DDDLjava/lang/String;FF)V
    //   140: aload_0
    //   141: getfield Dne : I
    //   144: ifne -> 156
    //   147: aload_0
    //   148: getfield Dne : F
    //   151: fconst_0
    //   152: fcmpl
    //   153: ifgt -> 172
    //   156: aload_0
    //   157: getfield Dne : I
    //   160: ifle -> 318
    //   163: aload_0
    //   164: getfield Dne : F
    //   167: fconst_1
    //   168: fcmpg
    //   169: ifge -> 318
    //   172: aload_0
    //   173: getfield Dne : F
    //   176: fstore #4
    //   178: aload_0
    //   179: getfield Dne : I
    //   182: ifle -> 198
    //   185: aload_0
    //   186: dup
    //   187: getfield Dne : F
    //   190: fload_1
    //   191: fadd
    //   192: putfield Dne : F
    //   195: goto -> 208
    //   198: aload_0
    //   199: dup
    //   200: getfield Dne : F
    //   203: fload_1
    //   204: fsub
    //   205: putfield Dne : F
    //   208: aload_0
    //   209: getfield Dne : F
    //   212: fconst_1
    //   213: fcmpl
    //   214: ifle -> 222
    //   217: aload_0
    //   218: fconst_1
    //   219: putfield Dne : F
    //   222: ldc 0.5
    //   224: fstore #5
    //   226: aload_0
    //   227: getfield Dne : F
    //   230: fload #5
    //   232: fcmpg
    //   233: ifge -> 304
    //   236: fload #4
    //   238: fload #5
    //   240: fcmpl
    //   241: iflt -> 304
    //   244: aload_0
    //   245: getfield Qnq : I
    //   248: i2d
    //   249: ldc2_w 0.5
    //   252: dadd
    //   253: dstore_2
    //   254: aload_0
    //   255: getfield zGp : I
    //   258: i2d
    //   259: ldc2_w 0.5
    //   262: dadd
    //   263: dstore #6
    //   265: aload_0
    //   266: getfield Dne : LQnq;
    //   269: dload_2
    //   270: aload_0
    //   271: getfield aFZ : I
    //   274: i2d
    //   275: ldc2_w 0.5
    //   278: dadd
    //   279: dload #6
    //   281: ldc 'random.chestclosed'
    //   283: ldc 0.5
    //   285: aload_0
    //   286: getfield Dne : LQnq;
    //   289: getfield Dne : Ljava/util/Random;
    //   292: invokevirtual nextFloat : ()F
    //   295: ldc 0.1
    //   297: fmul
    //   298: ldc 0.9
    //   300: fadd
    //   301: invokevirtual Dne : (DDDLjava/lang/String;FF)V
    //   304: aload_0
    //   305: getfield Dne : F
    //   308: fconst_0
    //   309: fcmpg
    //   310: ifge -> 318
    //   313: aload_0
    //   314: fconst_0
    //   315: putfield Dne : F
    //   318: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */