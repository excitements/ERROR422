public class WbP implements Comparable {
  private final int FWm;
  
  private final int Dne;
  
  private float Dne;
  
  private final dmo Dne;
  
  private boolean Dne = 1.0F;
  
  public void Dne() {
    this.Dne = !this.Dne;
  }
  
  public String toString() {
    return "TextureHolder{width=" + this.Dne + ", height=" + this.FWm + '}';
  }
  
  public int compareTo(Object paramObject) {
    return Dne((WbP)paramObject);
  }
  
  public WbP(dmo paramdmo) {
    this.Dne = paramdmo;
    this.Dne = paramdmo.bzF();
    this.FWm = paramdmo.Qnq();
    this.Dne = (Dne(this.FWm) > Dne(this.Dne));
  }
  
  public int Dne(WbP paramWbP) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual FWm : ()I
    //   4: aload_1
    //   5: invokevirtual FWm : ()I
    //   8: if_icmpne -> 86
    //   11: aload_0
    //   12: invokevirtual Dne : ()I
    //   15: aload_1
    //   16: invokevirtual Dne : ()I
    //   19: if_icmpne -> 66
    //   22: aload_0
    //   23: getfield Dne : Ldmo;
    //   26: invokevirtual Dne : ()Ljava/lang/String;
    //   29: ifnonnull -> 48
    //   32: aload_1
    //   33: getfield Dne : Ldmo;
    //   36: invokevirtual Dne : ()Ljava/lang/String;
    //   39: ifnonnull -> 46
    //   42: iconst_0
    //   43: goto -> 47
    //   46: iconst_m1
    //   47: ireturn
    //   48: aload_0
    //   49: getfield Dne : Ldmo;
    //   52: invokevirtual Dne : ()Ljava/lang/String;
    //   55: aload_1
    //   56: getfield Dne : Ldmo;
    //   59: invokevirtual Dne : ()Ljava/lang/String;
    //   62: invokevirtual compareTo : (Ljava/lang/String;)I
    //   65: ireturn
    //   66: aload_0
    //   67: invokevirtual Dne : ()I
    //   70: aload_1
    //   71: invokevirtual Dne : ()I
    //   74: if_icmpge -> 81
    //   77: iconst_1
    //   78: goto -> 82
    //   81: iconst_m1
    //   82: istore_2
    //   83: goto -> 103
    //   86: aload_0
    //   87: invokevirtual FWm : ()I
    //   90: aload_1
    //   91: invokevirtual FWm : ()I
    //   94: if_icmpge -> 101
    //   97: iconst_1
    //   98: goto -> 102
    //   101: iconst_m1
    //   102: istore_2
    //   103: iload_2
    //   104: ireturn
  }
  
  public void Dne(int paramInt) {
    if (this.Dne > paramInt && this.FWm > paramInt)
      this.Dne = paramInt / Math.min(this.Dne, this.FWm); 
  }
  
  public dmo Dne() {
    return this.Dne;
  }
  
  public int Dne() {
    return this.Dne ? Dne((int)(this.FWm * this.Dne)) : Dne((int)(this.Dne * this.Dne));
  }
  
  public int FWm() {
    return this.Dne ? Dne((int)(this.Dne * this.Dne)) : Dne((int)(this.FWm * this.Dne));
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  private int Dne(int paramInt) {
    return (paramInt >> 0) + (((paramInt & 0x0) == 0) ? 0 : 1) << 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WbP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */