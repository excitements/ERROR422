import org.lwjgl.opengl.GL11;

public class JOY extends YAD {
  private static int Dne = false;
  
  protected Drf Dne = this.Dne;
  
  public void Dne(WSC paramWSC, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: invokestatic Dne : (LsQM;Z)V
    //   5: getstatic JOY.Dne : I
    //   8: iconst_4
    //   9: if_icmpeq -> 28
    //   12: aload_0
    //   13: new Drf
    //   16: dup
    //   17: fconst_0
    //   18: invokespecial <init> : (F)V
    //   21: putfield Dne : LGor;
    //   24: iconst_4
    //   25: putstatic JOY.Dne : I
    //   28: aload_0
    //   29: aload_1
    //   30: dload_2
    //   31: dload #4
    //   33: dload #6
    //   35: fload #8
    //   37: fload #9
    //   39: invokespecial Dne : (LFUH;DDDFF)V
    //   42: aload_1
    //   43: getfield Dne : LNdk;
    //   46: ifnull -> 540
    //   49: aload_1
    //   50: getfield Dne : LNdk;
    //   53: getfield Dne : I
    //   56: i2f
    //   57: fload #9
    //   59: fadd
    //   60: fstore #10
    //   62: fload #10
    //   64: ldc 0.2
    //   66: fmul
    //   67: invokestatic Dne : (F)F
    //   70: fconst_2
    //   71: fdiv
    //   72: ldc 0.5
    //   74: fadd
    //   75: fstore #11
    //   77: fload #11
    //   79: fload #11
    //   81: fmul
    //   82: fload #11
    //   84: fadd
    //   85: ldc 0.2
    //   87: fmul
    //   88: fstore #11
    //   90: aload_1
    //   91: getfield Dne : LNdk;
    //   94: getfield div : D
    //   97: aload_1
    //   98: getfield div : D
    //   101: dsub
    //   102: aload_1
    //   103: getfield aFZ : D
    //   106: aload_1
    //   107: getfield div : D
    //   110: dsub
    //   111: fconst_1
    //   112: fload #9
    //   114: fsub
    //   115: f2d
    //   116: dmul
    //   117: dsub
    //   118: d2f
    //   119: fstore #12
    //   121: fload #11
    //   123: f2d
    //   124: aload_1
    //   125: getfield Dne : LNdk;
    //   128: getfield IjH : D
    //   131: dadd
    //   132: dconst_1
    //   133: dsub
    //   134: aload_1
    //   135: getfield IjH : D
    //   138: dsub
    //   139: aload_1
    //   140: getfield zGp : D
    //   143: aload_1
    //   144: getfield IjH : D
    //   147: dsub
    //   148: fconst_1
    //   149: fload #9
    //   151: fsub
    //   152: f2d
    //   153: dmul
    //   154: dsub
    //   155: d2f
    //   156: fstore #13
    //   158: aload_1
    //   159: getfield Dne : LNdk;
    //   162: getfield mrb : D
    //   165: aload_1
    //   166: getfield mrb : D
    //   169: dsub
    //   170: aload_1
    //   171: getfield DyG : D
    //   174: aload_1
    //   175: getfield mrb : D
    //   178: dsub
    //   179: fconst_1
    //   180: fload #9
    //   182: fsub
    //   183: f2d
    //   184: dmul
    //   185: dsub
    //   186: d2f
    //   187: fstore #14
    //   189: fload #12
    //   191: fload #12
    //   193: fmul
    //   194: fload #14
    //   196: fload #14
    //   198: fmul
    //   199: fadd
    //   200: invokestatic bzF : (F)F
    //   203: fstore #15
    //   205: fload #12
    //   207: fload #12
    //   209: fmul
    //   210: fload #13
    //   212: fload #13
    //   214: fmul
    //   215: fadd
    //   216: fload #14
    //   218: fload #14
    //   220: fmul
    //   221: fadd
    //   222: invokestatic bzF : (F)F
    //   225: fstore #16
    //   227: invokestatic glPushMatrix : ()V
    //   230: dload_2
    //   231: d2f
    //   232: dload #4
    //   234: d2f
    //   235: fconst_2
    //   236: fadd
    //   237: dload #6
    //   239: d2f
    //   240: invokestatic glTranslatef : (FFF)V
    //   243: fload #14
    //   245: f2d
    //   246: fload #12
    //   248: f2d
    //   249: invokestatic atan2 : (DD)D
    //   252: dneg
    //   253: d2f
    //   254: ldc 180.0
    //   256: fmul
    //   257: ldc 3.1415927
    //   259: fdiv
    //   260: ldc 90.0
    //   262: fsub
    //   263: fconst_0
    //   264: fconst_1
    //   265: fconst_0
    //   266: invokestatic glRotatef : (FFFF)V
    //   269: fload #15
    //   271: f2d
    //   272: fload #13
    //   274: f2d
    //   275: invokestatic atan2 : (DD)D
    //   278: dneg
    //   279: d2f
    //   280: ldc 180.0
    //   282: fmul
    //   283: ldc 3.1415927
    //   285: fdiv
    //   286: ldc 90.0
    //   288: fsub
    //   289: fconst_1
    //   290: fconst_0
    //   291: fconst_0
    //   292: invokestatic glRotatef : (FFFF)V
    //   295: getstatic WAR.Dne : LWAR;
    //   298: astore #17
    //   300: invokestatic Dne : ()V
    //   303: sipush #2884
    //   306: invokestatic glDisable : (I)V
    //   309: aload_0
    //   310: ldc '/mob/enderdragon/beam.png'
    //   312: invokevirtual Dne : (Ljava/lang/String;)V
    //   315: sipush #7425
    //   318: invokestatic glShadeModel : (I)V
    //   321: fconst_0
    //   322: aload_1
    //   323: getfield zGp : I
    //   326: i2f
    //   327: fload #9
    //   329: fadd
    //   330: ldc 0.01
    //   332: fmul
    //   333: fsub
    //   334: fstore #18
    //   336: fload #12
    //   338: fload #12
    //   340: fmul
    //   341: fload #13
    //   343: fload #13
    //   345: fmul
    //   346: fadd
    //   347: fload #14
    //   349: fload #14
    //   351: fmul
    //   352: fadd
    //   353: invokestatic bzF : (F)F
    //   356: ldc 32.0
    //   358: fdiv
    //   359: aload_1
    //   360: getfield zGp : I
    //   363: i2f
    //   364: fload #9
    //   366: fadd
    //   367: ldc 0.01
    //   369: fmul
    //   370: fsub
    //   371: fstore #19
    //   373: aload #17
    //   375: iconst_5
    //   376: invokevirtual Dne : (I)V
    //   379: bipush #8
    //   381: istore #20
    //   383: iconst_0
    //   384: istore #21
    //   386: iload #21
    //   388: iload #20
    //   390: if_icmpgt -> 516
    //   393: iload #21
    //   395: iload #20
    //   397: irem
    //   398: i2f
    //   399: ldc 3.1415927
    //   401: fmul
    //   402: fconst_2
    //   403: fmul
    //   404: iload #20
    //   406: i2f
    //   407: fdiv
    //   408: invokestatic Dne : (F)F
    //   411: ldc 0.75
    //   413: fmul
    //   414: fstore #22
    //   416: iload #21
    //   418: iload #20
    //   420: irem
    //   421: i2f
    //   422: ldc 3.1415927
    //   424: fmul
    //   425: fconst_2
    //   426: fmul
    //   427: iload #20
    //   429: i2f
    //   430: fdiv
    //   431: invokestatic FWm : (F)F
    //   434: ldc 0.75
    //   436: fmul
    //   437: fstore #23
    //   439: iload #21
    //   441: iload #20
    //   443: irem
    //   444: i2f
    //   445: fconst_1
    //   446: fmul
    //   447: iload #20
    //   449: i2f
    //   450: fdiv
    //   451: fstore #24
    //   453: aload #17
    //   455: iconst_0
    //   456: invokevirtual bzF : (I)V
    //   459: aload #17
    //   461: fload #22
    //   463: ldc 0.2
    //   465: fmul
    //   466: f2d
    //   467: fload #23
    //   469: ldc 0.2
    //   471: fmul
    //   472: f2d
    //   473: dconst_0
    //   474: fload #24
    //   476: f2d
    //   477: fload #19
    //   479: f2d
    //   480: invokevirtual Dne : (DDDDD)V
    //   483: aload #17
    //   485: ldc 16777215
    //   487: invokevirtual bzF : (I)V
    //   490: aload #17
    //   492: fload #22
    //   494: f2d
    //   495: fload #23
    //   497: f2d
    //   498: fload #16
    //   500: f2d
    //   501: fload #24
    //   503: f2d
    //   504: fload #18
    //   506: f2d
    //   507: invokevirtual Dne : (DDDDD)V
    //   510: iinc #21, 1
    //   513: goto -> 386
    //   516: aload #17
    //   518: invokevirtual Dne : ()I
    //   521: pop
    //   522: sipush #2884
    //   525: invokestatic glEnable : (I)V
    //   528: sipush #7424
    //   531: invokestatic glShadeModel : (I)V
    //   534: invokestatic FWm : ()V
    //   537: invokestatic glPopMatrix : ()V
    //   540: return
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((WSC)paramFUH, paramFloat);
  }
  
  protected void Dne(WSC paramWSC, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f1 = (float)paramWSC.Dne(7, paramFloat3)[0];
    float f2 = (float)(paramWSC.Dne(5, paramFloat3)[1] - paramWSC.Dne(10, paramFloat3)[1]);
    GL11.glRotatef(-f1, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(f2 * 10.0F, 1.0F, 0.0F, 0.0F);
    GL11.glTranslatef(0.0F, 0.0F, 1.0F);
    if (paramWSC.vSL > 0.0F) {
      float f = (paramWSC.vSL + paramFloat3 - 1.0F) / 20.0F * 1.6F;
      f = geR.bzF(f);
      if (f > 1.0F)
        f = 1.0F; 
      GL11.glRotatef(f * Dne(paramWSC), 0.0F, 0.0F, 1.0F);
    } 
  }
  
  protected void Dne(WSC paramWSC, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    if (paramWSC.FWm > null) {
      float f = paramWSC.FWm / 200.0F;
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, f);
      Dne("/mob/enderdragon/shuffle.png");
      this.Dne.Dne(paramWSC, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glDepthFunc(514);
    } 
    Dne(paramWSC.bzF());
    this.Dne.Dne(paramWSC, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    if (paramWSC.OdI > 0) {
      GL11.glDepthFunc(514);
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
      this.Dne.Dne(paramWSC, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDepthFunc(515);
    } 
  }
  
  protected void Dne(WSC paramWSC, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: fload_2
    //   3: invokespecial FWm : (LFUH;F)V
    //   6: getstatic WAR.Dne : LWAR;
    //   9: astore_3
    //   10: aload_1
    //   11: getfield FWm : I
    //   14: ifle -> 430
    //   17: invokestatic Dne : ()V
    //   20: aload_1
    //   21: getfield FWm : I
    //   24: i2f
    //   25: fload_2
    //   26: fadd
    //   27: ldc 200.0
    //   29: fdiv
    //   30: fstore #4
    //   32: fconst_0
    //   33: fstore #5
    //   35: fload #4
    //   37: ldc 0.8
    //   39: fcmpl
    //   40: ifle -> 53
    //   43: fload #4
    //   45: ldc 0.8
    //   47: fsub
    //   48: ldc 0.2
    //   50: fdiv
    //   51: fstore #5
    //   53: new java/util/Random
    //   56: dup
    //   57: ldc2_w 432
    //   60: invokespecial <init> : (J)V
    //   63: astore #6
    //   65: sipush #3553
    //   68: invokestatic glDisable : (I)V
    //   71: sipush #7425
    //   74: invokestatic glShadeModel : (I)V
    //   77: sipush #3042
    //   80: invokestatic glEnable : (I)V
    //   83: sipush #770
    //   86: iconst_1
    //   87: invokestatic glBlendFunc : (II)V
    //   90: sipush #3008
    //   93: invokestatic glDisable : (I)V
    //   96: sipush #2884
    //   99: invokestatic glEnable : (I)V
    //   102: iconst_0
    //   103: invokestatic glDepthMask : (Z)V
    //   106: invokestatic glPushMatrix : ()V
    //   109: fconst_0
    //   110: ldc -1.0
    //   112: ldc -2.0
    //   114: invokestatic glTranslatef : (FFF)V
    //   117: iconst_0
    //   118: istore #7
    //   120: iload #7
    //   122: i2f
    //   123: fload #4
    //   125: fload #4
    //   127: fload #4
    //   129: fmul
    //   130: fadd
    //   131: fconst_2
    //   132: fdiv
    //   133: ldc 60.0
    //   135: fmul
    //   136: fcmpg
    //   137: ifge -> 383
    //   140: aload #6
    //   142: invokevirtual nextFloat : ()F
    //   145: ldc 360.0
    //   147: fmul
    //   148: fconst_1
    //   149: fconst_0
    //   150: fconst_0
    //   151: invokestatic glRotatef : (FFFF)V
    //   154: aload #6
    //   156: invokevirtual nextFloat : ()F
    //   159: ldc 360.0
    //   161: fmul
    //   162: fconst_0
    //   163: fconst_1
    //   164: fconst_0
    //   165: invokestatic glRotatef : (FFFF)V
    //   168: aload #6
    //   170: invokevirtual nextFloat : ()F
    //   173: ldc 360.0
    //   175: fmul
    //   176: fconst_0
    //   177: fconst_0
    //   178: fconst_1
    //   179: invokestatic glRotatef : (FFFF)V
    //   182: aload #6
    //   184: invokevirtual nextFloat : ()F
    //   187: ldc 360.0
    //   189: fmul
    //   190: fconst_1
    //   191: fconst_0
    //   192: fconst_0
    //   193: invokestatic glRotatef : (FFFF)V
    //   196: aload #6
    //   198: invokevirtual nextFloat : ()F
    //   201: ldc 360.0
    //   203: fmul
    //   204: fconst_0
    //   205: fconst_1
    //   206: fconst_0
    //   207: invokestatic glRotatef : (FFFF)V
    //   210: aload #6
    //   212: invokevirtual nextFloat : ()F
    //   215: ldc 360.0
    //   217: fmul
    //   218: fload #4
    //   220: ldc 90.0
    //   222: fmul
    //   223: fadd
    //   224: fconst_0
    //   225: fconst_0
    //   226: fconst_1
    //   227: invokestatic glRotatef : (FFFF)V
    //   230: aload_3
    //   231: bipush #6
    //   233: invokevirtual Dne : (I)V
    //   236: aload #6
    //   238: invokevirtual nextFloat : ()F
    //   241: ldc 20.0
    //   243: fmul
    //   244: ldc 5.0
    //   246: fadd
    //   247: fload #5
    //   249: ldc 10.0
    //   251: fmul
    //   252: fadd
    //   253: fstore #8
    //   255: aload #6
    //   257: invokevirtual nextFloat : ()F
    //   260: fconst_2
    //   261: fmul
    //   262: fconst_1
    //   263: fadd
    //   264: fload #5
    //   266: fconst_2
    //   267: fmul
    //   268: fadd
    //   269: fstore #9
    //   271: aload_3
    //   272: ldc 16777215
    //   274: ldc 255.0
    //   276: fconst_1
    //   277: fload #5
    //   279: fsub
    //   280: fmul
    //   281: f2i
    //   282: invokevirtual Dne : (II)V
    //   285: aload_3
    //   286: dconst_0
    //   287: dconst_0
    //   288: dconst_0
    //   289: invokevirtual Dne : (DDD)V
    //   292: aload_3
    //   293: ldc 16711935
    //   295: iconst_0
    //   296: invokevirtual Dne : (II)V
    //   299: aload_3
    //   300: ldc2_w -0.866
    //   303: fload #9
    //   305: f2d
    //   306: dmul
    //   307: fload #8
    //   309: f2d
    //   310: ldc -0.5
    //   312: fload #9
    //   314: fmul
    //   315: f2d
    //   316: invokevirtual Dne : (DDD)V
    //   319: aload_3
    //   320: ldc2_w 0.866
    //   323: fload #9
    //   325: f2d
    //   326: dmul
    //   327: fload #8
    //   329: f2d
    //   330: ldc -0.5
    //   332: fload #9
    //   334: fmul
    //   335: f2d
    //   336: invokevirtual Dne : (DDD)V
    //   339: aload_3
    //   340: dconst_0
    //   341: fload #8
    //   343: f2d
    //   344: fconst_1
    //   345: fload #9
    //   347: fmul
    //   348: f2d
    //   349: invokevirtual Dne : (DDD)V
    //   352: aload_3
    //   353: ldc2_w -0.866
    //   356: fload #9
    //   358: f2d
    //   359: dmul
    //   360: fload #8
    //   362: f2d
    //   363: ldc -0.5
    //   365: fload #9
    //   367: fmul
    //   368: f2d
    //   369: invokevirtual Dne : (DDD)V
    //   372: aload_3
    //   373: invokevirtual Dne : ()I
    //   376: pop
    //   377: iinc #7, 1
    //   380: goto -> 120
    //   383: invokestatic glPopMatrix : ()V
    //   386: iconst_1
    //   387: invokestatic glDepthMask : (Z)V
    //   390: sipush #2884
    //   393: invokestatic glDisable : (I)V
    //   396: sipush #3042
    //   399: invokestatic glDisable : (I)V
    //   402: sipush #7424
    //   405: invokestatic glShadeModel : (I)V
    //   408: fconst_1
    //   409: fconst_1
    //   410: fconst_1
    //   411: fconst_1
    //   412: invokestatic glColor4f : (FFFF)V
    //   415: sipush #3553
    //   418: invokestatic glEnable : (I)V
    //   421: sipush #3008
    //   424: invokestatic glEnable : (I)V
    //   427: invokestatic FWm : ()V
    //   430: return
  }
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    Dne((WSC)paramFUH, paramFloat1, paramFloat2, paramFloat3);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((WSC)paramFUH, paramInt, paramFloat);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne((WSC)paramFUH, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((WSC)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((WSC)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected int Dne(WSC paramWSC, int paramInt, float paramFloat) {
    if (paramInt == 1)
      GL11.glDepthFunc(515); 
    if (paramInt != 0)
      return -1; 
    Dne("/mob/enderdragon/ender_eyes.png");
    float f = 1.0F;
    GL11.glEnable(3042);
    GL11.glDisable(3008);
    GL11.glBlendFunc(1, 1);
    GL11.glDisable(2896);
    GL11.glDepthFunc(514);
    char c = '';
    int i = c % 65536;
    int j = c / 65536;
    oCF.Dne(oCF.FWm, i / 1.0F, j / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glEnable(2896);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
    return 1;
  }
  
  public JOY() {
    super(new Drf(0.0F), 0.5F);
    Dne(this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JOY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */