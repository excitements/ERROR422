import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class trP {
  public static RLC Qnq;
  
  private static boolean FWm;
  
  public static RLC udO;
  
  public static RLC XHL;
  
  private static boolean Dne;
  
  public static RLC qLR;
  
  public static RLC bzF;
  
  public static RLC[] Qnq;
  
  public static RLC DyG;
  
  public static RLC ceE;
  
  public static List Dne;
  
  public static RLC ooe;
  
  public static RLC div;
  
  public static RLC Dne;
  
  public static RLC aFZ;
  
  public static RLC EyB;
  
  public static RLC kGO;
  
  protected static Map Dne = new HashMap<>();
  
  public static RLC[] bzF;
  
  public static RLC OdI;
  
  public static RLC[] Dne;
  
  public static RLC Zpi;
  
  public static RLC FfS;
  
  public static RLC zGp;
  
  public static RLC[] FWm;
  
  public static RLC mrb;
  
  public static List FWm;
  
  public static List Qnq;
  
  public static RLC IjH;
  
  public static RLC FWm;
  
  public static List bzF;
  
  public static RLC ATE;
  
  public static RLC Vxn;
  
  public static RLC trS;
  
  private static void Dne(RLC[] paramArrayOfRLC, int paramInt1, int paramInt2) {
    if (paramArrayOfRLC[paramInt1] != null && paramArrayOfRLC[paramInt2] == null) {
      paramArrayOfRLC[paramInt2] = paramArrayOfRLC[paramInt1];
    } else {
      Dne.remove(paramArrayOfRLC[paramInt1]);
      Qnq.remove(paramArrayOfRLC[paramInt1]);
      FWm.remove(paramArrayOfRLC[paramInt1]);
      paramArrayOfRLC[paramInt1] = paramArrayOfRLC[paramInt2];
    } 
  }
  
  public static void bzF() {
    bzF = (List)Dne((RLC[])bzF, "stat.useItem", 16908288, 256, 32000);
    Qnq = (List)FWm((RLC[])Qnq, "stat.breakItem", 16973824, 256, 32000);
    FWm = true;
    Qnq();
  }
  
  static {
    Dne = (RLC[])new ArrayList();
    FWm = (RLC)new ArrayList();
    bzF = new ArrayList();
    Qnq = new ArrayList();
    Dne = (RLC[])(new gJC(1000, "stat.startGame")).FWm().Dne();
    FWm = (new gJC(1001, "stat.createWorld")).FWm().Dne();
    bzF = (List)(new gJC(1002, "stat.loadWorld")).FWm().Dne();
    Qnq = (List)(new gJC(1003, "stat.joinMultiplayer")).FWm().Dne();
    aFZ = (new gJC(1004, "stat.leaveGame")).FWm().Dne();
    zGp = (new gJC(1100, "stat.playOneMinute", (DOt)RLC.FWm)).FWm().Dne();
    DyG = (new gJC(2000, "stat.walkOneCm", RLC.bzF)).FWm().Dne();
    div = (new gJC(2001, "stat.swimOneCm", RLC.bzF)).FWm().Dne();
    IjH = (new gJC(2002, "stat.fallOneCm", RLC.bzF)).FWm().Dne();
    mrb = (new gJC(2003, "stat.climbOneCm", RLC.bzF)).FWm().Dne();
    XHL = (new gJC(2004, "stat.flyOneCm", RLC.bzF)).FWm().Dne();
    Zpi = (new gJC(2005, "stat.diveOneCm", RLC.bzF)).FWm().Dne();
    kGO = (new gJC(2006, "stat.minecartOneCm", RLC.bzF)).FWm().Dne();
    udO = (new gJC(2007, "stat.boatOneCm", RLC.bzF)).FWm().Dne();
    ooe = (new gJC(2008, "stat.pigOneCm", RLC.bzF)).FWm().Dne();
    trS = (new gJC(2010, "stat.jump")).FWm().Dne();
    qLR = (new gJC(2011, "stat.drop")).FWm().Dne();
    ATE = (new gJC(2020, "stat.damageDealt")).Dne();
    Vxn = (new gJC(2021, "stat.damageTaken")).Dne();
    ceE = (new gJC(2022, "stat.deaths")).Dne();
    EyB = (new gJC(2023, "stat.mobKills")).Dne();
    FfS = (new gJC(2024, "stat.playerKills")).Dne();
    OdI = (new gJC(2025, "stat.fishCaught")).Dne();
    Dne = Dne("stat.mineBlock", 16777216);
    qlg.Dne();
    Dne = false;
    FWm = false;
  }
  
  private static RLC[] FWm(RLC[] paramArrayOfRLC, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfRLC == null)
      paramArrayOfRLC = new RLC[32000]; 
    for (int i = paramInt2; i < paramInt3; i++) {
      if (dEr.Dne[i] != null && dEr.Dne[i].DyG()) {
        String str = KGL.Dne(paramString, new Object[] { dEr.Dne[i].bzF() });
        paramArrayOfRLC[i] = (new isy(paramInt1 + i, str, i)).Dne();
      } 
    } 
    Dne(paramArrayOfRLC);
    return paramArrayOfRLC;
  }
  
  public static void Qnq() {
    if (Dne != null && FWm != null) {
      HashSet<Integer> hashSet = new HashSet();
      for (iQt iQt : aXt.Dne().Dne()) {
        if (iQt.Dne() != null)
          hashSet.add(Integer.valueOf((iQt.Dne()).bzF)); 
      } 
      for (NMq nMq : cTN.Dne().Dne().values())
        hashSet.add(Integer.valueOf(nMq.bzF)); 
      FWm = (RLC)new RLC[32000];
      for (Integer integer : hashSet) {
        if (dEr.Dne[integer.intValue()] != null) {
          String str = KGL.Dne("stat.craftItem", new Object[] { dEr.Dne[integer.intValue()].bzF() });
          FWm[integer.intValue()] = (new isy(16842752 + integer.intValue(), str, integer.intValue())).Dne();
        } 
      } 
      Dne((RLC[])FWm);
    } 
  }
  
  public static void FWm() {
    bzF = (List)Dne((RLC[])bzF, "stat.useItem", 16908288, 0, 256);
    Qnq = (List)FWm((RLC[])Qnq, "stat.breakItem", 16973824, 0, 256);
    Dne = true;
    Qnq();
  }
  
  private static RLC[] Dne(String paramString, int paramInt) {
    RLC[] arrayOfRLC = new RLC[256];
    for (byte b = 0; b < 'Ā'; b++) {
      if (zKP.Dne[b] != null && zKP.Dne[b].XHL()) {
        String str = KGL.Dne(paramString, new Object[] { zKP.Dne[b].FWm() });
        arrayOfRLC[b] = (new isy(paramInt + b, str, b)).Dne();
        Qnq.add((isy)arrayOfRLC[b]);
      } 
    } 
    Dne(arrayOfRLC);
    return arrayOfRLC;
  }
  
  public static RLC Dne(int paramInt) {
    return (RLC)Dne.get(Integer.valueOf(paramInt));
  }
  
  public static void Dne() {}
  
  private static void Dne(RLC[] paramArrayOfRLC) {
    Dne(paramArrayOfRLC, ((zKP)zKP.DyG).FWm, ((byt)zKP.Dne).FWm);
    Dne(paramArrayOfRLC, ((zKP)zKP.div).FWm, ((zKP)zKP.div).FWm);
    Dne(paramArrayOfRLC, zKP.XwR.FWm, zKP.aJO.FWm);
    Dne(paramArrayOfRLC, zKP.qrB.FWm, zKP.haP.FWm);
    Dne(paramArrayOfRLC, zKP.exS.FWm, zKP.JLG.FWm);
    Dne(paramArrayOfRLC, ((xui)zKP.FWm).FWm, ((xui)zKP.Dne).FWm);
    Dne(paramArrayOfRLC, zKP.CZC.FWm, zKP.iNQ.FWm);
    Dne(paramArrayOfRLC, ((hbe)zKP.Qnq).FWm, zKP.bzF.FWm);
    Dne(paramArrayOfRLC, zKP.Dne.FWm, ((dNT)zKP.FWm).FWm);
    Dne(paramArrayOfRLC, zKP.bzF.FWm, ((dNT)zKP.Qnq).FWm);
    Dne(paramArrayOfRLC, ((ZQN)zKP.Dne).FWm, zKP.FWm.FWm);
    Dne(paramArrayOfRLC, zKP.rPc.FWm, zKP.FWm.FWm);
  }
  
  private static RLC[] Dne(RLC[] paramArrayOfRLC, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfRLC == null)
      paramArrayOfRLC = new RLC[32000]; 
    for (int i = paramInt2; i < paramInt3; i++) {
      if (dEr.Dne[i] != null) {
        String str = KGL.Dne(paramString, new Object[] { dEr.Dne[i].bzF() });
        paramArrayOfRLC[i] = (new isy(paramInt1 + i, str, i)).Dne();
        if (i >= 256)
          bzF.add((isy)paramArrayOfRLC[i]); 
      } 
    } 
    Dne(paramArrayOfRLC);
    return paramArrayOfRLC;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\trP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */