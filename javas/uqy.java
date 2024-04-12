import net.minecraft.client.Minecraft;

public class uqy extends qVZ {
  private final fZI Dne;
  
  protected String Dne;
  
  private static final ONk[] Dne = new ONk[] { (ONk)ONk.Dne, ONk.FWm, ONk.bzF, ONk.Qnq, ONk.aFZ, ONk.Zpi, ONk.gnI };
  
  private final qVZ Dne = (qVZ)"Options";
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    Dne((msA)this.Dne, (String)this.Dne, this.FWm / 2, 15, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null) {
      if (paramPee.aFZ < 100 && paramPee instanceof Cpw) {
        this.Dne.Dne(((Cpw)paramPee).Dne(), 1);
        paramPee.Dne = this.Dne.Dne(ONk.Dne(paramPee.aFZ));
      } 
      if (paramPee.aFZ == 101) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(new qik(this, (fZI)this.Dne));
      } 
      if (paramPee.aFZ == 100) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(new dnF(this, (fZI)this.Dne));
      } 
      if (paramPee.aFZ == 102) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(new Utr(this, (fZI)this.Dne));
      } 
      if (paramPee.aFZ == 103) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(new zSv(this, (fZI)this.Dne));
      } 
      if (paramPee.aFZ == 104) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(new RKa(this, (fZI)this.Dne));
      } 
      if (paramPee.aFZ == 200) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(this.Dne);
      } 
      if (paramPee.aFZ == 105) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne(new SbO(this, (fZI)this.Dne));
      } 
    } 
  }
  
  public uqy(qVZ paramqVZ, fZI paramfZI) {
    this.Dne = paramqVZ;
    this.Dne = (qVZ)paramfZI;
  }
  
  public void Dne() {
    // Byte code:
    //   0: invokestatic Dne : ()Lirb;
    //   3: astore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: aload_0
    //   7: aload_1
    //   8: ldc 'options.title'
    //   10: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   13: putfield Dne : Ljava/lang/String;
    //   16: getstatic uqy.Dne : [LONk;
    //   19: astore_3
    //   20: aload_3
    //   21: arraylength
    //   22: istore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload #4
    //   31: if_icmpge -> 285
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #6
    //   40: aload #6
    //   42: invokevirtual Dne : ()Z
    //   45: ifeq -> 128
    //   48: aload_0
    //   49: getfield Dne : Ljava/util/List;
    //   52: new bsO
    //   55: dup
    //   56: aload #6
    //   58: invokevirtual Dne : ()I
    //   61: aload_0
    //   62: getfield FWm : I
    //   65: iconst_2
    //   66: idiv
    //   67: sipush #155
    //   70: isub
    //   71: iload_2
    //   72: iconst_2
    //   73: irem
    //   74: sipush #160
    //   77: imul
    //   78: iadd
    //   79: aload_0
    //   80: getfield bzF : I
    //   83: bipush #6
    //   85: idiv
    //   86: bipush #12
    //   88: isub
    //   89: bipush #24
    //   91: iload_2
    //   92: iconst_1
    //   93: ishr
    //   94: imul
    //   95: iadd
    //   96: aload #6
    //   98: aload_0
    //   99: getfield Dne : LfZI;
    //   102: aload #6
    //   104: invokevirtual Dne : (LONk;)Ljava/lang/String;
    //   107: aload_0
    //   108: getfield Dne : LfZI;
    //   111: aload #6
    //   113: invokevirtual Dne : (LONk;)F
    //   116: invokespecial <init> : (IIILONk;Ljava/lang/String;F)V
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -> 276
    //   128: new Cpw
    //   131: dup
    //   132: aload #6
    //   134: invokevirtual Dne : ()I
    //   137: aload_0
    //   138: getfield FWm : I
    //   141: iconst_2
    //   142: idiv
    //   143: sipush #155
    //   146: isub
    //   147: iload_2
    //   148: iconst_2
    //   149: irem
    //   150: sipush #160
    //   153: imul
    //   154: iadd
    //   155: aload_0
    //   156: getfield bzF : I
    //   159: bipush #6
    //   161: idiv
    //   162: bipush #12
    //   164: isub
    //   165: bipush #24
    //   167: iload_2
    //   168: iconst_1
    //   169: ishr
    //   170: imul
    //   171: iadd
    //   172: aload #6
    //   174: aload_0
    //   175: getfield Dne : LfZI;
    //   178: aload #6
    //   180: invokevirtual Dne : (LONk;)Ljava/lang/String;
    //   183: invokespecial <init> : (IIILONk;Ljava/lang/String;)V
    //   186: astore #7
    //   188: aload #6
    //   190: getstatic ONk.Zpi : LONk;
    //   193: if_acmpne -> 264
    //   196: aload_0
    //   197: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   200: getfield Dne : LVzZ;
    //   203: ifnull -> 264
    //   206: aload_0
    //   207: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   210: getfield Dne : LVzZ;
    //   213: invokevirtual Dne : ()LxoY;
    //   216: invokevirtual Qnq : ()Z
    //   219: ifeq -> 264
    //   222: aload #7
    //   224: iconst_0
    //   225: putfield Dne : Z
    //   228: aload #7
    //   230: new java/lang/StringBuilder
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: ldc 'options.difficulty'
    //   239: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: ldc ': '
    //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: ldc 'options.difficulty.hardcore'
    //   252: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual toString : ()Ljava/lang/String;
    //   261: putfield Dne : Ljava/lang/String;
    //   264: aload_0
    //   265: getfield Dne : Ljava/util/List;
    //   268: aload #7
    //   270: invokeinterface add : (Ljava/lang/Object;)Z
    //   275: pop
    //   276: iinc #2, 1
    //   279: iinc #5, 1
    //   282: goto -> 27
    //   285: aload_0
    //   286: getfield Dne : Ljava/util/List;
    //   289: new Pee
    //   292: dup
    //   293: bipush #101
    //   295: aload_0
    //   296: getfield FWm : I
    //   299: iconst_2
    //   300: idiv
    //   301: sipush #152
    //   304: isub
    //   305: aload_0
    //   306: getfield bzF : I
    //   309: bipush #6
    //   311: idiv
    //   312: bipush #96
    //   314: iadd
    //   315: bipush #6
    //   317: isub
    //   318: sipush #150
    //   321: bipush #20
    //   323: aload_1
    //   324: ldc 'options.video'
    //   326: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   329: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   332: invokeinterface add : (Ljava/lang/Object;)Z
    //   337: pop
    //   338: aload_0
    //   339: getfield Dne : Ljava/util/List;
    //   342: new Pee
    //   345: dup
    //   346: bipush #100
    //   348: aload_0
    //   349: getfield FWm : I
    //   352: iconst_2
    //   353: idiv
    //   354: iconst_2
    //   355: iadd
    //   356: aload_0
    //   357: getfield bzF : I
    //   360: bipush #6
    //   362: idiv
    //   363: bipush #96
    //   365: iadd
    //   366: bipush #6
    //   368: isub
    //   369: sipush #150
    //   372: bipush #20
    //   374: aload_1
    //   375: ldc 'options.controls'
    //   377: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   380: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   383: invokeinterface add : (Ljava/lang/Object;)Z
    //   388: pop
    //   389: aload_0
    //   390: getfield Dne : Ljava/util/List;
    //   393: new Pee
    //   396: dup
    //   397: bipush #102
    //   399: aload_0
    //   400: getfield FWm : I
    //   403: iconst_2
    //   404: idiv
    //   405: sipush #152
    //   408: isub
    //   409: aload_0
    //   410: getfield bzF : I
    //   413: bipush #6
    //   415: idiv
    //   416: bipush #120
    //   418: iadd
    //   419: bipush #6
    //   421: isub
    //   422: sipush #150
    //   425: bipush #20
    //   427: ldc 'Unidentified'
    //   429: iconst_0
    //   430: invokespecial <init> : (IIIIILjava/lang/String;Z)V
    //   433: invokeinterface add : (Ljava/lang/Object;)Z
    //   438: pop
    //   439: aload_0
    //   440: getfield Dne : Ljava/util/List;
    //   443: new Pee
    //   446: dup
    //   447: bipush #103
    //   449: aload_0
    //   450: getfield FWm : I
    //   453: iconst_2
    //   454: idiv
    //   455: iconst_2
    //   456: iadd
    //   457: aload_0
    //   458: getfield bzF : I
    //   461: bipush #6
    //   463: idiv
    //   464: bipush #120
    //   466: iadd
    //   467: bipush #6
    //   469: isub
    //   470: sipush #150
    //   473: bipush #20
    //   475: ldc 'Unidentified'
    //   477: iconst_0
    //   478: invokespecial <init> : (IIIIILjava/lang/String;Z)V
    //   481: invokeinterface add : (Ljava/lang/Object;)Z
    //   486: pop
    //   487: aload_0
    //   488: getfield Dne : Ljava/util/List;
    //   491: new Pee
    //   494: dup
    //   495: bipush #105
    //   497: aload_0
    //   498: getfield FWm : I
    //   501: iconst_2
    //   502: idiv
    //   503: sipush #152
    //   506: isub
    //   507: aload_0
    //   508: getfield bzF : I
    //   511: bipush #6
    //   513: idiv
    //   514: sipush #144
    //   517: iadd
    //   518: bipush #6
    //   520: isub
    //   521: sipush #150
    //   524: bipush #20
    //   526: ldc 'Unidentified'
    //   528: iconst_0
    //   529: invokespecial <init> : (IIIIILjava/lang/String;Z)V
    //   532: invokeinterface add : (Ljava/lang/Object;)Z
    //   537: pop
    //   538: aload_0
    //   539: getfield Dne : Ljava/util/List;
    //   542: new Pee
    //   545: dup
    //   546: bipush #104
    //   548: aload_0
    //   549: getfield FWm : I
    //   552: iconst_2
    //   553: idiv
    //   554: iconst_2
    //   555: iadd
    //   556: aload_0
    //   557: getfield bzF : I
    //   560: bipush #6
    //   562: idiv
    //   563: sipush #144
    //   566: iadd
    //   567: bipush #6
    //   569: isub
    //   570: sipush #150
    //   573: bipush #20
    //   575: aload_1
    //   576: ldc 'options.snooper.view'
    //   578: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   581: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   584: invokeinterface add : (Ljava/lang/Object;)Z
    //   589: pop
    //   590: aload_0
    //   591: getfield Dne : Ljava/util/List;
    //   594: new Pee
    //   597: dup
    //   598: sipush #200
    //   601: aload_0
    //   602: getfield FWm : I
    //   605: iconst_2
    //   606: idiv
    //   607: bipush #100
    //   609: isub
    //   610: aload_0
    //   611: getfield bzF : I
    //   614: bipush #6
    //   616: idiv
    //   617: sipush #168
    //   620: iadd
    //   621: aload_1
    //   622: ldc 'gui.done'
    //   624: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   627: invokespecial <init> : (IIILjava/lang/String;)V
    //   630: invokeinterface add : (Ljava/lang/Object;)Z
    //   635: pop
    //   636: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uqy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */