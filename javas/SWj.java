import java.util.Date;

class SWj extends LSv {
  final PRD Dne;
  
  protected int bzF() {
    return PRD.Dne(this.Dne).size() * 36;
  }
  
  protected void Dne() {
    this.Dne.aFZ();
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    pQP pQP = PRD.Dne(this.Dne).get(paramInt1);
    String str1 = pQP.FWm();
    if (str1 == null || geR.Dne(str1))
      str1 = PRD.Dne(this.Dne) + " " + (paramInt1 + 1); 
    String str2 = pQP.Dne();
    str2 = str2 + " (" + PRD.Dne(this.Dne).format(new Date(pQP.Dne()));
    str2 = str2 + ")";
    String str3 = "";
    if (pQP.Dne()) {
      str3 = PRD.FWm(this.Dne) + " " + str3;
    } else {
      str3 = PRD.Dne(this.Dne)[pQP.Dne().Dne()];
      if (pQP.FWm())
        str3 = Dne.aFZ + KGL.Dne("gameMode.hardcore") + Dne.FfS; 
      if (pQP.bzF())
        str3 = str3 + ", " + KGL.Dne("selectWorld.cheats"); 
    } 
    this.Dne.FWm(this.Dne.Dne, str1, paramInt2 + 2, paramInt3 + 1, 16777215);
    this.Dne.FWm(this.Dne.Dne, str2, paramInt2 + 2, paramInt3 + 12, 8421504);
    this.Dne.FWm(this.Dne.Dne, str3, paramInt2 + 2, paramInt3 + 12 + 10, 8421504);
  }
  
  public SWj(PRD paramPRD) {
    super(paramPRD.Dne, paramPRD.FWm, paramPRD.bzF, 32, paramPRD.bzF - 64, 36);
    this.Dne = paramPRD;
  }
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    PRD.Dne(this.Dne, paramInt);
    boolean bool = (PRD.Dne(this.Dne) >= 0 && PRD.Dne(this.Dne) < Dne()) ? true : false;
    (PRD.Dne(this.Dne)).Dne = bool;
    (PRD.FWm(this.Dne)).Dne = bool;
    (PRD.bzF(this.Dne)).Dne = bool;
    (PRD.Qnq(this.Dne)).Dne = bool;
    if (paramBoolean && bool)
      this.Dne.Dne(paramInt); 
  }
  
  protected boolean Dne(int paramInt) {
    return (paramInt == PRD.Dne(this.Dne));
  }
  
  protected int Dne() {
    return PRD.Dne(this.Dne).size();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SWj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */