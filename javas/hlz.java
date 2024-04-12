import java.util.Collection;

public class hlz extends vWZ {
  private SFA Dne;
  
  private WkD Dne;
  
  public hlz(String paramString) {
    super(paramString);
  }
  
  protected void Dne(mbZ parammbZ) {
    for (byte b = 0; b < parammbZ.Dne(); b++) {
      WkD wkD = (WkD)parammbZ.FWm(b);
      YGE yGE = this.Dne.FWm(wkD.Dne("Name"));
      yGE.Dne(wkD.Dne("DisplayName"));
      yGE.FWm(wkD.Dne("Prefix"));
      yGE.bzF(wkD.Dne("Suffix"));
      if (wkD.Dne("AllowFriendlyFire"))
        yGE.Dne(wkD.FWm("AllowFriendlyFire")); 
      if (wkD.Dne("SeeFriendlyInvisibles"))
        yGE.FWm(wkD.FWm("SeeFriendlyInvisibles")); 
      Dne(yGE, wkD.Dne("Players"));
    } 
  }
  
  protected void Dne(YGE paramYGE, mbZ parammbZ) {
    for (byte b = 0; b < parammbZ.Dne(); b++)
      this.Dne.Dne(((QNx)parammbZ.FWm(b)).Dne, paramYGE); 
  }
  
  protected void Qnq(WkD paramWkD) {
    WkD wkD = new WkD();
    boolean bool = false;
    for (byte b = 0; b < 3; b++) {
      vfE vfE = this.Dne.Dne(b);
      if (vfE != null) {
        wkD.Dne("slot_" + b, vfE.Dne());
        bool = true;
      } 
    } 
    if (bool)
      paramWkD.Dne("DisplaySlots", wkD); 
  }
  
  public void FWm(WkD paramWkD) {
    if (this.Dne == null) {
      Jwh.Dne().Dne().FWm("Tried to save scoreboard without having a scoreboard...");
    } else {
      paramWkD.Dne("Objectives", FWm());
      paramWkD.Dne("PlayerScores", bzF());
      paramWkD.Dne("Teams", Dne());
      Qnq(paramWkD);
    } 
  }
  
  protected mbZ Dne() {
    mbZ mbZ = new mbZ();
    Collection collection = this.Dne.aFZ();
    for (YGE yGE : collection) {
      WkD wkD = new WkD();
      wkD.Dne("Name", yGE.Dne());
      wkD.Dne("DisplayName", yGE.FWm());
      wkD.Dne("Prefix", yGE.bzF());
      wkD.Dne("Suffix", yGE.Qnq());
      wkD.Dne("AllowFriendlyFire", yGE.Dne());
      wkD.Dne("SeeFriendlyInvisibles", yGE.FWm());
      mbZ mbZ1 = new mbZ();
      for (String str : yGE.Dne())
        mbZ1.Dne(new QNx("", str)); 
      wkD.Dne("Players", mbZ1);
      mbZ.Dne(wkD);
    } 
    return mbZ;
  }
  
  protected mbZ FWm() {
    mbZ mbZ = new mbZ();
    Collection collection = this.Dne.Dne();
    for (vfE vfE : collection) {
      WkD wkD = new WkD();
      wkD.Dne("Name", vfE.Dne());
      wkD.Dne("CriteriaName", vfE.Dne().Dne());
      wkD.Dne("DisplayName", vfE.FWm());
      mbZ.Dne(wkD);
    } 
    return mbZ;
  }
  
  public void Dne(WkD paramWkD) {
    if (this.Dne == null) {
      this.Dne = paramWkD;
    } else {
      FWm(paramWkD.Dne("Objectives"));
      bzF(paramWkD.Dne("PlayerScores"));
      if (paramWkD.Dne("DisplaySlots"))
        bzF(paramWkD.Dne("DisplaySlots")); 
      if (paramWkD.Dne("Teams"))
        Dne(paramWkD.Dne("Teams")); 
    } 
  }
  
  public void Dne(SFA paramSFA) {
    this.Dne = (WkD)paramSFA;
    if (this.Dne != null)
      Dne(this.Dne); 
  }
  
  protected mbZ bzF() {
    mbZ mbZ = new mbZ();
    Collection collection = this.Dne.bzF();
    for (OHz oHz : collection) {
      WkD wkD = new WkD();
      wkD.Dne("Name", oHz.Dne());
      wkD.Dne("Objective", oHz.Dne().Dne());
      wkD.Dne("Score", oHz.Dne());
      mbZ.Dne(wkD);
    } 
    return mbZ;
  }
  
  protected void bzF(mbZ parammbZ) {
    for (byte b = 0; b < parammbZ.Dne(); b++) {
      WkD wkD = (WkD)parammbZ.FWm(b);
      vfE vfE = this.Dne.Dne(wkD.Dne("Objective"));
      OHz oHz = this.Dne.Dne(wkD.Dne("Name"), vfE);
      oHz.bzF(wkD.Dne("Score"));
    } 
  }
  
  protected void bzF(WkD paramWkD) {
    for (byte b = 0; b < 3; b++) {
      if (paramWkD.Dne("slot_" + b)) {
        String str = paramWkD.Dne("slot_" + b);
        vfE vfE = this.Dne.Dne(str);
        this.Dne.Dne(b, vfE);
      } 
    } 
  }
  
  protected void FWm(mbZ parammbZ) {
    for (byte b = 0; b < parammbZ.Dne(); b++) {
      WkD wkD = (WkD)parammbZ.FWm(b);
      PAf pAf = (PAf)PAf.Dne.get(wkD.Dne("CriteriaName"));
      vfE vfE = this.Dne.Dne(wkD.Dne("Name"), pAf);
      vfE.Dne(wkD.Dne("DisplayName"));
    } 
  }
  
  public hlz() {
    this("scoreboard");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hlz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */