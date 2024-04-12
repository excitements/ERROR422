import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class nPC extends NER {
  private static byte[] FWm = new byte[0];
  
  private int[] bzF;
  
  public int[] Dne;
  
  private int Dne;
  
  private byte[][] Dne;
  
  private byte[] Dne;
  
  private boolean Dne;
  
  public int[] FWm;
  
  private int[] Qnq;
  
  public void Dne(DataInputStream paramDataInputStream) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual readShort : ()S
    //   4: istore_2
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual readInt : ()I
    //   10: putfield Dne : I
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual readBoolean : ()Z
    //   18: putfield Dne : Z
    //   21: aload_0
    //   22: iload_2
    //   23: newarray int
    //   25: putfield bzF : [I
    //   28: aload_0
    //   29: iload_2
    //   30: newarray int
    //   32: putfield Qnq : [I
    //   35: aload_0
    //   36: iload_2
    //   37: newarray int
    //   39: putfield Dne : [I
    //   42: aload_0
    //   43: iload_2
    //   44: newarray int
    //   46: putfield FWm : [I
    //   49: aload_0
    //   50: iload_2
    //   51: anewarray [B
    //   54: putfield Dne : [[B
    //   57: getstatic nPC.FWm : [B
    //   60: arraylength
    //   61: aload_0
    //   62: getfield Dne : I
    //   65: if_icmpge -> 77
    //   68: aload_0
    //   69: getfield Dne : I
    //   72: newarray byte
    //   74: putstatic nPC.FWm : [B
    //   77: aload_1
    //   78: getstatic nPC.FWm : [B
    //   81: iconst_0
    //   82: aload_0
    //   83: getfield Dne : I
    //   86: invokevirtual readFully : ([BII)V
    //   89: ldc 196864
    //   91: iload_2
    //   92: imul
    //   93: newarray byte
    //   95: astore_3
    //   96: new java/util/zip/Inflater
    //   99: dup
    //   100: invokespecial <init> : ()V
    //   103: astore #4
    //   105: aload #4
    //   107: getstatic nPC.FWm : [B
    //   110: iconst_0
    //   111: aload_0
    //   112: getfield Dne : I
    //   115: invokevirtual setInput : ([BII)V
    //   118: aload #4
    //   120: aload_3
    //   121: invokevirtual inflate : ([B)I
    //   124: pop
    //   125: aload #4
    //   127: invokevirtual end : ()V
    //   130: goto -> 155
    //   133: astore #5
    //   135: new java/io/IOException
    //   138: dup
    //   139: ldc 'Bad compressed data format'
    //   141: invokespecial <init> : (Ljava/lang/String;)V
    //   144: athrow
    //   145: astore #6
    //   147: aload #4
    //   149: invokevirtual end : ()V
    //   152: aload #6
    //   154: athrow
    //   155: iconst_0
    //   156: istore #5
    //   158: iconst_0
    //   159: istore #6
    //   161: iload #6
    //   163: iload_2
    //   164: if_icmpge -> 348
    //   167: aload_0
    //   168: getfield bzF : [I
    //   171: iload #6
    //   173: aload_1
    //   174: invokevirtual readInt : ()I
    //   177: iastore
    //   178: aload_0
    //   179: getfield Qnq : [I
    //   182: iload #6
    //   184: aload_1
    //   185: invokevirtual readInt : ()I
    //   188: iastore
    //   189: aload_0
    //   190: getfield Dne : [I
    //   193: iload #6
    //   195: aload_1
    //   196: invokevirtual readShort : ()S
    //   199: iastore
    //   200: aload_0
    //   201: getfield FWm : [I
    //   204: iload #6
    //   206: aload_1
    //   207: invokevirtual readShort : ()S
    //   210: iastore
    //   211: iconst_0
    //   212: istore #7
    //   214: iconst_0
    //   215: istore #8
    //   217: iconst_0
    //   218: istore #9
    //   220: iload #9
    //   222: bipush #16
    //   224: if_icmpge -> 267
    //   227: iload #7
    //   229: aload_0
    //   230: getfield Dne : [I
    //   233: iload #6
    //   235: iaload
    //   236: iload #9
    //   238: ishr
    //   239: iconst_1
    //   240: iand
    //   241: iadd
    //   242: istore #7
    //   244: iload #8
    //   246: aload_0
    //   247: getfield FWm : [I
    //   250: iload #6
    //   252: iaload
    //   253: iload #9
    //   255: ishr
    //   256: iconst_1
    //   257: iand
    //   258: iadd
    //   259: istore #8
    //   261: iinc #9, 1
    //   264: goto -> 220
    //   267: sipush #8192
    //   270: iload #7
    //   272: imul
    //   273: sipush #256
    //   276: iadd
    //   277: istore #9
    //   279: iload #9
    //   281: sipush #2048
    //   284: iload #8
    //   286: imul
    //   287: iadd
    //   288: istore #9
    //   290: aload_0
    //   291: getfield Dne : Z
    //   294: ifeq -> 308
    //   297: iload #9
    //   299: sipush #2048
    //   302: iload #7
    //   304: imul
    //   305: iadd
    //   306: istore #9
    //   308: aload_0
    //   309: getfield Dne : [[B
    //   312: iload #6
    //   314: iload #9
    //   316: newarray byte
    //   318: aastore
    //   319: aload_3
    //   320: iload #5
    //   322: aload_0
    //   323: getfield Dne : [[B
    //   326: iload #6
    //   328: aaload
    //   329: iconst_0
    //   330: iload #9
    //   332: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   335: iload #5
    //   337: iload #9
    //   339: iadd
    //   340: istore #5
    //   342: iinc #6, 1
    //   345: goto -> 161
    //   348: return
    // Exception table:
    //   from	to	target	type
    //   118	125	133	java/util/zip/DataFormatException
    //   118	125	145	finally
    //   133	147	145	finally
  }
  
  public nPC() {}
  
  public byte[] Dne(int paramInt) {
    return this.Dne[paramInt];
  }
  
  public int FWm(int paramInt) {
    return this.Qnq[paramInt];
  }
  
  public nPC(List<qMV> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: invokeinterface size : ()I
    //   10: istore_2
    //   11: aload_0
    //   12: iload_2
    //   13: newarray int
    //   15: putfield bzF : [I
    //   18: aload_0
    //   19: iload_2
    //   20: newarray int
    //   22: putfield Qnq : [I
    //   25: aload_0
    //   26: iload_2
    //   27: newarray int
    //   29: putfield Dne : [I
    //   32: aload_0
    //   33: iload_2
    //   34: newarray int
    //   36: putfield FWm : [I
    //   39: aload_0
    //   40: iload_2
    //   41: anewarray [B
    //   44: putfield Dne : [[B
    //   47: aload_0
    //   48: aload_1
    //   49: invokeinterface isEmpty : ()Z
    //   54: ifne -> 83
    //   57: aload_1
    //   58: iconst_0
    //   59: invokeinterface get : (I)Ljava/lang/Object;
    //   64: checkcast qMV
    //   67: getfield Dne : LQnq;
    //   70: getfield Dne : LJik;
    //   73: getfield FWm : Z
    //   76: ifne -> 83
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: putfield Dne : Z
    //   87: iconst_0
    //   88: istore_3
    //   89: iconst_0
    //   90: istore #4
    //   92: iload #4
    //   94: iload_2
    //   95: if_icmpge -> 261
    //   98: aload_1
    //   99: iload #4
    //   101: invokeinterface get : (I)Ljava/lang/Object;
    //   106: checkcast qMV
    //   109: astore #5
    //   111: aload #5
    //   113: iconst_1
    //   114: ldc 65535
    //   116: invokestatic Dne : (LqMV;ZI)Luqn;
    //   119: astore #6
    //   121: getstatic nPC.FWm : [B
    //   124: arraylength
    //   125: iload_3
    //   126: aload #6
    //   128: getfield Dne : [B
    //   131: arraylength
    //   132: iadd
    //   133: if_icmpge -> 167
    //   136: iload_3
    //   137: aload #6
    //   139: getfield Dne : [B
    //   142: arraylength
    //   143: iadd
    //   144: newarray byte
    //   146: astore #7
    //   148: getstatic nPC.FWm : [B
    //   151: iconst_0
    //   152: aload #7
    //   154: iconst_0
    //   155: getstatic nPC.FWm : [B
    //   158: arraylength
    //   159: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   162: aload #7
    //   164: putstatic nPC.FWm : [B
    //   167: aload #6
    //   169: getfield Dne : [B
    //   172: iconst_0
    //   173: getstatic nPC.FWm : [B
    //   176: iload_3
    //   177: aload #6
    //   179: getfield Dne : [B
    //   182: arraylength
    //   183: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   186: iload_3
    //   187: aload #6
    //   189: getfield Dne : [B
    //   192: arraylength
    //   193: iadd
    //   194: istore_3
    //   195: aload_0
    //   196: getfield bzF : [I
    //   199: iload #4
    //   201: aload #5
    //   203: getfield Dne : I
    //   206: iastore
    //   207: aload_0
    //   208: getfield Qnq : [I
    //   211: iload #4
    //   213: aload #5
    //   215: getfield FWm : I
    //   218: iastore
    //   219: aload_0
    //   220: getfield Dne : [I
    //   223: iload #4
    //   225: aload #6
    //   227: getfield Dne : I
    //   230: iastore
    //   231: aload_0
    //   232: getfield FWm : [I
    //   235: iload #4
    //   237: aload #6
    //   239: getfield FWm : I
    //   242: iastore
    //   243: aload_0
    //   244: getfield Dne : [[B
    //   247: iload #4
    //   249: aload #6
    //   251: getfield Dne : [B
    //   254: aastore
    //   255: iinc #4, 1
    //   258: goto -> 92
    //   261: new java/util/zip/Deflater
    //   264: dup
    //   265: iconst_m1
    //   266: invokespecial <init> : (I)V
    //   269: astore #4
    //   271: aload #4
    //   273: getstatic nPC.FWm : [B
    //   276: iconst_0
    //   277: iload_3
    //   278: invokevirtual setInput : ([BII)V
    //   281: aload #4
    //   283: invokevirtual finish : ()V
    //   286: aload_0
    //   287: iload_3
    //   288: newarray byte
    //   290: putfield Dne : [B
    //   293: aload_0
    //   294: aload #4
    //   296: aload_0
    //   297: getfield Dne : [B
    //   300: invokevirtual deflate : ([B)I
    //   303: putfield Dne : I
    //   306: aload #4
    //   308: invokevirtual end : ()V
    //   311: goto -> 324
    //   314: astore #8
    //   316: aload #4
    //   318: invokevirtual end : ()V
    //   321: aload #8
    //   323: athrow
    //   324: return
    // Exception table:
    //   from	to	target	type
    //   271	306	314	finally
    //   314	316	314	finally
  }
  
  public int Dne() {
    return 6 + this.Dne + 12 * FWm();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(this.bzF.length);
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeBoolean(this.Dne);
    paramDataOutputStream.write(this.Dne, 0, this.Dne);
    for (byte b = 0; b < this.bzF.length; b++) {
      paramDataOutputStream.writeInt(this.bzF[b]);
      paramDataOutputStream.writeInt(this.Qnq[b]);
      paramDataOutputStream.writeShort((short)(this.Dne[b] & 0xFFFF));
      paramDataOutputStream.writeShort((short)(this.FWm[b] & 0xFFFF));
    } 
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne(int paramInt) {
    return this.bzF[paramInt];
  }
  
  public int FWm() {
    return this.bzF.length;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nPC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */