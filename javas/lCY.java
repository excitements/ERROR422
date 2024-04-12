import java.util.List;
import java.util.Random;

public class lCY extends ram {
  private int FWm;
  
  private int Dne = -1;
  
  private int bzF;
  
  private int Qnq;
  
  private int DyG;
  
  public lCY(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.FWm = Dne(paramRandom);
    this.bzF = Dne(paramRandom);
    this.Qnq = Dne(paramRandom);
    this.DyG = Dne(paramRandom);
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
  
  public static lCY Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 13, 4, 9, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new lCY(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
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
    //   57: bipush #12
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
    //   123: bipush #7
    //   125: iconst_0
    //   126: iconst_1
    //   127: bipush #8
    //   129: iconst_0
    //   130: bipush #7
    //   132: getstatic zKP.rPc : LzKP;
    //   135: getfield FWm : I
    //   138: getstatic zKP.rPc : LzKP;
    //   141: getfield FWm : I
    //   144: iconst_0
    //   145: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   148: aload_0
    //   149: aload_1
    //   150: aload_3
    //   151: bipush #10
    //   153: iconst_0
    //   154: iconst_1
    //   155: bipush #11
    //   157: iconst_0
    //   158: bipush #7
    //   160: getstatic zKP.rPc : LzKP;
    //   163: getfield FWm : I
    //   166: getstatic zKP.rPc : LzKP;
    //   169: getfield FWm : I
    //   172: iconst_0
    //   173: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   176: aload_0
    //   177: aload_1
    //   178: aload_3
    //   179: iconst_0
    //   180: iconst_0
    //   181: iconst_0
    //   182: iconst_0
    //   183: iconst_0
    //   184: bipush #8
    //   186: getstatic zKP.udO : LzKP;
    //   189: getfield FWm : I
    //   192: getstatic zKP.udO : LzKP;
    //   195: getfield FWm : I
    //   198: iconst_0
    //   199: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   202: aload_0
    //   203: aload_1
    //   204: aload_3
    //   205: bipush #6
    //   207: iconst_0
    //   208: iconst_0
    //   209: bipush #6
    //   211: iconst_0
    //   212: bipush #8
    //   214: getstatic zKP.udO : LzKP;
    //   217: getfield FWm : I
    //   220: getstatic zKP.udO : LzKP;
    //   223: getfield FWm : I
    //   226: iconst_0
    //   227: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   230: aload_0
    //   231: aload_1
    //   232: aload_3
    //   233: bipush #12
    //   235: iconst_0
    //   236: iconst_0
    //   237: bipush #12
    //   239: iconst_0
    //   240: bipush #8
    //   242: getstatic zKP.udO : LzKP;
    //   245: getfield FWm : I
    //   248: getstatic zKP.udO : LzKP;
    //   251: getfield FWm : I
    //   254: iconst_0
    //   255: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   258: aload_0
    //   259: aload_1
    //   260: aload_3
    //   261: iconst_1
    //   262: iconst_0
    //   263: iconst_0
    //   264: bipush #11
    //   266: iconst_0
    //   267: iconst_0
    //   268: getstatic zKP.udO : LzKP;
    //   271: getfield FWm : I
    //   274: getstatic zKP.udO : LzKP;
    //   277: getfield FWm : I
    //   280: iconst_0
    //   281: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   284: aload_0
    //   285: aload_1
    //   286: aload_3
    //   287: iconst_1
    //   288: iconst_0
    //   289: bipush #8
    //   291: bipush #11
    //   293: iconst_0
    //   294: bipush #8
    //   296: getstatic zKP.udO : LzKP;
    //   299: getfield FWm : I
    //   302: getstatic zKP.udO : LzKP;
    //   305: getfield FWm : I
    //   308: iconst_0
    //   309: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   312: aload_0
    //   313: aload_1
    //   314: aload_3
    //   315: iconst_3
    //   316: iconst_0
    //   317: iconst_1
    //   318: iconst_3
    //   319: iconst_0
    //   320: bipush #7
    //   322: getstatic zKP.Dne : Lbyt;
    //   325: getfield FWm : I
    //   328: getstatic zKP.Dne : Lbyt;
    //   331: getfield FWm : I
    //   334: iconst_0
    //   335: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   338: aload_0
    //   339: aload_1
    //   340: aload_3
    //   341: bipush #9
    //   343: iconst_0
    //   344: iconst_1
    //   345: bipush #9
    //   347: iconst_0
    //   348: bipush #7
    //   350: getstatic zKP.Dne : Lbyt;
    //   353: getfield FWm : I
    //   356: getstatic zKP.Dne : Lbyt;
    //   359: getfield FWm : I
    //   362: iconst_0
    //   363: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   366: iconst_1
    //   367: istore #4
    //   369: iload #4
    //   371: bipush #7
    //   373: if_icmpgt -> 554
    //   376: aload_0
    //   377: aload_1
    //   378: aload_0
    //   379: getfield FWm : I
    //   382: aload_2
    //   383: iconst_2
    //   384: bipush #7
    //   386: invokestatic Dne : (Ljava/util/Random;II)I
    //   389: iconst_1
    //   390: iconst_1
    //   391: iload #4
    //   393: aload_3
    //   394: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   397: aload_0
    //   398: aload_1
    //   399: aload_0
    //   400: getfield FWm : I
    //   403: aload_2
    //   404: iconst_2
    //   405: bipush #7
    //   407: invokestatic Dne : (Ljava/util/Random;II)I
    //   410: iconst_2
    //   411: iconst_1
    //   412: iload #4
    //   414: aload_3
    //   415: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   418: aload_0
    //   419: aload_1
    //   420: aload_0
    //   421: getfield bzF : I
    //   424: aload_2
    //   425: iconst_2
    //   426: bipush #7
    //   428: invokestatic Dne : (Ljava/util/Random;II)I
    //   431: iconst_4
    //   432: iconst_1
    //   433: iload #4
    //   435: aload_3
    //   436: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   439: aload_0
    //   440: aload_1
    //   441: aload_0
    //   442: getfield bzF : I
    //   445: aload_2
    //   446: iconst_2
    //   447: bipush #7
    //   449: invokestatic Dne : (Ljava/util/Random;II)I
    //   452: iconst_5
    //   453: iconst_1
    //   454: iload #4
    //   456: aload_3
    //   457: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   460: aload_0
    //   461: aload_1
    //   462: aload_0
    //   463: getfield Qnq : I
    //   466: aload_2
    //   467: iconst_2
    //   468: bipush #7
    //   470: invokestatic Dne : (Ljava/util/Random;II)I
    //   473: bipush #7
    //   475: iconst_1
    //   476: iload #4
    //   478: aload_3
    //   479: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   482: aload_0
    //   483: aload_1
    //   484: aload_0
    //   485: getfield Qnq : I
    //   488: aload_2
    //   489: iconst_2
    //   490: bipush #7
    //   492: invokestatic Dne : (Ljava/util/Random;II)I
    //   495: bipush #8
    //   497: iconst_1
    //   498: iload #4
    //   500: aload_3
    //   501: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   504: aload_0
    //   505: aload_1
    //   506: aload_0
    //   507: getfield DyG : I
    //   510: aload_2
    //   511: iconst_2
    //   512: bipush #7
    //   514: invokestatic Dne : (Ljava/util/Random;II)I
    //   517: bipush #10
    //   519: iconst_1
    //   520: iload #4
    //   522: aload_3
    //   523: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   526: aload_0
    //   527: aload_1
    //   528: aload_0
    //   529: getfield DyG : I
    //   532: aload_2
    //   533: iconst_2
    //   534: bipush #7
    //   536: invokestatic Dne : (Ljava/util/Random;II)I
    //   539: bipush #11
    //   541: iconst_1
    //   542: iload #4
    //   544: aload_3
    //   545: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   548: iinc #4, 1
    //   551: goto -> 369
    //   554: iconst_0
    //   555: istore #4
    //   557: iload #4
    //   559: bipush #9
    //   561: if_icmpge -> 615
    //   564: iconst_0
    //   565: istore #5
    //   567: iload #5
    //   569: bipush #13
    //   571: if_icmpge -> 609
    //   574: aload_0
    //   575: aload_1
    //   576: iload #5
    //   578: iconst_4
    //   579: iload #4
    //   581: aload_3
    //   582: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   585: aload_0
    //   586: aload_1
    //   587: getstatic zKP.FWm : LzKP;
    //   590: getfield FWm : I
    //   593: iconst_0
    //   594: iload #5
    //   596: iconst_m1
    //   597: iload #4
    //   599: aload_3
    //   600: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   603: iinc #5, 1
    //   606: goto -> 567
    //   609: iinc #4, 1
    //   612: goto -> 557
    //   615: iconst_1
    //   616: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lCY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */