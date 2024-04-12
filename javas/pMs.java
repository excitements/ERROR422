import java.util.List;
import java.util.Random;

public class pMs extends ram {
  private final boolean Dne;
  
  private final int FWm;
  
  private int Dne = -1;
  
  public pMs(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.Dne = paramRandom.nextBoolean();
    this.FWm = paramRandom.nextInt(3);
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifge -> 52
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
    //   43: bipush #6
    //   45: iadd
    //   46: iconst_1
    //   47: isub
    //   48: iconst_0
    //   49: invokevirtual Dne : (III)V
    //   52: aload_0
    //   53: aload_1
    //   54: aload_3
    //   55: iconst_1
    //   56: iconst_1
    //   57: iconst_1
    //   58: iconst_3
    //   59: iconst_5
    //   60: iconst_4
    //   61: iconst_0
    //   62: iconst_0
    //   63: iconst_0
    //   64: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   67: aload_0
    //   68: aload_1
    //   69: aload_3
    //   70: iconst_0
    //   71: iconst_0
    //   72: iconst_0
    //   73: iconst_3
    //   74: iconst_0
    //   75: iconst_4
    //   76: getstatic zKP.bzF : LzKP;
    //   79: getfield FWm : I
    //   82: getstatic zKP.bzF : LzKP;
    //   85: getfield FWm : I
    //   88: iconst_0
    //   89: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   92: aload_0
    //   93: aload_1
    //   94: aload_3
    //   95: iconst_1
    //   96: iconst_0
    //   97: iconst_1
    //   98: iconst_2
    //   99: iconst_0
    //   100: iconst_3
    //   101: getstatic zKP.FWm : LzKP;
    //   104: getfield FWm : I
    //   107: getstatic zKP.FWm : LzKP;
    //   110: getfield FWm : I
    //   113: iconst_0
    //   114: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   117: aload_0
    //   118: getfield Dne : Z
    //   121: ifeq -> 152
    //   124: aload_0
    //   125: aload_1
    //   126: aload_3
    //   127: iconst_1
    //   128: iconst_4
    //   129: iconst_1
    //   130: iconst_2
    //   131: iconst_4
    //   132: iconst_3
    //   133: getstatic zKP.udO : LzKP;
    //   136: getfield FWm : I
    //   139: getstatic zKP.udO : LzKP;
    //   142: getfield FWm : I
    //   145: iconst_0
    //   146: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   149: goto -> 177
    //   152: aload_0
    //   153: aload_1
    //   154: aload_3
    //   155: iconst_1
    //   156: iconst_5
    //   157: iconst_1
    //   158: iconst_2
    //   159: iconst_5
    //   160: iconst_3
    //   161: getstatic zKP.udO : LzKP;
    //   164: getfield FWm : I
    //   167: getstatic zKP.udO : LzKP;
    //   170: getfield FWm : I
    //   173: iconst_0
    //   174: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   177: aload_0
    //   178: aload_1
    //   179: getstatic zKP.udO : LzKP;
    //   182: getfield FWm : I
    //   185: iconst_0
    //   186: iconst_1
    //   187: iconst_4
    //   188: iconst_0
    //   189: aload_3
    //   190: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   193: aload_0
    //   194: aload_1
    //   195: getstatic zKP.udO : LzKP;
    //   198: getfield FWm : I
    //   201: iconst_0
    //   202: iconst_2
    //   203: iconst_4
    //   204: iconst_0
    //   205: aload_3
    //   206: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   209: aload_0
    //   210: aload_1
    //   211: getstatic zKP.udO : LzKP;
    //   214: getfield FWm : I
    //   217: iconst_0
    //   218: iconst_1
    //   219: iconst_4
    //   220: iconst_4
    //   221: aload_3
    //   222: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   225: aload_0
    //   226: aload_1
    //   227: getstatic zKP.udO : LzKP;
    //   230: getfield FWm : I
    //   233: iconst_0
    //   234: iconst_2
    //   235: iconst_4
    //   236: iconst_4
    //   237: aload_3
    //   238: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   241: aload_0
    //   242: aload_1
    //   243: getstatic zKP.udO : LzKP;
    //   246: getfield FWm : I
    //   249: iconst_0
    //   250: iconst_0
    //   251: iconst_4
    //   252: iconst_1
    //   253: aload_3
    //   254: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   257: aload_0
    //   258: aload_1
    //   259: getstatic zKP.udO : LzKP;
    //   262: getfield FWm : I
    //   265: iconst_0
    //   266: iconst_0
    //   267: iconst_4
    //   268: iconst_2
    //   269: aload_3
    //   270: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   273: aload_0
    //   274: aload_1
    //   275: getstatic zKP.udO : LzKP;
    //   278: getfield FWm : I
    //   281: iconst_0
    //   282: iconst_0
    //   283: iconst_4
    //   284: iconst_3
    //   285: aload_3
    //   286: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   289: aload_0
    //   290: aload_1
    //   291: getstatic zKP.udO : LzKP;
    //   294: getfield FWm : I
    //   297: iconst_0
    //   298: iconst_3
    //   299: iconst_4
    //   300: iconst_1
    //   301: aload_3
    //   302: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   305: aload_0
    //   306: aload_1
    //   307: getstatic zKP.udO : LzKP;
    //   310: getfield FWm : I
    //   313: iconst_0
    //   314: iconst_3
    //   315: iconst_4
    //   316: iconst_2
    //   317: aload_3
    //   318: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   321: aload_0
    //   322: aload_1
    //   323: getstatic zKP.udO : LzKP;
    //   326: getfield FWm : I
    //   329: iconst_0
    //   330: iconst_3
    //   331: iconst_4
    //   332: iconst_3
    //   333: aload_3
    //   334: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   337: aload_0
    //   338: aload_1
    //   339: aload_3
    //   340: iconst_0
    //   341: iconst_1
    //   342: iconst_0
    //   343: iconst_0
    //   344: iconst_3
    //   345: iconst_0
    //   346: getstatic zKP.udO : LzKP;
    //   349: getfield FWm : I
    //   352: getstatic zKP.udO : LzKP;
    //   355: getfield FWm : I
    //   358: iconst_0
    //   359: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   362: aload_0
    //   363: aload_1
    //   364: aload_3
    //   365: iconst_3
    //   366: iconst_1
    //   367: iconst_0
    //   368: iconst_3
    //   369: iconst_3
    //   370: iconst_0
    //   371: getstatic zKP.udO : LzKP;
    //   374: getfield FWm : I
    //   377: getstatic zKP.udO : LzKP;
    //   380: getfield FWm : I
    //   383: iconst_0
    //   384: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   387: aload_0
    //   388: aload_1
    //   389: aload_3
    //   390: iconst_0
    //   391: iconst_1
    //   392: iconst_4
    //   393: iconst_0
    //   394: iconst_3
    //   395: iconst_4
    //   396: getstatic zKP.udO : LzKP;
    //   399: getfield FWm : I
    //   402: getstatic zKP.udO : LzKP;
    //   405: getfield FWm : I
    //   408: iconst_0
    //   409: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   412: aload_0
    //   413: aload_1
    //   414: aload_3
    //   415: iconst_3
    //   416: iconst_1
    //   417: iconst_4
    //   418: iconst_3
    //   419: iconst_3
    //   420: iconst_4
    //   421: getstatic zKP.udO : LzKP;
    //   424: getfield FWm : I
    //   427: getstatic zKP.udO : LzKP;
    //   430: getfield FWm : I
    //   433: iconst_0
    //   434: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   437: aload_0
    //   438: aload_1
    //   439: aload_3
    //   440: iconst_0
    //   441: iconst_1
    //   442: iconst_1
    //   443: iconst_0
    //   444: iconst_3
    //   445: iconst_3
    //   446: getstatic zKP.Qnq : LzKP;
    //   449: getfield FWm : I
    //   452: getstatic zKP.Qnq : LzKP;
    //   455: getfield FWm : I
    //   458: iconst_0
    //   459: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   462: aload_0
    //   463: aload_1
    //   464: aload_3
    //   465: iconst_3
    //   466: iconst_1
    //   467: iconst_1
    //   468: iconst_3
    //   469: iconst_3
    //   470: iconst_3
    //   471: getstatic zKP.Qnq : LzKP;
    //   474: getfield FWm : I
    //   477: getstatic zKP.Qnq : LzKP;
    //   480: getfield FWm : I
    //   483: iconst_0
    //   484: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   487: aload_0
    //   488: aload_1
    //   489: aload_3
    //   490: iconst_1
    //   491: iconst_1
    //   492: iconst_0
    //   493: iconst_2
    //   494: iconst_3
    //   495: iconst_0
    //   496: getstatic zKP.Qnq : LzKP;
    //   499: getfield FWm : I
    //   502: getstatic zKP.Qnq : LzKP;
    //   505: getfield FWm : I
    //   508: iconst_0
    //   509: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   512: aload_0
    //   513: aload_1
    //   514: aload_3
    //   515: iconst_1
    //   516: iconst_1
    //   517: iconst_4
    //   518: iconst_2
    //   519: iconst_3
    //   520: iconst_4
    //   521: getstatic zKP.Qnq : LzKP;
    //   524: getfield FWm : I
    //   527: getstatic zKP.Qnq : LzKP;
    //   530: getfield FWm : I
    //   533: iconst_0
    //   534: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   537: aload_0
    //   538: aload_1
    //   539: getstatic zKP.Lab : LzKP;
    //   542: getfield FWm : I
    //   545: iconst_0
    //   546: iconst_0
    //   547: iconst_2
    //   548: iconst_2
    //   549: aload_3
    //   550: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   553: aload_0
    //   554: aload_1
    //   555: getstatic zKP.Lab : LzKP;
    //   558: getfield FWm : I
    //   561: iconst_0
    //   562: iconst_3
    //   563: iconst_2
    //   564: iconst_2
    //   565: aload_3
    //   566: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   569: aload_0
    //   570: getfield FWm : I
    //   573: ifle -> 614
    //   576: aload_0
    //   577: aload_1
    //   578: getstatic zKP.sly : LzKP;
    //   581: getfield FWm : I
    //   584: iconst_0
    //   585: aload_0
    //   586: getfield FWm : I
    //   589: iconst_1
    //   590: iconst_3
    //   591: aload_3
    //   592: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   595: aload_0
    //   596: aload_1
    //   597: getstatic zKP.YHU : LzKP;
    //   600: getfield FWm : I
    //   603: iconst_0
    //   604: aload_0
    //   605: getfield FWm : I
    //   608: iconst_2
    //   609: iconst_3
    //   610: aload_3
    //   611: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   614: aload_0
    //   615: aload_1
    //   616: iconst_0
    //   617: iconst_0
    //   618: iconst_1
    //   619: iconst_1
    //   620: iconst_0
    //   621: aload_3
    //   622: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   625: aload_0
    //   626: aload_1
    //   627: iconst_0
    //   628: iconst_0
    //   629: iconst_1
    //   630: iconst_2
    //   631: iconst_0
    //   632: aload_3
    //   633: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   636: aload_0
    //   637: aload_1
    //   638: aload_3
    //   639: aload_2
    //   640: iconst_1
    //   641: iconst_1
    //   642: iconst_0
    //   643: aload_0
    //   644: getstatic zKP.ICU : LzKP;
    //   647: getfield FWm : I
    //   650: iconst_1
    //   651: invokevirtual bzF : (II)I
    //   654: invokevirtual Dne : (LQnq;LCLK;Ljava/util/Random;IIII)V
    //   657: aload_0
    //   658: aload_1
    //   659: iconst_1
    //   660: iconst_0
    //   661: iconst_m1
    //   662: aload_3
    //   663: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   666: ifne -> 707
    //   669: aload_0
    //   670: aload_1
    //   671: iconst_1
    //   672: iconst_m1
    //   673: iconst_m1
    //   674: aload_3
    //   675: invokevirtual Dne : (LQnq;IIILCLK;)I
    //   678: ifeq -> 707
    //   681: aload_0
    //   682: aload_1
    //   683: getstatic zKP.BJH : LzKP;
    //   686: getfield FWm : I
    //   689: aload_0
    //   690: getstatic zKP.BJH : LzKP;
    //   693: getfield FWm : I
    //   696: iconst_3
    //   697: invokevirtual bzF : (II)I
    //   700: iconst_1
    //   701: iconst_0
    //   702: iconst_m1
    //   703: aload_3
    //   704: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   707: iconst_0
    //   708: istore #4
    //   710: iload #4
    //   712: iconst_5
    //   713: if_icmpge -> 767
    //   716: iconst_0
    //   717: istore #5
    //   719: iload #5
    //   721: iconst_4
    //   722: if_icmpge -> 761
    //   725: aload_0
    //   726: aload_1
    //   727: iload #5
    //   729: bipush #6
    //   731: iload #4
    //   733: aload_3
    //   734: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   737: aload_0
    //   738: aload_1
    //   739: getstatic zKP.bzF : LzKP;
    //   742: getfield FWm : I
    //   745: iconst_0
    //   746: iload #5
    //   748: iconst_m1
    //   749: iload #4
    //   751: aload_3
    //   752: invokevirtual FWm : (LQnq;IIIIILCLK;)V
    //   755: iinc #5, 1
    //   758: goto -> 719
    //   761: iinc #4, 1
    //   764: goto -> 710
    //   767: aload_0
    //   768: aload_1
    //   769: aload_3
    //   770: iconst_1
    //   771: iconst_1
    //   772: iconst_2
    //   773: iconst_1
    //   774: invokevirtual Dne : (LQnq;LCLK;IIII)V
    //   777: iconst_1
    //   778: ireturn
  }
  
  public static pMs Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 4, 6, 5, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new pMs(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pMs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */