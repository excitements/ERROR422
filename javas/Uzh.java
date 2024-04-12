public class Uzh extends EKF {
  public EKF FWm() {
    return Dne();
  }
  
  public Uzh Dne() {
    try {
      this.Dne.setDoOutput(true);
      this.Dne.setRequestMethod("DELETE");
      this.Dne.connect();
      return this;
    } catch (Exception exception) {
      throw new HFd("Failed URL: " + this.Dne, exception);
    } 
  }
  
  static {
  
  }
  
  public Uzh(String paramString, int paramInt1, int paramInt2) {
    super(paramString, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Uzh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */