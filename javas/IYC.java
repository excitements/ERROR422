import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IYC {
  private static final Pattern FWm;
  
  private static final Pattern bzF;
  
  private static final Pattern Dne = Pattern.compile("^@([parf])(?:\\[([\\w=,!-]*)\\])?$");
  
  private static final int aFZ(String paramString) {
    return paramString.equals("a") ? 0 : 1;
  }
  
  public static String Dne(gnI paramgnI, String paramString) {
    PJQ[] arrayOfPJQ = Dne(paramgnI, paramString);
    if (arrayOfPJQ != null && arrayOfPJQ.length != 0) {
      String[] arrayOfString = new String[arrayOfPJQ.length];
      for (byte b = 0; b < arrayOfString.length; b++)
        arrayOfString[b] = arrayOfPJQ[b].aFZ(); 
      return xZE.Dne((Object[])arrayOfString);
    } 
    return null;
  }
  
  public static PJQ[] Dne(gnI paramgnI, String paramString) {
    // Byte code:
    //   0: getstatic IYC.Dne : Ljava/util/regex/Pattern;
    //   3: aload_1
    //   4: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   7: astore_2
    //   8: aload_2
    //   9: invokevirtual matches : ()Z
    //   12: ifeq -> 621
    //   15: aload_2
    //   16: iconst_2
    //   17: invokevirtual group : (I)Ljava/lang/String;
    //   20: invokestatic Dne : (Ljava/lang/String;)Ljava/util/Map;
    //   23: astore_3
    //   24: aload_2
    //   25: iconst_1
    //   26: invokevirtual group : (I)Ljava/lang/String;
    //   29: astore #4
    //   31: aload #4
    //   33: invokestatic Dne : (Ljava/lang/String;)I
    //   36: istore #5
    //   38: aload #4
    //   40: invokestatic FWm : (Ljava/lang/String;)I
    //   43: istore #6
    //   45: aload #4
    //   47: invokestatic Qnq : (Ljava/lang/String;)I
    //   50: istore #7
    //   52: aload #4
    //   54: invokestatic bzF : (Ljava/lang/String;)I
    //   57: istore #8
    //   59: aload #4
    //   61: invokestatic aFZ : (Ljava/lang/String;)I
    //   64: istore #9
    //   66: getstatic XHL.Dne : LXHL;
    //   69: invokevirtual Dne : ()I
    //   72: istore #10
    //   74: aload_0
    //   75: invokeinterface Dne : ()LiSh;
    //   80: astore #11
    //   82: aload_3
    //   83: invokestatic Dne : (Ljava/util/Map;)Ljava/util/Map;
    //   86: astore #12
    //   88: aconst_null
    //   89: astore #13
    //   91: aconst_null
    //   92: astore #14
    //   94: aload_3
    //   95: ldc 'rm'
    //   97: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   102: ifeq -> 123
    //   105: aload_3
    //   106: ldc 'rm'
    //   108: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   113: checkcast java/lang/String
    //   116: iload #5
    //   118: invokestatic Dne : (Ljava/lang/String;I)I
    //   121: istore #5
    //   123: aload_3
    //   124: ldc 'r'
    //   126: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   131: ifeq -> 152
    //   134: aload_3
    //   135: ldc 'r'
    //   137: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast java/lang/String
    //   145: iload #6
    //   147: invokestatic Dne : (Ljava/lang/String;I)I
    //   150: istore #6
    //   152: aload_3
    //   153: ldc 'lm'
    //   155: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   160: ifeq -> 181
    //   163: aload_3
    //   164: ldc 'lm'
    //   166: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   171: checkcast java/lang/String
    //   174: iload #7
    //   176: invokestatic Dne : (Ljava/lang/String;I)I
    //   179: istore #7
    //   181: aload_3
    //   182: ldc 'l'
    //   184: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   189: ifeq -> 210
    //   192: aload_3
    //   193: ldc 'l'
    //   195: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   200: checkcast java/lang/String
    //   203: iload #8
    //   205: invokestatic Dne : (Ljava/lang/String;I)I
    //   208: istore #8
    //   210: aload_3
    //   211: ldc 'x'
    //   213: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   218: ifeq -> 245
    //   221: aload #11
    //   223: aload_3
    //   224: ldc 'x'
    //   226: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   231: checkcast java/lang/String
    //   234: aload #11
    //   236: getfield Dne : I
    //   239: invokestatic Dne : (Ljava/lang/String;I)I
    //   242: putfield Dne : I
    //   245: aload_3
    //   246: ldc 'y'
    //   248: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   253: ifeq -> 280
    //   256: aload #11
    //   258: aload_3
    //   259: ldc 'y'
    //   261: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   266: checkcast java/lang/String
    //   269: aload #11
    //   271: getfield FWm : I
    //   274: invokestatic Dne : (Ljava/lang/String;I)I
    //   277: putfield FWm : I
    //   280: aload_3
    //   281: ldc 'z'
    //   283: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   288: ifeq -> 315
    //   291: aload #11
    //   293: aload_3
    //   294: ldc 'z'
    //   296: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   301: checkcast java/lang/String
    //   304: aload #11
    //   306: getfield bzF : I
    //   309: invokestatic Dne : (Ljava/lang/String;I)I
    //   312: putfield bzF : I
    //   315: aload_3
    //   316: ldc 'm'
    //   318: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   323: ifeq -> 344
    //   326: aload_3
    //   327: ldc 'm'
    //   329: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   334: checkcast java/lang/String
    //   337: iload #10
    //   339: invokestatic Dne : (Ljava/lang/String;I)I
    //   342: istore #10
    //   344: aload_3
    //   345: ldc 'c'
    //   347: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   352: ifeq -> 373
    //   355: aload_3
    //   356: ldc 'c'
    //   358: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   363: checkcast java/lang/String
    //   366: iload #9
    //   368: invokestatic Dne : (Ljava/lang/String;I)I
    //   371: istore #9
    //   373: aload_3
    //   374: ldc 'team'
    //   376: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   381: ifeq -> 397
    //   384: aload_3
    //   385: ldc 'team'
    //   387: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   392: checkcast java/lang/String
    //   395: astore #14
    //   397: aload_3
    //   398: ldc 'name'
    //   400: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   405: ifeq -> 421
    //   408: aload_3
    //   409: ldc 'name'
    //   411: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   416: checkcast java/lang/String
    //   419: astore #13
    //   421: aload #4
    //   423: ldc 'p'
    //   425: invokevirtual equals : (Ljava/lang/Object;)Z
    //   428: ifne -> 550
    //   431: aload #4
    //   433: ldc 'a'
    //   435: invokevirtual equals : (Ljava/lang/Object;)Z
    //   438: ifne -> 550
    //   441: aload #4
    //   443: ldc 'r'
    //   445: invokevirtual equals : (Ljava/lang/Object;)Z
    //   448: ifne -> 453
    //   451: aconst_null
    //   452: areturn
    //   453: invokestatic Dne : ()LJwh;
    //   456: invokevirtual Dne : ()LdzN;
    //   459: aload #11
    //   461: iload #5
    //   463: iload #6
    //   465: iconst_0
    //   466: iload #10
    //   468: iload #7
    //   470: iload #8
    //   472: aload #12
    //   474: aload #13
    //   476: aload #14
    //   478: invokevirtual Dne : (LiSh;IIIIIILjava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   481: astore #15
    //   483: aload #15
    //   485: invokestatic shuffle : (Ljava/util/List;)V
    //   488: aload #15
    //   490: iconst_0
    //   491: iload #9
    //   493: aload #15
    //   495: invokeinterface size : ()I
    //   500: invokestatic min : (II)I
    //   503: invokeinterface subList : (II)Ljava/util/List;
    //   508: astore #15
    //   510: aload #15
    //   512: ifnull -> 545
    //   515: aload #15
    //   517: invokeinterface isEmpty : ()Z
    //   522: ifne -> 545
    //   525: aload #15
    //   527: iconst_0
    //   528: anewarray PJQ
    //   531: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   536: checkcast [LPJQ;
    //   539: checkcast [LPJQ;
    //   542: goto -> 549
    //   545: iconst_0
    //   546: anewarray PJQ
    //   549: areturn
    //   550: invokestatic Dne : ()LJwh;
    //   553: invokevirtual Dne : ()LdzN;
    //   556: aload #11
    //   558: iload #5
    //   560: iload #6
    //   562: iload #9
    //   564: iload #10
    //   566: iload #7
    //   568: iload #8
    //   570: aload #12
    //   572: aload #13
    //   574: aload #14
    //   576: invokevirtual Dne : (LiSh;IIIIIILjava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   579: astore #15
    //   581: aload #15
    //   583: ifnull -> 616
    //   586: aload #15
    //   588: invokeinterface isEmpty : ()Z
    //   593: ifne -> 616
    //   596: aload #15
    //   598: iconst_0
    //   599: anewarray PJQ
    //   602: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   607: checkcast [LPJQ;
    //   610: checkcast [LPJQ;
    //   613: goto -> 620
    //   616: iconst_0
    //   617: anewarray PJQ
    //   620: areturn
    //   621: aconst_null
    //   622: areturn
  }
  
  public static boolean Dne(String paramString1, String paramString2) {
    Matcher matcher = Dne.matcher(paramString1);
    if (matcher.matches()) {
      String str = matcher.group(1);
      return (paramString2 == null || paramString2.equals(str));
    } 
    return false;
  }
  
  public static boolean Dne(String paramString) {
    Matcher matcher = Dne.matcher(paramString);
    if (matcher.matches()) {
      Map map = Dne(matcher.group(2));
      String str = matcher.group(1);
      int i = aFZ(str);
      if (map.containsKey("c"))
        i = geR.Dne((String)map.get("c"), i); 
      return (i != 1);
    } 
    return false;
  }
  
  private static final int Qnq(String paramString) {
    return 0;
  }
  
  static {
    FWm = Pattern.compile("\\G([-!]?\\w*)(?:$|,)");
    bzF = Pattern.compile("\\G(\\w+)=([-!]?\\w*)(?:$|,)");
  }
  
  private static final int Dne(String paramString) {
    return 0;
  }
  
  private static final int FWm(String paramString) {
    return 0;
  }
  
  private static Map Dne(String paramString) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramString == null)
      return hashMap; 
    Matcher matcher = FWm.matcher(paramString);
    byte b = 0;
    int i;
    for (i = -1; matcher.find(); i = matcher.end()) {
      String str = null;
      switch (b++) {
        case 0:
          str = "x";
          break;
        case 1:
          str = "y";
          break;
        case 2:
          str = "z";
          break;
        case 3:
          str = "r";
          break;
      } 
      if (str != null && matcher.group(1).length() > 0)
        hashMap.put(str, matcher.group(1)); 
    } 
    if (i < paramString.length()) {
      matcher = bzF.matcher((i == -1) ? paramString : paramString.substring(i));
      while (matcher.find())
        hashMap.put(matcher.group(1), matcher.group(2)); 
    } 
    return hashMap;
  }
  
  private static final int bzF(String paramString) {
    return Integer.MAX_VALUE;
  }
  
  public static PJQ Dne(gnI paramgnI, String paramString) {
    PJQ[] arrayOfPJQ = Dne(paramgnI, paramString);
    return (arrayOfPJQ != null && arrayOfPJQ.length == 1) ? arrayOfPJQ[0] : null;
  }
  
  public static boolean FWm(String paramString) {
    return Dne(paramString, (String)null);
  }
  
  public static Map Dne(Map paramMap) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (String str : paramMap.keySet()) {
      if (str.startsWith("score_") && str.length() > "score_".length()) {
        String str1 = str.substring("score_".length());
        hashMap.put(str1, Integer.valueOf(geR.Dne((String)paramMap.get(str), 1)));
      } 
    } 
    return hashMap;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IYC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */