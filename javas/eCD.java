import java.util.Random;

public class eCD {
  public static Random Dne = new Random();
  
  public static long Dne(int paramInt1, int paramInt2) {
    return (Dne.nextInt(paramInt2 - paramInt1) + paramInt1);
  }
  
  public static int Dne(int paramInt) {
    return Dne.nextInt(paramInt);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eCD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */