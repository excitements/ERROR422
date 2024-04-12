import net.minecraft.client.Minecraft;

public class MJs extends FKB {
  private double Fnk;
  
  private boolean RPx = false;
  
  private boolean Dne;
  
  private float EwP;
  
  private double FWm;
  
  private int EWz = 0;
  
  private double Dne;
  
  private boolean Fnk = false;
  
  public fzy Dne = false;
  
  private double gnI;
  
  private boolean FWm = false;
  
  private float xEx;
  
  public void Dne(RLC paramRLC, int paramInt) {
    if (paramRLC != null && paramRLC.Dne != null)
      super.Dne(paramRLC, paramInt); 
  }
  
  public void e_() {
    boolean bool1 = ATE();
    if (bool1 != this.RPx) {
      if (bool1) {
        this.Dne.FWm(new Pkw(this, 4));
      } else {
        this.Dne.FWm(new Pkw(this, 5));
      } 
      this.RPx = bool1;
    } 
    boolean bool2 = aFZ();
    if (bool2 != this.FWm) {
      if (bool2) {
        this.Dne.FWm(new Pkw(this, 1));
      } else {
        this.Dne.FWm(new Pkw(this, 2));
      } 
      this.FWm = bool2;
    } 
    double d1 = this.div - this.Dne;
    double d2 = ((bSp)this.Dne).FWm - this.FWm;
    double d3 = this.mrb - this.gnI;
    double d4 = (this.mrb - this.EwP);
    double d5 = (this.XHL - this.xEx);
    boolean bool3 = (d1 * d1 + d2 * d2 + d3 * d3 > 9.0E-4D || this.EWz >= 20) ? true : false;
    boolean bool4 = (d4 != 0.0D || d5 != 0.0D) ? true : false;
    if (this.FWm != null) {
      this.Dne.FWm(new eMn(this.XHL, -999.0D, -999.0D, this.kGO, this.mrb, this.XHL, this.aFZ));
      bool3 = false;
    } else if (bool3 && bool4) {
      this.Dne.FWm(new eMn(this.div, ((bSp)this.Dne).FWm, this.IjH, this.mrb, this.mrb, this.XHL, this.aFZ));
    } else if (bool3) {
      this.Dne.FWm(new QEr(this.div, ((bSp)this.Dne).FWm, this.IjH, this.mrb, this.aFZ));
    } else if (bool4) {
      this.Dne.FWm(new FTJ(this.mrb, this.XHL, this.aFZ));
    } else {
      this.Dne.FWm(new FQJ(this.aFZ));
    } 
    this.EWz++;
    this.Dne = this.aFZ;
    if (bool3) {
      this.Dne = this.div;
      this.FWm = ((bSp)this.Dne).FWm;
      this.Fnk = this.IjH;
      this.gnI = this.mrb;
      this.EWz = 0;
    } 
    if (bool4) {
      this.EwP = this.mrb;
      this.xEx = this.XHL;
    } 
  }
  
  public void bzF() {
    super.bzF();
    this.Dne.FWm(new UVb(this, 1));
  }
  
  protected void Dne(zBn paramzBn, int paramInt) {
    if (!EyB())
      bzF(XHL() - paramInt); 
  }
  
  public void FWm(String paramString) {
    this.Dne.FWm(new rXx(paramString));
  }
  
  public void Qnq() {
    this.Dne.FWm(new Gle(1));
  }
  
  public void f_() {
    this.Dne.Dne((NMq)null);
    super.aFZ();
  }
  
  public void FWm(RLC paramRLC, int paramInt) {
    if (paramRLC != null && paramRLC.Dne == null)
      super.Dne(paramRLC, paramInt); 
  }
  
  public void Dne() {
    if (this.Dne.bzF(geR.FWm(this.div), 0, geR.FWm(this.mrb))) {
      super.Dne();
      e_();
    } 
  }
  
  public void DyG() {
    this.Dne.FWm(new pSe((uqg)this.Dne));
  }
  
  public boolean b_() {
    return true;
  }
  
  protected void Dne(JiM paramJiM) {}
  
  public void a_(int paramInt) {
    if (this.Fnk) {
      super.a_(paramInt);
    } else {
      bzF(paramInt);
      this.Fnk = true;
    } 
  }
  
  public boolean Dne(zBn paramzBn, int paramInt) {
    return false;
  }
  
  public MJs(Minecraft paramMinecraft, Qnq paramQnq, vwN paramvwN, fzy paramfzy) {
    super(paramMinecraft, paramQnq, paramvwN, 0);
    this.Dne = paramfzy;
  }
  
  public void aFZ() {
    this.Dne.FWm(new Krr(this.FWm.Dne));
    f_();
  }
  
  public JiM Dne(boolean paramBoolean) {
    byte b = paramBoolean ? 3 : 4;
    this.Dne.FWm(new Wbc(b, 0, 0, 0, 0));
    return null;
  }
  
  public void Dne(int paramInt) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MJs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */