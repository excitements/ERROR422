public abstract class RsG extends sMa {
  public int bzF;
  
  public int FWm;
  
  public int Qnq;
  
  private int Vxn = 0;
  
  public int Dne = 0;
  
  public void Qnq(double paramDouble1, double paramDouble2, double paramDouble3) {
    if (this.Dne.aFZ == null && this.Zpi == 0.0F && paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3 > 0.0D) {
      g_();
      bzF();
    } 
  }
  
  public void Dne() {
    if (this.Vxn++ == 100 && this.Dne.aFZ == null) {
      this.Vxn = 0;
      if (this.Zpi == 0.0F && !Qnq()) {
        g_();
        bzF();
      } 
    } 
  }
  
  public abstract int Dne();
  
  public void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield Dne : I
    //   5: aload_0
    //   6: aload_0
    //   7: iload_1
    //   8: bipush #90
    //   10: imul
    //   11: i2f
    //   12: dup_x1
    //   13: putfield mrb : F
    //   16: putfield Zpi : F
    //   19: aload_0
    //   20: invokevirtual Dne : ()I
    //   23: i2f
    //   24: fstore_2
    //   25: aload_0
    //   26: invokevirtual bzF : ()I
    //   29: i2f
    //   30: fstore_3
    //   31: aload_0
    //   32: invokevirtual Dne : ()I
    //   35: i2f
    //   36: fstore #4
    //   38: iload_1
    //   39: iconst_2
    //   40: if_icmpeq -> 53
    //   43: iload_1
    //   44: ifeq -> 53
    //   47: ldc 0.5
    //   49: fstore_2
    //   50: goto -> 75
    //   53: ldc 0.5
    //   55: fstore #4
    //   57: aload_0
    //   58: aload_0
    //   59: getstatic zxJ.aFZ : [I
    //   62: iload_1
    //   63: iaload
    //   64: bipush #90
    //   66: imul
    //   67: i2f
    //   68: dup_x1
    //   69: putfield Zpi : F
    //   72: putfield mrb : F
    //   75: fload_2
    //   76: ldc 32.0
    //   78: fdiv
    //   79: fstore_2
    //   80: fload_3
    //   81: ldc 32.0
    //   83: fdiv
    //   84: fstore_3
    //   85: fload #4
    //   87: ldc 32.0
    //   89: fdiv
    //   90: fstore #4
    //   92: aload_0
    //   93: getfield FWm : I
    //   96: i2f
    //   97: ldc 0.5
    //   99: fadd
    //   100: fstore #5
    //   102: aload_0
    //   103: getfield bzF : I
    //   106: i2f
    //   107: ldc 0.5
    //   109: fadd
    //   110: fstore #6
    //   112: aload_0
    //   113: getfield Qnq : I
    //   116: i2f
    //   117: ldc 0.5
    //   119: fadd
    //   120: fstore #7
    //   122: ldc 0.5625
    //   124: fstore #8
    //   126: iload_1
    //   127: iconst_2
    //   128: if_icmpne -> 138
    //   131: fload #7
    //   133: fload #8
    //   135: fsub
    //   136: fstore #7
    //   138: iload_1
    //   139: iconst_1
    //   140: if_icmpne -> 150
    //   143: fload #5
    //   145: fload #8
    //   147: fsub
    //   148: fstore #5
    //   150: iload_1
    //   151: ifne -> 161
    //   154: fload #7
    //   156: fload #8
    //   158: fadd
    //   159: fstore #7
    //   161: iload_1
    //   162: iconst_3
    //   163: if_icmpne -> 173
    //   166: fload #5
    //   168: fload #8
    //   170: fadd
    //   171: fstore #5
    //   173: iload_1
    //   174: iconst_2
    //   175: if_icmpne -> 191
    //   178: fload #5
    //   180: aload_0
    //   181: aload_0
    //   182: invokevirtual Dne : ()I
    //   185: invokespecial Dne : (I)F
    //   188: fsub
    //   189: fstore #5
    //   191: iload_1
    //   192: iconst_1
    //   193: if_icmpne -> 209
    //   196: fload #7
    //   198: aload_0
    //   199: aload_0
    //   200: invokevirtual Dne : ()I
    //   203: invokespecial Dne : (I)F
    //   206: fadd
    //   207: fstore #7
    //   209: iload_1
    //   210: ifne -> 226
    //   213: fload #5
    //   215: aload_0
    //   216: aload_0
    //   217: invokevirtual Dne : ()I
    //   220: invokespecial Dne : (I)F
    //   223: fadd
    //   224: fstore #5
    //   226: iload_1
    //   227: iconst_3
    //   228: if_icmpne -> 244
    //   231: fload #7
    //   233: aload_0
    //   234: aload_0
    //   235: invokevirtual Dne : ()I
    //   238: invokespecial Dne : (I)F
    //   241: fsub
    //   242: fstore #7
    //   244: fload #6
    //   246: aload_0
    //   247: aload_0
    //   248: invokevirtual bzF : ()I
    //   251: invokespecial Dne : (I)F
    //   254: fadd
    //   255: fstore #6
    //   257: aload_0
    //   258: fload #5
    //   260: f2d
    //   261: fload #6
    //   263: f2d
    //   264: fload #7
    //   266: f2d
    //   267: invokevirtual bzF : (DDD)V
    //   270: ldc -0.03125
    //   272: fstore #9
    //   274: aload_0
    //   275: getfield Dne : LbSp;
    //   278: fload #5
    //   280: fload_2
    //   281: fsub
    //   282: fload #9
    //   284: fsub
    //   285: f2d
    //   286: fload #6
    //   288: fload_3
    //   289: fsub
    //   290: fload #9
    //   292: fsub
    //   293: f2d
    //   294: fload #7
    //   296: fload #4
    //   298: fsub
    //   299: fload #9
    //   301: fsub
    //   302: f2d
    //   303: fload #5
    //   305: fload_2
    //   306: fadd
    //   307: fload #9
    //   309: fadd
    //   310: f2d
    //   311: fload #6
    //   313: fload_3
    //   314: fadd
    //   315: fload #9
    //   317: fadd
    //   318: f2d
    //   319: fload #7
    //   321: fload #4
    //   323: fadd
    //   324: fload #9
    //   326: fadd
    //   327: f2d
    //   328: invokevirtual FWm : (DDDDDD)LbSp;
    //   331: pop
    //   332: return
  }
  
  public void FWm(WkD paramWkD) {
    if (paramWkD.Dne("Direction")) {
      this.Dne = paramWkD.Dne("Direction");
    } else {
      switch (paramWkD.Dne("Dir")) {
        case 0:
          this.Dne = 2;
          break;
        case 1:
          this.Dne = 1;
          break;
        case 2:
          this.Dne = 0;
          break;
        case 3:
          this.Dne = 3;
          break;
      } 
    } 
    this.FWm = paramWkD.Dne("TileX");
    this.bzF = paramWkD.Dne("TileY");
    this.Qnq = paramWkD.Dne("TileZ");
    Dne(this.Dne);
  }
  
  public boolean Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: aload_0
    //   6: getfield Dne : LbSp;
    //   9: invokevirtual Dne : (LsMa;LbSp;)Ljava/util/List;
    //   12: invokeinterface isEmpty : ()Z
    //   17: ifne -> 22
    //   20: iconst_0
    //   21: ireturn
    //   22: iconst_1
    //   23: aload_0
    //   24: invokevirtual Dne : ()I
    //   27: bipush #16
    //   29: idiv
    //   30: invokestatic max : (II)I
    //   33: istore_1
    //   34: iconst_1
    //   35: aload_0
    //   36: invokevirtual bzF : ()I
    //   39: bipush #16
    //   41: idiv
    //   42: invokestatic max : (II)I
    //   45: istore_2
    //   46: aload_0
    //   47: getfield FWm : I
    //   50: istore_3
    //   51: aload_0
    //   52: getfield bzF : I
    //   55: istore #4
    //   57: aload_0
    //   58: getfield Qnq : I
    //   61: istore #5
    //   63: aload_0
    //   64: getfield Dne : I
    //   67: iconst_2
    //   68: if_icmpne -> 89
    //   71: aload_0
    //   72: getfield div : D
    //   75: aload_0
    //   76: invokevirtual Dne : ()I
    //   79: i2f
    //   80: ldc 32.0
    //   82: fdiv
    //   83: f2d
    //   84: dsub
    //   85: invokestatic FWm : (D)I
    //   88: istore_3
    //   89: aload_0
    //   90: getfield Dne : I
    //   93: iconst_1
    //   94: if_icmpne -> 116
    //   97: aload_0
    //   98: getfield mrb : D
    //   101: aload_0
    //   102: invokevirtual Dne : ()I
    //   105: i2f
    //   106: ldc 32.0
    //   108: fdiv
    //   109: f2d
    //   110: dsub
    //   111: invokestatic FWm : (D)I
    //   114: istore #5
    //   116: aload_0
    //   117: getfield Dne : I
    //   120: ifne -> 141
    //   123: aload_0
    //   124: getfield div : D
    //   127: aload_0
    //   128: invokevirtual Dne : ()I
    //   131: i2f
    //   132: ldc 32.0
    //   134: fdiv
    //   135: f2d
    //   136: dsub
    //   137: invokestatic FWm : (D)I
    //   140: istore_3
    //   141: aload_0
    //   142: getfield Dne : I
    //   145: iconst_3
    //   146: if_icmpne -> 168
    //   149: aload_0
    //   150: getfield mrb : D
    //   153: aload_0
    //   154: invokevirtual Dne : ()I
    //   157: i2f
    //   158: ldc 32.0
    //   160: fdiv
    //   161: f2d
    //   162: dsub
    //   163: invokestatic FWm : (D)I
    //   166: istore #5
    //   168: aload_0
    //   169: getfield IjH : D
    //   172: aload_0
    //   173: invokevirtual bzF : ()I
    //   176: i2f
    //   177: ldc 32.0
    //   179: fdiv
    //   180: f2d
    //   181: dsub
    //   182: invokestatic FWm : (D)I
    //   185: istore #4
    //   187: iconst_0
    //   188: istore #6
    //   190: iload #6
    //   192: iload_1
    //   193: if_icmpge -> 290
    //   196: iconst_0
    //   197: istore #7
    //   199: iload #7
    //   201: iload_2
    //   202: if_icmpge -> 284
    //   205: aload_0
    //   206: getfield Dne : I
    //   209: iconst_2
    //   210: if_icmpeq -> 246
    //   213: aload_0
    //   214: getfield Dne : I
    //   217: ifeq -> 246
    //   220: aload_0
    //   221: getfield Dne : LQnq;
    //   224: aload_0
    //   225: getfield FWm : I
    //   228: iload #4
    //   230: iload #7
    //   232: iadd
    //   233: iload #5
    //   235: iload #6
    //   237: iadd
    //   238: invokevirtual Dne : (III)LKFd;
    //   241: astore #8
    //   243: goto -> 268
    //   246: aload_0
    //   247: getfield Dne : LQnq;
    //   250: iload_3
    //   251: iload #6
    //   253: iadd
    //   254: iload #4
    //   256: iload #7
    //   258: iadd
    //   259: aload_0
    //   260: getfield Qnq : I
    //   263: invokevirtual Dne : (III)LKFd;
    //   266: astore #8
    //   268: aload #8
    //   270: invokevirtual Dne : ()Z
    //   273: ifne -> 278
    //   276: iconst_0
    //   277: ireturn
    //   278: iinc #7, 1
    //   281: goto -> 199
    //   284: iinc #6, 1
    //   287: goto -> 190
    //   290: aload_0
    //   291: getfield Dne : LQnq;
    //   294: aload_0
    //   295: aload_0
    //   296: getfield Dne : LbSp;
    //   299: invokevirtual FWm : (LsMa;LbSp;)Ljava/util/List;
    //   302: astore #6
    //   304: aload #6
    //   306: invokeinterface iterator : ()Ljava/util/Iterator;
    //   311: astore #7
    //   313: aload #7
    //   315: invokeinterface hasNext : ()Z
    //   320: ifne -> 325
    //   323: iconst_1
    //   324: ireturn
    //   325: aload #7
    //   327: invokeinterface next : ()Ljava/lang/Object;
    //   332: checkcast sMa
    //   335: astore #8
    //   337: aload #8
    //   339: instanceof RsG
    //   342: ifeq -> 313
    //   345: iconst_0
    //   346: ireturn
  }
  
  public abstract void bzF();
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    if (this.Dne.aFZ == null && this.Zpi == 0.0F && paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3 > 0.0D) {
      g_();
      bzF();
    } 
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if (this.Zpi == 0.0F && this.Dne.aFZ == null) {
      g_();
      oIf();
      FiG fiG = null;
      if (paramzBn.FWm() instanceof FiG)
        fiG = (FiG)paramzBn.FWm(); 
      if (fiG != null && ((uqg)fiG.Dne).Qnq)
        return true; 
      bzF();
    } 
    return true;
  }
  
  private float Dne(int paramInt) {
    return (paramInt == 32) ? 0.5F : ((paramInt == 64) ? 0.5F : 0.0F);
  }
  
  protected void FWm() {}
  
  public RsG(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this(paramQnq);
    this.FWm = paramInt1;
    this.bzF = paramInt2;
    this.Qnq = paramInt3;
  }
  
  public boolean FWm(sMa paramsMa) {
    return (paramsMa instanceof FiG) ? Dne(zBn.Dne((FiG)paramsMa), 0) : false;
  }
  
  public RsG(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.5F, 0.5F);
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("Direction", (byte)this.Dne);
    paramWkD.Dne("TileX", this.FWm);
    paramWkD.Dne("TileY", this.bzF);
    paramWkD.Dne("TileZ", this.Qnq);
    switch (this.Dne) {
      case 0:
        paramWkD.Dne("Dir", (byte)2);
        break;
      case 1:
        paramWkD.Dne("Dir", (byte)1);
        break;
      case 2:
        paramWkD.Dne("Dir", (byte)0);
        break;
      case 3:
        paramWkD.Dne("Dir", (byte)3);
        break;
    } 
  }
  
  public abstract int bzF();
  
  public boolean kGO() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RsG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */