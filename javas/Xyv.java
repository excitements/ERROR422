import java.util.ArrayList;
import java.util.List;

public class Xyv {
  private static List Dne;
  
  private static List Qnq;
  
  private static List bzF;
  
  private static List FWm;
  
  private static int Dne = 256;
  
  public static synchronized int[] Dne(int paramInt) {
    // Byte code:
    //   0: iload_0
    //   1: sipush #256
    //   4: if_icmpgt -> 73
    //   7: getstatic Xyv.Dne : Ljava/util/List;
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 36
    //   18: sipush #256
    //   21: newarray int
    //   23: astore_1
    //   24: getstatic Xyv.FWm : Ljava/util/List;
    //   27: aload_1
    //   28: invokeinterface add : (Ljava/lang/Object;)Z
    //   33: pop
    //   34: aload_1
    //   35: areturn
    //   36: getstatic Xyv.Dne : Ljava/util/List;
    //   39: getstatic Xyv.Dne : Ljava/util/List;
    //   42: invokeinterface size : ()I
    //   47: iconst_1
    //   48: isub
    //   49: invokeinterface remove : (I)Ljava/lang/Object;
    //   54: checkcast [I
    //   57: checkcast [I
    //   60: astore_1
    //   61: getstatic Xyv.FWm : Ljava/util/List;
    //   64: aload_1
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload_1
    //   72: areturn
    //   73: iload_0
    //   74: getstatic Xyv.Dne : I
    //   77: if_icmple -> 118
    //   80: iload_0
    //   81: putstatic Xyv.Dne : I
    //   84: getstatic Xyv.bzF : Ljava/util/List;
    //   87: invokeinterface clear : ()V
    //   92: getstatic Xyv.Qnq : Ljava/util/List;
    //   95: invokeinterface clear : ()V
    //   100: getstatic Xyv.Dne : I
    //   103: newarray int
    //   105: astore_1
    //   106: getstatic Xyv.Qnq : Ljava/util/List;
    //   109: aload_1
    //   110: invokeinterface add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: aload_1
    //   117: areturn
    //   118: getstatic Xyv.bzF : Ljava/util/List;
    //   121: invokeinterface isEmpty : ()Z
    //   126: ifeq -> 147
    //   129: getstatic Xyv.Dne : I
    //   132: newarray int
    //   134: astore_1
    //   135: getstatic Xyv.Qnq : Ljava/util/List;
    //   138: aload_1
    //   139: invokeinterface add : (Ljava/lang/Object;)Z
    //   144: pop
    //   145: aload_1
    //   146: areturn
    //   147: getstatic Xyv.bzF : Ljava/util/List;
    //   150: getstatic Xyv.bzF : Ljava/util/List;
    //   153: invokeinterface size : ()I
    //   158: iconst_1
    //   159: isub
    //   160: invokeinterface remove : (I)Ljava/lang/Object;
    //   165: checkcast [I
    //   168: checkcast [I
    //   171: astore_1
    //   172: getstatic Xyv.Qnq : Ljava/util/List;
    //   175: aload_1
    //   176: invokeinterface add : (Ljava/lang/Object;)Z
    //   181: pop
    //   182: aload_1
    //   183: areturn
  }
  
  static {
    Dne = new ArrayList();
    FWm = new ArrayList();
    bzF = new ArrayList();
    Qnq = new ArrayList();
  }
  
  public static synchronized void Dne() {
    // Byte code:
    //   0: getstatic Xyv.bzF : Ljava/util/List;
    //   3: invokeinterface isEmpty : ()Z
    //   8: ifne -> 30
    //   11: getstatic Xyv.bzF : Ljava/util/List;
    //   14: getstatic Xyv.bzF : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: iconst_1
    //   23: isub
    //   24: invokeinterface remove : (I)Ljava/lang/Object;
    //   29: pop
    //   30: getstatic Xyv.Dne : Ljava/util/List;
    //   33: invokeinterface isEmpty : ()Z
    //   38: ifne -> 60
    //   41: getstatic Xyv.Dne : Ljava/util/List;
    //   44: getstatic Xyv.Dne : Ljava/util/List;
    //   47: invokeinterface size : ()I
    //   52: iconst_1
    //   53: isub
    //   54: invokeinterface remove : (I)Ljava/lang/Object;
    //   59: pop
    //   60: getstatic Xyv.bzF : Ljava/util/List;
    //   63: getstatic Xyv.Qnq : Ljava/util/List;
    //   66: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   71: pop
    //   72: getstatic Xyv.Dne : Ljava/util/List;
    //   75: getstatic Xyv.FWm : Ljava/util/List;
    //   78: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   83: pop
    //   84: getstatic Xyv.Qnq : Ljava/util/List;
    //   87: invokeinterface clear : ()V
    //   92: getstatic Xyv.FWm : Ljava/util/List;
    //   95: invokeinterface clear : ()V
    //   100: return
  }
  
  public static synchronized String Dne() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: ldc 'cache: '
    //   9: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: getstatic Xyv.bzF : Ljava/util/List;
    //   15: invokeinterface size : ()I
    //   20: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   23: ldc ', tcache: '
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: getstatic Xyv.Dne : Ljava/util/List;
    //   31: invokeinterface size : ()I
    //   36: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   39: ldc ', allocated: '
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: getstatic Xyv.Qnq : Ljava/util/List;
    //   47: invokeinterface size : ()I
    //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   55: ldc ', tallocated: '
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: getstatic Xyv.FWm : Ljava/util/List;
    //   63: invokeinterface size : ()I
    //   68: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   71: invokevirtual toString : ()Ljava/lang/String;
    //   74: areturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Xyv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */