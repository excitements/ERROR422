public class lqs extends ipD implements FMb {
  public int FWm;
  
  private NMq[] Dne;
  
  private static final int[] bzF;
  
  private static final int[] FWm;
  
  private String Dne;
  
  public int Dne = new NMq[3];
  
  private static final int[] Dne = new int[] { 0 };
  
  public int bzF;
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne(this.Qnq, this.aFZ, this.zGp) != this) ? false : ((paramFiG.Dne(this.Qnq + 0.5D, this.aFZ + 0.5D, this.zGp + 0.5D) <= 64.0D));
  }
  
  public boolean Dne(int paramInt1, NMq paramNMq, int paramInt2) {
    return Dne(paramInt1, paramNMq);
  }
  
  public lqs() {
    this.Dne = false;
    this.FWm = false;
    this.bzF = 0;
  }
  
  public NMq Dne(int paramInt) {
    return this.Dne[paramInt];
  }
  
  public void Dne(String paramString) {
    this.Dne = (int[])paramString;
  }
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      int i = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return i;
    } 
    return null;
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = paramNMq;
    if (paramNMq != null && paramNMq.Dne > aFZ())
      paramNMq.Dne = aFZ(); 
  }
  
  static {
    FWm = new int[] { 2, 1 };
    bzF = new int[] { 1 };
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LNMq;
    //   4: iload_1
    //   5: aaload
    //   6: ifnull -> 70
    //   9: aload_0
    //   10: getfield Dne : [LNMq;
    //   13: iload_1
    //   14: aaload
    //   15: getfield Dne : I
    //   18: iload_2
    //   19: if_icmpgt -> 38
    //   22: aload_0
    //   23: getfield Dne : [LNMq;
    //   26: iload_1
    //   27: aaload
    //   28: astore_3
    //   29: aload_0
    //   30: getfield Dne : [LNMq;
    //   33: iload_1
    //   34: aconst_null
    //   35: aastore
    //   36: aload_3
    //   37: areturn
    //   38: aload_0
    //   39: getfield Dne : [LNMq;
    //   42: iload_1
    //   43: aaload
    //   44: iload_2
    //   45: invokevirtual Dne : (I)LNMq;
    //   48: astore_3
    //   49: aload_0
    //   50: getfield Dne : [LNMq;
    //   53: iload_1
    //   54: aaload
    //   55: getfield Dne : I
    //   58: ifne -> 68
    //   61: aload_0
    //   62: getfield Dne : [LNMq;
    //   65: iload_1
    //   66: aconst_null
    //   67: aastore
    //   68: aload_3
    //   69: areturn
    //   70: aconst_null
    //   71: areturn
  }
  
  public boolean FWm(int paramInt1, NMq paramNMq, int paramInt2) {
    return (paramInt2 != 0 || paramInt1 != 1 || paramNMq.bzF == dEr.qMV.Qnq);
  }
  
  private boolean bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LNMq;
    //   4: iconst_0
    //   5: aaload
    //   6: ifnonnull -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: invokestatic Dne : ()LcTN;
    //   14: aload_0
    //   15: getfield Dne : [LNMq;
    //   18: iconst_0
    //   19: aaload
    //   20: invokevirtual Dne : ()LdEr;
    //   23: getfield Qnq : I
    //   26: invokevirtual Dne : (I)LNMq;
    //   29: astore_1
    //   30: aload_1
    //   31: ifnonnull -> 38
    //   34: iconst_0
    //   35: goto -> 130
    //   38: aload_0
    //   39: getfield Dne : [LNMq;
    //   42: iconst_2
    //   43: aaload
    //   44: ifnonnull -> 51
    //   47: iconst_1
    //   48: goto -> 130
    //   51: aload_0
    //   52: getfield Dne : [LNMq;
    //   55: iconst_2
    //   56: aaload
    //   57: aload_1
    //   58: invokevirtual Dne : (LNMq;)Z
    //   61: ifne -> 68
    //   64: iconst_0
    //   65: goto -> 130
    //   68: aload_0
    //   69: getfield Dne : [LNMq;
    //   72: iconst_2
    //   73: aaload
    //   74: getfield Dne : I
    //   77: aload_0
    //   78: invokevirtual aFZ : ()I
    //   81: if_icmpge -> 109
    //   84: aload_0
    //   85: getfield Dne : [LNMq;
    //   88: iconst_2
    //   89: aaload
    //   90: getfield Dne : I
    //   93: aload_0
    //   94: getfield Dne : [LNMq;
    //   97: iconst_2
    //   98: aaload
    //   99: invokevirtual FWm : ()I
    //   102: if_icmpge -> 109
    //   105: iconst_1
    //   106: goto -> 130
    //   109: aload_0
    //   110: getfield Dne : [LNMq;
    //   113: iconst_2
    //   114: aaload
    //   115: getfield Dne : I
    //   118: aload_1
    //   119: invokevirtual FWm : ()I
    //   122: if_icmpge -> 129
    //   125: iconst_1
    //   126: goto -> 130
    //   129: iconst_0
    //   130: ireturn
  }
  
  public void bzF() {}
  
  public int Dne(int paramInt) {
    return this.bzF * paramInt / 200;
  }
  
  public static int Dne(NMq paramNMq) {
    if (paramNMq == null)
      return 0; 
    int i = (paramNMq.Dne()).Qnq;
    dEr dEr = paramNMq.Dne();
    if (i < 256 && zKP.Dne[i] != null) {
      dNT dNT = zKP.Dne[i];
      if (dNT == zKP.Qnq)
        return 150; 
      if (dNT.Dne == KFd.Qnq)
        return 300; 
    } 
    return (dEr instanceof SgG && ((SgG)dEr).Dne().equals("WOOD")) ? 200 : ((dEr instanceof uVe && ((uVe)dEr).Dne().equals("WOOD")) ? 200 : ((dEr instanceof EZq && ((EZq)dEr).Dne().equals("WOOD")) ? 200 : ((i == dEr.oIf.Qnq) ? 100 : ((i == dEr.DyG.Qnq) ? 1600 : ((i == dEr.xXN.Qnq) ? 20000 : ((i == zKP.aFZ.FWm) ? 100 : ((i == dEr.TpV.Qnq) ? 2400 : 0)))))));
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    mbZ mbZ = paramWkD.Dne("Items");
    this.Dne = (int[])new NMq[Qnq()];
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      byte b1 = wkD.Dne("Slot");
      if (b1 >= 0 && b1 < this.Dne.length)
        this.Dne[b1] = NMq.Dne(wkD); 
    } 
    this.Dne = paramWkD.Dne("BurnTime");
    this.bzF = paramWkD.Dne("CookTime");
    this.FWm = Dne(this.Dne[1]);
    if (paramWkD.Dne("CustomName"))
      this.Dne = (int[])paramWkD.Dne("CustomName"); 
  }
  
  public String b_() {
    return d_() ? (String)this.Dne : "container.furnace";
  }
  
  public static boolean Dne(NMq paramNMq) {
    return (Dne(paramNMq) > 0);
  }
  
  public int[] Dne(int paramInt) {
    return (paramInt == 0) ? FWm : ((paramInt == 1) ? Dne : bzF);
  }
  
  public boolean d_() {
    return (this.Dne != null && this.Dne.length() > 0);
  }
  
  public int Qnq() {
    return this.Dne.length;
  }
  
  public boolean FWm() {
    return (this.Dne > null);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifle -> 11
    //   7: iconst_1
    //   8: goto -> 12
    //   11: iconst_0
    //   12: istore_1
    //   13: iconst_0
    //   14: istore_2
    //   15: aload_0
    //   16: getfield Dne : I
    //   19: ifle -> 32
    //   22: aload_0
    //   23: dup
    //   24: getfield Dne : I
    //   27: iconst_1
    //   28: isub
    //   29: putfield Dne : I
    //   32: aload_0
    //   33: getfield Dne : LQnq;
    //   36: getfield aFZ : Z
    //   39: ifne -> 256
    //   42: aload_0
    //   43: getfield Dne : I
    //   46: ifne -> 154
    //   49: aload_0
    //   50: invokespecial bzF : ()Z
    //   53: ifeq -> 154
    //   56: aload_0
    //   57: aload_0
    //   58: aload_0
    //   59: getfield Dne : [LNMq;
    //   62: iconst_1
    //   63: aaload
    //   64: invokestatic Dne : (LNMq;)I
    //   67: dup_x1
    //   68: putfield Dne : I
    //   71: putfield FWm : I
    //   74: aload_0
    //   75: getfield Dne : I
    //   78: ifle -> 154
    //   81: iconst_1
    //   82: istore_2
    //   83: aload_0
    //   84: getfield Dne : [LNMq;
    //   87: iconst_1
    //   88: aaload
    //   89: ifnull -> 154
    //   92: aload_0
    //   93: getfield Dne : [LNMq;
    //   96: iconst_1
    //   97: aaload
    //   98: dup
    //   99: getfield Dne : I
    //   102: iconst_1
    //   103: isub
    //   104: putfield Dne : I
    //   107: aload_0
    //   108: getfield Dne : [LNMq;
    //   111: iconst_1
    //   112: aaload
    //   113: getfield Dne : I
    //   116: ifne -> 154
    //   119: aload_0
    //   120: getfield Dne : [LNMq;
    //   123: iconst_1
    //   124: aaload
    //   125: invokevirtual Dne : ()LdEr;
    //   128: invokevirtual FWm : ()LdEr;
    //   131: astore_3
    //   132: aload_0
    //   133: getfield Dne : [LNMq;
    //   136: iconst_1
    //   137: aload_3
    //   138: ifnull -> 152
    //   141: new NMq
    //   144: dup
    //   145: aload_3
    //   146: invokespecial <init> : (LdEr;)V
    //   149: goto -> 153
    //   152: aconst_null
    //   153: aastore
    //   154: aload_0
    //   155: invokevirtual FWm : ()Z
    //   158: ifeq -> 202
    //   161: aload_0
    //   162: invokespecial bzF : ()Z
    //   165: ifeq -> 202
    //   168: aload_0
    //   169: dup
    //   170: getfield bzF : I
    //   173: iconst_1
    //   174: iadd
    //   175: putfield bzF : I
    //   178: aload_0
    //   179: getfield bzF : I
    //   182: sipush #200
    //   185: if_icmpne -> 207
    //   188: aload_0
    //   189: iconst_0
    //   190: putfield bzF : I
    //   193: aload_0
    //   194: invokevirtual aFZ : ()V
    //   197: iconst_1
    //   198: istore_2
    //   199: goto -> 207
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield bzF : I
    //   207: iload_1
    //   208: aload_0
    //   209: getfield Dne : I
    //   212: ifle -> 219
    //   215: iconst_1
    //   216: goto -> 220
    //   219: iconst_0
    //   220: if_icmpeq -> 256
    //   223: iconst_1
    //   224: istore_2
    //   225: aload_0
    //   226: getfield Dne : I
    //   229: ifle -> 236
    //   232: iconst_1
    //   233: goto -> 237
    //   236: iconst_0
    //   237: aload_0
    //   238: getfield Dne : LQnq;
    //   241: aload_0
    //   242: getfield Qnq : I
    //   245: aload_0
    //   246: getfield aFZ : I
    //   249: aload_0
    //   250: getfield zGp : I
    //   253: invokestatic Dne : (ZLQnq;III)V
    //   256: iload_2
    //   257: ifeq -> 264
    //   260: aload_0
    //   261: invokevirtual a_ : ()V
    //   264: return
  }
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial FWm : (LWkD;)V
    //   5: aload_1
    //   6: ldc 'BurnTime'
    //   8: aload_0
    //   9: getfield Dne : I
    //   12: i2s
    //   13: invokevirtual Dne : (Ljava/lang/String;S)V
    //   16: aload_1
    //   17: ldc 'CookTime'
    //   19: aload_0
    //   20: getfield bzF : I
    //   23: i2s
    //   24: invokevirtual Dne : (Ljava/lang/String;S)V
    //   27: new mbZ
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_2
    //   35: iconst_0
    //   36: istore_3
    //   37: iload_3
    //   38: aload_0
    //   39: getfield Dne : [LNMq;
    //   42: arraylength
    //   43: if_icmpge -> 97
    //   46: aload_0
    //   47: getfield Dne : [LNMq;
    //   50: iload_3
    //   51: aaload
    //   52: ifnull -> 91
    //   55: new WkD
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore #4
    //   64: aload #4
    //   66: ldc 'Slot'
    //   68: iload_3
    //   69: i2b
    //   70: invokevirtual Dne : (Ljava/lang/String;B)V
    //   73: aload_0
    //   74: getfield Dne : [LNMq;
    //   77: iload_3
    //   78: aaload
    //   79: aload #4
    //   81: invokevirtual Dne : (LWkD;)LWkD;
    //   84: pop
    //   85: aload_2
    //   86: aload #4
    //   88: invokevirtual Dne : (LoNe;)V
    //   91: iinc #3, 1
    //   94: goto -> 37
    //   97: aload_1
    //   98: ldc 'Items'
    //   100: aload_2
    //   101: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   104: aload_0
    //   105: invokevirtual d_ : ()Z
    //   108: ifeq -> 121
    //   111: aload_1
    //   112: ldc 'CustomName'
    //   114: aload_0
    //   115: getfield Dne : Ljava/lang/String;
    //   118: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   121: return
  }
  
  public int FWm(int paramInt) {
    if (this.FWm == null)
      this.FWm = 'È'; 
    return this.Dne * paramInt / this.FWm;
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return (paramInt == 2) ? false : ((paramInt == 1) ? Dne(paramNMq) : true);
  }
  
  public void i_() {}
  
  public void aFZ() {
    if (bzF()) {
      NMq nMq = cTN.Dne().Dne((this.Dne[0].Dne()).Qnq);
      if (this.Dne[2] == null) {
        this.Dne[2] = nMq.Dne();
      } else if ((this.Dne[2]).bzF == nMq.bzF) {
        (this.Dne[2]).Dne++;
      } 
      (this.Dne[0]).Dne--;
      if ((this.Dne[0]).Dne <= 0)
        this.Dne[0] = null; 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lqs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */