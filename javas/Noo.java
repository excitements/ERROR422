import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Noo {
  private final String Dne;
  
  private StackTraceElement[] Dne;
  
  private final List Dne;
  
  private final McM Dne = (McM)new ArrayList();
  
  public int Dne(int paramInt) {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    this.Dne = (McM)new StackTraceElement[arrayOfStackTraceElement.length - 3 - paramInt];
    System.arraycopy(arrayOfStackTraceElement, 3 + paramInt, this.Dne, 0, this.Dne.length);
    return this.Dne.length;
  }
  
  public static void Dne(Noo paramNoo, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramNoo.Dne("Block type", new QdM(paramInt4));
    paramNoo.Dne("Block data value", new unI(paramInt5));
    paramNoo.Dne("Block location", new pcM(paramInt1, paramInt2, paramInt3));
  }
  
  public static String Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    return String.format("%.2f,%.2f,%.2f - %s", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2), Double.valueOf(paramDouble3), Dne(geR.FWm(paramDouble1), geR.FWm(paramDouble2), geR.FWm(paramDouble3)) });
  }
  
  public void Dne(String paramString, Throwable paramThrowable) {
    Dne(paramString, paramThrowable);
  }
  
  public static String Dne(int paramInt1, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      stringBuilder.append(String.format("World: (%d,%d,%d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
    } catch (Throwable throwable) {
      stringBuilder.append("(Error finding world loc)");
    } 
    stringBuilder.append(", ");
    try {
      int i = paramInt1 >> 4;
      int j = paramInt3 >> 4;
      int k = paramInt1 & 0xF;
      int m = paramInt2 >> 4;
      int n = paramInt3 & 0xF;
      int i1 = i << 4;
      int i2 = j << 4;
      int i3 = (i + 1 << 4) - 1;
      int i4 = (j + 1 << 4) - 1;
      stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4) }));
    } catch (Throwable throwable) {
      stringBuilder.append("(Error finding chunk loc)");
    } 
    stringBuilder.append(", ");
    try {
      int i = paramInt1 >> 9;
      int j = paramInt3 >> 9;
      int k = i << 5;
      int m = j << 5;
      int n = (i + 1 << 5) - 1;
      int i1 = (j + 1 << 5) - 1;
      int i2 = i << 9;
      int i3 = j << 9;
      int i4 = (i + 1 << 9) - 1;
      int i5 = (j + 1 << 9) - 1;
      stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5) }));
    } catch (Throwable throwable) {
      stringBuilder.append("(Error finding world loc)");
    } 
    return stringBuilder.toString();
  }
  
  public boolean Dne(StackTraceElement paramStackTraceElement1, StackTraceElement paramStackTraceElement2) {
    if (this.Dne.length != 0 && paramStackTraceElement1 != null) {
      McM mcM = this.Dne[0];
      if (mcM.isNativeMethod() == paramStackTraceElement1.isNativeMethod() && mcM.getClassName().equals(paramStackTraceElement1.getClassName()) && mcM.getFileName().equals(paramStackTraceElement1.getFileName()) && mcM.getMethodName().equals(paramStackTraceElement1.getMethodName())) {
        if (((paramStackTraceElement2 != null) ? true : false) != ((this.Dne.length > 1) ? true : false))
          return false; 
        if (paramStackTraceElement2 != null && !this.Dne[1].equals(paramStackTraceElement2))
          return false; 
        this.Dne[0] = (McM)paramStackTraceElement1;
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  public Noo(McM paramMcM, String paramString) {
    this.Dne = (McM)new StackTraceElement[0];
    this.Dne = paramMcM;
    this.Dne = (McM)paramString;
  }
  
  public void Dne(String paramString, Object paramObject) {
    this.Dne.add(new VPj(paramString, paramObject));
  }
  
  public void Dne(int paramInt) {
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[this.Dne.length - paramInt];
    System.arraycopy(this.Dne, 0, arrayOfStackTraceElement, 0, arrayOfStackTraceElement.length);
    this.Dne = (McM)arrayOfStackTraceElement;
  }
  
  public void Dne(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_1
    //   1: ldc '-- '
    //   3: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6: aload_0
    //   7: getfield Dne : Ljava/lang/String;
    //   10: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: ldc ' --\\n'
    //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: pop
    //   19: aload_1
    //   20: ldc 'Details:'
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload_0
    //   27: getfield Dne : Ljava/util/List;
    //   30: invokeinterface iterator : ()Ljava/util/Iterator;
    //   35: astore_2
    //   36: aload_2
    //   37: invokeinterface hasNext : ()Z
    //   42: ifeq -> 90
    //   45: aload_2
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast VPj
    //   54: astore_3
    //   55: aload_1
    //   56: ldc '\\n\\t'
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_1
    //   63: aload_3
    //   64: invokevirtual Dne : ()Ljava/lang/String;
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload_1
    //   72: ldc ': '
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_1
    //   79: aload_3
    //   80: invokevirtual FWm : ()Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: goto -> 36
    //   90: aload_0
    //   91: getfield Dne : [Ljava/lang/StackTraceElement;
    //   94: ifnull -> 160
    //   97: aload_0
    //   98: getfield Dne : [Ljava/lang/StackTraceElement;
    //   101: arraylength
    //   102: ifle -> 160
    //   105: aload_1
    //   106: ldc '\\nStacktrace:'
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_0
    //   113: getfield Dne : [Ljava/lang/StackTraceElement;
    //   116: astore_3
    //   117: aload_3
    //   118: arraylength
    //   119: istore #4
    //   121: iconst_0
    //   122: istore #5
    //   124: iload #5
    //   126: iload #4
    //   128: if_icmpge -> 160
    //   131: aload_3
    //   132: iload #5
    //   134: aaload
    //   135: astore #6
    //   137: aload_1
    //   138: ldc '\\n\\tat '
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_1
    //   145: aload #6
    //   147: invokevirtual toString : ()Ljava/lang/String;
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: iinc #5, 1
    //   157: goto -> 124
    //   160: return
  }
  
  public void Dne(String paramString, Callable paramCallable) {
    try {
      Dne(paramString, paramCallable.call());
    } catch (Throwable throwable) {
      Dne(paramString, throwable);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Noo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */