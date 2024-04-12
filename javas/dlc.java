import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dlc {
  private static final GgT Dne;
  
  private static Class Dne;
  
  private static List Dne;
  
  static int Dne;
  
  private static final eLj[] Dne = new eLj[] { 
      new eLj(xKr.class, 40, 0), new eLj(HLP.class, 5, 5), new eLj(kuW.class, 20, 0), new eLj(YFV.class, 20, 0), new eLj(SBI.class, 10, 6), new eLj(rEI.class, 5, 5), new eLj(ISl.class, 5, 5), new eLj(xwV.class, 5, 4), new eLj(gZj.class, 5, 4), new ywz(FTE.class, 10, 2), 
      new wKS(DVF.class, 20, 1) };
  
  private static oeq Dne(Class<xKr> paramClass, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    DVF dVF;
    xKr xKr = null;
    if (paramClass == xKr.class) {
      xKr = xKr.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == HLP.class) {
      HLP hLP = HLP.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == kuW.class) {
      kuW kuW = kuW.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == YFV.class) {
      kuW kuW = YFV.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == SBI.class) {
      SBI sBI = SBI.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == rEI.class) {
      rEI rEI = rEI.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == ISl.class) {
      ISl iSl = ISl.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == xwV.class) {
      xwV xwV = xwV.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == gZj.class) {
      gZj gZj = gZj.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == FTE.class) {
      FTE fTE = FTE.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } else if (paramClass == DVF.class) {
      dVF = DVF.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    } 
    return dVF;
  }
  
  static bvz Dne(Kci paramKci, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return FWm(paramKci, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  private static bvz FWm(Kci paramKci, List<oeq> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 > 50)
      return null; 
    if (Math.abs(paramInt1 - (paramKci.Dne()).Dne) <= 112 && Math.abs(paramInt3 - (paramKci.Dne()).bzF) <= 112) {
      oeq oeq = Dne(paramKci, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5 + 1);
      if (oeq != null) {
        paramList.add(oeq);
        paramKci.Dne.add(oeq);
      } 
      return oeq;
    } 
    return null;
  }
  
  static Class Dne(Class paramClass) {
    Dne = (eLj[])paramClass;
    return paramClass;
  }
  
  public static void Dne() {
    Dne = (eLj[])new ArrayList();
    for (eLj eLj1 : Dne) {
      eLj1.FWm = 0;
      Dne.add(eLj1);
    } 
    Dne = null;
  }
  
  private static boolean Dne() {
    boolean bool = false;
    Dne = false;
    for (eLj eLj1 : Dne) {
      if (eLj1.bzF > 0 && eLj1.FWm < eLj1.bzF)
        bool = true; 
      Dne += eLj1.Dne;
    } 
    return bool;
  }
  
  private static oeq Dne(Kci paramKci, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (!Dne())
      return null; 
    if (Dne != null) {
      oeq oeq = Dne((Class)Dne, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      Dne = null;
      if (oeq != null)
        return oeq; 
    } 
    byte b = 0;
    while (b < 5) {
      b++;
      int i = paramRandom.nextInt(Dne);
      for (eLj eLj1 : Dne) {
        i -= eLj1.Dne;
        if (i < 0) {
          if (!eLj1.Dne(paramInt5) || eLj1 == paramKci.Dne)
            break; 
          oeq oeq = Dne(eLj1.Dne, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
          if (oeq != null) {
            eLj1.FWm++;
            paramKci.Dne = (ArrayList)eLj1;
            if (!eLj1.Dne())
              Dne.remove(eLj1); 
            return oeq;
          } 
        } 
      } 
    } 
    CLK cLK = ZVw.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
    return (cLK != null && cLK.FWm > 1) ? new ZVw(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  static GgT Dne() {
    return (GgT)Dne;
  }
  
  static {
    Dne = false;
    Dne = (eLj[])new GgT((ywz)null);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dlc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */