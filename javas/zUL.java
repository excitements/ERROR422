public class zUL extends CAZ {
  private int ceE = 0;
  
  private String bzF;
  
  private int Vxn = 0;
  
  private sMa bzF;
  
  public int Dne() {
    return 3;
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
  
  public zUL(Qnq paramQnq, sMa paramsMa, String paramString) {
    super(paramQnq, paramsMa.div, paramsMa.Dne.FWm + (paramsMa.trS / 2.0F), paramsMa.mrb, paramsMa.XHL, paramsMa.Zpi, paramsMa.kGO);
    this.bzF = paramsMa;
    this.ceE = 3;
    this.bzF = (sMa)paramString;
    Dne();
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: bipush #16
    //   5: if_icmpge -> 189
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/Random;
    //   12: invokevirtual nextFloat : ()F
    //   15: fconst_2
    //   16: fmul
    //   17: fconst_1
    //   18: fsub
    //   19: f2d
    //   20: dstore_2
    //   21: aload_0
    //   22: getfield Dne : Ljava/util/Random;
    //   25: invokevirtual nextFloat : ()F
    //   28: fconst_2
    //   29: fmul
    //   30: fconst_1
    //   31: fsub
    //   32: f2d
    //   33: dstore #4
    //   35: aload_0
    //   36: getfield Dne : Ljava/util/Random;
    //   39: invokevirtual nextFloat : ()F
    //   42: fconst_2
    //   43: fmul
    //   44: fconst_1
    //   45: fsub
    //   46: f2d
    //   47: dstore #6
    //   49: dload_2
    //   50: dload_2
    //   51: dmul
    //   52: dload #4
    //   54: dload #4
    //   56: dmul
    //   57: dadd
    //   58: dload #6
    //   60: dload #6
    //   62: dmul
    //   63: dadd
    //   64: dconst_1
    //   65: dcmpg
    //   66: ifgt -> 183
    //   69: aload_0
    //   70: getfield bzF : LsMa;
    //   73: getfield div : D
    //   76: dload_2
    //   77: aload_0
    //   78: getfield bzF : LsMa;
    //   81: getfield ooe : F
    //   84: f2d
    //   85: dmul
    //   86: ldc2_w 4.0
    //   89: ddiv
    //   90: dadd
    //   91: dstore #8
    //   93: aload_0
    //   94: getfield bzF : LsMa;
    //   97: getfield Dne : LbSp;
    //   100: getfield FWm : D
    //   103: aload_0
    //   104: getfield bzF : LsMa;
    //   107: getfield trS : F
    //   110: fconst_2
    //   111: fdiv
    //   112: f2d
    //   113: dadd
    //   114: dload #4
    //   116: aload_0
    //   117: getfield bzF : LsMa;
    //   120: getfield trS : F
    //   123: f2d
    //   124: dmul
    //   125: ldc2_w 4.0
    //   128: ddiv
    //   129: dadd
    //   130: dstore #10
    //   132: aload_0
    //   133: getfield bzF : LsMa;
    //   136: getfield mrb : D
    //   139: dload #6
    //   141: aload_0
    //   142: getfield bzF : LsMa;
    //   145: getfield ooe : F
    //   148: f2d
    //   149: dmul
    //   150: ldc2_w 4.0
    //   153: ddiv
    //   154: dadd
    //   155: dstore #12
    //   157: aload_0
    //   158: getfield Dne : LQnq;
    //   161: aload_0
    //   162: getfield bzF : Ljava/lang/String;
    //   165: dload #8
    //   167: dload #10
    //   169: dload #12
    //   171: dload_2
    //   172: dload #4
    //   174: ldc2_w 0.2
    //   177: dadd
    //   178: dload #6
    //   180: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   183: iinc #1, 1
    //   186: goto -> 2
    //   189: aload_0
    //   190: dup
    //   191: getfield Vxn : I
    //   194: iconst_1
    //   195: iadd
    //   196: putfield Vxn : I
    //   199: aload_0
    //   200: getfield Vxn : I
    //   203: aload_0
    //   204: getfield ceE : I
    //   207: if_icmplt -> 214
    //   210: aload_0
    //   211: invokevirtual g_ : ()V
    //   214: return
  }
  
  public zUL(Qnq paramQnq, sMa paramsMa) {
    this(paramQnq, paramsMa, "crit");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zUL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */