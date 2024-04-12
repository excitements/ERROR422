public class TpA extends ipD implements MqS {
  private int bzF;
  
  private String Dne;
  
  private boolean Dne;
  
  private long Dne;
  
  private NMq Dne;
  
  public static final SXd[][] Dne = new SXd[][] { { SXd.FWm, SXd.Qnq }, { SXd.Zpi, SXd.IjH }, { SXd.zGp }, { SXd.XHL } };
  
  private float Dne;
  
  private int Dne = -1;
  
  private int FWm;
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
  
  public double a_() {
    return 65536.0D;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public String b_() {
    return d_() ? this.Dne : "container.beacon";
  }
  
  public float Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifne -> 9
    //   7: fconst_0
    //   8: freturn
    //   9: aload_0
    //   10: getfield Dne : LQnq;
    //   13: invokevirtual FWm : ()J
    //   16: aload_0
    //   17: getfield Dne : J
    //   20: lsub
    //   21: l2i
    //   22: istore_1
    //   23: aload_0
    //   24: aload_0
    //   25: getfield Dne : LQnq;
    //   28: invokevirtual FWm : ()J
    //   31: putfield Dne : J
    //   34: iload_1
    //   35: iconst_1
    //   36: if_icmple -> 67
    //   39: aload_0
    //   40: dup
    //   41: getfield Dne : F
    //   44: iload_1
    //   45: i2f
    //   46: ldc 40.0
    //   48: fdiv
    //   49: fsub
    //   50: putfield Dne : F
    //   53: aload_0
    //   54: getfield Dne : F
    //   57: fconst_0
    //   58: fcmpg
    //   59: ifge -> 67
    //   62: aload_0
    //   63: fconst_0
    //   64: putfield Dne : F
    //   67: aload_0
    //   68: dup
    //   69: getfield Dne : F
    //   72: ldc 0.025
    //   74: fadd
    //   75: putfield Dne : F
    //   78: aload_0
    //   79: getfield Dne : F
    //   82: fconst_1
    //   83: fcmpl
    //   84: ifle -> 92
    //   87: aload_0
    //   88: fconst_1
    //   89: putfield Dne : F
    //   92: aload_0
    //   93: getfield Dne : F
    //   96: freturn
  }
  
  public int bzF() {
    return this.Dne;
  }
  
  public NMq Dne(int paramInt) {
    return (paramInt == 0) ? this.Dne : null;
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield FWm : I
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_2
    //   8: aload_0
    //   9: getfield Dne : I
    //   12: if_icmpge -> 73
    //   15: iload_2
    //   16: iconst_3
    //   17: if_icmpge -> 73
    //   20: getstatic TpA.Dne : [[LSXd;
    //   23: iload_2
    //   24: aaload
    //   25: astore_3
    //   26: aload_3
    //   27: arraylength
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #5
    //   35: iload #4
    //   37: if_icmpge -> 67
    //   40: aload_3
    //   41: iload #5
    //   43: aaload
    //   44: astore #6
    //   46: aload #6
    //   48: getfield Dne : I
    //   51: iload_1
    //   52: if_icmpne -> 61
    //   55: aload_0
    //   56: iload_1
    //   57: putfield FWm : I
    //   60: return
    //   61: iinc #5, 1
    //   64: goto -> 33
    //   67: iinc #2, 1
    //   70: goto -> 7
    //   73: return
  }
  
  public void bzF(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield bzF : I
    //   5: aload_0
    //   6: getfield Dne : I
    //   9: iconst_4
    //   10: if_icmplt -> 73
    //   13: iconst_0
    //   14: istore_2
    //   15: iload_2
    //   16: iconst_4
    //   17: if_icmpge -> 73
    //   20: getstatic TpA.Dne : [[LSXd;
    //   23: iload_2
    //   24: aaload
    //   25: astore_3
    //   26: aload_3
    //   27: arraylength
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #5
    //   35: iload #4
    //   37: if_icmpge -> 67
    //   40: aload_3
    //   41: iload #5
    //   43: aaload
    //   44: astore #6
    //   46: aload #6
    //   48: getfield Dne : I
    //   51: iload_1
    //   52: if_icmpne -> 61
    //   55: aload_0
    //   56: iload_1
    //   57: putfield bzF : I
    //   60: return
    //   61: iinc #5, 1
    //   64: goto -> 33
    //   67: iinc #2, 1
    //   70: goto -> 15
    //   73: return
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    this.FWm = paramWkD.Dne("Primary");
    this.bzF = paramWkD.Dne("Secondary");
    this.Dne = paramWkD.Dne("Levels");
  }
  
  public void Dne(String paramString) {
    this.Dne = paramString;
  }
  
  public int Dne() {
    return this.FWm;
  }
  
  private void div() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 278
    //   7: aload_0
    //   8: getfield Dne : I
    //   11: ifle -> 278
    //   14: aload_0
    //   15: getfield Dne : LQnq;
    //   18: getfield aFZ : Z
    //   21: ifne -> 278
    //   24: aload_0
    //   25: getfield FWm : I
    //   28: ifle -> 278
    //   31: aload_0
    //   32: getfield Dne : I
    //   35: bipush #10
    //   37: imul
    //   38: bipush #10
    //   40: iadd
    //   41: i2d
    //   42: dstore_1
    //   43: iconst_0
    //   44: istore_3
    //   45: aload_0
    //   46: getfield Dne : I
    //   49: iconst_4
    //   50: if_icmplt -> 66
    //   53: aload_0
    //   54: getfield FWm : I
    //   57: aload_0
    //   58: getfield bzF : I
    //   61: if_icmpne -> 66
    //   64: iconst_1
    //   65: istore_3
    //   66: invokestatic Dne : ()LzjJ;
    //   69: aload_0
    //   70: getfield Qnq : I
    //   73: i2d
    //   74: aload_0
    //   75: getfield aFZ : I
    //   78: i2d
    //   79: aload_0
    //   80: getfield zGp : I
    //   83: i2d
    //   84: aload_0
    //   85: getfield Qnq : I
    //   88: iconst_1
    //   89: iadd
    //   90: i2d
    //   91: aload_0
    //   92: getfield aFZ : I
    //   95: iconst_1
    //   96: iadd
    //   97: i2d
    //   98: aload_0
    //   99: getfield zGp : I
    //   102: iconst_1
    //   103: iadd
    //   104: i2d
    //   105: invokevirtual Dne : (DDDDDD)LbSp;
    //   108: dload_1
    //   109: dload_1
    //   110: dload_1
    //   111: invokevirtual FWm : (DDD)LbSp;
    //   114: astore #4
    //   116: aload #4
    //   118: aload_0
    //   119: getfield Dne : LQnq;
    //   122: invokevirtual FWm : ()I
    //   125: i2d
    //   126: putfield aFZ : D
    //   129: aload_0
    //   130: getfield Dne : LQnq;
    //   133: ldc FiG
    //   135: aload #4
    //   137: invokevirtual Dne : (Ljava/lang/Class;LbSp;)Ljava/util/List;
    //   140: astore #5
    //   142: aload #5
    //   144: invokeinterface iterator : ()Ljava/util/Iterator;
    //   149: astore #6
    //   151: aload #6
    //   153: invokeinterface hasNext : ()Z
    //   158: ifeq -> 197
    //   161: aload #6
    //   163: invokeinterface next : ()Ljava/lang/Object;
    //   168: checkcast FiG
    //   171: astore #7
    //   173: aload #7
    //   175: new NAx
    //   178: dup
    //   179: aload_0
    //   180: getfield FWm : I
    //   183: sipush #180
    //   186: iload_3
    //   187: iconst_1
    //   188: invokespecial <init> : (IIIZ)V
    //   191: invokevirtual Qnq : (LNAx;)V
    //   194: goto -> 151
    //   197: aload_0
    //   198: getfield Dne : I
    //   201: iconst_4
    //   202: if_icmplt -> 278
    //   205: aload_0
    //   206: getfield FWm : I
    //   209: aload_0
    //   210: getfield bzF : I
    //   213: if_icmpeq -> 278
    //   216: aload_0
    //   217: getfield bzF : I
    //   220: ifle -> 278
    //   223: aload #5
    //   225: invokeinterface iterator : ()Ljava/util/Iterator;
    //   230: astore #6
    //   232: aload #6
    //   234: invokeinterface hasNext : ()Z
    //   239: ifeq -> 278
    //   242: aload #6
    //   244: invokeinterface next : ()Ljava/lang/Object;
    //   249: checkcast FiG
    //   252: astore #7
    //   254: aload #7
    //   256: new NAx
    //   259: dup
    //   260: aload_0
    //   261: getfield bzF : I
    //   264: sipush #180
    //   267: iconst_0
    //   268: iconst_1
    //   269: invokespecial <init> : (IIIZ)V
    //   272: invokevirtual Qnq : (LNAx;)V
    //   275: goto -> 232
    //   278: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: invokevirtual FWm : ()J
    //   7: ldc2_w 80
    //   10: lrem
    //   11: lconst_0
    //   12: lcmp
    //   13: ifne -> 24
    //   16: aload_0
    //   17: invokespecial IjH : ()V
    //   20: aload_0
    //   21: invokespecial div : ()V
    //   24: return
  }
  
  private void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield Qnq : I
    //   8: aload_0
    //   9: getfield aFZ : I
    //   12: iconst_1
    //   13: iadd
    //   14: aload_0
    //   15: getfield zGp : I
    //   18: invokevirtual aFZ : (III)Z
    //   21: ifne -> 37
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield Dne : Z
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield Dne : I
    //   34: goto -> 217
    //   37: aload_0
    //   38: iconst_1
    //   39: putfield Dne : Z
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield Dne : I
    //   47: iconst_1
    //   48: istore_1
    //   49: iload_1
    //   50: iconst_4
    //   51: if_icmpgt -> 205
    //   54: aload_0
    //   55: getfield aFZ : I
    //   58: iload_1
    //   59: isub
    //   60: istore_2
    //   61: iload_2
    //   62: ifge -> 68
    //   65: goto -> 205
    //   68: iconst_1
    //   69: istore_3
    //   70: aload_0
    //   71: getfield Qnq : I
    //   74: iload_1
    //   75: isub
    //   76: istore #4
    //   78: iload #4
    //   80: aload_0
    //   81: getfield Qnq : I
    //   84: iload_1
    //   85: iadd
    //   86: if_icmpgt -> 187
    //   89: iload_3
    //   90: ifeq -> 187
    //   93: aload_0
    //   94: getfield zGp : I
    //   97: iload_1
    //   98: isub
    //   99: istore #5
    //   101: iload #5
    //   103: aload_0
    //   104: getfield zGp : I
    //   107: iload_1
    //   108: iadd
    //   109: if_icmpgt -> 181
    //   112: aload_0
    //   113: getfield Dne : LQnq;
    //   116: iload #4
    //   118: iload_2
    //   119: iload #5
    //   121: invokevirtual Dne : (III)I
    //   124: istore #6
    //   126: iload #6
    //   128: getstatic zKP.Jjb : LzKP;
    //   131: getfield FWm : I
    //   134: if_icmpeq -> 175
    //   137: iload #6
    //   139: getstatic zKP.Fnk : LzKP;
    //   142: getfield FWm : I
    //   145: if_icmpeq -> 175
    //   148: iload #6
    //   150: getstatic zKP.eHV : LzKP;
    //   153: getfield FWm : I
    //   156: if_icmpeq -> 175
    //   159: iload #6
    //   161: getstatic zKP.gnI : LzKP;
    //   164: getfield FWm : I
    //   167: if_icmpeq -> 175
    //   170: iconst_0
    //   171: istore_3
    //   172: goto -> 181
    //   175: iinc #5, 1
    //   178: goto -> 101
    //   181: iinc #4, 1
    //   184: goto -> 78
    //   187: iload_3
    //   188: ifne -> 194
    //   191: goto -> 205
    //   194: aload_0
    //   195: iload_1
    //   196: iinc #1, 1
    //   199: putfield Dne : I
    //   202: goto -> 49
    //   205: aload_0
    //   206: getfield Dne : I
    //   209: ifne -> 217
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield Dne : Z
    //   217: return
  }
  
  public NER Dne() {
    WkD wkD = new WkD();
    FWm(wkD);
    return new ipQ(this.Qnq, this.aFZ, this.zGp, 3, wkD);
  }
  
  public int FWm() {
    return this.bzF;
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 70
    //   4: aload_0
    //   5: getfield Dne : LNMq;
    //   8: ifnull -> 70
    //   11: iload_2
    //   12: aload_0
    //   13: getfield Dne : LNMq;
    //   16: getfield Dne : I
    //   19: if_icmplt -> 34
    //   22: aload_0
    //   23: getfield Dne : LNMq;
    //   26: astore_3
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield Dne : LNMq;
    //   32: aload_3
    //   33: areturn
    //   34: aload_0
    //   35: getfield Dne : LNMq;
    //   38: dup
    //   39: getfield Dne : I
    //   42: iload_2
    //   43: isub
    //   44: putfield Dne : I
    //   47: new NMq
    //   50: dup
    //   51: aload_0
    //   52: getfield Dne : LNMq;
    //   55: getfield bzF : I
    //   58: iload_2
    //   59: aload_0
    //   60: getfield Dne : LNMq;
    //   63: invokevirtual Qnq : ()I
    //   66: invokespecial <init> : (III)V
    //   69: areturn
    //   70: aconst_null
    //   71: areturn
  }
  
  public boolean Dne(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield Qnq : I
    //   8: aload_0
    //   9: getfield aFZ : I
    //   12: aload_0
    //   13: getfield zGp : I
    //   16: invokevirtual Dne : (III)LipD;
    //   19: aload_0
    //   20: if_acmpeq -> 27
    //   23: iconst_0
    //   24: goto -> 70
    //   27: aload_1
    //   28: aload_0
    //   29: getfield Qnq : I
    //   32: i2d
    //   33: ldc2_w 0.5
    //   36: dadd
    //   37: aload_0
    //   38: getfield aFZ : I
    //   41: i2d
    //   42: ldc2_w 0.5
    //   45: dadd
    //   46: aload_0
    //   47: getfield zGp : I
    //   50: i2d
    //   51: ldc2_w 0.5
    //   54: dadd
    //   55: invokevirtual Dne : (DDD)D
    //   58: ldc2_w 64.0
    //   61: dcmpg
    //   62: ifgt -> 69
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iconst_0
    //   70: ireturn
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    if (paramInt == 0)
      this.Dne = paramNMq; 
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return (paramNMq.bzF == dEr.Kvh.Qnq || paramNMq.bzF == dEr.div.Qnq || paramNMq.bzF == dEr.mrb.Qnq || paramNMq.bzF == dEr.IjH.Qnq);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    paramWkD.Dne("Primary", this.FWm);
    paramWkD.Dne("Secondary", this.bzF);
    paramWkD.Dne("Levels", this.Dne);
  }
  
  public boolean d_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: ifnull -> 21
    //   7: aload_0
    //   8: getfield Dne : Ljava/lang/String;
    //   11: invokevirtual length : ()I
    //   14: ifle -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: ireturn
  }
  
  public void i_() {}
  
  public NMq FWm(int paramInt) {
    if (paramInt == 0 && this.Dne != null) {
      int i = this.Dne;
      this.Dne = null;
      return i;
    } 
    return null;
  }
  
  public void bzF() {}
  
  public int Qnq() {
    return 1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TpA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */