public class JLG {
  public static exS Dne(WkD paramWkD) {
    int i = paramWkD.Dne("xPos");
    int j = paramWkD.Dne("zPos");
    exS exS = new exS(i, j);
    exS.FWm = paramWkD.Dne("Blocks");
    exS.bzF = (mbZ)new xXN(paramWkD.Dne("Data"), 7);
    exS.FWm = new xXN(paramWkD.Dne("SkyLight"), 7);
    exS.Dne = new xXN(paramWkD.Dne("BlockLight"), 7);
    exS.Dne = paramWkD.Dne("HeightMap");
    exS.Dne = paramWkD.FWm("TerrainPopulated");
    exS.Dne = paramWkD.Dne("Entities");
    exS.FWm = paramWkD.Dne("TileEntities");
    exS.bzF = paramWkD.Dne("TileTicks");
    try {
      exS.Dne = paramWkD.Dne("LastUpdate");
    } catch (ClassCastException classCastException) {
      exS.Dne = paramWkD.Dne("LastUpdate");
    } 
    return exS;
  }
  
  static {
  
  }
  
  public static void Dne(exS paramexS, WkD paramWkD, tgc paramtgc) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'xPos'
    //   3: aload_0
    //   4: getfield Dne : I
    //   7: invokevirtual Dne : (Ljava/lang/String;I)V
    //   10: aload_1
    //   11: ldc 'zPos'
    //   13: aload_0
    //   14: getfield FWm : I
    //   17: invokevirtual Dne : (Ljava/lang/String;I)V
    //   20: aload_1
    //   21: ldc 'LastUpdate'
    //   23: aload_0
    //   24: getfield Dne : J
    //   27: invokevirtual Dne : (Ljava/lang/String;J)V
    //   30: aload_0
    //   31: getfield Dne : [B
    //   34: arraylength
    //   35: newarray int
    //   37: astore_3
    //   38: iconst_0
    //   39: istore #4
    //   41: iload #4
    //   43: aload_0
    //   44: getfield Dne : [B
    //   47: arraylength
    //   48: if_icmpge -> 68
    //   51: aload_3
    //   52: iload #4
    //   54: aload_0
    //   55: getfield Dne : [B
    //   58: iload #4
    //   60: baload
    //   61: iastore
    //   62: iinc #4, 1
    //   65: goto -> 41
    //   68: aload_1
    //   69: ldc 'HeightMap'
    //   71: aload_3
    //   72: invokevirtual Dne : (Ljava/lang/String;[I)V
    //   75: aload_1
    //   76: ldc 'TerrainPopulated'
    //   78: aload_0
    //   79: getfield Dne : Z
    //   82: invokevirtual Dne : (Ljava/lang/String;Z)V
    //   85: new mbZ
    //   88: dup
    //   89: ldc 'Sections'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: astore #4
    //   96: iconst_0
    //   97: istore #6
    //   99: iload #6
    //   101: bipush #8
    //   103: if_icmpge -> 528
    //   106: iconst_1
    //   107: istore #7
    //   109: iconst_0
    //   110: istore #5
    //   112: iload #5
    //   114: bipush #16
    //   116: if_icmpge -> 208
    //   119: iload #7
    //   121: ifeq -> 208
    //   124: iconst_0
    //   125: istore #8
    //   127: iload #8
    //   129: bipush #16
    //   131: if_icmpge -> 202
    //   134: iload #7
    //   136: ifeq -> 202
    //   139: iconst_0
    //   140: istore #9
    //   142: iload #9
    //   144: bipush #16
    //   146: if_icmpge -> 193
    //   149: iload #5
    //   151: bipush #11
    //   153: ishl
    //   154: iload #9
    //   156: bipush #7
    //   158: ishl
    //   159: ior
    //   160: iload #8
    //   162: iload #6
    //   164: iconst_4
    //   165: ishl
    //   166: iadd
    //   167: ior
    //   168: istore #10
    //   170: aload_0
    //   171: getfield FWm : [B
    //   174: iload #10
    //   176: baload
    //   177: istore #11
    //   179: iload #11
    //   181: ifne -> 190
    //   184: iinc #9, 1
    //   187: goto -> 142
    //   190: iconst_0
    //   191: istore #7
    //   193: iinc #8, 1
    //   196: goto -> 199
    //   199: goto -> 127
    //   202: iinc #5, 1
    //   205: goto -> 112
    //   208: iload #7
    //   210: ifne -> 522
    //   213: sipush #4096
    //   216: newarray byte
    //   218: astore #8
    //   220: new FYZ
    //   223: dup
    //   224: aload #8
    //   226: arraylength
    //   227: iconst_4
    //   228: invokespecial <init> : (II)V
    //   231: astore #9
    //   233: new FYZ
    //   236: dup
    //   237: aload #8
    //   239: arraylength
    //   240: iconst_4
    //   241: invokespecial <init> : (II)V
    //   244: astore #10
    //   246: new FYZ
    //   249: dup
    //   250: aload #8
    //   252: arraylength
    //   253: iconst_4
    //   254: invokespecial <init> : (II)V
    //   257: astore #11
    //   259: iconst_0
    //   260: istore #12
    //   262: iload #12
    //   264: bipush #16
    //   266: if_icmpge -> 447
    //   269: iconst_0
    //   270: istore #13
    //   272: iload #13
    //   274: bipush #16
    //   276: if_icmpge -> 441
    //   279: iconst_0
    //   280: istore #14
    //   282: iload #14
    //   284: bipush #16
    //   286: if_icmpge -> 435
    //   289: iload #12
    //   291: bipush #11
    //   293: ishl
    //   294: iload #14
    //   296: bipush #7
    //   298: ishl
    //   299: ior
    //   300: iload #13
    //   302: iload #6
    //   304: iconst_4
    //   305: ishl
    //   306: iadd
    //   307: ior
    //   308: istore #15
    //   310: aload_0
    //   311: getfield FWm : [B
    //   314: iload #15
    //   316: baload
    //   317: istore #16
    //   319: aload #8
    //   321: iload #13
    //   323: bipush #8
    //   325: ishl
    //   326: iload #14
    //   328: iconst_4
    //   329: ishl
    //   330: ior
    //   331: iload #12
    //   333: ior
    //   334: iload #16
    //   336: sipush #255
    //   339: iand
    //   340: i2b
    //   341: bastore
    //   342: aload #9
    //   344: iload #12
    //   346: iload #13
    //   348: iload #14
    //   350: aload_0
    //   351: getfield bzF : LxXN;
    //   354: iload #12
    //   356: iload #13
    //   358: iload #6
    //   360: iconst_4
    //   361: ishl
    //   362: iadd
    //   363: iload #14
    //   365: invokevirtual Dne : (III)I
    //   368: invokevirtual Dne : (IIII)V
    //   371: aload #10
    //   373: iload #12
    //   375: iload #13
    //   377: iload #14
    //   379: aload_0
    //   380: getfield FWm : LxXN;
    //   383: iload #12
    //   385: iload #13
    //   387: iload #6
    //   389: iconst_4
    //   390: ishl
    //   391: iadd
    //   392: iload #14
    //   394: invokevirtual Dne : (III)I
    //   397: invokevirtual Dne : (IIII)V
    //   400: aload #11
    //   402: iload #12
    //   404: iload #13
    //   406: iload #14
    //   408: aload_0
    //   409: getfield Dne : LxXN;
    //   412: iload #12
    //   414: iload #13
    //   416: iload #6
    //   418: iconst_4
    //   419: ishl
    //   420: iadd
    //   421: iload #14
    //   423: invokevirtual Dne : (III)I
    //   426: invokevirtual Dne : (IIII)V
    //   429: iinc #14, 1
    //   432: goto -> 282
    //   435: iinc #13, 1
    //   438: goto -> 272
    //   441: iinc #12, 1
    //   444: goto -> 262
    //   447: new WkD
    //   450: dup
    //   451: invokespecial <init> : ()V
    //   454: astore #12
    //   456: aload #12
    //   458: ldc 'Y'
    //   460: iload #6
    //   462: sipush #255
    //   465: iand
    //   466: i2b
    //   467: invokevirtual Dne : (Ljava/lang/String;B)V
    //   470: aload #12
    //   472: ldc 'Blocks'
    //   474: aload #8
    //   476: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   479: aload #12
    //   481: ldc 'Data'
    //   483: aload #9
    //   485: getfield Dne : [B
    //   488: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   491: aload #12
    //   493: ldc 'SkyLight'
    //   495: aload #10
    //   497: getfield Dne : [B
    //   500: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   503: aload #12
    //   505: ldc 'BlockLight'
    //   507: aload #11
    //   509: getfield Dne : [B
    //   512: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   515: aload #4
    //   517: aload #12
    //   519: invokevirtual Dne : (LoNe;)V
    //   522: iinc #6, 1
    //   525: goto -> 99
    //   528: aload_1
    //   529: ldc 'Sections'
    //   531: aload #4
    //   533: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   536: sipush #256
    //   539: newarray byte
    //   541: astore #6
    //   543: iconst_0
    //   544: istore #7
    //   546: iload #7
    //   548: bipush #16
    //   550: if_icmpge -> 615
    //   553: iconst_0
    //   554: istore #5
    //   556: iload #5
    //   558: bipush #16
    //   560: if_icmpge -> 609
    //   563: aload #6
    //   565: iload #5
    //   567: iconst_4
    //   568: ishl
    //   569: iload #7
    //   571: ior
    //   572: aload_2
    //   573: aload_0
    //   574: getfield Dne : I
    //   577: iconst_4
    //   578: ishl
    //   579: iload #7
    //   581: ior
    //   582: aload_0
    //   583: getfield FWm : I
    //   586: iconst_4
    //   587: ishl
    //   588: iload #5
    //   590: ior
    //   591: invokevirtual Dne : (II)LOdI;
    //   594: getfield Qnq : I
    //   597: sipush #255
    //   600: iand
    //   601: i2b
    //   602: bastore
    //   603: iinc #5, 1
    //   606: goto -> 556
    //   609: iinc #7, 1
    //   612: goto -> 546
    //   615: aload_1
    //   616: ldc 'Biomes'
    //   618: aload #6
    //   620: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   623: aload_1
    //   624: ldc 'Entities'
    //   626: aload_0
    //   627: getfield Dne : LmbZ;
    //   630: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   633: aload_1
    //   634: ldc 'TileEntities'
    //   636: aload_0
    //   637: getfield FWm : LmbZ;
    //   640: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   643: aload_0
    //   644: getfield bzF : LmbZ;
    //   647: ifnull -> 660
    //   650: aload_1
    //   651: ldc 'TileTicks'
    //   653: aload_0
    //   654: getfield bzF : LmbZ;
    //   657: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   660: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JLG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */