public class oEB extends BRM {
  private float bzF;
  
  private boolean vSL;
  
  private float FWm;
  
  private boolean FWm;
  
  private float Qnq;
  
  private float Dne;
  
  public float XHL() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual BJH : ()Z
    //   4: ifeq -> 12
    //   7: ldc 1.5393804
    //   9: goto -> 46
    //   12: aload_0
    //   13: invokevirtual LVR : ()Z
    //   16: ifeq -> 44
    //   19: ldc 0.55
    //   21: bipush #20
    //   23: aload_0
    //   24: getfield Dne : LluM;
    //   27: bipush #18
    //   29: invokevirtual Dne : (I)I
    //   32: isub
    //   33: i2f
    //   34: ldc 0.02
    //   36: fmul
    //   37: fsub
    //   38: ldc 3.1415927
    //   40: fmul
    //   41: goto -> 46
    //   44: ldc 0.62831855
    //   46: freturn
  }
  
  protected String div() {
    return "mob.wolf.death";
  }
  
  protected void mlD() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #18
    //   6: aload_0
    //   7: invokevirtual XHL : ()I
    //   10: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13: invokevirtual FWm : (ILjava/lang/Object;)V
    //   16: return
  }
  
  protected String DyG() {
    return "mob.wolf.hurt";
  }
  
  public oEB Dne(Azh paramAzh) {
    oEB oEB1 = new oEB(this.Dne);
    String str = FWm();
    if (str != null && str.trim().length() > 0) {
      oEB1.Dne(str);
      oEB1.mrb(true);
    } 
    return oEB1;
  }
  
  public String bzF() {
    return LVR() ? "/mob/wolf_tame.png" : (BJH() ? "/mob/wolf_angry.png" : super.bzF());
  }
  
  public int udO() {
    return ICU() ? 20 : super.udO();
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 8) {
      this.vSL = true;
      this.bzF = 0.0F;
      this.Qnq = 0.0F;
    } else {
      super.Dne(paramByte);
    } 
  }
  
  protected boolean yMz() {
    return (BJH() && !LVR());
  }
  
  public void IjH() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial IjH : ()V
    //   4: aload_0
    //   5: getfield Dne : LQnq;
    //   8: getfield aFZ : Z
    //   11: ifne -> 67
    //   14: aload_0
    //   15: getfield FWm : Z
    //   18: ifeq -> 67
    //   21: aload_0
    //   22: getfield vSL : Z
    //   25: ifne -> 67
    //   28: aload_0
    //   29: invokevirtual qrB : ()Z
    //   32: ifne -> 67
    //   35: aload_0
    //   36: getfield aFZ : Z
    //   39: ifeq -> 67
    //   42: aload_0
    //   43: iconst_1
    //   44: putfield vSL : Z
    //   47: aload_0
    //   48: fconst_0
    //   49: putfield bzF : F
    //   52: aload_0
    //   53: fconst_0
    //   54: putfield Qnq : F
    //   57: aload_0
    //   58: getfield Dne : LQnq;
    //   61: aload_0
    //   62: bipush #8
    //   64: invokevirtual Dne : (LsMa;B)V
    //   67: return
  }
  
  protected float div() {
    return 0.4F;
  }
  
  public boolean bzF(sMa paramsMa) {
    byte b = LVR() ? 4 : 2;
    return paramsMa.Dne(zBn.Dne(this), b);
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #18
    //   10: new java/lang/Integer
    //   13: dup
    //   14: aload_0
    //   15: invokevirtual XHL : ()I
    //   18: invokespecial <init> : (I)V
    //   21: invokevirtual Dne : (ILjava/lang/Object;)V
    //   24: aload_0
    //   25: getfield Dne : LluM;
    //   28: bipush #19
    //   30: new java/lang/Byte
    //   33: dup
    //   34: iconst_0
    //   35: invokespecial <init> : (B)V
    //   38: invokevirtual Dne : (ILjava/lang/Object;)V
    //   41: aload_0
    //   42: getfield Dne : LluM;
    //   45: bipush #20
    //   47: new java/lang/Byte
    //   50: dup
    //   51: iconst_1
    //   52: invokestatic b_ : (I)I
    //   55: i2b
    //   56: invokespecial <init> : (B)V
    //   59: invokevirtual Dne : (ILjava/lang/Object;)V
    //   62: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: aload_0
    //   6: getfield Dne : F
    //   9: putfield FWm : F
    //   12: aload_0
    //   13: invokevirtual qMV : ()Z
    //   16: ifeq -> 40
    //   19: aload_0
    //   20: dup
    //   21: getfield Dne : F
    //   24: fconst_1
    //   25: aload_0
    //   26: getfield Dne : F
    //   29: fsub
    //   30: ldc 0.4
    //   32: fmul
    //   33: fadd
    //   34: putfield Dne : F
    //   37: goto -> 58
    //   40: aload_0
    //   41: dup
    //   42: getfield Dne : F
    //   45: fconst_0
    //   46: aload_0
    //   47: getfield Dne : F
    //   50: fsub
    //   51: ldc 0.4
    //   53: fmul
    //   54: fadd
    //   55: putfield Dne : F
    //   58: aload_0
    //   59: invokevirtual qMV : ()Z
    //   62: ifeq -> 71
    //   65: aload_0
    //   66: bipush #10
    //   68: putfield eJi : I
    //   71: aload_0
    //   72: invokevirtual XHL : ()Z
    //   75: ifeq -> 101
    //   78: aload_0
    //   79: iconst_1
    //   80: putfield FWm : Z
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield vSL : Z
    //   88: aload_0
    //   89: fconst_0
    //   90: putfield bzF : F
    //   93: aload_0
    //   94: fconst_0
    //   95: putfield Qnq : F
    //   98: goto -> 343
    //   101: aload_0
    //   102: getfield FWm : Z
    //   105: ifne -> 115
    //   108: aload_0
    //   109: getfield vSL : Z
    //   112: ifeq -> 343
    //   115: aload_0
    //   116: getfield vSL : Z
    //   119: ifeq -> 343
    //   122: aload_0
    //   123: getfield bzF : F
    //   126: fconst_0
    //   127: fcmpl
    //   128: ifne -> 161
    //   131: aload_0
    //   132: ldc 'mob.wolf.shake'
    //   134: aload_0
    //   135: invokevirtual div : ()F
    //   138: aload_0
    //   139: getfield Dne : Ljava/util/Random;
    //   142: invokevirtual nextFloat : ()F
    //   145: aload_0
    //   146: getfield Dne : Ljava/util/Random;
    //   149: invokevirtual nextFloat : ()F
    //   152: fsub
    //   153: ldc 0.2
    //   155: fmul
    //   156: fconst_1
    //   157: fadd
    //   158: invokevirtual Dne : (Ljava/lang/String;FF)V
    //   161: aload_0
    //   162: aload_0
    //   163: getfield bzF : F
    //   166: putfield Qnq : F
    //   169: aload_0
    //   170: dup
    //   171: getfield bzF : F
    //   174: ldc 0.05
    //   176: fadd
    //   177: putfield bzF : F
    //   180: aload_0
    //   181: getfield Qnq : F
    //   184: fconst_2
    //   185: fcmpl
    //   186: iflt -> 209
    //   189: aload_0
    //   190: iconst_0
    //   191: putfield FWm : Z
    //   194: aload_0
    //   195: iconst_0
    //   196: putfield vSL : Z
    //   199: aload_0
    //   200: fconst_0
    //   201: putfield Qnq : F
    //   204: aload_0
    //   205: fconst_0
    //   206: putfield bzF : F
    //   209: aload_0
    //   210: getfield bzF : F
    //   213: ldc 0.4
    //   215: fcmpl
    //   216: ifle -> 343
    //   219: aload_0
    //   220: getfield Dne : LbSp;
    //   223: getfield FWm : D
    //   226: d2f
    //   227: fstore_1
    //   228: aload_0
    //   229: getfield bzF : F
    //   232: ldc 0.4
    //   234: fsub
    //   235: ldc 3.1415927
    //   237: fmul
    //   238: invokestatic Dne : (F)F
    //   241: ldc 7.0
    //   243: fmul
    //   244: f2i
    //   245: istore_2
    //   246: iconst_0
    //   247: istore_3
    //   248: iload_3
    //   249: iload_2
    //   250: if_icmpge -> 343
    //   253: aload_0
    //   254: getfield Dne : Ljava/util/Random;
    //   257: invokevirtual nextFloat : ()F
    //   260: fconst_2
    //   261: fmul
    //   262: fconst_1
    //   263: fsub
    //   264: aload_0
    //   265: getfield ooe : F
    //   268: fmul
    //   269: ldc 0.5
    //   271: fmul
    //   272: fstore #4
    //   274: aload_0
    //   275: getfield Dne : Ljava/util/Random;
    //   278: invokevirtual nextFloat : ()F
    //   281: fconst_2
    //   282: fmul
    //   283: fconst_1
    //   284: fsub
    //   285: aload_0
    //   286: getfield ooe : F
    //   289: fmul
    //   290: ldc 0.5
    //   292: fmul
    //   293: fstore #5
    //   295: aload_0
    //   296: getfield Dne : LQnq;
    //   299: ldc 'splash'
    //   301: aload_0
    //   302: getfield div : D
    //   305: fload #4
    //   307: f2d
    //   308: dadd
    //   309: fload_1
    //   310: ldc 0.8
    //   312: fadd
    //   313: f2d
    //   314: aload_0
    //   315: getfield mrb : D
    //   318: fload #5
    //   320: f2d
    //   321: dadd
    //   322: aload_0
    //   323: getfield XHL : D
    //   326: aload_0
    //   327: getfield Zpi : D
    //   330: aload_0
    //   331: getfield kGO : D
    //   334: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   337: iinc #3, 1
    //   340: goto -> 248
    //   343: return
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Angry", BJH());
    paramWkD.Dne("CollarColor", (byte)qLR());
  }
  
  public float Dne(float paramFloat1, float paramFloat2) {
    float f = (this.Qnq + (this.bzF - this.Qnq) * paramFloat1 + paramFloat2) / 1.8F;
    if (f < 0.0F) {
      f = 0.0F;
    } else if (f > 1.0F) {
      f = 1.0F;
    } 
    return geR.Dne(f * 3.1415927F) * geR.Dne(f * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
  }
  
  public boolean BJH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: iconst_2
    //   10: iand
    //   11: ifeq -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: ireturn
  }
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    Zpi(paramWkD.FWm("Angry"));
    if (paramWkD.Dne("CollarColor"))
      kGO(paramWkD.Dne("CollarColor")); 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.wolf.step", 0.15F, 1.0F);
  }
  
  public void kGO(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #19
    //   6: invokevirtual Dne : (I)B
    //   9: istore_2
    //   10: iload_1
    //   11: ifeq -> 30
    //   14: aload_0
    //   15: getfield Dne : LluM;
    //   18: bipush #19
    //   20: iconst_1
    //   21: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   24: invokevirtual FWm : (ILjava/lang/Object;)V
    //   27: goto -> 43
    //   30: aload_0
    //   31: getfield Dne : LluM;
    //   34: bipush #19
    //   36: iconst_0
    //   37: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   40: invokevirtual FWm : (ILjava/lang/Object;)V
    //   43: return
  }
  
  public boolean tgc() {
    return true;
  }
  
  public boolean a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LMOS;
    //   4: invokevirtual Dne : ()LNMq;
    //   7: astore_2
    //   8: aload_0
    //   9: invokevirtual LVR : ()Z
    //   12: ifeq -> 269
    //   15: aload_2
    //   16: ifnull -> 202
    //   19: getstatic dEr.Dne : [LdEr;
    //   22: aload_2
    //   23: getfield bzF : I
    //   26: aaload
    //   27: instanceof PBI
    //   30: ifeq -> 124
    //   33: getstatic dEr.Dne : [LdEr;
    //   36: aload_2
    //   37: getfield bzF : I
    //   40: aaload
    //   41: checkcast PBI
    //   44: astore_3
    //   45: aload_3
    //   46: invokevirtual aFZ : ()Z
    //   49: ifeq -> 121
    //   52: aload_0
    //   53: getfield Dne : LluM;
    //   56: bipush #18
    //   58: invokevirtual Dne : (I)I
    //   61: bipush #20
    //   63: if_icmpge -> 121
    //   66: aload_1
    //   67: getfield Dne : Luqg;
    //   70: getfield Qnq : Z
    //   73: ifne -> 86
    //   76: aload_2
    //   77: dup
    //   78: getfield Dne : I
    //   81: iconst_1
    //   82: isub
    //   83: putfield Dne : I
    //   86: aload_0
    //   87: aload_3
    //   88: invokevirtual FWm : ()I
    //   91: invokevirtual Dne : (I)V
    //   94: aload_2
    //   95: getfield Dne : I
    //   98: ifgt -> 119
    //   101: aload_1
    //   102: getfield Dne : LMOS;
    //   105: aload_1
    //   106: getfield Dne : LMOS;
    //   109: getfield Dne : I
    //   112: aconst_null
    //   113: checkcast NMq
    //   116: invokevirtual Dne : (ILNMq;)V
    //   119: iconst_1
    //   120: ireturn
    //   121: goto -> 202
    //   124: aload_2
    //   125: getfield bzF : I
    //   128: getstatic dEr.edi : LdEr;
    //   131: getfield Qnq : I
    //   134: if_icmpne -> 202
    //   137: aload_2
    //   138: invokevirtual Qnq : ()I
    //   141: invokestatic b_ : (I)I
    //   144: istore_3
    //   145: iload_3
    //   146: aload_0
    //   147: invokevirtual qLR : ()I
    //   150: if_icmpeq -> 202
    //   153: aload_0
    //   154: iload_3
    //   155: invokevirtual kGO : (I)V
    //   158: aload_1
    //   159: getfield Dne : Luqg;
    //   162: getfield Qnq : Z
    //   165: ifne -> 200
    //   168: aload_2
    //   169: dup
    //   170: getfield Dne : I
    //   173: iconst_1
    //   174: isub
    //   175: dup_x1
    //   176: putfield Dne : I
    //   179: ifgt -> 200
    //   182: aload_1
    //   183: getfield Dne : LMOS;
    //   186: aload_1
    //   187: getfield Dne : LMOS;
    //   190: getfield Dne : I
    //   193: aconst_null
    //   194: checkcast NMq
    //   197: invokevirtual Dne : (ILNMq;)V
    //   200: iconst_1
    //   201: ireturn
    //   202: aload_1
    //   203: getfield aFZ : Ljava/lang/String;
    //   206: aload_0
    //   207: invokevirtual FWm : ()Ljava/lang/String;
    //   210: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   213: ifeq -> 437
    //   216: aload_0
    //   217: getfield Dne : LQnq;
    //   220: getfield aFZ : Z
    //   223: ifne -> 437
    //   226: aload_0
    //   227: aload_2
    //   228: invokevirtual Dne : (LNMq;)Z
    //   231: ifne -> 437
    //   234: aload_0
    //   235: getfield Dne : LHAo;
    //   238: aload_0
    //   239: invokevirtual ICU : ()Z
    //   242: ifne -> 249
    //   245: iconst_1
    //   246: goto -> 250
    //   249: iconst_0
    //   250: invokevirtual Dne : (Z)V
    //   253: aload_0
    //   254: iconst_0
    //   255: putfield oIf : Z
    //   258: aload_0
    //   259: aconst_null
    //   260: checkcast wdG
    //   263: invokevirtual Dne : (LwdG;)V
    //   266: goto -> 437
    //   269: aload_2
    //   270: ifnull -> 437
    //   273: aload_2
    //   274: getfield bzF : I
    //   277: getstatic dEr.tIz : LdEr;
    //   280: getfield Qnq : I
    //   283: if_icmpne -> 437
    //   286: aload_0
    //   287: invokevirtual BJH : ()Z
    //   290: ifne -> 437
    //   293: aload_1
    //   294: getfield Dne : Luqg;
    //   297: getfield Qnq : Z
    //   300: ifne -> 313
    //   303: aload_2
    //   304: dup
    //   305: getfield Dne : I
    //   308: iconst_1
    //   309: isub
    //   310: putfield Dne : I
    //   313: aload_2
    //   314: getfield Dne : I
    //   317: ifgt -> 338
    //   320: aload_1
    //   321: getfield Dne : LMOS;
    //   324: aload_1
    //   325: getfield Dne : LMOS;
    //   328: getfield Dne : I
    //   331: aconst_null
    //   332: checkcast NMq
    //   335: invokevirtual Dne : (ILNMq;)V
    //   338: aload_0
    //   339: getfield Dne : LQnq;
    //   342: getfield aFZ : Z
    //   345: ifne -> 435
    //   348: aload_0
    //   349: getfield Dne : Ljava/util/Random;
    //   352: iconst_3
    //   353: invokevirtual nextInt : (I)I
    //   356: ifne -> 420
    //   359: aload_0
    //   360: iconst_1
    //   361: invokevirtual mrb : (Z)V
    //   364: aload_0
    //   365: aconst_null
    //   366: checkcast wdG
    //   369: invokevirtual Dne : (LwdG;)V
    //   372: aload_0
    //   373: aconst_null
    //   374: checkcast FUH
    //   377: invokevirtual FWm : (LFUH;)V
    //   380: aload_0
    //   381: getfield Dne : LHAo;
    //   384: iconst_1
    //   385: invokevirtual Dne : (Z)V
    //   388: aload_0
    //   389: bipush #20
    //   391: invokevirtual bzF : (I)V
    //   394: aload_0
    //   395: aload_1
    //   396: getfield aFZ : Ljava/lang/String;
    //   399: invokevirtual Dne : (Ljava/lang/String;)V
    //   402: aload_0
    //   403: iconst_1
    //   404: invokevirtual IjH : (Z)V
    //   407: aload_0
    //   408: getfield Dne : LQnq;
    //   411: aload_0
    //   412: bipush #7
    //   414: invokevirtual Dne : (LsMa;B)V
    //   417: goto -> 435
    //   420: aload_0
    //   421: iconst_0
    //   422: invokevirtual IjH : (Z)V
    //   425: aload_0
    //   426: getfield Dne : LQnq;
    //   429: aload_0
    //   430: bipush #6
    //   432: invokevirtual Dne : (LsMa;B)V
    //   435: iconst_1
    //   436: ireturn
    //   437: aload_0
    //   438: aload_1
    //   439: invokespecial a_ : (LFiG;)Z
    //   442: ireturn
  }
  
  public oEB(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: ldc_w '/mob/wolf.png'
    //   9: putfield bzF : Ljava/lang/String;
    //   12: aload_0
    //   13: ldc_w 0.6
    //   16: ldc 0.8
    //   18: invokevirtual Dne : (FF)V
    //   21: aload_0
    //   22: ldc_w 0.3
    //   25: putfield cHy : F
    //   28: aload_0
    //   29: invokevirtual Dne : ()LKFZ;
    //   32: iconst_1
    //   33: invokevirtual Dne : (Z)V
    //   36: aload_0
    //   37: getfield Dne : LOKo;
    //   40: iconst_1
    //   41: new Cyb
    //   44: dup
    //   45: aload_0
    //   46: invokespecial <init> : (LFUH;)V
    //   49: invokevirtual Dne : (ILcMv;)V
    //   52: aload_0
    //   53: getfield Dne : LOKo;
    //   56: iconst_2
    //   57: aload_0
    //   58: getfield Dne : LHAo;
    //   61: invokevirtual Dne : (ILcMv;)V
    //   64: aload_0
    //   65: getfield Dne : LOKo;
    //   68: iconst_3
    //   69: new NQg
    //   72: dup
    //   73: aload_0
    //   74: ldc 0.4
    //   76: invokespecial <init> : (LFUH;F)V
    //   79: invokevirtual Dne : (ILcMv;)V
    //   82: aload_0
    //   83: getfield Dne : LOKo;
    //   86: iconst_4
    //   87: new etz
    //   90: dup
    //   91: aload_0
    //   92: aload_0
    //   93: getfield cHy : F
    //   96: iconst_1
    //   97: invokespecial <init> : (LFUH;FZ)V
    //   100: invokevirtual Dne : (ILcMv;)V
    //   103: aload_0
    //   104: getfield Dne : LOKo;
    //   107: iconst_5
    //   108: new ReV
    //   111: dup
    //   112: aload_0
    //   113: aload_0
    //   114: getfield cHy : F
    //   117: ldc_w 10.0
    //   120: fconst_2
    //   121: invokespecial <init> : (LBRM;FFF)V
    //   124: invokevirtual Dne : (ILcMv;)V
    //   127: aload_0
    //   128: getfield Dne : LOKo;
    //   131: bipush #6
    //   133: new znX
    //   136: dup
    //   137: aload_0
    //   138: aload_0
    //   139: getfield cHy : F
    //   142: invokespecial <init> : (LHzK;F)V
    //   145: invokevirtual Dne : (ILcMv;)V
    //   148: aload_0
    //   149: getfield Dne : LOKo;
    //   152: bipush #7
    //   154: new IBw
    //   157: dup
    //   158: aload_0
    //   159: aload_0
    //   160: getfield cHy : F
    //   163: invokespecial <init> : (LkSJ;F)V
    //   166: invokevirtual Dne : (ILcMv;)V
    //   169: aload_0
    //   170: getfield Dne : LOKo;
    //   173: bipush #8
    //   175: new hgI
    //   178: dup
    //   179: aload_0
    //   180: ldc_w 8.0
    //   183: invokespecial <init> : (LoEB;F)V
    //   186: invokevirtual Dne : (ILcMv;)V
    //   189: aload_0
    //   190: getfield Dne : LOKo;
    //   193: bipush #9
    //   195: new yws
    //   198: dup
    //   199: aload_0
    //   200: ldc_w FiG
    //   203: ldc_w 8.0
    //   206: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   209: invokevirtual Dne : (ILcMv;)V
    //   212: aload_0
    //   213: getfield Dne : LOKo;
    //   216: bipush #9
    //   218: new cHg
    //   221: dup
    //   222: aload_0
    //   223: invokespecial <init> : (LFUH;)V
    //   226: invokevirtual Dne : (ILcMv;)V
    //   229: aload_0
    //   230: getfield FWm : LOKo;
    //   233: iconst_1
    //   234: new DAo
    //   237: dup
    //   238: aload_0
    //   239: invokespecial <init> : (LBRM;)V
    //   242: invokevirtual Dne : (ILcMv;)V
    //   245: aload_0
    //   246: getfield FWm : LOKo;
    //   249: iconst_2
    //   250: new dSI
    //   253: dup
    //   254: aload_0
    //   255: invokespecial <init> : (LBRM;)V
    //   258: invokevirtual Dne : (ILcMv;)V
    //   261: aload_0
    //   262: getfield FWm : LOKo;
    //   265: iconst_3
    //   266: new QRF
    //   269: dup
    //   270: aload_0
    //   271: iconst_1
    //   272: invokespecial <init> : (LFUH;Z)V
    //   275: invokevirtual Dne : (ILcMv;)V
    //   278: aload_0
    //   279: getfield FWm : LOKo;
    //   282: iconst_4
    //   283: new zIt
    //   286: dup
    //   287: aload_0
    //   288: ldc_w Pvd
    //   291: ldc_w 16.0
    //   294: sipush #200
    //   297: iconst_0
    //   298: invokespecial <init> : (LBRM;Ljava/lang/Class;FIZ)V
    //   301: invokevirtual Dne : (ILcMv;)V
    //   304: return
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual EyB : ()Z
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: invokevirtual FWm : ()LsMa;
    //   13: astore_3
    //   14: aload_0
    //   15: getfield Dne : LHAo;
    //   18: iconst_0
    //   19: invokevirtual Dne : (Z)V
    //   22: aload_3
    //   23: ifnull -> 46
    //   26: aload_3
    //   27: instanceof FiG
    //   30: ifne -> 46
    //   33: aload_3
    //   34: instanceof hhc
    //   37: ifne -> 46
    //   40: iload_2
    //   41: iconst_1
    //   42: iadd
    //   43: iconst_2
    //   44: idiv
    //   45: istore_2
    //   46: aload_0
    //   47: aload_1
    //   48: iload_2
    //   49: invokespecial Dne : (LzBn;I)Z
    //   52: ireturn
  }
  
  public int qLR() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #20
    //   6: invokevirtual Dne : (I)B
    //   9: bipush #15
    //   11: iand
    //   12: ireturn
  }
  
  protected String zGp() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual BJH : ()Z
    //   4: ifeq -> 13
    //   7: ldc_w 'mob.wolf.growl'
    //   10: goto -> 60
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/Random;
    //   17: iconst_3
    //   18: invokevirtual nextInt : (I)I
    //   21: ifne -> 57
    //   24: aload_0
    //   25: invokevirtual LVR : ()Z
    //   28: ifeq -> 51
    //   31: aload_0
    //   32: getfield Dne : LluM;
    //   35: bipush #18
    //   37: invokevirtual Dne : (I)I
    //   40: bipush #10
    //   42: if_icmpge -> 51
    //   45: ldc_w 'mob.wolf.whine'
    //   48: goto -> 60
    //   51: ldc_w 'mob.wolf.panting'
    //   54: goto -> 60
    //   57: ldc_w 'mob.wolf.bark'
    //   60: areturn
  }
  
  public float Qnq(float paramFloat) {
    return (this.FWm + (this.Dne - this.FWm) * paramFloat) * 0.15F * 3.1415927F;
  }
  
  public int Dne() {
    return LVR() ? 20 : 8;
  }
  
  public boolean FYZ() {
    return this.FWm;
  }
  
  public float bzF(float paramFloat) {
    return 0.75F + (this.Qnq + (this.bzF - this.Qnq) * paramFloat) / 2.0F * 0.25F;
  }
  
  public boolean Dne(HzK paramHzK) {
    if (paramHzK == this)
      return false; 
    if (!LVR())
      return false; 
    if (!(paramHzK instanceof oEB))
      return false; 
    oEB oEB1 = (oEB)paramHzK;
    return !oEB1.LVR() ? false : (oEB1.ICU() ? false : ((ZfC() && oEB1.ZfC())));
  }
  
  public boolean qMV() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #19
    //   6: invokevirtual Dne : (I)B
    //   9: iconst_1
    //   10: if_icmpne -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: ireturn
  }
  
  public float c_() {
    return this.trS * 0.8F;
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq == null) ? false : (!(dEr.Dne[paramNMq.bzF] instanceof PBI) ? false : ((PBI)dEr.Dne[paramNMq.bzF]).aFZ());
  }
  
  public void kGO(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #20
    //   6: iload_1
    //   7: bipush #15
    //   9: iand
    //   10: i2b
    //   11: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   14: invokevirtual FWm : (ILjava/lang/Object;)V
    //   17: return
  }
  
  public void Zpi(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: istore_2
    //   10: iload_1
    //   11: ifeq -> 33
    //   14: aload_0
    //   15: getfield Dne : LluM;
    //   18: bipush #16
    //   20: iload_2
    //   21: iconst_2
    //   22: ior
    //   23: i2b
    //   24: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   27: invokevirtual FWm : (ILjava/lang/Object;)V
    //   30: goto -> 50
    //   33: aload_0
    //   34: getfield Dne : LluM;
    //   37: bipush #16
    //   39: iload_2
    //   40: bipush #-3
    //   42: iand
    //   43: i2b
    //   44: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   47: invokevirtual FWm : (ILjava/lang/Object;)V
    //   50: return
  }
  
  public int ooe() {
    return 8;
  }
  
  protected int kGO() {
    return -1;
  }
  
  public void FWm(FUH paramFUH) {
    super.FWm(paramFUH);
    if (paramFUH instanceof FiG)
      Zpi(true); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oEB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */