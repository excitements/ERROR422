public class tVV extends Ebp {
  public double Dne;
  
  private int Dne = 0;
  
  public double FWm;
  
  public zKP FWm() {
    return zKP.qrB;
  }
  
  public tVV(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public tVV(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected boolean div() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #16
    //   6: invokevirtual Dne : (I)B
    //   9: iconst_1
    //   10: iand
    //   11: ifeq -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: ireturn
  }
  
  public int XHL() {
    return 2;
  }
  
  public void Dne(zBn paramzBn) {
    super.Dne(paramzBn);
    if (!paramzBn.FWm())
      Dne(new NMq(zKP.haP, 1), 0.0F); 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, int paramInt4, int paramInt5) {
    super.Dne(paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramInt4, paramInt5);
    double d = this.Dne * this.Dne + this.FWm * this.FWm;
    if (d > 1.0E-4D && this.XHL * this.XHL + this.kGO * this.kGO > 0.001D) {
      d = geR.Dne(d);
      this.Dne /= d;
      this.FWm /= d;
      if (this.Dne * this.XHL + this.FWm * this.kGO < 0.0D) {
        this.Dne = 0.0D;
        this.FWm = 0.0D;
      } else {
        this.Dne = this.XHL;
        this.FWm = this.kGO;
      } 
    } 
  }
  
  public int kGO() {
    return 2;
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: new java/lang/Byte
    //   13: dup
    //   14: iconst_0
    //   15: invokespecial <init> : (B)V
    //   18: invokevirtual Dne : (ILjava/lang/Object;)V
    //   21: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: ifle -> 21
    //   11: aload_0
    //   12: dup
    //   13: getfield Dne : I
    //   16: iconst_1
    //   17: isub
    //   18: putfield Dne : I
    //   21: aload_0
    //   22: getfield Dne : I
    //   25: ifgt -> 38
    //   28: aload_0
    //   29: aload_0
    //   30: dconst_0
    //   31: dup2_x1
    //   32: putfield FWm : D
    //   35: putfield Dne : D
    //   38: aload_0
    //   39: aload_0
    //   40: getfield Dne : I
    //   43: ifle -> 50
    //   46: iconst_1
    //   47: goto -> 51
    //   50: iconst_0
    //   51: invokevirtual zGp : (Z)V
    //   54: aload_0
    //   55: invokevirtual div : ()Z
    //   58: ifeq -> 100
    //   61: aload_0
    //   62: getfield Dne : Ljava/util/Random;
    //   65: iconst_4
    //   66: invokevirtual nextInt : (I)I
    //   69: ifne -> 100
    //   72: aload_0
    //   73: getfield Dne : LQnq;
    //   76: ldc 'largesmoke'
    //   78: aload_0
    //   79: getfield div : D
    //   82: aload_0
    //   83: getfield IjH : D
    //   86: ldc2_w 0.8
    //   89: dadd
    //   90: aload_0
    //   91: getfield mrb : D
    //   94: dconst_0
    //   95: dconst_0
    //   96: dconst_0
    //   97: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   100: return
  }
  
  public boolean a_(FiG paramFiG) {
    NMq nMq = paramFiG.Dne.Dne();
    if (nMq != null && nMq.bzF == dEr.DyG.Qnq) {
      if (--nMq.Dne == 0)
        paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, (NMq)null); 
      this.Dne += 3600;
    } 
    this.Dne = this.div - paramFiG.div;
    this.FWm = this.mrb - paramFiG.mrb;
    return true;
  }
  
  protected void zGp(boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: ifeq -> 31
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #16
    //   10: aload_0
    //   11: getfield Dne : LluM;
    //   14: bipush #16
    //   16: invokevirtual Dne : (I)B
    //   19: iconst_1
    //   20: ior
    //   21: i2b
    //   22: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   25: invokevirtual FWm : (ILjava/lang/Object;)V
    //   28: goto -> 56
    //   31: aload_0
    //   32: getfield Dne : LluM;
    //   35: bipush #16
    //   37: aload_0
    //   38: getfield Dne : LluM;
    //   41: bipush #16
    //   43: invokevirtual Dne : (I)B
    //   46: bipush #-2
    //   48: iand
    //   49: i2b
    //   50: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   53: invokevirtual FWm : (ILjava/lang/Object;)V
    //   56: return
  }
  
  protected void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("PushX", this.Dne);
    paramWkD.Dne("PushZ", this.FWm);
    paramWkD.Dne("Fuel", (short)this.Dne);
  }
  
  protected void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    this.Dne = paramWkD.Dne("PushX");
    this.FWm = paramWkD.Dne("PushZ");
    this.Dne = paramWkD.Dne("Fuel");
  }
  
  protected void Qnq() {
    double d = this.Dne * this.Dne + this.FWm * this.FWm;
    if (d > 1.0E-4D) {
      d = geR.Dne(d);
      this.Dne /= d;
      this.FWm /= d;
      double d1 = 0.05D;
      this.XHL *= 0.800000011920929D;
      this.Zpi *= 0.0D;
      this.kGO *= 0.800000011920929D;
      this.XHL += this.Dne * d1;
      this.kGO += this.FWm * d1;
    } else {
      this.XHL *= 0.9800000190734863D;
      this.Zpi *= 0.0D;
      this.kGO *= 0.9800000190734863D;
    } 
    super.Qnq();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tVV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */