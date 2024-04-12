public class hcj extends qVZ {
  private KHk Dne;
  
  private static eKj Dne = new eKj();
  
  private Pee Dne;
  
  private String Dne;
  
  private Pee bzF;
  
  private Pee FWm;
  
  private final Lbd Dne;
  
  private String bzF;
  
  private lDk Dne = lDk.Dne();
  
  private String FWm;
  
  private boolean Qnq() {
    return (((KHk)this.Dne).Dne > -1 && ((KHk)this.Dne).Dne < this.Dne.Dne().size());
  }
  
  static eKj Dne() {
    return (eKj)Dne;
  }
  
  static lDk Dne(hcj paramhcj) {
    return paramhcj.Dne;
  }
  
  public void Dne() {
    this.Dne.clear();
    this.Dne = (lDk)KGL.Dne("createWorld.customize.flat.title");
    this.FWm = KGL.Dne("createWorld.customize.flat.tile");
    this.bzF = KGL.Dne("createWorld.customize.flat.height");
    this.Dne = (lDk)new KHk(this);
    this.Dne.add(this.Dne = (lDk)new Pee(2, this.FWm / 2 - 154, this.bzF - 52, 100, 20, KGL.Dne("createWorld.customize.flat.addLayer") + " (NYI)"));
    this.Dne.add(this.FWm = (String)new Pee(3, this.FWm / 2 - 50, this.bzF - 52, 100, 20, KGL.Dne("createWorld.customize.flat.editLayer") + " (NYI)"));
    this.Dne.add(this.bzF = (String)new Pee(4, this.FWm / 2 - 155, this.bzF - 52, 150, 20, KGL.Dne("createWorld.customize.flat.removeLayer")));
    this.Dne.add(new Pee(0, this.FWm / 2 - 155, this.bzF - 28, 150, 20, KGL.Dne("gui.done")));
    this.Dne.add(new Pee(5, this.FWm / 2 + 5, this.bzF - 52, 150, 20, KGL.Dne("createWorld.customize.presets")));
    this.Dne.add(new Pee(1, this.FWm / 2 + 5, this.bzF - 28, 150, 20, KGL.Dne("gui.cancel")));
    ((Pee)this.Dne).FWm = ((Pee)this.FWm).FWm = false;
    this.Dne.Dne();
    c_();
  }
  
  public void Dne(String paramString) {
    this.Dne = lDk.Dne(paramString);
  }
  
  protected void Dne(Pee paramPee) {
    int i = this.Dne.Dne().size() - ((KHk)this.Dne).Dne - 1;
    if (paramPee.aFZ == 1) {
      this.Dne.Dne((qVZ)this.Dne);
    } else if (paramPee.aFZ == 0) {
      ((Lbd)this.Dne).Dne = (String[])Dne();
      this.Dne.Dne((qVZ)this.Dne);
    } else if (paramPee.aFZ == 5) {
      this.Dne.Dne(new TEn(this));
    } else if (paramPee.aFZ == 4 && Qnq()) {
      this.Dne.Dne().remove(i);
      ((KHk)this.Dne).Dne = Math.min(((KHk)this.Dne).Dne, this.Dne.Dne().size() - 1);
    } 
    this.Dne.Dne();
    c_();
  }
  
  public void c_() {
    boolean bool = Qnq();
    ((Pee)this.bzF).Dne = bool;
    ((Pee)this.FWm).Dne = bool;
    ((Pee)this.FWm).Dne = Character.MIN_VALUE;
    ((Pee)this.Dne).Dne = Character.MIN_VALUE;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    this.Dne.Dne(paramInt1, paramInt2, paramFloat);
    Dne((msA)this.Dne, (String)this.Dne, this.FWm / 2, 8, 16777215);
    int i = this.FWm / 2 - 92 - 16;
    FWm((msA)this.Dne, this.FWm, i, 32, 16777215);
    FWm((msA)this.Dne, this.bzF, i + 2 + 213 - this.Dne.Dne(this.bzF), 32, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public String Dne() {
    return this.Dne.toString();
  }
  
  public hcj(Lbd paramLbd, String paramString) {
    this.Dne = (lDk)paramLbd;
    Dne(paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hcj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */