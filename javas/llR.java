import java.util.Random;

public class llR extends ipD {
  private static Random Dne = new Random();
  
  public float Qnq;
  
  public float Dne;
  
  private String Dne;
  
  public float FWm;
  
  public float aFZ;
  
  public float IjH;
  
  public float DyG;
  
  public float zGp;
  
  public float bzF;
  
  public float div;
  
  public int Dne;
  
  public void Dne(String paramString) {
    this.Dne = paramString;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    if (paramWkD.Dne("CustomName"))
      this.Dne = paramWkD.Dne("CustomName"); 
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (Dne())
      paramWkD.Dne("CustomName", this.Dne); 
  }
  
  public boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: ifnull -> 21
    //   7: aload_0
    //   8: getfield Dne : Ljava/lang/String;
    //   11: invokevirtual length : ()I
    //   14: ifle -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: ireturn
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: aload_0
    //   6: getfield aFZ : F
    //   9: putfield zGp : F
    //   12: aload_0
    //   13: aload_0
    //   14: getfield DyG : F
    //   17: putfield div : F
    //   20: aload_0
    //   21: getfield Dne : LQnq;
    //   24: aload_0
    //   25: getfield Qnq : I
    //   28: i2f
    //   29: ldc 0.5
    //   31: fadd
    //   32: f2d
    //   33: aload_0
    //   34: getfield aFZ : I
    //   37: i2f
    //   38: ldc 0.5
    //   40: fadd
    //   41: f2d
    //   42: aload_0
    //   43: getfield zGp : I
    //   46: i2f
    //   47: ldc 0.5
    //   49: fadd
    //   50: f2d
    //   51: ldc2_w 3.0
    //   54: invokevirtual Dne : (DDDD)LFiG;
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull -> 180
    //   62: aload_1
    //   63: getfield div : D
    //   66: aload_0
    //   67: getfield Qnq : I
    //   70: i2f
    //   71: ldc 0.5
    //   73: fadd
    //   74: f2d
    //   75: dsub
    //   76: dstore_2
    //   77: aload_1
    //   78: getfield mrb : D
    //   81: aload_0
    //   82: getfield zGp : I
    //   85: i2f
    //   86: ldc 0.5
    //   88: fadd
    //   89: f2d
    //   90: dsub
    //   91: dstore #4
    //   93: aload_0
    //   94: dload #4
    //   96: dload_2
    //   97: invokestatic atan2 : (DD)D
    //   100: d2f
    //   101: putfield IjH : F
    //   104: aload_0
    //   105: dup
    //   106: getfield aFZ : F
    //   109: ldc 0.1
    //   111: fadd
    //   112: putfield aFZ : F
    //   115: aload_0
    //   116: getfield aFZ : F
    //   119: ldc 0.5
    //   121: fcmpg
    //   122: iflt -> 136
    //   125: getstatic llR.Dne : Ljava/util/Random;
    //   128: bipush #40
    //   130: invokevirtual nextInt : (I)I
    //   133: ifne -> 177
    //   136: aload_0
    //   137: getfield bzF : F
    //   140: fstore #6
    //   142: aload_0
    //   143: dup
    //   144: getfield bzF : F
    //   147: getstatic llR.Dne : Ljava/util/Random;
    //   150: iconst_4
    //   151: invokevirtual nextInt : (I)I
    //   154: getstatic llR.Dne : Ljava/util/Random;
    //   157: iconst_4
    //   158: invokevirtual nextInt : (I)I
    //   161: isub
    //   162: i2f
    //   163: fadd
    //   164: putfield bzF : F
    //   167: fload #6
    //   169: aload_0
    //   170: getfield bzF : F
    //   173: fcmpl
    //   174: ifeq -> 142
    //   177: goto -> 202
    //   180: aload_0
    //   181: dup
    //   182: getfield IjH : F
    //   185: ldc 0.02
    //   187: fadd
    //   188: putfield IjH : F
    //   191: aload_0
    //   192: dup
    //   193: getfield aFZ : F
    //   196: ldc 0.1
    //   198: fsub
    //   199: putfield aFZ : F
    //   202: aload_0
    //   203: getfield DyG : F
    //   206: ldc 3.1415927
    //   208: fcmpl
    //   209: iflt -> 226
    //   212: aload_0
    //   213: dup
    //   214: getfield DyG : F
    //   217: ldc 6.2831855
    //   219: fsub
    //   220: putfield DyG : F
    //   223: goto -> 202
    //   226: aload_0
    //   227: getfield DyG : F
    //   230: ldc -3.1415927
    //   232: fcmpg
    //   233: ifge -> 250
    //   236: aload_0
    //   237: dup
    //   238: getfield DyG : F
    //   241: ldc 6.2831855
    //   243: fadd
    //   244: putfield DyG : F
    //   247: goto -> 226
    //   250: aload_0
    //   251: getfield IjH : F
    //   254: ldc 3.1415927
    //   256: fcmpl
    //   257: iflt -> 274
    //   260: aload_0
    //   261: dup
    //   262: getfield IjH : F
    //   265: ldc 6.2831855
    //   267: fsub
    //   268: putfield IjH : F
    //   271: goto -> 250
    //   274: aload_0
    //   275: getfield IjH : F
    //   278: ldc -3.1415927
    //   280: fcmpg
    //   281: ifge -> 298
    //   284: aload_0
    //   285: dup
    //   286: getfield IjH : F
    //   289: ldc 6.2831855
    //   291: fadd
    //   292: putfield IjH : F
    //   295: goto -> 274
    //   298: aload_0
    //   299: getfield IjH : F
    //   302: aload_0
    //   303: getfield DyG : F
    //   306: fsub
    //   307: fstore_2
    //   308: fload_2
    //   309: ldc 3.1415927
    //   311: fcmpl
    //   312: iflt -> 323
    //   315: fload_2
    //   316: ldc 6.2831855
    //   318: fsub
    //   319: fstore_2
    //   320: goto -> 308
    //   323: fload_2
    //   324: ldc -3.1415927
    //   326: fcmpg
    //   327: ifge -> 338
    //   330: fload_2
    //   331: ldc 6.2831855
    //   333: fadd
    //   334: fstore_2
    //   335: goto -> 323
    //   338: aload_0
    //   339: dup
    //   340: getfield DyG : F
    //   343: fload_2
    //   344: ldc 0.4
    //   346: fmul
    //   347: fadd
    //   348: putfield DyG : F
    //   351: aload_0
    //   352: getfield aFZ : F
    //   355: fconst_0
    //   356: fcmpg
    //   357: ifge -> 365
    //   360: aload_0
    //   361: fconst_0
    //   362: putfield aFZ : F
    //   365: aload_0
    //   366: getfield aFZ : F
    //   369: fconst_1
    //   370: fcmpl
    //   371: ifle -> 379
    //   374: aload_0
    //   375: fconst_1
    //   376: putfield aFZ : F
    //   379: aload_0
    //   380: dup
    //   381: getfield Dne : I
    //   384: iconst_1
    //   385: iadd
    //   386: putfield Dne : I
    //   389: aload_0
    //   390: aload_0
    //   391: getfield Dne : F
    //   394: putfield FWm : F
    //   397: aload_0
    //   398: getfield bzF : F
    //   401: aload_0
    //   402: getfield Dne : F
    //   405: fsub
    //   406: ldc 0.4
    //   408: fmul
    //   409: fstore_3
    //   410: ldc 0.2
    //   412: fstore #4
    //   414: fload_3
    //   415: fload #4
    //   417: fneg
    //   418: fcmpg
    //   419: ifge -> 426
    //   422: fload #4
    //   424: fneg
    //   425: fstore_3
    //   426: fload_3
    //   427: fload #4
    //   429: fcmpl
    //   430: ifle -> 436
    //   433: fload #4
    //   435: fstore_3
    //   436: aload_0
    //   437: dup
    //   438: getfield Qnq : F
    //   441: fload_3
    //   442: aload_0
    //   443: getfield Qnq : F
    //   446: fsub
    //   447: ldc 0.9
    //   449: fmul
    //   450: fadd
    //   451: putfield Qnq : F
    //   454: aload_0
    //   455: dup
    //   456: getfield Dne : F
    //   459: aload_0
    //   460: getfield Qnq : F
    //   463: fadd
    //   464: putfield Dne : F
    //   467: return
  }
  
  public String Dne() {
    return Dne() ? this.Dne : "container.enchant";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\llR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */