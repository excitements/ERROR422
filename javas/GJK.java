import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.PublicKey;

public class GJK extends NER {
  private PublicKey Dne;
  
  private String Dne;
  
  private byte[] Dne = new byte[0];
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public PublicKey Dne() {
    return (PublicKey)this.Dne;
  }
  
  public GJK() {}
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public GJK(String paramString, PublicKey paramPublicKey, byte[] paramArrayOfbyte) {
    this.Dne = (byte[])paramString;
    this.Dne = (byte[])paramPublicKey;
    this.Dne = paramArrayOfbyte;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = (byte[])Dne(paramDataInputStream, 20);
    this.Dne = (byte[])Mjb.Dne(Dne(paramDataInputStream));
    this.Dne = Dne(paramDataInputStream);
  }
  
  public int Dne() {
    return 2 + this.Dne.length() * 2 + 2 + (this.Dne.getEncoded()).length + 2 + this.Dne.length;
  }
  
  public byte[] Dne() {
    return this.Dne;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne((String)this.Dne, paramDataOutputStream);
    Dne(paramDataOutputStream, this.Dne.getEncoded());
    Dne(paramDataOutputStream, this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GJK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */