public enum uCl {
  Zpi,
  kGO,
  Qnq,
  DyG,
  OdI,
  mrb,
  udO,
  vSL,
  bzF,
  aFZ,
  qLR,
  ATE,
  FfS,
  FWm,
  Vxn,
  oIf,
  IjH,
  ooe,
  div,
  RPx,
  XHL,
  zGp,
  EyB,
  ceE,
  trS,
  Dne("Kebab", 16, 16, 0, 0);
  
  public final int FWm;
  
  public final int Qnq;
  
  public final int bzF;
  
  public final int aFZ;
  
  public final String Dne;
  
  public static final int Dne;
  
  static {
    FWm = new uCl("Aztec", 1, "Aztec", 16, 16, 16, 0);
    bzF = new uCl("Alban", 2, "Alban", 16, 16, 32, 0);
    Qnq = new uCl("Aztec2", 3, "Aztec2", 16, 16, 48, 0);
    aFZ = new uCl("Bomb", 4, "Bomb", 16, 16, 64, 0);
    zGp = new uCl("Plant", 5, "Plant", 16, 16, 80, 0);
    DyG = new uCl("Wasteland", 6, "Wasteland", 16, 16, 96, 0);
    div = new uCl("Pool", 7, "Pool", 32, 16, 0, 32);
    IjH = new uCl("Courbet", 8, "Courbet", 32, 16, 32, 32);
    mrb = new uCl("Sea", 9, "Sea", 32, 16, 64, 32);
    XHL = new uCl("Sunset", 10, "Sunset", 32, 16, 96, 32);
    Zpi = new uCl("Creebet", 11, "Creebet", 32, 16, 128, 32);
    kGO = new uCl("Wanderer", 12, "Wanderer", 16, 32, 0, 64);
    udO = new uCl("Graham", 13, "Graham", 16, 32, 16, 64);
    ooe = new uCl("Match", 14, "Match", 32, 32, 0, 128);
    trS = new uCl("Bust", 15, "Bust", 32, 32, 32, 128);
    qLR = new uCl("Stage", 16, "Stage", 32, 32, 64, 128);
    ATE = new uCl("Void", 17, "Void", 32, 32, 96, 128);
    Vxn = new uCl("SkullAndRoses", 18, "SkullAndRoses", 32, 32, 128, 128);
    ceE = new uCl("Wither", 19, "Wither", 32, 32, 160, 128);
    EyB = new uCl("Fighters", 20, "Fighters", 64, 32, 0, 96);
    FfS = new uCl("Pointer", 21, "Pointer", 64, 64, 0, 192);
    OdI = new uCl("Pigscene", 22, "Pigscene", 64, 64, 64, 192);
    oIf = new uCl("BurningSkull", 23, "BurningSkull", 64, 64, 128, 192);
    vSL = new uCl("Skeleton", 24, "Skeleton", 64, 48, 192, 64);
    RPx = new uCl("DonkeyKong", 25, "DonkeyKong", 64, 48, 192, 112);
    Dne = (uCl)new uCl[] { 
        Dne, FWm, bzF, Qnq, aFZ, zGp, DyG, div, IjH, mrb, 
        XHL, Zpi, kGO, udO, ooe, trS, qLR, ATE, Vxn, ceE, 
        EyB, FfS, OdI, oIf, vSL, RPx };
    Dne = "SkullAndRoses".length();
  }
  
  uCl(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = (uCl)paramString1;
    this.FWm = paramInt1;
    this.bzF = paramInt2;
    this.Qnq = paramInt3;
    this.aFZ = paramInt4;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uCl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */