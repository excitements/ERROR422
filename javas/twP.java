import java.util.List;

public class twP extends xZE {
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, new String[] { "clear", "rain", "thunder" }) : null;
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge -> 20
    //   6: new fxw
    //   9: dup
    //   10: ldc 'commands.weather.usage'
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: athrow
    //   20: sipush #300
    //   23: new java/util/Random
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: sipush #600
    //   33: invokevirtual nextInt : (I)I
    //   36: iadd
    //   37: bipush #20
    //   39: imul
    //   40: istore_3
    //   41: aload_2
    //   42: arraylength
    //   43: iconst_2
    //   44: if_icmplt -> 61
    //   47: aload_1
    //   48: aload_2
    //   49: iconst_1
    //   50: aaload
    //   51: iconst_1
    //   52: ldc 1000000
    //   54: invokestatic Dne : (LgnI;Ljava/lang/String;II)I
    //   57: bipush #20
    //   59: imul
    //   60: istore_3
    //   61: invokestatic Dne : ()LJwh;
    //   64: getfield Dne : [LRAN;
    //   67: iconst_0
    //   68: aaload
    //   69: astore #4
    //   71: aload #4
    //   73: invokevirtual Dne : ()LxoY;
    //   76: astore #5
    //   78: aload #5
    //   80: iload_3
    //   81: invokevirtual zGp : (I)V
    //   84: aload #5
    //   86: iload_3
    //   87: invokevirtual aFZ : (I)V
    //   90: ldc 'clear'
    //   92: aload_2
    //   93: iconst_0
    //   94: aaload
    //   95: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   98: ifeq -> 126
    //   101: aload #5
    //   103: iconst_0
    //   104: invokevirtual FWm : (Z)V
    //   107: aload #5
    //   109: iconst_0
    //   110: invokevirtual Dne : (Z)V
    //   113: aload_1
    //   114: ldc 'commands.weather.clear'
    //   116: iconst_0
    //   117: anewarray java/lang/Object
    //   120: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: goto -> 195
    //   126: ldc 'rain'
    //   128: aload_2
    //   129: iconst_0
    //   130: aaload
    //   131: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   134: ifeq -> 162
    //   137: aload #5
    //   139: iconst_1
    //   140: invokevirtual FWm : (Z)V
    //   143: aload #5
    //   145: iconst_0
    //   146: invokevirtual Dne : (Z)V
    //   149: aload_1
    //   150: ldc 'commands.weather.rain'
    //   152: iconst_0
    //   153: anewarray java/lang/Object
    //   156: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: goto -> 195
    //   162: ldc 'thunder'
    //   164: aload_2
    //   165: iconst_0
    //   166: aaload
    //   167: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   170: ifeq -> 195
    //   173: aload #5
    //   175: iconst_1
    //   176: invokevirtual FWm : (Z)V
    //   179: aload #5
    //   181: iconst_1
    //   182: invokevirtual Dne : (Z)V
    //   185: aload_1
    //   186: ldc 'commands.weather.thunder'
    //   188: iconst_0
    //   189: anewarray java/lang/Object
    //   192: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   195: return
  }
  
  static {
  
  }
  
  public int Dne() {
    return 2;
  }
  
  public String Dne() {
    return "weather";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\twP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */