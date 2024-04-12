import org.lwjgl.input.Keyboard;

public class Lbd extends qVZ {
  public String Dne;
  
  private boolean bzF;
  
  private Pee aFZ;
  
  private mHN FWm;
  
  private Pee bzF;
  
  private mHN Dne;
  
  private Pee Qnq;
  
  private Pee Dne;
  
  private Pee DyG;
  
  private boolean aFZ;
  
  private String FWm;
  
  private String DyG;
  
  private boolean zGp;
  
  private String bzF = "survival";
  
  private boolean Qnq;
  
  private boolean div;
  
  private String aFZ;
  
  private String Qnq;
  
  private Pee zGp;
  
  private qVZ Dne;
  
  private boolean IjH;
  
  private boolean DyG;
  
  private int Dne;
  
  private String zGp;
  
  private static final String[] Dne = new String[] { 
      "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", 
      "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", 
      "LPT6", "LPT7", "LPT8", "LPT9" };
  
  private Pee FWm;
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  public void bzF() {
    this.Dne.Dne();
    this.FWm.Dne();
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("selectWorld.create"), this.FWm / 2, 20, 16777215);
    if (this.IjH) {
      FWm((msA)this.Dne, irb.Dne("selectWorld.enterSeed"), this.FWm / 2 - 100, 47, 10526880);
      FWm((msA)this.Dne, irb.Dne("selectWorld.seedInfo"), this.FWm / 2 - 100, 85, 10526880);
      FWm((msA)this.Dne, irb.Dne("selectWorld.mapFeatures.info"), this.FWm / 2 - 150, 122, 10526880);
      FWm((msA)this.Dne, irb.Dne("selectWorld.allowCommands.info"), this.FWm / 2 - 150, 172, 10526880);
      this.FWm.Qnq();
    } else {
      FWm((msA)this.Dne, irb.Dne("selectWorld.enterName"), this.FWm / 2 - 100, 47, 10526880);
      FWm((msA)this.Dne, irb.Dne("selectWorld.resultFolder") + " " + this.FWm, this.FWm / 2 - 100, 85, 10526880);
      this.Dne.Qnq();
      FWm((msA)this.Dne, this.Qnq, this.FWm / 2 - 100, 137, 10526880);
      FWm((msA)this.Dne, this.aFZ, this.FWm / 2 - 100, 149, 10526880);
    } 
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  private void mrb() {
    Dne(!this.IjH);
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (this.Dne.FWm() && !this.IjH) {
      this.Dne.Dne(paramChar, paramInt);
      this.DyG = this.Dne.Dne();
    } else if (this.FWm.FWm() && this.IjH) {
      this.FWm.Dne(paramChar, paramInt);
      this.zGp = this.FWm.Dne();
    } 
    if (paramChar == '\r')
      Dne(this.Dne.get(0)); 
    ((Pee)this.Dne.get(0)).Dne = (this.Dne.Dne().length() > 0) ? 1 : 0;
    zGp();
  }
  
  public void Dne(xoY paramxoY) {
    this.DyG = KGL.Dne("selectWorld.newWorld.copyOf", new Object[] { paramxoY.Dne() });
    this.zGp = paramxoY.Dne() + "";
    this.Dne = paramxoY.Dne().FWm();
    this.Dne = (String[])paramxoY.FWm();
    this.bzF = paramxoY.bzF();
    this.Qnq = paramxoY.aFZ();
    if (paramxoY.Qnq()) {
      this.bzF = "hardcore";
    } else if (paramxoY.Dne().bzF()) {
      this.bzF = "survival";
    } else if (paramxoY.Dne().FWm()) {
      this.bzF = "creative";
    } 
  }
  
  private void IjH() {
    // Byte code:
    //   0: invokestatic Dne : ()Lirb;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Dne : LPee;
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: aload_1
    //   16: ldc 'selectWorld.gameMode'
    //   18: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: ldc ' '
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_1
    //   30: new java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: ldc 'selectWorld.gameMode.'
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: aload_0
    //   43: getfield bzF : Ljava/lang/String;
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual toString : ()Ljava/lang/String;
    //   52: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: putfield Dne : Ljava/lang/String;
    //   64: aload_0
    //   65: aload_1
    //   66: new java/lang/StringBuilder
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: ldc 'selectWorld.gameMode.'
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_0
    //   79: getfield bzF : Ljava/lang/String;
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: ldc_w '.line1'
    //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   97: putfield Qnq : Ljava/lang/String;
    //   100: aload_0
    //   101: aload_1
    //   102: new java/lang/StringBuilder
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: ldc 'selectWorld.gameMode.'
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload_0
    //   115: getfield bzF : Ljava/lang/String;
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: ldc_w '.line2'
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   133: putfield aFZ : Ljava/lang/String;
    //   136: aload_0
    //   137: getfield bzF : LPee;
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: aload_1
    //   148: ldc_w 'selectWorld.mapFeatures'
    //   151: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc ' '
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: invokevirtual toString : ()Ljava/lang/String;
    //   165: putfield Dne : Ljava/lang/String;
    //   168: aload_0
    //   169: getfield bzF : Z
    //   172: ifeq -> 215
    //   175: aload_0
    //   176: getfield bzF : LPee;
    //   179: new java/lang/StringBuilder
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: aload_0
    //   187: getfield bzF : LPee;
    //   190: getfield Dne : Ljava/lang/String;
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: aload_1
    //   197: ldc_w 'options.on'
    //   200: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual toString : ()Ljava/lang/String;
    //   209: putfield Dne : Ljava/lang/String;
    //   212: goto -> 252
    //   215: aload_0
    //   216: getfield bzF : LPee;
    //   219: new java/lang/StringBuilder
    //   222: dup
    //   223: invokespecial <init> : ()V
    //   226: aload_0
    //   227: getfield bzF : LPee;
    //   230: getfield Dne : Ljava/lang/String;
    //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: aload_1
    //   237: ldc_w 'options.off'
    //   240: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual toString : ()Ljava/lang/String;
    //   249: putfield Dne : Ljava/lang/String;
    //   252: aload_0
    //   253: getfield Qnq : LPee;
    //   256: new java/lang/StringBuilder
    //   259: dup
    //   260: invokespecial <init> : ()V
    //   263: aload_1
    //   264: ldc_w 'selectWorld.bonusItems'
    //   267: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: ldc ' '
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: invokevirtual toString : ()Ljava/lang/String;
    //   281: putfield Dne : Ljava/lang/String;
    //   284: aload_0
    //   285: getfield zGp : Z
    //   288: ifeq -> 338
    //   291: aload_0
    //   292: getfield DyG : Z
    //   295: ifne -> 338
    //   298: aload_0
    //   299: getfield Qnq : LPee;
    //   302: new java/lang/StringBuilder
    //   305: dup
    //   306: invokespecial <init> : ()V
    //   309: aload_0
    //   310: getfield Qnq : LPee;
    //   313: getfield Dne : Ljava/lang/String;
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload_1
    //   320: ldc_w 'options.on'
    //   323: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual toString : ()Ljava/lang/String;
    //   332: putfield Dne : Ljava/lang/String;
    //   335: goto -> 375
    //   338: aload_0
    //   339: getfield Qnq : LPee;
    //   342: new java/lang/StringBuilder
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: aload_0
    //   350: getfield Qnq : LPee;
    //   353: getfield Dne : Ljava/lang/String;
    //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: aload_1
    //   360: ldc_w 'options.off'
    //   363: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: invokevirtual toString : ()Ljava/lang/String;
    //   372: putfield Dne : Ljava/lang/String;
    //   375: aload_0
    //   376: getfield aFZ : LPee;
    //   379: new java/lang/StringBuilder
    //   382: dup
    //   383: invokespecial <init> : ()V
    //   386: aload_1
    //   387: ldc_w 'selectWorld.mapType'
    //   390: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: ldc ' '
    //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: aload_1
    //   402: getstatic kGO.Dne : [LkGO;
    //   405: aload_0
    //   406: getfield Dne : I
    //   409: aaload
    //   410: invokevirtual FWm : ()Ljava/lang/String;
    //   413: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: invokevirtual toString : ()Ljava/lang/String;
    //   422: putfield Dne : Ljava/lang/String;
    //   425: aload_0
    //   426: getfield zGp : LPee;
    //   429: new java/lang/StringBuilder
    //   432: dup
    //   433: invokespecial <init> : ()V
    //   436: aload_1
    //   437: ldc_w 'selectWorld.allowCommands'
    //   440: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: ldc ' '
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   451: invokevirtual toString : ()Ljava/lang/String;
    //   454: putfield Dne : Ljava/lang/String;
    //   457: aload_0
    //   458: getfield Qnq : Z
    //   461: ifeq -> 511
    //   464: aload_0
    //   465: getfield DyG : Z
    //   468: ifne -> 511
    //   471: aload_0
    //   472: getfield zGp : LPee;
    //   475: new java/lang/StringBuilder
    //   478: dup
    //   479: invokespecial <init> : ()V
    //   482: aload_0
    //   483: getfield zGp : LPee;
    //   486: getfield Dne : Ljava/lang/String;
    //   489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: aload_1
    //   493: ldc_w 'options.on'
    //   496: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   499: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: invokevirtual toString : ()Ljava/lang/String;
    //   505: putfield Dne : Ljava/lang/String;
    //   508: goto -> 548
    //   511: aload_0
    //   512: getfield zGp : LPee;
    //   515: new java/lang/StringBuilder
    //   518: dup
    //   519: invokespecial <init> : ()V
    //   522: aload_0
    //   523: getfield zGp : LPee;
    //   526: getfield Dne : Ljava/lang/String;
    //   529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: aload_1
    //   533: ldc_w 'options.off'
    //   536: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   539: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   542: invokevirtual toString : ()Ljava/lang/String;
    //   545: putfield Dne : Ljava/lang/String;
    //   548: return
  }
  
  protected void Dne(Pee paramPee) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : Z
    //   4: ifeq -> 672
    //   7: aload_1
    //   8: getfield aFZ : I
    //   11: iconst_1
    //   12: if_icmpne -> 29
    //   15: aload_0
    //   16: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   19: aload_0
    //   20: getfield Dne : LqVZ;
    //   23: invokevirtual Dne : (LqVZ;)V
    //   26: goto -> 672
    //   29: aload_1
    //   30: getfield aFZ : I
    //   33: ifne -> 236
    //   36: aload_0
    //   37: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   40: aconst_null
    //   41: checkcast qVZ
    //   44: invokevirtual Dne : (LqVZ;)V
    //   47: aload_0
    //   48: getfield div : Z
    //   51: ifeq -> 55
    //   54: return
    //   55: aload_0
    //   56: iconst_1
    //   57: putfield div : Z
    //   60: new java/util/Random
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: invokevirtual nextLong : ()J
    //   70: lstore_2
    //   71: aload_0
    //   72: getfield FWm : LmHN;
    //   75: invokevirtual Dne : ()Ljava/lang/String;
    //   78: astore #4
    //   80: aload #4
    //   82: invokestatic Dne : (Ljava/lang/String;)Z
    //   85: ifne -> 117
    //   88: aload #4
    //   90: invokestatic parseLong : (Ljava/lang/String;)J
    //   93: lstore #5
    //   95: lload #5
    //   97: lconst_0
    //   98: lcmp
    //   99: ifeq -> 105
    //   102: lload #5
    //   104: lstore_2
    //   105: goto -> 117
    //   108: astore #5
    //   110: aload #4
    //   112: invokevirtual hashCode : ()I
    //   115: i2l
    //   116: lstore_2
    //   117: aload_0
    //   118: getfield bzF : Ljava/lang/String;
    //   121: invokestatic Dne : (Ljava/lang/String;)LXHL;
    //   124: astore #5
    //   126: new mrb
    //   129: dup
    //   130: lload_2
    //   131: aload #5
    //   133: aload_0
    //   134: getfield bzF : Z
    //   137: aload_0
    //   138: getfield DyG : Z
    //   141: getstatic kGO.Dne : [LkGO;
    //   144: aload_0
    //   145: getfield Dne : I
    //   148: aaload
    //   149: invokespecial <init> : (JLXHL;ZZLkGO;)V
    //   152: astore #6
    //   154: aload #6
    //   156: aload_0
    //   157: getfield Dne : Ljava/lang/String;
    //   160: invokevirtual Dne : (Ljava/lang/String;)Lmrb;
    //   163: pop
    //   164: aload_0
    //   165: getfield zGp : Z
    //   168: ifeq -> 184
    //   171: aload_0
    //   172: getfield DyG : Z
    //   175: ifne -> 184
    //   178: aload #6
    //   180: invokevirtual Dne : ()Lmrb;
    //   183: pop
    //   184: aload_0
    //   185: getfield Qnq : Z
    //   188: ifeq -> 204
    //   191: aload_0
    //   192: getfield DyG : Z
    //   195: ifne -> 204
    //   198: aload #6
    //   200: invokevirtual FWm : ()Lmrb;
    //   203: pop
    //   204: aload_0
    //   205: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   208: aload_0
    //   209: getfield FWm : Ljava/lang/String;
    //   212: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   215: aload_0
    //   216: getfield Dne : LmHN;
    //   219: invokevirtual Dne : ()Ljava/lang/String;
    //   222: invokevirtual trim : ()Ljava/lang/String;
    //   225: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   228: aload #6
    //   230: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;Lmrb;)V
    //   233: goto -> 672
    //   236: aload_1
    //   237: getfield aFZ : I
    //   240: iconst_3
    //   241: if_icmpne -> 251
    //   244: aload_0
    //   245: invokespecial mrb : ()V
    //   248: goto -> 672
    //   251: aload_1
    //   252: getfield aFZ : I
    //   255: iconst_2
    //   256: if_icmpne -> 435
    //   259: aload_0
    //   260: getfield bzF : Ljava/lang/String;
    //   263: ldc 'survival'
    //   265: invokevirtual equals : (Ljava/lang/Object;)Z
    //   268: ifeq -> 322
    //   271: aload_0
    //   272: getfield aFZ : Z
    //   275: ifne -> 283
    //   278: aload_0
    //   279: iconst_0
    //   280: putfield Qnq : Z
    //   283: aload_0
    //   284: iconst_0
    //   285: putfield DyG : Z
    //   288: aload_0
    //   289: ldc 'hardcore'
    //   291: putfield bzF : Ljava/lang/String;
    //   294: aload_0
    //   295: iconst_1
    //   296: putfield DyG : Z
    //   299: aload_0
    //   300: getfield zGp : LPee;
    //   303: iconst_0
    //   304: putfield Dne : Z
    //   307: aload_0
    //   308: getfield Qnq : LPee;
    //   311: iconst_0
    //   312: putfield Dne : Z
    //   315: aload_0
    //   316: invokespecial IjH : ()V
    //   319: goto -> 428
    //   322: aload_0
    //   323: getfield bzF : Ljava/lang/String;
    //   326: ldc 'hardcore'
    //   328: invokevirtual equals : (Ljava/lang/Object;)Z
    //   331: ifeq -> 385
    //   334: aload_0
    //   335: getfield aFZ : Z
    //   338: ifne -> 346
    //   341: aload_0
    //   342: iconst_1
    //   343: putfield Qnq : Z
    //   346: aload_0
    //   347: iconst_0
    //   348: putfield DyG : Z
    //   351: aload_0
    //   352: ldc 'creative'
    //   354: putfield bzF : Ljava/lang/String;
    //   357: aload_0
    //   358: invokespecial IjH : ()V
    //   361: aload_0
    //   362: iconst_0
    //   363: putfield DyG : Z
    //   366: aload_0
    //   367: getfield zGp : LPee;
    //   370: iconst_1
    //   371: putfield Dne : Z
    //   374: aload_0
    //   375: getfield Qnq : LPee;
    //   378: iconst_1
    //   379: putfield Dne : Z
    //   382: goto -> 428
    //   385: aload_0
    //   386: getfield aFZ : Z
    //   389: ifne -> 397
    //   392: aload_0
    //   393: iconst_0
    //   394: putfield Qnq : Z
    //   397: aload_0
    //   398: ldc 'survival'
    //   400: putfield bzF : Ljava/lang/String;
    //   403: aload_0
    //   404: invokespecial IjH : ()V
    //   407: aload_0
    //   408: getfield zGp : LPee;
    //   411: iconst_1
    //   412: putfield Dne : Z
    //   415: aload_0
    //   416: getfield Qnq : LPee;
    //   419: iconst_1
    //   420: putfield Dne : Z
    //   423: aload_0
    //   424: iconst_0
    //   425: putfield DyG : Z
    //   428: aload_0
    //   429: invokespecial IjH : ()V
    //   432: goto -> 672
    //   435: aload_1
    //   436: getfield aFZ : I
    //   439: iconst_4
    //   440: if_icmpne -> 466
    //   443: aload_0
    //   444: aload_0
    //   445: getfield bzF : Z
    //   448: ifne -> 455
    //   451: iconst_1
    //   452: goto -> 456
    //   455: iconst_0
    //   456: putfield bzF : Z
    //   459: aload_0
    //   460: invokespecial IjH : ()V
    //   463: goto -> 672
    //   466: aload_1
    //   467: getfield aFZ : I
    //   470: bipush #7
    //   472: if_icmpne -> 498
    //   475: aload_0
    //   476: aload_0
    //   477: getfield zGp : Z
    //   480: ifne -> 487
    //   483: iconst_1
    //   484: goto -> 488
    //   487: iconst_0
    //   488: putfield zGp : Z
    //   491: aload_0
    //   492: invokespecial IjH : ()V
    //   495: goto -> 672
    //   498: aload_1
    //   499: getfield aFZ : I
    //   502: iconst_5
    //   503: if_icmpne -> 607
    //   506: aload_0
    //   507: dup
    //   508: getfield Dne : I
    //   511: iconst_1
    //   512: iadd
    //   513: putfield Dne : I
    //   516: aload_0
    //   517: getfield Dne : I
    //   520: getstatic kGO.Dne : [LkGO;
    //   523: arraylength
    //   524: if_icmplt -> 532
    //   527: aload_0
    //   528: iconst_0
    //   529: putfield Dne : I
    //   532: getstatic kGO.Dne : [LkGO;
    //   535: aload_0
    //   536: getfield Dne : I
    //   539: aaload
    //   540: ifnull -> 557
    //   543: getstatic kGO.Dne : [LkGO;
    //   546: aload_0
    //   547: getfield Dne : I
    //   550: aaload
    //   551: invokevirtual Dne : ()Z
    //   554: ifne -> 586
    //   557: aload_0
    //   558: dup
    //   559: getfield Dne : I
    //   562: iconst_1
    //   563: iadd
    //   564: putfield Dne : I
    //   567: aload_0
    //   568: getfield Dne : I
    //   571: getstatic kGO.Dne : [LkGO;
    //   574: arraylength
    //   575: if_icmplt -> 532
    //   578: aload_0
    //   579: iconst_0
    //   580: putfield Dne : I
    //   583: goto -> 532
    //   586: aload_0
    //   587: ldc ''
    //   589: putfield Dne : Ljava/lang/String;
    //   592: aload_0
    //   593: invokespecial IjH : ()V
    //   596: aload_0
    //   597: aload_0
    //   598: getfield IjH : Z
    //   601: invokespecial Dne : (Z)V
    //   604: goto -> 672
    //   607: aload_1
    //   608: getfield aFZ : I
    //   611: bipush #6
    //   613: if_icmpne -> 644
    //   616: aload_0
    //   617: iconst_1
    //   618: putfield aFZ : Z
    //   621: aload_0
    //   622: aload_0
    //   623: getfield Qnq : Z
    //   626: ifne -> 633
    //   629: iconst_1
    //   630: goto -> 634
    //   633: iconst_0
    //   634: putfield Qnq : Z
    //   637: aload_0
    //   638: invokespecial IjH : ()V
    //   641: goto -> 672
    //   644: aload_1
    //   645: getfield aFZ : I
    //   648: bipush #8
    //   650: if_icmpne -> 672
    //   653: aload_0
    //   654: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   657: new hcj
    //   660: dup
    //   661: aload_0
    //   662: aload_0
    //   663: getfield Dne : Ljava/lang/String;
    //   666: invokespecial <init> : (LLbd;Ljava/lang/String;)V
    //   669: invokevirtual Dne : (LqVZ;)V
    //   672: return
    // Exception table:
    //   from	to	target	type
    //   88	105	108	java/lang/NumberFormatException
  }
  
  private void Dne(boolean paramBoolean) {
    this.IjH = paramBoolean;
    ((Pee)this.Dne).FWm = !this.IjH;
    ((Pee)this.bzF).FWm = this.IjH;
    ((Pee)this.Qnq).FWm = this.IjH;
    ((Pee)this.aFZ).FWm = this.IjH;
    ((Pee)this.zGp).FWm = this.IjH;
    this.DyG.FWm = (this.IjH && kGO.Dne[this.Dne] == kGO.FWm);
    if (this.IjH) {
      irb irb = irb.Dne();
      this.FWm.Dne = irb.Dne("gui.done");
    } else {
      irb irb = irb.Dne();
      this.FWm.Dne = irb.Dne("selectWorld.moreWorldOptions");
    } 
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(new Pee(0, this.FWm / 2 - 155, this.bzF - 28, 150, 20, irb.Dne("selectWorld.create")));
    this.Dne.add(new Pee(1, this.FWm / 2 + 5, this.bzF - 28, 150, 20, irb.Dne("gui.cancel")));
    this.Dne.add(this.Dne = (String[])new Pee(2, this.FWm / 2 - 75, 115, 150, 20, "ERROR", false));
    this.Dne.add(this.FWm = new Pee(3, this.FWm / 2 - 75, 187, 150, 20, "ERROR", false));
    this.Dne.add(this.bzF = (String)new Pee(4, this.FWm / 2 - 155, 100, 150, 20, "ERROR", false));
    ((Pee)this.bzF).FWm = false;
    this.Dne.add(this.Qnq = (String)new Pee(7, this.FWm / 2 + 5, 151, 150, 20, irb.Dne("selectWorld.bonusItems")));
    ((Pee)this.Qnq).FWm = false;
    this.Dne.add(this.aFZ = (String)new Pee(5, this.FWm / 2 + 5, 100, 150, 20, irb.Dne("selectWorld.mapType")));
    ((Pee)this.aFZ).FWm = false;
    this.Dne.add(this.zGp = (String)new Pee(6, this.FWm / 2 - 155, 151, 150, 20, irb.Dne("selectWorld.allowCommands")));
    ((Pee)this.zGp).FWm = false;
    this.Dne.add(this.DyG = new Pee(8, this.FWm / 2 + 5, 120, 150, 20, irb.Dne("selectWorld.customizeType")));
    this.DyG.FWm = false;
    this.Dne = (String[])new mHN((msA)this.Dne, this.FWm / 2 - 100, 60, 200, 20);
    this.Dne.FWm(true);
    this.Dne.Dne(this.DyG);
    this.FWm = (Pee)new mHN((msA)this.Dne, this.FWm / 2 - 100, 60, 200, 20);
    this.FWm.Dne(this.zGp);
    Dne(this.IjH);
    zGp();
    IjH();
  }
  
  private void zGp() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield Dne : LmHN;
    //   5: invokevirtual Dne : ()Ljava/lang/String;
    //   8: invokevirtual trim : ()Ljava/lang/String;
    //   11: putfield FWm : Ljava/lang/String;
    //   14: getstatic BAQ.Dne : [C
    //   17: astore_1
    //   18: aload_1
    //   19: arraylength
    //   20: istore_2
    //   21: iconst_0
    //   22: istore_3
    //   23: iload_3
    //   24: iload_2
    //   25: if_icmpge -> 54
    //   28: aload_1
    //   29: iload_3
    //   30: caload
    //   31: istore #4
    //   33: aload_0
    //   34: aload_0
    //   35: getfield FWm : Ljava/lang/String;
    //   38: iload #4
    //   40: bipush #95
    //   42: invokevirtual replace : (CC)Ljava/lang/String;
    //   45: putfield FWm : Ljava/lang/String;
    //   48: iinc #3, 1
    //   51: goto -> 23
    //   54: aload_0
    //   55: getfield FWm : Ljava/lang/String;
    //   58: invokestatic Dne : (Ljava/lang/String;)Z
    //   61: ifeq -> 71
    //   64: aload_0
    //   65: ldc_w 'World'
    //   68: putfield FWm : Ljava/lang/String;
    //   71: aload_0
    //   72: aload_0
    //   73: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   76: invokevirtual Dne : ()LYiY;
    //   79: aload_0
    //   80: getfield FWm : Ljava/lang/String;
    //   83: invokestatic Dne : (LYiY;Ljava/lang/String;)Ljava/lang/String;
    //   86: putfield FWm : Ljava/lang/String;
    //   89: return
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    if (this.IjH) {
      this.FWm.Dne(paramInt1, paramInt2, paramInt3);
    } else {
      this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public static String Dne(YiY paramYiY, String paramString) {
    paramString = paramString.replaceAll("[\\./\"]", "_");
    for (String str : Dne) {
      if (paramString.equalsIgnoreCase(str))
        paramString = "_" + paramString + "_"; 
    } 
    while (paramYiY.Dne(paramString) != null)
      paramString = paramString + "-"; 
    return paramString;
  }
  
  public Lbd(qVZ paramqVZ) {
    this.bzF = '\001';
    this.Qnq = Character.MIN_VALUE;
    this.aFZ = Character.MIN_VALUE;
    this.zGp = Character.MIN_VALUE;
    this.DyG = false;
    this.Dne = false;
    this.Dne = (String[])"";
    this.Dne = (String[])paramqVZ;
    this.zGp = "";
    this.DyG = KGL.Dne("selectWorld.newWorld");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lbd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */