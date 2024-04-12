import java.util.ArrayList;
import java.util.List;

public class zjJ {
  private final List Dne;
  
  private final int FWm;
  
  private int bzF = 0;
  
  private int aFZ = 0;
  
  private int Qnq = 0;
  
  private final int Dne = new ArrayList();
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: ireturn
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : I
    //   4: aload_0
    //   5: getfield Qnq : I
    //   8: if_icmple -> 19
    //   11: aload_0
    //   12: aload_0
    //   13: getfield bzF : I
    //   16: putfield Qnq : I
    //   19: aload_0
    //   20: dup
    //   21: getfield aFZ : I
    //   24: dup_x1
    //   25: iconst_1
    //   26: iadd
    //   27: putfield aFZ : I
    //   30: aload_0
    //   31: getfield Dne : I
    //   34: if_icmpne -> 96
    //   37: aload_0
    //   38: getfield Qnq : I
    //   41: aload_0
    //   42: getfield Dne : Ljava/util/List;
    //   45: invokeinterface size : ()I
    //   50: aload_0
    //   51: getfield FWm : I
    //   54: isub
    //   55: invokestatic max : (II)I
    //   58: istore_1
    //   59: aload_0
    //   60: getfield Dne : Ljava/util/List;
    //   63: invokeinterface size : ()I
    //   68: iload_1
    //   69: if_icmple -> 86
    //   72: aload_0
    //   73: getfield Dne : Ljava/util/List;
    //   76: iload_1
    //   77: invokeinterface remove : (I)Ljava/lang/Object;
    //   82: pop
    //   83: goto -> 59
    //   86: aload_0
    //   87: iconst_0
    //   88: putfield Qnq : I
    //   91: aload_0
    //   92: iconst_0
    //   93: putfield aFZ : I
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield bzF : I
    //   101: return
  }
  
  public zjJ(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield bzF : I
    //   5: aload_0
    //   6: getfield Dne : Ljava/util/List;
    //   9: invokeinterface clear : ()V
    //   14: return
  }
  
  public int FWm() {
    return this.bzF;
  }
  
  public bSp Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : I
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: if_icmplt -> 50
    //   16: new bSp
    //   19: dup
    //   20: dload_1
    //   21: dload_3
    //   22: dload #5
    //   24: dload #7
    //   26: dload #9
    //   28: dload #11
    //   30: invokespecial <init> : (DDDDDD)V
    //   33: astore #13
    //   35: aload_0
    //   36: getfield Dne : Ljava/util/List;
    //   39: aload #13
    //   41: invokeinterface add : (Ljava/lang/Object;)Z
    //   46: pop
    //   47: goto -> 84
    //   50: aload_0
    //   51: getfield Dne : Ljava/util/List;
    //   54: aload_0
    //   55: getfield bzF : I
    //   58: invokeinterface get : (I)Ljava/lang/Object;
    //   63: checkcast bSp
    //   66: astore #13
    //   68: aload #13
    //   70: dload_1
    //   71: dload_3
    //   72: dload #5
    //   74: dload #7
    //   76: dload #9
    //   78: dload #11
    //   80: invokevirtual FWm : (DDDDDD)LbSp;
    //   83: pop
    //   84: aload_0
    //   85: dup
    //   86: getfield bzF : I
    //   89: iconst_1
    //   90: iadd
    //   91: putfield bzF : I
    //   94: aload #13
    //   96: areturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zjJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */