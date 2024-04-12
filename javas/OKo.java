import java.util.ArrayList;
import java.util.List;

public class OKo {
  private final Bkx Dne;
  
  private int FWm;
  
  private List Dne;
  
  private List FWm = new ArrayList();
  
  private int Dne = new ArrayList();
  
  public void Dne(cMv paramcMv) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore_2
    //   10: aload_2
    //   11: invokeinterface hasNext : ()Z
    //   16: ifeq -> 79
    //   19: aload_2
    //   20: invokeinterface next : ()Ljava/lang/Object;
    //   25: checkcast lvo
    //   28: astore_3
    //   29: aload_3
    //   30: getfield Dne : LcMv;
    //   33: astore #4
    //   35: aload #4
    //   37: aload_1
    //   38: if_acmpne -> 76
    //   41: aload_0
    //   42: getfield FWm : Ljava/util/List;
    //   45: aload_3
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: ifeq -> 70
    //   54: aload #4
    //   56: invokevirtual FWm : ()V
    //   59: aload_0
    //   60: getfield FWm : Ljava/util/List;
    //   63: aload_3
    //   64: invokeinterface remove : (Ljava/lang/Object;)Z
    //   69: pop
    //   70: aload_2
    //   71: invokeinterface remove : ()V
    //   76: goto -> 10
    //   79: return
  }
  
  private boolean FWm(lvo paramlvo) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LBkx;
    //   4: ldc 'canUse'
    //   6: invokevirtual Dne : (Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield Dne : Ljava/util/List;
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore_2
    //   19: aload_2
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 120
    //   28: aload_2
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast lvo
    //   37: astore_3
    //   38: aload_3
    //   39: aload_1
    //   40: if_acmpeq -> 117
    //   43: aload_1
    //   44: getfield Dne : I
    //   47: aload_3
    //   48: getfield Dne : I
    //   51: if_icmplt -> 85
    //   54: aload_0
    //   55: getfield FWm : Ljava/util/List;
    //   58: aload_3
    //   59: invokeinterface contains : (Ljava/lang/Object;)Z
    //   64: ifeq -> 117
    //   67: aload_0
    //   68: aload_1
    //   69: aload_3
    //   70: invokespecial Dne : (Llvo;Llvo;)Z
    //   73: ifne -> 117
    //   76: aload_0
    //   77: getfield Dne : LBkx;
    //   80: invokevirtual FWm : ()V
    //   83: iconst_0
    //   84: ireturn
    //   85: aload_0
    //   86: getfield FWm : Ljava/util/List;
    //   89: aload_3
    //   90: invokeinterface contains : (Ljava/lang/Object;)Z
    //   95: ifeq -> 117
    //   98: aload_3
    //   99: getfield Dne : LcMv;
    //   102: invokevirtual aFZ : ()Z
    //   105: ifne -> 117
    //   108: aload_0
    //   109: getfield Dne : LBkx;
    //   112: invokevirtual FWm : ()V
    //   115: iconst_0
    //   116: ireturn
    //   117: goto -> 19
    //   120: aload_0
    //   121: getfield Dne : LBkx;
    //   124: invokevirtual FWm : ()V
    //   127: iconst_1
    //   128: ireturn
  }
  
  public void Dne(int paramInt, cMv paramcMv) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: new lvo
    //   7: dup
    //   8: aload_0
    //   9: iload_1
    //   10: aload_2
    //   11: invokespecial <init> : (LOKo;ILcMv;)V
    //   14: invokeinterface add : (Ljava/lang/Object;)Z
    //   19: pop
    //   20: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: dup
    //   10: getfield Dne : I
    //   13: dup_x1
    //   14: iconst_1
    //   15: iadd
    //   16: putfield Dne : I
    //   19: aload_0
    //   20: getfield FWm : I
    //   23: irem
    //   24: ifne -> 148
    //   27: aload_0
    //   28: getfield Dne : Ljava/util/List;
    //   31: invokeinterface iterator : ()Ljava/util/Iterator;
    //   36: astore_2
    //   37: aload_2
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 203
    //   46: aload_2
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: checkcast lvo
    //   55: astore_3
    //   56: aload_0
    //   57: getfield FWm : Ljava/util/List;
    //   60: aload_3
    //   61: invokeinterface contains : (Ljava/lang/Object;)Z
    //   66: istore #4
    //   68: iload #4
    //   70: ifeq -> 110
    //   73: aload_0
    //   74: aload_3
    //   75: invokespecial FWm : (Llvo;)Z
    //   78: ifeq -> 92
    //   81: aload_0
    //   82: aload_3
    //   83: invokespecial Dne : (Llvo;)Z
    //   86: ifeq -> 92
    //   89: goto -> 37
    //   92: aload_3
    //   93: getfield Dne : LcMv;
    //   96: invokevirtual FWm : ()V
    //   99: aload_0
    //   100: getfield FWm : Ljava/util/List;
    //   103: aload_3
    //   104: invokeinterface remove : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload_0
    //   111: aload_3
    //   112: invokespecial FWm : (Llvo;)Z
    //   115: ifeq -> 145
    //   118: aload_3
    //   119: getfield Dne : LcMv;
    //   122: invokevirtual Dne : ()Z
    //   125: ifeq -> 145
    //   128: aload_1
    //   129: aload_3
    //   130: invokevirtual add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: aload_0
    //   135: getfield FWm : Ljava/util/List;
    //   138: aload_3
    //   139: invokeinterface add : (Ljava/lang/Object;)Z
    //   144: pop
    //   145: goto -> 37
    //   148: aload_0
    //   149: getfield FWm : Ljava/util/List;
    //   152: invokeinterface iterator : ()Ljava/util/Iterator;
    //   157: astore_2
    //   158: aload_2
    //   159: invokeinterface hasNext : ()Z
    //   164: ifeq -> 203
    //   167: aload_2
    //   168: invokeinterface next : ()Ljava/lang/Object;
    //   173: checkcast lvo
    //   176: astore_3
    //   177: aload_3
    //   178: getfield Dne : LcMv;
    //   181: invokevirtual FWm : ()Z
    //   184: ifne -> 158
    //   187: aload_3
    //   188: getfield Dne : LcMv;
    //   191: invokevirtual FWm : ()V
    //   194: aload_2
    //   195: invokeinterface remove : ()V
    //   200: goto -> 158
    //   203: aload_0
    //   204: getfield Dne : LBkx;
    //   207: ldc 'goalStart'
    //   209: invokevirtual Dne : (Ljava/lang/String;)V
    //   212: aload_1
    //   213: invokevirtual iterator : ()Ljava/util/Iterator;
    //   216: astore_2
    //   217: aload_2
    //   218: invokeinterface hasNext : ()Z
    //   223: ifeq -> 270
    //   226: aload_2
    //   227: invokeinterface next : ()Ljava/lang/Object;
    //   232: checkcast lvo
    //   235: astore_3
    //   236: aload_0
    //   237: getfield Dne : LBkx;
    //   240: aload_3
    //   241: getfield Dne : LcMv;
    //   244: invokevirtual getClass : ()Ljava/lang/Class;
    //   247: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   250: invokevirtual Dne : (Ljava/lang/String;)V
    //   253: aload_3
    //   254: getfield Dne : LcMv;
    //   257: invokevirtual Dne : ()V
    //   260: aload_0
    //   261: getfield Dne : LBkx;
    //   264: invokevirtual FWm : ()V
    //   267: goto -> 217
    //   270: aload_0
    //   271: getfield Dne : LBkx;
    //   274: invokevirtual FWm : ()V
    //   277: aload_0
    //   278: getfield Dne : LBkx;
    //   281: ldc 'goalTick'
    //   283: invokevirtual Dne : (Ljava/lang/String;)V
    //   286: aload_0
    //   287: getfield FWm : Ljava/util/List;
    //   290: invokeinterface iterator : ()Ljava/util/Iterator;
    //   295: astore_2
    //   296: aload_2
    //   297: invokeinterface hasNext : ()Z
    //   302: ifeq -> 325
    //   305: aload_2
    //   306: invokeinterface next : ()Ljava/lang/Object;
    //   311: checkcast lvo
    //   314: astore_3
    //   315: aload_3
    //   316: getfield Dne : LcMv;
    //   319: invokevirtual bzF : ()V
    //   322: goto -> 296
    //   325: aload_0
    //   326: getfield Dne : LBkx;
    //   329: invokevirtual FWm : ()V
    //   332: return
  }
  
  public OKo(Bkx paramBkx) {
    this.Dne = 0;
    this.FWm = 3;
    this.Dne = paramBkx;
  }
  
  private boolean Dne(lvo paramlvo1, lvo paramlvo2) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LcMv;
    //   4: invokevirtual FWm : ()I
    //   7: aload_2
    //   8: getfield Dne : LcMv;
    //   11: invokevirtual FWm : ()I
    //   14: iand
    //   15: ifne -> 22
    //   18: iconst_1
    //   19: goto -> 23
    //   22: iconst_0
    //   23: ireturn
  }
  
  private boolean Dne(lvo paramlvo) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LBkx;
    //   4: ldc 'canContinue'
    //   6: invokevirtual Dne : (Ljava/lang/String;)V
    //   9: aload_1
    //   10: getfield Dne : LcMv;
    //   13: invokevirtual FWm : ()Z
    //   16: istore_2
    //   17: aload_0
    //   18: getfield Dne : LBkx;
    //   21: invokevirtual FWm : ()V
    //   24: iload_2
    //   25: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OKo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */