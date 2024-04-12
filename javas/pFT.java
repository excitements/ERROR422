import java.util.ArrayList;
import java.util.List;

public class pFT {
  private final List Dne;
  
  private boolean FWm;
  
  private String Dne;
  
  private int Dne;
  
  private final FUH Dne;
  
  private boolean Dne = new ArrayList();
  
  public void Dne(zBn paramzBn, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial bzF : ()V
    //   4: aload_0
    //   5: invokevirtual Dne : ()V
    //   8: new JIS
    //   11: dup
    //   12: aload_1
    //   13: aload_0
    //   14: getfield Dne : LFUH;
    //   17: getfield zGp : I
    //   20: iload_2
    //   21: iload_3
    //   22: aload_0
    //   23: getfield Dne : Ljava/lang/String;
    //   26: aload_0
    //   27: getfield Dne : LFUH;
    //   30: getfield ceE : F
    //   33: invokespecial <init> : (LzBn;IIILjava/lang/String;F)V
    //   36: astore #4
    //   38: aload_0
    //   39: getfield Dne : Ljava/util/List;
    //   42: aload #4
    //   44: invokeinterface add : (Ljava/lang/Object;)Z
    //   49: pop
    //   50: aload_0
    //   51: aload_0
    //   52: getfield Dne : LFUH;
    //   55: getfield zGp : I
    //   58: putfield Dne : I
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield FWm : Z
    //   66: aload_0
    //   67: dup
    //   68: getfield Dne : Z
    //   71: aload #4
    //   73: invokevirtual Dne : ()Z
    //   76: ior
    //   77: putfield Dne : Z
    //   80: return
  }
  
  private JIS Dne() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: fconst_0
    //   7: fstore #4
    //   9: iconst_0
    //   10: istore #5
    //   12: iload #5
    //   14: aload_0
    //   15: getfield Dne : Ljava/util/List;
    //   18: invokeinterface size : ()I
    //   23: if_icmpge -> 167
    //   26: aload_0
    //   27: getfield Dne : Ljava/util/List;
    //   30: iload #5
    //   32: invokeinterface get : (I)Ljava/lang/Object;
    //   37: checkcast JIS
    //   40: astore #6
    //   42: iload #5
    //   44: ifle -> 66
    //   47: aload_0
    //   48: getfield Dne : Ljava/util/List;
    //   51: iload #5
    //   53: iconst_1
    //   54: isub
    //   55: invokeinterface get : (I)Ljava/lang/Object;
    //   60: checkcast JIS
    //   63: goto -> 67
    //   66: aconst_null
    //   67: astore #7
    //   69: aload #6
    //   71: invokevirtual Dne : ()LzBn;
    //   74: getstatic zBn.div : LzBn;
    //   77: if_acmpeq -> 91
    //   80: aload #6
    //   82: invokevirtual Dne : ()LzBn;
    //   85: getstatic zBn.IjH : LzBn;
    //   88: if_acmpne -> 137
    //   91: aload #6
    //   93: invokevirtual Dne : ()F
    //   96: fconst_0
    //   97: fcmpl
    //   98: ifle -> 137
    //   101: aload_1
    //   102: ifnull -> 116
    //   105: aload #6
    //   107: invokevirtual Dne : ()F
    //   110: fload #4
    //   112: fcmpl
    //   113: ifle -> 137
    //   116: iload #5
    //   118: ifle -> 127
    //   121: aload #7
    //   123: astore_1
    //   124: goto -> 130
    //   127: aload #6
    //   129: astore_1
    //   130: aload #6
    //   132: invokevirtual Dne : ()F
    //   135: fstore #4
    //   137: aload #6
    //   139: invokevirtual Dne : ()Ljava/lang/String;
    //   142: ifnull -> 161
    //   145: aload_2
    //   146: ifnull -> 158
    //   149: aload #6
    //   151: invokevirtual Dne : ()I
    //   154: iload_3
    //   155: if_icmple -> 161
    //   158: aload #6
    //   160: astore_2
    //   161: iinc #5, 1
    //   164: goto -> 12
    //   167: fload #4
    //   169: ldc 5.0
    //   171: fcmpl
    //   172: ifle -> 181
    //   175: aload_1
    //   176: ifnull -> 181
    //   179: aload_1
    //   180: areturn
    //   181: iload_3
    //   182: iconst_5
    //   183: if_icmple -> 192
    //   186: aload_2
    //   187: ifnull -> 192
    //   190: aload_2
    //   191: areturn
    //   192: aconst_null
    //   193: areturn
  }
  
  public String Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: ifne -> 38
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: aload_0
    //   20: getfield Dne : LFUH;
    //   23: invokevirtual aFZ : ()Ljava/lang/String;
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc ' died'
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: areturn
    //   38: aload_0
    //   39: invokespecial Dne : ()LJIS;
    //   42: astore_1
    //   43: aload_0
    //   44: getfield Dne : Ljava/util/List;
    //   47: aload_0
    //   48: getfield Dne : Ljava/util/List;
    //   51: invokeinterface size : ()I
    //   56: iconst_1
    //   57: isub
    //   58: invokeinterface get : (I)Ljava/lang/Object;
    //   63: checkcast JIS
    //   66: astore_2
    //   67: ldc ''
    //   69: astore_3
    //   70: aload_2
    //   71: invokevirtual FWm : ()Ljava/lang/String;
    //   74: astore #4
    //   76: aload_2
    //   77: invokevirtual Dne : ()LzBn;
    //   80: invokevirtual FWm : ()LsMa;
    //   83: astore #5
    //   85: aload_1
    //   86: ifnull -> 424
    //   89: aload_2
    //   90: invokevirtual Dne : ()LzBn;
    //   93: getstatic zBn.div : LzBn;
    //   96: if_acmpne -> 424
    //   99: aload_1
    //   100: invokevirtual FWm : ()Ljava/lang/String;
    //   103: astore #6
    //   105: aload_1
    //   106: invokevirtual Dne : ()LzBn;
    //   109: getstatic zBn.div : LzBn;
    //   112: if_acmpeq -> 380
    //   115: aload_1
    //   116: invokevirtual Dne : ()LzBn;
    //   119: getstatic zBn.IjH : LzBn;
    //   122: if_acmpeq -> 380
    //   125: aload #6
    //   127: ifnull -> 253
    //   130: aload #4
    //   132: ifnull -> 145
    //   135: aload #6
    //   137: aload #4
    //   139: invokevirtual equals : (Ljava/lang/Object;)Z
    //   142: ifne -> 253
    //   145: aload_1
    //   146: invokevirtual Dne : ()LzBn;
    //   149: invokevirtual FWm : ()LsMa;
    //   152: astore #7
    //   154: aload #7
    //   156: instanceof FUH
    //   159: ifeq -> 173
    //   162: aload #7
    //   164: checkcast FUH
    //   167: invokevirtual Dne : ()LNMq;
    //   170: goto -> 174
    //   173: aconst_null
    //   174: astore #8
    //   176: aload #8
    //   178: ifnull -> 225
    //   181: aload #8
    //   183: invokevirtual zGp : ()Z
    //   186: ifeq -> 225
    //   189: ldc 'death.fell.assist.item'
    //   191: iconst_3
    //   192: anewarray java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload_0
    //   198: getfield Dne : LFUH;
    //   201: invokevirtual aFZ : ()Ljava/lang/String;
    //   204: aastore
    //   205: dup
    //   206: iconst_1
    //   207: aload #4
    //   209: aastore
    //   210: dup
    //   211: iconst_2
    //   212: aload #8
    //   214: invokevirtual FWm : ()Ljava/lang/String;
    //   217: aastore
    //   218: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   221: astore_3
    //   222: goto -> 250
    //   225: ldc 'death.fell.assist'
    //   227: iconst_2
    //   228: anewarray java/lang/Object
    //   231: dup
    //   232: iconst_0
    //   233: aload_0
    //   234: getfield Dne : LFUH;
    //   237: invokevirtual aFZ : ()Ljava/lang/String;
    //   240: aastore
    //   241: dup
    //   242: iconst_1
    //   243: aload #6
    //   245: aastore
    //   246: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   249: astore_3
    //   250: goto -> 421
    //   253: aload #4
    //   255: ifnull -> 357
    //   258: aload #5
    //   260: instanceof FUH
    //   263: ifeq -> 277
    //   266: aload #5
    //   268: checkcast FUH
    //   271: invokevirtual Dne : ()LNMq;
    //   274: goto -> 278
    //   277: aconst_null
    //   278: astore #7
    //   280: aload #7
    //   282: ifnull -> 329
    //   285: aload #7
    //   287: invokevirtual zGp : ()Z
    //   290: ifeq -> 329
    //   293: ldc 'death.fell.finish.item'
    //   295: iconst_3
    //   296: anewarray java/lang/Object
    //   299: dup
    //   300: iconst_0
    //   301: aload_0
    //   302: getfield Dne : LFUH;
    //   305: invokevirtual aFZ : ()Ljava/lang/String;
    //   308: aastore
    //   309: dup
    //   310: iconst_1
    //   311: aload #4
    //   313: aastore
    //   314: dup
    //   315: iconst_2
    //   316: aload #7
    //   318: invokevirtual FWm : ()Ljava/lang/String;
    //   321: aastore
    //   322: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   325: astore_3
    //   326: goto -> 354
    //   329: ldc 'death.fell.finish'
    //   331: iconst_2
    //   332: anewarray java/lang/Object
    //   335: dup
    //   336: iconst_0
    //   337: aload_0
    //   338: getfield Dne : LFUH;
    //   341: invokevirtual aFZ : ()Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_1
    //   347: aload #4
    //   349: aastore
    //   350: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   353: astore_3
    //   354: goto -> 421
    //   357: ldc 'death.fell.killer'
    //   359: iconst_1
    //   360: anewarray java/lang/Object
    //   363: dup
    //   364: iconst_0
    //   365: aload_0
    //   366: getfield Dne : LFUH;
    //   369: invokevirtual aFZ : ()Ljava/lang/String;
    //   372: aastore
    //   373: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   376: astore_3
    //   377: goto -> 421
    //   380: new java/lang/StringBuilder
    //   383: dup
    //   384: invokespecial <init> : ()V
    //   387: ldc 'death.fell.accident.'
    //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: aload_0
    //   393: aload_1
    //   394: invokespecial Dne : (LJIS;)Ljava/lang/String;
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: invokevirtual toString : ()Ljava/lang/String;
    //   403: iconst_1
    //   404: anewarray java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: aload_0
    //   410: getfield Dne : LFUH;
    //   413: invokevirtual aFZ : ()Ljava/lang/String;
    //   416: aastore
    //   417: invokestatic Dne : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   420: astore_3
    //   421: goto -> 436
    //   424: aload_2
    //   425: invokevirtual Dne : ()LzBn;
    //   428: aload_0
    //   429: getfield Dne : LFUH;
    //   432: invokevirtual Dne : (LFUH;)Ljava/lang/String;
    //   435: astore_3
    //   436: aload_3
    //   437: areturn
  }
  
  public pFT(FUH paramFUH) {
    this.Dne = false;
    this.Dne = false;
    this.FWm = false;
    this.Dne = paramFUH;
  }
  
  public FUH Dne() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_0
    //   10: getfield Dne : Ljava/util/List;
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #5
    //   20: aload #5
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 137
    //   30: aload #5
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast JIS
    //   40: astore #6
    //   42: aload #6
    //   44: invokevirtual Dne : ()LzBn;
    //   47: invokevirtual FWm : ()LsMa;
    //   50: instanceof FiG
    //   53: ifeq -> 89
    //   56: aload_2
    //   57: ifnull -> 70
    //   60: aload #6
    //   62: invokevirtual Dne : ()I
    //   65: iload #4
    //   67: if_icmple -> 89
    //   70: aload #6
    //   72: invokevirtual Dne : ()I
    //   75: istore #4
    //   77: aload #6
    //   79: invokevirtual Dne : ()LzBn;
    //   82: invokevirtual FWm : ()LsMa;
    //   85: checkcast FiG
    //   88: astore_2
    //   89: aload #6
    //   91: invokevirtual Dne : ()LzBn;
    //   94: invokevirtual FWm : ()LsMa;
    //   97: instanceof FUH
    //   100: ifeq -> 134
    //   103: aload_1
    //   104: ifnull -> 116
    //   107: aload #6
    //   109: invokevirtual Dne : ()I
    //   112: iload_3
    //   113: if_icmple -> 134
    //   116: aload #6
    //   118: invokevirtual Dne : ()I
    //   121: istore_3
    //   122: aload #6
    //   124: invokevirtual Dne : ()LzBn;
    //   127: invokevirtual FWm : ()LsMa;
    //   130: checkcast FUH
    //   133: astore_1
    //   134: goto -> 20
    //   137: aload_2
    //   138: ifnull -> 151
    //   141: iload #4
    //   143: iload_3
    //   144: iconst_3
    //   145: idiv
    //   146: if_icmplt -> 151
    //   149: aload_2
    //   150: areturn
    //   151: aload_1
    //   152: areturn
  }
  
  private String Dne(JIS paramJIS) {
    return (paramJIS.Dne() == null) ? "generic" : paramJIS.Dne();
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LFUH;
    //   8: invokevirtual div : ()Z
    //   11: ifeq -> 96
    //   14: aload_0
    //   15: getfield Dne : LFUH;
    //   18: getfield Dne : LQnq;
    //   21: aload_0
    //   22: getfield Dne : LFUH;
    //   25: getfield div : D
    //   28: invokestatic FWm : (D)I
    //   31: aload_0
    //   32: getfield Dne : LFUH;
    //   35: getfield Dne : LbSp;
    //   38: getfield FWm : D
    //   41: invokestatic FWm : (D)I
    //   44: aload_0
    //   45: getfield Dne : LFUH;
    //   48: getfield mrb : D
    //   51: invokestatic FWm : (D)I
    //   54: invokevirtual Dne : (III)I
    //   57: istore_1
    //   58: iload_1
    //   59: getstatic zKP.ZfC : LzKP;
    //   62: getfield FWm : I
    //   65: if_icmpne -> 77
    //   68: aload_0
    //   69: ldc 'ladder'
    //   71: putfield Dne : Ljava/lang/String;
    //   74: goto -> 93
    //   77: iload_1
    //   78: getstatic zKP.ipf : LzKP;
    //   81: getfield FWm : I
    //   84: if_icmpne -> 93
    //   87: aload_0
    //   88: ldc 'vines'
    //   90: putfield Dne : Ljava/lang/String;
    //   93: goto -> 112
    //   96: aload_0
    //   97: getfield Dne : LFUH;
    //   100: invokevirtual Zpi : ()Z
    //   103: ifeq -> 112
    //   106: aload_0
    //   107: ldc 'water'
    //   109: putfield Dne : Ljava/lang/String;
    //   112: return
  }
  
  private void FWm() {
    this.Dne = null;
  }
  
  private void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 13
    //   7: sipush #300
    //   10: goto -> 15
    //   13: bipush #100
    //   15: istore_1
    //   16: aload_0
    //   17: getfield FWm : Z
    //   20: ifeq -> 58
    //   23: aload_0
    //   24: getfield Dne : LFUH;
    //   27: getfield zGp : I
    //   30: aload_0
    //   31: getfield Dne : I
    //   34: isub
    //   35: iload_1
    //   36: if_icmple -> 58
    //   39: aload_0
    //   40: getfield Dne : Ljava/util/List;
    //   43: invokeinterface clear : ()V
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield FWm : Z
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield Dne : Z
    //   58: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pFT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */