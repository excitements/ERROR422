import org.lwjgl.opengl.GL11;

public class lkB extends QCe {
  private dEr Dne;
  
  private int Dne;
  
  public lkB(dEr paramdEr) {
    this(paramdEr, 0);
  }
  
  private void Dne(WAR paramWAR, gDn paramgDn) {
    float f1 = paramgDn.Dne();
    float f2 = paramgDn.FWm();
    float f3 = paramgDn.bzF();
    float f4 = paramgDn.Qnq();
    float f5 = 1.0F;
    float f6 = 0.5F;
    float f7 = 0.25F;
    GL11.glRotatef(180.0F - this.Dne.Dne, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-this.Dne.FWm, 1.0F, 0.0F, 0.0F);
    paramWAR.Dne();
    paramWAR.FWm(0.0F, 1.0F, 0.0F);
    paramWAR.Dne((0.0F - f6), (0.0F - f7), 0.0D, f1, f4);
    paramWAR.Dne((f5 - f6), (0.0F - f7), 0.0D, f2, f4);
    paramWAR.Dne((f5 - f6), (f5 - f7), 0.0D, f2, f3);
    paramWAR.Dne((0.0F - f6), (f5 - f7), 0.0D, f1, f3);
    paramWAR.Dne();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LdEr;
    //   4: aload_0
    //   5: getfield Dne : I
    //   8: invokevirtual Dne : (I)LgDn;
    //   11: astore #10
    //   13: aload #10
    //   15: ifnull -> 170
    //   18: invokestatic glPushMatrix : ()V
    //   21: dload_2
    //   22: d2f
    //   23: dload #4
    //   25: d2f
    //   26: dload #6
    //   28: d2f
    //   29: invokestatic glTranslatef : (FFF)V
    //   32: ldc 32826
    //   34: invokestatic glEnable : (I)V
    //   37: ldc 0.5
    //   39: ldc 0.5
    //   41: ldc 0.5
    //   43: invokestatic glScalef : (FFF)V
    //   46: aload_0
    //   47: ldc '/gui/items.png'
    //   49: invokevirtual Dne : (Ljava/lang/String;)V
    //   52: getstatic WAR.Dne : LWAR;
    //   55: astore #11
    //   57: aload #10
    //   59: ldc 'potion_splash'
    //   61: invokestatic Dne : (Ljava/lang/String;)LgDn;
    //   64: if_acmpne -> 154
    //   67: aload_1
    //   68: checkcast YgL
    //   71: invokevirtual Dne : ()I
    //   74: iconst_0
    //   75: invokestatic Dne : (IZ)I
    //   78: istore #12
    //   80: iload #12
    //   82: bipush #16
    //   84: ishr
    //   85: sipush #255
    //   88: iand
    //   89: i2f
    //   90: ldc 255.0
    //   92: fdiv
    //   93: fstore #13
    //   95: iload #12
    //   97: bipush #8
    //   99: ishr
    //   100: sipush #255
    //   103: iand
    //   104: i2f
    //   105: ldc 255.0
    //   107: fdiv
    //   108: fstore #14
    //   110: iload #12
    //   112: sipush #255
    //   115: iand
    //   116: i2f
    //   117: ldc 255.0
    //   119: fdiv
    //   120: fstore #15
    //   122: fload #13
    //   124: fload #14
    //   126: fload #15
    //   128: invokestatic glColor3f : (FFF)V
    //   131: invokestatic glPushMatrix : ()V
    //   134: aload_0
    //   135: aload #11
    //   137: ldc 'potion_contents'
    //   139: invokestatic Dne : (Ljava/lang/String;)LgDn;
    //   142: invokespecial Dne : (LWAR;LgDn;)V
    //   145: invokestatic glPopMatrix : ()V
    //   148: fconst_1
    //   149: fconst_1
    //   150: fconst_1
    //   151: invokestatic glColor3f : (FFF)V
    //   154: aload_0
    //   155: aload #11
    //   157: aload #10
    //   159: invokespecial Dne : (LWAR;LgDn;)V
    //   162: ldc 32826
    //   164: invokestatic glDisable : (I)V
    //   167: invokestatic glPopMatrix : ()V
    //   170: return
  }
  
  public lkB(dEr paramdEr, int paramInt) {
    this.Dne = paramdEr;
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lkB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */