public class ehI extends QCe {
  static {
  
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((xIh)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(xIh paramxIh, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #10
    //   5: sipush #3553
    //   8: invokestatic glDisable : (I)V
    //   11: sipush #2896
    //   14: invokestatic glDisable : (I)V
    //   17: sipush #3042
    //   20: invokestatic glEnable : (I)V
    //   23: sipush #770
    //   26: iconst_1
    //   27: invokestatic glBlendFunc : (II)V
    //   30: bipush #8
    //   32: newarray double
    //   34: astore #11
    //   36: bipush #8
    //   38: newarray double
    //   40: astore #12
    //   42: dconst_0
    //   43: dstore #13
    //   45: dconst_0
    //   46: dstore #15
    //   48: new java/util/Random
    //   51: dup
    //   52: aload_1
    //   53: getfield Dne : J
    //   56: invokespecial <init> : (J)V
    //   59: astore #17
    //   61: bipush #7
    //   63: istore #18
    //   65: iload #18
    //   67: iflt -> 120
    //   70: aload #11
    //   72: iload #18
    //   74: dload #13
    //   76: dastore
    //   77: aload #12
    //   79: iload #18
    //   81: dload #15
    //   83: dastore
    //   84: dload #13
    //   86: aload #17
    //   88: bipush #11
    //   90: invokevirtual nextInt : (I)I
    //   93: iconst_5
    //   94: isub
    //   95: i2d
    //   96: dadd
    //   97: dstore #13
    //   99: dload #15
    //   101: aload #17
    //   103: bipush #11
    //   105: invokevirtual nextInt : (I)I
    //   108: iconst_5
    //   109: isub
    //   110: i2d
    //   111: dadd
    //   112: dstore #15
    //   114: iinc #18, -1
    //   117: goto -> 65
    //   120: iconst_0
    //   121: istore #18
    //   123: iload #18
    //   125: iconst_4
    //   126: if_icmpge -> 610
    //   129: new java/util/Random
    //   132: dup
    //   133: aload_1
    //   134: getfield Dne : J
    //   137: invokespecial <init> : (J)V
    //   140: astore #19
    //   142: iconst_0
    //   143: istore #20
    //   145: iload #20
    //   147: iconst_3
    //   148: if_icmpge -> 604
    //   151: bipush #7
    //   153: istore #21
    //   155: iconst_0
    //   156: istore #22
    //   158: iload #20
    //   160: ifle -> 170
    //   163: bipush #7
    //   165: iload #20
    //   167: isub
    //   168: istore #21
    //   170: iload #20
    //   172: ifle -> 181
    //   175: iload #21
    //   177: iconst_2
    //   178: isub
    //   179: istore #22
    //   181: aload #11
    //   183: iload #21
    //   185: daload
    //   186: dload #13
    //   188: dsub
    //   189: dstore #23
    //   191: aload #12
    //   193: iload #21
    //   195: daload
    //   196: dload #15
    //   198: dsub
    //   199: dstore #25
    //   201: iload #21
    //   203: istore #27
    //   205: iload #27
    //   207: iload #22
    //   209: if_icmplt -> 598
    //   212: dload #23
    //   214: dstore #28
    //   216: dload #25
    //   218: dstore #30
    //   220: iload #20
    //   222: ifne -> 258
    //   225: dload #23
    //   227: aload #19
    //   229: bipush #11
    //   231: invokevirtual nextInt : (I)I
    //   234: iconst_5
    //   235: isub
    //   236: i2d
    //   237: dadd
    //   238: dstore #23
    //   240: dload #25
    //   242: aload #19
    //   244: bipush #11
    //   246: invokevirtual nextInt : (I)I
    //   249: iconst_5
    //   250: isub
    //   251: i2d
    //   252: dadd
    //   253: dstore #25
    //   255: goto -> 290
    //   258: dload #23
    //   260: aload #19
    //   262: bipush #31
    //   264: invokevirtual nextInt : (I)I
    //   267: bipush #15
    //   269: isub
    //   270: i2d
    //   271: dadd
    //   272: dstore #23
    //   274: dload #25
    //   276: aload #19
    //   278: bipush #31
    //   280: invokevirtual nextInt : (I)I
    //   283: bipush #15
    //   285: isub
    //   286: i2d
    //   287: dadd
    //   288: dstore #25
    //   290: aload #10
    //   292: iconst_5
    //   293: invokevirtual Dne : (I)V
    //   296: ldc 0.5
    //   298: fstore #32
    //   300: aload #10
    //   302: ldc 0.9
    //   304: fload #32
    //   306: fmul
    //   307: ldc 0.9
    //   309: fload #32
    //   311: fmul
    //   312: fconst_1
    //   313: fload #32
    //   315: fmul
    //   316: ldc 0.3
    //   318: invokevirtual Dne : (FFFF)V
    //   321: ldc2_w 0.1
    //   324: iload #18
    //   326: i2d
    //   327: ldc2_w 0.2
    //   330: dmul
    //   331: dadd
    //   332: dstore #33
    //   334: iload #20
    //   336: ifne -> 353
    //   339: dload #33
    //   341: iload #27
    //   343: i2d
    //   344: ldc2_w 0.1
    //   347: dmul
    //   348: dconst_1
    //   349: dadd
    //   350: dmul
    //   351: dstore #33
    //   353: ldc2_w 0.1
    //   356: iload #18
    //   358: i2d
    //   359: ldc2_w 0.2
    //   362: dmul
    //   363: dadd
    //   364: dstore #35
    //   366: iload #20
    //   368: ifne -> 387
    //   371: dload #35
    //   373: iload #27
    //   375: iconst_1
    //   376: isub
    //   377: i2d
    //   378: ldc2_w 0.1
    //   381: dmul
    //   382: dconst_1
    //   383: dadd
    //   384: dmul
    //   385: dstore #35
    //   387: iconst_0
    //   388: istore #37
    //   390: iload #37
    //   392: iconst_5
    //   393: if_icmpge -> 586
    //   396: dload_2
    //   397: ldc2_w 0.5
    //   400: dadd
    //   401: dload #33
    //   403: dsub
    //   404: dstore #38
    //   406: dload #6
    //   408: ldc2_w 0.5
    //   411: dadd
    //   412: dload #33
    //   414: dsub
    //   415: dstore #40
    //   417: iload #37
    //   419: iconst_1
    //   420: if_icmpeq -> 429
    //   423: iload #37
    //   425: iconst_2
    //   426: if_icmpne -> 440
    //   429: dload #38
    //   431: dload #33
    //   433: ldc2_w 2.0
    //   436: dmul
    //   437: dadd
    //   438: dstore #38
    //   440: iload #37
    //   442: iconst_2
    //   443: if_icmpeq -> 452
    //   446: iload #37
    //   448: iconst_3
    //   449: if_icmpne -> 463
    //   452: dload #40
    //   454: dload #33
    //   456: ldc2_w 2.0
    //   459: dmul
    //   460: dadd
    //   461: dstore #40
    //   463: dload_2
    //   464: ldc2_w 0.5
    //   467: dadd
    //   468: dload #35
    //   470: dsub
    //   471: dstore #42
    //   473: dload #6
    //   475: ldc2_w 0.5
    //   478: dadd
    //   479: dload #35
    //   481: dsub
    //   482: dstore #44
    //   484: iload #37
    //   486: iconst_1
    //   487: if_icmpeq -> 496
    //   490: iload #37
    //   492: iconst_2
    //   493: if_icmpne -> 507
    //   496: dload #42
    //   498: dload #35
    //   500: ldc2_w 2.0
    //   503: dmul
    //   504: dadd
    //   505: dstore #42
    //   507: iload #37
    //   509: iconst_2
    //   510: if_icmpeq -> 519
    //   513: iload #37
    //   515: iconst_3
    //   516: if_icmpne -> 530
    //   519: dload #44
    //   521: dload #35
    //   523: ldc2_w 2.0
    //   526: dmul
    //   527: dadd
    //   528: dstore #44
    //   530: aload #10
    //   532: dload #42
    //   534: dload #23
    //   536: dadd
    //   537: dload #4
    //   539: iload #27
    //   541: bipush #16
    //   543: imul
    //   544: i2d
    //   545: dadd
    //   546: dload #44
    //   548: dload #25
    //   550: dadd
    //   551: invokevirtual Dne : (DDD)V
    //   554: aload #10
    //   556: dload #38
    //   558: dload #28
    //   560: dadd
    //   561: dload #4
    //   563: iload #27
    //   565: iconst_1
    //   566: iadd
    //   567: bipush #16
    //   569: imul
    //   570: i2d
    //   571: dadd
    //   572: dload #40
    //   574: dload #30
    //   576: dadd
    //   577: invokevirtual Dne : (DDD)V
    //   580: iinc #37, 1
    //   583: goto -> 390
    //   586: aload #10
    //   588: invokevirtual Dne : ()I
    //   591: pop
    //   592: iinc #27, -1
    //   595: goto -> 205
    //   598: iinc #20, 1
    //   601: goto -> 145
    //   604: iinc #18, 1
    //   607: goto -> 123
    //   610: sipush #3042
    //   613: invokestatic glDisable : (I)V
    //   616: sipush #2896
    //   619: invokestatic glEnable : (I)V
    //   622: sipush #3553
    //   625: invokestatic glEnable : (I)V
    //   628: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ehI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */