public class oJI {
  private int bzF;
  
  private boolean Dne;
  
  private int zGp;
  
  private int Dne;
  
  private Qnq Dne;
  
  private int aFZ;
  
  private uQr Dne = false;
  
  private int FWm;
  
  private int Qnq;
  
  public oJI(Qnq paramQnq) {
    this.Dne = -1;
    this.Dne = (uQr)paramQnq;
  }
  
  private boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield Qnq : Ljava/util/List;
    //   7: astore_1
    //   8: aload_1
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore_2
    //   15: aload_2
    //   16: invokeinterface hasNext : ()Z
    //   21: ifeq -> 359
    //   24: aload_2
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast FiG
    //   33: astore_3
    //   34: aload_0
    //   35: aload_0
    //   36: getfield Dne : LQnq;
    //   39: getfield Dne : LPrX;
    //   42: aload_3
    //   43: getfield div : D
    //   46: d2i
    //   47: aload_3
    //   48: getfield IjH : D
    //   51: d2i
    //   52: aload_3
    //   53: getfield mrb : D
    //   56: d2i
    //   57: iconst_1
    //   58: invokevirtual Dne : (IIII)LuQr;
    //   61: putfield Dne : LuQr;
    //   64: aload_0
    //   65: getfield Dne : LuQr;
    //   68: ifnull -> 356
    //   71: aload_0
    //   72: getfield Dne : LuQr;
    //   75: invokevirtual FWm : ()I
    //   78: bipush #10
    //   80: if_icmplt -> 356
    //   83: aload_0
    //   84: getfield Dne : LuQr;
    //   87: invokevirtual bzF : ()I
    //   90: bipush #20
    //   92: if_icmplt -> 356
    //   95: aload_0
    //   96: getfield Dne : LuQr;
    //   99: invokevirtual Qnq : ()I
    //   102: bipush #20
    //   104: if_icmplt -> 356
    //   107: aload_0
    //   108: getfield Dne : LuQr;
    //   111: invokevirtual Dne : ()LiSh;
    //   114: astore #4
    //   116: aload_0
    //   117: getfield Dne : LuQr;
    //   120: invokevirtual Dne : ()I
    //   123: i2f
    //   124: fstore #5
    //   126: iconst_0
    //   127: istore #6
    //   129: iconst_0
    //   130: istore #7
    //   132: iload #7
    //   134: bipush #10
    //   136: if_icmpge -> 313
    //   139: aload_0
    //   140: aload #4
    //   142: getfield Dne : I
    //   145: aload_0
    //   146: getfield Dne : LQnq;
    //   149: getfield Dne : Ljava/util/Random;
    //   152: invokevirtual nextFloat : ()F
    //   155: ldc 3.1415927
    //   157: fmul
    //   158: fconst_2
    //   159: fmul
    //   160: invokestatic FWm : (F)F
    //   163: fload #5
    //   165: fmul
    //   166: f2d
    //   167: ldc2_w 0.9
    //   170: dmul
    //   171: d2i
    //   172: iadd
    //   173: putfield Qnq : I
    //   176: aload_0
    //   177: aload #4
    //   179: getfield FWm : I
    //   182: putfield aFZ : I
    //   185: aload_0
    //   186: aload #4
    //   188: getfield bzF : I
    //   191: aload_0
    //   192: getfield Dne : LQnq;
    //   195: getfield Dne : Ljava/util/Random;
    //   198: invokevirtual nextFloat : ()F
    //   201: ldc 3.1415927
    //   203: fmul
    //   204: fconst_2
    //   205: fmul
    //   206: invokestatic Dne : (F)F
    //   209: fload #5
    //   211: fmul
    //   212: f2d
    //   213: ldc2_w 0.9
    //   216: dmul
    //   217: d2i
    //   218: iadd
    //   219: putfield zGp : I
    //   222: iconst_0
    //   223: istore #6
    //   225: aload_0
    //   226: getfield Dne : LQnq;
    //   229: getfield Dne : LPrX;
    //   232: invokevirtual Dne : ()Ljava/util/List;
    //   235: invokeinterface iterator : ()Ljava/util/Iterator;
    //   240: astore #8
    //   242: aload #8
    //   244: invokeinterface hasNext : ()Z
    //   249: ifeq -> 302
    //   252: aload #8
    //   254: invokeinterface next : ()Ljava/lang/Object;
    //   259: checkcast uQr
    //   262: astore #9
    //   264: aload #9
    //   266: aload_0
    //   267: getfield Dne : LuQr;
    //   270: if_acmpeq -> 299
    //   273: aload #9
    //   275: aload_0
    //   276: getfield Qnq : I
    //   279: aload_0
    //   280: getfield aFZ : I
    //   283: aload_0
    //   284: getfield zGp : I
    //   287: invokevirtual Dne : (III)Z
    //   290: ifeq -> 299
    //   293: iconst_1
    //   294: istore #6
    //   296: goto -> 302
    //   299: goto -> 242
    //   302: iload #6
    //   304: ifeq -> 313
    //   307: iinc #7, 1
    //   310: goto -> 132
    //   313: iload #6
    //   315: ifeq -> 320
    //   318: iconst_0
    //   319: ireturn
    //   320: aload_0
    //   321: aload_0
    //   322: getfield Qnq : I
    //   325: aload_0
    //   326: getfield aFZ : I
    //   329: aload_0
    //   330: getfield zGp : I
    //   333: invokespecial Dne : (III)LchN;
    //   336: astore #8
    //   338: aload #8
    //   340: ifnull -> 356
    //   343: aload_0
    //   344: iconst_0
    //   345: putfield bzF : I
    //   348: aload_0
    //   349: bipush #20
    //   351: putfield FWm : I
    //   354: iconst_1
    //   355: ireturn
    //   356: goto -> 15
    //   359: iconst_0
    //   360: ireturn
  }
  
  private boolean FWm() {
    zxd zxd;
    chN chN = Dne(this.Qnq, this.aFZ, this.zGp);
    if (chN == null)
      return false; 
    try {
      zxd = new zxd((Qnq)this.Dne);
      zxd.ICU();
      zxd.IjH(false);
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
    zxd.FWm(chN.Dne, chN.FWm, chN.bzF, ((Qnq)this.Dne).Dne.nextFloat() * 360.0F, 0.0F);
    this.Dne.FWm(zxd);
    iSh iSh = this.Dne.Dne();
    zxd.FWm(iSh.Dne, iSh.FWm, iSh.bzF, this.Dne.Dne());
    return true;
  }
  
  public void Dne() {
    boolean bool = false;
    if (bool) {
      if (this.Dne == 2) {
        this.FWm = 100;
        return;
      } 
    } else {
      if (this.Dne.Dne()) {
        this.Dne = false;
        return;
      } 
      if (this.Dne == 2)
        return; 
      if (this.Dne == null) {
        float f = this.Dne.FWm(0.0F);
        if (f < 0.5D || f > 0.501D)
          return; 
        this.Dne = (((Qnq)this.Dne).Dne.nextInt(10) == 0) ? 1 : 2;
        this.Dne = false;
        if (this.Dne == 2)
          return; 
      } 
    } 
    if (this.Dne == null) {
      if (!Dne())
        return; 
      this.Dne = true;
    } 
    if (this.bzF > 0) {
      this.bzF--;
    } else {
      this.bzF = 2;
      if (this.FWm > 0) {
        FWm();
        this.FWm--;
      } else {
        this.Dne = 2;
      } 
    } 
  }
  
  private chN Dne(int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < 10; b++) {
      int i = paramInt1 + ((Qnq)this.Dne).Dne.nextInt(16) - 8;
      int j = paramInt2 + ((Qnq)this.Dne).Dne.nextInt(6) - 3;
      int k = paramInt3 + ((Qnq)this.Dne).Dne.nextInt(16) - 8;
      if (this.Dne.Dne(i, j, k) && ooe.Dne((Icc)Icc.Dne, (Qnq)this.Dne, i, j, k))
        this.Dne.Dne().Dne(i, j, k); 
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oJI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */