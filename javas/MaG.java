import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class MaG extends qVZ {
  private mHN Dne;
  
  private final int Dne = 1;
  
  private qVZ Dne;
  
  private Pee Dne;
  
  private final int Qnq = 2;
  
  private muh Dne = true;
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  static qVZ Dne(MaG paramMaG) {
    return (qVZ)paramMaG.Dne;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("mco.reset.world.title"), this.FWm / 2, 17, 16777215);
    Dne((msA)this.Dne, irb.Dne("mco.reset.world.warning"), this.FWm / 2, 66, 16711680);
    FWm((msA)this.Dne, irb.Dne("mco.reset.world.seed"), this.FWm / 2 - 100, 96, 10526880);
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void bzF() {
    this.Dne.Dne();
  }
  
  public MaG(qVZ paramqVZ, muh parammuh) {
    this.Dne = (muh)paramqVZ;
    this.Dne = parammuh;
  }
  
  static Minecraft Dne(MaG paramMaG) {
    return (Minecraft)paramMaG.Dne;
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(this.Dne = (muh)new Pee(1, this.FWm / 2 - 100, this.bzF / 4 + 96 + 12, irb.Dne("mco.configure.world.buttons.reset")));
    this.Dne.add(new Pee(2, this.FWm / 2 - 100, this.bzF / 4 + 120 + 12, irb.Dne("gui.cancel")));
    this.Dne = (muh)new mHN((msA)this.Dne, this.FWm / 2 - 100, 109, 200, 20);
    this.Dne.FWm(true);
    this.Dne.aFZ(32);
    this.Dne.Dne("");
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void Dne(char paramChar, int paramInt) {
    this.Dne.Dne(paramChar, paramInt);
    if (paramChar == '\r')
      Dne((Pee)this.Dne); 
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 2) {
        this.Dne.Dne((qVZ)this.Dne);
      } else if (paramPee.aFZ == 1) {
        Gon gon = new Gon(this, this.Dne.Dne, this.Dne.Dne());
        blc blc = new blc((Minecraft)this.Dne, (qVZ)this.Dne, gon);
        blc.zGp();
        this.Dne.Dne(blc);
      }  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MaG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */