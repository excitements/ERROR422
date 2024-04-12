import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BMa {
  private Snh Dne;
  
  private List[] Dne;
  
  protected Qnq Dne;
  
  private Random Dne = (Random)new List[4];
  
  public void Dne(sMa paramsMa, float paramFloat) {
    // Byte code:
    //   0: getstatic lqj.Qnq : F
    //   3: fstore_3
    //   4: getstatic lqj.zGp : F
    //   7: fstore #4
    //   9: getstatic lqj.DyG : F
    //   12: fstore #5
    //   14: getstatic lqj.div : F
    //   17: fstore #6
    //   19: getstatic lqj.aFZ : F
    //   22: fstore #7
    //   24: aload_1
    //   25: getfield udO : D
    //   28: aload_1
    //   29: getfield div : D
    //   32: aload_1
    //   33: getfield udO : D
    //   36: dsub
    //   37: fload_2
    //   38: f2d
    //   39: dmul
    //   40: dadd
    //   41: putstatic CAZ.Dne : D
    //   44: aload_1
    //   45: getfield ooe : D
    //   48: aload_1
    //   49: getfield IjH : D
    //   52: aload_1
    //   53: getfield ooe : D
    //   56: dsub
    //   57: fload_2
    //   58: f2d
    //   59: dmul
    //   60: dadd
    //   61: putstatic CAZ.FWm : D
    //   64: aload_1
    //   65: getfield trS : D
    //   68: aload_1
    //   69: getfield mrb : D
    //   72: aload_1
    //   73: getfield trS : D
    //   76: dsub
    //   77: fload_2
    //   78: f2d
    //   79: dmul
    //   80: dadd
    //   81: putstatic CAZ.bzF : D
    //   84: iconst_0
    //   85: istore #8
    //   87: iload #8
    //   89: iconst_3
    //   90: if_icmpge -> 316
    //   93: aload_0
    //   94: getfield Dne : [Ljava/util/List;
    //   97: iload #8
    //   99: aaload
    //   100: invokeinterface isEmpty : ()Z
    //   105: ifne -> 310
    //   108: iload #8
    //   110: tableswitch default -> 136, 0 -> 136, 1 -> 148, 2 -> 160
    //   136: aload_0
    //   137: getfield Dne : LSnh;
    //   140: ldc '/particles.png'
    //   142: invokevirtual Dne : (Ljava/lang/String;)V
    //   145: goto -> 169
    //   148: aload_0
    //   149: getfield Dne : LSnh;
    //   152: ldc '/terrain.png'
    //   154: invokevirtual Dne : (Ljava/lang/String;)V
    //   157: goto -> 169
    //   160: aload_0
    //   161: getfield Dne : LSnh;
    //   164: ldc '/gui/items.png'
    //   166: invokevirtual Dne : (Ljava/lang/String;)V
    //   169: getstatic WAR.Dne : LWAR;
    //   172: astore #9
    //   174: fconst_1
    //   175: fconst_1
    //   176: fconst_1
    //   177: fconst_1
    //   178: invokestatic glColor4f : (FFFF)V
    //   181: iconst_0
    //   182: invokestatic glDepthMask : (Z)V
    //   185: sipush #3042
    //   188: invokestatic glEnable : (I)V
    //   191: sipush #770
    //   194: sipush #771
    //   197: invokestatic glBlendFunc : (II)V
    //   200: sipush #516
    //   203: ldc 0.003921569
    //   205: invokestatic glAlphaFunc : (IF)V
    //   208: aload #9
    //   210: invokevirtual Dne : ()V
    //   213: iconst_0
    //   214: istore #10
    //   216: iload #10
    //   218: aload_0
    //   219: getfield Dne : [Ljava/util/List;
    //   222: iload #8
    //   224: aaload
    //   225: invokeinterface size : ()I
    //   230: if_icmpge -> 286
    //   233: aload_0
    //   234: getfield Dne : [Ljava/util/List;
    //   237: iload #8
    //   239: aaload
    //   240: iload #10
    //   242: invokeinterface get : (I)Ljava/lang/Object;
    //   247: checkcast CAZ
    //   250: astore #11
    //   252: aload #9
    //   254: aload #11
    //   256: fload_2
    //   257: invokevirtual Dne : (F)I
    //   260: invokevirtual FWm : (I)V
    //   263: aload #11
    //   265: aload #9
    //   267: fload_2
    //   268: fload_3
    //   269: fload #7
    //   271: fload #4
    //   273: fload #5
    //   275: fload #6
    //   277: invokevirtual Dne : (LWAR;FFFFFF)V
    //   280: iinc #10, 1
    //   283: goto -> 216
    //   286: aload #9
    //   288: invokevirtual Dne : ()I
    //   291: pop
    //   292: sipush #3042
    //   295: invokestatic glDisable : (I)V
    //   298: iconst_1
    //   299: invokestatic glDepthMask : (Z)V
    //   302: sipush #516
    //   305: ldc 0.1
    //   307: invokestatic glAlphaFunc : (IF)V
    //   310: iinc #8, 1
    //   313: goto -> 87
    //   316: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt4 != 0) {
      dNT dNT = zKP.Dne[paramInt4];
      byte b1 = 4;
      for (byte b2 = 0; b2 < b1; b2++) {
        for (byte b = 0; b < b1; b++) {
          for (byte b3 = 0; b3 < b1; b3++) {
            double d1 = paramInt1 + (b2 + 0.5D) / b1;
            double d2 = paramInt2 + (b + 0.5D) / b1;
            double d3 = paramInt3 + (b3 + 0.5D) / b1;
            int i = this.Dne.nextInt(6);
            Dne((new gWM((Qnq)this.Dne, d1, d2, d3, d1 - paramInt1 - 0.5D, d2 - paramInt2 - 0.5D, d3 - paramInt3 - 0.5D, dNT, i, paramInt5, (Snh)this.Dne)).Dne(paramInt1, paramInt2, paramInt3));
          } 
        } 
      } 
    } 
  }
  
  public void Dne(Qnq paramQnq) {
    this.Dne = (Random)paramQnq;
    for (byte b = 0; b < 4; b++)
      this.Dne[b].clear(); 
  }
  
  public void Dne() {
    for (byte b = 0; b < 4; b++) {
      for (byte b1 = 0; b1 < this.Dne[b].size(); b1++) {
        CAZ cAZ = this.Dne[b].get(b1);
        cAZ.Dne();
        if (cAZ.Zpi != 0.0F)
          this.Dne[b].remove(b1--); 
      } 
    } 
  }
  
  public BMa(Qnq paramQnq, Snh paramSnh) {
    this.Dne = new Random();
    if (paramQnq != null)
      this.Dne = (Random)paramQnq; 
    this.Dne = (Random)paramSnh;
    for (byte b = 0; b < 4; b++)
      this.Dne[b] = (Random)new ArrayList(); 
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    if (i != 0) {
      dNT dNT = zKP.Dne[i];
      float f = 0.1F;
      double d1 = paramInt1 + this.Dne.nextDouble() * (dNT.FWm() - dNT.Dne() - (f * 2.0F)) + f + dNT.Dne();
      double d2 = paramInt2 + this.Dne.nextDouble() * (dNT.Qnq() - dNT.bzF() - (f * 2.0F)) + f + dNT.bzF();
      double d3 = paramInt3 + this.Dne.nextDouble() * (dNT.zGp() - dNT.aFZ() - (f * 2.0F)) + f + dNT.aFZ();
      if (paramInt4 == 0)
        d2 = paramInt2 + dNT.bzF() - f; 
      if (paramInt4 == 1)
        d2 = paramInt2 + dNT.Qnq() + f; 
      if (paramInt4 == 2)
        d3 = paramInt3 + dNT.aFZ() - f; 
      if (paramInt4 == 3)
        d3 = paramInt3 + dNT.zGp() + f; 
      if (paramInt4 == 4)
        d1 = paramInt1 + dNT.Dne() - f; 
      if (paramInt4 == 5)
        d1 = paramInt1 + dNT.FWm() + f; 
      Dne((new gWM((Qnq)this.Dne, d1, d2, d3, 0.0D, 0.0D, 0.0D, dNT, paramInt4, this.Dne.bzF(paramInt1, paramInt2, paramInt3), (Snh)this.Dne)).Dne(paramInt1, paramInt2, paramInt3).Dne(0.2F).FWm(0.6F));
    } 
  }
  
  public void FWm(sMa paramsMa, float paramFloat) {
    // Byte code:
    //   0: aload_1
    //   1: getfield mrb : F
    //   4: ldc 0.017453292
    //   6: fmul
    //   7: invokestatic FWm : (F)F
    //   10: fstore_3
    //   11: aload_1
    //   12: getfield mrb : F
    //   15: ldc 0.017453292
    //   17: fmul
    //   18: invokestatic Dne : (F)F
    //   21: fstore #4
    //   23: fload #4
    //   25: fneg
    //   26: aload_1
    //   27: getfield XHL : F
    //   30: ldc 0.017453292
    //   32: fmul
    //   33: invokestatic Dne : (F)F
    //   36: fmul
    //   37: fstore #5
    //   39: fload_3
    //   40: aload_1
    //   41: getfield XHL : F
    //   44: ldc 0.017453292
    //   46: fmul
    //   47: invokestatic Dne : (F)F
    //   50: fmul
    //   51: fstore #6
    //   53: aload_1
    //   54: getfield XHL : F
    //   57: ldc 0.017453292
    //   59: fmul
    //   60: invokestatic FWm : (F)F
    //   63: fstore #7
    //   65: iconst_3
    //   66: istore #8
    //   68: aload_0
    //   69: getfield Dne : [Ljava/util/List;
    //   72: iload #8
    //   74: aaload
    //   75: invokeinterface isEmpty : ()Z
    //   80: ifne -> 161
    //   83: getstatic WAR.Dne : LWAR;
    //   86: astore #9
    //   88: iconst_0
    //   89: istore #10
    //   91: iload #10
    //   93: aload_0
    //   94: getfield Dne : [Ljava/util/List;
    //   97: iload #8
    //   99: aaload
    //   100: invokeinterface size : ()I
    //   105: if_icmpge -> 161
    //   108: aload_0
    //   109: getfield Dne : [Ljava/util/List;
    //   112: iload #8
    //   114: aaload
    //   115: iload #10
    //   117: invokeinterface get : (I)Ljava/lang/Object;
    //   122: checkcast CAZ
    //   125: astore #11
    //   127: aload #9
    //   129: aload #11
    //   131: fload_2
    //   132: invokevirtual Dne : (F)I
    //   135: invokevirtual FWm : (I)V
    //   138: aload #11
    //   140: aload #9
    //   142: fload_2
    //   143: fload_3
    //   144: fload #7
    //   146: fload #4
    //   148: fload #5
    //   150: fload #6
    //   152: invokevirtual Dne : (LWAR;FFFFFF)V
    //   155: iinc #10, 1
    //   158: goto -> 91
    //   161: return
  }
  
  public void Dne(CAZ paramCAZ) {
    int i = paramCAZ.Dne();
    if (this.Dne[i].size() >= 4000)
      this.Dne[i].remove(0); 
    this.Dne[i].add(paramCAZ);
  }
  
  public String Dne() {
    return "" + (this.Dne[0].size() + this.Dne[1].size() + this.Dne[2].size());
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BMa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */