public class mUU {
  public int Dne;
  
  public laH[] Dne;
  
  private boolean Dne = false;
  
  public void Dne() {
    laH[] arrayOfLaH = new laH[this.Dne.length];
    for (byte b = 0; b < this.Dne.length; b++)
      arrayOfLaH[b] = this.Dne[this.Dne.length - b - 1]; 
    this.Dne = arrayOfLaH;
  }
  
  public mUU(laH[] paramArrayOflaH) {
    this.Dne = false;
    this.Dne = paramArrayOflaH;
    this.Dne = paramArrayOflaH.length;
  }
  
  public void Dne(WAR paramWAR, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LlaH;
    //   4: iconst_1
    //   5: aaload
    //   6: getfield Dne : LchN;
    //   9: aload_0
    //   10: getfield Dne : [LlaH;
    //   13: iconst_0
    //   14: aaload
    //   15: getfield Dne : LchN;
    //   18: invokevirtual Dne : (LchN;)LchN;
    //   21: astore_3
    //   22: aload_0
    //   23: getfield Dne : [LlaH;
    //   26: iconst_1
    //   27: aaload
    //   28: getfield Dne : LchN;
    //   31: aload_0
    //   32: getfield Dne : [LlaH;
    //   35: iconst_2
    //   36: aaload
    //   37: getfield Dne : LchN;
    //   40: invokevirtual Dne : (LchN;)LchN;
    //   43: astore #4
    //   45: aload #4
    //   47: aload_3
    //   48: invokevirtual FWm : (LchN;)LchN;
    //   51: invokevirtual Dne : ()LchN;
    //   54: astore #5
    //   56: aload_1
    //   57: invokevirtual Dne : ()V
    //   60: aload_0
    //   61: getfield Dne : Z
    //   64: ifeq -> 95
    //   67: aload_1
    //   68: aload #5
    //   70: getfield Dne : D
    //   73: d2f
    //   74: fneg
    //   75: aload #5
    //   77: getfield FWm : D
    //   80: d2f
    //   81: fneg
    //   82: aload #5
    //   84: getfield bzF : D
    //   87: d2f
    //   88: fneg
    //   89: invokevirtual FWm : (FFF)V
    //   92: goto -> 117
    //   95: aload_1
    //   96: aload #5
    //   98: getfield Dne : D
    //   101: d2f
    //   102: aload #5
    //   104: getfield FWm : D
    //   107: d2f
    //   108: aload #5
    //   110: getfield bzF : D
    //   113: d2f
    //   114: invokevirtual FWm : (FFF)V
    //   117: iconst_0
    //   118: istore #6
    //   120: iload #6
    //   122: iconst_4
    //   123: if_icmpge -> 193
    //   126: aload_0
    //   127: getfield Dne : [LlaH;
    //   130: iload #6
    //   132: aaload
    //   133: astore #7
    //   135: aload_1
    //   136: aload #7
    //   138: getfield Dne : LchN;
    //   141: getfield Dne : D
    //   144: d2f
    //   145: fload_2
    //   146: fmul
    //   147: f2d
    //   148: aload #7
    //   150: getfield Dne : LchN;
    //   153: getfield FWm : D
    //   156: d2f
    //   157: fload_2
    //   158: fmul
    //   159: f2d
    //   160: aload #7
    //   162: getfield Dne : LchN;
    //   165: getfield bzF : D
    //   168: d2f
    //   169: fload_2
    //   170: fmul
    //   171: f2d
    //   172: aload #7
    //   174: getfield Dne : F
    //   177: f2d
    //   178: aload #7
    //   180: getfield FWm : F
    //   183: f2d
    //   184: invokevirtual Dne : (DDDDD)V
    //   187: iinc #6, 1
    //   190: goto -> 120
    //   193: aload_1
    //   194: invokevirtual Dne : ()I
    //   197: pop
    //   198: return
  }
  
  public mUU(laH[] paramArrayOflaH, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2) {
    this(paramArrayOflaH);
    float f1 = 0.0F / paramFloat1;
    float f2 = 0.0F / paramFloat2;
    paramArrayOflaH[0] = paramArrayOflaH[0].Dne(paramInt3 / paramFloat1 - f1, paramInt2 / paramFloat2 + f2);
    paramArrayOflaH[1] = paramArrayOflaH[1].Dne(paramInt1 / paramFloat1 + f1, paramInt2 / paramFloat2 + f2);
    paramArrayOflaH[2] = paramArrayOflaH[2].Dne(paramInt1 / paramFloat1 + f1, paramInt4 / paramFloat2 - f2);
    paramArrayOflaH[3] = paramArrayOflaH[3].Dne(paramInt3 / paramFloat1 - f1, paramInt4 / paramFloat2 - f2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mUU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */