import org.lwjgl.opengl.GL11;

public class Uyd extends YAD {
  protected float Dne(oEB paramoEB, float paramFloat) {
    return paramoEB.XHL();
  }
  
  public Uyd(Gor paramGor1, Gor paramGor2, float paramFloat) {
    super(paramGor1, paramFloat);
    Dne(paramGor2);
  }
  
  protected float Dne(FUH paramFUH, float paramFloat) {
    return Dne((oEB)paramFUH, paramFloat);
  }
  
  protected int Dne(oEB paramoEB, int paramInt, float paramFloat) {
    if (paramInt == 0 && paramoEB.FYZ()) {
      float f = paramoEB.Dne(paramFloat) * paramoEB.bzF(paramFloat);
      Dne(paramoEB.bzF());
      GL11.glColor3f(f, f, f);
      return 1;
    } 
    if (paramInt == 1 && paramoEB.LVR()) {
      Dne("/mob/wolf_collar.png");
      float f = 1.0F;
      int i = paramoEB.qLR();
      GL11.glColor3f(f * Pvd.Dne[i][0], f * Pvd.Dne[i][1], f * Pvd.Dne[i][2]);
      return 1;
    } 
    return -1;
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((oEB)paramFUH, paramInt, paramFloat);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Uyd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */