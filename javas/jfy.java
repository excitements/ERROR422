import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;

class jfy extends Canvas {
  private BufferedImage Dne;
  
  public jfy() {
    try {
      this.Dne = ImageIO.read(cbQ.class.getResource("/gui/crash_logo.png"));
    } catch (IOException iOException) {}
    byte b = 100;
    setPreferredSize(new Dimension(b, b));
    setMinimumSize(new Dimension(b, b));
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.drawImage(this.Dne, getWidth() / 2 - this.Dne.getWidth() / 2, 32, (ImageObserver)null);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jfy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */