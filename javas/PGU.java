import java.util.Collection;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class PGU extends qVZ {
  private muh Dne;
  
  private qVZ FWm;
  
  private qVZ Dne;
  
  private mHN Dne;
  
  private Pee Dne;
  
  private int Dne;
  
  private mHN FWm;
  
  private xxt Dne;
  
  private int Qnq;
  
  private int aFZ;
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
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
      zGp(); 
    ((Pee)this.Dne).Dne = (this.FWm.Dne() != null && !this.FWm.Dne().trim().equals("")) ? 1 : 0;
  }
  
  private void zGp() {
    mNp mNp = new mNp(((Minecraft)this.Dne).Dne);
    try {
      String str = (this.Dne.Dne() != null && !this.Dne.Dne().trim().equals("")) ? this.Dne.Dne() : "";
      mNp.Dne(((muh)this.Dne).Dne, this.FWm.Dne(), str, this.Dne.Dne, this.Dne.FWm);
      this.Dne.Dne(this.FWm.Dne());
      this.Dne.FWm(this.Dne.Dne());
      this.Dne.Dne(new JFs((qVZ)this.FWm, (muh)this.Dne));
    } catch (Exception exception) {}
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("mco.configure.world.edit.title"), this.FWm / 2, 17, 16777215);
    FWm((msA)this.Dne, irb.Dne("mco.configure.world.name"), this.Dne, 43, 10526880);
    FWm((msA)this.Dne, irb.Dne("mco.configure.world.description"), this.Dne, 84, 10526880);
    this.FWm.Qnq();
    this.Dne.Qnq();
    this.Dne.Dne(this, (msA)this.Dne);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    this.Dne = this.FWm / 4;
    this.Qnq = this.FWm / 4 - 2;
    this.aFZ = this.FWm / 2 + 4;
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(this.Dne = (xxt)new Pee(0, this.Dne, this.bzF / 4 + 120 + 22, this.Qnq, 20, irb.Dne("mco.configure.world.buttons.done")));
    this.Dne.add(new Pee(1, this.aFZ, this.bzF / 4 + 120 + 22, this.Qnq, 20, irb.Dne("gui.cancel")));
    this.FWm = new mHN((msA)this.Dne, this.Dne, 56, 212, 20);
    this.FWm.FWm(true);
    this.FWm.aFZ(32);
    this.FWm.Dne(this.Dne.FWm());
    this.Dne = (xxt)new mHN((msA)this.Dne, this.Dne, 96, 212, 20);
    this.Dne.aFZ(32);
    this.Dne.Dne(this.Dne.Dne());
    this.Dne = new xxt(this.FWm, this.bzF, this.Dne, 122);
    this.Dne.addAll((Collection)this.Dne.Dne);
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 1) {
        this.Dne.Dne((qVZ)this.Dne);
      } else if (paramPee.aFZ == 0) {
        zGp();
      } else if (paramPee.aFZ == 2) {
        this.Dne.Dne(new MaG(this, (muh)this.Dne));
      } else {
        this.Dne.Dne(paramPee);
      }  
  }
  
  public PGU(qVZ paramqVZ1, qVZ paramqVZ2, muh parammuh) {
    this.Dne = (xxt)paramqVZ1;
    this.FWm = (mHN)paramqVZ2;
    this.Dne = (xxt)parammuh;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    this.FWm.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public void bzF() {
    this.FWm.Dne();
    this.Dne.Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PGU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */