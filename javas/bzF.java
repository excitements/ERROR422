public class bzF {
  private static int[] Dne = new int[65536];
  
  public static void Dne(int[] paramArrayOfint) {
    Dne = paramArrayOfint;
  }
  
  public static int Dne(double paramDouble1, double paramDouble2) {
    paramDouble2 *= paramDouble1;
    int i = (int)((1.0D - paramDouble1) * 255.0D);
    int j = (int)((1.0D - paramDouble2) * 255.0D);
    return Dne[j << 8 | i];
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bzF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */