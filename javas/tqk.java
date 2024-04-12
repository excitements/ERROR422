import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tqk extends xZE {
  public static final Pattern Dne = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, Jwh.Dne().Dne()) : null;
  }
  
  public String Dne() {
    return "ban-ip";
  }
  
  protected void Dne(gnI paramgnI, String paramString1, String paramString2) {
    // Byte code:
    //   0: new eHI
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/String;)V
    //   8: astore #4
    //   10: aload #4
    //   12: aload_1
    //   13: invokeinterface a_ : ()Ljava/lang/String;
    //   18: invokevirtual Dne : (Ljava/lang/String;)V
    //   21: aload_3
    //   22: ifnull -> 31
    //   25: aload #4
    //   27: aload_3
    //   28: invokevirtual FWm : (Ljava/lang/String;)V
    //   31: invokestatic Dne : ()LJwh;
    //   34: invokevirtual Dne : ()LdzN;
    //   37: invokevirtual FWm : ()LbkM;
    //   40: aload #4
    //   42: invokevirtual Dne : (LeHI;)V
    //   45: invokestatic Dne : ()LJwh;
    //   48: invokevirtual Dne : ()LdzN;
    //   51: aload_2
    //   52: invokevirtual Dne : (Ljava/lang/String;)Ljava/util/List;
    //   55: astore #5
    //   57: aload #5
    //   59: invokeinterface size : ()I
    //   64: anewarray java/lang/String
    //   67: astore #6
    //   69: iconst_0
    //   70: istore #7
    //   72: aload #5
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #9
    //   81: aload #9
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 129
    //   91: aload #9
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast PJQ
    //   101: astore #8
    //   103: aload #8
    //   105: getfield Dne : LTnv;
    //   108: ldc 'You have been IP banned.'
    //   110: invokevirtual Dne : (Ljava/lang/String;)V
    //   113: aload #6
    //   115: iload #7
    //   117: iinc #7, 1
    //   120: aload #8
    //   122: invokevirtual Dne : ()Ljava/lang/String;
    //   125: aastore
    //   126: goto -> 81
    //   129: aload #5
    //   131: invokeinterface isEmpty : ()Z
    //   136: ifeq -> 156
    //   139: aload_1
    //   140: ldc 'commands.banip.success'
    //   142: iconst_1
    //   143: anewarray java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_2
    //   149: aastore
    //   150: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: goto -> 178
    //   156: aload_1
    //   157: ldc 'commands.banip.success.players'
    //   159: iconst_2
    //   160: anewarray java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_2
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: aload #6
    //   171: invokestatic Dne : ([Ljava/lang/Object;)Ljava/lang/String;
    //   174: aastore
    //   175: invokestatic Dne : (LgnI;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: return
  }
  
  public boolean Dne(gnI paramgnI) {
    return (Jwh.Dne().Dne().FWm().Dne() && super.Dne(paramgnI));
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length >= 1 && paramArrayOfString[0].length() > 1) {
      Matcher matcher = Dne.matcher(paramArrayOfString[0]);
      String str = null;
      if (paramArrayOfString.length >= 2)
        str = Dne(paramgnI, paramArrayOfString, 1); 
      if (matcher.matches()) {
        Dne(paramgnI, paramArrayOfString[0], str);
      } else {
        PJQ pJQ = Jwh.Dne().Dne().FWm(paramArrayOfString[0]);
        if (pJQ == null)
          throw new FKZ("commands.banip.invalid", new Object[0]); 
        Dne(paramgnI, pJQ.FWm(), str);
      } 
    } else {
      throw new fxw("commands.banip.usage", new Object[0]);
    } 
  }
  
  public int Dne() {
    return 3;
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.banip.usage", new Object[0]);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tqk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */