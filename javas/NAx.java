public class NAx {
  private int Dne;
  
  private int bzF;
  
  private int FWm;
  
  private boolean bzF;
  
  private boolean Dne;
  
  private boolean FWm;
  
  public void Dne(NAx paramNAx) {
    if (this.Dne != paramNAx.Dne)
      System.err.println("This method should only be called for matching effects!"); 
    if (paramNAx.bzF > this.bzF) {
      this.bzF = paramNAx.bzF;
      this.FWm = paramNAx.FWm;
    } else if (paramNAx.bzF == this.bzF && this.FWm < paramNAx.FWm) {
      this.FWm = paramNAx.FWm;
    } else if (!paramNAx.FWm && this.FWm) {
      this.FWm = paramNAx.FWm;
    } 
  }
  
  public WkD Dne(WkD paramWkD) {
    paramWkD.Dne("Id", (byte)Dne());
    paramWkD.Dne("Amplifier", (byte)bzF());
    paramWkD.Dne("Duration", FWm());
    paramWkD.Dne("Ambient", FWm());
    return paramWkD;
  }
  
  public NAx(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, 0);
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public NAx(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.FWm = paramBoolean;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public String Dne() {
    return SXd.Dne[this.Dne].Dne();
  }
  
  public NAx(int paramInt1, int paramInt2, int paramInt3) {
    this(paramInt1, paramInt2, paramInt3, false);
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof NAx))
      return false; 
    NAx nAx = (NAx)paramObject;
    return (this.Dne == nAx.Dne && this.bzF == nAx.bzF && this.FWm == nAx.FWm && this.Dne == nAx.Dne && this.FWm == nAx.FWm);
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  public NAx(NAx paramNAx) {
    this.Dne = paramNAx.Dne;
    this.FWm = paramNAx.FWm;
    this.bzF = paramNAx.bzF;
  }
  
  public boolean Dne(FUH paramFUH) {
    if (this.FWm) {
      if (SXd.Dne[this.Dne].Dne(this.FWm, this.bzF))
        Dne(paramFUH); 
      Qnq();
    } 
    return this.FWm;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public boolean bzF() {
    return this.bzF;
  }
  
  private int Qnq() {
    return --this.FWm;
  }
  
  public static NAx Dne(WkD paramWkD) {
    byte b1 = paramWkD.Dne("Id");
    byte b2 = paramWkD.Dne("Amplifier");
    int i = paramWkD.Dne("Duration");
    boolean bool = paramWkD.FWm("Ambient");
    return new NAx(b1, i, b2, bool);
  }
  
  public int hashCode() {
    return this.Dne;
  }
  
  public void Dne(FUH paramFUH) {
    if (this.FWm)
      SXd.Dne[this.Dne].Dne(paramFUH, this.bzF); 
  }
  
  public void FWm(boolean paramBoolean) {
    this.bzF = paramBoolean;
  }
  
  public String toString() {
    String str = "";
    if (bzF() > 0) {
      str = Dne() + " x " + (bzF() + 1) + ", Duration: " + FWm();
    } else {
      str = Dne() + ", Duration: " + FWm();
    } 
    if (this.Dne)
      str = str + ", Splash: true"; 
    return SXd.Dne[this.Dne].Qnq() ? ("(" + str + ")") : str;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NAx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */