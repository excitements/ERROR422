public class JiM extends sMa {
  private int bzF = 5;
  
  public int Dne;
  
  public int FWm;
  
  public float Dne = false;
  
  public JiM(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq);
    this.Dne = (float)(Math.random() * Math.PI * 2.0D);
    Dne(0.25F, 0.25F);
    this.udO = this.trS / 2.0F;
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.mrb = (float)(Math.random() * 360.0D);
    this.XHL = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
    this.Zpi = 0.20000000298023224D;
    this.kGO = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
  }
  
  public String Dne() {
    return KGL.Dne("item." + Dne().Dne());
  }
  
  private void Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: ldc JiM
    //   6: aload_0
    //   7: getfield Dne : LbSp;
    //   10: ldc2_w 0.5
    //   13: dconst_0
    //   14: ldc2_w 0.5
    //   17: invokevirtual FWm : (DDD)LbSp;
    //   20: invokevirtual Dne : (Ljava/lang/Class;LbSp;)Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 57
    //   38: aload_1
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast JiM
    //   47: astore_2
    //   48: aload_0
    //   49: aload_2
    //   50: invokevirtual Dne : (LJiM;)Z
    //   53: pop
    //   54: goto -> 29
    //   57: return
  }
  
  public boolean Dne(JiM paramJiM) {
    if (paramJiM == this)
      return false; 
    if (paramJiM.udO() && udO()) {
      NMq nMq1 = Dne();
      NMq nMq2 = paramJiM.Dne();
      if (nMq2.Dne() != nMq1.Dne())
        return false; 
      if ((nMq2.aFZ() ^ nMq1.aFZ()) != 0)
        return false; 
      if (nMq2.aFZ() && !nMq2.Dne().equals(nMq1.Dne()))
        return false; 
      if (nMq2.Dne().zGp() && nMq2.Qnq() != nMq1.Qnq())
        return false; 
      if (nMq2.Dne < nMq1.Dne)
        return paramJiM.Dne(this); 
      if (nMq2.Dne + nMq1.Dne > nMq2.FWm())
        return false; 
      nMq2.Dne += nMq1.Dne;
      paramJiM.FWm = Math.max(paramJiM.FWm, this.FWm);
      paramJiM.Dne = Math.min(paramJiM.Dne, this.Dne);
      paramJiM.Dne(nMq2);
      g_();
      return true;
    } 
    return false;
  }
  
  public JiM(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = (float)(Math.random() * Math.PI * 2.0D);
    Dne(0.25F, 0.25F);
    this.udO = this.trS / 2.0F;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: getfield FWm : I
    //   8: ifle -> 21
    //   11: aload_0
    //   12: dup
    //   13: getfield FWm : I
    //   16: iconst_1
    //   17: isub
    //   18: putfield FWm : I
    //   21: aload_0
    //   22: aload_0
    //   23: getfield div : D
    //   26: putfield aFZ : D
    //   29: aload_0
    //   30: aload_0
    //   31: getfield IjH : D
    //   34: putfield zGp : D
    //   37: aload_0
    //   38: aload_0
    //   39: getfield mrb : D
    //   42: putfield DyG : D
    //   45: aload_0
    //   46: dup
    //   47: getfield Zpi : D
    //   50: ldc2_w 0.03999999910593033
    //   53: dsub
    //   54: putfield Zpi : D
    //   57: aload_0
    //   58: aload_0
    //   59: aload_0
    //   60: getfield div : D
    //   63: aload_0
    //   64: getfield Dne : LbSp;
    //   67: getfield FWm : D
    //   70: aload_0
    //   71: getfield Dne : LbSp;
    //   74: getfield aFZ : D
    //   77: dadd
    //   78: ldc2_w 2.0
    //   81: ddiv
    //   82: aload_0
    //   83: getfield mrb : D
    //   86: invokevirtual Dne : (DDD)Z
    //   89: putfield kGO : Z
    //   92: aload_0
    //   93: aload_0
    //   94: getfield XHL : D
    //   97: aload_0
    //   98: getfield Zpi : D
    //   101: aload_0
    //   102: getfield kGO : D
    //   105: invokevirtual Dne : (DDD)V
    //   108: aload_0
    //   109: getfield aFZ : D
    //   112: d2i
    //   113: aload_0
    //   114: getfield div : D
    //   117: d2i
    //   118: if_icmpne -> 147
    //   121: aload_0
    //   122: getfield zGp : D
    //   125: d2i
    //   126: aload_0
    //   127: getfield IjH : D
    //   130: d2i
    //   131: if_icmpne -> 147
    //   134: aload_0
    //   135: getfield DyG : D
    //   138: d2i
    //   139: aload_0
    //   140: getfield mrb : D
    //   143: d2i
    //   144: if_icmpeq -> 151
    //   147: iconst_1
    //   148: goto -> 152
    //   151: iconst_0
    //   152: istore_1
    //   153: iload_1
    //   154: ifne -> 167
    //   157: aload_0
    //   158: getfield zGp : I
    //   161: bipush #25
    //   163: irem
    //   164: ifne -> 288
    //   167: aload_0
    //   168: getfield Dne : LQnq;
    //   171: aload_0
    //   172: getfield div : D
    //   175: invokestatic FWm : (D)I
    //   178: aload_0
    //   179: getfield IjH : D
    //   182: invokestatic FWm : (D)I
    //   185: aload_0
    //   186: getfield mrb : D
    //   189: invokestatic FWm : (D)I
    //   192: invokevirtual Dne : (III)LKFd;
    //   195: getstatic KFd.IjH : LKFd;
    //   198: if_acmpne -> 274
    //   201: aload_0
    //   202: ldc2_w 0.20000000298023224
    //   205: putfield Zpi : D
    //   208: aload_0
    //   209: aload_0
    //   210: getfield Dne : Ljava/util/Random;
    //   213: invokevirtual nextFloat : ()F
    //   216: aload_0
    //   217: getfield Dne : Ljava/util/Random;
    //   220: invokevirtual nextFloat : ()F
    //   223: fsub
    //   224: ldc 0.2
    //   226: fmul
    //   227: f2d
    //   228: putfield XHL : D
    //   231: aload_0
    //   232: aload_0
    //   233: getfield Dne : Ljava/util/Random;
    //   236: invokevirtual nextFloat : ()F
    //   239: aload_0
    //   240: getfield Dne : Ljava/util/Random;
    //   243: invokevirtual nextFloat : ()F
    //   246: fsub
    //   247: ldc 0.2
    //   249: fmul
    //   250: f2d
    //   251: putfield kGO : D
    //   254: aload_0
    //   255: ldc 'random.fizz'
    //   257: ldc 0.4
    //   259: fconst_2
    //   260: aload_0
    //   261: getfield Dne : Ljava/util/Random;
    //   264: invokevirtual nextFloat : ()F
    //   267: ldc 0.4
    //   269: fmul
    //   270: fadd
    //   271: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   274: aload_0
    //   275: getfield Dne : LQnq;
    //   278: getfield aFZ : Z
    //   281: ifne -> 288
    //   284: aload_0
    //   285: invokespecial Qnq : ()V
    //   288: ldc 0.98
    //   290: fstore_2
    //   291: aload_0
    //   292: getfield aFZ : Z
    //   295: ifeq -> 351
    //   298: ldc 0.58800006
    //   300: fstore_2
    //   301: aload_0
    //   302: getfield Dne : LQnq;
    //   305: aload_0
    //   306: getfield div : D
    //   309: invokestatic FWm : (D)I
    //   312: aload_0
    //   313: getfield Dne : LbSp;
    //   316: getfield FWm : D
    //   319: invokestatic FWm : (D)I
    //   322: iconst_1
    //   323: isub
    //   324: aload_0
    //   325: getfield mrb : D
    //   328: invokestatic FWm : (D)I
    //   331: invokevirtual Dne : (III)I
    //   334: istore_3
    //   335: iload_3
    //   336: ifle -> 351
    //   339: getstatic zKP.Dne : [LzKP;
    //   342: iload_3
    //   343: aaload
    //   344: getfield Qnq : F
    //   347: ldc 0.98
    //   349: fmul
    //   350: fstore_2
    //   351: aload_0
    //   352: dup
    //   353: getfield XHL : D
    //   356: fload_2
    //   357: f2d
    //   358: dmul
    //   359: putfield XHL : D
    //   362: aload_0
    //   363: dup
    //   364: getfield Zpi : D
    //   367: ldc2_w 0.9800000190734863
    //   370: dmul
    //   371: putfield Zpi : D
    //   374: aload_0
    //   375: dup
    //   376: getfield kGO : D
    //   379: fload_2
    //   380: f2d
    //   381: dmul
    //   382: putfield kGO : D
    //   385: aload_0
    //   386: getfield aFZ : Z
    //   389: ifeq -> 404
    //   392: aload_0
    //   393: dup
    //   394: getfield Zpi : D
    //   397: ldc2_w -0.5
    //   400: dmul
    //   401: putfield Zpi : D
    //   404: aload_0
    //   405: dup
    //   406: getfield Dne : I
    //   409: iconst_1
    //   410: iadd
    //   411: putfield Dne : I
    //   414: aload_0
    //   415: getfield Dne : LQnq;
    //   418: getfield aFZ : Z
    //   421: ifne -> 438
    //   424: aload_0
    //   425: getfield Dne : I
    //   428: sipush #6000
    //   431: if_icmplt -> 438
    //   434: aload_0
    //   435: invokevirtual g_ : ()V
    //   438: return
  }
  
  protected void FWm() {
    Dne().Dne(10, 5);
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public void a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 167
    //   10: aload_0
    //   11: invokevirtual Dne : ()LNMq;
    //   14: astore_2
    //   15: aload_2
    //   16: getfield Dne : I
    //   19: istore_3
    //   20: aload_0
    //   21: getfield FWm : I
    //   24: ifne -> 167
    //   27: aload_1
    //   28: getfield Dne : LMOS;
    //   31: aload_2
    //   32: invokevirtual Dne : (LNMq;)Z
    //   35: ifeq -> 167
    //   38: aload_2
    //   39: getfield bzF : I
    //   42: getstatic zKP.udO : LzKP;
    //   45: getfield FWm : I
    //   48: if_icmpne -> 58
    //   51: aload_1
    //   52: getstatic qlg.FWm : LAuk;
    //   55: invokevirtual Dne : (LRLC;)V
    //   58: aload_2
    //   59: getfield bzF : I
    //   62: getstatic dEr.LoG : LdEr;
    //   65: getfield Qnq : I
    //   68: if_icmpne -> 78
    //   71: aload_1
    //   72: getstatic qlg.ooe : LAuk;
    //   75: invokevirtual Dne : (LRLC;)V
    //   78: aload_2
    //   79: getfield bzF : I
    //   82: getstatic dEr.div : LdEr;
    //   85: getfield Qnq : I
    //   88: if_icmpne -> 98
    //   91: aload_1
    //   92: getstatic qlg.ATE : LAuk;
    //   95: invokevirtual Dne : (LRLC;)V
    //   98: aload_2
    //   99: getfield bzF : I
    //   102: getstatic dEr.TpV : LdEr;
    //   105: getfield Qnq : I
    //   108: if_icmpne -> 118
    //   111: aload_1
    //   112: getstatic qlg.EyB : LAuk;
    //   115: invokevirtual Dne : (LRLC;)V
    //   118: aload_0
    //   119: ldc_w 'random.pop'
    //   122: ldc 0.2
    //   124: aload_0
    //   125: getfield Dne : Ljava/util/Random;
    //   128: invokevirtual nextFloat : ()F
    //   131: aload_0
    //   132: getfield Dne : Ljava/util/Random;
    //   135: invokevirtual nextFloat : ()F
    //   138: fsub
    //   139: ldc_w 0.7
    //   142: fmul
    //   143: fconst_1
    //   144: fadd
    //   145: fconst_2
    //   146: fmul
    //   147: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   150: aload_1
    //   151: aload_0
    //   152: iload_3
    //   153: invokevirtual Dne : (LsMa;I)V
    //   156: aload_2
    //   157: getfield Dne : I
    //   160: ifgt -> 167
    //   163: aload_0
    //   164: invokevirtual g_ : ()V
    //   167: return
  }
  
  public void Dne(NMq paramNMq) {
    Dne().FWm(10, paramNMq);
    Dne().Dne(10);
  }
  
  public JiM(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, NMq paramNMq) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    Dne(paramNMq);
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("Health", (short)(byte)this.bzF);
    paramWkD.Dne("Age", (short)this.Dne);
    if (Dne() != null)
      paramWkD.Dne("Item", Dne().Dne(new WkD())); 
  }
  
  protected void zGp(int paramInt) {
    Dne((zBn)zBn.Dne, paramInt);
  }
  
  public void bzF() {
    this.Dne = 'ዀ';
  }
  
  public NMq Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Dne : ()LluM;
    //   4: bipush #10
    //   6: invokevirtual Dne : (I)LNMq;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnonnull -> 73
    //   14: aload_0
    //   15: getfield Dne : LQnq;
    //   18: ifnull -> 62
    //   21: aload_0
    //   22: getfield Dne : LQnq;
    //   25: invokevirtual Dne : ()LdLs;
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: ldc_w 'Item entity '
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: getfield aFZ : I
    //   45: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   48: ldc_w ' has no item?!'
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual toString : ()Ljava/lang/String;
    //   57: invokeinterface bzF : (Ljava/lang/String;)V
    //   62: new NMq
    //   65: dup
    //   66: getstatic zKP.Dne : LzKP;
    //   69: invokespecial <init> : (LzKP;)V
    //   72: areturn
    //   73: aload_1
    //   74: areturn
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if (Dne() != null && (Dne()).bzF == dEr.jsv.Qnq && paramzBn.FWm())
      return false; 
    oIf();
    this.bzF -= paramInt;
    if (this.bzF <= 0)
      g_(); 
    return false;
  }
  
  public boolean zGp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield Dne : LbSp;
    //   8: getstatic KFd.div : LKFd;
    //   11: aload_0
    //   12: invokevirtual Dne : (LbSp;LKFd;LsMa;)Z
    //   15: ireturn
  }
  
  public boolean bzF() {
    return false;
  }
  
  public void Qnq(int paramInt) {
    super.Qnq(paramInt);
    if (this.Dne.aFZ == null)
      Qnq(); 
  }
  
  public void FWm(WkD paramWkD) {
    this.bzF = paramWkD.Dne("Health") & 0xFF;
    this.Dne = paramWkD.Dne("Age");
    WkD wkD = paramWkD.Dne("Item");
    Dne(NMq.Dne(wkD));
    if (Dne() == null)
      g_(); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JiM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */