public class MYL extends qVZ {
  private Pee Dne;
  
  private AjG Dne;
  
  protected String Dne;
  
  private static final String FWm = BAQ.Dne;
  
  private int Qnq = 0;
  
  private int Dne = "Edit sign message:";
  
  protected void Dne(char paramChar, int paramInt) {
    if (paramInt == 200)
      this.Qnq = this.Qnq - 1 & 0x3; 
    if (paramInt == 208 || paramInt == 28)
      this.Qnq = this.Qnq + 1 & 0x3; 
    if (paramInt == 14 && this.Dne.Dne[this.Qnq].length() > 0)
      this.Dne.Dne[this.Qnq] = this.Dne.Dne[this.Qnq].substring(0, this.Dne.Dne[this.Qnq].length() - 1); 
    if (FWm.indexOf(paramChar) >= 0 && this.Dne.Dne[this.Qnq].length() < 15)
      this.Dne.Dne[this.Qnq] = this.Dne.Dne[this.Qnq] + paramChar; 
    if (paramInt == 1)
      Dne(this.Dne); 
  }
  
  public void bzF() {
    this.Dne++;
  }
  
  protected void Dne(Pee paramPee) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : Z
    //   4: ifeq -> 32
    //   7: aload_1
    //   8: getfield aFZ : I
    //   11: ifne -> 32
    //   14: aload_0
    //   15: getfield Dne : LAjG;
    //   18: invokevirtual a_ : ()V
    //   21: aload_0
    //   22: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   25: aconst_null
    //   26: checkcast qVZ
    //   29: invokevirtual Dne : (LqVZ;)V
    //   32: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface clear : ()V
    //   9: iconst_1
    //   10: invokestatic enableRepeatEvents : (Z)V
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/List;
    //   17: aload_0
    //   18: new Pee
    //   21: dup
    //   22: iconst_0
    //   23: aload_0
    //   24: getfield FWm : I
    //   27: iconst_2
    //   28: idiv
    //   29: bipush #100
    //   31: isub
    //   32: aload_0
    //   33: getfield bzF : I
    //   36: iconst_4
    //   37: idiv
    //   38: bipush #120
    //   40: iadd
    //   41: ldc 'Done'
    //   43: invokespecial <init> : (IIILjava/lang/String;)V
    //   46: dup_x1
    //   47: putfield Dne : LPee;
    //   50: invokeinterface add : (Ljava/lang/Object;)Z
    //   55: pop
    //   56: aload_0
    //   57: getfield Dne : LAjG;
    //   60: iconst_0
    //   61: invokevirtual Dne : (Z)V
    //   64: return
  }
  
  public MYL(AjG paramAjG) {
    this.Dne = paramAjG;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual aFZ : ()V
    //   4: aload_0
    //   5: aload_0
    //   6: getfield Dne : LmsA;
    //   9: aload_0
    //   10: getfield Dne : Ljava/lang/String;
    //   13: aload_0
    //   14: getfield FWm : I
    //   17: iconst_2
    //   18: idiv
    //   19: bipush #40
    //   21: ldc 16777215
    //   23: invokevirtual Dne : (LmsA;Ljava/lang/String;III)V
    //   26: invokestatic glPushMatrix : ()V
    //   29: aload_0
    //   30: getfield FWm : I
    //   33: iconst_2
    //   34: idiv
    //   35: i2f
    //   36: fconst_0
    //   37: ldc 50.0
    //   39: invokestatic glTranslatef : (FFF)V
    //   42: ldc 93.75
    //   44: fstore #4
    //   46: fload #4
    //   48: fneg
    //   49: fload #4
    //   51: fneg
    //   52: fload #4
    //   54: fneg
    //   55: invokestatic glScalef : (FFF)V
    //   58: ldc 180.0
    //   60: fconst_0
    //   61: fconst_1
    //   62: fconst_0
    //   63: invokestatic glRotatef : (FFFF)V
    //   66: aload_0
    //   67: getfield Dne : LAjG;
    //   70: invokevirtual Dne : ()LzKP;
    //   73: astore #5
    //   75: aload #5
    //   77: getstatic zKP.LVR : LzKP;
    //   80: if_acmpne -> 118
    //   83: aload_0
    //   84: getfield Dne : LAjG;
    //   87: invokevirtual zGp : ()I
    //   90: sipush #360
    //   93: imul
    //   94: i2f
    //   95: ldc 16.0
    //   97: fdiv
    //   98: fstore #6
    //   100: fload #6
    //   102: fconst_0
    //   103: fconst_1
    //   104: fconst_0
    //   105: invokestatic glRotatef : (FFFF)V
    //   108: fconst_0
    //   109: ldc -1.0625
    //   111: fconst_0
    //   112: invokestatic glTranslatef : (FFF)V
    //   115: goto -> 175
    //   118: aload_0
    //   119: getfield Dne : LAjG;
    //   122: invokevirtual zGp : ()I
    //   125: istore #6
    //   127: fconst_0
    //   128: fstore #7
    //   130: iload #6
    //   132: iconst_2
    //   133: if_icmpne -> 140
    //   136: ldc 180.0
    //   138: fstore #7
    //   140: iload #6
    //   142: iconst_4
    //   143: if_icmpne -> 150
    //   146: ldc 90.0
    //   148: fstore #7
    //   150: iload #6
    //   152: iconst_5
    //   153: if_icmpne -> 160
    //   156: ldc -90.0
    //   158: fstore #7
    //   160: fload #7
    //   162: fconst_0
    //   163: fconst_1
    //   164: fconst_0
    //   165: invokestatic glRotatef : (FFFF)V
    //   168: fconst_0
    //   169: ldc -1.0625
    //   171: fconst_0
    //   172: invokestatic glTranslatef : (FFF)V
    //   175: aload_0
    //   176: getfield Dne : I
    //   179: bipush #6
    //   181: idiv
    //   182: iconst_2
    //   183: irem
    //   184: ifne -> 198
    //   187: aload_0
    //   188: getfield Dne : LAjG;
    //   191: aload_0
    //   192: getfield Qnq : I
    //   195: putfield Dne : I
    //   198: getstatic XWr.Dne : LXWr;
    //   201: aload_0
    //   202: getfield Dne : LAjG;
    //   205: ldc2_w -0.5
    //   208: ldc2_w -0.75
    //   211: ldc2_w -0.5
    //   214: fconst_0
    //   215: invokevirtual Dne : (LipD;DDDF)V
    //   218: aload_0
    //   219: getfield Dne : LAjG;
    //   222: iconst_m1
    //   223: putfield Dne : I
    //   226: invokestatic glPopMatrix : ()V
    //   229: aload_0
    //   230: iload_1
    //   231: iload_2
    //   232: fload_3
    //   233: invokespecial Dne : (IIF)V
    //   236: return
  }
  
  public void FWm() {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic enableRepeatEvents : (Z)V
    //   4: aload_0
    //   5: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   8: invokevirtual Dne : ()Lfzy;
    //   11: astore_1
    //   12: bipush #20
    //   14: invokestatic Dne : (I)I
    //   17: ifne -> 45
    //   20: iconst_0
    //   21: istore_2
    //   22: iload_2
    //   23: iconst_4
    //   24: if_icmpge -> 45
    //   27: aload_0
    //   28: getfield Dne : LAjG;
    //   31: getfield Dne : [Ljava/lang/String;
    //   34: iload_2
    //   35: invokestatic Dne : ()Ljava/lang/String;
    //   38: aastore
    //   39: iinc #2, 1
    //   42: goto -> 22
    //   45: aload_1
    //   46: ifnull -> 88
    //   49: aload_1
    //   50: new eFM
    //   53: dup
    //   54: aload_0
    //   55: getfield Dne : LAjG;
    //   58: getfield Qnq : I
    //   61: aload_0
    //   62: getfield Dne : LAjG;
    //   65: getfield aFZ : I
    //   68: aload_0
    //   69: getfield Dne : LAjG;
    //   72: getfield zGp : I
    //   75: aload_0
    //   76: getfield Dne : LAjG;
    //   79: getfield Dne : [Ljava/lang/String;
    //   82: invokespecial <init> : (III[Ljava/lang/String;)V
    //   85: invokevirtual FWm : (LNER;)V
    //   88: aload_0
    //   89: getfield Dne : LAjG;
    //   92: iconst_1
    //   93: invokevirtual Dne : (Z)V
    //   96: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MYL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */