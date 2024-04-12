public class nJg {
  private byte[] Dne;
  
  final Ilk Dne;
  
  public int Dne;
  
  public int[] FWm;
  
  public int[] Dne;
  
  public final FiG Dne;
  
  private int bzF;
  
  private boolean Dne;
  
  private int FWm;
  
  public byte[] Dne(NMq paramNMq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifne -> 32
    //   7: iconst_2
    //   8: newarray byte
    //   10: dup
    //   11: iconst_0
    //   12: iconst_2
    //   13: bastore
    //   14: dup
    //   15: iconst_1
    //   16: aload_0
    //   17: getfield Dne : LIlk;
    //   20: getfield FWm : B
    //   23: bastore
    //   24: astore_2
    //   25: aload_0
    //   26: iconst_1
    //   27: putfield Dne : Z
    //   30: aload_2
    //   31: areturn
    //   32: aload_0
    //   33: dup
    //   34: getfield bzF : I
    //   37: iconst_1
    //   38: isub
    //   39: dup_x1
    //   40: putfield bzF : I
    //   43: ifge -> 253
    //   46: aload_0
    //   47: iconst_4
    //   48: putfield bzF : I
    //   51: aload_0
    //   52: getfield Dne : LIlk;
    //   55: getfield Dne : Ljava/util/Map;
    //   58: invokeinterface size : ()I
    //   63: iconst_3
    //   64: imul
    //   65: iconst_1
    //   66: iadd
    //   67: newarray byte
    //   69: astore_2
    //   70: aload_2
    //   71: iconst_0
    //   72: iconst_1
    //   73: bastore
    //   74: iconst_0
    //   75: istore_3
    //   76: aload_0
    //   77: getfield Dne : LIlk;
    //   80: getfield Dne : Ljava/util/Map;
    //   83: invokeinterface values : ()Ljava/util/Collection;
    //   88: invokeinterface iterator : ()Ljava/util/Iterator;
    //   93: astore #5
    //   95: aload #5
    //   97: invokeinterface hasNext : ()Z
    //   102: ifeq -> 171
    //   105: aload #5
    //   107: invokeinterface next : ()Ljava/lang/Object;
    //   112: checkcast GHe
    //   115: astore #6
    //   117: aload_2
    //   118: iload_3
    //   119: iconst_3
    //   120: imul
    //   121: iconst_1
    //   122: iadd
    //   123: aload #6
    //   125: getfield Dne : B
    //   128: iconst_4
    //   129: ishl
    //   130: aload #6
    //   132: getfield Qnq : B
    //   135: bipush #15
    //   137: iand
    //   138: ior
    //   139: i2b
    //   140: bastore
    //   141: aload_2
    //   142: iload_3
    //   143: iconst_3
    //   144: imul
    //   145: iconst_2
    //   146: iadd
    //   147: aload #6
    //   149: getfield FWm : B
    //   152: bastore
    //   153: aload_2
    //   154: iload_3
    //   155: iconst_3
    //   156: imul
    //   157: iconst_3
    //   158: iadd
    //   159: aload #6
    //   161: getfield bzF : B
    //   164: bastore
    //   165: iinc #3, 1
    //   168: goto -> 95
    //   171: aload_1
    //   172: invokevirtual XHL : ()Z
    //   175: ifne -> 182
    //   178: iconst_1
    //   179: goto -> 183
    //   182: iconst_0
    //   183: istore #5
    //   185: aload_0
    //   186: getfield Dne : [B
    //   189: ifnull -> 238
    //   192: aload_0
    //   193: getfield Dne : [B
    //   196: arraylength
    //   197: aload_2
    //   198: arraylength
    //   199: if_icmpne -> 238
    //   202: iconst_0
    //   203: istore #4
    //   205: iload #4
    //   207: aload_2
    //   208: arraylength
    //   209: if_icmpge -> 241
    //   212: aload_2
    //   213: iload #4
    //   215: baload
    //   216: aload_0
    //   217: getfield Dne : [B
    //   220: iload #4
    //   222: baload
    //   223: if_icmpeq -> 232
    //   226: iconst_0
    //   227: istore #5
    //   229: goto -> 241
    //   232: iinc #4, 1
    //   235: goto -> 205
    //   238: iconst_0
    //   239: istore #5
    //   241: iload #5
    //   243: ifne -> 253
    //   246: aload_0
    //   247: aload_2
    //   248: putfield Dne : [B
    //   251: aload_2
    //   252: areturn
    //   253: iconst_0
    //   254: istore #5
    //   256: iload #5
    //   258: iconst_1
    //   259: if_icmpge -> 409
    //   262: aload_0
    //   263: dup
    //   264: getfield FWm : I
    //   267: dup_x1
    //   268: iconst_1
    //   269: iadd
    //   270: putfield FWm : I
    //   273: bipush #11
    //   275: imul
    //   276: sipush #128
    //   279: irem
    //   280: istore_3
    //   281: aload_0
    //   282: getfield Dne : [I
    //   285: iload_3
    //   286: iaload
    //   287: iflt -> 403
    //   290: aload_0
    //   291: getfield FWm : [I
    //   294: iload_3
    //   295: iaload
    //   296: aload_0
    //   297: getfield Dne : [I
    //   300: iload_3
    //   301: iaload
    //   302: isub
    //   303: iconst_1
    //   304: iadd
    //   305: istore #6
    //   307: aload_0
    //   308: getfield Dne : [I
    //   311: iload_3
    //   312: iaload
    //   313: istore #4
    //   315: iload #6
    //   317: iconst_3
    //   318: iadd
    //   319: newarray byte
    //   321: astore #7
    //   323: aload #7
    //   325: iconst_0
    //   326: iconst_0
    //   327: bastore
    //   328: aload #7
    //   330: iconst_1
    //   331: iload_3
    //   332: i2b
    //   333: bastore
    //   334: aload #7
    //   336: iconst_2
    //   337: iload #4
    //   339: i2b
    //   340: bastore
    //   341: iconst_0
    //   342: istore #8
    //   344: iload #8
    //   346: aload #7
    //   348: arraylength
    //   349: iconst_3
    //   350: isub
    //   351: if_icmpge -> 386
    //   354: aload #7
    //   356: iload #8
    //   358: iconst_3
    //   359: iadd
    //   360: aload_0
    //   361: getfield Dne : LIlk;
    //   364: getfield Dne : [B
    //   367: iload #8
    //   369: iload #4
    //   371: iadd
    //   372: sipush #128
    //   375: imul
    //   376: iload_3
    //   377: iadd
    //   378: baload
    //   379: bastore
    //   380: iinc #8, 1
    //   383: goto -> 344
    //   386: aload_0
    //   387: getfield FWm : [I
    //   390: iload_3
    //   391: iconst_m1
    //   392: iastore
    //   393: aload_0
    //   394: getfield Dne : [I
    //   397: iload_3
    //   398: iconst_m1
    //   399: iastore
    //   400: aload #7
    //   402: areturn
    //   403: iinc #5, 1
    //   406: goto -> 256
    //   409: aconst_null
    //   410: areturn
  }
  
  public nJg(Ilk paramIlk, FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Dne : LIlk;
    //   9: aload_0
    //   10: sipush #128
    //   13: newarray int
    //   15: putfield Dne : [I
    //   18: aload_0
    //   19: sipush #128
    //   22: newarray int
    //   24: putfield FWm : [I
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield FWm : I
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield bzF : I
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield Dne : Z
    //   42: aload_0
    //   43: aload_2
    //   44: putfield Dne : LFiG;
    //   47: iconst_0
    //   48: istore_3
    //   49: iload_3
    //   50: aload_0
    //   51: getfield Dne : [I
    //   54: arraylength
    //   55: if_icmpge -> 79
    //   58: aload_0
    //   59: getfield Dne : [I
    //   62: iload_3
    //   63: iconst_0
    //   64: iastore
    //   65: aload_0
    //   66: getfield FWm : [I
    //   69: iload_3
    //   70: bipush #127
    //   72: iastore
    //   73: iinc #3, 1
    //   76: goto -> 49
    //   79: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nJg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */