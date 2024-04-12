public class Ndk extends sMa {
  public int FWm;
  
  public int Dne;
  
  public Ndk(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    this(paramQnq);
    bzF(paramDouble1, paramDouble2, paramDouble3);
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #8
    //   6: aload_0
    //   7: getfield FWm : I
    //   10: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13: invokevirtual Dne : (ILjava/lang/Object;)V
    //   16: return
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual EyB : ()Z
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield Zpi : Z
    //   13: ifne -> 79
    //   16: aload_0
    //   17: getfield Dne : LQnq;
    //   20: getfield aFZ : Z
    //   23: ifne -> 79
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield FWm : I
    //   31: aload_0
    //   32: getfield FWm : I
    //   35: ifgt -> 79
    //   38: aload_0
    //   39: invokevirtual g_ : ()V
    //   42: aload_0
    //   43: getfield Dne : LQnq;
    //   46: getfield aFZ : Z
    //   49: ifne -> 79
    //   52: aload_0
    //   53: getfield Dne : LQnq;
    //   56: aconst_null
    //   57: checkcast sMa
    //   60: aload_0
    //   61: getfield div : D
    //   64: aload_0
    //   65: getfield IjH : D
    //   68: aload_0
    //   69: getfield mrb : D
    //   72: ldc 6.0
    //   74: iconst_1
    //   75: invokevirtual Dne : (LsMa;DDDFZ)LyTR;
    //   78: pop
    //   79: iconst_1
    //   80: ireturn
  }
  
  public boolean kGO() {
    return true;
  }
  
  public Ndk(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield Dne : I
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield bzF : Z
    //   15: aload_0
    //   16: fconst_2
    //   17: fconst_2
    //   18: invokevirtual Dne : (FF)V
    //   21: aload_0
    //   22: aload_0
    //   23: getfield trS : F
    //   26: fconst_2
    //   27: fdiv
    //   28: putfield udO : F
    //   31: aload_0
    //   32: iconst_5
    //   33: putfield FWm : I
    //   36: aload_0
    //   37: aload_0
    //   38: getfield Dne : Ljava/util/Random;
    //   41: ldc 100000
    //   43: invokevirtual nextInt : (I)I
    //   46: putfield Dne : I
    //   49: return
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
    //   26: getfield Dne : I
    //   29: iconst_1
    //   30: iadd
    //   31: putfield Dne : I
    //   34: aload_0
    //   35: getfield Dne : LluM;
    //   38: bipush #8
    //   40: aload_0
    //   41: getfield FWm : I
    //   44: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   47: invokevirtual FWm : (ILjava/lang/Object;)V
    //   50: aload_0
    //   51: getfield div : D
    //   54: invokestatic FWm : (D)I
    //   57: istore_1
    //   58: aload_0
    //   59: getfield IjH : D
    //   62: invokestatic FWm : (D)I
    //   65: istore_2
    //   66: aload_0
    //   67: getfield mrb : D
    //   70: invokestatic FWm : (D)I
    //   73: istore_3
    //   74: aload_0
    //   75: getfield Dne : LQnq;
    //   78: iload_1
    //   79: iload_2
    //   80: iload_3
    //   81: invokevirtual Dne : (III)I
    //   84: getstatic zKP.Dne : Liqp;
    //   87: getfield FWm : I
    //   90: if_icmpeq -> 110
    //   93: aload_0
    //   94: getfield Dne : LQnq;
    //   97: iload_1
    //   98: iload_2
    //   99: iload_3
    //   100: getstatic zKP.Dne : Liqp;
    //   103: getfield FWm : I
    //   106: invokevirtual FWm : (IIII)Z
    //   109: pop
    //   110: return
  }
  
  public float Dne() {
    return 0.0F;
  }
  
  protected void FWm(WkD paramWkD) {}
  
  protected void Dne(WkD paramWkD) {}
  
  protected boolean FWm() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ndk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */