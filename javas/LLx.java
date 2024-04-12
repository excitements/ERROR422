import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LLx {
  private List Dne;
  
  private Map Dne;
  
  private iDE Dne = (iDE)new HashMap<>();
  
  private Map FWm;
  
  private void FWm() {
    try {
      this.FWm.clear();
      if (this.Dne == null)
        return; 
      File file = this.Dne.Dne("idcounts");
      if (file != null && file.exists()) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        WkD wkD = VVx.Dne(dataInputStream);
        dataInputStream.close();
        for (oNe oNe : wkD.Dne()) {
          if (oNe instanceof phA) {
            phA phA = (phA)oNe;
            String str = phA.Dne();
            short s = phA.Dne;
            this.FWm.put(str, Short.valueOf(s));
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public LLx(iDE paramiDE) {
    this.Dne = (iDE)new ArrayList();
    this.FWm = new HashMap<>();
    this.Dne = paramiDE;
    FWm();
  }
  
  public int Dne(String paramString) {
    Short short_ = (Short)this.FWm.get(paramString);
    if (short_ == null) {
      short_ = Short.valueOf((short)0);
    } else {
      short_ = Short.valueOf((short)(short_.shortValue() + 1));
    } 
    this.FWm.put(paramString, short_);
    if (this.Dne == null)
      return short_.shortValue(); 
    try {
      File file = this.Dne.Dne("idcounts");
      if (file != null) {
        WkD wkD = new WkD();
        for (String str : this.FWm.keySet()) {
          short s = ((Short)this.FWm.get(str)).shortValue();
          wkD.Dne(str, s);
        } 
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        VVx.Dne(wkD, dataOutputStream);
        dataOutputStream.close();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return short_.shortValue();
  }
  
  public vWZ Dne(Class<vWZ> paramClass, String paramString) {
    vWZ vWZ = (vWZ)this.Dne.get(paramString);
    if (vWZ != null)
      return vWZ; 
    if (this.Dne != null)
      try {
        File file = this.Dne.Dne(paramString);
        if (file != null && file.exists()) {
          try {
            vWZ = paramClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { paramString });
          } catch (Exception exception) {
            throw new RuntimeException("Failed to instantiate " + paramClass.toString(), exception);
          } 
          FileInputStream fileInputStream = new FileInputStream(file);
          WkD wkD = VVx.Dne(fileInputStream);
          fileInputStream.close();
          vWZ.Dne(wkD.Dne("data"));
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    if (vWZ != null) {
      this.Dne.put(paramString, vWZ);
      this.Dne.add(vWZ);
    } 
    return vWZ;
  }
  
  public void Dne() {
    for (byte b = 0; b < this.Dne.size(); b++) {
      vWZ vWZ = this.Dne.get(b);
      if (vWZ.Dne()) {
        Dne(vWZ);
        vWZ.Dne(false);
      } 
    } 
  }
  
  public void Dne(String paramString, vWZ paramvWZ) {
    if (paramvWZ == null)
      throw new RuntimeException("Can't set null data"); 
    if (this.Dne.containsKey(paramString))
      this.Dne.remove(this.Dne.remove(paramString)); 
    this.Dne.put(paramString, paramvWZ);
    this.Dne.add(paramvWZ);
  }
  
  private void Dne(vWZ paramvWZ) {
    if (this.Dne != null)
      try {
        File file = this.Dne.Dne(paramvWZ.Dne);
        if (file != null) {
          WkD wkD1 = new WkD();
          paramvWZ.FWm(wkD1);
          WkD wkD2 = new WkD();
          wkD2.Dne("data", wkD1);
          FileOutputStream fileOutputStream = new FileOutputStream(file);
          VVx.Dne(wkD2, fileOutputStream);
          fileOutputStream.close();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LLx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */