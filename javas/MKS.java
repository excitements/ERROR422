import java.awt.image.BufferedImage;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class MKS extends qVZ {
  private int zGp;
  
  private String Qnq;
  
  private Pee Dne;
  
  private int aFZ;
  
  private static final String[] Dne;
  
  private String bzF;
  
  private int div;
  
  private int DyG;
  
  private static boolean Qnq;
  
  private int Qnq;
  
  private int Dne;
  
  private float Dne;
  
  private static final Random Dne = new Random();
  
  private String FWm;
  
  private int XHL;
  
  public static final String Dne;
  
  private int kGO;
  
  private static boolean aFZ;
  
  private int Zpi;
  
  private int mrb;
  
  private final Object Dne;
  
  private int IjH;
  
  private boolean bzF;
  
  static int FWm(MKS paramMKS) {
    return paramMKS.aFZ;
  }
  
  static msA FWm(MKS paramMKS) {
    return (msA)paramMKS.Dne;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 0)
      this.Dne.Dne(new uqy(this, ((Minecraft)this.Dne).Dne)); 
    if (paramPee.aFZ == 5)
      this.Dne.Dne(new Utr(this, ((Minecraft)this.Dne).Dne)); 
    if (paramPee.aFZ == 1)
      this.Dne.Dne(new PRD(this)); 
    if (paramPee.aFZ == 2)
      this.Dne.Dne(new KDD(this)); 
    if (paramPee.aFZ == 3)
      this.Dne.Dne(new wWl(this)); 
    if (paramPee.aFZ == 4)
      this.Dne.Qnq(); 
    if (paramPee.aFZ == 11)
      this.Dne.Dne("Demo_World", "Demo_World", Kqb.Dne); 
    if (paramPee.aFZ == 12) {
      YiY yiY = this.Dne.Dne();
      xoY xoY = yiY.Dne("Demo_World");
      if (xoY != null) {
        sHC sHC = PRD.Dne(this, xoY.Dne(), 12);
        this.Dne.Dne(sHC);
      } 
    } 
  }
  
  private void FWm(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #4
    //   5: sipush #5889
    //   8: invokestatic glMatrixMode : (I)V
    //   11: invokestatic glPushMatrix : ()V
    //   14: invokestatic glLoadIdentity : ()V
    //   17: ldc 120.0
    //   19: fconst_1
    //   20: ldc 0.05
    //   22: ldc 10.0
    //   24: invokestatic gluPerspective : (FFFF)V
    //   27: sipush #5888
    //   30: invokestatic glMatrixMode : (I)V
    //   33: invokestatic glPushMatrix : ()V
    //   36: invokestatic glLoadIdentity : ()V
    //   39: fconst_1
    //   40: fconst_1
    //   41: fconst_1
    //   42: fconst_1
    //   43: invokestatic glColor4f : (FFFF)V
    //   46: ldc 180.0
    //   48: fconst_1
    //   49: fconst_0
    //   50: fconst_0
    //   51: invokestatic glRotatef : (FFFF)V
    //   54: sipush #3042
    //   57: invokestatic glEnable : (I)V
    //   60: sipush #3008
    //   63: invokestatic glDisable : (I)V
    //   66: sipush #2884
    //   69: invokestatic glDisable : (I)V
    //   72: iconst_0
    //   73: invokestatic glDepthMask : (Z)V
    //   76: sipush #770
    //   79: sipush #771
    //   82: invokestatic glBlendFunc : (II)V
    //   85: bipush #8
    //   87: istore #5
    //   89: iconst_0
    //   90: istore #6
    //   92: iload #6
    //   94: iload #5
    //   96: iload #5
    //   98: imul
    //   99: if_icmpge -> 428
    //   102: invokestatic glPushMatrix : ()V
    //   105: iload #6
    //   107: iload #5
    //   109: irem
    //   110: i2f
    //   111: iload #5
    //   113: i2f
    //   114: fdiv
    //   115: ldc 0.5
    //   117: fsub
    //   118: ldc 64.0
    //   120: fdiv
    //   121: fstore #7
    //   123: iload #6
    //   125: iload #5
    //   127: idiv
    //   128: i2f
    //   129: iload #5
    //   131: i2f
    //   132: fdiv
    //   133: ldc 0.5
    //   135: fsub
    //   136: ldc 64.0
    //   138: fdiv
    //   139: fstore #8
    //   141: fconst_0
    //   142: fstore #9
    //   144: fload #7
    //   146: fload #8
    //   148: fload #9
    //   150: invokestatic glTranslatef : (FFF)V
    //   153: aload_0
    //   154: getfield Dne : I
    //   157: i2f
    //   158: fload_3
    //   159: fadd
    //   160: ldc 400.0
    //   162: fdiv
    //   163: invokestatic Dne : (F)F
    //   166: ldc 25.0
    //   168: fmul
    //   169: ldc 20.0
    //   171: fadd
    //   172: fconst_1
    //   173: fconst_0
    //   174: fconst_0
    //   175: invokestatic glRotatef : (FFFF)V
    //   178: aload_0
    //   179: getfield Dne : I
    //   182: i2f
    //   183: fload_3
    //   184: fadd
    //   185: fneg
    //   186: ldc 0.1
    //   188: fmul
    //   189: fconst_0
    //   190: fconst_1
    //   191: fconst_0
    //   192: invokestatic glRotatef : (FFFF)V
    //   195: iconst_0
    //   196: istore #10
    //   198: iload #10
    //   200: bipush #6
    //   202: if_icmpge -> 412
    //   205: invokestatic glPushMatrix : ()V
    //   208: iload #10
    //   210: iconst_1
    //   211: if_icmpne -> 222
    //   214: ldc 90.0
    //   216: fconst_0
    //   217: fconst_1
    //   218: fconst_0
    //   219: invokestatic glRotatef : (FFFF)V
    //   222: iload #10
    //   224: iconst_2
    //   225: if_icmpne -> 236
    //   228: ldc 180.0
    //   230: fconst_0
    //   231: fconst_1
    //   232: fconst_0
    //   233: invokestatic glRotatef : (FFFF)V
    //   236: iload #10
    //   238: iconst_3
    //   239: if_icmpne -> 250
    //   242: ldc -90.0
    //   244: fconst_0
    //   245: fconst_1
    //   246: fconst_0
    //   247: invokestatic glRotatef : (FFFF)V
    //   250: iload #10
    //   252: iconst_4
    //   253: if_icmpne -> 264
    //   256: ldc 90.0
    //   258: fconst_1
    //   259: fconst_0
    //   260: fconst_0
    //   261: invokestatic glRotatef : (FFFF)V
    //   264: iload #10
    //   266: iconst_5
    //   267: if_icmpne -> 278
    //   270: ldc -90.0
    //   272: fconst_1
    //   273: fconst_0
    //   274: fconst_0
    //   275: invokestatic glRotatef : (FFFF)V
    //   278: aload_0
    //   279: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   282: getfield Dne : LSnh;
    //   285: getstatic MKS.Dne : [Ljava/lang/String;
    //   288: iload #10
    //   290: aaload
    //   291: invokevirtual Dne : (Ljava/lang/String;)V
    //   294: aload #4
    //   296: invokevirtual Dne : ()V
    //   299: aload #4
    //   301: ldc 16777215
    //   303: sipush #255
    //   306: iload #6
    //   308: iconst_1
    //   309: iadd
    //   310: idiv
    //   311: invokevirtual Dne : (II)V
    //   314: fconst_0
    //   315: fstore #11
    //   317: aload #4
    //   319: ldc2_w -1.0
    //   322: ldc2_w -1.0
    //   325: dconst_1
    //   326: fconst_0
    //   327: fload #11
    //   329: fadd
    //   330: f2d
    //   331: fconst_0
    //   332: fload #11
    //   334: fadd
    //   335: f2d
    //   336: invokevirtual Dne : (DDDDD)V
    //   339: aload #4
    //   341: dconst_1
    //   342: ldc2_w -1.0
    //   345: dconst_1
    //   346: fconst_1
    //   347: fload #11
    //   349: fsub
    //   350: f2d
    //   351: fconst_0
    //   352: fload #11
    //   354: fadd
    //   355: f2d
    //   356: invokevirtual Dne : (DDDDD)V
    //   359: aload #4
    //   361: dconst_1
    //   362: dconst_1
    //   363: dconst_1
    //   364: fconst_1
    //   365: fload #11
    //   367: fsub
    //   368: f2d
    //   369: fconst_1
    //   370: fload #11
    //   372: fsub
    //   373: f2d
    //   374: invokevirtual Dne : (DDDDD)V
    //   377: aload #4
    //   379: ldc2_w -1.0
    //   382: dconst_1
    //   383: dconst_1
    //   384: fconst_0
    //   385: fload #11
    //   387: fadd
    //   388: f2d
    //   389: fconst_1
    //   390: fload #11
    //   392: fsub
    //   393: f2d
    //   394: invokevirtual Dne : (DDDDD)V
    //   397: aload #4
    //   399: invokevirtual Dne : ()I
    //   402: pop
    //   403: invokestatic glPopMatrix : ()V
    //   406: iinc #10, 1
    //   409: goto -> 198
    //   412: invokestatic glPopMatrix : ()V
    //   415: iconst_1
    //   416: iconst_1
    //   417: iconst_1
    //   418: iconst_0
    //   419: invokestatic glColorMask : (ZZZZ)V
    //   422: iinc #6, 1
    //   425: goto -> 92
    //   428: aload #4
    //   430: dconst_0
    //   431: dconst_0
    //   432: dconst_0
    //   433: invokevirtual FWm : (DDD)V
    //   436: iconst_1
    //   437: iconst_1
    //   438: iconst_1
    //   439: iconst_1
    //   440: invokestatic glColorMask : (ZZZZ)V
    //   443: sipush #5889
    //   446: invokestatic glMatrixMode : (I)V
    //   449: invokestatic glPopMatrix : ()V
    //   452: sipush #5888
    //   455: invokestatic glMatrixMode : (I)V
    //   458: invokestatic glPopMatrix : ()V
    //   461: iconst_1
    //   462: invokestatic glDepthMask : (Z)V
    //   465: sipush #2884
    //   468: invokestatic glEnable : (I)V
    //   471: sipush #3008
    //   474: invokestatic glEnable : (I)V
    //   477: sipush #2929
    //   480: invokestatic glEnable : (I)V
    //   483: return
  }
  
  private void bzF(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: iconst_0
    //   1: iconst_0
    //   2: sipush #256
    //   5: sipush #256
    //   8: invokestatic glViewport : (IIII)V
    //   11: sipush #3553
    //   14: invokestatic glDisable : (I)V
    //   17: sipush #3553
    //   20: invokestatic glEnable : (I)V
    //   23: iconst_0
    //   24: iconst_0
    //   25: aload_0
    //   26: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   29: getfield Dne : I
    //   32: aload_0
    //   33: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   36: getfield FWm : I
    //   39: invokestatic glViewport : (IIII)V
    //   42: getstatic WAR.Dne : LWAR;
    //   45: astore #4
    //   47: aload #4
    //   49: invokevirtual Dne : ()V
    //   52: aload_0
    //   53: getfield FWm : I
    //   56: aload_0
    //   57: getfield bzF : I
    //   60: if_icmple -> 74
    //   63: ldc 120.0
    //   65: aload_0
    //   66: getfield FWm : I
    //   69: i2f
    //   70: fdiv
    //   71: goto -> 82
    //   74: ldc 120.0
    //   76: aload_0
    //   77: getfield bzF : I
    //   80: i2f
    //   81: fdiv
    //   82: fstore #5
    //   84: aload_0
    //   85: getfield bzF : I
    //   88: i2f
    //   89: fload #5
    //   91: fmul
    //   92: ldc 256.0
    //   94: fdiv
    //   95: fstore #6
    //   97: aload_0
    //   98: getfield FWm : I
    //   101: i2f
    //   102: fload #5
    //   104: fmul
    //   105: ldc 256.0
    //   107: fdiv
    //   108: fstore #7
    //   110: sipush #3553
    //   113: sipush #10241
    //   116: sipush #9729
    //   119: invokestatic glTexParameteri : (III)V
    //   122: sipush #3553
    //   125: sipush #10240
    //   128: sipush #9729
    //   131: invokestatic glTexParameteri : (III)V
    //   134: aload #4
    //   136: fconst_1
    //   137: fconst_1
    //   138: fconst_1
    //   139: fconst_1
    //   140: invokevirtual Dne : (FFFF)V
    //   143: aload_0
    //   144: getfield FWm : I
    //   147: istore #8
    //   149: aload_0
    //   150: getfield bzF : I
    //   153: istore #9
    //   155: aload #4
    //   157: dconst_0
    //   158: iload #9
    //   160: i2d
    //   161: aload_0
    //   162: getfield FWm : F
    //   165: f2d
    //   166: ldc 0.5
    //   168: fload #6
    //   170: fsub
    //   171: f2d
    //   172: ldc 0.5
    //   174: fload #7
    //   176: fadd
    //   177: f2d
    //   178: invokevirtual Dne : (DDDDD)V
    //   181: aload #4
    //   183: iload #8
    //   185: i2d
    //   186: iload #9
    //   188: i2d
    //   189: aload_0
    //   190: getfield FWm : F
    //   193: f2d
    //   194: ldc 0.5
    //   196: fload #6
    //   198: fsub
    //   199: f2d
    //   200: ldc 0.5
    //   202: fload #7
    //   204: fsub
    //   205: f2d
    //   206: invokevirtual Dne : (DDDDD)V
    //   209: aload #4
    //   211: iload #8
    //   213: i2d
    //   214: dconst_0
    //   215: aload_0
    //   216: getfield FWm : F
    //   219: f2d
    //   220: ldc 0.5
    //   222: fload #6
    //   224: fadd
    //   225: f2d
    //   226: ldc 0.5
    //   228: fload #7
    //   230: fsub
    //   231: f2d
    //   232: invokevirtual Dne : (DDDDD)V
    //   235: aload #4
    //   237: dconst_0
    //   238: dconst_0
    //   239: aload_0
    //   240: getfield FWm : F
    //   243: f2d
    //   244: ldc 0.5
    //   246: fload #6
    //   248: fadd
    //   249: f2d
    //   250: ldc 0.5
    //   252: fload #7
    //   254: fadd
    //   255: f2d
    //   256: invokevirtual Dne : (DDDDD)V
    //   259: aload #4
    //   261: invokevirtual Dne : ()I
    //   264: pop
    //   265: return
  }
  
  static boolean Dne(boolean paramBoolean) {
    aFZ = paramBoolean;
    return paramBoolean;
  }
  
  static int Dne(MKS paramMKS) {
    return paramMKS.zGp;
  }
  
  static int Qnq(MKS paramMKS, int paramInt) {
    return paramMKS.div = paramInt;
  }
  
  static String Dne(MKS paramMKS, String paramString) {
    return paramMKS.bzF = paramString;
  }
  
  private void FWm(int paramInt1, int paramInt2, irb paramirb) {
    this.Dne.add(new Pee(11, this.FWm / 2 - 100, paramInt1, paramirb.Dne("menu.playdemo")));
    this.Dne.add(this.Dne = new Pee(12, this.FWm / 2 - 100, paramInt1 + paramInt2 * 1, paramirb.Dne("menu.resetdemo")));
    YiY yiY = this.Dne.Dne();
    xoY xoY = yiY.Dne("Demo_World");
    if (xoY == null)
      ((Pee)this.Dne).Dne = Character.MIN_VALUE; 
  }
  
  static Minecraft Dne(MKS paramMKS) {
    return (Minecraft)paramMKS.Dne;
  }
  
  private void Dne(float paramFloat) {
    // Byte code:
    //   0: sipush #3553
    //   3: aload_0
    //   4: getfield Qnq : I
    //   7: invokestatic glBindTexture : (II)V
    //   10: aload_0
    //   11: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   14: getfield Dne : LSnh;
    //   17: invokevirtual Dne : ()V
    //   20: sipush #3553
    //   23: iconst_0
    //   24: iconst_0
    //   25: iconst_0
    //   26: iconst_0
    //   27: iconst_0
    //   28: sipush #256
    //   31: sipush #256
    //   34: invokestatic glCopyTexSubImage2D : (IIIIIIII)V
    //   37: sipush #3042
    //   40: invokestatic glEnable : (I)V
    //   43: sipush #770
    //   46: sipush #771
    //   49: invokestatic glBlendFunc : (II)V
    //   52: iconst_1
    //   53: iconst_1
    //   54: iconst_1
    //   55: iconst_0
    //   56: invokestatic glColorMask : (ZZZZ)V
    //   59: getstatic WAR.Dne : LWAR;
    //   62: astore_2
    //   63: aload_2
    //   64: invokevirtual Dne : ()V
    //   67: iconst_3
    //   68: istore_3
    //   69: iconst_0
    //   70: istore #4
    //   72: iload #4
    //   74: iload_3
    //   75: if_icmpge -> 198
    //   78: aload_2
    //   79: fconst_1
    //   80: fconst_1
    //   81: fconst_1
    //   82: fconst_1
    //   83: iload #4
    //   85: iconst_1
    //   86: iadd
    //   87: i2f
    //   88: fdiv
    //   89: invokevirtual Dne : (FFFF)V
    //   92: aload_0
    //   93: getfield FWm : I
    //   96: istore #5
    //   98: aload_0
    //   99: getfield bzF : I
    //   102: istore #6
    //   104: iload #4
    //   106: iload_3
    //   107: iconst_2
    //   108: idiv
    //   109: isub
    //   110: i2f
    //   111: ldc 256.0
    //   113: fdiv
    //   114: fstore #7
    //   116: aload_2
    //   117: iload #5
    //   119: i2d
    //   120: iload #6
    //   122: i2d
    //   123: aload_0
    //   124: getfield FWm : F
    //   127: f2d
    //   128: fconst_0
    //   129: fload #7
    //   131: fadd
    //   132: f2d
    //   133: dconst_0
    //   134: invokevirtual Dne : (DDDDD)V
    //   137: aload_2
    //   138: iload #5
    //   140: i2d
    //   141: dconst_0
    //   142: aload_0
    //   143: getfield FWm : F
    //   146: f2d
    //   147: fconst_1
    //   148: fload #7
    //   150: fadd
    //   151: f2d
    //   152: dconst_0
    //   153: invokevirtual Dne : (DDDDD)V
    //   156: aload_2
    //   157: dconst_0
    //   158: dconst_0
    //   159: aload_0
    //   160: getfield FWm : F
    //   163: f2d
    //   164: fconst_1
    //   165: fload #7
    //   167: fadd
    //   168: f2d
    //   169: dconst_1
    //   170: invokevirtual Dne : (DDDDD)V
    //   173: aload_2
    //   174: dconst_0
    //   175: iload #6
    //   177: i2d
    //   178: aload_0
    //   179: getfield FWm : F
    //   182: f2d
    //   183: fconst_0
    //   184: fload #7
    //   186: fadd
    //   187: f2d
    //   188: dconst_1
    //   189: invokevirtual Dne : (DDDDD)V
    //   192: iinc #4, 1
    //   195: goto -> 72
    //   198: aload_2
    //   199: invokevirtual Dne : ()I
    //   202: pop
    //   203: iconst_1
    //   204: iconst_1
    //   205: iconst_1
    //   206: iconst_1
    //   207: invokestatic glColorMask : (ZZZZ)V
    //   210: aload_0
    //   211: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   214: getfield Dne : LSnh;
    //   217: invokevirtual Dne : ()V
    //   220: return
  }
  
  static int aFZ(MKS paramMKS, int paramInt) {
    return paramMKS.IjH = paramInt;
  }
  
  static msA Dne(MKS paramMKS) {
    return (msA)paramMKS.Dne;
  }
  
  static int FWm(MKS paramMKS, int paramInt) {
    return paramMKS.aFZ = paramInt;
  }
  
  public MKS() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: fconst_0
    //   6: putfield Dne : F
    //   9: aload_0
    //   10: ldc_w 'missingno'
    //   13: putfield FWm : Ljava/lang/String;
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield Dne : I
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield bzF : Z
    //   26: aload_0
    //   27: new java/lang/Object
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: putfield Dne : Ljava/lang/Object;
    //   37: aconst_null
    //   38: astore_1
    //   39: new java/util/ArrayList
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: astore_3
    //   47: new java/io/BufferedReader
    //   50: dup
    //   51: new java/io/InputStreamReader
    //   54: dup
    //   55: ldc MKS
    //   57: ldc_w '/title/splashes.txt'
    //   60: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   63: ldc_w 'UTF-8'
    //   66: invokestatic forName : (Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   69: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   72: invokespecial <init> : (Ljava/io/Reader;)V
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual readLine : ()Ljava/lang/String;
    //   80: dup
    //   81: astore_2
    //   82: ifnull -> 106
    //   85: aload_2
    //   86: invokevirtual trim : ()Ljava/lang/String;
    //   89: astore_2
    //   90: aload_2
    //   91: invokevirtual length : ()I
    //   94: ifle -> 76
    //   97: aload_3
    //   98: aload_2
    //   99: invokevirtual add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: goto -> 76
    //   106: aload_0
    //   107: aload_3
    //   108: getstatic MKS.Dne : Ljava/util/Random;
    //   111: aload_3
    //   112: invokevirtual size : ()I
    //   115: invokevirtual nextInt : (I)I
    //   118: invokevirtual get : (I)Ljava/lang/Object;
    //   121: checkcast java/lang/String
    //   124: putfield FWm : Ljava/lang/String;
    //   127: aload_0
    //   128: getfield FWm : Ljava/lang/String;
    //   131: invokevirtual hashCode : ()I
    //   134: ldc_w 125780783
    //   137: if_icmpeq -> 106
    //   140: aload_1
    //   141: ifnull -> 189
    //   144: aload_1
    //   145: invokevirtual close : ()V
    //   148: goto -> 189
    //   151: astore_3
    //   152: goto -> 189
    //   155: astore_3
    //   156: aload_1
    //   157: ifnull -> 189
    //   160: aload_1
    //   161: invokevirtual close : ()V
    //   164: goto -> 189
    //   167: astore_3
    //   168: goto -> 189
    //   171: astore #4
    //   173: aload_1
    //   174: ifnull -> 186
    //   177: aload_1
    //   178: invokevirtual close : ()V
    //   181: goto -> 186
    //   184: astore #5
    //   186: aload #4
    //   188: athrow
    //   189: aload_0
    //   190: getstatic MKS.Dne : Ljava/util/Random;
    //   193: invokevirtual nextFloat : ()F
    //   196: putfield Dne : F
    //   199: aload_0
    //   200: ldc_w ''
    //   203: putfield bzF : Ljava/lang/String;
    //   206: ldc_w 'os_architecture'
    //   209: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   212: astore_3
    //   213: ldc_w 'java_version'
    //   216: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   219: astore_2
    //   220: return
    // Exception table:
    //   from	to	target	type
    //   39	140	155	java/io/IOException
    //   39	140	171	finally
    //   144	148	151	java/io/IOException
    //   160	164	167	java/io/IOException
    //   171	173	171	finally
    //   177	181	184	java/io/IOException
  }
  
  static List Dne(MKS paramMKS) {
    return (List)paramMKS.Dne;
  }
  
  static int Dne(MKS paramMKS, int paramInt) {
    return paramMKS.zGp = paramInt;
  }
  
  private void FWm(irb paramirb, int paramInt1, int paramInt2) {
    this.Dne.add(new Pee(3, this.FWm / 2 - 100, paramInt1 + paramInt2 * 2, paramirb.Dne("menu.online")));
  }
  
  static String Dne(MKS paramMKS) {
    return paramMKS.bzF;
  }
  
  private void Dne(int paramInt1, int paramInt2, irb paramirb) {
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, paramInt1, paramirb.Dne("menu.singleplayer")));
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, paramInt1 + paramInt2, 200, 20, "SocketException", false));
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, paramInt1 + paramInt2 + paramInt2, 200, 20, "NullPointerException", false));
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, paramInt1, paramirb.Dne("menu.singleplayer")));
  }
  
  public boolean Dne() {
    return false;
  }
  
  static int bzF(MKS paramMKS, int paramInt) {
    return paramMKS.DyG = paramInt;
  }
  
  static int bzF(MKS paramMKS) {
    return paramMKS.DyG;
  }
  
  static {
    Qnq = 0;
    aFZ = false;
    Dne = new String[] { "/title/bg/panorama0.png", "/title/bg/panorama1.png", "/title/bg/panorama2.png", "/title/bg/panorama3.png", "/title/bg/panorama4.png", "/title/bg/panorama5.png" };
    Dne = "Please click " + Dne.ceE + "here" + Dne.FfS + " for more information.";
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual aFZ : ()V
    //   4: invokestatic FWm : ()V
    //   7: aload_0
    //   8: pop
    //   9: iconst_0
    //   10: iconst_0
    //   11: aload_0
    //   12: getfield FWm : I
    //   15: aload_0
    //   16: getfield bzF : I
    //   19: iconst_0
    //   20: invokestatic Dne : (IIIII)V
    //   23: getstatic WAR.Dne : LWAR;
    //   26: astore #4
    //   28: sipush #274
    //   31: istore #5
    //   33: aload_0
    //   34: getfield FWm : I
    //   37: iconst_2
    //   38: idiv
    //   39: iload #5
    //   41: iconst_2
    //   42: idiv
    //   43: isub
    //   44: istore #6
    //   46: bipush #30
    //   48: istore #7
    //   50: aload_0
    //   51: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   54: getfield Dne : LSnh;
    //   57: ldc_w '/title/mclogo.png'
    //   60: invokevirtual Dne : (Ljava/lang/String;)V
    //   63: iconst_0
    //   64: istore #8
    //   66: iconst_0
    //   67: istore #9
    //   69: aload_0
    //   70: getfield Zpi : I
    //   73: bipush #50
    //   75: if_icmplt -> 147
    //   78: bipush #10
    //   80: invokestatic Dne : (I)I
    //   83: ifne -> 133
    //   86: bipush #10
    //   88: invokestatic Dne : (I)I
    //   91: istore #8
    //   93: iconst_1
    //   94: invokestatic Dne : (I)I
    //   97: istore #9
    //   99: iconst_2
    //   100: invokestatic Dne : (I)I
    //   103: ifne -> 112
    //   106: iload #8
    //   108: ineg
    //   109: goto -> 114
    //   112: iload #8
    //   114: istore #8
    //   116: iconst_2
    //   117: invokestatic Dne : (I)I
    //   120: ifne -> 129
    //   123: iload #9
    //   125: ineg
    //   126: goto -> 131
    //   129: iload #9
    //   131: istore #9
    //   133: aload_0
    //   134: getfield Zpi : I
    //   137: bipush #100
    //   139: if_icmplt -> 147
    //   142: aload_0
    //   143: iconst_0
    //   144: putfield Zpi : I
    //   147: aload_0
    //   148: getfield XHL : I
    //   151: sipush #300
    //   154: if_icmplt -> 202
    //   157: bipush #10
    //   159: invokestatic Dne : (I)I
    //   162: ifne -> 187
    //   165: dconst_1
    //   166: fconst_1
    //   167: getstatic eCD.Dne : Ljava/util/Random;
    //   170: invokevirtual nextFloat : ()F
    //   173: ldc_w 0.8
    //   176: fsub
    //   177: fadd
    //   178: ldc_w 0.8
    //   181: fadd
    //   182: f2d
    //   183: dconst_1
    //   184: invokestatic glScaled : (DDD)V
    //   187: aload_0
    //   188: getfield XHL : I
    //   191: sipush #330
    //   194: if_icmplt -> 202
    //   197: aload_0
    //   198: iconst_0
    //   199: putfield XHL : I
    //   202: aload_0
    //   203: getfield kGO : I
    //   206: bipush #10
    //   208: invokestatic Dne : (I)I
    //   211: if_icmplt -> 294
    //   214: aload_0
    //   215: getfield Dne : Ljava/util/List;
    //   218: invokeinterface iterator : ()Ljava/util/Iterator;
    //   223: astore #10
    //   225: aload #10
    //   227: invokeinterface hasNext : ()Z
    //   232: ifeq -> 289
    //   235: aload #10
    //   237: invokeinterface next : ()Ljava/lang/Object;
    //   242: astore #11
    //   244: aload #11
    //   246: checkcast Pee
    //   249: aload_0
    //   250: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   253: getfield Dne : LqVZ;
    //   256: getfield FWm : I
    //   259: invokestatic Dne : (I)I
    //   262: putfield bzF : I
    //   265: aload #11
    //   267: checkcast Pee
    //   270: aload_0
    //   271: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   274: getfield Dne : LqVZ;
    //   277: getfield bzF : I
    //   280: invokestatic Dne : (I)I
    //   283: putfield Qnq : I
    //   286: goto -> 225
    //   289: aload_0
    //   290: iconst_0
    //   291: putfield kGO : I
    //   294: aload_0
    //   295: dup
    //   296: getfield Zpi : I
    //   299: iconst_1
    //   300: iadd
    //   301: putfield Zpi : I
    //   304: aload_0
    //   305: dup
    //   306: getfield kGO : I
    //   309: iconst_1
    //   310: iadd
    //   311: putfield kGO : I
    //   314: aload_0
    //   315: dup
    //   316: getfield XHL : I
    //   319: iconst_1
    //   320: iadd
    //   321: putfield XHL : I
    //   324: fconst_1
    //   325: fconst_1
    //   326: fconst_1
    //   327: fconst_1
    //   328: invokestatic glColor4f : (FFFF)V
    //   331: aload_0
    //   332: iload #6
    //   334: iconst_0
    //   335: iadd
    //   336: iload #8
    //   338: iadd
    //   339: iload #7
    //   341: iconst_0
    //   342: iadd
    //   343: iload #9
    //   345: iadd
    //   346: iconst_0
    //   347: iconst_0
    //   348: sipush #155
    //   351: bipush #44
    //   353: invokevirtual FWm : (IIIIII)V
    //   356: aload_0
    //   357: iload #6
    //   359: sipush #155
    //   362: iadd
    //   363: iload #8
    //   365: iadd
    //   366: iload #7
    //   368: iconst_0
    //   369: iadd
    //   370: iload #9
    //   372: iadd
    //   373: iconst_0
    //   374: bipush #45
    //   376: sipush #155
    //   379: bipush #44
    //   381: invokevirtual FWm : (IIIIII)V
    //   384: aload #4
    //   386: ldc 16777215
    //   388: invokevirtual bzF : (I)V
    //   391: invokestatic glPushMatrix : ()V
    //   394: aload_0
    //   395: getfield FWm : I
    //   398: iconst_2
    //   399: idiv
    //   400: bipush #90
    //   402: iadd
    //   403: i2f
    //   404: ldc_w 70.0
    //   407: fconst_0
    //   408: invokestatic glTranslatef : (FFF)V
    //   411: ldc_w -20.0
    //   414: fconst_0
    //   415: fconst_0
    //   416: fconst_1
    //   417: invokestatic glRotatef : (FFFF)V
    //   420: ldc_w 1.8
    //   423: invokestatic Dne : ()J
    //   426: ldc2_w 1000
    //   429: lrem
    //   430: l2f
    //   431: ldc_w 1000.0
    //   434: fdiv
    //   435: ldc_w 3.1415927
    //   438: fmul
    //   439: fconst_2
    //   440: fmul
    //   441: invokestatic Dne : (F)F
    //   444: ldc 0.1
    //   446: fmul
    //   447: invokestatic Qnq : (F)F
    //   450: fsub
    //   451: fstore #10
    //   453: fload #10
    //   455: ldc_w 100.0
    //   458: fmul
    //   459: aload_0
    //   460: getfield Dne : LmsA;
    //   463: aload_0
    //   464: getfield FWm : Ljava/lang/String;
    //   467: invokevirtual Dne : (Ljava/lang/String;)I
    //   470: bipush #32
    //   472: iadd
    //   473: i2f
    //   474: fdiv
    //   475: fstore #10
    //   477: fload #10
    //   479: fload #10
    //   481: fload #10
    //   483: invokestatic glScalef : (FFF)V
    //   486: invokestatic glPopMatrix : ()V
    //   489: ldc_w '§mMinecraft §r§cERR422'
    //   492: astore #11
    //   494: aload_0
    //   495: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   498: invokevirtual Dne : ()Z
    //   501: ifeq -> 527
    //   504: new java/lang/StringBuilder
    //   507: dup
    //   508: invokespecial <init> : ()V
    //   511: aload #11
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: ldc_w ' Demo'
    //   519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: invokevirtual toString : ()Ljava/lang/String;
    //   525: astore #11
    //   527: aload_0
    //   528: getfield bzF : Ljava/lang/String;
    //   531: ifnull -> 639
    //   534: aload_0
    //   535: getfield bzF : Ljava/lang/String;
    //   538: invokevirtual length : ()I
    //   541: ifle -> 639
    //   544: aload_0
    //   545: getfield DyG : I
    //   548: iconst_2
    //   549: isub
    //   550: aload_0
    //   551: getfield div : I
    //   554: iconst_2
    //   555: isub
    //   556: aload_0
    //   557: getfield IjH : I
    //   560: iconst_2
    //   561: iadd
    //   562: aload_0
    //   563: getfield mrb : I
    //   566: iconst_1
    //   567: isub
    //   568: ldc_w 1428160512
    //   571: invokestatic Dne : (IIIII)V
    //   574: aload_0
    //   575: aload_0
    //   576: getfield Dne : LmsA;
    //   579: aload_0
    //   580: getfield bzF : Ljava/lang/String;
    //   583: aload_0
    //   584: getfield DyG : I
    //   587: aload_0
    //   588: getfield div : I
    //   591: ldc 16777215
    //   593: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   596: aload_0
    //   597: aload_0
    //   598: getfield Dne : LmsA;
    //   601: getstatic MKS.Dne : Ljava/lang/String;
    //   604: aload_0
    //   605: getfield FWm : I
    //   608: aload_0
    //   609: getfield aFZ : I
    //   612: isub
    //   613: iconst_2
    //   614: idiv
    //   615: aload_0
    //   616: getfield Dne : Ljava/util/List;
    //   619: iconst_0
    //   620: invokeinterface get : (I)Ljava/lang/Object;
    //   625: checkcast Pee
    //   628: getfield Qnq : I
    //   631: bipush #12
    //   633: isub
    //   634: ldc 16777215
    //   636: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   639: aload_0
    //   640: iload_1
    //   641: iload_2
    //   642: fload_3
    //   643: invokespecial Dne : (IIF)V
    //   646: return
  }
  
  protected void Dne(char paramChar, int paramInt) {}
  
  static String FWm(MKS paramMKS, String paramString) {
    return paramMKS.Qnq = paramString;
  }
  
  public void Dne() {
    this.Qnq = ((Minecraft)this.Dne).Dne.Dne(new BufferedImage(256, 256, 2));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
      this.FWm = "Happy birthday, ez!";
    } else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
      this.FWm = "Happy birthday, Notch!";
    } else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
      this.FWm = "Merry X-mas!";
    } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
      this.FWm = "Happy new year!";
    } else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
      this.FWm = "OOoooOOOoooo! Spooky!";
    } 
    this.FWm = "NullPointerException";
    irb irb = irb.Dne();
    int i = this.bzF / 4 + 48;
    if (this.Dne.Dne()) {
      FWm(i, 24, irb);
    } else {
      Dne(i, 24, irb);
    } 
    Dne(irb, i, 24);
    if (((Minecraft)this.Dne).FWm != 0) {
      this.Dne.add(new Pee(0, this.FWm / 2 - 100, i + 72, irb.Dne("menu.options")));
    } else {
      this.Dne.add(new Pee(0, this.FWm / 2 - 100, i + 72 + 12, 98, 20, irb.Dne("menu.options")));
      this.Dne.add(new Pee(4, this.FWm / 2 + 2, i + 72 + 12, 98, 20, "§4" + irb.Dne("menu.quit"), false));
    } 
    Object object = this.Dne;
    synchronized (this.Dne) {
      this.zGp = this.Dne.Dne(this.bzF);
      this.aFZ = this.Dne.Dne((String)Dne);
      int j = Math.max(this.zGp, this.aFZ);
      this.DyG = (this.FWm - j) / 2;
      this.div = ((Pee)this.Dne.get(0)).Qnq - 24;
      this.IjH = this.DyG + j;
      this.mrb = this.div + 24;
    } 
    OEk.Dne();
  }
  
  static Object Dne(MKS paramMKS) {
    return paramMKS.Dne;
  }
  
  public void bzF() {
    this.Dne++;
  }
  
  static int zGp(MKS paramMKS, int paramInt) {
    return paramMKS.mrb = paramInt;
  }
  
  static void Dne(MKS paramMKS, irb paramirb, int paramInt1, int paramInt2) {
    paramMKS.FWm(paramirb, paramInt1, paramInt2);
  }
  
  static int Qnq(MKS paramMKS) {
    return paramMKS.div;
  }
  
  private void Dne(irb paramirb, int paramInt1, int paramInt2) {
    if (this.bzF)
      if (Qnq == 0) {
        Qnq = 1;
        (new mxl(this, paramirb, paramInt1, paramInt2)).start();
      } else if (aFZ) {
        FWm(paramirb, paramInt1, paramInt2);
      }  
  }
  
  public void Dne(boolean paramBoolean, int paramInt) {
    if (paramBoolean && paramInt == 12) {
      YiY yiY = this.Dne.Dne();
      yiY.Dne();
      yiY.FWm("Demo_World");
      this.Dne.Dne(this);
    } else if (paramInt == 13) {
      if (paramBoolean)
        try {
          Class<?> clazz = Class.forName("java.awt.Desktop");
          Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
          clazz.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { new URI(this.Qnq) });
        } catch (Throwable throwable) {
          throwable.printStackTrace();
        }  
      this.Dne.Dne(this);
    } 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: iload_3
    //   4: invokespecial Dne : (III)V
    //   7: aload_0
    //   8: getfield Dne : Ljava/lang/Object;
    //   11: astore #4
    //   13: aload_0
    //   14: getfield Dne : Ljava/lang/Object;
    //   17: dup
    //   18: astore #5
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield bzF : Ljava/lang/String;
    //   25: invokevirtual length : ()I
    //   28: ifle -> 94
    //   31: iload_1
    //   32: aload_0
    //   33: getfield DyG : I
    //   36: if_icmplt -> 94
    //   39: iload_1
    //   40: aload_0
    //   41: getfield IjH : I
    //   44: if_icmpgt -> 94
    //   47: iload_2
    //   48: aload_0
    //   49: getfield div : I
    //   52: if_icmplt -> 94
    //   55: iload_2
    //   56: aload_0
    //   57: getfield mrb : I
    //   60: if_icmpgt -> 94
    //   63: new vBZ
    //   66: dup
    //   67: aload_0
    //   68: aload_0
    //   69: getfield Qnq : Ljava/lang/String;
    //   72: bipush #13
    //   74: iconst_1
    //   75: invokespecial <init> : (LqVZ;Ljava/lang/String;IZ)V
    //   78: astore #6
    //   80: aload #6
    //   82: invokevirtual IjH : ()V
    //   85: aload_0
    //   86: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   89: aload #6
    //   91: invokevirtual Dne : (LqVZ;)V
    //   94: aload #5
    //   96: monitorexit
    //   97: goto -> 108
    //   100: astore #7
    //   102: aload #5
    //   104: monitorexit
    //   105: aload #7
    //   107: athrow
    //   108: return
    // Exception table:
    //   from	to	target	type
    //   21	97	100	finally
    //   100	105	100	finally
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MKS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */