public class Non extends QCe {
  public void Dne(hhc paramhhc, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '/item/arrows.png'
    //   3: invokevirtual Dne : (Ljava/lang/String;)V
    //   6: invokestatic glPushMatrix : ()V
    //   9: dload_2
    //   10: d2f
    //   11: dload #4
    //   13: d2f
    //   14: dload #6
    //   16: d2f
    //   17: invokestatic glTranslatef : (FFF)V
    //   20: aload_1
    //   21: getfield Zpi : F
    //   24: aload_1
    //   25: getfield mrb : F
    //   28: aload_1
    //   29: getfield Zpi : F
    //   32: fsub
    //   33: fload #9
    //   35: fmul
    //   36: fadd
    //   37: ldc 90.0
    //   39: fsub
    //   40: fconst_0
    //   41: fconst_1
    //   42: fconst_0
    //   43: invokestatic glRotatef : (FFFF)V
    //   46: aload_1
    //   47: getfield kGO : F
    //   50: aload_1
    //   51: getfield XHL : F
    //   54: aload_1
    //   55: getfield kGO : F
    //   58: fsub
    //   59: fload #9
    //   61: fmul
    //   62: fadd
    //   63: fconst_0
    //   64: fconst_0
    //   65: fconst_1
    //   66: invokestatic glRotatef : (FFFF)V
    //   69: getstatic WAR.Dne : LWAR;
    //   72: astore #10
    //   74: iconst_0
    //   75: istore #11
    //   77: fconst_0
    //   78: fstore #12
    //   80: ldc 0.5
    //   82: fstore #13
    //   84: iconst_0
    //   85: iload #11
    //   87: bipush #10
    //   89: imul
    //   90: iadd
    //   91: i2f
    //   92: ldc 32.0
    //   94: fdiv
    //   95: fstore #14
    //   97: iconst_5
    //   98: iload #11
    //   100: bipush #10
    //   102: imul
    //   103: iadd
    //   104: i2f
    //   105: ldc 32.0
    //   107: fdiv
    //   108: fstore #15
    //   110: fconst_0
    //   111: fstore #16
    //   113: ldc 0.15625
    //   115: fstore #17
    //   117: iconst_5
    //   118: iload #11
    //   120: bipush #10
    //   122: imul
    //   123: iadd
    //   124: i2f
    //   125: ldc 32.0
    //   127: fdiv
    //   128: fstore #18
    //   130: bipush #10
    //   132: iload #11
    //   134: bipush #10
    //   136: imul
    //   137: iadd
    //   138: i2f
    //   139: ldc 32.0
    //   141: fdiv
    //   142: fstore #19
    //   144: ldc 0.05625
    //   146: fstore #20
    //   148: ldc 32826
    //   150: invokestatic glEnable : (I)V
    //   153: aload_1
    //   154: getfield FWm : I
    //   157: i2f
    //   158: fload #9
    //   160: fsub
    //   161: fstore #21
    //   163: fload #21
    //   165: fconst_0
    //   166: fcmpl
    //   167: ifle -> 192
    //   170: fload #21
    //   172: ldc 3.0
    //   174: fmul
    //   175: invokestatic Dne : (F)F
    //   178: fneg
    //   179: fload #21
    //   181: fmul
    //   182: fstore #22
    //   184: fload #22
    //   186: fconst_0
    //   187: fconst_0
    //   188: fconst_1
    //   189: invokestatic glRotatef : (FFFF)V
    //   192: ldc 45.0
    //   194: fconst_1
    //   195: fconst_0
    //   196: fconst_0
    //   197: invokestatic glRotatef : (FFFF)V
    //   200: fload #20
    //   202: fload #20
    //   204: fload #20
    //   206: invokestatic glScalef : (FFF)V
    //   209: ldc -4.0
    //   211: fconst_0
    //   212: fconst_0
    //   213: invokestatic glTranslatef : (FFF)V
    //   216: fload #20
    //   218: fconst_0
    //   219: fconst_0
    //   220: invokestatic glNormal3f : (FFF)V
    //   223: aload #10
    //   225: invokevirtual Dne : ()V
    //   228: aload #10
    //   230: ldc2_w -7.0
    //   233: ldc2_w -2.0
    //   236: ldc2_w -2.0
    //   239: fload #16
    //   241: f2d
    //   242: fload #18
    //   244: f2d
    //   245: invokevirtual Dne : (DDDDD)V
    //   248: aload #10
    //   250: ldc2_w -7.0
    //   253: ldc2_w -2.0
    //   256: ldc2_w 2.0
    //   259: fload #17
    //   261: f2d
    //   262: fload #18
    //   264: f2d
    //   265: invokevirtual Dne : (DDDDD)V
    //   268: aload #10
    //   270: ldc2_w -7.0
    //   273: ldc2_w 2.0
    //   276: ldc2_w 2.0
    //   279: fload #17
    //   281: f2d
    //   282: fload #19
    //   284: f2d
    //   285: invokevirtual Dne : (DDDDD)V
    //   288: aload #10
    //   290: ldc2_w -7.0
    //   293: ldc2_w 2.0
    //   296: ldc2_w -2.0
    //   299: fload #16
    //   301: f2d
    //   302: fload #19
    //   304: f2d
    //   305: invokevirtual Dne : (DDDDD)V
    //   308: aload #10
    //   310: invokevirtual Dne : ()I
    //   313: pop
    //   314: fload #20
    //   316: fneg
    //   317: fconst_0
    //   318: fconst_0
    //   319: invokestatic glNormal3f : (FFF)V
    //   322: aload #10
    //   324: invokevirtual Dne : ()V
    //   327: aload #10
    //   329: ldc2_w -7.0
    //   332: ldc2_w 2.0
    //   335: ldc2_w -2.0
    //   338: fload #16
    //   340: f2d
    //   341: fload #18
    //   343: f2d
    //   344: invokevirtual Dne : (DDDDD)V
    //   347: aload #10
    //   349: ldc2_w -7.0
    //   352: ldc2_w 2.0
    //   355: ldc2_w 2.0
    //   358: fload #17
    //   360: f2d
    //   361: fload #18
    //   363: f2d
    //   364: invokevirtual Dne : (DDDDD)V
    //   367: aload #10
    //   369: ldc2_w -7.0
    //   372: ldc2_w -2.0
    //   375: ldc2_w 2.0
    //   378: fload #17
    //   380: f2d
    //   381: fload #19
    //   383: f2d
    //   384: invokevirtual Dne : (DDDDD)V
    //   387: aload #10
    //   389: ldc2_w -7.0
    //   392: ldc2_w -2.0
    //   395: ldc2_w -2.0
    //   398: fload #16
    //   400: f2d
    //   401: fload #19
    //   403: f2d
    //   404: invokevirtual Dne : (DDDDD)V
    //   407: aload #10
    //   409: invokevirtual Dne : ()I
    //   412: pop
    //   413: iconst_0
    //   414: istore #22
    //   416: iload #22
    //   418: iconst_4
    //   419: if_icmpge -> 526
    //   422: ldc 90.0
    //   424: fconst_1
    //   425: fconst_0
    //   426: fconst_0
    //   427: invokestatic glRotatef : (FFFF)V
    //   430: fconst_0
    //   431: fconst_0
    //   432: fload #20
    //   434: invokestatic glNormal3f : (FFF)V
    //   437: aload #10
    //   439: invokevirtual Dne : ()V
    //   442: aload #10
    //   444: ldc2_w -8.0
    //   447: ldc2_w -2.0
    //   450: dconst_0
    //   451: fload #12
    //   453: f2d
    //   454: fload #14
    //   456: f2d
    //   457: invokevirtual Dne : (DDDDD)V
    //   460: aload #10
    //   462: ldc2_w 8.0
    //   465: ldc2_w -2.0
    //   468: dconst_0
    //   469: fload #13
    //   471: f2d
    //   472: fload #14
    //   474: f2d
    //   475: invokevirtual Dne : (DDDDD)V
    //   478: aload #10
    //   480: ldc2_w 8.0
    //   483: ldc2_w 2.0
    //   486: dconst_0
    //   487: fload #13
    //   489: f2d
    //   490: fload #15
    //   492: f2d
    //   493: invokevirtual Dne : (DDDDD)V
    //   496: aload #10
    //   498: ldc2_w -8.0
    //   501: ldc2_w 2.0
    //   504: dconst_0
    //   505: fload #12
    //   507: f2d
    //   508: fload #15
    //   510: f2d
    //   511: invokevirtual Dne : (DDDDD)V
    //   514: aload #10
    //   516: invokevirtual Dne : ()I
    //   519: pop
    //   520: iinc #22, 1
    //   523: goto -> 416
    //   526: ldc 32826
    //   528: invokestatic glDisable : (I)V
    //   531: invokestatic glPopMatrix : ()V
    //   534: return
  }
  
  static {
  
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((hhc)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Non.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */