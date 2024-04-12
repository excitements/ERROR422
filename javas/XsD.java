import java.io.DataInputStream;
import java.io.DataOutputStream;

public class XsD extends NER {
  public byte[] Dne;
  
  public short FWm;
  
  public short Dne;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeShort(this.Dne.length);
    paramDataOutputStream.write(this.Dne);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readShort();
    this.FWm = paramDataInputStream.readShort();
    this.Dne = new byte[paramDataInputStream.readUnsignedShort()];
    paramDataInputStream.readFully(this.Dne);
  }
  
  public XsD(short paramShort1, short paramShort2, byte[] paramArrayOfbyte) {
    this.Dne = paramShort1;
    this.FWm = paramShort2;
    this.Dne = paramArrayOfbyte;
  }
  
  public int Dne() {
    return 4 + this.Dne.length;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public XsD() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XsD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */