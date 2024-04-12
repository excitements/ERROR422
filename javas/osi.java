public class osi extends LHi {
  public int Dne() {
    return 16;
  }
  
  protected String div() {
    return "mob.spider.death";
  }
  
  protected String zGp() {
    return "mob.spider.say";
  }
  
  static {
  
  }
  
  public boolean LVR() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: iconst_1
    //   10: iand
    //   11: ifeq -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: ireturn
  }
  
  public void ICU() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield Dne : Ljava/util/Random;
    //   7: bipush #100
    //   9: invokevirtual nextInt : (I)I
    //   12: ifne -> 66
    //   15: new yXX
    //   18: dup
    //   19: aload_0
    //   20: getfield Dne : LQnq;
    //   23: invokespecial <init> : (LQnq;)V
    //   26: astore_1
    //   27: aload_1
    //   28: aload_0
    //   29: getfield div : D
    //   32: aload_0
    //   33: getfield IjH : D
    //   36: aload_0
    //   37: getfield mrb : D
    //   40: aload_0
    //   41: getfield mrb : F
    //   44: fconst_0
    //   45: invokevirtual FWm : (DDDFF)V
    //   48: aload_1
    //   49: invokevirtual ICU : ()V
    //   52: aload_0
    //   53: getfield Dne : LQnq;
    //   56: aload_1
    //   57: invokevirtual FWm : (LsMa;)Z
    //   60: pop
    //   61: aload_1
    //   62: aload_0
    //   63: invokevirtual bzF : (LsMa;)V
    //   66: return
  }
  
  public float XHL() {
    return 1.0F;
  }
  
  protected String DyG() {
    return "mob.spider.say";
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: new java/lang/Byte
    //   13: dup
    //   14: iconst_0
    //   15: invokespecial <init> : (B)V
    //   18: invokevirtual Dne : (ILjava/lang/Object;)V
    //   21: return
  }
  
  public double aFZ() {
    return this.trS * 0.75D - 0.5D;
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: fconst_1
    //   2: invokevirtual Dne : (F)F
    //   5: fstore_3
    //   6: fload_3
    //   7: ldc 0.5
    //   9: fcmpl
    //   10: ifle -> 33
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/Random;
    //   17: bipush #100
    //   19: invokevirtual nextInt : (I)I
    //   22: ifne -> 33
    //   25: aload_0
    //   26: aconst_null
    //   27: putfield bzF : LsMa;
    //   30: goto -> 173
    //   33: fload_2
    //   34: fconst_2
    //   35: fcmpl
    //   36: ifle -> 167
    //   39: fload_2
    //   40: ldc 6.0
    //   42: fcmpg
    //   43: ifge -> 167
    //   46: aload_0
    //   47: getfield Dne : Ljava/util/Random;
    //   50: bipush #10
    //   52: invokevirtual nextInt : (I)I
    //   55: ifne -> 167
    //   58: aload_0
    //   59: getfield aFZ : Z
    //   62: ifeq -> 173
    //   65: aload_1
    //   66: getfield div : D
    //   69: aload_0
    //   70: getfield div : D
    //   73: dsub
    //   74: dstore #4
    //   76: aload_1
    //   77: getfield mrb : D
    //   80: aload_0
    //   81: getfield mrb : D
    //   84: dsub
    //   85: dstore #6
    //   87: dload #4
    //   89: dload #4
    //   91: dmul
    //   92: dload #6
    //   94: dload #6
    //   96: dmul
    //   97: dadd
    //   98: invokestatic Dne : (D)F
    //   101: fstore #8
    //   103: aload_0
    //   104: dload #4
    //   106: fload #8
    //   108: f2d
    //   109: ddiv
    //   110: ldc2_w 0.5
    //   113: dmul
    //   114: ldc2_w 0.800000011920929
    //   117: dmul
    //   118: aload_0
    //   119: getfield XHL : D
    //   122: ldc2_w 0.20000000298023224
    //   125: dmul
    //   126: dadd
    //   127: putfield XHL : D
    //   130: aload_0
    //   131: dload #6
    //   133: fload #8
    //   135: f2d
    //   136: ddiv
    //   137: ldc2_w 0.5
    //   140: dmul
    //   141: ldc2_w 0.800000011920929
    //   144: dmul
    //   145: aload_0
    //   146: getfield kGO : D
    //   149: ldc2_w 0.20000000298023224
    //   152: dmul
    //   153: dadd
    //   154: putfield kGO : D
    //   157: aload_0
    //   158: ldc2_w 0.4000000059604645
    //   161: putfield Zpi : D
    //   164: goto -> 173
    //   167: aload_0
    //   168: aload_1
    //   169: fload_2
    //   170: invokespecial Dne : (LsMa;F)V
    //   173: return
  }
  
  public void tgc() {}
  
  public void Dne() {
    super.Dne();
    if (this.Dne.aFZ == null)
      FWm(this.zGp); 
  }
  
  public osi(Qnq paramQnq) {
    super(paramQnq);
    Dne(1.4F, 0.9F);
    this.cHy = 0.8F;
  }
  
  public aYc Dne() {
    return aYc.bzF;
  }
  
  public boolean div() {
    return LVR();
  }
  
  public void FWm(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: istore_2
    //   10: iload_1
    //   11: ifeq -> 22
    //   14: iload_2
    //   15: iconst_1
    //   16: ior
    //   17: i2b
    //   18: istore_2
    //   19: goto -> 28
    //   22: iload_2
    //   23: bipush #-2
    //   25: iand
    //   26: i2b
    //   27: istore_2
    //   28: aload_0
    //   29: getfield Dne : LluM;
    //   32: bipush #16
    //   34: iload_2
    //   35: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   38: invokevirtual FWm : (ILjava/lang/Object;)V
    //   41: return
  }
  
  public boolean Dne(NAx paramNAx) {
    return (paramNAx.Dne() == SXd.ceE.Dne) ? false : super.Dne(paramNAx);
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial Dne : (ZI)V
    //   6: iload_1
    //   7: ifeq -> 46
    //   10: aload_0
    //   11: getfield Dne : Ljava/util/Random;
    //   14: iconst_3
    //   15: invokevirtual nextInt : (I)I
    //   18: ifeq -> 34
    //   21: aload_0
    //   22: getfield Dne : Ljava/util/Random;
    //   25: iconst_1
    //   26: iload_2
    //   27: iadd
    //   28: invokevirtual nextInt : (I)I
    //   31: ifle -> 46
    //   34: aload_0
    //   35: getstatic dEr.EYV : LdEr;
    //   38: getfield Qnq : I
    //   41: iconst_1
    //   42: invokevirtual Dne : (II)LJiM;
    //   45: pop
    //   46: return
  }
  
  protected int kGO() {
    return dEr.AgF.Qnq;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.spider.step", 0.15F, 1.0F);
  }
  
  protected sMa Dne() {
    // Byte code:
    //   0: aload_0
    //   1: fconst_1
    //   2: invokevirtual Dne : (F)F
    //   5: fstore_1
    //   6: fload_1
    //   7: ldc 0.5
    //   9: fcmpg
    //   10: ifge -> 27
    //   13: ldc2_w 16.0
    //   16: dstore_2
    //   17: aload_0
    //   18: getfield Dne : LQnq;
    //   21: aload_0
    //   22: dload_2
    //   23: invokevirtual FWm : (LsMa;D)LFiG;
    //   26: areturn
    //   27: aconst_null
    //   28: areturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\osi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */