public class zBn {
  private float Dne;
  
  public static zBn mrb;
  
  public static zBn div;
  
  public static zBn bzF;
  
  private boolean Qnq;
  
  private boolean bzF;
  
  public static zBn Qnq;
  
  public static zBn IjH;
  
  public static zBn FWm;
  
  private boolean Dne;
  
  private boolean FWm = false;
  
  public static zBn kGO;
  
  private boolean aFZ;
  
  public static zBn Zpi;
  
  public static zBn Dne = (new zBn("inFire")).aFZ();
  
  public String Dne = Character.MIN_VALUE;
  
  public static zBn aFZ;
  
  private boolean zGp;
  
  private boolean DyG;
  
  public static zBn DyG;
  
  public static zBn XHL;
  
  public static zBn zGp;
  
  public static zBn udO;
  
  protected zBn aFZ() {
    this.bzF = true;
    return this;
  }
  
  public static zBn Dne(Tdr paramTdr, sMa paramsMa) {
    return (paramsMa == null) ? (new CpP("onFire", paramTdr, paramTdr)).aFZ().Dne() : (new CpP("fireball", paramTdr, paramsMa)).aFZ().Dne();
  }
  
  public float Dne() {
    return this.Dne;
  }
  
  public boolean FWm() {
    return this.DyG;
  }
  
  public boolean bzF() {
    return this.Dne;
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public sMa FWm() {
    return null;
  }
  
  public boolean Dne() {
    return this.Qnq;
  }
  
  public static zBn Dne(FUH paramFUH) {
    return new Kgw("mob", paramFUH);
  }
  
  protected zBn Qnq() {
    this.FWm = true;
    return this;
  }
  
  static {
    FWm = (new zBn("onFire")).bzF().aFZ();
    bzF = (new zBn("lava")).aFZ();
    Qnq = (new zBn("inWall")).bzF();
    aFZ = (new zBn("drown")).bzF();
    zGp = (new zBn("starve")).bzF();
    DyG = new zBn("cactus");
    div = (new zBn("fall")).bzF();
    IjH = (new zBn("outOfWorld")).bzF().Qnq();
    mrb = (new zBn("generic")).bzF();
    XHL = (new zBn("magic")).bzF().DyG();
    Zpi = (new zBn("wither")).bzF();
    kGO = new zBn("anvil");
    udO = new zBn("fallingBlock");
  }
  
  public static zBn Dne(sMa paramsMa) {
    return (new Kgw("thorns", paramsMa)).DyG();
  }
  
  public String Dne(FUH paramFUH) {
    FUH fUH = paramFUH.Qnq();
    String str1 = "death.attack." + this.Dne;
    String str2 = str1 + ".player";
    return (fUH != null && KGL.Dne(str2)) ? KGL.Dne(str2, new Object[] { paramFUH.aFZ(), fUH.aFZ() }) : KGL.Dne(str1, new Object[] { paramFUH.aFZ() });
  }
  
  protected zBn bzF() {
    this.Dne = '\001';
    this.Dne = 0.0F;
    return this;
  }
  
  public boolean aFZ() {
    return this.bzF;
  }
  
  public static zBn FWm(sMa paramsMa1, sMa paramsMa2) {
    return (new CpP("indirectMagic", paramsMa1, paramsMa2)).bzF().DyG();
  }
  
  public boolean DyG() {
    return this.zGp;
  }
  
  public static zBn Dne(yTR paramyTR) {
    return (paramyTR != null && paramyTR.Dne() != null) ? (new Kgw("explosion.player", paramyTR.Dne())).zGp().FWm() : (new zBn("explosion")).zGp().FWm();
  }
  
  public boolean zGp() {
    return this.aFZ;
  }
  
  protected zBn(String paramString) {
    this.Dne = 0.3F;
    this.zGp = false;
    this.DyG = false;
    this.Dne = paramString;
  }
  
  public static zBn Dne(hhc paramhhc, sMa paramsMa) {
    return (new CpP("arrow", paramhhc, paramsMa)).Dne();
  }
  
  public zBn Dne() {
    this.Qnq = true;
    return this;
  }
  
  public zBn DyG() {
    this.zGp = true;
    return this;
  }
  
  public zBn FWm() {
    this.DyG = true;
    return this;
  }
  
  public static zBn Dne(FiG paramFiG) {
    return new Kgw("player", paramFiG);
  }
  
  public sMa Dne() {
    return FWm();
  }
  
  public zBn zGp() {
    this.aFZ = true;
    return this;
  }
  
  public boolean Qnq() {
    return this.FWm;
  }
  
  public static zBn Dne(sMa paramsMa1, sMa paramsMa2) {
    return (new CpP("thrown", paramsMa1, paramsMa2)).Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zBn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */