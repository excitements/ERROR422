import java.util.List;
import java.util.Random;

public class UBI extends ram {
  private int Dne = -1;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifge -> 51
    //   7: aload_0
    //   8: aload_0
    //   9: aload_1
    //   10: aload_3
    //   11: invokevirtual Dne : (LQnq;LCLK;)I
    //   14: putfield Dne : I
    //   17: aload_0
    //   18: getfield Dne : I
    //   21: ifge -> 26
    //   24: iconst_1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield Dne : LCLK;
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield Dne : I
    //   35: aload_0
    //   36: getfield Dne : LCLK;
    //   39: getfield aFZ : I
    //   42: isub
    //   43: iconst_4
    //   44: iadd
    //   45: iconst_1
    //   46: isub
    //   47: iconst_0
    //   48: invokevirtual Dne : (III)V
    //   51: aload_0
    //   52: aload_1
    //   53: aload_3
    //   54: iconst_0
    //   55: iconst_0
    //   56: iconst_0
    //   57: iconst_2
    //   58: iconst_3
    //   59: iconst_1
    //   60: iconst_0
    //   61: iconst_0
    //   62: iconst_0
    //   63: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   66: aload_0
    //   67: aload_1
    //   68: getstatic zKP.sly : LzKP;
    //   71: getfield FWm : I
    //   74: iconst_0
    //   75: iconst_1
    //   76: iconst_0
    //   77: iconst_0
    //   78: aload_3
    //   79: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   82: aload_0
    //   83: aload_1
    //   84: getstatic zKP.sly : LzKP;
    //   87: getfield FWm : I
    //   90: iconst_0
    //   91: iconst_1
    //   92: iconst_1
    //   93: iconst_0
    //   94: aload_3
    //   95: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   98: aload_0
    //   99: aload_1
    //   100: getstatic zKP.sly : LzKP;
    //   103: getfield FWm : I
    //   106: iconst_0
    //   107: iconst_1
    //   108: iconst_2
    //   109: iconst_0
    //   110: aload_3
    //   111: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   114: aload_0
    //   115: aload_1
    //   116: getstatic zKP.RPx : LzKP;
    //   119: getfield FWm : I
    //   122: bipush #15
    //   124: iconst_1
    //   125: iconst_3
    //   126: iconst_0
    //   127: aload_3
    //   128: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   131: aload_0
    //   132: aload_1
    //   133: getstatic zKP.Wwe : LzKP;
    //   136: getfield FWm : I
    //   139: iconst_0
    //   140: iconst_0
    //   141: iconst_3
    //   142: iconst_0
    //   143: aload_3
    //   144: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   147: aload_0
    //   148: aload_1
    //   149: getstatic zKP.Wwe : LzKP;
    //   152: getfield FWm : I
    //   155: iconst_0
    //   156: iconst_1
    //   157: iconst_3
    //   158: iconst_1
    //   159: aload_3
    //   160: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   163: aload_0
    //   164: aload_1
    //   165: getstatic zKP.Wwe : LzKP;
    //   168: getfield FWm : I
    //   171: iconst_0
    //   172: iconst_2
    //   173: iconst_3
    //   174: iconst_0
    //   175: aload_3
    //   176: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   179: aload_0
    //   180: aload_1
    //   181: getstatic zKP.Wwe : LzKP;
    //   184: getfield FWm : I
    //   187: iconst_0
    //   188: iconst_1
    //   189: iconst_3
    //   190: iconst_m1
    //   191: aload_3
    //   192: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   195: iconst_1
    //   196: ireturn
  }
  
  public UBI(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public static CLK Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 3, 4, 2, paramInt4);
    return (bvz.Dne(paramList, cLK) != null) ? null : cLK;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UBI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */