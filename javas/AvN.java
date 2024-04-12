import java.util.List;
import java.util.Random;

public class AvN extends dEr {
  public static final String[] Dne = new String[] { 
      "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", 
      "lime", "yellow", "lightBlue", "magenta", "orange", "white" };
  
  public static final int[] Dne;
  
  private gDn[] Dne;
  
  public static final String[] FWm = new String[] { 
      "dyePowder_black", "dyePowder_red", "dyePowder_green", "dyePowder_brown", "dyePowder_blue", "dyePowder_purple", "dyePowder_cyan", "dyePowder_silver", "dyePowder_gray", "dyePowder_pink", 
      "dyePowder_lime", "dyePowder_yellow", "dyePowder_lightBlue", "dyePowder_magenta", "dyePowder_orange", "dyePowder_white" };
  
  public String Dne(NMq paramNMq) {
    int i = geR.Dne(paramNMq.Qnq(), 0, 15);
    return FWm() + "." + Dne[i];
  }
  
  public gDn Dne(int paramInt) {
    int i = geR.Dne(paramInt, 0, 15);
    return this.Dne[i];
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[FWm.length];
    for (byte b = 0; b < FWm.length; b++)
      this.Dne[b] = paramRbp.Dne(FWm[b]); 
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    for (byte b = 0; b < 16; b++)
      paramList.add(new NMq(paramInt, 1, b)); 
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    if (paramNMq.Qnq() == 15) {
      if (Dne(paramNMq, paramQnq, paramInt1, paramInt2, paramInt3)) {
        if (paramQnq.aFZ == null)
          paramQnq.Qnq(2005, paramInt1, paramInt2, paramInt3, 0); 
        return true;
      } 
    } else if (paramNMq.Qnq() == 3) {
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if (i == zKP.udO.FWm && Tkf.bzF(j) == 3) {
        if (paramInt4 == 0)
          return false; 
        if (paramInt4 == 1)
          return false; 
        if (paramInt4 == 2)
          paramInt3--; 
        if (paramInt4 == 3)
          paramInt3++; 
        if (paramInt4 == 4)
          paramInt1--; 
        if (paramInt4 == 5)
          paramInt1++; 
        if (paramQnq.Dne(paramInt1, paramInt2, paramInt3)) {
          int k = zKP.Dne[zKP.Woy.FWm].Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, 0);
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.Woy.FWm, k, 2);
          if (!((uqg)paramFiG.Dne).Qnq)
            paramNMq.Dne--; 
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public static boolean Dne(NMq paramNMq, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (i == zKP.aFZ.FWm) {
      if (paramQnq.aFZ == null) {
        if (paramQnq.Dne.nextFloat() < 0.45D)
          ((vHj)zKP.aFZ).bzF(paramQnq, paramInt1, paramInt2, paramInt3, (Random)paramQnq.Dne); 
        paramNMq.Dne--;
      } 
      return true;
    } 
    if (i != zKP.bzF.FWm && i != ((hbe)zKP.Qnq).FWm) {
      if (i != zKP.MUD.FWm && i != zKP.LDH.FWm) {
        if (i > 0 && zKP.Dne[i] instanceof MdS) {
          if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 7)
            return false; 
          if (paramQnq.aFZ == null) {
            ((MdS)zKP.Dne[i]).bzF(paramQnq, paramInt1, paramInt2, paramInt3);
            paramNMq.Dne--;
          } 
          return true;
        } 
        if (i == zKP.Woy.FWm) {
          int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
          int k = kbN.Qnq(j);
          int m = Lsq.c_(j);
          if (m >= 2)
            return false; 
          if (paramQnq.aFZ == null) {
            paramQnq.Dne(paramInt1, paramInt2, paramInt3, ++m << 2 | k, 2);
            paramNMq.Dne--;
          } 
          return true;
        } 
        if (i != ((ZQN)zKP.Dne).FWm)
          return false; 
        if (paramQnq.aFZ == null) {
          paramNMq.Dne--;
          byte b;
          label66: for (b = 0; b < ''; b++) {
            int j = paramInt1;
            int k = paramInt2 + 1;
            int m = paramInt3;
            byte b1 = 0;
            while (b1 < b / 16) {
              j += Dne.nextInt(3) - 1;
              k += (Dne.nextInt(3) - 1) * Dne.nextInt(3) / 2;
              m += Dne.nextInt(3) - 1;
              if (paramQnq.Dne(j, k - 1, m) == ((ZQN)zKP.Dne).FWm) {
                if (paramQnq.DyG(j, k, m))
                  continue label66; 
                b1++;
                continue;
              } 
              continue label66;
            } 
            if (paramQnq.Dne(j, k, m) == 0)
              if (Dne.nextInt(10) != 0) {
                if (zKP.Dne.a_(paramQnq, j, k, m))
                  paramQnq.FWm(j, k, m, ((Tte)zKP.Dne).FWm, 1, 3); 
              } else if (Dne.nextInt(3) != 0) {
                if (zKP.Dne.a_(paramQnq, j, k, m))
                  paramQnq.FWm(j, k, m, ((hbe)zKP.Dne).FWm); 
              } else if (zKP.FWm.a_(paramQnq, j, k, m)) {
                paramQnq.FWm(j, k, m, zKP.FWm.FWm);
              }  
          } 
        } 
        return true;
      } 
      if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 7)
        return false; 
      if (paramQnq.aFZ == null) {
        ((ScM)zKP.Dne[i]).bzF(paramQnq, paramInt1, paramInt2, paramInt3);
        paramNMq.Dne--;
      } 
      return true;
    } 
    if (paramQnq.aFZ == null) {
      if (paramQnq.Dne.nextFloat() < 0.4D)
        ((gCn)zKP.Dne[i]).Dne(paramQnq, paramInt1, paramInt2, paramInt3, (Random)paramQnq.Dne); 
      paramNMq.Dne--;
    } 
    return true;
  }
  
  static {
    Dne = (gDn[])new int[] { 
        1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 
        4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
  }
  
  public static void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (paramInt4 == 0)
      paramInt4 = 15; 
    dNT dNT = (i > 0 && i < zKP.Dne.length) ? zKP.Dne[i] : null;
    if (dNT != null) {
      dNT.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
      for (byte b = 0; b < paramInt4; b++) {
        double d1 = Dne.nextGaussian() * 0.02D;
        double d2 = Dne.nextGaussian() * 0.02D;
        double d3 = Dne.nextGaussian() * 0.02D;
        paramQnq.Dne("happyVillager", (paramInt1 + Dne.nextFloat()), paramInt2 + Dne.nextFloat() * dNT.Qnq(), (paramInt3 + Dne.nextFloat()), d1, d2, d3);
      } 
    } 
  }
  
  public AvN(int paramInt) {
    super(paramInt);
    Dne(true);
    FWm(0);
    Dne(JcN.XHL);
  }
  
  public boolean Dne(NMq paramNMq, FUH paramFUH) {
    if (paramFUH instanceof Pvd) {
      Pvd pvd = (Pvd)paramFUH;
      int i = Imc.b_(paramNMq.Qnq());
      if (!pvd.LVR() && pvd.qLR() != i) {
        pvd.kGO(i);
        paramNMq.Dne--;
      } 
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AvN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */