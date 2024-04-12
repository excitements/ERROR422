import java.nio.FloatBuffer;

public class AQe extends Jte {
  FloatBuffer Dne = pZS.Dne(16);
  
  public void Dne(CmX paramCmX, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LXWr;
    //   4: getfield Qnq : D
    //   7: d2f
    //   8: fstore #9
    //   10: aload_0
    //   11: getfield Dne : LXWr;
    //   14: getfield aFZ : D
    //   17: d2f
    //   18: fstore #10
    //   20: aload_0
    //   21: getfield Dne : LXWr;
    //   24: getfield zGp : D
    //   27: d2f
    //   28: fstore #11
    //   30: sipush #2896
    //   33: invokestatic glDisable : (I)V
    //   36: new java/util/Random
    //   39: dup
    //   40: ldc2_w 31100
    //   43: invokespecial <init> : (J)V
    //   46: astore #12
    //   48: ldc 0.75
    //   50: fstore #13
    //   52: iconst_0
    //   53: istore #14
    //   55: iload #14
    //   57: bipush #16
    //   59: if_icmpge -> 640
    //   62: invokestatic glPushMatrix : ()V
    //   65: bipush #16
    //   67: iload #14
    //   69: isub
    //   70: i2f
    //   71: fstore #15
    //   73: ldc 0.0625
    //   75: fstore #16
    //   77: fconst_1
    //   78: fload #15
    //   80: fconst_1
    //   81: fadd
    //   82: fdiv
    //   83: fstore #17
    //   85: iload #14
    //   87: ifne -> 123
    //   90: aload_0
    //   91: ldc '/misc/tunnel.png'
    //   93: invokevirtual Dne : (Ljava/lang/String;)V
    //   96: ldc 0.1
    //   98: fstore #17
    //   100: ldc 65.0
    //   102: fstore #15
    //   104: ldc 0.125
    //   106: fstore #16
    //   108: sipush #3042
    //   111: invokestatic glEnable : (I)V
    //   114: sipush #770
    //   117: sipush #771
    //   120: invokestatic glBlendFunc : (II)V
    //   123: iload #14
    //   125: iconst_1
    //   126: if_icmpne -> 150
    //   129: aload_0
    //   130: ldc '/misc/particlefield.png'
    //   132: invokevirtual Dne : (Ljava/lang/String;)V
    //   135: sipush #3042
    //   138: invokestatic glEnable : (I)V
    //   141: iconst_1
    //   142: iconst_1
    //   143: invokestatic glBlendFunc : (II)V
    //   146: ldc 0.5
    //   148: fstore #16
    //   150: dload #4
    //   152: fload #13
    //   154: f2d
    //   155: dadd
    //   156: dneg
    //   157: d2f
    //   158: fstore #18
    //   160: fload #18
    //   162: getstatic lqj.FWm : F
    //   165: fadd
    //   166: fstore #19
    //   168: fload #18
    //   170: fload #15
    //   172: fadd
    //   173: getstatic lqj.FWm : F
    //   176: fadd
    //   177: fstore #20
    //   179: fload #19
    //   181: fload #20
    //   183: fdiv
    //   184: fstore #21
    //   186: fload #21
    //   188: dload #4
    //   190: fload #13
    //   192: f2d
    //   193: dadd
    //   194: d2f
    //   195: fadd
    //   196: fstore #21
    //   198: fload #9
    //   200: fload #21
    //   202: fload #11
    //   204: invokestatic glTranslatef : (FFF)V
    //   207: sipush #8192
    //   210: sipush #9472
    //   213: sipush #9217
    //   216: invokestatic glTexGeni : (III)V
    //   219: sipush #8193
    //   222: sipush #9472
    //   225: sipush #9217
    //   228: invokestatic glTexGeni : (III)V
    //   231: sipush #8194
    //   234: sipush #9472
    //   237: sipush #9217
    //   240: invokestatic glTexGeni : (III)V
    //   243: sipush #8195
    //   246: sipush #9472
    //   249: sipush #9216
    //   252: invokestatic glTexGeni : (III)V
    //   255: sipush #8192
    //   258: sipush #9473
    //   261: aload_0
    //   262: fconst_1
    //   263: fconst_0
    //   264: fconst_0
    //   265: fconst_0
    //   266: invokespecial Dne : (FFFF)Ljava/nio/FloatBuffer;
    //   269: invokestatic glTexGen : (IILjava/nio/FloatBuffer;)V
    //   272: sipush #8193
    //   275: sipush #9473
    //   278: aload_0
    //   279: fconst_0
    //   280: fconst_0
    //   281: fconst_1
    //   282: fconst_0
    //   283: invokespecial Dne : (FFFF)Ljava/nio/FloatBuffer;
    //   286: invokestatic glTexGen : (IILjava/nio/FloatBuffer;)V
    //   289: sipush #8194
    //   292: sipush #9473
    //   295: aload_0
    //   296: fconst_0
    //   297: fconst_0
    //   298: fconst_0
    //   299: fconst_1
    //   300: invokespecial Dne : (FFFF)Ljava/nio/FloatBuffer;
    //   303: invokestatic glTexGen : (IILjava/nio/FloatBuffer;)V
    //   306: sipush #8195
    //   309: sipush #9474
    //   312: aload_0
    //   313: fconst_0
    //   314: fconst_1
    //   315: fconst_0
    //   316: fconst_0
    //   317: invokespecial Dne : (FFFF)Ljava/nio/FloatBuffer;
    //   320: invokestatic glTexGen : (IILjava/nio/FloatBuffer;)V
    //   323: sipush #3168
    //   326: invokestatic glEnable : (I)V
    //   329: sipush #3169
    //   332: invokestatic glEnable : (I)V
    //   335: sipush #3170
    //   338: invokestatic glEnable : (I)V
    //   341: sipush #3171
    //   344: invokestatic glEnable : (I)V
    //   347: invokestatic glPopMatrix : ()V
    //   350: sipush #5890
    //   353: invokestatic glMatrixMode : (I)V
    //   356: invokestatic glPushMatrix : ()V
    //   359: invokestatic glLoadIdentity : ()V
    //   362: fconst_0
    //   363: invokestatic Dne : ()J
    //   366: ldc2_w 700000
    //   369: lrem
    //   370: l2f
    //   371: ldc 700000.0
    //   373: fdiv
    //   374: fconst_0
    //   375: invokestatic glTranslatef : (FFF)V
    //   378: fload #16
    //   380: fload #16
    //   382: fload #16
    //   384: invokestatic glScalef : (FFF)V
    //   387: ldc 0.5
    //   389: ldc 0.5
    //   391: fconst_0
    //   392: invokestatic glTranslatef : (FFF)V
    //   395: iload #14
    //   397: iload #14
    //   399: imul
    //   400: sipush #4321
    //   403: imul
    //   404: iload #14
    //   406: bipush #9
    //   408: imul
    //   409: iadd
    //   410: i2f
    //   411: fconst_2
    //   412: fmul
    //   413: fconst_0
    //   414: fconst_0
    //   415: fconst_1
    //   416: invokestatic glRotatef : (FFFF)V
    //   419: ldc -0.5
    //   421: ldc -0.5
    //   423: fconst_0
    //   424: invokestatic glTranslatef : (FFF)V
    //   427: fload #9
    //   429: fneg
    //   430: fload #11
    //   432: fneg
    //   433: fload #10
    //   435: fneg
    //   436: invokestatic glTranslatef : (FFF)V
    //   439: fload #18
    //   441: getstatic lqj.FWm : F
    //   444: fadd
    //   445: fstore #19
    //   447: getstatic lqj.Dne : F
    //   450: fload #15
    //   452: fmul
    //   453: fload #19
    //   455: fdiv
    //   456: getstatic lqj.bzF : F
    //   459: fload #15
    //   461: fmul
    //   462: fload #19
    //   464: fdiv
    //   465: fload #10
    //   467: fneg
    //   468: invokestatic glTranslatef : (FFF)V
    //   471: getstatic WAR.Dne : LWAR;
    //   474: astore #22
    //   476: aload #22
    //   478: invokevirtual Dne : ()V
    //   481: aload #12
    //   483: invokevirtual nextFloat : ()F
    //   486: ldc 0.5
    //   488: fmul
    //   489: ldc 0.1
    //   491: fadd
    //   492: fstore #21
    //   494: aload #12
    //   496: invokevirtual nextFloat : ()F
    //   499: ldc 0.5
    //   501: fmul
    //   502: ldc 0.4
    //   504: fadd
    //   505: fstore #23
    //   507: aload #12
    //   509: invokevirtual nextFloat : ()F
    //   512: ldc 0.5
    //   514: fmul
    //   515: ldc 0.5
    //   517: fadd
    //   518: fstore #24
    //   520: iload #14
    //   522: ifne -> 534
    //   525: fconst_1
    //   526: fstore #24
    //   528: fconst_1
    //   529: fstore #23
    //   531: fconst_1
    //   532: fstore #21
    //   534: aload #22
    //   536: fload #21
    //   538: fload #17
    //   540: fmul
    //   541: fload #23
    //   543: fload #17
    //   545: fmul
    //   546: fload #24
    //   548: fload #17
    //   550: fmul
    //   551: fconst_1
    //   552: invokevirtual Dne : (FFFF)V
    //   555: aload #22
    //   557: dload_2
    //   558: dload #4
    //   560: fload #13
    //   562: f2d
    //   563: dadd
    //   564: dload #6
    //   566: invokevirtual Dne : (DDD)V
    //   569: aload #22
    //   571: dload_2
    //   572: dload #4
    //   574: fload #13
    //   576: f2d
    //   577: dadd
    //   578: dload #6
    //   580: dconst_1
    //   581: dadd
    //   582: invokevirtual Dne : (DDD)V
    //   585: aload #22
    //   587: dload_2
    //   588: dconst_1
    //   589: dadd
    //   590: dload #4
    //   592: fload #13
    //   594: f2d
    //   595: dadd
    //   596: dload #6
    //   598: dconst_1
    //   599: dadd
    //   600: invokevirtual Dne : (DDD)V
    //   603: aload #22
    //   605: dload_2
    //   606: dconst_1
    //   607: dadd
    //   608: dload #4
    //   610: fload #13
    //   612: f2d
    //   613: dadd
    //   614: dload #6
    //   616: invokevirtual Dne : (DDD)V
    //   619: aload #22
    //   621: invokevirtual Dne : ()I
    //   624: pop
    //   625: invokestatic glPopMatrix : ()V
    //   628: sipush #5888
    //   631: invokestatic glMatrixMode : (I)V
    //   634: iinc #14, 1
    //   637: goto -> 55
    //   640: sipush #3042
    //   643: invokestatic glDisable : (I)V
    //   646: sipush #3168
    //   649: invokestatic glDisable : (I)V
    //   652: sipush #3169
    //   655: invokestatic glDisable : (I)V
    //   658: sipush #3170
    //   661: invokestatic glDisable : (I)V
    //   664: sipush #3171
    //   667: invokestatic glDisable : (I)V
    //   670: sipush #2896
    //   673: invokestatic glEnable : (I)V
    //   676: return
  }
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((CmX)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
  
  private FloatBuffer Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.Dne.clear();
    this.Dne.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
    this.Dne.flip();
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AQe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */