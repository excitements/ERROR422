public class lDs extends ipD {
  public byte Dne;
  
  public boolean Dne = false;
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) == KFd.Dne) {
      KFd kFd = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      byte b = 0;
      if (kFd == KFd.aFZ)
        b = 1; 
      if (kFd == KFd.trS)
        b = 2; 
      if (kFd == KFd.ATE)
        b = 3; 
      if (kFd == KFd.Qnq)
        b = 4; 
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3, zKP.EyB.FWm, b, this.Dne);
    } 
  }
  
  public void FWm() {
    this.Dne = (byte)((this.Dne + 1) % 25);
    a_();
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    this.Dne = paramWkD.Dne("note");
    if (this.Dne)
      this.Dne = false; 
    if (this.Dne > 24)
      this.Dne = true; 
  }
  
  public lDs() {
    this.Dne = false;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    paramWkD.Dne("note", this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lDs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */