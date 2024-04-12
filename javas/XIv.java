import java.util.List;
import org.lwjgl.opengl.GL11;

class XIv extends LSv {
  final SbO Dne;
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    List<Gax> list = (SbO.bzF(this.Dne)).Dne.Dne();
    try {
      (SbO.Qnq(this.Dne)).Dne.Dne(list.get(paramInt));
      (SbO.aFZ(this.Dne)).Dne.bzF();
      (SbO.zGp(this.Dne)).Dne.Dne();
    } catch (Exception exception) {
      (SbO.DyG(this.Dne)).Dne.Dne(list.get(0));
      (SbO.div(this.Dne)).Dne.bzF();
      (SbO.IjH(this.Dne)).Dne.Dne();
    } 
  }
  
  protected int Dne() {
    return (SbO.FWm(this.Dne)).Dne.Dne().size();
  }
  
  protected void Dne() {
    this.Dne.aFZ();
  }
  
  protected int bzF() {
    return Dne() * 36;
  }
  
  public XIv(SbO paramSbO) {
    super(SbO.Dne(paramSbO), paramSbO.FWm, paramSbO.bzF, 32, paramSbO.bzF - 55 + 4, 36);
    this.Dne = paramSbO;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    Gax gax = (SbO.Zpi(this.Dne)).Dne.Dne().get(paramInt1);
    gax.FWm((Snh)(SbO.kGO(this.Dne)).Dne);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    paramWAR.Dne();
    paramWAR.bzF(16777215);
    paramWAR.Dne(paramInt2, (paramInt3 + paramInt4), 0.0D, 0.0D, 1.0D);
    paramWAR.Dne((paramInt2 + 32), (paramInt3 + paramInt4), 0.0D, 1.0D, 1.0D);
    paramWAR.Dne((paramInt2 + 32), paramInt3, 0.0D, 1.0D, 0.0D);
    paramWAR.Dne(paramInt2, paramInt3, 0.0D, 0.0D, 0.0D);
    paramWAR.Dne();
    String str = gax.FWm();
    if (!gax.Dne())
      str = Dne.aFZ + KGL.Dne("texturePack.incompatible") + " - " + str; 
    if (str.length() > 32)
      str = str.substring(0, 32).trim() + "..."; 
    this.Dne.FWm(SbO.Dne(this.Dne), str, paramInt2 + 32 + 2, paramInt3 + 1, 16777215);
    this.Dne.FWm(SbO.FWm(this.Dne), gax.bzF(), paramInt2 + 32 + 2, paramInt3 + 12, 8421504);
    this.Dne.FWm(SbO.bzF(this.Dne), gax.Qnq(), paramInt2 + 32 + 2, paramInt3 + 12 + 10, 8421504);
  }
  
  protected boolean Dne(int paramInt) {
    List<Gax> list = (SbO.mrb(this.Dne)).Dne.Dne();
    return ((SbO.XHL(this.Dne)).Dne.Dne() == list.get(paramInt));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XIv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */