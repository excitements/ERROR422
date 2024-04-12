import java.util.List;
import net.minecraft.client.Minecraft;

public abstract class LSv {
  private int DyG;
  
  private int mrb;
  
  protected int zGp;
  
  private int kGO;
  
  private boolean Dne;
  
  private int Dne;
  
  private long Dne;
  
  private float Dne;
  
  private boolean FWm;
  
  protected int bzF;
  
  private float bzF;
  
  protected int FWm;
  
  protected int aFZ;
  
  private int Zpi = -1;
  
  private int XHL;
  
  private float FWm;
  
  private final Minecraft Dne = -2.0F;
  
  private int div;
  
  protected final int Qnq;
  
  private int IjH;
  
  protected int FWm() {
    return this.Dne / 2 + 124;
  }
  
  protected abstract void Dne(int paramInt, boolean paramBoolean);
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    this.FWm = paramBoolean;
    this.kGO = paramInt;
    if (!paramBoolean)
      this.kGO = 0; 
  }
  
  public void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == this.mrb) {
        this.bzF -= (this.Qnq * 2 / 3);
        this.Dne = -2.0F;
        FWm();
      } else if (paramPee.aFZ == this.XHL) {
        this.bzF += (this.Qnq * 2 / 3);
        this.Dne = -2.0F;
        FWm();
      }  
  }
  
  public int Qnq() {
    return bzF() - this.bzF - this.FWm - 4;
  }
  
  public int Dne(int paramInt1, int paramInt2) {
    int i = this.Dne / 2 - 110;
    int j = this.Dne / 2 + 110;
    int k = paramInt2 - this.FWm - this.kGO + (int)this.bzF - 4;
    int m = k / this.Qnq;
    return (paramInt1 >= i && paramInt1 <= j && m >= 0 && k >= 0 && m < Dne()) ? m : -1;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {}
  
  protected void Dne(int paramInt1, int paramInt2, WAR paramWAR) {}
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = paramInt1;
    this.DyG = paramInt2;
    this.FWm = paramInt3;
    this.bzF = paramInt4;
    this.IjH = 0;
    this.div = paramInt1;
  }
  
  private void FWm() {
    int i = Qnq();
    if (i < 0)
      i /= 2; 
    if (this.bzF < 0.0F)
      this.bzF = 0.0F; 
    if (this.bzF > i)
      this.bzF = i; 
  }
  
  protected abstract void Dne();
  
  protected abstract boolean Dne(int paramInt);
  
  public void Dne(int paramInt) {
    this.bzF += paramInt;
    FWm();
    this.Dne = -2.0F;
  }
  
  protected abstract int Dne();
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: getstatic WAR.Dne : LWAR;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   9: getfield Dne : LSnh;
    //   12: ldc '/rock.png'
    //   14: invokevirtual Dne : (Ljava/lang/String;)V
    //   17: fconst_1
    //   18: fconst_1
    //   19: fconst_1
    //   20: fconst_1
    //   21: invokestatic glColor4f : (FFFF)V
    //   24: ldc 32.0
    //   26: fstore #6
    //   28: aload #5
    //   30: invokevirtual Dne : ()V
    //   33: aload #5
    //   35: ldc 4210752
    //   37: iload #4
    //   39: invokevirtual Dne : (II)V
    //   42: aload #5
    //   44: dconst_0
    //   45: iload_2
    //   46: i2d
    //   47: dconst_0
    //   48: dconst_0
    //   49: iload_2
    //   50: i2f
    //   51: fload #6
    //   53: fdiv
    //   54: f2d
    //   55: invokevirtual Dne : (DDDDD)V
    //   58: aload #5
    //   60: aload_0
    //   61: getfield Dne : I
    //   64: i2d
    //   65: iload_2
    //   66: i2d
    //   67: dconst_0
    //   68: aload_0
    //   69: getfield Dne : I
    //   72: i2f
    //   73: fload #6
    //   75: fdiv
    //   76: f2d
    //   77: iload_2
    //   78: i2f
    //   79: fload #6
    //   81: fdiv
    //   82: f2d
    //   83: invokevirtual Dne : (DDDDD)V
    //   86: aload #5
    //   88: ldc 4210752
    //   90: iload_3
    //   91: invokevirtual Dne : (II)V
    //   94: aload #5
    //   96: aload_0
    //   97: getfield Dne : I
    //   100: i2d
    //   101: iload_1
    //   102: i2d
    //   103: dconst_0
    //   104: aload_0
    //   105: getfield Dne : I
    //   108: i2f
    //   109: fload #6
    //   111: fdiv
    //   112: f2d
    //   113: iload_1
    //   114: i2f
    //   115: fload #6
    //   117: fdiv
    //   118: f2d
    //   119: invokevirtual Dne : (DDDDD)V
    //   122: aload #5
    //   124: dconst_0
    //   125: iload_1
    //   126: i2d
    //   127: dconst_0
    //   128: dconst_0
    //   129: iload_1
    //   130: i2f
    //   131: fload #6
    //   133: fdiv
    //   134: f2d
    //   135: invokevirtual Dne : (DDDDD)V
    //   138: aload #5
    //   140: invokevirtual Dne : ()I
    //   143: pop
    //   144: return
  }
  
  public LSv(Minecraft paramMinecraft, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.Dne = 0L;
    this.Dne = true;
    this.Dne = paramMinecraft;
    this.Dne = paramInt1;
    this.DyG = paramInt2;
    this.FWm = paramInt3;
    this.bzF = paramInt4;
    this.Qnq = paramInt5;
    this.IjH = 0;
    this.div = paramInt1;
  }
  
  protected int bzF() {
    return Dne() * this.Qnq + this.kGO;
  }
  
  protected abstract void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR);
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield aFZ : I
    //   5: aload_0
    //   6: iload_2
    //   7: putfield zGp : I
    //   10: aload_0
    //   11: invokevirtual Dne : ()V
    //   14: aload_0
    //   15: invokevirtual Dne : ()I
    //   18: istore #4
    //   20: aload_0
    //   21: invokevirtual FWm : ()I
    //   24: istore #5
    //   26: iload #5
    //   28: bipush #6
    //   30: iadd
    //   31: istore #6
    //   33: iconst_0
    //   34: invokestatic isButtonDown : (I)Z
    //   37: ifeq -> 456
    //   40: aload_0
    //   41: getfield Dne : F
    //   44: ldc -1.0
    //   46: fcmpl
    //   47: ifne -> 417
    //   50: iconst_1
    //   51: istore #12
    //   53: iload_2
    //   54: aload_0
    //   55: getfield FWm : I
    //   58: if_icmplt -> 408
    //   61: iload_2
    //   62: aload_0
    //   63: getfield bzF : I
    //   66: if_icmpgt -> 408
    //   69: aload_0
    //   70: getfield Dne : I
    //   73: iconst_2
    //   74: idiv
    //   75: bipush #110
    //   77: isub
    //   78: istore #13
    //   80: aload_0
    //   81: getfield Dne : I
    //   84: iconst_2
    //   85: idiv
    //   86: bipush #110
    //   88: iadd
    //   89: istore #7
    //   91: iload_2
    //   92: aload_0
    //   93: getfield FWm : I
    //   96: isub
    //   97: aload_0
    //   98: getfield kGO : I
    //   101: isub
    //   102: aload_0
    //   103: getfield bzF : F
    //   106: f2i
    //   107: iadd
    //   108: iconst_4
    //   109: isub
    //   110: istore #8
    //   112: iload #8
    //   114: aload_0
    //   115: getfield Qnq : I
    //   118: idiv
    //   119: istore #9
    //   121: iload_1
    //   122: iload #13
    //   124: if_icmplt -> 205
    //   127: iload_1
    //   128: iload #7
    //   130: if_icmpgt -> 205
    //   133: iload #9
    //   135: iflt -> 205
    //   138: iload #8
    //   140: iflt -> 205
    //   143: iload #9
    //   145: iload #4
    //   147: if_icmpge -> 205
    //   150: iload #9
    //   152: aload_0
    //   153: getfield Zpi : I
    //   156: if_icmpne -> 178
    //   159: invokestatic Dne : ()J
    //   162: aload_0
    //   163: getfield Dne : J
    //   166: lsub
    //   167: ldc2_w 250
    //   170: lcmp
    //   171: ifge -> 178
    //   174: iconst_1
    //   175: goto -> 179
    //   178: iconst_0
    //   179: istore #14
    //   181: aload_0
    //   182: iload #9
    //   184: iload #14
    //   186: invokevirtual Dne : (IZ)V
    //   189: aload_0
    //   190: iload #9
    //   192: putfield Zpi : I
    //   195: aload_0
    //   196: invokestatic Dne : ()J
    //   199: putfield Dne : J
    //   202: goto -> 247
    //   205: iload_1
    //   206: iload #13
    //   208: if_icmplt -> 247
    //   211: iload_1
    //   212: iload #7
    //   214: if_icmpgt -> 247
    //   217: iload #8
    //   219: ifge -> 247
    //   222: aload_0
    //   223: iload_1
    //   224: iload #13
    //   226: isub
    //   227: iload_2
    //   228: aload_0
    //   229: getfield FWm : I
    //   232: isub
    //   233: aload_0
    //   234: getfield bzF : F
    //   237: f2i
    //   238: iadd
    //   239: iconst_4
    //   240: isub
    //   241: invokevirtual Dne : (II)V
    //   244: iconst_0
    //   245: istore #12
    //   247: iload_1
    //   248: iload #5
    //   250: if_icmplt -> 380
    //   253: iload_1
    //   254: iload #6
    //   256: if_icmpgt -> 380
    //   259: aload_0
    //   260: ldc -1.0
    //   262: putfield FWm : F
    //   265: aload_0
    //   266: invokevirtual Qnq : ()I
    //   269: istore #11
    //   271: iload #11
    //   273: iconst_1
    //   274: if_icmpge -> 280
    //   277: iconst_1
    //   278: istore #11
    //   280: aload_0
    //   281: getfield bzF : I
    //   284: aload_0
    //   285: getfield FWm : I
    //   288: isub
    //   289: aload_0
    //   290: getfield bzF : I
    //   293: aload_0
    //   294: getfield FWm : I
    //   297: isub
    //   298: imul
    //   299: i2f
    //   300: aload_0
    //   301: invokevirtual bzF : ()I
    //   304: i2f
    //   305: fdiv
    //   306: f2i
    //   307: istore #10
    //   309: iload #10
    //   311: bipush #32
    //   313: if_icmpge -> 320
    //   316: bipush #32
    //   318: istore #10
    //   320: iload #10
    //   322: aload_0
    //   323: getfield bzF : I
    //   326: aload_0
    //   327: getfield FWm : I
    //   330: isub
    //   331: bipush #8
    //   333: isub
    //   334: if_icmple -> 351
    //   337: aload_0
    //   338: getfield bzF : I
    //   341: aload_0
    //   342: getfield FWm : I
    //   345: isub
    //   346: bipush #8
    //   348: isub
    //   349: istore #10
    //   351: aload_0
    //   352: dup
    //   353: getfield FWm : F
    //   356: aload_0
    //   357: getfield bzF : I
    //   360: aload_0
    //   361: getfield FWm : I
    //   364: isub
    //   365: iload #10
    //   367: isub
    //   368: i2f
    //   369: iload #11
    //   371: i2f
    //   372: fdiv
    //   373: fdiv
    //   374: putfield FWm : F
    //   377: goto -> 385
    //   380: aload_0
    //   381: fconst_1
    //   382: putfield FWm : F
    //   385: iload #12
    //   387: ifeq -> 399
    //   390: aload_0
    //   391: iload_2
    //   392: i2f
    //   393: putfield Dne : F
    //   396: goto -> 405
    //   399: aload_0
    //   400: ldc -2.0
    //   402: putfield Dne : F
    //   405: goto -> 414
    //   408: aload_0
    //   409: ldc -2.0
    //   411: putfield Dne : F
    //   414: goto -> 532
    //   417: aload_0
    //   418: getfield Dne : F
    //   421: fconst_0
    //   422: fcmpl
    //   423: iflt -> 532
    //   426: aload_0
    //   427: dup
    //   428: getfield bzF : F
    //   431: iload_2
    //   432: i2f
    //   433: aload_0
    //   434: getfield Dne : F
    //   437: fsub
    //   438: aload_0
    //   439: getfield FWm : F
    //   442: fmul
    //   443: fsub
    //   444: putfield bzF : F
    //   447: aload_0
    //   448: iload_2
    //   449: i2f
    //   450: putfield Dne : F
    //   453: goto -> 532
    //   456: aload_0
    //   457: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   460: getfield Dne : LfZI;
    //   463: getfield ATE : Z
    //   466: ifne -> 526
    //   469: invokestatic next : ()Z
    //   472: ifeq -> 526
    //   475: invokestatic getEventDWheel : ()I
    //   478: istore #12
    //   480: iload #12
    //   482: ifeq -> 523
    //   485: iload #12
    //   487: ifle -> 496
    //   490: iconst_m1
    //   491: istore #12
    //   493: goto -> 504
    //   496: iload #12
    //   498: ifge -> 504
    //   501: iconst_1
    //   502: istore #12
    //   504: aload_0
    //   505: dup
    //   506: getfield bzF : F
    //   509: iload #12
    //   511: aload_0
    //   512: getfield Qnq : I
    //   515: imul
    //   516: iconst_2
    //   517: idiv
    //   518: i2f
    //   519: fadd
    //   520: putfield bzF : F
    //   523: goto -> 456
    //   526: aload_0
    //   527: ldc -1.0
    //   529: putfield Dne : F
    //   532: aload_0
    //   533: invokespecial FWm : ()V
    //   536: sipush #2896
    //   539: invokestatic glDisable : (I)V
    //   542: sipush #2912
    //   545: invokestatic glDisable : (I)V
    //   548: getstatic WAR.Dne : LWAR;
    //   551: astore #12
    //   553: aload_0
    //   554: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   557: getfield Dne : LSnh;
    //   560: ldc '/rock.png'
    //   562: invokevirtual Dne : (Ljava/lang/String;)V
    //   565: fconst_1
    //   566: fconst_1
    //   567: fconst_1
    //   568: fconst_1
    //   569: invokestatic glColor4f : (FFFF)V
    //   572: ldc 32.0
    //   574: fstore #13
    //   576: aload #12
    //   578: invokevirtual Dne : ()V
    //   581: aload #12
    //   583: ldc 2105376
    //   585: invokevirtual bzF : (I)V
    //   588: aload #12
    //   590: aload_0
    //   591: getfield IjH : I
    //   594: i2d
    //   595: aload_0
    //   596: getfield bzF : I
    //   599: i2d
    //   600: dconst_0
    //   601: aload_0
    //   602: getfield IjH : I
    //   605: i2f
    //   606: fload #13
    //   608: fdiv
    //   609: f2d
    //   610: aload_0
    //   611: getfield bzF : I
    //   614: aload_0
    //   615: getfield bzF : F
    //   618: f2i
    //   619: iadd
    //   620: i2f
    //   621: fload #13
    //   623: fdiv
    //   624: f2d
    //   625: invokevirtual Dne : (DDDDD)V
    //   628: aload #12
    //   630: aload_0
    //   631: getfield div : I
    //   634: i2d
    //   635: aload_0
    //   636: getfield bzF : I
    //   639: i2d
    //   640: dconst_0
    //   641: aload_0
    //   642: getfield div : I
    //   645: i2f
    //   646: fload #13
    //   648: fdiv
    //   649: f2d
    //   650: aload_0
    //   651: getfield bzF : I
    //   654: aload_0
    //   655: getfield bzF : F
    //   658: f2i
    //   659: iadd
    //   660: i2f
    //   661: fload #13
    //   663: fdiv
    //   664: f2d
    //   665: invokevirtual Dne : (DDDDD)V
    //   668: aload #12
    //   670: aload_0
    //   671: getfield div : I
    //   674: i2d
    //   675: aload_0
    //   676: getfield FWm : I
    //   679: i2d
    //   680: dconst_0
    //   681: aload_0
    //   682: getfield div : I
    //   685: i2f
    //   686: fload #13
    //   688: fdiv
    //   689: f2d
    //   690: aload_0
    //   691: getfield FWm : I
    //   694: aload_0
    //   695: getfield bzF : F
    //   698: f2i
    //   699: iadd
    //   700: i2f
    //   701: fload #13
    //   703: fdiv
    //   704: f2d
    //   705: invokevirtual Dne : (DDDDD)V
    //   708: aload #12
    //   710: aload_0
    //   711: getfield IjH : I
    //   714: i2d
    //   715: aload_0
    //   716: getfield FWm : I
    //   719: i2d
    //   720: dconst_0
    //   721: aload_0
    //   722: getfield IjH : I
    //   725: i2f
    //   726: fload #13
    //   728: fdiv
    //   729: f2d
    //   730: aload_0
    //   731: getfield FWm : I
    //   734: aload_0
    //   735: getfield bzF : F
    //   738: f2i
    //   739: iadd
    //   740: i2f
    //   741: fload #13
    //   743: fdiv
    //   744: f2d
    //   745: invokevirtual Dne : (DDDDD)V
    //   748: aload #12
    //   750: invokevirtual Dne : ()I
    //   753: pop
    //   754: aload_0
    //   755: getfield Dne : I
    //   758: iconst_2
    //   759: idiv
    //   760: bipush #92
    //   762: isub
    //   763: bipush #16
    //   765: isub
    //   766: istore #7
    //   768: aload_0
    //   769: getfield FWm : I
    //   772: iconst_4
    //   773: iadd
    //   774: aload_0
    //   775: getfield bzF : F
    //   778: f2i
    //   779: isub
    //   780: istore #8
    //   782: aload_0
    //   783: getfield FWm : Z
    //   786: ifeq -> 799
    //   789: aload_0
    //   790: iload #7
    //   792: iload #8
    //   794: aload #12
    //   796: invokevirtual Dne : (IILWAR;)V
    //   799: iconst_0
    //   800: istore #9
    //   802: iload #9
    //   804: iload #4
    //   806: if_icmpge -> 1104
    //   809: iload #8
    //   811: iload #9
    //   813: aload_0
    //   814: getfield Qnq : I
    //   817: imul
    //   818: iadd
    //   819: aload_0
    //   820: getfield kGO : I
    //   823: iadd
    //   824: istore #11
    //   826: aload_0
    //   827: getfield Qnq : I
    //   830: iconst_4
    //   831: isub
    //   832: istore #10
    //   834: iload #11
    //   836: aload_0
    //   837: getfield bzF : I
    //   840: if_icmpgt -> 1098
    //   843: iload #11
    //   845: iload #10
    //   847: iadd
    //   848: aload_0
    //   849: getfield FWm : I
    //   852: if_icmplt -> 1098
    //   855: aload_0
    //   856: getfield Dne : Z
    //   859: ifeq -> 1084
    //   862: aload_0
    //   863: iload #9
    //   865: invokevirtual Dne : (I)Z
    //   868: ifeq -> 1084
    //   871: aload_0
    //   872: getfield Dne : I
    //   875: iconst_2
    //   876: idiv
    //   877: bipush #110
    //   879: isub
    //   880: istore #14
    //   882: aload_0
    //   883: getfield Dne : I
    //   886: iconst_2
    //   887: idiv
    //   888: bipush #110
    //   890: iadd
    //   891: istore #15
    //   893: fconst_1
    //   894: fconst_1
    //   895: fconst_1
    //   896: fconst_1
    //   897: invokestatic glColor4f : (FFFF)V
    //   900: sipush #3553
    //   903: invokestatic glDisable : (I)V
    //   906: aload #12
    //   908: invokevirtual Dne : ()V
    //   911: aload #12
    //   913: ldc 8421504
    //   915: invokevirtual bzF : (I)V
    //   918: aload #12
    //   920: iload #14
    //   922: i2d
    //   923: iload #11
    //   925: iload #10
    //   927: iadd
    //   928: iconst_2
    //   929: iadd
    //   930: i2d
    //   931: dconst_0
    //   932: dconst_0
    //   933: dconst_1
    //   934: invokevirtual Dne : (DDDDD)V
    //   937: aload #12
    //   939: iload #15
    //   941: i2d
    //   942: iload #11
    //   944: iload #10
    //   946: iadd
    //   947: iconst_2
    //   948: iadd
    //   949: i2d
    //   950: dconst_0
    //   951: dconst_1
    //   952: dconst_1
    //   953: invokevirtual Dne : (DDDDD)V
    //   956: aload #12
    //   958: iload #15
    //   960: i2d
    //   961: iload #11
    //   963: iconst_2
    //   964: isub
    //   965: i2d
    //   966: dconst_0
    //   967: dconst_1
    //   968: dconst_0
    //   969: invokevirtual Dne : (DDDDD)V
    //   972: aload #12
    //   974: iload #14
    //   976: i2d
    //   977: iload #11
    //   979: iconst_2
    //   980: isub
    //   981: i2d
    //   982: dconst_0
    //   983: dconst_0
    //   984: dconst_0
    //   985: invokevirtual Dne : (DDDDD)V
    //   988: aload #12
    //   990: iconst_0
    //   991: invokevirtual bzF : (I)V
    //   994: aload #12
    //   996: iload #14
    //   998: iconst_1
    //   999: iadd
    //   1000: i2d
    //   1001: iload #11
    //   1003: iload #10
    //   1005: iadd
    //   1006: iconst_1
    //   1007: iadd
    //   1008: i2d
    //   1009: dconst_0
    //   1010: dconst_0
    //   1011: dconst_1
    //   1012: invokevirtual Dne : (DDDDD)V
    //   1015: aload #12
    //   1017: iload #15
    //   1019: iconst_1
    //   1020: isub
    //   1021: i2d
    //   1022: iload #11
    //   1024: iload #10
    //   1026: iadd
    //   1027: iconst_1
    //   1028: iadd
    //   1029: i2d
    //   1030: dconst_0
    //   1031: dconst_1
    //   1032: dconst_1
    //   1033: invokevirtual Dne : (DDDDD)V
    //   1036: aload #12
    //   1038: iload #15
    //   1040: iconst_1
    //   1041: isub
    //   1042: i2d
    //   1043: iload #11
    //   1045: iconst_1
    //   1046: isub
    //   1047: i2d
    //   1048: dconst_0
    //   1049: dconst_1
    //   1050: dconst_0
    //   1051: invokevirtual Dne : (DDDDD)V
    //   1054: aload #12
    //   1056: iload #14
    //   1058: iconst_1
    //   1059: iadd
    //   1060: i2d
    //   1061: iload #11
    //   1063: iconst_1
    //   1064: isub
    //   1065: i2d
    //   1066: dconst_0
    //   1067: dconst_0
    //   1068: dconst_0
    //   1069: invokevirtual Dne : (DDDDD)V
    //   1072: aload #12
    //   1074: invokevirtual Dne : ()I
    //   1077: pop
    //   1078: sipush #3553
    //   1081: invokestatic glEnable : (I)V
    //   1084: aload_0
    //   1085: iload #9
    //   1087: iload #7
    //   1089: iload #11
    //   1091: iload #10
    //   1093: aload #12
    //   1095: invokevirtual Dne : (IIIILWAR;)V
    //   1098: iinc #9, 1
    //   1101: goto -> 802
    //   1104: sipush #2929
    //   1107: invokestatic glDisable : (I)V
    //   1110: iconst_4
    //   1111: istore #15
    //   1113: aload_0
    //   1114: iconst_0
    //   1115: aload_0
    //   1116: getfield FWm : I
    //   1119: sipush #255
    //   1122: sipush #255
    //   1125: invokespecial FWm : (IIII)V
    //   1128: aload_0
    //   1129: aload_0
    //   1130: getfield bzF : I
    //   1133: aload_0
    //   1134: getfield DyG : I
    //   1137: sipush #255
    //   1140: sipush #255
    //   1143: invokespecial FWm : (IIII)V
    //   1146: sipush #3042
    //   1149: invokestatic glEnable : (I)V
    //   1152: sipush #770
    //   1155: sipush #771
    //   1158: invokestatic glBlendFunc : (II)V
    //   1161: sipush #3008
    //   1164: invokestatic glDisable : (I)V
    //   1167: sipush #7425
    //   1170: invokestatic glShadeModel : (I)V
    //   1173: sipush #3553
    //   1176: invokestatic glDisable : (I)V
    //   1179: aload #12
    //   1181: invokevirtual Dne : ()V
    //   1184: aload #12
    //   1186: iconst_0
    //   1187: iconst_0
    //   1188: invokevirtual Dne : (II)V
    //   1191: aload #12
    //   1193: aload_0
    //   1194: getfield IjH : I
    //   1197: i2d
    //   1198: aload_0
    //   1199: getfield FWm : I
    //   1202: iload #15
    //   1204: iadd
    //   1205: i2d
    //   1206: dconst_0
    //   1207: dconst_0
    //   1208: dconst_1
    //   1209: invokevirtual Dne : (DDDDD)V
    //   1212: aload #12
    //   1214: aload_0
    //   1215: getfield div : I
    //   1218: i2d
    //   1219: aload_0
    //   1220: getfield FWm : I
    //   1223: iload #15
    //   1225: iadd
    //   1226: i2d
    //   1227: dconst_0
    //   1228: dconst_1
    //   1229: dconst_1
    //   1230: invokevirtual Dne : (DDDDD)V
    //   1233: aload #12
    //   1235: iconst_0
    //   1236: sipush #255
    //   1239: invokevirtual Dne : (II)V
    //   1242: aload #12
    //   1244: aload_0
    //   1245: getfield div : I
    //   1248: i2d
    //   1249: aload_0
    //   1250: getfield FWm : I
    //   1253: i2d
    //   1254: dconst_0
    //   1255: dconst_1
    //   1256: dconst_0
    //   1257: invokevirtual Dne : (DDDDD)V
    //   1260: aload #12
    //   1262: aload_0
    //   1263: getfield IjH : I
    //   1266: i2d
    //   1267: aload_0
    //   1268: getfield FWm : I
    //   1271: i2d
    //   1272: dconst_0
    //   1273: dconst_0
    //   1274: dconst_0
    //   1275: invokevirtual Dne : (DDDDD)V
    //   1278: aload #12
    //   1280: invokevirtual Dne : ()I
    //   1283: pop
    //   1284: aload #12
    //   1286: invokevirtual Dne : ()V
    //   1289: aload #12
    //   1291: iconst_0
    //   1292: sipush #255
    //   1295: invokevirtual Dne : (II)V
    //   1298: aload #12
    //   1300: aload_0
    //   1301: getfield IjH : I
    //   1304: i2d
    //   1305: aload_0
    //   1306: getfield bzF : I
    //   1309: i2d
    //   1310: dconst_0
    //   1311: dconst_0
    //   1312: dconst_1
    //   1313: invokevirtual Dne : (DDDDD)V
    //   1316: aload #12
    //   1318: aload_0
    //   1319: getfield div : I
    //   1322: i2d
    //   1323: aload_0
    //   1324: getfield bzF : I
    //   1327: i2d
    //   1328: dconst_0
    //   1329: dconst_1
    //   1330: dconst_1
    //   1331: invokevirtual Dne : (DDDDD)V
    //   1334: aload #12
    //   1336: iconst_0
    //   1337: iconst_0
    //   1338: invokevirtual Dne : (II)V
    //   1341: aload #12
    //   1343: aload_0
    //   1344: getfield div : I
    //   1347: i2d
    //   1348: aload_0
    //   1349: getfield bzF : I
    //   1352: iload #15
    //   1354: isub
    //   1355: i2d
    //   1356: dconst_0
    //   1357: dconst_1
    //   1358: dconst_0
    //   1359: invokevirtual Dne : (DDDDD)V
    //   1362: aload #12
    //   1364: aload_0
    //   1365: getfield IjH : I
    //   1368: i2d
    //   1369: aload_0
    //   1370: getfield bzF : I
    //   1373: iload #15
    //   1375: isub
    //   1376: i2d
    //   1377: dconst_0
    //   1378: dconst_0
    //   1379: dconst_0
    //   1380: invokevirtual Dne : (DDDDD)V
    //   1383: aload #12
    //   1385: invokevirtual Dne : ()I
    //   1388: pop
    //   1389: aload_0
    //   1390: invokevirtual Qnq : ()I
    //   1393: istore #11
    //   1395: iload #11
    //   1397: ifle -> 1769
    //   1400: aload_0
    //   1401: getfield bzF : I
    //   1404: aload_0
    //   1405: getfield FWm : I
    //   1408: isub
    //   1409: aload_0
    //   1410: getfield bzF : I
    //   1413: aload_0
    //   1414: getfield FWm : I
    //   1417: isub
    //   1418: imul
    //   1419: aload_0
    //   1420: invokevirtual bzF : ()I
    //   1423: idiv
    //   1424: istore #10
    //   1426: iload #10
    //   1428: bipush #32
    //   1430: if_icmpge -> 1437
    //   1433: bipush #32
    //   1435: istore #10
    //   1437: iload #10
    //   1439: aload_0
    //   1440: getfield bzF : I
    //   1443: aload_0
    //   1444: getfield FWm : I
    //   1447: isub
    //   1448: bipush #8
    //   1450: isub
    //   1451: if_icmple -> 1468
    //   1454: aload_0
    //   1455: getfield bzF : I
    //   1458: aload_0
    //   1459: getfield FWm : I
    //   1462: isub
    //   1463: bipush #8
    //   1465: isub
    //   1466: istore #10
    //   1468: aload_0
    //   1469: getfield bzF : F
    //   1472: f2i
    //   1473: aload_0
    //   1474: getfield bzF : I
    //   1477: aload_0
    //   1478: getfield FWm : I
    //   1481: isub
    //   1482: iload #10
    //   1484: isub
    //   1485: imul
    //   1486: iload #11
    //   1488: idiv
    //   1489: aload_0
    //   1490: getfield FWm : I
    //   1493: iadd
    //   1494: istore #14
    //   1496: iload #14
    //   1498: aload_0
    //   1499: getfield FWm : I
    //   1502: if_icmpge -> 1511
    //   1505: aload_0
    //   1506: getfield FWm : I
    //   1509: istore #14
    //   1511: aload #12
    //   1513: invokevirtual Dne : ()V
    //   1516: aload #12
    //   1518: iconst_0
    //   1519: sipush #255
    //   1522: invokevirtual Dne : (II)V
    //   1525: aload #12
    //   1527: iload #5
    //   1529: i2d
    //   1530: aload_0
    //   1531: getfield bzF : I
    //   1534: i2d
    //   1535: dconst_0
    //   1536: dconst_0
    //   1537: dconst_1
    //   1538: invokevirtual Dne : (DDDDD)V
    //   1541: aload #12
    //   1543: iload #6
    //   1545: i2d
    //   1546: aload_0
    //   1547: getfield bzF : I
    //   1550: i2d
    //   1551: dconst_0
    //   1552: dconst_1
    //   1553: dconst_1
    //   1554: invokevirtual Dne : (DDDDD)V
    //   1557: aload #12
    //   1559: iload #6
    //   1561: i2d
    //   1562: aload_0
    //   1563: getfield FWm : I
    //   1566: i2d
    //   1567: dconst_0
    //   1568: dconst_1
    //   1569: dconst_0
    //   1570: invokevirtual Dne : (DDDDD)V
    //   1573: aload #12
    //   1575: iload #5
    //   1577: i2d
    //   1578: aload_0
    //   1579: getfield FWm : I
    //   1582: i2d
    //   1583: dconst_0
    //   1584: dconst_0
    //   1585: dconst_0
    //   1586: invokevirtual Dne : (DDDDD)V
    //   1589: aload #12
    //   1591: invokevirtual Dne : ()I
    //   1594: pop
    //   1595: aload #12
    //   1597: invokevirtual Dne : ()V
    //   1600: aload #12
    //   1602: ldc 8421504
    //   1604: sipush #255
    //   1607: invokevirtual Dne : (II)V
    //   1610: aload #12
    //   1612: iload #5
    //   1614: i2d
    //   1615: iload #14
    //   1617: iload #10
    //   1619: iadd
    //   1620: i2d
    //   1621: dconst_0
    //   1622: dconst_0
    //   1623: dconst_1
    //   1624: invokevirtual Dne : (DDDDD)V
    //   1627: aload #12
    //   1629: iload #6
    //   1631: i2d
    //   1632: iload #14
    //   1634: iload #10
    //   1636: iadd
    //   1637: i2d
    //   1638: dconst_0
    //   1639: dconst_1
    //   1640: dconst_1
    //   1641: invokevirtual Dne : (DDDDD)V
    //   1644: aload #12
    //   1646: iload #6
    //   1648: i2d
    //   1649: iload #14
    //   1651: i2d
    //   1652: dconst_0
    //   1653: dconst_1
    //   1654: dconst_0
    //   1655: invokevirtual Dne : (DDDDD)V
    //   1658: aload #12
    //   1660: iload #5
    //   1662: i2d
    //   1663: iload #14
    //   1665: i2d
    //   1666: dconst_0
    //   1667: dconst_0
    //   1668: dconst_0
    //   1669: invokevirtual Dne : (DDDDD)V
    //   1672: aload #12
    //   1674: invokevirtual Dne : ()I
    //   1677: pop
    //   1678: aload #12
    //   1680: invokevirtual Dne : ()V
    //   1683: aload #12
    //   1685: ldc 12632256
    //   1687: sipush #255
    //   1690: invokevirtual Dne : (II)V
    //   1693: aload #12
    //   1695: iload #5
    //   1697: i2d
    //   1698: iload #14
    //   1700: iload #10
    //   1702: iadd
    //   1703: iconst_1
    //   1704: isub
    //   1705: i2d
    //   1706: dconst_0
    //   1707: dconst_0
    //   1708: dconst_1
    //   1709: invokevirtual Dne : (DDDDD)V
    //   1712: aload #12
    //   1714: iload #6
    //   1716: iconst_1
    //   1717: isub
    //   1718: i2d
    //   1719: iload #14
    //   1721: iload #10
    //   1723: iadd
    //   1724: iconst_1
    //   1725: isub
    //   1726: i2d
    //   1727: dconst_0
    //   1728: dconst_1
    //   1729: dconst_1
    //   1730: invokevirtual Dne : (DDDDD)V
    //   1733: aload #12
    //   1735: iload #6
    //   1737: iconst_1
    //   1738: isub
    //   1739: i2d
    //   1740: iload #14
    //   1742: i2d
    //   1743: dconst_0
    //   1744: dconst_1
    //   1745: dconst_0
    //   1746: invokevirtual Dne : (DDDDD)V
    //   1749: aload #12
    //   1751: iload #5
    //   1753: i2d
    //   1754: iload #14
    //   1756: i2d
    //   1757: dconst_0
    //   1758: dconst_0
    //   1759: dconst_0
    //   1760: invokevirtual Dne : (DDDDD)V
    //   1763: aload #12
    //   1765: invokevirtual Dne : ()I
    //   1768: pop
    //   1769: aload_0
    //   1770: iload_1
    //   1771: iload_2
    //   1772: invokevirtual FWm : (II)V
    //   1775: sipush #3553
    //   1778: invokestatic glEnable : (I)V
    //   1781: sipush #7424
    //   1784: invokestatic glShadeModel : (I)V
    //   1787: sipush #3008
    //   1790: invokestatic glEnable : (I)V
    //   1793: sipush #3042
    //   1796: invokestatic glDisable : (I)V
    //   1799: return
  }
  
  public void Dne(List paramList, int paramInt1, int paramInt2) {
    this.mrb = paramInt1;
    this.XHL = paramInt2;
  }
  
  protected void FWm(int paramInt1, int paramInt2) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LSv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */