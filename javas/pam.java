import java.util.List;

public class pam implements MqS {
  private String Dne;
  
  private List Dne;
  
  private NMq[] Dne;
  
  private int Dne;
  
  private boolean Dne;
  
  public boolean Dne(FiG paramFiG) {
    return true;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public int Qnq() {
    return this.Dne;
  }
  
  public String b_() {
    return this.Dne;
  }
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      boolean bool = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return bool;
    } 
    return null;
  }
  
  public void a_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: ifnull -> 47
    //   7: iconst_0
    //   8: istore_1
    //   9: iload_1
    //   10: aload_0
    //   11: getfield Dne : Ljava/util/List;
    //   14: invokeinterface size : ()I
    //   19: if_icmpge -> 47
    //   22: aload_0
    //   23: getfield Dne : Ljava/util/List;
    //   26: iload_1
    //   27: invokeinterface get : (I)Ljava/lang/Object;
    //   32: checkcast XHV
    //   35: aload_0
    //   36: invokeinterface Dne : (Lpam;)V
    //   41: iinc #1, 1
    //   44: goto -> 9
    //   47: return
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = paramNMq;
    if (paramNMq != null && paramNMq.Dne > aFZ())
      paramNMq.Dne = aFZ(); 
    a_();
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public void bzF() {}
  
  public void i_() {}
  
  public NMq Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LNMq;
    //   4: iload_1
    //   5: aaload
    //   6: ifnull -> 78
    //   9: aload_0
    //   10: getfield Dne : [LNMq;
    //   13: iload_1
    //   14: aaload
    //   15: getfield Dne : I
    //   18: iload_2
    //   19: if_icmpgt -> 42
    //   22: aload_0
    //   23: getfield Dne : [LNMq;
    //   26: iload_1
    //   27: aaload
    //   28: astore_3
    //   29: aload_0
    //   30: getfield Dne : [LNMq;
    //   33: iload_1
    //   34: aconst_null
    //   35: aastore
    //   36: aload_0
    //   37: invokevirtual a_ : ()V
    //   40: aload_3
    //   41: areturn
    //   42: aload_0
    //   43: getfield Dne : [LNMq;
    //   46: iload_1
    //   47: aaload
    //   48: iload_2
    //   49: invokevirtual Dne : (I)LNMq;
    //   52: astore_3
    //   53: aload_0
    //   54: getfield Dne : [LNMq;
    //   57: iload_1
    //   58: aaload
    //   59: getfield Dne : I
    //   62: ifne -> 72
    //   65: aload_0
    //   66: getfield Dne : [LNMq;
    //   69: iload_1
    //   70: aconst_null
    //   71: aastore
    //   72: aload_0
    //   73: invokevirtual a_ : ()V
    //   76: aload_3
    //   77: areturn
    //   78: aconst_null
    //   79: areturn
  }
  
  public boolean d_() {
    return this.Dne;
  }
  
  public pam(String paramString, boolean paramBoolean, int paramInt) {
    this.Dne = paramString;
    this.Dne = paramBoolean;
    this.Dne = paramInt;
    this.Dne = new NMq[paramInt];
  }
  
  public NMq Dne(int paramInt) {
    return this.Dne[paramInt];
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */