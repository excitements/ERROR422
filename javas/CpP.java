public class CpP extends Kgw {
  private sMa FWm;
  
  public CpP(String paramString, sMa paramsMa1, sMa paramsMa2) {
    super(paramString, paramsMa1);
    this.FWm = paramsMa2;
  }
  
  public sMa Dne() {
    return this.Dne;
  }
  
  public sMa FWm() {
    return this.FWm;
  }
  
  public String Dne(FUH paramFUH) {
    String str1 = (this.FWm == null) ? this.Dne.aFZ() : this.FWm.aFZ();
    NMq nMq = (this.FWm instanceof FUH) ? ((FUH)this.FWm).Dne() : null;
    String str2 = "death.attack." + this.Dne;
    String str3 = str2 + ".item";
    return (nMq != null && nMq.zGp() && KGL.Dne(str3)) ? KGL.Dne(str3, new Object[] { paramFUH.aFZ(), str1, nMq.FWm() }) : KGL.Dne(str2, new Object[] { paramFUH.aFZ(), str1 });
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CpP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */