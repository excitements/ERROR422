import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class Qyv {
  private final int Dne;
  
  private final String Dne;
  
  public int Dne() {
    return this.Dne;
  }
  
  private static String[] Dne(String paramString) {
    try {
      Class.forName("com.sun.jndi.dns.DnsContextFactory");
      Hashtable<Object, Object> hashtable = new Hashtable<>();
      hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
      hashtable.put("java.naming.provider.url", "dns:");
      hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
      InitialDirContext initialDirContext = new InitialDirContext(hashtable);
      Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + paramString, new String[] { "SRV" });
      String[] arrayOfString = attributes.get("srv").get().toString().split(" ", 4);
      return new String[] { arrayOfString[3], arrayOfString[2] };
    } catch (Throwable throwable) {
      return new String[] { paramString, Integer.toString(25565) };
    } 
  }
  
  private Qyv(String paramString, int paramInt) {
    this.Dne = paramString;
    this.Dne = paramInt;
  }
  
  public static Qyv Dne(String paramString) {
    if (paramString == null)
      return null; 
    String[] arrayOfString = paramString.split(":");
    if (paramString.startsWith("[")) {
      int j = paramString.indexOf("]");
      if (j > 0) {
        String str1 = paramString.substring(1, j);
        String str2 = paramString.substring(j + 1).trim();
        if (str2.startsWith(":") && str2.length() > 0) {
          str2 = str2.substring(1);
          arrayOfString = new String[] { str1, str2 };
        } else {
          arrayOfString = new String[] { str1 };
        } 
      } 
    } 
    if (arrayOfString.length > 2)
      arrayOfString = new String[] { paramString }; 
    String str = arrayOfString[0];
    int i = (arrayOfString.length > 1) ? Dne(arrayOfString[1], 25565) : 25565;
    if (i == 25565) {
      String[] arrayOfString1 = Dne(str);
      str = arrayOfString1[0];
      i = Dne(arrayOfString1[1], 25565);
    } 
    return new Qyv(str, i);
  }
  
  private static int Dne(String paramString, int paramInt) {
    try {
      return Integer.parseInt(paramString.trim());
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public String Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Qyv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */