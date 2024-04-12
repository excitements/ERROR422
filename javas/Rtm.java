public class Rtm extends CAZ {
  private int ceE = 0;
  
  private int Vxn = 0;
  
  public Rtm(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.ceE = 8;
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
  
  public int Dne() {
    return 1;
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: bipush #6
    //   5: if_icmpge -> 119
    //   8: aload_0
    //   9: getfield div : D
    //   12: aload_0
    //   13: getfield Dne : Ljava/util/Random;
    //   16: invokevirtual nextDouble : ()D
    //   19: aload_0
    //   20: getfield Dne : Ljava/util/Random;
    //   23: invokevirtual nextDouble : ()D
    //   26: dsub
    //   27: ldc2_w 4.0
    //   30: dmul
    //   31: dadd
    //   32: dstore_2
    //   33: aload_0
    //   34: getfield IjH : D
    //   37: aload_0
    //   38: getfield Dne : Ljava/util/Random;
    //   41: invokevirtual nextDouble : ()D
    //   44: aload_0
    //   45: getfield Dne : Ljava/util/Random;
    //   48: invokevirtual nextDouble : ()D
    //   51: dsub
    //   52: ldc2_w 4.0
    //   55: dmul
    //   56: dadd
    //   57: dstore #4
    //   59: aload_0
    //   60: getfield mrb : D
    //   63: aload_0
    //   64: getfield Dne : Ljava/util/Random;
    //   67: invokevirtual nextDouble : ()D
    //   70: aload_0
    //   71: getfield Dne : Ljava/util/Random;
    //   74: invokevirtual nextDouble : ()D
    //   77: dsub
    //   78: ldc2_w 4.0
    //   81: dmul
    //   82: dadd
    //   83: dstore #6
    //   85: aload_0
    //   86: getfield Dne : LQnq;
    //   89: ldc 'largeexplode'
    //   91: dload_2
    //   92: dload #4
    //   94: dload #6
    //   96: aload_0
    //   97: getfield Vxn : I
    //   100: i2f
    //   101: aload_0
    //   102: getfield ceE : I
    //   105: i2f
    //   106: fdiv
    //   107: f2d
    //   108: dconst_0
    //   109: dconst_0
    //   110: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   113: iinc #1, 1
    //   116: goto -> 2
    //   119: aload_0
    //   120: dup
    //   121: getfield Vxn : I
    //   124: iconst_1
    //   125: iadd
    //   126: putfield Vxn : I
    //   129: aload_0
    //   130: getfield Vxn : I
    //   133: aload_0
    //   134: getfield ceE : I
    //   137: if_icmpne -> 144
    //   140: aload_0
    //   141: invokevirtual g_ : ()V
    //   144: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Rtm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */