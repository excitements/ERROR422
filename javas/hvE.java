import java.util.Random;

abstract class hvE extends bvz {
  protected final int FWm;
  
  protected final int Dne;
  
  protected final int bzF;
  
  protected int Qnq = -1;
  
  protected boolean Dne(Qnq paramQnq, CLK paramCLK, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Qnq : I
    //   4: iflt -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: iconst_0
    //   10: istore #4
    //   12: iconst_0
    //   13: istore #5
    //   15: aload_0
    //   16: getfield Dne : LCLK;
    //   19: getfield bzF : I
    //   22: istore #6
    //   24: iload #6
    //   26: aload_0
    //   27: getfield Dne : LCLK;
    //   30: getfield zGp : I
    //   33: if_icmpgt -> 108
    //   36: aload_0
    //   37: getfield Dne : LCLK;
    //   40: getfield Dne : I
    //   43: istore #7
    //   45: iload #7
    //   47: aload_0
    //   48: getfield Dne : LCLK;
    //   51: getfield Qnq : I
    //   54: if_icmpgt -> 102
    //   57: aload_2
    //   58: iload #7
    //   60: bipush #64
    //   62: iload #6
    //   64: invokevirtual Dne : (III)Z
    //   67: ifeq -> 96
    //   70: iload #4
    //   72: aload_1
    //   73: iload #7
    //   75: iload #6
    //   77: invokevirtual aFZ : (II)I
    //   80: aload_1
    //   81: getfield Dne : LJik;
    //   84: invokevirtual Dne : ()I
    //   87: invokestatic max : (II)I
    //   90: iadd
    //   91: istore #4
    //   93: iinc #5, 1
    //   96: iinc #7, 1
    //   99: goto -> 45
    //   102: iinc #6, 1
    //   105: goto -> 24
    //   108: iload #5
    //   110: ifne -> 115
    //   113: iconst_0
    //   114: ireturn
    //   115: aload_0
    //   116: iload #4
    //   118: iload #5
    //   120: idiv
    //   121: putfield Qnq : I
    //   124: aload_0
    //   125: getfield Dne : LCLK;
    //   128: iconst_0
    //   129: aload_0
    //   130: getfield Qnq : I
    //   133: aload_0
    //   134: getfield Dne : LCLK;
    //   137: getfield FWm : I
    //   140: isub
    //   141: iload_3
    //   142: iadd
    //   143: iconst_0
    //   144: invokevirtual Dne : (III)V
    //   147: iconst_1
    //   148: ireturn
  }
  
  protected hvE(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    super(0);
    this.Dne = paramInt4;
    this.FWm = paramInt5;
    this.bzF = paramInt6;
    this.aFZ = paramRandom.nextInt(4);
    switch (this.aFZ) {
      case 0:
      case 2:
        this.Dne = new CLK(paramInt1, paramInt2, paramInt3, paramInt1 + paramInt4 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt6 - 1);
        return;
    } 
    this.Dne = new CLK(paramInt1, paramInt2, paramInt3, paramInt1 + paramInt6 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt4 - 1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hvE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */