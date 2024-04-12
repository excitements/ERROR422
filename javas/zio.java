public class zio extends ipD implements FMb {
  private static final int[] FWm;
  
  private NMq[] Dne;
  
  private String Dne;
  
  private int Dne = new NMq[4];
  
  private int bzF;
  
  private int FWm;
  
  private static final int[] Dne = new int[] { 3 };
  
  public int Qnq() {
    return this.Dne.length;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return (paramInt == 3) ? dEr.Dne[paramNMq.bzF].mrb() : ((paramNMq.bzF == ((IJk)dEr.Dne).Qnq || paramNMq.bzF == dEr.OCU.Qnq));
  }
  
  public NMq FWm(int paramInt) {
    if (paramInt >= 0 && paramInt < this.Dne.length) {
      int i = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return i;
    } 
    return null;
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
    this.Dne = paramWkD.Dne("BrewTime");
    if (paramWkD.Dne("CustomName"))
      this.Dne = (int[])paramWkD.Dne("CustomName"); 
  }
  
  public String b_() {
    return d_() ? (String)this.Dne : "container.brewing";
  }
  
  public int FWm() {
    int i = 0;
    for (byte b = 0; b < 3; b++) {
      if (this.Dne[b] != null)
        i |= 1 << b; 
    } 
    return i;
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 < this.Dne.length) {
      int i = this.Dne[paramInt1];
      this.Dne[paramInt1] = null;
      return i;
    } 
    return null;
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
  
  public void Dne() {
    if (this.Dne > null) {
      this.Dne--;
      if (this.Dne == null) {
        div();
        a_();
      } else if (!FWm()) {
        this.Dne = false;
        a_();
      } else if (this.bzF != (this.Dne[3]).bzF) {
        this.Dne = false;
        a_();
      } 
    } else if (FWm()) {
      this.Dne = 'Ɛ';
      this.bzF = (this.Dne[3]).bzF;
    } 
    int i = FWm();
    if (i != this.FWm) {
      this.FWm = i;
      this.Dne.Dne(this.Qnq, this.aFZ, this.zGp, i, 2);
    } 
    super.Dne();
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  private int Dne(int paramInt, NMq paramNMq) {
    return (paramNMq == null) ? paramInt : (dEr.Dne[paramNMq.bzF].mrb() ? yDZ.Dne(paramInt, dEr.Dne[paramNMq.bzF].Qnq()) : paramInt);
  }
  
  public NMq Dne(int paramInt) {
    return (paramInt >= 0 && paramInt < this.Dne.length) ? this.Dne[paramInt] : null;
  }
  
  public boolean FWm(int paramInt1, NMq paramNMq, int paramInt2) {
    return true;
  }
  
  public void Dne(String paramString) {
    this.Dne = (int[])paramString;
  }
  
  static {
    FWm = new int[] { 0, 1, 2 };
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    if (paramInt >= 0 && paramInt < this.Dne.length)
      this.Dne[paramInt] = paramNMq; 
  }
  
  private void div() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()Z
    //   4: ifeq -> 245
    //   7: aload_0
    //   8: getfield Dne : [LNMq;
    //   11: iconst_3
    //   12: aaload
    //   13: astore_1
    //   14: iconst_0
    //   15: istore_2
    //   16: iload_2
    //   17: iconst_3
    //   18: if_icmpge -> 170
    //   21: aload_0
    //   22: getfield Dne : [LNMq;
    //   25: iload_2
    //   26: aaload
    //   27: ifnull -> 164
    //   30: aload_0
    //   31: getfield Dne : [LNMq;
    //   34: iload_2
    //   35: aaload
    //   36: getfield bzF : I
    //   39: getstatic dEr.Dne : LIJk;
    //   42: getfield Qnq : I
    //   45: if_icmpne -> 164
    //   48: aload_0
    //   49: getfield Dne : [LNMq;
    //   52: iload_2
    //   53: aaload
    //   54: invokevirtual Qnq : ()I
    //   57: istore_3
    //   58: aload_0
    //   59: iload_3
    //   60: aload_1
    //   61: invokespecial Dne : (ILNMq;)I
    //   64: istore #4
    //   66: getstatic dEr.Dne : LIJk;
    //   69: iload_3
    //   70: invokevirtual Dne : (I)Ljava/util/List;
    //   73: astore #5
    //   75: getstatic dEr.Dne : LIJk;
    //   78: iload #4
    //   80: invokevirtual Dne : (I)Ljava/util/List;
    //   83: astore #6
    //   85: iload_3
    //   86: ifle -> 96
    //   89: aload #5
    //   91: aload #6
    //   93: if_acmpeq -> 138
    //   96: aload #5
    //   98: ifnull -> 118
    //   101: aload #5
    //   103: aload #6
    //   105: invokeinterface equals : (Ljava/lang/Object;)Z
    //   110: ifne -> 138
    //   113: aload #6
    //   115: ifnull -> 138
    //   118: iload_3
    //   119: iload #4
    //   121: if_icmpeq -> 164
    //   124: aload_0
    //   125: getfield Dne : [LNMq;
    //   128: iload_2
    //   129: aaload
    //   130: iload #4
    //   132: invokevirtual Dne : (I)V
    //   135: goto -> 164
    //   138: iload_3
    //   139: invokestatic Dne : (I)Z
    //   142: ifne -> 164
    //   145: iload #4
    //   147: invokestatic Dne : (I)Z
    //   150: ifeq -> 164
    //   153: aload_0
    //   154: getfield Dne : [LNMq;
    //   157: iload_2
    //   158: aaload
    //   159: iload #4
    //   161: invokevirtual Dne : (I)V
    //   164: iinc #2, 1
    //   167: goto -> 16
    //   170: getstatic dEr.Dne : [LdEr;
    //   173: aload_1
    //   174: getfield bzF : I
    //   177: aaload
    //   178: invokevirtual IjH : ()Z
    //   181: ifeq -> 211
    //   184: aload_0
    //   185: getfield Dne : [LNMq;
    //   188: iconst_3
    //   189: new NMq
    //   192: dup
    //   193: getstatic dEr.Dne : [LdEr;
    //   196: aload_1
    //   197: getfield bzF : I
    //   200: aaload
    //   201: invokevirtual FWm : ()LdEr;
    //   204: invokespecial <init> : (LdEr;)V
    //   207: aastore
    //   208: goto -> 245
    //   211: aload_0
    //   212: getfield Dne : [LNMq;
    //   215: iconst_3
    //   216: aaload
    //   217: dup
    //   218: getfield Dne : I
    //   221: iconst_1
    //   222: isub
    //   223: putfield Dne : I
    //   226: aload_0
    //   227: getfield Dne : [LNMq;
    //   230: iconst_3
    //   231: aaload
    //   232: getfield Dne : I
    //   235: ifgt -> 245
    //   238: aload_0
    //   239: getfield Dne : [LNMq;
    //   242: iconst_3
    //   243: aconst_null
    //   244: aastore
    //   245: return
  }
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial FWm : (LWkD;)V
    //   5: aload_1
    //   6: ldc 'BrewTime'
    //   8: aload_0
    //   9: getfield Dne : I
    //   12: i2s
    //   13: invokevirtual Dne : (Ljava/lang/String;S)V
    //   16: new mbZ
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_2
    //   24: iconst_0
    //   25: istore_3
    //   26: iload_3
    //   27: aload_0
    //   28: getfield Dne : [LNMq;
    //   31: arraylength
    //   32: if_icmpge -> 86
    //   35: aload_0
    //   36: getfield Dne : [LNMq;
    //   39: iload_3
    //   40: aaload
    //   41: ifnull -> 80
    //   44: new WkD
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: astore #4
    //   53: aload #4
    //   55: ldc 'Slot'
    //   57: iload_3
    //   58: i2b
    //   59: invokevirtual Dne : (Ljava/lang/String;B)V
    //   62: aload_0
    //   63: getfield Dne : [LNMq;
    //   66: iload_3
    //   67: aaload
    //   68: aload #4
    //   70: invokevirtual Dne : (LWkD;)LWkD;
    //   73: pop
    //   74: aload_2
    //   75: aload #4
    //   77: invokevirtual Dne : (LoNe;)V
    //   80: iinc #3, 1
    //   83: goto -> 26
    //   86: aload_1
    //   87: ldc 'Items'
    //   89: aload_2
    //   90: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   93: aload_0
    //   94: invokevirtual d_ : ()Z
    //   97: ifeq -> 110
    //   100: aload_1
    //   101: ldc 'CustomName'
    //   103: aload_0
    //   104: getfield Dne : Ljava/lang/String;
    //   107: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   110: return
  }
  
  public boolean Dne(int paramInt1, NMq paramNMq, int paramInt2) {
    return Dne(paramInt1, paramNMq);
  }
  
  public int[] Dne(int paramInt) {
    return (paramInt == 1) ? Dne : FWm;
  }
  
  public boolean d_() {
    return (this.Dne != null && this.Dne.length() > 0);
  }
  
  public void i_() {}
  
  public void bzF() {}
  
  private boolean FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LNMq;
    //   4: iconst_3
    //   5: aaload
    //   6: ifnull -> 195
    //   9: aload_0
    //   10: getfield Dne : [LNMq;
    //   13: iconst_3
    //   14: aaload
    //   15: getfield Dne : I
    //   18: ifle -> 195
    //   21: aload_0
    //   22: getfield Dne : [LNMq;
    //   25: iconst_3
    //   26: aaload
    //   27: astore_1
    //   28: getstatic dEr.Dne : [LdEr;
    //   31: aload_1
    //   32: getfield bzF : I
    //   35: aaload
    //   36: invokevirtual mrb : ()Z
    //   39: ifne -> 44
    //   42: iconst_0
    //   43: ireturn
    //   44: iconst_0
    //   45: istore_2
    //   46: iconst_0
    //   47: istore_3
    //   48: iload_3
    //   49: iconst_3
    //   50: if_icmpge -> 193
    //   53: aload_0
    //   54: getfield Dne : [LNMq;
    //   57: iload_3
    //   58: aaload
    //   59: ifnull -> 187
    //   62: aload_0
    //   63: getfield Dne : [LNMq;
    //   66: iload_3
    //   67: aaload
    //   68: getfield bzF : I
    //   71: getstatic dEr.Dne : LIJk;
    //   74: getfield Qnq : I
    //   77: if_icmpne -> 187
    //   80: aload_0
    //   81: getfield Dne : [LNMq;
    //   84: iload_3
    //   85: aaload
    //   86: invokevirtual Qnq : ()I
    //   89: istore #4
    //   91: aload_0
    //   92: iload #4
    //   94: aload_1
    //   95: invokespecial Dne : (ILNMq;)I
    //   98: istore #5
    //   100: iload #4
    //   102: invokestatic Dne : (I)Z
    //   105: ifne -> 121
    //   108: iload #5
    //   110: invokestatic Dne : (I)Z
    //   113: ifeq -> 121
    //   116: iconst_1
    //   117: istore_2
    //   118: goto -> 193
    //   121: getstatic dEr.Dne : LIJk;
    //   124: iload #4
    //   126: invokevirtual Dne : (I)Ljava/util/List;
    //   129: astore #6
    //   131: getstatic dEr.Dne : LIJk;
    //   134: iload #5
    //   136: invokevirtual Dne : (I)Ljava/util/List;
    //   139: astore #7
    //   141: iload #4
    //   143: ifle -> 153
    //   146: aload #6
    //   148: aload #7
    //   150: if_acmpeq -> 187
    //   153: aload #6
    //   155: ifnull -> 175
    //   158: aload #6
    //   160: aload #7
    //   162: invokeinterface equals : (Ljava/lang/Object;)Z
    //   167: ifne -> 187
    //   170: aload #7
    //   172: ifnull -> 187
    //   175: iload #4
    //   177: iload #5
    //   179: if_icmpeq -> 187
    //   182: iconst_1
    //   183: istore_2
    //   184: goto -> 193
    //   187: iinc #3, 1
    //   190: goto -> 48
    //   193: iload_2
    //   194: ireturn
    //   195: iconst_0
    //   196: ireturn
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne(this.Qnq, this.aFZ, this.zGp) != this) ? false : ((paramFiG.Dne(this.Qnq + 0.5D, this.aFZ + 0.5D, this.zGp + 0.5D) <= 64.0D));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */