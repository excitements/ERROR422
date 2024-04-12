public class bhy extends Pdb {
  private int bzF = 0;
  
  private int FWm = 0;
  
  private lqs Dne;
  
  private int Qnq = 0;
  
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
    //   19: ifnull -> 252
    //   22: aload #4
    //   24: invokevirtual Dne : ()Z
    //   27: ifeq -> 252
    //   30: aload #4
    //   32: invokevirtual Dne : ()LNMq;
    //   35: astore #5
    //   37: aload #5
    //   39: invokevirtual Dne : ()LNMq;
    //   42: astore_3
    //   43: iload_2
    //   44: iconst_2
    //   45: if_icmpne -> 74
    //   48: aload_0
    //   49: aload #5
    //   51: iconst_3
    //   52: bipush #39
    //   54: iconst_1
    //   55: invokevirtual Dne : (LNMq;IIZ)Z
    //   58: ifne -> 63
    //   61: aconst_null
    //   62: areturn
    //   63: aload #4
    //   65: aload #5
    //   67: aload_3
    //   68: invokevirtual Dne : (LNMq;LNMq;)V
    //   71: goto -> 205
    //   74: iload_2
    //   75: iconst_1
    //   76: if_icmpeq -> 190
    //   79: iload_2
    //   80: ifeq -> 190
    //   83: invokestatic Dne : ()LcTN;
    //   86: aload #5
    //   88: invokevirtual Dne : ()LdEr;
    //   91: getfield Qnq : I
    //   94: invokevirtual Dne : (I)LNMq;
    //   97: ifnull -> 114
    //   100: aload_0
    //   101: aload #5
    //   103: iconst_0
    //   104: iconst_1
    //   105: iconst_0
    //   106: invokevirtual Dne : (LNMq;IIZ)Z
    //   109: ifne -> 205
    //   112: aconst_null
    //   113: areturn
    //   114: aload #5
    //   116: invokestatic Dne : (LNMq;)Z
    //   119: ifeq -> 136
    //   122: aload_0
    //   123: aload #5
    //   125: iconst_1
    //   126: iconst_2
    //   127: iconst_0
    //   128: invokevirtual Dne : (LNMq;IIZ)Z
    //   131: ifne -> 205
    //   134: aconst_null
    //   135: areturn
    //   136: iload_2
    //   137: iconst_3
    //   138: if_icmplt -> 163
    //   141: iload_2
    //   142: bipush #30
    //   144: if_icmpge -> 163
    //   147: aload_0
    //   148: aload #5
    //   150: bipush #30
    //   152: bipush #39
    //   154: iconst_0
    //   155: invokevirtual Dne : (LNMq;IIZ)Z
    //   158: ifne -> 205
    //   161: aconst_null
    //   162: areturn
    //   163: iload_2
    //   164: bipush #30
    //   166: if_icmplt -> 205
    //   169: iload_2
    //   170: bipush #39
    //   172: if_icmpge -> 205
    //   175: aload_0
    //   176: aload #5
    //   178: iconst_3
    //   179: bipush #30
    //   181: iconst_0
    //   182: invokevirtual Dne : (LNMq;IIZ)Z
    //   185: ifne -> 205
    //   188: aconst_null
    //   189: areturn
    //   190: aload_0
    //   191: aload #5
    //   193: iconst_3
    //   194: bipush #39
    //   196: iconst_0
    //   197: invokevirtual Dne : (LNMq;IIZ)Z
    //   200: ifne -> 205
    //   203: aconst_null
    //   204: areturn
    //   205: aload #5
    //   207: getfield Dne : I
    //   210: ifne -> 225
    //   213: aload #4
    //   215: aconst_null
    //   216: checkcast NMq
    //   219: invokevirtual Dne : (LNMq;)V
    //   222: goto -> 230
    //   225: aload #4
    //   227: invokevirtual Dne : ()V
    //   230: aload #5
    //   232: getfield Dne : I
    //   235: aload_3
    //   236: getfield Dne : I
    //   239: if_icmpne -> 244
    //   242: aconst_null
    //   243: areturn
    //   244: aload #4
    //   246: aload_1
    //   247: aload #5
    //   249: invokevirtual Dne : (LFiG;LNMq;)V
    //   252: aload_3
    //   253: areturn
  }
  
  public bhy(MOS paramMOS, lqs paramlqs) {
    this.Dne = paramlqs;
    Dne(new onZ(paramlqs, 0, 56, 17));
    Dne(new onZ(paramlqs, 1, 56, 53));
    Dne(new DQp(paramMOS.Dne, paramlqs, 2, 116, 35));
    byte b;
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMOS, b1 + b * 9 + 9, 8 + b1 * 18, 84 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMOS, b, 8 + b * 18, 142)); 
  }
  
  public boolean Dne(FiG paramFiG) {
    return this.Dne.Dne(paramFiG);
  }
  
  public void Dne(mXX parammXX) {
    super.Dne(parammXX);
    parammXX.Dne(this, 0, this.Dne.bzF);
    parammXX.Dne(this, 1, this.Dne.Dne);
    parammXX.Dne(this, 2, this.Dne.FWm);
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    if (paramInt1 == 0)
      this.Dne.bzF = paramInt2; 
    if (paramInt1 == 1)
      this.Dne.Dne = paramInt2; 
    if (paramInt1 == 2)
      this.Dne.FWm = paramInt2; 
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: iconst_0
    //   5: istore_1
    //   6: iload_1
    //   7: aload_0
    //   8: getfield Qnq : Ljava/util/List;
    //   11: invokeinterface size : ()I
    //   16: if_icmpge -> 126
    //   19: aload_0
    //   20: getfield Qnq : Ljava/util/List;
    //   23: iload_1
    //   24: invokeinterface get : (I)Ljava/lang/Object;
    //   29: checkcast mXX
    //   32: astore_2
    //   33: aload_0
    //   34: getfield FWm : I
    //   37: aload_0
    //   38: getfield Dne : Llqs;
    //   41: getfield bzF : I
    //   44: if_icmpeq -> 62
    //   47: aload_2
    //   48: aload_0
    //   49: iconst_0
    //   50: aload_0
    //   51: getfield Dne : Llqs;
    //   54: getfield bzF : I
    //   57: invokeinterface Dne : (LPdb;II)V
    //   62: aload_0
    //   63: getfield bzF : I
    //   66: aload_0
    //   67: getfield Dne : Llqs;
    //   70: getfield Dne : I
    //   73: if_icmpeq -> 91
    //   76: aload_2
    //   77: aload_0
    //   78: iconst_1
    //   79: aload_0
    //   80: getfield Dne : Llqs;
    //   83: getfield Dne : I
    //   86: invokeinterface Dne : (LPdb;II)V
    //   91: aload_0
    //   92: getfield Qnq : I
    //   95: aload_0
    //   96: getfield Dne : Llqs;
    //   99: getfield FWm : I
    //   102: if_icmpeq -> 120
    //   105: aload_2
    //   106: aload_0
    //   107: iconst_2
    //   108: aload_0
    //   109: getfield Dne : Llqs;
    //   112: getfield FWm : I
    //   115: invokeinterface Dne : (LPdb;II)V
    //   120: iinc #1, 1
    //   123: goto -> 6
    //   126: aload_0
    //   127: aload_0
    //   128: getfield Dne : Llqs;
    //   131: getfield bzF : I
    //   134: putfield FWm : I
    //   137: aload_0
    //   138: aload_0
    //   139: getfield Dne : Llqs;
    //   142: getfield Dne : I
    //   145: putfield bzF : I
    //   148: aload_0
    //   149: aload_0
    //   150: getfield Dne : Llqs;
    //   153: getfield FWm : I
    //   156: putfield Qnq : I
    //   159: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bhy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */