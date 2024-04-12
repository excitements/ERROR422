import java.util.ArrayList;
import java.util.List;

public class kay extends dEr {
  static {
  
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ == null) {
      zMx zMx = new zMx(paramQnq, (paramInt1 + paramFloat1), (paramInt2 + paramFloat2), (paramInt3 + paramFloat3), paramNMq);
      paramQnq.FWm(zMx);
      if (!((uqg)paramFiG.Dne).Qnq)
        paramNMq.Dne--; 
      return true;
    } 
    return false;
  }
  
  public kay(int paramInt) {
    super(paramInt);
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List<String> paramList, boolean paramBoolean) {
    if (paramNMq.aFZ()) {
      WkD wkD = paramNMq.Dne().Dne("Fireworks");
      if (wkD != null) {
        if (wkD.Dne("Flight"))
          paramList.add(KGL.Dne("item.fireworks.flight") + " " + wkD.Dne("Flight")); 
        mbZ mbZ = wkD.Dne("Explosions");
        if (mbZ != null && mbZ.Dne() > 0)
          for (byte b = 0; b < mbZ.Dne(); b++) {
            WkD wkD1 = (WkD)mbZ.FWm(b);
            ArrayList<String> arrayList = new ArrayList();
            oGG.Dne(wkD1, arrayList);
            if (arrayList.size() > 0) {
              for (byte b1 = 1; b1 < arrayList.size(); b1++)
                arrayList.set(b1, "  " + (String)arrayList.get(b1)); 
              paramList.addAll(arrayList);
            } 
          }  
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */