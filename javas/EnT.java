public class EnT extends OAi {
  private rxL DyG;
  
  private rxL div;
  
  public boolean Dne;
  
  public EnT(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: fload_1
    //   2: fconst_0
    //   3: bipush #64
    //   5: sipush #128
    //   8: invokespecial <init> : (FFII)V
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield Dne : Z
    //   16: aload_0
    //   17: new rxL
    //   20: dup
    //   21: aload_0
    //   22: invokespecial <init> : (LGor;)V
    //   25: bipush #64
    //   27: sipush #128
    //   30: invokevirtual FWm : (II)LrxL;
    //   33: putfield DyG : LrxL;
    //   36: aload_0
    //   37: getfield DyG : LrxL;
    //   40: fconst_0
    //   41: ldc -2.0
    //   43: fconst_0
    //   44: invokevirtual Dne : (FFF)V
    //   47: aload_0
    //   48: getfield DyG : LrxL;
    //   51: iconst_0
    //   52: iconst_0
    //   53: invokevirtual Dne : (II)LrxL;
    //   56: fconst_0
    //   57: ldc 3.0
    //   59: ldc -6.75
    //   61: iconst_1
    //   62: iconst_1
    //   63: iconst_1
    //   64: ldc -0.25
    //   66: invokevirtual Dne : (FFFIIIF)V
    //   69: aload_0
    //   70: getfield zGp : LrxL;
    //   73: aload_0
    //   74: getfield DyG : LrxL;
    //   77: invokevirtual Dne : (LrxL;)V
    //   80: aload_0
    //   81: new rxL
    //   84: dup
    //   85: aload_0
    //   86: invokespecial <init> : (LGor;)V
    //   89: bipush #64
    //   91: sipush #128
    //   94: invokevirtual FWm : (II)LrxL;
    //   97: putfield div : LrxL;
    //   100: aload_0
    //   101: getfield div : LrxL;
    //   104: ldc -5.0
    //   106: ldc -10.03125
    //   108: ldc -5.0
    //   110: invokevirtual Dne : (FFF)V
    //   113: aload_0
    //   114: getfield div : LrxL;
    //   117: iconst_0
    //   118: bipush #64
    //   120: invokevirtual Dne : (II)LrxL;
    //   123: fconst_0
    //   124: fconst_0
    //   125: fconst_0
    //   126: bipush #10
    //   128: iconst_2
    //   129: bipush #10
    //   131: invokevirtual Dne : (FFFIII)LrxL;
    //   134: pop
    //   135: aload_0
    //   136: getfield Dne : LrxL;
    //   139: aload_0
    //   140: getfield div : LrxL;
    //   143: invokevirtual Dne : (LrxL;)V
    //   146: new rxL
    //   149: dup
    //   150: aload_0
    //   151: invokespecial <init> : (LGor;)V
    //   154: bipush #64
    //   156: sipush #128
    //   159: invokevirtual FWm : (II)LrxL;
    //   162: astore_2
    //   163: aload_2
    //   164: ldc 1.75
    //   166: ldc -4.0
    //   168: fconst_2
    //   169: invokevirtual Dne : (FFF)V
    //   172: aload_2
    //   173: iconst_0
    //   174: bipush #76
    //   176: invokevirtual Dne : (II)LrxL;
    //   179: fconst_0
    //   180: fconst_0
    //   181: fconst_0
    //   182: bipush #7
    //   184: iconst_4
    //   185: bipush #7
    //   187: invokevirtual Dne : (FFFIII)LrxL;
    //   190: pop
    //   191: aload_2
    //   192: ldc -0.05235988
    //   194: putfield zGp : F
    //   197: aload_2
    //   198: ldc 0.02617994
    //   200: putfield div : F
    //   203: aload_0
    //   204: getfield div : LrxL;
    //   207: aload_2
    //   208: invokevirtual Dne : (LrxL;)V
    //   211: new rxL
    //   214: dup
    //   215: aload_0
    //   216: invokespecial <init> : (LGor;)V
    //   219: bipush #64
    //   221: sipush #128
    //   224: invokevirtual FWm : (II)LrxL;
    //   227: astore_3
    //   228: aload_3
    //   229: ldc 1.75
    //   231: ldc -4.0
    //   233: fconst_2
    //   234: invokevirtual Dne : (FFF)V
    //   237: aload_3
    //   238: iconst_0
    //   239: bipush #87
    //   241: invokevirtual Dne : (II)LrxL;
    //   244: fconst_0
    //   245: fconst_0
    //   246: fconst_0
    //   247: iconst_4
    //   248: iconst_4
    //   249: iconst_4
    //   250: invokevirtual Dne : (FFFIII)LrxL;
    //   253: pop
    //   254: aload_3
    //   255: ldc -0.10471976
    //   257: putfield zGp : F
    //   260: aload_3
    //   261: ldc 0.05235988
    //   263: putfield div : F
    //   266: aload_2
    //   267: aload_3
    //   268: invokevirtual Dne : (LrxL;)V
    //   271: new rxL
    //   274: dup
    //   275: aload_0
    //   276: invokespecial <init> : (LGor;)V
    //   279: bipush #64
    //   281: sipush #128
    //   284: invokevirtual FWm : (II)LrxL;
    //   287: astore #4
    //   289: aload #4
    //   291: ldc 1.75
    //   293: ldc -2.0
    //   295: fconst_2
    //   296: invokevirtual Dne : (FFF)V
    //   299: aload #4
    //   301: iconst_0
    //   302: bipush #95
    //   304: invokevirtual Dne : (II)LrxL;
    //   307: fconst_0
    //   308: fconst_0
    //   309: fconst_0
    //   310: iconst_1
    //   311: iconst_2
    //   312: iconst_1
    //   313: ldc 0.25
    //   315: invokevirtual Dne : (FFFIIIF)V
    //   318: aload #4
    //   320: ldc -0.20943952
    //   322: putfield zGp : F
    //   325: aload #4
    //   327: ldc 0.10471976
    //   329: putfield div : F
    //   332: aload_3
    //   333: aload #4
    //   335: invokevirtual Dne : (LrxL;)V
    //   338: return
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.zGp.IjH = this.zGp.mrb = this.zGp.XHL = 0.0F;
    float f = 0.01F * (paramsMa.aFZ % 10);
    this.zGp.zGp = geR.Dne(paramsMa.zGp * f) * 4.5F * 3.1415927F / 180.0F;
    this.zGp.DyG = 0.0F;
    this.zGp.div = geR.FWm(paramsMa.zGp * f) * 2.5F * 3.1415927F / 180.0F;
    if (this.Dne) {
      this.zGp.zGp = -0.9F;
      this.zGp.XHL = -0.09375F;
      this.zGp.mrb = 0.1875F;
    } 
  }
  
  public int Dne() {
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EnT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */