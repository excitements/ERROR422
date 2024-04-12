public class uxW extends Pdb {
  private int bzF;
  
  private int Qnq;
  
  public MqS Dne;
  
  private int FWm;
  
  public Uqm Dne;
  
  private Qnq Dne = (Qnq)new Uqm(this, 3, 3);
  
  public void Dne(FiG paramFiG) {
    super.Dne(paramFiG);
    if (this.Dne.aFZ == null)
      for (byte b = 0; b < 9; b++) {
        NMq nMq = this.Dne.FWm(b);
        if (nMq != null)
          paramFiG.Dne(nMq); 
      }  
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: getfield bzF : Ljava/util/List;
    //   6: iload_2
    //   7: invokeinterface get : (I)Ljava/lang/Object;
    //   12: checkcast onZ
    //   15: astore #4
    //   17: aload #4
    //   19: ifnull -> 193
    //   22: aload #4
    //   24: invokevirtual Dne : ()Z
    //   27: ifeq -> 193
    //   30: aload #4
    //   32: invokevirtual Dne : ()LNMq;
    //   35: astore #5
    //   37: aload #5
    //   39: invokevirtual Dne : ()LNMq;
    //   42: astore_3
    //   43: iload_2
    //   44: ifne -> 74
    //   47: aload_0
    //   48: aload #5
    //   50: bipush #10
    //   52: bipush #46
    //   54: iconst_1
    //   55: invokevirtual Dne : (LNMq;IIZ)Z
    //   58: ifne -> 63
    //   61: aconst_null
    //   62: areturn
    //   63: aload #4
    //   65: aload #5
    //   67: aload_3
    //   68: invokevirtual Dne : (LNMq;LNMq;)V
    //   71: goto -> 146
    //   74: iload_2
    //   75: bipush #10
    //   77: if_icmplt -> 102
    //   80: iload_2
    //   81: bipush #37
    //   83: if_icmpge -> 102
    //   86: aload_0
    //   87: aload #5
    //   89: bipush #37
    //   91: bipush #46
    //   93: iconst_0
    //   94: invokevirtual Dne : (LNMq;IIZ)Z
    //   97: ifne -> 146
    //   100: aconst_null
    //   101: areturn
    //   102: iload_2
    //   103: bipush #37
    //   105: if_icmplt -> 130
    //   108: iload_2
    //   109: bipush #46
    //   111: if_icmpge -> 130
    //   114: aload_0
    //   115: aload #5
    //   117: bipush #10
    //   119: bipush #37
    //   121: iconst_0
    //   122: invokevirtual Dne : (LNMq;IIZ)Z
    //   125: ifne -> 146
    //   128: aconst_null
    //   129: areturn
    //   130: aload_0
    //   131: aload #5
    //   133: bipush #10
    //   135: bipush #46
    //   137: iconst_0
    //   138: invokevirtual Dne : (LNMq;IIZ)Z
    //   141: ifne -> 146
    //   144: aconst_null
    //   145: areturn
    //   146: aload #5
    //   148: getfield Dne : I
    //   151: ifne -> 166
    //   154: aload #4
    //   156: aconst_null
    //   157: checkcast NMq
    //   160: invokevirtual Dne : (LNMq;)V
    //   163: goto -> 171
    //   166: aload #4
    //   168: invokevirtual Dne : ()V
    //   171: aload #5
    //   173: getfield Dne : I
    //   176: aload_3
    //   177: getfield Dne : I
    //   180: if_icmpne -> 185
    //   183: aconst_null
    //   184: areturn
    //   185: aload #4
    //   187: aload_1
    //   188: aload #5
    //   190: invokevirtual Dne : (LFiG;LNMq;)V
    //   193: aload_3
    //   194: areturn
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne(this.FWm, this.bzF, this.Qnq) != zKP.mlD.FWm) ? false : ((paramFiG.Dne(this.FWm + 0.5D, this.bzF + 0.5D, this.Qnq + 0.5D) <= 64.0D));
  }
  
  public void Dne(MqS paramMqS) {
    this.Dne.Dne(0, aXt.Dne().Dne((Uqm)this.Dne, this.Dne));
  }
  
  public boolean Dne(NMq paramNMq, onZ paramonZ) {
    return (paramonZ.Dne != this.Dne && super.Dne(paramNMq, paramonZ));
  }
  
  public uxW(MOS paramMOS, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = (Qnq)new HuD();
    this.Dne = paramQnq;
    this.FWm = paramInt1;
    this.bzF = paramInt2;
    this.Qnq = paramInt3;
    Dne(new wEm(paramMOS.Dne, (MqS)this.Dne, (MqS)this.Dne, 0, 124, 35));
    byte b;
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 3; b1++)
        Dne(new onZ((MqS)this.Dne, b1 + b * 3, 30 + b1 * 18, 17 + b * 18)); 
    } 
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMOS, b1 + b * 9 + 9, 8 + b1 * 18, 84 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMOS, b, 8 + b * 18, 142)); 
    Dne((MqS)this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uxW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */