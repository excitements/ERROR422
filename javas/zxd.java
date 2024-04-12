public class zxd extends LHi {
  private int FWm;
  
  public void Dne(byte paramByte) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #16
    //   3: if_icmpne -> 65
    //   6: aload_0
    //   7: getfield Dne : LQnq;
    //   10: aload_0
    //   11: getfield div : D
    //   14: ldc2_w 0.5
    //   17: dadd
    //   18: aload_0
    //   19: getfield IjH : D
    //   22: ldc2_w 0.5
    //   25: dadd
    //   26: aload_0
    //   27: getfield mrb : D
    //   30: ldc2_w 0.5
    //   33: dadd
    //   34: ldc 'mob.zombie.remedy'
    //   36: fconst_1
    //   37: aload_0
    //   38: getfield Dne : Ljava/util/Random;
    //   41: invokevirtual nextFloat : ()F
    //   44: fadd
    //   45: aload_0
    //   46: getfield Dne : Ljava/util/Random;
    //   49: invokevirtual nextFloat : ()F
    //   52: ldc 0.7
    //   54: fmul
    //   55: ldc 0.3
    //   57: fadd
    //   58: iconst_0
    //   59: invokevirtual Dne : (DDDLjava/lang/String;FFZ)V
    //   62: goto -> 70
    //   65: aload_0
    //   66: iload_1
    //   67: invokespecial Dne : (B)V
    //   70: return
  }
  
  public void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: invokevirtual Dne : ()Z
    //   7: ifeq -> 164
    //   10: aload_0
    //   11: getfield Dne : LQnq;
    //   14: getfield aFZ : Z
    //   17: ifne -> 164
    //   20: aload_0
    //   21: invokevirtual IjH : ()Z
    //   24: ifne -> 164
    //   27: aload_0
    //   28: fconst_1
    //   29: invokevirtual Dne : (F)F
    //   32: fstore_1
    //   33: fload_1
    //   34: ldc 0.5
    //   36: fcmpl
    //   37: ifle -> 164
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/Random;
    //   44: invokevirtual nextFloat : ()F
    //   47: ldc 30.0
    //   49: fmul
    //   50: fload_1
    //   51: ldc 0.4
    //   53: fsub
    //   54: fconst_2
    //   55: fmul
    //   56: fcmpg
    //   57: ifge -> 164
    //   60: aload_0
    //   61: getfield Dne : LQnq;
    //   64: aload_0
    //   65: getfield div : D
    //   68: invokestatic FWm : (D)I
    //   71: aload_0
    //   72: getfield IjH : D
    //   75: invokestatic FWm : (D)I
    //   78: aload_0
    //   79: getfield mrb : D
    //   82: invokestatic FWm : (D)I
    //   85: invokevirtual aFZ : (III)Z
    //   88: ifeq -> 164
    //   91: iconst_1
    //   92: istore_2
    //   93: aload_0
    //   94: iconst_4
    //   95: invokevirtual Dne : (I)LNMq;
    //   98: astore_3
    //   99: aload_3
    //   100: ifnull -> 154
    //   103: aload_3
    //   104: invokevirtual FWm : ()Z
    //   107: ifeq -> 152
    //   110: aload_3
    //   111: aload_3
    //   112: invokevirtual bzF : ()I
    //   115: aload_0
    //   116: getfield Dne : Ljava/util/Random;
    //   119: iconst_2
    //   120: invokevirtual nextInt : (I)I
    //   123: iadd
    //   124: invokevirtual Dne : (I)V
    //   127: aload_3
    //   128: invokevirtual bzF : ()I
    //   131: aload_3
    //   132: invokevirtual aFZ : ()I
    //   135: if_icmplt -> 152
    //   138: aload_0
    //   139: aload_3
    //   140: invokevirtual FWm : (LNMq;)V
    //   143: aload_0
    //   144: iconst_4
    //   145: aconst_null
    //   146: checkcast NMq
    //   149: invokevirtual a_ : (ILNMq;)V
    //   152: iconst_0
    //   153: istore_2
    //   154: iload_2
    //   155: ifeq -> 164
    //   158: aload_0
    //   159: bipush #8
    //   161: invokevirtual aFZ : (I)V
    //   164: aload_0
    //   165: invokespecial IjH : ()V
    //   168: return
  }
  
  public int Zpi() {
    int i = super.Zpi() + 2;
    if (i > 20)
      i = 20; 
    return i;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    if (IjH())
      paramWkD.Dne("IsBaby", true); 
    if (LVR())
      paramWkD.Dne("IsVillager", true); 
    paramWkD.Dne("ConversionTime", ZfC() ? this.FWm : -1);
  }
  
  protected void IjH(int paramInt) {
    switch (this.Dne.nextInt(3)) {
      case 0:
        Dne(dEr.IjH.Qnq, 1);
        break;
      case 1:
        Dne(dEr.dYY.Qnq, 1);
        break;
      case 2:
        Dne(dEr.dnY.Qnq, 1);
        break;
    } 
  }
  
  protected int kGO() {
    return dEr.gvF.Qnq;
  }
  
  protected void FWm() {
    super.FWm();
    Dne().Dne(12, Byte.valueOf((byte)0));
    Dne().Dne(13, Byte.valueOf((byte)0));
    Dne().Dne(14, Byte.valueOf((byte)0));
  }
  
  public boolean a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual bzF : ()LNMq;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 118
    //   9: aload_2
    //   10: invokevirtual Dne : ()LdEr;
    //   13: getstatic dEr.ZfC : LdEr;
    //   16: if_acmpne -> 118
    //   19: aload_2
    //   20: invokevirtual Qnq : ()I
    //   23: ifne -> 118
    //   26: aload_0
    //   27: invokevirtual LVR : ()Z
    //   30: ifeq -> 118
    //   33: aload_0
    //   34: getstatic SXd.Vxn : LSXd;
    //   37: invokevirtual Dne : (LSXd;)Z
    //   40: ifeq -> 118
    //   43: aload_1
    //   44: getfield Dne : Luqg;
    //   47: getfield Qnq : Z
    //   50: ifne -> 63
    //   53: aload_2
    //   54: dup
    //   55: getfield Dne : I
    //   58: iconst_1
    //   59: isub
    //   60: putfield Dne : I
    //   63: aload_2
    //   64: getfield Dne : I
    //   67: ifgt -> 88
    //   70: aload_1
    //   71: getfield Dne : LMOS;
    //   74: aload_1
    //   75: getfield Dne : LMOS;
    //   78: getfield Dne : I
    //   81: aconst_null
    //   82: checkcast NMq
    //   85: invokevirtual Dne : (ILNMq;)V
    //   88: aload_0
    //   89: getfield Dne : LQnq;
    //   92: getfield aFZ : Z
    //   95: ifne -> 116
    //   98: aload_0
    //   99: aload_0
    //   100: getfield Dne : Ljava/util/Random;
    //   103: sipush #2401
    //   106: invokevirtual nextInt : (I)I
    //   109: sipush #3600
    //   112: iadd
    //   113: invokevirtual FWm : (I)V
    //   116: iconst_1
    //   117: ireturn
    //   118: iconst_0
    //   119: ireturn
  }
  
  public boolean bzF(sMa paramsMa) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial bzF : (LsMa;)Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq -> 59
    //   10: aload_0
    //   11: invokevirtual Dne : ()LNMq;
    //   14: ifnonnull -> 59
    //   17: aload_0
    //   18: invokevirtual trS : ()Z
    //   21: ifeq -> 59
    //   24: aload_0
    //   25: getfield Dne : Ljava/util/Random;
    //   28: invokevirtual nextFloat : ()F
    //   31: aload_0
    //   32: getfield Dne : LQnq;
    //   35: getfield aFZ : I
    //   38: i2f
    //   39: ldc 0.3
    //   41: fmul
    //   42: fcmpg
    //   43: ifge -> 59
    //   46: aload_1
    //   47: iconst_2
    //   48: aload_0
    //   49: getfield Dne : LQnq;
    //   52: getfield aFZ : I
    //   55: imul
    //   56: invokevirtual aFZ : (I)V
    //   59: iload_2
    //   60: ireturn
  }
  
  public void Dne() {
    if (this.Dne.aFZ == null && ZfC()) {
      int i = bzF();
      this.FWm -= i;
      if (this.FWm <= 0)
        Qnq(); 
    } 
    super.Dne();
  }
  
  protected int bzF() {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield Dne : Ljava/util/Random;
    //   6: invokevirtual nextFloat : ()F
    //   9: ldc 0.01
    //   11: fcmpg
    //   12: ifge -> 169
    //   15: iconst_0
    //   16: istore_2
    //   17: aload_0
    //   18: getfield div : D
    //   21: d2i
    //   22: iconst_4
    //   23: isub
    //   24: istore_3
    //   25: iload_3
    //   26: aload_0
    //   27: getfield div : D
    //   30: d2i
    //   31: iconst_4
    //   32: iadd
    //   33: if_icmpge -> 169
    //   36: iload_2
    //   37: bipush #14
    //   39: if_icmpge -> 169
    //   42: aload_0
    //   43: getfield IjH : D
    //   46: d2i
    //   47: iconst_4
    //   48: isub
    //   49: istore #4
    //   51: iload #4
    //   53: aload_0
    //   54: getfield IjH : D
    //   57: d2i
    //   58: iconst_4
    //   59: iadd
    //   60: if_icmpge -> 163
    //   63: iload_2
    //   64: bipush #14
    //   66: if_icmpge -> 163
    //   69: aload_0
    //   70: getfield mrb : D
    //   73: d2i
    //   74: iconst_4
    //   75: isub
    //   76: istore #5
    //   78: iload #5
    //   80: aload_0
    //   81: getfield mrb : D
    //   84: d2i
    //   85: iconst_4
    //   86: iadd
    //   87: if_icmpge -> 157
    //   90: iload_2
    //   91: bipush #14
    //   93: if_icmpge -> 157
    //   96: aload_0
    //   97: getfield Dne : LQnq;
    //   100: iload_3
    //   101: iload #4
    //   103: iload #5
    //   105: invokevirtual Dne : (III)I
    //   108: istore #6
    //   110: iload #6
    //   112: getstatic zKP.Sdr : LzKP;
    //   115: getfield FWm : I
    //   118: if_icmpeq -> 132
    //   121: iload #6
    //   123: getstatic zKP.FfS : LzKP;
    //   126: getfield FWm : I
    //   129: if_icmpne -> 151
    //   132: aload_0
    //   133: getfield Dne : Ljava/util/Random;
    //   136: invokevirtual nextFloat : ()F
    //   139: ldc 0.3
    //   141: fcmpg
    //   142: ifge -> 148
    //   145: iinc #1, 1
    //   148: iinc #2, 1
    //   151: iinc #5, 1
    //   154: goto -> 78
    //   157: iinc #4, 1
    //   160: goto -> 51
    //   163: iinc #3, 1
    //   166: goto -> 25
    //   169: iload_1
    //   170: ireturn
  }
  
  protected String zGp() {
    return "mob.zombie.say";
  }
  
  public zxd(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield FWm : I
    //   10: aload_0
    //   11: ldc '/mob/zombie.png'
    //   13: putfield bzF : Ljava/lang/String;
    //   16: aload_0
    //   17: ldc 0.23
    //   19: putfield cHy : F
    //   22: aload_0
    //   23: invokevirtual Dne : ()LKFZ;
    //   26: iconst_1
    //   27: invokevirtual FWm : (Z)V
    //   30: aload_0
    //   31: getfield Dne : LOKo;
    //   34: iconst_0
    //   35: new Cyb
    //   38: dup
    //   39: aload_0
    //   40: invokespecial <init> : (LFUH;)V
    //   43: invokevirtual Dne : (ILcMv;)V
    //   46: aload_0
    //   47: getfield Dne : LOKo;
    //   50: iconst_1
    //   51: new zPr
    //   54: dup
    //   55: aload_0
    //   56: invokespecial <init> : (LFUH;)V
    //   59: invokevirtual Dne : (ILcMv;)V
    //   62: aload_0
    //   63: getfield Dne : LOKo;
    //   66: iconst_2
    //   67: new etz
    //   70: dup
    //   71: aload_0
    //   72: ldc FiG
    //   74: aload_0
    //   75: getfield cHy : F
    //   78: iconst_0
    //   79: invokespecial <init> : (LFUH;Ljava/lang/Class;FZ)V
    //   82: invokevirtual Dne : (ILcMv;)V
    //   85: aload_0
    //   86: getfield Dne : LOKo;
    //   89: iconst_3
    //   90: new etz
    //   93: dup
    //   94: aload_0
    //   95: ldc_w pjB
    //   98: aload_0
    //   99: getfield cHy : F
    //   102: iconst_1
    //   103: invokespecial <init> : (LFUH;Ljava/lang/Class;FZ)V
    //   106: invokevirtual Dne : (ILcMv;)V
    //   109: aload_0
    //   110: getfield Dne : LOKo;
    //   113: iconst_4
    //   114: new ZWx
    //   117: dup
    //   118: aload_0
    //   119: aload_0
    //   120: getfield cHy : F
    //   123: invokespecial <init> : (LkSJ;F)V
    //   126: invokevirtual Dne : (ILcMv;)V
    //   129: aload_0
    //   130: getfield Dne : LOKo;
    //   133: iconst_5
    //   134: new cBP
    //   137: dup
    //   138: aload_0
    //   139: aload_0
    //   140: getfield cHy : F
    //   143: iconst_0
    //   144: invokespecial <init> : (LkSJ;FZ)V
    //   147: invokevirtual Dne : (ILcMv;)V
    //   150: aload_0
    //   151: getfield Dne : LOKo;
    //   154: bipush #6
    //   156: new IBw
    //   159: dup
    //   160: aload_0
    //   161: aload_0
    //   162: getfield cHy : F
    //   165: invokespecial <init> : (LkSJ;F)V
    //   168: invokevirtual Dne : (ILcMv;)V
    //   171: aload_0
    //   172: getfield Dne : LOKo;
    //   175: bipush #7
    //   177: new yws
    //   180: dup
    //   181: aload_0
    //   182: ldc FiG
    //   184: ldc_w 8.0
    //   187: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   190: invokevirtual Dne : (ILcMv;)V
    //   193: aload_0
    //   194: getfield Dne : LOKo;
    //   197: bipush #7
    //   199: new cHg
    //   202: dup
    //   203: aload_0
    //   204: invokespecial <init> : (LFUH;)V
    //   207: invokevirtual Dne : (ILcMv;)V
    //   210: aload_0
    //   211: getfield FWm : LOKo;
    //   214: iconst_1
    //   215: new QRF
    //   218: dup
    //   219: aload_0
    //   220: iconst_1
    //   221: invokespecial <init> : (LFUH;Z)V
    //   224: invokevirtual Dne : (ILcMv;)V
    //   227: aload_0
    //   228: getfield FWm : LOKo;
    //   231: iconst_2
    //   232: new AmF
    //   235: dup
    //   236: aload_0
    //   237: ldc FiG
    //   239: ldc_w 16.0
    //   242: iconst_0
    //   243: iconst_1
    //   244: invokespecial <init> : (LFUH;Ljava/lang/Class;FIZ)V
    //   247: invokevirtual Dne : (ILcMv;)V
    //   250: aload_0
    //   251: getfield FWm : LOKo;
    //   254: iconst_2
    //   255: new AmF
    //   258: dup
    //   259: aload_0
    //   260: ldc_w pjB
    //   263: ldc_w 16.0
    //   266: iconst_0
    //   267: iconst_0
    //   268: invokespecial <init> : (LFUH;Ljava/lang/Class;FIZ)V
    //   271: invokevirtual Dne : (ILcMv;)V
    //   274: return
  }
  
  protected void Qnq() {
    // Byte code:
    //   0: new pjB
    //   3: dup
    //   4: aload_0
    //   5: getfield Dne : LQnq;
    //   8: invokespecial <init> : (LQnq;)V
    //   11: astore_1
    //   12: aload_1
    //   13: aload_0
    //   14: invokevirtual zGp : (LsMa;)V
    //   17: aload_1
    //   18: invokevirtual ICU : ()V
    //   21: aload_1
    //   22: invokevirtual Qnq : ()V
    //   25: aload_0
    //   26: invokevirtual IjH : ()Z
    //   29: ifeq -> 39
    //   32: aload_1
    //   33: sipush #-24000
    //   36: invokevirtual FWm : (I)V
    //   39: aload_0
    //   40: getfield Dne : LQnq;
    //   43: aload_0
    //   44: invokevirtual bzF : (LsMa;)V
    //   47: aload_0
    //   48: getfield Dne : LQnq;
    //   51: aload_1
    //   52: invokevirtual FWm : (LsMa;)Z
    //   55: pop
    //   56: aload_1
    //   57: new NAx
    //   60: dup
    //   61: getstatic SXd.mrb : LSXd;
    //   64: getfield Dne : I
    //   67: sipush #200
    //   70: iconst_0
    //   71: invokespecial <init> : (III)V
    //   74: invokevirtual Qnq : (LNAx;)V
    //   77: aload_0
    //   78: getfield Dne : LQnq;
    //   81: aconst_null
    //   82: checkcast FiG
    //   85: sipush #1017
    //   88: aload_0
    //   89: getfield div : D
    //   92: d2i
    //   93: aload_0
    //   94: getfield IjH : D
    //   97: d2i
    //   98: aload_0
    //   99: getfield mrb : D
    //   102: d2i
    //   103: iconst_0
    //   104: invokevirtual Dne : (LFiG;IIIII)V
    //   107: return
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (paramWkD.FWm("IsBaby"))
      FWm(true); 
    if (paramWkD.FWm("IsVillager"))
      IjH(true); 
    if (paramWkD.Dne("ConversionTime") && paramWkD.Dne("ConversionTime") > -1)
      FWm(paramWkD.Dne("ConversionTime")); 
  }
  
  public void Dne(FUH paramFUH) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial Dne : (LFUH;)V
    //   5: aload_0
    //   6: getfield Dne : LQnq;
    //   9: getfield aFZ : I
    //   12: iconst_2
    //   13: if_icmplt -> 130
    //   16: aload_1
    //   17: instanceof pjB
    //   20: ifeq -> 130
    //   23: aload_0
    //   24: getfield Dne : LQnq;
    //   27: getfield aFZ : I
    //   30: iconst_2
    //   31: if_icmpne -> 45
    //   34: aload_0
    //   35: getfield Dne : Ljava/util/Random;
    //   38: invokevirtual nextBoolean : ()Z
    //   41: ifeq -> 45
    //   44: return
    //   45: new zxd
    //   48: dup
    //   49: aload_0
    //   50: getfield Dne : LQnq;
    //   53: invokespecial <init> : (LQnq;)V
    //   56: astore_2
    //   57: aload_2
    //   58: aload_1
    //   59: invokevirtual zGp : (LsMa;)V
    //   62: aload_0
    //   63: getfield Dne : LQnq;
    //   66: aload_1
    //   67: invokevirtual bzF : (LsMa;)V
    //   70: aload_2
    //   71: invokevirtual ICU : ()V
    //   74: aload_2
    //   75: iconst_1
    //   76: invokevirtual IjH : (Z)V
    //   79: aload_1
    //   80: invokevirtual IjH : ()Z
    //   83: ifeq -> 91
    //   86: aload_2
    //   87: iconst_1
    //   88: invokevirtual FWm : (Z)V
    //   91: aload_0
    //   92: getfield Dne : LQnq;
    //   95: aload_2
    //   96: invokevirtual FWm : (LsMa;)Z
    //   99: pop
    //   100: aload_0
    //   101: getfield Dne : LQnq;
    //   104: aconst_null
    //   105: checkcast FiG
    //   108: sipush #1016
    //   111: aload_0
    //   112: getfield div : D
    //   115: d2i
    //   116: aload_0
    //   117: getfield IjH : D
    //   120: d2i
    //   121: aload_0
    //   122: getfield mrb : D
    //   125: d2i
    //   126: iconst_0
    //   127: invokevirtual Dne : (LFiG;IIIII)V
    //   130: return
  }
  
  public void ICU() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield Dne : Ljava/util/Random;
    //   5: invokevirtual nextFloat : ()F
    //   8: getstatic zxd.Dne : [F
    //   11: aload_0
    //   12: getfield Dne : LQnq;
    //   15: getfield aFZ : I
    //   18: faload
    //   19: fcmpg
    //   20: ifge -> 27
    //   23: iconst_1
    //   24: goto -> 28
    //   27: iconst_0
    //   28: invokevirtual div : (Z)V
    //   31: aload_0
    //   32: getfield Dne : LQnq;
    //   35: getfield Dne : Ljava/util/Random;
    //   38: invokevirtual nextFloat : ()F
    //   41: ldc_w 0.05
    //   44: fcmpg
    //   45: ifge -> 53
    //   48: aload_0
    //   49: iconst_1
    //   50: invokevirtual IjH : (Z)V
    //   53: aload_0
    //   54: invokevirtual qrB : ()V
    //   57: aload_0
    //   58: invokevirtual LVR : ()V
    //   61: aload_0
    //   62: iconst_4
    //   63: invokevirtual Dne : (I)LNMq;
    //   66: ifnonnull -> 155
    //   69: aload_0
    //   70: getfield Dne : LQnq;
    //   73: invokevirtual Dne : ()Ljava/util/Calendar;
    //   76: astore_1
    //   77: aload_1
    //   78: iconst_2
    //   79: invokevirtual get : (I)I
    //   82: iconst_1
    //   83: iadd
    //   84: bipush #10
    //   86: if_icmpne -> 155
    //   89: aload_1
    //   90: iconst_5
    //   91: invokevirtual get : (I)I
    //   94: bipush #31
    //   96: if_icmpne -> 155
    //   99: aload_0
    //   100: getfield Dne : Ljava/util/Random;
    //   103: invokevirtual nextFloat : ()F
    //   106: ldc_w 0.25
    //   109: fcmpg
    //   110: ifge -> 155
    //   113: aload_0
    //   114: iconst_4
    //   115: new NMq
    //   118: dup
    //   119: aload_0
    //   120: getfield Dne : Ljava/util/Random;
    //   123: invokevirtual nextFloat : ()F
    //   126: ldc_w 0.1
    //   129: fcmpg
    //   130: ifge -> 139
    //   133: getstatic zKP.XwR : LzKP;
    //   136: goto -> 142
    //   139: getstatic zKP.aJO : LzKP;
    //   142: invokespecial <init> : (LzKP;)V
    //   145: invokevirtual a_ : (ILNMq;)V
    //   148: aload_0
    //   149: getfield FWm : [F
    //   152: iconst_4
    //   153: fconst_0
    //   154: fastore
    //   155: return
  }
  
  public boolean IjH() {
    return (Dne().Dne(12) == 1);
  }
  
  public float mrb() {
    return super.mrb() * (IjH() ? 1.5F : 1.0F);
  }
  
  protected String div() {
    return "mob.zombie.death";
  }
  
  protected void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield FWm : I
    //   5: aload_0
    //   6: invokevirtual Dne : ()LluM;
    //   9: bipush #14
    //   11: iconst_1
    //   12: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   15: invokevirtual FWm : (ILjava/lang/Object;)V
    //   18: aload_0
    //   19: getstatic SXd.Vxn : LSXd;
    //   22: getfield Dne : I
    //   25: invokevirtual XHL : (I)V
    //   28: aload_0
    //   29: new NAx
    //   32: dup
    //   33: getstatic SXd.zGp : LSXd;
    //   36: getfield Dne : I
    //   39: iload_1
    //   40: aload_0
    //   41: getfield Dne : LQnq;
    //   44: getfield aFZ : I
    //   47: iconst_1
    //   48: isub
    //   49: iconst_0
    //   50: invokestatic min : (II)I
    //   53: invokespecial <init> : (III)V
    //   56: invokevirtual Qnq : (LNAx;)V
    //   59: aload_0
    //   60: getfield Dne : LQnq;
    //   63: aload_0
    //   64: bipush #16
    //   66: invokevirtual Dne : (LsMa;B)V
    //   69: return
  }
  
  public String bzF() {
    return LVR() ? "/mob/zombie_villager.png" : "/mob/zombie.png";
  }
  
  public int Dne() {
    return 20;
  }
  
  public boolean LVR() {
    return (Dne().Dne(13) == 1);
  }
  
  public void IjH(boolean paramBoolean) {
    Dne().FWm(13, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
  }
  
  public void FWm(boolean paramBoolean) {
    Dne().FWm(12, Byte.valueOf((byte)1));
  }
  
  protected String DyG() {
    return "mob.zombie.hurt";
  }
  
  public aYc Dne() {
    return aYc.FWm;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.zombie.step", 0.15F, 1.0F);
  }
  
  protected void qrB() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial qrB : ()V
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/Random;
    //   8: invokevirtual nextFloat : ()F
    //   11: aload_0
    //   12: getfield Dne : LQnq;
    //   15: getfield aFZ : I
    //   18: iconst_3
    //   19: if_icmpne -> 28
    //   22: ldc_w 0.05
    //   25: goto -> 30
    //   28: ldc 0.01
    //   30: fcmpg
    //   31: ifge -> 80
    //   34: aload_0
    //   35: getfield Dne : Ljava/util/Random;
    //   38: iconst_3
    //   39: invokevirtual nextInt : (I)I
    //   42: istore_1
    //   43: iload_1
    //   44: ifne -> 65
    //   47: aload_0
    //   48: iconst_0
    //   49: new NMq
    //   52: dup
    //   53: getstatic dEr.XHL : LdEr;
    //   56: invokespecial <init> : (LdEr;)V
    //   59: invokevirtual a_ : (ILNMq;)V
    //   62: goto -> 80
    //   65: aload_0
    //   66: iconst_0
    //   67: new NMq
    //   70: dup
    //   71: getstatic dEr.Dne : LdEr;
    //   74: invokespecial <init> : (LdEr;)V
    //   77: invokevirtual a_ : (ILNMq;)V
    //   80: return
  }
  
  protected int Qnq() {
    return 40;
  }
  
  protected boolean tgc() {
    return true;
  }
  
  public int Dne(sMa paramsMa) {
    NMq nMq = Dne();
    float f = (Dne() - XHL()) / Dne();
    int i = 3 + geR.Dne(f * 4.0F);
    if (nMq != null)
      i += nMq.Dne(this); 
    return i;
  }
  
  public boolean ZfC() {
    return (Dne().Dne(14) == 1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zxd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */