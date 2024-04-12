public class Drf extends Gor {
  private rxL aFZ;
  
  private rxL FWm;
  
  private rxL zGp;
  
  private rxL IjH;
  
  private rxL DyG;
  
  private rxL Zpi;
  
  private rxL mrb;
  
  private rxL bzF;
  
  private float FWm;
  
  private rxL div;
  
  private rxL Dne;
  
  private rxL XHL;
  
  private rxL Qnq;
  
  private float Dne(double paramDouble) {
    while (paramDouble >= 180.0D)
      paramDouble -= 360.0D; 
    while (paramDouble < -180.0D)
      paramDouble += 360.0D; 
    return (float)paramDouble;
  }
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.FWm = paramFloat3;
  }
  
  public Drf(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: sipush #256
    //   8: putfield bzF : I
    //   11: aload_0
    //   12: sipush #256
    //   15: putfield Qnq : I
    //   18: aload_0
    //   19: ldc 'body.body'
    //   21: iconst_0
    //   22: iconst_0
    //   23: invokevirtual Dne : (Ljava/lang/String;II)V
    //   26: aload_0
    //   27: ldc 'wing.skin'
    //   29: bipush #-56
    //   31: bipush #88
    //   33: invokevirtual Dne : (Ljava/lang/String;II)V
    //   36: aload_0
    //   37: ldc 'wingtip.skin'
    //   39: bipush #-56
    //   41: sipush #144
    //   44: invokevirtual Dne : (Ljava/lang/String;II)V
    //   47: aload_0
    //   48: ldc 'rearleg.main'
    //   50: iconst_0
    //   51: iconst_0
    //   52: invokevirtual Dne : (Ljava/lang/String;II)V
    //   55: aload_0
    //   56: ldc 'rearfoot.main'
    //   58: bipush #112
    //   60: iconst_0
    //   61: invokevirtual Dne : (Ljava/lang/String;II)V
    //   64: aload_0
    //   65: ldc 'rearlegtip.main'
    //   67: sipush #196
    //   70: iconst_0
    //   71: invokevirtual Dne : (Ljava/lang/String;II)V
    //   74: aload_0
    //   75: ldc 'head.upperhead'
    //   77: bipush #112
    //   79: bipush #30
    //   81: invokevirtual Dne : (Ljava/lang/String;II)V
    //   84: aload_0
    //   85: ldc 'wing.bone'
    //   87: bipush #112
    //   89: bipush #88
    //   91: invokevirtual Dne : (Ljava/lang/String;II)V
    //   94: aload_0
    //   95: ldc 'head.upperlip'
    //   97: sipush #176
    //   100: bipush #44
    //   102: invokevirtual Dne : (Ljava/lang/String;II)V
    //   105: aload_0
    //   106: ldc 'jaw.jaw'
    //   108: sipush #176
    //   111: bipush #65
    //   113: invokevirtual Dne : (Ljava/lang/String;II)V
    //   116: aload_0
    //   117: ldc 'frontleg.main'
    //   119: bipush #112
    //   121: bipush #104
    //   123: invokevirtual Dne : (Ljava/lang/String;II)V
    //   126: aload_0
    //   127: ldc 'wingtip.bone'
    //   129: bipush #112
    //   131: sipush #136
    //   134: invokevirtual Dne : (Ljava/lang/String;II)V
    //   137: aload_0
    //   138: ldc 'frontfoot.main'
    //   140: sipush #144
    //   143: bipush #104
    //   145: invokevirtual Dne : (Ljava/lang/String;II)V
    //   148: aload_0
    //   149: ldc 'neck.box'
    //   151: sipush #192
    //   154: bipush #104
    //   156: invokevirtual Dne : (Ljava/lang/String;II)V
    //   159: aload_0
    //   160: ldc 'frontlegtip.main'
    //   162: sipush #226
    //   165: sipush #138
    //   168: invokevirtual Dne : (Ljava/lang/String;II)V
    //   171: aload_0
    //   172: ldc 'body.scale'
    //   174: sipush #220
    //   177: bipush #53
    //   179: invokevirtual Dne : (Ljava/lang/String;II)V
    //   182: aload_0
    //   183: ldc 'head.scale'
    //   185: iconst_0
    //   186: iconst_0
    //   187: invokevirtual Dne : (Ljava/lang/String;II)V
    //   190: aload_0
    //   191: ldc 'neck.scale'
    //   193: bipush #48
    //   195: iconst_0
    //   196: invokevirtual Dne : (Ljava/lang/String;II)V
    //   199: aload_0
    //   200: ldc 'head.nostril'
    //   202: bipush #112
    //   204: iconst_0
    //   205: invokevirtual Dne : (Ljava/lang/String;II)V
    //   208: ldc -16.0
    //   210: fstore_2
    //   211: aload_0
    //   212: new rxL
    //   215: dup
    //   216: aload_0
    //   217: ldc 'head'
    //   219: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   222: putfield Dne : LrxL;
    //   225: aload_0
    //   226: getfield Dne : LrxL;
    //   229: ldc 'upperlip'
    //   231: ldc -6.0
    //   233: ldc -1.0
    //   235: ldc -8.0
    //   237: fload_2
    //   238: fadd
    //   239: bipush #12
    //   241: iconst_5
    //   242: bipush #16
    //   244: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   247: pop
    //   248: aload_0
    //   249: getfield Dne : LrxL;
    //   252: ldc 'upperhead'
    //   254: ldc -8.0
    //   256: ldc -8.0
    //   258: ldc 6.0
    //   260: fload_2
    //   261: fadd
    //   262: bipush #16
    //   264: bipush #16
    //   266: bipush #16
    //   268: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   271: pop
    //   272: aload_0
    //   273: getfield Dne : LrxL;
    //   276: iconst_1
    //   277: putfield Dne : Z
    //   280: aload_0
    //   281: getfield Dne : LrxL;
    //   284: ldc 'scale'
    //   286: ldc -5.0
    //   288: ldc -12.0
    //   290: ldc 12.0
    //   292: fload_2
    //   293: fadd
    //   294: iconst_2
    //   295: iconst_4
    //   296: bipush #6
    //   298: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   301: pop
    //   302: aload_0
    //   303: getfield Dne : LrxL;
    //   306: ldc 'nostril'
    //   308: ldc -5.0
    //   310: ldc -3.0
    //   312: ldc -6.0
    //   314: fload_2
    //   315: fadd
    //   316: iconst_2
    //   317: iconst_2
    //   318: iconst_4
    //   319: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   322: pop
    //   323: aload_0
    //   324: getfield Dne : LrxL;
    //   327: iconst_0
    //   328: putfield Dne : Z
    //   331: aload_0
    //   332: getfield Dne : LrxL;
    //   335: ldc 'scale'
    //   337: ldc 3.0
    //   339: ldc -12.0
    //   341: ldc 12.0
    //   343: fload_2
    //   344: fadd
    //   345: iconst_2
    //   346: iconst_4
    //   347: bipush #6
    //   349: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   352: pop
    //   353: aload_0
    //   354: getfield Dne : LrxL;
    //   357: ldc 'nostril'
    //   359: ldc 3.0
    //   361: ldc -3.0
    //   363: ldc -6.0
    //   365: fload_2
    //   366: fadd
    //   367: iconst_2
    //   368: iconst_2
    //   369: iconst_4
    //   370: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   373: pop
    //   374: aload_0
    //   375: new rxL
    //   378: dup
    //   379: aload_0
    //   380: ldc 'jaw'
    //   382: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   385: putfield bzF : LrxL;
    //   388: aload_0
    //   389: getfield bzF : LrxL;
    //   392: fconst_0
    //   393: ldc 4.0
    //   395: ldc 8.0
    //   397: fload_2
    //   398: fadd
    //   399: invokevirtual Dne : (FFF)V
    //   402: aload_0
    //   403: getfield bzF : LrxL;
    //   406: ldc 'jaw'
    //   408: ldc -6.0
    //   410: fconst_0
    //   411: ldc -16.0
    //   413: bipush #12
    //   415: iconst_4
    //   416: bipush #16
    //   418: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   421: pop
    //   422: aload_0
    //   423: getfield Dne : LrxL;
    //   426: aload_0
    //   427: getfield bzF : LrxL;
    //   430: invokevirtual Dne : (LrxL;)V
    //   433: aload_0
    //   434: new rxL
    //   437: dup
    //   438: aload_0
    //   439: ldc 'neck'
    //   441: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   444: putfield FWm : LrxL;
    //   447: aload_0
    //   448: getfield FWm : LrxL;
    //   451: ldc 'box'
    //   453: ldc -5.0
    //   455: ldc -5.0
    //   457: ldc -5.0
    //   459: bipush #10
    //   461: bipush #10
    //   463: bipush #10
    //   465: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   468: pop
    //   469: aload_0
    //   470: getfield FWm : LrxL;
    //   473: ldc 'scale'
    //   475: ldc -1.0
    //   477: ldc -9.0
    //   479: ldc -3.0
    //   481: iconst_2
    //   482: iconst_4
    //   483: bipush #6
    //   485: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   488: pop
    //   489: aload_0
    //   490: new rxL
    //   493: dup
    //   494: aload_0
    //   495: ldc 'body'
    //   497: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   500: putfield Qnq : LrxL;
    //   503: aload_0
    //   504: getfield Qnq : LrxL;
    //   507: fconst_0
    //   508: ldc 4.0
    //   510: ldc 8.0
    //   512: invokevirtual Dne : (FFF)V
    //   515: aload_0
    //   516: getfield Qnq : LrxL;
    //   519: ldc 'body'
    //   521: ldc -12.0
    //   523: fconst_0
    //   524: ldc -16.0
    //   526: bipush #24
    //   528: bipush #24
    //   530: bipush #64
    //   532: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   535: pop
    //   536: aload_0
    //   537: getfield Qnq : LrxL;
    //   540: ldc 'scale'
    //   542: ldc -1.0
    //   544: ldc -6.0
    //   546: ldc -10.0
    //   548: iconst_2
    //   549: bipush #6
    //   551: bipush #12
    //   553: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   556: pop
    //   557: aload_0
    //   558: getfield Qnq : LrxL;
    //   561: ldc 'scale'
    //   563: ldc -1.0
    //   565: ldc -6.0
    //   567: ldc 10.0
    //   569: iconst_2
    //   570: bipush #6
    //   572: bipush #12
    //   574: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   577: pop
    //   578: aload_0
    //   579: getfield Qnq : LrxL;
    //   582: ldc 'scale'
    //   584: ldc -1.0
    //   586: ldc -6.0
    //   588: ldc 30.0
    //   590: iconst_2
    //   591: bipush #6
    //   593: bipush #12
    //   595: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   598: pop
    //   599: aload_0
    //   600: new rxL
    //   603: dup
    //   604: aload_0
    //   605: ldc 'wing'
    //   607: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   610: putfield XHL : LrxL;
    //   613: aload_0
    //   614: getfield XHL : LrxL;
    //   617: ldc -12.0
    //   619: ldc 5.0
    //   621: fconst_2
    //   622: invokevirtual Dne : (FFF)V
    //   625: aload_0
    //   626: getfield XHL : LrxL;
    //   629: ldc 'bone'
    //   631: ldc -56.0
    //   633: ldc -4.0
    //   635: ldc -4.0
    //   637: bipush #56
    //   639: bipush #8
    //   641: bipush #8
    //   643: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   646: pop
    //   647: aload_0
    //   648: getfield XHL : LrxL;
    //   651: ldc 'skin'
    //   653: ldc -56.0
    //   655: fconst_0
    //   656: fconst_2
    //   657: bipush #56
    //   659: iconst_0
    //   660: bipush #56
    //   662: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   665: pop
    //   666: aload_0
    //   667: new rxL
    //   670: dup
    //   671: aload_0
    //   672: ldc 'wingtip'
    //   674: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   677: putfield Zpi : LrxL;
    //   680: aload_0
    //   681: getfield Zpi : LrxL;
    //   684: ldc -56.0
    //   686: fconst_0
    //   687: fconst_0
    //   688: invokevirtual Dne : (FFF)V
    //   691: aload_0
    //   692: getfield Zpi : LrxL;
    //   695: ldc 'bone'
    //   697: ldc -56.0
    //   699: ldc -2.0
    //   701: ldc -2.0
    //   703: bipush #56
    //   705: iconst_4
    //   706: iconst_4
    //   707: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   710: pop
    //   711: aload_0
    //   712: getfield Zpi : LrxL;
    //   715: ldc 'skin'
    //   717: ldc -56.0
    //   719: fconst_0
    //   720: fconst_2
    //   721: bipush #56
    //   723: iconst_0
    //   724: bipush #56
    //   726: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   729: pop
    //   730: aload_0
    //   731: getfield XHL : LrxL;
    //   734: aload_0
    //   735: getfield Zpi : LrxL;
    //   738: invokevirtual Dne : (LrxL;)V
    //   741: aload_0
    //   742: new rxL
    //   745: dup
    //   746: aload_0
    //   747: ldc 'frontleg'
    //   749: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   752: putfield zGp : LrxL;
    //   755: aload_0
    //   756: getfield zGp : LrxL;
    //   759: ldc -12.0
    //   761: ldc 20.0
    //   763: fconst_2
    //   764: invokevirtual Dne : (FFF)V
    //   767: aload_0
    //   768: getfield zGp : LrxL;
    //   771: ldc 'main'
    //   773: ldc -4.0
    //   775: ldc -4.0
    //   777: ldc -4.0
    //   779: bipush #8
    //   781: bipush #24
    //   783: bipush #8
    //   785: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   788: pop
    //   789: aload_0
    //   790: new rxL
    //   793: dup
    //   794: aload_0
    //   795: ldc 'frontlegtip'
    //   797: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   800: putfield div : LrxL;
    //   803: aload_0
    //   804: getfield div : LrxL;
    //   807: fconst_0
    //   808: ldc 20.0
    //   810: ldc -1.0
    //   812: invokevirtual Dne : (FFF)V
    //   815: aload_0
    //   816: getfield div : LrxL;
    //   819: ldc 'main'
    //   821: ldc -3.0
    //   823: ldc -1.0
    //   825: ldc -3.0
    //   827: bipush #6
    //   829: bipush #24
    //   831: bipush #6
    //   833: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   836: pop
    //   837: aload_0
    //   838: getfield zGp : LrxL;
    //   841: aload_0
    //   842: getfield div : LrxL;
    //   845: invokevirtual Dne : (LrxL;)V
    //   848: aload_0
    //   849: new rxL
    //   852: dup
    //   853: aload_0
    //   854: ldc 'frontfoot'
    //   856: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   859: putfield mrb : LrxL;
    //   862: aload_0
    //   863: getfield mrb : LrxL;
    //   866: fconst_0
    //   867: ldc 23.0
    //   869: fconst_0
    //   870: invokevirtual Dne : (FFF)V
    //   873: aload_0
    //   874: getfield mrb : LrxL;
    //   877: ldc 'main'
    //   879: ldc -4.0
    //   881: fconst_0
    //   882: ldc -12.0
    //   884: bipush #8
    //   886: iconst_4
    //   887: bipush #16
    //   889: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   892: pop
    //   893: aload_0
    //   894: getfield div : LrxL;
    //   897: aload_0
    //   898: getfield mrb : LrxL;
    //   901: invokevirtual Dne : (LrxL;)V
    //   904: aload_0
    //   905: new rxL
    //   908: dup
    //   909: aload_0
    //   910: ldc 'rearleg'
    //   912: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   915: putfield aFZ : LrxL;
    //   918: aload_0
    //   919: getfield aFZ : LrxL;
    //   922: ldc -16.0
    //   924: ldc 16.0
    //   926: ldc 42.0
    //   928: invokevirtual Dne : (FFF)V
    //   931: aload_0
    //   932: getfield aFZ : LrxL;
    //   935: ldc 'main'
    //   937: ldc -8.0
    //   939: ldc -4.0
    //   941: ldc -8.0
    //   943: bipush #16
    //   945: bipush #32
    //   947: bipush #16
    //   949: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   952: pop
    //   953: aload_0
    //   954: new rxL
    //   957: dup
    //   958: aload_0
    //   959: ldc 'rearlegtip'
    //   961: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   964: putfield DyG : LrxL;
    //   967: aload_0
    //   968: getfield DyG : LrxL;
    //   971: fconst_0
    //   972: ldc 32.0
    //   974: ldc -4.0
    //   976: invokevirtual Dne : (FFF)V
    //   979: aload_0
    //   980: getfield DyG : LrxL;
    //   983: ldc 'main'
    //   985: ldc -6.0
    //   987: ldc -2.0
    //   989: fconst_0
    //   990: bipush #12
    //   992: bipush #32
    //   994: bipush #12
    //   996: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   999: pop
    //   1000: aload_0
    //   1001: getfield aFZ : LrxL;
    //   1004: aload_0
    //   1005: getfield DyG : LrxL;
    //   1008: invokevirtual Dne : (LrxL;)V
    //   1011: aload_0
    //   1012: new rxL
    //   1015: dup
    //   1016: aload_0
    //   1017: ldc 'rearfoot'
    //   1019: invokespecial <init> : (LGor;Ljava/lang/String;)V
    //   1022: putfield IjH : LrxL;
    //   1025: aload_0
    //   1026: getfield IjH : LrxL;
    //   1029: fconst_0
    //   1030: ldc 31.0
    //   1032: ldc 4.0
    //   1034: invokevirtual Dne : (FFF)V
    //   1037: aload_0
    //   1038: getfield IjH : LrxL;
    //   1041: ldc 'main'
    //   1043: ldc -9.0
    //   1045: fconst_0
    //   1046: ldc -20.0
    //   1048: bipush #18
    //   1050: bipush #6
    //   1052: bipush #24
    //   1054: invokevirtual Dne : (Ljava/lang/String;FFFIII)LrxL;
    //   1057: pop
    //   1058: aload_0
    //   1059: getfield DyG : LrxL;
    //   1062: aload_0
    //   1063: getfield IjH : LrxL;
    //   1066: invokevirtual Dne : (LrxL;)V
    //   1069: return
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    // Byte code:
    //   0: invokestatic glPushMatrix : ()V
    //   3: aload_1
    //   4: checkcast WSC
    //   7: astore #8
    //   9: aload #8
    //   11: getfield Dne : F
    //   14: aload #8
    //   16: getfield FWm : F
    //   19: aload #8
    //   21: getfield Dne : F
    //   24: fsub
    //   25: aload_0
    //   26: getfield FWm : F
    //   29: fmul
    //   30: fadd
    //   31: fstore #9
    //   33: aload_0
    //   34: getfield bzF : LrxL;
    //   37: fload #9
    //   39: ldc 3.1415927
    //   41: fmul
    //   42: fconst_2
    //   43: fmul
    //   44: f2d
    //   45: invokestatic sin : (D)D
    //   48: dconst_1
    //   49: dadd
    //   50: d2f
    //   51: ldc 0.2
    //   53: fmul
    //   54: putfield zGp : F
    //   57: fload #9
    //   59: ldc 3.1415927
    //   61: fmul
    //   62: fconst_2
    //   63: fmul
    //   64: fconst_1
    //   65: fsub
    //   66: f2d
    //   67: invokestatic sin : (D)D
    //   70: dconst_1
    //   71: dadd
    //   72: d2f
    //   73: fstore #10
    //   75: fload #10
    //   77: fload #10
    //   79: fmul
    //   80: fconst_1
    //   81: fmul
    //   82: fload #10
    //   84: fconst_2
    //   85: fmul
    //   86: fadd
    //   87: ldc 0.05
    //   89: fmul
    //   90: fstore #10
    //   92: fconst_0
    //   93: fload #10
    //   95: fconst_2
    //   96: fsub
    //   97: ldc -3.0
    //   99: invokestatic glTranslatef : (FFF)V
    //   102: fload #10
    //   104: fconst_2
    //   105: fmul
    //   106: fconst_1
    //   107: fconst_0
    //   108: fconst_0
    //   109: invokestatic glRotatef : (FFFF)V
    //   112: ldc -30.0
    //   114: fstore #11
    //   116: fconst_0
    //   117: fstore #12
    //   119: ldc 1.5
    //   121: fstore #13
    //   123: aload #8
    //   125: bipush #6
    //   127: aload_0
    //   128: getfield FWm : F
    //   131: invokevirtual Dne : (IF)[D
    //   134: astore #14
    //   136: aload_0
    //   137: aload #8
    //   139: iconst_5
    //   140: aload_0
    //   141: getfield FWm : F
    //   144: invokevirtual Dne : (IF)[D
    //   147: iconst_0
    //   148: daload
    //   149: aload #8
    //   151: bipush #10
    //   153: aload_0
    //   154: getfield FWm : F
    //   157: invokevirtual Dne : (IF)[D
    //   160: iconst_0
    //   161: daload
    //   162: dsub
    //   163: invokespecial Dne : (D)F
    //   166: fstore #15
    //   168: aload_0
    //   169: aload #8
    //   171: iconst_5
    //   172: aload_0
    //   173: getfield FWm : F
    //   176: invokevirtual Dne : (IF)[D
    //   179: iconst_0
    //   180: daload
    //   181: fload #15
    //   183: fconst_2
    //   184: fdiv
    //   185: f2d
    //   186: dadd
    //   187: invokespecial Dne : (D)F
    //   190: fstore #16
    //   192: fload #11
    //   194: fconst_2
    //   195: fadd
    //   196: fstore #11
    //   198: fload #9
    //   200: ldc 3.1415927
    //   202: fmul
    //   203: fconst_2
    //   204: fmul
    //   205: fstore #17
    //   207: ldc 20.0
    //   209: fstore #11
    //   211: ldc -12.0
    //   213: fstore #18
    //   215: iconst_0
    //   216: istore #20
    //   218: iload #20
    //   220: iconst_5
    //   221: if_icmpge -> 480
    //   224: aload #8
    //   226: iconst_5
    //   227: iload #20
    //   229: isub
    //   230: aload_0
    //   231: getfield FWm : F
    //   234: invokevirtual Dne : (IF)[D
    //   237: astore #21
    //   239: iload #20
    //   241: i2f
    //   242: ldc 0.45
    //   244: fmul
    //   245: fload #17
    //   247: fadd
    //   248: f2d
    //   249: invokestatic cos : (D)D
    //   252: d2f
    //   253: ldc 0.15
    //   255: fmul
    //   256: fstore #19
    //   258: aload_0
    //   259: getfield FWm : LrxL;
    //   262: aload_0
    //   263: aload #21
    //   265: iconst_0
    //   266: daload
    //   267: aload #14
    //   269: iconst_0
    //   270: daload
    //   271: dsub
    //   272: invokespecial Dne : (D)F
    //   275: ldc 3.1415927
    //   277: fmul
    //   278: ldc 180.0
    //   280: fdiv
    //   281: fload #13
    //   283: fmul
    //   284: putfield DyG : F
    //   287: aload_0
    //   288: getfield FWm : LrxL;
    //   291: fload #19
    //   293: aload #21
    //   295: iconst_1
    //   296: daload
    //   297: aload #14
    //   299: iconst_1
    //   300: daload
    //   301: dsub
    //   302: d2f
    //   303: ldc 3.1415927
    //   305: fmul
    //   306: ldc 180.0
    //   308: fdiv
    //   309: fload #13
    //   311: fmul
    //   312: ldc 5.0
    //   314: fmul
    //   315: fadd
    //   316: putfield zGp : F
    //   319: aload_0
    //   320: getfield FWm : LrxL;
    //   323: aload_0
    //   324: aload #21
    //   326: iconst_0
    //   327: daload
    //   328: fload #16
    //   330: f2d
    //   331: dsub
    //   332: invokespecial Dne : (D)F
    //   335: fneg
    //   336: ldc 3.1415927
    //   338: fmul
    //   339: ldc 180.0
    //   341: fdiv
    //   342: fload #13
    //   344: fmul
    //   345: putfield div : F
    //   348: aload_0
    //   349: getfield FWm : LrxL;
    //   352: fload #11
    //   354: putfield Qnq : F
    //   357: aload_0
    //   358: getfield FWm : LrxL;
    //   361: fload #18
    //   363: putfield aFZ : F
    //   366: aload_0
    //   367: getfield FWm : LrxL;
    //   370: fload #12
    //   372: putfield bzF : F
    //   375: fload #11
    //   377: f2d
    //   378: aload_0
    //   379: getfield FWm : LrxL;
    //   382: getfield zGp : F
    //   385: f2d
    //   386: invokestatic sin : (D)D
    //   389: ldc2_w 10.0
    //   392: dmul
    //   393: dadd
    //   394: d2f
    //   395: fstore #11
    //   397: fload #18
    //   399: f2d
    //   400: aload_0
    //   401: getfield FWm : LrxL;
    //   404: getfield DyG : F
    //   407: f2d
    //   408: invokestatic cos : (D)D
    //   411: aload_0
    //   412: getfield FWm : LrxL;
    //   415: getfield zGp : F
    //   418: f2d
    //   419: invokestatic cos : (D)D
    //   422: dmul
    //   423: ldc2_w 10.0
    //   426: dmul
    //   427: dsub
    //   428: d2f
    //   429: fstore #18
    //   431: fload #12
    //   433: f2d
    //   434: aload_0
    //   435: getfield FWm : LrxL;
    //   438: getfield DyG : F
    //   441: f2d
    //   442: invokestatic sin : (D)D
    //   445: aload_0
    //   446: getfield FWm : LrxL;
    //   449: getfield zGp : F
    //   452: f2d
    //   453: invokestatic cos : (D)D
    //   456: dmul
    //   457: ldc2_w 10.0
    //   460: dmul
    //   461: dsub
    //   462: d2f
    //   463: fstore #12
    //   465: aload_0
    //   466: getfield FWm : LrxL;
    //   469: fload #7
    //   471: invokevirtual Dne : (F)V
    //   474: iinc #20, 1
    //   477: goto -> 218
    //   480: aload_0
    //   481: getfield Dne : LrxL;
    //   484: fload #11
    //   486: putfield Qnq : F
    //   489: aload_0
    //   490: getfield Dne : LrxL;
    //   493: fload #18
    //   495: putfield aFZ : F
    //   498: aload_0
    //   499: getfield Dne : LrxL;
    //   502: fload #12
    //   504: putfield bzF : F
    //   507: aload #8
    //   509: iconst_0
    //   510: aload_0
    //   511: getfield FWm : F
    //   514: invokevirtual Dne : (IF)[D
    //   517: astore #20
    //   519: aload_0
    //   520: getfield Dne : LrxL;
    //   523: aload_0
    //   524: aload #20
    //   526: iconst_0
    //   527: daload
    //   528: aload #14
    //   530: iconst_0
    //   531: daload
    //   532: dsub
    //   533: invokespecial Dne : (D)F
    //   536: ldc 3.1415927
    //   538: fmul
    //   539: ldc 180.0
    //   541: fdiv
    //   542: fconst_1
    //   543: fmul
    //   544: putfield DyG : F
    //   547: aload_0
    //   548: getfield Dne : LrxL;
    //   551: aload_0
    //   552: aload #20
    //   554: iconst_0
    //   555: daload
    //   556: fload #16
    //   558: f2d
    //   559: dsub
    //   560: invokespecial Dne : (D)F
    //   563: fneg
    //   564: ldc 3.1415927
    //   566: fmul
    //   567: ldc 180.0
    //   569: fdiv
    //   570: fconst_1
    //   571: fmul
    //   572: putfield div : F
    //   575: aload_0
    //   576: getfield Dne : LrxL;
    //   579: fload #7
    //   581: invokevirtual Dne : (F)V
    //   584: invokestatic glPushMatrix : ()V
    //   587: fconst_0
    //   588: fconst_1
    //   589: fconst_0
    //   590: invokestatic glTranslatef : (FFF)V
    //   593: fload #15
    //   595: fneg
    //   596: fload #13
    //   598: fmul
    //   599: fconst_1
    //   600: fmul
    //   601: fconst_0
    //   602: fconst_0
    //   603: fconst_1
    //   604: invokestatic glRotatef : (FFFF)V
    //   607: fconst_0
    //   608: ldc -1.0
    //   610: fconst_0
    //   611: invokestatic glTranslatef : (FFF)V
    //   614: aload_0
    //   615: getfield Qnq : LrxL;
    //   618: fconst_0
    //   619: putfield div : F
    //   622: aload_0
    //   623: getfield Qnq : LrxL;
    //   626: fload #7
    //   628: invokevirtual Dne : (F)V
    //   631: iconst_0
    //   632: istore #21
    //   634: iload #21
    //   636: iconst_2
    //   637: if_icmpge -> 881
    //   640: sipush #2884
    //   643: invokestatic glEnable : (I)V
    //   646: fload #9
    //   648: ldc 3.1415927
    //   650: fmul
    //   651: fconst_2
    //   652: fmul
    //   653: fstore #19
    //   655: aload_0
    //   656: getfield XHL : LrxL;
    //   659: ldc 0.125
    //   661: fload #19
    //   663: f2d
    //   664: invokestatic cos : (D)D
    //   667: d2f
    //   668: ldc 0.2
    //   670: fmul
    //   671: fsub
    //   672: putfield zGp : F
    //   675: aload_0
    //   676: getfield XHL : LrxL;
    //   679: ldc 0.25
    //   681: putfield DyG : F
    //   684: aload_0
    //   685: getfield XHL : LrxL;
    //   688: fload #19
    //   690: f2d
    //   691: invokestatic sin : (D)D
    //   694: ldc2_w 0.125
    //   697: dadd
    //   698: d2f
    //   699: ldc 0.8
    //   701: fmul
    //   702: putfield div : F
    //   705: aload_0
    //   706: getfield Zpi : LrxL;
    //   709: fload #19
    //   711: fconst_2
    //   712: fadd
    //   713: f2d
    //   714: invokestatic sin : (D)D
    //   717: ldc2_w 0.5
    //   720: dadd
    //   721: d2f
    //   722: fneg
    //   723: ldc_w 0.75
    //   726: fmul
    //   727: putfield div : F
    //   730: aload_0
    //   731: getfield aFZ : LrxL;
    //   734: fconst_1
    //   735: fload #10
    //   737: ldc_w 0.1
    //   740: fmul
    //   741: fadd
    //   742: putfield zGp : F
    //   745: aload_0
    //   746: getfield DyG : LrxL;
    //   749: ldc_w 0.5
    //   752: fload #10
    //   754: ldc_w 0.1
    //   757: fmul
    //   758: fadd
    //   759: putfield zGp : F
    //   762: aload_0
    //   763: getfield IjH : LrxL;
    //   766: ldc_w 0.75
    //   769: fload #10
    //   771: ldc_w 0.1
    //   774: fmul
    //   775: fadd
    //   776: putfield zGp : F
    //   779: aload_0
    //   780: getfield zGp : LrxL;
    //   783: ldc_w 1.3
    //   786: fload #10
    //   788: ldc_w 0.1
    //   791: fmul
    //   792: fadd
    //   793: putfield zGp : F
    //   796: aload_0
    //   797: getfield div : LrxL;
    //   800: ldc_w -0.5
    //   803: fload #10
    //   805: ldc_w 0.1
    //   808: fmul
    //   809: fsub
    //   810: putfield zGp : F
    //   813: aload_0
    //   814: getfield mrb : LrxL;
    //   817: ldc_w 0.75
    //   820: fload #10
    //   822: ldc_w 0.1
    //   825: fmul
    //   826: fadd
    //   827: putfield zGp : F
    //   830: aload_0
    //   831: getfield XHL : LrxL;
    //   834: fload #7
    //   836: invokevirtual Dne : (F)V
    //   839: aload_0
    //   840: getfield zGp : LrxL;
    //   843: fload #7
    //   845: invokevirtual Dne : (F)V
    //   848: aload_0
    //   849: getfield aFZ : LrxL;
    //   852: fload #7
    //   854: invokevirtual Dne : (F)V
    //   857: ldc -1.0
    //   859: fconst_1
    //   860: fconst_1
    //   861: invokestatic glScalef : (FFF)V
    //   864: iload #21
    //   866: ifne -> 875
    //   869: sipush #1028
    //   872: invokestatic glCullFace : (I)V
    //   875: iinc #21, 1
    //   878: goto -> 634
    //   881: invokestatic glPopMatrix : ()V
    //   884: sipush #1029
    //   887: invokestatic glCullFace : (I)V
    //   890: sipush #2884
    //   893: invokestatic glDisable : (I)V
    //   896: fload #9
    //   898: ldc 3.1415927
    //   900: fmul
    //   901: fconst_2
    //   902: fmul
    //   903: f2d
    //   904: invokestatic sin : (D)D
    //   907: d2f
    //   908: fneg
    //   909: fconst_0
    //   910: fmul
    //   911: fstore #21
    //   913: fload #9
    //   915: ldc 3.1415927
    //   917: fmul
    //   918: fconst_2
    //   919: fmul
    //   920: fstore #17
    //   922: ldc 10.0
    //   924: fstore #11
    //   926: ldc_w 60.0
    //   929: fstore #18
    //   931: fconst_0
    //   932: fstore #12
    //   934: aload #8
    //   936: bipush #11
    //   938: aload_0
    //   939: getfield FWm : F
    //   942: invokevirtual Dne : (IF)[D
    //   945: astore #14
    //   947: iconst_0
    //   948: istore #22
    //   950: iload #22
    //   952: bipush #12
    //   954: if_icmpge -> 1221
    //   957: aload #8
    //   959: bipush #12
    //   961: iload #22
    //   963: iadd
    //   964: aload_0
    //   965: getfield FWm : F
    //   968: invokevirtual Dne : (IF)[D
    //   971: astore #20
    //   973: fload #21
    //   975: f2d
    //   976: iload #22
    //   978: i2f
    //   979: ldc 0.45
    //   981: fmul
    //   982: fload #17
    //   984: fadd
    //   985: f2d
    //   986: invokestatic sin : (D)D
    //   989: ldc2_w 0.05000000074505806
    //   992: dmul
    //   993: dadd
    //   994: d2f
    //   995: fstore #21
    //   997: aload_0
    //   998: getfield FWm : LrxL;
    //   1001: aload_0
    //   1002: aload #20
    //   1004: iconst_0
    //   1005: daload
    //   1006: aload #14
    //   1008: iconst_0
    //   1009: daload
    //   1010: dsub
    //   1011: invokespecial Dne : (D)F
    //   1014: fload #13
    //   1016: fmul
    //   1017: ldc 180.0
    //   1019: fadd
    //   1020: ldc 3.1415927
    //   1022: fmul
    //   1023: ldc 180.0
    //   1025: fdiv
    //   1026: putfield DyG : F
    //   1029: aload_0
    //   1030: getfield FWm : LrxL;
    //   1033: fload #21
    //   1035: aload #20
    //   1037: iconst_1
    //   1038: daload
    //   1039: aload #14
    //   1041: iconst_1
    //   1042: daload
    //   1043: dsub
    //   1044: d2f
    //   1045: ldc 3.1415927
    //   1047: fmul
    //   1048: ldc 180.0
    //   1050: fdiv
    //   1051: fload #13
    //   1053: fmul
    //   1054: ldc 5.0
    //   1056: fmul
    //   1057: fadd
    //   1058: putfield zGp : F
    //   1061: aload_0
    //   1062: getfield FWm : LrxL;
    //   1065: aload_0
    //   1066: aload #20
    //   1068: iconst_0
    //   1069: daload
    //   1070: fload #16
    //   1072: f2d
    //   1073: dsub
    //   1074: invokespecial Dne : (D)F
    //   1077: ldc 3.1415927
    //   1079: fmul
    //   1080: ldc 180.0
    //   1082: fdiv
    //   1083: fload #13
    //   1085: fmul
    //   1086: putfield div : F
    //   1089: aload_0
    //   1090: getfield FWm : LrxL;
    //   1093: fload #11
    //   1095: putfield Qnq : F
    //   1098: aload_0
    //   1099: getfield FWm : LrxL;
    //   1102: fload #18
    //   1104: putfield aFZ : F
    //   1107: aload_0
    //   1108: getfield FWm : LrxL;
    //   1111: fload #12
    //   1113: putfield bzF : F
    //   1116: fload #11
    //   1118: f2d
    //   1119: aload_0
    //   1120: getfield FWm : LrxL;
    //   1123: getfield zGp : F
    //   1126: f2d
    //   1127: invokestatic sin : (D)D
    //   1130: ldc2_w 10.0
    //   1133: dmul
    //   1134: dadd
    //   1135: d2f
    //   1136: fstore #11
    //   1138: fload #18
    //   1140: f2d
    //   1141: aload_0
    //   1142: getfield FWm : LrxL;
    //   1145: getfield DyG : F
    //   1148: f2d
    //   1149: invokestatic cos : (D)D
    //   1152: aload_0
    //   1153: getfield FWm : LrxL;
    //   1156: getfield zGp : F
    //   1159: f2d
    //   1160: invokestatic cos : (D)D
    //   1163: dmul
    //   1164: ldc2_w 10.0
    //   1167: dmul
    //   1168: dsub
    //   1169: d2f
    //   1170: fstore #18
    //   1172: fload #12
    //   1174: f2d
    //   1175: aload_0
    //   1176: getfield FWm : LrxL;
    //   1179: getfield DyG : F
    //   1182: f2d
    //   1183: invokestatic sin : (D)D
    //   1186: aload_0
    //   1187: getfield FWm : LrxL;
    //   1190: getfield zGp : F
    //   1193: f2d
    //   1194: invokestatic cos : (D)D
    //   1197: dmul
    //   1198: ldc2_w 10.0
    //   1201: dmul
    //   1202: dsub
    //   1203: d2f
    //   1204: fstore #12
    //   1206: aload_0
    //   1207: getfield FWm : LrxL;
    //   1210: fload #7
    //   1212: invokevirtual Dne : (F)V
    //   1215: iinc #22, 1
    //   1218: goto -> 950
    //   1221: invokestatic glPopMatrix : ()V
    //   1224: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Drf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */