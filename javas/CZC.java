import java.io.ByteArrayOutputStream;

class CZC extends ByteArrayOutputStream {
  final iNQ Dne;
  
  private int Dne;
  
  private int FWm;
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LiNQ;
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: aload_0
    //   9: getfield FWm : I
    //   12: aload_0
    //   13: getfield buf : [B
    //   16: aload_0
    //   17: getfield count : I
    //   20: invokevirtual Dne : (II[BI)V
    //   23: return
  }
  
  public CZC(iNQ paramiNQ, int paramInt1, int paramInt2) {
    super(8096);
    this.Dne = paramiNQ;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CZC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */