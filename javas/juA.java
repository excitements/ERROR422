import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class juA extends Sss implements mXX {
  private sZS Dne;
  
  private MOS Dne;
  
  private mHN Dne;
  
  protected void Dne(char paramChar, int paramInt) {
    if (this.Dne.Dne(paramChar, paramInt)) {
      this.Dne.Dne(this.Dne.Dne());
      ((Minecraft)this.Dne).Dne.Dne.FWm(new FaB("MC|ItemName", this.Dne.Dne().getBytes()));
    } else {
      super.Dne(paramChar, paramInt);
    } 
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/repair.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
    FWm(i + 59, j + 20, 0, this.Qnq + (this.Dne.Dne(0).Dne() ? 0 : 16), 110, 16);
    if ((this.Dne.Dne(0).Dne() || this.Dne.Dne(1).Dne()) && !this.Dne.Dne(2).Dne())
      FWm(i + 99, j + 45, this.Dne, 0, 28, 21); 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public void FWm() {
    super.FWm();
    Keyboard.enableRepeatEvents(false);
    this.Dne.FWm(this);
  }
  
  public void Dne(Pdb paramPdb, int paramInt1, int paramInt2) {}
  
  public void Dne(Pdb paramPdb, int paramInt, NMq paramNMq) {
    if (paramInt == 0) {
      this.Dne.Dne((paramNMq == null) ? "" : paramNMq.FWm());
      this.Dne.bzF((paramNMq != null));
      if (paramNMq != null) {
        this.Dne.Dne(this.Dne.Dne());
        ((Minecraft)this.Dne).Dne.Dne.FWm(new FaB("MC|ItemName", this.Dne.Dne().getBytes()));
      } 
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    super.Dne(paramInt1, paramInt2, paramFloat);
    GL11.glDisable(2896);
    this.Dne.Qnq();
  }
  
  public void Dne() {
    super.Dne();
    Keyboard.enableRepeatEvents(true);
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    this.Dne = new mHN((msA)this.Dne, i + 62, j + 24, 103, 12);
    this.Dne.zGp(-1);
    this.Dne.DyG(-1);
    this.Dne.Dne(false);
    this.Dne.aFZ(30);
    this.Dne.FWm(this);
    this.Dne.Dne(this);
  }
  
  public void Dne(Pdb paramPdb, List paramList) {
    Dne(paramPdb, 0, paramPdb.Dne(0).Dne());
  }
  
  public juA(MOS paramMOS, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super(new sZS(paramMOS, paramQnq, paramInt1, paramInt2, paramInt3, (Minecraft.Dne()).Dne));
    this.Dne = (mHN)paramMOS;
    this.Dne = this.Dne;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    GL11.glDisable(2896);
    this.Dne.FWm(KGL.Dne("container.repair"), 60, 6, 4210752);
    if (((sZS)this.Dne).FWm > null) {
      int i = 8453920;
      boolean bool = true;
      String str = KGL.Dne("container.repair.cost", new Object[] { Integer.valueOf(2) });
      str = str.replaceFirst("2", "");
      str = str + Integer.toBinaryString(((sZS)this.Dne).FWm);
      if (((sZS)this.Dne).FWm >= 40 && !((uqg)((Minecraft)this.Dne).Dne.Dne).Qnq) {
        str = KGL.Dne("container.repair.expensive");
        i = 16736352;
      } else if (!this.Dne.Dne(2).Dne()) {
        bool = false;
      } else if (!this.Dne.Dne(2).Dne(((MOS)this.Dne).Dne)) {
        i = 16736352;
      } 
      if (bool) {
        int j = 0xFF000000 | (i & 0xFCFCFC) >> 2 | i & 0xFF000000;
        int k = this.Dne - 8 - this.Dne.Dne(str);
        byte b = 67;
        if (this.Dne.Dne()) {
          Dne(k - 3, b - 2, this.Dne - 7, b + 10, -16777216);
          Dne(k - 2, b - 1, this.Dne - 8, b + 9, -12895429);
        } else {
          this.Dne.FWm(str, k, b + 1, j);
          this.Dne.FWm(str, k + 1, b, j);
          this.Dne.FWm(str, k + 1, b + 1, j);
        } 
        this.Dne.FWm(str, k, b, i);
      } 
    } 
    GL11.glEnable(2896);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\juA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */