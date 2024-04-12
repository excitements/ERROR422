public class cHg extends cMv {
  private FUH Dne;
  
  private int Dne;
  
  private double FWm;
  
  private double Dne = false;
  
  public cHg(FUH paramFUH) {
    this.Dne = paramFUH;
    Dne(3);
  }
  
  public void Dne() {
    // Byte code:
    //   0: ldc2_w 6.283185307179586
    //   3: aload_0
    //   4: getfield Dne : LFUH;
    //   7: invokevirtual Dne : ()Ljava/util/Random;
    //   10: invokevirtual nextDouble : ()D
    //   13: dmul
    //   14: dstore_1
    //   15: aload_0
    //   16: dload_1
    //   17: invokestatic cos : (D)D
    //   20: putfield Dne : D
    //   23: aload_0
    //   24: dload_1
    //   25: invokestatic sin : (D)D
    //   28: putfield FWm : D
    //   31: aload_0
    //   32: bipush #20
    //   34: aload_0
    //   35: getfield Dne : LFUH;
    //   38: invokevirtual Dne : ()Ljava/util/Random;
    //   41: bipush #20
    //   43: invokevirtual nextInt : (I)I
    //   46: iadd
    //   47: putfield Dne : I
    //   50: return
  }
  
  public boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LFUH;
    //   4: invokevirtual Dne : ()Ljava/util/Random;
    //   7: invokevirtual nextFloat : ()F
    //   10: ldc 0.02
    //   12: fcmpg
    //   13: ifge -> 20
    //   16: iconst_1
    //   17: goto -> 21
    //   20: iconst_0
    //   21: ireturn
  }
  
  public boolean FWm() {
    return (this.Dne >= 0.0D);
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
    //   11: getfield Dne : LFUH;
    //   14: invokevirtual Dne : ()LbvU;
    //   17: aload_0
    //   18: getfield Dne : LFUH;
    //   21: getfield div : D
    //   24: aload_0
    //   25: getfield Dne : D
    //   28: dadd
    //   29: aload_0
    //   30: getfield Dne : LFUH;
    //   33: getfield IjH : D
    //   36: aload_0
    //   37: getfield Dne : LFUH;
    //   40: invokevirtual c_ : ()F
    //   43: f2d
    //   44: dadd
    //   45: aload_0
    //   46: getfield Dne : LFUH;
    //   49: getfield mrb : D
    //   52: aload_0
    //   53: getfield FWm : D
    //   56: dadd
    //   57: ldc 10.0
    //   59: aload_0
    //   60: getfield Dne : LFUH;
    //   63: invokevirtual udO : ()I
    //   66: i2f
    //   67: invokevirtual Dne : (DDDFF)V
    //   70: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cHg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */