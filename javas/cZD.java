public class cZD extends QCe {
  static {
  
  }
  
  public void Dne(alg paramalg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: invokestatic glPushMatrix : ()V
    //   3: dload_2
    //   4: d2f
    //   5: dload #4
    //   7: d2f
    //   8: dload #6
    //   10: d2f
    //   11: invokestatic glTranslatef : (FFF)V
    //   14: aload_1
    //   15: invokevirtual bzF : ()I
    //   18: istore #10
    //   20: aload_0
    //   21: ldc '/item/xporb.png'
    //   23: invokevirtual Dne : (Ljava/lang/String;)V
    //   26: getstatic WAR.Dne : LWAR;
    //   29: astore #11
    //   31: iload #10
    //   33: iconst_4
    //   34: irem
    //   35: bipush #16
    //   37: imul
    //   38: iconst_0
    //   39: iadd
    //   40: i2f
    //   41: ldc 64.0
    //   43: fdiv
    //   44: fstore #12
    //   46: iload #10
    //   48: iconst_4
    //   49: irem
    //   50: bipush #16
    //   52: imul
    //   53: bipush #16
    //   55: iadd
    //   56: i2f
    //   57: ldc 64.0
    //   59: fdiv
    //   60: fstore #13
    //   62: iload #10
    //   64: iconst_4
    //   65: idiv
    //   66: bipush #16
    //   68: imul
    //   69: iconst_0
    //   70: iadd
    //   71: i2f
    //   72: ldc 64.0
    //   74: fdiv
    //   75: fstore #14
    //   77: iload #10
    //   79: iconst_4
    //   80: idiv
    //   81: bipush #16
    //   83: imul
    //   84: bipush #16
    //   86: iadd
    //   87: i2f
    //   88: ldc 64.0
    //   90: fdiv
    //   91: fstore #15
    //   93: fconst_1
    //   94: fstore #16
    //   96: ldc 0.5
    //   98: fstore #17
    //   100: ldc 0.25
    //   102: fstore #18
    //   104: aload_1
    //   105: fload #9
    //   107: invokevirtual Dne : (F)I
    //   110: istore #19
    //   112: iload #19
    //   114: ldc 65536
    //   116: irem
    //   117: istore #20
    //   119: iload #19
    //   121: ldc 65536
    //   123: idiv
    //   124: istore #21
    //   126: getstatic oCF.FWm : I
    //   129: iload #20
    //   131: i2f
    //   132: fconst_1
    //   133: fdiv
    //   134: iload #21
    //   136: i2f
    //   137: fconst_1
    //   138: fdiv
    //   139: invokestatic Dne : (IFF)V
    //   142: fconst_1
    //   143: fconst_1
    //   144: fconst_1
    //   145: fconst_1
    //   146: invokestatic glColor4f : (FFFF)V
    //   149: ldc 255.0
    //   151: fstore #22
    //   153: aload_1
    //   154: getfield Dne : I
    //   157: i2f
    //   158: fload #9
    //   160: fadd
    //   161: fconst_2
    //   162: fdiv
    //   163: fstore #23
    //   165: fload #23
    //   167: fconst_0
    //   168: fadd
    //   169: invokestatic Dne : (F)F
    //   172: fconst_1
    //   173: fadd
    //   174: ldc 0.5
    //   176: fmul
    //   177: fload #22
    //   179: fmul
    //   180: f2i
    //   181: istore #21
    //   183: fload #22
    //   185: f2i
    //   186: istore #24
    //   188: fload #23
    //   190: ldc 4.1887903
    //   192: fadd
    //   193: invokestatic Dne : (F)F
    //   196: fconst_1
    //   197: fadd
    //   198: ldc 0.1
    //   200: fmul
    //   201: fload #22
    //   203: fmul
    //   204: f2i
    //   205: istore #25
    //   207: iload #21
    //   209: bipush #16
    //   211: ishl
    //   212: iload #24
    //   214: bipush #8
    //   216: ishl
    //   217: ior
    //   218: iload #25
    //   220: ior
    //   221: istore #26
    //   223: ldc 180.0
    //   225: aload_0
    //   226: getfield Dne : LptH;
    //   229: getfield Dne : F
    //   232: fsub
    //   233: fconst_0
    //   234: fconst_1
    //   235: fconst_0
    //   236: invokestatic glRotatef : (FFFF)V
    //   239: aload_0
    //   240: getfield Dne : LptH;
    //   243: getfield FWm : F
    //   246: fneg
    //   247: fconst_1
    //   248: fconst_0
    //   249: fconst_0
    //   250: invokestatic glRotatef : (FFFF)V
    //   253: ldc 0.3
    //   255: fstore #27
    //   257: fload #27
    //   259: fload #27
    //   261: fload #27
    //   263: invokestatic glScalef : (FFF)V
    //   266: aload #11
    //   268: invokevirtual Dne : ()V
    //   271: aload #11
    //   273: iload #26
    //   275: sipush #128
    //   278: invokevirtual Dne : (II)V
    //   281: aload #11
    //   283: fconst_0
    //   284: fconst_1
    //   285: fconst_0
    //   286: invokevirtual FWm : (FFF)V
    //   289: aload #11
    //   291: fconst_0
    //   292: fload #17
    //   294: fsub
    //   295: f2d
    //   296: fconst_0
    //   297: fload #18
    //   299: fsub
    //   300: f2d
    //   301: dconst_0
    //   302: fload #12
    //   304: f2d
    //   305: fload #15
    //   307: f2d
    //   308: invokevirtual Dne : (DDDDD)V
    //   311: aload #11
    //   313: fload #16
    //   315: fload #17
    //   317: fsub
    //   318: f2d
    //   319: fconst_0
    //   320: fload #18
    //   322: fsub
    //   323: f2d
    //   324: dconst_0
    //   325: fload #13
    //   327: f2d
    //   328: fload #15
    //   330: f2d
    //   331: invokevirtual Dne : (DDDDD)V
    //   334: aload #11
    //   336: fload #16
    //   338: fload #17
    //   340: fsub
    //   341: f2d
    //   342: fconst_1
    //   343: fload #18
    //   345: fsub
    //   346: f2d
    //   347: dconst_0
    //   348: fload #13
    //   350: f2d
    //   351: fload #14
    //   353: f2d
    //   354: invokevirtual Dne : (DDDDD)V
    //   357: aload #11
    //   359: fconst_0
    //   360: fload #17
    //   362: fsub
    //   363: f2d
    //   364: fconst_1
    //   365: fload #18
    //   367: fsub
    //   368: f2d
    //   369: dconst_0
    //   370: fload #12
    //   372: f2d
    //   373: fload #14
    //   375: f2d
    //   376: invokevirtual Dne : (DDDDD)V
    //   379: aload #11
    //   381: invokevirtual Dne : ()I
    //   384: pop
    //   385: sipush #3042
    //   388: invokestatic glDisable : (I)V
    //   391: ldc 32826
    //   393: invokestatic glDisable : (I)V
    //   396: invokestatic glPopMatrix : ()V
    //   399: return
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((alg)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cZD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */