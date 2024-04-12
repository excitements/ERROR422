public class wBN extends HzK {
  protected void Dne(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: iconst_3
    //   5: invokevirtual nextInt : (I)I
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/Random;
    //   12: iconst_1
    //   13: iload_2
    //   14: iadd
    //   15: invokevirtual nextInt : (I)I
    //   18: iadd
    //   19: istore_3
    //   20: iconst_0
    //   21: istore #4
    //   23: iload #4
    //   25: iload_3
    //   26: if_icmpge -> 47
    //   29: aload_0
    //   30: getstatic dEr.LoG : LdEr;
    //   33: getfield Qnq : I
    //   36: iconst_1
    //   37: invokevirtual Dne : (II)LJiM;
    //   40: pop
    //   41: iinc #4, 1
    //   44: goto -> 23
    //   47: aload_0
    //   48: getfield Dne : Ljava/util/Random;
    //   51: iconst_3
    //   52: invokevirtual nextInt : (I)I
    //   55: iconst_1
    //   56: iadd
    //   57: aload_0
    //   58: getfield Dne : Ljava/util/Random;
    //   61: iconst_1
    //   62: iload_2
    //   63: iadd
    //   64: invokevirtual nextInt : (I)I
    //   67: iadd
    //   68: istore_3
    //   69: iconst_0
    //   70: istore #4
    //   72: iload #4
    //   74: iload_3
    //   75: if_icmpge -> 118
    //   78: aload_0
    //   79: invokevirtual trS : ()Z
    //   82: ifeq -> 100
    //   85: aload_0
    //   86: getstatic dEr.mzX : LdEr;
    //   89: getfield Qnq : I
    //   92: iconst_1
    //   93: invokevirtual Dne : (II)LJiM;
    //   96: pop
    //   97: goto -> 112
    //   100: aload_0
    //   101: getstatic dEr.ipf : LdEr;
    //   104: getfield Qnq : I
    //   107: iconst_1
    //   108: invokevirtual Dne : (II)LJiM;
    //   111: pop
    //   112: iinc #4, 1
    //   115: goto -> 72
    //   118: return
  }
  
  static {
  
  }
  
  public int Dne() {
    return 10;
  }
  
  public boolean a_(FiG paramFiG) {
    NMq nMq = paramFiG.Dne.Dne();
    if (nMq != null && nMq.bzF == dEr.qMV.Qnq) {
      dEr dEr = dEr.EwP;
      if (eCD.Dne(3) == 0)
        dEr = (eCD.Dne(2) == 0) ? dEr.xXN : dEr.cHy; 
      if (--nMq.Dne <= 0) {
        paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, new NMq(dEr));
      } else if (!paramFiG.Dne.Dne(new NMq(dEr))) {
        paramFiG.Dne(new NMq(dEr.Qnq, 1, 0));
      } 
      return true;
    } 
    return super.a_(paramFiG);
  }
  
  protected String DyG() {
    return "mob.cow.hurt";
  }
  
  public boolean tgc() {
    return true;
  }
  
  protected String div() {
    return "mob.cow.hurt";
  }
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  protected int kGO() {
    return dEr.LoG.Qnq;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.cow.step", 0.15F, 1.0F);
  }
  
  protected String zGp() {
    return "mob.cow.say";
  }
  
  public wBN Dne(Azh paramAzh) {
    return new wBN(this.Dne);
  }
  
  public wBN(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: ldc '/mob/cow.png'
    //   8: putfield bzF : Ljava/lang/String;
    //   11: aload_0
    //   12: ldc 0.9
    //   14: ldc 1.3
    //   16: invokevirtual Dne : (FF)V
    //   19: aload_0
    //   20: invokevirtual Dne : ()LKFZ;
    //   23: iconst_1
    //   24: invokevirtual Dne : (Z)V
    //   27: aload_0
    //   28: getfield Dne : LOKo;
    //   31: iconst_0
    //   32: new Cyb
    //   35: dup
    //   36: aload_0
    //   37: invokespecial <init> : (LFUH;)V
    //   40: invokevirtual Dne : (ILcMv;)V
    //   43: aload_0
    //   44: getfield Dne : LOKo;
    //   47: iconst_1
    //   48: new xkg
    //   51: dup
    //   52: aload_0
    //   53: ldc 0.38
    //   55: invokespecial <init> : (LkSJ;F)V
    //   58: invokevirtual Dne : (ILcMv;)V
    //   61: aload_0
    //   62: getfield Dne : LOKo;
    //   65: iconst_2
    //   66: new znX
    //   69: dup
    //   70: aload_0
    //   71: ldc 0.2
    //   73: invokespecial <init> : (LHzK;F)V
    //   76: invokevirtual Dne : (ILcMv;)V
    //   79: aload_0
    //   80: getfield Dne : LOKo;
    //   83: iconst_3
    //   84: new cnh
    //   87: dup
    //   88: aload_0
    //   89: ldc 0.25
    //   91: getstatic dEr.EWz : LdEr;
    //   94: getfield Qnq : I
    //   97: iconst_0
    //   98: invokespecial <init> : (LkSJ;FIZ)V
    //   101: invokevirtual Dne : (ILcMv;)V
    //   104: aload_0
    //   105: getfield Dne : LOKo;
    //   108: iconst_4
    //   109: new NSW
    //   112: dup
    //   113: aload_0
    //   114: ldc 0.25
    //   116: invokespecial <init> : (LHzK;F)V
    //   119: invokevirtual Dne : (ILcMv;)V
    //   122: aload_0
    //   123: getfield Dne : LOKo;
    //   126: iconst_5
    //   127: new IBw
    //   130: dup
    //   131: aload_0
    //   132: ldc 0.2
    //   134: invokespecial <init> : (LkSJ;F)V
    //   137: invokevirtual Dne : (ILcMv;)V
    //   140: aload_0
    //   141: getfield Dne : LOKo;
    //   144: bipush #6
    //   146: new yws
    //   149: dup
    //   150: aload_0
    //   151: ldc FiG
    //   153: ldc 6.0
    //   155: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   158: invokevirtual Dne : (ILcMv;)V
    //   161: aload_0
    //   162: getfield Dne : LOKo;
    //   165: bipush #7
    //   167: new cHg
    //   170: dup
    //   171: aload_0
    //   172: invokespecial <init> : (LFUH;)V
    //   175: invokevirtual Dne : (ILcMv;)V
    //   178: return
  }
  
  protected float div() {
    return 0.4F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wBN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */