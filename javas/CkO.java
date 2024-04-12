import org.lwjgl.input.Keyboard;

public class CkO extends qVZ {
  private mHN Dne;
  
  private qVZ Dne;
  
  private final String Dne;
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  public void bzF() {
    this.Dne.Dne();
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("selectWorld.renameTitle"), this.FWm / 2, this.bzF / 4 - 60 + 20, 16777215);
    FWm((msA)this.Dne, irb.Dne("selectWorld.enterName"), this.FWm / 2 - 100, 47, 10526880);
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(new Pee(0, this.FWm / 2 - 100, this.bzF / 4 + 96 + 12, irb.Dne("selectWorld.renameButton")));
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, this.bzF / 4 + 120 + 12, irb.Dne("gui.cancel")));
    YiY yiY = this.Dne.Dne();
    xoY xoY = yiY.Dne(this.Dne);
    String str = xoY.Dne();
    this.Dne = (String)new mHN((msA)this.Dne, this.FWm / 2 - 100, 60, 200, 20);
    this.Dne.FWm(true);
    this.Dne.Dne(str);
  }
  
  public CkO(qVZ paramqVZ, String paramString) {
    this.Dne = (String)paramqVZ;
    this.Dne = paramString;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 1) {
        this.Dne.Dne((qVZ)this.Dne);
      } else if (paramPee.aFZ == 0) {
        YiY yiY = this.Dne.Dne();
        yiY.Dne(this.Dne, this.Dne.Dne().trim());
        this.Dne.Dne((qVZ)this.Dne);
      }  
  }
  
  protected void Dne(char paramChar, int paramInt) {
    this.Dne.Dne(paramChar, paramInt);
    ((Pee)this.Dne.get(0)).Dne = (this.Dne.Dne().trim().length() > 0) ? 1 : 0;
    if (paramChar == '\r')
      Dne(this.Dne.get(0)); 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CkO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */