import java.util.List;

public class duB extends xZE {
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Dne()) : null;
  }
  
  protected String[] Dne() {
    return Jwh.Dne().Dne();
  }
  
  static {
  
  }
  
  public int Dne() {
    return 2;
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: ifne -> 12
    //   5: aload_1
    //   6: invokestatic Dne : (LgnI;)LPJQ;
    //   9: goto -> 19
    //   12: aload_1
    //   13: aload_2
    //   14: iconst_0
    //   15: aaload
    //   16: invokestatic Dne : (LgnI;Ljava/lang/String;)LPJQ;
    //   19: astore_3
    //   20: aload_2
    //   21: arraylength
    //   22: iconst_2
    //   23: if_icmplt -> 37
    //   26: aload_1
    //   27: aload_2
    //   28: iconst_1
    //   29: aaload
    //   30: iconst_1
    //   31: invokestatic Dne : (LgnI;Ljava/lang/String;I)I
    //   34: goto -> 38
    //   37: iconst_m1
    //   38: istore #4
    //   40: aload_2
    //   41: arraylength
    //   42: iconst_3
    //   43: if_icmplt -> 57
    //   46: aload_1
    //   47: aload_2
    //   48: iconst_2
    //   49: aaload
    //   50: iconst_0
    //   51: invokestatic Dne : (LgnI;Ljava/lang/String;I)I
    //   54: goto -> 58
    //   57: iconst_m1
    //   58: istore #5
    //   60: aload_3
    //   61: getfield Dne : LMOS;
    //   64: iload #4
    //   66: iload #5
    //   68: invokevirtual Dne : (II)I
    //   71: istore #6
    //   73: aload_3
    //   74: getfield Dne : LPdb;
    //   77: invokevirtual Dne : ()V
    //   80: iload #6
    //   82: ifne -> 106
    //   85: new WoB
    //   88: dup
    //   89: ldc 'commands.clear.failure'
    //   91: iconst_1
    //   92: anewarray java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload_3
    //   98: invokevirtual Dne : ()Ljava/lang/String;
    //   101: aastore
    //   102: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: athrow
    //   106: aload_1
    //   107: ldc 'commands.clear.success'
    //   109: iconst_2
    //   110: anewarray java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_3
    //   116: invokevirtual Dne : ()Ljava/lang/String;
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: iload #6
    //   124: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   127: aastore
    //   128: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: return
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.clear.usage", new Object[0]);
  }
  
  public String Dne() {
    return "clear";
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return (paramInt == 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\duB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */