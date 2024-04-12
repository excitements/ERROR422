import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IJk extends dEr {
  private static final Map Dne = new LinkedHashMap<>();
  
  private HashMap Dne = new HashMap<>();
  
  private gDn bzF;
  
  private gDn FWm;
  
  private gDn Qnq;
  
  public int FWm(int paramInt) {
    return yDZ.Dne(paramInt, false);
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x4000) != 0);
  }
  
  public String Qnq(NMq paramNMq) {
    if (paramNMq.Qnq() == 0)
      return KGL.Dne("item.emptyPotion.name").trim(); 
    String str1 = "";
    if (Dne(paramNMq.Qnq()))
      str1 = KGL.Dne("potion.prefix.grenade").trim() + " "; 
    List<NAx> list = dEr.Dne.Dne(paramNMq);
    if (list != null && !list.isEmpty()) {
      String str = ((NAx)list.get(0)).Dne();
      str = str + ".postfix";
      return str1 + KGL.Dne(str).trim();
    } 
    String str2 = yDZ.Dne(paramNMq.Qnq());
    return KGL.Dne(str2).trim() + " " + super.Qnq(paramNMq);
  }
  
  public static gDn Dne(String paramString) {
    return (paramString == "potion") ? ((IJk)dEr.Dne).bzF : ((paramString == "potion_splash") ? ((IJk)dEr.Dne).FWm : ((paramString == "potion_contents") ? ((IJk)dEr.Dne).Qnq : null));
  }
  
  public void Dne(Rbp paramRbp) {
    this.bzF = paramRbp.Dne("potion");
    this.FWm = paramRbp.Dne("potion_splash");
    this.Qnq = paramRbp.Dne("potion_contents");
  }
  
  public een Dne(NMq paramNMq) {
    return een.bzF;
  }
  
  public boolean FWm(NMq paramNMq) {
    List list = Dne(paramNMq);
    return (list != null && !list.isEmpty());
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    super.Dne(paramInt, paramJcN, paramList);
    if (Dne.isEmpty())
      for (byte b = 0; b <= 15; b++) {
        for (byte b1 = 0; b1 <= 1; b1++) {
          int i;
          if (b1 == 0) {
            i = b | 0x2000;
          } else {
            i = b | 0x4000;
          } 
          for (byte b2 = 0; b2 <= 2; b2++) {
            int j = i;
            if (b2 != 0)
              if (b2 == 1) {
                j = i | 0x20;
              } else if (b2 == 2) {
                j = i | 0x40;
              }  
            List list = yDZ.Dne(j, false);
            if (list != null && !list.isEmpty())
              Dne.put(list, Integer.valueOf(j)); 
          } 
        } 
      }  
    Iterator<Integer> iterator = Dne.values().iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      paramList.add(new NMq(paramInt, 1, i));
    } 
  }
  
  public List Dne(NMq paramNMq) {
    if (paramNMq.aFZ() && paramNMq.Dne().Dne("CustomPotionEffects")) {
      ArrayList<NAx> arrayList = new ArrayList();
      mbZ mbZ = paramNMq.Dne().Dne("CustomPotionEffects");
      for (byte b = 0; b < mbZ.Dne(); b++) {
        WkD wkD = (WkD)mbZ.FWm(b);
        arrayList.add(NAx.Dne(wkD));
      } 
      return arrayList;
    } 
    List list = (List)this.Dne.get(Integer.valueOf(paramNMq.Qnq()));
    if (list == null) {
      list = yDZ.Dne(paramNMq.Qnq(), false);
      this.Dne.put(Integer.valueOf(paramNMq.Qnq()), list);
    } 
    return list;
  }
  
  public int Dne(NMq paramNMq, int paramInt) {
    return (paramInt > 0) ? 16777215 : FWm(paramNMq.Qnq());
  }
  
  public List Dne(int paramInt) {
    List list = (List)this.Dne.get(Integer.valueOf(paramInt));
    if (list == null) {
      list = yDZ.Dne(paramInt, false);
      this.Dne.put(Integer.valueOf(paramInt), list);
    } 
    return list;
  }
  
  public int a_(NMq paramNMq) {
    return 32;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 == 0) ? this.Qnq : super.Dne(paramInt1, paramInt2);
  }
  
  public gDn Dne(int paramInt) {
    return Dne(paramInt) ? this.FWm : this.bzF;
  }
  
  public NMq FWm(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (!((uqg)paramFiG.Dne).Qnq)
      paramNMq.Dne--; 
    if (paramQnq.aFZ == null) {
      List list = Dne(paramNMq);
      if (list != null)
        for (NAx nAx : list)
          paramFiG.Qnq(new NAx(nAx));  
    } 
    if (!((uqg)paramFiG.Dne).Qnq) {
      if (paramNMq.Dne <= 0)
        return new NMq(dEr.OCU); 
      paramFiG.Dne.Dne(new NMq(dEr.OCU));
    } 
    return paramNMq;
  }
  
  public IJk(int paramInt) {
    super(paramInt);
    Dne(1);
    Dne(true);
    FWm(0);
    Dne(JcN.mrb);
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List<String> paramList, boolean paramBoolean) {
    if (paramNMq.Qnq() != 0) {
      List list = dEr.Dne.Dne(paramNMq);
      if (list != null && !list.isEmpty()) {
        for (NAx nAx : list) {
          String str = KGL.Dne(nAx.Dne()).trim();
          if (nAx.bzF() > 0)
            str = str + " " + KGL.Dne("potion.potency." + nAx.bzF()).trim(); 
          if (nAx.FWm() > 20)
            str = str + " (" + SXd.Dne(nAx) + ")"; 
          if (SXd.Dne[nAx.Dne()].bzF()) {
            paramList.add(Dne.kGO + str);
            continue;
          } 
          paramList.add(Dne.div + str);
        } 
      } else {
        String str = KGL.Dne("potion.empty").trim();
        paramList.add(Dne.div + str);
      } 
    } 
  }
  
  public boolean Dne() {
    return true;
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    return false;
  }
  
  public boolean FWm(int paramInt) {
    List list = Dne(paramInt);
    if (list != null && !list.isEmpty()) {
      Iterator<NAx> iterator = list.iterator();
      while (true) {
        if (!iterator.hasNext())
          return false; 
        NAx nAx = iterator.next();
        if (SXd.Dne[nAx.Dne()].Dne())
          return true; 
      } 
    } 
    return false;
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (Dne(paramNMq.Qnq())) {
      if (!((uqg)paramFiG.Dne).Qnq)
        paramNMq.Dne--; 
      paramQnq.Dne(paramFiG, "random.bow", 0.5F, 0.4F / (Dne.nextFloat() * 0.4F + 0.8F));
      if (paramQnq.aFZ == null)
        paramQnq.FWm(new YgL(paramQnq, paramFiG, paramNMq)); 
      return paramNMq;
    } 
    paramFiG.Dne(paramNMq, a_(paramNMq));
    return paramNMq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IJk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */