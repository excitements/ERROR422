import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class VqU extends qVZ {
  private boolean bzF;
  
  private final qVZ Dne;
  
  private String FWm;
  
  private final JFs Dne;
  
  private final int Qnq = 1;
  
  private final int Dne = 0;
  
  private muh Dne;
  
  private String Dne;
  
  private mHN Dne = false;
  
  public void Dne() {
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(new Pee(0, this.FWm / 2 - 100, this.bzF / 4 + 96 + 12, irb.Dne("mco.configure.world.buttons.invite")));
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, this.bzF / 4 + 120 + 12, irb.Dne("gui.cancel")));
    this.Dne = new mHN((msA)this.Dne, this.FWm / 2 - 100, 66, 200, 20);
    this.Dne.FWm(true);
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne(""), this.FWm / 2, 17, 16777215);
    FWm((msA)this.Dne, irb.Dne("mco.configure.world.invite.profile.name"), this.FWm / 2 - 100, 53, 10526880);
    if (this.bzF)
      Dne((msA)this.Dne, this.FWm, this.FWm / 2, 100, 16711680); 
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 1) {
        this.Dne.Dne((qVZ)this.Dne);
      } else if (paramPee.aFZ == 0) {
        mNp mNp = new mNp(((Minecraft)this.Dne).Dne);
        try {
          muh muh1 = mNp.Dne(((muh)this.Dne).Dne, this.Dne.Dne());
          if (muh1 != null) {
            ((muh)this.Dne).Dne = muh1.Dne;
            this.Dne.Dne(new JFs((qVZ)this.Dne, (muh)this.Dne));
          } else {
            Dne((String)this.Dne);
          } 
        } catch (lUu lUu) {
          Dne(lUu.Dne);
        } catch (IOException iOException) {
          Dne((String)this.Dne);
        } 
      }  
  }
  
  public void bzF() {
    this.Dne.Dne();
  }
  
  protected void Dne(char paramChar, int paramInt) {
    this.Dne.Dne(paramChar, paramInt);
    if (paramChar == '\t')
      if (this.Dne.FWm()) {
        this.Dne.FWm(false);
      } else {
        this.Dne.FWm(true);
      }  
    if (paramChar == '\r')
      Dne(this.Dne.get(0)); 
  }
  
  public VqU(qVZ paramqVZ, JFs paramJFs, muh parammuh) {
    this.Dne = (mHN)"Could not invite the provided name";
    this.bzF = false;
    this.Dne = (mHN)paramqVZ;
    this.Dne = (mHN)paramJFs;
    this.Dne = (mHN)parammuh;
  }
  
  private void Dne(String paramString) {
    this.bzF = true;
    this.FWm = paramString;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VqU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */