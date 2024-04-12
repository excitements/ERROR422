public class CUf extends ipD {
  private int Dne;
  
  private String Dne = "";
  
  private int FWm;
  
  public String Dne() {
    return this.Dne;
  }
  
  public NER Dne() {
    WkD wkD = new WkD();
    FWm(wkD);
    return new ipQ(this.Qnq, this.aFZ, this.zGp, 4, wkD);
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial FWm : (LWkD;)V
    //   5: aload_1
    //   6: ldc 'SkullType'
    //   8: aload_0
    //   9: getfield Dne : I
    //   12: sipush #255
    //   15: iand
    //   16: i2b
    //   17: invokevirtual Dne : (Ljava/lang/String;B)V
    //   20: aload_1
    //   21: ldc 'Rot'
    //   23: aload_0
    //   24: getfield FWm : I
    //   27: sipush #255
    //   30: iand
    //   31: i2b
    //   32: invokevirtual Dne : (Ljava/lang/String;B)V
    //   35: aload_1
    //   36: ldc 'ExtraType'
    //   38: aload_0
    //   39: getfield Dne : Ljava/lang/String;
    //   42: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   45: return
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    this.Dne = paramWkD.Dne("SkullType");
    this.FWm = paramWkD.Dne("Rot");
    if (paramWkD.Dne("ExtraType"))
      this.Dne = paramWkD.Dne("ExtraType"); 
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public void Dne(int paramInt, String paramString) {
    this.Dne = paramInt;
    this.Dne = paramString;
  }
  
  public void Dne(int paramInt) {
    this.FWm = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CUf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */