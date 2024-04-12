import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class phC {
  public int IjH = 0;
  
  public double bzF;
  
  public int zGp;
  
  private double Qnq;
  
  public int Dne;
  
  public Set Dne;
  
  public boolean Dne;
  
  public int aFZ;
  
  public int bzF;
  
  public int DyG;
  
  private int mrb = 0;
  
  public double FWm;
  
  public int Qnq;
  
  private boolean Qnq = false;
  
  private boolean bzF;
  
  public sMa Dne;
  
  public double Dne = false;
  
  public int FWm;
  
  private boolean FWm;
  
  public int div;
  
  private double aFZ;
  
  private double zGp;
  
  private sMa FWm = false;
  
  public phC(sMa paramsMa, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.Dne = new HashSet();
    this.Dne = paramsMa;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramBoolean;
    this.bzF = geR.FWm(paramsMa.div * 32.0D);
    this.Qnq = geR.FWm(paramsMa.IjH * 32.0D);
    this.aFZ = geR.FWm(paramsMa.mrb * 32.0D);
    this.zGp = geR.Dne(paramsMa.mrb * 256.0F / 360.0F);
    this.DyG = geR.Dne(paramsMa.XHL * 256.0F / 360.0F);
    this.div = geR.Dne(paramsMa.aFZ() * 256.0F / 360.0F);
  }
  
  public void Dne(PJQ paramPJQ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Set;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifeq -> 44
    //   13: aload_1
    //   14: getfield FWm : Ljava/util/List;
    //   17: aload_0
    //   18: getfield Dne : LsMa;
    //   21: getfield aFZ : I
    //   24: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   27: invokeinterface add : (Ljava/lang/Object;)Z
    //   32: pop
    //   33: aload_0
    //   34: getfield Dne : Ljava/util/Set;
    //   37: aload_1
    //   38: invokeinterface remove : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: return
  }
  
  public void FWm(NER paramNER) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Dne : (LNER;)V
    //   5: aload_0
    //   6: getfield Dne : LsMa;
    //   9: instanceof PJQ
    //   12: ifeq -> 29
    //   15: aload_0
    //   16: getfield Dne : LsMa;
    //   19: checkcast PJQ
    //   22: getfield Dne : LTnv;
    //   25: aload_1
    //   26: invokevirtual Dne : (LNER;)V
    //   29: return
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof phC) ? ((((phC)paramObject).Dne.aFZ == this.Dne.aFZ)) : false;
  }
  
  public void FWm(List<PJQ> paramList) {
    for (byte b = 0; b < paramList.size(); b++)
      FWm(paramList.get(b)); 
  }
  
  public void FWm(PJQ paramPJQ) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield Dne : LsMa;
    //   5: if_acmpeq -> 576
    //   8: aload_1
    //   9: getfield div : D
    //   12: aload_0
    //   13: getfield bzF : I
    //   16: bipush #32
    //   18: idiv
    //   19: i2d
    //   20: dsub
    //   21: dstore_2
    //   22: aload_1
    //   23: getfield mrb : D
    //   26: aload_0
    //   27: getfield aFZ : I
    //   30: bipush #32
    //   32: idiv
    //   33: i2d
    //   34: dsub
    //   35: dstore #4
    //   37: dload_2
    //   38: aload_0
    //   39: getfield Dne : I
    //   42: ineg
    //   43: i2d
    //   44: dcmpl
    //   45: iflt -> 532
    //   48: dload_2
    //   49: aload_0
    //   50: getfield Dne : I
    //   53: i2d
    //   54: dcmpg
    //   55: ifgt -> 532
    //   58: dload #4
    //   60: aload_0
    //   61: getfield Dne : I
    //   64: ineg
    //   65: i2d
    //   66: dcmpl
    //   67: iflt -> 532
    //   70: dload #4
    //   72: aload_0
    //   73: getfield Dne : I
    //   76: i2d
    //   77: dcmpg
    //   78: ifgt -> 532
    //   81: aload_0
    //   82: getfield Dne : Ljava/util/Set;
    //   85: aload_1
    //   86: invokeinterface contains : (Ljava/lang/Object;)Z
    //   91: ifne -> 576
    //   94: aload_0
    //   95: aload_1
    //   96: invokespecial Dne : (LPJQ;)Z
    //   99: ifne -> 112
    //   102: aload_0
    //   103: getfield Dne : LsMa;
    //   106: getfield Qnq : Z
    //   109: ifeq -> 576
    //   112: aload_0
    //   113: getfield Dne : Ljava/util/Set;
    //   116: aload_1
    //   117: invokeinterface add : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: aload_0
    //   124: invokespecial Dne : ()LNER;
    //   127: astore #6
    //   129: aload_1
    //   130: getfield Dne : LTnv;
    //   133: aload #6
    //   135: invokevirtual Dne : (LNER;)V
    //   138: aload_0
    //   139: getfield Dne : LsMa;
    //   142: invokevirtual Dne : ()LluM;
    //   145: invokevirtual FWm : ()Z
    //   148: ifne -> 180
    //   151: aload_1
    //   152: getfield Dne : LTnv;
    //   155: new SnO
    //   158: dup
    //   159: aload_0
    //   160: getfield Dne : LsMa;
    //   163: getfield aFZ : I
    //   166: aload_0
    //   167: getfield Dne : LsMa;
    //   170: invokevirtual Dne : ()LluM;
    //   173: iconst_1
    //   174: invokespecial <init> : (ILluM;Z)V
    //   177: invokevirtual Dne : (LNER;)V
    //   180: aload_0
    //   181: aload_0
    //   182: getfield Dne : LsMa;
    //   185: getfield XHL : D
    //   188: putfield Dne : D
    //   191: aload_0
    //   192: aload_0
    //   193: getfield Dne : LsMa;
    //   196: getfield Zpi : D
    //   199: putfield FWm : D
    //   202: aload_0
    //   203: aload_0
    //   204: getfield Dne : LsMa;
    //   207: getfield kGO : D
    //   210: putfield bzF : D
    //   213: aload_0
    //   214: getfield bzF : Z
    //   217: ifeq -> 270
    //   220: aload #6
    //   222: instanceof QZR
    //   225: ifne -> 270
    //   228: aload_1
    //   229: getfield Dne : LTnv;
    //   232: new wFl
    //   235: dup
    //   236: aload_0
    //   237: getfield Dne : LsMa;
    //   240: getfield aFZ : I
    //   243: aload_0
    //   244: getfield Dne : LsMa;
    //   247: getfield XHL : D
    //   250: aload_0
    //   251: getfield Dne : LsMa;
    //   254: getfield Zpi : D
    //   257: aload_0
    //   258: getfield Dne : LsMa;
    //   261: getfield kGO : D
    //   264: invokespecial <init> : (IDDD)V
    //   267: invokevirtual Dne : (LNER;)V
    //   270: aload_0
    //   271: getfield Dne : LsMa;
    //   274: getfield FWm : LsMa;
    //   277: ifnull -> 305
    //   280: aload_1
    //   281: getfield Dne : LTnv;
    //   284: new YVz
    //   287: dup
    //   288: aload_0
    //   289: getfield Dne : LsMa;
    //   292: aload_0
    //   293: getfield Dne : LsMa;
    //   296: getfield FWm : LsMa;
    //   299: invokespecial <init> : (LsMa;LsMa;)V
    //   302: invokevirtual Dne : (LNER;)V
    //   305: aload_0
    //   306: getfield Dne : LsMa;
    //   309: instanceof FUH
    //   312: ifeq -> 374
    //   315: iconst_0
    //   316: istore #7
    //   318: iload #7
    //   320: iconst_5
    //   321: if_icmpge -> 374
    //   324: aload_0
    //   325: getfield Dne : LsMa;
    //   328: checkcast FUH
    //   331: iload #7
    //   333: invokevirtual Dne : (I)LNMq;
    //   336: astore #8
    //   338: aload #8
    //   340: ifnull -> 368
    //   343: aload_1
    //   344: getfield Dne : LTnv;
    //   347: new qHm
    //   350: dup
    //   351: aload_0
    //   352: getfield Dne : LsMa;
    //   355: getfield aFZ : I
    //   358: iload #7
    //   360: aload #8
    //   362: invokespecial <init> : (IILNMq;)V
    //   365: invokevirtual Dne : (LNER;)V
    //   368: iinc #7, 1
    //   371: goto -> 318
    //   374: aload_0
    //   375: getfield Dne : LsMa;
    //   378: instanceof FiG
    //   381: ifeq -> 450
    //   384: aload_0
    //   385: getfield Dne : LsMa;
    //   388: checkcast FiG
    //   391: astore #7
    //   393: aload #7
    //   395: invokevirtual Wwe : ()Z
    //   398: ifeq -> 450
    //   401: aload_1
    //   402: getfield Dne : LTnv;
    //   405: new kwp
    //   408: dup
    //   409: aload_0
    //   410: getfield Dne : LsMa;
    //   413: iconst_0
    //   414: aload_0
    //   415: getfield Dne : LsMa;
    //   418: getfield div : D
    //   421: invokestatic FWm : (D)I
    //   424: aload_0
    //   425: getfield Dne : LsMa;
    //   428: getfield IjH : D
    //   431: invokestatic FWm : (D)I
    //   434: aload_0
    //   435: getfield Dne : LsMa;
    //   438: getfield mrb : D
    //   441: invokestatic FWm : (D)I
    //   444: invokespecial <init> : (LsMa;IIII)V
    //   447: invokevirtual Dne : (LNER;)V
    //   450: aload_0
    //   451: getfield Dne : LsMa;
    //   454: instanceof FUH
    //   457: ifeq -> 529
    //   460: aload_0
    //   461: getfield Dne : LsMa;
    //   464: checkcast FUH
    //   467: astore #7
    //   469: aload #7
    //   471: invokevirtual Dne : ()Ljava/util/Collection;
    //   474: invokeinterface iterator : ()Ljava/util/Iterator;
    //   479: astore #8
    //   481: aload #8
    //   483: invokeinterface hasNext : ()Z
    //   488: ifeq -> 529
    //   491: aload #8
    //   493: invokeinterface next : ()Ljava/lang/Object;
    //   498: checkcast NAx
    //   501: astore #9
    //   503: aload_1
    //   504: getfield Dne : LTnv;
    //   507: new ziQ
    //   510: dup
    //   511: aload_0
    //   512: getfield Dne : LsMa;
    //   515: getfield aFZ : I
    //   518: aload #9
    //   520: invokespecial <init> : (ILNAx;)V
    //   523: invokevirtual Dne : (LNER;)V
    //   526: goto -> 481
    //   529: goto -> 576
    //   532: aload_0
    //   533: getfield Dne : Ljava/util/Set;
    //   536: aload_1
    //   537: invokeinterface contains : (Ljava/lang/Object;)Z
    //   542: ifeq -> 576
    //   545: aload_0
    //   546: getfield Dne : Ljava/util/Set;
    //   549: aload_1
    //   550: invokeinterface remove : (Ljava/lang/Object;)Z
    //   555: pop
    //   556: aload_1
    //   557: getfield FWm : Ljava/util/List;
    //   560: aload_0
    //   561: getfield Dne : LsMa;
    //   564: getfield aFZ : I
    //   567: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   570: invokeinterface add : (Ljava/lang/Object;)Z
    //   575: pop
    //   576: return
  }
  
  private boolean Dne(PJQ paramPJQ) {
    return paramPJQ.Dne().Dne().Dne(paramPJQ, this.Dne.IjH, this.Dne.XHL);
  }
  
  private NER Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LsMa;
    //   4: getfield Zpi : Z
    //   7: ifeq -> 28
    //   10: aload_0
    //   11: getfield Dne : LsMa;
    //   14: getfield Dne : LQnq;
    //   17: invokevirtual Dne : ()LdLs;
    //   20: ldc_w 'Fetching addPacket for removed entity'
    //   23: invokeinterface FWm : (Ljava/lang/String;)V
    //   28: aload_0
    //   29: getfield Dne : LsMa;
    //   32: instanceof JiM
    //   35: ifeq -> 52
    //   38: new wXa
    //   41: dup
    //   42: aload_0
    //   43: getfield Dne : LsMa;
    //   46: iconst_2
    //   47: iconst_1
    //   48: invokespecial <init> : (LsMa;II)V
    //   51: areturn
    //   52: aload_0
    //   53: getfield Dne : LsMa;
    //   56: instanceof PJQ
    //   59: ifeq -> 77
    //   62: new MwE
    //   65: dup
    //   66: aload_0
    //   67: getfield Dne : LsMa;
    //   70: checkcast FiG
    //   73: invokespecial <init> : (LFiG;)V
    //   76: areturn
    //   77: aload_0
    //   78: getfield Dne : LsMa;
    //   81: instanceof Ebp
    //   84: ifeq -> 113
    //   87: aload_0
    //   88: getfield Dne : LsMa;
    //   91: checkcast Ebp
    //   94: astore_1
    //   95: new wXa
    //   98: dup
    //   99: aload_0
    //   100: getfield Dne : LsMa;
    //   103: bipush #10
    //   105: aload_1
    //   106: invokevirtual XHL : ()I
    //   109: invokespecial <init> : (LsMa;II)V
    //   112: areturn
    //   113: aload_0
    //   114: getfield Dne : LsMa;
    //   117: instanceof iMX
    //   120: ifeq -> 136
    //   123: new wXa
    //   126: dup
    //   127: aload_0
    //   128: getfield Dne : LsMa;
    //   131: iconst_1
    //   132: invokespecial <init> : (LsMa;I)V
    //   135: areturn
    //   136: aload_0
    //   137: getfield Dne : LsMa;
    //   140: instanceof NbA
    //   143: ifne -> 848
    //   146: aload_0
    //   147: getfield Dne : LsMa;
    //   150: instanceof WSC
    //   153: ifne -> 848
    //   156: aload_0
    //   157: getfield Dne : LsMa;
    //   160: instanceof cQz
    //   163: ifeq -> 209
    //   166: aload_0
    //   167: getfield Dne : LsMa;
    //   170: checkcast cQz
    //   173: getfield Dne : LFiG;
    //   176: astore_1
    //   177: new wXa
    //   180: dup
    //   181: aload_0
    //   182: getfield Dne : LsMa;
    //   185: bipush #90
    //   187: aload_1
    //   188: ifnull -> 198
    //   191: aload_1
    //   192: getfield aFZ : I
    //   195: goto -> 205
    //   198: aload_0
    //   199: getfield Dne : LsMa;
    //   202: getfield aFZ : I
    //   205: invokespecial <init> : (LsMa;II)V
    //   208: areturn
    //   209: aload_0
    //   210: getfield Dne : LsMa;
    //   213: instanceof hhc
    //   216: ifeq -> 262
    //   219: aload_0
    //   220: getfield Dne : LsMa;
    //   223: checkcast hhc
    //   226: getfield bzF : LsMa;
    //   229: astore_1
    //   230: new wXa
    //   233: dup
    //   234: aload_0
    //   235: getfield Dne : LsMa;
    //   238: bipush #60
    //   240: aload_1
    //   241: ifnull -> 251
    //   244: aload_1
    //   245: getfield aFZ : I
    //   248: goto -> 258
    //   251: aload_0
    //   252: getfield Dne : LsMa;
    //   255: getfield aFZ : I
    //   258: invokespecial <init> : (LsMa;II)V
    //   261: areturn
    //   262: aload_0
    //   263: getfield Dne : LsMa;
    //   266: instanceof KXX
    //   269: ifeq -> 286
    //   272: new wXa
    //   275: dup
    //   276: aload_0
    //   277: getfield Dne : LsMa;
    //   280: bipush #61
    //   282: invokespecial <init> : (LsMa;I)V
    //   285: areturn
    //   286: aload_0
    //   287: getfield Dne : LsMa;
    //   290: instanceof YgL
    //   293: ifeq -> 320
    //   296: new wXa
    //   299: dup
    //   300: aload_0
    //   301: getfield Dne : LsMa;
    //   304: bipush #73
    //   306: aload_0
    //   307: getfield Dne : LsMa;
    //   310: checkcast YgL
    //   313: invokevirtual Dne : ()I
    //   316: invokespecial <init> : (LsMa;II)V
    //   319: areturn
    //   320: aload_0
    //   321: getfield Dne : LsMa;
    //   324: instanceof AEw
    //   327: ifeq -> 344
    //   330: new wXa
    //   333: dup
    //   334: aload_0
    //   335: getfield Dne : LsMa;
    //   338: bipush #75
    //   340: invokespecial <init> : (LsMa;I)V
    //   343: areturn
    //   344: aload_0
    //   345: getfield Dne : LsMa;
    //   348: instanceof Hhj
    //   351: ifeq -> 368
    //   354: new wXa
    //   357: dup
    //   358: aload_0
    //   359: getfield Dne : LsMa;
    //   362: bipush #65
    //   364: invokespecial <init> : (LsMa;I)V
    //   367: areturn
    //   368: aload_0
    //   369: getfield Dne : LsMa;
    //   372: instanceof UMP
    //   375: ifeq -> 392
    //   378: new wXa
    //   381: dup
    //   382: aload_0
    //   383: getfield Dne : LsMa;
    //   386: bipush #72
    //   388: invokespecial <init> : (LsMa;I)V
    //   391: areturn
    //   392: aload_0
    //   393: getfield Dne : LsMa;
    //   396: instanceof zMx
    //   399: ifeq -> 416
    //   402: new wXa
    //   405: dup
    //   406: aload_0
    //   407: getfield Dne : LsMa;
    //   410: bipush #76
    //   412: invokespecial <init> : (LsMa;I)V
    //   415: areturn
    //   416: aload_0
    //   417: getfield Dne : LsMa;
    //   420: instanceof Tdr
    //   423: ifeq -> 559
    //   426: aload_0
    //   427: getfield Dne : LsMa;
    //   430: checkcast Tdr
    //   433: astore_2
    //   434: aconst_null
    //   435: astore_1
    //   436: bipush #63
    //   438: istore_3
    //   439: aload_0
    //   440: getfield Dne : LsMa;
    //   443: instanceof Xzh
    //   446: ifeq -> 455
    //   449: bipush #64
    //   451: istore_3
    //   452: goto -> 468
    //   455: aload_0
    //   456: getfield Dne : LsMa;
    //   459: instanceof YCH
    //   462: ifeq -> 468
    //   465: bipush #66
    //   467: istore_3
    //   468: aload_2
    //   469: getfield Dne : LFUH;
    //   472: ifnull -> 504
    //   475: new wXa
    //   478: dup
    //   479: aload_0
    //   480: getfield Dne : LsMa;
    //   483: iload_3
    //   484: aload_0
    //   485: getfield Dne : LsMa;
    //   488: checkcast Tdr
    //   491: getfield Dne : LFUH;
    //   494: getfield aFZ : I
    //   497: invokespecial <init> : (LsMa;II)V
    //   500: astore_1
    //   501: goto -> 518
    //   504: new wXa
    //   507: dup
    //   508: aload_0
    //   509: getfield Dne : LsMa;
    //   512: iload_3
    //   513: iconst_0
    //   514: invokespecial <init> : (LsMa;II)V
    //   517: astore_1
    //   518: aload_1
    //   519: aload_2
    //   520: getfield Dne : D
    //   523: ldc2_w 8000.0
    //   526: dmul
    //   527: d2i
    //   528: putfield aFZ : I
    //   531: aload_1
    //   532: aload_2
    //   533: getfield FWm : D
    //   536: ldc2_w 8000.0
    //   539: dmul
    //   540: d2i
    //   541: putfield zGp : I
    //   544: aload_1
    //   545: aload_2
    //   546: getfield bzF : D
    //   549: ldc2_w 8000.0
    //   552: dmul
    //   553: d2i
    //   554: putfield DyG : I
    //   557: aload_1
    //   558: areturn
    //   559: aload_0
    //   560: getfield Dne : LsMa;
    //   563: instanceof TCA
    //   566: ifeq -> 583
    //   569: new wXa
    //   572: dup
    //   573: aload_0
    //   574: getfield Dne : LsMa;
    //   577: bipush #62
    //   579: invokespecial <init> : (LsMa;I)V
    //   582: areturn
    //   583: aload_0
    //   584: getfield Dne : LsMa;
    //   587: instanceof gqg
    //   590: ifeq -> 607
    //   593: new wXa
    //   596: dup
    //   597: aload_0
    //   598: getfield Dne : LsMa;
    //   601: bipush #50
    //   603: invokespecial <init> : (LsMa;I)V
    //   606: areturn
    //   607: aload_0
    //   608: getfield Dne : LsMa;
    //   611: instanceof Ndk
    //   614: ifeq -> 631
    //   617: new wXa
    //   620: dup
    //   621: aload_0
    //   622: getfield Dne : LsMa;
    //   625: bipush #51
    //   627: invokespecial <init> : (LsMa;I)V
    //   630: areturn
    //   631: aload_0
    //   632: getfield Dne : LsMa;
    //   635: instanceof CiF
    //   638: ifeq -> 675
    //   641: aload_0
    //   642: getfield Dne : LsMa;
    //   645: checkcast CiF
    //   648: astore_2
    //   649: new wXa
    //   652: dup
    //   653: aload_0
    //   654: getfield Dne : LsMa;
    //   657: bipush #70
    //   659: aload_2
    //   660: getfield Dne : I
    //   663: aload_2
    //   664: getfield FWm : I
    //   667: bipush #16
    //   669: ishl
    //   670: ior
    //   671: invokespecial <init> : (LsMa;II)V
    //   674: areturn
    //   675: aload_0
    //   676: getfield Dne : LsMa;
    //   679: instanceof JCd
    //   682: ifeq -> 700
    //   685: new bia
    //   688: dup
    //   689: aload_0
    //   690: getfield Dne : LsMa;
    //   693: checkcast JCd
    //   696: invokespecial <init> : (LJCd;)V
    //   699: areturn
    //   700: aload_0
    //   701: getfield Dne : LsMa;
    //   704: instanceof BPY
    //   707: ifeq -> 783
    //   710: aload_0
    //   711: getfield Dne : LsMa;
    //   714: checkcast BPY
    //   717: astore_2
    //   718: new wXa
    //   721: dup
    //   722: aload_0
    //   723: getfield Dne : LsMa;
    //   726: bipush #71
    //   728: aload_2
    //   729: getfield Dne : I
    //   732: invokespecial <init> : (LsMa;II)V
    //   735: astore_1
    //   736: aload_1
    //   737: aload_2
    //   738: getfield FWm : I
    //   741: bipush #32
    //   743: imul
    //   744: i2f
    //   745: invokestatic Dne : (F)I
    //   748: putfield FWm : I
    //   751: aload_1
    //   752: aload_2
    //   753: getfield bzF : I
    //   756: bipush #32
    //   758: imul
    //   759: i2f
    //   760: invokestatic Dne : (F)I
    //   763: putfield bzF : I
    //   766: aload_1
    //   767: aload_2
    //   768: getfield Qnq : I
    //   771: bipush #32
    //   773: imul
    //   774: i2f
    //   775: invokestatic Dne : (F)I
    //   778: putfield Qnq : I
    //   781: aload_1
    //   782: areturn
    //   783: aload_0
    //   784: getfield Dne : LsMa;
    //   787: instanceof alg
    //   790: ifeq -> 808
    //   793: new mPe
    //   796: dup
    //   797: aload_0
    //   798: getfield Dne : LsMa;
    //   801: checkcast alg
    //   804: invokespecial <init> : (Lalg;)V
    //   807: areturn
    //   808: new java/lang/IllegalArgumentException
    //   811: dup
    //   812: new java/lang/StringBuilder
    //   815: dup
    //   816: invokespecial <init> : ()V
    //   819: ldc_w 'Don't know how to add '
    //   822: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   825: aload_0
    //   826: getfield Dne : LsMa;
    //   829: invokevirtual getClass : ()Ljava/lang/Class;
    //   832: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   835: ldc_w '!'
    //   838: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: invokevirtual toString : ()Ljava/lang/String;
    //   844: invokespecial <init> : (Ljava/lang/String;)V
    //   847: athrow
    //   848: aload_0
    //   849: aload_0
    //   850: getfield Dne : LsMa;
    //   853: invokevirtual aFZ : ()F
    //   856: ldc 256.0
    //   858: fmul
    //   859: ldc 360.0
    //   861: fdiv
    //   862: invokestatic Dne : (F)I
    //   865: putfield div : I
    //   868: new QZR
    //   871: dup
    //   872: aload_0
    //   873: getfield Dne : LsMa;
    //   876: checkcast FUH
    //   879: invokespecial <init> : (LFUH;)V
    //   882: areturn
  }
  
  public void Dne(List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield Dne : Z
    //   5: aload_0
    //   6: getfield FWm : Z
    //   9: ifeq -> 38
    //   12: aload_0
    //   13: getfield Dne : LsMa;
    //   16: aload_0
    //   17: getfield Qnq : D
    //   20: aload_0
    //   21: getfield aFZ : D
    //   24: aload_0
    //   25: getfield zGp : D
    //   28: invokevirtual Dne : (DDD)D
    //   31: ldc2_w 16.0
    //   34: dcmpl
    //   35: ifle -> 86
    //   38: aload_0
    //   39: aload_0
    //   40: getfield Dne : LsMa;
    //   43: getfield div : D
    //   46: putfield Qnq : D
    //   49: aload_0
    //   50: aload_0
    //   51: getfield Dne : LsMa;
    //   54: getfield IjH : D
    //   57: putfield aFZ : D
    //   60: aload_0
    //   61: aload_0
    //   62: getfield Dne : LsMa;
    //   65: getfield mrb : D
    //   68: putfield zGp : D
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield FWm : Z
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield Dne : Z
    //   81: aload_0
    //   82: aload_1
    //   83: invokevirtual FWm : (Ljava/util/List;)V
    //   86: aload_0
    //   87: getfield FWm : LsMa;
    //   90: aload_0
    //   91: getfield Dne : LsMa;
    //   94: getfield FWm : LsMa;
    //   97: if_acmpne -> 120
    //   100: aload_0
    //   101: getfield Dne : LsMa;
    //   104: getfield FWm : LsMa;
    //   107: ifnull -> 153
    //   110: aload_0
    //   111: getfield IjH : I
    //   114: bipush #60
    //   116: irem
    //   117: ifne -> 153
    //   120: aload_0
    //   121: aload_0
    //   122: getfield Dne : LsMa;
    //   125: getfield FWm : LsMa;
    //   128: putfield FWm : LsMa;
    //   131: aload_0
    //   132: new YVz
    //   135: dup
    //   136: aload_0
    //   137: getfield Dne : LsMa;
    //   140: aload_0
    //   141: getfield Dne : LsMa;
    //   144: getfield FWm : LsMa;
    //   147: invokespecial <init> : (LsMa;LsMa;)V
    //   150: invokevirtual Dne : (LNER;)V
    //   153: aload_0
    //   154: getfield Dne : LsMa;
    //   157: instanceof BPY
    //   160: ifeq -> 350
    //   163: aload_0
    //   164: getfield IjH : I
    //   167: bipush #10
    //   169: irem
    //   170: ifne -> 350
    //   173: aload_0
    //   174: getfield Dne : LsMa;
    //   177: checkcast BPY
    //   180: astore_2
    //   181: aload_2
    //   182: invokevirtual Dne : ()LNMq;
    //   185: astore_3
    //   186: aload_3
    //   187: ifnull -> 309
    //   190: aload_3
    //   191: invokevirtual Dne : ()LdEr;
    //   194: instanceof mva
    //   197: ifeq -> 309
    //   200: getstatic dEr.Dne : Lmva;
    //   203: aload_3
    //   204: aload_0
    //   205: getfield Dne : LsMa;
    //   208: getfield Dne : LQnq;
    //   211: invokevirtual Dne : (LNMq;LQnq;)LIlk;
    //   214: astore #4
    //   216: aload_1
    //   217: invokeinterface iterator : ()Ljava/util/Iterator;
    //   222: astore #5
    //   224: aload #5
    //   226: invokeinterface hasNext : ()Z
    //   231: ifeq -> 309
    //   234: aload #5
    //   236: invokeinterface next : ()Ljava/lang/Object;
    //   241: checkcast FiG
    //   244: astore #6
    //   246: aload #6
    //   248: checkcast PJQ
    //   251: astore #7
    //   253: aload #4
    //   255: aload #7
    //   257: aload_3
    //   258: invokevirtual Dne : (LFiG;LNMq;)V
    //   261: aload #7
    //   263: getfield Dne : LTnv;
    //   266: invokevirtual Dne : ()I
    //   269: iconst_5
    //   270: if_icmpgt -> 306
    //   273: getstatic dEr.Dne : Lmva;
    //   276: aload_3
    //   277: aload_0
    //   278: getfield Dne : LsMa;
    //   281: getfield Dne : LQnq;
    //   284: aload #7
    //   286: invokevirtual Dne : (LNMq;LQnq;LFiG;)LNER;
    //   289: astore #8
    //   291: aload #8
    //   293: ifnull -> 306
    //   296: aload #7
    //   298: getfield Dne : LTnv;
    //   301: aload #8
    //   303: invokevirtual Dne : (LNER;)V
    //   306: goto -> 224
    //   309: aload_0
    //   310: getfield Dne : LsMa;
    //   313: invokevirtual Dne : ()LluM;
    //   316: astore #4
    //   318: aload #4
    //   320: invokevirtual Dne : ()Z
    //   323: ifeq -> 347
    //   326: aload_0
    //   327: new SnO
    //   330: dup
    //   331: aload_0
    //   332: getfield Dne : LsMa;
    //   335: getfield aFZ : I
    //   338: aload #4
    //   340: iconst_0
    //   341: invokespecial <init> : (ILluM;Z)V
    //   344: invokevirtual FWm : (LNER;)V
    //   347: goto -> 1375
    //   350: aload_0
    //   351: getfield IjH : I
    //   354: aload_0
    //   355: getfield FWm : I
    //   358: irem
    //   359: ifeq -> 385
    //   362: aload_0
    //   363: getfield Dne : LsMa;
    //   366: getfield ATE : Z
    //   369: ifne -> 385
    //   372: aload_0
    //   373: getfield Dne : LsMa;
    //   376: invokevirtual Dne : ()LluM;
    //   379: invokevirtual Dne : ()Z
    //   382: ifeq -> 1375
    //   385: aload_0
    //   386: getfield Dne : LsMa;
    //   389: getfield FWm : LsMa;
    //   392: ifnonnull -> 1105
    //   395: aload_0
    //   396: dup
    //   397: getfield mrb : I
    //   400: iconst_1
    //   401: iadd
    //   402: putfield mrb : I
    //   405: aload_0
    //   406: getfield Dne : LsMa;
    //   409: getfield Dne : LbfY;
    //   412: aload_0
    //   413: getfield Dne : LsMa;
    //   416: getfield div : D
    //   419: invokevirtual Dne : (D)I
    //   422: istore_2
    //   423: aload_0
    //   424: getfield Dne : LsMa;
    //   427: getfield IjH : D
    //   430: ldc2_w 32.0
    //   433: dmul
    //   434: invokestatic FWm : (D)I
    //   437: istore_3
    //   438: aload_0
    //   439: getfield Dne : LsMa;
    //   442: getfield Dne : LbfY;
    //   445: aload_0
    //   446: getfield Dne : LsMa;
    //   449: getfield mrb : D
    //   452: invokevirtual Dne : (D)I
    //   455: istore #4
    //   457: aload_0
    //   458: getfield Dne : LsMa;
    //   461: getfield mrb : F
    //   464: ldc 256.0
    //   466: fmul
    //   467: ldc 360.0
    //   469: fdiv
    //   470: invokestatic Dne : (F)I
    //   473: istore #5
    //   475: aload_0
    //   476: getfield Dne : LsMa;
    //   479: getfield XHL : F
    //   482: ldc 256.0
    //   484: fmul
    //   485: ldc 360.0
    //   487: fdiv
    //   488: invokestatic Dne : (F)I
    //   491: istore #6
    //   493: iload_2
    //   494: aload_0
    //   495: getfield bzF : I
    //   498: isub
    //   499: istore #7
    //   501: iload_3
    //   502: aload_0
    //   503: getfield Qnq : I
    //   506: isub
    //   507: istore #8
    //   509: iload #4
    //   511: aload_0
    //   512: getfield aFZ : I
    //   515: isub
    //   516: istore #9
    //   518: aconst_null
    //   519: astore #10
    //   521: iload #7
    //   523: invokestatic abs : (I)I
    //   526: iconst_4
    //   527: if_icmpge -> 558
    //   530: iload #8
    //   532: invokestatic abs : (I)I
    //   535: iconst_4
    //   536: if_icmpge -> 558
    //   539: iload #9
    //   541: invokestatic abs : (I)I
    //   544: iconst_4
    //   545: if_icmpge -> 558
    //   548: aload_0
    //   549: getfield IjH : I
    //   552: bipush #60
    //   554: irem
    //   555: ifne -> 562
    //   558: iconst_1
    //   559: goto -> 563
    //   562: iconst_0
    //   563: istore #11
    //   565: iload #5
    //   567: aload_0
    //   568: getfield zGp : I
    //   571: isub
    //   572: invokestatic abs : (I)I
    //   575: iconst_4
    //   576: if_icmpge -> 593
    //   579: iload #6
    //   581: aload_0
    //   582: getfield DyG : I
    //   585: isub
    //   586: invokestatic abs : (I)I
    //   589: iconst_4
    //   590: if_icmplt -> 597
    //   593: iconst_1
    //   594: goto -> 598
    //   597: iconst_0
    //   598: istore #12
    //   600: aload_0
    //   601: getfield IjH : I
    //   604: ifgt -> 617
    //   607: aload_0
    //   608: getfield Dne : LsMa;
    //   611: instanceof hhc
    //   614: ifeq -> 817
    //   617: iload #7
    //   619: bipush #-128
    //   621: if_icmplt -> 786
    //   624: iload #7
    //   626: sipush #128
    //   629: if_icmpge -> 786
    //   632: iload #8
    //   634: bipush #-128
    //   636: if_icmplt -> 786
    //   639: iload #8
    //   641: sipush #128
    //   644: if_icmpge -> 786
    //   647: iload #9
    //   649: bipush #-128
    //   651: if_icmplt -> 786
    //   654: iload #9
    //   656: sipush #128
    //   659: if_icmpge -> 786
    //   662: aload_0
    //   663: getfield mrb : I
    //   666: sipush #400
    //   669: if_icmpgt -> 786
    //   672: aload_0
    //   673: getfield Qnq : Z
    //   676: ifne -> 786
    //   679: iload #11
    //   681: ifeq -> 723
    //   684: iload #12
    //   686: ifeq -> 723
    //   689: new DyR
    //   692: dup
    //   693: aload_0
    //   694: getfield Dne : LsMa;
    //   697: getfield aFZ : I
    //   700: iload #7
    //   702: i2b
    //   703: iload #8
    //   705: i2b
    //   706: iload #9
    //   708: i2b
    //   709: iload #5
    //   711: i2b
    //   712: iload #6
    //   714: i2b
    //   715: invokespecial <init> : (IBBBBB)V
    //   718: astore #10
    //   720: goto -> 817
    //   723: iload #11
    //   725: ifeq -> 756
    //   728: new GKq
    //   731: dup
    //   732: aload_0
    //   733: getfield Dne : LsMa;
    //   736: getfield aFZ : I
    //   739: iload #7
    //   741: i2b
    //   742: iload #8
    //   744: i2b
    //   745: iload #9
    //   747: i2b
    //   748: invokespecial <init> : (IBBB)V
    //   751: astore #10
    //   753: goto -> 817
    //   756: iload #12
    //   758: ifeq -> 817
    //   761: new wXr
    //   764: dup
    //   765: aload_0
    //   766: getfield Dne : LsMa;
    //   769: getfield aFZ : I
    //   772: iload #5
    //   774: i2b
    //   775: iload #6
    //   777: i2b
    //   778: invokespecial <init> : (IBB)V
    //   781: astore #10
    //   783: goto -> 817
    //   786: aload_0
    //   787: iconst_0
    //   788: putfield mrb : I
    //   791: new NVL
    //   794: dup
    //   795: aload_0
    //   796: getfield Dne : LsMa;
    //   799: getfield aFZ : I
    //   802: iload_2
    //   803: iload_3
    //   804: iload #4
    //   806: iload #5
    //   808: i2b
    //   809: iload #6
    //   811: i2b
    //   812: invokespecial <init> : (IIIIBB)V
    //   815: astore #10
    //   817: aload_0
    //   818: getfield bzF : Z
    //   821: ifeq -> 1007
    //   824: aload_0
    //   825: getfield Dne : LsMa;
    //   828: getfield XHL : D
    //   831: aload_0
    //   832: getfield Dne : D
    //   835: dsub
    //   836: dstore #13
    //   838: aload_0
    //   839: getfield Dne : LsMa;
    //   842: getfield Zpi : D
    //   845: aload_0
    //   846: getfield FWm : D
    //   849: dsub
    //   850: dstore #15
    //   852: aload_0
    //   853: getfield Dne : LsMa;
    //   856: getfield kGO : D
    //   859: aload_0
    //   860: getfield bzF : D
    //   863: dsub
    //   864: dstore #17
    //   866: ldc2_w 0.02
    //   869: dstore #19
    //   871: dload #13
    //   873: dload #13
    //   875: dmul
    //   876: dload #15
    //   878: dload #15
    //   880: dmul
    //   881: dadd
    //   882: dload #17
    //   884: dload #17
    //   886: dmul
    //   887: dadd
    //   888: dstore #21
    //   890: dload #21
    //   892: dload #19
    //   894: dload #19
    //   896: dmul
    //   897: dcmpl
    //   898: ifgt -> 944
    //   901: dload #21
    //   903: dconst_0
    //   904: dcmpl
    //   905: ifle -> 1007
    //   908: aload_0
    //   909: getfield Dne : LsMa;
    //   912: getfield XHL : D
    //   915: dconst_0
    //   916: dcmpl
    //   917: ifne -> 1007
    //   920: aload_0
    //   921: getfield Dne : LsMa;
    //   924: getfield Zpi : D
    //   927: dconst_0
    //   928: dcmpl
    //   929: ifne -> 1007
    //   932: aload_0
    //   933: getfield Dne : LsMa;
    //   936: getfield kGO : D
    //   939: dconst_0
    //   940: dcmpl
    //   941: ifne -> 1007
    //   944: aload_0
    //   945: aload_0
    //   946: getfield Dne : LsMa;
    //   949: getfield XHL : D
    //   952: putfield Dne : D
    //   955: aload_0
    //   956: aload_0
    //   957: getfield Dne : LsMa;
    //   960: getfield Zpi : D
    //   963: putfield FWm : D
    //   966: aload_0
    //   967: aload_0
    //   968: getfield Dne : LsMa;
    //   971: getfield kGO : D
    //   974: putfield bzF : D
    //   977: aload_0
    //   978: new wFl
    //   981: dup
    //   982: aload_0
    //   983: getfield Dne : LsMa;
    //   986: getfield aFZ : I
    //   989: aload_0
    //   990: getfield Dne : D
    //   993: aload_0
    //   994: getfield FWm : D
    //   997: aload_0
    //   998: getfield bzF : D
    //   1001: invokespecial <init> : (IDDD)V
    //   1004: invokevirtual Dne : (LNER;)V
    //   1007: aload #10
    //   1009: ifnull -> 1021
    //   1012: aload_0
    //   1013: aload #10
    //   1015: checkcast NER
    //   1018: invokevirtual Dne : (LNER;)V
    //   1021: aload_0
    //   1022: getfield Dne : LsMa;
    //   1025: invokevirtual Dne : ()LluM;
    //   1028: astore #13
    //   1030: aload #13
    //   1032: invokevirtual Dne : ()Z
    //   1035: ifeq -> 1059
    //   1038: aload_0
    //   1039: new SnO
    //   1042: dup
    //   1043: aload_0
    //   1044: getfield Dne : LsMa;
    //   1047: getfield aFZ : I
    //   1050: aload #13
    //   1052: iconst_0
    //   1053: invokespecial <init> : (ILluM;Z)V
    //   1056: invokevirtual FWm : (LNER;)V
    //   1059: iload #11
    //   1061: ifeq -> 1080
    //   1064: aload_0
    //   1065: iload_2
    //   1066: putfield bzF : I
    //   1069: aload_0
    //   1070: iload_3
    //   1071: putfield Qnq : I
    //   1074: aload_0
    //   1075: iload #4
    //   1077: putfield aFZ : I
    //   1080: iload #12
    //   1082: ifeq -> 1097
    //   1085: aload_0
    //   1086: iload #5
    //   1088: putfield zGp : I
    //   1091: aload_0
    //   1092: iload #6
    //   1094: putfield DyG : I
    //   1097: aload_0
    //   1098: iconst_0
    //   1099: putfield Qnq : Z
    //   1102: goto -> 1312
    //   1105: aload_0
    //   1106: getfield Dne : LsMa;
    //   1109: getfield mrb : F
    //   1112: ldc 256.0
    //   1114: fmul
    //   1115: ldc 360.0
    //   1117: fdiv
    //   1118: invokestatic Dne : (F)I
    //   1121: istore_2
    //   1122: aload_0
    //   1123: getfield Dne : LsMa;
    //   1126: getfield XHL : F
    //   1129: ldc 256.0
    //   1131: fmul
    //   1132: ldc 360.0
    //   1134: fdiv
    //   1135: invokestatic Dne : (F)I
    //   1138: istore_3
    //   1139: iload_2
    //   1140: aload_0
    //   1141: getfield zGp : I
    //   1144: isub
    //   1145: invokestatic abs : (I)I
    //   1148: iconst_4
    //   1149: if_icmpge -> 1165
    //   1152: iload_3
    //   1153: aload_0
    //   1154: getfield DyG : I
    //   1157: isub
    //   1158: invokestatic abs : (I)I
    //   1161: iconst_4
    //   1162: if_icmplt -> 1169
    //   1165: iconst_1
    //   1166: goto -> 1170
    //   1169: iconst_0
    //   1170: istore #4
    //   1172: iload #4
    //   1174: ifeq -> 1209
    //   1177: aload_0
    //   1178: new wXr
    //   1181: dup
    //   1182: aload_0
    //   1183: getfield Dne : LsMa;
    //   1186: getfield aFZ : I
    //   1189: iload_2
    //   1190: i2b
    //   1191: iload_3
    //   1192: i2b
    //   1193: invokespecial <init> : (IBB)V
    //   1196: invokevirtual Dne : (LNER;)V
    //   1199: aload_0
    //   1200: iload_2
    //   1201: putfield zGp : I
    //   1204: aload_0
    //   1205: iload_3
    //   1206: putfield DyG : I
    //   1209: aload_0
    //   1210: aload_0
    //   1211: getfield Dne : LsMa;
    //   1214: getfield Dne : LbfY;
    //   1217: aload_0
    //   1218: getfield Dne : LsMa;
    //   1221: getfield div : D
    //   1224: invokevirtual Dne : (D)I
    //   1227: putfield bzF : I
    //   1230: aload_0
    //   1231: aload_0
    //   1232: getfield Dne : LsMa;
    //   1235: getfield IjH : D
    //   1238: ldc2_w 32.0
    //   1241: dmul
    //   1242: invokestatic FWm : (D)I
    //   1245: putfield Qnq : I
    //   1248: aload_0
    //   1249: aload_0
    //   1250: getfield Dne : LsMa;
    //   1253: getfield Dne : LbfY;
    //   1256: aload_0
    //   1257: getfield Dne : LsMa;
    //   1260: getfield mrb : D
    //   1263: invokevirtual Dne : (D)I
    //   1266: putfield aFZ : I
    //   1269: aload_0
    //   1270: getfield Dne : LsMa;
    //   1273: invokevirtual Dne : ()LluM;
    //   1276: astore #5
    //   1278: aload #5
    //   1280: invokevirtual Dne : ()Z
    //   1283: ifeq -> 1307
    //   1286: aload_0
    //   1287: new SnO
    //   1290: dup
    //   1291: aload_0
    //   1292: getfield Dne : LsMa;
    //   1295: getfield aFZ : I
    //   1298: aload #5
    //   1300: iconst_0
    //   1301: invokespecial <init> : (ILluM;Z)V
    //   1304: invokevirtual FWm : (LNER;)V
    //   1307: aload_0
    //   1308: iconst_1
    //   1309: putfield Qnq : Z
    //   1312: aload_0
    //   1313: getfield Dne : LsMa;
    //   1316: invokevirtual aFZ : ()F
    //   1319: ldc 256.0
    //   1321: fmul
    //   1322: ldc 360.0
    //   1324: fdiv
    //   1325: invokestatic Dne : (F)I
    //   1328: istore_2
    //   1329: iload_2
    //   1330: aload_0
    //   1331: getfield div : I
    //   1334: isub
    //   1335: invokestatic abs : (I)I
    //   1338: iconst_4
    //   1339: if_icmplt -> 1367
    //   1342: aload_0
    //   1343: new eNn
    //   1346: dup
    //   1347: aload_0
    //   1348: getfield Dne : LsMa;
    //   1351: getfield aFZ : I
    //   1354: iload_2
    //   1355: i2b
    //   1356: invokespecial <init> : (IB)V
    //   1359: invokevirtual Dne : (LNER;)V
    //   1362: aload_0
    //   1363: iload_2
    //   1364: putfield div : I
    //   1367: aload_0
    //   1368: getfield Dne : LsMa;
    //   1371: iconst_0
    //   1372: putfield ATE : Z
    //   1375: aload_0
    //   1376: dup
    //   1377: getfield IjH : I
    //   1380: iconst_1
    //   1381: iadd
    //   1382: putfield IjH : I
    //   1385: aload_0
    //   1386: getfield Dne : LsMa;
    //   1389: getfield IjH : Z
    //   1392: ifeq -> 1418
    //   1395: aload_0
    //   1396: new wFl
    //   1399: dup
    //   1400: aload_0
    //   1401: getfield Dne : LsMa;
    //   1404: invokespecial <init> : (LsMa;)V
    //   1407: invokevirtual FWm : (LNER;)V
    //   1410: aload_0
    //   1411: getfield Dne : LsMa;
    //   1414: iconst_0
    //   1415: putfield IjH : Z
    //   1418: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Set;
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore_1
    //   10: aload_1
    //   11: invokeinterface hasNext : ()Z
    //   16: ifeq -> 52
    //   19: aload_1
    //   20: invokeinterface next : ()Ljava/lang/Object;
    //   25: checkcast PJQ
    //   28: astore_2
    //   29: aload_2
    //   30: getfield FWm : Ljava/util/List;
    //   33: aload_0
    //   34: getfield Dne : LsMa;
    //   37: getfield aFZ : I
    //   40: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   43: invokeinterface add : (Ljava/lang/Object;)Z
    //   48: pop
    //   49: goto -> 10
    //   52: return
  }
  
  public void bzF(PJQ paramPJQ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Set;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifeq -> 44
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/Set;
    //   17: aload_1
    //   18: invokeinterface remove : (Ljava/lang/Object;)Z
    //   23: pop
    //   24: aload_1
    //   25: getfield FWm : Ljava/util/List;
    //   28: aload_0
    //   29: getfield Dne : LsMa;
    //   32: getfield aFZ : I
    //   35: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   38: invokeinterface add : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: return
  }
  
  public int hashCode() {
    return this.Dne.aFZ;
  }
  
  public void Dne(NER paramNER) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Set;
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore_2
    //   10: aload_2
    //   11: invokeinterface hasNext : ()Z
    //   16: ifeq -> 40
    //   19: aload_2
    //   20: invokeinterface next : ()Ljava/lang/Object;
    //   25: checkcast PJQ
    //   28: astore_3
    //   29: aload_3
    //   30: getfield Dne : LTnv;
    //   33: aload_1
    //   34: invokevirtual Dne : (LNER;)V
    //   37: goto -> 10
    //   40: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\phC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */