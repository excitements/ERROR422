import java.util.List;
import java.util.Random;

public final class NMq {
  private BPY Dne;
  
  public WkD Dne;
  
  public int FWm;
  
  private int Qnq;
  
  public int Dne = 0;
  
  public int bzF;
  
  public int aFZ() {
    return dEr.Dne[this.bzF].aFZ();
  }
  
  public NMq(zKP paramzKP, int paramInt) {
    this(paramzKP.FWm, paramInt, 0);
  }
  
  public NMq Dne(int paramInt) {
    // Byte code:
    //   0: new NMq
    //   3: dup
    //   4: aload_0
    //   5: getfield bzF : I
    //   8: iload_1
    //   9: aload_0
    //   10: getfield Qnq : I
    //   13: invokespecial <init> : (III)V
    //   16: astore_2
    //   17: aload_0
    //   18: getfield Dne : LWkD;
    //   21: ifnull -> 38
    //   24: aload_2
    //   25: aload_0
    //   26: getfield Dne : LWkD;
    //   29: invokevirtual Dne : ()LoNe;
    //   32: checkcast WkD
    //   35: putfield Dne : LWkD;
    //   38: aload_0
    //   39: dup
    //   40: getfield Dne : I
    //   43: iload_1
    //   44: isub
    //   45: putfield Dne : I
    //   48: aload_2
    //   49: areturn
  }
  
  public String Dne() {
    return dEr.Dne[this.bzF].Dne(this);
  }
  
  public int zGp() {
    return Dne().a_(this);
  }
  
  public boolean Dne(FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    boolean bool = Dne().Dne(this, paramFiG, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
    if (bool)
      paramFiG.Dne((RLC)trP.bzF[this.bzF], 1); 
    return bool;
  }
  
  public static NMq Dne(NMq paramNMq) {
    return (paramNMq == null) ? null : paramNMq.Dne();
  }
  
  public List Dne(FiG paramFiG, boolean paramBoolean) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: getstatic dEr.Dne : [LdEr;
    //   11: aload_0
    //   12: getfield bzF : I
    //   15: aaload
    //   16: astore #4
    //   18: aload_0
    //   19: invokevirtual FWm : ()Ljava/lang/String;
    //   22: astore #5
    //   24: aload_0
    //   25: invokevirtual zGp : ()Z
    //   28: ifeq -> 60
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: getstatic Dne.EyB : LDne;
    //   41: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   44: aload #5
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: getstatic Dne.FfS : LDne;
    //   52: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   55: invokevirtual toString : ()Ljava/lang/String;
    //   58: astore #5
    //   60: iload_2
    //   61: ifeq -> 213
    //   64: ldc ''
    //   66: astore #6
    //   68: aload #5
    //   70: invokevirtual length : ()I
    //   73: ifle -> 102
    //   76: new java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: aload #5
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc ' ('
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: astore #5
    //   98: ldc ')'
    //   100: astore #6
    //   102: aload_0
    //   103: invokevirtual bzF : ()Z
    //   106: ifeq -> 166
    //   109: new java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: aload #5
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: ldc '#%04d/%d%s'
    //   123: iconst_3
    //   124: anewarray java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_0
    //   130: getfield bzF : I
    //   133: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: aload_0
    //   140: getfield Qnq : I
    //   143: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   146: aastore
    //   147: dup
    //   148: iconst_2
    //   149: aload #6
    //   151: aastore
    //   152: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual toString : ()Ljava/lang/String;
    //   161: astore #5
    //   163: goto -> 210
    //   166: new java/lang/StringBuilder
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: aload #5
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc '#%04d%s'
    //   180: iconst_2
    //   181: anewarray java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_0
    //   187: getfield bzF : I
    //   190: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   193: aastore
    //   194: dup
    //   195: iconst_1
    //   196: aload #6
    //   198: aastore
    //   199: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual toString : ()Ljava/lang/String;
    //   208: astore #5
    //   210: goto -> 262
    //   213: aload_0
    //   214: invokevirtual zGp : ()Z
    //   217: ifne -> 262
    //   220: aload_0
    //   221: getfield bzF : I
    //   224: getstatic dEr.Dne : Lmva;
    //   227: getfield Qnq : I
    //   230: if_icmpne -> 262
    //   233: new java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: aload #5
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: ldc ' #'
    //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: aload_0
    //   251: getfield Qnq : I
    //   254: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: astore #5
    //   262: aload_3
    //   263: aload #5
    //   265: invokevirtual add : (Ljava/lang/Object;)Z
    //   268: pop
    //   269: aload #4
    //   271: aload_0
    //   272: aload_1
    //   273: aload_3
    //   274: iload_2
    //   275: invokevirtual Dne : (LNMq;LFiG;Ljava/util/List;Z)V
    //   278: aload_0
    //   279: invokevirtual aFZ : ()Z
    //   282: ifeq -> 573
    //   285: aload_0
    //   286: invokevirtual Dne : ()LmbZ;
    //   289: astore #6
    //   291: aload #6
    //   293: ifnull -> 374
    //   296: iconst_0
    //   297: istore #7
    //   299: iload #7
    //   301: aload #6
    //   303: invokevirtual Dne : ()I
    //   306: if_icmpge -> 374
    //   309: aload #6
    //   311: iload #7
    //   313: invokevirtual FWm : (I)LoNe;
    //   316: checkcast WkD
    //   319: ldc 'id'
    //   321: invokevirtual Dne : (Ljava/lang/String;)S
    //   324: istore #8
    //   326: aload #6
    //   328: iload #7
    //   330: invokevirtual FWm : (I)LoNe;
    //   333: checkcast WkD
    //   336: ldc 'lvl'
    //   338: invokevirtual Dne : (Ljava/lang/String;)S
    //   341: istore #9
    //   343: getstatic ycv.Dne : [Lycv;
    //   346: iload #8
    //   348: aaload
    //   349: ifnull -> 368
    //   352: aload_3
    //   353: getstatic ycv.Dne : [Lycv;
    //   356: iload #8
    //   358: aaload
    //   359: iload #9
    //   361: invokevirtual Dne : (I)Ljava/lang/String;
    //   364: invokevirtual add : (Ljava/lang/Object;)Z
    //   367: pop
    //   368: iinc #7, 1
    //   371: goto -> 299
    //   374: aload_0
    //   375: getfield Dne : LWkD;
    //   378: ldc 'display'
    //   380: invokevirtual Dne : (Ljava/lang/String;)Z
    //   383: ifeq -> 573
    //   386: aload_0
    //   387: getfield Dne : LWkD;
    //   390: ldc 'display'
    //   392: invokevirtual Dne : (Ljava/lang/String;)LWkD;
    //   395: astore #7
    //   397: aload #7
    //   399: ldc 'color'
    //   401: invokevirtual Dne : (Ljava/lang/String;)Z
    //   404: ifeq -> 479
    //   407: iload_2
    //   408: ifeq -> 450
    //   411: aload_3
    //   412: new java/lang/StringBuilder
    //   415: dup
    //   416: invokespecial <init> : ()V
    //   419: ldc 'Color: #'
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: aload #7
    //   426: ldc 'color'
    //   428: invokevirtual Dne : (Ljava/lang/String;)I
    //   431: invokestatic toHexString : (I)Ljava/lang/String;
    //   434: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: invokevirtual toString : ()Ljava/lang/String;
    //   443: invokevirtual add : (Ljava/lang/Object;)Z
    //   446: pop
    //   447: goto -> 479
    //   450: aload_3
    //   451: new java/lang/StringBuilder
    //   454: dup
    //   455: invokespecial <init> : ()V
    //   458: getstatic Dne.EyB : LDne;
    //   461: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   464: ldc 'item.dyed'
    //   466: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   469: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: invokevirtual toString : ()Ljava/lang/String;
    //   475: invokevirtual add : (Ljava/lang/Object;)Z
    //   478: pop
    //   479: aload #7
    //   481: ldc 'Lore'
    //   483: invokevirtual Dne : (Ljava/lang/String;)Z
    //   486: ifeq -> 573
    //   489: aload #7
    //   491: ldc 'Lore'
    //   493: invokevirtual Dne : (Ljava/lang/String;)LmbZ;
    //   496: astore #8
    //   498: aload #8
    //   500: invokevirtual Dne : ()I
    //   503: ifle -> 573
    //   506: iconst_0
    //   507: istore #9
    //   509: iload #9
    //   511: aload #8
    //   513: invokevirtual Dne : ()I
    //   516: if_icmpge -> 573
    //   519: aload_3
    //   520: new java/lang/StringBuilder
    //   523: dup
    //   524: invokespecial <init> : ()V
    //   527: getstatic Dne.zGp : LDne;
    //   530: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   533: ldc ''
    //   535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   538: getstatic Dne.EyB : LDne;
    //   541: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   544: aload #8
    //   546: iload #9
    //   548: invokevirtual FWm : (I)LoNe;
    //   551: checkcast QNx
    //   554: getfield Dne : Ljava/lang/String;
    //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: invokevirtual toString : ()Ljava/lang/String;
    //   563: invokevirtual add : (Ljava/lang/Object;)Z
    //   566: pop
    //   567: iinc #9, 1
    //   570: goto -> 509
    //   573: iload_2
    //   574: ifeq -> 628
    //   577: aload_0
    //   578: invokevirtual Qnq : ()Z
    //   581: ifeq -> 628
    //   584: aload_3
    //   585: new java/lang/StringBuilder
    //   588: dup
    //   589: invokespecial <init> : ()V
    //   592: ldc 'Durability: '
    //   594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   597: aload_0
    //   598: invokevirtual aFZ : ()I
    //   601: aload_0
    //   602: invokevirtual bzF : ()I
    //   605: isub
    //   606: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   609: ldc ' / '
    //   611: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   614: aload_0
    //   615: invokevirtual aFZ : ()I
    //   618: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   621: invokevirtual toString : ()Ljava/lang/String;
    //   624: invokevirtual add : (Ljava/lang/Object;)Z
    //   627: pop
    //   628: aload_3
    //   629: areturn
  }
  
  public een Dne() {
    return Dne().Dne(this);
  }
  
  public boolean Dne(zKP paramzKP) {
    return dEr.Dne[this.bzF].Dne(paramzKP);
  }
  
  public boolean zGp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LWkD;
    //   4: ifnonnull -> 11
    //   7: iconst_0
    //   8: goto -> 41
    //   11: aload_0
    //   12: getfield Dne : LWkD;
    //   15: ldc 'display'
    //   17: invokevirtual Dne : (Ljava/lang/String;)Z
    //   20: ifne -> 27
    //   23: iconst_0
    //   24: goto -> 41
    //   27: aload_0
    //   28: getfield Dne : LWkD;
    //   31: ldc 'display'
    //   33: invokevirtual Dne : (Ljava/lang/String;)LWkD;
    //   36: ldc 'Name'
    //   38: invokevirtual Dne : (Ljava/lang/String;)Z
    //   41: ireturn
  }
  
  public boolean aFZ() {
    return (this.Dne != null);
  }
  
  private NMq() {
    this.Dne = null;
  }
  
  public BPY Dne() {
    return this.Dne;
  }
  
  public void Dne(int paramInt, FUH paramFUH) {
    if ((!(paramFUH instanceof FiG) || !((uqg)((FiG)paramFUH).Dne).Qnq) && FWm() && Dne(paramInt, paramFUH.Dne())) {
      paramFUH.FWm(this);
      if (paramFUH instanceof FiG)
        ((FiG)paramFUH).Dne((RLC)trP.Qnq[this.bzF], 1); 
      this.Dne--;
      if (this.Dne < 0)
        this.Dne = 0; 
      this.Qnq = 0;
    } 
  }
  
  public void Dne(ycv paramycv, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LWkD;
    //   4: ifnonnull -> 18
    //   7: aload_0
    //   8: new WkD
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: invokevirtual FWm : (LWkD;)V
    //   18: aload_0
    //   19: getfield Dne : LWkD;
    //   22: ldc_w 'ench'
    //   25: invokevirtual Dne : (Ljava/lang/String;)Z
    //   28: ifne -> 51
    //   31: aload_0
    //   32: getfield Dne : LWkD;
    //   35: ldc_w 'ench'
    //   38: new mbZ
    //   41: dup
    //   42: ldc_w 'ench'
    //   45: invokespecial <init> : (Ljava/lang/String;)V
    //   48: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   51: aload_0
    //   52: getfield Dne : LWkD;
    //   55: ldc_w 'ench'
    //   58: invokevirtual Dne : (Ljava/lang/String;)LoNe;
    //   61: checkcast mbZ
    //   64: astore_3
    //   65: new WkD
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: astore #4
    //   74: aload #4
    //   76: ldc 'id'
    //   78: aload_1
    //   79: getfield FWm : I
    //   82: i2s
    //   83: invokevirtual Dne : (Ljava/lang/String;S)V
    //   86: aload #4
    //   88: ldc 'lvl'
    //   90: iload_2
    //   91: i2b
    //   92: i2s
    //   93: invokevirtual Dne : (Ljava/lang/String;S)V
    //   96: aload_3
    //   97: aload #4
    //   99: invokevirtual Dne : (LoNe;)V
    //   102: return
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FiG paramFiG) {
    boolean bool = dEr.Dne[this.bzF].Dne(this, paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFiG);
    if (bool)
      paramFiG.Dne((RLC)trP.bzF[this.bzF], 1); 
  }
  
  public dEr Dne() {
    return dEr.Dne[this.bzF];
  }
  
  public void FWm(Qnq paramQnq, FiG paramFiG, int paramInt) {
    Dne().Dne(this, paramQnq, paramFiG, paramInt);
  }
  
  public void Dne(Qnq paramQnq, FiG paramFiG, int paramInt) {
    paramFiG.Dne(trP.FWm[this.bzF], paramInt);
    dEr.Dne[this.bzF].FWm(this, paramQnq, paramFiG);
  }
  
  public gDn Dne() {
    return Dne().Dne(this);
  }
  
  public float Dne(zKP paramzKP) {
    return Dne().Dne(this, paramzKP);
  }
  
  public static boolean FWm(NMq paramNMq1, NMq paramNMq2) {
    return (paramNMq1 == null && paramNMq2 == null) ? true : ((paramNMq1 != null && paramNMq2 != null) ? paramNMq1.FWm(paramNMq2) : false);
  }
  
  public void Dne(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LWkD;
    //   4: ifnonnull -> 21
    //   7: aload_0
    //   8: new WkD
    //   11: dup
    //   12: ldc_w 'tag'
    //   15: invokespecial <init> : (Ljava/lang/String;)V
    //   18: putfield Dne : LWkD;
    //   21: aload_0
    //   22: getfield Dne : LWkD;
    //   25: ldc 'display'
    //   27: invokevirtual Dne : (Ljava/lang/String;)Z
    //   30: ifne -> 49
    //   33: aload_0
    //   34: getfield Dne : LWkD;
    //   37: ldc 'display'
    //   39: new WkD
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: invokevirtual Dne : (Ljava/lang/String;LWkD;)V
    //   49: aload_0
    //   50: getfield Dne : LWkD;
    //   53: ldc 'display'
    //   55: invokevirtual Dne : (Ljava/lang/String;)LWkD;
    //   58: ldc 'Name'
    //   60: aload_1
    //   61: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   64: return
  }
  
  public void Dne(String paramString, oNe paramoNe) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LWkD;
    //   4: ifnonnull -> 18
    //   7: aload_0
    //   8: new WkD
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: invokevirtual FWm : (LWkD;)V
    //   18: aload_0
    //   19: getfield Dne : LWkD;
    //   22: aload_1
    //   23: aload_2
    //   24: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   27: return
  }
  
  public boolean XHL() {
    return (this.Dne != null);
  }
  
  public String FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Dne : ()LdEr;
    //   4: aload_0
    //   5: invokevirtual Qnq : (LNMq;)Ljava/lang/String;
    //   8: astore_1
    //   9: aload_0
    //   10: getfield Dne : LWkD;
    //   13: ifnull -> 54
    //   16: aload_0
    //   17: getfield Dne : LWkD;
    //   20: ldc 'display'
    //   22: invokevirtual Dne : (Ljava/lang/String;)Z
    //   25: ifeq -> 54
    //   28: aload_0
    //   29: getfield Dne : LWkD;
    //   32: ldc 'display'
    //   34: invokevirtual Dne : (Ljava/lang/String;)LWkD;
    //   37: astore_2
    //   38: aload_2
    //   39: ldc 'Name'
    //   41: invokevirtual Dne : (Ljava/lang/String;)Z
    //   44: ifeq -> 54
    //   47: aload_2
    //   48: ldc 'Name'
    //   50: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   53: astore_1
    //   54: aload_1
    //   55: areturn
  }
  
  public int Dne(sMa paramsMa) {
    return dEr.Dne[this.bzF].Dne(paramsMa);
  }
  
  public NMq(zKP paramzKP) {
    this(paramzKP, 1);
  }
  
  public NMq(dEr paramdEr) {
    this(paramdEr.Qnq, 1, 0);
  }
  
  public static NMq Dne(WkD paramWkD) {
    NMq nMq = new NMq();
    nMq.Dne(paramWkD);
    return (nMq.Dne() != null) ? nMq : null;
  }
  
  public int DyG() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual aFZ : ()Z
    //   4: ifeq -> 33
    //   7: aload_0
    //   8: getfield Dne : LWkD;
    //   11: ldc_w 'RepairCost'
    //   14: invokevirtual Dne : (Ljava/lang/String;)Z
    //   17: ifeq -> 33
    //   20: aload_0
    //   21: getfield Dne : LWkD;
    //   24: ldc_w 'RepairCost'
    //   27: invokevirtual Dne : (Ljava/lang/String;)I
    //   30: goto -> 34
    //   33: iconst_0
    //   34: ireturn
  }
  
  public int bzF() {
    return this.Qnq;
  }
  
  public NMq(dEr paramdEr, int paramInt1, int paramInt2) {
    this(paramdEr.Qnq, paramInt1, paramInt2);
  }
  
  public int Qnq() {
    return this.Qnq;
  }
  
  public boolean bzF() {
    return dEr.Dne[this.bzF].zGp();
  }
  
  public boolean Dne(FUH paramFUH) {
    return dEr.Dne[this.bzF].Dne(this, paramFUH);
  }
  
  public void Dne(BPY paramBPY) {
    this.Dne = paramBPY;
  }
  
  public boolean div() {
    return !Dne().a_(this) ? false : (!IjH());
  }
  
  public boolean FWm() {
    return (dEr.Dne[this.bzF].aFZ() > 0);
  }
  
  public mbZ Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LWkD;
    //   4: ifnonnull -> 11
    //   7: aconst_null
    //   8: goto -> 24
    //   11: aload_0
    //   12: getfield Dne : LWkD;
    //   15: ldc_w 'ench'
    //   18: invokevirtual Dne : (Ljava/lang/String;)LoNe;
    //   21: checkcast mbZ
    //   24: areturn
  }
  
  public static boolean Dne(NMq paramNMq1, NMq paramNMq2) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 12
    //   4: aload_1
    //   5: ifnonnull -> 12
    //   8: iconst_1
    //   9: goto -> 68
    //   12: aload_0
    //   13: ifnull -> 67
    //   16: aload_1
    //   17: ifnull -> 67
    //   20: aload_0
    //   21: getfield Dne : LWkD;
    //   24: ifnonnull -> 38
    //   27: aload_1
    //   28: getfield Dne : LWkD;
    //   31: ifnull -> 38
    //   34: iconst_0
    //   35: goto -> 68
    //   38: aload_0
    //   39: getfield Dne : LWkD;
    //   42: ifnull -> 59
    //   45: aload_0
    //   46: getfield Dne : LWkD;
    //   49: aload_1
    //   50: getfield Dne : LWkD;
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_1
    //   60: goto -> 68
    //   63: iconst_0
    //   64: goto -> 68
    //   67: iconst_0
    //   68: ireturn
  }
  
  public int Dne() {
    return Dne().bzF();
  }
  
  public WkD Dne() {
    return this.Dne;
  }
  
  public boolean Dne(int paramInt, Random paramRandom) {
    if (!FWm())
      return false; 
    if (paramInt > 0) {
      int i = UYp.Dne(ycv.qLR.FWm, this);
      byte b1 = 0;
      for (byte b2 = 0; i > 0 && b2 < paramInt; b2++) {
        if (Nkb.Dne(this, i, paramRandom))
          b1++; 
      } 
      paramInt -= b1;
      if (paramInt <= 0)
        return false; 
    } 
    this.Qnq += paramInt;
    return (this.Qnq > aFZ());
  }
  
  public NMq(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = null;
    this.bzF = paramInt1;
    this.Dne = paramInt2;
    this.Qnq = paramInt3;
    if (this.Qnq < 0)
      this.Qnq = 0; 
  }
  
  public int FWm() {
    return Dne().Qnq();
  }
  
  private boolean FWm(NMq paramNMq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: aload_1
    //   5: getfield Dne : I
    //   8: if_icmpeq -> 15
    //   11: iconst_0
    //   12: goto -> 89
    //   15: aload_0
    //   16: getfield bzF : I
    //   19: aload_1
    //   20: getfield bzF : I
    //   23: if_icmpeq -> 30
    //   26: iconst_0
    //   27: goto -> 89
    //   30: aload_0
    //   31: getfield Qnq : I
    //   34: aload_1
    //   35: getfield Qnq : I
    //   38: if_icmpeq -> 45
    //   41: iconst_0
    //   42: goto -> 89
    //   45: aload_0
    //   46: getfield Dne : LWkD;
    //   49: ifnonnull -> 63
    //   52: aload_1
    //   53: getfield Dne : LWkD;
    //   56: ifnull -> 63
    //   59: iconst_0
    //   60: goto -> 89
    //   63: aload_0
    //   64: getfield Dne : LWkD;
    //   67: ifnull -> 84
    //   70: aload_0
    //   71: getfield Dne : LWkD;
    //   74: aload_1
    //   75: getfield Dne : LWkD;
    //   78: invokevirtual equals : (Ljava/lang/Object;)Z
    //   81: ifeq -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: ireturn
  }
  
  public GXY Dne() {
    return Dne().Dne(this);
  }
  
  public void Dne(WkD paramWkD) {
    this.bzF = paramWkD.Dne("id");
    this.Dne = paramWkD.Dne("Count");
    this.Qnq = paramWkD.Dne("Damage");
    if (this.Qnq < 0)
      this.Qnq = 0; 
    if (paramWkD.Dne("tag"))
      this.Dne = paramWkD.Dne("tag"); 
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual aFZ : ()Z
    //   4: ifne -> 21
    //   7: aload_0
    //   8: new WkD
    //   11: dup
    //   12: ldc_w 'tag'
    //   15: invokespecial <init> : (Ljava/lang/String;)V
    //   18: putfield Dne : LWkD;
    //   21: aload_0
    //   22: getfield Dne : LWkD;
    //   25: ldc_w 'RepairCost'
    //   28: iload_1
    //   29: invokevirtual Dne : (Ljava/lang/String;I)V
    //   32: return
  }
  
  public NMq(dEr paramdEr, int paramInt) {
    this(paramdEr.Qnq, paramInt, 0);
  }
  
  public void Dne(int paramInt) {
    this.Qnq = paramInt;
    if (this.Qnq < 0)
      this.Qnq = 0; 
  }
  
  public NMq(zKP paramzKP, int paramInt1, int paramInt2) {
    this(paramzKP.FWm, paramInt1, paramInt2);
  }
  
  public boolean Qnq() {
    return (FWm() && this.Qnq > 0);
  }
  
  public boolean IjH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LWkD;
    //   4: ifnull -> 24
    //   7: aload_0
    //   8: getfield Dne : LWkD;
    //   11: ldc_w 'ench'
    //   14: invokevirtual Dne : (Ljava/lang/String;)Z
    //   17: ifeq -> 24
    //   20: iconst_1
    //   21: goto -> 25
    //   24: iconst_0
    //   25: ireturn
  }
  
  public boolean DyG() {
    return Dne().FWm(this);
  }
  
  public boolean mrb() {
    return Dne().XHL();
  }
  
  public NMq Dne() {
    // Byte code:
    //   0: new NMq
    //   3: dup
    //   4: aload_0
    //   5: getfield bzF : I
    //   8: aload_0
    //   9: getfield Dne : I
    //   12: aload_0
    //   13: getfield Qnq : I
    //   16: invokespecial <init> : (III)V
    //   19: astore_1
    //   20: aload_0
    //   21: getfield Dne : LWkD;
    //   24: ifnull -> 41
    //   27: aload_1
    //   28: aload_0
    //   29: getfield Dne : LWkD;
    //   32: invokevirtual Dne : ()LoNe;
    //   35: checkcast WkD
    //   38: putfield Dne : LWkD;
    //   41: aload_1
    //   42: areturn
  }
  
  public String toString() {
    return this.Dne + "x" + dEr.Dne[this.bzF].FWm() + "@" + this.Qnq;
  }
  
  public void Dne(Qnq paramQnq, sMa paramsMa, int paramInt, boolean paramBoolean) {
    if (this.FWm > 0)
      this.FWm--; 
    dEr.Dne[this.bzF].Dne(this, paramQnq, paramsMa, paramInt, paramBoolean);
  }
  
  public void Dne(FUH paramFUH, FiG paramFiG) {
    boolean bool = dEr.Dne[this.bzF].Dne(this, paramFUH, paramFiG);
    if (bool)
      paramFiG.Dne((RLC)trP.bzF[this.bzF], 1); 
  }
  
  public WkD Dne(WkD paramWkD) {
    paramWkD.Dne("id", (short)this.bzF);
    paramWkD.Dne("Count", (byte)this.Dne);
    paramWkD.Dne("Damage", (short)this.Qnq);
    if (this.Dne != null)
      paramWkD.Dne("tag", this.Dne); 
    return paramWkD;
  }
  
  public NMq FWm(Qnq paramQnq, FiG paramFiG) {
    return Dne().FWm(this, paramQnq, paramFiG);
  }
  
  public boolean Dne(NMq paramNMq) {
    return (this.bzF == paramNMq.bzF && this.Qnq == paramNMq.Qnq);
  }
  
  public void FWm(WkD paramWkD) {
    this.Dne = paramWkD;
  }
  
  public boolean Dne() {
    return (FWm() > 1 && (!FWm() || !Qnq()));
  }
  
  public NMq Dne(Qnq paramQnq, FiG paramFiG) {
    return Dne().Dne(this, paramQnq, paramFiG);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NMq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */