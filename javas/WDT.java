public class WDT extends Tgj {
  static {
  
  }
  
  public boolean trS() {
    return false;
  }
  
  public boolean DyG() {
    return false;
  }
  
  public WDT(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected int qLR() {
    return super.qLR() + 2;
  }
  
  public int Dne(float paramFloat) {
    return 15728880;
  }
  
  protected void Qnq() {
    this.Dne *= 0.9F;
  }
  
  protected int kGO() {
    return dEr.sJS.Qnq;
  }
  
  protected void Dne(float paramFloat) {}
  
  protected String mrb() {
    return (ATE() > 1) ? "mob.magmacube.big" : "mob.magmacube.small";
  }
  
  protected boolean haP() {
    return true;
  }
  
  protected Tgj Dne() {
    return new WDT(this.Dne);
  }
  
  protected boolean qrB() {
    return true;
  }
  
  protected String div() {
    return "mob.slime." + ((ATE() > 1) ? "big" : "small");
  }
  
  protected void One() {
    this.Zpi = (0.42F + ATE() * 0.1F);
    this.ATE = true;
  }
  
  public boolean cot() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : I
    //   7: ifle -> 62
    //   10: aload_0
    //   11: getfield Dne : LQnq;
    //   14: aload_0
    //   15: getfield Dne : LbSp;
    //   18: invokevirtual Dne : (LbSp;)Z
    //   21: ifeq -> 62
    //   24: aload_0
    //   25: getfield Dne : LQnq;
    //   28: aload_0
    //   29: aload_0
    //   30: getfield Dne : LbSp;
    //   33: invokevirtual Dne : (LsMa;LbSp;)Ljava/util/List;
    //   36: invokeinterface isEmpty : ()Z
    //   41: ifeq -> 62
    //   44: aload_0
    //   45: getfield Dne : LQnq;
    //   48: aload_0
    //   49: getfield Dne : LbSp;
    //   52: invokevirtual bzF : (LbSp;)Z
    //   55: ifne -> 62
    //   58: iconst_1
    //   59: goto -> 63
    //   62: iconst_0
    //   63: ireturn
  }
  
  protected String FWm() {
    return "flame";
  }
  
  public float Dne(float paramFloat) {
    return 1.0F;
  }
  
  public int Zpi() {
    return ATE() * 3;
  }
  
  protected int bzF() {
    return super.bzF() * 4;
  }
  
  protected String DyG() {
    return "mob.slime." + ((ATE() > 1) ? "big" : "small");
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual kGO : ()I
    //   4: istore_3
    //   5: iload_3
    //   6: ifle -> 71
    //   9: aload_0
    //   10: invokevirtual ATE : ()I
    //   13: iconst_1
    //   14: if_icmple -> 71
    //   17: aload_0
    //   18: getfield Dne : Ljava/util/Random;
    //   21: iconst_4
    //   22: invokevirtual nextInt : (I)I
    //   25: iconst_2
    //   26: isub
    //   27: istore #4
    //   29: iload_2
    //   30: ifle -> 48
    //   33: iload #4
    //   35: aload_0
    //   36: getfield Dne : Ljava/util/Random;
    //   39: iload_2
    //   40: iconst_1
    //   41: iadd
    //   42: invokevirtual nextInt : (I)I
    //   45: iadd
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 71
    //   58: aload_0
    //   59: iload_3
    //   60: iconst_1
    //   61: invokevirtual Dne : (II)LJiM;
    //   64: pop
    //   65: iinc #5, 1
    //   68: goto -> 51
    //   71: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WDT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */