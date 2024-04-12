public abstract class ycv {
  public static final ycv EyB;
  
  public static final ycv FfS;
  
  public static final ycv DyG;
  
  public static final ycv XHL;
  
  public static final ycv Dne;
  
  public static final ycv Qnq;
  
  public final int FWm;
  
  public static final ycv[] Dne;
  
  public static final ycv trS;
  
  public static final ycv ceE;
  
  public static final ycv zGp;
  
  public static final ycv[] FWm;
  
  public static final ycv Zpi;
  
  public static final ycv IjH;
  
  public static final ycv div;
  
  public static final ycv Vxn;
  
  public ACj Dne;
  
  public static final ycv FWm;
  
  public static final ycv aFZ;
  
  public static final ycv ATE;
  
  public static final ycv qLR;
  
  public static final ycv bzF;
  
  public static final ycv udO;
  
  public static final ycv ooe;
  
  public static final ycv kGO;
  
  private final int Dne;
  
  public static final ycv mrb;
  
  protected String Dne;
  
  public int Dne() {
    return 1;
  }
  
  public String Dne() {
    return "enchantment." + this.Dne;
  }
  
  protected ycv(int paramInt1, int paramInt2, ACj paramACj) {
    this.FWm = paramInt1;
    this.Dne = paramInt2;
    this.Dne = (String)paramACj;
    if (Dne[paramInt1] != null)
      throw new IllegalArgumentException("Duplicate enchantment id!"); 
    Dne[paramInt1] = (String)this;
  }
  
  public int bzF() {
    return 1;
  }
  
  public int Dne(int paramInt) {
    return 1 + paramInt * 10;
  }
  
  public int FWm(int paramInt) {
    return Dne(paramInt) + 5;
  }
  
  public int Dne(int paramInt, FUH paramFUH) {
    return 0;
  }
  
  public String Dne(int paramInt) {
    String str = KGL.Dne(Dne());
    return str + " " + KGL.Dne("enchantment.level." + paramInt);
  }
  
  public ycv Dne(String paramString) {
    this.Dne = paramString;
    return this;
  }
  
  public boolean Dne(NMq paramNMq) {
    return this.Dne.Dne(paramNMq.Dne());
  }
  
  static {
    // Byte code:
    //   0: sipush #256
    //   3: anewarray ycv
    //   6: putstatic ycv.Dne : [Lycv;
    //   9: new oAi
    //   12: dup
    //   13: iconst_0
    //   14: bipush #10
    //   16: iconst_0
    //   17: invokespecial <init> : (III)V
    //   20: putstatic ycv.Dne : Lycv;
    //   23: new oAi
    //   26: dup
    //   27: iconst_1
    //   28: iconst_5
    //   29: iconst_1
    //   30: invokespecial <init> : (III)V
    //   33: putstatic ycv.FWm : Lycv;
    //   36: new oAi
    //   39: dup
    //   40: iconst_2
    //   41: iconst_5
    //   42: iconst_2
    //   43: invokespecial <init> : (III)V
    //   46: putstatic ycv.bzF : Lycv;
    //   49: new oAi
    //   52: dup
    //   53: iconst_3
    //   54: iconst_2
    //   55: iconst_3
    //   56: invokespecial <init> : (III)V
    //   59: putstatic ycv.Qnq : Lycv;
    //   62: new oAi
    //   65: dup
    //   66: iconst_4
    //   67: iconst_5
    //   68: iconst_4
    //   69: invokespecial <init> : (III)V
    //   72: putstatic ycv.aFZ : Lycv;
    //   75: new KBS
    //   78: dup
    //   79: iconst_5
    //   80: iconst_2
    //   81: invokespecial <init> : (II)V
    //   84: putstatic ycv.zGp : Lycv;
    //   87: new QHu
    //   90: dup
    //   91: bipush #6
    //   93: iconst_2
    //   94: invokespecial <init> : (II)V
    //   97: putstatic ycv.DyG : Lycv;
    //   100: new kqp
    //   103: dup
    //   104: bipush #7
    //   106: iconst_1
    //   107: invokespecial <init> : (II)V
    //   110: putstatic ycv.div : Lycv;
    //   113: new ZMH
    //   116: dup
    //   117: bipush #16
    //   119: bipush #10
    //   121: iconst_0
    //   122: invokespecial <init> : (III)V
    //   125: putstatic ycv.IjH : Lycv;
    //   128: new ZMH
    //   131: dup
    //   132: bipush #17
    //   134: iconst_5
    //   135: iconst_1
    //   136: invokespecial <init> : (III)V
    //   139: putstatic ycv.mrb : Lycv;
    //   142: new ZMH
    //   145: dup
    //   146: bipush #18
    //   148: iconst_5
    //   149: iconst_2
    //   150: invokespecial <init> : (III)V
    //   153: putstatic ycv.XHL : Lycv;
    //   156: new xrq
    //   159: dup
    //   160: bipush #19
    //   162: iconst_5
    //   163: invokespecial <init> : (II)V
    //   166: putstatic ycv.Zpi : Lycv;
    //   169: new KuM
    //   172: dup
    //   173: bipush #20
    //   175: iconst_2
    //   176: invokespecial <init> : (II)V
    //   179: putstatic ycv.kGO : Lycv;
    //   182: new ncG
    //   185: dup
    //   186: bipush #21
    //   188: iconst_2
    //   189: getstatic ACj.DyG : LACj;
    //   192: invokespecial <init> : (IILACj;)V
    //   195: putstatic ycv.udO : Lycv;
    //   198: new EBB
    //   201: dup
    //   202: bipush #32
    //   204: bipush #10
    //   206: invokespecial <init> : (II)V
    //   209: putstatic ycv.ooe : Lycv;
    //   212: new iSk
    //   215: dup
    //   216: bipush #33
    //   218: iconst_1
    //   219: invokespecial <init> : (II)V
    //   222: putstatic ycv.trS : Lycv;
    //   225: new Nkb
    //   228: dup
    //   229: bipush #34
    //   231: iconst_5
    //   232: invokespecial <init> : (II)V
    //   235: putstatic ycv.qLR : Lycv;
    //   238: new ncG
    //   241: dup
    //   242: bipush #35
    //   244: iconst_2
    //   245: getstatic ACj.div : LACj;
    //   248: invokespecial <init> : (IILACj;)V
    //   251: putstatic ycv.ATE : Lycv;
    //   254: new kwB
    //   257: dup
    //   258: bipush #48
    //   260: bipush #10
    //   262: invokespecial <init> : (II)V
    //   265: putstatic ycv.Vxn : Lycv;
    //   268: new WsU
    //   271: dup
    //   272: bipush #49
    //   274: iconst_2
    //   275: invokespecial <init> : (II)V
    //   278: putstatic ycv.ceE : Lycv;
    //   281: new tkj
    //   284: dup
    //   285: bipush #50
    //   287: iconst_2
    //   288: invokespecial <init> : (II)V
    //   291: putstatic ycv.EyB : Lycv;
    //   294: new RfV
    //   297: dup
    //   298: bipush #51
    //   300: iconst_1
    //   301: invokespecial <init> : (II)V
    //   304: putstatic ycv.FfS : Lycv;
    //   307: new java/util/ArrayList
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore_0
    //   315: getstatic ycv.Dne : [Lycv;
    //   318: astore_1
    //   319: aload_1
    //   320: arraylength
    //   321: istore_2
    //   322: iconst_0
    //   323: istore_3
    //   324: iload_3
    //   325: iload_2
    //   326: if_icmpge -> 352
    //   329: aload_1
    //   330: iload_3
    //   331: aaload
    //   332: astore #4
    //   334: aload #4
    //   336: ifnull -> 346
    //   339: aload_0
    //   340: aload #4
    //   342: invokevirtual add : (Ljava/lang/Object;)Z
    //   345: pop
    //   346: iinc #3, 1
    //   349: goto -> 324
    //   352: aload_0
    //   353: iconst_0
    //   354: anewarray ycv
    //   357: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   360: checkcast [Lycv;
    //   363: checkcast [Lycv;
    //   366: putstatic ycv.FWm : [Lycv;
    //   369: return
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public int Dne(int paramInt, zBn paramzBn) {
    return 0;
  }
  
  public boolean Dne(ycv paramycv) {
    return (this != paramycv);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ycv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */