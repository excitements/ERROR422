import org.lwjgl.opengl.GL11;

public class RNA extends YAD {
  protected Sgm FWm;
  
  protected float bzF;
  
  private static final String[] Dne = new String[] { "cloth", "chain", "iron", "diamond", "gold" };
  
  protected Sgm bzF;
  
  protected Sgm Dne;
  
  protected void Dne(FUH paramFUH, NMq paramNMq) {
    this.Dne.FWm = (paramNMq != null) ? 1 : 0;
    this.Dne.bzF = paramFUH.aFZ();
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    float f = 1.0F;
    GL11.glColor3f(f, f, f);
    NMq nMq = paramFUH.Dne();
    Dne(paramFUH, nMq);
    double d = paramDouble2 - paramFUH.udO;
    if (paramFUH.aFZ() && !(paramFUH instanceof FKB))
      d -= 0.125D; 
    super.Dne(paramFUH, paramDouble1, d, paramDouble3, paramFloat1, paramFloat2);
    this.Dne.Qnq = false;
    this.Dne.bzF = false;
    this.Dne.FWm = 0;
  }
  
  public RNA(Sgm paramSgm, float paramFloat1, float paramFloat2) {
    super(paramSgm, paramFloat1);
    this.Dne = paramSgm;
    this.bzF = paramFloat2;
    Dne();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((FUH)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void FWm() {
    GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
  }
  
  protected void Dne(FUH paramFUH, int paramInt, float paramFloat) {
    NMq nMq = paramFUH.FWm(3 - paramInt);
    if (nMq != null) {
      dEr dEr = nMq.Dne();
      if (dEr instanceof Qoi) {
        Qoi qoi = (Qoi)dEr;
        Dne("/armor/" + Dne[qoi.bzF] + "_" + ((paramInt == 2) ? 2 : 1) + "_b.png");
        float f = 1.0F;
        GL11.glColor3f(f, f, f);
      } 
    } 
  }
  
  protected void Dne() {
    this.FWm = new Sgm(1.0F);
    this.bzF = new Sgm(0.5F);
  }
  
  public RNA(Sgm paramSgm, float paramFloat) {
    this(paramSgm, paramFloat, 1.0F);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    NMq nMq = paramFUH.FWm(3 - paramInt);
    if (nMq != null) {
      dEr dEr = nMq.Dne();
      if (dEr instanceof Qoi) {
        Qoi qoi = (Qoi)dEr;
        Dne("/armor/" + Dne[qoi.bzF] + "_" + ((paramInt == 2) ? 2 : 1) + ".png");
        Sgm sgm = (paramInt == 2) ? this.bzF : this.FWm;
        sgm.Dne.FWm = (paramInt == 0) ? 1 : 0;
        sgm.FWm.FWm = (paramInt == 0) ? 1 : 0;
        sgm.bzF.FWm = (paramInt == 1 || paramInt == 2) ? 1 : 0;
        sgm.Qnq.FWm = (paramInt == 1) ? 1 : 0;
        sgm.aFZ.FWm = (paramInt == 1) ? 1 : 0;
        sgm.zGp.FWm = (paramInt == 2 || paramInt == 3) ? 1 : 0;
        sgm.DyG.FWm = (paramInt == 2 || paramInt == 3) ? 1 : 0;
        Dne(sgm);
        if (sgm != null)
          sgm.Dne = this.Dne.Dne; 
        if (sgm != null)
          sgm.zGp = this.Dne.zGp; 
        if (sgm != null)
          sgm.DyG = this.Dne.DyG; 
        float f = 1.0F;
        if (qoi.Dne() == TNy.Dne) {
          int i = qoi.Dne(nMq);
          float f1 = (i >> 16 & 0xFF) / 255.0F;
          float f2 = (i >> 8 & 0xFF) / 255.0F;
          float f3 = (i & 0xFF) / 255.0F;
          GL11.glColor3f(f * f1, f * f2, f * f3);
          return nMq.IjH() ? 31 : 16;
        } 
        GL11.glColor3f(f, f, f);
        return nMq.IjH() ? 15 : 1;
      } 
    } 
    return -1;
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    float f = 1.0F;
    GL11.glColor3f(f, f, f);
    super.FWm(paramFUH, paramFloat);
    NMq nMq1 = paramFUH.Dne();
    NMq nMq2 = paramFUH.FWm(3);
    if (nMq2 != null) {
      GL11.glPushMatrix();
      this.Dne.Dne.bzF(0.0625F);
      if ((nMq2.Dne()).Qnq < 256) {
        if (zVu.Dne(zKP.Dne[nMq2.bzF].Dne())) {
          float f1 = 0.625F;
          GL11.glTranslatef(0.0F, -0.25F, 0.0F);
          GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
          GL11.glScalef(f1, -f1, -f1);
        } 
        ((ptH)this.Dne).Dne.Dne(paramFUH, nMq2, 0);
      } else if ((nMq2.Dne()).Qnq == dEr.mfU.Qnq) {
        float f1 = 1.0625F;
        GL11.glScalef(f1, -f1, -f1);
        String str = "";
        if (nMq2.aFZ() && nMq2.Dne().Dne("SkullOwner"))
          str = nMq2.Dne().Dne("SkullOwner"); 
        rzA.Dne.Dne(-0.5F, 0.0F, -0.5F, 1, 180.0F, nMq2.Qnq(), str);
      } 
      GL11.glPopMatrix();
    } 
    if (nMq1 != null) {
      GL11.glPushMatrix();
      if (this.Dne.DyG) {
        float f1 = 0.5F;
        GL11.glTranslatef(0.0F, 0.625F, 0.0F);
        GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
        GL11.glScalef(f1, f1, f1);
      } 
      this.Dne.Qnq.bzF(0.0625F);
      GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
      if (nMq1.bzF < 256 && zVu.Dne(zKP.Dne[nMq1.bzF].Dne())) {
        float f1 = 0.5F;
        GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
        f1 *= 0.75F;
        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(-f1, -f1, f1);
      } else if (nMq1.bzF == ((DsI)dEr.Dne).Qnq) {
        float f1 = 0.625F;
        GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
        GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(f1, -f1, f1);
        GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      } else if (dEr.Dne[nMq1.bzF].FWm()) {
        float f1 = 0.625F;
        if (dEr.Dne[nMq1.bzF].bzF()) {
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslatef(0.0F, -0.125F, 0.0F);
        } 
        FWm();
        GL11.glScalef(f1, -f1, f1);
        GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      } else {
        float f1 = 0.375F;
        GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
        GL11.glScalef(f1, f1, f1);
        GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
      } 
      ((ptH)this.Dne).Dne.Dne(paramFUH, nMq1, 0);
      if (nMq1.Dne().Dne())
        ((ptH)this.Dne).Dne.Dne(paramFUH, nMq1, 1); 
      GL11.glPopMatrix();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RNA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */