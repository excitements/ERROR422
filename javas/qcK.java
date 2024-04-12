public class qcK extends Gor {
  public rxL FWm;
  
  protected float FWm;
  
  public rxL aFZ;
  
  public rxL Dne;
  
  public rxL Qnq;
  
  public rxL bzF;
  
  protected float bzF;
  
  public rxL zGp;
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.Dne.zGp = paramFloat5 / 57.295776F;
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.FWm.zGp = 1.5707964F;
    this.bzF.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.aFZ.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.zGp.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
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
    //   19: ifeq -> 137
    //   22: fconst_2
    //   23: fstore #8
    //   25: invokestatic glPushMatrix : ()V
    //   28: fconst_0
    //   29: aload_0
    //   30: getfield FWm : F
    //   33: fload #7
    //   35: fmul
    //   36: aload_0
    //   37: getfield bzF : F
    //   40: fload #7
    //   42: fmul
    //   43: invokestatic glTranslatef : (FFF)V
    //   46: aload_0
    //   47: getfield Dne : LrxL;
    //   50: fload #7
    //   52: invokevirtual Dne : (F)V
    //   55: invokestatic glPopMatrix : ()V
    //   58: invokestatic glPushMatrix : ()V
    //   61: fconst_1
    //   62: fload #8
    //   64: fdiv
    //   65: fconst_1
    //   66: fload #8
    //   68: fdiv
    //   69: fconst_1
    //   70: fload #8
    //   72: fdiv
    //   73: invokestatic glScalef : (FFF)V
    //   76: fconst_0
    //   77: ldc 24.0
    //   79: fload #7
    //   81: fmul
    //   82: fconst_0
    //   83: invokestatic glTranslatef : (FFF)V
    //   86: aload_0
    //   87: getfield FWm : LrxL;
    //   90: fload #7
    //   92: invokevirtual Dne : (F)V
    //   95: aload_0
    //   96: getfield bzF : LrxL;
    //   99: fload #7
    //   101: invokevirtual Dne : (F)V
    //   104: aload_0
    //   105: getfield Qnq : LrxL;
    //   108: fload #7
    //   110: invokevirtual Dne : (F)V
    //   113: aload_0
    //   114: getfield aFZ : LrxL;
    //   117: fload #7
    //   119: invokevirtual Dne : (F)V
    //   122: aload_0
    //   123: getfield zGp : LrxL;
    //   126: fload #7
    //   128: invokevirtual Dne : (F)V
    //   131: invokestatic glPopMatrix : ()V
    //   134: goto -> 191
    //   137: aload_0
    //   138: getfield Dne : LrxL;
    //   141: fload #7
    //   143: invokevirtual Dne : (F)V
    //   146: aload_0
    //   147: getfield FWm : LrxL;
    //   150: fload #7
    //   152: invokevirtual Dne : (F)V
    //   155: aload_0
    //   156: getfield bzF : LrxL;
    //   159: fload #7
    //   161: invokevirtual Dne : (F)V
    //   164: aload_0
    //   165: getfield Qnq : LrxL;
    //   168: fload #7
    //   170: invokevirtual Dne : (F)V
    //   173: aload_0
    //   174: getfield aFZ : LrxL;
    //   177: fload #7
    //   179: invokevirtual Dne : (F)V
    //   182: aload_0
    //   183: getfield zGp : LrxL;
    //   186: fload #7
    //   188: invokevirtual Dne : (F)V
    //   191: return
  }
  
  public qcK(int paramInt, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new rxL
    //   8: dup
    //   9: aload_0
    //   10: iconst_0
    //   11: iconst_0
    //   12: invokespecial <init> : (LGor;II)V
    //   15: putfield Dne : LrxL;
    //   18: aload_0
    //   19: ldc 8.0
    //   21: putfield FWm : F
    //   24: aload_0
    //   25: ldc 4.0
    //   27: putfield bzF : F
    //   30: aload_0
    //   31: getfield Dne : LrxL;
    //   34: ldc -4.0
    //   36: ldc -4.0
    //   38: ldc -8.0
    //   40: bipush #8
    //   42: bipush #8
    //   44: bipush #8
    //   46: fload_2
    //   47: invokevirtual Dne : (FFFIIIF)V
    //   50: aload_0
    //   51: getfield Dne : LrxL;
    //   54: fconst_0
    //   55: bipush #18
    //   57: iload_1
    //   58: isub
    //   59: i2f
    //   60: ldc -6.0
    //   62: invokevirtual Dne : (FFF)V
    //   65: aload_0
    //   66: new rxL
    //   69: dup
    //   70: aload_0
    //   71: bipush #28
    //   73: bipush #8
    //   75: invokespecial <init> : (LGor;II)V
    //   78: putfield FWm : LrxL;
    //   81: aload_0
    //   82: getfield FWm : LrxL;
    //   85: ldc -5.0
    //   87: ldc -10.0
    //   89: ldc -7.0
    //   91: bipush #10
    //   93: bipush #16
    //   95: bipush #8
    //   97: fload_2
    //   98: invokevirtual Dne : (FFFIIIF)V
    //   101: aload_0
    //   102: getfield FWm : LrxL;
    //   105: fconst_0
    //   106: bipush #17
    //   108: iload_1
    //   109: isub
    //   110: i2f
    //   111: fconst_2
    //   112: invokevirtual Dne : (FFF)V
    //   115: aload_0
    //   116: new rxL
    //   119: dup
    //   120: aload_0
    //   121: iconst_0
    //   122: bipush #16
    //   124: invokespecial <init> : (LGor;II)V
    //   127: putfield bzF : LrxL;
    //   130: aload_0
    //   131: getfield bzF : LrxL;
    //   134: ldc -2.0
    //   136: fconst_0
    //   137: ldc -2.0
    //   139: iconst_4
    //   140: iload_1
    //   141: iconst_4
    //   142: fload_2
    //   143: invokevirtual Dne : (FFFIIIF)V
    //   146: aload_0
    //   147: getfield bzF : LrxL;
    //   150: ldc -3.0
    //   152: bipush #24
    //   154: iload_1
    //   155: isub
    //   156: i2f
    //   157: ldc 7.0
    //   159: invokevirtual Dne : (FFF)V
    //   162: aload_0
    //   163: new rxL
    //   166: dup
    //   167: aload_0
    //   168: iconst_0
    //   169: bipush #16
    //   171: invokespecial <init> : (LGor;II)V
    //   174: putfield Qnq : LrxL;
    //   177: aload_0
    //   178: getfield Qnq : LrxL;
    //   181: ldc -2.0
    //   183: fconst_0
    //   184: ldc -2.0
    //   186: iconst_4
    //   187: iload_1
    //   188: iconst_4
    //   189: fload_2
    //   190: invokevirtual Dne : (FFFIIIF)V
    //   193: aload_0
    //   194: getfield Qnq : LrxL;
    //   197: ldc 3.0
    //   199: bipush #24
    //   201: iload_1
    //   202: isub
    //   203: i2f
    //   204: ldc 7.0
    //   206: invokevirtual Dne : (FFF)V
    //   209: aload_0
    //   210: new rxL
    //   213: dup
    //   214: aload_0
    //   215: iconst_0
    //   216: bipush #16
    //   218: invokespecial <init> : (LGor;II)V
    //   221: putfield aFZ : LrxL;
    //   224: aload_0
    //   225: getfield aFZ : LrxL;
    //   228: ldc -2.0
    //   230: fconst_0
    //   231: ldc -2.0
    //   233: iconst_4
    //   234: iload_1
    //   235: iconst_4
    //   236: fload_2
    //   237: invokevirtual Dne : (FFFIIIF)V
    //   240: aload_0
    //   241: getfield aFZ : LrxL;
    //   244: ldc -3.0
    //   246: bipush #24
    //   248: iload_1
    //   249: isub
    //   250: i2f
    //   251: ldc -5.0
    //   253: invokevirtual Dne : (FFF)V
    //   256: aload_0
    //   257: new rxL
    //   260: dup
    //   261: aload_0
    //   262: iconst_0
    //   263: bipush #16
    //   265: invokespecial <init> : (LGor;II)V
    //   268: putfield zGp : LrxL;
    //   271: aload_0
    //   272: getfield zGp : LrxL;
    //   275: ldc -2.0
    //   277: fconst_0
    //   278: ldc -2.0
    //   280: iconst_4
    //   281: iload_1
    //   282: iconst_4
    //   283: fload_2
    //   284: invokevirtual Dne : (FFFIIIF)V
    //   287: aload_0
    //   288: getfield zGp : LrxL;
    //   291: ldc 3.0
    //   293: bipush #24
    //   295: iload_1
    //   296: isub
    //   297: i2f
    //   298: ldc -5.0
    //   300: invokevirtual Dne : (FFF)V
    //   303: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qcK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */