import java.nio.IntBuffer;

public class ofu {
  private IntBuffer Dne;
  
  private double bzF;
  
  private int bzF;
  
  private double Dne;
  
  private boolean Dne;
  
  private double FWm;
  
  private int FWm;
  
  private boolean FWm;
  
  private int Dne = pZS.Dne(65536);
  
  public ofu() {
    this.Dne = 0;
    this.FWm = false;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield Dne : Z
    //   5: aload_0
    //   6: getfield Dne : Ljava/nio/IntBuffer;
    //   9: invokevirtual clear : ()Ljava/nio/Buffer;
    //   12: pop
    //   13: aload_0
    //   14: iload_1
    //   15: putfield Dne : I
    //   18: aload_0
    //   19: iload_2
    //   20: putfield FWm : I
    //   23: aload_0
    //   24: iload_3
    //   25: putfield bzF : I
    //   28: aload_0
    //   29: dload #4
    //   31: putfield Dne : D
    //   34: aload_0
    //   35: dload #6
    //   37: putfield FWm : D
    //   40: aload_0
    //   41: dload #8
    //   43: putfield bzF : D
    //   46: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 86
    //   7: aload_0
    //   8: getfield FWm : Z
    //   11: ifne -> 27
    //   14: aload_0
    //   15: getfield Dne : Ljava/nio/IntBuffer;
    //   18: invokevirtual flip : ()Ljava/nio/Buffer;
    //   21: pop
    //   22: aload_0
    //   23: iconst_1
    //   24: putfield FWm : Z
    //   27: aload_0
    //   28: getfield Dne : Ljava/nio/IntBuffer;
    //   31: invokevirtual remaining : ()I
    //   34: ifle -> 86
    //   37: invokestatic glPushMatrix : ()V
    //   40: aload_0
    //   41: getfield Dne : I
    //   44: i2d
    //   45: aload_0
    //   46: getfield Dne : D
    //   49: dsub
    //   50: d2f
    //   51: aload_0
    //   52: getfield FWm : I
    //   55: i2d
    //   56: aload_0
    //   57: getfield FWm : D
    //   60: dsub
    //   61: d2f
    //   62: aload_0
    //   63: getfield bzF : I
    //   66: i2d
    //   67: aload_0
    //   68: getfield bzF : D
    //   71: dsub
    //   72: d2f
    //   73: invokestatic glTranslatef : (FFF)V
    //   76: aload_0
    //   77: getfield Dne : Ljava/nio/IntBuffer;
    //   80: invokestatic glCallLists : (Ljava/nio/IntBuffer;)V
    //   83: invokestatic glPopMatrix : ()V
    //   86: return
  }
  
  public void FWm() {
    this.Dne = 0;
    this.FWm = false;
  }
  
  public void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/nio/IntBuffer;
    //   4: iload_1
    //   5: invokevirtual put : (I)Ljava/nio/IntBuffer;
    //   8: pop
    //   9: aload_0
    //   10: getfield Dne : Ljava/nio/IntBuffer;
    //   13: invokevirtual remaining : ()I
    //   16: ifne -> 23
    //   19: aload_0
    //   20: invokevirtual Dne : ()V
    //   23: return
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    return (this.Dne == 0) ? false : ((paramInt1 == this.Dne && paramInt2 == this.FWm && paramInt3 == this.bzF));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ofu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */