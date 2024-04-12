public abstract class BRM extends HzK {
  protected HAo Dne = new HAo(this);
  
  public FUH aFZ() {
    return this.Dne.Dne(FWm());
  }
  
  public void mrb(boolean paramBoolean) {
    byte b = this.Dne.Dne(16);
    if (paramBoolean) {
      this.Dne.FWm(16, Byte.valueOf((byte)(b | 0x4)));
    } else {
      this.Dne.FWm(16, Byte.valueOf((byte)(b & 0xFFFFFFFB)));
    } 
  }
  
  public boolean ICU() {
    return ((this.Dne.Dne(16) & 0x1) != 0);
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    String str = paramWkD.Dne("Owner");
    if (str.length() > 0) {
      Dne(str);
      mrb(true);
    } 
    this.Dne.Dne(paramWkD.FWm("Sitting"));
    XHL(paramWkD.FWm("Sitting"));
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 7) {
      IjH(true);
    } else if (paramByte == 6) {
      IjH(false);
    } else {
      super.Dne(paramByte);
    } 
  }
  
  public BRM(Qnq paramQnq) {
    super(paramQnq);
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, Byte.valueOf((byte)0));
    this.Dne.Dne(17, "");
  }
  
  protected void IjH(boolean paramBoolean) {
    String str = "heart";
    if (!paramBoolean)
      str = "smoke"; 
    for (byte b = 0; b < 7; b++) {
      double d1 = this.Dne.nextGaussian() * 0.02D;
      double d2 = this.Dne.nextGaussian() * 0.02D;
      double d3 = this.Dne.nextGaussian() * 0.02D;
      this.Dne.Dne(str, this.div + (this.Dne.nextFloat() * this.ooe * 2.0F) - this.ooe, this.IjH + 0.5D + (this.Dne.nextFloat() * this.trS), this.mrb + (this.Dne.nextFloat() * this.ooe * 2.0F) - this.ooe, d1, d2, d3);
    } 
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    if (FWm() == null) {
      paramWkD.Dne("Owner", "");
    } else {
      paramWkD.Dne("Owner", FWm());
    } 
    paramWkD.Dne("Sitting", ICU());
  }
  
  public HAo Dne() {
    return this.Dne;
  }
  
  public String FWm() {
    return this.Dne.Dne(17);
  }
  
  public void XHL(boolean paramBoolean) {
    byte b = this.Dne.Dne(16);
    if (paramBoolean) {
      this.Dne.FWm(16, Byte.valueOf((byte)(b | 0x1)));
    } else {
      this.Dne.FWm(16, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
    } 
  }
  
  public void Dne(String paramString) {
    this.Dne.FWm(17, paramString);
  }
  
  public boolean LVR() {
    return ((this.Dne.Dne(16) & 0x4) != 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BRM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */