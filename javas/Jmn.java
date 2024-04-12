public class Jmn implements MqS {
  private final FiG Dne;
  
  private NMq[] Dne;
  
  private int Dne;
  
  private final YzO Dne;
  
  private Vnr Dne = (Vnr)new NMq[3];
  
  public String b_() {
    return "mob.villager";
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne() == paramFiG);
  }
  
  public void bzF() {}
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
    Dne();
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public void a_() {
    Dne();
  }
  
  public Vnr Dne() {
    return this.Dne;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    if (this.Dne[paramInt1] != null) {
      if (paramInt1 == 2) {
        Vnr vnr = this.Dne[paramInt1];
        this.Dne[paramInt1] = null;
        return (NMq)vnr;
      } 
      if (((NMq)this.Dne[paramInt1]).Dne <= paramInt2) {
        Vnr vnr = this.Dne[paramInt1];
        this.Dne[paramInt1] = null;
        if (Dne(paramInt1))
          Dne(); 
        return (NMq)vnr;
      } 
      NMq nMq = this.Dne[paramInt1].Dne(paramInt2);
      if (((NMq)this.Dne[paramInt1]).Dne == 0)
        this.Dne[paramInt1] = null; 
      if (Dne(paramInt1))
        Dne(); 
      return nMq;
    } 
    return null;
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = (Vnr)paramNMq;
    if (paramNMq != null && paramNMq.Dne > aFZ())
      paramNMq.Dne = aFZ(); 
    if (Dne(paramInt))
      Dne(); 
  }
  
  public void Dne() {
    this.Dne = null;
    Vnr vnr1 = this.Dne[0];
    Vnr vnr2 = this.Dne[1];
    if (vnr1 == null) {
      vnr1 = vnr2;
      vnr2 = null;
    } 
    if (vnr1 == null) {
      Dne(2, (NMq)null);
    } else {
      ybO ybO = this.Dne.Dne((FiG)this.Dne);
      if (ybO != null) {
        Vnr vnr = ybO.Dne((NMq)vnr1, (NMq)vnr2, this.Dne);
        if (vnr != null && !vnr.FWm()) {
          this.Dne = vnr;
          Dne(2, vnr.bzF().Dne());
        } else if (vnr2 != null) {
          vnr = ybO.Dne((NMq)vnr2, (NMq)vnr1, this.Dne);
          if (vnr != null && !vnr.FWm()) {
            this.Dne = vnr;
            Dne(2, vnr.bzF().Dne());
          } else {
            Dne(2, (NMq)null);
          } 
        } else {
          Dne(2, (NMq)null);
        } 
      } 
    } 
  }
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      Vnr vnr = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return (NMq)vnr;
    } 
    return null;
  }
  
  public NMq Dne(int paramInt) {
    return (NMq)this.Dne[paramInt];
  }
  
  public int Qnq() {
    return this.Dne.length;
  }
  
  public Jmn(FiG paramFiG, YzO paramYzO) {
    this.Dne = (Vnr)paramFiG;
    this.Dne = (Vnr)paramYzO;
  }
  
  private boolean Dne(int paramInt) {
    return (paramInt == 0 || paramInt == 1);
  }
  
  public boolean d_() {
    return false;
  }
  
  public void i_() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Jmn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */