public class ZYo extends Sgm {
  public boolean FWm;
  
  public boolean Dne;
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.FWm = 1;
    float f1 = -14.0F;
    this.bzF.zGp = 0.0F;
    this.bzF.Qnq = f1;
    this.bzF.aFZ = -0.0F;
    this.zGp.zGp -= 0.0F;
    this.DyG.zGp -= 0.0F;
    this.Qnq.zGp = (float)(this.Qnq.zGp * 0.5D);
    this.aFZ.zGp = (float)(this.aFZ.zGp * 0.5D);
    this.zGp.zGp = (float)(this.zGp.zGp * 0.5D);
    this.DyG.zGp = (float)(this.DyG.zGp * 0.5D);
    float f2 = 0.4F;
    if (this.Qnq.zGp > f2)
      this.Qnq.zGp = f2; 
    if (this.aFZ.zGp > f2)
      this.aFZ.zGp = f2; 
    if (this.Qnq.zGp < -f2)
      this.Qnq.zGp = -f2; 
    if (this.aFZ.zGp < -f2)
      this.aFZ.zGp = -f2; 
    if (this.zGp.zGp > f2)
      this.zGp.zGp = f2; 
    if (this.DyG.zGp > f2)
      this.DyG.zGp = f2; 
    if (this.zGp.zGp < -f2)
      this.zGp.zGp = -f2; 
    if (this.DyG.zGp < -f2)
      this.DyG.zGp = -f2; 
    if (this.Dne) {
      this.Qnq.zGp = -0.5F;
      this.aFZ.zGp = -0.5F;
      this.Qnq.div = 0.05F;
      this.aFZ.div = -0.05F;
    } 
    this.Qnq.aFZ = 0.0F;
    this.aFZ.aFZ = 0.0F;
    this.zGp.aFZ = 0.0F;
    this.DyG.aFZ = 0.0F;
    this.zGp.Qnq = 9.0F + f1;
    this.DyG.Qnq = 9.0F + f1;
    this.Dne.aFZ = -0.0F;
    this.Dne.Qnq = f1 + 1.0F;
    this.FWm.bzF = this.Dne.bzF;
    this.FWm.Qnq = this.Dne.Qnq;
    this.FWm.aFZ = this.Dne.aFZ;
    this.FWm.zGp = this.Dne.zGp;
    this.FWm.DyG = this.Dne.DyG;
    this.FWm.div = this.Dne.div;
    if (this.FWm) {
      float f = 1.0F;
      this.Dne.Qnq -= f * 5.0F;
    } 
  }
  
  public ZYo() {
    // Byte code:
    //   0: aload_0
    //   1: fconst_0
    //   2: ldc -14.0
    //   4: bipush #64
    //   6: bipush #32
    //   8: invokespecial <init> : (FFII)V
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield Dne : Z
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield FWm : Z
    //   21: ldc -14.0
    //   23: fstore_1
    //   24: fconst_0
    //   25: fstore_2
    //   26: aload_0
    //   27: new rxL
    //   30: dup
    //   31: aload_0
    //   32: iconst_0
    //   33: bipush #16
    //   35: invokespecial <init> : (LGor;II)V
    //   38: putfield FWm : LrxL;
    //   41: aload_0
    //   42: getfield FWm : LrxL;
    //   45: ldc -4.0
    //   47: ldc -8.0
    //   49: ldc -4.0
    //   51: bipush #8
    //   53: bipush #8
    //   55: bipush #8
    //   57: fload_2
    //   58: ldc 0.5
    //   60: fsub
    //   61: invokevirtual Dne : (FFFIIIF)V
    //   64: aload_0
    //   65: getfield FWm : LrxL;
    //   68: fconst_0
    //   69: fconst_0
    //   70: fload_1
    //   71: fadd
    //   72: fconst_0
    //   73: invokevirtual Dne : (FFF)V
    //   76: aload_0
    //   77: new rxL
    //   80: dup
    //   81: aload_0
    //   82: bipush #32
    //   84: bipush #16
    //   86: invokespecial <init> : (LGor;II)V
    //   89: putfield bzF : LrxL;
    //   92: aload_0
    //   93: getfield bzF : LrxL;
    //   96: ldc -4.0
    //   98: fconst_0
    //   99: ldc -2.0
    //   101: bipush #8
    //   103: bipush #12
    //   105: iconst_4
    //   106: fload_2
    //   107: invokevirtual Dne : (FFFIIIF)V
    //   110: aload_0
    //   111: getfield bzF : LrxL;
    //   114: fconst_0
    //   115: fconst_0
    //   116: fload_1
    //   117: fadd
    //   118: fconst_0
    //   119: invokevirtual Dne : (FFF)V
    //   122: aload_0
    //   123: new rxL
    //   126: dup
    //   127: aload_0
    //   128: bipush #56
    //   130: iconst_0
    //   131: invokespecial <init> : (LGor;II)V
    //   134: putfield Qnq : LrxL;
    //   137: aload_0
    //   138: getfield Qnq : LrxL;
    //   141: ldc -1.0
    //   143: ldc -2.0
    //   145: ldc -1.0
    //   147: iconst_2
    //   148: bipush #30
    //   150: iconst_2
    //   151: fload_2
    //   152: invokevirtual Dne : (FFFIIIF)V
    //   155: aload_0
    //   156: getfield Qnq : LrxL;
    //   159: ldc -3.0
    //   161: fconst_2
    //   162: fload_1
    //   163: fadd
    //   164: fconst_0
    //   165: invokevirtual Dne : (FFF)V
    //   168: aload_0
    //   169: new rxL
    //   172: dup
    //   173: aload_0
    //   174: bipush #56
    //   176: iconst_0
    //   177: invokespecial <init> : (LGor;II)V
    //   180: putfield aFZ : LrxL;
    //   183: aload_0
    //   184: getfield aFZ : LrxL;
    //   187: iconst_1
    //   188: putfield Dne : Z
    //   191: aload_0
    //   192: getfield aFZ : LrxL;
    //   195: ldc -1.0
    //   197: ldc -2.0
    //   199: ldc -1.0
    //   201: iconst_2
    //   202: bipush #30
    //   204: iconst_2
    //   205: fload_2
    //   206: invokevirtual Dne : (FFFIIIF)V
    //   209: aload_0
    //   210: getfield aFZ : LrxL;
    //   213: ldc 5.0
    //   215: fconst_2
    //   216: fload_1
    //   217: fadd
    //   218: fconst_0
    //   219: invokevirtual Dne : (FFF)V
    //   222: aload_0
    //   223: new rxL
    //   226: dup
    //   227: aload_0
    //   228: bipush #56
    //   230: iconst_0
    //   231: invokespecial <init> : (LGor;II)V
    //   234: putfield zGp : LrxL;
    //   237: aload_0
    //   238: getfield zGp : LrxL;
    //   241: ldc -1.0
    //   243: fconst_0
    //   244: ldc -1.0
    //   246: iconst_2
    //   247: bipush #30
    //   249: iconst_2
    //   250: fload_2
    //   251: invokevirtual Dne : (FFFIIIF)V
    //   254: aload_0
    //   255: getfield zGp : LrxL;
    //   258: ldc -2.0
    //   260: ldc 12.0
    //   262: fload_1
    //   263: fadd
    //   264: fconst_0
    //   265: invokevirtual Dne : (FFF)V
    //   268: aload_0
    //   269: new rxL
    //   272: dup
    //   273: aload_0
    //   274: bipush #56
    //   276: iconst_0
    //   277: invokespecial <init> : (LGor;II)V
    //   280: putfield DyG : LrxL;
    //   283: aload_0
    //   284: getfield DyG : LrxL;
    //   287: iconst_1
    //   288: putfield Dne : Z
    //   291: aload_0
    //   292: getfield DyG : LrxL;
    //   295: ldc -1.0
    //   297: fconst_0
    //   298: ldc -1.0
    //   300: iconst_2
    //   301: bipush #30
    //   303: iconst_2
    //   304: fload_2
    //   305: invokevirtual Dne : (FFFIIIF)V
    //   308: aload_0
    //   309: getfield DyG : LrxL;
    //   312: fconst_2
    //   313: ldc 12.0
    //   315: fload_1
    //   316: fadd
    //   317: fconst_0
    //   318: invokevirtual Dne : (FFF)V
    //   321: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZYo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */