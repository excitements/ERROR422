public class vBZ extends sHC {
  private String Qnq;
  
  private boolean bzF = true;
  
  private String zGp;
  
  private String aFZ;
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 2)
      zGp(); 
    this.Dne.Dne((paramPee.aFZ == 0), this.Dne);
  }
  
  public void zGp() {
    bzF(this.zGp);
  }
  
  public vBZ(qVZ paramqVZ, String paramString, int paramInt, boolean paramBoolean) {
    super(paramqVZ, irb.Dne().Dne(paramBoolean ? "chat.link.confirmTrusted" : "chat.link.confirm"), paramString, paramInt);
    irb irb = irb.Dne();
    this.FWm = irb.Dne(paramBoolean ? "chat.link.open" : "gui.yes");
    this.bzF = irb.Dne(paramBoolean ? "gui.cancel" : "gui.no");
    this.aFZ = irb.Dne("chat.copy");
    this.Qnq = irb.Dne("chat.link.warning");
    this.zGp = paramString;
  }
  
  public void IjH() {
    this.bzF = false;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    super.Dne(paramInt1, paramInt2, paramFloat);
    if (this.bzF)
      Dne((msA)this.Dne, this.Qnq, this.FWm / 2, 110, 16764108); 
  }
  
  public void Dne() {
    this.Dne.add(new Pee(0, this.FWm / 3 - 83 + 0, this.bzF / 6 + 96, 100, 20, this.FWm));
    this.Dne.add(new Pee(2, this.FWm / 3 - 83 + 105, this.bzF / 6 + 96, 100, 20, this.aFZ));
    this.Dne.add(new Pee(1, this.FWm / 3 - 83 + 210, this.bzF / 6 + 96, 100, 20, this.bzF));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vBZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */