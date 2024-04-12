import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class wBl {
  private static int Dne(List paramList) {
    boolean bool = false;
    int i = 0;
    for (pok pok : paramList) {
      if (pok.bzF > 0 && pok.FWm < pok.bzF)
        bool = true; 
      i += pok.Dne;
    } 
    return bool ? i : -1;
  }
  
  static bvz Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return bzF(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  private static bvz Qnq(opc paramopc, List<JZc> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 > 3 + paramopc.Dne)
      return null; 
    if (Math.abs(paramInt1 - (paramopc.Dne()).Dne) <= 112 && Math.abs(paramInt3 - (paramopc.Dne()).bzF) <= 112) {
      CLK cLK = JZc.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
      if (cLK != null && cLK.FWm > 10) {
        JZc jZc = new JZc(paramopc, paramInt5, paramRandom, cLK, paramInt4);
        int i = (jZc.Dne.Dne + jZc.Dne.Qnq) / 2;
        int j = (jZc.Dne.bzF + jZc.Dne.zGp) / 2;
        int k = jZc.Dne.Qnq - jZc.Dne.Dne;
        int m = jZc.Dne.zGp - jZc.Dne.bzF;
        int n = (k > m) ? k : m;
        if (paramopc.Dne().Dne(i, j, n / 2 + 4, cXw.Dne)) {
          paramList.add(jZc);
          paramopc.bzF.add(jZc);
          return jZc;
        } 
      } 
      return null;
    } 
    return null;
  }
  
  static {
  
  }
  
  private static ram Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = Dne((List)paramopc.Dne);
    if (i <= 0)
      return null; 
    byte b = 0;
    while (b < 5) {
      b++;
      int j = paramRandom.nextInt(i);
      for (pok pok : paramopc.Dne) {
        j -= pok.Dne;
        if (j < 0) {
          if (!pok.Dne(paramInt5) || (pok == paramopc.Dne && paramopc.Dne.size() > 1))
            break; 
          ram ram = Dne(paramopc, pok, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
          if (ram != null) {
            pok.FWm++;
            paramopc.Dne = pok;
            if (!pok.Dne())
              paramopc.Dne.remove(pok); 
            return ram;
          } 
        } 
      } 
    } 
    CLK cLK = UBI.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
    return (cLK != null) ? new UBI(paramopc, paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  static bvz FWm(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return Qnq(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static ArrayList Dne(Random paramRandom, int paramInt) {
    ArrayList<pok> arrayList = new ArrayList();
    arrayList.add(new pok(CVf.class, 4, geR.Dne(paramRandom, 2 + paramInt, 4 + paramInt * 2)));
    arrayList.add(new pok(YvM.class, 20, geR.Dne(paramRandom, 0 + paramInt, 1 + paramInt)));
    arrayList.add(new pok(ZRq.class, 20, geR.Dne(paramRandom, 0 + paramInt, 2 + paramInt)));
    arrayList.add(new pok(pMs.class, 3, geR.Dne(paramRandom, 2 + paramInt, 5 + paramInt * 3)));
    arrayList.add(new pok(gcg.class, 15, geR.Dne(paramRandom, 0 + paramInt, 2 + paramInt)));
    arrayList.add(new pok(lCY.class, 3, geR.Dne(paramRandom, 1 + paramInt, 4 + paramInt)));
    arrayList.add(new pok(PCy.class, 3, geR.Dne(paramRandom, 2 + paramInt, 4 + paramInt * 2)));
    arrayList.add(new pok(Omm.class, 15, geR.Dne(paramRandom, 0, 1 + paramInt)));
    arrayList.add(new pok(ykp.class, 8, geR.Dne(paramRandom, 0 + paramInt, 3 + paramInt * 2)));
    Iterator<pok> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      if (((pok)iterator.next()).bzF == 0)
        iterator.remove(); 
    } 
    return arrayList;
  }
  
  private static bvz bzF(opc paramopc, List<ram> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 > 50)
      return null; 
    if (Math.abs(paramInt1 - (paramopc.Dne()).Dne) <= 112 && Math.abs(paramInt3 - (paramopc.Dne()).bzF) <= 112) {
      ram ram = Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5 + 1);
      if (ram != null) {
        int i = (((CLK)ram.Dne).Dne + ((CLK)ram.Dne).Qnq) / 2;
        int j = (((CLK)ram.Dne).bzF + ((CLK)ram.Dne).zGp) / 2;
        int k = ((CLK)ram.Dne).Qnq - ((CLK)ram.Dne).Dne;
        int m = ((CLK)ram.Dne).zGp - ((CLK)ram.Dne).bzF;
        int n = (k > m) ? k : m;
        if (paramopc.Dne().Dne(i, j, n / 2 + 4, cXw.Dne)) {
          paramList.add(ram);
          paramopc.FWm.add(ram);
          return ram;
        } 
      } 
      return null;
    } 
    return null;
  }
  
  private static ram Dne(opc paramopc, pok parampok, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ykp ykp;
    Class<CVf> clazz = parampok.Dne;
    CVf cVf = null;
    if (clazz == CVf.class) {
      cVf = CVf.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == YvM.class) {
      YvM yvM = YvM.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == ZRq.class) {
      ZRq zRq = ZRq.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == pMs.class) {
      pMs pMs = pMs.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == gcg.class) {
      gcg gcg = gcg.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == lCY.class) {
      lCY lCY = lCY.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == PCy.class) {
      PCy pCy = PCy.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == Omm.class) {
      Omm omm = Omm.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (clazz == ykp.class) {
      ykp = ykp.Dne(paramopc, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } 
    return ykp;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wBl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */