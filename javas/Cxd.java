public abstract class Cxd extends Ebp implements MqS {
  private NMq[] Dne;
  
  private boolean Dne = new NMq[36];
  
  public void bzF() {}
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public Cxd(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = true;
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public void g_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 273
    //   7: iconst_0
    //   8: istore_1
    //   9: iload_1
    //   10: aload_0
    //   11: invokevirtual Qnq : ()I
    //   14: if_icmpge -> 273
    //   17: aload_0
    //   18: iload_1
    //   19: invokevirtual Dne : (I)LNMq;
    //   22: astore_2
    //   23: aload_2
    //   24: ifnull -> 267
    //   27: aload_0
    //   28: getfield Dne : Ljava/util/Random;
    //   31: invokevirtual nextFloat : ()F
    //   34: ldc 0.8
    //   36: fmul
    //   37: ldc 0.1
    //   39: fadd
    //   40: fstore_3
    //   41: aload_0
    //   42: getfield Dne : Ljava/util/Random;
    //   45: invokevirtual nextFloat : ()F
    //   48: ldc 0.8
    //   50: fmul
    //   51: ldc 0.1
    //   53: fadd
    //   54: fstore #4
    //   56: aload_0
    //   57: getfield Dne : Ljava/util/Random;
    //   60: invokevirtual nextFloat : ()F
    //   63: ldc 0.8
    //   65: fmul
    //   66: ldc 0.1
    //   68: fadd
    //   69: fstore #5
    //   71: aload_2
    //   72: getfield Dne : I
    //   75: ifle -> 267
    //   78: aload_0
    //   79: getfield Dne : Ljava/util/Random;
    //   82: bipush #21
    //   84: invokevirtual nextInt : (I)I
    //   87: bipush #10
    //   89: iadd
    //   90: istore #6
    //   92: iload #6
    //   94: aload_2
    //   95: getfield Dne : I
    //   98: if_icmple -> 107
    //   101: aload_2
    //   102: getfield Dne : I
    //   105: istore #6
    //   107: aload_2
    //   108: dup
    //   109: getfield Dne : I
    //   112: iload #6
    //   114: isub
    //   115: putfield Dne : I
    //   118: new JiM
    //   121: dup
    //   122: aload_0
    //   123: getfield Dne : LQnq;
    //   126: aload_0
    //   127: getfield div : D
    //   130: fload_3
    //   131: f2d
    //   132: dadd
    //   133: aload_0
    //   134: getfield IjH : D
    //   137: fload #4
    //   139: f2d
    //   140: dadd
    //   141: aload_0
    //   142: getfield mrb : D
    //   145: fload #5
    //   147: f2d
    //   148: dadd
    //   149: new NMq
    //   152: dup
    //   153: aload_2
    //   154: getfield bzF : I
    //   157: iload #6
    //   159: aload_2
    //   160: invokevirtual Qnq : ()I
    //   163: invokespecial <init> : (III)V
    //   166: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   169: astore #7
    //   171: aload_2
    //   172: invokevirtual aFZ : ()Z
    //   175: ifeq -> 196
    //   178: aload #7
    //   180: invokevirtual Dne : ()LNMq;
    //   183: aload_2
    //   184: invokevirtual Dne : ()LWkD;
    //   187: invokevirtual Dne : ()LoNe;
    //   190: checkcast WkD
    //   193: invokevirtual FWm : (LWkD;)V
    //   196: ldc 0.05
    //   198: fstore #8
    //   200: aload #7
    //   202: aload_0
    //   203: getfield Dne : Ljava/util/Random;
    //   206: invokevirtual nextGaussian : ()D
    //   209: d2f
    //   210: fload #8
    //   212: fmul
    //   213: f2d
    //   214: putfield XHL : D
    //   217: aload #7
    //   219: aload_0
    //   220: getfield Dne : Ljava/util/Random;
    //   223: invokevirtual nextGaussian : ()D
    //   226: d2f
    //   227: fload #8
    //   229: fmul
    //   230: ldc 0.2
    //   232: fadd
    //   233: f2d
    //   234: putfield Zpi : D
    //   237: aload #7
    //   239: aload_0
    //   240: getfield Dne : Ljava/util/Random;
    //   243: invokevirtual nextGaussian : ()D
    //   246: d2f
    //   247: fload #8
    //   249: fmul
    //   250: f2d
    //   251: putfield kGO : D
    //   254: aload_0
    //   255: getfield Dne : LQnq;
    //   258: aload #7
    //   260: invokevirtual FWm : (LsMa;)Z
    //   263: pop
    //   264: goto -> 71
    //   267: iinc #1, 1
    //   270: goto -> 9
    //   273: aload_0
    //   274: invokespecial g_ : ()V
    //   277: return
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = paramNMq;
    if (paramNMq != null && paramNMq.Dne > aFZ())
      paramNMq.Dne = aFZ(); 
  }
  
  public void Dne(zBn paramzBn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial Dne : (LzBn;)V
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_2
    //   8: aload_0
    //   9: invokevirtual Qnq : ()I
    //   12: if_icmpge -> 248
    //   15: aload_0
    //   16: iload_2
    //   17: invokevirtual Dne : (I)LNMq;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnull -> 242
    //   25: aload_0
    //   26: getfield Dne : Ljava/util/Random;
    //   29: invokevirtual nextFloat : ()F
    //   32: ldc 0.8
    //   34: fmul
    //   35: ldc 0.1
    //   37: fadd
    //   38: fstore #4
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/Random;
    //   44: invokevirtual nextFloat : ()F
    //   47: ldc 0.8
    //   49: fmul
    //   50: ldc 0.1
    //   52: fadd
    //   53: fstore #5
    //   55: aload_0
    //   56: getfield Dne : Ljava/util/Random;
    //   59: invokevirtual nextFloat : ()F
    //   62: ldc 0.8
    //   64: fmul
    //   65: ldc 0.1
    //   67: fadd
    //   68: fstore #6
    //   70: aload_3
    //   71: getfield Dne : I
    //   74: ifle -> 242
    //   77: aload_0
    //   78: getfield Dne : Ljava/util/Random;
    //   81: bipush #21
    //   83: invokevirtual nextInt : (I)I
    //   86: bipush #10
    //   88: iadd
    //   89: istore #7
    //   91: iload #7
    //   93: aload_3
    //   94: getfield Dne : I
    //   97: if_icmple -> 106
    //   100: aload_3
    //   101: getfield Dne : I
    //   104: istore #7
    //   106: aload_3
    //   107: dup
    //   108: getfield Dne : I
    //   111: iload #7
    //   113: isub
    //   114: putfield Dne : I
    //   117: new JiM
    //   120: dup
    //   121: aload_0
    //   122: getfield Dne : LQnq;
    //   125: aload_0
    //   126: getfield div : D
    //   129: fload #4
    //   131: f2d
    //   132: dadd
    //   133: aload_0
    //   134: getfield IjH : D
    //   137: fload #5
    //   139: f2d
    //   140: dadd
    //   141: aload_0
    //   142: getfield mrb : D
    //   145: fload #6
    //   147: f2d
    //   148: dadd
    //   149: new NMq
    //   152: dup
    //   153: aload_3
    //   154: getfield bzF : I
    //   157: iload #7
    //   159: aload_3
    //   160: invokevirtual Qnq : ()I
    //   163: invokespecial <init> : (III)V
    //   166: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   169: astore #8
    //   171: ldc 0.05
    //   173: fstore #9
    //   175: aload #8
    //   177: aload_0
    //   178: getfield Dne : Ljava/util/Random;
    //   181: invokevirtual nextGaussian : ()D
    //   184: d2f
    //   185: fload #9
    //   187: fmul
    //   188: f2d
    //   189: putfield XHL : D
    //   192: aload #8
    //   194: aload_0
    //   195: getfield Dne : Ljava/util/Random;
    //   198: invokevirtual nextGaussian : ()D
    //   201: d2f
    //   202: fload #9
    //   204: fmul
    //   205: ldc 0.2
    //   207: fadd
    //   208: f2d
    //   209: putfield Zpi : D
    //   212: aload #8
    //   214: aload_0
    //   215: getfield Dne : Ljava/util/Random;
    //   218: invokevirtual nextGaussian : ()D
    //   221: d2f
    //   222: fload #9
    //   224: fmul
    //   225: f2d
    //   226: putfield kGO : D
    //   229: aload_0
    //   230: getfield Dne : LQnq;
    //   233: aload #8
    //   235: invokevirtual FWm : (LsMa;)Z
    //   238: pop
    //   239: goto -> 70
    //   242: iinc #2, 1
    //   245: goto -> 7
    //   248: return
  }
  
  protected void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    mbZ mbZ = paramWkD.Dne("Items");
    this.Dne = new NMq[Qnq()];
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      int i = wkD.Dne("Slot") & 0xFF;
      if (i >= 0 && i < this.Dne.length)
        this.Dne[i] = NMq.Dne(wkD); 
    } 
  }
  
  public void i_() {}
  
  protected void Qnq() {
    int i = 15 - Pdb.Dne(this);
    float f = 0.98F + i * 0.001F;
    this.XHL *= f;
    this.Zpi *= 0.0D;
    this.kGO *= f;
  }
  
  public void a_() {}
  
  public boolean Dne(FiG paramFiG) {
    return (this.Zpi != 0.0F) ? false : ((paramFiG.Dne(this) <= 64.0D));
  }
  
  public Cxd(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    this.Dne = true;
  }
  
  public String b_() {
    return d_() ? FWm() : "container.minecart";
  }
  
  public NMq Dne(int paramInt) {
    return this.Dne[paramInt];
  }
  
  public void Qnq(int paramInt) {
    this.Dne = false;
    super.Qnq(paramInt);
  }
  
  protected void Dne(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial Dne : (LWkD;)V
    //   5: new mbZ
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: aload_0
    //   17: getfield Dne : [LNMq;
    //   20: arraylength
    //   21: if_icmpge -> 75
    //   24: aload_0
    //   25: getfield Dne : [LNMq;
    //   28: iload_3
    //   29: aaload
    //   30: ifnull -> 69
    //   33: new WkD
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #4
    //   42: aload #4
    //   44: ldc 'Slot'
    //   46: iload_3
    //   47: i2b
    //   48: invokevirtual Dne : (Ljava/lang/String;B)V
    //   51: aload_0
    //   52: getfield Dne : [LNMq;
    //   55: iload_3
    //   56: aaload
    //   57: aload #4
    //   59: invokevirtual Dne : (LWkD;)LWkD;
    //   62: pop
    //   63: aload_2
    //   64: aload #4
    //   66: invokevirtual Dne : (LoNe;)V
    //   69: iinc #3, 1
    //   72: goto -> 15
    //   75: aload_1
    //   76: ldc 'Items'
    //   78: aload_2
    //   79: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   82: return
  }
  
  public boolean a_(FiG paramFiG) {
    if (this.Dne.aFZ == null)
      paramFiG.Dne(this); 
    return true;
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
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      boolean bool = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return bool;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Cxd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */