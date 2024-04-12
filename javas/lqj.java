import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class lqj {
  public static float DyG;
  
  public static float bzF;
  
  public static float zGp;
  
  public static float Qnq;
  
  public static float div;
  
  private static FloatBuffer Dne;
  
  public static float FWm;
  
  private static FloatBuffer FWm;
  
  private static FloatBuffer bzF;
  
  public static float aFZ;
  
  private static IntBuffer Dne;
  
  public static float Dne = 0.0F;
  
  public static chN Dne(FUH paramFUH, double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield aFZ : D
    //   4: aload_0
    //   5: getfield div : D
    //   8: aload_0
    //   9: getfield aFZ : D
    //   12: dsub
    //   13: dload_1
    //   14: dmul
    //   15: dadd
    //   16: dstore_3
    //   17: aload_0
    //   18: getfield zGp : D
    //   21: aload_0
    //   22: getfield IjH : D
    //   25: aload_0
    //   26: getfield zGp : D
    //   29: dsub
    //   30: dload_1
    //   31: dmul
    //   32: dadd
    //   33: aload_0
    //   34: invokevirtual c_ : ()F
    //   37: f2d
    //   38: dadd
    //   39: dstore #5
    //   41: aload_0
    //   42: getfield DyG : D
    //   45: aload_0
    //   46: getfield mrb : D
    //   49: aload_0
    //   50: getfield DyG : D
    //   53: dsub
    //   54: dload_1
    //   55: dmul
    //   56: dadd
    //   57: dstore #7
    //   59: dload_3
    //   60: getstatic lqj.Dne : F
    //   63: fconst_1
    //   64: fmul
    //   65: f2d
    //   66: dadd
    //   67: dstore #9
    //   69: dload #5
    //   71: getstatic lqj.FWm : F
    //   74: fconst_1
    //   75: fmul
    //   76: f2d
    //   77: dadd
    //   78: dstore #11
    //   80: dload #7
    //   82: getstatic lqj.bzF : F
    //   85: fconst_1
    //   86: fmul
    //   87: f2d
    //   88: dadd
    //   89: dstore #13
    //   91: aload_0
    //   92: getfield Dne : LQnq;
    //   95: invokevirtual Dne : ()LziS;
    //   98: dload #9
    //   100: dload #11
    //   102: dload #13
    //   104: invokevirtual Dne : (DDD)LchN;
    //   107: areturn
  }
  
  public static void Dne(FiG paramFiG, boolean paramBoolean) {
    // Byte code:
    //   0: sipush #2982
    //   3: getstatic lqj.Dne : Ljava/nio/FloatBuffer;
    //   6: invokestatic glGetFloat : (ILjava/nio/FloatBuffer;)V
    //   9: sipush #2983
    //   12: getstatic lqj.FWm : Ljava/nio/FloatBuffer;
    //   15: invokestatic glGetFloat : (ILjava/nio/FloatBuffer;)V
    //   18: sipush #2978
    //   21: getstatic lqj.Dne : Ljava/nio/IntBuffer;
    //   24: invokestatic glGetInteger : (ILjava/nio/IntBuffer;)V
    //   27: getstatic lqj.Dne : Ljava/nio/IntBuffer;
    //   30: iconst_0
    //   31: invokevirtual get : (I)I
    //   34: getstatic lqj.Dne : Ljava/nio/IntBuffer;
    //   37: iconst_2
    //   38: invokevirtual get : (I)I
    //   41: iadd
    //   42: iconst_2
    //   43: idiv
    //   44: i2f
    //   45: fstore_2
    //   46: getstatic lqj.Dne : Ljava/nio/IntBuffer;
    //   49: iconst_1
    //   50: invokevirtual get : (I)I
    //   53: getstatic lqj.Dne : Ljava/nio/IntBuffer;
    //   56: iconst_3
    //   57: invokevirtual get : (I)I
    //   60: iadd
    //   61: iconst_2
    //   62: idiv
    //   63: i2f
    //   64: fstore_3
    //   65: fload_2
    //   66: fload_3
    //   67: fconst_0
    //   68: getstatic lqj.Dne : Ljava/nio/FloatBuffer;
    //   71: getstatic lqj.FWm : Ljava/nio/FloatBuffer;
    //   74: getstatic lqj.Dne : Ljava/nio/IntBuffer;
    //   77: getstatic lqj.bzF : Ljava/nio/FloatBuffer;
    //   80: invokestatic gluUnProject : (FFFLjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Ljava/nio/IntBuffer;Ljava/nio/FloatBuffer;)Z
    //   83: pop
    //   84: getstatic lqj.bzF : Ljava/nio/FloatBuffer;
    //   87: iconst_0
    //   88: invokevirtual get : (I)F
    //   91: putstatic lqj.Dne : F
    //   94: getstatic lqj.bzF : Ljava/nio/FloatBuffer;
    //   97: iconst_1
    //   98: invokevirtual get : (I)F
    //   101: putstatic lqj.FWm : F
    //   104: getstatic lqj.bzF : Ljava/nio/FloatBuffer;
    //   107: iconst_2
    //   108: invokevirtual get : (I)F
    //   111: putstatic lqj.bzF : F
    //   114: iload_1
    //   115: ifeq -> 122
    //   118: iconst_1
    //   119: goto -> 123
    //   122: iconst_0
    //   123: istore #4
    //   125: aload_0
    //   126: getfield XHL : F
    //   129: fstore #5
    //   131: aload_0
    //   132: getfield mrb : F
    //   135: fstore #6
    //   137: fload #6
    //   139: ldc 3.1415927
    //   141: fmul
    //   142: ldc 180.0
    //   144: fdiv
    //   145: invokestatic FWm : (F)F
    //   148: iconst_1
    //   149: iload #4
    //   151: iconst_2
    //   152: imul
    //   153: isub
    //   154: i2f
    //   155: fmul
    //   156: putstatic lqj.Qnq : F
    //   159: fload #6
    //   161: ldc 3.1415927
    //   163: fmul
    //   164: ldc 180.0
    //   166: fdiv
    //   167: invokestatic Dne : (F)F
    //   170: iconst_1
    //   171: iload #4
    //   173: iconst_2
    //   174: imul
    //   175: isub
    //   176: i2f
    //   177: fmul
    //   178: putstatic lqj.zGp : F
    //   181: getstatic lqj.zGp : F
    //   184: fneg
    //   185: fload #5
    //   187: ldc 3.1415927
    //   189: fmul
    //   190: ldc 180.0
    //   192: fdiv
    //   193: invokestatic Dne : (F)F
    //   196: fmul
    //   197: iconst_1
    //   198: iload #4
    //   200: iconst_2
    //   201: imul
    //   202: isub
    //   203: i2f
    //   204: fmul
    //   205: putstatic lqj.DyG : F
    //   208: getstatic lqj.Qnq : F
    //   211: fload #5
    //   213: ldc 3.1415927
    //   215: fmul
    //   216: ldc 180.0
    //   218: fdiv
    //   219: invokestatic Dne : (F)F
    //   222: fmul
    //   223: iconst_1
    //   224: iload #4
    //   226: iconst_2
    //   227: imul
    //   228: isub
    //   229: i2f
    //   230: fmul
    //   231: putstatic lqj.div : F
    //   234: fload #5
    //   236: ldc 3.1415927
    //   238: fmul
    //   239: ldc 180.0
    //   241: fdiv
    //   242: invokestatic FWm : (F)F
    //   245: putstatic lqj.aFZ : F
    //   248: return
  }
  
  static {
    FWm = 0.0F;
    bzF = 0.0F;
    Dne = pZS.Dne(16);
    Dne = pZS.Dne(16);
    FWm = pZS.Dne(16);
    bzF = pZS.Dne(3);
  }
  
  public static int Dne(Qnq paramQnq, FUH paramFUH, float paramFloat) {
    chN chN = Dne(paramFUH, paramFloat);
    EyB eyB = new EyB(chN);
    int i = paramQnq.Dne(eyB.Dne, eyB.FWm, eyB.bzF);
    if (i != 0 && (zKP.Dne[i]).Dne.Qnq()) {
      float f1 = byt.Dne(paramQnq.bzF(eyB.Dne, eyB.FWm, eyB.bzF)) - 0.11111111F;
      float f2 = (eyB.FWm + 1) - f1;
      if (chN.FWm >= f2)
        i = paramQnq.Dne(eyB.Dne, eyB.FWm + 1, eyB.bzF); 
    } 
    return i;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */