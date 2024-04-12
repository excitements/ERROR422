import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Klb {
  private static Map Dne = new HashMap<>();
  
  public static HashMap Dne;
  
  private static Map aFZ;
  
  private static Map Qnq;
  
  private static Map bzF;
  
  private static Map FWm = new HashMap<>();
  
  private static void Dne(Class paramClass, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramClass, paramString, paramInt1);
    Dne.put(Integer.valueOf(paramInt1), new FMM(paramInt1, paramInt2, paramInt3));
  }
  
  public static int Dne(sMa paramsMa) {
    Class<?> clazz = paramsMa.getClass();
    return Qnq.containsKey(clazz) ? ((Integer)Qnq.get(clazz)).intValue() : 0;
  }
  
  public static sMa Dne(String paramString, Qnq paramQnq) {
    sMa sMa = null;
    try {
      Class<sMa> clazz = (Class)Dne.get(paramString);
      if (clazz != null)
        sMa = clazz.getConstructor(new Class[] { Qnq.class }).newInstance(new Object[] { paramQnq }); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return sMa;
  }
  
  public static sMa Dne(int paramInt, Qnq paramQnq) {
    sMa sMa = null;
    try {
      Class<sMa> clazz = Dne(paramInt);
      if (clazz != null)
        sMa = clazz.getConstructor(new Class[] { Qnq.class }).newInstance(new Object[] { paramQnq }); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (sMa == null)
      paramQnq.Dne().FWm("Skipping Entity with id " + paramInt); 
    return sMa;
  }
  
  private static void Dne(Class<?> paramClass, String paramString, int paramInt) {
    Dne.put(paramString, paramClass);
    FWm.put(paramClass, paramString);
    bzF.put(Integer.valueOf(paramInt), paramClass);
    Qnq.put(paramClass, Integer.valueOf(paramInt));
    aFZ.put(paramString, Integer.valueOf(paramInt));
  }
  
  public static sMa Dne(WkD paramWkD, Qnq paramQnq) {
    sMa sMa = null;
    if ("Minecart".equals(paramWkD.Dne("id"))) {
      switch (paramWkD.Dne("Type")) {
        case 0:
          paramWkD.Dne("id", "MinecartRideable");
          break;
        case 1:
          paramWkD.Dne("id", "MinecartChest");
          break;
        case 2:
          paramWkD.Dne("id", "MinecartFurnace");
          break;
      } 
      paramWkD.Dne("Type");
    } 
    try {
      Class<sMa> clazz = (Class)Dne.get(paramWkD.Dne("id"));
      if (clazz != null)
        sMa = clazz.getConstructor(new Class[] { Qnq.class }).newInstance(new Object[] { paramQnq }); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (sMa != null) {
      sMa.Qnq(paramWkD);
    } else {
      paramQnq.Dne().FWm("Skipping Entity with id " + paramWkD.Dne("id"));
    } 
    return sMa;
  }
  
  static {
    bzF = new HashMap<>();
    Qnq = new HashMap<>();
    aFZ = new HashMap<>();
    Dne = new LinkedHashMap<>();
    Dne(JiM.class, "Item", 1);
    Dne(alg.class, "XPOrb", 2);
    Dne(JCd.class, "Painting", 9);
    Dne(hhc.class, "Arrow", 10);
    Dne(KXX.class, "Snowball", 11);
    Dne(iis.class, "Fireball", 12);
    Dne(Xzh.class, "SmallFireball", 13);
    Dne(Hhj.class, "ThrownEnderpearl", 14);
    Dne(UMP.class, "EyeOfEnderSignal", 15);
    Dne(YgL.class, "ThrownPotion", 16);
    Dne(AEw.class, "ThrownExpBottle", 17);
    Dne(BPY.class, "ItemFrame", 18);
    Dne(YCH.class, "WitherSkull", 19);
    Dne(gqg.class, "PrimedTnt", 20);
    Dne(CiF.class, "FallingSand", 21);
    Dne(zMx.class, "FireworksRocketEntity", 22);
    Dne(iMX.class, "Boat", 41);
    Dne(FdF.class, "MinecartRideable", 42);
    Dne(bnY.class, "MinecartChest", 43);
    Dne(tVV.class, "MinecartFurnace", 44);
    Dne(Art.class, "MinecartTNT", 45);
    Dne(klq.class, "MinecartHopper", 46);
    Dne(sry.class, "MinecartSpawner", 47);
    Dne(FUH.class, "Mob", 48);
    Dne(LHi.class, "Monster", 49);
    Dne(gls.class, "Creeper", 50, 894731, 0);
    Dne(yXX.class, "Skeleton", 51, 12698049, 4802889);
    Dne(osi.class, "Spider", 52, 3419431, 11013646);
    Dne(ZFJ.class, "Giant", 53);
    Dne(zxd.class, "Zombie", 54, 44975, 7969893);
    Dne(Tgj.class, "Slime", 55, 5349438, 8306542);
    Dne(VAd.class, "Ghast", 56, 16382457, 12369084);
    Dne(eBi.class, "PigZombie", 57, 15373203, 5009705);
    Dne(iGp.class, "Enderman", 58, 1447446, 0);
    Dne(PGM.class, "CaveSpider", 59, 803406, 11013646);
    Dne(zTy.class, "Silverfish", 60, 7237230, 3158064);
    Dne(hlo.class, "Blaze", 61, 16167425, 16775294);
    Dne(WDT.class, "LavaSlime", 62, 3407872, 16579584);
    Dne(WSC.class, "EnderDragon", 63);
    Dne(DhB.class, "WitherBoss", 64);
    Dne(oaw.class, "Bat", 65, 4996656, 986895);
    Dne(bVr.class, "Witch", 66, 3407872, 5349438);
    Dne(fNv.class, "Pig", 90, 15771042, 14377823);
    Dne(Pvd.class, "Sheep", 91, 15198183, 16758197);
    Dne(wBN.class, "Cow", 92, 4470310, 10592673);
    Dne(GRq.class, "Chicken", 93, 10592673, 16711680);
    Dne(Xxe.class, "Squid", 94, 2243405, 7375001);
    Dne(oEB.class, "Wolf", 95, 14144467, 13545366);
    Dne(Ahh.class, "MushroomCow", 96, 10489616, 12040119);
    Dne(wao.class, "SnowMan", 97);
    Dne(kQo.class, "Ozelot", 98, 15720061, 5653556);
    Dne(CDE.class, "VillagerGolem", 99);
    Dne(pjB.class, "Villager", 120, 5651507, 12422002);
    Dne(Ndk.class, "EnderCrystal", 200);
    Dne(fxJ.class, "ERR422", -1);
  }
  
  public static String Dne(int paramInt) {
    Class clazz = Dne(paramInt);
    return (clazz != null) ? (String)FWm.get(clazz) : null;
  }
  
  public static String Dne(sMa paramsMa) {
    return (String)FWm.get(paramsMa.getClass());
  }
  
  public static Class Dne(int paramInt) {
    return (Class)bzF.get(Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Klb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */