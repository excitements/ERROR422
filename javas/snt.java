import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class snt {
  public List Dne;
  
  public int div;
  
  public int bzF;
  
  public boolean Qnq;
  
  public static int Dne;
  
  public int FWm;
  
  public boolean FWm;
  
  public bSp Dne;
  
  private List FWm;
  
  public int mrb;
  
  public int Qnq;
  
  private static WAR Dne = WAR.Dne;
  
  public int Zpi;
  
  public boolean aFZ;
  
  public Qnq Dne;
  
  private int qLR;
  
  public int kGO;
  
  private boolean zGp;
  
  public int udO;
  
  public int IjH;
  
  public boolean Dne;
  
  public int XHL;
  
  public int DyG;
  
  public boolean[] Dne = false;
  
  public boolean bzF;
  
  private int trS = -1;
  
  public int zGp;
  
  public int ooe;
  
  public int aFZ;
  
  public snt(Qnq paramQnq, List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = new boolean[2];
    this.bzF = true;
    this.zGp = 0;
    this.Dne = (boolean[])new ArrayList();
    this.Dne = (boolean[])paramQnq;
    this.FWm = paramList;
    this.trS = paramInt4;
    this.FWm = -999;
    Dne(paramInt1, paramInt2, paramInt3);
    this.FWm = false;
  }
  
  private void zGp() {
    GL11.glTranslatef(this.div, this.IjH, this.mrb);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 != this.FWm || paramInt2 != this.bzF || paramInt3 != this.Qnq) {
      FWm();
      this.FWm = paramInt1;
      this.bzF = paramInt2;
      this.Qnq = paramInt3;
      this.XHL = paramInt1 + 8;
      this.Zpi = paramInt2 + 8;
      this.kGO = paramInt3 + 8;
      this.div = paramInt1 & 0x3FF;
      this.IjH = paramInt2;
      this.mrb = paramInt3 & 0x3FF;
      this.aFZ = paramInt1 - this.div;
      this.zGp = paramInt2 - this.IjH;
      this.DyG = paramInt3 - this.mrb;
      float f = 6.0F;
      this.Dne = (boolean[])bSp.Dne((paramInt1 - f), (paramInt2 - f), (paramInt3 - f), ((paramInt1 + 16) + f), ((paramInt2 + 16) + f), ((paramInt3 + 16) + f));
      GL11.glNewList(this.trS + 2, 4864);
      eKj.Dne(bSp.Dne().Dne((this.div - f), (this.IjH - f), (this.mrb - f), ((this.div + 16) + f), ((this.IjH + 16) + f), ((this.mrb + 16) + f)));
      GL11.glEndList();
      aFZ();
    } 
  }
  
  public void bzF() {
    FWm();
    this.Dne = null;
  }
  
  public void FWm() {
    for (byte b = 0; b < 2; b++)
      this.Dne[b] = true; 
    this.Dne = false;
    this.zGp = 0;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Z
    //   4: ifeq -> 607
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield FWm : Z
    //   12: aload_0
    //   13: getfield FWm : I
    //   16: istore_1
    //   17: aload_0
    //   18: getfield bzF : I
    //   21: istore_2
    //   22: aload_0
    //   23: getfield Qnq : I
    //   26: istore_3
    //   27: aload_0
    //   28: getfield FWm : I
    //   31: bipush #16
    //   33: iadd
    //   34: istore #4
    //   36: aload_0
    //   37: getfield bzF : I
    //   40: bipush #16
    //   42: iadd
    //   43: istore #5
    //   45: aload_0
    //   46: getfield Qnq : I
    //   49: bipush #16
    //   51: iadd
    //   52: istore #6
    //   54: iconst_0
    //   55: istore #7
    //   57: iload #7
    //   59: iconst_2
    //   60: if_icmpge -> 77
    //   63: aload_0
    //   64: getfield Dne : [Z
    //   67: iload #7
    //   69: iconst_1
    //   70: bastore
    //   71: iinc #7, 1
    //   74: goto -> 57
    //   77: iconst_0
    //   78: putstatic qMV.Dne : Z
    //   81: new java/util/HashSet
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: astore #7
    //   90: aload #7
    //   92: aload_0
    //   93: getfield Dne : Ljava/util/List;
    //   96: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   99: pop
    //   100: aload_0
    //   101: getfield Dne : Ljava/util/List;
    //   104: invokeinterface clear : ()V
    //   109: iconst_1
    //   110: istore #8
    //   112: new ATE
    //   115: dup
    //   116: aload_0
    //   117: getfield Dne : LQnq;
    //   120: iload_1
    //   121: iload #8
    //   123: isub
    //   124: iload_2
    //   125: iload #8
    //   127: isub
    //   128: iload_3
    //   129: iload #8
    //   131: isub
    //   132: iload #4
    //   134: iload #8
    //   136: iadd
    //   137: iload #5
    //   139: iload #8
    //   141: iadd
    //   142: iload #6
    //   144: iload #8
    //   146: iadd
    //   147: iload #8
    //   149: invokespecial <init> : (LQnq;IIIIIII)V
    //   152: astore #9
    //   154: aload #9
    //   156: invokevirtual Qnq : ()Z
    //   159: ifne -> 534
    //   162: getstatic snt.Dne : I
    //   165: iconst_1
    //   166: iadd
    //   167: putstatic snt.Dne : I
    //   170: new zVu
    //   173: dup
    //   174: aload #9
    //   176: invokespecial <init> : (LZpi;)V
    //   179: astore #10
    //   181: aload_0
    //   182: iconst_0
    //   183: putfield qLR : I
    //   186: iconst_0
    //   187: istore #11
    //   189: iload #11
    //   191: iconst_2
    //   192: if_icmpge -> 534
    //   195: iconst_0
    //   196: istore #12
    //   198: iconst_0
    //   199: istore #13
    //   201: iconst_0
    //   202: istore #14
    //   204: iload_2
    //   205: istore #15
    //   207: iload #15
    //   209: iload #5
    //   211: if_icmpge -> 466
    //   214: iload_3
    //   215: istore #16
    //   217: iload #16
    //   219: iload #6
    //   221: if_icmpge -> 460
    //   224: iload_1
    //   225: istore #17
    //   227: iload #17
    //   229: iload #4
    //   231: if_icmpge -> 454
    //   234: aload #9
    //   236: iload #17
    //   238: iload #15
    //   240: iload #16
    //   242: invokevirtual Dne : (III)I
    //   245: istore #18
    //   247: iload #18
    //   249: ifle -> 448
    //   252: iload #14
    //   254: ifne -> 341
    //   257: iconst_1
    //   258: istore #14
    //   260: aload_0
    //   261: getfield trS : I
    //   264: iload #11
    //   266: iadd
    //   267: sipush #4864
    //   270: invokestatic glNewList : (II)V
    //   273: invokestatic glPushMatrix : ()V
    //   276: aload_0
    //   277: invokespecial zGp : ()V
    //   280: ldc 1.000001
    //   282: fstore #19
    //   284: ldc -8.0
    //   286: ldc -8.0
    //   288: ldc -8.0
    //   290: invokestatic glTranslatef : (FFF)V
    //   293: fload #19
    //   295: fload #19
    //   297: fload #19
    //   299: invokestatic glScalef : (FFF)V
    //   302: ldc 8.0
    //   304: ldc 8.0
    //   306: ldc 8.0
    //   308: invokestatic glTranslatef : (FFF)V
    //   311: getstatic snt.Dne : LWAR;
    //   314: invokevirtual Dne : ()V
    //   317: getstatic snt.Dne : LWAR;
    //   320: aload_0
    //   321: getfield FWm : I
    //   324: ineg
    //   325: i2d
    //   326: aload_0
    //   327: getfield bzF : I
    //   330: ineg
    //   331: i2d
    //   332: aload_0
    //   333: getfield Qnq : I
    //   336: ineg
    //   337: i2d
    //   338: invokevirtual FWm : (DDD)V
    //   341: getstatic zKP.Dne : [LzKP;
    //   344: iload #18
    //   346: aaload
    //   347: astore #19
    //   349: aload #19
    //   351: ifnull -> 448
    //   354: iload #11
    //   356: ifne -> 403
    //   359: aload #19
    //   361: invokevirtual mrb : ()Z
    //   364: ifeq -> 403
    //   367: aload #9
    //   369: iload #17
    //   371: iload #15
    //   373: iload #16
    //   375: invokevirtual Dne : (III)LipD;
    //   378: astore #20
    //   380: getstatic XWr.Dne : LXWr;
    //   383: aload #20
    //   385: invokevirtual Dne : (LipD;)Z
    //   388: ifeq -> 403
    //   391: aload_0
    //   392: getfield Dne : Ljava/util/List;
    //   395: aload #20
    //   397: invokeinterface add : (Ljava/lang/Object;)Z
    //   402: pop
    //   403: aload #19
    //   405: invokevirtual a_ : ()I
    //   408: istore #20
    //   410: iload #20
    //   412: iload #11
    //   414: if_icmpeq -> 423
    //   417: iconst_1
    //   418: istore #12
    //   420: goto -> 448
    //   423: iload #20
    //   425: iload #11
    //   427: if_icmpne -> 448
    //   430: iload #13
    //   432: aload #10
    //   434: aload #19
    //   436: iload #17
    //   438: iload #15
    //   440: iload #16
    //   442: invokevirtual Dne : (LzKP;III)Z
    //   445: ior
    //   446: istore #13
    //   448: iinc #17, 1
    //   451: goto -> 227
    //   454: iinc #16, 1
    //   457: goto -> 217
    //   460: iinc #15, 1
    //   463: goto -> 207
    //   466: iload #14
    //   468: ifeq -> 504
    //   471: aload_0
    //   472: dup
    //   473: getfield qLR : I
    //   476: getstatic snt.Dne : LWAR;
    //   479: invokevirtual Dne : ()I
    //   482: iadd
    //   483: putfield qLR : I
    //   486: invokestatic glPopMatrix : ()V
    //   489: invokestatic glEndList : ()V
    //   492: getstatic snt.Dne : LWAR;
    //   495: dconst_0
    //   496: dconst_0
    //   497: dconst_0
    //   498: invokevirtual FWm : (DDD)V
    //   501: goto -> 507
    //   504: iconst_0
    //   505: istore #13
    //   507: iload #13
    //   509: ifeq -> 520
    //   512: aload_0
    //   513: getfield Dne : [Z
    //   516: iload #11
    //   518: iconst_0
    //   519: bastore
    //   520: iload #12
    //   522: ifne -> 528
    //   525: goto -> 534
    //   528: iinc #11, 1
    //   531: goto -> 189
    //   534: new java/util/HashSet
    //   537: dup
    //   538: invokespecial <init> : ()V
    //   541: astore #10
    //   543: aload #10
    //   545: aload_0
    //   546: getfield Dne : Ljava/util/List;
    //   549: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   552: pop
    //   553: aload #10
    //   555: aload #7
    //   557: invokevirtual removeAll : (Ljava/util/Collection;)Z
    //   560: pop
    //   561: aload_0
    //   562: getfield FWm : Ljava/util/List;
    //   565: aload #10
    //   567: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   572: pop
    //   573: aload #7
    //   575: aload_0
    //   576: getfield Dne : Ljava/util/List;
    //   579: invokevirtual removeAll : (Ljava/util/Collection;)Z
    //   582: pop
    //   583: aload_0
    //   584: getfield FWm : Ljava/util/List;
    //   587: aload #7
    //   589: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   594: pop
    //   595: aload_0
    //   596: getstatic qMV.Dne : Z
    //   599: putfield aFZ : Z
    //   602: aload_0
    //   603: iconst_1
    //   604: putfield zGp : Z
    //   607: return
  }
  
  public void aFZ() {
    this.FWm = true;
  }
  
  public float Dne(sMa paramsMa) {
    float f1 = (float)(paramsMa.div - this.XHL);
    float f2 = (float)(paramsMa.IjH - this.Zpi);
    float f3 = (float)(paramsMa.mrb - this.kGO);
    return f1 * f1 + f2 * f2 + f3 * f3;
  }
  
  public void Qnq() {
    GL11.glCallList(this.trS + 2);
  }
  
  static {
    Dne = false;
  }
  
  public int Dne(int paramInt) {
    return (this.Dne == null) ? -1 : (!this.Dne[paramInt] ? (this.trS + paramInt) : -1);
  }
  
  public boolean Dne() {
    return (this.zGp == 0) ? false : ((this.Dne[0] && this.Dne[1]));
  }
  
  public void Dne(IPx paramIPx) {
    this.Dne = paramIPx.Dne((bSp)this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\snt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */