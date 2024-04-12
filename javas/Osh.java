import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Osh implements Runnable {
  private volatile long Dne;
  
  public static final Osh Dne = new Osh();
  
  private volatile long FWm;
  
  private List Dne;
  
  private volatile boolean Dne = Collections.synchronizedList(new ArrayList());
  
  public void run() {
    while (true)
      FWm(); 
  }
  
  private void FWm() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield Dne : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 97
    //   15: aload_0
    //   16: getfield Dne : Ljava/util/List;
    //   19: iload_1
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast ROX
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface Dne : ()Z
    //   35: istore_3
    //   36: iload_3
    //   37: ifne -> 64
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/List;
    //   44: iload_1
    //   45: iinc #1, -1
    //   48: invokeinterface remove : (I)Ljava/lang/Object;
    //   53: pop
    //   54: aload_0
    //   55: dup
    //   56: getfield FWm : J
    //   59: lconst_1
    //   60: ladd
    //   61: putfield FWm : J
    //   64: aload_0
    //   65: getfield Dne : Z
    //   68: ifeq -> 75
    //   71: lconst_0
    //   72: goto -> 78
    //   75: ldc2_w 10
    //   78: invokestatic sleep : (J)V
    //   81: goto -> 91
    //   84: astore #4
    //   86: aload #4
    //   88: invokevirtual printStackTrace : ()V
    //   91: iinc #1, 1
    //   94: goto -> 2
    //   97: aload_0
    //   98: getfield Dne : Ljava/util/List;
    //   101: invokeinterface isEmpty : ()Z
    //   106: ifeq -> 123
    //   109: ldc2_w 25
    //   112: invokestatic sleep : (J)V
    //   115: goto -> 123
    //   118: astore_1
    //   119: aload_1
    //   120: invokevirtual printStackTrace : ()V
    //   123: return
    // Exception table:
    //   from	to	target	type
    //   64	81	84	java/lang/InterruptedException
    //   109	115	118	java/lang/InterruptedException
  }
  
  public void Dne() {
    this.Dne = true;
    while (this.Dne != this.FWm)
      Thread.sleep(10L); 
    this.Dne = false;
  }
  
  private Osh() {
    this.Dne = 0L;
    this.FWm = 0L;
    this.Dne = false;
    Thread thread = new Thread(this, "File IO Thread");
    thread.setPriority(1);
    thread.start();
  }
  
  public void Dne(ROX paramROX) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifne -> 34
    //   13: aload_0
    //   14: dup
    //   15: getfield Dne : J
    //   18: lconst_1
    //   19: ladd
    //   20: putfield Dne : J
    //   23: aload_0
    //   24: getfield Dne : Ljava/util/List;
    //   27: aload_1
    //   28: invokeinterface add : (Ljava/lang/Object;)Z
    //   33: pop
    //   34: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Osh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */