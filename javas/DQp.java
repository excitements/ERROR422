public class DQp extends onZ {
  private FiG Dne;
  
  private int Dne;
  
  protected void FWm(NMq paramNMq) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield Dne : LFiG;
    //   5: getfield Dne : LQnq;
    //   8: aload_0
    //   9: getfield Dne : LFiG;
    //   12: aload_0
    //   13: getfield Dne : I
    //   16: invokevirtual Dne : (LQnq;LFiG;I)V
    //   19: aload_0
    //   20: getfield Dne : LFiG;
    //   23: getfield Dne : LQnq;
    //   26: getfield aFZ : Z
    //   29: ifne -> 182
    //   32: aload_0
    //   33: getfield Dne : I
    //   36: istore_2
    //   37: invokestatic Dne : ()LcTN;
    //   40: aload_1
    //   41: getfield bzF : I
    //   44: invokevirtual Dne : (I)F
    //   47: fstore_3
    //   48: fload_3
    //   49: fconst_0
    //   50: fcmpl
    //   51: ifne -> 59
    //   54: iconst_0
    //   55: istore_2
    //   56: goto -> 108
    //   59: fload_3
    //   60: fconst_1
    //   61: fcmpg
    //   62: ifge -> 108
    //   65: iload_2
    //   66: i2f
    //   67: fload_3
    //   68: fmul
    //   69: invokestatic Dne : (F)I
    //   72: istore #4
    //   74: iload #4
    //   76: iload_2
    //   77: i2f
    //   78: fload_3
    //   79: fmul
    //   80: invokestatic FWm : (F)I
    //   83: if_icmpge -> 105
    //   86: invokestatic random : ()D
    //   89: d2f
    //   90: iload_2
    //   91: i2f
    //   92: fload_3
    //   93: fmul
    //   94: iload #4
    //   96: i2f
    //   97: fsub
    //   98: fcmpg
    //   99: ifge -> 105
    //   102: iinc #4, 1
    //   105: iload #4
    //   107: istore_2
    //   108: iload_2
    //   109: ifle -> 182
    //   112: iload_2
    //   113: invokestatic Dne : (I)I
    //   116: istore #4
    //   118: iload_2
    //   119: iload #4
    //   121: isub
    //   122: istore_2
    //   123: aload_0
    //   124: getfield Dne : LFiG;
    //   127: getfield Dne : LQnq;
    //   130: new alg
    //   133: dup
    //   134: aload_0
    //   135: getfield Dne : LFiG;
    //   138: getfield Dne : LQnq;
    //   141: aload_0
    //   142: getfield Dne : LFiG;
    //   145: getfield div : D
    //   148: aload_0
    //   149: getfield Dne : LFiG;
    //   152: getfield IjH : D
    //   155: ldc2_w 0.5
    //   158: dadd
    //   159: aload_0
    //   160: getfield Dne : LFiG;
    //   163: getfield mrb : D
    //   166: ldc2_w 0.5
    //   169: dadd
    //   170: iload #4
    //   172: invokespecial <init> : (LQnq;DDDI)V
    //   175: invokevirtual FWm : (LsMa;)Z
    //   178: pop
    //   179: goto -> 108
    //   182: aload_0
    //   183: iconst_0
    //   184: putfield Dne : I
    //   187: aload_1
    //   188: getfield bzF : I
    //   191: getstatic dEr.IjH : LdEr;
    //   194: getfield Qnq : I
    //   197: if_icmpne -> 211
    //   200: aload_0
    //   201: getfield Dne : LFiG;
    //   204: getstatic qlg.zGp : LAuk;
    //   207: iconst_1
    //   208: invokevirtual Dne : (LRLC;I)V
    //   211: aload_1
    //   212: getfield bzF : I
    //   215: getstatic dEr.kSP : LdEr;
    //   218: getfield Qnq : I
    //   221: if_icmpne -> 235
    //   224: aload_0
    //   225: getfield Dne : LFiG;
    //   228: getstatic qlg.XHL : LAuk;
    //   231: iconst_1
    //   232: invokevirtual Dne : (LRLC;I)V
    //   235: return
  }
  
  public boolean Dne(NMq paramNMq) {
    return false;
  }
  
  public void Dne(FiG paramFiG, NMq paramNMq) {
    FWm(paramNMq);
    super.Dne(paramFiG, paramNMq);
  }
  
  protected void Dne(NMq paramNMq, int paramInt) {
    this.Dne += paramInt;
    FWm(paramNMq);
  }
  
  public NMq Dne(int paramInt) {
    if (Dne())
      this.Dne += Math.min(paramInt, (Dne()).Dne); 
    return super.Dne(paramInt);
  }
  
  public DQp(FiG paramFiG, MqS paramMqS, int paramInt1, int paramInt2, int paramInt3) {
    super(paramMqS, paramInt1, paramInt2, paramInt3);
    this.Dne = paramFiG;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DQp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */