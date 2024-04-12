public class MOS implements MqS {
  public int Dne;
  
  public NMq[] Dne;
  
  private NMq Dne;
  
  private NMq FWm;
  
  public NMq[] FWm = new NMq[4];
  
  public FiG Dne;
  
  public boolean Dne = new NMq[36];
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Zpi != 0.0F) ? false : ((paramFiG.Dne(this.Dne) <= 64.0D));
  }
  
  public NMq Dne(int paramInt) {
    NMq[] arrayOfNMq;
    boolean bool = this.Dne;
    if (paramInt >= bool.length) {
      paramInt -= bool.length;
      arrayOfNMq = this.FWm;
    } 
    return arrayOfNMq[paramInt];
  }
  
  public int bzF() {
    int i = 0;
    for (byte b = 0; b < this.FWm.length; b++) {
      if (this.FWm[b] != null && this.FWm[b].Dne() instanceof Qoi) {
        String[] arrayOfString = ((Qoi)this.FWm[b].Dne()).FWm;
        i += arrayOfString;
      } 
    } 
    return i;
  }
  
  public int Qnq() {
    return this.Dne.length + 4;
  }
  
  public int FWm() {
    for (byte b = 0; b < this.Dne.length; b++) {
      if (this.Dne[b] == null)
        return b; 
    } 
    return -1;
  }
  
  public mbZ Dne(mbZ parammbZ) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield Dne : [LNMq;
    //   7: arraylength
    //   8: if_icmpge -> 58
    //   11: aload_0
    //   12: getfield Dne : [LNMq;
    //   15: iload_2
    //   16: aaload
    //   17: ifnull -> 52
    //   20: new WkD
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_3
    //   28: aload_3
    //   29: ldc 'Slot'
    //   31: iload_2
    //   32: i2b
    //   33: invokevirtual Dne : (Ljava/lang/String;B)V
    //   36: aload_0
    //   37: getfield Dne : [LNMq;
    //   40: iload_2
    //   41: aaload
    //   42: aload_3
    //   43: invokevirtual Dne : (LWkD;)LWkD;
    //   46: pop
    //   47: aload_1
    //   48: aload_3
    //   49: invokevirtual Dne : (LoNe;)V
    //   52: iinc #2, 1
    //   55: goto -> 2
    //   58: iconst_0
    //   59: istore_2
    //   60: iload_2
    //   61: aload_0
    //   62: getfield FWm : [LNMq;
    //   65: arraylength
    //   66: if_icmpge -> 119
    //   69: aload_0
    //   70: getfield FWm : [LNMq;
    //   73: iload_2
    //   74: aaload
    //   75: ifnull -> 113
    //   78: new WkD
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: astore_3
    //   86: aload_3
    //   87: ldc 'Slot'
    //   89: iload_2
    //   90: bipush #100
    //   92: iadd
    //   93: i2b
    //   94: invokevirtual Dne : (Ljava/lang/String;B)V
    //   97: aload_0
    //   98: getfield FWm : [LNMq;
    //   101: iload_2
    //   102: aaload
    //   103: aload_3
    //   104: invokevirtual Dne : (LWkD;)LWkD;
    //   107: pop
    //   108: aload_1
    //   109: aload_3
    //   110: invokevirtual Dne : (LoNe;)V
    //   113: iinc #2, 1
    //   116: goto -> 60
    //   119: aload_1
    //   120: areturn
  }
  
  public void Dne(MOS paramMOS) {
    byte b;
    for (b = 0; b < this.Dne.length; b++)
      this.Dne[b] = NMq.Dne(paramMOS.Dne[b]); 
    for (b = 0; b < this.FWm.length; b++)
      this.FWm[b] = NMq.Dne(paramMOS.FWm[b]); 
    this.Dne = paramMOS.Dne;
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    NMq[] arrayOfNMq;
    boolean bool = this.Dne;
    if (paramInt1 >= this.Dne.length) {
      arrayOfNMq = this.FWm;
      paramInt1 -= this.Dne.length;
    } 
    if (arrayOfNMq[paramInt1] != null) {
      if ((arrayOfNMq[paramInt1]).Dne <= paramInt2) {
        NMq nMq1 = arrayOfNMq[paramInt1];
        arrayOfNMq[paramInt1] = null;
        return nMq1;
      } 
      NMq nMq = arrayOfNMq[paramInt1].Dne(paramInt2);
      if ((arrayOfNMq[paramInt1]).Dne == 0)
        arrayOfNMq[paramInt1] = null; 
      return nMq;
    } 
    return null;
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield Dne : [LNMq;
    //   7: arraylength
    //   8: if_icmpge -> 60
    //   11: aload_0
    //   12: getfield Dne : [LNMq;
    //   15: iload_1
    //   16: aaload
    //   17: ifnull -> 54
    //   20: aload_0
    //   21: getfield Dne : [LNMq;
    //   24: iload_1
    //   25: aaload
    //   26: aload_0
    //   27: getfield Dne : LFiG;
    //   30: getfield Dne : LQnq;
    //   33: aload_0
    //   34: getfield Dne : LFiG;
    //   37: iload_1
    //   38: aload_0
    //   39: getfield Dne : I
    //   42: iload_1
    //   43: if_icmpne -> 50
    //   46: iconst_1
    //   47: goto -> 51
    //   50: iconst_0
    //   51: invokevirtual Dne : (LQnq;LsMa;IZ)V
    //   54: iinc #1, 1
    //   57: goto -> 2
    //   60: return
  }
  
  public NMq bzF(int paramInt) {
    return this.FWm[paramInt];
  }
  
  public boolean Dne(NMq paramNMq) {
    if (paramNMq == null)
      return false; 
    try {
      int i;
      if (paramNMq.Qnq()) {
        i = FWm();
        if (i >= 0) {
          this.Dne[i] = NMq.Dne(paramNMq);
          (this.Dne[i]).FWm = 5;
          paramNMq.Dne = 0;
          return true;
        } 
        if (((uqg)this.Dne.Dne).Qnq) {
          paramNMq.Dne = 0;
          return true;
        } 
        return false;
      } 
      do {
        i = paramNMq.Dne;
        paramNMq.Dne = FWm(paramNMq);
      } while (paramNMq.Dne > 0 && paramNMq.Dne < i);
      if (paramNMq.Dne == i && ((uqg)this.Dne.Dne).Qnq) {
        paramNMq.Dne = 0;
        return true;
      } 
      return (paramNMq.Dne < i);
    } catch (Throwable throwable) {
      McM mcM = McM.Dne(throwable, "Adding item to inventory");
      Noo noo = mcM.Dne("Item being added");
      noo.Dne("Item ID", Integer.valueOf(paramNMq.bzF));
      noo.Dne("Item data", Integer.valueOf(paramNMq.Qnq()));
      noo.Dne("Item name", new Alk(this, paramNMq));
      throw new kaJ(mcM);
    } 
  }
  
  public int Dne(sMa paramsMa) {
    NMq nMq = Dne(this.Dne);
    return (nMq != null) ? nMq.Dne(paramsMa) : 1;
  }
  
  public int Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore #4
    //   5: iload #4
    //   7: aload_0
    //   8: getfield Dne : [LNMq;
    //   11: arraylength
    //   12: if_icmpge -> 79
    //   15: aload_0
    //   16: getfield Dne : [LNMq;
    //   19: iload #4
    //   21: aaload
    //   22: astore #5
    //   24: aload #5
    //   26: ifnull -> 73
    //   29: iload_1
    //   30: iconst_m1
    //   31: if_icmple -> 43
    //   34: aload #5
    //   36: getfield bzF : I
    //   39: iload_1
    //   40: if_icmpne -> 73
    //   43: iload_2
    //   44: iconst_m1
    //   45: if_icmple -> 57
    //   48: aload #5
    //   50: invokevirtual Qnq : ()I
    //   53: iload_2
    //   54: if_icmpne -> 73
    //   57: iload_3
    //   58: aload #5
    //   60: getfield Dne : I
    //   63: iadd
    //   64: istore_3
    //   65: aload_0
    //   66: getfield Dne : [LNMq;
    //   69: iload #4
    //   71: aconst_null
    //   72: aastore
    //   73: iinc #4, 1
    //   76: goto -> 5
    //   79: iconst_0
    //   80: istore #4
    //   82: iload #4
    //   84: aload_0
    //   85: getfield FWm : [LNMq;
    //   88: arraylength
    //   89: if_icmpge -> 156
    //   92: aload_0
    //   93: getfield FWm : [LNMq;
    //   96: iload #4
    //   98: aaload
    //   99: astore #5
    //   101: aload #5
    //   103: ifnull -> 150
    //   106: iload_1
    //   107: iconst_m1
    //   108: if_icmple -> 120
    //   111: aload #5
    //   113: getfield bzF : I
    //   116: iload_1
    //   117: if_icmpne -> 150
    //   120: iload_2
    //   121: iconst_m1
    //   122: if_icmple -> 134
    //   125: aload #5
    //   127: invokevirtual Qnq : ()I
    //   130: iload_2
    //   131: if_icmpne -> 150
    //   134: iload_3
    //   135: aload #5
    //   137: getfield Dne : I
    //   140: iadd
    //   141: istore_3
    //   142: aload_0
    //   143: getfield FWm : [LNMq;
    //   146: iload #4
    //   148: aconst_null
    //   149: aastore
    //   150: iinc #4, 1
    //   153: goto -> 82
    //   156: iload_3
    //   157: ireturn
  }
  
  public boolean Dne(int paramInt) {
    int i = Dne(paramInt);
    if (i < 0)
      return false; 
    if (--(this.Dne[i]).Dne <= 0)
      this.Dne[i] = null; 
    return true;
  }
  
  private int FWm(NMq paramNMq) {
    // Byte code:
    //   0: aload_1
    //   1: getfield bzF : I
    //   4: istore_2
    //   5: aload_1
    //   6: getfield Dne : I
    //   9: istore_3
    //   10: aload_1
    //   11: invokevirtual FWm : ()I
    //   14: iconst_1
    //   15: if_icmpne -> 54
    //   18: aload_0
    //   19: invokevirtual FWm : ()I
    //   22: istore #4
    //   24: iload #4
    //   26: ifge -> 31
    //   29: iload_3
    //   30: ireturn
    //   31: aload_0
    //   32: getfield Dne : [LNMq;
    //   35: iload #4
    //   37: aaload
    //   38: ifnonnull -> 52
    //   41: aload_0
    //   42: getfield Dne : [LNMq;
    //   45: iload #4
    //   47: aload_1
    //   48: invokestatic Dne : (LNMq;)LNMq;
    //   51: aastore
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial Dne : (LNMq;)I
    //   59: istore #4
    //   61: iload #4
    //   63: ifge -> 72
    //   66: aload_0
    //   67: invokevirtual FWm : ()I
    //   70: istore #4
    //   72: iload #4
    //   74: ifge -> 79
    //   77: iload_3
    //   78: ireturn
    //   79: aload_0
    //   80: getfield Dne : [LNMq;
    //   83: iload #4
    //   85: aaload
    //   86: ifnonnull -> 136
    //   89: aload_0
    //   90: getfield Dne : [LNMq;
    //   93: iload #4
    //   95: new NMq
    //   98: dup
    //   99: iload_2
    //   100: iconst_0
    //   101: aload_1
    //   102: invokevirtual Qnq : ()I
    //   105: invokespecial <init> : (III)V
    //   108: aastore
    //   109: aload_1
    //   110: invokevirtual aFZ : ()Z
    //   113: ifeq -> 136
    //   116: aload_0
    //   117: getfield Dne : [LNMq;
    //   120: iload #4
    //   122: aaload
    //   123: aload_1
    //   124: invokevirtual Dne : ()LWkD;
    //   127: invokevirtual Dne : ()LoNe;
    //   130: checkcast WkD
    //   133: invokevirtual FWm : (LWkD;)V
    //   136: iload_3
    //   137: istore #5
    //   139: iload_3
    //   140: aload_0
    //   141: getfield Dne : [LNMq;
    //   144: iload #4
    //   146: aaload
    //   147: invokevirtual FWm : ()I
    //   150: aload_0
    //   151: getfield Dne : [LNMq;
    //   154: iload #4
    //   156: aaload
    //   157: getfield Dne : I
    //   160: isub
    //   161: if_icmple -> 187
    //   164: aload_0
    //   165: getfield Dne : [LNMq;
    //   168: iload #4
    //   170: aaload
    //   171: invokevirtual FWm : ()I
    //   174: aload_0
    //   175: getfield Dne : [LNMq;
    //   178: iload #4
    //   180: aaload
    //   181: getfield Dne : I
    //   184: isub
    //   185: istore #5
    //   187: iload #5
    //   189: aload_0
    //   190: invokevirtual aFZ : ()I
    //   193: aload_0
    //   194: getfield Dne : [LNMq;
    //   197: iload #4
    //   199: aaload
    //   200: getfield Dne : I
    //   203: isub
    //   204: if_icmple -> 224
    //   207: aload_0
    //   208: invokevirtual aFZ : ()I
    //   211: aload_0
    //   212: getfield Dne : [LNMq;
    //   215: iload #4
    //   217: aaload
    //   218: getfield Dne : I
    //   221: isub
    //   222: istore #5
    //   224: iload #5
    //   226: ifne -> 231
    //   229: iload_3
    //   230: ireturn
    //   231: iload_3
    //   232: iload #5
    //   234: isub
    //   235: istore_3
    //   236: aload_0
    //   237: getfield Dne : [LNMq;
    //   240: iload #4
    //   242: aaload
    //   243: dup
    //   244: getfield Dne : I
    //   247: iload #5
    //   249: iadd
    //   250: putfield Dne : I
    //   253: aload_0
    //   254: getfield Dne : [LNMq;
    //   257: iload #4
    //   259: aaload
    //   260: iconst_5
    //   261: putfield FWm : I
    //   264: iload_3
    //   265: ireturn
  }
  
  public void Dne(int paramInt) {
    if (paramInt > 0)
      paramInt = 1; 
    if (paramInt < 0)
      paramInt = -1; 
    this.Dne -= paramInt;
    while (this.Dne)
      this.Dne += 9; 
    while (this.Dne >= 9)
      this.Dne -= 9; 
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public NMq FWm(int paramInt) {
    NMq[] arrayOfNMq;
    boolean bool = this.Dne;
    if (paramInt >= this.Dne.length) {
      arrayOfNMq = this.FWm;
      paramInt -= this.Dne.length;
    } 
    if (arrayOfNMq[paramInt] != null) {
      NMq nMq = arrayOfNMq[paramInt];
      arrayOfNMq[paramInt] = null;
      return nMq;
    } 
    return null;
  }
  
  public void Dne(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    boolean bool = true;
    this.Dne = Dne();
    if (paramBoolean1) {
      i = FWm(paramInt1, paramInt2);
    } else {
      i = Dne(paramInt1);
    } 
    if (i >= 0 && i < 9) {
      this.Dne = i;
    } else if (paramBoolean2 && paramInt1 > 0) {
      int j = FWm();
      if (j >= 0 && j < 9)
        this.Dne = j; 
      Dne(dEr.Dne[paramInt1], paramInt2);
    } 
  }
  
  public boolean FWm(int paramInt) {
    int i = Dne(paramInt);
    return (i >= 0);
  }
  
  public void Dne(NMq paramNMq) {
    this.FWm = (NMq[])paramNMq;
  }
  
  public static int Dne() {
    return 9;
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    NMq[] arrayOfNMq;
    boolean bool = this.Dne;
    if (paramInt >= bool.length) {
      paramInt -= bool.length;
      arrayOfNMq = this.FWm;
    } 
    arrayOfNMq[paramInt] = paramNMq;
  }
  
  public void a_() {
    this.Dne = true;
  }
  
  public float Dne(zKP paramzKP) {
    // Byte code:
    //   0: fconst_1
    //   1: fstore_2
    //   2: aload_0
    //   3: getfield Dne : [LNMq;
    //   6: aload_0
    //   7: getfield Dne : I
    //   10: aaload
    //   11: ifnull -> 30
    //   14: fload_2
    //   15: aload_0
    //   16: getfield Dne : [LNMq;
    //   19: aload_0
    //   20: getfield Dne : I
    //   23: aaload
    //   24: aload_1
    //   25: invokevirtual Dne : (LzKP;)F
    //   28: fmul
    //   29: fstore_2
    //   30: fload_2
    //   31: freturn
  }
  
  public boolean FWm(NMq paramNMq) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield FWm : [LNMq;
    //   7: arraylength
    //   8: if_icmpge -> 41
    //   11: aload_0
    //   12: getfield FWm : [LNMq;
    //   15: iload_2
    //   16: aaload
    //   17: ifnull -> 35
    //   20: aload_0
    //   21: getfield FWm : [LNMq;
    //   24: iload_2
    //   25: aaload
    //   26: aload_1
    //   27: invokevirtual Dne : (LNMq;)Z
    //   30: ifeq -> 35
    //   33: iconst_1
    //   34: ireturn
    //   35: iinc #2, 1
    //   38: goto -> 2
    //   41: iconst_0
    //   42: istore_2
    //   43: iload_2
    //   44: aload_0
    //   45: getfield Dne : [LNMq;
    //   48: arraylength
    //   49: if_icmpge -> 82
    //   52: aload_0
    //   53: getfield Dne : [LNMq;
    //   56: iload_2
    //   57: aaload
    //   58: ifnull -> 76
    //   61: aload_0
    //   62: getfield Dne : [LNMq;
    //   65: iload_2
    //   66: aaload
    //   67: aload_1
    //   68: invokevirtual Dne : (LNMq;)Z
    //   71: ifeq -> 76
    //   74: iconst_1
    //   75: ireturn
    //   76: iinc #2, 1
    //   79: goto -> 43
    //   82: iconst_0
    //   83: ireturn
  }
  
  public void FWm(int paramInt) {
    paramInt /= 4;
    if (paramInt < 1)
      paramInt = 1; 
    for (byte b = 0; b < this.FWm.length; b++) {
      if (this.FWm[b] != null && this.FWm[b].Dne() instanceof Qoi) {
        this.FWm[b].Dne(paramInt, this.Dne);
        if ((this.FWm[b]).Dne == 0)
          this.FWm[b] = null; 
      } 
    } 
  }
  
  public NMq Dne() {
    return (this.Dne < 9 && this.Dne) ? this.Dne[this.Dne] : null;
  }
  
  public NMq FWm() {
    return (NMq)this.FWm;
  }
  
  public void Dne(mbZ parammbZ) {
    this.Dne = new NMq[36];
    this.FWm = new NMq[4];
    for (byte b = 0; b < parammbZ.Dne(); b++) {
      WkD wkD = (WkD)parammbZ.FWm(b);
      int i = wkD.Dne("Slot") & 0xFF;
      NMq nMq = NMq.Dne(wkD);
      if (nMq != null) {
        if (i >= 0 && i < this.Dne.length)
          this.Dne[i] = nMq; 
        if (i >= 100 && i < this.FWm.length + 100)
          this.FWm[i - 100] = nMq; 
      } 
    } 
  }
  
  public String b_() {
    return "container.inventory";
  }
  
  public void i_() {}
  
  public void Qnq() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield Dne : [LNMq;
    //   7: arraylength
    //   8: if_icmpge -> 48
    //   11: aload_0
    //   12: getfield Dne : [LNMq;
    //   15: iload_1
    //   16: aaload
    //   17: ifnull -> 42
    //   20: aload_0
    //   21: getfield Dne : LFiG;
    //   24: aload_0
    //   25: getfield Dne : [LNMq;
    //   28: iload_1
    //   29: aaload
    //   30: iconst_1
    //   31: invokevirtual Dne : (LNMq;Z)LJiM;
    //   34: pop
    //   35: aload_0
    //   36: getfield Dne : [LNMq;
    //   39: iload_1
    //   40: aconst_null
    //   41: aastore
    //   42: iinc #1, 1
    //   45: goto -> 2
    //   48: iconst_0
    //   49: istore_1
    //   50: iload_1
    //   51: aload_0
    //   52: getfield FWm : [LNMq;
    //   55: arraylength
    //   56: if_icmpge -> 96
    //   59: aload_0
    //   60: getfield FWm : [LNMq;
    //   63: iload_1
    //   64: aaload
    //   65: ifnull -> 90
    //   68: aload_0
    //   69: getfield Dne : LFiG;
    //   72: aload_0
    //   73: getfield FWm : [LNMq;
    //   76: iload_1
    //   77: aaload
    //   78: iconst_1
    //   79: invokevirtual Dne : (LNMq;Z)LJiM;
    //   82: pop
    //   83: aload_0
    //   84: getfield FWm : [LNMq;
    //   87: iload_1
    //   88: aconst_null
    //   89: aastore
    //   90: iinc #1, 1
    //   93: goto -> 50
    //   96: return
  }
  
  private int FWm(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: aload_0
    //   4: getfield Dne : [LNMq;
    //   7: arraylength
    //   8: if_icmpge -> 54
    //   11: aload_0
    //   12: getfield Dne : [LNMq;
    //   15: iload_3
    //   16: aaload
    //   17: ifnull -> 48
    //   20: aload_0
    //   21: getfield Dne : [LNMq;
    //   24: iload_3
    //   25: aaload
    //   26: getfield bzF : I
    //   29: iload_1
    //   30: if_icmpne -> 48
    //   33: aload_0
    //   34: getfield Dne : [LNMq;
    //   37: iload_3
    //   38: aaload
    //   39: invokevirtual Qnq : ()I
    //   42: iload_2
    //   43: if_icmpne -> 48
    //   46: iload_3
    //   47: ireturn
    //   48: iinc #3, 1
    //   51: goto -> 2
    //   54: iconst_m1
    //   55: ireturn
  }
  
  private int Dne(int paramInt) {
    for (byte b = 0; b < this.Dne.length; b++) {
      if (this.Dne[b] != null && (this.Dne[b]).bzF == paramInt)
        return b; 
    } 
    return -1;
  }
  
  public boolean d_() {
    return false;
  }
  
  public void bzF() {}
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public boolean Dne(zKP paramzKP) {
    if (paramzKP.Dne.div())
      return true; 
    NMq nMq = Dne(this.Dne);
    return (nMq != null) ? nMq.Dne(paramzKP) : false;
  }
  
  public void Dne(dEr paramdEr, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 102
    //   4: aload_0
    //   5: aload_1
    //   6: getfield Qnq : I
    //   9: iload_2
    //   10: invokespecial FWm : (II)I
    //   13: istore_3
    //   14: iload_3
    //   15: iflt -> 33
    //   18: aload_0
    //   19: getfield Dne : [LNMq;
    //   22: iload_3
    //   23: aload_0
    //   24: getfield Dne : [LNMq;
    //   27: aload_0
    //   28: getfield Dne : I
    //   31: aaload
    //   32: aastore
    //   33: aload_0
    //   34: getfield Dne : LNMq;
    //   37: ifnull -> 76
    //   40: aload_0
    //   41: getfield Dne : LNMq;
    //   44: invokevirtual div : ()Z
    //   47: ifeq -> 76
    //   50: aload_0
    //   51: aload_0
    //   52: getfield Dne : LNMq;
    //   55: getfield bzF : I
    //   58: aload_0
    //   59: getfield Dne : LNMq;
    //   62: invokevirtual bzF : ()I
    //   65: invokespecial FWm : (II)I
    //   68: aload_0
    //   69: getfield Dne : I
    //   72: if_icmpne -> 76
    //   75: return
    //   76: aload_0
    //   77: getfield Dne : [LNMq;
    //   80: aload_0
    //   81: getfield Dne : I
    //   84: new NMq
    //   87: dup
    //   88: getstatic dEr.Dne : [LdEr;
    //   91: aload_1
    //   92: getfield Qnq : I
    //   95: aaload
    //   96: iconst_1
    //   97: iload_2
    //   98: invokespecial <init> : (LdEr;II)V
    //   101: aastore
    //   102: return
  }
  
  public MOS(FiG paramFiG) {
    this.Dne = false;
    this.Dne = false;
    this.Dne = paramFiG;
  }
  
  private int Dne(NMq paramNMq) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield Dne : [LNMq;
    //   7: arraylength
    //   8: if_icmpge -> 134
    //   11: aload_0
    //   12: getfield Dne : [LNMq;
    //   15: iload_2
    //   16: aaload
    //   17: ifnull -> 128
    //   20: aload_0
    //   21: getfield Dne : [LNMq;
    //   24: iload_2
    //   25: aaload
    //   26: getfield bzF : I
    //   29: aload_1
    //   30: getfield bzF : I
    //   33: if_icmpne -> 128
    //   36: aload_0
    //   37: getfield Dne : [LNMq;
    //   40: iload_2
    //   41: aaload
    //   42: invokevirtual Dne : ()Z
    //   45: ifeq -> 128
    //   48: aload_0
    //   49: getfield Dne : [LNMq;
    //   52: iload_2
    //   53: aaload
    //   54: getfield Dne : I
    //   57: aload_0
    //   58: getfield Dne : [LNMq;
    //   61: iload_2
    //   62: aaload
    //   63: invokevirtual FWm : ()I
    //   66: if_icmpge -> 128
    //   69: aload_0
    //   70: getfield Dne : [LNMq;
    //   73: iload_2
    //   74: aaload
    //   75: getfield Dne : I
    //   78: aload_0
    //   79: invokevirtual aFZ : ()I
    //   82: if_icmpge -> 128
    //   85: aload_0
    //   86: getfield Dne : [LNMq;
    //   89: iload_2
    //   90: aaload
    //   91: invokevirtual bzF : ()Z
    //   94: ifeq -> 113
    //   97: aload_0
    //   98: getfield Dne : [LNMq;
    //   101: iload_2
    //   102: aaload
    //   103: invokevirtual Qnq : ()I
    //   106: aload_1
    //   107: invokevirtual Qnq : ()I
    //   110: if_icmpne -> 128
    //   113: aload_0
    //   114: getfield Dne : [LNMq;
    //   117: iload_2
    //   118: aaload
    //   119: aload_1
    //   120: invokestatic Dne : (LNMq;LNMq;)Z
    //   123: ifeq -> 128
    //   126: iload_2
    //   127: ireturn
    //   128: iinc #2, 1
    //   131: goto -> 2
    //   134: iconst_m1
    //   135: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MOS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */