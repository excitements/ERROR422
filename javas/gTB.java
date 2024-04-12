import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class gTB extends MlO {
  private float bzF;
  
  private float Dne;
  
  public static void Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2) {
    GL11.glEnable(2903);
    GL11.glPushMatrix();
    GL11.glTranslatef(paramInt1, paramInt2, 50.0F);
    GL11.glScalef(-paramInt3, paramInt3, paramInt3);
    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
    float f1 = paramMinecraft.Dne.IjH;
    float f2 = paramMinecraft.Dne.mrb;
    int i = paramMinecraft.Dne.XHL;
    GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
    Cit.FWm();
    GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-((float)Math.atan((paramFloat2 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
    paramMinecraft.Dne.IjH = (float)Math.atan((paramFloat1 / 40.0F)) * 20.0F;
    paramMinecraft.Dne.mrb = (float)Math.atan((paramFloat1 / 40.0F)) * 40.0F;
    paramMinecraft.Dne.XHL = -((float)Math.atan((paramFloat2 / 40.0F))) * 20.0F;
    paramMinecraft.Dne.vSL = paramMinecraft.Dne.mrb;
    GL11.glTranslatef(0.0F, paramMinecraft.Dne.udO, 0.0F);
    ((ptH)ptH.Dne).Dne = 180.0F;
    ptH.Dne.Dne(paramMinecraft.Dne, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    paramMinecraft.Dne.IjH = f1;
    paramMinecraft.Dne.mrb = f2;
    paramMinecraft.Dne.XHL = i;
    GL11.glPopMatrix();
    Cit.Dne();
    GL11.glDisable(32826);
    oCF.Dne(oCF.FWm);
    GL11.glDisable(3553);
    oCF.Dne(oCF.Dne);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    super.Dne(paramInt1, paramInt2, paramFloat);
    this.Dne = paramInt1;
    this.bzF = paramInt2;
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.Dne.Dne.Dne("/gui/inventory.png");
    onZ onZ = this.aFZ;
    int i = this.zGp;
    FWm(onZ, i, 0, 0, this.Dne, this.Qnq);
    Dne(this.Dne, onZ + 51, i + 75, 30, (onZ + 51) - this.Dne, (i + 75 - 50) - this.bzF);
  }
  
  public gTB(FiG paramFiG) {
    super(paramFiG.Dne);
    paramFiG.Dne(qlg.Dne, 1);
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LmsA;
    //   4: ldc 'container.crafting'
    //   6: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   9: bipush #86
    //   11: bipush #16
    //   13: ldc 4210752
    //   15: invokevirtual FWm : (Ljava/lang/String;III)I
    //   18: pop
    //   19: return
  }
  
  public void bzF() {
    if (this.Dne.Dne.aFZ())
      this.Dne.Dne(new VXB(this.Dne.Dne)); 
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 0)
      this.Dne.Dne(new apb((FkP)this.Dne.Dne)); 
    if (paramPee.aFZ == 1)
      this.Dne.Dne(new ZyA(this, (FkP)this.Dne.Dne)); 
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface clear : ()V
    //   9: aload_0
    //   10: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   13: getfield Dne : LRJV;
    //   16: invokevirtual aFZ : ()Z
    //   19: ifeq -> 46
    //   22: aload_0
    //   23: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   26: new VXB
    //   29: dup
    //   30: aload_0
    //   31: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   34: getfield Dne : LMJs;
    //   37: invokespecial <init> : (LFiG;)V
    //   40: invokevirtual Dne : (LqVZ;)V
    //   43: goto -> 50
    //   46: aload_0
    //   47: invokespecial Dne : ()V
    //   50: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gTB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */