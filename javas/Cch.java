public class Cch extends CAZ {
  float Dne;
  
  public Cch(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    float f = 2.5F;
    this.XHL *= 0.10000000149011612D;
    this.Zpi *= 0.10000000149011612D;
    this.kGO *= 0.10000000149011612D;
    this.XHL += paramDouble4;
    this.Zpi += paramDouble5;
    this.kGO += paramDouble6;
    this.zGp = this.DyG = this.div = 1.0F - (float)(Math.random() * 0.30000001192092896D);
    this.Qnq *= 0.75F;
    this.Qnq *= f;
    this.Dne = this.Qnq;
    this.Qnq = (int)(8.0D / (Math.random() * 0.8D + 0.3D));
    this.Qnq = (int)(this.Qnq * f);
    this.kGO = false;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield div : D
    //   5: putfield aFZ : D
    //   8: aload_0
    //   9: aload_0
    //   10: getfield IjH : D
    //   13: putfield zGp : D
    //   16: aload_0
    //   17: aload_0
    //   18: getfield mrb : D
    //   21: putfield DyG : D
    //   24: aload_0
    //   25: dup
    //   26: getfield bzF : I
    //   29: dup_x1
    //   30: iconst_1
    //   31: iadd
    //   32: putfield bzF : I
    //   35: aload_0
    //   36: getfield Qnq : I
    //   39: if_icmplt -> 46
    //   42: aload_0
    //   43: invokevirtual g_ : ()V
    //   46: aload_0
    //   47: bipush #7
    //   49: aload_0
    //   50: getfield bzF : I
    //   53: bipush #8
    //   55: imul
    //   56: aload_0
    //   57: getfield Qnq : I
    //   60: idiv
    //   61: isub
    //   62: invokevirtual bzF : (I)V
    //   65: aload_0
    //   66: aload_0
    //   67: getfield XHL : D
    //   70: aload_0
    //   71: getfield Zpi : D
    //   74: aload_0
    //   75: getfield kGO : D
    //   78: invokevirtual Dne : (DDD)V
    //   81: aload_0
    //   82: dup
    //   83: getfield XHL : D
    //   86: ldc2_w 0.9599999785423279
    //   89: dmul
    //   90: putfield XHL : D
    //   93: aload_0
    //   94: dup
    //   95: getfield Zpi : D
    //   98: ldc2_w 0.9599999785423279
    //   101: dmul
    //   102: putfield Zpi : D
    //   105: aload_0
    //   106: dup
    //   107: getfield kGO : D
    //   110: ldc2_w 0.9599999785423279
    //   113: dmul
    //   114: putfield kGO : D
    //   117: aload_0
    //   118: getfield Dne : LQnq;
    //   121: aload_0
    //   122: ldc2_w 2.0
    //   125: invokevirtual Dne : (LsMa;D)LFiG;
    //   128: astore_1
    //   129: aload_1
    //   130: ifnull -> 211
    //   133: aload_0
    //   134: getfield IjH : D
    //   137: aload_1
    //   138: getfield Dne : LbSp;
    //   141: getfield FWm : D
    //   144: dcmpl
    //   145: ifle -> 211
    //   148: aload_0
    //   149: dup
    //   150: getfield IjH : D
    //   153: aload_1
    //   154: getfield Dne : LbSp;
    //   157: getfield FWm : D
    //   160: aload_0
    //   161: getfield IjH : D
    //   164: dsub
    //   165: ldc2_w 0.2
    //   168: dmul
    //   169: dadd
    //   170: putfield IjH : D
    //   173: aload_0
    //   174: dup
    //   175: getfield Zpi : D
    //   178: aload_1
    //   179: getfield Zpi : D
    //   182: aload_0
    //   183: getfield Zpi : D
    //   186: dsub
    //   187: ldc2_w 0.2
    //   190: dmul
    //   191: dadd
    //   192: putfield Zpi : D
    //   195: aload_0
    //   196: aload_0
    //   197: getfield div : D
    //   200: aload_0
    //   201: getfield IjH : D
    //   204: aload_0
    //   205: getfield mrb : D
    //   208: invokevirtual bzF : (DDD)V
    //   211: aload_0
    //   212: getfield aFZ : Z
    //   215: ifeq -> 242
    //   218: aload_0
    //   219: dup
    //   220: getfield XHL : D
    //   223: ldc2_w 0.699999988079071
    //   226: dmul
    //   227: putfield XHL : D
    //   230: aload_0
    //   231: dup
    //   232: getfield kGO : D
    //   235: ldc2_w 0.699999988079071
    //   238: dmul
    //   239: putfield kGO : D
    //   242: return
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f = (this.bzF + paramFloat1) / this.Qnq * 32.0F;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    this.Qnq = this.Dne * f;
    super.Dne(paramWAR, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Cch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */