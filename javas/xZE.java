import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class xZE implements IMF {
  private static yzC Dne = null;
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return false;
  }
  
  public static PJQ Dne(gnI paramgnI) {
    if (paramgnI instanceof PJQ)
      return (PJQ)paramgnI; 
    throw new FKZ("You must specify which player you wish to perform this action on.", new Object[0]);
  }
  
  public static void Dne(yzC paramyzC) {
    Dne = paramyzC;
  }
  
  public static String Dne(gnI paramgnI, String[] paramArrayOfString, int paramInt, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = paramInt; i < paramArrayOfString.length; i++) {
      if (i > paramInt)
        stringBuilder.append(" "); 
      String str = paramArrayOfString[i];
      if (paramBoolean) {
        String str1 = IYC.Dne(paramgnI, str);
        if (str1 != null) {
          str = str1;
        } else if (IYC.FWm(str)) {
          throw new FKZ();
        } 
      } 
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  public static double Dne(gnI paramgnI, String paramString) {
    try {
      return Double.parseDouble(paramString);
    } catch (NumberFormatException numberFormatException) {
      throw new PUA("commands.generic.double.invalid", new Object[] { paramString });
    } 
  }
  
  public static String Dne(gnI paramgnI, String paramString) {
    PJQ pJQ = IYC.Dne(paramgnI, paramString);
    if (pJQ != null)
      return pJQ.Dne(); 
    if (IYC.FWm(paramString))
      throw new FKZ(); 
    return paramString;
  }
  
  public static int Dne(gnI paramgnI, String paramString, int paramInt1, int paramInt2) {
    int i = FWm(paramgnI, paramString);
    if (i < paramInt1)
      throw new PUA("commands.generic.num.tooSmall", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) }); 
    if (i > paramInt2)
      throw new PUA("commands.generic.num.tooBig", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) }); 
    return i;
  }
  
  public static String Dne(Object[] paramArrayOfObject) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      String str = paramArrayOfObject[b].toString();
      if (b > 0)
        if (b == paramArrayOfObject.length - 1) {
          stringBuilder.append(" and ");
        } else {
          stringBuilder.append(", ");
        }  
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  public int Dne() {
    return 4;
  }
  
  public static int FWm(gnI paramgnI, String paramString) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      throw new PUA("commands.generic.num.invalid", new Object[] { paramString });
    } 
  }
  
  public static PJQ Dne(gnI paramgnI, String paramString) {
    PJQ pJQ = IYC.Dne(paramgnI, paramString);
    if (pJQ != null)
      return pJQ; 
    pJQ = Jwh.Dne().Dne().FWm(paramString);
    if (pJQ == null)
      throw new FKZ(); 
    return pJQ;
  }
  
  public int Dne(IMF paramIMF) {
    return Dne().compareTo(paramIMF.Dne());
  }
  
  public static void Dne(gnI paramgnI, int paramInt, String paramString, Object... paramVarArgs) {
    if (Dne != null)
      Dne.Dne(paramgnI, paramInt, paramString, paramVarArgs); 
  }
  
  public List Dne() {
    return null;
  }
  
  public static boolean Dne(String paramString1, String paramString2) {
    return paramString2.regionMatches(true, 0, paramString1, 0, paramString1.length());
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return null;
  }
  
  public String Dne(gnI paramgnI) {
    return "/" + Dne();
  }
  
  public static List Dne(String[] paramArrayOfString1, String... paramVarArgs1) {
    String str = paramArrayOfString1[paramArrayOfString1.length - 1];
    ArrayList<String> arrayList = new ArrayList();
    String[] arrayOfString = paramVarArgs1;
    int i = paramVarArgs1.length;
    for (byte b = 0; b < i; b++) {
      String str1 = arrayOfString[b];
      if (Dne(str, str1))
        arrayList.add(str1); 
    } 
    return arrayList;
  }
  
  public static void Dne(gnI paramgnI, String paramString, Object... paramVarArgs) {
    Dne(paramgnI, 0, paramString, paramVarArgs);
  }
  
  public boolean Dne(gnI paramgnI) {
    return paramgnI.Dne(Dne(), Dne());
  }
  
  public static String Dne(Collection paramCollection) {
    return Dne(paramCollection.toArray((Object[])new String[0]));
  }
  
  public int compareTo(Object paramObject) {
    return Dne((IMF)paramObject);
  }
  
  public static String Dne(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    return Dne(paramgnI, paramArrayOfString, paramInt, false);
  }
  
  public static int Dne(gnI paramgnI, String paramString, int paramInt) {
    return Dne(paramgnI, paramString, paramInt, 2147483647);
  }
  
  public static List Dne(String[] paramArrayOfString, Iterable paramIterable) {
    String str = paramArrayOfString[paramArrayOfString.length - 1];
    ArrayList<String> arrayList = new ArrayList();
    for (String str1 : paramIterable) {
      if (Dne(str, str1))
        arrayList.add(str1); 
    } 
    return arrayList;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xZE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */