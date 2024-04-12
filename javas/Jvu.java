import java.awt.Component;
import org.lwjgl.input.Mouse;

public class Jvu {
  public int FWm;
  
  public int Dne;
  
  private final fZI Dne;
  
  private final Component Dne;
  
  public Jvu(Component paramComponent, fZI paramfZI) {
    this.Dne = paramComponent;
    this.Dne = (Component)paramfZI;
  }
  
  public void bzF() {
    this.Dne = Mouse.getDX();
    this.FWm = Mouse.getDY();
  }
  
  public void Dne() {
    Mouse.setGrabbed(true);
    this.Dne = false;
    this.FWm = 0;
  }
  
  public void FWm() {
    int i = this.Dne.getWidth();
    int j = this.Dne.getHeight();
    if (this.Dne.getParent() != null) {
      i = this.Dne.getParent().getWidth();
      j = this.Dne.getParent().getHeight();
    } 
    Mouse.setCursorPosition(i / 2, j / 2);
    Mouse.setGrabbed(false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Jvu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */