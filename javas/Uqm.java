public class Uqm implements MqS {
  private NMq[] Dne;
  
  private int Dne;
  
  private Pdb Dne;
  
  public NMq FWm(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 < this.Dne) {
      int i = paramInt1 + paramInt2 * this.Dne;
      return Dne(i);
    } 
    return null;
  }
  
  public boolean Dne(FiG paramFiG) {
    return true;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = (Pdb)paramNMq;
    this.Dne.Dne(this);
  }
  
  public void a_() {}
  
  public NMq Dne(int paramInt1, int paramInt2) {
    if (this.Dne[paramInt1] != null) {
      if (((NMq)this.Dne[paramInt1]).Dne <= paramInt2) {
        Pdb pdb = this.Dne[paramInt1];
        this.Dne[paramInt1] = null;
        this.Dne.Dne(this);
        return (NMq)pdb;
      } 
      NMq nMq = this.Dne[paramInt1].Dne(paramInt2);
      if (((NMq)this.Dne[paramInt1]).Dne == 0)
        this.Dne[paramInt1] = null; 
      this.Dne.Dne(this);
      return nMq;
    } 
    return null;
  }
  
  public int Qnq() {
    return this.Dne.length;
  }
  
  public String b_() {
    return "container.crafting";
  }
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      Pdb pdb = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return (NMq)pdb;
    } 
    return null;
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public NMq Dne(int paramInt) {
    return (paramInt >= Qnq()) ? null : (NMq)this.Dne[paramInt];
  }
  
  public void bzF() {}
  
  public void i_() {}
  
  public Uqm(Pdb paramPdb, int paramInt1, int paramInt2) {
    int i = paramInt1 * paramInt2;
    this.Dne = (Pdb)new NMq[i];
    this.Dne = paramPdb;
    this.Dne = paramInt1;
  }
  
  public boolean d_() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Uqm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */