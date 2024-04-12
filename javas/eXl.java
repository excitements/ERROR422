public class eXl extends qcK {
  private float Qnq;
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    super.Dne(paramFUH, paramFloat1, paramFloat2, paramFloat3);
    this.Dne.Qnq = 6.0F + ((Pvd)paramFUH).bzF(paramFloat3) * 9.0F;
    this.Qnq = ((Pvd)paramFUH).Qnq(paramFloat3);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.zGp = this.Qnq;
  }
  
  public eXl() {
    // Byte code:
    //   0: aload_0
    //   1: bipush #12
    //   3: fconst_0
    //   4: invokespecial <init> : (IF)V
    //   7: aload_0
    //   8: new rxL
    //   11: dup
    //   12: aload_0
    //   13: iconst_0
    //   14: iconst_0
    //   15: invokespecial <init> : (LGor;II)V
    //   18: putfield Dne : LrxL;
    //   21: aload_0
    //   22: getfield Dne : LrxL;
    //   25: ldc -3.0
    //   27: ldc -4.0
    //   29: ldc -4.0
    //   31: bipush #6
    //   33: bipush #6
    //   35: bipush #6
    //   37: ldc 0.6
    //   39: invokevirtual Dne : (FFFIIIF)V
    //   42: aload_0
    //   43: getfield Dne : LrxL;
    //   46: fconst_0
    //   47: ldc 6.0
    //   49: ldc -8.0
    //   51: invokevirtual Dne : (FFF)V
    //   54: aload_0
    //   55: new rxL
    //   58: dup
    //   59: aload_0
    //   60: bipush #28
    //   62: bipush #8
    //   64: invokespecial <init> : (LGor;II)V
    //   67: putfield FWm : LrxL;
    //   70: aload_0
    //   71: getfield FWm : LrxL;
    //   74: ldc -4.0
    //   76: ldc -10.0
    //   78: ldc -7.0
    //   80: bipush #8
    //   82: bipush #16
    //   84: bipush #6
    //   86: ldc 1.75
    //   88: invokevirtual Dne : (FFFIIIF)V
    //   91: aload_0
    //   92: getfield FWm : LrxL;
    //   95: fconst_0
    //   96: ldc 5.0
    //   98: fconst_2
    //   99: invokevirtual Dne : (FFF)V
    //   102: ldc 0.5
    //   104: fstore_1
    //   105: aload_0
    //   106: new rxL
    //   109: dup
    //   110: aload_0
    //   111: iconst_0
    //   112: bipush #16
    //   114: invokespecial <init> : (LGor;II)V
    //   117: putfield bzF : LrxL;
    //   120: aload_0
    //   121: getfield bzF : LrxL;
    //   124: ldc -2.0
    //   126: fconst_0
    //   127: ldc -2.0
    //   129: iconst_4
    //   130: bipush #6
    //   132: iconst_4
    //   133: fload_1
    //   134: invokevirtual Dne : (FFFIIIF)V
    //   137: aload_0
    //   138: getfield bzF : LrxL;
    //   141: ldc -3.0
    //   143: ldc 12.0
    //   145: ldc 7.0
    //   147: invokevirtual Dne : (FFF)V
    //   150: aload_0
    //   151: new rxL
    //   154: dup
    //   155: aload_0
    //   156: iconst_0
    //   157: bipush #16
    //   159: invokespecial <init> : (LGor;II)V
    //   162: putfield Qnq : LrxL;
    //   165: aload_0
    //   166: getfield Qnq : LrxL;
    //   169: ldc -2.0
    //   171: fconst_0
    //   172: ldc -2.0
    //   174: iconst_4
    //   175: bipush #6
    //   177: iconst_4
    //   178: fload_1
    //   179: invokevirtual Dne : (FFFIIIF)V
    //   182: aload_0
    //   183: getfield Qnq : LrxL;
    //   186: ldc 3.0
    //   188: ldc 12.0
    //   190: ldc 7.0
    //   192: invokevirtual Dne : (FFF)V
    //   195: aload_0
    //   196: new rxL
    //   199: dup
    //   200: aload_0
    //   201: iconst_0
    //   202: bipush #16
    //   204: invokespecial <init> : (LGor;II)V
    //   207: putfield aFZ : LrxL;
    //   210: aload_0
    //   211: getfield aFZ : LrxL;
    //   214: ldc -2.0
    //   216: fconst_0
    //   217: ldc -2.0
    //   219: iconst_4
    //   220: bipush #6
    //   222: iconst_4
    //   223: fload_1
    //   224: invokevirtual Dne : (FFFIIIF)V
    //   227: aload_0
    //   228: getfield aFZ : LrxL;
    //   231: ldc -3.0
    //   233: ldc 12.0
    //   235: ldc -5.0
    //   237: invokevirtual Dne : (FFF)V
    //   240: aload_0
    //   241: new rxL
    //   244: dup
    //   245: aload_0
    //   246: iconst_0
    //   247: bipush #16
    //   249: invokespecial <init> : (LGor;II)V
    //   252: putfield zGp : LrxL;
    //   255: aload_0
    //   256: getfield zGp : LrxL;
    //   259: ldc -2.0
    //   261: fconst_0
    //   262: ldc -2.0
    //   264: iconst_4
    //   265: bipush #6
    //   267: iconst_4
    //   268: fload_1
    //   269: invokevirtual Dne : (FFFIIIF)V
    //   272: aload_0
    //   273: getfield zGp : LrxL;
    //   276: ldc 3.0
    //   278: ldc 12.0
    //   280: ldc -5.0
    //   282: invokevirtual Dne : (FFF)V
    //   285: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eXl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */