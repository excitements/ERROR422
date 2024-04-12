import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class muh extends uOw {
  public String FWm;
  
  public long Dne;
  
  public boolean Dne;
  
  public int FWm;
  
  public String bzF;
  
  public String Dne;
  
  private String IjH = null;
  
  public boolean bzF = false;
  
  public boolean FWm;
  
  private String div = null;
  
  public String zGp = "";
  
  public String DyG = "";
  
  public String aFZ;
  
  public int Dne;
  
  public String Qnq;
  
  public List Dne;
  
  public long FWm;
  
  public void Dne(muh parammuh) {
    this.DyG = parammuh.DyG;
    this.zGp = parammuh.zGp;
    this.FWm = parammuh.FWm;
    this.FWm = parammuh.FWm;
    this.FWm = parammuh.FWm;
    this.bzF = true;
  }
  
  private static List Dne(List paramList) {
    ArrayList<String> arrayList = new ArrayList();
    for (LIC lIC : paramList)
      arrayList.add(lIC.Dne(new Object[0])); 
    return arrayList;
  }
  
  public static muh Dne(LIC paramLIC) {
    muh muh1 = new muh();
    try {
      muh1.Dne = Long.parseLong(paramLIC.FWm(new Object[] { "id" }));
      muh1.Dne = (List)paramLIC.Dne(new Object[] { "name" });
      muh1.FWm = paramLIC.Dne(new Object[] { "motd" });
      muh1.bzF = paramLIC.Dne(new Object[] { "state" });
      muh1.Qnq = paramLIC.Dne(new Object[] { "owner" });
      if (paramLIC.Dne(new Object[] { "invited" })) {
        muh1.Dne = Dne(paramLIC.Dne(new Object[] { "invited" }));
      } else {
        muh1.Dne = new ArrayList();
      } 
      muh1.Dne = Integer.parseInt(paramLIC.FWm(new Object[] { "daysLeft" }));
      muh1.aFZ = paramLIC.Dne(new Object[] { "ip" });
      muh1.Dne = paramLIC.Dne(new Object[] { "expired" }).booleanValue();
    } catch (IllegalArgumentException illegalArgumentException) {}
    return muh1;
  }
  
  public String Dne() {
    if (this.div == null)
      try {
        this.div = URLDecoder.decode(this.FWm, "UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        this.div = this.FWm;
      }  
    return this.div;
  }
  
  public static muh Dne(String paramString) {
    muh muh1 = new muh();
    try {
      muh1 = Dne((new tjH()).Dne(paramString));
    } catch (pPp pPp) {}
    return muh1;
  }
  
  public String FWm() {
    if (this.IjH == null)
      try {
        this.IjH = URLDecoder.decode((String)this.Dne, "UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        this.IjH = (String)this.Dne;
      }  
    return this.IjH;
  }
  
  public void FWm(String paramString) {
    this.FWm = paramString;
    this.div = null;
  }
  
  public void Dne(String paramString) {
    this.Dne = (List)paramString;
    this.IjH = null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\muh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */