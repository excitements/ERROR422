import java.util.Random;

public class Pvd extends HzK {
  private zmN Dne;
  
  private final Uqm Dne = new Uqm(new AoH(this), 2, 1);
  
  private int FWm;
  
  public static final float[][] Dne = new float[][] { 
      { 1.0F, 1.0F, 1.0F }, { 0.85F, 0.5F, 0.2F }, { 0.7F, 0.3F, 0.85F }, { 0.4F, 0.6F, 0.85F }, { 0.9F, 0.9F, 0.2F }, { 0.5F, 0.8F, 0.1F }, { 0.95F, 0.5F, 0.65F }, { 0.3F, 0.3F, 0.3F }, { 0.6F, 0.6F, 0.6F }, { 0.3F, 0.5F, 0.6F }, 
      { 0.5F, 0.25F, 0.7F }, { 0.2F, 0.3F, 0.7F }, { 0.4F, 0.3F, 0.2F }, { 0.4F, 0.5F, 0.2F }, { 0.6F, 0.2F, 0.2F }, { 0.1F, 0.1F, 0.1F } };
  
  public Pvd Dne(Azh paramAzh) {
    Pvd pvd1 = (Pvd)paramAzh;
    Pvd pvd2 = new Pvd((Qnq)this.Dne);
    int i = Dne(this, pvd1);
    pvd2.kGO(15 - i);
    return pvd2;
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    if (!LVR())
      Dne(new NMq(zKP.RPx.FWm, 1, qLR()), 0.0F); 
  }
  
  public float bzF(float paramFloat) {
    return (this.FWm <= 0) ? 0.0F : ((this.FWm >= 4 && this.FWm <= 36) ? 1.0F : ((this.FWm < 4) ? ((this.FWm - paramFloat) / 4.0F) : (-((this.FWm - 40) - paramFloat) / 4.0F)));
  }
  
  public void qXo() {
    IjH(false);
    if (IjH()) {
      int i = bzF() + 1200;
      if (i > 0)
        i = 0; 
      FWm(i);
    } 
  }
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  public float Qnq(float paramFloat) {
    if (this.FWm > 4 && this.FWm <= 36) {
      float f = ((this.FWm - 4) - paramFloat) / 32.0F;
      return 0.62831855F + 0.2199115F * geR.Dne(f * 28.7F);
    } 
    return (this.FWm > 0) ? 0.62831855F : (this.XHL / 57.295776F);
  }
  
  protected int kGO() {
    return zKP.RPx.FWm;
  }
  
  public Pvd(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = (float[][])new zmN(this);
    this.bzF = (sMa)"/mob/sheep.png";
    Dne(0.9F, 1.3F);
    float f = 0.23F;
    Dne().Dne(true);
    this.Dne.Dne(0, new Cyb(this));
    this.Dne.Dne(1, new xkg(this, 0.38F));
    this.Dne.Dne(2, new znX(this, f));
    this.Dne.Dne(3, new cnh(this, 0.25F, dEr.EWz.Qnq, false));
    this.Dne.Dne(4, new NSW(this, 0.25F));
    this.Dne.Dne(5, (cMv)this.Dne);
    this.Dne.Dne(6, new IBw(this, f));
    this.Dne.Dne(7, new yws(this, FiG.class, 6.0F));
    this.Dne.Dne(8, new cHg(this));
    this.Dne.Dne(0, new NMq(dEr.edi, 1, 0));
    this.Dne.Dne(1, new NMq(dEr.edi, 1, 0));
  }
  
  private int Dne(HzK paramHzK) {
    return 15 - ((Pvd)paramHzK).qLR();
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, new Byte((byte)0));
  }
  
  public void IjH(boolean paramBoolean) {
    byte b = this.Dne.Dne(16);
    if (paramBoolean) {
      this.Dne.FWm(16, Byte.valueOf((byte)(b | 0x10)));
    } else {
      this.Dne.FWm(16, Byte.valueOf((byte)(b & 0xFFFFFFEF)));
    } 
  }
  
  public int Dne() {
    return 8;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Sheared", LVR());
    paramWkD.Dne("Color", (byte)qLR());
  }
  
  public boolean a_(FiG paramFiG) {
    NMq nMq = paramFiG.Dne.Dne();
    if (nMq != null && nMq.bzF == ((ZtP)dEr.Dne).Qnq && !LVR() && !IjH()) {
      if (((Qnq)this.Dne).aFZ == null) {
        IjH(true);
        int i = 1 + this.Dne.nextInt(3);
        for (byte b = 0; b < i; b++) {
          JiM jiM = Dne(new NMq(zKP.RPx.FWm, 1, qLR()), 1.0F);
          jiM.Zpi += (this.Dne.nextFloat() * 0.05F);
          jiM.XHL += ((this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.1F);
          jiM.kGO += ((this.Dne.nextFloat() - this.Dne.nextFloat()) * 0.1F);
        } 
      } 
      nMq.Dne(1, paramFiG);
      Dne("mob.sheep.shear", 1.0F, 1.0F);
    } 
    return super.a_(paramFiG);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne("mob.sheep.step", 0.15F, 1.0F);
  }
  
  protected void eHV() {
    this.FWm = this.Dne.Dne();
    super.eHV();
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    IjH(paramWkD.FWm("Sheared"));
    kGO(paramWkD.Dne("Color"));
  }
  
  private int Dne(HzK paramHzK1, HzK paramHzK2) {
    int k;
    int i = Dne(paramHzK1);
    int j = Dne(paramHzK2);
    this.Dne.Dne(0).Dne(i);
    this.Dne.Dne(1).Dne(j);
    NMq nMq = aXt.Dne().Dne((Uqm)this.Dne, (Qnq)((Pvd)paramHzK1).Dne);
    if (nMq != null && (nMq.Dne()).Qnq == dEr.edi.Qnq) {
      k = nMq.Qnq();
    } else {
      k = ((Qnq)this.Dne).Dne.nextBoolean() ? i : j;
    } 
    return k;
  }
  
  protected String zGp() {
    return "mob.sheep.say";
  }
  
  public void kGO(int paramInt) {
    byte b = this.Dne.Dne(16);
    this.Dne.FWm(16, Byte.valueOf((byte)(b & 0xF0 | paramInt & 0xF)));
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 10) {
      this.FWm = 40;
    } else {
      super.Dne(paramByte);
    } 
  }
  
  protected String div() {
    return "mob.sheep.say";
  }
  
  public void ICU() {
    kGO(Dne((Random)((Qnq)this.Dne).Dne));
  }
  
  public static int Dne(Random paramRandom) {
    int i = paramRandom.nextInt(100);
    return (i < 5) ? 15 : ((i < 10) ? 7 : ((i < 15) ? 8 : ((i < 18) ? 12 : ((paramRandom.nextInt(500) == 0) ? 6 : 0))));
  }
  
  protected String DyG() {
    return "mob.sheep.say";
  }
  
  public void IjH() {
    if (((Qnq)this.Dne).aFZ != null)
      this.FWm = Math.max(0, this.FWm - 1); 
    super.IjH();
  }
  
  public boolean LVR() {
    return ((this.Dne.Dne(16) & 0x10) != 0);
  }
  
  public int qLR() {
    return this.Dne.Dne(16) & 0xF;
  }
  
  protected boolean tgc() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Pvd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */