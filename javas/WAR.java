import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class WAR {
  private int FWm;
  
  private int aFZ;
  
  private FloatBuffer Dne;
  
  private ByteBuffer Dne;
  
  private boolean IjH;
  
  private double Qnq;
  
  private double FWm;
  
  private int Qnq;
  
  private boolean zGp;
  
  private boolean bzF;
  
  private double Dne;
  
  private ShortBuffer Dne;
  
  private int[] Dne;
  
  private int div;
  
  private boolean DyG;
  
  private static boolean FWm;
  
  private int Dne;
  
  private IntBuffer FWm;
  
  private double aFZ;
  
  private int IjH;
  
  private boolean aFZ;
  
  private double bzF;
  
  private int DyG;
  
  private boolean div;
  
  private int mrb;
  
  private int zGp;
  
  private boolean Qnq;
  
  private int bzF;
  
  private IntBuffer Dne;
  
  public static final WAR Dne;
  
  private static boolean Dne = false;
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5) {
    Dne(paramDouble4, paramDouble5);
    Dne(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public void Dne() {
    Dne(7);
  }
  
  public void Dne(double paramDouble1, double paramDouble2) {
    this.Qnq = true;
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
  }
  
  public void FWm() {
    this.DyG = 1;
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    Dne((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F), (int)(paramFloat4 * 255.0F));
  }
  
  public void FWm(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.bzF = paramDouble1;
    this.Qnq = paramDouble2;
    this.aFZ = paramDouble3;
  }
  
  public void bzF(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.bzF += paramFloat1;
    this.Qnq += paramFloat2;
    this.aFZ += paramFloat3;
  }
  
  public void FWm(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.zGp = 1;
    byte b1 = (byte)(int)(paramFloat1 * 127.0F);
    byte b2 = (byte)(int)(paramFloat2 * 127.0F);
    byte b3 = (byte)(int)(paramFloat3 * 127.0F);
    this.DyG = b1 & 0xFF | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.DyG == 0) {
      if (paramInt1 > 255)
        paramInt1 = 255; 
      if (paramInt2 > 255)
        paramInt2 = 255; 
      if (paramInt3 > 255)
        paramInt3 = 255; 
      if (paramInt4 > 255)
        paramInt4 = 255; 
      if (paramInt1 < 0)
        paramInt1 = 0; 
      if (paramInt2 < 0)
        paramInt2 = 0; 
      if (paramInt3 < 0)
        paramInt3 = 0; 
      if (paramInt4 < 0)
        paramInt4 = 0; 
      this.bzF = 1;
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
        this.bzF = paramInt4 << 24 | paramInt3 << 16 | paramInt2 << 8 | paramInt1;
      } else {
        this.bzF = paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
      } 
    } 
  }
  
  private WAR(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield Dne : I
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield bzF : Z
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield Qnq : Z
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield aFZ : Z
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield zGp : Z
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield Qnq : I
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield aFZ : I
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield DyG : Z
    //   44: aload_0
    //   45: iconst_0
    //   46: putfield div : Z
    //   49: aload_0
    //   50: iconst_0
    //   51: putfield IjH : Z
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield div : I
    //   59: aload_0
    //   60: bipush #10
    //   62: putfield IjH : I
    //   65: aload_0
    //   66: iload_1
    //   67: putfield mrb : I
    //   70: aload_0
    //   71: iload_1
    //   72: iconst_4
    //   73: imul
    //   74: invokestatic Dne : (I)Ljava/nio/ByteBuffer;
    //   77: putfield Dne : Ljava/nio/ByteBuffer;
    //   80: aload_0
    //   81: aload_0
    //   82: getfield Dne : Ljava/nio/ByteBuffer;
    //   85: invokevirtual asIntBuffer : ()Ljava/nio/IntBuffer;
    //   88: putfield Dne : Ljava/nio/IntBuffer;
    //   91: aload_0
    //   92: aload_0
    //   93: getfield Dne : Ljava/nio/ByteBuffer;
    //   96: invokevirtual asFloatBuffer : ()Ljava/nio/FloatBuffer;
    //   99: putfield Dne : Ljava/nio/FloatBuffer;
    //   102: aload_0
    //   103: aload_0
    //   104: getfield Dne : Ljava/nio/ByteBuffer;
    //   107: invokevirtual asShortBuffer : ()Ljava/nio/ShortBuffer;
    //   110: putfield Dne : Ljava/nio/ShortBuffer;
    //   113: aload_0
    //   114: iload_1
    //   115: newarray int
    //   117: putfield Dne : [I
    //   120: aload_0
    //   121: getstatic WAR.FWm : Z
    //   124: ifeq -> 140
    //   127: invokestatic getCapabilities : ()Lorg/lwjgl/opengl/ContextCapabilities;
    //   130: getfield GL_ARB_vertex_buffer_object : Z
    //   133: ifeq -> 140
    //   136: iconst_1
    //   137: goto -> 141
    //   140: iconst_0
    //   141: putfield IjH : Z
    //   144: aload_0
    //   145: getfield IjH : Z
    //   148: ifeq -> 169
    //   151: aload_0
    //   152: aload_0
    //   153: getfield IjH : I
    //   156: invokestatic Dne : (I)Ljava/nio/IntBuffer;
    //   159: putfield FWm : Ljava/nio/IntBuffer;
    //   162: aload_0
    //   163: getfield FWm : Ljava/nio/IntBuffer;
    //   166: invokestatic glGenBuffersARB : (Ljava/nio/IntBuffer;)V
    //   169: return
  }
  
  public void FWm(int paramInt) {
    this.aFZ = true;
    this.FWm = paramInt;
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield div : Z
    //   4: ifne -> 17
    //   7: new java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 'Not tesselating!'
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: athrow
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield div : Z
    //   22: aload_0
    //   23: getfield Dne : I
    //   26: ifle -> 500
    //   29: aload_0
    //   30: getfield Dne : Ljava/nio/IntBuffer;
    //   33: invokevirtual clear : ()Ljava/nio/Buffer;
    //   36: pop
    //   37: aload_0
    //   38: getfield Dne : Ljava/nio/IntBuffer;
    //   41: aload_0
    //   42: getfield Dne : [I
    //   45: iconst_0
    //   46: aload_0
    //   47: getfield Qnq : I
    //   50: invokevirtual put : ([III)Ljava/nio/IntBuffer;
    //   53: pop
    //   54: aload_0
    //   55: getfield Dne : Ljava/nio/ByteBuffer;
    //   58: iconst_0
    //   59: invokevirtual position : (I)Ljava/nio/Buffer;
    //   62: pop
    //   63: aload_0
    //   64: getfield Dne : Ljava/nio/ByteBuffer;
    //   67: aload_0
    //   68: getfield Qnq : I
    //   71: iconst_4
    //   72: imul
    //   73: invokevirtual limit : (I)Ljava/nio/Buffer;
    //   76: pop
    //   77: aload_0
    //   78: getfield IjH : Z
    //   81: ifeq -> 126
    //   84: aload_0
    //   85: aload_0
    //   86: getfield div : I
    //   89: iconst_1
    //   90: iadd
    //   91: aload_0
    //   92: getfield IjH : I
    //   95: irem
    //   96: putfield div : I
    //   99: ldc 34962
    //   101: aload_0
    //   102: getfield FWm : Ljava/nio/IntBuffer;
    //   105: aload_0
    //   106: getfield div : I
    //   109: invokevirtual get : (I)I
    //   112: invokestatic glBindBufferARB : (II)V
    //   115: ldc 34962
    //   117: aload_0
    //   118: getfield Dne : Ljava/nio/ByteBuffer;
    //   121: ldc 35040
    //   123: invokestatic glBufferDataARB : (ILjava/nio/ByteBuffer;I)V
    //   126: aload_0
    //   127: getfield Qnq : Z
    //   130: ifeq -> 179
    //   133: aload_0
    //   134: getfield IjH : Z
    //   137: ifeq -> 155
    //   140: iconst_2
    //   141: sipush #5126
    //   144: bipush #32
    //   146: ldc2_w 12
    //   149: invokestatic glTexCoordPointer : (IIIJ)V
    //   152: goto -> 174
    //   155: aload_0
    //   156: getfield Dne : Ljava/nio/FloatBuffer;
    //   159: iconst_3
    //   160: invokevirtual position : (I)Ljava/nio/Buffer;
    //   163: pop
    //   164: iconst_2
    //   165: bipush #32
    //   167: aload_0
    //   168: getfield Dne : Ljava/nio/FloatBuffer;
    //   171: invokestatic glTexCoordPointer : (IILjava/nio/FloatBuffer;)V
    //   174: ldc 32888
    //   176: invokestatic glEnableClientState : (I)V
    //   179: aload_0
    //   180: getfield aFZ : Z
    //   183: ifeq -> 245
    //   186: getstatic oCF.FWm : I
    //   189: invokestatic FWm : (I)V
    //   192: aload_0
    //   193: getfield IjH : Z
    //   196: ifeq -> 214
    //   199: iconst_2
    //   200: sipush #5122
    //   203: bipush #32
    //   205: ldc2_w 28
    //   208: invokestatic glTexCoordPointer : (IIIJ)V
    //   211: goto -> 234
    //   214: aload_0
    //   215: getfield Dne : Ljava/nio/ShortBuffer;
    //   218: bipush #14
    //   220: invokevirtual position : (I)Ljava/nio/Buffer;
    //   223: pop
    //   224: iconst_2
    //   225: bipush #32
    //   227: aload_0
    //   228: getfield Dne : Ljava/nio/ShortBuffer;
    //   231: invokestatic glTexCoordPointer : (IILjava/nio/ShortBuffer;)V
    //   234: ldc 32888
    //   236: invokestatic glEnableClientState : (I)V
    //   239: getstatic oCF.Dne : I
    //   242: invokestatic FWm : (I)V
    //   245: aload_0
    //   246: getfield bzF : Z
    //   249: ifeq -> 300
    //   252: aload_0
    //   253: getfield IjH : Z
    //   256: ifeq -> 274
    //   259: iconst_4
    //   260: sipush #5121
    //   263: bipush #32
    //   265: ldc2_w 20
    //   268: invokestatic glColorPointer : (IIIJ)V
    //   271: goto -> 295
    //   274: aload_0
    //   275: getfield Dne : Ljava/nio/ByteBuffer;
    //   278: bipush #20
    //   280: invokevirtual position : (I)Ljava/nio/Buffer;
    //   283: pop
    //   284: iconst_4
    //   285: iconst_1
    //   286: bipush #32
    //   288: aload_0
    //   289: getfield Dne : Ljava/nio/ByteBuffer;
    //   292: invokestatic glColorPointer : (IZILjava/nio/ByteBuffer;)V
    //   295: ldc 32886
    //   297: invokestatic glEnableClientState : (I)V
    //   300: aload_0
    //   301: getfield zGp : Z
    //   304: ifeq -> 352
    //   307: aload_0
    //   308: getfield IjH : Z
    //   311: ifeq -> 328
    //   314: sipush #5121
    //   317: bipush #32
    //   319: ldc2_w 24
    //   322: invokestatic glNormalPointer : (IIJ)V
    //   325: goto -> 347
    //   328: aload_0
    //   329: getfield Dne : Ljava/nio/ByteBuffer;
    //   332: bipush #24
    //   334: invokevirtual position : (I)Ljava/nio/Buffer;
    //   337: pop
    //   338: bipush #32
    //   340: aload_0
    //   341: getfield Dne : Ljava/nio/ByteBuffer;
    //   344: invokestatic glNormalPointer : (ILjava/nio/ByteBuffer;)V
    //   347: ldc 32885
    //   349: invokestatic glEnableClientState : (I)V
    //   352: aload_0
    //   353: getfield IjH : Z
    //   356: ifeq -> 372
    //   359: iconst_3
    //   360: sipush #5126
    //   363: bipush #32
    //   365: lconst_0
    //   366: invokestatic glVertexPointer : (IIIJ)V
    //   369: goto -> 391
    //   372: aload_0
    //   373: getfield Dne : Ljava/nio/FloatBuffer;
    //   376: iconst_0
    //   377: invokevirtual position : (I)Ljava/nio/Buffer;
    //   380: pop
    //   381: iconst_3
    //   382: bipush #32
    //   384: aload_0
    //   385: getfield Dne : Ljava/nio/FloatBuffer;
    //   388: invokestatic glVertexPointer : (IILjava/nio/FloatBuffer;)V
    //   391: ldc 32884
    //   393: invokestatic glEnableClientState : (I)V
    //   396: aload_0
    //   397: getfield zGp : I
    //   400: bipush #7
    //   402: if_icmpne -> 423
    //   405: getstatic WAR.Dne : Z
    //   408: ifeq -> 423
    //   411: iconst_4
    //   412: iconst_0
    //   413: aload_0
    //   414: getfield Dne : I
    //   417: invokestatic glDrawArrays : (III)V
    //   420: goto -> 435
    //   423: aload_0
    //   424: getfield zGp : I
    //   427: iconst_0
    //   428: aload_0
    //   429: getfield Dne : I
    //   432: invokestatic glDrawArrays : (III)V
    //   435: ldc 32884
    //   437: invokestatic glDisableClientState : (I)V
    //   440: aload_0
    //   441: getfield Qnq : Z
    //   444: ifeq -> 452
    //   447: ldc 32888
    //   449: invokestatic glDisableClientState : (I)V
    //   452: aload_0
    //   453: getfield aFZ : Z
    //   456: ifeq -> 476
    //   459: getstatic oCF.FWm : I
    //   462: invokestatic FWm : (I)V
    //   465: ldc 32888
    //   467: invokestatic glDisableClientState : (I)V
    //   470: getstatic oCF.Dne : I
    //   473: invokestatic FWm : (I)V
    //   476: aload_0
    //   477: getfield bzF : Z
    //   480: ifeq -> 488
    //   483: ldc 32886
    //   485: invokestatic glDisableClientState : (I)V
    //   488: aload_0
    //   489: getfield zGp : Z
    //   492: ifeq -> 500
    //   495: ldc 32885
    //   497: invokestatic glDisableClientState : (I)V
    //   500: aload_0
    //   501: getfield Qnq : I
    //   504: iconst_4
    //   505: imul
    //   506: istore_1
    //   507: aload_0
    //   508: invokespecial bzF : ()V
    //   511: iload_1
    //   512: ireturn
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramInt1, paramInt2, paramInt3, 255);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    Dne((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F));
  }
  
  public void Dne(int paramInt) {
    if (this.div)
      throw new IllegalStateException("Already tesselating!"); 
    this.div = true;
    bzF();
    this.zGp = paramInt;
    this.zGp = 0;
    this.bzF = 0;
    this.Qnq = false;
    this.aFZ = false;
    this.DyG = 0;
  }
  
  public void bzF(int paramInt) {
    int i = paramInt >> 16 & 0xFF;
    int j = paramInt >> 8 & 0xFF;
    int k = paramInt & 0xFF;
    Dne(i, j, k);
  }
  
  private void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield Dne : I
    //   5: aload_0
    //   6: getfield Dne : Ljava/nio/ByteBuffer;
    //   9: invokevirtual clear : ()Ljava/nio/Buffer;
    //   12: pop
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield Qnq : I
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield aFZ : I
    //   23: return
  }
  
  static {
    FWm = false;
    Dne = new WAR(2097152);
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield aFZ : I
    //   5: iconst_1
    //   6: iadd
    //   7: putfield aFZ : I
    //   10: aload_0
    //   11: getfield zGp : I
    //   14: bipush #7
    //   16: if_icmpne -> 277
    //   19: getstatic WAR.Dne : Z
    //   22: ifeq -> 277
    //   25: aload_0
    //   26: getfield aFZ : I
    //   29: iconst_4
    //   30: irem
    //   31: ifne -> 277
    //   34: iconst_0
    //   35: istore #7
    //   37: iload #7
    //   39: iconst_2
    //   40: if_icmpge -> 277
    //   43: bipush #8
    //   45: iconst_3
    //   46: iload #7
    //   48: isub
    //   49: imul
    //   50: istore #8
    //   52: aload_0
    //   53: getfield Qnq : Z
    //   56: ifeq -> 109
    //   59: aload_0
    //   60: getfield Dne : [I
    //   63: aload_0
    //   64: getfield Qnq : I
    //   67: iconst_3
    //   68: iadd
    //   69: aload_0
    //   70: getfield Dne : [I
    //   73: aload_0
    //   74: getfield Qnq : I
    //   77: iload #8
    //   79: isub
    //   80: iconst_3
    //   81: iadd
    //   82: iaload
    //   83: iastore
    //   84: aload_0
    //   85: getfield Dne : [I
    //   88: aload_0
    //   89: getfield Qnq : I
    //   92: iconst_4
    //   93: iadd
    //   94: aload_0
    //   95: getfield Dne : [I
    //   98: aload_0
    //   99: getfield Qnq : I
    //   102: iload #8
    //   104: isub
    //   105: iconst_4
    //   106: iadd
    //   107: iaload
    //   108: iastore
    //   109: aload_0
    //   110: getfield aFZ : Z
    //   113: ifeq -> 143
    //   116: aload_0
    //   117: getfield Dne : [I
    //   120: aload_0
    //   121: getfield Qnq : I
    //   124: bipush #7
    //   126: iadd
    //   127: aload_0
    //   128: getfield Dne : [I
    //   131: aload_0
    //   132: getfield Qnq : I
    //   135: iload #8
    //   137: isub
    //   138: bipush #7
    //   140: iadd
    //   141: iaload
    //   142: iastore
    //   143: aload_0
    //   144: getfield bzF : Z
    //   147: ifeq -> 175
    //   150: aload_0
    //   151: getfield Dne : [I
    //   154: aload_0
    //   155: getfield Qnq : I
    //   158: iconst_5
    //   159: iadd
    //   160: aload_0
    //   161: getfield Dne : [I
    //   164: aload_0
    //   165: getfield Qnq : I
    //   168: iload #8
    //   170: isub
    //   171: iconst_5
    //   172: iadd
    //   173: iaload
    //   174: iastore
    //   175: aload_0
    //   176: getfield Dne : [I
    //   179: aload_0
    //   180: getfield Qnq : I
    //   183: iconst_0
    //   184: iadd
    //   185: aload_0
    //   186: getfield Dne : [I
    //   189: aload_0
    //   190: getfield Qnq : I
    //   193: iload #8
    //   195: isub
    //   196: iconst_0
    //   197: iadd
    //   198: iaload
    //   199: iastore
    //   200: aload_0
    //   201: getfield Dne : [I
    //   204: aload_0
    //   205: getfield Qnq : I
    //   208: iconst_1
    //   209: iadd
    //   210: aload_0
    //   211: getfield Dne : [I
    //   214: aload_0
    //   215: getfield Qnq : I
    //   218: iload #8
    //   220: isub
    //   221: iconst_1
    //   222: iadd
    //   223: iaload
    //   224: iastore
    //   225: aload_0
    //   226: getfield Dne : [I
    //   229: aload_0
    //   230: getfield Qnq : I
    //   233: iconst_2
    //   234: iadd
    //   235: aload_0
    //   236: getfield Dne : [I
    //   239: aload_0
    //   240: getfield Qnq : I
    //   243: iload #8
    //   245: isub
    //   246: iconst_2
    //   247: iadd
    //   248: iaload
    //   249: iastore
    //   250: aload_0
    //   251: dup
    //   252: getfield Dne : I
    //   255: iconst_1
    //   256: iadd
    //   257: putfield Dne : I
    //   260: aload_0
    //   261: dup
    //   262: getfield Qnq : I
    //   265: bipush #8
    //   267: iadd
    //   268: putfield Qnq : I
    //   271: iinc #7, 1
    //   274: goto -> 37
    //   277: aload_0
    //   278: getfield Qnq : Z
    //   281: ifeq -> 322
    //   284: aload_0
    //   285: getfield Dne : [I
    //   288: aload_0
    //   289: getfield Qnq : I
    //   292: iconst_3
    //   293: iadd
    //   294: aload_0
    //   295: getfield Dne : D
    //   298: d2f
    //   299: invokestatic floatToRawIntBits : (F)I
    //   302: iastore
    //   303: aload_0
    //   304: getfield Dne : [I
    //   307: aload_0
    //   308: getfield Qnq : I
    //   311: iconst_4
    //   312: iadd
    //   313: aload_0
    //   314: getfield FWm : D
    //   317: d2f
    //   318: invokestatic floatToRawIntBits : (F)I
    //   321: iastore
    //   322: aload_0
    //   323: getfield aFZ : Z
    //   326: ifeq -> 345
    //   329: aload_0
    //   330: getfield Dne : [I
    //   333: aload_0
    //   334: getfield Qnq : I
    //   337: bipush #7
    //   339: iadd
    //   340: aload_0
    //   341: getfield FWm : I
    //   344: iastore
    //   345: aload_0
    //   346: getfield bzF : Z
    //   349: ifeq -> 367
    //   352: aload_0
    //   353: getfield Dne : [I
    //   356: aload_0
    //   357: getfield Qnq : I
    //   360: iconst_5
    //   361: iadd
    //   362: aload_0
    //   363: getfield bzF : I
    //   366: iastore
    //   367: aload_0
    //   368: getfield zGp : Z
    //   371: ifeq -> 390
    //   374: aload_0
    //   375: getfield Dne : [I
    //   378: aload_0
    //   379: getfield Qnq : I
    //   382: bipush #6
    //   384: iadd
    //   385: aload_0
    //   386: getfield DyG : I
    //   389: iastore
    //   390: aload_0
    //   391: getfield Dne : [I
    //   394: aload_0
    //   395: getfield Qnq : I
    //   398: iconst_0
    //   399: iadd
    //   400: dload_1
    //   401: aload_0
    //   402: getfield bzF : D
    //   405: dadd
    //   406: d2f
    //   407: invokestatic floatToRawIntBits : (F)I
    //   410: iastore
    //   411: aload_0
    //   412: getfield Dne : [I
    //   415: aload_0
    //   416: getfield Qnq : I
    //   419: iconst_1
    //   420: iadd
    //   421: dload_3
    //   422: aload_0
    //   423: getfield Qnq : D
    //   426: dadd
    //   427: d2f
    //   428: invokestatic floatToRawIntBits : (F)I
    //   431: iastore
    //   432: aload_0
    //   433: getfield Dne : [I
    //   436: aload_0
    //   437: getfield Qnq : I
    //   440: iconst_2
    //   441: iadd
    //   442: dload #5
    //   444: aload_0
    //   445: getfield aFZ : D
    //   448: dadd
    //   449: d2f
    //   450: invokestatic floatToRawIntBits : (F)I
    //   453: iastore
    //   454: aload_0
    //   455: dup
    //   456: getfield Qnq : I
    //   459: bipush #8
    //   461: iadd
    //   462: putfield Qnq : I
    //   465: aload_0
    //   466: dup
    //   467: getfield Dne : I
    //   470: iconst_1
    //   471: iadd
    //   472: putfield Dne : I
    //   475: aload_0
    //   476: getfield Dne : I
    //   479: iconst_4
    //   480: irem
    //   481: ifne -> 508
    //   484: aload_0
    //   485: getfield Qnq : I
    //   488: aload_0
    //   489: getfield mrb : I
    //   492: bipush #32
    //   494: isub
    //   495: if_icmplt -> 508
    //   498: aload_0
    //   499: invokevirtual Dne : ()I
    //   502: pop
    //   503: aload_0
    //   504: iconst_1
    //   505: putfield div : Z
    //   508: return
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    int i = paramInt1 >> 16 & 0xFF;
    int j = paramInt1 >> 8 & 0xFF;
    int k = paramInt1 & 0xFF;
    Dne(i, j, k, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WAR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */