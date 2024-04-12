public class Vnr {
  private int FWm;
  
  private NMq Dne;
  
  private NMq bzF;
  
  private int Dne;
  
  private NMq FWm;
  
  public boolean Dne(Vnr paramVnr) {
    return (this.Dne.bzF == paramVnr.Dne.bzF && this.bzF.bzF == paramVnr.bzF.bzF) ? (((this.FWm == null && paramVnr.FWm == null) || (this.FWm != null && paramVnr.FWm != null && this.FWm.bzF == paramVnr.FWm.bzF))) : false;
  }
  
  public Vnr(NMq paramNMq1, NMq paramNMq2, NMq paramNMq3) {
    this.Dne = paramNMq1;
    this.FWm = paramNMq2;
    this.bzF = paramNMq3;
    this.FWm = 7;
  }
  
  public NMq FWm() {
    return this.FWm;
  }
  
  public NMq bzF() {
    return this.bzF;
  }
  
  public void Dne(int paramInt) {
    this.FWm += paramInt;
  }
  
  public boolean FWm() {
    return (this.Dne >= this.FWm);
  }
  
  public NMq Dne() {
    return this.Dne;
  }
  
  public void FWm() {
    this.Dne = this.FWm;
  }
  
  public boolean Dne() {
    return (this.FWm != null);
  }
  
  public Vnr(NMq paramNMq, dEr paramdEr) {
    this(paramNMq, new NMq(paramdEr));
  }
  
  public void Dne() {
    this.Dne++;
  }
  
  public boolean FWm(Vnr paramVnr) {
    return (Dne(paramVnr) && (this.Dne.Dne < paramVnr.Dne.Dne || (this.FWm != null && this.FWm.Dne < paramVnr.FWm.Dne)));
  }
  
  public void Dne(WkD paramWkD) {
    WkD wkD1 = paramWkD.Dne("buy");
    this.Dne = NMq.Dne(wkD1);
    WkD wkD2 = paramWkD.Dne("sell");
    this.bzF = NMq.Dne(wkD2);
    if (paramWkD.Dne("buyB"))
      this.FWm = NMq.Dne(paramWkD.Dne("buyB")); 
    if (paramWkD.Dne("uses"))
      this.Dne = paramWkD.Dne("uses"); 
    if (paramWkD.Dne("maxUses")) {
      this.FWm = paramWkD.Dne("maxUses");
    } else {
      this.FWm = 7;
    } 
  }
  
  public Vnr(NMq paramNMq1, NMq paramNMq2) {
    this(paramNMq1, (NMq)null, paramNMq2);
  }
  
  public WkD Dne() {
    // Byte code:
    //   0: new WkD
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_1
    //   9: ldc 'buy'
    //   11: aload_0
    //   12: getfield Dne : LNMq;
    //   15: new WkD
    //   18: dup
    //   19: ldc 'buy'
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: invokevirtual Dne : (LWkD;)LWkD;
    //   27: invokevirtual Dne : (Ljava/lang/String;LWkD;)V
    //   30: aload_1
    //   31: ldc 'sell'
    //   33: aload_0
    //   34: getfield bzF : LNMq;
    //   37: new WkD
    //   40: dup
    //   41: ldc 'sell'
    //   43: invokespecial <init> : (Ljava/lang/String;)V
    //   46: invokevirtual Dne : (LWkD;)LWkD;
    //   49: invokevirtual Dne : (Ljava/lang/String;LWkD;)V
    //   52: aload_0
    //   53: getfield FWm : LNMq;
    //   56: ifnull -> 81
    //   59: aload_1
    //   60: ldc 'buyB'
    //   62: aload_0
    //   63: getfield FWm : LNMq;
    //   66: new WkD
    //   69: dup
    //   70: ldc 'buyB'
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: invokevirtual Dne : (LWkD;)LWkD;
    //   78: invokevirtual Dne : (Ljava/lang/String;LWkD;)V
    //   81: aload_1
    //   82: ldc 'uses'
    //   84: aload_0
    //   85: getfield Dne : I
    //   88: invokevirtual Dne : (Ljava/lang/String;I)V
    //   91: aload_1
    //   92: ldc 'maxUses'
    //   94: aload_0
    //   95: getfield FWm : I
    //   98: invokevirtual Dne : (Ljava/lang/String;I)V
    //   101: aload_1
    //   102: areturn
  }
  
  public Vnr(WkD paramWkD) {
    Dne(paramWkD);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Vnr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */