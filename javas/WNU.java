public class WNU implements OTl {
  private byte[] FWm;
  
  private int Dne;
  
  private boolean Dne;
  
  private byte[] Dne;
  
  private byte[] bzF;
  
  private OTl Dne = null;
  
  public int FWm(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (paramInt1 + this.Dne > paramArrayOfbyte1.length)
      throw new Gtk("input buffer too short"); 
    if (paramInt2 + this.Dne > paramArrayOfbyte2.length)
      throw new Gtk("output buffer too short"); 
    this.Dne.Dne(this.FWm, 0, this.bzF, 0);
    for (byte b = 0; b < this.Dne; b++)
      paramArrayOfbyte2[paramInt2 + b] = (byte)(this.bzF[b] ^ paramArrayOfbyte1[paramInt1 + b]); 
    System.arraycopy(this.FWm, this.Dne, this.FWm, 0, this.FWm.length - this.Dne);
    System.arraycopy(paramArrayOfbyte2, paramInt2, this.FWm, this.FWm.length - this.Dne, this.Dne);
    return this.Dne;
  }
  
  public int Dne(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    return (this.Dne != null) ? FWm(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2) : bzF(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2);
  }
  
  public WNU(OTl paramOTl, int paramInt) {
    this.Dne = paramOTl;
    this.Dne = paramInt / 8;
    this.Dne = (OTl)new byte[paramOTl.Dne()];
    this.FWm = new byte[paramOTl.Dne()];
    this.bzF = new byte[paramOTl.Dne()];
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void Dne(boolean paramBoolean, ePy paramePy) {
    this.Dne = paramBoolean;
    if (paramePy instanceof mpE) {
      mpE mpE = (mpE)paramePy;
      byte[] arrayOfByte = mpE.Dne();
      if (arrayOfByte.length < this.Dne.length) {
        System.arraycopy(arrayOfByte, 0, this.Dne, this.Dne.length - arrayOfByte.length, arrayOfByte.length);
        for (byte b = 0; b < this.Dne.length - arrayOfByte.length; b++)
          this.Dne[b] = false; 
      } else {
        System.arraycopy(arrayOfByte, 0, this.Dne, 0, this.Dne.length);
      } 
      Dne();
      if (mpE.Dne() != null)
        this.Dne.Dne(true, mpE.Dne()); 
    } else {
      Dne();
      this.Dne.Dne(true, paramePy);
    } 
  }
  
  public int bzF(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (paramInt1 + this.Dne > paramArrayOfbyte1.length)
      throw new Gtk("input buffer too short"); 
    if (paramInt2 + this.Dne > paramArrayOfbyte2.length)
      throw new Gtk("output buffer too short"); 
    this.Dne.Dne(this.FWm, 0, this.bzF, 0);
    System.arraycopy(this.FWm, this.Dne, this.FWm, 0, this.FWm.length - this.Dne);
    System.arraycopy(paramArrayOfbyte1, paramInt1, this.FWm, this.FWm.length - this.Dne, this.Dne);
    for (byte b = 0; b < this.Dne; b++)
      paramArrayOfbyte2[paramInt2 + b] = (byte)(this.bzF[b] ^ paramArrayOfbyte1[paramInt1 + b]); 
    return this.Dne;
  }
  
  public String Dne() {
    return this.Dne.Dne() + "/CFB" + (this.Dne * 8);
  }
  
  public void Dne() {
    System.arraycopy(this.Dne, 0, this.FWm, 0, this.Dne.length);
    this.Dne.Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WNU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */