import java.util.Random;
import net.minecraft.client.Minecraft;

public class IfV extends Sss {
  private HhP Dne;
  
  public float Qnq;
  
  private String Dne;
  
  public float DyG;
  
  public float zGp;
  
  public int DyG;
  
  public float Dne;
  
  public float bzF;
  
  private Random Dne;
  
  NMq Dne = (NMq)new Random();
  
  private static wsR Dne = new wsR();
  
  public float aFZ;
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    for (byte b = 0; b < 3; b++) {
      int k = paramInt1 - i + 60;
      int m = paramInt2 - j + 14 + 19 * b;
      if (k >= 0 && m >= 0 && k < 108 && m < 19 && this.Dne.Dne(((Minecraft)this.Dne).Dne, b))
        ((Minecraft)this.Dne).Dne.Dne(((HhP)this.Dne).Dne, b); 
    } 
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: fconst_1
    //   1: fconst_1
    //   2: fconst_1
    //   3: fconst_1
    //   4: invokestatic glColor4f : (FFFF)V
    //   7: aload_0
    //   8: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   11: getfield Dne : LSnh;
    //   14: ldc '/gui/enchant.png'
    //   16: invokevirtual Dne : (Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield FWm : I
    //   23: aload_0
    //   24: getfield Dne : I
    //   27: isub
    //   28: iconst_2
    //   29: idiv
    //   30: istore #4
    //   32: aload_0
    //   33: getfield bzF : I
    //   36: aload_0
    //   37: getfield Qnq : I
    //   40: isub
    //   41: iconst_2
    //   42: idiv
    //   43: istore #5
    //   45: aload_0
    //   46: iload #4
    //   48: iload #5
    //   50: iconst_0
    //   51: iconst_0
    //   52: aload_0
    //   53: getfield Dne : I
    //   56: aload_0
    //   57: getfield Qnq : I
    //   60: invokevirtual FWm : (IIIIII)V
    //   63: invokestatic glPushMatrix : ()V
    //   66: sipush #5889
    //   69: invokestatic glMatrixMode : (I)V
    //   72: invokestatic glPushMatrix : ()V
    //   75: invokestatic glLoadIdentity : ()V
    //   78: new IJm
    //   81: dup
    //   82: aload_0
    //   83: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   86: getfield Dne : LfZI;
    //   89: aload_0
    //   90: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   93: getfield Dne : I
    //   96: aload_0
    //   97: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   100: getfield FWm : I
    //   103: invokespecial <init> : (LfZI;II)V
    //   106: astore #6
    //   108: aload #6
    //   110: invokevirtual Dne : ()I
    //   113: sipush #320
    //   116: isub
    //   117: iconst_2
    //   118: idiv
    //   119: aload #6
    //   121: invokevirtual bzF : ()I
    //   124: imul
    //   125: aload #6
    //   127: invokevirtual FWm : ()I
    //   130: sipush #240
    //   133: isub
    //   134: iconst_2
    //   135: idiv
    //   136: aload #6
    //   138: invokevirtual bzF : ()I
    //   141: imul
    //   142: sipush #320
    //   145: aload #6
    //   147: invokevirtual bzF : ()I
    //   150: imul
    //   151: sipush #240
    //   154: aload #6
    //   156: invokevirtual bzF : ()I
    //   159: imul
    //   160: invokestatic glViewport : (IIII)V
    //   163: ldc -0.34
    //   165: ldc 0.23
    //   167: fconst_0
    //   168: invokestatic glTranslatef : (FFF)V
    //   171: ldc 90.0
    //   173: ldc 1.3333334
    //   175: ldc 9.0
    //   177: ldc 80.0
    //   179: invokestatic gluPerspective : (FFFF)V
    //   182: fconst_1
    //   183: fstore #7
    //   185: sipush #5888
    //   188: invokestatic glMatrixMode : (I)V
    //   191: invokestatic glLoadIdentity : ()V
    //   194: invokestatic FWm : ()V
    //   197: fconst_0
    //   198: ldc 3.3
    //   200: ldc -16.0
    //   202: invokestatic glTranslatef : (FFF)V
    //   205: fload #7
    //   207: fload #7
    //   209: fload #7
    //   211: invokestatic glScalef : (FFF)V
    //   214: ldc 5.0
    //   216: fstore #8
    //   218: fload #8
    //   220: fload #8
    //   222: fload #8
    //   224: invokestatic glScalef : (FFF)V
    //   227: ldc 180.0
    //   229: fconst_0
    //   230: fconst_0
    //   231: fconst_1
    //   232: invokestatic glRotatef : (FFFF)V
    //   235: aload_0
    //   236: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   239: getfield Dne : LSnh;
    //   242: ldc '/item/book.png'
    //   244: invokevirtual Dne : (Ljava/lang/String;)V
    //   247: ldc 20.0
    //   249: fconst_1
    //   250: fconst_0
    //   251: fconst_0
    //   252: invokestatic glRotatef : (FFFF)V
    //   255: aload_0
    //   256: getfield DyG : F
    //   259: aload_0
    //   260: getfield zGp : F
    //   263: aload_0
    //   264: getfield DyG : F
    //   267: fsub
    //   268: fload_1
    //   269: fmul
    //   270: fadd
    //   271: fstore #9
    //   273: fconst_1
    //   274: fload #9
    //   276: fsub
    //   277: ldc 0.2
    //   279: fmul
    //   280: fconst_1
    //   281: fload #9
    //   283: fsub
    //   284: ldc 0.1
    //   286: fmul
    //   287: fconst_1
    //   288: fload #9
    //   290: fsub
    //   291: ldc 0.25
    //   293: fmul
    //   294: invokestatic glTranslatef : (FFF)V
    //   297: fconst_1
    //   298: fload #9
    //   300: fsub
    //   301: fneg
    //   302: ldc 90.0
    //   304: fmul
    //   305: ldc 90.0
    //   307: fsub
    //   308: fconst_0
    //   309: fconst_1
    //   310: fconst_0
    //   311: invokestatic glRotatef : (FFFF)V
    //   314: ldc 180.0
    //   316: fconst_1
    //   317: fconst_0
    //   318: fconst_0
    //   319: invokestatic glRotatef : (FFFF)V
    //   322: aload_0
    //   323: getfield bzF : F
    //   326: aload_0
    //   327: getfield Dne : F
    //   330: aload_0
    //   331: getfield bzF : F
    //   334: fsub
    //   335: fload_1
    //   336: fmul
    //   337: fadd
    //   338: ldc 0.25
    //   340: fadd
    //   341: fstore #10
    //   343: aload_0
    //   344: getfield bzF : F
    //   347: aload_0
    //   348: getfield Dne : F
    //   351: aload_0
    //   352: getfield bzF : F
    //   355: fsub
    //   356: fload_1
    //   357: fmul
    //   358: fadd
    //   359: ldc 0.75
    //   361: fadd
    //   362: fstore #11
    //   364: fload #10
    //   366: fload #10
    //   368: f2d
    //   369: invokestatic Dne : (D)I
    //   372: i2f
    //   373: fsub
    //   374: ldc 1.6
    //   376: fmul
    //   377: ldc 0.3
    //   379: fsub
    //   380: fstore #10
    //   382: fload #11
    //   384: fload #11
    //   386: f2d
    //   387: invokestatic Dne : (D)I
    //   390: i2f
    //   391: fsub
    //   392: ldc 1.6
    //   394: fmul
    //   395: ldc 0.3
    //   397: fsub
    //   398: fstore #11
    //   400: fload #10
    //   402: fconst_0
    //   403: fcmpg
    //   404: ifge -> 410
    //   407: fconst_0
    //   408: fstore #10
    //   410: fload #11
    //   412: fconst_0
    //   413: fcmpg
    //   414: ifge -> 420
    //   417: fconst_0
    //   418: fstore #11
    //   420: fload #10
    //   422: fconst_1
    //   423: fcmpl
    //   424: ifle -> 430
    //   427: fconst_1
    //   428: fstore #10
    //   430: fload #11
    //   432: fconst_1
    //   433: fcmpl
    //   434: ifle -> 440
    //   437: fconst_1
    //   438: fstore #11
    //   440: ldc 32826
    //   442: invokestatic glEnable : (I)V
    //   445: getstatic IfV.Dne : LwsR;
    //   448: aconst_null
    //   449: checkcast sMa
    //   452: fconst_0
    //   453: fload #10
    //   455: fload #11
    //   457: fload #9
    //   459: fconst_0
    //   460: ldc 0.0625
    //   462: invokevirtual Dne : (LsMa;FFFFFF)V
    //   465: ldc 32826
    //   467: invokestatic glDisable : (I)V
    //   470: invokestatic Dne : ()V
    //   473: sipush #5889
    //   476: invokestatic glMatrixMode : (I)V
    //   479: iconst_0
    //   480: iconst_0
    //   481: aload_0
    //   482: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   485: getfield Dne : I
    //   488: aload_0
    //   489: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   492: getfield FWm : I
    //   495: invokestatic glViewport : (IIII)V
    //   498: invokestatic glPopMatrix : ()V
    //   501: sipush #5888
    //   504: invokestatic glMatrixMode : (I)V
    //   507: invokestatic glPopMatrix : ()V
    //   510: invokestatic Dne : ()V
    //   513: fconst_1
    //   514: fconst_1
    //   515: fconst_1
    //   516: fconst_1
    //   517: invokestatic glColor4f : (FFFF)V
    //   520: aload_0
    //   521: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   524: getfield Dne : LSnh;
    //   527: ldc '/gui/enchant.png'
    //   529: invokevirtual Dne : (Ljava/lang/String;)V
    //   532: getstatic BfF.Dne : LBfF;
    //   535: aload_0
    //   536: getfield Dne : LHhP;
    //   539: getfield Dne : J
    //   542: invokevirtual Dne : (J)V
    //   545: iconst_0
    //   546: istore #12
    //   548: iload #12
    //   550: iconst_3
    //   551: if_icmpge -> 1016
    //   554: getstatic BfF.Dne : LBfF;
    //   557: invokevirtual Dne : ()Ljava/lang/String;
    //   560: astore #13
    //   562: aload_0
    //   563: fconst_0
    //   564: putfield FWm : F
    //   567: aload_0
    //   568: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   571: getfield Dne : LSnh;
    //   574: ldc '/gui/enchant.png'
    //   576: invokevirtual Dne : (Ljava/lang/String;)V
    //   579: aload_0
    //   580: getfield Dne : LHhP;
    //   583: getfield Dne : [I
    //   586: iload #12
    //   588: iaload
    //   589: istore #14
    //   591: fconst_1
    //   592: fconst_1
    //   593: fconst_1
    //   594: fconst_1
    //   595: invokestatic glColor4f : (FFFF)V
    //   598: iload #14
    //   600: ifne -> 634
    //   603: aload_0
    //   604: iload #4
    //   606: bipush #60
    //   608: iadd
    //   609: iload #5
    //   611: bipush #14
    //   613: iadd
    //   614: bipush #19
    //   616: iload #12
    //   618: imul
    //   619: iadd
    //   620: iconst_0
    //   621: sipush #185
    //   624: bipush #108
    //   626: bipush #19
    //   628: invokevirtual FWm : (IIIIII)V
    //   631: goto -> 1010
    //   634: new java/lang/StringBuilder
    //   637: dup
    //   638: invokespecial <init> : ()V
    //   641: ldc ''
    //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: iload #14
    //   648: invokestatic toBinaryString : (I)Ljava/lang/String;
    //   651: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   654: invokevirtual toString : ()Ljava/lang/String;
    //   657: astore #15
    //   659: aload_0
    //   660: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   663: getfield FWm : LmsA;
    //   666: astore #16
    //   668: ldc 6839882
    //   670: istore #17
    //   672: aload_0
    //   673: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   676: getfield Dne : LMJs;
    //   679: getfield eHV : I
    //   682: iload #14
    //   684: if_icmpge -> 819
    //   687: aload_0
    //   688: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   691: getfield Dne : LMJs;
    //   694: getfield Dne : Luqg;
    //   697: getfield Qnq : Z
    //   700: ifne -> 819
    //   703: aload_0
    //   704: iload #4
    //   706: bipush #60
    //   708: iadd
    //   709: iload #5
    //   711: bipush #14
    //   713: iadd
    //   714: bipush #19
    //   716: iload #12
    //   718: imul
    //   719: iadd
    //   720: iconst_0
    //   721: sipush #185
    //   724: bipush #108
    //   726: bipush #19
    //   728: invokevirtual FWm : (IIIIII)V
    //   731: aload #16
    //   733: aload #13
    //   735: iload #4
    //   737: bipush #62
    //   739: iadd
    //   740: iload #5
    //   742: bipush #16
    //   744: iadd
    //   745: bipush #19
    //   747: iload #12
    //   749: imul
    //   750: iadd
    //   751: bipush #104
    //   753: iload #17
    //   755: ldc 16711422
    //   757: iand
    //   758: iconst_1
    //   759: ishr
    //   760: invokevirtual Dne : (Ljava/lang/String;IIII)V
    //   763: aload_0
    //   764: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   767: getfield Dne : LmsA;
    //   770: astore #16
    //   772: ldc 4226832
    //   774: istore #17
    //   776: aload #16
    //   778: aload #15
    //   780: iload #4
    //   782: bipush #62
    //   784: iadd
    //   785: bipush #104
    //   787: iadd
    //   788: aload #16
    //   790: aload #15
    //   792: invokevirtual Dne : (Ljava/lang/String;)I
    //   795: isub
    //   796: iload #5
    //   798: bipush #16
    //   800: iadd
    //   801: bipush #19
    //   803: iload #12
    //   805: imul
    //   806: iadd
    //   807: bipush #7
    //   809: iadd
    //   810: iload #17
    //   812: invokevirtual Dne : (Ljava/lang/String;III)I
    //   815: pop
    //   816: goto -> 1010
    //   819: iload_2
    //   820: iload #4
    //   822: bipush #60
    //   824: iadd
    //   825: isub
    //   826: istore #18
    //   828: iload_3
    //   829: iload #5
    //   831: bipush #14
    //   833: iadd
    //   834: bipush #19
    //   836: iload #12
    //   838: imul
    //   839: iadd
    //   840: isub
    //   841: istore #19
    //   843: iload #18
    //   845: iflt -> 902
    //   848: iload #19
    //   850: iflt -> 902
    //   853: iload #18
    //   855: bipush #108
    //   857: if_icmpge -> 902
    //   860: iload #19
    //   862: bipush #19
    //   864: if_icmpge -> 902
    //   867: aload_0
    //   868: iload #4
    //   870: bipush #60
    //   872: iadd
    //   873: iload #5
    //   875: bipush #14
    //   877: iadd
    //   878: bipush #19
    //   880: iload #12
    //   882: imul
    //   883: iadd
    //   884: iconst_0
    //   885: sipush #204
    //   888: bipush #108
    //   890: bipush #19
    //   892: invokevirtual FWm : (IIIIII)V
    //   895: ldc 16777088
    //   897: istore #17
    //   899: goto -> 930
    //   902: aload_0
    //   903: iload #4
    //   905: bipush #60
    //   907: iadd
    //   908: iload #5
    //   910: bipush #14
    //   912: iadd
    //   913: bipush #19
    //   915: iload #12
    //   917: imul
    //   918: iadd
    //   919: iconst_0
    //   920: sipush #166
    //   923: bipush #108
    //   925: bipush #19
    //   927: invokevirtual FWm : (IIIIII)V
    //   930: aload #16
    //   932: aload #13
    //   934: iload #4
    //   936: bipush #62
    //   938: iadd
    //   939: iload #5
    //   941: bipush #16
    //   943: iadd
    //   944: bipush #19
    //   946: iload #12
    //   948: imul
    //   949: iadd
    //   950: bipush #104
    //   952: iload #17
    //   954: invokevirtual Dne : (Ljava/lang/String;IIII)V
    //   957: aload_0
    //   958: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   961: getfield Dne : LmsA;
    //   964: astore #16
    //   966: ldc 8453920
    //   968: istore #17
    //   970: aload #16
    //   972: aload #15
    //   974: iload #4
    //   976: bipush #62
    //   978: iadd
    //   979: bipush #104
    //   981: iadd
    //   982: aload #16
    //   984: aload #15
    //   986: invokevirtual Dne : (Ljava/lang/String;)I
    //   989: isub
    //   990: iload #5
    //   992: bipush #16
    //   994: iadd
    //   995: bipush #19
    //   997: iload #12
    //   999: imul
    //   1000: iadd
    //   1001: bipush #7
    //   1003: iadd
    //   1004: iload #17
    //   1006: invokevirtual Dne : (Ljava/lang/String;III)I
    //   1009: pop
    //   1010: iinc #12, 1
    //   1013: goto -> 548
    //   1016: return
  }
  
  public void bzF() {
    super.bzF();
    zGp();
  }
  
  public void zGp() {
    NMq nMq = this.Dne.Dne(0).Dne();
    if (!NMq.FWm(nMq, (NMq)this.Dne)) {
      this.Dne = (wsR)nMq;
      do {
        this.Qnq += (this.Dne.nextInt(4) - this.Dne.nextInt(4));
      } while (this.Dne <= this.Qnq + 1.0F && this.Dne >= this.Qnq - 1.0F);
    } 
    this.DyG++;
    this.bzF = this.Dne;
    this.DyG = this.zGp;
    boolean bool = false;
    for (byte b = 0; b < 3; b++) {
      if (((HhP)this.Dne).Dne[b] != 0L)
        bool = true; 
    } 
    if (bool) {
      this.zGp += 0.2F;
    } else {
      this.zGp -= 0.2F;
    } 
    if (this.zGp < 0.0F)
      this.zGp = 0.0F; 
    if (this.zGp > 1.0F)
      this.zGp = 1.0F; 
    float f1 = (this.Qnq - this.Dne) * 0.4F;
    float f2 = 0.2F;
    if (f1 < -f2)
      f1 = -f2; 
    if (f1 > f2)
      f1 = f2; 
    this.aFZ += (f1 - this.aFZ) * 0.9F;
    this.Dne += this.aFZ;
  }
  
  public IfV(MOS paramMOS, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    super(new HhP(paramMOS, paramQnq, paramInt1, paramInt2, paramInt3));
    this.Dne = this.Dne;
    this.Dne = (wsR)paramString;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    this.Dne.FWm((this.Dne == null) ? KGL.Dne("container.enchant") : (String)this.Dne, 12, 5, 4210752);
    this.Dne.FWm(KGL.Dne("container.inventory"), 8, this.Qnq - 96 + 2, 4210752);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IfV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */