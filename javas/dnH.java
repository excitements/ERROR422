import java.net.Socket;
import java.util.Random;
import javax.crypto.SecretKey;

public class dnH extends pPV {
  private int Dne;
  
  private boolean bzF;
  
  private String FWm;
  
  private static Random Dne = new Random();
  
  private final Jwh Dne;
  
  private SecretKey Dne;
  
  private volatile boolean FWm;
  
  private String Dne;
  
  public final Qyp Dne;
  
  private byte[] Dne;
  
  public boolean Dne = false;
  
  public void Dne(VPw paramVPw) {}
  
  public void Dne(String paramString, Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJwh;
    //   4: invokevirtual Dne : ()LdLs;
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: aload_0
    //   15: invokevirtual Dne : ()Ljava/lang/String;
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc ' lost connection'
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual toString : ()Ljava/lang/String;
    //   29: invokeinterface Dne : (Ljava/lang/String;)V
    //   34: aload_0
    //   35: iconst_1
    //   36: putfield Dne : Z
    //   39: return
  }
  
  static Jwh Dne(dnH paramdnH) {
    return paramdnH.Dne;
  }
  
  public void Dne(nsl paramnsl) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJwh;
    //   4: invokevirtual Dne : ()Ljava/security/KeyPair;
    //   7: invokevirtual getPrivate : ()Ljava/security/PrivateKey;
    //   10: astore_2
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual Dne : (Ljava/security/PrivateKey;)Ljavax/crypto/SecretKey;
    //   17: putfield Dne : Ljavax/crypto/SecretKey;
    //   20: aload_0
    //   21: getfield Dne : [B
    //   24: aload_1
    //   25: aload_2
    //   26: invokevirtual Dne : (Ljava/security/PrivateKey;)[B
    //   29: invokestatic equals : ([B[B)Z
    //   32: ifne -> 41
    //   35: aload_0
    //   36: ldc 'Invalid client reply'
    //   38: invokevirtual Dne : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield Dne : LQyp;
    //   45: new nsl
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: invokevirtual Dne : (LNER;)V
    //   55: return
  }
  
  public void Dne(Gle paramGle) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : I
    //   4: ifne -> 55
    //   7: aload_0
    //   8: getfield bzF : Z
    //   11: ifeq -> 21
    //   14: aload_0
    //   15: ldc 'Duplicate login'
    //   17: invokevirtual Dne : (Ljava/lang/String;)V
    //   20: return
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield bzF : Z
    //   26: aload_0
    //   27: getfield Dne : LJwh;
    //   30: invokevirtual udO : ()Z
    //   33: ifeq -> 50
    //   36: new VkM
    //   39: dup
    //   40: aload_0
    //   41: invokespecial <init> : (LdnH;)V
    //   44: invokevirtual start : ()V
    //   47: goto -> 55
    //   50: aload_0
    //   51: iconst_1
    //   52: putfield FWm : Z
    //   55: return
  }
  
  public String Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: ifnull -> 50
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: aload_0
    //   15: getfield Dne : Ljava/lang/String;
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc ' ['
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_0
    //   27: getfield Dne : LQyp;
    //   30: invokevirtual Dne : ()Ljava/net/SocketAddress;
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc ']'
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: goto -> 60
    //   50: aload_0
    //   51: getfield Dne : LQyp;
    //   54: invokevirtual Dne : ()Ljava/net/SocketAddress;
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: areturn
  }
  
  static SecretKey Dne(dnH paramdnH) {
    return paramdnH.Dne;
  }
  
  public void bzF(NER paramNER) {
    Dne("Protocol error");
  }
  
  public void Dne(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJwh;
    //   4: invokevirtual Dne : ()LdLs;
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: ldc 'Disconnecting '
    //   16: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: aload_0
    //   20: invokevirtual Dne : ()Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: ldc ': '
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_1
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual toString : ()Ljava/lang/String;
    //   38: invokeinterface Dne : (Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield Dne : LQyp;
    //   47: new yZV
    //   50: dup
    //   51: aload_1
    //   52: invokespecial <init> : (Ljava/lang/String;)V
    //   55: invokevirtual Dne : (LNER;)V
    //   58: aload_0
    //   59: getfield Dne : LQyp;
    //   62: invokevirtual bzF : ()V
    //   65: aload_0
    //   66: iconst_1
    //   67: putfield Dne : Z
    //   70: goto -> 78
    //   73: astore_2
    //   74: aload_2
    //   75: invokevirtual printStackTrace : ()V
    //   78: return
    // Exception table:
    //   from	to	target	type
    //   0	70	73	java/lang/Exception
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJwh;
    //   4: invokevirtual Dne : ()LdzN;
    //   7: aload_0
    //   8: getfield Dne : LQyp;
    //   11: invokevirtual Dne : ()Ljava/net/SocketAddress;
    //   14: aload_0
    //   15: getfield Dne : Ljava/lang/String;
    //   18: invokevirtual Dne : (Ljava/net/SocketAddress;Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull -> 34
    //   26: aload_0
    //   27: aload_1
    //   28: invokevirtual Dne : (Ljava/lang/String;)V
    //   31: goto -> 68
    //   34: aload_0
    //   35: getfield Dne : LJwh;
    //   38: invokevirtual Dne : ()LdzN;
    //   41: aload_0
    //   42: getfield Dne : Ljava/lang/String;
    //   45: invokevirtual Dne : (Ljava/lang/String;)LPJQ;
    //   48: astore_2
    //   49: aload_2
    //   50: ifnull -> 68
    //   53: aload_0
    //   54: getfield Dne : LJwh;
    //   57: invokevirtual Dne : ()LdzN;
    //   60: aload_0
    //   61: getfield Dne : LQyp;
    //   64: aload_2
    //   65: invokevirtual Dne : (LRXf;LPJQ;)V
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield Dne : Z
    //   73: return
  }
  
  public boolean FWm() {
    return true;
  }
  
  static String FWm(dnH paramdnH) {
    return paramdnH.Dne;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Z
    //   4: ifeq -> 11
    //   7: aload_0
    //   8: invokevirtual FWm : ()V
    //   11: aload_0
    //   12: dup
    //   13: getfield Dne : I
    //   16: dup_x1
    //   17: iconst_1
    //   18: iadd
    //   19: putfield Dne : I
    //   22: sipush #600
    //   25: if_icmpne -> 37
    //   28: aload_0
    //   29: ldc 'Took too long to log in'
    //   31: invokevirtual Dne : (Ljava/lang/String;)V
    //   34: goto -> 44
    //   37: aload_0
    //   38: getfield Dne : LQyp;
    //   41: invokevirtual FWm : ()V
    //   44: return
  }
  
  public dnH(Jwh paramJwh, Socket paramSocket, String paramString) {
    this.Dne = false;
    this.Dne = null;
    this.FWm = false;
    this.FWm = "";
    this.bzF = false;
    this.Dne = null;
    this.Dne = paramJwh;
    this.Dne = new Qyp(paramJwh.Dne(), paramSocket, paramString, this, paramJwh.Dne().getPrivate());
    this.Dne.Dne = 0;
  }
  
  public void Dne(prJ paramprJ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJwh;
    //   4: invokevirtual Dne : ()LdzN;
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_1
    //   11: getfield Dne : I
    //   14: iconst_1
    //   15: if_icmpne -> 177
    //   18: bipush #6
    //   20: anewarray java/io/Serializable
    //   23: dup
    //   24: iconst_0
    //   25: iconst_1
    //   26: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: bipush #61
    //   34: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   37: aastore
    //   38: dup
    //   39: iconst_2
    //   40: aload_0
    //   41: getfield Dne : LJwh;
    //   44: invokevirtual Qnq : ()Ljava/lang/String;
    //   47: aastore
    //   48: dup
    //   49: iconst_3
    //   50: aload_0
    //   51: getfield Dne : LJwh;
    //   54: invokevirtual kGO : ()Ljava/lang/String;
    //   57: aastore
    //   58: dup
    //   59: iconst_4
    //   60: aload_2
    //   61: invokevirtual FWm : ()I
    //   64: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   67: aastore
    //   68: dup
    //   69: iconst_5
    //   70: aload_2
    //   71: invokevirtual bzF : ()I
    //   74: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   77: aastore
    //   78: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   81: astore #4
    //   83: aload #4
    //   85: invokeinterface iterator : ()Ljava/util/Iterator;
    //   90: astore #6
    //   92: aload #6
    //   94: invokeinterface hasNext : ()Z
    //   99: ifeq -> 174
    //   102: aload #6
    //   104: invokeinterface next : ()Ljava/lang/Object;
    //   109: astore #5
    //   111: aload_3
    //   112: ifnonnull -> 121
    //   115: ldc '§'
    //   117: astore_3
    //   118: goto -> 141
    //   121: new java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: aload_3
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: ldc ' '
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual toString : ()Ljava/lang/String;
    //   140: astore_3
    //   141: new java/lang/StringBuilder
    //   144: dup
    //   145: invokespecial <init> : ()V
    //   148: aload_3
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload #5
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: ldc ' '
    //   159: ldc ''
    //   161: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual toString : ()Ljava/lang/String;
    //   170: astore_3
    //   171: goto -> 92
    //   174: goto -> 222
    //   177: new java/lang/StringBuilder
    //   180: dup
    //   181: invokespecial <init> : ()V
    //   184: aload_0
    //   185: getfield Dne : LJwh;
    //   188: invokevirtual kGO : ()Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc '§'
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload_2
    //   200: invokevirtual FWm : ()I
    //   203: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   206: ldc '§'
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload_2
    //   212: invokevirtual bzF : ()I
    //   215: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: astore_3
    //   222: aconst_null
    //   223: astore #4
    //   225: aload_0
    //   226: getfield Dne : LQyp;
    //   229: invokevirtual Dne : ()Ljava/net/Socket;
    //   232: ifnull -> 247
    //   235: aload_0
    //   236: getfield Dne : LQyp;
    //   239: invokevirtual Dne : ()Ljava/net/Socket;
    //   242: invokevirtual getInetAddress : ()Ljava/net/InetAddress;
    //   245: astore #4
    //   247: aload_0
    //   248: getfield Dne : LQyp;
    //   251: new yZV
    //   254: dup
    //   255: aload_3
    //   256: invokespecial <init> : (Ljava/lang/String;)V
    //   259: invokevirtual Dne : (LNER;)V
    //   262: aload_0
    //   263: getfield Dne : LQyp;
    //   266: invokevirtual bzF : ()V
    //   269: aload #4
    //   271: ifnull -> 302
    //   274: aload_0
    //   275: getfield Dne : LJwh;
    //   278: invokevirtual Dne : ()LNuQ;
    //   281: instanceof ysI
    //   284: ifeq -> 302
    //   287: aload_0
    //   288: getfield Dne : LJwh;
    //   291: invokevirtual Dne : ()LNuQ;
    //   294: checkcast ysI
    //   297: aload #4
    //   299: invokevirtual Dne : (Ljava/net/InetAddress;)V
    //   302: aload_0
    //   303: iconst_1
    //   304: putfield Dne : Z
    //   307: goto -> 315
    //   310: astore_2
    //   311: aload_2
    //   312: invokevirtual printStackTrace : ()V
    //   315: return
    // Exception table:
    //   from	to	target	type
    //   0	307	310	java/lang/Exception
  }
  
  public void Dne(ike paramike) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Dne : ()Ljava/lang/String;
    //   5: putfield Dne : Ljava/lang/String;
    //   8: aload_0
    //   9: getfield Dne : Ljava/lang/String;
    //   12: aload_0
    //   13: getfield Dne : Ljava/lang/String;
    //   16: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   19: invokevirtual equals : (Ljava/lang/Object;)Z
    //   22: ifne -> 35
    //   25: aload_0
    //   26: ldc_w 'Invalid username!'
    //   29: invokevirtual Dne : (Ljava/lang/String;)V
    //   32: goto -> 155
    //   35: aload_0
    //   36: getfield Dne : LJwh;
    //   39: invokevirtual Dne : ()Ljava/security/KeyPair;
    //   42: invokevirtual getPublic : ()Ljava/security/PublicKey;
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual FWm : ()I
    //   50: bipush #61
    //   52: if_icmpeq -> 84
    //   55: aload_1
    //   56: invokevirtual FWm : ()I
    //   59: bipush #61
    //   61: if_icmple -> 74
    //   64: aload_0
    //   65: ldc_w 'Outdated server!'
    //   68: invokevirtual Dne : (Ljava/lang/String;)V
    //   71: goto -> 155
    //   74: aload_0
    //   75: ldc_w 'Outdated client!'
    //   78: invokevirtual Dne : (Ljava/lang/String;)V
    //   81: goto -> 155
    //   84: aload_0
    //   85: aload_0
    //   86: getfield Dne : LJwh;
    //   89: invokevirtual udO : ()Z
    //   92: ifeq -> 109
    //   95: getstatic dnH.Dne : Ljava/util/Random;
    //   98: invokevirtual nextLong : ()J
    //   101: bipush #16
    //   103: invokestatic toString : (JI)Ljava/lang/String;
    //   106: goto -> 112
    //   109: ldc_w '-'
    //   112: putfield FWm : Ljava/lang/String;
    //   115: aload_0
    //   116: iconst_4
    //   117: newarray byte
    //   119: putfield Dne : [B
    //   122: getstatic dnH.Dne : Ljava/util/Random;
    //   125: aload_0
    //   126: getfield Dne : [B
    //   129: invokevirtual nextBytes : ([B)V
    //   132: aload_0
    //   133: getfield Dne : LQyp;
    //   136: new GJK
    //   139: dup
    //   140: aload_0
    //   141: getfield FWm : Ljava/lang/String;
    //   144: aload_2
    //   145: aload_0
    //   146: getfield Dne : [B
    //   149: invokespecial <init> : (Ljava/lang/String;Ljava/security/PublicKey;[B)V
    //   152: invokevirtual Dne : (LNER;)V
    //   155: return
  }
  
  static String Dne(dnH paramdnH) {
    return paramdnH.FWm;
  }
  
  static boolean Dne(dnH paramdnH, boolean paramBoolean) {
    return paramdnH.FWm = paramBoolean;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dnH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */