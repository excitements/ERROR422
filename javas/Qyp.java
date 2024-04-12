import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;

public class Qyp implements RXf {
  private boolean aFZ;
  
  private List bzF;
  
  public static int[] Dne;
  
  private final SocketAddress Dne;
  
  private int bzF;
  
  private pPV Dne;
  
  private Socket Dne;
  
  public static int[] FWm;
  
  private final Object Dne;
  
  private SecretKey Dne;
  
  private List Dne;
  
  private PrivateKey Dne;
  
  private volatile DataOutputStream Dne;
  
  private Thread FWm;
  
  private Object[] Dne;
  
  boolean Dne;
  
  private volatile DataInputStream Dne;
  
  private String Dne;
  
  private Thread Dne;
  
  private volatile boolean bzF;
  
  private int FWm;
  
  public static AtomicInteger Dne = new AtomicInteger();
  
  private volatile boolean Qnq;
  
  private final dLs Dne;
  
  private List FWm;
  
  public int Dne;
  
  boolean FWm;
  
  private int Qnq;
  
  public static AtomicInteger FWm = new AtomicInteger();
  
  static Thread FWm(Qyp paramQyp) {
    return paramQyp.Dne;
  }
  
  static boolean Dne(Qyp paramQyp) {
    return paramQyp.bzF;
  }
  
  private boolean FWm() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield Dne : LdLs;
    //   6: aload_0
    //   7: getfield Dne : Ljava/io/DataInputStream;
    //   10: aload_0
    //   11: getfield Dne : LpPV;
    //   14: invokevirtual FWm : ()Z
    //   17: aload_0
    //   18: getfield Dne : Ljava/net/Socket;
    //   21: invokestatic Dne : (LdLs;Ljava/io/DataInputStream;ZLjava/net/Socket;)LNER;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull -> 151
    //   29: aload_2
    //   30: instanceof nsl
    //   33: ifeq -> 72
    //   36: aload_0
    //   37: getfield Dne : Z
    //   40: ifne -> 72
    //   43: aload_0
    //   44: getfield Dne : LpPV;
    //   47: invokevirtual FWm : ()Z
    //   50: ifeq -> 68
    //   53: aload_0
    //   54: aload_2
    //   55: checkcast nsl
    //   58: aload_0
    //   59: getfield Dne : Ljava/security/PrivateKey;
    //   62: invokevirtual Dne : (Ljava/security/PrivateKey;)Ljavax/crypto/SecretKey;
    //   65: putfield Dne : Ljavax/crypto/SecretKey;
    //   68: aload_0
    //   69: invokespecial aFZ : ()V
    //   72: getstatic Qyp.Dne : [I
    //   75: astore_3
    //   76: aload_2
    //   77: invokevirtual aFZ : ()I
    //   80: istore #4
    //   82: aload_3
    //   83: iload #4
    //   85: dup2
    //   86: iaload
    //   87: aload_2
    //   88: invokevirtual Dne : ()I
    //   91: iconst_1
    //   92: iadd
    //   93: iadd
    //   94: iastore
    //   95: aload_0
    //   96: getfield aFZ : Z
    //   99: ifne -> 146
    //   102: aload_2
    //   103: invokevirtual Dne : ()Z
    //   106: ifeq -> 135
    //   109: aload_0
    //   110: getfield Dne : LpPV;
    //   113: invokevirtual Dne : ()Z
    //   116: ifeq -> 135
    //   119: aload_0
    //   120: iconst_0
    //   121: putfield FWm : I
    //   124: aload_2
    //   125: aload_0
    //   126: getfield Dne : LpPV;
    //   129: invokevirtual Dne : (LpPV;)V
    //   132: goto -> 146
    //   135: aload_0
    //   136: getfield Dne : Ljava/util/List;
    //   139: aload_2
    //   140: invokeinterface add : (Ljava/lang/Object;)Z
    //   145: pop
    //   146: iconst_1
    //   147: istore_1
    //   148: goto -> 161
    //   151: aload_0
    //   152: ldc 'disconnect.endOfStream'
    //   154: iconst_0
    //   155: anewarray java/lang/Object
    //   158: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: iload_1
    //   162: ireturn
    //   163: astore_2
    //   164: aload_0
    //   165: getfield Qnq : Z
    //   168: ifne -> 176
    //   171: aload_0
    //   172: aload_2
    //   173: invokespecial Dne : (Ljava/lang/Exception;)V
    //   176: iconst_0
    //   177: ireturn
    // Exception table:
    //   from	to	target	type
    //   2	162	163	java/lang/Exception
  }
  
  public Qyp(dLs paramdLs, Socket paramSocket, String paramString, pPV parampPV, PrivateKey paramPrivateKey) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/lang/Object
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Dne : Ljava/lang/Object;
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield bzF : Z
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield Qnq : Z
    //   25: aload_0
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: invokestatic synchronizedList : (Ljava/util/List;)Ljava/util/List;
    //   36: putfield Dne : Ljava/util/List;
    //   39: aload_0
    //   40: new java/util/ArrayList
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: invokestatic synchronizedList : (Ljava/util/List;)Ljava/util/List;
    //   50: putfield FWm : Ljava/util/List;
    //   53: aload_0
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: invokestatic synchronizedList : (Ljava/util/List;)Ljava/util/List;
    //   64: putfield bzF : Ljava/util/List;
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield aFZ : Z
    //   72: aload_0
    //   73: ldc ''
    //   75: putfield Dne : Ljava/lang/String;
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield FWm : I
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield bzF : I
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield Dne : I
    //   93: aload_0
    //   94: iconst_0
    //   95: putfield Dne : Z
    //   98: aload_0
    //   99: iconst_0
    //   100: putfield FWm : Z
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield Dne : Ljavax/crypto/SecretKey;
    //   108: aload_0
    //   109: aconst_null
    //   110: putfield Dne : Ljava/security/PrivateKey;
    //   113: aload_0
    //   114: bipush #50
    //   116: putfield Qnq : I
    //   119: aload_0
    //   120: aload #5
    //   122: putfield Dne : Ljava/security/PrivateKey;
    //   125: aload_0
    //   126: aload_2
    //   127: putfield Dne : Ljava/net/Socket;
    //   130: aload_0
    //   131: aload_1
    //   132: putfield Dne : LdLs;
    //   135: aload_0
    //   136: aload_2
    //   137: invokevirtual getRemoteSocketAddress : ()Ljava/net/SocketAddress;
    //   140: putfield Dne : Ljava/net/SocketAddress;
    //   143: aload_0
    //   144: aload #4
    //   146: putfield Dne : LpPV;
    //   149: aload_2
    //   150: sipush #30000
    //   153: invokevirtual setSoTimeout : (I)V
    //   156: aload_2
    //   157: bipush #24
    //   159: invokevirtual setTrafficClass : (I)V
    //   162: goto -> 178
    //   165: astore #6
    //   167: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   170: aload #6
    //   172: invokevirtual getMessage : ()Ljava/lang/String;
    //   175: invokevirtual println : (Ljava/lang/String;)V
    //   178: aload_0
    //   179: new java/io/DataInputStream
    //   182: dup
    //   183: aload_2
    //   184: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   187: invokespecial <init> : (Ljava/io/InputStream;)V
    //   190: putfield Dne : Ljava/io/DataInputStream;
    //   193: aload_0
    //   194: new java/io/DataOutputStream
    //   197: dup
    //   198: new java/io/BufferedOutputStream
    //   201: dup
    //   202: aload_2
    //   203: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   206: sipush #5120
    //   209: invokespecial <init> : (Ljava/io/OutputStream;I)V
    //   212: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   215: putfield Dne : Ljava/io/DataOutputStream;
    //   218: aload_0
    //   219: new WRa
    //   222: dup
    //   223: aload_0
    //   224: new java/lang/StringBuilder
    //   227: dup
    //   228: invokespecial <init> : ()V
    //   231: aload_3
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: ldc ' read thread'
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: invokevirtual toString : ()Ljava/lang/String;
    //   243: invokespecial <init> : (LQyp;Ljava/lang/String;)V
    //   246: putfield FWm : Ljava/lang/Thread;
    //   249: aload_0
    //   250: new wDa
    //   253: dup
    //   254: aload_0
    //   255: new java/lang/StringBuilder
    //   258: dup
    //   259: invokespecial <init> : ()V
    //   262: aload_3
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: ldc ' write thread'
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: invokespecial <init> : (LQyp;Ljava/lang/String;)V
    //   277: putfield Dne : Ljava/lang/Thread;
    //   280: aload_0
    //   281: getfield FWm : Ljava/lang/Thread;
    //   284: invokevirtual start : ()V
    //   287: aload_0
    //   288: getfield Dne : Ljava/lang/Thread;
    //   291: invokevirtual start : ()V
    //   294: return
    // Exception table:
    //   from	to	target	type
    //   149	162	165	java/net/SocketException
  }
  
  static Thread Dne(Qyp paramQyp) {
    return (Thread)paramQyp.FWm;
  }
  
  public void Dne(pPV parampPV) {
    this.Dne = parampPV;
  }
  
  static boolean Qnq(Qyp paramQyp) {
    return paramQyp.Dne();
  }
  
  private boolean Dne(NER paramNER, boolean paramBoolean) {
    if (!paramNER.FWm())
      return false; 
    List list = (List)(paramBoolean ? this.bzF : this.FWm);
    Iterator<NER> iterator = list.iterator();
    while (true) {
      if (!iterator.hasNext())
        return false; 
      NER nER = iterator.next();
      if (nER.aFZ() == paramNER.aFZ())
        return paramNER.Dne(nER); 
    } 
  }
  
  public Socket Dne() {
    return this.Dne;
  }
  
  public void bzF() {
    if (!this.aFZ) {
      Dne();
      this.aFZ = true;
      this.FWm.interrupt();
      (new zGQ(this)).start();
    } 
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : I
    //   4: ldc_w 2097152
    //   7: if_icmple -> 21
    //   10: aload_0
    //   11: ldc_w 'disconnect.overflow'
    //   14: iconst_0
    //   15: anewarray java/lang/Object
    //   18: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   21: aload_0
    //   22: getfield Dne : Ljava/util/List;
    //   25: invokeinterface isEmpty : ()Z
    //   30: ifeq -> 64
    //   33: aload_0
    //   34: dup
    //   35: getfield FWm : I
    //   38: dup_x1
    //   39: iconst_1
    //   40: iadd
    //   41: putfield FWm : I
    //   44: sipush #1200
    //   47: if_icmpne -> 69
    //   50: aload_0
    //   51: ldc_w 'disconnect.timeout'
    //   54: iconst_0
    //   55: anewarray java/lang/Object
    //   58: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: goto -> 69
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield FWm : I
    //   69: sipush #1000
    //   72: istore_1
    //   73: aload_0
    //   74: getfield Dne : Ljava/util/List;
    //   77: invokeinterface isEmpty : ()Z
    //   82: ifne -> 117
    //   85: iload_1
    //   86: iinc #1, -1
    //   89: iflt -> 117
    //   92: aload_0
    //   93: getfield Dne : Ljava/util/List;
    //   96: iconst_0
    //   97: invokeinterface remove : (I)Ljava/lang/Object;
    //   102: checkcast NER
    //   105: astore_2
    //   106: aload_2
    //   107: aload_0
    //   108: getfield Dne : LpPV;
    //   111: invokevirtual Dne : (LpPV;)V
    //   114: goto -> 73
    //   117: aload_0
    //   118: invokevirtual Dne : ()V
    //   121: aload_0
    //   122: getfield Qnq : Z
    //   125: ifeq -> 155
    //   128: aload_0
    //   129: getfield Dne : Ljava/util/List;
    //   132: invokeinterface isEmpty : ()Z
    //   137: ifeq -> 155
    //   140: aload_0
    //   141: getfield Dne : LpPV;
    //   144: aload_0
    //   145: getfield Dne : Ljava/lang/String;
    //   148: aload_0
    //   149: getfield Dne : [Ljava/lang/Object;
    //   152: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: return
  }
  
  public void Qnq() {
    Dne();
    this.Dne = null;
    this.FWm = null;
  }
  
  private boolean Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield Dne : I
    //   6: ifeq -> 50
    //   9: aload_0
    //   10: getfield FWm : Ljava/util/List;
    //   13: invokeinterface isEmpty : ()Z
    //   18: ifne -> 137
    //   21: invokestatic currentTimeMillis : ()J
    //   24: aload_0
    //   25: getfield FWm : Ljava/util/List;
    //   28: iconst_0
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast NER
    //   37: getfield Dne : J
    //   40: lsub
    //   41: aload_0
    //   42: getfield Dne : I
    //   45: i2l
    //   46: lcmp
    //   47: iflt -> 137
    //   50: aload_0
    //   51: iconst_0
    //   52: invokespecial Dne : (Z)LNER;
    //   55: astore #4
    //   57: aload #4
    //   59: ifnull -> 137
    //   62: aload #4
    //   64: aload_0
    //   65: getfield Dne : Ljava/io/DataOutputStream;
    //   68: invokestatic Dne : (LNER;Ljava/io/DataOutputStream;)V
    //   71: aload #4
    //   73: instanceof nsl
    //   76: ifeq -> 112
    //   79: aload_0
    //   80: getfield FWm : Z
    //   83: ifne -> 112
    //   86: aload_0
    //   87: getfield Dne : LpPV;
    //   90: invokevirtual FWm : ()Z
    //   93: ifne -> 108
    //   96: aload_0
    //   97: aload #4
    //   99: checkcast nsl
    //   102: invokevirtual Dne : ()Ljavax/crypto/SecretKey;
    //   105: putfield Dne : Ljavax/crypto/SecretKey;
    //   108: aload_0
    //   109: invokespecial zGp : ()V
    //   112: getstatic Qyp.FWm : [I
    //   115: astore_2
    //   116: aload #4
    //   118: invokevirtual aFZ : ()I
    //   121: istore_3
    //   122: aload_2
    //   123: iload_3
    //   124: dup2
    //   125: iaload
    //   126: aload #4
    //   128: invokevirtual Dne : ()I
    //   131: iconst_1
    //   132: iadd
    //   133: iadd
    //   134: iastore
    //   135: iconst_1
    //   136: istore_1
    //   137: aload_0
    //   138: dup
    //   139: getfield Qnq : I
    //   142: dup_x1
    //   143: iconst_1
    //   144: isub
    //   145: putfield Qnq : I
    //   148: ifgt -> 250
    //   151: aload_0
    //   152: getfield Dne : I
    //   155: ifeq -> 199
    //   158: aload_0
    //   159: getfield bzF : Ljava/util/List;
    //   162: invokeinterface isEmpty : ()Z
    //   167: ifne -> 250
    //   170: invokestatic currentTimeMillis : ()J
    //   173: aload_0
    //   174: getfield bzF : Ljava/util/List;
    //   177: iconst_0
    //   178: invokeinterface get : (I)Ljava/lang/Object;
    //   183: checkcast NER
    //   186: getfield Dne : J
    //   189: lsub
    //   190: aload_0
    //   191: getfield Dne : I
    //   194: i2l
    //   195: lcmp
    //   196: iflt -> 250
    //   199: aload_0
    //   200: iconst_1
    //   201: invokespecial Dne : (Z)LNER;
    //   204: astore #4
    //   206: aload #4
    //   208: ifnull -> 250
    //   211: aload #4
    //   213: aload_0
    //   214: getfield Dne : Ljava/io/DataOutputStream;
    //   217: invokestatic Dne : (LNER;Ljava/io/DataOutputStream;)V
    //   220: getstatic Qyp.FWm : [I
    //   223: astore_2
    //   224: aload #4
    //   226: invokevirtual aFZ : ()I
    //   229: istore_3
    //   230: aload_2
    //   231: iload_3
    //   232: dup2
    //   233: iaload
    //   234: aload #4
    //   236: invokevirtual Dne : ()I
    //   239: iconst_1
    //   240: iadd
    //   241: iadd
    //   242: iastore
    //   243: aload_0
    //   244: iconst_0
    //   245: putfield Qnq : I
    //   248: iconst_1
    //   249: istore_1
    //   250: iload_1
    //   251: ireturn
    //   252: astore_2
    //   253: aload_0
    //   254: getfield Qnq : Z
    //   257: ifne -> 265
    //   260: aload_0
    //   261: aload_2
    //   262: invokespecial Dne : (Ljava/lang/Exception;)V
    //   265: iconst_0
    //   266: ireturn
    // Exception table:
    //   from	to	target	type
    //   2	251	252	java/lang/Exception
  }
  
  public Qyp(dLs paramdLs, Socket paramSocket, String paramString, pPV parampPV) {
    this(paramdLs, paramSocket, paramString, parampPV, (PrivateKey)null);
  }
  
  static boolean FWm(Qyp paramQyp) {
    return paramQyp.aFZ;
  }
  
  private void aFZ() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield Dne : Z
    //   5: aload_0
    //   6: getfield Dne : Ljava/net/Socket;
    //   9: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   12: astore_1
    //   13: aload_0
    //   14: new java/io/DataInputStream
    //   17: dup
    //   18: aload_0
    //   19: getfield Dne : Ljavax/crypto/SecretKey;
    //   22: aload_1
    //   23: invokestatic Dne : (Ljavax/crypto/SecretKey;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   26: invokespecial <init> : (Ljava/io/InputStream;)V
    //   29: putfield Dne : Ljava/io/DataInputStream;
    //   32: return
  }
  
  private void Dne(Exception paramException) {
    paramException.printStackTrace();
    Dne("disconnect.genericReason", new Object[] { "Internal exception: " + paramException.toString() });
  }
  
  private void zGp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/io/DataOutputStream;
    //   4: invokevirtual flush : ()V
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield FWm : Z
    //   12: new java/io/BufferedOutputStream
    //   15: dup
    //   16: aload_0
    //   17: getfield Dne : Ljavax/crypto/SecretKey;
    //   20: aload_0
    //   21: getfield Dne : Ljava/net/Socket;
    //   24: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   27: invokestatic Dne : (Ljavax/crypto/SecretKey;Ljava/io/OutputStream;)Ljava/io/OutputStream;
    //   30: sipush #5120
    //   33: invokespecial <init> : (Ljava/io/OutputStream;I)V
    //   36: astore_1
    //   37: aload_0
    //   38: new java/io/DataOutputStream
    //   41: dup
    //   42: aload_1
    //   43: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   46: putfield Dne : Ljava/io/DataOutputStream;
    //   49: return
  }
  
  static boolean bzF(Qyp paramQyp) {
    return paramQyp.FWm();
  }
  
  public void Dne(String paramString, Object... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : Z
    //   4: ifeq -> 86
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield Qnq : Z
    //   12: aload_0
    //   13: aload_1
    //   14: putfield Dne : Ljava/lang/String;
    //   17: aload_0
    //   18: aload_2
    //   19: putfield Dne : [Ljava/lang/Object;
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield bzF : Z
    //   27: new Ftb
    //   30: dup
    //   31: aload_0
    //   32: invokespecial <init> : (LQyp;)V
    //   35: invokevirtual start : ()V
    //   38: aload_0
    //   39: getfield Dne : Ljava/io/DataInputStream;
    //   42: invokevirtual close : ()V
    //   45: goto -> 49
    //   48: astore_3
    //   49: aload_0
    //   50: getfield Dne : Ljava/io/DataOutputStream;
    //   53: invokevirtual close : ()V
    //   56: goto -> 60
    //   59: astore_3
    //   60: aload_0
    //   61: getfield Dne : Ljava/net/Socket;
    //   64: invokevirtual close : ()V
    //   67: goto -> 71
    //   70: astore_3
    //   71: aload_0
    //   72: aconst_null
    //   73: putfield Dne : Ljava/io/DataInputStream;
    //   76: aload_0
    //   77: aconst_null
    //   78: putfield Dne : Ljava/io/DataOutputStream;
    //   81: aload_0
    //   82: aconst_null
    //   83: putfield Dne : Ljava/net/Socket;
    //   86: return
    // Exception table:
    //   from	to	target	type
    //   38	45	48	java/lang/Throwable
    //   49	56	59	java/lang/Throwable
    //   60	67	70	java/lang/Throwable
  }
  
  public SocketAddress Dne() {
    return this.Dne;
  }
  
  static {
    Dne = new int[256];
    FWm = (AtomicInteger)new int[256];
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: ireturn
  }
  
  static boolean aFZ(Qyp paramQyp) {
    return paramQyp.Qnq;
  }
  
  static void Dne(Qyp paramQyp, Exception paramException) {
    paramQyp.Dne(paramException);
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/lang/Thread;
    //   4: ifnull -> 14
    //   7: aload_0
    //   8: getfield FWm : Ljava/lang/Thread;
    //   11: invokevirtual interrupt : ()V
    //   14: aload_0
    //   15: getfield Dne : Ljava/lang/Thread;
    //   18: ifnull -> 28
    //   21: aload_0
    //   22: getfield Dne : Ljava/lang/Thread;
    //   25: invokevirtual interrupt : ()V
    //   28: return
  }
  
  private NER Dne(boolean paramBoolean) {
    NER nER = null;
    List<NER> list = (List<NER>)(paramBoolean ? this.bzF : this.FWm);
    int i = this.Dne;
    synchronized (this.Dne) {
      while (!list.isEmpty() && nER == null) {
        nER = list.remove(0);
        this.bzF -= nER.Dne() + 1;
        if (Dne(nER, paramBoolean))
          nER = null; 
      } 
      return nER;
    } 
  }
  
  static DataOutputStream Dne(Qyp paramQyp) {
    return paramQyp.Dne;
  }
  
  public void Dne(NER paramNER) {
    if (!this.aFZ) {
      int i = this.Dne;
      synchronized (this.Dne) {
        this.bzF += paramNER.Dne() + 1;
        this.FWm.add(paramNER);
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Qyp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */