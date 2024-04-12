public class xoY {
  private int FWm;
  
  private boolean zGp;
  
  private long aFZ;
  
  private kGO Dne;
  
  private WkD Dne;
  
  private long FWm;
  
  private int aFZ;
  
  private int zGp;
  
  private aSc Dne;
  
  private String FWm;
  
  private long Dne;
  
  private int bzF;
  
  private XHL Dne;
  
  private boolean Dne;
  
  private int DyG;
  
  private long Qnq;
  
  private int Dne;
  
  private boolean FWm;
  
  private long bzF;
  
  private boolean aFZ;
  
  private int Qnq;
  
  private String Dne = kGO.Dne;
  
  private boolean bzF;
  
  private boolean Qnq;
  
  static int DyG(xoY paramxoY) {
    return paramxoY.DyG;
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
  
  public WkD FWm() {
    return (WkD)this.Dne;
  }
  
  public boolean bzF() {
    return this.bzF;
  }
  
  public int aFZ() {
    return this.aFZ;
  }
  
  public String Dne() {
    return this.FWm;
  }
  
  public boolean aFZ() {
    return this.aFZ;
  }
  
  public WkD Dne() {
    WkD wkD = new WkD();
    Dne(wkD, (WkD)this.Dne);
    return wkD;
  }
  
  public int Qnq() {
    return this.Qnq;
  }
  
  public kGO Dne() {
    return (kGO)this.Dne;
  }
  
  public void Dne(kGO paramkGO) {
    this.Dne = (String)paramkGO;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  public void bzF(boolean paramBoolean) {
    this.zGp = paramBoolean;
  }
  
  static boolean FWm(xoY paramxoY) {
    return paramxoY.Dne;
  }
  
  public long bzF() {
    return this.bzF;
  }
  
  static boolean Qnq(xoY paramxoY) {
    return paramxoY.Qnq;
  }
  
  public void Qnq(int paramInt) {
    this.aFZ = paramInt;
  }
  
  static int zGp(xoY paramxoY) {
    return paramxoY.zGp;
  }
  
  protected xoY() {
    this.Dne = "";
    this.Dne = (String)new aSc();
  }
  
  public xoY(xoY paramxoY) {
    this.Dne = "";
    this.Dne = (String)new aSc();
    this.Dne = paramxoY.Dne;
    this.Dne = paramxoY.Dne;
    this.Dne = paramxoY.Dne;
    this.Dne = paramxoY.Dne;
    this.bzF = paramxoY.bzF;
    this.Dne = paramxoY.Dne;
    this.FWm = paramxoY.FWm;
    this.bzF = paramxoY.bzF;
    this.FWm = paramxoY.FWm;
    this.bzF = paramxoY.bzF;
    this.Qnq = paramxoY.Qnq;
    this.aFZ = paramxoY.aFZ;
    this.Dne = paramxoY.Dne;
    this.Qnq = paramxoY.Qnq;
    this.FWm = paramxoY.FWm;
    this.aFZ = paramxoY.aFZ;
    this.zGp = paramxoY.zGp;
    this.Dne = paramxoY.Dne;
    this.DyG = paramxoY.DyG;
    this.FWm = paramxoY.FWm;
    this.Qnq = paramxoY.Qnq;
    this.aFZ = paramxoY.aFZ;
    this.zGp = paramxoY.zGp;
    this.Dne = paramxoY.Dne;
  }
  
  public xoY(WkD paramWkD) {
    this.Dne = "";
    this.Dne = (String)new aSc();
    this.Dne = paramWkD.Dne("RandomSeed");
    if (paramWkD.Dne("generatorName")) {
      String str = paramWkD.Dne("generatorName");
      this.Dne = (String)kGO.Dne(str);
      if (this.Dne == null) {
        this.Dne = kGO.Dne;
      } else if (this.Dne.FWm()) {
        int i = 0;
        if (paramWkD.Dne("generatorVersion"))
          i = paramWkD.Dne("generatorVersion"); 
        this.Dne = (String)this.Dne.Dne(i);
      } 
      if (paramWkD.Dne("generatorOptions"))
        this.Dne = paramWkD.Dne("generatorOptions"); 
    } 
    this.Dne = (String)XHL.Dne(paramWkD.Dne("GameType"));
    if (paramWkD.Dne("MapFeatures")) {
      this.bzF = paramWkD.FWm("MapFeatures");
    } else {
      this.bzF = true;
    } 
    this.Dne = paramWkD.Dne("SpawnX");
    this.FWm = paramWkD.Dne("SpawnY");
    this.bzF = paramWkD.Dne("SpawnZ");
    this.FWm = paramWkD.Dne("Time");
    if (paramWkD.Dne("DayTime")) {
      this.bzF = paramWkD.Dne("DayTime");
    } else {
      this.bzF = this.FWm;
    } 
    this.Qnq = paramWkD.Dne("LastPlayed");
    this.aFZ = paramWkD.Dne("SizeOnDisk");
    this.FWm = paramWkD.Dne("LevelName");
    this.aFZ = paramWkD.Dne("version");
    this.zGp = paramWkD.Dne("rainTime");
    this.Dne = paramWkD.FWm("raining");
    this.DyG = paramWkD.Dne("thunderTime");
    this.FWm = paramWkD.FWm("thundering");
    this.Qnq = paramWkD.FWm("hardcore");
    if (paramWkD.Dne("initialized")) {
      this.zGp = paramWkD.FWm("initialized");
    } else {
      this.zGp = 1;
    } 
    if (paramWkD.Dne("allowCommands")) {
      this.aFZ = paramWkD.FWm("allowCommands");
    } else {
      this.aFZ = (this.Dne == XHL.bzF);
    } 
    if (paramWkD.Dne("Player")) {
      this.Dne = (String)paramWkD.Dne("Player");
      this.Qnq = this.Dne.Dne("Dimension");
    } 
    if (paramWkD.Dne("GameRules"))
      this.Dne.Dne(paramWkD.Dne("GameRules")); 
  }
  
  static int bzF(xoY paramxoY) {
    return paramxoY.bzF;
  }
  
  public boolean FWm() {
    return this.Dne;
  }
  
  public void FWm(int paramInt) {
    this.FWm = paramInt;
  }
  
  public int DyG() {
    return this.zGp;
  }
  
  static boolean aFZ(xoY paramxoY) {
    return paramxoY.aFZ;
  }
  
  public int zGp() {
    return this.DyG;
  }
  
  static boolean Dne(xoY paramxoY) {
    return paramxoY.bzF;
  }
  
  public void Dne(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  static long FWm(xoY paramxoY) {
    return paramxoY.bzF;
  }
  
  static String Dne(xoY paramxoY) {
    return paramxoY.Dne;
  }
  
  public aSc Dne() {
    return (aSc)this.Dne;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public XHL Dne() {
    return (XHL)this.Dne;
  }
  
  static long Dne(xoY paramxoY) {
    return paramxoY.FWm;
  }
  
  public long Qnq() {
    return this.aFZ;
  }
  
  public boolean Qnq() {
    return this.Qnq;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void zGp(int paramInt) {
    this.zGp = paramInt;
  }
  
  static int FWm(xoY paramxoY) {
    return paramxoY.FWm;
  }
  
  public void Dne(Noo paramNoo) {
    paramNoo.Dne("Level seed", new MFa(this));
    paramNoo.Dne("Level generator", new DXs(this));
    paramNoo.Dne("Level generator options", new mAp(this));
    paramNoo.Dne("Level spawn location", new sSx(this));
    paramNoo.Dne("Level time", new OKy(this));
    paramNoo.Dne("Level dimension", new wdk(this));
    paramNoo.Dne("Level storage version", new mtR(this));
    paramNoo.Dne("Level weather", new isf(this));
    paramNoo.Dne("Level game mode", new tYR(this));
  }
  
  public void FWm(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void Dne(String paramString) {
    this.FWm = paramString;
  }
  
  public long Dne() {
    return this.Dne;
  }
  
  public boolean zGp() {
    return this.zGp;
  }
  
  private void Dne(WkD paramWkD1, WkD paramWkD2) {
    paramWkD1.Dne("RandomSeed", this.Dne);
    paramWkD1.Dne("generatorName", this.Dne.Dne());
    paramWkD1.Dne("generatorVersion", this.Dne.Dne());
    paramWkD1.Dne("generatorOptions", this.Dne);
    paramWkD1.Dne("GameType", this.Dne.Dne());
    paramWkD1.Dne("MapFeatures", this.bzF);
    paramWkD1.Dne("SpawnX", this.Dne);
    paramWkD1.Dne("SpawnY", this.FWm);
    paramWkD1.Dne("SpawnZ", this.bzF);
    paramWkD1.Dne("Time", this.FWm);
    paramWkD1.Dne("DayTime", this.bzF);
    paramWkD1.Dne("SizeOnDisk", this.aFZ);
    paramWkD1.Dne("LastPlayed", System.currentTimeMillis());
    paramWkD1.Dne("LevelName", this.FWm);
    paramWkD1.Dne("version", this.aFZ);
    paramWkD1.Dne("rainTime", this.zGp);
    paramWkD1.Dne("raining", this.Dne);
    paramWkD1.Dne("thunderTime", this.DyG);
    paramWkD1.Dne("thundering", this.FWm);
    paramWkD1.Dne("hardcore", this.Qnq);
    paramWkD1.Dne("allowCommands", this.aFZ);
    paramWkD1.Dne("initialized", this.zGp);
    paramWkD1.Dne("GameRules", this.Dne.Dne());
    if (paramWkD2 != null)
      paramWkD1.Dne("Player", paramWkD2); 
  }
  
  static int Dne(xoY paramxoY) {
    return paramxoY.Dne;
  }
  
  public xoY(mrb parammrb, String paramString) {
    this.Dne = "";
    this.Dne = (String)new aSc();
    this.Dne = parammrb.Dne();
    this.Dne = (String)parammrb.Dne();
    this.bzF = parammrb.bzF();
    this.FWm = paramString;
    this.Qnq = parammrb.FWm();
    this.Dne = (String)parammrb.Dne();
    this.Dne = parammrb.Dne();
    this.aFZ = parammrb.Qnq();
    this.zGp = 0;
  }
  
  public void Dne(XHL paramXHL) {
    this.Dne = (String)paramXHL;
  }
  
  public long FWm() {
    return this.FWm;
  }
  
  public void Dne(long paramLong) {
    this.FWm = paramLong;
  }
  
  static XHL Dne(xoY paramxoY) {
    return (XHL)paramxoY.Dne;
  }
  
  public long aFZ() {
    return this.Qnq;
  }
  
  static kGO Dne(xoY paramxoY) {
    return (kGO)paramxoY.Dne;
  }
  
  public String FWm() {
    return this.Dne;
  }
  
  public boolean Dne() {
    return this.FWm;
  }
  
  public WkD Dne(WkD paramWkD) {
    WkD wkD = new WkD();
    Dne(wkD, paramWkD);
    return wkD;
  }
  
  static boolean bzF(xoY paramxoY) {
    return paramxoY.FWm;
  }
  
  public void FWm(long paramLong) {
    this.bzF = paramLong;
  }
  
  static int Qnq(xoY paramxoY) {
    return paramxoY.Qnq;
  }
  
  public void aFZ(int paramInt) {
    this.DyG = paramInt;
  }
  
  public void bzF(int paramInt) {
    this.bzF = paramInt;
  }
  
  static int aFZ(xoY paramxoY) {
    return paramxoY.aFZ;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xoY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */