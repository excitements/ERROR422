import java.io.OutputStream;

public class qKy extends EKF {
  private byte[] Dne;
  
  public qKy(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    super(paramString, paramInt1, paramInt2);
    this.Dne = paramArrayOfbyte;
  }
  
  public EKF FWm() {
    return Dne();
  }
  
  public qKy Dne() {
    try {
      this.Dne.setDoOutput(true);
      this.Dne.setDoInput(true);
      this.Dne.setRequestMethod("PUT");
      OutputStream outputStream = this.Dne.getOutputStream();
      outputStream.write(this.Dne);
      outputStream.flush();
      return this;
    } catch (Exception exception) {
      throw new HFd("Failed URL: " + this.Dne, exception);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qKy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */