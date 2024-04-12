import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class LOM extends LSv {
  final TEn Dne;
  
  public int Dne;
  
  private void bzF(int paramInt1, int paramInt2) {
    FWm(paramInt1, paramInt2, 0, 0);
  }
  
  protected boolean Dne(int paramInt) {
    return (paramInt == this.Dne);
  }
  
  public LOM(TEn paramTEn) {
    super((Minecraft)paramTEn.Dne, paramTEn.FWm, paramTEn.bzF, 80, paramTEn.bzF - 37, 24);
    this.Dne = paramTEn;
    this.Dne = -1;
  }
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3) {
    bzF(paramInt1 + 1, paramInt2 + 1);
    GL11.glEnable(32826);
    Cit.bzF();
    TEn.Dne().Dne((msA)this.Dne.Dne, ((Minecraft)this.Dne.Dne).Dne, new NMq(paramInt3, 1, 0), paramInt1 + 2, paramInt2 + 2);
    Cit.Dne();
    GL11.glDisable(32826);
  }
  
  protected void Dne() {}
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: fconst_1
    //   1: fconst_1
    //   2: fconst_1
    //   3: fconst_1
    //   4: invokestatic glColor4f : (FFFF)V
    //   7: aload_0
    //   8: getfield Dne : LTEn;
    //   11: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   14: getfield Dne : LSnh;
    //   17: ldc '/gui/slot.png'
    //   19: invokevirtual Dne : (Ljava/lang/String;)V
    //   22: getstatic WAR.Dne : LWAR;
    //   25: astore #5
    //   27: aload #5
    //   29: invokevirtual Dne : ()V
    //   32: aload #5
    //   34: iload_1
    //   35: iconst_0
    //   36: iadd
    //   37: i2d
    //   38: iload_2
    //   39: bipush #18
    //   41: iadd
    //   42: i2d
    //   43: aload_0
    //   44: getfield Dne : LTEn;
    //   47: getfield FWm : F
    //   50: f2d
    //   51: iload_3
    //   52: iconst_0
    //   53: iadd
    //   54: i2f
    //   55: ldc 0.0078125
    //   57: fmul
    //   58: f2d
    //   59: iload #4
    //   61: bipush #18
    //   63: iadd
    //   64: i2f
    //   65: ldc 0.0078125
    //   67: fmul
    //   68: f2d
    //   69: invokevirtual Dne : (DDDDD)V
    //   72: aload #5
    //   74: iload_1
    //   75: bipush #18
    //   77: iadd
    //   78: i2d
    //   79: iload_2
    //   80: bipush #18
    //   82: iadd
    //   83: i2d
    //   84: aload_0
    //   85: getfield Dne : LTEn;
    //   88: getfield FWm : F
    //   91: f2d
    //   92: iload_3
    //   93: bipush #18
    //   95: iadd
    //   96: i2f
    //   97: ldc 0.0078125
    //   99: fmul
    //   100: f2d
    //   101: iload #4
    //   103: bipush #18
    //   105: iadd
    //   106: i2f
    //   107: ldc 0.0078125
    //   109: fmul
    //   110: f2d
    //   111: invokevirtual Dne : (DDDDD)V
    //   114: aload #5
    //   116: iload_1
    //   117: bipush #18
    //   119: iadd
    //   120: i2d
    //   121: iload_2
    //   122: iconst_0
    //   123: iadd
    //   124: i2d
    //   125: aload_0
    //   126: getfield Dne : LTEn;
    //   129: getfield FWm : F
    //   132: f2d
    //   133: iload_3
    //   134: bipush #18
    //   136: iadd
    //   137: i2f
    //   138: ldc 0.0078125
    //   140: fmul
    //   141: f2d
    //   142: iload #4
    //   144: iconst_0
    //   145: iadd
    //   146: i2f
    //   147: ldc 0.0078125
    //   149: fmul
    //   150: f2d
    //   151: invokevirtual Dne : (DDDDD)V
    //   154: aload #5
    //   156: iload_1
    //   157: iconst_0
    //   158: iadd
    //   159: i2d
    //   160: iload_2
    //   161: iconst_0
    //   162: iadd
    //   163: i2d
    //   164: aload_0
    //   165: getfield Dne : LTEn;
    //   168: getfield FWm : F
    //   171: f2d
    //   172: iload_3
    //   173: iconst_0
    //   174: iadd
    //   175: i2f
    //   176: ldc 0.0078125
    //   178: fmul
    //   179: f2d
    //   180: iload #4
    //   182: iconst_0
    //   183: iadd
    //   184: i2f
    //   185: ldc 0.0078125
    //   187: fmul
    //   188: f2d
    //   189: invokevirtual Dne : (DDDDD)V
    //   192: aload #5
    //   194: invokevirtual Dne : ()I
    //   197: pop
    //   198: return
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    hZu hZu = TEn.Dne().get(paramInt1);
    Dne(paramInt2, paramInt3, hZu.Dne);
    this.Dne.Dne.FWm(hZu.Dne, paramInt2 + 18 + 5, paramInt3 + 6, 16777215);
  }
  
  protected int Dne() {
    return TEn.Dne().size();
  }
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield Dne : I
    //   5: aload_0
    //   6: getfield Dne : LTEn;
    //   9: invokevirtual zGp : ()V
    //   12: aload_0
    //   13: getfield Dne : LTEn;
    //   16: invokestatic Dne : (LTEn;)LmHN;
    //   19: invokestatic Dne : ()Ljava/util/List;
    //   22: aload_0
    //   23: getfield Dne : LTEn;
    //   26: invokestatic Dne : (LTEn;)LLOM;
    //   29: getfield Dne : I
    //   32: invokeinterface get : (I)Ljava/lang/Object;
    //   37: checkcast hZu
    //   40: getfield FWm : Ljava/lang/String;
    //   43: invokevirtual Dne : (Ljava/lang/String;)V
    //   46: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LOM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */