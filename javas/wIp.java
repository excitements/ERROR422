import org.lwjgl.opengl.GL11;

public class wIp extends Jte {
  private wsR Dne = new wsR();
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((llR)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
  
  public void Dne(llR paramllR, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F, (float)paramDouble3 + 0.5F);
    float f1 = paramllR.Dne + paramFloat;
    GL11.glTranslatef(0.0F, 0.1F + geR.Dne(f1 * 0.1F) * 0.01F, 0.0F);
    float f2;
    for (f2 = paramllR.DyG - paramllR.div; f2 >= 3.1415927F; f2 -= 6.2831855F);
    while (f2 < -3.1415927F)
      f2 += 6.2831855F; 
    float f3 = paramllR.div + f2 * paramFloat;
    GL11.glRotatef(-f3 * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
    Dne("/item/book.png");
    float f4 = paramllR.FWm + (paramllR.Dne - paramllR.FWm) * paramFloat + 0.25F;
    float f5 = paramllR.FWm + (paramllR.Dne - paramllR.FWm) * paramFloat + 0.75F;
    f4 = (f4 - geR.Dne(f4)) * 1.6F - 0.3F;
    f5 = (f5 - geR.Dne(f5)) * 1.6F - 0.3F;
    if (f4 < 0.0F)
      f4 = 0.0F; 
    if (f5 < 0.0F)
      f5 = 0.0F; 
    if (f4 > 1.0F)
      f4 = 1.0F; 
    if (f5 > 1.0F)
      f5 = 1.0F; 
    float f6 = paramllR.zGp + (paramllR.aFZ - paramllR.zGp) * paramFloat;
    GL11.glEnable(2884);
    this.Dne.Dne((sMa)null, f1, f4, f5, f6, 0.0F, 0.0625F);
    GL11.glPopMatrix();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wIp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */