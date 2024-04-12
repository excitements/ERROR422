import java.util.Random;
import org.lwjgl.opengl.GL11;

public class eKj extends QCe {
  public float bzF;
  
  private zVu FWm = new zVu();
  
  public static boolean FWm = false;
  
  private Random Dne;
  
  public boolean Dne = new Random();
  
  public void bzF(msA parammsA, Snh paramSnh, NMq paramNMq, int paramInt1, int paramInt2) {
    Dne(parammsA, paramSnh, paramNMq, paramInt1, paramInt2, (String)null);
  }
  
  private void Dne(JiM paramJiM, gDn paramgDn, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #8
    //   5: aload_2
    //   6: ifnonnull -> 27
    //   9: aload_0
    //   10: getfield Dne : LptH;
    //   13: getfield Dne : LSnh;
    //   16: aload_1
    //   17: invokevirtual Dne : ()LNMq;
    //   20: invokevirtual Dne : ()I
    //   23: invokevirtual Dne : (I)LgDn;
    //   26: astore_2
    //   27: aload_2
    //   28: invokeinterface Dne : ()F
    //   33: fstore #9
    //   35: aload_2
    //   36: invokeinterface FWm : ()F
    //   41: fstore #10
    //   43: aload_2
    //   44: invokeinterface bzF : ()F
    //   49: fstore #11
    //   51: aload_2
    //   52: invokeinterface Qnq : ()F
    //   57: fstore #12
    //   59: fconst_1
    //   60: fstore #13
    //   62: ldc 0.5
    //   64: fstore #14
    //   66: ldc 0.25
    //   68: fstore #15
    //   70: aload_0
    //   71: getfield Dne : LptH;
    //   74: getfield Dne : LfZI;
    //   77: getfield aFZ : Z
    //   80: ifeq -> 549
    //   83: invokestatic glPushMatrix : ()V
    //   86: getstatic eKj.FWm : Z
    //   89: ifeq -> 103
    //   92: ldc 180.0
    //   94: fconst_0
    //   95: fconst_1
    //   96: fconst_0
    //   97: invokestatic glRotatef : (FFFF)V
    //   100: goto -> 128
    //   103: aload_1
    //   104: getfield Dne : I
    //   107: i2f
    //   108: fload #4
    //   110: fadd
    //   111: ldc 20.0
    //   113: fdiv
    //   114: aload_1
    //   115: getfield Dne : F
    //   118: fadd
    //   119: ldc 57.295776
    //   121: fmul
    //   122: fconst_0
    //   123: fconst_1
    //   124: fconst_0
    //   125: invokestatic glRotatef : (FFFF)V
    //   128: ldc 0.0625
    //   130: fstore #17
    //   132: ldc 0.021875
    //   134: fstore #16
    //   136: aload_1
    //   137: invokevirtual Dne : ()LNMq;
    //   140: astore #18
    //   142: aload #18
    //   144: getfield Dne : I
    //   147: istore #19
    //   149: iload #19
    //   151: iconst_2
    //   152: if_icmpge -> 161
    //   155: iconst_1
    //   156: istore #20
    //   158: goto -> 190
    //   161: iload #19
    //   163: bipush #16
    //   165: if_icmpge -> 174
    //   168: iconst_2
    //   169: istore #20
    //   171: goto -> 190
    //   174: iload #19
    //   176: bipush #32
    //   178: if_icmpge -> 187
    //   181: iconst_3
    //   182: istore #20
    //   184: goto -> 190
    //   187: iconst_4
    //   188: istore #20
    //   190: fload #14
    //   192: fneg
    //   193: fload #15
    //   195: fneg
    //   196: fload #17
    //   198: fload #16
    //   200: fadd
    //   201: iload #20
    //   203: i2f
    //   204: fmul
    //   205: fconst_2
    //   206: fdiv
    //   207: fneg
    //   208: invokestatic glTranslatef : (FFF)V
    //   211: iconst_0
    //   212: istore #21
    //   214: iload #21
    //   216: iload #20
    //   218: if_icmpge -> 543
    //   221: fconst_0
    //   222: fconst_0
    //   223: fload #17
    //   225: fload #16
    //   227: fadd
    //   228: invokestatic glTranslatef : (FFF)V
    //   231: aload #18
    //   233: invokevirtual Dne : ()I
    //   236: ifne -> 260
    //   239: getstatic zKP.Dne : [LzKP;
    //   242: aload #18
    //   244: getfield bzF : I
    //   247: aaload
    //   248: ifnull -> 260
    //   251: aload_0
    //   252: ldc '/terrain.png'
    //   254: invokevirtual Dne : (Ljava/lang/String;)V
    //   257: goto -> 266
    //   260: aload_0
    //   261: ldc '/gui/items.png'
    //   263: invokevirtual Dne : (Ljava/lang/String;)V
    //   266: fload #5
    //   268: fload #6
    //   270: fload #7
    //   272: fconst_1
    //   273: invokestatic glColor4f : (FFFF)V
    //   276: aload #8
    //   278: fload #10
    //   280: fload #11
    //   282: fload #9
    //   284: fload #12
    //   286: aload_2
    //   287: invokeinterface bzF : ()I
    //   292: aload_2
    //   293: invokeinterface Qnq : ()I
    //   298: fload #17
    //   300: invokestatic Dne : (LWAR;FFFFIIF)V
    //   303: aload #18
    //   305: ifnull -> 537
    //   308: aload #18
    //   310: invokevirtual DyG : ()Z
    //   313: ifeq -> 537
    //   316: sipush #514
    //   319: invokestatic glDepthFunc : (I)V
    //   322: sipush #2896
    //   325: invokestatic glDisable : (I)V
    //   328: aload_0
    //   329: getfield Dne : LptH;
    //   332: getfield Dne : LSnh;
    //   335: ldc '%blur%/misc/glint.png'
    //   337: invokevirtual Dne : (Ljava/lang/String;)V
    //   340: sipush #3042
    //   343: invokestatic glEnable : (I)V
    //   346: sipush #768
    //   349: iconst_1
    //   350: invokestatic glBlendFunc : (II)V
    //   353: ldc 0.76
    //   355: fstore #22
    //   357: ldc 0.5
    //   359: fload #22
    //   361: fmul
    //   362: ldc 0.25
    //   364: fload #22
    //   366: fmul
    //   367: ldc 0.8
    //   369: fload #22
    //   371: fmul
    //   372: fconst_1
    //   373: invokestatic glColor4f : (FFFF)V
    //   376: sipush #5890
    //   379: invokestatic glMatrixMode : (I)V
    //   382: invokestatic glPushMatrix : ()V
    //   385: ldc 0.125
    //   387: fstore #23
    //   389: fload #23
    //   391: fload #23
    //   393: fload #23
    //   395: invokestatic glScalef : (FFF)V
    //   398: invokestatic Dne : ()J
    //   401: ldc2_w 3000
    //   404: lrem
    //   405: l2f
    //   406: ldc 3000.0
    //   408: fdiv
    //   409: ldc 8.0
    //   411: fmul
    //   412: fstore #24
    //   414: fload #24
    //   416: fconst_0
    //   417: fconst_0
    //   418: invokestatic glTranslatef : (FFF)V
    //   421: ldc -50.0
    //   423: fconst_0
    //   424: fconst_0
    //   425: fconst_1
    //   426: invokestatic glRotatef : (FFFF)V
    //   429: aload #8
    //   431: fconst_0
    //   432: fconst_0
    //   433: fconst_1
    //   434: fconst_1
    //   435: sipush #255
    //   438: sipush #255
    //   441: fload #17
    //   443: invokestatic Dne : (LWAR;FFFFIIF)V
    //   446: invokestatic glPopMatrix : ()V
    //   449: invokestatic glPushMatrix : ()V
    //   452: fload #23
    //   454: fload #23
    //   456: fload #23
    //   458: invokestatic glScalef : (FFF)V
    //   461: invokestatic Dne : ()J
    //   464: ldc2_w 4873
    //   467: lrem
    //   468: l2f
    //   469: ldc 4873.0
    //   471: fdiv
    //   472: ldc 8.0
    //   474: fmul
    //   475: fstore #24
    //   477: fload #24
    //   479: fneg
    //   480: fconst_0
    //   481: fconst_0
    //   482: invokestatic glTranslatef : (FFF)V
    //   485: ldc 10.0
    //   487: fconst_0
    //   488: fconst_0
    //   489: fconst_1
    //   490: invokestatic glRotatef : (FFFF)V
    //   493: aload #8
    //   495: fconst_0
    //   496: fconst_0
    //   497: fconst_1
    //   498: fconst_1
    //   499: sipush #255
    //   502: sipush #255
    //   505: fload #17
    //   507: invokestatic Dne : (LWAR;FFFFIIF)V
    //   510: invokestatic glPopMatrix : ()V
    //   513: sipush #5888
    //   516: invokestatic glMatrixMode : (I)V
    //   519: sipush #3042
    //   522: invokestatic glDisable : (I)V
    //   525: sipush #2896
    //   528: invokestatic glEnable : (I)V
    //   531: sipush #515
    //   534: invokestatic glDepthFunc : (I)V
    //   537: iinc #21, 1
    //   540: goto -> 214
    //   543: invokestatic glPopMatrix : ()V
    //   546: goto -> 773
    //   549: iconst_0
    //   550: istore #17
    //   552: iload #17
    //   554: iload_3
    //   555: if_icmpge -> 773
    //   558: invokestatic glPushMatrix : ()V
    //   561: iload #17
    //   563: ifle -> 623
    //   566: aload_0
    //   567: getfield Dne : Ljava/util/Random;
    //   570: invokevirtual nextFloat : ()F
    //   573: fconst_2
    //   574: fmul
    //   575: fconst_1
    //   576: fsub
    //   577: ldc 0.3
    //   579: fmul
    //   580: fstore #16
    //   582: aload_0
    //   583: getfield Dne : Ljava/util/Random;
    //   586: invokevirtual nextFloat : ()F
    //   589: fconst_2
    //   590: fmul
    //   591: fconst_1
    //   592: fsub
    //   593: ldc 0.3
    //   595: fmul
    //   596: fstore #18
    //   598: aload_0
    //   599: getfield Dne : Ljava/util/Random;
    //   602: invokevirtual nextFloat : ()F
    //   605: fconst_2
    //   606: fmul
    //   607: fconst_1
    //   608: fsub
    //   609: ldc 0.3
    //   611: fmul
    //   612: fstore #19
    //   614: fload #16
    //   616: fload #18
    //   618: fload #19
    //   620: invokestatic glTranslatef : (FFF)V
    //   623: getstatic eKj.FWm : Z
    //   626: ifne -> 645
    //   629: ldc 180.0
    //   631: aload_0
    //   632: getfield Dne : LptH;
    //   635: getfield Dne : F
    //   638: fsub
    //   639: fconst_0
    //   640: fconst_1
    //   641: fconst_0
    //   642: invokestatic glRotatef : (FFFF)V
    //   645: fload #5
    //   647: fload #6
    //   649: fload #7
    //   651: fconst_1
    //   652: invokestatic glColor4f : (FFFF)V
    //   655: aload #8
    //   657: invokevirtual Dne : ()V
    //   660: aload #8
    //   662: fconst_0
    //   663: fconst_1
    //   664: fconst_0
    //   665: invokevirtual FWm : (FFF)V
    //   668: aload #8
    //   670: fconst_0
    //   671: fload #14
    //   673: fsub
    //   674: f2d
    //   675: fconst_0
    //   676: fload #15
    //   678: fsub
    //   679: f2d
    //   680: dconst_0
    //   681: fload #9
    //   683: f2d
    //   684: fload #12
    //   686: f2d
    //   687: invokevirtual Dne : (DDDDD)V
    //   690: aload #8
    //   692: fload #13
    //   694: fload #14
    //   696: fsub
    //   697: f2d
    //   698: fconst_0
    //   699: fload #15
    //   701: fsub
    //   702: f2d
    //   703: dconst_0
    //   704: fload #10
    //   706: f2d
    //   707: fload #12
    //   709: f2d
    //   710: invokevirtual Dne : (DDDDD)V
    //   713: aload #8
    //   715: fload #13
    //   717: fload #14
    //   719: fsub
    //   720: f2d
    //   721: fconst_1
    //   722: fload #15
    //   724: fsub
    //   725: f2d
    //   726: dconst_0
    //   727: fload #10
    //   729: f2d
    //   730: fload #11
    //   732: f2d
    //   733: invokevirtual Dne : (DDDDD)V
    //   736: aload #8
    //   738: fconst_0
    //   739: fload #14
    //   741: fsub
    //   742: f2d
    //   743: fconst_1
    //   744: fload #15
    //   746: fsub
    //   747: f2d
    //   748: dconst_0
    //   749: fload #9
    //   751: f2d
    //   752: fload #11
    //   754: f2d
    //   755: invokevirtual Dne : (DDDDD)V
    //   758: aload #8
    //   760: invokevirtual Dne : ()I
    //   763: pop
    //   764: invokestatic glPopMatrix : ()V
    //   767: iinc #17, 1
    //   770: goto -> 552
    //   773: return
  }
  
  public eKj() {
    this.Dne = true;
    this.bzF = 0.0F;
    this.Dne = 0.15F;
    this.FWm = 0.75F;
  }
  
  public void Dne(msA parammsA, Snh paramSnh, NMq paramNMq, int paramInt1, int paramInt2, String paramString) {
    if (paramNMq != null) {
      if (paramNMq.Dne > 1 || paramString != null) {
        String str = (paramString == null) ? String.valueOf(paramNMq.Dne) : paramString;
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        parammsA.Dne(str, paramInt1 + 19 - 2 - parammsA.Dne(str), paramInt2 + 6 + 3, 16777215);
        GL11.glEnable(2896);
        GL11.glEnable(2929);
      } 
      if (paramNMq.Qnq()) {
        int i = (int)Math.round(13.0D - paramNMq.bzF() * 13.0D / paramNMq.aFZ());
        int j = (int)Math.round(255.0D - paramNMq.bzF() * 255.0D / paramNMq.aFZ());
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        GL11.glDisable(3553);
        boolean bool = WAR.Dne;
        int k = 255 - j << 16 | j << 8;
        int m = (255 - j) / 4 << 16 | 0x3F00;
        Dne(bool, paramInt1 + 2, paramInt2 + 13, 13, 2, 0);
        Dne(bool, paramInt1 + 2, paramInt2 + 13, 12, 1, m);
        Dne(bool, paramInt1 + 2, paramInt2 + 13, i, 1, k);
        GL11.glEnable(3553);
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      } 
    } 
  }
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iload #6
    //   5: iconst_2
    //   6: if_icmpge -> 273
    //   9: iload #6
    //   11: ifne -> 21
    //   14: sipush #768
    //   17: iconst_1
    //   18: invokestatic glBlendFunc : (II)V
    //   21: iload #6
    //   23: iconst_1
    //   24: if_icmpne -> 34
    //   27: sipush #768
    //   30: iconst_1
    //   31: invokestatic glBlendFunc : (II)V
    //   34: ldc 0.00390625
    //   36: fstore #7
    //   38: ldc 0.00390625
    //   40: fstore #8
    //   42: invokestatic Dne : ()J
    //   45: sipush #3000
    //   48: iload #6
    //   50: sipush #1873
    //   53: imul
    //   54: iadd
    //   55: i2l
    //   56: lrem
    //   57: l2f
    //   58: ldc 3000.0
    //   60: iload #6
    //   62: sipush #1873
    //   65: imul
    //   66: i2f
    //   67: fadd
    //   68: fdiv
    //   69: ldc 256.0
    //   71: fmul
    //   72: fstore #9
    //   74: fconst_0
    //   75: fstore #10
    //   77: getstatic WAR.Dne : LWAR;
    //   80: astore #11
    //   82: ldc 4.0
    //   84: fstore #12
    //   86: iload #6
    //   88: iconst_1
    //   89: if_icmpne -> 96
    //   92: ldc -1.0
    //   94: fstore #12
    //   96: aload #11
    //   98: invokevirtual Dne : ()V
    //   101: aload #11
    //   103: iload_2
    //   104: iconst_0
    //   105: iadd
    //   106: i2d
    //   107: iload_3
    //   108: iload #5
    //   110: iadd
    //   111: i2d
    //   112: aload_0
    //   113: getfield bzF : F
    //   116: f2d
    //   117: fload #9
    //   119: iload #5
    //   121: i2f
    //   122: fload #12
    //   124: fmul
    //   125: fadd
    //   126: fload #7
    //   128: fmul
    //   129: f2d
    //   130: fload #10
    //   132: iload #5
    //   134: i2f
    //   135: fadd
    //   136: fload #8
    //   138: fmul
    //   139: f2d
    //   140: invokevirtual Dne : (DDDDD)V
    //   143: aload #11
    //   145: iload_2
    //   146: iload #4
    //   148: iadd
    //   149: i2d
    //   150: iload_3
    //   151: iload #5
    //   153: iadd
    //   154: i2d
    //   155: aload_0
    //   156: getfield bzF : F
    //   159: f2d
    //   160: fload #9
    //   162: iload #4
    //   164: i2f
    //   165: fadd
    //   166: iload #5
    //   168: i2f
    //   169: fload #12
    //   171: fmul
    //   172: fadd
    //   173: fload #7
    //   175: fmul
    //   176: f2d
    //   177: fload #10
    //   179: iload #5
    //   181: i2f
    //   182: fadd
    //   183: fload #8
    //   185: fmul
    //   186: f2d
    //   187: invokevirtual Dne : (DDDDD)V
    //   190: aload #11
    //   192: iload_2
    //   193: iload #4
    //   195: iadd
    //   196: i2d
    //   197: iload_3
    //   198: iconst_0
    //   199: iadd
    //   200: i2d
    //   201: aload_0
    //   202: getfield bzF : F
    //   205: f2d
    //   206: fload #9
    //   208: iload #4
    //   210: i2f
    //   211: fadd
    //   212: fload #7
    //   214: fmul
    //   215: f2d
    //   216: fload #10
    //   218: fconst_0
    //   219: fadd
    //   220: fload #8
    //   222: fmul
    //   223: f2d
    //   224: invokevirtual Dne : (DDDDD)V
    //   227: aload #11
    //   229: iload_2
    //   230: iconst_0
    //   231: iadd
    //   232: i2d
    //   233: iload_3
    //   234: iconst_0
    //   235: iadd
    //   236: i2d
    //   237: aload_0
    //   238: getfield bzF : F
    //   241: f2d
    //   242: fload #9
    //   244: fconst_0
    //   245: fadd
    //   246: fload #7
    //   248: fmul
    //   249: f2d
    //   250: fload #10
    //   252: fconst_0
    //   253: fadd
    //   254: fload #8
    //   256: fmul
    //   257: f2d
    //   258: invokevirtual Dne : (DDDDD)V
    //   261: aload #11
    //   263: invokevirtual Dne : ()I
    //   266: pop
    //   267: iinc #6, 1
    //   270: goto -> 3
    //   273: return
  }
  
  public void Dne(int paramInt1, int paramInt2, gDn paramgDn, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #6
    //   5: aload #6
    //   7: invokevirtual Dne : ()V
    //   10: aload #6
    //   12: iload_1
    //   13: iconst_0
    //   14: iadd
    //   15: i2d
    //   16: iload_2
    //   17: iload #5
    //   19: iadd
    //   20: i2d
    //   21: aload_0
    //   22: getfield bzF : F
    //   25: f2d
    //   26: aload_3
    //   27: invokeinterface Dne : ()F
    //   32: f2d
    //   33: aload_3
    //   34: invokeinterface Qnq : ()F
    //   39: f2d
    //   40: invokevirtual Dne : (DDDDD)V
    //   43: aload #6
    //   45: iload_1
    //   46: iload #4
    //   48: iadd
    //   49: i2d
    //   50: iload_2
    //   51: iload #5
    //   53: iadd
    //   54: i2d
    //   55: aload_0
    //   56: getfield bzF : F
    //   59: f2d
    //   60: aload_3
    //   61: invokeinterface FWm : ()F
    //   66: f2d
    //   67: aload_3
    //   68: invokeinterface Qnq : ()F
    //   73: f2d
    //   74: invokevirtual Dne : (DDDDD)V
    //   77: aload #6
    //   79: iload_1
    //   80: iload #4
    //   82: iadd
    //   83: i2d
    //   84: iload_2
    //   85: iconst_0
    //   86: iadd
    //   87: i2d
    //   88: aload_0
    //   89: getfield bzF : F
    //   92: f2d
    //   93: aload_3
    //   94: invokeinterface FWm : ()F
    //   99: f2d
    //   100: aload_3
    //   101: invokeinterface bzF : ()F
    //   106: f2d
    //   107: invokevirtual Dne : (DDDDD)V
    //   110: aload #6
    //   112: iload_1
    //   113: iconst_0
    //   114: iadd
    //   115: i2d
    //   116: iload_2
    //   117: iconst_0
    //   118: iadd
    //   119: i2d
    //   120: aload_0
    //   121: getfield bzF : F
    //   124: f2d
    //   125: aload_3
    //   126: invokeinterface Dne : ()F
    //   131: f2d
    //   132: aload_3
    //   133: invokeinterface bzF : ()F
    //   138: f2d
    //   139: invokevirtual Dne : (DDDDD)V
    //   142: aload #6
    //   144: invokevirtual Dne : ()I
    //   147: pop
    //   148: return
  }
  
  public void Dne(msA parammsA, Snh paramSnh, NMq paramNMq, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_3
    //   1: getfield bzF : I
    //   4: istore #6
    //   6: aload_3
    //   7: invokevirtual Qnq : ()I
    //   10: istore #7
    //   12: aload_3
    //   13: invokevirtual Dne : ()LgDn;
    //   16: astore #8
    //   18: aload_3
    //   19: invokevirtual Dne : ()I
    //   22: ifne -> 237
    //   25: getstatic zKP.Dne : [LzKP;
    //   28: iload #6
    //   30: aaload
    //   31: invokevirtual Dne : ()I
    //   34: invokestatic Dne : (I)Z
    //   37: ifeq -> 237
    //   40: aload_2
    //   41: ldc '/terrain.png'
    //   43: invokevirtual Dne : (Ljava/lang/String;)V
    //   46: getstatic zKP.Dne : [LzKP;
    //   49: iload #6
    //   51: aaload
    //   52: astore #12
    //   54: invokestatic glPushMatrix : ()V
    //   57: iload #4
    //   59: iconst_2
    //   60: isub
    //   61: i2f
    //   62: iload #5
    //   64: iconst_3
    //   65: iadd
    //   66: i2f
    //   67: ldc -3.0
    //   69: aload_0
    //   70: getfield bzF : F
    //   73: fadd
    //   74: invokestatic glTranslatef : (FFF)V
    //   77: ldc 10.0
    //   79: ldc 10.0
    //   81: ldc 10.0
    //   83: invokestatic glScalef : (FFF)V
    //   86: fconst_1
    //   87: ldc 0.5
    //   89: fconst_1
    //   90: invokestatic glTranslatef : (FFF)V
    //   93: fconst_1
    //   94: fconst_1
    //   95: ldc -1.0
    //   97: invokestatic glScalef : (FFF)V
    //   100: ldc 210.0
    //   102: fconst_1
    //   103: fconst_0
    //   104: fconst_0
    //   105: invokestatic glRotatef : (FFFF)V
    //   108: ldc 45.0
    //   110: fconst_0
    //   111: fconst_1
    //   112: fconst_0
    //   113: invokestatic glRotatef : (FFFF)V
    //   116: getstatic dEr.Dne : [LdEr;
    //   119: iload #6
    //   121: aaload
    //   122: aload_3
    //   123: iconst_0
    //   124: invokevirtual Dne : (LNMq;I)I
    //   127: istore #13
    //   129: iload #13
    //   131: bipush #16
    //   133: ishr
    //   134: sipush #255
    //   137: iand
    //   138: i2f
    //   139: ldc_w 255.0
    //   142: fdiv
    //   143: fstore #11
    //   145: iload #13
    //   147: bipush #8
    //   149: ishr
    //   150: sipush #255
    //   153: iand
    //   154: i2f
    //   155: ldc_w 255.0
    //   158: fdiv
    //   159: fstore #9
    //   161: iload #13
    //   163: sipush #255
    //   166: iand
    //   167: i2f
    //   168: ldc_w 255.0
    //   171: fdiv
    //   172: fstore #10
    //   174: aload_0
    //   175: getfield Dne : Z
    //   178: ifeq -> 191
    //   181: fload #11
    //   183: fload #9
    //   185: fload #10
    //   187: fconst_1
    //   188: invokestatic glColor4f : (FFFF)V
    //   191: ldc_w -90.0
    //   194: fconst_0
    //   195: fconst_1
    //   196: fconst_0
    //   197: invokestatic glRotatef : (FFFF)V
    //   200: aload_0
    //   201: getfield FWm : LzVu;
    //   204: aload_0
    //   205: getfield Dne : Z
    //   208: putfield FWm : Z
    //   211: aload_0
    //   212: getfield FWm : LzVu;
    //   215: aload #12
    //   217: iload #7
    //   219: fconst_1
    //   220: invokevirtual Dne : (LzKP;IF)V
    //   223: aload_0
    //   224: getfield FWm : LzVu;
    //   227: iconst_1
    //   228: putfield FWm : Z
    //   231: invokestatic glPopMatrix : ()V
    //   234: goto -> 528
    //   237: getstatic dEr.Dne : [LdEr;
    //   240: iload #6
    //   242: aaload
    //   243: invokevirtual Dne : ()Z
    //   246: ifeq -> 390
    //   249: sipush #2896
    //   252: invokestatic glDisable : (I)V
    //   255: aload_2
    //   256: ldc '/gui/items.png'
    //   258: invokevirtual Dne : (Ljava/lang/String;)V
    //   261: iconst_0
    //   262: istore #12
    //   264: iload #12
    //   266: iconst_1
    //   267: if_icmpgt -> 381
    //   270: getstatic dEr.Dne : [LdEr;
    //   273: iload #6
    //   275: aaload
    //   276: iload #7
    //   278: iload #12
    //   280: invokevirtual Dne : (II)LgDn;
    //   283: astore #13
    //   285: getstatic dEr.Dne : [LdEr;
    //   288: iload #6
    //   290: aaload
    //   291: aload_3
    //   292: iload #12
    //   294: invokevirtual Dne : (LNMq;I)I
    //   297: istore #14
    //   299: iload #14
    //   301: bipush #16
    //   303: ishr
    //   304: sipush #255
    //   307: iand
    //   308: i2f
    //   309: ldc_w 255.0
    //   312: fdiv
    //   313: fstore #9
    //   315: iload #14
    //   317: bipush #8
    //   319: ishr
    //   320: sipush #255
    //   323: iand
    //   324: i2f
    //   325: ldc_w 255.0
    //   328: fdiv
    //   329: fstore #10
    //   331: iload #14
    //   333: sipush #255
    //   336: iand
    //   337: i2f
    //   338: ldc_w 255.0
    //   341: fdiv
    //   342: fstore #15
    //   344: aload_0
    //   345: getfield Dne : Z
    //   348: ifeq -> 361
    //   351: fload #9
    //   353: fload #10
    //   355: fload #15
    //   357: fconst_1
    //   358: invokestatic glColor4f : (FFFF)V
    //   361: aload_0
    //   362: iload #4
    //   364: iload #5
    //   366: aload #13
    //   368: bipush #16
    //   370: bipush #16
    //   372: invokevirtual Dne : (IILgDn;II)V
    //   375: iinc #12, 1
    //   378: goto -> 264
    //   381: sipush #2896
    //   384: invokestatic glEnable : (I)V
    //   387: goto -> 528
    //   390: sipush #2896
    //   393: invokestatic glDisable : (I)V
    //   396: aload_3
    //   397: invokevirtual Dne : ()I
    //   400: ifne -> 412
    //   403: aload_2
    //   404: ldc '/terrain.png'
    //   406: invokevirtual Dne : (Ljava/lang/String;)V
    //   409: goto -> 418
    //   412: aload_2
    //   413: ldc '/gui/items.png'
    //   415: invokevirtual Dne : (Ljava/lang/String;)V
    //   418: aload #8
    //   420: ifnonnull -> 433
    //   423: aload_2
    //   424: aload_3
    //   425: invokevirtual Dne : ()I
    //   428: invokevirtual Dne : (I)LgDn;
    //   431: astore #8
    //   433: getstatic dEr.Dne : [LdEr;
    //   436: iload #6
    //   438: aaload
    //   439: aload_3
    //   440: iconst_0
    //   441: invokevirtual Dne : (LNMq;I)I
    //   444: istore #12
    //   446: iload #12
    //   448: bipush #16
    //   450: ishr
    //   451: sipush #255
    //   454: iand
    //   455: i2f
    //   456: ldc_w 255.0
    //   459: fdiv
    //   460: fstore #13
    //   462: iload #12
    //   464: bipush #8
    //   466: ishr
    //   467: sipush #255
    //   470: iand
    //   471: i2f
    //   472: ldc_w 255.0
    //   475: fdiv
    //   476: fstore #11
    //   478: iload #12
    //   480: sipush #255
    //   483: iand
    //   484: i2f
    //   485: ldc_w 255.0
    //   488: fdiv
    //   489: fstore #9
    //   491: aload_0
    //   492: getfield Dne : Z
    //   495: ifeq -> 508
    //   498: fload #13
    //   500: fload #11
    //   502: fload #9
    //   504: fconst_1
    //   505: invokestatic glColor4f : (FFFF)V
    //   508: aload_0
    //   509: iload #4
    //   511: iload #5
    //   513: aload #8
    //   515: bipush #16
    //   517: bipush #16
    //   519: invokevirtual Dne : (IILgDn;II)V
    //   522: sipush #2896
    //   525: invokestatic glEnable : (I)V
    //   528: sipush #2884
    //   531: invokestatic glEnable : (I)V
    //   534: return
  }
  
  private void Dne(WAR paramWAR, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramWAR.Dne();
    paramWAR.bzF(paramInt5);
    paramWAR.Dne((paramInt1 + 0), (paramInt2 + 0), 0.0D);
    paramWAR.Dne((paramInt1 + 0), (paramInt2 + paramInt4), 0.0D);
    paramWAR.Dne((paramInt1 + paramInt3), (paramInt2 + paramInt4), 0.0D);
    paramWAR.Dne((paramInt1 + paramInt3), (paramInt2 + 0), 0.0D);
    paramWAR.Dne();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((JiM)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void FWm(msA parammsA, Snh paramSnh, NMq paramNMq, int paramInt1, int paramInt2) {
    if (paramNMq != null) {
      Dne(parammsA, paramSnh, paramNMq, paramInt1, paramInt2);
      if (paramNMq.DyG()) {
        GL11.glDepthFunc(516);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        paramSnh.Dne("%blur%/misc/glint.png");
        this.bzF -= 50.0F;
        GL11.glEnable(3042);
        GL11.glBlendFunc(774, 774);
        GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
        Dne(paramInt1 * 431278612 + paramInt2 * 32178161, paramInt1 - 2, paramInt2 - 2, 20, 20);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
        this.bzF += 50.0F;
        GL11.glEnable(2896);
        GL11.glDepthFunc(515);
      } 
    } 
  }
  
  public void Dne(JiM paramJiM, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: ldc2_w 187
    //   7: invokevirtual setSeed : (J)V
    //   10: aload_1
    //   11: invokevirtual Dne : ()LNMq;
    //   14: astore #10
    //   16: aload #10
    //   18: invokevirtual Dne : ()LdEr;
    //   21: ifnull -> 851
    //   24: invokestatic glPushMatrix : ()V
    //   27: aload_1
    //   28: getfield Dne : I
    //   31: i2f
    //   32: fload #9
    //   34: fadd
    //   35: ldc 10.0
    //   37: fdiv
    //   38: aload_1
    //   39: getfield Dne : F
    //   42: fadd
    //   43: invokestatic Dne : (F)F
    //   46: ldc_w 0.1
    //   49: fmul
    //   50: ldc_w 0.1
    //   53: fadd
    //   54: fstore #11
    //   56: aload_1
    //   57: getfield Dne : I
    //   60: i2f
    //   61: fload #9
    //   63: fadd
    //   64: ldc 20.0
    //   66: fdiv
    //   67: aload_1
    //   68: getfield Dne : F
    //   71: fadd
    //   72: ldc 57.295776
    //   74: fmul
    //   75: fstore #12
    //   77: iconst_1
    //   78: istore #13
    //   80: aload_1
    //   81: invokevirtual Dne : ()LNMq;
    //   84: getfield Dne : I
    //   87: iconst_1
    //   88: if_icmple -> 94
    //   91: iconst_2
    //   92: istore #13
    //   94: aload_1
    //   95: invokevirtual Dne : ()LNMq;
    //   98: getfield Dne : I
    //   101: iconst_5
    //   102: if_icmple -> 108
    //   105: iconst_3
    //   106: istore #13
    //   108: aload_1
    //   109: invokevirtual Dne : ()LNMq;
    //   112: getfield Dne : I
    //   115: bipush #20
    //   117: if_icmple -> 123
    //   120: iconst_4
    //   121: istore #13
    //   123: aload_1
    //   124: invokevirtual Dne : ()LNMq;
    //   127: getfield Dne : I
    //   130: bipush #40
    //   132: if_icmple -> 138
    //   135: iconst_5
    //   136: istore #13
    //   138: dload_2
    //   139: d2f
    //   140: dload #4
    //   142: d2f
    //   143: fload #11
    //   145: fadd
    //   146: dload #6
    //   148: d2f
    //   149: invokestatic glTranslatef : (FFF)V
    //   152: ldc_w 32826
    //   155: invokestatic glEnable : (I)V
    //   158: aload #10
    //   160: invokevirtual Dne : ()I
    //   163: ifne -> 424
    //   166: getstatic zKP.Dne : [LzKP;
    //   169: aload #10
    //   171: getfield bzF : I
    //   174: aaload
    //   175: ifnull -> 424
    //   178: getstatic zKP.Dne : [LzKP;
    //   181: aload #10
    //   183: getfield bzF : I
    //   186: aaload
    //   187: invokevirtual Dne : ()I
    //   190: invokestatic Dne : (I)Z
    //   193: ifeq -> 424
    //   196: getstatic zKP.Dne : [LzKP;
    //   199: aload #10
    //   201: getfield bzF : I
    //   204: aaload
    //   205: astore #18
    //   207: fload #12
    //   209: fconst_0
    //   210: fconst_1
    //   211: fconst_0
    //   212: invokestatic glRotatef : (FFFF)V
    //   215: getstatic eKj.FWm : Z
    //   218: ifeq -> 250
    //   221: ldc_w 1.25
    //   224: ldc_w 1.25
    //   227: ldc_w 1.25
    //   230: invokestatic glScalef : (FFF)V
    //   233: fconst_0
    //   234: ldc_w 0.05
    //   237: fconst_0
    //   238: invokestatic glTranslatef : (FFF)V
    //   241: ldc_w -90.0
    //   244: fconst_0
    //   245: fconst_1
    //   246: fconst_0
    //   247: invokestatic glRotatef : (FFFF)V
    //   250: aload_0
    //   251: ldc '/terrain.png'
    //   253: invokevirtual Dne : (Ljava/lang/String;)V
    //   256: ldc 0.25
    //   258: fstore #19
    //   260: aload #18
    //   262: invokevirtual Dne : ()I
    //   265: istore #20
    //   267: iload #20
    //   269: iconst_1
    //   270: if_icmpeq -> 293
    //   273: iload #20
    //   275: bipush #19
    //   277: if_icmpeq -> 293
    //   280: iload #20
    //   282: bipush #12
    //   284: if_icmpeq -> 293
    //   287: iload #20
    //   289: iconst_2
    //   290: if_icmpne -> 297
    //   293: ldc 0.5
    //   295: fstore #19
    //   297: fload #19
    //   299: fload #19
    //   301: fload #19
    //   303: invokestatic glScalef : (FFF)V
    //   306: iconst_0
    //   307: istore #14
    //   309: iload #14
    //   311: iload #13
    //   313: if_icmpge -> 421
    //   316: invokestatic glPushMatrix : ()V
    //   319: iload #14
    //   321: ifle -> 393
    //   324: aload_0
    //   325: getfield Dne : Ljava/util/Random;
    //   328: invokevirtual nextFloat : ()F
    //   331: fconst_2
    //   332: fmul
    //   333: fconst_1
    //   334: fsub
    //   335: ldc_w 0.2
    //   338: fmul
    //   339: fload #19
    //   341: fdiv
    //   342: fstore #15
    //   344: aload_0
    //   345: getfield Dne : Ljava/util/Random;
    //   348: invokevirtual nextFloat : ()F
    //   351: fconst_2
    //   352: fmul
    //   353: fconst_1
    //   354: fsub
    //   355: ldc_w 0.2
    //   358: fmul
    //   359: fload #19
    //   361: fdiv
    //   362: fstore #16
    //   364: aload_0
    //   365: getfield Dne : Ljava/util/Random;
    //   368: invokevirtual nextFloat : ()F
    //   371: fconst_2
    //   372: fmul
    //   373: fconst_1
    //   374: fsub
    //   375: ldc_w 0.2
    //   378: fmul
    //   379: fload #19
    //   381: fdiv
    //   382: fstore #17
    //   384: fload #15
    //   386: fload #16
    //   388: fload #17
    //   390: invokestatic glTranslatef : (FFF)V
    //   393: fconst_1
    //   394: fstore #15
    //   396: aload_0
    //   397: getfield FWm : LzVu;
    //   400: aload #18
    //   402: aload #10
    //   404: invokevirtual Qnq : ()I
    //   407: fload #15
    //   409: invokevirtual Dne : (LzKP;IF)V
    //   412: invokestatic glPopMatrix : ()V
    //   415: iinc #14, 1
    //   418: goto -> 309
    //   421: goto -> 842
    //   424: aload #10
    //   426: invokevirtual Dne : ()LdEr;
    //   429: invokevirtual Dne : ()Z
    //   432: ifeq -> 659
    //   435: getstatic eKj.FWm : Z
    //   438: ifeq -> 464
    //   441: ldc_w 0.5128205
    //   444: ldc_w 0.5128205
    //   447: ldc_w 0.5128205
    //   450: invokestatic glScalef : (FFF)V
    //   453: fconst_0
    //   454: ldc_w -0.05
    //   457: fconst_0
    //   458: invokestatic glTranslatef : (FFF)V
    //   461: goto -> 473
    //   464: ldc 0.5
    //   466: ldc 0.5
    //   468: ldc 0.5
    //   470: invokestatic glScalef : (FFF)V
    //   473: aload_0
    //   474: ldc '/gui/items.png'
    //   476: invokevirtual Dne : (Ljava/lang/String;)V
    //   479: iconst_0
    //   480: istore #19
    //   482: iload #19
    //   484: iconst_1
    //   485: if_icmpgt -> 656
    //   488: aload_0
    //   489: getfield Dne : Ljava/util/Random;
    //   492: ldc2_w 187
    //   495: invokevirtual setSeed : (J)V
    //   498: aload #10
    //   500: invokevirtual Dne : ()LdEr;
    //   503: aload #10
    //   505: invokevirtual Qnq : ()I
    //   508: iload #19
    //   510: invokevirtual Dne : (II)LgDn;
    //   513: astore #20
    //   515: fconst_1
    //   516: fstore #18
    //   518: aload_0
    //   519: getfield Dne : Z
    //   522: ifeq -> 636
    //   525: getstatic dEr.Dne : [LdEr;
    //   528: aload #10
    //   530: getfield bzF : I
    //   533: aaload
    //   534: aload #10
    //   536: iload #19
    //   538: invokevirtual Dne : (LNMq;I)I
    //   541: istore #14
    //   543: iload #14
    //   545: bipush #16
    //   547: ishr
    //   548: sipush #255
    //   551: iand
    //   552: i2f
    //   553: ldc_w 255.0
    //   556: fdiv
    //   557: fstore #15
    //   559: iload #14
    //   561: bipush #8
    //   563: ishr
    //   564: sipush #255
    //   567: iand
    //   568: i2f
    //   569: ldc_w 255.0
    //   572: fdiv
    //   573: fstore #16
    //   575: iload #14
    //   577: sipush #255
    //   580: iand
    //   581: i2f
    //   582: ldc_w 255.0
    //   585: fdiv
    //   586: fstore #17
    //   588: fload #15
    //   590: fload #18
    //   592: fmul
    //   593: fload #16
    //   595: fload #18
    //   597: fmul
    //   598: fload #17
    //   600: fload #18
    //   602: fmul
    //   603: fconst_1
    //   604: invokestatic glColor4f : (FFFF)V
    //   607: aload_0
    //   608: aload_1
    //   609: aload #20
    //   611: iload #13
    //   613: fload #9
    //   615: fload #15
    //   617: fload #18
    //   619: fmul
    //   620: fload #16
    //   622: fload #18
    //   624: fmul
    //   625: fload #17
    //   627: fload #18
    //   629: fmul
    //   630: invokespecial Dne : (LJiM;LgDn;IFFFF)V
    //   633: goto -> 650
    //   636: aload_0
    //   637: aload_1
    //   638: aload #20
    //   640: iload #13
    //   642: fload #9
    //   644: fconst_1
    //   645: fconst_1
    //   646: fconst_1
    //   647: invokespecial Dne : (LJiM;LgDn;IFFFF)V
    //   650: iinc #19, 1
    //   653: goto -> 482
    //   656: goto -> 842
    //   659: getstatic eKj.FWm : Z
    //   662: ifeq -> 688
    //   665: ldc_w 0.5128205
    //   668: ldc_w 0.5128205
    //   671: ldc_w 0.5128205
    //   674: invokestatic glScalef : (FFF)V
    //   677: fconst_0
    //   678: ldc_w -0.05
    //   681: fconst_0
    //   682: invokestatic glTranslatef : (FFF)V
    //   685: goto -> 697
    //   688: ldc 0.5
    //   690: ldc 0.5
    //   692: ldc 0.5
    //   694: invokestatic glScalef : (FFF)V
    //   697: aload #10
    //   699: invokevirtual Dne : ()LgDn;
    //   702: astore #19
    //   704: aload #10
    //   706: invokevirtual Dne : ()I
    //   709: ifne -> 721
    //   712: aload_0
    //   713: ldc '/terrain.png'
    //   715: invokevirtual Dne : (Ljava/lang/String;)V
    //   718: goto -> 727
    //   721: aload_0
    //   722: ldc '/gui/items.png'
    //   724: invokevirtual Dne : (Ljava/lang/String;)V
    //   727: aload_0
    //   728: getfield Dne : Z
    //   731: ifeq -> 828
    //   734: getstatic dEr.Dne : [LdEr;
    //   737: aload #10
    //   739: getfield bzF : I
    //   742: aaload
    //   743: aload #10
    //   745: iconst_0
    //   746: invokevirtual Dne : (LNMq;I)I
    //   749: istore #20
    //   751: iload #20
    //   753: bipush #16
    //   755: ishr
    //   756: sipush #255
    //   759: iand
    //   760: i2f
    //   761: ldc_w 255.0
    //   764: fdiv
    //   765: fstore #18
    //   767: iload #20
    //   769: bipush #8
    //   771: ishr
    //   772: sipush #255
    //   775: iand
    //   776: i2f
    //   777: ldc_w 255.0
    //   780: fdiv
    //   781: fstore #21
    //   783: iload #20
    //   785: sipush #255
    //   788: iand
    //   789: i2f
    //   790: ldc_w 255.0
    //   793: fdiv
    //   794: fstore #15
    //   796: fconst_1
    //   797: fstore #16
    //   799: aload_0
    //   800: aload_1
    //   801: aload #19
    //   803: iload #13
    //   805: fload #9
    //   807: fload #18
    //   809: fload #16
    //   811: fmul
    //   812: fload #21
    //   814: fload #16
    //   816: fmul
    //   817: fload #15
    //   819: fload #16
    //   821: fmul
    //   822: invokespecial Dne : (LJiM;LgDn;IFFFF)V
    //   825: goto -> 842
    //   828: aload_0
    //   829: aload_1
    //   830: aload #19
    //   832: iload #13
    //   834: fload #9
    //   836: fconst_1
    //   837: fconst_1
    //   838: fconst_1
    //   839: invokespecial Dne : (LJiM;LgDn;IFFFF)V
    //   842: ldc_w 32826
    //   845: invokestatic glDisable : (I)V
    //   848: invokestatic glPopMatrix : ()V
    //   851: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eKj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */