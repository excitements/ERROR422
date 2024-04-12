import java.io.File;
import java.io.IOException;
import net.minecraft.client.Minecraft;

public class zHD extends Jwh {
  private boolean FWm;
  
  private liB Dne;
  
  private final mrb Dne;
  
  private final Minecraft Dne;
  
  private final dLs Dne;
  
  private TWE Dne;
  
  private boolean Dne = new WQU("Minecraft-Server", " [SERVER]", (new File(Minecraft.Dne(), "output-server.log")).getAbsolutePath());
  
  public boolean DyG() {
    return true;
  }
  
  public void h_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: istore_1
    //   5: aload_0
    //   6: aload_0
    //   7: getfield Dne : LliB;
    //   10: invokevirtual Dne : ()Z
    //   13: putfield Dne : Z
    //   16: iload_1
    //   17: ifne -> 50
    //   20: aload_0
    //   21: getfield Dne : Z
    //   24: ifeq -> 50
    //   27: aload_0
    //   28: getfield Dne : LdLs;
    //   31: ldc 'Saving and pausing game...'
    //   33: invokeinterface Dne : (Ljava/lang/String;)V
    //   38: aload_0
    //   39: invokevirtual Dne : ()LdzN;
    //   42: invokevirtual FWm : ()V
    //   45: aload_0
    //   46: iconst_0
    //   47: invokevirtual Dne : (Z)V
    //   50: aload_0
    //   51: getfield Dne : Z
    //   54: ifne -> 61
    //   57: aload_0
    //   58: invokespecial h_ : ()V
    //   61: return
  }
  
  public zHD(Minecraft paramMinecraft, String paramString1, String paramString2, mrb parammrb) {
    super(new File(Minecraft.Dne(), "saves"));
    this.Dne = false;
    div(paramMinecraft.Dne.Dne);
    IjH(paramString1);
    mrb(paramString2);
    FWm(paramMinecraft.Dne());
    bzF(parammrb.Dne());
    bzF(256);
    Dne(new Rfd(this));
    this.Dne = paramMinecraft;
    this.Dne = parammrb;
    try {
      this.Dne = new liB(this);
    } catch (IOException iOException) {
      throw new Error();
    } 
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial bzF : ()V
    //   4: aload_0
    //   5: getfield Dne : LTWE;
    //   8: ifnull -> 23
    //   11: aload_0
    //   12: getfield Dne : LTWE;
    //   15: invokevirtual interrupt : ()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield Dne : LTWE;
    //   23: return
  }
  
  protected File Dne() {
    return (File)this.Dne.Dne;
  }
  
  public boolean c_() {
    return this.FWm;
  }
  
  public String Dne(XHL paramXHL, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LliB;
    //   4: invokevirtual Dne : ()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: invokevirtual Dne : ()LdLs;
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: ldc 'Started on '
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: aload_3
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual toString : ()Ljava/lang/String;
    //   31: invokeinterface Dne : (Ljava/lang/String;)V
    //   36: aload_0
    //   37: iconst_1
    //   38: putfield FWm : Z
    //   41: aload_0
    //   42: new TWE
    //   45: dup
    //   46: aload_0
    //   47: invokevirtual kGO : ()Ljava/lang/String;
    //   50: aload_3
    //   51: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   54: putfield Dne : LTWE;
    //   57: aload_0
    //   58: getfield Dne : LTWE;
    //   61: invokevirtual start : ()V
    //   64: aload_0
    //   65: invokevirtual Dne : ()LdzN;
    //   68: aload_1
    //   69: invokevirtual Dne : (LXHL;)V
    //   72: aload_0
    //   73: invokevirtual Dne : ()LdzN;
    //   76: iload_2
    //   77: invokevirtual FWm : (Z)V
    //   80: aload_3
    //   81: areturn
    //   82: astore_3
    //   83: aconst_null
    //   84: areturn
    // Exception table:
    //   from	to	target	type
    //   0	81	82	java/io/IOException
  }
  
  public boolean aFZ() {
    return Minecraft.Dne().aFZ();
  }
  
  public liB Dne() {
    return this.Dne;
  }
  
  public void Dne(XHL paramXHL) {
    Dne().Dne(paramXHL);
  }
  
  public int Dne() {
    return ((fZI)this.Dne.Dne).DyG;
  }
  
  public dLs Dne() {
    return this.Dne;
  }
  
  public boolean bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lmrb;
    //   4: invokevirtual FWm : ()Z
    //   7: ireturn
  }
  
  public McM Dne(McM paramMcM) {
    paramMcM = super.Dne(paramMcM);
    paramMcM.Dne().Dne("Type", new xZO(this));
    paramMcM.Dne().Dne("Is Modded", new Aha(this));
    return paramMcM;
  }
  
  public void Dne(evf paramevf) {
    super.Dne(paramevf);
    paramevf.Dne("snooper_partner", this.Dne.Dne().Dne());
  }
  
  protected void Dne(McM paramMcM) {
    this.Dne.FWm(paramMcM);
  }
  
  public boolean Qnq() {
    return false;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LTWE;
    //   8: ifnull -> 23
    //   11: aload_0
    //   12: getfield Dne : LTWE;
    //   15: invokevirtual interrupt : ()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield Dne : LTWE;
    //   23: return
  }
  
  public NuQ Dne() {
    return Dne();
  }
  
  protected void Dne(String paramString1, String paramString2, long paramLong, kGO paramkGO, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual aFZ : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: iconst_3
    //   7: anewarray RAN
    //   10: putfield Dne : [LRAN;
    //   13: aload_0
    //   14: aload_0
    //   15: getfield Dne : [LRAN;
    //   18: arraylength
    //   19: bipush #100
    //   21: multianewarray[[J 2
    //   25: putfield Dne : [[J
    //   28: aload_0
    //   29: invokevirtual Dne : ()LYiY;
    //   32: aload_1
    //   33: iconst_1
    //   34: invokeinterface Dne : (Ljava/lang/String;Z)LiDE;
    //   39: astore #7
    //   41: iconst_0
    //   42: istore #8
    //   44: iload #8
    //   46: aload_0
    //   47: getfield Dne : [LRAN;
    //   50: arraylength
    //   51: if_icmpge -> 233
    //   54: iconst_0
    //   55: istore #9
    //   57: iload #8
    //   59: iconst_1
    //   60: if_icmpne -> 66
    //   63: iconst_m1
    //   64: istore #9
    //   66: iload #8
    //   68: iconst_2
    //   69: if_icmpne -> 75
    //   72: iconst_1
    //   73: istore #9
    //   75: iload #8
    //   77: ifne -> 153
    //   80: aload_0
    //   81: invokevirtual kGO : ()Z
    //   84: ifeq -> 118
    //   87: aload_0
    //   88: getfield Dne : [LRAN;
    //   91: iload #8
    //   93: new Kqb
    //   96: dup
    //   97: aload_0
    //   98: aload #7
    //   100: aload_2
    //   101: iload #9
    //   103: aload_0
    //   104: getfield Dne : LBkx;
    //   107: aload_0
    //   108: invokevirtual Dne : ()LdLs;
    //   111: invokespecial <init> : (LJwh;LiDE;Ljava/lang/String;ILBkx;LdLs;)V
    //   114: aastore
    //   115: goto -> 191
    //   118: aload_0
    //   119: getfield Dne : [LRAN;
    //   122: iload #8
    //   124: new RAN
    //   127: dup
    //   128: aload_0
    //   129: aload #7
    //   131: aload_2
    //   132: iload #9
    //   134: aload_0
    //   135: getfield Dne : Lmrb;
    //   138: aload_0
    //   139: getfield Dne : LBkx;
    //   142: aload_0
    //   143: invokevirtual Dne : ()LdLs;
    //   146: invokespecial <init> : (LJwh;LiDE;Ljava/lang/String;ILmrb;LBkx;LdLs;)V
    //   149: aastore
    //   150: goto -> 191
    //   153: aload_0
    //   154: getfield Dne : [LRAN;
    //   157: iload #8
    //   159: new jgd
    //   162: dup
    //   163: aload_0
    //   164: aload #7
    //   166: aload_2
    //   167: iload #9
    //   169: aload_0
    //   170: getfield Dne : Lmrb;
    //   173: aload_0
    //   174: getfield Dne : [LRAN;
    //   177: iconst_0
    //   178: aaload
    //   179: aload_0
    //   180: getfield Dne : LBkx;
    //   183: aload_0
    //   184: invokevirtual Dne : ()LdLs;
    //   187: invokespecial <init> : (LJwh;LiDE;Ljava/lang/String;ILmrb;LRAN;LBkx;LdLs;)V
    //   190: aastore
    //   191: aload_0
    //   192: getfield Dne : [LRAN;
    //   195: iload #8
    //   197: aaload
    //   198: new vSE
    //   201: dup
    //   202: aload_0
    //   203: aload_0
    //   204: getfield Dne : [LRAN;
    //   207: iload #8
    //   209: aaload
    //   210: invokespecial <init> : (LJwh;LRAN;)V
    //   213: invokevirtual Dne : (LIjH;)V
    //   216: aload_0
    //   217: invokevirtual Dne : ()LdzN;
    //   220: aload_0
    //   221: getfield Dne : [LRAN;
    //   224: invokevirtual Dne : ([LRAN;)V
    //   227: iinc #8, 1
    //   230: goto -> 44
    //   233: aload_0
    //   234: aload_0
    //   235: invokevirtual Dne : ()I
    //   238: invokevirtual FWm : (I)V
    //   241: aload_0
    //   242: invokevirtual DyG : ()V
    //   245: return
  }
  
  public XHL Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lmrb;
    //   4: invokevirtual Dne : ()LXHL;
    //   7: areturn
  }
  
  protected boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LdLs;
    //   4: ldc_w 'Starting integrated minecraft server version UNKNOWN'
    //   7: invokeinterface Dne : (Ljava/lang/String;)V
    //   12: aload_0
    //   13: iconst_0
    //   14: invokevirtual Qnq : (Z)V
    //   17: aload_0
    //   18: iconst_1
    //   19: invokevirtual aFZ : (Z)V
    //   22: aload_0
    //   23: iconst_1
    //   24: invokevirtual zGp : (Z)V
    //   27: aload_0
    //   28: iconst_1
    //   29: invokevirtual DyG : (Z)V
    //   32: aload_0
    //   33: iconst_1
    //   34: invokevirtual div : (Z)V
    //   37: aload_0
    //   38: getfield Dne : LdLs;
    //   41: ldc_w 'Generating keypair'
    //   44: invokeinterface Dne : (Ljava/lang/String;)V
    //   49: aload_0
    //   50: invokestatic Dne : ()Ljava/security/KeyPair;
    //   53: invokevirtual Dne : (Ljava/security/KeyPair;)V
    //   56: aload_0
    //   57: aload_0
    //   58: invokevirtual aFZ : ()Ljava/lang/String;
    //   61: aload_0
    //   62: invokevirtual XHL : ()Ljava/lang/String;
    //   65: aload_0
    //   66: getfield Dne : Lmrb;
    //   69: invokevirtual Dne : ()J
    //   72: aload_0
    //   73: getfield Dne : Lmrb;
    //   76: invokevirtual Dne : ()LkGO;
    //   79: aload_0
    //   80: getfield Dne : Lmrb;
    //   83: invokevirtual Dne : ()Ljava/lang/String;
    //   86: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;JLkGO;Ljava/lang/String;)V
    //   89: aload_0
    //   90: new java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial <init> : ()V
    //   97: aload_0
    //   98: invokevirtual mrb : ()Ljava/lang/String;
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: ldc_w ' - '
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: aload_0
    //   111: getfield Dne : [LRAN;
    //   114: iconst_0
    //   115: aaload
    //   116: invokevirtual Dne : ()LxoY;
    //   119: invokevirtual Dne : ()Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual toString : ()Ljava/lang/String;
    //   128: invokevirtual Zpi : (Ljava/lang/String;)V
    //   131: iconst_1
    //   132: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zHD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */