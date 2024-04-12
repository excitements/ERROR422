import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class rqj implements IjH {
  private int FfS;
  
  public List Dne;
  
  int[] Dne;
  
  private ofu[] Dne;
  
  private int DyG;
  
  private IntBuffer FWm;
  
  private Map Dne;
  
  private List bzF;
  
  private int RPx;
  
  private int oIf;
  
  private snt[] FWm;
  
  private Minecraft Dne;
  
  double Dne;
  
  private int div;
  
  private int ATE;
  
  private int zGp;
  
  private int aFZ;
  
  private int Zpi;
  
  double FWm;
  
  private int Vxn;
  
  private VzZ Dne;
  
  private zVu Dne;
  
  private snt[] Dne;
  
  private int OdI;
  
  private int Qnq;
  
  private int qLR;
  
  double bzF;
  
  private int ooe;
  
  private int vSL;
  
  private gDn[] Dne;
  
  private List FWm;
  
  private int trS;
  
  private int ceE;
  
  private int bzF;
  
  private int kGO;
  
  private int FWm;
  
  private boolean Dne;
  
  int Dne;
  
  private final Snh Dne;
  
  private int EyB;
  
  private int udO;
  
  private int IjH;
  
  private int Fnk;
  
  private int mrb;
  
  IntBuffer Dne;
  
  private int XHL;
  
  public boolean Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    return false;
  }
  
  public void Dne(IPx paramIPx, float paramFloat) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: aload_0
    //   4: getfield FWm : [Lsnt;
    //   7: arraylength
    //   8: if_icmpge -> 63
    //   11: aload_0
    //   12: getfield FWm : [Lsnt;
    //   15: iload_3
    //   16: aaload
    //   17: invokevirtual Dne : ()Z
    //   20: ifne -> 57
    //   23: aload_0
    //   24: getfield FWm : [Lsnt;
    //   27: iload_3
    //   28: aaload
    //   29: getfield Dne : Z
    //   32: ifeq -> 47
    //   35: iload_3
    //   36: aload_0
    //   37: getfield Dne : I
    //   40: iadd
    //   41: bipush #15
    //   43: iand
    //   44: ifne -> 57
    //   47: aload_0
    //   48: getfield FWm : [Lsnt;
    //   51: iload_3
    //   52: aaload
    //   53: aload_1
    //   54: invokevirtual Dne : (LIPx;)V
    //   57: iinc #3, 1
    //   60: goto -> 2
    //   63: aload_0
    //   64: dup
    //   65: getfield Dne : I
    //   68: iconst_1
    //   69: iadd
    //   70: putfield Dne : I
    //   73: return
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (IntBuffer)new gDn[10];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = (IntBuffer)paramRbp.Dne("destroy_" + b); 
  }
  
  private void bzF(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iinc #1, -8
    //   3: iinc #2, -8
    //   6: iinc #3, -8
    //   9: aload_0
    //   10: ldc 2147483647
    //   12: putfield mrb : I
    //   15: aload_0
    //   16: ldc 2147483647
    //   18: putfield XHL : I
    //   21: aload_0
    //   22: ldc 2147483647
    //   24: putfield Zpi : I
    //   27: aload_0
    //   28: ldc -2147483648
    //   30: putfield kGO : I
    //   33: aload_0
    //   34: ldc -2147483648
    //   36: putfield udO : I
    //   39: aload_0
    //   40: ldc -2147483648
    //   42: putfield ooe : I
    //   45: aload_0
    //   46: getfield FWm : I
    //   49: bipush #16
    //   51: imul
    //   52: istore #4
    //   54: iload #4
    //   56: iconst_2
    //   57: idiv
    //   58: istore #5
    //   60: iconst_0
    //   61: istore #6
    //   63: iload #6
    //   65: aload_0
    //   66: getfield FWm : I
    //   69: if_icmpge -> 373
    //   72: iload #6
    //   74: bipush #16
    //   76: imul
    //   77: istore #7
    //   79: iload #7
    //   81: iload #5
    //   83: iadd
    //   84: iload_1
    //   85: isub
    //   86: istore #8
    //   88: iload #8
    //   90: ifge -> 102
    //   93: iload #8
    //   95: iload #4
    //   97: iconst_1
    //   98: isub
    //   99: isub
    //   100: istore #8
    //   102: iload #8
    //   104: iload #4
    //   106: idiv
    //   107: istore #8
    //   109: iload #7
    //   111: iload #8
    //   113: iload #4
    //   115: imul
    //   116: isub
    //   117: istore #7
    //   119: iload #7
    //   121: aload_0
    //   122: getfield mrb : I
    //   125: if_icmpge -> 134
    //   128: aload_0
    //   129: iload #7
    //   131: putfield mrb : I
    //   134: iload #7
    //   136: aload_0
    //   137: getfield kGO : I
    //   140: if_icmple -> 149
    //   143: aload_0
    //   144: iload #7
    //   146: putfield kGO : I
    //   149: iconst_0
    //   150: istore #9
    //   152: iload #9
    //   154: aload_0
    //   155: getfield Qnq : I
    //   158: if_icmpge -> 367
    //   161: iload #9
    //   163: bipush #16
    //   165: imul
    //   166: istore #10
    //   168: iload #10
    //   170: iload #5
    //   172: iadd
    //   173: iload_3
    //   174: isub
    //   175: istore #11
    //   177: iload #11
    //   179: ifge -> 191
    //   182: iload #11
    //   184: iload #4
    //   186: iconst_1
    //   187: isub
    //   188: isub
    //   189: istore #11
    //   191: iload #11
    //   193: iload #4
    //   195: idiv
    //   196: istore #11
    //   198: iload #10
    //   200: iload #11
    //   202: iload #4
    //   204: imul
    //   205: isub
    //   206: istore #10
    //   208: iload #10
    //   210: aload_0
    //   211: getfield Zpi : I
    //   214: if_icmpge -> 223
    //   217: aload_0
    //   218: iload #10
    //   220: putfield Zpi : I
    //   223: iload #10
    //   225: aload_0
    //   226: getfield ooe : I
    //   229: if_icmple -> 238
    //   232: aload_0
    //   233: iload #10
    //   235: putfield ooe : I
    //   238: iconst_0
    //   239: istore #12
    //   241: iload #12
    //   243: aload_0
    //   244: getfield bzF : I
    //   247: if_icmpge -> 361
    //   250: iload #12
    //   252: bipush #16
    //   254: imul
    //   255: istore #13
    //   257: iload #13
    //   259: aload_0
    //   260: getfield XHL : I
    //   263: if_icmpge -> 272
    //   266: aload_0
    //   267: iload #13
    //   269: putfield XHL : I
    //   272: iload #13
    //   274: aload_0
    //   275: getfield udO : I
    //   278: if_icmple -> 287
    //   281: aload_0
    //   282: iload #13
    //   284: putfield udO : I
    //   287: aload_0
    //   288: getfield FWm : [Lsnt;
    //   291: iload #9
    //   293: aload_0
    //   294: getfield bzF : I
    //   297: imul
    //   298: iload #12
    //   300: iadd
    //   301: aload_0
    //   302: getfield FWm : I
    //   305: imul
    //   306: iload #6
    //   308: iadd
    //   309: aaload
    //   310: astore #14
    //   312: aload #14
    //   314: getfield FWm : Z
    //   317: istore #15
    //   319: aload #14
    //   321: iload #7
    //   323: iload #13
    //   325: iload #10
    //   327: invokevirtual Dne : (III)V
    //   330: iload #15
    //   332: ifne -> 355
    //   335: aload #14
    //   337: getfield FWm : Z
    //   340: ifeq -> 355
    //   343: aload_0
    //   344: getfield FWm : Ljava/util/List;
    //   347: aload #14
    //   349: invokeinterface add : (Ljava/lang/Object;)Z
    //   354: pop
    //   355: iinc #12, 1
    //   358: goto -> 241
    //   361: iinc #9, 1
    //   364: goto -> 152
    //   367: iinc #6, 1
    //   370: goto -> 63
    //   373: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    FWm(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt4 + 1, paramInt5 + 1, paramInt6 + 1);
  }
  
  public boolean Dne(FUH paramFUH, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_2
    //   1: istore_3
    //   2: new hAV
    //   5: dup
    //   6: aload_1
    //   7: invokespecial <init> : (LFUH;)V
    //   10: astore #4
    //   12: iload_3
    //   13: anewarray snt
    //   16: astore #5
    //   18: aconst_null
    //   19: astore #6
    //   21: aload_0
    //   22: getfield FWm : Ljava/util/List;
    //   25: invokeinterface size : ()I
    //   30: istore #7
    //   32: iconst_0
    //   33: istore #8
    //   35: aload_0
    //   36: getfield Dne : LVzZ;
    //   39: getfield Dne : LBkx;
    //   42: ldc 'nearChunksSearch'
    //   44: invokevirtual Dne : (Ljava/lang/String;)V
    //   47: iconst_0
    //   48: istore #9
    //   50: iload #9
    //   52: iload #7
    //   54: if_icmpge -> 232
    //   57: aload_0
    //   58: getfield FWm : Ljava/util/List;
    //   61: iload #9
    //   63: invokeinterface get : (I)Ljava/lang/Object;
    //   68: checkcast snt
    //   71: astore #10
    //   73: aload #10
    //   75: ifnull -> 226
    //   78: iload_2
    //   79: ifne -> 177
    //   82: aload #10
    //   84: aload_1
    //   85: invokevirtual Dne : (LsMa;)F
    //   88: ldc 256.0
    //   90: fcmpl
    //   91: ifle -> 188
    //   94: iconst_0
    //   95: istore #11
    //   97: iload #11
    //   99: iload_3
    //   100: if_icmpge -> 132
    //   103: aload #5
    //   105: iload #11
    //   107: aaload
    //   108: ifnull -> 126
    //   111: aload #4
    //   113: aload #5
    //   115: iload #11
    //   117: aaload
    //   118: aload #10
    //   120: invokevirtual Dne : (Lsnt;Lsnt;)I
    //   123: ifgt -> 132
    //   126: iinc #11, 1
    //   129: goto -> 97
    //   132: iinc #11, -1
    //   135: iload #11
    //   137: ifle -> 226
    //   140: iload #11
    //   142: istore #12
    //   144: iinc #12, -1
    //   147: iload #12
    //   149: ifne -> 162
    //   152: aload #5
    //   154: iload #11
    //   156: aload #10
    //   158: aastore
    //   159: goto -> 226
    //   162: aload #5
    //   164: iload #12
    //   166: iconst_1
    //   167: isub
    //   168: aload #5
    //   170: iload #12
    //   172: aaload
    //   173: aastore
    //   174: goto -> 144
    //   177: aload #10
    //   179: getfield Dne : Z
    //   182: ifne -> 188
    //   185: goto -> 226
    //   188: aload #6
    //   190: ifnonnull -> 202
    //   193: new java/util/ArrayList
    //   196: dup
    //   197: invokespecial <init> : ()V
    //   200: astore #6
    //   202: iinc #8, 1
    //   205: aload #6
    //   207: aload #10
    //   209: invokevirtual add : (Ljava/lang/Object;)Z
    //   212: pop
    //   213: aload_0
    //   214: getfield FWm : Ljava/util/List;
    //   217: iload #9
    //   219: aconst_null
    //   220: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   225: pop
    //   226: iinc #9, 1
    //   229: goto -> 50
    //   232: aload_0
    //   233: getfield Dne : LVzZ;
    //   236: getfield Dne : LBkx;
    //   239: invokevirtual FWm : ()V
    //   242: aload_0
    //   243: getfield Dne : LVzZ;
    //   246: getfield Dne : LBkx;
    //   249: ldc 'sort'
    //   251: invokevirtual Dne : (Ljava/lang/String;)V
    //   254: aload #6
    //   256: ifnull -> 318
    //   259: aload #6
    //   261: invokevirtual size : ()I
    //   264: iconst_1
    //   265: if_icmple -> 275
    //   268: aload #6
    //   270: aload #4
    //   272: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   275: aload #6
    //   277: invokevirtual size : ()I
    //   280: iconst_1
    //   281: isub
    //   282: istore #9
    //   284: iload #9
    //   286: iflt -> 318
    //   289: aload #6
    //   291: iload #9
    //   293: invokevirtual get : (I)Ljava/lang/Object;
    //   296: checkcast snt
    //   299: astore #10
    //   301: aload #10
    //   303: invokevirtual Dne : ()V
    //   306: aload #10
    //   308: iconst_0
    //   309: putfield FWm : Z
    //   312: iinc #9, -1
    //   315: goto -> 284
    //   318: aload_0
    //   319: getfield Dne : LVzZ;
    //   322: getfield Dne : LBkx;
    //   325: invokevirtual FWm : ()V
    //   328: iconst_0
    //   329: istore #9
    //   331: aload_0
    //   332: getfield Dne : LVzZ;
    //   335: getfield Dne : LBkx;
    //   338: ldc 'rebuild'
    //   340: invokevirtual Dne : (Ljava/lang/String;)V
    //   343: iload_3
    //   344: iconst_1
    //   345: isub
    //   346: istore #13
    //   348: iload #13
    //   350: iflt -> 421
    //   353: aload #5
    //   355: iload #13
    //   357: aaload
    //   358: astore #14
    //   360: aload #14
    //   362: ifnull -> 415
    //   365: aload #14
    //   367: getfield Dne : Z
    //   370: ifne -> 395
    //   373: iload #13
    //   375: iload_3
    //   376: iconst_1
    //   377: isub
    //   378: if_icmpeq -> 395
    //   381: aload #5
    //   383: iload #13
    //   385: aconst_null
    //   386: aastore
    //   387: aload #5
    //   389: iconst_0
    //   390: aconst_null
    //   391: aastore
    //   392: goto -> 421
    //   395: aload #5
    //   397: iload #13
    //   399: aaload
    //   400: invokevirtual Dne : ()V
    //   403: aload #5
    //   405: iload #13
    //   407: aaload
    //   408: iconst_0
    //   409: putfield FWm : Z
    //   412: iinc #9, 1
    //   415: iinc #13, -1
    //   418: goto -> 348
    //   421: aload_0
    //   422: getfield Dne : LVzZ;
    //   425: getfield Dne : LBkx;
    //   428: invokevirtual FWm : ()V
    //   431: aload_0
    //   432: getfield Dne : LVzZ;
    //   435: getfield Dne : LBkx;
    //   438: ldc 'cleanup'
    //   440: invokevirtual Dne : (Ljava/lang/String;)V
    //   443: iconst_0
    //   444: istore #13
    //   446: iconst_0
    //   447: istore #11
    //   449: aload_0
    //   450: getfield FWm : Ljava/util/List;
    //   453: invokeinterface size : ()I
    //   458: istore #12
    //   460: iload #13
    //   462: iload #12
    //   464: if_icmpeq -> 559
    //   467: aload_0
    //   468: getfield FWm : Ljava/util/List;
    //   471: iload #13
    //   473: invokeinterface get : (I)Ljava/lang/Object;
    //   478: checkcast snt
    //   481: astore #14
    //   483: aload #14
    //   485: ifnull -> 553
    //   488: iconst_0
    //   489: istore #15
    //   491: iconst_0
    //   492: istore #16
    //   494: iload #16
    //   496: iload_3
    //   497: if_icmpge -> 524
    //   500: iload #15
    //   502: ifne -> 524
    //   505: aload #14
    //   507: aload #5
    //   509: iload #16
    //   511: aaload
    //   512: if_acmpne -> 518
    //   515: iconst_1
    //   516: istore #15
    //   518: iinc #16, 1
    //   521: goto -> 494
    //   524: iload #15
    //   526: ifne -> 553
    //   529: iload #11
    //   531: iload #13
    //   533: if_icmpeq -> 550
    //   536: aload_0
    //   537: getfield FWm : Ljava/util/List;
    //   540: iload #11
    //   542: aload #14
    //   544: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   549: pop
    //   550: iinc #11, 1
    //   553: iinc #13, 1
    //   556: goto -> 460
    //   559: aload_0
    //   560: getfield Dne : LVzZ;
    //   563: getfield Dne : LBkx;
    //   566: invokevirtual FWm : ()V
    //   569: aload_0
    //   570: getfield Dne : LVzZ;
    //   573: getfield Dne : LBkx;
    //   576: ldc 'trim'
    //   578: invokevirtual Dne : (Ljava/lang/String;)V
    //   581: iinc #13, -1
    //   584: iload #13
    //   586: iload #11
    //   588: if_icmpge -> 617
    //   591: aload_0
    //   592: getfield Dne : LVzZ;
    //   595: getfield Dne : LBkx;
    //   598: invokevirtual FWm : ()V
    //   601: iload #7
    //   603: iload #8
    //   605: iload #9
    //   607: iadd
    //   608: if_icmpne -> 615
    //   611: iconst_1
    //   612: goto -> 616
    //   615: iconst_0
    //   616: ireturn
    //   617: aload_0
    //   618: getfield FWm : Ljava/util/List;
    //   621: iload #13
    //   623: invokeinterface remove : (I)Ljava/lang/Object;
    //   628: pop
    //   629: goto -> 581
  }
  
  public void Dne(FiG paramFiG, wHH paramwHH, int paramInt, NMq paramNMq, float paramFloat) {
    boolean bool = WAR.Dne;
    GL11.glEnable(3042);
    GL11.glEnable(3008);
    GL11.glBlendFunc(770, 1);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, (geR.Dne((float)Minecraft.Dne() / 100.0F) * 0.2F + 0.4F) * 0.5F);
    if (paramInt != 0 && paramNMq != null) {
      GL11.glBlendFunc(770, 771);
      float f = geR.Dne((float)Minecraft.Dne() / 100.0F) * 0.2F + 0.8F;
      GL11.glColor4f(f, f, f, geR.Dne((float)Minecraft.Dne() / 200.0F) * 0.2F + 0.5F);
      this.Dne.Dne("/terrain.png");
    } 
    GL11.glDisable(3042);
    GL11.glDisable(3008);
  }
  
  public void bzF(float paramFloat) {
    // Byte code:
    //   0: sipush #2884
    //   3: invokestatic glDisable : (I)V
    //   6: aload_0
    //   7: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   10: getfield Dne : LFUH;
    //   13: getfield ooe : D
    //   16: aload_0
    //   17: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   20: getfield Dne : LFUH;
    //   23: getfield IjH : D
    //   26: aload_0
    //   27: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   30: getfield Dne : LFUH;
    //   33: getfield ooe : D
    //   36: dsub
    //   37: fload_1
    //   38: f2d
    //   39: dmul
    //   40: dadd
    //   41: d2f
    //   42: fstore_2
    //   43: getstatic WAR.Dne : LWAR;
    //   46: astore_3
    //   47: ldc 12.0
    //   49: fstore #4
    //   51: ldc 4.0
    //   53: fstore #5
    //   55: aload_0
    //   56: getfield zGp : I
    //   59: i2f
    //   60: fload_1
    //   61: fadd
    //   62: f2d
    //   63: dstore #6
    //   65: aload_0
    //   66: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   69: getfield Dne : LFUH;
    //   72: getfield aFZ : D
    //   75: aload_0
    //   76: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   79: getfield Dne : LFUH;
    //   82: getfield div : D
    //   85: aload_0
    //   86: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   89: getfield Dne : LFUH;
    //   92: getfield aFZ : D
    //   95: dsub
    //   96: fload_1
    //   97: f2d
    //   98: dmul
    //   99: dadd
    //   100: dload #6
    //   102: ldc2_w 0.029999999329447746
    //   105: dmul
    //   106: dadd
    //   107: fload #4
    //   109: f2d
    //   110: ddiv
    //   111: dstore #8
    //   113: aload_0
    //   114: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   117: getfield Dne : LFUH;
    //   120: getfield DyG : D
    //   123: aload_0
    //   124: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   127: getfield Dne : LFUH;
    //   130: getfield mrb : D
    //   133: aload_0
    //   134: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   137: getfield Dne : LFUH;
    //   140: getfield DyG : D
    //   143: dsub
    //   144: fload_1
    //   145: f2d
    //   146: dmul
    //   147: dadd
    //   148: fload #4
    //   150: f2d
    //   151: ddiv
    //   152: ldc2_w 0.33000001311302185
    //   155: dadd
    //   156: dstore #10
    //   158: aload_0
    //   159: getfield Dne : LVzZ;
    //   162: getfield Dne : LJik;
    //   165: invokevirtual Dne : ()F
    //   168: fload_2
    //   169: fsub
    //   170: ldc_w 0.33
    //   173: fadd
    //   174: fstore #12
    //   176: dload #8
    //   178: ldc2_w 2048.0
    //   181: ddiv
    //   182: invokestatic FWm : (D)I
    //   185: istore #13
    //   187: dload #10
    //   189: ldc2_w 2048.0
    //   192: ddiv
    //   193: invokestatic FWm : (D)I
    //   196: istore #14
    //   198: dload #8
    //   200: iload #13
    //   202: sipush #2048
    //   205: imul
    //   206: i2d
    //   207: dsub
    //   208: dstore #8
    //   210: dload #10
    //   212: iload #14
    //   214: sipush #2048
    //   217: imul
    //   218: i2d
    //   219: dsub
    //   220: dstore #10
    //   222: aload_0
    //   223: getfield Dne : LSnh;
    //   226: ldc_w '/environment/clouds.png'
    //   229: invokevirtual Dne : (Ljava/lang/String;)V
    //   232: sipush #3042
    //   235: invokestatic glEnable : (I)V
    //   238: sipush #770
    //   241: sipush #771
    //   244: invokestatic glBlendFunc : (II)V
    //   247: aload_0
    //   248: getfield Dne : LVzZ;
    //   251: fload_1
    //   252: invokevirtual Dne : (F)LchN;
    //   255: astore #15
    //   257: aload #15
    //   259: getfield Dne : D
    //   262: d2f
    //   263: fstore #16
    //   265: aload #15
    //   267: getfield FWm : D
    //   270: d2f
    //   271: fstore #17
    //   273: aload #15
    //   275: getfield bzF : D
    //   278: d2f
    //   279: fstore #18
    //   281: aload_0
    //   282: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   285: getfield Dne : LfZI;
    //   288: getfield bzF : Z
    //   291: ifeq -> 367
    //   294: fload #16
    //   296: ldc_w 30.0
    //   299: fmul
    //   300: fload #17
    //   302: ldc_w 59.0
    //   305: fmul
    //   306: fadd
    //   307: fload #18
    //   309: ldc_w 11.0
    //   312: fmul
    //   313: fadd
    //   314: ldc 100.0
    //   316: fdiv
    //   317: fstore #19
    //   319: fload #16
    //   321: ldc_w 30.0
    //   324: fmul
    //   325: fload #17
    //   327: ldc_w 70.0
    //   330: fmul
    //   331: fadd
    //   332: ldc 100.0
    //   334: fdiv
    //   335: fstore #20
    //   337: fload #16
    //   339: ldc_w 30.0
    //   342: fmul
    //   343: fload #18
    //   345: ldc_w 70.0
    //   348: fmul
    //   349: fadd
    //   350: ldc 100.0
    //   352: fdiv
    //   353: fstore #21
    //   355: fload #19
    //   357: fstore #16
    //   359: fload #20
    //   361: fstore #17
    //   363: fload #21
    //   365: fstore #18
    //   367: dload #8
    //   369: dconst_0
    //   370: dmul
    //   371: d2f
    //   372: fstore #19
    //   374: dload #10
    //   376: dconst_0
    //   377: dmul
    //   378: d2f
    //   379: fstore #20
    //   381: ldc_w 0.00390625
    //   384: fstore #21
    //   386: dload #8
    //   388: invokestatic FWm : (D)I
    //   391: i2f
    //   392: fload #21
    //   394: fmul
    //   395: fstore #19
    //   397: dload #10
    //   399: invokestatic FWm : (D)I
    //   402: i2f
    //   403: fload #21
    //   405: fmul
    //   406: fstore #20
    //   408: dload #8
    //   410: dload #8
    //   412: invokestatic FWm : (D)I
    //   415: i2d
    //   416: dsub
    //   417: d2f
    //   418: fstore #22
    //   420: dload #10
    //   422: dload #10
    //   424: invokestatic FWm : (D)I
    //   427: i2d
    //   428: dsub
    //   429: d2f
    //   430: fstore #23
    //   432: bipush #8
    //   434: istore #24
    //   436: iconst_4
    //   437: istore #25
    //   439: ldc_w 9.765625E-4
    //   442: fstore #26
    //   444: fload #4
    //   446: fconst_1
    //   447: fload #4
    //   449: invokestatic glScalef : (FFF)V
    //   452: iconst_0
    //   453: istore #27
    //   455: iload #27
    //   457: iconst_2
    //   458: if_icmpge -> 2085
    //   461: iload #27
    //   463: ifne -> 476
    //   466: iconst_0
    //   467: iconst_0
    //   468: iconst_0
    //   469: iconst_0
    //   470: invokestatic glColorMask : (ZZZZ)V
    //   473: goto -> 522
    //   476: aload_0
    //   477: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   480: getfield Dne : LfZI;
    //   483: getfield bzF : Z
    //   486: ifeq -> 515
    //   489: getstatic OEA.Dne : I
    //   492: ifne -> 505
    //   495: iconst_0
    //   496: iconst_1
    //   497: iconst_1
    //   498: iconst_1
    //   499: invokestatic glColorMask : (ZZZZ)V
    //   502: goto -> 522
    //   505: iconst_1
    //   506: iconst_0
    //   507: iconst_0
    //   508: iconst_1
    //   509: invokestatic glColorMask : (ZZZZ)V
    //   512: goto -> 522
    //   515: iconst_1
    //   516: iconst_1
    //   517: iconst_1
    //   518: iconst_1
    //   519: invokestatic glColorMask : (ZZZZ)V
    //   522: iload #25
    //   524: ineg
    //   525: iconst_1
    //   526: iadd
    //   527: istore #28
    //   529: iload #28
    //   531: iload #25
    //   533: if_icmpgt -> 2079
    //   536: iload #25
    //   538: ineg
    //   539: iconst_1
    //   540: iadd
    //   541: istore #29
    //   543: iload #29
    //   545: iload #25
    //   547: if_icmpgt -> 2073
    //   550: aload_3
    //   551: invokevirtual Dne : ()V
    //   554: iload #28
    //   556: iload #24
    //   558: imul
    //   559: i2f
    //   560: fstore #30
    //   562: iload #29
    //   564: iload #24
    //   566: imul
    //   567: i2f
    //   568: fstore #31
    //   570: fload #30
    //   572: fload #22
    //   574: fsub
    //   575: fstore #32
    //   577: fload #31
    //   579: fload #23
    //   581: fsub
    //   582: fstore #33
    //   584: fload #12
    //   586: fload #5
    //   588: fneg
    //   589: fconst_1
    //   590: fsub
    //   591: fcmpl
    //   592: ifle -> 808
    //   595: aload_3
    //   596: fload #16
    //   598: ldc_w 0.7
    //   601: fmul
    //   602: fload #17
    //   604: ldc_w 0.7
    //   607: fmul
    //   608: fload #18
    //   610: ldc_w 0.7
    //   613: fmul
    //   614: ldc 0.8
    //   616: invokevirtual Dne : (FFFF)V
    //   619: aload_3
    //   620: fconst_0
    //   621: ldc_w -1.0
    //   624: fconst_0
    //   625: invokevirtual FWm : (FFF)V
    //   628: aload_3
    //   629: fload #32
    //   631: fconst_0
    //   632: fadd
    //   633: f2d
    //   634: fload #12
    //   636: fconst_0
    //   637: fadd
    //   638: f2d
    //   639: fload #33
    //   641: iload #24
    //   643: i2f
    //   644: fadd
    //   645: f2d
    //   646: fload #30
    //   648: fconst_0
    //   649: fadd
    //   650: fload #21
    //   652: fmul
    //   653: fload #19
    //   655: fadd
    //   656: f2d
    //   657: fload #31
    //   659: iload #24
    //   661: i2f
    //   662: fadd
    //   663: fload #21
    //   665: fmul
    //   666: fload #20
    //   668: fadd
    //   669: f2d
    //   670: invokevirtual Dne : (DDDDD)V
    //   673: aload_3
    //   674: fload #32
    //   676: iload #24
    //   678: i2f
    //   679: fadd
    //   680: f2d
    //   681: fload #12
    //   683: fconst_0
    //   684: fadd
    //   685: f2d
    //   686: fload #33
    //   688: iload #24
    //   690: i2f
    //   691: fadd
    //   692: f2d
    //   693: fload #30
    //   695: iload #24
    //   697: i2f
    //   698: fadd
    //   699: fload #21
    //   701: fmul
    //   702: fload #19
    //   704: fadd
    //   705: f2d
    //   706: fload #31
    //   708: iload #24
    //   710: i2f
    //   711: fadd
    //   712: fload #21
    //   714: fmul
    //   715: fload #20
    //   717: fadd
    //   718: f2d
    //   719: invokevirtual Dne : (DDDDD)V
    //   722: aload_3
    //   723: fload #32
    //   725: iload #24
    //   727: i2f
    //   728: fadd
    //   729: f2d
    //   730: fload #12
    //   732: fconst_0
    //   733: fadd
    //   734: f2d
    //   735: fload #33
    //   737: fconst_0
    //   738: fadd
    //   739: f2d
    //   740: fload #30
    //   742: iload #24
    //   744: i2f
    //   745: fadd
    //   746: fload #21
    //   748: fmul
    //   749: fload #19
    //   751: fadd
    //   752: f2d
    //   753: fload #31
    //   755: fconst_0
    //   756: fadd
    //   757: fload #21
    //   759: fmul
    //   760: fload #20
    //   762: fadd
    //   763: f2d
    //   764: invokevirtual Dne : (DDDDD)V
    //   767: aload_3
    //   768: fload #32
    //   770: fconst_0
    //   771: fadd
    //   772: f2d
    //   773: fload #12
    //   775: fconst_0
    //   776: fadd
    //   777: f2d
    //   778: fload #33
    //   780: fconst_0
    //   781: fadd
    //   782: f2d
    //   783: fload #30
    //   785: fconst_0
    //   786: fadd
    //   787: fload #21
    //   789: fmul
    //   790: fload #19
    //   792: fadd
    //   793: f2d
    //   794: fload #31
    //   796: fconst_0
    //   797: fadd
    //   798: fload #21
    //   800: fmul
    //   801: fload #20
    //   803: fadd
    //   804: f2d
    //   805: invokevirtual Dne : (DDDDD)V
    //   808: fload #12
    //   810: fload #5
    //   812: fconst_1
    //   813: fadd
    //   814: fcmpg
    //   815: ifgt -> 1033
    //   818: aload_3
    //   819: fload #16
    //   821: fload #17
    //   823: fload #18
    //   825: ldc 0.8
    //   827: invokevirtual Dne : (FFFF)V
    //   830: aload_3
    //   831: fconst_0
    //   832: fconst_1
    //   833: fconst_0
    //   834: invokevirtual FWm : (FFF)V
    //   837: aload_3
    //   838: fload #32
    //   840: fconst_0
    //   841: fadd
    //   842: f2d
    //   843: fload #12
    //   845: fload #5
    //   847: fadd
    //   848: fload #26
    //   850: fsub
    //   851: f2d
    //   852: fload #33
    //   854: iload #24
    //   856: i2f
    //   857: fadd
    //   858: f2d
    //   859: fload #30
    //   861: fconst_0
    //   862: fadd
    //   863: fload #21
    //   865: fmul
    //   866: fload #19
    //   868: fadd
    //   869: f2d
    //   870: fload #31
    //   872: iload #24
    //   874: i2f
    //   875: fadd
    //   876: fload #21
    //   878: fmul
    //   879: fload #20
    //   881: fadd
    //   882: f2d
    //   883: invokevirtual Dne : (DDDDD)V
    //   886: aload_3
    //   887: fload #32
    //   889: iload #24
    //   891: i2f
    //   892: fadd
    //   893: f2d
    //   894: fload #12
    //   896: fload #5
    //   898: fadd
    //   899: fload #26
    //   901: fsub
    //   902: f2d
    //   903: fload #33
    //   905: iload #24
    //   907: i2f
    //   908: fadd
    //   909: f2d
    //   910: fload #30
    //   912: iload #24
    //   914: i2f
    //   915: fadd
    //   916: fload #21
    //   918: fmul
    //   919: fload #19
    //   921: fadd
    //   922: f2d
    //   923: fload #31
    //   925: iload #24
    //   927: i2f
    //   928: fadd
    //   929: fload #21
    //   931: fmul
    //   932: fload #20
    //   934: fadd
    //   935: f2d
    //   936: invokevirtual Dne : (DDDDD)V
    //   939: aload_3
    //   940: fload #32
    //   942: iload #24
    //   944: i2f
    //   945: fadd
    //   946: f2d
    //   947: fload #12
    //   949: fload #5
    //   951: fadd
    //   952: fload #26
    //   954: fsub
    //   955: f2d
    //   956: fload #33
    //   958: fconst_0
    //   959: fadd
    //   960: f2d
    //   961: fload #30
    //   963: iload #24
    //   965: i2f
    //   966: fadd
    //   967: fload #21
    //   969: fmul
    //   970: fload #19
    //   972: fadd
    //   973: f2d
    //   974: fload #31
    //   976: fconst_0
    //   977: fadd
    //   978: fload #21
    //   980: fmul
    //   981: fload #20
    //   983: fadd
    //   984: f2d
    //   985: invokevirtual Dne : (DDDDD)V
    //   988: aload_3
    //   989: fload #32
    //   991: fconst_0
    //   992: fadd
    //   993: f2d
    //   994: fload #12
    //   996: fload #5
    //   998: fadd
    //   999: fload #26
    //   1001: fsub
    //   1002: f2d
    //   1003: fload #33
    //   1005: fconst_0
    //   1006: fadd
    //   1007: f2d
    //   1008: fload #30
    //   1010: fconst_0
    //   1011: fadd
    //   1012: fload #21
    //   1014: fmul
    //   1015: fload #19
    //   1017: fadd
    //   1018: f2d
    //   1019: fload #31
    //   1021: fconst_0
    //   1022: fadd
    //   1023: fload #21
    //   1025: fmul
    //   1026: fload #20
    //   1028: fadd
    //   1029: f2d
    //   1030: invokevirtual Dne : (DDDDD)V
    //   1033: aload_3
    //   1034: fload #16
    //   1036: ldc_w 0.9
    //   1039: fmul
    //   1040: fload #17
    //   1042: ldc_w 0.9
    //   1045: fmul
    //   1046: fload #18
    //   1048: ldc_w 0.9
    //   1051: fmul
    //   1052: ldc 0.8
    //   1054: invokevirtual Dne : (FFFF)V
    //   1057: iload #28
    //   1059: iconst_m1
    //   1060: if_icmple -> 1298
    //   1063: aload_3
    //   1064: ldc_w -1.0
    //   1067: fconst_0
    //   1068: fconst_0
    //   1069: invokevirtual FWm : (FFF)V
    //   1072: iconst_0
    //   1073: istore #34
    //   1075: iload #34
    //   1077: iload #24
    //   1079: if_icmpge -> 1298
    //   1082: aload_3
    //   1083: fload #32
    //   1085: iload #34
    //   1087: i2f
    //   1088: fadd
    //   1089: fconst_0
    //   1090: fadd
    //   1091: f2d
    //   1092: fload #12
    //   1094: fconst_0
    //   1095: fadd
    //   1096: f2d
    //   1097: fload #33
    //   1099: iload #24
    //   1101: i2f
    //   1102: fadd
    //   1103: f2d
    //   1104: fload #30
    //   1106: iload #34
    //   1108: i2f
    //   1109: fadd
    //   1110: ldc 0.5
    //   1112: fadd
    //   1113: fload #21
    //   1115: fmul
    //   1116: fload #19
    //   1118: fadd
    //   1119: f2d
    //   1120: fload #31
    //   1122: iload #24
    //   1124: i2f
    //   1125: fadd
    //   1126: fload #21
    //   1128: fmul
    //   1129: fload #20
    //   1131: fadd
    //   1132: f2d
    //   1133: invokevirtual Dne : (DDDDD)V
    //   1136: aload_3
    //   1137: fload #32
    //   1139: iload #34
    //   1141: i2f
    //   1142: fadd
    //   1143: fconst_0
    //   1144: fadd
    //   1145: f2d
    //   1146: fload #12
    //   1148: fload #5
    //   1150: fadd
    //   1151: f2d
    //   1152: fload #33
    //   1154: iload #24
    //   1156: i2f
    //   1157: fadd
    //   1158: f2d
    //   1159: fload #30
    //   1161: iload #34
    //   1163: i2f
    //   1164: fadd
    //   1165: ldc 0.5
    //   1167: fadd
    //   1168: fload #21
    //   1170: fmul
    //   1171: fload #19
    //   1173: fadd
    //   1174: f2d
    //   1175: fload #31
    //   1177: iload #24
    //   1179: i2f
    //   1180: fadd
    //   1181: fload #21
    //   1183: fmul
    //   1184: fload #20
    //   1186: fadd
    //   1187: f2d
    //   1188: invokevirtual Dne : (DDDDD)V
    //   1191: aload_3
    //   1192: fload #32
    //   1194: iload #34
    //   1196: i2f
    //   1197: fadd
    //   1198: fconst_0
    //   1199: fadd
    //   1200: f2d
    //   1201: fload #12
    //   1203: fload #5
    //   1205: fadd
    //   1206: f2d
    //   1207: fload #33
    //   1209: fconst_0
    //   1210: fadd
    //   1211: f2d
    //   1212: fload #30
    //   1214: iload #34
    //   1216: i2f
    //   1217: fadd
    //   1218: ldc 0.5
    //   1220: fadd
    //   1221: fload #21
    //   1223: fmul
    //   1224: fload #19
    //   1226: fadd
    //   1227: f2d
    //   1228: fload #31
    //   1230: fconst_0
    //   1231: fadd
    //   1232: fload #21
    //   1234: fmul
    //   1235: fload #20
    //   1237: fadd
    //   1238: f2d
    //   1239: invokevirtual Dne : (DDDDD)V
    //   1242: aload_3
    //   1243: fload #32
    //   1245: iload #34
    //   1247: i2f
    //   1248: fadd
    //   1249: fconst_0
    //   1250: fadd
    //   1251: f2d
    //   1252: fload #12
    //   1254: fconst_0
    //   1255: fadd
    //   1256: f2d
    //   1257: fload #33
    //   1259: fconst_0
    //   1260: fadd
    //   1261: f2d
    //   1262: fload #30
    //   1264: iload #34
    //   1266: i2f
    //   1267: fadd
    //   1268: ldc 0.5
    //   1270: fadd
    //   1271: fload #21
    //   1273: fmul
    //   1274: fload #19
    //   1276: fadd
    //   1277: f2d
    //   1278: fload #31
    //   1280: fconst_0
    //   1281: fadd
    //   1282: fload #21
    //   1284: fmul
    //   1285: fload #20
    //   1287: fadd
    //   1288: f2d
    //   1289: invokevirtual Dne : (DDDDD)V
    //   1292: iinc #34, 1
    //   1295: goto -> 1075
    //   1298: iload #28
    //   1300: iconst_1
    //   1301: if_icmpgt -> 1549
    //   1304: aload_3
    //   1305: fconst_1
    //   1306: fconst_0
    //   1307: fconst_0
    //   1308: invokevirtual FWm : (FFF)V
    //   1311: iconst_0
    //   1312: istore #34
    //   1314: iload #34
    //   1316: iload #24
    //   1318: if_icmpge -> 1549
    //   1321: aload_3
    //   1322: fload #32
    //   1324: iload #34
    //   1326: i2f
    //   1327: fadd
    //   1328: fconst_1
    //   1329: fadd
    //   1330: fload #26
    //   1332: fsub
    //   1333: f2d
    //   1334: fload #12
    //   1336: fconst_0
    //   1337: fadd
    //   1338: f2d
    //   1339: fload #33
    //   1341: iload #24
    //   1343: i2f
    //   1344: fadd
    //   1345: f2d
    //   1346: fload #30
    //   1348: iload #34
    //   1350: i2f
    //   1351: fadd
    //   1352: ldc 0.5
    //   1354: fadd
    //   1355: fload #21
    //   1357: fmul
    //   1358: fload #19
    //   1360: fadd
    //   1361: f2d
    //   1362: fload #31
    //   1364: iload #24
    //   1366: i2f
    //   1367: fadd
    //   1368: fload #21
    //   1370: fmul
    //   1371: fload #20
    //   1373: fadd
    //   1374: f2d
    //   1375: invokevirtual Dne : (DDDDD)V
    //   1378: aload_3
    //   1379: fload #32
    //   1381: iload #34
    //   1383: i2f
    //   1384: fadd
    //   1385: fconst_1
    //   1386: fadd
    //   1387: fload #26
    //   1389: fsub
    //   1390: f2d
    //   1391: fload #12
    //   1393: fload #5
    //   1395: fadd
    //   1396: f2d
    //   1397: fload #33
    //   1399: iload #24
    //   1401: i2f
    //   1402: fadd
    //   1403: f2d
    //   1404: fload #30
    //   1406: iload #34
    //   1408: i2f
    //   1409: fadd
    //   1410: ldc 0.5
    //   1412: fadd
    //   1413: fload #21
    //   1415: fmul
    //   1416: fload #19
    //   1418: fadd
    //   1419: f2d
    //   1420: fload #31
    //   1422: iload #24
    //   1424: i2f
    //   1425: fadd
    //   1426: fload #21
    //   1428: fmul
    //   1429: fload #20
    //   1431: fadd
    //   1432: f2d
    //   1433: invokevirtual Dne : (DDDDD)V
    //   1436: aload_3
    //   1437: fload #32
    //   1439: iload #34
    //   1441: i2f
    //   1442: fadd
    //   1443: fconst_1
    //   1444: fadd
    //   1445: fload #26
    //   1447: fsub
    //   1448: f2d
    //   1449: fload #12
    //   1451: fload #5
    //   1453: fadd
    //   1454: f2d
    //   1455: fload #33
    //   1457: fconst_0
    //   1458: fadd
    //   1459: f2d
    //   1460: fload #30
    //   1462: iload #34
    //   1464: i2f
    //   1465: fadd
    //   1466: ldc 0.5
    //   1468: fadd
    //   1469: fload #21
    //   1471: fmul
    //   1472: fload #19
    //   1474: fadd
    //   1475: f2d
    //   1476: fload #31
    //   1478: fconst_0
    //   1479: fadd
    //   1480: fload #21
    //   1482: fmul
    //   1483: fload #20
    //   1485: fadd
    //   1486: f2d
    //   1487: invokevirtual Dne : (DDDDD)V
    //   1490: aload_3
    //   1491: fload #32
    //   1493: iload #34
    //   1495: i2f
    //   1496: fadd
    //   1497: fconst_1
    //   1498: fadd
    //   1499: fload #26
    //   1501: fsub
    //   1502: f2d
    //   1503: fload #12
    //   1505: fconst_0
    //   1506: fadd
    //   1507: f2d
    //   1508: fload #33
    //   1510: fconst_0
    //   1511: fadd
    //   1512: f2d
    //   1513: fload #30
    //   1515: iload #34
    //   1517: i2f
    //   1518: fadd
    //   1519: ldc 0.5
    //   1521: fadd
    //   1522: fload #21
    //   1524: fmul
    //   1525: fload #19
    //   1527: fadd
    //   1528: f2d
    //   1529: fload #31
    //   1531: fconst_0
    //   1532: fadd
    //   1533: fload #21
    //   1535: fmul
    //   1536: fload #20
    //   1538: fadd
    //   1539: f2d
    //   1540: invokevirtual Dne : (DDDDD)V
    //   1543: iinc #34, 1
    //   1546: goto -> 1314
    //   1549: aload_3
    //   1550: fload #16
    //   1552: ldc 0.8
    //   1554: fmul
    //   1555: fload #17
    //   1557: ldc 0.8
    //   1559: fmul
    //   1560: fload #18
    //   1562: ldc 0.8
    //   1564: fmul
    //   1565: ldc 0.8
    //   1567: invokevirtual Dne : (FFFF)V
    //   1570: iload #29
    //   1572: iconst_m1
    //   1573: if_icmple -> 1811
    //   1576: aload_3
    //   1577: fconst_0
    //   1578: fconst_0
    //   1579: ldc_w -1.0
    //   1582: invokevirtual FWm : (FFF)V
    //   1585: iconst_0
    //   1586: istore #34
    //   1588: iload #34
    //   1590: iload #24
    //   1592: if_icmpge -> 1811
    //   1595: aload_3
    //   1596: fload #32
    //   1598: fconst_0
    //   1599: fadd
    //   1600: f2d
    //   1601: fload #12
    //   1603: fload #5
    //   1605: fadd
    //   1606: f2d
    //   1607: fload #33
    //   1609: iload #34
    //   1611: i2f
    //   1612: fadd
    //   1613: fconst_0
    //   1614: fadd
    //   1615: f2d
    //   1616: fload #30
    //   1618: fconst_0
    //   1619: fadd
    //   1620: fload #21
    //   1622: fmul
    //   1623: fload #19
    //   1625: fadd
    //   1626: f2d
    //   1627: fload #31
    //   1629: iload #34
    //   1631: i2f
    //   1632: fadd
    //   1633: ldc 0.5
    //   1635: fadd
    //   1636: fload #21
    //   1638: fmul
    //   1639: fload #20
    //   1641: fadd
    //   1642: f2d
    //   1643: invokevirtual Dne : (DDDDD)V
    //   1646: aload_3
    //   1647: fload #32
    //   1649: iload #24
    //   1651: i2f
    //   1652: fadd
    //   1653: f2d
    //   1654: fload #12
    //   1656: fload #5
    //   1658: fadd
    //   1659: f2d
    //   1660: fload #33
    //   1662: iload #34
    //   1664: i2f
    //   1665: fadd
    //   1666: fconst_0
    //   1667: fadd
    //   1668: f2d
    //   1669: fload #30
    //   1671: iload #24
    //   1673: i2f
    //   1674: fadd
    //   1675: fload #21
    //   1677: fmul
    //   1678: fload #19
    //   1680: fadd
    //   1681: f2d
    //   1682: fload #31
    //   1684: iload #34
    //   1686: i2f
    //   1687: fadd
    //   1688: ldc 0.5
    //   1690: fadd
    //   1691: fload #21
    //   1693: fmul
    //   1694: fload #20
    //   1696: fadd
    //   1697: f2d
    //   1698: invokevirtual Dne : (DDDDD)V
    //   1701: aload_3
    //   1702: fload #32
    //   1704: iload #24
    //   1706: i2f
    //   1707: fadd
    //   1708: f2d
    //   1709: fload #12
    //   1711: fconst_0
    //   1712: fadd
    //   1713: f2d
    //   1714: fload #33
    //   1716: iload #34
    //   1718: i2f
    //   1719: fadd
    //   1720: fconst_0
    //   1721: fadd
    //   1722: f2d
    //   1723: fload #30
    //   1725: iload #24
    //   1727: i2f
    //   1728: fadd
    //   1729: fload #21
    //   1731: fmul
    //   1732: fload #19
    //   1734: fadd
    //   1735: f2d
    //   1736: fload #31
    //   1738: iload #34
    //   1740: i2f
    //   1741: fadd
    //   1742: ldc 0.5
    //   1744: fadd
    //   1745: fload #21
    //   1747: fmul
    //   1748: fload #20
    //   1750: fadd
    //   1751: f2d
    //   1752: invokevirtual Dne : (DDDDD)V
    //   1755: aload_3
    //   1756: fload #32
    //   1758: fconst_0
    //   1759: fadd
    //   1760: f2d
    //   1761: fload #12
    //   1763: fconst_0
    //   1764: fadd
    //   1765: f2d
    //   1766: fload #33
    //   1768: iload #34
    //   1770: i2f
    //   1771: fadd
    //   1772: fconst_0
    //   1773: fadd
    //   1774: f2d
    //   1775: fload #30
    //   1777: fconst_0
    //   1778: fadd
    //   1779: fload #21
    //   1781: fmul
    //   1782: fload #19
    //   1784: fadd
    //   1785: f2d
    //   1786: fload #31
    //   1788: iload #34
    //   1790: i2f
    //   1791: fadd
    //   1792: ldc 0.5
    //   1794: fadd
    //   1795: fload #21
    //   1797: fmul
    //   1798: fload #20
    //   1800: fadd
    //   1801: f2d
    //   1802: invokevirtual Dne : (DDDDD)V
    //   1805: iinc #34, 1
    //   1808: goto -> 1588
    //   1811: iload #29
    //   1813: iconst_1
    //   1814: if_icmpgt -> 2062
    //   1817: aload_3
    //   1818: fconst_0
    //   1819: fconst_0
    //   1820: fconst_1
    //   1821: invokevirtual FWm : (FFF)V
    //   1824: iconst_0
    //   1825: istore #34
    //   1827: iload #34
    //   1829: iload #24
    //   1831: if_icmpge -> 2062
    //   1834: aload_3
    //   1835: fload #32
    //   1837: fconst_0
    //   1838: fadd
    //   1839: f2d
    //   1840: fload #12
    //   1842: fload #5
    //   1844: fadd
    //   1845: f2d
    //   1846: fload #33
    //   1848: iload #34
    //   1850: i2f
    //   1851: fadd
    //   1852: fconst_1
    //   1853: fadd
    //   1854: fload #26
    //   1856: fsub
    //   1857: f2d
    //   1858: fload #30
    //   1860: fconst_0
    //   1861: fadd
    //   1862: fload #21
    //   1864: fmul
    //   1865: fload #19
    //   1867: fadd
    //   1868: f2d
    //   1869: fload #31
    //   1871: iload #34
    //   1873: i2f
    //   1874: fadd
    //   1875: ldc 0.5
    //   1877: fadd
    //   1878: fload #21
    //   1880: fmul
    //   1881: fload #20
    //   1883: fadd
    //   1884: f2d
    //   1885: invokevirtual Dne : (DDDDD)V
    //   1888: aload_3
    //   1889: fload #32
    //   1891: iload #24
    //   1893: i2f
    //   1894: fadd
    //   1895: f2d
    //   1896: fload #12
    //   1898: fload #5
    //   1900: fadd
    //   1901: f2d
    //   1902: fload #33
    //   1904: iload #34
    //   1906: i2f
    //   1907: fadd
    //   1908: fconst_1
    //   1909: fadd
    //   1910: fload #26
    //   1912: fsub
    //   1913: f2d
    //   1914: fload #30
    //   1916: iload #24
    //   1918: i2f
    //   1919: fadd
    //   1920: fload #21
    //   1922: fmul
    //   1923: fload #19
    //   1925: fadd
    //   1926: f2d
    //   1927: fload #31
    //   1929: iload #34
    //   1931: i2f
    //   1932: fadd
    //   1933: ldc 0.5
    //   1935: fadd
    //   1936: fload #21
    //   1938: fmul
    //   1939: fload #20
    //   1941: fadd
    //   1942: f2d
    //   1943: invokevirtual Dne : (DDDDD)V
    //   1946: aload_3
    //   1947: fload #32
    //   1949: iload #24
    //   1951: i2f
    //   1952: fadd
    //   1953: f2d
    //   1954: fload #12
    //   1956: fconst_0
    //   1957: fadd
    //   1958: f2d
    //   1959: fload #33
    //   1961: iload #34
    //   1963: i2f
    //   1964: fadd
    //   1965: fconst_1
    //   1966: fadd
    //   1967: fload #26
    //   1969: fsub
    //   1970: f2d
    //   1971: fload #30
    //   1973: iload #24
    //   1975: i2f
    //   1976: fadd
    //   1977: fload #21
    //   1979: fmul
    //   1980: fload #19
    //   1982: fadd
    //   1983: f2d
    //   1984: fload #31
    //   1986: iload #34
    //   1988: i2f
    //   1989: fadd
    //   1990: ldc 0.5
    //   1992: fadd
    //   1993: fload #21
    //   1995: fmul
    //   1996: fload #20
    //   1998: fadd
    //   1999: f2d
    //   2000: invokevirtual Dne : (DDDDD)V
    //   2003: aload_3
    //   2004: fload #32
    //   2006: fconst_0
    //   2007: fadd
    //   2008: f2d
    //   2009: fload #12
    //   2011: fconst_0
    //   2012: fadd
    //   2013: f2d
    //   2014: fload #33
    //   2016: iload #34
    //   2018: i2f
    //   2019: fadd
    //   2020: fconst_1
    //   2021: fadd
    //   2022: fload #26
    //   2024: fsub
    //   2025: f2d
    //   2026: fload #30
    //   2028: fconst_0
    //   2029: fadd
    //   2030: fload #21
    //   2032: fmul
    //   2033: fload #19
    //   2035: fadd
    //   2036: f2d
    //   2037: fload #31
    //   2039: iload #34
    //   2041: i2f
    //   2042: fadd
    //   2043: ldc 0.5
    //   2045: fadd
    //   2046: fload #21
    //   2048: fmul
    //   2049: fload #20
    //   2051: fadd
    //   2052: f2d
    //   2053: invokevirtual Dne : (DDDDD)V
    //   2056: iinc #34, 1
    //   2059: goto -> 1827
    //   2062: aload_3
    //   2063: invokevirtual Dne : ()I
    //   2066: pop
    //   2067: iinc #29, 1
    //   2070: goto -> 543
    //   2073: iinc #28, 1
    //   2076: goto -> 529
    //   2079: iinc #27, 1
    //   2082: goto -> 455
    //   2085: fconst_1
    //   2086: fconst_1
    //   2087: fconst_1
    //   2088: fconst_1
    //   2089: invokestatic glColor4f : (FFFF)V
    //   2092: sipush #3042
    //   2095: invokestatic glDisable : (I)V
    //   2098: sipush #2884
    //   2101: invokestatic glEnable : (I)V
    //   2104: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    FWm(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1);
  }
  
  public CAZ Dne(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    if (this.Dne != null && ((Minecraft)this.Dne).Dne != null && ((Minecraft)this.Dne).Dne != null) {
      byte b;
      HkG hkG;
      gWM gWM;
      boolean bool = ((fZI)((Minecraft)this.Dne).Dne).mrb;
      if (bool == true && ((VzZ)this.Dne).Dne.nextInt(3) == 0)
        b = 2; 
      double d1 = ((Minecraft)this.Dne).Dne.div - paramDouble1;
      double d2 = ((Minecraft)this.Dne).Dne.IjH - paramDouble2;
      double d3 = ((Minecraft)this.Dne).Dne.mrb - paramDouble3;
      Rtm rtm = null;
      if (paramString.equals("hugeexplosion")) {
        ((Minecraft)this.Dne).Dne.Dne(rtm = new Rtm((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
      } else if (paramString.equals("largeexplode")) {
        dfd dfd;
        ((Minecraft)this.Dne).Dne.Dne(dfd = new dfd((Snh)this.Dne, (Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
      } else if (paramString.equals("fireworksSpark")) {
        ((Minecraft)this.Dne).Dne.Dne(hkG = new HkG((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, (BMa)((Minecraft)this.Dne).Dne));
      } 
      if (hkG != null)
        return hkG; 
      double d4 = 16.0D;
      if (d1 * d1 + d2 * d2 + d3 * d3 > d4 * d4)
        return null; 
      if (b > 1)
        return null; 
      if (paramString.equals("bubble")) {
        gwy gwy = new gwy((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("suspended")) {
        tvf tvf = new tvf((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("depthsuspend")) {
        ywl ywl = new ywl((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("townaura")) {
        ywl ywl = new ywl((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("crit")) {
        KUG kUG = new KUG((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("magicCrit")) {
        KUG kUG = new KUG((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
        kUG.Dne(kUG.b_() * 0.3F, kUG.FWm() * 0.8F, kUG.bzF());
        kUG.bzF();
      } else if (paramString.equals("smoke")) {
        bsu bsu = new bsu((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("mobSpell")) {
        Cbk cbk = new Cbk((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
        cbk.Dne((float)paramDouble4, (float)paramDouble5, (float)paramDouble6);
      } else if (paramString.equals("mobSpellAmbient")) {
        Cbk cbk = new Cbk((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
        cbk.a_(0.15F);
        cbk.Dne((float)paramDouble4, (float)paramDouble5, (float)paramDouble6);
      } else if (paramString.equals("spell")) {
        Cbk cbk = new Cbk((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("instantSpell")) {
        Cbk cbk = new Cbk((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
        cbk.Dne(144);
      } else if (paramString.equals("witchMagic")) {
        Cbk cbk = new Cbk((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
        cbk.Dne(144);
        float f = ((VzZ)this.Dne).Dne.nextFloat() * 0.5F + 0.35F;
        cbk.Dne(1.0F * f, 0.0F * f, 1.0F * f);
      } else if (paramString.equals("note")) {
        RlB rlB = new RlB((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("portal")) {
        kPv kPv = new kPv((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("enchantmenttable")) {
        NYy nYy = new NYy((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("explode")) {
        JTe jTe = new JTe((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("flame")) {
        FXJ fXJ = new FXJ((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("lava")) {
        asS asS = new asS((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3);
      } else if (paramString.equals("footstep")) {
        bHB bHB = new bHB((Snh)this.Dne, (Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3);
      } else if (paramString.equals("splash")) {
        ReK reK = new ReK((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("largesmoke")) {
        bsu bsu = new bsu((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.5F);
      } else if (paramString.equals("cloud")) {
        Cch cch = new Cch((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("reddust")) {
        dhs dhs = new dhs((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, (float)paramDouble4, (float)paramDouble5, (float)paramDouble6);
      } else if (paramString.equals("snowballpoof")) {
        gwo gwo = new gwo((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, dEr.iNQ, (Snh)this.Dne);
      } else if (paramString.equals("dripWater")) {
        lMw lMw = new lMw((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, KFd.div);
      } else if (paramString.equals("dripLava")) {
        lMw lMw = new lMw((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, KFd.IjH);
      } else if (paramString.equals("snowshovel")) {
        DwD dwD = new DwD((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("slime")) {
        gwo gwo = new gwo((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, dEr.jBE, (Snh)this.Dne);
      } else if (paramString.equals("heart")) {
        BRZ bRZ = new BRZ((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      } else if (paramString.equals("angryVillager")) {
        BRZ bRZ = new BRZ((Qnq)this.Dne, paramDouble1, paramDouble2 + 0.5D, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
        bRZ.bzF(81);
        bRZ.Dne(1.0F, 1.0F, 1.0F);
      } else if (paramString.equals("happyVillager")) {
        ywl ywl = new ywl((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
        ywl.bzF(82);
        ywl.Dne(1.0F, 1.0F, 1.0F);
      } else if (paramString.startsWith("iconcrack_")) {
        int i = Integer.parseInt(paramString.substring(paramString.indexOf("_") + 1));
        gwo gwo = new gwo((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, dEr.Dne[i], (Snh)this.Dne);
      } else if (paramString.startsWith("tilecrack_")) {
        String[] arrayOfString = paramString.split("_", 3);
        int i = Integer.parseInt(arrayOfString[1]);
        int j = Integer.parseInt(arrayOfString[2]);
        gWM = (new gWM((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, zKP.Dne[i], 0, j, (Snh)this.Dne)).Dne(j);
      } 
      if (gWM != null)
        ((Minecraft)this.Dne).Dne.Dne(gWM); 
      return gWM;
    } 
    return null;
  }
  
  public void FWm(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LVzZ;
    //   7: getfield Dne : LJik;
    //   10: invokevirtual Dne : ()Z
    //   13: ifeq -> 679
    //   16: aload_0
    //   17: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   20: getfield Dne : LfZI;
    //   23: getfield aFZ : Z
    //   26: ifeq -> 37
    //   29: aload_0
    //   30: fload_1
    //   31: invokevirtual bzF : (F)V
    //   34: goto -> 679
    //   37: sipush #2884
    //   40: invokestatic glDisable : (I)V
    //   43: aload_0
    //   44: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   47: getfield Dne : LFUH;
    //   50: getfield ooe : D
    //   53: aload_0
    //   54: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   57: getfield Dne : LFUH;
    //   60: getfield IjH : D
    //   63: aload_0
    //   64: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   67: getfield Dne : LFUH;
    //   70: getfield ooe : D
    //   73: dsub
    //   74: fload_1
    //   75: f2d
    //   76: dmul
    //   77: dadd
    //   78: d2f
    //   79: fstore_2
    //   80: bipush #32
    //   82: istore_3
    //   83: sipush #256
    //   86: iload_3
    //   87: idiv
    //   88: istore #4
    //   90: getstatic WAR.Dne : LWAR;
    //   93: astore #5
    //   95: aload_0
    //   96: getfield Dne : LSnh;
    //   99: ldc_w '/environment/clouds.png'
    //   102: invokevirtual Dne : (Ljava/lang/String;)V
    //   105: sipush #3042
    //   108: invokestatic glEnable : (I)V
    //   111: sipush #770
    //   114: sipush #771
    //   117: invokestatic glBlendFunc : (II)V
    //   120: aload_0
    //   121: getfield Dne : LVzZ;
    //   124: fload_1
    //   125: invokevirtual Dne : (F)LchN;
    //   128: astore #6
    //   130: aload #6
    //   132: getfield Dne : D
    //   135: d2f
    //   136: fstore #7
    //   138: aload #6
    //   140: getfield FWm : D
    //   143: d2f
    //   144: fstore #8
    //   146: aload #6
    //   148: getfield bzF : D
    //   151: d2f
    //   152: fstore #9
    //   154: aload_0
    //   155: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   158: getfield Dne : LfZI;
    //   161: getfield bzF : Z
    //   164: ifeq -> 240
    //   167: fload #7
    //   169: ldc_w 30.0
    //   172: fmul
    //   173: fload #8
    //   175: ldc_w 59.0
    //   178: fmul
    //   179: fadd
    //   180: fload #9
    //   182: ldc_w 11.0
    //   185: fmul
    //   186: fadd
    //   187: ldc 100.0
    //   189: fdiv
    //   190: fstore #10
    //   192: fload #7
    //   194: ldc_w 30.0
    //   197: fmul
    //   198: fload #8
    //   200: ldc_w 70.0
    //   203: fmul
    //   204: fadd
    //   205: ldc 100.0
    //   207: fdiv
    //   208: fstore #11
    //   210: fload #7
    //   212: ldc_w 30.0
    //   215: fmul
    //   216: fload #9
    //   218: ldc_w 70.0
    //   221: fmul
    //   222: fadd
    //   223: ldc 100.0
    //   225: fdiv
    //   226: fstore #12
    //   228: fload #10
    //   230: fstore #7
    //   232: fload #11
    //   234: fstore #8
    //   236: fload #12
    //   238: fstore #9
    //   240: ldc_w 4.8828125E-4
    //   243: fstore #10
    //   245: aload_0
    //   246: getfield zGp : I
    //   249: i2f
    //   250: fload_1
    //   251: fadd
    //   252: f2d
    //   253: dstore #11
    //   255: aload_0
    //   256: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   259: getfield Dne : LFUH;
    //   262: getfield aFZ : D
    //   265: aload_0
    //   266: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   269: getfield Dne : LFUH;
    //   272: getfield div : D
    //   275: aload_0
    //   276: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   279: getfield Dne : LFUH;
    //   282: getfield aFZ : D
    //   285: dsub
    //   286: fload_1
    //   287: f2d
    //   288: dmul
    //   289: dadd
    //   290: dload #11
    //   292: ldc2_w 0.029999999329447746
    //   295: dmul
    //   296: dadd
    //   297: dstore #13
    //   299: aload_0
    //   300: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   303: getfield Dne : LFUH;
    //   306: getfield DyG : D
    //   309: aload_0
    //   310: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   313: getfield Dne : LFUH;
    //   316: getfield mrb : D
    //   319: aload_0
    //   320: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   323: getfield Dne : LFUH;
    //   326: getfield DyG : D
    //   329: dsub
    //   330: fload_1
    //   331: f2d
    //   332: dmul
    //   333: dadd
    //   334: dstore #15
    //   336: dload #13
    //   338: ldc2_w 2048.0
    //   341: ddiv
    //   342: invokestatic FWm : (D)I
    //   345: istore #17
    //   347: dload #15
    //   349: ldc2_w 2048.0
    //   352: ddiv
    //   353: invokestatic FWm : (D)I
    //   356: istore #18
    //   358: dload #13
    //   360: iload #17
    //   362: sipush #2048
    //   365: imul
    //   366: i2d
    //   367: dsub
    //   368: dstore #13
    //   370: dload #15
    //   372: iload #18
    //   374: sipush #2048
    //   377: imul
    //   378: i2d
    //   379: dsub
    //   380: dstore #15
    //   382: aload_0
    //   383: getfield Dne : LVzZ;
    //   386: getfield Dne : LJik;
    //   389: invokevirtual Dne : ()F
    //   392: fload_2
    //   393: fsub
    //   394: ldc_w 0.33
    //   397: fadd
    //   398: fstore #19
    //   400: dload #13
    //   402: fload #10
    //   404: f2d
    //   405: dmul
    //   406: d2f
    //   407: fstore #20
    //   409: dload #15
    //   411: fload #10
    //   413: f2d
    //   414: dmul
    //   415: d2f
    //   416: fstore #21
    //   418: aload #5
    //   420: invokevirtual Dne : ()V
    //   423: aload #5
    //   425: fload #7
    //   427: fload #8
    //   429: fload #9
    //   431: ldc 0.8
    //   433: invokevirtual Dne : (FFFF)V
    //   436: iload_3
    //   437: ineg
    //   438: iload #4
    //   440: imul
    //   441: istore #22
    //   443: iload #22
    //   445: iload_3
    //   446: iload #4
    //   448: imul
    //   449: if_icmpge -> 654
    //   452: iload_3
    //   453: ineg
    //   454: iload #4
    //   456: imul
    //   457: istore #23
    //   459: iload #23
    //   461: iload_3
    //   462: iload #4
    //   464: imul
    //   465: if_icmpge -> 645
    //   468: aload #5
    //   470: iload #22
    //   472: iconst_0
    //   473: iadd
    //   474: i2d
    //   475: fload #19
    //   477: f2d
    //   478: iload #23
    //   480: iload_3
    //   481: iadd
    //   482: i2d
    //   483: iload #22
    //   485: iconst_0
    //   486: iadd
    //   487: i2f
    //   488: fload #10
    //   490: fmul
    //   491: fload #20
    //   493: fadd
    //   494: f2d
    //   495: iload #23
    //   497: iload_3
    //   498: iadd
    //   499: i2f
    //   500: fload #10
    //   502: fmul
    //   503: fload #21
    //   505: fadd
    //   506: f2d
    //   507: invokevirtual Dne : (DDDDD)V
    //   510: aload #5
    //   512: iload #22
    //   514: iload_3
    //   515: iadd
    //   516: i2d
    //   517: fload #19
    //   519: f2d
    //   520: iload #23
    //   522: iload_3
    //   523: iadd
    //   524: i2d
    //   525: iload #22
    //   527: iload_3
    //   528: iadd
    //   529: i2f
    //   530: fload #10
    //   532: fmul
    //   533: fload #20
    //   535: fadd
    //   536: f2d
    //   537: iload #23
    //   539: iload_3
    //   540: iadd
    //   541: i2f
    //   542: fload #10
    //   544: fmul
    //   545: fload #21
    //   547: fadd
    //   548: f2d
    //   549: invokevirtual Dne : (DDDDD)V
    //   552: aload #5
    //   554: iload #22
    //   556: iload_3
    //   557: iadd
    //   558: i2d
    //   559: fload #19
    //   561: f2d
    //   562: iload #23
    //   564: iconst_0
    //   565: iadd
    //   566: i2d
    //   567: iload #22
    //   569: iload_3
    //   570: iadd
    //   571: i2f
    //   572: fload #10
    //   574: fmul
    //   575: fload #20
    //   577: fadd
    //   578: f2d
    //   579: iload #23
    //   581: iconst_0
    //   582: iadd
    //   583: i2f
    //   584: fload #10
    //   586: fmul
    //   587: fload #21
    //   589: fadd
    //   590: f2d
    //   591: invokevirtual Dne : (DDDDD)V
    //   594: aload #5
    //   596: iload #22
    //   598: iconst_0
    //   599: iadd
    //   600: i2d
    //   601: fload #19
    //   603: f2d
    //   604: iload #23
    //   606: iconst_0
    //   607: iadd
    //   608: i2d
    //   609: iload #22
    //   611: iconst_0
    //   612: iadd
    //   613: i2f
    //   614: fload #10
    //   616: fmul
    //   617: fload #20
    //   619: fadd
    //   620: f2d
    //   621: iload #23
    //   623: iconst_0
    //   624: iadd
    //   625: i2f
    //   626: fload #10
    //   628: fmul
    //   629: fload #21
    //   631: fadd
    //   632: f2d
    //   633: invokevirtual Dne : (DDDDD)V
    //   636: iload #23
    //   638: iload_3
    //   639: iadd
    //   640: istore #23
    //   642: goto -> 459
    //   645: iload #22
    //   647: iload_3
    //   648: iadd
    //   649: istore #22
    //   651: goto -> 443
    //   654: aload #5
    //   656: invokevirtual Dne : ()I
    //   659: pop
    //   660: fconst_1
    //   661: fconst_1
    //   662: fconst_1
    //   663: fconst_1
    //   664: invokestatic glColor4f : (FFFF)V
    //   667: sipush #3042
    //   670: invokestatic glDisable : (I)V
    //   673: sipush #2884
    //   676: invokestatic glEnable : (I)V
    //   679: return
  }
  
  public void FWm(sMa paramsMa) {
    if (paramsMa.Dne != null)
      this.Dne.FWm(paramsMa.Dne); 
    if (paramsMa.FWm != null)
      this.Dne.FWm(paramsMa.FWm); 
  }
  
  public void Dne(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: ifnull -> 704
    //   7: getstatic zKP.Dne : LVOy;
    //   10: aload_0
    //   11: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   14: getfield Dne : LfZI;
    //   17: getfield aFZ : Z
    //   20: invokevirtual Dne : (Z)V
    //   23: aload_0
    //   24: aload_0
    //   25: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   28: getfield Dne : LfZI;
    //   31: getfield Dne : I
    //   34: putfield trS : I
    //   37: aload_0
    //   38: getfield FWm : [Lsnt;
    //   41: ifnull -> 70
    //   44: iconst_0
    //   45: istore_1
    //   46: iload_1
    //   47: aload_0
    //   48: getfield FWm : [Lsnt;
    //   51: arraylength
    //   52: if_icmpge -> 70
    //   55: aload_0
    //   56: getfield FWm : [Lsnt;
    //   59: iload_1
    //   60: aaload
    //   61: invokevirtual bzF : ()V
    //   64: iinc #1, 1
    //   67: goto -> 46
    //   70: bipush #64
    //   72: iconst_3
    //   73: aload_0
    //   74: getfield trS : I
    //   77: isub
    //   78: ishl
    //   79: istore_1
    //   80: iload_1
    //   81: sipush #400
    //   84: if_icmple -> 91
    //   87: sipush #400
    //   90: istore_1
    //   91: aload_0
    //   92: iload_1
    //   93: bipush #16
    //   95: idiv
    //   96: iconst_1
    //   97: iadd
    //   98: putfield FWm : I
    //   101: aload_0
    //   102: bipush #16
    //   104: putfield bzF : I
    //   107: aload_0
    //   108: iload_1
    //   109: bipush #16
    //   111: idiv
    //   112: iconst_1
    //   113: iadd
    //   114: putfield Qnq : I
    //   117: aload_0
    //   118: aload_0
    //   119: getfield FWm : I
    //   122: aload_0
    //   123: getfield bzF : I
    //   126: imul
    //   127: aload_0
    //   128: getfield Qnq : I
    //   131: imul
    //   132: anewarray snt
    //   135: putfield FWm : [Lsnt;
    //   138: aload_0
    //   139: aload_0
    //   140: getfield FWm : I
    //   143: aload_0
    //   144: getfield bzF : I
    //   147: imul
    //   148: aload_0
    //   149: getfield Qnq : I
    //   152: imul
    //   153: anewarray snt
    //   156: putfield Dne : [Lsnt;
    //   159: iconst_0
    //   160: istore_2
    //   161: iconst_0
    //   162: istore_3
    //   163: aload_0
    //   164: iconst_0
    //   165: putfield mrb : I
    //   168: aload_0
    //   169: iconst_0
    //   170: putfield XHL : I
    //   173: aload_0
    //   174: iconst_0
    //   175: putfield Zpi : I
    //   178: aload_0
    //   179: aload_0
    //   180: getfield FWm : I
    //   183: putfield kGO : I
    //   186: aload_0
    //   187: aload_0
    //   188: getfield bzF : I
    //   191: putfield udO : I
    //   194: aload_0
    //   195: aload_0
    //   196: getfield Qnq : I
    //   199: putfield ooe : I
    //   202: iconst_0
    //   203: istore #4
    //   205: iload #4
    //   207: aload_0
    //   208: getfield FWm : Ljava/util/List;
    //   211: invokeinterface size : ()I
    //   216: if_icmpge -> 243
    //   219: aload_0
    //   220: getfield FWm : Ljava/util/List;
    //   223: iload #4
    //   225: invokeinterface get : (I)Ljava/lang/Object;
    //   230: checkcast snt
    //   233: iconst_0
    //   234: putfield FWm : Z
    //   237: iinc #4, 1
    //   240: goto -> 205
    //   243: aload_0
    //   244: getfield FWm : Ljava/util/List;
    //   247: invokeinterface clear : ()V
    //   252: aload_0
    //   253: getfield Dne : Ljava/util/List;
    //   256: invokeinterface clear : ()V
    //   261: iconst_0
    //   262: istore #4
    //   264: iload #4
    //   266: aload_0
    //   267: getfield FWm : I
    //   270: if_icmpge -> 634
    //   273: iconst_0
    //   274: istore #5
    //   276: iload #5
    //   278: aload_0
    //   279: getfield bzF : I
    //   282: if_icmpge -> 628
    //   285: iconst_0
    //   286: istore #6
    //   288: iload #6
    //   290: aload_0
    //   291: getfield Qnq : I
    //   294: if_icmpge -> 622
    //   297: aload_0
    //   298: getfield FWm : [Lsnt;
    //   301: iload #6
    //   303: aload_0
    //   304: getfield bzF : I
    //   307: imul
    //   308: iload #5
    //   310: iadd
    //   311: aload_0
    //   312: getfield FWm : I
    //   315: imul
    //   316: iload #4
    //   318: iadd
    //   319: new snt
    //   322: dup
    //   323: aload_0
    //   324: getfield Dne : LVzZ;
    //   327: aload_0
    //   328: getfield Dne : Ljava/util/List;
    //   331: iload #4
    //   333: bipush #16
    //   335: imul
    //   336: iload #5
    //   338: bipush #16
    //   340: imul
    //   341: iload #6
    //   343: bipush #16
    //   345: imul
    //   346: aload_0
    //   347: getfield aFZ : I
    //   350: iload_2
    //   351: iadd
    //   352: invokespecial <init> : (LQnq;Ljava/util/List;IIII)V
    //   355: aastore
    //   356: aload_0
    //   357: getfield Dne : Z
    //   360: ifeq -> 397
    //   363: aload_0
    //   364: getfield FWm : [Lsnt;
    //   367: iload #6
    //   369: aload_0
    //   370: getfield bzF : I
    //   373: imul
    //   374: iload #5
    //   376: iadd
    //   377: aload_0
    //   378: getfield FWm : I
    //   381: imul
    //   382: iload #4
    //   384: iadd
    //   385: aaload
    //   386: aload_0
    //   387: getfield FWm : Ljava/nio/IntBuffer;
    //   390: iload_3
    //   391: invokevirtual get : (I)I
    //   394: putfield ooe : I
    //   397: aload_0
    //   398: getfield FWm : [Lsnt;
    //   401: iload #6
    //   403: aload_0
    //   404: getfield bzF : I
    //   407: imul
    //   408: iload #5
    //   410: iadd
    //   411: aload_0
    //   412: getfield FWm : I
    //   415: imul
    //   416: iload #4
    //   418: iadd
    //   419: aaload
    //   420: iconst_0
    //   421: putfield Qnq : Z
    //   424: aload_0
    //   425: getfield FWm : [Lsnt;
    //   428: iload #6
    //   430: aload_0
    //   431: getfield bzF : I
    //   434: imul
    //   435: iload #5
    //   437: iadd
    //   438: aload_0
    //   439: getfield FWm : I
    //   442: imul
    //   443: iload #4
    //   445: iadd
    //   446: aaload
    //   447: iconst_1
    //   448: putfield bzF : Z
    //   451: aload_0
    //   452: getfield FWm : [Lsnt;
    //   455: iload #6
    //   457: aload_0
    //   458: getfield bzF : I
    //   461: imul
    //   462: iload #5
    //   464: iadd
    //   465: aload_0
    //   466: getfield FWm : I
    //   469: imul
    //   470: iload #4
    //   472: iadd
    //   473: aaload
    //   474: iconst_1
    //   475: putfield Dne : Z
    //   478: aload_0
    //   479: getfield FWm : [Lsnt;
    //   482: iload #6
    //   484: aload_0
    //   485: getfield bzF : I
    //   488: imul
    //   489: iload #5
    //   491: iadd
    //   492: aload_0
    //   493: getfield FWm : I
    //   496: imul
    //   497: iload #4
    //   499: iadd
    //   500: aaload
    //   501: iload_3
    //   502: iinc #3, 1
    //   505: putfield udO : I
    //   508: aload_0
    //   509: getfield FWm : [Lsnt;
    //   512: iload #6
    //   514: aload_0
    //   515: getfield bzF : I
    //   518: imul
    //   519: iload #5
    //   521: iadd
    //   522: aload_0
    //   523: getfield FWm : I
    //   526: imul
    //   527: iload #4
    //   529: iadd
    //   530: aaload
    //   531: invokevirtual aFZ : ()V
    //   534: aload_0
    //   535: getfield Dne : [Lsnt;
    //   538: iload #6
    //   540: aload_0
    //   541: getfield bzF : I
    //   544: imul
    //   545: iload #5
    //   547: iadd
    //   548: aload_0
    //   549: getfield FWm : I
    //   552: imul
    //   553: iload #4
    //   555: iadd
    //   556: aload_0
    //   557: getfield FWm : [Lsnt;
    //   560: iload #6
    //   562: aload_0
    //   563: getfield bzF : I
    //   566: imul
    //   567: iload #5
    //   569: iadd
    //   570: aload_0
    //   571: getfield FWm : I
    //   574: imul
    //   575: iload #4
    //   577: iadd
    //   578: aaload
    //   579: aastore
    //   580: aload_0
    //   581: getfield FWm : Ljava/util/List;
    //   584: aload_0
    //   585: getfield FWm : [Lsnt;
    //   588: iload #6
    //   590: aload_0
    //   591: getfield bzF : I
    //   594: imul
    //   595: iload #5
    //   597: iadd
    //   598: aload_0
    //   599: getfield FWm : I
    //   602: imul
    //   603: iload #4
    //   605: iadd
    //   606: aaload
    //   607: invokeinterface add : (Ljava/lang/Object;)Z
    //   612: pop
    //   613: iinc #2, 3
    //   616: iinc #6, 1
    //   619: goto -> 288
    //   622: iinc #5, 1
    //   625: goto -> 276
    //   628: iinc #4, 1
    //   631: goto -> 264
    //   634: aload_0
    //   635: getfield Dne : LVzZ;
    //   638: ifnull -> 699
    //   641: aload_0
    //   642: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   645: getfield Dne : LFUH;
    //   648: astore #5
    //   650: aload #5
    //   652: ifnull -> 699
    //   655: aload_0
    //   656: aload #5
    //   658: getfield div : D
    //   661: invokestatic FWm : (D)I
    //   664: aload #5
    //   666: getfield IjH : D
    //   669: invokestatic FWm : (D)I
    //   672: aload #5
    //   674: getfield mrb : D
    //   677: invokestatic FWm : (D)I
    //   680: invokespecial bzF : (III)V
    //   683: aload_0
    //   684: getfield Dne : [Lsnt;
    //   687: new dPW
    //   690: dup
    //   691: aload #5
    //   693: invokespecial <init> : (LsMa;)V
    //   696: invokestatic sort : ([Ljava/lang/Object;Ljava/util/Comparator;)V
    //   699: aload_0
    //   700: iconst_2
    //   701: putfield qLR : I
    //   704: return
  }
  
  public void Dne(sMa paramsMa) {
    paramsMa.mrb();
    if (paramsMa.Dne != null)
      this.Dne.Dne(paramsMa.Dne, new VGP()); 
    if (paramsMa.FWm != null)
      this.Dne.Dne(paramsMa.FWm, new VGP()); 
  }
  
  public rqj(Minecraft paramMinecraft, Snh paramSnh) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Dne : Ljava/util/List;
    //   15: aload_0
    //   16: new java/util/ArrayList
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: putfield FWm : Ljava/util/List;
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield Dne : Z
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield zGp : I
    //   36: aload_0
    //   37: new java/util/HashMap
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: putfield Dne : Ljava/util/Map;
    //   47: aload_0
    //   48: iconst_m1
    //   49: putfield trS : I
    //   52: aload_0
    //   53: iconst_2
    //   54: putfield qLR : I
    //   57: aload_0
    //   58: ldc_w 50000
    //   61: newarray int
    //   63: putfield Dne : [I
    //   66: aload_0
    //   67: bipush #64
    //   69: invokestatic Dne : (I)Ljava/nio/IntBuffer;
    //   72: putfield Dne : Ljava/nio/IntBuffer;
    //   75: aload_0
    //   76: new java/util/ArrayList
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: putfield bzF : Ljava/util/List;
    //   86: aload_0
    //   87: iconst_4
    //   88: anewarray ofu
    //   91: dup
    //   92: iconst_0
    //   93: new ofu
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: new ofu
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: aastore
    //   111: dup
    //   112: iconst_2
    //   113: new ofu
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: aastore
    //   121: dup
    //   122: iconst_3
    //   123: new ofu
    //   126: dup
    //   127: invokespecial <init> : ()V
    //   130: aastore
    //   131: putfield Dne : [Lofu;
    //   134: aload_0
    //   135: ldc2_w -9999.0
    //   138: putfield Dne : D
    //   141: aload_0
    //   142: ldc2_w -9999.0
    //   145: putfield FWm : D
    //   148: aload_0
    //   149: ldc2_w -9999.0
    //   152: putfield bzF : D
    //   155: aload_0
    //   156: iconst_0
    //   157: putfield Dne : I
    //   160: aload_0
    //   161: aload_1
    //   162: putfield Dne : Lnet/minecraft/client/Minecraft;
    //   165: aload_0
    //   166: aload_2
    //   167: putfield Dne : LSnh;
    //   170: bipush #34
    //   172: istore_3
    //   173: bipush #32
    //   175: istore #4
    //   177: aload_0
    //   178: iload_3
    //   179: iload_3
    //   180: imul
    //   181: iload #4
    //   183: imul
    //   184: iconst_3
    //   185: imul
    //   186: invokestatic Dne : (I)I
    //   189: putfield aFZ : I
    //   192: aload_0
    //   193: invokestatic Dne : ()Z
    //   196: putfield Dne : Z
    //   199: aload_0
    //   200: getfield Dne : Z
    //   203: ifeq -> 265
    //   206: aload_0
    //   207: getfield Dne : Ljava/nio/IntBuffer;
    //   210: invokevirtual clear : ()Ljava/nio/Buffer;
    //   213: pop
    //   214: aload_0
    //   215: iload_3
    //   216: iload_3
    //   217: imul
    //   218: iload #4
    //   220: imul
    //   221: invokestatic Dne : (I)Ljava/nio/IntBuffer;
    //   224: putfield FWm : Ljava/nio/IntBuffer;
    //   227: aload_0
    //   228: getfield FWm : Ljava/nio/IntBuffer;
    //   231: invokevirtual clear : ()Ljava/nio/Buffer;
    //   234: pop
    //   235: aload_0
    //   236: getfield FWm : Ljava/nio/IntBuffer;
    //   239: iconst_0
    //   240: invokevirtual position : (I)Ljava/nio/Buffer;
    //   243: pop
    //   244: aload_0
    //   245: getfield FWm : Ljava/nio/IntBuffer;
    //   248: iload_3
    //   249: iload_3
    //   250: imul
    //   251: iload #4
    //   253: imul
    //   254: invokevirtual limit : (I)Ljava/nio/Buffer;
    //   257: pop
    //   258: aload_0
    //   259: getfield FWm : Ljava/nio/IntBuffer;
    //   262: invokestatic glGenQueriesARB : (Ljava/nio/IntBuffer;)V
    //   265: aload_0
    //   266: iconst_3
    //   267: invokestatic Dne : (I)I
    //   270: putfield DyG : I
    //   273: invokestatic glPushMatrix : ()V
    //   276: aload_0
    //   277: getfield DyG : I
    //   280: sipush #4864
    //   283: invokestatic glNewList : (II)V
    //   286: aload_0
    //   287: invokespecial Qnq : ()V
    //   290: invokestatic glEndList : ()V
    //   293: invokestatic glPopMatrix : ()V
    //   296: getstatic WAR.Dne : LWAR;
    //   299: astore #5
    //   301: aload_0
    //   302: aload_0
    //   303: getfield DyG : I
    //   306: iconst_1
    //   307: iadd
    //   308: putfield div : I
    //   311: aload_0
    //   312: getfield div : I
    //   315: sipush #4864
    //   318: invokestatic glNewList : (II)V
    //   321: bipush #64
    //   323: istore #6
    //   325: sipush #256
    //   328: iload #6
    //   330: idiv
    //   331: iconst_2
    //   332: iadd
    //   333: istore #7
    //   335: ldc_w 16.0
    //   338: fstore #8
    //   340: iload #6
    //   342: ineg
    //   343: iload #7
    //   345: imul
    //   346: istore #9
    //   348: iload #9
    //   350: iload #6
    //   352: iload #7
    //   354: imul
    //   355: if_icmpgt -> 483
    //   358: iload #6
    //   360: ineg
    //   361: iload #7
    //   363: imul
    //   364: istore #10
    //   366: iload #10
    //   368: iload #6
    //   370: iload #7
    //   372: imul
    //   373: if_icmpgt -> 473
    //   376: aload #5
    //   378: invokevirtual Dne : ()V
    //   381: aload #5
    //   383: iload #9
    //   385: iconst_0
    //   386: iadd
    //   387: i2d
    //   388: fload #8
    //   390: f2d
    //   391: iload #10
    //   393: iconst_0
    //   394: iadd
    //   395: i2d
    //   396: invokevirtual Dne : (DDD)V
    //   399: aload #5
    //   401: iload #9
    //   403: iload #6
    //   405: iadd
    //   406: i2d
    //   407: fload #8
    //   409: f2d
    //   410: iload #10
    //   412: iconst_0
    //   413: iadd
    //   414: i2d
    //   415: invokevirtual Dne : (DDD)V
    //   418: aload #5
    //   420: iload #9
    //   422: iload #6
    //   424: iadd
    //   425: i2d
    //   426: fload #8
    //   428: f2d
    //   429: iload #10
    //   431: iload #6
    //   433: iadd
    //   434: i2d
    //   435: invokevirtual Dne : (DDD)V
    //   438: aload #5
    //   440: iload #9
    //   442: iconst_0
    //   443: iadd
    //   444: i2d
    //   445: fload #8
    //   447: f2d
    //   448: iload #10
    //   450: iload #6
    //   452: iadd
    //   453: i2d
    //   454: invokevirtual Dne : (DDD)V
    //   457: aload #5
    //   459: invokevirtual Dne : ()I
    //   462: pop
    //   463: iload #10
    //   465: iload #6
    //   467: iadd
    //   468: istore #10
    //   470: goto -> 366
    //   473: iload #9
    //   475: iload #6
    //   477: iadd
    //   478: istore #9
    //   480: goto -> 348
    //   483: invokestatic glEndList : ()V
    //   486: aload_0
    //   487: aload_0
    //   488: getfield DyG : I
    //   491: iconst_2
    //   492: iadd
    //   493: putfield IjH : I
    //   496: aload_0
    //   497: getfield IjH : I
    //   500: sipush #4864
    //   503: invokestatic glNewList : (II)V
    //   506: ldc_w -16.0
    //   509: fstore #8
    //   511: aload #5
    //   513: invokevirtual Dne : ()V
    //   516: iload #6
    //   518: ineg
    //   519: iload #7
    //   521: imul
    //   522: istore #9
    //   524: iload #9
    //   526: iload #6
    //   528: iload #7
    //   530: imul
    //   531: if_icmpgt -> 648
    //   534: iload #6
    //   536: ineg
    //   537: iload #7
    //   539: imul
    //   540: istore #10
    //   542: iload #10
    //   544: iload #6
    //   546: iload #7
    //   548: imul
    //   549: if_icmpgt -> 638
    //   552: aload #5
    //   554: iload #9
    //   556: iload #6
    //   558: iadd
    //   559: i2d
    //   560: fload #8
    //   562: f2d
    //   563: iload #10
    //   565: iconst_0
    //   566: iadd
    //   567: i2d
    //   568: invokevirtual Dne : (DDD)V
    //   571: aload #5
    //   573: iload #9
    //   575: iconst_0
    //   576: iadd
    //   577: i2d
    //   578: fload #8
    //   580: f2d
    //   581: iload #10
    //   583: iconst_0
    //   584: iadd
    //   585: i2d
    //   586: invokevirtual Dne : (DDD)V
    //   589: aload #5
    //   591: iload #9
    //   593: iconst_0
    //   594: iadd
    //   595: i2d
    //   596: fload #8
    //   598: f2d
    //   599: iload #10
    //   601: iload #6
    //   603: iadd
    //   604: i2d
    //   605: invokevirtual Dne : (DDD)V
    //   608: aload #5
    //   610: iload #9
    //   612: iload #6
    //   614: iadd
    //   615: i2d
    //   616: fload #8
    //   618: f2d
    //   619: iload #10
    //   621: iload #6
    //   623: iadd
    //   624: i2d
    //   625: invokevirtual Dne : (DDD)V
    //   628: iload #10
    //   630: iload #6
    //   632: iadd
    //   633: istore #10
    //   635: goto -> 542
    //   638: iload #9
    //   640: iload #6
    //   642: iadd
    //   643: istore #9
    //   645: goto -> 524
    //   648: aload #5
    //   650: invokevirtual Dne : ()I
    //   653: pop
    //   654: invokestatic glEndList : ()V
    //   657: return
  }
  
  private void Dne(bSp parambSp) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore_2
    //   4: aload_2
    //   5: iconst_3
    //   6: invokevirtual Dne : (I)V
    //   9: aload_2
    //   10: aload_1
    //   11: getfield Dne : D
    //   14: aload_1
    //   15: getfield FWm : D
    //   18: aload_1
    //   19: getfield bzF : D
    //   22: invokevirtual Dne : (DDD)V
    //   25: aload_2
    //   26: aload_1
    //   27: getfield Qnq : D
    //   30: aload_1
    //   31: getfield FWm : D
    //   34: aload_1
    //   35: getfield bzF : D
    //   38: invokevirtual Dne : (DDD)V
    //   41: aload_2
    //   42: aload_1
    //   43: getfield Qnq : D
    //   46: aload_1
    //   47: getfield FWm : D
    //   50: aload_1
    //   51: getfield zGp : D
    //   54: invokevirtual Dne : (DDD)V
    //   57: aload_2
    //   58: aload_1
    //   59: getfield Dne : D
    //   62: aload_1
    //   63: getfield FWm : D
    //   66: aload_1
    //   67: getfield zGp : D
    //   70: invokevirtual Dne : (DDD)V
    //   73: aload_2
    //   74: aload_1
    //   75: getfield Dne : D
    //   78: aload_1
    //   79: getfield FWm : D
    //   82: aload_1
    //   83: getfield bzF : D
    //   86: invokevirtual Dne : (DDD)V
    //   89: aload_2
    //   90: invokevirtual Dne : ()I
    //   93: pop
    //   94: aload_2
    //   95: iconst_3
    //   96: invokevirtual Dne : (I)V
    //   99: aload_2
    //   100: aload_1
    //   101: getfield Dne : D
    //   104: aload_1
    //   105: getfield aFZ : D
    //   108: aload_1
    //   109: getfield bzF : D
    //   112: invokevirtual Dne : (DDD)V
    //   115: aload_2
    //   116: aload_1
    //   117: getfield Qnq : D
    //   120: aload_1
    //   121: getfield aFZ : D
    //   124: aload_1
    //   125: getfield bzF : D
    //   128: invokevirtual Dne : (DDD)V
    //   131: aload_2
    //   132: aload_1
    //   133: getfield Qnq : D
    //   136: aload_1
    //   137: getfield aFZ : D
    //   140: aload_1
    //   141: getfield zGp : D
    //   144: invokevirtual Dne : (DDD)V
    //   147: aload_2
    //   148: aload_1
    //   149: getfield Dne : D
    //   152: aload_1
    //   153: getfield aFZ : D
    //   156: aload_1
    //   157: getfield zGp : D
    //   160: invokevirtual Dne : (DDD)V
    //   163: aload_2
    //   164: aload_1
    //   165: getfield Dne : D
    //   168: aload_1
    //   169: getfield aFZ : D
    //   172: aload_1
    //   173: getfield bzF : D
    //   176: invokevirtual Dne : (DDD)V
    //   179: aload_2
    //   180: invokevirtual Dne : ()I
    //   183: pop
    //   184: aload_2
    //   185: iconst_1
    //   186: invokevirtual Dne : (I)V
    //   189: aload_2
    //   190: aload_1
    //   191: getfield Dne : D
    //   194: aload_1
    //   195: getfield FWm : D
    //   198: aload_1
    //   199: getfield bzF : D
    //   202: invokevirtual Dne : (DDD)V
    //   205: aload_2
    //   206: aload_1
    //   207: getfield Dne : D
    //   210: aload_1
    //   211: getfield aFZ : D
    //   214: aload_1
    //   215: getfield bzF : D
    //   218: invokevirtual Dne : (DDD)V
    //   221: aload_2
    //   222: aload_1
    //   223: getfield Qnq : D
    //   226: aload_1
    //   227: getfield FWm : D
    //   230: aload_1
    //   231: getfield bzF : D
    //   234: invokevirtual Dne : (DDD)V
    //   237: aload_2
    //   238: aload_1
    //   239: getfield Qnq : D
    //   242: aload_1
    //   243: getfield aFZ : D
    //   246: aload_1
    //   247: getfield bzF : D
    //   250: invokevirtual Dne : (DDD)V
    //   253: aload_2
    //   254: aload_1
    //   255: getfield Qnq : D
    //   258: aload_1
    //   259: getfield FWm : D
    //   262: aload_1
    //   263: getfield zGp : D
    //   266: invokevirtual Dne : (DDD)V
    //   269: aload_2
    //   270: aload_1
    //   271: getfield Qnq : D
    //   274: aload_1
    //   275: getfield aFZ : D
    //   278: aload_1
    //   279: getfield zGp : D
    //   282: invokevirtual Dne : (DDD)V
    //   285: aload_2
    //   286: aload_1
    //   287: getfield Dne : D
    //   290: aload_1
    //   291: getfield FWm : D
    //   294: aload_1
    //   295: getfield zGp : D
    //   298: invokevirtual Dne : (DDD)V
    //   301: aload_2
    //   302: aload_1
    //   303: getfield Dne : D
    //   306: aload_1
    //   307: getfield aFZ : D
    //   310: aload_1
    //   311: getfield zGp : D
    //   314: invokevirtual Dne : (DDD)V
    //   317: aload_2
    //   318: invokevirtual Dne : ()I
    //   321: pop
    //   322: return
  }
  
  public String FWm() {
    return "E: " + this.Vxn + "/" + this.ATE + ". B: " + this.ceE + ", I: " + (this.ATE - this.ceE - this.Vxn);
  }
  
  public void Dne(WAR paramWAR, FiG paramFiG, float paramFloat) {
    double d1 = paramFiG.udO + (paramFiG.div - paramFiG.udO) * paramFloat;
    double d2 = paramFiG.ooe + (paramFiG.IjH - paramFiG.ooe) * paramFloat;
    double d3 = paramFiG.trS + (paramFiG.mrb - paramFiG.trS) * paramFloat;
    if (!this.Dne.isEmpty()) {
      GL11.glBlendFunc(774, 768);
      this.Dne.Dne("/terrain.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
      GL11.glPushMatrix();
      GL11.glDisable(3008);
      GL11.glPolygonOffset(-3.0F, -3.0F);
      GL11.glEnable(32823);
      GL11.glEnable(3008);
      paramWAR.Dne();
      paramWAR.FWm(-d1, -d2, -d3);
      paramWAR.FWm();
      Iterator<eyz> iterator = this.Dne.values().iterator();
      while (iterator.hasNext()) {
        eyz eyz = iterator.next();
        double d4 = eyz.Dne() - d1;
        double d5 = eyz.FWm() - d2;
        double d6 = eyz.bzF() - d3;
        if (d4 * d4 + d5 * d5 + d6 * d6 > 1024.0D) {
          iterator.remove();
          continue;
        } 
        int i = this.Dne.Dne(eyz.Dne(), eyz.FWm(), eyz.bzF());
        dNT dNT = (i > 0) ? zKP.Dne[i] : null;
        if (dNT == null)
          dNT = zKP.Dne; 
        this.Dne.Dne(dNT, eyz.Dne(), eyz.FWm(), eyz.bzF(), (gDn)this.Dne[eyz.Qnq()]);
      } 
      paramWAR.Dne();
      paramWAR.FWm(0.0D, 0.0D, 0.0D);
      GL11.glDisable(3008);
      GL11.glPolygonOffset(0.0F, 0.0F);
      GL11.glDisable(32823);
      GL11.glEnable(3008);
      GL11.glDepthMask(true);
      GL11.glPopMatrix();
    } 
  }
  
  public void Dne(int paramInt, double paramDouble) {
    ((Minecraft)this.Dne).Dne.FWm(paramDouble);
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b].Dne(); 
    ((Minecraft)this.Dne).Dne.Dne(paramDouble);
  }
  
  public void Dne(FiG paramFiG, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
  
  private int Dne(int paramInt1, int paramInt2, int paramInt3, double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : Ljava/util/List;
    //   4: invokeinterface clear : ()V
    //   9: iconst_0
    //   10: istore #6
    //   12: iload_1
    //   13: istore #7
    //   15: iload #7
    //   17: iload_2
    //   18: if_icmpge -> 224
    //   21: iload_3
    //   22: ifne -> 132
    //   25: aload_0
    //   26: dup
    //   27: getfield EyB : I
    //   30: iconst_1
    //   31: iadd
    //   32: putfield EyB : I
    //   35: aload_0
    //   36: getfield Dne : [Lsnt;
    //   39: iload #7
    //   41: aaload
    //   42: getfield Dne : [Z
    //   45: iload_3
    //   46: baload
    //   47: ifeq -> 63
    //   50: aload_0
    //   51: dup
    //   52: getfield vSL : I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield vSL : I
    //   60: goto -> 132
    //   63: aload_0
    //   64: getfield Dne : [Lsnt;
    //   67: iload #7
    //   69: aaload
    //   70: getfield Dne : Z
    //   73: ifne -> 89
    //   76: aload_0
    //   77: dup
    //   78: getfield FfS : I
    //   81: iconst_1
    //   82: iadd
    //   83: putfield FfS : I
    //   86: goto -> 132
    //   89: aload_0
    //   90: getfield Dne : Z
    //   93: ifeq -> 122
    //   96: aload_0
    //   97: getfield Dne : [Lsnt;
    //   100: iload #7
    //   102: aaload
    //   103: getfield bzF : Z
    //   106: ifne -> 122
    //   109: aload_0
    //   110: dup
    //   111: getfield OdI : I
    //   114: iconst_1
    //   115: iadd
    //   116: putfield OdI : I
    //   119: goto -> 132
    //   122: aload_0
    //   123: dup
    //   124: getfield oIf : I
    //   127: iconst_1
    //   128: iadd
    //   129: putfield oIf : I
    //   132: aload_0
    //   133: getfield Dne : [Lsnt;
    //   136: iload #7
    //   138: aaload
    //   139: getfield Dne : [Z
    //   142: iload_3
    //   143: baload
    //   144: ifne -> 218
    //   147: aload_0
    //   148: getfield Dne : [Lsnt;
    //   151: iload #7
    //   153: aaload
    //   154: getfield Dne : Z
    //   157: ifeq -> 218
    //   160: aload_0
    //   161: getfield Dne : Z
    //   164: ifeq -> 180
    //   167: aload_0
    //   168: getfield Dne : [Lsnt;
    //   171: iload #7
    //   173: aaload
    //   174: getfield bzF : Z
    //   177: ifeq -> 218
    //   180: aload_0
    //   181: getfield Dne : [Lsnt;
    //   184: iload #7
    //   186: aaload
    //   187: iload_3
    //   188: invokevirtual Dne : (I)I
    //   191: istore #8
    //   193: iload #8
    //   195: iflt -> 218
    //   198: aload_0
    //   199: getfield bzF : Ljava/util/List;
    //   202: aload_0
    //   203: getfield Dne : [Lsnt;
    //   206: iload #7
    //   208: aaload
    //   209: invokeinterface add : (Ljava/lang/Object;)Z
    //   214: pop
    //   215: iinc #6, 1
    //   218: iinc #7, 1
    //   221: goto -> 15
    //   224: aload_0
    //   225: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   228: getfield Dne : LFUH;
    //   231: astore #7
    //   233: aload #7
    //   235: getfield udO : D
    //   238: aload #7
    //   240: getfield div : D
    //   243: aload #7
    //   245: getfield udO : D
    //   248: dsub
    //   249: dload #4
    //   251: dmul
    //   252: dadd
    //   253: dstore #8
    //   255: aload #7
    //   257: getfield ooe : D
    //   260: aload #7
    //   262: getfield IjH : D
    //   265: aload #7
    //   267: getfield ooe : D
    //   270: dsub
    //   271: dload #4
    //   273: dmul
    //   274: dadd
    //   275: dstore #10
    //   277: aload #7
    //   279: getfield trS : D
    //   282: aload #7
    //   284: getfield mrb : D
    //   287: aload #7
    //   289: getfield trS : D
    //   292: dsub
    //   293: dload #4
    //   295: dmul
    //   296: dadd
    //   297: dstore #12
    //   299: iconst_0
    //   300: istore #14
    //   302: iconst_0
    //   303: istore #15
    //   305: iload #15
    //   307: aload_0
    //   308: getfield Dne : [Lofu;
    //   311: arraylength
    //   312: if_icmpge -> 331
    //   315: aload_0
    //   316: getfield Dne : [Lofu;
    //   319: iload #15
    //   321: aaload
    //   322: invokevirtual FWm : ()V
    //   325: iinc #15, 1
    //   328: goto -> 305
    //   331: iconst_0
    //   332: istore #15
    //   334: iload #15
    //   336: aload_0
    //   337: getfield bzF : Ljava/util/List;
    //   340: invokeinterface size : ()I
    //   345: if_icmpge -> 480
    //   348: aload_0
    //   349: getfield bzF : Ljava/util/List;
    //   352: iload #15
    //   354: invokeinterface get : (I)Ljava/lang/Object;
    //   359: checkcast snt
    //   362: astore #16
    //   364: iconst_m1
    //   365: istore #17
    //   367: iconst_0
    //   368: istore #18
    //   370: iload #18
    //   372: iload #14
    //   374: if_icmpge -> 415
    //   377: aload_0
    //   378: getfield Dne : [Lofu;
    //   381: iload #18
    //   383: aaload
    //   384: aload #16
    //   386: getfield aFZ : I
    //   389: aload #16
    //   391: getfield zGp : I
    //   394: aload #16
    //   396: getfield DyG : I
    //   399: invokevirtual Dne : (III)Z
    //   402: ifeq -> 409
    //   405: iload #18
    //   407: istore #17
    //   409: iinc #18, 1
    //   412: goto -> 370
    //   415: iload #17
    //   417: ifge -> 458
    //   420: iload #14
    //   422: iinc #14, 1
    //   425: istore #17
    //   427: aload_0
    //   428: getfield Dne : [Lofu;
    //   431: iload #17
    //   433: aaload
    //   434: aload #16
    //   436: getfield aFZ : I
    //   439: aload #16
    //   441: getfield zGp : I
    //   444: aload #16
    //   446: getfield DyG : I
    //   449: dload #8
    //   451: dload #10
    //   453: dload #12
    //   455: invokevirtual Dne : (IIIDDD)V
    //   458: aload_0
    //   459: getfield Dne : [Lofu;
    //   462: iload #17
    //   464: aaload
    //   465: aload #16
    //   467: iload_3
    //   468: invokevirtual Dne : (I)I
    //   471: invokevirtual Dne : (I)V
    //   474: iinc #15, 1
    //   477: goto -> 334
    //   480: aload_0
    //   481: iload_3
    //   482: dload #4
    //   484: invokevirtual Dne : (ID)V
    //   487: iload #6
    //   489: ireturn
  }
  
  public void Dne(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LVzZ;
    //   7: getfield Dne : LJik;
    //   10: getfield Dne : I
    //   13: iconst_1
    //   14: if_icmpne -> 258
    //   17: sipush #2912
    //   20: invokestatic glDisable : (I)V
    //   23: sipush #3008
    //   26: invokestatic glDisable : (I)V
    //   29: sipush #3042
    //   32: invokestatic glEnable : (I)V
    //   35: sipush #770
    //   38: sipush #771
    //   41: invokestatic glBlendFunc : (II)V
    //   44: invokestatic Dne : ()V
    //   47: iconst_0
    //   48: invokestatic glDepthMask : (Z)V
    //   51: aload_0
    //   52: getfield Dne : LSnh;
    //   55: ldc_w '/misc/tunnel.png'
    //   58: invokevirtual Dne : (Ljava/lang/String;)V
    //   61: getstatic WAR.Dne : LWAR;
    //   64: astore_2
    //   65: iconst_0
    //   66: istore_3
    //   67: iload_3
    //   68: bipush #6
    //   70: if_icmpge -> 239
    //   73: invokestatic glPushMatrix : ()V
    //   76: iload_3
    //   77: iconst_1
    //   78: if_icmpne -> 90
    //   81: ldc_w 90.0
    //   84: fconst_1
    //   85: fconst_0
    //   86: fconst_0
    //   87: invokestatic glRotatef : (FFFF)V
    //   90: iload_3
    //   91: iconst_2
    //   92: if_icmpne -> 104
    //   95: ldc_w -90.0
    //   98: fconst_1
    //   99: fconst_0
    //   100: fconst_0
    //   101: invokestatic glRotatef : (FFFF)V
    //   104: iload_3
    //   105: iconst_3
    //   106: if_icmpne -> 118
    //   109: ldc_w 180.0
    //   112: fconst_1
    //   113: fconst_0
    //   114: fconst_0
    //   115: invokestatic glRotatef : (FFFF)V
    //   118: iload_3
    //   119: iconst_4
    //   120: if_icmpne -> 132
    //   123: ldc_w 90.0
    //   126: fconst_0
    //   127: fconst_0
    //   128: fconst_1
    //   129: invokestatic glRotatef : (FFFF)V
    //   132: iload_3
    //   133: iconst_5
    //   134: if_icmpne -> 146
    //   137: ldc_w -90.0
    //   140: fconst_0
    //   141: fconst_0
    //   142: fconst_1
    //   143: invokestatic glRotatef : (FFFF)V
    //   146: aload_2
    //   147: invokevirtual Dne : ()V
    //   150: aload_2
    //   151: ldc_w 2631720
    //   154: invokevirtual bzF : (I)V
    //   157: aload_2
    //   158: ldc2_w -100.0
    //   161: ldc2_w -100.0
    //   164: ldc2_w -100.0
    //   167: dconst_0
    //   168: dconst_0
    //   169: invokevirtual Dne : (DDDDD)V
    //   172: aload_2
    //   173: ldc2_w -100.0
    //   176: ldc2_w -100.0
    //   179: ldc2_w 100.0
    //   182: dconst_0
    //   183: ldc2_w 16.0
    //   186: invokevirtual Dne : (DDDDD)V
    //   189: aload_2
    //   190: ldc2_w 100.0
    //   193: ldc2_w -100.0
    //   196: ldc2_w 100.0
    //   199: ldc2_w 16.0
    //   202: ldc2_w 16.0
    //   205: invokevirtual Dne : (DDDDD)V
    //   208: aload_2
    //   209: ldc2_w 100.0
    //   212: ldc2_w -100.0
    //   215: ldc2_w -100.0
    //   218: ldc2_w 16.0
    //   221: dconst_0
    //   222: invokevirtual Dne : (DDDDD)V
    //   225: aload_2
    //   226: invokevirtual Dne : ()I
    //   229: pop
    //   230: invokestatic glPopMatrix : ()V
    //   233: iinc #3, 1
    //   236: goto -> 67
    //   239: iconst_1
    //   240: invokestatic glDepthMask : (Z)V
    //   243: sipush #3553
    //   246: invokestatic glEnable : (I)V
    //   249: sipush #3008
    //   252: invokestatic glEnable : (I)V
    //   255: goto -> 1713
    //   258: aload_0
    //   259: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   262: getfield Dne : LVzZ;
    //   265: getfield Dne : LJik;
    //   268: invokevirtual Dne : ()Z
    //   271: ifeq -> 1713
    //   274: sipush #3553
    //   277: invokestatic glDisable : (I)V
    //   280: aload_0
    //   281: getfield Dne : LVzZ;
    //   284: aload_0
    //   285: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   288: getfield Dne : LFUH;
    //   291: fload_1
    //   292: invokevirtual Dne : (LsMa;F)LchN;
    //   295: astore_2
    //   296: aload_2
    //   297: getfield Dne : D
    //   300: d2f
    //   301: fstore_3
    //   302: aload_2
    //   303: getfield FWm : D
    //   306: d2f
    //   307: fstore #4
    //   309: aload_2
    //   310: getfield bzF : D
    //   313: d2f
    //   314: fstore #5
    //   316: aload_0
    //   317: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   320: getfield Dne : LfZI;
    //   323: getfield bzF : Z
    //   326: ifeq -> 398
    //   329: fload_3
    //   330: ldc_w 30.0
    //   333: fmul
    //   334: fload #4
    //   336: ldc_w 59.0
    //   339: fmul
    //   340: fadd
    //   341: fload #5
    //   343: ldc_w 11.0
    //   346: fmul
    //   347: fadd
    //   348: ldc 100.0
    //   350: fdiv
    //   351: fstore #7
    //   353: fload_3
    //   354: ldc_w 30.0
    //   357: fmul
    //   358: fload #4
    //   360: ldc_w 70.0
    //   363: fmul
    //   364: fadd
    //   365: ldc 100.0
    //   367: fdiv
    //   368: fstore #8
    //   370: fload_3
    //   371: ldc_w 30.0
    //   374: fmul
    //   375: fload #5
    //   377: ldc_w 70.0
    //   380: fmul
    //   381: fadd
    //   382: ldc 100.0
    //   384: fdiv
    //   385: fstore #6
    //   387: fload #7
    //   389: fstore_3
    //   390: fload #8
    //   392: fstore #4
    //   394: fload #6
    //   396: fstore #5
    //   398: fload_3
    //   399: fload #4
    //   401: fload #5
    //   403: invokestatic glColor3f : (FFF)V
    //   406: getstatic WAR.Dne : LWAR;
    //   409: astore #7
    //   411: iconst_0
    //   412: invokestatic glDepthMask : (Z)V
    //   415: sipush #2912
    //   418: invokestatic glEnable : (I)V
    //   421: fload_3
    //   422: fload #4
    //   424: fload #5
    //   426: invokestatic glColor3f : (FFF)V
    //   429: aload_0
    //   430: getfield div : I
    //   433: invokestatic glCallList : (I)V
    //   436: sipush #2912
    //   439: invokestatic glDisable : (I)V
    //   442: sipush #3008
    //   445: invokestatic glDisable : (I)V
    //   448: sipush #3042
    //   451: invokestatic glEnable : (I)V
    //   454: sipush #770
    //   457: sipush #771
    //   460: invokestatic glBlendFunc : (II)V
    //   463: invokestatic Dne : ()V
    //   466: aload_0
    //   467: getfield Dne : LVzZ;
    //   470: getfield Dne : LJik;
    //   473: aload_0
    //   474: getfield Dne : LVzZ;
    //   477: fload_1
    //   478: invokevirtual FWm : (F)F
    //   481: fload_1
    //   482: invokevirtual Dne : (FF)[F
    //   485: astore #8
    //   487: aload #8
    //   489: ifnull -> 804
    //   492: sipush #3553
    //   495: invokestatic glDisable : (I)V
    //   498: sipush #7425
    //   501: invokestatic glShadeModel : (I)V
    //   504: invokestatic glPushMatrix : ()V
    //   507: ldc_w 90.0
    //   510: fconst_1
    //   511: fconst_0
    //   512: fconst_0
    //   513: invokestatic glRotatef : (FFFF)V
    //   516: aload_0
    //   517: getfield Dne : LVzZ;
    //   520: fload_1
    //   521: invokevirtual bzF : (F)F
    //   524: invokestatic Dne : (F)F
    //   527: fconst_0
    //   528: fcmpg
    //   529: ifge -> 538
    //   532: ldc_w 180.0
    //   535: goto -> 539
    //   538: fconst_0
    //   539: fconst_0
    //   540: fconst_0
    //   541: fconst_1
    //   542: invokestatic glRotatef : (FFFF)V
    //   545: ldc_w 90.0
    //   548: fconst_0
    //   549: fconst_0
    //   550: fconst_1
    //   551: invokestatic glRotatef : (FFFF)V
    //   554: aload #8
    //   556: iconst_0
    //   557: faload
    //   558: fstore #6
    //   560: aload #8
    //   562: iconst_1
    //   563: faload
    //   564: fstore #9
    //   566: aload #8
    //   568: iconst_2
    //   569: faload
    //   570: fstore #10
    //   572: aload_0
    //   573: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   576: getfield Dne : LfZI;
    //   579: getfield bzF : Z
    //   582: ifeq -> 658
    //   585: fload #6
    //   587: ldc_w 30.0
    //   590: fmul
    //   591: fload #9
    //   593: ldc_w 59.0
    //   596: fmul
    //   597: fadd
    //   598: fload #10
    //   600: ldc_w 11.0
    //   603: fmul
    //   604: fadd
    //   605: ldc 100.0
    //   607: fdiv
    //   608: fstore #11
    //   610: fload #6
    //   612: ldc_w 30.0
    //   615: fmul
    //   616: fload #9
    //   618: ldc_w 70.0
    //   621: fmul
    //   622: fadd
    //   623: ldc 100.0
    //   625: fdiv
    //   626: fstore #12
    //   628: fload #6
    //   630: ldc_w 30.0
    //   633: fmul
    //   634: fload #10
    //   636: ldc_w 70.0
    //   639: fmul
    //   640: fadd
    //   641: ldc 100.0
    //   643: fdiv
    //   644: fstore #13
    //   646: fload #11
    //   648: fstore #6
    //   650: fload #12
    //   652: fstore #9
    //   654: fload #13
    //   656: fstore #10
    //   658: aload #7
    //   660: bipush #6
    //   662: invokevirtual Dne : (I)V
    //   665: aload #7
    //   667: fload #6
    //   669: fload #9
    //   671: fload #10
    //   673: aload #8
    //   675: iconst_3
    //   676: faload
    //   677: invokevirtual Dne : (FFFF)V
    //   680: aload #7
    //   682: dconst_0
    //   683: ldc2_w 100.0
    //   686: dconst_0
    //   687: invokevirtual Dne : (DDD)V
    //   690: bipush #16
    //   692: istore #14
    //   694: aload #7
    //   696: aload #8
    //   698: iconst_0
    //   699: faload
    //   700: aload #8
    //   702: iconst_1
    //   703: faload
    //   704: aload #8
    //   706: iconst_2
    //   707: faload
    //   708: fconst_0
    //   709: invokevirtual Dne : (FFFF)V
    //   712: iconst_0
    //   713: istore #15
    //   715: iload #15
    //   717: iload #14
    //   719: if_icmpgt -> 789
    //   722: iload #15
    //   724: i2f
    //   725: ldc_w 3.1415927
    //   728: fmul
    //   729: fconst_2
    //   730: fmul
    //   731: iload #14
    //   733: i2f
    //   734: fdiv
    //   735: fstore #13
    //   737: fload #13
    //   739: invokestatic Dne : (F)F
    //   742: fstore #16
    //   744: fload #13
    //   746: invokestatic FWm : (F)F
    //   749: fstore #17
    //   751: aload #7
    //   753: fload #16
    //   755: ldc_w 120.0
    //   758: fmul
    //   759: f2d
    //   760: fload #17
    //   762: ldc_w 120.0
    //   765: fmul
    //   766: f2d
    //   767: fload #17
    //   769: fneg
    //   770: ldc_w 40.0
    //   773: fmul
    //   774: aload #8
    //   776: iconst_3
    //   777: faload
    //   778: fmul
    //   779: f2d
    //   780: invokevirtual Dne : (DDD)V
    //   783: iinc #15, 1
    //   786: goto -> 715
    //   789: aload #7
    //   791: invokevirtual Dne : ()I
    //   794: pop
    //   795: invokestatic glPopMatrix : ()V
    //   798: sipush #7424
    //   801: invokestatic glShadeModel : (I)V
    //   804: sipush #3553
    //   807: invokestatic glEnable : (I)V
    //   810: sipush #770
    //   813: iconst_1
    //   814: invokestatic glBlendFunc : (II)V
    //   817: invokestatic glPushMatrix : ()V
    //   820: fconst_1
    //   821: aload_0
    //   822: getfield Dne : LVzZ;
    //   825: fload_1
    //   826: invokevirtual zGp : (F)F
    //   829: fsub
    //   830: fstore #6
    //   832: fconst_0
    //   833: fstore #9
    //   835: fconst_0
    //   836: fstore #10
    //   838: fconst_0
    //   839: fstore #11
    //   841: fconst_1
    //   842: fconst_1
    //   843: fconst_1
    //   844: fload #6
    //   846: invokestatic glColor4f : (FFFF)V
    //   849: fload #9
    //   851: fload #10
    //   853: fload #11
    //   855: invokestatic glTranslatef : (FFF)V
    //   858: ldc_w -90.0
    //   861: fconst_0
    //   862: fconst_1
    //   863: fconst_0
    //   864: invokestatic glRotatef : (FFFF)V
    //   867: aload_0
    //   868: getfield Dne : LVzZ;
    //   871: fload_1
    //   872: invokevirtual FWm : (F)F
    //   875: ldc_w 360.0
    //   878: fmul
    //   879: fconst_1
    //   880: fconst_0
    //   881: fconst_0
    //   882: invokestatic glRotatef : (FFFF)V
    //   885: ldc_w 30.0
    //   888: fstore #12
    //   890: aload_0
    //   891: getfield Dne : LSnh;
    //   894: ldc_w '/environment/sun.png'
    //   897: invokevirtual Dne : (Ljava/lang/String;)V
    //   900: aload #7
    //   902: invokevirtual Dne : ()V
    //   905: aload #7
    //   907: fload #12
    //   909: fneg
    //   910: f2d
    //   911: ldc2_w 100.0
    //   914: fload #12
    //   916: fneg
    //   917: f2d
    //   918: dconst_0
    //   919: dconst_0
    //   920: invokevirtual Dne : (DDDDD)V
    //   923: aload #7
    //   925: fload #12
    //   927: f2d
    //   928: ldc2_w 100.0
    //   931: fload #12
    //   933: fneg
    //   934: f2d
    //   935: dconst_1
    //   936: dconst_0
    //   937: invokevirtual Dne : (DDDDD)V
    //   940: aload #7
    //   942: fload #12
    //   944: f2d
    //   945: ldc2_w 100.0
    //   948: fload #12
    //   950: f2d
    //   951: dconst_1
    //   952: dconst_1
    //   953: invokevirtual Dne : (DDDDD)V
    //   956: aload #7
    //   958: fload #12
    //   960: fneg
    //   961: f2d
    //   962: ldc2_w 100.0
    //   965: fload #12
    //   967: f2d
    //   968: dconst_0
    //   969: dconst_1
    //   970: invokevirtual Dne : (DDDDD)V
    //   973: aload #7
    //   975: invokevirtual Dne : ()I
    //   978: pop
    //   979: ldc_w 20.0
    //   982: fstore #12
    //   984: aload_0
    //   985: getfield Dne : LSnh;
    //   988: ldc_w '/environment/moon_phases.png'
    //   991: invokevirtual Dne : (Ljava/lang/String;)V
    //   994: aload_0
    //   995: getfield Dne : LVzZ;
    //   998: invokevirtual Dne : ()I
    //   1001: istore #13
    //   1003: iload #13
    //   1005: iconst_4
    //   1006: irem
    //   1007: istore #14
    //   1009: iload #13
    //   1011: iconst_4
    //   1012: idiv
    //   1013: iconst_2
    //   1014: irem
    //   1015: istore #15
    //   1017: iload #14
    //   1019: iconst_0
    //   1020: iadd
    //   1021: i2f
    //   1022: ldc 4.0
    //   1024: fdiv
    //   1025: fstore #16
    //   1027: iload #15
    //   1029: iconst_0
    //   1030: iadd
    //   1031: i2f
    //   1032: fconst_2
    //   1033: fdiv
    //   1034: fstore #17
    //   1036: iload #14
    //   1038: iconst_1
    //   1039: iadd
    //   1040: i2f
    //   1041: ldc 4.0
    //   1043: fdiv
    //   1044: fstore #18
    //   1046: iload #15
    //   1048: iconst_1
    //   1049: iadd
    //   1050: i2f
    //   1051: fconst_2
    //   1052: fdiv
    //   1053: fstore #19
    //   1055: aload #7
    //   1057: invokevirtual Dne : ()V
    //   1060: aload #7
    //   1062: fload #12
    //   1064: fneg
    //   1065: f2d
    //   1066: ldc2_w -100.0
    //   1069: fload #12
    //   1071: f2d
    //   1072: fload #18
    //   1074: f2d
    //   1075: fload #19
    //   1077: f2d
    //   1078: invokevirtual Dne : (DDDDD)V
    //   1081: aload #7
    //   1083: fload #12
    //   1085: f2d
    //   1086: ldc2_w -100.0
    //   1089: fload #12
    //   1091: f2d
    //   1092: fload #16
    //   1094: f2d
    //   1095: fload #19
    //   1097: f2d
    //   1098: invokevirtual Dne : (DDDDD)V
    //   1101: aload #7
    //   1103: fload #12
    //   1105: f2d
    //   1106: ldc2_w -100.0
    //   1109: fload #12
    //   1111: fneg
    //   1112: f2d
    //   1113: fload #16
    //   1115: f2d
    //   1116: fload #17
    //   1118: f2d
    //   1119: invokevirtual Dne : (DDDDD)V
    //   1122: aload #7
    //   1124: fload #12
    //   1126: fneg
    //   1127: f2d
    //   1128: ldc2_w -100.0
    //   1131: fload #12
    //   1133: fneg
    //   1134: f2d
    //   1135: fload #18
    //   1137: f2d
    //   1138: fload #17
    //   1140: f2d
    //   1141: invokevirtual Dne : (DDDDD)V
    //   1144: aload #7
    //   1146: invokevirtual Dne : ()I
    //   1149: pop
    //   1150: sipush #3553
    //   1153: invokestatic glDisable : (I)V
    //   1156: aload_0
    //   1157: getfield Dne : LVzZ;
    //   1160: fload_1
    //   1161: invokevirtual Qnq : (F)F
    //   1164: fload #6
    //   1166: fmul
    //   1167: fstore #20
    //   1169: fload #20
    //   1171: fconst_0
    //   1172: fcmpl
    //   1173: ifle -> 1194
    //   1176: fload #20
    //   1178: fload #20
    //   1180: fload #20
    //   1182: fload #20
    //   1184: invokestatic glColor4f : (FFFF)V
    //   1187: aload_0
    //   1188: getfield DyG : I
    //   1191: invokestatic glCallList : (I)V
    //   1194: fconst_1
    //   1195: fconst_1
    //   1196: fconst_1
    //   1197: fconst_1
    //   1198: invokestatic glColor4f : (FFFF)V
    //   1201: sipush #3042
    //   1204: invokestatic glDisable : (I)V
    //   1207: sipush #3008
    //   1210: invokestatic glEnable : (I)V
    //   1213: sipush #2912
    //   1216: invokestatic glEnable : (I)V
    //   1219: invokestatic glPopMatrix : ()V
    //   1222: sipush #3553
    //   1225: invokestatic glDisable : (I)V
    //   1228: fconst_0
    //   1229: fconst_0
    //   1230: fconst_0
    //   1231: invokestatic glColor3f : (FFF)V
    //   1234: aload_0
    //   1235: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1238: getfield Dne : LMJs;
    //   1241: fload_1
    //   1242: invokevirtual Dne : (F)LchN;
    //   1245: getfield FWm : D
    //   1248: aload_0
    //   1249: getfield Dne : LVzZ;
    //   1252: invokevirtual Dne : ()D
    //   1255: dsub
    //   1256: dstore #21
    //   1258: dload #21
    //   1260: dconst_0
    //   1261: dcmpg
    //   1262: ifge -> 1623
    //   1265: invokestatic glPushMatrix : ()V
    //   1268: fconst_0
    //   1269: ldc 12.0
    //   1271: fconst_0
    //   1272: invokestatic glTranslatef : (FFF)V
    //   1275: aload_0
    //   1276: getfield IjH : I
    //   1279: invokestatic glCallList : (I)V
    //   1282: invokestatic glPopMatrix : ()V
    //   1285: fconst_1
    //   1286: fstore #10
    //   1288: dload #21
    //   1290: ldc2_w 65.0
    //   1293: dadd
    //   1294: d2f
    //   1295: fneg
    //   1296: fstore #11
    //   1298: fload #10
    //   1300: fneg
    //   1301: fstore #12
    //   1303: aload #7
    //   1305: invokevirtual Dne : ()V
    //   1308: aload #7
    //   1310: iconst_0
    //   1311: sipush #255
    //   1314: invokevirtual Dne : (II)V
    //   1317: aload #7
    //   1319: fload #10
    //   1321: fneg
    //   1322: f2d
    //   1323: fload #11
    //   1325: f2d
    //   1326: fload #10
    //   1328: f2d
    //   1329: invokevirtual Dne : (DDD)V
    //   1332: aload #7
    //   1334: fload #10
    //   1336: f2d
    //   1337: fload #11
    //   1339: f2d
    //   1340: fload #10
    //   1342: f2d
    //   1343: invokevirtual Dne : (DDD)V
    //   1346: aload #7
    //   1348: fload #10
    //   1350: f2d
    //   1351: fload #12
    //   1353: f2d
    //   1354: fload #10
    //   1356: f2d
    //   1357: invokevirtual Dne : (DDD)V
    //   1360: aload #7
    //   1362: fload #10
    //   1364: fneg
    //   1365: f2d
    //   1366: fload #12
    //   1368: f2d
    //   1369: fload #10
    //   1371: f2d
    //   1372: invokevirtual Dne : (DDD)V
    //   1375: aload #7
    //   1377: fload #10
    //   1379: fneg
    //   1380: f2d
    //   1381: fload #12
    //   1383: f2d
    //   1384: fload #10
    //   1386: fneg
    //   1387: f2d
    //   1388: invokevirtual Dne : (DDD)V
    //   1391: aload #7
    //   1393: fload #10
    //   1395: f2d
    //   1396: fload #12
    //   1398: f2d
    //   1399: fload #10
    //   1401: fneg
    //   1402: f2d
    //   1403: invokevirtual Dne : (DDD)V
    //   1406: aload #7
    //   1408: fload #10
    //   1410: f2d
    //   1411: fload #11
    //   1413: f2d
    //   1414: fload #10
    //   1416: fneg
    //   1417: f2d
    //   1418: invokevirtual Dne : (DDD)V
    //   1421: aload #7
    //   1423: fload #10
    //   1425: fneg
    //   1426: f2d
    //   1427: fload #11
    //   1429: f2d
    //   1430: fload #10
    //   1432: fneg
    //   1433: f2d
    //   1434: invokevirtual Dne : (DDD)V
    //   1437: aload #7
    //   1439: fload #10
    //   1441: f2d
    //   1442: fload #12
    //   1444: f2d
    //   1445: fload #10
    //   1447: fneg
    //   1448: f2d
    //   1449: invokevirtual Dne : (DDD)V
    //   1452: aload #7
    //   1454: fload #10
    //   1456: f2d
    //   1457: fload #12
    //   1459: f2d
    //   1460: fload #10
    //   1462: f2d
    //   1463: invokevirtual Dne : (DDD)V
    //   1466: aload #7
    //   1468: fload #10
    //   1470: f2d
    //   1471: fload #11
    //   1473: f2d
    //   1474: fload #10
    //   1476: f2d
    //   1477: invokevirtual Dne : (DDD)V
    //   1480: aload #7
    //   1482: fload #10
    //   1484: f2d
    //   1485: fload #11
    //   1487: f2d
    //   1488: fload #10
    //   1490: fneg
    //   1491: f2d
    //   1492: invokevirtual Dne : (DDD)V
    //   1495: aload #7
    //   1497: fload #10
    //   1499: fneg
    //   1500: f2d
    //   1501: fload #11
    //   1503: f2d
    //   1504: fload #10
    //   1506: fneg
    //   1507: f2d
    //   1508: invokevirtual Dne : (DDD)V
    //   1511: aload #7
    //   1513: fload #10
    //   1515: fneg
    //   1516: f2d
    //   1517: fload #11
    //   1519: f2d
    //   1520: fload #10
    //   1522: f2d
    //   1523: invokevirtual Dne : (DDD)V
    //   1526: aload #7
    //   1528: fload #10
    //   1530: fneg
    //   1531: f2d
    //   1532: fload #12
    //   1534: f2d
    //   1535: fload #10
    //   1537: f2d
    //   1538: invokevirtual Dne : (DDD)V
    //   1541: aload #7
    //   1543: fload #10
    //   1545: fneg
    //   1546: f2d
    //   1547: fload #12
    //   1549: f2d
    //   1550: fload #10
    //   1552: fneg
    //   1553: f2d
    //   1554: invokevirtual Dne : (DDD)V
    //   1557: aload #7
    //   1559: fload #10
    //   1561: fneg
    //   1562: f2d
    //   1563: fload #12
    //   1565: f2d
    //   1566: fload #10
    //   1568: fneg
    //   1569: f2d
    //   1570: invokevirtual Dne : (DDD)V
    //   1573: aload #7
    //   1575: fload #10
    //   1577: fneg
    //   1578: f2d
    //   1579: fload #12
    //   1581: f2d
    //   1582: fload #10
    //   1584: f2d
    //   1585: invokevirtual Dne : (DDD)V
    //   1588: aload #7
    //   1590: fload #10
    //   1592: f2d
    //   1593: fload #12
    //   1595: f2d
    //   1596: fload #10
    //   1598: f2d
    //   1599: invokevirtual Dne : (DDD)V
    //   1602: aload #7
    //   1604: fload #10
    //   1606: f2d
    //   1607: fload #12
    //   1609: f2d
    //   1610: fload #10
    //   1612: fneg
    //   1613: f2d
    //   1614: invokevirtual Dne : (DDD)V
    //   1617: aload #7
    //   1619: invokevirtual Dne : ()I
    //   1622: pop
    //   1623: aload_0
    //   1624: getfield Dne : LVzZ;
    //   1627: getfield Dne : LJik;
    //   1630: invokevirtual bzF : ()Z
    //   1633: ifeq -> 1669
    //   1636: fload_3
    //   1637: ldc 0.2
    //   1639: fmul
    //   1640: ldc_w 0.04
    //   1643: fadd
    //   1644: fload #4
    //   1646: ldc 0.2
    //   1648: fmul
    //   1649: ldc_w 0.04
    //   1652: fadd
    //   1653: fload #5
    //   1655: ldc_w 0.6
    //   1658: fmul
    //   1659: ldc_w 0.1
    //   1662: fadd
    //   1663: invokestatic glColor3f : (FFF)V
    //   1666: goto -> 1677
    //   1669: fload_3
    //   1670: fload #4
    //   1672: fload #5
    //   1674: invokestatic glColor3f : (FFF)V
    //   1677: invokestatic glPushMatrix : ()V
    //   1680: fconst_0
    //   1681: dload #21
    //   1683: ldc2_w 16.0
    //   1686: dsub
    //   1687: d2f
    //   1688: fneg
    //   1689: fconst_0
    //   1690: invokestatic glTranslatef : (FFF)V
    //   1693: aload_0
    //   1694: getfield IjH : I
    //   1697: invokestatic glCallList : (I)V
    //   1700: invokestatic glPopMatrix : ()V
    //   1703: sipush #3553
    //   1706: invokestatic glEnable : (I)V
    //   1709: iconst_1
    //   1710: invokestatic glDepthMask : (Z)V
    //   1713: return
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 >= 0 && paramInt5 < 10) {
      eyz eyz = (eyz)this.Dne.get(Integer.valueOf(paramInt1));
      if (eyz == null || eyz.Dne() != paramInt2 || eyz.FWm() != paramInt3 || eyz.bzF() != paramInt4) {
        eyz = new eyz(paramInt1, paramInt2, paramInt3, paramInt4);
        this.Dne.put(Integer.valueOf(paramInt1), eyz);
      } 
      eyz.Dne(paramInt5);
      eyz.FWm(this.zGp);
    } else {
      this.Dne.remove(Integer.valueOf(paramInt1));
    } 
  }
  
  public void FWm(FiG paramFiG, wHH paramwHH, int paramInt, NMq paramNMq, float paramFloat) {
    if (paramInt == 0 && paramwHH.Dne == gks.Dne) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glDepthMask(false);
      float f = 0.002F;
      int i = this.Dne.Dne(paramwHH.Dne, paramwHH.FWm, paramwHH.bzF);
      if (i > 0) {
        zKP.Dne[i].Dne((Zpi)this.Dne, paramwHH.Dne, paramwHH.FWm, paramwHH.bzF);
        double d1 = paramFiG.udO + (paramFiG.div - paramFiG.udO) * paramFloat;
        double d2 = paramFiG.ooe + (paramFiG.IjH - paramFiG.ooe) * paramFloat;
        double d3 = paramFiG.trS + (paramFiG.mrb - paramFiG.trS) * paramFloat;
        Dne(zKP.Dne[i].FWm((Qnq)this.Dne, paramwHH.Dne, paramwHH.FWm, paramwHH.bzF).FWm(f, f, f).bzF(-d1, -d2, -d3));
      } 
      GL11.glDepthMask(true);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ZGT zGT = ((VzZ)this.Dne).Dne;
    switch (paramInt1) {
      case 1013:
      case 1018:
        if (((Minecraft)this.Dne).Dne != null) {
          double d5;
          double d6;
          double d7;
          double d1 = paramInt2 - ((Minecraft)this.Dne).Dne.div;
          double d2 = paramInt3 - ((Minecraft)this.Dne).Dne.IjH;
          double d3 = paramInt4 - ((Minecraft)this.Dne).Dne.mrb;
          double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
          float f1 = ((Minecraft)this.Dne).Dne.div;
          float f2 = ((Minecraft)this.Dne).Dne.IjH;
          float f3 = ((Minecraft)this.Dne).Dne.mrb;
          if (d4 > 0.0D) {
            d5 = f1 + d1 / d4 * 2.0D;
            d6 = f2 + d2 / d4 * 2.0D;
            d7 = f3 + d3 / d4 * 2.0D;
          } 
          if (paramInt1 == 1013) {
            this.Dne.Dne(d5, d6, d7, "mob.wither.spawn", 1.0F, 1.0F, false);
            break;
          } 
          if (paramInt1 == 1018)
            this.Dne.Dne(d5, d6, d7, "mob.enderdragon.end", 5.0F, 1.0F, false); 
        } 
        break;
    } 
  }
  
  private void Qnq() {
    // Byte code:
    //   0: new java/util/Random
    //   3: dup
    //   4: ldc2_w 10842
    //   7: invokespecial <init> : (J)V
    //   10: astore_1
    //   11: getstatic WAR.Dne : LWAR;
    //   14: astore_2
    //   15: aload_2
    //   16: invokevirtual Dne : ()V
    //   19: iconst_0
    //   20: istore_3
    //   21: iload_3
    //   22: sipush #1500
    //   25: if_icmpge -> 398
    //   28: aload_1
    //   29: invokevirtual nextFloat : ()F
    //   32: fconst_2
    //   33: fmul
    //   34: fconst_1
    //   35: fsub
    //   36: f2d
    //   37: dstore #4
    //   39: aload_1
    //   40: invokevirtual nextFloat : ()F
    //   43: fconst_2
    //   44: fmul
    //   45: fconst_1
    //   46: fsub
    //   47: f2d
    //   48: dstore #6
    //   50: aload_1
    //   51: invokevirtual nextFloat : ()F
    //   54: fconst_2
    //   55: fmul
    //   56: fconst_1
    //   57: fsub
    //   58: f2d
    //   59: dstore #8
    //   61: ldc_w 0.15
    //   64: aload_1
    //   65: invokevirtual nextFloat : ()F
    //   68: ldc_w 0.1
    //   71: fmul
    //   72: fadd
    //   73: f2d
    //   74: dstore #10
    //   76: dload #4
    //   78: dload #4
    //   80: dmul
    //   81: dload #6
    //   83: dload #6
    //   85: dmul
    //   86: dadd
    //   87: dload #8
    //   89: dload #8
    //   91: dmul
    //   92: dadd
    //   93: dstore #12
    //   95: dload #12
    //   97: dconst_1
    //   98: dcmpg
    //   99: ifge -> 392
    //   102: dload #12
    //   104: ldc2_w 0.01
    //   107: dcmpl
    //   108: ifle -> 392
    //   111: dconst_1
    //   112: dload #12
    //   114: invokestatic sqrt : (D)D
    //   117: ddiv
    //   118: dstore #12
    //   120: dload #4
    //   122: dload #12
    //   124: dmul
    //   125: dstore #4
    //   127: dload #6
    //   129: dload #12
    //   131: dmul
    //   132: dstore #6
    //   134: dload #8
    //   136: dload #12
    //   138: dmul
    //   139: dstore #8
    //   141: dload #4
    //   143: ldc2_w 100.0
    //   146: dmul
    //   147: dstore #14
    //   149: dload #6
    //   151: ldc2_w 100.0
    //   154: dmul
    //   155: dstore #16
    //   157: dload #8
    //   159: ldc2_w 100.0
    //   162: dmul
    //   163: dstore #18
    //   165: dload #4
    //   167: dload #8
    //   169: invokestatic atan2 : (DD)D
    //   172: dstore #20
    //   174: dload #20
    //   176: invokestatic sin : (D)D
    //   179: dstore #22
    //   181: dload #20
    //   183: invokestatic cos : (D)D
    //   186: dstore #24
    //   188: dload #4
    //   190: dload #4
    //   192: dmul
    //   193: dload #8
    //   195: dload #8
    //   197: dmul
    //   198: dadd
    //   199: invokestatic sqrt : (D)D
    //   202: dload #6
    //   204: invokestatic atan2 : (DD)D
    //   207: dstore #26
    //   209: dload #26
    //   211: invokestatic sin : (D)D
    //   214: dstore #28
    //   216: dload #26
    //   218: invokestatic cos : (D)D
    //   221: dstore #30
    //   223: aload_1
    //   224: invokevirtual nextDouble : ()D
    //   227: ldc2_w 3.141592653589793
    //   230: dmul
    //   231: ldc2_w 2.0
    //   234: dmul
    //   235: dstore #32
    //   237: dload #32
    //   239: invokestatic sin : (D)D
    //   242: dstore #34
    //   244: dload #32
    //   246: invokestatic cos : (D)D
    //   249: dstore #36
    //   251: iconst_0
    //   252: istore #38
    //   254: iload #38
    //   256: iconst_4
    //   257: if_icmpge -> 392
    //   260: dconst_0
    //   261: dstore #39
    //   263: iload #38
    //   265: iconst_2
    //   266: iand
    //   267: iconst_1
    //   268: isub
    //   269: i2d
    //   270: dload #10
    //   272: dmul
    //   273: dstore #41
    //   275: iload #38
    //   277: iconst_1
    //   278: iadd
    //   279: iconst_2
    //   280: iand
    //   281: iconst_1
    //   282: isub
    //   283: i2d
    //   284: dload #10
    //   286: dmul
    //   287: dstore #43
    //   289: dload #41
    //   291: dload #36
    //   293: dmul
    //   294: dload #43
    //   296: dload #34
    //   298: dmul
    //   299: dsub
    //   300: dstore #45
    //   302: dload #43
    //   304: dload #36
    //   306: dmul
    //   307: dload #41
    //   309: dload #34
    //   311: dmul
    //   312: dadd
    //   313: dstore #47
    //   315: dload #45
    //   317: dload #28
    //   319: dmul
    //   320: dload #39
    //   322: dload #30
    //   324: dmul
    //   325: dadd
    //   326: dstore #49
    //   328: dload #39
    //   330: dload #28
    //   332: dmul
    //   333: dload #45
    //   335: dload #30
    //   337: dmul
    //   338: dsub
    //   339: dstore #51
    //   341: dload #51
    //   343: dload #22
    //   345: dmul
    //   346: dload #47
    //   348: dload #24
    //   350: dmul
    //   351: dsub
    //   352: dstore #53
    //   354: dload #47
    //   356: dload #22
    //   358: dmul
    //   359: dload #51
    //   361: dload #24
    //   363: dmul
    //   364: dadd
    //   365: dstore #55
    //   367: aload_2
    //   368: dload #14
    //   370: dload #53
    //   372: dadd
    //   373: dload #16
    //   375: dload #49
    //   377: dadd
    //   378: dload #18
    //   380: dload #55
    //   382: dadd
    //   383: invokevirtual Dne : (DDD)V
    //   386: iinc #38, 1
    //   389: goto -> 254
    //   392: iinc #3, 1
    //   395: goto -> 21
    //   398: aload_2
    //   399: invokevirtual Dne : ()I
    //   402: pop
    //   403: return
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3) {
    FWm(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1);
  }
  
  public void Dne(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    try {
      Dne(paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    } catch (Throwable throwable) {
      McM mcM = McM.Dne(throwable, "Exception while adding particle");
      Noo noo = mcM.Dne("Particle being added");
      noo.Dne("Name", paramString);
      noo.Dne("Position", new Yht(this, paramDouble1, paramDouble2, paramDouble3));
      throw new kaJ(mcM);
    } 
  }
  
  public void bzF() {
    pZS.Dne(this.aFZ);
  }
  
  public String Dne() {
    return "C: " + this.oIf + "/" + this.EyB + ". F: " + this.FfS + ", O: " + this.OdI + ", E: " + this.vSL;
  }
  
  public int Dne(FUH paramFUH, int paramInt, double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: getfield Dne : LBkx;
    //   7: ldc_w 'sortchunks'
    //   10: invokevirtual Dne : (Ljava/lang/String;)V
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: bipush #10
    //   20: if_icmpge -> 90
    //   23: aload_0
    //   24: aload_0
    //   25: getfield Fnk : I
    //   28: iconst_1
    //   29: iadd
    //   30: aload_0
    //   31: getfield FWm : [Lsnt;
    //   34: arraylength
    //   35: irem
    //   36: putfield Fnk : I
    //   39: aload_0
    //   40: getfield FWm : [Lsnt;
    //   43: aload_0
    //   44: getfield Fnk : I
    //   47: aaload
    //   48: astore #6
    //   50: aload #6
    //   52: getfield FWm : Z
    //   55: ifeq -> 84
    //   58: aload_0
    //   59: getfield FWm : Ljava/util/List;
    //   62: aload #6
    //   64: invokeinterface contains : (Ljava/lang/Object;)Z
    //   69: ifne -> 84
    //   72: aload_0
    //   73: getfield FWm : Ljava/util/List;
    //   76: aload #6
    //   78: invokeinterface add : (Ljava/lang/Object;)Z
    //   83: pop
    //   84: iinc #5, 1
    //   87: goto -> 16
    //   90: aload_0
    //   91: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   94: getfield Dne : LfZI;
    //   97: getfield Dne : I
    //   100: aload_0
    //   101: getfield trS : I
    //   104: if_icmpeq -> 111
    //   107: aload_0
    //   108: invokevirtual Dne : ()V
    //   111: iload_2
    //   112: ifne -> 145
    //   115: aload_0
    //   116: iconst_0
    //   117: putfield EyB : I
    //   120: aload_0
    //   121: iconst_0
    //   122: putfield RPx : I
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield FfS : I
    //   130: aload_0
    //   131: iconst_0
    //   132: putfield OdI : I
    //   135: aload_0
    //   136: iconst_0
    //   137: putfield oIf : I
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield vSL : I
    //   145: aload_1
    //   146: getfield udO : D
    //   149: aload_1
    //   150: getfield div : D
    //   153: aload_1
    //   154: getfield udO : D
    //   157: dsub
    //   158: dload_3
    //   159: dmul
    //   160: dadd
    //   161: dstore #5
    //   163: aload_1
    //   164: getfield ooe : D
    //   167: aload_1
    //   168: getfield IjH : D
    //   171: aload_1
    //   172: getfield ooe : D
    //   175: dsub
    //   176: dload_3
    //   177: dmul
    //   178: dadd
    //   179: dstore #7
    //   181: aload_1
    //   182: getfield trS : D
    //   185: aload_1
    //   186: getfield mrb : D
    //   189: aload_1
    //   190: getfield trS : D
    //   193: dsub
    //   194: dload_3
    //   195: dmul
    //   196: dadd
    //   197: dstore #9
    //   199: aload_1
    //   200: getfield div : D
    //   203: aload_0
    //   204: getfield Dne : D
    //   207: dsub
    //   208: dstore #11
    //   210: aload_1
    //   211: getfield IjH : D
    //   214: aload_0
    //   215: getfield FWm : D
    //   218: dsub
    //   219: dstore #13
    //   221: aload_1
    //   222: getfield mrb : D
    //   225: aload_0
    //   226: getfield bzF : D
    //   229: dsub
    //   230: dstore #15
    //   232: dload #11
    //   234: dload #11
    //   236: dmul
    //   237: dload #13
    //   239: dload #13
    //   241: dmul
    //   242: dadd
    //   243: dload #15
    //   245: dload #15
    //   247: dmul
    //   248: dadd
    //   249: ldc2_w 16.0
    //   252: dcmpl
    //   253: ifle -> 320
    //   256: aload_0
    //   257: aload_1
    //   258: getfield div : D
    //   261: putfield Dne : D
    //   264: aload_0
    //   265: aload_1
    //   266: getfield IjH : D
    //   269: putfield FWm : D
    //   272: aload_0
    //   273: aload_1
    //   274: getfield mrb : D
    //   277: putfield bzF : D
    //   280: aload_0
    //   281: aload_1
    //   282: getfield div : D
    //   285: invokestatic FWm : (D)I
    //   288: aload_1
    //   289: getfield IjH : D
    //   292: invokestatic FWm : (D)I
    //   295: aload_1
    //   296: getfield mrb : D
    //   299: invokestatic FWm : (D)I
    //   302: invokespecial bzF : (III)V
    //   305: aload_0
    //   306: getfield Dne : [Lsnt;
    //   309: new dPW
    //   312: dup
    //   313: aload_1
    //   314: invokespecial <init> : (LsMa;)V
    //   317: invokestatic sort : ([Ljava/lang/Object;Ljava/util/Comparator;)V
    //   320: invokestatic Dne : ()V
    //   323: iconst_0
    //   324: istore #17
    //   326: aload_0
    //   327: getfield Dne : Z
    //   330: ifeq -> 983
    //   333: aload_0
    //   334: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   337: getfield Dne : LfZI;
    //   340: getfield Qnq : Z
    //   343: ifeq -> 983
    //   346: aload_0
    //   347: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   350: getfield Dne : LfZI;
    //   353: getfield bzF : Z
    //   356: ifne -> 983
    //   359: iload_2
    //   360: ifne -> 983
    //   363: iconst_0
    //   364: istore #19
    //   366: bipush #16
    //   368: istore #20
    //   370: aload_0
    //   371: iload #19
    //   373: iload #20
    //   375: invokespecial Dne : (II)V
    //   378: iload #19
    //   380: istore #21
    //   382: iload #21
    //   384: iload #20
    //   386: if_icmpge -> 406
    //   389: aload_0
    //   390: getfield Dne : [Lsnt;
    //   393: iload #21
    //   395: aaload
    //   396: iconst_1
    //   397: putfield bzF : Z
    //   400: iinc #21, 1
    //   403: goto -> 382
    //   406: aload_0
    //   407: getfield Dne : LVzZ;
    //   410: getfield Dne : LBkx;
    //   413: ldc_w 'render'
    //   416: invokevirtual FWm : (Ljava/lang/String;)V
    //   419: iload #17
    //   421: aload_0
    //   422: iload #19
    //   424: iload #20
    //   426: iload_2
    //   427: dload_3
    //   428: invokespecial Dne : (IIID)I
    //   431: iadd
    //   432: istore #18
    //   434: aload_0
    //   435: getfield Dne : LVzZ;
    //   438: getfield Dne : LBkx;
    //   441: ldc_w 'occ'
    //   444: invokevirtual FWm : (Ljava/lang/String;)V
    //   447: iload #20
    //   449: istore #21
    //   451: iload #20
    //   453: iconst_2
    //   454: imul
    //   455: istore #20
    //   457: iload #20
    //   459: aload_0
    //   460: getfield Dne : [Lsnt;
    //   463: arraylength
    //   464: if_icmple -> 474
    //   467: aload_0
    //   468: getfield Dne : [Lsnt;
    //   471: arraylength
    //   472: istore #20
    //   474: sipush #3553
    //   477: invokestatic glDisable : (I)V
    //   480: sipush #2896
    //   483: invokestatic glDisable : (I)V
    //   486: sipush #3008
    //   489: invokestatic glDisable : (I)V
    //   492: sipush #2912
    //   495: invokestatic glDisable : (I)V
    //   498: iconst_0
    //   499: iconst_0
    //   500: iconst_0
    //   501: iconst_0
    //   502: invokestatic glColorMask : (ZZZZ)V
    //   505: iconst_0
    //   506: invokestatic glDepthMask : (Z)V
    //   509: aload_0
    //   510: getfield Dne : LVzZ;
    //   513: getfield Dne : LBkx;
    //   516: ldc_w 'check'
    //   519: invokevirtual Dne : (Ljava/lang/String;)V
    //   522: aload_0
    //   523: iload #21
    //   525: iload #20
    //   527: invokespecial Dne : (II)V
    //   530: aload_0
    //   531: getfield Dne : LVzZ;
    //   534: getfield Dne : LBkx;
    //   537: invokevirtual FWm : ()V
    //   540: invokestatic glPushMatrix : ()V
    //   543: fconst_0
    //   544: fstore #22
    //   546: fconst_0
    //   547: fstore #23
    //   549: fconst_0
    //   550: fstore #24
    //   552: iload #21
    //   554: istore #25
    //   556: iload #25
    //   558: iload #20
    //   560: if_icmpge -> 871
    //   563: aload_0
    //   564: getfield Dne : [Lsnt;
    //   567: iload #25
    //   569: aaload
    //   570: invokevirtual Dne : ()Z
    //   573: ifeq -> 590
    //   576: aload_0
    //   577: getfield Dne : [Lsnt;
    //   580: iload #25
    //   582: aaload
    //   583: iconst_0
    //   584: putfield Dne : Z
    //   587: goto -> 865
    //   590: aload_0
    //   591: getfield Dne : [Lsnt;
    //   594: iload #25
    //   596: aaload
    //   597: getfield Dne : Z
    //   600: ifne -> 614
    //   603: aload_0
    //   604: getfield Dne : [Lsnt;
    //   607: iload #25
    //   609: aaload
    //   610: iconst_1
    //   611: putfield bzF : Z
    //   614: aload_0
    //   615: getfield Dne : [Lsnt;
    //   618: iload #25
    //   620: aaload
    //   621: getfield Dne : Z
    //   624: ifeq -> 865
    //   627: aload_0
    //   628: getfield Dne : [Lsnt;
    //   631: iload #25
    //   633: aaload
    //   634: getfield Qnq : Z
    //   637: ifne -> 865
    //   640: aload_0
    //   641: getfield Dne : [Lsnt;
    //   644: iload #25
    //   646: aaload
    //   647: aload_1
    //   648: invokevirtual Dne : (LsMa;)F
    //   651: invokestatic bzF : (F)F
    //   654: fstore #26
    //   656: fconst_1
    //   657: fload #26
    //   659: ldc_w 128.0
    //   662: fdiv
    //   663: fadd
    //   664: f2i
    //   665: istore #27
    //   667: aload_0
    //   668: getfield zGp : I
    //   671: iload #27
    //   673: irem
    //   674: iload #25
    //   676: iload #27
    //   678: irem
    //   679: if_icmpne -> 865
    //   682: aload_0
    //   683: getfield Dne : [Lsnt;
    //   686: iload #25
    //   688: aaload
    //   689: astore #28
    //   691: aload #28
    //   693: getfield aFZ : I
    //   696: i2d
    //   697: dload #5
    //   699: dsub
    //   700: d2f
    //   701: fstore #29
    //   703: aload #28
    //   705: getfield zGp : I
    //   708: i2d
    //   709: dload #7
    //   711: dsub
    //   712: d2f
    //   713: fstore #30
    //   715: aload #28
    //   717: getfield DyG : I
    //   720: i2d
    //   721: dload #9
    //   723: dsub
    //   724: d2f
    //   725: fstore #31
    //   727: fload #29
    //   729: fload #22
    //   731: fsub
    //   732: fstore #32
    //   734: fload #30
    //   736: fload #23
    //   738: fsub
    //   739: fstore #33
    //   741: fload #31
    //   743: fload #24
    //   745: fsub
    //   746: fstore #34
    //   748: fload #32
    //   750: fconst_0
    //   751: fcmpl
    //   752: ifne -> 769
    //   755: fload #33
    //   757: fconst_0
    //   758: fcmpl
    //   759: ifne -> 769
    //   762: fload #34
    //   764: fconst_0
    //   765: fcmpl
    //   766: ifeq -> 799
    //   769: fload #32
    //   771: fload #33
    //   773: fload #34
    //   775: invokestatic glTranslatef : (FFF)V
    //   778: fload #22
    //   780: fload #32
    //   782: fadd
    //   783: fstore #22
    //   785: fload #23
    //   787: fload #33
    //   789: fadd
    //   790: fstore #23
    //   792: fload #24
    //   794: fload #34
    //   796: fadd
    //   797: fstore #24
    //   799: aload_0
    //   800: getfield Dne : LVzZ;
    //   803: getfield Dne : LBkx;
    //   806: ldc_w 'bb'
    //   809: invokevirtual Dne : (Ljava/lang/String;)V
    //   812: ldc_w 35092
    //   815: aload_0
    //   816: getfield Dne : [Lsnt;
    //   819: iload #25
    //   821: aaload
    //   822: getfield ooe : I
    //   825: invokestatic glBeginQueryARB : (II)V
    //   828: aload_0
    //   829: getfield Dne : [Lsnt;
    //   832: iload #25
    //   834: aaload
    //   835: invokevirtual Qnq : ()V
    //   838: ldc_w 35092
    //   841: invokestatic glEndQueryARB : (I)V
    //   844: aload_0
    //   845: getfield Dne : LVzZ;
    //   848: getfield Dne : LBkx;
    //   851: invokevirtual FWm : ()V
    //   854: aload_0
    //   855: getfield Dne : [Lsnt;
    //   858: iload #25
    //   860: aaload
    //   861: iconst_1
    //   862: putfield Qnq : Z
    //   865: iinc #25, 1
    //   868: goto -> 556
    //   871: invokestatic glPopMatrix : ()V
    //   874: aload_0
    //   875: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   878: getfield Dne : LfZI;
    //   881: getfield bzF : Z
    //   884: ifeq -> 913
    //   887: getstatic OEA.Dne : I
    //   890: ifne -> 903
    //   893: iconst_0
    //   894: iconst_1
    //   895: iconst_1
    //   896: iconst_1
    //   897: invokestatic glColorMask : (ZZZZ)V
    //   900: goto -> 920
    //   903: iconst_1
    //   904: iconst_0
    //   905: iconst_0
    //   906: iconst_1
    //   907: invokestatic glColorMask : (ZZZZ)V
    //   910: goto -> 920
    //   913: iconst_1
    //   914: iconst_1
    //   915: iconst_1
    //   916: iconst_1
    //   917: invokestatic glColorMask : (ZZZZ)V
    //   920: iconst_1
    //   921: invokestatic glDepthMask : (Z)V
    //   924: sipush #3553
    //   927: invokestatic glEnable : (I)V
    //   930: sipush #3008
    //   933: invokestatic glEnable : (I)V
    //   936: sipush #2912
    //   939: invokestatic glEnable : (I)V
    //   942: aload_0
    //   943: getfield Dne : LVzZ;
    //   946: getfield Dne : LBkx;
    //   949: ldc_w 'render'
    //   952: invokevirtual FWm : (Ljava/lang/String;)V
    //   955: iload #18
    //   957: aload_0
    //   958: iload #21
    //   960: iload #20
    //   962: iload_2
    //   963: dload_3
    //   964: invokespecial Dne : (IIID)I
    //   967: iadd
    //   968: istore #18
    //   970: iload #20
    //   972: aload_0
    //   973: getfield Dne : [Lsnt;
    //   976: arraylength
    //   977: if_icmplt -> 434
    //   980: goto -> 1013
    //   983: aload_0
    //   984: getfield Dne : LVzZ;
    //   987: getfield Dne : LBkx;
    //   990: ldc_w 'render'
    //   993: invokevirtual FWm : (Ljava/lang/String;)V
    //   996: iload #17
    //   998: aload_0
    //   999: iconst_0
    //   1000: aload_0
    //   1001: getfield Dne : [Lsnt;
    //   1004: arraylength
    //   1005: iload_2
    //   1006: dload_3
    //   1007: invokespecial Dne : (IIID)I
    //   1010: iadd
    //   1011: istore #18
    //   1013: aload_0
    //   1014: getfield Dne : LVzZ;
    //   1017: getfield Dne : LBkx;
    //   1020: invokevirtual FWm : ()V
    //   1023: iload #18
    //   1025: ireturn
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #16
    //   3: invokestatic Dne : (II)I
    //   6: istore #7
    //   8: iload_2
    //   9: bipush #16
    //   11: invokestatic Dne : (II)I
    //   14: istore #8
    //   16: iload_3
    //   17: bipush #16
    //   19: invokestatic Dne : (II)I
    //   22: istore #9
    //   24: iload #4
    //   26: bipush #16
    //   28: invokestatic Dne : (II)I
    //   31: istore #10
    //   33: iload #5
    //   35: bipush #16
    //   37: invokestatic Dne : (II)I
    //   40: istore #11
    //   42: iload #6
    //   44: bipush #16
    //   46: invokestatic Dne : (II)I
    //   49: istore #12
    //   51: iload #7
    //   53: istore #13
    //   55: iload #13
    //   57: iload #10
    //   59: if_icmpgt -> 230
    //   62: iload #13
    //   64: aload_0
    //   65: getfield FWm : I
    //   68: irem
    //   69: istore #14
    //   71: iload #14
    //   73: ifge -> 85
    //   76: iload #14
    //   78: aload_0
    //   79: getfield FWm : I
    //   82: iadd
    //   83: istore #14
    //   85: iload #8
    //   87: istore #15
    //   89: iload #15
    //   91: iload #11
    //   93: if_icmpgt -> 224
    //   96: iload #15
    //   98: aload_0
    //   99: getfield bzF : I
    //   102: irem
    //   103: istore #16
    //   105: iload #16
    //   107: ifge -> 119
    //   110: iload #16
    //   112: aload_0
    //   113: getfield bzF : I
    //   116: iadd
    //   117: istore #16
    //   119: iload #9
    //   121: istore #17
    //   123: iload #17
    //   125: iload #12
    //   127: if_icmpgt -> 218
    //   130: iload #17
    //   132: aload_0
    //   133: getfield Qnq : I
    //   136: irem
    //   137: istore #18
    //   139: iload #18
    //   141: ifge -> 153
    //   144: iload #18
    //   146: aload_0
    //   147: getfield Qnq : I
    //   150: iadd
    //   151: istore #18
    //   153: iload #18
    //   155: aload_0
    //   156: getfield bzF : I
    //   159: imul
    //   160: iload #16
    //   162: iadd
    //   163: aload_0
    //   164: getfield FWm : I
    //   167: imul
    //   168: iload #14
    //   170: iadd
    //   171: istore #19
    //   173: aload_0
    //   174: getfield FWm : [Lsnt;
    //   177: iload #19
    //   179: aaload
    //   180: astore #20
    //   182: aload #20
    //   184: ifnull -> 212
    //   187: aload #20
    //   189: getfield FWm : Z
    //   192: ifne -> 212
    //   195: aload_0
    //   196: getfield FWm : Ljava/util/List;
    //   199: aload #20
    //   201: invokeinterface add : (Ljava/lang/Object;)Z
    //   206: pop
    //   207: aload #20
    //   209: invokevirtual aFZ : ()V
    //   212: iinc #17, 1
    //   215: goto -> 123
    //   218: iinc #15, 1
    //   221: goto -> 89
    //   224: iinc #13, 1
    //   227: goto -> 55
    //   230: return
  }
  
  public void Dne(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    nyS nyS = nyS.Dne(paramString);
    if (paramString != null && nyS != null)
      ((Minecraft)this.Dne).Dne.Dne(nyS.Dne()); 
    ((Minecraft)this.Dne).Dne.Dne(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    double d1;
    double d2;
    double d3;
    String str1;
    int i;
    int j;
    int k;
    int m;
    double d4;
    byte b1;
    float f1;
    float f2;
    float f3;
    String str2;
    double d5;
    byte b2;
    ZGT zGT = ((VzZ)this.Dne).Dne;
    switch (paramInt1) {
      case 1000:
        this.Dne.Dne(paramInt2, paramInt3, paramInt4, "random.click", 1.0F, 1.0F, false);
        break;
      case 1001:
        this.Dne.Dne(paramInt2, paramInt3, paramInt4, "random.click", 1.0F, 1.2F, false);
        break;
      case 1002:
        this.Dne.Dne(paramInt2, paramInt3, paramInt4, "random.bow", 1.0F, 1.2F, false);
        break;
      case 1003:
        if (Math.random() < 0.5D) {
          this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "random.door_open", 1.0F, ((VzZ)this.Dne).Dne.nextFloat() * 0.1F + 0.9F, false);
          break;
        } 
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "random.door_close", 1.0F, ((VzZ)this.Dne).Dne.nextFloat() * 0.1F + 0.9F, false);
        break;
      case 1004:
        this.Dne.Dne((paramInt2 + 0.5F), (paramInt3 + 0.5F), (paramInt4 + 0.5F), "random.fizz", 0.5F, 2.6F + (zGT.nextFloat() - zGT.nextFloat()) * 0.8F, false);
        break;
      case 1005:
        if (dEr.Dne[paramInt5] instanceof nyS) {
          this.Dne.Dne((String)((nyS)dEr.Dne[paramInt5]).Dne, paramInt2, paramInt3, paramInt4);
          break;
        } 
        this.Dne.Dne((String)null, paramInt2, paramInt3, paramInt4);
        break;
      case 1007:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.ghast.charge", 10.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1008:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.ghast.fireball", 10.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1009:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.ghast.fireball", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1010:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.wood", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1011:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.metal", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1012:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.woodbreak", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1014:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.wither.shoot", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1015:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.bat.takeoff", 0.05F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1016:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.infect", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1017:
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.unfect", 2.0F, (zGT.nextFloat() - zGT.nextFloat()) * 0.2F + 1.0F, false);
        break;
      case 1020:
        this.Dne.Dne((paramInt2 + 0.5F), (paramInt3 + 0.5F), (paramInt4 + 0.5F), "random.anvil_break", 1.0F, ((VzZ)this.Dne).Dne.nextFloat() * 0.1F + 0.9F, false);
        break;
      case 1021:
        this.Dne.Dne((paramInt2 + 0.5F), (paramInt3 + 0.5F), (paramInt4 + 0.5F), "random.anvil_use", 1.0F, ((VzZ)this.Dne).Dne.nextFloat() * 0.1F + 0.9F, false);
        break;
      case 1022:
        this.Dne.Dne((paramInt2 + 0.5F), (paramInt3 + 0.5F), (paramInt4 + 0.5F), "random.anvil_land", 0.3F, ((VzZ)this.Dne).Dne.nextFloat() * 0.1F + 0.9F, false);
        break;
      case 2000:
        k = paramInt5 % 3 - 1;
        m = paramInt5 / 3 % 3 - 1;
        d2 = paramInt2 + k * 0.6D + 0.5D;
        d3 = paramInt3 + 0.5D;
        d4 = paramInt4 + m * 0.6D + 0.5D;
        for (b1 = 0; b1 < 10; b1++) {
          double d11 = zGT.nextDouble() * 0.2D + 0.01D;
          double d12 = d2 + k * 0.01D + (zGT.nextDouble() - 0.5D) * m * 0.5D;
          double d10 = d3 + (zGT.nextDouble() - 0.5D) * 0.5D;
          double d6 = d4 + m * 0.01D + (zGT.nextDouble() - 0.5D) * k * 0.5D;
          double d7 = k * d11 + zGT.nextGaussian() * 0.01D;
          double d8 = -0.03D + zGT.nextGaussian() * 0.01D;
          double d9 = m * d11 + zGT.nextGaussian() * 0.01D;
          Dne("smoke", d12, d10, d6, d7, d8, d9);
        } 
        return;
      case 2001:
        j = paramInt5 & 0xFFF;
        if (j > 0) {
          dNT dNT = zKP.Dne[j];
          ((Minecraft)this.Dne).Dne.Dne(dNT.kGO.Dne(), paramInt2 + 0.5F, paramInt3 + 0.5F, paramInt4 + 0.5F, (dNT.kGO.Dne() + 1.0F) / 2.0F, dNT.kGO.FWm() * 0.8F);
        } 
        ((Minecraft)this.Dne).Dne.Dne(paramInt2, paramInt3, paramInt4, paramInt5 & 0xFFF, paramInt5 >> 12 & 0xFF);
        break;
      case 2002:
        d1 = paramInt2;
        d2 = paramInt3;
        d3 = paramInt4;
        str1 = "iconcrack_" + ((IJk)dEr.Dne).Qnq;
        for (i = 0; i < 8; i++)
          Dne(str1, d1, d2, d3, zGT.nextGaussian() * 0.15D, zGT.nextDouble() * 0.2D, zGT.nextGaussian() * 0.15D); 
        i = dEr.Dne.FWm(paramInt5);
        f1 = (i >> 16 & 0xFF) / 255.0F;
        f2 = (i >> 8 & 0xFF) / 255.0F;
        f3 = (i >> 0 & 0xFF) / 255.0F;
        str2 = "spell";
        if (dEr.Dne.FWm(paramInt5))
          str2 = "instantSpell"; 
        for (j = 0; j < 100; j++) {
          double d10 = zGT.nextDouble() * 4.0D;
          double d6 = zGT.nextDouble() * Math.PI * 2.0D;
          double d7 = Math.cos(d6) * d10;
          double d8 = 0.01D + zGT.nextDouble() * 0.5D;
          double d9 = Math.sin(d6) * d10;
          CAZ cAZ = Dne(str2, d1 + d7 * 0.1D, d2 + 0.3D, d3 + d9 * 0.1D, d7, d8, d9);
          if (cAZ != null) {
            float f = 0.75F + zGT.nextFloat() * 0.25F;
            cAZ.Dne(f1 * f, f2 * f, f3 * f);
            cAZ.Dne((float)d10);
          } 
        } 
        this.Dne.Dne(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "random.glass", 1.0F, ((VzZ)this.Dne).Dne.nextFloat() * 0.1F + 0.9F, false);
        break;
      case 2003:
        d1 = paramInt2 + 0.5D;
        d2 = paramInt3;
        d3 = paramInt4 + 0.5D;
        str1 = "iconcrack_" + dEr.Woy.Qnq;
        for (i = 0; i < 8; i++)
          Dne(str1, d1, d2, d3, zGT.nextGaussian() * 0.15D, zGT.nextDouble() * 0.2D, zGT.nextGaussian() * 0.15D); 
        for (d5 = 0.0D; d5 < 6.283185307179586D; d5 += 0.15707963267948966D) {
          Dne("portal", d1 + Math.cos(d5) * 5.0D, d2 - 0.4D, d3 + Math.sin(d5) * 5.0D, Math.cos(d5) * -5.0D, 0.0D, Math.sin(d5) * -5.0D);
          Dne("portal", d1 + Math.cos(d5) * 5.0D, d2 - 0.4D, d3 + Math.sin(d5) * 5.0D, Math.cos(d5) * -7.0D, 0.0D, Math.sin(d5) * -7.0D);
        } 
        return;
      case 2004:
        for (b2 = 0; b2 < 20; b2++) {
          double d6 = paramInt2 + 0.5D + (((VzZ)this.Dne).Dne.nextFloat() - 0.5D) * 2.0D;
          double d7 = paramInt3 + 0.5D + (((VzZ)this.Dne).Dne.nextFloat() - 0.5D) * 2.0D;
          double d8 = paramInt4 + 0.5D + (((VzZ)this.Dne).Dne.nextFloat() - 0.5D) * 2.0D;
          this.Dne.Dne("smoke", d6, d7, d8, 0.0D, 0.0D, 0.0D);
          this.Dne.Dne("flame", d6, d7, d8, 0.0D, 0.0D, 0.0D);
        } 
        return;
      case 2005:
        AvN.Dne((Qnq)this.Dne, paramInt2, paramInt3, paramInt4, paramInt5);
        break;
    } 
  }
  
  public void Dne(VzZ paramVzZ) {
    if (this.Dne != null)
      this.Dne.FWm(this); 
    this.Dne = -9999.0D;
    this.FWm = -9999.0D;
    this.bzF = -9999.0D;
    ptH.Dne.Dne(paramVzZ);
    this.Dne = (IntBuffer)paramVzZ;
    this.Dne = (IntBuffer)new zVu(paramVzZ);
    if (paramVzZ != null) {
      paramVzZ.Dne(this);
      Dne();
    } 
  }
  
  private void Dne(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2; i++) {
      if (((snt)this.Dne[i]).Qnq != 0) {
        this.Dne.clear();
        ARBOcclusionQuery.glGetQueryObjectuARB(((snt)this.Dne[i]).ooe, 34919, this.Dne);
        if (this.Dne.get(0) != 0) {
          ((snt)this.Dne[i]).Qnq = 0;
          this.Dne.clear();
          ARBOcclusionQuery.glGetQueryObjectuARB(((snt)this.Dne[i]).ooe, 34918, this.Dne);
          ((snt)this.Dne[i]).bzF = (this.Dne.get(0) != 0);
        } 
      } 
    } 
  }
  
  public void FWm() {
    this.zGp++;
    if (this.zGp % 20 == 0) {
      Iterator<eyz> iterator = this.Dne.values().iterator();
      while (iterator.hasNext()) {
        eyz eyz = iterator.next();
        int i = eyz.aFZ();
        if (this.zGp - i > 400)
          iterator.remove(); 
      } 
    } 
  }
  
  public void Dne(chN paramchN, IPx paramIPx, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield qLR : I
    //   4: ifle -> 20
    //   7: aload_0
    //   8: dup
    //   9: getfield qLR : I
    //   12: iconst_1
    //   13: isub
    //   14: putfield qLR : I
    //   17: goto -> 645
    //   20: aload_0
    //   21: getfield Dne : LVzZ;
    //   24: getfield Dne : LBkx;
    //   27: ldc_w 'prepare'
    //   30: invokevirtual Dne : (Ljava/lang/String;)V
    //   33: getstatic XWr.Dne : LXWr;
    //   36: aload_0
    //   37: getfield Dne : LVzZ;
    //   40: aload_0
    //   41: getfield Dne : LSnh;
    //   44: aload_0
    //   45: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   48: getfield Dne : LmsA;
    //   51: aload_0
    //   52: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   55: getfield Dne : LFUH;
    //   58: fload_3
    //   59: invokevirtual Dne : (LQnq;LSnh;LmsA;LFUH;F)V
    //   62: getstatic ptH.Dne : LptH;
    //   65: aload_0
    //   66: getfield Dne : LVzZ;
    //   69: aload_0
    //   70: getfield Dne : LSnh;
    //   73: aload_0
    //   74: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   77: getfield Dne : LmsA;
    //   80: aload_0
    //   81: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   84: getfield Dne : LFUH;
    //   87: aload_0
    //   88: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   91: getfield FWm : LFUH;
    //   94: aload_0
    //   95: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   98: getfield Dne : LfZI;
    //   101: fload_3
    //   102: invokevirtual Dne : (LQnq;LSnh;LmsA;LFUH;LFUH;LfZI;F)V
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield ATE : I
    //   110: aload_0
    //   111: iconst_0
    //   112: putfield Vxn : I
    //   115: aload_0
    //   116: iconst_0
    //   117: putfield ceE : I
    //   120: aload_0
    //   121: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   124: getfield Dne : LFUH;
    //   127: astore #4
    //   129: aload #4
    //   131: getfield udO : D
    //   134: aload #4
    //   136: getfield div : D
    //   139: aload #4
    //   141: getfield udO : D
    //   144: dsub
    //   145: fload_3
    //   146: f2d
    //   147: dmul
    //   148: dadd
    //   149: putstatic ptH.Dne : D
    //   152: aload #4
    //   154: getfield ooe : D
    //   157: aload #4
    //   159: getfield IjH : D
    //   162: aload #4
    //   164: getfield ooe : D
    //   167: dsub
    //   168: fload_3
    //   169: f2d
    //   170: dmul
    //   171: dadd
    //   172: putstatic ptH.FWm : D
    //   175: aload #4
    //   177: getfield trS : D
    //   180: aload #4
    //   182: getfield mrb : D
    //   185: aload #4
    //   187: getfield trS : D
    //   190: dsub
    //   191: fload_3
    //   192: f2d
    //   193: dmul
    //   194: dadd
    //   195: putstatic ptH.bzF : D
    //   198: aload #4
    //   200: getfield udO : D
    //   203: aload #4
    //   205: getfield div : D
    //   208: aload #4
    //   210: getfield udO : D
    //   213: dsub
    //   214: fload_3
    //   215: f2d
    //   216: dmul
    //   217: dadd
    //   218: putstatic XWr.Dne : D
    //   221: aload #4
    //   223: getfield ooe : D
    //   226: aload #4
    //   228: getfield IjH : D
    //   231: aload #4
    //   233: getfield ooe : D
    //   236: dsub
    //   237: fload_3
    //   238: f2d
    //   239: dmul
    //   240: dadd
    //   241: putstatic XWr.FWm : D
    //   244: aload #4
    //   246: getfield trS : D
    //   249: aload #4
    //   251: getfield mrb : D
    //   254: aload #4
    //   256: getfield trS : D
    //   259: dsub
    //   260: fload_3
    //   261: f2d
    //   262: dmul
    //   263: dadd
    //   264: putstatic XWr.bzF : D
    //   267: aload_0
    //   268: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   271: getfield Dne : LOEA;
    //   274: fload_3
    //   275: f2d
    //   276: invokevirtual FWm : (D)V
    //   279: aload_0
    //   280: getfield Dne : LVzZ;
    //   283: getfield Dne : LBkx;
    //   286: ldc_w 'global'
    //   289: invokevirtual FWm : (Ljava/lang/String;)V
    //   292: aload_0
    //   293: getfield Dne : LVzZ;
    //   296: invokevirtual Dne : ()Ljava/util/List;
    //   299: astore #5
    //   301: aload_0
    //   302: aload #5
    //   304: invokeinterface size : ()I
    //   309: putfield ATE : I
    //   312: iconst_0
    //   313: istore #6
    //   315: iload #6
    //   317: aload_0
    //   318: getfield Dne : LVzZ;
    //   321: getfield aFZ : Ljava/util/List;
    //   324: invokeinterface size : ()I
    //   329: if_icmpge -> 385
    //   332: aload_0
    //   333: getfield Dne : LVzZ;
    //   336: getfield aFZ : Ljava/util/List;
    //   339: iload #6
    //   341: invokeinterface get : (I)Ljava/lang/Object;
    //   346: checkcast sMa
    //   349: astore #7
    //   351: aload_0
    //   352: dup
    //   353: getfield Vxn : I
    //   356: iconst_1
    //   357: iadd
    //   358: putfield Vxn : I
    //   361: aload #7
    //   363: aload_1
    //   364: invokevirtual Dne : (LchN;)Z
    //   367: ifeq -> 379
    //   370: getstatic ptH.Dne : LptH;
    //   373: aload #7
    //   375: fload_3
    //   376: invokevirtual Dne : (LsMa;F)V
    //   379: iinc #6, 1
    //   382: goto -> 315
    //   385: aload_0
    //   386: getfield Dne : LVzZ;
    //   389: getfield Dne : LBkx;
    //   392: ldc_w 'entities'
    //   395: invokevirtual FWm : (Ljava/lang/String;)V
    //   398: iconst_0
    //   399: istore #6
    //   401: iload #6
    //   403: aload #5
    //   405: invokeinterface size : ()I
    //   410: if_icmpge -> 563
    //   413: aload #5
    //   415: iload #6
    //   417: invokeinterface get : (I)Ljava/lang/Object;
    //   422: checkcast sMa
    //   425: astore #7
    //   427: aload #7
    //   429: aload_1
    //   430: invokevirtual Dne : (LchN;)Z
    //   433: ifeq -> 557
    //   436: aload #7
    //   438: getfield qLR : Z
    //   441: ifne -> 473
    //   444: aload_2
    //   445: aload #7
    //   447: getfield Dne : LbSp;
    //   450: invokeinterface Dne : (LbSp;)Z
    //   455: ifne -> 473
    //   458: aload #7
    //   460: getfield Dne : LsMa;
    //   463: aload_0
    //   464: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   467: getfield Dne : LMJs;
    //   470: if_acmpne -> 557
    //   473: aload #7
    //   475: aload_0
    //   476: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   479: getfield Dne : LFUH;
    //   482: if_acmpne -> 511
    //   485: aload_0
    //   486: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   489: getfield Dne : LfZI;
    //   492: getfield div : I
    //   495: ifne -> 511
    //   498: aload_0
    //   499: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   502: getfield Dne : LFUH;
    //   505: invokevirtual Wwe : ()Z
    //   508: ifeq -> 557
    //   511: aload_0
    //   512: getfield Dne : LVzZ;
    //   515: aload #7
    //   517: getfield div : D
    //   520: invokestatic FWm : (D)I
    //   523: iconst_0
    //   524: aload #7
    //   526: getfield mrb : D
    //   529: invokestatic FWm : (D)I
    //   532: invokevirtual bzF : (III)Z
    //   535: ifeq -> 557
    //   538: aload_0
    //   539: dup
    //   540: getfield Vxn : I
    //   543: iconst_1
    //   544: iadd
    //   545: putfield Vxn : I
    //   548: getstatic ptH.Dne : LptH;
    //   551: aload #7
    //   553: fload_3
    //   554: invokevirtual Dne : (LsMa;F)V
    //   557: iinc #6, 1
    //   560: goto -> 401
    //   563: aload_0
    //   564: getfield Dne : LVzZ;
    //   567: getfield Dne : LBkx;
    //   570: ldc_w 'tileentities'
    //   573: invokevirtual FWm : (Ljava/lang/String;)V
    //   576: invokestatic FWm : ()V
    //   579: iconst_0
    //   580: istore #6
    //   582: iload #6
    //   584: aload_0
    //   585: getfield Dne : Ljava/util/List;
    //   588: invokeinterface size : ()I
    //   593: if_icmpge -> 623
    //   596: getstatic XWr.Dne : LXWr;
    //   599: aload_0
    //   600: getfield Dne : Ljava/util/List;
    //   603: iload #6
    //   605: invokeinterface get : (I)Ljava/lang/Object;
    //   610: checkcast ipD
    //   613: fload_3
    //   614: invokevirtual Dne : (LipD;F)V
    //   617: iinc #6, 1
    //   620: goto -> 582
    //   623: aload_0
    //   624: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   627: getfield Dne : LOEA;
    //   630: fload_3
    //   631: f2d
    //   632: invokevirtual Dne : (D)V
    //   635: aload_0
    //   636: getfield Dne : LVzZ;
    //   639: getfield Dne : LBkx;
    //   642: invokevirtual FWm : ()V
    //   645: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */