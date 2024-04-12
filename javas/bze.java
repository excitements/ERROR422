public class bze extends qVZ {
  private int Qnq = 0;
  
  private int Dne = 0;
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    Dne(this.Dne, "Game menu", this.FWm / 2, 40, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void bzF() {
    super.bzF();
    this.Qnq++;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield Dne : I
    //   5: aload_0
    //   6: getfield Dne : Ljava/util/List;
    //   9: invokeinterface clear : ()V
    //   14: bipush #-16
    //   16: istore_1
    //   17: aload_0
    //   18: getfield Dne : Ljava/util/List;
    //   21: new Pee
    //   24: dup
    //   25: iconst_1
    //   26: aload_0
    //   27: getfield FWm : I
    //   30: iconst_2
    //   31: idiv
    //   32: bipush #100
    //   34: isub
    //   35: aload_0
    //   36: getfield bzF : I
    //   39: iconst_4
    //   40: idiv
    //   41: bipush #120
    //   43: iadd
    //   44: iload_1
    //   45: iadd
    //   46: ldc 'menu.returnToMenu'
    //   48: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   51: invokespecial <init> : (IIILjava/lang/String;)V
    //   54: invokeinterface add : (Ljava/lang/Object;)Z
    //   59: pop
    //   60: aload_0
    //   61: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   64: invokevirtual zGp : ()Z
    //   67: ifne -> 91
    //   70: aload_0
    //   71: getfield Dne : Ljava/util/List;
    //   74: iconst_0
    //   75: invokeinterface get : (I)Ljava/lang/Object;
    //   80: checkcast Pee
    //   83: ldc 'menu.disconnect'
    //   85: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   88: putfield Dne : Ljava/lang/String;
    //   91: aload_0
    //   92: getfield Dne : Ljava/util/List;
    //   95: new Pee
    //   98: dup
    //   99: iconst_4
    //   100: aload_0
    //   101: getfield FWm : I
    //   104: iconst_2
    //   105: idiv
    //   106: bipush #100
    //   108: isub
    //   109: aload_0
    //   110: getfield bzF : I
    //   113: iconst_4
    //   114: idiv
    //   115: bipush #24
    //   117: iadd
    //   118: iload_1
    //   119: iadd
    //   120: ldc 'menu.returnToGame'
    //   122: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   125: invokespecial <init> : (IIILjava/lang/String;)V
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: aload_0
    //   135: getfield Dne : Ljava/util/List;
    //   138: new Pee
    //   141: dup
    //   142: iconst_0
    //   143: aload_0
    //   144: getfield FWm : I
    //   147: iconst_2
    //   148: idiv
    //   149: bipush #100
    //   151: isub
    //   152: aload_0
    //   153: getfield bzF : I
    //   156: iconst_4
    //   157: idiv
    //   158: bipush #96
    //   160: iadd
    //   161: iload_1
    //   162: iadd
    //   163: bipush #98
    //   165: bipush #20
    //   167: ldc 'menu.options'
    //   169: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   172: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: aload_0
    //   182: getfield Dne : Ljava/util/List;
    //   185: new Pee
    //   188: dup
    //   189: bipush #7
    //   191: aload_0
    //   192: getfield FWm : I
    //   195: iconst_2
    //   196: idiv
    //   197: iconst_2
    //   198: iadd
    //   199: aload_0
    //   200: getfield bzF : I
    //   203: iconst_4
    //   204: idiv
    //   205: bipush #96
    //   207: iadd
    //   208: iload_1
    //   209: iadd
    //   210: bipush #98
    //   212: bipush #20
    //   214: ldc 'HostException'
    //   216: iconst_0
    //   217: invokespecial <init> : (IIIIILjava/lang/String;Z)V
    //   220: dup
    //   221: astore_2
    //   222: invokeinterface add : (Ljava/lang/Object;)Z
    //   227: pop
    //   228: aload_0
    //   229: getfield Dne : Ljava/util/List;
    //   232: new Pee
    //   235: dup
    //   236: iconst_5
    //   237: aload_0
    //   238: getfield FWm : I
    //   241: iconst_2
    //   242: idiv
    //   243: bipush #100
    //   245: isub
    //   246: aload_0
    //   247: getfield bzF : I
    //   250: iconst_4
    //   251: idiv
    //   252: bipush #48
    //   254: iadd
    //   255: iload_1
    //   256: iadd
    //   257: bipush #98
    //   259: bipush #20
    //   261: ldc 'gui.achievements'
    //   263: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   266: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   269: invokeinterface add : (Ljava/lang/Object;)Z
    //   274: pop
    //   275: aload_0
    //   276: getfield Dne : Ljava/util/List;
    //   279: new Pee
    //   282: dup
    //   283: bipush #6
    //   285: aload_0
    //   286: getfield FWm : I
    //   289: iconst_2
    //   290: idiv
    //   291: iconst_2
    //   292: iadd
    //   293: aload_0
    //   294: getfield bzF : I
    //   297: iconst_4
    //   298: idiv
    //   299: bipush #48
    //   301: iadd
    //   302: iload_1
    //   303: iadd
    //   304: bipush #98
    //   306: bipush #20
    //   308: ldc 'gui.stats'
    //   310: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   313: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   316: invokeinterface add : (Ljava/lang/Object;)Z
    //   321: pop
    //   322: return
  }
  
  protected void Dne(Pee paramPee) {
    switch (paramPee.aFZ) {
      case 0:
        this.Dne.Dne(new uqy(this, this.Dne.Dne));
      case 1:
        paramPee.Dne = Character.MIN_VALUE;
        this.Dne.Dne.Dne(trP.aFZ, 1);
        this.Dne.Dne.IjH();
        this.Dne.Dne((VzZ)null);
        this.Dne.Dne(new MKS());
      default:
        return;
      case 4:
        this.Dne.Dne((qVZ)null);
        this.Dne.aFZ();
        this.Dne.Dne.zGp();
      case 5:
        this.Dne.Dne(new apb((FkP)this.Dne.Dne));
      case 6:
        this.Dne.Dne(new ZyA(this, (FkP)this.Dne.Dne));
      case 7:
        break;
    } 
    this.Dne.Dne(new VCO(this));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */