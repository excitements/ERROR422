public class CAZ extends sMa {
  protected float FWm;
  
  public static double FWm;
  
  protected gDn Dne;
  
  public static double bzF;
  
  protected float zGp;
  
  protected int Dne;
  
  protected float aFZ;
  
  protected float IjH;
  
  protected int bzF;
  
  protected float bzF;
  
  public static double Dne;
  
  protected int Qnq;
  
  protected float div;
  
  protected float Qnq;
  
  protected int FWm;
  
  protected float DyG;
  
  public float b_() {
    return this.zGp;
  }
  
  public void Dne(Snh paramSnh, gDn paramgDn) {
    if (Dne() == 1) {
      this.Dne = paramgDn;
    } else {
      if (Dne() != 2)
        throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods"); 
      this.Dne = paramgDn;
    } 
  }
  
  protected void FWm() {}
  
  public CAZ FWm(float paramFloat) {
    Dne(0.2F * paramFloat, 0.2F * paramFloat);
    this.Qnq *= paramFloat;
    return this;
  }
  
  public boolean bzF() {
    return false;
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public int Dne() {
    return 0;
  }
  
  public CAZ(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    this.XHL = paramDouble4 + ((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
    this.Zpi = paramDouble5 + ((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
    this.kGO = paramDouble6 + ((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
    float f1 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
    float f2 = geR.Dne(this.XHL * this.XHL + this.Zpi * this.Zpi + this.kGO * this.kGO);
    this.XHL = this.XHL / f2 * f1 * 0.4000000059604645D;
    this.Zpi = this.Zpi / f2 * f1 * 0.4000000059604645D + 0.10000000149011612D;
    this.kGO = this.kGO / f2 * f1 * 0.4000000059604645D;
  }
  
  public String toString() {
    return getClass().getSimpleName() + ", Pos (" + this.div + "," + this.IjH + "," + this.mrb + "), RGBA (" + this.zGp + "," + this.DyG + "," + this.div + "," + this.IjH + "), Age " + this.bzF;
  }
  
  public void a_(float paramFloat) {
    this.IjH = paramFloat;
  }
  
  protected CAZ(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield bzF : I
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield Qnq : I
    //   15: aload_0
    //   16: fconst_1
    //   17: putfield IjH : F
    //   20: aload_0
    //   21: aconst_null
    //   22: putfield Dne : LgDn;
    //   25: aload_0
    //   26: ldc 0.2
    //   28: ldc 0.2
    //   30: invokevirtual Dne : (FF)V
    //   33: aload_0
    //   34: aload_0
    //   35: getfield trS : F
    //   38: fconst_2
    //   39: fdiv
    //   40: putfield udO : F
    //   43: aload_0
    //   44: dload_2
    //   45: dload #4
    //   47: dload #6
    //   49: invokevirtual bzF : (DDD)V
    //   52: aload_0
    //   53: dload_2
    //   54: putfield udO : D
    //   57: aload_0
    //   58: dload #4
    //   60: putfield ooe : D
    //   63: aload_0
    //   64: dload #6
    //   66: putfield trS : D
    //   69: aload_0
    //   70: aload_0
    //   71: aload_0
    //   72: fconst_1
    //   73: dup_x1
    //   74: putfield div : F
    //   77: dup_x1
    //   78: putfield DyG : F
    //   81: putfield zGp : F
    //   84: aload_0
    //   85: aload_0
    //   86: getfield Dne : Ljava/util/Random;
    //   89: invokevirtual nextFloat : ()F
    //   92: ldc 3.0
    //   94: fmul
    //   95: putfield FWm : F
    //   98: aload_0
    //   99: aload_0
    //   100: getfield Dne : Ljava/util/Random;
    //   103: invokevirtual nextFloat : ()F
    //   106: ldc 3.0
    //   108: fmul
    //   109: putfield bzF : F
    //   112: aload_0
    //   113: aload_0
    //   114: getfield Dne : Ljava/util/Random;
    //   117: invokevirtual nextFloat : ()F
    //   120: ldc 0.5
    //   122: fmul
    //   123: ldc 0.5
    //   125: fadd
    //   126: fconst_2
    //   127: fmul
    //   128: putfield Qnq : F
    //   131: aload_0
    //   132: ldc 4.0
    //   134: aload_0
    //   135: getfield Dne : Ljava/util/Random;
    //   138: invokevirtual nextFloat : ()F
    //   141: ldc 0.9
    //   143: fmul
    //   144: ldc 0.1
    //   146: fadd
    //   147: fdiv
    //   148: f2i
    //   149: putfield Qnq : I
    //   152: aload_0
    //   153: iconst_0
    //   154: putfield bzF : I
    //   157: return
  }
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    if (this.bzF++ >= this.Qnq)
      g_(); 
    this.Zpi -= 0.04D * this.aFZ;
    Dne(this.XHL, this.Zpi, this.kGO);
    this.XHL *= 0.9800000190734863D;
    this.Zpi *= 0.9800000190734863D;
    this.kGO *= 0.9800000190734863D;
    if (this.aFZ != 0.0F) {
      this.XHL *= 0.699999988079071D;
      this.kGO *= 0.699999988079071D;
    } 
  }
  
  public void Dne(WkD paramWkD) {}
  
  public void bzF() {
    this.Dne++;
  }
  
  public float FWm() {
    return this.DyG;
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: i2f
    //   5: ldc 16.0
    //   7: fdiv
    //   8: fstore #8
    //   10: fload #8
    //   12: ldc 0.0624375
    //   14: fadd
    //   15: fstore #9
    //   17: aload_0
    //   18: getfield FWm : I
    //   21: i2f
    //   22: ldc 16.0
    //   24: fdiv
    //   25: fstore #10
    //   27: fload #10
    //   29: ldc 0.0624375
    //   31: fadd
    //   32: fstore #11
    //   34: ldc 0.1
    //   36: aload_0
    //   37: getfield Qnq : F
    //   40: fmul
    //   41: fstore #12
    //   43: aload_0
    //   44: getfield Dne : LgDn;
    //   47: ifnull -> 94
    //   50: aload_0
    //   51: getfield Dne : LgDn;
    //   54: invokeinterface Dne : ()F
    //   59: fstore #8
    //   61: aload_0
    //   62: getfield Dne : LgDn;
    //   65: invokeinterface FWm : ()F
    //   70: fstore #9
    //   72: aload_0
    //   73: getfield Dne : LgDn;
    //   76: invokeinterface bzF : ()F
    //   81: fstore #10
    //   83: aload_0
    //   84: getfield Dne : LgDn;
    //   87: invokeinterface Qnq : ()F
    //   92: fstore #11
    //   94: aload_0
    //   95: getfield aFZ : D
    //   98: aload_0
    //   99: getfield div : D
    //   102: aload_0
    //   103: getfield aFZ : D
    //   106: dsub
    //   107: fload_2
    //   108: f2d
    //   109: dmul
    //   110: dadd
    //   111: getstatic CAZ.Dne : D
    //   114: dsub
    //   115: d2f
    //   116: fstore #13
    //   118: aload_0
    //   119: getfield zGp : D
    //   122: aload_0
    //   123: getfield IjH : D
    //   126: aload_0
    //   127: getfield zGp : D
    //   130: dsub
    //   131: fload_2
    //   132: f2d
    //   133: dmul
    //   134: dadd
    //   135: getstatic CAZ.FWm : D
    //   138: dsub
    //   139: d2f
    //   140: fstore #14
    //   142: aload_0
    //   143: getfield DyG : D
    //   146: aload_0
    //   147: getfield mrb : D
    //   150: aload_0
    //   151: getfield DyG : D
    //   154: dsub
    //   155: fload_2
    //   156: f2d
    //   157: dmul
    //   158: dadd
    //   159: getstatic CAZ.bzF : D
    //   162: dsub
    //   163: d2f
    //   164: fstore #15
    //   166: fconst_1
    //   167: fstore #16
    //   169: aload_1
    //   170: aload_0
    //   171: getfield zGp : F
    //   174: fload #16
    //   176: fmul
    //   177: aload_0
    //   178: getfield DyG : F
    //   181: fload #16
    //   183: fmul
    //   184: aload_0
    //   185: getfield div : F
    //   188: fload #16
    //   190: fmul
    //   191: aload_0
    //   192: getfield IjH : F
    //   195: invokevirtual Dne : (FFFF)V
    //   198: aload_1
    //   199: fload #13
    //   201: fload_3
    //   202: fload #12
    //   204: fmul
    //   205: fsub
    //   206: fload #6
    //   208: fload #12
    //   210: fmul
    //   211: fsub
    //   212: f2d
    //   213: fload #14
    //   215: fload #4
    //   217: fload #12
    //   219: fmul
    //   220: fsub
    //   221: f2d
    //   222: fload #15
    //   224: fload #5
    //   226: fload #12
    //   228: fmul
    //   229: fsub
    //   230: fload #7
    //   232: fload #12
    //   234: fmul
    //   235: fsub
    //   236: f2d
    //   237: fload #9
    //   239: f2d
    //   240: fload #11
    //   242: f2d
    //   243: invokevirtual Dne : (DDDDD)V
    //   246: aload_1
    //   247: fload #13
    //   249: fload_3
    //   250: fload #12
    //   252: fmul
    //   253: fsub
    //   254: fload #6
    //   256: fload #12
    //   258: fmul
    //   259: fadd
    //   260: f2d
    //   261: fload #14
    //   263: fload #4
    //   265: fload #12
    //   267: fmul
    //   268: fadd
    //   269: f2d
    //   270: fload #15
    //   272: fload #5
    //   274: fload #12
    //   276: fmul
    //   277: fsub
    //   278: fload #7
    //   280: fload #12
    //   282: fmul
    //   283: fadd
    //   284: f2d
    //   285: fload #9
    //   287: f2d
    //   288: fload #10
    //   290: f2d
    //   291: invokevirtual Dne : (DDDDD)V
    //   294: aload_1
    //   295: fload #13
    //   297: fload_3
    //   298: fload #12
    //   300: fmul
    //   301: fadd
    //   302: fload #6
    //   304: fload #12
    //   306: fmul
    //   307: fadd
    //   308: f2d
    //   309: fload #14
    //   311: fload #4
    //   313: fload #12
    //   315: fmul
    //   316: fadd
    //   317: f2d
    //   318: fload #15
    //   320: fload #5
    //   322: fload #12
    //   324: fmul
    //   325: fadd
    //   326: fload #7
    //   328: fload #12
    //   330: fmul
    //   331: fadd
    //   332: f2d
    //   333: fload #8
    //   335: f2d
    //   336: fload #10
    //   338: f2d
    //   339: invokevirtual Dne : (DDDDD)V
    //   342: aload_1
    //   343: fload #13
    //   345: fload_3
    //   346: fload #12
    //   348: fmul
    //   349: fadd
    //   350: fload #6
    //   352: fload #12
    //   354: fmul
    //   355: fsub
    //   356: f2d
    //   357: fload #14
    //   359: fload #4
    //   361: fload #12
    //   363: fmul
    //   364: fsub
    //   365: f2d
    //   366: fload #15
    //   368: fload #5
    //   370: fload #12
    //   372: fmul
    //   373: fadd
    //   374: fload #7
    //   376: fload #12
    //   378: fmul
    //   379: fsub
    //   380: f2d
    //   381: fload #8
    //   383: f2d
    //   384: fload #11
    //   386: f2d
    //   387: invokevirtual Dne : (DDDDD)V
    //   390: return
  }
  
  public CAZ Dne(float paramFloat) {
    this.XHL *= paramFloat;
    this.Zpi = (this.Zpi - 0.10000000149011612D) * paramFloat + 0.10000000149011612D;
    this.kGO *= paramFloat;
    return this;
  }
  
  public void bzF(int paramInt) {
    if (Dne() != 0)
      throw new RuntimeException("Invalid call to Particle.setMiscTex"); 
    this.Dne = paramInt % 16;
    this.FWm = paramInt / 16;
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.zGp = paramFloat1;
    this.DyG = paramFloat2;
    this.div = paramFloat3;
  }
  
  public void FWm(WkD paramWkD) {}
  
  public float bzF() {
    return this.div;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CAZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */