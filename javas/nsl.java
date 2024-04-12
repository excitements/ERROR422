import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class nsl extends NER {
  private SecretKey Dne;
  
  private byte[] FWm = new byte[0];
  
  private byte[] Dne = new byte[0];
  
  public SecretKey Dne() {
    return Dne((PrivateKey)null);
  }
  
  public nsl(SecretKey paramSecretKey, PublicKey paramPublicKey, byte[] paramArrayOfbyte) {
    this.Dne = (byte[])paramSecretKey;
    this.Dne = Mjb.Dne(paramPublicKey, paramSecretKey.getEncoded());
    this.FWm = Mjb.Dne(paramPublicKey, paramArrayOfbyte);
  }
  
  public byte[] Dne(PrivateKey paramPrivateKey) {
    return (paramPrivateKey == null) ? this.FWm : Mjb.FWm(paramPrivateKey, this.FWm);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public nsl() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream);
    this.FWm = Dne(paramDataInputStream);
  }
  
  public int Dne() {
    return 2 + this.Dne.length + 2 + this.FWm.length;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(paramDataOutputStream, this.Dne);
    Dne(paramDataOutputStream, this.FWm);
  }
  
  public SecretKey Dne(PrivateKey paramPrivateKey) {
    return (paramPrivateKey == null) ? (SecretKey)this.Dne : (SecretKey)(this.Dne = (byte[])Mjb.Dne(paramPrivateKey, this.Dne));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nsl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */