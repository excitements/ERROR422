public class zxJ {
  public static final int[] zGp;
  
  public static final int[] Qnq;
  
  public static final int[] aFZ;
  
  public static final int[][] Dne;
  
  public static final int[] Dne = new int[] { 0, -1, 0, 1 };
  
  public static final int[] DyG;
  
  public static final int[] bzF;
  
  public static final int[] FWm = new int[] { 1, 0, -1, 0 };
  
  public static final String[] Dne = new String[] { "SOUTH", "WEST", "NORTH", "EAST" };
  
  public static int Dne(double paramDouble1, double paramDouble2) {
    return (geR.Qnq((float)paramDouble1) > geR.Qnq((float)paramDouble2)) ? ((paramDouble1 > 0.0D) ? 1 : 3) : ((paramDouble2 > 0.0D) ? 2 : 0);
  }
  
  static {
    bzF = new int[] { 3, 4, 2, 5 };
    Qnq = new int[] { -1, -1, 2, 0, 1, 3 };
    aFZ = new int[] { 2, 3, 0, 1 };
    zGp = new int[] { 1, 2, 3, 0 };
    DyG = new int[] { 3, 0, 1, 2 };
    Dne = (String[])new int[][] { { 1, 0, 3, 2, 5, 4 }, { 1, 0, 5, 4, 2, 3 }, { 1, 0, 2, 3, 4, 5 }, { 1, 0, 4, 5, 3, 2 } };
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zxJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */