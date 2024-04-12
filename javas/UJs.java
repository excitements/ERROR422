import org.lwjgl.opengl.GL11;

public class UJs extends YAD {
  protected int Dne(Pvd paramPvd, int paramInt, float paramFloat) {
    if (paramInt == 0 && !paramPvd.LVR()) {
      Dne("/mob/sheep_fur.png");
      float f = 1.0F;
      int i = paramPvd.qLR();
      GL11.glColor3f(f * Pvd.Dne[i][0], f * Pvd.Dne[i][1], f * Pvd.Dne[i][2]);
      return 1;
    } 
    return -1;
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((Pvd)paramFUH, paramInt, paramFloat);
  }
  
  public UJs(Gor paramGor1, Gor paramGor2, float paramFloat) {
    super(paramGor1, paramFloat);
    Dne(paramGor2);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UJs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */