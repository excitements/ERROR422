import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;

public class oCF {
  public static int Dne;
  
  public static int FWm;
  
  private static boolean Dne = false;
  
  public static void Dne(int paramInt) {
    if (Dne) {
      ARBMultitexture.glActiveTextureARB(paramInt);
    } else {
      GL13.glActiveTexture(paramInt);
    } 
  }
  
  public static void Dne(int paramInt, float paramFloat1, float paramFloat2) {
    if (Dne) {
      ARBMultitexture.glMultiTexCoord2fARB(paramInt, paramFloat1, paramFloat2);
    } else {
      GL13.glMultiTexCoord2f(paramInt, paramFloat1, paramFloat2);
    } 
  }
  
  public static void FWm(int paramInt) {
    if (Dne) {
      ARBMultitexture.glClientActiveTextureARB(paramInt);
    } else {
      GL13.glClientActiveTexture(paramInt);
    } 
  }
  
  public static void Dne() {
    Dne = ((GLContext.getCapabilities()).GL_ARB_multitexture && !(GLContext.getCapabilities()).OpenGL13);
    if (Dne) {
      Dne = true;
      FWm = 33985;
    } else {
      Dne = true;
      FWm = 33985;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oCF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */