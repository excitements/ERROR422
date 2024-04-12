import java.util.List;
import java.util.Random;

public class DhB extends LHi implements sQM, vjn {
  private static final pUe FWm = new Tnl();
  
  private float[] Qnq = new float[2];
  
  private float[] zGp = new float[2];
  
  private int FWm;
  
  private float[] aFZ = new float[2];
  
  private float[] bzF = new float[2];
  
  private int[] Dne = new int[2];
  
  private int[] FWm = new int[2];
  
  public float Dne(int paramInt) {
    return this.Qnq[paramInt];
  }
  
  public int Dne(float paramFloat) {
    return 15728880;
  }
  
  protected String DyG() {
    return "mob.wither.hurt";
  }
  
  private void Dne(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean) {
    this.Dne.Dne((FiG)null, 1014, (int)this.div, (int)this.IjH, (int)this.mrb, 0);
    double d1 = Dne(paramInt);
    double d2 = FWm(paramInt);
    double d3 = bzF(paramInt);
    double d4 = paramDouble1 - d1;
    double d5 = paramDouble2 - d2;
    double d6 = paramDouble3 - d3;
    YCH yCH = new YCH((Qnq)this.Dne, this, d4, d5, d6);
    if (paramBoolean)
      yCH.FWm(true); 
    yCH.IjH = d2;
    yCH.div = d1;
    yCH.mrb = d3;
    this.Dne.FWm(yCH);
  }
  
  protected String div() {
    return "mob.wither.death";
  }
  
  public float Dne() {
    return this.trS / 8.0F;
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, new Integer(100));
    this.Dne.Dne(17, new Integer(0));
    this.Dne.Dne(18, new Integer(0));
    this.Dne.Dne(19, new Integer(0));
    this.Dne.Dne(20, new Integer(0));
  }
  
  public void Qnq(NAx paramNAx) {}
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    Dne(dEr.jsv.Qnq, 1);
  }
  
  protected void ZgS() {
    this.Wwe = false;
  }
  
  public int Zpi() {
    return 4;
  }
  
  public aYc Dne() {
    return aYc.FWm;
  }
  
  protected void Dne(float paramFloat) {}
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    FWm(paramWkD.Dne("Invul"));
    this.Dne.FWm(16, Integer.valueOf(this.Vxn));
  }
  
  public String bzF() {
    int i = bzF();
    return (i > 0 && (i > 80 || i / 5 % 2 != 1)) ? "/mob/wither_invul.png" : "/mob/wither.png";
  }
  
  private void Dne(int paramInt, FUH paramFUH) {
    Dne(paramInt, paramFUH.div, paramFUH.IjH + paramFUH.c_() * 0.5D, paramFUH.mrb, (paramInt == 0 && this.Dne.nextFloat() < 0.001F));
  }
  
  protected void eHV() {
    if (bzF() > 0) {
      int i = bzF() - 1;
      if (i <= 0) {
        this.Dne.Dne(this, this.div, this.IjH + c_(), this.mrb, 7.0F, false, this.Dne.Dne().Dne("mobGriefing"));
        this.Dne.bzF(1013, (int)this.div, (int)this.IjH, (int)this.mrb, 0);
      } 
      FWm(i);
      if (this.zGp % 10 == 0)
        Dne(10); 
    } else {
      super.eHV();
      int i;
      for (i = 1; i < 3; i++) {
        if (this.zGp >= this.Dne[i - 1]) {
          this.Dne[i - 1] = this.zGp + 10 + this.Dne.nextInt(10);
          if (((Qnq)this.Dne).aFZ >= 2) {
            int k = i - 1;
            int m = this.FWm[i - 1];
            this.FWm[k] = this.FWm[i - 1] + 1;
            if (m > 15) {
              float f1 = 10.0F;
              float f2 = 5.0F;
              double d1 = geR.Dne((Random)this.Dne, this.div - f1, this.div + f1);
              double d2 = geR.Dne((Random)this.Dne, this.IjH - f2, this.IjH + f2);
              double d3 = geR.Dne((Random)this.Dne, this.mrb - f1, this.mrb + f1);
              Dne(i + 1, d1, d2, d3, true);
              this.FWm[i - 1] = 0;
            } 
          } 
          int j = FWm(i);
          if (j > 0) {
            sMa sMa = this.Dne.Dne(j);
            if (sMa != null && sMa.udO() && Dne(sMa) <= 900.0D && Qnq(sMa)) {
              Dne(i + 1, (FUH)sMa);
              this.Dne[i - 1] = this.zGp + 40 + this.Dne.nextInt(20);
              this.FWm[i - 1] = 0;
            } else {
              Dne(i, 0);
            } 
          } else {
            List<FUH> list = this.Dne.Dne(FUH.class, this.Dne.FWm(20.0D, 8.0D, 20.0D), (pUe)FWm);
            for (byte b = 0; b < 10 && !list.isEmpty(); b++) {
              FUH fUH = list.get(this.Dne.nextInt(list.size()));
              if (fUH != this && fUH.udO() && Qnq(fUH)) {
                if (fUH instanceof FiG) {
                  if (((uqg)((FiG)fUH).Dne).Dne == 0.0F)
                    Dne(i, fUH.aFZ); 
                  break;
                } 
                Dne(i, fUH.aFZ);
                break;
              } 
              list.remove(fUH);
            } 
          } 
        } 
      } 
      if (bzF() != null) {
        Dne(0, (bzF()).aFZ);
      } else {
        Dne(0, 0);
      } 
      if (this.FWm > null) {
        this.FWm--;
        if (this.FWm == null && this.Dne.Dne().Dne("mobGriefing")) {
          i = geR.FWm(this.IjH);
          int j = geR.FWm(this.div);
          int k = geR.FWm(this.mrb);
          boolean bool = false;
          for (byte b = -1; b <= 1; b++) {
            for (byte b1 = -1; b1 <= 1; b1++) {
              for (byte b2 = 0; b2 <= 3; b2++) {
                int m = j + b;
                int n = i + b2;
                int i1 = k + b1;
                int i2 = this.Dne.Dne(m, n, i1);
                if (i2 > 0 && i2 != zKP.zGp.FWm && i2 != zKP.EYV.FWm && i2 != zKP.dBc.FWm)
                  bool = (this.Dne.Dne(m, n, i1, true) || bool) ? true : false; 
              } 
            } 
          } 
          if (bool)
            this.Dne.Dne((FiG)null, 1012, (int)this.div, (int)this.IjH, (int)this.mrb, 0); 
        } 
      } 
      if (this.zGp % 20 == 0)
        Dne(1); 
    } 
  }
  
  public int c_() {
    return this.Dne.Dne(16);
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Invul", bzF());
  }
  
  private double FWm(int paramInt) {
    return (paramInt <= 0) ? (this.IjH + 3.0D) : (this.IjH + 2.2D);
  }
  
  public void tgc() {}
  
  protected boolean tgc() {
    return true;
  }
  
  public int bzF() {
    return this.Dne.Dne(20);
  }
  
  public DhB(Qnq paramQnq) {
    super(paramQnq);
    bzF(Dne());
    this.bzF = (float[])"/mob/wither.png";
    Dne(0.9F, 4.0F);
    this.ooe = true;
    this.cHy = 0.6F;
    Dne().aFZ(true);
    this.Dne.Dne(0, new Cyb(this));
    this.Dne.Dne(2, new Auu(this, this.cHy, 40, 20.0F));
    this.Dne.Dne(5, new IBw(this, this.cHy));
    this.Dne.Dne(6, new yws(this, FiG.class, 8.0F));
    this.Dne.Dne(7, new cHg(this));
    this.FWm.Dne(1, new QRF(this, false));
    this.FWm.Dne(2, new AmF(this, FUH.class, 30.0F, 0, false, false, (pUe)FWm));
    this.Fnk = 50;
  }
  
  private float Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = geR.aFZ(paramFloat2 - paramFloat1);
    if (f > paramFloat3)
      f = paramFloat3; 
    if (f < -paramFloat3)
      f = -paramFloat3; 
    return paramFloat1 + f;
  }
  
  public int Dne() {
    return 300;
  }
  
  public void Qnq() {
    FWm(220);
    bzF(Dne() / 3);
  }
  
  public boolean LVR() {
    return (c_() <= Dne() / 2);
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    if (paramzBn == zBn.aFZ)
      return false; 
    if (bzF() > 0)
      return false; 
    if (LVR()) {
      sMa sMa1 = paramzBn.Dne();
      if (sMa1 instanceof hhc)
        return false; 
    } 
    sMa sMa = paramzBn.FWm();
    if (sMa != null && !(sMa instanceof FiG) && sMa instanceof FUH && ((FUH)sMa).Dne() == Dne())
      return false; 
    if (this.FWm <= null)
      this.FWm = 20; 
    for (byte b = 0; b < this.FWm.length; b++)
      this.FWm[b] = this.FWm[b] + 3; 
    return super.Dne(paramzBn, paramInt);
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    this.Dne.FWm(17 + paramInt1, Integer.valueOf(paramInt2));
  }
  
  private double bzF(int paramInt) {
    if (paramInt <= 0)
      return this.mrb; 
    float f1 = (this.IjH + (180 * (paramInt - 1))) / 180.0F * 3.1415927F;
    float f2 = geR.Dne(f1);
    return this.mrb + f2 * 1.3D;
  }
  
  public int FWm(int paramInt) {
    return this.Dne.Dne(17 + paramInt);
  }
  
  public boolean kGO() {
    return (this.Zpi == 0.0F);
  }
  
  public void Dne(FUH paramFUH, float paramFloat) {
    Dne(0, paramFUH);
  }
  
  public void FWm(int paramInt) {
    this.Dne.FWm(20, Integer.valueOf(paramInt));
  }
  
  protected String zGp() {
    return "mob.wither.idle";
  }
  
  public void bzF(sMa paramsMa) {
    this.FWm = null;
  }
  
  private double Dne(int paramInt) {
    if (paramInt <= 0)
      return this.div; 
    float f1 = (this.IjH + (180 * (paramInt - 1))) / 180.0F * 3.1415927F;
    float f2 = geR.FWm(f1);
    return this.div + f2 * 1.3D;
  }
  
  public float FWm(int paramInt) {
    return this.bzF[paramInt];
  }
  
  public void IjH() {
    if (((Qnq)this.Dne).aFZ == null)
      this.Dne.FWm(16, Integer.valueOf(this.Vxn)); 
    this.Zpi *= 0.6000000238418579D;
    if (((Qnq)this.Dne).aFZ == null && FWm(0) > 0) {
      sMa sMa = this.Dne.Dne(FWm(0));
      if (sMa != null) {
        if (this.IjH < sMa.IjH || (!LVR() && this.IjH < sMa.IjH + 5.0D)) {
          if (this.Zpi < 0.0D)
            this.Zpi = 0.0D; 
          this.Zpi += (0.5D - this.Zpi) * 0.6000000238418579D;
        } 
        double d3 = sMa.div - this.div;
        double d1 = sMa.mrb - this.mrb;
        double d2 = d3 * d3 + d1 * d1;
        if (d2 > 9.0D) {
          double d = geR.Dne(d2);
          this.XHL += (d3 / d * 0.5D - this.XHL) * 0.6000000238418579D;
          this.kGO += (d1 / d * 0.5D - this.kGO) * 0.6000000238418579D;
        } 
      } 
    } 
    if (this.XHL * this.XHL + this.kGO * this.kGO > 0.05000000074505806D)
      this.mrb = (float)Math.atan2(this.kGO, this.XHL) * 57.295776F - 90.0F; 
    super.IjH();
    byte b1;
    for (b1 = 0; b1 < 2; b1++) {
      this.zGp[b1] = this.Qnq[b1];
      this.aFZ[b1] = this.bzF[b1];
    } 
    for (b1 = 0; b1 < 2; b1++) {
      int i = FWm(b1 + 1);
      sMa sMa = null;
      if (i > 0)
        sMa = this.Dne.Dne(i); 
      if (sMa != null) {
        double d1 = Dne(b1 + 1);
        double d2 = FWm(b1 + 1);
        double d3 = bzF(b1 + 1);
        double d4 = sMa.div - d1;
        double d5 = sMa.IjH + sMa.c_() - d2;
        double d6 = sMa.mrb - d3;
        double d7 = geR.Dne(d4 * d4 + d6 * d6);
        float f1 = (float)(Math.atan2(d6, d4) * 180.0D / Math.PI) - 90.0F;
        float f2 = (float)-(Math.atan2(d5, d7) * 180.0D / Math.PI);
        this.bzF[b1] = Dne(this.bzF[b1], f2, 40.0F);
        this.Qnq[b1] = Dne(this.Qnq[b1], f1, 10.0F);
      } else {
        this.Qnq[b1] = Dne(this.Qnq[b1], this.IjH, 10.0F);
      } 
    } 
    boolean bool = LVR();
    byte b2;
    for (b2 = 0; b2 < 3; b2++) {
      double d1 = Dne(b2);
      double d2 = FWm(b2);
      double d3 = bzF(b2);
      this.Dne.Dne("smoke", d1 + this.Dne.nextGaussian() * 0.30000001192092896D, d2 + this.Dne.nextGaussian() * 0.30000001192092896D, d3 + this.Dne.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
      if (bool && ((Qnq)this.Dne).Dne.nextInt(4) == 0)
        this.Dne.Dne("mobSpell", d1 + this.Dne.nextGaussian() * 0.30000001192092896D, d2 + this.Dne.nextGaussian() * 0.30000001192092896D, d3 + this.Dne.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D); 
    } 
    if (bzF() > 0)
      for (b2 = 0; b2 < 3; b2++)
        this.Dne.Dne("mobSpell", this.div + this.Dne.nextGaussian() * 1.0D, this.IjH + (this.Dne.nextFloat() * 3.3F), this.mrb + this.Dne.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DhB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */