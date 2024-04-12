import java.util.Comparator;

class qZK implements Comparator {
  private final String Dne;
  
  final LwS Dne;
  
  qZK(LwS paramLwS, String paramString, Rpz paramRpz) {
    this(paramLwS, paramString);
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((muh)paramObject1, (muh)paramObject2);
  }
  
  private qZK(LwS paramLwS, String paramString) {
    this.Dne = paramLwS;
    this.Dne = (LwS)paramString;
  }
  
  public int Dne(muh parammuh1, muh parammuh2) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Qnq : Ljava/lang/String;
    //   4: aload_2
    //   5: getfield Qnq : Ljava/lang/String;
    //   8: invokevirtual equals : (Ljava/lang/Object;)Z
    //   11: ifeq -> 48
    //   14: aload_1
    //   15: getfield Dne : J
    //   18: aload_2
    //   19: getfield Dne : J
    //   22: lcmp
    //   23: ifge -> 30
    //   26: iconst_1
    //   27: goto -> 47
    //   30: aload_1
    //   31: getfield Dne : J
    //   34: aload_2
    //   35: getfield Dne : J
    //   38: lcmp
    //   39: ifle -> 46
    //   42: iconst_m1
    //   43: goto -> 47
    //   46: iconst_0
    //   47: ireturn
    //   48: aload_1
    //   49: getfield Qnq : Ljava/lang/String;
    //   52: aload_0
    //   53: getfield Dne : Ljava/lang/String;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 64
    //   62: iconst_m1
    //   63: ireturn
    //   64: aload_2
    //   65: getfield Qnq : Ljava/lang/String;
    //   68: aload_0
    //   69: getfield Dne : Ljava/lang/String;
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: ifeq -> 80
    //   78: iconst_1
    //   79: ireturn
    //   80: aload_1
    //   81: getfield bzF : Ljava/lang/String;
    //   84: ldc 'CLOSED'
    //   86: invokevirtual equals : (Ljava/lang/Object;)Z
    //   89: ifne -> 104
    //   92: aload_2
    //   93: getfield bzF : Ljava/lang/String;
    //   96: ldc 'CLOSED'
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifeq -> 132
    //   104: aload_1
    //   105: getfield bzF : Ljava/lang/String;
    //   108: ldc 'CLOSED'
    //   110: invokevirtual equals : (Ljava/lang/Object;)Z
    //   113: ifeq -> 118
    //   116: iconst_1
    //   117: ireturn
    //   118: aload_2
    //   119: getfield bzF : Ljava/lang/String;
    //   122: ldc 'CLOSED'
    //   124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   127: ifeq -> 132
    //   130: iconst_0
    //   131: ireturn
    //   132: aload_1
    //   133: getfield Dne : J
    //   136: aload_2
    //   137: getfield Dne : J
    //   140: lcmp
    //   141: ifge -> 148
    //   144: iconst_1
    //   145: goto -> 165
    //   148: aload_1
    //   149: getfield Dne : J
    //   152: aload_2
    //   153: getfield Dne : J
    //   156: lcmp
    //   157: ifle -> 164
    //   160: iconst_m1
    //   161: goto -> 165
    //   164: iconst_0
    //   165: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qZK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */