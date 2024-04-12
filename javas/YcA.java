import org.lwjgl.opengl.GL11;

public class YcA extends qVZ {
  private int Dne;
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    Dne(0, 0, this.FWm, this.bzF, 1615855616, -1602211792);
    GL11.glPushMatrix();
    GL11.glScalef(2.0F, 2.0F, 2.0F);
    boolean bool = this.Dne.Dne.Dne().Qnq();
    String str = bool ? KGL.Dne("deathScreen.title.hardcore") : KGL.Dne("deathScreen.title");
    Dne(this.Dne, str, this.FWm / 2 / 2, 30, 16777215);
    GL11.glPopMatrix();
    if (bool)
      Dne(this.Dne, KGL.Dne("deathScreen.hardcoreInfo"), this.FWm / 2, 144, 16777215); 
    Dne(this.Dne, KGL.Dne("deathScreen.score") + ": " + Dne.ooe + this.Dne.Dne.Vxn(), this.FWm / 2, 100, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial bzF : ()V
    //   4: aload_0
    //   5: dup
    //   6: getfield Dne : I
    //   9: iconst_1
    //   10: iadd
    //   11: putfield Dne : I
    //   14: aload_0
    //   15: getfield Dne : I
    //   18: bipush #20
    //   20: if_icmpne -> 60
    //   23: aload_0
    //   24: getfield Dne : Ljava/util/List;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore_2
    //   33: aload_2
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 60
    //   42: aload_2
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast Pee
    //   51: astore_1
    //   52: aload_1
    //   53: iconst_1
    //   54: putfield Dne : Z
    //   57: goto -> 33
    //   60: return
  }
  
  public boolean Dne() {
    return false;
  }
  
  protected void Dne(char paramChar, int paramInt) {}
  
  protected void Dne(Pee paramPee) {
    switch (paramPee.aFZ) {
      case 1:
        this.Dne.Dne.Qnq();
        this.Dne.Dne((qVZ)null);
        break;
      case 2:
        this.Dne.Dne.IjH();
        this.Dne.Dne((VzZ)null);
        this.Dne.Dne(new MKS());
        break;
    } 
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface clear : ()V
    //   9: aload_0
    //   10: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   13: getfield Dne : LVzZ;
    //   16: invokevirtual Dne : ()LxoY;
    //   19: invokevirtual Qnq : ()Z
    //   22: ifeq -> 123
    //   25: aload_0
    //   26: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   29: invokevirtual zGp : ()Z
    //   32: ifeq -> 79
    //   35: aload_0
    //   36: getfield Dne : Ljava/util/List;
    //   39: new Pee
    //   42: dup
    //   43: iconst_1
    //   44: aload_0
    //   45: getfield FWm : I
    //   48: iconst_2
    //   49: idiv
    //   50: bipush #100
    //   52: isub
    //   53: aload_0
    //   54: getfield bzF : I
    //   57: iconst_4
    //   58: idiv
    //   59: bipush #96
    //   61: iadd
    //   62: ldc 'deathScreen.deleteWorld'
    //   64: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   67: invokespecial <init> : (IIILjava/lang/String;)V
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: goto -> 232
    //   79: aload_0
    //   80: getfield Dne : Ljava/util/List;
    //   83: new Pee
    //   86: dup
    //   87: iconst_1
    //   88: aload_0
    //   89: getfield FWm : I
    //   92: iconst_2
    //   93: idiv
    //   94: bipush #100
    //   96: isub
    //   97: aload_0
    //   98: getfield bzF : I
    //   101: iconst_4
    //   102: idiv
    //   103: bipush #96
    //   105: iadd
    //   106: ldc 'deathScreen.leaveServer'
    //   108: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   111: invokespecial <init> : (IIILjava/lang/String;)V
    //   114: invokeinterface add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: goto -> 232
    //   123: aload_0
    //   124: getfield Dne : Ljava/util/List;
    //   127: new Pee
    //   130: dup
    //   131: iconst_1
    //   132: aload_0
    //   133: getfield FWm : I
    //   136: iconst_2
    //   137: idiv
    //   138: bipush #100
    //   140: isub
    //   141: aload_0
    //   142: getfield bzF : I
    //   145: iconst_4
    //   146: idiv
    //   147: bipush #72
    //   149: iadd
    //   150: ldc 'deathScreen.respawn'
    //   152: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   155: invokespecial <init> : (IIILjava/lang/String;)V
    //   158: invokeinterface add : (Ljava/lang/Object;)Z
    //   163: pop
    //   164: aload_0
    //   165: getfield Dne : Ljava/util/List;
    //   168: new Pee
    //   171: dup
    //   172: iconst_2
    //   173: aload_0
    //   174: getfield FWm : I
    //   177: iconst_2
    //   178: idiv
    //   179: bipush #100
    //   181: isub
    //   182: aload_0
    //   183: getfield bzF : I
    //   186: iconst_4
    //   187: idiv
    //   188: bipush #96
    //   190: iadd
    //   191: ldc 'deathScreen.titleScreen'
    //   193: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   196: invokespecial <init> : (IIILjava/lang/String;)V
    //   199: invokeinterface add : (Ljava/lang/Object;)Z
    //   204: pop
    //   205: aload_0
    //   206: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   209: getfield Dne : LvwN;
    //   212: ifnonnull -> 232
    //   215: aload_0
    //   216: getfield Dne : Ljava/util/List;
    //   219: iconst_1
    //   220: invokeinterface get : (I)Ljava/lang/Object;
    //   225: checkcast Pee
    //   228: iconst_0
    //   229: putfield Dne : Z
    //   232: aload_0
    //   233: getfield Dne : Ljava/util/List;
    //   236: invokeinterface iterator : ()Ljava/util/Iterator;
    //   241: astore_2
    //   242: aload_2
    //   243: invokeinterface hasNext : ()Z
    //   248: ifeq -> 269
    //   251: aload_2
    //   252: invokeinterface next : ()Ljava/lang/Object;
    //   257: checkcast Pee
    //   260: astore_1
    //   261: aload_1
    //   262: iconst_0
    //   263: putfield Dne : Z
    //   266: goto -> 242
    //   269: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YcA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */