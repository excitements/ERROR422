import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;

public class iNQ {
  private int Dne;
  
  private ArrayList Dne;
  
  private static final byte[] Dne = new byte[4096];
  
  private RandomAccessFile Dne;
  
  private final int[] Dne;
  
  private final int[] FWm;
  
  private final File Dne;
  
  private long Dne;
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [I
    //   4: iload_1
    //   5: iload_2
    //   6: bipush #32
    //   8: imul
    //   9: iadd
    //   10: iload_3
    //   11: iastore
    //   12: aload_0
    //   13: getfield Dne : Ljava/io/RandomAccessFile;
    //   16: iload_1
    //   17: iload_2
    //   18: bipush #32
    //   20: imul
    //   21: iadd
    //   22: iconst_4
    //   23: imul
    //   24: i2l
    //   25: invokevirtual seek : (J)V
    //   28: aload_0
    //   29: getfield Dne : Ljava/io/RandomAccessFile;
    //   32: iload_3
    //   33: invokevirtual writeInt : (I)V
    //   36: return
  }
  
  protected synchronized void Dne(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial Dne : (II)I
    //   6: istore #5
    //   8: iload #5
    //   10: bipush #8
    //   12: ishr
    //   13: istore #6
    //   15: iload #5
    //   17: sipush #255
    //   20: iand
    //   21: istore #7
    //   23: iload #4
    //   25: iconst_5
    //   26: iadd
    //   27: sipush #4096
    //   30: idiv
    //   31: iconst_1
    //   32: iadd
    //   33: istore #8
    //   35: iload #8
    //   37: sipush #256
    //   40: if_icmplt -> 44
    //   43: return
    //   44: iload #6
    //   46: ifeq -> 68
    //   49: iload #7
    //   51: iload #8
    //   53: if_icmpne -> 68
    //   56: aload_0
    //   57: iload #6
    //   59: aload_3
    //   60: iload #4
    //   62: invokespecial Dne : (I[BI)V
    //   65: goto -> 384
    //   68: iconst_0
    //   69: istore #9
    //   71: iload #9
    //   73: iload #7
    //   75: if_icmpge -> 101
    //   78: aload_0
    //   79: getfield Dne : Ljava/util/ArrayList;
    //   82: iload #6
    //   84: iload #9
    //   86: iadd
    //   87: iconst_1
    //   88: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   91: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   94: pop
    //   95: iinc #9, 1
    //   98: goto -> 71
    //   101: aload_0
    //   102: getfield Dne : Ljava/util/ArrayList;
    //   105: iconst_1
    //   106: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   109: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   112: istore #9
    //   114: iconst_0
    //   115: istore #10
    //   117: iload #9
    //   119: iconst_m1
    //   120: if_icmpeq -> 215
    //   123: iload #9
    //   125: istore #11
    //   127: iload #11
    //   129: aload_0
    //   130: getfield Dne : Ljava/util/ArrayList;
    //   133: invokevirtual size : ()I
    //   136: if_icmpge -> 215
    //   139: iload #10
    //   141: ifeq -> 174
    //   144: aload_0
    //   145: getfield Dne : Ljava/util/ArrayList;
    //   148: iload #11
    //   150: invokevirtual get : (I)Ljava/lang/Object;
    //   153: checkcast java/lang/Boolean
    //   156: invokevirtual booleanValue : ()Z
    //   159: ifeq -> 168
    //   162: iinc #10, 1
    //   165: goto -> 199
    //   168: iconst_0
    //   169: istore #10
    //   171: goto -> 199
    //   174: aload_0
    //   175: getfield Dne : Ljava/util/ArrayList;
    //   178: iload #11
    //   180: invokevirtual get : (I)Ljava/lang/Object;
    //   183: checkcast java/lang/Boolean
    //   186: invokevirtual booleanValue : ()Z
    //   189: ifeq -> 199
    //   192: iload #11
    //   194: istore #9
    //   196: iconst_1
    //   197: istore #10
    //   199: iload #10
    //   201: iload #8
    //   203: if_icmplt -> 209
    //   206: goto -> 215
    //   209: iinc #11, 1
    //   212: goto -> 127
    //   215: iload #10
    //   217: iload #8
    //   219: if_icmplt -> 285
    //   222: iload #9
    //   224: istore #6
    //   226: aload_0
    //   227: iload_1
    //   228: iload_2
    //   229: iload #9
    //   231: bipush #8
    //   233: ishl
    //   234: iload #8
    //   236: ior
    //   237: invokespecial Dne : (III)V
    //   240: iconst_0
    //   241: istore #11
    //   243: iload #11
    //   245: iload #8
    //   247: if_icmpge -> 273
    //   250: aload_0
    //   251: getfield Dne : Ljava/util/ArrayList;
    //   254: iload #6
    //   256: iload #11
    //   258: iadd
    //   259: iconst_0
    //   260: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   263: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   266: pop
    //   267: iinc #11, 1
    //   270: goto -> 243
    //   273: aload_0
    //   274: iload #6
    //   276: aload_3
    //   277: iload #4
    //   279: invokespecial Dne : (I[BI)V
    //   282: goto -> 384
    //   285: aload_0
    //   286: getfield Dne : Ljava/io/RandomAccessFile;
    //   289: aload_0
    //   290: getfield Dne : Ljava/io/RandomAccessFile;
    //   293: invokevirtual length : ()J
    //   296: invokevirtual seek : (J)V
    //   299: aload_0
    //   300: getfield Dne : Ljava/util/ArrayList;
    //   303: invokevirtual size : ()I
    //   306: istore #6
    //   308: iconst_0
    //   309: istore #11
    //   311: iload #11
    //   313: iload #8
    //   315: if_icmpge -> 346
    //   318: aload_0
    //   319: getfield Dne : Ljava/io/RandomAccessFile;
    //   322: getstatic iNQ.Dne : [B
    //   325: invokevirtual write : ([B)V
    //   328: aload_0
    //   329: getfield Dne : Ljava/util/ArrayList;
    //   332: iconst_0
    //   333: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   336: invokevirtual add : (Ljava/lang/Object;)Z
    //   339: pop
    //   340: iinc #11, 1
    //   343: goto -> 311
    //   346: aload_0
    //   347: dup
    //   348: getfield Dne : I
    //   351: sipush #4096
    //   354: iload #8
    //   356: imul
    //   357: iadd
    //   358: putfield Dne : I
    //   361: aload_0
    //   362: iload #6
    //   364: aload_3
    //   365: iload #4
    //   367: invokespecial Dne : (I[BI)V
    //   370: aload_0
    //   371: iload_1
    //   372: iload_2
    //   373: iload #6
    //   375: bipush #8
    //   377: ishl
    //   378: iload #8
    //   380: ior
    //   381: invokespecial Dne : (III)V
    //   384: aload_0
    //   385: iload_1
    //   386: iload_2
    //   387: invokestatic currentTimeMillis : ()J
    //   390: ldc2_w 1000
    //   393: ldiv
    //   394: l2i
    //   395: invokespecial FWm : (III)V
    //   398: goto -> 408
    //   401: astore #5
    //   403: aload #5
    //   405: invokevirtual printStackTrace : ()V
    //   408: return
    // Exception table:
    //   from	to	target	type
    //   0	43	401	java/io/IOException
    //   44	398	401	java/io/IOException
  }
  
  private int Dne(int paramInt1, int paramInt2) {
    return this.Dne[paramInt1 + paramInt2 * 32];
  }
  
  public iNQ(File paramFile) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: sipush #1024
    //   8: newarray int
    //   10: putfield Dne : [I
    //   13: aload_0
    //   14: sipush #1024
    //   17: newarray int
    //   19: putfield FWm : [I
    //   22: aload_0
    //   23: lconst_0
    //   24: putfield Dne : J
    //   27: aload_0
    //   28: aload_1
    //   29: putfield Dne : Ljava/io/File;
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield Dne : I
    //   37: aload_1
    //   38: invokevirtual exists : ()Z
    //   41: ifeq -> 52
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual lastModified : ()J
    //   49: putfield Dne : J
    //   52: aload_0
    //   53: new java/io/RandomAccessFile
    //   56: dup
    //   57: aload_1
    //   58: ldc 'rw'
    //   60: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   63: putfield Dne : Ljava/io/RandomAccessFile;
    //   66: aload_0
    //   67: getfield Dne : Ljava/io/RandomAccessFile;
    //   70: invokevirtual length : ()J
    //   73: ldc2_w 4096
    //   76: lcmp
    //   77: ifge -> 138
    //   80: iconst_0
    //   81: istore_2
    //   82: iload_2
    //   83: sipush #1024
    //   86: if_icmpge -> 103
    //   89: aload_0
    //   90: getfield Dne : Ljava/io/RandomAccessFile;
    //   93: iconst_0
    //   94: invokevirtual writeInt : (I)V
    //   97: iinc #2, 1
    //   100: goto -> 82
    //   103: iconst_0
    //   104: istore_2
    //   105: iload_2
    //   106: sipush #1024
    //   109: if_icmpge -> 126
    //   112: aload_0
    //   113: getfield Dne : Ljava/io/RandomAccessFile;
    //   116: iconst_0
    //   117: invokevirtual writeInt : (I)V
    //   120: iinc #2, 1
    //   123: goto -> 105
    //   126: aload_0
    //   127: dup
    //   128: getfield Dne : I
    //   131: sipush #8192
    //   134: iadd
    //   135: putfield Dne : I
    //   138: aload_0
    //   139: getfield Dne : Ljava/io/RandomAccessFile;
    //   142: invokevirtual length : ()J
    //   145: ldc2_w 4095
    //   148: land
    //   149: lconst_0
    //   150: lcmp
    //   151: ifeq -> 187
    //   154: iconst_0
    //   155: istore_2
    //   156: iload_2
    //   157: i2l
    //   158: aload_0
    //   159: getfield Dne : Ljava/io/RandomAccessFile;
    //   162: invokevirtual length : ()J
    //   165: ldc2_w 4095
    //   168: land
    //   169: lcmp
    //   170: ifge -> 187
    //   173: aload_0
    //   174: getfield Dne : Ljava/io/RandomAccessFile;
    //   177: iconst_0
    //   178: invokevirtual write : (I)V
    //   181: iinc #2, 1
    //   184: goto -> 156
    //   187: aload_0
    //   188: getfield Dne : Ljava/io/RandomAccessFile;
    //   191: invokevirtual length : ()J
    //   194: l2i
    //   195: sipush #4096
    //   198: idiv
    //   199: istore_2
    //   200: aload_0
    //   201: new java/util/ArrayList
    //   204: dup
    //   205: iload_2
    //   206: invokespecial <init> : (I)V
    //   209: putfield Dne : Ljava/util/ArrayList;
    //   212: iconst_0
    //   213: istore_3
    //   214: iload_3
    //   215: iload_2
    //   216: if_icmpge -> 237
    //   219: aload_0
    //   220: getfield Dne : Ljava/util/ArrayList;
    //   223: iconst_1
    //   224: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   227: invokevirtual add : (Ljava/lang/Object;)Z
    //   230: pop
    //   231: iinc #3, 1
    //   234: goto -> 214
    //   237: aload_0
    //   238: getfield Dne : Ljava/util/ArrayList;
    //   241: iconst_0
    //   242: iconst_0
    //   243: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   246: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   249: pop
    //   250: aload_0
    //   251: getfield Dne : Ljava/util/ArrayList;
    //   254: iconst_1
    //   255: iconst_0
    //   256: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   259: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   262: pop
    //   263: aload_0
    //   264: getfield Dne : Ljava/io/RandomAccessFile;
    //   267: lconst_0
    //   268: invokevirtual seek : (J)V
    //   271: iconst_0
    //   272: istore_3
    //   273: iload_3
    //   274: sipush #1024
    //   277: if_icmpge -> 370
    //   280: aload_0
    //   281: getfield Dne : Ljava/io/RandomAccessFile;
    //   284: invokevirtual readInt : ()I
    //   287: istore #4
    //   289: aload_0
    //   290: getfield Dne : [I
    //   293: iload_3
    //   294: iload #4
    //   296: iastore
    //   297: iload #4
    //   299: ifeq -> 364
    //   302: iload #4
    //   304: bipush #8
    //   306: ishr
    //   307: iload #4
    //   309: sipush #255
    //   312: iand
    //   313: iadd
    //   314: aload_0
    //   315: getfield Dne : Ljava/util/ArrayList;
    //   318: invokevirtual size : ()I
    //   321: if_icmpgt -> 364
    //   324: iconst_0
    //   325: istore #5
    //   327: iload #5
    //   329: iload #4
    //   331: sipush #255
    //   334: iand
    //   335: if_icmpge -> 364
    //   338: aload_0
    //   339: getfield Dne : Ljava/util/ArrayList;
    //   342: iload #4
    //   344: bipush #8
    //   346: ishr
    //   347: iload #5
    //   349: iadd
    //   350: iconst_0
    //   351: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   354: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   357: pop
    //   358: iinc #5, 1
    //   361: goto -> 327
    //   364: iinc #3, 1
    //   367: goto -> 273
    //   370: iconst_0
    //   371: istore_3
    //   372: iload_3
    //   373: sipush #1024
    //   376: if_icmpge -> 402
    //   379: aload_0
    //   380: getfield Dne : Ljava/io/RandomAccessFile;
    //   383: invokevirtual readInt : ()I
    //   386: istore #4
    //   388: aload_0
    //   389: getfield FWm : [I
    //   392: iload_3
    //   393: iload #4
    //   395: iastore
    //   396: iinc #3, 1
    //   399: goto -> 372
    //   402: goto -> 410
    //   405: astore_2
    //   406: aload_2
    //   407: invokevirtual printStackTrace : ()V
    //   410: return
    // Exception table:
    //   from	to	target	type
    //   37	402	405	java/io/IOException
  }
  
  private boolean FWm(int paramInt1, int paramInt2) {
    return (paramInt1 < 0 || paramInt1 >= 32 || paramInt2 < 0 || paramInt2 >= 32);
  }
  
  public boolean Dne(int paramInt1, int paramInt2) {
    return (Dne(paramInt1, paramInt2) != 0);
  }
  
  public DataOutputStream Dne(int paramInt1, int paramInt2) {
    return FWm(paramInt1, paramInt2) ? null : new DataOutputStream(new DeflaterOutputStream(new CZC(this, paramInt1, paramInt2)));
  }
  
  public synchronized DataInputStream Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial FWm : (II)Z
    //   6: ifeq -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_0
    //   12: iload_1
    //   13: iload_2
    //   14: invokespecial Dne : (II)I
    //   17: istore_3
    //   18: iload_3
    //   19: ifne -> 24
    //   22: aconst_null
    //   23: areturn
    //   24: iload_3
    //   25: bipush #8
    //   27: ishr
    //   28: istore #4
    //   30: iload_3
    //   31: sipush #255
    //   34: iand
    //   35: istore #5
    //   37: iload #4
    //   39: iload #5
    //   41: iadd
    //   42: aload_0
    //   43: getfield Dne : Ljava/util/ArrayList;
    //   46: invokevirtual size : ()I
    //   49: if_icmple -> 54
    //   52: aconst_null
    //   53: areturn
    //   54: aload_0
    //   55: getfield Dne : Ljava/io/RandomAccessFile;
    //   58: iload #4
    //   60: sipush #4096
    //   63: imul
    //   64: i2l
    //   65: invokevirtual seek : (J)V
    //   68: aload_0
    //   69: getfield Dne : Ljava/io/RandomAccessFile;
    //   72: invokevirtual readInt : ()I
    //   75: istore #6
    //   77: iload #6
    //   79: sipush #4096
    //   82: iload #5
    //   84: imul
    //   85: if_icmple -> 90
    //   88: aconst_null
    //   89: areturn
    //   90: iload #6
    //   92: ifgt -> 97
    //   95: aconst_null
    //   96: areturn
    //   97: aload_0
    //   98: getfield Dne : Ljava/io/RandomAccessFile;
    //   101: invokevirtual readByte : ()B
    //   104: istore #7
    //   106: iload #7
    //   108: iconst_1
    //   109: if_icmpne -> 161
    //   112: iload #6
    //   114: iconst_1
    //   115: isub
    //   116: newarray byte
    //   118: astore #8
    //   120: aload_0
    //   121: getfield Dne : Ljava/io/RandomAccessFile;
    //   124: aload #8
    //   126: invokevirtual read : ([B)I
    //   129: pop
    //   130: new java/io/DataInputStream
    //   133: dup
    //   134: new java/io/BufferedInputStream
    //   137: dup
    //   138: new java/util/zip/GZIPInputStream
    //   141: dup
    //   142: new java/io/ByteArrayInputStream
    //   145: dup
    //   146: aload #8
    //   148: invokespecial <init> : ([B)V
    //   151: invokespecial <init> : (Ljava/io/InputStream;)V
    //   154: invokespecial <init> : (Ljava/io/InputStream;)V
    //   157: invokespecial <init> : (Ljava/io/InputStream;)V
    //   160: areturn
    //   161: iload #7
    //   163: iconst_2
    //   164: if_icmpne -> 216
    //   167: iload #6
    //   169: iconst_1
    //   170: isub
    //   171: newarray byte
    //   173: astore #8
    //   175: aload_0
    //   176: getfield Dne : Ljava/io/RandomAccessFile;
    //   179: aload #8
    //   181: invokevirtual read : ([B)I
    //   184: pop
    //   185: new java/io/DataInputStream
    //   188: dup
    //   189: new java/io/BufferedInputStream
    //   192: dup
    //   193: new java/util/zip/InflaterInputStream
    //   196: dup
    //   197: new java/io/ByteArrayInputStream
    //   200: dup
    //   201: aload #8
    //   203: invokespecial <init> : ([B)V
    //   206: invokespecial <init> : (Ljava/io/InputStream;)V
    //   209: invokespecial <init> : (Ljava/io/InputStream;)V
    //   212: invokespecial <init> : (Ljava/io/InputStream;)V
    //   215: areturn
    //   216: aconst_null
    //   217: areturn
    //   218: astore_3
    //   219: aconst_null
    //   220: areturn
    // Exception table:
    //   from	to	target	type
    //   11	23	218	java/io/IOException
    //   24	53	218	java/io/IOException
    //   54	89	218	java/io/IOException
    //   90	96	218	java/io/IOException
    //   97	160	218	java/io/IOException
    //   161	215	218	java/io/IOException
    //   216	217	218	java/io/IOException
  }
  
  private void Dne(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/io/RandomAccessFile;
    //   4: iload_1
    //   5: sipush #4096
    //   8: imul
    //   9: i2l
    //   10: invokevirtual seek : (J)V
    //   13: aload_0
    //   14: getfield Dne : Ljava/io/RandomAccessFile;
    //   17: iload_3
    //   18: iconst_1
    //   19: iadd
    //   20: invokevirtual writeInt : (I)V
    //   23: aload_0
    //   24: getfield Dne : Ljava/io/RandomAccessFile;
    //   27: iconst_2
    //   28: invokevirtual writeByte : (I)V
    //   31: aload_0
    //   32: getfield Dne : Ljava/io/RandomAccessFile;
    //   35: aload_2
    //   36: iconst_0
    //   37: iload_3
    //   38: invokevirtual write : ([BII)V
    //   41: return
  }
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : [I
    //   4: iload_1
    //   5: iload_2
    //   6: bipush #32
    //   8: imul
    //   9: iadd
    //   10: iload_3
    //   11: iastore
    //   12: aload_0
    //   13: getfield Dne : Ljava/io/RandomAccessFile;
    //   16: sipush #4096
    //   19: iload_1
    //   20: iload_2
    //   21: bipush #32
    //   23: imul
    //   24: iadd
    //   25: iconst_4
    //   26: imul
    //   27: iadd
    //   28: i2l
    //   29: invokevirtual seek : (J)V
    //   32: aload_0
    //   33: getfield Dne : Ljava/io/RandomAccessFile;
    //   36: iload_3
    //   37: invokevirtual writeInt : (I)V
    //   40: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/io/RandomAccessFile;
    //   4: ifnull -> 14
    //   7: aload_0
    //   8: getfield Dne : Ljava/io/RandomAccessFile;
    //   11: invokevirtual close : ()V
    //   14: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iNQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */