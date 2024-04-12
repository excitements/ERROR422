public class zTy extends LHi {
  private int FWm;
  
  protected void div() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial div : ()V
    //   4: aload_0
    //   5: getfield Dne : LQnq;
    //   8: getfield aFZ : Z
    //   11: ifne -> 460
    //   14: aload_0
    //   15: getfield FWm : I
    //   18: ifle -> 285
    //   21: aload_0
    //   22: dup
    //   23: getfield FWm : I
    //   26: iconst_1
    //   27: isub
    //   28: putfield FWm : I
    //   31: aload_0
    //   32: getfield FWm : I
    //   35: ifne -> 285
    //   38: aload_0
    //   39: getfield div : D
    //   42: invokestatic FWm : (D)I
    //   45: istore_1
    //   46: aload_0
    //   47: getfield IjH : D
    //   50: invokestatic FWm : (D)I
    //   53: istore_2
    //   54: aload_0
    //   55: getfield mrb : D
    //   58: invokestatic FWm : (D)I
    //   61: istore_3
    //   62: iconst_0
    //   63: istore #5
    //   65: iconst_0
    //   66: istore #4
    //   68: iload #5
    //   70: ifne -> 285
    //   73: iload #4
    //   75: iconst_5
    //   76: if_icmpgt -> 285
    //   79: iload #4
    //   81: bipush #-5
    //   83: if_icmplt -> 285
    //   86: iconst_0
    //   87: istore #6
    //   89: iload #5
    //   91: ifne -> 264
    //   94: iload #6
    //   96: bipush #10
    //   98: if_icmpgt -> 264
    //   101: iload #6
    //   103: bipush #-10
    //   105: if_icmplt -> 264
    //   108: iconst_0
    //   109: istore #7
    //   111: iload #5
    //   113: ifne -> 243
    //   116: iload #7
    //   118: bipush #10
    //   120: if_icmpgt -> 243
    //   123: iload #7
    //   125: bipush #-10
    //   127: if_icmplt -> 243
    //   130: aload_0
    //   131: getfield Dne : LQnq;
    //   134: iload_1
    //   135: iload #6
    //   137: iadd
    //   138: iload_2
    //   139: iload #4
    //   141: iadd
    //   142: iload_3
    //   143: iload #7
    //   145: iadd
    //   146: invokevirtual Dne : (III)I
    //   149: istore #8
    //   151: iload #8
    //   153: getstatic zKP.tIz : LzKP;
    //   156: getfield FWm : I
    //   159: if_icmpne -> 222
    //   162: aload_0
    //   163: getfield Dne : LQnq;
    //   166: iload_1
    //   167: iload #6
    //   169: iadd
    //   170: iload_2
    //   171: iload #4
    //   173: iadd
    //   174: iload_3
    //   175: iload #7
    //   177: iadd
    //   178: iconst_0
    //   179: invokevirtual Dne : (IIIZ)Z
    //   182: pop
    //   183: getstatic zKP.tIz : LzKP;
    //   186: aload_0
    //   187: getfield Dne : LQnq;
    //   190: iload_1
    //   191: iload #6
    //   193: iadd
    //   194: iload_2
    //   195: iload #4
    //   197: iadd
    //   198: iload_3
    //   199: iload #7
    //   201: iadd
    //   202: iconst_0
    //   203: invokevirtual bzF : (LQnq;IIII)V
    //   206: aload_0
    //   207: getfield Dne : Ljava/util/Random;
    //   210: invokevirtual nextBoolean : ()Z
    //   213: ifeq -> 222
    //   216: iconst_1
    //   217: istore #5
    //   219: goto -> 243
    //   222: iload #7
    //   224: ifgt -> 234
    //   227: iconst_1
    //   228: iload #7
    //   230: isub
    //   231: goto -> 238
    //   234: iconst_0
    //   235: iload #7
    //   237: isub
    //   238: istore #7
    //   240: goto -> 111
    //   243: iload #6
    //   245: ifgt -> 255
    //   248: iconst_1
    //   249: iload #6
    //   251: isub
    //   252: goto -> 259
    //   255: iconst_0
    //   256: iload #6
    //   258: isub
    //   259: istore #6
    //   261: goto -> 89
    //   264: iload #4
    //   266: ifgt -> 276
    //   269: iconst_1
    //   270: iload #4
    //   272: isub
    //   273: goto -> 280
    //   276: iconst_0
    //   277: iload #4
    //   279: isub
    //   280: istore #4
    //   282: goto -> 68
    //   285: aload_0
    //   286: getfield bzF : LsMa;
    //   289: ifnonnull -> 441
    //   292: aload_0
    //   293: invokevirtual qrB : ()Z
    //   296: ifne -> 441
    //   299: aload_0
    //   300: getfield div : D
    //   303: invokestatic FWm : (D)I
    //   306: istore_1
    //   307: aload_0
    //   308: getfield IjH : D
    //   311: ldc2_w 0.5
    //   314: dadd
    //   315: invokestatic FWm : (D)I
    //   318: istore_2
    //   319: aload_0
    //   320: getfield mrb : D
    //   323: invokestatic FWm : (D)I
    //   326: istore_3
    //   327: aload_0
    //   328: getfield Dne : Ljava/util/Random;
    //   331: bipush #6
    //   333: invokevirtual nextInt : (I)I
    //   336: istore #5
    //   338: aload_0
    //   339: getfield Dne : LQnq;
    //   342: iload_1
    //   343: getstatic rrP.FWm : [I
    //   346: iload #5
    //   348: iaload
    //   349: iadd
    //   350: iload_2
    //   351: getstatic rrP.bzF : [I
    //   354: iload #5
    //   356: iaload
    //   357: iadd
    //   358: iload_3
    //   359: getstatic rrP.Qnq : [I
    //   362: iload #5
    //   364: iaload
    //   365: iadd
    //   366: invokevirtual Dne : (III)I
    //   369: istore #4
    //   371: iload #4
    //   373: invokestatic Dne : (I)Z
    //   376: ifeq -> 434
    //   379: aload_0
    //   380: getfield Dne : LQnq;
    //   383: iload_1
    //   384: getstatic rrP.FWm : [I
    //   387: iload #5
    //   389: iaload
    //   390: iadd
    //   391: iload_2
    //   392: getstatic rrP.bzF : [I
    //   395: iload #5
    //   397: iaload
    //   398: iadd
    //   399: iload_3
    //   400: getstatic rrP.Qnq : [I
    //   403: iload #5
    //   405: iaload
    //   406: iadd
    //   407: getstatic zKP.tIz : LzKP;
    //   410: getfield FWm : I
    //   413: iload #4
    //   415: invokestatic bzF : (I)I
    //   418: iconst_3
    //   419: invokevirtual FWm : (IIIIII)Z
    //   422: pop
    //   423: aload_0
    //   424: invokevirtual Wwe : ()V
    //   427: aload_0
    //   428: invokevirtual g_ : ()V
    //   431: goto -> 438
    //   434: aload_0
    //   435: invokevirtual zGp : ()V
    //   438: goto -> 460
    //   441: aload_0
    //   442: getfield bzF : LsMa;
    //   445: ifnull -> 460
    //   448: aload_0
    //   449: invokevirtual qrB : ()Z
    //   452: ifne -> 460
    //   455: aload_0
    //   456: aconst_null
    //   457: putfield bzF : LsMa;
    //   460: return
  }
  
  public void Dne() {
    this.IjH = this.mrb;
    super.Dne();
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public int Dne(sMa paramsMa) {
    return 1;
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if (this.FWm <= 0 && (paramzBn instanceof Kgw || paramzBn == zBn.XHL))
      this.FWm = 20; 
    return super.Dne(paramzBn, paramInt);
  }
  
  protected String DyG() {
    return "mob.silverfish.hit";
  }
  
  protected int kGO() {
    return 0;
  }
  
  public zTy(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.3F, 0.7F);
    this.cHy = 0.6F;
  }
  
  protected String div() {
    return "mob.silverfish.kill";
  }
  
  protected String zGp() {
    return "mob.silverfish.say";
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: iload_1
    //   5: iload_2
    //   6: iconst_1
    //   7: isub
    //   8: iload_3
    //   9: invokevirtual Dne : (III)I
    //   12: getstatic zKP.Dne : LzKP;
    //   15: getfield FWm : I
    //   18: if_icmpne -> 26
    //   21: ldc 10.0
    //   23: goto -> 33
    //   26: aload_0
    //   27: iload_1
    //   28: iload_2
    //   29: iload_3
    //   30: invokespecial Dne : (III)F
    //   33: freturn
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.silverfish.step", 0.15F, 1.0F);
  }
  
  protected sMa Dne() {
    // Byte code:
    //   0: ldc2_w 8.0
    //   3: dstore_1
    //   4: aload_0
    //   5: getfield Dne : LQnq;
    //   8: aload_0
    //   9: dload_1
    //   10: invokevirtual FWm : (LsMa;D)LFiG;
    //   13: areturn
  }
  
  public aYc Dne() {
    return aYc.bzF;
  }
  
  protected boolean ICU() {
    return true;
  }
  
  public int Dne() {
    return 8;
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {
    if (this.RPx <= 0.0F && paramFloat < 1.2F && paramsMa.Dne.aFZ > this.Dne.FWm && paramsMa.Dne.FWm < this.Dne.aFZ) {
      this.RPx = 20;
      bzF(paramsMa);
    } 
  }
  
  public boolean cot() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial cot : ()Z
    //   4: ifeq -> 29
    //   7: aload_0
    //   8: getfield Dne : LQnq;
    //   11: aload_0
    //   12: ldc2_w 5.0
    //   15: invokevirtual Dne : (LsMa;D)LFiG;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull -> 27
    //   23: iconst_1
    //   24: goto -> 28
    //   27: iconst_0
    //   28: ireturn
    //   29: iconst_0
    //   30: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zTy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */