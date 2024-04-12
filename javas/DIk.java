public abstract class DIk extends kSJ implements NbA {
  static {
  
  }
  
  public DIk(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected boolean yMz() {
    return true;
  }
  
  protected int Dne(FiG paramFiG) {
    return 1 + this.Dne.Dne.nextInt(3);
  }
  
  public void Vxn() {
    int i = div();
    super.Vxn();
    if (udO() && !Dne(KFd.div)) {
      DyG(--i);
      if (div() == -20) {
        DyG(0);
        Dne(zBn.aFZ, 2);
      } 
    } else {
      DyG(300);
    } 
  }
  
  public int mrb() {
    return 120;
  }
  
  public boolean gnI() {
    return true;
  }
  
  public boolean cot() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield Dne : LbSp;
    //   8: invokevirtual Dne : (LbSp;)Z
    //   11: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DIk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */