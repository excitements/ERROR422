public class UgS implements iQt {
  private NMq[] Dne;
  
  private NMq Dne;
  
  public final int Dne;
  
  private int bzF;
  
  private int FWm;
  
  private boolean Dne = false;
  
  public NMq Dne(Uqm paramUqm) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Dne : ()LNMq;
    //   4: invokevirtual Dne : ()LNMq;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield Dne : Z
    //   12: ifeq -> 66
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_3
    //   18: aload_1
    //   19: invokevirtual Qnq : ()I
    //   22: if_icmpge -> 66
    //   25: aload_1
    //   26: iload_3
    //   27: invokevirtual Dne : (I)LNMq;
    //   30: astore #4
    //   32: aload #4
    //   34: ifnull -> 60
    //   37: aload #4
    //   39: invokevirtual aFZ : ()Z
    //   42: ifeq -> 60
    //   45: aload_2
    //   46: aload #4
    //   48: getfield Dne : LWkD;
    //   51: invokevirtual Dne : ()LoNe;
    //   54: checkcast WkD
    //   57: invokevirtual FWm : (LWkD;)V
    //   60: iinc #3, 1
    //   63: goto -> 17
    //   66: aload_2
    //   67: areturn
  }
  
  public int Dne() {
    return this.FWm * this.bzF;
  }
  
  public NMq Dne() {
    return this.Dne;
  }
  
  public UgS(int paramInt1, int paramInt2, NMq[] paramArrayOfNMq, NMq paramNMq) {
    this.Dne = paramNMq.bzF;
    this.FWm = paramInt1;
    this.bzF = paramInt2;
    this.Dne = paramArrayOfNMq;
    this.Dne = paramNMq;
  }
  
  public boolean Dne(Uqm paramUqm, Qnq paramQnq) {
    for (byte b = 0; b <= 3 - this.FWm; b++) {
      for (byte b1 = 0; b1 <= 3 - this.bzF; b1++) {
        if (Dne(paramUqm, b, b1, true))
          return true; 
        if (Dne(paramUqm, b, b1, false))
          return true; 
      } 
    } 
    return false;
  }
  
  public UgS Dne() {
    this.Dne = true;
    return this;
  }
  
  private boolean Dne(Uqm paramUqm, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iload #5
    //   5: iconst_3
    //   6: if_icmpge -> 205
    //   9: iconst_0
    //   10: istore #6
    //   12: iload #6
    //   14: iconst_3
    //   15: if_icmpge -> 199
    //   18: iload #5
    //   20: iload_2
    //   21: isub
    //   22: istore #7
    //   24: iload #6
    //   26: iload_3
    //   27: isub
    //   28: istore #8
    //   30: aconst_null
    //   31: astore #9
    //   33: iload #7
    //   35: iflt -> 110
    //   38: iload #8
    //   40: iflt -> 110
    //   43: iload #7
    //   45: aload_0
    //   46: getfield FWm : I
    //   49: if_icmpge -> 110
    //   52: iload #8
    //   54: aload_0
    //   55: getfield bzF : I
    //   58: if_icmpge -> 110
    //   61: iload #4
    //   63: ifeq -> 93
    //   66: aload_0
    //   67: getfield Dne : [LNMq;
    //   70: aload_0
    //   71: getfield FWm : I
    //   74: iload #7
    //   76: isub
    //   77: iconst_1
    //   78: isub
    //   79: iload #8
    //   81: aload_0
    //   82: getfield FWm : I
    //   85: imul
    //   86: iadd
    //   87: aaload
    //   88: astore #9
    //   90: goto -> 110
    //   93: aload_0
    //   94: getfield Dne : [LNMq;
    //   97: iload #7
    //   99: iload #8
    //   101: aload_0
    //   102: getfield FWm : I
    //   105: imul
    //   106: iadd
    //   107: aaload
    //   108: astore #9
    //   110: aload_1
    //   111: iload #5
    //   113: iload #6
    //   115: invokevirtual FWm : (II)LNMq;
    //   118: astore #10
    //   120: aload #10
    //   122: ifnonnull -> 130
    //   125: aload #9
    //   127: ifnull -> 193
    //   130: aload #10
    //   132: ifnonnull -> 140
    //   135: aload #9
    //   137: ifnonnull -> 150
    //   140: aload #10
    //   142: ifnull -> 152
    //   145: aload #9
    //   147: ifnonnull -> 152
    //   150: iconst_0
    //   151: ireturn
    //   152: aload #9
    //   154: getfield bzF : I
    //   157: aload #10
    //   159: getfield bzF : I
    //   162: if_icmpeq -> 167
    //   165: iconst_0
    //   166: ireturn
    //   167: aload #9
    //   169: invokevirtual Qnq : ()I
    //   172: sipush #32767
    //   175: if_icmpeq -> 193
    //   178: aload #9
    //   180: invokevirtual Qnq : ()I
    //   183: aload #10
    //   185: invokevirtual Qnq : ()I
    //   188: if_icmpeq -> 193
    //   191: iconst_0
    //   192: ireturn
    //   193: iinc #6, 1
    //   196: goto -> 12
    //   199: iinc #5, 1
    //   202: goto -> 3
    //   205: iconst_1
    //   206: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UgS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */