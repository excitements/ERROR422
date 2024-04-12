public class rzA extends Jte {
  private EVc FWm = new EVc(0, 0, 64, 64);
  
  public static rzA Dne;
  
  private EVc Dne = new EVc(0, 0, 64, 32);
  
  public void Dne(CUf paramCUf, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, paramCUf.zGp() & 0x7, (paramCUf.FWm() * 360) / 16.0F, paramCUf.Dne(), paramCUf.Dne());
  }
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((CUf)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
  
  public void Dne(XWr paramXWr) {
    super.Dne(paramXWr);
    Dne = (EVc)this;
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, float paramFloat4, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LEVc;
    //   4: astore #8
    //   6: iload #6
    //   8: tableswitch default -> 44, 0 -> 44, 1 -> 53, 2 -> 62, 3 -> 77, 4 -> 179
    //   44: aload_0
    //   45: ldc '/mob/skeleton.png'
    //   47: invokevirtual Dne : (Ljava/lang/String;)V
    //   50: goto -> 185
    //   53: aload_0
    //   54: ldc '/mob/skeleton_wither.png'
    //   56: invokevirtual Dne : (Ljava/lang/String;)V
    //   59: goto -> 185
    //   62: aload_0
    //   63: ldc '/mob/zombie.png'
    //   65: invokevirtual Dne : (Ljava/lang/String;)V
    //   68: aload_0
    //   69: getfield FWm : LEVc;
    //   72: astore #8
    //   74: goto -> 185
    //   77: aload #7
    //   79: ifnull -> 170
    //   82: aload #7
    //   84: invokevirtual length : ()I
    //   87: ifle -> 170
    //   90: new java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial <init> : ()V
    //   97: ldc 'http://skins.minecraft.net/MinecraftSkins/'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload #7
    //   104: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: ldc '.png'
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual toString : ()Ljava/lang/String;
    //   118: astore #9
    //   120: getstatic rzA.Dne : LrzA;
    //   123: getfield Dne : LXWr;
    //   126: getfield Dne : LSnh;
    //   129: aload #9
    //   131: invokevirtual Dne : (Ljava/lang/String;)Z
    //   134: ifne -> 159
    //   137: getstatic rzA.Dne : LrzA;
    //   140: getfield Dne : LXWr;
    //   143: getfield Dne : LSnh;
    //   146: aload #9
    //   148: new VGP
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: invokevirtual Dne : (Ljava/lang/String;LfwN;)LPfo;
    //   158: pop
    //   159: aload_0
    //   160: aload #9
    //   162: ldc '/mob/char.png'
    //   164: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   167: goto -> 185
    //   170: aload_0
    //   171: ldc '/mob/char.png'
    //   173: invokevirtual Dne : (Ljava/lang/String;)V
    //   176: goto -> 185
    //   179: aload_0
    //   180: ldc '/mob/creeper.png'
    //   182: invokevirtual Dne : (Ljava/lang/String;)V
    //   185: invokestatic glPushMatrix : ()V
    //   188: sipush #2884
    //   191: invokestatic glDisable : (I)V
    //   194: iload #4
    //   196: iconst_1
    //   197: if_icmpeq -> 316
    //   200: iload #4
    //   202: tableswitch default -> 294, 2 -> 232, 3 -> 250, 4 -> 272, 5 -> 294
    //   232: fload_1
    //   233: ldc 0.5
    //   235: fadd
    //   236: fload_2
    //   237: ldc 0.25
    //   239: fadd
    //   240: fload_3
    //   241: ldc 0.74
    //   243: fadd
    //   244: invokestatic glTranslatef : (FFF)V
    //   247: goto -> 328
    //   250: fload_1
    //   251: ldc 0.5
    //   253: fadd
    //   254: fload_2
    //   255: ldc 0.25
    //   257: fadd
    //   258: fload_3
    //   259: ldc 0.26
    //   261: fadd
    //   262: invokestatic glTranslatef : (FFF)V
    //   265: ldc 180.0
    //   267: fstore #5
    //   269: goto -> 328
    //   272: fload_1
    //   273: ldc 0.74
    //   275: fadd
    //   276: fload_2
    //   277: ldc 0.25
    //   279: fadd
    //   280: fload_3
    //   281: ldc 0.5
    //   283: fadd
    //   284: invokestatic glTranslatef : (FFF)V
    //   287: ldc 270.0
    //   289: fstore #5
    //   291: goto -> 328
    //   294: fload_1
    //   295: ldc 0.26
    //   297: fadd
    //   298: fload_2
    //   299: ldc 0.25
    //   301: fadd
    //   302: fload_3
    //   303: ldc 0.5
    //   305: fadd
    //   306: invokestatic glTranslatef : (FFF)V
    //   309: ldc 90.0
    //   311: fstore #5
    //   313: goto -> 328
    //   316: fload_1
    //   317: ldc 0.5
    //   319: fadd
    //   320: fload_2
    //   321: fload_3
    //   322: ldc 0.5
    //   324: fadd
    //   325: invokestatic glTranslatef : (FFF)V
    //   328: ldc 0.0625
    //   330: fstore #9
    //   332: ldc 32826
    //   334: invokestatic glEnable : (I)V
    //   337: ldc -1.0
    //   339: ldc -1.0
    //   341: fconst_1
    //   342: invokestatic glScalef : (FFF)V
    //   345: sipush #3008
    //   348: invokestatic glEnable : (I)V
    //   351: aload #8
    //   353: aconst_null
    //   354: checkcast sMa
    //   357: fconst_0
    //   358: fconst_0
    //   359: fconst_0
    //   360: fload #5
    //   362: fconst_0
    //   363: fload #9
    //   365: invokevirtual Dne : (LsMa;FFFFFF)V
    //   368: invokestatic glPopMatrix : ()V
    //   371: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rzA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */