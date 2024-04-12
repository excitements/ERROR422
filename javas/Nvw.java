import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;

public class Nvw extends qVZ {
  private Pee FWm;
  
  private mHN Dne;
  
  private final FgE Dne;
  
  private Pee Dne;
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 1) {
        this.Dne.Dne((qVZ)null);
      } else if (paramPee.aFZ == 0) {
        String str = "MC|AdvCdm";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
          dataOutputStream.writeInt(((FgE)this.Dne).Qnq);
          dataOutputStream.writeInt(((FgE)this.Dne).aFZ);
          dataOutputStream.writeInt(((FgE)this.Dne).zGp);
          NER.Dne(this.Dne.Dne(), dataOutputStream);
          this.Dne.Dne().FWm(new FaB(str, byteArrayOutputStream.toByteArray()));
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        this.Dne.Dne((qVZ)null);
      }  
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    this.Dne.add(this.Dne = new Pee(0, this.FWm / 2 - 100, this.bzF / 4 + 96 + 12, irb.Dne("gui.done")));
    this.Dne.add(this.FWm = new Pee(1, this.FWm / 2 - 100, this.bzF / 4 + 120 + 12, irb.Dne("gui.cancel")));
    this.Dne = (Pee)new mHN((msA)this.Dne, this.FWm / 2 - 150, 60, 300, 20);
    this.Dne.aFZ(32767);
    this.Dne.FWm(true);
    this.Dne.Dne(this.Dne.FWm());
    this.Dne.Dne = (this.Dne.Dne().trim().length() > 0) ? 1 : 0;
  }
  
  public Nvw(FgE paramFgE) {
    this.Dne = (Pee)paramFgE;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("advMode.setCommand"), this.FWm / 2, this.bzF / 4 - 60 + 20, 16777215);
    FWm((msA)this.Dne, irb.Dne("advMode.command"), this.FWm / 2 - 150, 47, 10526880);
    FWm((msA)this.Dne, irb.Dne("advMode.nearestPlayer"), this.FWm / 2 - 150, 97, 10526880);
    FWm((msA)this.Dne, irb.Dne("advMode.randomPlayer"), this.FWm / 2 - 150, 108, 10526880);
    FWm((msA)this.Dne, irb.Dne("advMode.allPlayers"), this.FWm / 2 - 150, 119, 10526880);
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void bzF() {
    this.Dne.Dne();
  }
  
  protected void Dne(char paramChar, int paramInt) {
    this.Dne.Dne(paramChar, paramInt);
    this.Dne.Dne = (this.Dne.Dne().trim().length() > 0) ? 1 : 0;
    if (paramInt != 28 && paramChar != '\r') {
      if (paramInt == 1)
        Dne(this.FWm); 
    } else {
      Dne(this.Dne);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Nvw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */