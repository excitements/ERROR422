import java.util.concurrent.Callable;

class zGp implements Callable {
  final Qnq Dne;
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: aload_0
    //   8: getfield Dne : LQnq;
    //   11: getfield Qnq : Ljava/util/List;
    //   14: invokeinterface size : ()I
    //   19: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   22: ldc ' total; '
    //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: getfield Dne : LQnq;
    //   31: getfield Qnq : Ljava/util/List;
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual toString : ()Ljava/lang/String;
    //   43: areturn
  }
  
  zGp(Qnq paramQnq) {
    this.Dne = paramQnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zGp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */