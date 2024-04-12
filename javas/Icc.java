public enum Icc {
  bzF,
  Dne(ZFz.class, 70, KFd.Dne, false, false),
  FWm(HzK.class, 10, KFd.Dne, true, true),
  Qnq(HzK.class, 10, KFd.Dne, true, true);
  
  private final boolean FWm;
  
  private final KFd Dne;
  
  private final Class Dne;
  
  private final int Dne;
  
  private final boolean Dne;
  
  public KFd Dne() {
    return (KFd)this.Dne;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public Class Dne() {
    return (Class)this.Dne;
  }
  
  static {
    bzF = new Icc("ambient", 2, ifA.class, 15, KFd.Dne, true, false);
    Qnq = new Icc("waterCreature", 3, DIk.class, 5, KFd.div, true, false);
    Dne = new Icc[] { (Icc)Dne, FWm, bzF, Qnq };
  }
  
  Icc(Class paramClass, int paramInt1, KFd paramKFd, boolean paramBoolean1, boolean paramBoolean2) {
    this.Dne = (Icc[])paramClass;
    this.Dne = paramInt1;
    this.Dne = (Icc[])paramKFd;
    this.Dne = paramBoolean1;
    this.FWm = paramBoolean2;
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Icc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */