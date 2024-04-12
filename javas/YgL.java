import java.util.List;

public class YgL extends VHz {
  private NMq Dne;
  
  protected float bzF() {
    return 0.5F;
  }
  
  public YgL(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3, new NMq(dEr.Dne, 1, paramInt));
  }
  
  protected float zGp() {
    return -20.0F;
  }
  
  public YgL(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public YgL(Qnq paramQnq, FUH paramFUH, NMq paramNMq) {
    super(paramQnq, paramFUH);
    this.Dne = paramNMq;
  }
  
  public YgL(Qnq paramQnq, FUH paramFUH, int paramInt) {
    this(paramQnq, paramFUH, new NMq(dEr.Dne, 1, paramInt));
  }
  
  protected float DyG() {
    return 0.05F;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    if (this.Dne != null)
      paramWkD.Dne("Potion", this.Dne.Dne(new WkD())); 
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    if (paramWkD.Dne("Potion")) {
      this.Dne = NMq.Dne(paramWkD.Dne("Potion"));
    } else {
      Dne(paramWkD.Dne("potionValue"));
    } 
    if (this.Dne == null)
      g_(); 
  }
  
  protected void Dne(wHH paramwHH) {
    if (((Qnq)this.Dne).aFZ == null) {
      List list = dEr.Dne.Dne(this.Dne);
      if (list != null && !list.isEmpty()) {
        bSp bSp = this.Dne.FWm(4.0D, 2.0D, 4.0D);
        List list1 = this.Dne.Dne(FUH.class, bSp);
        if (list1 != null && !list1.isEmpty())
          for (FUH fUH : list1) {
            double d = Dne(fUH);
            if (d < 16.0D) {
              double d1 = 1.0D - Math.sqrt(d) / 4.0D;
              if (fUH == paramwHH.Dne)
                d1 = 1.0D; 
              for (NAx nAx : list) {
                int i = nAx.Dne();
                if (SXd.Dne[i].Dne()) {
                  SXd.Dne[i].Dne(Dne(), fUH, nAx.bzF(), d1);
                  continue;
                } 
                int j = (int)(d1 * nAx.FWm() + 0.5D);
                if (j > 20)
                  fUH.Qnq(new NAx(i, j, nAx.bzF())); 
              } 
            } 
          }  
      } 
      this.Dne.Qnq(2002, (int)Math.round(this.div), (int)Math.round(this.IjH), (int)Math.round(this.mrb), Dne());
      g_();
    } 
  }
  
  public YgL(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, NMq paramNMq) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
    this.Dne = paramNMq;
  }
  
  public void Dne(int paramInt) {
    if (this.Dne == null)
      this.Dne = new NMq(dEr.Dne, 1, 0); 
    this.Dne.Dne(paramInt);
  }
  
  public int Dne() {
    if (this.Dne == null)
      this.Dne = new NMq(dEr.Dne, 1, 0); 
    return this.Dne.Qnq();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YgL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */