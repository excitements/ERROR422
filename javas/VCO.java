import net.minecraft.client.Minecraft;

public class VCO extends qVZ {
  private boolean bzF = false;
  
  private String Dne;
  
  private final qVZ Dne;
  
  private Pee FWm;
  
  private Pee Dne = (Pee)"survival";
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 102) {
      this.Dne.Dne((qVZ)this.Dne);
    } else if (paramPee.aFZ == 104) {
      if (this.Dne.equals("survival")) {
        this.Dne = (Pee)"creative";
      } else if (this.Dne.equals("creative")) {
        this.Dne = (Pee)"adventure";
      } else {
        this.Dne = (Pee)"survival";
      } 
      zGp();
    } else if (paramPee.aFZ == 103) {
      this.bzF = !this.bzF;
      zGp();
    } else if (paramPee.aFZ == 101) {
      this.Dne.Dne((qVZ)null);
      String str1 = this.Dne.Dne().Dne(XHL.Dne((String)this.Dne), this.bzF);
      String str2 = "";
      if (str1 != null) {
        str2 = ((Minecraft)this.Dne).Dne.Dne("commands.publish.started", new Object[] { str1 });
      } else {
        str2 = ((Minecraft)this.Dne).Dne.Dne("commands.publish.failed", new Object[0]);
      } 
      ((Minecraft)this.Dne).Dne.Dne().Dne(str2);
    } 
  }
  
  public void Dne() {
    this.Dne.clear();
    this.Dne.add(new Pee(101, this.FWm / 2 - 155, this.bzF - 28, 150, 20, KGL.Dne("lanServer.start")));
    this.Dne.add(new Pee(102, this.FWm / 2 + 5, this.bzF - 28, 150, 20, KGL.Dne("gui.cancel")));
    this.Dne.add(this.FWm = new Pee(104, this.FWm / 2 - 155, 100, 150, 20, KGL.Dne("selectWorld.gameMode")));
    this.Dne.add(this.Dne = new Pee(103, this.FWm / 2 + 5, 100, 150, 20, KGL.Dne("selectWorld.allowCommands")));
    zGp();
  }
  
  private void zGp() {
    irb irb = irb.Dne();
    this.FWm.Dne = irb.Dne("selectWorld.gameMode") + " " + irb.Dne("selectWorld.gameMode." + this.Dne);
    this.Dne.Dne = irb.Dne("selectWorld.allowCommands") + " ";
    if (this.bzF) {
      this.Dne.Dne += irb.Dne("options.on");
    } else {
      this.Dne.Dne += irb.Dne("options.off");
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    Dne((msA)this.Dne, KGL.Dne("lanServer.title"), this.FWm / 2, 50, 16777215);
    Dne((msA)this.Dne, KGL.Dne("lanServer.otherPlayers"), this.FWm / 2, 82, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public VCO(qVZ paramqVZ) {
    this.Dne = (Pee)paramqVZ;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VCO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */