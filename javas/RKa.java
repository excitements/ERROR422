import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RKa extends qVZ {
  private final fZI Dne;
  
  private String Dne;
  
  private final List bzF = new ArrayList();
  
  private final qVZ Dne;
  
  private Pee Dne;
  
  private Agm Dne;
  
  private String[] Dne;
  
  private final List FWm = new ArrayList();
  
  public RKa(qVZ paramqVZ, fZI paramfZI) {
    this.Dne = (String[])paramqVZ;
    this.Dne = (String[])paramfZI;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null) {
      if (paramPee.aFZ == 2) {
        this.Dne.FWm();
        this.Dne.FWm();
        this.Dne.Dne((qVZ)this.Dne);
      } 
      if (paramPee.aFZ == 1) {
        this.Dne.Dne(ONk.oIf, 1);
        ((Pee)this.Dne).Dne = this.Dne.Dne(ONk.oIf);
      } 
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    this.Dne.Dne(paramInt1, paramInt2, paramFloat);
    Dne((msA)this.Dne, (String)this.Dne, this.FWm / 2, 8, 16777215);
    int i = 22;
    for (String str : this.Dne) {
      Dne((msA)this.Dne, str, this.FWm / 2, i, 8421504);
      i += ((msA)this.Dne).Dne;
    } 
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void Dne() {
    this.Dne = (String[])KGL.Dne("options.snooper.title");
    String str = KGL.Dne("options.snooper.desc");
    ArrayList<String> arrayList = new ArrayList();
    for (String str1 : this.Dne.Dne(str, this.FWm - 30))
      arrayList.add(str1); 
    this.Dne = arrayList.<String>toArray(new String[0]);
    this.FWm.clear();
    this.bzF.clear();
    this.Dne.add(this.Dne = (String[])new Pee(1, this.FWm / 2 - 152, this.bzF - 30, 150, 20, this.Dne.Dne(ONk.oIf)));
    this.Dne.add(new Pee(2, this.FWm / 2 + 2, this.bzF - 30, 150, 20, KGL.Dne("gui.done")));
    boolean bool = (this.Dne.Dne() != null && this.Dne.Dne().Dne() != null) ? true : false;
    for (Map.Entry<?, ?> entry : (new TreeMap<>(this.Dne.Dne().Dne())).entrySet()) {
      this.FWm.add((bool ? "C " : "") + (String)entry.getKey());
      this.bzF.add(this.Dne.Dne((String)entry.getValue(), this.FWm - 220));
    } 
    if (bool)
      for (Map.Entry<?, ?> entry : (new TreeMap<>(this.Dne.Dne().Dne().Dne())).entrySet()) {
        this.FWm.add("S " + (String)entry.getKey());
        this.bzF.add(this.Dne.Dne((String)entry.getValue(), this.FWm - 220));
      }  
    this.Dne = (String[])new Agm(this);
  }
  
  static List Dne(RKa paramRKa) {
    return paramRKa.FWm;
  }
  
  static List FWm(RKa paramRKa) {
    return paramRKa.bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RKa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */