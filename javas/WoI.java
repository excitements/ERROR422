import org.lwjgl.opengl.GL11;

public class WoI extends QCe {
  private gDn Dne;
  
  private final zVu FWm = new zVu();
  
  public void Dne(Rbp paramRbp) {
    this.Dne = paramRbp.Dne("itemframe_back");
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((BPY)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(BPY paramBPY, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    float f1 = (float)(paramBPY.div - paramDouble1) - 0.5F;
    float f2 = (float)(paramBPY.IjH - paramDouble2) - 0.5F;
    float f3 = (float)(paramBPY.mrb - paramDouble3) - 0.5F;
    int i = paramBPY.FWm + zxJ.Dne[paramBPY.Dne];
    int j = paramBPY.bzF;
    int k = paramBPY.Qnq + zxJ.FWm[paramBPY.Dne];
    GL11.glTranslatef(i - f1, j - f2, k - f3);
    Dne(paramBPY);
    FWm(paramBPY);
    GL11.glPopMatrix();
  }
  
  private void FWm(BPY paramBPY) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()LNMq;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 519
    //   9: new JiM
    //   12: dup
    //   13: aload_1
    //   14: getfield Dne : LQnq;
    //   17: dconst_0
    //   18: dconst_0
    //   19: dconst_0
    //   20: aload_2
    //   21: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual Dne : ()LNMq;
    //   29: iconst_1
    //   30: putfield Dne : I
    //   33: aload_3
    //   34: fconst_0
    //   35: putfield Dne : F
    //   38: invokestatic glPushMatrix : ()V
    //   41: ldc -0.453125
    //   43: getstatic zxJ.Dne : [I
    //   46: aload_1
    //   47: getfield Dne : I
    //   50: iaload
    //   51: i2f
    //   52: fmul
    //   53: ldc -0.18
    //   55: ldc -0.453125
    //   57: getstatic zxJ.FWm : [I
    //   60: aload_1
    //   61: getfield Dne : I
    //   64: iaload
    //   65: i2f
    //   66: fmul
    //   67: invokestatic glTranslatef : (FFF)V
    //   70: ldc 180.0
    //   72: aload_1
    //   73: getfield mrb : F
    //   76: fadd
    //   77: fconst_0
    //   78: fconst_1
    //   79: fconst_0
    //   80: invokestatic glRotatef : (FFFF)V
    //   83: bipush #-90
    //   85: aload_1
    //   86: invokevirtual Qnq : ()I
    //   89: imul
    //   90: i2f
    //   91: fconst_0
    //   92: fconst_0
    //   93: fconst_1
    //   94: invokestatic glRotatef : (FFFF)V
    //   97: aload_1
    //   98: invokevirtual Qnq : ()I
    //   101: tableswitch default -> 157, 1 -> 128, 2 -> 139, 3 -> 149
    //   128: ldc -0.16
    //   130: ldc -0.16
    //   132: fconst_0
    //   133: invokestatic glTranslatef : (FFF)V
    //   136: goto -> 157
    //   139: fconst_0
    //   140: ldc -0.32
    //   142: fconst_0
    //   143: invokestatic glTranslatef : (FFF)V
    //   146: goto -> 157
    //   149: ldc 0.16
    //   151: ldc -0.16
    //   153: fconst_0
    //   154: invokestatic glTranslatef : (FFF)V
    //   157: aload_3
    //   158: invokevirtual Dne : ()LNMq;
    //   161: invokevirtual Dne : ()LdEr;
    //   164: getstatic dEr.Dne : Lmva;
    //   167: if_acmpne -> 380
    //   170: aload_0
    //   171: getfield Dne : LptH;
    //   174: getfield Dne : LSnh;
    //   177: ldc '/misc/mapbg.png'
    //   179: invokevirtual Dne : (Ljava/lang/String;)V
    //   182: getstatic WAR.Dne : LWAR;
    //   185: astore #4
    //   187: ldc 180.0
    //   189: fconst_0
    //   190: fconst_1
    //   191: fconst_0
    //   192: invokestatic glRotatef : (FFFF)V
    //   195: ldc 180.0
    //   197: fconst_0
    //   198: fconst_0
    //   199: fconst_1
    //   200: invokestatic glRotatef : (FFFF)V
    //   203: ldc 0.00390625
    //   205: ldc 0.00390625
    //   207: ldc 0.00390625
    //   209: invokestatic glScalef : (FFF)V
    //   212: ldc -65.0
    //   214: ldc -107.0
    //   216: ldc -3.0
    //   218: invokestatic glTranslatef : (FFF)V
    //   221: fconst_0
    //   222: fconst_0
    //   223: ldc -1.0
    //   225: invokestatic glNormal3f : (FFF)V
    //   228: aload #4
    //   230: invokevirtual Dne : ()V
    //   233: bipush #7
    //   235: istore #5
    //   237: aload #4
    //   239: iconst_0
    //   240: iload #5
    //   242: isub
    //   243: i2d
    //   244: sipush #128
    //   247: iload #5
    //   249: iadd
    //   250: i2d
    //   251: dconst_0
    //   252: dconst_0
    //   253: dconst_1
    //   254: invokevirtual Dne : (DDDDD)V
    //   257: aload #4
    //   259: sipush #128
    //   262: iload #5
    //   264: iadd
    //   265: i2d
    //   266: sipush #128
    //   269: iload #5
    //   271: iadd
    //   272: i2d
    //   273: dconst_0
    //   274: dconst_1
    //   275: dconst_1
    //   276: invokevirtual Dne : (DDDDD)V
    //   279: aload #4
    //   281: sipush #128
    //   284: iload #5
    //   286: iadd
    //   287: i2d
    //   288: iconst_0
    //   289: iload #5
    //   291: isub
    //   292: i2d
    //   293: dconst_0
    //   294: dconst_1
    //   295: dconst_0
    //   296: invokevirtual Dne : (DDDDD)V
    //   299: aload #4
    //   301: iconst_0
    //   302: iload #5
    //   304: isub
    //   305: i2d
    //   306: iconst_0
    //   307: iload #5
    //   309: isub
    //   310: i2d
    //   311: dconst_0
    //   312: dconst_0
    //   313: dconst_0
    //   314: invokevirtual Dne : (DDDDD)V
    //   317: aload #4
    //   319: invokevirtual Dne : ()I
    //   322: pop
    //   323: getstatic dEr.Dne : Lmva;
    //   326: aload_3
    //   327: invokevirtual Dne : ()LNMq;
    //   330: aload_1
    //   331: getfield Dne : LQnq;
    //   334: invokevirtual Dne : (LNMq;LQnq;)LIlk;
    //   337: astore #6
    //   339: fconst_0
    //   340: fconst_0
    //   341: ldc -1.0
    //   343: invokestatic glTranslatef : (FFF)V
    //   346: aload #6
    //   348: ifnull -> 377
    //   351: aload_0
    //   352: getfield Dne : LptH;
    //   355: getfield Dne : LXyI;
    //   358: getfield Dne : LBXL;
    //   361: aconst_null
    //   362: checkcast FiG
    //   365: aload_0
    //   366: getfield Dne : LptH;
    //   369: getfield Dne : LSnh;
    //   372: aload #6
    //   374: invokevirtual Dne : (LFiG;LSnh;LIlk;)V
    //   377: goto -> 516
    //   380: aload_3
    //   381: invokevirtual Dne : ()LNMq;
    //   384: invokevirtual Dne : ()LdEr;
    //   387: getstatic dEr.Suj : LdEr;
    //   390: if_acmpne -> 473
    //   393: getstatic qjt.Dne : Lqjt;
    //   396: astore #4
    //   398: aload #4
    //   400: getfield Dne : D
    //   403: dstore #5
    //   405: aload #4
    //   407: getfield FWm : D
    //   410: dstore #7
    //   412: aload #4
    //   414: dconst_0
    //   415: putfield Dne : D
    //   418: aload #4
    //   420: dconst_0
    //   421: putfield FWm : D
    //   424: aload #4
    //   426: aload_1
    //   427: getfield Dne : LQnq;
    //   430: aload_1
    //   431: getfield div : D
    //   434: aload_1
    //   435: getfield mrb : D
    //   438: sipush #180
    //   441: aload_1
    //   442: getfield Dne : I
    //   445: bipush #90
    //   447: imul
    //   448: iadd
    //   449: i2f
    //   450: invokestatic aFZ : (F)F
    //   453: f2d
    //   454: iconst_0
    //   455: iconst_1
    //   456: invokevirtual Dne : (LQnq;DDDZZ)V
    //   459: aload #4
    //   461: dload #5
    //   463: putfield Dne : D
    //   466: aload #4
    //   468: dload #7
    //   470: putfield FWm : D
    //   473: iconst_1
    //   474: putstatic eKj.FWm : Z
    //   477: getstatic ptH.Dne : LptH;
    //   480: aload_3
    //   481: dconst_0
    //   482: dconst_0
    //   483: dconst_0
    //   484: fconst_0
    //   485: fconst_0
    //   486: invokevirtual Dne : (LsMa;DDDFF)V
    //   489: iconst_0
    //   490: putstatic eKj.FWm : Z
    //   493: aload_3
    //   494: invokevirtual Dne : ()LNMq;
    //   497: invokevirtual Dne : ()LdEr;
    //   500: getstatic dEr.Suj : LdEr;
    //   503: if_acmpne -> 516
    //   506: getstatic qjt.Dne : Lqjt;
    //   509: astore #4
    //   511: aload #4
    //   513: invokevirtual Dne : ()V
    //   516: invokestatic glPopMatrix : ()V
    //   519: return
  }
  
  private void Dne(BPY paramBPY) {
    GL11.glPushMatrix();
    ((ptH)this.Dne).Dne.Dne("/terrain.png");
    GL11.glRotatef(paramBPY.mrb, 0.0F, 1.0F, 0.0F);
    gDn gDn1 = zKP.Qnq;
    float f1 = 0.0625F;
    float f2 = 0.75F;
    float f3 = f2 / 2.0F;
    GL11.glPushMatrix();
    this.FWm.FWm(0.0D, (0.5F - f3 + 0.0625F), (0.5F - f3 + 0.0625F), (f1 * 0.5F), (0.5F + f3 - 0.0625F), (0.5F + f3 - 0.0625F));
    this.FWm.Dne(this.Dne);
    this.FWm.Dne((zKP)gDn1, 0, 1.0F);
    this.FWm.Dne();
    this.FWm.FWm();
    GL11.glPopMatrix();
    this.FWm.Dne(zKP.Qnq.Dne(1, 2));
    GL11.glPushMatrix();
    this.FWm.FWm(0.0D, (0.5F - f3), (0.5F - f3), (f1 + 1.0E-4F), (f1 + 0.5F - f3), (0.5F + f3));
    this.FWm.Dne((zKP)gDn1, 0, 1.0F);
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    this.FWm.FWm(0.0D, (0.5F + f3 - f1), (0.5F - f3), (f1 + 1.0E-4F), (0.5F + f3), (0.5F + f3));
    this.FWm.Dne((zKP)gDn1, 0, 1.0F);
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    this.FWm.FWm(0.0D, (0.5F - f3), (0.5F - f3), f1, (0.5F + f3), (f1 + 0.5F - f3));
    this.FWm.Dne((zKP)gDn1, 0, 1.0F);
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    this.FWm.FWm(0.0D, (0.5F - f3), (0.5F + f3 - f1), f1, (0.5F + f3), (0.5F + f3));
    this.FWm.Dne((zKP)gDn1, 0, 1.0F);
    GL11.glPopMatrix();
    this.FWm.FWm();
    this.FWm.Dne();
    GL11.glPopMatrix();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WoI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */