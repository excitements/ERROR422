import java.util.concurrent.Callable;

class oeZ implements Callable {
  final int FWm;
  
  final sAy Dne;
  
  final int Dne;
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LsAy;
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: aload_0
    //   9: getfield FWm : I
    //   12: invokevirtual Dne : (II)Z
    //   15: ifeq -> 23
    //   18: ldc 'True'
    //   20: goto -> 25
    //   23: ldc 'False'
    //   25: areturn
  }
  
  oeZ(sAy paramsAy, int paramInt1, int paramInt2) {
    this.Dne = paramsAy;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oeZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */