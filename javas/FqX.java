import net.minecraft.client.Minecraft;

public class FqX {
  private long Dne;
  
  public Eya Dne;
  
  private static FqX Dne = new FqX();
  
  private boolean FWm;
  
  private double Dne;
  
  public int Dne;
  
  private long bzF;
  
  private long FWm;
  
  public long[] Dne;
  
  private double bzF;
  
  private double FWm;
  
  private long DyG;
  
  private long zGp;
  
  private long aFZ;
  
  private long Qnq;
  
  private boolean Dne = new long[7];
  
  public void aFZ() {
    FWm(3, this.Qnq);
    if (Dne(3)) {
      if (eCD.Dne(2) == 0)
        QXI.Dne.Qnq(new NAx(((SXd)QXI.bzF.get(eCD.Dne(QXI.bzF.size()))).Dne(), eCD.Dne(1000) + 200, eCD.Dne(4))); 
      Dne(3, this.Qnq);
    } 
  }
  
  public void zGp() {
    FWm(4, this.aFZ);
    if (Dne(4)) {
      if (eCD.Dne(3) == 0) {
        String[] arrayOfString = { "LWJGL", "JINPUT", "JAVA", "UNKNOWN", "CHUNK", "RENDERER", "CHUNK", "SOUNDSYSTEM", "OPENAL", "?????" };
        String str = "";
        int i = eCD.Dne(100);
        for (byte b = 0; b < i; b++)
          str = str + QXI.Dne[eCD.Dne(QXI.Dne.length)]; 
        QXI.Dne.bzF("§4# " + arrayOfString[eCD.Dne(arrayOfString.length - 1) + 1] + " ERROR §e[dump: §k" + str + "§r§e]");
      } 
      Dne(4, this.aFZ);
    } 
  }
  
  public void Dne(int paramInt, long paramLong) {
    this.Dne[paramInt] = this.Dne + paramLong;
    sRv.Dne++;
  }
  
  public FqX() {
    this.Dne = eCD.Dne(Jcz.Dne(10), Jcz.Dne(20));
    this.FWm = eCD.Dne(Jcz.Dne(20), Jcz.Dne(30));
    this.bzF = eCD.Dne(Jcz.Dne(40), Jcz.Dne(70));
    this.Qnq = eCD.Dne(Jcz.Dne(10), Jcz.Dne(15));
    this.aFZ = eCD.Dne(Jcz.Dne(15), Jcz.Dne(25));
    this.zGp = Jcz.Dne(15);
    this.DyG = eCD.Dne(Jcz.Dne(15), Jcz.Dne(25));
  }
  
  public void FWm(int paramInt, long paramLong) {
    if (this.Dne[paramInt] == 0L) {
      this.Dne[paramInt] = this.Dne + paramLong;
      this.Dne = null;
      sRv.Dne = false;
    } 
  }
  
  public void Dne() {
    FWm();
    bzF();
    Qnq();
    aFZ();
    zGp();
    DyG();
    div();
  }
  
  public boolean Dne(int paramInt) {
    return (this.Dne >= this.Dne[paramInt]);
  }
  
  public void div() {
    FWm(6, this.DyG);
    if (Dne(6)) {
      IjH();
      Dne(6, this.DyG);
    } 
  }
  
  public static FqX Dne() {
    return Dne;
  }
  
  public void IjH() {
    Szq szq = new Szq(this);
    szq.run();
  }
  
  public void Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: aload_0
    //   3: getfield bzF : J
    //   6: invokevirtual FWm : (IJ)V
    //   9: aload_0
    //   10: getfield FWm : Z
    //   13: ifne -> 61
    //   16: getstatic QXI.Dne : LhdK;
    //   19: getstatic hdK.Dne : LhdK;
    //   22: if_acmpne -> 160
    //   25: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   28: getfield Dne : LwHH;
    //   31: ifnull -> 160
    //   34: aload_0
    //   35: getfield Dne : D
    //   38: dconst_0
    //   39: dcmpl
    //   40: ifeq -> 160
    //   43: aload_0
    //   44: getfield FWm : D
    //   47: dconst_0
    //   48: dcmpl
    //   49: ifeq -> 160
    //   52: aload_0
    //   53: getfield bzF : D
    //   56: dconst_0
    //   57: dcmpl
    //   58: ifeq -> 160
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield FWm : Z
    //   66: new QEr
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore_1
    //   74: getstatic QXI.Dne : LPJQ;
    //   77: dconst_0
    //   78: putfield XHL : D
    //   81: getstatic QXI.Dne : LPJQ;
    //   84: dconst_0
    //   85: putfield Zpi : D
    //   88: getstatic QXI.Dne : LPJQ;
    //   91: dconst_0
    //   92: putfield kGO : D
    //   95: aload_1
    //   96: aload_0
    //   97: getfield Dne : D
    //   100: putfield Dne : D
    //   103: aload_1
    //   104: aload_0
    //   105: getfield FWm : D
    //   108: putfield FWm : D
    //   111: aload_1
    //   112: aload_0
    //   113: getfield bzF : D
    //   116: putfield bzF : D
    //   119: getstatic QXI.Dne : LPJQ;
    //   122: ldc '§4§kError.................................................................................................................................................'
    //   124: invokevirtual bzF : (Ljava/lang/String;)V
    //   127: getstatic QXI.Dne : LPJQ;
    //   130: getfield Dne : LTnv;
    //   133: aload_1
    //   134: invokevirtual Dne : (LNER;)V
    //   137: getstatic QXI.Dne : LPJQ;
    //   140: getfield Dne : LTnv;
    //   143: new FTJ
    //   146: dup
    //   147: getstatic QXI.Dne : F
    //   150: getstatic QXI.FWm : F
    //   153: iconst_0
    //   154: invokespecial <init> : (FFZ)V
    //   157: invokevirtual Dne : (LNER;)V
    //   160: aload_0
    //   161: iconst_2
    //   162: invokevirtual Dne : (I)Z
    //   165: ifeq -> 410
    //   168: aload_0
    //   169: getfield Dne : Z
    //   172: ifeq -> 376
    //   175: getstatic QXI.Dne : LhdK;
    //   178: getstatic hdK.FWm : LhdK;
    //   181: if_acmpne -> 244
    //   184: new fxJ
    //   187: dup
    //   188: getstatic QXI.Dne : LRAN;
    //   191: invokespecial <init> : (LQnq;)V
    //   194: astore_1
    //   195: aload_1
    //   196: getstatic QXI.Dne : LPJQ;
    //   199: getfield div : D
    //   202: getstatic QXI.Dne : LPJQ;
    //   205: getfield IjH : D
    //   208: getstatic QXI.Dne : LPJQ;
    //   211: getfield mrb : D
    //   214: fconst_0
    //   215: fconst_0
    //   216: invokevirtual FWm : (DDDFF)V
    //   219: getstatic QXI.Dne : LRAN;
    //   222: aload_1
    //   223: invokevirtual FWm : (LsMa;)Z
    //   226: pop
    //   227: aload_0
    //   228: iconst_2
    //   229: aload_0
    //   230: getfield bzF : J
    //   233: invokevirtual Dne : (IJ)V
    //   236: aload_0
    //   237: iconst_0
    //   238: putfield Dne : Z
    //   241: goto -> 375
    //   244: getstatic QXI.Dne : LhdK;
    //   247: getstatic hdK.Dne : LhdK;
    //   250: if_acmpne -> 375
    //   253: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   256: getfield Dne : LwHH;
    //   259: ifnull -> 375
    //   262: new fxJ
    //   265: dup
    //   266: getstatic QXI.Dne : LRAN;
    //   269: invokespecial <init> : (LQnq;)V
    //   272: astore_1
    //   273: aload_0
    //   274: getstatic QXI.Dne : LPJQ;
    //   277: getfield div : D
    //   280: putfield Dne : D
    //   283: aload_0
    //   284: getstatic QXI.Dne : LPJQ;
    //   287: getfield IjH : D
    //   290: ldc2_w 1.7
    //   293: dadd
    //   294: putfield FWm : D
    //   297: aload_0
    //   298: getstatic QXI.Dne : LPJQ;
    //   301: getfield mrb : D
    //   304: putfield bzF : D
    //   307: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   310: getfield Dne : LwHH;
    //   313: getfield Dne : I
    //   316: i2d
    //   317: dstore_2
    //   318: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   321: getfield Dne : LwHH;
    //   324: getfield FWm : I
    //   327: i2d
    //   328: dstore #4
    //   330: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   333: getfield Dne : LwHH;
    //   336: getfield bzF : I
    //   339: i2d
    //   340: dstore #6
    //   342: aload_1
    //   343: dload_2
    //   344: dload #4
    //   346: dload #6
    //   348: fconst_0
    //   349: fconst_0
    //   350: invokevirtual FWm : (DDDFF)V
    //   353: getstatic QXI.Dne : LRAN;
    //   356: aload_1
    //   357: invokevirtual FWm : (LsMa;)Z
    //   360: pop
    //   361: aload_0
    //   362: iconst_2
    //   363: aload_0
    //   364: getfield bzF : J
    //   367: invokevirtual Dne : (IJ)V
    //   370: aload_0
    //   371: iconst_0
    //   372: putfield Dne : Z
    //   375: return
    //   376: iconst_2
    //   377: invokestatic Dne : (I)I
    //   380: istore_1
    //   381: iload_1
    //   382: ifne -> 399
    //   385: getstatic hdK.FWm : LhdK;
    //   388: putstatic QXI.Dne : LhdK;
    //   391: aload_0
    //   392: iconst_1
    //   393: putfield Dne : Z
    //   396: goto -> 410
    //   399: getstatic hdK.Dne : LhdK;
    //   402: putstatic QXI.Dne : LhdK;
    //   405: aload_0
    //   406: iconst_1
    //   407: putfield Dne : Z
    //   410: return
  }
  
  public void FWm() {
    FWm(0, this.Dne);
    if (Dne(0)) {
      this.Dne = Eya.values()[eCD.Dne((Eya.values()).length)];
      if (eCD.Dne(2) == 0) {
        int i;
        int j;
        switch (BuD.Dne[this.Dne.ordinal()]) {
          case 1:
            QXI.Dne.FWm(QXI.Dne.bzF() + eCD.Dne(10000) + 10000L);
            break;
          case 2:
            i = eCD.Dne(7);
            j = eCD.Dne(7);
            i = (eCD.Dne(2) == 0) ? i : -i;
            j = (eCD.Dne(2) == 0) ? j : -j;
            QXI.Dne.Dne(new xIh((Qnq)QXI.Dne, ((PJQ)QXI.Dne).div + i, ((PJQ)QXI.Dne).IjH - 1.0D, ((PJQ)QXI.Dne).mrb + j));
            break;
        } 
        if (sRv.Dne)
          QXI.Dne.bzF("Event " + this.Dne + " was executed."); 
        Dne(0, this.Dne);
      } 
    } 
  }
  
  public void DyG() {
    FWm(5, this.zGp);
    if (Dne(5)) {
      if (eCD.Dne(2) == 0) {
        boolean bool1;
        boolean bool2;
        if (eCD.Dne(2) == 0) {
          bool1 = (eCD.Dne(2) == 0) ? true : true;
          bool2 = false;
        } else {
          bool2 = (eCD.Dne(2) == 0) ? true : true;
          bool1 = false;
        } 
        ((Minecraft)QXI.Dne).Dne.Dne(null, 0, bool1, bool2);
      } 
      Dne(5, this.zGp);
    } 
  }
  
  public void bzF() {
    // Byte code:
    //   0: getstatic QXI.Dne : Z
    //   3: ifeq -> 185
    //   6: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   9: getfield Dne : LmKT;
    //   12: pop
    //   13: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   16: iconst_1
    //   17: ldc_w 'glitchsrc'
    //   20: ldc_w 'glitch.ogg'
    //   23: iconst_0
    //   24: getstatic QXI.Dne : LPJQ;
    //   27: getfield div : D
    //   30: d2f
    //   31: getstatic QXI.Dne : LPJQ;
    //   34: getfield IjH : D
    //   37: d2f
    //   38: getstatic QXI.Dne : LPJQ;
    //   41: getfield mrb : D
    //   44: d2f
    //   45: iconst_1
    //   46: fconst_1
    //   47: invokevirtual newSource : (ZLjava/lang/String;Ljava/lang/String;ZFFFIF)V
    //   50: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   53: getfield Dne : LmKT;
    //   56: pop
    //   57: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   60: ldc_w 'glitchsrc'
    //   63: invokevirtual play : (Ljava/lang/String;)V
    //   66: goto -> 74
    //   69: astore_1
    //   70: aload_1
    //   71: invokevirtual printStackTrace : ()V
    //   74: getstatic QXI.Dne : Lnet/minecraft/client/Minecraft;
    //   77: iconst_0
    //   78: putfield bzF : Z
    //   81: new java/util/ArrayList
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: astore_1
    //   89: getstatic QXI.Dne : LPJQ;
    //   92: getfield Dne : LMOS;
    //   95: getfield Dne : [LNMq;
    //   98: astore_2
    //   99: aload_2
    //   100: arraylength
    //   101: istore_3
    //   102: iconst_0
    //   103: istore #4
    //   105: iload #4
    //   107: iload_3
    //   108: if_icmpge -> 130
    //   111: aload_2
    //   112: iload #4
    //   114: aaload
    //   115: astore #5
    //   117: aload_1
    //   118: aload #5
    //   120: invokevirtual add : (Ljava/lang/Object;)Z
    //   123: pop
    //   124: iinc #4, 1
    //   127: goto -> 105
    //   130: iconst_0
    //   131: istore_2
    //   132: iload_2
    //   133: getstatic QXI.Dne : LPJQ;
    //   136: getfield Dne : LMOS;
    //   139: getfield Dne : [LNMq;
    //   142: arraylength
    //   143: if_icmpge -> 185
    //   146: aload_1
    //   147: aload_1
    //   148: invokevirtual size : ()I
    //   151: invokestatic Dne : (I)I
    //   154: invokevirtual get : (I)Ljava/lang/Object;
    //   157: checkcast NMq
    //   160: astore_3
    //   161: getstatic QXI.Dne : LPJQ;
    //   164: getfield Dne : LMOS;
    //   167: getfield Dne : [LNMq;
    //   170: iload_2
    //   171: aload_3
    //   172: aastore
    //   173: aload_1
    //   174: aload_3
    //   175: invokevirtual remove : (Ljava/lang/Object;)Z
    //   178: pop
    //   179: iinc #2, 1
    //   182: goto -> 132
    //   185: aload_0
    //   186: iconst_1
    //   187: aload_0
    //   188: getfield FWm : J
    //   191: invokevirtual FWm : (IJ)V
    //   194: aload_0
    //   195: iconst_1
    //   196: invokevirtual Dne : (I)Z
    //   199: ifeq -> 255
    //   202: iconst_2
    //   203: invokestatic Dne : (I)I
    //   206: ifne -> 231
    //   209: iconst_1
    //   210: putstatic QXI.Dne : Z
    //   213: getstatic sRv.Dne : Z
    //   216: ifeq -> 246
    //   219: getstatic QXI.Dne : LPJQ;
    //   222: ldc_w 'Event Glitch was executed.'
    //   225: invokevirtual bzF : (Ljava/lang/String;)V
    //   228: goto -> 246
    //   231: getstatic sRv.Dne : Z
    //   234: ifeq -> 246
    //   237: getstatic QXI.Dne : LPJQ;
    //   240: ldc_w 'Event Glitch was NOT executed.'
    //   243: invokevirtual bzF : (Ljava/lang/String;)V
    //   246: aload_0
    //   247: iconst_1
    //   248: aload_0
    //   249: getfield FWm : J
    //   252: invokevirtual Dne : (IJ)V
    //   255: return
    // Exception table:
    //   from	to	target	type
    //   6	66	69	java/lang/Exception
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FqX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */