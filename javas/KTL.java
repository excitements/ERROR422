public class KTL extends xPm {
  private double Dne;
  
  private double FWm;
  
  public KTL() {
    super("compass");
  }
  
  public void Dne() {
    // Byte code:
    //   0: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   3: astore_1
    //   4: dconst_0
    //   5: dstore_2
    //   6: aload_1
    //   7: getfield Dne : LVzZ;
    //   10: ifnull -> 51
    //   13: aload_1
    //   14: getfield Dne : LMJs;
    //   17: ifnull -> 51
    //   20: aload_1
    //   21: getfield Dne : LVzZ;
    //   24: fconst_1
    //   25: invokevirtual FWm : (F)F
    //   28: fstore #4
    //   30: fload #4
    //   32: f2d
    //   33: dstore_2
    //   34: aload_1
    //   35: getfield Dne : LVzZ;
    //   38: getfield Dne : LJik;
    //   41: invokevirtual Dne : ()Z
    //   44: ifne -> 51
    //   47: invokestatic random : ()D
    //   50: dstore_2
    //   51: dload_2
    //   52: aload_0
    //   53: getfield Dne : D
    //   56: dsub
    //   57: dstore #4
    //   59: dload #4
    //   61: ldc2_w -0.5
    //   64: dcmpg
    //   65: ifge -> 77
    //   68: dload #4
    //   70: dconst_1
    //   71: dadd
    //   72: dstore #4
    //   74: goto -> 59
    //   77: dload #4
    //   79: ldc2_w 0.5
    //   82: dcmpl
    //   83: iflt -> 95
    //   86: dload #4
    //   88: dconst_1
    //   89: dsub
    //   90: dstore #4
    //   92: goto -> 77
    //   95: dload #4
    //   97: ldc2_w -1.0
    //   100: dcmpg
    //   101: ifge -> 109
    //   104: ldc2_w -1.0
    //   107: dstore #4
    //   109: dload #4
    //   111: dconst_1
    //   112: dcmpl
    //   113: ifle -> 119
    //   116: dconst_1
    //   117: dstore #4
    //   119: aload_0
    //   120: dup
    //   121: getfield FWm : D
    //   124: dload #4
    //   126: ldc2_w 0.1
    //   129: dmul
    //   130: dadd
    //   131: putfield FWm : D
    //   134: aload_0
    //   135: dup
    //   136: getfield FWm : D
    //   139: ldc2_w 0.8
    //   142: dmul
    //   143: putfield FWm : D
    //   146: aload_0
    //   147: dup
    //   148: getfield Dne : D
    //   151: aload_0
    //   152: getfield FWm : D
    //   155: dadd
    //   156: putfield Dne : D
    //   159: aload_0
    //   160: getfield Dne : D
    //   163: dconst_1
    //   164: dadd
    //   165: aload_0
    //   166: getfield Dne : Ljava/util/List;
    //   169: invokeinterface size : ()I
    //   174: i2d
    //   175: dmul
    //   176: d2i
    //   177: aload_0
    //   178: getfield Dne : Ljava/util/List;
    //   181: invokeinterface size : ()I
    //   186: irem
    //   187: istore #6
    //   189: iload #6
    //   191: ifge -> 221
    //   194: iload #6
    //   196: aload_0
    //   197: getfield Dne : Ljava/util/List;
    //   200: invokeinterface size : ()I
    //   205: iadd
    //   206: aload_0
    //   207: getfield Dne : Ljava/util/List;
    //   210: invokeinterface size : ()I
    //   215: irem
    //   216: istore #6
    //   218: goto -> 189
    //   221: iload #6
    //   223: aload_0
    //   224: getfield bzF : I
    //   227: if_icmpeq -> 271
    //   230: aload_0
    //   231: iload #6
    //   233: putfield bzF : I
    //   236: aload_0
    //   237: getfield Dne : Ldmo;
    //   240: aload_0
    //   241: getfield Dne : I
    //   244: aload_0
    //   245: getfield FWm : I
    //   248: aload_0
    //   249: getfield Dne : Ljava/util/List;
    //   252: aload_0
    //   253: getfield bzF : I
    //   256: invokeinterface get : (I)Ljava/lang/Object;
    //   261: checkcast dmo
    //   264: aload_0
    //   265: getfield Dne : Z
    //   268: invokevirtual Dne : (IILdmo;Z)V
    //   271: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KTL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */