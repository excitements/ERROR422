import org.lwjgl.opengl.GL11;

public class FYH extends Jte {
  static {
  
  }
  
  public static void Dne(Nlm paramNlm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    sMa sMa = paramNlm.Dne();
    if (sMa != null) {
      sMa.Dne(paramNlm.Dne());
      float f = 0.4375F;
      GL11.glTranslatef(0.0F, 0.4F, 0.0F);
      GL11.glRotatef((float)(paramNlm.FWm + (paramNlm.Dne - paramNlm.FWm) * paramFloat) * 10.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, -0.4F, 0.0F);
      GL11.glScalef(f, f, f);
      sMa.FWm(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
      ptH.Dne.Dne(sMa, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat);
    } 
  }
  
  public void Dne(ySb paramySb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2, (float)paramDouble3 + 0.5F);
    Dne(paramySb.Dne(), paramDouble1, paramDouble2, paramDouble3, paramFloat);
    GL11.glPopMatrix();
  }
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((ySb)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FYH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */