public class dfd extends CAZ {
  private int ceE;
  
  private int Vxn;
  
  private Snh Dne;
  
  private float Dne;
  
  public dfd(Snh paramSnh, Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: dload_3
    //   3: dload #5
    //   5: dload #7
    //   7: dconst_0
    //   8: dconst_0
    //   9: dconst_0
    //   10: invokespecial <init> : (LQnq;DDDDDD)V
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield Vxn : I
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield ceE : I
    //   23: aload_0
    //   24: aload_1
    //   25: putfield Dne : LSnh;
    //   28: aload_0
    //   29: bipush #6
    //   31: aload_0
    //   32: getfield Dne : Ljava/util/Random;
    //   35: iconst_4
    //   36: invokevirtual nextInt : (I)I
    //   39: iadd
    //   40: putfield ceE : I
    //   43: aload_0
    //   44: aload_0
    //   45: aload_0
    //   46: aload_0
    //   47: getfield Dne : Ljava/util/Random;
    //   50: invokevirtual nextFloat : ()F
    //   53: ldc 0.6
    //   55: fmul
    //   56: ldc 0.4
    //   58: fadd
    //   59: dup_x1
    //   60: putfield div : F
    //   63: dup_x1
    //   64: putfield DyG : F
    //   67: putfield zGp : F
    //   70: aload_0
    //   71: fconst_1
    //   72: dload #9
    //   74: d2f
    //   75: ldc 0.5
    //   77: fmul
    //   78: fsub
    //   79: putfield Dne : F
    //   82: return
  }
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    this.Vxn++;
    if (this.Vxn == this.ceE)
      g_(); 
  }
  
  public int Dne(float paramFloat) {
    return 61680;
  }
  
  public int Dne() {
    return 3;
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Vxn : I
    //   4: i2f
    //   5: fload_2
    //   6: fadd
    //   7: ldc 15.0
    //   9: fmul
    //   10: aload_0
    //   11: getfield ceE : I
    //   14: i2f
    //   15: fdiv
    //   16: f2i
    //   17: istore #8
    //   19: iload #8
    //   21: bipush #15
    //   23: if_icmpgt -> 408
    //   26: aload_0
    //   27: getfield Dne : LSnh;
    //   30: ldc '/misc/explosion.png'
    //   32: invokevirtual Dne : (Ljava/lang/String;)V
    //   35: iload #8
    //   37: iconst_4
    //   38: irem
    //   39: i2f
    //   40: ldc 4.0
    //   42: fdiv
    //   43: fstore #9
    //   45: fload #9
    //   47: ldc 0.24975
    //   49: fadd
    //   50: fstore #10
    //   52: iload #8
    //   54: iconst_4
    //   55: idiv
    //   56: i2f
    //   57: ldc 4.0
    //   59: fdiv
    //   60: fstore #11
    //   62: fload #11
    //   64: ldc 0.24975
    //   66: fadd
    //   67: fstore #12
    //   69: fconst_2
    //   70: aload_0
    //   71: getfield Dne : F
    //   74: fmul
    //   75: fstore #13
    //   77: aload_0
    //   78: getfield aFZ : D
    //   81: aload_0
    //   82: getfield div : D
    //   85: aload_0
    //   86: getfield aFZ : D
    //   89: dsub
    //   90: fload_2
    //   91: f2d
    //   92: dmul
    //   93: dadd
    //   94: getstatic dfd.Dne : D
    //   97: dsub
    //   98: d2f
    //   99: fstore #14
    //   101: aload_0
    //   102: getfield zGp : D
    //   105: aload_0
    //   106: getfield IjH : D
    //   109: aload_0
    //   110: getfield zGp : D
    //   113: dsub
    //   114: fload_2
    //   115: f2d
    //   116: dmul
    //   117: dadd
    //   118: getstatic dfd.FWm : D
    //   121: dsub
    //   122: d2f
    //   123: fstore #15
    //   125: aload_0
    //   126: getfield DyG : D
    //   129: aload_0
    //   130: getfield mrb : D
    //   133: aload_0
    //   134: getfield DyG : D
    //   137: dsub
    //   138: fload_2
    //   139: f2d
    //   140: dmul
    //   141: dadd
    //   142: getstatic dfd.bzF : D
    //   145: dsub
    //   146: d2f
    //   147: fstore #16
    //   149: fconst_1
    //   150: fconst_1
    //   151: fconst_1
    //   152: fconst_1
    //   153: invokestatic glColor4f : (FFFF)V
    //   156: sipush #2896
    //   159: invokestatic glDisable : (I)V
    //   162: invokestatic Dne : ()V
    //   165: aload_1
    //   166: invokevirtual Dne : ()V
    //   169: aload_1
    //   170: aload_0
    //   171: getfield zGp : F
    //   174: aload_0
    //   175: getfield DyG : F
    //   178: aload_0
    //   179: getfield div : F
    //   182: fconst_1
    //   183: invokevirtual Dne : (FFFF)V
    //   186: aload_1
    //   187: fconst_0
    //   188: fconst_1
    //   189: fconst_0
    //   190: invokevirtual FWm : (FFF)V
    //   193: aload_1
    //   194: sipush #240
    //   197: invokevirtual FWm : (I)V
    //   200: aload_1
    //   201: fload #14
    //   203: fload_3
    //   204: fload #13
    //   206: fmul
    //   207: fsub
    //   208: fload #6
    //   210: fload #13
    //   212: fmul
    //   213: fsub
    //   214: f2d
    //   215: fload #15
    //   217: fload #4
    //   219: fload #13
    //   221: fmul
    //   222: fsub
    //   223: f2d
    //   224: fload #16
    //   226: fload #5
    //   228: fload #13
    //   230: fmul
    //   231: fsub
    //   232: fload #7
    //   234: fload #13
    //   236: fmul
    //   237: fsub
    //   238: f2d
    //   239: fload #10
    //   241: f2d
    //   242: fload #12
    //   244: f2d
    //   245: invokevirtual Dne : (DDDDD)V
    //   248: aload_1
    //   249: fload #14
    //   251: fload_3
    //   252: fload #13
    //   254: fmul
    //   255: fsub
    //   256: fload #6
    //   258: fload #13
    //   260: fmul
    //   261: fadd
    //   262: f2d
    //   263: fload #15
    //   265: fload #4
    //   267: fload #13
    //   269: fmul
    //   270: fadd
    //   271: f2d
    //   272: fload #16
    //   274: fload #5
    //   276: fload #13
    //   278: fmul
    //   279: fsub
    //   280: fload #7
    //   282: fload #13
    //   284: fmul
    //   285: fadd
    //   286: f2d
    //   287: fload #10
    //   289: f2d
    //   290: fload #11
    //   292: f2d
    //   293: invokevirtual Dne : (DDDDD)V
    //   296: aload_1
    //   297: fload #14
    //   299: fload_3
    //   300: fload #13
    //   302: fmul
    //   303: fadd
    //   304: fload #6
    //   306: fload #13
    //   308: fmul
    //   309: fadd
    //   310: f2d
    //   311: fload #15
    //   313: fload #4
    //   315: fload #13
    //   317: fmul
    //   318: fadd
    //   319: f2d
    //   320: fload #16
    //   322: fload #5
    //   324: fload #13
    //   326: fmul
    //   327: fadd
    //   328: fload #7
    //   330: fload #13
    //   332: fmul
    //   333: fadd
    //   334: f2d
    //   335: fload #9
    //   337: f2d
    //   338: fload #11
    //   340: f2d
    //   341: invokevirtual Dne : (DDDDD)V
    //   344: aload_1
    //   345: fload #14
    //   347: fload_3
    //   348: fload #13
    //   350: fmul
    //   351: fadd
    //   352: fload #6
    //   354: fload #13
    //   356: fmul
    //   357: fsub
    //   358: f2d
    //   359: fload #15
    //   361: fload #4
    //   363: fload #13
    //   365: fmul
    //   366: fsub
    //   367: f2d
    //   368: fload #16
    //   370: fload #5
    //   372: fload #13
    //   374: fmul
    //   375: fadd
    //   376: fload #7
    //   378: fload #13
    //   380: fmul
    //   381: fsub
    //   382: f2d
    //   383: fload #9
    //   385: f2d
    //   386: fload #12
    //   388: f2d
    //   389: invokevirtual Dne : (DDDDD)V
    //   392: aload_1
    //   393: invokevirtual Dne : ()I
    //   396: pop
    //   397: fconst_0
    //   398: fconst_0
    //   399: invokestatic glPolygonOffset : (FF)V
    //   402: sipush #2896
    //   405: invokestatic glEnable : (I)V
    //   408: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dfd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */