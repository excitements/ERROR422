import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class Cit {
  private static FloatBuffer Dne = pZS.Dne(16);
  
  private static final chN Dne = chN.Dne(0.20000000298023224D, 1.0D, -0.699999988079071D).Dne();
  
  private static final chN FWm = chN.Dne(-0.20000000298023224D, 1.0D, 0.699999988079071D).Dne();
  
  private static FloatBuffer Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    Dne.clear();
    Dne.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
    Dne.flip();
    return (FloatBuffer)Dne;
  }
  
  public static void bzF() {
    GL11.glPushMatrix();
    GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(165.0F, 1.0F, 0.0F, 0.0F);
    FWm();
    GL11.glPopMatrix();
  }
  
  public static void FWm() {
    GL11.glEnable(2896);
    GL11.glEnable(16384);
    GL11.glEnable(16385);
    GL11.glEnable(2903);
    GL11.glColorMaterial(1032, 5634);
    float f1 = 0.4F;
    float f2 = 0.6F;
    float f3 = 0.0F;
    GL11.glLight(16384, 4611, Dne(Dne.Dne, Dne.FWm, Dne.bzF, 0.0D));
    GL11.glLight(16384, 4609, Dne(f2, f2, f2, 1.0F));
    GL11.glLight(16384, 4608, Dne(0.0F, 0.0F, 0.0F, 1.0F));
    GL11.glLight(16384, 4610, Dne(f3, f3, f3, 1.0F));
    GL11.glLight(16385, 4611, Dne(FWm.Dne, FWm.FWm, FWm.bzF, 0.0D));
    GL11.glLight(16385, 4609, Dne(f2, f2, f2, 1.0F));
    GL11.glLight(16385, 4608, Dne(0.0F, 0.0F, 0.0F, 1.0F));
    GL11.glLight(16385, 4610, Dne(f3, f3, f3, 1.0F));
    GL11.glShadeModel(7424);
    GL11.glLightModel(2899, Dne(f1, f1, f1, 1.0F));
  }
  
  private static FloatBuffer Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    return Dne((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4);
  }
  
  public static void Dne() {
    GL11.glDisable(2896);
    GL11.glDisable(16384);
    GL11.glDisable(16385);
    GL11.glDisable(2903);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Cit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */