import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dGv {
  private final String Dne;
  
  private final Set Dne;
  
  private final int aFZ;
  
  private final List Dne;
  
  private int FWm;
  
  private dmo Dne;
  
  private int Dne;
  
  private final int Qnq;
  
  private final boolean Dne = new HashSet(256);
  
  private final int bzF;
  
  public void Dne(WbP paramWbP) {
    // Byte code:
    //   0: aload_0
    //   1: getfield aFZ : I
    //   4: ifle -> 15
    //   7: aload_1
    //   8: aload_0
    //   9: getfield aFZ : I
    //   12: invokevirtual Dne : (I)V
    //   15: aload_0
    //   16: getfield Dne : Ljava/util/Set;
    //   19: aload_1
    //   20: invokeinterface add : (Ljava/lang/Object;)Z
    //   25: pop
    //   26: return
  }
  
  public List Dne() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/List;
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore_2
    //   18: aload_2
    //   19: invokeinterface hasNext : ()Z
    //   24: ifeq -> 45
    //   27: aload_2
    //   28: invokeinterface next : ()Ljava/lang/Object;
    //   33: checkcast wjH
    //   36: astore_3
    //   37: aload_3
    //   38: aload_1
    //   39: invokevirtual Dne : (Ljava/util/List;)V
    //   42: goto -> 18
    //   45: aload_1
    //   46: areturn
  }
  
  private int Dne(int paramInt) {
    int i = paramInt - 1;
    i |= i >> 1;
    i |= i >> 2;
    i |= i >> 4;
    i |= i >> 8;
    i |= i >> 16;
    return i + 1;
  }
  
  public dGv(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    this(paramString, paramInt1, paramInt2, paramBoolean, 0);
  }
  
  public dmo Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 31
    //   7: aload_0
    //   8: aload_0
    //   9: aload_0
    //   10: getfield Dne : I
    //   13: invokespecial Dne : (I)I
    //   16: putfield Dne : I
    //   19: aload_0
    //   20: aload_0
    //   21: aload_0
    //   22: getfield FWm : I
    //   25: invokespecial Dne : (I)I
    //   28: putfield FWm : I
    //   31: aload_0
    //   32: invokestatic Dne : ()LzpX;
    //   35: aload_0
    //   36: getfield Dne : Ljava/lang/String;
    //   39: iconst_1
    //   40: aload_0
    //   41: getfield Dne : I
    //   44: aload_0
    //   45: getfield FWm : I
    //   48: sipush #6408
    //   51: invokevirtual Dne : (Ljava/lang/String;IIII)Ldmo;
    //   54: putfield Dne : Ldmo;
    //   57: aload_0
    //   58: getfield Dne : Ldmo;
    //   61: aload_0
    //   62: getfield Dne : Ldmo;
    //   65: invokevirtual Dne : ()LfBi;
    //   68: ldc -65536
    //   70: invokevirtual Dne : (LfBi;I)V
    //   73: aload_0
    //   74: invokevirtual Dne : ()Ljava/util/List;
    //   77: astore_1
    //   78: iconst_0
    //   79: istore_2
    //   80: iload_2
    //   81: aload_1
    //   82: invokeinterface size : ()I
    //   87: if_icmpge -> 138
    //   90: aload_1
    //   91: iload_2
    //   92: invokeinterface get : (I)Ljava/lang/Object;
    //   97: checkcast wjH
    //   100: astore_3
    //   101: aload_3
    //   102: invokevirtual Dne : ()LWbP;
    //   105: astore #4
    //   107: aload_0
    //   108: getfield Dne : Ldmo;
    //   111: aload_3
    //   112: invokevirtual Dne : ()I
    //   115: aload_3
    //   116: invokevirtual FWm : ()I
    //   119: aload #4
    //   121: invokevirtual Dne : ()Ldmo;
    //   124: aload #4
    //   126: invokevirtual Dne : ()Z
    //   129: invokevirtual Dne : (IILdmo;Z)V
    //   132: iinc #2, 1
    //   135: goto -> 80
    //   138: invokestatic Dne : ()LzpX;
    //   141: aload_0
    //   142: getfield Dne : Ljava/lang/String;
    //   145: aload_0
    //   146: getfield Dne : Ldmo;
    //   149: invokevirtual Dne : (Ljava/lang/String;Ldmo;)V
    //   152: aload_0
    //   153: getfield Dne : Ldmo;
    //   156: areturn
  }
  
  public dGv(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    this.Dne = new ArrayList(256);
    this.Dne = false;
    this.FWm = 0;
    this.Dne = paramString;
    this.bzF = paramInt1;
    this.Qnq = paramInt2;
    this.Dne = paramBoolean;
    this.aFZ = paramInt3;
  }
  
  private boolean FWm(WbP paramWbP) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual FWm : ()I
    //   4: aload_1
    //   5: invokevirtual Dne : ()I
    //   8: invokestatic min : (II)I
    //   11: istore_2
    //   12: aload_0
    //   13: getfield Dne : I
    //   16: ifne -> 30
    //   19: aload_0
    //   20: getfield FWm : I
    //   23: ifne -> 30
    //   26: iconst_1
    //   27: goto -> 31
    //   30: iconst_0
    //   31: istore_3
    //   32: aload_0
    //   33: getfield Dne : Z
    //   36: ifeq -> 247
    //   39: aload_0
    //   40: aload_0
    //   41: getfield Dne : I
    //   44: invokespecial Dne : (I)I
    //   47: istore #5
    //   49: aload_0
    //   50: aload_0
    //   51: getfield FWm : I
    //   54: invokespecial Dne : (I)I
    //   57: istore #6
    //   59: aload_0
    //   60: aload_0
    //   61: getfield Dne : I
    //   64: iload_2
    //   65: iadd
    //   66: invokespecial Dne : (I)I
    //   69: istore #7
    //   71: aload_0
    //   72: aload_0
    //   73: getfield FWm : I
    //   76: iload_2
    //   77: iadd
    //   78: invokespecial Dne : (I)I
    //   81: istore #8
    //   83: iload #7
    //   85: aload_0
    //   86: getfield bzF : I
    //   89: if_icmpgt -> 96
    //   92: iconst_1
    //   93: goto -> 97
    //   96: iconst_0
    //   97: istore #9
    //   99: iload #8
    //   101: aload_0
    //   102: getfield Qnq : I
    //   105: if_icmpgt -> 112
    //   108: iconst_1
    //   109: goto -> 113
    //   112: iconst_0
    //   113: istore #10
    //   115: iload #9
    //   117: ifne -> 127
    //   120: iload #10
    //   122: ifne -> 127
    //   125: iconst_0
    //   126: ireturn
    //   127: aload_1
    //   128: invokevirtual FWm : ()I
    //   131: aload_1
    //   132: invokevirtual Dne : ()I
    //   135: invokestatic max : (II)I
    //   138: istore #11
    //   140: iload_3
    //   141: ifeq -> 169
    //   144: iload #9
    //   146: ifne -> 169
    //   149: aload_0
    //   150: aload_0
    //   151: getfield FWm : I
    //   154: iload #11
    //   156: iadd
    //   157: invokespecial Dne : (I)I
    //   160: aload_0
    //   161: getfield Qnq : I
    //   164: if_icmple -> 169
    //   167: iconst_0
    //   168: ireturn
    //   169: iload #5
    //   171: iload #7
    //   173: if_icmpeq -> 180
    //   176: iconst_1
    //   177: goto -> 181
    //   180: iconst_0
    //   181: istore #12
    //   183: iload #6
    //   185: iload #8
    //   187: if_icmpeq -> 194
    //   190: iconst_1
    //   191: goto -> 195
    //   194: iconst_0
    //   195: istore #13
    //   197: iload #12
    //   199: iload #13
    //   201: ixor
    //   202: ifeq -> 225
    //   205: iload #12
    //   207: ifeq -> 219
    //   210: iload #9
    //   212: ifeq -> 219
    //   215: iconst_1
    //   216: goto -> 220
    //   219: iconst_0
    //   220: istore #4
    //   222: goto -> 244
    //   225: iload #9
    //   227: ifeq -> 241
    //   230: iload #5
    //   232: iload #6
    //   234: if_icmpgt -> 241
    //   237: iconst_1
    //   238: goto -> 242
    //   241: iconst_0
    //   242: istore #4
    //   244: goto -> 326
    //   247: aload_0
    //   248: getfield Dne : I
    //   251: iload_2
    //   252: iadd
    //   253: aload_0
    //   254: getfield bzF : I
    //   257: if_icmpgt -> 264
    //   260: iconst_1
    //   261: goto -> 265
    //   264: iconst_0
    //   265: istore #5
    //   267: aload_0
    //   268: getfield FWm : I
    //   271: iload_2
    //   272: iadd
    //   273: aload_0
    //   274: getfield Qnq : I
    //   277: if_icmpgt -> 284
    //   280: iconst_1
    //   281: goto -> 285
    //   284: iconst_0
    //   285: istore #6
    //   287: iload #5
    //   289: ifne -> 299
    //   292: iload #6
    //   294: ifne -> 299
    //   297: iconst_0
    //   298: ireturn
    //   299: iload_3
    //   300: ifne -> 314
    //   303: aload_0
    //   304: getfield Dne : I
    //   307: aload_0
    //   308: getfield FWm : I
    //   311: if_icmpgt -> 323
    //   314: iload #5
    //   316: ifeq -> 323
    //   319: iconst_1
    //   320: goto -> 324
    //   323: iconst_0
    //   324: istore #4
    //   326: iload #4
    //   328: ifeq -> 399
    //   331: aload_1
    //   332: invokevirtual Dne : ()I
    //   335: aload_1
    //   336: invokevirtual FWm : ()I
    //   339: if_icmple -> 346
    //   342: aload_1
    //   343: invokevirtual Dne : ()V
    //   346: aload_0
    //   347: getfield FWm : I
    //   350: ifne -> 361
    //   353: aload_0
    //   354: aload_1
    //   355: invokevirtual FWm : ()I
    //   358: putfield FWm : I
    //   361: new wjH
    //   364: dup
    //   365: aload_0
    //   366: getfield Dne : I
    //   369: iconst_0
    //   370: aload_1
    //   371: invokevirtual Dne : ()I
    //   374: aload_0
    //   375: getfield FWm : I
    //   378: invokespecial <init> : (IIII)V
    //   381: astore #5
    //   383: aload_0
    //   384: dup
    //   385: getfield Dne : I
    //   388: aload_1
    //   389: invokevirtual Dne : ()I
    //   392: iadd
    //   393: putfield Dne : I
    //   396: goto -> 434
    //   399: new wjH
    //   402: dup
    //   403: iconst_0
    //   404: aload_0
    //   405: getfield FWm : I
    //   408: aload_0
    //   409: getfield Dne : I
    //   412: aload_1
    //   413: invokevirtual FWm : ()I
    //   416: invokespecial <init> : (IIII)V
    //   419: astore #5
    //   421: aload_0
    //   422: dup
    //   423: getfield FWm : I
    //   426: aload_1
    //   427: invokevirtual FWm : ()I
    //   430: iadd
    //   431: putfield FWm : I
    //   434: aload #5
    //   436: aload_1
    //   437: invokevirtual Dne : (LWbP;)Z
    //   440: pop
    //   441: aload_0
    //   442: getfield Dne : Ljava/util/List;
    //   445: aload #5
    //   447: invokeinterface add : (Ljava/lang/Object;)Z
    //   452: pop
    //   453: iconst_1
    //   454: ireturn
  }
  
  private boolean Dne(WbP paramWbP) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield Dne : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 73
    //   15: aload_0
    //   16: getfield Dne : Ljava/util/List;
    //   19: iload_2
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast wjH
    //   28: aload_1
    //   29: invokevirtual Dne : (LWbP;)Z
    //   32: ifeq -> 37
    //   35: iconst_1
    //   36: ireturn
    //   37: aload_1
    //   38: invokevirtual Dne : ()V
    //   41: aload_0
    //   42: getfield Dne : Ljava/util/List;
    //   45: iload_2
    //   46: invokeinterface get : (I)Ljava/lang/Object;
    //   51: checkcast wjH
    //   54: aload_1
    //   55: invokevirtual Dne : (LWbP;)Z
    //   58: ifeq -> 63
    //   61: iconst_1
    //   62: ireturn
    //   63: aload_1
    //   64: invokevirtual Dne : ()V
    //   67: iinc #2, 1
    //   70: goto -> 2
    //   73: aload_0
    //   74: aload_1
    //   75: invokespecial FWm : (LWbP;)Z
    //   78: ireturn
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Set;
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/Set;
    //   8: invokeinterface size : ()I
    //   13: anewarray WbP
    //   16: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   21: checkcast [LWbP;
    //   24: checkcast [LWbP;
    //   27: astore_1
    //   28: aload_1
    //   29: invokestatic sort : ([Ljava/lang/Object;)V
    //   32: aload_0
    //   33: aconst_null
    //   34: putfield Dne : Ldmo;
    //   37: iconst_0
    //   38: istore_2
    //   39: iload_2
    //   40: aload_1
    //   41: arraylength
    //   42: if_icmpge -> 72
    //   45: aload_1
    //   46: iload_2
    //   47: aaload
    //   48: astore_3
    //   49: aload_0
    //   50: aload_3
    //   51: invokespecial Dne : (LWbP;)Z
    //   54: ifne -> 66
    //   57: new kmB
    //   60: dup
    //   61: aload_3
    //   62: invokespecial <init> : (LWbP;)V
    //   65: athrow
    //   66: iinc #2, 1
    //   69: goto -> 39
    //   72: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dGv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */