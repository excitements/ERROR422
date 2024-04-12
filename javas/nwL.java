import java.util.Random;

class nwL extends JhS {
  private boolean Dne;
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public nwL(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield Dne : Z
    //   9: aload_2
    //   10: iload #5
    //   12: invokestatic Dne : (Ljava/util/Random;I)Ljava/util/ArrayList;
    //   15: astore #6
    //   17: new opc
    //   20: dup
    //   21: aload_1
    //   22: invokevirtual Dne : ()Ltgc;
    //   25: iconst_0
    //   26: aload_2
    //   27: iload_3
    //   28: iconst_4
    //   29: ishl
    //   30: iconst_2
    //   31: iadd
    //   32: iload #4
    //   34: iconst_4
    //   35: ishl
    //   36: iconst_2
    //   37: iadd
    //   38: aload #6
    //   40: iload #5
    //   42: invokespecial <init> : (Ltgc;ILjava/util/Random;IILjava/util/ArrayList;I)V
    //   45: astore #7
    //   47: aload_0
    //   48: getfield Dne : Ljava/util/LinkedList;
    //   51: aload #7
    //   53: invokevirtual add : (Ljava/lang/Object;)Z
    //   56: pop
    //   57: aload #7
    //   59: aload #7
    //   61: aload_0
    //   62: getfield Dne : Ljava/util/LinkedList;
    //   65: aload_2
    //   66: invokevirtual Dne : (Lbvz;Ljava/util/List;Ljava/util/Random;)V
    //   69: aload #7
    //   71: getfield bzF : Ljava/util/ArrayList;
    //   74: astore #8
    //   76: aload #7
    //   78: getfield FWm : Ljava/util/ArrayList;
    //   81: astore #9
    //   83: aload #8
    //   85: invokevirtual isEmpty : ()Z
    //   88: ifeq -> 99
    //   91: aload #9
    //   93: invokevirtual isEmpty : ()Z
    //   96: ifne -> 183
    //   99: aload #8
    //   101: invokevirtual isEmpty : ()Z
    //   104: ifeq -> 145
    //   107: aload_2
    //   108: aload #9
    //   110: invokevirtual size : ()I
    //   113: invokevirtual nextInt : (I)I
    //   116: istore #10
    //   118: aload #9
    //   120: iload #10
    //   122: invokevirtual remove : (I)Ljava/lang/Object;
    //   125: checkcast bvz
    //   128: astore #11
    //   130: aload #11
    //   132: aload #7
    //   134: aload_0
    //   135: getfield Dne : Ljava/util/LinkedList;
    //   138: aload_2
    //   139: invokevirtual Dne : (Lbvz;Ljava/util/List;Ljava/util/Random;)V
    //   142: goto -> 180
    //   145: aload_2
    //   146: aload #8
    //   148: invokevirtual size : ()I
    //   151: invokevirtual nextInt : (I)I
    //   154: istore #10
    //   156: aload #8
    //   158: iload #10
    //   160: invokevirtual remove : (I)Ljava/lang/Object;
    //   163: checkcast bvz
    //   166: astore #11
    //   168: aload #11
    //   170: aload #7
    //   172: aload_0
    //   173: getfield Dne : Ljava/util/LinkedList;
    //   176: aload_2
    //   177: invokevirtual Dne : (Lbvz;Ljava/util/List;Ljava/util/Random;)V
    //   180: goto -> 83
    //   183: aload_0
    //   184: invokevirtual Dne : ()V
    //   187: iconst_0
    //   188: istore #10
    //   190: aload_0
    //   191: getfield Dne : Ljava/util/LinkedList;
    //   194: invokevirtual iterator : ()Ljava/util/Iterator;
    //   197: astore #11
    //   199: aload #11
    //   201: invokeinterface hasNext : ()Z
    //   206: ifeq -> 235
    //   209: aload #11
    //   211: invokeinterface next : ()Ljava/lang/Object;
    //   216: checkcast bvz
    //   219: astore #12
    //   221: aload #12
    //   223: instanceof XLq
    //   226: ifne -> 232
    //   229: iinc #10, 1
    //   232: goto -> 199
    //   235: aload_0
    //   236: iload #10
    //   238: iconst_2
    //   239: if_icmple -> 246
    //   242: iconst_1
    //   243: goto -> 247
    //   246: iconst_0
    //   247: putfield Dne : Z
    //   250: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nwL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */