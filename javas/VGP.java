import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

public class VGP implements fwN {
  private int[] Dne;
  
  private int Dne;
  
  private int FWm;
  
  private boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (int i = paramInt1; i < paramInt3; i++) {
      for (int j = paramInt2; j < paramInt4; j++) {
        int k = this.Dne[i + j * this.Dne];
        if ((k >> 24 & 0xFF) < 128)
          return true; 
      } 
    } 
    return false;
  }
  
  private void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: iload_3
    //   4: iload #4
    //   6: invokespecial Dne : (IIII)Z
    //   9: ifne -> 63
    //   12: iload_1
    //   13: istore #5
    //   15: iload #5
    //   17: iload_3
    //   18: if_icmpge -> 63
    //   21: iload_2
    //   22: istore #6
    //   24: iload #6
    //   26: iload #4
    //   28: if_icmpge -> 57
    //   31: aload_0
    //   32: getfield Dne : [I
    //   35: iload #5
    //   37: iload #6
    //   39: aload_0
    //   40: getfield Dne : I
    //   43: imul
    //   44: iadd
    //   45: dup2
    //   46: iaload
    //   47: ldc 16777215
    //   49: iand
    //   50: iastore
    //   51: iinc #6, 1
    //   54: goto -> 24
    //   57: iinc #5, 1
    //   60: goto -> 15
    //   63: return
  }
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_1
    //   1: istore #5
    //   3: iload #5
    //   5: iload_3
    //   6: if_icmpge -> 51
    //   9: iload_2
    //   10: istore #6
    //   12: iload #6
    //   14: iload #4
    //   16: if_icmpge -> 45
    //   19: aload_0
    //   20: getfield Dne : [I
    //   23: iload #5
    //   25: iload #6
    //   27: aload_0
    //   28: getfield Dne : I
    //   31: imul
    //   32: iadd
    //   33: dup2
    //   34: iaload
    //   35: ldc -16777216
    //   37: ior
    //   38: iastore
    //   39: iinc #6, 1
    //   42: goto -> 12
    //   45: iinc #5, 1
    //   48: goto -> 3
    //   51: return
  }
  
  public BufferedImage Dne(BufferedImage paramBufferedImage) {
    if (paramBufferedImage == null)
      return null; 
    this.Dne = 64;
    this.FWm = 32;
    BufferedImage bufferedImage = new BufferedImage(this.Dne, this.FWm, 2);
    Graphics graphics = bufferedImage.getGraphics();
    graphics.drawImage(paramBufferedImage, 0, 0, (ImageObserver)null);
    graphics.dispose();
    this.Dne = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
    FWm(0, 0, 32, 16);
    Dne(32, 0, 64, 32);
    FWm(0, 16, 64, 32);
    boolean bool = false;
    byte b;
    for (b = 32; b < 64; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        int i = this.Dne[b + b1 * 64];
        if ((i >> 24 & 0xFF) < 128)
          bool = true; 
      } 
    } 
    if (!bool)
      for (b = 32; b < 64; b++) {
        for (byte b1 = 0; b1 < 16; b1++) {
          int i = this.Dne[b + b1 * 64];
          if ((i >> 24 & 0xFF) < 128)
            bool = true; 
        } 
      }  
    return bufferedImage;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VGP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */