public class tUA {
  protected byte[] Dne;
  
  protected OTl Dne;
  
  protected boolean Dne;
  
  protected int Dne;
  
  protected boolean FWm;
  
  protected boolean bzF;
  
  public tUA(OTl paramOTl) {
    this.Dne = paramOTl;
    this.Dne = new byte[paramOTl.Dne()];
    this.Dne = 0;
    String str = paramOTl.Dne();
    int i = str.indexOf('/') + 1;
    this.bzF = (i > 0 && str.startsWith("PGP", i));
    if (this.bzF) {
      this.FWm = true;
    } else {
      this.FWm = (i > 0 && (str.startsWith("CFB", i) || str.startsWith("OFB", i) || str.startsWith("OpenPGP", i) || str.startsWith("SIC", i) || str.startsWith("GCTR", i)));
    } 
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LOTl;
    //   4: invokeinterface Dne : ()I
    //   9: ireturn
  }
  
  public int Dne(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield Dne : I
    //   5: iadd
    //   6: istore_2
    //   7: aload_0
    //   8: getfield bzF : Z
    //   11: ifeq -> 37
    //   14: iload_2
    //   15: aload_0
    //   16: getfield Dne : [B
    //   19: arraylength
    //   20: irem
    //   21: aload_0
    //   22: getfield Dne : LOTl;
    //   25: invokeinterface Dne : ()I
    //   30: iconst_2
    //   31: iadd
    //   32: isub
    //   33: istore_3
    //   34: goto -> 45
    //   37: iload_2
    //   38: aload_0
    //   39: getfield Dne : [B
    //   42: arraylength
    //   43: irem
    //   44: istore_3
    //   45: iload_2
    //   46: iload_3
    //   47: isub
    //   48: ireturn
  }
  
  protected tUA() {}
  
  public int Dne(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload_2
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: iadd
    //   9: aload_1
    //   10: arraylength
    //   11: if_icmple -> 24
    //   14: new Gtk
    //   17: dup
    //   18: ldc 'output buffer too short for doFinal()'
    //   20: invokespecial <init> : (Ljava/lang/String;)V
    //   23: athrow
    //   24: aload_0
    //   25: getfield Dne : I
    //   28: ifeq -> 91
    //   31: aload_0
    //   32: getfield FWm : Z
    //   35: ifne -> 48
    //   38: new Gtk
    //   41: dup
    //   42: ldc 'data not block size aligned'
    //   44: invokespecial <init> : (Ljava/lang/String;)V
    //   47: athrow
    //   48: aload_0
    //   49: getfield Dne : LOTl;
    //   52: aload_0
    //   53: getfield Dne : [B
    //   56: iconst_0
    //   57: aload_0
    //   58: getfield Dne : [B
    //   61: iconst_0
    //   62: invokeinterface Dne : ([BI[BI)I
    //   67: pop
    //   68: aload_0
    //   69: getfield Dne : I
    //   72: istore #4
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield Dne : I
    //   79: aload_0
    //   80: getfield Dne : [B
    //   83: iconst_0
    //   84: aload_1
    //   85: iload_2
    //   86: iload #4
    //   88: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   91: iload #4
    //   93: istore_3
    //   94: aload_0
    //   95: invokevirtual Dne : ()V
    //   98: goto -> 110
    //   101: astore #5
    //   103: aload_0
    //   104: invokevirtual Dne : ()V
    //   107: aload #5
    //   109: athrow
    //   110: iload_3
    //   111: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	94	101	finally
    //   101	103	101	finally
  }
  
  public void Dne(boolean paramBoolean, ePy paramePy) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield Dne : Z
    //   5: aload_0
    //   6: invokevirtual Dne : ()V
    //   9: aload_0
    //   10: getfield Dne : LOTl;
    //   13: iload_1
    //   14: aload_2
    //   15: invokeinterface Dne : (ZLePy;)V
    //   20: return
  }
  
  public int FWm(int paramInt) {
    return paramInt + this.Dne;
  }
  
  public int Dne(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: ifge -> 14
    //   4: new java/lang/IllegalArgumentException
    //   7: dup
    //   8: ldc 'Can't have a negative input length!'
    //   10: invokespecial <init> : (Ljava/lang/String;)V
    //   13: athrow
    //   14: aload_0
    //   15: invokevirtual Dne : ()I
    //   18: istore #6
    //   20: aload_0
    //   21: iload_3
    //   22: invokevirtual Dne : (I)I
    //   25: istore #7
    //   27: iload #7
    //   29: ifle -> 53
    //   32: iload #5
    //   34: iload #7
    //   36: iadd
    //   37: aload #4
    //   39: arraylength
    //   40: if_icmple -> 53
    //   43: new Gtk
    //   46: dup
    //   47: ldc 'output buffer too short'
    //   49: invokespecial <init> : (Ljava/lang/String;)V
    //   52: athrow
    //   53: iconst_0
    //   54: istore #8
    //   56: aload_0
    //   57: getfield Dne : [B
    //   60: arraylength
    //   61: aload_0
    //   62: getfield Dne : I
    //   65: isub
    //   66: istore #9
    //   68: iload_3
    //   69: iload #9
    //   71: if_icmple -> 172
    //   74: aload_1
    //   75: iload_2
    //   76: aload_0
    //   77: getfield Dne : [B
    //   80: aload_0
    //   81: getfield Dne : I
    //   84: iload #9
    //   86: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   89: iload #8
    //   91: aload_0
    //   92: getfield Dne : LOTl;
    //   95: aload_0
    //   96: getfield Dne : [B
    //   99: iconst_0
    //   100: aload #4
    //   102: iload #5
    //   104: invokeinterface Dne : ([BI[BI)I
    //   109: iadd
    //   110: istore #8
    //   112: aload_0
    //   113: iconst_0
    //   114: putfield Dne : I
    //   117: iload_3
    //   118: iload #9
    //   120: isub
    //   121: istore_3
    //   122: iload_2
    //   123: iload #9
    //   125: iadd
    //   126: istore_2
    //   127: iload_3
    //   128: aload_0
    //   129: getfield Dne : [B
    //   132: arraylength
    //   133: if_icmple -> 172
    //   136: iload #8
    //   138: aload_0
    //   139: getfield Dne : LOTl;
    //   142: aload_1
    //   143: iload_2
    //   144: aload #4
    //   146: iload #5
    //   148: iload #8
    //   150: iadd
    //   151: invokeinterface Dne : ([BI[BI)I
    //   156: iadd
    //   157: istore #8
    //   159: iload_3
    //   160: iload #6
    //   162: isub
    //   163: istore_3
    //   164: iload_2
    //   165: iload #6
    //   167: iadd
    //   168: istore_2
    //   169: goto -> 127
    //   172: aload_1
    //   173: iload_2
    //   174: aload_0
    //   175: getfield Dne : [B
    //   178: aload_0
    //   179: getfield Dne : I
    //   182: iload_3
    //   183: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   186: aload_0
    //   187: dup
    //   188: getfield Dne : I
    //   191: iload_3
    //   192: iadd
    //   193: putfield Dne : I
    //   196: aload_0
    //   197: getfield Dne : I
    //   200: aload_0
    //   201: getfield Dne : [B
    //   204: arraylength
    //   205: if_icmpne -> 239
    //   208: iload #8
    //   210: aload_0
    //   211: getfield Dne : LOTl;
    //   214: aload_0
    //   215: getfield Dne : [B
    //   218: iconst_0
    //   219: aload #4
    //   221: iload #5
    //   223: iload #8
    //   225: iadd
    //   226: invokeinterface Dne : ([BI[BI)I
    //   231: iadd
    //   232: istore #8
    //   234: aload_0
    //   235: iconst_0
    //   236: putfield Dne : I
    //   239: iload #8
    //   241: ireturn
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield Dne : [B
    //   7: arraylength
    //   8: if_icmpge -> 24
    //   11: aload_0
    //   12: getfield Dne : [B
    //   15: iload_1
    //   16: iconst_0
    //   17: bastore
    //   18: iinc #1, 1
    //   21: goto -> 2
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield Dne : I
    //   29: aload_0
    //   30: getfield Dne : LOTl;
    //   33: invokeinterface Dne : ()V
    //   38: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tUA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */