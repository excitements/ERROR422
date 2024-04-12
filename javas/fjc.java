import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public final class fjc extends WindowAdapter {
  static {
  
  }
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    System.err.println("Someone is closing me!");
    System.exit(1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fjc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */