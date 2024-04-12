import org.lwjgl.opengl.GL11;

public class TrR extends YAD {
  private XRF Dne = (XRF)super.Dne;
  
  protected void Dne(wao paramwao, float paramFloat) {
    super.FWm(paramwao, paramFloat);
    NMq nMq = new NMq(zKP.aJO, 1);
    if (nMq != null && (nMq.Dne()).Qnq < 256) {
      GL11.glPushMatrix();
      this.Dne.bzF.bzF(0.0625F);
      if (zVu.Dne(zKP.Dne[nMq.bzF].Dne())) {
        float f = 0.625F;
        GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(f, -f, f);
      } 
      ((ptH)this.Dne).Dne.Dne(paramwao, nMq, 0);
      GL11.glPopMatrix();
    } 
  }
  
  public TrR() {
    super(new XRF(), 0.5F);
    Dne(this.Dne);
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((wao)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TrR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */