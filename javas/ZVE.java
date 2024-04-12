import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class ZVE extends qVZ {
  private int aFZ;
  
  private final qVZ Dne;
  
  private final int Qnq = 1;
  
  private String Dne;
  
  private final int Dne = 0;
  
  private final muh Dne = false;
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    irb irb = irb.Dne();
    aFZ();
    Dne((msA)this.Dne, irb.Dne("mco.configure.world.subscription.title"), this.FWm / 2, 17, 16777215);
    FWm((msA)this.Dne, irb.Dne("mco.configure.world.subscription.start"), this.FWm / 2 - 100, 53, 10526880);
    FWm((msA)this.Dne, (String)this.Dne, this.FWm / 2 - 100, 66, 16777215);
    FWm((msA)this.Dne, irb.Dne("mco.configure.world.subscription.daysleft"), this.FWm / 2 - 100, 85, 10526880);
    FWm((msA)this.Dne, String.valueOf(this.aFZ), this.FWm / 2 - 100, 98, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  private void Dne(long paramLong) {
    mNp mNp = new mNp(((Minecraft)this.Dne).Dne);
    try {
      YGW yGW = mNp.Dne(paramLong);
      this.aFZ = yGW.Dne;
      this.Dne = (muh)Dne(yGW.Dne);
    } catch (lUu lUu) {
    
    } catch (IOException iOException) {}
  }
  
  public void Dne() {
    Dne(this.Dne.Dne);
    irb irb = irb.Dne();
    Keyboard.enableRepeatEvents(true);
    this.Dne.add(new Pee(0, this.FWm / 2 - 100, this.bzF / 4 + 120 + 12, irb.Dne("gui.cancel")));
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  private String Dne(long paramLong) {
    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
    gregorianCalendar.setTimeInMillis(paramLong);
    return SimpleDateFormat.getDateTimeInstance().format(gregorianCalendar.getTime());
  }
  
  public ZVE(qVZ paramqVZ, muh parammuh) {
    this.Dne = (muh)paramqVZ;
    this.Dne = parammuh;
  }
  
  public void bzF() {}
  
  protected void Dne(char paramChar, int paramInt) {}
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 0) {
        this.Dne.Dne((qVZ)this.Dne);
      } else if (paramPee.aFZ == 1) {
      
      }  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZVE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */