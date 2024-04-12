public class zWy extends QCe {
  private zVu FWm = new zVu();
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((CiF)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(CiF paramCiF, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()LQnq;
    //   4: astore #10
    //   6: getstatic zKP.Dne : [LzKP;
    //   9: aload_1
    //   10: getfield Dne : I
    //   13: aaload
    //   14: astore #11
    //   16: aload #10
    //   18: aload_1
    //   19: getfield div : D
    //   22: invokestatic FWm : (D)I
    //   25: aload_1
    //   26: getfield IjH : D
    //   29: invokestatic FWm : (D)I
    //   32: aload_1
    //   33: getfield mrb : D
    //   36: invokestatic FWm : (D)I
    //   39: invokevirtual Dne : (III)I
    //   42: aload_1
    //   43: getfield Dne : I
    //   46: if_icmpeq -> 394
    //   49: invokestatic glPushMatrix : ()V
    //   52: dload_2
    //   53: d2f
    //   54: dload #4
    //   56: d2f
    //   57: dload #6
    //   59: d2f
    //   60: invokestatic glTranslatef : (FFF)V
    //   63: aload_0
    //   64: ldc '/terrain.png'
    //   66: invokevirtual Dne : (Ljava/lang/String;)V
    //   69: sipush #2896
    //   72: invokestatic glDisable : (I)V
    //   75: aload #11
    //   77: instanceof qQB
    //   80: ifeq -> 211
    //   83: aload #11
    //   85: invokevirtual Dne : ()I
    //   88: bipush #35
    //   90: if_icmpne -> 211
    //   93: aload_0
    //   94: getfield FWm : LzVu;
    //   97: aload #10
    //   99: putfield Dne : LZpi;
    //   102: getstatic WAR.Dne : LWAR;
    //   105: astore #12
    //   107: aload #12
    //   109: invokevirtual Dne : ()V
    //   112: aload #12
    //   114: aload_1
    //   115: getfield div : D
    //   118: invokestatic FWm : (D)I
    //   121: ineg
    //   122: i2f
    //   123: ldc 0.5
    //   125: fsub
    //   126: f2d
    //   127: aload_1
    //   128: getfield IjH : D
    //   131: invokestatic FWm : (D)I
    //   134: ineg
    //   135: i2f
    //   136: ldc 0.5
    //   138: fsub
    //   139: f2d
    //   140: aload_1
    //   141: getfield mrb : D
    //   144: invokestatic FWm : (D)I
    //   147: ineg
    //   148: i2f
    //   149: ldc 0.5
    //   151: fsub
    //   152: f2d
    //   153: invokevirtual FWm : (DDD)V
    //   156: aload_0
    //   157: getfield FWm : LzVu;
    //   160: aload #11
    //   162: checkcast qQB
    //   165: aload_1
    //   166: getfield div : D
    //   169: invokestatic FWm : (D)I
    //   172: aload_1
    //   173: getfield IjH : D
    //   176: invokestatic FWm : (D)I
    //   179: aload_1
    //   180: getfield mrb : D
    //   183: invokestatic FWm : (D)I
    //   186: aload_1
    //   187: getfield FWm : I
    //   190: invokevirtual Dne : (LqQB;IIII)Z
    //   193: pop
    //   194: aload #12
    //   196: dconst_0
    //   197: dconst_0
    //   198: dconst_0
    //   199: invokevirtual FWm : (DDD)V
    //   202: aload #12
    //   204: invokevirtual Dne : ()I
    //   207: pop
    //   208: goto -> 385
    //   211: aload #11
    //   213: invokevirtual Dne : ()I
    //   216: bipush #27
    //   218: if_icmpne -> 335
    //   221: aload_0
    //   222: getfield FWm : LzVu;
    //   225: aload #10
    //   227: putfield Dne : LZpi;
    //   230: getstatic WAR.Dne : LWAR;
    //   233: astore #12
    //   235: aload #12
    //   237: invokevirtual Dne : ()V
    //   240: aload #12
    //   242: aload_1
    //   243: getfield div : D
    //   246: invokestatic FWm : (D)I
    //   249: ineg
    //   250: i2f
    //   251: ldc 0.5
    //   253: fsub
    //   254: f2d
    //   255: aload_1
    //   256: getfield IjH : D
    //   259: invokestatic FWm : (D)I
    //   262: ineg
    //   263: i2f
    //   264: ldc 0.5
    //   266: fsub
    //   267: f2d
    //   268: aload_1
    //   269: getfield mrb : D
    //   272: invokestatic FWm : (D)I
    //   275: ineg
    //   276: i2f
    //   277: ldc 0.5
    //   279: fsub
    //   280: f2d
    //   281: invokevirtual FWm : (DDD)V
    //   284: aload_0
    //   285: getfield FWm : LzVu;
    //   288: aload #11
    //   290: checkcast tVs
    //   293: aload_1
    //   294: getfield div : D
    //   297: invokestatic FWm : (D)I
    //   300: aload_1
    //   301: getfield IjH : D
    //   304: invokestatic FWm : (D)I
    //   307: aload_1
    //   308: getfield mrb : D
    //   311: invokestatic FWm : (D)I
    //   314: invokevirtual Dne : (LtVs;III)Z
    //   317: pop
    //   318: aload #12
    //   320: dconst_0
    //   321: dconst_0
    //   322: dconst_0
    //   323: invokevirtual FWm : (DDD)V
    //   326: aload #12
    //   328: invokevirtual Dne : ()I
    //   331: pop
    //   332: goto -> 385
    //   335: aload #11
    //   337: ifnull -> 385
    //   340: aload_0
    //   341: getfield FWm : LzVu;
    //   344: aload #11
    //   346: invokevirtual Dne : (LzKP;)V
    //   349: aload_0
    //   350: getfield FWm : LzVu;
    //   353: aload #11
    //   355: aload #10
    //   357: aload_1
    //   358: getfield div : D
    //   361: invokestatic FWm : (D)I
    //   364: aload_1
    //   365: getfield IjH : D
    //   368: invokestatic FWm : (D)I
    //   371: aload_1
    //   372: getfield mrb : D
    //   375: invokestatic FWm : (D)I
    //   378: aload_1
    //   379: getfield FWm : I
    //   382: invokevirtual Dne : (LzKP;LQnq;IIII)V
    //   385: sipush #2896
    //   388: invokestatic glEnable : (I)V
    //   391: invokestatic glPopMatrix : ()V
    //   394: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zWy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */