import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.List;

public abstract class JTM implements Runnable {
  protected List Dne;
  
  protected Thread Dne;
  
  protected xnW Dne;
  
  protected List FWm;
  
  protected boolean Dne;
  
  protected int Dne;
  
  protected int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LxnW;
    //   4: invokeinterface bzF : ()I
    //   9: ireturn
  }
  
  protected void Dne(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LxnW;
    //   4: aload_1
    //   5: invokeinterface Qnq : (Ljava/lang/String;)V
    //   10: return
  }
  
  protected void FWm(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LxnW;
    //   4: aload_1
    //   5: invokeinterface a_ : (Ljava/lang/String;)V
    //   10: return
  }
  
  protected void Dne(DatagramSocket paramDatagramSocket) {
    // Byte code:
    //   0: aload_0
    //   1: new java/lang/StringBuilder
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: ldc 'registerSocket: '
    //   10: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: aload_1
    //   14: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   17: invokevirtual toString : ()Ljava/lang/String;
    //   20: invokevirtual Dne : (Ljava/lang/String;)V
    //   23: aload_0
    //   24: getfield Dne : Ljava/util/List;
    //   27: aload_1
    //   28: invokeinterface add : (Ljava/lang/Object;)Z
    //   33: pop
    //   34: return
  }
  
  protected void Qnq(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LxnW;
    //   4: aload_1
    //   5: invokeinterface bzF : (Ljava/lang/String;)V
    //   10: return
  }
  
  protected boolean Dne(ServerSocket paramServerSocket, boolean paramBoolean) {
    Dne("closeSocket: " + paramServerSocket);
    if (null == paramServerSocket)
      return false; 
    boolean bool = false;
    try {
      if (!paramServerSocket.isClosed()) {
        paramServerSocket.close();
        bool = true;
      } 
    } catch (IOException iOException) {
      bzF("IO: " + iOException.getMessage());
    } 
    if (paramBoolean)
      this.FWm.remove(paramServerSocket); 
    return bool;
  }
  
  public synchronized void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: new java/lang/Thread
    //   4: dup
    //   5: aload_0
    //   6: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   9: putfield Dne : Ljava/lang/Thread;
    //   12: aload_0
    //   13: getfield Dne : Ljava/lang/Thread;
    //   16: invokevirtual start : ()V
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield Dne : Z
    //   24: return
  }
  
  protected boolean Dne(DatagramSocket paramDatagramSocket, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: new java/lang/StringBuilder
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: ldc 'closeSocket: '
    //   10: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: aload_1
    //   14: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   17: invokevirtual toString : ()Ljava/lang/String;
    //   20: invokevirtual Dne : (Ljava/lang/String;)V
    //   23: aconst_null
    //   24: aload_1
    //   25: if_acmpne -> 30
    //   28: iconst_0
    //   29: ireturn
    //   30: iconst_0
    //   31: istore_3
    //   32: aload_1
    //   33: invokevirtual isClosed : ()Z
    //   36: ifne -> 45
    //   39: aload_1
    //   40: invokevirtual close : ()V
    //   43: iconst_1
    //   44: istore_3
    //   45: iload_2
    //   46: ifeq -> 60
    //   49: aload_0
    //   50: getfield Dne : Ljava/util/List;
    //   53: aload_1
    //   54: invokeinterface remove : (Ljava/lang/Object;)Z
    //   59: pop
    //   60: iload_3
    //   61: ireturn
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  JTM(xnW paramxnW) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield Dne : Z
    //   9: aload_0
    //   10: iconst_5
    //   11: putfield Dne : I
    //   14: aload_0
    //   15: new java/util/ArrayList
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: putfield Dne : Ljava/util/List;
    //   25: aload_0
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: putfield FWm : Ljava/util/List;
    //   36: aload_0
    //   37: aload_1
    //   38: putfield Dne : LxnW;
    //   41: aload_0
    //   42: getfield Dne : LxnW;
    //   45: invokeinterface zGp : ()Z
    //   50: ifeq -> 59
    //   53: aload_0
    //   54: ldc 'Debugging is enabled, performance maybe reduced!'
    //   56: invokevirtual bzF : (Ljava/lang/String;)V
    //   59: return
  }
  
  protected void Dne(boolean paramBoolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: getfield Dne : Ljava/util/List;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_3
    //   12: aload_3
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 48
    //   21: aload_3
    //   22: invokeinterface next : ()Ljava/lang/Object;
    //   27: checkcast java/net/DatagramSocket
    //   30: astore #4
    //   32: aload_0
    //   33: aload #4
    //   35: iconst_0
    //   36: invokevirtual Dne : (Ljava/net/DatagramSocket;Z)Z
    //   39: ifeq -> 45
    //   42: iinc #2, 1
    //   45: goto -> 12
    //   48: aload_0
    //   49: getfield Dne : Ljava/util/List;
    //   52: invokeinterface clear : ()V
    //   57: aload_0
    //   58: getfield FWm : Ljava/util/List;
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: astore_3
    //   67: aload_3
    //   68: invokeinterface hasNext : ()Z
    //   73: ifeq -> 103
    //   76: aload_3
    //   77: invokeinterface next : ()Ljava/lang/Object;
    //   82: checkcast java/net/ServerSocket
    //   85: astore #4
    //   87: aload_0
    //   88: aload #4
    //   90: iconst_0
    //   91: invokevirtual Dne : (Ljava/net/ServerSocket;Z)Z
    //   94: ifeq -> 100
    //   97: iinc #2, 1
    //   100: goto -> 67
    //   103: aload_0
    //   104: getfield FWm : Ljava/util/List;
    //   107: invokeinterface clear : ()V
    //   112: iload_1
    //   113: ifeq -> 149
    //   116: iconst_0
    //   117: iload_2
    //   118: if_icmpge -> 149
    //   121: aload_0
    //   122: new java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: ldc 'Force closed '
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: iload_2
    //   135: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   138: ldc ' sockets'
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual toString : ()Ljava/lang/String;
    //   146: invokevirtual bzF : (Ljava/lang/String;)V
    //   149: return
  }
  
  protected void FWm() {
    Dne(false);
  }
  
  protected boolean Dne(ServerSocket paramServerSocket) {
    return Dne(paramServerSocket, true);
  }
  
  protected void bzF(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LxnW;
    //   4: aload_1
    //   5: invokeinterface FWm : (Ljava/lang/String;)V
    //   10: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JTM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */