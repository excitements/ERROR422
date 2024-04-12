import net.minecraft.client.Minecraft;

public class qik extends qVZ {
  private fZI Dne;
  
  private boolean bzF = false;
  
  private static ONk[] Dne = new ONk[] { 
      ONk.kGO, ONk.DyG, ONk.udO, ONk.XHL, ONk.IjH, ONk.div, ONk.ooe, ONk.mrb, ONk.zGp, ONk.trS, 
      ONk.qLR, ONk.OdI, ONk.vSL, ONk.RPx };
  
  private qVZ Dne;
  
  protected String Dne = "Video Settings";
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null) {
      ulE ulE = ((fZI)this.Dne).IjH;
      if (paramPee.aFZ < 100 && paramPee instanceof Cpw) {
        this.Dne.Dne(((Cpw)paramPee).Dne(), 1);
        paramPee.Dne = this.Dne.Dne(ONk.Dne(paramPee.aFZ));
      } 
      if (paramPee.aFZ == 200) {
        ((Minecraft)this.Dne).Dne.FWm();
        this.Dne.Dne((qVZ)this.Dne);
      } 
      if (((fZI)this.Dne).IjH != ulE) {
        IJm iJm = new IJm(((Minecraft)this.Dne).Dne, ((Minecraft)this.Dne).Dne, ((Minecraft)this.Dne).FWm);
        int i = iJm.Dne();
        int j = iJm.FWm();
        Dne((Minecraft)this.Dne, i, j);
      } 
    } 
  }
  
  public qik(qVZ paramqVZ, fZI paramfZI) {
    this.Dne = (String)paramqVZ;
    this.Dne = (String)paramfZI;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    Dne((msA)this.Dne, this.Dne, this.FWm / 2, this.bzF ? 20 : 5, 16777215);
    if (!this.bzF && ((fZI)this.Dne).Dne == null) {
      Dne((msA)this.Dne, KGL.Dne("options.farWarning1"), this.FWm / 2, this.bzF / 6 + 144 + 1, 11468800);
      Dne((msA)this.Dne, KGL.Dne("options.farWarning2"), this.FWm / 2, this.bzF / 6 + 144 + 13, 11468800);
    } 
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void Dne() {
    // Byte code:
    //   0: invokestatic Dne : ()Lirb;
    //   3: astore_1
    //   4: aload_0
    //   5: aload_1
    //   6: ldc 'options.videoTitle'
    //   8: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   11: putfield Dne : Ljava/lang/String;
    //   14: aload_0
    //   15: getfield Dne : Ljava/util/List;
    //   18: invokeinterface clear : ()V
    //   23: aload_0
    //   24: getfield Dne : Ljava/util/List;
    //   27: new Pee
    //   30: dup
    //   31: sipush #200
    //   34: aload_0
    //   35: getfield FWm : I
    //   38: iconst_2
    //   39: idiv
    //   40: bipush #100
    //   42: isub
    //   43: aload_0
    //   44: getfield bzF : I
    //   47: bipush #6
    //   49: idiv
    //   50: sipush #168
    //   53: iadd
    //   54: aload_1
    //   55: ldc 'gui.done'
    //   57: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   60: invokespecial <init> : (IIILjava/lang/String;)V
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield bzF : Z
    //   74: iconst_3
    //   75: anewarray java/lang/String
    //   78: dup
    //   79: iconst_0
    //   80: ldc 'sun.arch.data.model'
    //   82: aastore
    //   83: dup
    //   84: iconst_1
    //   85: ldc 'com.ibm.vm.bitmode'
    //   87: aastore
    //   88: dup
    //   89: iconst_2
    //   90: ldc 'os.arch'
    //   92: aastore
    //   93: astore_2
    //   94: aload_2
    //   95: astore_3
    //   96: aload_2
    //   97: arraylength
    //   98: istore #4
    //   100: iconst_0
    //   101: istore #5
    //   103: iload #5
    //   105: iload #4
    //   107: if_icmpge -> 152
    //   110: aload_3
    //   111: iload #5
    //   113: aaload
    //   114: astore #6
    //   116: aload #6
    //   118: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   121: astore #7
    //   123: aload #7
    //   125: ifnull -> 146
    //   128: aload #7
    //   130: ldc '64'
    //   132: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   135: ifeq -> 146
    //   138: aload_0
    //   139: iconst_1
    //   140: putfield bzF : Z
    //   143: goto -> 152
    //   146: iinc #5, 1
    //   149: goto -> 103
    //   152: iconst_0
    //   153: istore #5
    //   155: aload_0
    //   156: getfield bzF : Z
    //   159: ifeq -> 166
    //   162: iconst_0
    //   163: goto -> 168
    //   166: bipush #-15
    //   168: istore #4
    //   170: getstatic qik.Dne : [LONk;
    //   173: astore #6
    //   175: aload #6
    //   177: arraylength
    //   178: istore #7
    //   180: iconst_0
    //   181: istore #8
    //   183: iload #8
    //   185: iload #7
    //   187: if_icmpge -> 366
    //   190: aload #6
    //   192: iload #8
    //   194: aaload
    //   195: astore #9
    //   197: aload #9
    //   199: invokevirtual Dne : ()Z
    //   202: ifeq -> 287
    //   205: aload_0
    //   206: getfield Dne : Ljava/util/List;
    //   209: new bsO
    //   212: dup
    //   213: aload #9
    //   215: invokevirtual Dne : ()I
    //   218: aload_0
    //   219: getfield FWm : I
    //   222: iconst_2
    //   223: idiv
    //   224: sipush #155
    //   227: isub
    //   228: iload #5
    //   230: iconst_2
    //   231: irem
    //   232: sipush #160
    //   235: imul
    //   236: iadd
    //   237: aload_0
    //   238: getfield bzF : I
    //   241: bipush #7
    //   243: idiv
    //   244: iload #4
    //   246: iadd
    //   247: bipush #24
    //   249: iload #5
    //   251: iconst_1
    //   252: ishr
    //   253: imul
    //   254: iadd
    //   255: aload #9
    //   257: aload_0
    //   258: getfield Dne : LfZI;
    //   261: aload #9
    //   263: invokevirtual Dne : (LONk;)Ljava/lang/String;
    //   266: aload_0
    //   267: getfield Dne : LfZI;
    //   270: aload #9
    //   272: invokevirtual Dne : (LONk;)F
    //   275: invokespecial <init> : (IIILONk;Ljava/lang/String;F)V
    //   278: invokeinterface add : (Ljava/lang/Object;)Z
    //   283: pop
    //   284: goto -> 357
    //   287: aload_0
    //   288: getfield Dne : Ljava/util/List;
    //   291: new Cpw
    //   294: dup
    //   295: aload #9
    //   297: invokevirtual Dne : ()I
    //   300: aload_0
    //   301: getfield FWm : I
    //   304: iconst_2
    //   305: idiv
    //   306: sipush #155
    //   309: isub
    //   310: iload #5
    //   312: iconst_2
    //   313: irem
    //   314: sipush #160
    //   317: imul
    //   318: iadd
    //   319: aload_0
    //   320: getfield bzF : I
    //   323: bipush #7
    //   325: idiv
    //   326: iload #4
    //   328: iadd
    //   329: bipush #24
    //   331: iload #5
    //   333: iconst_1
    //   334: ishr
    //   335: imul
    //   336: iadd
    //   337: aload #9
    //   339: aload_0
    //   340: getfield Dne : LfZI;
    //   343: aload #9
    //   345: invokevirtual Dne : (LONk;)Ljava/lang/String;
    //   348: invokespecial <init> : (IIILONk;Ljava/lang/String;)V
    //   351: invokeinterface add : (Ljava/lang/Object;)Z
    //   356: pop
    //   357: iinc #5, 1
    //   360: iinc #8, 1
    //   363: goto -> 183
    //   366: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */