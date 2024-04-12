import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrK implements FWm {
  private final Set Dne;
  
  private final Map Dne = new HashMap<>();
  
  private static String[] Dne(String[] paramArrayOfString) {
    String[] arrayOfString = new String[paramArrayOfString.length - 1];
    for (byte b = 1; b < paramArrayOfString.length; b++)
      arrayOfString[b - 1] = paramArrayOfString[b]; 
    return arrayOfString;
  }
  
  public List Dne(gnI paramgnI, String paramString) {
    String[] arrayOfString = paramString.split(" ", -1);
    String str = arrayOfString[0];
    if (arrayOfString.length == 1) {
      ArrayList arrayList = new ArrayList();
      for (Map.Entry entry : this.Dne.entrySet()) {
        if (xZE.Dne(str, (String)entry.getKey()) && ((IMF)entry.getValue()).Dne(paramgnI))
          arrayList.add(entry.getKey()); 
      } 
      return arrayList;
    } 
    if (arrayOfString.length > 1) {
      IMF iMF = (IMF)this.Dne.get(str);
      if (iMF != null)
        return iMF.Dne(paramgnI, Dne(arrayOfString)); 
    } 
    return null;
  }
  
  private int Dne(IMF paramIMF, String[] paramArrayOfString) {
    if (paramIMF == null)
      return -1; 
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramIMF.Dne(paramArrayOfString, b) && IYC.Dne(paramArrayOfString[b]))
        return b; 
    } 
    return -1;
  }
  
  public int Dne(gnI paramgnI, String paramString) {
    paramString = paramString.trim();
    if (paramString.startsWith("/"))
      paramString = paramString.substring(1); 
    String[] arrayOfString = paramString.split(" ");
    String str = arrayOfString[0];
    arrayOfString = Dne(arrayOfString);
    IMF iMF = (IMF)this.Dne.get(str);
    int i = Dne(iMF, arrayOfString);
    byte b = 0;
    try {
      if (iMF == null)
        throw new PKs(); 
      if (iMF.Dne(paramgnI)) {
        if (i > -1) {
          PJQ[] arrayOfPJQ1 = IYC.Dne(paramgnI, arrayOfString[i]);
          String str1 = arrayOfString[i];
          PJQ[] arrayOfPJQ2 = arrayOfPJQ1;
          int j = arrayOfPJQ1.length;
          for (byte b1 = 0; b1 < j; b1++) {
            PJQ pJQ = arrayOfPJQ2[b1];
            arrayOfString[i] = pJQ.Dne();
            try {
              iMF.Dne(paramgnI, arrayOfString);
              b++;
            } catch (WoB woB) {
              paramgnI.Dne(Dne.kGO + paramgnI.Dne(woB.getMessage(), woB.Dne()));
            } 
          } 
          arrayOfString[i] = str1;
        } else {
          iMF.Dne(paramgnI, arrayOfString);
          b++;
        } 
      } else {
        paramgnI.Dne("" + Dne.kGO + "You do not have permission to use this command.");
      } 
    } catch (fxw fxw) {
      paramgnI.Dne(Dne.kGO + paramgnI.Dne("commands.generic.usage", new Object[] { paramgnI.Dne(fxw.getMessage(), fxw.Dne()) }));
    } catch (WoB woB) {
      paramgnI.Dne(Dne.kGO + paramgnI.Dne(woB.getMessage(), woB.Dne()));
    } catch (Throwable throwable) {
      paramgnI.Dne(Dne.kGO + paramgnI.Dne("commands.generic.exception", new Object[0]));
      throwable.printStackTrace();
    } 
    return b;
  }
  
  public Map Dne() {
    return this.Dne;
  }
  
  public FrK() {
    this.Dne = (Map)new HashSet();
  }
  
  public IMF Dne(IMF paramIMF) {
    List list = paramIMF.Dne();
    this.Dne.put(paramIMF.Dne(), paramIMF);
    this.Dne.add(paramIMF);
    if (list != null)
      for (String str : list) {
        IMF iMF = (IMF)this.Dne.get(str);
        if (iMF == null || !iMF.Dne().equals(str))
          this.Dne.put(str, paramIMF); 
      }  
    return paramIMF;
  }
  
  public List Dne(gnI paramgnI) {
    ArrayList<IMF> arrayList = new ArrayList();
    for (IMF iMF : this.Dne) {
      if (iMF.Dne(paramgnI))
        arrayList.add(iMF); 
    } 
    return arrayList;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FrK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */