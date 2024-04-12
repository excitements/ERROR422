public class Seh {
  private boolean Qnq;
  
  private whE[] Dne;
  
  private ZGT Dne;
  
  private boolean bzF;
  
  private boolean FWm;
  
  private boolean Dne;
  
  private CIU Dne;
  
  private Zpi Dne = (Zpi)new CIU();
  
  private wdG Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    this.Dne.Dne();
    this.Dne.Dne();
    boolean bool = this.bzF;
    int i = geR.FWm(paramsMa.Dne.FWm + 0.5D);
    if (this.Qnq && paramsMa.Zpi()) {
      i = (int)paramsMa.Dne.FWm;
      int j = this.Dne.Dne(geR.FWm(paramsMa.div), i, geR.FWm(paramsMa.mrb));
      while (true) {
        if (j == ((byt)zKP.Dne).FWm || j == ((zKP)zKP.DyG).FWm) {
          j = this.Dne.Dne(geR.FWm(paramsMa.div), ++i, geR.FWm(paramsMa.mrb));
          continue;
        } 
        bool = this.bzF;
        this.bzF = false;
        whE whE4 = Dne(geR.FWm(paramsMa.Dne.Dne), i, geR.FWm(paramsMa.Dne.bzF));
        whE whE5 = Dne(geR.FWm(paramDouble1 - (paramsMa.ooe / 2.0F)), geR.FWm(paramDouble2), geR.FWm(paramDouble3 - (paramsMa.ooe / 2.0F)));
        whE whE6 = new whE(geR.Dne(paramsMa.ooe + 1.0F), geR.Dne(paramsMa.trS + 1.0F), geR.Dne(paramsMa.ooe + 1.0F));
        wdG wdG1 = Dne(paramsMa, whE4, whE5, whE6, paramFloat);
        this.bzF = bool;
        return wdG1;
      } 
    } 
    i = geR.FWm(paramsMa.Dne.FWm + 0.5D);
    whE whE1 = Dne(geR.FWm(paramsMa.Dne.Dne), i, geR.FWm(paramsMa.Dne.bzF));
    whE whE2 = Dne(geR.FWm(paramDouble1 - (paramsMa.ooe / 2.0F)), geR.FWm(paramDouble2), geR.FWm(paramDouble3 - (paramsMa.ooe / 2.0F)));
    whE whE3 = new whE(geR.Dne(paramsMa.ooe + 1.0F), geR.Dne(paramsMa.trS + 1.0F), geR.Dne(paramsMa.ooe + 1.0F));
    wdG wdG = Dne(paramsMa, whE1, whE2, whE3, paramFloat);
    this.bzF = bool;
    return wdG;
  }
  
  private final whE Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = whE.Dne(paramInt1, paramInt2, paramInt3);
    whE whE1 = (whE)this.Dne.Dne(i);
    if (whE1 == null) {
      whE1 = new whE(paramInt1, paramInt2, paramInt3);
      this.Dne.Dne(i, whE1);
    } 
    return whE1;
  }
  
  private int Dne(sMa paramsMa, whE paramwhE1, whE paramwhE2, whE paramwhE3, float paramFloat) {
    byte b = 0;
    boolean bool = false;
    if (Dne(paramsMa, paramwhE1.Dne, paramwhE1.FWm + 1, paramwhE1.bzF, paramwhE2) == 1)
      bool = true; 
    whE whE1 = Dne(paramsMa, paramwhE1.Dne, paramwhE1.FWm, paramwhE1.bzF + 1, paramwhE2, bool);
    whE whE2 = Dne(paramsMa, paramwhE1.Dne - 1, paramwhE1.FWm, paramwhE1.bzF, paramwhE2, bool);
    whE whE3 = Dne(paramsMa, paramwhE1.Dne + 1, paramwhE1.FWm, paramwhE1.bzF, paramwhE2, bool);
    whE whE4 = Dne(paramsMa, paramwhE1.Dne, paramwhE1.FWm, paramwhE1.bzF - 1, paramwhE2, bool);
    if (whE1 != null && !whE1.Dne && whE1.Dne(paramwhE3) < paramFloat)
      this.Dne[b++] = (Zpi)whE1; 
    if (whE2 != null && !whE2.Dne && whE2.Dne(paramwhE3) < paramFloat)
      this.Dne[b++] = (Zpi)whE2; 
    if (whE3 != null && !whE3.Dne && whE3.Dne(paramwhE3) < paramFloat)
      this.Dne[b++] = (Zpi)whE3; 
    if (whE4 != null && !whE4.Dne && whE4.Dne(paramwhE3) < paramFloat)
      this.Dne[b++] = (Zpi)whE4; 
    return b;
  }
  
  private whE Dne(sMa paramsMa, int paramInt1, int paramInt2, int paramInt3, whE paramwhE, int paramInt4) {
    whE whE1 = null;
    int i = Dne(paramsMa, paramInt1, paramInt2, paramInt3, paramwhE);
    if (i == 2)
      return Dne(paramInt1, paramInt2, paramInt3); 
    if (i == 1)
      whE1 = Dne(paramInt1, paramInt2, paramInt3); 
    if (whE1 == null && paramInt4 > 0 && i != -3 && i != -4 && Dne(paramsMa, paramInt1, paramInt2 + paramInt4, paramInt3, paramwhE) == 1) {
      whE1 = Dne(paramInt1, paramInt2 + paramInt4, paramInt3);
      paramInt2 += paramInt4;
    } 
    if (whE1 != null) {
      byte b = 0;
      int j = 0;
      while (paramInt2 > 0) {
        j = Dne(paramsMa, paramInt1, paramInt2 - 1, paramInt3, paramwhE);
        if (this.bzF && j == -1)
          return null; 
        if (j != 1)
          break; 
        if (b++ >= paramsMa.FWm())
          return null; 
        if (--paramInt2 > 0)
          whE1 = Dne(paramInt1, paramInt2, paramInt3); 
      } 
      if (j == -2)
        return null; 
    } 
    return whE1;
  }
  
  public Seh(Zpi paramZpi, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.Dne = (Zpi)new ZGT();
    this.Dne = (Zpi)new whE[32];
    this.Dne = paramZpi;
    this.Dne = paramBoolean1;
    this.FWm = paramBoolean2;
    this.bzF = paramBoolean3;
    this.Qnq = paramBoolean4;
  }
  
  public wdG Dne(sMa paramsMa1, sMa paramsMa2, float paramFloat) {
    return Dne(paramsMa1, paramsMa2.div, paramsMa2.Dne.FWm, paramsMa2.mrb, paramFloat);
  }
  
  public int Dne(sMa paramsMa, int paramInt1, int paramInt2, int paramInt3, whE paramwhE) {
    return Dne(paramsMa, paramInt1, paramInt2, paramInt3, paramwhE, this.bzF, this.FWm, this.Dne);
  }
  
  public wdG Dne(sMa paramsMa, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    return Dne(paramsMa, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), paramFloat);
  }
  
  private wdG Dne(whE paramwhE1, whE paramwhE2) {
    byte b = 1;
    whE whE1 = paramwhE2;
    while (whE1.Dne != null) {
      b++;
      boolean bool = whE1.Dne;
    } 
    whE[] arrayOfWhE = new whE[b];
    whE1 = paramwhE2;
    arrayOfWhE[--b] = paramwhE2;
    while (whE1.Dne != null) {
      boolean bool = whE1.Dne;
      arrayOfWhE[--b] = bool;
    } 
    return new wdG(arrayOfWhE);
  }
  
  public static int Dne(sMa paramsMa, int paramInt1, int paramInt2, int paramInt3, whE paramwhE, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #8
    //   3: iload_1
    //   4: istore #9
    //   6: iload #9
    //   8: iload_1
    //   9: aload #4
    //   11: getfield Dne : I
    //   14: iadd
    //   15: if_icmpge -> 360
    //   18: iload_2
    //   19: istore #10
    //   21: iload #10
    //   23: iload_2
    //   24: aload #4
    //   26: getfield FWm : I
    //   29: iadd
    //   30: if_icmpge -> 354
    //   33: iload_3
    //   34: istore #11
    //   36: iload #11
    //   38: iload_3
    //   39: aload #4
    //   41: getfield bzF : I
    //   44: iadd
    //   45: if_icmpge -> 348
    //   48: aload_0
    //   49: getfield Dne : LQnq;
    //   52: iload #9
    //   54: iload #10
    //   56: iload #11
    //   58: invokevirtual Dne : (III)I
    //   61: istore #12
    //   63: iload #12
    //   65: ifle -> 342
    //   68: iload #12
    //   70: getstatic zKP.edi : LzKP;
    //   73: getfield FWm : I
    //   76: if_icmpne -> 85
    //   79: iconst_1
    //   80: istore #8
    //   82: goto -> 135
    //   85: iload #12
    //   87: getstatic zKP.Dne : Lbyt;
    //   90: getfield FWm : I
    //   93: if_icmpeq -> 125
    //   96: iload #12
    //   98: getstatic zKP.DyG : LzKP;
    //   101: getfield FWm : I
    //   104: if_icmpeq -> 125
    //   107: iload #7
    //   109: ifne -> 135
    //   112: iload #12
    //   114: getstatic zKP.ICU : LzKP;
    //   117: getfield FWm : I
    //   120: if_icmpne -> 135
    //   123: iconst_0
    //   124: ireturn
    //   125: iload #5
    //   127: ifeq -> 132
    //   130: iconst_m1
    //   131: ireturn
    //   132: iconst_1
    //   133: istore #8
    //   135: getstatic zKP.Dne : [LzKP;
    //   138: iload #12
    //   140: aaload
    //   141: astore #13
    //   143: aload #13
    //   145: invokevirtual Dne : ()I
    //   148: istore #14
    //   150: aload_0
    //   151: getfield Dne : LQnq;
    //   154: iload #9
    //   156: iload #10
    //   158: iload #11
    //   160: invokevirtual FWm : (III)I
    //   163: bipush #9
    //   165: if_icmpne -> 239
    //   168: aload_0
    //   169: getfield div : D
    //   172: invokestatic FWm : (D)I
    //   175: istore #15
    //   177: aload_0
    //   178: getfield IjH : D
    //   181: invokestatic FWm : (D)I
    //   184: istore #16
    //   186: aload_0
    //   187: getfield mrb : D
    //   190: invokestatic FWm : (D)I
    //   193: istore #17
    //   195: aload_0
    //   196: getfield Dne : LQnq;
    //   199: iload #15
    //   201: iload #16
    //   203: iload #17
    //   205: invokevirtual FWm : (III)I
    //   208: bipush #9
    //   210: if_icmpeq -> 236
    //   213: aload_0
    //   214: getfield Dne : LQnq;
    //   217: iload #15
    //   219: iload #16
    //   221: iconst_1
    //   222: isub
    //   223: iload #17
    //   225: invokevirtual FWm : (III)I
    //   228: bipush #9
    //   230: if_icmpeq -> 236
    //   233: bipush #-3
    //   235: ireturn
    //   236: goto -> 342
    //   239: aload #13
    //   241: aload_0
    //   242: getfield Dne : LQnq;
    //   245: iload #9
    //   247: iload #10
    //   249: iload #11
    //   251: invokevirtual Dne : (LZpi;III)Z
    //   254: ifne -> 342
    //   257: iload #6
    //   259: ifeq -> 273
    //   262: iload #12
    //   264: getstatic zKP.ICU : LzKP;
    //   267: getfield FWm : I
    //   270: if_icmpeq -> 342
    //   273: iload #14
    //   275: bipush #11
    //   277: if_icmpeq -> 298
    //   280: iload #12
    //   282: getstatic zKP.mzX : LzKP;
    //   285: getfield FWm : I
    //   288: if_icmpeq -> 298
    //   291: iload #14
    //   293: bipush #32
    //   295: if_icmpne -> 301
    //   298: bipush #-3
    //   300: ireturn
    //   301: iload #12
    //   303: getstatic zKP.edi : LzKP;
    //   306: getfield FWm : I
    //   309: if_icmpne -> 315
    //   312: bipush #-4
    //   314: ireturn
    //   315: aload #13
    //   317: getfield Dne : LKFd;
    //   320: astore #15
    //   322: aload #15
    //   324: getstatic KFd.IjH : LKFd;
    //   327: if_acmpeq -> 332
    //   330: iconst_0
    //   331: ireturn
    //   332: aload_0
    //   333: invokevirtual DyG : ()Z
    //   336: ifne -> 342
    //   339: bipush #-2
    //   341: ireturn
    //   342: iinc #11, 1
    //   345: goto -> 36
    //   348: iinc #10, 1
    //   351: goto -> 21
    //   354: iinc #9, 1
    //   357: goto -> 6
    //   360: iload #8
    //   362: ifeq -> 369
    //   365: iconst_2
    //   366: goto -> 370
    //   369: iconst_1
    //   370: ireturn
  }
  
  private wdG Dne(sMa paramsMa, whE paramwhE1, whE paramwhE2, whE paramwhE3, float paramFloat) {
    paramwhE1.Dne = 0.0F;
    paramwhE1.FWm = paramwhE1.FWm(paramwhE2);
    paramwhE1.bzF = paramwhE1.FWm;
    this.Dne.Dne();
    this.Dne.Dne(paramwhE1);
    whE whE1 = paramwhE1;
    while (!this.Dne.Dne()) {
      whE whE2 = this.Dne.Dne();
      if (whE2.equals(paramwhE2))
        return Dne(paramwhE1, paramwhE2); 
      if (whE2.FWm(paramwhE2) < whE1.FWm(paramwhE2))
        whE1 = whE2; 
      whE2.Dne = true;
      int i = Dne(paramsMa, whE2, paramwhE3, paramwhE2, paramFloat);
      for (byte b = 0; b < i; b++) {
        Zpi zpi = this.Dne[b];
        float f = whE2.Dne + whE2.FWm((whE)zpi);
        if (!zpi.Dne() || f < ((whE)zpi).Dne) {
          ((whE)zpi).Dne = whE2;
          ((whE)zpi).Dne = f;
          ((whE)zpi).FWm = zpi.FWm(paramwhE2);
          if (zpi.Dne()) {
            this.Dne.Dne((whE)zpi, ((whE)zpi).Dne + ((whE)zpi).FWm);
          } else {
            ((whE)zpi).bzF = ((whE)zpi).Dne + ((whE)zpi).FWm;
            this.Dne.Dne((whE)zpi);
          } 
        } 
      } 
    } 
    return (whE1 == paramwhE1) ? null : Dne(paramwhE1, whE1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Seh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */