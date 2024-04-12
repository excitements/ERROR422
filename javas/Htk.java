public class Htk extends SmS {
  int Qnq;
  
  boolean FWm;
  
  public void bzF() {
    this.Qnq--;
    super.bzF();
  }
  
  public Htk(FUH paramFUH, boolean paramBoolean) {
    super(paramFUH);
    this.Dne = paramFUH;
    this.FWm = paramBoolean;
  }
  
  public boolean FWm() {
    return (this.FWm && this.Qnq > 0 && super.FWm());
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Z
    //   4: ifeq -> 34
    //   7: aload_0
    //   8: getfield Dne : Loqu;
    //   11: aload_0
    //   12: getfield Dne : LFUH;
    //   15: getfield Dne : LQnq;
    //   18: aload_0
    //   19: getfield Dne : I
    //   22: aload_0
    //   23: getfield FWm : I
    //   26: aload_0
    //   27: getfield bzF : I
    //   30: iconst_0
    //   31: invokevirtual Dne : (LQnq;IIIZ)V
    //   34: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: bipush #20
    //   3: putfield Qnq : I
    //   6: aload_0
    //   7: getfield Dne : Loqu;
    //   10: aload_0
    //   11: getfield Dne : LFUH;
    //   14: getfield Dne : LQnq;
    //   17: aload_0
    //   18: getfield Dne : I
    //   21: aload_0
    //   22: getfield FWm : I
    //   25: aload_0
    //   26: getfield bzF : I
    //   29: iconst_1
    //   30: invokevirtual Dne : (LQnq;IIIZ)V
    //   33: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Htk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */