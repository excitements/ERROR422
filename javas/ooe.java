import java.util.HashMap;
import java.util.Random;

public final class ooe {
  private static HashMap Dne = new HashMap<>();
  
  protected static final Class[] Dne = new Class[] { osi.class, zxd.class, yXX.class };
  
  public static void Dne(Qnq paramQnq, OdI paramOdI, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic Icc.FWm : LIcc;
    //   4: invokevirtual Dne : (LIcc;)Ljava/util/List;
    //   7: astore #7
    //   9: aload #7
    //   11: invokeinterface isEmpty : ()Z
    //   16: ifne -> 387
    //   19: aload #6
    //   21: invokevirtual nextFloat : ()F
    //   24: aload_1
    //   25: invokevirtual Dne : ()F
    //   28: fcmpg
    //   29: ifge -> 387
    //   32: aload_0
    //   33: getfield Dne : Ljava/util/Random;
    //   36: aload #7
    //   38: invokestatic Dne : (Ljava/util/Random;Ljava/util/Collection;)LTwy;
    //   41: checkcast oIf
    //   44: astore #8
    //   46: aload #8
    //   48: getfield Dne : I
    //   51: aload #6
    //   53: iconst_1
    //   54: aload #8
    //   56: getfield FWm : I
    //   59: iadd
    //   60: aload #8
    //   62: getfield Dne : I
    //   65: isub
    //   66: invokevirtual nextInt : (I)I
    //   69: iadd
    //   70: istore #9
    //   72: iload_2
    //   73: aload #6
    //   75: iload #4
    //   77: invokevirtual nextInt : (I)I
    //   80: iadd
    //   81: istore #10
    //   83: iload_3
    //   84: aload #6
    //   86: iload #5
    //   88: invokevirtual nextInt : (I)I
    //   91: iadd
    //   92: istore #11
    //   94: iload #10
    //   96: istore #12
    //   98: iload #11
    //   100: istore #13
    //   102: iconst_0
    //   103: istore #14
    //   105: iload #14
    //   107: iload #9
    //   109: if_icmpge -> 384
    //   112: iconst_0
    //   113: istore #15
    //   115: iconst_0
    //   116: istore #16
    //   118: iload #15
    //   120: ifne -> 378
    //   123: iload #16
    //   125: iconst_4
    //   126: if_icmpge -> 378
    //   129: aload_0
    //   130: iload #10
    //   132: iload #11
    //   134: invokevirtual aFZ : (II)I
    //   137: istore #17
    //   139: getstatic Icc.FWm : LIcc;
    //   142: aload_0
    //   143: iload #10
    //   145: iload #17
    //   147: iload #11
    //   149: invokestatic Dne : (LIcc;LQnq;III)Z
    //   152: ifeq -> 267
    //   155: iload #10
    //   157: i2f
    //   158: ldc 0.5
    //   160: fadd
    //   161: fstore #18
    //   163: iload #17
    //   165: i2f
    //   166: fstore #19
    //   168: iload #11
    //   170: i2f
    //   171: ldc 0.5
    //   173: fadd
    //   174: fstore #20
    //   176: aload #8
    //   178: getfield Dne : Ljava/lang/Class;
    //   181: iconst_1
    //   182: anewarray java/lang/Class
    //   185: dup
    //   186: iconst_0
    //   187: ldc Qnq
    //   189: aastore
    //   190: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   193: iconst_1
    //   194: anewarray java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_0
    //   200: aastore
    //   201: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   204: checkcast FUH
    //   207: astore #21
    //   209: goto -> 222
    //   212: astore #22
    //   214: aload #22
    //   216: invokevirtual printStackTrace : ()V
    //   219: goto -> 372
    //   222: aload #21
    //   224: fload #18
    //   226: f2d
    //   227: fload #19
    //   229: f2d
    //   230: fload #20
    //   232: f2d
    //   233: aload #6
    //   235: invokevirtual nextFloat : ()F
    //   238: ldc 360.0
    //   240: fmul
    //   241: fconst_0
    //   242: invokevirtual FWm : (DDDFF)V
    //   245: aload_0
    //   246: aload #21
    //   248: invokevirtual FWm : (LsMa;)Z
    //   251: pop
    //   252: aload #21
    //   254: aload_0
    //   255: fload #18
    //   257: fload #19
    //   259: fload #20
    //   261: invokestatic Dne : (LFUH;LQnq;FFF)V
    //   264: iconst_1
    //   265: istore #15
    //   267: iload #10
    //   269: aload #6
    //   271: iconst_5
    //   272: invokevirtual nextInt : (I)I
    //   275: aload #6
    //   277: iconst_5
    //   278: invokevirtual nextInt : (I)I
    //   281: isub
    //   282: iadd
    //   283: istore #10
    //   285: iload #11
    //   287: aload #6
    //   289: iconst_5
    //   290: invokevirtual nextInt : (I)I
    //   293: aload #6
    //   295: iconst_5
    //   296: invokevirtual nextInt : (I)I
    //   299: isub
    //   300: iadd
    //   301: istore #11
    //   303: iload #10
    //   305: iload_2
    //   306: if_icmplt -> 333
    //   309: iload #10
    //   311: iload_2
    //   312: iload #4
    //   314: iadd
    //   315: if_icmpge -> 333
    //   318: iload #11
    //   320: iload_3
    //   321: if_icmplt -> 333
    //   324: iload #11
    //   326: iload_3
    //   327: iload #4
    //   329: iadd
    //   330: if_icmplt -> 372
    //   333: iload #12
    //   335: aload #6
    //   337: iconst_5
    //   338: invokevirtual nextInt : (I)I
    //   341: iadd
    //   342: aload #6
    //   344: iconst_5
    //   345: invokevirtual nextInt : (I)I
    //   348: isub
    //   349: istore #10
    //   351: iload #13
    //   353: aload #6
    //   355: iconst_5
    //   356: invokevirtual nextInt : (I)I
    //   359: iadd
    //   360: aload #6
    //   362: iconst_5
    //   363: invokevirtual nextInt : (I)I
    //   366: isub
    //   367: istore #11
    //   369: goto -> 303
    //   372: iinc #16, 1
    //   375: goto -> 118
    //   378: iinc #14, 1
    //   381: goto -> 105
    //   384: goto -> 19
    //   387: return
    // Exception table:
    //   from	to	target	type
    //   176	209	212	java/lang/Exception
  }
  
  private static void Dne(FUH paramFUH, Qnq paramQnq, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramFUH.ICU();
  }
  
  public static boolean Dne(Icc paramIcc, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramIcc.Dne() == KFd.div)
      return (paramQnq.Dne(paramInt1, paramInt2, paramInt3).Qnq() && paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3).Qnq() && !paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3)); 
    if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3))
      return false; 
    int i = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
    return (i != zKP.zGp.FWm && !paramQnq.DyG(paramInt1, paramInt2, paramInt3) && !paramQnq.Dne(paramInt1, paramInt2, paramInt3).Qnq() && !paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3));
  }
  
  protected static EyB Dne(Qnq paramQnq, int paramInt1, int paramInt2) {
    qMV qMV = paramQnq.FWm(paramInt1, paramInt2);
    int i = paramInt1 * 16 + paramQnq.Dne.nextInt(16);
    int j = paramInt2 * 16 + paramQnq.Dne.nextInt(16);
    int k = paramQnq.Dne.nextInt((qMV == null) ? paramQnq.bzF() : (qMV.Dne() + 16 - 1));
    return new EyB(i, k, j);
  }
  
  public static final int Dne(RAN paramRAN, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 10
    //   4: iload_2
    //   5: ifne -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: getstatic ooe.Dne : Ljava/util/HashMap;
    //   13: invokevirtual clear : ()V
    //   16: iconst_0
    //   17: istore #4
    //   19: iload #4
    //   21: aload_0
    //   22: getfield Qnq : Ljava/util/List;
    //   25: invokeinterface size : ()I
    //   30: if_icmpge -> 224
    //   33: aload_0
    //   34: getfield Qnq : Ljava/util/List;
    //   37: iload #4
    //   39: invokeinterface get : (I)Ljava/lang/Object;
    //   44: checkcast FiG
    //   47: astore #6
    //   49: aload #6
    //   51: getfield div : D
    //   54: ldc2_w 16.0
    //   57: ddiv
    //   58: invokestatic FWm : (D)I
    //   61: istore #7
    //   63: aload #6
    //   65: getfield mrb : D
    //   68: ldc2_w 16.0
    //   71: ddiv
    //   72: invokestatic FWm : (D)I
    //   75: istore #5
    //   77: bipush #8
    //   79: istore #8
    //   81: iload #8
    //   83: ineg
    //   84: istore #9
    //   86: iload #9
    //   88: iload #8
    //   90: if_icmpgt -> 218
    //   93: iload #8
    //   95: ineg
    //   96: istore #10
    //   98: iload #10
    //   100: iload #8
    //   102: if_icmpgt -> 212
    //   105: iload #9
    //   107: iload #8
    //   109: ineg
    //   110: if_icmpeq -> 135
    //   113: iload #9
    //   115: iload #8
    //   117: if_icmpeq -> 135
    //   120: iload #10
    //   122: iload #8
    //   124: ineg
    //   125: if_icmpeq -> 135
    //   128: iload #10
    //   130: iload #8
    //   132: if_icmpne -> 139
    //   135: iconst_1
    //   136: goto -> 140
    //   139: iconst_0
    //   140: istore #11
    //   142: new Sxs
    //   145: dup
    //   146: iload #9
    //   148: iload #7
    //   150: iadd
    //   151: iload #10
    //   153: iload #5
    //   155: iadd
    //   156: invokespecial <init> : (II)V
    //   159: astore #12
    //   161: iload #11
    //   163: ifne -> 182
    //   166: getstatic ooe.Dne : Ljava/util/HashMap;
    //   169: aload #12
    //   171: iconst_0
    //   172: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   175: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   178: pop
    //   179: goto -> 206
    //   182: getstatic ooe.Dne : Ljava/util/HashMap;
    //   185: aload #12
    //   187: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   190: ifne -> 206
    //   193: getstatic ooe.Dne : Ljava/util/HashMap;
    //   196: aload #12
    //   198: iconst_1
    //   199: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   202: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   205: pop
    //   206: iinc #10, 1
    //   209: goto -> 98
    //   212: iinc #9, 1
    //   215: goto -> 86
    //   218: iinc #4, 1
    //   221: goto -> 19
    //   224: iconst_0
    //   225: istore #4
    //   227: aload_0
    //   228: invokevirtual Dne : ()LiSh;
    //   231: astore #6
    //   233: invokestatic values : ()[LIcc;
    //   236: astore #7
    //   238: aload #7
    //   240: arraylength
    //   241: istore #5
    //   243: iconst_0
    //   244: istore #8
    //   246: iload #8
    //   248: iload #5
    //   250: if_icmpge -> 842
    //   253: aload #7
    //   255: iload #8
    //   257: aaload
    //   258: astore #9
    //   260: aload #9
    //   262: invokevirtual Dne : ()Z
    //   265: ifeq -> 272
    //   268: iload_2
    //   269: ifeq -> 836
    //   272: aload #9
    //   274: invokevirtual Dne : ()Z
    //   277: ifne -> 284
    //   280: iload_1
    //   281: ifeq -> 836
    //   284: aload #9
    //   286: invokevirtual FWm : ()Z
    //   289: ifeq -> 296
    //   292: iload_3
    //   293: ifeq -> 836
    //   296: aload_0
    //   297: aload #9
    //   299: invokevirtual Dne : ()Ljava/lang/Class;
    //   302: invokevirtual Dne : (Ljava/lang/Class;)I
    //   305: aload #9
    //   307: invokevirtual Dne : ()I
    //   310: getstatic ooe.Dne : Ljava/util/HashMap;
    //   313: invokevirtual size : ()I
    //   316: imul
    //   317: sipush #256
    //   320: idiv
    //   321: if_icmpgt -> 836
    //   324: getstatic ooe.Dne : Ljava/util/HashMap;
    //   327: invokevirtual keySet : ()Ljava/util/Set;
    //   330: invokeinterface iterator : ()Ljava/util/Iterator;
    //   335: astore #10
    //   337: aload #10
    //   339: invokeinterface hasNext : ()Z
    //   344: ifeq -> 836
    //   347: aload #10
    //   349: invokeinterface next : ()Ljava/lang/Object;
    //   354: checkcast Sxs
    //   357: astore #11
    //   359: getstatic ooe.Dne : Ljava/util/HashMap;
    //   362: aload #11
    //   364: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   367: checkcast java/lang/Boolean
    //   370: invokevirtual booleanValue : ()Z
    //   373: ifne -> 833
    //   376: aload_0
    //   377: aload #11
    //   379: getfield Dne : I
    //   382: aload #11
    //   384: getfield FWm : I
    //   387: invokestatic Dne : (LQnq;II)LEyB;
    //   390: astore #12
    //   392: aload #12
    //   394: getfield Dne : I
    //   397: istore #13
    //   399: aload #12
    //   401: getfield FWm : I
    //   404: istore #14
    //   406: aload #12
    //   408: getfield bzF : I
    //   411: istore #15
    //   413: aload_0
    //   414: iload #13
    //   416: iload #14
    //   418: iload #15
    //   420: invokevirtual DyG : (III)Z
    //   423: ifne -> 833
    //   426: aload_0
    //   427: iload #13
    //   429: iload #14
    //   431: iload #15
    //   433: invokevirtual Dne : (III)LKFd;
    //   436: aload #9
    //   438: invokevirtual Dne : ()LKFd;
    //   441: if_acmpne -> 833
    //   444: iconst_0
    //   445: istore #16
    //   447: iconst_0
    //   448: istore #17
    //   450: iload #17
    //   452: iconst_3
    //   453: if_icmpge -> 833
    //   456: iload #13
    //   458: istore #18
    //   460: iload #14
    //   462: istore #19
    //   464: iload #15
    //   466: istore #20
    //   468: bipush #6
    //   470: istore #21
    //   472: aconst_null
    //   473: astore #22
    //   475: iconst_0
    //   476: istore #23
    //   478: iload #23
    //   480: iconst_4
    //   481: if_icmpge -> 824
    //   484: iload #18
    //   486: aload_0
    //   487: getfield Dne : Ljava/util/Random;
    //   490: iload #21
    //   492: invokevirtual nextInt : (I)I
    //   495: aload_0
    //   496: getfield Dne : Ljava/util/Random;
    //   499: iload #21
    //   501: invokevirtual nextInt : (I)I
    //   504: isub
    //   505: iadd
    //   506: istore #18
    //   508: iload #19
    //   510: aload_0
    //   511: getfield Dne : Ljava/util/Random;
    //   514: iconst_1
    //   515: invokevirtual nextInt : (I)I
    //   518: aload_0
    //   519: getfield Dne : Ljava/util/Random;
    //   522: iconst_1
    //   523: invokevirtual nextInt : (I)I
    //   526: isub
    //   527: iadd
    //   528: istore #19
    //   530: iload #20
    //   532: aload_0
    //   533: getfield Dne : Ljava/util/Random;
    //   536: iload #21
    //   538: invokevirtual nextInt : (I)I
    //   541: aload_0
    //   542: getfield Dne : Ljava/util/Random;
    //   545: iload #21
    //   547: invokevirtual nextInt : (I)I
    //   550: isub
    //   551: iadd
    //   552: istore #20
    //   554: aload #9
    //   556: aload_0
    //   557: iload #18
    //   559: iload #19
    //   561: iload #20
    //   563: invokestatic Dne : (LIcc;LQnq;III)Z
    //   566: ifeq -> 818
    //   569: iload #18
    //   571: i2f
    //   572: ldc 0.5
    //   574: fadd
    //   575: fstore #24
    //   577: iload #19
    //   579: i2f
    //   580: fstore #25
    //   582: iload #20
    //   584: i2f
    //   585: ldc 0.5
    //   587: fadd
    //   588: fstore #26
    //   590: aload_0
    //   591: fload #24
    //   593: f2d
    //   594: fload #25
    //   596: f2d
    //   597: fload #26
    //   599: f2d
    //   600: ldc2_w 24.0
    //   603: invokevirtual Dne : (DDDD)LFiG;
    //   606: ifnonnull -> 818
    //   609: fload #24
    //   611: aload #6
    //   613: getfield Dne : I
    //   616: i2f
    //   617: fsub
    //   618: fstore #27
    //   620: fload #25
    //   622: aload #6
    //   624: getfield FWm : I
    //   627: i2f
    //   628: fsub
    //   629: fstore #28
    //   631: fload #26
    //   633: aload #6
    //   635: getfield bzF : I
    //   638: i2f
    //   639: fsub
    //   640: fstore #29
    //   642: fload #27
    //   644: fload #27
    //   646: fmul
    //   647: fload #28
    //   649: fload #28
    //   651: fmul
    //   652: fadd
    //   653: fload #29
    //   655: fload #29
    //   657: fmul
    //   658: fadd
    //   659: fstore #30
    //   661: fload #30
    //   663: ldc_w 576.0
    //   666: fcmpl
    //   667: iflt -> 818
    //   670: aload #22
    //   672: ifnonnull -> 697
    //   675: aload_0
    //   676: aload #9
    //   678: iload #18
    //   680: iload #19
    //   682: iload #20
    //   684: invokevirtual Dne : (LIcc;III)LoIf;
    //   687: astore #22
    //   689: aload #22
    //   691: ifnonnull -> 697
    //   694: goto -> 824
    //   697: aload #22
    //   699: getfield Dne : Ljava/lang/Class;
    //   702: iconst_1
    //   703: anewarray java/lang/Class
    //   706: dup
    //   707: iconst_0
    //   708: ldc Qnq
    //   710: aastore
    //   711: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   714: iconst_1
    //   715: anewarray java/lang/Object
    //   718: dup
    //   719: iconst_0
    //   720: aload_0
    //   721: aastore
    //   722: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   725: checkcast FUH
    //   728: astore #31
    //   730: goto -> 743
    //   733: astore #32
    //   735: aload #32
    //   737: invokevirtual printStackTrace : ()V
    //   740: iload #4
    //   742: ireturn
    //   743: aload #31
    //   745: fload #24
    //   747: f2d
    //   748: fload #25
    //   750: f2d
    //   751: fload #26
    //   753: f2d
    //   754: aload_0
    //   755: getfield Dne : Ljava/util/Random;
    //   758: invokevirtual nextFloat : ()F
    //   761: ldc 360.0
    //   763: fmul
    //   764: fconst_0
    //   765: invokevirtual FWm : (DDDFF)V
    //   768: aload #31
    //   770: invokevirtual cot : ()Z
    //   773: ifeq -> 811
    //   776: iinc #16, 1
    //   779: aload_0
    //   780: aload #31
    //   782: invokevirtual FWm : (LsMa;)Z
    //   785: pop
    //   786: aload #31
    //   788: aload_0
    //   789: fload #24
    //   791: fload #25
    //   793: fload #26
    //   795: invokestatic Dne : (LFUH;LQnq;FFF)V
    //   798: iload #16
    //   800: aload #31
    //   802: invokevirtual ooe : ()I
    //   805: if_icmplt -> 811
    //   808: goto -> 337
    //   811: iload #4
    //   813: iload #16
    //   815: iadd
    //   816: istore #4
    //   818: iinc #23, 1
    //   821: goto -> 478
    //   824: iinc #17, 1
    //   827: goto -> 830
    //   830: goto -> 450
    //   833: goto -> 337
    //   836: iinc #8, 1
    //   839: goto -> 246
    //   842: iload #4
    //   844: ireturn
    // Exception table:
    //   from	to	target	type
    //   697	730	733	java/lang/Exception
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ooe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */