import org.lwjgl.input.Keyboard;

public class Lbz {
  public static int Dne;
  
  public static int FWm;
  
  private static boolean Dne;
  
  public static void Dne() {
    if (Keyboard.getEventKeyState()) {
      if (!Dne) {
        Dne = true;
        Dne++;
      } 
    } else {
      Dne = false;
    } 
    if (FWm >= Jcz.Dne(10)) {
      if (Dne < 20)
        QXI.Dne.Dne(new bze()); 
      Dne = false;
      FWm = 0;
    } 
    FWm++;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lbz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */