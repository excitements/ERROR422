import java.util.concurrent.Callable;

public class FVo implements Callable {
  final Jwh Dne;
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJwh;
    //   4: getfield Dne : [LRAN;
    //   7: iconst_0
    //   8: aaload
    //   9: invokevirtual Dne : ()LziS;
    //   12: invokevirtual Dne : ()I
    //   15: istore_1
    //   16: bipush #56
    //   18: iload_1
    //   19: imul
    //   20: istore_2
    //   21: iload_2
    //   22: sipush #1024
    //   25: idiv
    //   26: sipush #1024
    //   29: idiv
    //   30: istore_3
    //   31: aload_0
    //   32: getfield Dne : LJwh;
    //   35: getfield Dne : [LRAN;
    //   38: iconst_0
    //   39: aaload
    //   40: invokevirtual Dne : ()LziS;
    //   43: invokevirtual FWm : ()I
    //   46: istore #4
    //   48: bipush #56
    //   50: iload #4
    //   52: imul
    //   53: istore #5
    //   55: iload #5
    //   57: sipush #1024
    //   60: idiv
    //   61: sipush #1024
    //   64: idiv
    //   65: istore #6
    //   67: new java/lang/StringBuilder
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: iload_1
    //   75: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   78: ldc ' ('
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: iload_2
    //   84: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   87: ldc ' bytes; '
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: iload_3
    //   93: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   96: ldc ' MB) allocated, '
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: iload #4
    //   103: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   106: ldc ' ('
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: iload #5
    //   113: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   116: ldc ' bytes; '
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: iload #6
    //   123: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   126: ldc ' MB) used'
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual toString : ()Ljava/lang/String;
    //   134: areturn
  }
  
  public FVo(Jwh paramJwh) {
    this.Dne = paramJwh;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */