import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class YAD extends QCe {
  protected Gor Dne;
  
  protected Gor FWm;
  
  protected void Dne(FUH paramFUH) {
    Dne(paramFUH.bzF());
  }
  
  public void Dne(Gor paramGor) {
    this.FWm = paramGor;
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {}
  
  protected void bzF(FUH paramFUH, float paramFloat) {
    int i = paramFUH.trS();
    if (i > 0) {
      hhc hhc = new hhc(paramFUH.Dne, paramFUH.div, paramFUH.IjH, paramFUH.mrb);
      Random random = new Random(paramFUH.aFZ);
      Cit.Dne();
      for (byte b = 0; b < i; b++) {
        GL11.glPushMatrix();
        rxL rxL = this.Dne.Dne(random);
        UgT ugT = rxL.Dne.get(random.nextInt(rxL.Dne.size()));
        rxL.bzF(0.0625F);
        float f1 = random.nextFloat();
        float f2 = random.nextFloat();
        float f3 = random.nextFloat();
        float f4 = (ugT.Dne + (ugT.Qnq - ugT.Dne) * f1) / 16.0F;
        float f5 = (ugT.FWm + (ugT.aFZ - ugT.FWm) * f2) / 16.0F;
        float f6 = (ugT.bzF + (ugT.zGp - ugT.bzF) * f3) / 16.0F;
        GL11.glTranslatef(f4, f5, f6);
        f1 = f1 * 2.0F - 1.0F;
        f2 = f2 * 2.0F - 1.0F;
        f3 = f3 * 2.0F - 1.0F;
        f1 *= -1.0F;
        f2 *= -1.0F;
        f3 *= -1.0F;
        float f7 = geR.bzF(f1 * f1 + f3 * f3);
        hhc.Zpi = hhc.mrb = (float)(Math.atan2(f1, f3) * 180.0D / Math.PI);
        hhc.kGO = hhc.XHL = (float)(Math.atan2(f2, f7) * 180.0D / Math.PI);
        double d1 = 0.0D;
        double d2 = 0.0D;
        double d3 = 0.0D;
        float f8 = 0.0F;
        this.Dne.Dne(hhc, d1, d2, d3, f8, paramFloat);
        GL11.glPopMatrix();
      } 
      Cit.FWm();
    } 
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {}
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    GL11.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
    if (paramFUH.vSL > 0.0F) {
      float f = (paramFUH.vSL + paramFloat3 - 1.0F) / 20.0F * 1.6F;
      f = geR.bzF(f);
      if (f > 1.0F)
        f = 1.0F; 
      GL11.glRotatef(f * Dne(paramFUH), 0.0F, 0.0F, 1.0F);
    } 
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((FUH)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public YAD(Gor paramGor, float paramFloat) {
    this.Dne = paramGor;
    this.Dne = paramFloat;
  }
  
  protected void Dne(FUH paramFUH, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield Dne : LptH;
    //   5: getfield Dne : LFUH;
    //   8: invokevirtual Dne : (LsMa;)D
    //   11: dstore #10
    //   13: dload #10
    //   15: iload #9
    //   17: iload #9
    //   19: imul
    //   20: i2d
    //   21: dcmpg
    //   22: ifgt -> 344
    //   25: aload_0
    //   26: invokevirtual Dne : ()LmsA;
    //   29: astore #12
    //   31: ldc 1.6
    //   33: fstore #13
    //   35: ldc 0.016666668
    //   37: fload #13
    //   39: fmul
    //   40: fstore #14
    //   42: invokestatic glPushMatrix : ()V
    //   45: dload_3
    //   46: d2f
    //   47: fconst_0
    //   48: fadd
    //   49: dload #5
    //   51: d2f
    //   52: aload_1
    //   53: getfield trS : F
    //   56: fadd
    //   57: ldc 0.5
    //   59: fadd
    //   60: dload #7
    //   62: d2f
    //   63: invokestatic glTranslatef : (FFF)V
    //   66: fconst_0
    //   67: fconst_1
    //   68: fconst_0
    //   69: invokestatic glNormal3f : (FFF)V
    //   72: aload_0
    //   73: getfield Dne : LptH;
    //   76: getfield Dne : F
    //   79: fneg
    //   80: fconst_0
    //   81: fconst_1
    //   82: fconst_0
    //   83: invokestatic glRotatef : (FFFF)V
    //   86: aload_0
    //   87: getfield Dne : LptH;
    //   90: getfield FWm : F
    //   93: fconst_1
    //   94: fconst_0
    //   95: fconst_0
    //   96: invokestatic glRotatef : (FFFF)V
    //   99: fload #14
    //   101: fneg
    //   102: fload #14
    //   104: fneg
    //   105: fload #14
    //   107: invokestatic glScalef : (FFF)V
    //   110: sipush #2896
    //   113: invokestatic glDisable : (I)V
    //   116: iconst_0
    //   117: invokestatic glDepthMask : (Z)V
    //   120: sipush #2929
    //   123: invokestatic glDisable : (I)V
    //   126: sipush #3042
    //   129: invokestatic glEnable : (I)V
    //   132: sipush #770
    //   135: sipush #771
    //   138: invokestatic glBlendFunc : (II)V
    //   141: getstatic WAR.Dne : LWAR;
    //   144: astore #15
    //   146: iconst_0
    //   147: istore #16
    //   149: aload_2
    //   150: ldc 'deadmau5'
    //   152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   155: ifeq -> 162
    //   158: bipush #-10
    //   160: istore #16
    //   162: sipush #3553
    //   165: invokestatic glDisable : (I)V
    //   168: aload #15
    //   170: invokevirtual Dne : ()V
    //   173: aload #12
    //   175: aload_2
    //   176: invokevirtual Dne : (Ljava/lang/String;)I
    //   179: iconst_2
    //   180: idiv
    //   181: istore #17
    //   183: aload #15
    //   185: fconst_0
    //   186: fconst_0
    //   187: fconst_0
    //   188: ldc 0.25
    //   190: invokevirtual Dne : (FFFF)V
    //   193: aload #15
    //   195: iload #17
    //   197: ineg
    //   198: iconst_1
    //   199: isub
    //   200: i2d
    //   201: iconst_m1
    //   202: iload #16
    //   204: iadd
    //   205: i2d
    //   206: dconst_0
    //   207: invokevirtual Dne : (DDD)V
    //   210: aload #15
    //   212: iload #17
    //   214: ineg
    //   215: iconst_1
    //   216: isub
    //   217: i2d
    //   218: bipush #8
    //   220: iload #16
    //   222: iadd
    //   223: i2d
    //   224: dconst_0
    //   225: invokevirtual Dne : (DDD)V
    //   228: aload #15
    //   230: iload #17
    //   232: iconst_1
    //   233: iadd
    //   234: i2d
    //   235: bipush #8
    //   237: iload #16
    //   239: iadd
    //   240: i2d
    //   241: dconst_0
    //   242: invokevirtual Dne : (DDD)V
    //   245: aload #15
    //   247: iload #17
    //   249: iconst_1
    //   250: iadd
    //   251: i2d
    //   252: iconst_m1
    //   253: iload #16
    //   255: iadd
    //   256: i2d
    //   257: dconst_0
    //   258: invokevirtual Dne : (DDD)V
    //   261: aload #15
    //   263: invokevirtual Dne : ()I
    //   266: pop
    //   267: sipush #3553
    //   270: invokestatic glEnable : (I)V
    //   273: aload #12
    //   275: aload_2
    //   276: aload #12
    //   278: aload_2
    //   279: invokevirtual Dne : (Ljava/lang/String;)I
    //   282: ineg
    //   283: iconst_2
    //   284: idiv
    //   285: iload #16
    //   287: ldc 553648127
    //   289: invokevirtual FWm : (Ljava/lang/String;III)I
    //   292: pop
    //   293: sipush #2929
    //   296: invokestatic glEnable : (I)V
    //   299: iconst_1
    //   300: invokestatic glDepthMask : (Z)V
    //   303: aload #12
    //   305: aload_2
    //   306: aload #12
    //   308: aload_2
    //   309: invokevirtual Dne : (Ljava/lang/String;)I
    //   312: ineg
    //   313: iconst_2
    //   314: idiv
    //   315: iload #16
    //   317: iconst_m1
    //   318: invokevirtual FWm : (Ljava/lang/String;III)I
    //   321: pop
    //   322: sipush #2896
    //   325: invokestatic glEnable : (I)V
    //   328: sipush #3042
    //   331: invokestatic glDisable : (I)V
    //   334: fconst_1
    //   335: fconst_1
    //   336: fconst_1
    //   337: fconst_1
    //   338: invokestatic glColor4f : (FFFF)V
    //   341: invokestatic glPopMatrix : ()V
    //   344: return
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return -1;
  }
  
  private float Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f;
    for (f = paramFloat2 - paramFloat1; f < -180.0F; f += 360.0F);
    while (f >= 180.0F)
      f -= 360.0F; 
    return paramFloat1 + paramFloat3 * f;
  }
  
  protected void Dne(FUH paramFUH, int paramInt, float paramFloat) {}
  
  protected void FWm(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: invokestatic FWm : ()Z
    //   3: ifeq -> 404
    //   6: aload_1
    //   7: aload_0
    //   8: getfield Dne : LptH;
    //   11: getfield Dne : LFUH;
    //   14: if_acmpeq -> 404
    //   17: aload_1
    //   18: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   21: getfield Dne : LMJs;
    //   24: invokevirtual FWm : (LFiG;)Z
    //   27: ifne -> 404
    //   30: aload_1
    //   31: invokevirtual mlD : ()Z
    //   34: ifne -> 55
    //   37: aload_1
    //   38: invokevirtual ZgS : ()Z
    //   41: ifeq -> 404
    //   44: aload_1
    //   45: aload_0
    //   46: getfield Dne : LptH;
    //   49: getfield FWm : LFUH;
    //   52: if_acmpne -> 404
    //   55: ldc 1.6
    //   57: fstore #8
    //   59: ldc 0.016666668
    //   61: fload #8
    //   63: fmul
    //   64: fstore #9
    //   66: aload_1
    //   67: aload_0
    //   68: getfield Dne : LptH;
    //   71: getfield Dne : LFUH;
    //   74: invokevirtual Dne : (LsMa;)D
    //   77: dstore #10
    //   79: aload_1
    //   80: invokevirtual aFZ : ()Z
    //   83: ifeq -> 92
    //   86: ldc_w 32.0
    //   89: goto -> 95
    //   92: ldc_w 64.0
    //   95: fstore #12
    //   97: dload #10
    //   99: fload #12
    //   101: fload #12
    //   103: fmul
    //   104: f2d
    //   105: dcmpg
    //   106: ifge -> 404
    //   109: aload_1
    //   110: invokevirtual aFZ : ()Ljava/lang/String;
    //   113: astore #13
    //   115: aload_1
    //   116: invokevirtual aFZ : ()Z
    //   119: ifeq -> 388
    //   122: aload_0
    //   123: invokevirtual Dne : ()LmsA;
    //   126: astore #14
    //   128: invokestatic glPushMatrix : ()V
    //   131: dload_2
    //   132: d2f
    //   133: fconst_0
    //   134: fadd
    //   135: dload #4
    //   137: d2f
    //   138: aload_1
    //   139: getfield trS : F
    //   142: fadd
    //   143: ldc 0.5
    //   145: fadd
    //   146: dload #6
    //   148: d2f
    //   149: invokestatic glTranslatef : (FFF)V
    //   152: fconst_0
    //   153: fconst_1
    //   154: fconst_0
    //   155: invokestatic glNormal3f : (FFF)V
    //   158: aload_0
    //   159: getfield Dne : LptH;
    //   162: getfield Dne : F
    //   165: fneg
    //   166: fconst_0
    //   167: fconst_1
    //   168: fconst_0
    //   169: invokestatic glRotatef : (FFFF)V
    //   172: aload_0
    //   173: getfield Dne : LptH;
    //   176: getfield FWm : F
    //   179: fconst_1
    //   180: fconst_0
    //   181: fconst_0
    //   182: invokestatic glRotatef : (FFFF)V
    //   185: fload #9
    //   187: fneg
    //   188: fload #9
    //   190: fneg
    //   191: fload #9
    //   193: invokestatic glScalef : (FFF)V
    //   196: sipush #2896
    //   199: invokestatic glDisable : (I)V
    //   202: fconst_0
    //   203: ldc 0.25
    //   205: fload #9
    //   207: fdiv
    //   208: fconst_0
    //   209: invokestatic glTranslatef : (FFF)V
    //   212: iconst_0
    //   213: invokestatic glDepthMask : (Z)V
    //   216: sipush #3042
    //   219: invokestatic glEnable : (I)V
    //   222: sipush #770
    //   225: sipush #771
    //   228: invokestatic glBlendFunc : (II)V
    //   231: getstatic WAR.Dne : LWAR;
    //   234: astore #15
    //   236: sipush #3553
    //   239: invokestatic glDisable : (I)V
    //   242: aload #15
    //   244: invokevirtual Dne : ()V
    //   247: aload #14
    //   249: aload #13
    //   251: invokevirtual Dne : (Ljava/lang/String;)I
    //   254: iconst_2
    //   255: idiv
    //   256: istore #16
    //   258: aload #15
    //   260: fconst_0
    //   261: fconst_0
    //   262: fconst_0
    //   263: ldc 0.25
    //   265: invokevirtual Dne : (FFFF)V
    //   268: aload #15
    //   270: iload #16
    //   272: ineg
    //   273: iconst_1
    //   274: isub
    //   275: i2d
    //   276: ldc2_w -1.0
    //   279: dconst_0
    //   280: invokevirtual Dne : (DDD)V
    //   283: aload #15
    //   285: iload #16
    //   287: ineg
    //   288: iconst_1
    //   289: isub
    //   290: i2d
    //   291: ldc2_w 8.0
    //   294: dconst_0
    //   295: invokevirtual Dne : (DDD)V
    //   298: aload #15
    //   300: iload #16
    //   302: iconst_1
    //   303: iadd
    //   304: i2d
    //   305: ldc2_w 8.0
    //   308: dconst_0
    //   309: invokevirtual Dne : (DDD)V
    //   312: aload #15
    //   314: iload #16
    //   316: iconst_1
    //   317: iadd
    //   318: i2d
    //   319: ldc2_w -1.0
    //   322: dconst_0
    //   323: invokevirtual Dne : (DDD)V
    //   326: aload #15
    //   328: invokevirtual Dne : ()I
    //   331: pop
    //   332: sipush #3553
    //   335: invokestatic glEnable : (I)V
    //   338: iconst_1
    //   339: invokestatic glDepthMask : (Z)V
    //   342: aload #14
    //   344: aload #13
    //   346: aload #14
    //   348: aload #13
    //   350: invokevirtual Dne : (Ljava/lang/String;)I
    //   353: ineg
    //   354: iconst_2
    //   355: idiv
    //   356: iconst_0
    //   357: ldc 553648127
    //   359: invokevirtual FWm : (Ljava/lang/String;III)I
    //   362: pop
    //   363: sipush #2896
    //   366: invokestatic glEnable : (I)V
    //   369: sipush #3042
    //   372: invokestatic glDisable : (I)V
    //   375: fconst_1
    //   376: fconst_1
    //   377: fconst_1
    //   378: fconst_1
    //   379: invokestatic glColor4f : (FFFF)V
    //   382: invokestatic glPopMatrix : ()V
    //   385: goto -> 404
    //   388: aload_0
    //   389: aload_1
    //   390: dload_2
    //   391: dload #4
    //   393: dload #6
    //   395: aload #13
    //   397: fload #9
    //   399: dload #10
    //   401: invokevirtual Dne : (LFUH;DDDLjava/lang/String;FD)V
    //   404: return
  }
  
  protected int FWm(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne(paramFUH, paramInt, paramFloat);
  }
  
  protected float Dne(FUH paramFUH, float paramFloat) {
    return paramFUH.zGp + paramFloat;
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    GL11.glDisable(2884);
    this.Dne.Dne = FWm(paramFUH, paramFloat2);
    if (this.FWm != null)
      this.FWm.Dne = this.Dne.Dne; 
    this.Dne.zGp = paramFUH.qLR();
    if (this.FWm != null)
      this.FWm.zGp = this.Dne.zGp; 
    this.Dne.DyG = paramFUH.IjH();
    if (this.FWm != null)
      this.FWm.DyG = this.Dne.DyG; 
    try {
      float f1 = Dne(paramFUH.oIf, paramFUH.IjH, paramFloat2);
      float f2 = Dne(paramFUH.RPx, paramFUH.vSL, paramFloat2);
      float f3 = paramFUH.kGO + (paramFUH.XHL - paramFUH.kGO) * paramFloat2;
      Dne(paramFUH, paramDouble1, paramDouble2, paramDouble3);
      float f4 = Dne(paramFUH, paramFloat2);
      Dne(paramFUH, f4, f1, paramFloat2);
      float f5 = 0.0625F;
      GL11.glEnable(32826);
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      Dne(paramFUH, paramFloat2);
      GL11.glTranslatef(0.0F, -24.0F * f5 - 0.0078125F, 0.0F);
      float f6 = paramFUH.haP + (paramFUH.qrB - paramFUH.haP) * paramFloat2;
      float f7 = paramFUH.LVR - paramFUH.qrB * (1.0F - paramFloat2);
      if (paramFUH.IjH())
        f7 *= 3.0F; 
      if (f6 > 1.0F)
        f6 = 1.0F; 
      GL11.glEnable(3008);
      this.Dne.Dne(paramFUH, f7, f6, paramFloat2);
      Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
      for (byte b = 0; b < 4; b++) {
        int j = Dne(paramFUH, b, paramFloat2);
        if (j > 0) {
          this.FWm.Dne(paramFUH, f7, f6, paramFloat2);
          this.FWm.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
          if ((j & 0xF0) == 16) {
            Dne(paramFUH, b, paramFloat2);
            this.FWm.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
          } 
          if ((j & 0xF) == 15) {
            float f9 = paramFUH.zGp + paramFloat2;
            Dne("%blur%/misc/glint.png");
            GL11.glEnable(3042);
            float f10 = 0.5F;
            GL11.glColor4f(f10, f10, f10, 1.0F);
            GL11.glDepthFunc(514);
            GL11.glDepthMask(false);
            for (byte b1 = 0; b1 < 2; b1++) {
              GL11.glDisable(2896);
              float f11 = 0.76F;
              GL11.glColor4f(0.5F * f11, 0.25F * f11, 0.8F * f11, 1.0F);
              GL11.glBlendFunc(768, 1);
              GL11.glMatrixMode(5890);
              GL11.glLoadIdentity();
              float f12 = f9 * (0.001F + b1 * 0.003F) * 20.0F;
              float f13 = 0.33333334F;
              GL11.glScalef(f13, f13, f13);
              GL11.glRotatef(30.0F - b1 * 60.0F, 0.0F, 0.0F, 1.0F);
              GL11.glTranslatef(0.0F, f12, 0.0F);
              GL11.glMatrixMode(5888);
              this.FWm.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
            } 
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glMatrixMode(5890);
            GL11.glDepthMask(true);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
            GL11.glDepthFunc(515);
          } 
          GL11.glDisable(3042);
          GL11.glEnable(3008);
        } 
      } 
      GL11.glDepthMask(true);
      FWm(paramFUH, paramFloat2);
      float f8 = paramFUH.Dne(paramFloat2);
      int i = Dne(paramFUH, f8, paramFloat2);
      oCF.Dne(oCF.FWm);
      GL11.glDisable(3553);
      oCF.Dne(oCF.Dne);
      if ((i >> 24 & 0xFF) > 0 || paramFUH.OdI > 0 || paramFUH.vSL > 0.0F) {
        GL11.glDisable(3553);
        GL11.glDisable(3008);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDepthFunc(514);
        if (paramFUH.OdI > 0 || paramFUH.vSL > 0.0F) {
          GL11.glColor4f(f8, 0.0F, 0.0F, 0.4F);
          this.Dne.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
          for (byte b1 = 0; b1 < 4; b1++) {
            if (FWm(paramFUH, b1, paramFloat2) >= 0) {
              GL11.glColor4f(f8, 0.0F, 0.0F, 0.4F);
              this.FWm.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
            } 
          } 
        } 
        if ((i >> 24 & 0xFF) > 0) {
          float f9 = (i >> 16 & 0xFF) / 255.0F;
          float f10 = (i >> 8 & 0xFF) / 255.0F;
          float f12 = (i & 0xFF) / 255.0F;
          float f11 = (i >> 24 & 0xFF) / 255.0F;
          GL11.glColor4f(f9, f10, f12, f11);
          this.Dne.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
          for (byte b1 = 0; b1 < 4; b1++) {
            if (FWm(paramFUH, b1, paramFloat2) >= 0) {
              GL11.glColor4f(f9, f10, f12, f11);
              this.FWm.Dne(paramFUH, f7, f6, f4, f2 - f1, f3, f5);
            } 
          } 
        } 
        GL11.glDepthFunc(515);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glEnable(3553);
      } 
      GL11.glDisable(32826);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    oCF.Dne(oCF.FWm);
    GL11.glEnable(3553);
    oCF.Dne(oCF.Dne);
    GL11.glEnable(2884);
    GL11.glPopMatrix();
    FWm(paramFUH, paramDouble1, paramDouble2, paramDouble3);
  }
  
  protected void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
  }
  
  protected float FWm(FUH paramFUH, float paramFloat) {
    return paramFUH.FWm(paramFloat);
  }
  
  protected float Dne(FUH paramFUH) {
    return 90.0F;
  }
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFUH);
    if (!paramFUH.Vxn()) {
      this.Dne.Dne(paramFUH, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    } else if (!paramFUH.FWm((Minecraft.Dne()).Dne)) {
      GL11.glPushMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
      GL11.glDepthMask(false);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glAlphaFunc(516, 0.003921569F);
      this.Dne.Dne(paramFUH, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      GL11.glDisable(3042);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
    } else {
      this.Dne.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFUH);
    } 
  }
  
  protected int Dne(FUH paramFUH, float paramFloat1, float paramFloat2) {
    return 0;
  }
  
  protected void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
    if (paramFUH.Wwe()) {
      Dne(paramFUH, paramString, paramDouble1, paramDouble2 - 1.5D, paramDouble3, 64);
    } else {
      Dne(paramFUH, paramString, paramDouble1, paramDouble2, paramDouble3, 64);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YAD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */