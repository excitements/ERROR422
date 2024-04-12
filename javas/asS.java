public class asS extends CAZ {
  private float Dne;
  
  public asS(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
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
    //   18: ldc2_w 0.800000011920929
    //   21: dmul
    //   22: putfield XHL : D
    //   25: aload_0
    //   26: dup
    //   27: getfield Zpi : D
    //   30: ldc2_w 0.800000011920929
    //   33: dmul
    //   34: putfield Zpi : D
    //   37: aload_0
    //   38: dup
    //   39: getfield kGO : D
    //   42: ldc2_w 0.800000011920929
    //   45: dmul
    //   46: putfield kGO : D
    //   49: aload_0
    //   50: aload_0
    //   51: getfield Dne : Ljava/util/Random;
    //   54: invokevirtual nextFloat : ()F
    //   57: ldc 0.4
    //   59: fmul
    //   60: ldc 0.05
    //   62: fadd
    //   63: f2d
    //   64: putfield Zpi : D
    //   67: aload_0
    //   68: aload_0
    //   69: aload_0
    //   70: fconst_1
    //   71: dup_x1
    //   72: putfield div : F
    //   75: dup_x1
    //   76: putfield DyG : F
    //   79: putfield zGp : F
    //   82: aload_0
    //   83: dup
    //   84: getfield Qnq : F
    //   87: aload_0
    //   88: getfield Dne : Ljava/util/Random;
    //   91: invokevirtual nextFloat : ()F
    //   94: fconst_2
    //   95: fmul
    //   96: ldc 0.2
    //   98: fadd
    //   99: fmul
    //   100: putfield Qnq : F
    //   103: aload_0
    //   104: aload_0
    //   105: getfield Qnq : F
    //   108: putfield Dne : F
    //   111: aload_0
    //   112: ldc2_w 16.0
    //   115: invokestatic random : ()D
    //   118: ldc2_w 0.8
    //   121: dmul
    //   122: ldc2_w 0.2
    //   125: dadd
    //   126: ddiv
    //   127: d2i
    //   128: putfield Qnq : I
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield kGO : Z
    //   136: aload_0
    //   137: bipush #49
    //   139: invokevirtual bzF : (I)V
    //   142: return
  }
  
  public int Dne(float paramFloat) {
    float f = (this.bzF + paramFloat) / this.Qnq;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    int i = super.Dne(paramFloat);
    char c = 'ð';
    int j = i >> 16 & 0xFF;
    return c | j << 16;
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f = (this.bzF + paramFloat1) / this.Qnq;
    this.Qnq = this.Dne * (1.0F - f * f);
    super.Dne(paramWAR, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public float Dne(float paramFloat) {
    return 1.0F;
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
    //   26: getfield bzF : I
    //   29: dup_x1
    //   30: iconst_1
    //   31: iadd
    //   32: putfield bzF : I
    //   35: aload_0
    //   36: getfield Qnq : I
    //   39: if_icmplt -> 46
    //   42: aload_0
    //   43: invokevirtual g_ : ()V
    //   46: aload_0
    //   47: getfield bzF : I
    //   50: i2f
    //   51: aload_0
    //   52: getfield Qnq : I
    //   55: i2f
    //   56: fdiv
    //   57: fstore_1
    //   58: aload_0
    //   59: getfield Dne : Ljava/util/Random;
    //   62: invokevirtual nextFloat : ()F
    //   65: fload_1
    //   66: fcmpl
    //   67: ifle -> 103
    //   70: aload_0
    //   71: getfield Dne : LQnq;
    //   74: ldc 'smoke'
    //   76: aload_0
    //   77: getfield div : D
    //   80: aload_0
    //   81: getfield IjH : D
    //   84: aload_0
    //   85: getfield mrb : D
    //   88: aload_0
    //   89: getfield XHL : D
    //   92: aload_0
    //   93: getfield Zpi : D
    //   96: aload_0
    //   97: getfield kGO : D
    //   100: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   103: aload_0
    //   104: dup
    //   105: getfield Zpi : D
    //   108: ldc2_w 0.03
    //   111: dsub
    //   112: putfield Zpi : D
    //   115: aload_0
    //   116: aload_0
    //   117: getfield XHL : D
    //   120: aload_0
    //   121: getfield Zpi : D
    //   124: aload_0
    //   125: getfield kGO : D
    //   128: invokevirtual Dne : (DDD)V
    //   131: aload_0
    //   132: dup
    //   133: getfield XHL : D
    //   136: ldc2_w 0.9990000128746033
    //   139: dmul
    //   140: putfield XHL : D
    //   143: aload_0
    //   144: dup
    //   145: getfield Zpi : D
    //   148: ldc2_w 0.9990000128746033
    //   151: dmul
    //   152: putfield Zpi : D
    //   155: aload_0
    //   156: dup
    //   157: getfield kGO : D
    //   160: ldc2_w 0.9990000128746033
    //   163: dmul
    //   164: putfield kGO : D
    //   167: aload_0
    //   168: getfield aFZ : Z
    //   171: ifeq -> 198
    //   174: aload_0
    //   175: dup
    //   176: getfield XHL : D
    //   179: ldc2_w 0.699999988079071
    //   182: dmul
    //   183: putfield XHL : D
    //   186: aload_0
    //   187: dup
    //   188: getfield kGO : D
    //   191: ldc2_w 0.699999988079071
    //   194: dmul
    //   195: putfield kGO : D
    //   198: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\asS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */