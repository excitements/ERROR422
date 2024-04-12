public class Kgw extends zBn {
  protected sMa Dne;
  
  public String Dne(FUH paramFUH) {
    NMq nMq = (this.Dne instanceof FUH) ? ((FUH)this.Dne).Dne() : null;
    String str1 = "death.attack." + this.Dne;
    String str2 = str1 + ".item";
    return (nMq != null && nMq.zGp() && KGL.Dne(str2)) ? KGL.Dne(str2, new Object[] { paramFUH.aFZ(), this.Dne.aFZ(), nMq.FWm() }) : KGL.Dne(str1, new Object[] { paramFUH.aFZ(), this.Dne.aFZ() });
  }
  
  public boolean zGp() {
    return (this.Dne != null && this.Dne instanceof FUH && !(this.Dne instanceof FiG));
  }
  
  public sMa FWm() {
    return this.Dne;
  }
  
  public Kgw(String paramString, sMa paramsMa) {
    super(paramString);
    this.Dne = paramsMa;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Kgw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */