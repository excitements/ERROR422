import org.lwjgl.opengl.GL11;

public class VmQ extends QCe {
  EVc Dne = new EVc();
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((YCH)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  private float Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f;
    for (f = paramFloat2 - paramFloat1; f < -180.0F; f += 360.0F);
    while (f >= 180.0F)
      f -= 360.0F; 
    return paramFloat1 + paramFloat3 * f;
  }
  
  public void Dne(YCH paramYCH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    GL11.glDisable(2884);
    float f1 = Dne(paramYCH.Zpi, paramYCH.mrb, paramFloat2);
    float f2 = paramYCH.kGO + (paramYCH.XHL - paramYCH.kGO) * paramFloat2;
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
    float f3 = 0.0625F;
    GL11.glEnable(32826);
    GL11.glScalef(-1.0F, -1.0F, 1.0F);
    GL11.glEnable(3008);
    if (paramYCH.Qnq()) {
      Dne("/mob/wither_invul.png");
    } else {
      Dne("/mob/wither.png");
    } 
    this.Dne.Dne(paramYCH, 0.0F, 0.0F, 0.0F, f1, f2, f3);
    GL11.glPopMatrix();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VmQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */