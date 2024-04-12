import java.util.Collection;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class aUl extends ocu {
  private boolean FWm;
  
  private final Random Dne;
  
  private final Minecraft Dne;
  
  private NMq Dne;
  
  private String Dne;
  
  private final muJ Dne;
  
  private int bzF;
  
  private int FWm;
  
  private boolean Dne;
  
  private int Dne;
  
  public float Dne = new Random();
  
  private static final eKj Dne = new eKj();
  
  private void Dne(vfE paramvfE, int paramInt1, int paramInt2, msA parammsA) {
    SFA sFA = paramvfE.Dne();
    Collection collection = sFA.Dne(paramvfE);
    if (collection.size() <= 15) {
      int i = parammsA.Dne(paramvfE.FWm());
      for (OHz oHz : collection) {
        YGE yGE = sFA.bzF(oHz.Dne());
        String str = YGE.Dne(yGE, oHz.Dne()) + ": " + Dne.kGO + oHz.Dne();
        i = Math.max(i, parammsA.Dne(str));
      } 
      int j = collection.size() * parammsA.Dne;
      int k = paramInt1 / 2 + j / 3;
      byte b1 = 3;
      int m = paramInt2 - i - b1;
      byte b2 = 0;
      for (OHz oHz : collection) {
        b2++;
        YGE yGE = sFA.bzF(oHz.Dne());
        String str1 = YGE.Dne(yGE, oHz.Dne());
        String str2 = Dne.kGO + "" + oHz.Dne();
        int n = k - b2 * parammsA.Dne;
        int i1 = paramInt2 - b1 + 2;
        Dne(m - 2, n, i1, n + parammsA.Dne, 1342177280);
        parammsA.FWm(str1, m, n, 553648127);
        parammsA.FWm(str2, i1 - parammsA.Dne(str2), n, 553648127);
        if (b2 == collection.size()) {
          String str = paramvfE.FWm();
          Dne(m - 2, n - parammsA.Dne - 1, i1, n - 1, 1610612736);
          Dne(m - 2, n - 1, i1, n, 1342177280);
          parammsA.FWm(str, m + i / 2 - parammsA.Dne(str) / 2, n - parammsA.Dne, 553648127);
        } 
      } 
    } 
  }
  
  private void Dne(float paramFloat, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: fconst_1
    //   1: fload_1
    //   2: fsub
    //   3: fstore_1
    //   4: fload_1
    //   5: fconst_0
    //   6: fcmpg
    //   7: ifge -> 12
    //   10: fconst_0
    //   11: fstore_1
    //   12: fload_1
    //   13: fconst_1
    //   14: fcmpl
    //   15: ifle -> 20
    //   18: fconst_1
    //   19: fstore_1
    //   20: aload_0
    //   21: aload_0
    //   22: getfield Dne : F
    //   25: f2d
    //   26: fload_1
    //   27: aload_0
    //   28: getfield Dne : F
    //   31: fsub
    //   32: f2d
    //   33: ldc2_w 0.01
    //   36: dmul
    //   37: dadd
    //   38: d2f
    //   39: putfield Dne : F
    //   42: sipush #2929
    //   45: invokestatic glDisable : (I)V
    //   48: iconst_0
    //   49: invokestatic glDepthMask : (Z)V
    //   52: iconst_0
    //   53: sipush #769
    //   56: invokestatic glBlendFunc : (II)V
    //   59: aload_0
    //   60: getfield Dne : F
    //   63: aload_0
    //   64: getfield Dne : F
    //   67: aload_0
    //   68: getfield Dne : F
    //   71: fconst_1
    //   72: invokestatic glColor4f : (FFFF)V
    //   75: aload_0
    //   76: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   79: getfield Dne : LSnh;
    //   82: ldc '%blur%/misc/vignette.png'
    //   84: invokevirtual Dne : (Ljava/lang/String;)V
    //   87: getstatic WAR.Dne : LWAR;
    //   90: astore #4
    //   92: aload #4
    //   94: invokevirtual Dne : ()V
    //   97: aload #4
    //   99: dconst_0
    //   100: iload_3
    //   101: i2d
    //   102: ldc2_w -90.0
    //   105: dconst_0
    //   106: dconst_1
    //   107: invokevirtual Dne : (DDDDD)V
    //   110: aload #4
    //   112: iload_2
    //   113: i2d
    //   114: iload_3
    //   115: i2d
    //   116: ldc2_w -90.0
    //   119: dconst_1
    //   120: dconst_1
    //   121: invokevirtual Dne : (DDDDD)V
    //   124: aload #4
    //   126: iload_2
    //   127: i2d
    //   128: dconst_0
    //   129: ldc2_w -90.0
    //   132: dconst_1
    //   133: dconst_0
    //   134: invokevirtual Dne : (DDDDD)V
    //   137: aload #4
    //   139: dconst_0
    //   140: dconst_0
    //   141: ldc2_w -90.0
    //   144: dconst_0
    //   145: dconst_0
    //   146: invokevirtual Dne : (DDDDD)V
    //   149: aload #4
    //   151: invokevirtual Dne : ()I
    //   154: pop
    //   155: iconst_1
    //   156: invokestatic glDepthMask : (Z)V
    //   159: sipush #2929
    //   162: invokestatic glEnable : (I)V
    //   165: fconst_1
    //   166: fconst_1
    //   167: fconst_1
    //   168: fconst_1
    //   169: invokestatic glColor4f : (FFFF)V
    //   172: sipush #770
    //   175: sipush #771
    //   178: invokestatic glBlendFunc : (II)V
    //   181: return
  }
  
  private void FWm(float paramFloat, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: fload_1
    //   1: fconst_1
    //   2: fcmpg
    //   3: ifge -> 22
    //   6: fload_1
    //   7: fload_1
    //   8: fmul
    //   9: fstore_1
    //   10: fload_1
    //   11: fload_1
    //   12: fmul
    //   13: fstore_1
    //   14: fload_1
    //   15: ldc 0.8
    //   17: fmul
    //   18: ldc 0.2
    //   20: fadd
    //   21: fstore_1
    //   22: sipush #3008
    //   25: invokestatic glDisable : (I)V
    //   28: sipush #2929
    //   31: invokestatic glDisable : (I)V
    //   34: iconst_0
    //   35: invokestatic glDepthMask : (Z)V
    //   38: sipush #770
    //   41: sipush #771
    //   44: invokestatic glBlendFunc : (II)V
    //   47: fconst_1
    //   48: fconst_1
    //   49: fconst_1
    //   50: fload_1
    //   51: invokestatic glColor4f : (FFFF)V
    //   54: aload_0
    //   55: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   58: getfield Dne : LSnh;
    //   61: ldc '/terrain.png'
    //   63: invokevirtual Dne : (Ljava/lang/String;)V
    //   66: getstatic zKP.Dne : LQkV;
    //   69: iconst_1
    //   70: invokevirtual FWm : (I)LgDn;
    //   73: astore #4
    //   75: aload #4
    //   77: invokeinterface Dne : ()F
    //   82: fstore #5
    //   84: aload #4
    //   86: invokeinterface bzF : ()F
    //   91: fstore #6
    //   93: aload #4
    //   95: invokeinterface FWm : ()F
    //   100: fstore #7
    //   102: aload #4
    //   104: invokeinterface Qnq : ()F
    //   109: fstore #8
    //   111: getstatic WAR.Dne : LWAR;
    //   114: astore #9
    //   116: aload #9
    //   118: invokevirtual Dne : ()V
    //   121: aload #9
    //   123: dconst_0
    //   124: iload_3
    //   125: i2d
    //   126: ldc2_w -90.0
    //   129: fload #5
    //   131: f2d
    //   132: fload #8
    //   134: f2d
    //   135: invokevirtual Dne : (DDDDD)V
    //   138: aload #9
    //   140: iload_2
    //   141: i2d
    //   142: iload_3
    //   143: i2d
    //   144: ldc2_w -90.0
    //   147: fload #7
    //   149: f2d
    //   150: fload #8
    //   152: f2d
    //   153: invokevirtual Dne : (DDDDD)V
    //   156: aload #9
    //   158: iload_2
    //   159: i2d
    //   160: dconst_0
    //   161: ldc2_w -90.0
    //   164: fload #7
    //   166: f2d
    //   167: fload #6
    //   169: f2d
    //   170: invokevirtual Dne : (DDDDD)V
    //   173: aload #9
    //   175: dconst_0
    //   176: dconst_0
    //   177: ldc2_w -90.0
    //   180: fload #5
    //   182: f2d
    //   183: fload #6
    //   185: f2d
    //   186: invokevirtual Dne : (DDDDD)V
    //   189: aload #9
    //   191: invokevirtual Dne : ()I
    //   194: pop
    //   195: iconst_1
    //   196: invokestatic glDepthMask : (Z)V
    //   199: sipush #2929
    //   202: invokestatic glEnable : (I)V
    //   205: sipush #3008
    //   208: invokestatic glEnable : (I)V
    //   211: fconst_1
    //   212: fconst_1
    //   213: fconst_1
    //   214: fconst_1
    //   215: invokestatic glColor4f : (FFFF)V
    //   218: return
  }
  
  private void Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: sipush #2929
    //   3: invokestatic glDisable : (I)V
    //   6: iconst_0
    //   7: invokestatic glDepthMask : (Z)V
    //   10: sipush #770
    //   13: sipush #771
    //   16: invokestatic glBlendFunc : (II)V
    //   19: fconst_1
    //   20: fconst_1
    //   21: fconst_1
    //   22: fconst_1
    //   23: invokestatic glColor4f : (FFFF)V
    //   26: sipush #3008
    //   29: invokestatic glDisable : (I)V
    //   32: aload_0
    //   33: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   36: getfield Dne : LSnh;
    //   39: ldc '%blur%/misc/pumpkinblur.png'
    //   41: invokevirtual Dne : (Ljava/lang/String;)V
    //   44: getstatic WAR.Dne : LWAR;
    //   47: astore_3
    //   48: aload_3
    //   49: invokevirtual Dne : ()V
    //   52: aload_3
    //   53: dconst_0
    //   54: iload_2
    //   55: i2d
    //   56: ldc2_w -90.0
    //   59: dconst_0
    //   60: dconst_1
    //   61: invokevirtual Dne : (DDDDD)V
    //   64: aload_3
    //   65: iload_1
    //   66: i2d
    //   67: iload_2
    //   68: i2d
    //   69: ldc2_w -90.0
    //   72: dconst_1
    //   73: dconst_1
    //   74: invokevirtual Dne : (DDDDD)V
    //   77: aload_3
    //   78: iload_1
    //   79: i2d
    //   80: dconst_0
    //   81: ldc2_w -90.0
    //   84: dconst_1
    //   85: dconst_0
    //   86: invokevirtual Dne : (DDDDD)V
    //   89: aload_3
    //   90: dconst_0
    //   91: dconst_0
    //   92: ldc2_w -90.0
    //   95: dconst_0
    //   96: dconst_0
    //   97: invokevirtual Dne : (DDDDD)V
    //   100: aload_3
    //   101: invokevirtual Dne : ()I
    //   104: pop
    //   105: iconst_1
    //   106: invokestatic glDepthMask : (Z)V
    //   109: sipush #2929
    //   112: invokestatic glEnable : (I)V
    //   115: sipush #3008
    //   118: invokestatic glEnable : (I)V
    //   121: fconst_1
    //   122: fconst_1
    //   123: fconst_1
    //   124: fconst_1
    //   125: invokestatic glColor4f : (FFFF)V
    //   128: return
  }
  
  public aUl(Minecraft paramMinecraft) {
    this.Dne = false;
    this.Dne = (eKj)"";
    this.FWm = 0;
    this.Dne = false;
    this.Dne = 1.0F;
    this.Dne = (eKj)paramMinecraft;
    this.Dne = (eKj)new muJ(paramMinecraft);
    if (eCD.Dne(100) == 0)
      this.FWm = 1; 
  }
  
  public void Dne() {
    if (this.FWm > 0)
      this.FWm--; 
    this.Dne++;
    if (((Minecraft)this.Dne).Dne != null) {
      NMq nMq = ((MJs)((Minecraft)this.Dne).Dne).Dne.Dne();
      if (nMq == null) {
        this.bzF = 0;
      } else if (this.Dne != null && nMq.bzF == ((NMq)this.Dne).bzF && NMq.Dne(nMq, (NMq)this.Dne) && (nMq.FWm() || nMq.Qnq() == this.Dne.Qnq())) {
        if (this.bzF > 0)
          this.bzF--; 
      } else {
        this.bzF = 40;
      } 
      this.Dne = (eKj)nMq;
    } 
  }
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    if (this.FWm != 0)
      return; 
    boolean bool = ((MOS)((MJs)((Minecraft)this.Dne).Dne).Dne).Dne[paramInt1];
    if (bool != null) {
      float f = bool.FWm - paramFloat;
      if (f > 0.0F) {
        GL11.glPushMatrix();
        float f1 = 1.0F + f / 5.0F;
        GL11.glTranslatef((paramInt2 + 8), (paramInt3 + 12), 0.0F);
        GL11.glScalef(1.0F / f1, (f1 + 1.0F) / 2.0F, 1.0F);
        GL11.glTranslatef(-(paramInt2 + 8), -(paramInt3 + 12), 0.0F);
      } 
      Dne.FWm((msA)((Minecraft)this.Dne).Dne, ((Minecraft)this.Dne).Dne, bool, paramInt2, paramInt3);
      if (f > 0.0F)
        GL11.glPopMatrix(); 
      Dne.bzF((msA)((Minecraft)this.Dne).Dne, ((Minecraft)this.Dne).Dne, bool, paramInt2, paramInt3);
    } 
  }
  
  private void FWm() {
    if (mwX.Dne != null && mwX.Dne > 0) {
      mwX.Dne--;
      Snh snh = ((Minecraft)this.Dne).Dne;
      IJm iJm = new IJm((fZI)((Minecraft)this.Dne).Dne, ((Minecraft)this.Dne).Dne, ((Minecraft)this.Dne).FWm);
      int i = iJm.Dne();
      char c = '¶';
      int j = i / 2 - c / 2;
      int k = (int)(mwX.Dne * (c + 1));
      byte b = 12;
      FWm(j, b, 0, 74, c, 5);
      FWm(j, b, 0, 74, c, 5);
      if (k > 0)
        FWm(j, b, 0, 79, k, 5); 
      int m = mwX.Dne;
      snh.Dne(m, i / 2 - snh.Dne(m) / 2, b - 10, 16777215);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      ((Minecraft)this.Dne).Dne.Dne("/gui/icons.png");
    } 
  }
  
  public void Dne(String paramString) {
    this.Dne = (eKj)("Now playing: " + paramString);
    this.FWm = 60;
    this.Dne = true;
  }
  
  public muJ Dne() {
    return (muJ)this.Dne;
  }
  
  public void Dne(float paramFloat, boolean paramBoolean, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new IJm
    //   3: dup
    //   4: aload_0
    //   5: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   8: getfield Dne : LfZI;
    //   11: aload_0
    //   12: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   15: getfield Dne : I
    //   18: aload_0
    //   19: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   22: getfield FWm : I
    //   25: invokespecial <init> : (LfZI;II)V
    //   28: astore #5
    //   30: aload #5
    //   32: invokevirtual Dne : ()I
    //   35: istore #6
    //   37: aload #5
    //   39: invokevirtual FWm : ()I
    //   42: istore #7
    //   44: aload_0
    //   45: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   48: getfield Dne : LmsA;
    //   51: astore #8
    //   53: aload_0
    //   54: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   57: getfield Dne : LOEA;
    //   60: invokevirtual FWm : ()V
    //   63: sipush #3042
    //   66: invokestatic glEnable : (I)V
    //   69: invokestatic bzF : ()Z
    //   72: ifeq -> 97
    //   75: aload_0
    //   76: aload_0
    //   77: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   80: getfield Dne : LMJs;
    //   83: fload_1
    //   84: invokevirtual Dne : (F)F
    //   87: iload #6
    //   89: iload #7
    //   91: invokespecial Dne : (FII)V
    //   94: goto -> 106
    //   97: sipush #770
    //   100: sipush #771
    //   103: invokestatic glBlendFunc : (II)V
    //   106: aload_0
    //   107: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   110: getfield Dne : LMJs;
    //   113: getfield Dne : LMOS;
    //   116: iconst_3
    //   117: invokevirtual bzF : (I)LNMq;
    //   120: astore #9
    //   122: aload_0
    //   123: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   126: getfield Dne : LfZI;
    //   129: getfield div : I
    //   132: ifne -> 162
    //   135: aload #9
    //   137: ifnull -> 162
    //   140: aload #9
    //   142: getfield bzF : I
    //   145: getstatic zKP.aJO : LzKP;
    //   148: getfield FWm : I
    //   151: if_icmpne -> 162
    //   154: aload_0
    //   155: iload #6
    //   157: iload #7
    //   159: invokespecial Dne : (II)V
    //   162: aload_0
    //   163: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   166: getfield Dne : LMJs;
    //   169: getstatic SXd.mrb : LSXd;
    //   172: invokevirtual Dne : (LSXd;)Z
    //   175: ifne -> 231
    //   178: aload_0
    //   179: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   182: getfield Dne : LMJs;
    //   185: getfield zGp : F
    //   188: aload_0
    //   189: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   192: getfield Dne : LMJs;
    //   195: getfield aFZ : F
    //   198: aload_0
    //   199: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   202: getfield Dne : LMJs;
    //   205: getfield zGp : F
    //   208: fsub
    //   209: fload_1
    //   210: fmul
    //   211: fadd
    //   212: fstore #10
    //   214: fload #10
    //   216: fconst_0
    //   217: fcmpl
    //   218: ifle -> 231
    //   221: aload_0
    //   222: fload #10
    //   224: iload #6
    //   226: iload #7
    //   228: invokespecial FWm : (FII)V
    //   231: aload_0
    //   232: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   235: getfield Dne : LRJV;
    //   238: invokevirtual Dne : ()Z
    //   241: ifne -> 1607
    //   244: fconst_1
    //   245: fconst_1
    //   246: fconst_1
    //   247: fconst_1
    //   248: invokestatic glColor4f : (FFFF)V
    //   251: aload_0
    //   252: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   255: getfield Dne : LSnh;
    //   258: ldc_w '/gui/gui.png'
    //   261: invokevirtual Dne : (Ljava/lang/String;)V
    //   264: aload_0
    //   265: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   268: getfield Dne : LMJs;
    //   271: getfield Dne : LMOS;
    //   274: astore #24
    //   276: aload_0
    //   277: ldc_w -90.0
    //   280: putfield FWm : F
    //   283: aload_0
    //   284: iload #6
    //   286: iconst_2
    //   287: idiv
    //   288: bipush #91
    //   290: isub
    //   291: iload #7
    //   293: bipush #22
    //   295: isub
    //   296: iconst_0
    //   297: iconst_0
    //   298: sipush #182
    //   301: bipush #22
    //   303: invokevirtual FWm : (IIIIII)V
    //   306: aload_0
    //   307: iload #6
    //   309: iconst_2
    //   310: idiv
    //   311: bipush #91
    //   313: isub
    //   314: iconst_1
    //   315: isub
    //   316: aload #24
    //   318: getfield Dne : I
    //   321: bipush #20
    //   323: imul
    //   324: iadd
    //   325: iload #7
    //   327: bipush #22
    //   329: isub
    //   330: iconst_1
    //   331: isub
    //   332: iconst_0
    //   333: bipush #22
    //   335: bipush #24
    //   337: bipush #22
    //   339: invokevirtual FWm : (IIIIII)V
    //   342: aload_0
    //   343: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   346: getfield Dne : LSnh;
    //   349: ldc_w '/gui/icons.png'
    //   352: invokevirtual Dne : (Ljava/lang/String;)V
    //   355: sipush #3042
    //   358: invokestatic glEnable : (I)V
    //   361: sipush #775
    //   364: sipush #769
    //   367: invokestatic glBlendFunc : (II)V
    //   370: aload_0
    //   371: iload #6
    //   373: iconst_2
    //   374: idiv
    //   375: bipush #7
    //   377: isub
    //   378: iload #7
    //   380: iconst_2
    //   381: idiv
    //   382: bipush #7
    //   384: isub
    //   385: iconst_0
    //   386: iconst_0
    //   387: bipush #16
    //   389: bipush #16
    //   391: invokevirtual FWm : (IIIIII)V
    //   394: sipush #3042
    //   397: invokestatic glDisable : (I)V
    //   400: aload_0
    //   401: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   404: getfield Dne : LMJs;
    //   407: getfield div : I
    //   410: iconst_3
    //   411: idiv
    //   412: iconst_2
    //   413: irem
    //   414: iconst_1
    //   415: if_icmpne -> 422
    //   418: iconst_1
    //   419: goto -> 423
    //   422: iconst_0
    //   423: istore #10
    //   425: aload_0
    //   426: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   429: getfield Dne : LMJs;
    //   432: getfield div : I
    //   435: bipush #10
    //   437: if_icmpge -> 443
    //   440: iconst_0
    //   441: istore #10
    //   443: aload_0
    //   444: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   447: getfield Dne : LMJs;
    //   450: invokevirtual XHL : ()I
    //   453: istore #11
    //   455: aload_0
    //   456: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   459: getfield Dne : LMJs;
    //   462: getfield ceE : I
    //   465: istore #12
    //   467: aload_0
    //   468: getfield Dne : Ljava/util/Random;
    //   471: aload_0
    //   472: getfield Dne : I
    //   475: ldc_w 312871
    //   478: imul
    //   479: i2l
    //   480: invokevirtual setSeed : (J)V
    //   483: iconst_0
    //   484: istore #25
    //   486: aload_0
    //   487: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   490: getfield Dne : LMJs;
    //   493: invokevirtual Dne : ()LSCY;
    //   496: astore #26
    //   498: aload #26
    //   500: invokevirtual Dne : ()I
    //   503: istore #13
    //   505: aload #26
    //   507: invokevirtual FWm : ()I
    //   510: istore #14
    //   512: aload_0
    //   513: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   516: getfield Dne : LBkx;
    //   519: ldc_w 'bossHealth'
    //   522: invokevirtual Dne : (Ljava/lang/String;)V
    //   525: aload_0
    //   526: invokespecial FWm : ()V
    //   529: aload_0
    //   530: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   533: getfield Dne : LBkx;
    //   536: invokevirtual FWm : ()V
    //   539: aload_0
    //   540: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   543: getfield Dne : LRJV;
    //   546: invokevirtual FWm : ()Z
    //   549: ifeq -> 1507
    //   552: iload #6
    //   554: iconst_2
    //   555: idiv
    //   556: bipush #91
    //   558: isub
    //   559: istore #15
    //   561: iload #6
    //   563: iconst_2
    //   564: idiv
    //   565: bipush #91
    //   567: iadd
    //   568: istore #27
    //   570: aload_0
    //   571: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   574: getfield Dne : LBkx;
    //   577: ldc_w 'expBar'
    //   580: invokevirtual Dne : (Ljava/lang/String;)V
    //   583: aload_0
    //   584: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   587: getfield Dne : LMJs;
    //   590: invokevirtual EyB : ()I
    //   593: istore #16
    //   595: iload #16
    //   597: ifle -> 666
    //   600: sipush #182
    //   603: istore #28
    //   605: aload_0
    //   606: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   609: getfield Dne : LMJs;
    //   612: getfield iNQ : F
    //   615: iload #28
    //   617: iconst_1
    //   618: iadd
    //   619: i2f
    //   620: fmul
    //   621: f2i
    //   622: istore #17
    //   624: iload #7
    //   626: bipush #32
    //   628: isub
    //   629: iconst_3
    //   630: iadd
    //   631: istore #18
    //   633: aload_0
    //   634: iload #15
    //   636: iload #18
    //   638: iconst_0
    //   639: bipush #64
    //   641: iload #28
    //   643: iconst_5
    //   644: invokevirtual FWm : (IIIIII)V
    //   647: iload #17
    //   649: ifle -> 666
    //   652: aload_0
    //   653: iload #15
    //   655: iload #18
    //   657: iconst_0
    //   658: bipush #69
    //   660: iload #17
    //   662: iconst_5
    //   663: invokevirtual FWm : (IIIIII)V
    //   666: iload #7
    //   668: bipush #39
    //   670: isub
    //   671: istore #22
    //   673: iload #22
    //   675: bipush #10
    //   677: isub
    //   678: istore #17
    //   680: aload_0
    //   681: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   684: getfield Dne : LMJs;
    //   687: invokevirtual Zpi : ()I
    //   690: istore #18
    //   692: iconst_m1
    //   693: istore #19
    //   695: aload_0
    //   696: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   699: getfield Dne : LMJs;
    //   702: getstatic SXd.XHL : LSXd;
    //   705: invokevirtual Dne : (LSXd;)Z
    //   708: ifeq -> 720
    //   711: aload_0
    //   712: getfield Dne : I
    //   715: bipush #25
    //   717: irem
    //   718: istore #19
    //   720: aload_0
    //   721: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   724: getfield Dne : LBkx;
    //   727: ldc_w 'healthArmor'
    //   730: invokevirtual FWm : (Ljava/lang/String;)V
    //   733: iconst_0
    //   734: istore #28
    //   736: iload #28
    //   738: bipush #10
    //   740: if_icmpge -> 1184
    //   743: iload #18
    //   745: ifle -> 839
    //   748: iload #15
    //   750: iload #28
    //   752: bipush #8
    //   754: imul
    //   755: iadd
    //   756: istore #20
    //   758: iload #28
    //   760: iconst_2
    //   761: imul
    //   762: iconst_1
    //   763: iadd
    //   764: iload #18
    //   766: if_icmpge -> 785
    //   769: aload_0
    //   770: iload #20
    //   772: iload #17
    //   774: bipush #34
    //   776: bipush #9
    //   778: bipush #9
    //   780: bipush #9
    //   782: invokevirtual FWm : (IIIIII)V
    //   785: iload #28
    //   787: iconst_2
    //   788: imul
    //   789: iconst_1
    //   790: iadd
    //   791: iload #18
    //   793: if_icmpne -> 812
    //   796: aload_0
    //   797: iload #20
    //   799: iload #17
    //   801: bipush #25
    //   803: bipush #9
    //   805: bipush #9
    //   807: bipush #9
    //   809: invokevirtual FWm : (IIIIII)V
    //   812: iload #28
    //   814: iconst_2
    //   815: imul
    //   816: iconst_1
    //   817: iadd
    //   818: iload #18
    //   820: if_icmple -> 839
    //   823: aload_0
    //   824: iload #20
    //   826: iload #17
    //   828: bipush #16
    //   830: bipush #9
    //   832: bipush #9
    //   834: bipush #9
    //   836: invokevirtual FWm : (IIIIII)V
    //   839: ldc_w 268435455
    //   842: invokestatic Dne : (I)I
    //   845: istore #20
    //   847: aload_0
    //   848: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   851: getfield Dne : LMJs;
    //   854: getstatic SXd.ceE : LSXd;
    //   857: invokevirtual Dne : (LSXd;)Z
    //   860: ifeq -> 869
    //   863: iinc #20, 36
    //   866: goto -> 888
    //   869: aload_0
    //   870: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   873: getfield Dne : LMJs;
    //   876: getstatic SXd.EyB : LSXd;
    //   879: invokevirtual Dne : (LSXd;)Z
    //   882: ifeq -> 888
    //   885: iinc #20, 72
    //   888: iconst_0
    //   889: istore #21
    //   891: iload #10
    //   893: ifeq -> 899
    //   896: iconst_1
    //   897: istore #21
    //   899: iload #15
    //   901: iload #28
    //   903: bipush #8
    //   905: imul
    //   906: iadd
    //   907: istore #29
    //   909: iload #22
    //   911: istore #30
    //   913: iload #11
    //   915: iconst_4
    //   916: if_icmpgt -> 932
    //   919: iload #22
    //   921: aload_0
    //   922: getfield Dne : Ljava/util/Random;
    //   925: iconst_2
    //   926: invokevirtual nextInt : (I)I
    //   929: iadd
    //   930: istore #30
    //   932: iload #28
    //   934: iload #19
    //   936: if_icmpne -> 942
    //   939: iinc #30, -2
    //   942: iconst_0
    //   943: istore #31
    //   945: aload_0
    //   946: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   949: getfield Dne : LVzZ;
    //   952: invokevirtual Dne : ()LxoY;
    //   955: invokevirtual Qnq : ()Z
    //   958: ifeq -> 964
    //   961: iconst_5
    //   962: istore #31
    //   964: iconst_2
    //   965: invokestatic Dne : (I)I
    //   968: ifne -> 979
    //   971: bipush #20
    //   973: invokestatic Dne : (I)I
    //   976: goto -> 985
    //   979: bipush #20
    //   981: invokestatic Dne : (I)I
    //   984: ineg
    //   985: istore #32
    //   987: aload_0
    //   988: iload #29
    //   990: iload #32
    //   992: iadd
    //   993: iload #30
    //   995: bipush #16
    //   997: iload #21
    //   999: bipush #9
    //   1001: imul
    //   1002: iadd
    //   1003: bipush #9
    //   1005: iload #31
    //   1007: imul
    //   1008: bipush #9
    //   1010: bipush #9
    //   1012: invokevirtual FWm : (IIIIII)V
    //   1015: iload #10
    //   1017: ifeq -> 1086
    //   1020: iload #28
    //   1022: iconst_2
    //   1023: imul
    //   1024: iconst_1
    //   1025: iadd
    //   1026: iload #12
    //   1028: if_icmpge -> 1053
    //   1031: aload_0
    //   1032: iload #29
    //   1034: iload #30
    //   1036: iload #20
    //   1038: bipush #54
    //   1040: iadd
    //   1041: bipush #9
    //   1043: iload #31
    //   1045: imul
    //   1046: bipush #9
    //   1048: bipush #9
    //   1050: invokevirtual FWm : (IIIIII)V
    //   1053: iload #28
    //   1055: iconst_2
    //   1056: imul
    //   1057: iconst_1
    //   1058: iadd
    //   1059: iload #12
    //   1061: if_icmpne -> 1086
    //   1064: aload_0
    //   1065: iload #29
    //   1067: iload #30
    //   1069: iload #20
    //   1071: bipush #63
    //   1073: iadd
    //   1074: bipush #9
    //   1076: iload #31
    //   1078: imul
    //   1079: bipush #9
    //   1081: bipush #9
    //   1083: invokevirtual FWm : (IIIIII)V
    //   1086: iload #28
    //   1088: iconst_2
    //   1089: imul
    //   1090: iconst_1
    //   1091: iadd
    //   1092: iload #11
    //   1094: if_icmpge -> 1145
    //   1097: iconst_2
    //   1098: invokestatic Dne : (I)I
    //   1101: ifne -> 1112
    //   1104: bipush #30
    //   1106: invokestatic Dne : (I)I
    //   1109: goto -> 1118
    //   1112: bipush #30
    //   1114: invokestatic Dne : (I)I
    //   1117: ineg
    //   1118: istore #32
    //   1120: aload_0
    //   1121: iload #29
    //   1123: iload #32
    //   1125: iadd
    //   1126: iload #30
    //   1128: iload #20
    //   1130: bipush #36
    //   1132: iadd
    //   1133: bipush #9
    //   1135: iload #31
    //   1137: imul
    //   1138: bipush #9
    //   1140: bipush #9
    //   1142: invokevirtual FWm : (IIIIII)V
    //   1145: iload #28
    //   1147: iconst_2
    //   1148: imul
    //   1149: iconst_1
    //   1150: iadd
    //   1151: iload #11
    //   1153: if_icmpne -> 1178
    //   1156: aload_0
    //   1157: iload #29
    //   1159: iload #30
    //   1161: iload #20
    //   1163: bipush #45
    //   1165: iadd
    //   1166: bipush #9
    //   1168: iload #31
    //   1170: imul
    //   1171: bipush #9
    //   1173: bipush #9
    //   1175: invokevirtual FWm : (IIIIII)V
    //   1178: iinc #28, 1
    //   1181: goto -> 736
    //   1184: aload_0
    //   1185: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1188: getfield Dne : LBkx;
    //   1191: ldc_w 'food'
    //   1194: invokevirtual FWm : (Ljava/lang/String;)V
    //   1197: iconst_2
    //   1198: invokestatic Dne : (I)I
    //   1201: ifne -> 1212
    //   1204: bipush #20
    //   1206: invokestatic Dne : (I)I
    //   1209: goto -> 1218
    //   1212: bipush #20
    //   1214: invokestatic Dne : (I)I
    //   1217: ineg
    //   1218: istore #31
    //   1220: iconst_0
    //   1221: istore #28
    //   1223: iload #28
    //   1225: bipush #10
    //   1227: if_icmpge -> 1497
    //   1230: iload #22
    //   1232: istore #20
    //   1234: sipush #255
    //   1237: invokestatic Dne : (I)I
    //   1240: istore #23
    //   1242: sipush #255
    //   1245: invokestatic Dne : (I)I
    //   1248: istore #32
    //   1250: aload_0
    //   1251: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1254: getfield Dne : LMJs;
    //   1257: getstatic SXd.ATE : LSXd;
    //   1260: invokevirtual Dne : (LSXd;)Z
    //   1263: ifeq -> 1273
    //   1266: iinc #23, 36
    //   1269: bipush #13
    //   1271: istore #32
    //   1273: aload_0
    //   1274: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1277: getfield Dne : LMJs;
    //   1280: invokevirtual Dne : ()LSCY;
    //   1283: invokevirtual Dne : ()F
    //   1286: fconst_0
    //   1287: fcmpg
    //   1288: ifgt -> 1320
    //   1291: aload_0
    //   1292: getfield Dne : I
    //   1295: iload #13
    //   1297: iconst_3
    //   1298: imul
    //   1299: iconst_1
    //   1300: iadd
    //   1301: irem
    //   1302: ifne -> 1320
    //   1305: iload #22
    //   1307: aload_0
    //   1308: getfield Dne : Ljava/util/Random;
    //   1311: iconst_3
    //   1312: invokevirtual nextInt : (I)I
    //   1315: iconst_1
    //   1316: isub
    //   1317: iadd
    //   1318: istore #20
    //   1320: iload #25
    //   1322: ifeq -> 1328
    //   1325: iconst_1
    //   1326: istore #32
    //   1328: iload #27
    //   1330: iload #28
    //   1332: bipush #8
    //   1334: imul
    //   1335: isub
    //   1336: bipush #9
    //   1338: isub
    //   1339: iload #31
    //   1341: iadd
    //   1342: istore #30
    //   1344: aload_0
    //   1345: iload #30
    //   1347: iload #20
    //   1349: bipush #16
    //   1351: iload #32
    //   1353: bipush #9
    //   1355: imul
    //   1356: iadd
    //   1357: bipush #27
    //   1359: bipush #9
    //   1361: bipush #9
    //   1363: invokevirtual FWm : (IIIIII)V
    //   1366: iload #25
    //   1368: ifeq -> 1431
    //   1371: iload #28
    //   1373: iconst_2
    //   1374: imul
    //   1375: iconst_1
    //   1376: iadd
    //   1377: iload #14
    //   1379: if_icmpge -> 1401
    //   1382: aload_0
    //   1383: iload #30
    //   1385: iload #20
    //   1387: iload #23
    //   1389: bipush #54
    //   1391: iadd
    //   1392: bipush #27
    //   1394: bipush #9
    //   1396: bipush #9
    //   1398: invokevirtual FWm : (IIIIII)V
    //   1401: iload #28
    //   1403: iconst_2
    //   1404: imul
    //   1405: iconst_1
    //   1406: iadd
    //   1407: iload #14
    //   1409: if_icmpne -> 1431
    //   1412: aload_0
    //   1413: iload #30
    //   1415: iload #20
    //   1417: iload #23
    //   1419: bipush #63
    //   1421: iadd
    //   1422: bipush #27
    //   1424: bipush #9
    //   1426: bipush #9
    //   1428: invokevirtual FWm : (IIIIII)V
    //   1431: iload #28
    //   1433: iconst_2
    //   1434: imul
    //   1435: iconst_1
    //   1436: iadd
    //   1437: iload #13
    //   1439: if_icmpge -> 1461
    //   1442: aload_0
    //   1443: iload #30
    //   1445: iload #20
    //   1447: iload #23
    //   1449: bipush #36
    //   1451: iadd
    //   1452: bipush #27
    //   1454: bipush #9
    //   1456: bipush #9
    //   1458: invokevirtual FWm : (IIIIII)V
    //   1461: iload #28
    //   1463: iconst_2
    //   1464: imul
    //   1465: iconst_1
    //   1466: iadd
    //   1467: iload #13
    //   1469: if_icmpne -> 1491
    //   1472: aload_0
    //   1473: iload #30
    //   1475: iload #20
    //   1477: iload #23
    //   1479: bipush #45
    //   1481: iadd
    //   1482: bipush #27
    //   1484: bipush #9
    //   1486: bipush #9
    //   1488: invokevirtual FWm : (IIIIII)V
    //   1491: iinc #28, 1
    //   1494: goto -> 1223
    //   1497: aload_0
    //   1498: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1501: getfield Dne : LBkx;
    //   1504: invokevirtual FWm : ()V
    //   1507: sipush #3042
    //   1510: invokestatic glDisable : (I)V
    //   1513: aload_0
    //   1514: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1517: getfield Dne : LBkx;
    //   1520: ldc_w 'actionBar'
    //   1523: invokevirtual Dne : (Ljava/lang/String;)V
    //   1526: ldc_w 32826
    //   1529: invokestatic glEnable : (I)V
    //   1532: invokestatic bzF : ()V
    //   1535: iconst_0
    //   1536: istore #15
    //   1538: iload #15
    //   1540: bipush #9
    //   1542: if_icmpge -> 1588
    //   1545: iload #6
    //   1547: iconst_2
    //   1548: idiv
    //   1549: bipush #90
    //   1551: isub
    //   1552: iload #15
    //   1554: bipush #20
    //   1556: imul
    //   1557: iadd
    //   1558: iconst_2
    //   1559: iadd
    //   1560: istore #27
    //   1562: iload #7
    //   1564: bipush #16
    //   1566: isub
    //   1567: iconst_3
    //   1568: isub
    //   1569: istore #16
    //   1571: aload_0
    //   1572: iload #15
    //   1574: iload #27
    //   1576: iload #16
    //   1578: fload_1
    //   1579: invokespecial Dne : (IIIF)V
    //   1582: iinc #15, 1
    //   1585: goto -> 1538
    //   1588: invokestatic Dne : ()V
    //   1591: ldc_w 32826
    //   1594: invokestatic glDisable : (I)V
    //   1597: aload_0
    //   1598: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1601: getfield Dne : LBkx;
    //   1604: invokevirtual FWm : ()V
    //   1607: aload_0
    //   1608: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1611: getfield Dne : LMJs;
    //   1614: invokevirtual ceE : ()I
    //   1617: ifle -> 1736
    //   1620: aload_0
    //   1621: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1624: getfield Dne : LBkx;
    //   1627: ldc_w 'sleep'
    //   1630: invokevirtual Dne : (Ljava/lang/String;)V
    //   1633: sipush #2929
    //   1636: invokestatic glDisable : (I)V
    //   1639: sipush #3008
    //   1642: invokestatic glDisable : (I)V
    //   1645: aload_0
    //   1646: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1649: getfield Dne : LMJs;
    //   1652: invokevirtual ceE : ()I
    //   1655: istore #25
    //   1657: iload #25
    //   1659: i2f
    //   1660: ldc_w 100.0
    //   1663: fdiv
    //   1664: fstore #24
    //   1666: fload #24
    //   1668: fconst_1
    //   1669: fcmpl
    //   1670: ifle -> 1687
    //   1673: fconst_1
    //   1674: iload #25
    //   1676: bipush #100
    //   1678: isub
    //   1679: i2f
    //   1680: ldc_w 10.0
    //   1683: fdiv
    //   1684: fsub
    //   1685: fstore #24
    //   1687: ldc_w 220.0
    //   1690: fload #24
    //   1692: fmul
    //   1693: f2i
    //   1694: bipush #24
    //   1696: ishl
    //   1697: ldc_w 1052704
    //   1700: ior
    //   1701: istore #11
    //   1703: iconst_0
    //   1704: iconst_0
    //   1705: iload #6
    //   1707: iload #7
    //   1709: iload #11
    //   1711: invokestatic Dne : (IIIII)V
    //   1714: sipush #3008
    //   1717: invokestatic glEnable : (I)V
    //   1720: sipush #2929
    //   1723: invokestatic glEnable : (I)V
    //   1726: aload_0
    //   1727: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1730: getfield Dne : LBkx;
    //   1733: invokevirtual FWm : ()V
    //   1736: aload_0
    //   1737: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1740: getfield Dne : LRJV;
    //   1743: invokevirtual bzF : ()Z
    //   1746: ifeq -> 1937
    //   1749: aload_0
    //   1750: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1753: getfield Dne : LMJs;
    //   1756: getfield eHV : I
    //   1759: ifle -> 1937
    //   1762: aload_0
    //   1763: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1766: getfield Dne : LBkx;
    //   1769: ldc_w 'expLevel'
    //   1772: invokevirtual Dne : (Ljava/lang/String;)V
    //   1775: iconst_0
    //   1776: istore #10
    //   1778: iload #10
    //   1780: ifeq -> 1789
    //   1783: ldc_w 16777215
    //   1786: goto -> 1792
    //   1789: ldc_w 8453920
    //   1792: istore #11
    //   1794: new java/lang/StringBuilder
    //   1797: dup
    //   1798: invokespecial <init> : ()V
    //   1801: ldc ''
    //   1803: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1806: aload_0
    //   1807: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1810: getfield Dne : LMJs;
    //   1813: getfield eHV : I
    //   1816: invokestatic toBinaryString : (I)Ljava/lang/String;
    //   1819: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1822: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1825: invokevirtual toString : ()Ljava/lang/String;
    //   1828: astore #27
    //   1830: iload #6
    //   1832: aload #8
    //   1834: aload #27
    //   1836: invokevirtual Dne : (Ljava/lang/String;)I
    //   1839: isub
    //   1840: iconst_2
    //   1841: idiv
    //   1842: istore #25
    //   1844: iload #7
    //   1846: bipush #31
    //   1848: isub
    //   1849: iconst_4
    //   1850: isub
    //   1851: istore #26
    //   1853: aload #8
    //   1855: aload #27
    //   1857: iload #25
    //   1859: iconst_1
    //   1860: iadd
    //   1861: iload #26
    //   1863: iconst_0
    //   1864: invokevirtual FWm : (Ljava/lang/String;III)I
    //   1867: pop
    //   1868: aload #8
    //   1870: aload #27
    //   1872: iload #25
    //   1874: iconst_1
    //   1875: isub
    //   1876: iload #26
    //   1878: iconst_0
    //   1879: invokevirtual FWm : (Ljava/lang/String;III)I
    //   1882: pop
    //   1883: aload #8
    //   1885: aload #27
    //   1887: iload #25
    //   1889: iload #26
    //   1891: iconst_1
    //   1892: iadd
    //   1893: iconst_0
    //   1894: invokevirtual FWm : (Ljava/lang/String;III)I
    //   1897: pop
    //   1898: aload #8
    //   1900: aload #27
    //   1902: iload #25
    //   1904: iload #26
    //   1906: iconst_1
    //   1907: isub
    //   1908: iconst_0
    //   1909: invokevirtual FWm : (Ljava/lang/String;III)I
    //   1912: pop
    //   1913: aload #8
    //   1915: aload #27
    //   1917: iload #25
    //   1919: iload #26
    //   1921: iload #11
    //   1923: invokevirtual FWm : (Ljava/lang/String;III)I
    //   1926: pop
    //   1927: aload_0
    //   1928: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1931: getfield Dne : LBkx;
    //   1934: invokevirtual FWm : ()V
    //   1937: aload_0
    //   1938: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1941: getfield Dne : LfZI;
    //   1944: getfield Vxn : Z
    //   1947: ifeq -> 2115
    //   1950: aload_0
    //   1951: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   1954: getfield Dne : LBkx;
    //   1957: ldc_w 'toolHighlight'
    //   1960: invokevirtual Dne : (Ljava/lang/String;)V
    //   1963: aload_0
    //   1964: getfield bzF : I
    //   1967: ifle -> 2105
    //   1970: aload_0
    //   1971: getfield Dne : LNMq;
    //   1974: ifnull -> 2105
    //   1977: aload_0
    //   1978: getfield Dne : LNMq;
    //   1981: invokevirtual FWm : ()Ljava/lang/String;
    //   1984: astore #27
    //   1986: iload #6
    //   1988: aload #8
    //   1990: aload #27
    //   1992: invokevirtual Dne : (Ljava/lang/String;)I
    //   1995: isub
    //   1996: iconst_2
    //   1997: idiv
    //   1998: istore #11
    //   2000: iload #7
    //   2002: bipush #59
    //   2004: isub
    //   2005: istore #12
    //   2007: aload_0
    //   2008: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2011: getfield Dne : LRJV;
    //   2014: invokevirtual FWm : ()Z
    //   2017: ifne -> 2023
    //   2020: iinc #12, 14
    //   2023: aload_0
    //   2024: getfield bzF : I
    //   2027: i2f
    //   2028: ldc_w 256.0
    //   2031: fmul
    //   2032: ldc_w 10.0
    //   2035: fdiv
    //   2036: f2i
    //   2037: istore #25
    //   2039: iload #25
    //   2041: sipush #255
    //   2044: if_icmple -> 2052
    //   2047: sipush #255
    //   2050: istore #25
    //   2052: iload #25
    //   2054: ifle -> 2105
    //   2057: invokestatic glPushMatrix : ()V
    //   2060: sipush #3042
    //   2063: invokestatic glEnable : (I)V
    //   2066: sipush #770
    //   2069: sipush #771
    //   2072: invokestatic glBlendFunc : (II)V
    //   2075: aload #8
    //   2077: aload #27
    //   2079: iload #11
    //   2081: iload #12
    //   2083: ldc_w 16777215
    //   2086: iload #25
    //   2088: bipush #24
    //   2090: ishl
    //   2091: iadd
    //   2092: invokevirtual Dne : (Ljava/lang/String;III)I
    //   2095: pop
    //   2096: sipush #3042
    //   2099: invokestatic glDisable : (I)V
    //   2102: invokestatic glPopMatrix : ()V
    //   2105: aload_0
    //   2106: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2109: getfield Dne : LBkx;
    //   2112: invokevirtual FWm : ()V
    //   2115: aload_0
    //   2116: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2119: invokevirtual Dne : ()Z
    //   2122: ifeq -> 2245
    //   2125: aload_0
    //   2126: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2129: getfield Dne : LBkx;
    //   2132: ldc_w 'demo'
    //   2135: invokevirtual Dne : (Ljava/lang/String;)V
    //   2138: ldc ''
    //   2140: astore #27
    //   2142: aload_0
    //   2143: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2146: getfield Dne : LVzZ;
    //   2149: invokevirtual FWm : ()J
    //   2152: ldc2_w 120500
    //   2155: lcmp
    //   2156: iflt -> 2170
    //   2159: ldc_w 'demo.demoExpired'
    //   2162: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   2165: astore #27
    //   2167: goto -> 2206
    //   2170: ldc_w 'demo.remainingTime'
    //   2173: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   2176: iconst_1
    //   2177: anewarray java/lang/Object
    //   2180: dup
    //   2181: iconst_0
    //   2182: ldc2_w 120500
    //   2185: aload_0
    //   2186: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2189: getfield Dne : LVzZ;
    //   2192: invokevirtual FWm : ()J
    //   2195: lsub
    //   2196: l2i
    //   2197: invokestatic Dne : (I)Ljava/lang/String;
    //   2200: aastore
    //   2201: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2204: astore #27
    //   2206: aload #8
    //   2208: aload #27
    //   2210: invokevirtual Dne : (Ljava/lang/String;)I
    //   2213: istore #11
    //   2215: aload #8
    //   2217: aload #27
    //   2219: iload #6
    //   2221: iload #11
    //   2223: isub
    //   2224: bipush #10
    //   2226: isub
    //   2227: iconst_5
    //   2228: ldc_w 16777215
    //   2231: invokevirtual Dne : (Ljava/lang/String;III)I
    //   2234: pop
    //   2235: aload_0
    //   2236: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2239: getfield Dne : LBkx;
    //   2242: invokevirtual FWm : ()V
    //   2245: aload_0
    //   2246: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2249: getfield Dne : LfZI;
    //   2252: getfield EyB : Z
    //   2255: ifeq -> 3286
    //   2258: aload_0
    //   2259: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2262: getfield Dne : LBkx;
    //   2265: ldc_w 'debug'
    //   2268: invokevirtual Dne : (Ljava/lang/String;)V
    //   2271: invokestatic glPushMatrix : ()V
    //   2274: aload #8
    //   2276: new java/lang/StringBuilder
    //   2279: dup
    //   2280: invokespecial <init> : ()V
    //   2283: ldc_w '§k'
    //   2286: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2289: aload_0
    //   2290: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2293: invokevirtual Dne : ()Ljava/lang/String;
    //   2296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2299: invokevirtual toString : ()Ljava/lang/String;
    //   2302: iconst_2
    //   2303: bipush #12
    //   2305: ldc_w 16777215
    //   2308: invokevirtual Dne : (Ljava/lang/String;III)I
    //   2311: pop
    //   2312: aload #8
    //   2314: new java/lang/StringBuilder
    //   2317: dup
    //   2318: invokespecial <init> : ()V
    //   2321: ldc_w '§k'
    //   2324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2327: aload_0
    //   2328: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2331: invokevirtual FWm : ()Ljava/lang/String;
    //   2334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2337: invokevirtual toString : ()Ljava/lang/String;
    //   2340: iconst_2
    //   2341: bipush #22
    //   2343: ldc_w 16777215
    //   2346: invokevirtual Dne : (Ljava/lang/String;III)I
    //   2349: pop
    //   2350: aload #8
    //   2352: new java/lang/StringBuilder
    //   2355: dup
    //   2356: invokespecial <init> : ()V
    //   2359: ldc_w '§k'
    //   2362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2365: aload_0
    //   2366: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2369: invokevirtual Qnq : ()Ljava/lang/String;
    //   2372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2375: invokevirtual toString : ()Ljava/lang/String;
    //   2378: iconst_2
    //   2379: bipush #32
    //   2381: ldc_w 16777215
    //   2384: invokevirtual Dne : (Ljava/lang/String;III)I
    //   2387: pop
    //   2388: aload #8
    //   2390: new java/lang/StringBuilder
    //   2393: dup
    //   2394: invokespecial <init> : ()V
    //   2397: ldc_w '§k'
    //   2400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2403: aload_0
    //   2404: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2407: invokevirtual bzF : ()Ljava/lang/String;
    //   2410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2413: invokevirtual toString : ()Ljava/lang/String;
    //   2416: iconst_2
    //   2417: bipush #42
    //   2419: ldc_w 16777215
    //   2422: invokevirtual Dne : (Ljava/lang/String;III)I
    //   2425: pop
    //   2426: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   2429: invokevirtual maxMemory : ()J
    //   2432: lstore #28
    //   2434: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   2437: invokevirtual totalMemory : ()J
    //   2440: lstore #30
    //   2442: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   2445: invokevirtual freeMemory : ()J
    //   2448: lstore #32
    //   2450: lload #30
    //   2452: lload #32
    //   2454: lsub
    //   2455: lstore #34
    //   2457: new java/lang/StringBuilder
    //   2460: dup
    //   2461: invokespecial <init> : ()V
    //   2464: ldc_w '§kUsed memory: '
    //   2467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2470: lload #34
    //   2472: ldc2_w 100
    //   2475: lmul
    //   2476: lload #28
    //   2478: ldiv
    //   2479: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   2482: ldc_w '% ('
    //   2485: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2488: lload #34
    //   2490: ldc2_w 1024
    //   2493: ldiv
    //   2494: ldc2_w 1024
    //   2497: ldiv
    //   2498: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   2501: ldc_w 'MB) of '
    //   2504: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2507: lload #28
    //   2509: ldc2_w 1024
    //   2512: ldiv
    //   2513: ldc2_w 1024
    //   2516: ldiv
    //   2517: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   2520: ldc_w 'MB'
    //   2523: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2526: invokevirtual toString : ()Ljava/lang/String;
    //   2529: astore #36
    //   2531: aload_0
    //   2532: aload #8
    //   2534: aload #36
    //   2536: iload #6
    //   2538: aload #8
    //   2540: aload #36
    //   2542: invokevirtual Dne : (Ljava/lang/String;)I
    //   2545: isub
    //   2546: iconst_2
    //   2547: isub
    //   2548: iconst_2
    //   2549: ldc_w 14737632
    //   2552: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   2555: new java/lang/StringBuilder
    //   2558: dup
    //   2559: invokespecial <init> : ()V
    //   2562: ldc_w '§kAllocated memory: '
    //   2565: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2568: lload #30
    //   2570: ldc2_w 100
    //   2573: lmul
    //   2574: lload #28
    //   2576: ldiv
    //   2577: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   2580: ldc_w '% ('
    //   2583: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2586: lload #30
    //   2588: ldc2_w 1024
    //   2591: ldiv
    //   2592: ldc2_w 1024
    //   2595: ldiv
    //   2596: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   2599: ldc_w 'MB)'
    //   2602: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2605: invokevirtual toString : ()Ljava/lang/String;
    //   2608: astore #36
    //   2610: aload_0
    //   2611: aload #8
    //   2613: aload #36
    //   2615: iload #6
    //   2617: aload #8
    //   2619: aload #36
    //   2621: invokevirtual Dne : (Ljava/lang/String;)I
    //   2624: isub
    //   2625: iconst_2
    //   2626: isub
    //   2627: bipush #12
    //   2629: ldc_w 14737632
    //   2632: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   2635: aload_0
    //   2636: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2639: getfield Dne : LMJs;
    //   2642: getfield div : D
    //   2645: invokestatic FWm : (D)I
    //   2648: istore #22
    //   2650: aload_0
    //   2651: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2654: getfield Dne : LMJs;
    //   2657: getfield IjH : D
    //   2660: invokestatic FWm : (D)I
    //   2663: istore #17
    //   2665: aload_0
    //   2666: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2669: getfield Dne : LMJs;
    //   2672: getfield mrb : D
    //   2675: invokestatic FWm : (D)I
    //   2678: istore #18
    //   2680: aload_0
    //   2681: aload #8
    //   2683: ldc_w '§kx: %.5f (%d) // c: %d (%d)'
    //   2686: iconst_4
    //   2687: anewarray java/lang/Object
    //   2690: dup
    //   2691: iconst_0
    //   2692: aload_0
    //   2693: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2696: getfield Dne : LMJs;
    //   2699: getfield div : D
    //   2702: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2705: aastore
    //   2706: dup
    //   2707: iconst_1
    //   2708: iload #22
    //   2710: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2713: aastore
    //   2714: dup
    //   2715: iconst_2
    //   2716: iload #22
    //   2718: iconst_4
    //   2719: ishr
    //   2720: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2723: aastore
    //   2724: dup
    //   2725: iconst_3
    //   2726: iload #22
    //   2728: bipush #15
    //   2730: iand
    //   2731: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2734: aastore
    //   2735: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2738: iconst_2
    //   2739: bipush #64
    //   2741: ldc_w 14737632
    //   2744: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   2747: aload_0
    //   2748: aload #8
    //   2750: ldc_w '§ky: %.3f (feet pos, %.3f eyes pos)'
    //   2753: iconst_2
    //   2754: anewarray java/lang/Object
    //   2757: dup
    //   2758: iconst_0
    //   2759: aload_0
    //   2760: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2763: getfield Dne : LMJs;
    //   2766: getfield Dne : LbSp;
    //   2769: getfield FWm : D
    //   2772: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2775: aastore
    //   2776: dup
    //   2777: iconst_1
    //   2778: aload_0
    //   2779: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2782: getfield Dne : LMJs;
    //   2785: getfield IjH : D
    //   2788: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2791: aastore
    //   2792: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2795: iconst_2
    //   2796: bipush #72
    //   2798: ldc_w 14737632
    //   2801: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   2804: aload_0
    //   2805: aload #8
    //   2807: ldc_w '§kz: %.5f (%d) // c: %d (%d)'
    //   2810: iconst_4
    //   2811: anewarray java/lang/Object
    //   2814: dup
    //   2815: iconst_0
    //   2816: aload_0
    //   2817: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2820: getfield Dne : LMJs;
    //   2823: getfield mrb : D
    //   2826: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2829: aastore
    //   2830: dup
    //   2831: iconst_1
    //   2832: iload #18
    //   2834: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2837: aastore
    //   2838: dup
    //   2839: iconst_2
    //   2840: iload #18
    //   2842: iconst_4
    //   2843: ishr
    //   2844: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2847: aastore
    //   2848: dup
    //   2849: iconst_3
    //   2850: iload #18
    //   2852: bipush #15
    //   2854: iand
    //   2855: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2858: aastore
    //   2859: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2862: iconst_2
    //   2863: bipush #80
    //   2865: ldc_w 14737632
    //   2868: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   2871: aload_0
    //   2872: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2875: getfield Dne : LMJs;
    //   2878: getfield mrb : F
    //   2881: ldc_w 4.0
    //   2884: fmul
    //   2885: ldc_w 360.0
    //   2888: fdiv
    //   2889: f2d
    //   2890: ldc2_w 0.5
    //   2893: dadd
    //   2894: invokestatic FWm : (D)I
    //   2897: iconst_3
    //   2898: iand
    //   2899: istore #19
    //   2901: aload_0
    //   2902: aload #8
    //   2904: new java/lang/StringBuilder
    //   2907: dup
    //   2908: invokespecial <init> : ()V
    //   2911: ldc_w '§kf: '
    //   2914: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2917: iload #19
    //   2919: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2922: ldc_w ' ('
    //   2925: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2928: getstatic zxJ.Dne : [Ljava/lang/String;
    //   2931: iload #19
    //   2933: aaload
    //   2934: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2937: ldc_w ') / '
    //   2940: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2943: aload_0
    //   2944: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2947: getfield Dne : LMJs;
    //   2950: getfield mrb : F
    //   2953: invokestatic aFZ : (F)F
    //   2956: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   2959: invokevirtual toString : ()Ljava/lang/String;
    //   2962: iconst_2
    //   2963: bipush #88
    //   2965: ldc_w 14737632
    //   2968: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   2971: aload_0
    //   2972: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2975: getfield Dne : LVzZ;
    //   2978: ifnull -> 3177
    //   2981: aload_0
    //   2982: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   2985: getfield Dne : LVzZ;
    //   2988: iload #22
    //   2990: iload #17
    //   2992: iload #18
    //   2994: invokevirtual bzF : (III)Z
    //   2997: ifeq -> 3177
    //   3000: aload_0
    //   3001: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3004: getfield Dne : LVzZ;
    //   3007: iload #22
    //   3009: iload #18
    //   3011: invokevirtual Dne : (II)LqMV;
    //   3014: astore #37
    //   3016: aload_0
    //   3017: aload #8
    //   3019: new java/lang/StringBuilder
    //   3022: dup
    //   3023: invokespecial <init> : ()V
    //   3026: ldc_w '§klc: '
    //   3029: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3032: aload #37
    //   3034: invokevirtual Dne : ()I
    //   3037: bipush #15
    //   3039: iadd
    //   3040: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3043: ldc_w ' b: '
    //   3046: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3049: aload #37
    //   3051: iload #22
    //   3053: bipush #15
    //   3055: iand
    //   3056: iload #18
    //   3058: bipush #15
    //   3060: iand
    //   3061: aload_0
    //   3062: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3065: getfield Dne : LVzZ;
    //   3068: invokevirtual Dne : ()Ltgc;
    //   3071: invokevirtual Dne : (IILtgc;)LOdI;
    //   3074: getfield Dne : Ljava/lang/String;
    //   3077: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3080: ldc_w ' bl: '
    //   3083: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3086: aload #37
    //   3088: getstatic udO.FWm : LudO;
    //   3091: iload #22
    //   3093: bipush #15
    //   3095: iand
    //   3096: iload #17
    //   3098: iload #18
    //   3100: bipush #15
    //   3102: iand
    //   3103: invokevirtual Dne : (LudO;III)I
    //   3106: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3109: ldc_w ' sl: '
    //   3112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3115: aload #37
    //   3117: getstatic udO.Dne : LudO;
    //   3120: iload #22
    //   3122: bipush #15
    //   3124: iand
    //   3125: iload #17
    //   3127: iload #18
    //   3129: bipush #15
    //   3131: iand
    //   3132: invokevirtual Dne : (LudO;III)I
    //   3135: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3138: ldc_w ' rl: '
    //   3141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3144: aload #37
    //   3146: iload #22
    //   3148: bipush #15
    //   3150: iand
    //   3151: iload #17
    //   3153: iload #18
    //   3155: bipush #15
    //   3157: iand
    //   3158: iconst_0
    //   3159: invokevirtual Dne : (IIII)I
    //   3162: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3165: invokevirtual toString : ()Ljava/lang/String;
    //   3168: iconst_2
    //   3169: bipush #96
    //   3171: ldc_w 14737632
    //   3174: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   3177: aload_0
    //   3178: aload #8
    //   3180: ldc_w '§kws: %.3f, fs: %.3f, g: %b, fl: %d'
    //   3183: iconst_4
    //   3184: anewarray java/lang/Object
    //   3187: dup
    //   3188: iconst_0
    //   3189: aload_0
    //   3190: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3193: getfield Dne : LMJs;
    //   3196: getfield Dne : Luqg;
    //   3199: invokevirtual FWm : ()F
    //   3202: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3205: aastore
    //   3206: dup
    //   3207: iconst_1
    //   3208: aload_0
    //   3209: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3212: getfield Dne : LMJs;
    //   3215: getfield Dne : Luqg;
    //   3218: invokevirtual Dne : ()F
    //   3221: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3224: aastore
    //   3225: dup
    //   3226: iconst_2
    //   3227: aload_0
    //   3228: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3231: getfield Dne : LMJs;
    //   3234: getfield aFZ : Z
    //   3237: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3240: aastore
    //   3241: dup
    //   3242: iconst_3
    //   3243: aload_0
    //   3244: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3247: getfield Dne : LVzZ;
    //   3250: iload #22
    //   3252: iload #18
    //   3254: invokevirtual FWm : (II)I
    //   3257: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3260: aastore
    //   3261: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3264: iconst_2
    //   3265: bipush #104
    //   3267: ldc_w 14737632
    //   3270: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   3273: invokestatic glPopMatrix : ()V
    //   3276: aload_0
    //   3277: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3280: getfield Dne : LBkx;
    //   3283: invokevirtual FWm : ()V
    //   3286: iload #6
    //   3288: iload #7
    //   3290: invokestatic Dne : (II)V
    //   3293: aload_0
    //   3294: getfield FWm : I
    //   3297: ifle -> 3470
    //   3300: aload_0
    //   3301: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3304: getfield Dne : LBkx;
    //   3307: ldc_w 'overlayMessage'
    //   3310: invokevirtual Dne : (Ljava/lang/String;)V
    //   3313: aload_0
    //   3314: getfield FWm : I
    //   3317: i2f
    //   3318: fload_1
    //   3319: fsub
    //   3320: fstore #24
    //   3322: fload #24
    //   3324: ldc_w 256.0
    //   3327: fmul
    //   3328: ldc_w 20.0
    //   3331: fdiv
    //   3332: f2i
    //   3333: istore #11
    //   3335: iload #11
    //   3337: sipush #255
    //   3340: if_icmple -> 3348
    //   3343: sipush #255
    //   3346: istore #11
    //   3348: iload #11
    //   3350: ifle -> 3460
    //   3353: invokestatic glPushMatrix : ()V
    //   3356: iload #6
    //   3358: iconst_2
    //   3359: idiv
    //   3360: i2f
    //   3361: iload #7
    //   3363: bipush #48
    //   3365: isub
    //   3366: i2f
    //   3367: fconst_0
    //   3368: invokestatic glTranslatef : (FFF)V
    //   3371: sipush #3042
    //   3374: invokestatic glEnable : (I)V
    //   3377: sipush #770
    //   3380: sipush #771
    //   3383: invokestatic glBlendFunc : (II)V
    //   3386: ldc_w 16777215
    //   3389: istore #12
    //   3391: aload_0
    //   3392: getfield Dne : Z
    //   3395: ifeq -> 3419
    //   3398: fload #24
    //   3400: ldc_w 50.0
    //   3403: fdiv
    //   3404: ldc_w 0.7
    //   3407: ldc_w 0.6
    //   3410: invokestatic HSBtoRGB : (FFF)I
    //   3413: ldc_w 16777215
    //   3416: iand
    //   3417: istore #12
    //   3419: aload #8
    //   3421: aload_0
    //   3422: getfield Dne : Ljava/lang/String;
    //   3425: aload #8
    //   3427: aload_0
    //   3428: getfield Dne : Ljava/lang/String;
    //   3431: invokevirtual Dne : (Ljava/lang/String;)I
    //   3434: ineg
    //   3435: iconst_2
    //   3436: idiv
    //   3437: bipush #-4
    //   3439: iload #12
    //   3441: iload #11
    //   3443: bipush #24
    //   3445: ishl
    //   3446: iadd
    //   3447: invokevirtual FWm : (Ljava/lang/String;III)I
    //   3450: pop
    //   3451: sipush #3042
    //   3454: invokestatic glDisable : (I)V
    //   3457: invokestatic glPopMatrix : ()V
    //   3460: aload_0
    //   3461: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3464: getfield Dne : LBkx;
    //   3467: invokevirtual FWm : ()V
    //   3470: aload_0
    //   3471: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3474: getfield Dne : LVzZ;
    //   3477: invokevirtual Dne : ()LSFA;
    //   3480: iconst_1
    //   3481: invokevirtual Dne : (I)LvfE;
    //   3484: astore #28
    //   3486: aload #28
    //   3488: ifnull -> 3503
    //   3491: aload_0
    //   3492: aload #28
    //   3494: iload #7
    //   3496: iload #6
    //   3498: aload #8
    //   3500: invokespecial Dne : (LvfE;IILmsA;)V
    //   3503: sipush #3042
    //   3506: invokestatic glEnable : (I)V
    //   3509: sipush #770
    //   3512: sipush #771
    //   3515: invokestatic glBlendFunc : (II)V
    //   3518: sipush #3008
    //   3521: invokestatic glDisable : (I)V
    //   3524: invokestatic glPushMatrix : ()V
    //   3527: fconst_0
    //   3528: iload #7
    //   3530: bipush #48
    //   3532: isub
    //   3533: i2f
    //   3534: fconst_0
    //   3535: invokestatic glTranslatef : (FFF)V
    //   3538: aload_0
    //   3539: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3542: getfield Dne : LBkx;
    //   3545: ldc_w 'chat'
    //   3548: invokevirtual Dne : (Ljava/lang/String;)V
    //   3551: aload_0
    //   3552: getfield Dne : LmuJ;
    //   3555: aload_0
    //   3556: getfield Dne : I
    //   3559: invokevirtual Dne : (I)V
    //   3562: aload_0
    //   3563: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3566: getfield Dne : LBkx;
    //   3569: invokevirtual FWm : ()V
    //   3572: invokestatic glPopMatrix : ()V
    //   3575: aload_0
    //   3576: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3579: getfield Dne : LVzZ;
    //   3582: invokevirtual Dne : ()LSFA;
    //   3585: iconst_0
    //   3586: invokevirtual Dne : (I)LvfE;
    //   3589: astore #28
    //   3591: aload_0
    //   3592: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3595: getfield Dne : LfZI;
    //   3598: getfield Zpi : LulE;
    //   3601: getfield Dne : Z
    //   3604: ifeq -> 4211
    //   3607: aload_0
    //   3608: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3611: invokevirtual zGp : ()Z
    //   3614: ifeq -> 3644
    //   3617: aload_0
    //   3618: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3621: getfield Dne : LMJs;
    //   3624: getfield Dne : Lfzy;
    //   3627: getfield Dne : Ljava/util/List;
    //   3630: invokeinterface size : ()I
    //   3635: iconst_1
    //   3636: if_icmpgt -> 3644
    //   3639: aload #28
    //   3641: ifnull -> 4211
    //   3644: aload_0
    //   3645: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3648: getfield Dne : LBkx;
    //   3651: ldc_w 'playerList'
    //   3654: invokevirtual Dne : (Ljava/lang/String;)V
    //   3657: aload_0
    //   3658: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3661: getfield Dne : LMJs;
    //   3664: getfield Dne : Lfzy;
    //   3667: astore #29
    //   3669: aload #29
    //   3671: getfield Dne : Ljava/util/List;
    //   3674: astore #30
    //   3676: aload #29
    //   3678: getfield Dne : I
    //   3681: istore #25
    //   3683: iload #25
    //   3685: istore #26
    //   3687: iconst_1
    //   3688: istore #13
    //   3690: iload #26
    //   3692: bipush #20
    //   3694: if_icmple -> 3715
    //   3697: iinc #13, 1
    //   3700: iload #25
    //   3702: iload #13
    //   3704: iadd
    //   3705: iconst_1
    //   3706: isub
    //   3707: iload #13
    //   3709: idiv
    //   3710: istore #26
    //   3712: goto -> 3690
    //   3715: sipush #300
    //   3718: iload #13
    //   3720: idiv
    //   3721: istore #14
    //   3723: iload #14
    //   3725: sipush #150
    //   3728: if_icmple -> 3736
    //   3731: sipush #150
    //   3734: istore #14
    //   3736: iload #6
    //   3738: iload #13
    //   3740: iload #14
    //   3742: imul
    //   3743: isub
    //   3744: iconst_2
    //   3745: idiv
    //   3746: istore #15
    //   3748: bipush #10
    //   3750: istore #31
    //   3752: iload #15
    //   3754: iconst_1
    //   3755: isub
    //   3756: iload #31
    //   3758: iconst_1
    //   3759: isub
    //   3760: iload #15
    //   3762: iload #14
    //   3764: iload #13
    //   3766: imul
    //   3767: iadd
    //   3768: iload #31
    //   3770: bipush #9
    //   3772: iload #26
    //   3774: imul
    //   3775: iadd
    //   3776: ldc_w -2147483648
    //   3779: invokestatic Dne : (IIIII)V
    //   3782: iconst_0
    //   3783: istore #16
    //   3785: iload #16
    //   3787: iload #25
    //   3789: if_icmpge -> 4211
    //   3792: iload #15
    //   3794: iload #16
    //   3796: iload #13
    //   3798: irem
    //   3799: iload #14
    //   3801: imul
    //   3802: iadd
    //   3803: istore #22
    //   3805: iload #31
    //   3807: iload #16
    //   3809: iload #13
    //   3811: idiv
    //   3812: bipush #9
    //   3814: imul
    //   3815: iadd
    //   3816: istore #17
    //   3818: iload #22
    //   3820: iload #17
    //   3822: iload #22
    //   3824: iload #14
    //   3826: iadd
    //   3827: iconst_1
    //   3828: isub
    //   3829: iload #17
    //   3831: bipush #8
    //   3833: iadd
    //   3834: ldc 553648127
    //   3836: invokestatic Dne : (IIIII)V
    //   3839: fconst_1
    //   3840: fconst_1
    //   3841: fconst_1
    //   3842: fconst_1
    //   3843: invokestatic glColor4f : (FFFF)V
    //   3846: sipush #3008
    //   3849: invokestatic glEnable : (I)V
    //   3852: iload #16
    //   3854: aload #30
    //   3856: invokeinterface size : ()I
    //   3861: if_icmpge -> 4205
    //   3864: aload #30
    //   3866: iload #16
    //   3868: invokeinterface get : (I)Ljava/lang/Object;
    //   3873: checkcast aCn
    //   3876: astore #32
    //   3878: aload_0
    //   3879: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   3882: getfield Dne : LVzZ;
    //   3885: invokevirtual Dne : ()LSFA;
    //   3888: aload #32
    //   3890: getfield Dne : Ljava/lang/String;
    //   3893: invokevirtual bzF : (Ljava/lang/String;)LYGE;
    //   3896: astore #33
    //   3898: aload #33
    //   3900: aload #32
    //   3902: getfield Dne : Ljava/lang/String;
    //   3905: invokestatic Dne : (LYGE;Ljava/lang/String;)Ljava/lang/String;
    //   3908: astore #34
    //   3910: aload #8
    //   3912: aload #34
    //   3914: iload #22
    //   3916: iload #17
    //   3918: ldc_w 16777215
    //   3921: invokevirtual Dne : (Ljava/lang/String;III)I
    //   3924: pop
    //   3925: aload #28
    //   3927: ifnull -> 4036
    //   3930: iload #22
    //   3932: aload #8
    //   3934: aload #34
    //   3936: invokevirtual Dne : (Ljava/lang/String;)I
    //   3939: iadd
    //   3940: iconst_5
    //   3941: iadd
    //   3942: istore #20
    //   3944: iload #22
    //   3946: iload #14
    //   3948: iadd
    //   3949: bipush #12
    //   3951: isub
    //   3952: iconst_5
    //   3953: isub
    //   3954: istore #23
    //   3956: iload #23
    //   3958: iload #20
    //   3960: isub
    //   3961: iconst_5
    //   3962: if_icmple -> 4036
    //   3965: aload #28
    //   3967: invokevirtual Dne : ()LSFA;
    //   3970: aload #32
    //   3972: getfield Dne : Ljava/lang/String;
    //   3975: aload #28
    //   3977: invokevirtual Dne : (Ljava/lang/String;LvfE;)LOHz;
    //   3980: astore #35
    //   3982: new java/lang/StringBuilder
    //   3985: dup
    //   3986: invokespecial <init> : ()V
    //   3989: getstatic Dne.ooe : LDne;
    //   3992: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3995: ldc ''
    //   3997: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4000: aload #35
    //   4002: invokevirtual Dne : ()I
    //   4005: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   4008: invokevirtual toString : ()Ljava/lang/String;
    //   4011: astore #36
    //   4013: aload #8
    //   4015: aload #36
    //   4017: iload #23
    //   4019: aload #8
    //   4021: aload #36
    //   4023: invokevirtual Dne : (Ljava/lang/String;)I
    //   4026: isub
    //   4027: iload #17
    //   4029: ldc_w 16777215
    //   4032: invokevirtual Dne : (Ljava/lang/String;III)I
    //   4035: pop
    //   4036: fconst_1
    //   4037: fconst_1
    //   4038: fconst_1
    //   4039: fconst_1
    //   4040: invokestatic glColor4f : (FFFF)V
    //   4043: aload_0
    //   4044: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4047: getfield Dne : LSnh;
    //   4050: ldc_w '/gui/icons.png'
    //   4053: invokevirtual Dne : (Ljava/lang/String;)V
    //   4056: iconst_0
    //   4057: istore #35
    //   4059: iconst_0
    //   4060: istore #36
    //   4062: aload #32
    //   4064: getfield Dne : I
    //   4067: ifge -> 4076
    //   4070: iconst_5
    //   4071: istore #21
    //   4073: goto -> 4147
    //   4076: aload #32
    //   4078: getfield Dne : I
    //   4081: sipush #150
    //   4084: if_icmpge -> 4093
    //   4087: iconst_0
    //   4088: istore #21
    //   4090: goto -> 4147
    //   4093: aload #32
    //   4095: getfield Dne : I
    //   4098: sipush #300
    //   4101: if_icmpge -> 4110
    //   4104: iconst_1
    //   4105: istore #21
    //   4107: goto -> 4147
    //   4110: aload #32
    //   4112: getfield Dne : I
    //   4115: sipush #600
    //   4118: if_icmpge -> 4127
    //   4121: iconst_2
    //   4122: istore #21
    //   4124: goto -> 4147
    //   4127: aload #32
    //   4129: getfield Dne : I
    //   4132: sipush #1000
    //   4135: if_icmpge -> 4144
    //   4138: iconst_3
    //   4139: istore #21
    //   4141: goto -> 4147
    //   4144: iconst_4
    //   4145: istore #21
    //   4147: aload_0
    //   4148: dup
    //   4149: getfield FWm : F
    //   4152: ldc_w 100.0
    //   4155: fadd
    //   4156: putfield FWm : F
    //   4159: aload_0
    //   4160: iload #22
    //   4162: iload #14
    //   4164: iadd
    //   4165: bipush #12
    //   4167: isub
    //   4168: iload #17
    //   4170: iconst_0
    //   4171: iload #35
    //   4173: bipush #10
    //   4175: imul
    //   4176: iadd
    //   4177: sipush #176
    //   4180: iload #21
    //   4182: bipush #8
    //   4184: imul
    //   4185: iadd
    //   4186: bipush #10
    //   4188: bipush #8
    //   4190: invokevirtual FWm : (IIIIII)V
    //   4193: aload_0
    //   4194: dup
    //   4195: getfield FWm : F
    //   4198: ldc_w 100.0
    //   4201: fsub
    //   4202: putfield FWm : F
    //   4205: iinc #16, 1
    //   4208: goto -> 3785
    //   4211: fconst_1
    //   4212: fconst_1
    //   4213: fconst_1
    //   4214: fconst_1
    //   4215: invokestatic glColor4f : (FFFF)V
    //   4218: sipush #2896
    //   4221: invokestatic glDisable : (I)V
    //   4224: sipush #3008
    //   4227: invokestatic glEnable : (I)V
    //   4230: return
  }
  
  public int Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aUl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */