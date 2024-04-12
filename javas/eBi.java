public class eBi extends zxd {
  private int FWm = 0;
  
  private int One = 0;
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Anger", (short)this.FWm);
  }
  
  public void ICU() {
    super.ICU();
    IjH(false);
  }
  
  public eBi(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected boolean tgc() {
    return false;
  }
  
  private void FWm(sMa paramsMa) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield bzF : LsMa;
    //   5: aload_0
    //   6: sipush #400
    //   9: aload_0
    //   10: getfield Dne : Ljava/util/Random;
    //   13: sipush #400
    //   16: invokevirtual nextInt : (I)I
    //   19: iadd
    //   20: putfield FWm : I
    //   23: aload_0
    //   24: aload_0
    //   25: getfield Dne : Ljava/util/Random;
    //   28: bipush #40
    //   30: invokevirtual nextInt : (I)I
    //   33: putfield One : I
    //   36: return
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    this.FWm = paramWkD.Dne("Anger");
  }
  
  public boolean a_(FiG paramFiG) {
    return false;
  }
  
  protected sMa Dne() {
    return (this.FWm == 0) ? null : super.Dne();
  }
  
  protected void qrB() {
    a_(0, new NMq(dEr.Fnk));
  }
  
  protected int kGO() {
    return dEr.gvF.Qnq;
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: iconst_2
    //   5: iload_2
    //   6: iadd
    //   7: invokevirtual nextInt : (I)I
    //   10: istore_3
    //   11: iconst_0
    //   12: istore #4
    //   14: iload #4
    //   16: iload_3
    //   17: if_icmpge -> 38
    //   20: aload_0
    //   21: getstatic dEr.gvF : LdEr;
    //   24: getfield Qnq : I
    //   27: iconst_1
    //   28: invokevirtual Dne : (II)LJiM;
    //   31: pop
    //   32: iinc #4, 1
    //   35: goto -> 14
    //   38: aload_0
    //   39: getfield Dne : Ljava/util/Random;
    //   42: iconst_2
    //   43: iload_2
    //   44: iadd
    //   45: invokevirtual nextInt : (I)I
    //   48: istore_3
    //   49: iconst_0
    //   50: istore #4
    //   52: iload #4
    //   54: iload_3
    //   55: if_icmpge -> 76
    //   58: aload_0
    //   59: getstatic dEr.uzC : LdEr;
    //   62: getfield Qnq : I
    //   65: iconst_1
    //   66: invokevirtual Dne : (II)LJiM;
    //   69: pop
    //   70: iinc #4, 1
    //   73: goto -> 52
    //   76: return
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual EyB : ()Z
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: invokevirtual FWm : ()LsMa;
    //   13: astore_3
    //   14: aload_3
    //   15: instanceof FiG
    //   18: ifeq -> 108
    //   21: aload_0
    //   22: getfield Dne : LQnq;
    //   25: aload_0
    //   26: aload_0
    //   27: getfield Dne : LbSp;
    //   30: ldc2_w 32.0
    //   33: ldc2_w 32.0
    //   36: ldc2_w 32.0
    //   39: invokevirtual FWm : (DDD)LbSp;
    //   42: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   45: astore #4
    //   47: iconst_0
    //   48: istore #5
    //   50: iload #5
    //   52: aload #4
    //   54: invokeinterface size : ()I
    //   59: if_icmpge -> 103
    //   62: aload #4
    //   64: iload #5
    //   66: invokeinterface get : (I)Ljava/lang/Object;
    //   71: checkcast sMa
    //   74: astore #6
    //   76: aload #6
    //   78: instanceof eBi
    //   81: ifeq -> 97
    //   84: aload #6
    //   86: checkcast eBi
    //   89: astore #7
    //   91: aload #7
    //   93: aload_3
    //   94: invokespecial FWm : (LsMa;)V
    //   97: iinc #5, 1
    //   100: goto -> 50
    //   103: aload_0
    //   104: aload_3
    //   105: invokespecial FWm : (LsMa;)V
    //   108: aload_0
    //   109: aload_1
    //   110: iload_2
    //   111: invokespecial Dne : (LzBn;I)Z
    //   114: ireturn
  }
  
  public String bzF() {
    return "/mob/pigzombie.png";
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield bzF : LsMa;
    //   5: ifnull -> 13
    //   8: ldc 0.95
    //   10: goto -> 15
    //   13: ldc 0.5
    //   15: putfield cHy : F
    //   18: aload_0
    //   19: getfield One : I
    //   22: ifle -> 74
    //   25: aload_0
    //   26: dup
    //   27: getfield One : I
    //   30: iconst_1
    //   31: isub
    //   32: dup_x1
    //   33: putfield One : I
    //   36: ifne -> 74
    //   39: aload_0
    //   40: ldc 'mob.zombiepig.zpigangry'
    //   42: aload_0
    //   43: invokevirtual div : ()F
    //   46: fconst_2
    //   47: fmul
    //   48: aload_0
    //   49: getfield Dne : Ljava/util/Random;
    //   52: invokevirtual nextFloat : ()F
    //   55: aload_0
    //   56: getfield Dne : Ljava/util/Random;
    //   59: invokevirtual nextFloat : ()F
    //   62: fsub
    //   63: ldc 0.2
    //   65: fmul
    //   66: fconst_1
    //   67: fadd
    //   68: ldc 1.8
    //   70: fmul
    //   71: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   74: aload_0
    //   75: invokespecial Dne : ()V
    //   78: return
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
  
  protected void IjH(int paramInt) {
    Dne(dEr.mrb.Qnq, 1);
  }
  
  protected String DyG() {
    return "mob.zombiepig.zpighurt";
  }
  
  public int Dne(sMa paramsMa) {
    NMq nMq = Dne();
    int i = 5;
    if (nMq != null)
      i += nMq.Dne(this); 
    return i;
  }
  
  protected String zGp() {
    return "mob.zombiepig.zpig";
  }
  
  protected String div() {
    return "mob.zombiepig.zpigdeath";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eBi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */