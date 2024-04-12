import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class FTG implements Callable {
  final int Dne;
  
  final int FWm;
  
  final OEA Dne;
  
  FTG(OEA paramOEA, int paramInt1, int paramInt2) {
    this.Dne = paramOEA;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public String Dne() {
    return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", new Object[] { Integer.valueOf(this.Dne), Integer.valueOf(this.FWm), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY()) });
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FTG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */