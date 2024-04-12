import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Pdb {
  private Set FWm;
  
  public int Dne;
  
  public List FWm;
  
  private final Set Dne;
  
  private int bzF;
  
  private short Dne = 0;
  
  private int FWm = new ArrayList();
  
  public List bzF = new ArrayList();
  
  protected List Qnq;
  
  public boolean Dne(onZ paramonZ) {
    return true;
  }
  
  public void Dne(FiG paramFiG, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: ifeq -> 18
    //   4: aload_0
    //   5: getfield FWm : Ljava/util/Set;
    //   8: aload_1
    //   9: invokeinterface remove : (Ljava/lang/Object;)Z
    //   14: pop
    //   15: goto -> 29
    //   18: aload_0
    //   19: getfield FWm : Ljava/util/Set;
    //   22: aload_1
    //   23: invokeinterface add : (Ljava/lang/Object;)Z
    //   28: pop
    //   29: return
  }
  
  public void Dne(MqS paramMqS) {
    Dne();
  }
  
  public onZ Dne(int paramInt) {
    return this.bzF.get(paramInt);
  }
  
  public static void Dne(Set paramSet, int paramInt1, NMq paramNMq, int paramInt2) {
    switch (paramInt1) {
      case 0:
        paramNMq.Dne = geR.Dne(paramNMq.Dne / paramSet.size());
        break;
      case 1:
        paramNMq.Dne = 1;
        break;
    } 
    paramNMq.Dne += paramInt2;
  }
  
  public void FWm(mXX parammXX) {
    this.Qnq.remove(parammXX);
  }
  
  public boolean Dne(FiG paramFiG, int paramInt) {
    return false;
  }
  
  public static boolean Dne(int paramInt) {
    return (paramInt == 0 || paramInt == 1);
  }
  
  public static boolean Dne(onZ paramonZ, NMq paramNMq, boolean paramBoolean) {
    int i = (paramonZ == null || !paramonZ.Dne()) ? 1 : 0;
    if (paramonZ != null && paramonZ.Dne() && paramNMq != null && paramNMq.Dne(paramonZ.Dne()) && NMq.Dne(paramonZ.Dne(), paramNMq)) {
      byte b = paramBoolean ? 0 : paramNMq.Dne;
      i |= ((paramonZ.Dne()).Dne + b <= paramNMq.FWm()) ? 1 : 0;
    } 
    return i;
  }
  
  protected void Dne(int paramInt1, int paramInt2, boolean paramBoolean, FiG paramFiG) {
    Dne(paramInt1, paramInt2, 1, paramFiG);
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    onZ onZ = this.bzF.get(paramInt);
    return (onZ != null) ? onZ.Dne() : null;
  }
  
  protected boolean Dne(NMq paramNMq, int paramInt1, int paramInt2, boolean paramBoolean) {
    boolean bool = false;
    int i = paramInt1;
    if (paramBoolean)
      i = paramInt2 - 1; 
    if (paramNMq.Dne())
      while (paramNMq.Dne > 0 && ((!paramBoolean && i < paramInt2) || (paramBoolean && i >= paramInt1))) {
        onZ onZ = this.bzF.get(i);
        NMq nMq = onZ.Dne();
        if (nMq != null && nMq.bzF == paramNMq.bzF && (!paramNMq.bzF() || paramNMq.Qnq() == nMq.Qnq()) && NMq.Dne(paramNMq, nMq)) {
          int j = nMq.Dne + paramNMq.Dne;
          if (j <= paramNMq.FWm()) {
            paramNMq.Dne = 0;
            nMq.Dne = j;
            onZ.Dne();
            bool = true;
          } else if (nMq.Dne < paramNMq.FWm()) {
            paramNMq.Dne -= paramNMq.FWm() - nMq.Dne;
            nMq.Dne = paramNMq.FWm();
            onZ.Dne();
            bool = true;
          } 
        } 
        if (paramBoolean) {
          i--;
          continue;
        } 
        i++;
      }  
    if (paramNMq.Dne > 0) {
      if (paramBoolean) {
        i = paramInt2 - 1;
      } else {
        i = paramInt1;
      } 
      while ((!paramBoolean && i < paramInt2) || (paramBoolean && i >= paramInt1)) {
        onZ onZ = this.bzF.get(i);
        NMq nMq = onZ.Dne();
        if (nMq == null) {
          onZ.Dne(paramNMq.Dne());
          onZ.Dne();
          paramNMq.Dne = 0;
          bool = true;
          break;
        } 
        if (paramBoolean) {
          i--;
          continue;
        } 
        i++;
      } 
    } 
    return bool;
  }
  
  public Pdb() {
    this.Dne = 0;
    this.FWm = -1;
    this.bzF = false;
    this.Dne = new HashSet();
    this.Qnq = new ArrayList();
    this.FWm = new HashSet();
  }
  
  public void Dne(NMq[] paramArrayOfNMq) {
    for (byte b = 0; b < paramArrayOfNMq.length; b++)
      Dne(b).Dne(paramArrayOfNMq[b]); 
  }
  
  public abstract boolean Dne(FiG paramFiG);
  
  public boolean FWm(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/Set;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifne -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: ireturn
  }
  
  public boolean Dne(NMq paramNMq, onZ paramonZ) {
    return true;
  }
  
  public static int Dne(int paramInt) {
    return paramInt >> 2 & 0x3;
  }
  
  public short Dne(MOS paramMOS) {
    this.Dne = (short)(this.Dne + 1);
    return this.Dne;
  }
  
  public List Dne() {
    ArrayList<NMq> arrayList = new ArrayList();
    for (byte b = 0; b < this.bzF.size(); b++)
      arrayList.add(((onZ)this.bzF.get(b)).Dne()); 
    return arrayList;
  }
  
  public static int Dne(MqS paramMqS) {
    if (paramMqS == null)
      return 0; 
    byte b1 = 0;
    float f = 0.0F;
    for (byte b2 = 0; b2 < paramMqS.Qnq(); b2++) {
      NMq nMq = paramMqS.Dne(b2);
      if (nMq != null) {
        f += nMq.Dne / Math.min(paramMqS.aFZ(), nMq.FWm());
        b1++;
      } 
    } 
    f /= paramMqS.Qnq();
    return geR.Dne(f * 14.0F) + ((b1 > 0) ? 1 : 0);
  }
  
  public void Dne(FiG paramFiG) {
    Pdb pdb = paramFiG.Dne;
    if (pdb.FWm() != null) {
      paramFiG.Dne(pdb.FWm());
      pdb.Dne((NMq)null);
    } 
  }
  
  public void Dne(mXX parammXX) {
    if (this.Qnq.contains(parammXX))
      throw new IllegalArgumentException("Listener already listening"); 
    this.Qnq.add(parammXX);
    parammXX.Dne(this, Dne());
    Dne();
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    Dne(paramInt).Dne(paramNMq);
  }
  
  public void Dne(int paramInt1, int paramInt2) {}
  
  public NMq Dne(int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: aload #4
    //   5: getfield Dne : LMOS;
    //   8: astore #6
    //   10: iload_3
    //   11: iconst_5
    //   12: if_icmpne -> 508
    //   15: aload_0
    //   16: getfield bzF : I
    //   19: istore #9
    //   21: aload_0
    //   22: iload_2
    //   23: invokestatic FWm : (I)I
    //   26: putfield bzF : I
    //   29: iload #9
    //   31: iconst_1
    //   32: if_icmpne -> 43
    //   35: aload_0
    //   36: getfield bzF : I
    //   39: iconst_2
    //   40: if_icmpeq -> 59
    //   43: iload #9
    //   45: aload_0
    //   46: getfield bzF : I
    //   49: if_icmpeq -> 59
    //   52: aload_0
    //   53: invokevirtual FWm : ()V
    //   56: goto -> 505
    //   59: aload #6
    //   61: invokevirtual FWm : ()LNMq;
    //   64: ifnonnull -> 74
    //   67: aload_0
    //   68: invokevirtual FWm : ()V
    //   71: goto -> 505
    //   74: aload_0
    //   75: getfield bzF : I
    //   78: ifne -> 123
    //   81: aload_0
    //   82: iload_2
    //   83: invokestatic Dne : (I)I
    //   86: putfield FWm : I
    //   89: aload_0
    //   90: getfield FWm : I
    //   93: invokestatic Dne : (I)Z
    //   96: ifeq -> 116
    //   99: aload_0
    //   100: iconst_1
    //   101: putfield bzF : I
    //   104: aload_0
    //   105: getfield Dne : Ljava/util/Set;
    //   108: invokeinterface clear : ()V
    //   113: goto -> 505
    //   116: aload_0
    //   117: invokevirtual FWm : ()V
    //   120: goto -> 505
    //   123: aload_0
    //   124: getfield bzF : I
    //   127: iconst_1
    //   128: if_icmpne -> 222
    //   131: aload_0
    //   132: getfield bzF : Ljava/util/List;
    //   135: iload_1
    //   136: invokeinterface get : (I)Ljava/lang/Object;
    //   141: checkcast onZ
    //   144: astore #10
    //   146: aload #10
    //   148: ifnull -> 219
    //   151: aload #10
    //   153: aload #6
    //   155: invokevirtual FWm : ()LNMq;
    //   158: iconst_1
    //   159: invokestatic Dne : (LonZ;LNMq;Z)Z
    //   162: ifeq -> 219
    //   165: aload #10
    //   167: aload #6
    //   169: invokevirtual FWm : ()LNMq;
    //   172: invokevirtual Dne : (LNMq;)Z
    //   175: ifeq -> 219
    //   178: aload #6
    //   180: invokevirtual FWm : ()LNMq;
    //   183: getfield Dne : I
    //   186: aload_0
    //   187: getfield Dne : Ljava/util/Set;
    //   190: invokeinterface size : ()I
    //   195: if_icmple -> 219
    //   198: aload_0
    //   199: aload #10
    //   201: invokevirtual Dne : (LonZ;)Z
    //   204: ifeq -> 219
    //   207: aload_0
    //   208: getfield Dne : Ljava/util/Set;
    //   211: aload #10
    //   213: invokeinterface add : (Ljava/lang/Object;)Z
    //   218: pop
    //   219: goto -> 505
    //   222: aload_0
    //   223: getfield bzF : I
    //   226: iconst_2
    //   227: if_icmpne -> 501
    //   230: aload_0
    //   231: getfield Dne : Ljava/util/Set;
    //   234: invokeinterface isEmpty : ()Z
    //   239: ifne -> 494
    //   242: aload #6
    //   244: invokevirtual FWm : ()LNMq;
    //   247: invokevirtual Dne : ()LNMq;
    //   250: astore #8
    //   252: aload #6
    //   254: invokevirtual FWm : ()LNMq;
    //   257: getfield Dne : I
    //   260: istore #7
    //   262: aload_0
    //   263: getfield Dne : Ljava/util/Set;
    //   266: invokeinterface iterator : ()Ljava/util/Iterator;
    //   271: astore #10
    //   273: aload #10
    //   275: invokeinterface hasNext : ()Z
    //   280: ifeq -> 469
    //   283: aload #10
    //   285: invokeinterface next : ()Ljava/lang/Object;
    //   290: checkcast onZ
    //   293: astore #11
    //   295: aload #11
    //   297: ifnull -> 466
    //   300: aload #11
    //   302: aload #6
    //   304: invokevirtual FWm : ()LNMq;
    //   307: iconst_1
    //   308: invokestatic Dne : (LonZ;LNMq;Z)Z
    //   311: ifeq -> 466
    //   314: aload #11
    //   316: aload #6
    //   318: invokevirtual FWm : ()LNMq;
    //   321: invokevirtual Dne : (LNMq;)Z
    //   324: ifeq -> 466
    //   327: aload #6
    //   329: invokevirtual FWm : ()LNMq;
    //   332: getfield Dne : I
    //   335: aload_0
    //   336: getfield Dne : Ljava/util/Set;
    //   339: invokeinterface size : ()I
    //   344: if_icmplt -> 466
    //   347: aload_0
    //   348: aload #11
    //   350: invokevirtual Dne : (LonZ;)Z
    //   353: ifeq -> 466
    //   356: aload #8
    //   358: invokevirtual Dne : ()LNMq;
    //   361: astore #12
    //   363: aload #11
    //   365: invokevirtual Dne : ()Z
    //   368: ifeq -> 382
    //   371: aload #11
    //   373: invokevirtual Dne : ()LNMq;
    //   376: getfield Dne : I
    //   379: goto -> 383
    //   382: iconst_0
    //   383: istore #13
    //   385: aload_0
    //   386: getfield Dne : Ljava/util/Set;
    //   389: aload_0
    //   390: getfield FWm : I
    //   393: aload #12
    //   395: iload #13
    //   397: invokestatic Dne : (Ljava/util/Set;ILNMq;I)V
    //   400: aload #12
    //   402: getfield Dne : I
    //   405: aload #12
    //   407: invokevirtual FWm : ()I
    //   410: if_icmple -> 423
    //   413: aload #12
    //   415: aload #12
    //   417: invokevirtual FWm : ()I
    //   420: putfield Dne : I
    //   423: aload #12
    //   425: getfield Dne : I
    //   428: aload #11
    //   430: invokevirtual Dne : ()I
    //   433: if_icmple -> 446
    //   436: aload #12
    //   438: aload #11
    //   440: invokevirtual Dne : ()I
    //   443: putfield Dne : I
    //   446: iload #7
    //   448: aload #12
    //   450: getfield Dne : I
    //   453: iload #13
    //   455: isub
    //   456: isub
    //   457: istore #7
    //   459: aload #11
    //   461: aload #12
    //   463: invokevirtual Dne : (LNMq;)V
    //   466: goto -> 273
    //   469: aload #8
    //   471: iload #7
    //   473: putfield Dne : I
    //   476: aload #8
    //   478: getfield Dne : I
    //   481: ifgt -> 487
    //   484: aconst_null
    //   485: astore #8
    //   487: aload #6
    //   489: aload #8
    //   491: invokevirtual Dne : (LNMq;)V
    //   494: aload_0
    //   495: invokevirtual FWm : ()V
    //   498: goto -> 505
    //   501: aload_0
    //   502: invokevirtual FWm : ()V
    //   505: goto -> 2064
    //   508: aload_0
    //   509: getfield bzF : I
    //   512: ifeq -> 522
    //   515: aload_0
    //   516: invokevirtual FWm : ()V
    //   519: goto -> 2064
    //   522: iload_3
    //   523: ifeq -> 531
    //   526: iload_3
    //   527: iconst_1
    //   528: if_icmpne -> 1286
    //   531: iload_2
    //   532: ifeq -> 540
    //   535: iload_2
    //   536: iconst_1
    //   537: if_icmpne -> 1286
    //   540: iload_1
    //   541: sipush #-999
    //   544: if_icmpne -> 629
    //   547: aload #6
    //   549: invokevirtual FWm : ()LNMq;
    //   552: ifnull -> 2064
    //   555: iload_1
    //   556: sipush #-999
    //   559: if_icmpne -> 2064
    //   562: iload_2
    //   563: ifne -> 586
    //   566: aload #4
    //   568: aload #6
    //   570: invokevirtual FWm : ()LNMq;
    //   573: invokevirtual Dne : (LNMq;)LJiM;
    //   576: pop
    //   577: aload #6
    //   579: aconst_null
    //   580: checkcast NMq
    //   583: invokevirtual Dne : (LNMq;)V
    //   586: iload_2
    //   587: iconst_1
    //   588: if_icmpne -> 2064
    //   591: aload #4
    //   593: aload #6
    //   595: invokevirtual FWm : ()LNMq;
    //   598: iconst_1
    //   599: invokevirtual Dne : (I)LNMq;
    //   602: invokevirtual Dne : (LNMq;)LJiM;
    //   605: pop
    //   606: aload #6
    //   608: invokevirtual FWm : ()LNMq;
    //   611: getfield Dne : I
    //   614: ifne -> 2064
    //   617: aload #6
    //   619: aconst_null
    //   620: checkcast NMq
    //   623: invokevirtual Dne : (LNMq;)V
    //   626: goto -> 2064
    //   629: iload_3
    //   630: iconst_1
    //   631: if_icmpne -> 736
    //   634: iload_1
    //   635: ifge -> 640
    //   638: aconst_null
    //   639: areturn
    //   640: aload_0
    //   641: getfield bzF : Ljava/util/List;
    //   644: iload_1
    //   645: invokeinterface get : (I)Ljava/lang/Object;
    //   650: checkcast onZ
    //   653: astore #9
    //   655: aload #9
    //   657: ifnull -> 2064
    //   660: aload #9
    //   662: aload #4
    //   664: invokevirtual Dne : (LFiG;)Z
    //   667: ifeq -> 2064
    //   670: aload_0
    //   671: aload #4
    //   673: iload_1
    //   674: invokevirtual Dne : (LFiG;I)LNMq;
    //   677: astore #8
    //   679: aload #8
    //   681: ifnull -> 2064
    //   684: aload #8
    //   686: getfield bzF : I
    //   689: istore #7
    //   691: aload #8
    //   693: invokevirtual Dne : ()LNMq;
    //   696: astore #5
    //   698: aload #9
    //   700: ifnull -> 2064
    //   703: aload #9
    //   705: invokevirtual Dne : ()LNMq;
    //   708: ifnull -> 2064
    //   711: aload #9
    //   713: invokevirtual Dne : ()LNMq;
    //   716: getfield bzF : I
    //   719: iload #7
    //   721: if_icmpne -> 2064
    //   724: aload_0
    //   725: iload_1
    //   726: iload_2
    //   727: iconst_1
    //   728: aload #4
    //   730: invokevirtual Dne : (IIZLFiG;)V
    //   733: goto -> 2064
    //   736: iload_1
    //   737: ifge -> 742
    //   740: aconst_null
    //   741: areturn
    //   742: aload_0
    //   743: getfield bzF : Ljava/util/List;
    //   746: iload_1
    //   747: invokeinterface get : (I)Ljava/lang/Object;
    //   752: checkcast onZ
    //   755: astore #9
    //   757: aload #9
    //   759: ifnull -> 2064
    //   762: aload #9
    //   764: invokevirtual Dne : ()LNMq;
    //   767: astore #8
    //   769: aload #6
    //   771: invokevirtual FWm : ()LNMq;
    //   774: astore #12
    //   776: aload #8
    //   778: ifnull -> 788
    //   781: aload #8
    //   783: invokevirtual Dne : ()LNMq;
    //   786: astore #5
    //   788: aload #8
    //   790: ifnonnull -> 872
    //   793: aload #12
    //   795: ifnull -> 1278
    //   798: aload #9
    //   800: aload #12
    //   802: invokevirtual Dne : (LNMq;)Z
    //   805: ifeq -> 1278
    //   808: iload_2
    //   809: ifne -> 820
    //   812: aload #12
    //   814: getfield Dne : I
    //   817: goto -> 821
    //   820: iconst_1
    //   821: istore #10
    //   823: iload #10
    //   825: aload #9
    //   827: invokevirtual Dne : ()I
    //   830: if_icmple -> 840
    //   833: aload #9
    //   835: invokevirtual Dne : ()I
    //   838: istore #10
    //   840: aload #9
    //   842: aload #12
    //   844: iload #10
    //   846: invokevirtual Dne : (I)LNMq;
    //   849: invokevirtual Dne : (LNMq;)V
    //   852: aload #12
    //   854: getfield Dne : I
    //   857: ifne -> 1278
    //   860: aload #6
    //   862: aconst_null
    //   863: checkcast NMq
    //   866: invokevirtual Dne : (LNMq;)V
    //   869: goto -> 1278
    //   872: aload #9
    //   874: aload #4
    //   876: invokevirtual Dne : (LFiG;)Z
    //   879: ifeq -> 1278
    //   882: aload #12
    //   884: ifnonnull -> 958
    //   887: iload_2
    //   888: ifne -> 899
    //   891: aload #8
    //   893: getfield Dne : I
    //   896: goto -> 908
    //   899: aload #8
    //   901: getfield Dne : I
    //   904: iconst_1
    //   905: iadd
    //   906: iconst_2
    //   907: idiv
    //   908: istore #10
    //   910: aload #9
    //   912: iload #10
    //   914: invokevirtual Dne : (I)LNMq;
    //   917: astore #11
    //   919: aload #6
    //   921: aload #11
    //   923: invokevirtual Dne : (LNMq;)V
    //   926: aload #8
    //   928: getfield Dne : I
    //   931: ifne -> 943
    //   934: aload #9
    //   936: aconst_null
    //   937: checkcast NMq
    //   940: invokevirtual Dne : (LNMq;)V
    //   943: aload #9
    //   945: aload #4
    //   947: aload #6
    //   949: invokevirtual FWm : ()LNMq;
    //   952: invokevirtual Dne : (LFiG;LNMq;)V
    //   955: goto -> 1278
    //   958: aload #9
    //   960: aload #12
    //   962: invokevirtual Dne : (LNMq;)Z
    //   965: ifeq -> 1147
    //   968: aload #8
    //   970: getfield bzF : I
    //   973: aload #12
    //   975: getfield bzF : I
    //   978: if_icmpne -> 1117
    //   981: aload #8
    //   983: invokevirtual Qnq : ()I
    //   986: aload #12
    //   988: invokevirtual Qnq : ()I
    //   991: if_icmpne -> 1117
    //   994: aload #8
    //   996: aload #12
    //   998: invokestatic Dne : (LNMq;LNMq;)Z
    //   1001: ifeq -> 1117
    //   1004: iload_2
    //   1005: ifne -> 1016
    //   1008: aload #12
    //   1010: getfield Dne : I
    //   1013: goto -> 1017
    //   1016: iconst_1
    //   1017: istore #10
    //   1019: iload #10
    //   1021: aload #9
    //   1023: invokevirtual Dne : ()I
    //   1026: aload #8
    //   1028: getfield Dne : I
    //   1031: isub
    //   1032: if_icmple -> 1048
    //   1035: aload #9
    //   1037: invokevirtual Dne : ()I
    //   1040: aload #8
    //   1042: getfield Dne : I
    //   1045: isub
    //   1046: istore #10
    //   1048: iload #10
    //   1050: aload #12
    //   1052: invokevirtual FWm : ()I
    //   1055: aload #8
    //   1057: getfield Dne : I
    //   1060: isub
    //   1061: if_icmple -> 1077
    //   1064: aload #12
    //   1066: invokevirtual FWm : ()I
    //   1069: aload #8
    //   1071: getfield Dne : I
    //   1074: isub
    //   1075: istore #10
    //   1077: aload #12
    //   1079: iload #10
    //   1081: invokevirtual Dne : (I)LNMq;
    //   1084: pop
    //   1085: aload #12
    //   1087: getfield Dne : I
    //   1090: ifne -> 1102
    //   1093: aload #6
    //   1095: aconst_null
    //   1096: checkcast NMq
    //   1099: invokevirtual Dne : (LNMq;)V
    //   1102: aload #8
    //   1104: dup
    //   1105: getfield Dne : I
    //   1108: iload #10
    //   1110: iadd
    //   1111: putfield Dne : I
    //   1114: goto -> 1278
    //   1117: aload #12
    //   1119: getfield Dne : I
    //   1122: aload #9
    //   1124: invokevirtual Dne : ()I
    //   1127: if_icmpgt -> 1278
    //   1130: aload #9
    //   1132: aload #12
    //   1134: invokevirtual Dne : (LNMq;)V
    //   1137: aload #6
    //   1139: aload #8
    //   1141: invokevirtual Dne : (LNMq;)V
    //   1144: goto -> 1278
    //   1147: aload #8
    //   1149: getfield bzF : I
    //   1152: aload #12
    //   1154: getfield bzF : I
    //   1157: if_icmpne -> 1278
    //   1160: aload #12
    //   1162: invokevirtual FWm : ()I
    //   1165: iconst_1
    //   1166: if_icmple -> 1278
    //   1169: aload #8
    //   1171: invokevirtual bzF : ()Z
    //   1174: ifeq -> 1190
    //   1177: aload #8
    //   1179: invokevirtual Qnq : ()I
    //   1182: aload #12
    //   1184: invokevirtual Qnq : ()I
    //   1187: if_icmpne -> 1278
    //   1190: aload #8
    //   1192: aload #12
    //   1194: invokestatic Dne : (LNMq;LNMq;)Z
    //   1197: ifeq -> 1278
    //   1200: aload #8
    //   1202: getfield Dne : I
    //   1205: istore #10
    //   1207: iload #10
    //   1209: ifle -> 1278
    //   1212: iload #10
    //   1214: aload #12
    //   1216: getfield Dne : I
    //   1219: iadd
    //   1220: aload #12
    //   1222: invokevirtual FWm : ()I
    //   1225: if_icmpgt -> 1278
    //   1228: aload #12
    //   1230: dup
    //   1231: getfield Dne : I
    //   1234: iload #10
    //   1236: iadd
    //   1237: putfield Dne : I
    //   1240: aload #9
    //   1242: iload #10
    //   1244: invokevirtual Dne : (I)LNMq;
    //   1247: astore #8
    //   1249: aload #8
    //   1251: getfield Dne : I
    //   1254: ifne -> 1266
    //   1257: aload #9
    //   1259: aconst_null
    //   1260: checkcast NMq
    //   1263: invokevirtual Dne : (LNMq;)V
    //   1266: aload #9
    //   1268: aload #4
    //   1270: aload #6
    //   1272: invokevirtual FWm : ()LNMq;
    //   1275: invokevirtual Dne : (LFiG;LNMq;)V
    //   1278: aload #9
    //   1280: invokevirtual Dne : ()V
    //   1283: goto -> 2064
    //   1286: iload_3
    //   1287: iconst_2
    //   1288: if_icmpne -> 1572
    //   1291: iload_2
    //   1292: iflt -> 1572
    //   1295: iload_2
    //   1296: bipush #9
    //   1298: if_icmpge -> 1572
    //   1301: aload_0
    //   1302: getfield bzF : Ljava/util/List;
    //   1305: iload_1
    //   1306: invokeinterface get : (I)Ljava/lang/Object;
    //   1311: checkcast onZ
    //   1314: astore #9
    //   1316: aload #9
    //   1318: aload #4
    //   1320: invokevirtual Dne : (LFiG;)Z
    //   1323: ifeq -> 2064
    //   1326: aload #6
    //   1328: iload_2
    //   1329: invokevirtual Dne : (I)LNMq;
    //   1332: astore #8
    //   1334: aload #8
    //   1336: ifnull -> 1359
    //   1339: aload #9
    //   1341: getfield Dne : LMqS;
    //   1344: aload #6
    //   1346: if_acmpne -> 1363
    //   1349: aload #9
    //   1351: aload #8
    //   1353: invokevirtual Dne : (LNMq;)Z
    //   1356: ifeq -> 1363
    //   1359: iconst_1
    //   1360: goto -> 1364
    //   1363: iconst_0
    //   1364: istore #12
    //   1366: iconst_m1
    //   1367: istore #10
    //   1369: iload #12
    //   1371: ifne -> 1397
    //   1374: aload #6
    //   1376: invokevirtual FWm : ()I
    //   1379: istore #10
    //   1381: iload #12
    //   1383: iload #10
    //   1385: iconst_m1
    //   1386: if_icmple -> 1393
    //   1389: iconst_1
    //   1390: goto -> 1394
    //   1393: iconst_0
    //   1394: ior
    //   1395: istore #12
    //   1397: aload #9
    //   1399: invokevirtual Dne : ()Z
    //   1402: ifeq -> 1529
    //   1405: iload #12
    //   1407: ifeq -> 1529
    //   1410: aload #9
    //   1412: invokevirtual Dne : ()LNMq;
    //   1415: astore #11
    //   1417: aload #6
    //   1419: iload_2
    //   1420: aload #11
    //   1422: invokevirtual Dne : ()LNMq;
    //   1425: invokevirtual Dne : (ILNMq;)V
    //   1428: aload #9
    //   1430: getfield Dne : LMqS;
    //   1433: aload #6
    //   1435: if_acmpne -> 1448
    //   1438: aload #9
    //   1440: aload #8
    //   1442: invokevirtual Dne : (LNMq;)Z
    //   1445: ifne -> 1499
    //   1448: aload #8
    //   1450: ifnull -> 1499
    //   1453: iload #10
    //   1455: iconst_m1
    //   1456: if_icmple -> 1569
    //   1459: aload #6
    //   1461: aload #8
    //   1463: invokevirtual Dne : (LNMq;)Z
    //   1466: pop
    //   1467: aload #9
    //   1469: aload #11
    //   1471: getfield Dne : I
    //   1474: invokevirtual Dne : (I)LNMq;
    //   1477: pop
    //   1478: aload #9
    //   1480: aconst_null
    //   1481: checkcast NMq
    //   1484: invokevirtual Dne : (LNMq;)V
    //   1487: aload #9
    //   1489: aload #4
    //   1491: aload #11
    //   1493: invokevirtual Dne : (LFiG;LNMq;)V
    //   1496: goto -> 1569
    //   1499: aload #9
    //   1501: aload #11
    //   1503: getfield Dne : I
    //   1506: invokevirtual Dne : (I)LNMq;
    //   1509: pop
    //   1510: aload #9
    //   1512: aload #8
    //   1514: invokevirtual Dne : (LNMq;)V
    //   1517: aload #9
    //   1519: aload #4
    //   1521: aload #11
    //   1523: invokevirtual Dne : (LFiG;LNMq;)V
    //   1526: goto -> 1569
    //   1529: aload #9
    //   1531: invokevirtual Dne : ()Z
    //   1534: ifne -> 1569
    //   1537: aload #8
    //   1539: ifnull -> 1569
    //   1542: aload #9
    //   1544: aload #8
    //   1546: invokevirtual Dne : (LNMq;)Z
    //   1549: ifeq -> 1569
    //   1552: aload #6
    //   1554: iload_2
    //   1555: aconst_null
    //   1556: checkcast NMq
    //   1559: invokevirtual Dne : (ILNMq;)V
    //   1562: aload #9
    //   1564: aload #8
    //   1566: invokevirtual Dne : (LNMq;)V
    //   1569: goto -> 2064
    //   1572: iload_3
    //   1573: iconst_3
    //   1574: if_icmpne -> 1658
    //   1577: aload #4
    //   1579: getfield Dne : Luqg;
    //   1582: getfield Qnq : Z
    //   1585: ifeq -> 1658
    //   1588: aload #6
    //   1590: invokevirtual FWm : ()LNMq;
    //   1593: ifnonnull -> 1658
    //   1596: iload_1
    //   1597: iflt -> 1658
    //   1600: aload_0
    //   1601: getfield bzF : Ljava/util/List;
    //   1604: iload_1
    //   1605: invokeinterface get : (I)Ljava/lang/Object;
    //   1610: checkcast onZ
    //   1613: astore #9
    //   1615: aload #9
    //   1617: ifnull -> 2064
    //   1620: aload #9
    //   1622: invokevirtual Dne : ()Z
    //   1625: ifeq -> 2064
    //   1628: aload #9
    //   1630: invokevirtual Dne : ()LNMq;
    //   1633: invokevirtual Dne : ()LNMq;
    //   1636: astore #8
    //   1638: aload #8
    //   1640: aload #8
    //   1642: invokevirtual FWm : ()I
    //   1645: putfield Dne : I
    //   1648: aload #6
    //   1650: aload #8
    //   1652: invokevirtual Dne : (LNMq;)V
    //   1655: goto -> 2064
    //   1658: iload_3
    //   1659: iconst_4
    //   1660: if_icmpne -> 1756
    //   1663: aload #6
    //   1665: invokevirtual FWm : ()LNMq;
    //   1668: ifnonnull -> 1756
    //   1671: iload_1
    //   1672: iflt -> 1756
    //   1675: aload_0
    //   1676: getfield bzF : Ljava/util/List;
    //   1679: iload_1
    //   1680: invokeinterface get : (I)Ljava/lang/Object;
    //   1685: checkcast onZ
    //   1688: astore #9
    //   1690: aload #9
    //   1692: ifnull -> 2064
    //   1695: aload #9
    //   1697: invokevirtual Dne : ()Z
    //   1700: ifeq -> 2064
    //   1703: aload #9
    //   1705: aload #4
    //   1707: invokevirtual Dne : (LFiG;)Z
    //   1710: ifeq -> 2064
    //   1713: aload #9
    //   1715: iload_2
    //   1716: ifne -> 1723
    //   1719: iconst_1
    //   1720: goto -> 1731
    //   1723: aload #9
    //   1725: invokevirtual Dne : ()LNMq;
    //   1728: getfield Dne : I
    //   1731: invokevirtual Dne : (I)LNMq;
    //   1734: astore #8
    //   1736: aload #9
    //   1738: aload #4
    //   1740: aload #8
    //   1742: invokevirtual Dne : (LFiG;LNMq;)V
    //   1745: aload #4
    //   1747: aload #8
    //   1749: invokevirtual Dne : (LNMq;)LJiM;
    //   1752: pop
    //   1753: goto -> 2064
    //   1756: iload_3
    //   1757: bipush #6
    //   1759: if_icmpne -> 2064
    //   1762: iload_1
    //   1763: iflt -> 2064
    //   1766: aload_0
    //   1767: getfield bzF : Ljava/util/List;
    //   1770: iload_1
    //   1771: invokeinterface get : (I)Ljava/lang/Object;
    //   1776: checkcast onZ
    //   1779: astore #9
    //   1781: aload #6
    //   1783: invokevirtual FWm : ()LNMq;
    //   1786: astore #8
    //   1788: aload #8
    //   1790: ifnull -> 2060
    //   1793: aload #9
    //   1795: ifnull -> 1816
    //   1798: aload #9
    //   1800: invokevirtual Dne : ()Z
    //   1803: ifeq -> 1816
    //   1806: aload #9
    //   1808: aload #4
    //   1810: invokevirtual Dne : (LFiG;)Z
    //   1813: ifne -> 2060
    //   1816: iload_2
    //   1817: ifne -> 1824
    //   1820: iconst_0
    //   1821: goto -> 1835
    //   1824: aload_0
    //   1825: getfield bzF : Ljava/util/List;
    //   1828: invokeinterface size : ()I
    //   1833: iconst_1
    //   1834: isub
    //   1835: istore #7
    //   1837: iload_2
    //   1838: ifne -> 1845
    //   1841: iconst_1
    //   1842: goto -> 1846
    //   1845: iconst_m1
    //   1846: istore #10
    //   1848: iconst_0
    //   1849: istore #12
    //   1851: iload #12
    //   1853: iconst_2
    //   1854: if_icmpge -> 2060
    //   1857: iload #7
    //   1859: istore #13
    //   1861: iload #13
    //   1863: iflt -> 2054
    //   1866: iload #13
    //   1868: aload_0
    //   1869: getfield bzF : Ljava/util/List;
    //   1872: invokeinterface size : ()I
    //   1877: if_icmpge -> 2054
    //   1880: aload #8
    //   1882: getfield Dne : I
    //   1885: aload #8
    //   1887: invokevirtual FWm : ()I
    //   1890: if_icmpge -> 2054
    //   1893: aload_0
    //   1894: getfield bzF : Ljava/util/List;
    //   1897: iload #13
    //   1899: invokeinterface get : (I)Ljava/lang/Object;
    //   1904: checkcast onZ
    //   1907: astore #14
    //   1909: aload #14
    //   1911: invokevirtual Dne : ()Z
    //   1914: ifeq -> 2044
    //   1917: aload #14
    //   1919: aload #8
    //   1921: iconst_1
    //   1922: invokestatic Dne : (LonZ;LNMq;Z)Z
    //   1925: ifeq -> 2044
    //   1928: aload #14
    //   1930: aload #4
    //   1932: invokevirtual Dne : (LFiG;)Z
    //   1935: ifeq -> 2044
    //   1938: aload_0
    //   1939: aload #8
    //   1941: aload #14
    //   1943: invokevirtual Dne : (LNMq;LonZ;)Z
    //   1946: ifeq -> 2044
    //   1949: iload #12
    //   1951: ifne -> 1973
    //   1954: aload #14
    //   1956: invokevirtual Dne : ()LNMq;
    //   1959: getfield Dne : I
    //   1962: aload #14
    //   1964: invokevirtual Dne : ()LNMq;
    //   1967: invokevirtual FWm : ()I
    //   1970: if_icmpeq -> 2044
    //   1973: aload #8
    //   1975: invokevirtual FWm : ()I
    //   1978: aload #8
    //   1980: getfield Dne : I
    //   1983: isub
    //   1984: aload #14
    //   1986: invokevirtual Dne : ()LNMq;
    //   1989: getfield Dne : I
    //   1992: invokestatic min : (II)I
    //   1995: istore #15
    //   1997: aload #14
    //   1999: iload #15
    //   2001: invokevirtual Dne : (I)LNMq;
    //   2004: astore #16
    //   2006: aload #8
    //   2008: dup
    //   2009: getfield Dne : I
    //   2012: iload #15
    //   2014: iadd
    //   2015: putfield Dne : I
    //   2018: aload #16
    //   2020: getfield Dne : I
    //   2023: ifgt -> 2035
    //   2026: aload #14
    //   2028: aconst_null
    //   2029: checkcast NMq
    //   2032: invokevirtual Dne : (LNMq;)V
    //   2035: aload #14
    //   2037: aload #4
    //   2039: aload #16
    //   2041: invokevirtual Dne : (LFiG;LNMq;)V
    //   2044: iload #13
    //   2046: iload #10
    //   2048: iadd
    //   2049: istore #13
    //   2051: goto -> 1861
    //   2054: iinc #12, 1
    //   2057: goto -> 1851
    //   2060: aload_0
    //   2061: invokevirtual Dne : ()V
    //   2064: aload #5
    //   2066: areturn
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield bzF : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 130
    //   15: aload_0
    //   16: getfield bzF : Ljava/util/List;
    //   19: iload_1
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast onZ
    //   28: invokevirtual Dne : ()LNMq;
    //   31: astore_2
    //   32: aload_0
    //   33: getfield FWm : Ljava/util/List;
    //   36: iload_1
    //   37: invokeinterface get : (I)Ljava/lang/Object;
    //   42: checkcast NMq
    //   45: astore_3
    //   46: aload_3
    //   47: aload_2
    //   48: invokestatic FWm : (LNMq;LNMq;)Z
    //   51: ifne -> 124
    //   54: aload_2
    //   55: ifnonnull -> 62
    //   58: aconst_null
    //   59: goto -> 66
    //   62: aload_2
    //   63: invokevirtual Dne : ()LNMq;
    //   66: astore_3
    //   67: aload_0
    //   68: getfield FWm : Ljava/util/List;
    //   71: iload_1
    //   72: aload_3
    //   73: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   78: pop
    //   79: iconst_0
    //   80: istore #4
    //   82: iload #4
    //   84: aload_0
    //   85: getfield Qnq : Ljava/util/List;
    //   88: invokeinterface size : ()I
    //   93: if_icmpge -> 124
    //   96: aload_0
    //   97: getfield Qnq : Ljava/util/List;
    //   100: iload #4
    //   102: invokeinterface get : (I)Ljava/lang/Object;
    //   107: checkcast mXX
    //   110: aload_0
    //   111: iload_1
    //   112: aload_3
    //   113: invokeinterface Dne : (LPdb;ILNMq;)V
    //   118: iinc #4, 1
    //   121: goto -> 82
    //   124: iinc #1, 1
    //   127: goto -> 2
    //   130: return
  }
  
  public onZ Dne(MqS paramMqS, int paramInt) {
    for (byte b = 0; b < this.bzF.size(); b++) {
      onZ onZ = this.bzF.get(b);
      if (onZ.Dne(paramMqS, paramInt))
        return onZ; 
    } 
    return null;
  }
  
  public static int Dne(int paramInt1, int paramInt2) {
    return paramInt1 & 0x3 | (paramInt2 & 0x3) << 2;
  }
  
  protected onZ Dne(onZ paramonZ) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield bzF : Ljava/util/List;
    //   5: invokeinterface size : ()I
    //   10: putfield Qnq : I
    //   13: aload_0
    //   14: getfield bzF : Ljava/util/List;
    //   17: aload_1
    //   18: invokeinterface add : (Ljava/lang/Object;)Z
    //   23: pop
    //   24: aload_0
    //   25: getfield FWm : Ljava/util/List;
    //   28: aconst_null
    //   29: invokeinterface add : (Ljava/lang/Object;)Z
    //   34: pop
    //   35: aload_1
    //   36: areturn
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield bzF : I
    //   5: aload_0
    //   6: getfield Dne : Ljava/util/Set;
    //   9: invokeinterface clear : ()V
    //   14: return
  }
  
  public static int FWm(int paramInt) {
    return paramInt & 0x3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Pdb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */