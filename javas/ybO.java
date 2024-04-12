import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

public class ybO extends ArrayList {
  public static ybO Dne(DataInputStream paramDataInputStream) {
    ybO ybO1 = new ybO();
    int i = paramDataInputStream.readByte() & 0xFF;
    for (byte b = 0; b < i; b++) {
      NMq nMq1 = NER.Dne(paramDataInputStream);
      NMq nMq2 = NER.Dne(paramDataInputStream);
      NMq nMq3 = null;
      if (paramDataInputStream.readBoolean())
        nMq3 = NER.Dne(paramDataInputStream); 
      boolean bool = paramDataInputStream.readBoolean();
      Vnr vnr = new Vnr(nMq1, nMq3, nMq2);
      if (bool)
        vnr.FWm(); 
      ybO1.add((E)vnr);
    } 
    return ybO1;
  }
  
  public ybO() {}
  
  public WkD Dne() {
    WkD wkD = new WkD();
    mbZ mbZ = new mbZ("Recipes");
    for (byte b = 0; b < size(); b++) {
      Vnr vnr = (Vnr)get(b);
      mbZ.Dne(vnr.Dne());
    } 
    wkD.Dne("Recipes", mbZ);
    return wkD;
  }
  
  public void Dne(WkD paramWkD) {
    mbZ mbZ = paramWkD.Dne("Recipes");
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      add((E)new Vnr(wkD));
    } 
  }
  
  public ybO(WkD paramWkD) {
    Dne(paramWkD);
  }
  
  public Vnr Dne(NMq paramNMq1, NMq paramNMq2, int paramInt) {
    if (paramInt > 0 && paramInt < size()) {
      Vnr vnr = (Vnr)get(paramInt);
      return (paramNMq1.bzF == (vnr.Dne()).bzF && ((paramNMq2 == null && !vnr.Dne()) || (vnr.Dne() && paramNMq2 != null && (vnr.FWm()).bzF == paramNMq2.bzF)) && paramNMq1.Dne >= (vnr.Dne()).Dne && (!vnr.Dne() || paramNMq2.Dne >= (vnr.FWm()).Dne)) ? vnr : null;
    } 
    for (byte b = 0; b < size(); b++) {
      Vnr vnr = (Vnr)get(b);
      if (paramNMq1.bzF == (vnr.Dne()).bzF && paramNMq1.Dne >= (vnr.Dne()).Dne && ((!vnr.Dne() && paramNMq2 == null) || (vnr.Dne() && paramNMq2 != null && (vnr.FWm()).bzF == paramNMq2.bzF && paramNMq2.Dne >= (vnr.FWm()).Dne)))
        return vnr; 
    } 
    return null;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte((byte)(size() & 0xFF));
    for (byte b = 0; b < size(); b++) {
      Vnr vnr = (Vnr)get(b);
      NER.Dne(vnr.Dne(), paramDataOutputStream);
      NER.Dne(vnr.bzF(), paramDataOutputStream);
      NMq nMq = vnr.FWm();
      paramDataOutputStream.writeBoolean((nMq != null));
      if (nMq != null)
        NER.Dne(nMq, paramDataOutputStream); 
      paramDataOutputStream.writeBoolean(vnr.FWm());
    } 
  }
  
  static {
  
  }
  
  public void Dne(Vnr paramVnr) {
    for (byte b = 0; b < size(); b++) {
      Vnr vnr = (Vnr)get(b);
      if (paramVnr.Dne(vnr)) {
        if (paramVnr.FWm(vnr))
          set(b, (E)paramVnr); 
        return;
      } 
    } 
    add((E)paramVnr);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ybO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */