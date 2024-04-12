public class OzV extends dyC {
  private int FWm;
  
  private boolean Dne;
  
  private boolean FWm = false;
  
  private int Dne = 0;
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    return this.FWm ? false : super.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  private void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: bipush #100
    //   6: if_icmple -> 34
    //   9: aload_0
    //   10: getfield Dne : LPJQ;
    //   13: aload_0
    //   14: getfield Dne : LPJQ;
    //   17: ldc 'demo.reminder'
    //   19: iconst_0
    //   20: anewarray java/lang/Object
    //   23: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   26: invokevirtual Dne : (Ljava/lang/String;)V
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield Dne : I
    //   34: return
  }
  
  public boolean Dne(FiG paramFiG, Qnq paramQnq, NMq paramNMq) {
    if (this.FWm) {
      FWm();
      return false;
    } 
    return super.Dne(paramFiG, paramQnq, paramNMq);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (!this.FWm)
      super.Dne(paramInt1, paramInt2, paramInt3); 
  }
  
  public boolean Dne(FiG paramFiG, Qnq paramQnq, NMq paramNMq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.FWm) {
      FWm();
      return false;
    } 
    return super.Dne(paramFiG, paramQnq, paramNMq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: dup
    //   6: getfield FWm : I
    //   9: iconst_1
    //   10: iadd
    //   11: putfield FWm : I
    //   14: aload_0
    //   15: getfield Dne : LQnq;
    //   18: invokevirtual FWm : ()J
    //   21: lstore_1
    //   22: lload_1
    //   23: ldc2_w 24000
    //   26: ldiv
    //   27: lconst_1
    //   28: ladd
    //   29: lstore_3
    //   30: aload_0
    //   31: getfield Dne : Z
    //   34: ifne -> 70
    //   37: aload_0
    //   38: getfield FWm : I
    //   41: bipush #20
    //   43: if_icmple -> 70
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield Dne : Z
    //   51: aload_0
    //   52: getfield Dne : LPJQ;
    //   55: getfield Dne : LTnv;
    //   58: new Tnn
    //   61: dup
    //   62: iconst_5
    //   63: iconst_0
    //   64: invokespecial <init> : (II)V
    //   67: invokevirtual Dne : (LNER;)V
    //   70: aload_0
    //   71: lload_1
    //   72: ldc2_w 120500
    //   75: lcmp
    //   76: ifle -> 83
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: putfield FWm : Z
    //   87: aload_0
    //   88: getfield FWm : Z
    //   91: ifeq -> 104
    //   94: aload_0
    //   95: dup
    //   96: getfield Dne : I
    //   99: iconst_1
    //   100: iadd
    //   101: putfield Dne : I
    //   104: lload_1
    //   105: ldc2_w 24000
    //   108: lrem
    //   109: ldc2_w 500
    //   112: lcmp
    //   113: ifne -> 164
    //   116: lload_3
    //   117: ldc2_w 6
    //   120: lcmp
    //   121: ifgt -> 303
    //   124: aload_0
    //   125: getfield Dne : LPJQ;
    //   128: aload_0
    //   129: getfield Dne : LPJQ;
    //   132: new java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial <init> : ()V
    //   139: ldc 'demo.day.'
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: lload_3
    //   145: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   148: invokevirtual toString : ()Ljava/lang/String;
    //   151: iconst_0
    //   152: anewarray java/lang/Object
    //   155: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   158: invokevirtual Dne : (Ljava/lang/String;)V
    //   161: goto -> 303
    //   164: lload_3
    //   165: lconst_1
    //   166: lcmp
    //   167: ifne -> 263
    //   170: lload_1
    //   171: ldc2_w 100
    //   174: lcmp
    //   175: ifne -> 201
    //   178: aload_0
    //   179: getfield Dne : LPJQ;
    //   182: getfield Dne : LTnv;
    //   185: new Tnn
    //   188: dup
    //   189: iconst_5
    //   190: bipush #101
    //   192: invokespecial <init> : (II)V
    //   195: invokevirtual Dne : (LNER;)V
    //   198: goto -> 303
    //   201: lload_1
    //   202: ldc2_w 175
    //   205: lcmp
    //   206: ifne -> 232
    //   209: aload_0
    //   210: getfield Dne : LPJQ;
    //   213: getfield Dne : LTnv;
    //   216: new Tnn
    //   219: dup
    //   220: iconst_5
    //   221: bipush #102
    //   223: invokespecial <init> : (II)V
    //   226: invokevirtual Dne : (LNER;)V
    //   229: goto -> 303
    //   232: lload_1
    //   233: ldc2_w 250
    //   236: lcmp
    //   237: ifne -> 303
    //   240: aload_0
    //   241: getfield Dne : LPJQ;
    //   244: getfield Dne : LTnv;
    //   247: new Tnn
    //   250: dup
    //   251: iconst_5
    //   252: bipush #103
    //   254: invokespecial <init> : (II)V
    //   257: invokevirtual Dne : (LNER;)V
    //   260: goto -> 303
    //   263: lload_3
    //   264: ldc2_w 5
    //   267: lcmp
    //   268: ifne -> 303
    //   271: lload_1
    //   272: ldc2_w 24000
    //   275: lrem
    //   276: ldc2_w 22000
    //   279: lcmp
    //   280: ifne -> 303
    //   283: aload_0
    //   284: getfield Dne : LPJQ;
    //   287: aload_0
    //   288: getfield Dne : LPJQ;
    //   291: ldc 'demo.day.warning'
    //   293: iconst_0
    //   294: anewarray java/lang/Object
    //   297: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   300: invokevirtual Dne : (Ljava/lang/String;)V
    //   303: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.FWm) {
      FWm();
    } else {
      super.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public OzV(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = 0;
    this.FWm = false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OzV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */