public class SXd {
  public static final SXd Vxn;
  
  public static final SXd div;
  
  public static final SXd oIf;
  
  public static final SXd OdI;
  
  public static final SXd RPx;
  
  public static final SXd udO;
  
  public static final SXd aFZ;
  
  private int FWm;
  
  private double Dne;
  
  public static final SXd ceE;
  
  public static final SXd qLR;
  
  public static final SXd XHL;
  
  public final int Dne;
  
  public static final SXd Dne;
  
  public static final SXd qXo;
  
  public static final SXd ATE;
  
  public static final SXd Qnq;
  
  public static final SXd zGp;
  
  public static final SXd DyG;
  
  public static final SXd IjH;
  
  public static final SXd FfS;
  
  private final boolean Dne;
  
  public static final SXd mrb;
  
  public static final SXd vSL;
  
  public static final SXd yMz;
  
  public static final SXd Zpi;
  
  public static final SXd AgF;
  
  public static final SXd trS;
  
  public static final SXd Fnk;
  
  public static final SXd[] Dne = new SXd[32];
  
  private final int bzF;
  
  public static final SXd FWm;
  
  public static final SXd EyB;
  
  public static final SXd ooe;
  
  public static final SXd gnI;
  
  public static final SXd bzF;
  
  public static final SXd tgc;
  
  public static final SXd kGO;
  
  private boolean FWm = true;
  
  private String Dne = "";
  
  public boolean Dne() {
    return false;
  }
  
  public boolean Dne(int paramInt1, int paramInt2) {
    if (this.Dne != XHL.Dne && this.Dne != ceE.Dne) {
      if (this.Dne == EyB.Dne) {
        int j = 40 >> paramInt2;
        return (j > 0) ? ((paramInt1 % j == 0)) : true;
      } 
      return (this.Dne == ATE.Dne);
    } 
    int i = 25 >> paramInt2;
    return (i > 0) ? ((paramInt1 % i == 0)) : true;
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public static String Dne(NAx paramNAx) {
    if (paramNAx.bzF())
      return "**:**"; 
    int i = paramNAx.FWm();
    return vCA.Dne(i);
  }
  
  public void Dne(FUH paramFUH, int paramInt) {
    if (this.Dne == XHL.Dne) {
      if (paramFUH.XHL() < paramFUH.Dne())
        paramFUH.Dne(1); 
    } else if (this.Dne == ceE.Dne) {
      if (paramFUH.XHL() > 1)
        paramFUH.Dne(zBn.XHL, 1); 
    } else if (this.Dne == EyB.Dne) {
      paramFUH.Dne(zBn.Zpi, 1);
    } else if (this.Dne == ATE.Dne && paramFUH instanceof FiG) {
      ((FiG)paramFUH).aFZ(0.025F * (paramInt + 1));
    } else if ((this.Dne != DyG.Dne || paramFUH.eJi()) && (this.Dne != div.Dne || !paramFUH.eJi())) {
      if ((this.Dne == div.Dne && !paramFUH.eJi()) || (this.Dne == DyG.Dne && paramFUH.eJi()))
        paramFUH.Dne(zBn.XHL, 6 << paramInt); 
    } else {
      paramFUH.Dne(6 << paramInt);
    } 
  }
  
  public SXd Dne(String paramString) {
    this.Dne = paramString;
    return this;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public boolean bzF() {
    return this.Dne;
  }
  
  public boolean Qnq() {
    return this.FWm;
  }
  
  protected SXd Dne(double paramDouble) {
    this.Dne = paramDouble;
    return this;
  }
  
  public void Dne(FUH paramFUH1, FUH paramFUH2, int paramInt, double paramDouble) {
    if ((this.Dne != DyG.Dne || paramFUH2.eJi()) && (this.Dne != div.Dne || !paramFUH2.eJi())) {
      if ((this.Dne == div.Dne && !paramFUH2.eJi()) || (this.Dne == DyG.Dne && paramFUH2.eJi())) {
        int i = (int)(paramDouble * (6 << paramInt) + 0.5D);
        if (paramFUH1 == null) {
          paramFUH2.Dne(zBn.XHL, i);
        } else {
          paramFUH2.Dne(zBn.FWm(paramFUH2, paramFUH1), i);
        } 
      } 
    } else {
      int i = (int)(paramDouble * (6 << paramInt) + 0.5D);
      paramFUH2.Dne(i);
    } 
  }
  
  protected SXd(int paramInt1, boolean paramBoolean, int paramInt2) {
    this.Dne = paramInt1;
    Dne[paramInt1] = (String)this;
    this.Dne = paramBoolean;
    if (paramBoolean) {
      this.Dne = 0.5D;
    } else {
      this.Dne = 1.0D;
    } 
    this.bzF = paramInt2;
  }
  
  public double Dne() {
    return this.Dne;
  }
  
  protected SXd Dne(int paramInt1, int paramInt2) {
    this.FWm = paramInt1 + paramInt2 * 8;
    return this;
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  static {
    Dne = null;
    FWm = (new SXd(1, false, 8171462)).Dne("potion.moveSpeed").Dne(0, 0);
    bzF = (new SXd(2, true, 5926017)).Dne("potion.moveSlowdown").Dne(1, 0);
    Qnq = (new SXd(3, false, 14270531)).Dne("potion.digSpeed").Dne(2, 0).Dne(1.5D);
    aFZ = (new SXd(4, true, 4866583)).Dne("potion.digSlowDown").Dne(3, 0);
    zGp = (new SXd(5, false, 9643043)).Dne("potion.damageBoost").Dne(4, 0);
    DyG = (new PGs(6, false, 16262179)).Dne("potion.heal");
    div = (new PGs(7, true, 4393481)).Dne("potion.harm");
    IjH = (new SXd(8, false, 7889559)).Dne("potion.jump").Dne(2, 1);
    mrb = (new SXd(9, true, 5578058)).Dne("potion.confusion").Dne(3, 1).Dne(0.25D);
    XHL = (new SXd(10, false, 13458603)).Dne("potion.regeneration").Dne(7, 0).Dne(0.25D);
    Zpi = (new SXd(11, false, 10044730)).Dne("potion.resistance").Dne(6, 1);
    kGO = (new SXd(12, false, 14981690)).Dne("potion.fireResistance").Dne(7, 1);
    udO = (new SXd(13, false, 3035801)).Dne("potion.waterBreathing").Dne(0, 2);
    ooe = (new SXd(14, false, 8356754)).Dne("potion.invisibility").Dne(0, 1);
    trS = (new SXd(15, true, 2039587)).Dne("potion.blindness").Dne(5, 1).Dne(0.25D);
    qLR = (new SXd(16, false, 2039713)).Dne("potion.nightVision").Dne(4, 1);
    ATE = (new SXd(17, true, 5797459)).Dne("potion.hunger").Dne(1, 1);
    Vxn = (new SXd(18, true, 4738376)).Dne("potion.weakness").Dne(5, 0);
    ceE = (new SXd(19, true, 5149489)).Dne("potion.poison").Dne(6, 0).Dne(0.25D);
    EyB = (new SXd(20, true, 3484199)).Dne("potion.wither").Dne(1, 2).Dne(0.25D);
    FfS = null;
    OdI = null;
    oIf = null;
    vSL = null;
    RPx = null;
    Fnk = null;
    gnI = null;
    tgc = null;
    qXo = null;
    AgF = null;
    yMz = null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SXd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */