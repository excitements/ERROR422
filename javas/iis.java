public class iis extends Tdr {
  public int Dne = 1;
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("ExplosionPower", this.Dne);
  }
  
  public iis(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
  }
  
  public iis(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected void Dne(wHH paramwHH) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: getfield aFZ : Z
    //   7: ifne -> 81
    //   10: aload_1
    //   11: getfield Dne : LsMa;
    //   14: ifnull -> 35
    //   17: aload_1
    //   18: getfield Dne : LsMa;
    //   21: aload_0
    //   22: aload_0
    //   23: getfield Dne : LFUH;
    //   26: invokestatic Dne : (LTdr;LsMa;)LzBn;
    //   29: bipush #6
    //   31: invokevirtual Dne : (LzBn;I)Z
    //   34: pop
    //   35: aload_0
    //   36: getfield Dne : LQnq;
    //   39: aconst_null
    //   40: checkcast sMa
    //   43: aload_0
    //   44: getfield div : D
    //   47: aload_0
    //   48: getfield IjH : D
    //   51: aload_0
    //   52: getfield mrb : D
    //   55: aload_0
    //   56: getfield Dne : I
    //   59: i2f
    //   60: iconst_1
    //   61: aload_0
    //   62: getfield Dne : LQnq;
    //   65: invokevirtual Dne : ()LaSc;
    //   68: ldc 'mobGriefing'
    //   70: invokevirtual Dne : (Ljava/lang/String;)Z
    //   73: invokevirtual Dne : (LsMa;DDDFZZ)LyTR;
    //   76: pop
    //   77: aload_0
    //   78: invokevirtual g_ : ()V
    //   81: return
  }
  
  public iis(Qnq paramQnq, FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramFUH, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (paramWkD.Dne("ExplosionPower"))
      this.Dne = paramWkD.Dne("ExplosionPower"); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iis.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */