public class Gal extends Jte {
  private zVu Dne;
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((SoB)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
  
  public void Dne(SoB paramSoB, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    // Byte code:
    //   0: getstatic zKP.Dne : [LzKP;
    //   3: aload_1
    //   4: invokevirtual Dne : ()I
    //   7: aaload
    //   8: astore #9
    //   10: aload #9
    //   12: ifnull -> 364
    //   15: aload_1
    //   16: fload #8
    //   18: invokevirtual Dne : (F)F
    //   21: fconst_1
    //   22: fcmpg
    //   23: ifge -> 364
    //   26: getstatic WAR.Dne : LWAR;
    //   29: astore #10
    //   31: aload_0
    //   32: ldc '/terrain.png'
    //   34: invokevirtual Dne : (Ljava/lang/String;)V
    //   37: invokestatic Dne : ()V
    //   40: sipush #770
    //   43: sipush #771
    //   46: invokestatic glBlendFunc : (II)V
    //   49: sipush #3042
    //   52: invokestatic glEnable : (I)V
    //   55: sipush #2884
    //   58: invokestatic glDisable : (I)V
    //   61: invokestatic Qnq : ()Z
    //   64: ifeq -> 76
    //   67: sipush #7425
    //   70: invokestatic glShadeModel : (I)V
    //   73: goto -> 82
    //   76: sipush #7424
    //   79: invokestatic glShadeModel : (I)V
    //   82: aload #10
    //   84: invokevirtual Dne : ()V
    //   87: aload #10
    //   89: dload_2
    //   90: d2f
    //   91: aload_1
    //   92: getfield Qnq : I
    //   95: i2f
    //   96: fsub
    //   97: aload_1
    //   98: fload #8
    //   100: invokevirtual FWm : (F)F
    //   103: fadd
    //   104: f2d
    //   105: dload #4
    //   107: d2f
    //   108: aload_1
    //   109: getfield aFZ : I
    //   112: i2f
    //   113: fsub
    //   114: aload_1
    //   115: fload #8
    //   117: invokevirtual bzF : (F)F
    //   120: fadd
    //   121: f2d
    //   122: dload #6
    //   124: d2f
    //   125: aload_1
    //   126: getfield zGp : I
    //   129: i2f
    //   130: fsub
    //   131: aload_1
    //   132: fload #8
    //   134: invokevirtual Qnq : (F)F
    //   137: fadd
    //   138: f2d
    //   139: invokevirtual FWm : (DDD)V
    //   142: aload #10
    //   144: iconst_1
    //   145: iconst_1
    //   146: iconst_1
    //   147: invokevirtual Dne : (III)V
    //   150: aload #9
    //   152: getstatic zKP.Dne : LFmX;
    //   155: if_acmpne -> 195
    //   158: aload_1
    //   159: fload #8
    //   161: invokevirtual Dne : (F)F
    //   164: ldc 0.5
    //   166: fcmpg
    //   167: ifge -> 195
    //   170: aload_0
    //   171: getfield Dne : LzVu;
    //   174: aload #9
    //   176: aload_1
    //   177: getfield Qnq : I
    //   180: aload_1
    //   181: getfield aFZ : I
    //   184: aload_1
    //   185: getfield zGp : I
    //   188: iconst_0
    //   189: invokevirtual Dne : (LzKP;IIIZ)V
    //   192: goto -> 347
    //   195: aload_1
    //   196: invokevirtual FWm : ()Z
    //   199: ifeq -> 326
    //   202: aload_1
    //   203: invokevirtual Dne : ()Z
    //   206: ifne -> 326
    //   209: getstatic zKP.Dne : LFmX;
    //   212: aload #9
    //   214: checkcast XbN
    //   217: invokevirtual Dne : ()LgDn;
    //   220: invokevirtual Dne : (LgDn;)V
    //   223: aload_0
    //   224: getfield Dne : LzVu;
    //   227: getstatic zKP.Dne : LFmX;
    //   230: aload_1
    //   231: getfield Qnq : I
    //   234: aload_1
    //   235: getfield aFZ : I
    //   238: aload_1
    //   239: getfield zGp : I
    //   242: aload_1
    //   243: fload #8
    //   245: invokevirtual Dne : (F)F
    //   248: ldc 0.5
    //   250: fcmpg
    //   251: ifge -> 258
    //   254: iconst_1
    //   255: goto -> 259
    //   258: iconst_0
    //   259: invokevirtual Dne : (LzKP;IIIZ)V
    //   262: getstatic zKP.Dne : LFmX;
    //   265: invokevirtual bzF : ()V
    //   268: aload #10
    //   270: dload_2
    //   271: d2f
    //   272: aload_1
    //   273: getfield Qnq : I
    //   276: i2f
    //   277: fsub
    //   278: f2d
    //   279: dload #4
    //   281: d2f
    //   282: aload_1
    //   283: getfield aFZ : I
    //   286: i2f
    //   287: fsub
    //   288: f2d
    //   289: dload #6
    //   291: d2f
    //   292: aload_1
    //   293: getfield zGp : I
    //   296: i2f
    //   297: fsub
    //   298: f2d
    //   299: invokevirtual FWm : (DDD)V
    //   302: aload_0
    //   303: getfield Dne : LzVu;
    //   306: aload #9
    //   308: aload_1
    //   309: getfield Qnq : I
    //   312: aload_1
    //   313: getfield aFZ : I
    //   316: aload_1
    //   317: getfield zGp : I
    //   320: invokevirtual FWm : (LzKP;III)V
    //   323: goto -> 347
    //   326: aload_0
    //   327: getfield Dne : LzVu;
    //   330: aload #9
    //   332: aload_1
    //   333: getfield Qnq : I
    //   336: aload_1
    //   337: getfield aFZ : I
    //   340: aload_1
    //   341: getfield zGp : I
    //   344: invokevirtual Dne : (LzKP;III)V
    //   347: aload #10
    //   349: dconst_0
    //   350: dconst_0
    //   351: dconst_0
    //   352: invokevirtual FWm : (DDD)V
    //   355: aload #10
    //   357: invokevirtual Dne : ()I
    //   360: pop
    //   361: invokestatic FWm : ()V
    //   364: return
  }
  
  public void Dne(Qnq paramQnq) {
    this.Dne = new zVu(paramQnq);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */