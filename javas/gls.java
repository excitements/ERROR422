public class gls extends LHi {
  private int ZgS;
  
  private int eHV;
  
  private int FWm;
  
  private int One;
  
  public int bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: ireturn
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: iload_1
    //   7: i2b
    //   8: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   11: invokevirtual FWm : (ILjava/lang/Object;)V
    //   14: return
  }
  
  protected int kGO() {
    return dEr.cot.Qnq;
  }
  
  public float bzF(float paramFloat) {
    return (this.FWm + (this.One - this.FWm) * paramFloat) / (this.ZgS - 2);
  }
  
  protected void Dne(float paramFloat) {
    super.Dne(paramFloat);
    this.One = (int)(this.One + paramFloat * 1.5F);
    if (this.One > this.ZgS - 5)
      this.One = this.ZgS - 5; 
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: iconst_m1
    //   11: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   14: invokevirtual Dne : (ILjava/lang/Object;)V
    //   17: aload_0
    //   18: getfield Dne : LluM;
    //   21: bipush #17
    //   23: iconst_0
    //   24: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   27: invokevirtual Dne : (ILjava/lang/Object;)V
    //   30: return
  }
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial FWm : (LWkD;)V
    //   5: aload_0
    //   6: getfield Dne : LluM;
    //   9: bipush #17
    //   11: aload_1
    //   12: ldc 'powered'
    //   14: invokevirtual FWm : (Ljava/lang/String;)Z
    //   17: ifeq -> 24
    //   20: iconst_1
    //   21: goto -> 25
    //   24: iconst_0
    //   25: i2b
    //   26: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   29: invokevirtual FWm : (ILjava/lang/Object;)V
    //   32: aload_1
    //   33: ldc 'Fuse'
    //   35: invokevirtual Dne : (Ljava/lang/String;)Z
    //   38: ifeq -> 51
    //   41: aload_0
    //   42: aload_1
    //   43: ldc 'Fuse'
    //   45: invokevirtual Dne : (Ljava/lang/String;)S
    //   48: putfield ZgS : I
    //   51: aload_1
    //   52: ldc 'ExplosionRadius'
    //   54: invokevirtual Dne : (Ljava/lang/String;)Z
    //   57: ifeq -> 70
    //   60: aload_0
    //   61: aload_1
    //   62: ldc 'ExplosionRadius'
    //   64: invokevirtual Dne : (Ljava/lang/String;)B
    //   67: putfield eHV : I
    //   70: return
  }
  
  public boolean tgc() {
    return true;
  }
  
  public boolean LVR() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #17
    //   6: invokevirtual Dne : (I)B
    //   9: iconst_1
    //   10: if_icmpne -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: ireturn
  }
  
  public void Dne(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial Dne : (LWkD;)V
    //   5: aload_0
    //   6: getfield Dne : LluM;
    //   9: bipush #17
    //   11: invokevirtual Dne : (I)B
    //   14: iconst_1
    //   15: if_icmpne -> 25
    //   18: aload_1
    //   19: ldc 'powered'
    //   21: iconst_1
    //   22: invokevirtual Dne : (Ljava/lang/String;Z)V
    //   25: aload_1
    //   26: ldc 'Fuse'
    //   28: aload_0
    //   29: getfield ZgS : I
    //   32: i2s
    //   33: invokevirtual Dne : (Ljava/lang/String;S)V
    //   36: aload_1
    //   37: ldc 'ExplosionRadius'
    //   39: aload_0
    //   40: getfield eHV : I
    //   43: i2b
    //   44: invokevirtual Dne : (Ljava/lang/String;B)V
    //   47: return
  }
  
  public int FWm() {
    return (bzF() == null) ? 3 : (3 + this.Vxn - 1);
  }
  
  public boolean bzF(sMa paramsMa) {
    return true;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual udO : ()Z
    //   4: ifeq -> 174
    //   7: aload_0
    //   8: aload_0
    //   9: getfield One : I
    //   12: putfield FWm : I
    //   15: aload_0
    //   16: invokevirtual bzF : ()I
    //   19: istore_1
    //   20: iload_1
    //   21: ifle -> 40
    //   24: aload_0
    //   25: getfield One : I
    //   28: ifne -> 40
    //   31: aload_0
    //   32: ldc 'random.fuse'
    //   34: fconst_1
    //   35: ldc 0.5
    //   37: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   40: aload_0
    //   41: dup
    //   42: getfield One : I
    //   45: iload_1
    //   46: iadd
    //   47: putfield One : I
    //   50: aload_0
    //   51: getfield One : I
    //   54: ifge -> 62
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield One : I
    //   62: aload_0
    //   63: getfield One : I
    //   66: aload_0
    //   67: getfield ZgS : I
    //   70: if_icmplt -> 174
    //   73: aload_0
    //   74: aload_0
    //   75: getfield ZgS : I
    //   78: putfield One : I
    //   81: aload_0
    //   82: getfield Dne : LQnq;
    //   85: getfield aFZ : Z
    //   88: ifne -> 174
    //   91: aload_0
    //   92: getfield Dne : LQnq;
    //   95: invokevirtual Dne : ()LaSc;
    //   98: ldc 'mobGriefing'
    //   100: invokevirtual Dne : (Ljava/lang/String;)Z
    //   103: istore_2
    //   104: aload_0
    //   105: invokevirtual LVR : ()Z
    //   108: ifeq -> 143
    //   111: aload_0
    //   112: getfield Dne : LQnq;
    //   115: aload_0
    //   116: aload_0
    //   117: getfield div : D
    //   120: aload_0
    //   121: getfield IjH : D
    //   124: aload_0
    //   125: getfield mrb : D
    //   128: aload_0
    //   129: getfield eHV : I
    //   132: iconst_2
    //   133: imul
    //   134: i2f
    //   135: iload_2
    //   136: invokevirtual Dne : (LsMa;DDDFZ)LyTR;
    //   139: pop
    //   140: goto -> 170
    //   143: aload_0
    //   144: getfield Dne : LQnq;
    //   147: aload_0
    //   148: aload_0
    //   149: getfield div : D
    //   152: aload_0
    //   153: getfield IjH : D
    //   156: aload_0
    //   157: getfield mrb : D
    //   160: aload_0
    //   161: getfield eHV : I
    //   164: i2f
    //   165: iload_2
    //   166: invokevirtual Dne : (LsMa;DDDFZ)LyTR;
    //   169: pop
    //   170: aload_0
    //   171: invokevirtual g_ : ()V
    //   174: aload_0
    //   175: invokespecial Dne : ()V
    //   178: return
  }
  
  protected String DyG() {
    return "mob.creeper.say";
  }
  
  public int Dne() {
    return 20;
  }
  
  protected String div() {
    return "mob.creeper.death";
  }
  
  public void Dne(zBn paramzBn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial Dne : (LzBn;)V
    //   5: aload_1
    //   6: invokevirtual FWm : ()LsMa;
    //   9: instanceof yXX
    //   12: ifeq -> 52
    //   15: getstatic dEr.iTJ : LdEr;
    //   18: getfield Qnq : I
    //   21: aload_0
    //   22: getfield Dne : Ljava/util/Random;
    //   25: getstatic dEr.elJ : LdEr;
    //   28: getfield Qnq : I
    //   31: getstatic dEr.iTJ : LdEr;
    //   34: getfield Qnq : I
    //   37: isub
    //   38: iconst_1
    //   39: iadd
    //   40: invokevirtual nextInt : (I)I
    //   43: iadd
    //   44: istore_2
    //   45: aload_0
    //   46: iload_2
    //   47: iconst_1
    //   48: invokevirtual Dne : (II)LJiM;
    //   51: pop
    //   52: return
  }
  
  public void Dne(xIh paramxIh) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial Dne : (LxIh;)V
    //   5: aload_0
    //   6: getfield Dne : LluM;
    //   9: bipush #17
    //   11: iconst_1
    //   12: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   15: invokevirtual FWm : (ILjava/lang/Object;)V
    //   18: return
  }
  
  public gls(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: bipush #30
    //   8: putfield ZgS : I
    //   11: aload_0
    //   12: iconst_3
    //   13: putfield eHV : I
    //   16: aload_0
    //   17: ldc '/mob/creeper.png'
    //   19: putfield bzF : Ljava/lang/String;
    //   22: aload_0
    //   23: getfield Dne : LOKo;
    //   26: iconst_1
    //   27: new Cyb
    //   30: dup
    //   31: aload_0
    //   32: invokespecial <init> : (LFUH;)V
    //   35: invokevirtual Dne : (ILcMv;)V
    //   38: aload_0
    //   39: getfield Dne : LOKo;
    //   42: iconst_2
    //   43: new VOo
    //   46: dup
    //   47: aload_0
    //   48: invokespecial <init> : (Lgls;)V
    //   51: invokevirtual Dne : (ILcMv;)V
    //   54: aload_0
    //   55: getfield Dne : LOKo;
    //   58: iconst_3
    //   59: new RlP
    //   62: dup
    //   63: aload_0
    //   64: ldc kQo
    //   66: ldc 6.0
    //   68: ldc 0.25
    //   70: ldc 0.3
    //   72: invokespecial <init> : (LkSJ;Ljava/lang/Class;FFF)V
    //   75: invokevirtual Dne : (ILcMv;)V
    //   78: aload_0
    //   79: getfield Dne : LOKo;
    //   82: iconst_4
    //   83: new etz
    //   86: dup
    //   87: aload_0
    //   88: ldc 0.25
    //   90: iconst_0
    //   91: invokespecial <init> : (LFUH;FZ)V
    //   94: invokevirtual Dne : (ILcMv;)V
    //   97: aload_0
    //   98: getfield Dne : LOKo;
    //   101: iconst_5
    //   102: new IBw
    //   105: dup
    //   106: aload_0
    //   107: ldc 0.2
    //   109: invokespecial <init> : (LkSJ;F)V
    //   112: invokevirtual Dne : (ILcMv;)V
    //   115: aload_0
    //   116: getfield Dne : LOKo;
    //   119: bipush #6
    //   121: new yws
    //   124: dup
    //   125: aload_0
    //   126: ldc FiG
    //   128: ldc 8.0
    //   130: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   133: invokevirtual Dne : (ILcMv;)V
    //   136: aload_0
    //   137: getfield Dne : LOKo;
    //   140: bipush #6
    //   142: new cHg
    //   145: dup
    //   146: aload_0
    //   147: invokespecial <init> : (LFUH;)V
    //   150: invokevirtual Dne : (ILcMv;)V
    //   153: aload_0
    //   154: getfield FWm : LOKo;
    //   157: iconst_1
    //   158: new AmF
    //   161: dup
    //   162: aload_0
    //   163: ldc FiG
    //   165: ldc 16.0
    //   167: iconst_0
    //   168: iconst_1
    //   169: invokespecial <init> : (LFUH;Ljava/lang/Class;FIZ)V
    //   172: invokevirtual Dne : (ILcMv;)V
    //   175: aload_0
    //   176: getfield FWm : LOKo;
    //   179: iconst_2
    //   180: new QRF
    //   183: dup
    //   184: aload_0
    //   185: iconst_0
    //   186: invokespecial <init> : (LFUH;Z)V
    //   189: invokevirtual Dne : (ILcMv;)V
    //   192: bipush #20
    //   194: invokestatic Dne : (I)I
    //   197: ifne -> 205
    //   200: aload_0
    //   201: iconst_1
    //   202: putfield ZgS : I
    //   205: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */