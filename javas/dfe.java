import org.lwjgl.opengl.GL11;

public class dfe extends QCe {
  protected final zVu FWm;
  
  protected Gor Dne = 0.5F;
  
  protected void Dne(Ebp paramEbp, float paramFloat, zKP paramzKP, int paramInt) {
    float f = paramEbp.Dne(paramFloat);
    GL11.glPushMatrix();
    this.FWm.Dne(paramzKP, paramInt, f);
    GL11.glPopMatrix();
  }
  
  public dfe() {
    this.Dne = new xTk();
    this.FWm = new zVu();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Ebp)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(Ebp paramEbp, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    long l = paramEbp.aFZ * 493286711L;
    l = l * l * 4392167121L + l * 98761L;
    float f1 = (((float)(l >> 16L & 0x7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
    float f2 = (((float)(l >> 20L & 0x7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
    float f3 = (((float)(l >> 24L & 0x7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
    GL11.glTranslatef(f1, f2, f3);
    double d1 = paramEbp.udO + (paramEbp.div - paramEbp.udO) * paramFloat2;
    double d2 = paramEbp.ooe + (paramEbp.IjH - paramEbp.ooe) * paramFloat2;
    double d3 = paramEbp.trS + (paramEbp.mrb - paramEbp.trS) * paramFloat2;
    double d4 = 0.30000001192092896D;
    chN chN = paramEbp.Dne(d1, d2, d3);
    float f4 = paramEbp.kGO + (paramEbp.XHL - paramEbp.kGO) * paramFloat2;
    if (chN != null) {
      chN chN1 = paramEbp.Dne(d1, d2, d3, d4);
      chN chN2 = paramEbp.Dne(d1, d2, d3, -d4);
      if (chN1 == null)
        chN1 = chN; 
      if (chN2 == null)
        chN2 = chN; 
      paramDouble1 += chN.Dne - d1;
      paramDouble2 += (chN1.FWm + chN2.FWm) / 2.0D - d2;
      paramDouble3 += chN.bzF - d3;
      chN chN3 = chN2.bzF(-chN1.Dne, -chN1.FWm, -chN1.bzF);
      if (chN3.Dne() != 0.0D) {
        chN3 = chN3.Dne();
        paramFloat1 = (float)(Math.atan2(chN3.bzF, chN3.Dne) * 180.0D / Math.PI);
        f4 = (float)(Math.atan(chN3.FWm) * 73.0D);
      } 
    } 
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
    GL11.glRotatef(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-f4, 0.0F, 0.0F, 1.0F);
    float f5 = paramEbp.bzF() - paramFloat2;
    float f6 = paramEbp.Dne() - paramFloat2;
    if (f6 < 0.0F)
      f6 = 0.0F; 
    if (f5 > 0.0F)
      GL11.glRotatef(geR.Dne(f5) * f5 * f6 / 10.0F * paramEbp.mrb(), 1.0F, 0.0F, 0.0F); 
    int i = paramEbp.udO();
    zKP zKP = paramEbp.Dne();
    int j = paramEbp.Zpi();
    if (zKP != null) {
      GL11.glPushMatrix();
      Dne("/terrain.png");
      float f = 0.75F;
      GL11.glScalef(f, f, f);
      GL11.glTranslatef(0.0F, i / 16.0F, 0.0F);
      Dne(paramEbp, paramFloat2, zKP, j);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    } 
    Dne("/item/cart.png");
    GL11.glScalef(-1.0F, -1.0F, 1.0F);
    this.Dne.Dne(paramEbp, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glPopMatrix();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dfe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */