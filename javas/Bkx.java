import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bkx {
  private final Map Dne;
  
  private final List Dne;
  
  private String Dne;
  
  private final List FWm = new ArrayList();
  
  public boolean Dne = new ArrayList();
  
  public String Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: ifne -> 17
    //   12: ldc '[UNKNOWN]'
    //   14: goto -> 40
    //   17: aload_0
    //   18: getfield Dne : Ljava/util/List;
    //   21: aload_0
    //   22: getfield Dne : Ljava/util/List;
    //   25: invokeinterface size : ()I
    //   30: iconst_1
    //   31: isub
    //   32: invokeinterface get : (I)Ljava/lang/Object;
    //   37: checkcast java/lang/String
    //   40: areturn
  }
  
  public List Dne(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifne -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: getfield Dne : Ljava/util/Map;
    //   13: ldc 'root'
    //   15: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   20: ifeq -> 43
    //   23: aload_0
    //   24: getfield Dne : Ljava/util/Map;
    //   27: ldc 'root'
    //   29: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   34: checkcast java/lang/Long
    //   37: invokevirtual longValue : ()J
    //   40: goto -> 44
    //   43: lconst_0
    //   44: lstore_2
    //   45: aload_0
    //   46: getfield Dne : Ljava/util/Map;
    //   49: aload_1
    //   50: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   55: ifeq -> 77
    //   58: aload_0
    //   59: getfield Dne : Ljava/util/Map;
    //   62: aload_1
    //   63: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast java/lang/Long
    //   71: invokevirtual longValue : ()J
    //   74: goto -> 80
    //   77: ldc2_w -1
    //   80: lstore #4
    //   82: new java/util/ArrayList
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: astore #6
    //   91: aload_1
    //   92: invokevirtual length : ()I
    //   95: ifle -> 118
    //   98: new java/lang/StringBuilder
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: aload_1
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc '.'
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: astore_1
    //   118: lconst_0
    //   119: lstore #7
    //   121: aload_0
    //   122: getfield Dne : Ljava/util/Map;
    //   125: invokeinterface keySet : ()Ljava/util/Set;
    //   130: invokeinterface iterator : ()Ljava/util/Iterator;
    //   135: astore #9
    //   137: aload #9
    //   139: invokeinterface hasNext : ()Z
    //   144: ifeq -> 221
    //   147: aload #9
    //   149: invokeinterface next : ()Ljava/lang/Object;
    //   154: checkcast java/lang/String
    //   157: astore #10
    //   159: aload #10
    //   161: invokevirtual length : ()I
    //   164: aload_1
    //   165: invokevirtual length : ()I
    //   168: if_icmple -> 218
    //   171: aload #10
    //   173: aload_1
    //   174: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   177: ifeq -> 218
    //   180: aload #10
    //   182: ldc '.'
    //   184: aload_1
    //   185: invokevirtual length : ()I
    //   188: iconst_1
    //   189: iadd
    //   190: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   193: ifge -> 218
    //   196: lload #7
    //   198: aload_0
    //   199: getfield Dne : Ljava/util/Map;
    //   202: aload #10
    //   204: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   209: checkcast java/lang/Long
    //   212: invokevirtual longValue : ()J
    //   215: ladd
    //   216: lstore #7
    //   218: goto -> 137
    //   221: lload #7
    //   223: l2f
    //   224: fstore #10
    //   226: lload #7
    //   228: lload #4
    //   230: lcmp
    //   231: ifge -> 238
    //   234: lload #4
    //   236: lstore #7
    //   238: lload_2
    //   239: lload #7
    //   241: lcmp
    //   242: ifge -> 248
    //   245: lload #7
    //   247: lstore_2
    //   248: aload_0
    //   249: getfield Dne : Ljava/util/Map;
    //   252: invokeinterface keySet : ()Ljava/util/Set;
    //   257: invokeinterface iterator : ()Ljava/util/Iterator;
    //   262: astore #11
    //   264: aload #11
    //   266: invokeinterface hasNext : ()Z
    //   271: ifeq -> 400
    //   274: aload #11
    //   276: invokeinterface next : ()Ljava/lang/Object;
    //   281: checkcast java/lang/String
    //   284: astore #12
    //   286: aload #12
    //   288: invokevirtual length : ()I
    //   291: aload_1
    //   292: invokevirtual length : ()I
    //   295: if_icmple -> 264
    //   298: aload #12
    //   300: aload_1
    //   301: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   304: ifeq -> 264
    //   307: aload #12
    //   309: ldc '.'
    //   311: aload_1
    //   312: invokevirtual length : ()I
    //   315: iconst_1
    //   316: iadd
    //   317: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   320: ifge -> 264
    //   323: aload_0
    //   324: getfield Dne : Ljava/util/Map;
    //   327: aload #12
    //   329: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   334: checkcast java/lang/Long
    //   337: invokevirtual longValue : ()J
    //   340: lstore #13
    //   342: lload #13
    //   344: l2d
    //   345: ldc2_w 100.0
    //   348: dmul
    //   349: lload #7
    //   351: l2d
    //   352: ddiv
    //   353: dstore #15
    //   355: lload #13
    //   357: l2d
    //   358: ldc2_w 100.0
    //   361: dmul
    //   362: lload_2
    //   363: l2d
    //   364: ddiv
    //   365: dstore #17
    //   367: aload #12
    //   369: aload_1
    //   370: invokevirtual length : ()I
    //   373: invokevirtual substring : (I)Ljava/lang/String;
    //   376: astore #19
    //   378: aload #6
    //   380: new Gup
    //   383: dup
    //   384: aload #19
    //   386: dload #15
    //   388: dload #17
    //   390: invokespecial <init> : (Ljava/lang/String;DD)V
    //   393: invokevirtual add : (Ljava/lang/Object;)Z
    //   396: pop
    //   397: goto -> 264
    //   400: aload_0
    //   401: getfield Dne : Ljava/util/Map;
    //   404: invokeinterface keySet : ()Ljava/util/Set;
    //   409: invokeinterface iterator : ()Ljava/util/Iterator;
    //   414: astore #11
    //   416: aload #11
    //   418: invokeinterface hasNext : ()Z
    //   423: ifeq -> 481
    //   426: aload #11
    //   428: invokeinterface next : ()Ljava/lang/Object;
    //   433: checkcast java/lang/String
    //   436: astore #12
    //   438: aload_0
    //   439: getfield Dne : Ljava/util/Map;
    //   442: aload #12
    //   444: aload_0
    //   445: getfield Dne : Ljava/util/Map;
    //   448: aload #12
    //   450: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   455: checkcast java/lang/Long
    //   458: invokevirtual longValue : ()J
    //   461: ldc2_w 999
    //   464: lmul
    //   465: ldc2_w 1000
    //   468: ldiv
    //   469: invokestatic valueOf : (J)Ljava/lang/Long;
    //   472: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   477: pop
    //   478: goto -> 416
    //   481: lload #7
    //   483: l2f
    //   484: fload #10
    //   486: fcmpl
    //   487: ifle -> 534
    //   490: aload #6
    //   492: new Gup
    //   495: dup
    //   496: ldc 'unspecified'
    //   498: lload #7
    //   500: l2f
    //   501: fload #10
    //   503: fsub
    //   504: f2d
    //   505: ldc2_w 100.0
    //   508: dmul
    //   509: lload #7
    //   511: l2d
    //   512: ddiv
    //   513: lload #7
    //   515: l2f
    //   516: fload #10
    //   518: fsub
    //   519: f2d
    //   520: ldc2_w 100.0
    //   523: dmul
    //   524: lload_2
    //   525: l2d
    //   526: ddiv
    //   527: invokespecial <init> : (Ljava/lang/String;DD)V
    //   530: invokevirtual add : (Ljava/lang/Object;)Z
    //   533: pop
    //   534: aload #6
    //   536: invokestatic sort : (Ljava/util/List;)V
    //   539: aload #6
    //   541: iconst_0
    //   542: new Gup
    //   545: dup
    //   546: aload_1
    //   547: ldc2_w 100.0
    //   550: lload #7
    //   552: l2d
    //   553: ldc2_w 100.0
    //   556: dmul
    //   557: lload_2
    //   558: l2d
    //   559: ddiv
    //   560: invokespecial <init> : (Ljava/lang/String;DD)V
    //   563: invokevirtual add : (ILjava/lang/Object;)V
    //   566: aload #6
    //   568: areturn
  }
  
  public void Dne(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 98
    //   7: aload_0
    //   8: getfield Dne : Ljava/lang/String;
    //   11: invokevirtual length : ()I
    //   14: ifle -> 43
    //   17: aload_0
    //   18: new java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: aload_0
    //   26: getfield Dne : Ljava/lang/String;
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc '.'
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual toString : ()Ljava/lang/String;
    //   40: putfield Dne : Ljava/lang/String;
    //   43: aload_0
    //   44: new java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: aload_0
    //   52: getfield Dne : Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload_1
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual toString : ()Ljava/lang/String;
    //   65: putfield Dne : Ljava/lang/String;
    //   68: aload_0
    //   69: getfield Dne : Ljava/util/List;
    //   72: aload_0
    //   73: getfield Dne : Ljava/lang/String;
    //   76: invokeinterface add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_0
    //   83: getfield FWm : Ljava/util/List;
    //   86: invokestatic nanoTime : ()J
    //   89: invokestatic valueOf : (J)Ljava/lang/Long;
    //   92: invokeinterface add : (Ljava/lang/Object;)Z
    //   97: pop
    //   98: return
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 242
    //   7: invokestatic nanoTime : ()J
    //   10: lstore_1
    //   11: aload_0
    //   12: getfield FWm : Ljava/util/List;
    //   15: aload_0
    //   16: getfield FWm : Ljava/util/List;
    //   19: invokeinterface size : ()I
    //   24: iconst_1
    //   25: isub
    //   26: invokeinterface remove : (I)Ljava/lang/Object;
    //   31: checkcast java/lang/Long
    //   34: invokevirtual longValue : ()J
    //   37: lstore_3
    //   38: aload_0
    //   39: getfield Dne : Ljava/util/List;
    //   42: aload_0
    //   43: getfield Dne : Ljava/util/List;
    //   46: invokeinterface size : ()I
    //   51: iconst_1
    //   52: isub
    //   53: invokeinterface remove : (I)Ljava/lang/Object;
    //   58: pop
    //   59: lload_1
    //   60: lload_3
    //   61: lsub
    //   62: lstore #5
    //   64: aload_0
    //   65: getfield Dne : Ljava/util/Map;
    //   68: aload_0
    //   69: getfield Dne : Ljava/lang/String;
    //   72: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   77: ifeq -> 122
    //   80: aload_0
    //   81: getfield Dne : Ljava/util/Map;
    //   84: aload_0
    //   85: getfield Dne : Ljava/lang/String;
    //   88: aload_0
    //   89: getfield Dne : Ljava/util/Map;
    //   92: aload_0
    //   93: getfield Dne : Ljava/lang/String;
    //   96: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   101: checkcast java/lang/Long
    //   104: invokevirtual longValue : ()J
    //   107: lload #5
    //   109: ladd
    //   110: invokestatic valueOf : (J)Ljava/lang/Long;
    //   113: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   118: pop
    //   119: goto -> 141
    //   122: aload_0
    //   123: getfield Dne : Ljava/util/Map;
    //   126: aload_0
    //   127: getfield Dne : Ljava/lang/String;
    //   130: lload #5
    //   132: invokestatic valueOf : (J)Ljava/lang/Long;
    //   135: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   140: pop
    //   141: lload #5
    //   143: ldc2_w 100000000
    //   146: lcmp
    //   147: ifle -> 198
    //   150: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   153: new java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: ldc 'Something's taking too long! ''
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_0
    //   166: getfield Dne : Ljava/lang/String;
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: ldc '' took aprox '
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: lload #5
    //   179: l2d
    //   180: ldc2_w 1000000.0
    //   183: ddiv
    //   184: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   187: ldc ' ms'
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: invokevirtual println : (Ljava/lang/String;)V
    //   198: aload_0
    //   199: aload_0
    //   200: getfield Dne : Ljava/util/List;
    //   203: invokeinterface isEmpty : ()Z
    //   208: ifne -> 237
    //   211: aload_0
    //   212: getfield Dne : Ljava/util/List;
    //   215: aload_0
    //   216: getfield Dne : Ljava/util/List;
    //   219: invokeinterface size : ()I
    //   224: iconst_1
    //   225: isub
    //   226: invokeinterface get : (I)Ljava/lang/Object;
    //   231: checkcast java/lang/String
    //   234: goto -> 239
    //   237: ldc ''
    //   239: putfield Dne : Ljava/lang/String;
    //   242: return
  }
  
  public void FWm(String paramString) {
    FWm();
    Dne(paramString);
  }
  
  public Bkx() {
    this.Dne = false;
    this.Dne = "";
    this.Dne = new HashMap<>();
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Map;
    //   4: invokeinterface clear : ()V
    //   9: aload_0
    //   10: ldc ''
    //   12: putfield Dne : Ljava/lang/String;
    //   15: aload_0
    //   16: getfield Dne : Ljava/util/List;
    //   19: invokeinterface clear : ()V
    //   24: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Bkx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */