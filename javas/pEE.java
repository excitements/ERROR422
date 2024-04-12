import java.util.Calendar;
import org.lwjgl.opengl.GL11;

public class pEE extends Jte {
  private XLo Dne;
  
  private XLo FWm = new BRL();
  
  private boolean Dne = new XLo();
  
  public void Dne(GON paramGON, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    int i;
    if (!paramGON.Qnq()) {
      i = 0;
    } else {
      zKP zKP = paramGON.Dne();
      i = paramGON.zGp();
      if (zKP instanceof gHK && i == 0) {
        ((gHK)zKP).bzF(paramGON.Dne(), paramGON.Qnq, paramGON.aFZ, paramGON.zGp);
        i = paramGON.zGp();
      } 
      paramGON.aFZ();
    } 
    if (paramGON.Dne == null && paramGON.bzF == null) {
      XLo xLo;
      if (paramGON.FWm == null && paramGON.Qnq == null) {
        boolean bool = this.Dne;
        if (paramGON.Dne() == 1) {
          Dne("/item/chests/trap_small.png");
        } else if (this.Dne) {
          Dne("/item/xmaschest.png");
        } else {
          Dne("/item/chest.png");
        } 
      } else {
        xLo = this.FWm;
        if (paramGON.Dne() == 1) {
          Dne("/item/chests/trap_large.png");
        } else if (this.Dne) {
          Dne("/item/largexmaschest.png");
        } else {
          Dne("/item/largechest.png");
        } 
      } 
      GL11.glPushMatrix();
      GL11.glEnable(32826);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + 1.0F, (float)paramDouble3 + 1.0F);
      GL11.glScalef(1.0F, -1.0F, -1.0F);
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      short s = 0;
      if (i == 2)
        s = 180; 
      if (i == 3)
        s = 0; 
      if (i == 4)
        s = 90; 
      if (i == 5)
        s = -90; 
      if (i == 2 && paramGON.FWm != null)
        GL11.glTranslatef(1.0F, 0.0F, 0.0F); 
      if (i == 5 && paramGON.Qnq != null)
        GL11.glTranslatef(0.0F, 0.0F, -1.0F); 
      GL11.glRotatef(s, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
      float f = paramGON.FWm + (paramGON.Dne - paramGON.FWm) * paramFloat;
      if (paramGON.Dne != null) {
        float f1 = paramGON.Dne.FWm + (paramGON.Dne.Dne - paramGON.Dne.FWm) * paramFloat;
        if (f1 > f)
          f = f1; 
      } 
      if (paramGON.bzF != null) {
        float f1 = paramGON.bzF.FWm + (paramGON.bzF.Dne - paramGON.bzF.FWm) * paramFloat;
        if (f1 > f)
          f = f1; 
      } 
      f = 1.0F - f;
      f = 1.0F - f * f * f;
      xLo.Dne.zGp = -(f * 3.1415927F / 2.0F);
      xLo.Dne();
      GL11.glDisable(32826);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    } 
  }
  
  public pEE() {
    Calendar calendar = Calendar.getInstance();
    if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26)
      this.Dne = true; 
  }
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((GON)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pEE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */