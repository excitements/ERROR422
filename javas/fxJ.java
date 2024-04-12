import net.minecraft.client.Minecraft;

public class fxJ extends LHi {
  private long Dne;
  
  private double Dne;
  
  private boolean vSL;
  
  private double FWm;
  
  private double EyB;
  
  private boolean FWm;
  
  private hdK Dne = (hdK)QXI.Dne;
  
  protected void div() {
    ((Qnq)this.Dne).Dne.Dne("ai");
    if (this.Dne > null)
      this.Dne--; 
    this.Dne = haP();
    float f = 100.0F;
    if (this.bzF == null) {
      this.bzF = Dne();
      if (this.bzF != null)
        this.Dne = (hdK)this.Dne.Dne(this, this.bzF, f, true, false, false, true); 
    } else if (this.bzF.udO()) {
      float f1 = this.bzF.Dne(this);
      if (Qnq(this.bzF))
        Dne(this.bzF, f1); 
    } else {
      this.bzF = null;
    } 
    ((Qnq)this.Dne).Dne.FWm();
    if (this.Dne == null && this.bzF != null && (this.Dne == null || this.Dne.nextInt(20) == 0)) {
      this.Dne = (hdK)this.Dne.Dne(this, this.bzF, f, true, false, false, true);
    } else if (this.Dne == null && ((this.Dne == null && this.Dne.nextInt(180) == 0) || this.Dne.nextInt(120) == 0 || this.Dne > null) && this.Wwe < 100) {
      zGp();
    } 
    int i = geR.FWm(((bSp)this.Dne).FWm + 0.5D);
    boolean bool1 = Zpi();
    boolean bool2 = DyG();
    this.XHL = 0.0F;
    if (this.Dne != null && this.Dne.nextInt(100) != 0) {
      ((Qnq)this.Dne).Dne.Dne("followpath");
      chN chN = this.Dne.Dne(this);
      double d = (this.ooe * 2.0F);
      while (chN != null && chN.Dne(this.div, chN.FWm, this.mrb) < d * d) {
        this.Dne.Dne();
        if (this.Dne.Dne()) {
          chN = null;
          this.Dne = null;
          continue;
        } 
        chN = this.Dne.Dne(this);
      } 
      this.oIf = 0;
      if (chN != null) {
        double d1 = chN.Dne - this.div;
        double d2 = chN.bzF - this.mrb;
        double d3 = chN.FWm - i;
        float f1 = (float)(Math.atan2(d2, d1) * 180.0D / Math.PI) - 90.0F;
        float f2 = geR.aFZ(f1 - this.mrb);
        this.FYZ = this.cHy;
        if (f2 > 30.0F)
          f2 = 30.0F; 
        if (f2 < -30.0F)
          f2 = -30.0F; 
        this.mrb += f2;
        if (this.Dne != null && this.bzF != null) {
          double d4 = this.bzF.div - this.div;
          double d5 = this.bzF.mrb - this.mrb;
          float f3 = this.mrb;
          this.mrb = (float)(Math.atan2(d5, d4) * 180.0D / Math.PI) - 90.0F;
          f2 = (f3 - this.mrb + 90.0F) * 3.1415927F / 180.0F;
          this.ZfC = -geR.Dne(f2) * this.FYZ * 1.0F;
          this.FYZ = geR.FWm(f2) * this.FYZ * 1.0F;
        } 
        if (d3 > 0.0D)
          this.oIf = 1; 
      } 
      if (this.bzF != null)
        Dne(this.bzF, 30.0F, 30.0F); 
      if (this.zGp != 0 && !qrB())
        this.oIf = 1; 
      if (this.Dne.nextFloat() < 0.8F && (bool1 || bool2))
        this.oIf = 1; 
      ((Qnq)this.Dne).Dne.FWm();
    } else {
      super.div();
      this.Dne = null;
    } 
  }
  
  public String Dne() {
    return "§c§kERROR422§r";
  }
  
  public boolean DyG() {
    return false;
  }
  
  public int Dne() {
    return 50;
  }
  
  protected void Dne(float paramFloat) {}
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (QXI.Dne == hdK.Dne)
      return false; 
    if (EyB())
      return false; 
    if (((Qnq)this.Dne).aFZ != null)
      return false; 
    this.Wwe = false;
    if (this.Vxn <= 0)
      return false; 
    if (paramzBn.aFZ() && Dne(SXd.kGO))
      return false; 
    if ((paramzBn == zBn.kGO || paramzBn == zBn.udO) && Dne(4) != null) {
      Dne(4).Dne(paramInt * 4 + this.Dne.nextInt(paramInt * 2), this);
      paramInt = (int)(paramInt * 0.75F);
    } 
    this.qrB = 1.5F;
    boolean bool = true;
    if (this.div > this.bzF / 2.0F) {
      if (paramInt <= this.cot)
        return false; 
      Dne(paramzBn, paramInt - this.cot);
      this.cot = paramInt;
      bool = false;
    } else {
      this.cot = paramInt;
      this.ceE = this.Vxn;
      this.div = this.bzF;
      Dne(paramzBn, paramInt);
      this.OdI = this.oIf = 10;
    } 
    this.eHV = 0.0F;
    sMa sMa = paramzBn.FWm();
    if (sMa != null) {
      if (sMa instanceof FUH)
        bzF((FUH)sMa); 
      if (sMa instanceof FiG) {
        this.tgc = 100;
        this.Dne = (hdK)sMa;
      } else if (sMa instanceof oEB) {
        oEB oEB = (oEB)sMa;
        if (oEB.LVR()) {
          this.tgc = 100;
          this.Dne = null;
        } 
      } 
    } 
    if (bool) {
      this.Dne.Dne(this, (byte)2);
      if (paramzBn != zBn.aFZ)
        oIf(); 
      if (sMa != null) {
        double d1 = sMa.div - this.div;
        double d2;
        for (d2 = sMa.mrb - this.mrb; d1 * d1 + d2 * d2 < 1.0E-4D; d2 = (Math.random() - Math.random()) * 0.01D)
          d1 = (Math.random() - Math.random()) * 0.01D; 
        this.eHV = (float)(Math.atan2(d2, d1) * 180.0D / Math.PI) - this.mrb;
      } else {
        this.eHV = ((int)(Math.random() * 2.0D) * 180);
      } 
    } 
    if (this.Vxn <= 0) {
      if (bool)
        Dne(div(), div(), DyG()); 
      Dne(paramzBn);
    } else if (bool) {
      Dne(DyG(), div(), DyG());
    } 
    return true;
  }
  
  protected void Dne(sMa paramsMa, float paramFloat) {
    if (QXI.Dne == hdK.Dne)
      return; 
    if (this.RPx <= 0.0F && paramFloat < 2.0F && paramsMa.Dne.aFZ > ((bSp)this.Dne).FWm && paramsMa.Dne.FWm < ((bSp)this.Dne).aFZ) {
      this.RPx = false;
      bzF(paramsMa);
    } 
  }
  
  public boolean div() {
    return false;
  }
  
  public void Dne() {
    super.Dne();
    if (((PJQ)QXI.Dne).Zpi != 0.0F) {
      Qnq();
    } else {
      QXI.Dne = (NMq)this.Dne;
    } 
    if (QXI.Dne == null)
      return; 
    if (!this.FWm) {
      this.Dne = this.div;
      this.FWm = this.IjH + 1.0D;
      this.EyB = this.mrb;
      this.FWm = true;
    } 
    switch (UYQ.Dne[QXI.Dne.ordinal()]) {
      case 1:
        this.XHL = 0.0D;
        this.Zpi = 0.0D;
        this.kGO = 0.0D;
        if ((FqX.Dne()).Dne >= this.Dne)
          QXI.FWm(); 
        bzF(this.Dne, this.FWm, this.EyB);
        break;
      case 2:
        if (!mKT.Dne.playing("glitch422.ogg"))
          mKT.Dne.quickPlay(false, null, "glitch422.ogg", false, (float)((PJQ)QXI.Dne).div, (float)((PJQ)QXI.Dne).IjH, (float)((PJQ)QXI.Dne).mrb, 100, 0.0F); 
        if ((FqX.Dne()).Dne >= this.Dne)
          Qnq(); 
        break;
    } 
    this.Wwe = 0.3F;
    this.eJi = 0.15F;
    bzF(Float.MAX_VALUE);
    if (this.IjH < ((PJQ)QXI.Dne).IjH && QXI.Dne != hdK.Dne)
      bzF(this.div, this.IjH + 2.0D, this.mrb); 
    int i = geR.FWm(this.div);
    int j = geR.FWm(this.IjH);
    int k = geR.FWm(this.mrb);
    if (QXI.Dne.Dne(i, j - 1, k) == ((byt)zKP.FWm).FWm || QXI.Dne.Dne(i, j, k) == ((zKP)zKP.div).FWm)
      QXI.Dne.FWm(i, j, k, ((byt)zKP.Dne).FWm); 
    QXI.Dne.FWm(i, j + 1, k, 0);
    QXI.Dne.FWm(i, j, k, 0);
  }
  
  public fxJ(Qnq paramQnq) {
    super(paramQnq);
    this.bzF = (sMa)QXI.Dne;
    QXI.Dne = ((PJQ)QXI.Dne).mrb;
    QXI.FWm = ((PJQ)QXI.Dne).XHL;
    ((fZI)((Minecraft)QXI.Dne).Dne).bzF = true;
    if (QXI.Dne == hdK.FWm) {
      this.Dne = ((FqX.Dne()).Dne + Jcz.Dne(1));
    } else if (QXI.Dne == hdK.Dne) {
      mKT.Dne.quickPlay(false, null, "glitch422.ogg", true, (float)((PJQ)QXI.Dne).div, (float)((PJQ)QXI.Dne).IjH, (float)((PJQ)QXI.Dne).mrb, 100, 0.0F);
      this.Dne = (FqX.Dne()).Dne + 80L;
    } 
  }
  
  public void g_() {
    if (this.Vxn <= 0) {
      this.Zpi = true;
      if (!this.vSL) {
        QXI.Dne = null;
        for (zKP zKP : QXI.Dne) {
          NMq nMq = (zKP instanceof zKP) ? new NMq(zKP, 1) : new NMq((dEr)zKP, 1);
          QXI.Dne.FWm(new JiM((Qnq)QXI.Dne, this.div, this.IjH + 10.0D, this.mrb, nMq));
        } 
      } 
    } 
  }
  
  public int FWm() {
    return 10;
  }
  
  public int Dne(sMa paramsMa) {
    return 10;
  }
  
  public void Qnq() {
    QXI.Dne = null;
    ((fZI)((Minecraft)QXI.Dne).Dne).bzF = false;
    this.vSL = true;
    this.Vxn = 0;
    QXI.Dne.bzF(this);
    if (sRv.Dne)
      QXI.Dne.bzF("ERR422 is disappeared."); 
  }
  
  public boolean zGp() {
    return false;
  }
  
  protected sMa Dne() {
    FiG fiG = this.Dne.FWm(this, 100.0D);
    return (fiG != null && Qnq(fiG)) ? fiG : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fxJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */