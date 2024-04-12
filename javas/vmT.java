import net.minecraft.client.Minecraft;

public class vmT extends SlE {
  static {
  
  }
  
  private void zGp() {
    fzy fzy = ((Minecraft)this.Dne).Dne.Dne;
    fzy.FWm(new Pkw(((Minecraft)this.Dne).Dne, 3));
    if (eCD.Dne(100) == 0)
      ((PJQ)QXI.Dne).Vxn = 0; 
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (paramInt == 1) {
      zGp();
    } else if (paramInt == 28) {
      String str = this.Dne.Dne().trim();
      if (str.length() > 0)
        ((Minecraft)this.Dne).Dne.FWm(str); 
      this.Dne.Dne("");
      ((Minecraft)this.Dne).Dne.Dne().bzF();
    } else {
      super.Dne(paramChar, paramInt);
    } 
  }
  
  public void Dne() {
    super.Dne();
    irb irb = irb.Dne();
    this.Dne.add(new Pee(1, this.FWm / 2 - 100, this.bzF - 40, irb.Dne("multiplayer.stopSleeping")));
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 1) {
      zGp();
    } else {
      super.Dne(paramPee);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vmT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */