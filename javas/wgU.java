import org.lwjgl.opengl.GL11;

public class wgU extends QCe {
  private int Dne;
  
  private Gor Dne = -1;
  
  public void Dne(Ndk paramNdk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    if (this.Dne != true) {
      this.Dne = new mrT(0.0F, true);
      this.Dne = true;
    } 
    float f1 = paramNdk.Dne + paramFloat2;
    GL11.glPushMatrix();
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
    Dne("/mob/enderdragon/crystal.png");
    float f2 = geR.Dne(f1 * 0.2F) / 2.0F + 0.5F;
    f2 += f2 * f2;
    this.Dne.Dne(paramNdk, 0.0F, f1 * 3.0F, f2 * 0.2F, 0.0F, 0.0F, 0.0625F);
    GL11.glPopMatrix();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Ndk)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public wgU() {
    this.Dne = 0.5F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wgU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */