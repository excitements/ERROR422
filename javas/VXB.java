import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class VXB extends MlO {
  private GpK Dne;
  
  private mHN Dne;
  
  private onZ Dne;
  
  private List FWm;
  
  private boolean zGp;
  
  private float Dne = 0.0F;
  
  private static pam Dne;
  
  private static int DyG;
  
  private boolean Qnq = false;
  
  private boolean aFZ;
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic isButtonDown : (I)Z
    //   4: istore #4
    //   6: aload_0
    //   7: getfield aFZ : I
    //   10: istore #5
    //   12: aload_0
    //   13: getfield zGp : I
    //   16: istore #6
    //   18: iload #5
    //   20: sipush #175
    //   23: iadd
    //   24: istore #7
    //   26: iload #6
    //   28: bipush #18
    //   30: iadd
    //   31: istore #8
    //   33: iload #7
    //   35: bipush #14
    //   37: iadd
    //   38: istore #9
    //   40: iload #8
    //   42: bipush #112
    //   44: iadd
    //   45: istore #10
    //   47: aload_0
    //   48: getfield aFZ : Z
    //   51: ifne -> 91
    //   54: iload #4
    //   56: ifeq -> 91
    //   59: iload_1
    //   60: iload #7
    //   62: if_icmplt -> 91
    //   65: iload_2
    //   66: iload #8
    //   68: if_icmplt -> 91
    //   71: iload_1
    //   72: iload #9
    //   74: if_icmpge -> 91
    //   77: iload_2
    //   78: iload #10
    //   80: if_icmpge -> 91
    //   83: aload_0
    //   84: aload_0
    //   85: invokespecial Qnq : ()Z
    //   88: putfield Qnq : Z
    //   91: iload #4
    //   93: ifne -> 101
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield Qnq : Z
    //   101: aload_0
    //   102: iload #4
    //   104: putfield aFZ : Z
    //   107: aload_0
    //   108: getfield Qnq : Z
    //   111: ifeq -> 178
    //   114: aload_0
    //   115: iload_2
    //   116: iload #8
    //   118: isub
    //   119: i2f
    //   120: ldc 7.5
    //   122: fsub
    //   123: iload #10
    //   125: iload #8
    //   127: isub
    //   128: i2f
    //   129: ldc 15.0
    //   131: fsub
    //   132: fdiv
    //   133: putfield Dne : F
    //   136: aload_0
    //   137: getfield Dne : F
    //   140: fconst_0
    //   141: fcmpg
    //   142: ifge -> 150
    //   145: aload_0
    //   146: fconst_0
    //   147: putfield Dne : F
    //   150: aload_0
    //   151: getfield Dne : F
    //   154: fconst_1
    //   155: fcmpl
    //   156: ifle -> 164
    //   159: aload_0
    //   160: fconst_1
    //   161: putfield Dne : F
    //   164: aload_0
    //   165: getfield Dne : LPdb;
    //   168: checkcast FOg
    //   171: aload_0
    //   172: getfield Dne : F
    //   175: invokevirtual Dne : (F)V
    //   178: aload_0
    //   179: iload_1
    //   180: iload_2
    //   181: fload_3
    //   182: invokespecial Dne : (IIF)V
    //   185: getstatic JcN.Dne : [LJcN;
    //   188: astore #11
    //   190: aload #11
    //   192: arraylength
    //   193: istore #12
    //   195: iconst_0
    //   196: istore #13
    //   198: iload #13
    //   200: iload #12
    //   202: if_icmpge -> 232
    //   205: aload #11
    //   207: iload #13
    //   209: aaload
    //   210: astore #14
    //   212: aload_0
    //   213: aload #14
    //   215: iload_1
    //   216: iload_2
    //   217: invokevirtual FWm : (LJcN;II)Z
    //   220: ifeq -> 226
    //   223: goto -> 232
    //   226: iinc #13, 1
    //   229: goto -> 198
    //   232: aload_0
    //   233: getfield Dne : LonZ;
    //   236: ifnull -> 292
    //   239: getstatic VXB.DyG : I
    //   242: getstatic JcN.Zpi : LJcN;
    //   245: invokevirtual Dne : ()I
    //   248: if_icmpne -> 292
    //   251: aload_0
    //   252: aload_0
    //   253: getfield Dne : LonZ;
    //   256: getfield aFZ : I
    //   259: aload_0
    //   260: getfield Dne : LonZ;
    //   263: getfield zGp : I
    //   266: bipush #16
    //   268: bipush #16
    //   270: iload_1
    //   271: iload_2
    //   272: invokevirtual Dne : (IIIIII)Z
    //   275: ifeq -> 292
    //   278: aload_0
    //   279: invokestatic Dne : ()Lirb;
    //   282: ldc 'inventory.binSlot'
    //   284: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   287: iload_1
    //   288: iload_2
    //   289: invokevirtual Dne : (Ljava/lang/String;II)V
    //   292: fconst_1
    //   293: fconst_1
    //   294: fconst_1
    //   295: fconst_1
    //   296: invokestatic glColor4f : (FFFF)V
    //   299: sipush #2896
    //   302: invokestatic glDisable : (I)V
    //   305: return
  }
  
  public VXB(FiG paramFiG) {
    super(new FOg(paramFiG));
    this.Dne = null;
    this.zGp = false;
    paramFiG.FWm = this.Dne;
    this.FWm = true;
    paramFiG.Dne(qlg.Dne, 1);
    this.Qnq = true;
    this.Dne = 'Ã';
  }
  
  private void FWm(JcN paramJcN) {
    int i = DyG;
    DyG = paramJcN.Dne();
    FOg fOg = (FOg)this.Dne;
    this.Dne.clear();
    fOg.Dne.clear();
    paramJcN.Dne(fOg.Dne);
    if (paramJcN == JcN.Zpi) {
      fzy fzy = ((Minecraft)this.Dne).Dne.Dne;
      if (this.FWm == null)
        this.FWm = fOg.bzF; 
      fOg.bzF = new ArrayList();
      for (byte b = 0; b < ((Pdb)fzy).bzF.size(); b++) {
        uod uod = new uod(this, ((Pdb)fzy).bzF.get(b), b);
        fOg.bzF.add(uod);
        if (b >= 5 && b < 9) {
          int j = b - 5;
          int k = j / 2;
          int m = j % 2;
          uod.aFZ = 9 + k * 54;
          uod.zGp = 6 + m * 27;
        } else if (b >= 0 && b < 5) {
          uod.zGp = -2000;
          uod.aFZ = -2000;
        } else if (b < ((Pdb)fzy).bzF.size()) {
          int j = b - 9;
          int k = j % 9;
          int m = j / 9;
          uod.aFZ = 9 + k * 18;
          if (b >= 36) {
            uod.zGp = 112;
          } else {
            uod.zGp = 54 + m * 18;
          } 
        } 
      } 
      this.Dne = (pam)new onZ(Dne, 0, 173, 112);
      fOg.bzF.add(this.Dne);
    } else if (i == JcN.Zpi.Dne()) {
      fOg.bzF = this.FWm;
      this.FWm = null;
    } 
    if (this.Dne != null)
      if (paramJcN == JcN.zGp) {
        this.Dne.aFZ(true);
        this.Dne.Qnq(false);
        this.Dne.FWm(true);
        this.Dne.Dne("");
        zGp();
      } else {
        this.Dne.aFZ(false);
        this.Dne.Qnq(true);
        this.Dne.FWm(false);
      }  
    this.Dne = 0.0F;
    fOg.Dne(0.0F);
  }
  
  static {
    // Byte code:
    //   0: new pam
    //   3: dup
    //   4: ldc 'tmp'
    //   6: iconst_1
    //   7: bipush #45
    //   9: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   12: putstatic VXB.Dne : Lpam;
    //   15: getstatic JcN.Dne : LJcN;
    //   18: invokevirtual Dne : ()I
    //   21: putstatic VXB.DyG : I
    //   24: return
  }
  
  static pam Dne() {
    return Dne;
  }
  
  protected void FWm(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 73
    //   4: iload_1
    //   5: aload_0
    //   6: getfield aFZ : I
    //   9: isub
    //   10: istore #4
    //   12: iload_2
    //   13: aload_0
    //   14: getfield zGp : I
    //   17: isub
    //   18: istore #5
    //   20: getstatic JcN.Dne : [LJcN;
    //   23: astore #6
    //   25: aload #6
    //   27: arraylength
    //   28: istore #7
    //   30: iconst_0
    //   31: istore #8
    //   33: iload #8
    //   35: iload #7
    //   37: if_icmpge -> 73
    //   40: aload #6
    //   42: iload #8
    //   44: aaload
    //   45: astore #9
    //   47: aload_0
    //   48: aload #9
    //   50: iload #4
    //   52: iload #5
    //   54: invokevirtual Dne : (LJcN;II)Z
    //   57: ifeq -> 67
    //   60: aload_0
    //   61: aload #9
    //   63: invokespecial FWm : (LJcN;)V
    //   66: return
    //   67: iinc #8, 1
    //   70: goto -> 33
    //   73: aload_0
    //   74: iload_1
    //   75: iload_2
    //   76: iload_3
    //   77: invokespecial FWm : (III)V
    //   80: return
  }
  
  protected boolean FWm(JcN paramJcN, int paramInt1, int paramInt2) {
    int k;
    int i = paramJcN.bzF();
    int j = 28 * i;
    byte b = 0;
    if (i == 5) {
      j = this.Dne - 28 + 2;
    } else if (i > 0) {
      j += i;
    } 
    if (paramJcN.bzF()) {
      k = b - 32;
    } else {
      k = b + this.Qnq;
    } 
    if (Dne(j + 3, k + 3, 23, 27, paramInt1, paramInt2)) {
      Dne(paramJcN.FWm(), paramInt1, paramInt2);
      return true;
    } 
    return false;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic JcN.Dne : [LJcN;
    //   3: getstatic VXB.DyG : I
    //   6: aaload
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual Dne : ()Z
    //   12: ifeq -> 33
    //   15: aload_0
    //   16: getfield Dne : LmsA;
    //   19: aload_3
    //   20: invokevirtual FWm : ()Ljava/lang/String;
    //   23: bipush #8
    //   25: bipush #6
    //   27: ldc 4210752
    //   29: invokevirtual FWm : (Ljava/lang/String;III)I
    //   32: pop
    //   33: return
  }
  
  private boolean Qnq() {
    // Byte code:
    //   0: getstatic VXB.DyG : I
    //   3: getstatic JcN.Zpi : LJcN;
    //   6: invokevirtual Dne : ()I
    //   9: if_icmpeq -> 42
    //   12: getstatic JcN.Dne : [LJcN;
    //   15: getstatic VXB.DyG : I
    //   18: aaload
    //   19: invokevirtual FWm : ()Z
    //   22: ifeq -> 42
    //   25: aload_0
    //   26: getfield Dne : LPdb;
    //   29: checkcast FOg
    //   32: invokevirtual Dne : ()Z
    //   35: ifeq -> 42
    //   38: iconst_1
    //   39: goto -> 43
    //   42: iconst_0
    //   43: ireturn
  }
  
  public void bzF() {
    if (!((Minecraft)this.Dne).Dne.aFZ())
      this.Dne.Dne(new gTB(((Minecraft)this.Dne).Dne)); 
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: fconst_1
    //   1: fconst_1
    //   2: fconst_1
    //   3: fconst_1
    //   4: invokestatic glColor4f : (FFFF)V
    //   7: invokestatic bzF : ()V
    //   10: getstatic JcN.Dne : [LJcN;
    //   13: getstatic VXB.DyG : I
    //   16: aaload
    //   17: astore #4
    //   19: getstatic JcN.Dne : [LJcN;
    //   22: astore #5
    //   24: aload #5
    //   26: arraylength
    //   27: istore #6
    //   29: iconst_0
    //   30: istore #7
    //   32: iload #7
    //   34: iload #6
    //   36: if_icmpge -> 82
    //   39: aload #5
    //   41: iload #7
    //   43: aaload
    //   44: astore #8
    //   46: aload_0
    //   47: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   50: getfield Dne : LSnh;
    //   53: ldc_w '/gui/allitems.png'
    //   56: invokevirtual Dne : (Ljava/lang/String;)V
    //   59: aload #8
    //   61: invokevirtual Dne : ()I
    //   64: getstatic VXB.DyG : I
    //   67: if_icmpeq -> 76
    //   70: aload_0
    //   71: aload #8
    //   73: invokevirtual Dne : (LJcN;)V
    //   76: iinc #7, 1
    //   79: goto -> 32
    //   82: aload_0
    //   83: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   86: getfield Dne : LSnh;
    //   89: new java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: ldc_w '/gui/creative_inv/'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload #4
    //   104: invokevirtual bzF : ()Ljava/lang/String;
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual toString : ()Ljava/lang/String;
    //   113: invokevirtual Dne : (Ljava/lang/String;)V
    //   116: aload_0
    //   117: aload_0
    //   118: getfield aFZ : I
    //   121: aload_0
    //   122: getfield zGp : I
    //   125: iconst_0
    //   126: iconst_0
    //   127: aload_0
    //   128: getfield Dne : I
    //   131: aload_0
    //   132: getfield Qnq : I
    //   135: invokevirtual FWm : (IIIIII)V
    //   138: aload_0
    //   139: getfield Dne : LmHN;
    //   142: invokevirtual Qnq : ()V
    //   145: fconst_1
    //   146: fconst_1
    //   147: fconst_1
    //   148: fconst_1
    //   149: invokestatic glColor4f : (FFFF)V
    //   152: aload_0
    //   153: getfield aFZ : I
    //   156: sipush #175
    //   159: iadd
    //   160: istore #8
    //   162: aload_0
    //   163: getfield zGp : I
    //   166: bipush #18
    //   168: iadd
    //   169: istore #6
    //   171: iload #6
    //   173: bipush #112
    //   175: iadd
    //   176: istore #7
    //   178: aload_0
    //   179: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   182: getfield Dne : LSnh;
    //   185: ldc_w '/gui/allitems.png'
    //   188: invokevirtual Dne : (Ljava/lang/String;)V
    //   191: aload #4
    //   193: invokevirtual FWm : ()Z
    //   196: ifeq -> 245
    //   199: aload_0
    //   200: iload #8
    //   202: iload #6
    //   204: iload #7
    //   206: iload #6
    //   208: isub
    //   209: bipush #17
    //   211: isub
    //   212: i2f
    //   213: aload_0
    //   214: getfield Dne : F
    //   217: fmul
    //   218: f2i
    //   219: iadd
    //   220: sipush #232
    //   223: aload_0
    //   224: invokespecial Qnq : ()Z
    //   227: ifeq -> 234
    //   230: iconst_0
    //   231: goto -> 236
    //   234: bipush #12
    //   236: iadd
    //   237: iconst_0
    //   238: bipush #12
    //   240: bipush #15
    //   242: invokevirtual FWm : (IIIIII)V
    //   245: aload_0
    //   246: aload #4
    //   248: invokevirtual Dne : (LJcN;)V
    //   251: aload #4
    //   253: getstatic JcN.Zpi : LJcN;
    //   256: if_acmpne -> 305
    //   259: aload_0
    //   260: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   263: aload_0
    //   264: getfield aFZ : I
    //   267: bipush #43
    //   269: iadd
    //   270: aload_0
    //   271: getfield zGp : I
    //   274: bipush #45
    //   276: iadd
    //   277: bipush #20
    //   279: aload_0
    //   280: getfield aFZ : I
    //   283: bipush #43
    //   285: iadd
    //   286: iload_2
    //   287: isub
    //   288: i2f
    //   289: aload_0
    //   290: getfield zGp : I
    //   293: bipush #45
    //   295: iadd
    //   296: bipush #30
    //   298: isub
    //   299: iload_3
    //   300: isub
    //   301: i2f
    //   302: invokestatic Dne : (Lnet/minecraft/client/Minecraft;IIIFF)V
    //   305: return
  }
  
  public void Qnq() {
    super.Qnq();
    int i = Mouse.getEventDWheel();
    if (i != 0 && Qnq()) {
      int j = ((FOg)this.Dne).Dne.size() / 9 - 5 + 1;
      if (i > 0)
        i = 1; 
      if (i < 0)
        i = -1; 
      this.Dne = (float)(this.Dne - i / j);
      if (this.Dne < 0.0F)
        this.Dne = 0.0F; 
      if (this.Dne > 1.0F)
        this.Dne = 1.0F; 
      ((FOg)this.Dne).Dne(this.Dne);
    } 
  }
  
  public void FWm() {
    super.FWm();
    if (((Minecraft)this.Dne).Dne != null && ((Minecraft)this.Dne).Dne.Dne != null)
      ((Minecraft)this.Dne).Dne.Dne.FWm((mXX)this.Dne); 
    Keyboard.enableRepeatEvents(false);
  }
  
  public int Dne() {
    return DyG;
  }
  
  protected boolean Dne(JcN paramJcN, int paramInt1, int paramInt2) {
    int k;
    int i = paramJcN.bzF();
    int j = 28 * i;
    byte b = 0;
    if (i == 5) {
      j = this.Dne - 28 + 2;
    } else if (i > 0) {
      j += i;
    } 
    if (paramJcN.bzF()) {
      k = b - 32;
    } else {
      k = b + this.Qnq;
    } 
    return (paramInt1 >= j && paramInt1 <= j + 28 && paramInt2 >= k && paramInt2 <= k + 32);
  }
  
  protected void Dne(onZ paramonZ, int paramInt1, int paramInt2, int paramInt3) {
    this.zGp = true;
    boolean bool = (paramInt3 == 1) ? true : false;
    paramInt3 = (paramInt1 == -999 && paramInt3 == 0) ? 4 : paramInt3;
    if (paramonZ == null && DyG != JcN.Zpi.Dne() && paramInt3 != 5) {
      fzy fzy = ((Minecraft)this.Dne).Dne.Dne;
      if (fzy.FWm() != null) {
        if (paramInt2 == 0) {
          ((Minecraft)this.Dne).Dne.Dne(fzy.FWm());
          ((Minecraft)this.Dne).Dne.Dne(fzy.FWm());
          fzy.Dne((NMq)null);
        } 
        if (paramInt2 == 1) {
          NMq nMq = fzy.FWm().Dne(1);
          ((Minecraft)this.Dne).Dne.Dne(nMq);
          ((Minecraft)this.Dne).Dne.Dne(nMq);
          if ((fzy.FWm()).Dne == 0)
            fzy.Dne((NMq)null); 
        } 
      } 
    } else if (paramonZ == this.Dne && bool) {
      for (byte b = 0; b < ((Minecraft)this.Dne).Dne.Dne.Dne().size(); b++)
        ((Minecraft)this.Dne).Dne.Dne((NMq)null, b); 
    } else if (DyG == JcN.Zpi.Dne()) {
      if (paramonZ == this.Dne) {
        ((Minecraft)this.Dne).Dne.Dne.Dne((NMq)null);
      } else if (paramInt3 == 4 && paramonZ != null && paramonZ.Dne()) {
        NMq nMq = paramonZ.Dne((paramInt2 == 0) ? 1 : paramonZ.Dne().FWm());
        ((Minecraft)this.Dne).Dne.Dne(nMq);
        ((Minecraft)this.Dne).Dne.Dne(nMq);
      } else if (paramInt3 == 4 && ((Minecraft)this.Dne).Dne.Dne.FWm() != null) {
        ((Minecraft)this.Dne).Dne.Dne(((Minecraft)this.Dne).Dne.Dne.FWm());
        ((Minecraft)this.Dne).Dne.Dne(((Minecraft)this.Dne).Dne.Dne.FWm());
        ((Minecraft)this.Dne).Dne.Dne.Dne((NMq)null);
      } else {
        ((Minecraft)this.Dne).Dne.Dne.Dne((paramonZ == null) ? paramInt1 : (uod.Dne((uod)paramonZ)).Qnq, paramInt2, paramInt3, ((Minecraft)this.Dne).Dne);
        ((Minecraft)this.Dne).Dne.Dne.Dne();
      } 
    } else if (paramInt3 != 5 && paramonZ.Dne == Dne) {
      fzy fzy = ((Minecraft)this.Dne).Dne.Dne;
      NMq nMq1 = fzy.FWm();
      NMq nMq2 = paramonZ.Dne();
      if (paramInt3 == 2) {
        if (nMq2 != null && paramInt2 >= 0 && paramInt2 < 9) {
          NMq nMq = nMq2.Dne();
          nMq.Dne = nMq.FWm();
          ((Minecraft)this.Dne).Dne.Dne.Dne(paramInt2, nMq);
          ((Minecraft)this.Dne).Dne.Dne.Dne();
        } 
        return;
      } 
      if (paramInt3 == 3) {
        if (fzy.FWm() == null && paramonZ.Dne()) {
          NMq nMq = paramonZ.Dne().Dne();
          nMq.Dne = nMq.FWm();
          fzy.Dne(nMq);
        } 
        return;
      } 
      if (paramInt3 == 4) {
        if (nMq2 != null) {
          NMq nMq = nMq2.Dne();
          nMq.Dne = (paramInt2 == 0) ? 1 : nMq.FWm();
          ((Minecraft)this.Dne).Dne.Dne(nMq);
          ((Minecraft)this.Dne).Dne.Dne(nMq);
        } 
        return;
      } 
      if (nMq1 != null && nMq2 != null && nMq1.Dne(nMq2)) {
        if (paramInt2 == 0) {
          if (bool) {
            nMq1.Dne = nMq1.FWm();
          } else if (nMq1.Dne < nMq1.FWm()) {
            nMq1.Dne++;
          } 
        } else if (nMq1.Dne <= 1) {
          fzy.Dne((NMq)null);
        } else {
          nMq1.Dne--;
        } 
      } else if (nMq2 != null && nMq1 == null) {
        fzy.Dne(NMq.Dne(nMq2));
        nMq1 = fzy.FWm();
        if (bool)
          nMq1.Dne = nMq1.FWm(); 
      } else {
        fzy.Dne((NMq)null);
      } 
    } else {
      this.Dne.Dne((paramonZ == null) ? paramInt1 : paramonZ.Qnq, paramInt2, paramInt3, ((Minecraft)this.Dne).Dne);
      if (Pdb.FWm(paramInt2) == 2) {
        for (byte b = 0; b < 9; b++)
          ((Minecraft)this.Dne).Dne.Dne(this.Dne.Dne(45 + b).Dne(), 36 + b); 
      } else if (paramonZ != null) {
        NMq nMq = this.Dne.Dne(paramonZ.Qnq).Dne();
        ((Minecraft)this.Dne).Dne.Dne(nMq, paramonZ.Qnq - ((Pdb)this.Dne).bzF.size() + 9 + 36);
      } 
    } 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 67
    //   4: iload_1
    //   5: aload_0
    //   6: getfield aFZ : I
    //   9: isub
    //   10: istore #4
    //   12: iload_2
    //   13: aload_0
    //   14: getfield zGp : I
    //   17: isub
    //   18: istore #5
    //   20: getstatic JcN.Dne : [LJcN;
    //   23: astore #6
    //   25: aload #6
    //   27: arraylength
    //   28: istore #7
    //   30: iconst_0
    //   31: istore #8
    //   33: iload #8
    //   35: iload #7
    //   37: if_icmpge -> 67
    //   40: aload #6
    //   42: iload #8
    //   44: aaload
    //   45: astore #9
    //   47: aload_0
    //   48: aload #9
    //   50: iload #4
    //   52: iload #5
    //   54: invokevirtual Dne : (LJcN;II)Z
    //   57: ifeq -> 61
    //   60: return
    //   61: iinc #8, 1
    //   64: goto -> 33
    //   67: aload_0
    //   68: iload_1
    //   69: iload_2
    //   70: iload_3
    //   71: invokespecial Dne : (III)V
    //   74: return
  }
  
  private void zGp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LPdb;
    //   4: checkcast FOg
    //   7: astore_1
    //   8: aload_1
    //   9: getfield Dne : Ljava/util/List;
    //   12: invokeinterface clear : ()V
    //   17: getstatic dEr.Dne : [LdEr;
    //   20: astore_2
    //   21: aload_2
    //   22: arraylength
    //   23: istore_3
    //   24: iconst_0
    //   25: istore #4
    //   27: iload #4
    //   29: iload_3
    //   30: if_icmpge -> 76
    //   33: aload_2
    //   34: iload #4
    //   36: aaload
    //   37: astore #5
    //   39: aload #5
    //   41: ifnull -> 70
    //   44: aload #5
    //   46: invokevirtual Dne : ()LJcN;
    //   49: ifnull -> 70
    //   52: aload #5
    //   54: aload #5
    //   56: getfield Qnq : I
    //   59: aconst_null
    //   60: checkcast JcN
    //   63: aload_1
    //   64: getfield Dne : Ljava/util/List;
    //   67: invokevirtual Dne : (ILJcN;Ljava/util/List;)V
    //   70: iinc #4, 1
    //   73: goto -> 27
    //   76: getstatic ycv.Dne : [Lycv;
    //   79: astore #5
    //   81: aload #5
    //   83: arraylength
    //   84: istore_3
    //   85: iconst_0
    //   86: istore #4
    //   88: iload #4
    //   90: iload_3
    //   91: if_icmpge -> 132
    //   94: aload #5
    //   96: iload #4
    //   98: aaload
    //   99: astore #6
    //   101: aload #6
    //   103: ifnull -> 126
    //   106: aload #6
    //   108: getfield Dne : LACj;
    //   111: ifnull -> 126
    //   114: getstatic dEr.Dne : LdpS;
    //   117: aload #6
    //   119: aload_1
    //   120: getfield Dne : Ljava/util/List;
    //   123: invokevirtual Dne : (Lycv;Ljava/util/List;)V
    //   126: iinc #4, 1
    //   129: goto -> 88
    //   132: aload_1
    //   133: getfield Dne : Ljava/util/List;
    //   136: invokeinterface iterator : ()Ljava/util/Iterator;
    //   141: astore #6
    //   143: aload_0
    //   144: getfield Dne : LmHN;
    //   147: invokevirtual Dne : ()Ljava/lang/String;
    //   150: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   153: astore #7
    //   155: aload #6
    //   157: invokeinterface hasNext : ()Z
    //   162: ifeq -> 268
    //   165: aload #6
    //   167: invokeinterface next : ()Ljava/lang/Object;
    //   172: checkcast NMq
    //   175: astore #8
    //   177: iconst_0
    //   178: istore #9
    //   180: aload #8
    //   182: aload_0
    //   183: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   186: getfield Dne : LMJs;
    //   189: aload_0
    //   190: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   193: getfield Dne : LfZI;
    //   196: getfield ooe : Z
    //   199: invokevirtual Dne : (LFiG;Z)Ljava/util/List;
    //   202: invokeinterface iterator : ()Ljava/util/Iterator;
    //   207: astore #10
    //   209: aload #10
    //   211: invokeinterface hasNext : ()Z
    //   216: ifeq -> 250
    //   219: aload #10
    //   221: invokeinterface next : ()Ljava/lang/Object;
    //   226: checkcast java/lang/String
    //   229: astore #11
    //   231: aload #11
    //   233: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   236: aload #7
    //   238: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   241: ifne -> 247
    //   244: goto -> 209
    //   247: iconst_1
    //   248: istore #9
    //   250: iload #9
    //   252: ifne -> 265
    //   255: aload #6
    //   257: invokeinterface remove : ()V
    //   262: goto -> 265
    //   265: goto -> 155
    //   268: aload_0
    //   269: fconst_0
    //   270: putfield Dne : F
    //   273: aload_1
    //   274: fconst_0
    //   275: invokevirtual Dne : (F)V
    //   278: return
  }
  
  protected void Dne(JcN paramJcN) {
    int m;
    boolean bool1 = (paramJcN.Dne() == DyG) ? true : false;
    boolean bool2 = paramJcN.bzF();
    int i = paramJcN.bzF();
    int j = i * 28;
    boolean bool3 = false;
    int k = this.aFZ + 28 * i;
    boolean bool4 = this.zGp;
    byte b = 32;
    if (bool1)
      bool3 += true; 
    if (i == 5) {
      k = this.aFZ + this.Dne - 28;
    } else if (i > 0) {
      k += i;
    } 
    if (bool2) {
      bool4 -= true;
    } else {
      bool3 += true;
      m = bool4 + this.Qnq - 4;
    } 
    GL11.glDisable(2896);
    FWm(k, m, j, bool3, 28, b);
    this.FWm = 100.0F;
    ((eKj)Dne).bzF = 100.0F;
    k += 6;
    m += 8 + (bool2 ? 1 : -1);
    GL11.glEnable(2896);
    GL11.glEnable(32826);
    NMq nMq = new NMq(paramJcN.Dne());
    Dne.FWm((msA)this.Dne, (Snh)((Minecraft)this.Dne).Dne, nMq, k, m);
    Dne.bzF((msA)this.Dne, (Snh)((Minecraft)this.Dne).Dne, nMq, k, m);
    GL11.glDisable(2896);
    ((eKj)Dne).bzF = 0.0F;
    this.FWm = 0.0F;
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (DyG != JcN.zGp.Dne()) {
      if (fZI.Dne(((fZI)((Minecraft)this.Dne).Dne).div)) {
        FWm(JcN.zGp);
      } else {
        super.Dne(paramChar, paramInt);
      } 
    } else {
      if (this.zGp) {
        this.zGp = false;
        this.Dne.Dne("");
      } 
      if (!Dne(paramInt))
        if (this.Dne.Dne(paramChar, paramInt)) {
          zGp();
        } else {
          super.Dne(paramChar, paramInt);
        }  
    } 
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 0)
      this.Dne.Dne(new apb((FkP)((Minecraft)this.Dne).Dne)); 
    if (paramPee.aFZ == 1)
      this.Dne.Dne(new ZyA(this, (FkP)((Minecraft)this.Dne).Dne)); 
  }
  
  public void Dne() {
    if (((Minecraft)this.Dne).Dne.aFZ()) {
      super.Dne();
      this.Dne.clear();
      Keyboard.enableRepeatEvents(true);
      this.Dne = (pam)new mHN((msA)this.Dne, this.aFZ + 82, this.zGp + 6, 89, ((msA)this.Dne).Dne);
      this.Dne.aFZ(15);
      this.Dne.Dne(false);
      this.Dne.aFZ(false);
      this.Dne.zGp(16777215);
      int i = DyG;
      DyG = -1;
      FWm(JcN.Dne[i]);
      this.Dne = (pam)new GpK((Minecraft)this.Dne);
      ((Minecraft)this.Dne).Dne.Dne.Dne((mXX)this.Dne);
    } else {
      this.Dne.Dne(new gTB(((Minecraft)this.Dne).Dne));
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VXB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */