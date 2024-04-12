import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class KHk extends LSv {
  public int Dne;
  
  final hcj Dne;
  
  public KHk(hcj paramhcj) {
    super((Minecraft)paramhcj.Dne, paramhcj.FWm, paramhcj.bzF, 43, paramhcj.bzF - 60, 24);
    this.Dne = paramhcj;
    this.Dne = -1;
  }
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: fconst_1
    //   1: fconst_1
    //   2: fconst_1
    //   3: fconst_1
    //   4: invokestatic glColor4f : (FFFF)V
    //   7: aload_0
    //   8: getfield Dne : Lhcj;
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
    //   44: getfield Dne : Lhcj;
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
    //   85: getfield Dne : Lhcj;
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
    //   126: getfield Dne : Lhcj;
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
    //   165: getfield Dne : Lhcj;
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
  
  private void bzF(int paramInt1, int paramInt2) {
    FWm(paramInt1, paramInt2, 0, 0);
  }
  
  private void Dne(int paramInt1, int paramInt2, NMq paramNMq) {
    bzF(paramInt1 + 1, paramInt2 + 1);
    GL11.glEnable(32826);
    if (paramNMq != null) {
      Cit.bzF();
      hcj.Dne().Dne((msA)this.Dne.Dne, ((Minecraft)this.Dne.Dne).Dne, paramNMq, paramInt1 + 2, paramInt2 + 2);
      Cit.Dne();
    } 
    GL11.glDisable(32826);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    String str2;
    Jjb jjb = hcj.Dne(this.Dne).Dne().get(hcj.Dne(this.Dne).Dne().size() - paramInt1 - 1);
    NMq nMq = (jjb.FWm() == 0) ? null : new NMq(jjb.FWm(), 1, jjb.bzF());
    String str1 = (nMq == null) ? "Air" : dEr.Dne[jjb.FWm()].bzF(nMq);
    Dne(paramInt2, paramInt3, nMq);
    this.Dne.Dne.FWm(str1, paramInt2 + 18 + 5, paramInt3 + 3, 16777215);
    if (paramInt1 == 0) {
      str2 = KGL.Dne("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(jjb.Dne()) });
    } else if (paramInt1 == hcj.Dne(this.Dne).Dne().size() - 1) {
      str2 = KGL.Dne("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(jjb.Dne()) });
    } else {
      str2 = KGL.Dne("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(jjb.Dne()) });
    } 
    this.Dne.Dne.FWm(str2, paramInt2 + 2 + 213 - this.Dne.Dne.Dne(str2), paramInt3 + 3, 16777215);
  }
  
  protected int FWm() {
    return this.Dne.FWm - 70;
  }
  
  protected int Dne() {
    return hcj.Dne(this.Dne).Dne().size();
  }
  
  protected void Dne() {}
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    this.Dne = paramInt;
    this.Dne.c_();
  }
  
  protected boolean Dne(int paramInt) {
    return (paramInt == this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KHk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */