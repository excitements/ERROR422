import org.lwjgl.input.Keyboard;

public class ugH extends qVZ {
  private mHN FWm;
  
  private etB Dne;
  
  private mHN Dne;
  
  private qVZ Dne;
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 1) {
        this.Dne.Dne(false, 0);
      } else if (paramPee.aFZ == 0) {
        ((etB)this.Dne).Dne = this.FWm.Dne();
        ((etB)this.Dne).FWm = this.Dne.Dne();
        this.Dne.Dne(true, 0);
      } else if (paramPee.aFZ == 2) {
        irb irb = irb.Dne();
        this.Dne.FWm(!this.Dne.bzF());
        ((Pee)this.Dne.get(2)).Dne = irb.Dne("addServer.hideAddress") + ": " + (this.Dne.bzF() ? irb.Dne("gui.yes") : irb.Dne("gui.no"));
      }  
  }
  
  public void bzF() {
    this.FWm.Dne();
    this.Dne.Dne();
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(new Pee(0, this.FWm / 2 - 100, this.bzF / 4 + 96 + 12, irb.Dne("addServer.add")));
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, this.bzF / 4 + 120 + 12, irb.Dne("gui.cancel")));
    this.Dne.add(new Pee(2, this.FWm / 2 - 100, 142, irb.Dne("addServer.hideAddress") + ": " + (this.Dne.bzF() ? irb.Dne("gui.yes") : irb.Dne("gui.no"))));
    this.FWm = new mHN((msA)this.Dne, this.FWm / 2 - 100, 66, 200, 20);
    this.FWm.FWm(true);
    this.FWm.Dne(((etB)this.Dne).Dne);
    this.Dne = (qVZ)new mHN((msA)this.Dne, this.FWm / 2 - 100, 106, 200, 20);
    this.Dne.aFZ(128);
    this.Dne.Dne(((etB)this.Dne).FWm);
    ((Pee)this.Dne.get(0)).Dne = (this.Dne.Dne().length() > 0 && (this.Dne.Dne().split(":")).length > 0 && this.FWm.Dne().length() > 0) ? 1 : 0;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("addServer.title"), this.FWm / 2, 17, 16777215);
    FWm((msA)this.Dne, irb.Dne("addServer.enterName"), this.FWm / 2 - 100, 53, 10526880);
    FWm((msA)this.Dne, irb.Dne("addServer.enterIp"), this.FWm / 2 - 100, 94, 10526880);
    this.FWm.Qnq();
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  public ugH(qVZ paramqVZ, etB parametB) {
    this.Dne = paramqVZ;
    this.Dne = (qVZ)parametB;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    this.FWm.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  protected void Dne(char paramChar, int paramInt) {
    this.FWm.Dne(paramChar, paramInt);
    this.Dne.Dne(paramChar, paramInt);
    if (paramChar == '\t')
      if (this.FWm.FWm()) {
        this.FWm.FWm(false);
        this.Dne.FWm(true);
      } else {
        this.FWm.FWm(true);
        this.Dne.FWm(false);
      }  
    if (paramChar == '\r')
      Dne(this.Dne.get(0)); 
    ((Pee)this.Dne.get(0)).Dne = (this.Dne.Dne().length() > 0 && (this.Dne.Dne().split(":")).length > 0 && this.FWm.Dne().length() > 0) ? 1 : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\ugH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */