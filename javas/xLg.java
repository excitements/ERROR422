public class xLg extends Gor {
  private rxL[] Dne;
  
  private rxL[] FWm;
  
  private static final int[][] FWm;
  
  private static final int[][] Dne = new int[][] { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
  
  private float[] Dne;
  
  public xLg() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: bipush #7
    //   7: anewarray rxL
    //   10: putfield Dne : [LrxL;
    //   13: aload_0
    //   14: bipush #7
    //   16: newarray float
    //   18: putfield Dne : [F
    //   21: ldc -3.5
    //   23: fstore_1
    //   24: iconst_0
    //   25: istore_2
    //   26: iload_2
    //   27: aload_0
    //   28: getfield Dne : [LrxL;
    //   31: arraylength
    //   32: if_icmpge -> 187
    //   35: aload_0
    //   36: getfield Dne : [LrxL;
    //   39: iload_2
    //   40: new rxL
    //   43: dup
    //   44: aload_0
    //   45: getstatic xLg.FWm : [[I
    //   48: iload_2
    //   49: aaload
    //   50: iconst_0
    //   51: iaload
    //   52: getstatic xLg.FWm : [[I
    //   55: iload_2
    //   56: aaload
    //   57: iconst_1
    //   58: iaload
    //   59: invokespecial <init> : (LGor;II)V
    //   62: aastore
    //   63: aload_0
    //   64: getfield Dne : [LrxL;
    //   67: iload_2
    //   68: aaload
    //   69: getstatic xLg.Dne : [[I
    //   72: iload_2
    //   73: aaload
    //   74: iconst_0
    //   75: iaload
    //   76: i2f
    //   77: ldc -0.5
    //   79: fmul
    //   80: fconst_0
    //   81: getstatic xLg.Dne : [[I
    //   84: iload_2
    //   85: aaload
    //   86: iconst_2
    //   87: iaload
    //   88: i2f
    //   89: ldc -0.5
    //   91: fmul
    //   92: getstatic xLg.Dne : [[I
    //   95: iload_2
    //   96: aaload
    //   97: iconst_0
    //   98: iaload
    //   99: getstatic xLg.Dne : [[I
    //   102: iload_2
    //   103: aaload
    //   104: iconst_1
    //   105: iaload
    //   106: getstatic xLg.Dne : [[I
    //   109: iload_2
    //   110: aaload
    //   111: iconst_2
    //   112: iaload
    //   113: invokevirtual Dne : (FFFIII)LrxL;
    //   116: pop
    //   117: aload_0
    //   118: getfield Dne : [LrxL;
    //   121: iload_2
    //   122: aaload
    //   123: fconst_0
    //   124: bipush #24
    //   126: getstatic xLg.Dne : [[I
    //   129: iload_2
    //   130: aaload
    //   131: iconst_1
    //   132: iaload
    //   133: isub
    //   134: i2f
    //   135: fload_1
    //   136: invokevirtual Dne : (FFF)V
    //   139: aload_0
    //   140: getfield Dne : [F
    //   143: iload_2
    //   144: fload_1
    //   145: fastore
    //   146: iload_2
    //   147: aload_0
    //   148: getfield Dne : [LrxL;
    //   151: arraylength
    //   152: iconst_1
    //   153: isub
    //   154: if_icmpge -> 181
    //   157: fload_1
    //   158: getstatic xLg.Dne : [[I
    //   161: iload_2
    //   162: aaload
    //   163: iconst_2
    //   164: iaload
    //   165: getstatic xLg.Dne : [[I
    //   168: iload_2
    //   169: iconst_1
    //   170: iadd
    //   171: aaload
    //   172: iconst_2
    //   173: iaload
    //   174: iadd
    //   175: i2f
    //   176: ldc 0.5
    //   178: fmul
    //   179: fadd
    //   180: fstore_1
    //   181: iinc #2, 1
    //   184: goto -> 26
    //   187: aload_0
    //   188: iconst_3
    //   189: anewarray rxL
    //   192: putfield FWm : [LrxL;
    //   195: aload_0
    //   196: getfield FWm : [LrxL;
    //   199: iconst_0
    //   200: new rxL
    //   203: dup
    //   204: aload_0
    //   205: bipush #20
    //   207: iconst_0
    //   208: invokespecial <init> : (LGor;II)V
    //   211: aastore
    //   212: aload_0
    //   213: getfield FWm : [LrxL;
    //   216: iconst_0
    //   217: aaload
    //   218: ldc -5.0
    //   220: fconst_0
    //   221: getstatic xLg.Dne : [[I
    //   224: iconst_2
    //   225: aaload
    //   226: iconst_2
    //   227: iaload
    //   228: i2f
    //   229: ldc -0.5
    //   231: fmul
    //   232: bipush #10
    //   234: bipush #8
    //   236: getstatic xLg.Dne : [[I
    //   239: iconst_2
    //   240: aaload
    //   241: iconst_2
    //   242: iaload
    //   243: invokevirtual Dne : (FFFIII)LrxL;
    //   246: pop
    //   247: aload_0
    //   248: getfield FWm : [LrxL;
    //   251: iconst_0
    //   252: aaload
    //   253: fconst_0
    //   254: ldc 16.0
    //   256: aload_0
    //   257: getfield Dne : [F
    //   260: iconst_2
    //   261: faload
    //   262: invokevirtual Dne : (FFF)V
    //   265: aload_0
    //   266: getfield FWm : [LrxL;
    //   269: iconst_1
    //   270: new rxL
    //   273: dup
    //   274: aload_0
    //   275: bipush #20
    //   277: bipush #11
    //   279: invokespecial <init> : (LGor;II)V
    //   282: aastore
    //   283: aload_0
    //   284: getfield FWm : [LrxL;
    //   287: iconst_1
    //   288: aaload
    //   289: ldc -3.0
    //   291: fconst_0
    //   292: getstatic xLg.Dne : [[I
    //   295: iconst_4
    //   296: aaload
    //   297: iconst_2
    //   298: iaload
    //   299: i2f
    //   300: ldc -0.5
    //   302: fmul
    //   303: bipush #6
    //   305: iconst_4
    //   306: getstatic xLg.Dne : [[I
    //   309: iconst_4
    //   310: aaload
    //   311: iconst_2
    //   312: iaload
    //   313: invokevirtual Dne : (FFFIII)LrxL;
    //   316: pop
    //   317: aload_0
    //   318: getfield FWm : [LrxL;
    //   321: iconst_1
    //   322: aaload
    //   323: fconst_0
    //   324: ldc 20.0
    //   326: aload_0
    //   327: getfield Dne : [F
    //   330: iconst_4
    //   331: faload
    //   332: invokevirtual Dne : (FFF)V
    //   335: aload_0
    //   336: getfield FWm : [LrxL;
    //   339: iconst_2
    //   340: new rxL
    //   343: dup
    //   344: aload_0
    //   345: bipush #20
    //   347: bipush #18
    //   349: invokespecial <init> : (LGor;II)V
    //   352: aastore
    //   353: aload_0
    //   354: getfield FWm : [LrxL;
    //   357: iconst_2
    //   358: aaload
    //   359: ldc -3.0
    //   361: fconst_0
    //   362: getstatic xLg.Dne : [[I
    //   365: iconst_4
    //   366: aaload
    //   367: iconst_2
    //   368: iaload
    //   369: i2f
    //   370: ldc -0.5
    //   372: fmul
    //   373: bipush #6
    //   375: iconst_5
    //   376: getstatic xLg.Dne : [[I
    //   379: iconst_1
    //   380: aaload
    //   381: iconst_2
    //   382: iaload
    //   383: invokevirtual Dne : (FFFIII)LrxL;
    //   386: pop
    //   387: aload_0
    //   388: getfield FWm : [LrxL;
    //   391: iconst_2
    //   392: aaload
    //   393: fconst_0
    //   394: ldc 19.0
    //   396: aload_0
    //   397: getfield Dne : [F
    //   400: iconst_1
    //   401: faload
    //   402: invokevirtual Dne : (FFF)V
    //   405: return
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    for (byte b = 0; b < this.Dne.length; b++) {
      (this.Dne[b]).DyG = geR.FWm(paramFloat3 * 0.9F + b * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (1 + Math.abs(b - 2));
      (this.Dne[b]).bzF = geR.Dne(paramFloat3 * 0.9F + b * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * Math.abs(b - 2);
    } 
    ((rxL)this.FWm[0]).DyG = (this.Dne[2]).DyG;
    ((rxL)this.FWm[1]).DyG = (this.Dne[4]).DyG;
    ((rxL)this.FWm[1]).bzF = (this.Dne[4]).bzF;
    ((rxL)this.FWm[2]).DyG = (this.Dne[1]).DyG;
    ((rxL)this.FWm[2]).bzF = (this.Dne[1]).bzF;
  }
  
  static {
    FWm = new int[][] { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
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
    //   15: iconst_0
    //   16: istore #8
    //   18: iload #8
    //   20: aload_0
    //   21: getfield Dne : [LrxL;
    //   24: arraylength
    //   25: if_icmpge -> 46
    //   28: aload_0
    //   29: getfield Dne : [LrxL;
    //   32: iload #8
    //   34: aaload
    //   35: fload #7
    //   37: invokevirtual Dne : (F)V
    //   40: iinc #8, 1
    //   43: goto -> 18
    //   46: iconst_0
    //   47: istore #8
    //   49: iload #8
    //   51: aload_0
    //   52: getfield FWm : [LrxL;
    //   55: arraylength
    //   56: if_icmpge -> 77
    //   59: aload_0
    //   60: getfield FWm : [LrxL;
    //   63: iload #8
    //   65: aaload
    //   66: fload #7
    //   68: invokevirtual Dne : (F)V
    //   71: iinc #8, 1
    //   74: goto -> 49
    //   77: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xLg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */