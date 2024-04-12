import java.util.Random;

public class geR {
  private static float[] Dne = new float[65536];
  
  public static final float Dne(double paramDouble) {
    return (float)Math.sqrt(paramDouble);
  }
  
  public static float Qnq(float paramFloat) {
    return (paramFloat >= 0.0F) ? paramFloat : -paramFloat;
  }
  
  public static int Dne(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  public static int Dne(float paramFloat) {
    int i = (int)paramFloat;
    return (paramFloat < i) ? (i - 1) : i;
  }
  
  public static int FWm(double paramDouble) {
    int i = (int)paramDouble;
    return (paramDouble < i) ? (i - 1) : i;
  }
  
  public static long Dne(double paramDouble) {
    long l = (long)paramDouble;
    return (paramDouble < l) ? (l - 1L) : l;
  }
  
  public static int FWm(float paramFloat) {
    int i = (int)paramFloat;
    return (paramFloat > i) ? (i + 1) : i;
  }
  
  public static int Dne(String paramString, int paramInt1, int paramInt2) {
    int i = paramInt1;
    try {
      i = Integer.parseInt(paramString);
    } catch (Throwable throwable) {}
    if (i < paramInt2)
      i = paramInt2; 
    return i;
  }
  
  public static boolean Dne(String paramString) {
    return (paramString == null || paramString.length() == 0);
  }
  
  public static double Dne(long[] paramArrayOflong) {
    long l = 0L;
    long[] arrayOfLong = paramArrayOflong;
    int i = paramArrayOflong.length;
    for (byte b = 0; b < i; b++) {
      long l1 = arrayOfLong[b];
      l += l1;
    } 
    return l / paramArrayOflong.length;
  }
  
  public static final float FWm(float paramFloat) {
    return Dne[(int)(paramFloat * 10430.378F + 16384.0F) & 0xFFFF];
  }
  
  public static double Dne(double paramDouble1, double paramDouble2) {
    if (paramDouble1 < 0.0D)
      paramDouble1 = -paramDouble1; 
    if (paramDouble2 < 0.0D)
      paramDouble2 = -paramDouble2; 
    return (paramDouble1 > paramDouble2) ? paramDouble1 : paramDouble2;
  }
  
  public static float Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 < paramFloat2) ? paramFloat2 : ((paramFloat1 > paramFloat3) ? paramFloat3 : paramFloat1);
  }
  
  public static int Dne(String paramString, int paramInt) {
    int i = paramInt;
    try {
      i = Integer.parseInt(paramString);
    } catch (Throwable throwable) {}
    return i;
  }
  
  public static int Dne(Random paramRandom, int paramInt1, int paramInt2) {
    return (paramInt1 >= paramInt2) ? paramInt1 : (paramRandom.nextInt(paramInt2 - paramInt1 + 1) + paramInt1);
  }
  
  public static final float bzF(float paramFloat) {
    return (float)Math.sqrt(paramFloat);
  }
  
  public static int bzF(double paramDouble) {
    int i = (int)paramDouble;
    return (paramDouble > i) ? (i + 1) : i;
  }
  
  static {
    for (byte b = 0; b < 65536; b++)
      Dne[b] = (float)Math.sin(b * Math.PI * 2.0D / 65536.0D); 
  }
  
  public static int Dne(int paramInt1, int paramInt2) {
    return (paramInt1 < 0) ? (-((-paramInt1 - 1) / paramInt2) - 1) : (paramInt1 / paramInt2);
  }
  
  public static double Dne(double paramDouble) {
    paramDouble %= 360.0D;
    if (paramDouble >= 180.0D)
      paramDouble -= 360.0D; 
    if (paramDouble < -180.0D)
      paramDouble += 360.0D; 
    return paramDouble;
  }
  
  public static double Dne(Random paramRandom, double paramDouble1, double paramDouble2) {
    return (paramDouble1 >= paramDouble2) ? paramDouble1 : (paramRandom.nextDouble() * (paramDouble2 - paramDouble1) + paramDouble1);
  }
  
  public static double Dne(String paramString, double paramDouble1, double paramDouble2) {
    double d = paramDouble1;
    try {
      d = Double.parseDouble(paramString);
    } catch (Throwable throwable) {}
    if (d < paramDouble2)
      d = paramDouble2; 
    return d;
  }
  
  public static float aFZ(float paramFloat) {
    paramFloat %= 360.0F;
    if (paramFloat >= 180.0F)
      paramFloat -= 360.0F; 
    if (paramFloat < -180.0F)
      paramFloat += 360.0F; 
    return paramFloat;
  }
  
  public static int Dne(int paramInt) {
    return (paramInt >= 0) ? paramInt : -paramInt;
  }
  
  public static final float Dne(float paramFloat) {
    return Dne[(int)(paramFloat * 10430.378F) & 0xFFFF];
  }
  
  public static double Dne(String paramString, double paramDouble) {
    double d = paramDouble;
    try {
      d = Double.parseDouble(paramString);
    } catch (Throwable throwable) {}
    return d;
  }
  
  public static int Dne(double paramDouble) {
    return (int)(paramDouble + 1024.0D) - 1024;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\geR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */