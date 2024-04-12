import java.util.List;

public class bVr extends LHi implements vjn {
  private static final int[] Dne = new int[] { dEr.XwR.Qnq, dEr.WvN.Qnq, dEr.exS.Qnq, dEr.EYV.Qnq, dEr.OCU.Qnq, dEr.cot.Qnq, dEr.oIf.Qnq, dEr.oIf.Qnq };
  
  private int FWm;
  
  public float mrb() {
    float f = super.mrb();
    if (LVR())
      f *= 0.75F; 
    return f;
  }
  
  protected void Dne(boolean paramBoolean, int paramInt) {
    int i = this.Dne.nextInt(3) + 1;
    for (byte b = 0; b < i; b++) {
      int j = this.Dne.nextInt(3);
      int k = Dne[this.Dne.nextInt(Dne.length)];
      if (paramInt > 0)
        j += this.Dne.nextInt(paramInt + 1); 
      for (byte b1 = 0; b1 < j; b1++)
        Dne(k, 1); 
    } 
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 15) {
      for (byte b = 0; b < this.Dne.nextInt(35) + 10; b++)
        this.Dne.Dne("witchMagic", this.div + this.Dne.nextGaussian() * 0.12999999523162842D, ((bSp)this.Dne).aFZ + 0.5D + this.Dne.nextGaussian() * 0.12999999523162842D, this.mrb + this.Dne.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D); 
    } else {
      super.Dne(paramByte);
    } 
  }
  
  public boolean tgc() {
    return true;
  }
  
  protected String zGp() {
    return "mob.witch.idle";
  }
  
  public void Dne(FUH paramFUH, float paramFloat) {
    if (!LVR()) {
      YgL ygL = new YgL((Qnq)this.Dne, this, 32732);
      ygL.XHL -= -20.0F;
      double d1 = paramFUH.div + paramFUH.XHL - this.div;
      double d2 = paramFUH.IjH + paramFUH.c_() - 1.100000023841858D - this.IjH;
      double d3 = paramFUH.mrb + paramFUH.kGO - this.mrb;
      float f = geR.Dne(d1 * d1 + d3 * d3);
      if (f >= 8.0F && !paramFUH.Dne(SXd.bzF)) {
        ygL.Dne(32698);
      } else if (paramFUH.XHL() >= 8 && !paramFUH.Dne(SXd.ceE)) {
        ygL.Dne(32660);
      } else if (f <= 3.0F && !paramFUH.Dne(SXd.Vxn) && this.Dne.nextFloat() < 0.25F) {
        ygL.Dne(32696);
      } 
      ygL.bzF(d1, d2 + (f * 0.2F), d3, 0.75F, 8.0F);
      this.Dne.FWm(ygL);
    } 
  }
  
  protected String div() {
    return "mob.witch.death";
  }
  
  protected void FWm() {
    super.FWm();
    Dne().Dne(21, Byte.valueOf((byte)0));
  }
  
  protected String DyG() {
    return "mob.witch.hurt";
  }
  
  public void IjH() {
    if (((Qnq)this.Dne).aFZ == null) {
      if (LVR()) {
        if (this.FWm-- <= 0) {
          FWm(false);
          NMq nMq = Dne();
          a_(0, (NMq)null);
          if (nMq != null && nMq.bzF == ((IJk)dEr.Dne).Qnq) {
            List list = dEr.Dne.Dne(nMq);
            if (list != null)
              for (NAx nAx : list)
                Qnq(new NAx(nAx));  
          } 
        } 
      } else {
        short s = -1;
        if (this.Dne.nextFloat() < 0.15F && trS() && !Dne(SXd.kGO)) {
          s = 16307;
        } else if (this.Dne.nextFloat() < 0.05F && this.Vxn < Dne()) {
          s = 16341;
        } else if (this.Dne.nextFloat() < 0.25F && bzF() != null && !Dne(SXd.FWm) && bzF().Dne(this) > 121.0D) {
          s = 16274;
        } else if (this.Dne.nextFloat() < 0.25F && bzF() != null && !Dne(SXd.FWm) && bzF().Dne(this) > 121.0D) {
          s = 16274;
        } 
        if (s > -1) {
          a_(0, new NMq(dEr.Dne, 1, s));
          this.FWm = Dne().zGp();
          FWm(true);
        } 
      } 
      if (this.Dne.nextFloat() < 7.5E-4F)
        this.Dne.Dne(this, (byte)15); 
    } 
    super.IjH();
  }
  
  public boolean LVR() {
    return (Dne().Dne(21) == 1);
  }
  
  protected int FWm(zBn paramzBn, int paramInt) {
    paramInt = super.FWm(paramzBn, paramInt);
    if (paramzBn.FWm() == this)
      paramInt = 0; 
    if (paramzBn.DyG())
      paramInt = (int)(paramInt * 0.15D); 
    return paramInt;
  }
  
  public int Dne() {
    return 26;
  }
  
  public void FWm(boolean paramBoolean) {
    Dne().FWm(21, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
  }
  
  public bVr(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (LQnq;)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield FWm : I
    //   10: aload_0
    //   11: ldc_w '/mob/villager/witch.png'
    //   14: putfield bzF : Ljava/lang/String;
    //   17: aload_0
    //   18: ldc 0.25
    //   20: putfield cHy : F
    //   23: aload_0
    //   24: getfield Dne : LOKo;
    //   27: iconst_1
    //   28: new Cyb
    //   31: dup
    //   32: aload_0
    //   33: invokespecial <init> : (LFUH;)V
    //   36: invokevirtual Dne : (ILcMv;)V
    //   39: aload_0
    //   40: getfield Dne : LOKo;
    //   43: iconst_2
    //   44: new Auu
    //   47: dup
    //   48: aload_0
    //   49: aload_0
    //   50: getfield cHy : F
    //   53: bipush #60
    //   55: ldc_w 10.0
    //   58: invokespecial <init> : (Lvjn;FIF)V
    //   61: invokevirtual Dne : (ILcMv;)V
    //   64: aload_0
    //   65: getfield Dne : LOKo;
    //   68: iconst_2
    //   69: new IBw
    //   72: dup
    //   73: aload_0
    //   74: aload_0
    //   75: getfield cHy : F
    //   78: invokespecial <init> : (LkSJ;F)V
    //   81: invokevirtual Dne : (ILcMv;)V
    //   84: aload_0
    //   85: getfield Dne : LOKo;
    //   88: iconst_3
    //   89: new yws
    //   92: dup
    //   93: aload_0
    //   94: ldc_w FiG
    //   97: ldc 8.0
    //   99: invokespecial <init> : (LFUH;Ljava/lang/Class;F)V
    //   102: invokevirtual Dne : (ILcMv;)V
    //   105: aload_0
    //   106: getfield Dne : LOKo;
    //   109: iconst_3
    //   110: new cHg
    //   113: dup
    //   114: aload_0
    //   115: invokespecial <init> : (LFUH;)V
    //   118: invokevirtual Dne : (ILcMv;)V
    //   121: aload_0
    //   122: getfield FWm : LOKo;
    //   125: iconst_1
    //   126: new QRF
    //   129: dup
    //   130: aload_0
    //   131: iconst_0
    //   132: invokespecial <init> : (LFUH;Z)V
    //   135: invokevirtual Dne : (ILcMv;)V
    //   138: aload_0
    //   139: getfield FWm : LOKo;
    //   142: iconst_2
    //   143: new AmF
    //   146: dup
    //   147: aload_0
    //   148: ldc_w FiG
    //   151: ldc_w 16.0
    //   154: iconst_0
    //   155: iconst_1
    //   156: invokespecial <init> : (LFUH;Ljava/lang/Class;FIZ)V
    //   159: invokevirtual Dne : (ILcMv;)V
    //   162: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bVr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */