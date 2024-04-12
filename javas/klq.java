public class klq extends Cxd implements wjF {
  private boolean Dne;
  
  private int Dne = 1;
  
  public klq(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    this.Dne = -1;
  }
  
  public double bzF() {
    return this.mrb;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    boolean bool = !paramBoolean;
    if (bool != div())
      zGp(bool); 
  }
  
  public klq(Qnq paramQnq) {
    super(paramQnq);
    this.Dne = -1;
  }
  
  public int XHL() {
    return 5;
  }
  
  public Qnq Dne() {
    return this.Dne;
  }
  
  protected void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    this.Dne = paramWkD.Dne("TransferCooldown");
  }
  
  public boolean IjH() {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic Dne : (LwjF;)Z
    //   4: ifeq -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: aload_0
    //   10: getfield Dne : LQnq;
    //   13: ldc JiM
    //   15: aload_0
    //   16: getfield Dne : LbSp;
    //   19: ldc2_w 0.25
    //   22: dconst_0
    //   23: ldc2_w 0.25
    //   26: invokevirtual FWm : (DDD)LbSp;
    //   29: getstatic pUe.Dne : LpUe;
    //   32: invokevirtual Dne : (Ljava/lang/Class;LbSp;LpUe;)Ljava/util/List;
    //   35: astore_1
    //   36: aload_1
    //   37: invokeinterface size : ()I
    //   42: ifle -> 60
    //   45: aload_0
    //   46: aload_1
    //   47: iconst_0
    //   48: invokeinterface get : (I)Ljava/lang/Object;
    //   53: checkcast JiM
    //   56: invokestatic Dne : (LMqS;LJiM;)Z
    //   59: pop
    //   60: iconst_0
    //   61: ireturn
  }
  
  public void XHL(int paramInt) {
    this.Dne = paramInt;
  }
  
  public int ooe() {
    return 1;
  }
  
  protected void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("TransferCooldown", this.Dne);
  }
  
  public boolean div() {
    return this.Dne;
  }
  
  public void Dne() {
    super.Dne();
    if (this.Dne.aFZ == null && udO() && div()) {
      this.Dne--;
      if (!vSL()) {
        XHL(0);
        if (IjH()) {
          XHL(4);
          a_();
        } 
      } 
    } 
  }
  
  public int Qnq() {
    return 5;
  }
  
  public void zGp(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public double FWm() {
    return this.IjH;
  }
  
  public boolean a_(FiG paramFiG) {
    if (this.Dne.aFZ == null)
      paramFiG.Dne(this); 
    return true;
  }
  
  public zKP FWm() {
    return zKP.Dne;
  }
  
  public boolean vSL() {
    return (this.Dne > 0);
  }
  
  public double Dne() {
    return this.div;
  }
  
  public void Dne(zBn paramzBn) {
    super.Dne(paramzBn);
    Dne(((SrC)zKP.Dne).FWm, 1, 0.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\klq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */