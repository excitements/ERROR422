public class NSW extends cMv {
  private int Dne;
  
  float Dne;
  
  HzK Dne;
  
  HzK FWm;
  
  public boolean FWm() {
    if (!this.FWm.udO())
      return false; 
    double d = this.Dne.Dne(this.FWm);
    return (d >= 9.0D && d <= 256.0D);
  }
  
  public void Dne() {
    this.Dne = false;
  }
  
  public void FWm() {
    this.FWm = null;
  }
  
  public void bzF() {
    if (--this.Dne <= null) {
      this.Dne = 10;
      this.Dne.Dne().Dne(this.FWm, this.Dne);
    } 
  }
  
  public boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LHzK;
    //   4: invokevirtual bzF : ()I
    //   7: iflt -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: aload_0
    //   13: getfield Dne : LHzK;
    //   16: getfield Dne : LQnq;
    //   19: aload_0
    //   20: getfield Dne : LHzK;
    //   23: invokevirtual getClass : ()Ljava/lang/Class;
    //   26: aload_0
    //   27: getfield Dne : LHzK;
    //   30: getfield Dne : LbSp;
    //   33: ldc2_w 8.0
    //   36: ldc2_w 4.0
    //   39: ldc2_w 8.0
    //   42: invokevirtual FWm : (DDD)LbSp;
    //   45: invokevirtual Dne : (Ljava/lang/Class;LbSp;)Ljava/util/List;
    //   48: astore_1
    //   49: aconst_null
    //   50: astore_2
    //   51: ldc2_w 1.7976931348623157E308
    //   54: dstore_3
    //   55: aload_1
    //   56: invokeinterface iterator : ()Ljava/util/Iterator;
    //   61: astore #5
    //   63: aload #5
    //   65: invokeinterface hasNext : ()Z
    //   70: ifeq -> 120
    //   73: aload #5
    //   75: invokeinterface next : ()Ljava/lang/Object;
    //   80: checkcast HzK
    //   83: astore #6
    //   85: aload #6
    //   87: invokevirtual bzF : ()I
    //   90: iflt -> 117
    //   93: aload_0
    //   94: getfield Dne : LHzK;
    //   97: aload #6
    //   99: invokevirtual Dne : (LsMa;)D
    //   102: dstore #7
    //   104: dload #7
    //   106: dload_3
    //   107: dcmpg
    //   108: ifgt -> 117
    //   111: dload #7
    //   113: dstore_3
    //   114: aload #6
    //   116: astore_2
    //   117: goto -> 63
    //   120: aload_2
    //   121: ifnonnull -> 126
    //   124: iconst_0
    //   125: ireturn
    //   126: dload_3
    //   127: ldc2_w 9.0
    //   130: dcmpg
    //   131: ifge -> 136
    //   134: iconst_0
    //   135: ireturn
    //   136: aload_0
    //   137: aload_2
    //   138: putfield FWm : LHzK;
    //   141: iconst_1
    //   142: ireturn
  }
  
  public NSW(HzK paramHzK, float paramFloat) {
    this.Dne = paramHzK;
    this.Dne = paramFloat;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NSW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */