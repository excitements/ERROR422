import java.util.Random;

public class fKu extends Twy {
  private int FWm;
  
  private NMq Dne;
  
  private int Dne = null;
  
  public static void Dne(Random paramRandom, fKu[] paramArrayOffKu, MqS paramMqS, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: iload_3
    //   6: if_icmpge -> 151
    //   9: aload_0
    //   10: aload_1
    //   11: invokestatic Dne : (Ljava/util/Random;[LTwy;)LTwy;
    //   14: checkcast fKu
    //   17: astore #5
    //   19: aload #5
    //   21: getfield Dne : I
    //   24: aload_0
    //   25: aload #5
    //   27: getfield FWm : I
    //   30: aload #5
    //   32: getfield Dne : I
    //   35: isub
    //   36: iconst_1
    //   37: iadd
    //   38: invokevirtual nextInt : (I)I
    //   41: iadd
    //   42: istore #6
    //   44: aload #5
    //   46: getfield Dne : LNMq;
    //   49: invokevirtual FWm : ()I
    //   52: iload #6
    //   54: if_icmplt -> 95
    //   57: aload #5
    //   59: getfield Dne : LNMq;
    //   62: invokevirtual Dne : ()LNMq;
    //   65: astore #7
    //   67: aload #7
    //   69: iload #6
    //   71: putfield Dne : I
    //   74: aload_2
    //   75: aload_0
    //   76: aload_2
    //   77: invokeinterface Qnq : ()I
    //   82: invokevirtual nextInt : (I)I
    //   85: aload #7
    //   87: invokeinterface Dne : (ILNMq;)V
    //   92: goto -> 145
    //   95: iconst_0
    //   96: istore #7
    //   98: iload #7
    //   100: iload #6
    //   102: if_icmpge -> 145
    //   105: aload #5
    //   107: getfield Dne : LNMq;
    //   110: invokevirtual Dne : ()LNMq;
    //   113: astore #8
    //   115: aload #8
    //   117: iconst_1
    //   118: putfield Dne : I
    //   121: aload_2
    //   122: aload_0
    //   123: aload_2
    //   124: invokeinterface Qnq : ()I
    //   129: invokevirtual nextInt : (I)I
    //   132: aload #8
    //   134: invokeinterface Dne : (ILNMq;)V
    //   139: iinc #7, 1
    //   142: goto -> 98
    //   145: iinc #4, 1
    //   148: goto -> 3
    //   151: return
  }
  
  public fKu(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super(paramInt5);
    this.Dne = new NMq(paramInt1, 1, paramInt2);
    this.Dne = paramInt3;
    this.FWm = paramInt4;
  }
  
  public fKu(NMq paramNMq, int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt3);
    this.Dne = paramNMq;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public static fKu[] Dne(fKu[] paramArrayOffKu1, fKu... paramVarArgs1) {
    fKu[] arrayOfFKu1 = new fKu[paramArrayOffKu1.length + paramVarArgs1.length];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOffKu1.length; b2++)
      arrayOfFKu1[b1++] = paramArrayOffKu1[b2]; 
    fKu[] arrayOfFKu2 = paramVarArgs1;
    int i = paramVarArgs1.length;
    for (byte b3 = 0; b3 < i; b3++) {
      fKu fKu1 = arrayOfFKu2[b3];
      arrayOfFKu1[b1++] = fKu1;
    } 
    return arrayOfFKu1;
  }
  
  public static void Dne(Random paramRandom, fKu[] paramArrayOffKu, UTs paramUTs, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: iload_3
    //   6: if_icmpge -> 143
    //   9: aload_0
    //   10: aload_1
    //   11: invokestatic Dne : (Ljava/util/Random;[LTwy;)LTwy;
    //   14: checkcast fKu
    //   17: astore #5
    //   19: aload #5
    //   21: getfield Dne : I
    //   24: aload_0
    //   25: aload #5
    //   27: getfield FWm : I
    //   30: aload #5
    //   32: getfield Dne : I
    //   35: isub
    //   36: iconst_1
    //   37: iadd
    //   38: invokevirtual nextInt : (I)I
    //   41: iadd
    //   42: istore #6
    //   44: aload #5
    //   46: getfield Dne : LNMq;
    //   49: invokevirtual FWm : ()I
    //   52: iload #6
    //   54: if_icmplt -> 91
    //   57: aload #5
    //   59: getfield Dne : LNMq;
    //   62: invokevirtual Dne : ()LNMq;
    //   65: astore #7
    //   67: aload #7
    //   69: iload #6
    //   71: putfield Dne : I
    //   74: aload_2
    //   75: aload_0
    //   76: aload_2
    //   77: invokevirtual Qnq : ()I
    //   80: invokevirtual nextInt : (I)I
    //   83: aload #7
    //   85: invokevirtual Dne : (ILNMq;)V
    //   88: goto -> 137
    //   91: iconst_0
    //   92: istore #7
    //   94: iload #7
    //   96: iload #6
    //   98: if_icmpge -> 137
    //   101: aload #5
    //   103: getfield Dne : LNMq;
    //   106: invokevirtual Dne : ()LNMq;
    //   109: astore #8
    //   111: aload #8
    //   113: iconst_1
    //   114: putfield Dne : I
    //   117: aload_2
    //   118: aload_0
    //   119: aload_2
    //   120: invokevirtual Qnq : ()I
    //   123: invokevirtual nextInt : (I)I
    //   126: aload #8
    //   128: invokevirtual Dne : (ILNMq;)V
    //   131: iinc #7, 1
    //   134: goto -> 94
    //   137: iinc #4, 1
    //   140: goto -> 3
    //   143: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fKu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */