import java.io.DataInputStream;
import java.io.DataOutputStream;

public class eFM extends NER {
  public int Dne;
  
  public int FWm;
  
  public String[] Dne;
  
  public int bzF;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    for (byte b = 0; b < 4; b++)
      Dne(this.Dne[b], paramDataOutputStream); 
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readShort();
    this.bzF = paramDataInputStream.readInt();
    this.Dne = new String[4];
    for (byte b = 0; b < 4; b++)
      this.Dne[b] = Dne(paramDataInputStream, 15); 
  }
  
  public eFM(int paramInt1, int paramInt2, int paramInt3, String[] paramArrayOfString) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Dne = new String[] { paramArrayOfString[0], paramArrayOfString[1], paramArrayOfString[2], paramArrayOfString[3] };
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public eFM() {}
  
  public int Dne() {
    int i = 0;
    for (byte b = 0; b < 4; b++)
      i += this.Dne[b].length(); 
    return i;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eFM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */