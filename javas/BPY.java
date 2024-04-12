public class BPY extends RsG {
  private float Dne = 1.0F;
  
  public int Qnq() {
    return Dne().Dne(3);
  }
  
  public void FWm(WkD paramWkD) {
    WkD wkD = paramWkD.Dne("Item");
    if (wkD != null && !wkD.Dne()) {
      Dne(NMq.Dne(wkD));
      FWm(paramWkD.Dne("ItemRotation"));
      if (paramWkD.Dne("ItemDropChance"))
        this.Dne = paramWkD.Dne("ItemDropChance"); 
    } 
    super.FWm(paramWkD);
  }
  
  public int bzF() {
    return 9;
  }
  
  public BPY(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    Dne(paramInt4);
  }
  
  public BPY(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected void FWm() {
    Dne().Dne(2, 5);
    Dne().Dne(3, Byte.valueOf((byte)0));
  }
  
  public void Dne(NMq paramNMq) {
    paramNMq = paramNMq.Dne();
    paramNMq.Dne = 1;
    paramNMq.Dne(this);
    Dne().FWm(2, paramNMq);
    Dne().Dne(2);
  }
  
  public void FWm(int paramInt) {
    Dne().FWm(3, Byte.valueOf((byte)(paramInt % 4)));
  }
  
  public NMq Dne() {
    return Dne().Dne(2);
  }
  
  public boolean a_(FiG paramFiG) {
    if (Dne() == null) {
      NMq nMq = paramFiG.Dne();
      if (nMq != null && this.Dne.aFZ == null) {
        Dne(nMq);
        if (!((uqg)paramFiG.Dne).Qnq && --nMq.Dne <= 0)
          paramFiG.Dne.Dne(((MOS)paramFiG.Dne).Dne, (NMq)null); 
      } 
    } else if (this.Dne.aFZ == null) {
      FWm(Qnq() + 1);
    } 
    return true;
  }
  
  public boolean Dne(double paramDouble) {
    double d = 16.0D;
    d *= 64.0D * this.Qnq;
    return (paramDouble < d * d);
  }
  
  public int Dne() {
    return 9;
  }
  
  public void Dne(WkD paramWkD) {
    if (Dne() != null) {
      paramWkD.Dne("Item", Dne().Dne(new WkD()));
      paramWkD.Dne("ItemRotation", (byte)Qnq());
      paramWkD.Dne("ItemDropChance", this.Dne);
    } 
    super.Dne(paramWkD);
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: new NMq
    //   4: dup
    //   5: getstatic dEr.FUM : LdEr;
    //   8: invokespecial <init> : (LdEr;)V
    //   11: fconst_0
    //   12: invokevirtual Dne : (LNMq;F)LJiM;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual Dne : ()LNMq;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull -> 60
    //   25: aload_0
    //   26: getfield Dne : Ljava/util/Random;
    //   29: invokevirtual nextFloat : ()F
    //   32: aload_0
    //   33: getfield Dne : F
    //   36: fcmpg
    //   37: ifge -> 60
    //   40: aload_1
    //   41: invokevirtual Dne : ()LNMq;
    //   44: astore_1
    //   45: aload_1
    //   46: aconst_null
    //   47: checkcast BPY
    //   50: invokevirtual Dne : (LBPY;)V
    //   53: aload_0
    //   54: aload_1
    //   55: fconst_0
    //   56: invokevirtual Dne : (LNMq;F)LJiM;
    //   59: pop
    //   60: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BPY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */