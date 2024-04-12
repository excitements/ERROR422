public class Sgm extends Gor {
  public static boolean aFZ;
  
  public int Dne;
  
  public boolean bzF;
  
  public rxL IjH;
  
  public rxL zGp;
  
  public rxL FWm;
  
  public rxL DyG;
  
  public boolean Qnq;
  
  public rxL Qnq;
  
  public rxL bzF;
  
  public rxL div;
  
  public int FWm;
  
  public rxL aFZ;
  
  public rxL Dne;
  
  public void FWm(float paramFloat) {
    this.IjH.Dne(paramFloat);
  }
  
  public Sgm(float paramFloat) {
    this(paramFloat, 0.0F, 64, 32);
    if (eCD.Dne(2) == 0) {
      this.Dne = new rxL(this, 0, 0);
      aFZ = true;
    } 
  }
  
  public Sgm(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield Dne : I
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield FWm : I
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield bzF : Z
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield Qnq : Z
    //   24: aload_0
    //   25: iload_3
    //   26: putfield bzF : I
    //   29: aload_0
    //   30: iload #4
    //   32: putfield Qnq : I
    //   35: aload_0
    //   36: new rxL
    //   39: dup
    //   40: aload_0
    //   41: iconst_0
    //   42: iconst_0
    //   43: invokespecial <init> : (LGor;II)V
    //   46: putfield IjH : LrxL;
    //   49: aload_0
    //   50: getfield IjH : LrxL;
    //   53: ldc -5.0
    //   55: fconst_0
    //   56: ldc -1.0
    //   58: bipush #10
    //   60: bipush #16
    //   62: iconst_1
    //   63: fload_1
    //   64: invokevirtual Dne : (FFFIIIF)V
    //   67: aload_0
    //   68: new rxL
    //   71: dup
    //   72: aload_0
    //   73: bipush #24
    //   75: iconst_0
    //   76: invokespecial <init> : (LGor;II)V
    //   79: putfield div : LrxL;
    //   82: aload_0
    //   83: getfield div : LrxL;
    //   86: ldc -3.0
    //   88: ldc -6.0
    //   90: ldc -1.0
    //   92: bipush #6
    //   94: bipush #6
    //   96: iconst_1
    //   97: fload_1
    //   98: invokevirtual Dne : (FFFIIIF)V
    //   101: aload_0
    //   102: new rxL
    //   105: dup
    //   106: aload_0
    //   107: iconst_0
    //   108: iconst_0
    //   109: invokespecial <init> : (LGor;II)V
    //   112: putfield Dne : LrxL;
    //   115: aload_0
    //   116: getfield Dne : LrxL;
    //   119: ldc -4.0
    //   121: ldc -8.0
    //   123: ldc -4.0
    //   125: bipush #8
    //   127: bipush #8
    //   129: bipush #8
    //   131: fload_1
    //   132: invokevirtual Dne : (FFFIIIF)V
    //   135: aload_0
    //   136: getfield Dne : LrxL;
    //   139: fconst_0
    //   140: fconst_0
    //   141: fload_2
    //   142: fadd
    //   143: fconst_0
    //   144: invokevirtual Dne : (FFF)V
    //   147: aload_0
    //   148: new rxL
    //   151: dup
    //   152: aload_0
    //   153: bipush #32
    //   155: iconst_0
    //   156: invokespecial <init> : (LGor;II)V
    //   159: putfield FWm : LrxL;
    //   162: aload_0
    //   163: getfield FWm : LrxL;
    //   166: ldc -4.0
    //   168: ldc -8.0
    //   170: ldc -4.0
    //   172: bipush #8
    //   174: bipush #8
    //   176: bipush #8
    //   178: fload_1
    //   179: ldc 0.5
    //   181: fadd
    //   182: invokevirtual Dne : (FFFIIIF)V
    //   185: aload_0
    //   186: getfield FWm : LrxL;
    //   189: fconst_0
    //   190: fconst_0
    //   191: fload_2
    //   192: fadd
    //   193: fconst_0
    //   194: invokevirtual Dne : (FFF)V
    //   197: aload_0
    //   198: new rxL
    //   201: dup
    //   202: aload_0
    //   203: bipush #16
    //   205: bipush #16
    //   207: invokespecial <init> : (LGor;II)V
    //   210: putfield bzF : LrxL;
    //   213: aload_0
    //   214: getfield bzF : LrxL;
    //   217: ldc -4.0
    //   219: fconst_0
    //   220: ldc -2.0
    //   222: bipush #8
    //   224: bipush #12
    //   226: iconst_4
    //   227: fload_1
    //   228: invokevirtual Dne : (FFFIIIF)V
    //   231: aload_0
    //   232: getfield bzF : LrxL;
    //   235: fconst_0
    //   236: fconst_0
    //   237: fload_2
    //   238: fadd
    //   239: fconst_0
    //   240: invokevirtual Dne : (FFF)V
    //   243: aload_0
    //   244: new rxL
    //   247: dup
    //   248: aload_0
    //   249: bipush #40
    //   251: bipush #16
    //   253: invokespecial <init> : (LGor;II)V
    //   256: putfield Qnq : LrxL;
    //   259: aload_0
    //   260: getfield Qnq : LrxL;
    //   263: ldc -3.0
    //   265: ldc -2.0
    //   267: ldc -2.0
    //   269: iconst_4
    //   270: bipush #12
    //   272: iconst_4
    //   273: fload_1
    //   274: invokevirtual Dne : (FFFIIIF)V
    //   277: aload_0
    //   278: getfield Qnq : LrxL;
    //   281: ldc -5.0
    //   283: fconst_2
    //   284: fload_2
    //   285: fadd
    //   286: fconst_0
    //   287: invokevirtual Dne : (FFF)V
    //   290: aload_0
    //   291: new rxL
    //   294: dup
    //   295: aload_0
    //   296: bipush #40
    //   298: bipush #16
    //   300: invokespecial <init> : (LGor;II)V
    //   303: putfield aFZ : LrxL;
    //   306: aload_0
    //   307: getfield aFZ : LrxL;
    //   310: iconst_1
    //   311: putfield Dne : Z
    //   314: aload_0
    //   315: getfield aFZ : LrxL;
    //   318: ldc -1.0
    //   320: ldc -2.0
    //   322: ldc -2.0
    //   324: iconst_4
    //   325: bipush #12
    //   327: iconst_4
    //   328: fload_1
    //   329: invokevirtual Dne : (FFFIIIF)V
    //   332: aload_0
    //   333: getfield aFZ : LrxL;
    //   336: ldc 5.0
    //   338: fconst_2
    //   339: fload_2
    //   340: fadd
    //   341: fconst_0
    //   342: invokevirtual Dne : (FFF)V
    //   345: aload_0
    //   346: new rxL
    //   349: dup
    //   350: aload_0
    //   351: iconst_0
    //   352: bipush #16
    //   354: invokespecial <init> : (LGor;II)V
    //   357: putfield zGp : LrxL;
    //   360: aload_0
    //   361: getfield zGp : LrxL;
    //   364: ldc -2.0
    //   366: fconst_0
    //   367: ldc -2.0
    //   369: iconst_4
    //   370: bipush #12
    //   372: iconst_4
    //   373: fload_1
    //   374: invokevirtual Dne : (FFFIIIF)V
    //   377: aload_0
    //   378: getfield zGp : LrxL;
    //   381: ldc -1.9
    //   383: ldc 12.0
    //   385: fload_2
    //   386: fadd
    //   387: fconst_0
    //   388: invokevirtual Dne : (FFF)V
    //   391: aload_0
    //   392: new rxL
    //   395: dup
    //   396: aload_0
    //   397: iconst_0
    //   398: bipush #16
    //   400: invokespecial <init> : (LGor;II)V
    //   403: putfield DyG : LrxL;
    //   406: aload_0
    //   407: getfield DyG : LrxL;
    //   410: iconst_1
    //   411: putfield Dne : Z
    //   414: aload_0
    //   415: getfield DyG : LrxL;
    //   418: ldc -2.0
    //   420: fconst_0
    //   421: ldc -2.0
    //   423: iconst_4
    //   424: bipush #12
    //   426: iconst_4
    //   427: fload_1
    //   428: invokevirtual Dne : (FFFIIIF)V
    //   431: aload_0
    //   432: getfield DyG : LrxL;
    //   435: ldc 1.9
    //   437: ldc 12.0
    //   439: fload_2
    //   440: fadd
    //   441: fconst_0
    //   442: invokevirtual Dne : (FFF)V
    //   445: return
  }
  
  public Sgm() {
    this(0.0F);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.Dne.zGp = paramFloat5 / 57.295776F;
    this.FWm.DyG = this.Dne.DyG;
    this.FWm.zGp = this.Dne.zGp;
    this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 2.0F * paramFloat2 * 0.5F;
    this.aFZ.zGp = geR.FWm(paramFloat1 * 0.6662F) * 2.0F * paramFloat2 * 0.5F;
    this.Qnq.div = 0.0F;
    this.aFZ.div = 0.0F;
    this.zGp.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    this.DyG.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.zGp.DyG = 0.0F;
    this.DyG.DyG = 0.0F;
    if (this.zGp != null) {
      this.Qnq.zGp += -0.62831855F;
      this.aFZ.zGp += -0.62831855F;
      this.zGp.zGp = -1.2566371F;
      this.DyG.zGp = -1.2566371F;
      this.zGp.DyG = 0.31415927F;
      this.DyG.DyG = -0.31415927F;
    } 
    if (this.Dne != null)
      this.aFZ.zGp = this.aFZ.zGp * 0.5F - 0.31415927F * this.Dne; 
    if (this.FWm != 0)
      this.Qnq.zGp = this.Qnq.zGp * 0.5F - 0.31415927F * this.FWm; 
    this.Qnq.DyG = 0.0F;
    this.aFZ.DyG = 0.0F;
    if (this.Dne > -9990.0F) {
      rxL rxL1 = this.Dne;
      this.bzF.DyG = geR.Dne(geR.bzF(rxL1) * 3.1415927F * 2.0F) * 0.2F;
      this.Qnq.aFZ = geR.Dne(this.bzF.DyG) * 5.0F;
      this.Qnq.bzF = -geR.FWm(this.bzF.DyG) * 5.0F;
      this.aFZ.aFZ = -geR.Dne(this.bzF.DyG) * 5.0F;
      this.aFZ.bzF = geR.FWm(this.bzF.DyG) * 5.0F;
      this.Qnq.DyG += this.bzF.DyG;
      this.aFZ.DyG += this.bzF.DyG;
      this.aFZ.zGp += this.bzF.DyG;
      float f1 = 1.0F - this.Dne;
      f1 *= f1;
      f1 *= f1;
      f1 = 1.0F - f1;
      float f2 = geR.Dne(f1 * 3.1415927F);
      float f3 = geR.Dne(this.Dne * 3.1415927F) * -(this.Dne.zGp - 0.7F) * 0.75F;
      this.Qnq.zGp = (float)(this.Qnq.zGp - f2 * 1.2D + f3);
      this.Qnq.DyG += this.bzF.DyG * 2.0F;
      this.Qnq.div = geR.Dne(this.Dne * 3.1415927F) * -0.4F;
    } 
    if (this.bzF != null) {
      this.bzF.zGp = 0.5F;
      this.Qnq.zGp += 0.4F;
      this.aFZ.zGp += 0.4F;
      this.zGp.aFZ = 4.0F;
      this.DyG.aFZ = 4.0F;
      this.zGp.Qnq = 9.0F;
      this.DyG.Qnq = 9.0F;
      this.Dne.Qnq = 1.0F;
      this.FWm.Qnq = 1.0F;
    } else {
      this.bzF.zGp = 0.0F;
      this.zGp.aFZ = 0.1F;
      this.DyG.aFZ = 0.1F;
      this.zGp.Qnq = 12.0F;
      this.DyG.Qnq = 12.0F;
      this.Dne.Qnq = 0.0F;
      this.FWm.Qnq = 0.0F;
    } 
    this.Qnq.div += geR.FWm(paramFloat3 * 0.09F) * 0.05F + 0.05F;
    this.aFZ.div -= geR.FWm(paramFloat3 * 0.09F) * 0.05F + 0.05F;
    this.Qnq.zGp += geR.Dne(paramFloat3 * 0.067F) * 0.05F;
    this.aFZ.zGp -= geR.Dne(paramFloat3 * 0.067F) * 0.05F;
    if (this.Qnq != null) {
      float f1 = 0.0F;
      float f2 = 0.0F;
      this.Qnq.div = 0.0F;
      this.aFZ.div = 0.0F;
      this.Qnq.DyG = -(0.1F - f1 * 0.6F) + this.Dne.DyG;
      this.aFZ.DyG = 0.1F - f1 * 0.6F + this.Dne.DyG + 0.4F;
      this.Qnq.zGp = -1.5707964F + this.Dne.zGp;
      this.aFZ.zGp = -1.5707964F + this.Dne.zGp;
      this.Qnq.zGp -= f1 * 1.2F - f2 * 0.4F;
      this.aFZ.zGp -= f1 * 1.2F - f2 * 0.4F;
      this.Qnq.div += geR.FWm(paramFloat3 * 0.09F) * 0.05F + 0.05F;
      this.aFZ.div -= geR.FWm(paramFloat3 * 0.09F) * 0.05F + 0.05F;
      this.Qnq.zGp += geR.Dne(paramFloat3 * 0.067F) * 0.05F;
      this.aFZ.zGp -= geR.Dne(paramFloat3 * 0.067F) * 0.05F;
    } 
  }
  
  public void Dne(float paramFloat) {
    this.div.DyG = this.Dne.DyG;
    this.div.zGp = this.Dne.zGp;
    this.div.bzF = 0.0F;
    this.div.Qnq = 0.0F;
    this.div.Dne(paramFloat);
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    // Byte code:
    //   0: aload_0
    //   1: fload_2
    //   2: fload_3
    //   3: fload #4
    //   5: fload #5
    //   7: fload #6
    //   9: fload #7
    //   11: aload_1
    //   12: invokevirtual Dne : (FFFFFFLsMa;)V
    //   15: aload_0
    //   16: getfield DyG : Z
    //   19: ifeq -> 156
    //   22: fconst_2
    //   23: fstore #8
    //   25: invokestatic glPushMatrix : ()V
    //   28: ldc 1.5
    //   30: fload #8
    //   32: fdiv
    //   33: ldc 1.5
    //   35: fload #8
    //   37: fdiv
    //   38: ldc 1.5
    //   40: fload #8
    //   42: fdiv
    //   43: invokestatic glScalef : (FFF)V
    //   46: fconst_0
    //   47: ldc 16.0
    //   49: fload #7
    //   51: fmul
    //   52: fconst_0
    //   53: invokestatic glTranslatef : (FFF)V
    //   56: aload_0
    //   57: getfield Dne : LrxL;
    //   60: fload #7
    //   62: invokevirtual Dne : (F)V
    //   65: invokestatic glPopMatrix : ()V
    //   68: invokestatic glPushMatrix : ()V
    //   71: fconst_1
    //   72: fload #8
    //   74: fdiv
    //   75: fconst_1
    //   76: fload #8
    //   78: fdiv
    //   79: fconst_1
    //   80: fload #8
    //   82: fdiv
    //   83: invokestatic glScalef : (FFF)V
    //   86: fconst_0
    //   87: ldc 24.0
    //   89: fload #7
    //   91: fmul
    //   92: fconst_0
    //   93: invokestatic glTranslatef : (FFF)V
    //   96: aload_0
    //   97: getfield bzF : LrxL;
    //   100: fload #7
    //   102: invokevirtual Dne : (F)V
    //   105: aload_0
    //   106: getfield Qnq : LrxL;
    //   109: fload #7
    //   111: invokevirtual Dne : (F)V
    //   114: aload_0
    //   115: getfield aFZ : LrxL;
    //   118: fload #7
    //   120: invokevirtual Dne : (F)V
    //   123: aload_0
    //   124: getfield zGp : LrxL;
    //   127: fload #7
    //   129: invokevirtual Dne : (F)V
    //   132: aload_0
    //   133: getfield DyG : LrxL;
    //   136: fload #7
    //   138: invokevirtual Dne : (F)V
    //   141: aload_0
    //   142: getfield FWm : LrxL;
    //   145: fload #7
    //   147: invokevirtual Dne : (F)V
    //   150: invokestatic glPopMatrix : ()V
    //   153: goto -> 219
    //   156: aload_0
    //   157: getfield Dne : LrxL;
    //   160: fload #7
    //   162: invokevirtual Dne : (F)V
    //   165: aload_0
    //   166: getfield bzF : LrxL;
    //   169: fload #7
    //   171: invokevirtual Dne : (F)V
    //   174: aload_0
    //   175: getfield Qnq : LrxL;
    //   178: fload #7
    //   180: invokevirtual Dne : (F)V
    //   183: aload_0
    //   184: getfield aFZ : LrxL;
    //   187: fload #7
    //   189: invokevirtual Dne : (F)V
    //   192: aload_0
    //   193: getfield zGp : LrxL;
    //   196: fload #7
    //   198: invokevirtual Dne : (F)V
    //   201: aload_0
    //   202: getfield DyG : LrxL;
    //   205: fload #7
    //   207: invokevirtual Dne : (F)V
    //   210: aload_0
    //   211: getfield FWm : LrxL;
    //   214: fload #7
    //   216: invokevirtual Dne : (F)V
    //   219: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sgm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */