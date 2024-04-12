public class svf extends QCe {
  private float bzF;
  
  public svf(float paramFloat) {
    this.bzF = paramFloat;
  }
  
  public void Dne(Tdr paramTdr, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: invokestatic glPushMatrix : ()V
    //   3: dload_2
    //   4: d2f
    //   5: dload #4
    //   7: d2f
    //   8: dload #6
    //   10: d2f
    //   11: invokestatic glTranslatef : (FFF)V
    //   14: ldc 32826
    //   16: invokestatic glEnable : (I)V
    //   19: aload_0
    //   20: getfield bzF : F
    //   23: fstore #10
    //   25: fload #10
    //   27: fconst_1
    //   28: fdiv
    //   29: fload #10
    //   31: fconst_1
    //   32: fdiv
    //   33: fload #10
    //   35: fconst_1
    //   36: fdiv
    //   37: invokestatic glScalef : (FFF)V
    //   40: getstatic dEr.lDk : LdEr;
    //   43: iconst_0
    //   44: invokevirtual Dne : (I)LgDn;
    //   47: astore #11
    //   49: aload_0
    //   50: ldc '/gui/items.png'
    //   52: invokevirtual Dne : (Ljava/lang/String;)V
    //   55: getstatic WAR.Dne : LWAR;
    //   58: astore #12
    //   60: aload #11
    //   62: invokeinterface Dne : ()F
    //   67: fstore #13
    //   69: aload #11
    //   71: invokeinterface FWm : ()F
    //   76: fstore #14
    //   78: aload #11
    //   80: invokeinterface bzF : ()F
    //   85: fstore #15
    //   87: aload #11
    //   89: invokeinterface Qnq : ()F
    //   94: fstore #16
    //   96: fconst_1
    //   97: fstore #17
    //   99: ldc 0.5
    //   101: fstore #18
    //   103: ldc 0.25
    //   105: fstore #19
    //   107: ldc 180.0
    //   109: aload_0
    //   110: getfield Dne : LptH;
    //   113: getfield Dne : F
    //   116: fsub
    //   117: fconst_0
    //   118: fconst_1
    //   119: fconst_0
    //   120: invokestatic glRotatef : (FFFF)V
    //   123: aload_0
    //   124: getfield Dne : LptH;
    //   127: getfield FWm : F
    //   130: fneg
    //   131: fconst_1
    //   132: fconst_0
    //   133: fconst_0
    //   134: invokestatic glRotatef : (FFFF)V
    //   137: aload #12
    //   139: invokevirtual Dne : ()V
    //   142: aload #12
    //   144: fconst_0
    //   145: fconst_1
    //   146: fconst_0
    //   147: invokevirtual FWm : (FFF)V
    //   150: aload #12
    //   152: fconst_0
    //   153: fload #18
    //   155: fsub
    //   156: f2d
    //   157: fconst_0
    //   158: fload #19
    //   160: fsub
    //   161: f2d
    //   162: dconst_0
    //   163: fload #13
    //   165: f2d
    //   166: fload #16
    //   168: f2d
    //   169: invokevirtual Dne : (DDDDD)V
    //   172: aload #12
    //   174: fload #17
    //   176: fload #18
    //   178: fsub
    //   179: f2d
    //   180: fconst_0
    //   181: fload #19
    //   183: fsub
    //   184: f2d
    //   185: dconst_0
    //   186: fload #14
    //   188: f2d
    //   189: fload #16
    //   191: f2d
    //   192: invokevirtual Dne : (DDDDD)V
    //   195: aload #12
    //   197: fload #17
    //   199: fload #18
    //   201: fsub
    //   202: f2d
    //   203: fconst_1
    //   204: fload #19
    //   206: fsub
    //   207: f2d
    //   208: dconst_0
    //   209: fload #14
    //   211: f2d
    //   212: fload #15
    //   214: f2d
    //   215: invokevirtual Dne : (DDDDD)V
    //   218: aload #12
    //   220: fconst_0
    //   221: fload #18
    //   223: fsub
    //   224: f2d
    //   225: fconst_1
    //   226: fload #19
    //   228: fsub
    //   229: f2d
    //   230: dconst_0
    //   231: fload #13
    //   233: f2d
    //   234: fload #15
    //   236: f2d
    //   237: invokevirtual Dne : (DDDDD)V
    //   240: aload #12
    //   242: invokevirtual Dne : ()I
    //   245: pop
    //   246: ldc 32826
    //   248: invokestatic glDisable : (I)V
    //   251: invokestatic glPopMatrix : ()V
    //   254: return
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Tdr)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\svf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */