import org.lwjgl.opengl.GL11;

class TIk extends lSb {
  final wWl Dne;
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    if (paramInt1 < wWl.Dne(this.Dne).size())
      FWm(paramInt1, paramInt2, paramInt3, paramInt4, paramWAR); 
  }
  
  protected int FWm() {
    return Dne() * 36;
  }
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield Dne : LwWl;
    //   5: invokestatic Dne : (LwWl;)Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: if_icmpge -> 143
    //   16: aload_0
    //   17: getfield Dne : LwWl;
    //   20: iload_1
    //   21: invokestatic FWm : (LwWl;I)I
    //   24: pop
    //   25: aload_0
    //   26: getfield Dne : LwWl;
    //   29: invokestatic Dne : (LwWl;)Ljava/util/List;
    //   32: aload_0
    //   33: getfield Dne : LwWl;
    //   36: invokestatic Dne : (LwWl;)I
    //   39: invokeinterface get : (I)Ljava/lang/Object;
    //   44: checkcast muh
    //   47: astore_3
    //   48: aload_0
    //   49: getfield Dne : LwWl;
    //   52: invokestatic Dne : (LwWl;)LPee;
    //   55: aload_0
    //   56: getfield Dne : LwWl;
    //   59: invokestatic bzF : (LwWl;)Lnet/minecraft/client/Minecraft;
    //   62: getfield Dne : LvwN;
    //   65: getfield Dne : Ljava/lang/String;
    //   68: aload_3
    //   69: getfield Qnq : Ljava/lang/String;
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: putfield Dne : Z
    //   78: aload_0
    //   79: getfield Dne : LwWl;
    //   82: invokestatic FWm : (LwWl;)LPee;
    //   85: aload_3
    //   86: getfield bzF : Ljava/lang/String;
    //   89: ldc 'OPEN'
    //   91: invokevirtual equals : (Ljava/lang/Object;)Z
    //   94: ifeq -> 108
    //   97: aload_3
    //   98: getfield Dne : Z
    //   101: ifne -> 108
    //   104: iconst_1
    //   105: goto -> 109
    //   108: iconst_0
    //   109: putfield Dne : Z
    //   112: iload_2
    //   113: ifeq -> 143
    //   116: aload_0
    //   117: getfield Dne : LwWl;
    //   120: invokestatic FWm : (LwWl;)LPee;
    //   123: getfield Dne : Z
    //   126: ifeq -> 143
    //   129: aload_0
    //   130: getfield Dne : LwWl;
    //   133: aload_0
    //   134: getfield Dne : LwWl;
    //   137: invokestatic Dne : (LwWl;)I
    //   140: invokestatic Dne : (LwWl;I)V
    //   143: return
  }
  
  protected boolean Dne(int paramInt) {
    return (paramInt == wWl.Dne(this.Dne));
  }
  
  protected int Dne() {
    return wWl.Dne(this.Dne).size() + 1;
  }
  
  protected void Dne() {
    this.Dne.aFZ();
  }
  
  public TIk(wWl paramwWl) {
    super(wWl.FWm(paramwWl), paramwWl.FWm, paramwWl.bzF, 32, paramwWl.bzF - 64, 36);
    this.Dne = paramwWl;
  }
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3, muh parammuh) {
    if (parammuh.aFZ != null) {
      synchronized (wWl.Dne()) {
        if (wWl.Dne() < 5 && (parammuh.FWm == 0L || parammuh.bzF))
          (new dvr(this, parammuh)).start(); 
      } 
      boolean bool1 = (parammuh.FWm > 61) ? true : false;
      boolean bool2 = (parammuh.FWm < 61) ? true : false;
      boolean bool3 = (bool1 || bool2) ? true : false;
      if (parammuh.DyG != null)
        this.Dne.FWm(wWl.Qnq(this.Dne), parammuh.DyG, paramInt2 + 215 - wWl.aFZ(this.Dne).Dne(parammuh.DyG), paramInt3 + 1, 8421504); 
      if (bool3) {
        String str1 = Dne.aFZ + parammuh.zGp;
        this.Dne.FWm(wWl.zGp(this.Dne), str1, paramInt2 + 200 - wWl.DyG(this.Dne).Dne(str1), paramInt3 + 1, 8421504);
      } 
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      (wWl.zGp(this.Dne)).Dne.Dne("/gui/icons.png");
      byte b1 = 0;
      boolean bool4 = false;
      String str = null;
      if (bool3) {
        str = bool1 ? "Client out of date!" : "Server out of date!";
        byte b = 5;
        this.Dne.FWm(paramInt2 + 205, paramInt3, b1 * 10, 176 + b * 8, 10, 8);
      } 
      byte b2 = 4;
      if (this.Qnq >= paramInt2 + 205 - b2 && this.aFZ >= paramInt3 - b2 && this.Qnq <= paramInt2 + 205 + 10 + b2 && this.aFZ <= paramInt3 + 8 + b2)
        wWl.Dne(this.Dne, str); 
    } 
  }
  
  protected boolean FWm(int paramInt) {
    return (paramInt < wWl.Dne(this.Dne).size() && ((muh)wWl.Dne(this.Dne).get(paramInt)).Qnq.toLowerCase().equals((wWl.Qnq(this.Dne)).Dne.Dne));
  }
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LwWl;
    //   4: invokestatic Dne : (LwWl;)Ljava/util/List;
    //   7: iload_1
    //   8: invokeinterface get : (I)Ljava/lang/Object;
    //   13: checkcast muh
    //   16: astore #6
    //   18: aload_0
    //   19: getfield Dne : LwWl;
    //   22: aload_0
    //   23: getfield Dne : LwWl;
    //   26: invokestatic Dne : (LwWl;)LmsA;
    //   29: aload #6
    //   31: invokevirtual FWm : ()Ljava/lang/String;
    //   34: iload_2
    //   35: iconst_2
    //   36: iadd
    //   37: iload_3
    //   38: iconst_1
    //   39: iadd
    //   40: ldc 16777215
    //   42: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   45: sipush #207
    //   48: istore #7
    //   50: iconst_1
    //   51: istore #8
    //   53: aload #6
    //   55: getfield Dne : Z
    //   58: ifeq -> 87
    //   61: aload_0
    //   62: getfield Dne : LwWl;
    //   65: iload_2
    //   66: iload #7
    //   68: iadd
    //   69: iload_3
    //   70: iload #8
    //   72: iadd
    //   73: aload_0
    //   74: getfield Qnq : I
    //   77: aload_0
    //   78: getfield aFZ : I
    //   81: invokestatic Dne : (LwWl;IIII)V
    //   84: goto -> 251
    //   87: aload #6
    //   89: getfield bzF : Ljava/lang/String;
    //   92: ldc 'CLOSED'
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: ifeq -> 126
    //   100: aload_0
    //   101: getfield Dne : LwWl;
    //   104: iload_2
    //   105: iload #7
    //   107: iadd
    //   108: iload_3
    //   109: iload #8
    //   111: iadd
    //   112: aload_0
    //   113: getfield Qnq : I
    //   116: aload_0
    //   117: getfield aFZ : I
    //   120: invokestatic FWm : (LwWl;IIII)V
    //   123: goto -> 251
    //   126: aload #6
    //   128: getfield Qnq : Ljava/lang/String;
    //   131: aload_0
    //   132: getfield Dne : LwWl;
    //   135: invokestatic aFZ : (LwWl;)Lnet/minecraft/client/Minecraft;
    //   138: getfield Dne : LvwN;
    //   141: getfield Dne : Ljava/lang/String;
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifeq -> 203
    //   150: aload #6
    //   152: getfield Dne : I
    //   155: bipush #7
    //   157: if_icmpge -> 203
    //   160: aload_0
    //   161: iload_1
    //   162: iload_2
    //   163: bipush #14
    //   165: isub
    //   166: iload_3
    //   167: aload #6
    //   169: invokespecial Dne : (IIILmuh;)V
    //   172: aload_0
    //   173: getfield Dne : LwWl;
    //   176: iload_2
    //   177: iload #7
    //   179: iadd
    //   180: iload_3
    //   181: iload #8
    //   183: iadd
    //   184: aload_0
    //   185: getfield Qnq : I
    //   188: aload_0
    //   189: getfield aFZ : I
    //   192: aload #6
    //   194: getfield Dne : I
    //   197: invokestatic Dne : (LwWl;IIIII)V
    //   200: goto -> 251
    //   203: aload #6
    //   205: getfield bzF : Ljava/lang/String;
    //   208: ldc 'OPEN'
    //   210: invokevirtual equals : (Ljava/lang/Object;)Z
    //   213: ifeq -> 251
    //   216: aload_0
    //   217: getfield Dne : LwWl;
    //   220: iload_2
    //   221: iload #7
    //   223: iadd
    //   224: iload_3
    //   225: iload #8
    //   227: iadd
    //   228: aload_0
    //   229: getfield Qnq : I
    //   232: aload_0
    //   233: getfield aFZ : I
    //   236: invokestatic bzF : (LwWl;IIII)V
    //   239: aload_0
    //   240: iload_1
    //   241: iload_2
    //   242: bipush #14
    //   244: isub
    //   245: iload_3
    //   246: aload #6
    //   248: invokespecial Dne : (IIILmuh;)V
    //   251: aload_0
    //   252: getfield Dne : LwWl;
    //   255: aload_0
    //   256: getfield Dne : LwWl;
    //   259: invokestatic FWm : (LwWl;)LmsA;
    //   262: aload #6
    //   264: invokevirtual Dne : ()Ljava/lang/String;
    //   267: iload_2
    //   268: iconst_2
    //   269: iadd
    //   270: iload_3
    //   271: bipush #12
    //   273: iadd
    //   274: ldc 7105644
    //   276: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   279: aload_0
    //   280: getfield Dne : LwWl;
    //   283: aload_0
    //   284: getfield Dne : LwWl;
    //   287: invokestatic bzF : (LwWl;)LmsA;
    //   290: aload #6
    //   292: getfield Qnq : Ljava/lang/String;
    //   295: iload_2
    //   296: iconst_2
    //   297: iadd
    //   298: iload_3
    //   299: bipush #12
    //   301: iadd
    //   302: bipush #11
    //   304: iadd
    //   305: ldc 5000268
    //   307: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   310: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TIk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */