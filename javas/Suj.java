import java.util.Random;

public class Suj {
  protected Random Dne;
  
  protected Qnq Dne;
  
  protected int Dne = 8;
  
  public Suj() {
    this.Dne = new Random();
  }
  
  public void Dne(ZfC paramZfC, Qnq paramQnq, int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: istore #6
    //   6: aload_0
    //   7: aload_2
    //   8: putfield Dne : LQnq;
    //   11: aload_0
    //   12: getfield Dne : Ljava/util/Random;
    //   15: aload_2
    //   16: invokevirtual Dne : ()J
    //   19: invokevirtual setSeed : (J)V
    //   22: aload_0
    //   23: getfield Dne : Ljava/util/Random;
    //   26: invokevirtual nextLong : ()J
    //   29: lstore #7
    //   31: aload_0
    //   32: getfield Dne : Ljava/util/Random;
    //   35: invokevirtual nextLong : ()J
    //   38: lstore #9
    //   40: iload_3
    //   41: iload #6
    //   43: isub
    //   44: istore #11
    //   46: iload #11
    //   48: iload_3
    //   49: iload #6
    //   51: iadd
    //   52: if_icmpgt -> 131
    //   55: iload #4
    //   57: iload #6
    //   59: isub
    //   60: istore #12
    //   62: iload #12
    //   64: iload #4
    //   66: iload #6
    //   68: iadd
    //   69: if_icmpgt -> 125
    //   72: iload #11
    //   74: i2l
    //   75: lload #7
    //   77: lmul
    //   78: lstore #13
    //   80: iload #12
    //   82: i2l
    //   83: lload #9
    //   85: lmul
    //   86: lstore #15
    //   88: aload_0
    //   89: getfield Dne : Ljava/util/Random;
    //   92: lload #13
    //   94: lload #15
    //   96: lxor
    //   97: aload_2
    //   98: invokevirtual Dne : ()J
    //   101: lxor
    //   102: invokevirtual setSeed : (J)V
    //   105: aload_0
    //   106: aload_2
    //   107: iload #11
    //   109: iload #12
    //   111: iload_3
    //   112: iload #4
    //   114: aload #5
    //   116: invokevirtual Dne : (LQnq;IIII[B)V
    //   119: iinc #12, 1
    //   122: goto -> 62
    //   125: iinc #11, 1
    //   128: goto -> 46
    //   131: return
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfbyte) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Suj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */