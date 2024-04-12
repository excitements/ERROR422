import org.lwjgl.opengl.GL11;

public abstract class QCe {
  protected ptH Dne;
  
  protected zVu Dne;
  
  protected float FWm;
  
  private Gor Dne;
  
  protected float Dne = new Sgm();
  
  public QCe() {
    this.Dne = new zVu();
    this.Dne = 0.0F;
    this.FWm = 1.0F;
  }
  
  private Qnq Dne() {
    return (Qnq)this.Dne.Dne;
  }
  
  public void FWm(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LptH;
    //   4: getfield Dne : LfZI;
    //   7: getfield aFZ : Z
    //   10: ifeq -> 88
    //   13: aload_0
    //   14: getfield Dne : F
    //   17: fconst_0
    //   18: fcmpl
    //   19: ifle -> 88
    //   22: aload_1
    //   23: invokevirtual Vxn : ()Z
    //   26: ifne -> 88
    //   29: aload_0
    //   30: getfield Dne : LptH;
    //   33: aload_1
    //   34: getfield div : D
    //   37: aload_1
    //   38: getfield IjH : D
    //   41: aload_1
    //   42: getfield mrb : D
    //   45: invokevirtual Dne : (DDD)D
    //   48: dstore #10
    //   50: dconst_1
    //   51: dload #10
    //   53: ldc2_w 256.0
    //   56: ddiv
    //   57: dsub
    //   58: aload_0
    //   59: getfield FWm : F
    //   62: f2d
    //   63: dmul
    //   64: d2f
    //   65: fstore #12
    //   67: fload #12
    //   69: fconst_0
    //   70: fcmpl
    //   71: ifle -> 88
    //   74: aload_0
    //   75: aload_1
    //   76: dload_2
    //   77: dload #4
    //   79: dload #6
    //   81: fload #12
    //   83: fload #9
    //   85: invokespecial bzF : (LsMa;DDDFF)V
    //   88: aload_1
    //   89: invokevirtual OdI : ()Z
    //   92: ifeq -> 107
    //   95: aload_0
    //   96: aload_1
    //   97: dload_2
    //   98: dload #4
    //   100: dload #6
    //   102: fload #9
    //   104: invokespecial Dne : (LsMa;DDDF)V
    //   107: return
  }
  
  public static void Dne(bSp parambSp, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: sipush #3553
    //   3: invokestatic glDisable : (I)V
    //   6: getstatic WAR.Dne : LWAR;
    //   9: astore #7
    //   11: fconst_1
    //   12: fconst_1
    //   13: fconst_1
    //   14: fconst_1
    //   15: invokestatic glColor4f : (FFFF)V
    //   18: aload #7
    //   20: invokevirtual Dne : ()V
    //   23: aload #7
    //   25: dload_1
    //   26: dload_3
    //   27: dload #5
    //   29: invokevirtual FWm : (DDD)V
    //   32: aload #7
    //   34: fconst_0
    //   35: fconst_0
    //   36: ldc -1.0
    //   38: invokevirtual FWm : (FFF)V
    //   41: aload #7
    //   43: aload_0
    //   44: getfield Dne : D
    //   47: aload_0
    //   48: getfield aFZ : D
    //   51: aload_0
    //   52: getfield bzF : D
    //   55: invokevirtual Dne : (DDD)V
    //   58: aload #7
    //   60: aload_0
    //   61: getfield Qnq : D
    //   64: aload_0
    //   65: getfield aFZ : D
    //   68: aload_0
    //   69: getfield bzF : D
    //   72: invokevirtual Dne : (DDD)V
    //   75: aload #7
    //   77: aload_0
    //   78: getfield Qnq : D
    //   81: aload_0
    //   82: getfield FWm : D
    //   85: aload_0
    //   86: getfield bzF : D
    //   89: invokevirtual Dne : (DDD)V
    //   92: aload #7
    //   94: aload_0
    //   95: getfield Dne : D
    //   98: aload_0
    //   99: getfield FWm : D
    //   102: aload_0
    //   103: getfield bzF : D
    //   106: invokevirtual Dne : (DDD)V
    //   109: aload #7
    //   111: fconst_0
    //   112: fconst_0
    //   113: fconst_1
    //   114: invokevirtual FWm : (FFF)V
    //   117: aload #7
    //   119: aload_0
    //   120: getfield Dne : D
    //   123: aload_0
    //   124: getfield FWm : D
    //   127: aload_0
    //   128: getfield zGp : D
    //   131: invokevirtual Dne : (DDD)V
    //   134: aload #7
    //   136: aload_0
    //   137: getfield Qnq : D
    //   140: aload_0
    //   141: getfield FWm : D
    //   144: aload_0
    //   145: getfield zGp : D
    //   148: invokevirtual Dne : (DDD)V
    //   151: aload #7
    //   153: aload_0
    //   154: getfield Qnq : D
    //   157: aload_0
    //   158: getfield aFZ : D
    //   161: aload_0
    //   162: getfield zGp : D
    //   165: invokevirtual Dne : (DDD)V
    //   168: aload #7
    //   170: aload_0
    //   171: getfield Dne : D
    //   174: aload_0
    //   175: getfield aFZ : D
    //   178: aload_0
    //   179: getfield zGp : D
    //   182: invokevirtual Dne : (DDD)V
    //   185: aload #7
    //   187: fconst_0
    //   188: ldc -1.0
    //   190: fconst_0
    //   191: invokevirtual FWm : (FFF)V
    //   194: aload #7
    //   196: aload_0
    //   197: getfield Dne : D
    //   200: aload_0
    //   201: getfield FWm : D
    //   204: aload_0
    //   205: getfield bzF : D
    //   208: invokevirtual Dne : (DDD)V
    //   211: aload #7
    //   213: aload_0
    //   214: getfield Qnq : D
    //   217: aload_0
    //   218: getfield FWm : D
    //   221: aload_0
    //   222: getfield bzF : D
    //   225: invokevirtual Dne : (DDD)V
    //   228: aload #7
    //   230: aload_0
    //   231: getfield Qnq : D
    //   234: aload_0
    //   235: getfield FWm : D
    //   238: aload_0
    //   239: getfield zGp : D
    //   242: invokevirtual Dne : (DDD)V
    //   245: aload #7
    //   247: aload_0
    //   248: getfield Dne : D
    //   251: aload_0
    //   252: getfield FWm : D
    //   255: aload_0
    //   256: getfield zGp : D
    //   259: invokevirtual Dne : (DDD)V
    //   262: aload #7
    //   264: fconst_0
    //   265: fconst_1
    //   266: fconst_0
    //   267: invokevirtual FWm : (FFF)V
    //   270: aload #7
    //   272: aload_0
    //   273: getfield Dne : D
    //   276: aload_0
    //   277: getfield aFZ : D
    //   280: aload_0
    //   281: getfield zGp : D
    //   284: invokevirtual Dne : (DDD)V
    //   287: aload #7
    //   289: aload_0
    //   290: getfield Qnq : D
    //   293: aload_0
    //   294: getfield aFZ : D
    //   297: aload_0
    //   298: getfield zGp : D
    //   301: invokevirtual Dne : (DDD)V
    //   304: aload #7
    //   306: aload_0
    //   307: getfield Qnq : D
    //   310: aload_0
    //   311: getfield aFZ : D
    //   314: aload_0
    //   315: getfield bzF : D
    //   318: invokevirtual Dne : (DDD)V
    //   321: aload #7
    //   323: aload_0
    //   324: getfield Dne : D
    //   327: aload_0
    //   328: getfield aFZ : D
    //   331: aload_0
    //   332: getfield bzF : D
    //   335: invokevirtual Dne : (DDD)V
    //   338: aload #7
    //   340: ldc -1.0
    //   342: fconst_0
    //   343: fconst_0
    //   344: invokevirtual FWm : (FFF)V
    //   347: aload #7
    //   349: aload_0
    //   350: getfield Dne : D
    //   353: aload_0
    //   354: getfield FWm : D
    //   357: aload_0
    //   358: getfield zGp : D
    //   361: invokevirtual Dne : (DDD)V
    //   364: aload #7
    //   366: aload_0
    //   367: getfield Dne : D
    //   370: aload_0
    //   371: getfield aFZ : D
    //   374: aload_0
    //   375: getfield zGp : D
    //   378: invokevirtual Dne : (DDD)V
    //   381: aload #7
    //   383: aload_0
    //   384: getfield Dne : D
    //   387: aload_0
    //   388: getfield aFZ : D
    //   391: aload_0
    //   392: getfield bzF : D
    //   395: invokevirtual Dne : (DDD)V
    //   398: aload #7
    //   400: aload_0
    //   401: getfield Dne : D
    //   404: aload_0
    //   405: getfield FWm : D
    //   408: aload_0
    //   409: getfield bzF : D
    //   412: invokevirtual Dne : (DDD)V
    //   415: aload #7
    //   417: fconst_1
    //   418: fconst_0
    //   419: fconst_0
    //   420: invokevirtual FWm : (FFF)V
    //   423: aload #7
    //   425: aload_0
    //   426: getfield Qnq : D
    //   429: aload_0
    //   430: getfield FWm : D
    //   433: aload_0
    //   434: getfield bzF : D
    //   437: invokevirtual Dne : (DDD)V
    //   440: aload #7
    //   442: aload_0
    //   443: getfield Qnq : D
    //   446: aload_0
    //   447: getfield aFZ : D
    //   450: aload_0
    //   451: getfield bzF : D
    //   454: invokevirtual Dne : (DDD)V
    //   457: aload #7
    //   459: aload_0
    //   460: getfield Qnq : D
    //   463: aload_0
    //   464: getfield aFZ : D
    //   467: aload_0
    //   468: getfield zGp : D
    //   471: invokevirtual Dne : (DDD)V
    //   474: aload #7
    //   476: aload_0
    //   477: getfield Qnq : D
    //   480: aload_0
    //   481: getfield FWm : D
    //   484: aload_0
    //   485: getfield zGp : D
    //   488: invokevirtual Dne : (DDD)V
    //   491: aload #7
    //   493: dconst_0
    //   494: dconst_0
    //   495: dconst_0
    //   496: invokevirtual FWm : (DDD)V
    //   499: aload #7
    //   501: invokevirtual Dne : ()I
    //   504: pop
    //   505: sipush #3553
    //   508: invokestatic glEnable : (I)V
    //   511: return
  }
  
  private void Dne(zKP paramzKP, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #19
    //   5: aload_1
    //   6: invokevirtual Dne : ()Z
    //   9: ifeq -> 293
    //   12: fload #11
    //   14: f2d
    //   15: dload #4
    //   17: iload #9
    //   19: i2d
    //   20: dload #15
    //   22: dadd
    //   23: dsub
    //   24: ldc2_w 2.0
    //   27: ddiv
    //   28: dsub
    //   29: ldc2_w 0.5
    //   32: dmul
    //   33: aload_0
    //   34: invokespecial Dne : ()LQnq;
    //   37: iload #8
    //   39: iload #9
    //   41: iload #10
    //   43: invokevirtual Dne : (III)F
    //   46: f2d
    //   47: dmul
    //   48: dstore #20
    //   50: dload #20
    //   52: dconst_0
    //   53: dcmpl
    //   54: iflt -> 293
    //   57: dload #20
    //   59: dconst_1
    //   60: dcmpl
    //   61: ifle -> 67
    //   64: dconst_1
    //   65: dstore #20
    //   67: aload #19
    //   69: fconst_1
    //   70: fconst_1
    //   71: fconst_1
    //   72: dload #20
    //   74: d2f
    //   75: invokevirtual Dne : (FFFF)V
    //   78: iload #8
    //   80: i2d
    //   81: aload_1
    //   82: invokevirtual Dne : ()D
    //   85: dadd
    //   86: dload #13
    //   88: dadd
    //   89: dstore #22
    //   91: iload #8
    //   93: i2d
    //   94: aload_1
    //   95: invokevirtual FWm : ()D
    //   98: dadd
    //   99: dload #13
    //   101: dadd
    //   102: dstore #24
    //   104: iload #9
    //   106: i2d
    //   107: aload_1
    //   108: invokevirtual bzF : ()D
    //   111: dadd
    //   112: dload #15
    //   114: dadd
    //   115: ldc2_w 0.015625
    //   118: dadd
    //   119: dstore #26
    //   121: iload #10
    //   123: i2d
    //   124: aload_1
    //   125: invokevirtual aFZ : ()D
    //   128: dadd
    //   129: dload #17
    //   131: dadd
    //   132: dstore #28
    //   134: iload #10
    //   136: i2d
    //   137: aload_1
    //   138: invokevirtual zGp : ()D
    //   141: dadd
    //   142: dload #17
    //   144: dadd
    //   145: dstore #30
    //   147: dload_2
    //   148: dload #22
    //   150: dsub
    //   151: ldc2_w 2.0
    //   154: ddiv
    //   155: fload #12
    //   157: f2d
    //   158: ddiv
    //   159: ldc2_w 0.5
    //   162: dadd
    //   163: d2f
    //   164: fstore #32
    //   166: dload_2
    //   167: dload #24
    //   169: dsub
    //   170: ldc2_w 2.0
    //   173: ddiv
    //   174: fload #12
    //   176: f2d
    //   177: ddiv
    //   178: ldc2_w 0.5
    //   181: dadd
    //   182: d2f
    //   183: fstore #33
    //   185: dload #6
    //   187: dload #28
    //   189: dsub
    //   190: ldc2_w 2.0
    //   193: ddiv
    //   194: fload #12
    //   196: f2d
    //   197: ddiv
    //   198: ldc2_w 0.5
    //   201: dadd
    //   202: d2f
    //   203: fstore #34
    //   205: dload #6
    //   207: dload #30
    //   209: dsub
    //   210: ldc2_w 2.0
    //   213: ddiv
    //   214: fload #12
    //   216: f2d
    //   217: ddiv
    //   218: ldc2_w 0.5
    //   221: dadd
    //   222: d2f
    //   223: fstore #35
    //   225: aload #19
    //   227: dload #22
    //   229: dload #26
    //   231: dload #28
    //   233: fload #32
    //   235: f2d
    //   236: fload #34
    //   238: f2d
    //   239: invokevirtual Dne : (DDDDD)V
    //   242: aload #19
    //   244: dload #22
    //   246: dload #26
    //   248: dload #30
    //   250: fload #32
    //   252: f2d
    //   253: fload #35
    //   255: f2d
    //   256: invokevirtual Dne : (DDDDD)V
    //   259: aload #19
    //   261: dload #24
    //   263: dload #26
    //   265: dload #30
    //   267: fload #33
    //   269: f2d
    //   270: fload #35
    //   272: f2d
    //   273: invokevirtual Dne : (DDDDD)V
    //   276: aload #19
    //   278: dload #24
    //   280: dload #26
    //   282: dload #28
    //   284: fload #33
    //   286: f2d
    //   287: fload #34
    //   289: f2d
    //   290: invokevirtual Dne : (DDDDD)V
    //   293: return
  }
  
  protected void Dne(String paramString) {
    this.Dne.Dne.Dne(paramString);
  }
  
  public msA Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LptH;
    //   4: invokevirtual Dne : ()LmsA;
    //   7: areturn
  }
  
  public static void Dne(bSp parambSp) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore_1
    //   4: aload_1
    //   5: invokevirtual Dne : ()V
    //   8: aload_1
    //   9: aload_0
    //   10: getfield Dne : D
    //   13: aload_0
    //   14: getfield aFZ : D
    //   17: aload_0
    //   18: getfield bzF : D
    //   21: invokevirtual Dne : (DDD)V
    //   24: aload_1
    //   25: aload_0
    //   26: getfield Qnq : D
    //   29: aload_0
    //   30: getfield aFZ : D
    //   33: aload_0
    //   34: getfield bzF : D
    //   37: invokevirtual Dne : (DDD)V
    //   40: aload_1
    //   41: aload_0
    //   42: getfield Qnq : D
    //   45: aload_0
    //   46: getfield FWm : D
    //   49: aload_0
    //   50: getfield bzF : D
    //   53: invokevirtual Dne : (DDD)V
    //   56: aload_1
    //   57: aload_0
    //   58: getfield Dne : D
    //   61: aload_0
    //   62: getfield FWm : D
    //   65: aload_0
    //   66: getfield bzF : D
    //   69: invokevirtual Dne : (DDD)V
    //   72: aload_1
    //   73: aload_0
    //   74: getfield Dne : D
    //   77: aload_0
    //   78: getfield FWm : D
    //   81: aload_0
    //   82: getfield zGp : D
    //   85: invokevirtual Dne : (DDD)V
    //   88: aload_1
    //   89: aload_0
    //   90: getfield Qnq : D
    //   93: aload_0
    //   94: getfield FWm : D
    //   97: aload_0
    //   98: getfield zGp : D
    //   101: invokevirtual Dne : (DDD)V
    //   104: aload_1
    //   105: aload_0
    //   106: getfield Qnq : D
    //   109: aload_0
    //   110: getfield aFZ : D
    //   113: aload_0
    //   114: getfield zGp : D
    //   117: invokevirtual Dne : (DDD)V
    //   120: aload_1
    //   121: aload_0
    //   122: getfield Dne : D
    //   125: aload_0
    //   126: getfield aFZ : D
    //   129: aload_0
    //   130: getfield zGp : D
    //   133: invokevirtual Dne : (DDD)V
    //   136: aload_1
    //   137: aload_0
    //   138: getfield Dne : D
    //   141: aload_0
    //   142: getfield FWm : D
    //   145: aload_0
    //   146: getfield bzF : D
    //   149: invokevirtual Dne : (DDD)V
    //   152: aload_1
    //   153: aload_0
    //   154: getfield Qnq : D
    //   157: aload_0
    //   158: getfield FWm : D
    //   161: aload_0
    //   162: getfield bzF : D
    //   165: invokevirtual Dne : (DDD)V
    //   168: aload_1
    //   169: aload_0
    //   170: getfield Qnq : D
    //   173: aload_0
    //   174: getfield FWm : D
    //   177: aload_0
    //   178: getfield zGp : D
    //   181: invokevirtual Dne : (DDD)V
    //   184: aload_1
    //   185: aload_0
    //   186: getfield Dne : D
    //   189: aload_0
    //   190: getfield FWm : D
    //   193: aload_0
    //   194: getfield zGp : D
    //   197: invokevirtual Dne : (DDD)V
    //   200: aload_1
    //   201: aload_0
    //   202: getfield Dne : D
    //   205: aload_0
    //   206: getfield aFZ : D
    //   209: aload_0
    //   210: getfield zGp : D
    //   213: invokevirtual Dne : (DDD)V
    //   216: aload_1
    //   217: aload_0
    //   218: getfield Qnq : D
    //   221: aload_0
    //   222: getfield aFZ : D
    //   225: aload_0
    //   226: getfield zGp : D
    //   229: invokevirtual Dne : (DDD)V
    //   232: aload_1
    //   233: aload_0
    //   234: getfield Qnq : D
    //   237: aload_0
    //   238: getfield aFZ : D
    //   241: aload_0
    //   242: getfield bzF : D
    //   245: invokevirtual Dne : (DDD)V
    //   248: aload_1
    //   249: aload_0
    //   250: getfield Dne : D
    //   253: aload_0
    //   254: getfield aFZ : D
    //   257: aload_0
    //   258: getfield bzF : D
    //   261: invokevirtual Dne : (DDD)V
    //   264: aload_1
    //   265: aload_0
    //   266: getfield Dne : D
    //   269: aload_0
    //   270: getfield FWm : D
    //   273: aload_0
    //   274: getfield zGp : D
    //   277: invokevirtual Dne : (DDD)V
    //   280: aload_1
    //   281: aload_0
    //   282: getfield Dne : D
    //   285: aload_0
    //   286: getfield aFZ : D
    //   289: aload_0
    //   290: getfield zGp : D
    //   293: invokevirtual Dne : (DDD)V
    //   296: aload_1
    //   297: aload_0
    //   298: getfield Dne : D
    //   301: aload_0
    //   302: getfield aFZ : D
    //   305: aload_0
    //   306: getfield bzF : D
    //   309: invokevirtual Dne : (DDD)V
    //   312: aload_1
    //   313: aload_0
    //   314: getfield Dne : D
    //   317: aload_0
    //   318: getfield FWm : D
    //   321: aload_0
    //   322: getfield bzF : D
    //   325: invokevirtual Dne : (DDD)V
    //   328: aload_1
    //   329: aload_0
    //   330: getfield Qnq : D
    //   333: aload_0
    //   334: getfield FWm : D
    //   337: aload_0
    //   338: getfield bzF : D
    //   341: invokevirtual Dne : (DDD)V
    //   344: aload_1
    //   345: aload_0
    //   346: getfield Qnq : D
    //   349: aload_0
    //   350: getfield aFZ : D
    //   353: aload_0
    //   354: getfield bzF : D
    //   357: invokevirtual Dne : (DDD)V
    //   360: aload_1
    //   361: aload_0
    //   362: getfield Qnq : D
    //   365: aload_0
    //   366: getfield aFZ : D
    //   369: aload_0
    //   370: getfield zGp : D
    //   373: invokevirtual Dne : (DDD)V
    //   376: aload_1
    //   377: aload_0
    //   378: getfield Qnq : D
    //   381: aload_0
    //   382: getfield FWm : D
    //   385: aload_0
    //   386: getfield zGp : D
    //   389: invokevirtual Dne : (DDD)V
    //   392: aload_1
    //   393: invokevirtual Dne : ()I
    //   396: pop
    //   397: return
  }
  
  public void Dne(Rbp paramRbp) {}
  
  protected boolean Dne(String paramString1, String paramString2) {
    msA msA = this.Dne.Dne;
    int i = msA.Dne(paramString1, paramString2);
    if (i >= 0) {
      GL11.glBindTexture(3553, i);
      msA.Dne();
      return true;
    } 
    return false;
  }
  
  public abstract void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);
  
  private void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    // Byte code:
    //   0: sipush #2896
    //   3: invokestatic glDisable : (I)V
    //   6: getstatic zKP.Dne : Liqp;
    //   9: iconst_0
    //   10: invokevirtual Dne : (I)LgDn;
    //   13: astore #9
    //   15: getstatic zKP.Dne : Liqp;
    //   18: iconst_1
    //   19: invokevirtual Dne : (I)LgDn;
    //   22: astore #10
    //   24: invokestatic glPushMatrix : ()V
    //   27: dload_2
    //   28: d2f
    //   29: dload #4
    //   31: d2f
    //   32: dload #6
    //   34: d2f
    //   35: invokestatic glTranslatef : (FFF)V
    //   38: aload_1
    //   39: getfield ooe : F
    //   42: ldc 1.4
    //   44: fmul
    //   45: fstore #11
    //   47: fload #11
    //   49: fload #11
    //   51: fload #11
    //   53: invokestatic glScalef : (FFF)V
    //   56: aload_0
    //   57: ldc '/terrain.png'
    //   59: invokevirtual Dne : (Ljava/lang/String;)V
    //   62: getstatic WAR.Dne : LWAR;
    //   65: astore #12
    //   67: ldc 0.5
    //   69: fstore #13
    //   71: fconst_0
    //   72: fstore #14
    //   74: aload_1
    //   75: getfield trS : F
    //   78: fload #11
    //   80: fdiv
    //   81: fstore #15
    //   83: aload_1
    //   84: getfield IjH : D
    //   87: aload_1
    //   88: getfield Dne : LbSp;
    //   91: getfield FWm : D
    //   94: dsub
    //   95: d2f
    //   96: fstore #16
    //   98: aload_0
    //   99: getfield Dne : LptH;
    //   102: getfield Dne : F
    //   105: fneg
    //   106: fconst_0
    //   107: fconst_1
    //   108: fconst_0
    //   109: invokestatic glRotatef : (FFFF)V
    //   112: fconst_0
    //   113: fconst_0
    //   114: ldc -0.3
    //   116: fload #15
    //   118: f2i
    //   119: i2f
    //   120: ldc 0.02
    //   122: fmul
    //   123: fadd
    //   124: invokestatic glTranslatef : (FFF)V
    //   127: fconst_1
    //   128: fconst_1
    //   129: fconst_1
    //   130: fconst_1
    //   131: invokestatic glColor4f : (FFFF)V
    //   134: fconst_0
    //   135: fstore #17
    //   137: iconst_0
    //   138: istore #18
    //   140: aload #12
    //   142: invokevirtual Dne : ()V
    //   145: fload #15
    //   147: fconst_0
    //   148: fcmpl
    //   149: ifle -> 365
    //   152: iload #18
    //   154: iconst_2
    //   155: irem
    //   156: ifne -> 166
    //   159: aload #9
    //   161: astore #19
    //   163: goto -> 170
    //   166: aload #10
    //   168: astore #19
    //   170: aload #19
    //   172: invokeinterface Dne : ()F
    //   177: fstore #20
    //   179: aload #19
    //   181: invokeinterface bzF : ()F
    //   186: fstore #21
    //   188: aload #19
    //   190: invokeinterface FWm : ()F
    //   195: fstore #22
    //   197: aload #19
    //   199: invokeinterface Qnq : ()F
    //   204: fstore #23
    //   206: iload #18
    //   208: iconst_2
    //   209: idiv
    //   210: iconst_2
    //   211: irem
    //   212: ifne -> 227
    //   215: fload #22
    //   217: fstore #24
    //   219: fload #20
    //   221: fstore #22
    //   223: fload #24
    //   225: fstore #20
    //   227: aload #12
    //   229: fload #13
    //   231: fload #14
    //   233: fsub
    //   234: f2d
    //   235: fconst_0
    //   236: fload #16
    //   238: fsub
    //   239: f2d
    //   240: fload #17
    //   242: f2d
    //   243: fload #22
    //   245: f2d
    //   246: fload #23
    //   248: f2d
    //   249: invokevirtual Dne : (DDDDD)V
    //   252: aload #12
    //   254: fload #13
    //   256: fneg
    //   257: fload #14
    //   259: fsub
    //   260: f2d
    //   261: fconst_0
    //   262: fload #16
    //   264: fsub
    //   265: f2d
    //   266: fload #17
    //   268: f2d
    //   269: fload #20
    //   271: f2d
    //   272: fload #23
    //   274: f2d
    //   275: invokevirtual Dne : (DDDDD)V
    //   278: aload #12
    //   280: fload #13
    //   282: fneg
    //   283: fload #14
    //   285: fsub
    //   286: f2d
    //   287: ldc 1.4
    //   289: fload #16
    //   291: fsub
    //   292: f2d
    //   293: fload #17
    //   295: f2d
    //   296: fload #20
    //   298: f2d
    //   299: fload #21
    //   301: f2d
    //   302: invokevirtual Dne : (DDDDD)V
    //   305: aload #12
    //   307: fload #13
    //   309: fload #14
    //   311: fsub
    //   312: f2d
    //   313: ldc 1.4
    //   315: fload #16
    //   317: fsub
    //   318: f2d
    //   319: fload #17
    //   321: f2d
    //   322: fload #22
    //   324: f2d
    //   325: fload #21
    //   327: f2d
    //   328: invokevirtual Dne : (DDDDD)V
    //   331: fload #15
    //   333: ldc 0.45
    //   335: fsub
    //   336: fstore #15
    //   338: fload #16
    //   340: ldc 0.45
    //   342: fsub
    //   343: fstore #16
    //   345: fload #13
    //   347: ldc 0.9
    //   349: fmul
    //   350: fstore #13
    //   352: fload #17
    //   354: ldc 0.03
    //   356: fadd
    //   357: fstore #17
    //   359: iinc #18, 1
    //   362: goto -> 145
    //   365: aload #12
    //   367: invokevirtual Dne : ()I
    //   370: pop
    //   371: invokestatic glPopMatrix : ()V
    //   374: sipush #2896
    //   377: invokestatic glEnable : (I)V
    //   380: return
  }
  
  public void Dne(ptH paramptH) {
    this.Dne = paramptH;
  }
  
  private void bzF(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: sipush #3042
    //   3: invokestatic glEnable : (I)V
    //   6: sipush #770
    //   9: sipush #771
    //   12: invokestatic glBlendFunc : (II)V
    //   15: aload_0
    //   16: getfield Dne : LptH;
    //   19: getfield Dne : LSnh;
    //   22: ldc '%clamp%/misc/shadow.png'
    //   24: invokevirtual Dne : (Ljava/lang/String;)V
    //   27: aload_0
    //   28: invokespecial Dne : ()LQnq;
    //   31: astore #10
    //   33: iconst_0
    //   34: invokestatic glDepthMask : (Z)V
    //   37: aload_0
    //   38: getfield Dne : F
    //   41: fstore #11
    //   43: aload_1
    //   44: instanceof FUH
    //   47: ifeq -> 81
    //   50: aload_1
    //   51: checkcast FUH
    //   54: astore #12
    //   56: fload #11
    //   58: aload #12
    //   60: invokevirtual IjH : ()F
    //   63: fmul
    //   64: fstore #11
    //   66: aload #12
    //   68: invokevirtual IjH : ()Z
    //   71: ifeq -> 81
    //   74: fload #11
    //   76: ldc 0.5
    //   78: fmul
    //   79: fstore #11
    //   81: aload_1
    //   82: getfield udO : D
    //   85: aload_1
    //   86: getfield div : D
    //   89: aload_1
    //   90: getfield udO : D
    //   93: dsub
    //   94: fload #9
    //   96: f2d
    //   97: dmul
    //   98: dadd
    //   99: dstore #12
    //   101: aload_1
    //   102: getfield ooe : D
    //   105: aload_1
    //   106: getfield IjH : D
    //   109: aload_1
    //   110: getfield ooe : D
    //   113: dsub
    //   114: fload #9
    //   116: f2d
    //   117: dmul
    //   118: dadd
    //   119: aload_1
    //   120: invokevirtual Dne : ()F
    //   123: f2d
    //   124: dadd
    //   125: dstore #14
    //   127: aload_1
    //   128: getfield trS : D
    //   131: aload_1
    //   132: getfield mrb : D
    //   135: aload_1
    //   136: getfield trS : D
    //   139: dsub
    //   140: fload #9
    //   142: f2d
    //   143: dmul
    //   144: dadd
    //   145: dstore #16
    //   147: dload #12
    //   149: fload #11
    //   151: f2d
    //   152: dsub
    //   153: invokestatic FWm : (D)I
    //   156: istore #18
    //   158: dload #12
    //   160: fload #11
    //   162: f2d
    //   163: dadd
    //   164: invokestatic FWm : (D)I
    //   167: istore #19
    //   169: dload #14
    //   171: fload #11
    //   173: f2d
    //   174: dsub
    //   175: invokestatic FWm : (D)I
    //   178: istore #20
    //   180: dload #14
    //   182: invokestatic FWm : (D)I
    //   185: istore #21
    //   187: dload #16
    //   189: fload #11
    //   191: f2d
    //   192: dsub
    //   193: invokestatic FWm : (D)I
    //   196: istore #22
    //   198: dload #16
    //   200: fload #11
    //   202: f2d
    //   203: dadd
    //   204: invokestatic FWm : (D)I
    //   207: istore #23
    //   209: dload_2
    //   210: dload #12
    //   212: dsub
    //   213: dstore #24
    //   215: dload #4
    //   217: dload #14
    //   219: dsub
    //   220: dstore #26
    //   222: dload #6
    //   224: dload #16
    //   226: dsub
    //   227: dstore #28
    //   229: getstatic WAR.Dne : LWAR;
    //   232: astore #30
    //   234: aload #30
    //   236: invokevirtual Dne : ()V
    //   239: iload #18
    //   241: istore #31
    //   243: iload #31
    //   245: iload #19
    //   247: if_icmpgt -> 368
    //   250: iload #20
    //   252: istore #32
    //   254: iload #32
    //   256: iload #21
    //   258: if_icmpgt -> 362
    //   261: iload #22
    //   263: istore #33
    //   265: iload #33
    //   267: iload #23
    //   269: if_icmpgt -> 356
    //   272: aload #10
    //   274: iload #31
    //   276: iload #32
    //   278: iconst_1
    //   279: isub
    //   280: iload #33
    //   282: invokevirtual Dne : (III)I
    //   285: istore #34
    //   287: iload #34
    //   289: ifle -> 350
    //   292: aload #10
    //   294: iload #31
    //   296: iload #32
    //   298: iload #33
    //   300: invokevirtual aFZ : (III)I
    //   303: iconst_3
    //   304: if_icmple -> 350
    //   307: aload_0
    //   308: getstatic zKP.Dne : [LzKP;
    //   311: iload #34
    //   313: aaload
    //   314: dload_2
    //   315: dload #4
    //   317: aload_1
    //   318: invokevirtual Dne : ()F
    //   321: f2d
    //   322: dadd
    //   323: dload #6
    //   325: iload #31
    //   327: iload #32
    //   329: iload #33
    //   331: fload #8
    //   333: fload #11
    //   335: dload #24
    //   337: dload #26
    //   339: aload_1
    //   340: invokevirtual Dne : ()F
    //   343: f2d
    //   344: dadd
    //   345: dload #28
    //   347: invokespecial Dne : (LzKP;DDDIIIFFDDD)V
    //   350: iinc #33, 1
    //   353: goto -> 265
    //   356: iinc #32, 1
    //   359: goto -> 254
    //   362: iinc #31, 1
    //   365: goto -> 243
    //   368: aload #30
    //   370: invokevirtual Dne : ()I
    //   373: pop
    //   374: fconst_1
    //   375: fconst_1
    //   376: fconst_1
    //   377: fconst_1
    //   378: invokestatic glColor4f : (FFFF)V
    //   381: sipush #3042
    //   384: invokestatic glDisable : (I)V
    //   387: iconst_1
    //   388: invokestatic glDepthMask : (Z)V
    //   391: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QCe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */