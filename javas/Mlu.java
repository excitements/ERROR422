import org.lwjgl.opengl.GL11;

public class Mlu extends YAD {
  private EnT Dne;
  
  private int Dne;
  
  protected void FWm(bVr parambVr, float paramFloat) {
    float f = 0.9375F;
    GL11.glScalef(f, f, f);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((bVr)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne() {
    GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    FWm((bVr)paramFUH, paramFloat);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((bVr)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(bVr parambVr, float paramFloat) {
    float f = 1.0F;
    GL11.glColor3f(f, f, f);
    super.FWm(parambVr, paramFloat);
    NMq nMq = parambVr.Dne();
    if (nMq != null) {
      GL11.glPushMatrix();
      if (this.Dne.DyG) {
        float f1 = 0.5F;
        GL11.glTranslatef(0.0F, 0.625F, 0.0F);
        GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
        GL11.glScalef(f1, f1, f1);
      } 
      this.Dne.zGp.bzF(0.0625F);
      GL11.glTranslatef(-0.0625F, 0.53125F, 0.21875F);
      if (nMq.bzF < 256 && zVu.Dne(zKP.Dne[nMq.bzF].Dne())) {
        float f1 = 0.5F;
        GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
        f1 *= 0.75F;
        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(f1, -f1, f1);
      } else if (nMq.bzF == ((DsI)dEr.Dne).Qnq) {
        float f1 = 0.625F;
        GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
        GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(f1, -f1, f1);
        GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      } else if (dEr.Dne[nMq.bzF].FWm()) {
        float f1 = 0.625F;
        if (dEr.Dne[nMq.bzF].bzF()) {
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslatef(0.0F, -0.125F, 0.0F);
        } 
        Dne();
        GL11.glScalef(f1, -f1, f1);
        GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      } else {
        float f1 = 0.375F;
        GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
        GL11.glScalef(f1, f1, f1);
        GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
      } 
      GL11.glRotatef(-15.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
      this.Dne.Dne.Dne(parambVr, nMq, 0);
      if (nMq.Dne().Dne())
        this.Dne.Dne.Dne(parambVr, nMq, 1); 
      GL11.glPopMatrix();
    } 
  }
  
  public void Dne(bVr parambVr, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()LNMq;
    //   4: astore #10
    //   6: aload_0
    //   7: getfield Dne : LEnT;
    //   10: invokevirtual Dne : ()I
    //   13: aload_0
    //   14: getfield Dne : I
    //   17: if_icmpeq -> 61
    //   20: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   23: invokevirtual Dne : ()LdLs;
    //   26: ldc 'Loaded new witch model'
    //   28: invokeinterface Dne : (Ljava/lang/String;)V
    //   33: aload_0
    //   34: aload_0
    //   35: new EnT
    //   38: dup
    //   39: fconst_0
    //   40: invokespecial <init> : (F)V
    //   43: dup_x1
    //   44: putfield Dne : LEnT;
    //   47: putfield Dne : LGor;
    //   50: aload_0
    //   51: aload_0
    //   52: getfield Dne : LEnT;
    //   55: invokevirtual Dne : ()I
    //   58: putfield Dne : I
    //   61: aload_0
    //   62: getfield Dne : LEnT;
    //   65: aload #10
    //   67: ifnull -> 74
    //   70: iconst_1
    //   71: goto -> 75
    //   74: iconst_0
    //   75: putfield Dne : Z
    //   78: aload_0
    //   79: aload_1
    //   80: dload_2
    //   81: dload #4
    //   83: dload #6
    //   85: fload #8
    //   87: fload #9
    //   89: invokespecial Dne : (LFUH;DDDFF)V
    //   92: return
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((bVr)paramFUH, paramFloat);
  }
  
  public Mlu() {
    // Byte code:
    //   0: aload_0
    //   1: new EnT
    //   4: dup
    //   5: fconst_0
    //   6: invokespecial <init> : (F)V
    //   9: ldc 0.5
    //   11: invokespecial <init> : (LGor;F)V
    //   14: aload_0
    //   15: aload_0
    //   16: getfield Dne : LGor;
    //   19: checkcast EnT
    //   22: putfield Dne : LEnT;
    //   25: aload_0
    //   26: aload_0
    //   27: getfield Dne : LEnT;
    //   30: invokevirtual Dne : ()I
    //   33: putfield Dne : I
    //   36: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Mlu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */