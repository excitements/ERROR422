import java.util.ArrayList;
import java.util.List;

public class STA extends xZE {
  static {
  
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1)
      return Dne(paramArrayOfString, new String[] { "on", "off", "list", "add", "remove", "reload" }); 
    if (paramArrayOfString.length == 2) {
      if (paramArrayOfString[0].equals("add")) {
        String[] arrayOfString1 = Jwh.Dne().Dne().FWm();
        ArrayList<String> arrayList = new ArrayList();
        String str = paramArrayOfString[paramArrayOfString.length - 1];
        String[] arrayOfString2 = arrayOfString1;
        int i = arrayOfString1.length;
        for (byte b = 0; b < i; b++) {
          String str1 = arrayOfString2[b];
          if (Dne(str, str1) && !Jwh.Dne().Dne().Dne().contains(str1))
            arrayList.add(str1); 
        } 
        return arrayList;
      } 
      if (paramArrayOfString[0].equals("remove"))
        return Dne(paramArrayOfString, Jwh.Dne().Dne().Dne()); 
    } 
    return null;
  }
  
  public String Dne() {
    return "whitelist";
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length >= 1) {
      if (paramArrayOfString[0].equals("on")) {
        Jwh.Dne().Dne().Dne(true);
        Dne(paramgnI, "commands.whitelist.enabled", new Object[0]);
        return;
      } 
      if (paramArrayOfString[0].equals("off")) {
        Jwh.Dne().Dne().Dne(false);
        Dne(paramgnI, "commands.whitelist.disabled", new Object[0]);
        return;
      } 
      if (paramArrayOfString[0].equals("list")) {
        paramgnI.Dne(paramgnI.Dne("commands.whitelist.list", new Object[] { Integer.valueOf(Jwh.Dne().Dne().Dne().size()), Integer.valueOf((Jwh.Dne().Dne().FWm()).length) }));
        paramgnI.Dne(Dne(Jwh.Dne().Dne().Dne().toArray((Object[])new String[0])));
        return;
      } 
      if (paramArrayOfString[0].equals("add")) {
        if (paramArrayOfString.length < 2)
          throw new fxw("commands.whitelist.add.usage", new Object[0]); 
        Jwh.Dne().Dne().bzF(paramArrayOfString[1]);
        Dne(paramgnI, "commands.whitelist.add.success", new Object[] { paramArrayOfString[1] });
        return;
      } 
      if (paramArrayOfString[0].equals("remove")) {
        if (paramArrayOfString.length < 2)
          throw new fxw("commands.whitelist.remove.usage", new Object[0]); 
        Jwh.Dne().Dne().Qnq(paramArrayOfString[1]);
        Dne(paramgnI, "commands.whitelist.remove.success", new Object[] { paramArrayOfString[1] });
        return;
      } 
      if (paramArrayOfString[0].equals("reload")) {
        Jwh.Dne().Dne().bzF();
        Dne(paramgnI, "commands.whitelist.reloaded", new Object[0]);
        return;
      } 
    } 
    throw new fxw("commands.whitelist.usage", new Object[0]);
  }
  
  public int Dne() {
    return 3;
  }
  
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.whitelist.usage", new Object[0]);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\STA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */