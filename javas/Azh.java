public abstract class Azh extends kSJ {
  private float Dne = -1.0F;
  
  private float FWm;
  
  public boolean a_(FiG paramFiG) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LMOS;
    //   4: invokevirtual Dne : ()LNMq;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull -> 168
    //   12: aload_2
    //   13: getfield bzF : I
    //   16: getstatic dEr.ghu : LdEr;
    //   19: getfield Qnq : I
    //   22: if_icmpne -> 168
    //   25: aload_0
    //   26: getfield Dne : LQnq;
    //   29: getfield aFZ : Z
    //   32: ifne -> 168
    //   35: aload_2
    //   36: invokevirtual Qnq : ()I
    //   39: invokestatic Dne : (I)Ljava/lang/Class;
    //   42: astore_3
    //   43: aload_3
    //   44: ifnull -> 168
    //   47: aload_3
    //   48: aload_0
    //   49: invokevirtual getClass : ()Ljava/lang/Class;
    //   52: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   55: ifeq -> 168
    //   58: aload_0
    //   59: aload_0
    //   60: invokevirtual Dne : (LAzh;)LAzh;
    //   63: astore #4
    //   65: aload #4
    //   67: ifnull -> 168
    //   70: aload #4
    //   72: sipush #-24000
    //   75: invokevirtual FWm : (I)V
    //   78: aload #4
    //   80: aload_0
    //   81: getfield div : D
    //   84: aload_0
    //   85: getfield IjH : D
    //   88: aload_0
    //   89: getfield mrb : D
    //   92: fconst_0
    //   93: fconst_0
    //   94: invokevirtual FWm : (DDDFF)V
    //   97: aload_0
    //   98: getfield Dne : LQnq;
    //   101: aload #4
    //   103: invokevirtual FWm : (LsMa;)Z
    //   106: pop
    //   107: aload_2
    //   108: invokevirtual zGp : ()Z
    //   111: ifeq -> 123
    //   114: aload #4
    //   116: aload_2
    //   117: invokevirtual FWm : ()Ljava/lang/String;
    //   120: invokevirtual Qnq : (Ljava/lang/String;)V
    //   123: aload_1
    //   124: getfield Dne : Luqg;
    //   127: getfield Qnq : Z
    //   130: ifne -> 168
    //   133: aload_2
    //   134: dup
    //   135: getfield Dne : I
    //   138: iconst_1
    //   139: isub
    //   140: putfield Dne : I
    //   143: aload_2
    //   144: getfield Dne : I
    //   147: ifgt -> 168
    //   150: aload_1
    //   151: getfield Dne : LMOS;
    //   154: aload_1
    //   155: getfield Dne : LMOS;
    //   158: getfield Dne : I
    //   161: aconst_null
    //   162: checkcast NMq
    //   165: invokevirtual Dne : (ILNMq;)V
    //   168: aload_0
    //   169: aload_1
    //   170: invokespecial a_ : (LFiG;)Z
    //   173: ireturn
  }
  
  private void aFZ(float paramFloat) {
    super.Dne(this.Dne * paramFloat, this.FWm * paramFloat);
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #12
    //   6: iload_1
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: invokevirtual FWm : (ILjava/lang/Object;)V
    //   13: aload_0
    //   14: aload_0
    //   15: invokevirtual IjH : ()Z
    //   18: invokevirtual FWm : (Z)V
    //   21: return
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Age", bzF());
  }
  
  public int bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LluM;
    //   4: bipush #12
    //   6: invokevirtual Dne : (I)I
    //   9: ireturn
  }
  
  public Azh(Qnq paramQnq) {
    super(paramQnq);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    FWm(paramWkD.Dne("Age"));
  }
  
  public void FWm(boolean paramBoolean) {
    aFZ(paramBoolean ? 0.5F : 1.0F);
  }
  
  public boolean IjH() {
    return (bzF() < 0);
  }
  
  protected final void Dne(float paramFloat1, float paramFloat2) {
    boolean bool = (this.Dne > 0.0F) ? true : false;
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    if (!bool)
      aFZ(1.0F); 
  }
  
  public abstract Azh Dne(Azh paramAzh);
  
  public void IjH() {
    super.IjH();
    if (this.Dne.aFZ != null) {
      FWm(IjH());
    } else {
      int i = bzF();
      if (i < 0) {
        FWm(++i);
      } else if (i > 0) {
        FWm(--i);
      } 
    } 
  }
  
  protected void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial FWm : ()V
    //   4: aload_0
    //   5: getfield Dne : LluM;
    //   8: bipush #12
    //   10: new java/lang/Integer
    //   13: dup
    //   14: iconst_0
    //   15: invokespecial <init> : (I)V
    //   18: invokevirtual Dne : (ILjava/lang/Object;)V
    //   21: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Azh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */