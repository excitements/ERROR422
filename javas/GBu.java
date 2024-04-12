import java.util.ArrayList;
import java.util.TreeMap;
import net.minecraft.client.Minecraft;

class GBu extends LSv {
  final Utr Dne;
  
  private TreeMap Dne;
  
  private ArrayList Dne;
  
  protected int Dne() {
    return this.Dne.size();
  }
  
  public GBu(Utr paramUtr) {
    super((Minecraft)paramUtr.Dne, paramUtr.FWm, paramUtr.bzF, 32, paramUtr.bzF - 65 + 4, 18);
    this.Dne = (ArrayList)paramUtr;
    this.Dne = (ArrayList)irb.Dne().Dne();
    this.Dne = new ArrayList();
    for (String str : this.Dne.keySet())
      this.Dne.add(str); 
  }
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    irb.Dne().Dne(this.Dne.get(paramInt), false);
    ((Minecraft)((Utr)this.Dne).Dne).Dne.Dne(irb.Dne().Dne());
    (Utr.Dne((Utr)this.Dne)).bzF = (ulE)this.Dne.get(paramInt);
    ((Utr)this.Dne).Dne.FWm(irb.FWm((String)(Utr.Dne((Utr)this.Dne)).bzF));
    (Utr.Dne((Utr)this.Dne)).Dne = (ONk)irb.Dne().Dne("gui.done");
    Utr.Dne((Utr)this.Dne).FWm();
  }
  
  protected void Dne() {
    this.Dne.aFZ();
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    ((Utr)this.Dne).Dne.FWm(true);
    this.Dne.Dne((msA)((Utr)this.Dne).Dne, (String)this.Dne.get(this.Dne.get(paramInt1)), ((Utr)this.Dne).FWm / 2, paramInt3 + 1, 16777215);
    ((Utr)this.Dne).Dne.FWm(irb.FWm((String)(Utr.Dne((Utr)this.Dne)).bzF));
  }
  
  protected boolean Dne(int paramInt) {
    return ((String)this.Dne.get(paramInt)).equals(irb.Dne().Dne());
  }
  
  protected int bzF() {
    return Dne() * 18;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GBu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */