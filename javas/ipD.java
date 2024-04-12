import java.util.HashMap;
import java.util.Map;

public class ipD {
  protected Qnq Dne;
  
  public int Qnq;
  
  public int aFZ;
  
  public int zGp;
  
  public int DyG = -1;
  
  private static Map FWm;
  
  public zKP Dne;
  
  protected boolean FWm;
  
  private static Map Dne = new HashMap<>();
  
  static Map Dne() {
    return FWm;
  }
  
  public double Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.Qnq + 0.5D - paramDouble1;
    double d2 = this.aFZ + 0.5D - paramDouble2;
    double d3 = this.zGp + 0.5D - paramDouble3;
    return d1 * d1 + d2 * d2 + d3 * d3;
  }
  
  public void a_() {
    if (this.Dne != null) {
      this.DyG = this.Dne.bzF(this.Qnq, this.aFZ, this.zGp);
      this.Dne.FWm(this.Qnq, this.aFZ, this.zGp, this);
      if (Dne() != null)
        this.Dne.aFZ(this.Qnq, this.aFZ, this.zGp, (Dne()).FWm); 
    } 
  }
  
  public static ipD Dne(WkD paramWkD) {
    ipD ipD1 = null;
    try {
      Class<ipD> clazz = (Class)Dne.get(paramWkD.Dne("id"));
      if (clazz != null)
        ipD1 = clazz.newInstance(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (ipD1 != null) {
      ipD1.Dne(paramWkD);
    } else {
      Jwh.Dne().Dne().FWm("Skipping TileEntity with id " + paramWkD.Dne("id"));
    } 
    return ipD1;
  }
  
  public void Dne(Qnq paramQnq) {
    this.Dne = (Map)paramQnq;
  }
  
  public double a_() {
    return 4096.0D;
  }
  
  public void Dne(WkD paramWkD) {
    this.Qnq = paramWkD.Dne("x");
    this.aFZ = paramWkD.Dne("y");
    this.zGp = paramWkD.Dne("z");
  }
  
  public void Dne(Noo paramNoo) {
    paramNoo.Dne("Name", new WSD(this));
    Noo.Dne(paramNoo, this.Qnq, this.aFZ, this.zGp, (Dne()).FWm, zGp());
    paramNoo.Dne("Actual block type", new XfI(this));
    paramNoo.Dne("Actual block data value", new NTs(this));
  }
  
  public void zGp() {
    this.FWm = true;
  }
  
  public void DyG() {
    this.FWm = false;
  }
  
  public boolean Qnq() {
    return (this.Dne != null);
  }
  
  public Qnq Dne() {
    return (Qnq)this.Dne;
  }
  
  public boolean Dne(int paramInt1, int paramInt2) {
    return false;
  }
  
  public int zGp() {
    if (this.DyG == -1)
      this.DyG = this.Dne.bzF(this.Qnq, this.aFZ, this.zGp); 
    return this.DyG;
  }
  
  public void Qnq() {
    this.Dne = null;
    this.DyG = -1;
  }
  
  public boolean aFZ() {
    return this.FWm;
  }
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: getstatic ipD.FWm : Ljava/util/Map;
    //   3: aload_0
    //   4: invokevirtual getClass : ()Ljava/lang/Class;
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast java/lang/String
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull -> 50
    //   20: new java/lang/RuntimeException
    //   23: dup
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: aload_0
    //   32: invokevirtual getClass : ()Ljava/lang/Class;
    //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: ldc ' is missing a mapping! This is a bug!'
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual toString : ()Ljava/lang/String;
    //   46: invokespecial <init> : (Ljava/lang/String;)V
    //   49: athrow
    //   50: aload_1
    //   51: ldc 'id'
    //   53: aload_2
    //   54: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   57: aload_1
    //   58: ldc 'x'
    //   60: aload_0
    //   61: getfield Qnq : I
    //   64: invokevirtual Dne : (Ljava/lang/String;I)V
    //   67: aload_1
    //   68: ldc 'y'
    //   70: aload_0
    //   71: getfield aFZ : I
    //   74: invokevirtual Dne : (Ljava/lang/String;I)V
    //   77: aload_1
    //   78: ldc 'z'
    //   80: aload_0
    //   81: getfield zGp : I
    //   84: invokevirtual Dne : (Ljava/lang/String;I)V
    //   87: return
  }
  
  public void Dne() {}
  
  public zKP Dne() {
    if (this.Dne == null)
      this.Dne = (Map)zKP.Dne[this.Dne.Dne(this.Qnq, this.aFZ, this.zGp)]; 
    return (zKP)this.Dne;
  }
  
  private static void Dne(Class<?> paramClass, String paramString) {
    // Byte code:
    //   0: getstatic ipD.Dne : Ljava/util/Map;
    //   3: aload_1
    //   4: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   9: ifeq -> 39
    //   12: new java/lang/IllegalArgumentException
    //   15: dup
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: ldc 'Duplicate id: '
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_1
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual toString : ()Ljava/lang/String;
    //   35: invokespecial <init> : (Ljava/lang/String;)V
    //   38: athrow
    //   39: getstatic ipD.Dne : Ljava/util/Map;
    //   42: aload_1
    //   43: aload_0
    //   44: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: getstatic ipD.FWm : Ljava/util/Map;
    //   53: aload_0
    //   54: aload_1
    //   55: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: return
  }
  
  public NER Dne() {
    return null;
  }
  
  static {
    FWm = new HashMap<>();
    Dne(lqs.class, "Furnace");
    Dne(GON.class, "Chest");
    Dne(RPI.class, "EnderChest");
    Dne(nKy.class, "RecordPlayer");
    Dne(UTs.class, "Trap");
    Dne(BDA.class, "Dropper");
    Dne(AjG.class, "Sign");
    Dne(ySb.class, "MobSpawner");
    Dne(lDs.class, "Music");
    Dne(SoB.class, "Piston");
    Dne(zio.class, "Cauldron");
    Dne(llR.class, "EnchantTable");
    Dne(CmX.class, "Airportal");
    Dne(FgE.class, "Control");
    Dne(TpA.class, "Beacon");
    Dne(CUf.class, "Skull");
    Dne(vmD.class, "DLDetector");
    Dne(Aem.class, "Hopper");
    Dne(HFC.class, "Comparator");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ipD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */