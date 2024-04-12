public class kGO {
  public static final kGO bzF;
  
  public static final kGO Qnq;
  
  private final String Dne;
  
  public static final kGO[] Dne = new kGO[16];
  
  public static final kGO Dne = (new kGO(0, "default", 1)).Dne();
  
  private final int Dne;
  
  public static final kGO FWm = new kGO(1, "flat");
  
  private boolean FWm;
  
  private boolean Dne;
  
  private final int FWm;
  
  public int Dne() {
    return this.FWm;
  }
  
  private kGO Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
    return this;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public String FWm() {
    return "generator." + this.Dne;
  }
  
  static {
    bzF = new kGO(2, "largeBiomes");
    Qnq = (new kGO(8, "default_1_1", 0)).Dne(false);
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public static kGO Dne(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: getstatic kGO.Dne : [LkGO;
    //   6: arraylength
    //   7: if_icmpge -> 45
    //   10: getstatic kGO.Dne : [LkGO;
    //   13: iload_1
    //   14: aaload
    //   15: ifnull -> 39
    //   18: getstatic kGO.Dne : [LkGO;
    //   21: iload_1
    //   22: aaload
    //   23: getfield Dne : Ljava/lang/String;
    //   26: aload_0
    //   27: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   30: ifeq -> 39
    //   33: getstatic kGO.Dne : [LkGO;
    //   36: iload_1
    //   37: aaload
    //   38: areturn
    //   39: iinc #1, 1
    //   42: goto -> 2
    //   45: aconst_null
    //   46: areturn
  }
  
  public kGO Dne(int paramInt) {
    return (this == Dne && paramInt == 0) ? Qnq : this;
  }
  
  private kGO(int paramInt1, String paramString, int paramInt2) {
    this.Dne = paramString;
    this.FWm = paramInt2;
    this.Dne = true;
    this.Dne = paramInt1;
    Dne[paramInt1] = this;
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  private kGO Dne() {
    this.FWm = 1;
    return this;
  }
  
  private kGO(int paramInt, String paramString) {
    this(paramInt, paramString, 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kGO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */