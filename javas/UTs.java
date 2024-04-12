import java.util.Random;

public class UTs extends ipD implements MqS {
  private NMq[] Dne;
  
  protected String Dne;
  
  private Random Dne = (Random)new NMq[9];
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = (Random)paramNMq;
    if (paramNMq != null && paramNMq.Dne > aFZ())
      paramNMq.Dne = aFZ(); 
    a_();
  }
  
  public void i_() {}
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    mbZ mbZ = new mbZ();
    for (byte b = 0; b < this.Dne.length; b++) {
      if (this.Dne[b] != null) {
        WkD wkD = new WkD();
        wkD.Dne("Slot", (byte)b);
        this.Dne[b].Dne(wkD);
        mbZ.Dne(wkD);
      } 
    } 
    paramWkD.Dne("Items", mbZ);
    if (d_())
      paramWkD.Dne("CustomName", (String)this.Dne); 
  }
  
  public UTs() {
    this.Dne = new Random();
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    if (this.Dne[paramInt1] != null) {
      if (((NMq)this.Dne[paramInt1]).Dne <= paramInt2) {
        Random random = this.Dne[paramInt1];
        this.Dne[paramInt1] = null;
        a_();
        return (NMq)random;
      } 
      NMq nMq = this.Dne[paramInt1].Dne(paramInt2);
      if (((NMq)this.Dne[paramInt1]).Dne == 0)
        this.Dne[paramInt1] = null; 
      a_();
      return nMq;
    } 
    return null;
  }
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      Random random = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return (NMq)random;
    } 
    return null;
  }
  
  public boolean d_() {
    return (this.Dne != null);
  }
  
  public void Dne(String paramString) {
    this.Dne = (Random)paramString;
  }
  
  public NMq Dne(int paramInt) {
    return (NMq)this.Dne[paramInt];
  }
  
  public int Dne() {
    byte b = -1;
    byte b1 = 1;
    for (byte b2 = 0; b2 < this.Dne.length; b2++) {
      if (this.Dne[b2] != null && this.Dne.nextInt(b1++) == 0)
        b = b2; 
    } 
    return b;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    mbZ mbZ = paramWkD.Dne("Items");
    this.Dne = (Random)new NMq[Qnq()];
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      int i = wkD.Dne("Slot") & 0xFF;
      if (i >= 0 && i < this.Dne.length)
        this.Dne[i] = (Random)NMq.Dne(wkD); 
    } 
    if (paramWkD.Dne("CustomName"))
      this.Dne = (Random)paramWkD.Dne("CustomName"); 
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne(this.Qnq, this.aFZ, this.zGp) != this) ? false : ((paramFiG.Dne(this.Qnq + 0.5D, this.aFZ + 0.5D, this.zGp + 0.5D) <= 64.0D));
  }
  
  public int Qnq() {
    return 9;
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public int Dne(NMq paramNMq) {
    for (byte b = 0; b < this.Dne.length; b++) {
      if (this.Dne[b] == null || ((NMq)this.Dne[b]).bzF == 0) {
        Dne(b, paramNMq);
        return b;
      } 
    } 
    return -1;
  }
  
  public String b_() {
    return d_() ? (String)this.Dne : "container.dispenser";
  }
  
  public void bzF() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UTs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */