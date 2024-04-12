import java.util.List;

public class CEb extends xZE {
  public String Dne() {
    return "tp";
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length != 1 && paramArrayOfString.length != 2) ? null : Dne(paramArrayOfString, Jwh.Dne().Dne());
  }
  
  public int Dne() {
    return 2;
  }
  
  private double Dne(gnI paramgnI, double paramDouble, String paramString) {
    return Dne(paramgnI, paramDouble, paramString, -30000000, 30000000);
  }
  
  static {
  
  }
  
  private double Dne(gnI paramgnI, double paramDouble, String paramString, int paramInt1, int paramInt2) {
    boolean bool = paramString.startsWith("~");
    double d = bool ? paramDouble : 0.0D;
    if (!bool || paramString.length() > 1) {
      boolean bool1 = paramString.contains(".");
      if (bool)
        paramString = paramString.substring(1); 
      d += Dne(paramgnI, paramString);
      if (!bool1 && !bool)
        d += 0.5D; 
    } 
    if (paramInt1 != 0 || paramInt2 != 0) {
      if (d < paramInt1)
        throw new PUA("commands.generic.double.tooSmall", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt1) }); 
      if (d > paramInt2)
        throw new PUA("commands.generic.double.tooBig", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt2) }); 
    } 
    return d;
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.tp.usage", new Object[0]);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge -> 20
    //   6: new fxw
    //   9: dup
    //   10: ldc 'commands.tp.usage'
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: athrow
    //   20: aload_2
    //   21: arraylength
    //   22: iconst_2
    //   23: if_icmpeq -> 40
    //   26: aload_2
    //   27: arraylength
    //   28: iconst_4
    //   29: if_icmpeq -> 40
    //   32: aload_1
    //   33: invokestatic Dne : (LgnI;)LPJQ;
    //   36: astore_3
    //   37: goto -> 60
    //   40: aload_1
    //   41: aload_2
    //   42: iconst_0
    //   43: aaload
    //   44: invokestatic Dne : (LgnI;Ljava/lang/String;)LPJQ;
    //   47: astore_3
    //   48: aload_3
    //   49: ifnonnull -> 60
    //   52: new FKZ
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: athrow
    //   60: aload_2
    //   61: arraylength
    //   62: iconst_3
    //   63: if_icmpeq -> 200
    //   66: aload_2
    //   67: arraylength
    //   68: iconst_4
    //   69: if_icmpeq -> 200
    //   72: aload_2
    //   73: arraylength
    //   74: iconst_1
    //   75: if_icmpeq -> 84
    //   78: aload_2
    //   79: arraylength
    //   80: iconst_2
    //   81: if_icmpne -> 328
    //   84: aload_1
    //   85: aload_2
    //   86: aload_2
    //   87: arraylength
    //   88: iconst_1
    //   89: isub
    //   90: aaload
    //   91: invokestatic Dne : (LgnI;Ljava/lang/String;)LPJQ;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnonnull -> 109
    //   101: new FKZ
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: athrow
    //   109: aload #4
    //   111: getfield Dne : LQnq;
    //   114: aload_3
    //   115: getfield Dne : LQnq;
    //   118: if_acmpeq -> 132
    //   121: aload_1
    //   122: ldc 'commands.tp.notSameDimension'
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: return
    //   132: aload_3
    //   133: aconst_null
    //   134: checkcast sMa
    //   137: invokevirtual bzF : (LsMa;)V
    //   140: aload_3
    //   141: getfield Dne : LTnv;
    //   144: aload #4
    //   146: getfield div : D
    //   149: aload #4
    //   151: getfield IjH : D
    //   154: aload #4
    //   156: getfield mrb : D
    //   159: aload #4
    //   161: getfield mrb : F
    //   164: aload #4
    //   166: getfield XHL : F
    //   169: invokevirtual Dne : (DDDFF)V
    //   172: aload_1
    //   173: ldc 'commands.tp.success'
    //   175: iconst_2
    //   176: anewarray java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_3
    //   182: invokevirtual Dne : ()Ljava/lang/String;
    //   185: aastore
    //   186: dup
    //   187: iconst_1
    //   188: aload #4
    //   190: invokevirtual Dne : ()Ljava/lang/String;
    //   193: aastore
    //   194: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: goto -> 328
    //   200: aload_3
    //   201: getfield Dne : LQnq;
    //   204: ifnull -> 328
    //   207: aload_2
    //   208: arraylength
    //   209: iconst_3
    //   210: isub
    //   211: istore #4
    //   213: aload_0
    //   214: aload_1
    //   215: aload_3
    //   216: getfield div : D
    //   219: aload_2
    //   220: iload #4
    //   222: iinc #4, 1
    //   225: aaload
    //   226: invokespecial Dne : (LgnI;DLjava/lang/String;)D
    //   229: dstore #5
    //   231: aload_0
    //   232: aload_1
    //   233: aload_3
    //   234: getfield IjH : D
    //   237: aload_2
    //   238: iload #4
    //   240: iinc #4, 1
    //   243: aaload
    //   244: iconst_0
    //   245: iconst_0
    //   246: invokespecial Dne : (LgnI;DLjava/lang/String;II)D
    //   249: dstore #7
    //   251: aload_0
    //   252: aload_1
    //   253: aload_3
    //   254: getfield mrb : D
    //   257: aload_2
    //   258: iload #4
    //   260: iinc #4, 1
    //   263: aaload
    //   264: invokespecial Dne : (LgnI;DLjava/lang/String;)D
    //   267: dstore #9
    //   269: aload_3
    //   270: aconst_null
    //   271: checkcast sMa
    //   274: invokevirtual bzF : (LsMa;)V
    //   277: aload_3
    //   278: dload #5
    //   280: dload #7
    //   282: dload #9
    //   284: invokevirtual FWm : (DDD)V
    //   287: aload_1
    //   288: ldc 'commands.tp.success.coordinates'
    //   290: iconst_4
    //   291: anewarray java/lang/Object
    //   294: dup
    //   295: iconst_0
    //   296: aload_3
    //   297: invokevirtual Dne : ()Ljava/lang/String;
    //   300: aastore
    //   301: dup
    //   302: iconst_1
    //   303: dload #5
    //   305: invokestatic valueOf : (D)Ljava/lang/Double;
    //   308: aastore
    //   309: dup
    //   310: iconst_2
    //   311: dload #7
    //   313: invokestatic valueOf : (D)Ljava/lang/Double;
    //   316: aastore
    //   317: dup
    //   318: iconst_3
    //   319: dload #9
    //   321: invokestatic valueOf : (D)Ljava/lang/Double;
    //   324: aastore
    //   325: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CEb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */