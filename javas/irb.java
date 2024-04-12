import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.IllegalFormatException;
import java.util.Properties;
import java.util.TreeMap;

public class irb {
  private TreeMap Dne;
  
  private TreeMap FWm = new TreeMap<>();
  
  private boolean Dne;
  
  private String Dne;
  
  private static irb Dne = new irb("en_US");
  
  private Properties Dne = new Properties();
  
  public synchronized boolean Dne(String paramString) {
    return this.Dne.containsKey(paramString);
  }
  
  public synchronized String Dne(String paramString) {
    return this.Dne.getProperty(paramString, paramString);
  }
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public static boolean FWm(String paramString) {
    return ("ar_SA".equals(paramString) || "he_IL".equals(paramString));
  }
  
  public static irb Dne() {
    return (irb)Dne;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public synchronized void Dne(String paramString, File paramFile) {
    int i = paramString.indexOf('.');
    if (i > 0)
      paramString = paramString.substring(0, i); 
    this.FWm.put(paramString, paramFile);
    if (paramString.contains((CharSequence)this.Dne))
      Dne((String)this.Dne, true); 
  }
  
  public synchronized void Dne(String paramString, boolean paramBoolean) {
    if (paramBoolean || !paramString.equals(this.Dne)) {
      Properties properties = new Properties();
      try {
        Dne(properties, "en_US");
      } catch (IOException iOException) {}
      this.Dne = false;
      if (!"en_US".equals(paramString))
        try {
          Dne(properties, paramString);
          Enumeration<?> enumeration = properties.propertyNames();
          while (enumeration.hasMoreElements() && this.Dne == null) {
            Object object1 = enumeration.nextElement();
            Object object2 = properties.get(object1);
            if (object2 != null) {
              String str = object2.toString();
              for (byte b = 0; b < str.length(); b++) {
                if (str.charAt(b) >= 'Ā') {
                  this.Dne = true;
                  break;
                } 
              } 
            } 
          } 
        } catch (IOException iOException) {
          iOException.printStackTrace();
          return;
        }  
      this.Dne = (Properties)paramString;
      this.Dne = properties;
    } 
  }
  
  public irb(String paramString) {
    Dne();
    Dne(paramString, false);
  }
  
  public TreeMap Dne() {
    return (TreeMap)this.Dne;
  }
  
  public synchronized String Dne(String paramString, Object... paramVarArgs) {
    String str = this.Dne.getProperty(paramString, paramString);
    try {
      return String.format(str, paramVarArgs);
    } catch (IllegalFormatException illegalFormatException) {
      return "Format error: " + str;
    } 
  }
  
  private void Dne() {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(irb.class.getResourceAsStream("/lang/languages.txt"), "UTF-8"));
      for (String str = bufferedReader.readLine(); str != null; str = bufferedReader.readLine()) {
        String[] arrayOfString = str.trim().split("=");
        if (arrayOfString != null && arrayOfString.length == 2)
          treeMap.put(arrayOfString[0], arrayOfString[1]); 
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
    this.Dne = (Properties)treeMap;
    this.Dne.put("en_US", "English (US)");
  }
  
  private void Dne(Properties paramProperties, String paramString) {
    BufferedReader bufferedReader = null;
    if (this.FWm.containsKey(paramString)) {
      bufferedReader = new BufferedReader(new FileReader((File)this.FWm.get(paramString)));
    } else {
      bufferedReader = new BufferedReader(new InputStreamReader(irb.class.getResourceAsStream("/lang/" + paramString + ".lang"), "UTF-8"));
    } 
    for (String str = bufferedReader.readLine(); str != null; str = bufferedReader.readLine()) {
      str = str.trim();
      if (!str.startsWith("#")) {
        String[] arrayOfString = str.split("=");
        if (arrayOfString != null && arrayOfString.length == 2)
          paramProperties.setProperty(arrayOfString[0], arrayOfString[1]); 
      } 
    } 
  }
  
  public synchronized String FWm(String paramString) {
    return this.Dne.getProperty(paramString + ".name", "");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\irb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */