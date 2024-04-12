public class alg extends sMa {
  public int Dne;
  
  private int Vxn;
  
  private int Qnq = 5;
  
  private int ceE;
  
  private FiG Dne;
  
  public int bzF;
  
  public int FWm = 0;
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    if (EyB())
      return false; 
    oIf();
    this.Qnq -= paramInt;
    if (this.Qnq <= 0)
      g_(); 
    return false;
  }
  
  public alg(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    super(paramQnq);
    Dne(0.5F, 0.5F);
    this.udO = this.trS / 2.0F;
    bzF(paramDouble1, paramDouble2, paramDouble3);
    this.mrb = (float)(Math.random() * 360.0D);
    this.XHL = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    this.Zpi = ((float)(Math.random() * 0.2D) * 2.0F);
    this.kGO = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    this.Vxn = paramInt;
  }
  
  public int bzF() {
    return (this.Vxn >= 2477) ? 10 : ((this.Vxn >= 1237) ? 9 : ((this.Vxn >= 617) ? 8 : ((this.Vxn >= 307) ? 7 : ((this.Vxn >= 149) ? 6 : ((this.Vxn >= 73) ? 5 : ((this.Vxn >= 37) ? 4 : ((this.Vxn >= 17) ? 3 : ((this.Vxn >= 7) ? 2 : ((this.Vxn >= 3) ? 1 : 0)))))))));
  }
  
  public void a_(FiG paramFiG) {
    if (((Qnq)this.Dne).aFZ == null && this.bzF == 0 && paramFiG.ZgS == 0) {
      paramFiG.ZgS = 2;
      Dne("random.orb", 0.1F, 0.5F * ((this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.7F + 1.8F));
      paramFiG.Dne(this, 1);
      paramFiG.ooe(this.Vxn);
      g_();
    } 
  }
  
  public int Dne(float paramFloat) {
    float f = 0.5F;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    int i = super.Dne(paramFloat);
    int j = i & 0xFF;
    int k = i >> 16 & 0xFF;
    j += (int)(f * 15.0F * 16.0F);
    if (j > 240)
      j = 240; 
    return j | k << 16;
  }
  
  protected void FWm() {}
  
  public void Dne() {
    super.Dne();
    if (this.bzF > 0)
      this.bzF--; 
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    this.Zpi -= 0.029999999329447746D;
    if (this.Dne.Dne(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb)) == KFd.IjH) {
      this.Zpi = 0.20000000298023224D;
      this.XHL = ((this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.2F);
      this.kGO = ((this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.2F);
      Dne("random.fizz", 0.4F, 2.0F + this.Dne.nextFloat() * 0.4F);
    } 
    Dne(this.div, (((bSp)this.Dne).FWm + ((bSp)this.Dne).aFZ) / 2.0D, this.mrb);
    double d = 8.0D;
    if (this.ceE < this.Dne - 20 + this.aFZ % 100) {
      if (this.Dne == null || this.Dne.Dne(this) > d * d)
        this.Dne = this.Dne.Dne(this, d); 
      this.ceE = this.Dne;
    } 
    if (this.Dne != null) {
      double d1 = (this.Dne.div - this.div) / d;
      double d2 = (this.Dne.IjH + this.Dne.c_() - this.IjH) / d;
      double d3 = (this.Dne.mrb - this.mrb) / d;
      double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
      double d5 = 1.0D - d4;
      if (d5 > 0.0D) {
        d5 *= d5;
        this.XHL += d1 / d4 * d5 * 0.1D;
        this.Zpi += d2 / d4 * d5 * 0.1D;
        this.kGO += d3 / d4 * d5 * 0.1D;
      } 
    } 
    Dne(this.XHL, this.Zpi, this.kGO);
    float f = 0.98F;
    if (this.aFZ != 0.0D) {
      f = 0.58800006F;
      int i = this.Dne.Dne(geR.FWm(this.div), geR.FWm(((bSp)this.Dne).FWm) - 1, geR.FWm(this.mrb));
      if (i > 0)
        f = (zKP.Dne[i]).Qnq * 0.98F; 
    } 
    this.XHL *= f;
    this.Zpi *= 0.9800000190734863D;
    this.kGO *= f;
    if (this.aFZ != 0.0D)
      this.Zpi *= -0.8999999761581421D; 
    this.Dne++;
    this.FWm++;
    if (this.FWm >= 6000)
      g_(); 
  }
  
  public alg(Qnq paramQnq) {
    super(paramQnq);
    Dne(0.25F, 0.25F);
    this.udO = this.trS / 2.0F;
  }
  
  public static int Dne(int paramInt) {
    return (paramInt >= 2477) ? 2477 : ((paramInt >= 1237) ? 1237 : ((paramInt >= 617) ? 617 : ((paramInt >= 307) ? 307 : ((paramInt >= 149) ? 149 : ((paramInt >= 73) ? 73 : ((paramInt >= 37) ? 37 : ((paramInt >= 17) ? 17 : ((paramInt >= 7) ? 7 : ((paramInt >= 3) ? 3 : 1)))))))));
  }
  
  public int Dne() {
    return this.Vxn;
  }
  
  public void Dne(WkD paramWkD) {
    paramWkD.Dne("Health", (short)(byte)this.Qnq);
    paramWkD.Dne("Age", (short)this.FWm);
    paramWkD.Dne("Value", (short)this.Vxn);
  }
  
  protected boolean FWm() {
    return false;
  }
  
  public boolean zGp() {
    return this.Dne.Dne((bSp)this.Dne, KFd.div, this);
  }
  
  protected void zGp(int paramInt) {
    Dne((zBn)zBn.Dne, paramInt);
  }
  
  public void FWm(WkD paramWkD) {
    this.Qnq = paramWkD.Dne("Health") & 0xFF;
    this.FWm = paramWkD.Dne("Age");
    this.Vxn = paramWkD.Dne("Value");
  }
  
  public boolean bzF() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\alg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */