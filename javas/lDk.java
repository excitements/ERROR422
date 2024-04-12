import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lDk {
  private final List Dne;
  
  private final Map Dne;
  
  private int Dne = new ArrayList();
  
  private static List Dne(String paramString) {
    if (paramString != null && paramString.length() >= 1) {
      ArrayList<Jjb> arrayList = new ArrayList();
      String[] arrayOfString1 = paramString.split(",");
      int i = 0;
      String[] arrayOfString2 = arrayOfString1;
      int j = arrayOfString1.length;
      for (byte b = 0; b < j; b++) {
        String str = arrayOfString2[b];
        Jjb jjb = Dne(str, i);
        if (jjb == null)
          return null; 
        arrayList.add(jjb);
        i += jjb.Dne();
      } 
      return arrayList;
    } 
    return null;
  }
  
  public List Dne() {
    return this.Dne;
  }
  
  public static lDk Dne(String paramString) {
    if (paramString == null)
      return Dne(); 
    String[] arrayOfString = paramString.split(";", -1);
    byte b = (arrayOfString.length == 1) ? 0 : geR.Dne(arrayOfString[0], 0);
    if (b && b <= 2) {
      lDk lDk1 = new lDk();
      byte b1 = (arrayOfString.length == 1) ? 0 : 1;
      List list = Dne(arrayOfString[b1++]);
      if (list != null && !list.isEmpty()) {
        int i;
        lDk1.Dne().addAll(list);
        lDk1.Dne();
        OdI odI = OdI.FWm.Qnq;
        if (b > 0 && arrayOfString.length > b1)
          i = geR.Dne(arrayOfString[b1++], odI); 
        lDk1.Dne(i);
        if (b > 0 && arrayOfString.length > b1) {
          String[] arrayOfString1 = arrayOfString[b1++].toLowerCase().split(",");
          String[] arrayOfString2 = arrayOfString1;
          int j = arrayOfString1.length;
          for (byte b2 = 0; b2 < j; b2++) {
            String str = arrayOfString2[b2];
            String[] arrayOfString3 = str.split("\\(", 2);
            HashMap<Object, Object> hashMap = new HashMap<>();
            if (arrayOfString3[0].length() > 0) {
              lDk1.Dne().put(arrayOfString3[0], hashMap);
              if (arrayOfString3.length > 1 && arrayOfString3[1].endsWith(")") && arrayOfString3[1].length() > 1) {
                String[] arrayOfString4 = arrayOfString3[1].substring(0, arrayOfString3[1].length() - 1).split(" ");
                for (byte b3 = 0; b3 < arrayOfString4.length; b3++) {
                  String[] arrayOfString5 = arrayOfString4[b3].split("=", 2);
                  if (arrayOfString5.length == 2)
                    hashMap.put(arrayOfString5[0], arrayOfString5[1]); 
                } 
              } 
            } 
          } 
        } else {
          lDk1.Dne().put("village", new HashMap<>());
        } 
        return lDk1;
      } 
      return Dne();
    } 
    return Dne();
  }
  
  public String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_1
    //   9: iconst_2
    //   10: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   13: pop
    //   14: aload_1
    //   15: ldc ';'
    //   17: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: pop
    //   21: iconst_0
    //   22: istore_2
    //   23: iload_2
    //   24: aload_0
    //   25: getfield Dne : Ljava/util/List;
    //   28: invokeinterface size : ()I
    //   33: if_icmpge -> 74
    //   36: iload_2
    //   37: ifle -> 47
    //   40: aload_1
    //   41: ldc ','
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_1
    //   48: aload_0
    //   49: getfield Dne : Ljava/util/List;
    //   52: iload_2
    //   53: invokeinterface get : (I)Ljava/lang/Object;
    //   58: checkcast Jjb
    //   61: invokevirtual toString : ()Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: iinc #2, 1
    //   71: goto -> 23
    //   74: aload_1
    //   75: ldc ';'
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_1
    //   82: aload_0
    //   83: getfield Dne : I
    //   86: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_0
    //   91: getfield Dne : Ljava/util/Map;
    //   94: invokeinterface isEmpty : ()Z
    //   99: ifne -> 314
    //   102: aload_1
    //   103: ldc ';'
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: iconst_0
    //   110: istore_2
    //   111: aload_0
    //   112: getfield Dne : Ljava/util/Map;
    //   115: invokeinterface entrySet : ()Ljava/util/Set;
    //   120: invokeinterface iterator : ()Ljava/util/Iterator;
    //   125: astore_3
    //   126: aload_3
    //   127: invokeinterface hasNext : ()Z
    //   132: ifeq -> 311
    //   135: aload_3
    //   136: invokeinterface next : ()Ljava/lang/Object;
    //   141: checkcast java/util/Map$Entry
    //   144: astore #4
    //   146: iload_2
    //   147: iinc #2, 1
    //   150: ifle -> 160
    //   153: aload_1
    //   154: ldc ','
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_1
    //   161: aload #4
    //   163: invokeinterface getKey : ()Ljava/lang/Object;
    //   168: checkcast java/lang/String
    //   171: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload #4
    //   180: invokeinterface getValue : ()Ljava/lang/Object;
    //   185: checkcast java/util/Map
    //   188: astore #5
    //   190: aload #5
    //   192: invokeinterface isEmpty : ()Z
    //   197: ifne -> 308
    //   200: aload_1
    //   201: ldc '('
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: iconst_0
    //   208: istore #6
    //   210: aload #5
    //   212: invokeinterface entrySet : ()Ljava/util/Set;
    //   217: invokeinterface iterator : ()Ljava/util/Iterator;
    //   222: astore #7
    //   224: aload #7
    //   226: invokeinterface hasNext : ()Z
    //   231: ifeq -> 301
    //   234: aload #7
    //   236: invokeinterface next : ()Ljava/lang/Object;
    //   241: checkcast java/util/Map$Entry
    //   244: astore #8
    //   246: iload #6
    //   248: iinc #6, 1
    //   251: ifle -> 261
    //   254: aload_1
    //   255: ldc ' '
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload_1
    //   262: aload #8
    //   264: invokeinterface getKey : ()Ljava/lang/Object;
    //   269: checkcast java/lang/String
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload_1
    //   277: ldc '='
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload_1
    //   284: aload #8
    //   286: invokeinterface getValue : ()Ljava/lang/Object;
    //   291: checkcast java/lang/String
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: goto -> 224
    //   301: aload_1
    //   302: ldc ')'
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: pop
    //   308: goto -> 126
    //   311: goto -> 321
    //   314: aload_1
    //   315: ldc ';'
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload_1
    //   322: invokevirtual toString : ()Ljava/lang/String;
    //   325: areturn
  }
  
  private static Jjb Dne(String paramString, int paramInt) {
    int k;
    String[] arrayOfString = paramString.split("x", 2);
    int i = 1;
    int j = 0;
    if (arrayOfString.length == 2)
      try {
        i = Integer.parseInt(arrayOfString[0]);
        if (paramInt + i >= 256)
          i = 256 - paramInt; 
        if (i < 0)
          i = 0; 
      } catch (Throwable throwable) {
        return null;
      }  
    try {
      String str = arrayOfString[arrayOfString.length - 1];
      arrayOfString = str.split(":", 2);
      k = Integer.parseInt(arrayOfString[0]);
      if (arrayOfString.length > 1)
        j = Integer.parseInt(arrayOfString[1]); 
      if (zKP.Dne[k] == null) {
        k = 0;
        j = 0;
      } 
      if (j < 0 || j > 15)
        j = 0; 
    } catch (Throwable throwable) {
      return null;
    } 
    Jjb jjb = new Jjb(i, k, j);
    jjb.Dne(paramInt);
    return jjb;
  }
  
  public Map Dne() {
    return this.Dne;
  }
  
  public static lDk Dne() {
    lDk lDk1 = new lDk();
    lDk1.Dne(OdI.FWm.Qnq);
    lDk1.Dne().add(new Jjb(1, zKP.zGp.FWm));
    lDk1.Dne().add(new Jjb(2, zKP.FWm.FWm));
    lDk1.Dne().add(new Jjb(1, ((ZQN)zKP.Dne).FWm));
    lDk1.Dne();
    lDk1.Dne().put("village", new HashMap<>());
    return lDk1;
  }
  
  public void Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield Dne : Ljava/util/List;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_3
    //   12: aload_3
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 46
    //   21: aload_3
    //   22: invokeinterface next : ()Ljava/lang/Object;
    //   27: checkcast Jjb
    //   30: astore_2
    //   31: aload_2
    //   32: iload_1
    //   33: invokevirtual Dne : (I)V
    //   36: iload_1
    //   37: aload_2
    //   38: invokevirtual Dne : ()I
    //   41: iadd
    //   42: istore_1
    //   43: goto -> 12
    //   46: return
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public lDk() {
    this.Dne = new HashMap<>();
    this.Dne = 0;
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lDk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */