import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Afj implements TaY {
  private Minecraft Dne;
  
  private String Dne;
  
  private long Dne;
  
  private boolean Dne = "";
  
  private String FWm = "";
  
  public void FWm(String paramString) {
    this.Dne = true;
    bzF(paramString);
  }
  
  public void d_() {}
  
  public void bzF(String paramString) {
    this.FWm = paramString;
    if (!this.Dne.DyG) {
      if (!this.Dne)
        throw new MCb(); 
    } else {
      IJm iJm = new IJm(this.Dne.Dne, this.Dne.Dne, this.Dne.FWm);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, iJm.Dne(), iJm.FWm(), 0.0D, 100.0D, 300.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -200.0F);
    } 
  }
  
  public void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield DyG : Z
    //   7: ifne -> 25
    //   10: aload_0
    //   11: getfield Dne : Z
    //   14: ifne -> 547
    //   17: new MCb
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: athrow
    //   25: invokestatic Dne : ()J
    //   28: lstore_2
    //   29: lload_2
    //   30: aload_0
    //   31: getfield Dne : J
    //   34: lsub
    //   35: ldc2_w 100
    //   38: lcmp
    //   39: iflt -> 547
    //   42: aload_0
    //   43: lload_2
    //   44: putfield Dne : J
    //   47: new IJm
    //   50: dup
    //   51: aload_0
    //   52: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   55: getfield Dne : LfZI;
    //   58: aload_0
    //   59: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   62: getfield Dne : I
    //   65: aload_0
    //   66: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   69: getfield FWm : I
    //   72: invokespecial <init> : (LfZI;II)V
    //   75: astore #4
    //   77: aload #4
    //   79: invokevirtual Dne : ()I
    //   82: istore #5
    //   84: aload #4
    //   86: invokevirtual FWm : ()I
    //   89: istore #6
    //   91: sipush #256
    //   94: invokestatic glClear : (I)V
    //   97: sipush #5889
    //   100: invokestatic glMatrixMode : (I)V
    //   103: invokestatic glLoadIdentity : ()V
    //   106: dconst_0
    //   107: aload #4
    //   109: invokevirtual Dne : ()D
    //   112: aload #4
    //   114: invokevirtual FWm : ()D
    //   117: dconst_0
    //   118: ldc2_w 100.0
    //   121: ldc2_w 300.0
    //   124: invokestatic glOrtho : (DDDDDD)V
    //   127: sipush #5888
    //   130: invokestatic glMatrixMode : (I)V
    //   133: invokestatic glLoadIdentity : ()V
    //   136: fconst_0
    //   137: fconst_0
    //   138: ldc -200.0
    //   140: invokestatic glTranslatef : (FFF)V
    //   143: sipush #16640
    //   146: invokestatic glClear : (I)V
    //   149: getstatic WAR.Dne : LWAR;
    //   152: astore #7
    //   154: aload_0
    //   155: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   158: getfield Dne : LSnh;
    //   161: ldc '/rock.png'
    //   163: invokevirtual Dne : (Ljava/lang/String;)V
    //   166: ldc 32.0
    //   168: fstore #8
    //   170: aload #7
    //   172: invokevirtual Dne : ()V
    //   175: aload #7
    //   177: ldc 4210752
    //   179: invokevirtual bzF : (I)V
    //   182: aload #7
    //   184: dconst_0
    //   185: iload #6
    //   187: i2d
    //   188: dconst_0
    //   189: dconst_0
    //   190: iload #6
    //   192: i2f
    //   193: fload #8
    //   195: fdiv
    //   196: f2d
    //   197: invokevirtual Dne : (DDDDD)V
    //   200: aload #7
    //   202: iload #5
    //   204: i2d
    //   205: iload #6
    //   207: i2d
    //   208: dconst_0
    //   209: iload #5
    //   211: i2f
    //   212: fload #8
    //   214: fdiv
    //   215: f2d
    //   216: iload #6
    //   218: i2f
    //   219: fload #8
    //   221: fdiv
    //   222: f2d
    //   223: invokevirtual Dne : (DDDDD)V
    //   226: aload #7
    //   228: iload #5
    //   230: i2d
    //   231: dconst_0
    //   232: dconst_0
    //   233: iload #5
    //   235: i2f
    //   236: fload #8
    //   238: fdiv
    //   239: f2d
    //   240: dconst_0
    //   241: invokevirtual Dne : (DDDDD)V
    //   244: aload #7
    //   246: dconst_0
    //   247: dconst_0
    //   248: dconst_0
    //   249: dconst_0
    //   250: dconst_0
    //   251: invokevirtual Dne : (DDDDD)V
    //   254: aload #7
    //   256: invokevirtual Dne : ()I
    //   259: pop
    //   260: iload_1
    //   261: iflt -> 446
    //   264: bipush #100
    //   266: istore #9
    //   268: iconst_2
    //   269: istore #10
    //   271: iload #5
    //   273: iconst_2
    //   274: idiv
    //   275: iload #9
    //   277: iconst_2
    //   278: idiv
    //   279: isub
    //   280: istore #11
    //   282: iload #6
    //   284: iconst_2
    //   285: idiv
    //   286: bipush #16
    //   288: iadd
    //   289: istore #12
    //   291: sipush #3553
    //   294: invokestatic glDisable : (I)V
    //   297: aload #7
    //   299: invokevirtual Dne : ()V
    //   302: aload #7
    //   304: ldc 8421504
    //   306: invokevirtual bzF : (I)V
    //   309: aload #7
    //   311: iload #11
    //   313: i2d
    //   314: iload #12
    //   316: i2d
    //   317: dconst_0
    //   318: invokevirtual Dne : (DDD)V
    //   321: aload #7
    //   323: iload #11
    //   325: i2d
    //   326: iload #12
    //   328: iload #10
    //   330: iadd
    //   331: i2d
    //   332: dconst_0
    //   333: invokevirtual Dne : (DDD)V
    //   336: aload #7
    //   338: iload #11
    //   340: iload #9
    //   342: iadd
    //   343: i2d
    //   344: iload #12
    //   346: iload #10
    //   348: iadd
    //   349: i2d
    //   350: dconst_0
    //   351: invokevirtual Dne : (DDD)V
    //   354: aload #7
    //   356: iload #11
    //   358: iload #9
    //   360: iadd
    //   361: i2d
    //   362: iload #12
    //   364: i2d
    //   365: dconst_0
    //   366: invokevirtual Dne : (DDD)V
    //   369: aload #7
    //   371: ldc 8454016
    //   373: invokevirtual bzF : (I)V
    //   376: aload #7
    //   378: iload #11
    //   380: i2d
    //   381: iload #12
    //   383: i2d
    //   384: dconst_0
    //   385: invokevirtual Dne : (DDD)V
    //   388: aload #7
    //   390: iload #11
    //   392: i2d
    //   393: iload #12
    //   395: iload #10
    //   397: iadd
    //   398: i2d
    //   399: dconst_0
    //   400: invokevirtual Dne : (DDD)V
    //   403: aload #7
    //   405: iload #11
    //   407: iload_1
    //   408: iadd
    //   409: i2d
    //   410: iload #12
    //   412: iload #10
    //   414: iadd
    //   415: i2d
    //   416: dconst_0
    //   417: invokevirtual Dne : (DDD)V
    //   420: aload #7
    //   422: iload #11
    //   424: iload_1
    //   425: iadd
    //   426: i2d
    //   427: iload #12
    //   429: i2d
    //   430: dconst_0
    //   431: invokevirtual Dne : (DDD)V
    //   434: aload #7
    //   436: invokevirtual Dne : ()I
    //   439: pop
    //   440: sipush #3553
    //   443: invokestatic glEnable : (I)V
    //   446: aload_0
    //   447: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   450: getfield Dne : LmsA;
    //   453: aload_0
    //   454: getfield FWm : Ljava/lang/String;
    //   457: iload #5
    //   459: aload_0
    //   460: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   463: getfield Dne : LmsA;
    //   466: aload_0
    //   467: getfield FWm : Ljava/lang/String;
    //   470: invokevirtual Dne : (Ljava/lang/String;)I
    //   473: isub
    //   474: iconst_2
    //   475: idiv
    //   476: iload #6
    //   478: iconst_2
    //   479: idiv
    //   480: iconst_4
    //   481: isub
    //   482: bipush #16
    //   484: isub
    //   485: ldc 16777215
    //   487: invokevirtual Dne : (Ljava/lang/String;III)I
    //   490: pop
    //   491: aload_0
    //   492: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   495: getfield Dne : LmsA;
    //   498: aload_0
    //   499: getfield Dne : Ljava/lang/String;
    //   502: iload #5
    //   504: aload_0
    //   505: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   508: getfield Dne : LmsA;
    //   511: aload_0
    //   512: getfield Dne : Ljava/lang/String;
    //   515: invokevirtual Dne : (Ljava/lang/String;)I
    //   518: isub
    //   519: iconst_2
    //   520: idiv
    //   521: iload #6
    //   523: iconst_2
    //   524: idiv
    //   525: iconst_4
    //   526: isub
    //   527: bipush #8
    //   529: iadd
    //   530: ldc 16777215
    //   532: invokevirtual Dne : (Ljava/lang/String;III)I
    //   535: pop
    //   536: invokestatic update : ()V
    //   539: invokestatic yield : ()V
    //   542: goto -> 547
    //   545: astore #9
    //   547: return
    // Exception table:
    //   from	to	target	type
    //   539	542	545	java/lang/Exception
  }
  
  public void Qnq(String paramString) {
    if (!this.Dne.DyG) {
      if (!this.Dne)
        throw new MCb(); 
    } else {
      this.Dne = 0L;
      this.Dne = paramString;
      Dne(-1);
      this.Dne = 0L;
    } 
  }
  
  public void Dne(String paramString) {
    this.Dne = false;
    bzF(paramString);
  }
  
  public Afj(Minecraft paramMinecraft) {
    this.Dne = Minecraft.Dne();
    this.Dne = false;
    this.Dne = paramMinecraft;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Afj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */