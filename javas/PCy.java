import java.util.List;
import java.util.Random;

public class PCy extends ram {
  private int Dne = -1;
  
  private int bzF;
  
  private int FWm;
  
  public PCy(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.FWm = Dne(paramRandom);
    this.bzF = Dne(paramRandom);
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifge -> 51
    //   7: aload_0
    //   8: aload_0
    //   9: aload_1
    //   10: aload_3
    //   11: invokevirtual Dne : (LQnq;LCLK;)I
    //   14: putfield Dne : I
    //   17: aload_0
    //   18: getfield Dne : I
    //   21: ifge -> 26
    //   24: iconst_1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield Dne : LCLK;
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield Dne : I
    //   35: aload_0
    //   36: getfield Dne : LCLK;
    //   39: getfield aFZ : I
    //   42: isub
    //   43: iconst_4
    //   44: iadd
    //   45: iconst_1
    //   46: isub
    //   47: iconst_0
    //   48: invokevirtual Dne : (III)V
    //   51: aload_0
    //   52: aload_1
    //   53: aload_3
    //   54: iconst_0
    //   55: iconst_1
    //   56: iconst_0
    //   57: bipush #6
    //   59: iconst_4
    //   60: bipush #8
    //   62: iconst_0
    //   63: iconst_0
    //   64: iconst_0
    //   65: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   68: aload_0
    //   69: aload_1
    //   70: aload_3
    //   71: iconst_1
    //   72: iconst_0
    //   73: iconst_1
    //   74: iconst_2
    //   75: iconst_0
    //   76: bipush #7
    //   78: getstatic zKP.rPc : LzKP;
    //   81: getfield FWm : I
    //   84: getstatic zKP.rPc : LzKP;
    //   87: getfield FWm : I
    //   90: iconst_0
    //   91: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   94: aload_0
    //   95: aload_1
    //   96: aload_3
    //   97: iconst_4
    //   98: iconst_0
    //   99: iconst_1
    //   100: iconst_5
    //   101: iconst_0
    //   102: bipush #7
    //   104: getstatic zKP.rPc : LzKP;
    //   107: getfield FWm : I
    //   110: getstatic zKP.rPc : LzKP;
    //   113: getfield FWm : I
    //   116: iconst_0
    //   117: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   120: aload_0
    //   121: aload_1
    //   122: aload_3
    //   123: iconst_0
    //   124: iconst_0
    //   125: iconst_0
    //   126: iconst_0
    //   127: iconst_0
    //   128: bipush #8
    //   130: getstatic zKP.udO : LzKP;
    //   133: getfield FWm : I
    //   136: getstatic zKP.udO : LzKP;
    //   139: getfield FWm : I
    //   142: iconst_0
    //   143: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   146: aload_0
    //   147: aload_1
    //   148: aload_3
    //   149: bipush #6
    //   151: iconst_0
    //   152: iconst_0
    //   153: bipush #6
    //   155: iconst_0
    //   156: bipush #8
    //   158: getstatic zKP.udO : LzKP;
    //   161: getfield FWm : I
    //   164: getstatic zKP.udO : LzKP;
    //   167: getfield FWm : I
    //   170: iconst_0
    //   171: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   174: aload_0
    //   175: aload_1
    //   176: aload_3
    //   177: iconst_1
    //   178: iconst_0
    //   179: iconst_0
    //   180: iconst_5
    //   181: iconst_0
    //   182: iconst_0
    //   183: getstatic zKP.udO : LzKP;
    //   186: getfield FWm : I
    //   189: getstatic zKP.udO : LzKP;
    //   192: getfield FWm : I
    //   195: iconst_0
    //   196: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   199: aload_0
    //   200: aload_1
    //   201: aload_3
    //   202: iconst_1
    //   203: iconst_0
    //   204: bipush #8
    //   206: iconst_5
    //   207: iconst_0
    //   208: bipush #8
    //   210: getstatic zKP.udO : LzKP;
    //   213: getfield FWm : I
    //   216: getstatic zKP.udO : LzKP;
    //   219: getfield FWm : I
    //   222: iconst_0
    //   223: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   226: aload_0
    //   227: aload_1
    //   228: aload_3
    //   229: iconst_3
    //   230: iconst_0
    //   231: iconst_1
    //   232: iconst_3
    //   233: iconst_0
    //   234: bipush #7
    //   236: getstatic zKP.Dne : Lbyt;
    //   239: getfield FWm : I
    //   242: getstatic zKP.Dne : Lbyt;
    //   245: getfield FWm : I
    //   248: iconst_0
    //   249: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   252: iconst_1
    //   253: istore #4
    //   255: iload #4
    //   257: bipush #7
    //   259: if_icmpgt -> 352
    //   262: aload_0
    //   263: aload_1
    //   264: aload_0
    //   265: getfield FWm : I
    //   268: aload_2
    //   269: iconst_2
    //   270: bipush #7
    //   272: invokestatic Dne : (Ljava/util/Random;II)I
    //   275: iconst_1
    //   276: iconst_1
    //   277: iload #4
    //   279: aload_3
    //   280: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   283: aload_0
    //   284: aload_1
    //   285: aload_0
    //   286: getfield FWm : I
    //   289: aload_2
    //   290: iconst_2
    //   291: bipush #7
    //   293: invokestatic Dne : (Ljava/util/Random;II)I
    //   296: iconst_2
    //   297: iconst_1
    //   298: iload #4
    //   300: aload_3
    //   301: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   304: aload_0
    //   305: aload_1
    //   306: aload_0
    //   307: getfield bzF : I
    //   310: aload_2
    //   311: iconst_2
    //   312: bipush #7
    //   314: invokestatic Dne : (Ljava/util/Random;II)I
    //   317: iconst_4
    //   318: iconst_1
    //   319: iload #4
    //   321: aload_3
    //   322: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   325: aload_0
    //   326: aload_1
    //   327: aload_0
    //   328: getfield bzF : I
    //   331: aload_2
    //   332: iconst_2
    //   333: bipush #7
    //   335: invokestatic Dne : (Ljava/util/Random;II)I
    //   338: iconst_5
    //   339: iconst_1
    //   340: iload #4
    //   342: aload_3
    //   343: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   346: iinc #4, 1
    //   349: goto -> 255
    //   352: iconst_0
    //   353: istore #4
    //   355: iload #4
    //   357: bipush #9
    //   359: if_icmpge -> 413
    //   362: iconst_0
    //   363: istore #5
    //   365: iload #5
    //   367: bipush #7
    //   369: if_icmpge -> 407
    //   372: aload_0
    //   373: aload_1
    //   374: iload #5
    //   376: iconst_4
    //   377: iload #4
    //   379: aload_3
    //   380: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   383: aload_0
    //   384: aload_1
    //   385: getstatic zKP.FWm : LzKP;
    //   388: getfield FWm : I
    //   391: iconst_0
    //   392: iload #5
    //   394: iconst_m1
    //   395: iload #4
    //   397: aload_3
    //   398: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   401: iinc #5, 1
    //   404: goto -> 365
    //   407: iinc #4, 1
    //   410: goto -> 355
    //   413: iconst_1
    //   414: ireturn
  }
  
  private int Dne(Random paramRandom) {
    switch (paramRandom.nextInt(5)) {
      case 0:
        return zKP.jXR.FWm;
      case 1:
        return zKP.HDz.FWm;
    } 
    return zKP.EWz.FWm;
  }
  
  public static PCy Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 7, 4, 9, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new PCy(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PCy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */