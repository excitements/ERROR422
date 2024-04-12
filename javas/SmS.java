public abstract class SmS extends cMv {
  float Dne;
  
  protected FUH Dne;
  
  float FWm;
  
  protected int Dne;
  
  protected oqu Dne;
  
  boolean Dne;
  
  protected int FWm;
  
  protected int bzF;
  
  public boolean FWm() {
    return !this.Dne;
  }
  
  public boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LFUH;
    //   4: getfield zGp : Z
    //   7: ifne -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: aload_0
    //   13: getfield Dne : LFUH;
    //   16: invokevirtual Dne : ()LKFZ;
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual Dne : ()LwdG;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull -> 241
    //   29: aload_2
    //   30: invokevirtual Dne : ()Z
    //   33: ifne -> 241
    //   36: aload_1
    //   37: invokevirtual FWm : ()Z
    //   40: ifeq -> 241
    //   43: iconst_0
    //   44: istore_3
    //   45: iload_3
    //   46: aload_2
    //   47: invokevirtual FWm : ()I
    //   50: iconst_2
    //   51: iadd
    //   52: aload_2
    //   53: invokevirtual Dne : ()I
    //   56: invokestatic min : (II)I
    //   59: if_icmpge -> 164
    //   62: aload_2
    //   63: iload_3
    //   64: invokevirtual Dne : (I)LwhE;
    //   67: astore #4
    //   69: aload_0
    //   70: aload #4
    //   72: getfield Dne : I
    //   75: putfield Dne : I
    //   78: aload_0
    //   79: aload #4
    //   81: getfield FWm : I
    //   84: iconst_1
    //   85: iadd
    //   86: putfield FWm : I
    //   89: aload_0
    //   90: aload #4
    //   92: getfield bzF : I
    //   95: putfield bzF : I
    //   98: aload_0
    //   99: getfield Dne : LFUH;
    //   102: aload_0
    //   103: getfield Dne : I
    //   106: i2d
    //   107: aload_0
    //   108: getfield Dne : LFUH;
    //   111: getfield IjH : D
    //   114: aload_0
    //   115: getfield bzF : I
    //   118: i2d
    //   119: invokevirtual Dne : (DDD)D
    //   122: ldc2_w 2.25
    //   125: dcmpg
    //   126: ifgt -> 158
    //   129: aload_0
    //   130: aload_0
    //   131: aload_0
    //   132: getfield Dne : I
    //   135: aload_0
    //   136: getfield FWm : I
    //   139: aload_0
    //   140: getfield bzF : I
    //   143: invokespecial Dne : (III)Loqu;
    //   146: putfield Dne : Loqu;
    //   149: aload_0
    //   150: getfield Dne : Loqu;
    //   153: ifnull -> 158
    //   156: iconst_1
    //   157: ireturn
    //   158: iinc #3, 1
    //   161: goto -> 45
    //   164: aload_0
    //   165: aload_0
    //   166: getfield Dne : LFUH;
    //   169: getfield div : D
    //   172: invokestatic FWm : (D)I
    //   175: putfield Dne : I
    //   178: aload_0
    //   179: aload_0
    //   180: getfield Dne : LFUH;
    //   183: getfield IjH : D
    //   186: dconst_1
    //   187: dadd
    //   188: invokestatic FWm : (D)I
    //   191: putfield FWm : I
    //   194: aload_0
    //   195: aload_0
    //   196: getfield Dne : LFUH;
    //   199: getfield mrb : D
    //   202: invokestatic FWm : (D)I
    //   205: putfield bzF : I
    //   208: aload_0
    //   209: aload_0
    //   210: aload_0
    //   211: getfield Dne : I
    //   214: aload_0
    //   215: getfield FWm : I
    //   218: aload_0
    //   219: getfield bzF : I
    //   222: invokespecial Dne : (III)Loqu;
    //   225: putfield Dne : Loqu;
    //   228: aload_0
    //   229: getfield Dne : Loqu;
    //   232: ifnull -> 239
    //   235: iconst_1
    //   236: goto -> 240
    //   239: iconst_0
    //   240: ireturn
    //   241: iconst_0
    //   242: ireturn
  }
  
  public void Dne() {
    this.Dne = false;
    this.Dne = (float)((this.Dne + 0.5F) - this.Dne.div);
    this.FWm = (float)((this.bzF + 0.5F) - this.Dne.mrb);
  }
  
  public void bzF() {
    float f1 = (float)((this.Dne + 0.5F) - this.Dne.div);
    float f2 = (float)((this.bzF + 0.5F) - this.Dne.mrb);
    float f3 = this.Dne * f1 + this.FWm * f2;
    if (f3 < 0.0F)
      this.Dne = true; 
  }
  
  public SmS(FUH paramFUH) {
    this.Dne = paramFUH;
  }
  
  private oqu Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LFUH;
    //   4: getfield Dne : LQnq;
    //   7: iload_1
    //   8: iload_2
    //   9: iload_3
    //   10: invokevirtual Dne : (III)I
    //   13: istore #4
    //   15: iload #4
    //   17: getstatic zKP.ICU : LzKP;
    //   20: getfield FWm : I
    //   23: if_icmpeq -> 30
    //   26: aconst_null
    //   27: goto -> 39
    //   30: getstatic zKP.Dne : [LzKP;
    //   33: iload #4
    //   35: aaload
    //   36: checkcast oqu
    //   39: areturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SmS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */