import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class VFk extends Sss {
  private int DyG = 0;
  
  private LdY Dne;
  
  private YzO Dne;
  
  private LdY FWm;
  
  private String Dne;
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/trading.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
    ybO ybO = this.Dne.Dne((FiG)((Minecraft)this.Dne).Dne);
    if (ybO != null && !ybO.isEmpty()) {
      int k = this.DyG;
      Vnr vnr = (Vnr)ybO.get(k);
      if (vnr.FWm()) {
        ((Minecraft)this.Dne).Dne.Dne("/gui/trading.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        FWm(this.aFZ + 83, this.zGp + 21, 212, 0, 28, 21);
        FWm(this.aFZ + 83, this.zGp + 51, 212, 0, 28, 21);
      } 
    } 
  }
  
  protected void Dne(Pee paramPee) {
    boolean bool = false;
    if (paramPee == this.Dne) {
      this.DyG++;
      bool = true;
    } else if (paramPee == this.FWm) {
      this.DyG--;
      bool = true;
    } 
    if (bool) {
      ((ema)this.Dne).Dne(this.DyG);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        dataOutputStream.writeInt(this.DyG);
        this.Dne.Dne().FWm(new FaB("MC|TrSel", byteArrayOutputStream.toByteArray()));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public void bzF() {
    super.bzF();
    ybO ybO = this.Dne.Dne((FiG)((Minecraft)this.Dne).Dne);
    if (ybO != null) {
      ((LdY)this.Dne).Dne = (this.DyG < ybO.size() - 1) ? 1 : 0;
      this.FWm.Dne = (this.DyG > 0) ? 1 : 0;
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    super.Dne(paramInt1, paramInt2, paramFloat);
    ybO ybO = this.Dne.Dne((FiG)((Minecraft)this.Dne).Dne);
    if (ybO != null && !ybO.isEmpty()) {
      int i = (this.FWm - this.Dne) / 2;
      int j = (this.bzF - this.Qnq) / 2;
      int k = this.DyG;
      Vnr vnr = (Vnr)ybO.get(k);
      GL11.glPushMatrix();
      NMq nMq1 = vnr.Dne();
      NMq nMq2 = vnr.FWm();
      NMq nMq3 = vnr.bzF();
      Cit.bzF();
      GL11.glDisable(2896);
      GL11.glEnable(32826);
      GL11.glEnable(2903);
      GL11.glEnable(2896);
      ((eKj)Dne).bzF = 100.0F;
      Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, nMq1, i + 36, j + 24);
      Dne.bzF((msA)this.Dne, ((Minecraft)this.Dne).Dne, nMq1, i + 36, j + 24);
      if (nMq2 != null) {
        Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, nMq2, i + 62, j + 24);
        Dne.bzF((msA)this.Dne, ((Minecraft)this.Dne).Dne, nMq2, i + 62, j + 24);
      } 
      Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, nMq3, i + 120, j + 24);
      Dne.bzF((msA)this.Dne, ((Minecraft)this.Dne).Dne, nMq3, i + 120, j + 24);
      ((eKj)Dne).bzF = 0.0F;
      GL11.glDisable(2896);
      if (Dne(36, 24, 16, 16, paramInt1, paramInt2)) {
        Dne(nMq1, paramInt1, paramInt2);
      } else if (nMq2 != null && Dne(62, 24, 16, 16, paramInt1, paramInt2)) {
        Dne(nMq2, paramInt1, paramInt2);
      } else if (Dne(120, 24, 16, 16, paramInt1, paramInt2)) {
        Dne(nMq3, paramInt1, paramInt2);
      } 
      GL11.glPopMatrix();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      Cit.FWm();
    } 
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    this.Dne.FWm(this.Dne, this.Dne / 2 - this.Dne.Dne(this.Dne) / 2, 6, 4210752);
    this.Dne.FWm(KGL.Dne("container.inventory"), 8, this.Qnq - 96 + 2, 4210752);
  }
  
  public YzO Dne() {
    return (YzO)this.Dne;
  }
  
  public VFk(MOS paramMOS, YzO paramYzO, Qnq paramQnq, String paramString) {
    super(new ema(paramMOS, paramYzO, paramQnq));
    this.Dne = (String)paramYzO;
    this.Dne = (paramString != null && paramString.length() >= 1) ? paramString : KGL.Dne("entity.Villager.name");
  }
  
  public void Dne() {
    super.Dne();
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    this.Dne.add(this.Dne = (String)new LdY(1, i + 120 + 27, j + 24 - 1, true));
    this.Dne.add(this.FWm = new LdY(2, i + 36 - 19, j + 24 - 1, false));
    ((LdY)this.Dne).Dne = Character.MIN_VALUE;
    this.FWm.Dne = Character.MIN_VALUE;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VFk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */